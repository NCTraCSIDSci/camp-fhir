package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.StructureDefinition;
public class StructureDefinitionConversion 
{
	public org.hl7.fhir.r4.model.StructureDefinition StructureDefinitions(StructureDefinition s) throws ParseException
	{
		org.hl7.fhir.r4.model.StructureDefinition structuredefinition = new org.hl7.fhir.r4.model.StructureDefinition();

		/******************** id ********************************************************************************/
		structuredefinition.setId(s.getId());

		/******************** StrctrDfn_Abstract ********************************************************************************/
		if(s.getStrctrDfnAbstract() != null) {
			structuredefinition.setAbstract(Boolean.parseBoolean(s.getStrctrDfnAbstract()));
		}
		/******************** StrctrDfn_BaseDfn ********************************************************************************/
		if(s.getStrctrDfnBaseDfn() != null) {
			structuredefinition.setBaseDefinition(s.getStrctrDfnBaseDfn());
		}
		/******************** structuredefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail structuredefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		structuredefinition.addContact(structuredefinitioncontact);

		/******************** StrctrDfn_Cntct_Nm ********************************************************************************/
		if(s.getStrctrDfnCntctNm() != null) {
			structuredefinitioncontact.setName(s.getStrctrDfnCntctNm());
		}
		/******************** structuredefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint structuredefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		structuredefinitioncontact.addTelecom(structuredefinitioncontacttelecom);

		/******************** structuredefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period structuredefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		structuredefinitioncontacttelecom.setPeriod(structuredefinitioncontacttelecomperiod);

		/******************** StrctrDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat StrctrDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date StrctrDfn_Cntct_Tlcm_Prd_Enddate = StrctrDfn_Cntct_Tlcm_Prd_Endsdf.parse(s.getStrctrDfnCntctTlcmPrdEnd());
			structuredefinitioncontacttelecomperiod.setEnd(StrctrDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** StrctrDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat StrctrDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date StrctrDfn_Cntct_Tlcm_Prd_Strtdate = StrctrDfn_Cntct_Tlcm_Prd_Strtsdf.parse(s.getStrctrDfnCntctTlcmPrdStrt());
			structuredefinitioncontacttelecomperiod.setStart(StrctrDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** StrctrDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmRnk() != null) {
			structuredefinitioncontacttelecom.setRank(Integer.parseInt(s.getStrctrDfnCntctTlcmRnk()));
		}
		/******************** structuredefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory structuredefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		structuredefinitioncontacttelecom.setSystem(structuredefinitioncontacttelecomsystem.fromCode(s.getStrctrDfnCntctTlcmSys()));

		/******************** structuredefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory structuredefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		structuredefinitioncontacttelecom.setUse(structuredefinitioncontacttelecomuse.fromCode(s.getStrctrDfnCntctTlcmUse()));

		/******************** StrctrDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(s.getStrctrDfnCntctTlcmVl() != null) {
			structuredefinitioncontacttelecom.setValue(s.getStrctrDfnCntctTlcmVl());
		}
		/******************** structuredefinitioncontext ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionContextComponent structuredefinitioncontext =  new org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionContextComponent();
		structuredefinition.addContext(structuredefinitioncontext);

		/******************** StrctrDfn_Cntxt_Exprsn ********************************************************************************/
		if(s.getStrctrDfnCntxtExprsn() != null) {
			structuredefinitioncontext.setExpression(s.getStrctrDfnCntxtExprsn());
		}
		/******************** structuredefinitioncontexttype ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.ExtensionContextTypeEnumFactory structuredefinitioncontexttype =  new org.hl7.fhir.r4.model.StructureDefinition.ExtensionContextTypeEnumFactory();
		structuredefinitioncontext.setType(structuredefinitioncontexttype.fromCode(s.getStrctrDfnCntxtTyp()));

		/******************** StrctrDfn_CntxtInvariant ********************************************************************************/
		if(s.getStrctrDfnCntxtInvariant() != null) {
			structuredefinition.addContextInvariant(s.getStrctrDfnCntxtInvariant());
		}
		/******************** StrctrDfn_Copyright ********************************************************************************/
		if(s.getStrctrDfnCopyright() != null) {
			structuredefinition.setCopyright(s.getStrctrDfnCopyright());
		}
		/******************** StrctrDfn_Dt ********************************************************************************/
		if(s.getStrctrDfnDt() != null) {
			java.text.SimpleDateFormat StrctrDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date StrctrDfn_Dtdate = StrctrDfn_Dtsdf.parse(s.getStrctrDfnDt());
			structuredefinition.setDate(StrctrDfn_Dtdate);
		}
		/******************** structuredefinitionderivation ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.TypeDerivationRuleEnumFactory structuredefinitionderivation =  new org.hl7.fhir.r4.model.StructureDefinition.TypeDerivationRuleEnumFactory();
		structuredefinition.setDerivation(structuredefinitionderivation.fromCode(s.getStrctrDfnDerivation()));

		/******************** StrctrDfn_Dscrptn ********************************************************************************/
		if(s.getStrctrDfnDscrptn() != null) {
			structuredefinition.setDescription(s.getStrctrDfnDscrptn());
		}
		/******************** structuredefinitiondifferential ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionDifferentialComponent structuredefinitiondifferential =  new org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionDifferentialComponent();
		structuredefinition.setDifferential(structuredefinitiondifferential);

		/******************** structuredefinitiondifferentialelement ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition structuredefinitiondifferentialelement =  new org.hl7.fhir.r4.model.ElementDefinition();
		structuredefinitiondifferential.addElement(structuredefinitiondifferentialelement);

		/******************** StrctrDfn_Dffntial_Elmnt_Alias ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntAlias() != null) {
			structuredefinitiondifferentialelement.addAlias(s.getStrctrDfnDffntialElmntAlias());
		}
		/******************** structuredefinitiondifferentialelementbase ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBaseComponent structuredefinitiondifferentialelementbase =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBaseComponent();
		structuredefinitiondifferentialelement.setBase(structuredefinitiondifferentialelementbase);

		/******************** StrctrDfn_Dffntial_Elmnt_Base_Mx ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntBaseMx() != null) {
			structuredefinitiondifferentialelementbase.setMax(s.getStrctrDfnDffntialElmntBaseMx());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Base_Min ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntBaseMin() != null) {
			structuredefinitiondifferentialelementbase.setMin(Integer.parseInt(s.getStrctrDfnDffntialElmntBaseMin()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Base_Path ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntBasePath() != null) {
			structuredefinitiondifferentialelementbase.setPath(s.getStrctrDfnDffntialElmntBasePath());
		}
		/******************** structuredefinitiondifferentialelementbinding ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBindingComponent structuredefinitiondifferentialelementbinding =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBindingComponent();
		structuredefinitiondifferentialelement.setBinding(structuredefinitiondifferentialelementbinding);

		/******************** StrctrDfn_Dffntial_Elmnt_Binding_Dscrptn ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntBindingDscrptn() != null) {
			structuredefinitiondifferentialelementbinding.setDescription(s.getStrctrDfnDffntialElmntBindingDscrptn());
		}
		/******************** structuredefinitiondifferentialelementbindingstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.BindingStrengthEnumFactory structuredefinitiondifferentialelementbindingstrength =  new org.hl7.fhir.r4.model.Enumerations.BindingStrengthEnumFactory();
		structuredefinitiondifferentialelementbinding.setStrength(structuredefinitiondifferentialelementbindingstrength.fromCode(s.getStrctrDfnDffntialElmntBindingStr()));

		/******************** StrctrDfn_Dffntial_Elmnt_Binding_VlSt ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntBindingVlSt() != null) {
			structuredefinitiondifferentialelementbinding.setValueSet(s.getStrctrDfnDffntialElmntBindingVlSt());
		}
		/******************** structuredefinitiondifferentialelementcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitiondifferentialelementcode =  new org.hl7.fhir.r4.model.Coding();
		structuredefinitiondifferentialelement.addCode(structuredefinitiondifferentialelementcode);

		/******************** StrctrDfn_Dffntial_Elmnt_Cd_Cd ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntCdCd() != null) {
			structuredefinitiondifferentialelementcode.setCode(s.getStrctrDfnDffntialElmntCdCd());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Cd_Dsply ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntCdDsply() != null) {
			structuredefinitiondifferentialelementcode.setDisplay(s.getStrctrDfnDffntialElmntCdDsply());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Cd_Sys ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntCdSys() != null) {
			structuredefinitiondifferentialelementcode.setSystem(s.getStrctrDfnDffntialElmntCdSys());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Cd_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntCdUsrSltd() != null) {
			structuredefinitiondifferentialelementcode.setUserSelected(Boolean.parseBoolean(s.getStrctrDfnDffntialElmntCdUsrSltd()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Cd_Vrsn ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntCdVrsn() != null) {
			structuredefinitiondifferentialelementcode.setVersion(s.getStrctrDfnDffntialElmntCdVrsn());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Comment ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntComment() != null) {
			structuredefinitiondifferentialelement.setComment(s.getStrctrDfnDffntialElmntComment());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Cndtn ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntCndtn() != null) {
			structuredefinitiondifferentialelement.addCondition(s.getStrctrDfnDffntialElmntCndtn());
		}
		/******************** structuredefinitiondifferentialelementconstraint ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionConstraintComponent structuredefinitiondifferentialelementconstraint =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionConstraintComponent();
		structuredefinitiondifferentialelement.addConstraint(structuredefinitiondifferentialelementconstraint);

		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Exprsn ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntConstraintExprsn() != null) {
			structuredefinitiondifferentialelementconstraint.setExpression(s.getStrctrDfnDffntialElmntConstraintExprsn());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Human ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntConstraintHuman() != null) {
			structuredefinitiondifferentialelementconstraint.setHuman(s.getStrctrDfnDffntialElmntConstraintHuman());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Key ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntConstraintKey() != null) {
			structuredefinitiondifferentialelementconstraint.setKey(s.getStrctrDfnDffntialElmntConstraintKey());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Rqrments ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntConstraintRqrments() != null) {
			structuredefinitiondifferentialelementconstraint.setRequirements(s.getStrctrDfnDffntialElmntConstraintRqrments());
		}
		/******************** structuredefinitiondifferentialelementconstraintseverity ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ConstraintSeverityEnumFactory structuredefinitiondifferentialelementconstraintseverity =  new org.hl7.fhir.r4.model.ElementDefinition.ConstraintSeverityEnumFactory();
		structuredefinitiondifferentialelementconstraint.setSeverity(structuredefinitiondifferentialelementconstraintseverity.fromCode(s.getStrctrDfnDffntialElmntConstraintSeverity()));

		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Src ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntConstraintSrc() != null) {
			structuredefinitiondifferentialelementconstraint.setSource(s.getStrctrDfnDffntialElmntConstraintSrc());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Constraint_Xpath ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntConstraintXpath() != null) {
			structuredefinitiondifferentialelementconstraint.setXpath(s.getStrctrDfnDffntialElmntConstraintXpath());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_CntntRfrnc ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntCntntRfrnc() != null) {
			structuredefinitiondifferentialelement.setContentReference(s.getStrctrDfnDffntialElmntCntntRfrnc());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Dfn ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntDfn() != null) {
			structuredefinitiondifferentialelement.setDefinition(s.getStrctrDfnDffntialElmntDfn());
		}
		/******************** structuredefinitiondifferentialelementexample ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionExampleComponent structuredefinitiondifferentialelementexample =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionExampleComponent();
		structuredefinitiondifferentialelement.addExample(structuredefinitiondifferentialelementexample);

		/******************** StrctrDfn_Dffntial_Elmnt_Example_Lbl ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntExampleLbl() != null) {
			structuredefinitiondifferentialelementexample.setLabel(s.getStrctrDfnDffntialElmntExampleLbl());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_IsMdfr ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntIsMdfr() != null) {
			structuredefinitiondifferentialelement.setIsModifier(Boolean.parseBoolean(s.getStrctrDfnDffntialElmntIsMdfr()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_IsMdfrRsn ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntIsMdfrRsn() != null) {
			structuredefinitiondifferentialelement.setIsModifierReason(s.getStrctrDfnDffntialElmntIsMdfrRsn());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_IsSummary ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntIsSummary() != null) {
			structuredefinitiondifferentialelement.setIsSummary(Boolean.parseBoolean(s.getStrctrDfnDffntialElmntIsSummary()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Lbl ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntLbl() != null) {
			structuredefinitiondifferentialelement.setLabel(s.getStrctrDfnDffntialElmntLbl());
		}
		/******************** structuredefinitiondifferentialelementmapping ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionMappingComponent structuredefinitiondifferentialelementmapping =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionMappingComponent();
		structuredefinitiondifferentialelement.addMapping(structuredefinitiondifferentialelementmapping);

		/******************** StrctrDfn_Dffntial_Elmnt_Mapping_Comment ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMappingComment() != null) {
			structuredefinitiondifferentialelementmapping.setComment(s.getStrctrDfnDffntialElmntMappingComment());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Mapping_Identity ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMappingIdentity() != null) {
			structuredefinitiondifferentialelementmapping.setIdentity(s.getStrctrDfnDffntialElmntMappingIdentity());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Mapping_Lnguage ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMappingLnguage() != null) {
			structuredefinitiondifferentialelementmapping.setLanguage(s.getStrctrDfnDffntialElmntMappingLnguage());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Mapping_Map ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMappingMap() != null) {
			structuredefinitiondifferentialelementmapping.setMap(s.getStrctrDfnDffntialElmntMappingMap());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Mx ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMx() != null) {
			structuredefinitiondifferentialelement.setMax(s.getStrctrDfnDffntialElmntMx());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxLength ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxLength() != null) {
			structuredefinitiondifferentialelement.setMaxLength(Integer.parseInt(s.getStrctrDfnDffntialElmntMxLength()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlDtTimeTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlDtTimeTyp() != null) {
			structuredefinitiondifferentialelement.setMaxValue( new org.hl7.fhir.r4.model.DateTimeType(s.getStrctrDfnDffntialElmntMxVlDtTimeTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlDtTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlDtTyp() != null) {
			structuredefinitiondifferentialelement.setMaxValue( new org.hl7.fhir.r4.model.DateType(s.getStrctrDfnDffntialElmntMxVlDtTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlDecimalTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlDecimalTyp() != null) {
			structuredefinitiondifferentialelement.setMaxValue( new org.hl7.fhir.r4.model.DecimalType(s.getStrctrDfnDffntialElmntMxVlDecimalTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlInstantTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlInstantTyp() != null) {
			structuredefinitiondifferentialelement.setMaxValue( new org.hl7.fhir.r4.model.InstantType(s.getStrctrDfnDffntialElmntMxVlInstantTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlIntegerTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlIntegerTyp() != null) {
			structuredefinitiondifferentialelement.setMaxValue( new org.hl7.fhir.r4.model.IntegerType(s.getStrctrDfnDffntialElmntMxVlIntegerTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlPositiveIntTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlPositiveIntTyp() != null) {
			structuredefinitiondifferentialelement.setMaxValue( new org.hl7.fhir.r4.model.PositiveIntType(s.getStrctrDfnDffntialElmntMxVlPositiveIntTyp()));
		}
		/******************** structuredefinitiondifferentialelementmaxvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitiondifferentialelementmaxvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		structuredefinitiondifferentialelement.setMaxValue(structuredefinitiondifferentialelementmaxvaluequantity);

		/******************** StrctrDfn_Dffntial_Elmnt_MxVlQnty_Cd ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlQntyCd() != null) {
			structuredefinitiondifferentialelementmaxvaluequantity.setCode(s.getStrctrDfnDffntialElmntMxVlQntyCd());
		}
		/******************** structuredefinitiondifferentialelementmaxvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory structuredefinitiondifferentialelementmaxvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		structuredefinitiondifferentialelementmaxvaluequantity.setComparator(structuredefinitiondifferentialelementmaxvaluequantitycomparator.fromCode(s.getStrctrDfnDffntialElmntMxVlQntyCmprtr()));

		/******************** StrctrDfn_Dffntial_Elmnt_MxVlQnty_Sys ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlQntySys() != null) {
			structuredefinitiondifferentialelementmaxvaluequantity.setSystem(s.getStrctrDfnDffntialElmntMxVlQntySys());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlQnty_Unt ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlQntyUnt() != null) {
			structuredefinitiondifferentialelementmaxvaluequantity.setUnit(s.getStrctrDfnDffntialElmntMxVlQntyUnt());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlQnty_Vl ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlQntyVl() != null) {
			structuredefinitiondifferentialelementmaxvaluequantity.setValue(Double.parseDouble((s.getStrctrDfnDffntialElmntMxVlQntyVl())));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlTimeTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlTimeTyp() != null) {
			structuredefinitiondifferentialelement.setMaxValue( new org.hl7.fhir.r4.model.TimeType(s.getStrctrDfnDffntialElmntMxVlTimeTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MxVlUnsignedIntTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMxVlUnsignedIntTyp() != null) {
			structuredefinitiondifferentialelement.setMaxValue( new org.hl7.fhir.r4.model.UnsignedIntType(s.getStrctrDfnDffntialElmntMxVlUnsignedIntTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MeaningWhenMissing ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMeaningWhenMissing() != null) {
			structuredefinitiondifferentialelement.setMeaningWhenMissing(s.getStrctrDfnDffntialElmntMeaningWhenMissing());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Min ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMin() != null) {
			structuredefinitiondifferentialelement.setMin(Integer.parseInt(s.getStrctrDfnDffntialElmntMin()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlDtTimeTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlDtTimeTyp() != null) {
			structuredefinitiondifferentialelement.setMinValue( new org.hl7.fhir.r4.model.DateTimeType(s.getStrctrDfnDffntialElmntMinVlDtTimeTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlDtTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlDtTyp() != null) {
			structuredefinitiondifferentialelement.setMinValue( new org.hl7.fhir.r4.model.DateType(s.getStrctrDfnDffntialElmntMinVlDtTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlDecimalTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlDecimalTyp() != null) {
			structuredefinitiondifferentialelement.setMinValue( new org.hl7.fhir.r4.model.DecimalType(s.getStrctrDfnDffntialElmntMinVlDecimalTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlInstantTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlInstantTyp() != null) {
			structuredefinitiondifferentialelement.setMinValue( new org.hl7.fhir.r4.model.InstantType(s.getStrctrDfnDffntialElmntMinVlInstantTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlIntegerTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlIntegerTyp() != null) {
			structuredefinitiondifferentialelement.setMinValue( new org.hl7.fhir.r4.model.IntegerType(s.getStrctrDfnDffntialElmntMinVlIntegerTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlPositiveIntTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlPositiveIntTyp() != null) {
			structuredefinitiondifferentialelement.setMinValue( new org.hl7.fhir.r4.model.PositiveIntType(s.getStrctrDfnDffntialElmntMinVlPositiveIntTyp()));
		}
		/******************** structuredefinitiondifferentialelementminvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitiondifferentialelementminvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		structuredefinitiondifferentialelement.setMinValue(structuredefinitiondifferentialelementminvaluequantity);

		/******************** StrctrDfn_Dffntial_Elmnt_MinVlQnty_Cd ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlQntyCd() != null) {
			structuredefinitiondifferentialelementminvaluequantity.setCode(s.getStrctrDfnDffntialElmntMinVlQntyCd());
		}
		/******************** structuredefinitiondifferentialelementminvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory structuredefinitiondifferentialelementminvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		structuredefinitiondifferentialelementminvaluequantity.setComparator(structuredefinitiondifferentialelementminvaluequantitycomparator.fromCode(s.getStrctrDfnDffntialElmntMinVlQntyCmprtr()));

		/******************** StrctrDfn_Dffntial_Elmnt_MinVlQnty_Sys ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlQntySys() != null) {
			structuredefinitiondifferentialelementminvaluequantity.setSystem(s.getStrctrDfnDffntialElmntMinVlQntySys());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlQnty_Unt ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlQntyUnt() != null) {
			structuredefinitiondifferentialelementminvaluequantity.setUnit(s.getStrctrDfnDffntialElmntMinVlQntyUnt());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlQnty_Vl ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlQntyVl() != null) {
			structuredefinitiondifferentialelementminvaluequantity.setValue(Double.parseDouble((s.getStrctrDfnDffntialElmntMinVlQntyVl())));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlTimeTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlTimeTyp() != null) {
			structuredefinitiondifferentialelement.setMinValue( new org.hl7.fhir.r4.model.TimeType(s.getStrctrDfnDffntialElmntMinVlTimeTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MinVlUnsignedIntTyp ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMinVlUnsignedIntTyp() != null) {
			structuredefinitiondifferentialelement.setMinValue( new org.hl7.fhir.r4.model.UnsignedIntType(s.getStrctrDfnDffntialElmntMinVlUnsignedIntTyp()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_MustSupport ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntMustSupport() != null) {
			structuredefinitiondifferentialelement.setMustSupport(Boolean.parseBoolean(s.getStrctrDfnDffntialElmntMustSupport()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_OrdrMeaning ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntOrdrMeaning() != null) {
			structuredefinitiondifferentialelement.setOrderMeaning(s.getStrctrDfnDffntialElmntOrdrMeaning());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Path ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntPath() != null) {
			structuredefinitiondifferentialelement.setPath(s.getStrctrDfnDffntialElmntPath());
		}
		/******************** structuredefinitiondifferentialelementrepresentation ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.PropertyRepresentationEnumFactory structuredefinitiondifferentialelementrepresentation =  new org.hl7.fhir.r4.model.ElementDefinition.PropertyRepresentationEnumFactory();
		structuredefinitiondifferentialelement.addRepresentation(structuredefinitiondifferentialelementrepresentation.fromCode(s.getStrctrDfnDffntialElmntRepresentation()));

		/******************** StrctrDfn_Dffntial_Elmnt_Rqrments ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntRqrments() != null) {
			structuredefinitiondifferentialelement.setRequirements(s.getStrctrDfnDffntialElmntRqrments());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Short ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntShort() != null) {
			structuredefinitiondifferentialelement.setShort(s.getStrctrDfnDffntialElmntShort());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_SliceIsConstraining ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntSliceIsConstraining() != null) {
			structuredefinitiondifferentialelement.setSliceIsConstraining(Boolean.parseBoolean(s.getStrctrDfnDffntialElmntSliceIsConstraining()));
		}
		/******************** StrctrDfn_Dffntial_Elmnt_SliceNm ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntSliceNm() != null) {
			structuredefinitiondifferentialelement.setSliceName(s.getStrctrDfnDffntialElmntSliceNm());
		}
		/******************** structuredefinitiondifferentialelementslicing ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingComponent structuredefinitiondifferentialelementslicing =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingComponent();
		structuredefinitiondifferentialelement.setSlicing(structuredefinitiondifferentialelementslicing);

		/******************** StrctrDfn_Dffntial_Elmnt_Slicing_Dscrptn ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntSlicingDscrptn() != null) {
			structuredefinitiondifferentialelementslicing.setDescription(s.getStrctrDfnDffntialElmntSlicingDscrptn());
		}
		/******************** structuredefinitiondifferentialelementslicingdiscriminator ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingDiscriminatorComponent structuredefinitiondifferentialelementslicingdiscriminator =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingDiscriminatorComponent();
		structuredefinitiondifferentialelementslicing.addDiscriminator(structuredefinitiondifferentialelementslicingdiscriminator);

		/******************** StrctrDfn_Dffntial_Elmnt_Slicing_Discriminator_Path ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntSlicingDiscriminatorPath() != null) {
			structuredefinitiondifferentialelementslicingdiscriminator.setPath(s.getStrctrDfnDffntialElmntSlicingDiscriminatorPath());
		}
		/******************** structuredefinitiondifferentialelementslicingdiscriminatortype ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.DiscriminatorTypeEnumFactory structuredefinitiondifferentialelementslicingdiscriminatortype =  new org.hl7.fhir.r4.model.ElementDefinition.DiscriminatorTypeEnumFactory();
		structuredefinitiondifferentialelementslicingdiscriminator.setType(structuredefinitiondifferentialelementslicingdiscriminatortype.fromCode(s.getStrctrDfnDffntialElmntSlicingDiscriminatorTyp()));

		/******************** StrctrDfn_Dffntial_Elmnt_Slicing_Ordred ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntSlicingOrdred() != null) {
			structuredefinitiondifferentialelementslicing.setOrdered(Boolean.parseBoolean(s.getStrctrDfnDffntialElmntSlicingOrdred()));
		}
		/******************** structuredefinitiondifferentialelementslicingrules ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.SlicingRulesEnumFactory structuredefinitiondifferentialelementslicingrules =  new org.hl7.fhir.r4.model.ElementDefinition.SlicingRulesEnumFactory();
		structuredefinitiondifferentialelementslicing.setRules(structuredefinitiondifferentialelementslicingrules.fromCode(s.getStrctrDfnDffntialElmntSlicingRules()));

		/******************** structuredefinitiondifferentialelementtype ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.TypeRefComponent structuredefinitiondifferentialelementtype =  new org.hl7.fhir.r4.model.ElementDefinition.TypeRefComponent();
		structuredefinitiondifferentialelement.addType(structuredefinitiondifferentialelementtype);

		/******************** structuredefinitiondifferentialelementtypeaggregation ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.AggregationModeEnumFactory structuredefinitiondifferentialelementtypeaggregation =  new org.hl7.fhir.r4.model.ElementDefinition.AggregationModeEnumFactory();
		structuredefinitiondifferentialelementtype.addAggregation(structuredefinitiondifferentialelementtypeaggregation.fromCode(s.getStrctrDfnDffntialElmntTypAggregation()));

		/******************** StrctrDfn_Dffntial_Elmnt_Typ_Cd ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntTypCd() != null) {
			structuredefinitiondifferentialelementtype.setCode(s.getStrctrDfnDffntialElmntTypCd());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Typ_Profile ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntTypProfile() != null) {
			structuredefinitiondifferentialelementtype.addProfile(s.getStrctrDfnDffntialElmntTypProfile());
		}
		/******************** StrctrDfn_Dffntial_Elmnt_Typ_TarProfile ********************************************************************************/
		if(s.getStrctrDfnDffntialElmntTypTarProfile() != null) {
			structuredefinitiondifferentialelementtype.addTargetProfile(s.getStrctrDfnDffntialElmntTypTarProfile());
		}
		/******************** structuredefinitiondifferentialelementtypeversioning ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ReferenceVersionRulesEnumFactory structuredefinitiondifferentialelementtypeversioning =  new org.hl7.fhir.r4.model.ElementDefinition.ReferenceVersionRulesEnumFactory();
		structuredefinitiondifferentialelementtype.setVersioning(structuredefinitiondifferentialelementtypeversioning.fromCode(s.getStrctrDfnDffntialElmntTypVrsning()));

		/******************** StrctrDfn_Exprmtl ********************************************************************************/
		if(s.getStrctrDfnExprmtl() != null) {
			structuredefinition.setExperimental(Boolean.parseBoolean(s.getStrctrDfnExprmtl()));
		}
		/******************** structuredefinitionfhirversion ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.FHIRVersionEnumFactory structuredefinitionfhirversion =  new org.hl7.fhir.r4.model.Enumerations.FHIRVersionEnumFactory();
		structuredefinition.setFhirVersion(structuredefinitionfhirversion.fromCode(s.getStrctrDfnFhirVrsn()));

		/******************** structuredefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier structuredefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		structuredefinition.addIdentifier(structuredefinitionidentifier);

		/******************** StrctrDfn_Id_Assigner ********************************************************************************/
		if(s.getStrctrDfnIdAssigner() != null) {
			structuredefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getStrctrDfnIdAssigner()));
		}
		/******************** structuredefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period structuredefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		structuredefinitionidentifier.setPeriod(structuredefinitionidentifierperiod);

		/******************** StrctrDfn_Id_Prd_End ********************************************************************************/
		if(s.getStrctrDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat StrctrDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date StrctrDfn_Id_Prd_Enddate = StrctrDfn_Id_Prd_Endsdf.parse(s.getStrctrDfnIdPrdEnd());
			structuredefinitionidentifierperiod.setEnd(StrctrDfn_Id_Prd_Enddate);
		}
		/******************** StrctrDfn_Id_Prd_Strt ********************************************************************************/
		if(s.getStrctrDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat StrctrDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date StrctrDfn_Id_Prd_Strtdate = StrctrDfn_Id_Prd_Strtsdf.parse(s.getStrctrDfnIdPrdStrt());
			structuredefinitionidentifierperiod.setStart(StrctrDfn_Id_Prd_Strtdate);
		}
		/******************** StrctrDfn_Id_Sys ********************************************************************************/
		if(s.getStrctrDfnIdSys() != null) {
			structuredefinitionidentifier.setSystem(s.getStrctrDfnIdSys());
		}
		/******************** structuredefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept structuredefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		structuredefinitionidentifier.setType(structuredefinitionidentifiertype);

		/******************** structuredefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		structuredefinitionidentifiertype.addCoding(structuredefinitionidentifiertypecoding);

		/******************** StrctrDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgCd() != null) {
			structuredefinitionidentifiertypecoding.setCode(s.getStrctrDfnIdTypCdgCd());
		}
		/******************** StrctrDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgDsply() != null) {
			structuredefinitionidentifiertypecoding.setDisplay(s.getStrctrDfnIdTypCdgDsply());
		}
		/******************** StrctrDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgSys() != null) {
			structuredefinitionidentifiertypecoding.setSystem(s.getStrctrDfnIdTypCdgSys());
		}
		/******************** StrctrDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgUsrSltd() != null) {
			structuredefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getStrctrDfnIdTypCdgUsrSltd()));
		}
		/******************** StrctrDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getStrctrDfnIdTypCdgVrsn() != null) {
			structuredefinitionidentifiertypecoding.setVersion(s.getStrctrDfnIdTypCdgVrsn());
		}
		/******************** StrctrDfn_Id_Typ_Txt ********************************************************************************/
		if(s.getStrctrDfnIdTypTxt() != null) {
			structuredefinitionidentifiertype.setText(s.getStrctrDfnIdTypTxt());
		}
		/******************** structuredefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory structuredefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		structuredefinitionidentifier.setUse(structuredefinitionidentifieruse.fromCode(s.getStrctrDfnIdUse()));

		/******************** StrctrDfn_Id_Vl ********************************************************************************/
		if(s.getStrctrDfnIdVl() != null) {
			structuredefinitionidentifier.setValue(s.getStrctrDfnIdVl());
		}
		/******************** structuredefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept structuredefinitionjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		structuredefinition.addJurisdiction(structuredefinitionjurisdiction);

		/******************** structuredefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		structuredefinitionjurisdiction.addCoding(structuredefinitionjurisdictioncoding);

		/******************** StrctrDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgCd() != null) {
			structuredefinitionjurisdictioncoding.setCode(s.getStrctrDfnJrsdctnCdgCd());
		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgDsply() != null) {
			structuredefinitionjurisdictioncoding.setDisplay(s.getStrctrDfnJrsdctnCdgDsply());
		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgSys() != null) {
			structuredefinitionjurisdictioncoding.setSystem(s.getStrctrDfnJrsdctnCdgSys());
		}
		/******************** StrctrDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgUsrSltd() != null) {
			structuredefinitionjurisdictioncoding.setUserSelected(Boolean.parseBoolean(s.getStrctrDfnJrsdctnCdgUsrSltd()));
		}
		/******************** StrctrDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(s.getStrctrDfnJrsdctnCdgVrsn() != null) {
			structuredefinitionjurisdictioncoding.setVersion(s.getStrctrDfnJrsdctnCdgVrsn());
		}
		/******************** StrctrDfn_Jrsdctn_Txt ********************************************************************************/
		if(s.getStrctrDfnJrsdctnTxt() != null) {
			structuredefinitionjurisdiction.setText(s.getStrctrDfnJrsdctnTxt());
		}
		/******************** structuredefinitionkeyword ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionkeyword =  new org.hl7.fhir.r4.model.Coding();
		structuredefinition.addKeyword(structuredefinitionkeyword);

		/******************** StrctrDfn_Keyword_Cd ********************************************************************************/
		if(s.getStrctrDfnKeywordCd() != null) {
			structuredefinitionkeyword.setCode(s.getStrctrDfnKeywordCd());
		}
		/******************** StrctrDfn_Keyword_Dsply ********************************************************************************/
		if(s.getStrctrDfnKeywordDsply() != null) {
			structuredefinitionkeyword.setDisplay(s.getStrctrDfnKeywordDsply());
		}
		/******************** StrctrDfn_Keyword_Sys ********************************************************************************/
		if(s.getStrctrDfnKeywordSys() != null) {
			structuredefinitionkeyword.setSystem(s.getStrctrDfnKeywordSys());
		}
		/******************** StrctrDfn_Keyword_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnKeywordUsrSltd() != null) {
			structuredefinitionkeyword.setUserSelected(Boolean.parseBoolean(s.getStrctrDfnKeywordUsrSltd()));
		}
		/******************** StrctrDfn_Keyword_Vrsn ********************************************************************************/
		if(s.getStrctrDfnKeywordVrsn() != null) {
			structuredefinitionkeyword.setVersion(s.getStrctrDfnKeywordVrsn());
		}
		/******************** structuredefinitionkind ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionKindEnumFactory structuredefinitionkind =  new org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionKindEnumFactory();
		structuredefinition.setKind(structuredefinitionkind.fromCode(s.getStrctrDfnKind()));

		/******************** structuredefinitionmapping ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionMappingComponent structuredefinitionmapping =  new org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionMappingComponent();
		structuredefinition.addMapping(structuredefinitionmapping);

		/******************** StrctrDfn_Mapping_Comment ********************************************************************************/
		if(s.getStrctrDfnMappingComment() != null) {
			structuredefinitionmapping.setComment(s.getStrctrDfnMappingComment());
		}
		/******************** StrctrDfn_Mapping_Identity ********************************************************************************/
		if(s.getStrctrDfnMappingIdentity() != null) {
			structuredefinitionmapping.setIdentity(s.getStrctrDfnMappingIdentity());
		}
		/******************** StrctrDfn_Mapping_Nm ********************************************************************************/
		if(s.getStrctrDfnMappingNm() != null) {
			structuredefinitionmapping.setName(s.getStrctrDfnMappingNm());
		}
		/******************** StrctrDfn_Mapping_Uri ********************************************************************************/
		if(s.getStrctrDfnMappingUri() != null) {
			structuredefinitionmapping.setUri(s.getStrctrDfnMappingUri());
		}
		/******************** StrctrDfn_Nm ********************************************************************************/
		if(s.getStrctrDfnNm() != null) {
			structuredefinition.setName(s.getStrctrDfnNm());
		}
		/******************** StrctrDfn_Pblshr ********************************************************************************/
		if(s.getStrctrDfnPblshr() != null) {
			structuredefinition.setPublisher(s.getStrctrDfnPblshr());
		}
		/******************** StrctrDfn_Prpse ********************************************************************************/
		if(s.getStrctrDfnPrpse() != null) {
			structuredefinition.setPurpose(s.getStrctrDfnPrpse());
		}
		/******************** structuredefinitionsnapshot ********************************************************************************/
		org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionSnapshotComponent structuredefinitionsnapshot =  new org.hl7.fhir.r4.model.StructureDefinition.StructureDefinitionSnapshotComponent();
		structuredefinition.setSnapshot(structuredefinitionsnapshot);

		/******************** structuredefinitionsnapshotelement ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition structuredefinitionsnapshotelement =  new org.hl7.fhir.r4.model.ElementDefinition();
		structuredefinitionsnapshot.addElement(structuredefinitionsnapshotelement);

		/******************** StrctrDfn_Snpsht_Elmnt_Alias ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntAlias() != null) {
			structuredefinitionsnapshotelement.addAlias(s.getStrctrDfnSnpshtElmntAlias());
		}
		/******************** structuredefinitionsnapshotelementbase ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBaseComponent structuredefinitionsnapshotelementbase =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBaseComponent();
		structuredefinitionsnapshotelement.setBase(structuredefinitionsnapshotelementbase);

		/******************** StrctrDfn_Snpsht_Elmnt_Base_Mx ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntBaseMx() != null) {
			structuredefinitionsnapshotelementbase.setMax(s.getStrctrDfnSnpshtElmntBaseMx());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Base_Min ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntBaseMin() != null) {
			structuredefinitionsnapshotelementbase.setMin(Integer.parseInt(s.getStrctrDfnSnpshtElmntBaseMin()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Base_Path ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntBasePath() != null) {
			structuredefinitionsnapshotelementbase.setPath(s.getStrctrDfnSnpshtElmntBasePath());
		}
		/******************** structuredefinitionsnapshotelementbinding ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBindingComponent structuredefinitionsnapshotelementbinding =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionBindingComponent();
		structuredefinitionsnapshotelement.setBinding(structuredefinitionsnapshotelementbinding);

		/******************** StrctrDfn_Snpsht_Elmnt_Binding_Dscrptn ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntBindingDscrptn() != null) {
			structuredefinitionsnapshotelementbinding.setDescription(s.getStrctrDfnSnpshtElmntBindingDscrptn());
		}
		/******************** structuredefinitionsnapshotelementbindingstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.BindingStrengthEnumFactory structuredefinitionsnapshotelementbindingstrength =  new org.hl7.fhir.r4.model.Enumerations.BindingStrengthEnumFactory();
		structuredefinitionsnapshotelementbinding.setStrength(structuredefinitionsnapshotelementbindingstrength.fromCode(s.getStrctrDfnSnpshtElmntBindingStr()));

		/******************** StrctrDfn_Snpsht_Elmnt_Binding_VlSt ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntBindingVlSt() != null) {
			structuredefinitionsnapshotelementbinding.setValueSet(s.getStrctrDfnSnpshtElmntBindingVlSt());
		}
		/******************** structuredefinitionsnapshotelementcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionsnapshotelementcode =  new org.hl7.fhir.r4.model.Coding();
		structuredefinitionsnapshotelement.addCode(structuredefinitionsnapshotelementcode);

		/******************** StrctrDfn_Snpsht_Elmnt_Cd_Cd ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntCdCd() != null) {
			structuredefinitionsnapshotelementcode.setCode(s.getStrctrDfnSnpshtElmntCdCd());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Cd_Dsply ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntCdDsply() != null) {
			structuredefinitionsnapshotelementcode.setDisplay(s.getStrctrDfnSnpshtElmntCdDsply());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Cd_Sys ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntCdSys() != null) {
			structuredefinitionsnapshotelementcode.setSystem(s.getStrctrDfnSnpshtElmntCdSys());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Cd_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntCdUsrSltd() != null) {
			structuredefinitionsnapshotelementcode.setUserSelected(Boolean.parseBoolean(s.getStrctrDfnSnpshtElmntCdUsrSltd()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Cd_Vrsn ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntCdVrsn() != null) {
			structuredefinitionsnapshotelementcode.setVersion(s.getStrctrDfnSnpshtElmntCdVrsn());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Comment ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntComment() != null) {
			structuredefinitionsnapshotelement.setComment(s.getStrctrDfnSnpshtElmntComment());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Cndtn ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntCndtn() != null) {
			structuredefinitionsnapshotelement.addCondition(s.getStrctrDfnSnpshtElmntCndtn());
		}
		/******************** structuredefinitionsnapshotelementconstraint ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionConstraintComponent structuredefinitionsnapshotelementconstraint =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionConstraintComponent();
		structuredefinitionsnapshotelement.addConstraint(structuredefinitionsnapshotelementconstraint);

		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Exprsn ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntConstraintExprsn() != null) {
			structuredefinitionsnapshotelementconstraint.setExpression(s.getStrctrDfnSnpshtElmntConstraintExprsn());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Human ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntConstraintHuman() != null) {
			structuredefinitionsnapshotelementconstraint.setHuman(s.getStrctrDfnSnpshtElmntConstraintHuman());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Key ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntConstraintKey() != null) {
			structuredefinitionsnapshotelementconstraint.setKey(s.getStrctrDfnSnpshtElmntConstraintKey());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Rqrments ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntConstraintRqrments() != null) {
			structuredefinitionsnapshotelementconstraint.setRequirements(s.getStrctrDfnSnpshtElmntConstraintRqrments());
		}
		/******************** structuredefinitionsnapshotelementconstraintseverity ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ConstraintSeverityEnumFactory structuredefinitionsnapshotelementconstraintseverity =  new org.hl7.fhir.r4.model.ElementDefinition.ConstraintSeverityEnumFactory();
		structuredefinitionsnapshotelementconstraint.setSeverity(structuredefinitionsnapshotelementconstraintseverity.fromCode(s.getStrctrDfnSnpshtElmntConstraintSeverity()));

		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Src ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntConstraintSrc() != null) {
			structuredefinitionsnapshotelementconstraint.setSource(s.getStrctrDfnSnpshtElmntConstraintSrc());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Constraint_Xpath ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntConstraintXpath() != null) {
			structuredefinitionsnapshotelementconstraint.setXpath(s.getStrctrDfnSnpshtElmntConstraintXpath());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_CntntRfrnc ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntCntntRfrnc() != null) {
			structuredefinitionsnapshotelement.setContentReference(s.getStrctrDfnSnpshtElmntCntntRfrnc());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Dfn ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntDfn() != null) {
			structuredefinitionsnapshotelement.setDefinition(s.getStrctrDfnSnpshtElmntDfn());
		}
		/******************** structuredefinitionsnapshotelementexample ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionExampleComponent structuredefinitionsnapshotelementexample =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionExampleComponent();
		structuredefinitionsnapshotelement.addExample(structuredefinitionsnapshotelementexample);

		/******************** StrctrDfn_Snpsht_Elmnt_Example_Lbl ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntExampleLbl() != null) {
			structuredefinitionsnapshotelementexample.setLabel(s.getStrctrDfnSnpshtElmntExampleLbl());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_IsMdfr ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntIsMdfr() != null) {
			structuredefinitionsnapshotelement.setIsModifier(Boolean.parseBoolean(s.getStrctrDfnSnpshtElmntIsMdfr()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_IsMdfrRsn ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntIsMdfrRsn() != null) {
			structuredefinitionsnapshotelement.setIsModifierReason(s.getStrctrDfnSnpshtElmntIsMdfrRsn());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_IsSummary ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntIsSummary() != null) {
			structuredefinitionsnapshotelement.setIsSummary(Boolean.parseBoolean(s.getStrctrDfnSnpshtElmntIsSummary()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Lbl ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntLbl() != null) {
			structuredefinitionsnapshotelement.setLabel(s.getStrctrDfnSnpshtElmntLbl());
		}
		/******************** structuredefinitionsnapshotelementmapping ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionMappingComponent structuredefinitionsnapshotelementmapping =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionMappingComponent();
		structuredefinitionsnapshotelement.addMapping(structuredefinitionsnapshotelementmapping);

		/******************** StrctrDfn_Snpsht_Elmnt_Mapping_Comment ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMappingComment() != null) {
			structuredefinitionsnapshotelementmapping.setComment(s.getStrctrDfnSnpshtElmntMappingComment());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Mapping_Identity ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMappingIdentity() != null) {
			structuredefinitionsnapshotelementmapping.setIdentity(s.getStrctrDfnSnpshtElmntMappingIdentity());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Mapping_Lnguage ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMappingLnguage() != null) {
			structuredefinitionsnapshotelementmapping.setLanguage(s.getStrctrDfnSnpshtElmntMappingLnguage());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Mapping_Map ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMappingMap() != null) {
			structuredefinitionsnapshotelementmapping.setMap(s.getStrctrDfnSnpshtElmntMappingMap());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Mx ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMx() != null) {
			structuredefinitionsnapshotelement.setMax(s.getStrctrDfnSnpshtElmntMx());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxLength ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxLength() != null) {
			structuredefinitionsnapshotelement.setMaxLength(Integer.parseInt(s.getStrctrDfnSnpshtElmntMxLength()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlDtTimeTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlDtTimeTyp() != null) {
			structuredefinitionsnapshotelement.setMaxValue( new org.hl7.fhir.r4.model.DateTimeType(s.getStrctrDfnSnpshtElmntMxVlDtTimeTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlDtTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlDtTyp() != null) {
			structuredefinitionsnapshotelement.setMaxValue( new org.hl7.fhir.r4.model.DateType(s.getStrctrDfnSnpshtElmntMxVlDtTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlDecimalTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlDecimalTyp() != null) {
			structuredefinitionsnapshotelement.setMaxValue( new org.hl7.fhir.r4.model.DecimalType(s.getStrctrDfnSnpshtElmntMxVlDecimalTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlInstantTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlInstantTyp() != null) {
			structuredefinitionsnapshotelement.setMaxValue( new org.hl7.fhir.r4.model.InstantType(s.getStrctrDfnSnpshtElmntMxVlInstantTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlIntegerTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlIntegerTyp() != null) {
			structuredefinitionsnapshotelement.setMaxValue( new org.hl7.fhir.r4.model.IntegerType(s.getStrctrDfnSnpshtElmntMxVlIntegerTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlPositiveIntTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlPositiveIntTyp() != null) {
			structuredefinitionsnapshotelement.setMaxValue( new org.hl7.fhir.r4.model.PositiveIntType(s.getStrctrDfnSnpshtElmntMxVlPositiveIntTyp()));
		}
		/******************** structuredefinitionsnapshotelementmaxvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionsnapshotelementmaxvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		structuredefinitionsnapshotelement.setMaxValue(structuredefinitionsnapshotelementmaxvaluequantity);

		/******************** StrctrDfn_Snpsht_Elmnt_MxVlQnty_Cd ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlQntyCd() != null) {
			structuredefinitionsnapshotelementmaxvaluequantity.setCode(s.getStrctrDfnSnpshtElmntMxVlQntyCd());
		}
		/******************** structuredefinitionsnapshotelementmaxvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory structuredefinitionsnapshotelementmaxvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		structuredefinitionsnapshotelementmaxvaluequantity.setComparator(structuredefinitionsnapshotelementmaxvaluequantitycomparator.fromCode(s.getStrctrDfnSnpshtElmntMxVlQntyCmprtr()));

		/******************** StrctrDfn_Snpsht_Elmnt_MxVlQnty_Sys ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlQntySys() != null) {
			structuredefinitionsnapshotelementmaxvaluequantity.setSystem(s.getStrctrDfnSnpshtElmntMxVlQntySys());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlQnty_Unt ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlQntyUnt() != null) {
			structuredefinitionsnapshotelementmaxvaluequantity.setUnit(s.getStrctrDfnSnpshtElmntMxVlQntyUnt());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlQnty_Vl ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlQntyVl() != null) {
			structuredefinitionsnapshotelementmaxvaluequantity.setValue(Double.parseDouble((s.getStrctrDfnSnpshtElmntMxVlQntyVl())));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlTimeTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlTimeTyp() != null) {
			structuredefinitionsnapshotelement.setMaxValue( new org.hl7.fhir.r4.model.TimeType(s.getStrctrDfnSnpshtElmntMxVlTimeTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MxVlUnsignedIntTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMxVlUnsignedIntTyp() != null) {
			structuredefinitionsnapshotelement.setMaxValue( new org.hl7.fhir.r4.model.UnsignedIntType(s.getStrctrDfnSnpshtElmntMxVlUnsignedIntTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MeaningWhenMissing ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMeaningWhenMissing() != null) {
			structuredefinitionsnapshotelement.setMeaningWhenMissing(s.getStrctrDfnSnpshtElmntMeaningWhenMissing());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Min ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMin() != null) {
			structuredefinitionsnapshotelement.setMin(Integer.parseInt(s.getStrctrDfnSnpshtElmntMin()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlDtTimeTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlDtTimeTyp() != null) {
			structuredefinitionsnapshotelement.setMinValue( new org.hl7.fhir.r4.model.DateTimeType(s.getStrctrDfnSnpshtElmntMinVlDtTimeTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlDtTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlDtTyp() != null) {
			structuredefinitionsnapshotelement.setMinValue( new org.hl7.fhir.r4.model.DateType(s.getStrctrDfnSnpshtElmntMinVlDtTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlDecimalTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlDecimalTyp() != null) {
			structuredefinitionsnapshotelement.setMinValue( new org.hl7.fhir.r4.model.DecimalType(s.getStrctrDfnSnpshtElmntMinVlDecimalTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlInstantTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlInstantTyp() != null) {
			structuredefinitionsnapshotelement.setMinValue( new org.hl7.fhir.r4.model.InstantType(s.getStrctrDfnSnpshtElmntMinVlInstantTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlIntegerTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlIntegerTyp() != null) {
			structuredefinitionsnapshotelement.setMinValue( new org.hl7.fhir.r4.model.IntegerType(s.getStrctrDfnSnpshtElmntMinVlIntegerTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlPositiveIntTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlPositiveIntTyp() != null) {
			structuredefinitionsnapshotelement.setMinValue( new org.hl7.fhir.r4.model.PositiveIntType(s.getStrctrDfnSnpshtElmntMinVlPositiveIntTyp()));
		}
		/******************** structuredefinitionsnapshotelementminvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionsnapshotelementminvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		structuredefinitionsnapshotelement.setMinValue(structuredefinitionsnapshotelementminvaluequantity);

		/******************** StrctrDfn_Snpsht_Elmnt_MinVlQnty_Cd ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlQntyCd() != null) {
			structuredefinitionsnapshotelementminvaluequantity.setCode(s.getStrctrDfnSnpshtElmntMinVlQntyCd());
		}
		/******************** structuredefinitionsnapshotelementminvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory structuredefinitionsnapshotelementminvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		structuredefinitionsnapshotelementminvaluequantity.setComparator(structuredefinitionsnapshotelementminvaluequantitycomparator.fromCode(s.getStrctrDfnSnpshtElmntMinVlQntyCmprtr()));

		/******************** StrctrDfn_Snpsht_Elmnt_MinVlQnty_Sys ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlQntySys() != null) {
			structuredefinitionsnapshotelementminvaluequantity.setSystem(s.getStrctrDfnSnpshtElmntMinVlQntySys());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlQnty_Unt ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlQntyUnt() != null) {
			structuredefinitionsnapshotelementminvaluequantity.setUnit(s.getStrctrDfnSnpshtElmntMinVlQntyUnt());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlQnty_Vl ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlQntyVl() != null) {
			structuredefinitionsnapshotelementminvaluequantity.setValue(Double.parseDouble((s.getStrctrDfnSnpshtElmntMinVlQntyVl())));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlTimeTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlTimeTyp() != null) {
			structuredefinitionsnapshotelement.setMinValue( new org.hl7.fhir.r4.model.TimeType(s.getStrctrDfnSnpshtElmntMinVlTimeTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MinVlUnsignedIntTyp ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMinVlUnsignedIntTyp() != null) {
			structuredefinitionsnapshotelement.setMinValue( new org.hl7.fhir.r4.model.UnsignedIntType(s.getStrctrDfnSnpshtElmntMinVlUnsignedIntTyp()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_MustSupport ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntMustSupport() != null) {
			structuredefinitionsnapshotelement.setMustSupport(Boolean.parseBoolean(s.getStrctrDfnSnpshtElmntMustSupport()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_OrdrMeaning ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntOrdrMeaning() != null) {
			structuredefinitionsnapshotelement.setOrderMeaning(s.getStrctrDfnSnpshtElmntOrdrMeaning());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Path ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntPath() != null) {
			structuredefinitionsnapshotelement.setPath(s.getStrctrDfnSnpshtElmntPath());
		}
		/******************** structuredefinitionsnapshotelementrepresentation ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.PropertyRepresentationEnumFactory structuredefinitionsnapshotelementrepresentation =  new org.hl7.fhir.r4.model.ElementDefinition.PropertyRepresentationEnumFactory();
		structuredefinitionsnapshotelement.addRepresentation(structuredefinitionsnapshotelementrepresentation.fromCode(s.getStrctrDfnSnpshtElmntRepresentation()));

		/******************** StrctrDfn_Snpsht_Elmnt_Rqrments ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntRqrments() != null) {
			structuredefinitionsnapshotelement.setRequirements(s.getStrctrDfnSnpshtElmntRqrments());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Short ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntShort() != null) {
			structuredefinitionsnapshotelement.setShort(s.getStrctrDfnSnpshtElmntShort());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_SliceIsConstraining ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntSliceIsConstraining() != null) {
			structuredefinitionsnapshotelement.setSliceIsConstraining(Boolean.parseBoolean(s.getStrctrDfnSnpshtElmntSliceIsConstraining()));
		}
		/******************** StrctrDfn_Snpsht_Elmnt_SliceNm ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntSliceNm() != null) {
			structuredefinitionsnapshotelement.setSliceName(s.getStrctrDfnSnpshtElmntSliceNm());
		}
		/******************** structuredefinitionsnapshotelementslicing ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingComponent structuredefinitionsnapshotelementslicing =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingComponent();
		structuredefinitionsnapshotelement.setSlicing(structuredefinitionsnapshotelementslicing);

		/******************** StrctrDfn_Snpsht_Elmnt_Slicing_Dscrptn ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntSlicingDscrptn() != null) {
			structuredefinitionsnapshotelementslicing.setDescription(s.getStrctrDfnSnpshtElmntSlicingDscrptn());
		}
		/******************** structuredefinitionsnapshotelementslicingdiscriminator ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingDiscriminatorComponent structuredefinitionsnapshotelementslicingdiscriminator =  new org.hl7.fhir.r4.model.ElementDefinition.ElementDefinitionSlicingDiscriminatorComponent();
		structuredefinitionsnapshotelementslicing.addDiscriminator(structuredefinitionsnapshotelementslicingdiscriminator);

		/******************** StrctrDfn_Snpsht_Elmnt_Slicing_Discriminator_Path ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntSlicingDiscriminatorPath() != null) {
			structuredefinitionsnapshotelementslicingdiscriminator.setPath(s.getStrctrDfnSnpshtElmntSlicingDiscriminatorPath());
		}
		/******************** structuredefinitionsnapshotelementslicingdiscriminatortype ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.DiscriminatorTypeEnumFactory structuredefinitionsnapshotelementslicingdiscriminatortype =  new org.hl7.fhir.r4.model.ElementDefinition.DiscriminatorTypeEnumFactory();
		structuredefinitionsnapshotelementslicingdiscriminator.setType(structuredefinitionsnapshotelementslicingdiscriminatortype.fromCode(s.getStrctrDfnSnpshtElmntSlicingDiscriminatorTyp()));

		/******************** StrctrDfn_Snpsht_Elmnt_Slicing_Ordred ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntSlicingOrdred() != null) {
			structuredefinitionsnapshotelementslicing.setOrdered(Boolean.parseBoolean(s.getStrctrDfnSnpshtElmntSlicingOrdred()));
		}
		/******************** structuredefinitionsnapshotelementslicingrules ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.SlicingRulesEnumFactory structuredefinitionsnapshotelementslicingrules =  new org.hl7.fhir.r4.model.ElementDefinition.SlicingRulesEnumFactory();
		structuredefinitionsnapshotelementslicing.setRules(structuredefinitionsnapshotelementslicingrules.fromCode(s.getStrctrDfnSnpshtElmntSlicingRules()));

		/******************** structuredefinitionsnapshotelementtype ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.TypeRefComponent structuredefinitionsnapshotelementtype =  new org.hl7.fhir.r4.model.ElementDefinition.TypeRefComponent();
		structuredefinitionsnapshotelement.addType(structuredefinitionsnapshotelementtype);

		/******************** structuredefinitionsnapshotelementtypeaggregation ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.AggregationModeEnumFactory structuredefinitionsnapshotelementtypeaggregation =  new org.hl7.fhir.r4.model.ElementDefinition.AggregationModeEnumFactory();
		structuredefinitionsnapshotelementtype.addAggregation(structuredefinitionsnapshotelementtypeaggregation.fromCode(s.getStrctrDfnSnpshtElmntTypAggregation()));

		/******************** StrctrDfn_Snpsht_Elmnt_Typ_Cd ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntTypCd() != null) {
			structuredefinitionsnapshotelementtype.setCode(s.getStrctrDfnSnpshtElmntTypCd());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Typ_Profile ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntTypProfile() != null) {
			structuredefinitionsnapshotelementtype.addProfile(s.getStrctrDfnSnpshtElmntTypProfile());
		}
		/******************** StrctrDfn_Snpsht_Elmnt_Typ_TarProfile ********************************************************************************/
		if(s.getStrctrDfnSnpshtElmntTypTarProfile() != null) {
			structuredefinitionsnapshotelementtype.addTargetProfile(s.getStrctrDfnSnpshtElmntTypTarProfile());
		}
		/******************** structuredefinitionsnapshotelementtypeversioning ********************************************************************************/
		org.hl7.fhir.r4.model.ElementDefinition.ReferenceVersionRulesEnumFactory structuredefinitionsnapshotelementtypeversioning =  new org.hl7.fhir.r4.model.ElementDefinition.ReferenceVersionRulesEnumFactory();
		structuredefinitionsnapshotelementtype.setVersioning(structuredefinitionsnapshotelementtypeversioning.fromCode(s.getStrctrDfnSnpshtElmntTypVrsning()));

		/******************** structuredefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory structuredefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		structuredefinition.setStatus(structuredefinitionstatus.fromCode(s.getStrctrDfnSts()));

		/******************** StrctrDfn_Ttl ********************************************************************************/
		if(s.getStrctrDfnTtl() != null) {
			structuredefinition.setTitle(s.getStrctrDfnTtl());
		}
		/******************** StrctrDfn_Typ ********************************************************************************/
		if(s.getStrctrDfnTyp() != null) {
			structuredefinition.setType(s.getStrctrDfnTyp());
		}
		/******************** StrctrDfn_Url ********************************************************************************/
		if(s.getStrctrDfnUrl() != null) {
			structuredefinition.setUrl(s.getStrctrDfnUrl());
		}
		/******************** structuredefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext structuredefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		structuredefinition.addUseContext(structuredefinitionusecontext);

		/******************** structuredefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		structuredefinitionusecontext.setCode(structuredefinitionusecontextcode);

		/******************** StrctrDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdCd() != null) {
			structuredefinitionusecontextcode.setCode(s.getStrctrDfnUseCntxtCdCd());
		}
		/******************** StrctrDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdDsply() != null) {
			structuredefinitionusecontextcode.setDisplay(s.getStrctrDfnUseCntxtCdDsply());
		}
		/******************** StrctrDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdSys() != null) {
			structuredefinitionusecontextcode.setSystem(s.getStrctrDfnUseCntxtCdSys());
		}
		/******************** StrctrDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdUsrSltd() != null) {
			structuredefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(s.getStrctrDfnUseCntxtCdUsrSltd()));
		}
		/******************** StrctrDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(s.getStrctrDfnUseCntxtCdVrsn() != null) {
			structuredefinitionusecontextcode.setVersion(s.getStrctrDfnUseCntxtCdVrsn());
		}
		/******************** structuredefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept structuredefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		structuredefinitionusecontext.setValue(structuredefinitionusecontextvaluecodeableconcept);

		/******************** structuredefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding structuredefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		structuredefinitionusecontextvaluecodeableconcept.addCoding(structuredefinitionusecontextvaluecodeableconceptcoding);

		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			structuredefinitionusecontextvaluecodeableconceptcoding.setCode(s.getStrctrDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			structuredefinitionusecontextvaluecodeableconceptcoding.setDisplay(s.getStrctrDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			structuredefinitionusecontextvaluecodeableconceptcoding.setSystem(s.getStrctrDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			structuredefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getStrctrDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			structuredefinitionusecontextvaluecodeableconceptcoding.setVersion(s.getStrctrDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** StrctrDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlCdbleCncptTxt() != null) {
			structuredefinitionusecontextvaluecodeableconcept.setText(s.getStrctrDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** structuredefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		structuredefinitionusecontext.setValue(structuredefinitionusecontextvaluequantity);

		/******************** StrctrDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlQntyCd() != null) {
			structuredefinitionusecontextvaluequantity.setCode(s.getStrctrDfnUseCntxtVlQntyCd());
		}
		/******************** structuredefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory structuredefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		structuredefinitionusecontextvaluequantity.setComparator(structuredefinitionusecontextvaluequantitycomparator.fromCode(s.getStrctrDfnUseCntxtVlQntyCmprtr()));

		/******************** StrctrDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlQntySys() != null) {
			structuredefinitionusecontextvaluequantity.setSystem(s.getStrctrDfnUseCntxtVlQntySys());
		}
		/******************** StrctrDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlQntyUnt() != null) {
			structuredefinitionusecontextvaluequantity.setUnit(s.getStrctrDfnUseCntxtVlQntyUnt());
		}
		/******************** StrctrDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlQntyVl() != null) {
			structuredefinitionusecontextvaluequantity.setValue(Double.parseDouble((s.getStrctrDfnUseCntxtVlQntyVl())));
		}
		/******************** structuredefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range structuredefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		structuredefinitionusecontext.setValue(structuredefinitionusecontextvaluerange);

		/******************** structuredefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		structuredefinitionusecontextvaluerange.setHigh(structuredefinitionusecontextvaluerangehigh);

		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngHiCd() != null) {
			structuredefinitionusecontextvaluerangehigh.setCode(s.getStrctrDfnUseCntxtVlRngHiCd());
		}
		/******************** structuredefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory structuredefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		structuredefinitionusecontextvaluerangehigh.setComparator(structuredefinitionusecontextvaluerangehighcomparator.fromCode(s.getStrctrDfnUseCntxtVlRngHiCmprtr()));

		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngHiSys() != null) {
			structuredefinitionusecontextvaluerangehigh.setSystem(s.getStrctrDfnUseCntxtVlRngHiSys());
		}
		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngHiUnt() != null) {
			structuredefinitionusecontextvaluerangehigh.setUnit(s.getStrctrDfnUseCntxtVlRngHiUnt());
		}
		/******************** StrctrDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngHiVl() != null) {
			structuredefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((s.getStrctrDfnUseCntxtVlRngHiVl())));
		}
		/******************** structuredefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity structuredefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		structuredefinitionusecontextvaluerange.setLow(structuredefinitionusecontextvaluerangelow);

		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngLwCd() != null) {
			structuredefinitionusecontextvaluerangelow.setCode(s.getStrctrDfnUseCntxtVlRngLwCd());
		}
		/******************** structuredefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory structuredefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		structuredefinitionusecontextvaluerangelow.setComparator(structuredefinitionusecontextvaluerangelowcomparator.fromCode(s.getStrctrDfnUseCntxtVlRngLwCmprtr()));

		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngLwSys() != null) {
			structuredefinitionusecontextvaluerangelow.setSystem(s.getStrctrDfnUseCntxtVlRngLwSys());
		}
		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngLwUnt() != null) {
			structuredefinitionusecontextvaluerangelow.setUnit(s.getStrctrDfnUseCntxtVlRngLwUnt());
		}
		/******************** StrctrDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRngLwVl() != null) {
			structuredefinitionusecontextvaluerangelow.setValue(Double.parseDouble((s.getStrctrDfnUseCntxtVlRngLwVl())));
		}
		/******************** StrctrDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(s.getStrctrDfnUseCntxtVlRfrnc() != null) {
			structuredefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(s.getStrctrDfnUseCntxtVlRfrnc()));
		}
		/******************** StrctrDfn_Vrsn ********************************************************************************/
		if(s.getStrctrDfnVrsn() != null) {
			structuredefinition.setVersion(s.getStrctrDfnVrsn());
		}
		return structuredefinition;
	}
}
