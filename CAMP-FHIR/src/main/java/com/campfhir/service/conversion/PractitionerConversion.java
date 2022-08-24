package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Practitioner;
public class PractitionerConversion 
{
	public org.hl7.fhir.r4.model.Practitioner Practitioners(Practitioner p) throws ParseException
	{
		org.hl7.fhir.r4.model.Practitioner practitioner = new org.hl7.fhir.r4.model.Practitioner();

		/******************** id ********************************************************************************/
		practitioner.setId(p.getId());

		/******************** Pract_Active ********************************************************************************/
		if(p.getPractActive() != null) {
			practitioner.setActive(Boolean.parseBoolean(p.getPractActive()));
		}

		org.hl7.fhir.r4.model.Address practitioneraddaddress = practitioner.addAddress();

		/******************** Pract_Address_City ********************************************************************************/
		if(p.getPractAddressCity() != null) {
			practitioneraddaddress.setCity(p.getPractAddressCity());
		}
		/******************** Pract_Address_Country ********************************************************************************/
		if(p.getPractAddressCountry() != null) {
			practitioneraddaddress.setCountry(p.getPractAddressCountry());
		}
		/******************** Pract_Address_District ********************************************************************************/
		if(p.getPractAddressDistrict() != null) {
			practitioneraddaddress.setDistrict(p.getPractAddressDistrict());
		}
		/******************** Pract_Address_Line ********************************************************************************/
		if(p.getPractAddressLine() != null) {
			practitioneraddaddress.addLine(p.getPractAddressLine());
		}

		org.hl7.fhir.r4.model.Period practitioneraddaddresssetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddaddress.setPeriod(practitioneraddaddresssetperiod);

		/******************** Pract_Address_Period_End ********************************************************************************/
		if(p.getPractAddressPeriodEnd() != null) {
			java.text.SimpleDateFormat PractAddressPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractAddressPeriodEnddate = PractAddressPeriodEndsdf.parse(p.getPractAddressPeriodEnd());
			practitioneraddaddresssetperiod.setEnd(PractAddressPeriodEnddate);
		}
		/******************** Pract_Address_Period_Start ********************************************************************************/
		if(p.getPractAddressPeriodStart() != null) {
			java.text.SimpleDateFormat PractAddressPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractAddressPeriodStartdate = PractAddressPeriodStartsdf.parse(p.getPractAddressPeriodStart());
			practitioneraddaddresssetperiod.setStart(PractAddressPeriodStartdate);
		}
		/******************** Pract_Address_PostalCode ********************************************************************************/
		if(p.getPractAddressPostalCode() != null) {
			practitioneraddaddress.setPostalCode(p.getPractAddressPostalCode());
		}
		/******************** Pract_Address_State ********************************************************************************/
		if(p.getPractAddressState() != null) {
			practitioneraddaddress.setState(p.getPractAddressState());
		}
		/******************** Pract_Address_Text ********************************************************************************/
		if(p.getPractAddressText() != null) {
			practitioneraddaddress.setText(p.getPractAddressText());
		}

		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory practitioneraddaddresssettypeEnumFactory = new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();

		/******************** Pract_Address_Type_Code ********************************************************************************/
		if(p.getPractAddressTypeCode() != null) {
			practitioneraddaddress.setType(practitioneraddaddresssettypeEnumFactory.fromCode(p.getPractAddressTypeCode()));

		}

		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory practitioneraddaddresssetuseEnumFactory = new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();

		/******************** Pract_Address_Use_Code ********************************************************************************/
		if(p.getPractAddressUseCode() != null) {
			practitioneraddaddress.setUse(practitioneraddaddresssetuseEnumFactory.fromCode(p.getPractAddressUseCode()));

		}
		/******************** Pract_BirthDate ********************************************************************************/
		if(p.getPractBirthDate() != null) {
			java.text.SimpleDateFormat PractBirthDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractBirthDatedate = PractBirthDatesdf.parse(p.getPractBirthDate());
			practitioner.setBirthDate(PractBirthDatedate);
		}

		org.hl7.fhir.r4.model.CodeableConcept practitioneraddcommunication = practitioner.addCommunication();


		org.hl7.fhir.r4.model.Coding practitioneraddcommunicationaddcoding = practitioneraddcommunication.addCoding();

		/******************** Pract_Commn_Coding_Code ********************************************************************************/
		if(p.getPractCommnCodingCode() != null) {
			practitioneraddcommunicationaddcoding.setCode(p.getPractCommnCodingCode());
		}
		/******************** Pract_Commn_Coding_Display ********************************************************************************/
		if(p.getPractCommnCodingDisplay() != null) {
			practitioneraddcommunicationaddcoding.setDisplay(p.getPractCommnCodingDisplay());
		}
		/******************** Pract_Commn_Coding_System ********************************************************************************/
		if(p.getPractCommnCodingSystem() != null) {
			practitioneraddcommunicationaddcoding.setSystem(p.getPractCommnCodingSystem());
		}
		/******************** Pract_Commn_Coding_Usrslt ********************************************************************************/
		if(p.getPractCommnCodingUsrslt() != null) {
			practitioneraddcommunicationaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractCommnCodingUsrslt()));
		}
		/******************** Pract_Commn_Coding_Version ********************************************************************************/
		if(p.getPractCommnCodingVersion() != null) {
			practitioneraddcommunicationaddcoding.setVersion(p.getPractCommnCodingVersion());
		}
		/******************** Pract_Commn_Text ********************************************************************************/
		if(p.getPractCommnText() != null) {
			practitioneraddcommunication.setText(p.getPractCommnText());
		}

		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory practitionersetgenderEnumFactory = new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();

		/******************** Pract_Gender_Code ********************************************************************************/
		if(p.getPractGenderCode() != null) {
			practitioner.setGender(practitionersetgenderEnumFactory.fromCode(p.getPractGenderCode()));

		}

		org.hl7.fhir.r4.model.Identifier practitioneraddidentifier = practitioner.addIdentifier();

		/******************** Pract_Id_Assigner ********************************************************************************/
		if(p.getPractIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference PractIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			practitioneraddidentifier.setAssigner(PractIdAssignerref.setReference(p.getPractIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period practitioneraddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddidentifier.setPeriod(practitioneraddidentifiersetperiod);

		/******************** Pract_Id_Period_End ********************************************************************************/
		if(p.getPractIdPeriodEnd() != null) {
			java.text.SimpleDateFormat PractIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractIdPeriodEnddate = PractIdPeriodEndsdf.parse(p.getPractIdPeriodEnd());
			practitioneraddidentifiersetperiod.setEnd(PractIdPeriodEnddate);
		}
		/******************** Pract_Id_Period_Start ********************************************************************************/
		if(p.getPractIdPeriodStart() != null) {
			java.text.SimpleDateFormat PractIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractIdPeriodStartdate = PractIdPeriodStartsdf.parse(p.getPractIdPeriodStart());
			practitioneraddidentifiersetperiod.setStart(PractIdPeriodStartdate);
		}
		/******************** Pract_Id_System ********************************************************************************/
		if(p.getPractIdSystem() != null) {
			practitioneraddidentifier.setSystem(p.getPractIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept practitioneraddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneraddidentifier.setType(practitioneraddidentifiersettype);


		org.hl7.fhir.r4.model.Coding practitioneraddidentifiersettypeaddcoding = practitioneraddidentifiersettype.addCoding();

		/******************** Pract_Id_Type_Coding_Code ********************************************************************************/
		if(p.getPractIdTypeCodingCode() != null) {
			practitioneraddidentifiersettypeaddcoding.setCode(p.getPractIdTypeCodingCode());
		}
		/******************** Pract_Id_Type_Coding_Display ********************************************************************************/
		if(p.getPractIdTypeCodingDisplay() != null) {
			practitioneraddidentifiersettypeaddcoding.setDisplay(p.getPractIdTypeCodingDisplay());
		}
		/******************** Pract_Id_Type_Coding_System ********************************************************************************/
		if(p.getPractIdTypeCodingSystem() != null) {
			practitioneraddidentifiersettypeaddcoding.setSystem(p.getPractIdTypeCodingSystem());
		}
		/******************** Pract_Id_Type_Coding_Usrslt ********************************************************************************/
		if(p.getPractIdTypeCodingUsrslt() != null) {
			practitioneraddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractIdTypeCodingUsrslt()));
		}
		/******************** Pract_Id_Type_Coding_Version ********************************************************************************/
		if(p.getPractIdTypeCodingVersion() != null) {
			practitioneraddidentifiersettypeaddcoding.setVersion(p.getPractIdTypeCodingVersion());
		}
		/******************** Pract_Id_Type_Text ********************************************************************************/
		if(p.getPractIdTypeText() != null) {
			practitioneraddidentifiersettype.setText(p.getPractIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory practitioneraddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Pract_Id_Use_Code ********************************************************************************/
		if(p.getPractIdUseCode() != null) {
			practitioneraddidentifier.setUse(practitioneraddidentifiersetuseEnumFactory.fromCode(p.getPractIdUseCode()));

		}
		/******************** Pract_Id_Value ********************************************************************************/
		if(p.getPractIdValue() != null) {
			practitioneraddidentifier.setValue(p.getPractIdValue());
		}

		org.hl7.fhir.r4.model.HumanName practitioneraddname = practitioner.addName();

		/******************** Pract_Name_Family ********************************************************************************/
		if(p.getPractNameFamily() != null) {
			practitioneraddname.setFamily(p.getPractNameFamily());
		}
		/******************** Pract_Name_Given ********************************************************************************/
		if(p.getPractNameGiven() != null) {
			practitioneraddname.addGiven(p.getPractNameGiven());
		}

		org.hl7.fhir.r4.model.Period practitioneraddnamesetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddname.setPeriod(practitioneraddnamesetperiod);

		/******************** Pract_Name_Period_End ********************************************************************************/
		if(p.getPractNamePeriodEnd() != null) {
			java.text.SimpleDateFormat PractNamePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractNamePeriodEnddate = PractNamePeriodEndsdf.parse(p.getPractNamePeriodEnd());
			practitioneraddnamesetperiod.setEnd(PractNamePeriodEnddate);
		}
		/******************** Pract_Name_Period_Start ********************************************************************************/
		if(p.getPractNamePeriodStart() != null) {
			java.text.SimpleDateFormat PractNamePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractNamePeriodStartdate = PractNamePeriodStartsdf.parse(p.getPractNamePeriodStart());
			practitioneraddnamesetperiod.setStart(PractNamePeriodStartdate);
		}
		/******************** Pract_Name_Prefix ********************************************************************************/
		if(p.getPractNamePrefix() != null) {
			practitioneraddname.addPrefix(p.getPractNamePrefix());
		}
		/******************** Pract_Name_Suffix ********************************************************************************/
		if(p.getPractNameSuffix() != null) {
			practitioneraddname.addSuffix(p.getPractNameSuffix());
		}
		/******************** Pract_Name_Text ********************************************************************************/
		if(p.getPractNameText() != null) {
			practitioneraddname.setText(p.getPractNameText());
		}

		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory practitioneraddnamesetuseEnumFactory = new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();

		/******************** Pract_Name_Use_Code ********************************************************************************/
		if(p.getPractNameUseCode() != null) {
			practitioneraddname.setUse(practitioneraddnamesetuseEnumFactory.fromCode(p.getPractNameUseCode()));

		}

		org.hl7.fhir.r4.model.Attachment practitioneraddphoto = practitioner.addPhoto();

		/******************** Pract_Photo_ContentType ********************************************************************************/
		if(p.getPractPhotoContentType() != null) {
			practitioneraddphoto.setContentType(p.getPractPhotoContentType());
		}
		/******************** Pract_Photo_Creation ********************************************************************************/
		if(p.getPractPhotoCreation() != null) {
			java.text.SimpleDateFormat PractPhotoCreationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractPhotoCreationdate = PractPhotoCreationsdf.parse(p.getPractPhotoCreation());
			practitioneraddphoto.setCreation(PractPhotoCreationdate);
		}
		/******************** Pract_Photo_Data ********************************************************************************/
		if(p.getPractPhotoData() != null) {
			practitioneraddphoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPractPhotoData()));
		}
		/******************** Pract_Photo_Hash ********************************************************************************/
		if(p.getPractPhotoHash() != null) {
			practitioneraddphoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPractPhotoHash()));
		}
		/******************** Pract_Photo_Lang ********************************************************************************/
		if(p.getPractPhotoLang() != null) {
			practitioneraddphoto.setLanguage(p.getPractPhotoLang());
		}
		/******************** Pract_Photo_Size ********************************************************************************/
		if(p.getPractPhotoSize() != null) {
			practitioneraddphoto.setSize(Integer.parseInt(p.getPractPhotoSize()));
		}
		/******************** Pract_Photo_Title ********************************************************************************/
		if(p.getPractPhotoTitle() != null) {
			practitioneraddphoto.setTitle(p.getPractPhotoTitle());
		}
		/******************** Pract_Photo_Url ********************************************************************************/
		if(p.getPractPhotoUrl() != null) {
			practitioneraddphoto.setUrl(p.getPractPhotoUrl());
		}

		org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent practitioneraddqualification = practitioner.addQualification();


		org.hl7.fhir.r4.model.CodeableConcept practitioneraddqualificationsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneraddqualification.setCode(practitioneraddqualificationsetcode);


		org.hl7.fhir.r4.model.Coding practitioneraddqualificationsetcodeaddcoding = practitioneraddqualificationsetcode.addCoding();

		/******************** Pract_Qualification_Code_Coding_Code ********************************************************************************/
		if(p.getPractQualificationCodeCodingCode() != null) {
			practitioneraddqualificationsetcodeaddcoding.setCode(p.getPractQualificationCodeCodingCode());
		}
		/******************** Pract_Qualification_Code_Coding_Display ********************************************************************************/
		if(p.getPractQualificationCodeCodingDisplay() != null) {
			practitioneraddqualificationsetcodeaddcoding.setDisplay(p.getPractQualificationCodeCodingDisplay());
		}
		/******************** Pract_Qualification_Code_Coding_System ********************************************************************************/
		if(p.getPractQualificationCodeCodingSystem() != null) {
			practitioneraddqualificationsetcodeaddcoding.setSystem(p.getPractQualificationCodeCodingSystem());
		}
		/******************** Pract_Qualification_Code_Coding_Usrslt ********************************************************************************/
		if(p.getPractQualificationCodeCodingUsrslt() != null) {
			practitioneraddqualificationsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractQualificationCodeCodingUsrslt()));
		}
		/******************** Pract_Qualification_Code_Coding_Version ********************************************************************************/
		if(p.getPractQualificationCodeCodingVersion() != null) {
			practitioneraddqualificationsetcodeaddcoding.setVersion(p.getPractQualificationCodeCodingVersion());
		}
		/******************** Pract_Qualification_Code_Text ********************************************************************************/
		if(p.getPractQualificationCodeText() != null) {
			practitioneraddqualificationsetcode.setText(p.getPractQualificationCodeText());
		}

		org.hl7.fhir.r4.model.Identifier practitioneraddqualificationaddidentifier = practitioneraddqualification.addIdentifier();

		/******************** Pract_Qualification_Id_Assigner ********************************************************************************/
		if(p.getPractQualificationIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference PractQualificationIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			practitioneraddqualificationaddidentifier.setAssigner(PractQualificationIdAssignerref.setReference(p.getPractQualificationIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period practitioneraddqualificationaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddqualificationaddidentifier.setPeriod(practitioneraddqualificationaddidentifiersetperiod);

		/******************** Pract_Qualification_Id_Period_End ********************************************************************************/
		if(p.getPractQualificationIdPeriodEnd() != null) {
			java.text.SimpleDateFormat PractQualificationIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractQualificationIdPeriodEnddate = PractQualificationIdPeriodEndsdf.parse(p.getPractQualificationIdPeriodEnd());
			practitioneraddqualificationaddidentifiersetperiod.setEnd(PractQualificationIdPeriodEnddate);
		}
		/******************** Pract_Qualification_Id_Period_Start ********************************************************************************/
		if(p.getPractQualificationIdPeriodStart() != null) {
			java.text.SimpleDateFormat PractQualificationIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractQualificationIdPeriodStartdate = PractQualificationIdPeriodStartsdf.parse(p.getPractQualificationIdPeriodStart());
			practitioneraddqualificationaddidentifiersetperiod.setStart(PractQualificationIdPeriodStartdate);
		}
		/******************** Pract_Qualification_Id_System ********************************************************************************/
		if(p.getPractQualificationIdSystem() != null) {
			practitioneraddqualificationaddidentifier.setSystem(p.getPractQualificationIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept practitioneraddqualificationaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneraddqualificationaddidentifier.setType(practitioneraddqualificationaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding practitioneraddqualificationaddidentifiersettypeaddcoding = practitioneraddqualificationaddidentifiersettype.addCoding();

		/******************** Pract_Qualification_Id_Type_Coding_Code ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingCode() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setCode(p.getPractQualificationIdTypeCodingCode());
		}
		/******************** Pract_Qualification_Id_Type_Coding_Display ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingDisplay() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setDisplay(p.getPractQualificationIdTypeCodingDisplay());
		}
		/******************** Pract_Qualification_Id_Type_Coding_System ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingSystem() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setSystem(p.getPractQualificationIdTypeCodingSystem());
		}
		/******************** Pract_Qualification_Id_Type_Coding_Usrslt ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingUsrslt() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getPractQualificationIdTypeCodingUsrslt()));
		}
		/******************** Pract_Qualification_Id_Type_Coding_Version ********************************************************************************/
		if(p.getPractQualificationIdTypeCodingVersion() != null) {
			practitioneraddqualificationaddidentifiersettypeaddcoding.setVersion(p.getPractQualificationIdTypeCodingVersion());
		}
		/******************** Pract_Qualification_Id_Type_Text ********************************************************************************/
		if(p.getPractQualificationIdTypeText() != null) {
			practitioneraddqualificationaddidentifiersettype.setText(p.getPractQualificationIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory practitioneraddqualificationaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Pract_Qualification_Id_Use_Code ********************************************************************************/
		if(p.getPractQualificationIdUseCode() != null) {
			practitioneraddqualificationaddidentifier.setUse(practitioneraddqualificationaddidentifiersetuseEnumFactory.fromCode(p.getPractQualificationIdUseCode()));

		}
		/******************** Pract_Qualification_Id_Value ********************************************************************************/
		if(p.getPractQualificationIdValue() != null) {
			practitioneraddqualificationaddidentifier.setValue(p.getPractQualificationIdValue());
		}
		/******************** Pract_Qualification_Issuer ********************************************************************************/
		if(p.getPractQualificationIssuer() != null) {
			org.hl7.fhir.r4.model.Reference PractQualificationIssuerref = new org.hl7.fhir.r4.model.Reference();
			practitioneraddqualification.setIssuer(PractQualificationIssuerref.setReference(p.getPractQualificationIssuer()));
		}

		org.hl7.fhir.r4.model.Period practitioneraddqualificationsetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddqualification.setPeriod(practitioneraddqualificationsetperiod);

		/******************** Pract_Qualification_Period_End ********************************************************************************/
		if(p.getPractQualificationPeriodEnd() != null) {
			java.text.SimpleDateFormat PractQualificationPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractQualificationPeriodEnddate = PractQualificationPeriodEndsdf.parse(p.getPractQualificationPeriodEnd());
			practitioneraddqualificationsetperiod.setEnd(PractQualificationPeriodEnddate);
		}
		/******************** Pract_Qualification_Period_Start ********************************************************************************/
		if(p.getPractQualificationPeriodStart() != null) {
			java.text.SimpleDateFormat PractQualificationPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractQualificationPeriodStartdate = PractQualificationPeriodStartsdf.parse(p.getPractQualificationPeriodStart());
			practitioneraddqualificationsetperiod.setStart(PractQualificationPeriodStartdate);
		}

		org.hl7.fhir.r4.model.ContactPoint practitioneraddtelecom = practitioner.addTelecom();


		org.hl7.fhir.r4.model.Period practitioneraddtelecomsetperiod = new org.hl7.fhir.r4.model.Period();
		practitioneraddtelecom.setPeriod(practitioneraddtelecomsetperiod);

		/******************** Pract_Telecom_Period_End ********************************************************************************/
		if(p.getPractTelecomPeriodEnd() != null) {
			java.text.SimpleDateFormat PractTelecomPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractTelecomPeriodEnddate = PractTelecomPeriodEndsdf.parse(p.getPractTelecomPeriodEnd());
			practitioneraddtelecomsetperiod.setEnd(PractTelecomPeriodEnddate);
		}
		/******************** Pract_Telecom_Period_Start ********************************************************************************/
		if(p.getPractTelecomPeriodStart() != null) {
			java.text.SimpleDateFormat PractTelecomPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PractTelecomPeriodStartdate = PractTelecomPeriodStartsdf.parse(p.getPractTelecomPeriodStart());
			practitioneraddtelecomsetperiod.setStart(PractTelecomPeriodStartdate);
		}
		/******************** Pract_Telecom_Rank ********************************************************************************/
		if(p.getPractTelecomRank() != null) {
			practitioneraddtelecom.setRank(Integer.parseInt(p.getPractTelecomRank()));
		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory practitioneraddtelecomsetsystemEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();

		/******************** Pract_Telecom_System_Code ********************************************************************************/
		if(p.getPractTelecomSystemCode() != null) {
			practitioneraddtelecom.setSystem(practitioneraddtelecomsetsystemEnumFactory.fromCode(p.getPractTelecomSystemCode()));

		}

		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory practitioneraddtelecomsetuseEnumFactory = new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();

		/******************** Pract_Telecom_Use_Code ********************************************************************************/
		if(p.getPractTelecomUseCode() != null) {
			practitioneraddtelecom.setUse(practitioneraddtelecomsetuseEnumFactory.fromCode(p.getPractTelecomUseCode()));

		}
		/******************** Pract_Telecom_Value ********************************************************************************/
		if(p.getPractTelecomValue() != null) {
			practitioneraddtelecom.setValue(p.getPractTelecomValue());
		}
		return practitioner;
	}
}
