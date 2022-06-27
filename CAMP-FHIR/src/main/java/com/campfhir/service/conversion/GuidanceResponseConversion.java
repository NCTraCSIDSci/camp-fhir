package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.GuidanceResponse;
public class GuidanceResponseConversion 
{
	public org.hl7.fhir.r4.model.GuidanceResponse GuidanceResponses(GuidanceResponse g) throws ParseException
	{
		org.hl7.fhir.r4.model.GuidanceResponse guidanceresponse = new org.hl7.fhir.r4.model.GuidanceResponse();

		/******************** id ********************************************************************************/
		guidanceresponse.setId(g.getId());

		/******************** guidanceresponsedatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement guidanceresponsedatarequirement =  new org.hl7.fhir.r4.model.DataRequirement();
		guidanceresponse.addDataRequirement(guidanceresponsedatarequirement);

		/******************** guidanceresponsedatarequirementcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent guidanceresponsedatarequirementcodefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent();
		guidanceresponsedatarequirement.addCodeFilter(guidanceresponsedatarequirementcodefilter);

		/******************** guidanceresponsedatarequirementcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponsedatarequirementcodefiltercode =  new org.hl7.fhir.r4.model.Coding();
		guidanceresponsedatarequirementcodefilter.addCode(guidanceresponsedatarequirementcodefiltercode);

		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Cd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdCd() != null) {
			guidanceresponsedatarequirementcodefiltercode.setCode(g.getGuidnceRspsDataRqrmentCdFltrCdCd());
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdDsply() != null) {
			guidanceresponsedatarequirementcodefiltercode.setDisplay(g.getGuidnceRspsDataRqrmentCdFltrCdDsply());
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdSys() != null) {
			guidanceresponsedatarequirementcodefiltercode.setSystem(g.getGuidnceRspsDataRqrmentCdFltrCdSys());
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdUsrSltd() != null) {
			guidanceresponsedatarequirementcodefiltercode.setUserSelected(Boolean.parseBoolean(g.getGuidnceRspsDataRqrmentCdFltrCdUsrSltd()));
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrCdVrsn() != null) {
			guidanceresponsedatarequirementcodefiltercode.setVersion(g.getGuidnceRspsDataRqrmentCdFltrCdVrsn());
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Path ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrPath() != null) {
			guidanceresponsedatarequirementcodefilter.setPath(g.getGuidnceRspsDataRqrmentCdFltrPath());
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrSrchParam() != null) {
			guidanceresponsedatarequirementcodefilter.setSearchParam(g.getGuidnceRspsDataRqrmentCdFltrSrchParam());
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_VlSt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentCdFltrVlSt() != null) {
			guidanceresponsedatarequirementcodefilter.setValueSet(g.getGuidnceRspsDataRqrmentCdFltrVlSt());
		}
		/******************** guidanceresponsedatarequirementdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent guidanceresponsedatarequirementdatefilter =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent();
		guidanceresponsedatarequirement.addDateFilter(guidanceresponsedatarequirementdatefilter);

		/******************** GuidnceRsps_DataRqrment_DtFltr_Path ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrPath() != null) {
			guidanceresponsedatarequirementdatefilter.setPath(g.getGuidnceRspsDataRqrmentDtFltrPath());
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrSrchParam() != null) {
			guidanceresponsedatarequirementdatefilter.setSearchParam(g.getGuidnceRspsDataRqrmentDtFltrSrchParam());
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp() != null) {
			guidanceresponsedatarequirementdatefilter.setValue( new org.hl7.fhir.r4.model.DateTimeType(g.getGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp()));
		}
		/******************** guidanceresponsedatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration guidanceresponsedatarequirementdatefiltervalueduration =  new org.hl7.fhir.r4.model.Duration();
		guidanceresponsedatarequirementdatefilter.setValue(guidanceresponsedatarequirementdatefiltervalueduration);

		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDurationCd() != null) {
			guidanceresponsedatarequirementdatefiltervalueduration.setCode(g.getGuidnceRspsDataRqrmentDtFltrVlDurationCd());
		}
		/******************** guidanceresponsedatarequirementdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory guidanceresponsedatarequirementdatefiltervaluedurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		guidanceresponsedatarequirementdatefiltervalueduration.setComparator(guidanceresponsedatarequirementdatefiltervaluedurationcomparator.fromCode(g.getGuidnceRspsDataRqrmentDtFltrVlDurationCmprtr()));

		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDurationSys() != null) {
			guidanceresponsedatarequirementdatefiltervalueduration.setSystem(g.getGuidnceRspsDataRqrmentDtFltrVlDurationSys());
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDurationUnt() != null) {
			guidanceresponsedatarequirementdatefiltervalueduration.setUnit(g.getGuidnceRspsDataRqrmentDtFltrVlDurationUnt());
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlDurationVl() != null) {
			guidanceresponsedatarequirementdatefiltervalueduration.setValue(Double.parseDouble((g.getGuidnceRspsDataRqrmentDtFltrVlDurationVl())));
		}
		/******************** guidanceresponsedatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period guidanceresponsedatarequirementdatefiltervalueperiod =  new org.hl7.fhir.r4.model.Period();
		guidanceresponsedatarequirementdatefilter.setValue(guidanceresponsedatarequirementdatefiltervalueperiod);

		/******************** GuidnceRsps_DataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlPrdEnd() != null) {
			java.text.SimpleDateFormat GuidnceRsps_DataRqrment_DtFltr_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date GuidnceRsps_DataRqrment_DtFltr_VlPrd_Enddate = GuidnceRsps_DataRqrment_DtFltr_VlPrd_Endsdf.parse(g.getGuidnceRspsDataRqrmentDtFltrVlPrdEnd());
			guidanceresponsedatarequirementdatefiltervalueperiod.setEnd(GuidnceRsps_DataRqrment_DtFltr_VlPrd_Enddate);
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentDtFltrVlPrdStrt() != null) {
			java.text.SimpleDateFormat GuidnceRsps_DataRqrment_DtFltr_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date GuidnceRsps_DataRqrment_DtFltr_VlPrd_Strtdate = GuidnceRsps_DataRqrment_DtFltr_VlPrd_Strtsdf.parse(g.getGuidnceRspsDataRqrmentDtFltrVlPrdStrt());
			guidanceresponsedatarequirementdatefiltervalueperiod.setStart(GuidnceRsps_DataRqrment_DtFltr_VlPrd_Strtdate);
		}
		/******************** GuidnceRsps_DataRqrment_Lmt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentLmt() != null) {
			guidanceresponsedatarequirement.setLimit(Integer.parseInt(g.getGuidnceRspsDataRqrmentLmt()));
		}
		/******************** GuidnceRsps_DataRqrment_MustSupport ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentMustSupport() != null) {
			guidanceresponsedatarequirement.addMustSupport(g.getGuidnceRspsDataRqrmentMustSupport());
		}
		/******************** GuidnceRsps_DataRqrment_Profile ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentProfile() != null) {
			guidanceresponsedatarequirement.addProfile(g.getGuidnceRspsDataRqrmentProfile());
		}
		/******************** guidanceresponsedatarequirementsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent guidanceresponsedatarequirementsort =  new org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent();
		guidanceresponsedatarequirement.addSort(guidanceresponsedatarequirementsort);

		/******************** guidanceresponsedatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory guidanceresponsedatarequirementsortdirection =  new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory();
		guidanceresponsedatarequirementsort.setDirection(guidanceresponsedatarequirementsortdirection.fromCode(g.getGuidnceRspsDataRqrmentSortDirection()));

		/******************** GuidnceRsps_DataRqrment_Sort_Path ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSortPath() != null) {
			guidanceresponsedatarequirementsort.setPath(g.getGuidnceRspsDataRqrmentSortPath());
		}
		/******************** guidanceresponsedatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponsedatarequirementsubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		guidanceresponsedatarequirement.setSubject(guidanceresponsedatarequirementsubjectcodeableconcept);

		/******************** guidanceresponsedatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponsedatarequirementsubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		guidanceresponsedatarequirementsubjectcodeableconcept.addCoding(guidanceresponsedatarequirementsubjectcodeableconceptcoding);

		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd() != null) {
			guidanceresponsedatarequirementsubjectcodeableconceptcoding.setCode(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd());
		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply() != null) {
			guidanceresponsedatarequirementsubjectcodeableconceptcoding.setDisplay(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply());
		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys() != null) {
			guidanceresponsedatarequirementsubjectcodeableconceptcoding.setSystem(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys());
		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd() != null) {
			guidanceresponsedatarequirementsubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn() != null) {
			guidanceresponsedatarequirementsubjectcodeableconceptcoding.setVersion(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn());
		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptTxt() != null) {
			guidanceresponsedatarequirementsubjectcodeableconcept.setText(g.getGuidnceRspsDataRqrmentSbjctCdbleCncptTxt());
		}
		/******************** GuidnceRsps_DataRqrment_SbjctRfrnc ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentSbjctRfrnc() != null) {
			guidanceresponsedatarequirement.setSubject( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsDataRqrmentSbjctRfrnc()));
		}
		/******************** GuidnceRsps_DataRqrment_Typ ********************************************************************************/
		if(g.getGuidnceRspsDataRqrmentTyp() != null) {
			guidanceresponsedatarequirement.setType(g.getGuidnceRspsDataRqrmentTyp());
		}
		/******************** GuidnceRsps_Enc ********************************************************************************/
		if(g.getGuidnceRspsEnc() != null) {
			guidanceresponse.setEncounter( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsEnc()));
		}
		/******************** GuidnceRsps_EvaluationMsg ********************************************************************************/
		if(g.getGuidnceRspsEvaluationMsg() != null) {
			guidanceresponse.addEvaluationMessage( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsEvaluationMsg()));
		}
		/******************** guidanceresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier guidanceresponseidentifier =  new org.hl7.fhir.r4.model.Identifier();
		guidanceresponse.addIdentifier(guidanceresponseidentifier);

		/******************** GuidnceRsps_Id_Assigner ********************************************************************************/
		if(g.getGuidnceRspsIdAssigner() != null) {
			guidanceresponseidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsIdAssigner()));
		}
		/******************** guidanceresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period guidanceresponseidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		guidanceresponseidentifier.setPeriod(guidanceresponseidentifierperiod);

		/******************** GuidnceRsps_Id_Prd_End ********************************************************************************/
		if(g.getGuidnceRspsIdPrdEnd() != null) {
			java.text.SimpleDateFormat GuidnceRsps_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date GuidnceRsps_Id_Prd_Enddate = GuidnceRsps_Id_Prd_Endsdf.parse(g.getGuidnceRspsIdPrdEnd());
			guidanceresponseidentifierperiod.setEnd(GuidnceRsps_Id_Prd_Enddate);
		}
		/******************** GuidnceRsps_Id_Prd_Strt ********************************************************************************/
		if(g.getGuidnceRspsIdPrdStrt() != null) {
			java.text.SimpleDateFormat GuidnceRsps_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date GuidnceRsps_Id_Prd_Strtdate = GuidnceRsps_Id_Prd_Strtsdf.parse(g.getGuidnceRspsIdPrdStrt());
			guidanceresponseidentifierperiod.setStart(GuidnceRsps_Id_Prd_Strtdate);
		}
		/******************** GuidnceRsps_Id_Sys ********************************************************************************/
		if(g.getGuidnceRspsIdSys() != null) {
			guidanceresponseidentifier.setSystem(g.getGuidnceRspsIdSys());
		}
		/******************** guidanceresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponseidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		guidanceresponseidentifier.setType(guidanceresponseidentifiertype);

		/******************** guidanceresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponseidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		guidanceresponseidentifiertype.addCoding(guidanceresponseidentifiertypecoding);

		/******************** GuidnceRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgCd() != null) {
			guidanceresponseidentifiertypecoding.setCode(g.getGuidnceRspsIdTypCdgCd());
		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgDsply() != null) {
			guidanceresponseidentifiertypecoding.setDisplay(g.getGuidnceRspsIdTypCdgDsply());
		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgSys() != null) {
			guidanceresponseidentifiertypecoding.setSystem(g.getGuidnceRspsIdTypCdgSys());
		}
		/******************** GuidnceRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgUsrSltd() != null) {
			guidanceresponseidentifiertypecoding.setUserSelected(Boolean.parseBoolean(g.getGuidnceRspsIdTypCdgUsrSltd()));
		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsIdTypCdgVrsn() != null) {
			guidanceresponseidentifiertypecoding.setVersion(g.getGuidnceRspsIdTypCdgVrsn());
		}
		/******************** GuidnceRsps_Id_Typ_Txt ********************************************************************************/
		if(g.getGuidnceRspsIdTypTxt() != null) {
			guidanceresponseidentifiertype.setText(g.getGuidnceRspsIdTypTxt());
		}
		/******************** guidanceresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory guidanceresponseidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		guidanceresponseidentifier.setUse(guidanceresponseidentifieruse.fromCode(g.getGuidnceRspsIdUse()));

		/******************** GuidnceRsps_Id_Vl ********************************************************************************/
		if(g.getGuidnceRspsIdVl() != null) {
			guidanceresponseidentifier.setValue(g.getGuidnceRspsIdVl());
		}
		/******************** GuidnceRsps_ModuleCanonicalTyp ********************************************************************************/
		if(g.getGuidnceRspsModuleCanonicalTyp() != null) {
			guidanceresponse.setModule( new org.hl7.fhir.r4.model.CanonicalType(g.getGuidnceRspsModuleCanonicalTyp()));
		}
		/******************** guidanceresponsemodulecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponsemodulecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		guidanceresponse.setModule(guidanceresponsemodulecodeableconcept);

		/******************** guidanceresponsemodulecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponsemodulecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		guidanceresponsemodulecodeableconcept.addCoding(guidanceresponsemodulecodeableconceptcoding);

		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgCd() != null) {
			guidanceresponsemodulecodeableconceptcoding.setCode(g.getGuidnceRspsModuleCdbleCncptCdgCd());
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgDsply() != null) {
			guidanceresponsemodulecodeableconceptcoding.setDisplay(g.getGuidnceRspsModuleCdbleCncptCdgDsply());
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgSys() != null) {
			guidanceresponsemodulecodeableconceptcoding.setSystem(g.getGuidnceRspsModuleCdbleCncptCdgSys());
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgUsrSltd() != null) {
			guidanceresponsemodulecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(g.getGuidnceRspsModuleCdbleCncptCdgUsrSltd()));
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptCdgVrsn() != null) {
			guidanceresponsemodulecodeableconceptcoding.setVersion(g.getGuidnceRspsModuleCdbleCncptCdgVrsn());
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Txt ********************************************************************************/
		if(g.getGuidnceRspsModuleCdbleCncptTxt() != null) {
			guidanceresponsemodulecodeableconcept.setText(g.getGuidnceRspsModuleCdbleCncptTxt());
		}
		/******************** GuidnceRsps_ModuleUriTyp ********************************************************************************/
		if(g.getGuidnceRspsModuleUriTyp() != null) {
			guidanceresponse.setModule( new org.hl7.fhir.r4.model.UriType(g.getGuidnceRspsModuleUriTyp()));
		}
		/******************** guidanceresponsenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation guidanceresponsenote =  new org.hl7.fhir.r4.model.Annotation();
		guidanceresponse.addNote(guidanceresponsenote);

		/******************** GuidnceRsps_Nt_AthrRfrnc ********************************************************************************/
		if(g.getGuidnceRspsNtAthrRfrnc() != null) {
			guidanceresponsenote.setAuthor( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsNtAthrRfrnc()));
		}
		/******************** GuidnceRsps_Nt_AthrStrgTyp ********************************************************************************/
		if(g.getGuidnceRspsNtAthrStrgTyp() != null) {
			guidanceresponsenote.setAuthor( new org.hl7.fhir.r4.model.StringType(g.getGuidnceRspsNtAthrStrgTyp()));
		}
		/******************** GuidnceRsps_Nt_Txt ********************************************************************************/
		if(g.getGuidnceRspsNtTxt() != null) {
			guidanceresponsenote.setText(g.getGuidnceRspsNtTxt());
		}
		/******************** GuidnceRsps_Nt_Time ********************************************************************************/
		if(g.getGuidnceRspsNtTime() != null) {
			java.text.SimpleDateFormat GuidnceRsps_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date GuidnceRsps_Nt_Timedate = GuidnceRsps_Nt_Timesdf.parse(g.getGuidnceRspsNtTime());
			guidanceresponsenote.setTime(GuidnceRsps_Nt_Timedate);
		}
		/******************** GuidnceRsps_OccrnceDtTime ********************************************************************************/
		if(g.getGuidnceRspsOccrnceDtTime() != null) {
			java.text.SimpleDateFormat GuidnceRsps_OccrnceDtTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date GuidnceRsps_OccrnceDtTimedate = GuidnceRsps_OccrnceDtTimesdf.parse(g.getGuidnceRspsOccrnceDtTime());
			guidanceresponse.setOccurrenceDateTime(GuidnceRsps_OccrnceDtTimedate);
		}
		/******************** GuidnceRsps_OutputPrmtrs ********************************************************************************/
		if(g.getGuidnceRspsOutputPrmtrs() != null) {
			guidanceresponse.setOutputParameters( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsOutputPrmtrs()));
		}
		/******************** GuidnceRsps_Prfrmr ********************************************************************************/
		if(g.getGuidnceRspsPrfrmr() != null) {
			guidanceresponse.setPerformer( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsPrfrmr()));
		}
		/******************** guidanceresponsereasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponsereasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		guidanceresponse.addReasonCode(guidanceresponsereasoncode);

		/******************** guidanceresponsereasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponsereasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		guidanceresponsereasoncode.addCoding(guidanceresponsereasoncodecoding);

		/******************** GuidnceRsps_RsnCd_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgCd() != null) {
			guidanceresponsereasoncodecoding.setCode(g.getGuidnceRspsRsnCdCdgCd());
		}
		/******************** GuidnceRsps_RsnCd_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgDsply() != null) {
			guidanceresponsereasoncodecoding.setDisplay(g.getGuidnceRspsRsnCdCdgDsply());
		}
		/******************** GuidnceRsps_RsnCd_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgSys() != null) {
			guidanceresponsereasoncodecoding.setSystem(g.getGuidnceRspsRsnCdCdgSys());
		}
		/******************** GuidnceRsps_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgUsrSltd() != null) {
			guidanceresponsereasoncodecoding.setUserSelected(Boolean.parseBoolean(g.getGuidnceRspsRsnCdCdgUsrSltd()));
		}
		/******************** GuidnceRsps_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsRsnCdCdgVrsn() != null) {
			guidanceresponsereasoncodecoding.setVersion(g.getGuidnceRspsRsnCdCdgVrsn());
		}
		/******************** GuidnceRsps_RsnCd_Txt ********************************************************************************/
		if(g.getGuidnceRspsRsnCdTxt() != null) {
			guidanceresponsereasoncode.setText(g.getGuidnceRspsRsnCdTxt());
		}
		/******************** GuidnceRsps_RsnRfrnc ********************************************************************************/
		if(g.getGuidnceRspsRsnRfrnc() != null) {
			guidanceresponse.addReasonReference( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsRsnRfrnc()));
		}
		/******************** guidanceresponserequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier guidanceresponserequestidentifier =  new org.hl7.fhir.r4.model.Identifier();
		guidanceresponse.setRequestIdentifier(guidanceresponserequestidentifier);

		/******************** GuidnceRsps_RqstId_Assigner ********************************************************************************/
		if(g.getGuidnceRspsRqstIdAssigner() != null) {
			guidanceresponserequestidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsRqstIdAssigner()));
		}
		/******************** guidanceresponserequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period guidanceresponserequestidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		guidanceresponserequestidentifier.setPeriod(guidanceresponserequestidentifierperiod);

		/******************** GuidnceRsps_RqstId_Prd_End ********************************************************************************/
		if(g.getGuidnceRspsRqstIdPrdEnd() != null) {
			java.text.SimpleDateFormat GuidnceRsps_RqstId_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date GuidnceRsps_RqstId_Prd_Enddate = GuidnceRsps_RqstId_Prd_Endsdf.parse(g.getGuidnceRspsRqstIdPrdEnd());
			guidanceresponserequestidentifierperiod.setEnd(GuidnceRsps_RqstId_Prd_Enddate);
		}
		/******************** GuidnceRsps_RqstId_Prd_Strt ********************************************************************************/
		if(g.getGuidnceRspsRqstIdPrdStrt() != null) {
			java.text.SimpleDateFormat GuidnceRsps_RqstId_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date GuidnceRsps_RqstId_Prd_Strtdate = GuidnceRsps_RqstId_Prd_Strtsdf.parse(g.getGuidnceRspsRqstIdPrdStrt());
			guidanceresponserequestidentifierperiod.setStart(GuidnceRsps_RqstId_Prd_Strtdate);
		}
		/******************** GuidnceRsps_RqstId_Sys ********************************************************************************/
		if(g.getGuidnceRspsRqstIdSys() != null) {
			guidanceresponserequestidentifier.setSystem(g.getGuidnceRspsRqstIdSys());
		}
		/******************** guidanceresponserequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponserequestidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		guidanceresponserequestidentifier.setType(guidanceresponserequestidentifiertype);

		/******************** guidanceresponserequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponserequestidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		guidanceresponserequestidentifiertype.addCoding(guidanceresponserequestidentifiertypecoding);

		/******************** GuidnceRsps_RqstId_Typ_Cdg_Cd ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgCd() != null) {
			guidanceresponserequestidentifiertypecoding.setCode(g.getGuidnceRspsRqstIdTypCdgCd());
		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Dsply ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgDsply() != null) {
			guidanceresponserequestidentifiertypecoding.setDisplay(g.getGuidnceRspsRqstIdTypCdgDsply());
		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Sys ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgSys() != null) {
			guidanceresponserequestidentifiertypecoding.setSystem(g.getGuidnceRspsRqstIdTypCdgSys());
		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgUsrSltd() != null) {
			guidanceresponserequestidentifiertypecoding.setUserSelected(Boolean.parseBoolean(g.getGuidnceRspsRqstIdTypCdgUsrSltd()));
		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Vrsn ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypCdgVrsn() != null) {
			guidanceresponserequestidentifiertypecoding.setVersion(g.getGuidnceRspsRqstIdTypCdgVrsn());
		}
		/******************** GuidnceRsps_RqstId_Typ_Txt ********************************************************************************/
		if(g.getGuidnceRspsRqstIdTypTxt() != null) {
			guidanceresponserequestidentifiertype.setText(g.getGuidnceRspsRqstIdTypTxt());
		}
		/******************** guidanceresponserequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory guidanceresponserequestidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		guidanceresponserequestidentifier.setUse(guidanceresponserequestidentifieruse.fromCode(g.getGuidnceRspsRqstIdUse()));

		/******************** GuidnceRsps_RqstId_Vl ********************************************************************************/
		if(g.getGuidnceRspsRqstIdVl() != null) {
			guidanceresponserequestidentifier.setValue(g.getGuidnceRspsRqstIdVl());
		}
		/******************** GuidnceRsps_Rslt ********************************************************************************/
		if(g.getGuidnceRspsRslt() != null) {
			guidanceresponse.setResult( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsRslt()));
		}
		/******************** guidanceresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.GuidanceResponse.GuidanceResponseStatusEnumFactory guidanceresponsestatus =  new org.hl7.fhir.r4.model.GuidanceResponse.GuidanceResponseStatusEnumFactory();
		guidanceresponse.setStatus(guidanceresponsestatus.fromCode(g.getGuidnceRspsSts()));

		/******************** GuidnceRsps_Sbjct ********************************************************************************/
		if(g.getGuidnceRspsSbjct() != null) {
			guidanceresponse.setSubject( new org.hl7.fhir.r4.model.Reference(g.getGuidnceRspsSbjct()));
		}
		return guidanceresponse;
	}
}
