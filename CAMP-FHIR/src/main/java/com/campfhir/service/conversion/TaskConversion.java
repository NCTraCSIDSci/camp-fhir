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
		if(t.getTaskAthredOn() != null) {
			java.text.SimpleDateFormat Task_AthredOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_AthredOndate = Task_AthredOnsdf.parse(t.getTaskAthredOn());
			task.setAuthoredOn(Task_AthredOndate);
		}
		/******************** Task_BasedOn ********************************************************************************/
		if(t.getTaskBasedOn() != null) {
			task.addBasedOn( new org.hl7.fhir.r4.model.Reference(t.getTaskBasedOn()));
		}
		/******************** taskbusinessstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskbusinessstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		task.setBusinessStatus(taskbusinessstatus);

		/******************** taskbusinessstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskbusinessstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		taskbusinessstatus.addCoding(taskbusinessstatuscoding);

		/******************** Task_BusinessSts_Cdg_Cd ********************************************************************************/
		if(t.getTaskBusinessStsCdgCd() != null) {
			taskbusinessstatuscoding.setCode(t.getTaskBusinessStsCdgCd());
		}
		/******************** Task_BusinessSts_Cdg_Dsply ********************************************************************************/
		if(t.getTaskBusinessStsCdgDsply() != null) {
			taskbusinessstatuscoding.setDisplay(t.getTaskBusinessStsCdgDsply());
		}
		/******************** Task_BusinessSts_Cdg_Sys ********************************************************************************/
		if(t.getTaskBusinessStsCdgSys() != null) {
			taskbusinessstatuscoding.setSystem(t.getTaskBusinessStsCdgSys());
		}
		/******************** Task_BusinessSts_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskBusinessStsCdgUsrSltd() != null) {
			taskbusinessstatuscoding.setUserSelected(Boolean.parseBoolean(t.getTaskBusinessStsCdgUsrSltd()));
		}
		/******************** Task_BusinessSts_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskBusinessStsCdgVrsn() != null) {
			taskbusinessstatuscoding.setVersion(t.getTaskBusinessStsCdgVrsn());
		}
		/******************** Task_BusinessSts_Txt ********************************************************************************/
		if(t.getTaskBusinessStsTxt() != null) {
			taskbusinessstatus.setText(t.getTaskBusinessStsTxt());
		}
		/******************** taskcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		task.setCode(taskcode);

		/******************** taskcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskcodecoding =  new org.hl7.fhir.r4.model.Coding();
		taskcode.addCoding(taskcodecoding);

		/******************** Task_Cd_Cdg_Cd ********************************************************************************/
		if(t.getTaskCdCdgCd() != null) {
			taskcodecoding.setCode(t.getTaskCdCdgCd());
		}
		/******************** Task_Cd_Cdg_Dsply ********************************************************************************/
		if(t.getTaskCdCdgDsply() != null) {
			taskcodecoding.setDisplay(t.getTaskCdCdgDsply());
		}
		/******************** Task_Cd_Cdg_Sys ********************************************************************************/
		if(t.getTaskCdCdgSys() != null) {
			taskcodecoding.setSystem(t.getTaskCdCdgSys());
		}
		/******************** Task_Cd_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskCdCdgUsrSltd() != null) {
			taskcodecoding.setUserSelected(Boolean.parseBoolean(t.getTaskCdCdgUsrSltd()));
		}
		/******************** Task_Cd_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskCdCdgVrsn() != null) {
			taskcodecoding.setVersion(t.getTaskCdCdgVrsn());
		}
		/******************** Task_Cd_Txt ********************************************************************************/
		if(t.getTaskCdTxt() != null) {
			taskcode.setText(t.getTaskCdTxt());
		}
		/******************** Task_Dscrptn ********************************************************************************/
		if(t.getTaskDscrptn() != null) {
			task.setDescription(t.getTaskDscrptn());
		}
		/******************** Task_Enc ********************************************************************************/
		if(t.getTaskEnc() != null) {
			task.setEncounter( new org.hl7.fhir.r4.model.Reference(t.getTaskEnc()));
		}
		/******************** taskexecutionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskexecutionperiod =  new org.hl7.fhir.r4.model.Period();
		task.setExecutionPeriod(taskexecutionperiod);

		/******************** Task_ExecutionPrd_End ********************************************************************************/
		if(t.getTaskExecutionPrdEnd() != null) {
			java.text.SimpleDateFormat Task_ExecutionPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_ExecutionPrd_Enddate = Task_ExecutionPrd_Endsdf.parse(t.getTaskExecutionPrdEnd());
			taskexecutionperiod.setEnd(Task_ExecutionPrd_Enddate);
		}
		/******************** Task_ExecutionPrd_Strt ********************************************************************************/
		if(t.getTaskExecutionPrdStrt() != null) {
			java.text.SimpleDateFormat Task_ExecutionPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_ExecutionPrd_Strtdate = Task_ExecutionPrd_Strtsdf.parse(t.getTaskExecutionPrdStrt());
			taskexecutionperiod.setStart(Task_ExecutionPrd_Strtdate);
		}
		/******************** Task_Focus ********************************************************************************/
		if(t.getTaskFocus() != null) {
			task.setFocus( new org.hl7.fhir.r4.model.Reference(t.getTaskFocus()));
		}
		/******************** Task_For ********************************************************************************/
		if(t.getTaskFor() != null) {
			task.setFor( new org.hl7.fhir.r4.model.Reference(t.getTaskFor()));
		}
		/******************** taskgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier taskgroupidentifier =  new org.hl7.fhir.r4.model.Identifier();
		task.setGroupIdentifier(taskgroupidentifier);

		/******************** Task_GrpId_Assigner ********************************************************************************/
		if(t.getTaskGrpIdAssigner() != null) {
			taskgroupidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(t.getTaskGrpIdAssigner()));
		}
		/******************** taskgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskgroupidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		taskgroupidentifier.setPeriod(taskgroupidentifierperiod);

		/******************** Task_GrpId_Prd_End ********************************************************************************/
		if(t.getTaskGrpIdPrdEnd() != null) {
			java.text.SimpleDateFormat Task_GrpId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_GrpId_Prd_Enddate = Task_GrpId_Prd_Endsdf.parse(t.getTaskGrpIdPrdEnd());
			taskgroupidentifierperiod.setEnd(Task_GrpId_Prd_Enddate);
		}
		/******************** Task_GrpId_Prd_Strt ********************************************************************************/
		if(t.getTaskGrpIdPrdStrt() != null) {
			java.text.SimpleDateFormat Task_GrpId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_GrpId_Prd_Strtdate = Task_GrpId_Prd_Strtsdf.parse(t.getTaskGrpIdPrdStrt());
			taskgroupidentifierperiod.setStart(Task_GrpId_Prd_Strtdate);
		}
		/******************** Task_GrpId_Sys ********************************************************************************/
		if(t.getTaskGrpIdSys() != null) {
			taskgroupidentifier.setSystem(t.getTaskGrpIdSys());
		}
		/******************** taskgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskgroupidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		taskgroupidentifier.setType(taskgroupidentifiertype);

		/******************** taskgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskgroupidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		taskgroupidentifiertype.addCoding(taskgroupidentifiertypecoding);

		/******************** Task_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTaskGrpIdTypCdgCd() != null) {
			taskgroupidentifiertypecoding.setCode(t.getTaskGrpIdTypCdgCd());
		}
		/******************** Task_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTaskGrpIdTypCdgDsply() != null) {
			taskgroupidentifiertypecoding.setDisplay(t.getTaskGrpIdTypCdgDsply());
		}
		/******************** Task_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTaskGrpIdTypCdgSys() != null) {
			taskgroupidentifiertypecoding.setSystem(t.getTaskGrpIdTypCdgSys());
		}
		/******************** Task_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskGrpIdTypCdgUsrSltd() != null) {
			taskgroupidentifiertypecoding.setUserSelected(Boolean.parseBoolean(t.getTaskGrpIdTypCdgUsrSltd()));
		}
		/******************** Task_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskGrpIdTypCdgVrsn() != null) {
			taskgroupidentifiertypecoding.setVersion(t.getTaskGrpIdTypCdgVrsn());
		}
		/******************** Task_GrpId_Typ_Txt ********************************************************************************/
		if(t.getTaskGrpIdTypTxt() != null) {
			taskgroupidentifiertype.setText(t.getTaskGrpIdTypTxt());
		}
		/******************** taskgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory taskgroupidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		taskgroupidentifier.setUse(taskgroupidentifieruse.fromCode(t.getTaskGrpIdUse()));

		/******************** Task_GrpId_Vl ********************************************************************************/
		if(t.getTaskGrpIdVl() != null) {
			taskgroupidentifier.setValue(t.getTaskGrpIdVl());
		}
		/******************** taskidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier taskidentifier =  new org.hl7.fhir.r4.model.Identifier();
		task.addIdentifier(taskidentifier);

		/******************** Task_Id_Assigner ********************************************************************************/
		if(t.getTaskIdAssigner() != null) {
			taskidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(t.getTaskIdAssigner()));
		}
		/******************** taskidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		taskidentifier.setPeriod(taskidentifierperiod);

		/******************** Task_Id_Prd_End ********************************************************************************/
		if(t.getTaskIdPrdEnd() != null) {
			java.text.SimpleDateFormat Task_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_Id_Prd_Enddate = Task_Id_Prd_Endsdf.parse(t.getTaskIdPrdEnd());
			taskidentifierperiod.setEnd(Task_Id_Prd_Enddate);
		}
		/******************** Task_Id_Prd_Strt ********************************************************************************/
		if(t.getTaskIdPrdStrt() != null) {
			java.text.SimpleDateFormat Task_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_Id_Prd_Strtdate = Task_Id_Prd_Strtsdf.parse(t.getTaskIdPrdStrt());
			taskidentifierperiod.setStart(Task_Id_Prd_Strtdate);
		}
		/******************** Task_Id_Sys ********************************************************************************/
		if(t.getTaskIdSys() != null) {
			taskidentifier.setSystem(t.getTaskIdSys());
		}
		/******************** taskidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		taskidentifier.setType(taskidentifiertype);

		/******************** taskidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		taskidentifiertype.addCoding(taskidentifiertypecoding);

		/******************** Task_Id_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTaskIdTypCdgCd() != null) {
			taskidentifiertypecoding.setCode(t.getTaskIdTypCdgCd());
		}
		/******************** Task_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTaskIdTypCdgDsply() != null) {
			taskidentifiertypecoding.setDisplay(t.getTaskIdTypCdgDsply());
		}
		/******************** Task_Id_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTaskIdTypCdgSys() != null) {
			taskidentifiertypecoding.setSystem(t.getTaskIdTypCdgSys());
		}
		/******************** Task_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskIdTypCdgUsrSltd() != null) {
			taskidentifiertypecoding.setUserSelected(Boolean.parseBoolean(t.getTaskIdTypCdgUsrSltd()));
		}
		/******************** Task_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskIdTypCdgVrsn() != null) {
			taskidentifiertypecoding.setVersion(t.getTaskIdTypCdgVrsn());
		}
		/******************** Task_Id_Typ_Txt ********************************************************************************/
		if(t.getTaskIdTypTxt() != null) {
			taskidentifiertype.setText(t.getTaskIdTypTxt());
		}
		/******************** taskidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory taskidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		taskidentifier.setUse(taskidentifieruse.fromCode(t.getTaskIdUse()));

		/******************** Task_Id_Vl ********************************************************************************/
		if(t.getTaskIdVl() != null) {
			taskidentifier.setValue(t.getTaskIdVl());
		}
		/******************** taskinput ********************************************************************************/
		org.hl7.fhir.r4.model.Task.ParameterComponent taskinput =  new org.hl7.fhir.r4.model.Task.ParameterComponent();
		task.addInput(taskinput);

		/******************** taskinputtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskinputtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		taskinput.setType(taskinputtype);

		/******************** taskinputtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskinputtypecoding =  new org.hl7.fhir.r4.model.Coding();
		taskinputtype.addCoding(taskinputtypecoding);

		/******************** Task_Input_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTaskInputTypCdgCd() != null) {
			taskinputtypecoding.setCode(t.getTaskInputTypCdgCd());
		}
		/******************** Task_Input_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTaskInputTypCdgDsply() != null) {
			taskinputtypecoding.setDisplay(t.getTaskInputTypCdgDsply());
		}
		/******************** Task_Input_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTaskInputTypCdgSys() != null) {
			taskinputtypecoding.setSystem(t.getTaskInputTypCdgSys());
		}
		/******************** Task_Input_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskInputTypCdgUsrSltd() != null) {
			taskinputtypecoding.setUserSelected(Boolean.parseBoolean(t.getTaskInputTypCdgUsrSltd()));
		}
		/******************** Task_Input_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskInputTypCdgVrsn() != null) {
			taskinputtypecoding.setVersion(t.getTaskInputTypCdgVrsn());
		}
		/******************** Task_Input_Typ_Txt ********************************************************************************/
		if(t.getTaskInputTypTxt() != null) {
			taskinputtype.setText(t.getTaskInputTypTxt());
		}
		/******************** Task_InstantiatesCanonical ********************************************************************************/
		if(t.getTaskInstantiatesCanonical() != null) {
			task.setInstantiatesCanonical(t.getTaskInstantiatesCanonical());
		}
		/******************** Task_InstantiatesUri ********************************************************************************/
		if(t.getTaskInstantiatesUri() != null) {
			task.setInstantiatesUri(t.getTaskInstantiatesUri());
		}
		/******************** Task_Insrnc ********************************************************************************/
		if(t.getTaskInsrnc() != null) {
			task.addInsurance( new org.hl7.fhir.r4.model.Reference(t.getTaskInsrnc()));
		}
		/******************** taskintent ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskIntentEnumFactory taskintent =  new org.hl7.fhir.r4.model.Task.TaskIntentEnumFactory();
		task.setIntent(taskintent.fromCode(t.getTaskIntent()));

		/******************** Task_LastModified ********************************************************************************/
		if(t.getTaskLastModified() != null) {
			java.text.SimpleDateFormat Task_LastModifiedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_LastModifieddate = Task_LastModifiedsdf.parse(t.getTaskLastModified());
			task.setLastModified(Task_LastModifieddate);
		}
		/******************** Task_Lctn ********************************************************************************/
		if(t.getTaskLctn() != null) {
			task.setLocation( new org.hl7.fhir.r4.model.Reference(t.getTaskLctn()));
		}
		/******************** tasknote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation tasknote =  new org.hl7.fhir.r4.model.Annotation();
		task.addNote(tasknote);

		/******************** Task_Nt_AthrRfrnc ********************************************************************************/
		if(t.getTaskNtAthrRfrnc() != null) {
			tasknote.setAuthor( new org.hl7.fhir.r4.model.Reference(t.getTaskNtAthrRfrnc()));
		}
		/******************** Task_Nt_AthrStrgTyp ********************************************************************************/
		if(t.getTaskNtAthrStrgTyp() != null) {
			tasknote.setAuthor( new org.hl7.fhir.r4.model.StringType(t.getTaskNtAthrStrgTyp()));
		}
		/******************** Task_Nt_Txt ********************************************************************************/
		if(t.getTaskNtTxt() != null) {
			tasknote.setText(t.getTaskNtTxt());
		}
		/******************** Task_Nt_Time ********************************************************************************/
		if(t.getTaskNtTime() != null) {
			java.text.SimpleDateFormat Task_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_Nt_Timedate = Task_Nt_Timesdf.parse(t.getTaskNtTime());
			tasknote.setTime(Task_Nt_Timedate);
		}
		/******************** taskoutput ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskOutputComponent taskoutput =  new org.hl7.fhir.r4.model.Task.TaskOutputComponent();
		task.addOutput(taskoutput);

		/******************** taskoutputtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskoutputtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		taskoutput.setType(taskoutputtype);

		/******************** taskoutputtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskoutputtypecoding =  new org.hl7.fhir.r4.model.Coding();
		taskoutputtype.addCoding(taskoutputtypecoding);

		/******************** Task_Output_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTaskOutputTypCdgCd() != null) {
			taskoutputtypecoding.setCode(t.getTaskOutputTypCdgCd());
		}
		/******************** Task_Output_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTaskOutputTypCdgDsply() != null) {
			taskoutputtypecoding.setDisplay(t.getTaskOutputTypCdgDsply());
		}
		/******************** Task_Output_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTaskOutputTypCdgSys() != null) {
			taskoutputtypecoding.setSystem(t.getTaskOutputTypCdgSys());
		}
		/******************** Task_Output_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskOutputTypCdgUsrSltd() != null) {
			taskoutputtypecoding.setUserSelected(Boolean.parseBoolean(t.getTaskOutputTypCdgUsrSltd()));
		}
		/******************** Task_Output_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskOutputTypCdgVrsn() != null) {
			taskoutputtypecoding.setVersion(t.getTaskOutputTypCdgVrsn());
		}
		/******************** Task_Output_Typ_Txt ********************************************************************************/
		if(t.getTaskOutputTypTxt() != null) {
			taskoutputtype.setText(t.getTaskOutputTypTxt());
		}
		/******************** Task_Owner ********************************************************************************/
		if(t.getTaskOwner() != null) {
			task.setOwner( new org.hl7.fhir.r4.model.Reference(t.getTaskOwner()));
		}
		/******************** Task_PartOf ********************************************************************************/
		if(t.getTaskPartOf() != null) {
			task.addPartOf( new org.hl7.fhir.r4.model.Reference(t.getTaskPartOf()));
		}
		/******************** taskperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskperformertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		task.addPerformerType(taskperformertype);

		/******************** taskperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskperformertypecoding =  new org.hl7.fhir.r4.model.Coding();
		taskperformertype.addCoding(taskperformertypecoding);

		/******************** Task_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgCd() != null) {
			taskperformertypecoding.setCode(t.getTaskPrfrmrTypCdgCd());
		}
		/******************** Task_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgDsply() != null) {
			taskperformertypecoding.setDisplay(t.getTaskPrfrmrTypCdgDsply());
		}
		/******************** Task_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgSys() != null) {
			taskperformertypecoding.setSystem(t.getTaskPrfrmrTypCdgSys());
		}
		/******************** Task_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgUsrSltd() != null) {
			taskperformertypecoding.setUserSelected(Boolean.parseBoolean(t.getTaskPrfrmrTypCdgUsrSltd()));
		}
		/******************** Task_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskPrfrmrTypCdgVrsn() != null) {
			taskperformertypecoding.setVersion(t.getTaskPrfrmrTypCdgVrsn());
		}
		/******************** Task_PrfrmrTyp_Txt ********************************************************************************/
		if(t.getTaskPrfrmrTypTxt() != null) {
			taskperformertype.setText(t.getTaskPrfrmrTypTxt());
		}
		/******************** taskpriority ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskPriorityEnumFactory taskpriority =  new org.hl7.fhir.r4.model.Task.TaskPriorityEnumFactory();
		task.setPriority(taskpriority.fromCode(t.getTaskPriority()));

		/******************** taskreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		task.setReasonCode(taskreasoncode);

		/******************** taskreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		taskreasoncode.addCoding(taskreasoncodecoding);

		/******************** Task_RsnCd_Cdg_Cd ********************************************************************************/
		if(t.getTaskRsnCdCdgCd() != null) {
			taskreasoncodecoding.setCode(t.getTaskRsnCdCdgCd());
		}
		/******************** Task_RsnCd_Cdg_Dsply ********************************************************************************/
		if(t.getTaskRsnCdCdgDsply() != null) {
			taskreasoncodecoding.setDisplay(t.getTaskRsnCdCdgDsply());
		}
		/******************** Task_RsnCd_Cdg_Sys ********************************************************************************/
		if(t.getTaskRsnCdCdgSys() != null) {
			taskreasoncodecoding.setSystem(t.getTaskRsnCdCdgSys());
		}
		/******************** Task_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskRsnCdCdgUsrSltd() != null) {
			taskreasoncodecoding.setUserSelected(Boolean.parseBoolean(t.getTaskRsnCdCdgUsrSltd()));
		}
		/******************** Task_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskRsnCdCdgVrsn() != null) {
			taskreasoncodecoding.setVersion(t.getTaskRsnCdCdgVrsn());
		}
		/******************** Task_RsnCd_Txt ********************************************************************************/
		if(t.getTaskRsnCdTxt() != null) {
			taskreasoncode.setText(t.getTaskRsnCdTxt());
		}
		/******************** Task_RsnRfrnc ********************************************************************************/
		if(t.getTaskRsnRfrnc() != null) {
			task.setReasonReference( new org.hl7.fhir.r4.model.Reference(t.getTaskRsnRfrnc()));
		}
		/******************** Task_RelevantHis ********************************************************************************/
		if(t.getTaskRelevantHis() != null) {
			task.addRelevantHistory( new org.hl7.fhir.r4.model.Reference(t.getTaskRelevantHis()));
		}
		/******************** Task_Rqster ********************************************************************************/
		if(t.getTaskRqster() != null) {
			task.setRequester( new org.hl7.fhir.r4.model.Reference(t.getTaskRqster()));
		}
		/******************** taskrestriction ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskRestrictionComponent taskrestriction =  new org.hl7.fhir.r4.model.Task.TaskRestrictionComponent();
		task.setRestriction(taskrestriction);

		/******************** taskrestrictionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskrestrictionperiod =  new org.hl7.fhir.r4.model.Period();
		taskrestriction.setPeriod(taskrestrictionperiod);

		/******************** Task_Restriction_Prd_End ********************************************************************************/
		if(t.getTaskRestrictionPrdEnd() != null) {
			java.text.SimpleDateFormat Task_Restriction_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_Restriction_Prd_Enddate = Task_Restriction_Prd_Endsdf.parse(t.getTaskRestrictionPrdEnd());
			taskrestrictionperiod.setEnd(Task_Restriction_Prd_Enddate);
		}
		/******************** Task_Restriction_Prd_Strt ********************************************************************************/
		if(t.getTaskRestrictionPrdStrt() != null) {
			java.text.SimpleDateFormat Task_Restriction_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Task_Restriction_Prd_Strtdate = Task_Restriction_Prd_Strtsdf.parse(t.getTaskRestrictionPrdStrt());
			taskrestrictionperiod.setStart(Task_Restriction_Prd_Strtdate);
		}
		/******************** Task_Restriction_Recipient ********************************************************************************/
		if(t.getTaskRestrictionRecipient() != null) {
			taskrestriction.addRecipient( new org.hl7.fhir.r4.model.Reference(t.getTaskRestrictionRecipient()));
		}
		/******************** Task_Restriction_Repetitions ********************************************************************************/
		if(t.getTaskRestrictionRepetitions() != null) {
			taskrestriction.setRepetitions(Integer.parseInt(t.getTaskRestrictionRepetitions()));
		}
		/******************** taskstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskStatusEnumFactory taskstatus =  new org.hl7.fhir.r4.model.Task.TaskStatusEnumFactory();
		task.setStatus(taskstatus.fromCode(t.getTaskSts()));

		/******************** taskstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskstatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		task.setStatusReason(taskstatusreason);

		/******************** taskstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding taskstatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		taskstatusreason.addCoding(taskstatusreasoncoding);

		/******************** Task_StsRsn_Cdg_Cd ********************************************************************************/
		if(t.getTaskStsRsnCdgCd() != null) {
			taskstatusreasoncoding.setCode(t.getTaskStsRsnCdgCd());
		}
		/******************** Task_StsRsn_Cdg_Dsply ********************************************************************************/
		if(t.getTaskStsRsnCdgDsply() != null) {
			taskstatusreasoncoding.setDisplay(t.getTaskStsRsnCdgDsply());
		}
		/******************** Task_StsRsn_Cdg_Sys ********************************************************************************/
		if(t.getTaskStsRsnCdgSys() != null) {
			taskstatusreasoncoding.setSystem(t.getTaskStsRsnCdgSys());
		}
		/******************** Task_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(t.getTaskStsRsnCdgUsrSltd() != null) {
			taskstatusreasoncoding.setUserSelected(Boolean.parseBoolean(t.getTaskStsRsnCdgUsrSltd()));
		}
		/******************** Task_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(t.getTaskStsRsnCdgVrsn() != null) {
			taskstatusreasoncoding.setVersion(t.getTaskStsRsnCdgVrsn());
		}
		/******************** Task_StsRsn_Txt ********************************************************************************/
		if(t.getTaskStsRsnTxt() != null) {
			taskstatusreason.setText(t.getTaskStsRsnTxt());
		}
		return task;
	}
}
