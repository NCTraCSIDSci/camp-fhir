package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DetectedIssue;
public class DetectedIssueBidirectionalConversion 
{
	public DetectedIssue DetectedIssues(org.hl7.fhir.r4.model.DetectedIssue detectedissue) throws ParseException
	{
		 main.java.com.campfhir.model.DetectedIssue d = new  main.java.com.campfhir.model.DetectedIssue();

		/******************** id ********************************************************************************/
		detectedissue.setId(d.getId());

		/******************** DetectedIssue_Rfrnc ********************************************************************************/
		if(detectedissue.hasReference()) {
			d.setDetectedIssueRfrnc(String.valueOf(detectedissue.getReference()));
		}
		/******************** detectedissuecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissuecode = detectedissue.getCode();

		/******************** detectedissuecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding detectedissuecodecoding = detectedissuecode.getCodingFirstRep();

		/******************** DetectedIssue_Cd_Cdg_Dsply ********************************************************************************/
		if(detectedissuecodecoding.hasDisplay()) {
			d.setDetectedIssueCdCdgDsply(String.valueOf(detectedissuecodecoding.getDisplay()));
		}
		/******************** DetectedIssue_Cd_Cdg_Vrsn ********************************************************************************/
		if(detectedissuecodecoding.hasVersion()) {
			d.setDetectedIssueCdCdgVrsn(String.valueOf(detectedissuecodecoding.getVersion()));
		}
		/******************** DetectedIssue_Cd_Cdg_Cd ********************************************************************************/
		if(detectedissuecodecoding.hasCode()) {
			d.setDetectedIssueCdCdgCd(String.valueOf(detectedissuecodecoding.getCode()));
		}
		/******************** DetectedIssue_Cd_Cdg_Sys ********************************************************************************/
		if(detectedissuecodecoding.hasSystem()) {
			d.setDetectedIssueCdCdgSys(String.valueOf(detectedissuecodecoding.getSystem()));
		}
		/******************** DetectedIssue_Cd_Cdg_UsrSltd ********************************************************************************/
		if(detectedissuecodecoding.hasUserSelected()) {
			d.setDetectedIssueCdCdgUsrSltd(String.valueOf(detectedissuecodecoding.getUserSelected()));
		}
		/******************** DetectedIssue_Cd_Txt ********************************************************************************/
		if(detectedissuecode.hasText()) {
			d.setDetectedIssueCdTxt(String.valueOf(detectedissuecode.getText()));
		}
		/******************** detectedissueidentifiedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period detectedissueidentifiedperiod = detectedissue.getIdentifiedPeriod();

		/******************** DetectedIssue_IdentifiedPrd_End ********************************************************************************/
		if(detectedissueidentifiedperiod.hasEnd()) {
			d.setDetectedIssueIdentifiedPrdEnd(String.valueOf(detectedissueidentifiedperiod.getEnd()));
		}
		/******************** DetectedIssue_IdentifiedPrd_Strt ********************************************************************************/
		if(detectedissueidentifiedperiod.hasStart()) {
			d.setDetectedIssueIdentifiedPrdStrt(String.valueOf(detectedissueidentifiedperiod.getStart()));
		}
		/******************** DetectedIssue_IdentifiedDtTimeTyp ********************************************************************************/
		if(detectedissue.hasIdentifiedDateTimeType()) {
			d.setDetectedIssueIdentifiedDtTimeTyp(String.valueOf(detectedissue.getIdentifiedDateTimeType()));
		}
		/******************** detectedissuemitigation ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueMitigationComponent detectedissuemitigation = detectedissue.getMitigationFirstRep();

		/******************** detectedissuemitigationaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissuemitigationaction = detectedissuemitigation.getAction();

		/******************** detectedissuemitigationactioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding detectedissuemitigationactioncoding = detectedissuemitigationaction.getCodingFirstRep();

		/******************** DetectedIssue_Mitigation_Actn_Cdg_Dsply ********************************************************************************/
		if(detectedissuemitigationactioncoding.hasDisplay()) {
			d.setDetectedIssueMitigationActnCdgDsply(String.valueOf(detectedissuemitigationactioncoding.getDisplay()));
		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Vrsn ********************************************************************************/
		if(detectedissuemitigationactioncoding.hasVersion()) {
			d.setDetectedIssueMitigationActnCdgVrsn(String.valueOf(detectedissuemitigationactioncoding.getVersion()));
		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Cd ********************************************************************************/
		if(detectedissuemitigationactioncoding.hasCode()) {
			d.setDetectedIssueMitigationActnCdgCd(String.valueOf(detectedissuemitigationactioncoding.getCode()));
		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Sys ********************************************************************************/
		if(detectedissuemitigationactioncoding.hasSystem()) {
			d.setDetectedIssueMitigationActnCdgSys(String.valueOf(detectedissuemitigationactioncoding.getSystem()));
		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_UsrSltd ********************************************************************************/
		if(detectedissuemitigationactioncoding.hasUserSelected()) {
			d.setDetectedIssueMitigationActnCdgUsrSltd(String.valueOf(detectedissuemitigationactioncoding.getUserSelected()));
		}
		/******************** DetectedIssue_Mitigation_Actn_Txt ********************************************************************************/
		if(detectedissuemitigationaction.hasText()) {
			d.setDetectedIssueMitigationActnTxt(String.valueOf(detectedissuemitigationaction.getText()));
		}
		/******************** DetectedIssue_Mitigation_Dt ********************************************************************************/
		if(detectedissuemitigation.hasDate()) {
			d.setDetectedIssueMitigationDt(String.valueOf(detectedissuemitigation.getDate()));
		}
		/******************** DetectedIssue_Mitigation_Athr ********************************************************************************/
		if(detectedissuemitigation.hasAuthor()) {
			d.setDetectedIssueMitigationAthr(String.valueOf(detectedissuemitigation.getAuthor()));
		}
		/******************** DetectedIssue_Implicated ********************************************************************************/
		if(detectedissue.hasImplicated()) {
			d.setDetectedIssueImplicated(String.valueOf(detectedissue.getImplicatedFirstRep()));
		}
		/******************** DetectedIssue_Athr ********************************************************************************/
		if(detectedissue.hasAuthor()) {
			d.setDetectedIssueAthr(String.valueOf(detectedissue.getAuthor()));
		}
		/******************** detectedissuestatus ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueStatus detectedissuestatus = detectedissue.getStatus();
		d.setDetectedIssueSts(detectedissuestatus.toCode());

		/******************** DetectedIssue_Dtl ********************************************************************************/
		if(detectedissue.hasDetail()) {
			d.setDetectedIssueDtl(String.valueOf(detectedissue.getDetail()));
		}
		/******************** detectedissueseverity ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueSeverity detectedissueseverity = detectedissue.getSeverity();
		d.setDetectedIssueSeverity(detectedissueseverity.toCode());

		/******************** DetectedIssue_Pnt ********************************************************************************/
		if(detectedissue.hasPatient()) {
			d.setDetectedIssuePnt(String.valueOf(detectedissue.getPatient()));
		}
		/******************** detectedissueevidence ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueEvidenceComponent detectedissueevidence = detectedissue.getEvidenceFirstRep();

		/******************** DetectedIssue_Evdnce_Dtl ********************************************************************************/
		if(detectedissueevidence.hasDetail()) {
			d.setDetectedIssueEvdnceDtl(String.valueOf(detectedissueevidence.getDetailFirstRep()));
		}
		/******************** detectedissueevidencecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissueevidencecode = detectedissueevidence.getCodeFirstRep();

		/******************** detectedissueevidencecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding detectedissueevidencecodecoding = detectedissueevidencecode.getCodingFirstRep();

		/******************** DetectedIssue_Evdnce_Cd_Cdg_Dsply ********************************************************************************/
		if(detectedissueevidencecodecoding.hasDisplay()) {
			d.setDetectedIssueEvdnceCdCdgDsply(String.valueOf(detectedissueevidencecodecoding.getDisplay()));
		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Vrsn ********************************************************************************/
		if(detectedissueevidencecodecoding.hasVersion()) {
			d.setDetectedIssueEvdnceCdCdgVrsn(String.valueOf(detectedissueevidencecodecoding.getVersion()));
		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Cd ********************************************************************************/
		if(detectedissueevidencecodecoding.hasCode()) {
			d.setDetectedIssueEvdnceCdCdgCd(String.valueOf(detectedissueevidencecodecoding.getCode()));
		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Sys ********************************************************************************/
		if(detectedissueevidencecodecoding.hasSystem()) {
			d.setDetectedIssueEvdnceCdCdgSys(String.valueOf(detectedissueevidencecodecoding.getSystem()));
		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_UsrSltd ********************************************************************************/
		if(detectedissueevidencecodecoding.hasUserSelected()) {
			d.setDetectedIssueEvdnceCdCdgUsrSltd(String.valueOf(detectedissueevidencecodecoding.getUserSelected()));
		}
		/******************** DetectedIssue_Evdnce_Cd_Txt ********************************************************************************/
		if(detectedissueevidencecode.hasText()) {
			d.setDetectedIssueEvdnceCdTxt(String.valueOf(detectedissueevidencecode.getText()));
		}
		/******************** detectedissueidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier detectedissueidentifier = detectedissue.getIdentifierFirstRep();

		/******************** DetectedIssue_Id_Vl ********************************************************************************/
		if(detectedissueidentifier.hasValue()) {
			d.setDetectedIssueIdVl(String.valueOf(detectedissueidentifier.getValue()));
		}
		/******************** detectedissueidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissueidentifiertype = detectedissueidentifier.getType();

		/******************** detectedissueidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding detectedissueidentifiertypecoding = detectedissueidentifiertype.getCodingFirstRep();

		/******************** DetectedIssue_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(detectedissueidentifiertypecoding.hasDisplay()) {
			d.setDetectedIssueIdTypCdgDsply(String.valueOf(detectedissueidentifiertypecoding.getDisplay()));
		}
		/******************** DetectedIssue_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(detectedissueidentifiertypecoding.hasVersion()) {
			d.setDetectedIssueIdTypCdgVrsn(String.valueOf(detectedissueidentifiertypecoding.getVersion()));
		}
		/******************** DetectedIssue_Id_Typ_Cdg_Cd ********************************************************************************/
		if(detectedissueidentifiertypecoding.hasCode()) {
			d.setDetectedIssueIdTypCdgCd(String.valueOf(detectedissueidentifiertypecoding.getCode()));
		}
		/******************** DetectedIssue_Id_Typ_Cdg_Sys ********************************************************************************/
		if(detectedissueidentifiertypecoding.hasSystem()) {
			d.setDetectedIssueIdTypCdgSys(String.valueOf(detectedissueidentifiertypecoding.getSystem()));
		}
		/******************** DetectedIssue_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(detectedissueidentifiertypecoding.hasUserSelected()) {
			d.setDetectedIssueIdTypCdgUsrSltd(String.valueOf(detectedissueidentifiertypecoding.getUserSelected()));
		}
		/******************** DetectedIssue_Id_Typ_Txt ********************************************************************************/
		if(detectedissueidentifiertype.hasText()) {
			d.setDetectedIssueIdTypTxt(String.valueOf(detectedissueidentifiertype.getText()));
		}
		/******************** DetectedIssue_Id_Sys ********************************************************************************/
		if(detectedissueidentifier.hasSystem()) {
			d.setDetectedIssueIdSys(String.valueOf(detectedissueidentifier.getSystem()));
		}
		/******************** DetectedIssue_Id_Assigner ********************************************************************************/
		if(detectedissueidentifier.hasAssigner()) {
			d.setDetectedIssueIdAssigner(String.valueOf(detectedissueidentifier.getAssigner()));
		}
		/******************** detectedissueidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period detectedissueidentifierperiod = detectedissueidentifier.getPeriod();

		/******************** DetectedIssue_Id_Prd_End ********************************************************************************/
		if(detectedissueidentifierperiod.hasEnd()) {
			d.setDetectedIssueIdPrdEnd(String.valueOf(detectedissueidentifierperiod.getEnd()));
		}
		/******************** DetectedIssue_Id_Prd_Strt ********************************************************************************/
		if(detectedissueidentifierperiod.hasStart()) {
			d.setDetectedIssueIdPrdStrt(String.valueOf(detectedissueidentifierperiod.getStart()));
		}
		/******************** detectedissueidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse detectedissueidentifieruse = detectedissueidentifier.getUse();
		d.setDetectedIssueIdUse(detectedissueidentifieruse.toCode());

		return d;
	}
}
