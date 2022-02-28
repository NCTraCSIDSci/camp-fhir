package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MedicationRequest;
public class MedicationRequestConversion 
{
	public org.hl7.fhir.r4.model.MedicationRequest MedicationRequests(MedicationRequest m) throws ParseException
	{
		org.hl7.fhir.r4.model.MedicationRequest medicationrequest = new org.hl7.fhir.r4.model.MedicationRequest();

		/******************** id ********************************************************************************/
		medicationrequest.setId(m.getId());

		/******************** Medreq_AuthoredOn ********************************************************************************/
		if(m.getMedreqAuthoredOn() != null) {
			java.text.SimpleDateFormat MedreqAuthoredOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqAuthoredOndate = MedreqAuthoredOnsdf.parse(m.getMedreqAuthoredOn());
			medicationrequest.setAuthoredOn(MedreqAuthoredOndate);
		}
		/******************** Medreq_BasedOn ********************************************************************************/
		if(m.getMedreqBasedOn() != null) {
			org.hl7.fhir.r4.model.Reference MedreqBasedOnref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addBasedOn(MedreqBasedOnref.setReference(m.getMedreqBasedOn()));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestaddcategory = medicationrequest.addCategory();


		org.hl7.fhir.r4.model.Coding medicationrequestaddcategoryaddcoding = medicationrequestaddcategory.addCoding();

		/******************** Medreq_Category_Coding_Code ********************************************************************************/
		if(m.getMedreqCategoryCodingCode() != null) {
			medicationrequestaddcategoryaddcoding.setCode(m.getMedreqCategoryCodingCode());
		}
		/******************** Medreq_Category_Coding_Display ********************************************************************************/
		if(m.getMedreqCategoryCodingDisplay() != null) {
			medicationrequestaddcategoryaddcoding.setDisplay(m.getMedreqCategoryCodingDisplay());
		}
		/******************** Medreq_Category_Coding_System ********************************************************************************/
		if(m.getMedreqCategoryCodingSystem() != null) {
			medicationrequestaddcategoryaddcoding.setSystem(m.getMedreqCategoryCodingSystem());
		}
		/******************** Medreq_Category_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqCategoryCodingUsrslt() != null) {
			medicationrequestaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqCategoryCodingUsrslt()));
		}
		/******************** Medreq_Category_Coding_Version ********************************************************************************/
		if(m.getMedreqCategoryCodingVersion() != null) {
			medicationrequestaddcategoryaddcoding.setVersion(m.getMedreqCategoryCodingVersion());
		}
		/******************** Medreq_Category_Text ********************************************************************************/
		if(m.getMedreqCategoryText() != null) {
			medicationrequestaddcategory.setText(m.getMedreqCategoryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetcourseoftherapytype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setCourseOfTherapyType(medicationrequestsetcourseoftherapytype);


		org.hl7.fhir.r4.model.Coding medicationrequestsetcourseoftherapytypeaddcoding = medicationrequestsetcourseoftherapytype.addCoding();

		/******************** Medreq_CourseOfTherapyType_Coding_Code ********************************************************************************/
		if(m.getMedreqCourseOfTherapyTypeCodingCode() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setCode(m.getMedreqCourseOfTherapyTypeCodingCode());
		}
		/******************** Medreq_CourseOfTherapyType_Coding_Display ********************************************************************************/
		if(m.getMedreqCourseOfTherapyTypeCodingDisplay() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setDisplay(m.getMedreqCourseOfTherapyTypeCodingDisplay());
		}
		/******************** Medreq_CourseOfTherapyType_Coding_System ********************************************************************************/
		if(m.getMedreqCourseOfTherapyTypeCodingSystem() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setSystem(m.getMedreqCourseOfTherapyTypeCodingSystem());
		}
		/******************** Medreq_CourseOfTherapyType_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqCourseOfTherapyTypeCodingUsrslt() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqCourseOfTherapyTypeCodingUsrslt()));
		}
		/******************** Medreq_CourseOfTherapyType_Coding_Version ********************************************************************************/
		if(m.getMedreqCourseOfTherapyTypeCodingVersion() != null) {
			medicationrequestsetcourseoftherapytypeaddcoding.setVersion(m.getMedreqCourseOfTherapyTypeCodingVersion());
		}
		/******************** Medreq_CourseOfTherapyType_Text ********************************************************************************/
		if(m.getMedreqCourseOfTherapyTypeText() != null) {
			medicationrequestsetcourseoftherapytype.setText(m.getMedreqCourseOfTherapyTypeText());
		}
		/******************** Medreq_DetectedIssue ********************************************************************************/
		if(m.getMedreqDetectedIssue() != null) {
			org.hl7.fhir.r4.model.Reference MedreqDetectedIssueref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addDetectedIssue(MedreqDetectedIssueref.setReference(m.getMedreqDetectedIssue()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent medicationrequestsetdispenserequest = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestComponent();
		medicationrequest.setDispenseRequest(medicationrequestsetdispenserequest);

		/******************** Medreq_DispenseRequest_DispenseInterval ********************************************************************************/
		if(m.getMedreqDispenseRequestDispenseInterval() != null) {
			org.hl7.fhir.r4.model.Duration MedreqDispenseRequestDispenseIntervaldur = new org.hl7.fhir.r4.model.Duration();
			medicationrequestsetdispenserequest.setDispenseInterval((org.hl7.fhir.r4.model.Duration)MedreqDispenseRequestDispenseIntervaldur.setValue(Double.parseDouble(m.getMedreqDispenseRequestDispenseInterval())));
		}
		/******************** Medreq_DispenseRequest_ExpectedSupplyDuration ********************************************************************************/
		if(m.getMedreqDispenseRequestExpectedSupplyDuration() != null) {
			org.hl7.fhir.r4.model.Duration MedreqDispenseRequestExpectedSupplyDurationdur = new org.hl7.fhir.r4.model.Duration();
			medicationrequestsetdispenserequest.setExpectedSupplyDuration((org.hl7.fhir.r4.model.Duration)MedreqDispenseRequestExpectedSupplyDurationdur.setValue(Double.parseDouble(m.getMedreqDispenseRequestExpectedSupplyDuration())));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent medicationrequestsetdispenserequestsetinitialfill = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestDispenseRequestInitialFillComponent();
		medicationrequestsetdispenserequest.setInitialFill(medicationrequestsetdispenserequestsetinitialfill);

		/******************** Medreq_DispenseRequest_InitialFill_Duration ********************************************************************************/
		if(m.getMedreqDispenseRequestInitialFillDuration() != null) {
			org.hl7.fhir.r4.model.Duration MedreqDispenseRequestInitialFillDurationdur = new org.hl7.fhir.r4.model.Duration();
			medicationrequestsetdispenserequestsetinitialfill.setDuration((org.hl7.fhir.r4.model.Duration)MedreqDispenseRequestInitialFillDurationdur.setValue(Double.parseDouble(m.getMedreqDispenseRequestInitialFillDuration())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestsetdispenserequestsetinitialfillsetquantity = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestsetdispenserequestsetinitialfill.setQuantity(medicationrequestsetdispenserequestsetinitialfillsetquantity);

		/******************** Medreq_DispenseRequest_InitialFill_Quantity_Code ********************************************************************************/
		if(m.getMedreqDispenseRequestInitialFillQuantityCode() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setCode(m.getMedreqDispenseRequestInitialFillQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestsetdispenserequestsetinitialfillsetquantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_DispenseRequest_InitialFill_Quantity_Compartr_Code ********************************************************************************/
		if(m.getMedreqDispenseRequestInitialFillQuantityCompartrCode() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setComparator(medicationrequestsetdispenserequestsetinitialfillsetquantitysetcomparatorEnumFactory.fromCode(m.getMedreqDispenseRequestInitialFillQuantityCompartrCode()));

		}
		/******************** Medreq_DispenseRequest_InitialFill_Quantity_System ********************************************************************************/
		if(m.getMedreqDispenseRequestInitialFillQuantitySystem() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setSystem(m.getMedreqDispenseRequestInitialFillQuantitySystem());
		}
		/******************** Medreq_DispenseRequest_InitialFill_Quantity_Unit ********************************************************************************/
		if(m.getMedreqDispenseRequestInitialFillQuantityUnit() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setUnit(m.getMedreqDispenseRequestInitialFillQuantityUnit());
		}
		/******************** Medreq_DispenseRequest_InitialFill_Quantity_Value ********************************************************************************/
		if(m.getMedreqDispenseRequestInitialFillQuantityValue() != null) {
			medicationrequestsetdispenserequestsetinitialfillsetquantity.setValue(Double.parseDouble((m.getMedreqDispenseRequestInitialFillQuantityValue())));
		}
		/******************** Medreq_DispenseRequest_NumberOfRepeatsAllowed ********************************************************************************/
		if(m.getMedreqDispenseRequestNumberOfRepeatsAllowed() != null) {
			medicationrequestsetdispenserequest.setNumberOfRepeatsAllowed(Integer.parseInt(m.getMedreqDispenseRequestNumberOfRepeatsAllowed()));
		}
		/******************** Medreq_DispenseRequest_Performer ********************************************************************************/
		if(m.getMedreqDispenseRequestPerformer() != null) {
			org.hl7.fhir.r4.model.Reference MedreqDispenseRequestPerformerref = new org.hl7.fhir.r4.model.Reference();
			medicationrequestsetdispenserequest.setPerformer(MedreqDispenseRequestPerformerref.setReference(m.getMedreqDispenseRequestPerformer()));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestsetdispenserequestsetquantity = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestsetdispenserequest.setQuantity(medicationrequestsetdispenserequestsetquantity);

		/******************** Medreq_DispenseRequest_Quantity_Code ********************************************************************************/
		if(m.getMedreqDispenseRequestQuantityCode() != null) {
			medicationrequestsetdispenserequestsetquantity.setCode(m.getMedreqDispenseRequestQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestsetdispenserequestsetquantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_DispenseRequest_Quantity_Compartr_Code ********************************************************************************/
		if(m.getMedreqDispenseRequestQuantityCompartrCode() != null) {
			medicationrequestsetdispenserequestsetquantity.setComparator(medicationrequestsetdispenserequestsetquantitysetcomparatorEnumFactory.fromCode(m.getMedreqDispenseRequestQuantityCompartrCode()));

		}
		/******************** Medreq_DispenseRequest_Quantity_System ********************************************************************************/
		if(m.getMedreqDispenseRequestQuantitySystem() != null) {
			medicationrequestsetdispenserequestsetquantity.setSystem(m.getMedreqDispenseRequestQuantitySystem());
		}
		/******************** Medreq_DispenseRequest_Quantity_Unit ********************************************************************************/
		if(m.getMedreqDispenseRequestQuantityUnit() != null) {
			medicationrequestsetdispenserequestsetquantity.setUnit(m.getMedreqDispenseRequestQuantityUnit());
		}
		/******************** Medreq_DispenseRequest_Quantity_Value ********************************************************************************/
		if(m.getMedreqDispenseRequestQuantityValue() != null) {
			medicationrequestsetdispenserequestsetquantity.setValue(Double.parseDouble((m.getMedreqDispenseRequestQuantityValue())));
		}

		org.hl7.fhir.r4.model.Period medicationrequestsetdispenserequestsetvalidityperiod = new org.hl7.fhir.r4.model.Period();
		medicationrequestsetdispenserequest.setValidityPeriod(medicationrequestsetdispenserequestsetvalidityperiod);

		/******************** Medreq_DispenseRequest_ValidityPeriod_End ********************************************************************************/
		if(m.getMedreqDispenseRequestValidityPeriodEnd() != null) {
			java.text.SimpleDateFormat MedreqDispenseRequestValidityPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqDispenseRequestValidityPeriodEnddate = MedreqDispenseRequestValidityPeriodEndsdf.parse(m.getMedreqDispenseRequestValidityPeriodEnd());
			medicationrequestsetdispenserequestsetvalidityperiod.setEnd(MedreqDispenseRequestValidityPeriodEnddate);
		}
		/******************** Medreq_DispenseRequest_ValidityPeriod_Start ********************************************************************************/
		if(m.getMedreqDispenseRequestValidityPeriodStart() != null) {
			java.text.SimpleDateFormat MedreqDispenseRequestValidityPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqDispenseRequestValidityPeriodStartdate = MedreqDispenseRequestValidityPeriodStartsdf.parse(m.getMedreqDispenseRequestValidityPeriodStart());
			medicationrequestsetdispenserequestsetvalidityperiod.setStart(MedreqDispenseRequestValidityPeriodStartdate);
		}
		/******************** Medreq_DoNotPerform ********************************************************************************/
		if(m.getMedreqDoNotPerform() != null) {
			medicationrequest.setDoNotPerform(Boolean.parseBoolean(m.getMedreqDoNotPerform()));
		}

		org.hl7.fhir.r4.model.Dosage medicationrequestadddosageinstruction = medicationrequest.addDosageInstruction();


		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionaddadditionalinstruction = medicationrequestadddosageinstruction.addAdditionalInstruction();


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionaddadditionalinstructionaddcoding = medicationrequestadddosageinstructionaddadditionalinstruction.addCoding();

		/******************** Medreq_Doseins_AdditionalInstruction_Coding_Code ********************************************************************************/
		if(m.getMedreqDoseinsAdditionalInstructionCodingCode() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setCode(m.getMedreqDoseinsAdditionalInstructionCodingCode());
		}
		/******************** Medreq_Doseins_AdditionalInstruction_Coding_Display ********************************************************************************/
		if(m.getMedreqDoseinsAdditionalInstructionCodingDisplay() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setDisplay(m.getMedreqDoseinsAdditionalInstructionCodingDisplay());
		}
		/******************** Medreq_Doseins_AdditionalInstruction_Coding_System ********************************************************************************/
		if(m.getMedreqDoseinsAdditionalInstructionCodingSystem() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setSystem(m.getMedreqDoseinsAdditionalInstructionCodingSystem());
		}
		/******************** Medreq_Doseins_AdditionalInstruction_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqDoseinsAdditionalInstructionCodingUsrslt() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqDoseinsAdditionalInstructionCodingUsrslt()));
		}
		/******************** Medreq_Doseins_AdditionalInstruction_Coding_Version ********************************************************************************/
		if(m.getMedreqDoseinsAdditionalInstructionCodingVersion() != null) {
			medicationrequestadddosageinstructionaddadditionalinstructionaddcoding.setVersion(m.getMedreqDoseinsAdditionalInstructionCodingVersion());
		}
		/******************** Medreq_Doseins_AdditionalInstruction_Text ********************************************************************************/
		if(m.getMedreqDoseinsAdditionalInstructionText() != null) {
			medicationrequestadddosageinstructionaddadditionalinstruction.setText(m.getMedreqDoseinsAdditionalInstructionText());
		}
		/******************** Medicationrequest_DosageInstruction_AsNeededBoolean ********************************************************************************/
		if(m.getMedicationrequestDosageInstructionAsNeededBoolean() != null) {
			medicationrequestadddosageinstruction.setAsNeeded(new org.hl7.fhir.r4.model.BooleanType(m.getMedicationrequestDosageInstructionAsNeededBoolean()));
		}

		if( m.getMedreqDoseinsAsNeededCodeableConceptCodingCode() != null || m.getMedreqDoseinsAsNeededCodeableConceptCodingDisplay() != null || m.getMedreqDoseinsAsNeededCodeableConceptCodingSystem() != null || m.getMedreqDoseinsAsNeededCodeableConceptCodingUsrslt() != null || m.getMedreqDoseinsAsNeededCodeableConceptCodingVersion() != null || m.getMedreqDoseinsAsNeededCodeableConceptText() != null ) {
			org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionsetasneededCodeableConcept = new org.hl7.fhir.r4.model.CodeableConcept();
			medicationrequestadddosageinstruction.setAsNeeded(medicationrequestadddosageinstructionsetasneededCodeableConcept);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionsetasneededCodeableConceptaddcoding = medicationrequestadddosageinstructionsetasneededCodeableConcept.addCoding();

		/******************** Medreq_Doseins_AsNeeded_CodeableConcept_Coding_Code ********************************************************************************/
		if(m.getMedreqDoseinsAsNeededCodeableConceptCodingCode() != null) {
			medicationrequestadddosageinstructionsetasneededCodeableConceptaddcoding.setCode(m.getMedreqDoseinsAsNeededCodeableConceptCodingCode());
		}
		/******************** Medreq_Doseins_AsNeeded_CodeableConcept_Coding_Display ********************************************************************************/
		if(m.getMedreqDoseinsAsNeededCodeableConceptCodingDisplay() != null) {
			medicationrequestadddosageinstructionsetasneededCodeableConceptaddcoding.setDisplay(m.getMedreqDoseinsAsNeededCodeableConceptCodingDisplay());
		}
		/******************** Medreq_Doseins_AsNeeded_CodeableConcept_Coding_System ********************************************************************************/
		if(m.getMedreqDoseinsAsNeededCodeableConceptCodingSystem() != null) {
			medicationrequestadddosageinstructionsetasneededCodeableConceptaddcoding.setSystem(m.getMedreqDoseinsAsNeededCodeableConceptCodingSystem());
		}
		/******************** Medreq_Doseins_AsNeeded_CodeableConcept_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqDoseinsAsNeededCodeableConceptCodingUsrslt() != null) {
			medicationrequestadddosageinstructionsetasneededCodeableConceptaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqDoseinsAsNeededCodeableConceptCodingUsrslt()));
		}
		/******************** Medreq_Doseins_AsNeeded_CodeableConcept_Coding_Version ********************************************************************************/
		if(m.getMedreqDoseinsAsNeededCodeableConceptCodingVersion() != null) {
			medicationrequestadddosageinstructionsetasneededCodeableConceptaddcoding.setVersion(m.getMedreqDoseinsAsNeededCodeableConceptCodingVersion());
		}
		/******************** Medreq_Doseins_AsNeeded_CodeableConcept_Text ********************************************************************************/
		if(m.getMedreqDoseinsAsNeededCodeableConceptText() != null) {
			medicationrequestadddosageinstructionsetasneededCodeableConcept.setText(m.getMedreqDoseinsAsNeededCodeableConceptText());
		}
		}

		org.hl7.fhir.r4.model.Dosage.DosageDoseAndRateComponent medicationrequestadddosageinstructionadddoseandrate = medicationrequestadddosageinstruction.addDoseAndRate();


		if( m.getMedreqDoseinsDoseAndRateDoseQuantityCode() != null || m.getMedreqDoseinsDoseAndRateDoseQuantityCompartrCode() != null || m.getMedreqDoseinsDoseAndRateDoseQuantitySystem() != null || m.getMedreqDoseinsDoseAndRateDoseQuantityUnit() != null || m.getMedreqDoseinsDoseAndRateDoseQuantityValue() != null ) {
			org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionadddoseandratesetdoseQuantity = new org.hl7.fhir.r4.model.Quantity();
			medicationrequestadddosageinstructionadddoseandrate.setDose(medicationrequestadddosageinstructionadddoseandratesetdoseQuantity);

		/******************** Medreq_Doseins_DoseAndRate_Dose_Quantity_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseQuantityCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseQuantity.setCode(m.getMedreqDoseinsDoseAndRateDoseQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionadddoseandratesetdoseQuantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_DoseAndRate_Dose_Quantity_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseQuantityCompartrCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseQuantity.setComparator(medicationrequestadddosageinstructionadddoseandratesetdoseQuantitysetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsDoseAndRateDoseQuantityCompartrCode()));

		}
		/******************** Medreq_Doseins_DoseAndRate_Dose_Quantity_System ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseQuantitySystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseQuantity.setSystem(m.getMedreqDoseinsDoseAndRateDoseQuantitySystem());
		}
		/******************** Medreq_Doseins_DoseAndRate_Dose_Quantity_Unit ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseQuantityUnit() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseQuantity.setUnit(m.getMedreqDoseinsDoseAndRateDoseQuantityUnit());
		}
		/******************** Medreq_Doseins_DoseAndRate_Dose_Quantity_Value ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseQuantityValue() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseQuantity.setValue(Double.parseDouble((m.getMedreqDoseinsDoseAndRateDoseQuantityValue())));
		}
		}

		if( m.getMedreqDoseinsDoseAndRateDoseRangeHighCode() != null || m.getMedreqDoseinsDoseAndRateDoseRangeHighCompartrCode() != null || m.getMedreqDoseinsDoseAndRateDoseRangeHighSystem() != null || m.getMedreqDoseinsDoseAndRateDoseRangeHighUnit() != null || m.getMedreqDoseinsDoseAndRateDoseRangeHighValue() != null || m.getMedreqDoseinsDoseAndRateDoseRangeLowCode() != null || m.getMedreqDoseinsDoseAndRateDoseRangeLowCompartrCode() != null || m.getMedreqDoseinsDoseAndRateDoseRangeLowSystem() != null || m.getMedreqDoseinsDoseAndRateDoseRangeLowUnit() != null || m.getMedreqDoseinsDoseAndRateDoseRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range medicationrequestadddosageinstructionadddoseandratesetdoseRange = new org.hl7.fhir.r4.model.Range();
			medicationrequestadddosageinstructionadddoseandrate.setDose(medicationrequestadddosageinstructionadddoseandratesetdoseRange);


		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionadddoseandratesetdoseRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionadddoseandratesetdoseRange.setHigh(medicationrequestadddosageinstructionadddoseandratesetdoseRangesethigh);

		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_High_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeHighCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesethigh.setCode(m.getMedreqDoseinsDoseAndRateDoseRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionadddoseandratesetdoseRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_High_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeHighCompartrCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesethigh.setComparator(medicationrequestadddosageinstructionadddoseandratesetdoseRangesethighsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsDoseAndRateDoseRangeHighCompartrCode()));

		}
		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_High_System ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeHighSystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesethigh.setSystem(m.getMedreqDoseinsDoseAndRateDoseRangeHighSystem());
		}
		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_High_Unit ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeHighUnit() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesethigh.setUnit(m.getMedreqDoseinsDoseAndRateDoseRangeHighUnit());
		}
		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_High_Value ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeHighValue() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesethigh.setValue(Double.parseDouble((m.getMedreqDoseinsDoseAndRateDoseRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionadddoseandratesetdoseRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionadddoseandratesetdoseRange.setLow(medicationrequestadddosageinstructionadddoseandratesetdoseRangesetlow);

		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_Low_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeLowCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesetlow.setCode(m.getMedreqDoseinsDoseAndRateDoseRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionadddoseandratesetdoseRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_Low_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeLowCompartrCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesetlow.setComparator(medicationrequestadddosageinstructionadddoseandratesetdoseRangesetlowsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsDoseAndRateDoseRangeLowCompartrCode()));

		}
		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_Low_System ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeLowSystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesetlow.setSystem(m.getMedreqDoseinsDoseAndRateDoseRangeLowSystem());
		}
		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_Low_Unit ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeLowUnit() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesetlow.setUnit(m.getMedreqDoseinsDoseAndRateDoseRangeLowUnit());
		}
		/******************** Medreq_Doseins_DoseAndRate_Dose_Range_Low_Value ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateDoseRangeLowValue() != null) {
			medicationrequestadddosageinstructionadddoseandratesetdoseRangesetlow.setValue(Double.parseDouble((m.getMedreqDoseinsDoseAndRateDoseRangeLowValue())));
		}
		}

		if( m.getMedreqDoseinsDoseAndRateRateQuantityCode() != null || m.getMedreqDoseinsDoseAndRateRateQuantityCompartrCode() != null || m.getMedreqDoseinsDoseAndRateRateQuantitySystem() != null || m.getMedreqDoseinsDoseAndRateRateQuantityUnit() != null || m.getMedreqDoseinsDoseAndRateRateQuantityValue() != null ) {
			org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionadddoseandratesetrateQuantity = new org.hl7.fhir.r4.model.Quantity();
			medicationrequestadddosageinstructionadddoseandrate.setRate(medicationrequestadddosageinstructionadddoseandratesetrateQuantity);

		/******************** Medreq_Doseins_DoseAndRate_Rate_Quantity_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateQuantityCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateQuantity.setCode(m.getMedreqDoseinsDoseAndRateRateQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionadddoseandratesetrateQuantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_DoseAndRate_Rate_Quantity_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateQuantityCompartrCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateQuantity.setComparator(medicationrequestadddosageinstructionadddoseandratesetrateQuantitysetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsDoseAndRateRateQuantityCompartrCode()));

		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Quantity_System ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateQuantitySystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateQuantity.setSystem(m.getMedreqDoseinsDoseAndRateRateQuantitySystem());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Quantity_Unit ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateQuantityUnit() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateQuantity.setUnit(m.getMedreqDoseinsDoseAndRateRateQuantityUnit());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Quantity_Value ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateQuantityValue() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateQuantity.setValue(Double.parseDouble((m.getMedreqDoseinsDoseAndRateRateQuantityValue())));
		}
		}

		if( m.getMedreqDoseinsDoseAndRateRateRangeHighCode() != null || m.getMedreqDoseinsDoseAndRateRateRangeHighCompartrCode() != null || m.getMedreqDoseinsDoseAndRateRateRangeHighSystem() != null || m.getMedreqDoseinsDoseAndRateRateRangeHighUnit() != null || m.getMedreqDoseinsDoseAndRateRateRangeHighValue() != null || m.getMedreqDoseinsDoseAndRateRateRangeLowCode() != null || m.getMedreqDoseinsDoseAndRateRateRangeLowCompartrCode() != null || m.getMedreqDoseinsDoseAndRateRateRangeLowSystem() != null || m.getMedreqDoseinsDoseAndRateRateRangeLowUnit() != null || m.getMedreqDoseinsDoseAndRateRateRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range medicationrequestadddosageinstructionadddoseandratesetrateRange = new org.hl7.fhir.r4.model.Range();
			medicationrequestadddosageinstructionadddoseandrate.setRate(medicationrequestadddosageinstructionadddoseandratesetrateRange);


		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionadddoseandratesetrateRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionadddoseandratesetrateRange.setHigh(medicationrequestadddosageinstructionadddoseandratesetrateRangesethigh);

		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_High_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeHighCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesethigh.setCode(m.getMedreqDoseinsDoseAndRateRateRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionadddoseandratesetrateRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_High_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeHighCompartrCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesethigh.setComparator(medicationrequestadddosageinstructionadddoseandratesetrateRangesethighsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsDoseAndRateRateRangeHighCompartrCode()));

		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_High_System ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeHighSystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesethigh.setSystem(m.getMedreqDoseinsDoseAndRateRateRangeHighSystem());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_High_Unit ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeHighUnit() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesethigh.setUnit(m.getMedreqDoseinsDoseAndRateRateRangeHighUnit());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_High_Value ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeHighValue() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesethigh.setValue(Double.parseDouble((m.getMedreqDoseinsDoseAndRateRateRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionadddoseandratesetrateRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionadddoseandratesetrateRange.setLow(medicationrequestadddosageinstructionadddoseandratesetrateRangesetlow);

		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_Low_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeLowCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesetlow.setCode(m.getMedreqDoseinsDoseAndRateRateRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionadddoseandratesetrateRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_Low_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeLowCompartrCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesetlow.setComparator(medicationrequestadddosageinstructionadddoseandratesetrateRangesetlowsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsDoseAndRateRateRangeLowCompartrCode()));

		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_Low_System ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeLowSystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesetlow.setSystem(m.getMedreqDoseinsDoseAndRateRateRangeLowSystem());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_Low_Unit ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeLowUnit() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesetlow.setUnit(m.getMedreqDoseinsDoseAndRateRateRangeLowUnit());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Range_Low_Value ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRangeLowValue() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRangesetlow.setValue(Double.parseDouble((m.getMedreqDoseinsDoseAndRateRateRangeLowValue())));
		}
		}

		if( m.getMedreqDoseinsDoseAndRateRateRatioDenomCode() != null || m.getMedreqDoseinsDoseAndRateRateRatioDenomCompartrCode() != null || m.getMedreqDoseinsDoseAndRateRateRatioDenomSystem() != null || m.getMedreqDoseinsDoseAndRateRateRatioDenomUnit() != null || m.getMedreqDoseinsDoseAndRateRateRatioDenomValue() != null || m.getMedreqDoseinsDoseAndRateRateRatioNumeratorCode() != null || m.getMedreqDoseinsDoseAndRateRateRatioNumeratorCompartrCode() != null || m.getMedreqDoseinsDoseAndRateRateRatioNumeratorSystem() != null || m.getMedreqDoseinsDoseAndRateRateRatioNumeratorUnit() != null || m.getMedreqDoseinsDoseAndRateRateRatioNumeratorValue() != null ) {
			org.hl7.fhir.r4.model.Ratio medicationrequestadddosageinstructionadddoseandratesetrateRatio = new org.hl7.fhir.r4.model.Ratio();
			medicationrequestadddosageinstructionadddoseandrate.setRate(medicationrequestadddosageinstructionadddoseandratesetrateRatio);


		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionadddoseandratesetrateRatiosetdenominator = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionadddoseandratesetrateRatio.setDenominator(medicationrequestadddosageinstructionadddoseandratesetrateRatiosetdenominator);

		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioDenomCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetdenominator.setCode(m.getMedreqDoseinsDoseAndRateRateRatioDenomCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionadddoseandratesetrateRatiosetdenominatorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioDenomCompartrCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetdenominator.setComparator(medicationrequestadddosageinstructionadddoseandratesetrateRatiosetdenominatorsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsDoseAndRateRateRatioDenomCompartrCode()));

		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_System ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioDenomSystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetdenominator.setSystem(m.getMedreqDoseinsDoseAndRateRateRatioDenomSystem());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_Unit ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioDenomUnit() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetdenominator.setUnit(m.getMedreqDoseinsDoseAndRateRateRatioDenomUnit());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Denom_Value ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioDenomValue() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetdenominator.setValue(Double.parseDouble((m.getMedreqDoseinsDoseAndRateRateRatioDenomValue())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionadddoseandratesetrateRatiosetnumerator = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionadddoseandratesetrateRatio.setNumerator(medicationrequestadddosageinstructionadddoseandratesetrateRatiosetnumerator);

		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioNumeratorCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetnumerator.setCode(m.getMedreqDoseinsDoseAndRateRateRatioNumeratorCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionadddoseandratesetrateRatiosetnumeratorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioNumeratorCompartrCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetnumerator.setComparator(medicationrequestadddosageinstructionadddoseandratesetrateRatiosetnumeratorsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsDoseAndRateRateRatioNumeratorCompartrCode()));

		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_System ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioNumeratorSystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetnumerator.setSystem(m.getMedreqDoseinsDoseAndRateRateRatioNumeratorSystem());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_Unit ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioNumeratorUnit() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetnumerator.setUnit(m.getMedreqDoseinsDoseAndRateRateRatioNumeratorUnit());
		}
		/******************** Medreq_Doseins_DoseAndRate_Rate_Ratio_Numerator_Value ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateRateRatioNumeratorValue() != null) {
			medicationrequestadddosageinstructionadddoseandratesetrateRatiosetnumerator.setValue(Double.parseDouble((m.getMedreqDoseinsDoseAndRateRateRatioNumeratorValue())));
		}
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionadddoseandratesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstructionadddoseandrate.setType(medicationrequestadddosageinstructionadddoseandratesettype);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionadddoseandratesettypeaddcoding = medicationrequestadddosageinstructionadddoseandratesettype.addCoding();

		/******************** Medreq_Doseins_DoseAndRate_Type_Coding_Code ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateTypeCodingCode() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setCode(m.getMedreqDoseinsDoseAndRateTypeCodingCode());
		}
		/******************** Medreq_Doseins_DoseAndRate_Type_Coding_Display ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateTypeCodingDisplay() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setDisplay(m.getMedreqDoseinsDoseAndRateTypeCodingDisplay());
		}
		/******************** Medreq_Doseins_DoseAndRate_Type_Coding_System ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateTypeCodingSystem() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setSystem(m.getMedreqDoseinsDoseAndRateTypeCodingSystem());
		}
		/******************** Medreq_Doseins_DoseAndRate_Type_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateTypeCodingUsrslt() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqDoseinsDoseAndRateTypeCodingUsrslt()));
		}
		/******************** Medreq_Doseins_DoseAndRate_Type_Coding_Version ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateTypeCodingVersion() != null) {
			medicationrequestadddosageinstructionadddoseandratesettypeaddcoding.setVersion(m.getMedreqDoseinsDoseAndRateTypeCodingVersion());
		}
		/******************** Medreq_Doseins_DoseAndRate_Type_Text ********************************************************************************/
		if(m.getMedreqDoseinsDoseAndRateTypeText() != null) {
			medicationrequestadddosageinstructionadddoseandratesettype.setText(m.getMedreqDoseinsDoseAndRateTypeText());
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsetmaxdoseperadministration = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstruction.setMaxDosePerAdministration(medicationrequestadddosageinstructionsetmaxdoseperadministration);

		/******************** Medreq_Doseins_MaxDosePerAdministration_Code ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerAdministrationCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setCode(m.getMedreqDoseinsMaxDosePerAdministrationCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsetmaxdoseperadministrationsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_MaxDosePerAdministration_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerAdministrationCompartrCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setComparator(medicationrequestadddosageinstructionsetmaxdoseperadministrationsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsMaxDosePerAdministrationCompartrCode()));

		}
		/******************** Medreq_Doseins_MaxDosePerAdministration_System ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerAdministrationSystem() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setSystem(m.getMedreqDoseinsMaxDosePerAdministrationSystem());
		}
		/******************** Medreq_Doseins_MaxDosePerAdministration_Unit ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerAdministrationUnit() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setUnit(m.getMedreqDoseinsMaxDosePerAdministrationUnit());
		}
		/******************** Medreq_Doseins_MaxDosePerAdministration_Value ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerAdministrationValue() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperadministration.setValue(Double.parseDouble((m.getMedreqDoseinsMaxDosePerAdministrationValue())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsetmaxdoseperlifetime = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstruction.setMaxDosePerLifetime(medicationrequestadddosageinstructionsetmaxdoseperlifetime);

		/******************** Medreq_Doseins_MaxDosePerLifetime_Code ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerLifetimeCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setCode(m.getMedreqDoseinsMaxDosePerLifetimeCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsetmaxdoseperlifetimesetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_MaxDosePerLifetime_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerLifetimeCompartrCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setComparator(medicationrequestadddosageinstructionsetmaxdoseperlifetimesetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsMaxDosePerLifetimeCompartrCode()));

		}
		/******************** Medreq_Doseins_MaxDosePerLifetime_System ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerLifetimeSystem() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setSystem(m.getMedreqDoseinsMaxDosePerLifetimeSystem());
		}
		/******************** Medreq_Doseins_MaxDosePerLifetime_Unit ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerLifetimeUnit() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setUnit(m.getMedreqDoseinsMaxDosePerLifetimeUnit());
		}
		/******************** Medreq_Doseins_MaxDosePerLifetime_Value ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerLifetimeValue() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperlifetime.setValue(Double.parseDouble((m.getMedreqDoseinsMaxDosePerLifetimeValue())));
		}

		org.hl7.fhir.r4.model.Ratio medicationrequestadddosageinstructionsetmaxdoseperperiod = new org.hl7.fhir.r4.model.Ratio();
		medicationrequestadddosageinstruction.setMaxDosePerPeriod(medicationrequestadddosageinstructionsetmaxdoseperperiod);


		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionsetmaxdoseperperiod.setDenominator(medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator);

		/******************** Medreq_Doseins_MaxDosePerPeriod_Denom_Code ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodDenomCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setCode(m.getMedreqDoseinsMaxDosePerPeriodDenomCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominatorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_MaxDosePerPeriod_Denom_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodDenomCompartrCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setComparator(medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominatorsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsMaxDosePerPeriodDenomCompartrCode()));

		}
		/******************** Medreq_Doseins_MaxDosePerPeriod_Denom_System ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodDenomSystem() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setSystem(m.getMedreqDoseinsMaxDosePerPeriodDenomSystem());
		}
		/******************** Medreq_Doseins_MaxDosePerPeriod_Denom_Unit ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodDenomUnit() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setUnit(m.getMedreqDoseinsMaxDosePerPeriodDenomUnit());
		}
		/******************** Medreq_Doseins_MaxDosePerPeriod_Denom_Value ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodDenomValue() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetdenominator.setValue(Double.parseDouble((m.getMedreqDoseinsMaxDosePerPeriodDenomValue())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionsetmaxdoseperperiod.setNumerator(medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator);

		/******************** Medreq_Doseins_MaxDosePerPeriod_Numerator_Code ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodNumeratorCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setCode(m.getMedreqDoseinsMaxDosePerPeriodNumeratorCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumeratorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_MaxDosePerPeriod_Numerator_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodNumeratorCompartrCode() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setComparator(medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumeratorsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsMaxDosePerPeriodNumeratorCompartrCode()));

		}
		/******************** Medreq_Doseins_MaxDosePerPeriod_Numerator_System ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodNumeratorSystem() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setSystem(m.getMedreqDoseinsMaxDosePerPeriodNumeratorSystem());
		}
		/******************** Medreq_Doseins_MaxDosePerPeriod_Numerator_Unit ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodNumeratorUnit() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setUnit(m.getMedreqDoseinsMaxDosePerPeriodNumeratorUnit());
		}
		/******************** Medreq_Doseins_MaxDosePerPeriod_Numerator_Value ********************************************************************************/
		if(m.getMedreqDoseinsMaxDosePerPeriodNumeratorValue() != null) {
			medicationrequestadddosageinstructionsetmaxdoseperperiodsetnumerator.setValue(Double.parseDouble((m.getMedreqDoseinsMaxDosePerPeriodNumeratorValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionsetmethod = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstruction.setMethod(medicationrequestadddosageinstructionsetmethod);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionsetmethodaddcoding = medicationrequestadddosageinstructionsetmethod.addCoding();

		/******************** Medreq_Doseins_Method_Coding_Code ********************************************************************************/
		if(m.getMedreqDoseinsMethodCodingCode() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setCode(m.getMedreqDoseinsMethodCodingCode());
		}
		/******************** Medreq_Doseins_Method_Coding_Display ********************************************************************************/
		if(m.getMedreqDoseinsMethodCodingDisplay() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setDisplay(m.getMedreqDoseinsMethodCodingDisplay());
		}
		/******************** Medreq_Doseins_Method_Coding_System ********************************************************************************/
		if(m.getMedreqDoseinsMethodCodingSystem() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setSystem(m.getMedreqDoseinsMethodCodingSystem());
		}
		/******************** Medreq_Doseins_Method_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqDoseinsMethodCodingUsrslt() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqDoseinsMethodCodingUsrslt()));
		}
		/******************** Medreq_Doseins_Method_Coding_Version ********************************************************************************/
		if(m.getMedreqDoseinsMethodCodingVersion() != null) {
			medicationrequestadddosageinstructionsetmethodaddcoding.setVersion(m.getMedreqDoseinsMethodCodingVersion());
		}
		/******************** Medreq_Doseins_Method_Text ********************************************************************************/
		if(m.getMedreqDoseinsMethodText() != null) {
			medicationrequestadddosageinstructionsetmethod.setText(m.getMedreqDoseinsMethodText());
		}
		/******************** Medreq_Doseins_PatientInstruction ********************************************************************************/
		if(m.getMedreqDoseinsPatientInstruction() != null) {
			medicationrequestadddosageinstruction.setPatientInstruction(m.getMedreqDoseinsPatientInstruction());
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionsetroute = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstruction.setRoute(medicationrequestadddosageinstructionsetroute);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionsetrouteaddcoding = medicationrequestadddosageinstructionsetroute.addCoding();

		/******************** Medreq_Doseins_Route_Coding_Code ********************************************************************************/
		if(m.getMedreqDoseinsRouteCodingCode() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setCode(m.getMedreqDoseinsRouteCodingCode());
		}
		/******************** Medreq_Doseins_Route_Coding_Display ********************************************************************************/
		if(m.getMedreqDoseinsRouteCodingDisplay() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setDisplay(m.getMedreqDoseinsRouteCodingDisplay());
		}
		/******************** Medreq_Doseins_Route_Coding_System ********************************************************************************/
		if(m.getMedreqDoseinsRouteCodingSystem() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setSystem(m.getMedreqDoseinsRouteCodingSystem());
		}
		/******************** Medreq_Doseins_Route_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqDoseinsRouteCodingUsrslt() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqDoseinsRouteCodingUsrslt()));
		}
		/******************** Medreq_Doseins_Route_Coding_Version ********************************************************************************/
		if(m.getMedreqDoseinsRouteCodingVersion() != null) {
			medicationrequestadddosageinstructionsetrouteaddcoding.setVersion(m.getMedreqDoseinsRouteCodingVersion());
		}
		/******************** Medreq_Doseins_Route_Text ********************************************************************************/
		if(m.getMedreqDoseinsRouteText() != null) {
			medicationrequestadddosageinstructionsetroute.setText(m.getMedreqDoseinsRouteText());
		}
		/******************** Medreq_Doseins_Sequence ********************************************************************************/
		if(m.getMedreqDoseinsSequence() != null) {
			medicationrequestadddosageinstruction.setSequence(Integer.parseInt(m.getMedreqDoseinsSequence()));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionsetsite = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstruction.setSite(medicationrequestadddosageinstructionsetsite);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionsetsiteaddcoding = medicationrequestadddosageinstructionsetsite.addCoding();

		/******************** Medreq_Doseins_Site_Coding_Code ********************************************************************************/
		if(m.getMedreqDoseinsSiteCodingCode() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setCode(m.getMedreqDoseinsSiteCodingCode());
		}
		/******************** Medreq_Doseins_Site_Coding_Display ********************************************************************************/
		if(m.getMedreqDoseinsSiteCodingDisplay() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setDisplay(m.getMedreqDoseinsSiteCodingDisplay());
		}
		/******************** Medreq_Doseins_Site_Coding_System ********************************************************************************/
		if(m.getMedreqDoseinsSiteCodingSystem() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setSystem(m.getMedreqDoseinsSiteCodingSystem());
		}
		/******************** Medreq_Doseins_Site_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqDoseinsSiteCodingUsrslt() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqDoseinsSiteCodingUsrslt()));
		}
		/******************** Medreq_Doseins_Site_Coding_Version ********************************************************************************/
		if(m.getMedreqDoseinsSiteCodingVersion() != null) {
			medicationrequestadddosageinstructionsetsiteaddcoding.setVersion(m.getMedreqDoseinsSiteCodingVersion());
		}
		/******************** Medreq_Doseins_Site_Text ********************************************************************************/
		if(m.getMedreqDoseinsSiteText() != null) {
			medicationrequestadddosageinstructionsetsite.setText(m.getMedreqDoseinsSiteText());
		}
		/******************** Medreq_Doseins_Text ********************************************************************************/
		if(m.getMedreqDoseinsText() != null) {
			medicationrequestadddosageinstruction.setText(m.getMedreqDoseinsText());
		}

		org.hl7.fhir.r4.model.Timing medicationrequestadddosageinstructionsettiming = new org.hl7.fhir.r4.model.Timing();
		medicationrequestadddosageinstruction.setTiming(medicationrequestadddosageinstructionsettiming);


		org.hl7.fhir.r4.model.CodeableConcept medicationrequestadddosageinstructionsettimingsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestadddosageinstructionsettiming.setCode(medicationrequestadddosageinstructionsettimingsetcode);


		org.hl7.fhir.r4.model.Coding medicationrequestadddosageinstructionsettimingsetcodeaddcoding = medicationrequestadddosageinstructionsettimingsetcode.addCoding();

		/******************** Medreq_Doseins_Timing_Code_Coding_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingCodeCodingCode() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setCode(m.getMedreqDoseinsTimingCodeCodingCode());
		}
		/******************** Medreq_Doseins_Timing_Code_Coding_Display ********************************************************************************/
		if(m.getMedreqDoseinsTimingCodeCodingDisplay() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setDisplay(m.getMedreqDoseinsTimingCodeCodingDisplay());
		}
		/******************** Medreq_Doseins_Timing_Code_Coding_System ********************************************************************************/
		if(m.getMedreqDoseinsTimingCodeCodingSystem() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setSystem(m.getMedreqDoseinsTimingCodeCodingSystem());
		}
		/******************** Medreq_Doseins_Timing_Code_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqDoseinsTimingCodeCodingUsrslt() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqDoseinsTimingCodeCodingUsrslt()));
		}
		/******************** Medreq_Doseins_Timing_Code_Coding_Version ********************************************************************************/
		if(m.getMedreqDoseinsTimingCodeCodingVersion() != null) {
			medicationrequestadddosageinstructionsettimingsetcodeaddcoding.setVersion(m.getMedreqDoseinsTimingCodeCodingVersion());
		}
		/******************** Medreq_Doseins_Timing_Code_Text ********************************************************************************/
		if(m.getMedreqDoseinsTimingCodeText() != null) {
			medicationrequestadddosageinstructionsettimingsetcode.setText(m.getMedreqDoseinsTimingCodeText());
		}
		/******************** Medreq_Doseins_Timing_Event ********************************************************************************/
		if(m.getMedreqDoseinsTimingEvent() != null) {
			java.text.SimpleDateFormat MedreqDoseinsTimingEventsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqDoseinsTimingEventdate = MedreqDoseinsTimingEventsdf.parse(m.getMedreqDoseinsTimingEvent());
			medicationrequestadddosageinstructionsettiming.addEvent(MedreqDoseinsTimingEventdate);
		}

		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent medicationrequestadddosageinstructionsettimingsetrepeat = new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		medicationrequestadddosageinstructionsettiming.setRepeat(medicationrequestadddosageinstructionsettimingsetrepeat);


		if( m.getMedreqDoseinsTimingRepeatBoundsDurationCode() != null || m.getMedreqDoseinsTimingRepeatBoundsDurationCompartrCode() != null || m.getMedreqDoseinsTimingRepeatBoundsDurationSystem() != null || m.getMedreqDoseinsTimingRepeatBoundsDurationUnit() != null || m.getMedreqDoseinsTimingRepeatBoundsDurationValue() != null ) {
			org.hl7.fhir.r4.model.Duration medicationrequestadddosageinstructionsettimingsetrepeatsetboundsDuration = new org.hl7.fhir.r4.model.Duration();
			medicationrequestadddosageinstructionsettimingsetrepeat.setBounds(medicationrequestadddosageinstructionsettimingsetrepeatsetboundsDuration);

		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Duration_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsDurationCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsDuration.setCode(m.getMedreqDoseinsTimingRepeatBoundsDurationCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsettimingsetrepeatsetboundsDurationsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Duration_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsDurationCompartrCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsDuration.setComparator(medicationrequestadddosageinstructionsettimingsetrepeatsetboundsDurationsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsTimingRepeatBoundsDurationCompartrCode()));

		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Duration_System ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsDurationSystem() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsDuration.setSystem(m.getMedreqDoseinsTimingRepeatBoundsDurationSystem());
		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Duration_Unit ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsDurationUnit() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsDuration.setUnit(m.getMedreqDoseinsTimingRepeatBoundsDurationUnit());
		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Duration_Value ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsDurationValue() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsDuration.setValue(Double.parseDouble((m.getMedreqDoseinsTimingRepeatBoundsDurationValue())));
		}
		}

		if( m.getMedreqDoseinsTimingRepeatBoundsPeriodEnd() != null || m.getMedreqDoseinsTimingRepeatBoundsPeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period medicationrequestadddosageinstructionsettimingsetrepeatsetboundsPeriod = new org.hl7.fhir.r4.model.Period();
			medicationrequestadddosageinstructionsettimingsetrepeat.setBounds(medicationrequestadddosageinstructionsettimingsetrepeatsetboundsPeriod);

		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Period_End ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsPeriodEnd() != null) {
			java.text.SimpleDateFormat MedreqDoseinsTimingRepeatBoundsPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqDoseinsTimingRepeatBoundsPeriodEnddate = MedreqDoseinsTimingRepeatBoundsPeriodEndsdf.parse(m.getMedreqDoseinsTimingRepeatBoundsPeriodEnd());
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsPeriod.setEnd(MedreqDoseinsTimingRepeatBoundsPeriodEnddate);
		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Period_Start ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsPeriodStart() != null) {
			java.text.SimpleDateFormat MedreqDoseinsTimingRepeatBoundsPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqDoseinsTimingRepeatBoundsPeriodStartdate = MedreqDoseinsTimingRepeatBoundsPeriodStartsdf.parse(m.getMedreqDoseinsTimingRepeatBoundsPeriodStart());
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsPeriod.setStart(MedreqDoseinsTimingRepeatBoundsPeriodStartdate);
		}
		}

		if( m.getMedreqDoseinsTimingRepeatBoundsRangeHighCode() != null || m.getMedreqDoseinsTimingRepeatBoundsRangeHighCompartrCode() != null || m.getMedreqDoseinsTimingRepeatBoundsRangeHighSystem() != null || m.getMedreqDoseinsTimingRepeatBoundsRangeHighUnit() != null || m.getMedreqDoseinsTimingRepeatBoundsRangeHighValue() != null || m.getMedreqDoseinsTimingRepeatBoundsRangeLowCode() != null || m.getMedreqDoseinsTimingRepeatBoundsRangeLowCompartrCode() != null || m.getMedreqDoseinsTimingRepeatBoundsRangeLowSystem() != null || m.getMedreqDoseinsTimingRepeatBoundsRangeLowUnit() != null || m.getMedreqDoseinsTimingRepeatBoundsRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRange = new org.hl7.fhir.r4.model.Range();
			medicationrequestadddosageinstructionsettimingsetrepeat.setBounds(medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRange);


		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRange.setHigh(medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesethigh);

		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_High_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeHighCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesethigh.setCode(m.getMedreqDoseinsTimingRepeatBoundsRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_High_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeHighCompartrCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesethigh.setComparator(medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesethighsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsTimingRepeatBoundsRangeHighCompartrCode()));

		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_High_System ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeHighSystem() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesethigh.setSystem(m.getMedreqDoseinsTimingRepeatBoundsRangeHighSystem());
		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_High_Unit ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeHighUnit() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesethigh.setUnit(m.getMedreqDoseinsTimingRepeatBoundsRangeHighUnit());
		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_High_Value ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeHighValue() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesethigh.setValue(Double.parseDouble((m.getMedreqDoseinsTimingRepeatBoundsRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRange.setLow(medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesetlow);

		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeLowCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesetlow.setCode(m.getMedreqDoseinsTimingRepeatBoundsRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_Compartr_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeLowCompartrCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesetlow.setComparator(medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesetlowsetcomparatorEnumFactory.fromCode(m.getMedreqDoseinsTimingRepeatBoundsRangeLowCompartrCode()));

		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_System ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeLowSystem() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesetlow.setSystem(m.getMedreqDoseinsTimingRepeatBoundsRangeLowSystem());
		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_Unit ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeLowUnit() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesetlow.setUnit(m.getMedreqDoseinsTimingRepeatBoundsRangeLowUnit());
		}
		/******************** Medreq_Doseins_Timing_Repeat_Bounds_Range_Low_Value ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatBoundsRangeLowValue() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeatsetboundsRangesetlow.setValue(Double.parseDouble((m.getMedreqDoseinsTimingRepeatBoundsRangeLowValue())));
		}
		}
		/******************** Medreq_Doseins_Timing_Repeat_Count ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatCount() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setCount(Integer.parseInt(m.getMedreqDoseinsTimingRepeatCount()));
		}
		/******************** Medreq_Doseins_Timing_Repeat_CountMax ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatCountMax() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setCountMax(Integer.parseInt(m.getMedreqDoseinsTimingRepeatCountMax()));
		}

		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory medicationrequestadddosageinstructionsettimingsetrepeatadddayofweekEnumFactory = new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();

		/******************** Medreq_Doseins_Timing_Repeat_DayOfWeek_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatDayOfWeekCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.addDayOfWeek(medicationrequestadddosageinstructionsettimingsetrepeatadddayofweekEnumFactory.fromCode(m.getMedreqDoseinsTimingRepeatDayOfWeekCode()));

		}
		/******************** Medreq_Doseins_Timing_Repeat_Duration ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatDuration() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setDuration(Double.parseDouble((m.getMedreqDoseinsTimingRepeatDuration())));
		}
		/******************** Medreq_Doseins_Timing_Repeat_DurationMax ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatDurationMax() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setDurationMax(Double.parseDouble((m.getMedreqDoseinsTimingRepeatDurationMax())));
		}

		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationrequestadddosageinstructionsettimingsetrepeatsetdurationunitEnumFactory = new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();

		/******************** Medreq_Doseins_Timing_Repeat_DurationUnit_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatDurationUnitCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setDurationUnit(medicationrequestadddosageinstructionsettimingsetrepeatsetdurationunitEnumFactory.fromCode(m.getMedreqDoseinsTimingRepeatDurationUnitCode()));

		}
		/******************** Medreq_Doseins_Timing_Repeat_Frequency ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatFrequency() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setFrequency(Integer.parseInt(m.getMedreqDoseinsTimingRepeatFrequency()));
		}
		/******************** Medreq_Doseins_Timing_Repeat_FrequencyMax ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatFrequencyMax() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setFrequencyMax(Integer.parseInt(m.getMedreqDoseinsTimingRepeatFrequencyMax()));
		}
		/******************** Medreq_Doseins_Timing_Repeat_Off ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatOff() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setOffset(Integer.parseInt(m.getMedreqDoseinsTimingRepeatOff()));
		}
		/******************** Medreq_Doseins_Timing_Repeat_Period ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatPeriod() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setPeriod(Double.parseDouble((m.getMedreqDoseinsTimingRepeatPeriod())));
		}
		/******************** Medreq_Doseins_Timing_Repeat_PeriodMax ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatPeriodMax() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setPeriodMax(Double.parseDouble((m.getMedreqDoseinsTimingRepeatPeriodMax())));
		}

		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory medicationrequestadddosageinstructionsettimingsetrepeatsetperiodunitEnumFactory = new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();

		/******************** Medreq_Doseins_Timing_Repeat_PeriodUnit_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatPeriodUnitCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.setPeriodUnit(medicationrequestadddosageinstructionsettimingsetrepeatsetperiodunitEnumFactory.fromCode(m.getMedreqDoseinsTimingRepeatPeriodUnitCode()));

		}
		/******************** Medreq_Doseins_Timing_Repeat_TimeOfDay ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatTimeOfDay() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.addTimeOfDay(m.getMedreqDoseinsTimingRepeatTimeOfDay());
		}

		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory medicationrequestadddosageinstructionsettimingsetrepeataddwhenEnumFactory = new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();

		/******************** Medreq_Doseins_Timing_Repeat_When_Code ********************************************************************************/
		if(m.getMedreqDoseinsTimingRepeatWhenCode() != null) {
			medicationrequestadddosageinstructionsettimingsetrepeat.addWhen(medicationrequestadddosageinstructionsettimingsetrepeataddwhenEnumFactory.fromCode(m.getMedreqDoseinsTimingRepeatWhenCode()));

		}
		/******************** Medreq_Enc ********************************************************************************/
		if(m.getMedreqEnc() != null) {
			org.hl7.fhir.r4.model.Reference MedreqEncref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setEncounter(MedreqEncref.setReference(m.getMedreqEnc()));
		}
		/******************** Medreq_EventHistory ********************************************************************************/
		if(m.getMedreqEventHistory() != null) {
			org.hl7.fhir.r4.model.Reference MedreqEventHistoryref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addEventHistory(MedreqEventHistoryref.setReference(m.getMedreqEventHistory()));
		}

		org.hl7.fhir.r4.model.Identifier medicationrequestsetgroupidentifier = new org.hl7.fhir.r4.model.Identifier();
		medicationrequest.setGroupIdentifier(medicationrequestsetgroupidentifier);

		/******************** Medreq_GroupId_Assigner ********************************************************************************/
		if(m.getMedreqGroupIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference MedreqGroupIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			medicationrequestsetgroupidentifier.setAssigner(MedreqGroupIdAssignerref.setReference(m.getMedreqGroupIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period medicationrequestsetgroupidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		medicationrequestsetgroupidentifier.setPeriod(medicationrequestsetgroupidentifiersetperiod);

		/******************** Medreq_GroupId_Period_End ********************************************************************************/
		if(m.getMedreqGroupIdPeriodEnd() != null) {
			java.text.SimpleDateFormat MedreqGroupIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqGroupIdPeriodEnddate = MedreqGroupIdPeriodEndsdf.parse(m.getMedreqGroupIdPeriodEnd());
			medicationrequestsetgroupidentifiersetperiod.setEnd(MedreqGroupIdPeriodEnddate);
		}
		/******************** Medreq_GroupId_Period_Start ********************************************************************************/
		if(m.getMedreqGroupIdPeriodStart() != null) {
			java.text.SimpleDateFormat MedreqGroupIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqGroupIdPeriodStartdate = MedreqGroupIdPeriodStartsdf.parse(m.getMedreqGroupIdPeriodStart());
			medicationrequestsetgroupidentifiersetperiod.setStart(MedreqGroupIdPeriodStartdate);
		}
		/******************** Medreq_GroupId_System ********************************************************************************/
		if(m.getMedreqGroupIdSystem() != null) {
			medicationrequestsetgroupidentifier.setSystem(m.getMedreqGroupIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetgroupidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestsetgroupidentifier.setType(medicationrequestsetgroupidentifiersettype);


		org.hl7.fhir.r4.model.Coding medicationrequestsetgroupidentifiersettypeaddcoding = medicationrequestsetgroupidentifiersettype.addCoding();

		/******************** Medreq_GroupId_Type_Coding_Code ********************************************************************************/
		if(m.getMedreqGroupIdTypeCodingCode() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setCode(m.getMedreqGroupIdTypeCodingCode());
		}
		/******************** Medreq_GroupId_Type_Coding_Display ********************************************************************************/
		if(m.getMedreqGroupIdTypeCodingDisplay() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setDisplay(m.getMedreqGroupIdTypeCodingDisplay());
		}
		/******************** Medreq_GroupId_Type_Coding_System ********************************************************************************/
		if(m.getMedreqGroupIdTypeCodingSystem() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setSystem(m.getMedreqGroupIdTypeCodingSystem());
		}
		/******************** Medreq_GroupId_Type_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqGroupIdTypeCodingUsrslt() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqGroupIdTypeCodingUsrslt()));
		}
		/******************** Medreq_GroupId_Type_Coding_Version ********************************************************************************/
		if(m.getMedreqGroupIdTypeCodingVersion() != null) {
			medicationrequestsetgroupidentifiersettypeaddcoding.setVersion(m.getMedreqGroupIdTypeCodingVersion());
		}
		/******************** Medreq_GroupId_Type_Text ********************************************************************************/
		if(m.getMedreqGroupIdTypeText() != null) {
			medicationrequestsetgroupidentifiersettype.setText(m.getMedreqGroupIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationrequestsetgroupidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Medreq_GroupId_Use_Code ********************************************************************************/
		if(m.getMedreqGroupIdUseCode() != null) {
			medicationrequestsetgroupidentifier.setUse(medicationrequestsetgroupidentifiersetuseEnumFactory.fromCode(m.getMedreqGroupIdUseCode()));

		}
		/******************** Medreq_GroupId_Value ********************************************************************************/
		if(m.getMedreqGroupIdValue() != null) {
			medicationrequestsetgroupidentifier.setValue(m.getMedreqGroupIdValue());
		}

		org.hl7.fhir.r4.model.Identifier medicationrequestaddidentifier = medicationrequest.addIdentifier();

		/******************** Medreq_Id_Assigner ********************************************************************************/
		if(m.getMedreqIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference MedreqIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			medicationrequestaddidentifier.setAssigner(MedreqIdAssignerref.setReference(m.getMedreqIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period medicationrequestaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		medicationrequestaddidentifier.setPeriod(medicationrequestaddidentifiersetperiod);

		/******************** Medreq_Id_Period_End ********************************************************************************/
		if(m.getMedreqIdPeriodEnd() != null) {
			java.text.SimpleDateFormat MedreqIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqIdPeriodEnddate = MedreqIdPeriodEndsdf.parse(m.getMedreqIdPeriodEnd());
			medicationrequestaddidentifiersetperiod.setEnd(MedreqIdPeriodEnddate);
		}
		/******************** Medreq_Id_Period_Start ********************************************************************************/
		if(m.getMedreqIdPeriodStart() != null) {
			java.text.SimpleDateFormat MedreqIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqIdPeriodStartdate = MedreqIdPeriodStartsdf.parse(m.getMedreqIdPeriodStart());
			medicationrequestaddidentifiersetperiod.setStart(MedreqIdPeriodStartdate);
		}
		/******************** Medreq_Id_System ********************************************************************************/
		if(m.getMedreqIdSystem() != null) {
			medicationrequestaddidentifier.setSystem(m.getMedreqIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestaddidentifier.setType(medicationrequestaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding medicationrequestaddidentifiersettypeaddcoding = medicationrequestaddidentifiersettype.addCoding();

		/******************** Medreq_Id_Type_Coding_Code ********************************************************************************/
		if(m.getMedreqIdTypeCodingCode() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setCode(m.getMedreqIdTypeCodingCode());
		}
		/******************** Medreq_Id_Type_Coding_Display ********************************************************************************/
		if(m.getMedreqIdTypeCodingDisplay() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setDisplay(m.getMedreqIdTypeCodingDisplay());
		}
		/******************** Medreq_Id_Type_Coding_System ********************************************************************************/
		if(m.getMedreqIdTypeCodingSystem() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setSystem(m.getMedreqIdTypeCodingSystem());
		}
		/******************** Medreq_Id_Type_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqIdTypeCodingUsrslt() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqIdTypeCodingUsrslt()));
		}
		/******************** Medreq_Id_Type_Coding_Version ********************************************************************************/
		if(m.getMedreqIdTypeCodingVersion() != null) {
			medicationrequestaddidentifiersettypeaddcoding.setVersion(m.getMedreqIdTypeCodingVersion());
		}
		/******************** Medreq_Id_Type_Text ********************************************************************************/
		if(m.getMedreqIdTypeText() != null) {
			medicationrequestaddidentifiersettype.setText(m.getMedreqIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory medicationrequestaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Medreq_Id_Use_Code ********************************************************************************/
		if(m.getMedreqIdUseCode() != null) {
			medicationrequestaddidentifier.setUse(medicationrequestaddidentifiersetuseEnumFactory.fromCode(m.getMedreqIdUseCode()));

		}
		/******************** Medreq_Id_Value ********************************************************************************/
		if(m.getMedreqIdValue() != null) {
			medicationrequestaddidentifier.setValue(m.getMedreqIdValue());
		}
		/******************** Medreq_InstantiatesCanonical ********************************************************************************/
		if(m.getMedreqInstantiatesCanonical() != null) {
			medicationrequest.addInstantiatesCanonical(m.getMedreqInstantiatesCanonical());
		}
		/******************** Medreq_InstantiatesUri ********************************************************************************/
		if(m.getMedreqInstantiatesUri() != null) {
			medicationrequest.addInstantiatesUri(m.getMedreqInstantiatesUri());
		}
		/******************** Medreq_Insurance ********************************************************************************/
		if(m.getMedreqInsurance() != null) {
			org.hl7.fhir.r4.model.Reference MedreqInsuranceref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addInsurance(MedreqInsuranceref.setReference(m.getMedreqInsurance()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntentEnumFactory medicationrequestsetintentEnumFactory = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestIntentEnumFactory();

		/******************** Medreq_Intent_Code ********************************************************************************/
		if(m.getMedreqIntentCode() != null) {
			medicationrequest.setIntent(medicationrequestsetintentEnumFactory.fromCode(m.getMedreqIntentCode()));

		}

		if( m.getMedreqMedicationCodeableConceptCodingCode() != null || m.getMedreqMedicationCodeableConceptCodingDisplay() != null || m.getMedreqMedicationCodeableConceptCodingSystem() != null || m.getMedreqMedicationCodeableConceptCodingUsrslt() != null || m.getMedreqMedicationCodeableConceptCodingVersion() != null || m.getMedreqMedicationCodeableConceptText() != null ) {
			org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetmedicationCodeableConcept = new org.hl7.fhir.r4.model.CodeableConcept();
			medicationrequest.setMedication(medicationrequestsetmedicationCodeableConcept);


		org.hl7.fhir.r4.model.Coding medicationrequestsetmedicationCodeableConceptaddcoding = medicationrequestsetmedicationCodeableConcept.addCoding();

		/******************** Medreq_Medication_CodeableConcept_Coding_Code ********************************************************************************/
		if(m.getMedreqMedicationCodeableConceptCodingCode() != null) {
			medicationrequestsetmedicationCodeableConceptaddcoding.setCode(m.getMedreqMedicationCodeableConceptCodingCode());
		}
		/******************** Medreq_Medication_CodeableConcept_Coding_Display ********************************************************************************/
		if(m.getMedreqMedicationCodeableConceptCodingDisplay() != null) {
			medicationrequestsetmedicationCodeableConceptaddcoding.setDisplay(m.getMedreqMedicationCodeableConceptCodingDisplay());
		}
		/******************** Medreq_Medication_CodeableConcept_Coding_System ********************************************************************************/
		if(m.getMedreqMedicationCodeableConceptCodingSystem() != null) {
			medicationrequestsetmedicationCodeableConceptaddcoding.setSystem(m.getMedreqMedicationCodeableConceptCodingSystem());
		}
		/******************** Medreq_Medication_CodeableConcept_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqMedicationCodeableConceptCodingUsrslt() != null) {
			medicationrequestsetmedicationCodeableConceptaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqMedicationCodeableConceptCodingUsrslt()));
		}
		/******************** Medreq_Medication_CodeableConcept_Coding_Version ********************************************************************************/
		if(m.getMedreqMedicationCodeableConceptCodingVersion() != null) {
			medicationrequestsetmedicationCodeableConceptaddcoding.setVersion(m.getMedreqMedicationCodeableConceptCodingVersion());
		}
		/******************** Medreq_Medication_CodeableConcept_Text ********************************************************************************/
		if(m.getMedreqMedicationCodeableConceptText() != null) {
			medicationrequestsetmedicationCodeableConcept.setText(m.getMedreqMedicationCodeableConceptText());
		}
		}
		/******************** Medicationrequest_MedicationReference ********************************************************************************/
		if(m.getMedicationrequestMedicationReference() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestMedicationReferenceref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setMedication(MedicationrequestMedicationReferenceref.setReference(m.getMedicationrequestMedicationReference()));
		}

		org.hl7.fhir.r4.model.Annotation medicationrequestaddnote = medicationrequest.addNote();

		/******************** Medicationrequest_Note_AuthorReference ********************************************************************************/
		if(m.getMedicationrequestNoteAuthorReference() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestNoteAuthorReferenceref = new org.hl7.fhir.r4.model.Reference();
			medicationrequestaddnote.setAuthor(MedicationrequestNoteAuthorReferenceref.setReference(m.getMedicationrequestNoteAuthorReference()));
		}
		/******************** Medicationrequest_Note_AuthorString ********************************************************************************/
		if(m.getMedicationrequestNoteAuthorString() != null) {
			medicationrequestaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(m.getMedicationrequestNoteAuthorString()));
		}
		/******************** Medreq_Note_Text ********************************************************************************/
		if(m.getMedreqNoteText() != null) {
			medicationrequestaddnote.setText(m.getMedreqNoteText());
		}
		/******************** Medreq_Note_Time ********************************************************************************/
		if(m.getMedreqNoteTime() != null) {
			java.text.SimpleDateFormat MedreqNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MedreqNoteTimedate = MedreqNoteTimesdf.parse(m.getMedreqNoteTime());
			medicationrequestaddnote.setTime(MedreqNoteTimedate);
		}
		/******************** Medreq_Performer ********************************************************************************/
		if(m.getMedreqPerformer() != null) {
			org.hl7.fhir.r4.model.Reference MedreqPerformerref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setPerformer(MedreqPerformerref.setReference(m.getMedreqPerformer()));
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetperformertype = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setPerformerType(medicationrequestsetperformertype);


		org.hl7.fhir.r4.model.Coding medicationrequestsetperformertypeaddcoding = medicationrequestsetperformertype.addCoding();

		/******************** Medreq_PerformerType_Coding_Code ********************************************************************************/
		if(m.getMedreqPerformerTypeCodingCode() != null) {
			medicationrequestsetperformertypeaddcoding.setCode(m.getMedreqPerformerTypeCodingCode());
		}
		/******************** Medreq_PerformerType_Coding_Display ********************************************************************************/
		if(m.getMedreqPerformerTypeCodingDisplay() != null) {
			medicationrequestsetperformertypeaddcoding.setDisplay(m.getMedreqPerformerTypeCodingDisplay());
		}
		/******************** Medreq_PerformerType_Coding_System ********************************************************************************/
		if(m.getMedreqPerformerTypeCodingSystem() != null) {
			medicationrequestsetperformertypeaddcoding.setSystem(m.getMedreqPerformerTypeCodingSystem());
		}
		/******************** Medreq_PerformerType_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqPerformerTypeCodingUsrslt() != null) {
			medicationrequestsetperformertypeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqPerformerTypeCodingUsrslt()));
		}
		/******************** Medreq_PerformerType_Coding_Version ********************************************************************************/
		if(m.getMedreqPerformerTypeCodingVersion() != null) {
			medicationrequestsetperformertypeaddcoding.setVersion(m.getMedreqPerformerTypeCodingVersion());
		}
		/******************** Medreq_PerformerType_Text ********************************************************************************/
		if(m.getMedreqPerformerTypeText() != null) {
			medicationrequestsetperformertype.setText(m.getMedreqPerformerTypeText());
		}
		/******************** Medreq_PriorPrescription ********************************************************************************/
		if(m.getMedreqPriorPrescription() != null) {
			org.hl7.fhir.r4.model.Reference MedreqPriorPrescriptionref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setPriorPrescription(MedreqPriorPrescriptionref.setReference(m.getMedreqPriorPrescription()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriorityEnumFactory medicationrequestsetpriorityEnumFactory = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestPriorityEnumFactory();

		/******************** Medreq_Priority_Code ********************************************************************************/
		if(m.getMedreqPriorityCode() != null) {
			medicationrequest.setPriority(medicationrequestsetpriorityEnumFactory.fromCode(m.getMedreqPriorityCode()));

		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestaddreasoncode = medicationrequest.addReasonCode();


		org.hl7.fhir.r4.model.Coding medicationrequestaddreasoncodeaddcoding = medicationrequestaddreasoncode.addCoding();

		/******************** Medreq_ReasonCode_Coding_Code ********************************************************************************/
		if(m.getMedreqReasonCodeCodingCode() != null) {
			medicationrequestaddreasoncodeaddcoding.setCode(m.getMedreqReasonCodeCodingCode());
		}
		/******************** Medreq_ReasonCode_Coding_Display ********************************************************************************/
		if(m.getMedreqReasonCodeCodingDisplay() != null) {
			medicationrequestaddreasoncodeaddcoding.setDisplay(m.getMedreqReasonCodeCodingDisplay());
		}
		/******************** Medreq_ReasonCode_Coding_System ********************************************************************************/
		if(m.getMedreqReasonCodeCodingSystem() != null) {
			medicationrequestaddreasoncodeaddcoding.setSystem(m.getMedreqReasonCodeCodingSystem());
		}
		/******************** Medreq_ReasonCode_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqReasonCodeCodingUsrslt() != null) {
			medicationrequestaddreasoncodeaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqReasonCodeCodingUsrslt()));
		}
		/******************** Medreq_ReasonCode_Coding_Version ********************************************************************************/
		if(m.getMedreqReasonCodeCodingVersion() != null) {
			medicationrequestaddreasoncodeaddcoding.setVersion(m.getMedreqReasonCodeCodingVersion());
		}
		/******************** Medreq_ReasonCode_Text ********************************************************************************/
		if(m.getMedreqReasonCodeText() != null) {
			medicationrequestaddreasoncode.setText(m.getMedreqReasonCodeText());
		}
		/******************** Medreq_ReasonReference ********************************************************************************/
		if(m.getMedreqReasonReference() != null) {
			org.hl7.fhir.r4.model.Reference MedreqReasonReferenceref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addReasonReference(MedreqReasonReferenceref.setReference(m.getMedreqReasonReference()));
		}
		/******************** Medreq_Recorder ********************************************************************************/
		if(m.getMedreqRecorder() != null) {
			org.hl7.fhir.r4.model.Reference MedreqRecorderref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setRecorder(MedreqRecorderref.setReference(m.getMedreqRecorder()));
		}
		/******************** Medicationrequest_ReportedBoolean ********************************************************************************/
		if(m.getMedicationrequestReportedBoolean() != null) {
			medicationrequest.setReported(new org.hl7.fhir.r4.model.BooleanType(m.getMedicationrequestReportedBoolean()));
		}
		/******************** Medicationrequest_ReportedReference ********************************************************************************/
		if(m.getMedicationrequestReportedReference() != null) {
			org.hl7.fhir.r4.model.Reference MedicationrequestReportedReferenceref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setReported(MedicationrequestReportedReferenceref.setReference(m.getMedicationrequestReportedReference()));
		}
		/******************** Medreq_Requester ********************************************************************************/
		if(m.getMedreqRequester() != null) {
			org.hl7.fhir.r4.model.Reference MedreqRequesterref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setRequester(MedreqRequesterref.setReference(m.getMedreqRequester()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatusEnumFactory medicationrequestsetstatusEnumFactory = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestStatusEnumFactory();

		/******************** Medreq_Status_Code ********************************************************************************/
		if(m.getMedreqStatusCode() != null) {
			medicationrequest.setStatus(medicationrequestsetstatusEnumFactory.fromCode(m.getMedreqStatusCode()));

		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetstatusreason = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequest.setStatusReason(medicationrequestsetstatusreason);


		org.hl7.fhir.r4.model.Coding medicationrequestsetstatusreasonaddcoding = medicationrequestsetstatusreason.addCoding();

		/******************** Medreq_StatusReason_Coding_Code ********************************************************************************/
		if(m.getMedreqStatusReasonCodingCode() != null) {
			medicationrequestsetstatusreasonaddcoding.setCode(m.getMedreqStatusReasonCodingCode());
		}
		/******************** Medreq_StatusReason_Coding_Display ********************************************************************************/
		if(m.getMedreqStatusReasonCodingDisplay() != null) {
			medicationrequestsetstatusreasonaddcoding.setDisplay(m.getMedreqStatusReasonCodingDisplay());
		}
		/******************** Medreq_StatusReason_Coding_System ********************************************************************************/
		if(m.getMedreqStatusReasonCodingSystem() != null) {
			medicationrequestsetstatusreasonaddcoding.setSystem(m.getMedreqStatusReasonCodingSystem());
		}
		/******************** Medreq_StatusReason_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqStatusReasonCodingUsrslt() != null) {
			medicationrequestsetstatusreasonaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqStatusReasonCodingUsrslt()));
		}
		/******************** Medreq_StatusReason_Coding_Version ********************************************************************************/
		if(m.getMedreqStatusReasonCodingVersion() != null) {
			medicationrequestsetstatusreasonaddcoding.setVersion(m.getMedreqStatusReasonCodingVersion());
		}
		/******************** Medreq_StatusReason_Text ********************************************************************************/
		if(m.getMedreqStatusReasonText() != null) {
			medicationrequestsetstatusreason.setText(m.getMedreqStatusReasonText());
		}
		/******************** Medreq_Subject ********************************************************************************/
		if(m.getMedreqSubject() != null) {
			org.hl7.fhir.r4.model.Reference MedreqSubjectref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.setSubject(MedreqSubjectref.setReference(m.getMedreqSubject()));
		}

		org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent medicationrequestsetsubstitution = new org.hl7.fhir.r4.model.MedicationRequest.MedicationRequestSubstitutionComponent();
		medicationrequest.setSubstitution(medicationrequestsetsubstitution);

		/******************** Medicationrequest_Substitution_AllowedBoolean ********************************************************************************/
		if(m.getMedicationrequestSubstitutionAllowedBoolean() != null) {
			medicationrequestsetsubstitution.setAllowed(new org.hl7.fhir.r4.model.BooleanType(m.getMedicationrequestSubstitutionAllowedBoolean()));
		}

		if( m.getMedreqSubstitutionAllowedCodeableConceptCodingCode() != null || m.getMedreqSubstitutionAllowedCodeableConceptCodingDisplay() != null || m.getMedreqSubstitutionAllowedCodeableConceptCodingSystem() != null || m.getMedreqSubstitutionAllowedCodeableConceptCodingUsrslt() != null || m.getMedreqSubstitutionAllowedCodeableConceptCodingVersion() != null || m.getMedreqSubstitutionAllowedCodeableConceptText() != null ) {
			org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetsubstitutionsetallowedCodeableConcept = new org.hl7.fhir.r4.model.CodeableConcept();
			medicationrequestsetsubstitution.setAllowed(medicationrequestsetsubstitutionsetallowedCodeableConcept);


		org.hl7.fhir.r4.model.Coding medicationrequestsetsubstitutionsetallowedCodeableConceptaddcoding = medicationrequestsetsubstitutionsetallowedCodeableConcept.addCoding();

		/******************** Medreq_Substitution_Allowed_CodeableConcept_Coding_Code ********************************************************************************/
		if(m.getMedreqSubstitutionAllowedCodeableConceptCodingCode() != null) {
			medicationrequestsetsubstitutionsetallowedCodeableConceptaddcoding.setCode(m.getMedreqSubstitutionAllowedCodeableConceptCodingCode());
		}
		/******************** Medreq_Substitution_Allowed_CodeableConcept_Coding_Display ********************************************************************************/
		if(m.getMedreqSubstitutionAllowedCodeableConceptCodingDisplay() != null) {
			medicationrequestsetsubstitutionsetallowedCodeableConceptaddcoding.setDisplay(m.getMedreqSubstitutionAllowedCodeableConceptCodingDisplay());
		}
		/******************** Medreq_Substitution_Allowed_CodeableConcept_Coding_System ********************************************************************************/
		if(m.getMedreqSubstitutionAllowedCodeableConceptCodingSystem() != null) {
			medicationrequestsetsubstitutionsetallowedCodeableConceptaddcoding.setSystem(m.getMedreqSubstitutionAllowedCodeableConceptCodingSystem());
		}
		/******************** Medreq_Substitution_Allowed_CodeableConcept_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqSubstitutionAllowedCodeableConceptCodingUsrslt() != null) {
			medicationrequestsetsubstitutionsetallowedCodeableConceptaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqSubstitutionAllowedCodeableConceptCodingUsrslt()));
		}
		/******************** Medreq_Substitution_Allowed_CodeableConcept_Coding_Version ********************************************************************************/
		if(m.getMedreqSubstitutionAllowedCodeableConceptCodingVersion() != null) {
			medicationrequestsetsubstitutionsetallowedCodeableConceptaddcoding.setVersion(m.getMedreqSubstitutionAllowedCodeableConceptCodingVersion());
		}
		/******************** Medreq_Substitution_Allowed_CodeableConcept_Text ********************************************************************************/
		if(m.getMedreqSubstitutionAllowedCodeableConceptText() != null) {
			medicationrequestsetsubstitutionsetallowedCodeableConcept.setText(m.getMedreqSubstitutionAllowedCodeableConceptText());
		}
		}

		org.hl7.fhir.r4.model.CodeableConcept medicationrequestsetsubstitutionsetreason = new org.hl7.fhir.r4.model.CodeableConcept();
		medicationrequestsetsubstitution.setReason(medicationrequestsetsubstitutionsetreason);


		org.hl7.fhir.r4.model.Coding medicationrequestsetsubstitutionsetreasonaddcoding = medicationrequestsetsubstitutionsetreason.addCoding();

		/******************** Medreq_Substitution_Reason_Coding_Code ********************************************************************************/
		if(m.getMedreqSubstitutionReasonCodingCode() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setCode(m.getMedreqSubstitutionReasonCodingCode());
		}
		/******************** Medreq_Substitution_Reason_Coding_Display ********************************************************************************/
		if(m.getMedreqSubstitutionReasonCodingDisplay() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setDisplay(m.getMedreqSubstitutionReasonCodingDisplay());
		}
		/******************** Medreq_Substitution_Reason_Coding_System ********************************************************************************/
		if(m.getMedreqSubstitutionReasonCodingSystem() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setSystem(m.getMedreqSubstitutionReasonCodingSystem());
		}
		/******************** Medreq_Substitution_Reason_Coding_Usrslt ********************************************************************************/
		if(m.getMedreqSubstitutionReasonCodingUsrslt() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setUserSelected(Boolean.parseBoolean(m.getMedreqSubstitutionReasonCodingUsrslt()));
		}
		/******************** Medreq_Substitution_Reason_Coding_Version ********************************************************************************/
		if(m.getMedreqSubstitutionReasonCodingVersion() != null) {
			medicationrequestsetsubstitutionsetreasonaddcoding.setVersion(m.getMedreqSubstitutionReasonCodingVersion());
		}
		/******************** Medreq_Substitution_Reason_Text ********************************************************************************/
		if(m.getMedreqSubstitutionReasonText() != null) {
			medicationrequestsetsubstitutionsetreason.setText(m.getMedreqSubstitutionReasonText());
		}
		/******************** Medreq_SupportingInformation ********************************************************************************/
		if(m.getMedreqSupportingInformation() != null) {
			org.hl7.fhir.r4.model.Reference MedreqSupportingInformationref = new org.hl7.fhir.r4.model.Reference();
			medicationrequest.addSupportingInformation(MedreqSupportingInformationref.setReference(m.getMedreqSupportingInformation()));
		}
		return medicationrequest;
	}
}
