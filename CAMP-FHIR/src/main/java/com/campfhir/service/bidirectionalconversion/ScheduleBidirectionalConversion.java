package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Schedule;
public class ScheduleBidirectionalConversion 
{
	public Schedule Schedules(org.hl7.fhir.r4.model.Schedule schedule) throws ParseException
	{
		 main.java.com.campfhir.model.Schedule s = new  main.java.com.campfhir.model.Schedule();

		/******************** id ********************************************************************************/
		schedule.setId(s.getId());

		/******************** Schdl_Comment ********************************************************************************/
		if(schedule.hasComment()) {
			s.setSchdlComment(String.valueOf(schedule.getComment()));
		}
		/******************** Schdl_Actor ********************************************************************************/
		if(schedule.hasActor()) {
			s.setSchdlActor(String.valueOf(schedule.getActorFirstRep()));
		}
		/******************** scheduleplanninghorizon ********************************************************************************/
		org.hl7.fhir.r4.model.Period scheduleplanninghorizon = schedule.getPlanningHorizon();

		/******************** Schdl_PlnningHorizon_Strt ********************************************************************************/
		if(scheduleplanninghorizon.hasStart()) {
			s.setSchdlPlnningHorizonStrt(String.valueOf(scheduleplanninghorizon.getStart()));
		}
		/******************** Schdl_PlnningHorizon_End ********************************************************************************/
		if(scheduleplanninghorizon.hasEnd()) {
			s.setSchdlPlnningHorizonEnd(String.valueOf(scheduleplanninghorizon.getEnd()));
		}
		/******************** Schdl_Active ********************************************************************************/
		if(schedule.hasActive()) {
			s.setSchdlActive(String.valueOf(schedule.getActive()));
		}
		/******************** scheduleservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept scheduleservicetype = schedule.getServiceTypeFirstRep();

		/******************** Schdl_SrvTyp_Txt ********************************************************************************/
		if(scheduleservicetype.hasText()) {
			s.setSchdlSrvTypTxt(String.valueOf(scheduleservicetype.getText()));
		}
		/******************** scheduleservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding scheduleservicetypecoding = scheduleservicetype.getCodingFirstRep();

		/******************** Schdl_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(scheduleservicetypecoding.hasVersion()) {
			s.setSchdlSrvTypCdgVrsn(String.valueOf(scheduleservicetypecoding.getVersion()));
		}
		/******************** Schdl_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(scheduleservicetypecoding.hasDisplay()) {
			s.setSchdlSrvTypCdgDsply(String.valueOf(scheduleservicetypecoding.getDisplay()));
		}
		/******************** Schdl_SrvTyp_Cdg_Cd ********************************************************************************/
		if(scheduleservicetypecoding.hasCode()) {
			s.setSchdlSrvTypCdgCd(String.valueOf(scheduleservicetypecoding.getCode()));
		}
		/******************** Schdl_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(scheduleservicetypecoding.hasUserSelected()) {
			s.setSchdlSrvTypCdgUsrSltd(String.valueOf(scheduleservicetypecoding.getUserSelected()));
		}
		/******************** Schdl_SrvTyp_Cdg_Sys ********************************************************************************/
		if(scheduleservicetypecoding.hasSystem()) {
			s.setSchdlSrvTypCdgSys(String.valueOf(scheduleservicetypecoding.getSystem()));
		}
		/******************** schedulespecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept schedulespecialty = schedule.getSpecialtyFirstRep();

		/******************** Schdl_Spclty_Txt ********************************************************************************/
		if(schedulespecialty.hasText()) {
			s.setSchdlSpcltyTxt(String.valueOf(schedulespecialty.getText()));
		}
		/******************** schedulespecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding schedulespecialtycoding = schedulespecialty.getCodingFirstRep();

		/******************** Schdl_Spclty_Cdg_Vrsn ********************************************************************************/
		if(schedulespecialtycoding.hasVersion()) {
			s.setSchdlSpcltyCdgVrsn(String.valueOf(schedulespecialtycoding.getVersion()));
		}
		/******************** Schdl_Spclty_Cdg_Dsply ********************************************************************************/
		if(schedulespecialtycoding.hasDisplay()) {
			s.setSchdlSpcltyCdgDsply(String.valueOf(schedulespecialtycoding.getDisplay()));
		}
		/******************** Schdl_Spclty_Cdg_Cd ********************************************************************************/
		if(schedulespecialtycoding.hasCode()) {
			s.setSchdlSpcltyCdgCd(String.valueOf(schedulespecialtycoding.getCode()));
		}
		/******************** Schdl_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(schedulespecialtycoding.hasUserSelected()) {
			s.setSchdlSpcltyCdgUsrSltd(String.valueOf(schedulespecialtycoding.getUserSelected()));
		}
		/******************** Schdl_Spclty_Cdg_Sys ********************************************************************************/
		if(schedulespecialtycoding.hasSystem()) {
			s.setSchdlSpcltyCdgSys(String.valueOf(schedulespecialtycoding.getSystem()));
		}
		/******************** scheduleservicecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept scheduleservicecategory = schedule.getServiceCategoryFirstRep();

		/******************** Schdl_SrvCtgry_Txt ********************************************************************************/
		if(scheduleservicecategory.hasText()) {
			s.setSchdlSrvCtgryTxt(String.valueOf(scheduleservicecategory.getText()));
		}
		/******************** scheduleservicecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding scheduleservicecategorycoding = scheduleservicecategory.getCodingFirstRep();

		/******************** Schdl_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(scheduleservicecategorycoding.hasVersion()) {
			s.setSchdlSrvCtgryCdgVrsn(String.valueOf(scheduleservicecategorycoding.getVersion()));
		}
		/******************** Schdl_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(scheduleservicecategorycoding.hasDisplay()) {
			s.setSchdlSrvCtgryCdgDsply(String.valueOf(scheduleservicecategorycoding.getDisplay()));
		}
		/******************** Schdl_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(scheduleservicecategorycoding.hasCode()) {
			s.setSchdlSrvCtgryCdgCd(String.valueOf(scheduleservicecategorycoding.getCode()));
		}
		/******************** Schdl_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(scheduleservicecategorycoding.hasUserSelected()) {
			s.setSchdlSrvCtgryCdgUsrSltd(String.valueOf(scheduleservicecategorycoding.getUserSelected()));
		}
		/******************** Schdl_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(scheduleservicecategorycoding.hasSystem()) {
			s.setSchdlSrvCtgryCdgSys(String.valueOf(scheduleservicecategorycoding.getSystem()));
		}
		/******************** scheduleidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier scheduleidentifier = schedule.getIdentifierFirstRep();

		/******************** Schdl_Id_Vl ********************************************************************************/
		if(scheduleidentifier.hasValue()) {
			s.setSchdlIdVl(String.valueOf(scheduleidentifier.getValue()));
		}
		/******************** scheduleidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept scheduleidentifiertype = scheduleidentifier.getType();

		/******************** Schdl_Id_Typ_Txt ********************************************************************************/
		if(scheduleidentifiertype.hasText()) {
			s.setSchdlIdTypTxt(String.valueOf(scheduleidentifiertype.getText()));
		}
		/******************** scheduleidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding scheduleidentifiertypecoding = scheduleidentifiertype.getCodingFirstRep();

		/******************** Schdl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(scheduleidentifiertypecoding.hasVersion()) {
			s.setSchdlIdTypCdgVrsn(String.valueOf(scheduleidentifiertypecoding.getVersion()));
		}
		/******************** Schdl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(scheduleidentifiertypecoding.hasDisplay()) {
			s.setSchdlIdTypCdgDsply(String.valueOf(scheduleidentifiertypecoding.getDisplay()));
		}
		/******************** Schdl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(scheduleidentifiertypecoding.hasCode()) {
			s.setSchdlIdTypCdgCd(String.valueOf(scheduleidentifiertypecoding.getCode()));
		}
		/******************** Schdl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(scheduleidentifiertypecoding.hasUserSelected()) {
			s.setSchdlIdTypCdgUsrSltd(String.valueOf(scheduleidentifiertypecoding.getUserSelected()));
		}
		/******************** Schdl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(scheduleidentifiertypecoding.hasSystem()) {
			s.setSchdlIdTypCdgSys(String.valueOf(scheduleidentifiertypecoding.getSystem()));
		}
		/******************** scheduleidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period scheduleidentifierperiod = scheduleidentifier.getPeriod();

		/******************** Schdl_Id_Prd_Strt ********************************************************************************/
		if(scheduleidentifierperiod.hasStart()) {
			s.setSchdlIdPrdStrt(String.valueOf(scheduleidentifierperiod.getStart()));
		}
		/******************** Schdl_Id_Prd_End ********************************************************************************/
		if(scheduleidentifierperiod.hasEnd()) {
			s.setSchdlIdPrdEnd(String.valueOf(scheduleidentifierperiod.getEnd()));
		}
		/******************** Schdl_Id_Assigner ********************************************************************************/
		if(scheduleidentifier.hasAssigner()) {
			s.setSchdlIdAssigner(String.valueOf(scheduleidentifier.getAssigner()));
		}
		/******************** Schdl_Id_Sys ********************************************************************************/
		if(scheduleidentifier.hasSystem()) {
			s.setSchdlIdSys(String.valueOf(scheduleidentifier.getSystem()));
		}
		/******************** scheduleidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse scheduleidentifieruse = scheduleidentifier.getUse();
		s.setSchdlIdUse(scheduleidentifieruse.toCode());

		return s;
	}
}
