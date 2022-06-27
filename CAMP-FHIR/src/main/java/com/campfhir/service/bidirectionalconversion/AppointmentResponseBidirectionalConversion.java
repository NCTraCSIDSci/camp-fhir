package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AppointmentResponse;
public class AppointmentResponseBidirectionalConversion 
{
	public AppointmentResponse AppointmentResponses(org.hl7.fhir.r4.model.AppointmentResponse appointmentresponse) throws ParseException
	{
		 main.java.com.campfhir.model.AppointmentResponse a = new  main.java.com.campfhir.model.AppointmentResponse();

		/******************** id ********************************************************************************/
		appointmentresponse.setId(a.getId());

		/******************** AppmntRsps_Comment ********************************************************************************/
		if(appointmentresponse.hasComment()) {
			a.setAppmntRspsComment(String.valueOf(appointmentresponse.getComment()));
		}
		/******************** AppmntRsps_Appmnt ********************************************************************************/
		if(appointmentresponse.hasAppointment()) {
			a.setAppmntRspsAppmnt(String.valueOf(appointmentresponse.getAppointment()));
		}
		/******************** AppmntRsps_Strt ********************************************************************************/
		if(appointmentresponse.hasStart()) {
			a.setAppmntRspsStrt(String.valueOf(appointmentresponse.getStart()));
		}
		/******************** AppmntRsps_End ********************************************************************************/
		if(appointmentresponse.hasEnd()) {
			a.setAppmntRspsEnd(String.valueOf(appointmentresponse.getEnd()));
		}
		/******************** AppmntRsps_Actor ********************************************************************************/
		if(appointmentresponse.hasActor()) {
			a.setAppmntRspsActor(String.valueOf(appointmentresponse.getActor()));
		}
		/******************** appointmentresponseparticipantstatus ********************************************************************************/
		org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus appointmentresponseparticipantstatus = appointmentresponse.getParticipantStatus();
		a.setAppmntRspsPrtcpntSts(appointmentresponseparticipantstatus.toCode());

		/******************** appointmentresponseparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentresponseparticipanttype = appointmentresponse.getParticipantTypeFirstRep();

		/******************** AppmntRsps_PrtcpntTyp_Txt ********************************************************************************/
		if(appointmentresponseparticipanttype.hasText()) {
			a.setAppmntRspsPrtcpntTypTxt(String.valueOf(appointmentresponseparticipanttype.getText()));
		}
		/******************** appointmentresponseparticipanttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentresponseparticipanttypecoding = appointmentresponseparticipanttype.getCodingFirstRep();

		/******************** AppmntRsps_PrtcpntTyp_Cdg_Vrsn ********************************************************************************/
		if(appointmentresponseparticipanttypecoding.hasVersion()) {
			a.setAppmntRspsPrtcpntTypCdgVrsn(String.valueOf(appointmentresponseparticipanttypecoding.getVersion()));
		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Dsply ********************************************************************************/
		if(appointmentresponseparticipanttypecoding.hasDisplay()) {
			a.setAppmntRspsPrtcpntTypCdgDsply(String.valueOf(appointmentresponseparticipanttypecoding.getDisplay()));
		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Cd ********************************************************************************/
		if(appointmentresponseparticipanttypecoding.hasCode()) {
			a.setAppmntRspsPrtcpntTypCdgCd(String.valueOf(appointmentresponseparticipanttypecoding.getCode()));
		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_UsrSltd ********************************************************************************/
		if(appointmentresponseparticipanttypecoding.hasUserSelected()) {
			a.setAppmntRspsPrtcpntTypCdgUsrSltd(String.valueOf(appointmentresponseparticipanttypecoding.getUserSelected()));
		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Sys ********************************************************************************/
		if(appointmentresponseparticipanttypecoding.hasSystem()) {
			a.setAppmntRspsPrtcpntTypCdgSys(String.valueOf(appointmentresponseparticipanttypecoding.getSystem()));
		}
		/******************** appointmentresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier appointmentresponseidentifier = appointmentresponse.getIdentifierFirstRep();

		/******************** AppmntRsps_Id_Vl ********************************************************************************/
		if(appointmentresponseidentifier.hasValue()) {
			a.setAppmntRspsIdVl(String.valueOf(appointmentresponseidentifier.getValue()));
		}
		/******************** appointmentresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentresponseidentifiertype = appointmentresponseidentifier.getType();

		/******************** AppmntRsps_Id_Typ_Txt ********************************************************************************/
		if(appointmentresponseidentifiertype.hasText()) {
			a.setAppmntRspsIdTypTxt(String.valueOf(appointmentresponseidentifiertype.getText()));
		}
		/******************** appointmentresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding appointmentresponseidentifiertypecoding = appointmentresponseidentifiertype.getCodingFirstRep();

		/******************** AppmntRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(appointmentresponseidentifiertypecoding.hasVersion()) {
			a.setAppmntRspsIdTypCdgVrsn(String.valueOf(appointmentresponseidentifiertypecoding.getVersion()));
		}
		/******************** AppmntRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(appointmentresponseidentifiertypecoding.hasDisplay()) {
			a.setAppmntRspsIdTypCdgDsply(String.valueOf(appointmentresponseidentifiertypecoding.getDisplay()));
		}
		/******************** AppmntRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(appointmentresponseidentifiertypecoding.hasCode()) {
			a.setAppmntRspsIdTypCdgCd(String.valueOf(appointmentresponseidentifiertypecoding.getCode()));
		}
		/******************** AppmntRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(appointmentresponseidentifiertypecoding.hasUserSelected()) {
			a.setAppmntRspsIdTypCdgUsrSltd(String.valueOf(appointmentresponseidentifiertypecoding.getUserSelected()));
		}
		/******************** AppmntRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(appointmentresponseidentifiertypecoding.hasSystem()) {
			a.setAppmntRspsIdTypCdgSys(String.valueOf(appointmentresponseidentifiertypecoding.getSystem()));
		}
		/******************** appointmentresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentresponseidentifierperiod = appointmentresponseidentifier.getPeriod();

		/******************** AppmntRsps_Id_Prd_Strt ********************************************************************************/
		if(appointmentresponseidentifierperiod.hasStart()) {
			a.setAppmntRspsIdPrdStrt(String.valueOf(appointmentresponseidentifierperiod.getStart()));
		}
		/******************** AppmntRsps_Id_Prd_End ********************************************************************************/
		if(appointmentresponseidentifierperiod.hasEnd()) {
			a.setAppmntRspsIdPrdEnd(String.valueOf(appointmentresponseidentifierperiod.getEnd()));
		}
		/******************** AppmntRsps_Id_Assigner ********************************************************************************/
		if(appointmentresponseidentifier.hasAssigner()) {
			a.setAppmntRspsIdAssigner(String.valueOf(appointmentresponseidentifier.getAssigner()));
		}
		/******************** AppmntRsps_Id_Sys ********************************************************************************/
		if(appointmentresponseidentifier.hasSystem()) {
			a.setAppmntRspsIdSys(String.valueOf(appointmentresponseidentifier.getSystem()));
		}
		/******************** appointmentresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse appointmentresponseidentifieruse = appointmentresponseidentifier.getUse();
		a.setAppmntRspsIdUse(appointmentresponseidentifieruse.toCode());

		return a;
	}
}
