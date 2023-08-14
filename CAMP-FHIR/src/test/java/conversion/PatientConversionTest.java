package test.java.conversion;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.SQLGrammarException;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.Patient;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ca.uhn.fhir.context.FhirContext;
import main.java.com.campfhir.service.conversion.PatientConversion;
import main.java.utils.HibernateBaseDB;
import main.java.com.campfhir.dao.ResourceDao;
import main.java.com.campfhir.model.Campfhir;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PatientConversionTest {
	private static FhirContext ctx;
	private static PatientConversion conversion;
	private SessionFactory sessionFactory;
	public static ResourceDao resourceDao;
	private static List<Patient> fhirPatientList = new ArrayList<Patient>();
	private static List<main.java.com.campfhir.model.Patient> dbPatients;
	private SimpleDateFormat databaseDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public static DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ofPattern("EEE, d MMM yyyy HH:mm:ss 'GMT'"))
    		.appendOptional(DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy")).toFormatter();

	private static Date convertStringToDate(String dateString) {
		 try {
			 return Date.from(LocalDateTime.parse(dateString, formatter).atZone(ZoneOffset.UTC).toInstant());
		 } catch(Exception e) {
			 return Date.from(LocalDate.parse(dateString, formatter).atStartOfDay(ZoneId.systemDefault()).toInstant());
		 }
	}

	@BeforeAll
	public void setup() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			ParserConfigurationException, SAXException, ParseException, SQLGrammarException, FHIRException,
			InterruptedException, org.apache.commons.cli.ParseException {
        
		ctx = FhirContext.forR4();
		ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");
		String config = new File("./").getCanonicalPath() + "/config.json";
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(new File("./").getCanonicalPath() + "/config.json");
		System.out.println(new File("./main/java/com/resources/XML").getCanonicalPath());
		Campfhir cf = mapper.readValue(new File(config), Campfhir.class);
		cf.setResource("Patient");
		sessionFactory = HibernateBaseDB.getSessionFactory(cf, "in");
		Session session = sessionFactory.openSession();
		dbPatients = session.createQuery("from Patient", main.java.com.campfhir.model.Patient.class).list();
		session.close();

		conversion = new PatientConversion();
		for (main.java.com.campfhir.model.Patient Patient : dbPatients) {
			Patient fhirPatient = conversion.Patients(Patient);
			fhirPatientList.add(fhirPatient);
		}
		
	}
	

	@Test
	void testResourceType() throws StreamReadException, DatabindException, IOException, ParseException {
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals("Patient", fhirpat.getResourceType().toString());
		}

	}

	@Test
	void testResourceId() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getId()), fhirpat.getIdElement().getIdPart());
			i++;
		}
	}

	@Test
	void testIdentifierUse() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getIdentifier().get(0).hasUse()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdUse()),
						fhirpat.getIdentifier().get(0).getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testIdentifierSystem() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdSys()),
					fhirpat.getIdentifier().get(0).getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierValue() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdVl()),
					fhirpat.getIdentifier().get(0).getValueElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierPeriodStart() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getIdentifier().get(0).getPeriod().hasStart()) {
				Assert.assertEquals(dbPatients.get(i).getPntIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
						databaseDateFormat.format(fhirpat.getIdentifier().get(0).getPeriod().getStart())
								.toString());

			}
			i++;
		}
	}

	@Test
	void testIdentifierPeriodEnd() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getIdentifier().get(0).getPeriod().getEnd() != null) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdPrdEnd()), ca.uhn.fhir.util.DateUtils
						.formatDate(fhirpat.getIdentifier().get(0).getPeriod().getEnd()).toString());
			}
			i++;
		}
	}

	@Test
	void testIdentifierAssigner() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdAssigner()),
					fhirpat.getIdentifier().get(0).getAssigner().getReference());
			i++;
		}
	}

	@Test
	void testIdentifierTypeCode() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdTypCdgCd()),
					fhirpat.getIdentifier().get(0).getType().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testIdentifierTypeSystem() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdTypCdgSys()),
					fhirpat.getIdentifier().get(0).getType().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testIdentifierTypeVersion() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdTypCdgVrsn()),
					fhirpat.getIdentifier().get(0).getType().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testIdentifierTypeDisplay() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdTypCdgDsply()),
					fhirpat.getIdentifier().get(0).getType().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testIdentifierTypeUserSelected() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdTypCdgUsrSltd()), fhirpat.getIdentifier().get(0)
					.getType().getCodingFirstRep().getUserSelectedElement().getValueAsString());
			i++;
		}
	}

	@Test
	void testIdentifierTypeText() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntIdTypTxt()),
					fhirpat.getIdentifier().get(0).getType().getText());
			i++;
		}
	}

	@Test
	void testActive() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntActive()), fhirpat.getActiveElement().getValue());
			i++;
		}
	}

	@Test
	void testHumanNameUse() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntNmUse()),
					fhirpat.getNameFirstRep().getUse().toCode());
			i++;
		}
	}

	@Test
	void testHumanNameText() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntNmTxt()), fhirpat.getNameFirstRep().getText());
			i++;
		}
	}

	@Test
	void testHumanNameFamily() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntNmFmly()), fhirpat.getNameFirstRep().getFamily());
			i++;
		}
	}

	@Test
	void testHumanNameGiven() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (cleanString(dbPatients.get(i).getPntNmGiven()).equals("NULL")) {
				dbPatients.get(i).setPntNmGiven(null);
			}
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntNmGiven()),
					fhirpat.getNameFirstRep().getGiven().get(0).toString());
			i++;
		}
	}

	@Test
	void testHumanNamePrefix() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getNameFirstRep().hasPrefix()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntNmPrefix()),
						fhirpat.getNameFirstRep().getPrefixAsSingleString());
			}
			i++;
		}
	}

	@Test
	void testHumanNameSuffix() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getNameFirstRep().hasSuffix()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntNmSuffix()),
						fhirpat.getNameFirstRep().getSuffix());
			}
			i++;
		}
	}

	@Test
	void testHumanNamePeriodStart() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntNmPrdStrt()),
					fhirpat.getNameFirstRep().getPeriod().getStart());
			i++;
		}
	}

	@Test
	void testHumanNamePeriodEnd() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntNmPrdEnd()),
					fhirpat.getNameFirstRep().getPeriod().getEnd());
			i++;
		}
	}

	@Test
	void testTelecomSystem() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getTelecomFirstRep().hasSystem()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntTlcmSys()),
						fhirpat.getTelecomFirstRep().getSystem().toCode());
			}
			i++;
		}
	}

	@Test
	void testTelecomValue() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntTlcmVl()), fhirpat.getTelecomFirstRep().getValue());
			i++;
		}
	}

	@Test
	void testTelecomUse() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntTlcmUse()),
					fhirpat.getTelecomFirstRep().getUse().toCode());
			i++;
		}
	}

	@Test
	void testTelecomRank() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getTelecomFirstRep().hasRank()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntTlcmRnk()),
						fhirpat.getTelecomFirstRep().getRank());
			}
			i++;
		}
	}

	@Test
	void testTelecomPeriodStart() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntTlcmPrdStrt()),
					fhirpat.getTelecomFirstRep().getPeriod().getStart());
			i++;
		}
	}

	@Test
	void testTelecomPeriodEnd() {

		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntTlcmPrdEnd()),
					fhirpat.getTelecomFirstRep().getPeriod().getEnd());
			i++;
		}
	}

	@Test
	void testGender() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntGender()), fhirpat.getGender().toCode());
			i++;
		}
	}

	@Test
	void testBirthDate() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.hasBirthDate()) {
				Assert.assertEquals(convertStringToDate(dbPatients.get(i).getPntBirthDt().replaceAll("[\\[\\]\"]", "")),
						fhirpat.getBirthDate());
			}
			i++;
		}
	}

	@Test
	void testDeceasedBooleanType() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.hasDeceasedBooleanType()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntDeceasedBooleanTyp()),
						fhirpat.getDeceasedBooleanType().getValueAsString());
			}
			i++;
		}
	}

	@Test
	void testDeceasedDateType() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.hasDeceasedDateTimeType()) {
				Assert.assertEquals(dbPatients.get(i).getPntDeceasedDtTimeTyp().replaceAll("[\\[\\]\"]", ""),
						fhirpat.getDeceasedDateTimeType().getValueAsString());
			}
			i++;
		}
	}

	@Test
	void testAddressUse() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getAddressFirstRep().hasUse()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrUse()),
						fhirpat.getAddressFirstRep().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testAddressType() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getAddressFirstRep().hasType()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrTyp()),
						fhirpat.getAddressFirstRep().getType().toCode());
			}
			i++;
		}
	}

	@Test
	void testAddressText() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrTxt()), fhirpat.getAddressFirstRep().getText());
			i++;
		}
	}

	@Test
	void testAddressLine() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getAddressFirstRep().hasLine()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrLine()),
						fhirpat.getAddressFirstRep().getLine().get(0).asStringValue());
			}
			i++;
		}
	}

	@Test
	void testAddressCity() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrCity()),
					fhirpat.getAddressFirstRep().getCity());
			i++;
		}
	}

	@Test
	void testAddressDistrict() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrDistrict()),
					fhirpat.getAddressFirstRep().getDistrict());
			i++;
		}
	}

	@Test
	void testAddressState() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrState()),
					fhirpat.getAddressFirstRep().getState());
			i++;
		}
	}

	@Test
	void testAddressPostalCode() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrPostalCd()),
					fhirpat.getAddressFirstRep().getPostalCode());
			i++;
		}
	}

	@Test
	void testAddressCountry() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrCntry()),
					fhirpat.getAddressFirstRep().getCountry());
			i++;
		}
	}

	@Test
	void testAddressPeriodStart() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrPrdStrt()),
					fhirpat.getAddressFirstRep().getPeriod().getStart());
			i++;
		}
	}

	@Test
	void testAddressPeriodEnd() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntAddrPrdEnd().replaceAll("[\\[\\]\"]", "")),
					fhirpat.getAddressFirstRep().getPeriod().getEnd());
			i++;
		}
	}

	@Test
	void testMaritalStatusCodingSystem() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getMaritalStatus().hasCoding()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntMaritalStsCdgSys()),
						fhirpat.getMaritalStatus().getCoding().get(0).getSystem());
				i++;
			}
		}
	}

	@Test
	void testMaritalStatusCodingVersion() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getMaritalStatus().hasCoding()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntMaritalStsCdgVrsn()),
						fhirpat.getMaritalStatus().getCoding().get(0).getVersion());
			}
			i++;
		}
	}

	@Test
	void testMaritalStatusCodingCode() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getMaritalStatus().hasCoding()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntMaritalStsCdgCd()),
						fhirpat.getMaritalStatus().getCoding().get(0).getCode());
			}
			i++;
		}
	}

	@Test
	void testMaritalStatusCodingDisplay() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getMaritalStatus().hasCoding()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntMaritalStsCdgDsply()),
						fhirpat.getMaritalStatus().getCoding().get(0).getDisplay());
			}
			i++;
		}
	}

	@Test
	void testMaritalStatusCodingUserSelected() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getMaritalStatus().hasCoding()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntMaritalStsCdgUsrSltd()),
						fhirpat.getMaritalStatus().getCoding().get(0).getUserSelectedElement().asStringValue());
			}
			i++;
		}
	}

	@Test
	void testMaritalStatusText() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getMaritalStatus().hasCoding()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntMaritalStsTxt()),
						fhirpat.getMaritalStatus().getText());
			}
			i++;
		}
	}

	@Test
	void testMultipleBirthBoolean() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.hasMultipleBirthBooleanType()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntMultipleBirthBooleanTyp()),
						fhirpat.getMultipleBirthBooleanType().asStringValue());
			}
			i++;
		}
	}

	@Test
	void testMultipleBirthInteger() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.hasMultipleBirthIntegerType()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntMultipleBirthIntegerTyp()),
						fhirpat.getMultipleBirthIntegerType().asStringValue());
			}
			i++;
		}
	}

	@Test
	void testPhotoContentType() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntPhotoCntntTyp()),
					fhirpat.getPhotoFirstRep().getContentType());
			i++;
		}
	}

	@Test
	void testPhotoLanguage() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntPhotoLnguage()),
					fhirpat.getPhotoFirstRep().getLanguage());
			i++;
		}
	}

	@Test
	void testPhotoData() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntPhotoData()), fhirpat.getPhotoFirstRep().getData());
			i++;
		}
	}

	@Test
	void testPhotoURL() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntPhotoUrl()), fhirpat.getPhotoFirstRep().getUrl());
			i++;
		}
	}

	@Test
	void testPhotoSize() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.hasPhoto()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntPhotoSz()),
						fhirpat.getPhotoFirstRep().getSize());
			}
			i++;
		}
	}

	@Test
	void testPhotoHash() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntPhotoHash()), fhirpat.getPhotoFirstRep().getHash());
			i++;
		}
	}

	@Test
	void testPhotoTitle() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntPhotoTtl()), fhirpat.getPhotoFirstRep().getTitle());
			i++;
		}
	}

	@Test
	void testPhotoCreation() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntPhotoCreation()),
					fhirpat.getPhotoFirstRep().getCreation());
			i++;
		}
	}

	@Test
	void testContactRelationshipCodingSystem() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctRltnshipCdgSys()),
					fhirpat.getContactFirstRep().getRelationshipFirstRep().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testContactRelationshipCodingVersion() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctRltnshipCdgVrsn()),
					fhirpat.getContactFirstRep().getRelationshipFirstRep().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testContactRelationshipCodingCode() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctRltnshipCdgCd()),
					fhirpat.getContactFirstRep().getRelationshipFirstRep().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testContactRelationshipCodingDisplay() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctRltnshipCdgDsply()),
					fhirpat.getContactFirstRep().getRelationshipFirstRep().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testContactRelationshipCodingUserSelected() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctRltnshipCdgUsrSltd()),
					fhirpat.getContactFirstRep().getRelationshipFirstRep().getCodingFirstRep().getUserSelectedElement()
							.asStringValue());
			i++;
		}
	}

	@Test
	void testContactNameUse() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctNmUse()),
					fhirpat.getContactFirstRep().getName().getUse());
			i++;
		}
	}

	@Test
	void testContactNameText() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctNmTxt()),
					fhirpat.getContactFirstRep().getName().getText());
			i++;
		}
	}

	@Test
	void testContactNameFamily() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctNmFmly()),
					fhirpat.getContactFirstRep().getName().getFamily());
			i++;
		}
	}

	@Test
	void testContactNameGiven() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getContactFirstRep().getName().hasGiven()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctNmGiven()),
						fhirpat.getContactFirstRep().getName().getGiven().get(0).asStringValue());
			}
			i++;
		}
	}

	@Test
	void testContactNamePrefix() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getContactFirstRep().getName().hasPrefix()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctNmPrefix()),
						fhirpat.getContactFirstRep().getName().getPrefix().get(0));
			}
			i++;
		}
	}

	@Test
	void testContactNameSuffix() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getContactFirstRep().getName().hasSuffix()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctNmSuffix()),
						fhirpat.getContactFirstRep().getName().getSuffix().get(0));
			}
			i++;
		}
	}

	@Test
	void testContactNamePeriodStart() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctNmPrdStrt()),
					fhirpat.getContactFirstRep().getName().getPeriod().getStart());
			i++;
		}
	}

	@Test
	void testContactNamePeriodEnd() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctNmPrdEnd()),
					fhirpat.getContactFirstRep().getName().getPeriod().getEnd());
			i++;
		}
	}

	@Test
	void testContactTelecomSystem() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getContactFirstRep().getTelecomFirstRep().hasSystem()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctTlcmSys()),
						fhirpat.getContactFirstRep().getTelecomFirstRep().getSystem().toCode());
			}
			i++;
		}
	}

	@Test
	void testContactTelecomValue() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctTlcmVl()),
					fhirpat.getContactFirstRep().getTelecomFirstRep().getValue());
			i++;
		}
	}

	@Test
	void testContactTelecomUse() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctTlcmUse()),
					fhirpat.getContactFirstRep().getTelecomFirstRep().getUse());
			i++;
		}
	}

	@Test
	void testContactTelecomRank() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctTlcmRnk()),
					fhirpat.getContactFirstRep().getTelecomFirstRep().getRankElement().asStringValue());
			i++;
		}
	}

	@Test
	void testContactTelecomPeriodStart() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctTlcmPrdStrt()),
					fhirpat.getContactFirstRep().getTelecomFirstRep().getPeriod().getStart());
			i++;
		}
	}

	@Test
	void testContactTelecomPeriodEnd() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctTlcmPrdEnd()),
					fhirpat.getContactFirstRep().getTelecomFirstRep().getPeriod().getEnd());
			i++;
		}
	}

	@Test
	void testContactAddressUse() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getContactFirstRep().getAddress().hasUse()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrUse()),
						fhirpat.getContactFirstRep().getAddress().getUse().toCode());
			}
			i++;
		}
	}

	@Test
	void testContactAddressType() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getContactFirstRep().getAddress().hasType()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrTyp()),
						fhirpat.getContactFirstRep().getAddress().getType().toCode());
			}
			i++;
		}
	}

	@Test
	void testContactAddressText() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrTxt()),
					fhirpat.getContactFirstRep().getAddress().getText());
			i++;
		}
	}

	@Test
	void testContactAddressLine() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getContactFirstRep().getAddress().hasLine()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrLine()),
						fhirpat.getContactFirstRep().getAddress().getLine().get(0));
			}
			i++;
		}
	}

	@Test
	void testContactAddressCity() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrCity()),
					fhirpat.getContactFirstRep().getAddress().getCity());
			i++;
		}
	}

	@Test
	void testContactAddressDistrict() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrDistrict()),
					fhirpat.getContactFirstRep().getAddress().getDistrict());
			i++;
		}
	}

	@Test
	void testContactAddressState() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrState()),
					fhirpat.getContactFirstRep().getAddress().getState());
			i++;
		}
	}

	@Test
	void testContactAddressPostalCode() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrPostalCd()),
					fhirpat.getContactFirstRep().getAddress().getPostalCode());
			i++;
		}
	}

	@Test
	void testContactAddressCountry() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrCntry()),
					fhirpat.getContactFirstRep().getAddress().getCountry());
			i++;
		}
	}

	@Test
	void testContactAddressPeriodStart() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrPrdStrt()),
					fhirpat.getContactFirstRep().getAddress().getPeriod().getStart());
			i++;
		}
	}

	@Test
	void testContactAddressPeriodEnd() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctAddrPrdEnd()),
					fhirpat.getContactFirstRep().getAddress().getPeriod().getEnd());
			i++;
		}
	}

	@Test
	void testContactGender() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getContactFirstRep().hasGender()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctGender()),
						fhirpat.getContactFirstRep().getGender().toCode());
			}
			i++;
		}
	}

	@Test
	void testContactOrganization() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctOrgnztn()),
					fhirpat.getContactFirstRep().getOrganization().getReference());
			i++;
		}
	}

	@Test
	void testContactPeriodStart() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctPrdStrt()),
					fhirpat.getContactFirstRep().getPeriod().getStart());
			i++;
		}
	}

	@Test
	void testContactPeriodEnd() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCntctPrdEnd()),
					fhirpat.getContactFirstRep().getPeriod().getEnd());
			i++;
		}
	}

	@Test
	void testContactCommunicationLanguageSystem() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCmmnctnLnguageCdgSys()),
					fhirpat.getCommunicationFirstRep().getLanguage().getCodingFirstRep().getSystem());
			i++;
		}
	}

	@Test
	void testContactCommunicationLanguageVersion() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCmmnctnLnguageCdgVrsn()),
					fhirpat.getCommunicationFirstRep().getLanguage().getCodingFirstRep().getVersion());
			i++;
		}
	}

	@Test
	void testContactCommunicationLanguageCode() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCmmnctnLnguageCdgCd()),
					fhirpat.getCommunicationFirstRep().getLanguage().getCodingFirstRep().getCode());
			i++;
		}
	}

	@Test
	void testContactCommunicationLanguageDisplay() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCmmnctnLnguageCdgDsply()),
					fhirpat.getCommunicationFirstRep().getLanguage().getCodingFirstRep().getDisplay());
			i++;
		}
	}

	@Test
	void testContactCommunicationLanguageUserSelected() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCmmnctnLnguageCdgUsrSltd()),
					fhirpat.getCommunicationFirstRep().getLanguage().getCodingFirstRep().getUserSelectedElement()
							.asStringValue());
			i++;
		}
	}

	@Test
	void testContactCommunicationLanguageText() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCmmnctnLnguageTxt()),
					fhirpat.getCommunicationFirstRep().getLanguage().getText());
			i++;
		}
	}

	@Test
	void testContactCommunicationPreferred() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntCmmnctnPreferred()),
					fhirpat.getCommunicationFirstRep().getPreferredElement().asStringValue());
			i++;
		}
	}

	@Test
	void testGeneralPractitioner() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntGeneralPrctitnr()),
					fhirpat.getGeneralPractitionerFirstRep().getReference());
			i++;
		}
	}

	@Test
	void testManagingOrganization() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntManagingOrgnztn()),
					fhirpat.getManagingOrganization().getReference());
			i++;
		}
	}

	@Test
	void testLinkOther() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			Assert.assertEquals(cleanString(dbPatients.get(i).getPntLinkOther()),
					fhirpat.getLinkFirstRep().getOther().getReference());
			i++;
		}
	}

	@Test
	void testLinkType() {
		int i = 0;
		for (Patient fhirpat : fhirPatientList) {
			if (fhirpat.getLinkFirstRep().hasType()) {
				Assert.assertEquals(cleanString(dbPatients.get(i).getPntLinkTyp()),
						fhirpat.getLinkFirstRep().getType().toCode());
			}
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
