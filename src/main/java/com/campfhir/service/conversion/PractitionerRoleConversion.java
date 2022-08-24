package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PractitionerRole;
public class PractitionerRoleConversion 
{
	public org.hl7.fhir.r4.model.PractitionerRole PractitionerRoles(PractitionerRole p) throws ParseException
	{
		org.hl7.fhir.r4.model.PractitionerRole practitionerrole = new org.hl7.fhir.r4.model.PractitionerRole();

		/******************** id ********************************************************************************/
		practitionerrole.setId(p.getId());

		/******************** PrctitnrRole_Active ********************************************************************************/
		if(p.getPrctitnrRoleActive() != null ) {

			if(p.getPrctitnrRoleActive().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrRoleActive()==null) {} else {
			practitionerrole.setActive(Boolean.parseBoolean(p.getPrctitnrRoleActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PrctitnrRole_AvailabilityExceptions ********************************************************************************/
		if(p.getPrctitnrRoleAvailabilityExceptions() != null ) {

			if(p.getPrctitnrRoleAvailabilityExceptions().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrRoleAvailabilityExceptions()==null) {} else {
			practitionerrole.setAvailabilityExceptions(p.getPrctitnrRoleAvailabilityExceptions().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PrctitnrRole_AvailableTime_AllDay ********************************************************************************/
		if(p.getPrctitnrRoleAvailableTimeAllDay() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleAvailableTimeAllDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getAvailableTime().size() < i0+1) { practitionerrole.addAvailableTime(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getAvailableTime().get(i0).setAllDay(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_AvailableTime_AvailableEndTime ********************************************************************************/
		if(p.getPrctitnrRoleAvailableTimeAvailableEndTime() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleAvailableTimeAvailableEndTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getAvailableTime().size() < i0+1) { practitionerrole.addAvailableTime(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getAvailableTime().get(i0).setAvailableEndTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PrctitnrRole_AvailableTime_AvailableStrtTime ********************************************************************************/
		if(p.getPrctitnrRoleAvailableTimeAvailableStrtTime() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleAvailableTimeAvailableStrtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getAvailableTime().size() < i0+1) { practitionerrole.addAvailableTime(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getAvailableTime().get(i0).setAvailableStartTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PrctitnrRole_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgCd() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getCode().size() < i0+1) { practitionerrole.addCode(); }
				String[] arrayi1 = p.getPrctitnrRoleCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getCode().get(i0).getCoding().size() < i1+1) { practitionerrole.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgDsply() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getCode().size() < i0+1) { practitionerrole.addCode(); }
				String[] arrayi1 = p.getPrctitnrRoleCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getCode().get(i0).getCoding().size() < i1+1) { practitionerrole.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgSys() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getCode().size() < i0+1) { practitionerrole.addCode(); }
				String[] arrayi1 = p.getPrctitnrRoleCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getCode().get(i0).getCoding().size() < i1+1) { practitionerrole.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getCode().size() < i0+1) { practitionerrole.addCode(); }
				String[] arrayi1 = p.getPrctitnrRoleCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getCode().get(i0).getCoding().size() < i1+1) { practitionerrole.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PrctitnrRole_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrRoleCdCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getCode().size() < i0+1) { practitionerrole.addCode(); }
				String[] arrayi1 = p.getPrctitnrRoleCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getCode().get(i0).getCoding().size() < i1+1) { practitionerrole.getCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Cd_Txt ********************************************************************************/
		if(p.getPrctitnrRoleCdTxt() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getCode().size() < i0+1) { practitionerrole.addCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PrctitnrRole_Endpoint ********************************************************************************/
		if(p.getPrctitnrRoleEndpoint() != null ) {

				for( String currListStrSplit : p.getPrctitnrRoleEndpoint().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			practitionerrole.addEndpoint(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** PrctitnrRole_HlthcrSrv ********************************************************************************/
		if(p.getPrctitnrRoleHlthcrSrv() != null ) {

				for( String currListStrSplit : p.getPrctitnrRoleHlthcrSrv().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			practitionerrole.addHealthcareService(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** PrctitnrRole_Id_Assigner ********************************************************************************/
		if(p.getPrctitnrRoleIdAssigner() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Id_Prd_End ********************************************************************************/
		if(p.getPrctitnrRoleIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Id_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrRoleIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Id_Sys ********************************************************************************/
		if(p.getPrctitnrRoleIdSys() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrRoleIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitionerrole.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrRoleIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitionerrole.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrRoleIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitionerrole.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrRoleIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitionerrole.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PrctitnrRole_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrRoleIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				String[] arrayi1 = p.getPrctitnrRoleIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { practitionerrole.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Id_Typ_Txt ********************************************************************************/
		if(p.getPrctitnrRoleIdTypTxt() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PrctitnrRole_Id_Use ********************************************************************************/
		if(p.getPrctitnrRoleIdUse() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Id_Vl ********************************************************************************/
		if(p.getPrctitnrRoleIdVl() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getIdentifier().size() < i0+1) { practitionerrole.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PrctitnrRole_Lctn ********************************************************************************/
		if(p.getPrctitnrRoleLctn() != null ) {

				for( String currListStrSplit : p.getPrctitnrRoleLctn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			practitionerrole.addLocation(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** PrctitnrRole_NotAvailable_Dscrptn ********************************************************************************/
		if(p.getPrctitnrRoleNotAvailableDscrptn() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleNotAvailableDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getNotAvailable().size() < i0+1) { practitionerrole.addNotAvailable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getNotAvailable().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PrctitnrRole_NotAvailable_During_End ********************************************************************************/
		if(p.getPrctitnrRoleNotAvailableDuringEnd() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleNotAvailableDuringEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getNotAvailable().size() < i0+1) { practitionerrole.addNotAvailable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getNotAvailable().get(i0).getDuring().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_NotAvailable_During_Strt ********************************************************************************/
		if(p.getPrctitnrRoleNotAvailableDuringStrt() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleNotAvailableDuringStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getNotAvailable().size() < i0+1) { practitionerrole.addNotAvailable(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getNotAvailable().get(i0).getDuring().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Orgnztn ********************************************************************************/
		if(p.getPrctitnrRoleOrgnztn() != null ) {

			if(p.getPrctitnrRoleOrgnztn().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrRoleOrgnztn()==null) {} else {
			practitionerrole.setOrganization(new org.hl7.fhir.r4.model.Reference(p.getPrctitnrRoleOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PrctitnrRole_Prd_End ********************************************************************************/
		if(p.getPrctitnrRolePrdEnd() != null ) {

			if(p.getPrctitnrRolePrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrRolePrdEnd()==null) {} else {
			practitionerrole.getPeriod().setEnd(p.getPrctitnrRolePrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrRolePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPrctitnrRolePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PrctitnrRole_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrRolePrdStrt() != null ) {

			if(p.getPrctitnrRolePrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrRolePrdStrt()==null) {} else {
			practitionerrole.getPeriod().setStart(p.getPrctitnrRolePrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrRolePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPrctitnrRolePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PrctitnrRole_Prctitnr ********************************************************************************/
		if(p.getPrctitnrRolePrctitnr() != null ) {

			if(p.getPrctitnrRolePrctitnr().replace("[","").replace("]","").equals("NULL") | p.getPrctitnrRolePrctitnr()==null) {} else {
			practitionerrole.setPractitioner(new org.hl7.fhir.r4.model.Reference(p.getPrctitnrRolePrctitnr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PrctitnrRole_Spclty_Cdg_Cd ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgCd() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getSpecialty().size() < i0+1) { practitionerrole.addSpecialty(); }
				String[] arrayi1 = p.getPrctitnrRoleSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getSpecialty().get(i0).getCoding().size() < i1+1) { practitionerrole.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getSpecialty().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Spclty_Cdg_Dsply ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgDsply() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getSpecialty().size() < i0+1) { practitionerrole.addSpecialty(); }
				String[] arrayi1 = p.getPrctitnrRoleSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getSpecialty().get(i0).getCoding().size() < i1+1) { practitionerrole.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getSpecialty().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Spclty_Cdg_Sys ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgSys() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getSpecialty().size() < i0+1) { practitionerrole.addSpecialty(); }
				String[] arrayi1 = p.getPrctitnrRoleSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getSpecialty().get(i0).getCoding().size() < i1+1) { practitionerrole.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getSpecialty().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getSpecialty().size() < i0+1) { practitionerrole.addSpecialty(); }
				String[] arrayi1 = p.getPrctitnrRoleSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getSpecialty().get(i0).getCoding().size() < i1+1) { practitionerrole.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getSpecialty().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PrctitnrRole_Spclty_Cdg_Vrsn ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyCdgVrsn() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getSpecialty().size() < i0+1) { practitionerrole.addSpecialty(); }
				String[] arrayi1 = p.getPrctitnrRoleSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(practitionerrole.getSpecialty().get(i0).getCoding().size() < i1+1) { practitionerrole.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {practitionerrole.getSpecialty().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PrctitnrRole_Spclty_Txt ********************************************************************************/
		if(p.getPrctitnrRoleSpcltyTxt() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleSpcltyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getSpecialty().size() < i0+1) { practitionerrole.addSpecialty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getSpecialty().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PrctitnrRole_Tlcm_Prd_End ********************************************************************************/
		if(p.getPrctitnrRoleTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getTelecom().size() < i0+1) { practitionerrole.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getTelecom().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPrctitnrRoleTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getTelecom().size() < i0+1) { practitionerrole.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getTelecom().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Tlcm_Rnk ********************************************************************************/
		if(p.getPrctitnrRoleTlcmRnk() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getTelecom().size() < i0+1) { practitionerrole.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getTelecom().get(i0).setRank(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Tlcm_Sys ********************************************************************************/
		if(p.getPrctitnrRoleTlcmSys() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getTelecom().size() < i0+1) { practitionerrole.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getTelecom().get(i0).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Tlcm_Use ********************************************************************************/
		if(p.getPrctitnrRoleTlcmUse() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getTelecom().size() < i0+1) { practitionerrole.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getTelecom().get(i0).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PrctitnrRole_Tlcm_Vl ********************************************************************************/
		if(p.getPrctitnrRoleTlcmVl() != null ) {

			String[] arrayi0 = p.getPrctitnrRoleTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(practitionerrole.getTelecom().size() < i0+1) { practitionerrole.addTelecom(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {practitionerrole.getTelecom().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return practitionerrole;
	}
}
