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
		if(m.getMsrRptDt() != null ) {

			if(m.getMsrRptDt().replace("[","").replace("]","").equals("NULL") | m.getMsrRptDt()==null) {} else {
			measurereport.setDate(m.getMsrRptDt().replace("[","").replace("]","").equals("NULL") | m.getMsrRptDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsrRptDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsrRpt_EvaluatedRsrc ********************************************************************************/
		if(m.getMsrRptEvaluatedRsrc() != null ) {

				for( String currListStrSplit : m.getMsrRptEvaluatedRsrc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			measurereport.addEvaluatedResource(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MsrRpt_Grp_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measurereport.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getGroup().get(i0).getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsrRpt_Grp_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrRptGrpCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measurereport.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getGroup().get(i0).getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsrRpt_Grp_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrRptGrpCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measurereport.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getGroup().get(i0).getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsrRpt_Grp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measurereport.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getGroup().get(i0).getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsrRpt_Grp_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrRptGrpCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getCode().getCoding().size() < i1+1) { measurereport.getGroup().get(i0).getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getGroup().get(i0).getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsrRpt_Grp_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpCdTxt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getGroup().get(i0).getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_Grp_MsrScore_Cd ********************************************************************************/
		if(m.getMsrRptGrpMsrScoreCd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpMsrScoreCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getGroup().get(i0).getMeasureScore().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_Grp_MsrScore_Cmprtr ********************************************************************************/
		if(m.getMsrRptGrpMsrScoreCmprtr() != null ) {

			String[] arrayi0 = m.getMsrRptGrpMsrScoreCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getGroup().get(i0).getMeasureScore().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsrRpt_Grp_MsrScore_Sys ********************************************************************************/
		if(m.getMsrRptGrpMsrScoreSys() != null ) {

			String[] arrayi0 = m.getMsrRptGrpMsrScoreSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getGroup().get(i0).getMeasureScore().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_Grp_MsrScore_Unt ********************************************************************************/
		if(m.getMsrRptGrpMsrScoreUnt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpMsrScoreUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getGroup().get(i0).getMeasureScore().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_Grp_MsrScore_Vl ********************************************************************************/
		if(m.getMsrRptGrpMsrScoreVl() != null ) {

			String[] arrayi0 = m.getMsrRptGrpMsrScoreVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getGroup().get(i0).getMeasureScore().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getPopulation().size() < i1+1) { measurereport.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrRptGrpPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrRptGrpPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getPopulation().size() < i1+1) { measurereport.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrRptGrpPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrRptGrpPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getPopulation().size() < i1+1) { measurereport.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrRptGrpPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getPopulation().size() < i1+1) { measurereport.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrRptGrpPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrRptGrpPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getPopulation().size() < i1+1) { measurereport.getGroup().get(i0).addPopulation(); }
					String[] arrayi2 = m.getMsrRptGrpPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().size() < i2+1) { measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Popln_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpPoplnCdTxt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpPoplnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpPoplnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getPopulation().size() < i1+1) { measurereport.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getGroup().get(i0).getPopulation().get(i1).getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsrRpt_Grp_Popln_Cnt ********************************************************************************/
		if(m.getMsrRptGrpPoplnCnt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpPoplnCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpPoplnCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getPopulation().size() < i1+1) { measurereport.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getGroup().get(i0).getPopulation().get(i1).setCount(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsrRpt_Grp_Popln_SbjctRslts ********************************************************************************/
		if(m.getMsrRptGrpPoplnSbjctRslts() != null ) {

			String[] arrayi0 = m.getMsrRptGrpPoplnSbjctRslts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpPoplnSbjctRslts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getPopulation().size() < i1+1) { measurereport.getGroup().get(i0).addPopulation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getGroup().get(i0).getPopulation().get(i1).setSubjectResults(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addCode(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addCode(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addCode(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addCode(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addCode(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierCdTxt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addCode(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getCode().get(i2).setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntCdTxt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getCode().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgCd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgSys() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumCmpntVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Cmpnt_Vl_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumCmpntVlTxt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumCmpntVlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumCmpntVlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumCmpntVlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumCmpntVlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addComponent(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getComponent().get(i3).getValue().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumMsrScoreCd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumMsrScoreCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumMsrScoreCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumMsrScoreCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getMeasureScore().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Cmprtr ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumMsrScoreCmprtr() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumMsrScoreCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumMsrScoreCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumMsrScoreCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getMeasureScore().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumMsrScoreSys() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumMsrScoreSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumMsrScoreSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumMsrScoreSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getMeasureScore().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Unt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumMsrScoreUnt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumMsrScoreUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumMsrScoreUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumMsrScoreUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getMeasureScore().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_MsrScore_Vl ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumMsrScoreVl() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumMsrScoreVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumMsrScoreVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumMsrScoreVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getMeasureScore().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgCd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addPopulation(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addPopulation(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgSys() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addPopulation(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addPopulation(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addPopulation(); }
							String[] arrayi4 = m.getMsrRptGrpStrtfierStratumPoplnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().size() < i4+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().addCoding(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().getCoding().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cd_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCdTxt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumPoplnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumPoplnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumPoplnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumPoplnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addPopulation(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).getCode().setText(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_Cnt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnCnt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumPoplnCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumPoplnCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumPoplnCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumPoplnCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addPopulation(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).setCount(Integer.parseInt(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Popln_SbjctRslts ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumPoplnSbjctRslts() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumPoplnSbjctRslts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumPoplnSbjctRslts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumPoplnSbjctRslts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumPoplnSbjctRslts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).addPopulation(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getPopulation().get(i3).setSubjectResults(new org.hl7.fhir.r4.model.Reference(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgCd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgSys() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						String[] arrayi3 = m.getMsrRptGrpStrtfierStratumVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().size() < i3+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** MsrRpt_Grp_Strtfier_Stratum_Vl_Txt ********************************************************************************/
		if(m.getMsrRptGrpStrtfierStratumVlTxt() != null ) {

			String[] arrayi0 = m.getMsrRptGrpStrtfierStratumVlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getGroup().size() < i0+1) { measurereport.addGroup(); }
				String[] arrayi1 = m.getMsrRptGrpStrtfierStratumVlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getGroup().get(i0).getStratifier().size() < i1+1) { measurereport.getGroup().get(i0).addStratifier(); }
					String[] arrayi2 = m.getMsrRptGrpStrtfierStratumVlTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().size() < i2+1) { measurereport.getGroup().get(i0).getStratifier().get(i1).addStratum(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {measurereport.getGroup().get(i0).getStratifier().get(i1).getStratum().get(i2).getValue().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** MsrRpt_Id_Assigner ********************************************************************************/
		if(m.getMsrRptIdAssigner() != null ) {

			String[] arrayi0 = m.getMsrRptIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsrRpt_Id_Prd_End ********************************************************************************/
		if(m.getMsrRptIdPrdEnd() != null ) {

			String[] arrayi0 = m.getMsrRptIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsrRpt_Id_Prd_Strt ********************************************************************************/
		if(m.getMsrRptIdPrdStrt() != null ) {

			String[] arrayi0 = m.getMsrRptIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsrRpt_Id_Sys ********************************************************************************/
		if(m.getMsrRptIdSys() != null ) {

			String[] arrayi0 = m.getMsrRptIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptIdTypCdgCd() != null ) {

			String[] arrayi0 = m.getMsrRptIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				String[] arrayi1 = m.getMsrRptIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measurereport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsrRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptIdTypCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrRptIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				String[] arrayi1 = m.getMsrRptIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measurereport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsrRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptIdTypCdgSys() != null ) {

			String[] arrayi0 = m.getMsrRptIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				String[] arrayi1 = m.getMsrRptIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measurereport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsrRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrRptIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				String[] arrayi1 = m.getMsrRptIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measurereport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** MsrRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptIdTypCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrRptIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				String[] arrayi1 = m.getMsrRptIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(measurereport.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { measurereport.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {measurereport.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** MsrRpt_Id_Typ_Txt ********************************************************************************/
		if(m.getMsrRptIdTypTxt() != null ) {

			String[] arrayi0 = m.getMsrRptIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_Id_Use ********************************************************************************/
		if(m.getMsrRptIdUse() != null ) {

			String[] arrayi0 = m.getMsrRptIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsrRpt_Id_Vl ********************************************************************************/
		if(m.getMsrRptIdVl() != null ) {

			String[] arrayi0 = m.getMsrRptIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getIdentifier().size() < i0+1) { measurereport.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Cd ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgCd() != null ) {

			String[] arrayi0 = m.getMsrRptImprovementNotationCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getImprovementNotation().getCoding().size() < i0+1) { measurereport.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getImprovementNotation().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Dsply ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgDsply() != null ) {

			String[] arrayi0 = m.getMsrRptImprovementNotationCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getImprovementNotation().getCoding().size() < i0+1) { measurereport.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getImprovementNotation().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Sys ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgSys() != null ) {

			String[] arrayi0 = m.getMsrRptImprovementNotationCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getImprovementNotation().getCoding().size() < i0+1) { measurereport.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getImprovementNotation().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_ImprovementNotation_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsrRptImprovementNotationCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getImprovementNotation().getCoding().size() < i0+1) { measurereport.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getImprovementNotation().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsrRpt_ImprovementNotation_Cdg_Vrsn ********************************************************************************/
		if(m.getMsrRptImprovementNotationCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsrRptImprovementNotationCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(measurereport.getImprovementNotation().getCoding().size() < i0+1) { measurereport.getImprovementNotation().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {measurereport.getImprovementNotation().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsrRpt_ImprovementNotation_Txt ********************************************************************************/
		if(m.getMsrRptImprovementNotationTxt() != null ) {

			if(m.getMsrRptImprovementNotationTxt().replace("[","").replace("]","").equals("NULL") | m.getMsrRptImprovementNotationTxt()==null) {} else {
			measurereport.getImprovementNotation().setText(m.getMsrRptImprovementNotationTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsrRpt_Msr ********************************************************************************/
		if(m.getMsrRptMsr() != null ) {

			if(m.getMsrRptMsr().replace("[","").replace("]","").equals("NULL") | m.getMsrRptMsr()==null) {} else {
			measurereport.setMeasure(m.getMsrRptMsr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsrRpt_Prd_End ********************************************************************************/
		if(m.getMsrRptPrdEnd() != null ) {

			if(m.getMsrRptPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMsrRptPrdEnd()==null) {} else {
			measurereport.getPeriod().setEnd(m.getMsrRptPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMsrRptPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsrRptPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsrRpt_Prd_Strt ********************************************************************************/
		if(m.getMsrRptPrdStrt() != null ) {

			if(m.getMsrRptPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMsrRptPrdStrt()==null) {} else {
			measurereport.getPeriod().setStart(m.getMsrRptPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMsrRptPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsrRptPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsrRpt_Rpter ********************************************************************************/
		if(m.getMsrRptRpter() != null ) {

			if(m.getMsrRptRpter().replace("[","").replace("]","").equals("NULL") | m.getMsrRptRpter()==null) {} else {
			measurereport.setReporter(new org.hl7.fhir.r4.model.Reference(m.getMsrRptRpter().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsrRpt_Sts ********************************************************************************/
		if(m.getMsrRptSts() != null ) {

			if(m.getMsrRptSts().replace("[","").replace("]","").equals("NULL") | m.getMsrRptSts()==null) {} else {
			measurereport.setStatus(new org.hl7.fhir.r4.model.MeasureReport.MeasureReportStatusEnumFactory().fromCode(m.getMsrRptSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsrRpt_Sbjct ********************************************************************************/
		if(m.getMsrRptSbjct() != null ) {

			if(m.getMsrRptSbjct().replace("[","").replace("]","").equals("NULL") | m.getMsrRptSbjct()==null) {} else {
			measurereport.setSubject(new org.hl7.fhir.r4.model.Reference(m.getMsrRptSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsrRpt_Typ ********************************************************************************/
		if(m.getMsrRptTyp() != null ) {

			if(m.getMsrRptTyp().replace("[","").replace("]","").equals("NULL") | m.getMsrRptTyp()==null) {} else {
			measurereport.setType(new org.hl7.fhir.r4.model.MeasureReport.MeasureReportTypeEnumFactory().fromCode(m.getMsrRptTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return measurereport;
	}
}
