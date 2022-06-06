package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AppointmentResponse;
public class AppointmentResponseConversion 
{
	public org.hl7.fhir.r4.model.AppointmentResponse AppointmentResponses(AppointmentResponse a) throws ParseException
	{
		org.hl7.fhir.r4.model.AppointmentResponse appointmentresponse = new org.hl7.fhir.r4.model.AppointmentResponse();

		/******************** id ********************************************************************************/
		appointmentresponse.setId(a.getId());

		/******************** AppmntRsps_Actor ********************************************************************************/
		if(a.getAppmntRspsActor() != null) {
			appointmentresponse.setActor( new org.hl7.fhir.r4.model.Reference(a.getAppmntRspsActor()));
		}
		/******************** AppmntRsps_Appmnt ********************************************************************************/
		if(a.getAppmntRspsAppmnt() != null) {
			appointmentresponse.setAppointment( new org.hl7.fhir.r4.model.Reference(a.getAppmntRspsAppmnt()));
		}
		/******************** AppmntRsps_Comment ********************************************************************************/
		if(a.getAppmntRspsComment() != null) {
			appointmentresponse.setComment(a.getAppmntRspsComment());
		}
		/******************** AppmntRsps_End ********************************************************************************/
		if(a.getAppmntRspsEnd() != null) {
			java.text.SimpleDateFormat AppmntRsps_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AppmntRsps_Enddate = AppmntRsps_Endsdf.parse(a.getAppmntRspsEnd());
			appointmentresponse.setEnd(AppmntRsps_Enddate);
		}
		/******************** appointmentresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier appointmentresponseidentifier =  new org.hl7.fhir.r4.model.Identifier();
		appointmentresponse.addIdentifier(appointmentresponseidentifier);

		/******************** AppmntRsps_Id_Assigner ********************************************************************************/
		if(a.getAppmntRspsIdAssigner() != null) {
			appointmentresponseidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(a.getAppmntRspsIdAssigner()));
		}
		/******************** appointmentresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentresponseidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		appointmentresponseidentifier.setPeriod(appointmentresponseidentifierperiod);

		/******************** AppmntRsps_Id_Prd_End ********************************************************************************/
		if(a.getAppmntRspsIdPrdEnd() != null) {
			java.text.SimpleDateFormat AppmntRsps_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AppmntRsps_Id_Prd_Enddate = AppmntRsps_Id_Prd_Endsdf.parse(a.getAppmntRspsIdPrdEnd());
			appointmentresponseidentifierperiod.setEnd(AppmntRsps_Id_Prd_Enddate);
		}
		/******************** AppmntRsps_Id_Prd_Strt ********************************************************************************/
		if(a.getAppmntRspsIdPrdStrt() != null) {
			java.text.SimpleDateFormat AppmntRsps_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AppmntRsps_Id_Prd_Strtdate = AppmntRsps_Id_Prd_Strtsdf.parse(a.getAppmntRspsIdPrdStrt());
			appointmentresponseidentifierperiod.setStart(AppmntRsps_Id_Prd_Strtdate);
		}
		/******************** AppmntRsps_Id_Sys ********************************************************************************/
		if(a.getAppmntRspsIdSys() != null) {
			appointmentresponseidentifier.setSystem(a.getAppmntRspsIdSys());
		}
		/******************** appointmentresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentresponseidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointmentresponseidentifier.setType(appointmentresponseidentifiertype);

		/******************** appointmentresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentresponseidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentresponseidentifiertype.addCoding(appointmentresponseidentifiertypecoding);

		/******************** AppmntRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgCd() != null) {
			appointmentresponseidentifiertypecoding.setCode(a.getAppmntRspsIdTypCdgCd());
		}
		/******************** AppmntRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgDsply() != null) {
			appointmentresponseidentifiertypecoding.setDisplay(a.getAppmntRspsIdTypCdgDsply());
		}
		/******************** AppmntRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgSys() != null) {
			appointmentresponseidentifiertypecoding.setSystem(a.getAppmntRspsIdTypCdgSys());
		}
		/******************** AppmntRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgUsrSltd() != null) {
			appointmentresponseidentifiertypecoding.setUserSelected(Boolean.parseBoolean(a.getAppmntRspsIdTypCdgUsrSltd()));
		}
		/******************** AppmntRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgVrsn() != null) {
			appointmentresponseidentifiertypecoding.setVersion(a.getAppmntRspsIdTypCdgVrsn());
		}
		/******************** AppmntRsps_Id_Typ_Txt ********************************************************************************/
		if(a.getAppmntRspsIdTypTxt() != null) {
			appointmentresponseidentifiertype.setText(a.getAppmntRspsIdTypTxt());
		}
		/******************** appointmentresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory appointmentresponseidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		appointmentresponseidentifier.setUse(appointmentresponseidentifieruse.fromCode(a.getAppmntRspsIdUse()));

		/******************** AppmntRsps_Id_Vl ********************************************************************************/
		if(a.getAppmntRspsIdVl() != null) {
			appointmentresponseidentifier.setValue(a.getAppmntRspsIdVl());
		}
		/******************** appointmentresponseparticipantstatus ********************************************************************************/
		org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatusEnumFactory appointmentresponseparticipantstatus =  new org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatusEnumFactory();
		appointmentresponse.setParticipantStatus(appointmentresponseparticipantstatus.fromCode(a.getAppmntRspsPrtcpntSts()));

		/******************** appointmentresponseparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentresponseparticipanttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		appointmentresponse.addParticipantType(appointmentresponseparticipanttype);

		/******************** appointmentresponseparticipanttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentresponseparticipanttypecoding =  new org.hl7.fhir.r4.model.Coding();
		appointmentresponseparticipanttype.addCoding(appointmentresponseparticipanttypecoding);

		/******************** AppmntRsps_PrtcpntTyp_Cdg_Cd ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgCd() != null) {
			appointmentresponseparticipanttypecoding.setCode(a.getAppmntRspsPrtcpntTypCdgCd());
		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgDsply() != null) {
			appointmentresponseparticipanttypecoding.setDisplay(a.getAppmntRspsPrtcpntTypCdgDsply());
		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Sys ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgSys() != null) {
			appointmentresponseparticipanttypecoding.setSystem(a.getAppmntRspsPrtcpntTypCdgSys());
		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgUsrSltd() != null) {
			appointmentresponseparticipanttypecoding.setUserSelected(Boolean.parseBoolean(a.getAppmntRspsPrtcpntTypCdgUsrSltd()));
		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgVrsn() != null) {
			appointmentresponseparticipanttypecoding.setVersion(a.getAppmntRspsPrtcpntTypCdgVrsn());
		}
		/******************** AppmntRsps_PrtcpntTyp_Txt ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypTxt() != null) {
			appointmentresponseparticipanttype.setText(a.getAppmntRspsPrtcpntTypTxt());
		}
		/******************** AppmntRsps_Strt ********************************************************************************/
		if(a.getAppmntRspsStrt() != null) {
			java.text.SimpleDateFormat AppmntRsps_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AppmntRsps_Strtdate = AppmntRsps_Strtsdf.parse(a.getAppmntRspsStrt());
			appointmentresponse.setStart(AppmntRsps_Strtdate);
		}
		return appointmentresponse;
	}
}
