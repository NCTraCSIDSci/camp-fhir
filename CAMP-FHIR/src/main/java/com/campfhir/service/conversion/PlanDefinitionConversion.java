package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PlanDefinition;
public class PlanDefinitionConversion 
{
	public org.hl7.fhir.r4.model.PlanDefinition PlanDefinitions(PlanDefinition p) throws ParseException
	{
		org.hl7.fhir.r4.model.PlanDefinition plandefinition = new org.hl7.fhir.r4.model.PlanDefinition();

		/******************** id ********************************************************************************/
		plandefinition.setId(p.getId());

		/******************** plandefinitionaction ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionComponent plandefinitionaction =  new org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionComponent();
		plandefinition.addAction(plandefinitionaction);

		/******************** plandefinitionactioncardinalitybehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionCardinalityBehaviorEnumFactory plandefinitionactioncardinalitybehavior =  new org.hl7.fhir.r4.model.PlanDefinition.ActionCardinalityBehaviorEnumFactory();
		plandefinitionaction.setCardinalityBehavior(plandefinitionactioncardinalitybehavior.fromCode(p.getPlnDfnActnCardinalityBehavior()));

		/******************** plandefinitionactioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionaction.addCode(plandefinitionactioncode);

		/******************** plandefinitionactioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactioncode.addCoding(plandefinitionactioncodecoding);

		/******************** PlnDfn_Actn_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnCdCdgCd() != null) {
			plandefinitionactioncodecoding.setCode(p.getPlnDfnActnCdCdgCd());
		}
		/******************** PlnDfn_Actn_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnCdCdgDsply() != null) {
			plandefinitionactioncodecoding.setDisplay(p.getPlnDfnActnCdCdgDsply());
		}
		/******************** PlnDfn_Actn_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnCdCdgSys() != null) {
			plandefinitionactioncodecoding.setSystem(p.getPlnDfnActnCdCdgSys());
		}
		/******************** PlnDfn_Actn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnCdCdgUsrSltd() != null) {
			plandefinitionactioncodecoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnCdCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnCdCdgVrsn() != null) {
			plandefinitionactioncodecoding.setVersion(p.getPlnDfnActnCdCdgVrsn());
		}
		/******************** PlnDfn_Actn_Cd_Txt ********************************************************************************/
		if(p.getPlnDfnActnCdTxt() != null) {
			plandefinitionactioncode.setText(p.getPlnDfnActnCdTxt());
		}
		/******************** plandefinitionactioncondition ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionConditionComponent plandefinitionactioncondition =  new org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionConditionComponent();
		plandefinitionaction.addCondition(plandefinitionactioncondition);

		/******************** plandefinitionactionconditionexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression plandefinitionactionconditionexpression =  new org.hl7.fhir.r4.model.Expression();
		plandefinitionactioncondition.setExpression(plandefinitionactionconditionexpression);

		/******************** PlnDfn_Actn_Cndtn_Exprsn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnDscrptn() != null) {
			plandefinitionactionconditionexpression.setDescription(p.getPlnDfnActnCndtnExprsnDscrptn());
		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Exprsn ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnExprsn() != null) {
			plandefinitionactionconditionexpression.setExpression(p.getPlnDfnActnCndtnExprsnExprsn());
		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Lnguage ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnLnguage() != null) {
			plandefinitionactionconditionexpression.setLanguage(p.getPlnDfnActnCndtnExprsnLnguage());
		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Nm ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnNm() != null) {
			plandefinitionactionconditionexpression.setName(p.getPlnDfnActnCndtnExprsnNm());
		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Rfrnc ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnRfrnc() != null) {
			plandefinitionactionconditionexpression.setReference(p.getPlnDfnActnCndtnExprsnRfrnc());
		}
		/******************** plandefinitionactionconditionkind ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionConditionKindEnumFactory plandefinitionactionconditionkind =  new org.hl7.fhir.r4.model.PlanDefinition.ActionConditionKindEnumFactory();
		plandefinitionactioncondition.setKind(plandefinitionactionconditionkind.fromCode(p.getPlnDfnActnCndtnKind()));

		/******************** PlnDfn_Actn_DfnCanonicalTyp ********************************************************************************/
		if(p.getPlnDfnActnDfnCanonicalTyp() != null) {
			plandefinitionaction.setDefinition( new org.hl7.fhir.r4.model.CanonicalType(p.getPlnDfnActnDfnCanonicalTyp()));
		}
		/******************** PlnDfn_Actn_DfnUriTyp ********************************************************************************/
		if(p.getPlnDfnActnDfnUriTyp() != null) {
			plandefinitionaction.setDefinition( new org.hl7.fhir.r4.model.UriType(p.getPlnDfnActnDfnUriTyp()));
		}
		/******************** PlnDfn_Actn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnActnDscrptn() != null) {
			plandefinitionaction.setDescription(p.getPlnDfnActnDscrptn());
		}
		/******************** plandefinitionactiondocumentation ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact plandefinitionactiondocumentation =  new org.hl7.fhir.r4.model.RelatedArtifact();
		plandefinitionaction.addDocumentation(plandefinitionactiondocumentation);

		/******************** PlnDfn_Actn_Docation_Citation ********************************************************************************/
		if(p.getPlnDfnActnDocationCitation() != null) {
			plandefinitionactiondocumentation.setCitation(p.getPlnDfnActnDocationCitation());
		}
		/******************** PlnDfn_Actn_Docation_Dsply ********************************************************************************/
		if(p.getPlnDfnActnDocationDsply() != null) {
			plandefinitionactiondocumentation.setDisplay(p.getPlnDfnActnDocationDsply());
		}
		/******************** plandefinitionactiondocumentationdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment plandefinitionactiondocumentationdocument =  new org.hl7.fhir.r4.model.Attachment();
		plandefinitionactiondocumentation.setDocument(plandefinitionactiondocumentationdocument);

		/******************** PlnDfn_Actn_Docation_Doc_CntntTyp ********************************************************************************/
		if(p.getPlnDfnActnDocationDocCntntTyp() != null) {
			plandefinitionactiondocumentationdocument.setContentType(p.getPlnDfnActnDocationDocCntntTyp());
		}
		/******************** PlnDfn_Actn_Docation_Doc_Creation ********************************************************************************/
		if(p.getPlnDfnActnDocationDocCreation() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Docation_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Docation_Doc_Creationdate = PlnDfn_Actn_Docation_Doc_Creationsdf.parse(p.getPlnDfnActnDocationDocCreation());
			plandefinitionactiondocumentationdocument.setCreation(PlnDfn_Actn_Docation_Doc_Creationdate);
		}
		/******************** PlnDfn_Actn_Docation_Doc_Data ********************************************************************************/
		if(p.getPlnDfnActnDocationDocData() != null) {
			plandefinitionactiondocumentationdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPlnDfnActnDocationDocData()));
		}
		/******************** PlnDfn_Actn_Docation_Doc_Hash ********************************************************************************/
		if(p.getPlnDfnActnDocationDocHash() != null) {
			plandefinitionactiondocumentationdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPlnDfnActnDocationDocHash()));
		}
		/******************** PlnDfn_Actn_Docation_Doc_Lnguage ********************************************************************************/
		if(p.getPlnDfnActnDocationDocLnguage() != null) {
			plandefinitionactiondocumentationdocument.setLanguage(p.getPlnDfnActnDocationDocLnguage());
		}
		/******************** PlnDfn_Actn_Docation_Doc_Sz ********************************************************************************/
		if(p.getPlnDfnActnDocationDocSz() != null) {
			plandefinitionactiondocumentationdocument.setSize(Integer.parseInt(p.getPlnDfnActnDocationDocSz()));
		}
		/******************** PlnDfn_Actn_Docation_Doc_Ttl ********************************************************************************/
		if(p.getPlnDfnActnDocationDocTtl() != null) {
			plandefinitionactiondocumentationdocument.setTitle(p.getPlnDfnActnDocationDocTtl());
		}
		/******************** PlnDfn_Actn_Docation_Doc_Url ********************************************************************************/
		if(p.getPlnDfnActnDocationDocUrl() != null) {
			plandefinitionactiondocumentationdocument.setUrl(p.getPlnDfnActnDocationDocUrl());
		}
		/******************** PlnDfn_Actn_Docation_Lbl ********************************************************************************/
		if(p.getPlnDfnActnDocationLbl() != null) {
			plandefinitionactiondocumentation.setLabel(p.getPlnDfnActnDocationLbl());
		}
		/******************** PlnDfn_Actn_Docation_Rsrc ********************************************************************************/
		if(p.getPlnDfnActnDocationRsrc() != null) {
			plandefinitionactiondocumentation.setResource(p.getPlnDfnActnDocationRsrc());
		}
		/******************** plandefinitionactiondocumentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory plandefinitionactiondocumentationtype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		plandefinitionactiondocumentation.setType(plandefinitionactiondocumentationtype.fromCode(p.getPlnDfnActnDocationTyp()));

		/******************** PlnDfn_Actn_Docation_Url ********************************************************************************/
		if(p.getPlnDfnActnDocationUrl() != null) {
			plandefinitionactiondocumentation.setUrl(p.getPlnDfnActnDocationUrl());
		}
		/******************** plandefinitionactiondynamicvalue ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionDynamicValueComponent plandefinitionactiondynamicvalue =  new org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionDynamicValueComponent();
		plandefinitionaction.addDynamicValue(plandefinitionactiondynamicvalue);

		/******************** plandefinitionactiondynamicvalueexpression ********************************************************************************/
		org.hl7.fhir.r4.model.Expression plandefinitionactiondynamicvalueexpression =  new org.hl7.fhir.r4.model.Expression();
		plandefinitionactiondynamicvalue.setExpression(plandefinitionactiondynamicvalueexpression);

		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnDscrptn() != null) {
			plandefinitionactiondynamicvalueexpression.setDescription(p.getPlnDfnActnDynamicVlExprsnDscrptn());
		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Exprsn ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnExprsn() != null) {
			plandefinitionactiondynamicvalueexpression.setExpression(p.getPlnDfnActnDynamicVlExprsnExprsn());
		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Lnguage ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnLnguage() != null) {
			plandefinitionactiondynamicvalueexpression.setLanguage(p.getPlnDfnActnDynamicVlExprsnLnguage());
		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Nm ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnNm() != null) {
			plandefinitionactiondynamicvalueexpression.setName(p.getPlnDfnActnDynamicVlExprsnNm());
		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Rfrnc ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnRfrnc() != null) {
			plandefinitionactiondynamicvalueexpression.setReference(p.getPlnDfnActnDynamicVlExprsnRfrnc());
		}
		/******************** PlnDfn_Actn_DynamicVl_Path ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlPath() != null) {
			plandefinitionactiondynamicvalue.setPath(p.getPlnDfnActnDynamicVlPath());
		}
		/******************** PlnDfn_Actn_GoalId ********************************************************************************/
		if(p.getPlnDfnActnGoalId() != null) {
			plandefinitionaction.addGoalId(p.getPlnDfnActnGoalId());
		}
		/******************** plandefinitionactiongroupingbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionGroupingBehaviorEnumFactory plandefinitionactiongroupingbehavior =  new org.hl7.fhir.r4.model.PlanDefinition.ActionGroupingBehaviorEnumFactory();
		plandefinitionaction.setGroupingBehavior(plandefinitionactiongroupingbehavior.fromCode(p.getPlnDfnActnGrpingBehavior()));

		/******************** plandefinitionactioninput ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement plandefinitionactioninput =  new org.hl7.fhir.r4.model.DataRequirement();
		plandefinitionaction.addInput(plandefinitionactioninput);

		/******************** plandefinitionactioninputcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent plandefinitionactioninputcodefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent();
		plandefinitionactioninput.addCodeFilter(plandefinitionactioninputcodefilter);

		/******************** plandefinitionactioninputcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactioninputcodefiltercode =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactioninputcodefilter.addCode(plandefinitionactioninputcodefiltercode);

		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Cd ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdCd() != null) {
			plandefinitionactioninputcodefiltercode.setCode(p.getPlnDfnActnInputCdFltrCdCd());
		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Dsply ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdDsply() != null) {
			plandefinitionactioninputcodefiltercode.setDisplay(p.getPlnDfnActnInputCdFltrCdDsply());
		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Sys ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdSys() != null) {
			plandefinitionactioninputcodefiltercode.setSystem(p.getPlnDfnActnInputCdFltrCdSys());
		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdUsrSltd() != null) {
			plandefinitionactioninputcodefiltercode.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnInputCdFltrCdUsrSltd()));
		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdVrsn() != null) {
			plandefinitionactioninputcodefiltercode.setVersion(p.getPlnDfnActnInputCdFltrCdVrsn());
		}
		/******************** PlnDfn_Actn_Input_CdFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrPath() != null) {
			plandefinitionactioninputcodefilter.setPath(p.getPlnDfnActnInputCdFltrPath());
		}
		/******************** PlnDfn_Actn_Input_CdFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrSrchParam() != null) {
			plandefinitionactioninputcodefilter.setSearchParam(p.getPlnDfnActnInputCdFltrSrchParam());
		}
		/******************** PlnDfn_Actn_Input_CdFltr_VlSt ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrVlSt() != null) {
			plandefinitionactioninputcodefilter.setValueSet(p.getPlnDfnActnInputCdFltrVlSt());
		}
		/******************** plandefinitionactioninputdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent plandefinitionactioninputdatefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent();
		plandefinitionactioninput.addDateFilter(plandefinitionactioninputdatefilter);

		/******************** PlnDfn_Actn_Input_DtFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrPath() != null) {
			plandefinitionactioninputdatefilter.setPath(p.getPlnDfnActnInputDtFltrPath());
		}
		/******************** PlnDfn_Actn_Input_DtFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrSrchParam() != null) {
			plandefinitionactioninputdatefilter.setSearchParam(p.getPlnDfnActnInputDtFltrSrchParam());
		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlDtTimeTyp() != null) {
			plandefinitionactioninputdatefilter.setValue( new org.hl7.fhir.r4.model.DateTimeType(p.getPlnDfnActnInputDtFltrVlDtTimeTyp()));
		}
		/******************** plandefinitionactioninputdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactioninputdatefiltervalueduration =  new org.hl7.fhir.r4.model.Duration();
		plandefinitionactioninputdatefilter.setValue(plandefinitionactioninputdatefiltervalueduration);

		/******************** plandefinitionactioninputdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactioninputdatefiltervalueperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionactioninputdatefilter.setValue(plandefinitionactioninputdatefiltervalueperiod);

		/******************** PlnDfn_Actn_Input_DtFltr_VlPrd_End ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Input_DtFltr_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Input_DtFltr_VlPrd_Enddate = PlnDfn_Actn_Input_DtFltr_VlPrd_Endsdf.parse(p.getPlnDfnActnInputDtFltrVlPrdEnd());
			plandefinitionactioninputdatefiltervalueperiod.setEnd(PlnDfn_Actn_Input_DtFltr_VlPrd_Enddate);
		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Input_DtFltr_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Input_DtFltr_VlPrd_Strtdate = PlnDfn_Actn_Input_DtFltr_VlPrd_Strtsdf.parse(p.getPlnDfnActnInputDtFltrVlPrdStrt());
			plandefinitionactioninputdatefiltervalueperiod.setStart(PlnDfn_Actn_Input_DtFltr_VlPrd_Strtdate);
		}
		/******************** PlnDfn_Actn_Input_Lmt ********************************************************************************/
		if(p.getPlnDfnActnInputLmt() != null) {
			plandefinitionactioninput.setLimit(Integer.parseInt(p.getPlnDfnActnInputLmt()));
		}
		/******************** PlnDfn_Actn_Input_MustSupport ********************************************************************************/
		if(p.getPlnDfnActnInputMustSupport() != null) {
			plandefinitionactioninput.addMustSupport(p.getPlnDfnActnInputMustSupport());
		}
		/******************** PlnDfn_Actn_Input_Profile ********************************************************************************/
		if(p.getPlnDfnActnInputProfile() != null) {
			plandefinitionactioninput.addProfile(p.getPlnDfnActnInputProfile());
		}
		/******************** plandefinitionactioninputsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent plandefinitionactioninputsort =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent();
		plandefinitionactioninput.addSort(plandefinitionactioninputsort);

		/******************** plandefinitionactioninputsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory plandefinitionactioninputsortdirection =  new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory();
		plandefinitionactioninputsort.setDirection(plandefinitionactioninputsortdirection.fromCode(p.getPlnDfnActnInputSortDirection()));

		/******************** PlnDfn_Actn_Input_Sort_Path ********************************************************************************/
		if(p.getPlnDfnActnInputSortPath() != null) {
			plandefinitionactioninputsort.setPath(p.getPlnDfnActnInputSortPath());
		}
		/******************** plandefinitionactioninputsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactioninputsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionactioninput.setSubject(plandefinitionactioninputsubjectcodeableconcept);

		/******************** plandefinitionactioninputsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactioninputsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactioninputsubjectcodeableconcept.addCoding(plandefinitionactioninputsubjectcodeableconceptcoding);

		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgCd() != null) {
			plandefinitionactioninputsubjectcodeableconceptcoding.setCode(p.getPlnDfnActnInputSbjctCdbleCncptCdgCd());
		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgDsply() != null) {
			plandefinitionactioninputsubjectcodeableconceptcoding.setDisplay(p.getPlnDfnActnInputSbjctCdbleCncptCdgDsply());
		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgSys() != null) {
			plandefinitionactioninputsubjectcodeableconceptcoding.setSystem(p.getPlnDfnActnInputSbjctCdbleCncptCdgSys());
		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd() != null) {
			plandefinitionactioninputsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgVrsn() != null) {
			plandefinitionactioninputsubjectcodeableconceptcoding.setVersion(p.getPlnDfnActnInputSbjctCdbleCncptCdgVrsn());
		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptTxt() != null) {
			plandefinitionactioninputsubjectcodeableconcept.setText(p.getPlnDfnActnInputSbjctCdbleCncptTxt());
		}
		/******************** PlnDfn_Actn_Input_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctRfrnc() != null) {
			plandefinitionactioninput.setSubject( new org.hl7.fhir.r4.model.Reference(p.getPlnDfnActnInputSbjctRfrnc()));
		}
		/******************** PlnDfn_Actn_Input_Typ ********************************************************************************/
		if(p.getPlnDfnActnInputTyp() != null) {
			plandefinitionactioninput.setType(p.getPlnDfnActnInputTyp());
		}
		/******************** plandefinitionactionoutput ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement plandefinitionactionoutput =  new org.hl7.fhir.r4.model.DataRequirement();
		plandefinitionaction.addOutput(plandefinitionactionoutput);

		/******************** plandefinitionactionoutputcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent plandefinitionactionoutputcodefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent();
		plandefinitionactionoutput.addCodeFilter(plandefinitionactionoutputcodefilter);

		/******************** plandefinitionactionoutputcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionoutputcodefiltercode =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactionoutputcodefilter.addCode(plandefinitionactionoutputcodefiltercode);

		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Cd ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdCd() != null) {
			plandefinitionactionoutputcodefiltercode.setCode(p.getPlnDfnActnOutputCdFltrCdCd());
		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Dsply ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdDsply() != null) {
			plandefinitionactionoutputcodefiltercode.setDisplay(p.getPlnDfnActnOutputCdFltrCdDsply());
		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Sys ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdSys() != null) {
			plandefinitionactionoutputcodefiltercode.setSystem(p.getPlnDfnActnOutputCdFltrCdSys());
		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdUsrSltd() != null) {
			plandefinitionactionoutputcodefiltercode.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnOutputCdFltrCdUsrSltd()));
		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdVrsn() != null) {
			plandefinitionactionoutputcodefiltercode.setVersion(p.getPlnDfnActnOutputCdFltrCdVrsn());
		}
		/******************** PlnDfn_Actn_Output_CdFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrPath() != null) {
			plandefinitionactionoutputcodefilter.setPath(p.getPlnDfnActnOutputCdFltrPath());
		}
		/******************** PlnDfn_Actn_Output_CdFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrSrchParam() != null) {
			plandefinitionactionoutputcodefilter.setSearchParam(p.getPlnDfnActnOutputCdFltrSrchParam());
		}
		/******************** PlnDfn_Actn_Output_CdFltr_VlSt ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrVlSt() != null) {
			plandefinitionactionoutputcodefilter.setValueSet(p.getPlnDfnActnOutputCdFltrVlSt());
		}
		/******************** plandefinitionactionoutputdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent plandefinitionactionoutputdatefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent();
		plandefinitionactionoutput.addDateFilter(plandefinitionactionoutputdatefilter);

		/******************** PlnDfn_Actn_Output_DtFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrPath() != null) {
			plandefinitionactionoutputdatefilter.setPath(p.getPlnDfnActnOutputDtFltrPath());
		}
		/******************** PlnDfn_Actn_Output_DtFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrSrchParam() != null) {
			plandefinitionactionoutputdatefilter.setSearchParam(p.getPlnDfnActnOutputDtFltrSrchParam());
		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlDtTimeTyp() != null) {
			plandefinitionactionoutputdatefilter.setValue( new org.hl7.fhir.r4.model.DateTimeType(p.getPlnDfnActnOutputDtFltrVlDtTimeTyp()));
		}
		/******************** plandefinitionactionoutputdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactionoutputdatefiltervalueduration =  new org.hl7.fhir.r4.model.Duration();
		plandefinitionactionoutputdatefilter.setValue(plandefinitionactionoutputdatefiltervalueduration);

		/******************** plandefinitionactionoutputdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactionoutputdatefiltervalueperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionactionoutputdatefilter.setValue(plandefinitionactionoutputdatefiltervalueperiod);

		/******************** PlnDfn_Actn_Output_DtFltr_VlPrd_End ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Output_DtFltr_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Output_DtFltr_VlPrd_Enddate = PlnDfn_Actn_Output_DtFltr_VlPrd_Endsdf.parse(p.getPlnDfnActnOutputDtFltrVlPrdEnd());
			plandefinitionactionoutputdatefiltervalueperiod.setEnd(PlnDfn_Actn_Output_DtFltr_VlPrd_Enddate);
		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Output_DtFltr_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Output_DtFltr_VlPrd_Strtdate = PlnDfn_Actn_Output_DtFltr_VlPrd_Strtsdf.parse(p.getPlnDfnActnOutputDtFltrVlPrdStrt());
			plandefinitionactionoutputdatefiltervalueperiod.setStart(PlnDfn_Actn_Output_DtFltr_VlPrd_Strtdate);
		}
		/******************** PlnDfn_Actn_Output_Lmt ********************************************************************************/
		if(p.getPlnDfnActnOutputLmt() != null) {
			plandefinitionactionoutput.setLimit(Integer.parseInt(p.getPlnDfnActnOutputLmt()));
		}
		/******************** PlnDfn_Actn_Output_MustSupport ********************************************************************************/
		if(p.getPlnDfnActnOutputMustSupport() != null) {
			plandefinitionactionoutput.addMustSupport(p.getPlnDfnActnOutputMustSupport());
		}
		/******************** PlnDfn_Actn_Output_Profile ********************************************************************************/
		if(p.getPlnDfnActnOutputProfile() != null) {
			plandefinitionactionoutput.addProfile(p.getPlnDfnActnOutputProfile());
		}
		/******************** plandefinitionactionoutputsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent plandefinitionactionoutputsort =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent();
		plandefinitionactionoutput.addSort(plandefinitionactionoutputsort);

		/******************** plandefinitionactionoutputsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory plandefinitionactionoutputsortdirection =  new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory();
		plandefinitionactionoutputsort.setDirection(plandefinitionactionoutputsortdirection.fromCode(p.getPlnDfnActnOutputSortDirection()));

		/******************** PlnDfn_Actn_Output_Sort_Path ********************************************************************************/
		if(p.getPlnDfnActnOutputSortPath() != null) {
			plandefinitionactionoutputsort.setPath(p.getPlnDfnActnOutputSortPath());
		}
		/******************** plandefinitionactionoutputsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionoutputsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionactionoutput.setSubject(plandefinitionactionoutputsubjectcodeableconcept);

		/******************** plandefinitionactionoutputsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionoutputsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactionoutputsubjectcodeableconcept.addCoding(plandefinitionactionoutputsubjectcodeableconceptcoding);

		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgCd() != null) {
			plandefinitionactionoutputsubjectcodeableconceptcoding.setCode(p.getPlnDfnActnOutputSbjctCdbleCncptCdgCd());
		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgDsply() != null) {
			plandefinitionactionoutputsubjectcodeableconceptcoding.setDisplay(p.getPlnDfnActnOutputSbjctCdbleCncptCdgDsply());
		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgSys() != null) {
			plandefinitionactionoutputsubjectcodeableconceptcoding.setSystem(p.getPlnDfnActnOutputSbjctCdbleCncptCdgSys());
		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd() != null) {
			plandefinitionactionoutputsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgVrsn() != null) {
			plandefinitionactionoutputsubjectcodeableconceptcoding.setVersion(p.getPlnDfnActnOutputSbjctCdbleCncptCdgVrsn());
		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptTxt() != null) {
			plandefinitionactionoutputsubjectcodeableconcept.setText(p.getPlnDfnActnOutputSbjctCdbleCncptTxt());
		}
		/******************** PlnDfn_Actn_Output_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctRfrnc() != null) {
			plandefinitionactionoutput.setSubject( new org.hl7.fhir.r4.model.Reference(p.getPlnDfnActnOutputSbjctRfrnc()));
		}
		/******************** PlnDfn_Actn_Output_Typ ********************************************************************************/
		if(p.getPlnDfnActnOutputTyp() != null) {
			plandefinitionactionoutput.setType(p.getPlnDfnActnOutputTyp());
		}
		/******************** plandefinitionactionparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionParticipantComponent plandefinitionactionparticipant =  new org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionParticipantComponent();
		plandefinitionaction.addParticipant(plandefinitionactionparticipant);

		/******************** plandefinitionactionparticipantrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionparticipantrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionactionparticipant.setRole(plandefinitionactionparticipantrole);

		/******************** plandefinitionactionparticipantrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionparticipantrolecoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactionparticipantrole.addCoding(plandefinitionactionparticipantrolecoding);

		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgCd() != null) {
			plandefinitionactionparticipantrolecoding.setCode(p.getPlnDfnActnPrtcpntRoleCdgCd());
		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgDsply() != null) {
			plandefinitionactionparticipantrolecoding.setDisplay(p.getPlnDfnActnPrtcpntRoleCdgDsply());
		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgSys() != null) {
			plandefinitionactionparticipantrolecoding.setSystem(p.getPlnDfnActnPrtcpntRoleCdgSys());
		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgUsrSltd() != null) {
			plandefinitionactionparticipantrolecoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnPrtcpntRoleCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgVrsn() != null) {
			plandefinitionactionparticipantrolecoding.setVersion(p.getPlnDfnActnPrtcpntRoleCdgVrsn());
		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Txt ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleTxt() != null) {
			plandefinitionactionparticipantrole.setText(p.getPlnDfnActnPrtcpntRoleTxt());
		}
		/******************** plandefinitionactionparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionParticipantTypeEnumFactory plandefinitionactionparticipanttype =  new org.hl7.fhir.r4.model.PlanDefinition.ActionParticipantTypeEnumFactory();
		plandefinitionactionparticipant.setType(plandefinitionactionparticipanttype.fromCode(p.getPlnDfnActnPrtcpntTyp()));

		/******************** plandefinitionactionprecheckbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionPrecheckBehaviorEnumFactory plandefinitionactionprecheckbehavior =  new org.hl7.fhir.r4.model.PlanDefinition.ActionPrecheckBehaviorEnumFactory();
		plandefinitionaction.setPrecheckBehavior(plandefinitionactionprecheckbehavior.fromCode(p.getPlnDfnActnPrecheckBehavior()));

		/******************** PlnDfn_Actn_Prefix ********************************************************************************/
		if(p.getPlnDfnActnPrefix() != null) {
			plandefinitionaction.setPrefix(p.getPlnDfnActnPrefix());
		}
		/******************** plandefinitionactionpriority ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.RequestPriorityEnumFactory plandefinitionactionpriority =  new org.hl7.fhir.r4.model.PlanDefinition.RequestPriorityEnumFactory();
		plandefinitionaction.setPriority(plandefinitionactionpriority.fromCode(p.getPlnDfnActnPriority()));

		/******************** plandefinitionactionreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionaction.addReason(plandefinitionactionreason);

		/******************** plandefinitionactionreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactionreason.addCoding(plandefinitionactionreasoncoding);

		/******************** PlnDfn_Actn_Rsn_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgCd() != null) {
			plandefinitionactionreasoncoding.setCode(p.getPlnDfnActnRsnCdgCd());
		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgDsply() != null) {
			plandefinitionactionreasoncoding.setDisplay(p.getPlnDfnActnRsnCdgDsply());
		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgSys() != null) {
			plandefinitionactionreasoncoding.setSystem(p.getPlnDfnActnRsnCdgSys());
		}
		/******************** PlnDfn_Actn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgUsrSltd() != null) {
			plandefinitionactionreasoncoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnRsnCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgVrsn() != null) {
			plandefinitionactionreasoncoding.setVersion(p.getPlnDfnActnRsnCdgVrsn());
		}
		/******************** PlnDfn_Actn_Rsn_Txt ********************************************************************************/
		if(p.getPlnDfnActnRsnTxt() != null) {
			plandefinitionactionreason.setText(p.getPlnDfnActnRsnTxt());
		}
		/******************** plandefinitionactionrelatedaction ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionRelatedActionComponent plandefinitionactionrelatedaction =  new org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionActionRelatedActionComponent();
		plandefinitionaction.addRelatedAction(plandefinitionactionrelatedaction);

		/******************** PlnDfn_Actn_RltedActn_ActnId ********************************************************************************/
		if(p.getPlnDfnActnRltedActnActnId() != null) {
			plandefinitionactionrelatedaction.setActionId(p.getPlnDfnActnRltedActnActnId());
		}
		/******************** plandefinitionactionrelatedactionoffduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactionrelatedactionoffduration =  new org.hl7.fhir.r4.model.Duration();
		plandefinitionactionrelatedaction.setOffset(plandefinitionactionrelatedactionoffduration);

		/******************** plandefinitionactionrelatedactionoffrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactionrelatedactionoffrange =  new org.hl7.fhir.r4.model.Range();
		plandefinitionactionrelatedaction.setOffset(plandefinitionactionrelatedactionoffrange);

		/******************** plandefinitionactionrelatedactionoffrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactionrelatedactionoffrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionactionrelatedactionoffrange.setHigh(plandefinitionactionrelatedactionoffrangehigh);

		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngHiCd() != null) {
			plandefinitionactionrelatedactionoffrangehigh.setCode(p.getPlnDfnActnRltedActnOffRngHiCd());
		}
		/******************** plandefinitionactionrelatedactionoffrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionactionrelatedactionoffrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionactionrelatedactionoffrangehigh.setComparator(plandefinitionactionrelatedactionoffrangehighcomparator.fromCode(p.getPlnDfnActnRltedActnOffRngHiCmprtr()));

		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngHiSys() != null) {
			plandefinitionactionrelatedactionoffrangehigh.setSystem(p.getPlnDfnActnRltedActnOffRngHiSys());
		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngHiUnt() != null) {
			plandefinitionactionrelatedactionoffrangehigh.setUnit(p.getPlnDfnActnRltedActnOffRngHiUnt());
		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngHiVl() != null) {
			plandefinitionactionrelatedactionoffrangehigh.setValue(Double.parseDouble((p.getPlnDfnActnRltedActnOffRngHiVl())));
		}
		/******************** plandefinitionactionrelatedactionoffrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactionrelatedactionoffrangelow =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionactionrelatedactionoffrange.setLow(plandefinitionactionrelatedactionoffrangelow);

		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngLwCd() != null) {
			plandefinitionactionrelatedactionoffrangelow.setCode(p.getPlnDfnActnRltedActnOffRngLwCd());
		}
		/******************** plandefinitionactionrelatedactionoffrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionactionrelatedactionoffrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionactionrelatedactionoffrangelow.setComparator(plandefinitionactionrelatedactionoffrangelowcomparator.fromCode(p.getPlnDfnActnRltedActnOffRngLwCmprtr()));

		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngLwSys() != null) {
			plandefinitionactionrelatedactionoffrangelow.setSystem(p.getPlnDfnActnRltedActnOffRngLwSys());
		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngLwUnt() != null) {
			plandefinitionactionrelatedactionoffrangelow.setUnit(p.getPlnDfnActnRltedActnOffRngLwUnt());
		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngLwVl() != null) {
			plandefinitionactionrelatedactionoffrangelow.setValue(Double.parseDouble((p.getPlnDfnActnRltedActnOffRngLwVl())));
		}
		/******************** plandefinitionactionrelatedactionrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionRelationshipTypeEnumFactory plandefinitionactionrelatedactionrelationship =  new org.hl7.fhir.r4.model.PlanDefinition.ActionRelationshipTypeEnumFactory();
		plandefinitionactionrelatedaction.setRelationship(plandefinitionactionrelatedactionrelationship.fromCode(p.getPlnDfnActnRltedActnRltnship()));

		/******************** plandefinitionactionrequiredbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionRequiredBehaviorEnumFactory plandefinitionactionrequiredbehavior =  new org.hl7.fhir.r4.model.PlanDefinition.ActionRequiredBehaviorEnumFactory();
		plandefinitionaction.setRequiredBehavior(plandefinitionactionrequiredbehavior.fromCode(p.getPlnDfnActnRequiredBehavior()));

		/******************** plandefinitionactionselectionbehavior ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.ActionSelectionBehaviorEnumFactory plandefinitionactionselectionbehavior =  new org.hl7.fhir.r4.model.PlanDefinition.ActionSelectionBehaviorEnumFactory();
		plandefinitionaction.setSelectionBehavior(plandefinitionactionselectionbehavior.fromCode(p.getPlnDfnActnSelectionBehavior()));

		/******************** plandefinitionactionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactionsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionaction.setSubject(plandefinitionactionsubjectcodeableconcept);

		/******************** plandefinitionactionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactionsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactionsubjectcodeableconcept.addCoding(plandefinitionactionsubjectcodeableconceptcoding);

		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgCd() != null) {
			plandefinitionactionsubjectcodeableconceptcoding.setCode(p.getPlnDfnActnSbjctCdbleCncptCdgCd());
		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgDsply() != null) {
			plandefinitionactionsubjectcodeableconceptcoding.setDisplay(p.getPlnDfnActnSbjctCdbleCncptCdgDsply());
		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgSys() != null) {
			plandefinitionactionsubjectcodeableconceptcoding.setSystem(p.getPlnDfnActnSbjctCdbleCncptCdgSys());
		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgUsrSltd() != null) {
			plandefinitionactionsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgVrsn() != null) {
			plandefinitionactionsubjectcodeableconceptcoding.setVersion(p.getPlnDfnActnSbjctCdbleCncptCdgVrsn());
		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptTxt() != null) {
			plandefinitionactionsubjectcodeableconcept.setText(p.getPlnDfnActnSbjctCdbleCncptTxt());
		}
		/******************** PlnDfn_Actn_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnActnSbjctRfrnc() != null) {
			plandefinitionaction.setSubject( new org.hl7.fhir.r4.model.Reference(p.getPlnDfnActnSbjctRfrnc()));
		}
		/******************** PlnDfn_Actn_TxtEquivalent ********************************************************************************/
		if(p.getPlnDfnActnTxtEquivalent() != null) {
			plandefinitionaction.setTextEquivalent(p.getPlnDfnActnTxtEquivalent());
		}
		/******************** plandefinitionactiontimingage ********************************************************************************/
		org.hl7.fhir.r4.model.Age plandefinitionactiontimingage =  new org.hl7.fhir.r4.model.Age();
		plandefinitionaction.setTiming(plandefinitionactiontimingage);

		/******************** PlnDfn_Actn_TmgDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnTmgDtTimeTyp() != null) {
			plandefinitionaction.setTiming( new org.hl7.fhir.r4.model.DateTimeType(p.getPlnDfnActnTmgDtTimeTyp()));
		}
		/******************** plandefinitionactiontimingduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontimingduration =  new org.hl7.fhir.r4.model.Duration();
		plandefinitionaction.setTiming(plandefinitionactiontimingduration);

		/******************** plandefinitionactiontimingperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontimingperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionaction.setTiming(plandefinitionactiontimingperiod);

		/******************** PlnDfn_Actn_TmgPrd_End ********************************************************************************/
		if(p.getPlnDfnActnTmgPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_TmgPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_TmgPrd_Enddate = PlnDfn_Actn_TmgPrd_Endsdf.parse(p.getPlnDfnActnTmgPrdEnd());
			plandefinitionactiontimingperiod.setEnd(PlnDfn_Actn_TmgPrd_Enddate);
		}
		/******************** PlnDfn_Actn_TmgPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnTmgPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_TmgPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_TmgPrd_Strtdate = PlnDfn_Actn_TmgPrd_Strtsdf.parse(p.getPlnDfnActnTmgPrdStrt());
			plandefinitionactiontimingperiod.setStart(PlnDfn_Actn_TmgPrd_Strtdate);
		}
		/******************** plandefinitionactiontimingrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactiontimingrange =  new org.hl7.fhir.r4.model.Range();
		plandefinitionaction.setTiming(plandefinitionactiontimingrange);

		/******************** plandefinitionactiontimingrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionactiontimingrange.setHigh(plandefinitionactiontimingrangehigh);

		/******************** PlnDfn_Actn_TmgRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgRngHiCd() != null) {
			plandefinitionactiontimingrangehigh.setCode(p.getPlnDfnActnTmgRngHiCd());
		}
		/******************** plandefinitionactiontimingrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionactiontimingrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionactiontimingrangehigh.setComparator(plandefinitionactiontimingrangehighcomparator.fromCode(p.getPlnDfnActnTmgRngHiCmprtr()));

		/******************** PlnDfn_Actn_TmgRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgRngHiSys() != null) {
			plandefinitionactiontimingrangehigh.setSystem(p.getPlnDfnActnTmgRngHiSys());
		}
		/******************** PlnDfn_Actn_TmgRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgRngHiUnt() != null) {
			plandefinitionactiontimingrangehigh.setUnit(p.getPlnDfnActnTmgRngHiUnt());
		}
		/******************** PlnDfn_Actn_TmgRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgRngHiVl() != null) {
			plandefinitionactiontimingrangehigh.setValue(Double.parseDouble((p.getPlnDfnActnTmgRngHiVl())));
		}
		/******************** plandefinitionactiontimingrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingrangelow =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionactiontimingrange.setLow(plandefinitionactiontimingrangelow);

		/******************** PlnDfn_Actn_TmgRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgRngLwCd() != null) {
			plandefinitionactiontimingrangelow.setCode(p.getPlnDfnActnTmgRngLwCd());
		}
		/******************** plandefinitionactiontimingrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionactiontimingrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionactiontimingrangelow.setComparator(plandefinitionactiontimingrangelowcomparator.fromCode(p.getPlnDfnActnTmgRngLwCmprtr()));

		/******************** PlnDfn_Actn_TmgRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgRngLwSys() != null) {
			plandefinitionactiontimingrangelow.setSystem(p.getPlnDfnActnTmgRngLwSys());
		}
		/******************** PlnDfn_Actn_TmgRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgRngLwUnt() != null) {
			plandefinitionactiontimingrangelow.setUnit(p.getPlnDfnActnTmgRngLwUnt());
		}
		/******************** PlnDfn_Actn_TmgRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgRngLwVl() != null) {
			plandefinitionactiontimingrangelow.setValue(Double.parseDouble((p.getPlnDfnActnTmgRngLwVl())));
		}
		/******************** plandefinitionactiontimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing plandefinitionactiontimingtiming =  new org.hl7.fhir.r4.model.Timing();
		plandefinitionaction.setTiming(plandefinitionactiontimingtiming);

		/******************** plandefinitionactiontimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontimingtimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionactiontimingtiming.setCode(plandefinitionactiontimingtimingcode);

		/******************** plandefinitionactiontimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontimingtimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactiontimingtimingcode.addCoding(plandefinitionactiontimingtimingcodecoding);

		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgCd() != null) {
			plandefinitionactiontimingtimingcodecoding.setCode(p.getPlnDfnActnTmgTmgCdCdgCd());
		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgDsply() != null) {
			plandefinitionactiontimingtimingcodecoding.setDisplay(p.getPlnDfnActnTmgTmgCdCdgDsply());
		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgSys() != null) {
			plandefinitionactiontimingtimingcodecoding.setSystem(p.getPlnDfnActnTmgTmgCdCdgSys());
		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgUsrSltd() != null) {
			plandefinitionactiontimingtimingcodecoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnTmgTmgCdCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgVrsn() != null) {
			plandefinitionactiontimingtimingcodecoding.setVersion(p.getPlnDfnActnTmgTmgCdCdgVrsn());
		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Txt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdTxt() != null) {
			plandefinitionactiontimingtimingcode.setText(p.getPlnDfnActnTmgTmgCdTxt());
		}
		/******************** PlnDfn_Actn_TmgTmg_Evnt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgEvnt() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_TmgTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_TmgTmg_Evntdate = PlnDfn_Actn_TmgTmg_Evntsdf.parse(p.getPlnDfnActnTmgTmgEvnt());
			plandefinitionactiontimingtiming.addEvent(PlnDfn_Actn_TmgTmg_Evntdate);
		}
		/******************** plandefinitionactiontimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent plandefinitionactiontimingtimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		plandefinitionactiontimingtiming.setRepeat(plandefinitionactiontimingtimingrepeat);

		/******************** plandefinitionactiontimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontimingtimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		plandefinitionactiontimingtimingrepeat.setBounds(plandefinitionactiontimingtimingrepeatboundsduration);

		/******************** plandefinitionactiontimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontimingtimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionactiontimingtimingrepeat.setBounds(plandefinitionactiontimingtimingrepeatboundsperiod);

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Enddate = PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Endsdf.parse(p.getPlnDfnActnTmgTmgRptBndsPrdEnd());
			plandefinitionactiontimingtimingrepeatboundsperiod.setEnd(PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Strtdate = PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Strtsdf.parse(p.getPlnDfnActnTmgTmgRptBndsPrdStrt());
			plandefinitionactiontimingtimingrepeatboundsperiod.setStart(PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactiontimingtimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		plandefinitionactiontimingtimingrepeat.setBounds(plandefinitionactiontimingtimingrepeatboundsrange);

		/******************** plandefinitionactiontimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingtimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionactiontimingtimingrepeatboundsrange.setHigh(plandefinitionactiontimingtimingrepeatboundsrangehigh);

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngHiCd() != null) {
			plandefinitionactiontimingtimingrepeatboundsrangehigh.setCode(p.getPlnDfnActnTmgTmgRptBndsRngHiCd());
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionactiontimingtimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionactiontimingtimingrepeatboundsrangehigh.setComparator(plandefinitionactiontimingtimingrepeatboundsrangehighcomparator.fromCode(p.getPlnDfnActnTmgTmgRptBndsRngHiCmprtr()));

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngHiSys() != null) {
			plandefinitionactiontimingtimingrepeatboundsrangehigh.setSystem(p.getPlnDfnActnTmgTmgRptBndsRngHiSys());
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngHiUnt() != null) {
			plandefinitionactiontimingtimingrepeatboundsrangehigh.setUnit(p.getPlnDfnActnTmgTmgRptBndsRngHiUnt());
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngHiVl() != null) {
			plandefinitionactiontimingtimingrepeatboundsrangehigh.setValue(Double.parseDouble((p.getPlnDfnActnTmgTmgRptBndsRngHiVl())));
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontimingtimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionactiontimingtimingrepeatboundsrange.setLow(plandefinitionactiontimingtimingrepeatboundsrangelow);

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngLwCd() != null) {
			plandefinitionactiontimingtimingrepeatboundsrangelow.setCode(p.getPlnDfnActnTmgTmgRptBndsRngLwCd());
		}
		/******************** plandefinitionactiontimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionactiontimingtimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionactiontimingtimingrepeatboundsrangelow.setComparator(plandefinitionactiontimingtimingrepeatboundsrangelowcomparator.fromCode(p.getPlnDfnActnTmgTmgRptBndsRngLwCmprtr()));

		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngLwSys() != null) {
			plandefinitionactiontimingtimingrepeatboundsrangelow.setSystem(p.getPlnDfnActnTmgTmgRptBndsRngLwSys());
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngLwUnt() != null) {
			plandefinitionactiontimingtimingrepeatboundsrangelow.setUnit(p.getPlnDfnActnTmgTmgRptBndsRngLwUnt());
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngLwVl() != null) {
			plandefinitionactiontimingtimingrepeatboundsrangelow.setValue(Double.parseDouble((p.getPlnDfnActnTmgTmgRptBndsRngLwVl())));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptCnt() != null) {
			plandefinitionactiontimingtimingrepeat.setCount(Integer.parseInt(p.getPlnDfnActnTmgTmgRptCnt()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptCntMx() != null) {
			plandefinitionactiontimingtimingrepeat.setCountMax(Integer.parseInt(p.getPlnDfnActnTmgTmgRptCntMx()));
		}
		/******************** plandefinitionactiontimingtimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory plandefinitionactiontimingtimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		plandefinitionactiontimingtimingrepeat.addDayOfWeek(plandefinitionactiontimingtimingrepeatdayofweek.fromCode(p.getPlnDfnActnTmgTmgRptDayOfWeek()));

		/******************** PlnDfn_Actn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptDuration() != null) {
			plandefinitionactiontimingtimingrepeat.setDuration(Double.parseDouble((p.getPlnDfnActnTmgTmgRptDuration())));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptDurationMx() != null) {
			plandefinitionactiontimingtimingrepeat.setDurationMax(Double.parseDouble((p.getPlnDfnActnTmgTmgRptDurationMx())));
		}
		/******************** plandefinitionactiontimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory plandefinitionactiontimingtimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		plandefinitionactiontimingtimingrepeat.setDurationUnit(plandefinitionactiontimingtimingrepeatdurationunit.fromCode(p.getPlnDfnActnTmgTmgRptDurationUnt()));

		/******************** PlnDfn_Actn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptFrqncy() != null) {
			plandefinitionactiontimingtimingrepeat.setFrequency(Integer.parseInt(p.getPlnDfnActnTmgTmgRptFrqncy()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptFrqncyMx() != null) {
			plandefinitionactiontimingtimingrepeat.setFrequencyMax(Integer.parseInt(p.getPlnDfnActnTmgTmgRptFrqncyMx()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Off ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptOff() != null) {
			plandefinitionactiontimingtimingrepeat.setOffset(Integer.parseInt(p.getPlnDfnActnTmgTmgRptOff()));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptPrd() != null) {
			plandefinitionactiontimingtimingrepeat.setPeriod(Double.parseDouble((p.getPlnDfnActnTmgTmgRptPrd())));
		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptPrdMx() != null) {
			plandefinitionactiontimingtimingrepeat.setPeriodMax(Double.parseDouble((p.getPlnDfnActnTmgTmgRptPrdMx())));
		}
		/******************** plandefinitionactiontimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory plandefinitionactiontimingtimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		plandefinitionactiontimingtimingrepeat.setPeriodUnit(plandefinitionactiontimingtimingrepeatperiodunit.fromCode(p.getPlnDfnActnTmgTmgRptPrdUnt()));

		/******************** PlnDfn_Actn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptTimeOfDay() != null) {
			plandefinitionactiontimingtimingrepeat.addTimeOfDay(p.getPlnDfnActnTmgTmgRptTimeOfDay());
		}
		/******************** plandefinitionactiontimingtimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory plandefinitionactiontimingtimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		plandefinitionactiontimingtimingrepeat.addWhen(plandefinitionactiontimingtimingrepeatwhen.fromCode(p.getPlnDfnActnTmgTmgRptWhen()));

		/******************** PlnDfn_Actn_Ttl ********************************************************************************/
		if(p.getPlnDfnActnTtl() != null) {
			plandefinitionaction.setTitle(p.getPlnDfnActnTtl());
		}
		/******************** PlnDfn_Actn_Transform ********************************************************************************/
		if(p.getPlnDfnActnTransform() != null) {
			plandefinitionaction.setTransform(p.getPlnDfnActnTransform());
		}
		/******************** plandefinitionactiontrigger ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition plandefinitionactiontrigger =  new org.hl7.fhir.r4.model.TriggerDefinition();
		plandefinitionaction.addTrigger(plandefinitionactiontrigger);

		/******************** plandefinitionactiontriggercondition ********************************************************************************/
		org.hl7.fhir.r4.model.Expression plandefinitionactiontriggercondition =  new org.hl7.fhir.r4.model.Expression();
		plandefinitionactiontrigger.setCondition(plandefinitionactiontriggercondition);

		/******************** PlnDfn_Actn_Trgr_Cndtn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnDscrptn() != null) {
			plandefinitionactiontriggercondition.setDescription(p.getPlnDfnActnTrgrCndtnDscrptn());
		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Exprsn ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnExprsn() != null) {
			plandefinitionactiontriggercondition.setExpression(p.getPlnDfnActnTrgrCndtnExprsn());
		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Lnguage ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnLnguage() != null) {
			plandefinitionactiontriggercondition.setLanguage(p.getPlnDfnActnTrgrCndtnLnguage());
		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Nm ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnNm() != null) {
			plandefinitionactiontriggercondition.setName(p.getPlnDfnActnTrgrCndtnNm());
		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Rfrnc ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnRfrnc() != null) {
			plandefinitionactiontriggercondition.setReference(p.getPlnDfnActnTrgrCndtnRfrnc());
		}
		/******************** plandefinitionactiontriggerdata ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement plandefinitionactiontriggerdata =  new org.hl7.fhir.r4.model.DataRequirement();
		plandefinitionactiontrigger.addData(plandefinitionactiontriggerdata);

		/******************** plandefinitionactiontriggerdatacodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent plandefinitionactiontriggerdatacodefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent();
		plandefinitionactiontriggerdata.addCodeFilter(plandefinitionactiontriggerdatacodefilter);

		/******************** plandefinitionactiontriggerdatacodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontriggerdatacodefiltercode =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactiontriggerdatacodefilter.addCode(plandefinitionactiontriggerdatacodefiltercode);

		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdCd() != null) {
			plandefinitionactiontriggerdatacodefiltercode.setCode(p.getPlnDfnActnTrgrDataCdFltrCdCd());
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdDsply() != null) {
			plandefinitionactiontriggerdatacodefiltercode.setDisplay(p.getPlnDfnActnTrgrDataCdFltrCdDsply());
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdSys() != null) {
			plandefinitionactiontriggerdatacodefiltercode.setSystem(p.getPlnDfnActnTrgrDataCdFltrCdSys());
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdUsrSltd() != null) {
			plandefinitionactiontriggerdatacodefiltercode.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnTrgrDataCdFltrCdUsrSltd()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdVrsn() != null) {
			plandefinitionactiontriggerdatacodefiltercode.setVersion(p.getPlnDfnActnTrgrDataCdFltrCdVrsn());
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrPath() != null) {
			plandefinitionactiontriggerdatacodefilter.setPath(p.getPlnDfnActnTrgrDataCdFltrPath());
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrSrchParam() != null) {
			plandefinitionactiontriggerdatacodefilter.setSearchParam(p.getPlnDfnActnTrgrDataCdFltrSrchParam());
		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_VlSt ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrVlSt() != null) {
			plandefinitionactiontriggerdatacodefilter.setValueSet(p.getPlnDfnActnTrgrDataCdFltrVlSt());
		}
		/******************** plandefinitionactiontriggerdatadatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent plandefinitionactiontriggerdatadatefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent();
		plandefinitionactiontriggerdata.addDateFilter(plandefinitionactiontriggerdatadatefilter);

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrPath() != null) {
			plandefinitionactiontriggerdatadatefilter.setPath(p.getPlnDfnActnTrgrDataDtFltrPath());
		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrSrchParam() != null) {
			plandefinitionactiontriggerdatadatefilter.setSearchParam(p.getPlnDfnActnTrgrDataDtFltrSrchParam());
		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlDtTimeTyp() != null) {
			plandefinitionactiontriggerdatadatefilter.setValue( new org.hl7.fhir.r4.model.DateTimeType(p.getPlnDfnActnTrgrDataDtFltrVlDtTimeTyp()));
		}
		/******************** plandefinitionactiontriggerdatadatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontriggerdatadatefiltervalueduration =  new org.hl7.fhir.r4.model.Duration();
		plandefinitionactiontriggerdatadatefilter.setValue(plandefinitionactiontriggerdatadatefiltervalueduration);

		/******************** plandefinitionactiontriggerdatadatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontriggerdatadatefiltervalueperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionactiontriggerdatadatefilter.setValue(plandefinitionactiontriggerdatadatefiltervalueperiod);

		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Enddate = PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Endsdf.parse(p.getPlnDfnActnTrgrDataDtFltrVlPrdEnd());
			plandefinitionactiontriggerdatadatefiltervalueperiod.setEnd(PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Enddate);
		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Strtdate = PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Strtsdf.parse(p.getPlnDfnActnTrgrDataDtFltrVlPrdStrt());
			plandefinitionactiontriggerdatadatefiltervalueperiod.setStart(PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Strtdate);
		}
		/******************** PlnDfn_Actn_Trgr_Data_Lmt ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataLmt() != null) {
			plandefinitionactiontriggerdata.setLimit(Integer.parseInt(p.getPlnDfnActnTrgrDataLmt()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_MustSupport ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataMustSupport() != null) {
			plandefinitionactiontriggerdata.addMustSupport(p.getPlnDfnActnTrgrDataMustSupport());
		}
		/******************** PlnDfn_Actn_Trgr_Data_Profile ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataProfile() != null) {
			plandefinitionactiontriggerdata.addProfile(p.getPlnDfnActnTrgrDataProfile());
		}
		/******************** plandefinitionactiontriggerdatasort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent plandefinitionactiontriggerdatasort =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent();
		plandefinitionactiontriggerdata.addSort(plandefinitionactiontriggerdatasort);

		/******************** plandefinitionactiontriggerdatasortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory plandefinitionactiontriggerdatasortdirection =  new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory();
		plandefinitionactiontriggerdatasort.setDirection(plandefinitionactiontriggerdatasortdirection.fromCode(p.getPlnDfnActnTrgrDataSortDirection()));

		/******************** PlnDfn_Actn_Trgr_Data_Sort_Path ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSortPath() != null) {
			plandefinitionactiontriggerdatasort.setPath(p.getPlnDfnActnTrgrDataSortPath());
		}
		/******************** plandefinitionactiontriggerdatasubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontriggerdatasubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionactiontriggerdata.setSubject(plandefinitionactiontriggerdatasubjectcodeableconcept);

		/******************** plandefinitionactiontriggerdatasubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontriggerdatasubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactiontriggerdatasubjectcodeableconcept.addCoding(plandefinitionactiontriggerdatasubjectcodeableconceptcoding);

		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd() != null) {
			plandefinitionactiontriggerdatasubjectcodeableconceptcoding.setCode(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd());
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply() != null) {
			plandefinitionactiontriggerdatasubjectcodeableconceptcoding.setDisplay(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply());
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys() != null) {
			plandefinitionactiontriggerdatasubjectcodeableconceptcoding.setSystem(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys());
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd() != null) {
			plandefinitionactiontriggerdatasubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn() != null) {
			plandefinitionactiontriggerdatasubjectcodeableconceptcoding.setVersion(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn());
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptTxt() != null) {
			plandefinitionactiontriggerdatasubjectcodeableconcept.setText(p.getPlnDfnActnTrgrDataSbjctCdbleCncptTxt());
		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctRfrnc() != null) {
			plandefinitionactiontriggerdata.setSubject( new org.hl7.fhir.r4.model.Reference(p.getPlnDfnActnTrgrDataSbjctRfrnc()));
		}
		/******************** PlnDfn_Actn_Trgr_Data_Typ ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataTyp() != null) {
			plandefinitionactiontriggerdata.setType(p.getPlnDfnActnTrgrDataTyp());
		}
		/******************** PlnDfn_Actn_Trgr_Nm ********************************************************************************/
		if(p.getPlnDfnActnTrgrNm() != null) {
			plandefinitionactiontrigger.setName(p.getPlnDfnActnTrgrNm());
		}
		/******************** PlnDfn_Actn_Trgr_TmgDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgDtTimeTyp() != null) {
			plandefinitionactiontrigger.setTiming( new org.hl7.fhir.r4.model.DateTimeType(p.getPlnDfnActnTrgrTmgDtTimeTyp()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgDtTyp ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgDtTyp() != null) {
			plandefinitionactiontrigger.setTiming( new org.hl7.fhir.r4.model.DateType(p.getPlnDfnActnTrgrTmgDtTyp()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgRfrnc ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgRfrnc() != null) {
			plandefinitionactiontrigger.setTiming( new org.hl7.fhir.r4.model.Reference(p.getPlnDfnActnTrgrTmgRfrnc()));
		}
		/******************** plandefinitionactiontriggertimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing plandefinitionactiontriggertimingtiming =  new org.hl7.fhir.r4.model.Timing();
		plandefinitionactiontrigger.setTiming(plandefinitionactiontriggertimingtiming);

		/******************** plandefinitionactiontriggertimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontriggertimingtimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionactiontriggertimingtiming.setCode(plandefinitionactiontriggertimingtimingcode);

		/******************** plandefinitionactiontriggertimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontriggertimingtimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactiontriggertimingtimingcode.addCoding(plandefinitionactiontriggertimingtimingcodecoding);

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgCd() != null) {
			plandefinitionactiontriggertimingtimingcodecoding.setCode(p.getPlnDfnActnTrgrTmgTmgCdCdgCd());
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgDsply() != null) {
			plandefinitionactiontriggertimingtimingcodecoding.setDisplay(p.getPlnDfnActnTrgrTmgTmgCdCdgDsply());
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgSys() != null) {
			plandefinitionactiontriggertimingtimingcodecoding.setSystem(p.getPlnDfnActnTrgrTmgTmgCdCdgSys());
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgUsrSltd() != null) {
			plandefinitionactiontriggertimingtimingcodecoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnTrgrTmgTmgCdCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgVrsn() != null) {
			plandefinitionactiontriggertimingtimingcodecoding.setVersion(p.getPlnDfnActnTrgrTmgTmgCdCdgVrsn());
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Txt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdTxt() != null) {
			plandefinitionactiontriggertimingtimingcode.setText(p.getPlnDfnActnTrgrTmgTmgCdTxt());
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Evnt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgEvnt() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Trgr_TmgTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Trgr_TmgTmg_Evntdate = PlnDfn_Actn_Trgr_TmgTmg_Evntsdf.parse(p.getPlnDfnActnTrgrTmgTmgEvnt());
			plandefinitionactiontriggertimingtiming.addEvent(PlnDfn_Actn_Trgr_TmgTmg_Evntdate);
		}
		/******************** plandefinitionactiontriggertimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent plandefinitionactiontriggertimingtimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		plandefinitionactiontriggertimingtiming.setRepeat(plandefinitionactiontriggertimingtimingrepeat);

		/******************** plandefinitionactiontriggertimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitionactiontriggertimingtimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		plandefinitionactiontriggertimingtimingrepeat.setBounds(plandefinitionactiontriggertimingtimingrepeatboundsduration);

		/******************** plandefinitionactiontriggertimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionactiontriggertimingtimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionactiontriggertimingtimingrepeat.setBounds(plandefinitionactiontriggertimingtimingrepeatboundsperiod);

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Enddate = PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Endsdf.parse(p.getPlnDfnActnTrgrTmgTmgRptBndsPrdEnd());
			plandefinitionactiontriggertimingtimingrepeatboundsperiod.setEnd(PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Strtdate = PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Strtsdf.parse(p.getPlnDfnActnTrgrTmgTmgRptBndsPrdStrt());
			plandefinitionactiontriggertimingtimingrepeatboundsperiod.setStart(PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionactiontriggertimingtimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		plandefinitionactiontriggertimingtimingrepeat.setBounds(plandefinitionactiontriggertimingtimingrepeatboundsrange);

		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontriggertimingtimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionactiontriggertimingtimingrepeatboundsrange.setHigh(plandefinitionactiontriggertimingtimingrepeatboundsrangehigh);

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiCd() != null) {
			plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.setCode(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiCd());
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.setComparator(plandefinitionactiontriggertimingtimingrepeatboundsrangehighcomparator.fromCode(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiCmprtr()));

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiSys() != null) {
			plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.setSystem(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiSys());
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiUnt() != null) {
			plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.setUnit(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiUnt());
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiVl() != null) {
			plandefinitionactiontriggertimingtimingrepeatboundsrangehigh.setValue(Double.parseDouble((p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiVl())));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionactiontriggertimingtimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionactiontriggertimingtimingrepeatboundsrange.setLow(plandefinitionactiontriggertimingtimingrepeatboundsrangelow);

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwCd() != null) {
			plandefinitionactiontriggertimingtimingrepeatboundsrangelow.setCode(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwCd());
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionactiontriggertimingtimingrepeatboundsrangelow.setComparator(plandefinitionactiontriggertimingtimingrepeatboundsrangelowcomparator.fromCode(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwCmprtr()));

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwSys() != null) {
			plandefinitionactiontriggertimingtimingrepeatboundsrangelow.setSystem(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwSys());
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwUnt() != null) {
			plandefinitionactiontriggertimingtimingrepeatboundsrangelow.setUnit(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwUnt());
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwVl() != null) {
			plandefinitionactiontriggertimingtimingrepeatboundsrangelow.setValue(Double.parseDouble((p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwVl())));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptCnt() != null) {
			plandefinitionactiontriggertimingtimingrepeat.setCount(Integer.parseInt(p.getPlnDfnActnTrgrTmgTmgRptCnt()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptCntMx() != null) {
			plandefinitionactiontriggertimingtimingrepeat.setCountMax(Integer.parseInt(p.getPlnDfnActnTrgrTmgTmgRptCntMx()));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory plandefinitionactiontriggertimingtimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		plandefinitionactiontriggertimingtimingrepeat.addDayOfWeek(plandefinitionactiontriggertimingtimingrepeatdayofweek.fromCode(p.getPlnDfnActnTrgrTmgTmgRptDayOfWeek()));

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Duration ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptDuration() != null) {
			plandefinitionactiontriggertimingtimingrepeat.setDuration(Double.parseDouble((p.getPlnDfnActnTrgrTmgTmgRptDuration())));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptDurationMx() != null) {
			plandefinitionactiontriggertimingtimingrepeat.setDurationMax(Double.parseDouble((p.getPlnDfnActnTrgrTmgTmgRptDurationMx())));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory plandefinitionactiontriggertimingtimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		plandefinitionactiontriggertimingtimingrepeat.setDurationUnit(plandefinitionactiontriggertimingtimingrepeatdurationunit.fromCode(p.getPlnDfnActnTrgrTmgTmgRptDurationUnt()));

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptFrqncy() != null) {
			plandefinitionactiontriggertimingtimingrepeat.setFrequency(Integer.parseInt(p.getPlnDfnActnTrgrTmgTmgRptFrqncy()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptFrqncyMx() != null) {
			plandefinitionactiontriggertimingtimingrepeat.setFrequencyMax(Integer.parseInt(p.getPlnDfnActnTrgrTmgTmgRptFrqncyMx()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Off ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptOff() != null) {
			plandefinitionactiontriggertimingtimingrepeat.setOffset(Integer.parseInt(p.getPlnDfnActnTrgrTmgTmgRptOff()));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Prd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptPrd() != null) {
			plandefinitionactiontriggertimingtimingrepeat.setPeriod(Double.parseDouble((p.getPlnDfnActnTrgrTmgTmgRptPrd())));
		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptPrdMx() != null) {
			plandefinitionactiontriggertimingtimingrepeat.setPeriodMax(Double.parseDouble((p.getPlnDfnActnTrgrTmgTmgRptPrdMx())));
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory plandefinitionactiontriggertimingtimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		plandefinitionactiontriggertimingtimingrepeat.setPeriodUnit(plandefinitionactiontriggertimingtimingrepeatperiodunit.fromCode(p.getPlnDfnActnTrgrTmgTmgRptPrdUnt()));

		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptTimeOfDay() != null) {
			plandefinitionactiontriggertimingtimingrepeat.addTimeOfDay(p.getPlnDfnActnTrgrTmgTmgRptTimeOfDay());
		}
		/******************** plandefinitionactiontriggertimingtimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory plandefinitionactiontriggertimingtimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		plandefinitionactiontriggertimingtimingrepeat.addWhen(plandefinitionactiontriggertimingtimingrepeatwhen.fromCode(p.getPlnDfnActnTrgrTmgTmgRptWhen()));

		/******************** plandefinitionactiontriggertype ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition.TriggerTypeEnumFactory plandefinitionactiontriggertype =  new org.hl7.fhir.r4.model.TriggerDefinition.TriggerTypeEnumFactory();
		plandefinitionactiontrigger.setType(plandefinitionactiontriggertype.fromCode(p.getPlnDfnActnTrgrTyp()));

		/******************** plandefinitionactiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionactiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionaction.setType(plandefinitionactiontype);

		/******************** plandefinitionactiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionactiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionactiontype.addCoding(plandefinitionactiontypecoding);

		/******************** PlnDfn_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnTypCdgCd() != null) {
			plandefinitionactiontypecoding.setCode(p.getPlnDfnActnTypCdgCd());
		}
		/******************** PlnDfn_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTypCdgDsply() != null) {
			plandefinitionactiontypecoding.setDisplay(p.getPlnDfnActnTypCdgDsply());
		}
		/******************** PlnDfn_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnTypCdgSys() != null) {
			plandefinitionactiontypecoding.setSystem(p.getPlnDfnActnTypCdgSys());
		}
		/******************** PlnDfn_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTypCdgUsrSltd() != null) {
			plandefinitionactiontypecoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnActnTypCdgUsrSltd()));
		}
		/******************** PlnDfn_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTypCdgVrsn() != null) {
			plandefinitionactiontypecoding.setVersion(p.getPlnDfnActnTypCdgVrsn());
		}
		/******************** PlnDfn_Actn_Typ_Txt ********************************************************************************/
		if(p.getPlnDfnActnTypTxt() != null) {
			plandefinitionactiontype.setText(p.getPlnDfnActnTypTxt());
		}
		/******************** PlnDfn_ApprovalDt ********************************************************************************/
		if(p.getPlnDfnApprovalDt() != null) {
			java.text.SimpleDateFormat PlnDfn_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_ApprovalDtdate = PlnDfn_ApprovalDtsdf.parse(p.getPlnDfnApprovalDt());
			plandefinition.setApprovalDate(PlnDfn_ApprovalDtdate);
		}
		/******************** plandefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitionauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		plandefinition.addAuthor(plandefinitionauthor);

		/******************** PlnDfn_Athr_Nm ********************************************************************************/
		if(p.getPlnDfnAthrNm() != null) {
			plandefinitionauthor.setName(p.getPlnDfnAthrNm());
		}
		/******************** plandefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitionauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		plandefinitionauthor.addTelecom(plandefinitionauthortelecom);

		/******************** plandefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionauthortelecom.setPeriod(plandefinitionauthortelecomperiod);

		/******************** PlnDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Athr_Tlcm_Prd_Enddate = PlnDfn_Athr_Tlcm_Prd_Endsdf.parse(p.getPlnDfnAthrTlcmPrdEnd());
			plandefinitionauthortelecomperiod.setEnd(PlnDfn_Athr_Tlcm_Prd_Enddate);
		}
		/******************** PlnDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Athr_Tlcm_Prd_Strtdate = PlnDfn_Athr_Tlcm_Prd_Strtsdf.parse(p.getPlnDfnAthrTlcmPrdStrt());
			plandefinitionauthortelecomperiod.setStart(PlnDfn_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** PlnDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnAthrTlcmRnk() != null) {
			plandefinitionauthortelecom.setRank(Integer.parseInt(p.getPlnDfnAthrTlcmRnk()));
		}
		/******************** plandefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory plandefinitionauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		plandefinitionauthortelecom.setSystem(plandefinitionauthortelecomsystem.fromCode(p.getPlnDfnAthrTlcmSys()));

		/******************** plandefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory plandefinitionauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		plandefinitionauthortelecom.setUse(plandefinitionauthortelecomuse.fromCode(p.getPlnDfnAthrTlcmUse()));

		/******************** PlnDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnAthrTlcmVl() != null) {
			plandefinitionauthortelecom.setValue(p.getPlnDfnAthrTlcmVl());
		}
		/******************** plandefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		plandefinition.addContact(plandefinitioncontact);

		/******************** PlnDfn_Cntct_Nm ********************************************************************************/
		if(p.getPlnDfnCntctNm() != null) {
			plandefinitioncontact.setName(p.getPlnDfnCntctNm());
		}
		/******************** plandefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		plandefinitioncontact.addTelecom(plandefinitioncontacttelecom);

		/******************** plandefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitioncontacttelecom.setPeriod(plandefinitioncontacttelecomperiod);

		/******************** PlnDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Cntct_Tlcm_Prd_Enddate = PlnDfn_Cntct_Tlcm_Prd_Endsdf.parse(p.getPlnDfnCntctTlcmPrdEnd());
			plandefinitioncontacttelecomperiod.setEnd(PlnDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** PlnDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Cntct_Tlcm_Prd_Strtdate = PlnDfn_Cntct_Tlcm_Prd_Strtsdf.parse(p.getPlnDfnCntctTlcmPrdStrt());
			plandefinitioncontacttelecomperiod.setStart(PlnDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** PlnDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnCntctTlcmRnk() != null) {
			plandefinitioncontacttelecom.setRank(Integer.parseInt(p.getPlnDfnCntctTlcmRnk()));
		}
		/******************** plandefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory plandefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		plandefinitioncontacttelecom.setSystem(plandefinitioncontacttelecomsystem.fromCode(p.getPlnDfnCntctTlcmSys()));

		/******************** plandefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory plandefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		plandefinitioncontacttelecom.setUse(plandefinitioncontacttelecomuse.fromCode(p.getPlnDfnCntctTlcmUse()));

		/******************** PlnDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnCntctTlcmVl() != null) {
			plandefinitioncontacttelecom.setValue(p.getPlnDfnCntctTlcmVl());
		}
		/******************** PlnDfn_Copyright ********************************************************************************/
		if(p.getPlnDfnCopyright() != null) {
			plandefinition.setCopyright(p.getPlnDfnCopyright());
		}
		/******************** PlnDfn_Dt ********************************************************************************/
		if(p.getPlnDfnDt() != null) {
			java.text.SimpleDateFormat PlnDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Dtdate = PlnDfn_Dtsdf.parse(p.getPlnDfnDt());
			plandefinition.setDate(PlnDfn_Dtdate);
		}
		/******************** PlnDfn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnDscrptn() != null) {
			plandefinition.setDescription(p.getPlnDfnDscrptn());
		}
		/******************** plandefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitioneditor =  new org.hl7.fhir.r4.model.ContactDetail();
		plandefinition.addEditor(plandefinitioneditor);

		/******************** PlnDfn_Editor_Nm ********************************************************************************/
		if(p.getPlnDfnEditorNm() != null) {
			plandefinitioneditor.setName(p.getPlnDfnEditorNm());
		}
		/******************** plandefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitioneditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		plandefinitioneditor.addTelecom(plandefinitioneditortelecom);

		/******************** plandefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitioneditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitioneditortelecom.setPeriod(plandefinitioneditortelecomperiod);

		/******************** PlnDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Editor_Tlcm_Prd_Enddate = PlnDfn_Editor_Tlcm_Prd_Endsdf.parse(p.getPlnDfnEditorTlcmPrdEnd());
			plandefinitioneditortelecomperiod.setEnd(PlnDfn_Editor_Tlcm_Prd_Enddate);
		}
		/******************** PlnDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Editor_Tlcm_Prd_Strtdate = PlnDfn_Editor_Tlcm_Prd_Strtsdf.parse(p.getPlnDfnEditorTlcmPrdStrt());
			plandefinitioneditortelecomperiod.setStart(PlnDfn_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** PlnDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnEditorTlcmRnk() != null) {
			plandefinitioneditortelecom.setRank(Integer.parseInt(p.getPlnDfnEditorTlcmRnk()));
		}
		/******************** plandefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory plandefinitioneditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		plandefinitioneditortelecom.setSystem(plandefinitioneditortelecomsystem.fromCode(p.getPlnDfnEditorTlcmSys()));

		/******************** plandefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory plandefinitioneditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		plandefinitioneditortelecom.setUse(plandefinitioneditortelecomuse.fromCode(p.getPlnDfnEditorTlcmUse()));

		/******************** PlnDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnEditorTlcmVl() != null) {
			plandefinitioneditortelecom.setValue(p.getPlnDfnEditorTlcmVl());
		}
		/******************** plandefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitioneffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinition.setEffectivePeriod(plandefinitioneffectiveperiod);

		/******************** PlnDfn_EfctivePrd_End ********************************************************************************/
		if(p.getPlnDfnEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_EfctivePrd_Enddate = PlnDfn_EfctivePrd_Endsdf.parse(p.getPlnDfnEfctivePrdEnd());
			plandefinitioneffectiveperiod.setEnd(PlnDfn_EfctivePrd_Enddate);
		}
		/******************** PlnDfn_EfctivePrd_Strt ********************************************************************************/
		if(p.getPlnDfnEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_EfctivePrd_Strtdate = PlnDfn_EfctivePrd_Strtsdf.parse(p.getPlnDfnEfctivePrdStrt());
			plandefinitioneffectiveperiod.setStart(PlnDfn_EfctivePrd_Strtdate);
		}
		/******************** plandefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitionendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		plandefinition.addEndorser(plandefinitionendorser);

		/******************** PlnDfn_Endsr_Nm ********************************************************************************/
		if(p.getPlnDfnEndsrNm() != null) {
			plandefinitionendorser.setName(p.getPlnDfnEndsrNm());
		}
		/******************** plandefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitionendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		plandefinitionendorser.addTelecom(plandefinitionendorsertelecom);

		/******************** plandefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionendorsertelecom.setPeriod(plandefinitionendorsertelecomperiod);

		/******************** PlnDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Endsr_Tlcm_Prd_Enddate = PlnDfn_Endsr_Tlcm_Prd_Endsdf.parse(p.getPlnDfnEndsrTlcmPrdEnd());
			plandefinitionendorsertelecomperiod.setEnd(PlnDfn_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** PlnDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Endsr_Tlcm_Prd_Strtdate = PlnDfn_Endsr_Tlcm_Prd_Strtsdf.parse(p.getPlnDfnEndsrTlcmPrdStrt());
			plandefinitionendorsertelecomperiod.setStart(PlnDfn_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** PlnDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmRnk() != null) {
			plandefinitionendorsertelecom.setRank(Integer.parseInt(p.getPlnDfnEndsrTlcmRnk()));
		}
		/******************** plandefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory plandefinitionendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		plandefinitionendorsertelecom.setSystem(plandefinitionendorsertelecomsystem.fromCode(p.getPlnDfnEndsrTlcmSys()));

		/******************** plandefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory plandefinitionendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		plandefinitionendorsertelecom.setUse(plandefinitionendorsertelecomuse.fromCode(p.getPlnDfnEndsrTlcmUse()));

		/******************** PlnDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmVl() != null) {
			plandefinitionendorsertelecom.setValue(p.getPlnDfnEndsrTlcmVl());
		}
		/******************** PlnDfn_Exprmtl ********************************************************************************/
		if(p.getPlnDfnExprmtl() != null) {
			plandefinition.setExperimental(Boolean.parseBoolean(p.getPlnDfnExprmtl()));
		}
		/******************** plandefinitiongoal ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalComponent plandefinitiongoal =  new org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalComponent();
		plandefinition.addGoal(plandefinitiongoal);

		/******************** plandefinitiongoaladdresses ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoaladdresses =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitiongoal.addAddresses(plandefinitiongoaladdresses);

		/******************** plandefinitiongoaladdressescoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoaladdressescoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitiongoaladdresses.addCoding(plandefinitiongoaladdressescoding);

		/******************** PlnDfn_Goal_Addres_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgCd() != null) {
			plandefinitiongoaladdressescoding.setCode(p.getPlnDfnGoalAddresCdgCd());
		}
		/******************** PlnDfn_Goal_Addres_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgDsply() != null) {
			plandefinitiongoaladdressescoding.setDisplay(p.getPlnDfnGoalAddresCdgDsply());
		}
		/******************** PlnDfn_Goal_Addres_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgSys() != null) {
			plandefinitiongoaladdressescoding.setSystem(p.getPlnDfnGoalAddresCdgSys());
		}
		/******************** PlnDfn_Goal_Addres_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgUsrSltd() != null) {
			plandefinitiongoaladdressescoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnGoalAddresCdgUsrSltd()));
		}
		/******************** PlnDfn_Goal_Addres_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgVrsn() != null) {
			plandefinitiongoaladdressescoding.setVersion(p.getPlnDfnGoalAddresCdgVrsn());
		}
		/******************** PlnDfn_Goal_Addres_Txt ********************************************************************************/
		if(p.getPlnDfnGoalAddresTxt() != null) {
			plandefinitiongoaladdresses.setText(p.getPlnDfnGoalAddresTxt());
		}
		/******************** plandefinitiongoalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoalcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitiongoal.setCategory(plandefinitiongoalcategory);

		/******************** plandefinitiongoalcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoalcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitiongoalcategory.addCoding(plandefinitiongoalcategorycoding);

		/******************** PlnDfn_Goal_Ctgry_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgCd() != null) {
			plandefinitiongoalcategorycoding.setCode(p.getPlnDfnGoalCtgryCdgCd());
		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgDsply() != null) {
			plandefinitiongoalcategorycoding.setDisplay(p.getPlnDfnGoalCtgryCdgDsply());
		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgSys() != null) {
			plandefinitiongoalcategorycoding.setSystem(p.getPlnDfnGoalCtgryCdgSys());
		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgUsrSltd() != null) {
			plandefinitiongoalcategorycoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnGoalCtgryCdgUsrSltd()));
		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgVrsn() != null) {
			plandefinitiongoalcategorycoding.setVersion(p.getPlnDfnGoalCtgryCdgVrsn());
		}
		/******************** PlnDfn_Goal_Ctgry_Txt ********************************************************************************/
		if(p.getPlnDfnGoalCtgryTxt() != null) {
			plandefinitiongoalcategory.setText(p.getPlnDfnGoalCtgryTxt());
		}
		/******************** plandefinitiongoaldescription ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoaldescription =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitiongoal.setDescription(plandefinitiongoaldescription);

		/******************** plandefinitiongoaldescriptioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoaldescriptioncoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitiongoaldescription.addCoding(plandefinitiongoaldescriptioncoding);

		/******************** PlnDfn_Goal_Dscrptn_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgCd() != null) {
			plandefinitiongoaldescriptioncoding.setCode(p.getPlnDfnGoalDscrptnCdgCd());
		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgDsply() != null) {
			plandefinitiongoaldescriptioncoding.setDisplay(p.getPlnDfnGoalDscrptnCdgDsply());
		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgSys() != null) {
			plandefinitiongoaldescriptioncoding.setSystem(p.getPlnDfnGoalDscrptnCdgSys());
		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgUsrSltd() != null) {
			plandefinitiongoaldescriptioncoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnGoalDscrptnCdgUsrSltd()));
		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgVrsn() != null) {
			plandefinitiongoaldescriptioncoding.setVersion(p.getPlnDfnGoalDscrptnCdgVrsn());
		}
		/******************** PlnDfn_Goal_Dscrptn_Txt ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnTxt() != null) {
			plandefinitiongoaldescription.setText(p.getPlnDfnGoalDscrptnTxt());
		}
		/******************** plandefinitiongoaldocumentation ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact plandefinitiongoaldocumentation =  new org.hl7.fhir.r4.model.RelatedArtifact();
		plandefinitiongoal.addDocumentation(plandefinitiongoaldocumentation);

		/******************** PlnDfn_Goal_Docation_Citation ********************************************************************************/
		if(p.getPlnDfnGoalDocationCitation() != null) {
			plandefinitiongoaldocumentation.setCitation(p.getPlnDfnGoalDocationCitation());
		}
		/******************** PlnDfn_Goal_Docation_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalDocationDsply() != null) {
			plandefinitiongoaldocumentation.setDisplay(p.getPlnDfnGoalDocationDsply());
		}
		/******************** plandefinitiongoaldocumentationdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment plandefinitiongoaldocumentationdocument =  new org.hl7.fhir.r4.model.Attachment();
		plandefinitiongoaldocumentation.setDocument(plandefinitiongoaldocumentationdocument);

		/******************** PlnDfn_Goal_Docation_Doc_CntntTyp ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocCntntTyp() != null) {
			plandefinitiongoaldocumentationdocument.setContentType(p.getPlnDfnGoalDocationDocCntntTyp());
		}
		/******************** PlnDfn_Goal_Docation_Doc_Creation ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocCreation() != null) {
			java.text.SimpleDateFormat PlnDfn_Goal_Docation_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Goal_Docation_Doc_Creationdate = PlnDfn_Goal_Docation_Doc_Creationsdf.parse(p.getPlnDfnGoalDocationDocCreation());
			plandefinitiongoaldocumentationdocument.setCreation(PlnDfn_Goal_Docation_Doc_Creationdate);
		}
		/******************** PlnDfn_Goal_Docation_Doc_Data ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocData() != null) {
			plandefinitiongoaldocumentationdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPlnDfnGoalDocationDocData()));
		}
		/******************** PlnDfn_Goal_Docation_Doc_Hash ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocHash() != null) {
			plandefinitiongoaldocumentationdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPlnDfnGoalDocationDocHash()));
		}
		/******************** PlnDfn_Goal_Docation_Doc_Lnguage ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocLnguage() != null) {
			plandefinitiongoaldocumentationdocument.setLanguage(p.getPlnDfnGoalDocationDocLnguage());
		}
		/******************** PlnDfn_Goal_Docation_Doc_Sz ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocSz() != null) {
			plandefinitiongoaldocumentationdocument.setSize(Integer.parseInt(p.getPlnDfnGoalDocationDocSz()));
		}
		/******************** PlnDfn_Goal_Docation_Doc_Ttl ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocTtl() != null) {
			plandefinitiongoaldocumentationdocument.setTitle(p.getPlnDfnGoalDocationDocTtl());
		}
		/******************** PlnDfn_Goal_Docation_Doc_Url ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocUrl() != null) {
			plandefinitiongoaldocumentationdocument.setUrl(p.getPlnDfnGoalDocationDocUrl());
		}
		/******************** PlnDfn_Goal_Docation_Lbl ********************************************************************************/
		if(p.getPlnDfnGoalDocationLbl() != null) {
			plandefinitiongoaldocumentation.setLabel(p.getPlnDfnGoalDocationLbl());
		}
		/******************** PlnDfn_Goal_Docation_Rsrc ********************************************************************************/
		if(p.getPlnDfnGoalDocationRsrc() != null) {
			plandefinitiongoaldocumentation.setResource(p.getPlnDfnGoalDocationRsrc());
		}
		/******************** plandefinitiongoaldocumentationtype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory plandefinitiongoaldocumentationtype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		plandefinitiongoaldocumentation.setType(plandefinitiongoaldocumentationtype.fromCode(p.getPlnDfnGoalDocationTyp()));

		/******************** PlnDfn_Goal_Docation_Url ********************************************************************************/
		if(p.getPlnDfnGoalDocationUrl() != null) {
			plandefinitiongoaldocumentation.setUrl(p.getPlnDfnGoalDocationUrl());
		}
		/******************** plandefinitiongoalpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoalpriority =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitiongoal.setPriority(plandefinitiongoalpriority);

		/******************** plandefinitiongoalprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoalprioritycoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitiongoalpriority.addCoding(plandefinitiongoalprioritycoding);

		/******************** PlnDfn_Goal_Priority_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgCd() != null) {
			plandefinitiongoalprioritycoding.setCode(p.getPlnDfnGoalPriorityCdgCd());
		}
		/******************** PlnDfn_Goal_Priority_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgDsply() != null) {
			plandefinitiongoalprioritycoding.setDisplay(p.getPlnDfnGoalPriorityCdgDsply());
		}
		/******************** PlnDfn_Goal_Priority_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgSys() != null) {
			plandefinitiongoalprioritycoding.setSystem(p.getPlnDfnGoalPriorityCdgSys());
		}
		/******************** PlnDfn_Goal_Priority_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgUsrSltd() != null) {
			plandefinitiongoalprioritycoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnGoalPriorityCdgUsrSltd()));
		}
		/******************** PlnDfn_Goal_Priority_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgVrsn() != null) {
			plandefinitiongoalprioritycoding.setVersion(p.getPlnDfnGoalPriorityCdgVrsn());
		}
		/******************** PlnDfn_Goal_Priority_Txt ********************************************************************************/
		if(p.getPlnDfnGoalPriorityTxt() != null) {
			plandefinitiongoalpriority.setText(p.getPlnDfnGoalPriorityTxt());
		}
		/******************** plandefinitiongoalstart ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoalstart =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitiongoal.setStart(plandefinitiongoalstart);

		/******************** plandefinitiongoalstartcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoalstartcoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitiongoalstart.addCoding(plandefinitiongoalstartcoding);

		/******************** PlnDfn_Goal_Strt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgCd() != null) {
			plandefinitiongoalstartcoding.setCode(p.getPlnDfnGoalStrtCdgCd());
		}
		/******************** PlnDfn_Goal_Strt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgDsply() != null) {
			plandefinitiongoalstartcoding.setDisplay(p.getPlnDfnGoalStrtCdgDsply());
		}
		/******************** PlnDfn_Goal_Strt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgSys() != null) {
			plandefinitiongoalstartcoding.setSystem(p.getPlnDfnGoalStrtCdgSys());
		}
		/******************** PlnDfn_Goal_Strt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgUsrSltd() != null) {
			plandefinitiongoalstartcoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnGoalStrtCdgUsrSltd()));
		}
		/******************** PlnDfn_Goal_Strt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgVrsn() != null) {
			plandefinitiongoalstartcoding.setVersion(p.getPlnDfnGoalStrtCdgVrsn());
		}
		/******************** PlnDfn_Goal_Strt_Txt ********************************************************************************/
		if(p.getPlnDfnGoalStrtTxt() != null) {
			plandefinitiongoalstart.setText(p.getPlnDfnGoalStrtTxt());
		}
		/******************** plandefinitiongoaltar ********************************************************************************/
		org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalTargetComponent plandefinitiongoaltar =  new org.hl7.fhir.r4.model.PlanDefinition.PlanDefinitionGoalTargetComponent();
		plandefinitiongoal.addTarget(plandefinitiongoaltar);

		/******************** plandefinitiongoaltardetailcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoaltardetailcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitiongoaltar.setDetail(plandefinitiongoaltardetailcodeableconcept);

		/******************** plandefinitiongoaltardetailcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoaltardetailcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitiongoaltardetailcodeableconcept.addCoding(plandefinitiongoaltardetailcodeableconceptcoding);

		/******************** PlnDfn_Goal_Tar_DtlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlCdbleCncptCdgCd() != null) {
			plandefinitiongoaltardetailcodeableconceptcoding.setCode(p.getPlnDfnGoalTarDtlCdbleCncptCdgCd());
		}
		/******************** PlnDfn_Goal_Tar_DtlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlCdbleCncptCdgDsply() != null) {
			plandefinitiongoaltardetailcodeableconceptcoding.setDisplay(p.getPlnDfnGoalTarDtlCdbleCncptCdgDsply());
		}
		/******************** PlnDfn_Goal_Tar_DtlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlCdbleCncptCdgSys() != null) {
			plandefinitiongoaltardetailcodeableconceptcoding.setSystem(p.getPlnDfnGoalTarDtlCdbleCncptCdgSys());
		}
		/******************** PlnDfn_Goal_Tar_DtlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlCdbleCncptCdgUsrSltd() != null) {
			plandefinitiongoaltardetailcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnGoalTarDtlCdbleCncptCdgUsrSltd()));
		}
		/******************** PlnDfn_Goal_Tar_DtlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlCdbleCncptCdgVrsn() != null) {
			plandefinitiongoaltardetailcodeableconceptcoding.setVersion(p.getPlnDfnGoalTarDtlCdbleCncptCdgVrsn());
		}
		/******************** PlnDfn_Goal_Tar_DtlCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlCdbleCncptTxt() != null) {
			plandefinitiongoaltardetailcodeableconcept.setText(p.getPlnDfnGoalTarDtlCdbleCncptTxt());
		}
		/******************** plandefinitiongoaltardetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitiongoaltardetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitiongoaltar.setDetail(plandefinitiongoaltardetailquantity);

		/******************** PlnDfn_Goal_Tar_DtlQnty_Cd ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlQntyCd() != null) {
			plandefinitiongoaltardetailquantity.setCode(p.getPlnDfnGoalTarDtlQntyCd());
		}
		/******************** plandefinitiongoaltardetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitiongoaltardetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitiongoaltardetailquantity.setComparator(plandefinitiongoaltardetailquantitycomparator.fromCode(p.getPlnDfnGoalTarDtlQntyCmprtr()));

		/******************** PlnDfn_Goal_Tar_DtlQnty_Sys ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlQntySys() != null) {
			plandefinitiongoaltardetailquantity.setSystem(p.getPlnDfnGoalTarDtlQntySys());
		}
		/******************** PlnDfn_Goal_Tar_DtlQnty_Unt ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlQntyUnt() != null) {
			plandefinitiongoaltardetailquantity.setUnit(p.getPlnDfnGoalTarDtlQntyUnt());
		}
		/******************** PlnDfn_Goal_Tar_DtlQnty_Vl ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlQntyVl() != null) {
			plandefinitiongoaltardetailquantity.setValue(Double.parseDouble((p.getPlnDfnGoalTarDtlQntyVl())));
		}
		/******************** plandefinitiongoaltardetailrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitiongoaltardetailrange =  new org.hl7.fhir.r4.model.Range();
		plandefinitiongoaltar.setDetail(plandefinitiongoaltardetailrange);

		/******************** plandefinitiongoaltardetailrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitiongoaltardetailrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitiongoaltardetailrange.setHigh(plandefinitiongoaltardetailrangehigh);

		/******************** PlnDfn_Goal_Tar_DtlRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlRngHiCd() != null) {
			plandefinitiongoaltardetailrangehigh.setCode(p.getPlnDfnGoalTarDtlRngHiCd());
		}
		/******************** plandefinitiongoaltardetailrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitiongoaltardetailrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitiongoaltardetailrangehigh.setComparator(plandefinitiongoaltardetailrangehighcomparator.fromCode(p.getPlnDfnGoalTarDtlRngHiCmprtr()));

		/******************** PlnDfn_Goal_Tar_DtlRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlRngHiSys() != null) {
			plandefinitiongoaltardetailrangehigh.setSystem(p.getPlnDfnGoalTarDtlRngHiSys());
		}
		/******************** PlnDfn_Goal_Tar_DtlRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlRngHiUnt() != null) {
			plandefinitiongoaltardetailrangehigh.setUnit(p.getPlnDfnGoalTarDtlRngHiUnt());
		}
		/******************** PlnDfn_Goal_Tar_DtlRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlRngHiVl() != null) {
			plandefinitiongoaltardetailrangehigh.setValue(Double.parseDouble((p.getPlnDfnGoalTarDtlRngHiVl())));
		}
		/******************** plandefinitiongoaltardetailrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitiongoaltardetailrangelow =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitiongoaltardetailrange.setLow(plandefinitiongoaltardetailrangelow);

		/******************** PlnDfn_Goal_Tar_DtlRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlRngLwCd() != null) {
			plandefinitiongoaltardetailrangelow.setCode(p.getPlnDfnGoalTarDtlRngLwCd());
		}
		/******************** plandefinitiongoaltardetailrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitiongoaltardetailrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitiongoaltardetailrangelow.setComparator(plandefinitiongoaltardetailrangelowcomparator.fromCode(p.getPlnDfnGoalTarDtlRngLwCmprtr()));

		/******************** PlnDfn_Goal_Tar_DtlRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlRngLwSys() != null) {
			plandefinitiongoaltardetailrangelow.setSystem(p.getPlnDfnGoalTarDtlRngLwSys());
		}
		/******************** PlnDfn_Goal_Tar_DtlRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlRngLwUnt() != null) {
			plandefinitiongoaltardetailrangelow.setUnit(p.getPlnDfnGoalTarDtlRngLwUnt());
		}
		/******************** PlnDfn_Goal_Tar_DtlRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnGoalTarDtlRngLwVl() != null) {
			plandefinitiongoaltardetailrangelow.setValue(Double.parseDouble((p.getPlnDfnGoalTarDtlRngLwVl())));
		}
		/******************** plandefinitiongoaltardue ********************************************************************************/
		org.hl7.fhir.r4.model.Duration plandefinitiongoaltardue =  new org.hl7.fhir.r4.model.Duration();
		plandefinitiongoaltar.setDue(plandefinitiongoaltardue);

		/******************** plandefinitiongoaltarmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiongoaltarmeasure =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitiongoaltar.setMeasure(plandefinitiongoaltarmeasure);

		/******************** plandefinitiongoaltarmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiongoaltarmeasurecoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitiongoaltarmeasure.addCoding(plandefinitiongoaltarmeasurecoding);

		/******************** PlnDfn_Goal_Tar_Msr_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalTarMsrCdgCd() != null) {
			plandefinitiongoaltarmeasurecoding.setCode(p.getPlnDfnGoalTarMsrCdgCd());
		}
		/******************** PlnDfn_Goal_Tar_Msr_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalTarMsrCdgDsply() != null) {
			plandefinitiongoaltarmeasurecoding.setDisplay(p.getPlnDfnGoalTarMsrCdgDsply());
		}
		/******************** PlnDfn_Goal_Tar_Msr_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalTarMsrCdgSys() != null) {
			plandefinitiongoaltarmeasurecoding.setSystem(p.getPlnDfnGoalTarMsrCdgSys());
		}
		/******************** PlnDfn_Goal_Tar_Msr_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalTarMsrCdgUsrSltd() != null) {
			plandefinitiongoaltarmeasurecoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnGoalTarMsrCdgUsrSltd()));
		}
		/******************** PlnDfn_Goal_Tar_Msr_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalTarMsrCdgVrsn() != null) {
			plandefinitiongoaltarmeasurecoding.setVersion(p.getPlnDfnGoalTarMsrCdgVrsn());
		}
		/******************** PlnDfn_Goal_Tar_Msr_Txt ********************************************************************************/
		if(p.getPlnDfnGoalTarMsrTxt() != null) {
			plandefinitiongoaltarmeasure.setText(p.getPlnDfnGoalTarMsrTxt());
		}
		/******************** plandefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier plandefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		plandefinition.addIdentifier(plandefinitionidentifier);

		/******************** PlnDfn_Id_Assigner ********************************************************************************/
		if(p.getPlnDfnIdAssigner() != null) {
			plandefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(p.getPlnDfnIdAssigner()));
		}
		/******************** plandefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionidentifier.setPeriod(plandefinitionidentifierperiod);

		/******************** PlnDfn_Id_Prd_End ********************************************************************************/
		if(p.getPlnDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Id_Prd_Enddate = PlnDfn_Id_Prd_Endsdf.parse(p.getPlnDfnIdPrdEnd());
			plandefinitionidentifierperiod.setEnd(PlnDfn_Id_Prd_Enddate);
		}
		/******************** PlnDfn_Id_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Id_Prd_Strtdate = PlnDfn_Id_Prd_Strtsdf.parse(p.getPlnDfnIdPrdStrt());
			plandefinitionidentifierperiod.setStart(PlnDfn_Id_Prd_Strtdate);
		}
		/******************** PlnDfn_Id_Sys ********************************************************************************/
		if(p.getPlnDfnIdSys() != null) {
			plandefinitionidentifier.setSystem(p.getPlnDfnIdSys());
		}
		/******************** plandefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionidentifier.setType(plandefinitionidentifiertype);

		/******************** plandefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionidentifiertype.addCoding(plandefinitionidentifiertypecoding);

		/******************** PlnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnIdTypCdgCd() != null) {
			plandefinitionidentifiertypecoding.setCode(p.getPlnDfnIdTypCdgCd());
		}
		/******************** PlnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnIdTypCdgDsply() != null) {
			plandefinitionidentifiertypecoding.setDisplay(p.getPlnDfnIdTypCdgDsply());
		}
		/******************** PlnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnIdTypCdgSys() != null) {
			plandefinitionidentifiertypecoding.setSystem(p.getPlnDfnIdTypCdgSys());
		}
		/******************** PlnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnIdTypCdgUsrSltd() != null) {
			plandefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnIdTypCdgUsrSltd()));
		}
		/******************** PlnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnIdTypCdgVrsn() != null) {
			plandefinitionidentifiertypecoding.setVersion(p.getPlnDfnIdTypCdgVrsn());
		}
		/******************** PlnDfn_Id_Typ_Txt ********************************************************************************/
		if(p.getPlnDfnIdTypTxt() != null) {
			plandefinitionidentifiertype.setText(p.getPlnDfnIdTypTxt());
		}
		/******************** plandefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory plandefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		plandefinitionidentifier.setUse(plandefinitionidentifieruse.fromCode(p.getPlnDfnIdUse()));

		/******************** PlnDfn_Id_Vl ********************************************************************************/
		if(p.getPlnDfnIdVl() != null) {
			plandefinitionidentifier.setValue(p.getPlnDfnIdVl());
		}
		/******************** plandefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinition.addJurisdiction(plandefinitionjurisdiction);

		/******************** plandefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionjurisdiction.addCoding(plandefinitionjurisdictioncoding);

		/******************** PlnDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgCd() != null) {
			plandefinitionjurisdictioncoding.setCode(p.getPlnDfnJrsdctnCdgCd());
		}
		/******************** PlnDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgDsply() != null) {
			plandefinitionjurisdictioncoding.setDisplay(p.getPlnDfnJrsdctnCdgDsply());
		}
		/******************** PlnDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgSys() != null) {
			plandefinitionjurisdictioncoding.setSystem(p.getPlnDfnJrsdctnCdgSys());
		}
		/******************** PlnDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgUsrSltd() != null) {
			plandefinitionjurisdictioncoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnJrsdctnCdgUsrSltd()));
		}
		/******************** PlnDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgVrsn() != null) {
			plandefinitionjurisdictioncoding.setVersion(p.getPlnDfnJrsdctnCdgVrsn());
		}
		/******************** PlnDfn_Jrsdctn_Txt ********************************************************************************/
		if(p.getPlnDfnJrsdctnTxt() != null) {
			plandefinitionjurisdiction.setText(p.getPlnDfnJrsdctnTxt());
		}
		/******************** PlnDfn_LastReviewDt ********************************************************************************/
		if(p.getPlnDfnLastReviewDt() != null) {
			java.text.SimpleDateFormat PlnDfn_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_LastReviewDtdate = PlnDfn_LastReviewDtsdf.parse(p.getPlnDfnLastReviewDt());
			plandefinition.setLastReviewDate(PlnDfn_LastReviewDtdate);
		}
		/******************** PlnDfn_Library ********************************************************************************/
		if(p.getPlnDfnLibrary() != null) {
			plandefinition.addLibrary(p.getPlnDfnLibrary());
		}
		/******************** PlnDfn_Nm ********************************************************************************/
		if(p.getPlnDfnNm() != null) {
			plandefinition.setName(p.getPlnDfnNm());
		}
		/******************** PlnDfn_Pblshr ********************************************************************************/
		if(p.getPlnDfnPblshr() != null) {
			plandefinition.setPublisher(p.getPlnDfnPblshr());
		}
		/******************** PlnDfn_Prpse ********************************************************************************/
		if(p.getPlnDfnPrpse() != null) {
			plandefinition.setPurpose(p.getPlnDfnPrpse());
		}
		/******************** plandefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact plandefinitionrelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		plandefinition.addRelatedArtifact(plandefinitionrelatedartifact);

		/******************** PlnDfn_RltedArtfct_Citation ********************************************************************************/
		if(p.getPlnDfnRltedArtfctCitation() != null) {
			plandefinitionrelatedartifact.setCitation(p.getPlnDfnRltedArtfctCitation());
		}
		/******************** PlnDfn_RltedArtfct_Dsply ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDsply() != null) {
			plandefinitionrelatedartifact.setDisplay(p.getPlnDfnRltedArtfctDsply());
		}
		/******************** plandefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment plandefinitionrelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		plandefinitionrelatedartifact.setDocument(plandefinitionrelatedartifactdocument);

		/******************** PlnDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocCntntTyp() != null) {
			plandefinitionrelatedartifactdocument.setContentType(p.getPlnDfnRltedArtfctDocCntntTyp());
		}
		/******************** PlnDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat PlnDfn_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_RltedArtfct_Doc_Creationdate = PlnDfn_RltedArtfct_Doc_Creationsdf.parse(p.getPlnDfnRltedArtfctDocCreation());
			plandefinitionrelatedartifactdocument.setCreation(PlnDfn_RltedArtfct_Doc_Creationdate);
		}
		/******************** PlnDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocData() != null) {
			plandefinitionrelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPlnDfnRltedArtfctDocData()));
		}
		/******************** PlnDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocHash() != null) {
			plandefinitionrelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(p.getPlnDfnRltedArtfctDocHash()));
		}
		/******************** PlnDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocLnguage() != null) {
			plandefinitionrelatedartifactdocument.setLanguage(p.getPlnDfnRltedArtfctDocLnguage());
		}
		/******************** PlnDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocSz() != null) {
			plandefinitionrelatedartifactdocument.setSize(Integer.parseInt(p.getPlnDfnRltedArtfctDocSz()));
		}
		/******************** PlnDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocTtl() != null) {
			plandefinitionrelatedartifactdocument.setTitle(p.getPlnDfnRltedArtfctDocTtl());
		}
		/******************** PlnDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocUrl() != null) {
			plandefinitionrelatedartifactdocument.setUrl(p.getPlnDfnRltedArtfctDocUrl());
		}
		/******************** PlnDfn_RltedArtfct_Lbl ********************************************************************************/
		if(p.getPlnDfnRltedArtfctLbl() != null) {
			plandefinitionrelatedartifact.setLabel(p.getPlnDfnRltedArtfctLbl());
		}
		/******************** PlnDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(p.getPlnDfnRltedArtfctRsrc() != null) {
			plandefinitionrelatedartifact.setResource(p.getPlnDfnRltedArtfctRsrc());
		}
		/******************** plandefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory plandefinitionrelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		plandefinitionrelatedartifact.setType(plandefinitionrelatedartifacttype.fromCode(p.getPlnDfnRltedArtfctTyp()));

		/******************** PlnDfn_RltedArtfct_Url ********************************************************************************/
		if(p.getPlnDfnRltedArtfctUrl() != null) {
			plandefinitionrelatedartifact.setUrl(p.getPlnDfnRltedArtfctUrl());
		}
		/******************** plandefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail plandefinitionreviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		plandefinition.addReviewer(plandefinitionreviewer);

		/******************** PlnDfn_Rviewr_Nm ********************************************************************************/
		if(p.getPlnDfnRviewrNm() != null) {
			plandefinitionreviewer.setName(p.getPlnDfnRviewrNm());
		}
		/******************** plandefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint plandefinitionreviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		plandefinitionreviewer.addTelecom(plandefinitionreviewertelecom);

		/******************** plandefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period plandefinitionreviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		plandefinitionreviewertelecom.setPeriod(plandefinitionreviewertelecomperiod);

		/******************** PlnDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat PlnDfn_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Rviewr_Tlcm_Prd_Enddate = PlnDfn_Rviewr_Tlcm_Prd_Endsdf.parse(p.getPlnDfnRviewrTlcmPrdEnd());
			plandefinitionreviewertelecomperiod.setEnd(PlnDfn_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** PlnDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat PlnDfn_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date PlnDfn_Rviewr_Tlcm_Prd_Strtdate = PlnDfn_Rviewr_Tlcm_Prd_Strtsdf.parse(p.getPlnDfnRviewrTlcmPrdStrt());
			plandefinitionreviewertelecomperiod.setStart(PlnDfn_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** PlnDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmRnk() != null) {
			plandefinitionreviewertelecom.setRank(Integer.parseInt(p.getPlnDfnRviewrTlcmRnk()));
		}
		/******************** plandefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory plandefinitionreviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		plandefinitionreviewertelecom.setSystem(plandefinitionreviewertelecomsystem.fromCode(p.getPlnDfnRviewrTlcmSys()));

		/******************** plandefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory plandefinitionreviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		plandefinitionreviewertelecom.setUse(plandefinitionreviewertelecomuse.fromCode(p.getPlnDfnRviewrTlcmUse()));

		/******************** PlnDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmVl() != null) {
			plandefinitionreviewertelecom.setValue(p.getPlnDfnRviewrTlcmVl());
		}
		/******************** plandefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory plandefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		plandefinition.setStatus(plandefinitionstatus.fromCode(p.getPlnDfnSts()));

		/******************** plandefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinition.setSubject(plandefinitionsubjectcodeableconcept);

		/******************** plandefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionsubjectcodeableconcept.addCoding(plandefinitionsubjectcodeableconceptcoding);

		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgCd() != null) {
			plandefinitionsubjectcodeableconceptcoding.setCode(p.getPlnDfnSbjctCdbleCncptCdgCd());
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgDsply() != null) {
			plandefinitionsubjectcodeableconceptcoding.setDisplay(p.getPlnDfnSbjctCdbleCncptCdgDsply());
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgSys() != null) {
			plandefinitionsubjectcodeableconceptcoding.setSystem(p.getPlnDfnSbjctCdbleCncptCdgSys());
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgUsrSltd() != null) {
			plandefinitionsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgVrsn() != null) {
			plandefinitionsubjectcodeableconceptcoding.setVersion(p.getPlnDfnSbjctCdbleCncptCdgVrsn());
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptTxt() != null) {
			plandefinitionsubjectcodeableconcept.setText(p.getPlnDfnSbjctCdbleCncptTxt());
		}
		/******************** PlnDfn_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnSbjctRfrnc() != null) {
			plandefinition.setSubject( new org.hl7.fhir.r4.model.Reference(p.getPlnDfnSbjctRfrnc()));
		}
		/******************** PlnDfn_Subtitle ********************************************************************************/
		if(p.getPlnDfnSubtitle() != null) {
			plandefinition.setSubtitle(p.getPlnDfnSubtitle());
		}
		/******************** PlnDfn_Ttl ********************************************************************************/
		if(p.getPlnDfnTtl() != null) {
			plandefinition.setTitle(p.getPlnDfnTtl());
		}
		/******************** plandefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiontopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinition.addTopic(plandefinitiontopic);

		/******************** plandefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiontopiccoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitiontopic.addCoding(plandefinitiontopiccoding);

		/******************** PlnDfn_Topic_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnTopicCdgCd() != null) {
			plandefinitiontopiccoding.setCode(p.getPlnDfnTopicCdgCd());
		}
		/******************** PlnDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnTopicCdgDsply() != null) {
			plandefinitiontopiccoding.setDisplay(p.getPlnDfnTopicCdgDsply());
		}
		/******************** PlnDfn_Topic_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnTopicCdgSys() != null) {
			plandefinitiontopiccoding.setSystem(p.getPlnDfnTopicCdgSys());
		}
		/******************** PlnDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnTopicCdgUsrSltd() != null) {
			plandefinitiontopiccoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnTopicCdgUsrSltd()));
		}
		/******************** PlnDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnTopicCdgVrsn() != null) {
			plandefinitiontopiccoding.setVersion(p.getPlnDfnTopicCdgVrsn());
		}
		/******************** PlnDfn_Topic_Txt ********************************************************************************/
		if(p.getPlnDfnTopicTxt() != null) {
			plandefinitiontopic.setText(p.getPlnDfnTopicTxt());
		}
		/******************** plandefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinition.setType(plandefinitiontype);

		/******************** plandefinitiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitiontype.addCoding(plandefinitiontypecoding);

		/******************** PlnDfn_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnTypCdgCd() != null) {
			plandefinitiontypecoding.setCode(p.getPlnDfnTypCdgCd());
		}
		/******************** PlnDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnTypCdgDsply() != null) {
			plandefinitiontypecoding.setDisplay(p.getPlnDfnTypCdgDsply());
		}
		/******************** PlnDfn_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnTypCdgSys() != null) {
			plandefinitiontypecoding.setSystem(p.getPlnDfnTypCdgSys());
		}
		/******************** PlnDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnTypCdgUsrSltd() != null) {
			plandefinitiontypecoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnTypCdgUsrSltd()));
		}
		/******************** PlnDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnTypCdgVrsn() != null) {
			plandefinitiontypecoding.setVersion(p.getPlnDfnTypCdgVrsn());
		}
		/******************** PlnDfn_Typ_Txt ********************************************************************************/
		if(p.getPlnDfnTypTxt() != null) {
			plandefinitiontype.setText(p.getPlnDfnTypTxt());
		}
		/******************** PlnDfn_Url ********************************************************************************/
		if(p.getPlnDfnUrl() != null) {
			plandefinition.setUrl(p.getPlnDfnUrl());
		}
		/******************** PlnDfn_Usg ********************************************************************************/
		if(p.getPlnDfnUsg() != null) {
			plandefinition.setUsage(p.getPlnDfnUsg());
		}
		/******************** plandefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext plandefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		plandefinition.addUseContext(plandefinitionusecontext);

		/******************** plandefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionusecontext.setCode(plandefinitionusecontextcode);

		/******************** PlnDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdCd() != null) {
			plandefinitionusecontextcode.setCode(p.getPlnDfnUseCntxtCdCd());
		}
		/******************** PlnDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdDsply() != null) {
			plandefinitionusecontextcode.setDisplay(p.getPlnDfnUseCntxtCdDsply());
		}
		/******************** PlnDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdSys() != null) {
			plandefinitionusecontextcode.setSystem(p.getPlnDfnUseCntxtCdSys());
		}
		/******************** PlnDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdUsrSltd() != null) {
			plandefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(p.getPlnDfnUseCntxtCdUsrSltd()));
		}
		/******************** PlnDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdVrsn() != null) {
			plandefinitionusecontextcode.setVersion(p.getPlnDfnUseCntxtCdVrsn());
		}
		/******************** plandefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept plandefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		plandefinitionusecontext.setValue(plandefinitionusecontextvaluecodeableconcept);

		/******************** plandefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding plandefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		plandefinitionusecontextvaluecodeableconcept.addCoding(plandefinitionusecontextvaluecodeableconceptcoding);

		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			plandefinitionusecontextvaluecodeableconceptcoding.setCode(p.getPlnDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			plandefinitionusecontextvaluecodeableconceptcoding.setDisplay(p.getPlnDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			plandefinitionusecontextvaluecodeableconceptcoding.setSystem(p.getPlnDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			plandefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(p.getPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			plandefinitionusecontextvaluecodeableconceptcoding.setVersion(p.getPlnDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptTxt() != null) {
			plandefinitionusecontextvaluecodeableconcept.setText(p.getPlnDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** plandefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionusecontext.setValue(plandefinitionusecontextvaluequantity);

		/******************** PlnDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlQntyCd() != null) {
			plandefinitionusecontextvaluequantity.setCode(p.getPlnDfnUseCntxtVlQntyCd());
		}
		/******************** plandefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionusecontextvaluequantity.setComparator(plandefinitionusecontextvaluequantitycomparator.fromCode(p.getPlnDfnUseCntxtVlQntyCmprtr()));

		/******************** PlnDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlQntySys() != null) {
			plandefinitionusecontextvaluequantity.setSystem(p.getPlnDfnUseCntxtVlQntySys());
		}
		/******************** PlnDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlQntyUnt() != null) {
			plandefinitionusecontextvaluequantity.setUnit(p.getPlnDfnUseCntxtVlQntyUnt());
		}
		/******************** PlnDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlQntyVl() != null) {
			plandefinitionusecontextvaluequantity.setValue(Double.parseDouble((p.getPlnDfnUseCntxtVlQntyVl())));
		}
		/******************** plandefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range plandefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		plandefinitionusecontext.setValue(plandefinitionusecontextvaluerange);

		/******************** plandefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionusecontextvaluerange.setHigh(plandefinitionusecontextvaluerangehigh);

		/******************** PlnDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngHiCd() != null) {
			plandefinitionusecontextvaluerangehigh.setCode(p.getPlnDfnUseCntxtVlRngHiCd());
		}
		/******************** plandefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionusecontextvaluerangehigh.setComparator(plandefinitionusecontextvaluerangehighcomparator.fromCode(p.getPlnDfnUseCntxtVlRngHiCmprtr()));

		/******************** PlnDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngHiSys() != null) {
			plandefinitionusecontextvaluerangehigh.setSystem(p.getPlnDfnUseCntxtVlRngHiSys());
		}
		/******************** PlnDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngHiUnt() != null) {
			plandefinitionusecontextvaluerangehigh.setUnit(p.getPlnDfnUseCntxtVlRngHiUnt());
		}
		/******************** PlnDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngHiVl() != null) {
			plandefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((p.getPlnDfnUseCntxtVlRngHiVl())));
		}
		/******************** plandefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity plandefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		plandefinitionusecontextvaluerange.setLow(plandefinitionusecontextvaluerangelow);

		/******************** PlnDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngLwCd() != null) {
			plandefinitionusecontextvaluerangelow.setCode(p.getPlnDfnUseCntxtVlRngLwCd());
		}
		/******************** plandefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory plandefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		plandefinitionusecontextvaluerangelow.setComparator(plandefinitionusecontextvaluerangelowcomparator.fromCode(p.getPlnDfnUseCntxtVlRngLwCmprtr()));

		/******************** PlnDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngLwSys() != null) {
			plandefinitionusecontextvaluerangelow.setSystem(p.getPlnDfnUseCntxtVlRngLwSys());
		}
		/******************** PlnDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngLwUnt() != null) {
			plandefinitionusecontextvaluerangelow.setUnit(p.getPlnDfnUseCntxtVlRngLwUnt());
		}
		/******************** PlnDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngLwVl() != null) {
			plandefinitionusecontextvaluerangelow.setValue(Double.parseDouble((p.getPlnDfnUseCntxtVlRngLwVl())));
		}
		/******************** PlnDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRfrnc() != null) {
			plandefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(p.getPlnDfnUseCntxtVlRfrnc()));
		}
		/******************** PlnDfn_Vrsn ********************************************************************************/
		if(p.getPlnDfnVrsn() != null) {
			plandefinition.setVersion(p.getPlnDfnVrsn());
		}
		return plandefinition;
	}
}
