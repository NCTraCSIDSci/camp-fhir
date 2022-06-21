package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MeasureReport;
public class MeasureReportBidirectionalConversion 
{
	public MeasureReport MeasureReports(org.hl7.fhir.r4.model.MeasureReport measurereport) throws ParseException
	{
		 main.java.com.campfhir.model.MeasureReport m = new  main.java.com.campfhir.model.MeasureReport();

		/******************** id ********************************************************************************/
		measurereport.setId(m.getId());

		/******************** measurereporttype ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportType measurereporttype = measurereport.getType();
		m.setMsrRptTyp(measurereporttype.toCode());

		/******************** MsrRpt_Dt ********************************************************************************/
		if(measurereport.hasDate()) {
			m.setMsrRptDt(String.valueOf(measurereport.getDate()));
		}
		/******************** MsrRpt_EvaluatedRsrc ********************************************************************************/
		if(measurereport.hasEvaluatedResource()) {
			m.setMsrRptEvaluatedRsrc(String.valueOf(measurereport.getEvaluatedResourceFirstRep()));
		}
		/******************** measurereportimprovementnotation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportimprovementnotation = measurereport.getImprovementNotation();

		/******************** measurereportimprovementnotationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportimprovementnotationcoding = measurereportimprovementnotation.getCodingFirstRep();

		/******************** MsrRpt_ImprovementNotation_Cdg_Dsply ********************************************************************************/
		if(measurereportimprovementnotationcoding.hasDisplay()) {
			m.setMsrRptImprovementNotationCdgDsply(String.valueOf(measurereportimprovementnotationcoding.getDisplay()));
		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Vrsn ********************************************************************************/
		if(measurereportimprovementnotationcoding.hasVersion()) {
			m.setMsrRptImprovementNotationCdgVrsn(String.valueOf(measurereportimprovementnotationcoding.getVersion()));
		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Cd ********************************************************************************/
		if(measurereportimprovementnotationcoding.hasCode()) {
			m.setMsrRptImprovementNotationCdgCd(String.valueOf(measurereportimprovementnotationcoding.getCode()));
		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Sys ********************************************************************************/
		if(measurereportimprovementnotationcoding.hasSystem()) {
			m.setMsrRptImprovementNotationCdgSys(String.valueOf(measurereportimprovementnotationcoding.getSystem()));
		}
		/******************** MsrRpt_ImprovementNotation_Cdg_UsrSltd ********************************************************************************/
		if(measurereportimprovementnotationcoding.hasUserSelected()) {
			m.setMsrRptImprovementNotationCdgUsrSltd(String.valueOf(measurereportimprovementnotationcoding.getUserSelected()));
		}
		/******************** MsrRpt_ImprovementNotation_Txt ********************************************************************************/
		if(measurereportimprovementnotation.hasText()) {
			m.setMsrRptImprovementNotationTxt(String.valueOf(measurereportimprovementnotation.getText()));
		}
		/******************** MsrRpt_Sbjct ********************************************************************************/
		if(measurereport.hasSubject()) {
			m.setMsrRptSbjct(String.valueOf(measurereport.getSubject()));
		}
		/******************** measurereportstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportStatus measurereportstatus = measurereport.getStatus();
		m.setMsrRptSts(measurereportstatus.toCode());

		/******************** measurereportperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurereportperiod = measurereport.getPeriod();

		/******************** MsrRpt_Prd_End ********************************************************************************/
		if(measurereportperiod.hasEnd()) {
			m.setMsrRptPrdEnd(String.valueOf(measurereportperiod.getEnd()));
		}
		/******************** MsrRpt_Prd_Strt ********************************************************************************/
		if(measurereportperiod.hasStart()) {
			m.setMsrRptPrdStrt(String.valueOf(measurereportperiod.getStart()));
		}
		/******************** measurereportidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier measurereportidentifier = measurereport.getIdentifierFirstRep();

		/******************** MsrRpt_Id_Vl ********************************************************************************/
		if(measurereportidentifier.hasValue()) {
			m.setMsrRptIdVl(String.valueOf(measurereportidentifier.getValue()));
		}
		/******************** measurereportidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportidentifiertype = measurereportidentifier.getType();

		/******************** measurereportidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportidentifiertypecoding = measurereportidentifiertype.getCodingFirstRep();

		/******************** MsrRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(measurereportidentifiertypecoding.hasDisplay()) {
			m.setMsrRptIdTypCdgDsply(String.valueOf(measurereportidentifiertypecoding.getDisplay()));
		}
		/******************** MsrRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(measurereportidentifiertypecoding.hasVersion()) {
			m.setMsrRptIdTypCdgVrsn(String.valueOf(measurereportidentifiertypecoding.getVersion()));
		}
		/******************** MsrRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(measurereportidentifiertypecoding.hasCode()) {
			m.setMsrRptIdTypCdgCd(String.valueOf(measurereportidentifiertypecoding.getCode()));
		}
		/******************** MsrRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(measurereportidentifiertypecoding.hasSystem()) {
			m.setMsrRptIdTypCdgSys(String.valueOf(measurereportidentifiertypecoding.getSystem()));
		}
		/******************** MsrRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(measurereportidentifiertypecoding.hasUserSelected()) {
			m.setMsrRptIdTypCdgUsrSltd(String.valueOf(measurereportidentifiertypecoding.getUserSelected()));
		}
		/******************** MsrRpt_Id_Typ_Txt ********************************************************************************/
		if(measurereportidentifiertype.hasText()) {
			m.setMsrRptIdTypTxt(String.valueOf(measurereportidentifiertype.getText()));
		}
		/******************** MsrRpt_Id_Sys ********************************************************************************/
		if(measurereportidentifier.hasSystem()) {
			m.setMsrRptIdSys(String.valueOf(measurereportidentifier.getSystem()));
		}
		/******************** MsrRpt_Id_Assigner ********************************************************************************/
		if(measurereportidentifier.hasAssigner()) {
			m.setMsrRptIdAssigner(String.valueOf(measurereportidentifier.getAssigner()));
		}
		/******************** measurereportidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurereportidentifierperiod = measurereportidentifier.getPeriod();

		/******************** MsrRpt_Id_Prd_End ********************************************************************************/
		if(measurereportidentifierperiod.hasEnd()) {
			m.setMsrRptIdPrdEnd(String.valueOf(measurereportidentifierperiod.getEnd()));
		}
		/******************** MsrRpt_Id_Prd_Strt ********************************************************************************/
		if(measurereportidentifierperiod.hasStart()) {
			m.setMsrRptIdPrdStrt(String.valueOf(measurereportidentifierperiod.getStart()));
		}
		/******************** measurereportidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse measurereportidentifieruse = measurereportidentifier.getUse();
		m.setMsrRptIdUse(measurereportidentifieruse.toCode());

		/******************** MsrRpt_Msr ********************************************************************************/
		if(measurereport.hasMeasure()) {
			m.setMsrRptMsr(String.valueOf(measurereport.getMeasure()));
		}
		/******************** measurereportgroup ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupComponent measurereportgroup = measurereport.getGroupFirstRep();

		/******************** measurereportgroupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupcode = measurereportgroup.getCode();

		/******************** measurereportgroupcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupcodecoding = measurereportgroupcode.getCodingFirstRep();

		/******************** MsrRpt_Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupcodecoding.hasDisplay()) {
			m.setMsrRptGrpCdCdgDsply(String.valueOf(measurereportgroupcodecoding.getDisplay()));
		}
		/******************** MsrRpt_Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupcodecoding.hasVersion()) {
			m.setMsrRptGrpCdCdgVrsn(String.valueOf(measurereportgroupcodecoding.getVersion()));
		}
		/******************** MsrRpt_Grp_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgroupcodecoding.hasCode()) {
			m.setMsrRptGrpCdCdgCd(String.valueOf(measurereportgroupcodecoding.getCode()));
		}
		/******************** MsrRpt_Grp_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgroupcodecoding.hasSystem()) {
			m.setMsrRptGrpCdCdgSys(String.valueOf(measurereportgroupcodecoding.getSystem()));
		}
		/******************** MsrRpt_Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupcodecoding.hasUserSelected()) {
			m.setMsrRptGrpCdCdgUsrSltd(String.valueOf(measurereportgroupcodecoding.getUserSelected()));
		}
		/******************** MsrRpt_Grp_Cd_Txt ********************************************************************************/
		if(measurereportgroupcode.hasText()) {
			m.setMsrRptGrpCdTxt(String.valueOf(measurereportgroupcode.getText()));
		}
		/******************** measurereportgrouppopulation ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupPopulationComponent measurereportgrouppopulation = measurereportgroup.getPopulationFirstRep();

		/******************** MsrRpt_Grp_Popln_Cnt ********************************************************************************/
		if(measurereportgrouppopulation.hasCount()) {
			m.setMsrRptGrpPoplnCnt(String.valueOf(measurereportgrouppopulation.getCount()));
		}
		/******************** measurereportgrouppopulationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgrouppopulationcode = measurereportgrouppopulation.getCode();

		/******************** measurereportgrouppopulationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgrouppopulationcodecoding = measurereportgrouppopulationcode.getCodingFirstRep();

		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgrouppopulationcodecoding.hasDisplay()) {
			m.setMsrRptGrpPoplnCdCdgDsply(String.valueOf(measurereportgrouppopulationcodecoding.getDisplay()));
		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgrouppopulationcodecoding.hasVersion()) {
			m.setMsrRptGrpPoplnCdCdgVrsn(String.valueOf(measurereportgrouppopulationcodecoding.getVersion()));
		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgrouppopulationcodecoding.hasCode()) {
			m.setMsrRptGrpPoplnCdCdgCd(String.valueOf(measurereportgrouppopulationcodecoding.getCode()));
		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgrouppopulationcodecoding.hasSystem()) {
			m.setMsrRptGrpPoplnCdCdgSys(String.valueOf(measurereportgrouppopulationcodecoding.getSystem()));
		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgrouppopulationcodecoding.hasUserSelected()) {
			m.setMsrRptGrpPoplnCdCdgUsrSltd(String.valueOf(measurereportgrouppopulationcodecoding.getUserSelected()));
		}
		/******************** MsrRpt_Grp_Popln_Cd_Txt ********************************************************************************/
		if(measurereportgrouppopulationcode.hasText()) {
			m.setMsrRptGrpPoplnCdTxt(String.valueOf(measurereportgrouppopulationcode.getText()));
		}
		/******************** MsrRpt_Grp_Popln_SbjctRslts ********************************************************************************/
		if(measurereportgrouppopulation.hasSubjectResults()) {
			m.setMsrRptGrpPoplnSbjctRslts(String.valueOf(measurereportgrouppopulation.getSubjectResults()));
		}
		/******************** measurereportgroupmeasurescore ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measurereportgroupmeasurescore = measurereportgroup.getMeasureScore();

		/******************** MsrRpt_Grp_MsrScore_Vl ********************************************************************************/
		if(measurereportgroupmeasurescore.hasValue()) {
			m.setMsrRptGrpMsrScoreVl(String.valueOf(measurereportgroupmeasurescore.getValue()));
		}
		/******************** measurereportgroupmeasurescorecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measurereportgroupmeasurescorecomparator = measurereportgroupmeasurescore.getComparator();
		m.setMsrRptGrpMsrScoreCmprtr(measurereportgroupmeasurescorecomparator.toCode());

		/******************** MsrRpt_Grp_MsrScore_Cd ********************************************************************************/
		if(measurereportgroupmeasurescore.hasCode()) {
			m.setMsrRptGrpMsrScoreCd(String.valueOf(measurereportgroupmeasurescore.getCode()));
		}
		/******************** MsrRpt_Grp_MsrScore_Sys ********************************************************************************/
		if(measurereportgroupmeasurescore.hasSystem()) {
			m.setMsrRptGrpMsrScoreSys(String.valueOf(measurereportgroupmeasurescore.getSystem()));
		}
		/******************** MsrRpt_Grp_MsrScore_Unt ********************************************************************************/
		if(measurereportgroupmeasurescore.hasUnit()) {
			m.setMsrRptGrpMsrScoreUnt(String.valueOf(measurereportgroupmeasurescore.getUnit()));
		}
		/******************** measurereportgroupstratifier ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupStratifierComponent measurereportgroupstratifier = measurereportgroup.getStratifierFirstRep();

		/******************** measurereportgroupstratifierstratum ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponent measurereportgroupstratifierstratum = measurereportgroupstratifier.getStratumFirstRep();

		/******************** measurereportgroupstratifierstratumvalue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumvalue = measurereportgroupstratifierstratum.getValue();

		/******************** measurereportgroupstratifierstratumvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifierstratumvaluecoding = measurereportgroupstratifierstratumvalue.getCodingFirstRep();

		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecoding.hasDisplay()) {
			m.setMsrRptGrpStrtfierStratumVlCdgDsply(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getDisplay()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecoding.hasVersion()) {
			m.setMsrRptGrpStrtfierStratumVlCdgVrsn(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getVersion()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecoding.hasCode()) {
			m.setMsrRptGrpStrtfierStratumVlCdgCd(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getCode()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecoding.hasSystem()) {
			m.setMsrRptGrpStrtfierStratumVlCdgSys(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getSystem()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecoding.hasUserSelected()) {
			m.setMsrRptGrpStrtfierStratumVlCdgUsrSltd(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getUserSelected()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Txt ********************************************************************************/
		if(measurereportgroupstratifierstratumvalue.hasText()) {
			m.setMsrRptGrpStrtfierStratumVlTxt(String.valueOf(measurereportgroupstratifierstratumvalue.getText()));
		}
		/******************** measurereportgroupstratifierstratumcomponent ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponentComponent measurereportgroupstratifierstratumcomponent = measurereportgroupstratifierstratum.getComponentFirstRep();

		/******************** measurereportgroupstratifierstratumcomponentvalue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumcomponentvalue = measurereportgroupstratifierstratumcomponent.getValue();

		/******************** measurereportgroupstratifierstratumcomponentvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifierstratumcomponentvaluecoding = measurereportgroupstratifierstratumcomponentvalue.getCodingFirstRep();

		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasDisplay()) {
			m.setMsrRptGrpStrtfierStratumCmpntVlCdgDsply(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getDisplay()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasVersion()) {
			m.setMsrRptGrpStrtfierStratumCmpntVlCdgVrsn(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getVersion()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasCode()) {
			m.setMsrRptGrpStrtfierStratumCmpntVlCdgCd(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getCode()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasSystem()) {
			m.setMsrRptGrpStrtfierStratumCmpntVlCdgSys(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getSystem()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasUserSelected()) {
			m.setMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getUserSelected()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Txt ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvalue.hasText()) {
			m.setMsrRptGrpStrtfierStratumCmpntVlTxt(String.valueOf(measurereportgroupstratifierstratumcomponentvalue.getText()));
		}
		/******************** measurereportgroupstratifierstratumcomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumcomponentcode = measurereportgroupstratifierstratumcomponent.getCode();

		/******************** measurereportgroupstratifierstratumcomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifierstratumcomponentcodecoding = measurereportgroupstratifierstratumcomponentcode.getCodingFirstRep();

		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasDisplay()) {
			m.setMsrRptGrpStrtfierStratumCmpntCdCdgDsply(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getDisplay()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasVersion()) {
			m.setMsrRptGrpStrtfierStratumCmpntCdCdgVrsn(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getVersion()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasCode()) {
			m.setMsrRptGrpStrtfierStratumCmpntCdCdgCd(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getCode()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasSystem()) {
			m.setMsrRptGrpStrtfierStratumCmpntCdCdgSys(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getSystem()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasUserSelected()) {
			m.setMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getUserSelected()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Txt ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcode.hasText()) {
			m.setMsrRptGrpStrtfierStratumCmpntCdTxt(String.valueOf(measurereportgroupstratifierstratumcomponentcode.getText()));
		}
		/******************** measurereportgroupstratifierstratumpopulation ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.StratifierGroupPopulationComponent measurereportgroupstratifierstratumpopulation = measurereportgroupstratifierstratum.getPopulationFirstRep();

		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cnt ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulation.hasCount()) {
			m.setMsrRptGrpStrtfierStratumPoplnCnt(String.valueOf(measurereportgroupstratifierstratumpopulation.getCount()));
		}
		/******************** measurereportgroupstratifierstratumpopulationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumpopulationcode = measurereportgroupstratifierstratumpopulation.getCode();

		/******************** measurereportgroupstratifierstratumpopulationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifierstratumpopulationcodecoding = measurereportgroupstratifierstratumpopulationcode.getCodingFirstRep();

		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasDisplay()) {
			m.setMsrRptGrpStrtfierStratumPoplnCdCdgDsply(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getDisplay()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasVersion()) {
			m.setMsrRptGrpStrtfierStratumPoplnCdCdgVrsn(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getVersion()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasCode()) {
			m.setMsrRptGrpStrtfierStratumPoplnCdCdgCd(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getCode()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasSystem()) {
			m.setMsrRptGrpStrtfierStratumPoplnCdCdgSys(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getSystem()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasUserSelected()) {
			m.setMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getUserSelected()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Txt ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcode.hasText()) {
			m.setMsrRptGrpStrtfierStratumPoplnCdTxt(String.valueOf(measurereportgroupstratifierstratumpopulationcode.getText()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_SbjctRslts ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulation.hasSubjectResults()) {
			m.setMsrRptGrpStrtfierStratumPoplnSbjctRslts(String.valueOf(measurereportgroupstratifierstratumpopulation.getSubjectResults()));
		}
		/******************** measurereportgroupstratifierstratummeasurescore ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measurereportgroupstratifierstratummeasurescore = measurereportgroupstratifierstratum.getMeasureScore();

		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Vl ********************************************************************************/
		if(measurereportgroupstratifierstratummeasurescore.hasValue()) {
			m.setMsrRptGrpStrtfierStratumMsrScoreVl(String.valueOf(measurereportgroupstratifierstratummeasurescore.getValue()));
		}
		/******************** measurereportgroupstratifierstratummeasurescorecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measurereportgroupstratifierstratummeasurescorecomparator = measurereportgroupstratifierstratummeasurescore.getComparator();
		m.setMsrRptGrpStrtfierStratumMsrScoreCmprtr(measurereportgroupstratifierstratummeasurescorecomparator.toCode());

		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratummeasurescore.hasCode()) {
			m.setMsrRptGrpStrtfierStratumMsrScoreCd(String.valueOf(measurereportgroupstratifierstratummeasurescore.getCode()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratummeasurescore.hasSystem()) {
			m.setMsrRptGrpStrtfierStratumMsrScoreSys(String.valueOf(measurereportgroupstratifierstratummeasurescore.getSystem()));
		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Unt ********************************************************************************/
		if(measurereportgroupstratifierstratummeasurescore.hasUnit()) {
			m.setMsrRptGrpStrtfierStratumMsrScoreUnt(String.valueOf(measurereportgroupstratifierstratummeasurescore.getUnit()));
		}
		/******************** measurereportgroupstratifiercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifiercode = measurereportgroupstratifier.getCodeFirstRep();

		/******************** measurereportgroupstratifiercodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding measurereportgroupstratifiercodecoding = measurereportgroupstratifiercode.getCodingFirstRep();

		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifiercodecoding.hasDisplay()) {
			m.setMsrRptGrpStrtfierCdCdgDsply(String.valueOf(measurereportgroupstratifiercodecoding.getDisplay()));
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifiercodecoding.hasVersion()) {
			m.setMsrRptGrpStrtfierCdCdgVrsn(String.valueOf(measurereportgroupstratifiercodecoding.getVersion()));
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifiercodecoding.hasCode()) {
			m.setMsrRptGrpStrtfierCdCdgCd(String.valueOf(measurereportgroupstratifiercodecoding.getCode()));
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifiercodecoding.hasSystem()) {
			m.setMsrRptGrpStrtfierCdCdgSys(String.valueOf(measurereportgroupstratifiercodecoding.getSystem()));
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifiercodecoding.hasUserSelected()) {
			m.setMsrRptGrpStrtfierCdCdgUsrSltd(String.valueOf(measurereportgroupstratifiercodecoding.getUserSelected()));
		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Txt ********************************************************************************/
		if(measurereportgroupstratifiercode.hasText()) {
			m.setMsrRptGrpStrtfierCdTxt(String.valueOf(measurereportgroupstratifiercode.getText()));
		}
		/******************** MsrRpt_Rpter ********************************************************************************/
		if(measurereport.hasReporter()) {
			m.setMsrRptRpter(String.valueOf(measurereport.getReporter()));
		}
		return m;
	}
}
