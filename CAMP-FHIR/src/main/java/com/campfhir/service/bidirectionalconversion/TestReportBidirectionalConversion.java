package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.TestReport;
public class TestReportBidirectionalConversion 
{
	public TestReport TestReports(org.hl7.fhir.r4.model.TestReport testreport) throws ParseException
	{
		 main.java.com.campfhir.model.TestReport t = new  main.java.com.campfhir.model.TestReport();

		/******************** id ********************************************************************************/
		t.setId(testreport.getIdElement().getIdPart());

		/******************** TstRpt_Nm ********************************************************************************/
		if(testreport.hasName()) {

			t.addTstRptNm(String.valueOf(testreport.getName()));
		} else {
			t.addTstRptNm("NULL");
		}


		/******************** testreportresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportResult testreportresult = testreport.getResult();
		if(testreportresult!=null) {
			t.addTstRptRslt(testreportresult.toCode());
		} else {
			t.addTstRptRslt("NULL");
		}

		/******************** testreportstatus ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportStatus testreportstatus = testreport.getStatus();
		if(testreportstatus!=null) {
			t.addTstRptSts(testreportstatus.toCode());
		} else {
			t.addTstRptSts("NULL");
		}

		/******************** testreportidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier testreportidentifier = testreport.getIdentifier();

		/******************** TstRpt_Id_Vl ********************************************************************************/
		if(testreportidentifier.hasValue()) {

			t.addTstRptIdVl(String.valueOf(testreportidentifier.getValue()));
		} else {
			t.addTstRptIdVl("NULL");
		}


		/******************** testreportidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept testreportidentifiertype = testreportidentifier.getType();

		/******************** TstRpt_Id_Typ_Txt ********************************************************************************/
		if(testreportidentifiertype.hasText()) {

			t.addTstRptIdTypTxt(String.valueOf(testreportidentifiertype.getText()));
		} else {
			t.addTstRptIdTypTxt("NULL");
		}


		/******************** testreportidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> testreportidentifiertypecodinglist = testreportidentifiertype.getCoding();
		for(int testreportidentifiertypecodingi = 0; testreportidentifiertypecodingi<testreportidentifiertypecodinglist.size();testreportidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  testreportidentifiertypecoding = testreportidentifiertypecodinglist.get(testreportidentifiertypecodingi);

		/******************** TstRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(testreportidentifiertypecodingi == 0) {t.addTstRptIdTypCdgDsply("[");}
		if(testreportidentifiertypecoding.hasDisplay()) {

			t.addTstRptIdTypCdgDsply(String.valueOf(testreportidentifiertypecoding.getDisplay()));
		} else {
			t.addTstRptIdTypCdgDsply("NULL");
		}

		if(testreportidentifiertypecodingi == testreportidentifiertypecodinglist.size()-1) {t.addTstRptIdTypCdgDsply("]");}


		/******************** TstRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(testreportidentifiertypecodingi == 0) {t.addTstRptIdTypCdgVrsn("[");}
		if(testreportidentifiertypecoding.hasVersion()) {

			t.addTstRptIdTypCdgVrsn(String.valueOf(testreportidentifiertypecoding.getVersion()));
		} else {
			t.addTstRptIdTypCdgVrsn("NULL");
		}

		if(testreportidentifiertypecodingi == testreportidentifiertypecodinglist.size()-1) {t.addTstRptIdTypCdgVrsn("]");}


		/******************** TstRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(testreportidentifiertypecodingi == 0) {t.addTstRptIdTypCdgCd("[");}
		if(testreportidentifiertypecoding.hasCode()) {

			t.addTstRptIdTypCdgCd(String.valueOf(testreportidentifiertypecoding.getCode()));
		} else {
			t.addTstRptIdTypCdgCd("NULL");
		}

		if(testreportidentifiertypecodingi == testreportidentifiertypecodinglist.size()-1) {t.addTstRptIdTypCdgCd("]");}


		/******************** TstRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(testreportidentifiertypecodingi == 0) {t.addTstRptIdTypCdgUsrSltd("[");}
		if(testreportidentifiertypecoding.hasUserSelected()) {

			t.addTstRptIdTypCdgUsrSltd(String.valueOf(testreportidentifiertypecoding.getUserSelected()));
		} else {
			t.addTstRptIdTypCdgUsrSltd("NULL");
		}

		if(testreportidentifiertypecodingi == testreportidentifiertypecodinglist.size()-1) {t.addTstRptIdTypCdgUsrSltd("]");}


		/******************** TstRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(testreportidentifiertypecodingi == 0) {t.addTstRptIdTypCdgSys("[");}
		if(testreportidentifiertypecoding.hasSystem()) {

			t.addTstRptIdTypCdgSys(String.valueOf(testreportidentifiertypecoding.getSystem()));
		} else {
			t.addTstRptIdTypCdgSys("NULL");
		}

		if(testreportidentifiertypecodingi == testreportidentifiertypecodinglist.size()-1) {t.addTstRptIdTypCdgSys("]");}


		 };
		/******************** testreportidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period testreportidentifierperiod = testreportidentifier.getPeriod();

		/******************** TstRpt_Id_Prd_Strt ********************************************************************************/
		if(testreportidentifierperiod.hasStart()) {

			t.addTstRptIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(testreportidentifierperiod.getStart())+"\"");
		} else {
			t.addTstRptIdPrdStrt("NULL");
		}


		/******************** TstRpt_Id_Prd_End ********************************************************************************/
		if(testreportidentifierperiod.hasEnd()) {

			t.addTstRptIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(testreportidentifierperiod.getEnd())+"\"");
		} else {
			t.addTstRptIdPrdEnd("NULL");
		}


		/******************** testreportidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse testreportidentifieruse = testreportidentifier.getUse();
		if(testreportidentifieruse!=null) {
			t.addTstRptIdUse(testreportidentifieruse.toCode());
		} else {
			t.addTstRptIdUse("NULL");
		}

		/******************** TstRpt_Id_Assigner ********************************************************************************/
		if(testreportidentifier.hasAssigner()) {

			if(testreportidentifier.getAssigner().getReference() != null) {
			t.addTstRptIdAssigner(testreportidentifier.getAssigner().getReference());
			}
		} else {
			t.addTstRptIdAssigner("NULL");
		}


		/******************** TstRpt_Id_Sys ********************************************************************************/
		if(testreportidentifier.hasSystem()) {

			t.addTstRptIdSys(String.valueOf(testreportidentifier.getSystem()));
		} else {
			t.addTstRptIdSys("NULL");
		}


		/******************** TstRpt_TstScrpt ********************************************************************************/
		if(testreport.hasTestScript()) {

			if(testreport.getTestScript().getReference() != null) {
			t.addTstRptTstScrpt(testreport.getTestScript().getReference());
			}
		} else {
			t.addTstRptTstScrpt("NULL");
		}


		/******************** testreportsetup ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportSetupComponent testreportsetup = testreport.getSetup();

		/******************** testreportsetupaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestReport.SetupActionComponent> testreportsetupactionlist = testreportsetup.getAction();
		for(int testreportsetupactioni = 0; testreportsetupactioni<testreportsetupactionlist.size();testreportsetupactioni++ ) {
		org.hl7.fhir.r4.model.TestReport.SetupActionComponent  testreportsetupaction = testreportsetupactionlist.get(testreportsetupactioni);

		/******************** testreportsetupactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent testreportsetupactionoperation = testreportsetupaction.getOperation();

		/******************** TstRpt_Stup_Actn_Oprtn_Msg ********************************************************************************/
		if(testreportsetupactioni == 0) {t.addTstRptStupActnOprtnMsg("[");}
		if(testreportsetupactionoperation.hasMessage()) {

			t.addTstRptStupActnOprtnMsg(String.valueOf(testreportsetupactionoperation.getMessage()));
		} else {
			t.addTstRptStupActnOprtnMsg("NULL");
		}

		if(testreportsetupactioni == testreportsetupactionlist.size()-1) {t.addTstRptStupActnOprtnMsg("]");}


		/******************** testreportsetupactionoperationresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreportsetupactionoperationresult = testreportsetupactionoperation.getResult();
		if(testreportsetupactionoperationresult!=null) {
		if(testreportsetupactioni == 0) {

		t.addTstRptStupActnOprtnRslt("[");		}
			t.addTstRptStupActnOprtnRslt(testreportsetupactionoperationresult.toCode());
		if(testreportsetupactioni == testreportsetupactionlist.size()-1) {

		t.addTstRptStupActnOprtnRslt("]");		}

		} else {
			t.addTstRptStupActnOprtnRslt("NULL");
		}

		/******************** TstRpt_Stup_Actn_Oprtn_Dtl ********************************************************************************/
		if(testreportsetupactioni == 0) {t.addTstRptStupActnOprtnDtl("[");}
		if(testreportsetupactionoperation.hasDetail()) {

			t.addTstRptStupActnOprtnDtl(String.valueOf(testreportsetupactionoperation.getDetail()));
		} else {
			t.addTstRptStupActnOprtnDtl("NULL");
		}

		if(testreportsetupactioni == testreportsetupactionlist.size()-1) {t.addTstRptStupActnOprtnDtl("]");}


		/******************** testreportsetupactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent testreportsetupactionassert = testreportsetupaction.getAssert();

		/******************** TstRpt_Stup_Actn_Assert_Msg ********************************************************************************/
		if(testreportsetupactioni == 0) {t.addTstRptStupActnAssertMsg("[");}
		if(testreportsetupactionassert.hasMessage()) {

			t.addTstRptStupActnAssertMsg(String.valueOf(testreportsetupactionassert.getMessage()));
		} else {
			t.addTstRptStupActnAssertMsg("NULL");
		}

		if(testreportsetupactioni == testreportsetupactionlist.size()-1) {t.addTstRptStupActnAssertMsg("]");}


		/******************** testreportsetupactionassertresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreportsetupactionassertresult = testreportsetupactionassert.getResult();
		if(testreportsetupactionassertresult!=null) {
		if(testreportsetupactioni == 0) {

		t.addTstRptStupActnAssertRslt("[");		}
			t.addTstRptStupActnAssertRslt(testreportsetupactionassertresult.toCode());
		if(testreportsetupactioni == testreportsetupactionlist.size()-1) {

		t.addTstRptStupActnAssertRslt("]");		}

		} else {
			t.addTstRptStupActnAssertRslt("NULL");
		}

		/******************** TstRpt_Stup_Actn_Assert_Dtl ********************************************************************************/
		if(testreportsetupactioni == 0) {t.addTstRptStupActnAssertDtl("[");}
		if(testreportsetupactionassert.hasDetail()) {

			t.addTstRptStupActnAssertDtl(String.valueOf(testreportsetupactionassert.getDetail()));
		} else {
			t.addTstRptStupActnAssertDtl("NULL");
		}

		if(testreportsetupactioni == testreportsetupactionlist.size()-1) {t.addTstRptStupActnAssertDtl("]");}


		 };
		/******************** TstRpt_Score ********************************************************************************/
		if(testreport.hasScore()) {

			t.addTstRptScore(String.valueOf(testreport.getScore()));
		} else {
			t.addTstRptScore("NULL");
		}


		/******************** TstRpt_Tster ********************************************************************************/
		if(testreport.hasTester()) {

			t.addTstRptTster(String.valueOf(testreport.getTester()));
		} else {
			t.addTstRptTster("NULL");
		}


		/******************** testreportteardown ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportTeardownComponent testreportteardown = testreport.getTeardown();

		/******************** testreportteardownaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestReport.TeardownActionComponent> testreportteardownactionlist = testreportteardown.getAction();
		for(int testreportteardownactioni = 0; testreportteardownactioni<testreportteardownactionlist.size();testreportteardownactioni++ ) {
		org.hl7.fhir.r4.model.TestReport.TeardownActionComponent  testreportteardownaction = testreportteardownactionlist.get(testreportteardownactioni);

		/******************** testreportteardownactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent testreportteardownactionoperation = testreportteardownaction.getOperation();

		/******************** TstRpt_Teardown_Actn_Oprtn_Msg ********************************************************************************/
		if(testreportteardownactioni == 0) {t.addTstRptTeardownActnOprtnMsg("[");}
		if(testreportteardownactionoperation.hasMessage()) {

			t.addTstRptTeardownActnOprtnMsg(String.valueOf(testreportteardownactionoperation.getMessage()));
		} else {
			t.addTstRptTeardownActnOprtnMsg("NULL");
		}

		if(testreportteardownactioni == testreportteardownactionlist.size()-1) {t.addTstRptTeardownActnOprtnMsg("]");}


		/******************** testreportteardownactionoperationresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreportteardownactionoperationresult = testreportteardownactionoperation.getResult();
		if(testreportteardownactionoperationresult!=null) {
		if(testreportteardownactioni == 0) {

		t.addTstRptTeardownActnOprtnRslt("[");		}
			t.addTstRptTeardownActnOprtnRslt(testreportteardownactionoperationresult.toCode());
		if(testreportteardownactioni == testreportteardownactionlist.size()-1) {

		t.addTstRptTeardownActnOprtnRslt("]");		}

		} else {
			t.addTstRptTeardownActnOprtnRslt("NULL");
		}

		/******************** TstRpt_Teardown_Actn_Oprtn_Dtl ********************************************************************************/
		if(testreportteardownactioni == 0) {t.addTstRptTeardownActnOprtnDtl("[");}
		if(testreportteardownactionoperation.hasDetail()) {

			t.addTstRptTeardownActnOprtnDtl(String.valueOf(testreportteardownactionoperation.getDetail()));
		} else {
			t.addTstRptTeardownActnOprtnDtl("NULL");
		}

		if(testreportteardownactioni == testreportteardownactionlist.size()-1) {t.addTstRptTeardownActnOprtnDtl("]");}


		 };
		/******************** testreporttest ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestReport.TestReportTestComponent> testreporttestlist = testreport.getTest();
		for(int testreporttesti = 0; testreporttesti<testreporttestlist.size();testreporttesti++ ) {
		org.hl7.fhir.r4.model.TestReport.TestReportTestComponent  testreporttest = testreporttestlist.get(testreporttesti);

		/******************** TstRpt_Tst_Nm ********************************************************************************/
		if(testreporttesti == 0) {t.addTstRptTstNm("[");}
		if(testreporttest.hasName()) {

			t.addTstRptTstNm(String.valueOf(testreporttest.getName()));
		} else {
			t.addTstRptTstNm("NULL");
		}

		if(testreporttesti == testreporttestlist.size()-1) {t.addTstRptTstNm("]");}


		/******************** testreporttestaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestReport.TestActionComponent> testreporttestactionlist = testreporttest.getAction();
		for(int testreporttestactioni = 0; testreporttestactioni<testreporttestactionlist.size();testreporttestactioni++ ) {
		org.hl7.fhir.r4.model.TestReport.TestActionComponent  testreporttestaction = testreporttestactionlist.get(testreporttestactioni);

		/******************** testreporttestactionoperation ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionOperationComponent testreporttestactionoperation = testreporttestaction.getOperation();

		/******************** TstRpt_Tst_Actn_Oprtn_Msg ********************************************************************************/
		if(testreporttestactioni == 0) {t.addTstRptTstActnOprtnMsg("[[");}
		if(testreporttestactionoperation.hasMessage()) {

			t.addTstRptTstActnOprtnMsg(String.valueOf(testreporttestactionoperation.getMessage()));
		} else {
			t.addTstRptTstActnOprtnMsg("NULL");
		}

		if(testreporttestactioni == testreporttestactionlist.size()-1) {t.addTstRptTstActnOprtnMsg("]]");}


		/******************** testreporttestactionoperationresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreporttestactionoperationresult = testreporttestactionoperation.getResult();
		if(testreporttestactionoperationresult!=null) {
		if(testreporttestactioni == 0) {

		t.addTstRptTstActnOprtnRslt("[[");		}
			t.addTstRptTstActnOprtnRslt(testreporttestactionoperationresult.toCode());
		if(testreporttestactioni == testreporttestactionlist.size()-1) {

		t.addTstRptTstActnOprtnRslt("]]");		}

		} else {
			t.addTstRptTstActnOprtnRslt("NULL");
		}

		/******************** TstRpt_Tst_Actn_Oprtn_Dtl ********************************************************************************/
		if(testreporttestactioni == 0) {t.addTstRptTstActnOprtnDtl("[[");}
		if(testreporttestactionoperation.hasDetail()) {

			t.addTstRptTstActnOprtnDtl(String.valueOf(testreporttestactionoperation.getDetail()));
		} else {
			t.addTstRptTstActnOprtnDtl("NULL");
		}

		if(testreporttestactioni == testreporttestactionlist.size()-1) {t.addTstRptTstActnOprtnDtl("]]");}


		/******************** testreporttestactionassert ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.SetupActionAssertComponent testreporttestactionassert = testreporttestaction.getAssert();

		/******************** TstRpt_Tst_Actn_Assert_Msg ********************************************************************************/
		if(testreporttestactioni == 0) {t.addTstRptTstActnAssertMsg("[[");}
		if(testreporttestactionassert.hasMessage()) {

			t.addTstRptTstActnAssertMsg(String.valueOf(testreporttestactionassert.getMessage()));
		} else {
			t.addTstRptTstActnAssertMsg("NULL");
		}

		if(testreporttestactioni == testreporttestactionlist.size()-1) {t.addTstRptTstActnAssertMsg("]]");}


		/******************** testreporttestactionassertresult ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportActionResult testreporttestactionassertresult = testreporttestactionassert.getResult();
		if(testreporttestactionassertresult!=null) {
		if(testreporttestactioni == 0) {

		t.addTstRptTstActnAssertRslt("[[");		}
			t.addTstRptTstActnAssertRslt(testreporttestactionassertresult.toCode());
		if(testreporttestactioni == testreporttestactionlist.size()-1) {

		t.addTstRptTstActnAssertRslt("]]");		}

		} else {
			t.addTstRptTstActnAssertRslt("NULL");
		}

		/******************** TstRpt_Tst_Actn_Assert_Dtl ********************************************************************************/
		if(testreporttestactioni == 0) {t.addTstRptTstActnAssertDtl("[[");}
		if(testreporttestactionassert.hasDetail()) {

			t.addTstRptTstActnAssertDtl(String.valueOf(testreporttestactionassert.getDetail()));
		} else {
			t.addTstRptTstActnAssertDtl("NULL");
		}

		if(testreporttestactioni == testreporttestactionlist.size()-1) {t.addTstRptTstActnAssertDtl("]]");}


		 };
		/******************** TstRpt_Tst_Dscrptn ********************************************************************************/
		if(testreporttest.hasDescription()) {

			t.addTstRptTstDscrptn(String.valueOf(testreporttest.getDescription()));
		} else {
			t.addTstRptTstDscrptn("NULL");
		}


		 };
		/******************** TstRpt_Issued ********************************************************************************/
		if(testreport.hasIssued()) {

			t.addTstRptIssued("\""+ca.uhn.fhir.util.DateUtils.formatDate(testreport.getIssued())+"\"");
		} else {
			t.addTstRptIssued("NULL");
		}


		/******************** testreportparticipant ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.TestReport.TestReportParticipantComponent> testreportparticipantlist = testreport.getParticipant();
		for(int testreportparticipanti = 0; testreportparticipanti<testreportparticipantlist.size();testreportparticipanti++ ) {
		org.hl7.fhir.r4.model.TestReport.TestReportParticipantComponent  testreportparticipant = testreportparticipantlist.get(testreportparticipanti);

		/******************** testreportparticipanttype ********************************************************************************/
		org.hl7.fhir.r4.model.TestReport.TestReportParticipantType testreportparticipanttype = testreportparticipant.getType();
		if(testreportparticipanttype!=null) {
		if(testreportparticipanti == 0) {

		t.addTstRptPrtcpntTyp("[");		}
			t.addTstRptPrtcpntTyp(testreportparticipanttype.toCode());
		if(testreportparticipanti == testreportparticipantlist.size()-1) {

		t.addTstRptPrtcpntTyp("]");		}

		} else {
			t.addTstRptPrtcpntTyp("NULL");
		}

		/******************** TstRpt_Prtcpnt_Uri ********************************************************************************/
		if(testreportparticipanti == 0) {t.addTstRptPrtcpntUri("[");}
		if(testreportparticipant.hasUri()) {

			t.addTstRptPrtcpntUri(String.valueOf(testreportparticipant.getUri()));
		} else {
			t.addTstRptPrtcpntUri("NULL");
		}

		if(testreportparticipanti == testreportparticipantlist.size()-1) {t.addTstRptPrtcpntUri("]");}


		 };
		return t;
	}
}
