package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DiagnosticReport;
public class DiagnosticReportConversion 
{
	public org.hl7.fhir.r4.model.DiagnosticReport DiagnosticReports(DiagnosticReport d) throws ParseException
	{
		org.hl7.fhir.r4.model.DiagnosticReport diagnosticreport = new org.hl7.fhir.r4.model.DiagnosticReport();

		/******************** id ********************************************************************************/
		diagnosticreport.setId(d.getId());

		/******************** DiagnosticRpt_BasedOn ********************************************************************************/
		if(d.getDiagnosticRptBasedOn() != null) {
			diagnosticreport.addBasedOn( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptBasedOn()));
		}
		/******************** diagnosticreportcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		diagnosticreport.addCategory(diagnosticreportcategory);

		/******************** diagnosticreportcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding diagnosticreportcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		diagnosticreportcategory.addCoding(diagnosticreportcategorycoding);

		/******************** DiagnosticRpt_Ctgry_Cdg_Cd ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgCd() != null) {
			diagnosticreportcategorycoding.setCode(d.getDiagnosticRptCtgryCdgCd());
		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgDsply() != null) {
			diagnosticreportcategorycoding.setDisplay(d.getDiagnosticRptCtgryCdgDsply());
		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Sys ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgSys() != null) {
			diagnosticreportcategorycoding.setSystem(d.getDiagnosticRptCtgryCdgSys());
		}
		/******************** DiagnosticRpt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgUsrSltd() != null) {
			diagnosticreportcategorycoding.setUserSelected(Boolean.parseBoolean(d.getDiagnosticRptCtgryCdgUsrSltd()));
		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(d.getDiagnosticRptCtgryCdgVrsn() != null) {
			diagnosticreportcategorycoding.setVersion(d.getDiagnosticRptCtgryCdgVrsn());
		}
		/******************** DiagnosticRpt_Ctgry_Txt ********************************************************************************/
		if(d.getDiagnosticRptCtgryTxt() != null) {
			diagnosticreportcategory.setText(d.getDiagnosticRptCtgryTxt());
		}
		/******************** diagnosticreportcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		diagnosticreport.setCode(diagnosticreportcode);

		/******************** diagnosticreportcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding diagnosticreportcodecoding =  new org.hl7.fhir.r4.model.Coding();
		diagnosticreportcode.addCoding(diagnosticreportcodecoding);

		/******************** DiagnosticRpt_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDiagnosticRptCdCdgCd() != null) {
			diagnosticreportcodecoding.setCode(d.getDiagnosticRptCdCdgCd());
		}
		/******************** DiagnosticRpt_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDiagnosticRptCdCdgDsply() != null) {
			diagnosticreportcodecoding.setDisplay(d.getDiagnosticRptCdCdgDsply());
		}
		/******************** DiagnosticRpt_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDiagnosticRptCdCdgSys() != null) {
			diagnosticreportcodecoding.setSystem(d.getDiagnosticRptCdCdgSys());
		}
		/******************** DiagnosticRpt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDiagnosticRptCdCdgUsrSltd() != null) {
			diagnosticreportcodecoding.setUserSelected(Boolean.parseBoolean(d.getDiagnosticRptCdCdgUsrSltd()));
		}
		/******************** DiagnosticRpt_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDiagnosticRptCdCdgVrsn() != null) {
			diagnosticreportcodecoding.setVersion(d.getDiagnosticRptCdCdgVrsn());
		}
		/******************** DiagnosticRpt_Cd_Txt ********************************************************************************/
		if(d.getDiagnosticRptCdTxt() != null) {
			diagnosticreportcode.setText(d.getDiagnosticRptCdTxt());
		}
		/******************** DiagnosticRpt_Conclusion ********************************************************************************/
		if(d.getDiagnosticRptConclusion() != null) {
			diagnosticreport.setConclusion(d.getDiagnosticRptConclusion());
		}
		/******************** diagnosticreportconclusioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportconclusioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		diagnosticreport.addConclusionCode(diagnosticreportconclusioncode);

		/******************** diagnosticreportconclusioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding diagnosticreportconclusioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		diagnosticreportconclusioncode.addCoding(diagnosticreportconclusioncodecoding);

		/******************** DiagnosticRpt_ConclusionCd_Cdg_Cd ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgCd() != null) {
			diagnosticreportconclusioncodecoding.setCode(d.getDiagnosticRptConclusionCdCdgCd());
		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Dsply ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgDsply() != null) {
			diagnosticreportconclusioncodecoding.setDisplay(d.getDiagnosticRptConclusionCdCdgDsply());
		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Sys ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgSys() != null) {
			diagnosticreportconclusioncodecoding.setSystem(d.getDiagnosticRptConclusionCdCdgSys());
		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgUsrSltd() != null) {
			diagnosticreportconclusioncodecoding.setUserSelected(Boolean.parseBoolean(d.getDiagnosticRptConclusionCdCdgUsrSltd()));
		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Vrsn ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdCdgVrsn() != null) {
			diagnosticreportconclusioncodecoding.setVersion(d.getDiagnosticRptConclusionCdCdgVrsn());
		}
		/******************** DiagnosticRpt_ConclusionCd_Txt ********************************************************************************/
		if(d.getDiagnosticRptConclusionCdTxt() != null) {
			diagnosticreportconclusioncode.setText(d.getDiagnosticRptConclusionCdTxt());
		}
		/******************** DiagnosticRpt_EfctiveDtTimeTyp ********************************************************************************/
		if(d.getDiagnosticRptEfctiveDtTimeTyp() != null) {
			diagnosticreport.setEffective( new org.hl7.fhir.r4.model.DateTimeType(d.getDiagnosticRptEfctiveDtTimeTyp()));
		}
		/******************** diagnosticreporteffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period diagnosticreporteffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		diagnosticreport.setEffective(diagnosticreporteffectiveperiod);

		/******************** DiagnosticRpt_EfctivePrd_End ********************************************************************************/
		if(d.getDiagnosticRptEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat DiagnosticRpt_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DiagnosticRpt_EfctivePrd_Enddate = DiagnosticRpt_EfctivePrd_Endsdf.parse(d.getDiagnosticRptEfctivePrdEnd());
			diagnosticreporteffectiveperiod.setEnd(DiagnosticRpt_EfctivePrd_Enddate);
		}
		/******************** DiagnosticRpt_EfctivePrd_Strt ********************************************************************************/
		if(d.getDiagnosticRptEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat DiagnosticRpt_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DiagnosticRpt_EfctivePrd_Strtdate = DiagnosticRpt_EfctivePrd_Strtsdf.parse(d.getDiagnosticRptEfctivePrdStrt());
			diagnosticreporteffectiveperiod.setStart(DiagnosticRpt_EfctivePrd_Strtdate);
		}
		/******************** DiagnosticRpt_Enc ********************************************************************************/
		if(d.getDiagnosticRptEnc() != null) {
			diagnosticreport.setEncounter( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptEnc()));
		}
		/******************** diagnosticreportidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier diagnosticreportidentifier =  new org.hl7.fhir.r4.model.Identifier();
		diagnosticreport.addIdentifier(diagnosticreportidentifier);

		/******************** DiagnosticRpt_Id_Assigner ********************************************************************************/
		if(d.getDiagnosticRptIdAssigner() != null) {
			diagnosticreportidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptIdAssigner()));
		}
		/******************** diagnosticreportidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period diagnosticreportidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		diagnosticreportidentifier.setPeriod(diagnosticreportidentifierperiod);

		/******************** DiagnosticRpt_Id_Prd_End ********************************************************************************/
		if(d.getDiagnosticRptIdPrdEnd() != null) {
			java.text.SimpleDateFormat DiagnosticRpt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DiagnosticRpt_Id_Prd_Enddate = DiagnosticRpt_Id_Prd_Endsdf.parse(d.getDiagnosticRptIdPrdEnd());
			diagnosticreportidentifierperiod.setEnd(DiagnosticRpt_Id_Prd_Enddate);
		}
		/******************** DiagnosticRpt_Id_Prd_Strt ********************************************************************************/
		if(d.getDiagnosticRptIdPrdStrt() != null) {
			java.text.SimpleDateFormat DiagnosticRpt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DiagnosticRpt_Id_Prd_Strtdate = DiagnosticRpt_Id_Prd_Strtsdf.parse(d.getDiagnosticRptIdPrdStrt());
			diagnosticreportidentifierperiod.setStart(DiagnosticRpt_Id_Prd_Strtdate);
		}
		/******************** DiagnosticRpt_Id_Sys ********************************************************************************/
		if(d.getDiagnosticRptIdSys() != null) {
			diagnosticreportidentifier.setSystem(d.getDiagnosticRptIdSys());
		}
		/******************** diagnosticreportidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		diagnosticreportidentifier.setType(diagnosticreportidentifiertype);

		/******************** diagnosticreportidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding diagnosticreportidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		diagnosticreportidentifiertype.addCoding(diagnosticreportidentifiertypecoding);

		/******************** DiagnosticRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgCd() != null) {
			diagnosticreportidentifiertypecoding.setCode(d.getDiagnosticRptIdTypCdgCd());
		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgDsply() != null) {
			diagnosticreportidentifiertypecoding.setDisplay(d.getDiagnosticRptIdTypCdgDsply());
		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgSys() != null) {
			diagnosticreportidentifiertypecoding.setSystem(d.getDiagnosticRptIdTypCdgSys());
		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgUsrSltd() != null) {
			diagnosticreportidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDiagnosticRptIdTypCdgUsrSltd()));
		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDiagnosticRptIdTypCdgVrsn() != null) {
			diagnosticreportidentifiertypecoding.setVersion(d.getDiagnosticRptIdTypCdgVrsn());
		}
		/******************** DiagnosticRpt_Id_Typ_Txt ********************************************************************************/
		if(d.getDiagnosticRptIdTypTxt() != null) {
			diagnosticreportidentifiertype.setText(d.getDiagnosticRptIdTypTxt());
		}
		/******************** diagnosticreportidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory diagnosticreportidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		diagnosticreportidentifier.setUse(diagnosticreportidentifieruse.fromCode(d.getDiagnosticRptIdUse()));

		/******************** DiagnosticRpt_Id_Vl ********************************************************************************/
		if(d.getDiagnosticRptIdVl() != null) {
			diagnosticreportidentifier.setValue(d.getDiagnosticRptIdVl());
		}
		/******************** DiagnosticRpt_ImgngStdy ********************************************************************************/
		if(d.getDiagnosticRptImgngStdy() != null) {
			diagnosticreport.addImagingStudy( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptImgngStdy()));
		}
		/******************** DiagnosticRpt_Issued ********************************************************************************/
		if(d.getDiagnosticRptIssued() != null) {
			java.text.SimpleDateFormat DiagnosticRpt_Issuedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DiagnosticRpt_Issueddate = DiagnosticRpt_Issuedsdf.parse(d.getDiagnosticRptIssued());
			diagnosticreport.setIssued(DiagnosticRpt_Issueddate);
		}
		/******************** diagnosticreportmedia ********************************************************************************/
		org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportMediaComponent diagnosticreportmedia =  new org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportMediaComponent();
		diagnosticreport.addMedia(diagnosticreportmedia);

		/******************** DiagnosticRpt_Media_Comment ********************************************************************************/
		if(d.getDiagnosticRptMediaComment() != null) {
			diagnosticreportmedia.setComment(d.getDiagnosticRptMediaComment());
		}
		/******************** DiagnosticRpt_Media_Link ********************************************************************************/
		if(d.getDiagnosticRptMediaLink() != null) {
			diagnosticreportmedia.setLink( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptMediaLink()));
		}
		/******************** DiagnosticRpt_Prfrmr ********************************************************************************/
		if(d.getDiagnosticRptPrfrmr() != null) {
			diagnosticreport.addPerformer( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptPrfrmr()));
		}
		/******************** diagnosticreportpresentedform ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment diagnosticreportpresentedform =  new org.hl7.fhir.r4.model.Attachment();
		diagnosticreport.addPresentedForm(diagnosticreportpresentedform);

		/******************** DiagnosticRpt_PresentedFrm_CntntTyp ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmCntntTyp() != null) {
			diagnosticreportpresentedform.setContentType(d.getDiagnosticRptPresentedFrmCntntTyp());
		}
		/******************** DiagnosticRpt_PresentedFrm_Creation ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmCreation() != null) {
			java.text.SimpleDateFormat DiagnosticRpt_PresentedFrm_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DiagnosticRpt_PresentedFrm_Creationdate = DiagnosticRpt_PresentedFrm_Creationsdf.parse(d.getDiagnosticRptPresentedFrmCreation());
			diagnosticreportpresentedform.setCreation(DiagnosticRpt_PresentedFrm_Creationdate);
		}
		/******************** DiagnosticRpt_PresentedFrm_Data ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmData() != null) {
			diagnosticreportpresentedform.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDiagnosticRptPresentedFrmData()));
		}
		/******************** DiagnosticRpt_PresentedFrm_Hash ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmHash() != null) {
			diagnosticreportpresentedform.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(d.getDiagnosticRptPresentedFrmHash()));
		}
		/******************** DiagnosticRpt_PresentedFrm_Lnguage ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmLnguage() != null) {
			diagnosticreportpresentedform.setLanguage(d.getDiagnosticRptPresentedFrmLnguage());
		}
		/******************** DiagnosticRpt_PresentedFrm_Sz ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmSz() != null) {
			diagnosticreportpresentedform.setSize(Integer.parseInt(d.getDiagnosticRptPresentedFrmSz()));
		}
		/******************** DiagnosticRpt_PresentedFrm_Ttl ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmTtl() != null) {
			diagnosticreportpresentedform.setTitle(d.getDiagnosticRptPresentedFrmTtl());
		}
		/******************** DiagnosticRpt_PresentedFrm_Url ********************************************************************************/
		if(d.getDiagnosticRptPresentedFrmUrl() != null) {
			diagnosticreportpresentedform.setUrl(d.getDiagnosticRptPresentedFrmUrl());
		}
		/******************** DiagnosticRpt_Rslt ********************************************************************************/
		if(d.getDiagnosticRptRslt() != null) {
			diagnosticreport.addResult( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptRslt()));
		}
		/******************** DiagnosticRpt_RsltsInterpreter ********************************************************************************/
		if(d.getDiagnosticRptRsltsInterpreter() != null) {
			diagnosticreport.addResultsInterpreter( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptRsltsInterpreter()));
		}
		/******************** DiagnosticRpt_Spcmn ********************************************************************************/
		if(d.getDiagnosticRptSpcmn() != null) {
			diagnosticreport.addSpecimen( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptSpcmn()));
		}
		/******************** diagnosticreportstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportStatusEnumFactory diagnosticreportstatus =  new org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportStatusEnumFactory();
		diagnosticreport.setStatus(diagnosticreportstatus.fromCode(d.getDiagnosticRptSts()));

		/******************** DiagnosticRpt_Sbjct ********************************************************************************/
		if(d.getDiagnosticRptSbjct() != null) {
			diagnosticreport.setSubject( new org.hl7.fhir.r4.model.Reference(d.getDiagnosticRptSbjct()));
		}
		return diagnosticreport;
	}
}
