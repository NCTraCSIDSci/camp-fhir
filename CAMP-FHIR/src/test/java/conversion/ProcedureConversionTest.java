package test.java.conversion;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.SQLGrammarException;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Procedure;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ca.uhn.fhir.context.FhirContext;
import main.java.com.campfhir.service.conversion.ProcedureConversion;
import main.java.utils.HibernateBaseDB;
import main.java.com.campfhir.dao.ResourceDao;
import main.java.com.campfhir.model.Campfhir;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProcedureConversionTest {
	private static FhirContext ctx;
	private static ProcedureConversion conversion;
	private SessionFactory sessionFactory;
	public static ResourceDao resourceDao;
	private static List<Procedure> fhirProcedureList = new ArrayList<Procedure>();
	private static List<main.java.com.campfhir.model.Procedure> dbProcedures;
	private SimpleDateFormat databaseDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	@BeforeAll
	public void setup() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			ParserConfigurationException, SAXException, ParseException, SQLGrammarException, FHIRException,
			InterruptedException, org.apache.commons.cli.ParseException {
        
		ctx = FhirContext.forR4();
		ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");
		String config = new File("./").getCanonicalPath() + "/config.json";
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(new File("./main/java/com/resources/XML").getCanonicalPath());
		Campfhir cf = mapper.readValue(new File(config), Campfhir.class);
		cf.setResource("Procedure");
		sessionFactory = HibernateBaseDB.getSessionFactory(cf, "in");
		Session session = sessionFactory.openSession();
		dbProcedures = session.createQuery("from Procedure", main.java.com.campfhir.model.Procedure.class).list();
		session.close();

		conversion = new ProcedureConversion();
		for (main.java.com.campfhir.model.Procedure Procedure : dbProcedures) {
			Procedure fhirProcedure = conversion.Procedures(Procedure);
			fhirProcedureList.add(fhirProcedure);
		}
		
	}
	
	@Test
	void testResourceType() throws StreamReadException, DatabindException, IOException, ParseException {
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals("Procedure", fhirProcedure.getResourceType().toString());
		}

	}

	@Test
	void testResourceId() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getId()), fhirProcedure.getIdElement().getIdPart());
			i++;
		}
	}

	@Test
	void testIdentifierUse() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if (fhirProcedure.getIdentifier().get(0).hasUse()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdUse()),
						fhirProcedure.getIdentifierFirstRep().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testIdentifierSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdSys()),
					fhirProcedure.getIdentifierFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierValue() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdVl()),
					fhirProcedure.getIdentifierFirstRep().getValueElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierPeriodStart() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if (fhirProcedure.getIdentifier().get(0).getPeriod().hasStart()) {
				Assert.assertEquals(dbProcedures.get(i).getPrcdrIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
						databaseDateFormat.format(fhirProcedure.getIdentifierFirstRep().getPeriod().getStart()));

			}
			i++;
		}
	}

	@Test
	void testIdentifierPeriodEnd() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if (fhirProcedure.getIdentifier().get(0).getPeriod().getEnd() != null) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdPrdEnd()), databaseDateFormat.format(fhirProcedure.getIdentifierFirstRep().getPeriod().getEnd()));
			}
			i++;
		}
	}

	@Test
	void testIdentifierAssigner() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdAssigner()),
					fhirProcedure.getIdentifierFirstRep().getAssigner().getReference());
			i++;
		}
	}

	@Test
	void testIdentifierTypeCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdTypCdgCd()),
					fhirProcedure.getIdentifierFirstRep().getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testIdentifierTypeSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdTypCdgSys()),
					fhirProcedure.getIdentifierFirstRep().getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierTypeVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdTypCdgVrsn()),
					fhirProcedure.getIdentifierFirstRep().getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testIdentifierTypeDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdTypCdgDsply()),
					fhirProcedure.getIdentifierFirstRep().getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testIdentifierTypeUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdTypCdgUsrSltd()), fhirProcedure.getIdentifierFirstRep()
					.getType().getCodingFirstRep().getUserSelectedElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierTypeText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrIdTypTxt()),
					fhirProcedure.getIdentifierFirstRep().getType().getText());
			i++;
		}
	}

	@Test
	void testInstantiatesCanonical() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasInstantiatesCanonical()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrInstantiatesCanonical()),
						fhirProcedure.getInstantiatesCanonical().get(0).asStringValue());
			}
			i++;
		}
	}

	@Test
	void testInstantiatesURI() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasInstantiatesUri()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrInstantiatesUri()),
						fhirProcedure.getInstantiatesUri().get(0).asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testBasedOn() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrBasedOn()),
						fhirProcedure.getBasedOnFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testPartOf() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPartOf()),
						fhirProcedure.getPartOfFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testStatus() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasStatus()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrSts()),
						fhirProcedure.getStatus().toCode());
			}
			i++;
		}
	}
	
	@Test
	void testStatusReasonCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrStsRsnCdgSys()),
						fhirProcedure.getStatusReason().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testStatusReasonCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrStsRsnCdgVrsn()),
						fhirProcedure.getStatusReason().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testStatusReasonCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrStsRsnCdgCd()),
						fhirProcedure.getStatusReason().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testStatusReasonCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrStsRsnCdgDsply()),
						fhirProcedure.getStatusReason().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testStatusReasonCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrStsRsnCdgUsrSltd()),
						fhirProcedure.getStatusReason().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	
	@Test
	void testStatusReasonText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrStsRsnTxt()),
						fhirProcedure.getStatusReason().getText());
			i++;
		}
	}

	
	@Test
	void testCategoryCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCtgryCdgSys()),
						fhirProcedure.getCategory().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testCategoryCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCtgryCdgVrsn()),
						fhirProcedure.getCategory().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testCategoryCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCtgryCdgCd()),
						fhirProcedure.getCategory().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testCategoryCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCtgryCdgDsply()),
						fhirProcedure.getCategory().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testCategoryCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCtgryCdgUsrSltd()),
						fhirProcedure.getCategory().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	
	@Test
	void testCategoryText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCtgryTxt()),
						fhirProcedure.getCategory().getText());
			i++;
		}
	}
	
	@Test
	void testCodeCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCdCdgSys()),
						fhirProcedure.getCode().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testCodeCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCdCdgVrsn()),
						fhirProcedure.getCode().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testCodeCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCdCdgCd()),
						fhirProcedure.getCode().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testCodeCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCdCdgDsply()),
						fhirProcedure.getCode().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testCodeCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCdCdgUsrSltd()),
						fhirProcedure.getCode().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	
	@Test
	void testCodeText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrCdTxt()),
						fhirProcedure.getCode().getText());
			i++;
		}
	}	
	
	@Test
	void testSubject() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrSbjct()),
						fhirProcedure.getSubject().getReference());
			i++;
		}
	}	
	
	@Test
	void testEncounter() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrEnc()),
						fhirProcedure.getEncounter().getReference());
			i++;
		}
	}
	
	@Test
	void testPerformedDateTime() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedDateTimeType()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedDtTimeTyp()),
						fhirProcedure.getPerformedDateTimeType().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testPerformedPeriodStart() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedPeriod()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedPrdStrt()),
						databaseDateFormat.format(fhirProcedure.getPerformedPeriod().getStart()));
			}
			i++;
		}
	}
	
	@Test
	void testPerformedPeriodEnd() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedPeriod()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedPrdEnd()),
					databaseDateFormat.format(fhirProcedure.getPerformedPeriod().getEnd()));
			}
			i++;
		}
	}
	
	@Test
	void testPerformedString() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedStringType()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedStrgTyp()),
						fhirProcedure.getPerformedStringType().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testPerformedAgeValue() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedAge()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedAgeVl()),
						fhirProcedure.getPerformedAge().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testPerformedAgeComparator() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedAge()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedAgeCmprtr()),
						fhirProcedure.getPerformedAge().getComparatorElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testPerformedAgeUnit() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedAge()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedAgeUnt()),
						fhirProcedure.getPerformedAge().getUnit());
			}
			i++;
		}
	}

	@Test
	void testPerformedAgeSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedAge()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedAgeSys()),
						fhirProcedure.getPerformedAge().getSystem());
			}
			i++;
		}
	}

	@Test
	void testPerformedAgeCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedAge()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedAgeCd()),
						fhirProcedure.getPerformedAge().getCode());
			}
			i++;
		}
	}
	
	@Test
	void testPerformedRangeLowValue() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngLwVl()),
						fhirProcedure.getPerformedRange().getLow().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testPerformedRangeLowComparator() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngLwCmprtr()),
						fhirProcedure.getPerformedRange().getLow().getComparatorElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testPerformedRangeLowUnit() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngLwUnt()),
						fhirProcedure.getPerformedRange().getLow().getUnit());
			}
			i++;
		}
	}

	@Test
	void testPerformedRangeLowSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngLwSys()),
						fhirProcedure.getPerformedRange().getLow().getSystem());
			}
			i++;
		}
	}

	@Test
	void testPerformedRangeLowCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngLwCd()),
						fhirProcedure.getPerformedRange().getLow().getCode());
			}
			i++;
		}
	}


	
	@Test
	void testPerformedRangeHighValue() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngHiVl()),
						fhirProcedure.getPerformedRange().getHigh().getValueElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testPerformedRangeHighComparator() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngHiCmprtr()),
						fhirProcedure.getPerformedRange().getHigh().getComparatorElement().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testPerformedRangeHighUnit() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngHiUnt()),
						fhirProcedure.getPerformedRange().getHigh().getUnit());
			}
			i++;
		}
	}

	@Test
	void testPerformedRangeHighSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngHiSys()),
						fhirProcedure.getPerformedRange().getHigh().getSystem());
			}
			i++;
		}
	}

	@Test
	void testPerformedRangeHighCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.hasPerformedRange()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPerformedRngHiCd()),
						fhirProcedure.getPerformedRange().getHigh().getCode());
			}
			i++;
		}
	}

	@Test
	void testRecorder() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrRecorder()),
						fhirProcedure.getRecorder().getReference());
			i++;
		}
	}

	@Test
	void testAsserter() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrAsserter()),
						fhirProcedure.getAsserter().getReference());
			i++;
		}
	}


	@Test
	void testPerformerFunctionCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPrfrmrFunctionCdgSys()),
						fhirProcedure.getPerformerFirstRep().getFunction().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testPerformerFunctionCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPrfrmrFunctionCdgVrsn()),
						fhirProcedure.getPerformerFirstRep().getFunction().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testPerformerFunctionCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPrfrmrFunctionCdgCd()),
						fhirProcedure.getPerformerFirstRep().getFunction().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testPerformerFunctionCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPrfrmrFunctionCdgDsply()),
						fhirProcedure.getPerformerFirstRep().getFunction().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testPerformerFunctionCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPrfrmrFunctionCdgUsrSltd()),
						fhirProcedure.getPerformerFirstRep().getFunction().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testPerformerFunctionText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPrfrmrFunctionTxt()),
						fhirProcedure.getPerformerFirstRep().getFunction().getText());
			i++;
		}
	}
	
	@Test
	void testPerformerActor() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPrfrmrActor()),
						fhirProcedure.getPerformerFirstRep().getActor().getReference());
			i++;
		}
	}
	
	@Test
	void testPerformerOnBehalfOf() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrPrfrmrOnBehalfOf()),
						fhirProcedure.getPerformerFirstRep().getOnBehalfOf().getReference());
			i++;
		}
	}
	
	@Test
	void testLocation() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrLctn()),
						fhirProcedure.getLocation().getReference());
			i++;
		}
	}
	
	@Test
	void testReasonCodeCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrRsnCdCdgSys()),
						fhirProcedure.getReasonCodeFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testReasonCodeCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrRsnCdCdgVrsn()),
						fhirProcedure.getReasonCodeFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testReasonCodeCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrRsnCdCdgCd()),
						fhirProcedure.getReasonCodeFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testReasonCodeCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrRsnCdCdgDsply()),
						fhirProcedure.getReasonCodeFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testReasonCodeCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrRsnCdCdgUsrSltd()),
						fhirProcedure.getReasonCodeFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testReasonCodeText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrRsnCdTxt()),
						fhirProcedure.getReasonCodeFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testReasonReference() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrRsnRfrnc()),
						fhirProcedure.getReasonReferenceFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrBodySiteCdgSys()),
						fhirProcedure.getBodySiteFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrBodySiteCdgVrsn()),
						fhirProcedure.getBodySiteFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrBodySiteCdgCd()),
						fhirProcedure.getBodySiteFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrBodySiteCdgDsply()),
						fhirProcedure.getBodySiteFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testBodySiteCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrBodySiteCdgUsrSltd()),
						fhirProcedure.getBodySiteFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testBodySiteText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrBodySiteTxt()),
						fhirProcedure.getBodySiteFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testOutcomeCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrOutcomeCdgSys()),
						fhirProcedure.getOutcome().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testOutcomeCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrOutcomeCdgVrsn()),
						fhirProcedure.getOutcome().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testOutcomeCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrOutcomeCdgCd()),
						fhirProcedure.getOutcome().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testOutcomeCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrOutcomeCdgDsply()),
						fhirProcedure.getOutcome().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testOutcomeCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrOutcomeCdgUsrSltd()),
						fhirProcedure.getOutcome().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testOutcomeText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrOutcomeTxt()),
						fhirProcedure.getOutcome().getText());
			i++;
		}
	}
	
	@Test
	void testReport() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrRpt()),
						fhirProcedure.getReportFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testComplicationCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrComplicationCdgSys()),
						fhirProcedure.getComplicationFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testComplicationCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrComplicationCdgVrsn()),
						fhirProcedure.getComplicationFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testComplicationCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrComplicationCdgCd()),
						fhirProcedure.getComplicationFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testComplicationCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrComplicationCdgDsply()),
						fhirProcedure.getComplicationFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testComplicationCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrComplicationCdgUsrSltd()),
						fhirProcedure.getComplicationFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testComplicationText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrComplicationTxt()),
						fhirProcedure.getComplicationFirstRep().getText());
			i++;
		}
	}
	
	@Test
	void testComplicationDetail() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrComplicationDtl()),
						fhirProcedure.getComplicationDetailFirstRep().getReference());
			i++;
		}
	}
	
	@Test
	void testFollowUpCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFollowUpCdgSys()),
						fhirProcedure.getFollowUpFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testFollowUpCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFollowUpCdgVrsn()),
						fhirProcedure.getFollowUpFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testFollowUpCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFollowUpCdgCd()),
						fhirProcedure.getFollowUpFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testFollowUpCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFollowUpCdgDsply()),
						fhirProcedure.getFollowUpFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testFollowUpCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFollowUpCdgUsrSltd()),
						fhirProcedure.getFollowUpFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testFollowUpText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFollowUpTxt()),
						fhirProcedure.getFollowUpFirstRep().getText());
			i++;
		}
	}	
	
	@Test
	void testNoteAuthorReference() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.getNoteFirstRep().hasAuthorReference()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrNtAthrRfrnc()),
						fhirProcedure.getNoteFirstRep().getAuthorReference().getReference());
			}
			i++;
		}
	}	
	
	@Test
	void testNoteAuthorString() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.getNoteFirstRep().hasAuthorStringType()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrNtAthrStrgTyp()),
						fhirProcedure.getNoteFirstRep().getAuthorStringType().asStringValue());
			}
			i++;
		}
	}
	
	@Test
	void testNoteTime() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
			if(fhirProcedure.getNoteFirstRep().hasTime()) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrNtTime()),
						databaseDateFormat.format(fhirProcedure.getNoteFirstRep().getTime()));
			}
			i++;
		}
	}
	
	@Test
	void testNoteText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrNtTxt()),
						fhirProcedure.getNoteFirstRep().getText());
			i++;
		}
	}	
	
	@Test
	void testFocalDeviceActionCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFocalDvcActnCdgSys()),
						fhirProcedure.getFocalDeviceFirstRep().getAction().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testFocalDeviceActionCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFocalDvcActnCdgVrsn()),
						fhirProcedure.getFocalDeviceFirstRep().getAction().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testFocalDeviceActionCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFocalDvcActnCdgCd()),
						fhirProcedure.getFocalDeviceFirstRep().getAction().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testFocalDeviceActionCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFocalDvcActnCdgDsply()),
						fhirProcedure.getFocalDeviceFirstRep().getAction().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testFocalDeviceActionCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFocalDvcActnCdgUsrSltd()),
						fhirProcedure.getFocalDeviceFirstRep().getAction().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testFocalDeviceActionText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFocalDvcActnTxt()),
						fhirProcedure.getFocalDeviceFirstRep().getAction().getText());
			i++;
		}
	}	
	
	
	@Test
	void testFocalDeviceMainpulated() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrFocalDvcManipulated()),
						fhirProcedure.getFocalDeviceFirstRep().getManipulated().getReference());
			i++;
		}
	}
	
	@Test
	void testUsedReference() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrUsedRfrnc()),
						fhirProcedure.getUsedReferenceFirstRep().getReference());
			i++;
		}
	}
	
	
	@Test
	void testUsedCodeCodingSystem() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrUsedCdCdgSys()),
						fhirProcedure.getUsedCodeFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}
	
	@Test
	void testUsedCodeCodingVersion() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrUsedCdCdgVrsn()),
						fhirProcedure.getUsedCodeFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}
	
	@Test
	void testUsedCodeCodingCode() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrUsedCdCdgCd()),
						fhirProcedure.getUsedCodeFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}
	
	@Test
	void testUsedCodeCodingDisplay() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrUsedCdCdgDsply()),
						fhirProcedure.getUsedCodeFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}
	
	@Test
	void testUsedCodeCodingUserSelected() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrUsedCdCdgUsrSltd()),
						fhirProcedure.getUsedCodeFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
			i++;
		}
	}
	
	@Test
	void testUsedCodeText() {
		int i = 0;
		for (Procedure fhirProcedure : fhirProcedureList) {
				Assert.assertEquals(cleanString(dbProcedures.get(i).getPrcdrUsedCdTxt()),
						fhirProcedure.getUsedCodeFirstRep().getText());
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