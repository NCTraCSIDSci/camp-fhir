package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationRequest;
public class MedicationRequestConversion  
{
	public org.hl7.fhir.r4.model.MedicationRequest MedicationRequests(MedicationRequest m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationRequest medicationrequest = new org.hl7.fhir.r4.model.MedicationRequest();
		/******************** Medicationrequest_AuthoredOn ********************************************************************************/
		if(m.getMedicationrequestAuthoredOn() != null) {
			java.text.SimpleDateFormat MedicationrequestAuthoredOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedicationrequestAuthoredOndate = MedicationrequestAuthoredOnsdf.parse(m.getMedicationrequestAuthoredOn());
			medicationrequest.setAuthoredOn(MedicationrequestAuthoredOndate);
		}
		/******************** Medicationrequest_BasedOn ********************************************************************************/
		if(m.getMedicationrequestBasedOn() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestBasedOnref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addBasedOn(MedicationrequestBasedOnref.setReference(m.getMedicationrequestBasedOn()));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestaddcategory = medicationrequest.addCategory();


		org.hl7.fhir.r4.model.Coding medicationrequestaddcategoryaddcoding = medicationrequestaddcategory.addCoding();

		/******************** Medicationrequest_Category_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestCategoryCodingCode() != null) {
			medicationrequestaddcategoryaddcoding.setCode(m.getMedicationrequestCategoryCodingCode());
		}
		/******************** Medicationrequest_Category_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestCategoryCodingDisplay() != null) {
			medicationrequestaddcategoryaddcoding.setDisplay(m.getMedicationrequestCategoryCodingDisplay());
		}
		/******************** Medicationrequest_Category_Coding_System ********************************************************************************/
		if(m.getMedicationrequestCategoryCodingSystem() != null) {
			medicationrequestaddcategoryaddcoding.setSystem(m.getMedicationrequestCategoryCodingSystem());
		}
		/******************** Medicationrequest_Category_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestCategoryCodingUserSelected() != null) {
			medicationrequestaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestCategoryCodingUserSelected()));
		}
		/******************** Medicationrequest_Category_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestCategoryCodingVersion() != null) {
			medicationrequestaddcategoryaddcoding.setVersion(m.getMedicationrequestCategoryCodingVersion());
		}
		/******************** Medicationrequest_Category_Text ********************************************************************************/
		if(m.getMedicationrequestCategoryText() != null) {
			medicationrequestaddcategory.setText(m.getMedicationrequestCategoryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetcourseoftherapytype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setCourseOfTherapyType(medicationrequestsetcourseoftherapytype);


		org.hl7.fhir.r4.model.Coding medicationrequestsetcourseoftherapytypeaddcoding = medicationrequestsetcourseoftherapytype.addCoding();

		/******************** Medicationrequest_CourseOfTherapyType_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestCourseOfTherapyTypeCodingCode() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setCode(m.getMedicationrequestCourseOfTherapyTypeCodingCode());
		}
		/******************** Medicationrequest_CourseOfTherapyType_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestCourseOfTherapyTypeCodingDisplay() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setDisplay(m.getMedicationrequestCourseOfTherapyTypeCodingDisplay());
		}
		/******************** Medicationrequest_CourseOfTherapyType_Coding_System ********************************************************************************/
		if(m.getMedicationrequestCourseOfTherapyTypeCodingSystem() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setSystem(m.getMedicationrequestCourseOfTherapyTypeCodingSystem());
		}
		/******************** Medicationrequest_CourseOfTherapyType_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestCourseOfTherapyTypeCodingUserSelected() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestCourseOfTherapyTypeCodingUserSelected()));
		}
		/******************** Medicationrequest_CourseOfTherapyType_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestCourseOfTherapyTypeCodingVersion() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setVersion(m.getMedicationrequestCourseOfTherapyTypeCodingVersion());
		}
		/******************** Medicationrequest_CourseOfTherapyType_Text ********************************************************************************/
		if(m.getMedicationrequestCourseOfTherapyTypeText() != null) {
			medicationrequestsetcourseoftherapytype.setText(m.getMedicationrequestCourseOfTherapyTypeText());
		}
		/******************** Medicationrequest_DetectedIssue ********************************************************************************/
		if(m.getMedicationrequestDetectedIssue() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestDetectedIssueref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addDetectedIssue(MedicationrequestDetectedIssueref.setReference(m.getMedicationrequestDetectedIssue()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent medicationrequestsetdispenserequest = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent();
		medicationrequest.setDispenseRequest(medicationrequestsetdispenserequest);

		/******************** Medicationrequest_DispenseRequest_DispenseInterval ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestDispenseInterval() != null) {
			org.hl7.fhir.r4.model.Duration MedicationrequestDispenseRequestDispenseIntervaldur = new org.hl7.fhir.r4.model.Duration();
			medicationrequestsetdispenserequest.setDispenseInterval((org.hl7.fhir.r4.model.Duration)MedicationrequestDispenseRequestDispenseIntervaldur.setValue(Double.parseDouble(m.getMedicationrequestDispenseRequestDispenseInterval())));
		}
		/******************** Medicationrequest_DispenseRequest_ExpectedSupplyDuration ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestExpectedSupplyDuration() != null) {
			org.hl7.fhir.r4.model.Duration MedicationrequestDispenseRequestExpectedSupplyDurationdur = new org.hl7.fhir.r4.model.Duration();
			medicationrequestsetdispenserequest.setExpectedSupplyDuration((org.hl7.fhir.r4.model.Duration)MedicationrequestDispenseRequestExpectedSupplyDurationdur.setValue(Double.parseDouble(m.getMedicationrequestDispenseRequestExpectedSupplyDuration())));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent medicationrequestsetdispenserequestsetinitialfill = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent();
		medicationrequestsetdispenserequest.setInitialFill(medicationrequestsetdispenserequestsetinitialfill);

		/******************** Medicationrequest_DispenseRequest_InitialFill_Duration ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestInitialFillDuration() != null) {
			org.hl7.fhir.r4.model.Duration MedicationrequestDispenseRequestInitialFillDurationdur = new org.hl7.fhir.r4.model.Duration();
			medicationrequestsetdispenserequestsetinitialfill.setDuration((org.hl7.fhir.r4.model.Duration)MedicationrequestDispenseRequestInitialFillDurationdur.setValue(Double.parseDouble(m.getMedicationrequestDispenseRequestInitialFillDuration())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestsetdispenserequestsetinitialfillsetquantity = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestsetdispenserequestsetinitialfill.setQuantity(medicationrequestsetdispenserequestsetinitialfillsetquantity);

		/******************** Medicationrequest_DispenseRequest_InitialFill_Quantity_Code ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestInitialFillQuantityCode() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setCode(m.getMedicationrequestDispenseRequestInitialFillQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestsetdispenserequestsetinitialfillsetquantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** MR_DispenseRequest_InitialFill_Quantity_Comparator_Code ********************************************************************************/
		if(m.getMrDispenseRequestInitialFillQuantityComparatorCode() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setComparator(medicationrequestsetdispenserequestsetinitialfillsetquantitysetcomparatorEnumFactory.fromCode(m.getMrDispenseRequestInitialFillQuantityComparatorCode()));

		}
		/******************** Medicationrequest_DispenseRequest_InitialFill_Quantity_System ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestInitialFillQuantitySystem() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setSystem(m.getMedicationrequestDispenseRequestInitialFillQuantitySystem());
		}
		/******************** Medicationrequest_DispenseRequest_InitialFill_Quantity_Unit ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestInitialFillQuantityUnit() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setUnit(m.getMedicationrequestDispenseRequestInitialFillQuantityUnit());
		}
		/******************** Medicationrequest_DispenseRequest_InitialFill_Quantity_Value ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestInitialFillQuantityValue() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setValue(Double.parseDouble((m.getMedicationrequestDispenseRequestInitialFillQuantityValue())));
		}
		/******************** Medicationrequest_DispenseRequest_NumberOfRepeatsAllowed ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestNumberOfRepeatsAllowed() != null) {
			medicationrequestsetdispenserequest.setNumberOfRepeatsAllowed(Integer.parseInt(m.getMedicationrequestDispenseRequestNumberOfRepeatsAllowed()));
		}
		/******************** Medicationrequest_DispenseRequest_Performer ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestPerformer() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestDispenseRequestPerformerref = new org.hl7.fhir.r4.model.Reference();
			medicationrequestsetdispenserequest.setPerformer(MedicationrequestDispenseRequestPerformerref.setReference(m.getMedicationrequestDispenseRequestPerformer()));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestsetdispenserequestsetquantity = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestsetdispenserequest.setQuantity(medicationrequestsetdispenserequestsetquantity);

		/******************** Medicationrequest_DispenseRequest_Quantity_Code ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestQuantityCode() != null) {
			medicationrequestsetdispenserequestsetquantity.setCode(m.getMedicationrequestDispenseRequestQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestsetdispenserequestsetquantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medicationrequest_DispenseRequest_Quantity_Comparator_Code ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestQuantityComparatorCode() != null) {
			medicationrequestsetdispenserequestsetquantity.setComparator(medicationrequestsetdispenserequestsetquantitysetcomparatorEnumFactory.fromCode(m.getMedicationrequestDispenseRequestQuantityComparatorCode()));

		}
		/******************** Medicationrequest_DispenseRequest_Quantity_System ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestQuantitySystem() != null) {
			medicationrequestsetdispenserequestsetquantity.setSystem(m.getMedicationrequestDispenseRequestQuantitySystem());
		}
		/******************** Medicationrequest_DispenseRequest_Quantity_Unit ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestQuantityUnit() != null) {
			medicationrequestsetdispenserequestsetquantity.setUnit(m.getMedicationrequestDispenseRequestQuantityUnit());
		}
		/******************** Medicationrequest_DispenseRequest_Quantity_Value ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestQuantityValue() != null) {
			medicationrequestsetdispenserequestsetquantity.setValue(Double.parseDouble((m.getMedicationrequestDispenseRequestQuantityValue())));
		}

		org.hl7.fhir.r4.model.Period medicationrequestsetdispenserequestsetvalidityperiod = new org.hl7.fhir.r4.model.Period();
		medicationrequestsetdispenserequest.setValidityPeriod(medicationrequestsetdispenserequestsetvalidityperiod);

		/******************** Medicationrequest_DispenseRequest_ValidityPeriod_End ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestValidityPeriodEnd() != null) {
			java.text.SimpleDateFormat MedicationrequestDispenseRequestValidityPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedicationrequestDispenseRequestValidityPeriodEnddate = MedicationrequestDispenseRequestValidityPeriodEndsdf.parse(m.getMedicationrequestDispenseRequestValidityPeriodEnd());
			medicationrequestsetdispenserequestsetvalidityperiod.setEnd(MedicationrequestDispenseRequestValidityPeriodEnddate);
		}
		/******************** Medicationrequest_DispenseRequest_ValidityPeriod_Start ********************************************************************************/
		if(m.getMedicationrequestDispenseRequestValidityPeriodStart() != null) {
			java.text.SimpleDateFormat MedicationrequestDispenseRequestValidityPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedicationrequestDispenseRequestValidityPeriodStartdate = MedicationrequestDispenseRequestValidityPeriodStartsdf.parse(m.getMedicationrequestDispenseRequestValidityPeriodStart());
			medicationrequestsetdispenserequestsetvalidityperiod.setStart(MedicationrequestDispenseRequestValidityPeriodStartdate);
		}
		/******************** Medicationrequest_DoNotPerform ********************************************************************************/
		if(m.getMedicationrequestDoNotPerform() != null) {
			medicationrequest.setDoNotPerform(Boolean.parseBoolean(m.getMedicationrequestDoNotPerform()));
		}

		org.hl7.fhir.r4.model.Dosage medicationrequestadddosageinstruction = medicationrequest.addDosageInstruction();


		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionaddadditionalinstruction = medicationrequestadddosageinstruction.addAdditionalInstruction();


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionaddadditionalinstructionaddcoding = medicationrequestadddosageinstructionaddadditionalinstruction.addCoding();

		/******************** MR_DR_AdditionalInstruction_Coding_Code ********************************************************************************/
		if(m.getMrDrAdditionalInstructionCodingCode() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setCode(m.getMrDrAdditionalInstructionCodingCode());
		}
		/******************** MR_DR_AdditionalInstruction_Coding_Display ********************************************************************************/
		if(m.getMrDrAdditionalInstructionCodingDisplay() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setDisplay(m.getMrDrAdditionalInstructionCodingDisplay());
		}
		/******************** MR_DR_AdditionalInstruction_Coding_System ********************************************************************************/
		if(m.getMrDrAdditionalInstructionCodingSystem() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setSystem(m.getMrDrAdditionalInstructionCodingSystem());
		}
		/******************** MR_DR_AdditionalInstruction_Coding_US ********************************************************************************/
		if(m.getMrDrAdditionalInstructionCodingUs() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setUserSelected(Boolean.parseBoolean(m.getMrDrAdditionalInstructionCodingUs()));
		}
		/******************** MR_DR_AdditionalInstruction_Coding_Version ********************************************************************************/
		if(m.getMrDrAdditionalInstructionCodingVersion() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setVersion(m.getMrDrAdditionalInstructionCodingVersion());
		}
		/******************** Medicationrequest_DosageInstruction_AdditionalInstruction_Text ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionAdditionalInstructionText() != null) {
			medicationrequestadddosageinstructionaddadditionalinstruction.setText(m.getMedicationrequestDosageInstructionAdditionalInstructionText());
		}
		/******************** Medicationrequest_DosageInstruction_AsNeeded ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionAsNeeded() != null) {
			medicationrequestadddosageinstruction.setAsNeeded(new org.hl7.fhir.r4.model.StringType(m.getMedicationrequestDosageInstructionAsNeeded()));
		}

		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationrequestadddosageinstructionadddoseandrate = medicationrequestadddosageinstruction.addDoseAndRate();

		/******************** Medicationrequest_DosageInstruction_DoseAndRate_Dose ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionDoseAndRateDose() != null) {
			medicationrequestadddosageinstructionadddoseandrate.setDose(new org.hl7.fhir.r4.model.StringType(m.getMedicationrequestDosageInstructionDoseAndRateDose()));
		}
		/******************** Medicationrequest_DosageInstruction_DoseAndRate_Rate ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionDoseAndRateRate() != null) {
			medicationrequestadddosageinstructionadddoseandrate.setRate(new org.hl7.fhir.r4.model.StringType(m.getMedicationrequestDosageInstructionDoseAndRateRate()));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionadddoseandratesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstructionadddoseandrate.setType(medicationrequestadddosageinstructionadddoseandratesettype);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionadddoseandratesettypeaddcoding = medicationrequestadddosageinstructionadddoseandratesettype.addCoding();

		/******************** MR_DR_DoseAndRate_Type_Coding_Code ********************************************************************************/
		if(m.getMrDrDoseAndRateTypeCodingCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setCode(m.getMrDrDoseAndRateTypeCodingCode());
		}
		/******************** MR_DR_DoseAndRate_Type_Coding_Display ********************************************************************************/
		if(m.getMrDrDoseAndRateTypeCodingDisplay() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setDisplay(m.getMrDrDoseAndRateTypeCodingDisplay());
		}
		/******************** MR_DR_DoseAndRate_Type_Coding_System ********************************************************************************/
		if(m.getMrDrDoseAndRateTypeCodingSystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setSystem(m.getMrDrDoseAndRateTypeCodingSystem());
		}
		/******************** MR_DR_DoseAndRate_Type_Coding_US ********************************************************************************/
		if(m.getMrDrDoseAndRateTypeCodingUs() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMrDrDoseAndRateTypeCodingUs()));
		}
		/******************** MR_DR_DoseAndRate_Type_Coding_Version ********************************************************************************/
		if(m.getMrDrDoseAndRateTypeCodingVersion() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setVersion(m.getMrDrDoseAndRateTypeCodingVersion());
		}
		/******************** Medicationrequest_DosageInstruction_DoseAndRate_Type_Text ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionDoseAndRateTypeText() != null) {
			medicationrequestadddosageinstructionadddoseandratesettype.setText(m.getMedicationrequestDosageInstructionDoseAndRateTypeText());
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsetmaxdoseperadministration = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstruction.setMaxDosePerAdministration(medicationrequestadddosageinstructionsetmaxdoseperadministration);

		/******************** MR_DR_MaxDosePerAdministration_Code ********************************************************************************/
		if(m.getMrDrMaxDosePerAdministrationCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setCode(m.getMrDrMaxDosePerAdministrationCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsetmaxdoseperadministrationsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** MR_DR_MaxDosePerAdministration_Comparator_Code ********************************************************************************/
		if(m.getMrDrMaxDosePerAdministrationComparatorCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setComparator(medicationrequestadddosageinstructionsetmaxdoseperadministrationsetcomparatorEnumFactory.fromCode(m.getMrDrMaxDosePerAdministrationComparatorCode()));

		}
		/******************** MR_DR_MaxDosePerAdministration_System ********************************************************************************/
		if(m.getMrDrMaxDosePerAdministrationSystem() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setSystem(m.getMrDrMaxDosePerAdministrationSystem());
		}
		/******************** MR_DR_MaxDosePerAdministration_Unit ********************************************************************************/
		if(m.getMrDrMaxDosePerAdministrationUnit() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setUnit(m.getMrDrMaxDosePerAdministrationUnit());
		}
		/******************** MR_DR_MaxDosePerAdministration_Value ********************************************************************************/
		if(m.getMrDrMaxDosePerAdministrationValue() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setValue(Double.parseDouble((m.getMrDrMaxDosePerAdministrationValue())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsetmaxdoseperlifetime = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstruction.setMaxDosePerLifetime(medicationrequestadddosageinstructionsetmaxdoseperlifetime);

		/******************** Medicationrequest_DosageInstruction_MaxDosePerLifetime_Code ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMaxDosePerLifetimeCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setCode(m.getMedicationrequestDosageInstructionMaxDosePerLifetimeCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsetmaxdoseperlifetimesetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** MR_DR_MaxDosePerLifetime_Comparator_Code ********************************************************************************/
		if(m.getMrDrMaxDosePerLifetimeComparatorCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setComparator(medicationrequestadddosageinstructionsetmaxdoseperlifetimesetcomparatorEnumFactory.fromCode(m.getMrDrMaxDosePerLifetimeComparatorCode()));

		}
		/******************** Medicationrequest_DosageInstruction_MaxDosePerLifetime_System ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMaxDosePerLifetimeSystem() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setSystem(m.getMedicationrequestDosageInstructionMaxDosePerLifetimeSystem());
		}
		/******************** Medicationrequest_DosageInstruction_MaxDosePerLifetime_Unit ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMaxDosePerLifetimeUnit() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setUnit(m.getMedicationrequestDosageInstructionMaxDosePerLifetimeUnit());
		}
		/******************** Medicationrequest_DosageInstruction_MaxDosePerLifetime_Value ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMaxDosePerLifetimeValue() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setValue(Double.parseDouble((m.getMedicationrequestDosageInstructionMaxDosePerLifetimeValue())));
		}

		org.hl7.fhir.r4.model.Ratio medicationrequestadddosageinstructionsetmaxdoseperperiod = new org.hl7.fhir.r4.model.Ratio();
		medicationrequestadddosageinstruction.setMaxDosePerPeriod(medicationrequestadddosageinstructionsetmaxdoseperperiod);


		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionsetmaxdoseperperiod.setDenominator(medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator);

		/******************** MR_DR_MaxDosePerPeriod_Denominator_Code ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodDenominatorCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setCode(m.getMrDrMaxDosePerPeriodDenominatorCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominatorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** MR_DR_MaxDosePerPeriod_Denominator_Comparator_Code ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodDenominatorComparatorCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setComparator(medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominatorsetcomparatorEnumFactory.fromCode(m.getMrDrMaxDosePerPeriodDenominatorComparatorCode()));

		}
		/******************** MR_DR_MaxDosePerPeriod_Denominator_System ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodDenominatorSystem() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setSystem(m.getMrDrMaxDosePerPeriodDenominatorSystem());
		}
		/******************** MR_DR_MaxDosePerPeriod_Denominator_Unit ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodDenominatorUnit() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setUnit(m.getMrDrMaxDosePerPeriodDenominatorUnit());
		}
		/******************** MR_DR_MaxDosePerPeriod_Denominator_Value ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodDenominatorValue() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setValue(Double.parseDouble((m.getMrDrMaxDosePerPeriodDenominatorValue())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionsetmaxdoseperperiod.setNumerator(medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator);

		/******************** MR_DR_MaxDosePerPeriod_Numerator_Code ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodNumeratorCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setCode(m.getMrDrMaxDosePerPeriodNumeratorCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumeratorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** MR_DR_MaxDosePerPeriod_Numerator_Comparator_Code ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodNumeratorComparatorCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setComparator(medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumeratorsetcomparatorEnumFactory.fromCode(m.getMrDrMaxDosePerPeriodNumeratorComparatorCode()));

		}
		/******************** MR_DR_MaxDosePerPeriod_Numerator_System ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodNumeratorSystem() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setSystem(m.getMrDrMaxDosePerPeriodNumeratorSystem());
		}
		/******************** MR_DR_MaxDosePerPeriod_Numerator_Unit ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodNumeratorUnit() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setUnit(m.getMrDrMaxDosePerPeriodNumeratorUnit());
		}
		/******************** MR_DR_MaxDosePerPeriod_Numerator_Value ********************************************************************************/
		if(m.getMrDrMaxDosePerPeriodNumeratorValue() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setValue(Double.parseDouble((m.getMrDrMaxDosePerPeriodNumeratorValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionsetmethod = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstruction.setMethod(medicationrequestadddosageinstructionsetmethod);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionsetmethodaddcoding = medicationrequestadddosageinstructionsetmethod.addCoding();

		/******************** Medicationrequest_DosageInstruction_Method_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMethodCodingCode() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setCode(m.getMedicationrequestDosageInstructionMethodCodingCode());
		}
		/******************** Medicationrequest_DosageInstruction_Method_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMethodCodingDisplay() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setDisplay(m.getMedicationrequestDosageInstructionMethodCodingDisplay());
		}
		/******************** Medicationrequest_DosageInstruction_Method_Coding_System ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMethodCodingSystem() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setSystem(m.getMedicationrequestDosageInstructionMethodCodingSystem());
		}
		/******************** Medicationrequest_DosageInstruction_Method_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMethodCodingUserSelected() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestDosageInstructionMethodCodingUserSelected()));
		}
		/******************** Medicationrequest_DosageInstruction_Method_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMethodCodingVersion() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setVersion(m.getMedicationrequestDosageInstructionMethodCodingVersion());
		}
		/******************** Medicationrequest_DosageInstruction_Method_Text ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionMethodText() != null) {
			medicationrequestadddosageinstructionsetmethod.setText(m.getMedicationrequestDosageInstructionMethodText());
		}
		/******************** Medicationrequest_DosageInstruction_PatientInstruction ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionPatientInstruction() != null) {
			medicationrequestadddosageinstruction.setPatientInstruction(m.getMedicationrequestDosageInstructionPatientInstruction());
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionsetroute = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstruction.setRoute(medicationrequestadddosageinstructionsetroute);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionsetrouteaddcoding = medicationrequestadddosageinstructionsetroute.addCoding();

		/******************** Medicationrequest_DosageInstruction_Route_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionRouteCodingCode() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setCode(m.getMedicationrequestDosageInstructionRouteCodingCode());
		}
		/******************** Medicationrequest_DosageInstruction_Route_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionRouteCodingDisplay() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setDisplay(m.getMedicationrequestDosageInstructionRouteCodingDisplay());
		}
		/******************** Medicationrequest_DosageInstruction_Route_Coding_System ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionRouteCodingSystem() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setSystem(m.getMedicationrequestDosageInstructionRouteCodingSystem());
		}
		/******************** Medicationrequest_DosageInstruction_Route_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionRouteCodingUserSelected() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestDosageInstructionRouteCodingUserSelected()));
		}
		/******************** Medicationrequest_DosageInstruction_Route_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionRouteCodingVersion() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setVersion(m.getMedicationrequestDosageInstructionRouteCodingVersion());
		}
		/******************** Medicationrequest_DosageInstruction_Route_Text ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionRouteText() != null) {
			medicationrequestadddosageinstructionsetroute.setText(m.getMedicationrequestDosageInstructionRouteText());
		}
		/******************** Medicationrequest_DosageInstruction_Sequence ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionSequence() != null) {
			medicationrequestadddosageinstruction.setSequence(Integer.parseInt(m.getMedicationrequestDosageInstructionSequence()));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionsetsite = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstruction.setSite(medicationrequestadddosageinstructionsetsite);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionsetsiteaddcoding = medicationrequestadddosageinstructionsetsite.addCoding();

		/******************** Medicationrequest_DosageInstruction_Site_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionSiteCodingCode() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setCode(m.getMedicationrequestDosageInstructionSiteCodingCode());
		}
		/******************** Medicationrequest_DosageInstruction_Site_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionSiteCodingDisplay() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setDisplay(m.getMedicationrequestDosageInstructionSiteCodingDisplay());
		}
		/******************** Medicationrequest_DosageInstruction_Site_Coding_System ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionSiteCodingSystem() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setSystem(m.getMedicationrequestDosageInstructionSiteCodingSystem());
		}
		/******************** Medicationrequest_DosageInstruction_Site_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionSiteCodingUserSelected() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestDosageInstructionSiteCodingUserSelected()));
		}
		/******************** Medicationrequest_DosageInstruction_Site_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionSiteCodingVersion() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setVersion(m.getMedicationrequestDosageInstructionSiteCodingVersion());
		}
		/******************** Medicationrequest_DosageInstruction_Site_Text ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionSiteText() != null) {
			medicationrequestadddosageinstructionsetsite.setText(m.getMedicationrequestDosageInstructionSiteText());
		}
		/******************** Medicationrequest_DosageInstruction_Text ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionText() != null) {
			medicationrequestadddosageinstruction.setText(m.getMedicationrequestDosageInstructionText());
		}

		org.hl7.fhir.r4.model.Timing medicationrequestadddosageinstructionsettiming = new org.hl7.fhir.r4.model.Timing();
		medicationrequestadddosageinstruction.setTiming(medicationrequestadddosageinstructionsettiming);


		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionsettimingsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstructionsettiming.setCode(medicationrequestadddosageinstructionsettimingsetcode);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionsettimingsetcodeaddcoding = medicationrequestadddosageinstructionsettimingsetcode.addCoding();

		/******************** Medicationrequest_DosageInstruction_Timing_Code_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingCodeCodingCode() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setCode(m.getMedicationrequestDosageInstructionTimingCodeCodingCode());
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Code_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingCodeCodingDisplay() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setDisplay(m.getMedicationrequestDosageInstructionTimingCodeCodingDisplay());
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Code_Coding_System ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingCodeCodingSystem() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setSystem(m.getMedicationrequestDosageInstructionTimingCodeCodingSystem());
		}
		/******************** MR_DR_Timing_Code_Coding_US ********************************************************************************/
		if(m.getMrDrTimingCodeCodingUs() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMrDrTimingCodeCodingUs()));
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Code_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingCodeCodingVersion() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setVersion(m.getMedicationrequestDosageInstructionTimingCodeCodingVersion());
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Code_Text ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingCodeText() != null) {
			medicationrequestadddosageinstructionsettimingsetcode.setText(m.getMedicationrequestDosageInstructionTimingCodeText());
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Event ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingEvent() != null) {
			java.text.SimpleDateFormat MedicationrequestDosageInstructionTimingEventsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedicationrequestDosageInstructionTimingEventdate = MedicationrequestDosageInstructionTimingEventsdf.parse(m.getMedicationrequestDosageInstructionTimingEvent());
			medicationrequestadddosageinstructionsettiming.addEvent(MedicationrequestDosageInstructionTimingEventdate);
		}

		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationrequestadddosageinstructionsettimingsetrepeat = new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		medicationrequestadddosageinstructionsettiming.setRepeat(medicationrequestadddosageinstructionsettimingsetrepeat);

		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_Bounds ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatBounds() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setBounds(new org.hl7.fhir.r4.model.StringType(m.getMedicationrequestDosageInstructionTimingRepeatBounds()));
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_Count ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatCount() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setCount(Integer.parseInt(m.getMedicationrequestDosageInstructionTimingRepeatCount()));
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_CountMax ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatCountMax() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setCountMax(Integer.parseInt(m.getMedicationrequestDosageInstructionTimingRepeatCountMax()));
		}

		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory medicationrequestadddosageinstructionsettimingsetrepeatadddayofweekEnumFactory = new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();

		/******************** MR_DR_Timing_Repeat_DayOfWeek_Code ********************************************************************************/
		if(m.getMrDrTimingRepeatDayOfWeekCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.addDayOfWeek(medicationrequestadddosageinstructionsettimingsetrepeatadddayofweekEnumFactory.fromCode(m.getMrDrTimingRepeatDayOfWeekCode()));

		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_Duration ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatDuration() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setDuration(Double.parseDouble((m.getMedicationrequestDosageInstructionTimingRepeatDuration())));
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_DurationMax ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatDurationMax() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setDurationMax(Double.parseDouble((m.getMedicationrequestDosageInstructionTimingRepeatDurationMax())));
		}

		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationrequestadddosageinstructionsettimingsetrepeatsetdurationunitEnumFactory = new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();

		/******************** MR_DR_Timing_Repeat_DurationUnit_Code ********************************************************************************/
		if(m.getMrDrTimingRepeatDurationUnitCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setDurationUnit(medicationrequestadddosageinstructionsettimingsetrepeatsetdurationunitEnumFactory.fromCode(m.getMrDrTimingRepeatDurationUnitCode()));

		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_Frequency ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatFrequency() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setFrequency(Integer.parseInt(m.getMedicationrequestDosageInstructionTimingRepeatFrequency()));
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_FrequencyMax ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatFrequencyMax() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setFrequencyMax(Integer.parseInt(m.getMedicationrequestDosageInstructionTimingRepeatFrequencyMax()));
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_Off ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatOff() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setOffset(Integer.parseInt(m.getMedicationrequestDosageInstructionTimingRepeatOff()));
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_Period ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatPeriod() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setPeriod(Double.parseDouble((m.getMedicationrequestDosageInstructionTimingRepeatPeriod())));
		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_PeriodMax ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatPeriodMax() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setPeriodMax(Double.parseDouble((m.getMedicationrequestDosageInstructionTimingRepeatPeriodMax())));
		}

		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationrequestadddosageinstructionsettimingsetrepeatsetperiodunitEnumFactory = new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();

		/******************** MR_DR_Timing_Repeat_PeriodUnit_Code ********************************************************************************/
		if(m.getMrDrTimingRepeatPeriodUnitCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setPeriodUnit(medicationrequestadddosageinstructionsettimingsetrepeatsetperiodunitEnumFactory.fromCode(m.getMrDrTimingRepeatPeriodUnitCode()));

		}
		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_TimeOfDay ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatTimeOfDay() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.addTimeOfDay(m.getMedicationrequestDosageInstructionTimingRepeatTimeOfDay());
		}

		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory medicationrequestadddosageinstructionsettimingsetrepeataddwhenEnumFactory = new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();

		/******************** Medicationrequest_DosageInstruction_Timing_Repeat_When_Code ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionTimingRepeatWhenCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.addWhen(medicationrequestadddosageinstructionsettimingsetrepeataddwhenEnumFactory.fromCode(m.getMedicationrequestDosageInstructionTimingRepeatWhenCode()));

		}
		/******************** Medicationrequest_Encounter ********************************************************************************/
		if(m.getMedicationrequestEncounter() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestEncounterref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setEncounter(MedicationrequestEncounterref.setReference(m.getMedicationrequestEncounter()));
		}
		/******************** Medicationrequest_EventHistory ********************************************************************************/
		if(m.getMedicationrequestEventHistory() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestEventHistoryref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addEventHistory(MedicationrequestEventHistoryref.setReference(m.getMedicationrequestEventHistory()));
		}

		org.hl7.fhir.r4.model.Identifier medicationrequestsetgroupidentifier = new org.hl7.fhir.r4.model.Identifier();
		medicationrequest.setGroupIdentifier(medicationrequestsetgroupidentifier);

		/******************** Medicationrequest_GroupIdentifier_Assigner ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestGroupIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			medicationrequestsetgroupidentifier.setAssigner(MedicationrequestGroupIdentifierAssignerref.setReference(m.getMedicationrequestGroupIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period medicationrequestsetgroupidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		medicationrequestsetgroupidentifier.setPeriod(medicationrequestsetgroupidentifiersetperiod);

		/******************** Medicationrequest_GroupIdentifier_Period_End ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat MedicationrequestGroupIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedicationrequestGroupIdentifierPeriodEnddate = MedicationrequestGroupIdentifierPeriodEndsdf.parse(m.getMedicationrequestGroupIdentifierPeriodEnd());
			medicationrequestsetgroupidentifiersetperiod.setEnd(MedicationrequestGroupIdentifierPeriodEnddate);
		}
		/******************** Medicationrequest_GroupIdentifier_Period_Start ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat MedicationrequestGroupIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedicationrequestGroupIdentifierPeriodStartdate = MedicationrequestGroupIdentifierPeriodStartsdf.parse(m.getMedicationrequestGroupIdentifierPeriodStart());
			medicationrequestsetgroupidentifiersetperiod.setStart(MedicationrequestGroupIdentifierPeriodStartdate);
		}
		/******************** Medicationrequest_GroupIdentifier_System ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierSystem() != null) {
			medicationrequestsetgroupidentifier.setSystem(m.getMedicationrequestGroupIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetgroupidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestsetgroupidentifier.setType(medicationrequestsetgroupidentifiersettype);


		org.hl7.fhir.r4.model.Coding medicationrequestsetgroupidentifiersettypeaddcoding = medicationrequestsetgroupidentifiersettype.addCoding();

		/******************** Medicationrequest_GroupIdentifier_Type_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierTypeCodingCode() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setCode(m.getMedicationrequestGroupIdentifierTypeCodingCode());
		}
		/******************** Medicationrequest_GroupIdentifier_Type_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierTypeCodingDisplay() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setDisplay(m.getMedicationrequestGroupIdentifierTypeCodingDisplay());
		}
		/******************** Medicationrequest_GroupIdentifier_Type_Coding_System ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierTypeCodingSystem() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setSystem(m.getMedicationrequestGroupIdentifierTypeCodingSystem());
		}
		/******************** Medicationrequest_GroupIdentifier_Type_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierTypeCodingUserSelected() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestGroupIdentifierTypeCodingUserSelected()));
		}
		/******************** Medicationrequest_GroupIdentifier_Type_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierTypeCodingVersion() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setVersion(m.getMedicationrequestGroupIdentifierTypeCodingVersion());
		}
		/******************** Medicationrequest_GroupIdentifier_Type_Text ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierTypeText() != null) {
			medicationrequestsetgroupidentifiersettype.setText(m.getMedicationrequestGroupIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationrequestsetgroupidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Medicationrequest_GroupIdentifier_Use_Code ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierUseCode() != null) {
			medicationrequestsetgroupidentifier.setUse(medicationrequestsetgroupidentifiersetuseEnumFactory.fromCode(m.getMedicationrequestGroupIdentifierUseCode()));

		}
		/******************** Medicationrequest_GroupIdentifier_Value ********************************************************************************/
		if(m.getMedicationrequestGroupIdentifierValue() != null) {
			medicationrequestsetgroupidentifier.setValue(m.getMedicationrequestGroupIdentifierValue());
		}

		org.hl7.fhir.r4.model.Identifier medicationrequestaddidentifier = medicationrequest.addIdentifier();

		/******************** Medicationrequest_Identifier_Assigner ********************************************************************************/
		if(m.getMedicationrequestIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			medicationrequestaddidentifier.setAssigner(MedicationrequestIdentifierAssignerref.setReference(m.getMedicationrequestIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period medicationrequestaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		medicationrequestaddidentifier.setPeriod(medicationrequestaddidentifiersetperiod);

		/******************** Medicationrequest_Identifier_Period_End ********************************************************************************/
		if(m.getMedicationrequestIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat MedicationrequestIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedicationrequestIdentifierPeriodEnddate = MedicationrequestIdentifierPeriodEndsdf.parse(m.getMedicationrequestIdentifierPeriodEnd());
			medicationrequestaddidentifiersetperiod.setEnd(MedicationrequestIdentifierPeriodEnddate);
		}
		/******************** Medicationrequest_Identifier_Period_Start ********************************************************************************/
		if(m.getMedicationrequestIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat MedicationrequestIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedicationrequestIdentifierPeriodStartdate = MedicationrequestIdentifierPeriodStartsdf.parse(m.getMedicationrequestIdentifierPeriodStart());
			medicationrequestaddidentifiersetperiod.setStart(MedicationrequestIdentifierPeriodStartdate);
		}
		/******************** Medicationrequest_Identifier_System ********************************************************************************/
		if(m.getMedicationrequestIdentifierSystem() != null) {
			medicationrequestaddidentifier.setSystem(m.getMedicationrequestIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestaddidentifier.setType(medicationrequestaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding medicationrequestaddidentifiersettypeaddcoding = medicationrequestaddidentifiersettype.addCoding();

		/******************** Medicationrequest_Identifier_Type_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestIdentifierTypeCodingCode() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setCode(m.getMedicationrequestIdentifierTypeCodingCode());
		}
		/******************** Medicationrequest_Identifier_Type_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestIdentifierTypeCodingDisplay() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setDisplay(m.getMedicationrequestIdentifierTypeCodingDisplay());
		}
		/******************** Medicationrequest_Identifier_Type_Coding_System ********************************************************************************/
		if(m.getMedicationrequestIdentifierTypeCodingSystem() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setSystem(m.getMedicationrequestIdentifierTypeCodingSystem());
		}
		/******************** Medicationrequest_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestIdentifierTypeCodingUserSelected() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestIdentifierTypeCodingUserSelected()));
		}
		/******************** Medicationrequest_Identifier_Type_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestIdentifierTypeCodingVersion() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setVersion(m.getMedicationrequestIdentifierTypeCodingVersion());
		}
		/******************** Medicationrequest_Identifier_Type_Text ********************************************************************************/
		if(m.getMedicationrequestIdentifierTypeText() != null) {
			medicationrequestaddidentifiersettype.setText(m.getMedicationrequestIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationrequestaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Medicationrequest_Identifier_Use_Code ********************************************************************************/
		if(m.getMedicationrequestIdentifierUseCode() != null) {
			medicationrequestaddidentifier.setUse(medicationrequestaddidentifiersetuseEnumFactory.fromCode(m.getMedicationrequestIdentifierUseCode()));

		}
		/******************** Medicationrequest_Identifier_Value ********************************************************************************/
		if(m.getMedicationrequestIdentifierValue() != null) {
			medicationrequestaddidentifier.setValue(m.getMedicationrequestIdentifierValue());
		}
		/******************** Medicationrequest_InstantiatesCanonical ********************************************************************************/
		if(m.getMedicationrequestInstantiatesCanonical() != null) {
			medicationrequest.addInstantiatesCanonical(m.getMedicationrequestInstantiatesCanonical());
		}
		/******************** Medicationrequest_InstantiatesUri ********************************************************************************/
		if(m.getMedicationrequestInstantiatesUri() != null) {
			medicationrequest.addInstantiatesUri(m.getMedicationrequestInstantiatesUri());
		}
		/******************** Medicationrequest_Insurance ********************************************************************************/
		if(m.getMedicationrequestInsurance() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestInsuranceref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addInsurance(MedicationrequestInsuranceref.setReference(m.getMedicationrequestInsurance()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntentEnumFactory medicationrequestsetintentEnumFactory = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntentEnumFactory();

		/******************** Medicationrequest_Intent_Code ********************************************************************************/
		if(m.getMedicationrequestIntentCode() != null) {
			medicationrequest.setIntent(medicationrequestsetintentEnumFactory.fromCode(m.getMedicationrequestIntentCode()));

		}
		/******************** Medicationrequest_Medication ********************************************************************************/
		if(m.getMedicationrequestMedication() != null) {
			medicationrequest.setMedication(new org.hl7.fhir.r4.model.StringType(m.getMedicationrequestMedication()));
		}

		org.hl7.fhir.r4.model.Annotation medicationrequestaddnote = medicationrequest.addNote();

		/******************** Medicationrequest_Note_Author ********************************************************************************/
		if(m.getMedicationrequestNoteAuthor() != null) {
			medicationrequestaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(m.getMedicationrequestNoteAuthor()));
		}
		/******************** Medicationrequest_Note_Text ********************************************************************************/
		if(m.getMedicationrequestNoteText() != null) {
			medicationrequestaddnote.setText(m.getMedicationrequestNoteText());
		}
		/******************** Medicationrequest_Note_Time ********************************************************************************/
		if(m.getMedicationrequestNoteTime() != null) {
			java.text.SimpleDateFormat MedicationrequestNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedicationrequestNoteTimedate = MedicationrequestNoteTimesdf.parse(m.getMedicationrequestNoteTime());
			medicationrequestaddnote.setTime(MedicationrequestNoteTimedate);
		}
		/******************** Medicationrequest_Performer ********************************************************************************/
		if(m.getMedicationrequestPerformer() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestPerformerref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setPerformer(MedicationrequestPerformerref.setReference(m.getMedicationrequestPerformer()));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetperformertype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setPerformerType(medicationrequestsetperformertype);


		org.hl7.fhir.r4.model.Coding medicationrequestsetperformertypeaddcoding = medicationrequestsetperformertype.addCoding();

		/******************** Medicationrequest_PerformerType_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestPerformerTypeCodingCode() != null) {
			medicationrequestsetperformertypeaddcoding.setCode(m.getMedicationrequestPerformerTypeCodingCode());
		}
		/******************** Medicationrequest_PerformerType_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestPerformerTypeCodingDisplay() != null) {
			medicationrequestsetperformertypeaddcoding.setDisplay(m.getMedicationrequestPerformerTypeCodingDisplay());
		}
		/******************** Medicationrequest_PerformerType_Coding_System ********************************************************************************/
		if(m.getMedicationrequestPerformerTypeCodingSystem() != null) {
			medicationrequestsetperformertypeaddcoding.setSystem(m.getMedicationrequestPerformerTypeCodingSystem());
		}
		/******************** Medicationrequest_PerformerType_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestPerformerTypeCodingUserSelected() != null) {
			medicationrequestsetperformertypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestPerformerTypeCodingUserSelected()));
		}
		/******************** Medicationrequest_PerformerType_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestPerformerTypeCodingVersion() != null) {
			medicationrequestsetperformertypeaddcoding.setVersion(m.getMedicationrequestPerformerTypeCodingVersion());
		}
		/******************** Medicationrequest_PerformerType_Text ********************************************************************************/
		if(m.getMedicationrequestPerformerTypeText() != null) {
			medicationrequestsetperformertype.setText(m.getMedicationrequestPerformerTypeText());
		}
		/******************** Medicationrequest_PriorPrescription ********************************************************************************/
		if(m.getMedicationrequestPriorPrescription() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestPriorPrescriptionref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setPriorPrescription(MedicationrequestPriorPrescriptionref.setReference(m.getMedicationrequestPriorPrescription()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriorityEnumFactory medicationrequestsetpriorityEnumFactory = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriorityEnumFactory();

		/******************** Medicationrequest_Priority_Code ********************************************************************************/
		if(m.getMedicationrequestPriorityCode() != null) {
			medicationrequest.setPriority(medicationrequestsetpriorityEnumFactory.fromCode(m.getMedicationrequestPriorityCode()));

		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestaddreasoncode = medicationrequest.addReasonCode();


		org.hl7.fhir.r4.model.Coding medicationrequestaddreasoncodeaddcoding = medicationrequestaddreasoncode.addCoding();

		/******************** Medicationrequest_ReasonCode_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestReasonCodeCodingCode() != null) {
			medicationrequestaddreasoncodeaddcoding.setCode(m.getMedicationrequestReasonCodeCodingCode());
		}
		/******************** Medicationrequest_ReasonCode_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestReasonCodeCodingDisplay() != null) {
			medicationrequestaddreasoncodeaddcoding.setDisplay(m.getMedicationrequestReasonCodeCodingDisplay());
		}
		/******************** Medicationrequest_ReasonCode_Coding_System ********************************************************************************/
		if(m.getMedicationrequestReasonCodeCodingSystem() != null) {
			medicationrequestaddreasoncodeaddcoding.setSystem(m.getMedicationrequestReasonCodeCodingSystem());
		}
		/******************** Medicationrequest_ReasonCode_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestReasonCodeCodingUserSelected() != null) {
			medicationrequestaddreasoncodeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestReasonCodeCodingUserSelected()));
		}
		/******************** Medicationrequest_ReasonCode_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestReasonCodeCodingVersion() != null) {
			medicationrequestaddreasoncodeaddcoding.setVersion(m.getMedicationrequestReasonCodeCodingVersion());
		}
		/******************** Medicationrequest_ReasonCode_Text ********************************************************************************/
		if(m.getMedicationrequestReasonCodeText() != null) {
			medicationrequestaddreasoncode.setText(m.getMedicationrequestReasonCodeText());
		}
		/******************** Medicationrequest_ReasonReference ********************************************************************************/
		if(m.getMedicationrequestReasonReference() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestReasonReferenceref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addReasonReference(MedicationrequestReasonReferenceref.setReference(m.getMedicationrequestReasonReference()));
		}
		/******************** Medicationrequest_Recorder ********************************************************************************/
		if(m.getMedicationrequestRecorder() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestRecorderref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setRecorder(MedicationrequestRecorderref.setReference(m.getMedicationrequestRecorder()));
		}
		/******************** Medicationrequest_Reported ********************************************************************************/
		if(m.getMedicationrequestReported() != null) {
			medicationrequest.setReported(new org.hl7.fhir.r4.model.StringType(m.getMedicationrequestReported()));
		}
		/******************** Medicationrequest_Requester ********************************************************************************/
		if(m.getMedicationrequestRequester() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestRequesterref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setRequester(MedicationrequestRequesterref.setReference(m.getMedicationrequestRequester()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatusEnumFactory medicationrequestsetstatusEnumFactory = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatusEnumFactory();

		/******************** Medicationrequest_Status_Code ********************************************************************************/
		if(m.getMedicationrequestStatusCode() != null) {
			medicationrequest.setStatus(medicationrequestsetstatusEnumFactory.fromCode(m.getMedicationrequestStatusCode()));

		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetstatusreason = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setStatusReason(medicationrequestsetstatusreason);


		org.hl7.fhir.r4.model.Coding medicationrequestsetstatusreasonaddcoding = medicationrequestsetstatusreason.addCoding();

		/******************** Medicationrequest_StatusReason_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestStatusReasonCodingCode() != null) {
			medicationrequestsetstatusreasonaddcoding.setCode(m.getMedicationrequestStatusReasonCodingCode());
		}
		/******************** Medicationrequest_StatusReason_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestStatusReasonCodingDisplay() != null) {
			medicationrequestsetstatusreasonaddcoding.setDisplay(m.getMedicationrequestStatusReasonCodingDisplay());
		}
		/******************** Medicationrequest_StatusReason_Coding_System ********************************************************************************/
		if(m.getMedicationrequestStatusReasonCodingSystem() != null) {
			medicationrequestsetstatusreasonaddcoding.setSystem(m.getMedicationrequestStatusReasonCodingSystem());
		}
		/******************** Medicationrequest_StatusReason_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestStatusReasonCodingUserSelected() != null) {
			medicationrequestsetstatusreasonaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestStatusReasonCodingUserSelected()));
		}
		/******************** Medicationrequest_StatusReason_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestStatusReasonCodingVersion() != null) {
			medicationrequestsetstatusreasonaddcoding.setVersion(m.getMedicationrequestStatusReasonCodingVersion());
		}
		/******************** Medicationrequest_StatusReason_Text ********************************************************************************/
		if(m.getMedicationrequestStatusReasonText() != null) {
			medicationrequestsetstatusreason.setText(m.getMedicationrequestStatusReasonText());
		}
		/******************** Medicationrequest_Subject ********************************************************************************/
		if(m.getMedicationrequestSubject() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestSubjectref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setSubject(MedicationrequestSubjectref.setReference(m.getMedicationrequestSubject()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent medicationrequestsetsubstitution = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent();
		medicationrequest.setSubstitution(medicationrequestsetsubstitution);

		/******************** Medicationrequest_Substitution_Allowed ********************************************************************************/
		if(m.getMedicationrequestSubstitutionAllowed() != null) {
			medicationrequestsetsubstitution.setAllowed(new org.hl7.fhir.r4.model.StringType(m.getMedicationrequestSubstitutionAllowed()));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetsubstitutionsetreason = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestsetsubstitution.setReason(medicationrequestsetsubstitutionsetreason);


		org.hl7.fhir.r4.model.Coding medicationrequestsetsubstitutionsetreasonaddcoding = medicationrequestsetsubstitutionsetreason.addCoding();

		/******************** Medicationrequest_Substitution_Reason_Coding_Code ********************************************************************************/
		if(m.getMedicationrequestSubstitutionReasonCodingCode() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setCode(m.getMedicationrequestSubstitutionReasonCodingCode());
		}
		/******************** Medicationrequest_Substitution_Reason_Coding_Display ********************************************************************************/
		if(m.getMedicationrequestSubstitutionReasonCodingDisplay() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setDisplay(m.getMedicationrequestSubstitutionReasonCodingDisplay());
		}
		/******************** Medicationrequest_Substitution_Reason_Coding_System ********************************************************************************/
		if(m.getMedicationrequestSubstitutionReasonCodingSystem() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setSystem(m.getMedicationrequestSubstitutionReasonCodingSystem());
		}
		/******************** Medicationrequest_Substitution_Reason_Coding_UserSelected ********************************************************************************/
		if(m.getMedicationrequestSubstitutionReasonCodingUserSelected() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedicationrequestSubstitutionReasonCodingUserSelected()));
		}
		/******************** Medicationrequest_Substitution_Reason_Coding_Version ********************************************************************************/
		if(m.getMedicationrequestSubstitutionReasonCodingVersion() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setVersion(m.getMedicationrequestSubstitutionReasonCodingVersion());
		}
		/******************** Medicationrequest_Substitution_Reason_Text ********************************************************************************/
		if(m.getMedicationrequestSubstitutionReasonText() != null) {
			medicationrequestsetsubstitutionsetreason.setText(m.getMedicationrequestSubstitutionReasonText());
		}
		return medicationrequest;
	}
}
