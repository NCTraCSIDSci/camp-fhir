package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Appointment;
public class AppointmentConversion 
{
	public org.hl7.fhir.r4.model.Appointment Appointments(Appointment a) throws ParseException
	{
		org.hl7.fhir.r4.model.Appointment appointment = new org.hl7.fhir.r4.model.Appointment();

		/******************** id ********************************************************************************/
		appointment.setId(a.getId());

		/******************** appointmentappointmenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentappointmenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointment.setAppointmentType(appointmentappointmenttype);

		/******************** appointmentappointmenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentappointmenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentappointmenttype.addCoding(appointmentappointmenttypecoding);

		/******************** Appmnt_AppmntTyp_Cdg_Cd ********************************************************************************/
		if(a.getAppmntAppmntTypCdgCd() != null) {
			appointmentappointmenttypecoding.setCode(a.getAppmntAppmntTypCdgCd());
		}
		/******************** Appmnt_AppmntTyp_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntAppmntTypCdgDsply() != null) {
			appointmentappointmenttypecoding.setDisplay(a.getAppmntAppmntTypCdgDsply());
		}
		/******************** Appmnt_AppmntTyp_Cdg_Sys ********************************************************************************/
		if(a.getAppmntAppmntTypCdgSys() != null) {
			appointmentappointmenttypecoding.setSystem(a.getAppmntAppmntTypCdgSys());
		}
		/******************** Appmnt_AppmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntAppmntTypCdgUsrSltd() != null) {
			appointmentappointmenttypecoding.setUserSelected(Boolean.parseBoolean(a.getAppmntAppmntTypCdgUsrSltd()));
		}
		/******************** Appmnt_AppmntTyp_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntAppmntTypCdgVrsn() != null) {
			appointmentappointmenttypecoding.setVersion(a.getAppmntAppmntTypCdgVrsn());
		}
		/******************** Appmnt_AppmntTyp_Txt ********************************************************************************/
		if(a.getAppmntAppmntTypTxt() != null) {
			appointmentappointmenttype.setText(a.getAppmntAppmntTypTxt());
		}
		/******************** Appmnt_BasedOn ********************************************************************************/
		if(a.getAppmntBasedOn() != null) {
			appointment.addBasedOn( new org.hl7.fhir.r4.model.Reference(a.getAppmntBasedOn()));
		}
		/******************** appointmentcancelationreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentcancelationreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointment.setCancelationReason(appointmentcancelationreason);

		/******************** appointmentcancelationreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentcancelationreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentcancelationreason.addCoding(appointmentcancelationreasoncoding);

		/******************** Appmnt_CancelationRsn_Cdg_Cd ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgCd() != null) {
			appointmentcancelationreasoncoding.setCode(a.getAppmntCancelationRsnCdgCd());
		}
		/******************** Appmnt_CancelationRsn_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgDsply() != null) {
			appointmentcancelationreasoncoding.setDisplay(a.getAppmntCancelationRsnCdgDsply());
		}
		/******************** Appmnt_CancelationRsn_Cdg_Sys ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgSys() != null) {
			appointmentcancelationreasoncoding.setSystem(a.getAppmntCancelationRsnCdgSys());
		}
		/******************** Appmnt_CancelationRsn_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgUsrSltd() != null) {
			appointmentcancelationreasoncoding.setUserSelected(Boolean.parseBoolean(a.getAppmntCancelationRsnCdgUsrSltd()));
		}
		/******************** Appmnt_CancelationRsn_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgVrsn() != null) {
			appointmentcancelationreasoncoding.setVersion(a.getAppmntCancelationRsnCdgVrsn());
		}
		/******************** Appmnt_CancelationRsn_Txt ********************************************************************************/
		if(a.getAppmntCancelationRsnTxt() != null) {
			appointmentcancelationreason.setText(a.getAppmntCancelationRsnTxt());
		}
		/******************** Appmnt_Comment ********************************************************************************/
		if(a.getAppmntComment() != null) {
			appointment.setComment(a.getAppmntComment());
		}
		/******************** Appmnt_Created ********************************************************************************/
		if(a.getAppmntCreated() != null) {
			java.text.SimpleDateFormat Appmnt_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Appmnt_Createddate = Appmnt_Createdsdf.parse(a.getAppmntCreated());
			appointment.setCreated(Appmnt_Createddate);
		}
		/******************** Appmnt_Dscrptn ********************************************************************************/
		if(a.getAppmntDscrptn() != null) {
			appointment.setDescription(a.getAppmntDscrptn());
		}
		/******************** Appmnt_End ********************************************************************************/
		if(a.getAppmntEnd() != null) {
			java.text.SimpleDateFormat Appmnt_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Appmnt_Enddate = Appmnt_Endsdf.parse(a.getAppmntEnd());
			appointment.setEnd(Appmnt_Enddate);
		}
		/******************** appointmentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier appointmentidentifier =  new org.hl7.fhir.r4.model.Identifier();
		appointment.addIdentifier(appointmentidentifier);

		/******************** Appmnt_Id_Assigner ********************************************************************************/
		if(a.getAppmntIdAssigner() != null) {
			appointmentidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(a.getAppmntIdAssigner()));
		}
		/******************** appointmentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		appointmentidentifier.setPeriod(appointmentidentifierperiod);

		/******************** Appmnt_Id_Prd_End ********************************************************************************/
		if(a.getAppmntIdPrdEnd() != null) {
			java.text.SimpleDateFormat Appmnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Appmnt_Id_Prd_Enddate = Appmnt_Id_Prd_Endsdf.parse(a.getAppmntIdPrdEnd());
			appointmentidentifierperiod.setEnd(Appmnt_Id_Prd_Enddate);
		}
		/******************** Appmnt_Id_Prd_Strt ********************************************************************************/
		if(a.getAppmntIdPrdStrt() != null) {
			java.text.SimpleDateFormat Appmnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Appmnt_Id_Prd_Strtdate = Appmnt_Id_Prd_Strtsdf.parse(a.getAppmntIdPrdStrt());
			appointmentidentifierperiod.setStart(Appmnt_Id_Prd_Strtdate);
		}
		/******************** Appmnt_Id_Sys ********************************************************************************/
		if(a.getAppmntIdSys() != null) {
			appointmentidentifier.setSystem(a.getAppmntIdSys());
		}
		/******************** appointmentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointmentidentifier.setType(appointmentidentifiertype);

		/******************** appointmentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentidentifiertype.addCoding(appointmentidentifiertypecoding);

		/******************** Appmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAppmntIdTypCdgCd() != null) {
			appointmentidentifiertypecoding.setCode(a.getAppmntIdTypCdgCd());
		}
		/******************** Appmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntIdTypCdgDsply() != null) {
			appointmentidentifiertypecoding.setDisplay(a.getAppmntIdTypCdgDsply());
		}
		/******************** Appmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAppmntIdTypCdgSys() != null) {
			appointmentidentifiertypecoding.setSystem(a.getAppmntIdTypCdgSys());
		}
		/******************** Appmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntIdTypCdgUsrSltd() != null) {
			appointmentidentifiertypecoding.setUserSelected(Boolean.parseBoolean(a.getAppmntIdTypCdgUsrSltd()));
		}
		/******************** Appmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntIdTypCdgVrsn() != null) {
			appointmentidentifiertypecoding.setVersion(a.getAppmntIdTypCdgVrsn());
		}
		/******************** Appmnt_Id_Typ_Txt ********************************************************************************/
		if(a.getAppmntIdTypTxt() != null) {
			appointmentidentifiertype.setText(a.getAppmntIdTypTxt());
		}
		/******************** appointmentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory appointmentidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		appointmentidentifier.setUse(appointmentidentifieruse.fromCode(a.getAppmntIdUse()));

		/******************** Appmnt_Id_Vl ********************************************************************************/
		if(a.getAppmntIdVl() != null) {
			appointmentidentifier.setValue(a.getAppmntIdVl());
		}
		/******************** Appmnt_MinutesDuration ********************************************************************************/
		if(a.getAppmntMinutesDuration() != null) {
			appointment.setMinutesDuration(Integer.parseInt(a.getAppmntMinutesDuration()));
		}
		/******************** appointmentparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.AppointmentParticipantComponent appointmentparticipant =  new org.hl7.fhir.r4.model.Appointment.AppointmentParticipantComponent();
		appointment.addParticipant(appointmentparticipant);

		/******************** Appmnt_Prtcpnt_Actor ********************************************************************************/
		if(a.getAppmntPrtcpntActor() != null) {
			appointmentparticipant.setActor( new org.hl7.fhir.r4.model.Reference(a.getAppmntPrtcpntActor()));
		}
		/******************** appointmentparticipantperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentparticipantperiod =  new org.hl7.fhir.r4.model.Period();
		appointmentparticipant.setPeriod(appointmentparticipantperiod);

		/******************** Appmnt_Prtcpnt_Prd_End ********************************************************************************/
		if(a.getAppmntPrtcpntPrdEnd() != null) {
			java.text.SimpleDateFormat Appmnt_Prtcpnt_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Appmnt_Prtcpnt_Prd_Enddate = Appmnt_Prtcpnt_Prd_Endsdf.parse(a.getAppmntPrtcpntPrdEnd());
			appointmentparticipantperiod.setEnd(Appmnt_Prtcpnt_Prd_Enddate);
		}
		/******************** Appmnt_Prtcpnt_Prd_Strt ********************************************************************************/
		if(a.getAppmntPrtcpntPrdStrt() != null) {
			java.text.SimpleDateFormat Appmnt_Prtcpnt_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Appmnt_Prtcpnt_Prd_Strtdate = Appmnt_Prtcpnt_Prd_Strtsdf.parse(a.getAppmntPrtcpntPrdStrt());
			appointmentparticipantperiod.setStart(Appmnt_Prtcpnt_Prd_Strtdate);
		}
		/******************** appointmentparticipantrequired ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.ParticipantRequiredEnumFactory appointmentparticipantrequired =  new org.hl7.fhir.r4.model.Appointment.ParticipantRequiredEnumFactory();
		appointmentparticipant.setRequired(appointmentparticipantrequired.fromCode(a.getAppmntPrtcpntRequired()));

		/******************** appointmentparticipantstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.ParticipationStatusEnumFactory appointmentparticipantstatus =  new org.hl7.fhir.r4.model.Appointment.ParticipationStatusEnumFactory();
		appointmentparticipant.setStatus(appointmentparticipantstatus.fromCode(a.getAppmntPrtcpntSts()));

		/******************** appointmentparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentparticipanttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointmentparticipant.addType(appointmentparticipanttype);

		/******************** appointmentparticipanttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentparticipanttypecoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentparticipanttype.addCoding(appointmentparticipanttypecoding);

		/******************** Appmnt_Prtcpnt_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgCd() != null) {
			appointmentparticipanttypecoding.setCode(a.getAppmntPrtcpntTypCdgCd());
		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgDsply() != null) {
			appointmentparticipanttypecoding.setDisplay(a.getAppmntPrtcpntTypCdgDsply());
		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgSys() != null) {
			appointmentparticipanttypecoding.setSystem(a.getAppmntPrtcpntTypCdgSys());
		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgUsrSltd() != null) {
			appointmentparticipanttypecoding.setUserSelected(Boolean.parseBoolean(a.getAppmntPrtcpntTypCdgUsrSltd()));
		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgVrsn() != null) {
			appointmentparticipanttypecoding.setVersion(a.getAppmntPrtcpntTypCdgVrsn());
		}
		/******************** Appmnt_Prtcpnt_Typ_Txt ********************************************************************************/
		if(a.getAppmntPrtcpntTypTxt() != null) {
			appointmentparticipanttype.setText(a.getAppmntPrtcpntTypTxt());
		}
		/******************** Appmnt_PntInstrctn ********************************************************************************/
		if(a.getAppmntPntInstrctn() != null) {
			appointment.setPatientInstruction(a.getAppmntPntInstrctn());
		}
		/******************** Appmnt_Priority ********************************************************************************/
		if(a.getAppmntPriority() != null) {
			appointment.setPriority(Integer.parseInt(a.getAppmntPriority()));
		}
		/******************** appointmentreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointment.addReasonCode(appointmentreasoncode);

		/******************** appointmentreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentreasoncode.addCoding(appointmentreasoncodecoding);

		/******************** Appmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(a.getAppmntRsnCdCdgCd() != null) {
			appointmentreasoncodecoding.setCode(a.getAppmntRsnCdCdgCd());
		}
		/******************** Appmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntRsnCdCdgDsply() != null) {
			appointmentreasoncodecoding.setDisplay(a.getAppmntRsnCdCdgDsply());
		}
		/******************** Appmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(a.getAppmntRsnCdCdgSys() != null) {
			appointmentreasoncodecoding.setSystem(a.getAppmntRsnCdCdgSys());
		}
		/******************** Appmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntRsnCdCdgUsrSltd() != null) {
			appointmentreasoncodecoding.setUserSelected(Boolean.parseBoolean(a.getAppmntRsnCdCdgUsrSltd()));
		}
		/******************** Appmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntRsnCdCdgVrsn() != null) {
			appointmentreasoncodecoding.setVersion(a.getAppmntRsnCdCdgVrsn());
		}
		/******************** Appmnt_RsnCd_Txt ********************************************************************************/
		if(a.getAppmntRsnCdTxt() != null) {
			appointmentreasoncode.setText(a.getAppmntRsnCdTxt());
		}
		/******************** Appmnt_RsnRfrnc ********************************************************************************/
		if(a.getAppmntRsnRfrnc() != null) {
			appointment.addReasonReference( new org.hl7.fhir.r4.model.Reference(a.getAppmntRsnRfrnc()));
		}
		/******************** appointmentrequestedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentrequestedperiod =  new org.hl7.fhir.r4.model.Period();
		appointment.addRequestedPeriod(appointmentrequestedperiod);

		/******************** Appmnt_RqstedPrd_End ********************************************************************************/
		if(a.getAppmntRqstedPrdEnd() != null) {
			java.text.SimpleDateFormat Appmnt_RqstedPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Appmnt_RqstedPrd_Enddate = Appmnt_RqstedPrd_Endsdf.parse(a.getAppmntRqstedPrdEnd());
			appointmentrequestedperiod.setEnd(Appmnt_RqstedPrd_Enddate);
		}
		/******************** Appmnt_RqstedPrd_Strt ********************************************************************************/
		if(a.getAppmntRqstedPrdStrt() != null) {
			java.text.SimpleDateFormat Appmnt_RqstedPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Appmnt_RqstedPrd_Strtdate = Appmnt_RqstedPrd_Strtsdf.parse(a.getAppmntRqstedPrdStrt());
			appointmentrequestedperiod.setStart(Appmnt_RqstedPrd_Strtdate);
		}
		/******************** appointmentservicecategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentservicecategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointment.addServiceCategory(appointmentservicecategory);

		/******************** appointmentservicecategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentservicecategorycoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentservicecategory.addCoding(appointmentservicecategorycoding);

		/******************** Appmnt_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgCd() != null) {
			appointmentservicecategorycoding.setCode(a.getAppmntSrvCtgryCdgCd());
		}
		/******************** Appmnt_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgDsply() != null) {
			appointmentservicecategorycoding.setDisplay(a.getAppmntSrvCtgryCdgDsply());
		}
		/******************** Appmnt_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgSys() != null) {
			appointmentservicecategorycoding.setSystem(a.getAppmntSrvCtgryCdgSys());
		}
		/******************** Appmnt_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgUsrSltd() != null) {
			appointmentservicecategorycoding.setUserSelected(Boolean.parseBoolean(a.getAppmntSrvCtgryCdgUsrSltd()));
		}
		/******************** Appmnt_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgVrsn() != null) {
			appointmentservicecategorycoding.setVersion(a.getAppmntSrvCtgryCdgVrsn());
		}
		/******************** Appmnt_SrvCtgry_Txt ********************************************************************************/
		if(a.getAppmntSrvCtgryTxt() != null) {
			appointmentservicecategory.setText(a.getAppmntSrvCtgryTxt());
		}
		/******************** appointmentservicetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentservicetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointment.addServiceType(appointmentservicetype);

		/******************** appointmentservicetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentservicetypecoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentservicetype.addCoding(appointmentservicetypecoding);

		/******************** Appmnt_SrvTyp_Cdg_Cd ********************************************************************************/
		if(a.getAppmntSrvTypCdgCd() != null) {
			appointmentservicetypecoding.setCode(a.getAppmntSrvTypCdgCd());
		}
		/******************** Appmnt_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntSrvTypCdgDsply() != null) {
			appointmentservicetypecoding.setDisplay(a.getAppmntSrvTypCdgDsply());
		}
		/******************** Appmnt_SrvTyp_Cdg_Sys ********************************************************************************/
		if(a.getAppmntSrvTypCdgSys() != null) {
			appointmentservicetypecoding.setSystem(a.getAppmntSrvTypCdgSys());
		}
		/******************** Appmnt_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntSrvTypCdgUsrSltd() != null) {
			appointmentservicetypecoding.setUserSelected(Boolean.parseBoolean(a.getAppmntSrvTypCdgUsrSltd()));
		}
		/******************** Appmnt_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntSrvTypCdgVrsn() != null) {
			appointmentservicetypecoding.setVersion(a.getAppmntSrvTypCdgVrsn());
		}
		/******************** Appmnt_SrvTyp_Txt ********************************************************************************/
		if(a.getAppmntSrvTypTxt() != null) {
			appointmentservicetype.setText(a.getAppmntSrvTypTxt());
		}
		/******************** Appmnt_Slot ********************************************************************************/
		if(a.getAppmntSlot() != null) {
			appointment.addSlot( new org.hl7.fhir.r4.model.Reference(a.getAppmntSlot()));
		}
		/******************** appointmentspecialty ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentspecialty =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointment.addSpecialty(appointmentspecialty);

		/******************** appointmentspecialtycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentspecialtycoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentspecialty.addCoding(appointmentspecialtycoding);

		/******************** Appmnt_Spclty_Cdg_Cd ********************************************************************************/
		if(a.getAppmntSpcltyCdgCd() != null) {
			appointmentspecialtycoding.setCode(a.getAppmntSpcltyCdgCd());
		}
		/******************** Appmnt_Spclty_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntSpcltyCdgDsply() != null) {
			appointmentspecialtycoding.setDisplay(a.getAppmntSpcltyCdgDsply());
		}
		/******************** Appmnt_Spclty_Cdg_Sys ********************************************************************************/
		if(a.getAppmntSpcltyCdgSys() != null) {
			appointmentspecialtycoding.setSystem(a.getAppmntSpcltyCdgSys());
		}
		/******************** Appmnt_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntSpcltyCdgUsrSltd() != null) {
			appointmentspecialtycoding.setUserSelected(Boolean.parseBoolean(a.getAppmntSpcltyCdgUsrSltd()));
		}
		/******************** Appmnt_Spclty_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntSpcltyCdgVrsn() != null) {
			appointmentspecialtycoding.setVersion(a.getAppmntSpcltyCdgVrsn());
		}
		/******************** Appmnt_Spclty_Txt ********************************************************************************/
		if(a.getAppmntSpcltyTxt() != null) {
			appointmentspecialty.setText(a.getAppmntSpcltyTxt());
		}
		/******************** Appmnt_Strt ********************************************************************************/
		if(a.getAppmntStrt() != null) {
			java.text.SimpleDateFormat Appmnt_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Appmnt_Strtdate = Appmnt_Strtsdf.parse(a.getAppmntStrt());
			appointment.setStart(Appmnt_Strtdate);
		}
		/******************** appointmentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Appointment.AppointmentStatusEnumFactory appointmentstatus =  new org.hl7.fhir.r4.model.Appointment.AppointmentStatusEnumFactory();
		appointment.setStatus(appointmentstatus.fromCode(a.getAppmntSts()));

		/******************** Appmnt_SprtingInfo ********************************************************************************/
		if(a.getAppmntSprtingInfo() != null) {
			appointment.addSupportingInformation( new org.hl7.fhir.r4.model.Reference(a.getAppmntSprtingInfo()));
		}
		return appointment;
	}
}
