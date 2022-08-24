package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Procedure;
public class ProcedureConversion 
{
	public org.hl7.fhir.r4.model.Procedure Procedures(Procedure p) throws ParseException
	{
		org.hl7.fhir.r4.model.Procedure procedure = new org.hl7.fhir.r4.model.Procedure();

		/******************** id ********************************************************************************/
		procedure.setId(p.getId());

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
		/******************** Procedure_BodySite_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureBodySiteCodingUsrslt() != null) {
			procedureaddbodysiteaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureBodySiteCodingUsrslt()));
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
		/******************** Procedure_Category_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureCategoryCodingUsrslt() != null) {
			proceduresetcategoryaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureCategoryCodingUsrslt()));
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
		/******************** Procedure_Code_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureCodeCodingUsrslt() != null) {
			proceduresetcodeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureCodeCodingUsrslt()));
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
		/******************** Procedure_Complication_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureComplicationCodingUsrslt() != null) {
			procedureaddcomplicationaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureComplicationCodingUsrslt()));
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
		/******************** Procedure_Enc ********************************************************************************/
		if(p.getProcedureEnc() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureEncref = new org.hl7.fhir.r4.model.Reference();
			procedure.setEncounter(ProcedureEncref.setReference(p.getProcedureEnc()));
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
		/******************** Procedure_FocalDevice_Action_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureFocalDeviceActionCodingUsrslt() != null) {
			procedureaddfocaldevicesetactionaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureFocalDeviceActionCodingUsrslt()));
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
		/******************** Procedure_FollowUp_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureFollowUpCodingUsrslt() != null) {
			procedureaddfollowupaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureFollowUpCodingUsrslt()));
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

		/******************** Procedure_Id_Assigner ********************************************************************************/
		if(p.getProcedureIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			procedureaddidentifier.setAssigner(ProcedureIdAssignerref.setReference(p.getProcedureIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period procedureaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		procedureaddidentifier.setPeriod(procedureaddidentifiersetperiod);

		/******************** Procedure_Id_Period_End ********************************************************************************/
		if(p.getProcedureIdPeriodEnd() != null) {
			java.text.SimpleDateFormat ProcedureIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ProcedureIdPeriodEnddate = ProcedureIdPeriodEndsdf.parse(p.getProcedureIdPeriodEnd());
			procedureaddidentifiersetperiod.setEnd(ProcedureIdPeriodEnddate);
		}
		/******************** Procedure_Id_Period_Start ********************************************************************************/
		if(p.getProcedureIdPeriodStart() != null) {
			java.text.SimpleDateFormat ProcedureIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ProcedureIdPeriodStartdate = ProcedureIdPeriodStartsdf.parse(p.getProcedureIdPeriodStart());
			procedureaddidentifiersetperiod.setStart(ProcedureIdPeriodStartdate);
		}
		/******************** Procedure_Id_System ********************************************************************************/
		if(p.getProcedureIdSystem() != null) {
			procedureaddidentifier.setSystem(p.getProcedureIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept procedureaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		procedureaddidentifier.setType(procedureaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding procedureaddidentifiersettypeaddcoding = procedureaddidentifiersettype.addCoding();

		/******************** Procedure_Id_Type_Coding_Code ********************************************************************************/
		if(p.getProcedureIdTypeCodingCode() != null) {
			procedureaddidentifiersettypeaddcoding.setCode(p.getProcedureIdTypeCodingCode());
		}
		/******************** Procedure_Id_Type_Coding_Display ********************************************************************************/
		if(p.getProcedureIdTypeCodingDisplay() != null) {
			procedureaddidentifiersettypeaddcoding.setDisplay(p.getProcedureIdTypeCodingDisplay());
		}
		/******************** Procedure_Id_Type_Coding_System ********************************************************************************/
		if(p.getProcedureIdTypeCodingSystem() != null) {
			procedureaddidentifiersettypeaddcoding.setSystem(p.getProcedureIdTypeCodingSystem());
		}
		/******************** Procedure_Id_Type_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureIdTypeCodingUsrslt() != null) {
			procedureaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureIdTypeCodingUsrslt()));
		}
		/******************** Procedure_Id_Type_Coding_Version ********************************************************************************/
		if(p.getProcedureIdTypeCodingVersion() != null) {
			procedureaddidentifiersettypeaddcoding.setVersion(p.getProcedureIdTypeCodingVersion());
		}
		/******************** Procedure_Id_Type_Text ********************************************************************************/
		if(p.getProcedureIdTypeText() != null) {
			procedureaddidentifiersettype.setText(p.getProcedureIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory procedureaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Procedure_Id_Use_Code ********************************************************************************/
		if(p.getProcedureIdUseCode() != null) {
			procedureaddidentifier.setUse(procedureaddidentifiersetuseEnumFactory.fromCode(p.getProcedureIdUseCode()));

		}
		/******************** Procedure_Id_Value ********************************************************************************/
		if(p.getProcedureIdValue() != null) {
			procedureaddidentifier.setValue(p.getProcedureIdValue());
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

		/******************** Procedure_Note_AuthorReference ********************************************************************************/
		if(p.getProcedureNoteAuthorReference() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureNoteAuthorReferenceref = new org.hl7.fhir.r4.model.Reference();
			procedureaddnote.setAuthor(ProcedureNoteAuthorReferenceref.setReference(p.getProcedureNoteAuthorReference()));
		}
		/******************** Procedure_Note_AuthorString ********************************************************************************/
		if(p.getProcedureNoteAuthorString() != null) {
			procedureaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(p.getProcedureNoteAuthorString()));
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
		/******************** Procedure_Outcome_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureOutcomeCodingUsrslt() != null) {
			proceduresetoutcomeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureOutcomeCodingUsrslt()));
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
		/******************** Procedure_PerformedDateTime ********************************************************************************/
		if(p.getProcedurePerformedDateTime() != null) {
			procedure.setPerformed(new org.hl7.fhir.r4.model.DateTimeType(p.getProcedurePerformedDateTime()));
		}

		if( p.getProcedurePerformedPeriodEnd() != null || p.getProcedurePerformedPeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period proceduresetperformedPeriod = new org.hl7.fhir.r4.model.Period();
			procedure.setPerformed(proceduresetperformedPeriod);

		/******************** Procedure_Performed_Period_End ********************************************************************************/
		if(p.getProcedurePerformedPeriodEnd() != null) {
			java.text.SimpleDateFormat ProcedurePerformedPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ProcedurePerformedPeriodEnddate = ProcedurePerformedPeriodEndsdf.parse(p.getProcedurePerformedPeriodEnd());
			proceduresetperformedPeriod.setEnd(ProcedurePerformedPeriodEnddate);
		}
		/******************** Procedure_Performed_Period_Start ********************************************************************************/
		if(p.getProcedurePerformedPeriodStart() != null) {
			java.text.SimpleDateFormat ProcedurePerformedPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ProcedurePerformedPeriodStartdate = ProcedurePerformedPeriodStartsdf.parse(p.getProcedurePerformedPeriodStart());
			proceduresetperformedPeriod.setStart(ProcedurePerformedPeriodStartdate);
		}
		}

		if( p.getProcedurePerformedRangeHighCode() != null || p.getProcedurePerformedRangeHighCompartrCode() != null || p.getProcedurePerformedRangeHighSystem() != null || p.getProcedurePerformedRangeHighUnit() != null || p.getProcedurePerformedRangeHighValue() != null || p.getProcedurePerformedRangeLowCode() != null || p.getProcedurePerformedRangeLowCompartrCode() != null || p.getProcedurePerformedRangeLowSystem() != null || p.getProcedurePerformedRangeLowUnit() != null || p.getProcedurePerformedRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range proceduresetperformedRange = new org.hl7.fhir.r4.model.Range();
			procedure.setPerformed(proceduresetperformedRange);


		org.hl7.fhir.r4.model.Quantity proceduresetperformedRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		proceduresetperformedRange.setHigh(proceduresetperformedRangesethigh);

		/******************** Procedure_Performed_Range_High_Code ********************************************************************************/
		if(p.getProcedurePerformedRangeHighCode() != null) {
			proceduresetperformedRangesethigh.setCode(p.getProcedurePerformedRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory proceduresetperformedRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Procedure_Performed_Range_High_Compartr_Code ********************************************************************************/
		if(p.getProcedurePerformedRangeHighCompartrCode() != null) {
			proceduresetperformedRangesethigh.setComparator(proceduresetperformedRangesethighsetcomparatorEnumFactory.fromCode(p.getProcedurePerformedRangeHighCompartrCode()));

		}
		/******************** Procedure_Performed_Range_High_System ********************************************************************************/
		if(p.getProcedurePerformedRangeHighSystem() != null) {
			proceduresetperformedRangesethigh.setSystem(p.getProcedurePerformedRangeHighSystem());
		}
		/******************** Procedure_Performed_Range_High_Unit ********************************************************************************/
		if(p.getProcedurePerformedRangeHighUnit() != null) {
			proceduresetperformedRangesethigh.setUnit(p.getProcedurePerformedRangeHighUnit());
		}
		/******************** Procedure_Performed_Range_High_Value ********************************************************************************/
		if(p.getProcedurePerformedRangeHighValue() != null) {
			proceduresetperformedRangesethigh.setValue(Double.parseDouble((p.getProcedurePerformedRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity proceduresetperformedRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		proceduresetperformedRange.setLow(proceduresetperformedRangesetlow);

		/******************** Procedure_Performed_Range_Low_Code ********************************************************************************/
		if(p.getProcedurePerformedRangeLowCode() != null) {
			proceduresetperformedRangesetlow.setCode(p.getProcedurePerformedRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory proceduresetperformedRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Procedure_Performed_Range_Low_Compartr_Code ********************************************************************************/
		if(p.getProcedurePerformedRangeLowCompartrCode() != null) {
			proceduresetperformedRangesetlow.setComparator(proceduresetperformedRangesetlowsetcomparatorEnumFactory.fromCode(p.getProcedurePerformedRangeLowCompartrCode()));

		}
		/******************** Procedure_Performed_Range_Low_System ********************************************************************************/
		if(p.getProcedurePerformedRangeLowSystem() != null) {
			proceduresetperformedRangesetlow.setSystem(p.getProcedurePerformedRangeLowSystem());
		}
		/******************** Procedure_Performed_Range_Low_Unit ********************************************************************************/
		if(p.getProcedurePerformedRangeLowUnit() != null) {
			proceduresetperformedRangesetlow.setUnit(p.getProcedurePerformedRangeLowUnit());
		}
		/******************** Procedure_Performed_Range_Low_Value ********************************************************************************/
		if(p.getProcedurePerformedRangeLowValue() != null) {
			proceduresetperformedRangesetlow.setValue(Double.parseDouble((p.getProcedurePerformedRangeLowValue())));
		}
		}
		/******************** Procedure_PerformedString ********************************************************************************/
		if(p.getProcedurePerformedString() != null) {
			procedure.setPerformed(new org.hl7.fhir.r4.model.StringType(p.getProcedurePerformedString()));
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
		/******************** Procedure_Performer_Function_Coding_Usrslt ********************************************************************************/
		if(p.getProcedurePerformerFunctionCodingUsrslt() != null) {
			procedureaddperformersetfunctionaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedurePerformerFunctionCodingUsrslt()));
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
		/******************** Procedure_ReasonCode_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureReasonCodeCodingUsrslt() != null) {
			procedureaddreasoncodeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureReasonCodeCodingUsrslt()));
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
		/******************** Procedure_StatusReason_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureStatusReasonCodingUsrslt() != null) {
			proceduresetstatusreasonaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureStatusReasonCodingUsrslt()));
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
		/******************** Procedure_UsedCode_Coding_Usrslt ********************************************************************************/
		if(p.getProcedureUsedCodeCodingUsrslt() != null) {
			procedureaddusedcodeaddcoding.setUserSelected(Boolean.parseBoolean(p.getProcedureUsedCodeCodingUsrslt()));
		}
		/******************** Procedure_UsedCode_Coding_Version ********************************************************************************/
		if(p.getProcedureUsedCodeCodingVersion() != null) {
			procedureaddusedcodeaddcoding.setVersion(p.getProcedureUsedCodeCodingVersion());
		}
		/******************** Procedure_UsedCode_Text ********************************************************************************/
		if(p.getProcedureUsedCodeText() != null) {
			procedureaddusedcode.setText(p.getProcedureUsedCodeText());
		}
		/******************** Procedure_UsedReference ********************************************************************************/
		if(p.getProcedureUsedReference() != null) {
			org.hl7.fhir.r4.model.Reference ProcedureUsedReferenceref = new org.hl7.fhir.r4.model.Reference();
			procedure.addUsedReference(ProcedureUsedReferenceref.setReference(p.getProcedureUsedReference()));
		}
		return procedure;
	}
}
