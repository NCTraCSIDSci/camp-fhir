package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Task;
public class TaskConversion 
{
	public org.hl7.fhir.r4.model.Task Tasks(Task t) throws ParseException
	{
		org.hl7.fhir.r4.model.Task task = new org.hl7.fhir.r4.model.Task();

		/******************** id ********************************************************************************/
		task.setId(t.getId());

		/******************** Task_AthredOn ********************************************************************************/
		if(t.getTaskAthredOn() != null ) {

			if(t.getTaskAthredOn().replace("[","").replace("]","").equals("NULL") | t.getTaskAthredOn()==null) {} else {
			task.setAuthoredOn(t.getTaskAthredOn().replace("[","").replace("]","").equals("NULL") | t.getTaskAthredOn()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTaskAthredOn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_BasedOn ********************************************************************************/
		if(t.getTaskBasedOn() != null ) {

				for( String currListStrSplit : t.getTaskBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			task.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Task_BusinessSts_Cdg_Cd ********************************************************************************/
		if(t.getTaskBusinessStsCdgCd() != null ) {

			String[] arrayi0 = t.getTaskBusinessStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getBusinessStatus().getCoding().size() < i0+1) { task.getBusinessStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getBusinessStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_BusinessSts_Cdg_Dsply ********************************************************************************/
		if(t.getTaskBusinessStsCdgDsply() != null ) {

			String[] arrayi0 = t.getTaskBusinessStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getBusinessStatus().getCoding().size() < i0+1) { task.getBusinessStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getBusinessStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_BusinessSts_Cdg_Sys ********************************************************************************/
		if(t.getTaskBusinessStsCdgSys() != null ) {

			String[] arrayi0 = t.getTaskBusinessStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getBusinessStatus().getCoding().size() < i0+1) { task.getBusinessStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getBusinessStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_BusinessSts_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskBusinessStsCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTaskBusinessStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getBusinessStatus().getCoding().size() < i0+1) { task.getBusinessStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getBusinessStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_BusinessSts_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskBusinessStsCdgVrsn() != null ) {

			String[] arrayi0 = t.getTaskBusinessStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getBusinessStatus().getCoding().size() < i0+1) { task.getBusinessStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getBusinessStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_BusinessSts_Txt ********************************************************************************/
		if(t.getTaskBusinessStsTxt() != null ) {

			if(t.getTaskBusinessStsTxt().replace("[","").replace("]","").equals("NULL") | t.getTaskBusinessStsTxt()==null) {} else {
			task.getBusinessStatus().setText(t.getTaskBusinessStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Task_Cd_Cdg_Cd ********************************************************************************/
		if(t.getTaskCdCdgCd() != null ) {

			String[] arrayi0 = t.getTaskCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getCode().getCoding().size() < i0+1) { task.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Cd_Cdg_Dsply ********************************************************************************/
		if(t.getTaskCdCdgDsply() != null ) {

			String[] arrayi0 = t.getTaskCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getCode().getCoding().size() < i0+1) { task.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Cd_Cdg_Sys ********************************************************************************/
		if(t.getTaskCdCdgSys() != null ) {

			String[] arrayi0 = t.getTaskCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getCode().getCoding().size() < i0+1) { task.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Cd_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskCdCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTaskCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getCode().getCoding().size() < i0+1) { task.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_Cd_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskCdCdgVrsn() != null ) {

			String[] arrayi0 = t.getTaskCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getCode().getCoding().size() < i0+1) { task.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Cd_Txt ********************************************************************************/
		if(t.getTaskCdTxt() != null ) {

			if(t.getTaskCdTxt().replace("[","").replace("]","").equals("NULL") | t.getTaskCdTxt()==null) {} else {
			task.getCode().setText(t.getTaskCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Task_Dscrptn ********************************************************************************/
		if(t.getTaskDscrptn() != null ) {

			if(t.getTaskDscrptn().replace("[","").replace("]","").equals("NULL") | t.getTaskDscrptn()==null) {} else {
			task.setDescription(t.getTaskDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Task_Enc ********************************************************************************/
		if(t.getTaskEnc() != null ) {

			if(t.getTaskEnc().replace("[","").replace("]","").equals("NULL") | t.getTaskEnc()==null) {} else {
			task.setEncounter(new org.hl7.fhir.r4.model.Reference(t.getTaskEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_ExecutionPrd_End ********************************************************************************/
		if(t.getTaskExecutionPrdEnd() != null ) {

			if(t.getTaskExecutionPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTaskExecutionPrdEnd()==null) {} else {
			task.getExecutionPeriod().setEnd(t.getTaskExecutionPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTaskExecutionPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTaskExecutionPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_ExecutionPrd_Strt ********************************************************************************/
		if(t.getTaskExecutionPrdStrt() != null ) {

			if(t.getTaskExecutionPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTaskExecutionPrdStrt()==null) {} else {
			task.getExecutionPeriod().setStart(t.getTaskExecutionPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTaskExecutionPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTaskExecutionPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_Focus ********************************************************************************/
		if(t.getTaskFocus() != null ) {

			if(t.getTaskFocus().replace("[","").replace("]","").equals("NULL") | t.getTaskFocus()==null) {} else {
			task.setFocus(new org.hl7.fhir.r4.model.Reference(t.getTaskFocus().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_For ********************************************************************************/
		if(t.getTaskFor() != null ) {

			if(t.getTaskFor().replace("[","").replace("]","").equals("NULL") | t.getTaskFor()==null) {} else {
			task.setFor(new org.hl7.fhir.r4.model.Reference(t.getTaskFor().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_GrpId_Assigner ********************************************************************************/
		if(t.getTaskGrpIdAssigner() != null ) {

			if(t.getTaskGrpIdAssigner().replace("[","").replace("]","").equals("NULL") | t.getTaskGrpIdAssigner()==null) {} else {
			task.getGroupIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(t.getTaskGrpIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_GrpId_Prd_End ********************************************************************************/
		if(t.getTaskGrpIdPrdEnd() != null ) {

			if(t.getTaskGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTaskGrpIdPrdEnd()==null) {} else {
			task.getGroupIdentifier().getPeriod().setEnd(t.getTaskGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTaskGrpIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTaskGrpIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_GrpId_Prd_Strt ********************************************************************************/
		if(t.getTaskGrpIdPrdStrt() != null ) {

			if(t.getTaskGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTaskGrpIdPrdStrt()==null) {} else {
			task.getGroupIdentifier().getPeriod().setStart(t.getTaskGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTaskGrpIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTaskGrpIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_GrpId_Sys ********************************************************************************/
		if(t.getTaskGrpIdSys() != null ) {

			if(t.getTaskGrpIdSys().replace("[","").replace("]","").equals("NULL") | t.getTaskGrpIdSys()==null) {} else {
			task.getGroupIdentifier().setSystem(t.getTaskGrpIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Task_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTaskGrpIdTypCdgCd() != null ) {

			String[] arrayi0 = t.getTaskGrpIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getGroupIdentifier().getType().getCoding().size() < i0+1) { task.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getGroupIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTaskGrpIdTypCdgDsply() != null ) {

			String[] arrayi0 = t.getTaskGrpIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getGroupIdentifier().getType().getCoding().size() < i0+1) { task.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getGroupIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTaskGrpIdTypCdgSys() != null ) {

			String[] arrayi0 = t.getTaskGrpIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getGroupIdentifier().getType().getCoding().size() < i0+1) { task.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getGroupIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskGrpIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTaskGrpIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getGroupIdentifier().getType().getCoding().size() < i0+1) { task.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getGroupIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskGrpIdTypCdgVrsn() != null ) {

			String[] arrayi0 = t.getTaskGrpIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getGroupIdentifier().getType().getCoding().size() < i0+1) { task.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getGroupIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_GrpId_Typ_Txt ********************************************************************************/
		if(t.getTaskGrpIdTypTxt() != null ) {

			if(t.getTaskGrpIdTypTxt().replace("[","").replace("]","").equals("NULL") | t.getTaskGrpIdTypTxt()==null) {} else {
			task.getGroupIdentifier().getType().setText(t.getTaskGrpIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Task_GrpId_Use ********************************************************************************/
		if(t.getTaskGrpIdUse() != null ) {

			if(t.getTaskGrpIdUse().replace("[","").replace("]","").equals("NULL") | t.getTaskGrpIdUse()==null) {} else {
			task.getGroupIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(t.getTaskGrpIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_GrpId_Vl ********************************************************************************/
		if(t.getTaskGrpIdVl() != null ) {

			if(t.getTaskGrpIdVl().replace("[","").replace("]","").equals("NULL") | t.getTaskGrpIdVl()==null) {} else {
			task.getGroupIdentifier().setValue(t.getTaskGrpIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Task_Id_Assigner ********************************************************************************/
		if(t.getTaskIdAssigner() != null ) {

			String[] arrayi0 = t.getTaskIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_Id_Prd_End ********************************************************************************/
		if(t.getTaskIdPrdEnd() != null ) {

			String[] arrayi0 = t.getTaskIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_Id_Prd_Strt ********************************************************************************/
		if(t.getTaskIdPrdStrt() != null ) {

			String[] arrayi0 = t.getTaskIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_Id_Sys ********************************************************************************/
		if(t.getTaskIdSys() != null ) {

			String[] arrayi0 = t.getTaskIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Id_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTaskIdTypCdgCd() != null ) {

			String[] arrayi0 = t.getTaskIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				String[] arrayi1 = t.getTaskIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { task.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTaskIdTypCdgDsply() != null ) {

			String[] arrayi0 = t.getTaskIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				String[] arrayi1 = t.getTaskIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { task.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Id_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTaskIdTypCdgSys() != null ) {

			String[] arrayi0 = t.getTaskIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				String[] arrayi1 = t.getTaskIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { task.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTaskIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				String[] arrayi1 = t.getTaskIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { task.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Task_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskIdTypCdgVrsn() != null ) {

			String[] arrayi0 = t.getTaskIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				String[] arrayi1 = t.getTaskIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { task.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Id_Typ_Txt ********************************************************************************/
		if(t.getTaskIdTypTxt() != null ) {

			String[] arrayi0 = t.getTaskIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Id_Use ********************************************************************************/
		if(t.getTaskIdUse() != null ) {

			String[] arrayi0 = t.getTaskIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_Id_Vl ********************************************************************************/
		if(t.getTaskIdVl() != null ) {

			String[] arrayi0 = t.getTaskIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getIdentifier().size() < i0+1) { task.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Input_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTaskInputTypCdgCd() != null ) {

			String[] arrayi0 = t.getTaskInputTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getInput().size() < i0+1) { task.addInput(); }
				String[] arrayi1 = t.getTaskInputTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getInput().get(i0).getType().getCoding().size() < i1+1) { task.getInput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getInput().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Input_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTaskInputTypCdgDsply() != null ) {

			String[] arrayi0 = t.getTaskInputTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getInput().size() < i0+1) { task.addInput(); }
				String[] arrayi1 = t.getTaskInputTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getInput().get(i0).getType().getCoding().size() < i1+1) { task.getInput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getInput().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Input_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTaskInputTypCdgSys() != null ) {

			String[] arrayi0 = t.getTaskInputTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getInput().size() < i0+1) { task.addInput(); }
				String[] arrayi1 = t.getTaskInputTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getInput().get(i0).getType().getCoding().size() < i1+1) { task.getInput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getInput().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Input_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskInputTypCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTaskInputTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getInput().size() < i0+1) { task.addInput(); }
				String[] arrayi1 = t.getTaskInputTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getInput().get(i0).getType().getCoding().size() < i1+1) { task.getInput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getInput().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Task_Input_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskInputTypCdgVrsn() != null ) {

			String[] arrayi0 = t.getTaskInputTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getInput().size() < i0+1) { task.addInput(); }
				String[] arrayi1 = t.getTaskInputTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getInput().get(i0).getType().getCoding().size() < i1+1) { task.getInput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getInput().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Input_Typ_Txt ********************************************************************************/
		if(t.getTaskInputTypTxt() != null ) {

			String[] arrayi0 = t.getTaskInputTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getInput().size() < i0+1) { task.addInput(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getInput().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_InstantiatesCanonical ********************************************************************************/
		if(t.getTaskInstantiatesCanonical() != null ) {

			if(t.getTaskInstantiatesCanonical().replace("[","").replace("]","").equals("NULL") | t.getTaskInstantiatesCanonical()==null) {} else {
			task.setInstantiatesCanonical(t.getTaskInstantiatesCanonical().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Task_InstantiatesUri ********************************************************************************/
		if(t.getTaskInstantiatesUri() != null ) {

			if(t.getTaskInstantiatesUri().replace("[","").replace("]","").equals("NULL") | t.getTaskInstantiatesUri()==null) {} else {
			task.setInstantiatesUri(t.getTaskInstantiatesUri().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Task_Insrnc ********************************************************************************/
		if(t.getTaskInsrnc() != null ) {

				for( String currListStrSplit : t.getTaskInsrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			task.addInsurance(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Task_Intent ********************************************************************************/
		if(t.getTaskIntent() != null ) {

			if(t.getTaskIntent().replace("[","").replace("]","").equals("NULL") | t.getTaskIntent()==null) {} else {
			task.setIntent(new org.hl7.fhir.r4.model.Task.TaskIntentEnumFactory().fromCode(t.getTaskIntent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_LastModified ********************************************************************************/
		if(t.getTaskLastModified() != null ) {

			if(t.getTaskLastModified().replace("[","").replace("]","").equals("NULL") | t.getTaskLastModified()==null) {} else {
			task.setLastModified(t.getTaskLastModified().replace("[","").replace("]","").equals("NULL") | t.getTaskLastModified()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTaskLastModified().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_Lctn ********************************************************************************/
		if(t.getTaskLctn() != null ) {

			if(t.getTaskLctn().replace("[","").replace("]","").equals("NULL") | t.getTaskLctn()==null) {} else {
			task.setLocation(new org.hl7.fhir.r4.model.Reference(t.getTaskLctn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_Nt_AthrRfrnc ********************************************************************************/
		if(t.getTaskNtAthrRfrnc() != null ) {

			String[] arrayi0 = t.getTaskNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getNote().size() < i0+1) { task.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_Nt_AthrStrgTyp ********************************************************************************/
		if(t.getTaskNtAthrStrgTyp() != null ) {

			String[] arrayi0 = t.getTaskNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getNote().size() < i0+1) { task.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_Nt_Txt ********************************************************************************/
		if(t.getTaskNtTxt() != null ) {

			String[] arrayi0 = t.getTaskNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getNote().size() < i0+1) { task.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Nt_Time ********************************************************************************/
		if(t.getTaskNtTime() != null ) {

			String[] arrayi0 = t.getTaskNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getNote().size() < i0+1) { task.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_Output_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTaskOutputTypCdgCd() != null ) {

			String[] arrayi0 = t.getTaskOutputTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getOutput().size() < i0+1) { task.addOutput(); }
				String[] arrayi1 = t.getTaskOutputTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getOutput().get(i0).getType().getCoding().size() < i1+1) { task.getOutput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getOutput().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Output_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTaskOutputTypCdgDsply() != null ) {

			String[] arrayi0 = t.getTaskOutputTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getOutput().size() < i0+1) { task.addOutput(); }
				String[] arrayi1 = t.getTaskOutputTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getOutput().get(i0).getType().getCoding().size() < i1+1) { task.getOutput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getOutput().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Output_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTaskOutputTypCdgSys() != null ) {

			String[] arrayi0 = t.getTaskOutputTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getOutput().size() < i0+1) { task.addOutput(); }
				String[] arrayi1 = t.getTaskOutputTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getOutput().get(i0).getType().getCoding().size() < i1+1) { task.getOutput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getOutput().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Output_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskOutputTypCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTaskOutputTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getOutput().size() < i0+1) { task.addOutput(); }
				String[] arrayi1 = t.getTaskOutputTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getOutput().get(i0).getType().getCoding().size() < i1+1) { task.getOutput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getOutput().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Task_Output_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskOutputTypCdgVrsn() != null ) {

			String[] arrayi0 = t.getTaskOutputTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getOutput().size() < i0+1) { task.addOutput(); }
				String[] arrayi1 = t.getTaskOutputTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getOutput().get(i0).getType().getCoding().size() < i1+1) { task.getOutput().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getOutput().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_Output_Typ_Txt ********************************************************************************/
		if(t.getTaskOutputTypTxt() != null ) {

			String[] arrayi0 = t.getTaskOutputTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getOutput().size() < i0+1) { task.addOutput(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getOutput().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Owner ********************************************************************************/
		if(t.getTaskOwner() != null ) {

			if(t.getTaskOwner().replace("[","").replace("]","").equals("NULL") | t.getTaskOwner()==null) {} else {
			task.setOwner(new org.hl7.fhir.r4.model.Reference(t.getTaskOwner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_PartOf ********************************************************************************/
		if(t.getTaskPartOf() != null ) {

				for( String currListStrSplit : t.getTaskPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			task.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Task_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgCd() != null ) {

			String[] arrayi0 = t.getTaskPrfrmrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getPerformerType().size() < i0+1) { task.addPerformerType(); }
				String[] arrayi1 = t.getTaskPrfrmrTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getPerformerType().get(i0).getCoding().size() < i1+1) { task.getPerformerType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getPerformerType().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgDsply() != null ) {

			String[] arrayi0 = t.getTaskPrfrmrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getPerformerType().size() < i0+1) { task.addPerformerType(); }
				String[] arrayi1 = t.getTaskPrfrmrTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getPerformerType().get(i0).getCoding().size() < i1+1) { task.getPerformerType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getPerformerType().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgSys() != null ) {

			String[] arrayi0 = t.getTaskPrfrmrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getPerformerType().size() < i0+1) { task.addPerformerType(); }
				String[] arrayi1 = t.getTaskPrfrmrTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getPerformerType().get(i0).getCoding().size() < i1+1) { task.getPerformerType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getPerformerType().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTaskPrfrmrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getPerformerType().size() < i0+1) { task.addPerformerType(); }
				String[] arrayi1 = t.getTaskPrfrmrTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getPerformerType().get(i0).getCoding().size() < i1+1) { task.getPerformerType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getPerformerType().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Task_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgVrsn() != null ) {

			String[] arrayi0 = t.getTaskPrfrmrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getPerformerType().size() < i0+1) { task.addPerformerType(); }
				String[] arrayi1 = t.getTaskPrfrmrTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(task.getPerformerType().get(i0).getCoding().size() < i1+1) { task.getPerformerType().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {task.getPerformerType().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Task_PrfrmrTyp_Txt ********************************************************************************/
		if(t.getTaskPrfrmrTypTxt() != null ) {

			String[] arrayi0 = t.getTaskPrfrmrTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getPerformerType().size() < i0+1) { task.addPerformerType(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getPerformerType().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_Priority ********************************************************************************/
		if(t.getTaskPriority() != null ) {

			if(t.getTaskPriority().replace("[","").replace("]","").equals("NULL") | t.getTaskPriority()==null) {} else {
			task.setPriority(new org.hl7.fhir.r4.model.Task.TaskPriorityEnumFactory().fromCode(t.getTaskPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_RsnCd_Cdg_Cd ********************************************************************************/
		if(t.getTaskRsnCdCdgCd() != null ) {

			String[] arrayi0 = t.getTaskRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getReasonCode().getCoding().size() < i0+1) { task.getReasonCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getReasonCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_RsnCd_Cdg_Dsply ********************************************************************************/
		if(t.getTaskRsnCdCdgDsply() != null ) {

			String[] arrayi0 = t.getTaskRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getReasonCode().getCoding().size() < i0+1) { task.getReasonCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getReasonCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_RsnCd_Cdg_Sys ********************************************************************************/
		if(t.getTaskRsnCdCdgSys() != null ) {

			String[] arrayi0 = t.getTaskRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getReasonCode().getCoding().size() < i0+1) { task.getReasonCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getReasonCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTaskRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getReasonCode().getCoding().size() < i0+1) { task.getReasonCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getReasonCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = t.getTaskRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getReasonCode().getCoding().size() < i0+1) { task.getReasonCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getReasonCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_RsnCd_Txt ********************************************************************************/
		if(t.getTaskRsnCdTxt() != null ) {

			if(t.getTaskRsnCdTxt().replace("[","").replace("]","").equals("NULL") | t.getTaskRsnCdTxt()==null) {} else {
			task.getReasonCode().setText(t.getTaskRsnCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Task_RsnRfrnc ********************************************************************************/
		if(t.getTaskRsnRfrnc() != null ) {

			if(t.getTaskRsnRfrnc().replace("[","").replace("]","").equals("NULL") | t.getTaskRsnRfrnc()==null) {} else {
			task.setReasonReference(new org.hl7.fhir.r4.model.Reference(t.getTaskRsnRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_RelevantHis ********************************************************************************/
		if(t.getTaskRelevantHis() != null ) {

				for( String currListStrSplit : t.getTaskRelevantHis().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			task.addRelevantHistory(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Task_Rqster ********************************************************************************/
		if(t.getTaskRqster() != null ) {

			if(t.getTaskRqster().replace("[","").replace("]","").equals("NULL") | t.getTaskRqster()==null) {} else {
			task.setRequester(new org.hl7.fhir.r4.model.Reference(t.getTaskRqster().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_Restriction_Prd_End ********************************************************************************/
		if(t.getTaskRestrictionPrdEnd() != null ) {

			if(t.getTaskRestrictionPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTaskRestrictionPrdEnd()==null) {} else {
			task.getRestriction().getPeriod().setEnd(t.getTaskRestrictionPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTaskRestrictionPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTaskRestrictionPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_Restriction_Prd_Strt ********************************************************************************/
		if(t.getTaskRestrictionPrdStrt() != null ) {

			if(t.getTaskRestrictionPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTaskRestrictionPrdStrt()==null) {} else {
			task.getRestriction().getPeriod().setStart(t.getTaskRestrictionPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTaskRestrictionPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTaskRestrictionPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_Restriction_Recipient ********************************************************************************/
		if(t.getTaskRestrictionRecipient() != null ) {

				for( String currListStrSplit : t.getTaskRestrictionRecipient().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			task.getRestriction().addRecipient(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Task_Restriction_Repetitions ********************************************************************************/
		if(t.getTaskRestrictionRepetitions() != null ) {

			if(t.getTaskRestrictionRepetitions().replace("[","").replace("]","").equals("NULL") | t.getTaskRestrictionRepetitions()==null) {} else {
			task.getRestriction().setRepetitions(Integer.parseInt(t.getTaskRestrictionRepetitions().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_Sts ********************************************************************************/
		if(t.getTaskSts() != null ) {

			if(t.getTaskSts().replace("[","").replace("]","").equals("NULL") | t.getTaskSts()==null) {} else {
			task.setStatus(new org.hl7.fhir.r4.model.Task.TaskStatusEnumFactory().fromCode(t.getTaskSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Task_StsRsn_Cdg_Cd ********************************************************************************/
		if(t.getTaskStsRsnCdgCd() != null ) {

			String[] arrayi0 = t.getTaskStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getStatusReason().getCoding().size() < i0+1) { task.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getStatusReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_StsRsn_Cdg_Dsply ********************************************************************************/
		if(t.getTaskStsRsnCdgDsply() != null ) {

			String[] arrayi0 = t.getTaskStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getStatusReason().getCoding().size() < i0+1) { task.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getStatusReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_StsRsn_Cdg_Sys ********************************************************************************/
		if(t.getTaskStsRsnCdgSys() != null ) {

			String[] arrayi0 = t.getTaskStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getStatusReason().getCoding().size() < i0+1) { task.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getStatusReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTaskStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getStatusReason().getCoding().size() < i0+1) { task.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getStatusReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Task_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = t.getTaskStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(task.getStatusReason().getCoding().size() < i0+1) { task.getStatusReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {task.getStatusReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Task_StsRsn_Txt ********************************************************************************/
		if(t.getTaskStsRsnTxt() != null ) {

			if(t.getTaskStsRsnTxt().replace("[","").replace("]","").equals("NULL") | t.getTaskStsRsnTxt()==null) {} else {
			task.getStatusReason().setText(t.getTaskStsRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return task;
	}
}
