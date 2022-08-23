package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Schedule;
public class ScheduleConversion 
{
	public org.hl7.fhir.r4.model.Schedule Schedules(Schedule s) throws ParseException
	{
		org.hl7.fhir.r4.model.Schedule schedule = new org.hl7.fhir.r4.model.Schedule();

		/******************** id ********************************************************************************/
		schedule.setId(s.getId());

		/******************** Schdl_Active ********************************************************************************/
		if(s.getSchdlActive() != null ) {

			if(s.getSchdlActive().replace("[","").replace("]","").equals("NULL") | s.getSchdlActive()==null) {} else {
			schedule.setActive(Boolean.parseBoolean(s.getSchdlActive().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Schdl_Actor ********************************************************************************/
		if(s.getSchdlActor() != null ) {

				for( String currListStrSplit : s.getSchdlActor().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			schedule.addActor(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Schdl_Comment ********************************************************************************/
		if(s.getSchdlComment() != null ) {

			if(s.getSchdlComment().replace("[","").replace("]","").equals("NULL") | s.getSchdlComment()==null) {} else {
			schedule.setComment(s.getSchdlComment().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Schdl_Id_Assigner ********************************************************************************/
		if(s.getSchdlIdAssigner() != null ) {

			String[] arrayi0 = s.getSchdlIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Schdl_Id_Prd_End ********************************************************************************/
		if(s.getSchdlIdPrdEnd() != null ) {

			String[] arrayi0 = s.getSchdlIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Schdl_Id_Prd_Strt ********************************************************************************/
		if(s.getSchdlIdPrdStrt() != null ) {

			String[] arrayi0 = s.getSchdlIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Schdl_Id_Sys ********************************************************************************/
		if(s.getSchdlIdSys() != null ) {

			String[] arrayi0 = s.getSchdlIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Schdl_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSchdlIdTypCdgCd() != null ) {

			String[] arrayi0 = s.getSchdlIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				String[] arrayi1 = s.getSchdlIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { schedule.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSchdlIdTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSchdlIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				String[] arrayi1 = s.getSchdlIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { schedule.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSchdlIdTypCdgSys() != null ) {

			String[] arrayi0 = s.getSchdlIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				String[] arrayi1 = s.getSchdlIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { schedule.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSchdlIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSchdlIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				String[] arrayi1 = s.getSchdlIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { schedule.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Schdl_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSchdlIdTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSchdlIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				String[] arrayi1 = s.getSchdlIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { schedule.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_Id_Typ_Txt ********************************************************************************/
		if(s.getSchdlIdTypTxt() != null ) {

			String[] arrayi0 = s.getSchdlIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Schdl_Id_Use ********************************************************************************/
		if(s.getSchdlIdUse() != null ) {

			String[] arrayi0 = s.getSchdlIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Schdl_Id_Vl ********************************************************************************/
		if(s.getSchdlIdVl() != null ) {

			String[] arrayi0 = s.getSchdlIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getIdentifier().size() < i0+1) { schedule.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Schdl_PlnningHorizon_End ********************************************************************************/
		if(s.getSchdlPlnningHorizonEnd() != null ) {

			if(s.getSchdlPlnningHorizonEnd().replace("[","").replace("]","").equals("NULL") | s.getSchdlPlnningHorizonEnd()==null) {} else {
			schedule.getPlanningHorizon().setEnd(s.getSchdlPlnningHorizonEnd().replace("[","").replace("]","").equals("NULL") | s.getSchdlPlnningHorizonEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSchdlPlnningHorizonEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Schdl_PlnningHorizon_Strt ********************************************************************************/
		if(s.getSchdlPlnningHorizonStrt() != null ) {

			if(s.getSchdlPlnningHorizonStrt().replace("[","").replace("]","").equals("NULL") | s.getSchdlPlnningHorizonStrt()==null) {} else {
			schedule.getPlanningHorizon().setStart(s.getSchdlPlnningHorizonStrt().replace("[","").replace("]","").equals("NULL") | s.getSchdlPlnningHorizonStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(s.getSchdlPlnningHorizonStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Schdl_SrvCtgry_Cdg_Cd ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgCd() != null ) {

			String[] arrayi0 = s.getSchdlSrvCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceCategory().size() < i0+1) { schedule.addServiceCategory(); }
				String[] arrayi1 = s.getSchdlSrvCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceCategory().get(i0).getCoding().size() < i1+1) { schedule.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_SrvCtgry_Cdg_Dsply ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgDsply() != null ) {

			String[] arrayi0 = s.getSchdlSrvCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceCategory().size() < i0+1) { schedule.addServiceCategory(); }
				String[] arrayi1 = s.getSchdlSrvCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceCategory().get(i0).getCoding().size() < i1+1) { schedule.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_SrvCtgry_Cdg_Sys ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgSys() != null ) {

			String[] arrayi0 = s.getSchdlSrvCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceCategory().size() < i0+1) { schedule.addServiceCategory(); }
				String[] arrayi1 = s.getSchdlSrvCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceCategory().get(i0).getCoding().size() < i1+1) { schedule.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_SrvCtgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSchdlSrvCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceCategory().size() < i0+1) { schedule.addServiceCategory(); }
				String[] arrayi1 = s.getSchdlSrvCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceCategory().get(i0).getCoding().size() < i1+1) { schedule.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Schdl_SrvCtgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSchdlSrvCtgryCdgVrsn() != null ) {

			String[] arrayi0 = s.getSchdlSrvCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceCategory().size() < i0+1) { schedule.addServiceCategory(); }
				String[] arrayi1 = s.getSchdlSrvCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceCategory().get(i0).getCoding().size() < i1+1) { schedule.getServiceCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_SrvCtgry_Txt ********************************************************************************/
		if(s.getSchdlSrvCtgryTxt() != null ) {

			String[] arrayi0 = s.getSchdlSrvCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceCategory().size() < i0+1) { schedule.addServiceCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getServiceCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Schdl_SrvTyp_Cdg_Cd ********************************************************************************/
		if(s.getSchdlSrvTypCdgCd() != null ) {

			String[] arrayi0 = s.getSchdlSrvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceType().size() < i0+1) { schedule.addServiceType(); }
				String[] arrayi1 = s.getSchdlSrvTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceType().get(i0).getCoding().size() < i1+1) { schedule.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_SrvTyp_Cdg_Dsply ********************************************************************************/
		if(s.getSchdlSrvTypCdgDsply() != null ) {

			String[] arrayi0 = s.getSchdlSrvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceType().size() < i0+1) { schedule.addServiceType(); }
				String[] arrayi1 = s.getSchdlSrvTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceType().get(i0).getCoding().size() < i1+1) { schedule.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_SrvTyp_Cdg_Sys ********************************************************************************/
		if(s.getSchdlSrvTypCdgSys() != null ) {

			String[] arrayi0 = s.getSchdlSrvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceType().size() < i0+1) { schedule.addServiceType(); }
				String[] arrayi1 = s.getSchdlSrvTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceType().get(i0).getCoding().size() < i1+1) { schedule.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_SrvTyp_Cdg_UsrSltd ********************************************************************************/
		if(s.getSchdlSrvTypCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSchdlSrvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceType().size() < i0+1) { schedule.addServiceType(); }
				String[] arrayi1 = s.getSchdlSrvTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceType().get(i0).getCoding().size() < i1+1) { schedule.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Schdl_SrvTyp_Cdg_Vrsn ********************************************************************************/
		if(s.getSchdlSrvTypCdgVrsn() != null ) {

			String[] arrayi0 = s.getSchdlSrvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceType().size() < i0+1) { schedule.addServiceType(); }
				String[] arrayi1 = s.getSchdlSrvTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getServiceType().get(i0).getCoding().size() < i1+1) { schedule.getServiceType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getServiceType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_SrvTyp_Txt ********************************************************************************/
		if(s.getSchdlSrvTypTxt() != null ) {

			String[] arrayi0 = s.getSchdlSrvTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getServiceType().size() < i0+1) { schedule.addServiceType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getServiceType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Schdl_Spclty_Cdg_Cd ********************************************************************************/
		if(s.getSchdlSpcltyCdgCd() != null ) {

			String[] arrayi0 = s.getSchdlSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getSpecialty().size() < i0+1) { schedule.addSpecialty(); }
				String[] arrayi1 = s.getSchdlSpcltyCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getSpecialty().get(i0).getCoding().size() < i1+1) { schedule.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getSpecialty().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_Spclty_Cdg_Dsply ********************************************************************************/
		if(s.getSchdlSpcltyCdgDsply() != null ) {

			String[] arrayi0 = s.getSchdlSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getSpecialty().size() < i0+1) { schedule.addSpecialty(); }
				String[] arrayi1 = s.getSchdlSpcltyCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getSpecialty().get(i0).getCoding().size() < i1+1) { schedule.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getSpecialty().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_Spclty_Cdg_Sys ********************************************************************************/
		if(s.getSchdlSpcltyCdgSys() != null ) {

			String[] arrayi0 = s.getSchdlSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getSpecialty().size() < i0+1) { schedule.addSpecialty(); }
				String[] arrayi1 = s.getSchdlSpcltyCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getSpecialty().get(i0).getCoding().size() < i1+1) { schedule.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getSpecialty().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_Spclty_Cdg_UsrSltd ********************************************************************************/
		if(s.getSchdlSpcltyCdgUsrSltd() != null ) {

			String[] arrayi0 = s.getSchdlSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getSpecialty().size() < i0+1) { schedule.addSpecialty(); }
				String[] arrayi1 = s.getSchdlSpcltyCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getSpecialty().get(i0).getCoding().size() < i1+1) { schedule.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getSpecialty().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Schdl_Spclty_Cdg_Vrsn ********************************************************************************/
		if(s.getSchdlSpcltyCdgVrsn() != null ) {

			String[] arrayi0 = s.getSchdlSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getSpecialty().size() < i0+1) { schedule.addSpecialty(); }
				String[] arrayi1 = s.getSchdlSpcltyCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(schedule.getSpecialty().get(i0).getCoding().size() < i1+1) { schedule.getSpecialty().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {schedule.getSpecialty().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Schdl_Spclty_Txt ********************************************************************************/
		if(s.getSchdlSpcltyTxt() != null ) {

			String[] arrayi0 = s.getSchdlSpcltyTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(schedule.getSpecialty().size() < i0+1) { schedule.addSpecialty(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {schedule.getSpecialty().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		return schedule;
	}
}
