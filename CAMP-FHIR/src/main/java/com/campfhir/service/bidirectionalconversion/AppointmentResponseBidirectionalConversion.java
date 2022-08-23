package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AppointmentResponse;
public class AppointmentResponseBidirectionalConversion 
{
	public AppointmentResponse AppointmentResponses(org.hl7.fhir.r4.model.AppointmentResponse appointmentresponse) throws ParseException
	{
		 main.java.com.campfhir.model.AppointmentResponse a = new  main.java.com.campfhir.model.AppointmentResponse();

		/******************** id ********************************************************************************/
		a.setId(appointmentresponse.getIdElement().getIdPart());

		/******************** AppmntRsps_Comment ********************************************************************************/
		if(appointmentresponse.hasComment()) {

			a.addAppmntRspsComment(String.valueOf(appointmentresponse.getComment()));
		} else {
			a.addAppmntRspsComment("NULL");
		}


		/******************** appointmentresponseidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> appointmentresponseidentifierlist = appointmentresponse.getIdentifier();
		for(int appointmentresponseidentifieri = 0; appointmentresponseidentifieri<appointmentresponseidentifierlist.size();appointmentresponseidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  appointmentresponseidentifier = appointmentresponseidentifierlist.get(appointmentresponseidentifieri);

		/******************** AppmntRsps_Id_Vl ********************************************************************************/
		if(appointmentresponseidentifieri == 0) {a.addAppmntRspsIdVl("[");}
		if(appointmentresponseidentifier.hasValue()) {

			a.addAppmntRspsIdVl(String.valueOf(appointmentresponseidentifier.getValue()));
		} else {
			a.addAppmntRspsIdVl("NULL");
		}

		if(appointmentresponseidentifieri == appointmentresponseidentifierlist.size()-1) {a.addAppmntRspsIdVl("]");}


		/******************** appointmentresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept appointmentresponseidentifiertype = appointmentresponseidentifier.getType();

		/******************** AppmntRsps_Id_Typ_Txt ********************************************************************************/
		if(appointmentresponseidentifieri == 0) {a.addAppmntRspsIdTypTxt("[");}
		if(appointmentresponseidentifiertype.hasText()) {

			a.addAppmntRspsIdTypTxt(String.valueOf(appointmentresponseidentifiertype.getText()));
		} else {
			a.addAppmntRspsIdTypTxt("NULL");
		}

		if(appointmentresponseidentifieri == appointmentresponseidentifierlist.size()-1) {a.addAppmntRspsIdTypTxt("]");}


		/******************** appointmentresponseidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentresponseidentifiertypecodinglist = appointmentresponseidentifiertype.getCoding();
		for(int appointmentresponseidentifiertypecodingi = 0; appointmentresponseidentifiertypecodingi<appointmentresponseidentifiertypecodinglist.size();appointmentresponseidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentresponseidentifiertypecoding = appointmentresponseidentifiertypecodinglist.get(appointmentresponseidentifiertypecodingi);

		/******************** AppmntRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(appointmentresponseidentifiertypecodingi == 0) {a.addAppmntRspsIdTypCdgDsply("[[");}
		if(appointmentresponseidentifiertypecoding.hasDisplay()) {

			a.addAppmntRspsIdTypCdgDsply(String.valueOf(appointmentresponseidentifiertypecoding.getDisplay()));
		} else {
			a.addAppmntRspsIdTypCdgDsply("NULL");
		}

		if(appointmentresponseidentifiertypecodingi == appointmentresponseidentifiertypecodinglist.size()-1) {a.addAppmntRspsIdTypCdgDsply("]]");}


		/******************** AppmntRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(appointmentresponseidentifiertypecodingi == 0) {a.addAppmntRspsIdTypCdgVrsn("[[");}
		if(appointmentresponseidentifiertypecoding.hasVersion()) {

			a.addAppmntRspsIdTypCdgVrsn(String.valueOf(appointmentresponseidentifiertypecoding.getVersion()));
		} else {
			a.addAppmntRspsIdTypCdgVrsn("NULL");
		}

		if(appointmentresponseidentifiertypecodingi == appointmentresponseidentifiertypecodinglist.size()-1) {a.addAppmntRspsIdTypCdgVrsn("]]");}


		/******************** AppmntRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(appointmentresponseidentifiertypecodingi == 0) {a.addAppmntRspsIdTypCdgCd("[[");}
		if(appointmentresponseidentifiertypecoding.hasCode()) {

			a.addAppmntRspsIdTypCdgCd(String.valueOf(appointmentresponseidentifiertypecoding.getCode()));
		} else {
			a.addAppmntRspsIdTypCdgCd("NULL");
		}

		if(appointmentresponseidentifiertypecodingi == appointmentresponseidentifiertypecodinglist.size()-1) {a.addAppmntRspsIdTypCdgCd("]]");}


		/******************** AppmntRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(appointmentresponseidentifiertypecodingi == 0) {a.addAppmntRspsIdTypCdgUsrSltd("[[");}
		if(appointmentresponseidentifiertypecoding.hasUserSelected()) {

			a.addAppmntRspsIdTypCdgUsrSltd(String.valueOf(appointmentresponseidentifiertypecoding.getUserSelected()));
		} else {
			a.addAppmntRspsIdTypCdgUsrSltd("NULL");
		}

		if(appointmentresponseidentifiertypecodingi == appointmentresponseidentifiertypecodinglist.size()-1) {a.addAppmntRspsIdTypCdgUsrSltd("]]");}


		/******************** AppmntRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(appointmentresponseidentifiertypecodingi == 0) {a.addAppmntRspsIdTypCdgSys("[[");}
		if(appointmentresponseidentifiertypecoding.hasSystem()) {

			a.addAppmntRspsIdTypCdgSys(String.valueOf(appointmentresponseidentifiertypecoding.getSystem()));
		} else {
			a.addAppmntRspsIdTypCdgSys("NULL");
		}

		if(appointmentresponseidentifiertypecodingi == appointmentresponseidentifiertypecodinglist.size()-1) {a.addAppmntRspsIdTypCdgSys("]]");}


		 };
		/******************** appointmentresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period appointmentresponseidentifierperiod = appointmentresponseidentifier.getPeriod();

		/******************** AppmntRsps_Id_Prd_Strt ********************************************************************************/
		if(appointmentresponseidentifieri == 0) {a.addAppmntRspsIdPrdStrt("[");}
		if(appointmentresponseidentifierperiod.hasStart()) {

			a.addAppmntRspsIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentresponseidentifierperiod.getStart())+"\"");
		} else {
			a.addAppmntRspsIdPrdStrt("NULL");
		}

		if(appointmentresponseidentifieri == appointmentresponseidentifierlist.size()-1) {a.addAppmntRspsIdPrdStrt("]");}


		/******************** AppmntRsps_Id_Prd_End ********************************************************************************/
		if(appointmentresponseidentifieri == 0) {a.addAppmntRspsIdPrdEnd("[");}
		if(appointmentresponseidentifierperiod.hasEnd()) {

			a.addAppmntRspsIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentresponseidentifierperiod.getEnd())+"\"");
		} else {
			a.addAppmntRspsIdPrdEnd("NULL");
		}

		if(appointmentresponseidentifieri == appointmentresponseidentifierlist.size()-1) {a.addAppmntRspsIdPrdEnd("]");}


		/******************** appointmentresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse appointmentresponseidentifieruse = appointmentresponseidentifier.getUse();
		if(appointmentresponseidentifieruse!=null) {
		if(appointmentresponseidentifieri == 0) {

		a.addAppmntRspsIdUse("[");		}
			a.addAppmntRspsIdUse(appointmentresponseidentifieruse.toCode());
		if(appointmentresponseidentifieri == appointmentresponseidentifierlist.size()-1) {

		a.addAppmntRspsIdUse("]");		}

		} else {
			a.addAppmntRspsIdUse("NULL");
		}

		/******************** AppmntRsps_Id_Assigner ********************************************************************************/
		if(appointmentresponseidentifieri == 0) {a.addAppmntRspsIdAssigner("[");}
		if(appointmentresponseidentifier.hasAssigner()) {

			if(appointmentresponseidentifier.getAssigner().getReference() != null) {
			a.addAppmntRspsIdAssigner(appointmentresponseidentifier.getAssigner().getReference());
			}
		} else {
			a.addAppmntRspsIdAssigner("NULL");
		}

		if(appointmentresponseidentifieri == appointmentresponseidentifierlist.size()-1) {a.addAppmntRspsIdAssigner("]");}


		/******************** AppmntRsps_Id_Sys ********************************************************************************/
		if(appointmentresponseidentifieri == 0) {a.addAppmntRspsIdSys("[");}
		if(appointmentresponseidentifier.hasSystem()) {

			a.addAppmntRspsIdSys(String.valueOf(appointmentresponseidentifier.getSystem()));
		} else {
			a.addAppmntRspsIdSys("NULL");
		}

		if(appointmentresponseidentifieri == appointmentresponseidentifierlist.size()-1) {a.addAppmntRspsIdSys("]");}


		 };
		/******************** appointmentresponseparticipantstatus ********************************************************************************/
		org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatus appointmentresponseparticipantstatus = appointmentresponse.getParticipantStatus();
		if(appointmentresponseparticipantstatus!=null) {
			a.addAppmntRspsPrtcpntSts(appointmentresponseparticipantstatus.toCode());
		} else {
			a.addAppmntRspsPrtcpntSts("NULL");
		}

		/******************** AppmntRsps_Strt ********************************************************************************/
		if(appointmentresponse.hasStart()) {

			a.addAppmntRspsStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentresponse.getStart())+"\"");
		} else {
			a.addAppmntRspsStrt("NULL");
		}


		/******************** AppmntRsps_End ********************************************************************************/
		if(appointmentresponse.hasEnd()) {

			a.addAppmntRspsEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(appointmentresponse.getEnd())+"\"");
		} else {
			a.addAppmntRspsEnd("NULL");
		}


		/******************** appointmentresponseparticipanttype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> appointmentresponseparticipanttypelist = appointmentresponse.getParticipantType();
		for(int appointmentresponseparticipanttypei = 0; appointmentresponseparticipanttypei<appointmentresponseparticipanttypelist.size();appointmentresponseparticipanttypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  appointmentresponseparticipanttype = appointmentresponseparticipanttypelist.get(appointmentresponseparticipanttypei);

		/******************** AppmntRsps_PrtcpntTyp_Txt ********************************************************************************/
		if(appointmentresponseparticipanttypei == 0) {a.addAppmntRspsPrtcpntTypTxt("[");}
		if(appointmentresponseparticipanttype.hasText()) {

			a.addAppmntRspsPrtcpntTypTxt(String.valueOf(appointmentresponseparticipanttype.getText()));
		} else {
			a.addAppmntRspsPrtcpntTypTxt("NULL");
		}

		if(appointmentresponseparticipanttypei == appointmentresponseparticipanttypelist.size()-1) {a.addAppmntRspsPrtcpntTypTxt("]");}


		/******************** appointmentresponseparticipanttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> appointmentresponseparticipanttypecodinglist = appointmentresponseparticipanttype.getCoding();
		for(int appointmentresponseparticipanttypecodingi = 0; appointmentresponseparticipanttypecodingi<appointmentresponseparticipanttypecodinglist.size();appointmentresponseparticipanttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  appointmentresponseparticipanttypecoding = appointmentresponseparticipanttypecodinglist.get(appointmentresponseparticipanttypecodingi);

		/******************** AppmntRsps_PrtcpntTyp_Cdg_Dsply ********************************************************************************/
		if(appointmentresponseparticipanttypecodingi == 0) {a.addAppmntRspsPrtcpntTypCdgDsply("[[");}
		if(appointmentresponseparticipanttypecoding.hasDisplay()) {

			a.addAppmntRspsPrtcpntTypCdgDsply(String.valueOf(appointmentresponseparticipanttypecoding.getDisplay()));
		} else {
			a.addAppmntRspsPrtcpntTypCdgDsply("NULL");
		}

		if(appointmentresponseparticipanttypecodingi == appointmentresponseparticipanttypecodinglist.size()-1) {a.addAppmntRspsPrtcpntTypCdgDsply("]]");}


		/******************** AppmntRsps_PrtcpntTyp_Cdg_Vrsn ********************************************************************************/
		if(appointmentresponseparticipanttypecodingi == 0) {a.addAppmntRspsPrtcpntTypCdgVrsn("[[");}
		if(appointmentresponseparticipanttypecoding.hasVersion()) {

			a.addAppmntRspsPrtcpntTypCdgVrsn(String.valueOf(appointmentresponseparticipanttypecoding.getVersion()));
		} else {
			a.addAppmntRspsPrtcpntTypCdgVrsn("NULL");
		}

		if(appointmentresponseparticipanttypecodingi == appointmentresponseparticipanttypecodinglist.size()-1) {a.addAppmntRspsPrtcpntTypCdgVrsn("]]");}


		/******************** AppmntRsps_PrtcpntTyp_Cdg_Cd ********************************************************************************/
		if(appointmentresponseparticipanttypecodingi == 0) {a.addAppmntRspsPrtcpntTypCdgCd("[[");}
		if(appointmentresponseparticipanttypecoding.hasCode()) {

			a.addAppmntRspsPrtcpntTypCdgCd(String.valueOf(appointmentresponseparticipanttypecoding.getCode()));
		} else {
			a.addAppmntRspsPrtcpntTypCdgCd("NULL");
		}

		if(appointmentresponseparticipanttypecodingi == appointmentresponseparticipanttypecodinglist.size()-1) {a.addAppmntRspsPrtcpntTypCdgCd("]]");}


		/******************** AppmntRsps_PrtcpntTyp_Cdg_UsrSltd ********************************************************************************/
		if(appointmentresponseparticipanttypecodingi == 0) {a.addAppmntRspsPrtcpntTypCdgUsrSltd("[[");}
		if(appointmentresponseparticipanttypecoding.hasUserSelected()) {

			a.addAppmntRspsPrtcpntTypCdgUsrSltd(String.valueOf(appointmentresponseparticipanttypecoding.getUserSelected()));
		} else {
			a.addAppmntRspsPrtcpntTypCdgUsrSltd("NULL");
		}

		if(appointmentresponseparticipanttypecodingi == appointmentresponseparticipanttypecodinglist.size()-1) {a.addAppmntRspsPrtcpntTypCdgUsrSltd("]]");}


		/******************** AppmntRsps_PrtcpntTyp_Cdg_Sys ********************************************************************************/
		if(appointmentresponseparticipanttypecodingi == 0) {a.addAppmntRspsPrtcpntTypCdgSys("[[");}
		if(appointmentresponseparticipanttypecoding.hasSystem()) {

			a.addAppmntRspsPrtcpntTypCdgSys(String.valueOf(appointmentresponseparticipanttypecoding.getSystem()));
		} else {
			a.addAppmntRspsPrtcpntTypCdgSys("NULL");
		}

		if(appointmentresponseparticipanttypecodingi == appointmentresponseparticipanttypecodinglist.size()-1) {a.addAppmntRspsPrtcpntTypCdgSys("]]");}


		 };
		 };
		/******************** AppmntRsps_Actor ********************************************************************************/
		if(appointmentresponse.hasActor()) {

			if(appointmentresponse.getActor().getReference() != null) {
			a.addAppmntRspsActor(appointmentresponse.getActor().getReference());
			}
		} else {
			a.addAppmntRspsActor("NULL");
		}


		/******************** AppmntRsps_Appmnt ********************************************************************************/
		if(appointmentresponse.hasAppointment()) {

			if(appointmentresponse.getAppointment().getReference() != null) {
			a.addAppmntRspsAppmnt(appointmentresponse.getAppointment().getReference());
			}
		} else {
			a.addAppmntRspsAppmnt("NULL");
		}


		return a;
	}
}
