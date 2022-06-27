package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Task;
public class TaskBidirectionalConversion 
{
	public Task Tasks(org.hl7.fhir.r4.model.Task task) throws ParseException
	{
		 main.java.com.campfhir.model.Task t = new  main.java.com.campfhir.model.Task();

		/******************** id ********************************************************************************/
		task.setId(t.getId());

		/******************** Task_Owner ********************************************************************************/
		if(task.hasOwner()) {
			t.setTaskOwner(String.valueOf(task.getOwner()));
		}
		/******************** Task_Lctn ********************************************************************************/
		if(task.hasLocation()) {
			t.setTaskLctn(String.valueOf(task.getLocation()));
		}
		/******************** taskpriority ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskPriority taskpriority = task.getPriority();
		t.setTaskPriority(taskpriority.toCode());

		/******************** Task_LastModified ********************************************************************************/
		if(task.hasLastModified()) {
			t.setTaskLastModified(String.valueOf(task.getLastModified()));
		}
		/******************** taskcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskcode = task.getCode();

		/******************** Task_Cd_Txt ********************************************************************************/
		if(taskcode.hasText()) {
			t.setTaskCdTxt(String.valueOf(taskcode.getText()));
		}
		/******************** taskcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskcodecoding = taskcode.getCodingFirstRep();

		/******************** Task_Cd_Cdg_Vrsn ********************************************************************************/
		if(taskcodecoding.hasVersion()) {
			t.setTaskCdCdgVrsn(String.valueOf(taskcodecoding.getVersion()));
		}
		/******************** Task_Cd_Cdg_Dsply ********************************************************************************/
		if(taskcodecoding.hasDisplay()) {
			t.setTaskCdCdgDsply(String.valueOf(taskcodecoding.getDisplay()));
		}
		/******************** Task_Cd_Cdg_Cd ********************************************************************************/
		if(taskcodecoding.hasCode()) {
			t.setTaskCdCdgCd(String.valueOf(taskcodecoding.getCode()));
		}
		/******************** Task_Cd_Cdg_UsrSltd ********************************************************************************/
		if(taskcodecoding.hasUserSelected()) {
			t.setTaskCdCdgUsrSltd(String.valueOf(taskcodecoding.getUserSelected()));
		}
		/******************** Task_Cd_Cdg_Sys ********************************************************************************/
		if(taskcodecoding.hasSystem()) {
			t.setTaskCdCdgSys(String.valueOf(taskcodecoding.getSystem()));
		}
		/******************** Task_PartOf ********************************************************************************/
		if(task.hasPartOf()) {
			t.setTaskPartOf(String.valueOf(task.getPartOfFirstRep()));
		}
		/******************** Task_Focus ********************************************************************************/
		if(task.hasFocus()) {
			t.setTaskFocus(String.valueOf(task.getFocus()));
		}
		/******************** taskstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskstatusreason = task.getStatusReason();

		/******************** Task_StsRsn_Txt ********************************************************************************/
		if(taskstatusreason.hasText()) {
			t.setTaskStsRsnTxt(String.valueOf(taskstatusreason.getText()));
		}
		/******************** taskstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskstatusreasoncoding = taskstatusreason.getCodingFirstRep();

		/******************** Task_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(taskstatusreasoncoding.hasVersion()) {
			t.setTaskStsRsnCdgVrsn(String.valueOf(taskstatusreasoncoding.getVersion()));
		}
		/******************** Task_StsRsn_Cdg_Dsply ********************************************************************************/
		if(taskstatusreasoncoding.hasDisplay()) {
			t.setTaskStsRsnCdgDsply(String.valueOf(taskstatusreasoncoding.getDisplay()));
		}
		/******************** Task_StsRsn_Cdg_Cd ********************************************************************************/
		if(taskstatusreasoncoding.hasCode()) {
			t.setTaskStsRsnCdgCd(String.valueOf(taskstatusreasoncoding.getCode()));
		}
		/******************** Task_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(taskstatusreasoncoding.hasUserSelected()) {
			t.setTaskStsRsnCdgUsrSltd(String.valueOf(taskstatusreasoncoding.getUserSelected()));
		}
		/******************** Task_StsRsn_Cdg_Sys ********************************************************************************/
		if(taskstatusreasoncoding.hasSystem()) {
			t.setTaskStsRsnCdgSys(String.valueOf(taskstatusreasoncoding.getSystem()));
		}
		/******************** Task_Enc ********************************************************************************/
		if(task.hasEncounter()) {
			t.setTaskEnc(String.valueOf(task.getEncounter()));
		}
		/******************** taskstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskStatus taskstatus = task.getStatus();
		t.setTaskSts(taskstatus.toCode());

		/******************** Task_BasedOn ********************************************************************************/
		if(task.hasBasedOn()) {
			t.setTaskBasedOn(String.valueOf(task.getBasedOnFirstRep()));
		}
		/******************** taskreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskreasoncode = task.getReasonCode();

		/******************** Task_RsnCd_Txt ********************************************************************************/
		if(taskreasoncode.hasText()) {
			t.setTaskRsnCdTxt(String.valueOf(taskreasoncode.getText()));
		}
		/******************** taskreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskreasoncodecoding = taskreasoncode.getCodingFirstRep();

		/******************** Task_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(taskreasoncodecoding.hasVersion()) {
			t.setTaskRsnCdCdgVrsn(String.valueOf(taskreasoncodecoding.getVersion()));
		}
		/******************** Task_RsnCd_Cdg_Dsply ********************************************************************************/
		if(taskreasoncodecoding.hasDisplay()) {
			t.setTaskRsnCdCdgDsply(String.valueOf(taskreasoncodecoding.getDisplay()));
		}
		/******************** Task_RsnCd_Cdg_Cd ********************************************************************************/
		if(taskreasoncodecoding.hasCode()) {
			t.setTaskRsnCdCdgCd(String.valueOf(taskreasoncodecoding.getCode()));
		}
		/******************** Task_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(taskreasoncodecoding.hasUserSelected()) {
			t.setTaskRsnCdCdgUsrSltd(String.valueOf(taskreasoncodecoding.getUserSelected()));
		}
		/******************** Task_RsnCd_Cdg_Sys ********************************************************************************/
		if(taskreasoncodecoding.hasSystem()) {
			t.setTaskRsnCdCdgSys(String.valueOf(taskreasoncodecoding.getSystem()));
		}
		/******************** Task_RsnRfrnc ********************************************************************************/
		if(task.hasReasonReference()) {
			t.setTaskRsnRfrnc(String.valueOf(task.getReasonReference()));
		}
		/******************** tasknote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation tasknote = task.getNoteFirstRep();

		/******************** Task_Nt_Time ********************************************************************************/
		if(tasknote.hasTime()) {
			t.setTaskNtTime(String.valueOf(tasknote.getTime()));
		}
		/******************** Task_Nt_Txt ********************************************************************************/
		if(tasknote.hasText()) {
			t.setTaskNtTxt(String.valueOf(tasknote.getText()));
		}
		/******************** Task_Nt_AthrRfrnc ********************************************************************************/
		if(tasknote.hasAuthorReference()) {
			t.setTaskNtAthrRfrnc(String.valueOf(tasknote.getAuthorReference()));
		}
		/******************** Task_Nt_AthrStrgTyp ********************************************************************************/
		if(tasknote.hasAuthorStringType()) {
			t.setTaskNtAthrStrgTyp(String.valueOf(tasknote.getAuthorStringType()));
		}
		/******************** Task_Dscrptn ********************************************************************************/
		if(task.hasDescription()) {
			t.setTaskDscrptn(String.valueOf(task.getDescription()));
		}
		/******************** taskperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskperformertype = task.getPerformerTypeFirstRep();

		/******************** Task_PrfrmrTyp_Txt ********************************************************************************/
		if(taskperformertype.hasText()) {
			t.setTaskPrfrmrTypTxt(String.valueOf(taskperformertype.getText()));
		}
		/******************** taskperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskperformertypecoding = taskperformertype.getCodingFirstRep();

		/******************** Task_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(taskperformertypecoding.hasVersion()) {
			t.setTaskPrfrmrTypCdgVrsn(String.valueOf(taskperformertypecoding.getVersion()));
		}
		/******************** Task_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(taskperformertypecoding.hasDisplay()) {
			t.setTaskPrfrmrTypCdgDsply(String.valueOf(taskperformertypecoding.getDisplay()));
		}
		/******************** Task_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(taskperformertypecoding.hasCode()) {
			t.setTaskPrfrmrTypCdgCd(String.valueOf(taskperformertypecoding.getCode()));
		}
		/******************** Task_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(taskperformertypecoding.hasUserSelected()) {
			t.setTaskPrfrmrTypCdgUsrSltd(String.valueOf(taskperformertypecoding.getUserSelected()));
		}
		/******************** Task_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(taskperformertypecoding.hasSystem()) {
			t.setTaskPrfrmrTypCdgSys(String.valueOf(taskperformertypecoding.getSystem()));
		}
		/******************** Task_InstantiatesUri ********************************************************************************/
		if(task.hasInstantiatesUri()) {
			t.setTaskInstantiatesUri(String.valueOf(task.getInstantiatesUri()));
		}
		/******************** Task_AthredOn ********************************************************************************/
		if(task.hasAuthoredOn()) {
			t.setTaskAthredOn(String.valueOf(task.getAuthoredOn()));
		}
		/******************** taskintent ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskIntent taskintent = task.getIntent();
		t.setTaskIntent(taskintent.toCode());

		/******************** taskgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier taskgroupidentifier = task.getGroupIdentifier();

		/******************** Task_GrpId_Vl ********************************************************************************/
		if(taskgroupidentifier.hasValue()) {
			t.setTaskGrpIdVl(String.valueOf(taskgroupidentifier.getValue()));
		}
		/******************** taskgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskgroupidentifiertype = taskgroupidentifier.getType();

		/******************** Task_GrpId_Typ_Txt ********************************************************************************/
		if(taskgroupidentifiertype.hasText()) {
			t.setTaskGrpIdTypTxt(String.valueOf(taskgroupidentifiertype.getText()));
		}
		/******************** taskgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskgroupidentifiertypecoding = taskgroupidentifiertype.getCodingFirstRep();

		/******************** Task_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(taskgroupidentifiertypecoding.hasVersion()) {
			t.setTaskGrpIdTypCdgVrsn(String.valueOf(taskgroupidentifiertypecoding.getVersion()));
		}
		/******************** Task_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(taskgroupidentifiertypecoding.hasDisplay()) {
			t.setTaskGrpIdTypCdgDsply(String.valueOf(taskgroupidentifiertypecoding.getDisplay()));
		}
		/******************** Task_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(taskgroupidentifiertypecoding.hasCode()) {
			t.setTaskGrpIdTypCdgCd(String.valueOf(taskgroupidentifiertypecoding.getCode()));
		}
		/******************** Task_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(taskgroupidentifiertypecoding.hasUserSelected()) {
			t.setTaskGrpIdTypCdgUsrSltd(String.valueOf(taskgroupidentifiertypecoding.getUserSelected()));
		}
		/******************** Task_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(taskgroupidentifiertypecoding.hasSystem()) {
			t.setTaskGrpIdTypCdgSys(String.valueOf(taskgroupidentifiertypecoding.getSystem()));
		}
		/******************** taskgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskgroupidentifierperiod = taskgroupidentifier.getPeriod();

		/******************** Task_GrpId_Prd_Strt ********************************************************************************/
		if(taskgroupidentifierperiod.hasStart()) {
			t.setTaskGrpIdPrdStrt(String.valueOf(taskgroupidentifierperiod.getStart()));
		}
		/******************** Task_GrpId_Prd_End ********************************************************************************/
		if(taskgroupidentifierperiod.hasEnd()) {
			t.setTaskGrpIdPrdEnd(String.valueOf(taskgroupidentifierperiod.getEnd()));
		}
		/******************** Task_GrpId_Assigner ********************************************************************************/
		if(taskgroupidentifier.hasAssigner()) {
			t.setTaskGrpIdAssigner(String.valueOf(taskgroupidentifier.getAssigner()));
		}
		/******************** Task_GrpId_Sys ********************************************************************************/
		if(taskgroupidentifier.hasSystem()) {
			t.setTaskGrpIdSys(String.valueOf(taskgroupidentifier.getSystem()));
		}
		/******************** taskgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse taskgroupidentifieruse = taskgroupidentifier.getUse();
		t.setTaskGrpIdUse(taskgroupidentifieruse.toCode());

		/******************** Task_Insrnc ********************************************************************************/
		if(task.hasInsurance()) {
			t.setTaskInsrnc(String.valueOf(task.getInsuranceFirstRep()));
		}
		/******************** Task_InstantiatesCanonical ********************************************************************************/
		if(task.hasInstantiatesCanonical()) {
			t.setTaskInstantiatesCanonical(String.valueOf(task.getInstantiatesCanonical()));
		}
		/******************** taskidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier taskidentifier = task.getIdentifierFirstRep();

		/******************** Task_Id_Vl ********************************************************************************/
		if(taskidentifier.hasValue()) {
			t.setTaskIdVl(String.valueOf(taskidentifier.getValue()));
		}
		/******************** taskidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskidentifiertype = taskidentifier.getType();

		/******************** Task_Id_Typ_Txt ********************************************************************************/
		if(taskidentifiertype.hasText()) {
			t.setTaskIdTypTxt(String.valueOf(taskidentifiertype.getText()));
		}
		/******************** taskidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskidentifiertypecoding = taskidentifiertype.getCodingFirstRep();

		/******************** Task_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(taskidentifiertypecoding.hasVersion()) {
			t.setTaskIdTypCdgVrsn(String.valueOf(taskidentifiertypecoding.getVersion()));
		}
		/******************** Task_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(taskidentifiertypecoding.hasDisplay()) {
			t.setTaskIdTypCdgDsply(String.valueOf(taskidentifiertypecoding.getDisplay()));
		}
		/******************** Task_Id_Typ_Cdg_Cd ********************************************************************************/
		if(taskidentifiertypecoding.hasCode()) {
			t.setTaskIdTypCdgCd(String.valueOf(taskidentifiertypecoding.getCode()));
		}
		/******************** Task_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(taskidentifiertypecoding.hasUserSelected()) {
			t.setTaskIdTypCdgUsrSltd(String.valueOf(taskidentifiertypecoding.getUserSelected()));
		}
		/******************** Task_Id_Typ_Cdg_Sys ********************************************************************************/
		if(taskidentifiertypecoding.hasSystem()) {
			t.setTaskIdTypCdgSys(String.valueOf(taskidentifiertypecoding.getSystem()));
		}
		/******************** taskidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskidentifierperiod = taskidentifier.getPeriod();

		/******************** Task_Id_Prd_Strt ********************************************************************************/
		if(taskidentifierperiod.hasStart()) {
			t.setTaskIdPrdStrt(String.valueOf(taskidentifierperiod.getStart()));
		}
		/******************** Task_Id_Prd_End ********************************************************************************/
		if(taskidentifierperiod.hasEnd()) {
			t.setTaskIdPrdEnd(String.valueOf(taskidentifierperiod.getEnd()));
		}
		/******************** Task_Id_Assigner ********************************************************************************/
		if(taskidentifier.hasAssigner()) {
			t.setTaskIdAssigner(String.valueOf(taskidentifier.getAssigner()));
		}
		/******************** Task_Id_Sys ********************************************************************************/
		if(taskidentifier.hasSystem()) {
			t.setTaskIdSys(String.valueOf(taskidentifier.getSystem()));
		}
		/******************** taskidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse taskidentifieruse = taskidentifier.getUse();
		t.setTaskIdUse(taskidentifieruse.toCode());

		/******************** Task_For ********************************************************************************/
		if(task.hasFor()) {
			t.setTaskFor(String.valueOf(task.getFor()));
		}
		/******************** taskexecutionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskexecutionperiod = task.getExecutionPeriod();

		/******************** Task_ExecutionPrd_Strt ********************************************************************************/
		if(taskexecutionperiod.hasStart()) {
			t.setTaskExecutionPrdStrt(String.valueOf(taskexecutionperiod.getStart()));
		}
		/******************** Task_ExecutionPrd_End ********************************************************************************/
		if(taskexecutionperiod.hasEnd()) {
			t.setTaskExecutionPrdEnd(String.valueOf(taskexecutionperiod.getEnd()));
		}
		/******************** Task_Rqster ********************************************************************************/
		if(task.hasRequester()) {
			t.setTaskRqster(String.valueOf(task.getRequester()));
		}
		/******************** taskbusinessstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskbusinessstatus = task.getBusinessStatus();

		/******************** Task_BusinessSts_Txt ********************************************************************************/
		if(taskbusinessstatus.hasText()) {
			t.setTaskBusinessStsTxt(String.valueOf(taskbusinessstatus.getText()));
		}
		/******************** taskbusinessstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskbusinessstatuscoding = taskbusinessstatus.getCodingFirstRep();

		/******************** Task_BusinessSts_Cdg_Vrsn ********************************************************************************/
		if(taskbusinessstatuscoding.hasVersion()) {
			t.setTaskBusinessStsCdgVrsn(String.valueOf(taskbusinessstatuscoding.getVersion()));
		}
		/******************** Task_BusinessSts_Cdg_Dsply ********************************************************************************/
		if(taskbusinessstatuscoding.hasDisplay()) {
			t.setTaskBusinessStsCdgDsply(String.valueOf(taskbusinessstatuscoding.getDisplay()));
		}
		/******************** Task_BusinessSts_Cdg_Cd ********************************************************************************/
		if(taskbusinessstatuscoding.hasCode()) {
			t.setTaskBusinessStsCdgCd(String.valueOf(taskbusinessstatuscoding.getCode()));
		}
		/******************** Task_BusinessSts_Cdg_UsrSltd ********************************************************************************/
		if(taskbusinessstatuscoding.hasUserSelected()) {
			t.setTaskBusinessStsCdgUsrSltd(String.valueOf(taskbusinessstatuscoding.getUserSelected()));
		}
		/******************** Task_BusinessSts_Cdg_Sys ********************************************************************************/
		if(taskbusinessstatuscoding.hasSystem()) {
			t.setTaskBusinessStsCdgSys(String.valueOf(taskbusinessstatuscoding.getSystem()));
		}
		/******************** taskinput ********************************************************************************/
		org.hl7.fhir.r4.model.Task.ParameterComponent taskinput = task.getInputFirstRep();

		/******************** taskinputtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskinputtype = taskinput.getType();

		/******************** Task_Input_Typ_Txt ********************************************************************************/
		if(taskinputtype.hasText()) {
			t.setTaskInputTypTxt(String.valueOf(taskinputtype.getText()));
		}
		/******************** taskinputtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskinputtypecoding = taskinputtype.getCodingFirstRep();

		/******************** Task_Input_Typ_Cdg_Vrsn ********************************************************************************/
		if(taskinputtypecoding.hasVersion()) {
			t.setTaskInputTypCdgVrsn(String.valueOf(taskinputtypecoding.getVersion()));
		}
		/******************** Task_Input_Typ_Cdg_Dsply ********************************************************************************/
		if(taskinputtypecoding.hasDisplay()) {
			t.setTaskInputTypCdgDsply(String.valueOf(taskinputtypecoding.getDisplay()));
		}
		/******************** Task_Input_Typ_Cdg_Cd ********************************************************************************/
		if(taskinputtypecoding.hasCode()) {
			t.setTaskInputTypCdgCd(String.valueOf(taskinputtypecoding.getCode()));
		}
		/******************** Task_Input_Typ_Cdg_UsrSltd ********************************************************************************/
		if(taskinputtypecoding.hasUserSelected()) {
			t.setTaskInputTypCdgUsrSltd(String.valueOf(taskinputtypecoding.getUserSelected()));
		}
		/******************** Task_Input_Typ_Cdg_Sys ********************************************************************************/
		if(taskinputtypecoding.hasSystem()) {
			t.setTaskInputTypCdgSys(String.valueOf(taskinputtypecoding.getSystem()));
		}
		/******************** taskrestriction ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskRestrictionComponent taskrestriction = task.getRestriction();

		/******************** Task_Restriction_Repetitions ********************************************************************************/
		if(taskrestriction.hasRepetitions()) {
			t.setTaskRestrictionRepetitions(String.valueOf(taskrestriction.getRepetitions()));
		}
		/******************** taskrestrictionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskrestrictionperiod = taskrestriction.getPeriod();

		/******************** Task_Restriction_Prd_Strt ********************************************************************************/
		if(taskrestrictionperiod.hasStart()) {
			t.setTaskRestrictionPrdStrt(String.valueOf(taskrestrictionperiod.getStart()));
		}
		/******************** Task_Restriction_Prd_End ********************************************************************************/
		if(taskrestrictionperiod.hasEnd()) {
			t.setTaskRestrictionPrdEnd(String.valueOf(taskrestrictionperiod.getEnd()));
		}
		/******************** Task_Restriction_Recipient ********************************************************************************/
		if(taskrestriction.hasRecipient()) {
			t.setTaskRestrictionRecipient(String.valueOf(taskrestriction.getRecipientFirstRep()));
		}
		/******************** taskoutput ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskOutputComponent taskoutput = task.getOutputFirstRep();

		/******************** taskoutputtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskoutputtype = taskoutput.getType();

		/******************** Task_Output_Typ_Txt ********************************************************************************/
		if(taskoutputtype.hasText()) {
			t.setTaskOutputTypTxt(String.valueOf(taskoutputtype.getText()));
		}
		/******************** taskoutputtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskoutputtypecoding = taskoutputtype.getCodingFirstRep();

		/******************** Task_Output_Typ_Cdg_Vrsn ********************************************************************************/
		if(taskoutputtypecoding.hasVersion()) {
			t.setTaskOutputTypCdgVrsn(String.valueOf(taskoutputtypecoding.getVersion()));
		}
		/******************** Task_Output_Typ_Cdg_Dsply ********************************************************************************/
		if(taskoutputtypecoding.hasDisplay()) {
			t.setTaskOutputTypCdgDsply(String.valueOf(taskoutputtypecoding.getDisplay()));
		}
		/******************** Task_Output_Typ_Cdg_Cd ********************************************************************************/
		if(taskoutputtypecoding.hasCode()) {
			t.setTaskOutputTypCdgCd(String.valueOf(taskoutputtypecoding.getCode()));
		}
		/******************** Task_Output_Typ_Cdg_UsrSltd ********************************************************************************/
		if(taskoutputtypecoding.hasUserSelected()) {
			t.setTaskOutputTypCdgUsrSltd(String.valueOf(taskoutputtypecoding.getUserSelected()));
		}
		/******************** Task_Output_Typ_Cdg_Sys ********************************************************************************/
		if(taskoutputtypecoding.hasSystem()) {
			t.setTaskOutputTypCdgSys(String.valueOf(taskoutputtypecoding.getSystem()));
		}
		/******************** Task_RelevantHis ********************************************************************************/
		if(task.hasRelevantHistory()) {
			t.setTaskRelevantHis(String.valueOf(task.getRelevantHistoryFirstRep()));
		}
		return t;
	}
}
