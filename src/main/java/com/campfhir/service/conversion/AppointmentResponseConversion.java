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
		if(a.getAppmntRspsActor() != null ) {

			if(a.getAppmntRspsActor().replace("[","").replace("]","").equals("NULL") | a.getAppmntRspsActor()==null) {} else {
			appointmentresponse.setActor(new org.hl7.fhir.r4.model.Reference(a.getAppmntRspsActor().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AppmntRsps_Appmnt ********************************************************************************/
		if(a.getAppmntRspsAppmnt() != null ) {

			if(a.getAppmntRspsAppmnt().replace("[","").replace("]","").equals("NULL") | a.getAppmntRspsAppmnt()==null) {} else {
			appointmentresponse.setAppointment(new org.hl7.fhir.r4.model.Reference(a.getAppmntRspsAppmnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AppmntRsps_Comment ********************************************************************************/
		if(a.getAppmntRspsComment() != null ) {

			if(a.getAppmntRspsComment().replace("[","").replace("]","").equals("NULL") | a.getAppmntRspsComment()==null) {} else {
			appointmentresponse.setComment(a.getAppmntRspsComment().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** AppmntRsps_End ********************************************************************************/
		if(a.getAppmntRspsEnd() != null ) {

			if(a.getAppmntRspsEnd().replace("[","").replace("]","").equals("NULL") | a.getAppmntRspsEnd()==null) {} else {
			appointmentresponse.setEnd(a.getAppmntRspsEnd().replace("[","").replace("]","").equals("NULL") | a.getAppmntRspsEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAppmntRspsEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AppmntRsps_Id_Assigner ********************************************************************************/
		if(a.getAppmntRspsIdAssigner() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointmentresponse.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AppmntRsps_Id_Prd_End ********************************************************************************/
		if(a.getAppmntRspsIdPrdEnd() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointmentresponse.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AppmntRsps_Id_Prd_Strt ********************************************************************************/
		if(a.getAppmntRspsIdPrdStrt() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointmentresponse.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AppmntRsps_Id_Sys ********************************************************************************/
		if(a.getAppmntRspsIdSys() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointmentresponse.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AppmntRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				String[] arrayi1 = a.getAppmntRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AppmntRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				String[] arrayi1 = a.getAppmntRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AppmntRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				String[] arrayi1 = a.getAppmntRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AppmntRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				String[] arrayi1 = a.getAppmntRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AppmntRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntRspsIdTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				String[] arrayi1 = a.getAppmntRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointmentresponse.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AppmntRsps_Id_Typ_Txt ********************************************************************************/
		if(a.getAppmntRspsIdTypTxt() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointmentresponse.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AppmntRsps_Id_Use ********************************************************************************/
		if(a.getAppmntRspsIdUse() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointmentresponse.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** AppmntRsps_Id_Vl ********************************************************************************/
		if(a.getAppmntRspsIdVl() != null ) {

			String[] arrayi0 = a.getAppmntRspsIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getIdentifier().size() < i0+1) { appointmentresponse.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointmentresponse.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AppmntRsps_PrtcpntSts ********************************************************************************/
		if(a.getAppmntRspsPrtcpntSts() != null ) {

			if(a.getAppmntRspsPrtcpntSts().replace("[","").replace("]","").equals("NULL") | a.getAppmntRspsPrtcpntSts()==null) {} else {
			appointmentresponse.setParticipantStatus(new org.hl7.fhir.r4.model.AppointmentResponse.ParticipantStatusEnumFactory().fromCode(a.getAppmntRspsPrtcpntSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Cd ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntRspsPrtcpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getParticipantType().size() < i0+1) { appointmentresponse.addParticipantType(); }
				String[] arrayi1 = a.getAppmntRspsPrtcpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getParticipantType().get(i0).getCoding().size() < i1+1) { appointmentresponse.getParticipantType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getParticipantType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntRspsPrtcpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getParticipantType().size() < i0+1) { appointmentresponse.addParticipantType(); }
				String[] arrayi1 = a.getAppmntRspsPrtcpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getParticipantType().get(i0).getCoding().size() < i1+1) { appointmentresponse.getParticipantType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getParticipantType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Sys ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntRspsPrtcpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getParticipantType().size() < i0+1) { appointmentresponse.addParticipantType(); }
				String[] arrayi1 = a.getAppmntRspsPrtcpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getParticipantType().get(i0).getCoding().size() < i1+1) { appointmentresponse.getParticipantType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getParticipantType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntRspsPrtcpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getParticipantType().size() < i0+1) { appointmentresponse.addParticipantType(); }
				String[] arrayi1 = a.getAppmntRspsPrtcpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getParticipantType().get(i0).getCoding().size() < i1+1) { appointmentresponse.getParticipantType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getParticipantType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** AppmntRsps_PrtcpntTyp_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntRspsPrtcpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getParticipantType().size() < i0+1) { appointmentresponse.addParticipantType(); }
				String[] arrayi1 = a.getAppmntRspsPrtcpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointmentresponse.getParticipantType().get(i0).getCoding().size() < i1+1) { appointmentresponse.getParticipantType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointmentresponse.getParticipantType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** AppmntRsps_PrtcpntTyp_Txt ********************************************************************************/
		if(a.getAppmntRspsPrtcpntTypTxt() != null ) {

			String[] arrayi0 = a.getAppmntRspsPrtcpntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointmentresponse.getParticipantType().size() < i0+1) { appointmentresponse.addParticipantType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointmentresponse.getParticipantType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** AppmntRsps_Strt ********************************************************************************/
		if(a.getAppmntRspsStrt() != null ) {

			if(a.getAppmntRspsStrt().replace("[","").replace("]","").equals("NULL") | a.getAppmntRspsStrt()==null) {} else {
			appointmentresponse.setStart(a.getAppmntRspsStrt().replace("[","").replace("]","").equals("NULL") | a.getAppmntRspsStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAppmntRspsStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return appointmentresponse;
	}
}
