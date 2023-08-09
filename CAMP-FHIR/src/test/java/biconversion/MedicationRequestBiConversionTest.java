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
import org.hl7.fhir.r4.model.MedicationRequest;
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
import main.java.com.campfhir.service.bidirectionalconversion.MedicationRequestBidirectionalConversion;
import main.java.com.campfhir.dao.ResourceDao;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MedicationRequestBiConversionTest {
	private static FhirContext ctx;
	public static ResourceDao resourceDao;
	private static String MedicationRequestjson;
	private static Bundle resource;

	private static MedicationRequestBidirectionalConversion conversion = new MedicationRequestBidirectionalConversion();
	private static List<main.java.com.campfhir.model.MedicationRequest> dbMedicationRequests = new ArrayList<main.java.com.campfhir.model.MedicationRequest>();
	private static List<org.hl7.fhir.r4.model.MedicationRequest> fhirMedicationRequestList = new ArrayList<org.hl7.fhir.r4.model.MedicationRequest>();
    private SimpleDateFormat databaseDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	@BeforeAll
	public void setup() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			ParserConfigurationException, SAXException, ParseException, SQLGrammarException, FHIRException,
			InterruptedException, org.apache.commons.cli.ParseException {
		ctx = FhirContext.forR4();
		MedicationRequestjson = new String(Files.readAllBytes(Paths.get("./TESTING_DATA/MedicationRequest.json")), StandardCharsets.UTF_8);
		resource = (Bundle) ctx.newJsonParser().setPrettyPrint(true).parseResource(MedicationRequestjson);
		if (resource instanceof Bundle) {
			for (BundleEntryComponent entry : resource.getEntry()) {
				if (entry.getResource().getResourceType() == ResourceType.Condition) {
					fhirMedicationRequestList.add(MedicationRequest.class.cast(entry.getResource()));
					dbMedicationRequests.add(conversion.MedicationRequests(MedicationRequest.class.cast(entry.getResource())));
				}
			}
		}
	}

	@Test
	void testResourceType() throws StreamReadException, DatabindException, IOException, ParseException {
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals("MedicationRequest", fhirMedicationRequest.getResourceType().toString());
		}

	}


	@Test
	void testResourceId() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getId()), fhirMedicationRequest.getIdElement().getIdPart());
			i++;
		}
	}

	@Test
	void testIdentifierUse() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if (fhirMedicationRequest.getIdentifier().get(0).hasUse()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdUse()),
						fhirMedicationRequest.getIdentifierFirstRep().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testIdentifierSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdSys()),
					fhirMedicationRequest.getIdentifierFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdVl()),
					fhirMedicationRequest.getIdentifierFirstRep().getValueElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierPeriodStart() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if (fhirMedicationRequest.getIdentifier().get(0).getPeriod().hasStart()) {
				Assert.assertEquals(dbMedicationRequests.get(i).getMdctnRqstIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
						databaseDateFormat.format(fhirMedicationRequest.getIdentifierFirstRep().getPeriod().getStart()));

			}
			i++;
		}
	}

	@Test
	void testIdentifierPeriodEnd() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if (fhirMedicationRequest.getIdentifier().get(0).getPeriod().getEnd() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdPrdEnd()), databaseDateFormat.format(fhirMedicationRequest.getIdentifierFirstRep().getPeriod().getEnd()));
			}
			i++;
		}
	}

	@Test
	void testIdentifierAssigner() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdAssigner()),
					fhirMedicationRequest.getIdentifierFirstRep().getAssigner().getReference());
			i++;
		}
	}

	@Test
	void testIdentifierTypeCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdTypCdgCd()),
					fhirMedicationRequest.getIdentifierFirstRep().getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testIdentifierTypeSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdTypCdgSys()),
					fhirMedicationRequest.getIdentifierFirstRep().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierTypeVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdTypCdgVrsn()),
					fhirMedicationRequest.getIdentifierFirstRep().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testIdentifierTypeDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdTypCdgDsply()),
					fhirMedicationRequest.getIdentifierFirstRep().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testIdentifierTypeUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdTypCdgUsrSltd()), fhirMedicationRequest.getIdentifierFirstRep()
					.getType().getCodingFirstRep().getUserSelectedElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierTypeText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIdTypTxt()),
					fhirMedicationRequest.getIdentifierFirstRep().getType().getText());
			i++;
		}
	}

	@Test
	void testStatus() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasStatus()) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSts()),
					fhirMedicationRequest.getStatus().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testStatusReasonSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstStsRsnCdgSys()),
					fhirMedicationRequest.getStatusReason().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testStatusReasonVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstStsRsnCdgVrsn()),
					fhirMedicationRequest.getStatusReason().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testStatusReasonCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstStsRsnCdgCd()),
					fhirMedicationRequest.getStatusReason().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testStatusReasonDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstStsRsnCdgDsply()),
					fhirMedicationRequest.getStatusReason().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testStatusReasonUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstStsRsnCdgUsrSltd()),
					fhirMedicationRequest.getStatusReason().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testStatusReasonText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstStsRsnTxt()),
					fhirMedicationRequest.getStatusReason().getText());
			i++;
		}
	}

	@Test
	void testIntent() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasIntent()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstIntent()),
						fhirMedicationRequest.getIntent().toCode());
			}
			i++;
		}
	}

	@Test
	void testCategoryCodingSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCtgryCdgSys()),
						fhirMedicationRequest.getCategoryFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testCategoryCodingVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCtgryCdgVrsn()),
						fhirMedicationRequest.getCategoryFirstRep().getCodingFirstRep().getVersion());
			
			i++;
		}
	}

	@Test
	void testCategoryCodingCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCtgryCdgCd()),
						fhirMedicationRequest.getCategoryFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testCategoryCodingDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCtgryCdgDsply()),
						fhirMedicationRequest.getCategoryFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testCategoryCodingUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCtgryCdgUsrSltd()),
						fhirMedicationRequest.getCategoryFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			
			i++;
		}
	}

	@Test
	void testCategoryText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCtgryTxt()),
						fhirMedicationRequest.getCategoryFirstRep().getText());
			i++;
		}
	}

	@Test
	void testPriority() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasPriority()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstPriority()),
						fhirMedicationRequest.getPriority().toCode());
			}
			i++;
		}
	}

	@Test
	void testDoNotPerform() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDoNotPerform()),
						fhirMedicationRequest.getDoNotPerformElement().asStringValue());
			i++;
		}
	}

	@Test
	void testReportedBoolean() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasReportedBooleanType()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRptedBooleanTyp()),
						fhirMedicationRequest.getReportedBooleanType().asStringValue());
			}
			i++;
		}
	}

	@Test
	void testReportedReference() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasReportedReference()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRptedRfrnc()),
						fhirMedicationRequest.getReportedReference().getReference());
			}
			i++;
		}
	}

	@Test
	void testMedicationCodeableConceptCodingSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasMedicationCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstMdctnCdbleCncptCdgSys()),
						fhirMedicationRequest.getMedicationCodeableConcept().getCodingFirstRep().getSystem());
			}
			i++;
		}
	}

	@Test
	void testMedicationCodeableConceptCodingVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasMedicationCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstMdctnCdbleCncptCdgVrsn()),
						fhirMedicationRequest.getMedicationCodeableConcept().getCodingFirstRep().getVersion());
			}
			i++;
		}
	}

	@Test
	void testMedicationCodeableConceptCodingCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasMedicationCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstMdctnCdbleCncptCdgCd()),
						fhirMedicationRequest.getMedicationCodeableConcept().getCodingFirstRep().getCode());
			}
			i++;
		}
	}

	@Test
	void testMedicationCodeableConceptCodingDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasMedicationCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstMdctnCdbleCncptCdgDsply()),
						fhirMedicationRequest.getMedicationCodeableConcept().getCodingFirstRep().getDisplay());
			}
			i++;
		}
	}

	@Test
	void testMedicationCodeableConceptCodingUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasMedicationCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstMdctnCdbleCncptCdgUsrSltd()),
						fhirMedicationRequest.getMedicationCodeableConcept().getCodingFirstRep().getUserSelectedElement().asStringValue());
			}
			i++;
		}
	}

	@Test
	void testMedicationCodeableConceptText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasMedicationCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstMdctnCdbleCncptTxt()),
						fhirMedicationRequest.getMedicationCodeableConcept().getText());
			}
			i++;
		}
	}

	@Test
	void testMedicationSubject() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSbjct()),
						fhirMedicationRequest.getSubject().getReference());
			i++;
		}
	}

	@Test
	void testMedicationEncounter() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstEnc()),
						fhirMedicationRequest.getEncounter().getReference());
			i++;
		}
	}

	@Test
	void testMedicationSupportingInformation() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSprtingInfo()),
						fhirMedicationRequest.getSupportingInformationFirstRep().getReference());
			i++;
		}
	}

	@Test
	void testMedicationAuthoredOn() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasAuthoredOn()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstAthredOn()),
						databaseDateFormat.format(fhirMedicationRequest.getAuthoredOn()));
			}
			i++;
		}
	}
	
	@Test
	void testMedicationRequestor() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRqster()),
						fhirMedicationRequest.getRequester().getReference());
			i++;
		}
	}
	
	@Test
	void testMedicationPerformer() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstPrfrmr()),
						fhirMedicationRequest.getPerformer().getReference());
			i++;
		}
	}
	
	@Test
	void testMedicationPerformerTypeSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstPrfrmrTypCdgSys()),
						fhirMedicationRequest.getPerformerType().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testMedicationPerformerTypeVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstPrfrmrTypCdgVrsn()),
						fhirMedicationRequest.getPerformerType().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testMedicationPerformerTypeCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstPrfrmrTypCdgCd()),
						fhirMedicationRequest.getPerformerType().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testMedicationPerformerTypeDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstPrfrmrTypCdgDsply()),
						fhirMedicationRequest.getPerformerType().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testMedicationPerformerTypeUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstPrfrmrTypCdgUsrSltd()),
						fhirMedicationRequest.getPerformerType().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testMedicationPerformerTypeText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstPrfrmrTypTxt()),
						fhirMedicationRequest.getPerformerType().getText());
			i++;
		}
	}
	
	@Test
	void testMedicationRecorder() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRecorder()),
						fhirMedicationRequest.getRecorder().getReference());
			i++;
		}
	}
	
	
	@Test
	void testMedicationReasonCodeSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRsnCdCdgSys()),
						fhirMedicationRequest.getReasonCodeFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testMedicationReasonCodeVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRsnCdCdgVrsn()),
						fhirMedicationRequest.getReasonCodeFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testMedicationReasonCodeCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRsnCdCdgCd()),
						fhirMedicationRequest.getReasonCodeFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testMedicationReasonCodeDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRsnCdCdgDsply()),
						fhirMedicationRequest.getReasonCodeFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testMedicationReasonCodeUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRsnCdCdgUsrSltd()),
						fhirMedicationRequest.getReasonCodeFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testMedicationReasonCodeText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRsnCdTxt()),
						fhirMedicationRequest.getReasonCodeFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testMedicationReasonReference() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstRsnRfrnc()),
						fhirMedicationRequest.getReasonReferenceFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testMedicationInstantiatesCanonical() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasInstantiatesCanonical()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstInstantiatesCanonical()),
						fhirMedicationRequest.getInstantiatesCanonical().get(0).asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testMedicationInstantiatesURI() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.hasInstantiatesUri()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstInstantiatesUri()),
						fhirMedicationRequest.getInstantiatesUri().get(0).asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testMedicationBasedOn() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstBasedOn()),
						fhirMedicationRequest.getBasedOnFirstRep().getReference());
			i++;
		}
	}
	

	@Test
	void testGroupIdentifierUse() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if (fhirMedicationRequest.getGroupIdentifier().hasUse()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdUse()),
						fhirMedicationRequest.getGroupIdentifier().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testGroupIdentifierSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdSys()),
					fhirMedicationRequest.getGroupIdentifier().getSystem());
			i++;
		}
	}

	@Test
	void testGroupIdentifierValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdVl()),
					fhirMedicationRequest.getGroupIdentifier().getValueElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testGroupIdentifierPeriodStart() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if (fhirMedicationRequest.getGroupIdentifier().getPeriod().hasStart()) {
				Assert.assertEquals(dbMedicationRequests.get(i).getMdctnRqstGrpIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
						databaseDateFormat.format(fhirMedicationRequest.getGroupIdentifier().getPeriod().getStart()));

			}
			i++;
		}
	}

	@Test
	void testGroupIdentifierPeriodEnd() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if (fhirMedicationRequest.getGroupIdentifier().getPeriod().getEnd() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdPrdEnd()), databaseDateFormat.format(fhirMedicationRequest.getGroupIdentifier().getPeriod().getEnd()));
			}
			i++;
		}
	}

	@Test
	void testGroupIdentifierAssigner() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdAssigner()),
					fhirMedicationRequest.getGroupIdentifier().getAssigner().getReference());
			i++;
		}
	}

	@Test
	void testGroupIdentifierTypeCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdTypCdgCd()),
					fhirMedicationRequest.getGroupIdentifier().getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testGroupIdentifierTypeSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdTypCdgSys()),
					fhirMedicationRequest.getGroupIdentifier().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testGroupIdentifierTypeVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdTypCdgVrsn()),
					fhirMedicationRequest.getGroupIdentifier().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testGroupIdentifierTypeDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdTypCdgDsply()),
					fhirMedicationRequest.getGroupIdentifier().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testGroupIdentifierTypeUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdTypCdgUsrSltd()), fhirMedicationRequest.getGroupIdentifier()
					.getType().getCodingFirstRep().getUserSelectedElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testGroupIdentifierTypeText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstGrpIdTypTxt()),
					fhirMedicationRequest.getGroupIdentifier().getType().getText());
			i++;
		}
	}

	
	@Test
	void testCourseOfTherapyTypeCodeSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCourseOfThrpyTypCdgSys()),
						fhirMedicationRequest.getCourseOfTherapyType().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testCourseOfTherapyTypeVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCourseOfThrpyTypCdgVrsn()),
						fhirMedicationRequest.getCourseOfTherapyType().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testCourseOfTherapyTypeCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCourseOfThrpyTypCdgCd()),
						fhirMedicationRequest.getCourseOfTherapyType().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testCourseOfTherapyTypeDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCourseOfThrpyTypCdgDsply()),
						fhirMedicationRequest.getCourseOfTherapyType().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testCourseOfTherapyTypeUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCourseOfThrpyTypCdgUsrSltd()),
						fhirMedicationRequest.getCourseOfTherapyType().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testCourseOfTherapyTypeText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstCourseOfThrpyTypTxt()),
						fhirMedicationRequest.getCourseOfTherapyType().getText());
			i++;
		}
	}
	
	@Test
	void testInsurance() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstInsrnc()),
						fhirMedicationRequest.getInsuranceFirstRep().getReference());
			i++;
		}
	}	
	
	@Test
	void testNoteAuthorReference() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(dbMedicationRequests.get(i).getMdctnRqstNtAthrRfrnc() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstNtAthrRfrnc()),
						fhirMedicationRequest.getNoteFirstRep().getAuthorReference().getReference());
			}
			i++;
		}
	}
	
	@Test
	void testNoteAuthorString() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(dbMedicationRequests.get(i).getMdctnRqstNtAthrStrgTyp() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstNtAthrStrgTyp()),
						fhirMedicationRequest.getNoteFirstRep().getAuthorStringType().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testNoteTime() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getNoteFirstRep().hasTime() & fhirMedicationRequest.getNoteFirstRep() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstNtTime()),
						databaseDateFormat.format(fhirMedicationRequest.getNoteFirstRep().getTime()));
			}
			i++;
		}
	}
	
	@Test
	void testNoteText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstNtTxt()),
						fhirMedicationRequest.getNoteFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsSequence() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnSqnc()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getSequenceElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTxt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAdditionalInstructionsCodingSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAddtnlInstrctnCdgSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAdditionalInstructionFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAdditionalInstructionsCodingVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAddtnlInstrctnCdgVrsn()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAdditionalInstructionFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAdditionalInstructionsCodingCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAddtnlInstrctnCdgCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAdditionalInstructionFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAdditionalInstructionsCodingDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAddtnlInstrctnCdgDsply()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAdditionalInstructionFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAdditionalInstructionsCodingUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAddtnlInstrctnCdgUsrSltd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAdditionalInstructionFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAdditionalInstructionsText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAddtnlInstrctnTxt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAdditionalInstructionFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingEvent() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().hasEvent() & dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgEvnt() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgEvnt()),
						databaseDateFormat.format(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getEvent().get(0).getValue()));
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsDurationValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsDurationVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsDuration().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsDurationComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsDurationCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsDuration().getComparatorElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsDurationUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsDurationUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsDuration().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsDurationSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsDurationSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsDuration().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsDurationCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsDurationCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsDuration().getCode());
			}
			i++;
		}
	}
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeLowValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngLwVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getLow().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeLowComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration() & dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngLwCmprtr() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngLwCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getLow().getComparator());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeLowUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration() & dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngLwUnt() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngLwUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getLow().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeLowSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration() & dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngLwSys()!= null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngLwSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getLow().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeLowCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration() & dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngLwCd() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngLwCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getLow().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeHighValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngHiVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getHigh().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeHighComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration() & dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngHiCmprtr() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngHiCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getHigh().getComparator());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeHighUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration() & dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngHiUnt() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngHiUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getHigh().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeHighSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration() & dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngHiSys()!= null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngHiSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getHigh().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsRangeHighCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsDuration() & dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngHiCd() != null) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsRngHiCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsRange().getHigh().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsPeriodStart() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsPeriod()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsPrdStrt()),
						databaseDateFormat.format(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsPeriod().getStart()));
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatBoundsPeriodEnd() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasBoundsPeriod()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptBndsPrdEnd()),
						databaseDateFormat.format(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getBoundsPeriod().getEnd()));
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatCount() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptCnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getCountElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatCountMax() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptCntMx()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getCountMaxElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatDuration() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptDuration()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getDurationElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatDurationMax() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptDurationMx()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getDurationMaxElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatDurationUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptDurationUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getDurationUnitElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatFrequency() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptFrqncy()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getFrequencyElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatFrequencyMax() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptFrqncyMx()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getFrequencyMaxElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatPeriod() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptPrd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getPeriodElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatPeriodMax() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptPrdMx()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getPeriodMaxElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatPeriodUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptPrdUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getPeriodUnitElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatDayOfWeek() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasDayOfWeek()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptDayOfWeek()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getDayOfWeek().get(0).asStringValue());
			}
			i++;
		}
	}
	

	@Test
	void testDosageInstructionsTimingRepeatTimeOfDay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasTimeOfDay()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptTimeOfDay()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getTimeOfDay().get(0).asStringValue());
			}
			i++;
		}
	}
	
	
	@Test
	void testDosageInstructionsTimingRepeatWhen() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().hasWhen()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptWhen()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getWhen().get(0).asStringValue());
			}
		i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingRepeatOffset() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgRptOff()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getRepeat().getOffsetElement().asStringValue());
			i++;
		}
	}	
	
	@Test
	void testDosageInstructionsTimingCodeCodingSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgCdCdgSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getCode().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingCodeCodingVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgCdCdgVrsn()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getCode().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingCodeCodingCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgCdCdgCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getCode().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingCodeCodingDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgCdCdgDsply()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getCode().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingCodeCodingUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgCdCdgUsrSltd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getCode().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsTimingCodeText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnTmgCdTxt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getTiming().getCode().getText());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAsNeededBoolean() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasAsNeededBooleanType()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAsNdBooleanTyp()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAsNeededBooleanType().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAsNeededCodeableConceptCodingSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasAsNeededCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAsNeededCodeableConcept().getCodingFirstRep().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAsNeededCodeableConceptCodingVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasAsNeededCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgVrsn()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAsNeededCodeableConcept().getCodingFirstRep().getVersion());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAsNeededCodeableConceptCodingCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasAsNeededCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAsNeededCodeableConcept().getCodingFirstRep().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAsNeededCodeableConceptCodingDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasAsNeededCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgDsply()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAsNeededCodeableConcept().getCodingFirstRep().getDisplay());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAsNeededCodeableConceptCodingUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasAsNeededCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAsNdCdbleCncptCdgUsrSltd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAsNeededCodeableConcept().getCodingFirstRep().getUserSelectedElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsAsNeededCodeableConceptText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasAsNeededCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnAsNdCdbleCncptTxt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getAsNeededCodeableConcept().getText());
			}
			i++;
		}
	}
	
	
	@Test
	void testDosageInstructionsSiteCodingSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasSite()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnSiteCdgSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getSite().getCodingFirstRep().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsSiteCodingVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasSite()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnSiteCdgVrsn()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getSite().getCodingFirstRep().getVersion());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsSiteCodingCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasSite()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnSiteCdgCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getSite().getCodingFirstRep().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsSiteCodingDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasSite()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnSiteCdgDsply()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getSite().getCodingFirstRep().getDisplay());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsSiteCodingUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasSite()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnSiteCdgUsrSltd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getSite().getCodingFirstRep().getUserSelectedElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsSiteText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasSite()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnSiteTxt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getSite().getText());
			}
			i++;
		}
	}	
	
	@Test
	void testDosageInstructionsRouteCodingSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasRoute()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnRouteCdgSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getRoute().getCodingFirstRep().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsRouteCodingVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasRoute()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnRouteCdgVrsn()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getRoute().getCodingFirstRep().getVersion());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsRouteCodingCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasRoute()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnRouteCdgCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getRoute().getCodingFirstRep().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsRouteCodingDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasRoute()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnRouteCdgDsply()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getRoute().getCodingFirstRep().getDisplay());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsRouteCodingUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasRoute()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnRouteCdgUsrSltd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getRoute().getCodingFirstRep().getUserSelectedElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsRouteText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasRoute()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnRouteTxt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getRoute().getText());
			}
			i++;
		}
	}	
	
	@Test
	void testDosageInstructionsMethodCodingSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasMethod()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMthdCdgSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMethod().getCodingFirstRep().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMethodCodingVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasMethod()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMthdCdgVrsn()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMethod().getCodingFirstRep().getVersion());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMethodCodingCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasMethod()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMthdCdgCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMethod().getCodingFirstRep().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMethodCodingDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasMethod()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMthdCdgDsply()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMethod().getCodingFirstRep().getDisplay());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMethodCodingUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasMethod()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMthdCdgUsrSltd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMethod().getCodingFirstRep().getUserSelectedElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMethodText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().hasMethod()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMthdTxt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMethod().getText());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateTypeCodingSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtTypCdgSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateTypeCodingVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtTypCdgVrsn()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateTypeCodingCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtTypCdgCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getType().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateTypeCodingDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtTypCdgDsply()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateTypeCodingUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtTypCdgUsrSltd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getType().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateTypeText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtTypTxt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getType().getText());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeLowValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getLow().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeLowComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getLow().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeLowUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getLow().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeLowSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getLow().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeLowCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngLwCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getLow().getCode());
			}
			i++;
		}
	}
	
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeHighValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getHigh().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeHighComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getHigh().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeHighUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getHigh().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeHighSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getHigh().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseRangeHighCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseRngHiCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseRange().getHigh().getCode());
			}
			i++;
		}
	}
	
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseQuantityValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseQuantity()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseQntyVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseQuantity().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseQuantityComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseQuantity()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseQuantity().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseQuantityUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseQuantity()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseQntyUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseQuantity().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseQuantitySystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseQuantity()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseQntySys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseQuantity().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateDoseAndRateDoseQuantityCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasDoseQuantity()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtDoseQntyCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getDoseQuantity().getCode());
			}
			i++;
		}
	}
		
	@Test
	void testDosageInstructionsDoseAndRateRateRatioNumeratorValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getNumerator().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRatioNumeratorComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getNumerator().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRatioNumeratorUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getNumerator().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRatioNumeratorSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getNumerator().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRatioNumeratorCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioNmrtrCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getNumerator().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRatioDenominatorValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getDenominator().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRatioDenominatorComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getDenominator().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRatioDenominatorUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getDenominator().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRatioDenominatorSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getDenominator().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRatioDenominatorCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRatio()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRtioDnmntrCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRatio().getDenominator().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeLowValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngLwVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getLow().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeLowComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getLow().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeLowUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngLwUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getLow().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeLowSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngLwSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getLow().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeLowCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngLwCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getLow().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeHighValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngHiVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getHigh().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeHighComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getHigh().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getHigh().getComparator().toCode());
				}
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeHighUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngHiUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getHigh().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeHighSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngHiSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getHigh().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateRangeHighCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateRange()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtRngHiCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateRange().getHigh().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateQuantityValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateQuantity()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtQntyVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateQuantity().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateQuantityComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateQuantity()) {
				if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateQuantity().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtQntyCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateQuantity().getComparator().toCode());
				}
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateQuantityUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateQuantity()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtQntyUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateQuantity().getUnit());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateQuantitySystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateQuantity()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtQntySys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateQuantity().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsDoseAndRateRateQuantityCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().hasRateQuantity()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnDoseAndRtRtQntyCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getDoseAndRateFirstRep().getRateQuantity().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodNumeratorValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getNumerator().getValueElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodNumeratorComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getNumerator().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getNumerator().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodNumeratorUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getNumerator().getUnit());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodNumeratorSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getNumerator().getSystem());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodNumeratorCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdNmrtrCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getNumerator().getCode());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodDenominatorValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getDenominator().getValueElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodDenominatorComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getDenominator().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getDenominator().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodDenominatorUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getDenominator().getUnit());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodDenominatorSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getDenominator().getSystem());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerPeriodDenominatorCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerPrdDnmntrCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerPeriod().getDenominator().getCode());
			i++;
		}
	}

	
	@Test
	void testDosageInstructionsMaxDosePerAdministrationValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerAdmnstnVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerAdministration().getValueElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerAdministrationComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerAdministration().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerAdmnstnCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerAdministration().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerAdministrationUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerAdmnstnUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerAdministration().getUnit());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerAdministrationSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerAdmnstnSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerAdministration().getSystem());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerAdministrationCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerAdmnstnCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerAdministration().getCode());
			i++;
		}
	}

	
	@Test
	void testDosageInstructionsMaxDosePerLifetimeValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerLifetimeVl()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerLifetime().getValueElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerLifetimeComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerLifetime().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerLifetimeCmprtr()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerLifetime().getComparator().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerLifetimeUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerLifetimeUnt()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerLifetime().getUnit());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerLifetimeSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerLifetimeSys()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerLifetime().getSystem());
			i++;
		}
	}
	
	@Test
	void testDosageInstructionsMaxDosePerLifetimeCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDsgInstrctnMxDosePerLifetimeCd()),
						fhirMedicationRequest.getDosageInstructionFirstRep().getMaxDosePerLifetime().getCode());
			i++;
		}
	}
	
	@Test
	void testDispenseRequestInitialFillQuantityValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillQntyVl()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getQuantity().getValueElement().asStringValue());
			i++;
		}
	}

	@Test
	void testDispenseRequestInitialFillQuantityComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDispenseRequest().getInitialFill().getQuantity().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillQntyCmprtr()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getQuantity().getComparator().toCode());
			}
			i++;
		}
	}

	@Test
	void testDispenseRequestInitialFillQuantityUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillQntyUnt()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getQuantity().getUnit());
			i++;
		}
	}

	@Test
	void testDispenseRequestInitialFillQuantitySystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillQntySys()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getQuantity().getSystem());
			i++;
		}
	}

	@Test
	void testDispenseRequestInitialFillQuantityCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillQntyCd()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getQuantity().getCode());
			i++;
		}
	}
	
	@Test
	void testDispenseRequestInitialFillDurationValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillDurationVl()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getDuration().getValueElement().asStringValue());
			i++;
		}
	}

	@Test
	void testDispenseRequestInitialFillDurationComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDispenseRequest().getInitialFill().getDuration().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillDurationCmprtr()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getDuration().getComparator().toCode());
			}
			i++;
		}
	}

	@Test
	void testDispenseRequestInitialFillDurationUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillDurationUnt()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getDuration().getUnit());
			i++;
		}
	}

	@Test
	void testDispenseRequestInitialFillDurationSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillDurationSys()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getDuration().getSystem());
			i++;
		}
	}

	@Test
	void testDispenseRequestInitialFillDurationCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstInitialFillDurationCd()),
						fhirMedicationRequest.getDispenseRequest().getInitialFill().getDuration().getCode());
			i++;
		}
	}
	

	@Test
	void testDispenseRequestDispenseIntervalValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstDispnsIntervalVl()),
						fhirMedicationRequest.getDispenseRequest().getDispenseInterval().getValueElement().asStringValue());
			i++;
		}
	}

	@Test
	void testDispenseRequestDispenseIntervalComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDispenseRequest().getDispenseInterval().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstDispnsIntervalCmprtr()),
						fhirMedicationRequest.getDispenseRequest().getDispenseInterval().getComparator().toCode());
			}
			i++;
		}
	}

	@Test
	void testDispenseRequestDispenseIntervalUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstDispnsIntervalUnt()),
						fhirMedicationRequest.getDispenseRequest().getDispenseInterval().getUnit());
			i++;
		}
	}

	@Test
	void testDispenseRequestDispenseIntervalSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstDispnsIntervalSys()),
						fhirMedicationRequest.getDispenseRequest().getDispenseInterval().getSystem());
			i++;
		}
	}

	@Test
	void testDispenseRequestDispenseIntervalCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstDispnsIntervalCd()),
						fhirMedicationRequest.getDispenseRequest().getDispenseInterval().getCode());
			i++;
		}
	}

	@Test
	void testDispenseRequestValidityPeriodStart() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDispenseRequest().getValidityPeriod().hasStart()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstValidityPrdStrt()),
						databaseDateFormat.format(fhirMedicationRequest.getDispenseRequest().getValidityPeriod().getStart()));
			}
			i++;
		}
	}

	@Test
	void testDispenseRequestValidityPeriodEnd() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDispenseRequest().getValidityPeriod().hasStart()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstValidityPrdEnd()),
						databaseDateFormat.format(fhirMedicationRequest.getDispenseRequest().getValidityPeriod().getEnd()));
			}
			i++;
		}
	}

	@Test
	void testDispenseRequestNumberOfRepeatsAllowed() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstNmbrOfRptsAllowed()),
						fhirMedicationRequest.getDispenseRequest().getNumberOfRepeatsAllowedElement().asStringValue());
			i++;
		}
	}
	

	@Test
	void testDispenseRequestQuantityValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstQntyVl()),
						fhirMedicationRequest.getDispenseRequest().getQuantity().getValueElement().asStringValue());
			i++;
		}
	}

	@Test
	void testDispenseRequestQuantityComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDispenseRequest().getQuantity().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstQntyCmprtr()),
						fhirMedicationRequest.getDispenseRequest().getQuantity().getComparator().toCode());
			}
			i++;
		}
	}

	@Test
	void testDispenseRequestQuantityUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstQntyUnt()),
						fhirMedicationRequest.getDispenseRequest().getQuantity().getUnit());
			i++;
		}
	}

	@Test
	void testDispenseRequestQuantitySystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstQntySys()),
						fhirMedicationRequest.getDispenseRequest().getQuantity().getSystem());
			i++;
		}
	}

	@Test
	void testDispenseRequestQuantityCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstQntyCd()),
						fhirMedicationRequest.getDispenseRequest().getQuantity().getCode());
			i++;
		}
	}


	@Test
	void testDispenseRequestExpectedSupplyDurationValue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstExpectedSpplyDurationVl()),
						fhirMedicationRequest.getDispenseRequest().getExpectedSupplyDuration().getValueElement().asStringValue());
			i++;
		}
	}

	@Test
	void testDispenseRequestExpectedSupplyDurationComparator() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getDispenseRequest().getExpectedSupplyDuration().hasComparator()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstExpectedSpplyDurationCmprtr()),
						fhirMedicationRequest.getDispenseRequest().getExpectedSupplyDuration().getComparator().toCode());
			}
			i++;
		}
	}

	@Test
	void testDispenseRequestExpectedSupplyDurationUnit() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstExpectedSpplyDurationUnt()),
						fhirMedicationRequest.getDispenseRequest().getExpectedSupplyDuration().getUnit());
			i++;
		}
	}

	@Test
	void testDispenseRequestExpectedSupplyDurationSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstExpectedSpplyDurationSys()),
						fhirMedicationRequest.getDispenseRequest().getExpectedSupplyDuration().getSystem());
			i++;
		}
	}

	@Test
	void testDispenseRequestExpectedSupplyDurationCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstExpectedSpplyDurationCd()),
						fhirMedicationRequest.getDispenseRequest().getExpectedSupplyDuration().getCode());
			i++;
		}
	}


	@Test
	void testDispenseRequestPerformer() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDispnsRqstPrfrmr()),
						fhirMedicationRequest.getDispenseRequest().getPerformer().getReference());
			i++;
		}
	}

	@Test
	void testSubstitutionAllowedBooleanType() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getSubstitution().hasAllowedBooleanType()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionAllowedBooleanTyp()),
						fhirMedicationRequest.getSubstitution().getAllowedBooleanType().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testSubstitutionAllowedCodeableConceptSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getSubstitution().hasAllowedCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionAllowedCdbleCncptCdgSys()),
						fhirMedicationRequest.getSubstitution().getAllowedCodeableConcept().getCodingFirstRep().getSystem());
			}
			i++;
		}
	}
	
	@Test
	void testSubstitutionAllowedCodeableConceptVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getSubstitution().hasAllowedCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionAllowedCdbleCncptCdgVrsn()),
						fhirMedicationRequest.getSubstitution().getAllowedCodeableConcept().getCodingFirstRep().getVersion());
			}
			i++;
		}
	}
	
	@Test
	void testSubstitutionAllowedCodeableConceptCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getSubstitution().hasAllowedCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionAllowedCdbleCncptCdgCd()),
						fhirMedicationRequest.getSubstitution().getAllowedCodeableConcept().getCodingFirstRep().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testSubstitutionAllowedCodeableConceptDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getSubstitution().hasAllowedCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionAllowedCdbleCncptCdgDsply()),
						fhirMedicationRequest.getSubstitution().getAllowedCodeableConcept().getCodingFirstRep().getDisplay());
			}
			i++;
		}
	}
	
	@Test
	void testSubstitutionAllowedCodeableConceptUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getSubstitution().hasAllowedCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionAllowedCdbleCncptCdgUsrSltd()),
						fhirMedicationRequest.getSubstitution().getAllowedCodeableConcept().getCodingFirstRep().getUserSelectedElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testSubstitutionAllowedCodeableConceptText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
			if(fhirMedicationRequest.getSubstitution().hasAllowedCodeableConcept()) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionAllowedCdbleCncptTxt()),
						fhirMedicationRequest.getSubstitution().getAllowedCodeableConcept().getText());
			}
			i++;
		}
	}
	
	@Test
	void testSubstitutionReasonSystem() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionRsnCdgSys()),
						fhirMedicationRequest.getSubstitution().getReason().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testSubstitutionReasonVersion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionRsnCdgVrsn()),
						fhirMedicationRequest.getSubstitution().getReason().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testSubstitutionReasonCode() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionRsnCdgCd()),
						fhirMedicationRequest.getSubstitution().getReason().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testSubstitutionReasonDisplay() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionRsnCdgDsply()),
						fhirMedicationRequest.getSubstitution().getReason().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testSubstitutionReasonUserSelected() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionRsnCdgUsrSltd()),
						fhirMedicationRequest.getSubstitution().getReason().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testSubstitutionReasonText() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstSubstitutionRsnTxt()),
						fhirMedicationRequest.getSubstitution().getReason().getText());
			i++;
		}
	}
	
	@Test
	void testPriorPrescripion() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstPriorPrescription()),
						fhirMedicationRequest.getPriorPrescription().getReference());
			i++;
		}
	}
	
	@Test
	void testDetectedIssue() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstDetectedIssue()),
						fhirMedicationRequest.getDetectedIssueFirstRep().getReference());
			i++;
		}
	}

	@Test
	void testEventHistory() {
		int i = 0;
		for (MedicationRequest fhirMedicationRequest : fhirMedicationRequestList) {
				Assert.assertEquals(cleanString(dbMedicationRequests.get(i).getMdctnRqstEvntHis()),
						fhirMedicationRequest.getEventHistoryFirstRep().getReference());
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
