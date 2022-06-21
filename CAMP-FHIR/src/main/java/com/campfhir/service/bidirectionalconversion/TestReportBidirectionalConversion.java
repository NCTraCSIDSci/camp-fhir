package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TestReport;
public class TestReportBidirectionalConversion 
{
	public TestReport TestReports(org.hl7.fhir.r4.model.TestReport testreport) throws ParseException
	{
		 main.java.com.campfhir.model.TestReport t = new  main.java.com.campfhir.model.TestReport();

		/******************** id ********************************************************************************/
		testreport.setId(t.getId());

		/******************** TstRpt_Nm ********************************************************************************/
		if(testreport.hasName()) {
			t.setTstRptNm(String.valueOf(testreport.getName()));
		}
		/******************** testreportresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportResult testreportresult = testreport.getResult();
		t.setTstRptRslt(testreportresult.toCode());

		/******************** testreportstatus ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportStatus testreportstatus = testreport.getStatus();
		t.setTstRptSts(testreportstatus.toCode());

		/******************** testreportidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier testreportidentifier = testreport.getIdentifier();

		/******************** TstRpt_Id_Vl ********************************************************************************/
		if(testreportidentifier.hasValue()) {
			t.setTstRptIdVl(String.valueOf(testreportidentifier.getValue()));
		}
		/******************** testreportidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testreportidentifiertype = testreportidentifier.getType();

		/******************** testreportidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testreportidentifiertypecoding = testreportidentifiertype.getCodingFirstRep();

		/******************** TstRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(testreportidentifiertypecoding.hasDisplay()) {
			t.setTstRptIdTypCdgDsply(String.valueOf(testreportidentifiertypecoding.getDisplay()));
		}
		/******************** TstRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(testreportidentifiertypecoding.hasVersion()) {
			t.setTstRptIdTypCdgVrsn(String.valueOf(testreportidentifiertypecoding.getVersion()));
		}
		/******************** TstRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(testreportidentifiertypecoding.hasCode()) {
			t.setTstRptIdTypCdgCd(String.valueOf(testreportidentifiertypecoding.getCode()));
		}
		/******************** TstRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(testreportidentifiertypecoding.hasSystem()) {
			t.setTstRptIdTypCdgSys(String.valueOf(testreportidentifiertypecoding.getSystem()));
		}
		/******************** TstRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(testreportidentifiertypecoding.hasUserSelected()) {
			t.setTstRptIdTypCdgUsrSltd(String.valueOf(testreportidentifiertypecoding.getUserSelected()));
		}
		/******************** TstRpt_Id_Typ_Txt ********************************************************************************/
		if(testreportidentifiertype.hasText()) {
			t.setTstRptIdTypTxt(String.valueOf(testreportidentifiertype.getText()));
		}
		/******************** TstRpt_Id_Sys ********************************************************************************/
		if(testreportidentifier.hasSystem()) {
			t.setTstRptIdSys(String.valueOf(testreportidentifier.getSystem()));
		}
		/******************** TstRpt_Id_Assigner ********************************************************************************/
		if(testreportidentifier.hasAssigner()) {
			t.setTstRptIdAssigner(String.valueOf(testreportidentifier.getAssigner()));
		}
		/******************** testreportidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period testreportidentifierperiod = testreportidentifier.getPeriod();

		/******************** TstRpt_Id_Prd_End ********************************************************************************/
		if(testreportidentifierperiod.hasEnd()) {
			t.setTstRptIdPrdEnd(String.valueOf(testreportidentifierperiod.getEnd()));
		}
		/******************** TstRpt_Id_Prd_Strt ********************************************************************************/
		if(testreportidentifierperiod.hasStart()) {
			t.setTstRptIdPrdStrt(String.valueOf(testreportidentifierperiod.getStart()));
		}
		/******************** testreportidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse testreportidentifieruse = testreportidentifier.getUse();
		t.setTstRptIdUse(testreportidentifieruse.toCode());

		/******************** testreportparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportParticipantComponent testreportparticipant = testreport.getParticipantFirstRep();

		/******************** testreportparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportParticipantType testreportparticipanttype = testreportparticipant.getType();
		t.setTstRptPrtcpntTyp(testreportparticipanttype.toCode());

		/******************** TstRpt_Prtcpnt_Uri ********************************************************************************/
		if(testreportparticipant.hasUri()) {
			t.setTstRptPrtcpntUri(String.valueOf(testreportparticipant.getUri()));
		}
		/******************** TstRpt_Issued ********************************************************************************/
		if(testreport.hasIssued()) {
			t.setTstRptIssued(String.valueOf(testreport.getIssued()));
		}
		/******************** TstRpt_Score ********************************************************************************/
		if(testreport.hasScore()) {
			t.setTstRptScore(String.valueOf(testreport.getScore()));
		}
		/******************** testreportsetup ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportSetupComponent testreportsetup = testreport.getSetup();

		/******************** testreportsetupaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionComponent testreportsetupaction = testreportsetup.getActionFirstRep();

		/******************** testreportsetupactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent testreportsetupactionassert = testreportsetupaction.getAssert();

		/******************** TstRpt_Stup_Actn_Assert_Msg ********************************************************************************/
		if(testreportsetupactionassert.hasMessage()) {
			t.setTstRptStupActnAssertMsg(String.valueOf(testreportsetupactionassert.getMessage()));
		}
		/******************** testreportsetupactionassertresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreportsetupactionassertresult = testreportsetupactionassert.getResult();
		t.setTstRptStupActnAssertRslt(testreportsetupactionassertresult.toCode());

		/******************** TstRpt_Stup_Actn_Assert_Dtl ********************************************************************************/
		if(testreportsetupactionassert.hasDetail()) {
			t.setTstRptStupActnAssertDtl(String.valueOf(testreportsetupactionassert.getDetail()));
		}
		/******************** testreportsetupactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent testreportsetupactionoperation = testreportsetupaction.getOperation();

		/******************** TstRpt_Stup_Actn_Oprtn_Msg ********************************************************************************/
		if(testreportsetupactionoperation.hasMessage()) {
			t.setTstRptStupActnOprtnMsg(String.valueOf(testreportsetupactionoperation.getMessage()));
		}
		/******************** testreportsetupactionoperationresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreportsetupactionoperationresult = testreportsetupactionoperation.getResult();
		t.setTstRptStupActnOprtnRslt(testreportsetupactionoperationresult.toCode());

		/******************** TstRpt_Stup_Actn_Oprtn_Dtl ********************************************************************************/
		if(testreportsetupactionoperation.hasDetail()) {
			t.setTstRptStupActnOprtnDtl(String.valueOf(testreportsetupactionoperation.getDetail()));
		}
		/******************** TstRpt_TstScrpt ********************************************************************************/
		if(testreport.hasTestScript()) {
			t.setTstRptTstScrpt(String.valueOf(testreport.getTestScript()));
		}
		/******************** TstRpt_Tster ********************************************************************************/
		if(testreport.hasTester()) {
			t.setTstRptTster(String.valueOf(testreport.getTester()));
		}
		/******************** testreporttest ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportTestComponent testreporttest = testreport.getTestFirstRep();

		/******************** TstRpt_Tst_Nm ********************************************************************************/
		if(testreporttest.hasName()) {
			t.setTstRptTstNm(String.valueOf(testreporttest.getName()));
		}
		/******************** testreporttestaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestActionComponent testreporttestaction = testreporttest.getActionFirstRep();

		/******************** testreporttestactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent testreporttestactionassert = testreporttestaction.getAssert();

		/******************** TstRpt_Tst_Actn_Assert_Msg ********************************************************************************/
		if(testreporttestactionassert.hasMessage()) {
			t.setTstRptTstActnAssertMsg(String.valueOf(testreporttestactionassert.getMessage()));
		}
		/******************** testreporttestactionassertresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreporttestactionassertresult = testreporttestactionassert.getResult();
		t.setTstRptTstActnAssertRslt(testreporttestactionassertresult.toCode());

		/******************** TstRpt_Tst_Actn_Assert_Dtl ********************************************************************************/
		if(testreporttestactionassert.hasDetail()) {
			t.setTstRptTstActnAssertDtl(String.valueOf(testreporttestactionassert.getDetail()));
		}
		/******************** testreporttestactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent testreporttestactionoperation = testreporttestaction.getOperation();

		/******************** TstRpt_Tst_Actn_Oprtn_Msg ********************************************************************************/
		if(testreporttestactionoperation.hasMessage()) {
			t.setTstRptTstActnOprtnMsg(String.valueOf(testreporttestactionoperation.getMessage()));
		}
		/******************** testreporttestactionoperationresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreporttestactionoperationresult = testreporttestactionoperation.getResult();
		t.setTstRptTstActnOprtnRslt(testreporttestactionoperationresult.toCode());

		/******************** TstRpt_Tst_Actn_Oprtn_Dtl ********************************************************************************/
		if(testreporttestactionoperation.hasDetail()) {
			t.setTstRptTstActnOprtnDtl(String.valueOf(testreporttestactionoperation.getDetail()));
		}
		/******************** TstRpt_Tst_Dscrptn ********************************************************************************/
		if(testreporttest.hasDescription()) {
			t.setTstRptTstDscrptn(String.valueOf(testreporttest.getDescription()));
		}
		/******************** testreportteardown ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportTeardownComponent testreportteardown = testreport.getTeardown();

		/******************** testreportteardownaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TeardownActionComponent testreportteardownaction = testreportteardown.getActionFirstRep();

		/******************** testreportteardownactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent testreportteardownactionoperation = testreportteardownaction.getOperation();

		/******************** TstRpt_Teardown_Actn_Oprtn_Msg ********************************************************************************/
		if(testreportteardownactionoperation.hasMessage()) {
			t.setTstRptTeardownActnOprtnMsg(String.valueOf(testreportteardownactionoperation.getMessage()));
		}
		/******************** testreportteardownactionoperationresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreportteardownactionoperationresult = testreportteardownactionoperation.getResult();
		t.setTstRptTeardownActnOprtnRslt(testreportteardownactionoperationresult.toCode());

		/******************** TstRpt_Teardown_Actn_Oprtn_Dtl ********************************************************************************/
		if(testreportteardownactionoperation.hasDetail()) {
			t.setTstRptTeardownActnOprtnDtl(String.valueOf(testreportteardownactionoperation.getDetail()));
		}
		return t;
	}
}
