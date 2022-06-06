package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Person;
public class PersonConversion 
{
	public org.hl7.fhir.r4.model.Person Persons(Person p) throws ParseException
	{
		org.hl7.fhir.r4.model.Person person = new org.hl7.fhir.r4.model.Person();

		/******************** id ********************************************************************************/
		person.setId(p.getId());

		/******************** Prsn_Active ********************************************************************************/
		if(p.getPrsnActive() != null) {
			person.setActive(Boolean.parseBoolean(p.getPrsnActive()));
		}
		/******************** personaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address personaddress =  new org.hl7.fhir.r4.model.Address();
		person.addAddress(personaddress);

		/******************** Prsn_Addr_City ********************************************************************************/
		if(p.getPrsnAddrCity() != null) {
			personaddress.setCity(p.getPrsnAddrCity());
		}
		/******************** Prsn_Addr_Cntry ********************************************************************************/
		if(p.getPrsnAddrCntry() != null) {
			personaddress.setCountry(p.getPrsnAddrCntry());
		}
		/******************** Prsn_Addr_District ********************************************************************************/
		if(p.getPrsnAddrDistrict() != null) {
			personaddress.setDistrict(p.getPrsnAddrDistrict());
		}
		/******************** Prsn_Addr_Line ********************************************************************************/
		if(p.getPrsnAddrLine() != null) {
			personaddress.addLine(p.getPrsnAddrLine());
		}
		/******************** personaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period personaddressperiod =  new org.hl7.fhir.r4.model.Period();
		personaddress.setPeriod(personaddressperiod);

		/******************** Prsn_Addr_Prd_End ********************************************************************************/
		if(p.getPrsnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat Prsn_Addr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_Addr_Prd_Enddate = Prsn_Addr_Prd_Endsdf.parse(p.getPrsnAddrPrdEnd());
			personaddressperiod.setEnd(Prsn_Addr_Prd_Enddate);
		}
		/******************** Prsn_Addr_Prd_Strt ********************************************************************************/
		if(p.getPrsnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat Prsn_Addr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_Addr_Prd_Strtdate = Prsn_Addr_Prd_Strtsdf.parse(p.getPrsnAddrPrdStrt());
			personaddressperiod.setStart(Prsn_Addr_Prd_Strtdate);
		}
		/******************** Prsn_Addr_PostalCd ********************************************************************************/
		if(p.getPrsnAddrPostalCd() != null) {
			personaddress.setPostalCode(p.getPrsnAddrPostalCd());
		}
		/******************** Prsn_Addr_State ********************************************************************************/
		if(p.getPrsnAddrState() != null) {
			personaddress.setState(p.getPrsnAddrState());
		}
		/******************** Prsn_Addr_Txt ********************************************************************************/
		if(p.getPrsnAddrTxt() != null) {
			personaddress.setText(p.getPrsnAddrTxt());
		}
		/******************** personaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory personaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		personaddress.setType(personaddresstype.fromCode(p.getPrsnAddrTyp()));

		/******************** personaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory personaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		personaddress.setUse(personaddressuse.fromCode(p.getPrsnAddrUse()));

		/******************** Prsn_BirthDt ********************************************************************************/
		if(p.getPrsnBirthDt() != null) {
			java.text.SimpleDateFormat Prsn_BirthDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_BirthDtdate = Prsn_BirthDtsdf.parse(p.getPrsnBirthDt());
			person.setBirthDate(Prsn_BirthDtdate);
		}
		/******************** persongender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory persongender =  new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();
		person.setGender(persongender.fromCode(p.getPrsnGender()));

		/******************** personidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier personidentifier =  new org.hl7.fhir.r4.model.Identifier();
		person.addIdentifier(personidentifier);

		/******************** Prsn_Id_Assigner ********************************************************************************/
		if(p.getPrsnIdAssigner() != null) {
			personidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPrsnIdAssigner()));
		}
		/******************** personidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period personidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		personidentifier.setPeriod(personidentifierperiod);

		/******************** Prsn_Id_Prd_End ********************************************************************************/
		if(p.getPrsnIdPrdEnd() != null) {
			java.text.SimpleDateFormat Prsn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_Id_Prd_Enddate = Prsn_Id_Prd_Endsdf.parse(p.getPrsnIdPrdEnd());
			personidentifierperiod.setEnd(Prsn_Id_Prd_Enddate);
		}
		/******************** Prsn_Id_Prd_Strt ********************************************************************************/
		if(p.getPrsnIdPrdStrt() != null) {
			java.text.SimpleDateFormat Prsn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_Id_Prd_Strtdate = Prsn_Id_Prd_Strtsdf.parse(p.getPrsnIdPrdStrt());
			personidentifierperiod.setStart(Prsn_Id_Prd_Strtdate);
		}
		/******************** Prsn_Id_Sys ********************************************************************************/
		if(p.getPrsnIdSys() != null) {
			personidentifier.setSystem(p.getPrsnIdSys());
		}
		/******************** personidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept personidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		personidentifier.setType(personidentifiertype);

		/******************** personidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding personidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		personidentifiertype.addCoding(personidentifiertypecoding);

		/******************** Prsn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrsnIdTypCdgCd() != null) {
			personidentifiertypecoding.setCode(p.getPrsnIdTypCdgCd());
		}
		/******************** Prsn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrsnIdTypCdgDsply() != null) {
			personidentifiertypecoding.setDisplay(p.getPrsnIdTypCdgDsply());
		}
		/******************** Prsn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrsnIdTypCdgSys() != null) {
			personidentifiertypecoding.setSystem(p.getPrsnIdTypCdgSys());
		}
		/******************** Prsn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrsnIdTypCdgUsrSltd() != null) {
			personidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPrsnIdTypCdgUsrSltd()));
		}
		/******************** Prsn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrsnIdTypCdgVrsn() != null) {
			personidentifiertypecoding.setVersion(p.getPrsnIdTypCdgVrsn());
		}
		/******************** Prsn_Id_Typ_Txt ********************************************************************************/
		if(p.getPrsnIdTypTxt() != null) {
			personidentifiertype.setText(p.getPrsnIdTypTxt());
		}
		/******************** personidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory personidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		personidentifier.setUse(personidentifieruse.fromCode(p.getPrsnIdUse()));

		/******************** Prsn_Id_Vl ********************************************************************************/
		if(p.getPrsnIdVl() != null) {
			personidentifier.setValue(p.getPrsnIdVl());
		}
		/******************** personlink ********************************************************************************/
		org.hl7.fhir.r4.model.Person.PersonLinkComponent personlink =  new org.hl7.fhir.r4.model.Person.PersonLinkComponent();
		person.addLink(personlink);

		/******************** personlinkassurance ********************************************************************************/
		org.hl7.fhir.r4.model.Person.IdentityAssuranceLevelEnumFactory personlinkassurance =  new org.hl7.fhir.r4.model.Person.IdentityAssuranceLevelEnumFactory();
		personlink.setAssurance(personlinkassurance.fromCode(p.getPrsnLinkAssurance()));

		/******************** Prsn_ManagingOrgnztn ********************************************************************************/
		if(p.getPrsnManagingOrgnztn() != null) {
			person.setManagingOrganization( new org.hl7.fhir.r4.model.Reference(p.getPrsnManagingOrgnztn()));
		}
		/******************** personname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName personname =  new org.hl7.fhir.r4.model.HumanName();
		person.addName(personname);

		/******************** Prsn_Nm_Fmly ********************************************************************************/
		if(p.getPrsnNmFmly() != null) {
			personname.setFamily(p.getPrsnNmFmly());
		}
		/******************** Prsn_Nm_Given ********************************************************************************/
		if(p.getPrsnNmGiven() != null) {
			personname.addGiven(p.getPrsnNmGiven());
		}
		/******************** personnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period personnameperiod =  new org.hl7.fhir.r4.model.Period();
		personname.setPeriod(personnameperiod);

		/******************** Prsn_Nm_Prd_End ********************************************************************************/
		if(p.getPrsnNmPrdEnd() != null) {
			java.text.SimpleDateFormat Prsn_Nm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_Nm_Prd_Enddate = Prsn_Nm_Prd_Endsdf.parse(p.getPrsnNmPrdEnd());
			personnameperiod.setEnd(Prsn_Nm_Prd_Enddate);
		}
		/******************** Prsn_Nm_Prd_Strt ********************************************************************************/
		if(p.getPrsnNmPrdStrt() != null) {
			java.text.SimpleDateFormat Prsn_Nm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_Nm_Prd_Strtdate = Prsn_Nm_Prd_Strtsdf.parse(p.getPrsnNmPrdStrt());
			personnameperiod.setStart(Prsn_Nm_Prd_Strtdate);
		}
		/******************** Prsn_Nm_Prefix ********************************************************************************/
		if(p.getPrsnNmPrefix() != null) {
			personname.addPrefix(p.getPrsnNmPrefix());
		}
		/******************** Prsn_Nm_Suffix ********************************************************************************/
		if(p.getPrsnNmSuffix() != null) {
			personname.addSuffix(p.getPrsnNmSuffix());
		}
		/******************** Prsn_Nm_Txt ********************************************************************************/
		if(p.getPrsnNmTxt() != null) {
			personname.setText(p.getPrsnNmTxt());
		}
		/******************** personnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory personnameuse =  new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();
		personname.setUse(personnameuse.fromCode(p.getPrsnNmUse()));

		/******************** personphoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment personphoto =  new org.hl7.fhir.r4.model.Attachment();
		person.setPhoto(personphoto);

		/******************** Prsn_Photo_CntntTyp ********************************************************************************/
		if(p.getPrsnPhotoCntntTyp() != null) {
			personphoto.setContentType(p.getPrsnPhotoCntntTyp());
		}
		/******************** Prsn_Photo_Creation ********************************************************************************/
		if(p.getPrsnPhotoCreation() != null) {
			java.text.SimpleDateFormat Prsn_Photo_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_Photo_Creationdate = Prsn_Photo_Creationsdf.parse(p.getPrsnPhotoCreation());
			personphoto.setCreation(Prsn_Photo_Creationdate);
		}
		/******************** Prsn_Photo_Data ********************************************************************************/
		if(p.getPrsnPhotoData() != null) {
			personphoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPrsnPhotoData()));
		}
		/******************** Prsn_Photo_Hash ********************************************************************************/
		if(p.getPrsnPhotoHash() != null) {
			personphoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPrsnPhotoHash()));
		}
		/******************** Prsn_Photo_Lnguage ********************************************************************************/
		if(p.getPrsnPhotoLnguage() != null) {
			personphoto.setLanguage(p.getPrsnPhotoLnguage());
		}
		/******************** Prsn_Photo_Sz ********************************************************************************/
		if(p.getPrsnPhotoSz() != null) {
			personphoto.setSize(Integer.parseInt(p.getPrsnPhotoSz()));
		}
		/******************** Prsn_Photo_Ttl ********************************************************************************/
		if(p.getPrsnPhotoTtl() != null) {
			personphoto.setTitle(p.getPrsnPhotoTtl());
		}
		/******************** Prsn_Photo_Url ********************************************************************************/
		if(p.getPrsnPhotoUrl() != null) {
			personphoto.setUrl(p.getPrsnPhotoUrl());
		}
		/******************** persontelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint persontelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		person.addTelecom(persontelecom);

		/******************** persontelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period persontelecomperiod =  new org.hl7.fhir.r4.model.Period();
		persontelecom.setPeriod(persontelecomperiod);

		/******************** Prsn_Tlcm_Prd_End ********************************************************************************/
		if(p.getPrsnTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Prsn_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_Tlcm_Prd_Enddate = Prsn_Tlcm_Prd_Endsdf.parse(p.getPrsnTlcmPrdEnd());
			persontelecomperiod.setEnd(Prsn_Tlcm_Prd_Enddate);
		}
		/******************** Prsn_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPrsnTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Prsn_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prsn_Tlcm_Prd_Strtdate = Prsn_Tlcm_Prd_Strtsdf.parse(p.getPrsnTlcmPrdStrt());
			persontelecomperiod.setStart(Prsn_Tlcm_Prd_Strtdate);
		}
		/******************** Prsn_Tlcm_Rnk ********************************************************************************/
		if(p.getPrsnTlcmRnk() != null) {
			persontelecom.setRank(Integer.parseInt(p.getPrsnTlcmRnk()));
		}
		/******************** persontelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory persontelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		persontelecom.setSystem(persontelecomsystem.fromCode(p.getPrsnTlcmSys()));

		/******************** persontelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory persontelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		persontelecom.setUse(persontelecomuse.fromCode(p.getPrsnTlcmUse()));

		/******************** Prsn_Tlcm_Vl ********************************************************************************/
		if(p.getPrsnTlcmVl() != null) {
			persontelecom.setValue(p.getPrsnTlcmVl());
		}
		return person;
	}
}
