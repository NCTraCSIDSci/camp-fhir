package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Basic;
public class BasicConversion 
{
	public org.hl7.fhir.r4.model.Basic Basics(Basic b) throws ParseException
	{
		org.hl7.fhir.r4.model.Basic basic = new org.hl7.fhir.r4.model.Basic();

		/******************** id ********************************************************************************/
		basic.setId(b.getId());

		/******************** Basic_Athr ********************************************************************************/
		if(b.getBasicAthr() != null) {
			basic.setAuthor( new org.hl7.fhir.r4.model.Reference(b.getBasicAthr()));
		}
		/******************** basiccode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept basiccode =  new org.hl7.fhir.r4.model.CodeableConcept();
		basic.setCode(basiccode);

		/******************** basiccodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding basiccodecoding =  new org.hl7.fhir.r4.model.Coding();
		basiccode.addCoding(basiccodecoding);

		/******************** Basic_Cd_Cdg_Cd ********************************************************************************/
		if(b.getBasicCdCdgCd() != null) {
			basiccodecoding.setCode(b.getBasicCdCdgCd());
		}
		/******************** Basic_Cd_Cdg_Dsply ********************************************************************************/
		if(b.getBasicCdCdgDsply() != null) {
			basiccodecoding.setDisplay(b.getBasicCdCdgDsply());
		}
		/******************** Basic_Cd_Cdg_Sys ********************************************************************************/
		if(b.getBasicCdCdgSys() != null) {
			basiccodecoding.setSystem(b.getBasicCdCdgSys());
		}
		/******************** Basic_Cd_Cdg_UsrSltd ********************************************************************************/
		if(b.getBasicCdCdgUsrSltd() != null) {
			basiccodecoding.setUserSelected(Boolean.parseBoolean(b.getBasicCdCdgUsrSltd()));
		}
		/******************** Basic_Cd_Cdg_Vrsn ********************************************************************************/
		if(b.getBasicCdCdgVrsn() != null) {
			basiccodecoding.setVersion(b.getBasicCdCdgVrsn());
		}
		/******************** Basic_Cd_Txt ********************************************************************************/
		if(b.getBasicCdTxt() != null) {
			basiccode.setText(b.getBasicCdTxt());
		}
		/******************** Basic_Created ********************************************************************************/
		if(b.getBasicCreated() != null) {
			java.text.SimpleDateFormat Basic_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Basic_Createddate = Basic_Createdsdf.parse(b.getBasicCreated());
			basic.setCreated(Basic_Createddate);
		}
		/******************** basicidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier basicidentifier =  new org.hl7.fhir.r4.model.Identifier();
		basic.addIdentifier(basicidentifier);

		/******************** Basic_Id_Assigner ********************************************************************************/
		if(b.getBasicIdAssigner() != null) {
			basicidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(b.getBasicIdAssigner()));
		}
		/******************** basicidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period basicidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		basicidentifier.setPeriod(basicidentifierperiod);

		/******************** Basic_Id_Prd_End ********************************************************************************/
		if(b.getBasicIdPrdEnd() != null) {
			java.text.SimpleDateFormat Basic_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Basic_Id_Prd_Enddate = Basic_Id_Prd_Endsdf.parse(b.getBasicIdPrdEnd());
			basicidentifierperiod.setEnd(Basic_Id_Prd_Enddate);
		}
		/******************** Basic_Id_Prd_Strt ********************************************************************************/
		if(b.getBasicIdPrdStrt() != null) {
			java.text.SimpleDateFormat Basic_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Basic_Id_Prd_Strtdate = Basic_Id_Prd_Strtsdf.parse(b.getBasicIdPrdStrt());
			basicidentifierperiod.setStart(Basic_Id_Prd_Strtdate);
		}
		/******************** Basic_Id_Sys ********************************************************************************/
		if(b.getBasicIdSys() != null) {
			basicidentifier.setSystem(b.getBasicIdSys());
		}
		/******************** basicidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept basicidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		basicidentifier.setType(basicidentifiertype);

		/******************** basicidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding basicidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		basicidentifiertype.addCoding(basicidentifiertypecoding);

		/******************** Basic_Id_Typ_Cdg_Cd ********************************************************************************/
		if(b.getBasicIdTypCdgCd() != null) {
			basicidentifiertypecoding.setCode(b.getBasicIdTypCdgCd());
		}
		/******************** Basic_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(b.getBasicIdTypCdgDsply() != null) {
			basicidentifiertypecoding.setDisplay(b.getBasicIdTypCdgDsply());
		}
		/******************** Basic_Id_Typ_Cdg_Sys ********************************************************************************/
		if(b.getBasicIdTypCdgSys() != null) {
			basicidentifiertypecoding.setSystem(b.getBasicIdTypCdgSys());
		}
		/******************** Basic_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(b.getBasicIdTypCdgUsrSltd() != null) {
			basicidentifiertypecoding.setUserSelected(Boolean.parseBoolean(b.getBasicIdTypCdgUsrSltd()));
		}
		/******************** Basic_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(b.getBasicIdTypCdgVrsn() != null) {
			basicidentifiertypecoding.setVersion(b.getBasicIdTypCdgVrsn());
		}
		/******************** Basic_Id_Typ_Txt ********************************************************************************/
		if(b.getBasicIdTypTxt() != null) {
			basicidentifiertype.setText(b.getBasicIdTypTxt());
		}
		/******************** basicidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory basicidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		basicidentifier.setUse(basicidentifieruse.fromCode(b.getBasicIdUse()));

		/******************** Basic_Id_Vl ********************************************************************************/
		if(b.getBasicIdVl() != null) {
			basicidentifier.setValue(b.getBasicIdVl());
		}
		/******************** Basic_Sbjct ********************************************************************************/
		if(b.getBasicSbjct() != null) {
			basic.setSubject( new org.hl7.fhir.r4.model.Reference(b.getBasicSbjct()));
		}
		return basic;
	}
}
