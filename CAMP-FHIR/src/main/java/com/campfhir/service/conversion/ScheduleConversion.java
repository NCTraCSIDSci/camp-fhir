package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Schedule;
public class ScheduleConversion 
{
	public org.hl7.fhir.r4.model.Schedule Schedules(Schedule s) throws ParseException
	{
		org.hl7.fhir.r4.model.Schedule schedule = new org.hl7.fhir.r4.model.Schedule();

		/******************** id ********************************************************************************/
		schedule.setId(s.getId());

		/******************** Schdl_Active ********************************************************************************/
		if(s.getSchdlActive() != null) {
			schedule.setActive(Boolean.parseBoolean(s.getSchdlActive()));
		}
		/******************** Schdl_Actor ********************************************************************************/
		if(s.getSchdlActor() != null) {
			schedule.addActor( new org.hl7.fhir.r4.model.Reference(s.getSchdlActor()));
		}
		/******************** Schdl_Comment ********************************************************************************/
		if(s.getSchdlComment() != null) {
			schedule.setComment(s.getSchdlComment());
		}
		/******************** scheduleidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier scheduleidentifier =  new org.hl7.fhir.r4.model.Identifier();
		schedule.addIdentifier(scheduleidentifier);

		/******************** Schdl_Id_Assigner ********************************************************************************/
		if(s.getSchdlIdAssigner() != null) {
			scheduleidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSchdlIdAssigner()));
		}
		/******************** scheduleidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period scheduleidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		scheduleidentifier.setPeriod(scheduleidentifierperiod);

		/******************** Schdl_Id_Prd_End ********************************************************************************/
		if(s.getSchdlIdPrdEnd() != null) {
			java.text.SimpleDateFormat Schdl_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Schdl_Id_Prd_Enddate = Schdl_Id_Prd_Endsdf.parse(s.getSchdlIdPrdEnd());
			scheduleidentifierperiod.setEnd(Schdl_Id_Prd_Enddate);
		}
		/******************** Schdl_Id_Prd_Strt ********************************************************************************/
		if(s.getSchdlIdPrdStrt() != null) {
			java.text.SimpleDateFormat Schdl_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Schdl_Id_Prd_Strtdate = Schdl_Id_Prd_Strtsdf.parse(s.getSchdlIdPrdStrt());
			scheduleidentifierperiod.setStart(Schdl_Id_Prd_Strtdate);
		}
		/******************** Schdl_Id_Sys ********************************************************************************/
		if(s.getSchdlIdSys() != null) {
			scheduleidentifier.setSystem(s.getSchdlIdSys());
		}
		/******************** scheduleidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept scheduleidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		scheduleidentifier.setType(scheduleidentifiertype);

		/******************** scheduleidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding scheduleidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		scheduleidentifiertype.addCoding(scheduleidentifiertypecoding);

		/******************** Schdl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSchdlIdTypCdgCd() != null) {
			scheduleidentifiertypecoding.setCode(s.getSchdlIdTypCdgCd());
		}
		/******************** Schdl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSchdlIdTypCdgDsply() != null) {
			scheduleidentifiertypecoding.setDisplay(s.getSchdlIdTypCdgDsply());
		}
		/******************** Schdl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSchdlIdTypCdgSys() != null) {
			scheduleidentifiertypecoding.setSystem(s.getSchdlIdTypCdgSys());
		}
		/******************** Schdl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSchdlIdTypCdgUsrSltd() != null) {
			scheduleidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSchdlIdTypCdgUsrSltd()));
		}
		/******************** Schdl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSchdlIdTypCdgVrsn() != null) {
			scheduleidentifiertypecoding.setVersion(s.getSchdlIdTypCdgVrsn());
		}
		/******************** Schdl_Id_Typ_Txt ********************************************************************************/
		if(s.getSchdlIdTypTxt() != null) {
			scheduleidentifiertype.setText(s.getSchdlIdTypTxt());
		}
		/******************** scheduleidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory scheduleidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		scheduleidentifier.setUse(scheduleidentifieruse.fromCode(s.getSchdlIdUse()));

		/******************** Schdl_Id_Vl ********************************************************************************/
		if(s.getSchdlIdVl() != null) {
			scheduleidentifier.setValue(s.getSchdlIdVl());
		}
		/******************** scheduleplanninghorizon ********************************************************************************/
		org.hl7.fhir.r4.model.Period scheduleplanninghorizon =  new org.hl7.fhir.r4.model.Period();
		schedule.setPlanningHorizon(scheduleplanninghorizon);

		/******************** Schdl_PlnningHorizon_End ********************************************************************************/
		if(s.getSchdlPlnningHorizonEnd() != null) {
			java.text.SimpleDateFormat Schdl_PlnningHorizon_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Schdl_PlnningHorizon_Enddate = Schdl_PlnningHorizon_Endsdf.parse(s.getSchdlPlnningHorizonEnd());
			scheduleplanninghorizon.setEnd(Schdl_PlnningHorizon_Enddate);
		}
		/******************** Schdl_PlnningHorizon_Strt ********************************************************************************/
		if(s.getSchdlPlnningHorizonStrt() != null) {
			java.text.SimpleDateFormat Schdl_PlnningHorizon_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Schdl_PlnningHorizon_Strtdate = Schdl_PlnningHorizon_Strtsdf.parse(s.getSchdlPlnningHorizonStrt());
			scheduleplanninghorizon.setStart(Schdl_PlnningHorizon_Strtdate);
		}
		/******************** scheduleservicecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept scheduleservicecategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		schedule.addServiceCategory(scheduleservicecategory);

		/******************** scheduleservicecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding scheduleservicecategorycoding =  new org.hl7.fhir.r4.model.Coding();
		scheduleservicecategory.addCoding(scheduleservicecategorycoding);

		/******************** Schdl_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgCd() != null) {
			scheduleservicecategorycoding.setCode(s.getSchdlSrvCtgryCdgCd());
		}
		/******************** Schdl_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgDsply() != null) {
			scheduleservicecategorycoding.setDisplay(s.getSchdlSrvCtgryCdgDsply());
		}
		/******************** Schdl_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgSys() != null) {
			scheduleservicecategorycoding.setSystem(s.getSchdlSrvCtgryCdgSys());
		}
		/******************** Schdl_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgUsrSltd() != null) {
			scheduleservicecategorycoding.setUserSelected(Boolean.parseBoolean(s.getSchdlSrvCtgryCdgUsrSltd()));
		}
		/******************** Schdl_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgVrsn() != null) {
			scheduleservicecategorycoding.setVersion(s.getSchdlSrvCtgryCdgVrsn());
		}
		/******************** Schdl_SrvCtgry_Txt ********************************************************************************/
		if(s.getSchdlSrvCtgryTxt() != null) {
			scheduleservicecategory.setText(s.getSchdlSrvCtgryTxt());
		}
		/******************** scheduleservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept scheduleservicetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		schedule.addServiceType(scheduleservicetype);

		/******************** scheduleservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding scheduleservicetypecoding =  new org.hl7.fhir.r4.model.Coding();
		scheduleservicetype.addCoding(scheduleservicetypecoding);

		/******************** Schdl_SrvTyp_Cdg_Cd ********************************************************************************/
		if(s.getSchdlSrvTypCdgCd() != null) {
			scheduleservicetypecoding.setCode(s.getSchdlSrvTypCdgCd());
		}
		/******************** Schdl_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSchdlSrvTypCdgDsply() != null) {
			scheduleservicetypecoding.setDisplay(s.getSchdlSrvTypCdgDsply());
		}
		/******************** Schdl_SrvTyp_Cdg_Sys ********************************************************************************/
		if(s.getSchdlSrvTypCdgSys() != null) {
			scheduleservicetypecoding.setSystem(s.getSchdlSrvTypCdgSys());
		}
		/******************** Schdl_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSchdlSrvTypCdgUsrSltd() != null) {
			scheduleservicetypecoding.setUserSelected(Boolean.parseBoolean(s.getSchdlSrvTypCdgUsrSltd()));
		}
		/******************** Schdl_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSchdlSrvTypCdgVrsn() != null) {
			scheduleservicetypecoding.setVersion(s.getSchdlSrvTypCdgVrsn());
		}
		/******************** Schdl_SrvTyp_Txt ********************************************************************************/
		if(s.getSchdlSrvTypTxt() != null) {
			scheduleservicetype.setText(s.getSchdlSrvTypTxt());
		}
		/******************** schedulespecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept schedulespecialty =  new org.hl7.fhir.r4.model.CodeableConcept();
		schedule.addSpecialty(schedulespecialty);

		/******************** schedulespecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding schedulespecialtycoding =  new org.hl7.fhir.r4.model.Coding();
		schedulespecialty.addCoding(schedulespecialtycoding);

		/******************** Schdl_Spclty_Cdg_Cd ********************************************************************************/
		if(s.getSchdlSpcltyCdgCd() != null) {
			schedulespecialtycoding.setCode(s.getSchdlSpcltyCdgCd());
		}
		/******************** Schdl_Spclty_Cdg_Dsply ********************************************************************************/
		if(s.getSchdlSpcltyCdgDsply() != null) {
			schedulespecialtycoding.setDisplay(s.getSchdlSpcltyCdgDsply());
		}
		/******************** Schdl_Spclty_Cdg_Sys ********************************************************************************/
		if(s.getSchdlSpcltyCdgSys() != null) {
			schedulespecialtycoding.setSystem(s.getSchdlSpcltyCdgSys());
		}
		/******************** Schdl_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(s.getSchdlSpcltyCdgUsrSltd() != null) {
			schedulespecialtycoding.setUserSelected(Boolean.parseBoolean(s.getSchdlSpcltyCdgUsrSltd()));
		}
		/******************** Schdl_Spclty_Cdg_Vrsn ********************************************************************************/
		if(s.getSchdlSpcltyCdgVrsn() != null) {
			schedulespecialtycoding.setVersion(s.getSchdlSpcltyCdgVrsn());
		}
		/******************** Schdl_Spclty_Txt ********************************************************************************/
		if(s.getSchdlSpcltyTxt() != null) {
			schedulespecialty.setText(s.getSchdlSpcltyTxt());
		}
		return schedule;
	}
}
