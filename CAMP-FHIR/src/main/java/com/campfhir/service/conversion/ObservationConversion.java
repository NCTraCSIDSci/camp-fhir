package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Observation;
public class ObservationConversion 
{
	public org.hl7.fhir.r4.model.Observation Observations(Observation o) throws ParseException
	{
		org.hl7.fhir.r4.model.Observation observation = new org.hl7.fhir.r4.model.Observation();
		/******************** Observation_BasedOn ********************************************************************************/
		if(o.getObservationBasedOn() != null) {
			org.hl7.fhir.r4.model.Reference ObservationBasedOnref = new org.hl7.fhir.r4.model.Reference();
			observation.addBasedOn(ObservationBasedOnref.setReference(o.getObservationBasedOn()));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetbodysite = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setBodySite(observationsetbodysite);


		org.hl7.fhir.r4.model.Coding observationsetbodysiteaddcoding = observationsetbodysite.addCoding();

		/******************** Observation_BodySite_Coding_Code ********************************************************************************/
		if(o.getObservationBodySiteCodingCode() != null) {
			observationsetbodysiteaddcoding.setCode(o.getObservationBodySiteCodingCode());
		}
		/******************** Observation_BodySite_Coding_Display ********************************************************************************/
		if(o.getObservationBodySiteCodingDisplay() != null) {
			observationsetbodysiteaddcoding.setDisplay(o.getObservationBodySiteCodingDisplay());
		}
		/******************** Observation_BodySite_Coding_System ********************************************************************************/
		if(o.getObservationBodySiteCodingSystem() != null) {
			observationsetbodysiteaddcoding.setSystem(o.getObservationBodySiteCodingSystem());
		}
		/******************** Observation_BodySite_Coding_UserSelected ********************************************************************************/
		if(o.getObservationBodySiteCodingUserSelected() != null) {
			observationsetbodysiteaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationBodySiteCodingUserSelected()));
		}
		/******************** Observation_BodySite_Coding_Version ********************************************************************************/
		if(o.getObservationBodySiteCodingVersion() != null) {
			observationsetbodysiteaddcoding.setVersion(o.getObservationBodySiteCodingVersion());
		}
		/******************** Observation_BodySite_Text ********************************************************************************/
		if(o.getObservationBodySiteText() != null) {
			observationsetbodysite.setText(o.getObservationBodySiteText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcategory = observation.addCategory();


		org.hl7.fhir.r4.model.Coding observationaddcategoryaddcoding = observationaddcategory.addCoding();

		/******************** Observation_Category_Coding_Code ********************************************************************************/
		if(o.getObservationCategoryCodingCode() != null) {
			observationaddcategoryaddcoding.setCode(o.getObservationCategoryCodingCode());
		}
		/******************** Observation_Category_Coding_Display ********************************************************************************/
		if(o.getObservationCategoryCodingDisplay() != null) {
			observationaddcategoryaddcoding.setDisplay(o.getObservationCategoryCodingDisplay());
		}
		/******************** Observation_Category_Coding_System ********************************************************************************/
		if(o.getObservationCategoryCodingSystem() != null) {
			observationaddcategoryaddcoding.setSystem(o.getObservationCategoryCodingSystem());
		}
		/******************** Observation_Category_Coding_UserSelected ********************************************************************************/
		if(o.getObservationCategoryCodingUserSelected() != null) {
			observationaddcategoryaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationCategoryCodingUserSelected()));
		}
		/******************** Observation_Category_Coding_Version ********************************************************************************/
		if(o.getObservationCategoryCodingVersion() != null) {
			observationaddcategoryaddcoding.setVersion(o.getObservationCategoryCodingVersion());
		}
		/******************** Observation_Category_Text ********************************************************************************/
		if(o.getObservationCategoryText() != null) {
			observationaddcategory.setText(o.getObservationCategoryText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setCode(observationsetcode);


		org.hl7.fhir.r4.model.Coding observationsetcodeaddcoding = observationsetcode.addCoding();

		/******************** Observation_Code_Coding_Code ********************************************************************************/
		if(o.getObservationCodeCodingCode() != null) {
			observationsetcodeaddcoding.setCode(o.getObservationCodeCodingCode());
		}
		/******************** Observation_Code_Coding_Display ********************************************************************************/
		if(o.getObservationCodeCodingDisplay() != null) {
			observationsetcodeaddcoding.setDisplay(o.getObservationCodeCodingDisplay());
		}
		/******************** Observation_Code_Coding_System ********************************************************************************/
		if(o.getObservationCodeCodingSystem() != null) {
			observationsetcodeaddcoding.setSystem(o.getObservationCodeCodingSystem());
		}
		/******************** Observation_Code_Coding_UserSelected ********************************************************************************/
		if(o.getObservationCodeCodingUserSelected() != null) {
			observationsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationCodeCodingUserSelected()));
		}
		/******************** Observation_Code_Coding_Version ********************************************************************************/
		if(o.getObservationCodeCodingVersion() != null) {
			observationsetcodeaddcoding.setVersion(o.getObservationCodeCodingVersion());
		}
		/******************** Observation_Code_Text ********************************************************************************/
		if(o.getObservationCodeText() != null) {
			observationsetcode.setText(o.getObservationCodeText());
		}

		org.hl7.fhir.r4.model.Observation.ObservationComponentComponent observationaddcomponent = observation.addComponent();


		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentsetcode = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddcomponent.setCode(observationaddcomponentsetcode);


		org.hl7.fhir.r4.model.Coding observationaddcomponentsetcodeaddcoding = observationaddcomponentsetcode.addCoding();

		/******************** Observation_Component_Code_Coding_Code ********************************************************************************/
		if(o.getObservationComponentCodeCodingCode() != null) {
			observationaddcomponentsetcodeaddcoding.setCode(o.getObservationComponentCodeCodingCode());
		}
		/******************** Observation_Component_Code_Coding_Display ********************************************************************************/
		if(o.getObservationComponentCodeCodingDisplay() != null) {
			observationaddcomponentsetcodeaddcoding.setDisplay(o.getObservationComponentCodeCodingDisplay());
		}
		/******************** Observation_Component_Code_Coding_System ********************************************************************************/
		if(o.getObservationComponentCodeCodingSystem() != null) {
			observationaddcomponentsetcodeaddcoding.setSystem(o.getObservationComponentCodeCodingSystem());
		}
		/******************** Observation_Component_Code_Coding_UserSelected ********************************************************************************/
		if(o.getObservationComponentCodeCodingUserSelected() != null) {
			observationaddcomponentsetcodeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationComponentCodeCodingUserSelected()));
		}
		/******************** Observation_Component_Code_Coding_Version ********************************************************************************/
		if(o.getObservationComponentCodeCodingVersion() != null) {
			observationaddcomponentsetcodeaddcoding.setVersion(o.getObservationComponentCodeCodingVersion());
		}
		/******************** Observation_Component_Code_Text ********************************************************************************/
		if(o.getObservationComponentCodeText() != null) {
			observationaddcomponentsetcode.setText(o.getObservationComponentCodeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentsetdataabsentreason = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddcomponent.setDataAbsentReason(observationaddcomponentsetdataabsentreason);


		org.hl7.fhir.r4.model.Coding observationaddcomponentsetdataabsentreasonaddcoding = observationaddcomponentsetdataabsentreason.addCoding();

		/******************** Observation_Component_DataAbsentReason_Coding_Code ********************************************************************************/
		if(o.getObservationComponentDataAbsentReasonCodingCode() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setCode(o.getObservationComponentDataAbsentReasonCodingCode());
		}
		/******************** Observation_Component_DataAbsentReason_Coding_Display ********************************************************************************/
		if(o.getObservationComponentDataAbsentReasonCodingDisplay() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setDisplay(o.getObservationComponentDataAbsentReasonCodingDisplay());
		}
		/******************** Observation_Component_DataAbsentReason_Coding_System ********************************************************************************/
		if(o.getObservationComponentDataAbsentReasonCodingSystem() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setSystem(o.getObservationComponentDataAbsentReasonCodingSystem());
		}
		/******************** Observation_Component_DataAbsentReason_Coding_UserSelected ********************************************************************************/
		if(o.getObservationComponentDataAbsentReasonCodingUserSelected() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationComponentDataAbsentReasonCodingUserSelected()));
		}
		/******************** Observation_Component_DataAbsentReason_Coding_Version ********************************************************************************/
		if(o.getObservationComponentDataAbsentReasonCodingVersion() != null) {
			observationaddcomponentsetdataabsentreasonaddcoding.setVersion(o.getObservationComponentDataAbsentReasonCodingVersion());
		}
		/******************** Observation_Component_DataAbsentReason_Text ********************************************************************************/
		if(o.getObservationComponentDataAbsentReasonText() != null) {
			observationaddcomponentsetdataabsentreason.setText(o.getObservationComponentDataAbsentReasonText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentaddinterpretation = observationaddcomponent.addInterpretation();


		org.hl7.fhir.r4.model.Coding observationaddcomponentaddinterpretationaddcoding = observationaddcomponentaddinterpretation.addCoding();

		/******************** Observation_Component_Interpretation_Coding_Code ********************************************************************************/
		if(o.getObservationComponentInterpretationCodingCode() != null) {
			observationaddcomponentaddinterpretationaddcoding.setCode(o.getObservationComponentInterpretationCodingCode());
		}
		/******************** Observation_Component_Interpretation_Coding_Display ********************************************************************************/
		if(o.getObservationComponentInterpretationCodingDisplay() != null) {
			observationaddcomponentaddinterpretationaddcoding.setDisplay(o.getObservationComponentInterpretationCodingDisplay());
		}
		/******************** Observation_Component_Interpretation_Coding_System ********************************************************************************/
		if(o.getObservationComponentInterpretationCodingSystem() != null) {
			observationaddcomponentaddinterpretationaddcoding.setSystem(o.getObservationComponentInterpretationCodingSystem());
		}
		/******************** Observation_Component_Interpretation_Coding_UserSelected ********************************************************************************/
		if(o.getObservationComponentInterpretationCodingUserSelected() != null) {
			observationaddcomponentaddinterpretationaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationComponentInterpretationCodingUserSelected()));
		}
		/******************** Observation_Component_Interpretation_Coding_Version ********************************************************************************/
		if(o.getObservationComponentInterpretationCodingVersion() != null) {
			observationaddcomponentaddinterpretationaddcoding.setVersion(o.getObservationComponentInterpretationCodingVersion());
		}
		/******************** Observation_Component_Interpretation_Text ********************************************************************************/
		if(o.getObservationComponentInterpretationText() != null) {
			observationaddcomponentaddinterpretation.setText(o.getObservationComponentInterpretationText());
		}

		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationaddcomponentaddreferencerange = observationaddcomponent.addReferenceRange();


		org.hl7.fhir.r4.model.Range observationaddcomponentaddreferencerangesetage = new org.hl7.fhir.r4.model.Range();
		observationaddcomponentaddreferencerange.setAge(observationaddcomponentaddreferencerangesetage);


		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesetagesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerangesetage.setHigh(observationaddcomponentaddreferencerangesetagesethigh);

		/******************** Observation_Component_ReferenceRange_Age_High_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeHighCode() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setCode(o.getObservationComponentReferenceRangeAgeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesetagesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Observation_Component_ReferenceRange_Age_High_Comparator_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeHighComparatorCode() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setComparator(observationaddcomponentaddreferencerangesetagesethighsetcomparatorEnumFactory.fromCode(o.getObservationComponentReferenceRangeAgeHighComparatorCode()));

		}
		/******************** Observation_Component_ReferenceRange_Age_High_System ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeHighSystem() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setSystem(o.getObservationComponentReferenceRangeAgeHighSystem());
		}
		/******************** Observation_Component_ReferenceRange_Age_High_Unit ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeHighUnit() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setUnit(o.getObservationComponentReferenceRangeAgeHighUnit());
		}
		/******************** Observation_Component_ReferenceRange_Age_High_Value ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeHighValue() != null) {
			observationaddcomponentaddreferencerangesetagesethigh.setValue(Double.parseDouble((o.getObservationComponentReferenceRangeAgeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesetagesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerangesetage.setLow(observationaddcomponentaddreferencerangesetagesetlow);

		/******************** Observation_Component_ReferenceRange_Age_Low_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeLowCode() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setCode(o.getObservationComponentReferenceRangeAgeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesetagesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Observation_Component_ReferenceRange_Age_Low_Comparator_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeLowComparatorCode() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setComparator(observationaddcomponentaddreferencerangesetagesetlowsetcomparatorEnumFactory.fromCode(o.getObservationComponentReferenceRangeAgeLowComparatorCode()));

		}
		/******************** Observation_Component_ReferenceRange_Age_Low_System ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeLowSystem() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setSystem(o.getObservationComponentReferenceRangeAgeLowSystem());
		}
		/******************** Observation_Component_ReferenceRange_Age_Low_Unit ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeLowUnit() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setUnit(o.getObservationComponentReferenceRangeAgeLowUnit());
		}
		/******************** Observation_Component_ReferenceRange_Age_Low_Value ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAgeLowValue() != null) {
			observationaddcomponentaddreferencerangesetagesetlow.setValue(Double.parseDouble((o.getObservationComponentReferenceRangeAgeLowValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentaddreferencerangeaddappliesto = observationaddcomponentaddreferencerange.addAppliesTo();


		org.hl7.fhir.r4.model.Coding observationaddcomponentaddreferencerangeaddappliestoaddcoding = observationaddcomponentaddreferencerangeaddappliesto.addCoding();

		/******************** Observation_Component_ReferenceRange_AppliesTo_Coding_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAppliesToCodingCode() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setCode(o.getObservationComponentReferenceRangeAppliesToCodingCode());
		}
		/******************** Observation_Component_ReferenceRange_AppliesTo_Coding_Display ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAppliesToCodingDisplay() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setDisplay(o.getObservationComponentReferenceRangeAppliesToCodingDisplay());
		}
		/******************** Observation_Component_ReferenceRange_AppliesTo_Coding_System ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAppliesToCodingSystem() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setSystem(o.getObservationComponentReferenceRangeAppliesToCodingSystem());
		}
		/******************** Observation_Component_ReferenceRange_AppliesTo_Coding_US ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAppliesToCodingUs() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationComponentReferenceRangeAppliesToCodingUs()));
		}
		/******************** Observation_Component_ReferenceRange_AppliesTo_Coding_Version ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAppliesToCodingVersion() != null) {
			observationaddcomponentaddreferencerangeaddappliestoaddcoding.setVersion(o.getObservationComponentReferenceRangeAppliesToCodingVersion());
		}
		/******************** Observation_Component_ReferenceRange_AppliesTo_Text ********************************************************************************/
		if(o.getObservationComponentReferenceRangeAppliesToText() != null) {
			observationaddcomponentaddreferencerangeaddappliesto.setText(o.getObservationComponentReferenceRangeAppliesToText());
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerange.setHigh(observationaddcomponentaddreferencerangesethigh);

		/******************** Observation_Component_ReferenceRange_High_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeHighCode() != null) {
			observationaddcomponentaddreferencerangesethigh.setCode(o.getObservationComponentReferenceRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Observation_Component_ReferenceRange_High_Comparator_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeHighComparatorCode() != null) {
			observationaddcomponentaddreferencerangesethigh.setComparator(observationaddcomponentaddreferencerangesethighsetcomparatorEnumFactory.fromCode(o.getObservationComponentReferenceRangeHighComparatorCode()));

		}
		/******************** Observation_Component_ReferenceRange_High_System ********************************************************************************/
		if(o.getObservationComponentReferenceRangeHighSystem() != null) {
			observationaddcomponentaddreferencerangesethigh.setSystem(o.getObservationComponentReferenceRangeHighSystem());
		}
		/******************** Observation_Component_ReferenceRange_High_Unit ********************************************************************************/
		if(o.getObservationComponentReferenceRangeHighUnit() != null) {
			observationaddcomponentaddreferencerangesethigh.setUnit(o.getObservationComponentReferenceRangeHighUnit());
		}
		/******************** Observation_Component_ReferenceRange_High_Value ********************************************************************************/
		if(o.getObservationComponentReferenceRangeHighValue() != null) {
			observationaddcomponentaddreferencerangesethigh.setValue(Double.parseDouble((o.getObservationComponentReferenceRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddcomponentaddreferencerangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddcomponentaddreferencerange.setLow(observationaddcomponentaddreferencerangesetlow);

		/******************** Observation_Component_ReferenceRange_Low_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeLowCode() != null) {
			observationaddcomponentaddreferencerangesetlow.setCode(o.getObservationComponentReferenceRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddcomponentaddreferencerangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Observation_Component_ReferenceRange_Low_Comparator_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeLowComparatorCode() != null) {
			observationaddcomponentaddreferencerangesetlow.setComparator(observationaddcomponentaddreferencerangesetlowsetcomparatorEnumFactory.fromCode(o.getObservationComponentReferenceRangeLowComparatorCode()));

		}
		/******************** Observation_Component_ReferenceRange_Low_System ********************************************************************************/
		if(o.getObservationComponentReferenceRangeLowSystem() != null) {
			observationaddcomponentaddreferencerangesetlow.setSystem(o.getObservationComponentReferenceRangeLowSystem());
		}
		/******************** Observation_Component_ReferenceRange_Low_Unit ********************************************************************************/
		if(o.getObservationComponentReferenceRangeLowUnit() != null) {
			observationaddcomponentaddreferencerangesetlow.setUnit(o.getObservationComponentReferenceRangeLowUnit());
		}
		/******************** Observation_Component_ReferenceRange_Low_Value ********************************************************************************/
		if(o.getObservationComponentReferenceRangeLowValue() != null) {
			observationaddcomponentaddreferencerangesetlow.setValue(Double.parseDouble((o.getObservationComponentReferenceRangeLowValue())));
		}
		/******************** Observation_Component_ReferenceRange_Text ********************************************************************************/
		if(o.getObservationComponentReferenceRangeText() != null) {
			observationaddcomponentaddreferencerange.setText(o.getObservationComponentReferenceRangeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddcomponentaddreferencerangesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddcomponentaddreferencerange.setType(observationaddcomponentaddreferencerangesettype);


		org.hl7.fhir.r4.model.Coding observationaddcomponentaddreferencerangesettypeaddcoding = observationaddcomponentaddreferencerangesettype.addCoding();

		/******************** Observation_Component_ReferenceRange_Type_Coding_Code ********************************************************************************/
		if(o.getObservationComponentReferenceRangeTypeCodingCode() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setCode(o.getObservationComponentReferenceRangeTypeCodingCode());
		}
		/******************** Observation_Component_ReferenceRange_Type_Coding_Display ********************************************************************************/
		if(o.getObservationComponentReferenceRangeTypeCodingDisplay() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setDisplay(o.getObservationComponentReferenceRangeTypeCodingDisplay());
		}
		/******************** Observation_Component_ReferenceRange_Type_Coding_System ********************************************************************************/
		if(o.getObservationComponentReferenceRangeTypeCodingSystem() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setSystem(o.getObservationComponentReferenceRangeTypeCodingSystem());
		}
		/******************** Observation_Component_ReferenceRange_Type_Coding_UserSelected ********************************************************************************/
		if(o.getObservationComponentReferenceRangeTypeCodingUserSelected() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationComponentReferenceRangeTypeCodingUserSelected()));
		}
		/******************** Observation_Component_ReferenceRange_Type_Coding_Version ********************************************************************************/
		if(o.getObservationComponentReferenceRangeTypeCodingVersion() != null) {
			observationaddcomponentaddreferencerangesettypeaddcoding.setVersion(o.getObservationComponentReferenceRangeTypeCodingVersion());
		}
		/******************** Observation_Component_ReferenceRange_Type_Text ********************************************************************************/
		if(o.getObservationComponentReferenceRangeTypeText() != null) {
			observationaddcomponentaddreferencerangesettype.setText(o.getObservationComponentReferenceRangeTypeText());
		}
		/******************** Observation_Component_Value ********************************************************************************/
		if(o.getObservationComponentValue() != null) {
			observationaddcomponent.setValue(new org.hl7.fhir.r4.model.StringType(o.getObservationComponentValue()));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetdataabsentreason = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setDataAbsentReason(observationsetdataabsentreason);


		org.hl7.fhir.r4.model.Coding observationsetdataabsentreasonaddcoding = observationsetdataabsentreason.addCoding();

		/******************** Observation_DataAbsentReason_Coding_Code ********************************************************************************/
		if(o.getObservationDataAbsentReasonCodingCode() != null) {
			observationsetdataabsentreasonaddcoding.setCode(o.getObservationDataAbsentReasonCodingCode());
		}
		/******************** Observation_DataAbsentReason_Coding_Display ********************************************************************************/
		if(o.getObservationDataAbsentReasonCodingDisplay() != null) {
			observationsetdataabsentreasonaddcoding.setDisplay(o.getObservationDataAbsentReasonCodingDisplay());
		}
		/******************** Observation_DataAbsentReason_Coding_System ********************************************************************************/
		if(o.getObservationDataAbsentReasonCodingSystem() != null) {
			observationsetdataabsentreasonaddcoding.setSystem(o.getObservationDataAbsentReasonCodingSystem());
		}
		/******************** Observation_DataAbsentReason_Coding_UserSelected ********************************************************************************/
		if(o.getObservationDataAbsentReasonCodingUserSelected() != null) {
			observationsetdataabsentreasonaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationDataAbsentReasonCodingUserSelected()));
		}
		/******************** Observation_DataAbsentReason_Coding_Version ********************************************************************************/
		if(o.getObservationDataAbsentReasonCodingVersion() != null) {
			observationsetdataabsentreasonaddcoding.setVersion(o.getObservationDataAbsentReasonCodingVersion());
		}
		/******************** Observation_DataAbsentReason_Text ********************************************************************************/
		if(o.getObservationDataAbsentReasonText() != null) {
			observationsetdataabsentreason.setText(o.getObservationDataAbsentReasonText());
		}
		/******************** Observation_DerivedFrom ********************************************************************************/
		if(o.getObservationDerivedFrom() != null) {
			org.hl7.fhir.r4.model.Reference ObservationDerivedFromref = new org.hl7.fhir.r4.model.Reference();
			observation.addDerivedFrom(ObservationDerivedFromref.setReference(o.getObservationDerivedFrom()));
		}
		/******************** Observation_Device ********************************************************************************/
		if(o.getObservationDevice() != null) {
			org.hl7.fhir.r4.model.Reference ObservationDeviceref = new org.hl7.fhir.r4.model.Reference();
			observation.setDevice(ObservationDeviceref.setReference(o.getObservationDevice()));
		}
		/******************** Observation_Effective ********************************************************************************/
		if(o.getObservationEffective() != null) {
			observation.setEffective(new org.hl7.fhir.r4.model.StringType(o.getObservationEffective()));
		}
		/******************** Observation_Encounter ********************************************************************************/
		if(o.getObservationEncounter() != null) {
			org.hl7.fhir.r4.model.Reference ObservationEncounterref = new org.hl7.fhir.r4.model.Reference();
			observation.setEncounter(ObservationEncounterref.setReference(o.getObservationEncounter()));
		}
		/******************** Observation_Focus ********************************************************************************/
		if(o.getObservationFocus() != null) {
			org.hl7.fhir.r4.model.Reference ObservationFocusref = new org.hl7.fhir.r4.model.Reference();
			observation.addFocus(ObservationFocusref.setReference(o.getObservationFocus()));
		}
		/******************** Observation_HasMember ********************************************************************************/
		if(o.getObservationHasMember() != null) {
			org.hl7.fhir.r4.model.Reference ObservationHasMemberref = new org.hl7.fhir.r4.model.Reference();
			observation.addHasMember(ObservationHasMemberref.setReference(o.getObservationHasMember()));
		}

		org.hl7.fhir.r4.model.Identifier observationaddidentifier = observation.addIdentifier();

		/******************** Observation_Identifier_Assigner ********************************************************************************/
		if(o.getObservationIdentifierAssigner() != null) {
			org.hl7.fhir.r4.model.Reference ObservationIdentifierAssignerref = new org.hl7.fhir.r4.model.Reference();
			observationaddidentifier.setAssigner(ObservationIdentifierAssignerref.setReference(o.getObservationIdentifierAssigner()));
		}

		org.hl7.fhir.r4.model.Period observationaddidentifiersetperiod = new org.hl7.fhir.r4.model.Period();
		observationaddidentifier.setPeriod(observationaddidentifiersetperiod);

		/******************** Observation_Identifier_Period_End ********************************************************************************/
		if(o.getObservationIdentifierPeriodEnd() != null) {
			java.text.SimpleDateFormat ObservationIdentifierPeriodEndsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObservationIdentifierPeriodEnddate = ObservationIdentifierPeriodEndsdf.parse(o.getObservationIdentifierPeriodEnd());
			observationaddidentifiersetperiod.setEnd(ObservationIdentifierPeriodEnddate);
		}
		/******************** Observation_Identifier_Period_Start ********************************************************************************/
		if(o.getObservationIdentifierPeriodStart() != null) {
			java.text.SimpleDateFormat ObservationIdentifierPeriodStartsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObservationIdentifierPeriodStartdate = ObservationIdentifierPeriodStartsdf.parse(o.getObservationIdentifierPeriodStart());
			observationaddidentifiersetperiod.setStart(ObservationIdentifierPeriodStartdate);
		}
		/******************** Observation_Identifier_System ********************************************************************************/
		if(o.getObservationIdentifierSystem() != null) {
			observationaddidentifier.setSystem(o.getObservationIdentifierSystem());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddidentifiersettype = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddidentifier.setType(observationaddidentifiersettype);


		org.hl7.fhir.r4.model.Coding observationaddidentifiersettypeaddcoding = observationaddidentifiersettype.addCoding();

		/******************** Observation_Identifier_Type_Coding_Code ********************************************************************************/
		if(o.getObservationIdentifierTypeCodingCode() != null) {
			observationaddidentifiersettypeaddcoding.setCode(o.getObservationIdentifierTypeCodingCode());
		}
		/******************** Observation_Identifier_Type_Coding_Display ********************************************************************************/
		if(o.getObservationIdentifierTypeCodingDisplay() != null) {
			observationaddidentifiersettypeaddcoding.setDisplay(o.getObservationIdentifierTypeCodingDisplay());
		}
		/******************** Observation_Identifier_Type_Coding_System ********************************************************************************/
		if(o.getObservationIdentifierTypeCodingSystem() != null) {
			observationaddidentifiersettypeaddcoding.setSystem(o.getObservationIdentifierTypeCodingSystem());
		}
		/******************** Observation_Identifier_Type_Coding_UserSelected ********************************************************************************/
		if(o.getObservationIdentifierTypeCodingUserSelected() != null) {
			observationaddidentifiersettypeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationIdentifierTypeCodingUserSelected()));
		}
		/******************** Observation_Identifier_Type_Coding_Version ********************************************************************************/
		if(o.getObservationIdentifierTypeCodingVersion() != null) {
			observationaddidentifiersettypeaddcoding.setVersion(o.getObservationIdentifierTypeCodingVersion());
		}
		/******************** Observation_Identifier_Type_Text ********************************************************************************/
		if(o.getObservationIdentifierTypeText() != null) {
			observationaddidentifiersettype.setText(o.getObservationIdentifierTypeText());
		}

		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory observationaddidentifiersetuseEnumFactory = new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();

		/******************** Observation_Identifier_Use_Code ********************************************************************************/
		if(o.getObservationIdentifierUseCode() != null) {
			observationaddidentifier.setUse(observationaddidentifiersetuseEnumFactory.fromCode(o.getObservationIdentifierUseCode()));

		}
		/******************** Observation_Identifier_Value ********************************************************************************/
		if(o.getObservationIdentifierValue() != null) {
			observationaddidentifier.setValue(o.getObservationIdentifierValue());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddinterpretation = observation.addInterpretation();


		org.hl7.fhir.r4.model.Coding observationaddinterpretationaddcoding = observationaddinterpretation.addCoding();

		/******************** Observation_Interpretation_Coding_Code ********************************************************************************/
		if(o.getObservationInterpretationCodingCode() != null) {
			observationaddinterpretationaddcoding.setCode(o.getObservationInterpretationCodingCode());
		}
		/******************** Observation_Interpretation_Coding_Display ********************************************************************************/
		if(o.getObservationInterpretationCodingDisplay() != null) {
			observationaddinterpretationaddcoding.setDisplay(o.getObservationInterpretationCodingDisplay());
		}
		/******************** Observation_Interpretation_Coding_System ********************************************************************************/
		if(o.getObservationInterpretationCodingSystem() != null) {
			observationaddinterpretationaddcoding.setSystem(o.getObservationInterpretationCodingSystem());
		}
		/******************** Observation_Interpretation_Coding_UserSelected ********************************************************************************/
		if(o.getObservationInterpretationCodingUserSelected() != null) {
			observationaddinterpretationaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationInterpretationCodingUserSelected()));
		}
		/******************** Observation_Interpretation_Coding_Version ********************************************************************************/
		if(o.getObservationInterpretationCodingVersion() != null) {
			observationaddinterpretationaddcoding.setVersion(o.getObservationInterpretationCodingVersion());
		}
		/******************** Observation_Interpretation_Text ********************************************************************************/
		if(o.getObservationInterpretationText() != null) {
			observationaddinterpretation.setText(o.getObservationInterpretationText());
		}
		/******************** Observation_Issued ********************************************************************************/
		if(o.getObservationIssued() != null) {
			java.text.SimpleDateFormat ObservationIssuedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObservationIssueddate = ObservationIssuedsdf.parse(o.getObservationIssued());
			observation.setIssued(ObservationIssueddate);
		}

		org.hl7.fhir.r4.model.CodeableConcept observationsetmethod = new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setMethod(observationsetmethod);


		org.hl7.fhir.r4.model.Coding observationsetmethodaddcoding = observationsetmethod.addCoding();

		/******************** Observation_Method_Coding_Code ********************************************************************************/
		if(o.getObservationMethodCodingCode() != null) {
			observationsetmethodaddcoding.setCode(o.getObservationMethodCodingCode());
		}
		/******************** Observation_Method_Coding_Display ********************************************************************************/
		if(o.getObservationMethodCodingDisplay() != null) {
			observationsetmethodaddcoding.setDisplay(o.getObservationMethodCodingDisplay());
		}
		/******************** Observation_Method_Coding_System ********************************************************************************/
		if(o.getObservationMethodCodingSystem() != null) {
			observationsetmethodaddcoding.setSystem(o.getObservationMethodCodingSystem());
		}
		/******************** Observation_Method_Coding_UserSelected ********************************************************************************/
		if(o.getObservationMethodCodingUserSelected() != null) {
			observationsetmethodaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationMethodCodingUserSelected()));
		}
		/******************** Observation_Method_Coding_Version ********************************************************************************/
		if(o.getObservationMethodCodingVersion() != null) {
			observationsetmethodaddcoding.setVersion(o.getObservationMethodCodingVersion());
		}
		/******************** Observation_Method_Text ********************************************************************************/
		if(o.getObservationMethodText() != null) {
			observationsetmethod.setText(o.getObservationMethodText());
		}

		org.hl7.fhir.r4.model.Annotation observationaddnote = observation.addNote();

		/******************** Observation_Note_Author ********************************************************************************/
		if(o.getObservationNoteAuthor() != null) {
			observationaddnote.setAuthor(new org.hl7.fhir.r4.model.StringType(o.getObservationNoteAuthor()));
		}
		/******************** Observation_Note_Text ********************************************************************************/
		if(o.getObservationNoteText() != null) {
			observationaddnote.setText(o.getObservationNoteText());
		}
		/******************** Observation_Note_Time ********************************************************************************/
		if(o.getObservationNoteTime() != null) {
			java.text.SimpleDateFormat ObservationNoteTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ObservationNoteTimedate = ObservationNoteTimesdf.parse(o.getObservationNoteTime());
			observationaddnote.setTime(ObservationNoteTimedate);
		}
		/******************** Observation_PartOf ********************************************************************************/
		if(o.getObservationPartOf() != null) {
			org.hl7.fhir.r4.model.Reference ObservationPartOfref = new org.hl7.fhir.r4.model.Reference();
			observation.addPartOf(ObservationPartOfref.setReference(o.getObservationPartOf()));
		}
		/******************** Observation_Performer ********************************************************************************/
		if(o.getObservationPerformer() != null) {
			org.hl7.fhir.r4.model.Reference ObservationPerformerref = new org.hl7.fhir.r4.model.Reference();
			observation.addPerformer(ObservationPerformerref.setReference(o.getObservationPerformer()));
		}

		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationaddreferencerange = observation.addReferenceRange();


		org.hl7.fhir.r4.model.Range observationaddreferencerangesetage = new org.hl7.fhir.r4.model.Range();
		observationaddreferencerange.setAge(observationaddreferencerangesetage);


		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesetagesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerangesetage.setHigh(observationaddreferencerangesetagesethigh);

		/******************** Observation_ReferenceRange_Age_High_Code ********************************************************************************/
		if(o.getObservationReferenceRangeAgeHighCode() != null) {
			observationaddreferencerangesetagesethigh.setCode(o.getObservationReferenceRangeAgeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesetagesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Observation_ReferenceRange_Age_High_Comparator_Code ********************************************************************************/
		if(o.getObservationReferenceRangeAgeHighComparatorCode() != null) {
			observationaddreferencerangesetagesethigh.setComparator(observationaddreferencerangesetagesethighsetcomparatorEnumFactory.fromCode(o.getObservationReferenceRangeAgeHighComparatorCode()));

		}
		/******************** Observation_ReferenceRange_Age_High_System ********************************************************************************/
		if(o.getObservationReferenceRangeAgeHighSystem() != null) {
			observationaddreferencerangesetagesethigh.setSystem(o.getObservationReferenceRangeAgeHighSystem());
		}
		/******************** Observation_ReferenceRange_Age_High_Unit ********************************************************************************/
		if(o.getObservationReferenceRangeAgeHighUnit() != null) {
			observationaddreferencerangesetagesethigh.setUnit(o.getObservationReferenceRangeAgeHighUnit());
		}
		/******************** Observation_ReferenceRange_Age_High_Value ********************************************************************************/
		if(o.getObservationReferenceRangeAgeHighValue() != null) {
			observationaddreferencerangesetagesethigh.setValue(Double.parseDouble((o.getObservationReferenceRangeAgeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesetagesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerangesetage.setLow(observationaddreferencerangesetagesetlow);

		/******************** Observation_ReferenceRange_Age_Low_Code ********************************************************************************/
		if(o.getObservationReferenceRangeAgeLowCode() != null) {
			observationaddreferencerangesetagesetlow.setCode(o.getObservationReferenceRangeAgeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesetagesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Observation_ReferenceRange_Age_Low_Comparator_Code ********************************************************************************/
		if(o.getObservationReferenceRangeAgeLowComparatorCode() != null) {
			observationaddreferencerangesetagesetlow.setComparator(observationaddreferencerangesetagesetlowsetcomparatorEnumFactory.fromCode(o.getObservationReferenceRangeAgeLowComparatorCode()));

		}
		/******************** Observation_ReferenceRange_Age_Low_System ********************************************************************************/
		if(o.getObservationReferenceRangeAgeLowSystem() != null) {
			observationaddreferencerangesetagesetlow.setSystem(o.getObservationReferenceRangeAgeLowSystem());
		}
		/******************** Observation_ReferenceRange_Age_Low_Unit ********************************************************************************/
		if(o.getObservationReferenceRangeAgeLowUnit() != null) {
			observationaddreferencerangesetagesetlow.setUnit(o.getObservationReferenceRangeAgeLowUnit());
		}
		/******************** Observation_ReferenceRange_Age_Low_Value ********************************************************************************/
		if(o.getObservationReferenceRangeAgeLowValue() != null) {
			observationaddreferencerangesetagesetlow.setValue(Double.parseDouble((o.getObservationReferenceRangeAgeLowValue())));
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddreferencerangeaddappliesto = observationaddreferencerange.addAppliesTo();


		org.hl7.fhir.r4.model.Coding observationaddreferencerangeaddappliestoaddcoding = observationaddreferencerangeaddappliesto.addCoding();

		/******************** Observation_ReferenceRange_AppliesTo_Coding_Code ********************************************************************************/
		if(o.getObservationReferenceRangeAppliesToCodingCode() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setCode(o.getObservationReferenceRangeAppliesToCodingCode());
		}
		/******************** Observation_ReferenceRange_AppliesTo_Coding_Display ********************************************************************************/
		if(o.getObservationReferenceRangeAppliesToCodingDisplay() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setDisplay(o.getObservationReferenceRangeAppliesToCodingDisplay());
		}
		/******************** Observation_ReferenceRange_AppliesTo_Coding_System ********************************************************************************/
		if(o.getObservationReferenceRangeAppliesToCodingSystem() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setSystem(o.getObservationReferenceRangeAppliesToCodingSystem());
		}
		/******************** Observation_ReferenceRange_AppliesTo_Coding_UserSelected ********************************************************************************/
		if(o.getObservationReferenceRangeAppliesToCodingUserSelected() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationReferenceRangeAppliesToCodingUserSelected()));
		}
		/******************** Observation_ReferenceRange_AppliesTo_Coding_Version ********************************************************************************/
		if(o.getObservationReferenceRangeAppliesToCodingVersion() != null) {
			observationaddreferencerangeaddappliestoaddcoding.setVersion(o.getObservationReferenceRangeAppliesToCodingVersion());
		}
		/******************** Observation_ReferenceRange_AppliesTo_Text ********************************************************************************/
		if(o.getObservationReferenceRangeAppliesToText() != null) {
			observationaddreferencerangeaddappliesto.setText(o.getObservationReferenceRangeAppliesToText());
		}

		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesethigh = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerange.setHigh(observationaddreferencerangesethigh);

		/******************** Observation_ReferenceRange_High_Code ********************************************************************************/
		if(o.getObservationReferenceRangeHighCode() != null) {
			observationaddreferencerangesethigh.setCode(o.getObservationReferenceRangeHighCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesethighsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Observation_ReferenceRange_High_Comparator_Code ********************************************************************************/
		if(o.getObservationReferenceRangeHighComparatorCode() != null) {
			observationaddreferencerangesethigh.setComparator(observationaddreferencerangesethighsetcomparatorEnumFactory.fromCode(o.getObservationReferenceRangeHighComparatorCode()));

		}
		/******************** Observation_ReferenceRange_High_System ********************************************************************************/
		if(o.getObservationReferenceRangeHighSystem() != null) {
			observationaddreferencerangesethigh.setSystem(o.getObservationReferenceRangeHighSystem());
		}
		/******************** Observation_ReferenceRange_High_Unit ********************************************************************************/
		if(o.getObservationReferenceRangeHighUnit() != null) {
			observationaddreferencerangesethigh.setUnit(o.getObservationReferenceRangeHighUnit());
		}
		/******************** Observation_ReferenceRange_High_Value ********************************************************************************/
		if(o.getObservationReferenceRangeHighValue() != null) {
			observationaddreferencerangesethigh.setValue(Double.parseDouble((o.getObservationReferenceRangeHighValue())));
		}

		org.hl7.fhir.r4.model.Quantity observationaddreferencerangesetlow = new org.hl7.fhir.r4.model.Quantity();
		observationaddreferencerange.setLow(observationaddreferencerangesetlow);

		/******************** Observation_ReferenceRange_Low_Code ********************************************************************************/
		if(o.getObservationReferenceRangeLowCode() != null) {
			observationaddreferencerangesetlow.setCode(o.getObservationReferenceRangeLowCode());
		}

		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationaddreferencerangesetlowsetcomparatorEnumFactory = new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();

		/******************** Observation_ReferenceRange_Low_Comparator_Code ********************************************************************************/
		if(o.getObservationReferenceRangeLowComparatorCode() != null) {
			observationaddreferencerangesetlow.setComparator(observationaddreferencerangesetlowsetcomparatorEnumFactory.fromCode(o.getObservationReferenceRangeLowComparatorCode()));

		}
		/******************** Observation_ReferenceRange_Low_System ********************************************************************************/
		if(o.getObservationReferenceRangeLowSystem() != null) {
			observationaddreferencerangesetlow.setSystem(o.getObservationReferenceRangeLowSystem());
		}
		/******************** Observation_ReferenceRange_Low_Unit ********************************************************************************/
		if(o.getObservationReferenceRangeLowUnit() != null) {
			observationaddreferencerangesetlow.setUnit(o.getObservationReferenceRangeLowUnit());
		}
		/******************** Observation_ReferenceRange_Low_Value ********************************************************************************/
		if(o.getObservationReferenceRangeLowValue() != null) {
			observationaddreferencerangesetlow.setValue(Double.parseDouble((o.getObservationReferenceRangeLowValue())));
		}
		/******************** Observation_ReferenceRange_Text ********************************************************************************/
		if(o.getObservationReferenceRangeText() != null) {
			observationaddreferencerange.setText(o.getObservationReferenceRangeText());
		}

		org.hl7.fhir.r4.model.CodeableConcept observationaddreferencerangesettype = new org.hl7.fhir.r4.model.CodeableConcept();
		observationaddreferencerange.setType(observationaddreferencerangesettype);


		org.hl7.fhir.r4.model.Coding observationaddreferencerangesettypeaddcoding = observationaddreferencerangesettype.addCoding();

		/******************** Observation_ReferenceRange_Type_Coding_Code ********************************************************************************/
		if(o.getObservationReferenceRangeTypeCodingCode() != null) {
			observationaddreferencerangesettypeaddcoding.setCode(o.getObservationReferenceRangeTypeCodingCode());
		}
		/******************** Observation_ReferenceRange_Type_Coding_Display ********************************************************************************/
		if(o.getObservationReferenceRangeTypeCodingDisplay() != null) {
			observationaddreferencerangesettypeaddcoding.setDisplay(o.getObservationReferenceRangeTypeCodingDisplay());
		}
		/******************** Observation_ReferenceRange_Type_Coding_System ********************************************************************************/
		if(o.getObservationReferenceRangeTypeCodingSystem() != null) {
			observationaddreferencerangesettypeaddcoding.setSystem(o.getObservationReferenceRangeTypeCodingSystem());
		}
		/******************** Observation_ReferenceRange_Type_Coding_UserSelected ********************************************************************************/
		if(o.getObservationReferenceRangeTypeCodingUserSelected() != null) {
			observationaddreferencerangesettypeaddcoding.setUserSelected(Boolean.parseBoolean(o.getObservationReferenceRangeTypeCodingUserSelected()));
		}
		/******************** Observation_ReferenceRange_Type_Coding_Version ********************************************************************************/
		if(o.getObservationReferenceRangeTypeCodingVersion() != null) {
			observationaddreferencerangesettypeaddcoding.setVersion(o.getObservationReferenceRangeTypeCodingVersion());
		}
		/******************** Observation_ReferenceRange_Type_Text ********************************************************************************/
		if(o.getObservationReferenceRangeTypeText() != null) {
			observationaddreferencerangesettype.setText(o.getObservationReferenceRangeTypeText());
		}
		/******************** Observation_Specimen ********************************************************************************/
		if(o.getObservationSpecimen() != null) {
			org.hl7.fhir.r4.model.Reference ObservationSpecimenref = new org.hl7.fhir.r4.model.Reference();
			observation.setSpecimen(ObservationSpecimenref.setReference(o.getObservationSpecimen()));
		}

		org.hl7.fhir.r4.model.Observation.ObservationStatusEnumFactory observationsetstatusEnumFactory = new org.hl7.fhir.r4.model.Observation.ObservationStatusEnumFactory();

		/******************** Observation_Status_Code ********************************************************************************/
		if(o.getObservationStatusCode() != null) {
			observation.setStatus(observationsetstatusEnumFactory.fromCode(o.getObservationStatusCode()));

		}
		/******************** Observation_Subject ********************************************************************************/
		if(o.getObservationSubject() != null) {
			org.hl7.fhir.r4.model.Reference ObservationSubjectref = new org.hl7.fhir.r4.model.Reference();
			observation.setSubject(ObservationSubjectref.setReference(o.getObservationSubject()));
		}
		return observation;
	}
}
