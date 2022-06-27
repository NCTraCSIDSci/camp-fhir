package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Patient;
public class PatientBidirectionalConversion 
{
	public Patient Patients(org.hl7.fhir.r4.model.Patient patient) throws ParseException
	{
		 main.java.com.campfhir.model.Patient p = new  main.java.com.campfhir.model.Patient();

		/******************** id ********************************************************************************/
		patient.setId(p.getId());

		/******************** Pnt_GeneralPrctitnr ********************************************************************************/
		if(patient.hasGeneralPractitioner()) {
			p.setPntGeneralPrctitnr(String.valueOf(patient.getGeneralPractitionerFirstRep()));
		}
		/******************** Pnt_DeceasedDtTimeTyp ********************************************************************************/
		if(patient.hasDeceasedDateTimeType()) {
			p.setPntDeceasedDtTimeTyp(String.valueOf(patient.getDeceasedDateTimeType()));
		}
		/******************** Pnt_MultipleBirthBooleanTyp ********************************************************************************/
		if(patient.hasMultipleBirthBooleanType()) {
			p.setPntMultipleBirthBooleanTyp(String.valueOf(patient.getMultipleBirthBooleanType()));
		}
		/******************** Pnt_DeceasedBooleanTyp ********************************************************************************/
		if(patient.hasDeceasedBooleanType()) {
			p.setPntDeceasedBooleanTyp(String.valueOf(patient.getDeceasedBooleanType()));
		}
		/******************** Pnt_MultipleBirthIntegerTyp ********************************************************************************/
		if(patient.hasMultipleBirthIntegerType()) {
			p.setPntMultipleBirthIntegerTyp(String.valueOf(patient.getMultipleBirthIntegerType()));
		}
		/******************** Pnt_Active ********************************************************************************/
		if(patient.hasActive()) {
			p.setPntActive(String.valueOf(patient.getActive()));
		}
		/******************** patientaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address patientaddress = patient.getAddressFirstRep();

		/******************** Pnt_Addr_State ********************************************************************************/
		if(patientaddress.hasState()) {
			p.setPntAddrState(String.valueOf(patientaddress.getState()));
		}
		/******************** patientaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType patientaddresstype = patientaddress.getType();
		p.setPntAddrTyp(patientaddresstype.toCode());

		/******************** Pnt_Addr_Cntry ********************************************************************************/
		if(patientaddress.hasCountry()) {
			p.setPntAddrCntry(String.valueOf(patientaddress.getCountry()));
		}
		/******************** patientaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientaddressperiod = patientaddress.getPeriod();

		/******************** Pnt_Addr_Prd_Strt ********************************************************************************/
		if(patientaddressperiod.hasStart()) {
			p.setPntAddrPrdStrt(String.valueOf(patientaddressperiod.getStart()));
		}
		/******************** Pnt_Addr_Prd_End ********************************************************************************/
		if(patientaddressperiod.hasEnd()) {
			p.setPntAddrPrdEnd(String.valueOf(patientaddressperiod.getEnd()));
		}
		/******************** Pnt_Addr_Txt ********************************************************************************/
		if(patientaddress.hasText()) {
			p.setPntAddrTxt(String.valueOf(patientaddress.getText()));
		}
		/******************** patientaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse patientaddressuse = patientaddress.getUse();
		p.setPntAddrUse(patientaddressuse.toCode());

		/******************** Pnt_Addr_City ********************************************************************************/
		if(patientaddress.hasCity()) {
			p.setPntAddrCity(String.valueOf(patientaddress.getCity()));
		}
		/******************** Pnt_Addr_District ********************************************************************************/
		if(patientaddress.hasDistrict()) {
			p.setPntAddrDistrict(String.valueOf(patientaddress.getDistrict()));
		}
		/******************** Pnt_Addr_PostalCd ********************************************************************************/
		if(patientaddress.hasPostalCode()) {
			p.setPntAddrPostalCd(String.valueOf(patientaddress.getPostalCode()));
		}
		/******************** patientgender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender patientgender = patient.getGender();
		p.setPntGender(patientgender.toCode());

		/******************** Pnt_BirthDt ********************************************************************************/
		if(patient.hasBirthDate()) {
			p.setPntBirthDt(String.valueOf(patient.getBirthDate()));
		}
		/******************** patientname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName patientname = patient.getNameFirstRep();

		/******************** patientnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientnameperiod = patientname.getPeriod();

		/******************** Pnt_Nm_Prd_Strt ********************************************************************************/
		if(patientnameperiod.hasStart()) {
			p.setPntNmPrdStrt(String.valueOf(patientnameperiod.getStart()));
		}
		/******************** Pnt_Nm_Prd_End ********************************************************************************/
		if(patientnameperiod.hasEnd()) {
			p.setPntNmPrdEnd(String.valueOf(patientnameperiod.getEnd()));
		}
		/******************** Pnt_Nm_Txt ********************************************************************************/
		if(patientname.hasText()) {
			p.setPntNmTxt(String.valueOf(patientname.getText()));
		}
		/******************** Pnt_Nm_Given ********************************************************************************/
		if(patientname.hasGiven()) {
			p.setPntNmGiven(String.valueOf(patientname.getGivenAsSingleString()));
		}
		/******************** Pnt_Nm_Prefix ********************************************************************************/
		if(patientname.hasPrefix()) {
			p.setPntNmPrefix(String.valueOf(patientname.getPrefixAsSingleString()));
		}
		/******************** Pnt_Nm_Suffix ********************************************************************************/
		if(patientname.hasSuffix()) {
			p.setPntNmSuffix(String.valueOf(patientname.getSuffixAsSingleString()));
		}
		/******************** patientnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse patientnameuse = patientname.getUse();
		p.setPntNmUse(patientnameuse.toCode());

		/******************** Pnt_Nm_Fmly ********************************************************************************/
		if(patientname.hasFamily()) {
			p.setPntNmFmly(String.valueOf(patientname.getFamily()));
		}
		/******************** patienttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint patienttelecom = patient.getTelecomFirstRep();

		/******************** Pnt_Tlcm_Vl ********************************************************************************/
		if(patienttelecom.hasValue()) {
			p.setPntTlcmVl(String.valueOf(patienttelecom.getValue()));
		}
		/******************** patienttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patienttelecomperiod = patienttelecom.getPeriod();

		/******************** Pnt_Tlcm_Prd_Strt ********************************************************************************/
		if(patienttelecomperiod.hasStart()) {
			p.setPntTlcmPrdStrt(String.valueOf(patienttelecomperiod.getStart()));
		}
		/******************** Pnt_Tlcm_Prd_End ********************************************************************************/
		if(patienttelecomperiod.hasEnd()) {
			p.setPntTlcmPrdEnd(String.valueOf(patienttelecomperiod.getEnd()));
		}
		/******************** patienttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem patienttelecomsystem = patienttelecom.getSystem();
		p.setPntTlcmSys(patienttelecomsystem.toCode());

		/******************** patienttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse patienttelecomuse = patienttelecom.getUse();
		p.setPntTlcmUse(patienttelecomuse.toCode());

		/******************** Pnt_Tlcm_Rnk ********************************************************************************/
		if(patienttelecom.hasRank()) {
			p.setPntTlcmRnk(String.valueOf(patienttelecom.getRank()));
		}
		/******************** patientphoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment patientphoto = patient.getPhotoFirstRep();

		/******************** Pnt_Photo_Sz ********************************************************************************/
		if(patientphoto.hasSize()) {
			p.setPntPhotoSz(String.valueOf(patientphoto.getSize()));
		}
		/******************** Pnt_Photo_Lnguage ********************************************************************************/
		if(patientphoto.hasLanguage()) {
			p.setPntPhotoLnguage(String.valueOf(patientphoto.getLanguage()));
		}
		/******************** Pnt_Photo_CntntTyp ********************************************************************************/
		if(patientphoto.hasContentType()) {
			p.setPntPhotoCntntTyp(String.valueOf(patientphoto.getContentType()));
		}
		/******************** Pnt_Photo_Ttl ********************************************************************************/
		if(patientphoto.hasTitle()) {
			p.setPntPhotoTtl(String.valueOf(patientphoto.getTitle()));
		}
		/******************** Pnt_Photo_Url ********************************************************************************/
		if(patientphoto.hasUrl()) {
			p.setPntPhotoUrl(String.valueOf(patientphoto.getUrl()));
		}
		/******************** Pnt_Photo_Data ********************************************************************************/
		if(patientphoto.hasData()) {
			p.setPntPhotoData(String.valueOf(patientphoto.getData()));
		}

		/******************** Pnt_Photo_Hash ********************************************************************************/
		if(patientphoto.hasHash()) {
			p.setPntPhotoHash(String.valueOf(patientphoto.getHash()));
		}

		/******************** Pnt_Photo_Creation ********************************************************************************/
		if(patientphoto.hasCreation()) {
			p.setPntPhotoCreation(String.valueOf(patientphoto.getCreation()));
		}
		/******************** patientcontact ********************************************************************************/
		org.hl7.fhir.r4.model.Patient.ContactComponent patientcontact = patient.getContactFirstRep();

		/******************** patientcontactname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName patientcontactname = patientcontact.getName();

		/******************** patientcontactnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontactnameperiod = patientcontactname.getPeriod();

		/******************** Pnt_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(patientcontactnameperiod.hasStart()) {
			p.setPntCntctNmPrdStrt(String.valueOf(patientcontactnameperiod.getStart()));
		}
		/******************** Pnt_Cntct_Nm_Prd_End ********************************************************************************/
		if(patientcontactnameperiod.hasEnd()) {
			p.setPntCntctNmPrdEnd(String.valueOf(patientcontactnameperiod.getEnd()));
		}
		/******************** Pnt_Cntct_Nm_Txt ********************************************************************************/
		if(patientcontactname.hasText()) {
			p.setPntCntctNmTxt(String.valueOf(patientcontactname.getText()));
		}
		/******************** Pnt_Cntct_Nm_Given ********************************************************************************/
		if(patientcontactname.hasGiven()) {
			p.setPntCntctNmGiven(String.valueOf(patientcontactname.getGivenAsSingleString()));
		}
		/******************** Pnt_Cntct_Nm_Prefix ********************************************************************************/
		if(patientcontactname.hasPrefix()) {
			p.setPntCntctNmPrefix(String.valueOf(patientcontactname.getPrefixAsSingleString()));
		}
		/******************** Pnt_Cntct_Nm_Suffix ********************************************************************************/
		if(patientcontactname.hasSuffix()) {
			p.setPntCntctNmSuffix(String.valueOf(patientcontactname.getSuffixAsSingleString()));
		}
		/******************** patientcontactnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse patientcontactnameuse = patientcontactname.getUse();
		p.setPntCntctNmUse(patientcontactnameuse.toCode());

		/******************** Pnt_Cntct_Nm_Fmly ********************************************************************************/
		if(patientcontactname.hasFamily()) {
			p.setPntCntctNmFmly(String.valueOf(patientcontactname.getFamily()));
		}
		/******************** patientcontactaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address patientcontactaddress = patientcontact.getAddress();

		/******************** Pnt_Cntct_Addr_State ********************************************************************************/
		if(patientcontactaddress.hasState()) {
			p.setPntCntctAddrState(String.valueOf(patientcontactaddress.getState()));
		}
		/******************** patientcontactaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType patientcontactaddresstype = patientcontactaddress.getType();
		p.setPntCntctAddrTyp(patientcontactaddresstype.toCode());

		/******************** Pnt_Cntct_Addr_Cntry ********************************************************************************/
		if(patientcontactaddress.hasCountry()) {
			p.setPntCntctAddrCntry(String.valueOf(patientcontactaddress.getCountry()));
		}
		/******************** patientcontactaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontactaddressperiod = patientcontactaddress.getPeriod();

		/******************** Pnt_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(patientcontactaddressperiod.hasStart()) {
			p.setPntCntctAddrPrdStrt(String.valueOf(patientcontactaddressperiod.getStart()));
		}
		/******************** Pnt_Cntct_Addr_Prd_End ********************************************************************************/
		if(patientcontactaddressperiod.hasEnd()) {
			p.setPntCntctAddrPrdEnd(String.valueOf(patientcontactaddressperiod.getEnd()));
		}
		/******************** Pnt_Cntct_Addr_Txt ********************************************************************************/
		if(patientcontactaddress.hasText()) {
			p.setPntCntctAddrTxt(String.valueOf(patientcontactaddress.getText()));
		}
		/******************** patientcontactaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse patientcontactaddressuse = patientcontactaddress.getUse();
		p.setPntCntctAddrUse(patientcontactaddressuse.toCode());

		/******************** Pnt_Cntct_Addr_City ********************************************************************************/
		if(patientcontactaddress.hasCity()) {
			p.setPntCntctAddrCity(String.valueOf(patientcontactaddress.getCity()));
		}
		/******************** Pnt_Cntct_Addr_District ********************************************************************************/
		if(patientcontactaddress.hasDistrict()) {
			p.setPntCntctAddrDistrict(String.valueOf(patientcontactaddress.getDistrict()));
		}
		/******************** Pnt_Cntct_Addr_PostalCd ********************************************************************************/
		if(patientcontactaddress.hasPostalCode()) {
			p.setPntCntctAddrPostalCd(String.valueOf(patientcontactaddress.getPostalCode()));
		}
		/******************** Pnt_Cntct_Orgnztn ********************************************************************************/
		if(patientcontact.hasOrganization()) {
			p.setPntCntctOrgnztn(String.valueOf(patientcontact.getOrganization()));
		}
		/******************** patientcontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontactperiod = patientcontact.getPeriod();

		/******************** Pnt_Cntct_Prd_Strt ********************************************************************************/
		if(patientcontactperiod.hasStart()) {
			p.setPntCntctPrdStrt(String.valueOf(patientcontactperiod.getStart()));
		}
		/******************** Pnt_Cntct_Prd_End ********************************************************************************/
		if(patientcontactperiod.hasEnd()) {
			p.setPntCntctPrdEnd(String.valueOf(patientcontactperiod.getEnd()));
		}
		/******************** patientcontactgender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender patientcontactgender = patientcontact.getGender();
		p.setPntCntctGender(patientcontactgender.toCode());

		/******************** patientcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint patientcontacttelecom = patientcontact.getTelecomFirstRep();

		/******************** Pnt_Cntct_Tlcm_Vl ********************************************************************************/
		if(patientcontacttelecom.hasValue()) {
			p.setPntCntctTlcmVl(String.valueOf(patientcontacttelecom.getValue()));
		}
		/******************** patientcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontacttelecomperiod = patientcontacttelecom.getPeriod();

		/******************** Pnt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(patientcontacttelecomperiod.hasStart()) {
			p.setPntCntctTlcmPrdStrt(String.valueOf(patientcontacttelecomperiod.getStart()));
		}
		/******************** Pnt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(patientcontacttelecomperiod.hasEnd()) {
			p.setPntCntctTlcmPrdEnd(String.valueOf(patientcontacttelecomperiod.getEnd()));
		}
		/******************** patientcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem patientcontacttelecomsystem = patientcontacttelecom.getSystem();
		p.setPntCntctTlcmSys(patientcontacttelecomsystem.toCode());

		/******************** patientcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse patientcontacttelecomuse = patientcontacttelecom.getUse();
		p.setPntCntctTlcmUse(patientcontacttelecomuse.toCode());

		/******************** Pnt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(patientcontacttelecom.hasRank()) {
			p.setPntCntctTlcmRnk(String.valueOf(patientcontacttelecom.getRank()));
		}
		/******************** patientcontactrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientcontactrelationship = patientcontact.getRelationshipFirstRep();

		/******************** Pnt_Cntct_Rltnship_Txt ********************************************************************************/
		if(patientcontactrelationship.hasText()) {
			p.setPntCntctRltnshipTxt(String.valueOf(patientcontactrelationship.getText()));
		}
		/******************** patientcontactrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding patientcontactrelationshipcoding = patientcontactrelationship.getCodingFirstRep();

		/******************** Pnt_Cntct_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(patientcontactrelationshipcoding.hasVersion()) {
			p.setPntCntctRltnshipCdgVrsn(String.valueOf(patientcontactrelationshipcoding.getVersion()));
		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Dsply ********************************************************************************/
		if(patientcontactrelationshipcoding.hasDisplay()) {
			p.setPntCntctRltnshipCdgDsply(String.valueOf(patientcontactrelationshipcoding.getDisplay()));
		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Cd ********************************************************************************/
		if(patientcontactrelationshipcoding.hasCode()) {
			p.setPntCntctRltnshipCdgCd(String.valueOf(patientcontactrelationshipcoding.getCode()));
		}
		/******************** Pnt_Cntct_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(patientcontactrelationshipcoding.hasUserSelected()) {
			p.setPntCntctRltnshipCdgUsrSltd(String.valueOf(patientcontactrelationshipcoding.getUserSelected()));
		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Sys ********************************************************************************/
		if(patientcontactrelationshipcoding.hasSystem()) {
			p.setPntCntctRltnshipCdgSys(String.valueOf(patientcontactrelationshipcoding.getSystem()));
		}
		/******************** patientcommunication ********************************************************************************/
		org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent patientcommunication = patient.getCommunicationFirstRep();

		/******************** patientcommunicationlanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientcommunicationlanguage = patientcommunication.getLanguage();

		/******************** Pnt_Cmmnctn_Lnguage_Txt ********************************************************************************/
		if(patientcommunicationlanguage.hasText()) {
			p.setPntCmmnctnLnguageTxt(String.valueOf(patientcommunicationlanguage.getText()));
		}
		/******************** patientcommunicationlanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding patientcommunicationlanguagecoding = patientcommunicationlanguage.getCodingFirstRep();

		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(patientcommunicationlanguagecoding.hasVersion()) {
			p.setPntCmmnctnLnguageCdgVrsn(String.valueOf(patientcommunicationlanguagecoding.getVersion()));
		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Dsply ********************************************************************************/
		if(patientcommunicationlanguagecoding.hasDisplay()) {
			p.setPntCmmnctnLnguageCdgDsply(String.valueOf(patientcommunicationlanguagecoding.getDisplay()));
		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Cd ********************************************************************************/
		if(patientcommunicationlanguagecoding.hasCode()) {
			p.setPntCmmnctnLnguageCdgCd(String.valueOf(patientcommunicationlanguagecoding.getCode()));
		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(patientcommunicationlanguagecoding.hasUserSelected()) {
			p.setPntCmmnctnLnguageCdgUsrSltd(String.valueOf(patientcommunicationlanguagecoding.getUserSelected()));
		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Sys ********************************************************************************/
		if(patientcommunicationlanguagecoding.hasSystem()) {
			p.setPntCmmnctnLnguageCdgSys(String.valueOf(patientcommunicationlanguagecoding.getSystem()));
		}
		/******************** Pnt_Cmmnctn_Preferred ********************************************************************************/
		if(patientcommunication.hasPreferred()) {
			p.setPntCmmnctnPreferred(String.valueOf(patientcommunication.getPreferred()));
		}
		/******************** patientidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier patientidentifier = patient.getIdentifierFirstRep();

		/******************** Pnt_Id_Vl ********************************************************************************/
		if(patientidentifier.hasValue()) {
			p.setPntIdVl(String.valueOf(patientidentifier.getValue()));
		}
		/******************** patientidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientidentifiertype = patientidentifier.getType();

		/******************** Pnt_Id_Typ_Txt ********************************************************************************/
		if(patientidentifiertype.hasText()) {
			p.setPntIdTypTxt(String.valueOf(patientidentifiertype.getText()));
		}
		/******************** patientidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding patientidentifiertypecoding = patientidentifiertype.getCodingFirstRep();

		/******************** Pnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(patientidentifiertypecoding.hasVersion()) {
			p.setPntIdTypCdgVrsn(String.valueOf(patientidentifiertypecoding.getVersion()));
		}
		/******************** Pnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(patientidentifiertypecoding.hasDisplay()) {
			p.setPntIdTypCdgDsply(String.valueOf(patientidentifiertypecoding.getDisplay()));
		}
		/******************** Pnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(patientidentifiertypecoding.hasCode()) {
			p.setPntIdTypCdgCd(String.valueOf(patientidentifiertypecoding.getCode()));
		}
		/******************** Pnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(patientidentifiertypecoding.hasUserSelected()) {
			p.setPntIdTypCdgUsrSltd(String.valueOf(patientidentifiertypecoding.getUserSelected()));
		}
		/******************** Pnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(patientidentifiertypecoding.hasSystem()) {
			p.setPntIdTypCdgSys(String.valueOf(patientidentifiertypecoding.getSystem()));
		}
		/******************** patientidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientidentifierperiod = patientidentifier.getPeriod();

		/******************** Pnt_Id_Prd_Strt ********************************************************************************/
		if(patientidentifierperiod.hasStart()) {
			p.setPntIdPrdStrt(String.valueOf(patientidentifierperiod.getStart()));
		}
		/******************** Pnt_Id_Prd_End ********************************************************************************/
		if(patientidentifierperiod.hasEnd()) {
			p.setPntIdPrdEnd(String.valueOf(patientidentifierperiod.getEnd()));
		}
		/******************** Pnt_Id_Assigner ********************************************************************************/
		if(patientidentifier.hasAssigner()) {
			p.setPntIdAssigner(String.valueOf(patientidentifier.getAssigner()));
		}
		/******************** Pnt_Id_Sys ********************************************************************************/
		if(patientidentifier.hasSystem()) {
			p.setPntIdSys(String.valueOf(patientidentifier.getSystem()));
		}
		/******************** patientidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse patientidentifieruse = patientidentifier.getUse();
		p.setPntIdUse(patientidentifieruse.toCode());

		/******************** Pnt_ManagingOrgnztn ********************************************************************************/
		if(patient.hasManagingOrganization()) {
			p.setPntManagingOrgnztn(String.valueOf(patient.getManagingOrganization()));
		}
		/******************** patientlink ********************************************************************************/
		org.hl7.fhir.r4.model.Patient.PatientLinkComponent patientlink = patient.getLinkFirstRep();

		/******************** patientlinktype ********************************************************************************/
		org.hl7.fhir.r4.model.Patient.LinkType patientlinktype = patientlink.getType();
		p.setPntLinkTyp(patientlinktype.toCode());

		/******************** Pnt_Link_Other ********************************************************************************/
		if(patientlink.hasOther()) {
			p.setPntLinkOther(String.valueOf(patientlink.getOther()));
		}
		/******************** patientmaritalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientmaritalstatus = patient.getMaritalStatus();

		/******************** Pnt_MaritalSts_Txt ********************************************************************************/
		if(patientmaritalstatus.hasText()) {
			p.setPntMaritalStsTxt(String.valueOf(patientmaritalstatus.getText()));
		}
		/******************** patientmaritalstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding patientmaritalstatuscoding = patientmaritalstatus.getCodingFirstRep();

		/******************** Pnt_MaritalSts_Cdg_Vrsn ********************************************************************************/
		if(patientmaritalstatuscoding.hasVersion()) {
			p.setPntMaritalStsCdgVrsn(String.valueOf(patientmaritalstatuscoding.getVersion()));
		}
		/******************** Pnt_MaritalSts_Cdg_Dsply ********************************************************************************/
		if(patientmaritalstatuscoding.hasDisplay()) {
			p.setPntMaritalStsCdgDsply(String.valueOf(patientmaritalstatuscoding.getDisplay()));
		}
		/******************** Pnt_MaritalSts_Cdg_Cd ********************************************************************************/
		if(patientmaritalstatuscoding.hasCode()) {
			p.setPntMaritalStsCdgCd(String.valueOf(patientmaritalstatuscoding.getCode()));
		}
		/******************** Pnt_MaritalSts_Cdg_UsrSltd ********************************************************************************/
		if(patientmaritalstatuscoding.hasUserSelected()) {
			p.setPntMaritalStsCdgUsrSltd(String.valueOf(patientmaritalstatuscoding.getUserSelected()));
		}
		/******************** Pnt_MaritalSts_Cdg_Sys ********************************************************************************/
		if(patientmaritalstatuscoding.hasSystem()) {
			p.setPntMaritalStsCdgSys(String.valueOf(patientmaritalstatuscoding.getSystem()));
		}
		return p;
	}
}
