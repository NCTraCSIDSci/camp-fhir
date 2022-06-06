package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DetectedIssue;
public class DetectedIssueConversion 
{
	public org.hl7.fhir.r4.model.DetectedIssue DetectedIssues(DetectedIssue d) throws ParseException
	{
		org.hl7.fhir.r4.model.DetectedIssue detectedissue = new org.hl7.fhir.r4.model.DetectedIssue();

		/******************** id ********************************************************************************/
		detectedissue.setId(d.getId());

		/******************** DetectedIssue_Athr ********************************************************************************/
		if(d.getDetectedIssueAthr() != null) {
			detectedissue.setAuthor( new org.hl7.fhir.r4.model.Reference(d.getDetectedIssueAthr()));
		}
		/******************** detectedissuecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissuecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		detectedissue.setCode(detectedissuecode);

		/******************** detectedissuecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding detectedissuecodecoding =  new org.hl7.fhir.r4.model.Coding();
		detectedissuecode.addCoding(detectedissuecodecoding);

		/******************** DetectedIssue_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDetectedIssueCdCdgCd() != null) {
			detectedissuecodecoding.setCode(d.getDetectedIssueCdCdgCd());
		}
		/******************** DetectedIssue_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDetectedIssueCdCdgDsply() != null) {
			detectedissuecodecoding.setDisplay(d.getDetectedIssueCdCdgDsply());
		}
		/******************** DetectedIssue_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDetectedIssueCdCdgSys() != null) {
			detectedissuecodecoding.setSystem(d.getDetectedIssueCdCdgSys());
		}
		/******************** DetectedIssue_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDetectedIssueCdCdgUsrSltd() != null) {
			detectedissuecodecoding.setUserSelected(Boolean.parseBoolean(d.getDetectedIssueCdCdgUsrSltd()));
		}
		/******************** DetectedIssue_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDetectedIssueCdCdgVrsn() != null) {
			detectedissuecodecoding.setVersion(d.getDetectedIssueCdCdgVrsn());
		}
		/******************** DetectedIssue_Cd_Txt ********************************************************************************/
		if(d.getDetectedIssueCdTxt() != null) {
			detectedissuecode.setText(d.getDetectedIssueCdTxt());
		}
		/******************** DetectedIssue_Dtl ********************************************************************************/
		if(d.getDetectedIssueDtl() != null) {
			detectedissue.setDetail(d.getDetectedIssueDtl());
		}
		/******************** detectedissueevidence ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueEvidenceComponent detectedissueevidence =  new org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueEvidenceComponent();
		detectedissue.addEvidence(detectedissueevidence);

		/******************** detectedissueevidencecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissueevidencecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		detectedissueevidence.addCode(detectedissueevidencecode);

		/******************** detectedissueevidencecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding detectedissueevidencecodecoding =  new org.hl7.fhir.r4.model.Coding();
		detectedissueevidencecode.addCoding(detectedissueevidencecodecoding);

		/******************** DetectedIssue_Evdnce_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgCd() != null) {
			detectedissueevidencecodecoding.setCode(d.getDetectedIssueEvdnceCdCdgCd());
		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgDsply() != null) {
			detectedissueevidencecodecoding.setDisplay(d.getDetectedIssueEvdnceCdCdgDsply());
		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgSys() != null) {
			detectedissueevidencecodecoding.setSystem(d.getDetectedIssueEvdnceCdCdgSys());
		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgUsrSltd() != null) {
			detectedissueevidencecodecoding.setUserSelected(Boolean.parseBoolean(d.getDetectedIssueEvdnceCdCdgUsrSltd()));
		}
		/******************** DetectedIssue_Evdnce_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdCdgVrsn() != null) {
			detectedissueevidencecodecoding.setVersion(d.getDetectedIssueEvdnceCdCdgVrsn());
		}
		/******************** DetectedIssue_Evdnce_Cd_Txt ********************************************************************************/
		if(d.getDetectedIssueEvdnceCdTxt() != null) {
			detectedissueevidencecode.setText(d.getDetectedIssueEvdnceCdTxt());
		}
		/******************** DetectedIssue_Evdnce_Dtl ********************************************************************************/
		if(d.getDetectedIssueEvdnceDtl() != null) {
			detectedissueevidence.addDetail( new org.hl7.fhir.r4.model.Reference(d.getDetectedIssueEvdnceDtl()));
		}
		/******************** DetectedIssue_IdentifiedDtTimeTyp ********************************************************************************/
		if(d.getDetectedIssueIdentifiedDtTimeTyp() != null) {
			detectedissue.setIdentified( new org.hl7.fhir.r4.model.DateTimeType(d.getDetectedIssueIdentifiedDtTimeTyp()));
		}
		/******************** detectedissueidentifiedperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period detectedissueidentifiedperiod =  new org.hl7.fhir.r4.model.Period();
		detectedissue.setIdentified(detectedissueidentifiedperiod);

		/******************** DetectedIssue_IdentifiedPrd_End ********************************************************************************/
		if(d.getDetectedIssueIdentifiedPrdEnd() != null) {
			java.text.SimpleDateFormat DetectedIssue_IdentifiedPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DetectedIssue_IdentifiedPrd_Enddate = DetectedIssue_IdentifiedPrd_Endsdf.parse(d.getDetectedIssueIdentifiedPrdEnd());
			detectedissueidentifiedperiod.setEnd(DetectedIssue_IdentifiedPrd_Enddate);
		}
		/******************** DetectedIssue_IdentifiedPrd_Strt ********************************************************************************/
		if(d.getDetectedIssueIdentifiedPrdStrt() != null) {
			java.text.SimpleDateFormat DetectedIssue_IdentifiedPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DetectedIssue_IdentifiedPrd_Strtdate = DetectedIssue_IdentifiedPrd_Strtsdf.parse(d.getDetectedIssueIdentifiedPrdStrt());
			detectedissueidentifiedperiod.setStart(DetectedIssue_IdentifiedPrd_Strtdate);
		}
		/******************** detectedissueidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier detectedissueidentifier =  new org.hl7.fhir.r4.model.Identifier();
		detectedissue.addIdentifier(detectedissueidentifier);

		/******************** DetectedIssue_Id_Assigner ********************************************************************************/
		if(d.getDetectedIssueIdAssigner() != null) {
			detectedissueidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDetectedIssueIdAssigner()));
		}
		/******************** detectedissueidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period detectedissueidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		detectedissueidentifier.setPeriod(detectedissueidentifierperiod);

		/******************** DetectedIssue_Id_Prd_End ********************************************************************************/
		if(d.getDetectedIssueIdPrdEnd() != null) {
			java.text.SimpleDateFormat DetectedIssue_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DetectedIssue_Id_Prd_Enddate = DetectedIssue_Id_Prd_Endsdf.parse(d.getDetectedIssueIdPrdEnd());
			detectedissueidentifierperiod.setEnd(DetectedIssue_Id_Prd_Enddate);
		}
		/******************** DetectedIssue_Id_Prd_Strt ********************************************************************************/
		if(d.getDetectedIssueIdPrdStrt() != null) {
			java.text.SimpleDateFormat DetectedIssue_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DetectedIssue_Id_Prd_Strtdate = DetectedIssue_Id_Prd_Strtsdf.parse(d.getDetectedIssueIdPrdStrt());
			detectedissueidentifierperiod.setStart(DetectedIssue_Id_Prd_Strtdate);
		}
		/******************** DetectedIssue_Id_Sys ********************************************************************************/
		if(d.getDetectedIssueIdSys() != null) {
			detectedissueidentifier.setSystem(d.getDetectedIssueIdSys());
		}
		/******************** detectedissueidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissueidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		detectedissueidentifier.setType(detectedissueidentifiertype);

		/******************** detectedissueidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding detectedissueidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		detectedissueidentifiertype.addCoding(detectedissueidentifiertypecoding);

		/******************** DetectedIssue_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgCd() != null) {
			detectedissueidentifiertypecoding.setCode(d.getDetectedIssueIdTypCdgCd());
		}
		/******************** DetectedIssue_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgDsply() != null) {
			detectedissueidentifiertypecoding.setDisplay(d.getDetectedIssueIdTypCdgDsply());
		}
		/******************** DetectedIssue_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgSys() != null) {
			detectedissueidentifiertypecoding.setSystem(d.getDetectedIssueIdTypCdgSys());
		}
		/******************** DetectedIssue_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgUsrSltd() != null) {
			detectedissueidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDetectedIssueIdTypCdgUsrSltd()));
		}
		/******************** DetectedIssue_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDetectedIssueIdTypCdgVrsn() != null) {
			detectedissueidentifiertypecoding.setVersion(d.getDetectedIssueIdTypCdgVrsn());
		}
		/******************** DetectedIssue_Id_Typ_Txt ********************************************************************************/
		if(d.getDetectedIssueIdTypTxt() != null) {
			detectedissueidentifiertype.setText(d.getDetectedIssueIdTypTxt());
		}
		/******************** detectedissueidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory detectedissueidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		detectedissueidentifier.setUse(detectedissueidentifieruse.fromCode(d.getDetectedIssueIdUse()));

		/******************** DetectedIssue_Id_Vl ********************************************************************************/
		if(d.getDetectedIssueIdVl() != null) {
			detectedissueidentifier.setValue(d.getDetectedIssueIdVl());
		}
		/******************** DetectedIssue_Implicated ********************************************************************************/
		if(d.getDetectedIssueImplicated() != null) {
			detectedissue.addImplicated( new org.hl7.fhir.r4.model.Reference(d.getDetectedIssueImplicated()));
		}
		/******************** detectedissuemitigation ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueMitigationComponent detectedissuemitigation =  new org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueMitigationComponent();
		detectedissue.addMitigation(detectedissuemitigation);

		/******************** detectedissuemitigationaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept detectedissuemitigationaction =  new org.hl7.fhir.r4.model.CodeableConcept();
		detectedissuemitigation.setAction(detectedissuemitigationaction);

		/******************** detectedissuemitigationactioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding detectedissuemitigationactioncoding =  new org.hl7.fhir.r4.model.Coding();
		detectedissuemitigationaction.addCoding(detectedissuemitigationactioncoding);

		/******************** DetectedIssue_Mitigation_Actn_Cdg_Cd ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgCd() != null) {
			detectedissuemitigationactioncoding.setCode(d.getDetectedIssueMitigationActnCdgCd());
		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Dsply ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgDsply() != null) {
			detectedissuemitigationactioncoding.setDisplay(d.getDetectedIssueMitigationActnCdgDsply());
		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Sys ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgSys() != null) {
			detectedissuemitigationactioncoding.setSystem(d.getDetectedIssueMitigationActnCdgSys());
		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_UsrSltd ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgUsrSltd() != null) {
			detectedissuemitigationactioncoding.setUserSelected(Boolean.parseBoolean(d.getDetectedIssueMitigationActnCdgUsrSltd()));
		}
		/******************** DetectedIssue_Mitigation_Actn_Cdg_Vrsn ********************************************************************************/
		if(d.getDetectedIssueMitigationActnCdgVrsn() != null) {
			detectedissuemitigationactioncoding.setVersion(d.getDetectedIssueMitigationActnCdgVrsn());
		}
		/******************** DetectedIssue_Mitigation_Actn_Txt ********************************************************************************/
		if(d.getDetectedIssueMitigationActnTxt() != null) {
			detectedissuemitigationaction.setText(d.getDetectedIssueMitigationActnTxt());
		}
		/******************** DetectedIssue_Mitigation_Athr ********************************************************************************/
		if(d.getDetectedIssueMitigationAthr() != null) {
			detectedissuemitigation.setAuthor( new org.hl7.fhir.r4.model.Reference(d.getDetectedIssueMitigationAthr()));
		}
		/******************** DetectedIssue_Mitigation_Dt ********************************************************************************/
		if(d.getDetectedIssueMitigationDt() != null) {
			java.text.SimpleDateFormat DetectedIssue_Mitigation_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DetectedIssue_Mitigation_Dtdate = DetectedIssue_Mitigation_Dtsdf.parse(d.getDetectedIssueMitigationDt());
			detectedissuemitigation.setDate(DetectedIssue_Mitigation_Dtdate);
		}
		/******************** DetectedIssue_Pnt ********************************************************************************/
		if(d.getDetectedIssuePnt() != null) {
			detectedissue.setPatient( new org.hl7.fhir.r4.model.Reference(d.getDetectedIssuePnt()));
		}
		/******************** DetectedIssue_Rfrnc ********************************************************************************/
		if(d.getDetectedIssueRfrnc() != null) {
			detectedissue.setReference(d.getDetectedIssueRfrnc());
		}
		/******************** detectedissueseverity ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueSeverityEnumFactory detectedissueseverity =  new org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueSeverityEnumFactory();
		detectedissue.setSeverity(detectedissueseverity.fromCode(d.getDetectedIssueSeverity()));

		/******************** detectedissuestatus ********************************************************************************/
		org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueStatusEnumFactory detectedissuestatus =  new org.hl7.fhir.r4.model.DetectedIssue.DetectedIssueStatusEnumFactory();
		detectedissue.setStatus(detectedissuestatus.fromCode(d.getDetectedIssueSts()));

		return detectedissue;
	}
}
