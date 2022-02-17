package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Patient;
public class PatientConversion 
{
	public org.hl7.fhir.r4.model.Patient Patients(Patient p) throws ParseException
	{
		org.hl7.fhir.r4.model.Patient patient = new org.hl7.fhir.r4.model.Patient();
		/******************** Patient_Active ********************************************************************************/
		if(p.getPatientActive() != null) {
			patient.setActive(Boolean.parseBoolean(p.getPatientActive()));
		}

		org.hl7.fhir.r4.model.Address patientaddaddress = patient.addAddress();

		/******************** Patient_Address_City ********************************************************************************/
		if(p.getPatientAddressCity() != null) {
			patientaddaddress.setCity(p.getPatientAddressCity());
		}
		/******************** Patient_Address_Country ********************************************************************************/
		if(p.getPatientAddressCountry() != null) {
			patientaddaddress.setCountry(p.getPatientAddressCountry());
		}
		/******************** Patient_Address_District ********************************************************************************/
		if(p.getPatientAddressDistrict() != null) {
			patientaddaddress.setDistrict(p.getPatientAddressDistrict());
		}
		/******************** Patient_Address_Line ********************************************************************************/
		if(p.getPatientAddressLine() != null) {
			patientaddaddress.addLine(p.getPatientAddressLine());
		}

		org.hl7.fhir.r4.model.Period patientaddaddresssetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddaddress.setPeriod(patientaddaddresssetperiod);

		/******************** Patient_Address_Period_End ********************************************************************************/
		if(p.getPatientAddressPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientAddressPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientAddressPeriodEnddate = PatientAddressPeriodEndsdf.parse(p.getPatientAddressPeriodEnd());
			patientaddaddresssetperiod.setEnd(PatientAddressPeriodEnddate);
		}
		/******************** Patient_Address_Period_Start ********************************************************************************/
		if(p.getPatientAddressPeriodStart() != null) {
			java.text.SimpleDateFormat PatientAddressPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientAddressPeriodStartdate = PatientAddressPeriodStartsdf.parse(p.getPatientAddressPeriodStart());
			patientaddaddresssetperiod.setStart(PatientAddressPeriodStartdate);
		}
		/******************** Patient_Address_PostalCode ********************************************************************************/
		if(p.getPatientAddressPostalCode() != null) {
			patientaddaddress.setPostalCode(p.getPatientAddressPostalCode());
		}
		/******************** Patient_Address_State ********************************************************************************/
		if(p.getPatientAddressState() != null) {
			patientaddaddress.setState(p.getPatientAddressState());
		}
		/******************** Patient_Address_Text ********************************************************************************/
		if(p.getPatientAddressText() != null) {
			patientaddaddress.setText(p.getPatientAddressText());
		}

		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory patientaddaddresssettypeEnumFactory = new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();

		/******************** Patient_Address_Type_Code ********************************************************************************/
		if(p.getPatientAddressTypeCode() != null) {
			patientaddaddress.setType(patientaddaddresssettypeEnumFactory.fromCode(p.getPatientAddressTypeCode()));

		}

		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory patientaddaddresssetuseEnumFactory = new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();

		/******************** Patient_Address_Use_Code ********************************************************************************/
		if(p.getPatientAddressUseCode() != null) {
			patientaddaddress.setUse(patientaddaddresssetuseEnumFactory.fromCode(p.getPatientAddressUseCode()));

		}
		/******************** Patient_BirthDate ********************************************************************************/
		if(p.getPatientBirthDate() != null) {
			java.text.SimpleDateFormat PatientBirthDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientBirthDatedate = PatientBirthDatesdf.parse(p.getPatientBirthDate());
			patient.setBirthDate(PatientBirthDatedate);
		}

		org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent patientaddcommunication = patient.addCommunication();


		org.hl7.fhir.r4.model.CodeableConcept patientaddcommunicationsetlanguage = new org.hl7.fhir.r4.model.CodeableConcept();
		patientaddcommunication.setLanguage(patientaddcommunicationsetlanguage);


		org.hl7.fhir.r4.model.Coding patientaddcommunicationsetlanguageaddcoding = patientaddcommunicationsetlanguage.addCoding();

		/******************** Patient_Communication_Language_Coding_Code ********************************************************************************/
		if(p.getPatientCommunicationLanguageCodingCode() != null) {
			patientaddcommunicationsetlanguageaddcoding.setCode(p.getPatientCommunicationLanguageCodingCode());
		}
		/******************** Patient_Communication_Language_Coding_Display ********************************************************************************/
		if(p.getPatientCommunicationLanguageCodingDisplay() != null) {
			patientaddcommunicationsetlanguageaddcoding.setDisplay(p.getPatientCommunicationLanguageCodingDisplay());
		}
		/******************** Patient_Communication_Language_Coding_System ********************************************************************************/
		if(p.getPatientCommunicationLanguageCodingSystem() != null) {
			patientaddcommunicationsetlanguageaddcoding.setSystem(p.getPatientCommunicationLanguageCodingSystem());
		}
		/******************** Patient_Communication_Language_Coding_UserSelected ********************************************************************************/
		if(p.getPatientCommunicationLanguageCodingUserSelected() != null) {
			patientaddcommunicationsetlanguageaddcoding.setUserSelected(Boolean.parseBoolean(p.getPatientCommunicationLanguageCodingUserSelected()));
		}
		/******************** Patient_Communication_Language_Coding_Version ********************************************************************************/
		if(p.getPatientCommunicationLanguageCodingVersion() != null) {
			patientaddcommunicationsetlanguageaddcoding.setVersion(p.getPatientCommunicationLanguageCodingVersion());
		}
		/******************** Patient_Communication_Language_Text ********************************************************************************/
		if(p.getPatientCommunicationLanguageText() != null) {
			patientaddcommunicationsetlanguage.setText(p.getPatientCommunicationLanguageText());
		}
		/******************** Patient_Communication_Preferred ********************************************************************************/
		if(p.getPatientCommunicationPreferred() != null) {
			patientaddcommunication.setPreferred(Boolean.parseBoolean(p.getPatientCommunicationPreferred()));
		}

		org.hl7.fhir.r4.model.Patient.ContactComponent patientaddcontact = patient.addContact();


		org.hl7.fhir.r4.model.Address patientaddcontactsetaddress = new org.hl7.fhir.r4.model.Address();
		patientaddcontact.setAddress(patientaddcontactsetaddress);

		/******************** Patient_Contact_Address_City ********************************************************************************/
		if(p.getPatientContactAddressCity() != null) {
			patientaddcontactsetaddress.setCity(p.getPatientContactAddressCity());
		}
		/******************** Patient_Contact_Address_Country ********************************************************************************/
		if(p.getPatientContactAddressCountry() != null) {
			patientaddcontactsetaddress.setCountry(p.getPatientContactAddressCountry());
		}
		/******************** Patient_Contact_Address_District ********************************************************************************/
		if(p.getPatientContactAddressDistrict() != null) {
			patientaddcontactsetaddress.setDistrict(p.getPatientContactAddressDistrict());
		}
		/******************** Patient_Contact_Address_Line ********************************************************************************/
		if(p.getPatientContactAddressLine() != null) {
			patientaddcontactsetaddress.addLine(p.getPatientContactAddressLine());
		}

		org.hl7.fhir.r4.model.Period patientaddcontactsetaddresssetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddcontactsetaddress.setPeriod(patientaddcontactsetaddresssetperiod);

		/******************** Patient_Contact_Address_Period_End ********************************************************************************/
		if(p.getPatientContactAddressPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientContactAddressPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactAddressPeriodEnddate = PatientContactAddressPeriodEndsdf.parse(p.getPatientContactAddressPeriodEnd());
			patientaddcontactsetaddresssetperiod.setEnd(PatientContactAddressPeriodEnddate);
		}
		/******************** Patient_Contact_Address_Period_Start ********************************************************************************/
		if(p.getPatientContactAddressPeriodStart() != null) {
			java.text.SimpleDateFormat PatientContactAddressPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactAddressPeriodStartdate = PatientContactAddressPeriodStartsdf.parse(p.getPatientContactAddressPeriodStart());
			patientaddcontactsetaddresssetperiod.setStart(PatientContactAddressPeriodStartdate);
		}
		/******************** Patient_Contact_Address_PostalCode ********************************************************************************/
		if(p.getPatientContactAddressPostalCode() != null) {
			patientaddcontactsetaddress.setPostalCode(p.getPatientContactAddressPostalCode());
		}
		/******************** Patient_Contact_Address_State ********************************************************************************/
		if(p.getPatientContactAddressState() != null) {
			patientaddcontactsetaddress.setState(p.getPatientContactAddressState());
		}
		/******************** Patient_Contact_Address_Text ********************************************************************************/
		if(p.getPatientContactAddressText() != null) {
			patientaddcontactsetaddress.setText(p.getPatientContactAddressText());
		}

		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory patientaddcontactsetaddresssettypeEnumFactory = new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();

		/******************** Patient_Contact_Address_Type_Code ********************************************************************************/
		if(p.getPatientContactAddressTypeCode() != null) {
			patientaddcontactsetaddress.setType(patientaddcontactsetaddresssettypeEnumFactory.fromCode(p.getPatientContactAddressTypeCode()));

		}

		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory patientaddcontactsetaddresssetuseEnumFactory = new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();

		/******************** Patient_Contact_Address_Use_Code ********************************************************************************/
		if(p.getPatientContactAddressUseCode() != null) {
			patientaddcontactsetaddress.setUse(patientaddcontactsetaddresssetuseEnumFactory.fromCode(p.getPatientContactAddressUseCode()));

		}

		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory patientaddcontactsetgenderEnumFactory = new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();

		/******************** Patient_Contact_Gender_Code ********************************************************************************/
		if(p.getPatientContactGenderCode() != null) {
			patientaddcontact.setGender(patientaddcontactsetgenderEnumFactory.fromCode(p.getPatientContactGenderCode()));

		}

		org.hl7.fhir.r4.model.HumanName patientaddcontactsetname = new org.hl7.fhir.r4.model.HumanName();
		patientaddcontact.setName(patientaddcontactsetname);

		/******************** Patient_Contact_Name_Family ********************************************************************************/
		if(p.getPatientContactNameFamily() != null) {
			patientaddcontactsetname.setFamily(p.getPatientContactNameFamily());
		}
		/******************** Patient_Contact_Name_Given ********************************************************************************/
		if(p.getPatientContactNameGiven() != null) {
			patientaddcontactsetname.addGiven(p.getPatientContactNameGiven());
		}

		org.hl7.fhir.r4.model.Period patientaddcontactsetnamesetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddcontactsetname.setPeriod(patientaddcontactsetnamesetperiod);

		/******************** Patient_Contact_Name_Period_End ********************************************************************************/
		if(p.getPatientContactNamePeriodEnd() != null) {
			java.text.SimpleDateFormat PatientContactNamePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactNamePeriodEnddate = PatientContactNamePeriodEndsdf.parse(p.getPatientContactNamePeriodEnd());
			patientaddcontactsetnamesetperiod.setEnd(PatientContactNamePeriodEnddate);
		}
		/******************** Patient_Contact_Name_Period_Start ********************************************************************************/
		if(p.getPatientContactNamePeriodStart() != null) {
			java.text.SimpleDateFormat PatientContactNamePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactNamePeriodStartdate = PatientContactNamePeriodStartsdf.parse(p.getPatientContactNamePeriodStart());
			patientaddcontactsetnamesetperiod.setStart(PatientContactNamePeriodStartdate);
		}
		/******************** Patient_Contact_Name_Prefix ********************************************************************************/
		if(p.getPatientContactNamePrefix() != null) {
			patientaddcontactsetname.addPrefix(p.getPatientContactNamePrefix());
		}
		/******************** Patient_Contact_Name_Suffix ********************************************************************************/
		if(p.getPatientContactNameSuffix() != null) {
			patientaddcontactsetname.addSuffix(p.getPatientContactNameSuffix());
		}
		/******************** Patient_Contact_Name_Text ********************************************************************************/
		if(p.getPatientContactNameText() != null) {
			patientaddcontactsetname.setText(p.getPatientContactNameText());
		}

		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory patientaddcontactsetnamesetuseEnumFactory = new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();

		/******************** Patient_Contact_Name_Use_Code ********************************************************************************/
		if(p.getPatientContactNameUseCode() != null) {
			patientaddcontactsetname.setUse(patientaddcontactsetnamesetuseEnumFactory.fromCode(p.getPatientContactNameUseCode()));

		}
		/******************** Patient_Contact_Organization ********************************************************************************/
		if(p.getPatientContactOrganization() != null) {
			org.hl7.fhir.r4.model.Reference PatientContactOrganizationref = new org.hl7.fhir.r4.model.Reference();
			patientaddcontact.setOrganization(PatientContactOrganizationref.setReference(p.getPatientContactOrganization()));
		}

		org.hl7.fhir.r4.model.Period patientaddcontactsetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddcontact.setPeriod(patientaddcontactsetperiod);

		/******************** Patient_Contact_Period_End ********************************************************************************/
		if(p.getPatientContactPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientContactPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactPeriodEnddate = PatientContactPeriodEndsdf.parse(p.getPatientContactPeriodEnd());
			patientaddcontactsetperiod.setEnd(PatientContactPeriodEnddate);
		}
		/******************** Patient_Contact_Period_Start ********************************************************************************/
		if(p.getPatientContactPeriodStart() != null) {
			java.text.SimpleDateFormat PatientContactPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactPeriodStartdate = PatientContactPeriodStartsdf.parse(p.getPatientContactPeriodStart());
			patientaddcontactsetperiod.setStart(PatientContactPeriodStartdate);
		}

		org.hl7.fhir.r4.model.CodeableConcept patientaddcontactaddrelationship = patientaddcontact.addRelationship();


		org.hl7.fhir.r4.model.Coding patientaddcontactaddrelationshipaddcoding = patientaddcontactaddrelationship.addCoding();

		/******************** Patient_Contact_Relationship_Coding_Code ********************************************************************************/
		if(p.getPatientContactRelationshipCodingCode() != null) {
			patientaddcontactaddrelationshipaddcoding.setCode(p.getPatientContactRelationshipCodingCode());
		}
		/******************** Patient_Contact_Relationship_Coding_Display ********************************************************************************/
		if(p.getPatientContactRelationshipCodingDisplay() != null) {
			patientaddcontactaddrelationshipaddcoding.setDisplay(p.getPatientContactRelationshipCodingDisplay());
		}
		/******************** Patient_Contact_Relationship_Coding_System ********************************************************************************/
		if(p.getPatientContactRelationshipCodingSystem() != null) {
			patientaddcontactaddrelationshipaddcoding.setSystem(p.getPatientContactRelationshipCodingSystem());
		}
		/******************** Patient_Contact_Relationship_Coding_UserSelected ********************************************************************************/
		if(p.getPatientContactRelationshipCodingUserSelected() != null) {
			patientaddcontactaddrelationshipaddcoding.setUserSelected(Boolean.parseBoolean(p.getPatientContactRelationshipCodingUserSelected()));
		}
		/******************** Patient_Contact_Relationship_Coding_Version ********************************************************************************/
		if(p.getPatientContactRelationshipCodingVersion() != null) {
			patientaddcontactaddrelationshipaddcoding.setVersion(p.getPatientContactRelationshipCodingVersion());
		}
		/******************** Patient_Contact_Relationship_Text ********************************************************************************/
		if(p.getPatientContactRelationshipText() != null) {
			patientaddcontactaddrelationship.setText(p.getPatientContactRelationshipText());
		}

		org.hl7.fhir.r4.model.ContactPoint patientaddcontactaddtelecom = patientaddcontact.addTelecom();


		org.hl7.fhir.r4.model.Period patientaddcontactaddtelecomsetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddcontactaddtelecom.setPeriod(patientaddcontactaddtelecomsetperiod);

		/******************** Patient_Contact_Telecom_Period_End ********************************************************************************/
		if(p.getPatientContactTelecomPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientContactTelecomPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactTelecomPeriodEnddate = PatientContactTelecomPeriodEndsdf.parse(p.getPatientContactTelecomPeriodEnd());
			patientaddcontactaddtelecomsetperiod.setEnd(PatientContactTelecomPeriodEnddate);
		}
		/******************** Patient_Contact_Telecom_Period_Start ********************************************************************************/
		if(p.getPatientContactTelecomPeriodStart() != null) {
			java.text.SimpleDateFormat PatientContactTelecomPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientContactTelecomPeriodStartdate = PatientContactTelecomPeriodStartsdf.parse(p.getPatientContactTelecomPeriodStart());
			patientaddcontactaddtelecomsetperiod.setStart(PatientContactTelecomPeriodStartdate);
		}
		/******************** Patient_Contact_Telecom_Rank ********************************************************************************/
		if(p.getPatientContactTelecomRank() != null) {
			patientaddcontactaddtelecom.setRank(Integer.parseInt(p.getPatientContactTelecomRank()));
		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory patientaddcontactaddtelecomsetsystemEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();

		/******************** Patient_Contact_Telecom_System_Code ********************************************************************************/
		if(p.getPatientContactTelecomSystemCode() != null) {
			patientaddcontactaddtelecom.setSystem(patientaddcontactaddtelecomsetsystemEnumFactory.fromCode(p.getPatientContactTelecomSystemCode()));

		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory patientaddcontactaddtelecomsetuseEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();

		/******************** Patient_Contact_Telecom_Use_Code ********************************************************************************/
		if(p.getPatientContactTelecomUseCode() != null) {
			patientaddcontactaddtelecom.setUse(patientaddcontactaddtelecomsetuseEnumFactory.fromCode(p.getPatientContactTelecomUseCode()));

		}
		/******************** Patient_Contact_Telecom_Value ********************************************************************************/
		if(p.getPatientContactTelecomValue() != null) {
			patientaddcontactaddtelecom.setValue(p.getPatientContactTelecomValue());
		}
		/******************** Patient_Deceased ********************************************************************************/
		if(p.getPatientDeceased() != null) {
			patient.setDeceased(new org.hl7.fhir.r4.model.StringType(p.getPatientDeceased()));
		}

		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory patientsetgenderEnumFactory = new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();

		/******************** Patient_Gender_Code ********************************************************************************/
		if(p.getPatientGenderCode() != null) {
			patient.setGender(patientsetgenderEnumFactory.fromCode(p.getPatientGenderCode()));

		}
		/******************** Patient_GeneralPractitioner ********************************************************************************/
		if(p.getPatientGeneralPractitioner() != null) {
			org.hl7.fhir.r4.model.Reference PatientGeneralPractitionerref = new org.hl7.fhir.r4.model.Reference();
			patient.addGeneralPractitioner(PatientGeneralPractitionerref.setReference(p.getPatientGeneralPractitioner()));
		}

		org.hl7.fhir.r4.model.Identifier patientaddidentifier = patient.addIdentifier();

		/******************** Patient_Identifier_Assigner ********************************************************************************/
		if(p.getPatientIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference PatientIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			patientaddidentifier.setAssigner(PatientIdentifierAssignerref.setReference(p.getPatientIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period patientaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddidentifier.setPeriod(patientaddidentifiersetperiod);

		/******************** Patient_Identifier_Period_End ********************************************************************************/
		if(p.getPatientIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientIdentifierPeriodEnddate = PatientIdentifierPeriodEndsdf.parse(p.getPatientIdentifierPeriodEnd());
			patientaddidentifiersetperiod.setEnd(PatientIdentifierPeriodEnddate);
		}
		/******************** Patient_Identifier_Period_Start ********************************************************************************/
		if(p.getPatientIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat PatientIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientIdentifierPeriodStartdate = PatientIdentifierPeriodStartsdf.parse(p.getPatientIdentifierPeriodStart());
			patientaddidentifiersetperiod.setStart(PatientIdentifierPeriodStartdate);
		}
		/******************** Patient_Identifier_System ********************************************************************************/
		if(p.getPatientIdentifierSystem() != null) {
			patientaddidentifier.setSystem(p.getPatientIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept patientaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		patientaddidentifier.setType(patientaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding patientaddidentifiersettypeaddcoding = patientaddidentifiersettype.addCoding();

		/******************** Patient_Identifier_Type_Coding_Code ********************************************************************************/
		if(p.getPatientIdentifierTypeCodingCode() != null) {
			patientaddidentifiersettypeaddcoding.setCode(p.getPatientIdentifierTypeCodingCode());
		}
		/******************** Patient_Identifier_Type_Coding_Display ********************************************************************************/
		if(p.getPatientIdentifierTypeCodingDisplay() != null) {
			patientaddidentifiersettypeaddcoding.setDisplay(p.getPatientIdentifierTypeCodingDisplay());
		}
		/******************** Patient_Identifier_Type_Coding_System ********************************************************************************/
		if(p.getPatientIdentifierTypeCodingSystem() != null) {
			patientaddidentifiersettypeaddcoding.setSystem(p.getPatientIdentifierTypeCodingSystem());
		}
		/******************** Patient_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(p.getPatientIdentifierTypeCodingUserSelected() != null) {
			patientaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPatientIdentifierTypeCodingUserSelected()));
		}
		/******************** Patient_Identifier_Type_Coding_Version ********************************************************************************/
		if(p.getPatientIdentifierTypeCodingVersion() != null) {
			patientaddidentifiersettypeaddcoding.setVersion(p.getPatientIdentifierTypeCodingVersion());
		}
		/******************** Patient_Identifier_Type_Text ********************************************************************************/
		if(p.getPatientIdentifierTypeText() != null) {
			patientaddidentifiersettype.setText(p.getPatientIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory patientaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Patient_Identifier_Use_Code ********************************************************************************/
		if(p.getPatientIdentifierUseCode() != null) {
			patientaddidentifier.setUse(patientaddidentifiersetuseEnumFactory.fromCode(p.getPatientIdentifierUseCode()));

		}
		/******************** Patient_Identifier_Value ********************************************************************************/
		if(p.getPatientIdentifierValue() != null) {
			patientaddidentifier.setValue(p.getPatientIdentifierValue());
		}

		org.hl7.fhir.r4.model.Patient.PatientLinkComponent patientaddlink = patient.addLink();

		/******************** Patient_Link_Other ********************************************************************************/
		if(p.getPatientLinkOther() != null) {
			org.hl7.fhir.r4.model.Reference PatientLinkOtherref = new org.hl7.fhir.r4.model.Reference();
			patientaddlink.setOther(PatientLinkOtherref.setReference(p.getPatientLinkOther()));
		}

		org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory patientaddlinksettypeEnumFactory = new org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory();

		/******************** Patient_Link_Type_Code ********************************************************************************/
		if(p.getPatientLinkTypeCode() != null) {
			patientaddlink.setType(patientaddlinksettypeEnumFactory.fromCode(p.getPatientLinkTypeCode()));

		}
		/******************** Patient_ManagingOrganization ********************************************************************************/
		if(p.getPatientManagingOrganization() != null) {
			org.hl7.fhir.r4.model.Reference PatientManagingOrganizationref = new org.hl7.fhir.r4.model.Reference();
			patient.setManagingOrganization(PatientManagingOrganizationref.setReference(p.getPatientManagingOrganization()));
		}

		org.hl7.fhir.r4.model.CodeableConcept patientsetmaritalstatus = new org.hl7.fhir.r4.model.CodeableConcept();
		patient.setMaritalStatus(patientsetmaritalstatus);


		org.hl7.fhir.r4.model.Coding patientsetmaritalstatusaddcoding = patientsetmaritalstatus.addCoding();

		/******************** Patient_MaritalStatus_Coding_Code ********************************************************************************/
		if(p.getPatientMaritalStatusCodingCode() != null) {
			patientsetmaritalstatusaddcoding.setCode(p.getPatientMaritalStatusCodingCode());
		}
		/******************** Patient_MaritalStatus_Coding_Display ********************************************************************************/
		if(p.getPatientMaritalStatusCodingDisplay() != null) {
			patientsetmaritalstatusaddcoding.setDisplay(p.getPatientMaritalStatusCodingDisplay());
		}
		/******************** Patient_MaritalStatus_Coding_System ********************************************************************************/
		if(p.getPatientMaritalStatusCodingSystem() != null) {
			patientsetmaritalstatusaddcoding.setSystem(p.getPatientMaritalStatusCodingSystem());
		}
		/******************** Patient_MaritalStatus_Coding_UserSelected ********************************************************************************/
		if(p.getPatientMaritalStatusCodingUserSelected() != null) {
			patientsetmaritalstatusaddcoding.setUserSelected(Boolean.parseBoolean(p.getPatientMaritalStatusCodingUserSelected()));
		}
		/******************** Patient_MaritalStatus_Coding_Version ********************************************************************************/
		if(p.getPatientMaritalStatusCodingVersion() != null) {
			patientsetmaritalstatusaddcoding.setVersion(p.getPatientMaritalStatusCodingVersion());
		}
		/******************** Patient_MaritalStatus_Text ********************************************************************************/
		if(p.getPatientMaritalStatusText() != null) {
			patientsetmaritalstatus.setText(p.getPatientMaritalStatusText());
		}
		/******************** Patient_MultipleBirth ********************************************************************************/
		if(p.getPatientMultipleBirth() != null) {
			patient.setMultipleBirth(new org.hl7.fhir.r4.model.StringType(p.getPatientMultipleBirth()));
		}

		org.hl7.fhir.r4.model.HumanName patientaddname = patient.addName();

		/******************** Patient_Name_Family ********************************************************************************/
		if(p.getPatientNameFamily() != null) {
			patientaddname.setFamily(p.getPatientNameFamily());
		}
		/******************** Patient_Name_Given ********************************************************************************/
		if(p.getPatientNameGiven() != null) {
			patientaddname.addGiven(p.getPatientNameGiven());
		}

		org.hl7.fhir.r4.model.Period patientaddnamesetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddname.setPeriod(patientaddnamesetperiod);

		/******************** Patient_Name_Period_End ********************************************************************************/
		if(p.getPatientNamePeriodEnd() != null) {
			java.text.SimpleDateFormat PatientNamePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientNamePeriodEnddate = PatientNamePeriodEndsdf.parse(p.getPatientNamePeriodEnd());
			patientaddnamesetperiod.setEnd(PatientNamePeriodEnddate);
		}
		/******************** Patient_Name_Period_Start ********************************************************************************/
		if(p.getPatientNamePeriodStart() != null) {
			java.text.SimpleDateFormat PatientNamePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientNamePeriodStartdate = PatientNamePeriodStartsdf.parse(p.getPatientNamePeriodStart());
			patientaddnamesetperiod.setStart(PatientNamePeriodStartdate);
		}
		/******************** Patient_Name_Prefix ********************************************************************************/
		if(p.getPatientNamePrefix() != null) {
			patientaddname.addPrefix(p.getPatientNamePrefix());
		}
		/******************** Patient_Name_Suffix ********************************************************************************/
		if(p.getPatientNameSuffix() != null) {
			patientaddname.addSuffix(p.getPatientNameSuffix());
		}
		/******************** Patient_Name_Text ********************************************************************************/
		if(p.getPatientNameText() != null) {
			patientaddname.setText(p.getPatientNameText());
		}

		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory patientaddnamesetuseEnumFactory = new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();

		/******************** Patient_Name_Use_Code ********************************************************************************/
		if(p.getPatientNameUseCode() != null) {
			patientaddname.setUse(patientaddnamesetuseEnumFactory.fromCode(p.getPatientNameUseCode()));

		}

		org.hl7.fhir.r4.model.Attachment patientaddphoto = patient.addPhoto();

		/******************** Patient_Photo_ContentType ********************************************************************************/
		if(p.getPatientPhotoContentType() != null) {
			patientaddphoto.setContentType(p.getPatientPhotoContentType());
		}
		/******************** Patient_Photo_Creation ********************************************************************************/
		if(p.getPatientPhotoCreation() != null) {
			java.text.SimpleDateFormat PatientPhotoCreationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientPhotoCreationdate = PatientPhotoCreationsdf.parse(p.getPatientPhotoCreation());
			patientaddphoto.setCreation(PatientPhotoCreationdate);
		}
		/******************** Patient_Photo_Data ********************************************************************************/
		if(p.getPatientPhotoData() != null) {
			patientaddphoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPatientPhotoData()));
		}
		/******************** Patient_Photo_Hash ********************************************************************************/
		if(p.getPatientPhotoHash() != null) {
			patientaddphoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPatientPhotoHash()));
		}
		/******************** Patient_Photo_Language ********************************************************************************/
		if(p.getPatientPhotoLanguage() != null) {
			patientaddphoto.setLanguage(p.getPatientPhotoLanguage());
		}
		/******************** Patient_Photo_Size ********************************************************************************/
		if(p.getPatientPhotoSize() != null) {
			patientaddphoto.setSize(Integer.parseInt(p.getPatientPhotoSize()));
		}
		/******************** Patient_Photo_Title ********************************************************************************/
		if(p.getPatientPhotoTitle() != null) {
			patientaddphoto.setTitle(p.getPatientPhotoTitle());
		}
		/******************** Patient_Photo_Url ********************************************************************************/
		if(p.getPatientPhotoUrl() != null) {
			patientaddphoto.setUrl(p.getPatientPhotoUrl());
		}

		org.hl7.fhir.r4.model.ContactPoint patientaddtelecom = patient.addTelecom();


		org.hl7.fhir.r4.model.Period patientaddtelecomsetperiod = new org.hl7.fhir.r4.model.Period();
		patientaddtelecom.setPeriod(patientaddtelecomsetperiod);

		/******************** Patient_Telecom_Period_End ********************************************************************************/
		if(p.getPatientTelecomPeriodEnd() != null) {
			java.text.SimpleDateFormat PatientTelecomPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientTelecomPeriodEnddate = PatientTelecomPeriodEndsdf.parse(p.getPatientTelecomPeriodEnd());
			patientaddtelecomsetperiod.setEnd(PatientTelecomPeriodEnddate);
		}
		/******************** Patient_Telecom_Period_Start ********************************************************************************/
		if(p.getPatientTelecomPeriodStart() != null) {
			java.text.SimpleDateFormat PatientTelecomPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PatientTelecomPeriodStartdate = PatientTelecomPeriodStartsdf.parse(p.getPatientTelecomPeriodStart());
			patientaddtelecomsetperiod.setStart(PatientTelecomPeriodStartdate);
		}
		/******************** Patient_Telecom_Rank ********************************************************************************/
		if(p.getPatientTelecomRank() != null) {
			patientaddtelecom.setRank(Integer.parseInt(p.getPatientTelecomRank()));
		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory patientaddtelecomsetsystemEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();

		/******************** Patient_Telecom_System_Code ********************************************************************************/
		if(p.getPatientTelecomSystemCode() != null) {
			patientaddtelecom.setSystem(patientaddtelecomsetsystemEnumFactory.fromCode(p.getPatientTelecomSystemCode()));

		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory patientaddtelecomsetuseEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();

		/******************** Patient_Telecom_Use_Code ********************************************************************************/
		if(p.getPatientTelecomUseCode() != null) {
			patientaddtelecom.setUse(patientaddtelecomsetuseEnumFactory.fromCode(p.getPatientTelecomUseCode()));

		}
		return patient;
	}
}
