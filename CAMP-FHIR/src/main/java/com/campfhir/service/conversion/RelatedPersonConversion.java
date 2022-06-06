package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RelatedPerson;
public class RelatedPersonConversion 
{
	public org.hl7.fhir.r4.model.RelatedPerson RelatedPersons(RelatedPerson r) throws ParseException
	{
		org.hl7.fhir.r4.model.RelatedPerson relatedperson = new org.hl7.fhir.r4.model.RelatedPerson();

		/******************** id ********************************************************************************/
		relatedperson.setId(r.getId());

		/******************** RltedPrsn_Active ********************************************************************************/
		if(r.getRltedPrsnActive() != null) {
			relatedperson.setActive(Boolean.parseBoolean(r.getRltedPrsnActive()));
		}
		/******************** relatedpersonaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address relatedpersonaddress =  new org.hl7.fhir.r4.model.Address();
		relatedperson.addAddress(relatedpersonaddress);

		/******************** RltedPrsn_Addr_City ********************************************************************************/
		if(r.getRltedPrsnAddrCity() != null) {
			relatedpersonaddress.setCity(r.getRltedPrsnAddrCity());
		}
		/******************** RltedPrsn_Addr_Cntry ********************************************************************************/
		if(r.getRltedPrsnAddrCntry() != null) {
			relatedpersonaddress.setCountry(r.getRltedPrsnAddrCntry());
		}
		/******************** RltedPrsn_Addr_District ********************************************************************************/
		if(r.getRltedPrsnAddrDistrict() != null) {
			relatedpersonaddress.setDistrict(r.getRltedPrsnAddrDistrict());
		}
		/******************** RltedPrsn_Addr_Line ********************************************************************************/
		if(r.getRltedPrsnAddrLine() != null) {
			relatedpersonaddress.addLine(r.getRltedPrsnAddrLine());
		}
		/******************** relatedpersonaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonaddressperiod =  new org.hl7.fhir.r4.model.Period();
		relatedpersonaddress.setPeriod(relatedpersonaddressperiod);

		/******************** RltedPrsn_Addr_Prd_End ********************************************************************************/
		if(r.getRltedPrsnAddrPrdEnd() != null) {
			java.text.SimpleDateFormat RltedPrsn_Addr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Addr_Prd_Enddate = RltedPrsn_Addr_Prd_Endsdf.parse(r.getRltedPrsnAddrPrdEnd());
			relatedpersonaddressperiod.setEnd(RltedPrsn_Addr_Prd_Enddate);
		}
		/******************** RltedPrsn_Addr_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnAddrPrdStrt() != null) {
			java.text.SimpleDateFormat RltedPrsn_Addr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Addr_Prd_Strtdate = RltedPrsn_Addr_Prd_Strtsdf.parse(r.getRltedPrsnAddrPrdStrt());
			relatedpersonaddressperiod.setStart(RltedPrsn_Addr_Prd_Strtdate);
		}
		/******************** RltedPrsn_Addr_PostalCd ********************************************************************************/
		if(r.getRltedPrsnAddrPostalCd() != null) {
			relatedpersonaddress.setPostalCode(r.getRltedPrsnAddrPostalCd());
		}
		/******************** RltedPrsn_Addr_State ********************************************************************************/
		if(r.getRltedPrsnAddrState() != null) {
			relatedpersonaddress.setState(r.getRltedPrsnAddrState());
		}
		/******************** RltedPrsn_Addr_Txt ********************************************************************************/
		if(r.getRltedPrsnAddrTxt() != null) {
			relatedpersonaddress.setText(r.getRltedPrsnAddrTxt());
		}
		/******************** relatedpersonaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory relatedpersonaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		relatedpersonaddress.setType(relatedpersonaddresstype.fromCode(r.getRltedPrsnAddrTyp()));

		/******************** relatedpersonaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory relatedpersonaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		relatedpersonaddress.setUse(relatedpersonaddressuse.fromCode(r.getRltedPrsnAddrUse()));

		/******************** RltedPrsn_BirthDt ********************************************************************************/
		if(r.getRltedPrsnBirthDt() != null) {
			java.text.SimpleDateFormat RltedPrsn_BirthDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_BirthDtdate = RltedPrsn_BirthDtsdf.parse(r.getRltedPrsnBirthDt());
			relatedperson.setBirthDate(RltedPrsn_BirthDtdate);
		}
		/******************** relatedpersoncommunication ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedPerson.RelatedPersonCommunicationComponent relatedpersoncommunication =  new org.hl7.fhir.r4.model.RelatedPerson.RelatedPersonCommunicationComponent();
		relatedperson.addCommunication(relatedpersoncommunication);

		/******************** relatedpersoncommunicationlanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept relatedpersoncommunicationlanguage =  new org.hl7.fhir.r4.model.CodeableConcept();
		relatedpersoncommunication.setLanguage(relatedpersoncommunicationlanguage);

		/******************** relatedpersoncommunicationlanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding relatedpersoncommunicationlanguagecoding =  new org.hl7.fhir.r4.model.Coding();
		relatedpersoncommunicationlanguage.addCoding(relatedpersoncommunicationlanguagecoding);

		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Cd ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgCd() != null) {
			relatedpersoncommunicationlanguagecoding.setCode(r.getRltedPrsnCmmnctnLnguageCdgCd());
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Dsply ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgDsply() != null) {
			relatedpersoncommunicationlanguagecoding.setDisplay(r.getRltedPrsnCmmnctnLnguageCdgDsply());
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Sys ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgSys() != null) {
			relatedpersoncommunicationlanguagecoding.setSystem(r.getRltedPrsnCmmnctnLnguageCdgSys());
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgUsrSltd() != null) {
			relatedpersoncommunicationlanguagecoding.setUserSelected(Boolean.parseBoolean(r.getRltedPrsnCmmnctnLnguageCdgUsrSltd()));
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageCdgVrsn() != null) {
			relatedpersoncommunicationlanguagecoding.setVersion(r.getRltedPrsnCmmnctnLnguageCdgVrsn());
		}
		/******************** RltedPrsn_Cmmnctn_Lnguage_Txt ********************************************************************************/
		if(r.getRltedPrsnCmmnctnLnguageTxt() != null) {
			relatedpersoncommunicationlanguage.setText(r.getRltedPrsnCmmnctnLnguageTxt());
		}
		/******************** RltedPrsn_Cmmnctn_Preferred ********************************************************************************/
		if(r.getRltedPrsnCmmnctnPreferred() != null) {
			relatedpersoncommunication.setPreferred(Boolean.parseBoolean(r.getRltedPrsnCmmnctnPreferred()));
		}
		/******************** relatedpersongender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory relatedpersongender =  new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();
		relatedperson.setGender(relatedpersongender.fromCode(r.getRltedPrsnGender()));

		/******************** relatedpersonidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier relatedpersonidentifier =  new org.hl7.fhir.r4.model.Identifier();
		relatedperson.addIdentifier(relatedpersonidentifier);

		/******************** RltedPrsn_Id_Assigner ********************************************************************************/
		if(r.getRltedPrsnIdAssigner() != null) {
			relatedpersonidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(r.getRltedPrsnIdAssigner()));
		}
		/******************** relatedpersonidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		relatedpersonidentifier.setPeriod(relatedpersonidentifierperiod);

		/******************** RltedPrsn_Id_Prd_End ********************************************************************************/
		if(r.getRltedPrsnIdPrdEnd() != null) {
			java.text.SimpleDateFormat RltedPrsn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Id_Prd_Enddate = RltedPrsn_Id_Prd_Endsdf.parse(r.getRltedPrsnIdPrdEnd());
			relatedpersonidentifierperiod.setEnd(RltedPrsn_Id_Prd_Enddate);
		}
		/******************** RltedPrsn_Id_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnIdPrdStrt() != null) {
			java.text.SimpleDateFormat RltedPrsn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Id_Prd_Strtdate = RltedPrsn_Id_Prd_Strtsdf.parse(r.getRltedPrsnIdPrdStrt());
			relatedpersonidentifierperiod.setStart(RltedPrsn_Id_Prd_Strtdate);
		}
		/******************** RltedPrsn_Id_Sys ********************************************************************************/
		if(r.getRltedPrsnIdSys() != null) {
			relatedpersonidentifier.setSystem(r.getRltedPrsnIdSys());
		}
		/******************** relatedpersonidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept relatedpersonidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		relatedpersonidentifier.setType(relatedpersonidentifiertype);

		/******************** relatedpersonidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding relatedpersonidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		relatedpersonidentifiertype.addCoding(relatedpersonidentifiertypecoding);

		/******************** RltedPrsn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgCd() != null) {
			relatedpersonidentifiertypecoding.setCode(r.getRltedPrsnIdTypCdgCd());
		}
		/******************** RltedPrsn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgDsply() != null) {
			relatedpersonidentifiertypecoding.setDisplay(r.getRltedPrsnIdTypCdgDsply());
		}
		/******************** RltedPrsn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgSys() != null) {
			relatedpersonidentifiertypecoding.setSystem(r.getRltedPrsnIdTypCdgSys());
		}
		/******************** RltedPrsn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgUsrSltd() != null) {
			relatedpersonidentifiertypecoding.setUserSelected(Boolean.parseBoolean(r.getRltedPrsnIdTypCdgUsrSltd()));
		}
		/******************** RltedPrsn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRltedPrsnIdTypCdgVrsn() != null) {
			relatedpersonidentifiertypecoding.setVersion(r.getRltedPrsnIdTypCdgVrsn());
		}
		/******************** RltedPrsn_Id_Typ_Txt ********************************************************************************/
		if(r.getRltedPrsnIdTypTxt() != null) {
			relatedpersonidentifiertype.setText(r.getRltedPrsnIdTypTxt());
		}
		/******************** relatedpersonidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory relatedpersonidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		relatedpersonidentifier.setUse(relatedpersonidentifieruse.fromCode(r.getRltedPrsnIdUse()));

		/******************** RltedPrsn_Id_Vl ********************************************************************************/
		if(r.getRltedPrsnIdVl() != null) {
			relatedpersonidentifier.setValue(r.getRltedPrsnIdVl());
		}
		/******************** relatedpersonname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName relatedpersonname =  new org.hl7.fhir.r4.model.HumanName();
		relatedperson.addName(relatedpersonname);

		/******************** RltedPrsn_Nm_Fmly ********************************************************************************/
		if(r.getRltedPrsnNmFmly() != null) {
			relatedpersonname.setFamily(r.getRltedPrsnNmFmly());
		}
		/******************** RltedPrsn_Nm_Given ********************************************************************************/
		if(r.getRltedPrsnNmGiven() != null) {
			relatedpersonname.addGiven(r.getRltedPrsnNmGiven());
		}
		/******************** relatedpersonnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonnameperiod =  new org.hl7.fhir.r4.model.Period();
		relatedpersonname.setPeriod(relatedpersonnameperiod);

		/******************** RltedPrsn_Nm_Prd_End ********************************************************************************/
		if(r.getRltedPrsnNmPrdEnd() != null) {
			java.text.SimpleDateFormat RltedPrsn_Nm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Nm_Prd_Enddate = RltedPrsn_Nm_Prd_Endsdf.parse(r.getRltedPrsnNmPrdEnd());
			relatedpersonnameperiod.setEnd(RltedPrsn_Nm_Prd_Enddate);
		}
		/******************** RltedPrsn_Nm_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnNmPrdStrt() != null) {
			java.text.SimpleDateFormat RltedPrsn_Nm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Nm_Prd_Strtdate = RltedPrsn_Nm_Prd_Strtsdf.parse(r.getRltedPrsnNmPrdStrt());
			relatedpersonnameperiod.setStart(RltedPrsn_Nm_Prd_Strtdate);
		}
		/******************** RltedPrsn_Nm_Prefix ********************************************************************************/
		if(r.getRltedPrsnNmPrefix() != null) {
			relatedpersonname.addPrefix(r.getRltedPrsnNmPrefix());
		}
		/******************** RltedPrsn_Nm_Suffix ********************************************************************************/
		if(r.getRltedPrsnNmSuffix() != null) {
			relatedpersonname.addSuffix(r.getRltedPrsnNmSuffix());
		}
		/******************** RltedPrsn_Nm_Txt ********************************************************************************/
		if(r.getRltedPrsnNmTxt() != null) {
			relatedpersonname.setText(r.getRltedPrsnNmTxt());
		}
		/******************** relatedpersonnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory relatedpersonnameuse =  new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();
		relatedpersonname.setUse(relatedpersonnameuse.fromCode(r.getRltedPrsnNmUse()));

		/******************** RltedPrsn_Pnt ********************************************************************************/
		if(r.getRltedPrsnPnt() != null) {
			relatedperson.setPatient( new org.hl7.fhir.r4.model.Reference(r.getRltedPrsnPnt()));
		}
		/******************** relatedpersonperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersonperiod =  new org.hl7.fhir.r4.model.Period();
		relatedperson.setPeriod(relatedpersonperiod);

		/******************** RltedPrsn_Prd_End ********************************************************************************/
		if(r.getRltedPrsnPrdEnd() != null) {
			java.text.SimpleDateFormat RltedPrsn_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Prd_Enddate = RltedPrsn_Prd_Endsdf.parse(r.getRltedPrsnPrdEnd());
			relatedpersonperiod.setEnd(RltedPrsn_Prd_Enddate);
		}
		/******************** RltedPrsn_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnPrdStrt() != null) {
			java.text.SimpleDateFormat RltedPrsn_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Prd_Strtdate = RltedPrsn_Prd_Strtsdf.parse(r.getRltedPrsnPrdStrt());
			relatedpersonperiod.setStart(RltedPrsn_Prd_Strtdate);
		}
		/******************** relatedpersonphoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment relatedpersonphoto =  new org.hl7.fhir.r4.model.Attachment();
		relatedperson.addPhoto(relatedpersonphoto);

		/******************** RltedPrsn_Photo_CntntTyp ********************************************************************************/
		if(r.getRltedPrsnPhotoCntntTyp() != null) {
			relatedpersonphoto.setContentType(r.getRltedPrsnPhotoCntntTyp());
		}
		/******************** RltedPrsn_Photo_Creation ********************************************************************************/
		if(r.getRltedPrsnPhotoCreation() != null) {
			java.text.SimpleDateFormat RltedPrsn_Photo_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Photo_Creationdate = RltedPrsn_Photo_Creationsdf.parse(r.getRltedPrsnPhotoCreation());
			relatedpersonphoto.setCreation(RltedPrsn_Photo_Creationdate);
		}
		/******************** RltedPrsn_Photo_Data ********************************************************************************/
		if(r.getRltedPrsnPhotoData() != null) {
			relatedpersonphoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRltedPrsnPhotoData()));
		}
		/******************** RltedPrsn_Photo_Hash ********************************************************************************/
		if(r.getRltedPrsnPhotoHash() != null) {
			relatedpersonphoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(r.getRltedPrsnPhotoHash()));
		}
		/******************** RltedPrsn_Photo_Lnguage ********************************************************************************/
		if(r.getRltedPrsnPhotoLnguage() != null) {
			relatedpersonphoto.setLanguage(r.getRltedPrsnPhotoLnguage());
		}
		/******************** RltedPrsn_Photo_Sz ********************************************************************************/
		if(r.getRltedPrsnPhotoSz() != null) {
			relatedpersonphoto.setSize(Integer.parseInt(r.getRltedPrsnPhotoSz()));
		}
		/******************** RltedPrsn_Photo_Ttl ********************************************************************************/
		if(r.getRltedPrsnPhotoTtl() != null) {
			relatedpersonphoto.setTitle(r.getRltedPrsnPhotoTtl());
		}
		/******************** RltedPrsn_Photo_Url ********************************************************************************/
		if(r.getRltedPrsnPhotoUrl() != null) {
			relatedpersonphoto.setUrl(r.getRltedPrsnPhotoUrl());
		}
		/******************** relatedpersonrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept relatedpersonrelationship =  new org.hl7.fhir.r4.model.CodeableConcept();
		relatedperson.addRelationship(relatedpersonrelationship);

		/******************** relatedpersonrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding relatedpersonrelationshipcoding =  new org.hl7.fhir.r4.model.Coding();
		relatedpersonrelationship.addCoding(relatedpersonrelationshipcoding);

		/******************** RltedPrsn_Rltnship_Cdg_Cd ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgCd() != null) {
			relatedpersonrelationshipcoding.setCode(r.getRltedPrsnRltnshipCdgCd());
		}
		/******************** RltedPrsn_Rltnship_Cdg_Dsply ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgDsply() != null) {
			relatedpersonrelationshipcoding.setDisplay(r.getRltedPrsnRltnshipCdgDsply());
		}
		/******************** RltedPrsn_Rltnship_Cdg_Sys ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgSys() != null) {
			relatedpersonrelationshipcoding.setSystem(r.getRltedPrsnRltnshipCdgSys());
		}
		/******************** RltedPrsn_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgUsrSltd() != null) {
			relatedpersonrelationshipcoding.setUserSelected(Boolean.parseBoolean(r.getRltedPrsnRltnshipCdgUsrSltd()));
		}
		/******************** RltedPrsn_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(r.getRltedPrsnRltnshipCdgVrsn() != null) {
			relatedpersonrelationshipcoding.setVersion(r.getRltedPrsnRltnshipCdgVrsn());
		}
		/******************** RltedPrsn_Rltnship_Txt ********************************************************************************/
		if(r.getRltedPrsnRltnshipTxt() != null) {
			relatedpersonrelationship.setText(r.getRltedPrsnRltnshipTxt());
		}
		/******************** relatedpersontelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint relatedpersontelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		relatedperson.addTelecom(relatedpersontelecom);

		/******************** relatedpersontelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period relatedpersontelecomperiod =  new org.hl7.fhir.r4.model.Period();
		relatedpersontelecom.setPeriod(relatedpersontelecomperiod);

		/******************** RltedPrsn_Tlcm_Prd_End ********************************************************************************/
		if(r.getRltedPrsnTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat RltedPrsn_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Tlcm_Prd_Enddate = RltedPrsn_Tlcm_Prd_Endsdf.parse(r.getRltedPrsnTlcmPrdEnd());
			relatedpersontelecomperiod.setEnd(RltedPrsn_Tlcm_Prd_Enddate);
		}
		/******************** RltedPrsn_Tlcm_Prd_Strt ********************************************************************************/
		if(r.getRltedPrsnTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat RltedPrsn_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RltedPrsn_Tlcm_Prd_Strtdate = RltedPrsn_Tlcm_Prd_Strtsdf.parse(r.getRltedPrsnTlcmPrdStrt());
			relatedpersontelecomperiod.setStart(RltedPrsn_Tlcm_Prd_Strtdate);
		}
		/******************** RltedPrsn_Tlcm_Rnk ********************************************************************************/
		if(r.getRltedPrsnTlcmRnk() != null) {
			relatedpersontelecom.setRank(Integer.parseInt(r.getRltedPrsnTlcmRnk()));
		}
		/******************** relatedpersontelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory relatedpersontelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		relatedpersontelecom.setSystem(relatedpersontelecomsystem.fromCode(r.getRltedPrsnTlcmSys()));

		/******************** relatedpersontelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory relatedpersontelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		relatedpersontelecom.setUse(relatedpersontelecomuse.fromCode(r.getRltedPrsnTlcmUse()));

		/******************** RltedPrsn_Tlcm_Vl ********************************************************************************/
		if(r.getRltedPrsnTlcmVl() != null) {
			relatedpersontelecom.setValue(r.getRltedPrsnTlcmVl());
		}
		return relatedperson;
	}
}
