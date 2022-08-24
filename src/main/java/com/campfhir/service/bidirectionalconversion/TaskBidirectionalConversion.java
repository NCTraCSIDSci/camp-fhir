package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Task;
public class TaskBidirectionalConversion 
{
	public Task Tasks(org.hl7.fhir.r4.model.Task task) throws ParseException
	{
		 main.java.com.campfhir.model.Task t = new  main.java.com.campfhir.model.Task();

		/******************** id ********************************************************************************/
		t.setId(task.getIdElement().getIdPart());

		/******************** Task_Lctn ********************************************************************************/
		if(task.hasLocation()) {

			if(task.getLocation().getReference() != null) {
			t.addTaskLctn(task.getLocation().getReference());
			}
		} else {
			t.addTaskLctn("NULL");
		}


		/******************** taskpriority ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskPriority taskpriority = task.getPriority();
		if(taskpriority!=null) {
			t.addTaskPriority(taskpriority.toCode());
		} else {
			t.addTaskPriority("NULL");
		}

		/******************** taskinput ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Task.ParameterComponent> taskinputlist = task.getInput();
		for(int taskinputi = 0; taskinputi<taskinputlist.size();taskinputi++ ) {
		org.hl7.fhir.r4.model.Task.ParameterComponent  taskinput = taskinputlist.get(taskinputi);

		/******************** taskinputtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskinputtype = taskinput.getType();

		/******************** Task_Input_Typ_Txt ********************************************************************************/
		if(taskinputi == 0) {t.addTaskInputTypTxt("[");}
		if(taskinputtype.hasText()) {

			t.addTaskInputTypTxt(String.valueOf(taskinputtype.getText()));
		} else {
			t.addTaskInputTypTxt("NULL");
		}

		if(taskinputi == taskinputlist.size()-1) {t.addTaskInputTypTxt("]");}


		/******************** taskinputtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> taskinputtypecodinglist = taskinputtype.getCoding();
		for(int taskinputtypecodingi = 0; taskinputtypecodingi<taskinputtypecodinglist.size();taskinputtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  taskinputtypecoding = taskinputtypecodinglist.get(taskinputtypecodingi);

		/******************** Task_Input_Typ_Cdg_Dsply ********************************************************************************/
		if(taskinputtypecodingi == 0) {t.addTaskInputTypCdgDsply("[[");}
		if(taskinputtypecoding.hasDisplay()) {

			t.addTaskInputTypCdgDsply(String.valueOf(taskinputtypecoding.getDisplay()));
		} else {
			t.addTaskInputTypCdgDsply("NULL");
		}

		if(taskinputtypecodingi == taskinputtypecodinglist.size()-1) {t.addTaskInputTypCdgDsply("]]");}


		/******************** Task_Input_Typ_Cdg_Vrsn ********************************************************************************/
		if(taskinputtypecodingi == 0) {t.addTaskInputTypCdgVrsn("[[");}
		if(taskinputtypecoding.hasVersion()) {

			t.addTaskInputTypCdgVrsn(String.valueOf(taskinputtypecoding.getVersion()));
		} else {
			t.addTaskInputTypCdgVrsn("NULL");
		}

		if(taskinputtypecodingi == taskinputtypecodinglist.size()-1) {t.addTaskInputTypCdgVrsn("]]");}


		/******************** Task_Input_Typ_Cdg_Cd ********************************************************************************/
		if(taskinputtypecodingi == 0) {t.addTaskInputTypCdgCd("[[");}
		if(taskinputtypecoding.hasCode()) {

			t.addTaskInputTypCdgCd(String.valueOf(taskinputtypecoding.getCode()));
		} else {
			t.addTaskInputTypCdgCd("NULL");
		}

		if(taskinputtypecodingi == taskinputtypecodinglist.size()-1) {t.addTaskInputTypCdgCd("]]");}


		/******************** Task_Input_Typ_Cdg_UsrSltd ********************************************************************************/
		if(taskinputtypecodingi == 0) {t.addTaskInputTypCdgUsrSltd("[[");}
		if(taskinputtypecoding.hasUserSelected()) {

			t.addTaskInputTypCdgUsrSltd(String.valueOf(taskinputtypecoding.getUserSelected()));
		} else {
			t.addTaskInputTypCdgUsrSltd("NULL");
		}

		if(taskinputtypecodingi == taskinputtypecodinglist.size()-1) {t.addTaskInputTypCdgUsrSltd("]]");}


		/******************** Task_Input_Typ_Cdg_Sys ********************************************************************************/
		if(taskinputtypecodingi == 0) {t.addTaskInputTypCdgSys("[[");}
		if(taskinputtypecoding.hasSystem()) {

			t.addTaskInputTypCdgSys(String.valueOf(taskinputtypecoding.getSystem()));
		} else {
			t.addTaskInputTypCdgSys("NULL");
		}

		if(taskinputtypecodingi == taskinputtypecodinglist.size()-1) {t.addTaskInputTypCdgSys("]]");}


		 };
		 };
		/******************** Task_LastModified ********************************************************************************/
		if(task.hasLastModified()) {

			t.addTaskLastModified("\""+ca.uhn.fhir.util.DateUtils.formatDate(task.getLastModified())+"\"");
		} else {
			t.addTaskLastModified("NULL");
		}


		/******************** taskcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskcode = task.getCode();

		/******************** Task_Cd_Txt ********************************************************************************/
		if(taskcode.hasText()) {

			t.addTaskCdTxt(String.valueOf(taskcode.getText()));
		} else {
			t.addTaskCdTxt("NULL");
		}


		/******************** taskcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> taskcodecodinglist = taskcode.getCoding();
		for(int taskcodecodingi = 0; taskcodecodingi<taskcodecodinglist.size();taskcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  taskcodecoding = taskcodecodinglist.get(taskcodecodingi);

		/******************** Task_Cd_Cdg_Dsply ********************************************************************************/
		if(taskcodecodingi == 0) {t.addTaskCdCdgDsply("[");}
		if(taskcodecoding.hasDisplay()) {

			t.addTaskCdCdgDsply(String.valueOf(taskcodecoding.getDisplay()));
		} else {
			t.addTaskCdCdgDsply("NULL");
		}

		if(taskcodecodingi == taskcodecodinglist.size()-1) {t.addTaskCdCdgDsply("]");}


		/******************** Task_Cd_Cdg_Vrsn ********************************************************************************/
		if(taskcodecodingi == 0) {t.addTaskCdCdgVrsn("[");}
		if(taskcodecoding.hasVersion()) {

			t.addTaskCdCdgVrsn(String.valueOf(taskcodecoding.getVersion()));
		} else {
			t.addTaskCdCdgVrsn("NULL");
		}

		if(taskcodecodingi == taskcodecodinglist.size()-1) {t.addTaskCdCdgVrsn("]");}


		/******************** Task_Cd_Cdg_Cd ********************************************************************************/
		if(taskcodecodingi == 0) {t.addTaskCdCdgCd("[");}
		if(taskcodecoding.hasCode()) {

			t.addTaskCdCdgCd(String.valueOf(taskcodecoding.getCode()));
		} else {
			t.addTaskCdCdgCd("NULL");
		}

		if(taskcodecodingi == taskcodecodinglist.size()-1) {t.addTaskCdCdgCd("]");}


		/******************** Task_Cd_Cdg_UsrSltd ********************************************************************************/
		if(taskcodecodingi == 0) {t.addTaskCdCdgUsrSltd("[");}
		if(taskcodecoding.hasUserSelected()) {

			t.addTaskCdCdgUsrSltd(String.valueOf(taskcodecoding.getUserSelected()));
		} else {
			t.addTaskCdCdgUsrSltd("NULL");
		}

		if(taskcodecodingi == taskcodecodinglist.size()-1) {t.addTaskCdCdgUsrSltd("]");}


		/******************** Task_Cd_Cdg_Sys ********************************************************************************/
		if(taskcodecodingi == 0) {t.addTaskCdCdgSys("[");}
		if(taskcodecoding.hasSystem()) {

			t.addTaskCdCdgSys(String.valueOf(taskcodecoding.getSystem()));
		} else {
			t.addTaskCdCdgSys("NULL");
		}

		if(taskcodecodingi == taskcodecodinglist.size()-1) {t.addTaskCdCdgSys("]");}


		 };
		/******************** taskstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskStatus taskstatus = task.getStatus();
		if(taskstatus!=null) {
			t.addTaskSts(taskstatus.toCode());
		} else {
			t.addTaskSts("NULL");
		}

		/******************** Task_Enc ********************************************************************************/
		if(task.hasEncounter()) {

			if(task.getEncounter().getReference() != null) {
			t.addTaskEnc(task.getEncounter().getReference());
			}
		} else {
			t.addTaskEnc("NULL");
		}


		/******************** Task_BasedOn ********************************************************************************/
		if(task.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<task.getBasedOn().size(); incr++) {
				array = array + task.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTaskBasedOn(array);

		} else {
			t.addTaskBasedOn("NULL");
		}


		/******************** taskreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskreasoncode = task.getReasonCode();

		/******************** Task_RsnCd_Txt ********************************************************************************/
		if(taskreasoncode.hasText()) {

			t.addTaskRsnCdTxt(String.valueOf(taskreasoncode.getText()));
		} else {
			t.addTaskRsnCdTxt("NULL");
		}


		/******************** taskreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> taskreasoncodecodinglist = taskreasoncode.getCoding();
		for(int taskreasoncodecodingi = 0; taskreasoncodecodingi<taskreasoncodecodinglist.size();taskreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  taskreasoncodecoding = taskreasoncodecodinglist.get(taskreasoncodecodingi);

		/******************** Task_RsnCd_Cdg_Dsply ********************************************************************************/
		if(taskreasoncodecodingi == 0) {t.addTaskRsnCdCdgDsply("[");}
		if(taskreasoncodecoding.hasDisplay()) {

			t.addTaskRsnCdCdgDsply(String.valueOf(taskreasoncodecoding.getDisplay()));
		} else {
			t.addTaskRsnCdCdgDsply("NULL");
		}

		if(taskreasoncodecodingi == taskreasoncodecodinglist.size()-1) {t.addTaskRsnCdCdgDsply("]");}


		/******************** Task_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(taskreasoncodecodingi == 0) {t.addTaskRsnCdCdgVrsn("[");}
		if(taskreasoncodecoding.hasVersion()) {

			t.addTaskRsnCdCdgVrsn(String.valueOf(taskreasoncodecoding.getVersion()));
		} else {
			t.addTaskRsnCdCdgVrsn("NULL");
		}

		if(taskreasoncodecodingi == taskreasoncodecodinglist.size()-1) {t.addTaskRsnCdCdgVrsn("]");}


		/******************** Task_RsnCd_Cdg_Cd ********************************************************************************/
		if(taskreasoncodecodingi == 0) {t.addTaskRsnCdCdgCd("[");}
		if(taskreasoncodecoding.hasCode()) {

			t.addTaskRsnCdCdgCd(String.valueOf(taskreasoncodecoding.getCode()));
		} else {
			t.addTaskRsnCdCdgCd("NULL");
		}

		if(taskreasoncodecodingi == taskreasoncodecodinglist.size()-1) {t.addTaskRsnCdCdgCd("]");}


		/******************** Task_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(taskreasoncodecodingi == 0) {t.addTaskRsnCdCdgUsrSltd("[");}
		if(taskreasoncodecoding.hasUserSelected()) {

			t.addTaskRsnCdCdgUsrSltd(String.valueOf(taskreasoncodecoding.getUserSelected()));
		} else {
			t.addTaskRsnCdCdgUsrSltd("NULL");
		}

		if(taskreasoncodecodingi == taskreasoncodecodinglist.size()-1) {t.addTaskRsnCdCdgUsrSltd("]");}


		/******************** Task_RsnCd_Cdg_Sys ********************************************************************************/
		if(taskreasoncodecodingi == 0) {t.addTaskRsnCdCdgSys("[");}
		if(taskreasoncodecoding.hasSystem()) {

			t.addTaskRsnCdCdgSys(String.valueOf(taskreasoncodecoding.getSystem()));
		} else {
			t.addTaskRsnCdCdgSys("NULL");
		}

		if(taskreasoncodecodingi == taskreasoncodecodinglist.size()-1) {t.addTaskRsnCdCdgSys("]");}


		 };
		/******************** Task_Dscrptn ********************************************************************************/
		if(task.hasDescription()) {

			t.addTaskDscrptn(String.valueOf(task.getDescription()));
		} else {
			t.addTaskDscrptn("NULL");
		}


		/******************** tasknote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> tasknotelist = task.getNote();
		for(int tasknotei = 0; tasknotei<tasknotelist.size();tasknotei++ ) {
		org.hl7.fhir.r4.model.Annotation  tasknote = tasknotelist.get(tasknotei);

		/******************** Task_Nt_Time ********************************************************************************/
		if(tasknotei == 0) {t.addTaskNtTime("[");}
		if(tasknote.hasTime()) {

			t.addTaskNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(tasknote.getTime())+"\"");
		} else {
			t.addTaskNtTime("NULL");
		}

		if(tasknotei == tasknotelist.size()-1) {t.addTaskNtTime("]");}


		/******************** Task_Nt_AthrRfrnc ********************************************************************************/
		if(tasknotei == 0) {t.addTaskNtAthrRfrnc("[");}
		if(tasknote.hasAuthorReference()) {

			if(tasknote.getAuthorReference().getReference() != null) {
			t.addTaskNtAthrRfrnc(tasknote.getAuthorReference().getReference());
			}
		} else {
			t.addTaskNtAthrRfrnc("NULL");
		}

		if(tasknotei == tasknotelist.size()-1) {t.addTaskNtAthrRfrnc("]");}


		/******************** Task_Nt_Txt ********************************************************************************/
		if(tasknotei == 0) {t.addTaskNtTxt("[");}
		if(tasknote.hasText()) {

			t.addTaskNtTxt(String.valueOf(tasknote.getText()));
		} else {
			t.addTaskNtTxt("NULL");
		}

		if(tasknotei == tasknotelist.size()-1) {t.addTaskNtTxt("]");}


		/******************** Task_Nt_AthrStrgTyp ********************************************************************************/
		if(tasknotei == 0) {t.addTaskNtAthrStrgTyp("[");}
		if(tasknote.hasAuthorStringType()) {

			t.addTaskNtAthrStrgTyp("\""+tasknote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			t.addTaskNtAthrStrgTyp("NULL");
		}

		if(tasknotei == tasknotelist.size()-1) {t.addTaskNtAthrStrgTyp("]");}


		 };
		/******************** Task_RsnRfrnc ********************************************************************************/
		if(task.hasReasonReference()) {

			if(task.getReasonReference().getReference() != null) {
			t.addTaskRsnRfrnc(task.getReasonReference().getReference());
			}
		} else {
			t.addTaskRsnRfrnc("NULL");
		}


		/******************** taskidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> taskidentifierlist = task.getIdentifier();
		for(int taskidentifieri = 0; taskidentifieri<taskidentifierlist.size();taskidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  taskidentifier = taskidentifierlist.get(taskidentifieri);

		/******************** Task_Id_Vl ********************************************************************************/
		if(taskidentifieri == 0) {t.addTaskIdVl("[");}
		if(taskidentifier.hasValue()) {

			t.addTaskIdVl(String.valueOf(taskidentifier.getValue()));
		} else {
			t.addTaskIdVl("NULL");
		}

		if(taskidentifieri == taskidentifierlist.size()-1) {t.addTaskIdVl("]");}


		/******************** taskidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskidentifiertype = taskidentifier.getType();

		/******************** Task_Id_Typ_Txt ********************************************************************************/
		if(taskidentifieri == 0) {t.addTaskIdTypTxt("[");}
		if(taskidentifiertype.hasText()) {

			t.addTaskIdTypTxt(String.valueOf(taskidentifiertype.getText()));
		} else {
			t.addTaskIdTypTxt("NULL");
		}

		if(taskidentifieri == taskidentifierlist.size()-1) {t.addTaskIdTypTxt("]");}


		/******************** taskidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> taskidentifiertypecodinglist = taskidentifiertype.getCoding();
		for(int taskidentifiertypecodingi = 0; taskidentifiertypecodingi<taskidentifiertypecodinglist.size();taskidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  taskidentifiertypecoding = taskidentifiertypecodinglist.get(taskidentifiertypecodingi);

		/******************** Task_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(taskidentifiertypecodingi == 0) {t.addTaskIdTypCdgDsply("[[");}
		if(taskidentifiertypecoding.hasDisplay()) {

			t.addTaskIdTypCdgDsply(String.valueOf(taskidentifiertypecoding.getDisplay()));
		} else {
			t.addTaskIdTypCdgDsply("NULL");
		}

		if(taskidentifiertypecodingi == taskidentifiertypecodinglist.size()-1) {t.addTaskIdTypCdgDsply("]]");}


		/******************** Task_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(taskidentifiertypecodingi == 0) {t.addTaskIdTypCdgVrsn("[[");}
		if(taskidentifiertypecoding.hasVersion()) {

			t.addTaskIdTypCdgVrsn(String.valueOf(taskidentifiertypecoding.getVersion()));
		} else {
			t.addTaskIdTypCdgVrsn("NULL");
		}

		if(taskidentifiertypecodingi == taskidentifiertypecodinglist.size()-1) {t.addTaskIdTypCdgVrsn("]]");}


		/******************** Task_Id_Typ_Cdg_Cd ********************************************************************************/
		if(taskidentifiertypecodingi == 0) {t.addTaskIdTypCdgCd("[[");}
		if(taskidentifiertypecoding.hasCode()) {

			t.addTaskIdTypCdgCd(String.valueOf(taskidentifiertypecoding.getCode()));
		} else {
			t.addTaskIdTypCdgCd("NULL");
		}

		if(taskidentifiertypecodingi == taskidentifiertypecodinglist.size()-1) {t.addTaskIdTypCdgCd("]]");}


		/******************** Task_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(taskidentifiertypecodingi == 0) {t.addTaskIdTypCdgUsrSltd("[[");}
		if(taskidentifiertypecoding.hasUserSelected()) {

			t.addTaskIdTypCdgUsrSltd(String.valueOf(taskidentifiertypecoding.getUserSelected()));
		} else {
			t.addTaskIdTypCdgUsrSltd("NULL");
		}

		if(taskidentifiertypecodingi == taskidentifiertypecodinglist.size()-1) {t.addTaskIdTypCdgUsrSltd("]]");}


		/******************** Task_Id_Typ_Cdg_Sys ********************************************************************************/
		if(taskidentifiertypecodingi == 0) {t.addTaskIdTypCdgSys("[[");}
		if(taskidentifiertypecoding.hasSystem()) {

			t.addTaskIdTypCdgSys(String.valueOf(taskidentifiertypecoding.getSystem()));
		} else {
			t.addTaskIdTypCdgSys("NULL");
		}

		if(taskidentifiertypecodingi == taskidentifiertypecodinglist.size()-1) {t.addTaskIdTypCdgSys("]]");}


		 };
		/******************** taskidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskidentifierperiod = taskidentifier.getPeriod();

		/******************** Task_Id_Prd_Strt ********************************************************************************/
		if(taskidentifieri == 0) {t.addTaskIdPrdStrt("[");}
		if(taskidentifierperiod.hasStart()) {

			t.addTaskIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(taskidentifierperiod.getStart())+"\"");
		} else {
			t.addTaskIdPrdStrt("NULL");
		}

		if(taskidentifieri == taskidentifierlist.size()-1) {t.addTaskIdPrdStrt("]");}


		/******************** Task_Id_Prd_End ********************************************************************************/
		if(taskidentifieri == 0) {t.addTaskIdPrdEnd("[");}
		if(taskidentifierperiod.hasEnd()) {

			t.addTaskIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(taskidentifierperiod.getEnd())+"\"");
		} else {
			t.addTaskIdPrdEnd("NULL");
		}

		if(taskidentifieri == taskidentifierlist.size()-1) {t.addTaskIdPrdEnd("]");}


		/******************** taskidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse taskidentifieruse = taskidentifier.getUse();
		if(taskidentifieruse!=null) {
		if(taskidentifieri == 0) {

		t.addTaskIdUse("[");		}
			t.addTaskIdUse(taskidentifieruse.toCode());
		if(taskidentifieri == taskidentifierlist.size()-1) {

		t.addTaskIdUse("]");		}

		} else {
			t.addTaskIdUse("NULL");
		}

		/******************** Task_Id_Assigner ********************************************************************************/
		if(taskidentifieri == 0) {t.addTaskIdAssigner("[");}
		if(taskidentifier.hasAssigner()) {

			if(taskidentifier.getAssigner().getReference() != null) {
			t.addTaskIdAssigner(taskidentifier.getAssigner().getReference());
			}
		} else {
			t.addTaskIdAssigner("NULL");
		}

		if(taskidentifieri == taskidentifierlist.size()-1) {t.addTaskIdAssigner("]");}


		/******************** Task_Id_Sys ********************************************************************************/
		if(taskidentifieri == 0) {t.addTaskIdSys("[");}
		if(taskidentifier.hasSystem()) {

			t.addTaskIdSys(String.valueOf(taskidentifier.getSystem()));
		} else {
			t.addTaskIdSys("NULL");
		}

		if(taskidentifieri == taskidentifierlist.size()-1) {t.addTaskIdSys("]");}


		 };
		/******************** taskgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier taskgroupidentifier = task.getGroupIdentifier();

		/******************** Task_GrpId_Vl ********************************************************************************/
		if(taskgroupidentifier.hasValue()) {

			t.addTaskGrpIdVl(String.valueOf(taskgroupidentifier.getValue()));
		} else {
			t.addTaskGrpIdVl("NULL");
		}


		/******************** taskgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskgroupidentifiertype = taskgroupidentifier.getType();

		/******************** Task_GrpId_Typ_Txt ********************************************************************************/
		if(taskgroupidentifiertype.hasText()) {

			t.addTaskGrpIdTypTxt(String.valueOf(taskgroupidentifiertype.getText()));
		} else {
			t.addTaskGrpIdTypTxt("NULL");
		}


		/******************** taskgroupidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> taskgroupidentifiertypecodinglist = taskgroupidentifiertype.getCoding();
		for(int taskgroupidentifiertypecodingi = 0; taskgroupidentifiertypecodingi<taskgroupidentifiertypecodinglist.size();taskgroupidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  taskgroupidentifiertypecoding = taskgroupidentifiertypecodinglist.get(taskgroupidentifiertypecodingi);

		/******************** Task_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(taskgroupidentifiertypecodingi == 0) {t.addTaskGrpIdTypCdgDsply("[");}
		if(taskgroupidentifiertypecoding.hasDisplay()) {

			t.addTaskGrpIdTypCdgDsply(String.valueOf(taskgroupidentifiertypecoding.getDisplay()));
		} else {
			t.addTaskGrpIdTypCdgDsply("NULL");
		}

		if(taskgroupidentifiertypecodingi == taskgroupidentifiertypecodinglist.size()-1) {t.addTaskGrpIdTypCdgDsply("]");}


		/******************** Task_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(taskgroupidentifiertypecodingi == 0) {t.addTaskGrpIdTypCdgVrsn("[");}
		if(taskgroupidentifiertypecoding.hasVersion()) {

			t.addTaskGrpIdTypCdgVrsn(String.valueOf(taskgroupidentifiertypecoding.getVersion()));
		} else {
			t.addTaskGrpIdTypCdgVrsn("NULL");
		}

		if(taskgroupidentifiertypecodingi == taskgroupidentifiertypecodinglist.size()-1) {t.addTaskGrpIdTypCdgVrsn("]");}


		/******************** Task_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(taskgroupidentifiertypecodingi == 0) {t.addTaskGrpIdTypCdgCd("[");}
		if(taskgroupidentifiertypecoding.hasCode()) {

			t.addTaskGrpIdTypCdgCd(String.valueOf(taskgroupidentifiertypecoding.getCode()));
		} else {
			t.addTaskGrpIdTypCdgCd("NULL");
		}

		if(taskgroupidentifiertypecodingi == taskgroupidentifiertypecodinglist.size()-1) {t.addTaskGrpIdTypCdgCd("]");}


		/******************** Task_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(taskgroupidentifiertypecodingi == 0) {t.addTaskGrpIdTypCdgUsrSltd("[");}
		if(taskgroupidentifiertypecoding.hasUserSelected()) {

			t.addTaskGrpIdTypCdgUsrSltd(String.valueOf(taskgroupidentifiertypecoding.getUserSelected()));
		} else {
			t.addTaskGrpIdTypCdgUsrSltd("NULL");
		}

		if(taskgroupidentifiertypecodingi == taskgroupidentifiertypecodinglist.size()-1) {t.addTaskGrpIdTypCdgUsrSltd("]");}


		/******************** Task_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(taskgroupidentifiertypecodingi == 0) {t.addTaskGrpIdTypCdgSys("[");}
		if(taskgroupidentifiertypecoding.hasSystem()) {

			t.addTaskGrpIdTypCdgSys(String.valueOf(taskgroupidentifiertypecoding.getSystem()));
		} else {
			t.addTaskGrpIdTypCdgSys("NULL");
		}

		if(taskgroupidentifiertypecodingi == taskgroupidentifiertypecodinglist.size()-1) {t.addTaskGrpIdTypCdgSys("]");}


		 };
		/******************** taskgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskgroupidentifierperiod = taskgroupidentifier.getPeriod();

		/******************** Task_GrpId_Prd_Strt ********************************************************************************/
		if(taskgroupidentifierperiod.hasStart()) {

			t.addTaskGrpIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(taskgroupidentifierperiod.getStart())+"\"");
		} else {
			t.addTaskGrpIdPrdStrt("NULL");
		}


		/******************** Task_GrpId_Prd_End ********************************************************************************/
		if(taskgroupidentifierperiod.hasEnd()) {

			t.addTaskGrpIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(taskgroupidentifierperiod.getEnd())+"\"");
		} else {
			t.addTaskGrpIdPrdEnd("NULL");
		}


		/******************** taskgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse taskgroupidentifieruse = taskgroupidentifier.getUse();
		if(taskgroupidentifieruse!=null) {
			t.addTaskGrpIdUse(taskgroupidentifieruse.toCode());
		} else {
			t.addTaskGrpIdUse("NULL");
		}

		/******************** Task_GrpId_Assigner ********************************************************************************/
		if(taskgroupidentifier.hasAssigner()) {

			if(taskgroupidentifier.getAssigner().getReference() != null) {
			t.addTaskGrpIdAssigner(taskgroupidentifier.getAssigner().getReference());
			}
		} else {
			t.addTaskGrpIdAssigner("NULL");
		}


		/******************** Task_GrpId_Sys ********************************************************************************/
		if(taskgroupidentifier.hasSystem()) {

			t.addTaskGrpIdSys(String.valueOf(taskgroupidentifier.getSystem()));
		} else {
			t.addTaskGrpIdSys("NULL");
		}


		/******************** Task_InstantiatesUri ********************************************************************************/
		if(task.hasInstantiatesUri()) {

			t.addTaskInstantiatesUri(String.valueOf(task.getInstantiatesUri()));
		} else {
			t.addTaskInstantiatesUri("NULL");
		}


		/******************** taskbusinessstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskbusinessstatus = task.getBusinessStatus();

		/******************** Task_BusinessSts_Txt ********************************************************************************/
		if(taskbusinessstatus.hasText()) {

			t.addTaskBusinessStsTxt(String.valueOf(taskbusinessstatus.getText()));
		} else {
			t.addTaskBusinessStsTxt("NULL");
		}


		/******************** taskbusinessstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> taskbusinessstatuscodinglist = taskbusinessstatus.getCoding();
		for(int taskbusinessstatuscodingi = 0; taskbusinessstatuscodingi<taskbusinessstatuscodinglist.size();taskbusinessstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  taskbusinessstatuscoding = taskbusinessstatuscodinglist.get(taskbusinessstatuscodingi);

		/******************** Task_BusinessSts_Cdg_Dsply ********************************************************************************/
		if(taskbusinessstatuscodingi == 0) {t.addTaskBusinessStsCdgDsply("[");}
		if(taskbusinessstatuscoding.hasDisplay()) {

			t.addTaskBusinessStsCdgDsply(String.valueOf(taskbusinessstatuscoding.getDisplay()));
		} else {
			t.addTaskBusinessStsCdgDsply("NULL");
		}

		if(taskbusinessstatuscodingi == taskbusinessstatuscodinglist.size()-1) {t.addTaskBusinessStsCdgDsply("]");}


		/******************** Task_BusinessSts_Cdg_Vrsn ********************************************************************************/
		if(taskbusinessstatuscodingi == 0) {t.addTaskBusinessStsCdgVrsn("[");}
		if(taskbusinessstatuscoding.hasVersion()) {

			t.addTaskBusinessStsCdgVrsn(String.valueOf(taskbusinessstatuscoding.getVersion()));
		} else {
			t.addTaskBusinessStsCdgVrsn("NULL");
		}

		if(taskbusinessstatuscodingi == taskbusinessstatuscodinglist.size()-1) {t.addTaskBusinessStsCdgVrsn("]");}


		/******************** Task_BusinessSts_Cdg_Cd ********************************************************************************/
		if(taskbusinessstatuscodingi == 0) {t.addTaskBusinessStsCdgCd("[");}
		if(taskbusinessstatuscoding.hasCode()) {

			t.addTaskBusinessStsCdgCd(String.valueOf(taskbusinessstatuscoding.getCode()));
		} else {
			t.addTaskBusinessStsCdgCd("NULL");
		}

		if(taskbusinessstatuscodingi == taskbusinessstatuscodinglist.size()-1) {t.addTaskBusinessStsCdgCd("]");}


		/******************** Task_BusinessSts_Cdg_UsrSltd ********************************************************************************/
		if(taskbusinessstatuscodingi == 0) {t.addTaskBusinessStsCdgUsrSltd("[");}
		if(taskbusinessstatuscoding.hasUserSelected()) {

			t.addTaskBusinessStsCdgUsrSltd(String.valueOf(taskbusinessstatuscoding.getUserSelected()));
		} else {
			t.addTaskBusinessStsCdgUsrSltd("NULL");
		}

		if(taskbusinessstatuscodingi == taskbusinessstatuscodinglist.size()-1) {t.addTaskBusinessStsCdgUsrSltd("]");}


		/******************** Task_BusinessSts_Cdg_Sys ********************************************************************************/
		if(taskbusinessstatuscodingi == 0) {t.addTaskBusinessStsCdgSys("[");}
		if(taskbusinessstatuscoding.hasSystem()) {

			t.addTaskBusinessStsCdgSys(String.valueOf(taskbusinessstatuscoding.getSystem()));
		} else {
			t.addTaskBusinessStsCdgSys("NULL");
		}

		if(taskbusinessstatuscodingi == taskbusinessstatuscodinglist.size()-1) {t.addTaskBusinessStsCdgSys("]");}


		 };
		/******************** taskexecutionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskexecutionperiod = task.getExecutionPeriod();

		/******************** Task_ExecutionPrd_Strt ********************************************************************************/
		if(taskexecutionperiod.hasStart()) {

			t.addTaskExecutionPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(taskexecutionperiod.getStart())+"\"");
		} else {
			t.addTaskExecutionPrdStrt("NULL");
		}


		/******************** Task_ExecutionPrd_End ********************************************************************************/
		if(taskexecutionperiod.hasEnd()) {

			t.addTaskExecutionPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(taskexecutionperiod.getEnd())+"\"");
		} else {
			t.addTaskExecutionPrdEnd("NULL");
		}


		/******************** Task_Rqster ********************************************************************************/
		if(task.hasRequester()) {

			if(task.getRequester().getReference() != null) {
			t.addTaskRqster(task.getRequester().getReference());
			}
		} else {
			t.addTaskRqster("NULL");
		}


		/******************** Task_For ********************************************************************************/
		if(task.hasFor()) {

			if(task.getFor().getReference() != null) {
			t.addTaskFor(task.getFor().getReference());
			}
		} else {
			t.addTaskFor("NULL");
		}


		/******************** taskrestriction ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskRestrictionComponent taskrestriction = task.getRestriction();

		/******************** taskrestrictionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period taskrestrictionperiod = taskrestriction.getPeriod();

		/******************** Task_Restriction_Prd_Strt ********************************************************************************/
		if(taskrestrictionperiod.hasStart()) {

			t.addTaskRestrictionPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(taskrestrictionperiod.getStart())+"\"");
		} else {
			t.addTaskRestrictionPrdStrt("NULL");
		}


		/******************** Task_Restriction_Prd_End ********************************************************************************/
		if(taskrestrictionperiod.hasEnd()) {

			t.addTaskRestrictionPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(taskrestrictionperiod.getEnd())+"\"");
		} else {
			t.addTaskRestrictionPrdEnd("NULL");
		}


		/******************** Task_Restriction_Repetitions ********************************************************************************/
		if(taskrestriction.hasRepetitions()) {

			t.addTaskRestrictionRepetitions(String.valueOf(taskrestriction.getRepetitions()));
		} else {
			t.addTaskRestrictionRepetitions("NULL");
		}


		/******************** Task_Restriction_Recipient ********************************************************************************/
		if(taskrestriction.hasRecipient()) {

			String  array = "[";
			for(int incr=0; incr<taskrestriction.getRecipient().size(); incr++) {
				array = array + taskrestriction.getRecipient().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTaskRestrictionRecipient(array);

		} else {
			t.addTaskRestrictionRecipient("NULL");
		}


		/******************** taskperformertype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> taskperformertypelist = task.getPerformerType();
		for(int taskperformertypei = 0; taskperformertypei<taskperformertypelist.size();taskperformertypei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  taskperformertype = taskperformertypelist.get(taskperformertypei);

		/******************** Task_PrfrmrTyp_Txt ********************************************************************************/
		if(taskperformertypei == 0) {t.addTaskPrfrmrTypTxt("[");}
		if(taskperformertype.hasText()) {

			t.addTaskPrfrmrTypTxt(String.valueOf(taskperformertype.getText()));
		} else {
			t.addTaskPrfrmrTypTxt("NULL");
		}

		if(taskperformertypei == taskperformertypelist.size()-1) {t.addTaskPrfrmrTypTxt("]");}


		/******************** taskperformertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> taskperformertypecodinglist = taskperformertype.getCoding();
		for(int taskperformertypecodingi = 0; taskperformertypecodingi<taskperformertypecodinglist.size();taskperformertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  taskperformertypecoding = taskperformertypecodinglist.get(taskperformertypecodingi);

		/******************** Task_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(taskperformertypecodingi == 0) {t.addTaskPrfrmrTypCdgDsply("[[");}
		if(taskperformertypecoding.hasDisplay()) {

			t.addTaskPrfrmrTypCdgDsply(String.valueOf(taskperformertypecoding.getDisplay()));
		} else {
			t.addTaskPrfrmrTypCdgDsply("NULL");
		}

		if(taskperformertypecodingi == taskperformertypecodinglist.size()-1) {t.addTaskPrfrmrTypCdgDsply("]]");}


		/******************** Task_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(taskperformertypecodingi == 0) {t.addTaskPrfrmrTypCdgVrsn("[[");}
		if(taskperformertypecoding.hasVersion()) {

			t.addTaskPrfrmrTypCdgVrsn(String.valueOf(taskperformertypecoding.getVersion()));
		} else {
			t.addTaskPrfrmrTypCdgVrsn("NULL");
		}

		if(taskperformertypecodingi == taskperformertypecodinglist.size()-1) {t.addTaskPrfrmrTypCdgVrsn("]]");}


		/******************** Task_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(taskperformertypecodingi == 0) {t.addTaskPrfrmrTypCdgCd("[[");}
		if(taskperformertypecoding.hasCode()) {

			t.addTaskPrfrmrTypCdgCd(String.valueOf(taskperformertypecoding.getCode()));
		} else {
			t.addTaskPrfrmrTypCdgCd("NULL");
		}

		if(taskperformertypecodingi == taskperformertypecodinglist.size()-1) {t.addTaskPrfrmrTypCdgCd("]]");}


		/******************** Task_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(taskperformertypecodingi == 0) {t.addTaskPrfrmrTypCdgUsrSltd("[[");}
		if(taskperformertypecoding.hasUserSelected()) {

			t.addTaskPrfrmrTypCdgUsrSltd(String.valueOf(taskperformertypecoding.getUserSelected()));
		} else {
			t.addTaskPrfrmrTypCdgUsrSltd("NULL");
		}

		if(taskperformertypecodingi == taskperformertypecodinglist.size()-1) {t.addTaskPrfrmrTypCdgUsrSltd("]]");}


		/******************** Task_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(taskperformertypecodingi == 0) {t.addTaskPrfrmrTypCdgSys("[[");}
		if(taskperformertypecoding.hasSystem()) {

			t.addTaskPrfrmrTypCdgSys(String.valueOf(taskperformertypecoding.getSystem()));
		} else {
			t.addTaskPrfrmrTypCdgSys("NULL");
		}

		if(taskperformertypecodingi == taskperformertypecodinglist.size()-1) {t.addTaskPrfrmrTypCdgSys("]]");}


		 };
		 };
		/******************** taskoutput ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Task.TaskOutputComponent> taskoutputlist = task.getOutput();
		for(int taskoutputi = 0; taskoutputi<taskoutputlist.size();taskoutputi++ ) {
		org.hl7.fhir.r4.model.Task.TaskOutputComponent  taskoutput = taskoutputlist.get(taskoutputi);

		/******************** taskoutputtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskoutputtype = taskoutput.getType();

		/******************** Task_Output_Typ_Txt ********************************************************************************/
		if(taskoutputi == 0) {t.addTaskOutputTypTxt("[");}
		if(taskoutputtype.hasText()) {

			t.addTaskOutputTypTxt(String.valueOf(taskoutputtype.getText()));
		} else {
			t.addTaskOutputTypTxt("NULL");
		}

		if(taskoutputi == taskoutputlist.size()-1) {t.addTaskOutputTypTxt("]");}


		/******************** taskoutputtypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> taskoutputtypecodinglist = taskoutputtype.getCoding();
		for(int taskoutputtypecodingi = 0; taskoutputtypecodingi<taskoutputtypecodinglist.size();taskoutputtypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  taskoutputtypecoding = taskoutputtypecodinglist.get(taskoutputtypecodingi);

		/******************** Task_Output_Typ_Cdg_Dsply ********************************************************************************/
		if(taskoutputtypecodingi == 0) {t.addTaskOutputTypCdgDsply("[[");}
		if(taskoutputtypecoding.hasDisplay()) {

			t.addTaskOutputTypCdgDsply(String.valueOf(taskoutputtypecoding.getDisplay()));
		} else {
			t.addTaskOutputTypCdgDsply("NULL");
		}

		if(taskoutputtypecodingi == taskoutputtypecodinglist.size()-1) {t.addTaskOutputTypCdgDsply("]]");}


		/******************** Task_Output_Typ_Cdg_Vrsn ********************************************************************************/
		if(taskoutputtypecodingi == 0) {t.addTaskOutputTypCdgVrsn("[[");}
		if(taskoutputtypecoding.hasVersion()) {

			t.addTaskOutputTypCdgVrsn(String.valueOf(taskoutputtypecoding.getVersion()));
		} else {
			t.addTaskOutputTypCdgVrsn("NULL");
		}

		if(taskoutputtypecodingi == taskoutputtypecodinglist.size()-1) {t.addTaskOutputTypCdgVrsn("]]");}


		/******************** Task_Output_Typ_Cdg_Cd ********************************************************************************/
		if(taskoutputtypecodingi == 0) {t.addTaskOutputTypCdgCd("[[");}
		if(taskoutputtypecoding.hasCode()) {

			t.addTaskOutputTypCdgCd(String.valueOf(taskoutputtypecoding.getCode()));
		} else {
			t.addTaskOutputTypCdgCd("NULL");
		}

		if(taskoutputtypecodingi == taskoutputtypecodinglist.size()-1) {t.addTaskOutputTypCdgCd("]]");}


		/******************** Task_Output_Typ_Cdg_UsrSltd ********************************************************************************/
		if(taskoutputtypecodingi == 0) {t.addTaskOutputTypCdgUsrSltd("[[");}
		if(taskoutputtypecoding.hasUserSelected()) {

			t.addTaskOutputTypCdgUsrSltd(String.valueOf(taskoutputtypecoding.getUserSelected()));
		} else {
			t.addTaskOutputTypCdgUsrSltd("NULL");
		}

		if(taskoutputtypecodingi == taskoutputtypecodinglist.size()-1) {t.addTaskOutputTypCdgUsrSltd("]]");}


		/******************** Task_Output_Typ_Cdg_Sys ********************************************************************************/
		if(taskoutputtypecodingi == 0) {t.addTaskOutputTypCdgSys("[[");}
		if(taskoutputtypecoding.hasSystem()) {

			t.addTaskOutputTypCdgSys(String.valueOf(taskoutputtypecoding.getSystem()));
		} else {
			t.addTaskOutputTypCdgSys("NULL");
		}

		if(taskoutputtypecodingi == taskoutputtypecodinglist.size()-1) {t.addTaskOutputTypCdgSys("]]");}


		 };
		 };
		/******************** Task_Focus ********************************************************************************/
		if(task.hasFocus()) {

			if(task.getFocus().getReference() != null) {
			t.addTaskFocus(task.getFocus().getReference());
			}
		} else {
			t.addTaskFocus("NULL");
		}


		/******************** Task_Insrnc ********************************************************************************/
		if(task.hasInsurance()) {

			String  array = "[";
			for(int incr=0; incr<task.getInsurance().size(); incr++) {
				array = array + task.getInsurance().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTaskInsrnc(array);

		} else {
			t.addTaskInsrnc("NULL");
		}


		/******************** Task_RelevantHis ********************************************************************************/
		if(task.hasRelevantHistory()) {

			String  array = "[";
			for(int incr=0; incr<task.getRelevantHistory().size(); incr++) {
				array = array + task.getRelevantHistory().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTaskRelevantHis(array);

		} else {
			t.addTaskRelevantHis("NULL");
		}


		/******************** Task_InstantiatesCanonical ********************************************************************************/
		if(task.hasInstantiatesCanonical()) {

			t.addTaskInstantiatesCanonical(String.valueOf(task.getInstantiatesCanonical()));
		} else {
			t.addTaskInstantiatesCanonical("NULL");
		}


		/******************** Task_AthredOn ********************************************************************************/
		if(task.hasAuthoredOn()) {

			t.addTaskAthredOn("\""+ca.uhn.fhir.util.DateUtils.formatDate(task.getAuthoredOn())+"\"");
		} else {
			t.addTaskAthredOn("NULL");
		}


		/******************** taskintent ********************************************************************************/
		org.hl7.fhir.r4.model.Task.TaskIntent taskintent = task.getIntent();
		if(taskintent!=null) {
			t.addTaskIntent(taskintent.toCode());
		} else {
			t.addTaskIntent("NULL");
		}

		/******************** Task_PartOf ********************************************************************************/
		if(task.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<task.getPartOf().size(); incr++) {
				array = array + task.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			t.addTaskPartOf(array);

		} else {
			t.addTaskPartOf("NULL");
		}


		/******************** taskstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept taskstatusreason = task.getStatusReason();

		/******************** Task_StsRsn_Txt ********************************************************************************/
		if(taskstatusreason.hasText()) {

			t.addTaskStsRsnTxt(String.valueOf(taskstatusreason.getText()));
		} else {
			t.addTaskStsRsnTxt("NULL");
		}


		/******************** taskstatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> taskstatusreasoncodinglist = taskstatusreason.getCoding();
		for(int taskstatusreasoncodingi = 0; taskstatusreasoncodingi<taskstatusreasoncodinglist.size();taskstatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  taskstatusreasoncoding = taskstatusreasoncodinglist.get(taskstatusreasoncodingi);

		/******************** Task_StsRsn_Cdg_Dsply ********************************************************************************/
		if(taskstatusreasoncodingi == 0) {t.addTaskStsRsnCdgDsply("[");}
		if(taskstatusreasoncoding.hasDisplay()) {

			t.addTaskStsRsnCdgDsply(String.valueOf(taskstatusreasoncoding.getDisplay()));
		} else {
			t.addTaskStsRsnCdgDsply("NULL");
		}

		if(taskstatusreasoncodingi == taskstatusreasoncodinglist.size()-1) {t.addTaskStsRsnCdgDsply("]");}


		/******************** Task_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(taskstatusreasoncodingi == 0) {t.addTaskStsRsnCdgVrsn("[");}
		if(taskstatusreasoncoding.hasVersion()) {

			t.addTaskStsRsnCdgVrsn(String.valueOf(taskstatusreasoncoding.getVersion()));
		} else {
			t.addTaskStsRsnCdgVrsn("NULL");
		}

		if(taskstatusreasoncodingi == taskstatusreasoncodinglist.size()-1) {t.addTaskStsRsnCdgVrsn("]");}


		/******************** Task_StsRsn_Cdg_Cd ********************************************************************************/
		if(taskstatusreasoncodingi == 0) {t.addTaskStsRsnCdgCd("[");}
		if(taskstatusreasoncoding.hasCode()) {

			t.addTaskStsRsnCdgCd(String.valueOf(taskstatusreasoncoding.getCode()));
		} else {
			t.addTaskStsRsnCdgCd("NULL");
		}

		if(taskstatusreasoncodingi == taskstatusreasoncodinglist.size()-1) {t.addTaskStsRsnCdgCd("]");}


		/******************** Task_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(taskstatusreasoncodingi == 0) {t.addTaskStsRsnCdgUsrSltd("[");}
		if(taskstatusreasoncoding.hasUserSelected()) {

			t.addTaskStsRsnCdgUsrSltd(String.valueOf(taskstatusreasoncoding.getUserSelected()));
		} else {
			t.addTaskStsRsnCdgUsrSltd("NULL");
		}

		if(taskstatusreasoncodingi == taskstatusreasoncodinglist.size()-1) {t.addTaskStsRsnCdgUsrSltd("]");}


		/******************** Task_StsRsn_Cdg_Sys ********************************************************************************/
		if(taskstatusreasoncodingi == 0) {t.addTaskStsRsnCdgSys("[");}
		if(taskstatusreasoncoding.hasSystem()) {

			t.addTaskStsRsnCdgSys(String.valueOf(taskstatusreasoncoding.getSystem()));
		} else {
			t.addTaskStsRsnCdgSys("NULL");
		}

		if(taskstatusreasoncodingi == taskstatusreasoncodinglist.size()-1) {t.addTaskStsRsnCdgSys("]");}


		 };
		/******************** Task_Owner ********************************************************************************/
		if(task.hasOwner()) {

			if(task.getOwner().getReference() != null) {
			t.addTaskOwner(task.getOwner().getReference());
			}
		} else {
			t.addTaskOwner("NULL");
		}


		return t;
	}
}
