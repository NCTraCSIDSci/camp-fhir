package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MeasureReport;
public class MeasureReportConversion 
{
	public org.hl7.fhir.r4.model.MeasureReport MeasureReports(MeasureReport m) throws ParseException
	{
		org.hl7.fhir.r4.model.MeasureReport measurereport = new org.hl7.fhir.r4.model.MeasureReport();

		/******************** id ********************************************************************************/
		measurereport.setId(m.getId());

		/******************** MsrRpt_Dt ********************************************************************************/
		if(m.getMsrRptDt() != null) {
			java.text.SimpleDateFormat MsrRpt_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsrRpt_Dtdate = MsrRpt_Dtsdf.parse(m.getMsrRptDt());
			measurereport.setDate(MsrRpt_Dtdate);
		}
		/******************** MsrRpt_EvaluatedRsrc ********************************************************************************/
		if(m.getMsrRptEvaluatedRsrc() != null) {
			measurereport.addEvaluatedResource( new org.hl7.fhir.r4.model.Reference(m.getMsrRptEvaluatedRsrc()));
		}
		/******************** measurereportgroup ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupComponent measurereportgroup =  new org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupComponent();
		measurereport.addGroup(measurereportgroup);

		/******************** measurereportgroupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measurereportgroup.setCode(measurereportgroupcode);

		/******************** measurereportgroupcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupcodecoding =  new org.hl7.fhir.r4.model.Coding();
		measurereportgroupcode.addCoding(measurereportgroupcodecoding);

		/******************** MsrRpt_Grp_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpCdCdgCd() != null) {
			measurereportgroupcodecoding.setCode(m.getMsrRptGrpCdCdgCd());
		}
		/******************** MsrRpt_Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpCdCdgDsply() != null) {
			measurereportgroupcodecoding.setDisplay(m.getMsrRptGrpCdCdgDsply());
		}
		/******************** MsrRpt_Grp_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpCdCdgSys() != null) {
			measurereportgroupcodecoding.setSystem(m.getMsrRptGrpCdCdgSys());
		}
		/******************** MsrRpt_Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpCdCdgUsrSltd() != null) {
			measurereportgroupcodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrRptGrpCdCdgUsrSltd()));
		}
		/******************** MsrRpt_Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpCdCdgVrsn() != null) {
			measurereportgroupcodecoding.setVersion(m.getMsrRptGrpCdCdgVrsn());
		}
		/******************** MsrRpt_Grp_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpCdTxt() != null) {
			measurereportgroupcode.setText(m.getMsrRptGrpCdTxt());
		}
		/******************** measurereportgroupmeasurescore ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measurereportgroupmeasurescore =  new org.hl7.fhir.r4.model.Quantity();
		measurereportgroup.setMeasureScore(measurereportgroupmeasurescore);

		/******************** MsrRpt_Grp_MsrScore_Cd ********************************************************************************/
		if(m.getMsrRptGrpMsrScoreCd() != null) {
			measurereportgroupmeasurescore.setCode(m.getMsrRptGrpMsrScoreCd());
		}
		/******************** measurereportgroupmeasurescorecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory measurereportgroupmeasurescorecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		measurereportgroupmeasurescore.setComparator(measurereportgroupmeasurescorecomparator.fromCode(m.getMsrRptGrpMsrScoreCmprtr()));

		/******************** MsrRpt_Grp_MsrScore_Sys ********************************************************************************/
		if(m.getMsrRptGrpMsrScoreSys() != null) {
			measurereportgroupmeasurescore.setSystem(m.getMsrRptGrpMsrScoreSys());
		}
		/******************** MsrRpt_Grp_MsrScore_Unt ********************************************************************************/
		if(m.getMsrRptGrpMsrScoreUnt() != null) {
			measurereportgroupmeasurescore.setUnit(m.getMsrRptGrpMsrScoreUnt());
		}
		/******************** MsrRpt_Grp_MsrScore_Vl ********************************************************************************/
		if(m.getMsrRptGrpMsrScoreVl() != null) {
			measurereportgroupmeasurescore.setValue(Double.parseDouble((m.getMsrRptGrpMsrScoreVl())));
		}
		/******************** measurereportgrouppopulation ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupPopulationComponent measurereportgrouppopulation =  new org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupPopulationComponent();
		measurereportgroup.addPopulation(measurereportgrouppopulation);

		/******************** measurereportgrouppopulationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgrouppopulationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measurereportgrouppopulation.setCode(measurereportgrouppopulationcode);

		/******************** measurereportgrouppopulationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgrouppopulationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		measurereportgrouppopulationcode.addCoding(measurereportgrouppopulationcodecoding);

		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgCd() != null) {
			measurereportgrouppopulationcodecoding.setCode(m.getMsrRptGrpPoplnCdCdgCd());
		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgDsply() != null) {
			measurereportgrouppopulationcodecoding.setDisplay(m.getMsrRptGrpPoplnCdCdgDsply());
		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgSys() != null) {
			measurereportgrouppopulationcodecoding.setSystem(m.getMsrRptGrpPoplnCdCdgSys());
		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgUsrSltd() != null) {
			measurereportgrouppopulationcodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrRptGrpPoplnCdCdgUsrSltd()));
		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgVrsn() != null) {
			measurereportgrouppopulationcodecoding.setVersion(m.getMsrRptGrpPoplnCdCdgVrsn());
		}
		/******************** MsrRpt_Grp_Popln_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdTxt() != null) {
			measurereportgrouppopulationcode.setText(m.getMsrRptGrpPoplnCdTxt());
		}
		/******************** MsrRpt_Grp_Popln_Cnt ********************************************************************************/
		if(m.getMsrRptGrpPoplnCnt() != null) {
			measurereportgrouppopulation.setCount(Integer.parseInt(m.getMsrRptGrpPoplnCnt()));
		}
		/******************** MsrRpt_Grp_Popln_SbjctRslts ********************************************************************************/
		if(m.getMsrRptGrpPoplnSbjctRslts() != null) {
			measurereportgrouppopulation.setSubjectResults( new org.hl7.fhir.r4.model.Reference(m.getMsrRptGrpPoplnSbjctRslts()));
		}
		/******************** measurereportgroupstratifier ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupStratifierComponent measurereportgroupstratifier =  new org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupStratifierComponent();
		measurereportgroup.addStratifier(measurereportgroupstratifier);

		/******************** measurereportgroupstratifiercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifiercode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measurereportgroupstratifier.addCode(measurereportgroupstratifiercode);

		/******************** measurereportgroupstratifiercodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifiercodecoding =  new org.hl7.fhir.r4.model.Coding();
		measurereportgroupstratifiercode.addCoding(measurereportgroupstratifiercodecoding);

		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgCd() != null) {
			measurereportgroupstratifiercodecoding.setCode(m.getMsrRptGrpStrtfierCdCdgCd());
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgDsply() != null) {
			measurereportgroupstratifiercodecoding.setDisplay(m.getMsrRptGrpStrtfierCdCdgDsply());
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgSys() != null) {
			measurereportgroupstratifiercodecoding.setSystem(m.getMsrRptGrpStrtfierCdCdgSys());
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgUsrSltd() != null) {
			measurereportgroupstratifiercodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrRptGrpStrtfierCdCdgUsrSltd()));
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgVrsn() != null) {
			measurereportgroupstratifiercodecoding.setVersion(m.getMsrRptGrpStrtfierCdCdgVrsn());
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdTxt() != null) {
			measurereportgroupstratifiercode.setText(m.getMsrRptGrpStrtfierCdTxt());
		}
		/******************** measurereportgroupstratifierstratum ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponent measurereportgroupstratifierstratum =  new org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponent();
		measurereportgroupstratifier.addStratum(measurereportgroupstratifierstratum);

		/******************** measurereportgroupstratifierstratumcomponent ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponentComponent measurereportgroupstratifierstratumcomponent =  new org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponentComponent();
		measurereportgroupstratifierstratum.addComponent(measurereportgroupstratifierstratumcomponent);

		/******************** measurereportgroupstratifierstratumcomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumcomponentcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measurereportgroupstratifierstratumcomponent.setCode(measurereportgroupstratifierstratumcomponentcode);

		/******************** measurereportgroupstratifierstratumcomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifierstratumcomponentcodecoding =  new org.hl7.fhir.r4.model.Coding();
		measurereportgroupstratifierstratumcomponentcode.addCoding(measurereportgroupstratifierstratumcomponentcodecoding);

		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgCd() != null) {
			measurereportgroupstratifierstratumcomponentcodecoding.setCode(m.getMsrRptGrpStrtfierStratumCmpntCdCdgCd());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgDsply() != null) {
			measurereportgroupstratifierstratumcomponentcodecoding.setDisplay(m.getMsrRptGrpStrtfierStratumCmpntCdCdgDsply());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgSys() != null) {
			measurereportgroupstratifierstratumcomponentcodecoding.setSystem(m.getMsrRptGrpStrtfierStratumCmpntCdCdgSys());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd() != null) {
			measurereportgroupstratifierstratumcomponentcodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgVrsn() != null) {
			measurereportgroupstratifierstratumcomponentcodecoding.setVersion(m.getMsrRptGrpStrtfierStratumCmpntCdCdgVrsn());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdTxt() != null) {
			measurereportgroupstratifierstratumcomponentcode.setText(m.getMsrRptGrpStrtfierStratumCmpntCdTxt());
		}
		/******************** measurereportgroupstratifierstratumcomponentvalue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumcomponentvalue =  new org.hl7.fhir.r4.model.CodeableConcept();
		measurereportgroupstratifierstratumcomponent.setValue(measurereportgroupstratifierstratumcomponentvalue);

		/******************** measurereportgroupstratifierstratumcomponentvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifierstratumcomponentvaluecoding =  new org.hl7.fhir.r4.model.Coding();
		measurereportgroupstratifierstratumcomponentvalue.addCoding(measurereportgroupstratifierstratumcomponentvaluecoding);

		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgCd() != null) {
			measurereportgroupstratifierstratumcomponentvaluecoding.setCode(m.getMsrRptGrpStrtfierStratumCmpntVlCdgCd());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgDsply() != null) {
			measurereportgroupstratifierstratumcomponentvaluecoding.setDisplay(m.getMsrRptGrpStrtfierStratumCmpntVlCdgDsply());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgSys() != null) {
			measurereportgroupstratifierstratumcomponentvaluecoding.setSystem(m.getMsrRptGrpStrtfierStratumCmpntVlCdgSys());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd() != null) {
			measurereportgroupstratifierstratumcomponentvaluecoding.setUserSelected(Boolean.parseBoolean(m.getMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgVrsn() != null) {
			measurereportgroupstratifierstratumcomponentvaluecoding.setVersion(m.getMsrRptGrpStrtfierStratumCmpntVlCdgVrsn());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlTxt() != null) {
			measurereportgroupstratifierstratumcomponentvalue.setText(m.getMsrRptGrpStrtfierStratumCmpntVlTxt());
		}
		/******************** measurereportgroupstratifierstratummeasurescore ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measurereportgroupstratifierstratummeasurescore =  new org.hl7.fhir.r4.model.Quantity();
		measurereportgroupstratifierstratum.setMeasureScore(measurereportgroupstratifierstratummeasurescore);

		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumMsrScoreCd() != null) {
			measurereportgroupstratifierstratummeasurescore.setCode(m.getMsrRptGrpStrtfierStratumMsrScoreCd());
		}
		/******************** measurereportgroupstratifierstratummeasurescorecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory measurereportgroupstratifierstratummeasurescorecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		measurereportgroupstratifierstratummeasurescore.setComparator(measurereportgroupstratifierstratummeasurescorecomparator.fromCode(m.getMsrRptGrpStrtfierStratumMsrScoreCmprtr()));

		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumMsrScoreSys() != null) {
			measurereportgroupstratifierstratummeasurescore.setSystem(m.getMsrRptGrpStrtfierStratumMsrScoreSys());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Unt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumMsrScoreUnt() != null) {
			measurereportgroupstratifierstratummeasurescore.setUnit(m.getMsrRptGrpStrtfierStratumMsrScoreUnt());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Vl ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumMsrScoreVl() != null) {
			measurereportgroupstratifierstratummeasurescore.setValue(Double.parseDouble((m.getMsrRptGrpStrtfierStratumMsrScoreVl())));
		}
		/******************** measurereportgroupstratifierstratumpopulation ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.StratifierGroupPopulationComponent measurereportgroupstratifierstratumpopulation =  new org.hl7.fhir.r4.model.MeasureReport.StratifierGroupPopulationComponent();
		measurereportgroupstratifierstratum.addPopulation(measurereportgroupstratifierstratumpopulation);

		/******************** measurereportgroupstratifierstratumpopulationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumpopulationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		measurereportgroupstratifierstratumpopulation.setCode(measurereportgroupstratifierstratumpopulationcode);

		/******************** measurereportgroupstratifierstratumpopulationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifierstratumpopulationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		measurereportgroupstratifierstratumpopulationcode.addCoding(measurereportgroupstratifierstratumpopulationcodecoding);

		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgCd() != null) {
			measurereportgroupstratifierstratumpopulationcodecoding.setCode(m.getMsrRptGrpStrtfierStratumPoplnCdCdgCd());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgDsply() != null) {
			measurereportgroupstratifierstratumpopulationcodecoding.setDisplay(m.getMsrRptGrpStrtfierStratumPoplnCdCdgDsply());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgSys() != null) {
			measurereportgroupstratifierstratumpopulationcodecoding.setSystem(m.getMsrRptGrpStrtfierStratumPoplnCdCdgSys());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd() != null) {
			measurereportgroupstratifierstratumpopulationcodecoding.setUserSelected(Boolean.parseBoolean(m.getMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgVrsn() != null) {
			measurereportgroupstratifierstratumpopulationcodecoding.setVersion(m.getMsrRptGrpStrtfierStratumPoplnCdCdgVrsn());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdTxt() != null) {
			measurereportgroupstratifierstratumpopulationcode.setText(m.getMsrRptGrpStrtfierStratumPoplnCdTxt());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cnt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCnt() != null) {
			measurereportgroupstratifierstratumpopulation.setCount(Integer.parseInt(m.getMsrRptGrpStrtfierStratumPoplnCnt()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_SbjctRslts ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnSbjctRslts() != null) {
			measurereportgroupstratifierstratumpopulation.setSubjectResults( new org.hl7.fhir.r4.model.Reference(m.getMsrRptGrpStrtfierStratumPoplnSbjctRslts()));
		}
		/******************** measurereportgroupstratifierstratumvalue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumvalue =  new org.hl7.fhir.r4.model.CodeableConcept();
		measurereportgroupstratifierstratum.setValue(measurereportgroupstratifierstratumvalue);

		/******************** measurereportgroupstratifierstratumvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifierstratumvaluecoding =  new org.hl7.fhir.r4.model.Coding();
		measurereportgroupstratifierstratumvalue.addCoding(measurereportgroupstratifierstratumvaluecoding);

		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgCd() != null) {
			measurereportgroupstratifierstratumvaluecoding.setCode(m.getMsrRptGrpStrtfierStratumVlCdgCd());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgDsply() != null) {
			measurereportgroupstratifierstratumvaluecoding.setDisplay(m.getMsrRptGrpStrtfierStratumVlCdgDsply());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgSys() != null) {
			measurereportgroupstratifierstratumvaluecoding.setSystem(m.getMsrRptGrpStrtfierStratumVlCdgSys());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgUsrSltd() != null) {
			measurereportgroupstratifierstratumvaluecoding.setUserSelected(Boolean.parseBoolean(m.getMsrRptGrpStrtfierStratumVlCdgUsrSltd()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgVrsn() != null) {
			measurereportgroupstratifierstratumvaluecoding.setVersion(m.getMsrRptGrpStrtfierStratumVlCdgVrsn());
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlTxt() != null) {
			measurereportgroupstratifierstratumvalue.setText(m.getMsrRptGrpStrtfierStratumVlTxt());
		}
		/******************** measurereportidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier measurereportidentifier =  new org.hl7.fhir.r4.model.Identifier();
		measurereport.addIdentifier(measurereportidentifier);

		/******************** MsrRpt_Id_Assigner ********************************************************************************/
		if(m.getMsrRptIdAssigner() != null) {
			measurereportidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMsrRptIdAssigner()));
		}
		/******************** measurereportidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurereportidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		measurereportidentifier.setPeriod(measurereportidentifierperiod);

		/******************** MsrRpt_Id_Prd_End ********************************************************************************/
		if(m.getMsrRptIdPrdEnd() != null) {
			java.text.SimpleDateFormat MsrRpt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsrRpt_Id_Prd_Enddate = MsrRpt_Id_Prd_Endsdf.parse(m.getMsrRptIdPrdEnd());
			measurereportidentifierperiod.setEnd(MsrRpt_Id_Prd_Enddate);
		}
		/******************** MsrRpt_Id_Prd_Strt ********************************************************************************/
		if(m.getMsrRptIdPrdStrt() != null) {
			java.text.SimpleDateFormat MsrRpt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsrRpt_Id_Prd_Strtdate = MsrRpt_Id_Prd_Strtsdf.parse(m.getMsrRptIdPrdStrt());
			measurereportidentifierperiod.setStart(MsrRpt_Id_Prd_Strtdate);
		}
		/******************** MsrRpt_Id_Sys ********************************************************************************/
		if(m.getMsrRptIdSys() != null) {
			measurereportidentifier.setSystem(m.getMsrRptIdSys());
		}
		/******************** measurereportidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		measurereportidentifier.setType(measurereportidentifiertype);

		/******************** measurereportidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		measurereportidentifiertype.addCoding(measurereportidentifiertypecoding);

		/******************** MsrRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptIdTypCdgCd() != null) {
			measurereportidentifiertypecoding.setCode(m.getMsrRptIdTypCdgCd());
		}
		/******************** MsrRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptIdTypCdgDsply() != null) {
			measurereportidentifiertypecoding.setDisplay(m.getMsrRptIdTypCdgDsply());
		}
		/******************** MsrRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptIdTypCdgSys() != null) {
			measurereportidentifiertypecoding.setSystem(m.getMsrRptIdTypCdgSys());
		}
		/******************** MsrRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptIdTypCdgUsrSltd() != null) {
			measurereportidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMsrRptIdTypCdgUsrSltd()));
		}
		/******************** MsrRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptIdTypCdgVrsn() != null) {
			measurereportidentifiertypecoding.setVersion(m.getMsrRptIdTypCdgVrsn());
		}
		/******************** MsrRpt_Id_Typ_Txt ********************************************************************************/
		if(m.getMsrRptIdTypTxt() != null) {
			measurereportidentifiertype.setText(m.getMsrRptIdTypTxt());
		}
		/******************** measurereportidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory measurereportidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		measurereportidentifier.setUse(measurereportidentifieruse.fromCode(m.getMsrRptIdUse()));

		/******************** MsrRpt_Id_Vl ********************************************************************************/
		if(m.getMsrRptIdVl() != null) {
			measurereportidentifier.setValue(m.getMsrRptIdVl());
		}
		/******************** measurereportimprovementnotation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportimprovementnotation =  new org.hl7.fhir.r4.model.CodeableConcept();
		measurereport.setImprovementNotation(measurereportimprovementnotation);

		/******************** measurereportimprovementnotationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportimprovementnotationcoding =  new org.hl7.fhir.r4.model.Coding();
		measurereportimprovementnotation.addCoding(measurereportimprovementnotationcoding);

		/******************** MsrRpt_ImprovementNotation_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgCd() != null) {
			measurereportimprovementnotationcoding.setCode(m.getMsrRptImprovementNotationCdgCd());
		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgDsply() != null) {
			measurereportimprovementnotationcoding.setDisplay(m.getMsrRptImprovementNotationCdgDsply());
		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgSys() != null) {
			measurereportimprovementnotationcoding.setSystem(m.getMsrRptImprovementNotationCdgSys());
		}
		/******************** MsrRpt_ImprovementNotation_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgUsrSltd() != null) {
			measurereportimprovementnotationcoding.setUserSelected(Boolean.parseBoolean(m.getMsrRptImprovementNotationCdgUsrSltd()));
		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgVrsn() != null) {
			measurereportimprovementnotationcoding.setVersion(m.getMsrRptImprovementNotationCdgVrsn());
		}
		/******************** MsrRpt_ImprovementNotation_Txt ********************************************************************************/
		if(m.getMsrRptImprovementNotationTxt() != null) {
			measurereportimprovementnotation.setText(m.getMsrRptImprovementNotationTxt());
		}
		/******************** MsrRpt_Msr ********************************************************************************/
		if(m.getMsrRptMsr() != null) {
			measurereport.setMeasure(m.getMsrRptMsr());
		}
		/******************** measurereportperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurereportperiod =  new org.hl7.fhir.r4.model.Period();
		measurereport.setPeriod(measurereportperiod);

		/******************** MsrRpt_Prd_End ********************************************************************************/
		if(m.getMsrRptPrdEnd() != null) {
			java.text.SimpleDateFormat MsrRpt_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsrRpt_Prd_Enddate = MsrRpt_Prd_Endsdf.parse(m.getMsrRptPrdEnd());
			measurereportperiod.setEnd(MsrRpt_Prd_Enddate);
		}
		/******************** MsrRpt_Prd_Strt ********************************************************************************/
		if(m.getMsrRptPrdStrt() != null) {
			java.text.SimpleDateFormat MsrRpt_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsrRpt_Prd_Strtdate = MsrRpt_Prd_Strtsdf.parse(m.getMsrRptPrdStrt());
			measurereportperiod.setStart(MsrRpt_Prd_Strtdate);
		}
		/******************** MsrRpt_Rpter ********************************************************************************/
		if(m.getMsrRptRpter() != null) {
			measurereport.setReporter( new org.hl7.fhir.r4.model.Reference(m.getMsrRptRpter()));
		}
		/******************** measurereportstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportStatusEnumFactory measurereportstatus =  new org.hl7.fhir.r4.model.MeasureReport.MeasureReportStatusEnumFactory();
		measurereport.setStatus(measurereportstatus.fromCode(m.getMsrRptSts()));

		/******************** MsrRpt_Sbjct ********************************************************************************/
		if(m.getMsrRptSbjct() != null) {
			measurereport.setSubject( new org.hl7.fhir.r4.model.Reference(m.getMsrRptSbjct()));
		}
		/******************** measurereporttype ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportTypeEnumFactory measurereporttype =  new org.hl7.fhir.r4.model.MeasureReport.MeasureReportTypeEnumFactory();
		measurereport.setType(measurereporttype.fromCode(m.getMsrRptTyp()));

		return measurereport;
	}
}
