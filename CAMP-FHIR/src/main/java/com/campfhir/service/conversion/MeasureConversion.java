package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Measure;
public class MeasureConversion 
{
	public org.hl7.fhir.r4.model.Measure Measures(Measure m) throws ParseException
	{
		org.hl7.fhir.r4.model.Measure measure = new org.hl7.fhir.r4.model.Measure();

		/******************** id ********************************************************************************/
		measure.setId(m.getId());

		/******************** Msr_ApprovalDt ********************************************************************************/
		if(m.getMsrApprovalDt() != null) {
			java.text.SimpleDateFormat Msr_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_ApprovalDtdate = Msr_ApprovalDtsdf.parse(m.getMsrApprovalDt());
			measure.setApprovalDate(Msr_ApprovalDtdate);
		}
		/******************** measureauthor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measureauthor =  new org.hl7.fhir.r4.model.ContactDetail();
		measure.addAuthor(measureauthor);

		/******************** Msr_Athr_Nm ********************************************************************************/
		if(m.getMsrAthrNm() != null) {
			measureauthor.setName(m.getMsrAthrNm());
		}
		/******************** measureauthortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measureauthortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		measureauthor.addTelecom(measureauthortelecom);

		/******************** measureauthortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureauthortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		measureauthortelecom.setPeriod(measureauthortelecomperiod);

		/******************** Msr_Athr_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrAthrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Msr_Athr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Athr_Tlcm_Prd_Enddate = Msr_Athr_Tlcm_Prd_Endsdf.parse(m.getMsrAthrTlcmPrdEnd());
			measureauthortelecomperiod.setEnd(Msr_Athr_Tlcm_Prd_Enddate);
		}
		/******************** Msr_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrAthrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Msr_Athr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Athr_Tlcm_Prd_Strtdate = Msr_Athr_Tlcm_Prd_Strtsdf.parse(m.getMsrAthrTlcmPrdStrt());
			measureauthortelecomperiod.setStart(Msr_Athr_Tlcm_Prd_Strtdate);
		}
		/******************** Msr_Athr_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrAthrTlcmRnk() != null) {
			measureauthortelecom.setRank(Integer.parseInt(m.getMsrAthrTlcmRnk()));
		}
		/******************** measureauthortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory measureauthortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		measureauthortelecom.setSystem(measureauthortelecomsystem.fromCode(m.getMsrAthrTlcmSys()));

		/******************** measureauthortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory measureauthortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		measureauthortelecom.setUse(measureauthortelecomuse.fromCode(m.getMsrAthrTlcmUse()));

		/******************** Msr_Athr_Tlcm_Vl ********************************************************************************/
		if(m.getMsrAthrTlcmVl() != null) {
			measureauthortelecom.setValue(m.getMsrAthrTlcmVl());
		}
		/******************** Msr_ClnclRecmndationStmnt ********************************************************************************/
		if(m.getMsrClnclRecmndationStmnt() != null) {
			measure.setClinicalRecommendationStatement(m.getMsrClnclRecmndationStmnt());
		}
		/******************** measurecompositescoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurecompositescoring =  new org.hl7.fhir.r4.model.CodeableConcept();
		measure.setCompositeScoring(measurecompositescoring);

		/******************** measurecompositescoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurecompositescoringcoding =  new org.hl7.fhir.r4.model.Coding();
		measurecompositescoring.addCoding(measurecompositescoringcoding);

		/******************** Msr_CompositeScoring_Cdg_Cd ********************************************************************************/
		if(m.getMsrCompositeScoringCdgCd() != null) {
			measurecompositescoringcoding.setCode(m.getMsrCompositeScoringCdgCd());
		}
		/******************** Msr_CompositeScoring_Cdg_Dsply ********************************************************************************/
		if(m.getMsrCompositeScoringCdgDsply() != null) {
			measurecompositescoringcoding.setDisplay(m.getMsrCompositeScoringCdgDsply());
		}
		/******************** Msr_CompositeScoring_Cdg_Sys ********************************************************************************/
		if(m.getMsrCompositeScoringCdgSys() != null) {
			measurecompositescoringcoding.setSystem(m.getMsrCompositeScoringCdgSys());
		}
		/******************** Msr_CompositeScoring_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrCompositeScoringCdgUsrSltd() != null) {
			measurecompositescoringcoding.setUserSelected(Boolean.parseBoolean(m.getMsrCompositeScoringCdgUsrSltd()));
		}
		/******************** Msr_CompositeScoring_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrCompositeScoringCdgVrsn() != null) {
			measurecompositescoringcoding.setVersion(m.getMsrCompositeScoringCdgVrsn());
		}
		/******************** Msr_CompositeScoring_Txt ********************************************************************************/
		if(m.getMsrCompositeScoringTxt() != null) {
			measurecompositescoring.setText(m.getMsrCompositeScoringTxt());
		}
		/******************** measurecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measurecontact =  new org.hl7.fhir.r4.model.ContactDetail();
		measure.addContact(measurecontact);

		/******************** Msr_Cntct_Nm ********************************************************************************/
		if(m.getMsrCntctNm() != null) {
			measurecontact.setName(m.getMsrCntctNm());
		}
		/******************** measurecontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measurecontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		measurecontact.addTelecom(measurecontacttelecom);

		/******************** measurecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurecontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		measurecontacttelecom.setPeriod(measurecontacttelecomperiod);

		/******************** Msr_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Msr_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Cntct_Tlcm_Prd_Enddate = Msr_Cntct_Tlcm_Prd_Endsdf.parse(m.getMsrCntctTlcmPrdEnd());
			measurecontacttelecomperiod.setEnd(Msr_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** Msr_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Msr_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Cntct_Tlcm_Prd_Strtdate = Msr_Cntct_Tlcm_Prd_Strtsdf.parse(m.getMsrCntctTlcmPrdStrt());
			measurecontacttelecomperiod.setStart(Msr_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** Msr_Cntct_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrCntctTlcmRnk() != null) {
			measurecontacttelecom.setRank(Integer.parseInt(m.getMsrCntctTlcmRnk()));
		}
		/******************** measurecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory measurecontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		measurecontacttelecom.setSystem(measurecontacttelecomsystem.fromCode(m.getMsrCntctTlcmSys()));

		/******************** measurecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory measurecontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		measurecontacttelecom.setUse(measurecontacttelecomuse.fromCode(m.getMsrCntctTlcmUse()));

		/******************** Msr_Cntct_Tlcm_Vl ********************************************************************************/
		if(m.getMsrCntctTlcmVl() != null) {
			measurecontacttelecom.setValue(m.getMsrCntctTlcmVl());
		}
		/******************** Msr_Copyright ********************************************************************************/
		if(m.getMsrCopyright() != null) {
			measure.setCopyright(m.getMsrCopyright());
		}
		/******************** Msr_Dt ********************************************************************************/
		if(m.getMsrDt() != null) {
			java.text.SimpleDateFormat Msr_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Dtdate = Msr_Dtsdf.parse(m.getMsrDt());
			measure.setDate(Msr_Dtdate);
		}
		/******************** Msr_Dfn ********************************************************************************/
		if(m.getMsrDfn() != null) {
			measure.addDefinition(m.getMsrDfn());
		}
		/******************** Msr_Dscrptn ********************************************************************************/
		if(m.getMsrDscrptn() != null) {
			measure.setDescription(m.getMsrDscrptn());
		}
		/******************** Msr_Disclaimer ********************************************************************************/
		if(m.getMsrDisclaimer() != null) {
			measure.setDisclaimer(m.getMsrDisclaimer());
		}
		/******************** measureeditor ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measureeditor =  new org.hl7.fhir.r4.model.ContactDetail();
		measure.addEditor(measureeditor);

		/******************** Msr_Editor_Nm ********************************************************************************/
		if(m.getMsrEditorNm() != null) {
			measureeditor.setName(m.getMsrEditorNm());
		}
		/******************** measureeditortelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measureeditortelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		measureeditor.addTelecom(measureeditortelecom);

		/******************** measureeditortelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureeditortelecomperiod =  new org.hl7.fhir.r4.model.Period();
		measureeditortelecom.setPeriod(measureeditortelecomperiod);

		/******************** Msr_Editor_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrEditorTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Msr_Editor_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Editor_Tlcm_Prd_Enddate = Msr_Editor_Tlcm_Prd_Endsdf.parse(m.getMsrEditorTlcmPrdEnd());
			measureeditortelecomperiod.setEnd(Msr_Editor_Tlcm_Prd_Enddate);
		}
		/******************** Msr_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrEditorTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Msr_Editor_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Editor_Tlcm_Prd_Strtdate = Msr_Editor_Tlcm_Prd_Strtsdf.parse(m.getMsrEditorTlcmPrdStrt());
			measureeditortelecomperiod.setStart(Msr_Editor_Tlcm_Prd_Strtdate);
		}
		/******************** Msr_Editor_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrEditorTlcmRnk() != null) {
			measureeditortelecom.setRank(Integer.parseInt(m.getMsrEditorTlcmRnk()));
		}
		/******************** measureeditortelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory measureeditortelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		measureeditortelecom.setSystem(measureeditortelecomsystem.fromCode(m.getMsrEditorTlcmSys()));

		/******************** measureeditortelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory measureeditortelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		measureeditortelecom.setUse(measureeditortelecomuse.fromCode(m.getMsrEditorTlcmUse()));

		/******************** Msr_Editor_Tlcm_Vl ********************************************************************************/
		if(m.getMsrEditorTlcmVl() != null) {
			measureeditortelecom.setValue(m.getMsrEditorTlcmVl());
		}
		/******************** measureeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureeffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		measure.setEffectivePeriod(measureeffectiveperiod);

		/******************** Msr_EfctivePrd_End ********************************************************************************/
		if(m.getMsrEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat Msr_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_EfctivePrd_Enddate = Msr_EfctivePrd_Endsdf.parse(m.getMsrEfctivePrdEnd());
			measureeffectiveperiod.setEnd(Msr_EfctivePrd_Enddate);
		}
		/******************** Msr_EfctivePrd_Strt ********************************************************************************/
		if(m.getMsrEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat Msr_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_EfctivePrd_Strtdate = Msr_EfctivePrd_Strtsdf.parse(m.getMsrEfctivePrdStrt());
			measureeffectiveperiod.setStart(Msr_EfctivePrd_Strtdate);
		}
		/******************** measureendorser ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measureendorser =  new org.hl7.fhir.r4.model.ContactDetail();
		measure.addEndorser(measureendorser);

		/******************** Msr_Endsr_Nm ********************************************************************************/
		if(m.getMsrEndsrNm() != null) {
			measureendorser.setName(m.getMsrEndsrNm());
		}
		/******************** measureendorsertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measureendorsertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		measureendorser.addTelecom(measureendorsertelecom);

		/******************** measureendorsertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureendorsertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		measureendorsertelecom.setPeriod(measureendorsertelecomperiod);

		/******************** Msr_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrEndsrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Msr_Endsr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Endsr_Tlcm_Prd_Enddate = Msr_Endsr_Tlcm_Prd_Endsdf.parse(m.getMsrEndsrTlcmPrdEnd());
			measureendorsertelecomperiod.setEnd(Msr_Endsr_Tlcm_Prd_Enddate);
		}
		/******************** Msr_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrEndsrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Msr_Endsr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Endsr_Tlcm_Prd_Strtdate = Msr_Endsr_Tlcm_Prd_Strtsdf.parse(m.getMsrEndsrTlcmPrdStrt());
			measureendorsertelecomperiod.setStart(Msr_Endsr_Tlcm_Prd_Strtdate);
		}
		/******************** Msr_Endsr_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrEndsrTlcmRnk() != null) {
			measureendorsertelecom.setRank(Integer.parseInt(m.getMsrEndsrTlcmRnk()));
		}
		/******************** measureendorsertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory measureendorsertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		measureendorsertelecom.setSystem(measureendorsertelecomsystem.fromCode(m.getMsrEndsrTlcmSys()));

		/******************** measureendorsertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory measureendorsertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		measureendorsertelecom.setUse(measureendorsertelecomuse.fromCode(m.getMsrEndsrTlcmUse()));

		/******************** Msr_Endsr_Tlcm_Vl ********************************************************************************/
		if(m.getMsrEndsrTlcmVl() != null) {
			measureendorsertelecom.setValue(m.getMsrEndsrTlcmVl());
		}
		/******************** Msr_Exprmtl ********************************************************************************/
		if(m.getMsrExprmtl() != null) {
			measure.setExperimental(Boolean.parseBoolean(m.getMsrExprmtl()));
		}
		/******************** measuregroup ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureGroupComponent measuregroup =  new org.hl7.fhir.r4.model.Measure.MeasureGroupComponent();
		measure.addGroup(measuregroup);

		/******************** measuregroupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregroupcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measuregroup.setCode(measuregroupcode);

		/******************** measuregroupcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuregroupcodecoding =  new org.hl7.fhir.r4.model.Coding();
		measuregroupcode.addCoding(measuregroupcodecoding);

		/******************** Msr_Grp_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrGrpCdCdgCd() != null) {
			measuregroupcodecoding.setCode(m.getMsrGrpCdCdgCd());
		}
		/******************** Msr_Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrGrpCdCdgDsply() != null) {
			measuregroupcodecoding.setDisplay(m.getMsrGrpCdCdgDsply());
		}
		/******************** Msr_Grp_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrGrpCdCdgSys() != null) {
			measuregroupcodecoding.setSystem(m.getMsrGrpCdCdgSys());
		}
		/******************** Msr_Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrGrpCdCdgUsrSltd() != null) {
			measuregroupcodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrGrpCdCdgUsrSltd()));
		}
		/******************** Msr_Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrGrpCdCdgVrsn() != null) {
			measuregroupcodecoding.setVersion(m.getMsrGrpCdCdgVrsn());
		}
		/******************** Msr_Grp_Cd_Txt ********************************************************************************/
		if(m.getMsrGrpCdTxt() != null) {
			measuregroupcode.setText(m.getMsrGrpCdTxt());
		}
		/******************** Msr_Grp_Dscrptn ********************************************************************************/
		if(m.getMsrGrpDscrptn() != null) {
			measuregroup.setDescription(m.getMsrGrpDscrptn());
		}
		/******************** measuregrouppopulation ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureGroupPopulationComponent measuregrouppopulation =  new org.hl7.fhir.r4.model.Measure.MeasureGroupPopulationComponent();
		measuregroup.addPopulation(measuregrouppopulation);

		/******************** measuregrouppopulationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregrouppopulationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measuregrouppopulation.setCode(measuregrouppopulationcode);

		/******************** measuregrouppopulationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuregrouppopulationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		measuregrouppopulationcode.addCoding(measuregrouppopulationcodecoding);

		/******************** Msr_Grp_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgCd() != null) {
			measuregrouppopulationcodecoding.setCode(m.getMsrGrpPoplnCdCdgCd());
		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgDsply() != null) {
			measuregrouppopulationcodecoding.setDisplay(m.getMsrGrpPoplnCdCdgDsply());
		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgSys() != null) {
			measuregrouppopulationcodecoding.setSystem(m.getMsrGrpPoplnCdCdgSys());
		}
		/******************** Msr_Grp_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgUsrSltd() != null) {
			measuregrouppopulationcodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrGrpPoplnCdCdgUsrSltd()));
		}
		/******************** Msr_Grp_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrGrpPoplnCdCdgVrsn() != null) {
			measuregrouppopulationcodecoding.setVersion(m.getMsrGrpPoplnCdCdgVrsn());
		}
		/******************** Msr_Grp_Popln_Cd_Txt ********************************************************************************/
		if(m.getMsrGrpPoplnCdTxt() != null) {
			measuregrouppopulationcode.setText(m.getMsrGrpPoplnCdTxt());
		}
		/******************** measuregrouppopulationcriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuregrouppopulationcriteria =  new org.hl7.fhir.r4.model.Expression();
		measuregrouppopulation.setCriteria(measuregrouppopulationcriteria);

		/******************** Msr_Grp_Popln_Criteria_Dscrptn ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaDscrptn() != null) {
			measuregrouppopulationcriteria.setDescription(m.getMsrGrpPoplnCriteriaDscrptn());
		}
		/******************** Msr_Grp_Popln_Criteria_Exprsn ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaExprsn() != null) {
			measuregrouppopulationcriteria.setExpression(m.getMsrGrpPoplnCriteriaExprsn());
		}
		/******************** Msr_Grp_Popln_Criteria_Lnguage ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaLnguage() != null) {
			measuregrouppopulationcriteria.setLanguage(m.getMsrGrpPoplnCriteriaLnguage());
		}
		/******************** Msr_Grp_Popln_Criteria_Nm ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaNm() != null) {
			measuregrouppopulationcriteria.setName(m.getMsrGrpPoplnCriteriaNm());
		}
		/******************** Msr_Grp_Popln_Criteria_Rfrnc ********************************************************************************/
		if(m.getMsrGrpPoplnCriteriaRfrnc() != null) {
			measuregrouppopulationcriteria.setReference(m.getMsrGrpPoplnCriteriaRfrnc());
		}
		/******************** Msr_Grp_Popln_Dscrptn ********************************************************************************/
		if(m.getMsrGrpPoplnDscrptn() != null) {
			measuregrouppopulation.setDescription(m.getMsrGrpPoplnDscrptn());
		}
		/******************** measuregroupstratifier ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponent measuregroupstratifier =  new org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponent();
		measuregroup.addStratifier(measuregroupstratifier);

		/******************** measuregroupstratifiercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregroupstratifiercode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measuregroupstratifier.setCode(measuregroupstratifiercode);

		/******************** measuregroupstratifiercodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuregroupstratifiercodecoding =  new org.hl7.fhir.r4.model.Coding();
		measuregroupstratifiercode.addCoding(measuregroupstratifiercodecoding);

		/******************** Msr_Grp_Strtfier_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgCd() != null) {
			measuregroupstratifiercodecoding.setCode(m.getMsrGrpStrtfierCdCdgCd());
		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgDsply() != null) {
			measuregroupstratifiercodecoding.setDisplay(m.getMsrGrpStrtfierCdCdgDsply());
		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgSys() != null) {
			measuregroupstratifiercodecoding.setSystem(m.getMsrGrpStrtfierCdCdgSys());
		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgUsrSltd() != null) {
			measuregroupstratifiercodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrGrpStrtfierCdCdgUsrSltd()));
		}
		/******************** Msr_Grp_Strtfier_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrGrpStrtfierCdCdgVrsn() != null) {
			measuregroupstratifiercodecoding.setVersion(m.getMsrGrpStrtfierCdCdgVrsn());
		}
		/******************** Msr_Grp_Strtfier_Cd_Txt ********************************************************************************/
		if(m.getMsrGrpStrtfierCdTxt() != null) {
			measuregroupstratifiercode.setText(m.getMsrGrpStrtfierCdTxt());
		}
		/******************** measuregroupstratifiercomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponentComponent measuregroupstratifiercomponent =  new org.hl7.fhir.r4.model.Measure.MeasureGroupStratifierComponentComponent();
		measuregroupstratifier.addComponent(measuregroupstratifiercomponent);

		/******************** measuregroupstratifiercomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuregroupstratifiercomponentcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measuregroupstratifiercomponent.setCode(measuregroupstratifiercomponentcode);

		/******************** measuregroupstratifiercomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuregroupstratifiercomponentcodecoding =  new org.hl7.fhir.r4.model.Coding();
		measuregroupstratifiercomponentcode.addCoding(measuregroupstratifiercomponentcodecoding);

		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgCd() != null) {
			measuregroupstratifiercomponentcodecoding.setCode(m.getMsrGrpStrtfierCmpntCdCdgCd());
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgDsply() != null) {
			measuregroupstratifiercomponentcodecoding.setDisplay(m.getMsrGrpStrtfierCmpntCdCdgDsply());
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgSys() != null) {
			measuregroupstratifiercomponentcodecoding.setSystem(m.getMsrGrpStrtfierCmpntCdCdgSys());
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgUsrSltd() != null) {
			measuregroupstratifiercomponentcodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrGrpStrtfierCmpntCdCdgUsrSltd()));
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdCdgVrsn() != null) {
			measuregroupstratifiercomponentcodecoding.setVersion(m.getMsrGrpStrtfierCmpntCdCdgVrsn());
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Cd_Txt ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCdTxt() != null) {
			measuregroupstratifiercomponentcode.setText(m.getMsrGrpStrtfierCmpntCdTxt());
		}
		/******************** measuregroupstratifiercomponentcriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuregroupstratifiercomponentcriteria =  new org.hl7.fhir.r4.model.Expression();
		measuregroupstratifiercomponent.setCriteria(measuregroupstratifiercomponentcriteria);

		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Dscrptn ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaDscrptn() != null) {
			measuregroupstratifiercomponentcriteria.setDescription(m.getMsrGrpStrtfierCmpntCriteriaDscrptn());
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Exprsn ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaExprsn() != null) {
			measuregroupstratifiercomponentcriteria.setExpression(m.getMsrGrpStrtfierCmpntCriteriaExprsn());
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Lnguage ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaLnguage() != null) {
			measuregroupstratifiercomponentcriteria.setLanguage(m.getMsrGrpStrtfierCmpntCriteriaLnguage());
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Nm ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaNm() != null) {
			measuregroupstratifiercomponentcriteria.setName(m.getMsrGrpStrtfierCmpntCriteriaNm());
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Criteria_Rfrnc ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntCriteriaRfrnc() != null) {
			measuregroupstratifiercomponentcriteria.setReference(m.getMsrGrpStrtfierCmpntCriteriaRfrnc());
		}
		/******************** Msr_Grp_Strtfier_Cmpnt_Dscrptn ********************************************************************************/
		if(m.getMsrGrpStrtfierCmpntDscrptn() != null) {
			measuregroupstratifiercomponent.setDescription(m.getMsrGrpStrtfierCmpntDscrptn());
		}
		/******************** measuregroupstratifiercriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuregroupstratifiercriteria =  new org.hl7.fhir.r4.model.Expression();
		measuregroupstratifier.setCriteria(measuregroupstratifiercriteria);

		/******************** Msr_Grp_Strtfier_Criteria_Dscrptn ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaDscrptn() != null) {
			measuregroupstratifiercriteria.setDescription(m.getMsrGrpStrtfierCriteriaDscrptn());
		}
		/******************** Msr_Grp_Strtfier_Criteria_Exprsn ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaExprsn() != null) {
			measuregroupstratifiercriteria.setExpression(m.getMsrGrpStrtfierCriteriaExprsn());
		}
		/******************** Msr_Grp_Strtfier_Criteria_Lnguage ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaLnguage() != null) {
			measuregroupstratifiercriteria.setLanguage(m.getMsrGrpStrtfierCriteriaLnguage());
		}
		/******************** Msr_Grp_Strtfier_Criteria_Nm ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaNm() != null) {
			measuregroupstratifiercriteria.setName(m.getMsrGrpStrtfierCriteriaNm());
		}
		/******************** Msr_Grp_Strtfier_Criteria_Rfrnc ********************************************************************************/
		if(m.getMsrGrpStrtfierCriteriaRfrnc() != null) {
			measuregroupstratifiercriteria.setReference(m.getMsrGrpStrtfierCriteriaRfrnc());
		}
		/******************** Msr_Grp_Strtfier_Dscrptn ********************************************************************************/
		if(m.getMsrGrpStrtfierDscrptn() != null) {
			measuregroupstratifier.setDescription(m.getMsrGrpStrtfierDscrptn());
		}
		/******************** Msr_Guidnce ********************************************************************************/
		if(m.getMsrGuidnce() != null) {
			measure.setGuidance(m.getMsrGuidnce());
		}
		/******************** measureidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier measureidentifier =  new org.hl7.fhir.r4.model.Identifier();
		measure.addIdentifier(measureidentifier);

		/******************** Msr_Id_Assigner ********************************************************************************/
		if(m.getMsrIdAssigner() != null) {
			measureidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMsrIdAssigner()));
		}
		/******************** measureidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measureidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		measureidentifier.setPeriod(measureidentifierperiod);

		/******************** Msr_Id_Prd_End ********************************************************************************/
		if(m.getMsrIdPrdEnd() != null) {
			java.text.SimpleDateFormat Msr_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Id_Prd_Enddate = Msr_Id_Prd_Endsdf.parse(m.getMsrIdPrdEnd());
			measureidentifierperiod.setEnd(Msr_Id_Prd_Enddate);
		}
		/******************** Msr_Id_Prd_Strt ********************************************************************************/
		if(m.getMsrIdPrdStrt() != null) {
			java.text.SimpleDateFormat Msr_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Id_Prd_Strtdate = Msr_Id_Prd_Strtsdf.parse(m.getMsrIdPrdStrt());
			measureidentifierperiod.setStart(Msr_Id_Prd_Strtdate);
		}
		/******************** Msr_Id_Sys ********************************************************************************/
		if(m.getMsrIdSys() != null) {
			measureidentifier.setSystem(m.getMsrIdSys());
		}
		/******************** measureidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measureidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		measureidentifier.setType(measureidentifiertype);

		/******************** measureidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measureidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		measureidentifiertype.addCoding(measureidentifiertypecoding);

		/******************** Msr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMsrIdTypCdgCd() != null) {
			measureidentifiertypecoding.setCode(m.getMsrIdTypCdgCd());
		}
		/******************** Msr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMsrIdTypCdgDsply() != null) {
			measureidentifiertypecoding.setDisplay(m.getMsrIdTypCdgDsply());
		}
		/******************** Msr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMsrIdTypCdgSys() != null) {
			measureidentifiertypecoding.setSystem(m.getMsrIdTypCdgSys());
		}
		/******************** Msr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrIdTypCdgUsrSltd() != null) {
			measureidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMsrIdTypCdgUsrSltd()));
		}
		/******************** Msr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrIdTypCdgVrsn() != null) {
			measureidentifiertypecoding.setVersion(m.getMsrIdTypCdgVrsn());
		}
		/******************** Msr_Id_Typ_Txt ********************************************************************************/
		if(m.getMsrIdTypTxt() != null) {
			measureidentifiertype.setText(m.getMsrIdTypTxt());
		}
		/******************** measureidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory measureidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		measureidentifier.setUse(measureidentifieruse.fromCode(m.getMsrIdUse()));

		/******************** Msr_Id_Vl ********************************************************************************/
		if(m.getMsrIdVl() != null) {
			measureidentifier.setValue(m.getMsrIdVl());
		}
		/******************** measureimprovementnotation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measureimprovementnotation =  new org.hl7.fhir.r4.model.CodeableConcept();
		measure.setImprovementNotation(measureimprovementnotation);

		/******************** measureimprovementnotationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measureimprovementnotationcoding =  new org.hl7.fhir.r4.model.Coding();
		measureimprovementnotation.addCoding(measureimprovementnotationcoding);

		/******************** Msr_ImprovementNotation_Cdg_Cd ********************************************************************************/
		if(m.getMsrImprovementNotationCdgCd() != null) {
			measureimprovementnotationcoding.setCode(m.getMsrImprovementNotationCdgCd());
		}
		/******************** Msr_ImprovementNotation_Cdg_Dsply ********************************************************************************/
		if(m.getMsrImprovementNotationCdgDsply() != null) {
			measureimprovementnotationcoding.setDisplay(m.getMsrImprovementNotationCdgDsply());
		}
		/******************** Msr_ImprovementNotation_Cdg_Sys ********************************************************************************/
		if(m.getMsrImprovementNotationCdgSys() != null) {
			measureimprovementnotationcoding.setSystem(m.getMsrImprovementNotationCdgSys());
		}
		/******************** Msr_ImprovementNotation_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrImprovementNotationCdgUsrSltd() != null) {
			measureimprovementnotationcoding.setUserSelected(Boolean.parseBoolean(m.getMsrImprovementNotationCdgUsrSltd()));
		}
		/******************** Msr_ImprovementNotation_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrImprovementNotationCdgVrsn() != null) {
			measureimprovementnotationcoding.setVersion(m.getMsrImprovementNotationCdgVrsn());
		}
		/******************** Msr_ImprovementNotation_Txt ********************************************************************************/
		if(m.getMsrImprovementNotationTxt() != null) {
			measureimprovementnotation.setText(m.getMsrImprovementNotationTxt());
		}
		/******************** measurejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurejurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		measure.addJurisdiction(measurejurisdiction);

		/******************** measurejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurejurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		measurejurisdiction.addCoding(measurejurisdictioncoding);

		/******************** Msr_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMsrJrsdctnCdgCd() != null) {
			measurejurisdictioncoding.setCode(m.getMsrJrsdctnCdgCd());
		}
		/******************** Msr_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMsrJrsdctnCdgDsply() != null) {
			measurejurisdictioncoding.setDisplay(m.getMsrJrsdctnCdgDsply());
		}
		/******************** Msr_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMsrJrsdctnCdgSys() != null) {
			measurejurisdictioncoding.setSystem(m.getMsrJrsdctnCdgSys());
		}
		/******************** Msr_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrJrsdctnCdgUsrSltd() != null) {
			measurejurisdictioncoding.setUserSelected(Boolean.parseBoolean(m.getMsrJrsdctnCdgUsrSltd()));
		}
		/******************** Msr_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrJrsdctnCdgVrsn() != null) {
			measurejurisdictioncoding.setVersion(m.getMsrJrsdctnCdgVrsn());
		}
		/******************** Msr_Jrsdctn_Txt ********************************************************************************/
		if(m.getMsrJrsdctnTxt() != null) {
			measurejurisdiction.setText(m.getMsrJrsdctnTxt());
		}
		/******************** Msr_LastReviewDt ********************************************************************************/
		if(m.getMsrLastReviewDt() != null) {
			java.text.SimpleDateFormat Msr_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_LastReviewDtdate = Msr_LastReviewDtsdf.parse(m.getMsrLastReviewDt());
			measure.setLastReviewDate(Msr_LastReviewDtdate);
		}
		/******************** Msr_Library ********************************************************************************/
		if(m.getMsrLibrary() != null) {
			measure.addLibrary(m.getMsrLibrary());
		}
		/******************** Msr_Nm ********************************************************************************/
		if(m.getMsrNm() != null) {
			measure.setName(m.getMsrNm());
		}
		/******************** Msr_Pblshr ********************************************************************************/
		if(m.getMsrPblshr() != null) {
			measure.setPublisher(m.getMsrPblshr());
		}
		/******************** Msr_Prpse ********************************************************************************/
		if(m.getMsrPrpse() != null) {
			measure.setPurpose(m.getMsrPrpse());
		}
		/******************** Msr_RtAggregation ********************************************************************************/
		if(m.getMsrRtAggregation() != null) {
			measure.setRateAggregation(m.getMsrRtAggregation());
		}
		/******************** Msr_Rtionale ********************************************************************************/
		if(m.getMsrRtionale() != null) {
			measure.setRationale(m.getMsrRtionale());
		}
		/******************** measurerelatedartifact ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact measurerelatedartifact =  new org.hl7.fhir.r4.model.RelatedArtifact();
		measure.addRelatedArtifact(measurerelatedartifact);

		/******************** Msr_RltedArtfct_Citation ********************************************************************************/
		if(m.getMsrRltedArtfctCitation() != null) {
			measurerelatedartifact.setCitation(m.getMsrRltedArtfctCitation());
		}
		/******************** Msr_RltedArtfct_Dsply ********************************************************************************/
		if(m.getMsrRltedArtfctDsply() != null) {
			measurerelatedartifact.setDisplay(m.getMsrRltedArtfctDsply());
		}
		/******************** measurerelatedartifactdocument ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment measurerelatedartifactdocument =  new org.hl7.fhir.r4.model.Attachment();
		measurerelatedartifact.setDocument(measurerelatedartifactdocument);

		/******************** Msr_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(m.getMsrRltedArtfctDocCntntTyp() != null) {
			measurerelatedartifactdocument.setContentType(m.getMsrRltedArtfctDocCntntTyp());
		}
		/******************** Msr_RltedArtfct_Doc_Creation ********************************************************************************/
		if(m.getMsrRltedArtfctDocCreation() != null) {
			java.text.SimpleDateFormat Msr_RltedArtfct_Doc_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_RltedArtfct_Doc_Creationdate = Msr_RltedArtfct_Doc_Creationsdf.parse(m.getMsrRltedArtfctDocCreation());
			measurerelatedartifactdocument.setCreation(Msr_RltedArtfct_Doc_Creationdate);
		}
		/******************** Msr_RltedArtfct_Doc_Data ********************************************************************************/
		if(m.getMsrRltedArtfctDocData() != null) {
			measurerelatedartifactdocument.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(m.getMsrRltedArtfctDocData()));
		}
		/******************** Msr_RltedArtfct_Doc_Hash ********************************************************************************/
		if(m.getMsrRltedArtfctDocHash() != null) {
			measurerelatedartifactdocument.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(m.getMsrRltedArtfctDocHash()));
		}
		/******************** Msr_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(m.getMsrRltedArtfctDocLnguage() != null) {
			measurerelatedartifactdocument.setLanguage(m.getMsrRltedArtfctDocLnguage());
		}
		/******************** Msr_RltedArtfct_Doc_Sz ********************************************************************************/
		if(m.getMsrRltedArtfctDocSz() != null) {
			measurerelatedartifactdocument.setSize(Integer.parseInt(m.getMsrRltedArtfctDocSz()));
		}
		/******************** Msr_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(m.getMsrRltedArtfctDocTtl() != null) {
			measurerelatedartifactdocument.setTitle(m.getMsrRltedArtfctDocTtl());
		}
		/******************** Msr_RltedArtfct_Doc_Url ********************************************************************************/
		if(m.getMsrRltedArtfctDocUrl() != null) {
			measurerelatedartifactdocument.setUrl(m.getMsrRltedArtfctDocUrl());
		}
		/******************** Msr_RltedArtfct_Lbl ********************************************************************************/
		if(m.getMsrRltedArtfctLbl() != null) {
			measurerelatedartifact.setLabel(m.getMsrRltedArtfctLbl());
		}
		/******************** Msr_RltedArtfct_Rsrc ********************************************************************************/
		if(m.getMsrRltedArtfctRsrc() != null) {
			measurerelatedartifact.setResource(m.getMsrRltedArtfctRsrc());
		}
		/******************** measurerelatedartifacttype ********************************************************************************/
		org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory measurerelatedartifacttype =  new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory();
		measurerelatedartifact.setType(measurerelatedartifacttype.fromCode(m.getMsrRltedArtfctTyp()));

		/******************** Msr_RltedArtfct_Url ********************************************************************************/
		if(m.getMsrRltedArtfctUrl() != null) {
			measurerelatedartifact.setUrl(m.getMsrRltedArtfctUrl());
		}
		/******************** measurereviewer ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail measurereviewer =  new org.hl7.fhir.r4.model.ContactDetail();
		measure.addReviewer(measurereviewer);

		/******************** Msr_Rviewr_Nm ********************************************************************************/
		if(m.getMsrRviewrNm() != null) {
			measurereviewer.setName(m.getMsrRviewrNm());
		}
		/******************** measurereviewertelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint measurereviewertelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		measurereviewer.addTelecom(measurereviewertelecom);

		/******************** measurereviewertelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurereviewertelecomperiod =  new org.hl7.fhir.r4.model.Period();
		measurereviewertelecom.setPeriod(measurereviewertelecomperiod);

		/******************** Msr_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsrRviewrTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Msr_Rviewr_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Rviewr_Tlcm_Prd_Enddate = Msr_Rviewr_Tlcm_Prd_Endsdf.parse(m.getMsrRviewrTlcmPrdEnd());
			measurereviewertelecomperiod.setEnd(Msr_Rviewr_Tlcm_Prd_Enddate);
		}
		/******************** Msr_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsrRviewrTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Msr_Rviewr_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Msr_Rviewr_Tlcm_Prd_Strtdate = Msr_Rviewr_Tlcm_Prd_Strtsdf.parse(m.getMsrRviewrTlcmPrdStrt());
			measurereviewertelecomperiod.setStart(Msr_Rviewr_Tlcm_Prd_Strtdate);
		}
		/******************** Msr_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(m.getMsrRviewrTlcmRnk() != null) {
			measurereviewertelecom.setRank(Integer.parseInt(m.getMsrRviewrTlcmRnk()));
		}
		/******************** measurereviewertelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory measurereviewertelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		measurereviewertelecom.setSystem(measurereviewertelecomsystem.fromCode(m.getMsrRviewrTlcmSys()));

		/******************** measurereviewertelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory measurereviewertelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		measurereviewertelecom.setUse(measurereviewertelecomuse.fromCode(m.getMsrRviewrTlcmUse()));

		/******************** Msr_Rviewr_Tlcm_Vl ********************************************************************************/
		if(m.getMsrRviewrTlcmVl() != null) {
			measurereviewertelecom.setValue(m.getMsrRviewrTlcmVl());
		}
		/******************** Msr_RskAdjustment ********************************************************************************/
		if(m.getMsrRskAdjustment() != null) {
			measure.setRiskAdjustment(m.getMsrRskAdjustment());
		}
		/******************** measurescoring ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurescoring =  new org.hl7.fhir.r4.model.CodeableConcept();
		measure.setScoring(measurescoring);

		/******************** measurescoringcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurescoringcoding =  new org.hl7.fhir.r4.model.Coding();
		measurescoring.addCoding(measurescoringcoding);

		/******************** Msr_Scoring_Cdg_Cd ********************************************************************************/
		if(m.getMsrScoringCdgCd() != null) {
			measurescoringcoding.setCode(m.getMsrScoringCdgCd());
		}
		/******************** Msr_Scoring_Cdg_Dsply ********************************************************************************/
		if(m.getMsrScoringCdgDsply() != null) {
			measurescoringcoding.setDisplay(m.getMsrScoringCdgDsply());
		}
		/******************** Msr_Scoring_Cdg_Sys ********************************************************************************/
		if(m.getMsrScoringCdgSys() != null) {
			measurescoringcoding.setSystem(m.getMsrScoringCdgSys());
		}
		/******************** Msr_Scoring_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrScoringCdgUsrSltd() != null) {
			measurescoringcoding.setUserSelected(Boolean.parseBoolean(m.getMsrScoringCdgUsrSltd()));
		}
		/******************** Msr_Scoring_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrScoringCdgVrsn() != null) {
			measurescoringcoding.setVersion(m.getMsrScoringCdgVrsn());
		}
		/******************** Msr_Scoring_Txt ********************************************************************************/
		if(m.getMsrScoringTxt() != null) {
			measurescoring.setText(m.getMsrScoringTxt());
		}
		/******************** measurestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory measurestatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		measure.setStatus(measurestatus.fromCode(m.getMsrSts()));

		/******************** measuresubjectcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuresubjectcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		measure.setSubject(measuresubjectcodeableconcept);

		/******************** measuresubjectcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuresubjectcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		measuresubjectcodeableconcept.addCoding(measuresubjectcodeableconceptcoding);

		/******************** Msr_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgCd() != null) {
			measuresubjectcodeableconceptcoding.setCode(m.getMsrSbjctCdbleCncptCdgCd());
		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgDsply() != null) {
			measuresubjectcodeableconceptcoding.setDisplay(m.getMsrSbjctCdbleCncptCdgDsply());
		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgSys() != null) {
			measuresubjectcodeableconceptcoding.setSystem(m.getMsrSbjctCdbleCncptCdgSys());
		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgUsrSltd() != null) {
			measuresubjectcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMsrSbjctCdbleCncptCdgUsrSltd()));
		}
		/******************** Msr_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptCdgVrsn() != null) {
			measuresubjectcodeableconceptcoding.setVersion(m.getMsrSbjctCdbleCncptCdgVrsn());
		}
		/******************** Msr_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(m.getMsrSbjctCdbleCncptTxt() != null) {
			measuresubjectcodeableconcept.setText(m.getMsrSbjctCdbleCncptTxt());
		}
		/******************** Msr_SbjctRfrnc ********************************************************************************/
		if(m.getMsrSbjctRfrnc() != null) {
			measure.setSubject( new org.hl7.fhir.r4.model.Reference(m.getMsrSbjctRfrnc()));
		}
		/******************** Msr_Subtitle ********************************************************************************/
		if(m.getMsrSubtitle() != null) {
			measure.setSubtitle(m.getMsrSubtitle());
		}
		/******************** measuresupplementaldata ********************************************************************************/
		org.hl7.fhir.r4.model.Measure.MeasureSupplementalDataComponent measuresupplementaldata =  new org.hl7.fhir.r4.model.Measure.MeasureSupplementalDataComponent();
		measure.addSupplementalData(measuresupplementaldata);

		/******************** measuresupplementaldatacode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuresupplementaldatacode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measuresupplementaldata.setCode(measuresupplementaldatacode);

		/******************** measuresupplementaldatacodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuresupplementaldatacodecoding =  new org.hl7.fhir.r4.model.Coding();
		measuresupplementaldatacode.addCoding(measuresupplementaldatacodecoding);

		/******************** Msr_SupplementalData_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgCd() != null) {
			measuresupplementaldatacodecoding.setCode(m.getMsrSupplementalDataCdCdgCd());
		}
		/******************** Msr_SupplementalData_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgDsply() != null) {
			measuresupplementaldatacodecoding.setDisplay(m.getMsrSupplementalDataCdCdgDsply());
		}
		/******************** Msr_SupplementalData_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgSys() != null) {
			measuresupplementaldatacodecoding.setSystem(m.getMsrSupplementalDataCdCdgSys());
		}
		/******************** Msr_SupplementalData_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgUsrSltd() != null) {
			measuresupplementaldatacodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrSupplementalDataCdCdgUsrSltd()));
		}
		/******************** Msr_SupplementalData_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrSupplementalDataCdCdgVrsn() != null) {
			measuresupplementaldatacodecoding.setVersion(m.getMsrSupplementalDataCdCdgVrsn());
		}
		/******************** Msr_SupplementalData_Cd_Txt ********************************************************************************/
		if(m.getMsrSupplementalDataCdTxt() != null) {
			measuresupplementaldatacode.setText(m.getMsrSupplementalDataCdTxt());
		}
		/******************** measuresupplementaldatacriteria ********************************************************************************/
		org.hl7.fhir.r4.model.Expression measuresupplementaldatacriteria =  new org.hl7.fhir.r4.model.Expression();
		measuresupplementaldata.setCriteria(measuresupplementaldatacriteria);

		/******************** Msr_SupplementalData_Criteria_Dscrptn ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaDscrptn() != null) {
			measuresupplementaldatacriteria.setDescription(m.getMsrSupplementalDataCriteriaDscrptn());
		}
		/******************** Msr_SupplementalData_Criteria_Exprsn ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaExprsn() != null) {
			measuresupplementaldatacriteria.setExpression(m.getMsrSupplementalDataCriteriaExprsn());
		}
		/******************** Msr_SupplementalData_Criteria_Lnguage ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaLnguage() != null) {
			measuresupplementaldatacriteria.setLanguage(m.getMsrSupplementalDataCriteriaLnguage());
		}
		/******************** Msr_SupplementalData_Criteria_Nm ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaNm() != null) {
			measuresupplementaldatacriteria.setName(m.getMsrSupplementalDataCriteriaNm());
		}
		/******************** Msr_SupplementalData_Criteria_Rfrnc ********************************************************************************/
		if(m.getMsrSupplementalDataCriteriaRfrnc() != null) {
			measuresupplementaldatacriteria.setReference(m.getMsrSupplementalDataCriteriaRfrnc());
		}
		/******************** Msr_SupplementalData_Dscrptn ********************************************************************************/
		if(m.getMsrSupplementalDataDscrptn() != null) {
			measuresupplementaldata.setDescription(m.getMsrSupplementalDataDscrptn());
		}
		/******************** measuresupplementaldatausage ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuresupplementaldatausage =  new org.hl7.fhir.r4.model.CodeableConcept();
		measuresupplementaldata.addUsage(measuresupplementaldatausage);

		/******************** measuresupplementaldatausagecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuresupplementaldatausagecoding =  new org.hl7.fhir.r4.model.Coding();
		measuresupplementaldatausage.addCoding(measuresupplementaldatausagecoding);

		/******************** Msr_SupplementalData_Usg_Cdg_Cd ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgCd() != null) {
			measuresupplementaldatausagecoding.setCode(m.getMsrSupplementalDataUsgCdgCd());
		}
		/******************** Msr_SupplementalData_Usg_Cdg_Dsply ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgDsply() != null) {
			measuresupplementaldatausagecoding.setDisplay(m.getMsrSupplementalDataUsgCdgDsply());
		}
		/******************** Msr_SupplementalData_Usg_Cdg_Sys ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgSys() != null) {
			measuresupplementaldatausagecoding.setSystem(m.getMsrSupplementalDataUsgCdgSys());
		}
		/******************** Msr_SupplementalData_Usg_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgUsrSltd() != null) {
			measuresupplementaldatausagecoding.setUserSelected(Boolean.parseBoolean(m.getMsrSupplementalDataUsgCdgUsrSltd()));
		}
		/******************** Msr_SupplementalData_Usg_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrSupplementalDataUsgCdgVrsn() != null) {
			measuresupplementaldatausagecoding.setVersion(m.getMsrSupplementalDataUsgCdgVrsn());
		}
		/******************** Msr_SupplementalData_Usg_Txt ********************************************************************************/
		if(m.getMsrSupplementalDataUsgTxt() != null) {
			measuresupplementaldatausage.setText(m.getMsrSupplementalDataUsgTxt());
		}
		/******************** Msr_Ttl ********************************************************************************/
		if(m.getMsrTtl() != null) {
			measure.setTitle(m.getMsrTtl());
		}
		/******************** measuretopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuretopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		measure.addTopic(measuretopic);

		/******************** measuretopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuretopiccoding =  new org.hl7.fhir.r4.model.Coding();
		measuretopic.addCoding(measuretopiccoding);

		/******************** Msr_Topic_Cdg_Cd ********************************************************************************/
		if(m.getMsrTopicCdgCd() != null) {
			measuretopiccoding.setCode(m.getMsrTopicCdgCd());
		}
		/******************** Msr_Topic_Cdg_Dsply ********************************************************************************/
		if(m.getMsrTopicCdgDsply() != null) {
			measuretopiccoding.setDisplay(m.getMsrTopicCdgDsply());
		}
		/******************** Msr_Topic_Cdg_Sys ********************************************************************************/
		if(m.getMsrTopicCdgSys() != null) {
			measuretopiccoding.setSystem(m.getMsrTopicCdgSys());
		}
		/******************** Msr_Topic_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrTopicCdgUsrSltd() != null) {
			measuretopiccoding.setUserSelected(Boolean.parseBoolean(m.getMsrTopicCdgUsrSltd()));
		}
		/******************** Msr_Topic_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrTopicCdgVrsn() != null) {
			measuretopiccoding.setVersion(m.getMsrTopicCdgVrsn());
		}
		/******************** Msr_Topic_Txt ********************************************************************************/
		if(m.getMsrTopicTxt() != null) {
			measuretopic.setText(m.getMsrTopicTxt());
		}
		/******************** measuretype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measuretype =  new org.hl7.fhir.r4.model.CodeableConcept();
		measure.addType(measuretype);

		/******************** measuretypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measuretypecoding =  new org.hl7.fhir.r4.model.Coding();
		measuretype.addCoding(measuretypecoding);

		/******************** Msr_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMsrTypCdgCd() != null) {
			measuretypecoding.setCode(m.getMsrTypCdgCd());
		}
		/******************** Msr_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMsrTypCdgDsply() != null) {
			measuretypecoding.setDisplay(m.getMsrTypCdgDsply());
		}
		/******************** Msr_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMsrTypCdgSys() != null) {
			measuretypecoding.setSystem(m.getMsrTypCdgSys());
		}
		/******************** Msr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrTypCdgUsrSltd() != null) {
			measuretypecoding.setUserSelected(Boolean.parseBoolean(m.getMsrTypCdgUsrSltd()));
		}
		/******************** Msr_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrTypCdgVrsn() != null) {
			measuretypecoding.setVersion(m.getMsrTypCdgVrsn());
		}
		/******************** Msr_Typ_Txt ********************************************************************************/
		if(m.getMsrTypTxt() != null) {
			measuretype.setText(m.getMsrTypTxt());
		}
		/******************** Msr_Url ********************************************************************************/
		if(m.getMsrUrl() != null) {
			measure.setUrl(m.getMsrUrl());
		}
		/******************** Msr_Usg ********************************************************************************/
		if(m.getMsrUsg() != null) {
			measure.setUsage(m.getMsrUsg());
		}
		/******************** measureusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext measureusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		measure.addUseContext(measureusecontext);

		/******************** measureusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measureusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		measureusecontext.setCode(measureusecontextcode);

		/******************** Msr_UseCntxt_Cd_Cd ********************************************************************************/
		if(m.getMsrUseCntxtCdCd() != null) {
			measureusecontextcode.setCode(m.getMsrUseCntxtCdCd());
		}
		/******************** Msr_UseCntxt_Cd_Dsply ********************************************************************************/
		if(m.getMsrUseCntxtCdDsply() != null) {
			measureusecontextcode.setDisplay(m.getMsrUseCntxtCdDsply());
		}
		/******************** Msr_UseCntxt_Cd_Sys ********************************************************************************/
		if(m.getMsrUseCntxtCdSys() != null) {
			measureusecontextcode.setSystem(m.getMsrUseCntxtCdSys());
		}
		/******************** Msr_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(m.getMsrUseCntxtCdUsrSltd() != null) {
			measureusecontextcode.setUserSelected(Boolean.parseBoolean(m.getMsrUseCntxtCdUsrSltd()));
		}
		/******************** Msr_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(m.getMsrUseCntxtCdVrsn() != null) {
			measureusecontextcode.setVersion(m.getMsrUseCntxtCdVrsn());
		}
		/******************** measureusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measureusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		measureusecontext.setValue(measureusecontextvaluecodeableconcept);

		/******************** measureusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measureusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		measureusecontextvaluecodeableconcept.addCoding(measureusecontextvaluecodeableconceptcoding);

		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgCd() != null) {
			measureusecontextvaluecodeableconceptcoding.setCode(m.getMsrUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgDsply() != null) {
			measureusecontextvaluecodeableconceptcoding.setDisplay(m.getMsrUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgSys() != null) {
			measureusecontextvaluecodeableconceptcoding.setSystem(m.getMsrUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			measureusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMsrUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptCdgVrsn() != null) {
			measureusecontextvaluecodeableconceptcoding.setVersion(m.getMsrUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** Msr_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(m.getMsrUseCntxtVlCdbleCncptTxt() != null) {
			measureusecontextvaluecodeableconcept.setText(m.getMsrUseCntxtVlCdbleCncptTxt());
		}
		/******************** measureusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measureusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		measureusecontext.setValue(measureusecontextvaluequantity);

		/******************** Msr_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(m.getMsrUseCntxtVlQntyCd() != null) {
			measureusecontextvaluequantity.setCode(m.getMsrUseCntxtVlQntyCd());
		}
		/******************** measureusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory measureusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		measureusecontextvaluequantity.setComparator(measureusecontextvaluequantitycomparator.fromCode(m.getMsrUseCntxtVlQntyCmprtr()));

		/******************** Msr_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(m.getMsrUseCntxtVlQntySys() != null) {
			measureusecontextvaluequantity.setSystem(m.getMsrUseCntxtVlQntySys());
		}
		/******************** Msr_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(m.getMsrUseCntxtVlQntyUnt() != null) {
			measureusecontextvaluequantity.setUnit(m.getMsrUseCntxtVlQntyUnt());
		}
		/******************** Msr_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(m.getMsrUseCntxtVlQntyVl() != null) {
			measureusecontextvaluequantity.setValue(Double.parseDouble((m.getMsrUseCntxtVlQntyVl())));
		}
		/******************** measureusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range measureusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		measureusecontext.setValue(measureusecontextvaluerange);

		/******************** measureusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measureusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		measureusecontextvaluerange.setHigh(measureusecontextvaluerangehigh);

		/******************** Msr_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(m.getMsrUseCntxtVlRngHiCd() != null) {
			measureusecontextvaluerangehigh.setCode(m.getMsrUseCntxtVlRngHiCd());
		}
		/******************** measureusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory measureusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		measureusecontextvaluerangehigh.setComparator(measureusecontextvaluerangehighcomparator.fromCode(m.getMsrUseCntxtVlRngHiCmprtr()));

		/******************** Msr_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(m.getMsrUseCntxtVlRngHiSys() != null) {
			measureusecontextvaluerangehigh.setSystem(m.getMsrUseCntxtVlRngHiSys());
		}
		/******************** Msr_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(m.getMsrUseCntxtVlRngHiUnt() != null) {
			measureusecontextvaluerangehigh.setUnit(m.getMsrUseCntxtVlRngHiUnt());
		}
		/******************** Msr_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(m.getMsrUseCntxtVlRngHiVl() != null) {
			measureusecontextvaluerangehigh.setValue(Double.parseDouble((m.getMsrUseCntxtVlRngHiVl())));
		}
		/******************** measureusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measureusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		measureusecontextvaluerange.setLow(measureusecontextvaluerangelow);

		/******************** Msr_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(m.getMsrUseCntxtVlRngLwCd() != null) {
			measureusecontextvaluerangelow.setCode(m.getMsrUseCntxtVlRngLwCd());
		}
		/******************** measureusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory measureusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		measureusecontextvaluerangelow.setComparator(measureusecontextvaluerangelowcomparator.fromCode(m.getMsrUseCntxtVlRngLwCmprtr()));

		/******************** Msr_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(m.getMsrUseCntxtVlRngLwSys() != null) {
			measureusecontextvaluerangelow.setSystem(m.getMsrUseCntxtVlRngLwSys());
		}
		/******************** Msr_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(m.getMsrUseCntxtVlRngLwUnt() != null) {
			measureusecontextvaluerangelow.setUnit(m.getMsrUseCntxtVlRngLwUnt());
		}
		/******************** Msr_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(m.getMsrUseCntxtVlRngLwVl() != null) {
			measureusecontextvaluerangelow.setValue(Double.parseDouble((m.getMsrUseCntxtVlRngLwVl())));
		}
		/******************** Msr_UseCntxt_VlRfrnc ********************************************************************************/
		if(m.getMsrUseCntxtVlRfrnc() != null) {
			measureusecontext.setValue( new org.hl7.fhir.r4.model.Reference(m.getMsrUseCntxtVlRfrnc()));
		}
		/******************** Msr_Vrsn ********************************************************************************/
		if(m.getMsrVrsn() != null) {
			measure.setVersion(m.getMsrVrsn());
		}
		return measure;
	}
}
