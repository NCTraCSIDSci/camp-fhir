package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AdverseEvent;
public class AdverseEventBidirectionalConversion 
{
	public AdverseEvent AdverseEvents(org.hl7.fhir.r4.model.AdverseEvent adverseevent) throws ParseException
	{
		 main.java.com.campfhir.model.AdverseEvent a = new  main.java.com.campfhir.model.AdverseEvent();

		/******************** id ********************************************************************************/
		adverseevent.setId(a.getId());

		/******************** AdvsEvnt_Lctn ********************************************************************************/
		if(adverseevent.hasLocation()) {
			a.setAdvsEvntLctn(String.valueOf(adverseevent.getLocation()));
		}
		/******************** AdvsEvnt_Dt ********************************************************************************/
		if(adverseevent.hasDate()) {
			a.setAdvsEvntDt(String.valueOf(adverseevent.getDate()));
		}
		/******************** AdvsEvnt_RfrncDoc ********************************************************************************/
		if(adverseevent.hasReferenceDocument()) {
			a.setAdvsEvntRfrncDoc(String.valueOf(adverseevent.getReferenceDocumentFirstRep()));
		}
		/******************** AdvsEvnt_RsltingCndtn ********************************************************************************/
		if(adverseevent.hasResultingCondition()) {
			a.setAdvsEvntRsltingCndtn(String.valueOf(adverseevent.getResultingConditionFirstRep()));
		}
		/******************** adverseeventsuspectentity ********************************************************************************/
		org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityComponent adverseeventsuspectentity = adverseevent.getSuspectEntityFirstRep();

		/******************** AdvsEvnt_SuspectEntity_Instance ********************************************************************************/
		if(adverseeventsuspectentity.hasInstance()) {
			a.setAdvsEvntSuspectEntityInstance(String.valueOf(adverseeventsuspectentity.getInstance()));
		}
		/******************** adverseeventsuspectentitycausality ********************************************************************************/
		org.hl7.fhir.r4.model.AdverseEvent.AdverseEventSuspectEntityCausalityComponent adverseeventsuspectentitycausality = adverseeventsuspectentity.getCausalityFirstRep();

		/******************** adverseeventsuspectentitycausalitymethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventsuspectentitycausalitymethod = adverseeventsuspectentitycausality.getMethod();

		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Txt ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethod.hasText()) {
			a.setAdvsEvntSuspectEntityCausalityMthdTxt(String.valueOf(adverseeventsuspectentitycausalitymethod.getText()));
		}
		/******************** adverseeventsuspectentitycausalitymethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventsuspectentitycausalitymethodcoding = adverseeventsuspectentitycausalitymethod.getCodingFirstRep();

		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Vrsn ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcoding.hasVersion()) {
			a.setAdvsEvntSuspectEntityCausalityMthdCdgVrsn(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getVersion()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Dsply ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcoding.hasDisplay()) {
			a.setAdvsEvntSuspectEntityCausalityMthdCdgDsply(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getDisplay()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Cd ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcoding.hasCode()) {
			a.setAdvsEvntSuspectEntityCausalityMthdCdgCd(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getCode()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcoding.hasUserSelected()) {
			a.setAdvsEvntSuspectEntityCausalityMthdCdgUsrSltd(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getUserSelected()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Mthd_Cdg_Sys ********************************************************************************/
		if(adverseeventsuspectentitycausalitymethodcoding.hasSystem()) {
			a.setAdvsEvntSuspectEntityCausalityMthdCdgSys(String.valueOf(adverseeventsuspectentitycausalitymethodcoding.getSystem()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_PrdctRltedness ********************************************************************************/
		if(adverseeventsuspectentitycausality.hasProductRelatedness()) {
			a.setAdvsEvntSuspectEntityCausalityPrdctRltedness(String.valueOf(adverseeventsuspectentitycausality.getProductRelatedness()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Athr ********************************************************************************/
		if(adverseeventsuspectentitycausality.hasAuthor()) {
			a.setAdvsEvntSuspectEntityCausalityAthr(String.valueOf(adverseeventsuspectentitycausality.getAuthor()));
		}
		/******************** adverseeventsuspectentitycausalityassessment ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventsuspectentitycausalityassessment = adverseeventsuspectentitycausality.getAssessment();

		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Txt ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessment.hasText()) {
			a.setAdvsEvntSuspectEntityCausalityAssmntTxt(String.valueOf(adverseeventsuspectentitycausalityassessment.getText()));
		}
		/******************** adverseeventsuspectentitycausalityassessmentcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventsuspectentitycausalityassessmentcoding = adverseeventsuspectentitycausalityassessment.getCodingFirstRep();

		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Vrsn ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcoding.hasVersion()) {
			a.setAdvsEvntSuspectEntityCausalityAssmntCdgVrsn(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getVersion()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Dsply ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcoding.hasDisplay()) {
			a.setAdvsEvntSuspectEntityCausalityAssmntCdgDsply(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getDisplay()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Cd ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcoding.hasCode()) {
			a.setAdvsEvntSuspectEntityCausalityAssmntCdgCd(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getCode()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcoding.hasUserSelected()) {
			a.setAdvsEvntSuspectEntityCausalityAssmntCdgUsrSltd(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getUserSelected()));
		}
		/******************** AdvsEvnt_SuspectEntity_Causality_Assmnt_Cdg_Sys ********************************************************************************/
		if(adverseeventsuspectentitycausalityassessmentcoding.hasSystem()) {
			a.setAdvsEvntSuspectEntityCausalityAssmntCdgSys(String.valueOf(adverseeventsuspectentitycausalityassessmentcoding.getSystem()));
		}
		/******************** AdvsEvnt_SbjctMedicalHis ********************************************************************************/
		if(adverseevent.hasSubjectMedicalHistory()) {
			a.setAdvsEvntSbjctMedicalHis(String.valueOf(adverseevent.getSubjectMedicalHistoryFirstRep()));
		}
		/******************** AdvsEvnt_Enc ********************************************************************************/
		if(adverseevent.hasEncounter()) {
			a.setAdvsEvntEnc(String.valueOf(adverseevent.getEncounter()));
		}
		/******************** AdvsEvnt_Sbjct ********************************************************************************/
		if(adverseevent.hasSubject()) {
			a.setAdvsEvntSbjct(String.valueOf(adverseevent.getSubject()));
		}
		/******************** adverseeventoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventoutcome = adverseevent.getOutcome();

		/******************** AdvsEvnt_Outcome_Txt ********************************************************************************/
		if(adverseeventoutcome.hasText()) {
			a.setAdvsEvntOutcomeTxt(String.valueOf(adverseeventoutcome.getText()));
		}
		/******************** adverseeventoutcomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventoutcomecoding = adverseeventoutcome.getCodingFirstRep();

		/******************** AdvsEvnt_Outcome_Cdg_Vrsn ********************************************************************************/
		if(adverseeventoutcomecoding.hasVersion()) {
			a.setAdvsEvntOutcomeCdgVrsn(String.valueOf(adverseeventoutcomecoding.getVersion()));
		}
		/******************** AdvsEvnt_Outcome_Cdg_Dsply ********************************************************************************/
		if(adverseeventoutcomecoding.hasDisplay()) {
			a.setAdvsEvntOutcomeCdgDsply(String.valueOf(adverseeventoutcomecoding.getDisplay()));
		}
		/******************** AdvsEvnt_Outcome_Cdg_Cd ********************************************************************************/
		if(adverseeventoutcomecoding.hasCode()) {
			a.setAdvsEvntOutcomeCdgCd(String.valueOf(adverseeventoutcomecoding.getCode()));
		}
		/******************** AdvsEvnt_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventoutcomecoding.hasUserSelected()) {
			a.setAdvsEvntOutcomeCdgUsrSltd(String.valueOf(adverseeventoutcomecoding.getUserSelected()));
		}
		/******************** AdvsEvnt_Outcome_Cdg_Sys ********************************************************************************/
		if(adverseeventoutcomecoding.hasSystem()) {
			a.setAdvsEvntOutcomeCdgSys(String.valueOf(adverseeventoutcomecoding.getSystem()));
		}
		/******************** adverseeventactuality ********************************************************************************/
		org.hl7.fhir.r4.model.AdverseEvent.AdverseEventActuality adverseeventactuality = adverseevent.getActuality();
		a.setAdvsEvntActuality(adverseeventactuality.toCode());

		/******************** AdvsEvnt_Stdy ********************************************************************************/
		if(adverseevent.hasStudy()) {
			a.setAdvsEvntStdy(String.valueOf(adverseevent.getStudyFirstRep()));
		}
		/******************** AdvsEvnt_Detected ********************************************************************************/
		if(adverseevent.hasDetected()) {
			a.setAdvsEvntDetected(String.valueOf(adverseevent.getDetected()));
		}
		/******************** adverseeventseriousness ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventseriousness = adverseevent.getSeriousness();

		/******************** AdvsEvnt_Seriousness_Txt ********************************************************************************/
		if(adverseeventseriousness.hasText()) {
			a.setAdvsEvntSeriousnessTxt(String.valueOf(adverseeventseriousness.getText()));
		}
		/******************** adverseeventseriousnesscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventseriousnesscoding = adverseeventseriousness.getCodingFirstRep();

		/******************** AdvsEvnt_Seriousness_Cdg_Vrsn ********************************************************************************/
		if(adverseeventseriousnesscoding.hasVersion()) {
			a.setAdvsEvntSeriousnessCdgVrsn(String.valueOf(adverseeventseriousnesscoding.getVersion()));
		}
		/******************** AdvsEvnt_Seriousness_Cdg_Dsply ********************************************************************************/
		if(adverseeventseriousnesscoding.hasDisplay()) {
			a.setAdvsEvntSeriousnessCdgDsply(String.valueOf(adverseeventseriousnesscoding.getDisplay()));
		}
		/******************** AdvsEvnt_Seriousness_Cdg_Cd ********************************************************************************/
		if(adverseeventseriousnesscoding.hasCode()) {
			a.setAdvsEvntSeriousnessCdgCd(String.valueOf(adverseeventseriousnesscoding.getCode()));
		}
		/******************** AdvsEvnt_Seriousness_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventseriousnesscoding.hasUserSelected()) {
			a.setAdvsEvntSeriousnessCdgUsrSltd(String.valueOf(adverseeventseriousnesscoding.getUserSelected()));
		}
		/******************** AdvsEvnt_Seriousness_Cdg_Sys ********************************************************************************/
		if(adverseeventseriousnesscoding.hasSystem()) {
			a.setAdvsEvntSeriousnessCdgSys(String.valueOf(adverseeventseriousnesscoding.getSystem()));
		}
		/******************** adverseeventidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier adverseeventidentifier = adverseevent.getIdentifier();

		/******************** AdvsEvnt_Id_Vl ********************************************************************************/
		if(adverseeventidentifier.hasValue()) {
			a.setAdvsEvntIdVl(String.valueOf(adverseeventidentifier.getValue()));
		}
		/******************** adverseeventidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventidentifiertype = adverseeventidentifier.getType();

		/******************** AdvsEvnt_Id_Typ_Txt ********************************************************************************/
		if(adverseeventidentifiertype.hasText()) {
			a.setAdvsEvntIdTypTxt(String.valueOf(adverseeventidentifiertype.getText()));
		}
		/******************** adverseeventidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventidentifiertypecoding = adverseeventidentifiertype.getCodingFirstRep();

		/******************** AdvsEvnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(adverseeventidentifiertypecoding.hasVersion()) {
			a.setAdvsEvntIdTypCdgVrsn(String.valueOf(adverseeventidentifiertypecoding.getVersion()));
		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(adverseeventidentifiertypecoding.hasDisplay()) {
			a.setAdvsEvntIdTypCdgDsply(String.valueOf(adverseeventidentifiertypecoding.getDisplay()));
		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(adverseeventidentifiertypecoding.hasCode()) {
			a.setAdvsEvntIdTypCdgCd(String.valueOf(adverseeventidentifiertypecoding.getCode()));
		}
		/******************** AdvsEvnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventidentifiertypecoding.hasUserSelected()) {
			a.setAdvsEvntIdTypCdgUsrSltd(String.valueOf(adverseeventidentifiertypecoding.getUserSelected()));
		}
		/******************** AdvsEvnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(adverseeventidentifiertypecoding.hasSystem()) {
			a.setAdvsEvntIdTypCdgSys(String.valueOf(adverseeventidentifiertypecoding.getSystem()));
		}
		/******************** adverseeventidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period adverseeventidentifierperiod = adverseeventidentifier.getPeriod();

		/******************** AdvsEvnt_Id_Prd_Strt ********************************************************************************/
		if(adverseeventidentifierperiod.hasStart()) {
			a.setAdvsEvntIdPrdStrt(String.valueOf(adverseeventidentifierperiod.getStart()));
		}
		/******************** AdvsEvnt_Id_Prd_End ********************************************************************************/
		if(adverseeventidentifierperiod.hasEnd()) {
			a.setAdvsEvntIdPrdEnd(String.valueOf(adverseeventidentifierperiod.getEnd()));
		}
		/******************** AdvsEvnt_Id_Assigner ********************************************************************************/
		if(adverseeventidentifier.hasAssigner()) {
			a.setAdvsEvntIdAssigner(String.valueOf(adverseeventidentifier.getAssigner()));
		}
		/******************** AdvsEvnt_Id_Sys ********************************************************************************/
		if(adverseeventidentifier.hasSystem()) {
			a.setAdvsEvntIdSys(String.valueOf(adverseeventidentifier.getSystem()));
		}
		/******************** adverseeventidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse adverseeventidentifieruse = adverseeventidentifier.getUse();
		a.setAdvsEvntIdUse(adverseeventidentifieruse.toCode());

		/******************** adverseeventevent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventevent = adverseevent.getEvent();

		/******************** AdvsEvnt_Evnt_Txt ********************************************************************************/
		if(adverseeventevent.hasText()) {
			a.setAdvsEvntEvntTxt(String.valueOf(adverseeventevent.getText()));
		}
		/******************** adverseeventeventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventeventcoding = adverseeventevent.getCodingFirstRep();

		/******************** AdvsEvnt_Evnt_Cdg_Vrsn ********************************************************************************/
		if(adverseeventeventcoding.hasVersion()) {
			a.setAdvsEvntEvntCdgVrsn(String.valueOf(adverseeventeventcoding.getVersion()));
		}
		/******************** AdvsEvnt_Evnt_Cdg_Dsply ********************************************************************************/
		if(adverseeventeventcoding.hasDisplay()) {
			a.setAdvsEvntEvntCdgDsply(String.valueOf(adverseeventeventcoding.getDisplay()));
		}
		/******************** AdvsEvnt_Evnt_Cdg_Cd ********************************************************************************/
		if(adverseeventeventcoding.hasCode()) {
			a.setAdvsEvntEvntCdgCd(String.valueOf(adverseeventeventcoding.getCode()));
		}
		/******************** AdvsEvnt_Evnt_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventeventcoding.hasUserSelected()) {
			a.setAdvsEvntEvntCdgUsrSltd(String.valueOf(adverseeventeventcoding.getUserSelected()));
		}
		/******************** AdvsEvnt_Evnt_Cdg_Sys ********************************************************************************/
		if(adverseeventeventcoding.hasSystem()) {
			a.setAdvsEvntEvntCdgSys(String.valueOf(adverseeventeventcoding.getSystem()));
		}
		/******************** AdvsEvnt_Contributor ********************************************************************************/
		if(adverseevent.hasContributor()) {
			a.setAdvsEvntContributor(String.valueOf(adverseevent.getContributorFirstRep()));
		}
		/******************** adverseeventseverity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventseverity = adverseevent.getSeverity();

		/******************** AdvsEvnt_Severity_Txt ********************************************************************************/
		if(adverseeventseverity.hasText()) {
			a.setAdvsEvntSeverityTxt(String.valueOf(adverseeventseverity.getText()));
		}
		/******************** adverseeventseveritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventseveritycoding = adverseeventseverity.getCodingFirstRep();

		/******************** AdvsEvnt_Severity_Cdg_Vrsn ********************************************************************************/
		if(adverseeventseveritycoding.hasVersion()) {
			a.setAdvsEvntSeverityCdgVrsn(String.valueOf(adverseeventseveritycoding.getVersion()));
		}
		/******************** AdvsEvnt_Severity_Cdg_Dsply ********************************************************************************/
		if(adverseeventseveritycoding.hasDisplay()) {
			a.setAdvsEvntSeverityCdgDsply(String.valueOf(adverseeventseveritycoding.getDisplay()));
		}
		/******************** AdvsEvnt_Severity_Cdg_Cd ********************************************************************************/
		if(adverseeventseveritycoding.hasCode()) {
			a.setAdvsEvntSeverityCdgCd(String.valueOf(adverseeventseveritycoding.getCode()));
		}
		/******************** AdvsEvnt_Severity_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventseveritycoding.hasUserSelected()) {
			a.setAdvsEvntSeverityCdgUsrSltd(String.valueOf(adverseeventseveritycoding.getUserSelected()));
		}
		/******************** AdvsEvnt_Severity_Cdg_Sys ********************************************************************************/
		if(adverseeventseveritycoding.hasSystem()) {
			a.setAdvsEvntSeverityCdgSys(String.valueOf(adverseeventseveritycoding.getSystem()));
		}
		/******************** AdvsEvnt_RecordedDt ********************************************************************************/
		if(adverseevent.hasRecordedDate()) {
			a.setAdvsEvntRecordedDt(String.valueOf(adverseevent.getRecordedDate()));
		}
		/******************** AdvsEvnt_Recorder ********************************************************************************/
		if(adverseevent.hasRecorder()) {
			a.setAdvsEvntRecorder(String.valueOf(adverseevent.getRecorder()));
		}
		/******************** adverseeventcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept adverseeventcategory = adverseevent.getCategoryFirstRep();

		/******************** AdvsEvnt_Ctgry_Txt ********************************************************************************/
		if(adverseeventcategory.hasText()) {
			a.setAdvsEvntCtgryTxt(String.valueOf(adverseeventcategory.getText()));
		}
		/******************** adverseeventcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding adverseeventcategorycoding = adverseeventcategory.getCodingFirstRep();

		/******************** AdvsEvnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(adverseeventcategorycoding.hasVersion()) {
			a.setAdvsEvntCtgryCdgVrsn(String.valueOf(adverseeventcategorycoding.getVersion()));
		}
		/******************** AdvsEvnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(adverseeventcategorycoding.hasDisplay()) {
			a.setAdvsEvntCtgryCdgDsply(String.valueOf(adverseeventcategorycoding.getDisplay()));
		}
		/******************** AdvsEvnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(adverseeventcategorycoding.hasCode()) {
			a.setAdvsEvntCtgryCdgCd(String.valueOf(adverseeventcategorycoding.getCode()));
		}
		/******************** AdvsEvnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(adverseeventcategorycoding.hasUserSelected()) {
			a.setAdvsEvntCtgryCdgUsrSltd(String.valueOf(adverseeventcategorycoding.getUserSelected()));
		}
		/******************** AdvsEvnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(adverseeventcategorycoding.hasSystem()) {
			a.setAdvsEvntCtgryCdgSys(String.valueOf(adverseeventcategorycoding.getSystem()));
		}
		return a;
	}
}
