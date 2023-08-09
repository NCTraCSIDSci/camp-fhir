package test.java.biconversion;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.exception.SQLGrammarException;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Condition;
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
import main.java.com.campfhir.service.bidirectionalconversion.ConditionBidirectionalConversion;
import main.java.com.campfhir.dao.ResourceDao;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ConditionBiConversionTest {
	private static FhirContext ctx;
	public static ResourceDao resourceDao;
	private static String conditionjson;
	private static Bundle resource;


	private static ConditionBidirectionalConversion cbdc = new ConditionBidirectionalConversion();
	private static List<main.java.com.campfhir.model.Condition> databaseConditionList = new ArrayList<main.java.com.campfhir.model.Condition>();
	private static List<org.hl7.fhir.r4.model.Condition> fhirConditionList = new ArrayList<org.hl7.fhir.r4.model.Condition>();
	@BeforeAll
	public void setup() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			ParserConfigurationException, SAXException, ParseException, SQLGrammarException, FHIRException,
			InterruptedException, org.apache.commons.cli.ParseException {
		ctx = FhirContext.forR4();
		conditionjson = new String(Files.readAllBytes(Paths.get("./TESTING_DATA/condition.json")), StandardCharsets.UTF_8);
		resource = (Bundle) ctx.newJsonParser().setPrettyPrint(true).parseResource(conditionjson);
		if (resource instanceof Bundle) {
			for (BundleEntryComponent entry : resource.getEntry()) {
				if (entry.getResource().getResourceType() == ResourceType.Condition) {
					fhirConditionList.add(Condition.class.cast(entry.getResource()));
					databaseConditionList.add(cbdc.Conditions(Condition.class.cast(entry.getResource())));
				}
			}
		}
	}

	@Test
	void testResourceType() throws StreamReadException, DatabindException, IOException, ParseException {
		//Patient.class.cast(resource.getEntry().get(0).getResource())
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals("Condition", fhircond.getResourceType().toString());
		}

	}

	@Test
	void testResourceId() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getId()), fhircond.getIdElement().getIdPart());
			i++;
		}
	}

	@Test
	void testIdentifierUse() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if (fhircond.getIdentifier().get(0).hasUse()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdUse()),
						fhircond.getIdentifierFirstRep().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testIdentifierSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdSys()),
					fhircond.getIdentifierFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierValue() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdVl()),
					fhircond.getIdentifierFirstRep().getValueElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierPeriodStart() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if (fhircond.getIdentifier().get(0).getPeriod().hasStart()) {
				Assert.assertEquals(databaseConditionList.get(i).getCndtnIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
						ca.uhn.fhir.util.DateUtils.formatDate(fhircond.getIdentifierFirstRep().getPeriod().getStart())
								.toString());

			}
			i++;
		}
	}

	@Test
	void testIdentifierPeriodEnd() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if (fhircond.getIdentifier().get(0).getPeriod().getEnd() != null) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdPrdEnd()), ca.uhn.fhir.util.DateUtils
						.formatDate(fhircond.getIdentifierFirstRep().getPeriod().getEnd()).toString());
			}
			i++;
		}
	}

	@Test
	void testIdentifierAssigner() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdAssigner()),
					fhircond.getIdentifierFirstRep().getAssigner().getReference());
			i++;
		}
	}

	@Test
	void testIdentifierTypeCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdTypCdgCd()),
					fhircond.getIdentifierFirstRep().getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testIdentifierTypeSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdTypCdgSys()),
					fhircond.getIdentifierFirstRep().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierTypeVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdTypCdgVrsn()),
					fhircond.getIdentifierFirstRep().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testIdentifierTypeDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdTypCdgDsply()),
					fhircond.getIdentifierFirstRep().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testIdentifierTypeUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdTypCdgUsrSltd()), fhircond.getIdentifierFirstRep()
					.getType().getCodingFirstRep().getUserSelectedElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierTypeText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnIdTypTxt()),
					fhircond.getIdentifierFirstRep().getType().getText());
			i++;
		}
	}

	@Test
	void testClinicalStatusCodingSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnClnclStsCdgSys()),
					fhircond.getClinicalStatus().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testClinicalStatusCodingVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnClnclStsCdgVrsn()),
					fhircond.getClinicalStatus().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testClinicalStatusCodingCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnClnclStsCdgCd()),
					fhircond.getClinicalStatus().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testClinicalStatusCodingDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnClnclStsCdgDsply()),
					fhircond.getClinicalStatus().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testClinicalStatusCodingUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnClnclStsCdgUsrSltd()),
					fhircond.getClinicalStatus().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testClinicalStatusText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnClnclStsTxt()),
					fhircond.getClinicalStatus().getText());
			i++;
		}
	}


	@Test
	void testVerificationStatusCodingSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnVrfctnStsCdgSys()),
					fhircond.getVerificationStatus().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testVerificationStatusCodingVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnVrfctnStsCdgVrsn()),
					fhircond.getVerificationStatus().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testVerificationStatusCodingCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnVrfctnStsCdgCd()),
					fhircond.getVerificationStatus().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testVerificationStatusCodingDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnVrfctnStsCdgDsply()),
					fhircond.getVerificationStatus().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testVerificationStatusCodingUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnVrfctnStsCdgUsrSltd()),
					fhircond.getVerificationStatus().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testVerificationStatusText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnVrfctnStsTxt()),
					fhircond.getVerificationStatus().getText());
			i++;
		}
	}


	@Test
	void testCategoryCodingSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCtgryCdgSys()),
					fhircond.getCategoryFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testCategoryCodingVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCtgryCdgVrsn()),
					fhircond.getCategoryFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testCategoryCodingCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCtgryCdgCd()),
					fhircond.getCategoryFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testCategoryCodingDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCtgryCdgDsply()),
					fhircond.getCategoryFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testCategoryCodingUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCtgryCdgUsrSltd()),
					fhircond.getCategoryFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testCategoryText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCtgryTxt()),
					fhircond.getCategoryFirstRep().getText());
			i++;
		}
	}


	@Test
	void testSeverityCodingSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnSeverityCdgSys()),
					fhircond.getSeverity().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testSeverityCodingVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnSeverityCdgVrsn()),
					fhircond.getSeverity().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testSeverityCodingCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnSeverityCdgCd()),
					fhircond.getSeverity().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testSeverityCodingDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnSeverityCdgDsply()),
					fhircond.getSeverity().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testSeverityCodingUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnSeverityCdgUsrSltd()),
					fhircond.getSeverity().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testSeverityText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnSeverityTxt()),
					fhircond.getSeverity().getText());
			i++;
		}
	}
	

	@Test
	void testCodeCodingSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCdCdgSys()),
					fhircond.getCode().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testCodeCodingVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCdCdgVrsn()),
					fhircond.getCode().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testCodeCodingCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCdCdgCd()),
					fhircond.getCode().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testCodeCodingDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCdCdgDsply()),
					fhircond.getCode().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testCodeCodingUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCdCdgUsrSltd()),
					fhircond.getCode().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testCodeText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnCdTxt()),
					fhircond.getCode().getText());
			i++;
		}
	}


	@Test
	void testBodySiteCodingSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnBodySiteCdgSys()),
					fhircond.getBodySiteFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnBodySiteCdgVrsn()),
					fhircond.getBodySiteFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnBodySiteCdgCd()),
					fhircond.getBodySiteFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnBodySiteCdgDsply()),
					fhircond.getBodySiteFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnBodySiteCdgUsrSltd()),
					fhircond.getBodySiteFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testBodySiteText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnBodySiteTxt()),
					fhircond.getBodySiteFirstRep().getText());
			i++;
		}
	}
	
	
	@Test
	void testSubject() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnSbjct()),
					fhircond.getSubject().getReference());
			i++;
		}
	}

	@Test
	void testEncounter() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnEnc()),
					fhircond.getEncounter().getReference());
			i++;
		}
	}

	@Test
	void testOnsetDateTime() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetDateTimeType()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnDtTimeTyp()),
						fhircond.getOnsetDateTimeType().asStringValue());
			}
			i++;
		}
	}

	@Test
	void testOnsetAgeValue() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnAgeVl()),
						fhircond.getOnsetAge().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetAgeComparator() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnAgeCmprtr()),
						fhircond.getOnsetAge().getComparator().toString());
			}
			i++;
		}
	}
	
	
	@Test
	void testOnsetAgeUnit() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnAgeUnt()),
						fhircond.getOnsetAge().getUnit());
			}
			i++;
		}
	}
	
	
	@Test
	void testOnsetAgeSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnAgeSys()),
						fhircond.getOnsetAge().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetAgeCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnAgeCd()),
						fhircond.getOnsetAge().getCode());
			}
			i++;
		}
	}
	
	
	@Test
	void testOnsetPeriodStart() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetPeriod()) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnPrdStrt()),
					fhircond.getOnsetPeriod().getStart());
			}
			
			i++;
		}
	}
	
	@Test
	void testOnsetPeriodEnd() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetPeriod()) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnPrdEnd()),
					fhircond.getOnsetPeriod().getEnd());
			}
			
			i++;
		}
	}
	
	@Test
	void testOnsetRangeLowValue() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngLwVl()),
						fhircond.getOnsetRange().getLow().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetRangeLowComparator() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngLwCmprtr()),
						fhircond.getOnsetRange().getLow().getComparator());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetRangeLowUnit() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngLwUnt()),
						fhircond.getOnsetRange().getLow().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetRangeLowSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngLwSys()),
						fhircond.getOnsetRange().getLow().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetRangeLowCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngLwCd()),
						fhircond.getOnsetRange().getLow().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetRangeHighValue() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngHiVl()),
						fhircond.getOnsetRange().getHigh().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetRangeHighComparator() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngHiCmprtr()),
						fhircond.getOnsetRange().getHigh().getComparator());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetRangeHighUnit() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngHiUnt()),
						fhircond.getOnsetRange().getHigh().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetRangeHighSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngHiSys()),
						fhircond.getOnsetRange().getHigh().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetRangeHighCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnRngHiCd()),
						fhircond.getOnsetRange().getHigh().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testOnsetStringType() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasOnsetStringType()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnOnStrgTyp()),
						fhircond.getOnsetStringType().getValueAsString());
			}
			i++;
		}
	}
	

	@Test
	void testAbatementDateTime() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementDateTimeType()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementDtTimeTyp()),
						fhircond.getAbatementDateTimeType().asStringValue());
			}
			i++;
		}
	}

	@Test
	void testAbatementAgeValue() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementAgeVl()),
						fhircond.getAbatementAge().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementAgeComparator() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementAgeCmprtr()),
						fhircond.getAbatementAge().getComparator().toString());
			}
			i++;
		}
	}
	
	
	@Test
	void testAbatementAgeUnit() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementAgeUnt()),
						fhircond.getAbatementAge().getUnit());
			}
			i++;
		}
	}
	
	
	@Test
	void testAbatementAgeSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementAgeSys()),
						fhircond.getAbatementAge().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementAgeCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementAge()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementAgeCd()),
						fhircond.getAbatementAge().getCode());
			}
			i++;
		}
	}
	
	
	@Test
	void testAbatementPeriodStart() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementPeriod()) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementPrdStrt()),
					fhircond.getAbatementPeriod().getStart());
			}
			
			i++;
		}
	}
	
	@Test
	void testAbatementPeriodEnd() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementPeriod()) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementPrdEnd()),
					fhircond.getAbatementPeriod().getEnd());
			}
			
			i++;
		}
	}
	
	@Test
	void testAbatementRangeLowValue() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngLwVl()),
						fhircond.getAbatementRange().getLow().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementRangeLowComparator() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngLwCmprtr()),
						fhircond.getAbatementRange().getLow().getComparator());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementRangeLowUnit() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngLwUnt()),
						fhircond.getAbatementRange().getLow().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementRangeLowSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngLwSys()),
						fhircond.getAbatementRange().getLow().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementRangeLowCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngLwCd()),
						fhircond.getAbatementRange().getLow().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementRangeHighValue() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngHiVl()),
						fhircond.getAbatementRange().getHigh().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementRangeHighComparator() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngHiCmprtr()),
						fhircond.getAbatementRange().getHigh().getComparator());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementRangeHighUnit() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngHiUnt()),
						fhircond.getAbatementRange().getHigh().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementRangeHighSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngHiSys()),
						fhircond.getAbatementRange().getHigh().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementRangeHighCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementRange()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementRngHiCd()),
						fhircond.getAbatementRange().getHigh().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testAbatementStringType() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAbatementStringType()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAbatementStrgTyp()),
						fhircond.getAbatementStringType().getValueAsString());
			}
			i++;
		}
	}
	
	@Test
	void testRecordedDate() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasRecordedDate()) {
				Assert.assertEquals(databaseConditionList.get(i).getCndtnRecordedDt().replaceAll("\"",""),
						ca.uhn.fhir.util.DateUtils.formatDate(fhircond.getRecordedDate()));
			}
			i++;
		}
	}
	
	@Test
	void testRecorder() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasRecorder()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnRecorder()),
						fhircond.getRecorder());
			}
			i++;
		}
	}
	
	@Test
	void testAsserter() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.hasAsserter()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnAsserter()),
						fhircond.getAsserter());
			}
			i++;
		}
	}
	
	@Test
	void testStageSummaryCodingCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageSummaryCdgCd()),
					fhircond.getStageFirstRep().getSummary().getCodingFirstRep().getCode());
			
			i++;
		}
	}
	
	@Test
	void testStageSummaryCodingSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageSummaryCdgSys()),
					fhircond.getStageFirstRep().getSummary().getCodingFirstRep().getSystem());
			
			i++;
		}
	}
	
	@Test
	void testStageSummaryCodingVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageSummaryCdgVrsn()),
					fhircond.getStageFirstRep().getSummary().getCodingFirstRep().getVersion());
			
			i++;
		}
	}	
	
	@Test
	void testStageSummaryCodingDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageSummaryCdgDsply()),
					fhircond.getStageFirstRep().getSummary().getCodingFirstRep().getDisplay());
			
			i++;
		}
	}
	
	@Test
	void testStageSummaryCodingUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageSummaryCdgUsrSltd()),
					fhircond.getStageFirstRep().getSummary().getCodingFirstRep().getUserSelectedElement().asStringValue());
			
			i++;
		}
	}
	
	@Test
	void testStageSummaryText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageSummaryTxt()),
					fhircond.getStageFirstRep().getSummary().getText());
			
			i++;
		}
	}
	
	@Test
	void testStageAssessment() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageAssmnt()),
					fhircond.getStageFirstRep().getAssessmentFirstRep().getReference());
			
			i++;
		}
	}
	
	@Test
	void testStageTypeCodingCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageTypCdgCd()),
					fhircond.getStageFirstRep().getType().getCodingFirstRep().getCode());
			
			i++;
		}
	}
	
	@Test
	void testStageTypeCodingSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageTypCdgSys()),
					fhircond.getStageFirstRep().getType().getCodingFirstRep().getSystem());
			
			i++;
		}
	}
	
	@Test
	void testStageTypeCodingVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageTypCdgVrsn()),
					fhircond.getStageFirstRep().getType().getCodingFirstRep().getVersion());
			
			i++;
		}
	}	
	
	@Test
	void testStageTypeCodingDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageTypCdgDsply()),
					fhircond.getStageFirstRep().getType().getCodingFirstRep().getDisplay());
			
			i++;
		}
	}
	
	@Test
	void testStageTypeCodingUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageTypCdgUsrSltd()),
					fhircond.getStageFirstRep().getType().getCodingFirstRep().getUserSelectedElement().asStringValue());
			
			i++;
		}
	}
	
	@Test
	void testStageTypeText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnStageTypTxt()),
					fhircond.getStageFirstRep().getType().getText());
			
			i++;
		}
	}
	
	
	@Test
	void testEvidenceCodeCodingCode() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnEvdnceCdCdgCd()),
					fhircond.getEvidenceFirstRep().getCodeFirstRep().getCodingFirstRep().getCode());
			
			i++;
		}
	}
	
	@Test
	void testEvidenceCodeCodingSystem() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnEvdnceCdCdgSys()),
					fhircond.getEvidenceFirstRep().getCodeFirstRep().getCodingFirstRep().getSystem());
			
			i++;
		}
	}
	
	@Test
	void testEvidenceCodeCodingVersion() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnEvdnceCdCdgVrsn()),
					fhircond.getEvidenceFirstRep().getCodeFirstRep().getCodingFirstRep().getVersion());
			
			i++;
		}
	}	
	
	@Test
	void testEvidenceCodeCodingDisplay() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnEvdnceCdCdgDsply()),
					fhircond.getEvidenceFirstRep().getCodeFirstRep().getCodingFirstRep().getDisplay());
			
			i++;
		}
	}
	
	@Test
	void testEvidenceCodeCodingUserSelected() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnEvdnceCdCdgUsrSltd()),
					fhircond.getEvidenceFirstRep().getCodeFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			
			i++;
		}
	}
	
	@Test
	void testEvidenceCodeText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnEvdnceCdTxt()),
					fhircond.getEvidenceFirstRep().getCodeFirstRep().getText());
			
			i++;
		}
	}
	
	@Test
	void testEvidenceDetail() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnEvdnceDtl()),
					fhircond.getEvidenceFirstRep().getDetailFirstRep().getReference());
			
			i++;
		}
	}
		
	@Test
	void testEvidenceNoteAuthorReference() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.getNoteFirstRep().hasAuthorReference()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnNtAthrRfrnc()),
						fhircond.getNoteFirstRep().getAuthorReference());
			}		
			i++;
		}
	}
	
	@Test
	void testEvidenceNoteAuthorString() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			if(fhircond.getNoteFirstRep().hasAuthorStringType()) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnNtAthrStrgTyp()),
						fhircond.getNoteFirstRep().getAuthorStringType());
			}		
			i++;
		}
	}
		
	@Test
	void testEvidenceNoteTime() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
			Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnNtTime()),
					fhircond.getNoteFirstRep().getAuthorStringType().asStringValue());
			i++;
		}
	}
	
	
	@Test
	void testEvidenceNoteText() {
		int i = 0;
		for (Condition fhircond : fhirConditionList) {
				Assert.assertEquals(cleanString(databaseConditionList.get(i).getCndtnNtTxt()),
						fhircond.getNoteFirstRep().getText());
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
