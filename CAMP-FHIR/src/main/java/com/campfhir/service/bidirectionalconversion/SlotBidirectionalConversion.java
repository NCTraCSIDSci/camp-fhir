package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Slot;
public class SlotBidirectionalConversion 
{
	public Slot Slots(org.hl7.fhir.r4.model.Slot slot) throws ParseException
	{
		 main.java.com.campfhir.model.Slot s = new  main.java.com.campfhir.model.Slot();

		/******************** id ********************************************************************************/
		slot.setId(s.getId());

		/******************** Slot_Comment ********************************************************************************/
		if(slot.hasComment()) {
			s.setSlotComment(String.valueOf(slot.getComment()));
		}
		/******************** slotstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Slot.SlotStatus slotstatus = slot.getStatus();
		s.setSlotSts(slotstatus.toCode());

		/******************** slotidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier slotidentifier = slot.getIdentifierFirstRep();

		/******************** Slot_Id_Vl ********************************************************************************/
		if(slotidentifier.hasValue()) {
			s.setSlotIdVl(String.valueOf(slotidentifier.getValue()));
		}
		/******************** slotidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotidentifiertype = slotidentifier.getType();

		/******************** slotidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotidentifiertypecoding = slotidentifiertype.getCodingFirstRep();

		/******************** Slot_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(slotidentifiertypecoding.hasDisplay()) {
			s.setSlotIdTypCdgDsply(String.valueOf(slotidentifiertypecoding.getDisplay()));
		}
		/******************** Slot_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(slotidentifiertypecoding.hasVersion()) {
			s.setSlotIdTypCdgVrsn(String.valueOf(slotidentifiertypecoding.getVersion()));
		}
		/******************** Slot_Id_Typ_Cdg_Cd ********************************************************************************/
		if(slotidentifiertypecoding.hasCode()) {
			s.setSlotIdTypCdgCd(String.valueOf(slotidentifiertypecoding.getCode()));
		}
		/******************** Slot_Id_Typ_Cdg_Sys ********************************************************************************/
		if(slotidentifiertypecoding.hasSystem()) {
			s.setSlotIdTypCdgSys(String.valueOf(slotidentifiertypecoding.getSystem()));
		}
		/******************** Slot_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(slotidentifiertypecoding.hasUserSelected()) {
			s.setSlotIdTypCdgUsrSltd(String.valueOf(slotidentifiertypecoding.getUserSelected()));
		}
		/******************** Slot_Id_Typ_Txt ********************************************************************************/
		if(slotidentifiertype.hasText()) {
			s.setSlotIdTypTxt(String.valueOf(slotidentifiertype.getText()));
		}
		/******************** Slot_Id_Sys ********************************************************************************/
		if(slotidentifier.hasSystem()) {
			s.setSlotIdSys(String.valueOf(slotidentifier.getSystem()));
		}
		/******************** Slot_Id_Assigner ********************************************************************************/
		if(slotidentifier.hasAssigner()) {
			s.setSlotIdAssigner(String.valueOf(slotidentifier.getAssigner()));
		}
		/******************** slotidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period slotidentifierperiod = slotidentifier.getPeriod();

		/******************** Slot_Id_Prd_End ********************************************************************************/
		if(slotidentifierperiod.hasEnd()) {
			s.setSlotIdPrdEnd(String.valueOf(slotidentifierperiod.getEnd()));
		}
		/******************** Slot_Id_Prd_Strt ********************************************************************************/
		if(slotidentifierperiod.hasStart()) {
			s.setSlotIdPrdStrt(String.valueOf(slotidentifierperiod.getStart()));
		}
		/******************** slotidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse slotidentifieruse = slotidentifier.getUse();
		s.setSlotIdUse(slotidentifieruse.toCode());

		/******************** slotappointmenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotappointmenttype = slot.getAppointmentType();

		/******************** slotappointmenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotappointmenttypecoding = slotappointmenttype.getCodingFirstRep();

		/******************** Slot_AppmntTyp_Cdg_Dsply ********************************************************************************/
		if(slotappointmenttypecoding.hasDisplay()) {
			s.setSlotAppmntTypCdgDsply(String.valueOf(slotappointmenttypecoding.getDisplay()));
		}
		/******************** Slot_AppmntTyp_Cdg_Vrsn ********************************************************************************/
		if(slotappointmenttypecoding.hasVersion()) {
			s.setSlotAppmntTypCdgVrsn(String.valueOf(slotappointmenttypecoding.getVersion()));
		}
		/******************** Slot_AppmntTyp_Cdg_Cd ********************************************************************************/
		if(slotappointmenttypecoding.hasCode()) {
			s.setSlotAppmntTypCdgCd(String.valueOf(slotappointmenttypecoding.getCode()));
		}
		/******************** Slot_AppmntTyp_Cdg_Sys ********************************************************************************/
		if(slotappointmenttypecoding.hasSystem()) {
			s.setSlotAppmntTypCdgSys(String.valueOf(slotappointmenttypecoding.getSystem()));
		}
		/******************** Slot_AppmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(slotappointmenttypecoding.hasUserSelected()) {
			s.setSlotAppmntTypCdgUsrSltd(String.valueOf(slotappointmenttypecoding.getUserSelected()));
		}
		/******************** Slot_AppmntTyp_Txt ********************************************************************************/
		if(slotappointmenttype.hasText()) {
			s.setSlotAppmntTypTxt(String.valueOf(slotappointmenttype.getText()));
		}
		/******************** Slot_Schdl ********************************************************************************/
		if(slot.hasSchedule()) {
			s.setSlotSchdl(String.valueOf(slot.getSchedule()));
		}
		/******************** Slot_End ********************************************************************************/
		if(slot.hasEnd()) {
			s.setSlotEnd(String.valueOf(slot.getEnd()));
		}
		/******************** Slot_Overbooked ********************************************************************************/
		if(slot.hasOverbooked()) {
			s.setSlotOverbooked(String.valueOf(slot.getOverbooked()));
		}
		/******************** Slot_Strt ********************************************************************************/
		if(slot.hasStart()) {
			s.setSlotStrt(String.valueOf(slot.getStart()));
		}
		/******************** slotspecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotspecialty = slot.getSpecialtyFirstRep();

		/******************** slotspecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotspecialtycoding = slotspecialty.getCodingFirstRep();

		/******************** Slot_Spclty_Cdg_Dsply ********************************************************************************/
		if(slotspecialtycoding.hasDisplay()) {
			s.setSlotSpcltyCdgDsply(String.valueOf(slotspecialtycoding.getDisplay()));
		}
		/******************** Slot_Spclty_Cdg_Vrsn ********************************************************************************/
		if(slotspecialtycoding.hasVersion()) {
			s.setSlotSpcltyCdgVrsn(String.valueOf(slotspecialtycoding.getVersion()));
		}
		/******************** Slot_Spclty_Cdg_Cd ********************************************************************************/
		if(slotspecialtycoding.hasCode()) {
			s.setSlotSpcltyCdgCd(String.valueOf(slotspecialtycoding.getCode()));
		}
		/******************** Slot_Spclty_Cdg_Sys ********************************************************************************/
		if(slotspecialtycoding.hasSystem()) {
			s.setSlotSpcltyCdgSys(String.valueOf(slotspecialtycoding.getSystem()));
		}
		/******************** Slot_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(slotspecialtycoding.hasUserSelected()) {
			s.setSlotSpcltyCdgUsrSltd(String.valueOf(slotspecialtycoding.getUserSelected()));
		}
		/******************** Slot_Spclty_Txt ********************************************************************************/
		if(slotspecialty.hasText()) {
			s.setSlotSpcltyTxt(String.valueOf(slotspecialty.getText()));
		}
		/******************** slotservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotservicetype = slot.getServiceTypeFirstRep();

		/******************** slotservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotservicetypecoding = slotservicetype.getCodingFirstRep();

		/******************** Slot_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(slotservicetypecoding.hasDisplay()) {
			s.setSlotSrvTypCdgDsply(String.valueOf(slotservicetypecoding.getDisplay()));
		}
		/******************** Slot_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(slotservicetypecoding.hasVersion()) {
			s.setSlotSrvTypCdgVrsn(String.valueOf(slotservicetypecoding.getVersion()));
		}
		/******************** Slot_SrvTyp_Cdg_Cd ********************************************************************************/
		if(slotservicetypecoding.hasCode()) {
			s.setSlotSrvTypCdgCd(String.valueOf(slotservicetypecoding.getCode()));
		}
		/******************** Slot_SrvTyp_Cdg_Sys ********************************************************************************/
		if(slotservicetypecoding.hasSystem()) {
			s.setSlotSrvTypCdgSys(String.valueOf(slotservicetypecoding.getSystem()));
		}
		/******************** Slot_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(slotservicetypecoding.hasUserSelected()) {
			s.setSlotSrvTypCdgUsrSltd(String.valueOf(slotservicetypecoding.getUserSelected()));
		}
		/******************** Slot_SrvTyp_Txt ********************************************************************************/
		if(slotservicetype.hasText()) {
			s.setSlotSrvTypTxt(String.valueOf(slotservicetype.getText()));
		}
		/******************** slotservicecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept slotservicecategory = slot.getServiceCategoryFirstRep();

		/******************** slotservicecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding slotservicecategorycoding = slotservicecategory.getCodingFirstRep();

		/******************** Slot_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(slotservicecategorycoding.hasDisplay()) {
			s.setSlotSrvCtgryCdgDsply(String.valueOf(slotservicecategorycoding.getDisplay()));
		}
		/******************** Slot_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(slotservicecategorycoding.hasVersion()) {
			s.setSlotSrvCtgryCdgVrsn(String.valueOf(slotservicecategorycoding.getVersion()));
		}
		/******************** Slot_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(slotservicecategorycoding.hasCode()) {
			s.setSlotSrvCtgryCdgCd(String.valueOf(slotservicecategorycoding.getCode()));
		}
		/******************** Slot_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(slotservicecategorycoding.hasSystem()) {
			s.setSlotSrvCtgryCdgSys(String.valueOf(slotservicecategorycoding.getSystem()));
		}
		/******************** Slot_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(slotservicecategorycoding.hasUserSelected()) {
			s.setSlotSrvCtgryCdgUsrSltd(String.valueOf(slotservicecategorycoding.getUserSelected()));
		}
		/******************** Slot_SrvCtgry_Txt ********************************************************************************/
		if(slotservicecategory.hasText()) {
			s.setSlotSrvCtgryTxt(String.valueOf(slotservicecategory.getText()));
		}
		return s;
	}
}
