package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Slot;
public class SlotConversion 
{
	public org.hl7.fhir.r4.model.Slot Slots(Slot s) throws ParseException
	{
		org.hl7.fhir.r4.model.Slot slot = new org.hl7.fhir.r4.model.Slot();

		/******************** id ********************************************************************************/
		slot.setId(s.getId());

		/******************** slotappointmenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotappointmenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		slot.setAppointmentType(slotappointmenttype);

		/******************** slotappointmenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotappointmenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		slotappointmenttype.addCoding(slotappointmenttypecoding);

		/******************** Slot_AppmntTyp_Cdg_Cd ********************************************************************************/
		if(s.getSlotAppmntTypCdgCd() != null) {
			slotappointmenttypecoding.setCode(s.getSlotAppmntTypCdgCd());
		}
		/******************** Slot_AppmntTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSlotAppmntTypCdgDsply() != null) {
			slotappointmenttypecoding.setDisplay(s.getSlotAppmntTypCdgDsply());
		}
		/******************** Slot_AppmntTyp_Cdg_Sys ********************************************************************************/
		if(s.getSlotAppmntTypCdgSys() != null) {
			slotappointmenttypecoding.setSystem(s.getSlotAppmntTypCdgSys());
		}
		/******************** Slot_AppmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotAppmntTypCdgUsrSltd() != null) {
			slotappointmenttypecoding.setUserSelected(Boolean.parseBoolean(s.getSlotAppmntTypCdgUsrSltd()));
		}
		/******************** Slot_AppmntTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotAppmntTypCdgVrsn() != null) {
			slotappointmenttypecoding.setVersion(s.getSlotAppmntTypCdgVrsn());
		}
		/******************** Slot_AppmntTyp_Txt ********************************************************************************/
		if(s.getSlotAppmntTypTxt() != null) {
			slotappointmenttype.setText(s.getSlotAppmntTypTxt());
		}
		/******************** Slot_Comment ********************************************************************************/
		if(s.getSlotComment() != null) {
			slot.setComment(s.getSlotComment());
		}
		/******************** Slot_End ********************************************************************************/
		if(s.getSlotEnd() != null) {
			java.text.SimpleDateFormat Slot_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Slot_Enddate = Slot_Endsdf.parse(s.getSlotEnd());
			slot.setEnd(Slot_Enddate);
		}
		/******************** slotidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier slotidentifier =  new org.hl7.fhir.r4.model.Identifier();
		slot.addIdentifier(slotidentifier);

		/******************** Slot_Id_Assigner ********************************************************************************/
		if(s.getSlotIdAssigner() != null) {
			slotidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSlotIdAssigner()));
		}
		/******************** slotidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period slotidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		slotidentifier.setPeriod(slotidentifierperiod);

		/******************** Slot_Id_Prd_End ********************************************************************************/
		if(s.getSlotIdPrdEnd() != null) {
			java.text.SimpleDateFormat Slot_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Slot_Id_Prd_Enddate = Slot_Id_Prd_Endsdf.parse(s.getSlotIdPrdEnd());
			slotidentifierperiod.setEnd(Slot_Id_Prd_Enddate);
		}
		/******************** Slot_Id_Prd_Strt ********************************************************************************/
		if(s.getSlotIdPrdStrt() != null) {
			java.text.SimpleDateFormat Slot_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Slot_Id_Prd_Strtdate = Slot_Id_Prd_Strtsdf.parse(s.getSlotIdPrdStrt());
			slotidentifierperiod.setStart(Slot_Id_Prd_Strtdate);
		}
		/******************** Slot_Id_Sys ********************************************************************************/
		if(s.getSlotIdSys() != null) {
			slotidentifier.setSystem(s.getSlotIdSys());
		}
		/******************** slotidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		slotidentifier.setType(slotidentifiertype);

		/******************** slotidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		slotidentifiertype.addCoding(slotidentifiertypecoding);

		/******************** Slot_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSlotIdTypCdgCd() != null) {
			slotidentifiertypecoding.setCode(s.getSlotIdTypCdgCd());
		}
		/******************** Slot_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSlotIdTypCdgDsply() != null) {
			slotidentifiertypecoding.setDisplay(s.getSlotIdTypCdgDsply());
		}
		/******************** Slot_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSlotIdTypCdgSys() != null) {
			slotidentifiertypecoding.setSystem(s.getSlotIdTypCdgSys());
		}
		/******************** Slot_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotIdTypCdgUsrSltd() != null) {
			slotidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSlotIdTypCdgUsrSltd()));
		}
		/******************** Slot_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotIdTypCdgVrsn() != null) {
			slotidentifiertypecoding.setVersion(s.getSlotIdTypCdgVrsn());
		}
		/******************** Slot_Id_Typ_Txt ********************************************************************************/
		if(s.getSlotIdTypTxt() != null) {
			slotidentifiertype.setText(s.getSlotIdTypTxt());
		}
		/******************** slotidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory slotidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		slotidentifier.setUse(slotidentifieruse.fromCode(s.getSlotIdUse()));

		/******************** Slot_Id_Vl ********************************************************************************/
		if(s.getSlotIdVl() != null) {
			slotidentifier.setValue(s.getSlotIdVl());
		}
		/******************** Slot_Overbooked ********************************************************************************/
		if(s.getSlotOverbooked() != null) {
			slot.setOverbooked(Boolean.parseBoolean(s.getSlotOverbooked()));
		}
		/******************** Slot_Schdl ********************************************************************************/
		if(s.getSlotSchdl() != null) {
			slot.setSchedule( new org.hl7.fhir.r4.model.Reference(s.getSlotSchdl()));
		}
		/******************** slotservicecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotservicecategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		slot.addServiceCategory(slotservicecategory);

		/******************** slotservicecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotservicecategorycoding =  new org.hl7.fhir.r4.model.Coding();
		slotservicecategory.addCoding(slotservicecategorycoding);

		/******************** Slot_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(s.getSlotSrvCtgryCdgCd() != null) {
			slotservicecategorycoding.setCode(s.getSlotSrvCtgryCdgCd());
		}
		/******************** Slot_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(s.getSlotSrvCtgryCdgDsply() != null) {
			slotservicecategorycoding.setDisplay(s.getSlotSrvCtgryCdgDsply());
		}
		/******************** Slot_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(s.getSlotSrvCtgryCdgSys() != null) {
			slotservicecategorycoding.setSystem(s.getSlotSrvCtgryCdgSys());
		}
		/******************** Slot_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotSrvCtgryCdgUsrSltd() != null) {
			slotservicecategorycoding.setUserSelected(Boolean.parseBoolean(s.getSlotSrvCtgryCdgUsrSltd()));
		}
		/******************** Slot_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotSrvCtgryCdgVrsn() != null) {
			slotservicecategorycoding.setVersion(s.getSlotSrvCtgryCdgVrsn());
		}
		/******************** Slot_SrvCtgry_Txt ********************************************************************************/
		if(s.getSlotSrvCtgryTxt() != null) {
			slotservicecategory.setText(s.getSlotSrvCtgryTxt());
		}
		/******************** slotservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotservicetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		slot.addServiceType(slotservicetype);

		/******************** slotservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotservicetypecoding =  new org.hl7.fhir.r4.model.Coding();
		slotservicetype.addCoding(slotservicetypecoding);

		/******************** Slot_SrvTyp_Cdg_Cd ********************************************************************************/
		if(s.getSlotSrvTypCdgCd() != null) {
			slotservicetypecoding.setCode(s.getSlotSrvTypCdgCd());
		}
		/******************** Slot_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSlotSrvTypCdgDsply() != null) {
			slotservicetypecoding.setDisplay(s.getSlotSrvTypCdgDsply());
		}
		/******************** Slot_SrvTyp_Cdg_Sys ********************************************************************************/
		if(s.getSlotSrvTypCdgSys() != null) {
			slotservicetypecoding.setSystem(s.getSlotSrvTypCdgSys());
		}
		/******************** Slot_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotSrvTypCdgUsrSltd() != null) {
			slotservicetypecoding.setUserSelected(Boolean.parseBoolean(s.getSlotSrvTypCdgUsrSltd()));
		}
		/******************** Slot_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotSrvTypCdgVrsn() != null) {
			slotservicetypecoding.setVersion(s.getSlotSrvTypCdgVrsn());
		}
		/******************** Slot_SrvTyp_Txt ********************************************************************************/
		if(s.getSlotSrvTypTxt() != null) {
			slotservicetype.setText(s.getSlotSrvTypTxt());
		}
		/******************** slotspecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotspecialty =  new org.hl7.fhir.r4.model.CodeableConcept();
		slot.addSpecialty(slotspecialty);

		/******************** slotspecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotspecialtycoding =  new org.hl7.fhir.r4.model.Coding();
		slotspecialty.addCoding(slotspecialtycoding);

		/******************** Slot_Spclty_Cdg_Cd ********************************************************************************/
		if(s.getSlotSpcltyCdgCd() != null) {
			slotspecialtycoding.setCode(s.getSlotSpcltyCdgCd());
		}
		/******************** Slot_Spclty_Cdg_Dsply ********************************************************************************/
		if(s.getSlotSpcltyCdgDsply() != null) {
			slotspecialtycoding.setDisplay(s.getSlotSpcltyCdgDsply());
		}
		/******************** Slot_Spclty_Cdg_Sys ********************************************************************************/
		if(s.getSlotSpcltyCdgSys() != null) {
			slotspecialtycoding.setSystem(s.getSlotSpcltyCdgSys());
		}
		/******************** Slot_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(s.getSlotSpcltyCdgUsrSltd() != null) {
			slotspecialtycoding.setUserSelected(Boolean.parseBoolean(s.getSlotSpcltyCdgUsrSltd()));
		}
		/******************** Slot_Spclty_Cdg_Vrsn ********************************************************************************/
		if(s.getSlotSpcltyCdgVrsn() != null) {
			slotspecialtycoding.setVersion(s.getSlotSpcltyCdgVrsn());
		}
		/******************** Slot_Spclty_Txt ********************************************************************************/
		if(s.getSlotSpcltyTxt() != null) {
			slotspecialty.setText(s.getSlotSpcltyTxt());
		}
		/******************** Slot_Strt ********************************************************************************/
		if(s.getSlotStrt() != null) {
			java.text.SimpleDateFormat Slot_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Slot_Strtdate = Slot_Strtsdf.parse(s.getSlotStrt());
			slot.setStart(Slot_Strtdate);
		}
		/******************** slotstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Slot.SlotStatusEnumFactory slotstatus =  new org.hl7.fhir.r4.model.Slot.SlotStatusEnumFactory();
		slot.setStatus(slotstatus.fromCode(s.getSlotSts()));

		return slot;
	}
}
