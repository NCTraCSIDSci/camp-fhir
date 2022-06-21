package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Person;
public class PersonBidirectionalConversion 
{
	public Person Persons(org.hl7.fhir.r4.model.Person person) throws ParseException
	{
		 main.java.com.campfhir.model.Person p = new  main.java.com.campfhir.model.Person();

		/******************** id ********************************************************************************/
		person.setId(p.getId());

		/******************** Prsn_ManagingOrgnztn ********************************************************************************/
		if(person.hasManagingOrganization()) {
			p.setPrsnManagingOrgnztn(String.valueOf(person.getManagingOrganization()));
		}
		/******************** personlink ********************************************************************************/
		org.hl7.fhir.r4.model.Person.PersonLinkComponent personlink = person.getLinkFirstRep();

		/******************** personlinkassurance ********************************************************************************/
		org.hl7.fhir.r4.model.Person.IdentityAssuranceLevel personlinkassurance = personlink.getAssurance();
		p.setPrsnLinkAssurance(personlinkassurance.toCode());

		/******************** personidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier personidentifier = person.getIdentifierFirstRep();

		/******************** Prsn_Id_Vl ********************************************************************************/
		if(personidentifier.hasValue()) {
			p.setPrsnIdVl(String.valueOf(personidentifier.getValue()));
		}
		/******************** personidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept personidentifiertype = personidentifier.getType();

		/******************** personidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding personidentifiertypecoding = personidentifiertype.getCodingFirstRep();

		/******************** Prsn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(personidentifiertypecoding.hasDisplay()) {
			p.setPrsnIdTypCdgDsply(String.valueOf(personidentifiertypecoding.getDisplay()));
		}
		/******************** Prsn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(personidentifiertypecoding.hasVersion()) {
			p.setPrsnIdTypCdgVrsn(String.valueOf(personidentifiertypecoding.getVersion()));
		}
		/******************** Prsn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(personidentifiertypecoding.hasCode()) {
			p.setPrsnIdTypCdgCd(String.valueOf(personidentifiertypecoding.getCode()));
		}
		/******************** Prsn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(personidentifiertypecoding.hasSystem()) {
			p.setPrsnIdTypCdgSys(String.valueOf(personidentifiertypecoding.getSystem()));
		}
		/******************** Prsn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(personidentifiertypecoding.hasUserSelected()) {
			p.setPrsnIdTypCdgUsrSltd(String.valueOf(personidentifiertypecoding.getUserSelected()));
		}
		/******************** Prsn_Id_Typ_Txt ********************************************************************************/
		if(personidentifiertype.hasText()) {
			p.setPrsnIdTypTxt(String.valueOf(personidentifiertype.getText()));
		}
		/******************** Prsn_Id_Sys ********************************************************************************/
		if(personidentifier.hasSystem()) {
			p.setPrsnIdSys(String.valueOf(personidentifier.getSystem()));
		}
		/******************** Prsn_Id_Assigner ********************************************************************************/
		if(personidentifier.hasAssigner()) {
			p.setPrsnIdAssigner(String.valueOf(personidentifier.getAssigner()));
		}
		/******************** personidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period personidentifierperiod = personidentifier.getPeriod();

		/******************** Prsn_Id_Prd_End ********************************************************************************/
		if(personidentifierperiod.hasEnd()) {
			p.setPrsnIdPrdEnd(String.valueOf(personidentifierperiod.getEnd()));
		}
		/******************** Prsn_Id_Prd_Strt ********************************************************************************/
		if(personidentifierperiod.hasStart()) {
			p.setPrsnIdPrdStrt(String.valueOf(personidentifierperiod.getStart()));
		}
		/******************** personidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse personidentifieruse = personidentifier.getUse();
		p.setPrsnIdUse(personidentifieruse.toCode());

		/******************** Prsn_Active ********************************************************************************/
		if(person.hasActive()) {
			p.setPrsnActive(String.valueOf(person.getActive()));
		}
		/******************** personname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName personname = person.getNameFirstRep();

		/******************** Prsn_Nm_Txt ********************************************************************************/
		if(personname.hasText()) {
			p.setPrsnNmTxt(String.valueOf(personname.getText()));
		}
		/******************** personnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period personnameperiod = personname.getPeriod();

		/******************** Prsn_Nm_Prd_End ********************************************************************************/
		if(personnameperiod.hasEnd()) {
			p.setPrsnNmPrdEnd(String.valueOf(personnameperiod.getEnd()));
		}
		/******************** Prsn_Nm_Prd_Strt ********************************************************************************/
		if(personnameperiod.hasStart()) {
			p.setPrsnNmPrdStrt(String.valueOf(personnameperiod.getStart()));
		}
		/******************** Prsn_Nm_Suffix ********************************************************************************/
		if(personname.hasSuffix()) {
			p.setPrsnNmSuffix(String.valueOf(personname.getSuffixAsSingleString()));
		}
		/******************** Prsn_Nm_Prefix ********************************************************************************/
		if(personname.hasPrefix()) {
			p.setPrsnNmPrefix(String.valueOf(personname.getPrefixAsSingleString()));
		}
		/******************** Prsn_Nm_Given ********************************************************************************/
		if(personname.hasGiven()) {
			p.setPrsnNmGiven(String.valueOf(personname.getGivenAsSingleString()));
		}
		/******************** Prsn_Nm_Fmly ********************************************************************************/
		if(personname.hasFamily()) {
			p.setPrsnNmFmly(String.valueOf(personname.getFamily()));
		}
		/******************** personnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUse personnameuse = personname.getUse();
		p.setPrsnNmUse(personnameuse.toCode());

		/******************** persontelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint persontelecom = person.getTelecomFirstRep();

		/******************** Prsn_Tlcm_Vl ********************************************************************************/
		if(persontelecom.hasValue()) {
			p.setPrsnTlcmVl(String.valueOf(persontelecom.getValue()));
		}
		/******************** persontelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem persontelecomsystem = persontelecom.getSystem();
		p.setPrsnTlcmSys(persontelecomsystem.toCode());

		/******************** persontelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period persontelecomperiod = persontelecom.getPeriod();

		/******************** Prsn_Tlcm_Prd_End ********************************************************************************/
		if(persontelecomperiod.hasEnd()) {
			p.setPrsnTlcmPrdEnd(String.valueOf(persontelecomperiod.getEnd()));
		}
		/******************** Prsn_Tlcm_Prd_Strt ********************************************************************************/
		if(persontelecomperiod.hasStart()) {
			p.setPrsnTlcmPrdStrt(String.valueOf(persontelecomperiod.getStart()));
		}
		/******************** persontelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse persontelecomuse = persontelecom.getUse();
		p.setPrsnTlcmUse(persontelecomuse.toCode());

		/******************** Prsn_Tlcm_Rnk ********************************************************************************/
		if(persontelecom.hasRank()) {
			p.setPrsnTlcmRnk(String.valueOf(persontelecom.getRank()));
		}
		/******************** personaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address personaddress = person.getAddressFirstRep();

		/******************** Prsn_Addr_State ********************************************************************************/
		if(personaddress.hasState()) {
			p.setPrsnAddrState(String.valueOf(personaddress.getState()));
		}
		/******************** personaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressType personaddresstype = personaddress.getType();
		p.setPrsnAddrTyp(personaddresstype.toCode());

		/******************** Prsn_Addr_Cntry ********************************************************************************/
		if(personaddress.hasCountry()) {
			p.setPrsnAddrCntry(String.valueOf(personaddress.getCountry()));
		}
		/******************** Prsn_Addr_Txt ********************************************************************************/
		if(personaddress.hasText()) {
			p.setPrsnAddrTxt(String.valueOf(personaddress.getText()));
		}
		/******************** personaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period personaddressperiod = personaddress.getPeriod();

		/******************** Prsn_Addr_Prd_End ********************************************************************************/
		if(personaddressperiod.hasEnd()) {
			p.setPrsnAddrPrdEnd(String.valueOf(personaddressperiod.getEnd()));
		}
		/******************** Prsn_Addr_Prd_Strt ********************************************************************************/
		if(personaddressperiod.hasStart()) {
			p.setPrsnAddrPrdStrt(String.valueOf(personaddressperiod.getStart()));
		}
		/******************** Prsn_Addr_PostalCd ********************************************************************************/
		if(personaddress.hasPostalCode()) {
			p.setPrsnAddrPostalCd(String.valueOf(personaddress.getPostalCode()));
		}
		/******************** Prsn_Addr_City ********************************************************************************/
		if(personaddress.hasCity()) {
			p.setPrsnAddrCity(String.valueOf(personaddress.getCity()));
		}
		/******************** Prsn_Addr_District ********************************************************************************/
		if(personaddress.hasDistrict()) {
			p.setPrsnAddrDistrict(String.valueOf(personaddress.getDistrict()));
		}
		/******************** personaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUse personaddressuse = personaddress.getUse();
		p.setPrsnAddrUse(personaddressuse.toCode());

		/******************** personphoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment personphoto = person.getPhoto();

		/******************** Prsn_Photo_Sz ********************************************************************************/
		if(personphoto.hasSize()) {
			p.setPrsnPhotoSz(String.valueOf(personphoto.getSize()));
		}
		/******************** Prsn_Photo_Lnguage ********************************************************************************/
		if(personphoto.hasLanguage()) {
			p.setPrsnPhotoLnguage(String.valueOf(personphoto.getLanguage()));
		}
		/******************** Prsn_Photo_CntntTyp ********************************************************************************/
		if(personphoto.hasContentType()) {
			p.setPrsnPhotoCntntTyp(String.valueOf(personphoto.getContentType()));
		}
		/******************** Prsn_Photo_Url ********************************************************************************/
		if(personphoto.hasUrl()) {
			p.setPrsnPhotoUrl(String.valueOf(personphoto.getUrl()));
		}
		/******************** Prsn_Photo_Ttl ********************************************************************************/
		if(personphoto.hasTitle()) {
			p.setPrsnPhotoTtl(String.valueOf(personphoto.getTitle()));
		}
		/******************** Prsn_Photo_Hash ********************************************************************************/
		if(personphoto.hasHash()) {
			p.setPrsnPhotoHash(String.valueOf(personphoto.getHash()));
		}

		/******************** Prsn_Photo_Data ********************************************************************************/
		if(personphoto.hasData()) {
			p.setPrsnPhotoData(String.valueOf(personphoto.getData()));
		}

		/******************** Prsn_Photo_Creation ********************************************************************************/
		if(personphoto.hasCreation()) {
			p.setPrsnPhotoCreation(String.valueOf(personphoto.getCreation()));
		}
		/******************** Prsn_BirthDt ********************************************************************************/
		if(person.hasBirthDate()) {
			p.setPrsnBirthDt(String.valueOf(person.getBirthDate()));
		}
		/******************** persongender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender persongender = person.getGender();
		p.setPrsnGender(persongender.toCode());

		return p;
	}
}
