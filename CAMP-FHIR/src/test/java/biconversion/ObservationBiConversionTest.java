package test.java.biconversion;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.exception.SQLGrammarException;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.ResourceType;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import ca.uhn.fhir.context.FhirContext;
import main.java.com.campfhir.service.bidirectionalconversion.ObservationBidirectionalConversion;
import main.java.com.campfhir.dao.ResourceDao;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ObservationBiConversionTest {
	private static FhirContext ctx;
	public static ResourceDao resourceDao;
	private static String Observationjson;
	private static Bundle resource;

	private static ObservationBidirectionalConversion conversion = new ObservationBidirectionalConversion();
	private static List<main.java.com.campfhir.model.Observation> dbObservations = new ArrayList<main.java.com.campfhir.model.Observation>();
	private static List<org.hl7.fhir.r4.model.Observation> fhirObservationList = new ArrayList<org.hl7.fhir.r4.model.Observation>();
    private SimpleDateFormat databaseDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	@BeforeAll
	public void setup() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			ParserConfigurationException, SAXException, ParseException, SQLGrammarException, FHIRException,
			InterruptedException, org.apache.commons.cli.ParseException {
		ctx = FhirContext.forR4();
		Observationjson = new String(Files.readAllBytes(Paths.get("./TESTING_DATA/Observation.json")), StandardCharsets.UTF_8);
		resource = (Bundle) ctx.newJsonParser().setPrettyPrint(true).parseResource(Observationjson);
		if (resource instanceof Bundle) {
			for (BundleEntryComponent entry : resource.getEntry()) {
				if (entry.getResource().getResourceType() == ResourceType.Condition) {
					fhirObservationList.add(Observation.class.cast(entry.getResource()));
					dbObservations.add(conversion.Observations(Observation.class.cast(entry.getResource())));
				}
			}
		}
	}
	

	@Test
	void testResourceType() throws StreamReadException, DatabindException, IOException, ParseException {
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals("Observation", fhirObservation.getResourceType().toString());
		}

	}

	@Test
	void testResourceId() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getId()), fhirObservation.getIdElement().getIdPart());
			i++;
		}
	}

	@Test
	void testIdentifierUse() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if (fhirObservation.getIdentifier().get(0).hasUse()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdUse()),
						fhirObservation.getIdentifierFirstRep().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testIdentifierSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdSys()),
					fhirObservation.getIdentifierFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdVl()),
					fhirObservation.getIdentifierFirstRep().getValueElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierPeriodStart() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if (fhirObservation.getIdentifier().get(0).getPeriod().hasStart()) {
				Assert.assertEquals(dbObservations.get(i).getObsrvtnIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
						databaseDateFormat.format(fhirObservation.getIdentifierFirstRep().getPeriod().getStart()));

			}
			i++;
		}
	}

	@Test
	void testIdentifierPeriodEnd() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if (fhirObservation.getIdentifier().get(0).getPeriod().getEnd() != null) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdPrdEnd()), databaseDateFormat.format(fhirObservation.getIdentifierFirstRep().getPeriod().getEnd()));
			}
			i++;
		}
	}

	@Test
	void testIdentifierAssigner() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdAssigner()),
					fhirObservation.getIdentifierFirstRep().getAssigner().getReference());
			i++;
		}
	}

	@Test
	void testIdentifierTypeCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdTypCdgCd()),
					fhirObservation.getIdentifierFirstRep().getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testIdentifierTypeSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdTypCdgSys()),
					fhirObservation.getIdentifierFirstRep().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierTypeVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdTypCdgVrsn()),
					fhirObservation.getIdentifierFirstRep().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testIdentifierTypeDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdTypCdgDsply()),
					fhirObservation.getIdentifierFirstRep().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testIdentifierTypeUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdTypCdgUsrSltd()), fhirObservation.getIdentifierFirstRep()
					.getType().getCodingFirstRep().getUserSelectedElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierTypeText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIdTypTxt()),
					fhirObservation.getIdentifierFirstRep().getType().getText());
			i++;
		}
	}
	
	@Test
	void testBasedOn() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnBasedOn()),
						fhirObservation.getBasedOnFirstRep().getReference());
			
			i++;
		}
	}
	
	@Test
	void testPartOf() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnPartOf()),
						fhirObservation.getPartOfFirstRep().getReference());
			
			i++;
		}
	}
	
	@Test
	void testStatus() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasStatus()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnSts()),
						fhirObservation.getStatus().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testCategoryCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCtgryCdgSys()),
						fhirObservation.getCategoryFirstRep().getCodingFirstRep().getSystem());
			
			i++;
		}
	}
	
	@Test
	void testCategoryCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCtgryCdgVrsn()),
						fhirObservation.getCategoryFirstRep().getCodingFirstRep().getVersion());
			
			i++;
		}
	}
	
	@Test
	void testCategoryCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCtgryCdgCd()),
						fhirObservation.getCategoryFirstRep().getCodingFirstRep().getCode());
			
			i++;
		}
	}
	
	@Test
	void testCategoryCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCtgryCdgDsply()),
						fhirObservation.getCategoryFirstRep().getCodingFirstRep().getDisplay());
			
			i++;
		}
	}
	
	@Test
	void testCategoryCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCtgryCdgUsrSltd()),
						fhirObservation.getCategoryFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			
			i++;
		}
	}
	
	@Test
	void testCategoryText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCtgryTxt()),
						fhirObservation.getCategoryFirstRep().getText());
			
			i++;
		}
	}
	
	@Test
	void testCodeCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCdCdgSys()),
						fhirObservation.getCode().getCodingFirstRep().getSystem());
			
			i++;
		}
	}
	
	@Test
	void testCodeCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCdCdgVrsn()),
						fhirObservation.getCode().getCodingFirstRep().getVersion());
			
			i++;
		}
	}
	
	@Test
	void testCodeCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCdCdgCd()),
						fhirObservation.getCode().getCodingFirstRep().getCode());
			
			i++;
		}
	}
	
	@Test
	void testCodeCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCdCdgDsply()),
						fhirObservation.getCode().getCodingFirstRep().getDisplay());
			
			i++;
		}
	}
	
	@Test
	void testCodeCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCdCdgUsrSltd()),
						fhirObservation.getCode().getCodingFirstRep().getUserSelectedElement().asStringValue());
			
			i++;
		}
	}
	
	@Test
	void testCodeText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCdTxt()),
						fhirObservation.getCode().getText());
			
			i++;
		}
	}
	
	@Test
	void testSubject() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnSbjct()),
						fhirObservation.getSubject().getReference());
			
			i++;
		}
	}
	
	@Test
	void testFocus() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnFocus()),
						fhirObservation.getFocusFirstRep().getReference());
			
			i++;
		}
	}
	
	@Test
	void testEncounter() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEnc()),
						fhirObservation.getEncounter().getReference());
			
			i++;
		}
	}
	
	@Test
	void testEffectiveDateTime() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveDtTimeTyp()),
					fhirObservation.getEffectiveDateTimeType().asStringValue());
			i++;
		}
	}
	
	@Test
	void testEffectivePeriodStart() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectivePeriod()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctivePrdStrt()),
						fhirObservation.getEffectivePeriod().getStart());
			}
			i++;
		}
	}
	
	@Test
	void testEffectivePeriodEnd() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectivePeriod()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctivePrdEnd()),
						fhirObservation.getEffectivePeriod().getEnd());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingEvent() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().hasEvent()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgEvnt()),
						fhirObservation.getEffectiveTiming().getEvent().get(0));
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatBoundsDurationValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsDuration()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsDurationVl()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsDuration().getValue());
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatBoundsDurationCompatator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsDuration()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsDurationCmprtr()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsDuration().getComparator());
				}
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatBoundsDurationUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsDuration()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsDurationUnt()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsDuration().getUnit());
				}
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatBoundsDurationSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsDuration()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsDurationSys()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsDuration().getSystem());
				}
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatBoundsDurationCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsDuration()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsDurationCd()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsDuration().getCode());
				}
			}
			i++;
		}
	}	
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeLowValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngLwVl()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().getValue());
				}
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeLowComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngLwCmprtr()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().getComparator());
				}
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeLowUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngLwUnt()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().getUnit());
				}
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeLowSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngLwSys()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().getSystem());
				}
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeLowCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngLwCd()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getLow().getCode());
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeHighValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngHiVl()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().getValue());
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeHighCompatator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngHiCmprtr()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().getComparator());
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeHighUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngHiUnt()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().getUnit());
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeHighSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngHiSys()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().getSystem());
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatBoundsRangeHighCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsRange()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsRngHiCd()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsRange().getHigh().getCode());
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatBoundsPeriodStart() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsPeriod()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsPrdStrt()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsPeriod().getStart());
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatBoundsPeriodEnd() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				if(fhirObservation.getEffectiveTiming().getRepeat().hasBoundsPeriod()) {					
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptBndsPrdEnd()),
						fhirObservation.getEffectiveTiming().getRepeat().getBoundsPeriod().getEnd());
				}
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatCount() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptCnt()),
						fhirObservation.getEffectiveTiming().getRepeat().getCount());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatCountMax() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptCntMx()),
						fhirObservation.getEffectiveTiming().getRepeat().getCountMax());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatDuration() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptDuration()),
						fhirObservation.getEffectiveTiming().getRepeat().getDuration());
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatDurationMax() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptDurationMx()),
						fhirObservation.getEffectiveTiming().getRepeat().getDurationMax());
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatDurationUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptDurationUnt()),
						fhirObservation.getEffectiveTiming().getRepeat().getDurationUnit());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatFrequency() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptFrqncy()),
						fhirObservation.getEffectiveTiming().getRepeat().getFrequency());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatFrequencyMax() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptFrqncyMx()),
						fhirObservation.getEffectiveTiming().getRepeat().getFrequencyMax());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatPeriod() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptPrd()),
						fhirObservation.getEffectiveTiming().getRepeat().getPeriod());
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatPeriodMax() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptPrdMx()),
						fhirObservation.getEffectiveTiming().getRepeat().getPeriodMax());
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatPeriodUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptPrdUnt()),
						fhirObservation.getEffectiveTiming().getRepeat().getPeriodUnit());
			}
			i++;
		}
	}
	
	
	@Test
	void testEffectiveTimingRepeatDayOfWeek() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptDayOfWeek()),
						fhirObservation.getEffectiveTiming().getRepeat().getDayOfWeek());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatTimeOfDay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptTimeOfDay()),
						fhirObservation.getEffectiveTiming().getRepeat().getTimeOfDay());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatWhen() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptWhen()),
						fhirObservation.getEffectiveTiming().getRepeat().getWhen());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingRepeatOffset() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgRptOff()),
						fhirObservation.getEffectiveTiming().getRepeat().getOffset());
			}
			i++;
		}
	}
	
	@Test
	void testEffectiveTimingCodeCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgCdCdgSys()),
						fhirObservation.getEffectiveTiming().getCode().getCodingFirstRep().getSystem());
			}
			i++;
		}
	}
	

	@Test
	void testEffectiveTimingCodeCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgCdCdgVrsn()),
						fhirObservation.getEffectiveTiming().getCode().getCodingFirstRep().getVersion());
			}
			i++;
		}
	}
	

	@Test
	void testEffectiveTimingCodeCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgCdCdgCd()),
						fhirObservation.getEffectiveTiming().getCode().getCodingFirstRep().getCode());
			}
			i++;
		}
	}
	

	@Test
	void testEffectiveTimingCodeCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgCdCdgDsply()),
						fhirObservation.getEffectiveTiming().getCode().getCodingFirstRep().getDisplay());
			}
			i++;
		}
	}
	

	@Test
	void testEffectiveTimingCodeCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgCdCdgUsrSltd()),
						fhirObservation.getEffectiveTiming().getCode().getCodingFirstRep().getUserSelected());
			}
			i++;
		}
	}
	

	@Test
	void testEffectiveTimingCodeText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasEffectiveTiming()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnEfctiveTmgCdTxt()),
						fhirObservation.getEffectiveTiming().getCode().getText());
			}
			i++;
		}
	}

	@Test
	void testIssued() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasIssued()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnIssued()),
						fhirObservation.getIssued().toInstant().toString());
			}
			
			i++;
		}
	}

	@Test
	void testPerformer() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnPrfrmr()),
						fhirObservation.getPerformerFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testValueQuantityValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlQntyVl()),
						fhirObservation.getValueQuantity().getValue());
				}
			i++;
		}
	}
	
	
	@Test
	void testValueQuantityComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlQntyCmprtr()),
						fhirObservation.getValueQuantity().getComparator());
				}
			i++;
		}
	}
	
	
	@Test
	void testValueQuantityUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlQntyUnt()),
						fhirObservation.getValueQuantity().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testValueQuantitySystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlQntySys()),
						fhirObservation.getValueQuantity().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testValueQuantityCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlQntyCd()),
						fhirObservation.getValueQuantity().getCode());
				}
			i++;
		}
	}

	@Test
	void testValueCodeableConceptCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlCdbleCncptCdgSys()),
						fhirObservation.getValueCodeableConcept().getCodingFirstRep().getSystem());
				}
			i++;
		}
	}

	@Test
	void testValueCodeableConceptCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlCdbleCncptCdgVrsn()),
						fhirObservation.getValueCodeableConcept().getCodingFirstRep().getVersion());
				}
			i++;
		}
	}

	@Test
	void testValueCodeableConceptCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlCdbleCncptCdgCd()),
						fhirObservation.getValueCodeableConcept().getCodingFirstRep().getCode());
				}
			i++;
		}
	}

	@Test
	void testValueCodeableConceptCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlCdbleCncptCdgDsply()),
						fhirObservation.getValueCodeableConcept().getCodingFirstRep().getDisplay());
				}
			i++;
		}
	}

	@Test
	void testValueCodeableConceptCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlCdbleCncptCdgUsrSltd()),
						fhirObservation.getValueCodeableConcept().getCodingFirstRep().getUserSelectedElement().asStringValue());
				}
			i++;
		}
	}

	@Test
	void testValueCodeableConceptText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlCdbleCncptTxt()),
						fhirObservation.getValueCodeableConcept().getText());
				}
			i++;
		}
	}
	
	@Test
	void testValueString() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueStringType()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlStrgTyp()),
						fhirObservation.getValueStringType());
				}
			i++;
		}
	}
	
	@Test
	void testValueBoolean() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueBooleanType()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlBooleanTyp()),
						fhirObservation.getValueBooleanType().asStringValue());
				}
			i++;
		}
	}
	
	@Test
	void testValueInteger() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueIntegerType()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlIntegerTyp()),
						fhirObservation.getValueIntegerType());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeLowValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngLwVl()),
						fhirObservation.getValueRange().getLow().getValue());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeLowComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngLwCmprtr()),
						fhirObservation.getValueRange().getLow().getComparator());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeLowUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngLwUnt()),
						fhirObservation.getValueRange().getLow().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeLowSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngLwSys()),
						fhirObservation.getValueRange().getLow().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeLowCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngLwCd()),
						fhirObservation.getValueRange().getLow().getCode());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeHighValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngHiVl()),
						fhirObservation.getValueRange().getHigh().getValue());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeHighComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngHiCmprtr()),
						fhirObservation.getValueRange().getHigh().getComparator());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeHighUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngHiUnt()),
						fhirObservation.getValueRange().getHigh().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeHighSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngHiSys()),
						fhirObservation.getValueRange().getHigh().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testValueRangeHighCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRngHiCd()),
						fhirObservation.getValueRange().getHigh().getCode());
				}
			i++;
		}
	}

	
	@Test
	void testValueRatioNumeratorValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioNmrtrVl()),
						fhirObservation.getValueRatio().getNumerator().getValueElement().asStringValue());
				}
			i++;
		}
	}
	
	@Test
	void testValueRatioNumeratorComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
					if(fhirObservation.getValueRatio().getNumerator().hasComparator()) {
						Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioNmrtrCmprtr()),
								fhirObservation.getValueRatio().getNumerator().getComparator().toCode());
					}
				}
			i++;
		}
	}
	
	@Test
	void testValueRatioNumeratorUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioNmrtrUnt()),
						fhirObservation.getValueRatio().getNumerator().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testValueRatioNumeratorSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioNmrtrSys()),
						fhirObservation.getValueRatio().getNumerator().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testValueRatioNumeratorCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioNmrtrCd()),
						fhirObservation.getValueRatio().getNumerator().getCode());
				}
			i++;
		}
	}
	
	@Test
	void testValueRatioDenominatorValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioDnmntrVl()),
						fhirObservation.getValueRatio().getDenominator().getValueElement().asStringValue());
				}
			i++;
		}
	}
	
	@Test
	void testValueRatioDenominatorComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioDnmntrCmprtr()),
						fhirObservation.getValueRatio().getDenominator().getComparator());
				}
			i++;
		}
	}
	
	@Test
	void testValueRatioDenominatorUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioDnmntrUnt()),
						fhirObservation.getValueRatio().getDenominator().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testValueRatioDenominatorSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioDnmntrSys()),
							fhirObservation.getValueRatio().getDenominator().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testValueRatioDenominatorCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlRtioDnmntrCd()),
						fhirObservation.getValueRatio().getDenominator().getCode());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataOriginValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataOriginVl()),
						fhirObservation.getValueSampledData().getOrigin().getValue());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataOriginComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataOriginCmprtr()),
						fhirObservation.getValueSampledData().getOrigin().getComparator());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataOriginUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataOriginUnt()),
						fhirObservation.getValueSampledData().getOrigin().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataOriginSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataOriginSys()),
						fhirObservation.getValueSampledData().getOrigin().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataOriginCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataOriginCd()),
						fhirObservation.getValueSampledData().getOrigin().getCode());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataPeriod() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataPrd()),
						fhirObservation.getValueSampledData().getPeriod());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataFactor() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataFactor()),
						fhirObservation.getValueSampledData().getFactor());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataLowerLimit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataLwerLmt()),
						fhirObservation.getValueSampledData().getLowerLimit());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataUpperLimit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataUpperLmt()),
						fhirObservation.getValueSampledData().getUpperLimit());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataDimensions() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataDimensions()),
						fhirObservation.getValueSampledData().getDimensions());
				}
			i++;
		}
	}
	
	@Test
	void testValueSampledDataData() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlSampledDataData()),
						fhirObservation.getValueSampledData().getData());
				}
			i++;
		}
	}
	
	@Test
	void testValueTime() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueTimeType()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlTimeTyp()),
						fhirObservation.getValueTimeType());
				}
			i++;
		}
	}
	
	@Test
	void testValueDateTime() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueDateTimeType()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlDtTimeTyp()),
						fhirObservation.getValueDateTimeType().asStringValue());
				}
			i++;
		}
	}
	
	@Test
	void testValuePeriodStart() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValuePeriod()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlPrdStrt()),
							fhirObservation.getValuePeriod().getStart());
				}
			i++;
		}
	}
	
	@Test
	void testValuePeriodEnd() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValuePeriod()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnVlPrdEnd()),
							fhirObservation.getValuePeriod().getEnd());
				}
			i++;
		}
	}

	@Test
	void testDataAbsentReasonCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnDataAbsentRsnCdgSys()),
							fhirObservation.getDataAbsentReason().getCodingFirstRep().getSystem());
				
			i++;
		}
	}

	@Test
	void testDataAbsentReasonCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnDataAbsentRsnCdgVrsn()),
							fhirObservation.getDataAbsentReason().getCodingFirstRep().getVersion());
				
			i++;
		}
	}

	@Test
	void testDataAbsentReasonCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnDataAbsentRsnCdgCd()),
							fhirObservation.getDataAbsentReason().getCodingFirstRep().getCode());
				
			i++;
		}
	}

	@Test
	void testDataAbsentReasonCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnDataAbsentRsnCdgDsply()),
							fhirObservation.getDataAbsentReason().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}

	@Test
	void testDataAbsentReasonCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnDataAbsentRsnCdgUsrSltd()),
							fhirObservation.getDataAbsentReason().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}

	@Test
	void testDataAbsentReasonText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnDataAbsentRsnTxt()),
							fhirObservation.getDataAbsentReason().getText());
				
			i++;
		}
	}


	@Test
	void testInterpretationCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnInterpretationCdgSys()),
							fhirObservation.getInterpretationFirstRep().getCodingFirstRep().getSystem());
				
			i++;
		}
	}

	@Test
	void testInterpretationCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnInterpretationCdgVrsn()),
							fhirObservation.getInterpretationFirstRep().getCodingFirstRep().getVersion());
				
			i++;
		}
	}
	@Test
	void testInterpretationCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnInterpretationCdgCd()),
							fhirObservation.getInterpretationFirstRep().getCodingFirstRep().getCode());
				
			i++;
		}
	}
	@Test
	void testInterpretationCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnInterpretationCdgDsply()),
							fhirObservation.getInterpretationFirstRep().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}
	@Test
	void testInterpretationCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnInterpretationCdgUsrSltd()),
							fhirObservation.getInterpretationFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testInterpretationText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnInterpretationTxt()),
							fhirObservation.getInterpretationFirstRep().getText());
				
			i++;
		}
	}
	
	@Test
	void testNoteAuthorReference() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getNoteFirstRep().hasAuthorReference()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnNtAthrRfrnc()),
							fhirObservation.getNoteFirstRep().getAuthorReference().getReference());
			}
			i++;
		}
	}
	
	@Test
	void testNoteAuthorString() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getNoteFirstRep().hasAuthorStringType()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnNtAthrStrgTyp()),
							fhirObservation.getNoteFirstRep().getAuthorStringType());
			}
				
			i++;
		}
	}
	
	@Test
	void testNoteTime() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.hasNote()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnNtTime()),
							databaseDateFormat.format(fhirObservation.getNoteFirstRep().getTime()));			
			}
				
			i++;
		}
	}
	
	@Test
	void testNoteText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnNtTxt()),
							fhirObservation.getNoteFirstRep().getText());
				
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnBodySiteCdgSys()),
							fhirObservation.getBodySite().getCodingFirstRep().getSystem());
				
			i++;
		}
	}

	@Test
	void testBodySiteCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnBodySiteCdgVrsn()),
							fhirObservation.getBodySite().getCodingFirstRep().getVersion());
				
			i++;
		}
	}
	@Test
	void testBodySiteCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnBodySiteCdgCd()),
							fhirObservation.getBodySite().getCodingFirstRep().getCode());
				
			i++;
		}
	}
	@Test
	void testBodySiteCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnBodySiteCdgDsply()),
							fhirObservation.getBodySite().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}
	@Test
	void testBodySiteCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnBodySiteCdgUsrSltd()),
							fhirObservation.getBodySite().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testBodySiteText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnBodySiteTxt()),
							fhirObservation.getBodySite().getText());
				
			i++;
		}
	}

	
	@Test
	void testMethodCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnMthdCdgSys()),
							fhirObservation.getMethod().getCodingFirstRep().getSystem());
				
			i++;
		}
	}

	@Test
	void testMethodCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnMthdCdgVrsn()),
							fhirObservation.getMethod().getCodingFirstRep().getVersion());
				
			i++;
		}
	}
	@Test
	void testMethodCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnMthdCdgCd()),
							fhirObservation.getMethod().getCodingFirstRep().getCode());
				
			i++;
		}
	}
	@Test
	void testMethodCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnMthdCdgDsply()),
							fhirObservation.getMethod().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}
	@Test
	void testMethodCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnMthdCdgUsrSltd()),
							fhirObservation.getMethod().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testMethodText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnMthdTxt()),
							fhirObservation.getMethod().getText());
				
			i++;
		}
	}
	
	@Test
	void testSpecimen() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnSpcmn()),
							fhirObservation.getSpecimen().getReference());
				
			i++;
		}
	}
	
	@Test
	void testDevice() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnDvc()),
							fhirObservation.getDevice().getReference());
				
			i++;
		}
	}
	
	
	@Test
	void testReferenceRangeLowValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngLwVl()),
							fhirObservation.getReferenceRangeFirstRep().getLow().getValueElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeLowComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getReferenceRangeFirstRep().getLow().hasComparator()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngLwCmprtr()),
							fhirObservation.getReferenceRangeFirstRep().getLow().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testReferenceRangeLowUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngLwUnt()),
							fhirObservation.getReferenceRangeFirstRep().getLow().getUnit());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeLowSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngLwSys()),
							fhirObservation.getReferenceRangeFirstRep().getLow().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeLowCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngLwCd()),
							fhirObservation.getReferenceRangeFirstRep().getLow().getCode());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeHighValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngHiVl()),
							fhirObservation.getReferenceRangeFirstRep().getHigh().getValueElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeHighComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getReferenceRangeFirstRep().getHigh().hasComparator()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngHiCmprtr()),
							fhirObservation.getReferenceRangeFirstRep().getHigh().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testReferenceRangeHighUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngHiUnt()),
							fhirObservation.getReferenceRangeFirstRep().getHigh().getUnit());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeHighSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngHiSys()),
							fhirObservation.getReferenceRangeFirstRep().getHigh().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeHighCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngHiCd()),
							fhirObservation.getReferenceRangeFirstRep().getHigh().getCode());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeTypeCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngTypCdgSys()),
							fhirObservation.getReferenceRangeFirstRep().getType().getCodingFirstRep().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeTypeCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngTypCdgVrsn()),
							fhirObservation.getReferenceRangeFirstRep().getType().getCodingFirstRep().getVersion());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeTypeCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngTypCdgCd()),
							fhirObservation.getReferenceRangeFirstRep().getType().getCodingFirstRep().getCode());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeTypeCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngTypCdgDsply()),
							fhirObservation.getReferenceRangeFirstRep().getType().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeTypeCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngTypCdgUsrSltd()),
							fhirObservation.getReferenceRangeFirstRep().getType().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeTypeTxt() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngTypTxt()),
							fhirObservation.getReferenceRangeFirstRep().getType().getText());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAppliesToCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAppliesToCdgSys()),
							fhirObservation.getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAppliesToCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAppliesToCdgVrsn()),
							fhirObservation.getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getVersion());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAppliesToCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAppliesToCdgCd()),
							fhirObservation.getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getCode());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAppliesToCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAppliesToCdgDsply()),
							fhirObservation.getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAppliesToCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAppliesToCdgUsrSltd()),
							fhirObservation.getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAppliesToTxt() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAppliesToTxt()),
							fhirObservation.getReferenceRangeFirstRep().getAppliesToFirstRep().getText());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeLowValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeLwVl()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getLow().getValueElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeLowComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getReferenceRangeFirstRep().getAge().getLow().hasComparator()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeLwCmprtr()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getLow().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeLowUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeLwUnt()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getLow().getUnit());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeLowSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeLwSys()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getLow().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeLowCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeLwCd()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getLow().getCode());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeHighValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeHiVl()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getHigh().getValueElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeHighComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getReferenceRangeFirstRep().getAge().getHigh().hasComparator()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeHiCmprtr()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getHigh().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeHighUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeHiUnt()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getHigh().getUnit());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeHighSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeHiSys()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getHigh().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeAgeHighCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngAgeHiCd()),
							fhirObservation.getReferenceRangeFirstRep().getAge().getHigh().getCode());
				
			i++;
		}
	}
	
	@Test
	void testReferenceRangeText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnRfrncRngTxt()),
							fhirObservation.getReferenceRangeFirstRep().getText());
				
			i++;
		}
	}
	
	@Test
	void testHasMember() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnHasMmbr()),
							fhirObservation.getHasMemberFirstRep().getReference());
				
			i++;
		}
	}
	
	@Test
	void testDerivedFrom() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnDerivedFrom()),
							fhirObservation.getDerivedFromFirstRep().getReference());
				
			i++;
		}
	}
	
	
	@Test
	void testComponentCodeCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntCdCdgSys()),
							fhirObservation.getComponentFirstRep().getCode().getCodingFirstRep().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testComponentCodeCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntCdCdgVrsn()),
							fhirObservation.getComponentFirstRep().getCode().getCodingFirstRep().getVersion());
				
			i++;
		}
	}
	
	@Test
	void testComponentCodeCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntCdCdgCd()),
							fhirObservation.getComponentFirstRep().getCode().getCodingFirstRep().getCode());
				
			i++;
		}
	}
	
	@Test
	void testComponentCodeCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntCdCdgDsply()),
							fhirObservation.getComponentFirstRep().getCode().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}
	
	@Test
	void testComponentCodeCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntCdCdgUsrSltd()),
							fhirObservation.getComponentFirstRep().getCode().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}
	
	
	@Test
	void testComponentValueQuantityValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) { //.getObsrvtnVlQntyVl()
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlQntyVl()),
						fhirObservation.getComponentFirstRep().getValueQuantity().getValue());
				}
			i++;
		}
	}
	
	
	@Test
	void testComponentValueQuantityComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlQntyCmprtr()),
						fhirObservation.getComponentFirstRep().getValueQuantity().getComparator());
				}
			i++;
		}
	}
	
	
	@Test
	void testComponentValueQuantityUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlQntyUnt()),
						fhirObservation.getComponentFirstRep().getValueQuantity().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueQuantitySystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlQntySys()),
						fhirObservation.getComponentFirstRep().getValueQuantity().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueQuantityCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueQuantity()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlQntyCd()),
						fhirObservation.getComponentFirstRep().getValueQuantity().getCode());
				}
			i++;
		}
	}

	@Test
	void testComponentValueCodeableConceptCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlCdbleCncptCdgSys()),
						fhirObservation.getComponentFirstRep().getValueCodeableConcept().getCodingFirstRep().getSystem());
				}
			i++;
		}
	}

	@Test
	void testComponentValueCodeableConceptCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlCdbleCncptCdgVrsn()),
						fhirObservation.getComponentFirstRep().getValueCodeableConcept().getCodingFirstRep().getVersion());
				}
			i++;
		}
	}

	@Test
	void testComponentValueCodeableConceptCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlCdbleCncptCdgCd()),
						fhirObservation.getComponentFirstRep().getValueCodeableConcept().getCodingFirstRep().getCode());
				}
			i++;
		}
	}

	@Test
	void testComponentValueCodeableConceptCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlCdbleCncptCdgDsply()),
						fhirObservation.getComponentFirstRep().getValueCodeableConcept().getCodingFirstRep().getDisplay());
				}
			i++;
		}
	}

	@Test
	void testComponentValueCodeableConceptCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlCdbleCncptCdgUsrSltd()),
						fhirObservation.getComponentFirstRep().getValueCodeableConcept().getCodingFirstRep().getUserSelectedElement().asStringValue());
				}
			i++;
		}
	}

	@Test
	void testComponentValueCodeableConceptText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueCodeableConcept()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlCdbleCncptTxt()),
						fhirObservation.getComponentFirstRep().getValueCodeableConcept().getText());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueString() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueStringType()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlStrgTyp()),
						fhirObservation.getComponentFirstRep().getValueStringType());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueBoolean() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueBooleanType()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlBooleanTyp()),
							fhirObservation.getComponentFirstRep().getValueBooleanType().asStringValue());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueInteger() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueIntegerType()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlIntegerTyp()),
						fhirObservation.getComponentFirstRep().getValueIntegerType());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeLowValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngLwVl()),
						fhirObservation.getComponentFirstRep().getValueRange().getLow().getValue());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeLowComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngLwCmprtr()),
						fhirObservation.getComponentFirstRep().getValueRange().getLow().getComparator());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeLowUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngLwUnt()),
						fhirObservation.getComponentFirstRep().getValueRange().getLow().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeLowSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngLwSys()),
						fhirObservation.getComponentFirstRep().getValueRange().getLow().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeLowCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngLwCd()),
						fhirObservation.getComponentFirstRep().getValueRange().getLow().getCode());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeHighValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngHiVl()),
						fhirObservation.getComponentFirstRep().getValueRange().getHigh().getValue());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeHighComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngHiCmprtr()),
						fhirObservation.getComponentFirstRep().getValueRange().getHigh().getComparator());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeHighUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngHiUnt()),
						fhirObservation.getComponentFirstRep().getValueRange().getHigh().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeHighSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngHiSys()),
						fhirObservation.getComponentFirstRep().getValueRange().getHigh().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRangeHighCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRange()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRngHiCd()),
						fhirObservation.getComponentFirstRep().getValueRange().getHigh().getCode());
				}
			i++;
		}
	}

	
	@Test
	void testComponentValueRatioNumeratorValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioNmrtrVl()),
						fhirObservation.getComponentFirstRep().getValueRatio().getNumerator().getValueElement().asStringValue());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRatioNumeratorComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
					if(fhirObservation.getComponentFirstRep().getValueRatio().getNumerator().hasComparator()) {
						Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioNmrtrCmprtr()),
								fhirObservation.getComponentFirstRep().getValueRatio().getNumerator().getComparator().toCode());
					}
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRatioNumeratorUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioNmrtrUnt()),
						fhirObservation.getComponentFirstRep().getValueRatio().getNumerator().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRatioNumeratorSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioNmrtrSys()),
						fhirObservation.getComponentFirstRep().getValueRatio().getNumerator().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRatioNumeratorCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioNmrtrCd()),
						fhirObservation.getComponentFirstRep().getValueRatio().getNumerator().getCode());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRatioDenominatorValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioDnmntrVl()),
						fhirObservation.getComponentFirstRep().getValueRatio().getDenominator().getValueElement().asStringValue());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRatioDenominatorComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioDnmntrCmprtr()),
						fhirObservation.getComponentFirstRep().getValueRatio().getDenominator().getComparator());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRatioDenominatorUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioDnmntrUnt()),
						fhirObservation.getComponentFirstRep().getValueRatio().getDenominator().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRatioDenominatorSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioDnmntrSys()),
							fhirObservation.getComponentFirstRep().getValueRatio().getDenominator().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueRatioDenominatorCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueRatio()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlRtioDnmntrCd()),
						fhirObservation.getComponentFirstRep().getValueRatio().getDenominator().getCode());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataOriginValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataOriginVl()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getOrigin().getValue());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataOriginComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataOriginCmprtr()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getOrigin().getComparator());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataOriginUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataOriginUnt()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getOrigin().getUnit());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataOriginSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataOriginSys()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getOrigin().getSystem());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataOriginCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataOriginCd()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getOrigin().getCode());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataPeriod() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataPrd()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getPeriod());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataFactor() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataFactor()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getFactor());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataLowerLimit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataLwerLmt()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getLowerLimit());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataUpperLimit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataUpperLmt()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getUpperLimit());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataDimensions() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataDimensions()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getDimensions());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueSampledDataData() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueSampledData()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlSampledDataData()),
						fhirObservation.getComponentFirstRep().getValueSampledData().getData());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueTime() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueTimeType()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlTimeTyp()),
						fhirObservation.getComponentFirstRep().getValueTimeType());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValueDateTime() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValueDateTimeType()) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlDtTimeTyp()),
						fhirObservation.getComponentFirstRep().getValueDateTimeType().asStringValue());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValuePeriodStart() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValuePeriod()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlPrdStrt()),
							fhirObservation.getComponentFirstRep().getValuePeriod().getStart());
				}
			i++;
		}
	}
	
	@Test
	void testComponentValuePeriodEnd() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				if(fhirObservation.hasValuePeriod()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntVlPrdEnd()),
							fhirObservation.getComponentFirstRep().getValuePeriod().getEnd());
				}
			i++;
		}
	}

	@Test
	void testComponentDataAbsentReasonCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntDataAbsentRsnCdgSys()),
						fhirObservation.getComponentFirstRep().getDataAbsentReason().getCodingFirstRep().getSystem());
				
			i++;
		}
	}

	@Test
	void testComponentDataAbsentReasonCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntDataAbsentRsnCdgVrsn()),
						fhirObservation.getComponentFirstRep().getDataAbsentReason().getCodingFirstRep().getVersion());
				
			i++;
		}
	}

	@Test
	void testComponentDataAbsentReasonCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntDataAbsentRsnCdgCd()),
						fhirObservation.getComponentFirstRep().getDataAbsentReason().getCodingFirstRep().getCode());
				
			i++;
		}
	}

	@Test
	void testComponentDataAbsentReasonCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntDataAbsentRsnCdgDsply()),
						fhirObservation.getComponentFirstRep().getDataAbsentReason().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}

	@Test
	void testComponentDataAbsentReasonCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntDataAbsentRsnCdgUsrSltd()),
						fhirObservation.getComponentFirstRep().getDataAbsentReason().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}

	@Test
	void testComponentDataAbsentReasonText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntDataAbsentRsnTxt()),
						fhirObservation.getComponentFirstRep().getDataAbsentReason().getText());
				
			i++;
		}
	}


	@Test
	void testComponentInterpretationCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntInterpretationCdgSys()),
						fhirObservation.getComponentFirstRep().getInterpretationFirstRep().getCodingFirstRep().getSystem());
				
			i++;
		}
	}

	@Test
	void testComponentInterpretationCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntInterpretationCdgVrsn()),
						fhirObservation.getComponentFirstRep().getInterpretationFirstRep().getCodingFirstRep().getVersion());
				
			i++;
		}
	}

	@Test
	void testComponentInterpretationCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntInterpretationCdgCd()),
						fhirObservation.getComponentFirstRep().getInterpretationFirstRep().getCodingFirstRep().getCode());
				
			i++;
		}
	}

	@Test
	void testComponentInterpretationCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntInterpretationCdgDsply()),
						fhirObservation.getComponentFirstRep().getInterpretationFirstRep().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}

	@Test
	void testComponentInterpretationCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntInterpretationCdgUsrSltd()),
						fhirObservation.getComponentFirstRep().getInterpretationFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}

	@Test
	void testComponentInterpretationText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
				Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntInterpretationTxt()),
						fhirObservation.getComponentFirstRep().getInterpretationFirstRep().getText());
				
			i++;
		}
	}
	
	
	@Test
	void testComponentReferenceRangeLowValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngLwVl()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getLow().getValueElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testReferencetestComponentReferenceRangeComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getLow().hasComparator()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngLwCmprtr()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getLow().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeLowUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngLwUnt()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getLow().getUnit());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeLowSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngLwSys()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getLow().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeLowCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngLwCd()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getLow().getCode());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeHighValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngHiVl()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getHigh().getValueElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeHighComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getHigh().hasComparator()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngHiCmprtr()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getHigh().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeHighUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngHiUnt()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getHigh().getUnit());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeHighSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngHiSys()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getHigh().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeHighCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngHiCd()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getHigh().getCode());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeTypeCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngTypCdgSys()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getType().getCodingFirstRep().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeTypeCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngTypCdgVrsn()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getType().getCodingFirstRep().getVersion());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeTypeCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngTypCdgCd()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getType().getCodingFirstRep().getCode());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeTypeCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngTypCdgDsply()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getType().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeTypeCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngTypCdgUsrSltd()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getType().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeTypeTxt() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngTypTxt()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getType().getText());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAppliesToCodingSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAppliesToCdgSys()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAppliesToCodingVersion() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAppliesToCdgVrsn()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getVersion());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAppliesToCodingCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAppliesToCdgCd()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getCode());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAppliesToCodingDisplay() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAppliesToCdgDsply()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getDisplay());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAppliesToCodingUserSelected() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAppliesToFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAppliesToTxt() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAppliesToTxt()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAppliesToFirstRep().getText());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeLowValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeLwVl()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getLow().getValueElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeLowComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getLow().hasComparator()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeLwCmprtr()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getLow().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeLowUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeLwUnt()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getLow().getUnit());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeLowSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeLwSys()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getLow().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeLowCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeLwCd()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getLow().getCode());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeHighValue() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeHiVl()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getHigh().getValueElement().asStringValue());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeHighComparator() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
			if(fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getHigh().hasComparator()) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeHiCmprtr()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getHigh().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeHighUnit() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeHiUnt()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getHigh().getUnit());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeHighSystem() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeHiSys()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getHigh().getSystem());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeAgeHighCode() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngAgeHiCd()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getAge().getHigh().getCode());
				
			i++;
		}
	}
	
	@Test
	void testComponentReferenceRangeText() {
		int i = 0;
		for (Observation fhirObservation : fhirObservationList) {
					Assert.assertEquals(cleanString(dbObservations.get(i).getObsrvtnCmpntRfrncRngTxt()),
							fhirObservation.getComponentFirstRep().getReferenceRangeFirstRep().getText());
				
			i++;
		}
	}
	
	
	String cleanString(String originalString) {
		String newString = "";
		if (originalString != null) {
			newString = originalString.replaceAll("[\\[\\]\"]", "").split(",")[0];
			if (newString.equals("NULL")) {
				return null;
			} else {
				return newString;
			}

		} else {
			return originalString;
		}
	}
}
