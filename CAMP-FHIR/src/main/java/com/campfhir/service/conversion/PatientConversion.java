package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Patient;
public class PatientConversion 
{
	public org.hl7.fhir.r4.model.Patient Patients(Patient p) throws ParseException
	{
		org.hl7.fhir.r4.model.Patient patient = new org.hl7.fhir.r4.model.Patient();

		/******************** id ********************************************************************************/
		patient.setId(p.getId());

		/******************** Pnt_Active ********************************************************************************/
		if(p.getPntActive() != null) {
			patient.setActive(Boolean.parseBoolean(p.getPntActive()));
		}
		/******************** patientaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address patientaddress =  new org.hl7.fhir.r4.model.Address();
		patient.addAddress(patientaddress);

		/******************** Pnt_Addr_City ********************************************************************************/
		if(p.getPntAddrCity() != null) {
			patientaddress.setCity(p.getPntAddrCity());
		}
		/******************** Pnt_Addr_Cntry ********************************************************************************/
		if(p.getPntAddrCntry() != null) {
			patientaddress.setCountry(p.getPntAddrCntry());
		}
		/******************** Pnt_Addr_District ********************************************************************************/
		if(p.getPntAddrDistrict() != null) {
			patientaddress.setDistrict(p.getPntAddrDistrict());
		}
		/******************** Pnt_Addr_Line ********************************************************************************/
		if(p.getPntAddrLine() != null) {
			patientaddress.addLine(p.getPntAddrLine());
		}
		/******************** patientaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientaddressperiod =  new org.hl7.fhir.r4.model.Period();
		patientaddress.setPeriod(patientaddressperiod);

		/******************** Pnt_Addr_Prd_End ********************************************************************************/
		if(p.getPntAddrPrdEnd() != null) {
			java.text.SimpleDateFormat Pnt_Addr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Addr_Prd_Enddate = Pnt_Addr_Prd_Endsdf.parse(p.getPntAddrPrdEnd());
			patientaddressperiod.setEnd(Pnt_Addr_Prd_Enddate);
		}
		/******************** Pnt_Addr_Prd_Strt ********************************************************************************/
		if(p.getPntAddrPrdStrt() != null) {
			java.text.SimpleDateFormat Pnt_Addr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Addr_Prd_Strtdate = Pnt_Addr_Prd_Strtsdf.parse(p.getPntAddrPrdStrt());
			patientaddressperiod.setStart(Pnt_Addr_Prd_Strtdate);
		}
		/******************** Pnt_Addr_PostalCd ********************************************************************************/
		if(p.getPntAddrPostalCd() != null) {
			patientaddress.setPostalCode(p.getPntAddrPostalCd());
		}
		/******************** Pnt_Addr_State ********************************************************************************/
		if(p.getPntAddrState() != null) {
			patientaddress.setState(p.getPntAddrState());
		}
		/******************** Pnt_Addr_Txt ********************************************************************************/
		if(p.getPntAddrTxt() != null) {
			patientaddress.setText(p.getPntAddrTxt());
		}
		/******************** patientaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory patientaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		patientaddress.setType(patientaddresstype.fromCode(p.getPntAddrTyp()));

		/******************** patientaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory patientaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		patientaddress.setUse(patientaddressuse.fromCode(p.getPntAddrUse()));

		/******************** Pnt_BirthDt ********************************************************************************/
		if(p.getPntBirthDt() != null) {
			java.text.SimpleDateFormat Pnt_BirthDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_BirthDtdate = Pnt_BirthDtsdf.parse(p.getPntBirthDt());
			patient.setBirthDate(Pnt_BirthDtdate);
		}
		/******************** patientcommunication ********************************************************************************/
		org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent patientcommunication =  new org.hl7.fhir.r4.model.Patient.PatientCommunicationComponent();
		patient.addCommunication(patientcommunication);

		/******************** patientcommunicationlanguage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientcommunicationlanguage =  new org.hl7.fhir.r4.model.CodeableConcept();
		patientcommunication.setLanguage(patientcommunicationlanguage);

		/******************** patientcommunicationlanguagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding patientcommunicationlanguagecoding =  new org.hl7.fhir.r4.model.Coding();
		patientcommunicationlanguage.addCoding(patientcommunicationlanguagecoding);

		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Cd ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgCd() != null) {
			patientcommunicationlanguagecoding.setCode(p.getPntCmmnctnLnguageCdgCd());
		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Dsply ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgDsply() != null) {
			patientcommunicationlanguagecoding.setDisplay(p.getPntCmmnctnLnguageCdgDsply());
		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Sys ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgSys() != null) {
			patientcommunicationlanguagecoding.setSystem(p.getPntCmmnctnLnguageCdgSys());
		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_UsrSltd ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgUsrSltd() != null) {
			patientcommunicationlanguagecoding.setUserSelected(Boolean.parseBoolean(p.getPntCmmnctnLnguageCdgUsrSltd()));
		}
		/******************** Pnt_Cmmnctn_Lnguage_Cdg_Vrsn ********************************************************************************/
		if(p.getPntCmmnctnLnguageCdgVrsn() != null) {
			patientcommunicationlanguagecoding.setVersion(p.getPntCmmnctnLnguageCdgVrsn());
		}
		/******************** Pnt_Cmmnctn_Lnguage_Txt ********************************************************************************/
		if(p.getPntCmmnctnLnguageTxt() != null) {
			patientcommunicationlanguage.setText(p.getPntCmmnctnLnguageTxt());
		}
		/******************** Pnt_Cmmnctn_Preferred ********************************************************************************/
		if(p.getPntCmmnctnPreferred() != null) {
			patientcommunication.setPreferred(Boolean.parseBoolean(p.getPntCmmnctnPreferred()));
		}
		/******************** patientcontact ********************************************************************************/
		org.hl7.fhir.r4.model.Patient.ContactComponent patientcontact =  new org.hl7.fhir.r4.model.Patient.ContactComponent();
		patient.addContact(patientcontact);

		/******************** patientcontactaddress ********************************************************************************/
		org.hl7.fhir.r4.model.Address patientcontactaddress =  new org.hl7.fhir.r4.model.Address();
		patientcontact.setAddress(patientcontactaddress);

		/******************** Pnt_Cntct_Addr_City ********************************************************************************/
		if(p.getPntCntctAddrCity() != null) {
			patientcontactaddress.setCity(p.getPntCntctAddrCity());
		}
		/******************** Pnt_Cntct_Addr_Cntry ********************************************************************************/
		if(p.getPntCntctAddrCntry() != null) {
			patientcontactaddress.setCountry(p.getPntCntctAddrCntry());
		}
		/******************** Pnt_Cntct_Addr_District ********************************************************************************/
		if(p.getPntCntctAddrDistrict() != null) {
			patientcontactaddress.setDistrict(p.getPntCntctAddrDistrict());
		}
		/******************** Pnt_Cntct_Addr_Line ********************************************************************************/
		if(p.getPntCntctAddrLine() != null) {
			patientcontactaddress.addLine(p.getPntCntctAddrLine());
		}
		/******************** patientcontactaddressperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontactaddressperiod =  new org.hl7.fhir.r4.model.Period();
		patientcontactaddress.setPeriod(patientcontactaddressperiod);

		/******************** Pnt_Cntct_Addr_Prd_End ********************************************************************************/
		if(p.getPntCntctAddrPrdEnd() != null) {
			java.text.SimpleDateFormat Pnt_Cntct_Addr_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Cntct_Addr_Prd_Enddate = Pnt_Cntct_Addr_Prd_Endsdf.parse(p.getPntCntctAddrPrdEnd());
			patientcontactaddressperiod.setEnd(Pnt_Cntct_Addr_Prd_Enddate);
		}
		/******************** Pnt_Cntct_Addr_Prd_Strt ********************************************************************************/
		if(p.getPntCntctAddrPrdStrt() != null) {
			java.text.SimpleDateFormat Pnt_Cntct_Addr_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Cntct_Addr_Prd_Strtdate = Pnt_Cntct_Addr_Prd_Strtsdf.parse(p.getPntCntctAddrPrdStrt());
			patientcontactaddressperiod.setStart(Pnt_Cntct_Addr_Prd_Strtdate);
		}
		/******************** Pnt_Cntct_Addr_PostalCd ********************************************************************************/
		if(p.getPntCntctAddrPostalCd() != null) {
			patientcontactaddress.setPostalCode(p.getPntCntctAddrPostalCd());
		}
		/******************** Pnt_Cntct_Addr_State ********************************************************************************/
		if(p.getPntCntctAddrState() != null) {
			patientcontactaddress.setState(p.getPntCntctAddrState());
		}
		/******************** Pnt_Cntct_Addr_Txt ********************************************************************************/
		if(p.getPntCntctAddrTxt() != null) {
			patientcontactaddress.setText(p.getPntCntctAddrTxt());
		}
		/******************** patientcontactaddresstype ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory patientcontactaddresstype =  new org.hl7.fhir.r4.model.Address.AddressTypeEnumFactory();
		patientcontactaddress.setType(patientcontactaddresstype.fromCode(p.getPntCntctAddrTyp()));

		/******************** patientcontactaddressuse ********************************************************************************/
		org.hl7.fhir.r4.model.Address.AddressUseEnumFactory patientcontactaddressuse =  new org.hl7.fhir.r4.model.Address.AddressUseEnumFactory();
		patientcontactaddress.setUse(patientcontactaddressuse.fromCode(p.getPntCntctAddrUse()));

		/******************** patientcontactgender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory patientcontactgender =  new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();
		patientcontact.setGender(patientcontactgender.fromCode(p.getPntCntctGender()));

		/******************** patientcontactname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName patientcontactname =  new org.hl7.fhir.r4.model.HumanName();
		patientcontact.setName(patientcontactname);

		/******************** Pnt_Cntct_Nm_Fmly ********************************************************************************/
		if(p.getPntCntctNmFmly() != null) {
			patientcontactname.setFamily(p.getPntCntctNmFmly());
		}
		/******************** Pnt_Cntct_Nm_Given ********************************************************************************/
		if(p.getPntCntctNmGiven() != null) {
			patientcontactname.addGiven(p.getPntCntctNmGiven());
		}
		/******************** patientcontactnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontactnameperiod =  new org.hl7.fhir.r4.model.Period();
		patientcontactname.setPeriod(patientcontactnameperiod);

		/******************** Pnt_Cntct_Nm_Prd_End ********************************************************************************/
		if(p.getPntCntctNmPrdEnd() != null) {
			java.text.SimpleDateFormat Pnt_Cntct_Nm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Cntct_Nm_Prd_Enddate = Pnt_Cntct_Nm_Prd_Endsdf.parse(p.getPntCntctNmPrdEnd());
			patientcontactnameperiod.setEnd(Pnt_Cntct_Nm_Prd_Enddate);
		}
		/******************** Pnt_Cntct_Nm_Prd_Strt ********************************************************************************/
		if(p.getPntCntctNmPrdStrt() != null) {
			java.text.SimpleDateFormat Pnt_Cntct_Nm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Cntct_Nm_Prd_Strtdate = Pnt_Cntct_Nm_Prd_Strtsdf.parse(p.getPntCntctNmPrdStrt());
			patientcontactnameperiod.setStart(Pnt_Cntct_Nm_Prd_Strtdate);
		}
		/******************** Pnt_Cntct_Nm_Prefix ********************************************************************************/
		if(p.getPntCntctNmPrefix() != null) {
			patientcontactname.addPrefix(p.getPntCntctNmPrefix());
		}
		/******************** Pnt_Cntct_Nm_Suffix ********************************************************************************/
		if(p.getPntCntctNmSuffix() != null) {
			patientcontactname.addSuffix(p.getPntCntctNmSuffix());
		}
		/******************** Pnt_Cntct_Nm_Txt ********************************************************************************/
		if(p.getPntCntctNmTxt() != null) {
			patientcontactname.setText(p.getPntCntctNmTxt());
		}
		/******************** patientcontactnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory patientcontactnameuse =  new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();
		patientcontactname.setUse(patientcontactnameuse.fromCode(p.getPntCntctNmUse()));

		/******************** Pnt_Cntct_Orgnztn ********************************************************************************/
		if(p.getPntCntctOrgnztn() != null) {
			patientcontact.setOrganization( new org.hl7.fhir.r4.model.Reference(p.getPntCntctOrgnztn()));
		}
		/******************** patientcontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontactperiod =  new org.hl7.fhir.r4.model.Period();
		patientcontact.setPeriod(patientcontactperiod);

		/******************** Pnt_Cntct_Prd_End ********************************************************************************/
		if(p.getPntCntctPrdEnd() != null) {
			java.text.SimpleDateFormat Pnt_Cntct_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Cntct_Prd_Enddate = Pnt_Cntct_Prd_Endsdf.parse(p.getPntCntctPrdEnd());
			patientcontactperiod.setEnd(Pnt_Cntct_Prd_Enddate);
		}
		/******************** Pnt_Cntct_Prd_Strt ********************************************************************************/
		if(p.getPntCntctPrdStrt() != null) {
			java.text.SimpleDateFormat Pnt_Cntct_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Cntct_Prd_Strtdate = Pnt_Cntct_Prd_Strtsdf.parse(p.getPntCntctPrdStrt());
			patientcontactperiod.setStart(Pnt_Cntct_Prd_Strtdate);
		}
		/******************** patientcontactrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientcontactrelationship =  new org.hl7.fhir.r4.model.CodeableConcept();
		patientcontact.addRelationship(patientcontactrelationship);

		/******************** patientcontactrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding patientcontactrelationshipcoding =  new org.hl7.fhir.r4.model.Coding();
		patientcontactrelationship.addCoding(patientcontactrelationshipcoding);

		/******************** Pnt_Cntct_Rltnship_Cdg_Cd ********************************************************************************/
		if(p.getPntCntctRltnshipCdgCd() != null) {
			patientcontactrelationshipcoding.setCode(p.getPntCntctRltnshipCdgCd());
		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Dsply ********************************************************************************/
		if(p.getPntCntctRltnshipCdgDsply() != null) {
			patientcontactrelationshipcoding.setDisplay(p.getPntCntctRltnshipCdgDsply());
		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Sys ********************************************************************************/
		if(p.getPntCntctRltnshipCdgSys() != null) {
			patientcontactrelationshipcoding.setSystem(p.getPntCntctRltnshipCdgSys());
		}
		/******************** Pnt_Cntct_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(p.getPntCntctRltnshipCdgUsrSltd() != null) {
			patientcontactrelationshipcoding.setUserSelected(Boolean.parseBoolean(p.getPntCntctRltnshipCdgUsrSltd()));
		}
		/******************** Pnt_Cntct_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(p.getPntCntctRltnshipCdgVrsn() != null) {
			patientcontactrelationshipcoding.setVersion(p.getPntCntctRltnshipCdgVrsn());
		}
		/******************** Pnt_Cntct_Rltnship_Txt ********************************************************************************/
		if(p.getPntCntctRltnshipTxt() != null) {
			patientcontactrelationship.setText(p.getPntCntctRltnshipTxt());
		}
		/******************** patientcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint patientcontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		patientcontact.addTelecom(patientcontacttelecom);

		/******************** patientcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientcontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		patientcontacttelecom.setPeriod(patientcontacttelecomperiod);

		/******************** Pnt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(p.getPntCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Pnt_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Cntct_Tlcm_Prd_Enddate = Pnt_Cntct_Tlcm_Prd_Endsdf.parse(p.getPntCntctTlcmPrdEnd());
			patientcontacttelecomperiod.setEnd(Pnt_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** Pnt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPntCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Pnt_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Cntct_Tlcm_Prd_Strtdate = Pnt_Cntct_Tlcm_Prd_Strtsdf.parse(p.getPntCntctTlcmPrdStrt());
			patientcontacttelecomperiod.setStart(Pnt_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** Pnt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(p.getPntCntctTlcmRnk() != null) {
			patientcontacttelecom.setRank(Integer.parseInt(p.getPntCntctTlcmRnk()));
		}
		/******************** patientcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory patientcontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		patientcontacttelecom.setSystem(patientcontacttelecomsystem.fromCode(p.getPntCntctTlcmSys()));

		/******************** patientcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory patientcontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		patientcontacttelecom.setUse(patientcontacttelecomuse.fromCode(p.getPntCntctTlcmUse()));

		/******************** Pnt_Cntct_Tlcm_Vl ********************************************************************************/
		if(p.getPntCntctTlcmVl() != null) {
			patientcontacttelecom.setValue(p.getPntCntctTlcmVl());
		}
		/******************** Pnt_DeceasedBooleanTyp ********************************************************************************/
		if(p.getPntDeceasedBooleanTyp() != null) {
			patient.setDeceased( new org.hl7.fhir.r4.model.BooleanType(p.getPntDeceasedBooleanTyp()));
		}
		/******************** Pnt_DeceasedDtTimeTyp ********************************************************************************/
		if(p.getPntDeceasedDtTimeTyp() != null) {
			patient.setDeceased( new org.hl7.fhir.r4.model.DateTimeType(p.getPntDeceasedDtTimeTyp()));
		}
		/******************** patientgender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory patientgender =  new org.hl7.fhir.r4.model.Enumerations.AdministrativeGenderEnumFactory();
		patient.setGender(patientgender.fromCode(p.getPntGender()));

		/******************** Pnt_GeneralPrctitnr ********************************************************************************/
		if(p.getPntGeneralPrctitnr() != null) {
			patient.addGeneralPractitioner( new org.hl7.fhir.r4.model.Reference(p.getPntGeneralPrctitnr()));
		}
		/******************** patientidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier patientidentifier =  new org.hl7.fhir.r4.model.Identifier();
		patient.addIdentifier(patientidentifier);

		/******************** Pnt_Id_Assigner ********************************************************************************/
		if(p.getPntIdAssigner() != null) {
			patientidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPntIdAssigner()));
		}
		/******************** patientidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		patientidentifier.setPeriod(patientidentifierperiod);

		/******************** Pnt_Id_Prd_End ********************************************************************************/
		if(p.getPntIdPrdEnd() != null) {
			java.text.SimpleDateFormat Pnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Id_Prd_Enddate = Pnt_Id_Prd_Endsdf.parse(p.getPntIdPrdEnd());
			patientidentifierperiod.setEnd(Pnt_Id_Prd_Enddate);
		}
		/******************** Pnt_Id_Prd_Strt ********************************************************************************/
		if(p.getPntIdPrdStrt() != null) {
			java.text.SimpleDateFormat Pnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Id_Prd_Strtdate = Pnt_Id_Prd_Strtsdf.parse(p.getPntIdPrdStrt());
			patientidentifierperiod.setStart(Pnt_Id_Prd_Strtdate);
		}
		/******************** Pnt_Id_Sys ********************************************************************************/
		if(p.getPntIdSys() != null) {
			patientidentifier.setSystem(p.getPntIdSys());
		}
		/******************** patientidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		patientidentifier.setType(patientidentifiertype);

		/******************** patientidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding patientidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		patientidentifiertype.addCoding(patientidentifiertypecoding);

		/******************** Pnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPntIdTypCdgCd() != null) {
			patientidentifiertypecoding.setCode(p.getPntIdTypCdgCd());
		}
		/******************** Pnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPntIdTypCdgDsply() != null) {
			patientidentifiertypecoding.setDisplay(p.getPntIdTypCdgDsply());
		}
		/******************** Pnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPntIdTypCdgSys() != null) {
			patientidentifiertypecoding.setSystem(p.getPntIdTypCdgSys());
		}
		/******************** Pnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPntIdTypCdgUsrSltd() != null) {
			patientidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPntIdTypCdgUsrSltd()));
		}
		/******************** Pnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPntIdTypCdgVrsn() != null) {
			patientidentifiertypecoding.setVersion(p.getPntIdTypCdgVrsn());
		}
		/******************** Pnt_Id_Typ_Txt ********************************************************************************/
		if(p.getPntIdTypTxt() != null) {
			patientidentifiertype.setText(p.getPntIdTypTxt());
		}
		/******************** patientidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory patientidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		patientidentifier.setUse(patientidentifieruse.fromCode(p.getPntIdUse()));

		/******************** Pnt_Id_Vl ********************************************************************************/
		if(p.getPntIdVl() != null) {
			patientidentifier.setValue(p.getPntIdVl());
		}
		/******************** patientlink ********************************************************************************/
		org.hl7.fhir.r4.model.Patient.PatientLinkComponent patientlink =  new org.hl7.fhir.r4.model.Patient.PatientLinkComponent();
		patient.addLink(patientlink);

		/******************** Pnt_Link_Other ********************************************************************************/
		if(p.getPntLinkOther() != null) {
			patientlink.setOther( new org.hl7.fhir.r4.model.Reference(p.getPntLinkOther()));
		}
		/******************** patientlinktype ********************************************************************************/
		org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory patientlinktype =  new org.hl7.fhir.r4.model.Patient.LinkTypeEnumFactory();
		patientlink.setType(patientlinktype.fromCode(p.getPntLinkTyp()));

		/******************** Pnt_ManagingOrgnztn ********************************************************************************/
		if(p.getPntManagingOrgnztn() != null) {
			patient.setManagingOrganization( new org.hl7.fhir.r4.model.Reference(p.getPntManagingOrgnztn()));
		}
		/******************** patientmaritalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept patientmaritalstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		patient.setMaritalStatus(patientmaritalstatus);

		/******************** patientmaritalstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding patientmaritalstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		patientmaritalstatus.addCoding(patientmaritalstatuscoding);

		/******************** Pnt_MaritalSts_Cdg_Cd ********************************************************************************/
		if(p.getPntMaritalStsCdgCd() != null) {
			patientmaritalstatuscoding.setCode(p.getPntMaritalStsCdgCd());
		}
		/******************** Pnt_MaritalSts_Cdg_Dsply ********************************************************************************/
		if(p.getPntMaritalStsCdgDsply() != null) {
			patientmaritalstatuscoding.setDisplay(p.getPntMaritalStsCdgDsply());
		}
		/******************** Pnt_MaritalSts_Cdg_Sys ********************************************************************************/
		if(p.getPntMaritalStsCdgSys() != null) {
			patientmaritalstatuscoding.setSystem(p.getPntMaritalStsCdgSys());
		}
		/******************** Pnt_MaritalSts_Cdg_UsrSltd ********************************************************************************/
		if(p.getPntMaritalStsCdgUsrSltd() != null) {
			patientmaritalstatuscoding.setUserSelected(Boolean.parseBoolean(p.getPntMaritalStsCdgUsrSltd()));
		}
		/******************** Pnt_MaritalSts_Cdg_Vrsn ********************************************************************************/
		if(p.getPntMaritalStsCdgVrsn() != null) {
			patientmaritalstatuscoding.setVersion(p.getPntMaritalStsCdgVrsn());
		}
		/******************** Pnt_MaritalSts_Txt ********************************************************************************/
		if(p.getPntMaritalStsTxt() != null) {
			patientmaritalstatus.setText(p.getPntMaritalStsTxt());
		}
		/******************** Pnt_MultipleBirthBooleanTyp ********************************************************************************/
		if(p.getPntMultipleBirthBooleanTyp() != null) {
			patient.setMultipleBirth( new org.hl7.fhir.r4.model.BooleanType(p.getPntMultipleBirthBooleanTyp()));
		}
		/******************** Pnt_MultipleBirthIntegerTyp ********************************************************************************/
		if(p.getPntMultipleBirthIntegerTyp() != null) {
			patient.setMultipleBirth( new org.hl7.fhir.r4.model.IntegerType(p.getPntMultipleBirthIntegerTyp()));
		}
		/******************** patientname ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName patientname =  new org.hl7.fhir.r4.model.HumanName();
		patient.addName(patientname);

		/******************** Pnt_Nm_Fmly ********************************************************************************/
		if(p.getPntNmFmly() != null) {
			patientname.setFamily(p.getPntNmFmly());
		}
		/******************** Pnt_Nm_Given ********************************************************************************/
		if(p.getPntNmGiven() != null) {
			patientname.addGiven(p.getPntNmGiven());
		}
		/******************** patientnameperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patientnameperiod =  new org.hl7.fhir.r4.model.Period();
		patientname.setPeriod(patientnameperiod);

		/******************** Pnt_Nm_Prd_End ********************************************************************************/
		if(p.getPntNmPrdEnd() != null) {
			java.text.SimpleDateFormat Pnt_Nm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Nm_Prd_Enddate = Pnt_Nm_Prd_Endsdf.parse(p.getPntNmPrdEnd());
			patientnameperiod.setEnd(Pnt_Nm_Prd_Enddate);
		}
		/******************** Pnt_Nm_Prd_Strt ********************************************************************************/
		if(p.getPntNmPrdStrt() != null) {
			java.text.SimpleDateFormat Pnt_Nm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Nm_Prd_Strtdate = Pnt_Nm_Prd_Strtsdf.parse(p.getPntNmPrdStrt());
			patientnameperiod.setStart(Pnt_Nm_Prd_Strtdate);
		}
		/******************** Pnt_Nm_Prefix ********************************************************************************/
		if(p.getPntNmPrefix() != null) {
			patientname.addPrefix(p.getPntNmPrefix());
		}
		/******************** Pnt_Nm_Suffix ********************************************************************************/
		if(p.getPntNmSuffix() != null) {
			patientname.addSuffix(p.getPntNmSuffix());
		}
		/******************** Pnt_Nm_Txt ********************************************************************************/
		if(p.getPntNmTxt() != null) {
			patientname.setText(p.getPntNmTxt());
		}
		/******************** patientnameuse ********************************************************************************/
		org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory patientnameuse =  new org.hl7.fhir.r4.model.HumanName.NameUseEnumFactory();
		patientname.setUse(patientnameuse.fromCode(p.getPntNmUse()));

		/******************** patientphoto ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment patientphoto =  new org.hl7.fhir.r4.model.Attachment();
		patient.addPhoto(patientphoto);

		/******************** Pnt_Photo_CntntTyp ********************************************************************************/
		if(p.getPntPhotoCntntTyp() != null) {
			patientphoto.setContentType(p.getPntPhotoCntntTyp());
		}
		/******************** Pnt_Photo_Creation ********************************************************************************/
		if(p.getPntPhotoCreation() != null) {
			java.text.SimpleDateFormat Pnt_Photo_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Photo_Creationdate = Pnt_Photo_Creationsdf.parse(p.getPntPhotoCreation());
			patientphoto.setCreation(Pnt_Photo_Creationdate);
		}
		/******************** Pnt_Photo_Data ********************************************************************************/
		if(p.getPntPhotoData() != null) {
			patientphoto.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPntPhotoData()));
		}
		/******************** Pnt_Photo_Hash ********************************************************************************/
		if(p.getPntPhotoHash() != null) {
			patientphoto.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPntPhotoHash()));
		}
		/******************** Pnt_Photo_Lnguage ********************************************************************************/
		if(p.getPntPhotoLnguage() != null) {
			patientphoto.setLanguage(p.getPntPhotoLnguage());
		}
		/******************** Pnt_Photo_Sz ********************************************************************************/
		if(p.getPntPhotoSz() != null) {
			patientphoto.setSize(Integer.parseInt(p.getPntPhotoSz()));
		}
		/******************** Pnt_Photo_Ttl ********************************************************************************/
		if(p.getPntPhotoTtl() != null) {
			patientphoto.setTitle(p.getPntPhotoTtl());
		}
		/******************** Pnt_Photo_Url ********************************************************************************/
		if(p.getPntPhotoUrl() != null) {
			patientphoto.setUrl(p.getPntPhotoUrl());
		}
		/******************** patienttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint patienttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		patient.addTelecom(patienttelecom);

		/******************** patienttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period patienttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		patienttelecom.setPeriod(patienttelecomperiod);

		/******************** Pnt_Tlcm_Prd_End ********************************************************************************/
		if(p.getPntTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Pnt_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Tlcm_Prd_Enddate = Pnt_Tlcm_Prd_Endsdf.parse(p.getPntTlcmPrdEnd());
			patienttelecomperiod.setEnd(Pnt_Tlcm_Prd_Enddate);
		}
		/******************** Pnt_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPntTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Pnt_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Pnt_Tlcm_Prd_Strtdate = Pnt_Tlcm_Prd_Strtsdf.parse(p.getPntTlcmPrdStrt());
			patienttelecomperiod.setStart(Pnt_Tlcm_Prd_Strtdate);
		}
		/******************** Pnt_Tlcm_Rnk ********************************************************************************/
		if(p.getPntTlcmRnk() != null) {
			patienttelecom.setRank(Integer.parseInt(p.getPntTlcmRnk()));
		}
		/******************** patienttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory patienttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		patienttelecom.setSystem(patienttelecomsystem.fromCode(p.getPntTlcmSys()));

		/******************** patienttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory patienttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		patienttelecom.setUse(patienttelecomuse.fromCode(p.getPntTlcmUse()));

		/******************** Pnt_Tlcm_Vl ********************************************************************************/
		if(p.getPntTlcmVl() != null) {
			patienttelecom.setValue(p.getPntTlcmVl());
		}
		return patient;
	}
}
