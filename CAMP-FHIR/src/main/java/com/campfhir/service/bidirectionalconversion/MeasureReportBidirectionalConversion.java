package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MeasureReport;
public class MeasureReportBidirectionalConversion 
{
	public MeasureReport MeasureReports(org.hl7.fhir.r4.model.MeasureReport measurereport) throws ParseException
	{
		 main.java.com.campfhir.model.MeasureReport m = new  main.java.com.campfhir.model.MeasureReport();

		/******************** id ********************************************************************************/
		m.setId(measurereport.getIdElement().getIdPart());

		/******************** measurereporttype ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportType measurereporttype = measurereport.getType();
		if(measurereporttype!=null) {
			m.addMsrRptTyp(measurereporttype.toCode());
		} else {
			m.addMsrRptTyp("NULL");
		}

		/******************** measurereportgroup ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupComponent> measurereportgrouplist = measurereport.getGroup();
		for(int measurereportgroupi = 0; measurereportgroupi<measurereportgrouplist.size();measurereportgroupi++ ) {
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupComponent  measurereportgroup = measurereportgrouplist.get(measurereportgroupi);

		/******************** measurereportgroupcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupcode = measurereportgroup.getCode();

		/******************** MsrRpt_Grp_Cd_Txt ********************************************************************************/
		if(measurereportgroupi == 0) {m.addMsrRptGrpCdTxt("[");}
		if(measurereportgroupcode.hasText()) {

			m.addMsrRptGrpCdTxt(String.valueOf(measurereportgroupcode.getText()));
		} else {
			m.addMsrRptGrpCdTxt("NULL");
		}

		if(measurereportgroupi == measurereportgrouplist.size()-1) {m.addMsrRptGrpCdTxt("]");}


		/******************** measurereportgroupcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurereportgroupcodecodinglist = measurereportgroupcode.getCoding();
		for(int measurereportgroupcodecodingi = 0; measurereportgroupcodecodingi<measurereportgroupcodecodinglist.size();measurereportgroupcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurereportgroupcodecoding = measurereportgroupcodecodinglist.get(measurereportgroupcodecodingi);

		/******************** MsrRpt_Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupcodecodingi == 0) {m.addMsrRptGrpCdCdgDsply("[[");}
		if(measurereportgroupcodecoding.hasDisplay()) {

			m.addMsrRptGrpCdCdgDsply(String.valueOf(measurereportgroupcodecoding.getDisplay()));
		} else {
			m.addMsrRptGrpCdCdgDsply("NULL");
		}

		if(measurereportgroupcodecodingi == measurereportgroupcodecodinglist.size()-1) {m.addMsrRptGrpCdCdgDsply("]]");}


		/******************** MsrRpt_Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupcodecodingi == 0) {m.addMsrRptGrpCdCdgVrsn("[[");}
		if(measurereportgroupcodecoding.hasVersion()) {

			m.addMsrRptGrpCdCdgVrsn(String.valueOf(measurereportgroupcodecoding.getVersion()));
		} else {
			m.addMsrRptGrpCdCdgVrsn("NULL");
		}

		if(measurereportgroupcodecodingi == measurereportgroupcodecodinglist.size()-1) {m.addMsrRptGrpCdCdgVrsn("]]");}


		/******************** MsrRpt_Grp_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgroupcodecodingi == 0) {m.addMsrRptGrpCdCdgCd("[[");}
		if(measurereportgroupcodecoding.hasCode()) {

			m.addMsrRptGrpCdCdgCd(String.valueOf(measurereportgroupcodecoding.getCode()));
		} else {
			m.addMsrRptGrpCdCdgCd("NULL");
		}

		if(measurereportgroupcodecodingi == measurereportgroupcodecodinglist.size()-1) {m.addMsrRptGrpCdCdgCd("]]");}


		/******************** MsrRpt_Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupcodecodingi == 0) {m.addMsrRptGrpCdCdgUsrSltd("[[");}
		if(measurereportgroupcodecoding.hasUserSelected()) {

			m.addMsrRptGrpCdCdgUsrSltd(String.valueOf(measurereportgroupcodecoding.getUserSelected()));
		} else {
			m.addMsrRptGrpCdCdgUsrSltd("NULL");
		}

		if(measurereportgroupcodecodingi == measurereportgroupcodecodinglist.size()-1) {m.addMsrRptGrpCdCdgUsrSltd("]]");}


		/******************** MsrRpt_Grp_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgroupcodecodingi == 0) {m.addMsrRptGrpCdCdgSys("[[");}
		if(measurereportgroupcodecoding.hasSystem()) {

			m.addMsrRptGrpCdCdgSys(String.valueOf(measurereportgroupcodecoding.getSystem()));
		} else {
			m.addMsrRptGrpCdCdgSys("NULL");
		}

		if(measurereportgroupcodecodingi == measurereportgroupcodecodinglist.size()-1) {m.addMsrRptGrpCdCdgSys("]]");}


		 };
		/******************** measurereportgroupmeasurescore ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measurereportgroupmeasurescore = measurereportgroup.getMeasureScore();

		/******************** MsrRpt_Grp_MsrScore_Vl ********************************************************************************/
		if(measurereportgroupi == 0) {m.addMsrRptGrpMsrScoreVl("[");}
		if(measurereportgroupmeasurescore.hasValue()) {

			m.addMsrRptGrpMsrScoreVl(String.valueOf(measurereportgroupmeasurescore.getValue()));
		} else {
			m.addMsrRptGrpMsrScoreVl("NULL");
		}

		if(measurereportgroupi == measurereportgrouplist.size()-1) {m.addMsrRptGrpMsrScoreVl("]");}


		/******************** measurereportgroupmeasurescorecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measurereportgroupmeasurescorecomparator = measurereportgroupmeasurescore.getComparator();
		if(measurereportgroupmeasurescorecomparator!=null) {
		if(measurereportgroupi == 0) {

		m.addMsrRptGrpMsrScoreCmprtr("[");		}
			m.addMsrRptGrpMsrScoreCmprtr(measurereportgroupmeasurescorecomparator.toCode());
		if(measurereportgroupi == measurereportgrouplist.size()-1) {

		m.addMsrRptGrpMsrScoreCmprtr("]");		}

		} else {
			m.addMsrRptGrpMsrScoreCmprtr("NULL");
		}

		/******************** MsrRpt_Grp_MsrScore_Cd ********************************************************************************/
		if(measurereportgroupi == 0) {m.addMsrRptGrpMsrScoreCd("[");}
		if(measurereportgroupmeasurescore.hasCode()) {

			m.addMsrRptGrpMsrScoreCd(String.valueOf(measurereportgroupmeasurescore.getCode()));
		} else {
			m.addMsrRptGrpMsrScoreCd("NULL");
		}

		if(measurereportgroupi == measurereportgrouplist.size()-1) {m.addMsrRptGrpMsrScoreCd("]");}


		/******************** MsrRpt_Grp_MsrScore_Unt ********************************************************************************/
		if(measurereportgroupi == 0) {m.addMsrRptGrpMsrScoreUnt("[");}
		if(measurereportgroupmeasurescore.hasUnit()) {

			m.addMsrRptGrpMsrScoreUnt(String.valueOf(measurereportgroupmeasurescore.getUnit()));
		} else {
			m.addMsrRptGrpMsrScoreUnt("NULL");
		}

		if(measurereportgroupi == measurereportgrouplist.size()-1) {m.addMsrRptGrpMsrScoreUnt("]");}


		/******************** MsrRpt_Grp_MsrScore_Sys ********************************************************************************/
		if(measurereportgroupi == 0) {m.addMsrRptGrpMsrScoreSys("[");}
		if(measurereportgroupmeasurescore.hasSystem()) {

			m.addMsrRptGrpMsrScoreSys(String.valueOf(measurereportgroupmeasurescore.getSystem()));
		} else {
			m.addMsrRptGrpMsrScoreSys("NULL");
		}

		if(measurereportgroupi == measurereportgrouplist.size()-1) {m.addMsrRptGrpMsrScoreSys("]");}


		/******************** measurereportgroupstratifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupStratifierComponent> measurereportgroupstratifierlist = measurereportgroup.getStratifier();
		for(int measurereportgroupstratifieri = 0; measurereportgroupstratifieri<measurereportgroupstratifierlist.size();measurereportgroupstratifieri++ ) {
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupStratifierComponent  measurereportgroupstratifier = measurereportgroupstratifierlist.get(measurereportgroupstratifieri);

		/******************** measurereportgroupstratifiercode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> measurereportgroupstratifiercodelist = measurereportgroupstratifier.getCode();
		for(int measurereportgroupstratifiercodei = 0; measurereportgroupstratifiercodei<measurereportgroupstratifiercodelist.size();measurereportgroupstratifiercodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  measurereportgroupstratifiercode = measurereportgroupstratifiercodelist.get(measurereportgroupstratifiercodei);

		/******************** MsrRpt_Grp_Strtfier_Cd_Txt ********************************************************************************/
		if(measurereportgroupstratifiercodei == 0) {m.addMsrRptGrpStrtfierCdTxt("[[[");}
		if(measurereportgroupstratifiercode.hasText()) {

			m.addMsrRptGrpStrtfierCdTxt(String.valueOf(measurereportgroupstratifiercode.getText()));
		} else {
			m.addMsrRptGrpStrtfierCdTxt("NULL");
		}

		if(measurereportgroupstratifiercodei == measurereportgroupstratifiercodelist.size()-1) {m.addMsrRptGrpStrtfierCdTxt("]]]");}


		/******************** measurereportgroupstratifiercodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurereportgroupstratifiercodecodinglist = measurereportgroupstratifiercode.getCoding();
		for(int measurereportgroupstratifiercodecodingi = 0; measurereportgroupstratifiercodecodingi<measurereportgroupstratifiercodecodinglist.size();measurereportgroupstratifiercodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurereportgroupstratifiercodecoding = measurereportgroupstratifiercodecodinglist.get(measurereportgroupstratifiercodecodingi);

		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifiercodecodingi == 0) {m.addMsrRptGrpStrtfierCdCdgDsply("[[[[");}
		if(measurereportgroupstratifiercodecoding.hasDisplay()) {

			m.addMsrRptGrpStrtfierCdCdgDsply(String.valueOf(measurereportgroupstratifiercodecoding.getDisplay()));
		} else {
			m.addMsrRptGrpStrtfierCdCdgDsply("NULL");
		}

		if(measurereportgroupstratifiercodecodingi == measurereportgroupstratifiercodecodinglist.size()-1) {m.addMsrRptGrpStrtfierCdCdgDsply("]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifiercodecodingi == 0) {m.addMsrRptGrpStrtfierCdCdgVrsn("[[[[");}
		if(measurereportgroupstratifiercodecoding.hasVersion()) {

			m.addMsrRptGrpStrtfierCdCdgVrsn(String.valueOf(measurereportgroupstratifiercodecoding.getVersion()));
		} else {
			m.addMsrRptGrpStrtfierCdCdgVrsn("NULL");
		}

		if(measurereportgroupstratifiercodecodingi == measurereportgroupstratifiercodecodinglist.size()-1) {m.addMsrRptGrpStrtfierCdCdgVrsn("]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifiercodecodingi == 0) {m.addMsrRptGrpStrtfierCdCdgCd("[[[[");}
		if(measurereportgroupstratifiercodecoding.hasCode()) {

			m.addMsrRptGrpStrtfierCdCdgCd(String.valueOf(measurereportgroupstratifiercodecoding.getCode()));
		} else {
			m.addMsrRptGrpStrtfierCdCdgCd("NULL");
		}

		if(measurereportgroupstratifiercodecodingi == measurereportgroupstratifiercodecodinglist.size()-1) {m.addMsrRptGrpStrtfierCdCdgCd("]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifiercodecodingi == 0) {m.addMsrRptGrpStrtfierCdCdgUsrSltd("[[[[");}
		if(measurereportgroupstratifiercodecoding.hasUserSelected()) {

			m.addMsrRptGrpStrtfierCdCdgUsrSltd(String.valueOf(measurereportgroupstratifiercodecoding.getUserSelected()));
		} else {
			m.addMsrRptGrpStrtfierCdCdgUsrSltd("NULL");
		}

		if(measurereportgroupstratifiercodecodingi == measurereportgroupstratifiercodecodinglist.size()-1) {m.addMsrRptGrpStrtfierCdCdgUsrSltd("]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifiercodecodingi == 0) {m.addMsrRptGrpStrtfierCdCdgSys("[[[[");}
		if(measurereportgroupstratifiercodecoding.hasSystem()) {

			m.addMsrRptGrpStrtfierCdCdgSys(String.valueOf(measurereportgroupstratifiercodecoding.getSystem()));
		} else {
			m.addMsrRptGrpStrtfierCdCdgSys("NULL");
		}

		if(measurereportgroupstratifiercodecodingi == measurereportgroupstratifiercodecodinglist.size()-1) {m.addMsrRptGrpStrtfierCdCdgSys("]]]]");}


		 };
		 };
		/******************** measurereportgroupstratifierstratum ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponent> measurereportgroupstratifierstratumlist = measurereportgroupstratifier.getStratum();
		for(int measurereportgroupstratifierstratumi = 0; measurereportgroupstratifierstratumi<measurereportgroupstratifierstratumlist.size();measurereportgroupstratifierstratumi++ ) {
		org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponent  measurereportgroupstratifierstratum = measurereportgroupstratifierstratumlist.get(measurereportgroupstratifierstratumi);

		/******************** measurereportgroupstratifierstratumvalue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumvalue = measurereportgroupstratifierstratum.getValue();

		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Txt ********************************************************************************/
		if(measurereportgroupstratifierstratumi == 0) {m.addMsrRptGrpStrtfierStratumVlTxt("[[[");}
		if(measurereportgroupstratifierstratumvalue.hasText()) {

			m.addMsrRptGrpStrtfierStratumVlTxt(String.valueOf(measurereportgroupstratifierstratumvalue.getText()));
		} else {
			m.addMsrRptGrpStrtfierStratumVlTxt("NULL");
		}

		if(measurereportgroupstratifierstratumi == measurereportgroupstratifierstratumlist.size()-1) {m.addMsrRptGrpStrtfierStratumVlTxt("]]]");}


		/******************** measurereportgroupstratifierstratumvaluecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurereportgroupstratifierstratumvaluecodinglist = measurereportgroupstratifierstratumvalue.getCoding();
		for(int measurereportgroupstratifierstratumvaluecodingi = 0; measurereportgroupstratifierstratumvaluecodingi<measurereportgroupstratifierstratumvaluecodinglist.size();measurereportgroupstratifierstratumvaluecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurereportgroupstratifierstratumvaluecoding = measurereportgroupstratifierstratumvaluecodinglist.get(measurereportgroupstratifierstratumvaluecodingi);

		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumVlCdgDsply("[[[[");}
		if(measurereportgroupstratifierstratumvaluecoding.hasDisplay()) {

			m.addMsrRptGrpStrtfierStratumVlCdgDsply(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getDisplay()));
		} else {
			m.addMsrRptGrpStrtfierStratumVlCdgDsply("NULL");
		}

		if(measurereportgroupstratifierstratumvaluecodingi == measurereportgroupstratifierstratumvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumVlCdgDsply("]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumVlCdgVrsn("[[[[");}
		if(measurereportgroupstratifierstratumvaluecoding.hasVersion()) {

			m.addMsrRptGrpStrtfierStratumVlCdgVrsn(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getVersion()));
		} else {
			m.addMsrRptGrpStrtfierStratumVlCdgVrsn("NULL");
		}

		if(measurereportgroupstratifierstratumvaluecodingi == measurereportgroupstratifierstratumvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumVlCdgVrsn("]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumVlCdgCd("[[[[");}
		if(measurereportgroupstratifierstratumvaluecoding.hasCode()) {

			m.addMsrRptGrpStrtfierStratumVlCdgCd(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getCode()));
		} else {
			m.addMsrRptGrpStrtfierStratumVlCdgCd("NULL");
		}

		if(measurereportgroupstratifierstratumvaluecodingi == measurereportgroupstratifierstratumvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumVlCdgCd("]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumVlCdgUsrSltd("[[[[");}
		if(measurereportgroupstratifierstratumvaluecoding.hasUserSelected()) {

			m.addMsrRptGrpStrtfierStratumVlCdgUsrSltd(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getUserSelected()));
		} else {
			m.addMsrRptGrpStrtfierStratumVlCdgUsrSltd("NULL");
		}

		if(measurereportgroupstratifierstratumvaluecodingi == measurereportgroupstratifierstratumvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumVlCdgUsrSltd("]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratumvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumVlCdgSys("[[[[");}
		if(measurereportgroupstratifierstratumvaluecoding.hasSystem()) {

			m.addMsrRptGrpStrtfierStratumVlCdgSys(String.valueOf(measurereportgroupstratifierstratumvaluecoding.getSystem()));
		} else {
			m.addMsrRptGrpStrtfierStratumVlCdgSys("NULL");
		}

		if(measurereportgroupstratifierstratumvaluecodingi == measurereportgroupstratifierstratumvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumVlCdgSys("]]]]");}


		 };
		/******************** measurereportgroupstratifierstratummeasurescore ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity measurereportgroupstratifierstratummeasurescore = measurereportgroupstratifierstratum.getMeasureScore();

		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Vl ********************************************************************************/
		if(measurereportgroupstratifierstratumi == 0) {m.addMsrRptGrpStrtfierStratumMsrScoreVl("[[[");}
		if(measurereportgroupstratifierstratummeasurescore.hasValue()) {

			m.addMsrRptGrpStrtfierStratumMsrScoreVl(String.valueOf(measurereportgroupstratifierstratummeasurescore.getValue()));
		} else {
			m.addMsrRptGrpStrtfierStratumMsrScoreVl("NULL");
		}

		if(measurereportgroupstratifierstratumi == measurereportgroupstratifierstratumlist.size()-1) {m.addMsrRptGrpStrtfierStratumMsrScoreVl("]]]");}


		/******************** measurereportgroupstratifierstratummeasurescorecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator measurereportgroupstratifierstratummeasurescorecomparator = measurereportgroupstratifierstratummeasurescore.getComparator();
		if(measurereportgroupstratifierstratummeasurescorecomparator!=null) {
		if(measurereportgroupstratifierstratumi == 0) {

		m.addMsrRptGrpStrtfierStratumMsrScoreCmprtr("[[[");		}
			m.addMsrRptGrpStrtfierStratumMsrScoreCmprtr(measurereportgroupstratifierstratummeasurescorecomparator.toCode());
		if(measurereportgroupstratifierstratumi == measurereportgroupstratifierstratumlist.size()-1) {

		m.addMsrRptGrpStrtfierStratumMsrScoreCmprtr("]]]");		}

		} else {
			m.addMsrRptGrpStrtfierStratumMsrScoreCmprtr("NULL");
		}

		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratumi == 0) {m.addMsrRptGrpStrtfierStratumMsrScoreCd("[[[");}
		if(measurereportgroupstratifierstratummeasurescore.hasCode()) {

			m.addMsrRptGrpStrtfierStratumMsrScoreCd(String.valueOf(measurereportgroupstratifierstratummeasurescore.getCode()));
		} else {
			m.addMsrRptGrpStrtfierStratumMsrScoreCd("NULL");
		}

		if(measurereportgroupstratifierstratumi == measurereportgroupstratifierstratumlist.size()-1) {m.addMsrRptGrpStrtfierStratumMsrScoreCd("]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Unt ********************************************************************************/
		if(measurereportgroupstratifierstratumi == 0) {m.addMsrRptGrpStrtfierStratumMsrScoreUnt("[[[");}
		if(measurereportgroupstratifierstratummeasurescore.hasUnit()) {

			m.addMsrRptGrpStrtfierStratumMsrScoreUnt(String.valueOf(measurereportgroupstratifierstratummeasurescore.getUnit()));
		} else {
			m.addMsrRptGrpStrtfierStratumMsrScoreUnt("NULL");
		}

		if(measurereportgroupstratifierstratumi == measurereportgroupstratifierstratumlist.size()-1) {m.addMsrRptGrpStrtfierStratumMsrScoreUnt("]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratumi == 0) {m.addMsrRptGrpStrtfierStratumMsrScoreSys("[[[");}
		if(measurereportgroupstratifierstratummeasurescore.hasSystem()) {

			m.addMsrRptGrpStrtfierStratumMsrScoreSys(String.valueOf(measurereportgroupstratifierstratummeasurescore.getSystem()));
		} else {
			m.addMsrRptGrpStrtfierStratumMsrScoreSys("NULL");
		}

		if(measurereportgroupstratifierstratumi == measurereportgroupstratifierstratumlist.size()-1) {m.addMsrRptGrpStrtfierStratumMsrScoreSys("]]]");}


		/******************** measurereportgroupstratifierstratumpopulation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MeasureReport.StratifierGroupPopulationComponent> measurereportgroupstratifierstratumpopulationlist = measurereportgroupstratifierstratum.getPopulation();
		for(int measurereportgroupstratifierstratumpopulationi = 0; measurereportgroupstratifierstratumpopulationi<measurereportgroupstratifierstratumpopulationlist.size();measurereportgroupstratifierstratumpopulationi++ ) {
		org.hl7.fhir.r4.model.MeasureReport.StratifierGroupPopulationComponent  measurereportgroupstratifierstratumpopulation = measurereportgroupstratifierstratumpopulationlist.get(measurereportgroupstratifierstratumpopulationi);

		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cnt ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationi == 0) {m.addMsrRptGrpStrtfierStratumPoplnCnt("[[[[");}
		if(measurereportgroupstratifierstratumpopulation.hasCount()) {

			m.addMsrRptGrpStrtfierStratumPoplnCnt(String.valueOf(measurereportgroupstratifierstratumpopulation.getCount()));
		} else {
			m.addMsrRptGrpStrtfierStratumPoplnCnt("NULL");
		}

		if(measurereportgroupstratifierstratumpopulationi == measurereportgroupstratifierstratumpopulationlist.size()-1) {m.addMsrRptGrpStrtfierStratumPoplnCnt("]]]]");}


		/******************** measurereportgroupstratifierstratumpopulationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumpopulationcode = measurereportgroupstratifierstratumpopulation.getCode();

		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Txt ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationi == 0) {m.addMsrRptGrpStrtfierStratumPoplnCdTxt("[[[[");}
		if(measurereportgroupstratifierstratumpopulationcode.hasText()) {

			m.addMsrRptGrpStrtfierStratumPoplnCdTxt(String.valueOf(measurereportgroupstratifierstratumpopulationcode.getText()));
		} else {
			m.addMsrRptGrpStrtfierStratumPoplnCdTxt("NULL");
		}

		if(measurereportgroupstratifierstratumpopulationi == measurereportgroupstratifierstratumpopulationlist.size()-1) {m.addMsrRptGrpStrtfierStratumPoplnCdTxt("]]]]");}


		/******************** measurereportgroupstratifierstratumpopulationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurereportgroupstratifierstratumpopulationcodecodinglist = measurereportgroupstratifierstratumpopulationcode.getCoding();
		for(int measurereportgroupstratifierstratumpopulationcodecodingi = 0; measurereportgroupstratifierstratumpopulationcodecodingi<measurereportgroupstratifierstratumpopulationcodecodinglist.size();measurereportgroupstratifierstratumpopulationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurereportgroupstratifierstratumpopulationcodecoding = measurereportgroupstratifierstratumpopulationcodecodinglist.get(measurereportgroupstratifierstratumpopulationcodecodingi);

		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgDsply("[[[[[");}
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasDisplay()) {

			m.addMsrRptGrpStrtfierStratumPoplnCdCdgDsply(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getDisplay()));
		} else {
			m.addMsrRptGrpStrtfierStratumPoplnCdCdgDsply("NULL");
		}

		if(measurereportgroupstratifierstratumpopulationcodecodingi == measurereportgroupstratifierstratumpopulationcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgDsply("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgVrsn("[[[[[");}
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasVersion()) {

			m.addMsrRptGrpStrtfierStratumPoplnCdCdgVrsn(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getVersion()));
		} else {
			m.addMsrRptGrpStrtfierStratumPoplnCdCdgVrsn("NULL");
		}

		if(measurereportgroupstratifierstratumpopulationcodecodingi == measurereportgroupstratifierstratumpopulationcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgVrsn("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgCd("[[[[[");}
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasCode()) {

			m.addMsrRptGrpStrtfierStratumPoplnCdCdgCd(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getCode()));
		} else {
			m.addMsrRptGrpStrtfierStratumPoplnCdCdgCd("NULL");
		}

		if(measurereportgroupstratifierstratumpopulationcodecodingi == measurereportgroupstratifierstratumpopulationcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgCd("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd("[[[[[");}
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasUserSelected()) {

			m.addMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getUserSelected()));
		} else {
			m.addMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd("NULL");
		}

		if(measurereportgroupstratifierstratumpopulationcodecodingi == measurereportgroupstratifierstratumpopulationcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgSys("[[[[[");}
		if(measurereportgroupstratifierstratumpopulationcodecoding.hasSystem()) {

			m.addMsrRptGrpStrtfierStratumPoplnCdCdgSys(String.valueOf(measurereportgroupstratifierstratumpopulationcodecoding.getSystem()));
		} else {
			m.addMsrRptGrpStrtfierStratumPoplnCdCdgSys("NULL");
		}

		if(measurereportgroupstratifierstratumpopulationcodecodingi == measurereportgroupstratifierstratumpopulationcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumPoplnCdCdgSys("]]]]]");}


		 };
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_SbjctRslts ********************************************************************************/
		if(measurereportgroupstratifierstratumpopulationi == 0) {m.addMsrRptGrpStrtfierStratumPoplnSbjctRslts("[[[[");}
		if(measurereportgroupstratifierstratumpopulation.hasSubjectResults()) {

			if(measurereportgroupstratifierstratumpopulation.getSubjectResults().getReference() != null) {
			m.addMsrRptGrpStrtfierStratumPoplnSbjctRslts(measurereportgroupstratifierstratumpopulation.getSubjectResults().getReference());
			}
		} else {
			m.addMsrRptGrpStrtfierStratumPoplnSbjctRslts("NULL");
		}

		if(measurereportgroupstratifierstratumpopulationi == measurereportgroupstratifierstratumpopulationlist.size()-1) {m.addMsrRptGrpStrtfierStratumPoplnSbjctRslts("]]]]");}


		 };
		/******************** measurereportgroupstratifierstratumcomponent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponentComponent> measurereportgroupstratifierstratumcomponentlist = measurereportgroupstratifierstratum.getComponent();
		for(int measurereportgroupstratifierstratumcomponenti = 0; measurereportgroupstratifierstratumcomponenti<measurereportgroupstratifierstratumcomponentlist.size();measurereportgroupstratifierstratumcomponenti++ ) {
		org.hl7.fhir.r4.model.MeasureReport.StratifierGroupComponentComponent  measurereportgroupstratifierstratumcomponent = measurereportgroupstratifierstratumcomponentlist.get(measurereportgroupstratifierstratumcomponenti);

		/******************** measurereportgroupstratifierstratumcomponentvalue ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumcomponentvalue = measurereportgroupstratifierstratumcomponent.getValue();

		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Txt ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponenti == 0) {m.addMsrRptGrpStrtfierStratumCmpntVlTxt("[[[[");}
		if(measurereportgroupstratifierstratumcomponentvalue.hasText()) {

			m.addMsrRptGrpStrtfierStratumCmpntVlTxt(String.valueOf(measurereportgroupstratifierstratumcomponentvalue.getText()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntVlTxt("NULL");
		}

		if(measurereportgroupstratifierstratumcomponenti == measurereportgroupstratifierstratumcomponentlist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntVlTxt("]]]]");}


		/******************** measurereportgroupstratifierstratumcomponentvaluecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurereportgroupstratifierstratumcomponentvaluecodinglist = measurereportgroupstratifierstratumcomponentvalue.getCoding();
		for(int measurereportgroupstratifierstratumcomponentvaluecodingi = 0; measurereportgroupstratifierstratumcomponentvaluecodingi<measurereportgroupstratifierstratumcomponentvaluecodinglist.size();measurereportgroupstratifierstratumcomponentvaluecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurereportgroupstratifierstratumcomponentvaluecoding = measurereportgroupstratifierstratumcomponentvaluecodinglist.get(measurereportgroupstratifierstratumcomponentvaluecodingi);

		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgDsply("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasDisplay()) {

			m.addMsrRptGrpStrtfierStratumCmpntVlCdgDsply(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getDisplay()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntVlCdgDsply("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentvaluecodingi == measurereportgroupstratifierstratumcomponentvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgDsply("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgVrsn("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasVersion()) {

			m.addMsrRptGrpStrtfierStratumCmpntVlCdgVrsn(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getVersion()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntVlCdgVrsn("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentvaluecodingi == measurereportgroupstratifierstratumcomponentvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgVrsn("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgCd("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasCode()) {

			m.addMsrRptGrpStrtfierStratumCmpntVlCdgCd(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getCode()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntVlCdgCd("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentvaluecodingi == measurereportgroupstratifierstratumcomponentvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgCd("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasUserSelected()) {

			m.addMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getUserSelected()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentvaluecodingi == measurereportgroupstratifierstratumcomponentvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentvaluecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgSys("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentvaluecoding.hasSystem()) {

			m.addMsrRptGrpStrtfierStratumCmpntVlCdgSys(String.valueOf(measurereportgroupstratifierstratumcomponentvaluecoding.getSystem()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntVlCdgSys("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentvaluecodingi == measurereportgroupstratifierstratumcomponentvaluecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntVlCdgSys("]]]]]");}


		 };
		/******************** measurereportgroupstratifierstratumcomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgroupstratifierstratumcomponentcode = measurereportgroupstratifierstratumcomponent.getCode();

		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Txt ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponenti == 0) {m.addMsrRptGrpStrtfierStratumCmpntCdTxt("[[[[");}
		if(measurereportgroupstratifierstratumcomponentcode.hasText()) {

			m.addMsrRptGrpStrtfierStratumCmpntCdTxt(String.valueOf(measurereportgroupstratifierstratumcomponentcode.getText()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntCdTxt("NULL");
		}

		if(measurereportgroupstratifierstratumcomponenti == measurereportgroupstratifierstratumcomponentlist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntCdTxt("]]]]");}


		/******************** measurereportgroupstratifierstratumcomponentcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurereportgroupstratifierstratumcomponentcodecodinglist = measurereportgroupstratifierstratumcomponentcode.getCoding();
		for(int measurereportgroupstratifierstratumcomponentcodecodingi = 0; measurereportgroupstratifierstratumcomponentcodecodingi<measurereportgroupstratifierstratumcomponentcodecodinglist.size();measurereportgroupstratifierstratumcomponentcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurereportgroupstratifierstratumcomponentcodecoding = measurereportgroupstratifierstratumcomponentcodecodinglist.get(measurereportgroupstratifierstratumcomponentcodecodingi);

		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgDsply("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasDisplay()) {

			m.addMsrRptGrpStrtfierStratumCmpntCdCdgDsply(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getDisplay()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntCdCdgDsply("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentcodecodingi == measurereportgroupstratifierstratumcomponentcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgDsply("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgVrsn("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasVersion()) {

			m.addMsrRptGrpStrtfierStratumCmpntCdCdgVrsn(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getVersion()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntCdCdgVrsn("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentcodecodingi == measurereportgroupstratifierstratumcomponentcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgVrsn("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgCd("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasCode()) {

			m.addMsrRptGrpStrtfierStratumCmpntCdCdgCd(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getCode()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntCdCdgCd("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentcodecodingi == measurereportgroupstratifierstratumcomponentcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgCd("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasUserSelected()) {

			m.addMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getUserSelected()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentcodecodingi == measurereportgroupstratifierstratumcomponentcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd("]]]]]");}


		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgroupstratifierstratumcomponentcodecodingi == 0) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgSys("[[[[[");}
		if(measurereportgroupstratifierstratumcomponentcodecoding.hasSystem()) {

			m.addMsrRptGrpStrtfierStratumCmpntCdCdgSys(String.valueOf(measurereportgroupstratifierstratumcomponentcodecoding.getSystem()));
		} else {
			m.addMsrRptGrpStrtfierStratumCmpntCdCdgSys("NULL");
		}

		if(measurereportgroupstratifierstratumcomponentcodecodingi == measurereportgroupstratifierstratumcomponentcodecodinglist.size()-1) {m.addMsrRptGrpStrtfierStratumCmpntCdCdgSys("]]]]]");}


		 };
		 };
		 };
		 };
		/******************** measurereportgrouppopulation ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupPopulationComponent> measurereportgrouppopulationlist = measurereportgroup.getPopulation();
		for(int measurereportgrouppopulationi = 0; measurereportgrouppopulationi<measurereportgrouppopulationlist.size();measurereportgrouppopulationi++ ) {
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportGroupPopulationComponent  measurereportgrouppopulation = measurereportgrouppopulationlist.get(measurereportgrouppopulationi);

		/******************** MsrRpt_Grp_Popln_Cnt ********************************************************************************/
		if(measurereportgrouppopulationi == 0) {m.addMsrRptGrpPoplnCnt("[[");}
		if(measurereportgrouppopulation.hasCount()) {

			m.addMsrRptGrpPoplnCnt(String.valueOf(measurereportgrouppopulation.getCount()));
		} else {
			m.addMsrRptGrpPoplnCnt("NULL");
		}

		if(measurereportgrouppopulationi == measurereportgrouppopulationlist.size()-1) {m.addMsrRptGrpPoplnCnt("]]");}


		/******************** measurereportgrouppopulationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportgrouppopulationcode = measurereportgrouppopulation.getCode();

		/******************** MsrRpt_Grp_Popln_Cd_Txt ********************************************************************************/
		if(measurereportgrouppopulationi == 0) {m.addMsrRptGrpPoplnCdTxt("[[");}
		if(measurereportgrouppopulationcode.hasText()) {

			m.addMsrRptGrpPoplnCdTxt(String.valueOf(measurereportgrouppopulationcode.getText()));
		} else {
			m.addMsrRptGrpPoplnCdTxt("NULL");
		}

		if(measurereportgrouppopulationi == measurereportgrouppopulationlist.size()-1) {m.addMsrRptGrpPoplnCdTxt("]]");}


		/******************** measurereportgrouppopulationcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurereportgrouppopulationcodecodinglist = measurereportgrouppopulationcode.getCoding();
		for(int measurereportgrouppopulationcodecodingi = 0; measurereportgrouppopulationcodecodingi<measurereportgrouppopulationcodecodinglist.size();measurereportgrouppopulationcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurereportgrouppopulationcodecoding = measurereportgrouppopulationcodecodinglist.get(measurereportgrouppopulationcodecodingi);

		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(measurereportgrouppopulationcodecodingi == 0) {m.addMsrRptGrpPoplnCdCdgDsply("[[[");}
		if(measurereportgrouppopulationcodecoding.hasDisplay()) {

			m.addMsrRptGrpPoplnCdCdgDsply(String.valueOf(measurereportgrouppopulationcodecoding.getDisplay()));
		} else {
			m.addMsrRptGrpPoplnCdCdgDsply("NULL");
		}

		if(measurereportgrouppopulationcodecodingi == measurereportgrouppopulationcodecodinglist.size()-1) {m.addMsrRptGrpPoplnCdCdgDsply("]]]");}


		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(measurereportgrouppopulationcodecodingi == 0) {m.addMsrRptGrpPoplnCdCdgVrsn("[[[");}
		if(measurereportgrouppopulationcodecoding.hasVersion()) {

			m.addMsrRptGrpPoplnCdCdgVrsn(String.valueOf(measurereportgrouppopulationcodecoding.getVersion()));
		} else {
			m.addMsrRptGrpPoplnCdCdgVrsn("NULL");
		}

		if(measurereportgrouppopulationcodecodingi == measurereportgrouppopulationcodecodinglist.size()-1) {m.addMsrRptGrpPoplnCdCdgVrsn("]]]");}


		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(measurereportgrouppopulationcodecodingi == 0) {m.addMsrRptGrpPoplnCdCdgCd("[[[");}
		if(measurereportgrouppopulationcodecoding.hasCode()) {

			m.addMsrRptGrpPoplnCdCdgCd(String.valueOf(measurereportgrouppopulationcodecoding.getCode()));
		} else {
			m.addMsrRptGrpPoplnCdCdgCd("NULL");
		}

		if(measurereportgrouppopulationcodecodingi == measurereportgrouppopulationcodecodinglist.size()-1) {m.addMsrRptGrpPoplnCdCdgCd("]]]");}


		/******************** MsrRpt_Grp_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(measurereportgrouppopulationcodecodingi == 0) {m.addMsrRptGrpPoplnCdCdgUsrSltd("[[[");}
		if(measurereportgrouppopulationcodecoding.hasUserSelected()) {

			m.addMsrRptGrpPoplnCdCdgUsrSltd(String.valueOf(measurereportgrouppopulationcodecoding.getUserSelected()));
		} else {
			m.addMsrRptGrpPoplnCdCdgUsrSltd("NULL");
		}

		if(measurereportgrouppopulationcodecodingi == measurereportgrouppopulationcodecodinglist.size()-1) {m.addMsrRptGrpPoplnCdCdgUsrSltd("]]]");}


		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(measurereportgrouppopulationcodecodingi == 0) {m.addMsrRptGrpPoplnCdCdgSys("[[[");}
		if(measurereportgrouppopulationcodecoding.hasSystem()) {

			m.addMsrRptGrpPoplnCdCdgSys(String.valueOf(measurereportgrouppopulationcodecoding.getSystem()));
		} else {
			m.addMsrRptGrpPoplnCdCdgSys("NULL");
		}

		if(measurereportgrouppopulationcodecodingi == measurereportgrouppopulationcodecodinglist.size()-1) {m.addMsrRptGrpPoplnCdCdgSys("]]]");}


		 };
		/******************** MsrRpt_Grp_Popln_SbjctRslts ********************************************************************************/
		if(measurereportgrouppopulationi == 0) {m.addMsrRptGrpPoplnSbjctRslts("[[");}
		if(measurereportgrouppopulation.hasSubjectResults()) {

			if(measurereportgrouppopulation.getSubjectResults().getReference() != null) {
			m.addMsrRptGrpPoplnSbjctRslts(measurereportgrouppopulation.getSubjectResults().getReference());
			}
		} else {
			m.addMsrRptGrpPoplnSbjctRslts("NULL");
		}

		if(measurereportgrouppopulationi == measurereportgrouppopulationlist.size()-1) {m.addMsrRptGrpPoplnSbjctRslts("]]");}


		 };
		 };
		/******************** MsrRpt_Dt ********************************************************************************/
		if(measurereport.hasDate()) {

			m.addMsrRptDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurereport.getDate())+"\"");
		} else {
			m.addMsrRptDt("NULL");
		}


		/******************** MsrRpt_Sbjct ********************************************************************************/
		if(measurereport.hasSubject()) {

			if(measurereport.getSubject().getReference() != null) {
			m.addMsrRptSbjct(measurereport.getSubject().getReference());
			}
		} else {
			m.addMsrRptSbjct("NULL");
		}


		/******************** measurereportstatus ********************************************************************************/
		org.hl7.fhir.r4.model.MeasureReport.MeasureReportStatus measurereportstatus = measurereport.getStatus();
		if(measurereportstatus!=null) {
			m.addMsrRptSts(measurereportstatus.toCode());
		} else {
			m.addMsrRptSts("NULL");
		}

		/******************** measurereportperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurereportperiod = measurereport.getPeriod();

		/******************** MsrRpt_Prd_Strt ********************************************************************************/
		if(measurereportperiod.hasStart()) {

			m.addMsrRptPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurereportperiod.getStart())+"\"");
		} else {
			m.addMsrRptPrdStrt("NULL");
		}


		/******************** MsrRpt_Prd_End ********************************************************************************/
		if(measurereportperiod.hasEnd()) {

			m.addMsrRptPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurereportperiod.getEnd())+"\"");
		} else {
			m.addMsrRptPrdEnd("NULL");
		}


		/******************** measurereportidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> measurereportidentifierlist = measurereport.getIdentifier();
		for(int measurereportidentifieri = 0; measurereportidentifieri<measurereportidentifierlist.size();measurereportidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  measurereportidentifier = measurereportidentifierlist.get(measurereportidentifieri);

		/******************** MsrRpt_Id_Vl ********************************************************************************/
		if(measurereportidentifieri == 0) {m.addMsrRptIdVl("[");}
		if(measurereportidentifier.hasValue()) {

			m.addMsrRptIdVl(String.valueOf(measurereportidentifier.getValue()));
		} else {
			m.addMsrRptIdVl("NULL");
		}

		if(measurereportidentifieri == measurereportidentifierlist.size()-1) {m.addMsrRptIdVl("]");}


		/******************** measurereportidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportidentifiertype = measurereportidentifier.getType();

		/******************** MsrRpt_Id_Typ_Txt ********************************************************************************/
		if(measurereportidentifieri == 0) {m.addMsrRptIdTypTxt("[");}
		if(measurereportidentifiertype.hasText()) {

			m.addMsrRptIdTypTxt(String.valueOf(measurereportidentifiertype.getText()));
		} else {
			m.addMsrRptIdTypTxt("NULL");
		}

		if(measurereportidentifieri == measurereportidentifierlist.size()-1) {m.addMsrRptIdTypTxt("]");}


		/******************** measurereportidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurereportidentifiertypecodinglist = measurereportidentifiertype.getCoding();
		for(int measurereportidentifiertypecodingi = 0; measurereportidentifiertypecodingi<measurereportidentifiertypecodinglist.size();measurereportidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurereportidentifiertypecoding = measurereportidentifiertypecodinglist.get(measurereportidentifiertypecodingi);

		/******************** MsrRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(measurereportidentifiertypecodingi == 0) {m.addMsrRptIdTypCdgDsply("[[");}
		if(measurereportidentifiertypecoding.hasDisplay()) {

			m.addMsrRptIdTypCdgDsply(String.valueOf(measurereportidentifiertypecoding.getDisplay()));
		} else {
			m.addMsrRptIdTypCdgDsply("NULL");
		}

		if(measurereportidentifiertypecodingi == measurereportidentifiertypecodinglist.size()-1) {m.addMsrRptIdTypCdgDsply("]]");}


		/******************** MsrRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(measurereportidentifiertypecodingi == 0) {m.addMsrRptIdTypCdgVrsn("[[");}
		if(measurereportidentifiertypecoding.hasVersion()) {

			m.addMsrRptIdTypCdgVrsn(String.valueOf(measurereportidentifiertypecoding.getVersion()));
		} else {
			m.addMsrRptIdTypCdgVrsn("NULL");
		}

		if(measurereportidentifiertypecodingi == measurereportidentifiertypecodinglist.size()-1) {m.addMsrRptIdTypCdgVrsn("]]");}


		/******************** MsrRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(measurereportidentifiertypecodingi == 0) {m.addMsrRptIdTypCdgCd("[[");}
		if(measurereportidentifiertypecoding.hasCode()) {

			m.addMsrRptIdTypCdgCd(String.valueOf(measurereportidentifiertypecoding.getCode()));
		} else {
			m.addMsrRptIdTypCdgCd("NULL");
		}

		if(measurereportidentifiertypecodingi == measurereportidentifiertypecodinglist.size()-1) {m.addMsrRptIdTypCdgCd("]]");}


		/******************** MsrRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(measurereportidentifiertypecodingi == 0) {m.addMsrRptIdTypCdgUsrSltd("[[");}
		if(measurereportidentifiertypecoding.hasUserSelected()) {

			m.addMsrRptIdTypCdgUsrSltd(String.valueOf(measurereportidentifiertypecoding.getUserSelected()));
		} else {
			m.addMsrRptIdTypCdgUsrSltd("NULL");
		}

		if(measurereportidentifiertypecodingi == measurereportidentifiertypecodinglist.size()-1) {m.addMsrRptIdTypCdgUsrSltd("]]");}


		/******************** MsrRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(measurereportidentifiertypecodingi == 0) {m.addMsrRptIdTypCdgSys("[[");}
		if(measurereportidentifiertypecoding.hasSystem()) {

			m.addMsrRptIdTypCdgSys(String.valueOf(measurereportidentifiertypecoding.getSystem()));
		} else {
			m.addMsrRptIdTypCdgSys("NULL");
		}

		if(measurereportidentifiertypecodingi == measurereportidentifiertypecodinglist.size()-1) {m.addMsrRptIdTypCdgSys("]]");}


		 };
		/******************** measurereportidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period measurereportidentifierperiod = measurereportidentifier.getPeriod();

		/******************** MsrRpt_Id_Prd_Strt ********************************************************************************/
		if(measurereportidentifieri == 0) {m.addMsrRptIdPrdStrt("[");}
		if(measurereportidentifierperiod.hasStart()) {

			m.addMsrRptIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurereportidentifierperiod.getStart())+"\"");
		} else {
			m.addMsrRptIdPrdStrt("NULL");
		}

		if(measurereportidentifieri == measurereportidentifierlist.size()-1) {m.addMsrRptIdPrdStrt("]");}


		/******************** MsrRpt_Id_Prd_End ********************************************************************************/
		if(measurereportidentifieri == 0) {m.addMsrRptIdPrdEnd("[");}
		if(measurereportidentifierperiod.hasEnd()) {

			m.addMsrRptIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(measurereportidentifierperiod.getEnd())+"\"");
		} else {
			m.addMsrRptIdPrdEnd("NULL");
		}

		if(measurereportidentifieri == measurereportidentifierlist.size()-1) {m.addMsrRptIdPrdEnd("]");}


		/******************** measurereportidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse measurereportidentifieruse = measurereportidentifier.getUse();
		if(measurereportidentifieruse!=null) {
		if(measurereportidentifieri == 0) {

		m.addMsrRptIdUse("[");		}
			m.addMsrRptIdUse(measurereportidentifieruse.toCode());
		if(measurereportidentifieri == measurereportidentifierlist.size()-1) {

		m.addMsrRptIdUse("]");		}

		} else {
			m.addMsrRptIdUse("NULL");
		}

		/******************** MsrRpt_Id_Assigner ********************************************************************************/
		if(measurereportidentifieri == 0) {m.addMsrRptIdAssigner("[");}
		if(measurereportidentifier.hasAssigner()) {

			if(measurereportidentifier.getAssigner().getReference() != null) {
			m.addMsrRptIdAssigner(measurereportidentifier.getAssigner().getReference());
			}
		} else {
			m.addMsrRptIdAssigner("NULL");
		}

		if(measurereportidentifieri == measurereportidentifierlist.size()-1) {m.addMsrRptIdAssigner("]");}


		/******************** MsrRpt_Id_Sys ********************************************************************************/
		if(measurereportidentifieri == 0) {m.addMsrRptIdSys("[");}
		if(measurereportidentifier.hasSystem()) {

			m.addMsrRptIdSys(String.valueOf(measurereportidentifier.getSystem()));
		} else {
			m.addMsrRptIdSys("NULL");
		}

		if(measurereportidentifieri == measurereportidentifierlist.size()-1) {m.addMsrRptIdSys("]");}


		 };
		/******************** measurereportimprovementnotation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept measurereportimprovementnotation = measurereport.getImprovementNotation();

		/******************** MsrRpt_ImprovementNotation_Txt ********************************************************************************/
		if(measurereportimprovementnotation.hasText()) {

			m.addMsrRptImprovementNotationTxt(String.valueOf(measurereportimprovementnotation.getText()));
		} else {
			m.addMsrRptImprovementNotationTxt("NULL");
		}


		/******************** measurereportimprovementnotationcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> measurereportimprovementnotationcodinglist = measurereportimprovementnotation.getCoding();
		for(int measurereportimprovementnotationcodingi = 0; measurereportimprovementnotationcodingi<measurereportimprovementnotationcodinglist.size();measurereportimprovementnotationcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  measurereportimprovementnotationcoding = measurereportimprovementnotationcodinglist.get(measurereportimprovementnotationcodingi);

		/******************** MsrRpt_ImprovementNotation_Cdg_Dsply ********************************************************************************/
		if(measurereportimprovementnotationcodingi == 0) {m.addMsrRptImprovementNotationCdgDsply("[");}
		if(measurereportimprovementnotationcoding.hasDisplay()) {

			m.addMsrRptImprovementNotationCdgDsply(String.valueOf(measurereportimprovementnotationcoding.getDisplay()));
		} else {
			m.addMsrRptImprovementNotationCdgDsply("NULL");
		}

		if(measurereportimprovementnotationcodingi == measurereportimprovementnotationcodinglist.size()-1) {m.addMsrRptImprovementNotationCdgDsply("]");}


		/******************** MsrRpt_ImprovementNotation_Cdg_Vrsn ********************************************************************************/
		if(measurereportimprovementnotationcodingi == 0) {m.addMsrRptImprovementNotationCdgVrsn("[");}
		if(measurereportimprovementnotationcoding.hasVersion()) {

			m.addMsrRptImprovementNotationCdgVrsn(String.valueOf(measurereportimprovementnotationcoding.getVersion()));
		} else {
			m.addMsrRptImprovementNotationCdgVrsn("NULL");
		}

		if(measurereportimprovementnotationcodingi == measurereportimprovementnotationcodinglist.size()-1) {m.addMsrRptImprovementNotationCdgVrsn("]");}


		/******************** MsrRpt_ImprovementNotation_Cdg_Cd ********************************************************************************/
		if(measurereportimprovementnotationcodingi == 0) {m.addMsrRptImprovementNotationCdgCd("[");}
		if(measurereportimprovementnotationcoding.hasCode()) {

			m.addMsrRptImprovementNotationCdgCd(String.valueOf(measurereportimprovementnotationcoding.getCode()));
		} else {
			m.addMsrRptImprovementNotationCdgCd("NULL");
		}

		if(measurereportimprovementnotationcodingi == measurereportimprovementnotationcodinglist.size()-1) {m.addMsrRptImprovementNotationCdgCd("]");}


		/******************** MsrRpt_ImprovementNotation_Cdg_UsrSltd ********************************************************************************/
		if(measurereportimprovementnotationcodingi == 0) {m.addMsrRptImprovementNotationCdgUsrSltd("[");}
		if(measurereportimprovementnotationcoding.hasUserSelected()) {

			m.addMsrRptImprovementNotationCdgUsrSltd(String.valueOf(measurereportimprovementnotationcoding.getUserSelected()));
		} else {
			m.addMsrRptImprovementNotationCdgUsrSltd("NULL");
		}

		if(measurereportimprovementnotationcodingi == measurereportimprovementnotationcodinglist.size()-1) {m.addMsrRptImprovementNotationCdgUsrSltd("]");}


		/******************** MsrRpt_ImprovementNotation_Cdg_Sys ********************************************************************************/
		if(measurereportimprovementnotationcodingi == 0) {m.addMsrRptImprovementNotationCdgSys("[");}
		if(measurereportimprovementnotationcoding.hasSystem()) {

			m.addMsrRptImprovementNotationCdgSys(String.valueOf(measurereportimprovementnotationcoding.getSystem()));
		} else {
			m.addMsrRptImprovementNotationCdgSys("NULL");
		}

		if(measurereportimprovementnotationcodingi == measurereportimprovementnotationcodinglist.size()-1) {m.addMsrRptImprovementNotationCdgSys("]");}


		 };
		/******************** MsrRpt_Msr ********************************************************************************/
		if(measurereport.hasMeasure()) {

			m.addMsrRptMsr(String.valueOf(measurereport.getMeasure()));
		} else {
			m.addMsrRptMsr("NULL");
		}


		/******************** MsrRpt_Rpter ********************************************************************************/
		if(measurereport.hasReporter()) {

			if(measurereport.getReporter().getReference() != null) {
			m.addMsrRptRpter(measurereport.getReporter().getReference());
			}
		} else {
			m.addMsrRptRpter("NULL");
		}


		/******************** MsrRpt_EvaluatedRsrc ********************************************************************************/
		if(measurereport.hasEvaluatedResource()) {

			String  array = "[";
			for(int incr=0; incr<measurereport.getEvaluatedResource().size(); incr++) {
				array = array + measurereport.getEvaluatedResource().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMsrRptEvaluatedRsrc(array);

		} else {
			m.addMsrRptEvaluatedRsrc("NULL");
		}


		return m;
	}
}
