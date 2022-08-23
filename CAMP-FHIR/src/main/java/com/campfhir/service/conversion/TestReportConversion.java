package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TestReport;
public class TestReportConversion 
{
	public org.hl7.fhir.r4.model.TestReport TestReports(TestReport t) throws ParseException
	{
		org.hl7.fhir.r4.model.TestReport testreport = new org.hl7.fhir.r4.model.TestReport();

		/******************** id ********************************************************************************/
		testreport.setId(t.getId());

		/******************** TstRpt_Id_Assigner ********************************************************************************/
		if(t.getTstRptIdAssigner() != null ) {

			if(t.getTstRptIdAssigner().replace("[","").replace("]","").equals("NULL") | t.getTstRptIdAssigner()==null) {} else {
			testreport.getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(t.getTstRptIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstRpt_Id_Prd_End ********************************************************************************/
		if(t.getTstRptIdPrdEnd() != null ) {

			if(t.getTstRptIdPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTstRptIdPrdEnd()==null) {} else {
			testreport.getIdentifier().getPeriod().setEnd(t.getTstRptIdPrdEnd().replace("[","").replace("]","").equals("NULL") | t.getTstRptIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTstRptIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstRpt_Id_Prd_Strt ********************************************************************************/
		if(t.getTstRptIdPrdStrt() != null ) {

			if(t.getTstRptIdPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTstRptIdPrdStrt()==null) {} else {
			testreport.getIdentifier().getPeriod().setStart(t.getTstRptIdPrdStrt().replace("[","").replace("]","").equals("NULL") | t.getTstRptIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTstRptIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstRpt_Id_Sys ********************************************************************************/
		if(t.getTstRptIdSys() != null ) {

			if(t.getTstRptIdSys().replace("[","").replace("]","").equals("NULL") | t.getTstRptIdSys()==null) {} else {
			testreport.getIdentifier().setSystem(t.getTstRptIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTstRptIdTypCdgCd() != null ) {

			String[] arrayi0 = t.getTstRptIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getIdentifier().getType().getCoding().size() < i0+1) { testreport.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTstRptIdTypCdgDsply() != null ) {

			String[] arrayi0 = t.getTstRptIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getIdentifier().getType().getCoding().size() < i0+1) { testreport.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTstRptIdTypCdgSys() != null ) {

			String[] arrayi0 = t.getTstRptIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getIdentifier().getType().getCoding().size() < i0+1) { testreport.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTstRptIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = t.getTstRptIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getIdentifier().getType().getCoding().size() < i0+1) { testreport.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTstRptIdTypCdgVrsn() != null ) {

			String[] arrayi0 = t.getTstRptIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getIdentifier().getType().getCoding().size() < i0+1) { testreport.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Id_Typ_Txt ********************************************************************************/
		if(t.getTstRptIdTypTxt() != null ) {

			if(t.getTstRptIdTypTxt().replace("[","").replace("]","").equals("NULL") | t.getTstRptIdTypTxt()==null) {} else {
			testreport.getIdentifier().getType().setText(t.getTstRptIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstRpt_Id_Use ********************************************************************************/
		if(t.getTstRptIdUse() != null ) {

			if(t.getTstRptIdUse().replace("[","").replace("]","").equals("NULL") | t.getTstRptIdUse()==null) {} else {
			testreport.getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(t.getTstRptIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstRpt_Id_Vl ********************************************************************************/
		if(t.getTstRptIdVl() != null ) {

			if(t.getTstRptIdVl().replace("[","").replace("]","").equals("NULL") | t.getTstRptIdVl()==null) {} else {
			testreport.getIdentifier().setValue(t.getTstRptIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstRpt_Issued ********************************************************************************/
		if(t.getTstRptIssued() != null ) {

			if(t.getTstRptIssued().replace("[","").replace("]","").equals("NULL") | t.getTstRptIssued()==null) {} else {
			testreport.setIssued(t.getTstRptIssued().replace("[","").replace("]","").equals("NULL") | t.getTstRptIssued()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(t.getTstRptIssued().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstRpt_Nm ********************************************************************************/
		if(t.getTstRptNm() != null ) {

			if(t.getTstRptNm().replace("[","").replace("]","").equals("NULL") | t.getTstRptNm()==null) {} else {
			testreport.setName(t.getTstRptNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** TstRpt_Prtcpnt_Dsply ********************************************************************************/
		if(t.getTstRptPrtcpntDsply() != null ) {

			String[] arrayi0 = t.getTstRptPrtcpntDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getParticipant().size() < i0+1) { testreport.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getParticipant().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Prtcpnt_Typ ********************************************************************************/
		if(t.getTstRptPrtcpntTyp() != null ) {

			String[] arrayi0 = t.getTstRptPrtcpntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getParticipant().size() < i0+1) { testreport.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getParticipant().get(i0).setType(new org.hl7.fhir.r4.model.TestReport.TestReportParticipantTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstRpt_Prtcpnt_Uri ********************************************************************************/
		if(t.getTstRptPrtcpntUri() != null ) {

			String[] arrayi0 = t.getTstRptPrtcpntUri().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getParticipant().size() < i0+1) { testreport.addParticipant(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getParticipant().get(i0).setUri(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Rslt ********************************************************************************/
		if(t.getTstRptRslt() != null ) {

			if(t.getTstRptRslt().replace("[","").replace("]","").equals("NULL") | t.getTstRptRslt()==null) {} else {
			testreport.setResult(new org.hl7.fhir.r4.model.TestReport.TestReportResultEnumFactory().fromCode(t.getTstRptRslt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstRpt_Score ********************************************************************************/
		if(t.getTstRptScore() != null ) {

			if(t.getTstRptScore().replace("[","").replace("]","").equals("NULL") | t.getTstRptScore()==null) {} else {
			testreport.setScore((Double.parseDouble((t.getTstRptScore().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** TstRpt_Stup_Actn_Assert_Dtl ********************************************************************************/
		if(t.getTstRptStupActnAssertDtl() != null ) {

			String[] arrayi0 = t.getTstRptStupActnAssertDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getSetup().getAction().size() < i0+1) { testreport.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getSetup().getAction().get(i0).getAssert().setDetail(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Stup_Actn_Assert_Msg ********************************************************************************/
		if(t.getTstRptStupActnAssertMsg() != null ) {

			String[] arrayi0 = t.getTstRptStupActnAssertMsg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getSetup().getAction().size() < i0+1) { testreport.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getSetup().getAction().get(i0).getAssert().setMessage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Stup_Actn_Assert_Rslt ********************************************************************************/
		if(t.getTstRptStupActnAssertRslt() != null ) {

			String[] arrayi0 = t.getTstRptStupActnAssertRslt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getSetup().getAction().size() < i0+1) { testreport.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getSetup().getAction().get(i0).getAssert().setResult(new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstRpt_Stup_Actn_Oprtn_Dtl ********************************************************************************/
		if(t.getTstRptStupActnOprtnDtl() != null ) {

			String[] arrayi0 = t.getTstRptStupActnOprtnDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getSetup().getAction().size() < i0+1) { testreport.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getSetup().getAction().get(i0).getOperation().setDetail(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Stup_Actn_Oprtn_Msg ********************************************************************************/
		if(t.getTstRptStupActnOprtnMsg() != null ) {

			String[] arrayi0 = t.getTstRptStupActnOprtnMsg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getSetup().getAction().size() < i0+1) { testreport.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getSetup().getAction().get(i0).getOperation().setMessage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Stup_Actn_Oprtn_Rslt ********************************************************************************/
		if(t.getTstRptStupActnOprtnRslt() != null ) {

			String[] arrayi0 = t.getTstRptStupActnOprtnRslt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getSetup().getAction().size() < i0+1) { testreport.getSetup().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getSetup().getAction().get(i0).getOperation().setResult(new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstRpt_Sts ********************************************************************************/
		if(t.getTstRptSts() != null ) {

			if(t.getTstRptSts().replace("[","").replace("]","").equals("NULL") | t.getTstRptSts()==null) {} else {
			testreport.setStatus(new org.hl7.fhir.r4.model.TestReport.TestReportStatusEnumFactory().fromCode(t.getTstRptSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstRpt_Teardown_Actn_Oprtn_Dtl ********************************************************************************/
		if(t.getTstRptTeardownActnOprtnDtl() != null ) {

			String[] arrayi0 = t.getTstRptTeardownActnOprtnDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTeardown().getAction().size() < i0+1) { testreport.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getTeardown().getAction().get(i0).getOperation().setDetail(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Teardown_Actn_Oprtn_Msg ********************************************************************************/
		if(t.getTstRptTeardownActnOprtnMsg() != null ) {

			String[] arrayi0 = t.getTstRptTeardownActnOprtnMsg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTeardown().getAction().size() < i0+1) { testreport.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getTeardown().getAction().get(i0).getOperation().setMessage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Teardown_Actn_Oprtn_Rslt ********************************************************************************/
		if(t.getTstRptTeardownActnOprtnRslt() != null ) {

			String[] arrayi0 = t.getTstRptTeardownActnOprtnRslt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTeardown().getAction().size() < i0+1) { testreport.getTeardown().addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getTeardown().getAction().get(i0).getOperation().setResult(new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** TstRpt_Tst_Actn_Assert_Dtl ********************************************************************************/
		if(t.getTstRptTstActnAssertDtl() != null ) {

			String[] arrayi0 = t.getTstRptTstActnAssertDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTest().size() < i0+1) { testreport.addTest(); }
				String[] arrayi1 = t.getTstRptTstActnAssertDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testreport.getTest().get(i0).getAction().size() < i1+1) { testreport.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testreport.getTest().get(i0).getAction().get(i1).getAssert().setDetail(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstRpt_Tst_Actn_Assert_Msg ********************************************************************************/
		if(t.getTstRptTstActnAssertMsg() != null ) {

			String[] arrayi0 = t.getTstRptTstActnAssertMsg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTest().size() < i0+1) { testreport.addTest(); }
				String[] arrayi1 = t.getTstRptTstActnAssertMsg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testreport.getTest().get(i0).getAction().size() < i1+1) { testreport.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testreport.getTest().get(i0).getAction().get(i1).getAssert().setMessage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstRpt_Tst_Actn_Assert_Rslt ********************************************************************************/
		if(t.getTstRptTstActnAssertRslt() != null ) {

			String[] arrayi0 = t.getTstRptTstActnAssertRslt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTest().size() < i0+1) { testreport.addTest(); }
				String[] arrayi1 = t.getTstRptTstActnAssertRslt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testreport.getTest().get(i0).getAction().size() < i1+1) { testreport.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testreport.getTest().get(i0).getAction().get(i1).getAssert().setResult(new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstRpt_Tst_Actn_Oprtn_Dtl ********************************************************************************/
		if(t.getTstRptTstActnOprtnDtl() != null ) {

			String[] arrayi0 = t.getTstRptTstActnOprtnDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTest().size() < i0+1) { testreport.addTest(); }
				String[] arrayi1 = t.getTstRptTstActnOprtnDtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testreport.getTest().get(i0).getAction().size() < i1+1) { testreport.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testreport.getTest().get(i0).getAction().get(i1).getOperation().setDetail(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstRpt_Tst_Actn_Oprtn_Msg ********************************************************************************/
		if(t.getTstRptTstActnOprtnMsg() != null ) {

			String[] arrayi0 = t.getTstRptTstActnOprtnMsg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTest().size() < i0+1) { testreport.addTest(); }
				String[] arrayi1 = t.getTstRptTstActnOprtnMsg().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testreport.getTest().get(i0).getAction().size() < i1+1) { testreport.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testreport.getTest().get(i0).getAction().get(i1).getOperation().setMessage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** TstRpt_Tst_Actn_Oprtn_Rslt ********************************************************************************/
		if(t.getTstRptTstActnOprtnRslt() != null ) {

			String[] arrayi0 = t.getTstRptTstActnOprtnRslt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTest().size() < i0+1) { testreport.addTest(); }
				String[] arrayi1 = t.getTstRptTstActnOprtnRslt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(testreport.getTest().get(i0).getAction().size() < i1+1) { testreport.getTest().get(i0).addAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {testreport.getTest().get(i0).getAction().get(i1).getOperation().setResult(new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** TstRpt_Tst_Dscrptn ********************************************************************************/
		if(t.getTstRptTstDscrptn() != null ) {

			String[] arrayi0 = t.getTstRptTstDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTest().size() < i0+1) { testreport.addTest(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getTest().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_Tst_Nm ********************************************************************************/
		if(t.getTstRptTstNm() != null ) {

			String[] arrayi0 = t.getTstRptTstNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(testreport.getTest().size() < i0+1) { testreport.addTest(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {testreport.getTest().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** TstRpt_TstScrpt ********************************************************************************/
		if(t.getTstRptTstScrpt() != null ) {

			if(t.getTstRptTstScrpt().replace("[","").replace("]","").equals("NULL") | t.getTstRptTstScrpt()==null) {} else {
			testreport.setTestScript(new org.hl7.fhir.r4.model.Reference(t.getTstRptTstScrpt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** TstRpt_Tster ********************************************************************************/
		if(t.getTstRptTster() != null ) {

			if(t.getTstRptTster().replace("[","").replace("]","").equals("NULL") | t.getTstRptTster()==null) {} else {
			testreport.setTester(t.getTstRptTster().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return testreport;
	}
}
