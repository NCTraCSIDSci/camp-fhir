package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.GuidanceResponse;
public class GuidanceResponseBidirectionalConversion 
{
	public GuidanceResponse GuidanceResponses(org.hl7.fhir.r4.model.GuidanceResponse guidanceresponse) throws ParseException
	{
		 main.java.com.campfhir.model.GuidanceResponse g = new  main.java.com.campfhir.model.GuidanceResponse();

		/******************** id ********************************************************************************/
		guidanceresponse.setId(g.getId());

		/******************** GuidnceRsps_Rslt ********************************************************************************/
		if(guidanceresponse.hasResult()) {
			g.setGuidnceRspsRslt(String.valueOf(guidanceresponse.getResult()));
		}
		/******************** GuidnceRsps_Prfrmr ********************************************************************************/
		if(guidanceresponse.hasPerformer()) {
			g.setGuidnceRspsPrfrmr(String.valueOf(guidanceresponse.getPerformer()));
		}
		/******************** GuidnceRsps_Enc ********************************************************************************/
		if(guidanceresponse.hasEncounter()) {
			g.setGuidnceRspsEnc(String.valueOf(guidanceresponse.getEncounter()));
		}
		/******************** GuidnceRsps_Sbjct ********************************************************************************/
		if(guidanceresponse.hasSubject()) {
			g.setGuidnceRspsSbjct(String.valueOf(guidanceresponse.getSubject()));
		}
		/******************** guidanceresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.GuidanceResponse.GuidanceResponseStatus guidanceresponsestatus = guidanceresponse.getStatus();
		g.setGuidnceRspsSts(guidanceresponsestatus.toCode());

		/******************** guidanceresponsenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation guidanceresponsenote = guidanceresponse.getNoteFirstRep();

		/******************** GuidnceRsps_Nt_Time ********************************************************************************/
		if(guidanceresponsenote.hasTime()) {
			g.setGuidnceRspsNtTime(String.valueOf(guidanceresponsenote.getTime()));
		}
		/******************** GuidnceRsps_Nt_Txt ********************************************************************************/
		if(guidanceresponsenote.hasText()) {
			g.setGuidnceRspsNtTxt(String.valueOf(guidanceresponsenote.getText()));
		}
		/******************** GuidnceRsps_Nt_AthrRfrnc ********************************************************************************/
		if(guidanceresponsenote.hasAuthorReference()) {
			g.setGuidnceRspsNtAthrRfrnc(String.valueOf(guidanceresponsenote.getAuthorReference()));
		}
		/******************** GuidnceRsps_Nt_AthrStrgTyp ********************************************************************************/
		if(guidanceresponsenote.hasAuthorStringType()) {
			g.setGuidnceRspsNtAthrStrgTyp(String.valueOf(guidanceresponsenote.getAuthorStringType()));
		}
		/******************** GuidnceRsps_OccrnceDtTime ********************************************************************************/
		if(guidanceresponse.hasOccurrenceDateTime()) {
			g.setGuidnceRspsOccrnceDtTime(String.valueOf(guidanceresponse.getOccurrenceDateTime()));
		}
		/******************** GuidnceRsps_EvaluationMsg ********************************************************************************/
		if(guidanceresponse.hasEvaluationMessage()) {
			g.setGuidnceRspsEvaluationMsg(String.valueOf(guidanceresponse.getEvaluationMessageFirstRep()));
		}
		/******************** GuidnceRsps_OutputPrmtrs ********************************************************************************/
		if(guidanceresponse.hasOutputParameters()) {
			g.setGuidnceRspsOutputPrmtrs(String.valueOf(guidanceresponse.getOutputParameters()));
		}
		/******************** guidanceresponsedatarequirement ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement guidanceresponsedatarequirement = guidanceresponse.getDataRequirementFirstRep();

		/******************** GuidnceRsps_DataRqrment_Typ ********************************************************************************/
		if(guidanceresponsedatarequirement.hasType()) {
			g.setGuidnceRspsDataRqrmentTyp(String.valueOf(guidanceresponsedatarequirement.getType()));
		}
		/******************** guidanceresponsedatarequirementsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponsedatarequirementsubjectcodeableconcept = guidanceresponsedatarequirement.getSubjectCodeableConcept();

		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconcept.hasText()) {
			g.setGuidnceRspsDataRqrmentSbjctCdbleCncptTxt(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconcept.getText()));
		}
		/******************** guidanceresponsedatarequirementsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponsedatarequirementsubjectcodeableconceptcoding = guidanceresponsedatarequirementsubjectcodeableconcept.getCodingFirstRep();

		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasVersion()) {
			g.setGuidnceRspsDataRqrmentSbjctCdbleCncptCdgVrsn(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasDisplay()) {
			g.setGuidnceRspsDataRqrmentSbjctCdbleCncptCdgDsply(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasCode()) {
			g.setGuidnceRspsDataRqrmentSbjctCdbleCncptCdgCd(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getCode()));
		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasUserSelected()) {
			g.setGuidnceRspsDataRqrmentSbjctCdbleCncptCdgUsrSltd(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** GuidnceRsps_DataRqrment_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(guidanceresponsedatarequirementsubjectcodeableconceptcoding.hasSystem()) {
			g.setGuidnceRspsDataRqrmentSbjctCdbleCncptCdgSys(String.valueOf(guidanceresponsedatarequirementsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** GuidnceRsps_DataRqrment_SbjctRfrnc ********************************************************************************/
		if(guidanceresponsedatarequirement.hasSubjectReference()) {
			g.setGuidnceRspsDataRqrmentSbjctRfrnc(String.valueOf(guidanceresponsedatarequirement.getSubjectReference()));
		}
		/******************** GuidnceRsps_DataRqrment_Lmt ********************************************************************************/
		if(guidanceresponsedatarequirement.hasLimit()) {
			g.setGuidnceRspsDataRqrmentLmt(String.valueOf(guidanceresponsedatarequirement.getLimit()));
		}
		/******************** guidanceresponsedatarequirementsort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent guidanceresponsedatarequirementsort = guidanceresponsedatarequirement.getSortFirstRep();

		/******************** GuidnceRsps_DataRqrment_Sort_Path ********************************************************************************/
		if(guidanceresponsedatarequirementsort.hasPath()) {
			g.setGuidnceRspsDataRqrmentSortPath(String.valueOf(guidanceresponsedatarequirementsort.getPath()));
		}
		/******************** guidanceresponsedatarequirementsortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection guidanceresponsedatarequirementsortdirection = guidanceresponsedatarequirementsort.getDirection();
		g.setGuidnceRspsDataRqrmentSortDirection(guidanceresponsedatarequirementsortdirection.toCode());

		/******************** guidanceresponsedatarequirementdatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent guidanceresponsedatarequirementdatefilter = guidanceresponsedatarequirement.getDateFilterFirstRep();

		/******************** GuidnceRsps_DataRqrment_DtFltr_Path ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilter.hasPath()) {
			g.setGuidnceRspsDataRqrmentDtFltrPath(String.valueOf(guidanceresponsedatarequirementdatefilter.getPath()));
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_SrchParam ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilter.hasSearchParam()) {
			g.setGuidnceRspsDataRqrmentDtFltrSrchParam(String.valueOf(guidanceresponsedatarequirementdatefilter.getSearchParam()));
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(guidanceresponsedatarequirementdatefilter.hasValueDateTimeType()) {
			g.setGuidnceRspsDataRqrmentDtFltrVlDtTimeTyp(String.valueOf(guidanceresponsedatarequirementdatefilter.getValueDateTimeType()));
		}
		/******************** guidanceresponsedatarequirementdatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration guidanceresponsedatarequirementdatefiltervalueduration = guidanceresponsedatarequirementdatefilter.getValueDuration();

		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Vl ********************************************************************************/
		if(guidanceresponsedatarequirementdatefiltervalueduration.hasValue()) {
			g.setGuidnceRspsDataRqrmentDtFltrVlDurationVl(String.valueOf(guidanceresponsedatarequirementdatefiltervalueduration.getValue()));
		}
		/******************** guidanceresponsedatarequirementdatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator guidanceresponsedatarequirementdatefiltervaluedurationcomparator = guidanceresponsedatarequirementdatefiltervalueduration.getComparator();
		g.setGuidnceRspsDataRqrmentDtFltrVlDurationCmprtr(guidanceresponsedatarequirementdatefiltervaluedurationcomparator.toCode());

		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Cd ********************************************************************************/
		if(guidanceresponsedatarequirementdatefiltervalueduration.hasCode()) {
			g.setGuidnceRspsDataRqrmentDtFltrVlDurationCd(String.valueOf(guidanceresponsedatarequirementdatefiltervalueduration.getCode()));
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Unt ********************************************************************************/
		if(guidanceresponsedatarequirementdatefiltervalueduration.hasUnit()) {
			g.setGuidnceRspsDataRqrmentDtFltrVlDurationUnt(String.valueOf(guidanceresponsedatarequirementdatefiltervalueduration.getUnit()));
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlDuration_Sys ********************************************************************************/
		if(guidanceresponsedatarequirementdatefiltervalueduration.hasSystem()) {
			g.setGuidnceRspsDataRqrmentDtFltrVlDurationSys(String.valueOf(guidanceresponsedatarequirementdatefiltervalueduration.getSystem()));
		}
		/******************** guidanceresponsedatarequirementdatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period guidanceresponsedatarequirementdatefiltervalueperiod = guidanceresponsedatarequirementdatefilter.getValuePeriod();

		/******************** GuidnceRsps_DataRqrment_DtFltr_VlPrd_Strt ********************************************************************************/
		if(guidanceresponsedatarequirementdatefiltervalueperiod.hasStart()) {
			g.setGuidnceRspsDataRqrmentDtFltrVlPrdStrt(String.valueOf(guidanceresponsedatarequirementdatefiltervalueperiod.getStart()));
		}
		/******************** GuidnceRsps_DataRqrment_DtFltr_VlPrd_End ********************************************************************************/
		if(guidanceresponsedatarequirementdatefiltervalueperiod.hasEnd()) {
			g.setGuidnceRspsDataRqrmentDtFltrVlPrdEnd(String.valueOf(guidanceresponsedatarequirementdatefiltervalueperiod.getEnd()));
		}
		/******************** guidanceresponsedatarequirementcodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent guidanceresponsedatarequirementcodefilter = guidanceresponsedatarequirement.getCodeFilterFirstRep();

		/******************** GuidnceRsps_DataRqrment_CdFltr_Path ********************************************************************************/
		if(guidanceresponsedatarequirementcodefilter.hasPath()) {
			g.setGuidnceRspsDataRqrmentCdFltrPath(String.valueOf(guidanceresponsedatarequirementcodefilter.getPath()));
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_SrchParam ********************************************************************************/
		if(guidanceresponsedatarequirementcodefilter.hasSearchParam()) {
			g.setGuidnceRspsDataRqrmentCdFltrSrchParam(String.valueOf(guidanceresponsedatarequirementcodefilter.getSearchParam()));
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_VlSt ********************************************************************************/
		if(guidanceresponsedatarequirementcodefilter.hasValueSet()) {
			g.setGuidnceRspsDataRqrmentCdFltrVlSt(String.valueOf(guidanceresponsedatarequirementcodefilter.getValueSet()));
		}
		/******************** guidanceresponsedatarequirementcodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponsedatarequirementcodefiltercode = guidanceresponsedatarequirementcodefilter.getCodeFirstRep();

		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Vrsn ********************************************************************************/
		if(guidanceresponsedatarequirementcodefiltercode.hasVersion()) {
			g.setGuidnceRspsDataRqrmentCdFltrCdVrsn(String.valueOf(guidanceresponsedatarequirementcodefiltercode.getVersion()));
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Dsply ********************************************************************************/
		if(guidanceresponsedatarequirementcodefiltercode.hasDisplay()) {
			g.setGuidnceRspsDataRqrmentCdFltrCdDsply(String.valueOf(guidanceresponsedatarequirementcodefiltercode.getDisplay()));
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(guidanceresponsedatarequirementcodefiltercode.hasUserSelected()) {
			g.setGuidnceRspsDataRqrmentCdFltrCdUsrSltd(String.valueOf(guidanceresponsedatarequirementcodefiltercode.getUserSelected()));
		}
		/******************** GuidnceRsps_DataRqrment_CdFltr_Cd_Sys ********************************************************************************/
		if(guidanceresponsedatarequirementcodefiltercode.hasSystem()) {
			g.setGuidnceRspsDataRqrmentCdFltrCdSys(String.valueOf(guidanceresponsedatarequirementcodefiltercode.getSystem()));
		}
		/******************** guidanceresponsemodulecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponsemodulecodeableconcept = guidanceresponse.getModuleCodeableConcept();

		/******************** GuidnceRsps_ModuleCdbleCncpt_Txt ********************************************************************************/
		if(guidanceresponsemodulecodeableconcept.hasText()) {
			g.setGuidnceRspsModuleCdbleCncptTxt(String.valueOf(guidanceresponsemodulecodeableconcept.getText()));
		}
		/******************** guidanceresponsemodulecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponsemodulecodeableconceptcoding = guidanceresponsemodulecodeableconcept.getCodingFirstRep();

		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcoding.hasVersion()) {
			g.setGuidnceRspsModuleCdbleCncptCdgVrsn(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getVersion()));
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcoding.hasDisplay()) {
			g.setGuidnceRspsModuleCdbleCncptCdgDsply(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getDisplay()));
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcoding.hasCode()) {
			g.setGuidnceRspsModuleCdbleCncptCdgCd(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getCode()));
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcoding.hasUserSelected()) {
			g.setGuidnceRspsModuleCdbleCncptCdgUsrSltd(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getUserSelected()));
		}
		/******************** GuidnceRsps_ModuleCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(guidanceresponsemodulecodeableconceptcoding.hasSystem()) {
			g.setGuidnceRspsModuleCdbleCncptCdgSys(String.valueOf(guidanceresponsemodulecodeableconceptcoding.getSystem()));
		}
		/******************** GuidnceRsps_ModuleCanonicalTyp ********************************************************************************/
		if(guidanceresponse.hasModuleCanonicalType()) {
			g.setGuidnceRspsModuleCanonicalTyp(String.valueOf(guidanceresponse.getModuleCanonicalType()));
		}
		/******************** guidanceresponserequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier guidanceresponserequestidentifier = guidanceresponse.getRequestIdentifier();

		/******************** GuidnceRsps_RqstId_Vl ********************************************************************************/
		if(guidanceresponserequestidentifier.hasValue()) {
			g.setGuidnceRspsRqstIdVl(String.valueOf(guidanceresponserequestidentifier.getValue()));
		}
		/******************** guidanceresponserequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponserequestidentifiertype = guidanceresponserequestidentifier.getType();

		/******************** GuidnceRsps_RqstId_Typ_Txt ********************************************************************************/
		if(guidanceresponserequestidentifiertype.hasText()) {
			g.setGuidnceRspsRqstIdTypTxt(String.valueOf(guidanceresponserequestidentifiertype.getText()));
		}
		/******************** guidanceresponserequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponserequestidentifiertypecoding = guidanceresponserequestidentifiertype.getCodingFirstRep();

		/******************** GuidnceRsps_RqstId_Typ_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponserequestidentifiertypecoding.hasVersion()) {
			g.setGuidnceRspsRqstIdTypCdgVrsn(String.valueOf(guidanceresponserequestidentifiertypecoding.getVersion()));
		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Dsply ********************************************************************************/
		if(guidanceresponserequestidentifiertypecoding.hasDisplay()) {
			g.setGuidnceRspsRqstIdTypCdgDsply(String.valueOf(guidanceresponserequestidentifiertypecoding.getDisplay()));
		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Cd ********************************************************************************/
		if(guidanceresponserequestidentifiertypecoding.hasCode()) {
			g.setGuidnceRspsRqstIdTypCdgCd(String.valueOf(guidanceresponserequestidentifiertypecoding.getCode()));
		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponserequestidentifiertypecoding.hasUserSelected()) {
			g.setGuidnceRspsRqstIdTypCdgUsrSltd(String.valueOf(guidanceresponserequestidentifiertypecoding.getUserSelected()));
		}
		/******************** GuidnceRsps_RqstId_Typ_Cdg_Sys ********************************************************************************/
		if(guidanceresponserequestidentifiertypecoding.hasSystem()) {
			g.setGuidnceRspsRqstIdTypCdgSys(String.valueOf(guidanceresponserequestidentifiertypecoding.getSystem()));
		}
		/******************** guidanceresponserequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period guidanceresponserequestidentifierperiod = guidanceresponserequestidentifier.getPeriod();

		/******************** GuidnceRsps_RqstId_Prd_Strt ********************************************************************************/
		if(guidanceresponserequestidentifierperiod.hasStart()) {
			g.setGuidnceRspsRqstIdPrdStrt(String.valueOf(guidanceresponserequestidentifierperiod.getStart()));
		}
		/******************** GuidnceRsps_RqstId_Prd_End ********************************************************************************/
		if(guidanceresponserequestidentifierperiod.hasEnd()) {
			g.setGuidnceRspsRqstIdPrdEnd(String.valueOf(guidanceresponserequestidentifierperiod.getEnd()));
		}
		/******************** GuidnceRsps_RqstId_Assigner ********************************************************************************/
		if(guidanceresponserequestidentifier.hasAssigner()) {
			g.setGuidnceRspsRqstIdAssigner(String.valueOf(guidanceresponserequestidentifier.getAssigner()));
		}
		/******************** GuidnceRsps_RqstId_Sys ********************************************************************************/
		if(guidanceresponserequestidentifier.hasSystem()) {
			g.setGuidnceRspsRqstIdSys(String.valueOf(guidanceresponserequestidentifier.getSystem()));
		}
		/******************** guidanceresponserequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse guidanceresponserequestidentifieruse = guidanceresponserequestidentifier.getUse();
		g.setGuidnceRspsRqstIdUse(guidanceresponserequestidentifieruse.toCode());

		/******************** guidanceresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier guidanceresponseidentifier = guidanceresponse.getIdentifierFirstRep();

		/******************** GuidnceRsps_Id_Vl ********************************************************************************/
		if(guidanceresponseidentifier.hasValue()) {
			g.setGuidnceRspsIdVl(String.valueOf(guidanceresponseidentifier.getValue()));
		}
		/******************** guidanceresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponseidentifiertype = guidanceresponseidentifier.getType();

		/******************** GuidnceRsps_Id_Typ_Txt ********************************************************************************/
		if(guidanceresponseidentifiertype.hasText()) {
			g.setGuidnceRspsIdTypTxt(String.valueOf(guidanceresponseidentifiertype.getText()));
		}
		/******************** guidanceresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponseidentifiertypecoding = guidanceresponseidentifiertype.getCodingFirstRep();

		/******************** GuidnceRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponseidentifiertypecoding.hasVersion()) {
			g.setGuidnceRspsIdTypCdgVrsn(String.valueOf(guidanceresponseidentifiertypecoding.getVersion()));
		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(guidanceresponseidentifiertypecoding.hasDisplay()) {
			g.setGuidnceRspsIdTypCdgDsply(String.valueOf(guidanceresponseidentifiertypecoding.getDisplay()));
		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(guidanceresponseidentifiertypecoding.hasCode()) {
			g.setGuidnceRspsIdTypCdgCd(String.valueOf(guidanceresponseidentifiertypecoding.getCode()));
		}
		/******************** GuidnceRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponseidentifiertypecoding.hasUserSelected()) {
			g.setGuidnceRspsIdTypCdgUsrSltd(String.valueOf(guidanceresponseidentifiertypecoding.getUserSelected()));
		}
		/******************** GuidnceRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(guidanceresponseidentifiertypecoding.hasSystem()) {
			g.setGuidnceRspsIdTypCdgSys(String.valueOf(guidanceresponseidentifiertypecoding.getSystem()));
		}
		/******************** guidanceresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period guidanceresponseidentifierperiod = guidanceresponseidentifier.getPeriod();

		/******************** GuidnceRsps_Id_Prd_Strt ********************************************************************************/
		if(guidanceresponseidentifierperiod.hasStart()) {
			g.setGuidnceRspsIdPrdStrt(String.valueOf(guidanceresponseidentifierperiod.getStart()));
		}
		/******************** GuidnceRsps_Id_Prd_End ********************************************************************************/
		if(guidanceresponseidentifierperiod.hasEnd()) {
			g.setGuidnceRspsIdPrdEnd(String.valueOf(guidanceresponseidentifierperiod.getEnd()));
		}
		/******************** GuidnceRsps_Id_Assigner ********************************************************************************/
		if(guidanceresponseidentifier.hasAssigner()) {
			g.setGuidnceRspsIdAssigner(String.valueOf(guidanceresponseidentifier.getAssigner()));
		}
		/******************** GuidnceRsps_Id_Sys ********************************************************************************/
		if(guidanceresponseidentifier.hasSystem()) {
			g.setGuidnceRspsIdSys(String.valueOf(guidanceresponseidentifier.getSystem()));
		}
		/******************** guidanceresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse guidanceresponseidentifieruse = guidanceresponseidentifier.getUse();
		g.setGuidnceRspsIdUse(guidanceresponseidentifieruse.toCode());

		/******************** guidanceresponsereasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept guidanceresponsereasoncode = guidanceresponse.getReasonCodeFirstRep();

		/******************** GuidnceRsps_RsnCd_Txt ********************************************************************************/
		if(guidanceresponsereasoncode.hasText()) {
			g.setGuidnceRspsRsnCdTxt(String.valueOf(guidanceresponsereasoncode.getText()));
		}
		/******************** guidanceresponsereasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding guidanceresponsereasoncodecoding = guidanceresponsereasoncode.getCodingFirstRep();

		/******************** GuidnceRsps_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(guidanceresponsereasoncodecoding.hasVersion()) {
			g.setGuidnceRspsRsnCdCdgVrsn(String.valueOf(guidanceresponsereasoncodecoding.getVersion()));
		}
		/******************** GuidnceRsps_RsnCd_Cdg_Dsply ********************************************************************************/
		if(guidanceresponsereasoncodecoding.hasDisplay()) {
			g.setGuidnceRspsRsnCdCdgDsply(String.valueOf(guidanceresponsereasoncodecoding.getDisplay()));
		}
		/******************** GuidnceRsps_RsnCd_Cdg_Cd ********************************************************************************/
		if(guidanceresponsereasoncodecoding.hasCode()) {
			g.setGuidnceRspsRsnCdCdgCd(String.valueOf(guidanceresponsereasoncodecoding.getCode()));
		}
		/******************** GuidnceRsps_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(guidanceresponsereasoncodecoding.hasUserSelected()) {
			g.setGuidnceRspsRsnCdCdgUsrSltd(String.valueOf(guidanceresponsereasoncodecoding.getUserSelected()));
		}
		/******************** GuidnceRsps_RsnCd_Cdg_Sys ********************************************************************************/
		if(guidanceresponsereasoncodecoding.hasSystem()) {
			g.setGuidnceRspsRsnCdCdgSys(String.valueOf(guidanceresponsereasoncodecoding.getSystem()));
		}
		/******************** GuidnceRsps_RsnRfrnc ********************************************************************************/
		if(guidanceresponse.hasReasonReference()) {
			g.setGuidnceRspsRsnRfrnc(String.valueOf(guidanceresponse.getReasonReferenceFirstRep()));
		}
		/******************** GuidnceRsps_ModuleUriTyp ********************************************************************************/
		if(guidanceresponse.hasModuleUriType()) {
			g.setGuidnceRspsModuleUriTyp(String.valueOf(guidanceresponse.getModuleUriType()));
		}
		return g;
	}
}
