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
import org.hl7.fhir.r4.model.Encounter;
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
import main.java.com.campfhir.service.bidirectionalconversion.EncounterBidirectionalConversion;
import main.java.com.campfhir.dao.ResourceDao;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class EncounterBiConversionTest {
	private static FhirContext ctx;
	public static ResourceDao resourceDao;
	private static String Encounterjson;
	private static Bundle resource;

	private static EncounterBidirectionalConversion conversion = new EncounterBidirectionalConversion();
	private static List<main.java.com.campfhir.model.Encounter> databaseEncounterList = new ArrayList<main.java.com.campfhir.model.Encounter>();
	private static List<org.hl7.fhir.r4.model.Encounter> fhirEncounterList = new ArrayList<org.hl7.fhir.r4.model.Encounter>();
    private SimpleDateFormat databaseDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	@BeforeAll
	public void setup() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			ParserConfigurationException, SAXException, ParseException, SQLGrammarException, FHIRException,
			InterruptedException, org.apache.commons.cli.ParseException {
		ctx = FhirContext.forR4();
		Encounterjson = new String(Files.readAllBytes(Paths.get("./TESTING_DATA/Encounter.json")), StandardCharsets.UTF_8);
		resource = (Bundle) ctx.newJsonParser().setPrettyPrint(true).parseResource(Encounterjson);
		if (resource instanceof Bundle) {
			for (BundleEntryComponent entry : resource.getEntry()) {
				if (entry.getResource().getResourceType() == ResourceType.Condition) {
					fhirEncounterList.add(Encounter.class.cast(entry.getResource()));
					databaseEncounterList.add(conversion.Encounters(Encounter.class.cast(entry.getResource())));
				}
			}
		}
	}

	@Test
	void testResourceType() throws StreamReadException, DatabindException, IOException, ParseException {
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals("Encounter", fhirEncounter.getResourceType().toString());
		}

	}

	@Test
	void testResourceId() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getId()), fhirEncounter.getIdElement().getIdPart());
			i++;
		}
	}

	@Test
	void testIdentifierUse() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if (fhirEncounter.getIdentifier().get(0).hasUse()) {
				Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdUse()),
						fhirEncounter.getIdentifierFirstRep().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testIdentifierSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdSys()),
					fhirEncounter.getIdentifierFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierValue() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdVl()),
					fhirEncounter.getIdentifierFirstRep().getValueElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierPeriodStart() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if (fhirEncounter.getIdentifier().get(0).getPeriod().hasStart()) {
				Assert.assertEquals(databaseEncounterList.get(i).getEncIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
						databaseDateFormat.format(fhirEncounter.getIdentifierFirstRep().getPeriod().getStart()));

			}
			i++;
		}
	}

	@Test
	void testIdentifierPeriodEnd() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if (fhirEncounter.getIdentifier().get(0).getPeriod().getEnd() != null) {
				Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdPrdEnd()), databaseDateFormat.format(fhirEncounter.getIdentifierFirstRep().getPeriod().getEnd()));
			}
			i++;
		}
	}

	@Test
	void testIdentifierAssigner() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdAssigner()),
					fhirEncounter.getIdentifierFirstRep().getAssigner().getReference());
			i++;
		}
	}

	@Test
	void testIdentifierTypeCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdTypCdgCd()),
					fhirEncounter.getIdentifierFirstRep().getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testIdentifierTypeSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdTypCdgSys()),
					fhirEncounter.getIdentifierFirstRep().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierTypeVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdTypCdgVrsn()),
					fhirEncounter.getIdentifierFirstRep().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testIdentifierTypeDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdTypCdgDsply()),
					fhirEncounter.getIdentifierFirstRep().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testIdentifierTypeUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdTypCdgUsrSltd()), fhirEncounter.getIdentifierFirstRep()
					.getType().getCodingFirstRep().getUserSelectedElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierTypeText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncIdTypTxt()),
					fhirEncounter.getIdentifierFirstRep().getType().getText());
			i++;
		}
	}
	
	@Test
	void testStatus() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.hasStatus()) {
				Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncSts()),
						fhirEncounter.getStatus().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testStatusHistory() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.getStatusHistoryFirstRep().hasStatus()) {
				Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncStsHisSts()),
						fhirEncounter.getStatusHistoryFirstRep().getStatus().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testStatusHistoryPeriodStart() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.getStatusHistoryFirstRep().getPeriod().hasStart()) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncStsHisPrdStrt()),
					databaseDateFormat.format(fhirEncounter.getStatusHistoryFirstRep().getPeriod().getStart()));
			}
			i++;
		}
	}

	@Test
	void testStatusHistoryPeriodEnd() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.getStatusHistoryFirstRep().getPeriod().hasEnd()) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncStsHisPrdEnd()),
					databaseDateFormat.format(fhirEncounter.getStatusHistoryFirstRep().getPeriod().getEnd()));
			i++;
			}
		}
	}

	@Test
	void testClassSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsSys()),
					fhirEncounter.getClass_().getSystem());
			i++;
		}
	}
	
	@Test
	void testClassVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsVrsn()),
					fhirEncounter.getClass_().getVersion());
			i++;
		}
	}
	
	@Test
	void testClassCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsCd()),
					fhirEncounter.getClass_().getCode());
			i++;
		}
	}
	
	@Test
	void testClassDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsDsply()),
					fhirEncounter.getClass_().getDisplay());
			i++;
		}
	}
	
	@Test
	void testClassUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsUsrSltd()),
					fhirEncounter.getClass_().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testClassHistorySystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsHisClsSys()),
					fhirEncounter.getClassHistoryFirstRep().getClass_().getSystem());
			i++;
		}
	}
	
	@Test
	void testClassHistoryVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsHisClsVrsn()),
					fhirEncounter.getClassHistoryFirstRep().getClass_().getVersion());
			i++;
		}
	}
	
	@Test
	void testClassHistoryCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsHisClsCd()),
					fhirEncounter.getClassHistoryFirstRep().getClass_().getCode());
			i++;
		}
	}
	
	@Test
	void testClassHistoryDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsHisClsDsply()),
					fhirEncounter.getClassHistoryFirstRep().getClass_().getDisplay());
			i++;
		}
	}
	
	@Test
	void testClassHistoryUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsHisClsUsrSltd()),
					fhirEncounter.getClassHistoryFirstRep().getClass_().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testClassHistoryPeriodStart() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.getClassHistoryFirstRep().getPeriod().hasStart()) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsHisPrdStrt()),
					databaseDateFormat.format(fhirEncounter.getClassHistoryFirstRep().getPeriod().getStart()));
			}
			i++;
		}
	}
	
	@Test
	void testClassHistoryPeriodEnd() throws ParseException {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.getClassHistoryFirstRep().getPeriod().hasEnd()) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncClsHisPrdEnd()),
					databaseDateFormat.format(fhirEncounter.getClassHistoryFirstRep().getPeriod().getEnd()));
			}
			i++;
		}
	}
	
	@Test
	void testTypeCodingSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncTypCdgSys()),
					fhirEncounter.getTypeFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testTypeCodingVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncTypCdgVrsn()),
					fhirEncounter.getTypeFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testTypeCodingCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncTypCdgCd()),
					fhirEncounter.getTypeFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testTypeCodingDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncTypCdgDsply()),
					fhirEncounter.getTypeFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testTypeCodingUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncTypCdgUsrSltd()),
					fhirEncounter.getTypeFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testTypeText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncTypTxt()),
					fhirEncounter.getTypeFirstRep().getText());
			i++;
		}
	}
	
	
	@Test
	void testServiceTypeCodingSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncSrvTypCdgSys()),
					fhirEncounter.getServiceType().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testServiceTypeCodingVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncSrvTypCdgVrsn()),
					fhirEncounter.getServiceType().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testServiceTypeCodingCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncSrvTypCdgCd()),
					fhirEncounter.getServiceType().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testServiceTypeCodingDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncSrvTypCdgDsply()),
					fhirEncounter.getServiceType().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testServiceTypeCodingUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncSrvTypCdgUsrSltd()),
					fhirEncounter.getServiceType().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testServiceTypeText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncSrvTypTxt()),
					fhirEncounter.getServiceType().getText());
			i++;
		}
	}
	
	
	@Test
	void testPriorityCodingSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPriorityCdgSys()),
					fhirEncounter.getPriority().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testPriorityCodingVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPriorityCdgVrsn()),
					fhirEncounter.getPriority().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testPriorityCodingCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPriorityCdgCd()),
					fhirEncounter.getPriority().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testPriorityCodingDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPriorityCdgDsply()),
					fhirEncounter.getPriority().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testPriorityCodingUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPriorityCdgUsrSltd()),
					fhirEncounter.getPriority().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testPriorityText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPriorityTxt()),
					fhirEncounter.getPriority().getText());
			i++;
		}
	}
	
	
	@Test
	void testSubject() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncSbjct()),
					fhirEncounter.getSubject().getReference());
			i++;
		}
	}
	
	@Test
	void testEpisodeOfCare() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncEpisodeOfCare()),
					fhirEncounter.getEpisodeOfCareFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testBasedOn() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncBasedOn()),
					fhirEncounter.getBasedOnFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testParticipantTypeCodingSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrtcpntTypCdgSys()),
					fhirEncounter.getParticipantFirstRep().getTypeFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testParticipantTypeCodingVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrtcpntTypCdgVrsn()),
					fhirEncounter.getParticipantFirstRep().getTypeFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}	
	
	@Test
	void testParticipantTypeCodingCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrtcpntTypCdgCd()),
					fhirEncounter.getParticipantFirstRep().getTypeFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testParticipantTypeCodingDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrtcpntTypCdgDsply()),
					fhirEncounter.getParticipantFirstRep().getTypeFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testParticipantTypeCodingUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrtcpntTypCdgUsrSltd()),
					fhirEncounter.getParticipantFirstRep().getTypeFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testParticipantTypeText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrtcpntTypTxt()),
					fhirEncounter.getParticipantFirstRep().getTypeFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testParticipantPeriodStart() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.getParticipantFirstRep().getPeriod().hasStart()) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrtcpntPrdStrt()),
					databaseDateFormat.format(fhirEncounter.getParticipantFirstRep().getPeriod().getStart()));
			}
			i++;
		}
	}
	
	@Test
	void testParticipantPeriodEnd() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.getParticipantFirstRep().getPeriod().hasEnd()) {

			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrtcpntPrdEnd()),
					databaseDateFormat.format(fhirEncounter.getParticipantFirstRep().getPeriod().getEnd()));
			}
			i++;
		}
	}
	
	@Test
	void testParticipantIndividual() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrtcpntIndividual()),
					fhirEncounter.getParticipantFirstRep().getIndividual().getReference());
			i++;
		}
	}
	
	@Test
	void testAppointment() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncAppmnt()),
					fhirEncounter.getAppointmentFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testPeriodStart() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrdStrt()),
					databaseDateFormat.format(fhirEncounter.getPeriod().getStart()));
			i++;
		}
	}
	
	@Test
	void testPeriodEnd() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrdEnd()),
					databaseDateFormat.format(fhirEncounter.getPeriod().getEnd()));
			i++;
		}
	}
	
	@Test
	void testLength() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncPrdEnd()),
					databaseDateFormat.format(fhirEncounter.getPeriod().getEnd()));
			i++;
		}
	}
	
	
	@Test
	void testReasonCodeCodingSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncRsnCdCdgSys()),
					fhirEncounter.getReasonCodeFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	
	@Test
	void testReasonCodeCodingVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncRsnCdCdgVrsn()),
					fhirEncounter.getReasonCodeFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	
	@Test
	void testReasonCodeCodingCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncRsnCdCdgCd()),
					fhirEncounter.getReasonCodeFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	
	@Test
	void testReasonCodeCodingDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncRsnCdCdgDsply()),
					fhirEncounter.getReasonCodeFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	
	@Test
	void testReasonCodeCodingUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncRsnCdCdgUsrSltd()),
					fhirEncounter.getReasonCodeFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testReasonCodeText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncRsnCdTxt()),
					fhirEncounter.getReasonCodeFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testReasonReference() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncRsnRfrnc()),
					fhirEncounter.getReasonReferenceFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testDiagnosisCondition() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncDgnsisCndtn()),
					fhirEncounter.getDiagnosisFirstRep().getCondition().getReference());
			i++;
		}
	}
	
	@Test
	void testDiagnosisUseCodingSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncDgnsisUseCdgSys()),
					fhirEncounter.getDiagnosisFirstRep().getUse().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testDiagnosisUseCodingVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncDgnsisUseCdgVrsn()),
					fhirEncounter.getDiagnosisFirstRep().getUse().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testDiagnosisUseCodingCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncDgnsisUseCdgCd()),
					fhirEncounter.getDiagnosisFirstRep().getUse().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testDiagnosisUseCodingDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncDgnsisUseCdgDsply()),
					fhirEncounter.getDiagnosisFirstRep().getUse().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testDiagnosisUseCodingUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncDgnsisUseCdgUsrSltd()),
					fhirEncounter.getDiagnosisFirstRep().getUse().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testDiagnosisUseText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncDgnsisUseTxt()),
					fhirEncounter.getDiagnosisFirstRep().getUse().getText());
			i++;
		}
	}
	
	@Test
	void testDiagnosisRank() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncDgnsisRnk()),
					fhirEncounter.getDiagnosisFirstRep().getRankElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testHospitalizationPreAdmissionIdentifierUse() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.getHospitalization().getPreAdmissionIdentifier().hasUse()) {
				Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationPreAdmissionIdUse()),
						fhirEncounter.getHospitalization().getPreAdmissionIdentifier().getUse().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testHospitalizationPreAdmissionIdentifierTypeCodingSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationPreAdmissionIdTypCdgSys()),
					fhirEncounter.getHospitalization().getPreAdmissionIdentifier().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testHospitalizationPreAdmissionIdentifierTypeCodingVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationPreAdmissionIdTypCdgVrsn()),
					fhirEncounter.getHospitalization().getPreAdmissionIdentifier().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testHospitalizationPreAdmissionIdentifierTypeCodingCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationPreAdmissionIdTypCdgCd()),
					fhirEncounter.getHospitalization().getPreAdmissionIdentifier().getType().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testHospitalizationPreAdmissionIdentifierTypeCodingDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationPreAdmissionIdTypCdgDsply()),
					fhirEncounter.getHospitalization().getPreAdmissionIdentifier().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testHospitalizationPreAdmissionIdentifierTypeCodingUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationPreAdmissionIdTypCdgUsrSltd()),
					fhirEncounter.getHospitalization().getPreAdmissionIdentifier().getType().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testHospitalizationPreAdmissionIdentifierTypeText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationPreAdmissionIdTypTxt()),
					fhirEncounter.getHospitalization().getPreAdmissionIdentifier().getType().getText());
			i++;
		}
	}
	
	@Test
	void testHospitalizationOrigin() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationOrigin()),
					fhirEncounter.getHospitalization().getOrigin().getReference());
			i++;
		}
	}

	@Test
	void testHospitalizationAdmitSourceSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationAdmitSrcCdgSys()),
					fhirEncounter.getHospitalization().getAdmitSource().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testHospitalizationAdmitSourceVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationAdmitSrcCdgVrsn()),
					fhirEncounter.getHospitalization().getAdmitSource().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testHospitalizationAdmitSourceCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationAdmitSrcCdgCd()),
					fhirEncounter.getHospitalization().getAdmitSource().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testHospitalizationAdmitSourceDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationAdmitSrcCdgDsply()),
					fhirEncounter.getHospitalization().getAdmitSource().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testHospitalizationAdmitSourceUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationAdmitSrcCdgUsrSltd()),
					fhirEncounter.getHospitalization().getAdmitSource().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testHospitalizationAdmitSourceText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationAdmitSrcTxt()),
					fhirEncounter.getHospitalization().getAdmitSource().getText());
			i++;
		}
	}
	

	@Test
	void testHospitalizationReAdmissionSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationReAdmissionCdgSys()),
					fhirEncounter.getHospitalization().getReAdmission().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testHospitalizationReAdmissionVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationReAdmissionCdgVrsn()),
					fhirEncounter.getHospitalization().getReAdmission().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testHospitalizationReAdmissionCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationReAdmissionCdgCd()),
					fhirEncounter.getHospitalization().getReAdmission().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testHospitalizationReAdmissionDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationReAdmissionCdgDsply()),
					fhirEncounter.getHospitalization().getReAdmission().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testHospitalizationReAdmissionUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationReAdmissionCdgUsrSltd()),
					fhirEncounter.getHospitalization().getReAdmission().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testHospitalizationReAdmissionText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationReAdmissionTxt()),
					fhirEncounter.getHospitalization().getReAdmission().getText());
			i++;
		}
	}
	
	

	@Test
	void testHospitalizationDietPreferenceSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDietPreferenceCdgSys()),
					fhirEncounter.getHospitalization().getDietPreferenceFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testHospitalizationDietPreferenceVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDietPreferenceCdgVrsn()),
					fhirEncounter.getHospitalization().getDietPreferenceFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testHospitalizationDietPreferenceCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDietPreferenceCdgCd()),
					fhirEncounter.getHospitalization().getDietPreferenceFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testHospitalizationDietPreferenceDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDietPreferenceCdgDsply()),
					fhirEncounter.getHospitalization().getDietPreferenceFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testHospitalizationDietPreferenceUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDietPreferenceCdgUsrSltd()),
					fhirEncounter.getHospitalization().getDietPreferenceFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testHospitalizationDietPreferenceText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDietPreferenceTxt()),
					fhirEncounter.getHospitalization().getDietPreferenceFirstRep().getText());
			i++;
		}
	}
	

	@Test
	void testHospitalizationSpecialCourtesySystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclCourtesyCdgSys()),
					fhirEncounter.getHospitalization().getSpecialCourtesyFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialCourtesyVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclCourtesyCdgVrsn()),
					fhirEncounter.getHospitalization().getSpecialCourtesyFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialCourtesyCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclCourtesyCdgCd()),
					fhirEncounter.getHospitalization().getSpecialCourtesyFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialCourtesyDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclCourtesyCdgDsply()),
					fhirEncounter.getHospitalization().getSpecialCourtesyFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialCourtesyUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclCourtesyCdgUsrSltd()),
					fhirEncounter.getHospitalization().getSpecialCourtesyFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialCourtesyText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclCourtesyTxt()),
					fhirEncounter.getHospitalization().getSpecialCourtesyFirstRep().getText());
			i++;
		}
	}
	

	@Test
	void testHospitalizationSpecialArrangementSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclArrangementCdgSys()),
					fhirEncounter.getHospitalization().getSpecialArrangementFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialArrangementVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclArrangementCdgVrsn()),
					fhirEncounter.getHospitalization().getSpecialArrangementFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialArrangementCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclArrangementCdgCd()),
					fhirEncounter.getHospitalization().getSpecialArrangementFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialArrangementDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclArrangementCdgDsply()),
					fhirEncounter.getHospitalization().getSpecialArrangementFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialArrangementUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclArrangementCdgUsrSltd()),
					fhirEncounter.getHospitalization().getSpecialArrangementFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testHospitalizationSpecialArrangementText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationSpclArrangementTxt()),
					fhirEncounter.getHospitalization().getSpecialArrangementFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testHospitalizationDestination() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDestination()),
					fhirEncounter.getHospitalization().getDestination().getReference());
			i++;
		}
	}
	

	@Test
	void testHospitalizationDischargeDispositionSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDischargeDispositionCdgSys()),
					fhirEncounter.getHospitalization().getDischargeDisposition().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testHospitalizationDischargeDispositionVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDischargeDispositionCdgVrsn()),
					fhirEncounter.getHospitalization().getDischargeDisposition().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testHospitalizationDischargeDispositionCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDischargeDispositionCdgCd()),
					fhirEncounter.getHospitalization().getDischargeDisposition().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testHospitalizationDischargeDispositionDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDischargeDispositionCdgDsply()),
					fhirEncounter.getHospitalization().getDischargeDisposition().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testHospitalizationDischargeDispositionUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDischargeDispositionCdgUsrSltd()),
					fhirEncounter.getHospitalization().getDischargeDisposition().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}

	@Test
	void testHospitalizationDischargeDispositionText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncHospitalizationDischargeDispositionTxt()),
					fhirEncounter.getHospitalization().getDischargeDisposition().getText());
			i++;
		}
	}
	

	@Test
	void testLocationLocation() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncLctnLctn()),
					fhirEncounter.getLocationFirstRep().getLocation().getReference());
			i++;
		}
	}

	@Test
	void testLocationStatus() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			if(fhirEncounter.getLocationFirstRep().hasStatus()) {
				Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncLctnSts()),
						fhirEncounter.getLocationFirstRep().getStatus().toCode());
			}
			i++;
		}
	}

	@Test
	void testLocationPhysicalTypeCodingSystem() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncLctnPhysclTypCdgSys()),
					fhirEncounter.getLocationFirstRep().getPhysicalType().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testLocationPhysicalTypeCodingVersion() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncLctnPhysclTypCdgVrsn()),
					fhirEncounter.getLocationFirstRep().getPhysicalType().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testLocationPhysicalTypeCodingCode() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncLctnPhysclTypCdgCd()),
					fhirEncounter.getLocationFirstRep().getPhysicalType().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testLocationPhysicalTypeCodingDisplay() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncLctnPhysclTypCdgDsply()),
					fhirEncounter.getLocationFirstRep().getPhysicalType().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testLocationPhysicalTypeCodingUserSelected() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncLctnPhysclTypCdgUsrSltd()),
					fhirEncounter.getLocationFirstRep().getPhysicalType().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testLocationPhysicalTypeText() {
		int i = 0;
		for (Encounter fhirEncounter : fhirEncounterList) {
			Assert.assertEquals(cleanString(databaseEncounterList.get(i).getEncLctnPhysclTypTxt()),
					fhirEncounter.getLocationFirstRep().getPhysicalType().getText());
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
