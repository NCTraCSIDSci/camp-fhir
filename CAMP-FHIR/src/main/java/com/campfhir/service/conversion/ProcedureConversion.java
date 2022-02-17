package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Procedure;
public class ProcedureConversion 
{
	public org.hl7.fhir.r4.model.Procedure Procedures(Procedure p) throws ParseException
	{
		org.hl7.fhir.r4.model.Procedure procedure = new org.hl7.fhir.r4.model.Procedure();
		/******************** Procedure_Asserter ********************************************************************************/
		if(p.getProcedureAsserter() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureAsserterref = new org.hl7.fhir.r4.model.Reference();
			procedure.setAsserter(ProcedureAsserterref.setReference(p.getProcedureAsserter()));
		}
		/******************** Procedure_BasedOn ********************************************************************************/
		if(p.getProcedureBasedOn() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureBasedOnref = new org.hl7.fhir.r4.model.Reference();
			procedure.addBasedOn(ProcedureBasedOnref.setReference(p.getProcedureBasedOn()));
		}

		org.hl7.fhir.r4.model.CodeableConcept procedureaddbodysite = procedure.addBodySite();


		org.hl7.fhir.r4.model.Coding procedureaddbodysiteaddcoding = procedureaddbodysite.addCoding();

		/******************** Procedure_BodySite_Coding_Code ********************************************************************************/
		if(p.getProcedureBodySiteCodingCode() != null) {
			procedureaddbodysiteaddcoding.setCode(p.getProcedureBodySiteCodingCode());
		}
		/******************** Procedure_BodySite_Coding_Display ********************************************************************************/
		if(p.getProcedureBodySiteCodingDisplay() != null) {
			procedureaddbodysiteaddcoding.setDisplay(p.getProcedureBodySiteCodingDisplay());
		}
		/******************** Procedure_BodySite_Coding_System ********************************************************************************/
		if(p.getProcedureBodySiteCodingSystem() != null) {
			procedureaddbodysiteaddcoding.setSystem(p.getProcedureBodySiteCodingSystem());
		}
		/******************** Procedure_BodySite_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureBodySiteCodingUserSelected() != null) {
			procedureaddbodysiteaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureBodySiteCodingUserSelected()));
		}
		/******************** Procedure_BodySite_Coding_Version ********************************************************************************/
		if(p.getProcedureBodySiteCodingVersion() != null) {
			procedureaddbodysiteaddcoding.setVersion(p.getProcedureBodySiteCodingVersion());
		}
		/******************** Procedure_BodySite_Text ********************************************************************************/
		if(p.getProcedureBodySiteText() != null) {
			procedureaddbodysite.setText(p.getProcedureBodySiteText());
		}

		org.hl7.fhir.r4.model.CodeableConcept proceduresetcategory = new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.setCategory(proceduresetcategory);


		org.hl7.fhir.r4.model.Coding proceduresetcategoryaddcoding = proceduresetcategory.addCoding();

		/******************** Procedure_Category_Coding_Code ********************************************************************************/
		if(p.getProcedureCategoryCodingCode() != null) {
			proceduresetcategoryaddcoding.setCode(p.getProcedureCategoryCodingCode());
		}
		/******************** Procedure_Category_Coding_Display ********************************************************************************/
		if(p.getProcedureCategoryCodingDisplay() != null) {
			proceduresetcategoryaddcoding.setDisplay(p.getProcedureCategoryCodingDisplay());
		}
		/******************** Procedure_Category_Coding_System ********************************************************************************/
		if(p.getProcedureCategoryCodingSystem() != null) {
			proceduresetcategoryaddcoding.setSystem(p.getProcedureCategoryCodingSystem());
		}
		/******************** Procedure_Category_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureCategoryCodingUserSelected() != null) {
			proceduresetcategoryaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureCategoryCodingUserSelected()));
		}
		/******************** Procedure_Category_Coding_Version ********************************************************************************/
		if(p.getProcedureCategoryCodingVersion() != null) {
			proceduresetcategoryaddcoding.setVersion(p.getProcedureCategoryCodingVersion());
		}
		/******************** Procedure_Category_Text ********************************************************************************/
		if(p.getProcedureCategoryText() != null) {
			proceduresetcategory.setText(p.getProcedureCategoryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept proceduresetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.setCode(proceduresetcode);


		org.hl7.fhir.r4.model.Coding proceduresetcodeaddcoding = proceduresetcode.addCoding();

		/******************** Procedure_Code_Coding_Code ********************************************************************************/
		if(p.getProcedureCodeCodingCode() != null) {
			proceduresetcodeaddcoding.setCode(p.getProcedureCodeCodingCode());
		}
		/******************** Procedure_Code_Coding_Display ********************************************************************************/
		if(p.getProcedureCodeCodingDisplay() != null) {
			proceduresetcodeaddcoding.setDisplay(p.getProcedureCodeCodingDisplay());
		}
		/******************** Procedure_Code_Coding_System ********************************************************************************/
		if(p.getProcedureCodeCodingSystem() != null) {
			proceduresetcodeaddcoding.setSystem(p.getProcedureCodeCodingSystem());
		}
		/******************** Procedure_Code_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureCodeCodingUserSelected() != null) {
			proceduresetcodeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureCodeCodingUserSelected()));
		}
		/******************** Procedure_Code_Coding_Version ********************************************************************************/
		if(p.getProcedureCodeCodingVersion() != null) {
			proceduresetcodeaddcoding.setVersion(p.getProcedureCodeCodingVersion());
		}
		/******************** Procedure_Code_Text ********************************************************************************/
		if(p.getProcedureCodeText() != null) {
			proceduresetcode.setText(p.getProcedureCodeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept procedureaddcomplication = procedure.addComplication();


		org.hl7.fhir.r4.model.Coding procedureaddcomplicationaddcoding = procedureaddcomplication.addCoding();

		/******************** Procedure_Complication_Coding_Code ********************************************************************************/
		if(p.getProcedureComplicationCodingCode() != null) {
			procedureaddcomplicationaddcoding.setCode(p.getProcedureComplicationCodingCode());
		}
		/******************** Procedure_Complication_Coding_Display ********************************************************************************/
		if(p.getProcedureComplicationCodingDisplay() != null) {
			procedureaddcomplicationaddcoding.setDisplay(p.getProcedureComplicationCodingDisplay());
		}
		/******************** Procedure_Complication_Coding_System ********************************************************************************/
		if(p.getProcedureComplicationCodingSystem() != null) {
			procedureaddcomplicationaddcoding.setSystem(p.getProcedureComplicationCodingSystem());
		}
		/******************** Procedure_Complication_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureComplicationCodingUserSelected() != null) {
			procedureaddcomplicationaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureComplicationCodingUserSelected()));
		}
		/******************** Procedure_Complication_Coding_Version ********************************************************************************/
		if(p.getProcedureComplicationCodingVersion() != null) {
			procedureaddcomplicationaddcoding.setVersion(p.getProcedureComplicationCodingVersion());
		}
		/******************** Procedure_Complication_Text ********************************************************************************/
		if(p.getProcedureComplicationText() != null) {
			procedureaddcomplication.setText(p.getProcedureComplicationText());
		}
		/******************** Procedure_ComplicationDetail ********************************************************************************/
		if(p.getProcedureComplicationDetail() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureComplicationDetailref = new org.hl7.fhir.r4.model.Reference();
			procedure.addComplicationDetail(ProcedureComplicationDetailref.setReference(p.getProcedureComplicationDetail()));
		}
		/******************** Procedure_Encounter ********************************************************************************/
		if(p.getProcedureEncounter() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureEncounterref = new org.hl7.fhir.r4.model.Reference();
			procedure.setEncounter(ProcedureEncounterref.setReference(p.getProcedureEncounter()));
		}

		org.hl7.fhir.r4.model.Procedure.ProcedureFocalDeviceComponent procedureaddfocaldevice = procedure.addFocalDevice();


		org.hl7.fhir.r4.model.CodeableConcept procedureaddfocaldevicesetaction = new org.hl7.fhir.r4.model.CodeableConcept();
		procedureaddfocaldevice.setAction(procedureaddfocaldevicesetaction);


		org.hl7.fhir.r4.model.Coding procedureaddfocaldevicesetactionaddcoding = procedureaddfocaldevicesetaction.addCoding();

		/******************** Procedure_FocalDevice_Action_Coding_Code ********************************************************************************/
		if(p.getProcedureFocalDeviceActionCodingCode() != null) {
			procedureaddfocaldevicesetactionaddcoding.setCode(p.getProcedureFocalDeviceActionCodingCode());
		}
		/******************** Procedure_FocalDevice_Action_Coding_Display ********************************************************************************/
		if(p.getProcedureFocalDeviceActionCodingDisplay() != null) {
			procedureaddfocaldevicesetactionaddcoding.setDisplay(p.getProcedureFocalDeviceActionCodingDisplay());
		}
		/******************** Procedure_FocalDevice_Action_Coding_System ********************************************************************************/
		if(p.getProcedureFocalDeviceActionCodingSystem() != null) {
			procedureaddfocaldevicesetactionaddcoding.setSystem(p.getProcedureFocalDeviceActionCodingSystem());
		}
		/******************** Procedure_FocalDevice_Action_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureFocalDeviceActionCodingUserSelected() != null) {
			procedureaddfocaldevicesetactionaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureFocalDeviceActionCodingUserSelected()));
		}
		/******************** Procedure_FocalDevice_Action_Coding_Version ********************************************************************************/
		if(p.getProcedureFocalDeviceActionCodingVersion() != null) {
			procedureaddfocaldevicesetactionaddcoding.setVersion(p.getProcedureFocalDeviceActionCodingVersion());
		}
		/******************** Procedure_FocalDevice_Action_Text ********************************************************************************/
		if(p.getProcedureFocalDeviceActionText() != null) {
			procedureaddfocaldevicesetaction.setText(p.getProcedureFocalDeviceActionText());
		}
		/******************** Procedure_FocalDevice_Manipulated ********************************************************************************/
		if(p.getProcedureFocalDeviceManipulated() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureFocalDeviceManipulatedref = new org.hl7.fhir.r4.model.Reference();
			procedureaddfocaldevice.setManipulated(ProcedureFocalDeviceManipulatedref.setReference(p.getProcedureFocalDeviceManipulated()));
		}

		org.hl7.fhir.r4.model.CodeableConcept procedureaddfollowup = procedure.addFollowUp();


		org.hl7.fhir.r4.model.Coding procedureaddfollowupaddcoding = procedureaddfollowup.addCoding();

		/******************** Procedure_FollowUp_Coding_Code ********************************************************************************/
		if(p.getProcedureFollowUpCodingCode() != null) {
			procedureaddfollowupaddcoding.setCode(p.getProcedureFollowUpCodingCode());
		}
		/******************** Procedure_FollowUp_Coding_Display ********************************************************************************/
		if(p.getProcedureFollowUpCodingDisplay() != null) {
			procedureaddfollowupaddcoding.setDisplay(p.getProcedureFollowUpCodingDisplay());
		}
		/******************** Procedure_FollowUp_Coding_System ********************************************************************************/
		if(p.getProcedureFollowUpCodingSystem() != null) {
			procedureaddfollowupaddcoding.setSystem(p.getProcedureFollowUpCodingSystem());
		}
		/******************** Procedure_FollowUp_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureFollowUpCodingUserSelected() != null) {
			procedureaddfollowupaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureFollowUpCodingUserSelected()));
		}
		/******************** Procedure_FollowUp_Coding_Version ********************************************************************************/
		if(p.getProcedureFollowUpCodingVersion() != null) {
			procedureaddfollowupaddcoding.setVersion(p.getProcedureFollowUpCodingVersion());
		}
		/******************** Procedure_FollowUp_Text ********************************************************************************/
		if(p.getProcedureFollowUpText() != null) {
			procedureaddfollowup.setText(p.getProcedureFollowUpText());
		}

		org.hl7.fhir.r4.model.Identifier procedureaddidentifier = procedure.addIdentifier();

		/******************** Procedure_Identifier_Assigner ********************************************************************************/
		if(p.getProcedureIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			procedureaddidentifier.setAssigner(ProcedureIdentifierAssignerref.setReference(p.getProcedureIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period procedureaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		procedureaddidentifier.setPeriod(procedureaddidentifiersetperiod);

		/******************** Procedure_Identifier_Period_End ********************************************************************************/
		if(p.getProcedureIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat ProcedureIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ProcedureIdentifierPeriodEnddate = ProcedureIdentifierPeriodEndsdf.parse(p.getProcedureIdentifierPeriodEnd());
			procedureaddidentifiersetperiod.setEnd(ProcedureIdentifierPeriodEnddate);
		}
		/******************** Procedure_Identifier_Period_Start ********************************************************************************/
		if(p.getProcedureIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat ProcedureIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ProcedureIdentifierPeriodStartdate = ProcedureIdentifierPeriodStartsdf.parse(p.getProcedureIdentifierPeriodStart());
			procedureaddidentifiersetperiod.setStart(ProcedureIdentifierPeriodStartdate);
		}
		/******************** Procedure_Identifier_System ********************************************************************************/
		if(p.getProcedureIdentifierSystem() != null) {
			procedureaddidentifier.setSystem(p.getProcedureIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept procedureaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		procedureaddidentifier.setType(procedureaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding procedureaddidentifiersettypeaddcoding = procedureaddidentifiersettype.addCoding();

		/******************** Procedure_Identifier_Type_Coding_Code ********************************************************************************/
		if(p.getProcedureIdentifierTypeCodingCode() != null) {
			procedureaddidentifiersettypeaddcoding.setCode(p.getProcedureIdentifierTypeCodingCode());
		}
		/******************** Procedure_Identifier_Type_Coding_Display ********************************************************************************/
		if(p.getProcedureIdentifierTypeCodingDisplay() != null) {
			procedureaddidentifiersettypeaddcoding.setDisplay(p.getProcedureIdentifierTypeCodingDisplay());
		}
		/******************** Procedure_Identifier_Type_Coding_System ********************************************************************************/
		if(p.getProcedureIdentifierTypeCodingSystem() != null) {
			procedureaddidentifiersettypeaddcoding.setSystem(p.getProcedureIdentifierTypeCodingSystem());
		}
		/******************** Procedure_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureIdentifierTypeCodingUserSelected() != null) {
			procedureaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureIdentifierTypeCodingUserSelected()));
		}
		/******************** Procedure_Identifier_Type_Coding_Version ********************************************************************************/
		if(p.getProcedureIdentifierTypeCodingVersion() != null) {
			procedureaddidentifiersettypeaddcoding.setVersion(p.getProcedureIdentifierTypeCodingVersion());
		}
		/******************** Procedure_Identifier_Type_Text ********************************************************************************/
		if(p.getProcedureIdentifierTypeText() != null) {
			procedureaddidentifiersettype.setText(p.getProcedureIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory procedureaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Procedure_Identifier_Use_Code ********************************************************************************/
		if(p.getProcedureIdentifierUseCode() != null) {
			procedureaddidentifier.setUse(procedureaddidentifiersetuseEnumFactory.fromCode(p.getProcedureIdentifierUseCode()));

		}
		/******************** Procedure_Identifier_Value ********************************************************************************/
		if(p.getProcedureIdentifierValue() != null) {
			procedureaddidentifier.setValue(p.getProcedureIdentifierValue());
		}
		/******************** Procedure_InstantiatesCanonical ********************************************************************************/
		if(p.getProcedureInstantiatesCanonical() != null) {
			procedure.addInstantiatesCanonical(p.getProcedureInstantiatesCanonical());
		}
		/******************** Procedure_InstantiatesUri ********************************************************************************/
		if(p.getProcedureInstantiatesUri() != null) {
			procedure.addInstantiatesUri(p.getProcedureInstantiatesUri());
		}
		/******************** Procedure_Location ********************************************************************************/
		if(p.getProcedureLocation() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureLocationref = new org.hl7.fhir.r4.model.Reference();
			procedure.setLocation(ProcedureLocationref.setReference(p.getProcedureLocation()));
		}

		org.hl7.fhir.r4.model.Annotation procedureaddnote = procedure.addNote();

		/******************** Procedure_Note_Author ********************************************************************************/
		if(p.getProcedureNoteAuthor() != null) {
			procedureaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(p.getProcedureNoteAuthor()));
		}
		/******************** Procedure_Note_Text ********************************************************************************/
		if(p.getProcedureNoteText() != null) {
			procedureaddnote.setText(p.getProcedureNoteText());
		}
		/******************** Procedure_Note_Time ********************************************************************************/
		if(p.getProcedureNoteTime() != null) {
			java.text.SimpleDateFormat ProcedureNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ProcedureNoteTimedate = ProcedureNoteTimesdf.parse(p.getProcedureNoteTime());
			procedureaddnote.setTime(ProcedureNoteTimedate);
		}

		org.hl7.fhir.r4.model.CodeableConcept proceduresetoutcome = new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.setOutcome(proceduresetoutcome);


		org.hl7.fhir.r4.model.Coding proceduresetoutcomeaddcoding = proceduresetoutcome.addCoding();

		/******************** Procedure_Outcome_Coding_Code ********************************************************************************/
		if(p.getProcedureOutcomeCodingCode() != null) {
			proceduresetoutcomeaddcoding.setCode(p.getProcedureOutcomeCodingCode());
		}
		/******************** Procedure_Outcome_Coding_Display ********************************************************************************/
		if(p.getProcedureOutcomeCodingDisplay() != null) {
			proceduresetoutcomeaddcoding.setDisplay(p.getProcedureOutcomeCodingDisplay());
		}
		/******************** Procedure_Outcome_Coding_System ********************************************************************************/
		if(p.getProcedureOutcomeCodingSystem() != null) {
			proceduresetoutcomeaddcoding.setSystem(p.getProcedureOutcomeCodingSystem());
		}
		/******************** Procedure_Outcome_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureOutcomeCodingUserSelected() != null) {
			proceduresetoutcomeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureOutcomeCodingUserSelected()));
		}
		/******************** Procedure_Outcome_Coding_Version ********************************************************************************/
		if(p.getProcedureOutcomeCodingVersion() != null) {
			proceduresetoutcomeaddcoding.setVersion(p.getProcedureOutcomeCodingVersion());
		}
		/******************** Procedure_Outcome_Text ********************************************************************************/
		if(p.getProcedureOutcomeText() != null) {
			proceduresetoutcome.setText(p.getProcedureOutcomeText());
		}
		/******************** Procedure_PartOf ********************************************************************************/
		if(p.getProcedurePartOf() != null) {
			org.hl7.fhir.r4.model.Reference ProcedurePartOfref = new org.hl7.fhir.r4.model.Reference();
			procedure.addPartOf(ProcedurePartOfref.setReference(p.getProcedurePartOf()));
		}
		/******************** Procedure_Performed ********************************************************************************/
		if(p.getProcedurePerformed() != null) {
			procedure.setPerformed(new org.hl7.fhir.r4.model.StringType(p.getProcedurePerformed()));
		}

		org.hl7.fhir.r4.model.Procedure.ProcedurePerformerComponent procedureaddperformer = procedure.addPerformer();

		/******************** Procedure_Performer_Actor ********************************************************************************/
		if(p.getProcedurePerformerActor() != null) {
			org.hl7.fhir.r4.model.Reference ProcedurePerformerActorref = new org.hl7.fhir.r4.model.Reference();
			procedureaddperformer.setActor(ProcedurePerformerActorref.setReference(p.getProcedurePerformerActor()));
		}

		org.hl7.fhir.r4.model.CodeableConcept procedureaddperformersetfunction = new org.hl7.fhir.r4.model.CodeableConcept();
		procedureaddperformer.setFunction(procedureaddperformersetfunction);


		org.hl7.fhir.r4.model.Coding procedureaddperformersetfunctionaddcoding = procedureaddperformersetfunction.addCoding();

		/******************** Procedure_Performer_Function_Coding_Code ********************************************************************************/
		if(p.getProcedurePerformerFunctionCodingCode() != null) {
			procedureaddperformersetfunctionaddcoding.setCode(p.getProcedurePerformerFunctionCodingCode());
		}
		/******************** Procedure_Performer_Function_Coding_Display ********************************************************************************/
		if(p.getProcedurePerformerFunctionCodingDisplay() != null) {
			procedureaddperformersetfunctionaddcoding.setDisplay(p.getProcedurePerformerFunctionCodingDisplay());
		}
		/******************** Procedure_Performer_Function_Coding_System ********************************************************************************/
		if(p.getProcedurePerformerFunctionCodingSystem() != null) {
			procedureaddperformersetfunctionaddcoding.setSystem(p.getProcedurePerformerFunctionCodingSystem());
		}
		/******************** Procedure_Performer_Function_Coding_UserSelected ********************************************************************************/
		if(p.getProcedurePerformerFunctionCodingUserSelected() != null) {
			procedureaddperformersetfunctionaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedurePerformerFunctionCodingUserSelected()));
		}
		/******************** Procedure_Performer_Function_Coding_Version ********************************************************************************/
		if(p.getProcedurePerformerFunctionCodingVersion() != null) {
			procedureaddperformersetfunctionaddcoding.setVersion(p.getProcedurePerformerFunctionCodingVersion());
		}
		/******************** Procedure_Performer_Function_Text ********************************************************************************/
		if(p.getProcedurePerformerFunctionText() != null) {
			procedureaddperformersetfunction.setText(p.getProcedurePerformerFunctionText());
		}
		/******************** Procedure_Performer_OnBehalfOf ********************************************************************************/
		if(p.getProcedurePerformerOnBehalfOf() != null) {
			org.hl7.fhir.r4.model.Reference ProcedurePerformerOnBehalfOfref = new org.hl7.fhir.r4.model.Reference();
			procedureaddperformer.setOnBehalfOf(ProcedurePerformerOnBehalfOfref.setReference(p.getProcedurePerformerOnBehalfOf()));
		}

		org.hl7.fhir.r4.model.CodeableConcept procedureaddreasoncode = procedure.addReasonCode();


		org.hl7.fhir.r4.model.Coding procedureaddreasoncodeaddcoding = procedureaddreasoncode.addCoding();

		/******************** Procedure_ReasonCode_Coding_Code ********************************************************************************/
		if(p.getProcedureReasonCodeCodingCode() != null) {
			procedureaddreasoncodeaddcoding.setCode(p.getProcedureReasonCodeCodingCode());
		}
		/******************** Procedure_ReasonCode_Coding_Display ********************************************************************************/
		if(p.getProcedureReasonCodeCodingDisplay() != null) {
			procedureaddreasoncodeaddcoding.setDisplay(p.getProcedureReasonCodeCodingDisplay());
		}
		/******************** Procedure_ReasonCode_Coding_System ********************************************************************************/
		if(p.getProcedureReasonCodeCodingSystem() != null) {
			procedureaddreasoncodeaddcoding.setSystem(p.getProcedureReasonCodeCodingSystem());
		}
		/******************** Procedure_ReasonCode_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureReasonCodeCodingUserSelected() != null) {
			procedureaddreasoncodeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureReasonCodeCodingUserSelected()));
		}
		/******************** Procedure_ReasonCode_Coding_Version ********************************************************************************/
		if(p.getProcedureReasonCodeCodingVersion() != null) {
			procedureaddreasoncodeaddcoding.setVersion(p.getProcedureReasonCodeCodingVersion());
		}
		/******************** Procedure_ReasonCode_Text ********************************************************************************/
		if(p.getProcedureReasonCodeText() != null) {
			procedureaddreasoncode.setText(p.getProcedureReasonCodeText());
		}
		/******************** Procedure_ReasonReference ********************************************************************************/
		if(p.getProcedureReasonReference() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureReasonReferenceref = new org.hl7.fhir.r4.model.Reference();
			procedure.addReasonReference(ProcedureReasonReferenceref.setReference(p.getProcedureReasonReference()));
		}
		/******************** Procedure_Recorder ********************************************************************************/
		if(p.getProcedureRecorder() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureRecorderref = new org.hl7.fhir.r4.model.Reference();
			procedure.setRecorder(ProcedureRecorderref.setReference(p.getProcedureRecorder()));
		}
		/******************** Procedure_Report ********************************************************************************/
		if(p.getProcedureReport() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureReportref = new org.hl7.fhir.r4.model.Reference();
			procedure.addReport(ProcedureReportref.setReference(p.getProcedureReport()));
		}

		org.hl7.fhir.r4.model.Procedure.ProcedureStatusEnumFactory proceduresetstatusEnumFactory = new org.hl7.fhir.r4.model.Procedure.ProcedureStatusEnumFactory();

		/******************** Procedure_Status_Code ********************************************************************************/
		if(p.getProcedureStatusCode() != null) {
			procedure.setStatus(proceduresetstatusEnumFactory.fromCode(p.getProcedureStatusCode()));

		}

		org.hl7.fhir.r4.model.CodeableConcept proceduresetstatusreason = new org.hl7.fhir.r4.model.CodeableConcept();
		procedure.setStatusReason(proceduresetstatusreason);


		org.hl7.fhir.r4.model.Coding proceduresetstatusreasonaddcoding = proceduresetstatusreason.addCoding();

		/******************** Procedure_StatusReason_Coding_Code ********************************************************************************/
		if(p.getProcedureStatusReasonCodingCode() != null) {
			proceduresetstatusreasonaddcoding.setCode(p.getProcedureStatusReasonCodingCode());
		}
		/******************** Procedure_StatusReason_Coding_Display ********************************************************************************/
		if(p.getProcedureStatusReasonCodingDisplay() != null) {
			proceduresetstatusreasonaddcoding.setDisplay(p.getProcedureStatusReasonCodingDisplay());
		}
		/******************** Procedure_StatusReason_Coding_System ********************************************************************************/
		if(p.getProcedureStatusReasonCodingSystem() != null) {
			proceduresetstatusreasonaddcoding.setSystem(p.getProcedureStatusReasonCodingSystem());
		}
		/******************** Procedure_StatusReason_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureStatusReasonCodingUserSelected() != null) {
			proceduresetstatusreasonaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureStatusReasonCodingUserSelected()));
		}
		/******************** Procedure_StatusReason_Coding_Version ********************************************************************************/
		if(p.getProcedureStatusReasonCodingVersion() != null) {
			proceduresetstatusreasonaddcoding.setVersion(p.getProcedureStatusReasonCodingVersion());
		}
		/******************** Procedure_StatusReason_Text ********************************************************************************/
		if(p.getProcedureStatusReasonText() != null) {
			proceduresetstatusreason.setText(p.getProcedureStatusReasonText());
		}
		/******************** Procedure_Subject ********************************************************************************/
		if(p.getProcedureSubject() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureSubjectref = new org.hl7.fhir.r4.model.Reference();
			procedure.setSubject(ProcedureSubjectref.setReference(p.getProcedureSubject()));
		}

		org.hl7.fhir.r4.model.CodeableConcept procedureaddusedcode = procedure.addUsedCode();


		org.hl7.fhir.r4.model.Coding procedureaddusedcodeaddcoding = procedureaddusedcode.addCoding();

		/******************** Procedure_UsedCode_Coding_Code ********************************************************************************/
		if(p.getProcedureUsedCodeCodingCode() != null) {
			procedureaddusedcodeaddcoding.setCode(p.getProcedureUsedCodeCodingCode());
		}
		/******************** Procedure_UsedCode_Coding_Display ********************************************************************************/
		if(p.getProcedureUsedCodeCodingDisplay() != null) {
			procedureaddusedcodeaddcoding.setDisplay(p.getProcedureUsedCodeCodingDisplay());
		}
		/******************** Procedure_UsedCode_Coding_System ********************************************************************************/
		if(p.getProcedureUsedCodeCodingSystem() != null) {
			procedureaddusedcodeaddcoding.setSystem(p.getProcedureUsedCodeCodingSystem());
		}
		/******************** Procedure_UsedCode_Coding_UserSelected ********************************************************************************/
		if(p.getProcedureUsedCodeCodingUserSelected() != null) {
			procedureaddusedcodeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureUsedCodeCodingUserSelected()));
		}
		/******************** Procedure_UsedCode_Coding_Version ********************************************************************************/
		if(p.getProcedureUsedCodeCodingVersion() != null) {
			procedureaddusedcodeaddcoding.setVersion(p.getProcedureUsedCodeCodingVersion());
		}
		/******************** Procedure_UsedCode_Text ********************************************************************************/
		if(p.getProcedureUsedCodeText() != null) {
			procedureaddusedcode.setText(p.getProcedureUsedCodeText());
		}
		return procedure;
	}
}
