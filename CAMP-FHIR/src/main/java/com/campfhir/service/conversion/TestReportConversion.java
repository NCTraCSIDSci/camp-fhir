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

		/******************** testreportidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier testreportidentifier =  new org.hl7.fhir.r4.model.Identifier();
		testreport.setIdentifier(testreportidentifier);

		/******************** TstRpt_Id_Assigner ********************************************************************************/
		if(t.getTstRptIdAssigner() != null) {
			testreportidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(t.getTstRptIdAssigner()));
		}
		/******************** testreportidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period testreportidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		testreportidentifier.setPeriod(testreportidentifierperiod);

		/******************** TstRpt_Id_Prd_End ********************************************************************************/
		if(t.getTstRptIdPrdEnd() != null) {
			java.text.SimpleDateFormat TstRpt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TstRpt_Id_Prd_Enddate = TstRpt_Id_Prd_Endsdf.parse(t.getTstRptIdPrdEnd());
			testreportidentifierperiod.setEnd(TstRpt_Id_Prd_Enddate);
		}
		/******************** TstRpt_Id_Prd_Strt ********************************************************************************/
		if(t.getTstRptIdPrdStrt() != null) {
			java.text.SimpleDateFormat TstRpt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TstRpt_Id_Prd_Strtdate = TstRpt_Id_Prd_Strtsdf.parse(t.getTstRptIdPrdStrt());
			testreportidentifierperiod.setStart(TstRpt_Id_Prd_Strtdate);
		}
		/******************** TstRpt_Id_Sys ********************************************************************************/
		if(t.getTstRptIdSys() != null) {
			testreportidentifier.setSystem(t.getTstRptIdSys());
		}
		/******************** testreportidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testreportidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		testreportidentifier.setType(testreportidentifiertype);

		/******************** testreportidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding testreportidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		testreportidentifiertype.addCoding(testreportidentifiertypecoding);

		/******************** TstRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(t.getTstRptIdTypCdgCd() != null) {
			testreportidentifiertypecoding.setCode(t.getTstRptIdTypCdgCd());
		}
		/******************** TstRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(t.getTstRptIdTypCdgDsply() != null) {
			testreportidentifiertypecoding.setDisplay(t.getTstRptIdTypCdgDsply());
		}
		/******************** TstRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(t.getTstRptIdTypCdgSys() != null) {
			testreportidentifiertypecoding.setSystem(t.getTstRptIdTypCdgSys());
		}
		/******************** TstRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(t.getTstRptIdTypCdgUsrSltd() != null) {
			testreportidentifiertypecoding.setUserSelected(Boolean.parseBoolean(t.getTstRptIdTypCdgUsrSltd()));
		}
		/******************** TstRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(t.getTstRptIdTypCdgVrsn() != null) {
			testreportidentifiertypecoding.setVersion(t.getTstRptIdTypCdgVrsn());
		}
		/******************** TstRpt_Id_Typ_Txt ********************************************************************************/
		if(t.getTstRptIdTypTxt() != null) {
			testreportidentifiertype.setText(t.getTstRptIdTypTxt());
		}
		/******************** testreportidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory testreportidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		testreportidentifier.setUse(testreportidentifieruse.fromCode(t.getTstRptIdUse()));

		/******************** TstRpt_Id_Vl ********************************************************************************/
		if(t.getTstRptIdVl() != null) {
			testreportidentifier.setValue(t.getTstRptIdVl());
		}
		/******************** TstRpt_Issued ********************************************************************************/
		if(t.getTstRptIssued() != null) {
			java.text.SimpleDateFormat TstRpt_Issuedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date TstRpt_Issueddate = TstRpt_Issuedsdf.parse(t.getTstRptIssued());
			testreport.setIssued(TstRpt_Issueddate);
		}
		/******************** TstRpt_Nm ********************************************************************************/
		if(t.getTstRptNm() != null) {
			testreport.setName(t.getTstRptNm());
		}
		/******************** testreportparticipant ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportParticipantComponent testreportparticipant =  new org.hl7.fhir.r4.model.TestReport.TestReportParticipantComponent();
		testreport.addParticipant(testreportparticipant);

		/******************** TstRpt_Prtcpnt_Dsply ********************************************************************************/
		if(t.getTstRptPrtcpntDsply() != null) {
			testreportparticipant.setDisplay(t.getTstRptPrtcpntDsply());
		}
		/******************** testreportparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportParticipantTypeEnumFactory testreportparticipanttype =  new org.hl7.fhir.r4.model.TestReport.TestReportParticipantTypeEnumFactory();
		testreportparticipant.setType(testreportparticipanttype.fromCode(t.getTstRptPrtcpntTyp()));

		/******************** TstRpt_Prtcpnt_Uri ********************************************************************************/
		if(t.getTstRptPrtcpntUri() != null) {
			testreportparticipant.setUri(t.getTstRptPrtcpntUri());
		}
		/******************** testreportresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportResultEnumFactory testreportresult =  new org.hl7.fhir.r4.model.TestReport.TestReportResultEnumFactory();
		testreport.setResult(testreportresult.fromCode(t.getTstRptRslt()));

		/******************** TstRpt_Score ********************************************************************************/
		if(t.getTstRptScore() != null) {
			testreport.setScore(Double.parseDouble((t.getTstRptScore())));
		}
		/******************** testreportsetup ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportSetupComponent testreportsetup =  new org.hl7.fhir.r4.model.TestReport.TestReportSetupComponent();
		testreport.setSetup(testreportsetup);

		/******************** testreportsetupaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionComponent testreportsetupaction =  new org.hl7.fhir.r4.model.TestReport.SetupActionComponent();
		testreportsetup.addAction(testreportsetupaction);

		/******************** testreportsetupactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent testreportsetupactionassert =  new org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent();
		testreportsetupaction.setAssert(testreportsetupactionassert);

		/******************** TstRpt_Stup_Actn_Assert_Dtl ********************************************************************************/
		if(t.getTstRptStupActnAssertDtl() != null) {
			testreportsetupactionassert.setDetail(t.getTstRptStupActnAssertDtl());
		}
		/******************** TstRpt_Stup_Actn_Assert_Msg ********************************************************************************/
		if(t.getTstRptStupActnAssertMsg() != null) {
			testreportsetupactionassert.setMessage(t.getTstRptStupActnAssertMsg());
		}
		/******************** testreportsetupactionassertresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory testreportsetupactionassertresult =  new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory();
		testreportsetupactionassert.setResult(testreportsetupactionassertresult.fromCode(t.getTstRptStupActnAssertRslt()));

		/******************** testreportsetupactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent testreportsetupactionoperation =  new org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent();
		testreportsetupaction.setOperation(testreportsetupactionoperation);

		/******************** TstRpt_Stup_Actn_Oprtn_Dtl ********************************************************************************/
		if(t.getTstRptStupActnOprtnDtl() != null) {
			testreportsetupactionoperation.setDetail(t.getTstRptStupActnOprtnDtl());
		}
		/******************** TstRpt_Stup_Actn_Oprtn_Msg ********************************************************************************/
		if(t.getTstRptStupActnOprtnMsg() != null) {
			testreportsetupactionoperation.setMessage(t.getTstRptStupActnOprtnMsg());
		}
		/******************** testreportsetupactionoperationresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory testreportsetupactionoperationresult =  new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory();
		testreportsetupactionoperation.setResult(testreportsetupactionoperationresult.fromCode(t.getTstRptStupActnOprtnRslt()));

		/******************** testreportstatus ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportStatusEnumFactory testreportstatus =  new org.hl7.fhir.r4.model.TestReport.TestReportStatusEnumFactory();
		testreport.setStatus(testreportstatus.fromCode(t.getTstRptSts()));

		/******************** testreportteardown ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportTeardownComponent testreportteardown =  new org.hl7.fhir.r4.model.TestReport.TestReportTeardownComponent();
		testreport.setTeardown(testreportteardown);

		/******************** testreportteardownaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TeardownActionComponent testreportteardownaction =  new org.hl7.fhir.r4.model.TestReport.TeardownActionComponent();
		testreportteardown.addAction(testreportteardownaction);

		/******************** testreportteardownactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent testreportteardownactionoperation =  new org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent();
		testreportteardownaction.setOperation(testreportteardownactionoperation);

		/******************** TstRpt_Teardown_Actn_Oprtn_Dtl ********************************************************************************/
		if(t.getTstRptTeardownActnOprtnDtl() != null) {
			testreportteardownactionoperation.setDetail(t.getTstRptTeardownActnOprtnDtl());
		}
		/******************** TstRpt_Teardown_Actn_Oprtn_Msg ********************************************************************************/
		if(t.getTstRptTeardownActnOprtnMsg() != null) {
			testreportteardownactionoperation.setMessage(t.getTstRptTeardownActnOprtnMsg());
		}
		/******************** testreportteardownactionoperationresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory testreportteardownactionoperationresult =  new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory();
		testreportteardownactionoperation.setResult(testreportteardownactionoperationresult.fromCode(t.getTstRptTeardownActnOprtnRslt()));

		/******************** testreporttest ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportTestComponent testreporttest =  new org.hl7.fhir.r4.model.TestReport.TestReportTestComponent();
		testreport.addTest(testreporttest);

		/******************** testreporttestaction ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestActionComponent testreporttestaction =  new org.hl7.fhir.r4.model.TestReport.TestActionComponent();
		testreporttest.addAction(testreporttestaction);

		/******************** testreporttestactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent testreporttestactionassert =  new org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent();
		testreporttestaction.setAssert(testreporttestactionassert);

		/******************** TstRpt_Tst_Actn_Assert_Dtl ********************************************************************************/
		if(t.getTstRptTstActnAssertDtl() != null) {
			testreporttestactionassert.setDetail(t.getTstRptTstActnAssertDtl());
		}
		/******************** TstRpt_Tst_Actn_Assert_Msg ********************************************************************************/
		if(t.getTstRptTstActnAssertMsg() != null) {
			testreporttestactionassert.setMessage(t.getTstRptTstActnAssertMsg());
		}
		/******************** testreporttestactionassertresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory testreporttestactionassertresult =  new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory();
		testreporttestactionassert.setResult(testreporttestactionassertresult.fromCode(t.getTstRptTstActnAssertRslt()));

		/******************** testreporttestactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent testreporttestactionoperation =  new org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent();
		testreporttestaction.setOperation(testreporttestactionoperation);

		/******************** TstRpt_Tst_Actn_Oprtn_Dtl ********************************************************************************/
		if(t.getTstRptTstActnOprtnDtl() != null) {
			testreporttestactionoperation.setDetail(t.getTstRptTstActnOprtnDtl());
		}
		/******************** TstRpt_Tst_Actn_Oprtn_Msg ********************************************************************************/
		if(t.getTstRptTstActnOprtnMsg() != null) {
			testreporttestactionoperation.setMessage(t.getTstRptTstActnOprtnMsg());
		}
		/******************** testreporttestactionoperationresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory testreporttestactionoperationresult =  new org.hl7.fhir.r4.model.TestReport.TestReportActionResultEnumFactory();
		testreporttestactionoperation.setResult(testreporttestactionoperationresult.fromCode(t.getTstRptTstActnOprtnRslt()));

		/******************** TstRpt_Tst_Dscrptn ********************************************************************************/
		if(t.getTstRptTstDscrptn() != null) {
			testreporttest.setDescription(t.getTstRptTstDscrptn());
		}
		/******************** TstRpt_Tst_Nm ********************************************************************************/
		if(t.getTstRptTstNm() != null) {
			testreporttest.setName(t.getTstRptTstNm());
		}
		/******************** TstRpt_TstScrpt ********************************************************************************/
		if(t.getTstRptTstScrpt() != null) {
			testreport.setTestScript( new org.hl7.fhir.r4.model.Reference(t.getTstRptTstScrpt()));
		}
		/******************** TstRpt_Tster ********************************************************************************/
		if(t.getTstRptTster() != null) {
			testreport.setTester(t.getTstRptTster());
		}
		return testreport;
	}
}
