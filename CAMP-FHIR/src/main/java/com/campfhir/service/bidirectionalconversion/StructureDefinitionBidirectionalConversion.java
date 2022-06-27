package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.StructureDefinition;
public class StructureDefinitionBidirectionalConversion 
{
	public StructureDefinition StructureDefinitions(org.hl7.fhir.r4.model.StructureDefinition structuredefinition) throws ParseException
	{
		 main.java.com.campfhir.model.StructureDefinition s = new  main.java.com.campfhir.model.StructureDefinition();

		/******************** id ********************************************************************************/
		structuredefinition.setId(s.getId());

		/******************** StrctrDfn_Nm ********************************************************************************/
		if(structuredefinition.hasName()) {
			s.setStrctrDfnNm(String.valueOf(structuredefinition.getName()));
		}
		/******************** StrctrDfn_Typ ********************************************************************************/
		if(structuredefinition.hasType()) {
			s.setStrctrDfnTyp(String.valueOf(structuredefinition.getType()));
		}
		/******************** StrctrDfn_Dt ********************************************************************************/
		if(structuredefinition.hasDate()) {
			s.setStrctrDfnDt(String.valueOf(structuredefinition.getDate()));
		}
		/******************** StrctrDfn_Vrsn ********************************************************************************/
		if(structuredefinition.hasVersion()) {
			s.setStrctrDfnVrsn(String.valueOf(structuredefinition.getVersion()));
		}
		/******************** structuredefinitionfhirversion ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.FHIRVersion structuredefinitionfhirversion = structuredefinition.getFhirVersion();
		s.setStrctrDfnFhirVrsn(structuredefinitionfhirversion.toCode());

		/******************** structuredefinitioncontext ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionContextComponent structuredefinitioncontext = structuredefinition.getContextFirstRep();

		/******************** structuredefinitioncontexttype ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.ExtensionContextType structuredefinitioncontexttype = structuredefinitioncontext.getType();
		s.setStrctrDfnCntxtTyp(structuredefinitioncontexttype.toCode());

		/******************** StrctrDfn_Cntxt_Exprsn ********************************************************************************/
		if(structuredefinitioncontext.hasExpression()) {
			s.setStrctrDfnCntxtExprsn(String.valueOf(structuredefinitioncontext.getExpression()));
		}
		/******************** structuredefinitionmapping ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionMappingComponent structuredefinitionmapping = structuredefinition.getMappingFirstRep();

		/******************** StrctrDfn_Mapping_Nm ********************************************************************************/
		if(structuredefinitionmapping.hasName()) {
			s.setStrctrDfnMappingNm(String.valueOf(structuredefinitionmapping.getName()));
		}
		/******************** StrctrDfn_Mapping_Comment ********************************************************************************/
		if(structuredefinitionmapping.hasComment()) {
			s.setStrctrDfnMappingComment(String.valueOf(structuredefinitionmapping.getComment()));
		}
		/******************** StrctrDfn_Mapping_Identity ********************************************************************************/
		if(structuredefinitionmapping.hasIdentity()) {
			s.setStrctrDfnMappingIdentity(String.valueOf(structuredefinitionmapping.getIdentity()));
		}
		/******************** StrctrDfn_Mapping_Uri ********************************************************************************/
		if(structuredefinitionmapping.hasUri()) {
			s.setStrctrDfnMappingUri(String.valueOf(structuredefinitionmapping.getUri()));
		}
		/******************** StrctrDfn_Abstract ********************************************************************************/
		if(structuredefinition.hasAbstract()) {
			s.setStrctrDfnAbstract(String.valueOf(structuredefinition.getAbstract()));
		}
		/******************** StrctrDfn_BaseDfn ********************************************************************************/
		if(structuredefinition.hasBaseDefinition()) {
			s.setStrctrDfnBaseDfn(String.valueOf(structuredefinition.getBaseDefinition()));
		}
		/******************** structuredefinitionderivation ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.TypeDerivationRule structuredefinitionderivation = structuredefinition.getDerivation();
		s.setStrctrDfnDerivation(structuredefinitionderivation.toCode());

		/******************** structuredefinitiondifferential ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionDifferentialComponent structuredefinitiondifferential = structuredefinition.getDifferential();

		/******************** structuredefinitiondifferentialelement ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition structuredefinitiondifferentialelement = structuredefinitiondifferential.getElementFirstRep();

		/******************** StrctrDfn_Dffntial_Elmnt_Short ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasShort()) {
			s.setStrctrDfnDffntialElmntShort(String.valueOf(structuredefinitiondifferentialelement.getShort()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Dfn ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasDefinition()) {
			s.setStrctrDfnDffntialElmntDfn(String.valueOf(structuredefinitiondifferentialelement.getDefinition()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Path ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasPath()) {
			s.setStrctrDfnDffntialElmntPath(String.valueOf(structuredefinitiondifferentialelement.getPath()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Comment ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasComment()) {
			s.setStrctrDfnDffntialElmntComment(String.valueOf(structuredefinitiondifferentialelement.getComment()));
		}
		/******************** structuredefinitiondifferentialelementbase ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBaseComponent structuredefinitiondifferentialelementbase = structuredefinitiondifferentialelement.getBase();

		/******************** StrctrDfn_Dffntial_Elmnt_Base_Path ********************************************************************************/
		if(structuredefinitiondifferentialelementbase.hasPath()) {
			s.setStrctrDfnDffntialElmntBasePath(String.valueOf(structuredefinitiondifferentialelementbase.getPath()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Base_Min ********************************************************************************/
		if(structuredefinitiondifferentialelementbase.hasMin()) {
			s.setStrctrDfnDffntialElmntBaseMin(String.valueOf(structuredefinitiondifferentialelementbase.getMin()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Base_Mx ********************************************************************************/
		if(structuredefinitiondifferentialelementbase.hasMax()) {
			s.setStrctrDfnDffntialElmntBaseMx(String.valueOf(structuredefinitiondifferentialelementbase.getMax()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlDtTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMinValueDateType()) {
			s.setStrctrDfnDffntialElmntMinVlDtTyp(String.valueOf(structuredefinitiondifferentialelement.getMinValueDateType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlDtTimeTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMinValueDateTimeType()) {
			s.setStrctrDfnDffntialElmntMinVlDtTimeTyp(String.valueOf(structuredefinitiondifferentialelement.getMinValueDateTimeType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlTimeTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMinValueTimeType()) {
			s.setStrctrDfnDffntialElmntMinVlTimeTyp(String.valueOf(structuredefinitiondifferentialelement.getMinValueTimeType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlDecimalTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMinValueDecimalType()) {
			s.setStrctrDfnDffntialElmntMinVlDecimalTyp(String.valueOf(structuredefinitiondifferentialelement.getMinValueDecimalType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MeaningWhenMissing ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMeaningWhenMissing()) {
			s.setStrctrDfnDffntialElmntMeaningWhenMissing(String.valueOf(structuredefinitiondifferentialelement.getMeaningWhenMissing()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlIntegerTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMinValueIntegerType()) {
			s.setStrctrDfnDffntialElmntMinVlIntegerTyp(String.valueOf(structuredefinitiondifferentialelement.getMinValueIntegerType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlInstantTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMinValueInstantType()) {
			s.setStrctrDfnDffntialElmntMinVlInstantTyp(String.valueOf(structuredefinitiondifferentialelement.getMinValueInstantType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_SliceIsConstraining ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasSliceIsConstraining()) {
			s.setStrctrDfnDffntialElmntSliceIsConstraining(String.valueOf(structuredefinitiondifferentialelement.getSliceIsConstraining()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlPositiveIntTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMinValuePositiveIntType()) {
			s.setStrctrDfnDffntialElmntMinVlPositiveIntTyp(String.valueOf(structuredefinitiondifferentialelement.getMinValuePositiveIntType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlPositiveIntTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMaxValuePositiveIntType()) {
			s.setStrctrDfnDffntialElmntMxVlPositiveIntTyp(String.valueOf(structuredefinitiondifferentialelement.getMaxValuePositiveIntType()));
		}
		/******************** structuredefinitiondifferentialelementminvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitiondifferentialelementminvaluequantity = structuredefinitiondifferentialelement.getMinValueQuantity();

		/******************** StrctrDfn_Dffntial_Elmnt_MinVlQnty_Vl ********************************************************************************/
		if(structuredefinitiondifferentialelementminvaluequantity.hasValue()) {
			s.setStrctrDfnDffntialElmntMinVlQntyVl(String.valueOf(structuredefinitiondifferentialelementminvaluequantity.getValue()));
		}
		/******************** structuredefinitiondifferentialelementminvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitiondifferentialelementminvaluequantitycomparator = structuredefinitiondifferentialelementminvaluequantity.getComparator();
		s.setStrctrDfnDffntialElmntMinVlQntyCmprtr(structuredefinitiondifferentialelementminvaluequantitycomparator.toCode());

		/******************** StrctrDfn_Dffntial_Elmnt_MinVlQnty_Cd ********************************************************************************/
		if(structuredefinitiondifferentialelementminvaluequantity.hasCode()) {
			s.setStrctrDfnDffntialElmntMinVlQntyCd(String.valueOf(structuredefinitiondifferentialelementminvaluequantity.getCode()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlQnty_Unt ********************************************************************************/
		if(structuredefinitiondifferentialelementminvaluequantity.hasUnit()) {
			s.setStrctrDfnDffntialElmntMinVlQntyUnt(String.valueOf(structuredefinitiondifferentialelementminvaluequantity.getUnit()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlQnty_Sys ********************************************************************************/
		if(structuredefinitiondifferentialelementminvaluequantity.hasSystem()) {
			s.setStrctrDfnDffntialElmntMinVlQntySys(String.valueOf(structuredefinitiondifferentialelementminvaluequantity.getSystem()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlUnsignedIntTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMaxValueUnsignedIntType()) {
			s.setStrctrDfnDffntialElmntMxVlUnsignedIntTyp(String.valueOf(structuredefinitiondifferentialelement.getMaxValueUnsignedIntType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlUnsignedIntTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMinValueUnsignedIntType()) {
			s.setStrctrDfnDffntialElmntMinVlUnsignedIntTyp(String.valueOf(structuredefinitiondifferentialelement.getMinValueUnsignedIntType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlTimeTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMaxValueTimeType()) {
			s.setStrctrDfnDffntialElmntMxVlTimeTyp(String.valueOf(structuredefinitiondifferentialelement.getMaxValueTimeType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlDecimalTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMaxValueDecimalType()) {
			s.setStrctrDfnDffntialElmntMxVlDecimalTyp(String.valueOf(structuredefinitiondifferentialelement.getMaxValueDecimalType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlIntegerTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMaxValueIntegerType()) {
			s.setStrctrDfnDffntialElmntMxVlIntegerTyp(String.valueOf(structuredefinitiondifferentialelement.getMaxValueIntegerType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlDtTimeTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMaxValueDateTimeType()) {
			s.setStrctrDfnDffntialElmntMxVlDtTimeTyp(String.valueOf(structuredefinitiondifferentialelement.getMaxValueDateTimeType()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlDtTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMaxValueDateType()) {
			s.setStrctrDfnDffntialElmntMxVlDtTyp(String.valueOf(structuredefinitiondifferentialelement.getMaxValueDateType()));
		}
		/******************** structuredefinitiondifferentialelementconstraint ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionConstraintComponent structuredefinitiondifferentialelementconstraint = structuredefinitiondifferentialelement.getConstraintFirstRep();

		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Key ********************************************************************************/
		if(structuredefinitiondifferentialelementconstraint.hasKey()) {
			s.setStrctrDfnDffntialElmntConstraintKey(String.valueOf(structuredefinitiondifferentialelementconstraint.getKey()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Src ********************************************************************************/
		if(structuredefinitiondifferentialelementconstraint.hasSource()) {
			s.setStrctrDfnDffntialElmntConstraintSrc(String.valueOf(structuredefinitiondifferentialelementconstraint.getSource()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Rqrments ********************************************************************************/
		if(structuredefinitiondifferentialelementconstraint.hasRequirements()) {
			s.setStrctrDfnDffntialElmntConstraintRqrments(String.valueOf(structuredefinitiondifferentialelementconstraint.getRequirements()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Human ********************************************************************************/
		if(structuredefinitiondifferentialelementconstraint.hasHuman()) {
			s.setStrctrDfnDffntialElmntConstraintHuman(String.valueOf(structuredefinitiondifferentialelementconstraint.getHuman()));
		}
		/******************** structuredefinitiondifferentialelementconstraintseverity ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ConstraintSeverity structuredefinitiondifferentialelementconstraintseverity = structuredefinitiondifferentialelementconstraint.getSeverity();
		s.setStrctrDfnDffntialElmntConstraintSeverity(structuredefinitiondifferentialelementconstraintseverity.toCode());

		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Exprsn ********************************************************************************/
		if(structuredefinitiondifferentialelementconstraint.hasExpression()) {
			s.setStrctrDfnDffntialElmntConstraintExprsn(String.valueOf(structuredefinitiondifferentialelementconstraint.getExpression()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Xpath ********************************************************************************/
		if(structuredefinitiondifferentialelementconstraint.hasXpath()) {
			s.setStrctrDfnDffntialElmntConstraintXpath(String.valueOf(structuredefinitiondifferentialelementconstraint.getXpath()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlInstantTyp ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMaxValueInstantType()) {
			s.setStrctrDfnDffntialElmntMxVlInstantTyp(String.valueOf(structuredefinitiondifferentialelement.getMaxValueInstantType()));
		}
		/******************** structuredefinitiondifferentialelementmaxvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitiondifferentialelementmaxvaluequantity = structuredefinitiondifferentialelement.getMaxValueQuantity();

		/******************** StrctrDfn_Dffntial_Elmnt_MxVlQnty_Vl ********************************************************************************/
		if(structuredefinitiondifferentialelementmaxvaluequantity.hasValue()) {
			s.setStrctrDfnDffntialElmntMxVlQntyVl(String.valueOf(structuredefinitiondifferentialelementmaxvaluequantity.getValue()));
		}
		/******************** structuredefinitiondifferentialelementmaxvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitiondifferentialelementmaxvaluequantitycomparator = structuredefinitiondifferentialelementmaxvaluequantity.getComparator();
		s.setStrctrDfnDffntialElmntMxVlQntyCmprtr(structuredefinitiondifferentialelementmaxvaluequantitycomparator.toCode());

		/******************** StrctrDfn_Dffntial_Elmnt_MxVlQnty_Cd ********************************************************************************/
		if(structuredefinitiondifferentialelementmaxvaluequantity.hasCode()) {
			s.setStrctrDfnDffntialElmntMxVlQntyCd(String.valueOf(structuredefinitiondifferentialelementmaxvaluequantity.getCode()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlQnty_Unt ********************************************************************************/
		if(structuredefinitiondifferentialelementmaxvaluequantity.hasUnit()) {
			s.setStrctrDfnDffntialElmntMxVlQntyUnt(String.valueOf(structuredefinitiondifferentialelementmaxvaluequantity.getUnit()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlQnty_Sys ********************************************************************************/
		if(structuredefinitiondifferentialelementmaxvaluequantity.hasSystem()) {
			s.setStrctrDfnDffntialElmntMxVlQntySys(String.valueOf(structuredefinitiondifferentialelementmaxvaluequantity.getSystem()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_IsMdfrRsn ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasIsModifierReason()) {
			s.setStrctrDfnDffntialElmntIsMdfrRsn(String.valueOf(structuredefinitiondifferentialelement.getIsModifierReason()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_IsMdfr ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasIsModifier()) {
			s.setStrctrDfnDffntialElmntIsMdfr(String.valueOf(structuredefinitiondifferentialelement.getIsModifier()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_SliceNm ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasSliceName()) {
			s.setStrctrDfnDffntialElmntSliceNm(String.valueOf(structuredefinitiondifferentialelement.getSliceName()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Rqrments ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasRequirements()) {
			s.setStrctrDfnDffntialElmntRqrments(String.valueOf(structuredefinitiondifferentialelement.getRequirements()));
		}
		/******************** structuredefinitiondifferentialelementslicing ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingComponent structuredefinitiondifferentialelementslicing = structuredefinitiondifferentialelement.getSlicing();

		/******************** structuredefinitiondifferentialelementslicingrules ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.SlicingRules structuredefinitiondifferentialelementslicingrules = structuredefinitiondifferentialelementslicing.getRules();
		s.setStrctrDfnDffntialElmntSlicingRules(structuredefinitiondifferentialelementslicingrules.toCode());

		/******************** structuredefinitiondifferentialelementslicingdiscriminator ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingDiscriminatorComponent structuredefinitiondifferentialelementslicingdiscriminator = structuredefinitiondifferentialelementslicing.getDiscriminatorFirstRep();

		/******************** structuredefinitiondifferentialelementslicingdiscriminatortype ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.DiscriminatorType structuredefinitiondifferentialelementslicingdiscriminatortype = structuredefinitiondifferentialelementslicingdiscriminator.getType();
		s.setStrctrDfnDffntialElmntSlicingDiscriminatorTyp(structuredefinitiondifferentialelementslicingdiscriminatortype.toCode());

		/******************** StrctrDfn_Dffntial_Elmnt_Slicing_Discriminator_Path ********************************************************************************/
		if(structuredefinitiondifferentialelementslicingdiscriminator.hasPath()) {
			s.setStrctrDfnDffntialElmntSlicingDiscriminatorPath(String.valueOf(structuredefinitiondifferentialelementslicingdiscriminator.getPath()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Slicing_Ordred ********************************************************************************/
		if(structuredefinitiondifferentialelementslicing.hasOrdered()) {
			s.setStrctrDfnDffntialElmntSlicingOrdred(String.valueOf(structuredefinitiondifferentialelementslicing.getOrdered()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Slicing_Dscrptn ********************************************************************************/
		if(structuredefinitiondifferentialelementslicing.hasDescription()) {
			s.setStrctrDfnDffntialElmntSlicingDscrptn(String.valueOf(structuredefinitiondifferentialelementslicing.getDescription()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_OrdrMeaning ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasOrderMeaning()) {
			s.setStrctrDfnDffntialElmntOrdrMeaning(String.valueOf(structuredefinitiondifferentialelement.getOrderMeaning()));
		}
		/******************** structuredefinitiondifferentialelementexample ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionExampleComponent structuredefinitiondifferentialelementexample = structuredefinitiondifferentialelement.getExampleFirstRep();

		/******************** StrctrDfn_Dffntial_Elmnt_Example_Lbl ********************************************************************************/
		if(structuredefinitiondifferentialelementexample.hasLabel()) {
			s.setStrctrDfnDffntialElmntExampleLbl(String.valueOf(structuredefinitiondifferentialelementexample.getLabel()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxLength ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMaxLength()) {
			s.setStrctrDfnDffntialElmntMxLength(String.valueOf(structuredefinitiondifferentialelement.getMaxLength()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_IsSummary ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasIsSummary()) {
			s.setStrctrDfnDffntialElmntIsSummary(String.valueOf(structuredefinitiondifferentialelement.getIsSummary()));
		}
		/******************** structuredefinitiondifferentialelementmapping ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionMappingComponent structuredefinitiondifferentialelementmapping = structuredefinitiondifferentialelement.getMappingFirstRep();

		/******************** StrctrDfn_Dffntial_Elmnt_Mapping_Lnguage ********************************************************************************/
		if(structuredefinitiondifferentialelementmapping.hasLanguage()) {
			s.setStrctrDfnDffntialElmntMappingLnguage(String.valueOf(structuredefinitiondifferentialelementmapping.getLanguage()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Mapping_Map ********************************************************************************/
		if(structuredefinitiondifferentialelementmapping.hasMap()) {
			s.setStrctrDfnDffntialElmntMappingMap(String.valueOf(structuredefinitiondifferentialelementmapping.getMap()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Mapping_Comment ********************************************************************************/
		if(structuredefinitiondifferentialelementmapping.hasComment()) {
			s.setStrctrDfnDffntialElmntMappingComment(String.valueOf(structuredefinitiondifferentialelementmapping.getComment()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Mapping_Identity ********************************************************************************/
		if(structuredefinitiondifferentialelementmapping.hasIdentity()) {
			s.setStrctrDfnDffntialElmntMappingIdentity(String.valueOf(structuredefinitiondifferentialelementmapping.getIdentity()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MustSupport ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMustSupport()) {
			s.setStrctrDfnDffntialElmntMustSupport(String.valueOf(structuredefinitiondifferentialelement.getMustSupport()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Min ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMin()) {
			s.setStrctrDfnDffntialElmntMin(String.valueOf(structuredefinitiondifferentialelement.getMin()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Mx ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasMax()) {
			s.setStrctrDfnDffntialElmntMx(String.valueOf(structuredefinitiondifferentialelement.getMax()));
		}
		/******************** structuredefinitiondifferentialelementtype ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.TypeRefComponent structuredefinitiondifferentialelementtype = structuredefinitiondifferentialelement.getTypeFirstRep();

		/******************** StrctrDfn_Dffntial_Elmnt_Typ_Cd ********************************************************************************/
		if(structuredefinitiondifferentialelementtype.hasCode()) {
			s.setStrctrDfnDffntialElmntTypCd(String.valueOf(structuredefinitiondifferentialelementtype.getCode()));
		}
		/******************** structuredefinitiondifferentialelementtypeversioning ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ReferenceVersionRules structuredefinitiondifferentialelementtypeversioning = structuredefinitiondifferentialelementtype.getVersioning();
		s.setStrctrDfnDffntialElmntTypVrsning(structuredefinitiondifferentialelementtypeversioning.toCode());

//		/******************** StrctrDfn_Dffntial_Elmnt_Typ_WorkingCd ********************************************************************************/
//		if(structuredefinitiondifferentialelementtype.hasWorkingCode()) {
//			s.setStrctrDfnDffntialElmntTypWorkingCd(String.valueOf(structuredefinitiondifferentialelementtype.getWorkingCode()));
//		}
		/******************** structuredefinitiondifferentialelementbinding ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBindingComponent structuredefinitiondifferentialelementbinding = structuredefinitiondifferentialelement.getBinding();

		/******************** structuredefinitiondifferentialelementbindingstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.BindingStrength structuredefinitiondifferentialelementbindingstrength = structuredefinitiondifferentialelementbinding.getStrength();
		s.setStrctrDfnDffntialElmntBindingStr(structuredefinitiondifferentialelementbindingstrength.toCode());

		/******************** StrctrDfn_Dffntial_Elmnt_Binding_Dscrptn ********************************************************************************/
		if(structuredefinitiondifferentialelementbinding.hasDescription()) {
			s.setStrctrDfnDffntialElmntBindingDscrptn(String.valueOf(structuredefinitiondifferentialelementbinding.getDescription()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Binding_VlSt ********************************************************************************/
		if(structuredefinitiondifferentialelementbinding.hasValueSet()) {
			s.setStrctrDfnDffntialElmntBindingVlSt(String.valueOf(structuredefinitiondifferentialelementbinding.getValueSet()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_CntntRfrnc ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasContentReference()) {
			s.setStrctrDfnDffntialElmntCntntRfrnc(String.valueOf(structuredefinitiondifferentialelement.getContentReference()));
		}
		/******************** structuredefinitiondifferentialelementcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitiondifferentialelementcode = structuredefinitiondifferentialelement.getCodeFirstRep();

		/******************** StrctrDfn_Dffntial_Elmnt_Cd_Vrsn ********************************************************************************/
		if(structuredefinitiondifferentialelementcode.hasVersion()) {
			s.setStrctrDfnDffntialElmntCdVrsn(String.valueOf(structuredefinitiondifferentialelementcode.getVersion()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Cd_Dsply ********************************************************************************/
		if(structuredefinitiondifferentialelementcode.hasDisplay()) {
			s.setStrctrDfnDffntialElmntCdDsply(String.valueOf(structuredefinitiondifferentialelementcode.getDisplay()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Cd_UsrSltd ********************************************************************************/
		if(structuredefinitiondifferentialelementcode.hasUserSelected()) {
			s.setStrctrDfnDffntialElmntCdUsrSltd(String.valueOf(structuredefinitiondifferentialelementcode.getUserSelected()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Cd_Sys ********************************************************************************/
		if(structuredefinitiondifferentialelementcode.hasSystem()) {
			s.setStrctrDfnDffntialElmntCdSys(String.valueOf(structuredefinitiondifferentialelementcode.getSystem()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Lbl ********************************************************************************/
		if(structuredefinitiondifferentialelement.hasLabel()) {
			s.setStrctrDfnDffntialElmntLbl(String.valueOf(structuredefinitiondifferentialelement.getLabel()));
		}
		/******************** structuredefinitionsnapshot ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionSnapshotComponent structuredefinitionsnapshot = structuredefinition.getSnapshot();

		/******************** structuredefinitionsnapshotelement ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition structuredefinitionsnapshotelement = structuredefinitionsnapshot.getElementFirstRep();

		/******************** StrctrDfn_Snpsht_Elmnt_Short ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasShort()) {
			s.setStrctrDfnSnpshtElmntShort(String.valueOf(structuredefinitionsnapshotelement.getShort()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Dfn ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasDefinition()) {
			s.setStrctrDfnSnpshtElmntDfn(String.valueOf(structuredefinitionsnapshotelement.getDefinition()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Path ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasPath()) {
			s.setStrctrDfnSnpshtElmntPath(String.valueOf(structuredefinitionsnapshotelement.getPath()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Comment ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasComment()) {
			s.setStrctrDfnSnpshtElmntComment(String.valueOf(structuredefinitionsnapshotelement.getComment()));
		}
		/******************** structuredefinitionsnapshotelementbase ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBaseComponent structuredefinitionsnapshotelementbase = structuredefinitionsnapshotelement.getBase();

		/******************** StrctrDfn_Snpsht_Elmnt_Base_Path ********************************************************************************/
		if(structuredefinitionsnapshotelementbase.hasPath()) {
			s.setStrctrDfnSnpshtElmntBasePath(String.valueOf(structuredefinitionsnapshotelementbase.getPath()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Base_Min ********************************************************************************/
		if(structuredefinitionsnapshotelementbase.hasMin()) {
			s.setStrctrDfnSnpshtElmntBaseMin(String.valueOf(structuredefinitionsnapshotelementbase.getMin()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Base_Mx ********************************************************************************/
		if(structuredefinitionsnapshotelementbase.hasMax()) {
			s.setStrctrDfnSnpshtElmntBaseMx(String.valueOf(structuredefinitionsnapshotelementbase.getMax()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlDtTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMinValueDateType()) {
			s.setStrctrDfnSnpshtElmntMinVlDtTyp(String.valueOf(structuredefinitionsnapshotelement.getMinValueDateType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlDtTimeTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMinValueDateTimeType()) {
			s.setStrctrDfnSnpshtElmntMinVlDtTimeTyp(String.valueOf(structuredefinitionsnapshotelement.getMinValueDateTimeType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlTimeTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMinValueTimeType()) {
			s.setStrctrDfnSnpshtElmntMinVlTimeTyp(String.valueOf(structuredefinitionsnapshotelement.getMinValueTimeType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlDecimalTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMinValueDecimalType()) {
			s.setStrctrDfnSnpshtElmntMinVlDecimalTyp(String.valueOf(structuredefinitionsnapshotelement.getMinValueDecimalType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MeaningWhenMissing ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMeaningWhenMissing()) {
			s.setStrctrDfnSnpshtElmntMeaningWhenMissing(String.valueOf(structuredefinitionsnapshotelement.getMeaningWhenMissing()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlIntegerTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMinValueIntegerType()) {
			s.setStrctrDfnSnpshtElmntMinVlIntegerTyp(String.valueOf(structuredefinitionsnapshotelement.getMinValueIntegerType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlInstantTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMinValueInstantType()) {
			s.setStrctrDfnSnpshtElmntMinVlInstantTyp(String.valueOf(structuredefinitionsnapshotelement.getMinValueInstantType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_SliceIsConstraining ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasSliceIsConstraining()) {
			s.setStrctrDfnSnpshtElmntSliceIsConstraining(String.valueOf(structuredefinitionsnapshotelement.getSliceIsConstraining()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlPositiveIntTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMinValuePositiveIntType()) {
			s.setStrctrDfnSnpshtElmntMinVlPositiveIntTyp(String.valueOf(structuredefinitionsnapshotelement.getMinValuePositiveIntType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlPositiveIntTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMaxValuePositiveIntType()) {
			s.setStrctrDfnSnpshtElmntMxVlPositiveIntTyp(String.valueOf(structuredefinitionsnapshotelement.getMaxValuePositiveIntType()));
		}
		/******************** structuredefinitionsnapshotelementminvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionsnapshotelementminvaluequantity = structuredefinitionsnapshotelement.getMinValueQuantity();

		/******************** StrctrDfn_Snpsht_Elmnt_MinVlQnty_Vl ********************************************************************************/
		if(structuredefinitionsnapshotelementminvaluequantity.hasValue()) {
			s.setStrctrDfnSnpshtElmntMinVlQntyVl(String.valueOf(structuredefinitionsnapshotelementminvaluequantity.getValue()));
		}
		/******************** structuredefinitionsnapshotelementminvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitionsnapshotelementminvaluequantitycomparator = structuredefinitionsnapshotelementminvaluequantity.getComparator();
		s.setStrctrDfnSnpshtElmntMinVlQntyCmprtr(structuredefinitionsnapshotelementminvaluequantitycomparator.toCode());

		/******************** StrctrDfn_Snpsht_Elmnt_MinVlQnty_Cd ********************************************************************************/
		if(structuredefinitionsnapshotelementminvaluequantity.hasCode()) {
			s.setStrctrDfnSnpshtElmntMinVlQntyCd(String.valueOf(structuredefinitionsnapshotelementminvaluequantity.getCode()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlQnty_Unt ********************************************************************************/
		if(structuredefinitionsnapshotelementminvaluequantity.hasUnit()) {
			s.setStrctrDfnSnpshtElmntMinVlQntyUnt(String.valueOf(structuredefinitionsnapshotelementminvaluequantity.getUnit()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlQnty_Sys ********************************************************************************/
		if(structuredefinitionsnapshotelementminvaluequantity.hasSystem()) {
			s.setStrctrDfnSnpshtElmntMinVlQntySys(String.valueOf(structuredefinitionsnapshotelementminvaluequantity.getSystem()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlUnsignedIntTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMaxValueUnsignedIntType()) {
			s.setStrctrDfnSnpshtElmntMxVlUnsignedIntTyp(String.valueOf(structuredefinitionsnapshotelement.getMaxValueUnsignedIntType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlUnsignedIntTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMinValueUnsignedIntType()) {
			s.setStrctrDfnSnpshtElmntMinVlUnsignedIntTyp(String.valueOf(structuredefinitionsnapshotelement.getMinValueUnsignedIntType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlTimeTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMaxValueTimeType()) {
			s.setStrctrDfnSnpshtElmntMxVlTimeTyp(String.valueOf(structuredefinitionsnapshotelement.getMaxValueTimeType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlDecimalTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMaxValueDecimalType()) {
			s.setStrctrDfnSnpshtElmntMxVlDecimalTyp(String.valueOf(structuredefinitionsnapshotelement.getMaxValueDecimalType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlIntegerTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMaxValueIntegerType()) {
			s.setStrctrDfnSnpshtElmntMxVlIntegerTyp(String.valueOf(structuredefinitionsnapshotelement.getMaxValueIntegerType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlDtTimeTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMaxValueDateTimeType()) {
			s.setStrctrDfnSnpshtElmntMxVlDtTimeTyp(String.valueOf(structuredefinitionsnapshotelement.getMaxValueDateTimeType()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlDtTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMaxValueDateType()) {
			s.setStrctrDfnSnpshtElmntMxVlDtTyp(String.valueOf(structuredefinitionsnapshotelement.getMaxValueDateType()));
		}
		/******************** structuredefinitionsnapshotelementconstraint ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionConstraintComponent structuredefinitionsnapshotelementconstraint = structuredefinitionsnapshotelement.getConstraintFirstRep();

		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Key ********************************************************************************/
		if(structuredefinitionsnapshotelementconstraint.hasKey()) {
			s.setStrctrDfnSnpshtElmntConstraintKey(String.valueOf(structuredefinitionsnapshotelementconstraint.getKey()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Src ********************************************************************************/
		if(structuredefinitionsnapshotelementconstraint.hasSource()) {
			s.setStrctrDfnSnpshtElmntConstraintSrc(String.valueOf(structuredefinitionsnapshotelementconstraint.getSource()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Rqrments ********************************************************************************/
		if(structuredefinitionsnapshotelementconstraint.hasRequirements()) {
			s.setStrctrDfnSnpshtElmntConstraintRqrments(String.valueOf(structuredefinitionsnapshotelementconstraint.getRequirements()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Human ********************************************************************************/
		if(structuredefinitionsnapshotelementconstraint.hasHuman()) {
			s.setStrctrDfnSnpshtElmntConstraintHuman(String.valueOf(structuredefinitionsnapshotelementconstraint.getHuman()));
		}
		/******************** structuredefinitionsnapshotelementconstraintseverity ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ConstraintSeverity structuredefinitionsnapshotelementconstraintseverity = structuredefinitionsnapshotelementconstraint.getSeverity();
		s.setStrctrDfnSnpshtElmntConstraintSeverity(structuredefinitionsnapshotelementconstraintseverity.toCode());

		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Exprsn ********************************************************************************/
		if(structuredefinitionsnapshotelementconstraint.hasExpression()) {
			s.setStrctrDfnSnpshtElmntConstraintExprsn(String.valueOf(structuredefinitionsnapshotelementconstraint.getExpression()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Xpath ********************************************************************************/
		if(structuredefinitionsnapshotelementconstraint.hasXpath()) {
			s.setStrctrDfnSnpshtElmntConstraintXpath(String.valueOf(structuredefinitionsnapshotelementconstraint.getXpath()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlInstantTyp ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMaxValueInstantType()) {
			s.setStrctrDfnSnpshtElmntMxVlInstantTyp(String.valueOf(structuredefinitionsnapshotelement.getMaxValueInstantType()));
		}
		/******************** structuredefinitionsnapshotelementmaxvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionsnapshotelementmaxvaluequantity = structuredefinitionsnapshotelement.getMaxValueQuantity();

		/******************** StrctrDfn_Snpsht_Elmnt_MxVlQnty_Vl ********************************************************************************/
		if(structuredefinitionsnapshotelementmaxvaluequantity.hasValue()) {
			s.setStrctrDfnSnpshtElmntMxVlQntyVl(String.valueOf(structuredefinitionsnapshotelementmaxvaluequantity.getValue()));
		}
		/******************** structuredefinitionsnapshotelementmaxvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitionsnapshotelementmaxvaluequantitycomparator = structuredefinitionsnapshotelementmaxvaluequantity.getComparator();
		s.setStrctrDfnSnpshtElmntMxVlQntyCmprtr(structuredefinitionsnapshotelementmaxvaluequantitycomparator.toCode());

		/******************** StrctrDfn_Snpsht_Elmnt_MxVlQnty_Cd ********************************************************************************/
		if(structuredefinitionsnapshotelementmaxvaluequantity.hasCode()) {
			s.setStrctrDfnSnpshtElmntMxVlQntyCd(String.valueOf(structuredefinitionsnapshotelementmaxvaluequantity.getCode()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlQnty_Unt ********************************************************************************/
		if(structuredefinitionsnapshotelementmaxvaluequantity.hasUnit()) {
			s.setStrctrDfnSnpshtElmntMxVlQntyUnt(String.valueOf(structuredefinitionsnapshotelementmaxvaluequantity.getUnit()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlQnty_Sys ********************************************************************************/
		if(structuredefinitionsnapshotelementmaxvaluequantity.hasSystem()) {
			s.setStrctrDfnSnpshtElmntMxVlQntySys(String.valueOf(structuredefinitionsnapshotelementmaxvaluequantity.getSystem()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_IsMdfrRsn ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasIsModifierReason()) {
			s.setStrctrDfnSnpshtElmntIsMdfrRsn(String.valueOf(structuredefinitionsnapshotelement.getIsModifierReason()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_IsMdfr ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasIsModifier()) {
			s.setStrctrDfnSnpshtElmntIsMdfr(String.valueOf(structuredefinitionsnapshotelement.getIsModifier()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_SliceNm ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasSliceName()) {
			s.setStrctrDfnSnpshtElmntSliceNm(String.valueOf(structuredefinitionsnapshotelement.getSliceName()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Rqrments ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasRequirements()) {
			s.setStrctrDfnSnpshtElmntRqrments(String.valueOf(structuredefinitionsnapshotelement.getRequirements()));
		}
		/******************** structuredefinitionsnapshotelementslicing ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingComponent structuredefinitionsnapshotelementslicing = structuredefinitionsnapshotelement.getSlicing();

		/******************** structuredefinitionsnapshotelementslicingrules ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.SlicingRules structuredefinitionsnapshotelementslicingrules = structuredefinitionsnapshotelementslicing.getRules();
		s.setStrctrDfnSnpshtElmntSlicingRules(structuredefinitionsnapshotelementslicingrules.toCode());

		/******************** structuredefinitionsnapshotelementslicingdiscriminator ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingDiscriminatorComponent structuredefinitionsnapshotelementslicingdiscriminator = structuredefinitionsnapshotelementslicing.getDiscriminatorFirstRep();

		/******************** structuredefinitionsnapshotelementslicingdiscriminatortype ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.DiscriminatorType structuredefinitionsnapshotelementslicingdiscriminatortype = structuredefinitionsnapshotelementslicingdiscriminator.getType();
		s.setStrctrDfnSnpshtElmntSlicingDiscriminatorTyp(structuredefinitionsnapshotelementslicingdiscriminatortype.toCode());

		/******************** StrctrDfn_Snpsht_Elmnt_Slicing_Discriminator_Path ********************************************************************************/
		if(structuredefinitionsnapshotelementslicingdiscriminator.hasPath()) {
			s.setStrctrDfnSnpshtElmntSlicingDiscriminatorPath(String.valueOf(structuredefinitionsnapshotelementslicingdiscriminator.getPath()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Slicing_Ordred ********************************************************************************/
		if(structuredefinitionsnapshotelementslicing.hasOrdered()) {
			s.setStrctrDfnSnpshtElmntSlicingOrdred(String.valueOf(structuredefinitionsnapshotelementslicing.getOrdered()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Slicing_Dscrptn ********************************************************************************/
		if(structuredefinitionsnapshotelementslicing.hasDescription()) {
			s.setStrctrDfnSnpshtElmntSlicingDscrptn(String.valueOf(structuredefinitionsnapshotelementslicing.getDescription()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_OrdrMeaning ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasOrderMeaning()) {
			s.setStrctrDfnSnpshtElmntOrdrMeaning(String.valueOf(structuredefinitionsnapshotelement.getOrderMeaning()));
		}
		/******************** structuredefinitionsnapshotelementexample ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionExampleComponent structuredefinitionsnapshotelementexample = structuredefinitionsnapshotelement.getExampleFirstRep();

		/******************** StrctrDfn_Snpsht_Elmnt_Example_Lbl ********************************************************************************/
		if(structuredefinitionsnapshotelementexample.hasLabel()) {
			s.setStrctrDfnSnpshtElmntExampleLbl(String.valueOf(structuredefinitionsnapshotelementexample.getLabel()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxLength ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMaxLength()) {
			s.setStrctrDfnSnpshtElmntMxLength(String.valueOf(structuredefinitionsnapshotelement.getMaxLength()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_IsSummary ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasIsSummary()) {
			s.setStrctrDfnSnpshtElmntIsSummary(String.valueOf(structuredefinitionsnapshotelement.getIsSummary()));
		}
		/******************** structuredefinitionsnapshotelementmapping ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionMappingComponent structuredefinitionsnapshotelementmapping = structuredefinitionsnapshotelement.getMappingFirstRep();

		/******************** StrctrDfn_Snpsht_Elmnt_Mapping_Lnguage ********************************************************************************/
		if(structuredefinitionsnapshotelementmapping.hasLanguage()) {
			s.setStrctrDfnSnpshtElmntMappingLnguage(String.valueOf(structuredefinitionsnapshotelementmapping.getLanguage()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Mapping_Map ********************************************************************************/
		if(structuredefinitionsnapshotelementmapping.hasMap()) {
			s.setStrctrDfnSnpshtElmntMappingMap(String.valueOf(structuredefinitionsnapshotelementmapping.getMap()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Mapping_Comment ********************************************************************************/
		if(structuredefinitionsnapshotelementmapping.hasComment()) {
			s.setStrctrDfnSnpshtElmntMappingComment(String.valueOf(structuredefinitionsnapshotelementmapping.getComment()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Mapping_Identity ********************************************************************************/
		if(structuredefinitionsnapshotelementmapping.hasIdentity()) {
			s.setStrctrDfnSnpshtElmntMappingIdentity(String.valueOf(structuredefinitionsnapshotelementmapping.getIdentity()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MustSupport ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMustSupport()) {
			s.setStrctrDfnSnpshtElmntMustSupport(String.valueOf(structuredefinitionsnapshotelement.getMustSupport()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Min ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMin()) {
			s.setStrctrDfnSnpshtElmntMin(String.valueOf(structuredefinitionsnapshotelement.getMin()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Mx ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasMax()) {
			s.setStrctrDfnSnpshtElmntMx(String.valueOf(structuredefinitionsnapshotelement.getMax()));
		}
		/******************** structuredefinitionsnapshotelementtype ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.TypeRefComponent structuredefinitionsnapshotelementtype = structuredefinitionsnapshotelement.getTypeFirstRep();

		/******************** StrctrDfn_Snpsht_Elmnt_Typ_Cd ********************************************************************************/
		if(structuredefinitionsnapshotelementtype.hasCode()) {
			s.setStrctrDfnSnpshtElmntTypCd(String.valueOf(structuredefinitionsnapshotelementtype.getCode()));
		}
		/******************** structuredefinitionsnapshotelementtypeversioning ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ReferenceVersionRules structuredefinitionsnapshotelementtypeversioning = structuredefinitionsnapshotelementtype.getVersioning();
		s.setStrctrDfnSnpshtElmntTypVrsning(structuredefinitionsnapshotelementtypeversioning.toCode());

//		/******************** StrctrDfn_Snpsht_Elmnt_Typ_WorkingCd ********************************************************************************/
//		if(structuredefinitionsnapshotelementtype.hasWorkingCode()) {
//			s.setStrctrDfnSnpshtElmntTypWorkingCd(String.valueOf(structuredefinitionsnapshotelementtype.getWorkingCode()));
//		}
		/******************** structuredefinitionsnapshotelementbinding ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBindingComponent structuredefinitionsnapshotelementbinding = structuredefinitionsnapshotelement.getBinding();

		/******************** structuredefinitionsnapshotelementbindingstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.BindingStrength structuredefinitionsnapshotelementbindingstrength = structuredefinitionsnapshotelementbinding.getStrength();
		s.setStrctrDfnSnpshtElmntBindingStr(structuredefinitionsnapshotelementbindingstrength.toCode());

		/******************** StrctrDfn_Snpsht_Elmnt_Binding_Dscrptn ********************************************************************************/
		if(structuredefinitionsnapshotelementbinding.hasDescription()) {
			s.setStrctrDfnSnpshtElmntBindingDscrptn(String.valueOf(structuredefinitionsnapshotelementbinding.getDescription()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Binding_VlSt ********************************************************************************/
		if(structuredefinitionsnapshotelementbinding.hasValueSet()) {
			s.setStrctrDfnSnpshtElmntBindingVlSt(String.valueOf(structuredefinitionsnapshotelementbinding.getValueSet()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_CntntRfrnc ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasContentReference()) {
			s.setStrctrDfnSnpshtElmntCntntRfrnc(String.valueOf(structuredefinitionsnapshotelement.getContentReference()));
		}
		/******************** structuredefinitionsnapshotelementcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionsnapshotelementcode = structuredefinitionsnapshotelement.getCodeFirstRep();

		/******************** StrctrDfn_Snpsht_Elmnt_Cd_Vrsn ********************************************************************************/
		if(structuredefinitionsnapshotelementcode.hasVersion()) {
			s.setStrctrDfnSnpshtElmntCdVrsn(String.valueOf(structuredefinitionsnapshotelementcode.getVersion()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Cd_Dsply ********************************************************************************/
		if(structuredefinitionsnapshotelementcode.hasDisplay()) {
			s.setStrctrDfnSnpshtElmntCdDsply(String.valueOf(structuredefinitionsnapshotelementcode.getDisplay()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Cd_UsrSltd ********************************************************************************/
		if(structuredefinitionsnapshotelementcode.hasUserSelected()) {
			s.setStrctrDfnSnpshtElmntCdUsrSltd(String.valueOf(structuredefinitionsnapshotelementcode.getUserSelected()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Cd_Sys ********************************************************************************/
		if(structuredefinitionsnapshotelementcode.hasSystem()) {
			s.setStrctrDfnSnpshtElmntCdSys(String.valueOf(structuredefinitionsnapshotelementcode.getSystem()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Lbl ********************************************************************************/
		if(structuredefinitionsnapshotelement.hasLabel()) {
			s.setStrctrDfnSnpshtElmntLbl(String.valueOf(structuredefinitionsnapshotelement.getLabel()));
		}
		/******************** StrctrDfn_Ttl ********************************************************************************/
		if(structuredefinition.hasTitle()) {
			s.setStrctrDfnTtl(String.valueOf(structuredefinition.getTitle()));
		}
		/******************** structuredefinitionkeyword ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionkeyword = structuredefinition.getKeywordFirstRep();

		/******************** StrctrDfn_Keyword_Vrsn ********************************************************************************/
		if(structuredefinitionkeyword.hasVersion()) {
			s.setStrctrDfnKeywordVrsn(String.valueOf(structuredefinitionkeyword.getVersion()));
		}
		/******************** StrctrDfn_Keyword_Dsply ********************************************************************************/
		if(structuredefinitionkeyword.hasDisplay()) {
			s.setStrctrDfnKeywordDsply(String.valueOf(structuredefinitionkeyword.getDisplay()));
		}
		/******************** StrctrDfn_Keyword_Cd ********************************************************************************/
		if(structuredefinitionkeyword.hasCode()) {
			s.setStrctrDfnKeywordCd(String.valueOf(structuredefinitionkeyword.getCode()));
		}
		/******************** StrctrDfn_Keyword_UsrSltd ********************************************************************************/
		if(structuredefinitionkeyword.hasUserSelected()) {
			s.setStrctrDfnKeywordUsrSltd(String.valueOf(structuredefinitionkeyword.getUserSelected()));
		}
		/******************** StrctrDfn_Keyword_Sys ********************************************************************************/
		if(structuredefinitionkeyword.hasSystem()) {
			s.setStrctrDfnKeywordSys(String.valueOf(structuredefinitionkeyword.getSystem()));
		}
		/******************** structuredefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus structuredefinitionstatus = structuredefinition.getStatus();
		s.setStrctrDfnSts(structuredefinitionstatus.toCode());

		/******************** StrctrDfn_Dscrptn ********************************************************************************/
		if(structuredefinition.hasDescription()) {
			s.setStrctrDfnDscrptn(String.valueOf(structuredefinition.getDescription()));
		}
		/******************** StrctrDfn_Url ********************************************************************************/
		if(structuredefinition.hasUrl()) {
			s.setStrctrDfnUrl(String.valueOf(structuredefinition.getUrl()));
		}
		/******************** StrctrDfn_Pblshr ********************************************************************************/
		if(structuredefinition.hasPublisher()) {
			s.setStrctrDfnPblshr(String.valueOf(structuredefinition.getPublisher()));
		}
		/******************** StrctrDfn_Exprmtl ********************************************************************************/
		if(structuredefinition.hasExperimental()) {
			s.setStrctrDfnExprmtl(String.valueOf(structuredefinition.getExperimental()));
		}
		/******************** StrctrDfn_Prpse ********************************************************************************/
		if(structuredefinition.hasPurpose()) {
			s.setStrctrDfnPrpse(String.valueOf(structuredefinition.getPurpose()));
		}
		/******************** structuredefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail structuredefinitioncontact = structuredefinition.getContactFirstRep();

		/******************** StrctrDfn_Cntct_Nm ********************************************************************************/
		if(structuredefinitioncontact.hasName()) {
			s.setStrctrDfnCntctNm(String.valueOf(structuredefinitioncontact.getName()));
		}
		/******************** structuredefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint structuredefinitioncontacttelecom = structuredefinitioncontact.getTelecomFirstRep();

		/******************** StrctrDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(structuredefinitioncontacttelecom.hasValue()) {
			s.setStrctrDfnCntctTlcmVl(String.valueOf(structuredefinitioncontacttelecom.getValue()));
		}
		/******************** structuredefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period structuredefinitioncontacttelecomperiod = structuredefinitioncontacttelecom.getPeriod();

		/******************** StrctrDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(structuredefinitioncontacttelecomperiod.hasStart()) {
			s.setStrctrDfnCntctTlcmPrdStrt(String.valueOf(structuredefinitioncontacttelecomperiod.getStart()));
		}
		/******************** StrctrDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(structuredefinitioncontacttelecomperiod.hasEnd()) {
			s.setStrctrDfnCntctTlcmPrdEnd(String.valueOf(structuredefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** structuredefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem structuredefinitioncontacttelecomsystem = structuredefinitioncontacttelecom.getSystem();
		s.setStrctrDfnCntctTlcmSys(structuredefinitioncontacttelecomsystem.toCode());

		/******************** structuredefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse structuredefinitioncontacttelecomuse = structuredefinitioncontacttelecom.getUse();
		s.setStrctrDfnCntctTlcmUse(structuredefinitioncontacttelecomuse.toCode());

		/******************** StrctrDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(structuredefinitioncontacttelecom.hasRank()) {
			s.setStrctrDfnCntctTlcmRnk(String.valueOf(structuredefinitioncontacttelecom.getRank()));
		}
		/******************** structuredefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier structuredefinitionidentifier = structuredefinition.getIdentifierFirstRep();

		/******************** StrctrDfn_Id_Vl ********************************************************************************/
		if(structuredefinitionidentifier.hasValue()) {
			s.setStrctrDfnIdVl(String.valueOf(structuredefinitionidentifier.getValue()));
		}
		/******************** structuredefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept structuredefinitionidentifiertype = structuredefinitionidentifier.getType();

		/******************** StrctrDfn_Id_Typ_Txt ********************************************************************************/
		if(structuredefinitionidentifiertype.hasText()) {
			s.setStrctrDfnIdTypTxt(String.valueOf(structuredefinitionidentifiertype.getText()));
		}
		/******************** structuredefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionidentifiertypecoding = structuredefinitionidentifiertype.getCodingFirstRep();

		/******************** StrctrDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(structuredefinitionidentifiertypecoding.hasVersion()) {
			s.setStrctrDfnIdTypCdgVrsn(String.valueOf(structuredefinitionidentifiertypecoding.getVersion()));
		}
		/******************** StrctrDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(structuredefinitionidentifiertypecoding.hasDisplay()) {
			s.setStrctrDfnIdTypCdgDsply(String.valueOf(structuredefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** StrctrDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(structuredefinitionidentifiertypecoding.hasCode()) {
			s.setStrctrDfnIdTypCdgCd(String.valueOf(structuredefinitionidentifiertypecoding.getCode()));
		}
		/******************** StrctrDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(structuredefinitionidentifiertypecoding.hasUserSelected()) {
			s.setStrctrDfnIdTypCdgUsrSltd(String.valueOf(structuredefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** StrctrDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(structuredefinitionidentifiertypecoding.hasSystem()) {
			s.setStrctrDfnIdTypCdgSys(String.valueOf(structuredefinitionidentifiertypecoding.getSystem()));
		}
		/******************** structuredefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period structuredefinitionidentifierperiod = structuredefinitionidentifier.getPeriod();

		/******************** StrctrDfn_Id_Prd_Strt ********************************************************************************/
		if(structuredefinitionidentifierperiod.hasStart()) {
			s.setStrctrDfnIdPrdStrt(String.valueOf(structuredefinitionidentifierperiod.getStart()));
		}
		/******************** StrctrDfn_Id_Prd_End ********************************************************************************/
		if(structuredefinitionidentifierperiod.hasEnd()) {
			s.setStrctrDfnIdPrdEnd(String.valueOf(structuredefinitionidentifierperiod.getEnd()));
		}
		/******************** StrctrDfn_Id_Assigner ********************************************************************************/
		if(structuredefinitionidentifier.hasAssigner()) {
			s.setStrctrDfnIdAssigner(String.valueOf(structuredefinitionidentifier.getAssigner()));
		}
		/******************** StrctrDfn_Id_Sys ********************************************************************************/
		if(structuredefinitionidentifier.hasSystem()) {
			s.setStrctrDfnIdSys(String.valueOf(structuredefinitionidentifier.getSystem()));
		}
		/******************** structuredefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse structuredefinitionidentifieruse = structuredefinitionidentifier.getUse();
		s.setStrctrDfnIdUse(structuredefinitionidentifieruse.toCode());

		/******************** StrctrDfn_Copyright ********************************************************************************/
		if(structuredefinition.hasCopyright()) {
			s.setStrctrDfnCopyright(String.valueOf(structuredefinition.getCopyright()));
		}
		/******************** structuredefinitionkind ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionKind structuredefinitionkind = structuredefinition.getKind();
		s.setStrctrDfnKind(structuredefinitionkind.toCode());

		/******************** structuredefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext structuredefinitionusecontext = structuredefinition.getUseContextFirstRep();

		/******************** structuredefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionusecontextcode = structuredefinitionusecontext.getCode();

		/******************** StrctrDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(structuredefinitionusecontextcode.hasVersion()) {
			s.setStrctrDfnUseCntxtCdVrsn(String.valueOf(structuredefinitionusecontextcode.getVersion()));
		}
		/******************** StrctrDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(structuredefinitionusecontextcode.hasDisplay()) {
			s.setStrctrDfnUseCntxtCdDsply(String.valueOf(structuredefinitionusecontextcode.getDisplay()));
		}
		/******************** StrctrDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(structuredefinitionusecontextcode.hasUserSelected()) {
			s.setStrctrDfnUseCntxtCdUsrSltd(String.valueOf(structuredefinitionusecontextcode.getUserSelected()));
		}
		/******************** StrctrDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(structuredefinitionusecontextcode.hasSystem()) {
			s.setStrctrDfnUseCntxtCdSys(String.valueOf(structuredefinitionusecontextcode.getSystem()));
		}
		/******************** structuredefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept structuredefinitionusecontextvaluecodeableconcept = structuredefinitionusecontext.getValueCodeableConcept();

		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconcept.hasText()) {
			s.setStrctrDfnUseCntxtVlCdbleCncptTxt(String.valueOf(structuredefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** structuredefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionusecontextvaluecodeableconceptcoding = structuredefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			s.setStrctrDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			s.setStrctrDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			s.setStrctrDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			s.setStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(structuredefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			s.setStrctrDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(structuredefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** structuredefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionusecontextvaluequantity = structuredefinitionusecontext.getValueQuantity();

		/******************** StrctrDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(structuredefinitionusecontextvaluequantity.hasValue()) {
			s.setStrctrDfnUseCntxtVlQntyVl(String.valueOf(structuredefinitionusecontextvaluequantity.getValue()));
		}
		/******************** structuredefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitionusecontextvaluequantitycomparator = structuredefinitionusecontextvaluequantity.getComparator();
		s.setStrctrDfnUseCntxtVlQntyCmprtr(structuredefinitionusecontextvaluequantitycomparator.toCode());

		/******************** StrctrDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(structuredefinitionusecontextvaluequantity.hasCode()) {
			s.setStrctrDfnUseCntxtVlQntyCd(String.valueOf(structuredefinitionusecontextvaluequantity.getCode()));
		}
		/******************** StrctrDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(structuredefinitionusecontextvaluequantity.hasUnit()) {
			s.setStrctrDfnUseCntxtVlQntyUnt(String.valueOf(structuredefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** StrctrDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(structuredefinitionusecontextvaluequantity.hasSystem()) {
			s.setStrctrDfnUseCntxtVlQntySys(String.valueOf(structuredefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** structuredefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range structuredefinitionusecontextvaluerange = structuredefinitionusecontext.getValueRange();

		/******************** structuredefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionusecontextvaluerangelow = structuredefinitionusecontextvaluerange.getLow();

		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(structuredefinitionusecontextvaluerangelow.hasValue()) {
			s.setStrctrDfnUseCntxtVlRngLwVl(String.valueOf(structuredefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** structuredefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitionusecontextvaluerangelowcomparator = structuredefinitionusecontextvaluerangelow.getComparator();
		s.setStrctrDfnUseCntxtVlRngLwCmprtr(structuredefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(structuredefinitionusecontextvaluerangelow.hasCode()) {
			s.setStrctrDfnUseCntxtVlRngLwCd(String.valueOf(structuredefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(structuredefinitionusecontextvaluerangelow.hasUnit()) {
			s.setStrctrDfnUseCntxtVlRngLwUnt(String.valueOf(structuredefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(structuredefinitionusecontextvaluerangelow.hasSystem()) {
			s.setStrctrDfnUseCntxtVlRngLwSys(String.valueOf(structuredefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** structuredefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionusecontextvaluerangehigh = structuredefinitionusecontextvaluerange.getHigh();

		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(structuredefinitionusecontextvaluerangehigh.hasValue()) {
			s.setStrctrDfnUseCntxtVlRngHiVl(String.valueOf(structuredefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** structuredefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator structuredefinitionusecontextvaluerangehighcomparator = structuredefinitionusecontextvaluerangehigh.getComparator();
		s.setStrctrDfnUseCntxtVlRngHiCmprtr(structuredefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(structuredefinitionusecontextvaluerangehigh.hasCode()) {
			s.setStrctrDfnUseCntxtVlRngHiCd(String.valueOf(structuredefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(structuredefinitionusecontextvaluerangehigh.hasUnit()) {
			s.setStrctrDfnUseCntxtVlRngHiUnt(String.valueOf(structuredefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(structuredefinitionusecontextvaluerangehigh.hasSystem()) {
			s.setStrctrDfnUseCntxtVlRngHiSys(String.valueOf(structuredefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** StrctrDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(structuredefinitionusecontext.hasValueReference()) {
			s.setStrctrDfnUseCntxtVlRfrnc(String.valueOf(structuredefinitionusecontext.getValueReference()));
		}
		/******************** structuredefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept structuredefinitionjurisdiction = structuredefinition.getJurisdictionFirstRep();

		/******************** StrctrDfn_Jrsdctn_Txt ********************************************************************************/
		if(structuredefinitionjurisdiction.hasText()) {
			s.setStrctrDfnJrsdctnTxt(String.valueOf(structuredefinitionjurisdiction.getText()));
		}
		/******************** structuredefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionjurisdictioncoding = structuredefinitionjurisdiction.getCodingFirstRep();

		/******************** StrctrDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(structuredefinitionjurisdictioncoding.hasVersion()) {
			s.setStrctrDfnJrsdctnCdgVrsn(String.valueOf(structuredefinitionjurisdictioncoding.getVersion()));
		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(structuredefinitionjurisdictioncoding.hasDisplay()) {
			s.setStrctrDfnJrsdctnCdgDsply(String.valueOf(structuredefinitionjurisdictioncoding.getDisplay()));
		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(structuredefinitionjurisdictioncoding.hasCode()) {
			s.setStrctrDfnJrsdctnCdgCd(String.valueOf(structuredefinitionjurisdictioncoding.getCode()));
		}
		/******************** StrctrDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(structuredefinitionjurisdictioncoding.hasUserSelected()) {
			s.setStrctrDfnJrsdctnCdgUsrSltd(String.valueOf(structuredefinitionjurisdictioncoding.getUserSelected()));
		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(structuredefinitionjurisdictioncoding.hasSystem()) {
			s.setStrctrDfnJrsdctnCdgSys(String.valueOf(structuredefinitionjurisdictioncoding.getSystem()));
		}
		return s;
	}
}
