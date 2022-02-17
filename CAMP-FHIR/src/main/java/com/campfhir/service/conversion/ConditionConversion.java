package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Condition;
public class ConditionConversion 
{
	public org.hl7.fhir.r4.model.Condition Conditions(Condition c) throws ParseException
	{
		org.hl7.fhir.r4.model.Condition condition = new org.hl7.fhir.r4.model.Condition();
		/******************** Condition_Abatement ********************************************************************************/
		if(c.getConditionAbatement() != null) {
			condition.setAbatement(new org.hl7.fhir.r4.model.StringType(c.getConditionAbatement()));
		}
		/******************** Condition_Asserter ********************************************************************************/
		if(c.getConditionAsserter() != null) {
			org.hl7.fhir.r4.model.Reference ConditionAsserterref = new org.hl7.fhir.r4.model.Reference();
			condition.setAsserter(ConditionAsserterref.setReference(c.getConditionAsserter()));
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddbodysite = condition.addBodySite();


		org.hl7.fhir.r4.model.Coding conditionaddbodysiteaddcoding = conditionaddbodysite.addCoding();

		/******************** Condition_BodySite_Coding_Code ********************************************************************************/
		if(c.getConditionBodySiteCodingCode() != null) {
			conditionaddbodysiteaddcoding.setCode(c.getConditionBodySiteCodingCode());
		}
		/******************** Condition_BodySite_Coding_Display ********************************************************************************/
		if(c.getConditionBodySiteCodingDisplay() != null) {
			conditionaddbodysiteaddcoding.setDisplay(c.getConditionBodySiteCodingDisplay());
		}
		/******************** Condition_BodySite_Coding_System ********************************************************************************/
		if(c.getConditionBodySiteCodingSystem() != null) {
			conditionaddbodysiteaddcoding.setSystem(c.getConditionBodySiteCodingSystem());
		}
		/******************** Condition_BodySite_Coding_UserSelected ********************************************************************************/
		if(c.getConditionBodySiteCodingUserSelected() != null) {
			conditionaddbodysiteaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionBodySiteCodingUserSelected()));
		}
		/******************** Condition_BodySite_Coding_Version ********************************************************************************/
		if(c.getConditionBodySiteCodingVersion() != null) {
			conditionaddbodysiteaddcoding.setVersion(c.getConditionBodySiteCodingVersion());
		}
		/******************** Condition_BodySite_Text ********************************************************************************/
		if(c.getConditionBodySiteText() != null) {
			conditionaddbodysite.setText(c.getConditionBodySiteText());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddcategory = condition.addCategory();


		org.hl7.fhir.r4.model.Coding conditionaddcategoryaddcoding = conditionaddcategory.addCoding();

		/******************** Condition_Category_Coding_Code ********************************************************************************/
		if(c.getConditionCategoryCodingCode() != null) {
			conditionaddcategoryaddcoding.setCode(c.getConditionCategoryCodingCode());
		}
		/******************** Condition_Category_Coding_Display ********************************************************************************/
		if(c.getConditionCategoryCodingDisplay() != null) {
			conditionaddcategoryaddcoding.setDisplay(c.getConditionCategoryCodingDisplay());
		}
		/******************** Condition_Category_Coding_System ********************************************************************************/
		if(c.getConditionCategoryCodingSystem() != null) {
			conditionaddcategoryaddcoding.setSystem(c.getConditionCategoryCodingSystem());
		}
		/******************** Condition_Category_Coding_UserSelected ********************************************************************************/
		if(c.getConditionCategoryCodingUserSelected() != null) {
			conditionaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionCategoryCodingUserSelected()));
		}
		/******************** Condition_Category_Coding_Version ********************************************************************************/
		if(c.getConditionCategoryCodingVersion() != null) {
			conditionaddcategoryaddcoding.setVersion(c.getConditionCategoryCodingVersion());
		}
		/******************** Condition_Category_Text ********************************************************************************/
		if(c.getConditionCategoryText() != null) {
			conditionaddcategory.setText(c.getConditionCategoryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionsetclinicalstatus = new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setClinicalStatus(conditionsetclinicalstatus);


		org.hl7.fhir.r4.model.Coding conditionsetclinicalstatusaddcoding = conditionsetclinicalstatus.addCoding();

		/******************** Condition_ClinicalStatus_Coding_Code ********************************************************************************/
		if(c.getConditionClinicalStatusCodingCode() != null) {
			conditionsetclinicalstatusaddcoding.setCode(c.getConditionClinicalStatusCodingCode());
		}
		/******************** Condition_ClinicalStatus_Coding_Display ********************************************************************************/
		if(c.getConditionClinicalStatusCodingDisplay() != null) {
			conditionsetclinicalstatusaddcoding.setDisplay(c.getConditionClinicalStatusCodingDisplay());
		}
		/******************** Condition_ClinicalStatus_Coding_System ********************************************************************************/
		if(c.getConditionClinicalStatusCodingSystem() != null) {
			conditionsetclinicalstatusaddcoding.setSystem(c.getConditionClinicalStatusCodingSystem());
		}
		/******************** Condition_ClinicalStatus_Coding_UserSelected ********************************************************************************/
		if(c.getConditionClinicalStatusCodingUserSelected() != null) {
			conditionsetclinicalstatusaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionClinicalStatusCodingUserSelected()));
		}
		/******************** Condition_ClinicalStatus_Coding_Version ********************************************************************************/
		if(c.getConditionClinicalStatusCodingVersion() != null) {
			conditionsetclinicalstatusaddcoding.setVersion(c.getConditionClinicalStatusCodingVersion());
		}
		/******************** Condition_ClinicalStatus_Text ********************************************************************************/
		if(c.getConditionClinicalStatusText() != null) {
			conditionsetclinicalstatus.setText(c.getConditionClinicalStatusText());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setCode(conditionsetcode);


		org.hl7.fhir.r4.model.Coding conditionsetcodeaddcoding = conditionsetcode.addCoding();

		/******************** Condition_Code_Coding_Code ********************************************************************************/
		if(c.getConditionCodeCodingCode() != null) {
			conditionsetcodeaddcoding.setCode(c.getConditionCodeCodingCode());
		}
		/******************** Condition_Code_Coding_Display ********************************************************************************/
		if(c.getConditionCodeCodingDisplay() != null) {
			conditionsetcodeaddcoding.setDisplay(c.getConditionCodeCodingDisplay());
		}
		/******************** Condition_Code_Coding_System ********************************************************************************/
		if(c.getConditionCodeCodingSystem() != null) {
			conditionsetcodeaddcoding.setSystem(c.getConditionCodeCodingSystem());
		}
		/******************** Condition_Code_Coding_UserSelected ********************************************************************************/
		if(c.getConditionCodeCodingUserSelected() != null) {
			conditionsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionCodeCodingUserSelected()));
		}
		/******************** Condition_Code_Coding_Version ********************************************************************************/
		if(c.getConditionCodeCodingVersion() != null) {
			conditionsetcodeaddcoding.setVersion(c.getConditionCodeCodingVersion());
		}
		/******************** Condition_Code_Text ********************************************************************************/
		if(c.getConditionCodeText() != null) {
			conditionsetcode.setText(c.getConditionCodeText());
		}
		/******************** Condition_Encounter ********************************************************************************/
		if(c.getConditionEncounter() != null) {
			org.hl7.fhir.r4.model.Reference ConditionEncounterref = new org.hl7.fhir.r4.model.Reference();
			condition.setEncounter(ConditionEncounterref.setReference(c.getConditionEncounter()));
		}

		org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent conditionaddevidence = condition.addEvidence();


		org.hl7.fhir.r4.model.CodeableConcept conditionaddevidenceaddcode = conditionaddevidence.addCode();


		org.hl7.fhir.r4.model.Coding conditionaddevidenceaddcodeaddcoding = conditionaddevidenceaddcode.addCoding();

		/******************** Condition_Evidence_Code_Coding_Code ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingCode() != null) {
			conditionaddevidenceaddcodeaddcoding.setCode(c.getConditionEvidenceCodeCodingCode());
		}
		/******************** Condition_Evidence_Code_Coding_Display ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingDisplay() != null) {
			conditionaddevidenceaddcodeaddcoding.setDisplay(c.getConditionEvidenceCodeCodingDisplay());
		}
		/******************** Condition_Evidence_Code_Coding_System ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingSystem() != null) {
			conditionaddevidenceaddcodeaddcoding.setSystem(c.getConditionEvidenceCodeCodingSystem());
		}
		/******************** Condition_Evidence_Code_Coding_UserSelected ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingUserSelected() != null) {
			conditionaddevidenceaddcodeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionEvidenceCodeCodingUserSelected()));
		}
		/******************** Condition_Evidence_Code_Coding_Version ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingVersion() != null) {
			conditionaddevidenceaddcodeaddcoding.setVersion(c.getConditionEvidenceCodeCodingVersion());
		}
		/******************** Condition_Evidence_Code_Text ********************************************************************************/
		if(c.getConditionEvidenceCodeText() != null) {
			conditionaddevidenceaddcode.setText(c.getConditionEvidenceCodeText());
		}
		/******************** Condition_Evidence_Detail ********************************************************************************/
		if(c.getConditionEvidenceDetail() != null) {
			org.hl7.fhir.r4.model.Reference ConditionEvidenceDetailref = new org.hl7.fhir.r4.model.Reference();
			conditionaddevidence.addDetail(ConditionEvidenceDetailref.setReference(c.getConditionEvidenceDetail()));
		}

		org.hl7.fhir.r4.model.Identifier conditionaddidentifier = condition.addIdentifier();

		/******************** Condition_Identifier_Assigner ********************************************************************************/
		if(c.getConditionIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference ConditionIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			conditionaddidentifier.setAssigner(ConditionIdentifierAssignerref.setReference(c.getConditionIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period conditionaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		conditionaddidentifier.setPeriod(conditionaddidentifiersetperiod);

		/******************** Condition_Identifier_Period_End ********************************************************************************/
		if(c.getConditionIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat ConditionIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionIdentifierPeriodEnddate = ConditionIdentifierPeriodEndsdf.parse(c.getConditionIdentifierPeriodEnd());
			conditionaddidentifiersetperiod.setEnd(ConditionIdentifierPeriodEnddate);
		}
		/******************** Condition_Identifier_Period_Start ********************************************************************************/
		if(c.getConditionIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat ConditionIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionIdentifierPeriodStartdate = ConditionIdentifierPeriodStartsdf.parse(c.getConditionIdentifierPeriodStart());
			conditionaddidentifiersetperiod.setStart(ConditionIdentifierPeriodStartdate);
		}
		/******************** Condition_Identifier_System ********************************************************************************/
		if(c.getConditionIdentifierSystem() != null) {
			conditionaddidentifier.setSystem(c.getConditionIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		conditionaddidentifier.setType(conditionaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding conditionaddidentifiersettypeaddcoding = conditionaddidentifiersettype.addCoding();

		/******************** Condition_Identifier_Type_Coding_Code ********************************************************************************/
		if(c.getConditionIdentifierTypeCodingCode() != null) {
			conditionaddidentifiersettypeaddcoding.setCode(c.getConditionIdentifierTypeCodingCode());
		}
		/******************** Condition_Identifier_Type_Coding_Display ********************************************************************************/
		if(c.getConditionIdentifierTypeCodingDisplay() != null) {
			conditionaddidentifiersettypeaddcoding.setDisplay(c.getConditionIdentifierTypeCodingDisplay());
		}
		/******************** Condition_Identifier_Type_Coding_System ********************************************************************************/
		if(c.getConditionIdentifierTypeCodingSystem() != null) {
			conditionaddidentifiersettypeaddcoding.setSystem(c.getConditionIdentifierTypeCodingSystem());
		}
		/******************** Condition_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(c.getConditionIdentifierTypeCodingUserSelected() != null) {
			conditionaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionIdentifierTypeCodingUserSelected()));
		}
		/******************** Condition_Identifier_Type_Coding_Version ********************************************************************************/
		if(c.getConditionIdentifierTypeCodingVersion() != null) {
			conditionaddidentifiersettypeaddcoding.setVersion(c.getConditionIdentifierTypeCodingVersion());
		}
		/******************** Condition_Identifier_Type_Text ********************************************************************************/
		if(c.getConditionIdentifierTypeText() != null) {
			conditionaddidentifiersettype.setText(c.getConditionIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory conditionaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Condition_Identifier_Use_Code ********************************************************************************/
		if(c.getConditionIdentifierUseCode() != null) {
			conditionaddidentifier.setUse(conditionaddidentifiersetuseEnumFactory.fromCode(c.getConditionIdentifierUseCode()));

		}
		/******************** Condition_Identifier_Value ********************************************************************************/
		if(c.getConditionIdentifierValue() != null) {
			conditionaddidentifier.setValue(c.getConditionIdentifierValue());
		}

		org.hl7.fhir.r4.model.Annotation conditionaddnote = condition.addNote();

		/******************** Condition_Note_Author ********************************************************************************/
		if(c.getConditionNoteAuthor() != null) {
			conditionaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(c.getConditionNoteAuthor()));
		}
		/******************** Condition_Note_Text ********************************************************************************/
		if(c.getConditionNoteText() != null) {
			conditionaddnote.setText(c.getConditionNoteText());
		}
		/******************** Condition_Note_Time ********************************************************************************/
		if(c.getConditionNoteTime() != null) {
			java.text.SimpleDateFormat ConditionNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionNoteTimedate = ConditionNoteTimesdf.parse(c.getConditionNoteTime());
			conditionaddnote.setTime(ConditionNoteTimedate);
		}
		/******************** Condition_On ********************************************************************************/
		if(c.getConditionOn() != null) {
			condition.setOnset(new org.hl7.fhir.r4.model.StringType(c.getConditionOn()));
		}
		/******************** Condition_RecordedDate ********************************************************************************/
		if(c.getConditionRecordedDate() != null) {
			java.text.SimpleDateFormat ConditionRecordedDatesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionRecordedDatedate = ConditionRecordedDatesdf.parse(c.getConditionRecordedDate());
			condition.setRecordedDate(ConditionRecordedDatedate);
		}
		/******************** Condition_Recorder ********************************************************************************/
		if(c.getConditionRecorder() != null) {
			org.hl7.fhir.r4.model.Reference ConditionRecorderref = new org.hl7.fhir.r4.model.Reference();
			condition.setRecorder(ConditionRecorderref.setReference(c.getConditionRecorder()));
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionsetseverity = new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setSeverity(conditionsetseverity);


		org.hl7.fhir.r4.model.Coding conditionsetseverityaddcoding = conditionsetseverity.addCoding();

		/******************** Condition_Severity_Coding_Code ********************************************************************************/
		if(c.getConditionSeverityCodingCode() != null) { 
			conditionsetseverityaddcoding.setCode(c.getConditionSeverityCodingCode());
		}
		/******************** Condition_Severity_Coding_Display ********************************************************************************/
		if(c.getConditionSeverityCodingDisplay() != null) {
			conditionsetseverityaddcoding.setDisplay(c.getConditionSeverityCodingDisplay());
		}
		/******************** Condition_Severity_Coding_System ********************************************************************************/
		if(c.getConditionSeverityCodingSystem() != null) {
			conditionsetseverityaddcoding.setSystem(c.getConditionSeverityCodingSystem());
		}
		/******************** Condition_Severity_Coding_UserSelected ********************************************************************************/
		if(c.getConditionSeverityCodingUserSelected() != null) {
			conditionsetseverityaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionSeverityCodingUserSelected()));
		}
		/******************** Condition_Severity_Coding_Version ********************************************************************************/
		if(c.getConditionSeverityCodingVersion() != null) {
			conditionsetseverityaddcoding.setVersion(c.getConditionSeverityCodingVersion());
		}
		/******************** Condition_Severity_Text ********************************************************************************/
		if(c.getConditionSeverityText() != null) {
			conditionsetseverity.setText(c.getConditionSeverityText());
		}

		org.hl7.fhir.r4.model.Condition.ConditionStageComponent conditionaddstage = condition.addStage();

		/******************** Condition_Stage_Assessment ********************************************************************************/
		if(c.getConditionStageAssessment() != null) {
			org.hl7.fhir.r4.model.Reference ConditionStageAssessmentref = new org.hl7.fhir.r4.model.Reference();
			conditionaddstage.addAssessment(ConditionStageAssessmentref.setReference(c.getConditionStageAssessment()));
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddstagesetsummary = new org.hl7.fhir.r4.model.CodeableConcept();
		conditionaddstage.setSummary(conditionaddstagesetsummary);


		org.hl7.fhir.r4.model.Coding conditionaddstagesetsummaryaddcoding = conditionaddstagesetsummary.addCoding();

		/******************** Condition_Stage_Summary_Coding_Code ********************************************************************************/
		if(c.getConditionStageSummaryCodingCode() != null) {
			conditionaddstagesetsummaryaddcoding.setCode(c.getConditionStageSummaryCodingCode());
		}
		/******************** Condition_Stage_Summary_Coding_Display ********************************************************************************/
		if(c.getConditionStageSummaryCodingDisplay() != null) {
			conditionaddstagesetsummaryaddcoding.setDisplay(c.getConditionStageSummaryCodingDisplay());
		}
		/******************** Condition_Stage_Summary_Coding_System ********************************************************************************/
		if(c.getConditionStageSummaryCodingSystem() != null) {
			conditionaddstagesetsummaryaddcoding.setSystem(c.getConditionStageSummaryCodingSystem());
		}
		/******************** Condition_Stage_Summary_Coding_UserSelected ********************************************************************************/
		if(c.getConditionStageSummaryCodingUserSelected() != null) {
			conditionaddstagesetsummaryaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionStageSummaryCodingUserSelected()));
		}
		/******************** Condition_Stage_Summary_Coding_Version ********************************************************************************/
		if(c.getConditionStageSummaryCodingVersion() != null) {
			conditionaddstagesetsummaryaddcoding.setVersion(c.getConditionStageSummaryCodingVersion());
		}
		/******************** Condition_Stage_Summary_Text ********************************************************************************/
		if(c.getConditionStageSummaryText() != null) {
			conditionaddstagesetsummary.setText(c.getConditionStageSummaryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddstagesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		conditionaddstage.setType(conditionaddstagesettype);


		org.hl7.fhir.r4.model.Coding conditionaddstagesettypeaddcoding = conditionaddstagesettype.addCoding();

		/******************** Condition_Stage_Type_Coding_Code ********************************************************************************/
		if(c.getConditionStageTypeCodingCode() != null) {
			conditionaddstagesettypeaddcoding.setCode(c.getConditionStageTypeCodingCode());
		}
		/******************** Condition_Stage_Type_Coding_Display ********************************************************************************/
		if(c.getConditionStageTypeCodingDisplay() != null) {
			conditionaddstagesettypeaddcoding.setDisplay(c.getConditionStageTypeCodingDisplay());
		}
		/******************** Condition_Stage_Type_Coding_System ********************************************************************************/
		if(c.getConditionStageTypeCodingSystem() != null) {
			conditionaddstagesettypeaddcoding.setSystem(c.getConditionStageTypeCodingSystem());
		}
		/******************** Condition_Stage_Type_Coding_UserSelected ********************************************************************************/
		if(c.getConditionStageTypeCodingUserSelected() != null) {
			conditionaddstagesettypeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionStageTypeCodingUserSelected()));
		}
		/******************** Condition_Stage_Type_Coding_Version ********************************************************************************/
		if(c.getConditionStageTypeCodingVersion() != null) {
			conditionaddstagesettypeaddcoding.setVersion(c.getConditionStageTypeCodingVersion());
		}
		/******************** Condition_Stage_Type_Text ********************************************************************************/
		if(c.getConditionStageTypeText() != null) {
			conditionaddstagesettype.setText(c.getConditionStageTypeText());
		}
		/******************** Condition_Subject ********************************************************************************/
		if(c.getConditionSubject() != null) {
			org.hl7.fhir.r4.model.Reference ConditionSubjectref = new org.hl7.fhir.r4.model.Reference();
			condition.setSubject(ConditionSubjectref.setReference(c.getConditionSubject()));
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionsetverificationstatus = new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setVerificationStatus(conditionsetverificationstatus);


		org.hl7.fhir.r4.model.Coding conditionsetverificationstatusaddcoding = conditionsetverificationstatus.addCoding();

		/******************** Condition_VerificationStatus_Coding_Code ********************************************************************************/
		if(c.getConditionVerificationStatusCodingCode() != null) {
			conditionsetverificationstatusaddcoding.setCode(c.getConditionVerificationStatusCodingCode());
		}
		/******************** Condition_VerificationStatus_Coding_Display ********************************************************************************/
		if(c.getConditionVerificationStatusCodingDisplay() != null) {
			conditionsetverificationstatusaddcoding.setDisplay(c.getConditionVerificationStatusCodingDisplay());
		}
		/******************** Condition_VerificationStatus_Coding_System ********************************************************************************/
		if(c.getConditionVerificationStatusCodingSystem() != null) {
			conditionsetverificationstatusaddcoding.setSystem(c.getConditionVerificationStatusCodingSystem());
		}
		/******************** Condition_VerificationStatus_Coding_UserSelected ********************************************************************************/
		if(c.getConditionVerificationStatusCodingUserSelected() != null) {
			conditionsetverificationstatusaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionVerificationStatusCodingUserSelected()));
		}
		/******************** Condition_VerificationStatus_Coding_Version ********************************************************************************/
		if(c.getConditionVerificationStatusCodingVersion() != null) {
			conditionsetverificationstatusaddcoding.setVersion(c.getConditionVerificationStatusCodingVersion());
		}
		return condition;
	}
}
