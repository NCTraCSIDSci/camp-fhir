package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Practitioner;
public class PractitionerConversion 
{
	public org.hl7.fhir.r4.model.Practitioner Practitioners(Practitioner p) throws ParseException
	{
		org.hl7.fhir.r4.model.Practitioner practitioner = new org.hl7.fhir.r4.model.Practitioner();
		/******************** Practitioner_Active ********************************************************************************/
		if(p.getPractitionerActive() != null) {
			practitioner.setActive(Boolean.parseBoolean(p.getPractitionerActive()));
		}

		org.hl7.fhir.r4.model.Address practitioneraddaddress = practitioner.addAddress();

		/******************** Practitioner_Address_City ********************************************************************************/
		if(p.getPractitionerAddressCity() != null) {
			practitioneraddaddress.setCity(p.getPractitionerAddressCity());
		}
		/******************** Practitioner_Address_Country ********************************************************************************/
		if(p.getPractitionerAddressCountry() != null) {
			practitioneraddaddress.setCountry(p.getPractitionerAddressCountry());
		}
		/******************** Practitioner_Address_District ********************************************************************************/
		if(p.getPractitionerAddressDistrict() != null) {
			practitioneraddaddress.setDistrict(p.getPractitionerAddressDistrict());
		}
		/******************** Practitioner_Address_Line ********************************************************************************/
		if(p.getPractitionerAddressLine() != null) {
			practitioneraddaddress.addLine(p.getPractitionerAddressLine());
		}

		org.hl7.fhir.r4.model.Period practitioneraddaddresssetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddaddress.setPeriod(practitioneraddaddresssetperiod);

		/******************** Practitioner_Address_Period_End ********************************************************************************/
		if(p.getPractitionerAddressPeriodEnd() != null) {
			java.text.SimpleDateFormat PractitionerAddressPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerAddressPeriodEnddate = PractitionerAddressPeriodEndsdf.parse(p.getPractitionerAddressPeriodEnd());
			practitioneraddaddresssetperiod.setEnd(PractitionerAddressPeriodEnddate);
		}
		/******************** Practitioner_Address_Period_Start ********************************************************************************/
		if(p.getPractitionerAddressPeriodStart() != null) {
			java.text.SimpleDateFormat PractitionerAddressPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerAddressPeriodStartdate = PractitionerAddressPeriodStartsdf.parse(p.getPractitionerAddressPeriodStart());
			practitioneraddaddresssetperiod.setStart(PractitionerAddressPeriodStartdate);
		}
		/******************** Practitioner_Address_PostalCode ********************************************************************************/
		if(p.getPractitionerAddressPostalCode() != null) {
			practitioneraddaddress.setPostalCode(p.getPractitionerAddressPostalCode());
		}
		/******************** Practitioner_Address_State ********************************************************************************/
		if(p.getPractitionerAddressState() != null) {
			practitioneraddaddress.setState(p.getPractitionerAddressState());
		}
		/******************** Practitioner_Address_Text ********************************************************************************/
		if(p.getPractitionerAddressText() != null) {
			practitioneraddaddress.setText(p.getPractitionerAddressText());
		}

		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory practitioneraddaddresssettypeEnumFactory = new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();

		/******************** Practitioner_Address_Type_Code ********************************************************************************/
		if(p.getPractitionerAddressTypeCode() != null) {
			practitioneraddaddress.setType(practitioneraddaddresssettypeEnumFactory.fromCode(p.getPractitionerAddressTypeCode()));

		}

		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory practitioneraddaddresssetuseEnumFactory = new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();

		/******************** Practitioner_Address_Use_Code ********************************************************************************/
		if(p.getPractitionerAddressUseCode() != null) {
			practitioneraddaddress.setUse(practitioneraddaddresssetuseEnumFactory.fromCode(p.getPractitionerAddressUseCode()));

		}
		/******************** Practitioner_BirthDate ********************************************************************************/
		if(p.getPractitionerBirthDate() != null) {
			java.text.SimpleDateFormat PractitionerBirthDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerBirthDatedate = PractitionerBirthDatesdf.parse(p.getPractitionerBirthDate());
			practitioner.setBirthDate(PractitionerBirthDatedate);
		}

		org.hl7.fhir.r4.model.CodeableConcept practitioneraddcommunication = practitioner.addCommunication();


		org.hl7.fhir.r4.model.Coding practitioneraddcommunicationaddcoding = practitioneraddcommunication.addCoding();

		/******************** Practitioner_Communication_Coding_Code ********************************************************************************/
		if(p.getPractitionerCommunicationCodingCode() != null) {
			practitioneraddcommunicationaddcoding.setCode(p.getPractitionerCommunicationCodingCode());
		}
		/******************** Practitioner_Communication_Coding_Display ********************************************************************************/
		if(p.getPractitionerCommunicationCodingDisplay() != null) {
			practitioneraddcommunicationaddcoding.setDisplay(p.getPractitionerCommunicationCodingDisplay());
		}
		/******************** Practitioner_Communication_Coding_System ********************************************************************************/
		if(p.getPractitionerCommunicationCodingSystem() != null) {
			practitioneraddcommunicationaddcoding.setSystem(p.getPractitionerCommunicationCodingSystem());
		}
		/******************** Practitioner_Communication_Coding_UserSelected ********************************************************************************/
		if(p.getPractitionerCommunicationCodingUserSelected() != null) {
			practitioneraddcommunicationaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractitionerCommunicationCodingUserSelected()));
		}
		/******************** Practitioner_Communication_Coding_Version ********************************************************************************/
		if(p.getPractitionerCommunicationCodingVersion() != null) {
			practitioneraddcommunicationaddcoding.setVersion(p.getPractitionerCommunicationCodingVersion());
		}
		/******************** Practitioner_Communication_Text ********************************************************************************/
		if(p.getPractitionerCommunicationText() != null) {
			practitioneraddcommunication.setText(p.getPractitionerCommunicationText());
		}

		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory practitionersetgenderEnumFactory = new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();

		/******************** Practitioner_Gender_Code ********************************************************************************/
		if(p.getPractitionerGenderCode() != null) {
			practitioner.setGender(practitionersetgenderEnumFactory.fromCode(p.getPractitionerGenderCode()));

		}

		org.hl7.fhir.r4.model.Identifier practitioneraddidentifier = practitioner.addIdentifier();

		/******************** Practitioner_Identifier_Assigner ********************************************************************************/
		if(p.getPractitionerIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference PractitionerIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			practitioneraddidentifier.setAssigner(PractitionerIdentifierAssignerref.setReference(p.getPractitionerIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period practitioneraddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddidentifier.setPeriod(practitioneraddidentifiersetperiod);

		/******************** Practitioner_Identifier_Period_End ********************************************************************************/
		if(p.getPractitionerIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat PractitionerIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerIdentifierPeriodEnddate = PractitionerIdentifierPeriodEndsdf.parse(p.getPractitionerIdentifierPeriodEnd());
			practitioneraddidentifiersetperiod.setEnd(PractitionerIdentifierPeriodEnddate);
		}
		/******************** Practitioner_Identifier_Period_Start ********************************************************************************/
		if(p.getPractitionerIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat PractitionerIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerIdentifierPeriodStartdate = PractitionerIdentifierPeriodStartsdf.parse(p.getPractitionerIdentifierPeriodStart());
			practitioneraddidentifiersetperiod.setStart(PractitionerIdentifierPeriodStartdate);
		}
		/******************** Practitioner_Identifier_System ********************************************************************************/
		if(p.getPractitionerIdentifierSystem() != null) {
			practitioneraddidentifier.setSystem(p.getPractitionerIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept practitioneraddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneraddidentifier.setType(practitioneraddidentifiersettype);


		org.hl7.fhir.r4.model.Coding practitioneraddidentifiersettypeaddcoding = practitioneraddidentifiersettype.addCoding();

		/******************** Practitioner_Identifier_Type_Coding_Code ********************************************************************************/
		if(p.getPractitionerIdentifierTypeCodingCode() != null) {
			practitioneraddidentifiersettypeaddcoding.setCode(p.getPractitionerIdentifierTypeCodingCode());
		}
		/******************** Practitioner_Identifier_Type_Coding_Display ********************************************************************************/
		if(p.getPractitionerIdentifierTypeCodingDisplay() != null) {
			practitioneraddidentifiersettypeaddcoding.setDisplay(p.getPractitionerIdentifierTypeCodingDisplay());
		}
		/******************** Practitioner_Identifier_Type_Coding_System ********************************************************************************/
		if(p.getPractitionerIdentifierTypeCodingSystem() != null) {
			practitioneraddidentifiersettypeaddcoding.setSystem(p.getPractitionerIdentifierTypeCodingSystem());
		}
		/******************** Practitioner_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(p.getPractitionerIdentifierTypeCodingUserSelected() != null) {
			practitioneraddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractitionerIdentifierTypeCodingUserSelected()));
		}
		/******************** Practitioner_Identifier_Type_Coding_Version ********************************************************************************/
		if(p.getPractitionerIdentifierTypeCodingVersion() != null) {
			practitioneraddidentifiersettypeaddcoding.setVersion(p.getPractitionerIdentifierTypeCodingVersion());
		}
		/******************** Practitioner_Identifier_Type_Text ********************************************************************************/
		if(p.getPractitionerIdentifierTypeText() != null) {
			practitioneraddidentifiersettype.setText(p.getPractitionerIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory practitioneraddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Practitioner_Identifier_Use_Code ********************************************************************************/
		if(p.getPractitionerIdentifierUseCode() != null) {
			practitioneraddidentifier.setUse(practitioneraddidentifiersetuseEnumFactory.fromCode(p.getPractitionerIdentifierUseCode()));

		}
		/******************** Practitioner_Identifier_Value ********************************************************************************/
		if(p.getPractitionerIdentifierValue() != null) {
			practitioneraddidentifier.setValue(p.getPractitionerIdentifierValue());
		}

		org.hl7.fhir.r4.model.HumanName practitioneraddname = practitioner.addName();

		/******************** Practitioner_Name_Family ********************************************************************************/
		if(p.getPractitionerNameFamily() != null) {
			practitioneraddname.setFamily(p.getPractitionerNameFamily());
		}
		/******************** Practitioner_Name_Given ********************************************************************************/
		if(p.getPractitionerNameGiven() != null) {
			practitioneraddname.addGiven(p.getPractitionerNameGiven());
		}

		org.hl7.fhir.r4.model.Period practitioneraddnamesetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddname.setPeriod(practitioneraddnamesetperiod);

		/******************** Practitioner_Name_Period_End ********************************************************************************/
		if(p.getPractitionerNamePeriodEnd() != null) {
			java.text.SimpleDateFormat PractitionerNamePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerNamePeriodEnddate = PractitionerNamePeriodEndsdf.parse(p.getPractitionerNamePeriodEnd());
			practitioneraddnamesetperiod.setEnd(PractitionerNamePeriodEnddate);
		}
		/******************** Practitioner_Name_Period_Start ********************************************************************************/
		if(p.getPractitionerNamePeriodStart() != null) {
			java.text.SimpleDateFormat PractitionerNamePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerNamePeriodStartdate = PractitionerNamePeriodStartsdf.parse(p.getPractitionerNamePeriodStart());
			practitioneraddnamesetperiod.setStart(PractitionerNamePeriodStartdate);
		}
		/******************** Practitioner_Name_Prefix ********************************************************************************/
		if(p.getPractitionerNamePrefix() != null) {
			practitioneraddname.addPrefix(p.getPractitionerNamePrefix());
		}
		/******************** Practitioner_Name_Suffix ********************************************************************************/
		if(p.getPractitionerNameSuffix() != null) {
			practitioneraddname.addSuffix(p.getPractitionerNameSuffix());
		}
		/******************** Practitioner_Name_Text ********************************************************************************/
		if(p.getPractitionerNameText() != null) {
			practitioneraddname.setText(p.getPractitionerNameText());
		}

		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory practitioneraddnamesetuseEnumFactory = new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();

		/******************** Practitioner_Name_Use_Code ********************************************************************************/
		if(p.getPractitionerNameUseCode() != null) {
			practitioneraddname.setUse(practitioneraddnamesetuseEnumFactory.fromCode(p.getPractitionerNameUseCode()));

		}

		org.hl7.fhir.r4.model.Attachment practitioneraddphoto = practitioner.addPhoto();

		/******************** Practitioner_Photo_ContentType ********************************************************************************/
		if(p.getPractitionerPhotoContentType() != null) {
			practitioneraddphoto.setContentType(p.getPractitionerPhotoContentType());
		}
		/******************** Practitioner_Photo_Creation ********************************************************************************/
		if(p.getPractitionerPhotoCreation() != null) {
			java.text.SimpleDateFormat PractitionerPhotoCreationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerPhotoCreationdate = PractitionerPhotoCreationsdf.parse(p.getPractitionerPhotoCreation());
			practitioneraddphoto.setCreation(PractitionerPhotoCreationdate);
		}
		/******************** Practitioner_Photo_Data ********************************************************************************/
		if(p.getPractitionerPhotoData() != null) {
			practitioneraddphoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPractitionerPhotoData()));
		}
		/******************** Practitioner_Photo_Hash ********************************************************************************/
		if(p.getPractitionerPhotoHash() != null) {
			practitioneraddphoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPractitionerPhotoHash()));
		}
		/******************** Practitioner_Photo_Language ********************************************************************************/
		if(p.getPractitionerPhotoLanguage() != null) {
			practitioneraddphoto.setLanguage(p.getPractitionerPhotoLanguage());
		}
		/******************** Practitioner_Photo_Size ********************************************************************************/
		if(p.getPractitionerPhotoSize() != null) {
			practitioneraddphoto.setSize(Integer.parseInt(p.getPractitionerPhotoSize()));
		}
		/******************** Practitioner_Photo_Title ********************************************************************************/
		if(p.getPractitionerPhotoTitle() != null) {
			practitioneraddphoto.setTitle(p.getPractitionerPhotoTitle());
		}
		/******************** Practitioner_Photo_Url ********************************************************************************/
		if(p.getPractitionerPhotoUrl() != null) {
			practitioneraddphoto.setUrl(p.getPractitionerPhotoUrl());
		}

		org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent practitioneraddqualification = practitioner.addQualification();


		org.hl7.fhir.r4.model.CodeableConcept practitioneraddqualificationsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneraddqualification.setCode(practitioneraddqualificationsetcode);


		org.hl7.fhir.r4.model.Coding practitioneraddqualificationsetcodeaddcoding = practitioneraddqualificationsetcode.addCoding();

		/******************** Practitioner_Qualification_Code_Coding_Code ********************************************************************************/
		if(p.getPractitionerQualificationCodeCodingCode() != null) {
			practitioneraddqualificationsetcodeaddcoding.setCode(p.getPractitionerQualificationCodeCodingCode());
		}
		/******************** Practitioner_Qualification_Code_Coding_Display ********************************************************************************/
		if(p.getPractitionerQualificationCodeCodingDisplay() != null) {
			practitioneraddqualificationsetcodeaddcoding.setDisplay(p.getPractitionerQualificationCodeCodingDisplay());
		}
		/******************** Practitioner_Qualification_Code_Coding_System ********************************************************************************/
		if(p.getPractitionerQualificationCodeCodingSystem() != null) {
			practitioneraddqualificationsetcodeaddcoding.setSystem(p.getPractitionerQualificationCodeCodingSystem());
		}
		/******************** Practitioner_Qualification_Code_Coding_UserSelected ********************************************************************************/
		if(p.getPractitionerQualificationCodeCodingUserSelected() != null) {
			practitioneraddqualificationsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractitionerQualificationCodeCodingUserSelected()));
		}
		/******************** Practitioner_Qualification_Code_Coding_Version ********************************************************************************/
		if(p.getPractitionerQualificationCodeCodingVersion() != null) {
			practitioneraddqualificationsetcodeaddcoding.setVersion(p.getPractitionerQualificationCodeCodingVersion());
		}
		/******************** Practitioner_Qualification_Code_Text ********************************************************************************/
		if(p.getPractitionerQualificationCodeText() != null) {
			practitioneraddqualificationsetcode.setText(p.getPractitionerQualificationCodeText());
		}

		org.hl7.fhir.r4.model.Identifier practitioneraddqualificationaddidentifier = practitioneraddqualification.addIdentifier();

		/******************** Practitioner_Qualification_Identifier_Assigner ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference PractitionerQualificationIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			practitioneraddqualificationaddidentifier.setAssigner(PractitionerQualificationIdentifierAssignerref.setReference(p.getPractitionerQualificationIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period practitioneraddqualificationaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddqualificationaddidentifier.setPeriod(practitioneraddqualificationaddidentifiersetperiod);

		/******************** Practitioner_Qualification_Identifier_Period_End ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat PractitionerQualificationIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerQualificationIdentifierPeriodEnddate = PractitionerQualificationIdentifierPeriodEndsdf.parse(p.getPractitionerQualificationIdentifierPeriodEnd());
			practitioneraddqualificationaddidentifiersetperiod.setEnd(PractitionerQualificationIdentifierPeriodEnddate);
		}
		/******************** Practitioner_Qualification_Identifier_Period_Start ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat PractitionerQualificationIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerQualificationIdentifierPeriodStartdate = PractitionerQualificationIdentifierPeriodStartsdf.parse(p.getPractitionerQualificationIdentifierPeriodStart());
			practitioneraddqualificationaddidentifiersetperiod.setStart(PractitionerQualificationIdentifierPeriodStartdate);
		}
		/******************** Practitioner_Qualification_Identifier_System ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierSystem() != null) {
			practitioneraddqualificationaddidentifier.setSystem(p.getPractitionerQualificationIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept practitioneraddqualificationaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneraddqualificationaddidentifier.setType(practitioneraddqualificationaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding practitioneraddqualificationaddidentifiersettypeaddcoding = practitioneraddqualificationaddidentifiersettype.addCoding();

		/******************** Practitioner_Qualification_Identifier_Type_Coding_Code ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierTypeCodingCode() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setCode(p.getPractitionerQualificationIdentifierTypeCodingCode());
		}
		/******************** Practitioner_Qualification_Identifier_Type_Coding_Display ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierTypeCodingDisplay() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setDisplay(p.getPractitionerQualificationIdentifierTypeCodingDisplay());
		}
		/******************** Practitioner_Qualification_Identifier_Type_Coding_System ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierTypeCodingSystem() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setSystem(p.getPractitionerQualificationIdentifierTypeCodingSystem());
		}
		/******************** Practitioner_Qualification_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierTypeCodingUserSelected() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractitionerQualificationIdentifierTypeCodingUserSelected()));
		}
		/******************** Practitioner_Qualification_Identifier_Type_Coding_Version ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierTypeCodingVersion() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setVersion(p.getPractitionerQualificationIdentifierTypeCodingVersion());
		}
		/******************** Practitioner_Qualification_Identifier_Type_Text ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierTypeText() != null) {
			practitioneraddqualificationaddidentifiersettype.setText(p.getPractitionerQualificationIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory practitioneraddqualificationaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Practitioner_Qualification_Identifier_Use_Code ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierUseCode() != null) {
			practitioneraddqualificationaddidentifier.setUse(practitioneraddqualificationaddidentifiersetuseEnumFactory.fromCode(p.getPractitionerQualificationIdentifierUseCode()));

		}
		/******************** Practitioner_Qualification_Identifier_Value ********************************************************************************/
		if(p.getPractitionerQualificationIdentifierValue() != null) {
			practitioneraddqualificationaddidentifier.setValue(p.getPractitionerQualificationIdentifierValue());
		}
		/******************** Practitioner_Qualification_Issuer ********************************************************************************/
		if(p.getPractitionerQualificationIssuer() != null) {
			org.hl7.fhir.r4.model.Reference PractitionerQualificationIssuerref = new org.hl7.fhir.r4.model.Reference();
			practitioneraddqualification.setIssuer(PractitionerQualificationIssuerref.setReference(p.getPractitionerQualificationIssuer()));
		}

		org.hl7.fhir.r4.model.Period practitioneraddqualificationsetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddqualification.setPeriod(practitioneraddqualificationsetperiod);

		/******************** Practitioner_Qualification_Period_End ********************************************************************************/
		if(p.getPractitionerQualificationPeriodEnd() != null) {
			java.text.SimpleDateFormat PractitionerQualificationPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerQualificationPeriodEnddate = PractitionerQualificationPeriodEndsdf.parse(p.getPractitionerQualificationPeriodEnd());
			practitioneraddqualificationsetperiod.setEnd(PractitionerQualificationPeriodEnddate);
		}
		/******************** Practitioner_Qualification_Period_Start ********************************************************************************/
		if(p.getPractitionerQualificationPeriodStart() != null) {
			java.text.SimpleDateFormat PractitionerQualificationPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerQualificationPeriodStartdate = PractitionerQualificationPeriodStartsdf.parse(p.getPractitionerQualificationPeriodStart());
			practitioneraddqualificationsetperiod.setStart(PractitionerQualificationPeriodStartdate);
		}

		org.hl7.fhir.r4.model.ContactPoint practitioneraddtelecom = practitioner.addTelecom();


		org.hl7.fhir.r4.model.Period practitioneraddtelecomsetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddtelecom.setPeriod(practitioneraddtelecomsetperiod);

		/******************** Practitioner_Telecom_Period_End ********************************************************************************/
		if(p.getPractitionerTelecomPeriodEnd() != null) {
			java.text.SimpleDateFormat PractitionerTelecomPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerTelecomPeriodEnddate = PractitionerTelecomPeriodEndsdf.parse(p.getPractitionerTelecomPeriodEnd());
			practitioneraddtelecomsetperiod.setEnd(PractitionerTelecomPeriodEnddate);
		}
		/******************** Practitioner_Telecom_Period_Start ********************************************************************************/
		if(p.getPractitionerTelecomPeriodStart() != null) {
			java.text.SimpleDateFormat PractitionerTelecomPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractitionerTelecomPeriodStartdate = PractitionerTelecomPeriodStartsdf.parse(p.getPractitionerTelecomPeriodStart());
			practitioneraddtelecomsetperiod.setStart(PractitionerTelecomPeriodStartdate);
		}
		/******************** Practitioner_Telecom_Rank ********************************************************************************/
		if(p.getPractitionerTelecomRank() != null) {
			practitioneraddtelecom.setRank(Integer.parseInt(p.getPractitionerTelecomRank()));
		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory practitioneraddtelecomsetsystemEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();

		/******************** Practitioner_Telecom_System_Code ********************************************************************************/
		if(p.getPractitionerTelecomSystemCode() != null) {
			practitioneraddtelecom.setSystem(practitioneraddtelecomsetsystemEnumFactory.fromCode(p.getPractitionerTelecomSystemCode()));

		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory practitioneraddtelecomsetuseEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();

		/******************** Practitioner_Telecom_Use_Code ********************************************************************************/
		if(p.getPractitionerTelecomUseCode() != null) {
			practitioneraddtelecom.setUse(practitioneraddtelecomsetuseEnumFactory.fromCode(p.getPractitionerTelecomUseCode()));

		}
		return practitioner;
	}
}
