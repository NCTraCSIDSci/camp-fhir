package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AdverseEvent;
public class AdverseEventConversion 
{
	public org.hl7.fhir.r4.model.AdverseEvent AdverseEvents(AdverseEvent a) throws ParseException
	{
		org.hl7.fhir.r4.model.AdverseEvent adverseevent = new org.hl7.fhir.r4.model.AdverseEvent();

		/******************** id ********************************************************************************/
		adverseevent.setId(a.getId());

		/******************** adverseeventactuality ********************************************************************************/
		org.hl7.fhir.r4.model.AdverseEvent.AdverseEventActualityEnumFactory adverseeventactuality =  new org.hl7.fhir.r4.model.AdverseEvent.AdverseEventActualityEnumFactory();
		adverseevent.setActuality(adverseeventactuality.fromCode(a.getAdvsEvntActuality()));

		/******************** adverseeventcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		adverseevent.addCategory(adverseeventcategory);

		/******************** adverseeventcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		adverseeventcategory.addCoding(adverseeventcategorycoding);

		/******************** AdvsEvnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgCd() != null) {
			adverseeventcategorycoding.setCode(a.getAdvsEvntCtgryCdgCd());
		}
		/******************** AdvsEvnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgDsply() != null) {
			adverseeventcategorycoding.setDisplay(a.getAdvsEvntCtgryCdgDsply());
		}
		/******************** AdvsEvnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgSys() != null) {
			adverseeventcategorycoding.setSystem(a.getAdvsEvntCtgryCdgSys());
		}
		/******************** AdvsEvnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgUsrSltd() != null) {
			adverseeventcategorycoding.setUserSelected(Boolean.parseBoolean(a.getAdvsEvntCtgryCdgUsrSltd()));
		}
		/******************** AdvsEvnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntCtgryCdgVrsn() != null) {
			adverseeventcategorycoding.setVersion(a.getAdvsEvntCtgryCdgVrsn());
		}
		/******************** AdvsEvnt_Ctgry_Txt ********************************************************************************/
		if(a.getAdvsEvntCtgryTxt() != null) {
			adverseeventcategory.setText(a.getAdvsEvntCtgryTxt());
		}
		/******************** AdvsEvnt_Contributor ********************************************************************************/
		if(a.getAdvsEvntContributor() != null) {
			adverseevent.addContributor( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntContributor()));
		}
		/******************** AdvsEvnt_Dt ********************************************************************************/
		if(a.getAdvsEvntDt() != null) {
			java.text.SimpleDateFormat AdvsEvnt_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AdvsEvnt_Dtdate = AdvsEvnt_Dtsdf.parse(a.getAdvsEvntDt());
			adverseevent.setDate(AdvsEvnt_Dtdate);
		}
		/******************** AdvsEvnt_Detected ********************************************************************************/
		if(a.getAdvsEvntDetected() != null) {
			java.text.SimpleDateFormat AdvsEvnt_Detectedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AdvsEvnt_Detecteddate = AdvsEvnt_Detectedsdf.parse(a.getAdvsEvntDetected());
			adverseevent.setDetected(AdvsEvnt_Detecteddate);
		}
		/******************** AdvsEvnt_Enc ********************************************************************************/
		if(a.getAdvsEvntEnc() != null) {
			adverseevent.setEncounter( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntEnc()));
		}
		/******************** adverseeventevent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventevent =  new org.hl7.fhir.r4.model.CodeableConcept();
		adverseevent.setEvent(adverseeventevent);

		/******************** adverseeventeventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventeventcoding =  new org.hl7.fhir.r4.model.Coding();
		adverseeventevent.addCoding(adverseeventeventcoding);

		/******************** AdvsEvnt_Evnt_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntEvntCdgCd() != null) {
			adverseeventeventcoding.setCode(a.getAdvsEvntEvntCdgCd());
		}
		/******************** AdvsEvnt_Evnt_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntEvntCdgDsply() != null) {
			adverseeventeventcoding.setDisplay(a.getAdvsEvntEvntCdgDsply());
		}
		/******************** AdvsEvnt_Evnt_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntEvntCdgSys() != null) {
			adverseeventeventcoding.setSystem(a.getAdvsEvntEvntCdgSys());
		}
		/******************** AdvsEvnt_Evnt_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntEvntCdgUsrSltd() != null) {
			adverseeventeventcoding.setUserSelected(Boolean.parseBoolean(a.getAdvsEvntEvntCdgUsrSltd()));
		}
		/******************** AdvsEvnt_Evnt_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntEvntCdgVrsn() != null) {
			adverseeventeventcoding.setVersion(a.getAdvsEvntEvntCdgVrsn());
		}
		/******************** AdvsEvnt_Evnt_Txt ********************************************************************************/
		if(a.getAdvsEvntEvntTxt() != null) {
			adverseeventevent.setText(a.getAdvsEvntEvntTxt());
		}
		/******************** adverseeventidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier adverseeventidentifier =  new org.hl7.fhir.r4.model.Identifier();
		adverseevent.setIdentifier(adverseeventidentifier);

		/******************** AdvsEvnt_Id_Assigner ********************************************************************************/
		if(a.getAdvsEvntIdAssigner() != null) {
			adverseeventidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntIdAssigner()));
		}
		/******************** adverseeventidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period adverseeventidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		adverseeventidentifier.setPeriod(adverseeventidentifierperiod);

		/******************** AdvsEvnt_Id_Prd_End ********************************************************************************/
		if(a.getAdvsEvntIdPrdEnd() != null) {
			java.text.SimpleDateFormat AdvsEvnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AdvsEvnt_Id_Prd_Enddate = AdvsEvnt_Id_Prd_Endsdf.parse(a.getAdvsEvntIdPrdEnd());
			adverseeventidentifierperiod.setEnd(AdvsEvnt_Id_Prd_Enddate);
		}
		/******************** AdvsEvnt_Id_Prd_Strt ********************************************************************************/
		if(a.getAdvsEvntIdPrdStrt() != null) {
			java.text.SimpleDateFormat AdvsEvnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AdvsEvnt_Id_Prd_Strtdate = AdvsEvnt_Id_Prd_Strtsdf.parse(a.getAdvsEvntIdPrdStrt());
			adverseeventidentifierperiod.setStart(AdvsEvnt_Id_Prd_Strtdate);
		}
		/******************** AdvsEvnt_Id_Sys ********************************************************************************/
		if(a.getAdvsEvntIdSys() != null) {
			adverseeventidentifier.setSystem(a.getAdvsEvntIdSys());
		}
		/******************** adverseeventidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		adverseeventidentifier.setType(adverseeventidentifiertype);

		/******************** adverseeventidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		adverseeventidentifiertype.addCoding(adverseeventidentifiertypecoding);

		/******************** AdvsEvnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgCd() != null) {
			adverseeventidentifiertypecoding.setCode(a.getAdvsEvntIdTypCdgCd());
		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgDsply() != null) {
			adverseeventidentifiertypecoding.setDisplay(a.getAdvsEvntIdTypCdgDsply());
		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgSys() != null) {
			adverseeventidentifiertypecoding.setSystem(a.getAdvsEvntIdTypCdgSys());
		}
		/******************** AdvsEvnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgUsrSltd() != null) {
			adverseeventidentifiertypecoding.setUserSelected(Boolean.parseBoolean(a.getAdvsEvntIdTypCdgUsrSltd()));
		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntIdTypCdgVrsn() != null) {
			adverseeventidentifiertypecoding.setVersion(a.getAdvsEvntIdTypCdgVrsn());
		}
		/******************** AdvsEvnt_Id_Typ_Txt ********************************************************************************/
		if(a.getAdvsEvntIdTypTxt() != null) {
			adverseeventidentifiertype.setText(a.getAdvsEvntIdTypTxt());
		}
		/******************** adverseeventidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory adverseeventidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		adverseeventidentifier.setUse(adverseeventidentifieruse.fromCode(a.getAdvsEvntIdUse()));

		/******************** AdvsEvnt_Id_Vl ********************************************************************************/
		if(a.getAdvsEvntIdVl() != null) {
			adverseeventidentifier.setValue(a.getAdvsEvntIdVl());
		}
		/******************** AdvsEvnt_Lctn ********************************************************************************/
		if(a.getAdvsEvntLctn() != null) {
			adverseevent.setLocation( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntLctn()));
		}
		/******************** adverseeventoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventoutcome =  new org.hl7.fhir.r4.model.CodeableConcept();
		adverseevent.setOutcome(adverseeventoutcome);

		/******************** adverseeventoutcomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventoutcomecoding =  new org.hl7.fhir.r4.model.Coding();
		adverseeventoutcome.addCoding(adverseeventoutcomecoding);

		/******************** AdvsEvnt_Outcome_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgCd() != null) {
			adverseeventoutcomecoding.setCode(a.getAdvsEvntOutcomeCdgCd());
		}
		/******************** AdvsEvnt_Outcome_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgDsply() != null) {
			adverseeventoutcomecoding.setDisplay(a.getAdvsEvntOutcomeCdgDsply());
		}
		/******************** AdvsEvnt_Outcome_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgSys() != null) {
			adverseeventoutcomecoding.setSystem(a.getAdvsEvntOutcomeCdgSys());
		}
		/******************** AdvsEvnt_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgUsrSltd() != null) {
			adverseeventoutcomecoding.setUserSelected(Boolean.parseBoolean(a.getAdvsEvntOutcomeCdgUsrSltd()));
		}
		/******************** AdvsEvnt_Outcome_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntOutcomeCdgVrsn() != null) {
			adverseeventoutcomecoding.setVersion(a.getAdvsEvntOutcomeCdgVrsn());
		}
		/******************** AdvsEvnt_Outcome_Txt ********************************************************************************/
		if(a.getAdvsEvntOutcomeTxt() != null) {
			adverseeventoutcome.setText(a.getAdvsEvntOutcomeTxt());
		}
		/******************** AdvsEvnt_RecordedDt ********************************************************************************/
		if(a.getAdvsEvntRecordedDt() != null) {
			java.text.SimpleDateFormat AdvsEvnt_RecordedDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AdvsEvnt_RecordedDtdate = AdvsEvnt_RecordedDtsdf.parse(a.getAdvsEvntRecordedDt());
			adverseevent.setRecordedDate(AdvsEvnt_RecordedDtdate);
		}
		/******************** AdvsEvnt_Recorder ********************************************************************************/
		if(a.getAdvsEvntRecorder() != null) {
			adverseevent.setRecorder( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntRecorder()));
		}
		/******************** AdvsEvnt_RfrncDoc ********************************************************************************/
		if(a.getAdvsEvntRfrncDoc() != null) {
			adverseevent.addReferenceDocument( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntRfrncDoc()));
		}
		/******************** AdvsEvnt_RsltingCndtn ********************************************************************************/
		if(a.getAdvsEvntRsltingCndtn() != null) {
			adverseevent.addResultingCondition( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntRsltingCndtn()));
		}
		/******************** adverseeventseriousness ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventseriousness =  new org.hl7.fhir.r4.model.CodeableConcept();
		adverseevent.setSeriousness(adverseeventseriousness);

		/******************** adverseeventseriousnesscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventseriousnesscoding =  new org.hl7.fhir.r4.model.Coding();
		adverseeventseriousness.addCoding(adverseeventseriousnesscoding);

		/******************** AdvsEvnt_Seriousness_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgCd() != null) {
			adverseeventseriousnesscoding.setCode(a.getAdvsEvntSeriousnessCdgCd());
		}
		/******************** AdvsEvnt_Seriousness_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgDsply() != null) {
			adverseeventseriousnesscoding.setDisplay(a.getAdvsEvntSeriousnessCdgDsply());
		}
		/******************** AdvsEvnt_Seriousness_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgSys() != null) {
			adverseeventseriousnesscoding.setSystem(a.getAdvsEvntSeriousnessCdgSys());
		}
		/******************** AdvsEvnt_Seriousness_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgUsrSltd() != null) {
			adverseeventseriousnesscoding.setUserSelected(Boolean.parseBoolean(a.getAdvsEvntSeriousnessCdgUsrSltd()));
		}
		/******************** AdvsEvnt_Seriousness_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntSeriousnessCdgVrsn() != null) {
			adverseeventseriousnesscoding.setVersion(a.getAdvsEvntSeriousnessCdgVrsn());
		}
		/******************** AdvsEvnt_Seriousness_Txt ********************************************************************************/
		if(a.getAdvsEvntSeriousnessTxt() != null) {
			adverseeventseriousness.setText(a.getAdvsEvntSeriousnessTxt());
		}
		/******************** adverseeventseverity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventseverity =  new org.hl7.fhir.r4.model.CodeableConcept();
		adverseevent.setSeverity(adverseeventseverity);

		/******************** adverseeventseveritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventseveritycoding =  new org.hl7.fhir.r4.model.Coding();
		adverseeventseverity.addCoding(adverseeventseveritycoding);

		/******************** AdvsEvnt_Severity_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgCd() != null) {
			adverseeventseveritycoding.setCode(a.getAdvsEvntSeverityCdgCd());
		}
		/******************** AdvsEvnt_Severity_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgDsply() != null) {
			adverseeventseveritycoding.setDisplay(a.getAdvsEvntSeverityCdgDsply());
		}
		/******************** AdvsEvnt_Severity_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgSys() != null) {
			adverseeventseveritycoding.setSystem(a.getAdvsEvntSeverityCdgSys());
		}
		/******************** AdvsEvnt_Severity_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgUsrSltd() != null) {
			adverseeventseveritycoding.setUserSelected(Boolean.parseBoolean(a.getAdvsEvntSeverityCdgUsrSltd()));
		}
		/******************** AdvsEvnt_Severity_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntSeverityCdgVrsn() != null) {
			adverseeventseveritycoding.setVersion(a.getAdvsEvntSeverityCdgVrsn());
		}
		/******************** AdvsEvnt_Severity_Txt ********************************************************************************/
		if(a.getAdvsEvntSeverityTxt() != null) {
			adverseeventseverity.setText(a.getAdvsEvntSeverityTxt());
		}
		/******************** AdvsEvnt_Stdy ********************************************************************************/
		if(a.getAdvsEvntStdy() != null) {
			adverseevent.addStudy( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntStdy()));
		}
		/******************** AdvsEvnt_Sbjct ********************************************************************************/
		if(a.getAdvsEvntSbjct() != null) {
			adverseevent.setSubject( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntSbjct()));
		}
		/******************** AdvsEvnt_SbjctMedicalHis ********************************************************************************/
		if(a.getAdvsEvntSbjctMedicalHis() != null) {
			adverseevent.addSubjectMedicalHistory( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntSbjctMedicalHis()));
		}
		/******************** adverseeventsuspectentity ********************************************************************************/
		org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityComponent adverseeventsuspectentity =  new org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityComponent();
		adverseevent.addSuspectEntity(adverseeventsuspectentity);

		/******************** adverseeventsuspectentitycausality ********************************************************************************/
		org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityCausalityComponent adverseeventsuspectentitycausality =  new org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityCausalityComponent();
		adverseeventsuspectentity.addCausality(adverseeventsuspectentitycausality);

		/******************** adverseeventsuspectentitycausalityassessment ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventsuspectentitycausalityassessment =  new org.hl7.fhir.r4.model.CodeableConcept();
		adverseeventsuspectentitycausality.setAssessment(adverseeventsuspectentitycausalityassessment);

		/******************** adverseeventsuspectentitycausalityassessmentcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventsuspectentitycausalityassessmentcoding =  new org.hl7.fhir.r4.model.Coding();
		adverseeventsuspectentitycausalityassessment.addCoding(adverseeventsuspectentitycausalityassessmentcoding);

		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgCd() != null) {
			adverseeventsuspectentitycausalityassessmentcoding.setCode(a.getAdvsEvntSuspectEntityCausalityAssmntCdgCd());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgDsply() != null) {
			adverseeventsuspectentitycausalityassessmentcoding.setDisplay(a.getAdvsEvntSuspectEntityCausalityAssmntCdgDsply());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgSys() != null) {
			adverseeventsuspectentitycausalityassessmentcoding.setSystem(a.getAdvsEvntSuspectEntityCausalityAssmntCdgSys());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd() != null) {
			adverseeventsuspectentitycausalityassessmentcoding.setUserSelected(Boolean.parseBoolean(a.getAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntCdgVrsn() != null) {
			adverseeventsuspectentitycausalityassessmentcoding.setVersion(a.getAdvsEvntSuspectEntityCausalityAssmntCdgVrsn());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Txt ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAssmntTxt() != null) {
			adverseeventsuspectentitycausalityassessment.setText(a.getAdvsEvntSuspectEntityCausalityAssmntTxt());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Athr ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityAthr() != null) {
			adverseeventsuspectentitycausality.setAuthor( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntSuspectEntityCausalityAthr()));
		}
		/******************** adverseeventsuspectentitycausalitymethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventsuspectentitycausalitymethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		adverseeventsuspectentitycausality.setMethod(adverseeventsuspectentitycausalitymethod);

		/******************** adverseeventsuspectentitycausalitymethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventsuspectentitycausalitymethodcoding =  new org.hl7.fhir.r4.model.Coding();
		adverseeventsuspectentitycausalitymethod.addCoding(adverseeventsuspectentitycausalitymethodcoding);

		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Cd ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgCd() != null) {
			adverseeventsuspectentitycausalitymethodcoding.setCode(a.getAdvsEvntSuspectEntityCausalityMthdCdgCd());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Dsply ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgDsply() != null) {
			adverseeventsuspectentitycausalitymethodcoding.setDisplay(a.getAdvsEvntSuspectEntityCausalityMthdCdgDsply());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Sys ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgSys() != null) {
			adverseeventsuspectentitycausalitymethodcoding.setSystem(a.getAdvsEvntSuspectEntityCausalityMthdCdgSys());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd() != null) {
			adverseeventsuspectentitycausalitymethodcoding.setUserSelected(Boolean.parseBoolean(a.getAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Vrsn ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdCdgVrsn() != null) {
			adverseeventsuspectentitycausalitymethodcoding.setVersion(a.getAdvsEvntSuspectEntityCausalityMthdCdgVrsn());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Txt ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityMthdTxt() != null) {
			adverseeventsuspectentitycausalitymethod.setText(a.getAdvsEvntSuspectEntityCausalityMthdTxt());
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_PrdctRltedness ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityCausalityPrdctRltedness() != null) {
			adverseeventsuspectentitycausality.setProductRelatedness(a.getAdvsEvntSuspectEntityCausalityPrdctRltedness());
		}
		/******************** AdvsEvnt_SuspectEntity_Instance ********************************************************************************/
		if(a.getAdvsEvntSuspectEntityInstance() != null) {
			adverseeventsuspectentity.setInstance( new org.hl7.fhir.r4.model.Reference(a.getAdvsEvntSuspectEntityInstance()));
		}
		return adverseevent;
	}
}
