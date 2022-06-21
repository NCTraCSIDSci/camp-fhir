package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Appointment;
public class AppointmentBidirectionalConversion 
{
	public Appointment Appointments(org.hl7.fhir.r4.model.Appointment appointment) throws ParseException
	{
		 main.java.com.campfhir.model.Appointment a = new  main.java.com.campfhir.model.Appointment();

		/******************** id ********************************************************************************/
		appointment.setId(a.getId());

		/******************** Appmnt_Priority ********************************************************************************/
		if(appointment.hasPriority()) {
			a.setAppmntPriority(String.valueOf(appointment.getPriority()));
		}
		/******************** Appmnt_Comment ********************************************************************************/
		if(appointment.hasComment()) {
			a.setAppmntComment(String.valueOf(appointment.getComment()));
		}
		/******************** Appmnt_SprtingInfo ********************************************************************************/
		if(appointment.hasSupportingInformation()) {
			a.setAppmntSprtingInfo(String.valueOf(appointment.getSupportingInformationFirstRep()));
		}
		/******************** appointmentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.AppointmentStatus appointmentstatus = appointment.getStatus();
		a.setAppmntSts(appointmentstatus.toCode());

		/******************** Appmnt_BasedOn ********************************************************************************/
		if(appointment.hasBasedOn()) {
			a.setAppmntBasedOn(String.valueOf(appointment.getBasedOnFirstRep()));
		}
		/******************** Appmnt_Dscrptn ********************************************************************************/
		if(appointment.hasDescription()) {
			a.setAppmntDscrptn(String.valueOf(appointment.getDescription()));
		}
		/******************** Appmnt_Created ********************************************************************************/
		if(appointment.hasCreated()) {
			a.setAppmntCreated(String.valueOf(appointment.getCreated()));
		}
		/******************** Appmnt_PntInstrctn ********************************************************************************/
		if(appointment.hasPatientInstruction()) {
			a.setAppmntPntInstrctn(String.valueOf(appointment.getPatientInstruction()));
		}
		/******************** appointmentcancelationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentcancelationreason = appointment.getCancelationReason();

		/******************** appointmentcancelationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentcancelationreasoncoding = appointmentcancelationreason.getCodingFirstRep();

		/******************** Appmnt_CancelationRsn_Cdg_Dsply ********************************************************************************/
		if(appointmentcancelationreasoncoding.hasDisplay()) {
			a.setAppmntCancelationRsnCdgDsply(String.valueOf(appointmentcancelationreasoncoding.getDisplay()));
		}
		/******************** Appmnt_CancelationRsn_Cdg_Vrsn ********************************************************************************/
		if(appointmentcancelationreasoncoding.hasVersion()) {
			a.setAppmntCancelationRsnCdgVrsn(String.valueOf(appointmentcancelationreasoncoding.getVersion()));
		}
		/******************** Appmnt_CancelationRsn_Cdg_Cd ********************************************************************************/
		if(appointmentcancelationreasoncoding.hasCode()) {
			a.setAppmntCancelationRsnCdgCd(String.valueOf(appointmentcancelationreasoncoding.getCode()));
		}
		/******************** Appmnt_CancelationRsn_Cdg_Sys ********************************************************************************/
		if(appointmentcancelationreasoncoding.hasSystem()) {
			a.setAppmntCancelationRsnCdgSys(String.valueOf(appointmentcancelationreasoncoding.getSystem()));
		}
		/******************** Appmnt_CancelationRsn_Cdg_UsrSltd ********************************************************************************/
		if(appointmentcancelationreasoncoding.hasUserSelected()) {
			a.setAppmntCancelationRsnCdgUsrSltd(String.valueOf(appointmentcancelationreasoncoding.getUserSelected()));
		}
		/******************** Appmnt_CancelationRsn_Txt ********************************************************************************/
		if(appointmentcancelationreason.hasText()) {
			a.setAppmntCancelationRsnTxt(String.valueOf(appointmentcancelationreason.getText()));
		}
		/******************** appointmentrequestedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentrequestedperiod = appointment.getRequestedPeriodFirstRep();

		/******************** Appmnt_RqstedPrd_End ********************************************************************************/
		if(appointmentrequestedperiod.hasEnd()) {
			a.setAppmntRqstedPrdEnd(String.valueOf(appointmentrequestedperiod.getEnd()));
		}
		/******************** Appmnt_RqstedPrd_Strt ********************************************************************************/
		if(appointmentrequestedperiod.hasStart()) {
			a.setAppmntRqstedPrdStrt(String.valueOf(appointmentrequestedperiod.getStart()));
		}
		/******************** Appmnt_RsnRfrnc ********************************************************************************/
		if(appointment.hasReasonReference()) {
			a.setAppmntRsnRfrnc(String.valueOf(appointment.getReasonReferenceFirstRep()));
		}
		/******************** appointmentreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentreasoncode = appointment.getReasonCodeFirstRep();

		/******************** appointmentreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentreasoncodecoding = appointmentreasoncode.getCodingFirstRep();

		/******************** Appmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(appointmentreasoncodecoding.hasDisplay()) {
			a.setAppmntRsnCdCdgDsply(String.valueOf(appointmentreasoncodecoding.getDisplay()));
		}
		/******************** Appmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(appointmentreasoncodecoding.hasVersion()) {
			a.setAppmntRsnCdCdgVrsn(String.valueOf(appointmentreasoncodecoding.getVersion()));
		}
		/******************** Appmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(appointmentreasoncodecoding.hasCode()) {
			a.setAppmntRsnCdCdgCd(String.valueOf(appointmentreasoncodecoding.getCode()));
		}
		/******************** Appmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(appointmentreasoncodecoding.hasSystem()) {
			a.setAppmntRsnCdCdgSys(String.valueOf(appointmentreasoncodecoding.getSystem()));
		}
		/******************** Appmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(appointmentreasoncodecoding.hasUserSelected()) {
			a.setAppmntRsnCdCdgUsrSltd(String.valueOf(appointmentreasoncodecoding.getUserSelected()));
		}
		/******************** Appmnt_RsnCd_Txt ********************************************************************************/
		if(appointmentreasoncode.hasText()) {
			a.setAppmntRsnCdTxt(String.valueOf(appointmentreasoncode.getText()));
		}
		/******************** appointmentparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.AppointmentParticipantComponent appointmentparticipant = appointment.getParticipantFirstRep();

		/******************** appointmentparticipantstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.ParticipationStatus appointmentparticipantstatus = appointmentparticipant.getStatus();
		a.setAppmntPrtcpntSts(appointmentparticipantstatus.toCode());

		/******************** appointmentparticipantperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentparticipantperiod = appointmentparticipant.getPeriod();

		/******************** Appmnt_Prtcpnt_Prd_End ********************************************************************************/
		if(appointmentparticipantperiod.hasEnd()) {
			a.setAppmntPrtcpntPrdEnd(String.valueOf(appointmentparticipantperiod.getEnd()));
		}
		/******************** Appmnt_Prtcpnt_Prd_Strt ********************************************************************************/
		if(appointmentparticipantperiod.hasStart()) {
			a.setAppmntPrtcpntPrdStrt(String.valueOf(appointmentparticipantperiod.getStart()));
		}
		/******************** appointmentparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentparticipanttype = appointmentparticipant.getTypeFirstRep();

		/******************** appointmentparticipanttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentparticipanttypecoding = appointmentparticipanttype.getCodingFirstRep();

		/******************** Appmnt_Prtcpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(appointmentparticipanttypecoding.hasDisplay()) {
			a.setAppmntPrtcpntTypCdgDsply(String.valueOf(appointmentparticipanttypecoding.getDisplay()));
		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(appointmentparticipanttypecoding.hasVersion()) {
			a.setAppmntPrtcpntTypCdgVrsn(String.valueOf(appointmentparticipanttypecoding.getVersion()));
		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Cd ********************************************************************************/
		if(appointmentparticipanttypecoding.hasCode()) {
			a.setAppmntPrtcpntTypCdgCd(String.valueOf(appointmentparticipanttypecoding.getCode()));
		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Sys ********************************************************************************/
		if(appointmentparticipanttypecoding.hasSystem()) {
			a.setAppmntPrtcpntTypCdgSys(String.valueOf(appointmentparticipanttypecoding.getSystem()));
		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(appointmentparticipanttypecoding.hasUserSelected()) {
			a.setAppmntPrtcpntTypCdgUsrSltd(String.valueOf(appointmentparticipanttypecoding.getUserSelected()));
		}
		/******************** Appmnt_Prtcpnt_Typ_Txt ********************************************************************************/
		if(appointmentparticipanttype.hasText()) {
			a.setAppmntPrtcpntTypTxt(String.valueOf(appointmentparticipanttype.getText()));
		}
		/******************** Appmnt_Prtcpnt_Actor ********************************************************************************/
		if(appointmentparticipant.hasActor()) {
			a.setAppmntPrtcpntActor(String.valueOf(appointmentparticipant.getActor()));
		}
		/******************** appointmentparticipantrequired ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.ParticipantRequired appointmentparticipantrequired = appointmentparticipant.getRequired();
		a.setAppmntPrtcpntRequired(appointmentparticipantrequired.toCode());

		/******************** Appmnt_Slot ********************************************************************************/
		if(appointment.hasSlot()) {
			a.setAppmntSlot(String.valueOf(appointment.getSlotFirstRep()));
		}
		/******************** Appmnt_MinutesDuration ********************************************************************************/
		if(appointment.hasMinutesDuration()) {
			a.setAppmntMinutesDuration(String.valueOf(appointment.getMinutesDuration()));
		}
		/******************** appointmentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier appointmentidentifier = appointment.getIdentifierFirstRep();

		/******************** Appmnt_Id_Vl ********************************************************************************/
		if(appointmentidentifier.hasValue()) {
			a.setAppmntIdVl(String.valueOf(appointmentidentifier.getValue()));
		}
		/******************** appointmentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentidentifiertype = appointmentidentifier.getType();

		/******************** appointmentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentidentifiertypecoding = appointmentidentifiertype.getCodingFirstRep();

		/******************** Appmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(appointmentidentifiertypecoding.hasDisplay()) {
			a.setAppmntIdTypCdgDsply(String.valueOf(appointmentidentifiertypecoding.getDisplay()));
		}
		/******************** Appmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(appointmentidentifiertypecoding.hasVersion()) {
			a.setAppmntIdTypCdgVrsn(String.valueOf(appointmentidentifiertypecoding.getVersion()));
		}
		/******************** Appmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(appointmentidentifiertypecoding.hasCode()) {
			a.setAppmntIdTypCdgCd(String.valueOf(appointmentidentifiertypecoding.getCode()));
		}
		/******************** Appmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(appointmentidentifiertypecoding.hasSystem()) {
			a.setAppmntIdTypCdgSys(String.valueOf(appointmentidentifiertypecoding.getSystem()));
		}
		/******************** Appmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(appointmentidentifiertypecoding.hasUserSelected()) {
			a.setAppmntIdTypCdgUsrSltd(String.valueOf(appointmentidentifiertypecoding.getUserSelected()));
		}
		/******************** Appmnt_Id_Typ_Txt ********************************************************************************/
		if(appointmentidentifiertype.hasText()) {
			a.setAppmntIdTypTxt(String.valueOf(appointmentidentifiertype.getText()));
		}
		/******************** Appmnt_Id_Sys ********************************************************************************/
		if(appointmentidentifier.hasSystem()) {
			a.setAppmntIdSys(String.valueOf(appointmentidentifier.getSystem()));
		}
		/******************** Appmnt_Id_Assigner ********************************************************************************/
		if(appointmentidentifier.hasAssigner()) {
			a.setAppmntIdAssigner(String.valueOf(appointmentidentifier.getAssigner()));
		}
		/******************** appointmentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentidentifierperiod = appointmentidentifier.getPeriod();

		/******************** Appmnt_Id_Prd_End ********************************************************************************/
		if(appointmentidentifierperiod.hasEnd()) {
			a.setAppmntIdPrdEnd(String.valueOf(appointmentidentifierperiod.getEnd()));
		}
		/******************** Appmnt_Id_Prd_Strt ********************************************************************************/
		if(appointmentidentifierperiod.hasStart()) {
			a.setAppmntIdPrdStrt(String.valueOf(appointmentidentifierperiod.getStart()));
		}
		/******************** appointmentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse appointmentidentifieruse = appointmentidentifier.getUse();
		a.setAppmntIdUse(appointmentidentifieruse.toCode());

		/******************** appointmentappointmenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentappointmenttype = appointment.getAppointmentType();

		/******************** appointmentappointmenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentappointmenttypecoding = appointmentappointmenttype.getCodingFirstRep();

		/******************** Appmnt_AppmntTyp_Cdg_Dsply ********************************************************************************/
		if(appointmentappointmenttypecoding.hasDisplay()) {
			a.setAppmntAppmntTypCdgDsply(String.valueOf(appointmentappointmenttypecoding.getDisplay()));
		}
		/******************** Appmnt_AppmntTyp_Cdg_Vrsn ********************************************************************************/
		if(appointmentappointmenttypecoding.hasVersion()) {
			a.setAppmntAppmntTypCdgVrsn(String.valueOf(appointmentappointmenttypecoding.getVersion()));
		}
		/******************** Appmnt_AppmntTyp_Cdg_Cd ********************************************************************************/
		if(appointmentappointmenttypecoding.hasCode()) {
			a.setAppmntAppmntTypCdgCd(String.valueOf(appointmentappointmenttypecoding.getCode()));
		}
		/******************** Appmnt_AppmntTyp_Cdg_Sys ********************************************************************************/
		if(appointmentappointmenttypecoding.hasSystem()) {
			a.setAppmntAppmntTypCdgSys(String.valueOf(appointmentappointmenttypecoding.getSystem()));
		}
		/******************** Appmnt_AppmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(appointmentappointmenttypecoding.hasUserSelected()) {
			a.setAppmntAppmntTypCdgUsrSltd(String.valueOf(appointmentappointmenttypecoding.getUserSelected()));
		}
		/******************** Appmnt_AppmntTyp_Txt ********************************************************************************/
		if(appointmentappointmenttype.hasText()) {
			a.setAppmntAppmntTypTxt(String.valueOf(appointmentappointmenttype.getText()));
		}
		/******************** Appmnt_End ********************************************************************************/
		if(appointment.hasEnd()) {
			a.setAppmntEnd(String.valueOf(appointment.getEnd()));
		}
		/******************** Appmnt_Strt ********************************************************************************/
		if(appointment.hasStart()) {
			a.setAppmntStrt(String.valueOf(appointment.getStart()));
		}
		/******************** appointmentspecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentspecialty = appointment.getSpecialtyFirstRep();

		/******************** appointmentspecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentspecialtycoding = appointmentspecialty.getCodingFirstRep();

		/******************** Appmnt_Spclty_Cdg_Dsply ********************************************************************************/
		if(appointmentspecialtycoding.hasDisplay()) {
			a.setAppmntSpcltyCdgDsply(String.valueOf(appointmentspecialtycoding.getDisplay()));
		}
		/******************** Appmnt_Spclty_Cdg_Vrsn ********************************************************************************/
		if(appointmentspecialtycoding.hasVersion()) {
			a.setAppmntSpcltyCdgVrsn(String.valueOf(appointmentspecialtycoding.getVersion()));
		}
		/******************** Appmnt_Spclty_Cdg_Cd ********************************************************************************/
		if(appointmentspecialtycoding.hasCode()) {
			a.setAppmntSpcltyCdgCd(String.valueOf(appointmentspecialtycoding.getCode()));
		}
		/******************** Appmnt_Spclty_Cdg_Sys ********************************************************************************/
		if(appointmentspecialtycoding.hasSystem()) {
			a.setAppmntSpcltyCdgSys(String.valueOf(appointmentspecialtycoding.getSystem()));
		}
		/******************** Appmnt_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(appointmentspecialtycoding.hasUserSelected()) {
			a.setAppmntSpcltyCdgUsrSltd(String.valueOf(appointmentspecialtycoding.getUserSelected()));
		}
		/******************** Appmnt_Spclty_Txt ********************************************************************************/
		if(appointmentspecialty.hasText()) {
			a.setAppmntSpcltyTxt(String.valueOf(appointmentspecialty.getText()));
		}
		/******************** appointmentservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentservicetype = appointment.getServiceTypeFirstRep();

		/******************** appointmentservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentservicetypecoding = appointmentservicetype.getCodingFirstRep();

		/******************** Appmnt_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(appointmentservicetypecoding.hasDisplay()) {
			a.setAppmntSrvTypCdgDsply(String.valueOf(appointmentservicetypecoding.getDisplay()));
		}
		/******************** Appmnt_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(appointmentservicetypecoding.hasVersion()) {
			a.setAppmntSrvTypCdgVrsn(String.valueOf(appointmentservicetypecoding.getVersion()));
		}
		/******************** Appmnt_SrvTyp_Cdg_Cd ********************************************************************************/
		if(appointmentservicetypecoding.hasCode()) {
			a.setAppmntSrvTypCdgCd(String.valueOf(appointmentservicetypecoding.getCode()));
		}
		/******************** Appmnt_SrvTyp_Cdg_Sys ********************************************************************************/
		if(appointmentservicetypecoding.hasSystem()) {
			a.setAppmntSrvTypCdgSys(String.valueOf(appointmentservicetypecoding.getSystem()));
		}
		/******************** Appmnt_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(appointmentservicetypecoding.hasUserSelected()) {
			a.setAppmntSrvTypCdgUsrSltd(String.valueOf(appointmentservicetypecoding.getUserSelected()));
		}
		/******************** Appmnt_SrvTyp_Txt ********************************************************************************/
		if(appointmentservicetype.hasText()) {
			a.setAppmntSrvTypTxt(String.valueOf(appointmentservicetype.getText()));
		}
		/******************** appointmentservicecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentservicecategory = appointment.getServiceCategoryFirstRep();

		/******************** appointmentservicecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentservicecategorycoding = appointmentservicecategory.getCodingFirstRep();

		/******************** Appmnt_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(appointmentservicecategorycoding.hasDisplay()) {
			a.setAppmntSrvCtgryCdgDsply(String.valueOf(appointmentservicecategorycoding.getDisplay()));
		}
		/******************** Appmnt_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(appointmentservicecategorycoding.hasVersion()) {
			a.setAppmntSrvCtgryCdgVrsn(String.valueOf(appointmentservicecategorycoding.getVersion()));
		}
		/******************** Appmnt_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(appointmentservicecategorycoding.hasCode()) {
			a.setAppmntSrvCtgryCdgCd(String.valueOf(appointmentservicecategorycoding.getCode()));
		}
		/******************** Appmnt_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(appointmentservicecategorycoding.hasSystem()) {
			a.setAppmntSrvCtgryCdgSys(String.valueOf(appointmentservicecategorycoding.getSystem()));
		}
		/******************** Appmnt_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(appointmentservicecategorycoding.hasUserSelected()) {
			a.setAppmntSrvCtgryCdgUsrSltd(String.valueOf(appointmentservicecategorycoding.getUserSelected()));
		}
		/******************** Appmnt_SrvCtgry_Txt ********************************************************************************/
		if(appointmentservicecategory.hasText()) {
			a.setAppmntSrvCtgryTxt(String.valueOf(appointmentservicecategory.getText()));
		}
		return a;
	}
}
