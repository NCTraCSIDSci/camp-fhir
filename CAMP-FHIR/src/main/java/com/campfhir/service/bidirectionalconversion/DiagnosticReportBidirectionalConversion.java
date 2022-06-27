package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DiagnosticReport;
public class DiagnosticReportBidirectionalConversion 
{
	public DiagnosticReport DiagnosticReports(org.hl7.fhir.r4.model.DiagnosticReport diagnosticreport) throws ParseException
	{
		 main.java.com.campfhir.model.DiagnosticReport d = new  main.java.com.campfhir.model.DiagnosticReport();

		/******************** id ********************************************************************************/
		diagnosticreport.setId(d.getId());

		/******************** diagnosticreportcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportcode = diagnosticreport.getCode();

		/******************** DiagnosticRpt_Cd_Txt ********************************************************************************/
		if(diagnosticreportcode.hasText()) {
			d.setDiagnosticRptCdTxt(String.valueOf(diagnosticreportcode.getText()));
		}
		/******************** diagnosticreportcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding diagnosticreportcodecoding = diagnosticreportcode.getCodingFirstRep();

		/******************** DiagnosticRpt_Cd_Cdg_Vrsn ********************************************************************************/
		if(diagnosticreportcodecoding.hasVersion()) {
			d.setDiagnosticRptCdCdgVrsn(String.valueOf(diagnosticreportcodecoding.getVersion()));
		}
		/******************** DiagnosticRpt_Cd_Cdg_Dsply ********************************************************************************/
		if(diagnosticreportcodecoding.hasDisplay()) {
			d.setDiagnosticRptCdCdgDsply(String.valueOf(diagnosticreportcodecoding.getDisplay()));
		}
		/******************** DiagnosticRpt_Cd_Cdg_Cd ********************************************************************************/
		if(diagnosticreportcodecoding.hasCode()) {
			d.setDiagnosticRptCdCdgCd(String.valueOf(diagnosticreportcodecoding.getCode()));
		}
		/******************** DiagnosticRpt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(diagnosticreportcodecoding.hasUserSelected()) {
			d.setDiagnosticRptCdCdgUsrSltd(String.valueOf(diagnosticreportcodecoding.getUserSelected()));
		}
		/******************** DiagnosticRpt_Cd_Cdg_Sys ********************************************************************************/
		if(diagnosticreportcodecoding.hasSystem()) {
			d.setDiagnosticRptCdCdgSys(String.valueOf(diagnosticreportcodecoding.getSystem()));
		}
		/******************** DiagnosticRpt_Issued ********************************************************************************/
		if(diagnosticreport.hasIssued()) {
			d.setDiagnosticRptIssued(String.valueOf(diagnosticreport.getIssued()));
		}
		/******************** DiagnosticRpt_Enc ********************************************************************************/
		if(diagnosticreport.hasEncounter()) {
			d.setDiagnosticRptEnc(String.valueOf(diagnosticreport.getEncounter()));
		}
		/******************** DiagnosticRpt_Sbjct ********************************************************************************/
		if(diagnosticreport.hasSubject()) {
			d.setDiagnosticRptSbjct(String.valueOf(diagnosticreport.getSubject()));
		}
		/******************** diagnosticreportstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportStatus diagnosticreportstatus = diagnosticreport.getStatus();
		d.setDiagnosticRptSts(diagnosticreportstatus.toCode());

		/******************** DiagnosticRpt_BasedOn ********************************************************************************/
		if(diagnosticreport.hasBasedOn()) {
			d.setDiagnosticRptBasedOn(String.valueOf(diagnosticreport.getBasedOnFirstRep()));
		}
		/******************** diagnosticreporteffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period diagnosticreporteffectiveperiod = diagnosticreport.getEffectivePeriod();

		/******************** DiagnosticRpt_EfctivePrd_Strt ********************************************************************************/
		if(diagnosticreporteffectiveperiod.hasStart()) {
			d.setDiagnosticRptEfctivePrdStrt(String.valueOf(diagnosticreporteffectiveperiod.getStart()));
		}
		/******************** DiagnosticRpt_EfctivePrd_End ********************************************************************************/
		if(diagnosticreporteffectiveperiod.hasEnd()) {
			d.setDiagnosticRptEfctivePrdEnd(String.valueOf(diagnosticreporteffectiveperiod.getEnd()));
		}
		/******************** DiagnosticRpt_Rslt ********************************************************************************/
		if(diagnosticreport.hasResult()) {
			d.setDiagnosticRptRslt(String.valueOf(diagnosticreport.getResultFirstRep()));
		}
		/******************** DiagnosticRpt_Conclusion ********************************************************************************/
		if(diagnosticreport.hasConclusion()) {
			d.setDiagnosticRptConclusion(String.valueOf(diagnosticreport.getConclusion()));
		}
		/******************** diagnosticreportmedia ********************************************************************************/
		org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportMediaComponent diagnosticreportmedia = diagnosticreport.getMediaFirstRep();

		/******************** DiagnosticRpt_Media_Comment ********************************************************************************/
		if(diagnosticreportmedia.hasComment()) {
			d.setDiagnosticRptMediaComment(String.valueOf(diagnosticreportmedia.getComment()));
		}
		/******************** DiagnosticRpt_Media_Link ********************************************************************************/
		if(diagnosticreportmedia.hasLink()) {
			d.setDiagnosticRptMediaLink(String.valueOf(diagnosticreportmedia.getLink()));
		}
		/******************** diagnosticreportidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier diagnosticreportidentifier = diagnosticreport.getIdentifierFirstRep();

		/******************** DiagnosticRpt_Id_Vl ********************************************************************************/
		if(diagnosticreportidentifier.hasValue()) {
			d.setDiagnosticRptIdVl(String.valueOf(diagnosticreportidentifier.getValue()));
		}
		/******************** diagnosticreportidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportidentifiertype = diagnosticreportidentifier.getType();

		/******************** DiagnosticRpt_Id_Typ_Txt ********************************************************************************/
		if(diagnosticreportidentifiertype.hasText()) {
			d.setDiagnosticRptIdTypTxt(String.valueOf(diagnosticreportidentifiertype.getText()));
		}
		/******************** diagnosticreportidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding diagnosticreportidentifiertypecoding = diagnosticreportidentifiertype.getCodingFirstRep();

		/******************** DiagnosticRpt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(diagnosticreportidentifiertypecoding.hasVersion()) {
			d.setDiagnosticRptIdTypCdgVrsn(String.valueOf(diagnosticreportidentifiertypecoding.getVersion()));
		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(diagnosticreportidentifiertypecoding.hasDisplay()) {
			d.setDiagnosticRptIdTypCdgDsply(String.valueOf(diagnosticreportidentifiertypecoding.getDisplay()));
		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(diagnosticreportidentifiertypecoding.hasCode()) {
			d.setDiagnosticRptIdTypCdgCd(String.valueOf(diagnosticreportidentifiertypecoding.getCode()));
		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(diagnosticreportidentifiertypecoding.hasUserSelected()) {
			d.setDiagnosticRptIdTypCdgUsrSltd(String.valueOf(diagnosticreportidentifiertypecoding.getUserSelected()));
		}
		/******************** DiagnosticRpt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(diagnosticreportidentifiertypecoding.hasSystem()) {
			d.setDiagnosticRptIdTypCdgSys(String.valueOf(diagnosticreportidentifiertypecoding.getSystem()));
		}
		/******************** diagnosticreportidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period diagnosticreportidentifierperiod = diagnosticreportidentifier.getPeriod();

		/******************** DiagnosticRpt_Id_Prd_Strt ********************************************************************************/
		if(diagnosticreportidentifierperiod.hasStart()) {
			d.setDiagnosticRptIdPrdStrt(String.valueOf(diagnosticreportidentifierperiod.getStart()));
		}
		/******************** DiagnosticRpt_Id_Prd_End ********************************************************************************/
		if(diagnosticreportidentifierperiod.hasEnd()) {
			d.setDiagnosticRptIdPrdEnd(String.valueOf(diagnosticreportidentifierperiod.getEnd()));
		}
		/******************** DiagnosticRpt_Id_Assigner ********************************************************************************/
		if(diagnosticreportidentifier.hasAssigner()) {
			d.setDiagnosticRptIdAssigner(String.valueOf(diagnosticreportidentifier.getAssigner()));
		}
		/******************** DiagnosticRpt_Id_Sys ********************************************************************************/
		if(diagnosticreportidentifier.hasSystem()) {
			d.setDiagnosticRptIdSys(String.valueOf(diagnosticreportidentifier.getSystem()));
		}
		/******************** diagnosticreportidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse diagnosticreportidentifieruse = diagnosticreportidentifier.getUse();
		d.setDiagnosticRptIdUse(diagnosticreportidentifieruse.toCode());

		/******************** diagnosticreportcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportcategory = diagnosticreport.getCategoryFirstRep();

		/******************** DiagnosticRpt_Ctgry_Txt ********************************************************************************/
		if(diagnosticreportcategory.hasText()) {
			d.setDiagnosticRptCtgryTxt(String.valueOf(diagnosticreportcategory.getText()));
		}
		/******************** diagnosticreportcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding diagnosticreportcategorycoding = diagnosticreportcategory.getCodingFirstRep();

		/******************** DiagnosticRpt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(diagnosticreportcategorycoding.hasVersion()) {
			d.setDiagnosticRptCtgryCdgVrsn(String.valueOf(diagnosticreportcategorycoding.getVersion()));
		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(diagnosticreportcategorycoding.hasDisplay()) {
			d.setDiagnosticRptCtgryCdgDsply(String.valueOf(diagnosticreportcategorycoding.getDisplay()));
		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Cd ********************************************************************************/
		if(diagnosticreportcategorycoding.hasCode()) {
			d.setDiagnosticRptCtgryCdgCd(String.valueOf(diagnosticreportcategorycoding.getCode()));
		}
		/******************** DiagnosticRpt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(diagnosticreportcategorycoding.hasUserSelected()) {
			d.setDiagnosticRptCtgryCdgUsrSltd(String.valueOf(diagnosticreportcategorycoding.getUserSelected()));
		}
		/******************** DiagnosticRpt_Ctgry_Cdg_Sys ********************************************************************************/
		if(diagnosticreportcategorycoding.hasSystem()) {
			d.setDiagnosticRptCtgryCdgSys(String.valueOf(diagnosticreportcategorycoding.getSystem()));
		}
		/******************** DiagnosticRpt_RsltsInterpreter ********************************************************************************/
		if(diagnosticreport.hasResultsInterpreter()) {
			d.setDiagnosticRptRsltsInterpreter(String.valueOf(diagnosticreport.getResultsInterpreterFirstRep()));
		}
		/******************** DiagnosticRpt_ImgngStdy ********************************************************************************/
		if(diagnosticreport.hasImagingStudy()) {
			d.setDiagnosticRptImgngStdy(String.valueOf(diagnosticreport.getImagingStudyFirstRep()));
		}
		/******************** DiagnosticRpt_EfctiveDtTimeTyp ********************************************************************************/
		if(diagnosticreport.hasEffectiveDateTimeType()) {
			d.setDiagnosticRptEfctiveDtTimeTyp(String.valueOf(diagnosticreport.getEffectiveDateTimeType()));
		}
		/******************** diagnosticreportconclusioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept diagnosticreportconclusioncode = diagnosticreport.getConclusionCodeFirstRep();

		/******************** DiagnosticRpt_ConclusionCd_Txt ********************************************************************************/
		if(diagnosticreportconclusioncode.hasText()) {
			d.setDiagnosticRptConclusionCdTxt(String.valueOf(diagnosticreportconclusioncode.getText()));
		}
		/******************** diagnosticreportconclusioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding diagnosticreportconclusioncodecoding = diagnosticreportconclusioncode.getCodingFirstRep();

		/******************** DiagnosticRpt_ConclusionCd_Cdg_Vrsn ********************************************************************************/
		if(diagnosticreportconclusioncodecoding.hasVersion()) {
			d.setDiagnosticRptConclusionCdCdgVrsn(String.valueOf(diagnosticreportconclusioncodecoding.getVersion()));
		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Dsply ********************************************************************************/
		if(diagnosticreportconclusioncodecoding.hasDisplay()) {
			d.setDiagnosticRptConclusionCdCdgDsply(String.valueOf(diagnosticreportconclusioncodecoding.getDisplay()));
		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Cd ********************************************************************************/
		if(diagnosticreportconclusioncodecoding.hasCode()) {
			d.setDiagnosticRptConclusionCdCdgCd(String.valueOf(diagnosticreportconclusioncodecoding.getCode()));
		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_UsrSltd ********************************************************************************/
		if(diagnosticreportconclusioncodecoding.hasUserSelected()) {
			d.setDiagnosticRptConclusionCdCdgUsrSltd(String.valueOf(diagnosticreportconclusioncodecoding.getUserSelected()));
		}
		/******************** DiagnosticRpt_ConclusionCd_Cdg_Sys ********************************************************************************/
		if(diagnosticreportconclusioncodecoding.hasSystem()) {
			d.setDiagnosticRptConclusionCdCdgSys(String.valueOf(diagnosticreportconclusioncodecoding.getSystem()));
		}
		/******************** DiagnosticRpt_Spcmn ********************************************************************************/
		if(diagnosticreport.hasSpecimen()) {
			d.setDiagnosticRptSpcmn(String.valueOf(diagnosticreport.getSpecimenFirstRep()));
		}
		/******************** diagnosticreportpresentedform ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment diagnosticreportpresentedform = diagnosticreport.getPresentedFormFirstRep();

		/******************** DiagnosticRpt_PresentedFrm_Sz ********************************************************************************/
		if(diagnosticreportpresentedform.hasSize()) {
			d.setDiagnosticRptPresentedFrmSz(String.valueOf(diagnosticreportpresentedform.getSize()));
		}
		/******************** DiagnosticRpt_PresentedFrm_Lnguage ********************************************************************************/
		if(diagnosticreportpresentedform.hasLanguage()) {
			d.setDiagnosticRptPresentedFrmLnguage(String.valueOf(diagnosticreportpresentedform.getLanguage()));
		}
		/******************** DiagnosticRpt_PresentedFrm_CntntTyp ********************************************************************************/
		if(diagnosticreportpresentedform.hasContentType()) {
			d.setDiagnosticRptPresentedFrmCntntTyp(String.valueOf(diagnosticreportpresentedform.getContentType()));
		}
		/******************** DiagnosticRpt_PresentedFrm_Ttl ********************************************************************************/
		if(diagnosticreportpresentedform.hasTitle()) {
			d.setDiagnosticRptPresentedFrmTtl(String.valueOf(diagnosticreportpresentedform.getTitle()));
		}
		/******************** DiagnosticRpt_PresentedFrm_Url ********************************************************************************/
		if(diagnosticreportpresentedform.hasUrl()) {
			d.setDiagnosticRptPresentedFrmUrl(String.valueOf(diagnosticreportpresentedform.getUrl()));
		}
		/******************** DiagnosticRpt_PresentedFrm_Data ********************************************************************************/
		if(diagnosticreportpresentedform.hasData()) {
			d.setDiagnosticRptPresentedFrmData(String.valueOf(diagnosticreportpresentedform.getData()));
		}

		/******************** DiagnosticRpt_PresentedFrm_Hash ********************************************************************************/
		if(diagnosticreportpresentedform.hasHash()) {
			d.setDiagnosticRptPresentedFrmHash(String.valueOf(diagnosticreportpresentedform.getHash()));
		}

		/******************** DiagnosticRpt_PresentedFrm_Creation ********************************************************************************/
		if(diagnosticreportpresentedform.hasCreation()) {
			d.setDiagnosticRptPresentedFrmCreation(String.valueOf(diagnosticreportpresentedform.getCreation()));
		}
		/******************** DiagnosticRpt_Prfrmr ********************************************************************************/
		if(diagnosticreport.hasPerformer()) {
			d.setDiagnosticRptPrfrmr(String.valueOf(diagnosticreport.getPerformerFirstRep()));
		}
		return d;
	}
}
