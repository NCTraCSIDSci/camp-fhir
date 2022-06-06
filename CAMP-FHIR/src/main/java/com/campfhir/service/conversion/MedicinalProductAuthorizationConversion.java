package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicinalProductAuthorization;
public class MedicinalProductAuthorizationConversion 
{
	public org.hl7.fhir.r4.model.MedicinalProductAuthorization MedicinalProductAuthorizations(MedicinalProductAuthorization m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicinalProductAuthorization medicinalproductauthorization = new org.hl7.fhir.r4.model.MedicinalProductAuthorization();

		/******************** id ********************************************************************************/
		medicinalproductauthorization.setId(m.getId());

		/******************** medicinalproductauthorizationcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationcountry =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorization.addCountry(medicinalproductauthorizationcountry);

		/******************** medicinalproductauthorizationcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationcountrycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationcountry.addCoding(medicinalproductauthorizationcountrycoding);

		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgCd() != null) {
			medicinalproductauthorizationcountrycoding.setCode(m.getMdcnlPrdctAthztnCntryCdgCd());
		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgDsply() != null) {
			medicinalproductauthorizationcountrycoding.setDisplay(m.getMdcnlPrdctAthztnCntryCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgSys() != null) {
			medicinalproductauthorizationcountrycoding.setSystem(m.getMdcnlPrdctAthztnCntryCdgSys());
		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgUsrSltd() != null) {
			medicinalproductauthorizationcountrycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnCntryCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryCdgVrsn() != null) {
			medicinalproductauthorizationcountrycoding.setVersion(m.getMdcnlPrdctAthztnCntryCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnCntryTxt() != null) {
			medicinalproductauthorizationcountry.setText(m.getMdcnlPrdctAthztnCntryTxt());
		}
		/******************** medicinalproductauthorizationdataexclusivityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationdataexclusivityperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductauthorization.setDataExclusivityPeriod(medicinalproductauthorizationdataexclusivityperiod);

		/******************** MdcnlPrdctAthztn_DataExclusivityPrd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnDataExclusivityPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_DataExclusivityPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_DataExclusivityPrd_Enddate = MdcnlPrdctAthztn_DataExclusivityPrd_Endsdf.parse(m.getMdcnlPrdctAthztnDataExclusivityPrdEnd());
			medicinalproductauthorizationdataexclusivityperiod.setEnd(MdcnlPrdctAthztn_DataExclusivityPrd_Enddate);
		}
		/******************** MdcnlPrdctAthztn_DataExclusivityPrd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnDataExclusivityPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_DataExclusivityPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_DataExclusivityPrd_Strtdate = MdcnlPrdctAthztn_DataExclusivityPrd_Strtsdf.parse(m.getMdcnlPrdctAthztnDataExclusivityPrdStrt());
			medicinalproductauthorizationdataexclusivityperiod.setStart(MdcnlPrdctAthztn_DataExclusivityPrd_Strtdate);
		}
		/******************** MdcnlPrdctAthztn_DtOfFirstAthztn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnDtOfFirstAthztn() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_DtOfFirstAthztnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_DtOfFirstAthztndate = MdcnlPrdctAthztn_DtOfFirstAthztnsdf.parse(m.getMdcnlPrdctAthztnDtOfFirstAthztn());
			medicinalproductauthorization.setDateOfFirstAuthorization(MdcnlPrdctAthztn_DtOfFirstAthztndate);
		}
		/******************** MdcnlPrdctAthztn_Holder ********************************************************************************/
		if(m.getMdcnlPrdctAthztnHolder() != null) {
			medicinalproductauthorization.setHolder( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnHolder()));
		}
		/******************** medicinalproductauthorizationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductauthorizationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductauthorization.addIdentifier(medicinalproductauthorizationidentifier);

		/******************** MdcnlPrdctAthztn_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdAssigner() != null) {
			medicinalproductauthorizationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnIdAssigner()));
		}
		/******************** medicinalproductauthorizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductauthorizationidentifier.setPeriod(medicinalproductauthorizationidentifierperiod);

		/******************** MdcnlPrdctAthztn_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_Id_Prd_Enddate = MdcnlPrdctAthztn_Id_Prd_Endsdf.parse(m.getMdcnlPrdctAthztnIdPrdEnd());
			medicinalproductauthorizationidentifierperiod.setEnd(MdcnlPrdctAthztn_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdctAthztn_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_Id_Prd_Strtdate = MdcnlPrdctAthztn_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctAthztnIdPrdStrt());
			medicinalproductauthorizationidentifierperiod.setStart(MdcnlPrdctAthztn_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdctAthztn_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdSys() != null) {
			medicinalproductauthorizationidentifier.setSystem(m.getMdcnlPrdctAthztnIdSys());
		}
		/******************** medicinalproductauthorizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorizationidentifier.setType(medicinalproductauthorizationidentifiertype);

		/******************** medicinalproductauthorizationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationidentifiertype.addCoding(medicinalproductauthorizationidentifiertypecoding);

		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgCd() != null) {
			medicinalproductauthorizationidentifiertypecoding.setCode(m.getMdcnlPrdctAthztnIdTypCdgCd());
		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgDsply() != null) {
			medicinalproductauthorizationidentifiertypecoding.setDisplay(m.getMdcnlPrdctAthztnIdTypCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgSys() != null) {
			medicinalproductauthorizationidentifiertypecoding.setSystem(m.getMdcnlPrdctAthztnIdTypCdgSys());
		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgUsrSltd() != null) {
			medicinalproductauthorizationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypCdgVrsn() != null) {
			medicinalproductauthorizationidentifiertypecoding.setVersion(m.getMdcnlPrdctAthztnIdTypCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdTypTxt() != null) {
			medicinalproductauthorizationidentifiertype.setText(m.getMdcnlPrdctAthztnIdTypTxt());
		}
		/******************** medicinalproductauthorizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductauthorizationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductauthorizationidentifier.setUse(medicinalproductauthorizationidentifieruse.fromCode(m.getMdcnlPrdctAthztnIdUse()));

		/******************** MdcnlPrdctAthztn_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctAthztnIdVl() != null) {
			medicinalproductauthorizationidentifier.setValue(m.getMdcnlPrdctAthztnIdVl());
		}
		/******************** MdcnlPrdctAthztn_InternationalBirthDt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnInternationalBirthDt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_InternationalBirthDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_InternationalBirthDtdate = MdcnlPrdctAthztn_InternationalBirthDtsdf.parse(m.getMdcnlPrdctAthztnInternationalBirthDt());
			medicinalproductauthorization.setInternationalBirthDate(MdcnlPrdctAthztn_InternationalBirthDtdate);
		}
		/******************** medicinalproductauthorizationjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorization.addJurisdiction(medicinalproductauthorizationjurisdiction);

		/******************** medicinalproductauthorizationjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationjurisdiction.addCoding(medicinalproductauthorizationjurisdictioncoding);

		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgCd() != null) {
			medicinalproductauthorizationjurisdictioncoding.setCode(m.getMdcnlPrdctAthztnJrsdctnCdgCd());
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgDsply() != null) {
			medicinalproductauthorizationjurisdictioncoding.setDisplay(m.getMdcnlPrdctAthztnJrsdctnCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgSys() != null) {
			medicinalproductauthorizationjurisdictioncoding.setSystem(m.getMdcnlPrdctAthztnJrsdctnCdgSys());
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgUsrSltd() != null) {
			medicinalproductauthorizationjurisdictioncoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnJrsdctnCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnCdgVrsn() != null) {
			medicinalproductauthorizationjurisdictioncoding.setVersion(m.getMdcnlPrdctAthztnJrsdctnCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnTxt() != null) {
			medicinalproductauthorizationjurisdiction.setText(m.getMdcnlPrdctAthztnJrsdctnTxt());
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorization ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationJurisdictionalAuthorizationComponent medicinalproductauthorizationjurisdictionalauthorization =  new org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationJurisdictionalAuthorizationComponent();
		medicinalproductauthorization.addJurisdictionalAuthorization(medicinalproductauthorizationjurisdictionalauthorization);

		/******************** medicinalproductauthorizationjurisdictionalauthorizationcountry ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationcountry =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorizationjurisdictionalauthorization.setCountry(medicinalproductauthorizationjurisdictionalauthorizationcountry);

		/******************** medicinalproductauthorizationjurisdictionalauthorizationcountrycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictionalauthorizationcountrycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationjurisdictionalauthorizationcountry.addCoding(medicinalproductauthorizationjurisdictionalauthorizationcountrycoding);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.setCode(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgCd());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.setDisplay(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.setSystem(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgSys());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationcountrycoding.setVersion(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Cntry_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryTxt() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationcountry.setText(m.getMdcnlPrdctAthztnJrsdctnalAthztnCntryTxt());
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductauthorizationjurisdictionalauthorizationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductauthorizationjurisdictionalauthorization.addIdentifier(medicinalproductauthorizationjurisdictionalauthorizationidentifier);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdAssigner()));
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductauthorizationjurisdictionalauthorizationidentifier.setPeriod(medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Enddate = MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Endsdf.parse(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdEnd());
			medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.setEnd(MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Strtdate = MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdPrdStrt());
			medicinalproductauthorizationjurisdictionalauthorizationidentifierperiod.setStart(MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdSys() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationidentifier.setSystem(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdSys());
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorizationjurisdictionalauthorizationidentifier.setType(medicinalproductauthorizationjurisdictionalauthorizationidentifiertype);

		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationjurisdictionalauthorizationidentifiertype.addCoding(medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.setCode(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgCd());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.setDisplay(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.setSystem(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgSys());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationidentifiertypecoding.setVersion(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationidentifiertype.setText(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdTypTxt());
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductauthorizationjurisdictionalauthorizationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductauthorizationjurisdictionalauthorizationidentifier.setUse(medicinalproductauthorizationjurisdictionalauthorizationidentifieruse.fromCode(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdUse()));

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdVl() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationidentifier.setValue(m.getMdcnlPrdctAthztnJrsdctnalAthztnIdVl());
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorizationjurisdictionalauthorization.addJurisdiction(medicinalproductauthorizationjurisdictionalauthorizationjurisdiction);

		/******************** medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationjurisdictionalauthorizationjurisdiction.addCoding(medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.setCode(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgCd());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.setDisplay(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.setSystem(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgSys());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationjurisdictioncoding.setVersion(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_Jrsdctn_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationjurisdiction.setText(m.getMdcnlPrdctAthztnJrsdctnalAthztnJrsdctnTxt());
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorizationjurisdictionalauthorization.setLegalStatusOfSupply(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply);

		/******************** medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply.addCoding(medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.setCode(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgCd());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.setDisplay(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.setSystem(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgSys());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupplycoding.setVersion(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_LegalStsOfSpply_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyTxt() != null) {
			medicinalproductauthorizationjurisdictionalauthorizationlegalstatusofsupply.setText(m.getMdcnlPrdctAthztnJrsdctnalAthztnLegalStsOfSpplyTxt());
		}
		/******************** medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductauthorizationjurisdictionalauthorization.setValidityPeriod(medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod);

		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Enddate = MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Endsdf.parse(m.getMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdEnd());
			medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.setEnd(MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Enddate);
		}
		/******************** MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Strtdate = MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Strtsdf.parse(m.getMdcnlPrdctAthztnJrsdctnalAthztnValidityPrdStrt());
			medicinalproductauthorizationjurisdictionalauthorizationvalidityperiod.setStart(MdcnlPrdctAthztn_JrsdctnalAthztn_ValidityPrd_Strtdate);
		}
		/******************** medicinalproductauthorizationlegalbasis ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationlegalbasis =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorization.setLegalBasis(medicinalproductauthorizationlegalbasis);

		/******************** medicinalproductauthorizationlegalbasiscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationlegalbasiscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationlegalbasis.addCoding(medicinalproductauthorizationlegalbasiscoding);

		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgCd() != null) {
			medicinalproductauthorizationlegalbasiscoding.setCode(m.getMdcnlPrdctAthztnLegalBasisCdgCd());
		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgDsply() != null) {
			medicinalproductauthorizationlegalbasiscoding.setDisplay(m.getMdcnlPrdctAthztnLegalBasisCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgSys() != null) {
			medicinalproductauthorizationlegalbasiscoding.setSystem(m.getMdcnlPrdctAthztnLegalBasisCdgSys());
		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgUsrSltd() != null) {
			medicinalproductauthorizationlegalbasiscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnLegalBasisCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisCdgVrsn() != null) {
			medicinalproductauthorizationlegalbasiscoding.setVersion(m.getMdcnlPrdctAthztnLegalBasisCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_LegalBasis_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnLegalBasisTxt() != null) {
			medicinalproductauthorizationlegalbasis.setText(m.getMdcnlPrdctAthztnLegalBasisTxt());
		}
		/******************** medicinalproductauthorizationprocedure ********************************************************************************/
		org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationProcedureComponent medicinalproductauthorizationprocedure =  new org.hl7.fhir.r4.model.MedicinalProductAuthorization.MedicinalProductAuthorizationProcedureComponent();
		medicinalproductauthorization.setProcedure(medicinalproductauthorizationprocedure);

		/******************** MdcnlPrdctAthztn_Prcdr_DtDtTimeTyp ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrDtDtTimeTyp() != null) {
			medicinalproductauthorizationprocedure.setDate( new org.hl7.fhir.r4.model.DateTimeType(m.getMdcnlPrdctAthztnPrcdrDtDtTimeTyp()));
		}
		/******************** medicinalproductauthorizationproceduredateperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationproceduredateperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductauthorizationprocedure.setDate(medicinalproductauthorizationproceduredateperiod);

		/******************** MdcnlPrdctAthztn_Prcdr_DtPrd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrDtPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_Prcdr_DtPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_Prcdr_DtPrd_Enddate = MdcnlPrdctAthztn_Prcdr_DtPrd_Endsdf.parse(m.getMdcnlPrdctAthztnPrcdrDtPrdEnd());
			medicinalproductauthorizationproceduredateperiod.setEnd(MdcnlPrdctAthztn_Prcdr_DtPrd_Enddate);
		}
		/******************** MdcnlPrdctAthztn_Prcdr_DtPrd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrDtPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_Prcdr_DtPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_Prcdr_DtPrd_Strtdate = MdcnlPrdctAthztn_Prcdr_DtPrd_Strtsdf.parse(m.getMdcnlPrdctAthztnPrcdrDtPrdStrt());
			medicinalproductauthorizationproceduredateperiod.setStart(MdcnlPrdctAthztn_Prcdr_DtPrd_Strtdate);
		}
		/******************** medicinalproductauthorizationprocedureidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier medicinalproductauthorizationprocedureidentifier =  new org.hl7.fhir.r4.model.Identifier();
		medicinalproductauthorizationprocedure.setIdentifier(medicinalproductauthorizationprocedureidentifier);

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Assigner ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdAssigner() != null) {
			medicinalproductauthorizationprocedureidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnPrcdrIdAssigner()));
		}
		/******************** medicinalproductauthorizationprocedureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationprocedureidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductauthorizationprocedureidentifier.setPeriod(medicinalproductauthorizationprocedureidentifierperiod);

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Prd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_Prcdr_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_Prcdr_Id_Prd_Enddate = MdcnlPrdctAthztn_Prcdr_Id_Prd_Endsdf.parse(m.getMdcnlPrdctAthztnPrcdrIdPrdEnd());
			medicinalproductauthorizationprocedureidentifierperiod.setEnd(MdcnlPrdctAthztn_Prcdr_Id_Prd_Enddate);
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Prd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_Prcdr_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_Prcdr_Id_Prd_Strtdate = MdcnlPrdctAthztn_Prcdr_Id_Prd_Strtsdf.parse(m.getMdcnlPrdctAthztnPrcdrIdPrdStrt());
			medicinalproductauthorizationprocedureidentifierperiod.setStart(MdcnlPrdctAthztn_Prcdr_Id_Prd_Strtdate);
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdSys() != null) {
			medicinalproductauthorizationprocedureidentifier.setSystem(m.getMdcnlPrdctAthztnPrcdrIdSys());
		}
		/******************** medicinalproductauthorizationprocedureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationprocedureidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorizationprocedureidentifier.setType(medicinalproductauthorizationprocedureidentifiertype);

		/******************** medicinalproductauthorizationprocedureidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationprocedureidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationprocedureidentifiertype.addCoding(medicinalproductauthorizationprocedureidentifiertypecoding);

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgCd() != null) {
			medicinalproductauthorizationprocedureidentifiertypecoding.setCode(m.getMdcnlPrdctAthztnPrcdrIdTypCdgCd());
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgDsply() != null) {
			medicinalproductauthorizationprocedureidentifiertypecoding.setDisplay(m.getMdcnlPrdctAthztnPrcdrIdTypCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgSys() != null) {
			medicinalproductauthorizationprocedureidentifiertypecoding.setSystem(m.getMdcnlPrdctAthztnPrcdrIdTypCdgSys());
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgUsrSltd() != null) {
			medicinalproductauthorizationprocedureidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnPrcdrIdTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypCdgVrsn() != null) {
			medicinalproductauthorizationprocedureidentifiertypecoding.setVersion(m.getMdcnlPrdctAthztnPrcdrIdTypCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Id_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdTypTxt() != null) {
			medicinalproductauthorizationprocedureidentifiertype.setText(m.getMdcnlPrdctAthztnPrcdrIdTypTxt());
		}
		/******************** medicinalproductauthorizationprocedureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicinalproductauthorizationprocedureidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		medicinalproductauthorizationprocedureidentifier.setUse(medicinalproductauthorizationprocedureidentifieruse.fromCode(m.getMdcnlPrdctAthztnPrcdrIdUse()));

		/******************** MdcnlPrdctAthztn_Prcdr_Id_Vl ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrIdVl() != null) {
			medicinalproductauthorizationprocedureidentifier.setValue(m.getMdcnlPrdctAthztnPrcdrIdVl());
		}
		/******************** medicinalproductauthorizationproceduretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationproceduretype =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorizationprocedure.setType(medicinalproductauthorizationproceduretype);

		/******************** medicinalproductauthorizationproceduretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationproceduretypecoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationproceduretype.addCoding(medicinalproductauthorizationproceduretypecoding);

		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgCd() != null) {
			medicinalproductauthorizationproceduretypecoding.setCode(m.getMdcnlPrdctAthztnPrcdrTypCdgCd());
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgDsply() != null) {
			medicinalproductauthorizationproceduretypecoding.setDisplay(m.getMdcnlPrdctAthztnPrcdrTypCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgSys() != null) {
			medicinalproductauthorizationproceduretypecoding.setSystem(m.getMdcnlPrdctAthztnPrcdrTypCdgSys());
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgUsrSltd() != null) {
			medicinalproductauthorizationproceduretypecoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnPrcdrTypCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypCdgVrsn() != null) {
			medicinalproductauthorizationproceduretypecoding.setVersion(m.getMdcnlPrdctAthztnPrcdrTypCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_Prcdr_Typ_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnPrcdrTypTxt() != null) {
			medicinalproductauthorizationproceduretype.setText(m.getMdcnlPrdctAthztnPrcdrTypTxt());
		}
		/******************** MdcnlPrdctAthztn_Regulator ********************************************************************************/
		if(m.getMdcnlPrdctAthztnRegulator() != null) {
			medicinalproductauthorization.setRegulator( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnRegulator()));
		}
		/******************** MdcnlPrdctAthztn_RestoreDt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnRestoreDt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_RestoreDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_RestoreDtdate = MdcnlPrdctAthztn_RestoreDtsdf.parse(m.getMdcnlPrdctAthztnRestoreDt());
			medicinalproductauthorization.setRestoreDate(MdcnlPrdctAthztn_RestoreDtdate);
		}
		/******************** medicinalproductauthorizationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept medicinalproductauthorizationstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		medicinalproductauthorization.setStatus(medicinalproductauthorizationstatus);

		/******************** medicinalproductauthorizationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding medicinalproductauthorizationstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		medicinalproductauthorizationstatus.addCoding(medicinalproductauthorizationstatuscoding);

		/******************** MdcnlPrdctAthztn_Sts_Cdg_Cd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgCd() != null) {
			medicinalproductauthorizationstatuscoding.setCode(m.getMdcnlPrdctAthztnStsCdgCd());
		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Dsply ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgDsply() != null) {
			medicinalproductauthorizationstatuscoding.setDisplay(m.getMdcnlPrdctAthztnStsCdgDsply());
		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Sys ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgSys() != null) {
			medicinalproductauthorizationstatuscoding.setSystem(m.getMdcnlPrdctAthztnStsCdgSys());
		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgUsrSltd() != null) {
			medicinalproductauthorizationstatuscoding.setUserSelected(Boolean.parseBoolean(m.getMdcnlPrdctAthztnStsCdgUsrSltd()));
		}
		/******************** MdcnlPrdctAthztn_Sts_Cdg_Vrsn ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsCdgVrsn() != null) {
			medicinalproductauthorizationstatuscoding.setVersion(m.getMdcnlPrdctAthztnStsCdgVrsn());
		}
		/******************** MdcnlPrdctAthztn_Sts_Txt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsTxt() != null) {
			medicinalproductauthorizationstatus.setText(m.getMdcnlPrdctAthztnStsTxt());
		}
		/******************** MdcnlPrdctAthztn_StsDt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnStsDt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_StsDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_StsDtdate = MdcnlPrdctAthztn_StsDtsdf.parse(m.getMdcnlPrdctAthztnStsDt());
			medicinalproductauthorization.setStatusDate(MdcnlPrdctAthztn_StsDtdate);
		}
		/******************** MdcnlPrdctAthztn_Sbjct ********************************************************************************/
		if(m.getMdcnlPrdctAthztnSbjct() != null) {
			medicinalproductauthorization.setSubject( new org.hl7.fhir.r4.model.Reference(m.getMdcnlPrdctAthztnSbjct()));
		}
		/******************** medicinalproductauthorizationvalidityperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period medicinalproductauthorizationvalidityperiod =  new org.hl7.fhir.r4.model.Period();
		medicinalproductauthorization.setValidityPeriod(medicinalproductauthorizationvalidityperiod);

		/******************** MdcnlPrdctAthztn_ValidityPrd_End ********************************************************************************/
		if(m.getMdcnlPrdctAthztnValidityPrdEnd() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_ValidityPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_ValidityPrd_Enddate = MdcnlPrdctAthztn_ValidityPrd_Endsdf.parse(m.getMdcnlPrdctAthztnValidityPrdEnd());
			medicinalproductauthorizationvalidityperiod.setEnd(MdcnlPrdctAthztn_ValidityPrd_Enddate);
		}
		/******************** MdcnlPrdctAthztn_ValidityPrd_Strt ********************************************************************************/
		if(m.getMdcnlPrdctAthztnValidityPrdStrt() != null) {
			java.text.SimpleDateFormat MdcnlPrdctAthztn_ValidityPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MdcnlPrdctAthztn_ValidityPrd_Strtdate = MdcnlPrdctAthztn_ValidityPrd_Strtsdf.parse(m.getMdcnlPrdctAthztnValidityPrdStrt());
			medicinalproductauthorizationvalidityperiod.setStart(MdcnlPrdctAthztn_ValidityPrd_Strtdate);
		}
		return medicinalproductauthorization;
	}
}
