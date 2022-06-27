package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Measure;
public class MeasureBidirectionalConversion 
{
	public Measure Measures(org.hl7.fhir.r4.model.Measure measure) throws ParseException
	{
		 main.java.com.campfhir.model.Measure m = new  main.java.com.campfhir.model.Measure();

		/******************** id ********************************************************************************/
		measure.setId(m.getId());

		/******************** Msr_Nm ********************************************************************************/
		if(measure.hasName()) {
			m.setMsrNm(String.valueOf(measure.getName()));
		}
		/******************** Msr_Dt ********************************************************************************/
		if(measure.hasDate()) {
			m.setMsrDt(String.valueOf(measure.getDate()));
		}
		/******************** Msr_Vrsn ********************************************************************************/
		if(measure.hasVersion()) {
			m.setMsrVrsn(String.valueOf(measure.getVersion()));
		}
		/******************** measureimprovementnotation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measureimprovementnotation = measure.getImprovementNotation();

		/******************** Msr_ImprovementNotation_Txt ********************************************************************************/
		if(measureimprovementnotation.hasText()) {
			m.setMsrImprovementNotationTxt(String.valueOf(measureimprovementnotation.getText()));
		}
		/******************** measureimprovementnotationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measureimprovementnotationcoding = measureimprovementnotation.getCodingFirstRep();

		/******************** Msr_ImprovementNotation_Cdg_Vrsn ********************************************************************************/
		if(measureimprovementnotationcoding.hasVersion()) {
			m.setMsrImprovementNotationCdgVrsn(String.valueOf(measureimprovementnotationcoding.getVersion()));
		}
		/******************** Msr_ImprovementNotation_Cdg_Dsply ********************************************************************************/
		if(measureimprovementnotationcoding.hasDisplay()) {
			m.setMsrImprovementNotationCdgDsply(String.valueOf(measureimprovementnotationcoding.getDisplay()));
		}
		/******************** Msr_ImprovementNotation_Cdg_Cd ********************************************************************************/
		if(measureimprovementnotationcoding.hasCode()) {
			m.setMsrImprovementNotationCdgCd(String.valueOf(measureimprovementnotationcoding.getCode()));
		}
		/******************** Msr_ImprovementNotation_Cdg_UsrSltd ********************************************************************************/
		if(measureimprovementnotationcoding.hasUserSelected()) {
			m.setMsrImprovementNotationCdgUsrSltd(String.valueOf(measureimprovementnotationcoding.getUserSelected()));
		}
		/******************** Msr_ImprovementNotation_Cdg_Sys ********************************************************************************/
		if(measureimprovementnotationcoding.hasSystem()) {
			m.setMsrImprovementNotationCdgSys(String.valueOf(measureimprovementnotationcoding.getSystem()));
		}
		/******************** measurereviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measurereviewer = measure.getReviewerFirstRep();

		/******************** Msr_Rviewr_Nm ********************************************************************************/
		if(measurereviewer.hasName()) {
			m.setMsrRviewrNm(String.valueOf(measurereviewer.getName()));
		}
		/******************** measurereviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measurereviewertelecom = measurereviewer.getTelecomFirstRep();

		/******************** Msr_Rviewr_Tlcm_Vl ********************************************************************************/
		if(measurereviewertelecom.hasValue()) {
			m.setMsrRviewrTlcmVl(String.valueOf(measurereviewertelecom.getValue()));
		}
		/******************** measurereviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurereviewertelecomperiod = measurereviewertelecom.getPeriod();

		/******************** Msr_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(measurereviewertelecomperiod.hasStart()) {
			m.setMsrRviewrTlcmPrdStrt(String.valueOf(measurereviewertelecomperiod.getStart()));
		}
		/******************** Msr_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(measurereviewertelecomperiod.hasEnd()) {
			m.setMsrRviewrTlcmPrdEnd(String.valueOf(measurereviewertelecomperiod.getEnd()));
		}
		/******************** measurereviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measurereviewertelecomsystem = measurereviewertelecom.getSystem();
		m.setMsrRviewrTlcmSys(measurereviewertelecomsystem.toCode());

		/******************** measurereviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measurereviewertelecomuse = measurereviewertelecom.getUse();
		m.setMsrRviewrTlcmUse(measurereviewertelecomuse.toCode());

		/******************** Msr_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(measurereviewertelecom.hasRank()) {
			m.setMsrRviewrTlcmRnk(String.valueOf(measurereviewertelecom.getRank()));
		}
		/******************** measuresubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuresubjectcodeableconcept = measure.getSubjectCodeableConcept();

		/******************** Msr_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(measuresubjectcodeableconcept.hasText()) {
			m.setMsrSbjctCdbleCncptTxt(String.valueOf(measuresubjectcodeableconcept.getText()));
		}
		/******************** measuresubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuresubjectcodeableconceptcoding = measuresubjectcodeableconcept.getCodingFirstRep();

		/******************** Msr_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(measuresubjectcodeableconceptcoding.hasVersion()) {
			m.setMsrSbjctCdbleCncptCdgVrsn(String.valueOf(measuresubjectcodeableconceptcoding.getVersion()));
		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(measuresubjectcodeableconceptcoding.hasDisplay()) {
			m.setMsrSbjctCdbleCncptCdgDsply(String.valueOf(measuresubjectcodeableconceptcoding.getDisplay()));
		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(measuresubjectcodeableconceptcoding.hasCode()) {
			m.setMsrSbjctCdbleCncptCdgCd(String.valueOf(measuresubjectcodeableconceptcoding.getCode()));
		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(measuresubjectcodeableconceptcoding.hasUserSelected()) {
			m.setMsrSbjctCdbleCncptCdgUsrSltd(String.valueOf(measuresubjectcodeableconceptcoding.getUserSelected()));
		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(measuresubjectcodeableconceptcoding.hasSystem()) {
			m.setMsrSbjctCdbleCncptCdgSys(String.valueOf(measuresubjectcodeableconceptcoding.getSystem()));
		}
		/******************** Msr_SbjctRfrnc ********************************************************************************/
		if(measure.hasSubjectReference()) {
			m.setMsrSbjctRfrnc(String.valueOf(measure.getSubjectReference()));
		}
		/******************** measureendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measureendorser = measure.getEndorserFirstRep();

		/******************** Msr_Endsr_Nm ********************************************************************************/
		if(measureendorser.hasName()) {
			m.setMsrEndsrNm(String.valueOf(measureendorser.getName()));
		}
		/******************** measureendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measureendorsertelecom = measureendorser.getTelecomFirstRep();

		/******************** Msr_Endsr_Tlcm_Vl ********************************************************************************/
		if(measureendorsertelecom.hasValue()) {
			m.setMsrEndsrTlcmVl(String.valueOf(measureendorsertelecom.getValue()));
		}
		/******************** measureendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureendorsertelecomperiod = measureendorsertelecom.getPeriod();

		/******************** Msr_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(measureendorsertelecomperiod.hasStart()) {
			m.setMsrEndsrTlcmPrdStrt(String.valueOf(measureendorsertelecomperiod.getStart()));
		}
		/******************** Msr_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(measureendorsertelecomperiod.hasEnd()) {
			m.setMsrEndsrTlcmPrdEnd(String.valueOf(measureendorsertelecomperiod.getEnd()));
		}
		/******************** measureendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measureendorsertelecomsystem = measureendorsertelecom.getSystem();
		m.setMsrEndsrTlcmSys(measureendorsertelecomsystem.toCode());

		/******************** measureendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measureendorsertelecomuse = measureendorsertelecom.getUse();
		m.setMsrEndsrTlcmUse(measureendorsertelecomuse.toCode());

		/******************** Msr_Endsr_Tlcm_Rnk ********************************************************************************/
		if(measureendorsertelecom.hasRank()) {
			m.setMsrEndsrTlcmRnk(String.valueOf(measureendorsertelecom.getRank()));
		}
		/******************** Msr_Ttl ********************************************************************************/
		if(measure.hasTitle()) {
			m.setMsrTtl(String.valueOf(measure.getTitle()));
		}
		/******************** Msr_Subtitle ********************************************************************************/
		if(measure.hasSubtitle()) {
			m.setMsrSubtitle(String.valueOf(measure.getSubtitle()));
		}
		/******************** measuretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuretype = measure.getTypeFirstRep();

		/******************** Msr_Typ_Txt ********************************************************************************/
		if(measuretype.hasText()) {
			m.setMsrTypTxt(String.valueOf(measuretype.getText()));
		}
		/******************** measuretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuretypecoding = measuretype.getCodingFirstRep();

		/******************** Msr_Typ_Cdg_Vrsn ********************************************************************************/
		if(measuretypecoding.hasVersion()) {
			m.setMsrTypCdgVrsn(String.valueOf(measuretypecoding.getVersion()));
		}
		/******************** Msr_Typ_Cdg_Dsply ********************************************************************************/
		if(measuretypecoding.hasDisplay()) {
			m.setMsrTypCdgDsply(String.valueOf(measuretypecoding.getDisplay()));
		}
		/******************** Msr_Typ_Cdg_Cd ********************************************************************************/
		if(measuretypecoding.hasCode()) {
			m.setMsrTypCdgCd(String.valueOf(measuretypecoding.getCode()));
		}
		/******************** Msr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(measuretypecoding.hasUserSelected()) {
			m.setMsrTypCdgUsrSltd(String.valueOf(measuretypecoding.getUserSelected()));
		}
		/******************** Msr_Typ_Cdg_Sys ********************************************************************************/
		if(measuretypecoding.hasSystem()) {
			m.setMsrTypCdgSys(String.valueOf(measuretypecoding.getSystem()));
		}
		/******************** measurestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus measurestatus = measure.getStatus();
		m.setMsrSts(measurestatus.toCode());

		/******************** Msr_Dscrptn ********************************************************************************/
		if(measure.hasDescription()) {
			m.setMsrDscrptn(String.valueOf(measure.getDescription()));
		}
		/******************** Msr_Url ********************************************************************************/
		if(measure.hasUrl()) {
			m.setMsrUrl(String.valueOf(measure.getUrl()));
		}
		/******************** Msr_Disclaimer ********************************************************************************/
		if(measure.hasDisclaimer()) {
			m.setMsrDisclaimer(String.valueOf(measure.getDisclaimer()));
		}
		/******************** Msr_RskAdjustment ********************************************************************************/
		if(measure.hasRiskAdjustment()) {
			m.setMsrRskAdjustment(String.valueOf(measure.getRiskAdjustment()));
		}
		/******************** measurescoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurescoring = measure.getScoring();

		/******************** Msr_Scoring_Txt ********************************************************************************/
		if(measurescoring.hasText()) {
			m.setMsrScoringTxt(String.valueOf(measurescoring.getText()));
		}
		/******************** measurescoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurescoringcoding = measurescoring.getCodingFirstRep();

		/******************** Msr_Scoring_Cdg_Vrsn ********************************************************************************/
		if(measurescoringcoding.hasVersion()) {
			m.setMsrScoringCdgVrsn(String.valueOf(measurescoringcoding.getVersion()));
		}
		/******************** Msr_Scoring_Cdg_Dsply ********************************************************************************/
		if(measurescoringcoding.hasDisplay()) {
			m.setMsrScoringCdgDsply(String.valueOf(measurescoringcoding.getDisplay()));
		}
		/******************** Msr_Scoring_Cdg_Cd ********************************************************************************/
		if(measurescoringcoding.hasCode()) {
			m.setMsrScoringCdgCd(String.valueOf(measurescoringcoding.getCode()));
		}
		/******************** Msr_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(measurescoringcoding.hasUserSelected()) {
			m.setMsrScoringCdgUsrSltd(String.valueOf(measurescoringcoding.getUserSelected()));
		}
		/******************** Msr_Scoring_Cdg_Sys ********************************************************************************/
		if(measurescoringcoding.hasSystem()) {
			m.setMsrScoringCdgSys(String.valueOf(measurescoringcoding.getSystem()));
		}
		/******************** Msr_Guidnce ********************************************************************************/
		if(measure.hasGuidance()) {
			m.setMsrGuidnce(String.valueOf(measure.getGuidance()));
		}
		/******************** Msr_Rtionale ********************************************************************************/
		if(measure.hasRationale()) {
			m.setMsrRtionale(String.valueOf(measure.getRationale()));
		}
		/******************** Msr_RtAggregation ********************************************************************************/
		if(measure.hasRateAggregation()) {
			m.setMsrRtAggregation(String.valueOf(measure.getRateAggregation()));
		}
		/******************** Msr_Pblshr ********************************************************************************/
		if(measure.hasPublisher()) {
			m.setMsrPblshr(String.valueOf(measure.getPublisher()));
		}
		/******************** Msr_Exprmtl ********************************************************************************/
		if(measure.hasExperimental()) {
			m.setMsrExprmtl(String.valueOf(measure.getExperimental()));
		}
		/******************** measureeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureeffectiveperiod = measure.getEffectivePeriod();

		/******************** Msr_EfctivePrd_Strt ********************************************************************************/
		if(measureeffectiveperiod.hasStart()) {
			m.setMsrEfctivePrdStrt(String.valueOf(measureeffectiveperiod.getStart()));
		}
		/******************** Msr_EfctivePrd_End ********************************************************************************/
		if(measureeffectiveperiod.hasEnd()) {
			m.setMsrEfctivePrdEnd(String.valueOf(measureeffectiveperiod.getEnd()));
		}
		/******************** Msr_Prpse ********************************************************************************/
		if(measure.hasPurpose()) {
			m.setMsrPrpse(String.valueOf(measure.getPurpose()));
		}
		/******************** measureauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measureauthor = measure.getAuthorFirstRep();

		/******************** Msr_Athr_Nm ********************************************************************************/
		if(measureauthor.hasName()) {
			m.setMsrAthrNm(String.valueOf(measureauthor.getName()));
		}
		/******************** measureauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measureauthortelecom = measureauthor.getTelecomFirstRep();

		/******************** Msr_Athr_Tlcm_Vl ********************************************************************************/
		if(measureauthortelecom.hasValue()) {
			m.setMsrAthrTlcmVl(String.valueOf(measureauthortelecom.getValue()));
		}
		/******************** measureauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureauthortelecomperiod = measureauthortelecom.getPeriod();

		/******************** Msr_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(measureauthortelecomperiod.hasStart()) {
			m.setMsrAthrTlcmPrdStrt(String.valueOf(measureauthortelecomperiod.getStart()));
		}
		/******************** Msr_Athr_Tlcm_Prd_End ********************************************************************************/
		if(measureauthortelecomperiod.hasEnd()) {
			m.setMsrAthrTlcmPrdEnd(String.valueOf(measureauthortelecomperiod.getEnd()));
		}
		/******************** measureauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measureauthortelecomsystem = measureauthortelecom.getSystem();
		m.setMsrAthrTlcmSys(measureauthortelecomsystem.toCode());

		/******************** measureauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measureauthortelecomuse = measureauthortelecom.getUse();
		m.setMsrAthrTlcmUse(measureauthortelecomuse.toCode());

		/******************** Msr_Athr_Tlcm_Rnk ********************************************************************************/
		if(measureauthortelecom.hasRank()) {
			m.setMsrAthrTlcmRnk(String.valueOf(measureauthortelecom.getRank()));
		}
		/******************** measurecompositescoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurecompositescoring = measure.getCompositeScoring();

		/******************** Msr_CompositeScoring_Txt ********************************************************************************/
		if(measurecompositescoring.hasText()) {
			m.setMsrCompositeScoringTxt(String.valueOf(measurecompositescoring.getText()));
		}
		/******************** measurecompositescoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurecompositescoringcoding = measurecompositescoring.getCodingFirstRep();

		/******************** Msr_CompositeScoring_Cdg_Vrsn ********************************************************************************/
		if(measurecompositescoringcoding.hasVersion()) {
			m.setMsrCompositeScoringCdgVrsn(String.valueOf(measurecompositescoringcoding.getVersion()));
		}
		/******************** Msr_CompositeScoring_Cdg_Dsply ********************************************************************************/
		if(measurecompositescoringcoding.hasDisplay()) {
			m.setMsrCompositeScoringCdgDsply(String.valueOf(measurecompositescoringcoding.getDisplay()));
		}
		/******************** Msr_CompositeScoring_Cdg_Cd ********************************************************************************/
		if(measurecompositescoringcoding.hasCode()) {
			m.setMsrCompositeScoringCdgCd(String.valueOf(measurecompositescoringcoding.getCode()));
		}
		/******************** Msr_CompositeScoring_Cdg_UsrSltd ********************************************************************************/
		if(measurecompositescoringcoding.hasUserSelected()) {
			m.setMsrCompositeScoringCdgUsrSltd(String.valueOf(measurecompositescoringcoding.getUserSelected()));
		}
		/******************** Msr_CompositeScoring_Cdg_Sys ********************************************************************************/
		if(measurecompositescoringcoding.hasSystem()) {
			m.setMsrCompositeScoringCdgSys(String.valueOf(measurecompositescoringcoding.getSystem()));
		}
		/******************** measuresupplementaldata ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureSupplementalDataComponent measuresupplementaldata = measure.getSupplementalDataFirstRep();

		/******************** measuresupplementaldatacode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuresupplementaldatacode = measuresupplementaldata.getCode();

		/******************** Msr_SupplementalData_Cd_Txt ********************************************************************************/
		if(measuresupplementaldatacode.hasText()) {
			m.setMsrSupplementalDataCdTxt(String.valueOf(measuresupplementaldatacode.getText()));
		}
		/******************** measuresupplementaldatacodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuresupplementaldatacodecoding = measuresupplementaldatacode.getCodingFirstRep();

		/******************** Msr_SupplementalData_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuresupplementaldatacodecoding.hasVersion()) {
			m.setMsrSupplementalDataCdCdgVrsn(String.valueOf(measuresupplementaldatacodecoding.getVersion()));
		}
		/******************** Msr_SupplementalData_Cd_Cdg_Dsply ********************************************************************************/
		if(measuresupplementaldatacodecoding.hasDisplay()) {
			m.setMsrSupplementalDataCdCdgDsply(String.valueOf(measuresupplementaldatacodecoding.getDisplay()));
		}
		/******************** Msr_SupplementalData_Cd_Cdg_Cd ********************************************************************************/
		if(measuresupplementaldatacodecoding.hasCode()) {
			m.setMsrSupplementalDataCdCdgCd(String.valueOf(measuresupplementaldatacodecoding.getCode()));
		}
		/******************** Msr_SupplementalData_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuresupplementaldatacodecoding.hasUserSelected()) {
			m.setMsrSupplementalDataCdCdgUsrSltd(String.valueOf(measuresupplementaldatacodecoding.getUserSelected()));
		}
		/******************** Msr_SupplementalData_Cd_Cdg_Sys ********************************************************************************/
		if(measuresupplementaldatacodecoding.hasSystem()) {
			m.setMsrSupplementalDataCdCdgSys(String.valueOf(measuresupplementaldatacodecoding.getSystem()));
		}
		/******************** Msr_SupplementalData_Dscrptn ********************************************************************************/
		if(measuresupplementaldata.hasDescription()) {
			m.setMsrSupplementalDataDscrptn(String.valueOf(measuresupplementaldata.getDescription()));
		}
		/******************** measuresupplementaldatausage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuresupplementaldatausage = measuresupplementaldata.getUsageFirstRep();

		/******************** Msr_SupplementalData_Usg_Txt ********************************************************************************/
		if(measuresupplementaldatausage.hasText()) {
			m.setMsrSupplementalDataUsgTxt(String.valueOf(measuresupplementaldatausage.getText()));
		}
		/******************** measuresupplementaldatausagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuresupplementaldatausagecoding = measuresupplementaldatausage.getCodingFirstRep();

		/******************** Msr_SupplementalData_Usg_Cdg_Vrsn ********************************************************************************/
		if(measuresupplementaldatausagecoding.hasVersion()) {
			m.setMsrSupplementalDataUsgCdgVrsn(String.valueOf(measuresupplementaldatausagecoding.getVersion()));
		}
		/******************** Msr_SupplementalData_Usg_Cdg_Dsply ********************************************************************************/
		if(measuresupplementaldatausagecoding.hasDisplay()) {
			m.setMsrSupplementalDataUsgCdgDsply(String.valueOf(measuresupplementaldatausagecoding.getDisplay()));
		}
		/******************** Msr_SupplementalData_Usg_Cdg_Cd ********************************************************************************/
		if(measuresupplementaldatausagecoding.hasCode()) {
			m.setMsrSupplementalDataUsgCdgCd(String.valueOf(measuresupplementaldatausagecoding.getCode()));
		}
		/******************** Msr_SupplementalData_Usg_Cdg_UsrSltd ********************************************************************************/
		if(measuresupplementaldatausagecoding.hasUserSelected()) {
			m.setMsrSupplementalDataUsgCdgUsrSltd(String.valueOf(measuresupplementaldatausagecoding.getUserSelected()));
		}
		/******************** Msr_SupplementalData_Usg_Cdg_Sys ********************************************************************************/
		if(measuresupplementaldatausagecoding.hasSystem()) {
			m.setMsrSupplementalDataUsgCdgSys(String.valueOf(measuresupplementaldatausagecoding.getSystem()));
		}
		/******************** measuresupplementaldatacriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuresupplementaldatacriteria = measuresupplementaldata.getCriteria();

		/******************** Msr_SupplementalData_Criteria_Nm ********************************************************************************/
		if(measuresupplementaldatacriteria.hasName()) {
			m.setMsrSupplementalDataCriteriaNm(String.valueOf(measuresupplementaldatacriteria.getName()));
		}
		/******************** Msr_SupplementalData_Criteria_Rfrnc ********************************************************************************/
		if(measuresupplementaldatacriteria.hasReference()) {
			m.setMsrSupplementalDataCriteriaRfrnc(String.valueOf(measuresupplementaldatacriteria.getReference()));
		}
		/******************** Msr_SupplementalData_Criteria_Lnguage ********************************************************************************/
		if(measuresupplementaldatacriteria.hasLanguage()) {
			m.setMsrSupplementalDataCriteriaLnguage(String.valueOf(measuresupplementaldatacriteria.getLanguage()));
		}
		/******************** Msr_SupplementalData_Criteria_Dscrptn ********************************************************************************/
		if(measuresupplementaldatacriteria.hasDescription()) {
			m.setMsrSupplementalDataCriteriaDscrptn(String.valueOf(measuresupplementaldatacriteria.getDescription()));
		}
		/******************** Msr_SupplementalData_Criteria_Exprsn ********************************************************************************/
		if(measuresupplementaldatacriteria.hasExpression()) {
			m.setMsrSupplementalDataCriteriaExprsn(String.valueOf(measuresupplementaldatacriteria.getExpression()));
		}
		/******************** Msr_ClnclRecmndationStmnt ********************************************************************************/
		if(measure.hasClinicalRecommendationStatement()) {
			m.setMsrClnclRecmndationStmnt(String.valueOf(measure.getClinicalRecommendationStatement()));
		}
		/******************** measurecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measurecontact = measure.getContactFirstRep();

		/******************** Msr_Cntct_Nm ********************************************************************************/
		if(measurecontact.hasName()) {
			m.setMsrCntctNm(String.valueOf(measurecontact.getName()));
		}
		/******************** measurecontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measurecontacttelecom = measurecontact.getTelecomFirstRep();

		/******************** Msr_Cntct_Tlcm_Vl ********************************************************************************/
		if(measurecontacttelecom.hasValue()) {
			m.setMsrCntctTlcmVl(String.valueOf(measurecontacttelecom.getValue()));
		}
		/******************** measurecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurecontacttelecomperiod = measurecontacttelecom.getPeriod();

		/******************** Msr_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(measurecontacttelecomperiod.hasStart()) {
			m.setMsrCntctTlcmPrdStrt(String.valueOf(measurecontacttelecomperiod.getStart()));
		}
		/******************** Msr_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(measurecontacttelecomperiod.hasEnd()) {
			m.setMsrCntctTlcmPrdEnd(String.valueOf(measurecontacttelecomperiod.getEnd()));
		}
		/******************** measurecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measurecontacttelecomsystem = measurecontacttelecom.getSystem();
		m.setMsrCntctTlcmSys(measurecontacttelecomsystem.toCode());

		/******************** measurecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measurecontacttelecomuse = measurecontacttelecom.getUse();
		m.setMsrCntctTlcmUse(measurecontacttelecomuse.toCode());

		/******************** Msr_Cntct_Tlcm_Rnk ********************************************************************************/
		if(measurecontacttelecom.hasRank()) {
			m.setMsrCntctTlcmRnk(String.valueOf(measurecontacttelecom.getRank()));
		}
		/******************** measureidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier measureidentifier = measure.getIdentifierFirstRep();

		/******************** Msr_Id_Vl ********************************************************************************/
		if(measureidentifier.hasValue()) {
			m.setMsrIdVl(String.valueOf(measureidentifier.getValue()));
		}
		/******************** measureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measureidentifiertype = measureidentifier.getType();

		/******************** Msr_Id_Typ_Txt ********************************************************************************/
		if(measureidentifiertype.hasText()) {
			m.setMsrIdTypTxt(String.valueOf(measureidentifiertype.getText()));
		}
		/******************** measureidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measureidentifiertypecoding = measureidentifiertype.getCodingFirstRep();

		/******************** Msr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(measureidentifiertypecoding.hasVersion()) {
			m.setMsrIdTypCdgVrsn(String.valueOf(measureidentifiertypecoding.getVersion()));
		}
		/******************** Msr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(measureidentifiertypecoding.hasDisplay()) {
			m.setMsrIdTypCdgDsply(String.valueOf(measureidentifiertypecoding.getDisplay()));
		}
		/******************** Msr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(measureidentifiertypecoding.hasCode()) {
			m.setMsrIdTypCdgCd(String.valueOf(measureidentifiertypecoding.getCode()));
		}
		/******************** Msr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(measureidentifiertypecoding.hasUserSelected()) {
			m.setMsrIdTypCdgUsrSltd(String.valueOf(measureidentifiertypecoding.getUserSelected()));
		}
		/******************** Msr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(measureidentifiertypecoding.hasSystem()) {
			m.setMsrIdTypCdgSys(String.valueOf(measureidentifiertypecoding.getSystem()));
		}
		/******************** measureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureidentifierperiod = measureidentifier.getPeriod();

		/******************** Msr_Id_Prd_Strt ********************************************************************************/
		if(measureidentifierperiod.hasStart()) {
			m.setMsrIdPrdStrt(String.valueOf(measureidentifierperiod.getStart()));
		}
		/******************** Msr_Id_Prd_End ********************************************************************************/
		if(measureidentifierperiod.hasEnd()) {
			m.setMsrIdPrdEnd(String.valueOf(measureidentifierperiod.getEnd()));
		}
		/******************** Msr_Id_Assigner ********************************************************************************/
		if(measureidentifier.hasAssigner()) {
			m.setMsrIdAssigner(String.valueOf(measureidentifier.getAssigner()));
		}
		/******************** Msr_Id_Sys ********************************************************************************/
		if(measureidentifier.hasSystem()) {
			m.setMsrIdSys(String.valueOf(measureidentifier.getSystem()));
		}
		/******************** measureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse measureidentifieruse = measureidentifier.getUse();
		m.setMsrIdUse(measureidentifieruse.toCode());

		/******************** measuregroup ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureGroupComponent measuregroup = measure.getGroupFirstRep();

		/******************** measuregroupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregroupcode = measuregroup.getCode();

		/******************** Msr_Grp_Cd_Txt ********************************************************************************/
		if(measuregroupcode.hasText()) {
			m.setMsrGrpCdTxt(String.valueOf(measuregroupcode.getText()));
		}
		/******************** measuregroupcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuregroupcodecoding = measuregroupcode.getCodingFirstRep();

		/******************** Msr_Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuregroupcodecoding.hasVersion()) {
			m.setMsrGrpCdCdgVrsn(String.valueOf(measuregroupcodecoding.getVersion()));
		}
		/******************** Msr_Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(measuregroupcodecoding.hasDisplay()) {
			m.setMsrGrpCdCdgDsply(String.valueOf(measuregroupcodecoding.getDisplay()));
		}
		/******************** Msr_Grp_Cd_Cdg_Cd ********************************************************************************/
		if(measuregroupcodecoding.hasCode()) {
			m.setMsrGrpCdCdgCd(String.valueOf(measuregroupcodecoding.getCode()));
		}
		/******************** Msr_Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuregroupcodecoding.hasUserSelected()) {
			m.setMsrGrpCdCdgUsrSltd(String.valueOf(measuregroupcodecoding.getUserSelected()));
		}
		/******************** Msr_Grp_Cd_Cdg_Sys ********************************************************************************/
		if(measuregroupcodecoding.hasSystem()) {
			m.setMsrGrpCdCdgSys(String.valueOf(measuregroupcodecoding.getSystem()));
		}
		/******************** Msr_Grp_Dscrptn ********************************************************************************/
		if(measuregroup.hasDescription()) {
			m.setMsrGrpDscrptn(String.valueOf(measuregroup.getDescription()));
		}
		/******************** measuregroupstratifier ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponent measuregroupstratifier = measuregroup.getStratifierFirstRep();

		/******************** measuregroupstratifiercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregroupstratifiercode = measuregroupstratifier.getCode();

		/******************** Msr_Grp_Strtfier_Cd_Txt ********************************************************************************/
		if(measuregroupstratifiercode.hasText()) {
			m.setMsrGrpStrtfierCdTxt(String.valueOf(measuregroupstratifiercode.getText()));
		}
		/******************** measuregroupstratifiercodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuregroupstratifiercodecoding = measuregroupstratifiercode.getCodingFirstRep();

		/******************** Msr_Grp_Strtfier_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuregroupstratifiercodecoding.hasVersion()) {
			m.setMsrGrpStrtfierCdCdgVrsn(String.valueOf(measuregroupstratifiercodecoding.getVersion()));
		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Dsply ********************************************************************************/
		if(measuregroupstratifiercodecoding.hasDisplay()) {
			m.setMsrGrpStrtfierCdCdgDsply(String.valueOf(measuregroupstratifiercodecoding.getDisplay()));
		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Cd ********************************************************************************/
		if(measuregroupstratifiercodecoding.hasCode()) {
			m.setMsrGrpStrtfierCdCdgCd(String.valueOf(measuregroupstratifiercodecoding.getCode()));
		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuregroupstratifiercodecoding.hasUserSelected()) {
			m.setMsrGrpStrtfierCdCdgUsrSltd(String.valueOf(measuregroupstratifiercodecoding.getUserSelected()));
		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Sys ********************************************************************************/
		if(measuregroupstratifiercodecoding.hasSystem()) {
			m.setMsrGrpStrtfierCdCdgSys(String.valueOf(measuregroupstratifiercodecoding.getSystem()));
		}
		/******************** measuregroupstratifiercomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponentComponent measuregroupstratifiercomponent = measuregroupstratifier.getComponentFirstRep();

		/******************** measuregroupstratifiercomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregroupstratifiercomponentcode = measuregroupstratifiercomponent.getCode();

		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Txt ********************************************************************************/
		if(measuregroupstratifiercomponentcode.hasText()) {
			m.setMsrGrpStrtfierCmpntCdTxt(String.valueOf(measuregroupstratifiercomponentcode.getText()));
		}
		/******************** measuregroupstratifiercomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuregroupstratifiercomponentcodecoding = measuregroupstratifiercomponentcode.getCodingFirstRep();

		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuregroupstratifiercomponentcodecoding.hasVersion()) {
			m.setMsrGrpStrtfierCmpntCdCdgVrsn(String.valueOf(measuregroupstratifiercomponentcodecoding.getVersion()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(measuregroupstratifiercomponentcodecoding.hasDisplay()) {
			m.setMsrGrpStrtfierCmpntCdCdgDsply(String.valueOf(measuregroupstratifiercomponentcodecoding.getDisplay()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(measuregroupstratifiercomponentcodecoding.hasCode()) {
			m.setMsrGrpStrtfierCmpntCdCdgCd(String.valueOf(measuregroupstratifiercomponentcodecoding.getCode()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuregroupstratifiercomponentcodecoding.hasUserSelected()) {
			m.setMsrGrpStrtfierCmpntCdCdgUsrSltd(String.valueOf(measuregroupstratifiercomponentcodecoding.getUserSelected()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(measuregroupstratifiercomponentcodecoding.hasSystem()) {
			m.setMsrGrpStrtfierCmpntCdCdgSys(String.valueOf(measuregroupstratifiercomponentcodecoding.getSystem()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Dscrptn ********************************************************************************/
		if(measuregroupstratifiercomponent.hasDescription()) {
			m.setMsrGrpStrtfierCmpntDscrptn(String.valueOf(measuregroupstratifiercomponent.getDescription()));
		}
		/******************** measuregroupstratifiercomponentcriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuregroupstratifiercomponentcriteria = measuregroupstratifiercomponent.getCriteria();

		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Nm ********************************************************************************/
		if(measuregroupstratifiercomponentcriteria.hasName()) {
			m.setMsrGrpStrtfierCmpntCriteriaNm(String.valueOf(measuregroupstratifiercomponentcriteria.getName()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Rfrnc ********************************************************************************/
		if(measuregroupstratifiercomponentcriteria.hasReference()) {
			m.setMsrGrpStrtfierCmpntCriteriaRfrnc(String.valueOf(measuregroupstratifiercomponentcriteria.getReference()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Lnguage ********************************************************************************/
		if(measuregroupstratifiercomponentcriteria.hasLanguage()) {
			m.setMsrGrpStrtfierCmpntCriteriaLnguage(String.valueOf(measuregroupstratifiercomponentcriteria.getLanguage()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Dscrptn ********************************************************************************/
		if(measuregroupstratifiercomponentcriteria.hasDescription()) {
			m.setMsrGrpStrtfierCmpntCriteriaDscrptn(String.valueOf(measuregroupstratifiercomponentcriteria.getDescription()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Exprsn ********************************************************************************/
		if(measuregroupstratifiercomponentcriteria.hasExpression()) {
			m.setMsrGrpStrtfierCmpntCriteriaExprsn(String.valueOf(measuregroupstratifiercomponentcriteria.getExpression()));
		}
		/******************** Msr_Grp_Strtfier_Dscrptn ********************************************************************************/
		if(measuregroupstratifier.hasDescription()) {
			m.setMsrGrpStrtfierDscrptn(String.valueOf(measuregroupstratifier.getDescription()));
		}
		/******************** measuregroupstratifiercriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuregroupstratifiercriteria = measuregroupstratifier.getCriteria();

		/******************** Msr_Grp_Strtfier_Criteria_Nm ********************************************************************************/
		if(measuregroupstratifiercriteria.hasName()) {
			m.setMsrGrpStrtfierCriteriaNm(String.valueOf(measuregroupstratifiercriteria.getName()));
		}
		/******************** Msr_Grp_Strtfier_Criteria_Rfrnc ********************************************************************************/
		if(measuregroupstratifiercriteria.hasReference()) {
			m.setMsrGrpStrtfierCriteriaRfrnc(String.valueOf(measuregroupstratifiercriteria.getReference()));
		}
		/******************** Msr_Grp_Strtfier_Criteria_Lnguage ********************************************************************************/
		if(measuregroupstratifiercriteria.hasLanguage()) {
			m.setMsrGrpStrtfierCriteriaLnguage(String.valueOf(measuregroupstratifiercriteria.getLanguage()));
		}
		/******************** Msr_Grp_Strtfier_Criteria_Dscrptn ********************************************************************************/
		if(measuregroupstratifiercriteria.hasDescription()) {
			m.setMsrGrpStrtfierCriteriaDscrptn(String.valueOf(measuregroupstratifiercriteria.getDescription()));
		}
		/******************** Msr_Grp_Strtfier_Criteria_Exprsn ********************************************************************************/
		if(measuregroupstratifiercriteria.hasExpression()) {
			m.setMsrGrpStrtfierCriteriaExprsn(String.valueOf(measuregroupstratifiercriteria.getExpression()));
		}
		/******************** measuregrouppopulation ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureGroupPopulationComponent measuregrouppopulation = measuregroup.getPopulationFirstRep();

		/******************** measuregrouppopulationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregrouppopulationcode = measuregrouppopulation.getCode();

		/******************** Msr_Grp_Popln_Cd_Txt ********************************************************************************/
		if(measuregrouppopulationcode.hasText()) {
			m.setMsrGrpPoplnCdTxt(String.valueOf(measuregrouppopulationcode.getText()));
		}
		/******************** measuregrouppopulationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuregrouppopulationcodecoding = measuregrouppopulationcode.getCodingFirstRep();

		/******************** Msr_Grp_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(measuregrouppopulationcodecoding.hasVersion()) {
			m.setMsrGrpPoplnCdCdgVrsn(String.valueOf(measuregrouppopulationcodecoding.getVersion()));
		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(measuregrouppopulationcodecoding.hasDisplay()) {
			m.setMsrGrpPoplnCdCdgDsply(String.valueOf(measuregrouppopulationcodecoding.getDisplay()));
		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(measuregrouppopulationcodecoding.hasCode()) {
			m.setMsrGrpPoplnCdCdgCd(String.valueOf(measuregrouppopulationcodecoding.getCode()));
		}
		/******************** Msr_Grp_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measuregrouppopulationcodecoding.hasUserSelected()) {
			m.setMsrGrpPoplnCdCdgUsrSltd(String.valueOf(measuregrouppopulationcodecoding.getUserSelected()));
		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(measuregrouppopulationcodecoding.hasSystem()) {
			m.setMsrGrpPoplnCdCdgSys(String.valueOf(measuregrouppopulationcodecoding.getSystem()));
		}
		/******************** Msr_Grp_Popln_Dscrptn ********************************************************************************/
		if(measuregrouppopulation.hasDescription()) {
			m.setMsrGrpPoplnDscrptn(String.valueOf(measuregrouppopulation.getDescription()));
		}
		/******************** measuregrouppopulationcriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuregrouppopulationcriteria = measuregrouppopulation.getCriteria();

		/******************** Msr_Grp_Popln_Criteria_Nm ********************************************************************************/
		if(measuregrouppopulationcriteria.hasName()) {
			m.setMsrGrpPoplnCriteriaNm(String.valueOf(measuregrouppopulationcriteria.getName()));
		}
		/******************** Msr_Grp_Popln_Criteria_Rfrnc ********************************************************************************/
		if(measuregrouppopulationcriteria.hasReference()) {
			m.setMsrGrpPoplnCriteriaRfrnc(String.valueOf(measuregrouppopulationcriteria.getReference()));
		}
		/******************** Msr_Grp_Popln_Criteria_Lnguage ********************************************************************************/
		if(measuregrouppopulationcriteria.hasLanguage()) {
			m.setMsrGrpPoplnCriteriaLnguage(String.valueOf(measuregrouppopulationcriteria.getLanguage()));
		}
		/******************** Msr_Grp_Popln_Criteria_Dscrptn ********************************************************************************/
		if(measuregrouppopulationcriteria.hasDescription()) {
			m.setMsrGrpPoplnCriteriaDscrptn(String.valueOf(measuregrouppopulationcriteria.getDescription()));
		}
		/******************** Msr_Grp_Popln_Criteria_Exprsn ********************************************************************************/
		if(measuregrouppopulationcriteria.hasExpression()) {
			m.setMsrGrpPoplnCriteriaExprsn(String.valueOf(measuregrouppopulationcriteria.getExpression()));
		}
		/******************** Msr_Copyright ********************************************************************************/
		if(measure.hasCopyright()) {
			m.setMsrCopyright(String.valueOf(measure.getCopyright()));
		}
		/******************** measuretopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuretopic = measure.getTopicFirstRep();

		/******************** Msr_Topic_Txt ********************************************************************************/
		if(measuretopic.hasText()) {
			m.setMsrTopicTxt(String.valueOf(measuretopic.getText()));
		}
		/******************** measuretopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuretopiccoding = measuretopic.getCodingFirstRep();

		/******************** Msr_Topic_Cdg_Vrsn ********************************************************************************/
		if(measuretopiccoding.hasVersion()) {
			m.setMsrTopicCdgVrsn(String.valueOf(measuretopiccoding.getVersion()));
		}
		/******************** Msr_Topic_Cdg_Dsply ********************************************************************************/
		if(measuretopiccoding.hasDisplay()) {
			m.setMsrTopicCdgDsply(String.valueOf(measuretopiccoding.getDisplay()));
		}
		/******************** Msr_Topic_Cdg_Cd ********************************************************************************/
		if(measuretopiccoding.hasCode()) {
			m.setMsrTopicCdgCd(String.valueOf(measuretopiccoding.getCode()));
		}
		/******************** Msr_Topic_Cdg_UsrSltd ********************************************************************************/
		if(measuretopiccoding.hasUserSelected()) {
			m.setMsrTopicCdgUsrSltd(String.valueOf(measuretopiccoding.getUserSelected()));
		}
		/******************** Msr_Topic_Cdg_Sys ********************************************************************************/
		if(measuretopiccoding.hasSystem()) {
			m.setMsrTopicCdgSys(String.valueOf(measuretopiccoding.getSystem()));
		}
		/******************** Msr_LastReviewDt ********************************************************************************/
		if(measure.hasLastReviewDate()) {
			m.setMsrLastReviewDt(String.valueOf(measure.getLastReviewDate()));
		}
		/******************** Msr_ApprovalDt ********************************************************************************/
		if(measure.hasApprovalDate()) {
			m.setMsrApprovalDt(String.valueOf(measure.getApprovalDate()));
		}
		/******************** measureeditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measureeditor = measure.getEditorFirstRep();

		/******************** Msr_Editor_Nm ********************************************************************************/
		if(measureeditor.hasName()) {
			m.setMsrEditorNm(String.valueOf(measureeditor.getName()));
		}
		/******************** measureeditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measureeditortelecom = measureeditor.getTelecomFirstRep();

		/******************** Msr_Editor_Tlcm_Vl ********************************************************************************/
		if(measureeditortelecom.hasValue()) {
			m.setMsrEditorTlcmVl(String.valueOf(measureeditortelecom.getValue()));
		}
		/******************** measureeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureeditortelecomperiod = measureeditortelecom.getPeriod();

		/******************** Msr_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(measureeditortelecomperiod.hasStart()) {
			m.setMsrEditorTlcmPrdStrt(String.valueOf(measureeditortelecomperiod.getStart()));
		}
		/******************** Msr_Editor_Tlcm_Prd_End ********************************************************************************/
		if(measureeditortelecomperiod.hasEnd()) {
			m.setMsrEditorTlcmPrdEnd(String.valueOf(measureeditortelecomperiod.getEnd()));
		}
		/******************** measureeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem measureeditortelecomsystem = measureeditortelecom.getSystem();
		m.setMsrEditorTlcmSys(measureeditortelecomsystem.toCode());

		/******************** measureeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse measureeditortelecomuse = measureeditortelecom.getUse();
		m.setMsrEditorTlcmUse(measureeditortelecomuse.toCode());

		/******************** Msr_Editor_Tlcm_Rnk ********************************************************************************/
		if(measureeditortelecom.hasRank()) {
			m.setMsrEditorTlcmRnk(String.valueOf(measureeditortelecom.getRank()));
		}
		/******************** Msr_Usg ********************************************************************************/
		if(measure.hasUsage()) {
			m.setMsrUsg(String.valueOf(measure.getUsage()));
		}
		/******************** measurerelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact measurerelatedartifact = measure.getRelatedArtifactFirstRep();

		/******************** Msr_RltedArtfct_Rsrc ********************************************************************************/
		if(measurerelatedartifact.hasResource()) {
			m.setMsrRltedArtfctRsrc(String.valueOf(measurerelatedartifact.getResource()));
		}
		/******************** measurerelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactType measurerelatedartifacttype = measurerelatedartifact.getType();
		m.setMsrRltedArtfctTyp(measurerelatedartifacttype.toCode());

		/******************** measurerelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment measurerelatedartifactdocument = measurerelatedartifact.getDocument();

		/******************** Msr_RltedArtfct_Doc_Sz ********************************************************************************/
		if(measurerelatedartifactdocument.hasSize()) {
			m.setMsrRltedArtfctDocSz(String.valueOf(measurerelatedartifactdocument.getSize()));
		}
		/******************** Msr_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(measurerelatedartifactdocument.hasLanguage()) {
			m.setMsrRltedArtfctDocLnguage(String.valueOf(measurerelatedartifactdocument.getLanguage()));
		}
		/******************** Msr_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(measurerelatedartifactdocument.hasContentType()) {
			m.setMsrRltedArtfctDocCntntTyp(String.valueOf(measurerelatedartifactdocument.getContentType()));
		}
		/******************** Msr_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(measurerelatedartifactdocument.hasTitle()) {
			m.setMsrRltedArtfctDocTtl(String.valueOf(measurerelatedartifactdocument.getTitle()));
		}
		/******************** Msr_RltedArtfct_Doc_Url ********************************************************************************/
		if(measurerelatedartifactdocument.hasUrl()) {
			m.setMsrRltedArtfctDocUrl(String.valueOf(measurerelatedartifactdocument.getUrl()));
		}
		/******************** Msr_RltedArtfct_Doc_Data ********************************************************************************/
		if(measurerelatedartifactdocument.hasData()) {
			m.setMsrRltedArtfctDocData(String.valueOf(measurerelatedartifactdocument.getData()));
		}

		/******************** Msr_RltedArtfct_Doc_Hash ********************************************************************************/
		if(measurerelatedartifactdocument.hasHash()) {
			m.setMsrRltedArtfctDocHash(String.valueOf(measurerelatedartifactdocument.getHash()));
		}

		/******************** Msr_RltedArtfct_Doc_Creation ********************************************************************************/
		if(measurerelatedartifactdocument.hasCreation()) {
			m.setMsrRltedArtfctDocCreation(String.valueOf(measurerelatedartifactdocument.getCreation()));
		}
		/******************** Msr_RltedArtfct_Url ********************************************************************************/
		if(measurerelatedartifact.hasUrl()) {
			m.setMsrRltedArtfctUrl(String.valueOf(measurerelatedartifact.getUrl()));
		}
		/******************** Msr_RltedArtfct_Lbl ********************************************************************************/
		if(measurerelatedartifact.hasLabel()) {
			m.setMsrRltedArtfctLbl(String.valueOf(measurerelatedartifact.getLabel()));
		}
		/******************** Msr_RltedArtfct_Citation ********************************************************************************/
		if(measurerelatedartifact.hasCitation()) {
			m.setMsrRltedArtfctCitation(String.valueOf(measurerelatedartifact.getCitation()));
		}
		/******************** measureusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext measureusecontext = measure.getUseContextFirstRep();

		/******************** measureusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measureusecontextcode = measureusecontext.getCode();

		/******************** Msr_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(measureusecontextcode.hasVersion()) {
			m.setMsrUseCntxtCdVrsn(String.valueOf(measureusecontextcode.getVersion()));
		}
		/******************** Msr_UseCntxt_Cd_Dsply ********************************************************************************/
		if(measureusecontextcode.hasDisplay()) {
			m.setMsrUseCntxtCdDsply(String.valueOf(measureusecontextcode.getDisplay()));
		}
		/******************** Msr_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(measureusecontextcode.hasUserSelected()) {
			m.setMsrUseCntxtCdUsrSltd(String.valueOf(measureusecontextcode.getUserSelected()));
		}
		/******************** Msr_UseCntxt_Cd_Sys ********************************************************************************/
		if(measureusecontextcode.hasSystem()) {
			m.setMsrUseCntxtCdSys(String.valueOf(measureusecontextcode.getSystem()));
		}
		/******************** measureusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measureusecontextvaluecodeableconcept = measureusecontext.getValueCodeableConcept();

		/******************** Msr_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(measureusecontextvaluecodeableconcept.hasText()) {
			m.setMsrUseCntxtVlCdbleCncptTxt(String.valueOf(measureusecontextvaluecodeableconcept.getText()));
		}
		/******************** measureusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measureusecontextvaluecodeableconceptcoding = measureusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcoding.hasVersion()) {
			m.setMsrUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(measureusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcoding.hasDisplay()) {
			m.setMsrUseCntxtVlCdbleCncptCdgDsply(String.valueOf(measureusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcoding.hasCode()) {
			m.setMsrUseCntxtVlCdbleCncptCdgCd(String.valueOf(measureusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			m.setMsrUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(measureusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(measureusecontextvaluecodeableconceptcoding.hasSystem()) {
			m.setMsrUseCntxtVlCdbleCncptCdgSys(String.valueOf(measureusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** measureusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measureusecontextvaluequantity = measureusecontext.getValueQuantity();

		/******************** Msr_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(measureusecontextvaluequantity.hasValue()) {
			m.setMsrUseCntxtVlQntyVl(String.valueOf(measureusecontextvaluequantity.getValue()));
		}
		/******************** measureusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measureusecontextvaluequantitycomparator = measureusecontextvaluequantity.getComparator();
		m.setMsrUseCntxtVlQntyCmprtr(measureusecontextvaluequantitycomparator.toCode());

		/******************** Msr_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(measureusecontextvaluequantity.hasCode()) {
			m.setMsrUseCntxtVlQntyCd(String.valueOf(measureusecontextvaluequantity.getCode()));
		}
		/******************** Msr_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(measureusecontextvaluequantity.hasUnit()) {
			m.setMsrUseCntxtVlQntyUnt(String.valueOf(measureusecontextvaluequantity.getUnit()));
		}
		/******************** Msr_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(measureusecontextvaluequantity.hasSystem()) {
			m.setMsrUseCntxtVlQntySys(String.valueOf(measureusecontextvaluequantity.getSystem()));
		}
		/******************** measureusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range measureusecontextvaluerange = measureusecontext.getValueRange();

		/******************** measureusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measureusecontextvaluerangelow = measureusecontextvaluerange.getLow();

		/******************** Msr_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(measureusecontextvaluerangelow.hasValue()) {
			m.setMsrUseCntxtVlRngLwVl(String.valueOf(measureusecontextvaluerangelow.getValue()));
		}
		/******************** measureusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measureusecontextvaluerangelowcomparator = measureusecontextvaluerangelow.getComparator();
		m.setMsrUseCntxtVlRngLwCmprtr(measureusecontextvaluerangelowcomparator.toCode());

		/******************** Msr_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(measureusecontextvaluerangelow.hasCode()) {
			m.setMsrUseCntxtVlRngLwCd(String.valueOf(measureusecontextvaluerangelow.getCode()));
		}
		/******************** Msr_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(measureusecontextvaluerangelow.hasUnit()) {
			m.setMsrUseCntxtVlRngLwUnt(String.valueOf(measureusecontextvaluerangelow.getUnit()));
		}
		/******************** Msr_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(measureusecontextvaluerangelow.hasSystem()) {
			m.setMsrUseCntxtVlRngLwSys(String.valueOf(measureusecontextvaluerangelow.getSystem()));
		}
		/******************** measureusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measureusecontextvaluerangehigh = measureusecontextvaluerange.getHigh();

		/******************** Msr_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(measureusecontextvaluerangehigh.hasValue()) {
			m.setMsrUseCntxtVlRngHiVl(String.valueOf(measureusecontextvaluerangehigh.getValue()));
		}
		/******************** measureusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measureusecontextvaluerangehighcomparator = measureusecontextvaluerangehigh.getComparator();
		m.setMsrUseCntxtVlRngHiCmprtr(measureusecontextvaluerangehighcomparator.toCode());

		/******************** Msr_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(measureusecontextvaluerangehigh.hasCode()) {
			m.setMsrUseCntxtVlRngHiCd(String.valueOf(measureusecontextvaluerangehigh.getCode()));
		}
		/******************** Msr_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(measureusecontextvaluerangehigh.hasUnit()) {
			m.setMsrUseCntxtVlRngHiUnt(String.valueOf(measureusecontextvaluerangehigh.getUnit()));
		}
		/******************** Msr_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(measureusecontextvaluerangehigh.hasSystem()) {
			m.setMsrUseCntxtVlRngHiSys(String.valueOf(measureusecontextvaluerangehigh.getSystem()));
		}
		/******************** Msr_UseCntxt_VlRfrnc ********************************************************************************/
		if(measureusecontext.hasValueReference()) {
			m.setMsrUseCntxtVlRfrnc(String.valueOf(measureusecontext.getValueReference()));
		}
		/******************** measurejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurejurisdiction = measure.getJurisdictionFirstRep();

		/******************** Msr_Jrsdctn_Txt ********************************************************************************/
		if(measurejurisdiction.hasText()) {
			m.setMsrJrsdctnTxt(String.valueOf(measurejurisdiction.getText()));
		}
		/******************** measurejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurejurisdictioncoding = measurejurisdiction.getCodingFirstRep();

		/******************** Msr_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(measurejurisdictioncoding.hasVersion()) {
			m.setMsrJrsdctnCdgVrsn(String.valueOf(measurejurisdictioncoding.getVersion()));
		}
		/******************** Msr_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(measurejurisdictioncoding.hasDisplay()) {
			m.setMsrJrsdctnCdgDsply(String.valueOf(measurejurisdictioncoding.getDisplay()));
		}
		/******************** Msr_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(measurejurisdictioncoding.hasCode()) {
			m.setMsrJrsdctnCdgCd(String.valueOf(measurejurisdictioncoding.getCode()));
		}
		/******************** Msr_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(measurejurisdictioncoding.hasUserSelected()) {
			m.setMsrJrsdctnCdgUsrSltd(String.valueOf(measurejurisdictioncoding.getUserSelected()));
		}
		/******************** Msr_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(measurejurisdictioncoding.hasSystem()) {
			m.setMsrJrsdctnCdgSys(String.valueOf(measurejurisdictioncoding.getSystem()));
		}
		return m;
	}
}
