package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Observation;
public class ObservationConversion 
{
	public org.hl7.fhir.r4.model.Observation Observations(Observation o) throws ParseException
	{
		org.hl7.fhir.r4.model.Observation observation = new org.hl7.fhir.r4.model.Observation();

		/******************** id ********************************************************************************/
		observation.setId(o.getId());

		/******************** Obs_BasedOn ********************************************************************************/
		if(o.getObsBasedOn() != null) {
			org.hl7.fhir.r4.model.Reference ObsBasedOnref = new org.hl7.fhir.r4.model.Reference();
			observation.addBasedOn(ObsBasedOnref.setReference(o.getObsBasedOn()));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetbodysite = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setBodySite(observationsetbodysite);


		org.hl7.fhir.r4.model.Coding observationsetbodysiteaddcoding = observationsetbodysite.addCoding();

		/******************** Obs_BodySite_Coding_Code ********************************************************************************/
		if(o.getObsBodySiteCodingCode() != null) {
			observationsetbodysiteaddcoding.setCode(o.getObsBodySiteCodingCode());
		}
		/******************** Obs_BodySite_Coding_Display ********************************************************************************/
		if(o.getObsBodySiteCodingDisplay() != null) {
			observationsetbodysiteaddcoding.setDisplay(o.getObsBodySiteCodingDisplay());
		}
		/******************** Obs_BodySite_Coding_System ********************************************************************************/
		if(o.getObsBodySiteCodingSystem() != null) {
			observationsetbodysiteaddcoding.setSystem(o.getObsBodySiteCodingSystem());
		}
		/******************** Obs_BodySite_Coding_Usrslt ********************************************************************************/
		if(o.getObsBodySiteCodingUsrslt() != null) {
			observationsetbodysiteaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsBodySiteCodingUsrslt()));
		}
		/******************** Obs_BodySite_Coding_Version ********************************************************************************/
		if(o.getObsBodySiteCodingVersion() != null) {
			observationsetbodysiteaddcoding.setVersion(o.getObsBodySiteCodingVersion());
		}
		/******************** Obs_BodySite_Text ********************************************************************************/
		if(o.getObsBodySiteText() != null) {
			observationsetbodysite.setText(o.getObsBodySiteText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcategory = observation.addCategory();


		org.hl7.fhir.r4.model.Coding observationaddcategoryaddcoding = observationaddcategory.addCoding();

		/******************** Obs_Category_Coding_Code ********************************************************************************/
		if(o.getObsCategoryCodingCode() != null) {
			observationaddcategoryaddcoding.setCode(o.getObsCategoryCodingCode());
		}
		/******************** Obs_Category_Coding_Display ********************************************************************************/
		if(o.getObsCategoryCodingDisplay() != null) {
			observationaddcategoryaddcoding.setDisplay(o.getObsCategoryCodingDisplay());
		}
		/******************** Obs_Category_Coding_System ********************************************************************************/
		if(o.getObsCategoryCodingSystem() != null) {
			observationaddcategoryaddcoding.setSystem(o.getObsCategoryCodingSystem());
		}
		/******************** Obs_Category_Coding_Usrslt ********************************************************************************/
		if(o.getObsCategoryCodingUsrslt() != null) {
			observationaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsCategoryCodingUsrslt()));
		}
		/******************** Obs_Category_Coding_Version ********************************************************************************/
		if(o.getObsCategoryCodingVersion() != null) {
			observationaddcategoryaddcoding.setVersion(o.getObsCategoryCodingVersion());
		}
		/******************** Obs_Category_Text ********************************************************************************/
		if(o.getObsCategoryText() != null) {
			observationaddcategory.setText(o.getObsCategoryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setCode(observationsetcode);


		org.hl7.fhir.r4.model.Coding observationsetcodeaddcoding = observationsetcode.addCoding();

		/******************** Obs_Code_Coding_Code ********************************************************************************/
		if(o.getObsCodeCodingCode() != null) {
			observationsetcodeaddcoding.setCode(o.getObsCodeCodingCode());
		}
		/******************** Obs_Code_Coding_Display ********************************************************************************/
		if(o.getObsCodeCodingDisplay() != null) {
			observationsetcodeaddcoding.setDisplay(o.getObsCodeCodingDisplay());
		}
		/******************** Obs_Code_Coding_System ********************************************************************************/
		if(o.getObsCodeCodingSystem() != null) {
			observationsetcodeaddcoding.setSystem(o.getObsCodeCodingSystem());
		}
		/******************** Obs_Code_Coding_Usrslt ********************************************************************************/
		if(o.getObsCodeCodingUsrslt() != null) {
			observationsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsCodeCodingUsrslt()));
		}
		/******************** Obs_Code_Coding_Version ********************************************************************************/
		if(o.getObsCodeCodingVersion() != null) {
			observationsetcodeaddcoding.setVersion(o.getObsCodeCodingVersion());
		}
		/******************** Obs_Code_Text ********************************************************************************/
		if(o.getObsCodeText() != null) {
			observationsetcode.setText(o.getObsCodeText());
		}

		org.hl7.fhir.r4.model.Observation.ObservationComponentComponent observationaddcomponent = observation.addComponent();


		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddcomponent.setCode(observationaddcomponentsetcode);


		org.hl7.fhir.r4.model.Coding observationaddcomponentsetcodeaddcoding = observationaddcomponentsetcode.addCoding();

		/******************** Obs_Component_Code_Coding_Code ********************************************************************************/
		if(o.getObsComponentCodeCodingCode() != null) {
			observationaddcomponentsetcodeaddcoding.setCode(o.getObsComponentCodeCodingCode());
		}
		/******************** Obs_Component_Code_Coding_Display ********************************************************************************/
		if(o.getObsComponentCodeCodingDisplay() != null) {
			observationaddcomponentsetcodeaddcoding.setDisplay(o.getObsComponentCodeCodingDisplay());
		}
		/******************** Obs_Component_Code_Coding_System ********************************************************************************/
		if(o.getObsComponentCodeCodingSystem() != null) {
			observationaddcomponentsetcodeaddcoding.setSystem(o.getObsComponentCodeCodingSystem());
		}
		/******************** Obs_Component_Code_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentCodeCodingUsrslt() != null) {
			observationaddcomponentsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentCodeCodingUsrslt()));
		}
		/******************** Obs_Component_Code_Coding_Version ********************************************************************************/
		if(o.getObsComponentCodeCodingVersion() != null) {
			observationaddcomponentsetcodeaddcoding.setVersion(o.getObsComponentCodeCodingVersion());
		}
		/******************** Obs_Component_Code_Text ********************************************************************************/
		if(o.getObsComponentCodeText() != null) {
			observationaddcomponentsetcode.setText(o.getObsComponentCodeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentsetdataabsentreason = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddcomponent.setDataAbsentReason(observationaddcomponentsetdataabsentreason);


		org.hl7.fhir.r4.model.Coding observationaddcomponentsetdataabsentreasonaddcoding = observationaddcomponentsetdataabsentreason.addCoding();

		/******************** Obs_Component_DataAbsentReason_Coding_Code ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingCode() != null) { 
			observationaddcomponentsetdataabsentreasonaddcoding.setCode(o.getObsComponentDataAbsentReasonCodingCode());
		}
		/******************** Obs_Component_DataAbsentReason_Coding_Display ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingDisplay() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setDisplay(o.getObsComponentDataAbsentReasonCodingDisplay());
		}
		/******************** Obs_Component_DataAbsentReason_Coding_System ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingSystem() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setSystem(o.getObsComponentDataAbsentReasonCodingSystem());
		}
		/******************** Obs_Component_DataAbsentReason_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingUsrslt() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentDataAbsentReasonCodingUsrslt()));
		}
		/******************** Obs_Component_DataAbsentReason_Coding_Version ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonCodingVersion() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setVersion(o.getObsComponentDataAbsentReasonCodingVersion());
		}
		/******************** Obs_Component_DataAbsentReason_Text ********************************************************************************/
		if(o.getObsComponentDataAbsentReasonText() != null) {
			observationaddcomponentsetdataabsentreason.setText(o.getObsComponentDataAbsentReasonText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentaddinterpretation = observationaddcomponent.addInterpretation();


		org.hl7.fhir.r4.model.Coding observationaddcomponentaddinterpretationaddcoding = observationaddcomponentaddinterpretation.addCoding();

		/******************** Obs_Component_Interpretation_Coding_Code ********************************************************************************/
		if(o.getObsComponentInterpretationCodingCode() != null) {
			observationaddcomponentaddinterpretationaddcoding.setCode(o.getObsComponentInterpretationCodingCode());
		}
		/******************** Obs_Component_Interpretation_Coding_Display ********************************************************************************/
		if(o.getObsComponentInterpretationCodingDisplay() != null) {
			observationaddcomponentaddinterpretationaddcoding.setDisplay(o.getObsComponentInterpretationCodingDisplay());
		}
		/******************** Obs_Component_Interpretation_Coding_System ********************************************************************************/
		if(o.getObsComponentInterpretationCodingSystem() != null) {
			observationaddcomponentaddinterpretationaddcoding.setSystem(o.getObsComponentInterpretationCodingSystem());
		}
		/******************** Obs_Component_Interpretation_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentInterpretationCodingUsrslt() != null) {
			observationaddcomponentaddinterpretationaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentInterpretationCodingUsrslt()));
		}
		/******************** Obs_Component_Interpretation_Coding_Version ********************************************************************************/
		if(o.getObsComponentInterpretationCodingVersion() != null) {
			observationaddcomponentaddinterpretationaddcoding.setVersion(o.getObsComponentInterpretationCodingVersion());
		}
		/******************** Obs_Component_Interpretation_Text ********************************************************************************/
		if(o.getObsComponentInterpretationText() != null) {
			observationaddcomponentaddinterpretation.setText(o.getObsComponentInterpretationText());
		}

		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationaddcomponentaddreferencerange = observationaddcomponent.addReferenceRange();


		org.hl7.fhir.r4.model.Range observationaddcomponentaddreferencerangesetage = new org.hl7.fhir.r4.model.Range();
		observationaddcomponentaddreferencerange.setAge(observationaddcomponentaddreferencerangesetage);


		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesetagesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerangesetage.setHigh(observationaddcomponentaddreferencerangesetagesethigh);

		/******************** Obs_Component_ReferenceRange_Age_High_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighCode() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setCode(o.getObsComponentReferenceRangeAgeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesetagesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_ReferenceRange_Age_High_Compartr_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighCompartrCode() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setComparator(observationaddcomponentaddreferencerangesetagesethighsetcomparatorEnumFactory.fromCode(o.getObsComponentReferenceRangeAgeHighCompartrCode()));

		}
		/******************** Obs_Component_ReferenceRange_Age_High_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighSystem() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setSystem(o.getObsComponentReferenceRangeAgeHighSystem());
		}
		/******************** Obs_Component_ReferenceRange_Age_High_Unit ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighUnit() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setUnit(o.getObsComponentReferenceRangeAgeHighUnit());
		}
		/******************** Obs_Component_ReferenceRange_Age_High_Value ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeHighValue() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setValue(Double.parseDouble((o.getObsComponentReferenceRangeAgeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesetagesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerangesetage.setLow(observationaddcomponentaddreferencerangesetagesetlow);

		/******************** Obs_Component_ReferenceRange_Age_Low_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowCode() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setCode(o.getObsComponentReferenceRangeAgeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesetagesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_ReferenceRange_Age_Low_Compartr_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowCompartrCode() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setComparator(observationaddcomponentaddreferencerangesetagesetlowsetcomparatorEnumFactory.fromCode(o.getObsComponentReferenceRangeAgeLowCompartrCode()));

		}
		/******************** Obs_Component_ReferenceRange_Age_Low_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowSystem() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setSystem(o.getObsComponentReferenceRangeAgeLowSystem());
		}
		/******************** Obs_Component_ReferenceRange_Age_Low_Unit ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowUnit() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setUnit(o.getObsComponentReferenceRangeAgeLowUnit());
		}
		/******************** Obs_Component_ReferenceRange_Age_Low_Value ********************************************************************************/
		if(o.getObsComponentReferenceRangeAgeLowValue() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setValue(Double.parseDouble((o.getObsComponentReferenceRangeAgeLowValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentaddreferencerangeaddappliesto = observationaddcomponentaddreferencerange.addAppliesTo();


		org.hl7.fhir.r4.model.Coding observationaddcomponentaddreferencerangeaddappliestoaddcoding = observationaddcomponentaddreferencerangeaddappliesto.addCoding();

		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingCode() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setCode(o.getObsComponentReferenceRangeAppliesToCodingCode());
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_Display ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingDisplay() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setDisplay(o.getObsComponentReferenceRangeAppliesToCodingDisplay());
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingSystem() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setSystem(o.getObsComponentReferenceRangeAppliesToCodingSystem());
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingUsrslt() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentReferenceRangeAppliesToCodingUsrslt()));
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Coding_Version ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToCodingVersion() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setVersion(o.getObsComponentReferenceRangeAppliesToCodingVersion());
		}
		/******************** Obs_Component_ReferenceRange_AppliesTo_Text ********************************************************************************/
		if(o.getObsComponentReferenceRangeAppliesToText() != null) {
			observationaddcomponentaddreferencerangeaddappliesto.setText(o.getObsComponentReferenceRangeAppliesToText());
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerange.setHigh(observationaddcomponentaddreferencerangesethigh);

		/******************** Obs_Component_ReferenceRange_High_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighCode() != null) {
			observationaddcomponentaddreferencerangesethigh.setCode(o.getObsComponentReferenceRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_ReferenceRange_High_Compartr_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighCompartrCode() != null) {
			observationaddcomponentaddreferencerangesethigh.setComparator(observationaddcomponentaddreferencerangesethighsetcomparatorEnumFactory.fromCode(o.getObsComponentReferenceRangeHighCompartrCode()));

		}
		/******************** Obs_Component_ReferenceRange_High_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighSystem() != null) {
			observationaddcomponentaddreferencerangesethigh.setSystem(o.getObsComponentReferenceRangeHighSystem());
		}
		/******************** Obs_Component_ReferenceRange_High_Unit ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighUnit() != null) {
			observationaddcomponentaddreferencerangesethigh.setUnit(o.getObsComponentReferenceRangeHighUnit());
		}
		/******************** Obs_Component_ReferenceRange_High_Value ********************************************************************************/
		if(o.getObsComponentReferenceRangeHighValue() != null) {
			observationaddcomponentaddreferencerangesethigh.setValue(Double.parseDouble((o.getObsComponentReferenceRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerange.setLow(observationaddcomponentaddreferencerangesetlow);

		/******************** Obs_Component_ReferenceRange_Low_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowCode() != null) {
			observationaddcomponentaddreferencerangesetlow.setCode(o.getObsComponentReferenceRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_ReferenceRange_Low_Compartr_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowCompartrCode() != null) {
			observationaddcomponentaddreferencerangesetlow.setComparator(observationaddcomponentaddreferencerangesetlowsetcomparatorEnumFactory.fromCode(o.getObsComponentReferenceRangeLowCompartrCode()));

		}
		/******************** Obs_Component_ReferenceRange_Low_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowSystem() != null) {
			observationaddcomponentaddreferencerangesetlow.setSystem(o.getObsComponentReferenceRangeLowSystem());
		}
		/******************** Obs_Component_ReferenceRange_Low_Unit ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowUnit() != null) {
			observationaddcomponentaddreferencerangesetlow.setUnit(o.getObsComponentReferenceRangeLowUnit());
		}
		/******************** Obs_Component_ReferenceRange_Low_Value ********************************************************************************/
		if(o.getObsComponentReferenceRangeLowValue() != null) {
			observationaddcomponentaddreferencerangesetlow.setValue(Double.parseDouble((o.getObsComponentReferenceRangeLowValue())));
		}
		/******************** Obs_Component_ReferenceRange_Text ********************************************************************************/
		if(o.getObsComponentReferenceRangeText() != null) {
			observationaddcomponentaddreferencerange.setText(o.getObsComponentReferenceRangeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentaddreferencerangesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddcomponentaddreferencerange.setType(observationaddcomponentaddreferencerangesettype);


		org.hl7.fhir.r4.model.Coding observationaddcomponentaddreferencerangesettypeaddcoding = observationaddcomponentaddreferencerangesettype.addCoding();

		/******************** Obs_Component_ReferenceRange_Type_Coding_Code ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingCode() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setCode(o.getObsComponentReferenceRangeTypeCodingCode());
		}
		/******************** Obs_Component_ReferenceRange_Type_Coding_Display ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingDisplay() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setDisplay(o.getObsComponentReferenceRangeTypeCodingDisplay());
		}
		/******************** Obs_Component_ReferenceRange_Type_Coding_System ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingSystem() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setSystem(o.getObsComponentReferenceRangeTypeCodingSystem());
		}
		/******************** Obs_Component_ReferenceRange_Type_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingUsrslt() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentReferenceRangeTypeCodingUsrslt()));
		}
		/******************** Obs_Component_ReferenceRange_Type_Coding_Version ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeCodingVersion() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setVersion(o.getObsComponentReferenceRangeTypeCodingVersion());
		}
		/******************** Obs_Component_ReferenceRange_Type_Text ********************************************************************************/
		if(o.getObsComponentReferenceRangeTypeText() != null) {
			observationaddcomponentaddreferencerangesettype.setText(o.getObsComponentReferenceRangeTypeText());
		}
		/******************** Observation_Component_ValueBoolean ********************************************************************************/
		if(o.getObservationComponentValueBoolean() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.BooleanType(o.getObservationComponentValueBoolean()));
		}

		if( o.getObsComponentValueCodeableConceptCodingCode() != null || o.getObsComponentValueCodeableConceptCodingDisplay() != null || o.getObsComponentValueCodeableConceptCodingSystem() != null || o.getObsComponentValueCodeableConceptCodingUsrslt() != null || o.getObsComponentValueCodeableConceptCodingVersion() != null || o.getObsComponentValueCodeableConceptText() != null ) {
			org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentsetvalueCodeableConcept = new org.hl7.fhir.r4.model.CodeableConcept();
			observationaddcomponent.setValue(observationaddcomponentsetvalueCodeableConcept);


		org.hl7.fhir.r4.model.Coding observationaddcomponentsetvalueCodeableConceptaddcoding = observationaddcomponentsetvalueCodeableConcept.addCoding();

		/******************** Obs_Component_Value_CodeableConcept_Coding_Code ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingCode() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setCode(o.getObsComponentValueCodeableConceptCodingCode());
		}
		/******************** Obs_Component_Value_CodeableConcept_Coding_Display ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingDisplay() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setDisplay(o.getObsComponentValueCodeableConceptCodingDisplay());
		}
		/******************** Obs_Component_Value_CodeableConcept_Coding_System ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingSystem() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setSystem(o.getObsComponentValueCodeableConceptCodingSystem());
		}
		/******************** Obs_Component_Value_CodeableConcept_Coding_Usrslt ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingUsrslt() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsComponentValueCodeableConceptCodingUsrslt()));
		}
		/******************** Obs_Component_Value_CodeableConcept_Coding_Version ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptCodingVersion() != null) {
			observationaddcomponentsetvalueCodeableConceptaddcoding.setVersion(o.getObsComponentValueCodeableConceptCodingVersion());
		}
		/******************** Obs_Component_Value_CodeableConcept_Text ********************************************************************************/
		if(o.getObsComponentValueCodeableConceptText() != null) {
			observationaddcomponentsetvalueCodeableConcept.setText(o.getObsComponentValueCodeableConceptText());
		}
		}
		/******************** Observation_Component_ValueDateTime ********************************************************************************/
		if(o.getObservationComponentValueDateTime() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.DateTimeType(o.getObservationComponentValueDateTime()));
		}
		/******************** Observation_Component_ValueInteger ********************************************************************************/
		if(o.getObservationComponentValueInteger() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.IntegerType(o.getObservationComponentValueInteger()));
		}

		if( o.getObsComponentValuePeriodEnd() != null || o.getObsComponentValuePeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period observationaddcomponentsetvaluePeriod = new org.hl7.fhir.r4.model.Period();
			observationaddcomponent.setValue(observationaddcomponentsetvaluePeriod);

		/******************** Obs_Component_Value_Period_End ********************************************************************************/
		if(o.getObsComponentValuePeriodEnd() != null) {
			java.text.SimpleDateFormat ObsComponentValuePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsComponentValuePeriodEnddate = ObsComponentValuePeriodEndsdf.parse(o.getObsComponentValuePeriodEnd());
			observationaddcomponentsetvaluePeriod.setEnd(ObsComponentValuePeriodEnddate);
		}
		/******************** Obs_Component_Value_Period_Start ********************************************************************************/
		if(o.getObsComponentValuePeriodStart() != null) {
			java.text.SimpleDateFormat ObsComponentValuePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsComponentValuePeriodStartdate = ObsComponentValuePeriodStartsdf.parse(o.getObsComponentValuePeriodStart());
			observationaddcomponentsetvaluePeriod.setStart(ObsComponentValuePeriodStartdate);
		}
		}

		if( o.getObsComponentValueQuantityCode() != null || o.getObsComponentValueQuantityCompartrCode() != null || o.getObsComponentValueQuantitySystem() != null || o.getObsComponentValueQuantityUnit() != null || o.getObsComponentValueQuantityValue() != null ) {
			org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueQuantity = new org.hl7.fhir.r4.model.Quantity();
			observationaddcomponent.setValue(observationaddcomponentsetvalueQuantity);

		/******************** Obs_Component_Value_Quantity_Code ********************************************************************************/
		if(o.getObsComponentValueQuantityCode() != null) {
			observationaddcomponentsetvalueQuantity.setCode(o.getObsComponentValueQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueQuantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Quantity_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueQuantityCompartrCode() != null) {
			observationaddcomponentsetvalueQuantity.setComparator(observationaddcomponentsetvalueQuantitysetcomparatorEnumFactory.fromCode(o.getObsComponentValueQuantityCompartrCode()));

		}
		/******************** Obs_Component_Value_Quantity_System ********************************************************************************/
		if(o.getObsComponentValueQuantitySystem() != null) {
			observationaddcomponentsetvalueQuantity.setSystem(o.getObsComponentValueQuantitySystem());
		}
		/******************** Obs_Component_Value_Quantity_Unit ********************************************************************************/
		if(o.getObsComponentValueQuantityUnit() != null) {
			observationaddcomponentsetvalueQuantity.setUnit(o.getObsComponentValueQuantityUnit());
		}
		/******************** Obs_Component_Value_Quantity_Value ********************************************************************************/
		if(o.getObsComponentValueQuantityValue() != null) {
			observationaddcomponentsetvalueQuantity.setValue(Double.parseDouble((o.getObsComponentValueQuantityValue())));
		}
		}

		if( o.getObsComponentValueRangeHighCode() != null || o.getObsComponentValueRangeHighCompartrCode() != null || o.getObsComponentValueRangeHighSystem() != null || o.getObsComponentValueRangeHighUnit() != null || o.getObsComponentValueRangeHighValue() != null || o.getObsComponentValueRangeLowCode() != null || o.getObsComponentValueRangeLowCompartrCode() != null || o.getObsComponentValueRangeLowSystem() != null || o.getObsComponentValueRangeLowUnit() != null || o.getObsComponentValueRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range observationaddcomponentsetvalueRange = new org.hl7.fhir.r4.model.Range();
			observationaddcomponent.setValue(observationaddcomponentsetvalueRange);


		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueRange.setHigh(observationaddcomponentsetvalueRangesethigh);

		/******************** Obs_Component_Value_Range_High_Code ********************************************************************************/
		if(o.getObsComponentValueRangeHighCode() != null) {
			observationaddcomponentsetvalueRangesethigh.setCode(o.getObsComponentValueRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Range_High_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueRangeHighCompartrCode() != null) {
			observationaddcomponentsetvalueRangesethigh.setComparator(observationaddcomponentsetvalueRangesethighsetcomparatorEnumFactory.fromCode(o.getObsComponentValueRangeHighCompartrCode()));

		}
		/******************** Obs_Component_Value_Range_High_System ********************************************************************************/
		if(o.getObsComponentValueRangeHighSystem() != null) {
			observationaddcomponentsetvalueRangesethigh.setSystem(o.getObsComponentValueRangeHighSystem());
		}
		/******************** Obs_Component_Value_Range_High_Unit ********************************************************************************/
		if(o.getObsComponentValueRangeHighUnit() != null) {
			observationaddcomponentsetvalueRangesethigh.setUnit(o.getObsComponentValueRangeHighUnit());
		}
		/******************** Obs_Component_Value_Range_High_Value ********************************************************************************/
		if(o.getObsComponentValueRangeHighValue() != null) {
			observationaddcomponentsetvalueRangesethigh.setValue(Double.parseDouble((o.getObsComponentValueRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueRange.setLow(observationaddcomponentsetvalueRangesetlow);

		/******************** Obs_Component_Value_Range_Low_Code ********************************************************************************/
		if(o.getObsComponentValueRangeLowCode() != null) {
			observationaddcomponentsetvalueRangesetlow.setCode(o.getObsComponentValueRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Range_Low_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueRangeLowCompartrCode() != null) {
			observationaddcomponentsetvalueRangesetlow.setComparator(observationaddcomponentsetvalueRangesetlowsetcomparatorEnumFactory.fromCode(o.getObsComponentValueRangeLowCompartrCode()));

		}
		/******************** Obs_Component_Value_Range_Low_System ********************************************************************************/
		if(o.getObsComponentValueRangeLowSystem() != null) {
			observationaddcomponentsetvalueRangesetlow.setSystem(o.getObsComponentValueRangeLowSystem());
		}
		/******************** Obs_Component_Value_Range_Low_Unit ********************************************************************************/
		if(o.getObsComponentValueRangeLowUnit() != null) {
			observationaddcomponentsetvalueRangesetlow.setUnit(o.getObsComponentValueRangeLowUnit());
		}
		/******************** Obs_Component_Value_Range_Low_Value ********************************************************************************/
		if(o.getObsComponentValueRangeLowValue() != null) {
			observationaddcomponentsetvalueRangesetlow.setValue(Double.parseDouble((o.getObsComponentValueRangeLowValue())));
		}
		}

		if( o.getObsComponentValueRatioDenomCode() != null || o.getObsComponentValueRatioDenomCompartrCode() != null || o.getObsComponentValueRatioDenomSystem() != null || o.getObsComponentValueRatioDenomUnit() != null || o.getObsComponentValueRatioDenomValue() != null || o.getObsComponentValueRatioNumeratorCode() != null || o.getObsComponentValueRatioNumeratorCompartrCode() != null || o.getObsComponentValueRatioNumeratorSystem() != null || o.getObsComponentValueRatioNumeratorUnit() != null || o.getObsComponentValueRatioNumeratorValue() != null ) {
			org.hl7.fhir.r4.model.Ratio observationaddcomponentsetvalueRatio = new org.hl7.fhir.r4.model.Ratio();
			observationaddcomponent.setValue(observationaddcomponentsetvalueRatio);


		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueRatiosetdenominator = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueRatio.setDenominator(observationaddcomponentsetvalueRatiosetdenominator);

		/******************** Obs_Component_Value_Ratio_Denom_Code ********************************************************************************/
		if(o.getObsComponentValueRatioDenomCode() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setCode(o.getObsComponentValueRatioDenomCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueRatiosetdenominatorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Ratio_Denom_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueRatioDenomCompartrCode() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setComparator(observationaddcomponentsetvalueRatiosetdenominatorsetcomparatorEnumFactory.fromCode(o.getObsComponentValueRatioDenomCompartrCode()));

		}
		/******************** Obs_Component_Value_Ratio_Denom_System ********************************************************************************/
		if(o.getObsComponentValueRatioDenomSystem() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setSystem(o.getObsComponentValueRatioDenomSystem());
		}
		/******************** Obs_Component_Value_Ratio_Denom_Unit ********************************************************************************/
		if(o.getObsComponentValueRatioDenomUnit() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setUnit(o.getObsComponentValueRatioDenomUnit());
		}
		/******************** Obs_Component_Value_Ratio_Denom_Value ********************************************************************************/
		if(o.getObsComponentValueRatioDenomValue() != null) {
			observationaddcomponentsetvalueRatiosetdenominator.setValue(Double.parseDouble((o.getObsComponentValueRatioDenomValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueRatiosetnumerator = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueRatio.setNumerator(observationaddcomponentsetvalueRatiosetnumerator);

		/******************** Obs_Component_Value_Ratio_Numerator_Code ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorCode() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setCode(o.getObsComponentValueRatioNumeratorCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueRatiosetnumeratorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_Ratio_Numerator_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorCompartrCode() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setComparator(observationaddcomponentsetvalueRatiosetnumeratorsetcomparatorEnumFactory.fromCode(o.getObsComponentValueRatioNumeratorCompartrCode()));

		}
		/******************** Obs_Component_Value_Ratio_Numerator_System ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorSystem() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setSystem(o.getObsComponentValueRatioNumeratorSystem());
		}
		/******************** Obs_Component_Value_Ratio_Numerator_Unit ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorUnit() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setUnit(o.getObsComponentValueRatioNumeratorUnit());
		}
		/******************** Obs_Component_Value_Ratio_Numerator_Value ********************************************************************************/
		if(o.getObsComponentValueRatioNumeratorValue() != null) {
			observationaddcomponentsetvalueRatiosetnumerator.setValue(Double.parseDouble((o.getObsComponentValueRatioNumeratorValue())));
		}
		}

		if( o.getObsComponentValueSampledDataData() != null || o.getObsComponentValueSampledDataDimensions() != null || o.getObsComponentValueSampledDataFactor() != null || o.getObsComponentValueSampledDataLowerLimit() != null || o.getObsComponentValueSampledDataOriginCode() != null || o.getObsComponentValueSampledDataOriginCompartrCode() != null || o.getObsComponentValueSampledDataOriginSystem() != null || o.getObsComponentValueSampledDataOriginUnit() != null || o.getObsComponentValueSampledDataOriginValue() != null || o.getObsComponentValueSampledDataPeriod() != null || o.getObsComponentValueSampledDataUpperLimit() != null ) {
			org.hl7.fhir.r4.model.SampledData observationaddcomponentsetvalueSampledData = new org.hl7.fhir.r4.model.SampledData();
			observationaddcomponent.setValue(observationaddcomponentsetvalueSampledData);

		/******************** Obs_Component_Value_SampledData_Data ********************************************************************************/
		if(o.getObsComponentValueSampledDataData() != null) {
			observationaddcomponentsetvalueSampledData.setData(o.getObsComponentValueSampledDataData());
		}
		/******************** Obs_Component_Value_SampledData_Dimensions ********************************************************************************/
		if(o.getObsComponentValueSampledDataDimensions() != null) {
			observationaddcomponentsetvalueSampledData.setDimensions(Integer.parseInt(o.getObsComponentValueSampledDataDimensions()));
		}
		/******************** Obs_Component_Value_SampledData_Factor ********************************************************************************/
		if(o.getObsComponentValueSampledDataFactor() != null) {
			observationaddcomponentsetvalueSampledData.setFactor(Double.parseDouble((o.getObsComponentValueSampledDataFactor())));
		}
		/******************** Obs_Component_Value_SampledData_LowerLimit ********************************************************************************/
		if(o.getObsComponentValueSampledDataLowerLimit() != null) {
			observationaddcomponentsetvalueSampledData.setLowerLimit(Double.parseDouble((o.getObsComponentValueSampledDataLowerLimit())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentsetvalueSampledDatasetorigin = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentsetvalueSampledData.setOrigin(observationaddcomponentsetvalueSampledDatasetorigin);

		/******************** Obs_Component_Value_SampledData_Origin_Code ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginCode() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setCode(o.getObsComponentValueSampledDataOriginCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentsetvalueSampledDatasetoriginsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Component_Value_SampledData_Origin_Compartr_Code ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginCompartrCode() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setComparator(observationaddcomponentsetvalueSampledDatasetoriginsetcomparatorEnumFactory.fromCode(o.getObsComponentValueSampledDataOriginCompartrCode()));

		}
		/******************** Obs_Component_Value_SampledData_Origin_System ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginSystem() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setSystem(o.getObsComponentValueSampledDataOriginSystem());
		}
		/******************** Obs_Component_Value_SampledData_Origin_Unit ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginUnit() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setUnit(o.getObsComponentValueSampledDataOriginUnit());
		}
		/******************** Obs_Component_Value_SampledData_Origin_Value ********************************************************************************/
		if(o.getObsComponentValueSampledDataOriginValue() != null) {
			observationaddcomponentsetvalueSampledDatasetorigin.setValue(Double.parseDouble((o.getObsComponentValueSampledDataOriginValue())));
		}
		/******************** Obs_Component_Value_SampledData_Period ********************************************************************************/
		if(o.getObsComponentValueSampledDataPeriod() != null) {
			observationaddcomponentsetvalueSampledData.setPeriod(Double.parseDouble((o.getObsComponentValueSampledDataPeriod())));
		}
		/******************** Obs_Component_Value_SampledData_UpperLimit ********************************************************************************/
		if(o.getObsComponentValueSampledDataUpperLimit() != null) {
			observationaddcomponentsetvalueSampledData.setUpperLimit(Double.parseDouble((o.getObsComponentValueSampledDataUpperLimit())));
		}
		}
		/******************** Observation_Component_ValueString ********************************************************************************/
		if(o.getObservationComponentValueString() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.StringType(o.getObservationComponentValueString()));
		}
		/******************** Observation_Component_ValueTime ********************************************************************************/
		if(o.getObservationComponentValueTime() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.TimeType(o.getObservationComponentValueTime()));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetdataabsentreason = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setDataAbsentReason(observationsetdataabsentreason);


		org.hl7.fhir.r4.model.Coding observationsetdataabsentreasonaddcoding = observationsetdataabsentreason.addCoding();

		/******************** Obs_DataAbsentReason_Coding_Code ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingCode() != null) {
			observationsetdataabsentreasonaddcoding.setCode(o.getObsDataAbsentReasonCodingCode());
		}
		/******************** Obs_DataAbsentReason_Coding_Display ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingDisplay() != null) {
			observationsetdataabsentreasonaddcoding.setDisplay(o.getObsDataAbsentReasonCodingDisplay());
		}
		/******************** Obs_DataAbsentReason_Coding_System ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingSystem() != null) {
			observationsetdataabsentreasonaddcoding.setSystem(o.getObsDataAbsentReasonCodingSystem());
		}
		/******************** Obs_DataAbsentReason_Coding_Usrslt ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingUsrslt() != null) {
			observationsetdataabsentreasonaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsDataAbsentReasonCodingUsrslt()));
		}
		/******************** Obs_DataAbsentReason_Coding_Version ********************************************************************************/
		if(o.getObsDataAbsentReasonCodingVersion() != null) {
			observationsetdataabsentreasonaddcoding.setVersion(o.getObsDataAbsentReasonCodingVersion());
		}
		/******************** Obs_DataAbsentReason_Text ********************************************************************************/
		if(o.getObsDataAbsentReasonText() != null) {
			observationsetdataabsentreason.setText(o.getObsDataAbsentReasonText());
		}
		/******************** Obs_DerivedFrom ********************************************************************************/
		if(o.getObsDerivedFrom() != null) {
			org.hl7.fhir.r4.model.Reference ObsDerivedFromref = new org.hl7.fhir.r4.model.Reference();
			observation.addDerivedFrom(ObsDerivedFromref.setReference(o.getObsDerivedFrom()));
		}
		/******************** Obs_Device ********************************************************************************/
		if(o.getObsDevice() != null) {
			org.hl7.fhir.r4.model.Reference ObsDeviceref = new org.hl7.fhir.r4.model.Reference();
			observation.setDevice(ObsDeviceref.setReference(o.getObsDevice()));
		}
		/******************** Observation_EffectiveDateTime ********************************************************************************/
		if(o.getObservationEffectiveDateTime() != null) {
			observation.setEffective(new org.hl7.fhir.r4.model.DateTimeType(o.getObservationEffectiveDateTime()));
		}
		/******************** Observation_EffectiveInstant ********************************************************************************/
		if(o.getObservationEffectiveInstant() != null) {
			observation.setEffective(new org.hl7.fhir.r4.model.InstantType(o.getObservationEffectiveInstant()));
		}

		if( o.getObsEffectivePeriodEnd() != null || o.getObsEffectivePeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period observationseteffectivePeriod = new org.hl7.fhir.r4.model.Period();
			observation.setEffective(observationseteffectivePeriod);

		/******************** Obs_Effective_Period_End ********************************************************************************/
		if(o.getObsEffectivePeriodEnd() != null) {
			java.text.SimpleDateFormat ObsEffectivePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectivePeriodEnddate = ObsEffectivePeriodEndsdf.parse(o.getObsEffectivePeriodEnd());
			observationseteffectivePeriod.setEnd(ObsEffectivePeriodEnddate);
		}
		/******************** Obs_Effective_Period_Start ********************************************************************************/
		if(o.getObsEffectivePeriodStart() != null) {
			java.text.SimpleDateFormat ObsEffectivePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectivePeriodStartdate = ObsEffectivePeriodStartsdf.parse(o.getObsEffectivePeriodStart());
			observationseteffectivePeriod.setStart(ObsEffectivePeriodStartdate);
		}
		}

		if( o.getObsEffectiveTimingCodeCodingCode() != null || o.getObsEffectiveTimingCodeCodingDisplay() != null || o.getObsEffectiveTimingCodeCodingSystem() != null || o.getObsEffectiveTimingCodeCodingUsrslt() != null || o.getObsEffectiveTimingCodeCodingVersion() != null || o.getObsEffectiveTimingCodeText() != null || o.getObsEffectiveTimingEvent() != null || o.getObsEffectiveTimingRepeatBoundsDurationCode() != null || o.getObsEffectiveTimingRepeatBoundsDurationCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsDurationSystem() != null || o.getObsEffectiveTimingRepeatBoundsDurationUnit() != null || o.getObsEffectiveTimingRepeatBoundsDurationValue() != null || o.getObsEffectiveTimingRepeatBoundsPeriodEnd() != null || o.getObsEffectiveTimingRepeatBoundsPeriodStart() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighSystem() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighUnit() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighValue() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowSystem() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowUnit() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowValue() != null || o.getObsEffectiveTimingRepeatCount() != null || o.getObsEffectiveTimingRepeatCountMax() != null || o.getObsEffectiveTimingRepeatDayOfWeekCode() != null || o.getObsEffectiveTimingRepeatDuration() != null || o.getObsEffectiveTimingRepeatDurationMax() != null || o.getObsEffectiveTimingRepeatDurationUnitCode() != null || o.getObsEffectiveTimingRepeatFrequency() != null || o.getObsEffectiveTimingRepeatFrequencyMax() != null || o.getObsEffectiveTimingRepeatOff() != null || o.getObsEffectiveTimingRepeatPeriod() != null || o.getObsEffectiveTimingRepeatPeriodMax() != null || o.getObsEffectiveTimingRepeatPeriodUnitCode() != null || o.getObsEffectiveTimingRepeatTimeOfDay() != null || o.getObsEffectiveTimingRepeatWhenCode() != null ) {
			org.hl7.fhir.r4.model.Timing observationseteffectiveTiming = new org.hl7.fhir.r4.model.Timing();
			observation.setEffective(observationseteffectiveTiming);


		org.hl7.fhir.r4.model.CodeableConcept observationseteffectiveTimingsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		observationseteffectiveTiming.setCode(observationseteffectiveTimingsetcode);


		org.hl7.fhir.r4.model.Coding observationseteffectiveTimingsetcodeaddcoding = observationseteffectiveTimingsetcode.addCoding();

		/******************** Obs_Effective_Timing_Code_Coding_Code ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingCode() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setCode(o.getObsEffectiveTimingCodeCodingCode());
		}
		/******************** Obs_Effective_Timing_Code_Coding_Display ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingDisplay() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setDisplay(o.getObsEffectiveTimingCodeCodingDisplay());
		}
		/******************** Obs_Effective_Timing_Code_Coding_System ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingSystem() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setSystem(o.getObsEffectiveTimingCodeCodingSystem());
		}
		/******************** Obs_Effective_Timing_Code_Coding_Usrslt ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingUsrslt() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsEffectiveTimingCodeCodingUsrslt()));
		}
		/******************** Obs_Effective_Timing_Code_Coding_Version ********************************************************************************/
		if(o.getObsEffectiveTimingCodeCodingVersion() != null) {
			observationseteffectiveTimingsetcodeaddcoding.setVersion(o.getObsEffectiveTimingCodeCodingVersion());
		}
		/******************** Obs_Effective_Timing_Code_Text ********************************************************************************/
		if(o.getObsEffectiveTimingCodeText() != null) {
			observationseteffectiveTimingsetcode.setText(o.getObsEffectiveTimingCodeText());
		}
		/******************** Obs_Effective_Timing_Event ********************************************************************************/
		if(o.getObsEffectiveTimingEvent() != null) {
			java.text.SimpleDateFormat ObsEffectiveTimingEventsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectiveTimingEventdate = ObsEffectiveTimingEventsdf.parse(o.getObsEffectiveTimingEvent());
			observationseteffectiveTiming.addEvent(ObsEffectiveTimingEventdate);
		}

		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent observationseteffectiveTimingsetrepeat = new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		observationseteffectiveTiming.setRepeat(observationseteffectiveTimingsetrepeat);


		if( o.getObsEffectiveTimingRepeatBoundsDurationCode() != null || o.getObsEffectiveTimingRepeatBoundsDurationCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsDurationSystem() != null || o.getObsEffectiveTimingRepeatBoundsDurationUnit() != null || o.getObsEffectiveTimingRepeatBoundsDurationValue() != null ) {
			org.hl7.fhir.r4.model.Duration observationseteffectiveTimingsetrepeatsetboundsDuration = new org.hl7.fhir.r4.model.Duration();
			observationseteffectiveTimingsetrepeat.setBounds(observationseteffectiveTimingsetrepeatsetboundsDuration);

		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setCode(o.getObsEffectiveTimingRepeatBoundsDurationCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationseteffectiveTimingsetrepeatsetboundsDurationsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_Compartr_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationCompartrCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setComparator(observationseteffectiveTimingsetrepeatsetboundsDurationsetcomparatorEnumFactory.fromCode(o.getObsEffectiveTimingRepeatBoundsDurationCompartrCode()));

		} 
		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_System ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationSystem() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setSystem(o.getObsEffectiveTimingRepeatBoundsDurationSystem());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_Unit ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationUnit() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setUnit(o.getObsEffectiveTimingRepeatBoundsDurationUnit());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Duration_Value ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsDurationValue() != null) {
			observationseteffectiveTimingsetrepeatsetboundsDuration.setValue(Double.parseDouble((o.getObsEffectiveTimingRepeatBoundsDurationValue())));
		}
		}

		if( o.getObsEffectiveTimingRepeatBoundsPeriodEnd() != null || o.getObsEffectiveTimingRepeatBoundsPeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period observationseteffectiveTimingsetrepeatsetboundsPeriod = new org.hl7.fhir.r4.model.Period();
			observationseteffectiveTimingsetrepeat.setBounds(observationseteffectiveTimingsetrepeatsetboundsPeriod);

		/******************** Obs_Effective_Timing_Repeat_Bounds_Period_End ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsPeriodEnd() != null) {
			java.text.SimpleDateFormat ObsEffectiveTimingRepeatBoundsPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectiveTimingRepeatBoundsPeriodEnddate = ObsEffectiveTimingRepeatBoundsPeriodEndsdf.parse(o.getObsEffectiveTimingRepeatBoundsPeriodEnd());
			observationseteffectiveTimingsetrepeatsetboundsPeriod.setEnd(ObsEffectiveTimingRepeatBoundsPeriodEnddate);
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Period_Start ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsPeriodStart() != null) {
			java.text.SimpleDateFormat ObsEffectiveTimingRepeatBoundsPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsEffectiveTimingRepeatBoundsPeriodStartdate = ObsEffectiveTimingRepeatBoundsPeriodStartsdf.parse(o.getObsEffectiveTimingRepeatBoundsPeriodStart());
			observationseteffectiveTimingsetrepeatsetboundsPeriod.setStart(ObsEffectiveTimingRepeatBoundsPeriodStartdate);
		}
		}

		if( o.getObsEffectiveTimingRepeatBoundsRangeHighCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighSystem() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighUnit() != null || o.getObsEffectiveTimingRepeatBoundsRangeHighValue() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowCompartrCode() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowSystem() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowUnit() != null || o.getObsEffectiveTimingRepeatBoundsRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range observationseteffectiveTimingsetrepeatsetboundsRange = new org.hl7.fhir.r4.model.Range();
			observationseteffectiveTimingsetrepeat.setBounds(observationseteffectiveTimingsetrepeatsetboundsRange);


		org.hl7.fhir.r4.model.Quantity observationseteffectiveTimingsetrepeatsetboundsRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationseteffectiveTimingsetrepeatsetboundsRange.setHigh(observationseteffectiveTimingsetrepeatsetboundsRangesethigh);

		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setCode(o.getObsEffectiveTimingRepeatBoundsRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationseteffectiveTimingsetrepeatsetboundsRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_Compartr_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighCompartrCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setComparator(observationseteffectiveTimingsetrepeatsetboundsRangesethighsetcomparatorEnumFactory.fromCode(o.getObsEffectiveTimingRepeatBoundsRangeHighCompartrCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_System ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighSystem() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setSystem(o.getObsEffectiveTimingRepeatBoundsRangeHighSystem());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_Unit ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighUnit() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setUnit(o.getObsEffectiveTimingRepeatBoundsRangeHighUnit());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_High_Value ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeHighValue() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesethigh.setValue(Double.parseDouble((o.getObsEffectiveTimingRepeatBoundsRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationseteffectiveTimingsetrepeatsetboundsRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationseteffectiveTimingsetrepeatsetboundsRange.setLow(observationseteffectiveTimingsetrepeatsetboundsRangesetlow);

		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setCode(o.getObsEffectiveTimingRepeatBoundsRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationseteffectiveTimingsetrepeatsetboundsRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_Compartr_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowCompartrCode() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setComparator(observationseteffectiveTimingsetrepeatsetboundsRangesetlowsetcomparatorEnumFactory.fromCode(o.getObsEffectiveTimingRepeatBoundsRangeLowCompartrCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_System ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowSystem() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setSystem(o.getObsEffectiveTimingRepeatBoundsRangeLowSystem());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_Unit ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowUnit() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setUnit(o.getObsEffectiveTimingRepeatBoundsRangeLowUnit());
		}
		/******************** Obs_Effective_Timing_Repeat_Bounds_Range_Low_Value ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatBoundsRangeLowValue() != null) {
			observationseteffectiveTimingsetrepeatsetboundsRangesetlow.setValue(Double.parseDouble((o.getObsEffectiveTimingRepeatBoundsRangeLowValue())));
		}
		}
		/******************** Obs_Effective_Timing_Repeat_Count ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatCount() != null) {
			observationseteffectiveTimingsetrepeat.setCount(Integer.parseInt(o.getObsEffectiveTimingRepeatCount()));
		}
		/******************** Obs_Effective_Timing_Repeat_CountMax ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatCountMax() != null) {
			observationseteffectiveTimingsetrepeat.setCountMax(Integer.parseInt(o.getObsEffectiveTimingRepeatCountMax()));
		}

		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory observationseteffectiveTimingsetrepeatadddayofweekEnumFactory = new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_DayOfWeek_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatDayOfWeekCode() != null) {
			observationseteffectiveTimingsetrepeat.addDayOfWeek(observationseteffectiveTimingsetrepeatadddayofweekEnumFactory.fromCode(o.getObsEffectiveTimingRepeatDayOfWeekCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_Duration ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatDuration() != null) {
			observationseteffectiveTimingsetrepeat.setDuration(Double.parseDouble((o.getObsEffectiveTimingRepeatDuration())));
		}
		/******************** Obs_Effective_Timing_Repeat_DurationMax ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatDurationMax() != null) {
			observationseteffectiveTimingsetrepeat.setDurationMax(Double.parseDouble((o.getObsEffectiveTimingRepeatDurationMax())));
		}

		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory observationseteffectiveTimingsetrepeatsetdurationunitEnumFactory = new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_DurationUnit_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatDurationUnitCode() != null) {
			observationseteffectiveTimingsetrepeat.setDurationUnit(observationseteffectiveTimingsetrepeatsetdurationunitEnumFactory.fromCode(o.getObsEffectiveTimingRepeatDurationUnitCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_Frequency ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatFrequency() != null) {
			observationseteffectiveTimingsetrepeat.setFrequency(Integer.parseInt(o.getObsEffectiveTimingRepeatFrequency()));
		}
		/******************** Obs_Effective_Timing_Repeat_FrequencyMax ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatFrequencyMax() != null) {
			observationseteffectiveTimingsetrepeat.setFrequencyMax(Integer.parseInt(o.getObsEffectiveTimingRepeatFrequencyMax()));
		}
		/******************** Obs_Effective_Timing_Repeat_Off ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatOff() != null) {
			observationseteffectiveTimingsetrepeat.setOffset(Integer.parseInt(o.getObsEffectiveTimingRepeatOff()));
		}
		/******************** Obs_Effective_Timing_Repeat_Period ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatPeriod() != null) {
			observationseteffectiveTimingsetrepeat.setPeriod(Double.parseDouble((o.getObsEffectiveTimingRepeatPeriod())));
		}
		/******************** Obs_Effective_Timing_Repeat_PeriodMax ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatPeriodMax() != null) {
			observationseteffectiveTimingsetrepeat.setPeriodMax(Double.parseDouble((o.getObsEffectiveTimingRepeatPeriodMax())));
		}

		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory observationseteffectiveTimingsetrepeatsetperiodunitEnumFactory = new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_PeriodUnit_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatPeriodUnitCode() != null) {
			observationseteffectiveTimingsetrepeat.setPeriodUnit(observationseteffectiveTimingsetrepeatsetperiodunitEnumFactory.fromCode(o.getObsEffectiveTimingRepeatPeriodUnitCode()));

		}
		/******************** Obs_Effective_Timing_Repeat_TimeOfDay ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatTimeOfDay() != null) {
			observationseteffectiveTimingsetrepeat.addTimeOfDay(o.getObsEffectiveTimingRepeatTimeOfDay());
		}

		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory observationseteffectiveTimingsetrepeataddwhenEnumFactory = new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();

		/******************** Obs_Effective_Timing_Repeat_When_Code ********************************************************************************/
		if(o.getObsEffectiveTimingRepeatWhenCode() != null) {
			observationseteffectiveTimingsetrepeat.addWhen(observationseteffectiveTimingsetrepeataddwhenEnumFactory.fromCode(o.getObsEffectiveTimingRepeatWhenCode()));

		}
		}
		/******************** Obs_Enc ********************************************************************************/
		if(o.getObsEnc() != null) {
			org.hl7.fhir.r4.model.Reference ObsEncref = new org.hl7.fhir.r4.model.Reference();
			observation.setEncounter(ObsEncref.setReference(o.getObsEnc()));
		}
		/******************** Obs_Focus ********************************************************************************/
		if(o.getObsFocus() != null) {
			org.hl7.fhir.r4.model.Reference ObsFocusref = new org.hl7.fhir.r4.model.Reference();
			observation.addFocus(ObsFocusref.setReference(o.getObsFocus()));
		}
		/******************** Obs_HasMember ********************************************************************************/
		if(o.getObsHasMember() != null) {
			org.hl7.fhir.r4.model.Reference ObsHasMemberref = new org.hl7.fhir.r4.model.Reference();
			observation.addHasMember(ObsHasMemberref.setReference(o.getObsHasMember()));
		}

		org.hl7.fhir.r4.model.Identifier observationaddidentifier = observation.addIdentifier();

		/******************** Obs_Id_Assigner ********************************************************************************/
		if(o.getObsIdAssigner() != null) {
			org.hl7.fhir.r4.model.Reference ObsIdAssignerref = new org.hl7.fhir.r4.model.Reference();
			observationaddidentifier.setAssigner(ObsIdAssignerref.setReference(o.getObsIdAssigner()));
		}

		org.hl7.fhir.r4.model.Period observationaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		observationaddidentifier.setPeriod(observationaddidentifiersetperiod);

		/******************** Obs_Id_Period_End ********************************************************************************/
		if(o.getObsIdPeriodEnd() != null) {
			java.text.SimpleDateFormat ObsIdPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsIdPeriodEnddate = ObsIdPeriodEndsdf.parse(o.getObsIdPeriodEnd());
			observationaddidentifiersetperiod.setEnd(ObsIdPeriodEnddate);
		}
		/******************** Obs_Id_Period_Start ********************************************************************************/
		if(o.getObsIdPeriodStart() != null) {
			java.text.SimpleDateFormat ObsIdPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsIdPeriodStartdate = ObsIdPeriodStartsdf.parse(o.getObsIdPeriodStart());
			observationaddidentifiersetperiod.setStart(ObsIdPeriodStartdate);
		}
		/******************** Obs_Id_System ********************************************************************************/
		if(o.getObsIdSystem() != null) {
			observationaddidentifier.setSystem(o.getObsIdSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddidentifier.setType(observationaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding observationaddidentifiersettypeaddcoding = observationaddidentifiersettype.addCoding();

		/******************** Obs_Id_Type_Coding_Code ********************************************************************************/
		if(o.getObsIdTypeCodingCode() != null) {
			observationaddidentifiersettypeaddcoding.setCode(o.getObsIdTypeCodingCode());
		}
		/******************** Obs_Id_Type_Coding_Display ********************************************************************************/
		if(o.getObsIdTypeCodingDisplay() != null) {
			observationaddidentifiersettypeaddcoding.setDisplay(o.getObsIdTypeCodingDisplay());
		}
		/******************** Obs_Id_Type_Coding_System ********************************************************************************/
		if(o.getObsIdTypeCodingSystem() != null) {
			observationaddidentifiersettypeaddcoding.setSystem(o.getObsIdTypeCodingSystem());
		}
		/******************** Obs_Id_Type_Coding_Usrslt ********************************************************************************/
		if(o.getObsIdTypeCodingUsrslt() != null) {
			observationaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsIdTypeCodingUsrslt()));
		}
		/******************** Obs_Id_Type_Coding_Version ********************************************************************************/
		if(o.getObsIdTypeCodingVersion() != null) {
			observationaddidentifiersettypeaddcoding.setVersion(o.getObsIdTypeCodingVersion());
		}
		/******************** Obs_Id_Type_Text ********************************************************************************/
		if(o.getObsIdTypeText() != null) {
			observationaddidentifiersettype.setText(o.getObsIdTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory observationaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Obs_Id_Use_Code ********************************************************************************/
		if(o.getObsIdUseCode() != null) {
			observationaddidentifier.setUse(observationaddidentifiersetuseEnumFactory.fromCode(o.getObsIdUseCode()));

		}
		/******************** Obs_Id_Value ********************************************************************************/
		if(o.getObsIdValue() != null) {
			observationaddidentifier.setValue(o.getObsIdValue());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddinterpretation = observation.addInterpretation();


		org.hl7.fhir.r4.model.Coding observationaddinterpretationaddcoding = observationaddinterpretation.addCoding();

		/******************** Obs_Interpretation_Coding_Code ********************************************************************************/
		if(o.getObsInterpretationCodingCode() != null) {
			observationaddinterpretationaddcoding.setCode(o.getObsInterpretationCodingCode());
		}
		/******************** Obs_Interpretation_Coding_Display ********************************************************************************/
		if(o.getObsInterpretationCodingDisplay() != null) {
			observationaddinterpretationaddcoding.setDisplay(o.getObsInterpretationCodingDisplay());
		}
		/******************** Obs_Interpretation_Coding_System ********************************************************************************/
		if(o.getObsInterpretationCodingSystem() != null) {
			observationaddinterpretationaddcoding.setSystem(o.getObsInterpretationCodingSystem());
		}
		/******************** Obs_Interpretation_Coding_Usrslt ********************************************************************************/
		if(o.getObsInterpretationCodingUsrslt() != null) {
			observationaddinterpretationaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsInterpretationCodingUsrslt()));
		}
		/******************** Obs_Interpretation_Coding_Version ********************************************************************************/
		if(o.getObsInterpretationCodingVersion() != null) {
			observationaddinterpretationaddcoding.setVersion(o.getObsInterpretationCodingVersion());
		}
		/******************** Obs_Interpretation_Text ********************************************************************************/
		if(o.getObsInterpretationText() != null) {
			observationaddinterpretation.setText(o.getObsInterpretationText());
		}
		/******************** Obs_Issued ********************************************************************************/
		if(o.getObsIssued() != null) {
			java.text.SimpleDateFormat ObsIssuedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsIssueddate = ObsIssuedsdf.parse(o.getObsIssued());
			observation.setIssued(ObsIssueddate);
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetmethod = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setMethod(observationsetmethod);


		org.hl7.fhir.r4.model.Coding observationsetmethodaddcoding = observationsetmethod.addCoding();

		/******************** Obs_Method_Coding_Code ********************************************************************************/
		if(o.getObsMethodCodingCode() != null) {
			observationsetmethodaddcoding.setCode(o.getObsMethodCodingCode());
		}
		/******************** Obs_Method_Coding_Display ********************************************************************************/
		if(o.getObsMethodCodingDisplay() != null) {
			observationsetmethodaddcoding.setDisplay(o.getObsMethodCodingDisplay());
		}
		/******************** Obs_Method_Coding_System ********************************************************************************/
		if(o.getObsMethodCodingSystem() != null) {
			observationsetmethodaddcoding.setSystem(o.getObsMethodCodingSystem());
		}
		/******************** Obs_Method_Coding_Usrslt ********************************************************************************/
		if(o.getObsMethodCodingUsrslt() != null) {
			observationsetmethodaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsMethodCodingUsrslt()));
		}
		/******************** Obs_Method_Coding_Version ********************************************************************************/
		if(o.getObsMethodCodingVersion() != null) {
			observationsetmethodaddcoding.setVersion(o.getObsMethodCodingVersion());
		}
		/******************** Obs_Method_Text ********************************************************************************/
		if(o.getObsMethodText() != null) {
			observationsetmethod.setText(o.getObsMethodText());
		}

		org.hl7.fhir.r4.model.Annotation observationaddnote = observation.addNote();

		/******************** Observation_Note_AuthorReference ********************************************************************************/
		if(o.getObservationNoteAuthorReference() != null) {
			org.hl7.fhir.r4.model.Reference ObservationNoteAuthorReferenceref = new org.hl7.fhir.r4.model.Reference();
			observationaddnote.setAuthor(ObservationNoteAuthorReferenceref.setReference(o.getObservationNoteAuthorReference()));
		}
		/******************** Observation_Note_AuthorString ********************************************************************************/
		if(o.getObservationNoteAuthorString() != null) {
			observationaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(o.getObservationNoteAuthorString()));
		}
		/******************** Obs_Note_Text ********************************************************************************/
		if(o.getObsNoteText() != null) {
			observationaddnote.setText(o.getObsNoteText());
		}
		/******************** Obs_Note_Time ********************************************************************************/
		if(o.getObsNoteTime() != null) {
			java.text.SimpleDateFormat ObsNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsNoteTimedate = ObsNoteTimesdf.parse(o.getObsNoteTime());
			observationaddnote.setTime(ObsNoteTimedate);
		}
		/******************** Obs_PartOf ********************************************************************************/
		if(o.getObsPartOf() != null) {
			org.hl7.fhir.r4.model.Reference ObsPartOfref = new org.hl7.fhir.r4.model.Reference();
			observation.addPartOf(ObsPartOfref.setReference(o.getObsPartOf()));
		}
		/******************** Obs_Performer ********************************************************************************/
		if(o.getObsPerformer() != null) {
			org.hl7.fhir.r4.model.Reference ObsPerformerref = new org.hl7.fhir.r4.model.Reference();
			observation.addPerformer(ObsPerformerref.setReference(o.getObsPerformer()));
		}

		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationaddreferencerange = observation.addReferenceRange();


		org.hl7.fhir.r4.model.Range observationaddreferencerangesetage = new org.hl7.fhir.r4.model.Range();
		observationaddreferencerange.setAge(observationaddreferencerangesetage);


		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesetagesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerangesetage.setHigh(observationaddreferencerangesetagesethigh);

		/******************** Obs_ReferenceRange_Age_High_Code ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighCode() != null) {
			observationaddreferencerangesetagesethigh.setCode(o.getObsReferenceRangeAgeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesetagesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_ReferenceRange_Age_High_Compartr_Code ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighCompartrCode() != null) {
			observationaddreferencerangesetagesethigh.setComparator(observationaddreferencerangesetagesethighsetcomparatorEnumFactory.fromCode(o.getObsReferenceRangeAgeHighCompartrCode()));

		}
		/******************** Obs_ReferenceRange_Age_High_System ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighSystem() != null) {
			observationaddreferencerangesetagesethigh.setSystem(o.getObsReferenceRangeAgeHighSystem());
		}
		/******************** Obs_ReferenceRange_Age_High_Unit ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighUnit() != null) {
			observationaddreferencerangesetagesethigh.setUnit(o.getObsReferenceRangeAgeHighUnit());
		}
		/******************** Obs_ReferenceRange_Age_High_Value ********************************************************************************/
		if(o.getObsReferenceRangeAgeHighValue() != null) {
			observationaddreferencerangesetagesethigh.setValue(Double.parseDouble((o.getObsReferenceRangeAgeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesetagesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerangesetage.setLow(observationaddreferencerangesetagesetlow);

		/******************** Obs_ReferenceRange_Age_Low_Code ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowCode() != null) {
			observationaddreferencerangesetagesetlow.setCode(o.getObsReferenceRangeAgeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesetagesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_ReferenceRange_Age_Low_Compartr_Code ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowCompartrCode() != null) {
			observationaddreferencerangesetagesetlow.setComparator(observationaddreferencerangesetagesetlowsetcomparatorEnumFactory.fromCode(o.getObsReferenceRangeAgeLowCompartrCode()));

		}
		/******************** Obs_ReferenceRange_Age_Low_System ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowSystem() != null) {
			observationaddreferencerangesetagesetlow.setSystem(o.getObsReferenceRangeAgeLowSystem());
		}
		/******************** Obs_ReferenceRange_Age_Low_Unit ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowUnit() != null) {
			observationaddreferencerangesetagesetlow.setUnit(o.getObsReferenceRangeAgeLowUnit());
		}
		/******************** Obs_ReferenceRange_Age_Low_Value ********************************************************************************/
		if(o.getObsReferenceRangeAgeLowValue() != null) {
			observationaddreferencerangesetagesetlow.setValue(Double.parseDouble((o.getObsReferenceRangeAgeLowValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddreferencerangeaddappliesto = observationaddreferencerange.addAppliesTo();


		org.hl7.fhir.r4.model.Coding observationaddreferencerangeaddappliestoaddcoding = observationaddreferencerangeaddappliesto.addCoding();

		/******************** Obs_ReferenceRange_AppliesTo_Coding_Code ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingCode() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setCode(o.getObsReferenceRangeAppliesToCodingCode());
		}
		/******************** Obs_ReferenceRange_AppliesTo_Coding_Display ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingDisplay() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setDisplay(o.getObsReferenceRangeAppliesToCodingDisplay());
		}
		/******************** Obs_ReferenceRange_AppliesTo_Coding_System ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingSystem() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setSystem(o.getObsReferenceRangeAppliesToCodingSystem());
		}
		/******************** Obs_ReferenceRange_AppliesTo_Coding_Usrslt ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingUsrslt() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsReferenceRangeAppliesToCodingUsrslt()));
		}
		/******************** Obs_ReferenceRange_AppliesTo_Coding_Version ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToCodingVersion() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setVersion(o.getObsReferenceRangeAppliesToCodingVersion());
		}
		/******************** Obs_ReferenceRange_AppliesTo_Text ********************************************************************************/
		if(o.getObsReferenceRangeAppliesToText() != null) {
			observationaddreferencerangeaddappliesto.setText(o.getObsReferenceRangeAppliesToText());
		}

		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerange.setHigh(observationaddreferencerangesethigh);

		/******************** Obs_ReferenceRange_High_Code ********************************************************************************/
		if(o.getObsReferenceRangeHighCode() != null) {
			observationaddreferencerangesethigh.setCode(o.getObsReferenceRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_ReferenceRange_High_Compartr_Code ********************************************************************************/
		if(o.getObsReferenceRangeHighCompartrCode() != null) {
			observationaddreferencerangesethigh.setComparator(observationaddreferencerangesethighsetcomparatorEnumFactory.fromCode(o.getObsReferenceRangeHighCompartrCode()));

		}
		/******************** Obs_ReferenceRange_High_System ********************************************************************************/
		if(o.getObsReferenceRangeHighSystem() != null) {
			observationaddreferencerangesethigh.setSystem(o.getObsReferenceRangeHighSystem());
		}
		/******************** Obs_ReferenceRange_High_Unit ********************************************************************************/
		if(o.getObsReferenceRangeHighUnit() != null) {
			observationaddreferencerangesethigh.setUnit(o.getObsReferenceRangeHighUnit());
		}
		/******************** Obs_ReferenceRange_High_Value ********************************************************************************/
		if(o.getObsReferenceRangeHighValue() != null) {
			observationaddreferencerangesethigh.setValue(Double.parseDouble((o.getObsReferenceRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerange.setLow(observationaddreferencerangesetlow);

		/******************** Obs_ReferenceRange_Low_Code ********************************************************************************/
		if(o.getObsReferenceRangeLowCode() != null) {
			observationaddreferencerangesetlow.setCode(o.getObsReferenceRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_ReferenceRange_Low_Compartr_Code ********************************************************************************/
		if(o.getObsReferenceRangeLowCompartrCode() != null) {
			observationaddreferencerangesetlow.setComparator(observationaddreferencerangesetlowsetcomparatorEnumFactory.fromCode(o.getObsReferenceRangeLowCompartrCode()));

		}
		/******************** Obs_ReferenceRange_Low_System ********************************************************************************/
		if(o.getObsReferenceRangeLowSystem() != null) {
			observationaddreferencerangesetlow.setSystem(o.getObsReferenceRangeLowSystem());
		}
		/******************** Obs_ReferenceRange_Low_Unit ********************************************************************************/
		if(o.getObsReferenceRangeLowUnit() != null) {
			observationaddreferencerangesetlow.setUnit(o.getObsReferenceRangeLowUnit());
		}
		/******************** Obs_ReferenceRange_Low_Value ********************************************************************************/
		if(o.getObsReferenceRangeLowValue() != null) {
			observationaddreferencerangesetlow.setValue(Double.parseDouble((o.getObsReferenceRangeLowValue())));
		}
		/******************** Obs_ReferenceRange_Text ********************************************************************************/
		if(o.getObsReferenceRangeText() != null) {
			observationaddreferencerange.setText(o.getObsReferenceRangeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddreferencerangesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddreferencerange.setType(observationaddreferencerangesettype);


		org.hl7.fhir.r4.model.Coding observationaddreferencerangesettypeaddcoding = observationaddreferencerangesettype.addCoding();

		/******************** Obs_ReferenceRange_Type_Coding_Code ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingCode() != null) {
			observationaddreferencerangesettypeaddcoding.setCode(o.getObsReferenceRangeTypeCodingCode());
		}
		/******************** Obs_ReferenceRange_Type_Coding_Display ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingDisplay() != null) {
			observationaddreferencerangesettypeaddcoding.setDisplay(o.getObsReferenceRangeTypeCodingDisplay());
		}
		/******************** Obs_ReferenceRange_Type_Coding_System ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingSystem() != null) {
			observationaddreferencerangesettypeaddcoding.setSystem(o.getObsReferenceRangeTypeCodingSystem());
		}
		/******************** Obs_ReferenceRange_Type_Coding_Usrslt ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingUsrslt() != null) {
			observationaddreferencerangesettypeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsReferenceRangeTypeCodingUsrslt()));
		}
		/******************** Obs_ReferenceRange_Type_Coding_Version ********************************************************************************/
		if(o.getObsReferenceRangeTypeCodingVersion() != null) {
			observationaddreferencerangesettypeaddcoding.setVersion(o.getObsReferenceRangeTypeCodingVersion());
		}
		/******************** Obs_ReferenceRange_Type_Text ********************************************************************************/
		if(o.getObsReferenceRangeTypeText() != null) {
			observationaddreferencerangesettype.setText(o.getObsReferenceRangeTypeText());
		}
		/******************** Obs_Specimen ********************************************************************************/
		if(o.getObsSpecimen() != null) {
			org.hl7.fhir.r4.model.Reference ObsSpecimenref = new org.hl7.fhir.r4.model.Reference();
			observation.setSpecimen(ObsSpecimenref.setReference(o.getObsSpecimen()));
		}

		org.hl7.fhir.r4.model.Observation.ObservationStatusEnumFactory observationsetstatusEnumFactory = new org.hl7.fhir.r4.model.Observation.ObservationStatusEnumFactory();

		/******************** Obs_Status_Code ********************************************************************************/
		if(o.getObsStatusCode() != null) {
			observation.setStatus(observationsetstatusEnumFactory.fromCode(o.getObsStatusCode()));

		}
		/******************** Obs_Subject ********************************************************************************/
		if(o.getObsSubject() != null) {
			org.hl7.fhir.r4.model.Reference ObsSubjectref = new org.hl7.fhir.r4.model.Reference();
			observation.setSubject(ObsSubjectref.setReference(o.getObsSubject()));
		}
		/******************** Observation_ValueBoolean ********************************************************************************/
		if(o.getObservationValueBoolean() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.BooleanType(o.getObservationValueBoolean()));
		}

		if( o.getObsValueCodeableConceptCodingCode() != null || o.getObsValueCodeableConceptCodingDisplay() != null || o.getObsValueCodeableConceptCodingSystem() != null || o.getObsValueCodeableConceptCodingUsrslt() != null || o.getObsValueCodeableConceptCodingVersion() != null || o.getObsValueCodeableConceptText() != null ) {
			org.hl7.fhir.r4.model.CodeableConcept observationsetvalueCodeableConcept = new org.hl7.fhir.r4.model.CodeableConcept();
			observation.setValue(observationsetvalueCodeableConcept);


		org.hl7.fhir.r4.model.Coding observationsetvalueCodeableConceptaddcoding = observationsetvalueCodeableConcept.addCoding();

		/******************** Obs_Value_CodeableConcept_Coding_Code ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingCode() != null) {
			observationsetvalueCodeableConceptaddcoding.setCode(o.getObsValueCodeableConceptCodingCode());
		}
		/******************** Obs_Value_CodeableConcept_Coding_Display ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingDisplay() != null) {
			observationsetvalueCodeableConceptaddcoding.setDisplay(o.getObsValueCodeableConceptCodingDisplay());
		}
		/******************** Obs_Value_CodeableConcept_Coding_System ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingSystem() != null) {
			observationsetvalueCodeableConceptaddcoding.setSystem(o.getObsValueCodeableConceptCodingSystem());
		}
		/******************** Obs_Value_CodeableConcept_Coding_Usrslt ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingUsrslt() != null) {
			observationsetvalueCodeableConceptaddcoding.setUserSelected(Boolean.parseBoolean(o.getObsValueCodeableConceptCodingUsrslt()));
		}
		/******************** Obs_Value_CodeableConcept_Coding_Version ********************************************************************************/
		if(o.getObsValueCodeableConceptCodingVersion() != null) {
			observationsetvalueCodeableConceptaddcoding.setVersion(o.getObsValueCodeableConceptCodingVersion());
		}
		/******************** Obs_Value_CodeableConcept_Text ********************************************************************************/
		if(o.getObsValueCodeableConceptText() != null) {
			observationsetvalueCodeableConcept.setText(o.getObsValueCodeableConceptText());
		}
		}
		/******************** Observation_ValueDateTime ********************************************************************************/
		if(o.getObservationValueDateTime() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.DateTimeType(o.getObservationValueDateTime()));
		}
		/******************** Observation_ValueInteger ********************************************************************************/
		if(o.getObservationValueInteger() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.IntegerType(o.getObservationValueInteger()));
		}

		if( o.getObsValuePeriodEnd() != null || o.getObsValuePeriodStart() != null ) {
			org.hl7.fhir.r4.model.Period observationsetvaluePeriod = new org.hl7.fhir.r4.model.Period();
			observation.setValue(observationsetvaluePeriod);

		/******************** Obs_Value_Period_End ********************************************************************************/
		if(o.getObsValuePeriodEnd() != null) {
			java.text.SimpleDateFormat ObsValuePeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsValuePeriodEnddate = ObsValuePeriodEndsdf.parse(o.getObsValuePeriodEnd());
			observationsetvaluePeriod.setEnd(ObsValuePeriodEnddate);
		}
		/******************** Obs_Value_Period_Start ********************************************************************************/
		if(o.getObsValuePeriodStart() != null) {
			java.text.SimpleDateFormat ObsValuePeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObsValuePeriodStartdate = ObsValuePeriodStartsdf.parse(o.getObsValuePeriodStart());
			observationsetvaluePeriod.setStart(ObsValuePeriodStartdate);
		}
		}

		if( o.getObsValueQuantityCode() != null || o.getObsValueQuantityCompartrCode() != null || o.getObsValueQuantitySystem() != null || o.getObsValueQuantityUnit() != null || o.getObsValueQuantityValue() != null ) {
			org.hl7.fhir.r4.model.Quantity observationsetvalueQuantity = new org.hl7.fhir.r4.model.Quantity();
			observation.setValue(observationsetvalueQuantity);

		/******************** Obs_Value_Quantity_Code ********************************************************************************/
		if(o.getObsValueQuantityCode() != null) {
			observationsetvalueQuantity.setCode(o.getObsValueQuantityCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueQuantitysetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Quantity_Compartr_Code ********************************************************************************/
		if(o.getObsValueQuantityCompartrCode() != null) {
			observationsetvalueQuantity.setComparator(observationsetvalueQuantitysetcomparatorEnumFactory.fromCode(o.getObsValueQuantityCompartrCode()));

		}
		/******************** Obs_Value_Quantity_System ********************************************************************************/
		if(o.getObsValueQuantitySystem() != null) {
			observationsetvalueQuantity.setSystem(o.getObsValueQuantitySystem());
		}
		/******************** Obs_Value_Quantity_Unit ********************************************************************************/
		if(o.getObsValueQuantityUnit() != null) {
			observationsetvalueQuantity.setUnit(o.getObsValueQuantityUnit());
		}
		/******************** Obs_Value_Quantity_Value ********************************************************************************/
		if(o.getObsValueQuantityValue() != null) {
			observationsetvalueQuantity.setValue(Double.parseDouble((o.getObsValueQuantityValue())));
		}
		}

		if( o.getObsValueRangeHighCode() != null || o.getObsValueRangeHighCompartrCode() != null || o.getObsValueRangeHighSystem() != null || o.getObsValueRangeHighUnit() != null || o.getObsValueRangeHighValue() != null || o.getObsValueRangeLowCode() != null || o.getObsValueRangeLowCompartrCode() != null || o.getObsValueRangeLowSystem() != null || o.getObsValueRangeLowUnit() != null || o.getObsValueRangeLowValue() != null ) {
			org.hl7.fhir.r4.model.Range observationsetvalueRange = new org.hl7.fhir.r4.model.Range();
			observation.setValue(observationsetvalueRange);


		org.hl7.fhir.r4.model.Quantity observationsetvalueRangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueRange.setHigh(observationsetvalueRangesethigh);

		/******************** Obs_Value_Range_High_Code ********************************************************************************/
		if(o.getObsValueRangeHighCode() != null) {
			observationsetvalueRangesethigh.setCode(o.getObsValueRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueRangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Range_High_Compartr_Code ********************************************************************************/
		if(o.getObsValueRangeHighCompartrCode() != null) {
			observationsetvalueRangesethigh.setComparator(observationsetvalueRangesethighsetcomparatorEnumFactory.fromCode(o.getObsValueRangeHighCompartrCode()));

		}
		/******************** Obs_Value_Range_High_System ********************************************************************************/
		if(o.getObsValueRangeHighSystem() != null) {
			observationsetvalueRangesethigh.setSystem(o.getObsValueRangeHighSystem());
		}
		/******************** Obs_Value_Range_High_Unit ********************************************************************************/
		if(o.getObsValueRangeHighUnit() != null) {
			observationsetvalueRangesethigh.setUnit(o.getObsValueRangeHighUnit());
		}
		/******************** Obs_Value_Range_High_Value ********************************************************************************/
		if(o.getObsValueRangeHighValue() != null) {
			observationsetvalueRangesethigh.setValue(Double.parseDouble((o.getObsValueRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationsetvalueRangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueRange.setLow(observationsetvalueRangesetlow);

		/******************** Obs_Value_Range_Low_Code ********************************************************************************/
		if(o.getObsValueRangeLowCode() != null) {
			observationsetvalueRangesetlow.setCode(o.getObsValueRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueRangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Range_Low_Compartr_Code ********************************************************************************/
		if(o.getObsValueRangeLowCompartrCode() != null) {
			observationsetvalueRangesetlow.setComparator(observationsetvalueRangesetlowsetcomparatorEnumFactory.fromCode(o.getObsValueRangeLowCompartrCode()));

		}
		/******************** Obs_Value_Range_Low_System ********************************************************************************/
		if(o.getObsValueRangeLowSystem() != null) {
			observationsetvalueRangesetlow.setSystem(o.getObsValueRangeLowSystem());
		}
		/******************** Obs_Value_Range_Low_Unit ********************************************************************************/
		if(o.getObsValueRangeLowUnit() != null) {
			observationsetvalueRangesetlow.setUnit(o.getObsValueRangeLowUnit());
		}
		/******************** Obs_Value_Range_Low_Value ********************************************************************************/
		if(o.getObsValueRangeLowValue() != null) {
			observationsetvalueRangesetlow.setValue(Double.parseDouble((o.getObsValueRangeLowValue())));
		}
		}

		if( o.getObsValueRatioDenomCode() != null || o.getObsValueRatioDenomCompartrCode() != null || o.getObsValueRatioDenomSystem() != null || o.getObsValueRatioDenomUnit() != null || o.getObsValueRatioDenomValue() != null || o.getObsValueRatioNumeratorCode() != null || o.getObsValueRatioNumeratorCompartrCode() != null || o.getObsValueRatioNumeratorSystem() != null || o.getObsValueRatioNumeratorUnit() != null || o.getObsValueRatioNumeratorValue() != null ) {
			org.hl7.fhir.r4.model.Ratio observationsetvalueRatio = new org.hl7.fhir.r4.model.Ratio();
			observation.setValue(observationsetvalueRatio);


		org.hl7.fhir.r4.model.Quantity observationsetvalueRatiosetdenominator = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueRatio.setDenominator(observationsetvalueRatiosetdenominator);

		/******************** Obs_Value_Ratio_Denom_Code ********************************************************************************/
		if(o.getObsValueRatioDenomCode() != null) {
			observationsetvalueRatiosetdenominator.setCode(o.getObsValueRatioDenomCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueRatiosetdenominatorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Ratio_Denom_Compartr_Code ********************************************************************************/
		if(o.getObsValueRatioDenomCompartrCode() != null) {
			observationsetvalueRatiosetdenominator.setComparator(observationsetvalueRatiosetdenominatorsetcomparatorEnumFactory.fromCode(o.getObsValueRatioDenomCompartrCode()));

		}
		/******************** Obs_Value_Ratio_Denom_System ********************************************************************************/
		if(o.getObsValueRatioDenomSystem() != null) {
			observationsetvalueRatiosetdenominator.setSystem(o.getObsValueRatioDenomSystem());
		}
		/******************** Obs_Value_Ratio_Denom_Unit ********************************************************************************/
		if(o.getObsValueRatioDenomUnit() != null) {
			observationsetvalueRatiosetdenominator.setUnit(o.getObsValueRatioDenomUnit());
		}
		/******************** Obs_Value_Ratio_Denom_Value ********************************************************************************/
		if(o.getObsValueRatioDenomValue() != null) {
			observationsetvalueRatiosetdenominator.setValue(Double.parseDouble((o.getObsValueRatioDenomValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationsetvalueRatiosetnumerator = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueRatio.setNumerator(observationsetvalueRatiosetnumerator);

		/******************** Obs_Value_Ratio_Numerator_Code ********************************************************************************/
		if(o.getObsValueRatioNumeratorCode() != null) {
			observationsetvalueRatiosetnumerator.setCode(o.getObsValueRatioNumeratorCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueRatiosetnumeratorsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_Ratio_Numerator_Compartr_Code ********************************************************************************/
		if(o.getObsValueRatioNumeratorCompartrCode() != null) {
			observationsetvalueRatiosetnumerator.setComparator(observationsetvalueRatiosetnumeratorsetcomparatorEnumFactory.fromCode(o.getObsValueRatioNumeratorCompartrCode()));

		}
		/******************** Obs_Value_Ratio_Numerator_System ********************************************************************************/
		if(o.getObsValueRatioNumeratorSystem() != null) {
			observationsetvalueRatiosetnumerator.setSystem(o.getObsValueRatioNumeratorSystem());
		}
		/******************** Obs_Value_Ratio_Numerator_Unit ********************************************************************************/
		if(o.getObsValueRatioNumeratorUnit() != null) {
			observationsetvalueRatiosetnumerator.setUnit(o.getObsValueRatioNumeratorUnit());
		}
		/******************** Obs_Value_Ratio_Numerator_Value ********************************************************************************/
		if(o.getObsValueRatioNumeratorValue() != null) {
			observationsetvalueRatiosetnumerator.setValue(Double.parseDouble((o.getObsValueRatioNumeratorValue())));
		}
		}

		if( o.getObsValueSampledDataData() != null || o.getObsValueSampledDataDimensions() != null || o.getObsValueSampledDataFactor() != null || o.getObsValueSampledDataLowerLimit() != null || o.getObsValueSampledDataOriginCode() != null || o.getObsValueSampledDataOriginCompartrCode() != null || o.getObsValueSampledDataOriginSystem() != null || o.getObsValueSampledDataOriginUnit() != null || o.getObsValueSampledDataOriginValue() != null || o.getObsValueSampledDataPeriod() != null || o.getObsValueSampledDataUpperLimit() != null ) {
			org.hl7.fhir.r4.model.SampledData observationsetvalueSampledData = new org.hl7.fhir.r4.model.SampledData();
			observation.setValue(observationsetvalueSampledData);

		/******************** Obs_Value_SampledData_Data ********************************************************************************/
		if(o.getObsValueSampledDataData() != null) {
			observationsetvalueSampledData.setData(o.getObsValueSampledDataData());
		}
		/******************** Obs_Value_SampledData_Dimensions ********************************************************************************/
		if(o.getObsValueSampledDataDimensions() != null) {
			observationsetvalueSampledData.setDimensions(Integer.parseInt(o.getObsValueSampledDataDimensions()));
		}
		/******************** Obs_Value_SampledData_Factor ********************************************************************************/
		if(o.getObsValueSampledDataFactor() != null) {
			observationsetvalueSampledData.setFactor(Double.parseDouble((o.getObsValueSampledDataFactor())));
		}
		/******************** Obs_Value_SampledData_LowerLimit ********************************************************************************/
		if(o.getObsValueSampledDataLowerLimit() != null) {
			observationsetvalueSampledData.setLowerLimit(Double.parseDouble((o.getObsValueSampledDataLowerLimit())));
		}

		org.hl7.fhir.r4.model.Quantity observationsetvalueSampledDatasetorigin = new org.hl7.fhir.r4.model.Quantity();
		observationsetvalueSampledData.setOrigin(observationsetvalueSampledDatasetorigin);

		/******************** Obs_Value_SampledData_Origin_Code ********************************************************************************/
		if(o.getObsValueSampledDataOriginCode() != null) {
			observationsetvalueSampledDatasetorigin.setCode(o.getObsValueSampledDataOriginCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationsetvalueSampledDatasetoriginsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Obs_Value_SampledData_Origin_Compartr_Code ********************************************************************************/
		if(o.getObsValueSampledDataOriginCompartrCode() != null) {
			observationsetvalueSampledDatasetorigin.setComparator(observationsetvalueSampledDatasetoriginsetcomparatorEnumFactory.fromCode(o.getObsValueSampledDataOriginCompartrCode()));

		}
		/******************** Obs_Value_SampledData_Origin_System ********************************************************************************/
		if(o.getObsValueSampledDataOriginSystem() != null) {
			observationsetvalueSampledDatasetorigin.setSystem(o.getObsValueSampledDataOriginSystem());
		}
		/******************** Obs_Value_SampledData_Origin_Unit ********************************************************************************/
		if(o.getObsValueSampledDataOriginUnit() != null) {
			observationsetvalueSampledDatasetorigin.setUnit(o.getObsValueSampledDataOriginUnit());
		}
		/******************** Obs_Value_SampledData_Origin_Value ********************************************************************************/
		if(o.getObsValueSampledDataOriginValue() != null) {
			observationsetvalueSampledDatasetorigin.setValue(Double.parseDouble((o.getObsValueSampledDataOriginValue())));
		}
		/******************** Obs_Value_SampledData_Period ********************************************************************************/
		if(o.getObsValueSampledDataPeriod() != null) {
			observationsetvalueSampledData.setPeriod(Double.parseDouble((o.getObsValueSampledDataPeriod())));
		}
		/******************** Obs_Value_SampledData_UpperLimit ********************************************************************************/
		if(o.getObsValueSampledDataUpperLimit() != null) {
			observationsetvalueSampledData.setUpperLimit(Double.parseDouble((o.getObsValueSampledDataUpperLimit())));
		}
		}
		/******************** Observation_ValueString ********************************************************************************/
		if(o.getObservationValueString() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.StringType(o.getObservationValueString()));
		}
		/******************** Observation_ValueTime ********************************************************************************/
		if(o.getObservationValueTime() != null) {
			observation.setValue(new org.hl7.fhir.r4.model.TimeType(o.getObservationValueTime()));
		}
		return observation;
	}
}
