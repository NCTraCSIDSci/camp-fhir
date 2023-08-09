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

import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.ResourceType;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import main.java.com.campfhir.service.bidirectionalconversion.PatientBidirectionalConversion;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PatientBiConversionTest {
	@SuppressWarnings("unused")
	private static IGenericClient client;
	private static String patientjson;
	private static FhirContext ctx;
	private static Bundle resource;
	@SuppressWarnings("unused")
	private static PatientBidirectionalConversion pbdc = new PatientBidirectionalConversion();
	private static List<main.java.com.campfhir.model.Patient> databasePatientList = new ArrayList<main.java.com.campfhir.model.Patient>();

	@BeforeAll
	public void setup() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			ParserConfigurationException, SAXException, ParseException {
		ctx = FhirContext.forR4();
		client = ctx.newRestfulGenericClient("http://hapi.fhir.org/baseR4");
		patientjson = new String(Files.readAllBytes(Paths.get("./TESTING_DATA/patient.json")), StandardCharsets.UTF_8);
		resource = (Bundle) ctx.newJsonParser().setPrettyPrint(true).parseResource(patientjson);
		PatientBidirectionalConversion pbdc = new PatientBidirectionalConversion();
		if (resource instanceof Bundle) {
			for (BundleEntryComponent entry : resource.getEntry()) {
				if (entry.getResource().getResourceType() == ResourceType.Patient) {
					databasePatientList.add(pbdc.Patients(Patient.class.cast(entry.getResource())));
				}
			}
		}

	}

	@Test
	void testResourceType() throws StreamReadException, DatabindException, IOException, ParseException {
		if (resource instanceof Bundle) {
			Bundle bundle = (Bundle) resource;
			for (BundleEntryComponent entry : bundle.getEntry()) {
				// Assert.assertEquals(expected, actual);
				Assert.assertEquals("Patient", entry.getResource().getResourceType().toString());
			}
		}
	}

	@Test
	void testResourceId() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getId()),
				resource.getEntry().get(0).getResource().getIdElement().getIdPart());
	}

	@Test
	void testIdentifierUse() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdUse()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getUse().toCode());
	}

	@Test
	void testIdentifierSystem() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdSys()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getSystem());
	}

	@Test
	void testIdentifierValue() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdVl()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getValueElement()
						.getValueAsString());
	}

	@Test
	void testIdentifierPeriodStart() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getPeriod()
				.hasStart()) {
			Assert.assertEquals(databasePatientList.get(0).getPntIdPrdStrt().replaceAll("[\\[\\]\"]", ""),
					ca.uhn.fhir.util.DateUtils.formatDate(Patient.class.cast(resource.getEntry().get(0).getResource())
							.getIdentifier().get(0).getPeriod().getStart()).toString());

		}
	}

	@Test
	void testIdentifierPeriodEnd() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getPeriod()
				.getEnd() != null) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdPrdEnd()),
					ca.uhn.fhir.util.DateUtils.formatDate(Patient.class.cast(resource.getEntry().get(0).getResource())
							.getIdentifier().get(0).getPeriod().getEnd()).toString());
		}
	}

	@Test
	void testIdentifierAssigner() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdAssigner()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getAssigner().getReference());
	}

	@Test
	void testIdentifierTypeCode() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdTypCdgCd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getType()
						.getCodingFirstRep().getCode());
	}

	@Test
	void testIdentifierTypeSystem() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdTypCdgSys()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getType()
						.getCodingFirstRep().getSystem());
	}

	@Test
	void testIdentifierTypeVersion() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdTypCdgVrsn()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getType()
						.getCodingFirstRep().getVersion());
	}

	@Test
	void testIdentifierTypeDisplay() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdTypCdgDsply()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getType()
						.getCodingFirstRep().getDisplay());
	}

	@Test
	void testIdentifierTypeUserSelected() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdTypCdgUsrSltd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getType()
						.getCodingFirstRep().getUserSelectedElement().getValueAsString());
	}

	@Test
	void testIdentifierTypeText() {

		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntIdTypTxt()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getIdentifier().get(0).getType().getText());
	}

	@Test
	void testActive() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntActive()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getActiveElement().getValue());
	}

	@Test
	void testHumanNameUse() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntNmUse()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().getUse().toCode());
	}

	@Test
	void testHumanNameText() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntNmTxt()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().getText());
	}

	@Test
	void testHumanNameFamily() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntNmFmly()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().getFamily());
	}

	@Test
	void testHumanNameGiven() {
		if (cleanString(databasePatientList.get(0).getPntNmGiven()).equals("NULL")) {
			databasePatientList.get(0).setPntNmGiven(null);
		}
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntNmGiven()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().getGiven().get(0).toString());
	}

	@Test
	void testHumanNamePrefix() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().hasPrefix()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntNmPrefix()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().getPrefixAsSingleString());
		}
	}

	@Test
	void testHumanNameSuffix() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().hasSuffix()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntNmSuffix()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().getSuffix());
		}
	}

	@Test
	void testHumanNamePeriodStart() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntNmPrdStrt()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().getPeriod().getStart());
	}

	@Test
	void testHumanNamePeriodEnd() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntNmPrdEnd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getNameFirstRep().getPeriod().getEnd());
	}

	@Test
	void testTelecomSystem() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntTlcmSys()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getTelecomFirstRep().getSystem());
	}

	@Test
	void testTelecomValue() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntTlcmVl()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getTelecomFirstRep().getValue());
	}

	@Test
	void testTelecomUse() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntTlcmUse()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getTelecomFirstRep().getUse().toCode());
	}

	@Test
	void testTelecomRank() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getTelecomFirstRep().hasRank()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntTlcmRnk()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getTelecomFirstRep().getRank());
		}
	}

	@Test
	void testTelecomPeriodStart() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntTlcmPrdStrt()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getTelecomFirstRep().getPeriod().getStart());
	}

	@Test
	void testTelecomPeriodEnd() {

		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntTlcmPrdEnd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getTelecomFirstRep().getPeriod().getEnd());
	}

	@Test
	void testGender() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntGender()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getGender().toCode());
	}

	@Test
	void testBirthDate() {
		Assert.assertEquals(databasePatientList.get(0).getPntBirthDt().replaceAll("[\\[\\]\"]", ""),
				ca.uhn.fhir.util.DateUtils
						.formatDate(Patient.class.cast(resource.getEntry().get(0).getResource()).getBirthDate()));
	}

	@Test
	void testDeceasedBooleanType() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).hasDeceasedBooleanType()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntDeceasedBooleanTyp()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getDeceasedBooleanType().getValueAsString());
		}
	}

	@Test
	void testDeceasedDateType() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).hasDeceasedDateTimeType()) {
			Assert.assertEquals(databasePatientList.get(0).getPntDeceasedDtTimeTyp().replaceAll("[\\[\\]\"]", ""),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getDeceasedDateTimeType()
							.getValueAsString());
		}
	}

	@Test
	void testAddressUse() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrUse()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getUse().toCode());
	}

	@Test
	void testAddressType() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().hasType()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrTyp()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getType().toCode());
		}
	}

	@Test
	void testAddressText() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrTxt()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getText());
	}

	@Test
	void testAddressLine() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().hasLine()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrLine()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getLine().get(0)
							.asStringValue());
		}
	}

	@Test
	void testAddressCity() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrCity()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getCity());
	}

	@Test
	void testAddressDistrict() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrDistrict()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getDistrict());
	}

	@Test
	void testAddressState() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrState()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getState());
	}

	@Test
	void testAddressPostalCode() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrPostalCd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getPostalCode());
	}

	@Test
	void testAddressCountry() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrCntry()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getCountry());
	}

	@Test
	void testAddressPeriodStart() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrPrdStrt()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getPeriod().getStart());
	}

	@Test
	void testAddressPeriodEnd() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntAddrPrdEnd().replaceAll("[\\[\\]\"]", "")),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getAddressFirstRep().getPeriod().getEnd());
	}

	@Test
	void testMaritalStatusCodingSystem() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().hasCoding()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntMaritalStsCdgSys()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().getCoding().get(0).getSystem());
		}
	}

	@Test
	void testMaritalStatusCodingVersion() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().hasCoding()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntMaritalStsCdgVrsn()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().getCoding().get(0).getVersion());
		}
	}

	@Test
	void testMaritalStatusCodingCode() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().hasCoding()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntMaritalStsCdgCd()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().getCoding().get(0).getCode());
		}
	}

	@Test
	void testMaritalStatusCodingDisplay() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().hasCoding()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntMaritalStsCdgDsply()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().getCoding().get(0).getDisplay());
		}
	}

	@Test
	void testMaritalStatusCodingUserSelected() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().hasCoding()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntMaritalStsCdgUsrSltd()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().getCoding().get(0)
							.getUserSelected());
		}
	}

	@Test
	void testMaritalStatusText() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().hasCoding()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntMaritalStsTxt()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().getText());
		}
	}

	@Test
	void testMultipleBirthBoolean() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).hasMultipleBirthBooleanType()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntMultipleBirthBooleanTyp()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getMultipleBirthBooleanType());
		}
	}

	@Test
	void testMultipleBirthInteger() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getMaritalStatus().hasCoding()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntMultipleBirthIntegerTyp()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getMultipleBirthIntegerType());
		}
	}

	@Test
	void testPhotoContentType() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntPhotoCntntTyp()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getPhotoFirstRep().getContentType());
	}

	@Test
	void testPhotoLanguage() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntPhotoLnguage()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getPhotoFirstRep().getLanguage());
	}

	@Test
	void testPhotoData() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntPhotoData()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getPhotoFirstRep().getData());
	}

	@Test
	void testPhotoURL() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntPhotoUrl()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getPhotoFirstRep().getUrl());
	}

	@Test
	void testPhotoSize() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).hasPhoto()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntPhotoSz()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getPhotoFirstRep().getSize());
		}
	}

	@Test
	void testPhotoHash() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntPhotoHash()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getPhotoFirstRep().getHash());
	}

	@Test
	void testPhotoTitle() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntPhotoTtl()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getPhotoFirstRep().getTitle());
	}

	@Test
	void testPhotoCreation() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntPhotoCreation()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getPhotoFirstRep().getCreation());
	}

	@Test
	void testContactRelationshipCodingSystem() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctRltnshipCdgSys()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep()
						.getRelationshipFirstRep().getCodingFirstRep().getSystem());
	}

	@Test
	void testContactRelationshipCodingVersion() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctRltnshipCdgVrsn()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep()
						.getRelationshipFirstRep().getCodingFirstRep().getVersion());
	}

	@Test
	void testContactRelationshipCodingCode() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctRltnshipCdgCd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep()
						.getRelationshipFirstRep().getCodingFirstRep().getCode());
	}

	@Test
	void testContactRelationshipCodingDisplay() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctRltnshipCdgDsply()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep()
						.getRelationshipFirstRep().getCodingFirstRep().getDisplay());
	}

	@Test
	void testContactRelationshipCodingUserSelected() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctRltnshipCdgUsrSltd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep()
						.getRelationshipFirstRep().getCodingFirstRep().getUserSelectedElement().asStringValue());
	}

	@Test
	void testContactNameUse() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctNmUse()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().getUse());
	}

	@Test
	void testContactNameText() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctNmTxt()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().getText());
	}

	@Test
	void testContactNameFamily() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctNmFmly()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().getFamily());
	}

	@Test
	void testContactNameGiven() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctNmGiven()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().getGiven()
						.get(0).asStringValue());
	}

	@Test
	void testContactNamePrefix() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().hasPrefix()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctNmPrefix()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().getPrefix().get(0));
		}
	}

	@Test
	void testContactNameSuffix() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().hasSuffix()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctNmSuffix()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().getSuffix().get(0));
		}
	}

	@Test
	void testContactNamePeriodStart() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctNmPrdStrt()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().getPeriod().getStart());
	}

	@Test
	void testContactNamePeriodEnd() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctNmPrdEnd()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getName().getPeriod().getEnd());
	}

	@Test
	void testContactTelecomSystem() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctTlcmSys()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getTelecomFirstRep()
						.getSystem().toCode());
	}

	@Test
	void testContactTelecomValue() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctTlcmVl()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getTelecomFirstRep().getValue());
	}

	@Test
	void testContactTelecomUse() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctTlcmUse()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getTelecomFirstRep().getUse());
	}

	@Test
	void testContactTelecomRank() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctTlcmRnk()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getTelecomFirstRep()
						.getRankElement().asStringValue());
	}

	@Test
	void testContactTelecomPeriodStart() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctTlcmPrdStrt()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getTelecomFirstRep()
						.getPeriod().getStart());
	}

	@Test
	void testContactTelecomPeriodEnd() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctTlcmPrdEnd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getTelecomFirstRep()
						.getPeriod().getEnd());
	}

	@Test
	void testContactAddressUse() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().hasUse()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrUse()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress()
							.getUse().toCode());
		}
	}

	@Test
	void testContactAddressType() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().hasType()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrTyp()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress()
							.getType().toCode());
		}
	}

	@Test
	void testContactAddressText() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrTxt()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().getText());
	}

	@Test
	void testContactAddressLine() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().hasLine()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrLine()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().getLine().get(0));
		}
	}

	@Test
	void testContactAddressCity() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrCity()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().getCity());
	}

	@Test
	void testContactAddressDistrict() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrDistrict()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().getDistrict());
	}

	@Test
	void testContactAddressState() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrState()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().getState());
	}

	@Test
	void testContactAddressPostalCode() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrPostalCd()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().getPostalCode());
	}

	@Test
	void testContactAddressCountry() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrCntry()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().getCountry());
	}

	@Test
	void testContactAddressPeriodStart() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrPrdStrt()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress()
						.getPeriod().getStart());
	}

	@Test
	void testContactAddressPeriodEnd() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctAddrPrdEnd()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getAddress().getPeriod().getEnd());
	}

	@Test
	void testContactGender() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().hasGender()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctGender()), Patient.class
					.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getGender().toCode());
		}
	}

	@Test
	void testContactOrganization() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctOrgnztn()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getOrganization().getReference());
	}

	@Test
	void testContactPeriodStart() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctPrdStrt()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getPeriod().getStart());
	}

	@Test
	void testContactPeriodEnd() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCntctPrdEnd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getContactFirstRep().getPeriod().getEnd());
	}

	@Test
	void testContactCommunicationLanguageSystem() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCmmnctnLnguageCdgSys()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getCommunicationFirstRep().getLanguage()
						.getCodingFirstRep().getSystem());
	}

	@Test
	void testContactCommunicationLanguageVersion() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCmmnctnLnguageCdgVrsn()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getCommunicationFirstRep().getLanguage()
						.getCodingFirstRep().getVersion());
	}

	@Test
	void testContactCommunicationLanguageCode() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCmmnctnLnguageCdgCd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getCommunicationFirstRep().getLanguage()
						.getCodingFirstRep().getCode());
	}

	@Test
	void testContactCommunicationLanguageDisplay() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCmmnctnLnguageCdgDsply()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getCommunicationFirstRep().getLanguage()
						.getCodingFirstRep().getDisplay());
	}

	@Test
	void testContactCommunicationLanguageUserSelected() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCmmnctnLnguageCdgUsrSltd()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getCommunicationFirstRep().getLanguage()
						.getCodingFirstRep().getUserSelectedElement().asStringValue());
	}

	@Test
	void testContactCommunicationLanguageText() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCmmnctnLnguageTxt()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getCommunicationFirstRep().getLanguage().getText());
	}

	@Test
	void testContactCommunicationPreferred() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntCmmnctnPreferred()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getCommunicationFirstRep()
						.getPreferredElement().asStringValue());
	}

	@Test
	void testGeneralPractitioner() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntGeneralPrctitnr()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getGeneralPractitionerFirstRep().getReference());
	}

	@Test
	void testManagingOrganization() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntManagingOrgnztn()),
				Patient.class.cast(resource.getEntry().get(0).getResource()).getManagingOrganization().getReference());
	}

	@Test
	void testLinkOther() {
		Assert.assertEquals(cleanString(databasePatientList.get(0).getPntLinkOther()), Patient.class
				.cast(resource.getEntry().get(0).getResource()).getLinkFirstRep().getOther().getReference());
	}

	@Test
	void testLinkType() {
		if (Patient.class.cast(resource.getEntry().get(0).getResource()).getLinkFirstRep().hasType()) {
			Assert.assertEquals(cleanString(databasePatientList.get(0).getPntLinkTyp()),
					Patient.class.cast(resource.getEntry().get(0).getResource()).getLinkFirstRep().getType().toCode());
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
