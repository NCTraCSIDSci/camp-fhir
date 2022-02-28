package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Condition;
public class ConditionConversion 
{
	public org.hl7.fhir.r4.model.Condition Conditions(Condition c) throws ParseException
	{
		org.hl7.fhir.r4.model.Condition condition = new org.hl7.fhir.r4.model.Condition();

		/******************** id ********************************************************************************/
		condition.setId(c.getId());

		/******************** Condition_Abatement ********************************************************************************/
		if(c.getConditionAbatement() != null) {
			condition.setAbatement(new org.hl7.fhir.r4.model.StringType(c.getConditionAbatement()));
		}
		/******************** Condition_AbatementDateTime ********************************************************************************/
		if(c.getConditionAbatementDateTime() != null) {
			condition.setAbatement(new org.hl7.fhir.r4.model.DateTimeType(c.getConditionAbatementDateTime()));
		}

		if( c.getConditionAbatementPeriodEnd() != null || c.getConditionAbatementPeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period conditionsetabatementPeriod = new org.hl7.fhir.r4.model.Period();
			condition.setAbatement(conditionsetabatementPeriod); 

		/******************** Condition_Abatement_Period_End ********************************************************************************/
		if(c.getConditionAbatementPeriodEnd() != null) {
			java.text.SimpleDateFormat ConditionAbatementPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionAbatementPeriodEnddate = ConditionAbatementPeriodEndsdf.parse(c.getConditionAbatementPeriodEnd());
			conditionsetabatementPeriod.setEnd(ConditionAbatementPeriodEnddate);
		}
		/******************** Condition_Abatement_Period_Start ********************************************************************************/
		if(c.getConditionAbatementPeriodStart() != null) {
			java.text.SimpleDateFormat ConditionAbatementPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionAbatementPeriodStartdate = ConditionAbatementPeriodStartsdf.parse(c.getConditionAbatementPeriodStart());
			conditionsetabatementPeriod.setStart(ConditionAbatementPeriodStartdate);
		}
		}

		if( c.getConditionAbatementRangeHighCode() != null || c.getConditionAbatementRangeHighCompartrCode() != null || c.getConditionAbatementRangeHighSystem() != null || c.getConditionAbatementRangeHighUnit() != null || c.getConditionAbatementRangeHighValue() != null || c.getConditionAbatementRangeLowCode() != null || c.getConditionAbatementRangeLowCompartrCode() != null || c.getConditionAbatementRangeLowSystem() != null || c.getConditionAbatementRangeLowUnit() != null || c.getConditionAbatementRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range conditionsetabatementRange = new org.hl7.fhir.r4.model.Range();
			condition.setAbatement(conditionsetabatementRange);


		org.hl7.fhir.r4.model.Quantity conditionsetabatementRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		conditionsetabatementRange.setHigh(conditionsetabatementRangesethigh);

		/******************** Condition_Abatement_Range_High_Code ********************************************************************************/
		if(c.getConditionAbatementRangeHighCode() != null) {
			conditionsetabatementRangesethigh.setCode(c.getConditionAbatementRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionsetabatementRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Condition_Abatement_Range_High_Compartr_Code ********************************************************************************/
		if(c.getConditionAbatementRangeHighCompartrCode() != null) {
			conditionsetabatementRangesethigh.setComparator(conditionsetabatementRangesethighsetcomparatorEnumFactory.fromCode(c.getConditionAbatementRangeHighCompartrCode()));

		}
		/******************** Condition_Abatement_Range_High_System ********************************************************************************/
		if(c.getConditionAbatementRangeHighSystem() != null) {
			conditionsetabatementRangesethigh.setSystem(c.getConditionAbatementRangeHighSystem());
		}
		/******************** Condition_Abatement_Range_High_Unit ********************************************************************************/
		if(c.getConditionAbatementRangeHighUnit() != null) {
			conditionsetabatementRangesethigh.setUnit(c.getConditionAbatementRangeHighUnit());
		}
		/******************** Condition_Abatement_Range_High_Value ********************************************************************************/
		if(c.getConditionAbatementRangeHighValue() != null) {
			conditionsetabatementRangesethigh.setValue(Double.parseDouble((c.getConditionAbatementRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity conditionsetabatementRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		conditionsetabatementRange.setLow(conditionsetabatementRangesetlow);

		/******************** Condition_Abatement_Range_Low_Code ********************************************************************************/
		if(c.getConditionAbatementRangeLowCode() != null) {
			conditionsetabatementRangesetlow.setCode(c.getConditionAbatementRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionsetabatementRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Condition_Abatement_Range_Low_Compartr_Code ********************************************************************************/
		if(c.getConditionAbatementRangeLowCompartrCode() != null) {
			conditionsetabatementRangesetlow.setComparator(conditionsetabatementRangesetlowsetcomparatorEnumFactory.fromCode(c.getConditionAbatementRangeLowCompartrCode()));

		}
		/******************** Condition_Abatement_Range_Low_System ********************************************************************************/
		if(c.getConditionAbatementRangeLowSystem() != null) {
			conditionsetabatementRangesetlow.setSystem(c.getConditionAbatementRangeLowSystem());
		}
		/******************** Condition_Abatement_Range_Low_Unit ********************************************************************************/
		if(c.getConditionAbatementRangeLowUnit() != null) {
			conditionsetabatementRangesetlow.setUnit(c.getConditionAbatementRangeLowUnit());
		}
		/******************** Condition_Abatement_Range_Low_Value ********************************************************************************/
		if(c.getConditionAbatementRangeLowValue() != null) {
			conditionsetabatementRangesetlow.setValue(Double.parseDouble((c.getConditionAbatementRangeLowValue())));
		}
		}
		/******************** Condition_AbatementString ********************************************************************************/
		if(c.getConditionAbatementString() != null) {
			condition.setAbatement(new org.hl7.fhir.r4.model.StringType(c.getConditionAbatementString()));
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
		/******************** Condition_BodySite_Coding_Usrslt ********************************************************************************/
		if(c.getConditionBodySiteCodingUsrslt() != null) {
			conditionaddbodysiteaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionBodySiteCodingUsrslt()));
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
		/******************** Condition_Category_Coding_Usrslt ********************************************************************************/
		if(c.getConditionCategoryCodingUsrslt() != null) {
			conditionaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionCategoryCodingUsrslt()));
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
		/******************** Condition_ClinicalStatus_Coding_Usrslt ********************************************************************************/
		if(c.getConditionClinicalStatusCodingUsrslt() != null) {
			conditionsetclinicalstatusaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionClinicalStatusCodingUsrslt()));
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
		/******************** Condition_Code_Coding_Usrslt ********************************************************************************/
		if(c.getConditionCodeCodingUsrslt() != null) {
			conditionsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionCodeCodingUsrslt()));
		}
		/******************** Condition_Code_Coding_Version ********************************************************************************/
		if(c.getConditionCodeCodingVersion() != null) {
			conditionsetcodeaddcoding.setVersion(c.getConditionCodeCodingVersion());
		}
		/******************** Condition_Code_Text ********************************************************************************/
		if(c.getConditionCodeText() != null) {
			conditionsetcode.setText(c.getConditionCodeText());
		}
		/******************** Condition_Enc ********************************************************************************/
		if(c.getConditionEnc() != null) {
			org.hl7.fhir.r4.model.Reference ConditionEncref = new org.hl7.fhir.r4.model.Reference();
			condition.setEncounter(ConditionEncref.setReference(c.getConditionEnc()));
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
		/******************** Condition_Evidence_Code_Coding_Usrslt ********************************************************************************/
		if(c.getConditionEvidenceCodeCodingUsrslt() != null) {
			conditionaddevidenceaddcodeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionEvidenceCodeCodingUsrslt()));
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

		/******************** Condition_Id_Assigner ********************************************************************************/
		if(c.getConditionIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference ConditionIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			conditionaddidentifier.setAssigner(ConditionIdAssignerref.setReference(c.getConditionIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period conditionaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		conditionaddidentifier.setPeriod(conditionaddidentifiersetperiod);

		/******************** Condition_Id_Period_End ********************************************************************************/
		if(c.getConditionIdPeriodEnd() != null) {
			java.text.SimpleDateFormat ConditionIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionIdPeriodEnddate = ConditionIdPeriodEndsdf.parse(c.getConditionIdPeriodEnd());
			conditionaddidentifiersetperiod.setEnd(ConditionIdPeriodEnddate);
		}
		/******************** Condition_Id_Period_Start ********************************************************************************/
		if(c.getConditionIdPeriodStart() != null) {
			java.text.SimpleDateFormat ConditionIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionIdPeriodStartdate = ConditionIdPeriodStartsdf.parse(c.getConditionIdPeriodStart());
			conditionaddidentifiersetperiod.setStart(ConditionIdPeriodStartdate);
		}
		/******************** Condition_Id_System ********************************************************************************/
		if(c.getConditionIdSystem() != null) {
			conditionaddidentifier.setSystem(c.getConditionIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept conditionaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		conditionaddidentifier.setType(conditionaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding conditionaddidentifiersettypeaddcoding = conditionaddidentifiersettype.addCoding();

		/******************** Condition_Id_Type_Coding_Code ********************************************************************************/
		if(c.getConditionIdTypeCodingCode() != null) {
			conditionaddidentifiersettypeaddcoding.setCode(c.getConditionIdTypeCodingCode());
		}
		/******************** Condition_Id_Type_Coding_Display ********************************************************************************/
		if(c.getConditionIdTypeCodingDisplay() != null) {
			conditionaddidentifiersettypeaddcoding.setDisplay(c.getConditionIdTypeCodingDisplay());
		}
		/******************** Condition_Id_Type_Coding_System ********************************************************************************/
		if(c.getConditionIdTypeCodingSystem() != null) {
			conditionaddidentifiersettypeaddcoding.setSystem(c.getConditionIdTypeCodingSystem());
		}
		/******************** Condition_Id_Type_Coding_Usrslt ********************************************************************************/
		if(c.getConditionIdTypeCodingUsrslt() != null) {
			conditionaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionIdTypeCodingUsrslt()));
		}
		/******************** Condition_Id_Type_Coding_Version ********************************************************************************/
		if(c.getConditionIdTypeCodingVersion() != null) {
			conditionaddidentifiersettypeaddcoding.setVersion(c.getConditionIdTypeCodingVersion());
		}
		/******************** Condition_Id_Type_Text ********************************************************************************/
		if(c.getConditionIdTypeText() != null) {
			conditionaddidentifiersettype.setText(c.getConditionIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory conditionaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Condition_Id_Use_Code ********************************************************************************/
		if(c.getConditionIdUseCode() != null) {
			conditionaddidentifier.setUse(conditionaddidentifiersetuseEnumFactory.fromCode(c.getConditionIdUseCode()));

		}
		/******************** Condition_Id_Value ********************************************************************************/
		if(c.getConditionIdValue() != null) {
			conditionaddidentifier.setValue(c.getConditionIdValue());
		}

		org.hl7.fhir.r4.model.Annotation conditionaddnote = condition.addNote();

		/******************** Condition_Note_AuthorReference ********************************************************************************/
		if(c.getConditionNoteAuthorReference() != null) {
			org.hl7.fhir.r4.model.Reference ConditionNoteAuthorReferenceref = new org.hl7.fhir.r4.model.Reference();
			conditionaddnote.setAuthor(ConditionNoteAuthorReferenceref.setReference(c.getConditionNoteAuthorReference()));
		}
		/******************** Condition_Note_AuthorString ********************************************************************************/
		if(c.getConditionNoteAuthorString() != null) {
			conditionaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(c.getConditionNoteAuthorString()));
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
		/******************** Condition_OnDateTime ********************************************************************************/
		if(c.getConditionOnDateTime() != null) {
			condition.setOnset(new org.hl7.fhir.r4.model.DateTimeType(c.getConditionOnDateTime()));
		}

		if( c.getConditionOnPeriodEnd() != null || c.getConditionOnPeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period conditionsetonsetPeriod = new org.hl7.fhir.r4.model.Period();
			condition.setOnset(conditionsetonsetPeriod);

		/******************** Condition_On_Period_End ********************************************************************************/
		if(c.getConditionOnPeriodEnd() != null) {
			java.text.SimpleDateFormat ConditionOnPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionOnPeriodEnddate = ConditionOnPeriodEndsdf.parse(c.getConditionOnPeriodEnd());
			conditionsetonsetPeriod.setEnd(ConditionOnPeriodEnddate);
		}
		/******************** Condition_On_Period_Start ********************************************************************************/
		if(c.getConditionOnPeriodStart() != null) {
			java.text.SimpleDateFormat ConditionOnPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ConditionOnPeriodStartdate = ConditionOnPeriodStartsdf.parse(c.getConditionOnPeriodStart());
			conditionsetonsetPeriod.setStart(ConditionOnPeriodStartdate);
		}
		}

		if( c.getConditionOnRangeHighCode() != null || c.getConditionOnRangeHighCompartrCode() != null || c.getConditionOnRangeHighSystem() != null || c.getConditionOnRangeHighUnit() != null || c.getConditionOnRangeHighValue() != null || c.getConditionOnRangeLowCode() != null || c.getConditionOnRangeLowCompartrCode() != null || c.getConditionOnRangeLowSystem() != null || c.getConditionOnRangeLowUnit() != null || c.getConditionOnRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range conditionsetonsetRange = new org.hl7.fhir.r4.model.Range();
			condition.setOnset(conditionsetonsetRange);


		org.hl7.fhir.r4.model.Quantity conditionsetonsetRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		conditionsetonsetRange.setHigh(conditionsetonsetRangesethigh);

		/******************** Condition_On_Range_High_Code ********************************************************************************/
		if(c.getConditionOnRangeHighCode() != null) {
			conditionsetonsetRangesethigh.setCode(c.getConditionOnRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionsetonsetRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Condition_On_Range_High_Compartr_Code ********************************************************************************/
		if(c.getConditionOnRangeHighCompartrCode() != null) {
			conditionsetonsetRangesethigh.setComparator(conditionsetonsetRangesethighsetcomparatorEnumFactory.fromCode(c.getConditionOnRangeHighCompartrCode()));

		}
		/******************** Condition_On_Range_High_System ********************************************************************************/
		if(c.getConditionOnRangeHighSystem() != null) {
			conditionsetonsetRangesethigh.setSystem(c.getConditionOnRangeHighSystem());
		}
		/******************** Condition_On_Range_High_Unit ********************************************************************************/
		if(c.getConditionOnRangeHighUnit() != null) {
			conditionsetonsetRangesethigh.setUnit(c.getConditionOnRangeHighUnit());
		}
		/******************** Condition_On_Range_High_Value ********************************************************************************/
		if(c.getConditionOnRangeHighValue() != null) {
			conditionsetonsetRangesethigh.setValue(Double.parseDouble((c.getConditionOnRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity conditionsetonsetRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		conditionsetonsetRange.setLow(conditionsetonsetRangesetlow);

		/******************** Condition_On_Range_Low_Code ********************************************************************************/
		if(c.getConditionOnRangeLowCode() != null) {
			conditionsetonsetRangesetlow.setCode(c.getConditionOnRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionsetonsetRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Condition_On_Range_Low_Compartr_Code ********************************************************************************/
		if(c.getConditionOnRangeLowCompartrCode() != null) {
			conditionsetonsetRangesetlow.setComparator(conditionsetonsetRangesetlowsetcomparatorEnumFactory.fromCode(c.getConditionOnRangeLowCompartrCode()));

		}
		/******************** Condition_On_Range_Low_System ********************************************************************************/
		if(c.getConditionOnRangeLowSystem() != null) {
			conditionsetonsetRangesetlow.setSystem(c.getConditionOnRangeLowSystem());
		}
		/******************** Condition_On_Range_Low_Unit ********************************************************************************/
		if(c.getConditionOnRangeLowUnit() != null) {
			conditionsetonsetRangesetlow.setUnit(c.getConditionOnRangeLowUnit());
		}
		/******************** Condition_On_Range_Low_Value ********************************************************************************/
		if(c.getConditionOnRangeLowValue() != null) {
			conditionsetonsetRangesetlow.setValue(Double.parseDouble((c.getConditionOnRangeLowValue())));
		}
		}
		/******************** Condition_OnString ********************************************************************************/
		if(c.getConditionOnString() != null) {
			condition.setOnset(new org.hl7.fhir.r4.model.StringType(c.getConditionOnString()));
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
		/******************** Condition_Severity_Coding_Usrslt ********************************************************************************/
		if(c.getConditionSeverityCodingUsrslt() != null) {
			conditionsetseverityaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionSeverityCodingUsrslt()));
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
		/******************** Condition_Stage_Summary_Coding_Usrslt ********************************************************************************/
		if(c.getConditionStageSummaryCodingUsrslt() != null) {
			conditionaddstagesetsummaryaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionStageSummaryCodingUsrslt()));
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
		/******************** Condition_Stage_Type_Coding_Usrslt ********************************************************************************/
		if(c.getConditionStageTypeCodingUsrslt() != null) {
			conditionaddstagesettypeaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionStageTypeCodingUsrslt()));
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
		/******************** Condition_VerificationStatus_Coding_Usrslt ********************************************************************************/
		if(c.getConditionVerificationStatusCodingUsrslt() != null) {
			conditionsetverificationstatusaddcoding.setUserSelected(Boolean.parseBoolean(c.getConditionVerificationStatusCodingUsrslt()));
		}
		/******************** Condition_VerificationStatus_Coding_Version ********************************************************************************/
		if(c.getConditionVerificationStatusCodingVersion() != null) {
			conditionsetverificationstatusaddcoding.setVersion(c.getConditionVerificationStatusCodingVersion());
		}
		/******************** Condition_VerificationStatus_Text ********************************************************************************/
		if(c.getConditionVerificationStatusText() != null) {
			conditionsetverificationstatus.setText(c.getConditionVerificationStatusText());
		}
		return condition;
	}
}
