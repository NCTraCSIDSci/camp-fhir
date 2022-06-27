package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.EventDefinition;
public class EventDefinitionBidirectionalConversion 
{
	public EventDefinition EventDefinitions(org.hl7.fhir.r4.model.EventDefinition eventdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.EventDefinition e = new  main.java.com.campfhir.model.EventDefinition();

		/******************** id ********************************************************************************/
		eventdefinition.setId(e.getId());

		/******************** EvntDfn_Nm ********************************************************************************/
		if(eventdefinition.hasName()) {
			e.setEvntDfnNm(String.valueOf(eventdefinition.getName()));
		}
		/******************** EvntDfn_Dt ********************************************************************************/
		if(eventdefinition.hasDate()) {
			e.setEvntDfnDt(String.valueOf(eventdefinition.getDate()));
		}
		/******************** EvntDfn_Vrsn ********************************************************************************/
		if(eventdefinition.hasVersion()) {
			e.setEvntDfnVrsn(String.valueOf(eventdefinition.getVersion()));
		}
		/******************** eventdefinitionreviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitionreviewer = eventdefinition.getReviewerFirstRep();

		/******************** EvntDfn_Rviewr_Nm ********************************************************************************/
		if(eventdefinitionreviewer.hasName()) {
			e.setEvntDfnRviewrNm(String.valueOf(eventdefinitionreviewer.getName()));
		}
		/******************** eventdefinitionreviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitionreviewertelecom = eventdefinitionreviewer.getTelecomFirstRep();

		/******************** EvntDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(eventdefinitionreviewertelecom.hasValue()) {
			e.setEvntDfnRviewrTlcmVl(String.valueOf(eventdefinitionreviewertelecom.getValue()));
		}
		/******************** eventdefinitionreviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionreviewertelecomperiod = eventdefinitionreviewertelecom.getPeriod();

		/******************** EvntDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitionreviewertelecomperiod.hasStart()) {
			e.setEvntDfnRviewrTlcmPrdStrt(String.valueOf(eventdefinitionreviewertelecomperiod.getStart()));
		}
		/******************** EvntDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitionreviewertelecomperiod.hasEnd()) {
			e.setEvntDfnRviewrTlcmPrdEnd(String.valueOf(eventdefinitionreviewertelecomperiod.getEnd()));
		}
		/******************** eventdefinitionreviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitionreviewertelecomsystem = eventdefinitionreviewertelecom.getSystem();
		e.setEvntDfnRviewrTlcmSys(eventdefinitionreviewertelecomsystem.toCode());

		/******************** eventdefinitionreviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitionreviewertelecomuse = eventdefinitionreviewertelecom.getUse();
		e.setEvntDfnRviewrTlcmUse(eventdefinitionreviewertelecomuse.toCode());

		/******************** EvntDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitionreviewertelecom.hasRank()) {
			e.setEvntDfnRviewrTlcmRnk(String.valueOf(eventdefinitionreviewertelecom.getRank()));
		}
		/******************** eventdefinitionsubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionsubjectcodeableconcept = eventdefinition.getSubjectCodeableConcept();

		/******************** EvntDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(eventdefinitionsubjectcodeableconcept.hasText()) {
			e.setEvntDfnSbjctCdbleCncptTxt(String.valueOf(eventdefinitionsubjectcodeableconcept.getText()));
		}
		/******************** eventdefinitionsubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionsubjectcodeableconceptcoding = eventdefinitionsubjectcodeableconcept.getCodingFirstRep();

		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcoding.hasVersion()) {
			e.setEvntDfnSbjctCdbleCncptCdgVrsn(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getVersion()));
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcoding.hasDisplay()) {
			e.setEvntDfnSbjctCdbleCncptCdgDsply(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcoding.hasCode()) {
			e.setEvntDfnSbjctCdbleCncptCdgCd(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getCode()));
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcoding.hasUserSelected()) {
			e.setEvntDfnSbjctCdbleCncptCdgUsrSltd(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** EvntDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(eventdefinitionsubjectcodeableconceptcoding.hasSystem()) {
			e.setEvntDfnSbjctCdbleCncptCdgSys(String.valueOf(eventdefinitionsubjectcodeableconceptcoding.getSystem()));
		}
		/******************** EvntDfn_SbjctRfrnc ********************************************************************************/
		if(eventdefinition.hasSubjectReference()) {
			e.setEvntDfnSbjctRfrnc(String.valueOf(eventdefinition.getSubjectReference()));
		}
		/******************** eventdefinitionendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitionendorser = eventdefinition.getEndorserFirstRep();

		/******************** EvntDfn_Endsr_Nm ********************************************************************************/
		if(eventdefinitionendorser.hasName()) {
			e.setEvntDfnEndsrNm(String.valueOf(eventdefinitionendorser.getName()));
		}
		/******************** eventdefinitionendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitionendorsertelecom = eventdefinitionendorser.getTelecomFirstRep();

		/******************** EvntDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(eventdefinitionendorsertelecom.hasValue()) {
			e.setEvntDfnEndsrTlcmVl(String.valueOf(eventdefinitionendorsertelecom.getValue()));
		}
		/******************** eventdefinitionendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionendorsertelecomperiod = eventdefinitionendorsertelecom.getPeriod();

		/******************** EvntDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitionendorsertelecomperiod.hasStart()) {
			e.setEvntDfnEndsrTlcmPrdStrt(String.valueOf(eventdefinitionendorsertelecomperiod.getStart()));
		}
		/******************** EvntDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitionendorsertelecomperiod.hasEnd()) {
			e.setEvntDfnEndsrTlcmPrdEnd(String.valueOf(eventdefinitionendorsertelecomperiod.getEnd()));
		}
		/******************** eventdefinitionendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitionendorsertelecomsystem = eventdefinitionendorsertelecom.getSystem();
		e.setEvntDfnEndsrTlcmSys(eventdefinitionendorsertelecomsystem.toCode());

		/******************** eventdefinitionendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitionendorsertelecomuse = eventdefinitionendorsertelecom.getUse();
		e.setEvntDfnEndsrTlcmUse(eventdefinitionendorsertelecomuse.toCode());

		/******************** EvntDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitionendorsertelecom.hasRank()) {
			e.setEvntDfnEndsrTlcmRnk(String.valueOf(eventdefinitionendorsertelecom.getRank()));
		}
		/******************** EvntDfn_Ttl ********************************************************************************/
		if(eventdefinition.hasTitle()) {
			e.setEvntDfnTtl(String.valueOf(eventdefinition.getTitle()));
		}
		/******************** EvntDfn_Subtitle ********************************************************************************/
		if(eventdefinition.hasSubtitle()) {
			e.setEvntDfnSubtitle(String.valueOf(eventdefinition.getSubtitle()));
		}
		/******************** eventdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus eventdefinitionstatus = eventdefinition.getStatus();
		e.setEvntDfnSts(eventdefinitionstatus.toCode());

		/******************** EvntDfn_Dscrptn ********************************************************************************/
		if(eventdefinition.hasDescription()) {
			e.setEvntDfnDscrptn(String.valueOf(eventdefinition.getDescription()));
		}
		/******************** EvntDfn_Url ********************************************************************************/
		if(eventdefinition.hasUrl()) {
			e.setEvntDfnUrl(String.valueOf(eventdefinition.getUrl()));
		}
		/******************** eventdefinitiontrigger ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition eventdefinitiontrigger = eventdefinition.getTriggerFirstRep();

		/******************** EvntDfn_Trgr_Nm ********************************************************************************/
		if(eventdefinitiontrigger.hasName()) {
			e.setEvntDfnTrgrNm(String.valueOf(eventdefinitiontrigger.getName()));
		}
		/******************** eventdefinitiontriggertype ********************************************************************************/
		org.hl7.fhir.r4.model.TriggerDefinition.TriggerType eventdefinitiontriggertype = eventdefinitiontrigger.getType();
		e.setEvntDfnTrgrTyp(eventdefinitiontriggertype.toCode());

		/******************** eventdefinitiontriggerdata ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement eventdefinitiontriggerdata = eventdefinitiontrigger.getDataFirstRep();

		/******************** EvntDfn_Trgr_Data_Typ ********************************************************************************/
		if(eventdefinitiontriggerdata.hasType()) {
			e.setEvntDfnTrgrDataTyp(String.valueOf(eventdefinitiontriggerdata.getType()));
		}
		/******************** eventdefinitiontriggerdatasubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitiontriggerdatasubjectcodeableconcept = eventdefinitiontriggerdata.getSubjectCodeableConcept();

		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconcept.hasText()) {
			e.setEvntDfnTrgrDataSbjctCdbleCncptTxt(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconcept.getText()));
		}
		/******************** eventdefinitiontriggerdatasubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitiontriggerdatasubjectcodeableconceptcoding = eventdefinitiontriggerdatasubjectcodeableconcept.getCodingFirstRep();

		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasVersion()) {
			e.setEvntDfnTrgrDataSbjctCdbleCncptCdgVrsn(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getVersion()));
		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasDisplay()) {
			e.setEvntDfnTrgrDataSbjctCdbleCncptCdgDsply(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasCode()) {
			e.setEvntDfnTrgrDataSbjctCdbleCncptCdgCd(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getCode()));
		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasUserSelected()) {
			e.setEvntDfnTrgrDataSbjctCdbleCncptCdgUsrSltd(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** EvntDfn_Trgr_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(eventdefinitiontriggerdatasubjectcodeableconceptcoding.hasSystem()) {
			e.setEvntDfnTrgrDataSbjctCdbleCncptCdgSys(String.valueOf(eventdefinitiontriggerdatasubjectcodeableconceptcoding.getSystem()));
		}
		/******************** EvntDfn_Trgr_Data_SbjctRfrnc ********************************************************************************/
		if(eventdefinitiontriggerdata.hasSubjectReference()) {
			e.setEvntDfnTrgrDataSbjctRfrnc(String.valueOf(eventdefinitiontriggerdata.getSubjectReference()));
		}
		/******************** EvntDfn_Trgr_Data_Lmt ********************************************************************************/
		if(eventdefinitiontriggerdata.hasLimit()) {
			e.setEvntDfnTrgrDataLmt(String.valueOf(eventdefinitiontriggerdata.getLimit()));
		}
		/******************** eventdefinitiontriggerdatasort ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementSortComponent eventdefinitiontriggerdatasort = eventdefinitiontriggerdata.getSortFirstRep();

		/******************** EvntDfn_Trgr_Data_Sort_Path ********************************************************************************/
		if(eventdefinitiontriggerdatasort.hasPath()) {
			e.setEvntDfnTrgrDataSortPath(String.valueOf(eventdefinitiontriggerdatasort.getPath()));
		}
		/******************** eventdefinitiontriggerdatasortdirection ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.SortDirection eventdefinitiontriggerdatasortdirection = eventdefinitiontriggerdatasort.getDirection();
		e.setEvntDfnTrgrDataSortDirection(eventdefinitiontriggerdatasortdirection.toCode());

		/******************** eventdefinitiontriggerdatadatefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementDateFilterComponent eventdefinitiontriggerdatadatefilter = eventdefinitiontriggerdata.getDateFilterFirstRep();

		/******************** EvntDfn_Trgr_Data_DtFltr_Path ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilter.hasPath()) {
			e.setEvntDfnTrgrDataDtFltrPath(String.valueOf(eventdefinitiontriggerdatadatefilter.getPath()));
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_SrchParam ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilter.hasSearchParam()) {
			e.setEvntDfnTrgrDataDtFltrSrchParam(String.valueOf(eventdefinitiontriggerdatadatefilter.getSearchParam()));
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(eventdefinitiontriggerdatadatefilter.hasValueDateTimeType()) {
			e.setEvntDfnTrgrDataDtFltrVlDtTimeTyp(String.valueOf(eventdefinitiontriggerdatadatefilter.getValueDateTimeType()));
		}
		/******************** eventdefinitiontriggerdatadatefiltervalueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration eventdefinitiontriggerdatadatefiltervalueduration = eventdefinitiontriggerdatadatefilter.getValueDuration();

		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(eventdefinitiontriggerdatadatefiltervalueduration.hasValue()) {
			e.setEvntDfnTrgrDataDtFltrVlDurationVl(String.valueOf(eventdefinitiontriggerdatadatefiltervalueduration.getValue()));
		}
		/******************** eventdefinitiontriggerdatadatefiltervaluedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitiontriggerdatadatefiltervaluedurationcomparator = eventdefinitiontriggerdatadatefiltervalueduration.getComparator();
		e.setEvntDfnTrgrDataDtFltrVlDurationCmprtr(eventdefinitiontriggerdatadatefiltervaluedurationcomparator.toCode());

		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(eventdefinitiontriggerdatadatefiltervalueduration.hasCode()) {
			e.setEvntDfnTrgrDataDtFltrVlDurationCd(String.valueOf(eventdefinitiontriggerdatadatefiltervalueduration.getCode()));
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(eventdefinitiontriggerdatadatefiltervalueduration.hasUnit()) {
			e.setEvntDfnTrgrDataDtFltrVlDurationUnt(String.valueOf(eventdefinitiontriggerdatadatefiltervalueduration.getUnit()));
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(eventdefinitiontriggerdatadatefiltervalueduration.hasSystem()) {
			e.setEvntDfnTrgrDataDtFltrVlDurationSys(String.valueOf(eventdefinitiontriggerdatadatefiltervalueduration.getSystem()));
		}
		/******************** eventdefinitiontriggerdatadatefiltervalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitiontriggerdatadatefiltervalueperiod = eventdefinitiontriggerdatadatefilter.getValuePeriod();

		/******************** EvntDfn_Trgr_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(eventdefinitiontriggerdatadatefiltervalueperiod.hasStart()) {
			e.setEvntDfnTrgrDataDtFltrVlPrdStrt(String.valueOf(eventdefinitiontriggerdatadatefiltervalueperiod.getStart()));
		}
		/******************** EvntDfn_Trgr_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(eventdefinitiontriggerdatadatefiltervalueperiod.hasEnd()) {
			e.setEvntDfnTrgrDataDtFltrVlPrdEnd(String.valueOf(eventdefinitiontriggerdatadatefiltervalueperiod.getEnd()));
		}
		/******************** eventdefinitiontriggerdatacodefilter ********************************************************************************/
		org.hl7.fhir.r4.model.DataRequirement.DataRequirementCodeFilterComponent eventdefinitiontriggerdatacodefilter = eventdefinitiontriggerdata.getCodeFilterFirstRep();

		/******************** EvntDfn_Trgr_Data_CdFltr_Path ********************************************************************************/
		if(eventdefinitiontriggerdatacodefilter.hasPath()) {
			e.setEvntDfnTrgrDataCdFltrPath(String.valueOf(eventdefinitiontriggerdatacodefilter.getPath()));
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_SrchParam ********************************************************************************/
		if(eventdefinitiontriggerdatacodefilter.hasSearchParam()) {
			e.setEvntDfnTrgrDataCdFltrSrchParam(String.valueOf(eventdefinitiontriggerdatacodefilter.getSearchParam()));
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_VlSt ********************************************************************************/
		if(eventdefinitiontriggerdatacodefilter.hasValueSet()) {
			e.setEvntDfnTrgrDataCdFltrVlSt(String.valueOf(eventdefinitiontriggerdatacodefilter.getValueSet()));
		}
		/******************** eventdefinitiontriggerdatacodefiltercode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitiontriggerdatacodefiltercode = eventdefinitiontriggerdatacodefilter.getCodeFirstRep();

		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(eventdefinitiontriggerdatacodefiltercode.hasVersion()) {
			e.setEvntDfnTrgrDataCdFltrCdVrsn(String.valueOf(eventdefinitiontriggerdatacodefiltercode.getVersion()));
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(eventdefinitiontriggerdatacodefiltercode.hasDisplay()) {
			e.setEvntDfnTrgrDataCdFltrCdDsply(String.valueOf(eventdefinitiontriggerdatacodefiltercode.getDisplay()));
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(eventdefinitiontriggerdatacodefiltercode.hasUserSelected()) {
			e.setEvntDfnTrgrDataCdFltrCdUsrSltd(String.valueOf(eventdefinitiontriggerdatacodefiltercode.getUserSelected()));
		}
		/******************** EvntDfn_Trgr_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(eventdefinitiontriggerdatacodefiltercode.hasSystem()) {
			e.setEvntDfnTrgrDataCdFltrCdSys(String.valueOf(eventdefinitiontriggerdatacodefiltercode.getSystem()));
		}
		/******************** EvntDfn_Trgr_TmgRfrnc ********************************************************************************/
		if(eventdefinitiontrigger.hasTimingReference()) {
			e.setEvntDfnTrgrTmgRfrnc(String.valueOf(eventdefinitiontrigger.getTimingReference()));
		}
		/******************** eventdefinitiontriggercondition ********************************************************************************/
		org.hl7.fhir.r4.model.Expression eventdefinitiontriggercondition = eventdefinitiontrigger.getCondition();

		/******************** EvntDfn_Trgr_Cndtn_Nm ********************************************************************************/
		if(eventdefinitiontriggercondition.hasName()) {
			e.setEvntDfnTrgrCndtnNm(String.valueOf(eventdefinitiontriggercondition.getName()));
		}
		/******************** EvntDfn_Trgr_Cndtn_Rfrnc ********************************************************************************/
		if(eventdefinitiontriggercondition.hasReference()) {
			e.setEvntDfnTrgrCndtnRfrnc(String.valueOf(eventdefinitiontriggercondition.getReference()));
		}
		/******************** EvntDfn_Trgr_Cndtn_Lnguage ********************************************************************************/
		if(eventdefinitiontriggercondition.hasLanguage()) {
			e.setEvntDfnTrgrCndtnLnguage(String.valueOf(eventdefinitiontriggercondition.getLanguage()));
		}
		/******************** EvntDfn_Trgr_Cndtn_Dscrptn ********************************************************************************/
		if(eventdefinitiontriggercondition.hasDescription()) {
			e.setEvntDfnTrgrCndtnDscrptn(String.valueOf(eventdefinitiontriggercondition.getDescription()));
		}
		/******************** EvntDfn_Trgr_Cndtn_Exprsn ********************************************************************************/
		if(eventdefinitiontriggercondition.hasExpression()) {
			e.setEvntDfnTrgrCndtnExprsn(String.valueOf(eventdefinitiontriggercondition.getExpression()));
		}
		/******************** EvntDfn_Trgr_TmgDtTyp ********************************************************************************/
		if(eventdefinitiontrigger.hasTimingDateType()) {
			e.setEvntDfnTrgrTmgDtTyp(String.valueOf(eventdefinitiontrigger.getTimingDateType()));
		}
		/******************** EvntDfn_Trgr_TmgDtTimeTyp ********************************************************************************/
		if(eventdefinitiontrigger.hasTimingDateTimeType()) {
			e.setEvntDfnTrgrTmgDtTimeTyp(String.valueOf(eventdefinitiontrigger.getTimingDateTimeType()));
		}
		/******************** eventdefinitiontriggertimingtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing eventdefinitiontriggertimingtiming = eventdefinitiontrigger.getTimingTiming();

		/******************** eventdefinitiontriggertimingtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitiontriggertimingtimingcode = eventdefinitiontriggertimingtiming.getCode();

		/******************** EvntDfn_Trgr_TmgTmg_Cd_Txt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcode.hasText()) {
			e.setEvntDfnTrgrTmgTmgCdTxt(String.valueOf(eventdefinitiontriggertimingtimingcode.getText()));
		}
		/******************** eventdefinitiontriggertimingtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitiontriggertimingtimingcodecoding = eventdefinitiontriggertimingtimingcode.getCodingFirstRep();

		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecoding.hasVersion()) {
			e.setEvntDfnTrgrTmgTmgCdCdgVrsn(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getVersion()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecoding.hasDisplay()) {
			e.setEvntDfnTrgrTmgTmgCdCdgDsply(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getDisplay()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecoding.hasCode()) {
			e.setEvntDfnTrgrTmgTmgCdCdgCd(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getCode()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecoding.hasUserSelected()) {
			e.setEvntDfnTrgrTmgTmgCdCdgUsrSltd(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getUserSelected()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(eventdefinitiontriggertimingtimingcodecoding.hasSystem()) {
			e.setEvntDfnTrgrTmgTmgCdCdgSys(String.valueOf(eventdefinitiontriggertimingtimingcodecoding.getSystem()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent eventdefinitiontriggertimingtimingrepeat = eventdefinitiontriggertimingtiming.getRepeat();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Off ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasOffset()) {
			e.setEvntDfnTrgrTmgTmgRptOff(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getOffset()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasCount()) {
			e.setEvntDfnTrgrTmgTmgRptCnt(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getCount()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasFrequency()) {
			e.setEvntDfnTrgrTmgTmgRptFrqncy(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getFrequency()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Prd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasPeriod()) {
			e.setEvntDfnTrgrTmgTmgRptPrd(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getPeriod()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_Duration ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasDuration()) {
			e.setEvntDfnTrgrTmgTmgRptDuration(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getDuration()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration eventdefinitiontriggertimingtimingrepeatboundsduration = eventdefinitiontriggertimingtimingrepeat.getBoundsDuration();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsduration.hasValue()) {
			e.setEvntDfnTrgrTmgTmgRptBndsDurationVl(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsduration.getValue()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator = eventdefinitiontriggertimingtimingrepeatboundsduration.getComparator();
		e.setEvntDfnTrgrTmgTmgRptBndsDurationCmprtr(eventdefinitiontriggertimingtimingrepeatboundsdurationcomparator.toCode());

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsduration.hasCode()) {
			e.setEvntDfnTrgrTmgTmgRptBndsDurationCd(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsduration.getCode()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsduration.hasUnit()) {
			e.setEvntDfnTrgrTmgTmgRptBndsDurationUnt(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsduration.getUnit()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsduration.hasSystem()) {
			e.setEvntDfnTrgrTmgTmgRptBndsDurationSys(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsduration.getSystem()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range eventdefinitiontriggertimingtimingrepeatboundsrange = eventdefinitiontriggertimingtimingrepeat.getBoundsRange();

		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitiontriggertimingtimingrepeatboundsrangelow = eventdefinitiontriggertimingtimingrepeatboundsrange.getLow();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangelow.hasValue()) {
			e.setEvntDfnTrgrTmgTmgRptBndsRngLwVl(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangelow.getValue()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator = eventdefinitiontriggertimingtimingrepeatboundsrangelow.getComparator();
		e.setEvntDfnTrgrTmgTmgRptBndsRngLwCmprtr(eventdefinitiontriggertimingtimingrepeatboundsrangelowcomparator.toCode());

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangelow.hasCode()) {
			e.setEvntDfnTrgrTmgTmgRptBndsRngLwCd(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangelow.getCode()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangelow.hasUnit()) {
			e.setEvntDfnTrgrTmgTmgRptBndsRngLwUnt(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangelow.getUnit()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangelow.hasSystem()) {
			e.setEvntDfnTrgrTmgTmgRptBndsRngLwSys(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangelow.getSystem()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitiontriggertimingtimingrepeatboundsrangehigh = eventdefinitiontriggertimingtimingrepeatboundsrange.getHigh();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.hasValue()) {
			e.setEvntDfnTrgrTmgTmgRptBndsRngHiVl(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getValue()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator = eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getComparator();
		e.setEvntDfnTrgrTmgTmgRptBndsRngHiCmprtr(eventdefinitiontriggertimingtimingrepeatboundsrangehighcomparator.toCode());

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.hasCode()) {
			e.setEvntDfnTrgrTmgTmgRptBndsRngHiCd(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getCode()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.hasUnit()) {
			e.setEvntDfnTrgrTmgTmgRptBndsRngHiUnt(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.hasSystem()) {
			e.setEvntDfnTrgrTmgTmgRptBndsRngHiSys(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitiontriggertimingtimingrepeatboundsperiod = eventdefinitiontriggertimingtimingrepeat.getBoundsPeriod();

		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsperiod.hasStart()) {
			e.setEvntDfnTrgrTmgTmgRptBndsPrdStrt(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsperiod.getStart()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeatboundsperiod.hasEnd()) {
			e.setEvntDfnTrgrTmgTmgRptBndsPrdEnd(String.valueOf(eventdefinitiontriggertimingtimingrepeatboundsperiod.getEnd()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasPeriodMax()) {
			e.setEvntDfnTrgrTmgTmgRptPrdMx(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getPeriodMax()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasDurationMax()) {
			e.setEvntDfnTrgrTmgTmgRptDurationMx(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getDurationMax()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasCountMax()) {
			e.setEvntDfnTrgrTmgTmgRptCntMx(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getCountMax()));
		}
		/******************** EvntDfn_Trgr_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(eventdefinitiontriggertimingtimingrepeat.hasFrequencyMax()) {
			e.setEvntDfnTrgrTmgTmgRptFrqncyMx(String.valueOf(eventdefinitiontriggertimingtimingrepeat.getFrequencyMax()));
		}
		/******************** eventdefinitiontriggertimingtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime eventdefinitiontriggertimingtimingrepeatdurationunit = eventdefinitiontriggertimingtimingrepeat.getDurationUnit();
		e.setEvntDfnTrgrTmgTmgRptDurationUnt(eventdefinitiontriggertimingtimingrepeatdurationunit.toCode());

		/******************** eventdefinitiontriggertimingtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime eventdefinitiontriggertimingtimingrepeatperiodunit = eventdefinitiontriggertimingtimingrepeat.getPeriodUnit();
		e.setEvntDfnTrgrTmgTmgRptPrdUnt(eventdefinitiontriggertimingtimingrepeatperiodunit.toCode());

		/******************** EvntDfn_Pblshr ********************************************************************************/
		if(eventdefinition.hasPublisher()) {
			e.setEvntDfnPblshr(String.valueOf(eventdefinition.getPublisher()));
		}
		/******************** EvntDfn_Exprmtl ********************************************************************************/
		if(eventdefinition.hasExperimental()) {
			e.setEvntDfnExprmtl(String.valueOf(eventdefinition.getExperimental()));
		}
		/******************** eventdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitioneffectiveperiod = eventdefinition.getEffectivePeriod();

		/******************** EvntDfn_EfctivePrd_Strt ********************************************************************************/
		if(eventdefinitioneffectiveperiod.hasStart()) {
			e.setEvntDfnEfctivePrdStrt(String.valueOf(eventdefinitioneffectiveperiod.getStart()));
		}
		/******************** EvntDfn_EfctivePrd_End ********************************************************************************/
		if(eventdefinitioneffectiveperiod.hasEnd()) {
			e.setEvntDfnEfctivePrdEnd(String.valueOf(eventdefinitioneffectiveperiod.getEnd()));
		}
		/******************** EvntDfn_Prpse ********************************************************************************/
		if(eventdefinition.hasPurpose()) {
			e.setEvntDfnPrpse(String.valueOf(eventdefinition.getPurpose()));
		}
		/******************** eventdefinitionauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitionauthor = eventdefinition.getAuthorFirstRep();

		/******************** EvntDfn_Athr_Nm ********************************************************************************/
		if(eventdefinitionauthor.hasName()) {
			e.setEvntDfnAthrNm(String.valueOf(eventdefinitionauthor.getName()));
		}
		/******************** eventdefinitionauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitionauthortelecom = eventdefinitionauthor.getTelecomFirstRep();

		/******************** EvntDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(eventdefinitionauthortelecom.hasValue()) {
			e.setEvntDfnAthrTlcmVl(String.valueOf(eventdefinitionauthortelecom.getValue()));
		}
		/******************** eventdefinitionauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionauthortelecomperiod = eventdefinitionauthortelecom.getPeriod();

		/******************** EvntDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitionauthortelecomperiod.hasStart()) {
			e.setEvntDfnAthrTlcmPrdStrt(String.valueOf(eventdefinitionauthortelecomperiod.getStart()));
		}
		/******************** EvntDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitionauthortelecomperiod.hasEnd()) {
			e.setEvntDfnAthrTlcmPrdEnd(String.valueOf(eventdefinitionauthortelecomperiod.getEnd()));
		}
		/******************** eventdefinitionauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitionauthortelecomsystem = eventdefinitionauthortelecom.getSystem();
		e.setEvntDfnAthrTlcmSys(eventdefinitionauthortelecomsystem.toCode());

		/******************** eventdefinitionauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitionauthortelecomuse = eventdefinitionauthortelecom.getUse();
		e.setEvntDfnAthrTlcmUse(eventdefinitionauthortelecomuse.toCode());

		/******************** EvntDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitionauthortelecom.hasRank()) {
			e.setEvntDfnAthrTlcmRnk(String.valueOf(eventdefinitionauthortelecom.getRank()));
		}
		/******************** eventdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitioncontact = eventdefinition.getContactFirstRep();

		/******************** EvntDfn_Cntct_Nm ********************************************************************************/
		if(eventdefinitioncontact.hasName()) {
			e.setEvntDfnCntctNm(String.valueOf(eventdefinitioncontact.getName()));
		}
		/******************** eventdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitioncontacttelecom = eventdefinitioncontact.getTelecomFirstRep();

		/******************** EvntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(eventdefinitioncontacttelecom.hasValue()) {
			e.setEvntDfnCntctTlcmVl(String.valueOf(eventdefinitioncontacttelecom.getValue()));
		}
		/******************** eventdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitioncontacttelecomperiod = eventdefinitioncontacttelecom.getPeriod();

		/******************** EvntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitioncontacttelecomperiod.hasStart()) {
			e.setEvntDfnCntctTlcmPrdStrt(String.valueOf(eventdefinitioncontacttelecomperiod.getStart()));
		}
		/******************** EvntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitioncontacttelecomperiod.hasEnd()) {
			e.setEvntDfnCntctTlcmPrdEnd(String.valueOf(eventdefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** eventdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitioncontacttelecomsystem = eventdefinitioncontacttelecom.getSystem();
		e.setEvntDfnCntctTlcmSys(eventdefinitioncontacttelecomsystem.toCode());

		/******************** eventdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitioncontacttelecomuse = eventdefinitioncontacttelecom.getUse();
		e.setEvntDfnCntctTlcmUse(eventdefinitioncontacttelecomuse.toCode());

		/******************** EvntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitioncontacttelecom.hasRank()) {
			e.setEvntDfnCntctTlcmRnk(String.valueOf(eventdefinitioncontacttelecom.getRank()));
		}
		/******************** eventdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier eventdefinitionidentifier = eventdefinition.getIdentifierFirstRep();

		/******************** EvntDfn_Id_Vl ********************************************************************************/
		if(eventdefinitionidentifier.hasValue()) {
			e.setEvntDfnIdVl(String.valueOf(eventdefinitionidentifier.getValue()));
		}
		/******************** eventdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionidentifiertype = eventdefinitionidentifier.getType();

		/******************** EvntDfn_Id_Typ_Txt ********************************************************************************/
		if(eventdefinitionidentifiertype.hasText()) {
			e.setEvntDfnIdTypTxt(String.valueOf(eventdefinitionidentifiertype.getText()));
		}
		/******************** eventdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionidentifiertypecoding = eventdefinitionidentifiertype.getCodingFirstRep();

		/******************** EvntDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitionidentifiertypecoding.hasVersion()) {
			e.setEvntDfnIdTypCdgVrsn(String.valueOf(eventdefinitionidentifiertypecoding.getVersion()));
		}
		/******************** EvntDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(eventdefinitionidentifiertypecoding.hasDisplay()) {
			e.setEvntDfnIdTypCdgDsply(String.valueOf(eventdefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** EvntDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(eventdefinitionidentifiertypecoding.hasCode()) {
			e.setEvntDfnIdTypCdgCd(String.valueOf(eventdefinitionidentifiertypecoding.getCode()));
		}
		/******************** EvntDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitionidentifiertypecoding.hasUserSelected()) {
			e.setEvntDfnIdTypCdgUsrSltd(String.valueOf(eventdefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** EvntDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(eventdefinitionidentifiertypecoding.hasSystem()) {
			e.setEvntDfnIdTypCdgSys(String.valueOf(eventdefinitionidentifiertypecoding.getSystem()));
		}
		/******************** eventdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitionidentifierperiod = eventdefinitionidentifier.getPeriod();

		/******************** EvntDfn_Id_Prd_Strt ********************************************************************************/
		if(eventdefinitionidentifierperiod.hasStart()) {
			e.setEvntDfnIdPrdStrt(String.valueOf(eventdefinitionidentifierperiod.getStart()));
		}
		/******************** EvntDfn_Id_Prd_End ********************************************************************************/
		if(eventdefinitionidentifierperiod.hasEnd()) {
			e.setEvntDfnIdPrdEnd(String.valueOf(eventdefinitionidentifierperiod.getEnd()));
		}
		/******************** EvntDfn_Id_Assigner ********************************************************************************/
		if(eventdefinitionidentifier.hasAssigner()) {
			e.setEvntDfnIdAssigner(String.valueOf(eventdefinitionidentifier.getAssigner()));
		}
		/******************** EvntDfn_Id_Sys ********************************************************************************/
		if(eventdefinitionidentifier.hasSystem()) {
			e.setEvntDfnIdSys(String.valueOf(eventdefinitionidentifier.getSystem()));
		}
		/******************** eventdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse eventdefinitionidentifieruse = eventdefinitionidentifier.getUse();
		e.setEvntDfnIdUse(eventdefinitionidentifieruse.toCode());

		/******************** EvntDfn_Copyright ********************************************************************************/
		if(eventdefinition.hasCopyright()) {
			e.setEvntDfnCopyright(String.valueOf(eventdefinition.getCopyright()));
		}
		/******************** eventdefinitiontopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitiontopic = eventdefinition.getTopicFirstRep();

		/******************** EvntDfn_Topic_Txt ********************************************************************************/
		if(eventdefinitiontopic.hasText()) {
			e.setEvntDfnTopicTxt(String.valueOf(eventdefinitiontopic.getText()));
		}
		/******************** eventdefinitiontopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitiontopiccoding = eventdefinitiontopic.getCodingFirstRep();

		/******************** EvntDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitiontopiccoding.hasVersion()) {
			e.setEvntDfnTopicCdgVrsn(String.valueOf(eventdefinitiontopiccoding.getVersion()));
		}
		/******************** EvntDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(eventdefinitiontopiccoding.hasDisplay()) {
			e.setEvntDfnTopicCdgDsply(String.valueOf(eventdefinitiontopiccoding.getDisplay()));
		}
		/******************** EvntDfn_Topic_Cdg_Cd ********************************************************************************/
		if(eventdefinitiontopiccoding.hasCode()) {
			e.setEvntDfnTopicCdgCd(String.valueOf(eventdefinitiontopiccoding.getCode()));
		}
		/******************** EvntDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitiontopiccoding.hasUserSelected()) {
			e.setEvntDfnTopicCdgUsrSltd(String.valueOf(eventdefinitiontopiccoding.getUserSelected()));
		}
		/******************** EvntDfn_Topic_Cdg_Sys ********************************************************************************/
		if(eventdefinitiontopiccoding.hasSystem()) {
			e.setEvntDfnTopicCdgSys(String.valueOf(eventdefinitiontopiccoding.getSystem()));
		}
		/******************** EvntDfn_LastReviewDt ********************************************************************************/
		if(eventdefinition.hasLastReviewDate()) {
			e.setEvntDfnLastReviewDt(String.valueOf(eventdefinition.getLastReviewDate()));
		}
		/******************** EvntDfn_ApprovalDt ********************************************************************************/
		if(eventdefinition.hasApprovalDate()) {
			e.setEvntDfnApprovalDt(String.valueOf(eventdefinition.getApprovalDate()));
		}
		/******************** eventdefinitioneditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail eventdefinitioneditor = eventdefinition.getEditorFirstRep();

		/******************** EvntDfn_Editor_Nm ********************************************************************************/
		if(eventdefinitioneditor.hasName()) {
			e.setEvntDfnEditorNm(String.valueOf(eventdefinitioneditor.getName()));
		}
		/******************** eventdefinitioneditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint eventdefinitioneditortelecom = eventdefinitioneditor.getTelecomFirstRep();

		/******************** EvntDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(eventdefinitioneditortelecom.hasValue()) {
			e.setEvntDfnEditorTlcmVl(String.valueOf(eventdefinitioneditortelecom.getValue()));
		}
		/******************** eventdefinitioneditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period eventdefinitioneditortelecomperiod = eventdefinitioneditortelecom.getPeriod();

		/******************** EvntDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(eventdefinitioneditortelecomperiod.hasStart()) {
			e.setEvntDfnEditorTlcmPrdStrt(String.valueOf(eventdefinitioneditortelecomperiod.getStart()));
		}
		/******************** EvntDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(eventdefinitioneditortelecomperiod.hasEnd()) {
			e.setEvntDfnEditorTlcmPrdEnd(String.valueOf(eventdefinitioneditortelecomperiod.getEnd()));
		}
		/******************** eventdefinitioneditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem eventdefinitioneditortelecomsystem = eventdefinitioneditortelecom.getSystem();
		e.setEvntDfnEditorTlcmSys(eventdefinitioneditortelecomsystem.toCode());

		/******************** eventdefinitioneditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse eventdefinitioneditortelecomuse = eventdefinitioneditortelecom.getUse();
		e.setEvntDfnEditorTlcmUse(eventdefinitioneditortelecomuse.toCode());

		/******************** EvntDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(eventdefinitioneditortelecom.hasRank()) {
			e.setEvntDfnEditorTlcmRnk(String.valueOf(eventdefinitioneditortelecom.getRank()));
		}
		/******************** EvntDfn_Usg ********************************************************************************/
		if(eventdefinition.hasUsage()) {
			e.setEvntDfnUsg(String.valueOf(eventdefinition.getUsage()));
		}
		/******************** eventdefinitionrelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact eventdefinitionrelatedartifact = eventdefinition.getRelatedArtifactFirstRep();

		/******************** EvntDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(eventdefinitionrelatedartifact.hasResource()) {
			e.setEvntDfnRltedArtfctRsrc(String.valueOf(eventdefinitionrelatedartifact.getResource()));
		}
		/******************** eventdefinitionrelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType eventdefinitionrelatedartifacttype = eventdefinitionrelatedartifact.getType();
		e.setEvntDfnRltedArtfctTyp(eventdefinitionrelatedartifacttype.toCode());

		/******************** eventdefinitionrelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment eventdefinitionrelatedartifactdocument = eventdefinitionrelatedartifact.getDocument();

		/******************** EvntDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(eventdefinitionrelatedartifactdocument.hasSize()) {
			e.setEvntDfnRltedArtfctDocSz(String.valueOf(eventdefinitionrelatedartifactdocument.getSize()));
		}
		/******************** EvntDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(eventdefinitionrelatedartifactdocument.hasLanguage()) {
			e.setEvntDfnRltedArtfctDocLnguage(String.valueOf(eventdefinitionrelatedartifactdocument.getLanguage()));
		}
		/******************** EvntDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(eventdefinitionrelatedartifactdocument.hasContentType()) {
			e.setEvntDfnRltedArtfctDocCntntTyp(String.valueOf(eventdefinitionrelatedartifactdocument.getContentType()));
		}
		/******************** EvntDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(eventdefinitionrelatedartifactdocument.hasTitle()) {
			e.setEvntDfnRltedArtfctDocTtl(String.valueOf(eventdefinitionrelatedartifactdocument.getTitle()));
		}
		/******************** EvntDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(eventdefinitionrelatedartifactdocument.hasUrl()) {
			e.setEvntDfnRltedArtfctDocUrl(String.valueOf(eventdefinitionrelatedartifactdocument.getUrl()));
		}
		/******************** EvntDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(eventdefinitionrelatedartifactdocument.hasData()) {
			e.setEvntDfnRltedArtfctDocData(String.valueOf(eventdefinitionrelatedartifactdocument.getData()));
		}

		/******************** EvntDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(eventdefinitionrelatedartifactdocument.hasHash()) {
			e.setEvntDfnRltedArtfctDocHash(String.valueOf(eventdefinitionrelatedartifactdocument.getHash()));
		}

		/******************** EvntDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(eventdefinitionrelatedartifactdocument.hasCreation()) {
			e.setEvntDfnRltedArtfctDocCreation(String.valueOf(eventdefinitionrelatedartifactdocument.getCreation()));
		}
		/******************** EvntDfn_RltedArtfct_Url ********************************************************************************/
		if(eventdefinitionrelatedartifact.hasUrl()) {
			e.setEvntDfnRltedArtfctUrl(String.valueOf(eventdefinitionrelatedartifact.getUrl()));
		}
		/******************** EvntDfn_RltedArtfct_Lbl ********************************************************************************/
		if(eventdefinitionrelatedartifact.hasLabel()) {
			e.setEvntDfnRltedArtfctLbl(String.valueOf(eventdefinitionrelatedartifact.getLabel()));
		}
		/******************** EvntDfn_RltedArtfct_Citation ********************************************************************************/
		if(eventdefinitionrelatedartifact.hasCitation()) {
			e.setEvntDfnRltedArtfctCitation(String.valueOf(eventdefinitionrelatedartifact.getCitation()));
		}
		/******************** eventdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext eventdefinitionusecontext = eventdefinition.getUseContextFirstRep();

		/******************** eventdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionusecontextcode = eventdefinitionusecontext.getCode();

		/******************** EvntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(eventdefinitionusecontextcode.hasVersion()) {
			e.setEvntDfnUseCntxtCdVrsn(String.valueOf(eventdefinitionusecontextcode.getVersion()));
		}
		/******************** EvntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(eventdefinitionusecontextcode.hasDisplay()) {
			e.setEvntDfnUseCntxtCdDsply(String.valueOf(eventdefinitionusecontextcode.getDisplay()));
		}
		/******************** EvntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(eventdefinitionusecontextcode.hasUserSelected()) {
			e.setEvntDfnUseCntxtCdUsrSltd(String.valueOf(eventdefinitionusecontextcode.getUserSelected()));
		}
		/******************** EvntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(eventdefinitionusecontextcode.hasSystem()) {
			e.setEvntDfnUseCntxtCdSys(String.valueOf(eventdefinitionusecontextcode.getSystem()));
		}
		/******************** eventdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionusecontextvaluecodeableconcept = eventdefinitionusecontext.getValueCodeableConcept();

		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconcept.hasText()) {
			e.setEvntDfnUseCntxtVlCdbleCncptTxt(String.valueOf(eventdefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** eventdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionusecontextvaluecodeableconceptcoding = eventdefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			e.setEvntDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			e.setEvntDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			e.setEvntDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			e.setEvntDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** EvntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(eventdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			e.setEvntDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(eventdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** eventdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitionusecontextvaluequantity = eventdefinitionusecontext.getValueQuantity();

		/******************** EvntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(eventdefinitionusecontextvaluequantity.hasValue()) {
			e.setEvntDfnUseCntxtVlQntyVl(String.valueOf(eventdefinitionusecontextvaluequantity.getValue()));
		}
		/******************** eventdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitionusecontextvaluequantitycomparator = eventdefinitionusecontextvaluequantity.getComparator();
		e.setEvntDfnUseCntxtVlQntyCmprtr(eventdefinitionusecontextvaluequantitycomparator.toCode());

		/******************** EvntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(eventdefinitionusecontextvaluequantity.hasCode()) {
			e.setEvntDfnUseCntxtVlQntyCd(String.valueOf(eventdefinitionusecontextvaluequantity.getCode()));
		}
		/******************** EvntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(eventdefinitionusecontextvaluequantity.hasUnit()) {
			e.setEvntDfnUseCntxtVlQntyUnt(String.valueOf(eventdefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** EvntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(eventdefinitionusecontextvaluequantity.hasSystem()) {
			e.setEvntDfnUseCntxtVlQntySys(String.valueOf(eventdefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** eventdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range eventdefinitionusecontextvaluerange = eventdefinitionusecontext.getValueRange();

		/******************** eventdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitionusecontextvaluerangelow = eventdefinitionusecontextvaluerange.getLow();

		/******************** EvntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(eventdefinitionusecontextvaluerangelow.hasValue()) {
			e.setEvntDfnUseCntxtVlRngLwVl(String.valueOf(eventdefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** eventdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitionusecontextvaluerangelowcomparator = eventdefinitionusecontextvaluerangelow.getComparator();
		e.setEvntDfnUseCntxtVlRngLwCmprtr(eventdefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** EvntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(eventdefinitionusecontextvaluerangelow.hasCode()) {
			e.setEvntDfnUseCntxtVlRngLwCd(String.valueOf(eventdefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** EvntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(eventdefinitionusecontextvaluerangelow.hasUnit()) {
			e.setEvntDfnUseCntxtVlRngLwUnt(String.valueOf(eventdefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** EvntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(eventdefinitionusecontextvaluerangelow.hasSystem()) {
			e.setEvntDfnUseCntxtVlRngLwSys(String.valueOf(eventdefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** eventdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity eventdefinitionusecontextvaluerangehigh = eventdefinitionusecontextvaluerange.getHigh();

		/******************** EvntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(eventdefinitionusecontextvaluerangehigh.hasValue()) {
			e.setEvntDfnUseCntxtVlRngHiVl(String.valueOf(eventdefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** eventdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator eventdefinitionusecontextvaluerangehighcomparator = eventdefinitionusecontextvaluerangehigh.getComparator();
		e.setEvntDfnUseCntxtVlRngHiCmprtr(eventdefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** EvntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(eventdefinitionusecontextvaluerangehigh.hasCode()) {
			e.setEvntDfnUseCntxtVlRngHiCd(String.valueOf(eventdefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** EvntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(eventdefinitionusecontextvaluerangehigh.hasUnit()) {
			e.setEvntDfnUseCntxtVlRngHiUnt(String.valueOf(eventdefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** EvntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(eventdefinitionusecontextvaluerangehigh.hasSystem()) {
			e.setEvntDfnUseCntxtVlRngHiSys(String.valueOf(eventdefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** EvntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(eventdefinitionusecontext.hasValueReference()) {
			e.setEvntDfnUseCntxtVlRfrnc(String.valueOf(eventdefinitionusecontext.getValueReference()));
		}
		/******************** eventdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept eventdefinitionjurisdiction = eventdefinition.getJurisdictionFirstRep();

		/******************** EvntDfn_Jrsdctn_Txt ********************************************************************************/
		if(eventdefinitionjurisdiction.hasText()) {
			e.setEvntDfnJrsdctnTxt(String.valueOf(eventdefinitionjurisdiction.getText()));
		}
		/******************** eventdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding eventdefinitionjurisdictioncoding = eventdefinitionjurisdiction.getCodingFirstRep();

		/******************** EvntDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(eventdefinitionjurisdictioncoding.hasVersion()) {
			e.setEvntDfnJrsdctnCdgVrsn(String.valueOf(eventdefinitionjurisdictioncoding.getVersion()));
		}
		/******************** EvntDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(eventdefinitionjurisdictioncoding.hasDisplay()) {
			e.setEvntDfnJrsdctnCdgDsply(String.valueOf(eventdefinitionjurisdictioncoding.getDisplay()));
		}
		/******************** EvntDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(eventdefinitionjurisdictioncoding.hasCode()) {
			e.setEvntDfnJrsdctnCdgCd(String.valueOf(eventdefinitionjurisdictioncoding.getCode()));
		}
		/******************** EvntDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(eventdefinitionjurisdictioncoding.hasUserSelected()) {
			e.setEvntDfnJrsdctnCdgUsrSltd(String.valueOf(eventdefinitionjurisdictioncoding.getUserSelected()));
		}
		/******************** EvntDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(eventdefinitionjurisdictioncoding.hasSystem()) {
			e.setEvntDfnJrsdctnCdgSys(String.valueOf(eventdefinitionjurisdictioncoding.getSystem()));
		}
		return e;
	}
}
