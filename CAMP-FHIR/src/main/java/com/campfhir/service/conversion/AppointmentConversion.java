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

		/******************** Appmnt_AppmntTyp_Cdg_Cd ********************************************************************************/
		if(a.getAppmntAppmntTypCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntAppmntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getAppointmentType().getCoding().size() < i0+1) { appointment.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getAppointmentType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_AppmntTyp_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntAppmntTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntAppmntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getAppointmentType().getCoding().size() < i0+1) { appointment.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getAppointmentType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_AppmntTyp_Cdg_Sys ********************************************************************************/
		if(a.getAppmntAppmntTypCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntAppmntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getAppointmentType().getCoding().size() < i0+1) { appointment.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getAppointmentType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_AppmntTyp_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntAppmntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntAppmntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getAppointmentType().getCoding().size() < i0+1) { appointment.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getAppointmentType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_AppmntTyp_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntAppmntTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntAppmntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getAppointmentType().getCoding().size() < i0+1) { appointment.getAppointmentType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getAppointmentType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_AppmntTyp_Txt ********************************************************************************/
		if(a.getAppmntAppmntTypTxt() != null ) {

			if(a.getAppmntAppmntTypTxt().replace("[","").replace("]","").equals("NULL") | a.getAppmntAppmntTypTxt()==null) {} else {
			appointment.getAppointmentType().setText(a.getAppmntAppmntTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Appmnt_BasedOn ********************************************************************************/
		if(a.getAppmntBasedOn() != null ) {

				for( String currListStrSplit : a.getAppmntBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			appointment.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Appmnt_CancelationRsn_Cdg_Cd ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntCancelationRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getCancelationReason().getCoding().size() < i0+1) { appointment.getCancelationReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getCancelationReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_CancelationRsn_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntCancelationRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getCancelationReason().getCoding().size() < i0+1) { appointment.getCancelationReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getCancelationReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_CancelationRsn_Cdg_Sys ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntCancelationRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getCancelationReason().getCoding().size() < i0+1) { appointment.getCancelationReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getCancelationReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_CancelationRsn_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntCancelationRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getCancelationReason().getCoding().size() < i0+1) { appointment.getCancelationReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getCancelationReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_CancelationRsn_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntCancelationRsnCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntCancelationRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getCancelationReason().getCoding().size() < i0+1) { appointment.getCancelationReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getCancelationReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_CancelationRsn_Txt ********************************************************************************/
		if(a.getAppmntCancelationRsnTxt() != null ) {

			if(a.getAppmntCancelationRsnTxt().replace("[","").replace("]","").equals("NULL") | a.getAppmntCancelationRsnTxt()==null) {} else {
			appointment.getCancelationReason().setText(a.getAppmntCancelationRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Appmnt_Comment ********************************************************************************/
		if(a.getAppmntComment() != null ) {

			if(a.getAppmntComment().replace("[","").replace("]","").equals("NULL") | a.getAppmntComment()==null) {} else {
			appointment.setComment(a.getAppmntComment().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Appmnt_Created ********************************************************************************/
		if(a.getAppmntCreated() != null ) {

			if(a.getAppmntCreated().replace("[","").replace("]","").equals("NULL") | a.getAppmntCreated()==null) {} else {
			appointment.setCreated(a.getAppmntCreated().replace("[","").replace("]","").equals("NULL") | a.getAppmntCreated()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAppmntCreated().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Appmnt_Dscrptn ********************************************************************************/
		if(a.getAppmntDscrptn() != null ) {

			if(a.getAppmntDscrptn().replace("[","").replace("]","").equals("NULL") | a.getAppmntDscrptn()==null) {} else {
			appointment.setDescription(a.getAppmntDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Appmnt_End ********************************************************************************/
		if(a.getAppmntEnd() != null ) {

			if(a.getAppmntEnd().replace("[","").replace("]","").equals("NULL") | a.getAppmntEnd()==null) {} else {
			appointment.setEnd(a.getAppmntEnd().replace("[","").replace("]","").equals("NULL") | a.getAppmntEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAppmntEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Appmnt_Id_Assigner ********************************************************************************/
		if(a.getAppmntIdAssigner() != null ) {

			String[] arrayi0 = a.getAppmntIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_Id_Prd_End ********************************************************************************/
		if(a.getAppmntIdPrdEnd() != null ) {

			String[] arrayi0 = a.getAppmntIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_Id_Prd_Strt ********************************************************************************/
		if(a.getAppmntIdPrdStrt() != null ) {

			String[] arrayi0 = a.getAppmntIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_Id_Sys ********************************************************************************/
		if(a.getAppmntIdSys() != null ) {

			String[] arrayi0 = a.getAppmntIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAppmntIdTypCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				String[] arrayi1 = a.getAppmntIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntIdTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				String[] arrayi1 = a.getAppmntIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAppmntIdTypCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				String[] arrayi1 = a.getAppmntIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				String[] arrayi1 = a.getAppmntIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Appmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntIdTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				String[] arrayi1 = a.getAppmntIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { appointment.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_Id_Typ_Txt ********************************************************************************/
		if(a.getAppmntIdTypTxt() != null ) {

			String[] arrayi0 = a.getAppmntIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_Id_Use ********************************************************************************/
		if(a.getAppmntIdUse() != null ) {

			String[] arrayi0 = a.getAppmntIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_Id_Vl ********************************************************************************/
		if(a.getAppmntIdVl() != null ) {

			String[] arrayi0 = a.getAppmntIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getIdentifier().size() < i0+1) { appointment.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_MinutesDuration ********************************************************************************/
		if(a.getAppmntMinutesDuration() != null ) {

			if(a.getAppmntMinutesDuration().replace("[","").replace("]","").equals("NULL") | a.getAppmntMinutesDuration()==null) {} else {
			appointment.setMinutesDuration(Integer.parseInt(a.getAppmntMinutesDuration().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Appmnt_Prtcpnt_Actor ********************************************************************************/
		if(a.getAppmntPrtcpntActor() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntActor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getParticipant().get(i0).setActor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_Prtcpnt_Prd_End ********************************************************************************/
		if(a.getAppmntPrtcpntPrdEnd() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getParticipant().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_Prtcpnt_Prd_Strt ********************************************************************************/
		if(a.getAppmntPrtcpntPrdStrt() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getParticipant().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_Prtcpnt_Required ********************************************************************************/
		if(a.getAppmntPrtcpntRequired() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntRequired().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getParticipant().get(i0).setRequired(new org.hl7.fhir.r4.model.Appointment.ParticipantRequiredEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_Prtcpnt_Sts ********************************************************************************/
		if(a.getAppmntPrtcpntSts() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntSts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getParticipant().get(i0).setStatus(new org.hl7.fhir.r4.model.Appointment.ParticipationStatusEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				String[] arrayi1 = a.getAppmntPrtcpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getParticipant().get(i0).getType().size() < i1+1) { appointment.getParticipant().get(i0).addType(); }
					String[] arrayi2 = a.getAppmntPrtcpntTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(appointment.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { appointment.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {appointment.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				String[] arrayi1 = a.getAppmntPrtcpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getParticipant().get(i0).getType().size() < i1+1) { appointment.getParticipant().get(i0).addType(); }
					String[] arrayi2 = a.getAppmntPrtcpntTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(appointment.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { appointment.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {appointment.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				String[] arrayi1 = a.getAppmntPrtcpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getParticipant().get(i0).getType().size() < i1+1) { appointment.getParticipant().get(i0).addType(); }
					String[] arrayi2 = a.getAppmntPrtcpntTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(appointment.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { appointment.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {appointment.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				String[] arrayi1 = a.getAppmntPrtcpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getParticipant().get(i0).getType().size() < i1+1) { appointment.getParticipant().get(i0).addType(); }
					String[] arrayi2 = a.getAppmntPrtcpntTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(appointment.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { appointment.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {appointment.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** Appmnt_Prtcpnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntPrtcpntTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				String[] arrayi1 = a.getAppmntPrtcpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getParticipant().get(i0).getType().size() < i1+1) { appointment.getParticipant().get(i0).addType(); }
					String[] arrayi2 = a.getAppmntPrtcpntTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(appointment.getParticipant().get(i0).getType().get(i1).getCoding().size() < i2+1) { appointment.getParticipant().get(i0).getType().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {appointment.getParticipant().get(i0).getType().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** Appmnt_Prtcpnt_Typ_Txt ********************************************************************************/
		if(a.getAppmntPrtcpntTypTxt() != null ) {

			String[] arrayi0 = a.getAppmntPrtcpntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getParticipant().size() < i0+1) { appointment.addParticipant(); }
				String[] arrayi1 = a.getAppmntPrtcpntTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getParticipant().get(i0).getType().size() < i1+1) { appointment.getParticipant().get(i0).addType(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getParticipant().get(i0).getType().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_PntInstrctn ********************************************************************************/
		if(a.getAppmntPntInstrctn() != null ) {

			if(a.getAppmntPntInstrctn().replace("[","").replace("]","").equals("NULL") | a.getAppmntPntInstrctn()==null) {} else {
			appointment.setPatientInstruction(a.getAppmntPntInstrctn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Appmnt_Priority ********************************************************************************/
		if(a.getAppmntPriority() != null ) {

			if(a.getAppmntPriority().replace("[","").replace("]","").equals("NULL") | a.getAppmntPriority()==null) {} else {
			appointment.setPriority(Integer.parseInt(a.getAppmntPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Appmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(a.getAppmntRsnCdCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getReasonCode().size() < i0+1) { appointment.addReasonCode(); }
				String[] arrayi1 = a.getAppmntRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getReasonCode().get(i0).getCoding().size() < i1+1) { appointment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntRsnCdCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getReasonCode().size() < i0+1) { appointment.addReasonCode(); }
				String[] arrayi1 = a.getAppmntRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getReasonCode().get(i0).getCoding().size() < i1+1) { appointment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(a.getAppmntRsnCdCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getReasonCode().size() < i0+1) { appointment.addReasonCode(); }
				String[] arrayi1 = a.getAppmntRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getReasonCode().get(i0).getCoding().size() < i1+1) { appointment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getReasonCode().size() < i0+1) { appointment.addReasonCode(); }
				String[] arrayi1 = a.getAppmntRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getReasonCode().get(i0).getCoding().size() < i1+1) { appointment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Appmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getReasonCode().size() < i0+1) { appointment.addReasonCode(); }
				String[] arrayi1 = a.getAppmntRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getReasonCode().get(i0).getCoding().size() < i1+1) { appointment.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_RsnCd_Txt ********************************************************************************/
		if(a.getAppmntRsnCdTxt() != null ) {

			String[] arrayi0 = a.getAppmntRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getReasonCode().size() < i0+1) { appointment.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_RsnRfrnc ********************************************************************************/
		if(a.getAppmntRsnRfrnc() != null ) {

				for( String currListStrSplit : a.getAppmntRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			appointment.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Appmnt_RqstedPrd_End ********************************************************************************/
		if(a.getAppmntRqstedPrdEnd() != null ) {

			String[] arrayi0 = a.getAppmntRqstedPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getRequestedPeriod().size() < i0+1) { appointment.addRequestedPeriod(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getRequestedPeriod().get(i0).setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_RqstedPrd_Strt ********************************************************************************/
		if(a.getAppmntRqstedPrdStrt() != null ) {

			String[] arrayi0 = a.getAppmntRqstedPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getRequestedPeriod().size() < i0+1) { appointment.addRequestedPeriod(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getRequestedPeriod().get(i0).setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Appmnt_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntSrvCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceCategory().size() < i0+1) { appointment.addServiceCategory(); }
				String[] arrayi1 = a.getAppmntSrvCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceCategory().get(i0).getCoding().size() < i1+1) { appointment.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntSrvCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceCategory().size() < i0+1) { appointment.addServiceCategory(); }
				String[] arrayi1 = a.getAppmntSrvCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceCategory().get(i0).getCoding().size() < i1+1) { appointment.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntSrvCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceCategory().size() < i0+1) { appointment.addServiceCategory(); }
				String[] arrayi1 = a.getAppmntSrvCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceCategory().get(i0).getCoding().size() < i1+1) { appointment.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntSrvCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceCategory().size() < i0+1) { appointment.addServiceCategory(); }
				String[] arrayi1 = a.getAppmntSrvCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceCategory().get(i0).getCoding().size() < i1+1) { appointment.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Appmnt_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntSrvCtgryCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntSrvCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceCategory().size() < i0+1) { appointment.addServiceCategory(); }
				String[] arrayi1 = a.getAppmntSrvCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceCategory().get(i0).getCoding().size() < i1+1) { appointment.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_SrvCtgry_Txt ********************************************************************************/
		if(a.getAppmntSrvCtgryTxt() != null ) {

			String[] arrayi0 = a.getAppmntSrvCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceCategory().size() < i0+1) { appointment.addServiceCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getServiceCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_SrvTyp_Cdg_Cd ********************************************************************************/
		if(a.getAppmntSrvTypCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntSrvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceType().size() < i0+1) { appointment.addServiceType(); }
				String[] arrayi1 = a.getAppmntSrvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceType().get(i0).getCoding().size() < i1+1) { appointment.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntSrvTypCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntSrvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceType().size() < i0+1) { appointment.addServiceType(); }
				String[] arrayi1 = a.getAppmntSrvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceType().get(i0).getCoding().size() < i1+1) { appointment.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_SrvTyp_Cdg_Sys ********************************************************************************/
		if(a.getAppmntSrvTypCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntSrvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceType().size() < i0+1) { appointment.addServiceType(); }
				String[] arrayi1 = a.getAppmntSrvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceType().get(i0).getCoding().size() < i1+1) { appointment.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntSrvTypCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntSrvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceType().size() < i0+1) { appointment.addServiceType(); }
				String[] arrayi1 = a.getAppmntSrvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceType().get(i0).getCoding().size() < i1+1) { appointment.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Appmnt_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntSrvTypCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntSrvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceType().size() < i0+1) { appointment.addServiceType(); }
				String[] arrayi1 = a.getAppmntSrvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getServiceType().get(i0).getCoding().size() < i1+1) { appointment.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getServiceType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_SrvTyp_Txt ********************************************************************************/
		if(a.getAppmntSrvTypTxt() != null ) {

			String[] arrayi0 = a.getAppmntSrvTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getServiceType().size() < i0+1) { appointment.addServiceType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getServiceType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_Slot ********************************************************************************/
		if(a.getAppmntSlot() != null ) {

				for( String currListStrSplit : a.getAppmntSlot().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			appointment.addSlot(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Appmnt_Spclty_Cdg_Cd ********************************************************************************/
		if(a.getAppmntSpcltyCdgCd() != null ) {

			String[] arrayi0 = a.getAppmntSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getSpecialty().size() < i0+1) { appointment.addSpecialty(); }
				String[] arrayi1 = a.getAppmntSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getSpecialty().get(i0).getCoding().size() < i1+1) { appointment.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getSpecialty().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_Spclty_Cdg_Dsply ********************************************************************************/
		if(a.getAppmntSpcltyCdgDsply() != null ) {

			String[] arrayi0 = a.getAppmntSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getSpecialty().size() < i0+1) { appointment.addSpecialty(); }
				String[] arrayi1 = a.getAppmntSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getSpecialty().get(i0).getCoding().size() < i1+1) { appointment.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getSpecialty().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_Spclty_Cdg_Sys ********************************************************************************/
		if(a.getAppmntSpcltyCdgSys() != null ) {

			String[] arrayi0 = a.getAppmntSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getSpecialty().size() < i0+1) { appointment.addSpecialty(); }
				String[] arrayi1 = a.getAppmntSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getSpecialty().get(i0).getCoding().size() < i1+1) { appointment.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getSpecialty().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(a.getAppmntSpcltyCdgUsrSltd() != null ) {

			String[] arrayi0 = a.getAppmntSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getSpecialty().size() < i0+1) { appointment.addSpecialty(); }
				String[] arrayi1 = a.getAppmntSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getSpecialty().get(i0).getCoding().size() < i1+1) { appointment.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getSpecialty().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Appmnt_Spclty_Cdg_Vrsn ********************************************************************************/
		if(a.getAppmntSpcltyCdgVrsn() != null ) {

			String[] arrayi0 = a.getAppmntSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getSpecialty().size() < i0+1) { appointment.addSpecialty(); }
				String[] arrayi1 = a.getAppmntSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(appointment.getSpecialty().get(i0).getCoding().size() < i1+1) { appointment.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {appointment.getSpecialty().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Appmnt_Spclty_Txt ********************************************************************************/
		if(a.getAppmntSpcltyTxt() != null ) {

			String[] arrayi0 = a.getAppmntSpcltyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(appointment.getSpecialty().size() < i0+1) { appointment.addSpecialty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {appointment.getSpecialty().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Appmnt_Strt ********************************************************************************/
		if(a.getAppmntStrt() != null ) {

			if(a.getAppmntStrt().replace("[","").replace("]","").equals("NULL") | a.getAppmntStrt()==null) {} else {
			appointment.setStart(a.getAppmntStrt().replace("[","").replace("]","").equals("NULL") | a.getAppmntStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(a.getAppmntStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Appmnt_Sts ********************************************************************************/
		if(a.getAppmntSts() != null ) {

			if(a.getAppmntSts().replace("[","").replace("]","").equals("NULL") | a.getAppmntSts()==null) {} else {
			appointment.setStatus(new org.hl7.fhir.r4.model.Appointment.AppointmentStatusEnumFactory().fromCode(a.getAppmntSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Appmnt_SprtingInfo ********************************************************************************/
		if(a.getAppmntSprtingInfo() != null ) {

				for( String currListStrSplit : a.getAppmntSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			appointment.addSupportingInformation(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return appointment;
	}
}
