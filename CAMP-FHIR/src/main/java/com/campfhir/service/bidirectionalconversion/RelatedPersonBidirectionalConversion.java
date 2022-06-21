package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RelatedPerson;
public class RelatedPersonBidirectionalConversion 
{
	public RelatedPerson RelatedPersons(org.hl7.fhir.r4.model.RelatedPerson relatedperson) throws ParseException
	{
		 main.java.com.campfhir.model.RelatedPerson r = new  main.java.com.campfhir.model.RelatedPerson();

		/******************** id ********************************************************************************/
		relatedperson.setId(r.getId());

		/******************** relatedpersonperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonperiod = relatedperson.getPeriod();

		/******************** RltedPrsn_Prd_End ********************************************************************************/
		if(relatedpersonperiod.hasEnd()) {
			r.setRltedPrsnPrdEnd(String.valueOf(relatedpersonperiod.getEnd()));
		}
		/******************** RltedPrsn_Prd_Strt ********************************************************************************/
		if(relatedpersonperiod.hasStart()) {
			r.setRltedPrsnPrdStrt(String.valueOf(relatedpersonperiod.getStart()));
		}
		/******************** RltedPrsn_Pnt ********************************************************************************/
		if(relatedperson.hasPatient()) {
			r.setRltedPrsnPnt(String.valueOf(relatedperson.getPatient()));
		}
		/******************** relatedpersonidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier relatedpersonidentifier = relatedperson.getIdentifierFirstRep();

		/******************** RltedPrsn_Id_Vl ********************************************************************************/
		if(relatedpersonidentifier.hasValue()) {
			r.setRltedPrsnIdVl(String.valueOf(relatedpersonidentifier.getValue()));
		}
		/******************** relatedpersonidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept relatedpersonidentifiertype = relatedpersonidentifier.getType();

		/******************** relatedpersonidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding relatedpersonidentifiertypecoding = relatedpersonidentifiertype.getCodingFirstRep();

		/******************** RltedPrsn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(relatedpersonidentifiertypecoding.hasDisplay()) {
			r.setRltedPrsnIdTypCdgDsply(String.valueOf(relatedpersonidentifiertypecoding.getDisplay()));
		}
		/******************** RltedPrsn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(relatedpersonidentifiertypecoding.hasVersion()) {
			r.setRltedPrsnIdTypCdgVrsn(String.valueOf(relatedpersonidentifiertypecoding.getVersion()));
		}
		/******************** RltedPrsn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(relatedpersonidentifiertypecoding.hasCode()) {
			r.setRltedPrsnIdTypCdgCd(String.valueOf(relatedpersonidentifiertypecoding.getCode()));
		}
		/******************** RltedPrsn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(relatedpersonidentifiertypecoding.hasSystem()) {
			r.setRltedPrsnIdTypCdgSys(String.valueOf(relatedpersonidentifiertypecoding.getSystem()));
		}
		/******************** RltedPrsn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(relatedpersonidentifiertypecoding.hasUserSelected()) {
			r.setRltedPrsnIdTypCdgUsrSltd(String.valueOf(relatedpersonidentifiertypecoding.getUserSelected()));
		}
		/******************** RltedPrsn_Id_Typ_Txt ********************************************************************************/
		if(relatedpersonidentifiertype.hasText()) {
			r.setRltedPrsnIdTypTxt(String.valueOf(relatedpersonidentifiertype.getText()));
		}
		/******************** RltedPrsn_Id_Sys ********************************************************************************/
		if(relatedpersonidentifier.hasSystem()) {
			r.setRltedPrsnIdSys(String.valueOf(relatedpersonidentifier.getSystem()));
		}
		/******************** RltedPrsn_Id_Assigner ********************************************************************************/
		if(relatedpersonidentifier.hasAssigner()) {
			r.setRltedPrsnIdAssigner(String.valueOf(relatedpersonidentifier.getAssigner()));
		}
		/******************** relatedpersonidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonidentifierperiod = relatedpersonidentifier.getPeriod();

		/******************** RltedPrsn_Id_Prd_End ********************************************************************************/
		if(relatedpersonidentifierperiod.hasEnd()) {
			r.setRltedPrsnIdPrdEnd(String.valueOf(relatedpersonidentifierperiod.getEnd()));
		}
		/******************** RltedPrsn_Id_Prd_Strt ********************************************************************************/
		if(relatedpersonidentifierperiod.hasStart()) {
			r.setRltedPrsnIdPrdStrt(String.valueOf(relatedpersonidentifierperiod.getStart()));
		}
		/******************** relatedpersonidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse relatedpersonidentifieruse = relatedpersonidentifier.getUse();
		r.setRltedPrsnIdUse(relatedpersonidentifieruse.toCode());

		/******************** RltedPrsn_Active ********************************************************************************/
		if(relatedperson.hasActive()) {
			r.setRltedPrsnActive(String.valueOf(relatedperson.getActive()));
		}
		/******************** relatedpersonname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName relatedpersonname = relatedperson.getNameFirstRep();

		/******************** RltedPrsn_Nm_Txt ********************************************************************************/
		if(relatedpersonname.hasText()) {
			r.setRltedPrsnNmTxt(String.valueOf(relatedpersonname.getText()));
		}
		/******************** relatedpersonnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonnameperiod = relatedpersonname.getPeriod();

		/******************** RltedPrsn_Nm_Prd_End ********************************************************************************/
		if(relatedpersonnameperiod.hasEnd()) {
			r.setRltedPrsnNmPrdEnd(String.valueOf(relatedpersonnameperiod.getEnd()));
		}
		/******************** RltedPrsn_Nm_Prd_Strt ********************************************************************************/
		if(relatedpersonnameperiod.hasStart()) {
			r.setRltedPrsnNmPrdStrt(String.valueOf(relatedpersonnameperiod.getStart()));
		}
		/******************** RltedPrsn_Nm_Suffix ********************************************************************************/
		if(relatedpersonname.hasSuffix()) {
			r.setRltedPrsnNmSuffix(String.valueOf(relatedpersonname.getSuffixAsSingleString()));
		}
		/******************** RltedPrsn_Nm_Prefix ********************************************************************************/
		if(relatedpersonname.hasPrefix()) {
			r.setRltedPrsnNmPrefix(String.valueOf(relatedpersonname.getPrefixAsSingleString()));
		}
		/******************** RltedPrsn_Nm_Given ********************************************************************************/
		if(relatedpersonname.hasGiven()) {
			r.setRltedPrsnNmGiven(String.valueOf(relatedpersonname.getGivenAsSingleString()));
		}
		/******************** RltedPrsn_Nm_Fmly ********************************************************************************/
		if(relatedpersonname.hasFamily()) {
			r.setRltedPrsnNmFmly(String.valueOf(relatedpersonname.getFamily()));
		}
		/******************** relatedpersonnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse relatedpersonnameuse = relatedpersonname.getUse();
		r.setRltedPrsnNmUse(relatedpersonnameuse.toCode());

		/******************** relatedpersontelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint relatedpersontelecom = relatedperson.getTelecomFirstRep();

		/******************** RltedPrsn_Tlcm_Vl ********************************************************************************/
		if(relatedpersontelecom.hasValue()) {
			r.setRltedPrsnTlcmVl(String.valueOf(relatedpersontelecom.getValue()));
		}
		/******************** relatedpersontelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem relatedpersontelecomsystem = relatedpersontelecom.getSystem();
		r.setRltedPrsnTlcmSys(relatedpersontelecomsystem.toCode());

		/******************** relatedpersontelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersontelecomperiod = relatedpersontelecom.getPeriod();

		/******************** RltedPrsn_Tlcm_Prd_End ********************************************************************************/
		if(relatedpersontelecomperiod.hasEnd()) {
			r.setRltedPrsnTlcmPrdEnd(String.valueOf(relatedpersontelecomperiod.getEnd()));
		}
		/******************** RltedPrsn_Tlcm_Prd_Strt ********************************************************************************/
		if(relatedpersontelecomperiod.hasStart()) {
			r.setRltedPrsnTlcmPrdStrt(String.valueOf(relatedpersontelecomperiod.getStart()));
		}
		/******************** relatedpersontelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse relatedpersontelecomuse = relatedpersontelecom.getUse();
		r.setRltedPrsnTlcmUse(relatedpersontelecomuse.toCode());

		/******************** RltedPrsn_Tlcm_Rnk ********************************************************************************/
		if(relatedpersontelecom.hasRank()) {
			r.setRltedPrsnTlcmRnk(String.valueOf(relatedpersontelecom.getRank()));
		}
		/******************** relatedpersonaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address relatedpersonaddress = relatedperson.getAddressFirstRep();

		/******************** RltedPrsn_Addr_State ********************************************************************************/
		if(relatedpersonaddress.hasState()) {
			r.setRltedPrsnAddrState(String.valueOf(relatedpersonaddress.getState()));
		}
		/******************** relatedpersonaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType relatedpersonaddresstype = relatedpersonaddress.getType();
		r.setRltedPrsnAddrTyp(relatedpersonaddresstype.toCode());

		/******************** RltedPrsn_Addr_Cntry ********************************************************************************/
		if(relatedpersonaddress.hasCountry()) {
			r.setRltedPrsnAddrCntry(String.valueOf(relatedpersonaddress.getCountry()));
		}
		/******************** RltedPrsn_Addr_Txt ********************************************************************************/
		if(relatedpersonaddress.hasText()) {
			r.setRltedPrsnAddrTxt(String.valueOf(relatedpersonaddress.getText()));
		}
		/******************** relatedpersonaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonaddressperiod = relatedpersonaddress.getPeriod();

		/******************** RltedPrsn_Addr_Prd_End ********************************************************************************/
		if(relatedpersonaddressperiod.hasEnd()) {
			r.setRltedPrsnAddrPrdEnd(String.valueOf(relatedpersonaddressperiod.getEnd()));
		}
		/******************** RltedPrsn_Addr_Prd_Strt ********************************************************************************/
		if(relatedpersonaddressperiod.hasStart()) {
			r.setRltedPrsnAddrPrdStrt(String.valueOf(relatedpersonaddressperiod.getStart()));
		}
		/******************** RltedPrsn_Addr_PostalCd ********************************************************************************/
		if(relatedpersonaddress.hasPostalCode()) {
			r.setRltedPrsnAddrPostalCd(String.valueOf(relatedpersonaddress.getPostalCode()));
		}
		/******************** RltedPrsn_Addr_City ********************************************************************************/
		if(relatedpersonaddress.hasCity()) {
			r.setRltedPrsnAddrCity(String.valueOf(relatedpersonaddress.getCity()));
		}
		/******************** RltedPrsn_Addr_District ********************************************************************************/
		if(relatedpersonaddress.hasDistrict()) {
			r.setRltedPrsnAddrDistrict(String.valueOf(relatedpersonaddress.getDistrict()));
		}
		/******************** relatedpersonaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse relatedpersonaddressuse = relatedpersonaddress.getUse();
		r.setRltedPrsnAddrUse(relatedpersonaddressuse.toCode());

		/******************** relatedpersonphoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment relatedpersonphoto = relatedperson.getPhotoFirstRep();

		/******************** RltedPrsn_Photo_Sz ********************************************************************************/
		if(relatedpersonphoto.hasSize()) {
			r.setRltedPrsnPhotoSz(String.valueOf(relatedpersonphoto.getSize()));
		}
		/******************** RltedPrsn_Photo_Lnguage ********************************************************************************/
		if(relatedpersonphoto.hasLanguage()) {
			r.setRltedPrsnPhotoLnguage(String.valueOf(relatedpersonphoto.getLanguage()));
		}
		/******************** RltedPrsn_Photo_CntntTyp ********************************************************************************/
		if(relatedpersonphoto.hasContentType()) {
			r.setRltedPrsnPhotoCntntTyp(String.valueOf(relatedpersonphoto.getContentType()));
		}
		/******************** RltedPrsn_Photo_Url ********************************************************************************/
		if(relatedpersonphoto.hasUrl()) {
			r.setRltedPrsnPhotoUrl(String.valueOf(relatedpersonphoto.getUrl()));
		}
		/******************** RltedPrsn_Photo_Ttl ********************************************************************************/
		if(relatedpersonphoto.hasTitle()) {
			r.setRltedPrsnPhotoTtl(String.valueOf(relatedpersonphoto.getTitle()));
		}
		/******************** RltedPrsn_Photo_Hash ********************************************************************************/
		if(relatedpersonphoto.hasHash()) {
			r.setRltedPrsnPhotoHash(String.valueOf(relatedpersonphoto.getHash()));
		}

		/******************** RltedPrsn_Photo_Data ********************************************************************************/
		if(relatedpersonphoto.hasData()) {
			r.setRltedPrsnPhotoData(String.valueOf(relatedpersonphoto.getData()));
		}

		/******************** RltedPrsn_Photo_Creation ********************************************************************************/
		if(relatedpersonphoto.hasCreation()) {
			r.setRltedPrsnPhotoCreation(String.valueOf(relatedpersonphoto.getCreation()));
		}
		/******************** RltedPrsn_BirthDt ********************************************************************************/
		if(relatedperson.hasBirthDate()) {
			r.setRltedPrsnBirthDt(String.valueOf(relatedperson.getBirthDate()));
		}
		/******************** relatedpersongender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender relatedpersongender = relatedperson.getGender();
		r.setRltedPrsnGender(relatedpersongender.toCode());

		/******************** relatedpersoncommunication ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedPerson.RelatedPersonCommunicationComponent relatedpersoncommunication = relatedperson.getCommunicationFirstRep();

		/******************** relatedpersoncommunicationlanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept relatedpersoncommunicationlanguage = relatedpersoncommunication.getLanguage();

		/******************** relatedpersoncommunicationlanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding relatedpersoncommunicationlanguagecoding = relatedpersoncommunicationlanguage.getCodingFirstRep();

		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Dsply ********************************************************************************/
		if(relatedpersoncommunicationlanguagecoding.hasDisplay()) {
			r.setRltedPrsnCmmnctnLnguageCdgDsply(String.valueOf(relatedpersoncommunicationlanguagecoding.getDisplay()));
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(relatedpersoncommunicationlanguagecoding.hasVersion()) {
			r.setRltedPrsnCmmnctnLnguageCdgVrsn(String.valueOf(relatedpersoncommunicationlanguagecoding.getVersion()));
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Cd ********************************************************************************/
		if(relatedpersoncommunicationlanguagecoding.hasCode()) {
			r.setRltedPrsnCmmnctnLnguageCdgCd(String.valueOf(relatedpersoncommunicationlanguagecoding.getCode()));
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Sys ********************************************************************************/
		if(relatedpersoncommunicationlanguagecoding.hasSystem()) {
			r.setRltedPrsnCmmnctnLnguageCdgSys(String.valueOf(relatedpersoncommunicationlanguagecoding.getSystem()));
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(relatedpersoncommunicationlanguagecoding.hasUserSelected()) {
			r.setRltedPrsnCmmnctnLnguageCdgUsrSltd(String.valueOf(relatedpersoncommunicationlanguagecoding.getUserSelected()));
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Txt ********************************************************************************/
		if(relatedpersoncommunicationlanguage.hasText()) {
			r.setRltedPrsnCmmnctnLnguageTxt(String.valueOf(relatedpersoncommunicationlanguage.getText()));
		}
		/******************** RltedPrsn_Cmmnctn_Preferred ********************************************************************************/
		if(relatedpersoncommunication.hasPreferred()) {
			r.setRltedPrsnCmmnctnPreferred(String.valueOf(relatedpersoncommunication.getPreferred()));
		}
		/******************** relatedpersonrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept relatedpersonrelationship = relatedperson.getRelationshipFirstRep();

		/******************** relatedpersonrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding relatedpersonrelationshipcoding = relatedpersonrelationship.getCodingFirstRep();

		/******************** RltedPrsn_Rltnship_Cdg_Dsply ********************************************************************************/
		if(relatedpersonrelationshipcoding.hasDisplay()) {
			r.setRltedPrsnRltnshipCdgDsply(String.valueOf(relatedpersonrelationshipcoding.getDisplay()));
		}
		/******************** RltedPrsn_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(relatedpersonrelationshipcoding.hasVersion()) {
			r.setRltedPrsnRltnshipCdgVrsn(String.valueOf(relatedpersonrelationshipcoding.getVersion()));
		}
		/******************** RltedPrsn_Rltnship_Cdg_Cd ********************************************************************************/
		if(relatedpersonrelationshipcoding.hasCode()) {
			r.setRltedPrsnRltnshipCdgCd(String.valueOf(relatedpersonrelationshipcoding.getCode()));
		}
		/******************** RltedPrsn_Rltnship_Cdg_Sys ********************************************************************************/
		if(relatedpersonrelationshipcoding.hasSystem()) {
			r.setRltedPrsnRltnshipCdgSys(String.valueOf(relatedpersonrelationshipcoding.getSystem()));
		}
		/******************** RltedPrsn_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(relatedpersonrelationshipcoding.hasUserSelected()) {
			r.setRltedPrsnRltnshipCdgUsrSltd(String.valueOf(relatedpersonrelationshipcoding.getUserSelected()));
		}
		/******************** RltedPrsn_Rltnship_Txt ********************************************************************************/
		if(relatedpersonrelationship.hasText()) {
			r.setRltedPrsnRltnshipTxt(String.valueOf(relatedpersonrelationship.getText()));
		}
		return r;
	}
}
