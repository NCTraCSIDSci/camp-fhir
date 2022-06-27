package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Practitioner;
public class PractitionerBidirectionalConversion 
{
	public Practitioner Practitioners(org.hl7.fhir.r4.model.Practitioner practitioner) throws ParseException
	{
		 main.java.com.campfhir.model.Practitioner p = new  main.java.com.campfhir.model.Practitioner();

		/******************** id ********************************************************************************/
		practitioner.setId(p.getId());

		/******************** Prctitnr_Active ********************************************************************************/
		if(practitioner.hasActive()) {
			p.setPrctitnrActive(String.valueOf(practitioner.getActive()));
		}
		/******************** practitioneraddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address practitioneraddress = practitioner.getAddressFirstRep();

		/******************** Prctitnr_Addr_State ********************************************************************************/
		if(practitioneraddress.hasState()) {
			p.setPrctitnrAddrState(String.valueOf(practitioneraddress.getState()));
		}
		/******************** practitioneraddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType practitioneraddresstype = practitioneraddress.getType();
		p.setPrctitnrAddrTyp(practitioneraddresstype.toCode());

		/******************** Prctitnr_Addr_Cntry ********************************************************************************/
		if(practitioneraddress.hasCountry()) {
			p.setPrctitnrAddrCntry(String.valueOf(practitioneraddress.getCountry()));
		}
		/******************** practitioneraddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitioneraddressperiod = practitioneraddress.getPeriod();

		/******************** Prctitnr_Addr_Prd_Strt ********************************************************************************/
		if(practitioneraddressperiod.hasStart()) {
			p.setPrctitnrAddrPrdStrt(String.valueOf(practitioneraddressperiod.getStart()));
		}
		/******************** Prctitnr_Addr_Prd_End ********************************************************************************/
		if(practitioneraddressperiod.hasEnd()) {
			p.setPrctitnrAddrPrdEnd(String.valueOf(practitioneraddressperiod.getEnd()));
		}
		/******************** Prctitnr_Addr_Txt ********************************************************************************/
		if(practitioneraddress.hasText()) {
			p.setPrctitnrAddrTxt(String.valueOf(practitioneraddress.getText()));
		}
		/******************** practitioneraddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse practitioneraddressuse = practitioneraddress.getUse();
		p.setPrctitnrAddrUse(practitioneraddressuse.toCode());

		/******************** Prctitnr_Addr_City ********************************************************************************/
		if(practitioneraddress.hasCity()) {
			p.setPrctitnrAddrCity(String.valueOf(practitioneraddress.getCity()));
		}
		/******************** Prctitnr_Addr_District ********************************************************************************/
		if(practitioneraddress.hasDistrict()) {
			p.setPrctitnrAddrDistrict(String.valueOf(practitioneraddress.getDistrict()));
		}
		/******************** Prctitnr_Addr_PostalCd ********************************************************************************/
		if(practitioneraddress.hasPostalCode()) {
			p.setPrctitnrAddrPostalCd(String.valueOf(practitioneraddress.getPostalCode()));
		}
		/******************** practitionergender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender practitionergender = practitioner.getGender();
		p.setPrctitnrGender(practitionergender.toCode());

		/******************** Prctitnr_BirthDt ********************************************************************************/
		if(practitioner.hasBirthDate()) {
			p.setPrctitnrBirthDt(String.valueOf(practitioner.getBirthDate()));
		}
		/******************** practitionername ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName practitionername = practitioner.getNameFirstRep();

		/******************** practitionernameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionernameperiod = practitionername.getPeriod();

		/******************** Prctitnr_Nm_Prd_Strt ********************************************************************************/
		if(practitionernameperiod.hasStart()) {
			p.setPrctitnrNmPrdStrt(String.valueOf(practitionernameperiod.getStart()));
		}
		/******************** Prctitnr_Nm_Prd_End ********************************************************************************/
		if(practitionernameperiod.hasEnd()) {
			p.setPrctitnrNmPrdEnd(String.valueOf(practitionernameperiod.getEnd()));
		}
		/******************** Prctitnr_Nm_Txt ********************************************************************************/
		if(practitionername.hasText()) {
			p.setPrctitnrNmTxt(String.valueOf(practitionername.getText()));
		}
		/******************** Prctitnr_Nm_Given ********************************************************************************/
		if(practitionername.hasGiven()) {
			p.setPrctitnrNmGiven(String.valueOf(practitionername.getGivenAsSingleString()));
		}
		/******************** Prctitnr_Nm_Prefix ********************************************************************************/
		if(practitionername.hasPrefix()) {
			p.setPrctitnrNmPrefix(String.valueOf(practitionername.getPrefixAsSingleString()));
		}
		/******************** Prctitnr_Nm_Suffix ********************************************************************************/
		if(practitionername.hasSuffix()) {
			p.setPrctitnrNmSuffix(String.valueOf(practitionername.getSuffixAsSingleString()));
		}
		/******************** practitionernameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse practitionernameuse = practitionername.getUse();
		p.setPrctitnrNmUse(practitionernameuse.toCode());

		/******************** Prctitnr_Nm_Fmly ********************************************************************************/
		if(practitionername.hasFamily()) {
			p.setPrctitnrNmFmly(String.valueOf(practitionername.getFamily()));
		}
		/******************** practitionertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint practitionertelecom = practitioner.getTelecomFirstRep();

		/******************** Prctitnr_Tlcm_Vl ********************************************************************************/
		if(practitionertelecom.hasValue()) {
			p.setPrctitnrTlcmVl(String.valueOf(practitionertelecom.getValue()));
		}
		/******************** practitionertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionertelecomperiod = practitionertelecom.getPeriod();

		/******************** Prctitnr_Tlcm_Prd_Strt ********************************************************************************/
		if(practitionertelecomperiod.hasStart()) {
			p.setPrctitnrTlcmPrdStrt(String.valueOf(practitionertelecomperiod.getStart()));
		}
		/******************** Prctitnr_Tlcm_Prd_End ********************************************************************************/
		if(practitionertelecomperiod.hasEnd()) {
			p.setPrctitnrTlcmPrdEnd(String.valueOf(practitionertelecomperiod.getEnd()));
		}
		/******************** practitionertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem practitionertelecomsystem = practitionertelecom.getSystem();
		p.setPrctitnrTlcmSys(practitionertelecomsystem.toCode());

		/******************** practitionertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse practitionertelecomuse = practitionertelecom.getUse();
		p.setPrctitnrTlcmUse(practitionertelecomuse.toCode());

		/******************** Prctitnr_Tlcm_Rnk ********************************************************************************/
		if(practitionertelecom.hasRank()) {
			p.setPrctitnrTlcmRnk(String.valueOf(practitionertelecom.getRank()));
		}
		/******************** practitionerphoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment practitionerphoto = practitioner.getPhotoFirstRep();

		/******************** Prctitnr_Photo_Sz ********************************************************************************/
		if(practitionerphoto.hasSize()) {
			p.setPrctitnrPhotoSz(String.valueOf(practitionerphoto.getSize()));
		}
		/******************** Prctitnr_Photo_Lnguage ********************************************************************************/
		if(practitionerphoto.hasLanguage()) {
			p.setPrctitnrPhotoLnguage(String.valueOf(practitionerphoto.getLanguage()));
		}
		/******************** Prctitnr_Photo_CntntTyp ********************************************************************************/
		if(practitionerphoto.hasContentType()) {
			p.setPrctitnrPhotoCntntTyp(String.valueOf(practitionerphoto.getContentType()));
		}
		/******************** Prctitnr_Photo_Ttl ********************************************************************************/
		if(practitionerphoto.hasTitle()) {
			p.setPrctitnrPhotoTtl(String.valueOf(practitionerphoto.getTitle()));
		}
		/******************** Prctitnr_Photo_Url ********************************************************************************/
		if(practitionerphoto.hasUrl()) {
			p.setPrctitnrPhotoUrl(String.valueOf(practitionerphoto.getUrl()));
		}
		/******************** Prctitnr_Photo_Data ********************************************************************************/
		if(practitionerphoto.hasData()) {
			p.setPrctitnrPhotoData(String.valueOf(practitionerphoto.getData()));
		}

		/******************** Prctitnr_Photo_Hash ********************************************************************************/
		if(practitionerphoto.hasHash()) {
			p.setPrctitnrPhotoHash(String.valueOf(practitionerphoto.getHash()));
		}

		/******************** Prctitnr_Photo_Creation ********************************************************************************/
		if(practitionerphoto.hasCreation()) {
			p.setPrctitnrPhotoCreation(String.valueOf(practitionerphoto.getCreation()));
		}
		/******************** practitionercommunication ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionercommunication = practitioner.getCommunicationFirstRep();

		/******************** Prctitnr_Cmmnctn_Txt ********************************************************************************/
		if(practitionercommunication.hasText()) {
			p.setPrctitnrCmmnctnTxt(String.valueOf(practitionercommunication.getText()));
		}
		/******************** practitionercommunicationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionercommunicationcoding = practitionercommunication.getCodingFirstRep();

		/******************** Prctitnr_Cmmnctn_Cdg_Vrsn ********************************************************************************/
		if(practitionercommunicationcoding.hasVersion()) {
			p.setPrctitnrCmmnctnCdgVrsn(String.valueOf(practitionercommunicationcoding.getVersion()));
		}
		/******************** Prctitnr_Cmmnctn_Cdg_Dsply ********************************************************************************/
		if(practitionercommunicationcoding.hasDisplay()) {
			p.setPrctitnrCmmnctnCdgDsply(String.valueOf(practitionercommunicationcoding.getDisplay()));
		}
		/******************** Prctitnr_Cmmnctn_Cdg_Cd ********************************************************************************/
		if(practitionercommunicationcoding.hasCode()) {
			p.setPrctitnrCmmnctnCdgCd(String.valueOf(practitionercommunicationcoding.getCode()));
		}
		/******************** Prctitnr_Cmmnctn_Cdg_UsrSltd ********************************************************************************/
		if(practitionercommunicationcoding.hasUserSelected()) {
			p.setPrctitnrCmmnctnCdgUsrSltd(String.valueOf(practitionercommunicationcoding.getUserSelected()));
		}
		/******************** Prctitnr_Cmmnctn_Cdg_Sys ********************************************************************************/
		if(practitionercommunicationcoding.hasSystem()) {
			p.setPrctitnrCmmnctnCdgSys(String.valueOf(practitionercommunicationcoding.getSystem()));
		}
		/******************** practitionerqualification ********************************************************************************/
		org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent practitionerqualification = practitioner.getQualificationFirstRep();

		/******************** practitionerqualificationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerqualificationcode = practitionerqualification.getCode();

		/******************** Prctitnr_Qualification_Cd_Txt ********************************************************************************/
		if(practitionerqualificationcode.hasText()) {
			p.setPrctitnrQualificationCdTxt(String.valueOf(practitionerqualificationcode.getText()));
		}
		/******************** practitionerqualificationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerqualificationcodecoding = practitionerqualificationcode.getCodingFirstRep();

		/******************** Prctitnr_Qualification_Cd_Cdg_Vrsn ********************************************************************************/
		if(practitionerqualificationcodecoding.hasVersion()) {
			p.setPrctitnrQualificationCdCdgVrsn(String.valueOf(practitionerqualificationcodecoding.getVersion()));
		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Dsply ********************************************************************************/
		if(practitionerqualificationcodecoding.hasDisplay()) {
			p.setPrctitnrQualificationCdCdgDsply(String.valueOf(practitionerqualificationcodecoding.getDisplay()));
		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Cd ********************************************************************************/
		if(practitionerqualificationcodecoding.hasCode()) {
			p.setPrctitnrQualificationCdCdgCd(String.valueOf(practitionerqualificationcodecoding.getCode()));
		}
		/******************** Prctitnr_Qualification_Cd_Cdg_UsrSltd ********************************************************************************/
		if(practitionerqualificationcodecoding.hasUserSelected()) {
			p.setPrctitnrQualificationCdCdgUsrSltd(String.valueOf(practitionerqualificationcodecoding.getUserSelected()));
		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Sys ********************************************************************************/
		if(practitionerqualificationcodecoding.hasSystem()) {
			p.setPrctitnrQualificationCdCdgSys(String.valueOf(practitionerqualificationcodecoding.getSystem()));
		}
		/******************** practitionerqualificationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerqualificationperiod = practitionerqualification.getPeriod();

		/******************** Prctitnr_Qualification_Prd_Strt ********************************************************************************/
		if(practitionerqualificationperiod.hasStart()) {
			p.setPrctitnrQualificationPrdStrt(String.valueOf(practitionerqualificationperiod.getStart()));
		}
		/******************** Prctitnr_Qualification_Prd_End ********************************************************************************/
		if(practitionerqualificationperiod.hasEnd()) {
			p.setPrctitnrQualificationPrdEnd(String.valueOf(practitionerqualificationperiod.getEnd()));
		}
		/******************** practitionerqualificationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier practitionerqualificationidentifier = practitionerqualification.getIdentifierFirstRep();

		/******************** Prctitnr_Qualification_Id_Vl ********************************************************************************/
		if(practitionerqualificationidentifier.hasValue()) {
			p.setPrctitnrQualificationIdVl(String.valueOf(practitionerqualificationidentifier.getValue()));
		}
		/******************** practitionerqualificationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerqualificationidentifiertype = practitionerqualificationidentifier.getType();

		/******************** Prctitnr_Qualification_Id_Typ_Txt ********************************************************************************/
		if(practitionerqualificationidentifiertype.hasText()) {
			p.setPrctitnrQualificationIdTypTxt(String.valueOf(practitionerqualificationidentifiertype.getText()));
		}
		/******************** practitionerqualificationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerqualificationidentifiertypecoding = practitionerqualificationidentifiertype.getCodingFirstRep();

		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(practitionerqualificationidentifiertypecoding.hasVersion()) {
			p.setPrctitnrQualificationIdTypCdgVrsn(String.valueOf(practitionerqualificationidentifiertypecoding.getVersion()));
		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(practitionerqualificationidentifiertypecoding.hasDisplay()) {
			p.setPrctitnrQualificationIdTypCdgDsply(String.valueOf(practitionerqualificationidentifiertypecoding.getDisplay()));
		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Cd ********************************************************************************/
		if(practitionerqualificationidentifiertypecoding.hasCode()) {
			p.setPrctitnrQualificationIdTypCdgCd(String.valueOf(practitionerqualificationidentifiertypecoding.getCode()));
		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(practitionerqualificationidentifiertypecoding.hasUserSelected()) {
			p.setPrctitnrQualificationIdTypCdgUsrSltd(String.valueOf(practitionerqualificationidentifiertypecoding.getUserSelected()));
		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Sys ********************************************************************************/
		if(practitionerqualificationidentifiertypecoding.hasSystem()) {
			p.setPrctitnrQualificationIdTypCdgSys(String.valueOf(practitionerqualificationidentifiertypecoding.getSystem()));
		}
		/******************** practitionerqualificationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerqualificationidentifierperiod = practitionerqualificationidentifier.getPeriod();

		/******************** Prctitnr_Qualification_Id_Prd_Strt ********************************************************************************/
		if(practitionerqualificationidentifierperiod.hasStart()) {
			p.setPrctitnrQualificationIdPrdStrt(String.valueOf(practitionerqualificationidentifierperiod.getStart()));
		}
		/******************** Prctitnr_Qualification_Id_Prd_End ********************************************************************************/
		if(practitionerqualificationidentifierperiod.hasEnd()) {
			p.setPrctitnrQualificationIdPrdEnd(String.valueOf(practitionerqualificationidentifierperiod.getEnd()));
		}
		/******************** Prctitnr_Qualification_Id_Assigner ********************************************************************************/
		if(practitionerqualificationidentifier.hasAssigner()) {
			p.setPrctitnrQualificationIdAssigner(String.valueOf(practitionerqualificationidentifier.getAssigner()));
		}
		/******************** Prctitnr_Qualification_Id_Sys ********************************************************************************/
		if(practitionerqualificationidentifier.hasSystem()) {
			p.setPrctitnrQualificationIdSys(String.valueOf(practitionerqualificationidentifier.getSystem()));
		}
		/******************** practitionerqualificationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse practitionerqualificationidentifieruse = practitionerqualificationidentifier.getUse();
		p.setPrctitnrQualificationIdUse(practitionerqualificationidentifieruse.toCode());

		/******************** Prctitnr_Qualification_Issuer ********************************************************************************/
		if(practitionerqualification.hasIssuer()) {
			p.setPrctitnrQualificationIssuer(String.valueOf(practitionerqualification.getIssuer()));
		}
		/******************** practitioneridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier practitioneridentifier = practitioner.getIdentifierFirstRep();

		/******************** Prctitnr_Id_Vl ********************************************************************************/
		if(practitioneridentifier.hasValue()) {
			p.setPrctitnrIdVl(String.valueOf(practitioneridentifier.getValue()));
		}
		/******************** practitioneridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitioneridentifiertype = practitioneridentifier.getType();

		/******************** Prctitnr_Id_Typ_Txt ********************************************************************************/
		if(practitioneridentifiertype.hasText()) {
			p.setPrctitnrIdTypTxt(String.valueOf(practitioneridentifiertype.getText()));
		}
		/******************** practitioneridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitioneridentifiertypecoding = practitioneridentifiertype.getCodingFirstRep();

		/******************** Prctitnr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(practitioneridentifiertypecoding.hasVersion()) {
			p.setPrctitnrIdTypCdgVrsn(String.valueOf(practitioneridentifiertypecoding.getVersion()));
		}
		/******************** Prctitnr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(practitioneridentifiertypecoding.hasDisplay()) {
			p.setPrctitnrIdTypCdgDsply(String.valueOf(practitioneridentifiertypecoding.getDisplay()));
		}
		/******************** Prctitnr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(practitioneridentifiertypecoding.hasCode()) {
			p.setPrctitnrIdTypCdgCd(String.valueOf(practitioneridentifiertypecoding.getCode()));
		}
		/******************** Prctitnr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(practitioneridentifiertypecoding.hasUserSelected()) {
			p.setPrctitnrIdTypCdgUsrSltd(String.valueOf(practitioneridentifiertypecoding.getUserSelected()));
		}
		/******************** Prctitnr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(practitioneridentifiertypecoding.hasSystem()) {
			p.setPrctitnrIdTypCdgSys(String.valueOf(practitioneridentifiertypecoding.getSystem()));
		}
		/******************** practitioneridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitioneridentifierperiod = practitioneridentifier.getPeriod();

		/******************** Prctitnr_Id_Prd_Strt ********************************************************************************/
		if(practitioneridentifierperiod.hasStart()) {
			p.setPrctitnrIdPrdStrt(String.valueOf(practitioneridentifierperiod.getStart()));
		}
		/******************** Prctitnr_Id_Prd_End ********************************************************************************/
		if(practitioneridentifierperiod.hasEnd()) {
			p.setPrctitnrIdPrdEnd(String.valueOf(practitioneridentifierperiod.getEnd()));
		}
		/******************** Prctitnr_Id_Assigner ********************************************************************************/
		if(practitioneridentifier.hasAssigner()) {
			p.setPrctitnrIdAssigner(String.valueOf(practitioneridentifier.getAssigner()));
		}
		/******************** Prctitnr_Id_Sys ********************************************************************************/
		if(practitioneridentifier.hasSystem()) {
			p.setPrctitnrIdSys(String.valueOf(practitioneridentifier.getSystem()));
		}
		/******************** practitioneridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse practitioneridentifieruse = practitioneridentifier.getUse();
		p.setPrctitnrIdUse(practitioneridentifieruse.toCode());

		return p;
	}
}
