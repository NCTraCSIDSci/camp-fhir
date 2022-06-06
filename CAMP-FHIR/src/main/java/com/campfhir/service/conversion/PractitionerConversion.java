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

		/******************** Prctitnr_Active ********************************************************************************/
		if(p.getPrctitnrActive() != null) {
			practitioner.setActive(Boolean.parseBoolean(p.getPrctitnrActive()));
		}
		/******************** practitioneraddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address practitioneraddress =  new org.hl7.fhir.r4.model.Address();
		practitioner.addAddress(practitioneraddress);

		/******************** Prctitnr_Addr_City ********************************************************************************/
		if(p.getPrctitnrAddrCity() != null) {
			practitioneraddress.setCity(p.getPrctitnrAddrCity());
		}
		/******************** Prctitnr_Addr_Cntry ********************************************************************************/
		if(p.getPrctitnrAddrCntry() != null) {
			practitioneraddress.setCountry(p.getPrctitnrAddrCntry());
		}
		/******************** Prctitnr_Addr_District ********************************************************************************/
		if(p.getPrctitnrAddrDistrict() != null) {
			practitioneraddress.setDistrict(p.getPrctitnrAddrDistrict());
		}
		/******************** Prctitnr_Addr_Line ********************************************************************************/
		if(p.getPrctitnrAddrLine() != null) {
			practitioneraddress.addLine(p.getPrctitnrAddrLine());
		}
		/******************** practitioneraddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitioneraddressperiod =  new org.hl7.fhir.r4.model.Period();
		practitioneraddress.setPeriod(practitioneraddressperiod);

		/******************** Prctitnr_Addr_Prd_End ********************************************************************************/
		if(p.getPrctitnrAddrPrdEnd() != null) {
			java.text.SimpleDateFormat Prctitnr_Addr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Addr_Prd_Enddate = Prctitnr_Addr_Prd_Endsdf.parse(p.getPrctitnrAddrPrdEnd());
			practitioneraddressperiod.setEnd(Prctitnr_Addr_Prd_Enddate);
		}
		/******************** Prctitnr_Addr_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrAddrPrdStrt() != null) {
			java.text.SimpleDateFormat Prctitnr_Addr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Addr_Prd_Strtdate = Prctitnr_Addr_Prd_Strtsdf.parse(p.getPrctitnrAddrPrdStrt());
			practitioneraddressperiod.setStart(Prctitnr_Addr_Prd_Strtdate);
		}
		/******************** Prctitnr_Addr_PostalCd ********************************************************************************/
		if(p.getPrctitnrAddrPostalCd() != null) {
			practitioneraddress.setPostalCode(p.getPrctitnrAddrPostalCd());
		}
		/******************** Prctitnr_Addr_State ********************************************************************************/
		if(p.getPrctitnrAddrState() != null) {
			practitioneraddress.setState(p.getPrctitnrAddrState());
		}
		/******************** Prctitnr_Addr_Txt ********************************************************************************/
		if(p.getPrctitnrAddrTxt() != null) {
			practitioneraddress.setText(p.getPrctitnrAddrTxt());
		}
		/******************** practitioneraddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory practitioneraddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		practitioneraddress.setType(practitioneraddresstype.fromCode(p.getPrctitnrAddrTyp()));

		/******************** practitioneraddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory practitioneraddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		practitioneraddress.setUse(practitioneraddressuse.fromCode(p.getPrctitnrAddrUse()));

		/******************** Prctitnr_BirthDt ********************************************************************************/
		if(p.getPrctitnrBirthDt() != null) {
			java.text.SimpleDateFormat Prctitnr_BirthDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_BirthDtdate = Prctitnr_BirthDtsdf.parse(p.getPrctitnrBirthDt());
			practitioner.setBirthDate(Prctitnr_BirthDtdate);
		}
		/******************** practitionercommunication ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionercommunication =  new org.hl7.fhir.r4.model.CodeableConcept();
		practitioner.addCommunication(practitionercommunication);

		/******************** practitionercommunicationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionercommunicationcoding =  new org.hl7.fhir.r4.model.Coding();
		practitionercommunication.addCoding(practitionercommunicationcoding);

		/******************** Prctitnr_Cmmnctn_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgCd() != null) {
			practitionercommunicationcoding.setCode(p.getPrctitnrCmmnctnCdgCd());
		}
		/******************** Prctitnr_Cmmnctn_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgDsply() != null) {
			practitionercommunicationcoding.setDisplay(p.getPrctitnrCmmnctnCdgDsply());
		}
		/******************** Prctitnr_Cmmnctn_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgSys() != null) {
			practitionercommunicationcoding.setSystem(p.getPrctitnrCmmnctnCdgSys());
		}
		/******************** Prctitnr_Cmmnctn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgUsrSltd() != null) {
			practitionercommunicationcoding.setUserSelected(Boolean.parseBoolean(p.getPrctitnrCmmnctnCdgUsrSltd()));
		}
		/******************** Prctitnr_Cmmnctn_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrCmmnctnCdgVrsn() != null) {
			practitionercommunicationcoding.setVersion(p.getPrctitnrCmmnctnCdgVrsn());
		}
		/******************** Prctitnr_Cmmnctn_Txt ********************************************************************************/
		if(p.getPrctitnrCmmnctnTxt() != null) {
			practitionercommunication.setText(p.getPrctitnrCmmnctnTxt());
		}
		/******************** practitionergender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory practitionergender =  new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();
		practitioner.setGender(practitionergender.fromCode(p.getPrctitnrGender()));

		/******************** practitioneridentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier practitioneridentifier =  new org.hl7.fhir.r4.model.Identifier();
		practitioner.addIdentifier(practitioneridentifier);

		/******************** Prctitnr_Id_Assigner ********************************************************************************/
		if(p.getPrctitnrIdAssigner() != null) {
			practitioneridentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPrctitnrIdAssigner()));
		}
		/******************** practitioneridentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitioneridentifierperiod =  new org.hl7.fhir.r4.model.Period();
		practitioneridentifier.setPeriod(practitioneridentifierperiod);

		/******************** Prctitnr_Id_Prd_End ********************************************************************************/
		if(p.getPrctitnrIdPrdEnd() != null) {
			java.text.SimpleDateFormat Prctitnr_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Id_Prd_Enddate = Prctitnr_Id_Prd_Endsdf.parse(p.getPrctitnrIdPrdEnd());
			practitioneridentifierperiod.setEnd(Prctitnr_Id_Prd_Enddate);
		}
		/******************** Prctitnr_Id_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrIdPrdStrt() != null) {
			java.text.SimpleDateFormat Prctitnr_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Id_Prd_Strtdate = Prctitnr_Id_Prd_Strtsdf.parse(p.getPrctitnrIdPrdStrt());
			practitioneridentifierperiod.setStart(Prctitnr_Id_Prd_Strtdate);
		}
		/******************** Prctitnr_Id_Sys ********************************************************************************/
		if(p.getPrctitnrIdSys() != null) {
			practitioneridentifier.setSystem(p.getPrctitnrIdSys());
		}
		/******************** practitioneridentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitioneridentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		practitioneridentifier.setType(practitioneridentifiertype);

		/******************** practitioneridentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitioneridentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		practitioneridentifiertype.addCoding(practitioneridentifiertypecoding);

		/******************** Prctitnr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrIdTypCdgCd() != null) {
			practitioneridentifiertypecoding.setCode(p.getPrctitnrIdTypCdgCd());
		}
		/******************** Prctitnr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrIdTypCdgDsply() != null) {
			practitioneridentifiertypecoding.setDisplay(p.getPrctitnrIdTypCdgDsply());
		}
		/******************** Prctitnr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrIdTypCdgSys() != null) {
			practitioneridentifiertypecoding.setSystem(p.getPrctitnrIdTypCdgSys());
		}
		/******************** Prctitnr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrIdTypCdgUsrSltd() != null) {
			practitioneridentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPrctitnrIdTypCdgUsrSltd()));
		}
		/******************** Prctitnr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrIdTypCdgVrsn() != null) {
			practitioneridentifiertypecoding.setVersion(p.getPrctitnrIdTypCdgVrsn());
		}
		/******************** Prctitnr_Id_Typ_Txt ********************************************************************************/
		if(p.getPrctitnrIdTypTxt() != null) {
			practitioneridentifiertype.setText(p.getPrctitnrIdTypTxt());
		}
		/******************** practitioneridentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory practitioneridentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		practitioneridentifier.setUse(practitioneridentifieruse.fromCode(p.getPrctitnrIdUse()));

		/******************** Prctitnr_Id_Vl ********************************************************************************/
		if(p.getPrctitnrIdVl() != null) {
			practitioneridentifier.setValue(p.getPrctitnrIdVl());
		}
		/******************** practitionername ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName practitionername =  new org.hl7.fhir.r4.model.HumanName();
		practitioner.addName(practitionername);

		/******************** Prctitnr_Nm_Fmly ********************************************************************************/
		if(p.getPrctitnrNmFmly() != null) {
			practitionername.setFamily(p.getPrctitnrNmFmly());
		}
		/******************** Prctitnr_Nm_Given ********************************************************************************/
		if(p.getPrctitnrNmGiven() != null) {
			practitionername.addGiven(p.getPrctitnrNmGiven());
		}
		/******************** practitionernameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionernameperiod =  new org.hl7.fhir.r4.model.Period();
		practitionername.setPeriod(practitionernameperiod);

		/******************** Prctitnr_Nm_Prd_End ********************************************************************************/
		if(p.getPrctitnrNmPrdEnd() != null) {
			java.text.SimpleDateFormat Prctitnr_Nm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Nm_Prd_Enddate = Prctitnr_Nm_Prd_Endsdf.parse(p.getPrctitnrNmPrdEnd());
			practitionernameperiod.setEnd(Prctitnr_Nm_Prd_Enddate);
		}
		/******************** Prctitnr_Nm_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrNmPrdStrt() != null) {
			java.text.SimpleDateFormat Prctitnr_Nm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Nm_Prd_Strtdate = Prctitnr_Nm_Prd_Strtsdf.parse(p.getPrctitnrNmPrdStrt());
			practitionernameperiod.setStart(Prctitnr_Nm_Prd_Strtdate);
		}
		/******************** Prctitnr_Nm_Prefix ********************************************************************************/
		if(p.getPrctitnrNmPrefix() != null) {
			practitionername.addPrefix(p.getPrctitnrNmPrefix());
		}
		/******************** Prctitnr_Nm_Suffix ********************************************************************************/
		if(p.getPrctitnrNmSuffix() != null) {
			practitionername.addSuffix(p.getPrctitnrNmSuffix());
		}
		/******************** Prctitnr_Nm_Txt ********************************************************************************/
		if(p.getPrctitnrNmTxt() != null) {
			practitionername.setText(p.getPrctitnrNmTxt());
		}
		/******************** practitionernameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory practitionernameuse =  new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();
		practitionername.setUse(practitionernameuse.fromCode(p.getPrctitnrNmUse()));

		/******************** practitionerphoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment practitionerphoto =  new org.hl7.fhir.r4.model.Attachment();
		practitioner.addPhoto(practitionerphoto);

		/******************** Prctitnr_Photo_CntntTyp ********************************************************************************/
		if(p.getPrctitnrPhotoCntntTyp() != null) {
			practitionerphoto.setContentType(p.getPrctitnrPhotoCntntTyp());
		}
		/******************** Prctitnr_Photo_Creation ********************************************************************************/
		if(p.getPrctitnrPhotoCreation() != null) {
			java.text.SimpleDateFormat Prctitnr_Photo_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Photo_Creationdate = Prctitnr_Photo_Creationsdf.parse(p.getPrctitnrPhotoCreation());
			practitionerphoto.setCreation(Prctitnr_Photo_Creationdate);
		}
		/******************** Prctitnr_Photo_Data ********************************************************************************/
		if(p.getPrctitnrPhotoData() != null) {
			practitionerphoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPrctitnrPhotoData()));
		}
		/******************** Prctitnr_Photo_Hash ********************************************************************************/
		if(p.getPrctitnrPhotoHash() != null) {
			practitionerphoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPrctitnrPhotoHash()));
		}
		/******************** Prctitnr_Photo_Lnguage ********************************************************************************/
		if(p.getPrctitnrPhotoLnguage() != null) {
			practitionerphoto.setLanguage(p.getPrctitnrPhotoLnguage());
		}
		/******************** Prctitnr_Photo_Sz ********************************************************************************/
		if(p.getPrctitnrPhotoSz() != null) {
			practitionerphoto.setSize(Integer.parseInt(p.getPrctitnrPhotoSz()));
		}
		/******************** Prctitnr_Photo_Ttl ********************************************************************************/
		if(p.getPrctitnrPhotoTtl() != null) {
			practitionerphoto.setTitle(p.getPrctitnrPhotoTtl());
		}
		/******************** Prctitnr_Photo_Url ********************************************************************************/
		if(p.getPrctitnrPhotoUrl() != null) {
			practitionerphoto.setUrl(p.getPrctitnrPhotoUrl());
		}
		/******************** practitionerqualification ********************************************************************************/
		org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent practitionerqualification =  new org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent();
		practitioner.addQualification(practitionerqualification);

		/******************** practitionerqualificationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerqualificationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		practitionerqualification.setCode(practitionerqualificationcode);

		/******************** practitionerqualificationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerqualificationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		practitionerqualificationcode.addCoding(practitionerqualificationcodecoding);

		/******************** Prctitnr_Qualification_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgCd() != null) {
			practitionerqualificationcodecoding.setCode(p.getPrctitnrQualificationCdCdgCd());
		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgDsply() != null) {
			practitionerqualificationcodecoding.setDisplay(p.getPrctitnrQualificationCdCdgDsply());
		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgSys() != null) {
			practitionerqualificationcodecoding.setSystem(p.getPrctitnrQualificationCdCdgSys());
		}
		/******************** Prctitnr_Qualification_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgUsrSltd() != null) {
			practitionerqualificationcodecoding.setUserSelected(Boolean.parseBoolean(p.getPrctitnrQualificationCdCdgUsrSltd()));
		}
		/******************** Prctitnr_Qualification_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrQualificationCdCdgVrsn() != null) {
			practitionerqualificationcodecoding.setVersion(p.getPrctitnrQualificationCdCdgVrsn());
		}
		/******************** Prctitnr_Qualification_Cd_Txt ********************************************************************************/
		if(p.getPrctitnrQualificationCdTxt() != null) {
			practitionerqualificationcode.setText(p.getPrctitnrQualificationCdTxt());
		}
		/******************** practitionerqualificationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier practitionerqualificationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		practitionerqualification.addIdentifier(practitionerqualificationidentifier);

		/******************** Prctitnr_Qualification_Id_Assigner ********************************************************************************/
		if(p.getPrctitnrQualificationIdAssigner() != null) {
			practitionerqualificationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPrctitnrQualificationIdAssigner()));
		}
		/******************** practitionerqualificationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerqualificationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		practitionerqualificationidentifier.setPeriod(practitionerqualificationidentifierperiod);

		/******************** Prctitnr_Qualification_Id_Prd_End ********************************************************************************/
		if(p.getPrctitnrQualificationIdPrdEnd() != null) {
			java.text.SimpleDateFormat Prctitnr_Qualification_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Qualification_Id_Prd_Enddate = Prctitnr_Qualification_Id_Prd_Endsdf.parse(p.getPrctitnrQualificationIdPrdEnd());
			practitionerqualificationidentifierperiod.setEnd(Prctitnr_Qualification_Id_Prd_Enddate);
		}
		/******************** Prctitnr_Qualification_Id_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrQualificationIdPrdStrt() != null) {
			java.text.SimpleDateFormat Prctitnr_Qualification_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Qualification_Id_Prd_Strtdate = Prctitnr_Qualification_Id_Prd_Strtsdf.parse(p.getPrctitnrQualificationIdPrdStrt());
			practitionerqualificationidentifierperiod.setStart(Prctitnr_Qualification_Id_Prd_Strtdate);
		}
		/******************** Prctitnr_Qualification_Id_Sys ********************************************************************************/
		if(p.getPrctitnrQualificationIdSys() != null) {
			practitionerqualificationidentifier.setSystem(p.getPrctitnrQualificationIdSys());
		}
		/******************** practitionerqualificationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept practitionerqualificationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		practitionerqualificationidentifier.setType(practitionerqualificationidentifiertype);

		/******************** practitionerqualificationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding practitionerqualificationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		practitionerqualificationidentifiertype.addCoding(practitionerqualificationidentifiertypecoding);

		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgCd() != null) {
			practitionerqualificationidentifiertypecoding.setCode(p.getPrctitnrQualificationIdTypCdgCd());
		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgDsply() != null) {
			practitionerqualificationidentifiertypecoding.setDisplay(p.getPrctitnrQualificationIdTypCdgDsply());
		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgSys() != null) {
			practitionerqualificationidentifiertypecoding.setSystem(p.getPrctitnrQualificationIdTypCdgSys());
		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgUsrSltd() != null) {
			practitionerqualificationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPrctitnrQualificationIdTypCdgUsrSltd()));
		}
		/******************** Prctitnr_Qualification_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypCdgVrsn() != null) {
			practitionerqualificationidentifiertypecoding.setVersion(p.getPrctitnrQualificationIdTypCdgVrsn());
		}
		/******************** Prctitnr_Qualification_Id_Typ_Txt ********************************************************************************/
		if(p.getPrctitnrQualificationIdTypTxt() != null) {
			practitionerqualificationidentifiertype.setText(p.getPrctitnrQualificationIdTypTxt());
		}
		/******************** practitionerqualificationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory practitionerqualificationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		practitionerqualificationidentifier.setUse(practitionerqualificationidentifieruse.fromCode(p.getPrctitnrQualificationIdUse()));

		/******************** Prctitnr_Qualification_Id_Vl ********************************************************************************/
		if(p.getPrctitnrQualificationIdVl() != null) {
			practitionerqualificationidentifier.setValue(p.getPrctitnrQualificationIdVl());
		}
		/******************** Prctitnr_Qualification_Issuer ********************************************************************************/
		if(p.getPrctitnrQualificationIssuer() != null) {
			practitionerqualification.setIssuer( new org.hl7.fhir.r4.model.Reference(p.getPrctitnrQualificationIssuer()));
		}
		/******************** practitionerqualificationperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionerqualificationperiod =  new org.hl7.fhir.r4.model.Period();
		practitionerqualification.setPeriod(practitionerqualificationperiod);

		/******************** Prctitnr_Qualification_Prd_End ********************************************************************************/
		if(p.getPrctitnrQualificationPrdEnd() != null) {
			java.text.SimpleDateFormat Prctitnr_Qualification_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Qualification_Prd_Enddate = Prctitnr_Qualification_Prd_Endsdf.parse(p.getPrctitnrQualificationPrdEnd());
			practitionerqualificationperiod.setEnd(Prctitnr_Qualification_Prd_Enddate);
		}
		/******************** Prctitnr_Qualification_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrQualificationPrdStrt() != null) {
			java.text.SimpleDateFormat Prctitnr_Qualification_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Qualification_Prd_Strtdate = Prctitnr_Qualification_Prd_Strtsdf.parse(p.getPrctitnrQualificationPrdStrt());
			practitionerqualificationperiod.setStart(Prctitnr_Qualification_Prd_Strtdate);
		}
		/******************** practitionertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint practitionertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		practitioner.addTelecom(practitionertelecom);

		/******************** practitionertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period practitionertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		practitionertelecom.setPeriod(practitionertelecomperiod);

		/******************** Prctitnr_Tlcm_Prd_End ********************************************************************************/
		if(p.getPrctitnrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Prctitnr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Tlcm_Prd_Enddate = Prctitnr_Tlcm_Prd_Endsdf.parse(p.getPrctitnrTlcmPrdEnd());
			practitionertelecomperiod.setEnd(Prctitnr_Tlcm_Prd_Enddate);
		}
		/******************** Prctitnr_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Prctitnr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Prctitnr_Tlcm_Prd_Strtdate = Prctitnr_Tlcm_Prd_Strtsdf.parse(p.getPrctitnrTlcmPrdStrt());
			practitionertelecomperiod.setStart(Prctitnr_Tlcm_Prd_Strtdate);
		}
		/******************** Prctitnr_Tlcm_Rnk ********************************************************************************/
		if(p.getPrctitnrTlcmRnk() != null) {
			practitionertelecom.setRank(Integer.parseInt(p.getPrctitnrTlcmRnk()));
		}
		/******************** practitionertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory practitionertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		practitionertelecom.setSystem(practitionertelecomsystem.fromCode(p.getPrctitnrTlcmSys()));

		/******************** practitionertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory practitionertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		practitionertelecom.setUse(practitionertelecomuse.fromCode(p.getPrctitnrTlcmUse()));

		/******************** Prctitnr_Tlcm_Vl ********************************************************************************/
		if(p.getPrctitnrTlcmVl() != null) {
			practitionertelecom.setValue(p.getPrctitnrTlcmVl());
		}
		return practitioner;
	}
}
