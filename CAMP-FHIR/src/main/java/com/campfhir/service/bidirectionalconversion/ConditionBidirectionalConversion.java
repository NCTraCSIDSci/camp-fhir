package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Condition;
public class ConditionBidirectionalConversion 
{
	public Condition Conditions(org.hl7.fhir.r4.model.Condition condition) throws ParseException
	{
		 main.java.com.campfhir.model.Condition c = new  main.java.com.campfhir.model.Condition();

		/******************** id ********************************************************************************/
		condition.setId(c.getId());

		/******************** conditioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditioncode = condition.getCode();

		/******************** Cndtn_Cd_Txt ********************************************************************************/
		if(conditioncode.hasText()) {
			c.setCndtnCdTxt(String.valueOf(conditioncode.getText()));
		}
		/******************** conditioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditioncodecoding = conditioncode.getCodingFirstRep();

		/******************** Cndtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(conditioncodecoding.hasVersion()) {
			c.setCndtnCdCdgVrsn(String.valueOf(conditioncodecoding.getVersion()));
		}
		/******************** Cndtn_Cd_Cdg_Dsply ********************************************************************************/
		if(conditioncodecoding.hasDisplay()) {
			c.setCndtnCdCdgDsply(String.valueOf(conditioncodecoding.getDisplay()));
		}
		/******************** Cndtn_Cd_Cdg_Cd ********************************************************************************/
		if(conditioncodecoding.hasCode()) {
			c.setCndtnCdCdgCd(String.valueOf(conditioncodecoding.getCode()));
		}
		/******************** Cndtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(conditioncodecoding.hasUserSelected()) {
			c.setCndtnCdCdgUsrSltd(String.valueOf(conditioncodecoding.getUserSelected()));
		}
		/******************** Cndtn_Cd_Cdg_Sys ********************************************************************************/
		if(conditioncodecoding.hasSystem()) {
			c.setCndtnCdCdgSys(String.valueOf(conditioncodecoding.getSystem()));
		}
		/******************** conditionclinicalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionclinicalstatus = condition.getClinicalStatus();

		/******************** Cndtn_ClnclSts_Txt ********************************************************************************/
		if(conditionclinicalstatus.hasText()) {
			c.setCndtnClnclStsTxt(String.valueOf(conditionclinicalstatus.getText()));
		}
		/******************** conditionclinicalstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionclinicalstatuscoding = conditionclinicalstatus.getCodingFirstRep();

		/******************** Cndtn_ClnclSts_Cdg_Vrsn ********************************************************************************/
		if(conditionclinicalstatuscoding.hasVersion()) {
			c.setCndtnClnclStsCdgVrsn(String.valueOf(conditionclinicalstatuscoding.getVersion()));
		}
		/******************** Cndtn_ClnclSts_Cdg_Dsply ********************************************************************************/
		if(conditionclinicalstatuscoding.hasDisplay()) {
			c.setCndtnClnclStsCdgDsply(String.valueOf(conditionclinicalstatuscoding.getDisplay()));
		}
		/******************** Cndtn_ClnclSts_Cdg_Cd ********************************************************************************/
		if(conditionclinicalstatuscoding.hasCode()) {
			c.setCndtnClnclStsCdgCd(String.valueOf(conditionclinicalstatuscoding.getCode()));
		}
		/******************** Cndtn_ClnclSts_Cdg_UsrSltd ********************************************************************************/
		if(conditionclinicalstatuscoding.hasUserSelected()) {
			c.setCndtnClnclStsCdgUsrSltd(String.valueOf(conditionclinicalstatuscoding.getUserSelected()));
		}
		/******************** Cndtn_ClnclSts_Cdg_Sys ********************************************************************************/
		if(conditionclinicalstatuscoding.hasSystem()) {
			c.setCndtnClnclStsCdgSys(String.valueOf(conditionclinicalstatuscoding.getSystem()));
		}
		/******************** Cndtn_Enc ********************************************************************************/
		if(condition.hasEncounter()) {
			c.setCndtnEnc(String.valueOf(condition.getEncounter()));
		}
		/******************** Cndtn_Sbjct ********************************************************************************/
		if(condition.hasSubject()) {
			c.setCndtnSbjct(String.valueOf(condition.getSubject()));
		}
		/******************** conditionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation conditionnote = condition.getNoteFirstRep();

		/******************** Cndtn_Nt_Time ********************************************************************************/
		if(conditionnote.hasTime()) {
			c.setCndtnNtTime(String.valueOf(conditionnote.getTime()));
		}
		/******************** Cndtn_Nt_Txt ********************************************************************************/
		if(conditionnote.hasText()) {
			c.setCndtnNtTxt(String.valueOf(conditionnote.getText()));
		}
		/******************** Cndtn_Nt_AthrRfrnc ********************************************************************************/
		if(conditionnote.hasAuthorReference()) {
			c.setCndtnNtAthrRfrnc(String.valueOf(conditionnote.getAuthorReference()));
		}
		/******************** Cndtn_Nt_AthrStrgTyp ********************************************************************************/
		if(conditionnote.hasAuthorStringType()) {
			c.setCndtnNtAthrStrgTyp(String.valueOf(conditionnote.getAuthorStringType()));
		}
		/******************** conditionseverity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionseverity = condition.getSeverity();

		/******************** Cndtn_Severity_Txt ********************************************************************************/
		if(conditionseverity.hasText()) {
			c.setCndtnSeverityTxt(String.valueOf(conditionseverity.getText()));
		}
		/******************** conditionseveritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionseveritycoding = conditionseverity.getCodingFirstRep();

		/******************** Cndtn_Severity_Cdg_Vrsn ********************************************************************************/
		if(conditionseveritycoding.hasVersion()) {
			c.setCndtnSeverityCdgVrsn(String.valueOf(conditionseveritycoding.getVersion()));
		}
		/******************** Cndtn_Severity_Cdg_Dsply ********************************************************************************/
		if(conditionseveritycoding.hasDisplay()) {
			c.setCndtnSeverityCdgDsply(String.valueOf(conditionseveritycoding.getDisplay()));
		}
		/******************** Cndtn_Severity_Cdg_Cd ********************************************************************************/
		if(conditionseveritycoding.hasCode()) {
			c.setCndtnSeverityCdgCd(String.valueOf(conditionseveritycoding.getCode()));
		}
		/******************** Cndtn_Severity_Cdg_UsrSltd ********************************************************************************/
		if(conditionseveritycoding.hasUserSelected()) {
			c.setCndtnSeverityCdgUsrSltd(String.valueOf(conditionseveritycoding.getUserSelected()));
		}
		/******************** Cndtn_Severity_Cdg_Sys ********************************************************************************/
		if(conditionseveritycoding.hasSystem()) {
			c.setCndtnSeverityCdgSys(String.valueOf(conditionseveritycoding.getSystem()));
		}
		/******************** Cndtn_OnStrgTyp ********************************************************************************/
		if(condition.hasOnsetStringType()) {
			c.setCndtnOnStrgTyp(String.valueOf(condition.getOnsetStringType()));
		}
		/******************** conditiononage ********************************************************************************/
		org.hl7.fhir.r4.model.Age conditiononage = condition.getOnsetAge();

		/******************** Cndtn_OnAge_Vl ********************************************************************************/
		if(conditiononage.hasValue()) {
			c.setCndtnOnAgeVl(String.valueOf(conditiononage.getValue()));
		}
		/******************** conditiononagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditiononagecomparator = conditiononage.getComparator();
		c.setCndtnOnAgeCmprtr(conditiononagecomparator.toCode());

		/******************** Cndtn_OnAge_Cd ********************************************************************************/
		if(conditiononage.hasCode()) {
			c.setCndtnOnAgeCd(String.valueOf(conditiononage.getCode()));
		}
		/******************** Cndtn_OnAge_Unt ********************************************************************************/
		if(conditiononage.hasUnit()) {
			c.setCndtnOnAgeUnt(String.valueOf(conditiononage.getUnit()));
		}
		/******************** Cndtn_OnAge_Sys ********************************************************************************/
		if(conditiononage.hasSystem()) {
			c.setCndtnOnAgeSys(String.valueOf(conditiononage.getSystem()));
		}
		/******************** conditiononperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conditiononperiod = condition.getOnsetPeriod();

		/******************** Cndtn_OnPrd_Strt ********************************************************************************/
		if(conditiononperiod.hasStart()) {
			c.setCndtnOnPrdStrt(String.valueOf(conditiononperiod.getStart()));
		}
		/******************** Cndtn_OnPrd_End ********************************************************************************/
		if(conditiononperiod.hasEnd()) {
			c.setCndtnOnPrdEnd(String.valueOf(conditiononperiod.getEnd()));
		}
		/******************** conditiononrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range conditiononrange = condition.getOnsetRange();

		/******************** conditiononrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditiononrangelow = conditiononrange.getLow();

		/******************** Cndtn_OnRng_Lw_Vl ********************************************************************************/
		if(conditiononrangelow.hasValue()) {
			c.setCndtnOnRngLwVl(String.valueOf(conditiononrangelow.getValue()));
		}
		/******************** conditiononrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditiononrangelowcomparator = conditiononrangelow.getComparator();
		c.setCndtnOnRngLwCmprtr(conditiononrangelowcomparator.toCode());

		/******************** Cndtn_OnRng_Lw_Cd ********************************************************************************/
		if(conditiononrangelow.hasCode()) {
			c.setCndtnOnRngLwCd(String.valueOf(conditiononrangelow.getCode()));
		}
		/******************** Cndtn_OnRng_Lw_Unt ********************************************************************************/
		if(conditiononrangelow.hasUnit()) {
			c.setCndtnOnRngLwUnt(String.valueOf(conditiononrangelow.getUnit()));
		}
		/******************** Cndtn_OnRng_Lw_Sys ********************************************************************************/
		if(conditiononrangelow.hasSystem()) {
			c.setCndtnOnRngLwSys(String.valueOf(conditiononrangelow.getSystem()));
		}
		/******************** conditiononrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditiononrangehigh = conditiononrange.getHigh();

		/******************** Cndtn_OnRng_Hi_Vl ********************************************************************************/
		if(conditiononrangehigh.hasValue()) {
			c.setCndtnOnRngHiVl(String.valueOf(conditiononrangehigh.getValue()));
		}
		/******************** conditiononrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditiononrangehighcomparator = conditiononrangehigh.getComparator();
		c.setCndtnOnRngHiCmprtr(conditiononrangehighcomparator.toCode());

		/******************** Cndtn_OnRng_Hi_Cd ********************************************************************************/
		if(conditiononrangehigh.hasCode()) {
			c.setCndtnOnRngHiCd(String.valueOf(conditiononrangehigh.getCode()));
		}
		/******************** Cndtn_OnRng_Hi_Unt ********************************************************************************/
		if(conditiononrangehigh.hasUnit()) {
			c.setCndtnOnRngHiUnt(String.valueOf(conditiononrangehigh.getUnit()));
		}
		/******************** Cndtn_OnRng_Hi_Sys ********************************************************************************/
		if(conditiononrangehigh.hasSystem()) {
			c.setCndtnOnRngHiSys(String.valueOf(conditiononrangehigh.getSystem()));
		}
		/******************** Cndtn_Asserter ********************************************************************************/
		if(condition.hasAsserter()) {
			c.setCndtnAsserter(String.valueOf(condition.getAsserter()));
		}
		/******************** Cndtn_RecordedDt ********************************************************************************/
		if(condition.hasRecordedDate()) {
			c.setCndtnRecordedDt(String.valueOf(condition.getRecordedDate()));
		}
		/******************** Cndtn_Recorder ********************************************************************************/
		if(condition.hasRecorder()) {
			c.setCndtnRecorder(String.valueOf(condition.getRecorder()));
		}
		/******************** conditionabatementage ********************************************************************************/
		org.hl7.fhir.r4.model.Age conditionabatementage = condition.getAbatementAge();

		/******************** Cndtn_AbatementAge_Vl ********************************************************************************/
		if(conditionabatementage.hasValue()) {
			c.setCndtnAbatementAgeVl(String.valueOf(conditionabatementage.getValue()));
		}
		/******************** conditionabatementagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditionabatementagecomparator = conditionabatementage.getComparator();
		c.setCndtnAbatementAgeCmprtr(conditionabatementagecomparator.toCode());

		/******************** Cndtn_AbatementAge_Cd ********************************************************************************/
		if(conditionabatementage.hasCode()) {
			c.setCndtnAbatementAgeCd(String.valueOf(conditionabatementage.getCode()));
		}
		/******************** Cndtn_AbatementAge_Unt ********************************************************************************/
		if(conditionabatementage.hasUnit()) {
			c.setCndtnAbatementAgeUnt(String.valueOf(conditionabatementage.getUnit()));
		}
		/******************** Cndtn_AbatementAge_Sys ********************************************************************************/
		if(conditionabatementage.hasSystem()) {
			c.setCndtnAbatementAgeSys(String.valueOf(conditionabatementage.getSystem()));
		}
		/******************** conditionabatementrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range conditionabatementrange = condition.getAbatementRange();

		/******************** conditionabatementrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditionabatementrangelow = conditionabatementrange.getLow();

		/******************** Cndtn_AbatementRng_Lw_Vl ********************************************************************************/
		if(conditionabatementrangelow.hasValue()) {
			c.setCndtnAbatementRngLwVl(String.valueOf(conditionabatementrangelow.getValue()));
		}
		/******************** conditionabatementrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditionabatementrangelowcomparator = conditionabatementrangelow.getComparator();
		c.setCndtnAbatementRngLwCmprtr(conditionabatementrangelowcomparator.toCode());

		/******************** Cndtn_AbatementRng_Lw_Cd ********************************************************************************/
		if(conditionabatementrangelow.hasCode()) {
			c.setCndtnAbatementRngLwCd(String.valueOf(conditionabatementrangelow.getCode()));
		}
		/******************** Cndtn_AbatementRng_Lw_Unt ********************************************************************************/
		if(conditionabatementrangelow.hasUnit()) {
			c.setCndtnAbatementRngLwUnt(String.valueOf(conditionabatementrangelow.getUnit()));
		}
		/******************** Cndtn_AbatementRng_Lw_Sys ********************************************************************************/
		if(conditionabatementrangelow.hasSystem()) {
			c.setCndtnAbatementRngLwSys(String.valueOf(conditionabatementrangelow.getSystem()));
		}
		/******************** conditionabatementrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditionabatementrangehigh = conditionabatementrange.getHigh();

		/******************** Cndtn_AbatementRng_Hi_Vl ********************************************************************************/
		if(conditionabatementrangehigh.hasValue()) {
			c.setCndtnAbatementRngHiVl(String.valueOf(conditionabatementrangehigh.getValue()));
		}
		/******************** conditionabatementrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditionabatementrangehighcomparator = conditionabatementrangehigh.getComparator();
		c.setCndtnAbatementRngHiCmprtr(conditionabatementrangehighcomparator.toCode());

		/******************** Cndtn_AbatementRng_Hi_Cd ********************************************************************************/
		if(conditionabatementrangehigh.hasCode()) {
			c.setCndtnAbatementRngHiCd(String.valueOf(conditionabatementrangehigh.getCode()));
		}
		/******************** Cndtn_AbatementRng_Hi_Unt ********************************************************************************/
		if(conditionabatementrangehigh.hasUnit()) {
			c.setCndtnAbatementRngHiUnt(String.valueOf(conditionabatementrangehigh.getUnit()));
		}
		/******************** Cndtn_AbatementRng_Hi_Sys ********************************************************************************/
		if(conditionabatementrangehigh.hasSystem()) {
			c.setCndtnAbatementRngHiSys(String.valueOf(conditionabatementrangehigh.getSystem()));
		}
		/******************** conditionabatementperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conditionabatementperiod = condition.getAbatementPeriod();

		/******************** Cndtn_AbatementPrd_Strt ********************************************************************************/
		if(conditionabatementperiod.hasStart()) {
			c.setCndtnAbatementPrdStrt(String.valueOf(conditionabatementperiod.getStart()));
		}
		/******************** Cndtn_AbatementPrd_End ********************************************************************************/
		if(conditionabatementperiod.hasEnd()) {
			c.setCndtnAbatementPrdEnd(String.valueOf(conditionabatementperiod.getEnd()));
		}
		/******************** conditionstage ********************************************************************************/
		org.hl7.fhir.r4.model.Condition.ConditionStageComponent conditionstage = condition.getStageFirstRep();

		/******************** conditionstagetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionstagetype = conditionstage.getType();

		/******************** Cndtn_Stage_Typ_Txt ********************************************************************************/
		if(conditionstagetype.hasText()) {
			c.setCndtnStageTypTxt(String.valueOf(conditionstagetype.getText()));
		}
		/******************** conditionstagetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionstagetypecoding = conditionstagetype.getCodingFirstRep();

		/******************** Cndtn_Stage_Typ_Cdg_Vrsn ********************************************************************************/
		if(conditionstagetypecoding.hasVersion()) {
			c.setCndtnStageTypCdgVrsn(String.valueOf(conditionstagetypecoding.getVersion()));
		}
		/******************** Cndtn_Stage_Typ_Cdg_Dsply ********************************************************************************/
		if(conditionstagetypecoding.hasDisplay()) {
			c.setCndtnStageTypCdgDsply(String.valueOf(conditionstagetypecoding.getDisplay()));
		}
		/******************** Cndtn_Stage_Typ_Cdg_Cd ********************************************************************************/
		if(conditionstagetypecoding.hasCode()) {
			c.setCndtnStageTypCdgCd(String.valueOf(conditionstagetypecoding.getCode()));
		}
		/******************** Cndtn_Stage_Typ_Cdg_UsrSltd ********************************************************************************/
		if(conditionstagetypecoding.hasUserSelected()) {
			c.setCndtnStageTypCdgUsrSltd(String.valueOf(conditionstagetypecoding.getUserSelected()));
		}
		/******************** Cndtn_Stage_Typ_Cdg_Sys ********************************************************************************/
		if(conditionstagetypecoding.hasSystem()) {
			c.setCndtnStageTypCdgSys(String.valueOf(conditionstagetypecoding.getSystem()));
		}
		/******************** conditionstagesummary ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionstagesummary = conditionstage.getSummary();

		/******************** Cndtn_Stage_Summary_Txt ********************************************************************************/
		if(conditionstagesummary.hasText()) {
			c.setCndtnStageSummaryTxt(String.valueOf(conditionstagesummary.getText()));
		}
		/******************** conditionstagesummarycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionstagesummarycoding = conditionstagesummary.getCodingFirstRep();

		/******************** Cndtn_Stage_Summary_Cdg_Vrsn ********************************************************************************/
		if(conditionstagesummarycoding.hasVersion()) {
			c.setCndtnStageSummaryCdgVrsn(String.valueOf(conditionstagesummarycoding.getVersion()));
		}
		/******************** Cndtn_Stage_Summary_Cdg_Dsply ********************************************************************************/
		if(conditionstagesummarycoding.hasDisplay()) {
			c.setCndtnStageSummaryCdgDsply(String.valueOf(conditionstagesummarycoding.getDisplay()));
		}
		/******************** Cndtn_Stage_Summary_Cdg_Cd ********************************************************************************/
		if(conditionstagesummarycoding.hasCode()) {
			c.setCndtnStageSummaryCdgCd(String.valueOf(conditionstagesummarycoding.getCode()));
		}
		/******************** Cndtn_Stage_Summary_Cdg_UsrSltd ********************************************************************************/
		if(conditionstagesummarycoding.hasUserSelected()) {
			c.setCndtnStageSummaryCdgUsrSltd(String.valueOf(conditionstagesummarycoding.getUserSelected()));
		}
		/******************** Cndtn_Stage_Summary_Cdg_Sys ********************************************************************************/
		if(conditionstagesummarycoding.hasSystem()) {
			c.setCndtnStageSummaryCdgSys(String.valueOf(conditionstagesummarycoding.getSystem()));
		}
		/******************** Cndtn_Stage_Assmnt ********************************************************************************/
		if(conditionstage.hasAssessment()) {
			c.setCndtnStageAssmnt(String.valueOf(conditionstage.getAssessmentFirstRep()));
		}
		/******************** conditionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier conditionidentifier = condition.getIdentifierFirstRep();

		/******************** Cndtn_Id_Vl ********************************************************************************/
		if(conditionidentifier.hasValue()) {
			c.setCndtnIdVl(String.valueOf(conditionidentifier.getValue()));
		}
		/******************** conditionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionidentifiertype = conditionidentifier.getType();

		/******************** Cndtn_Id_Typ_Txt ********************************************************************************/
		if(conditionidentifiertype.hasText()) {
			c.setCndtnIdTypTxt(String.valueOf(conditionidentifiertype.getText()));
		}
		/******************** conditionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionidentifiertypecoding = conditionidentifiertype.getCodingFirstRep();

		/******************** Cndtn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(conditionidentifiertypecoding.hasVersion()) {
			c.setCndtnIdTypCdgVrsn(String.valueOf(conditionidentifiertypecoding.getVersion()));
		}
		/******************** Cndtn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(conditionidentifiertypecoding.hasDisplay()) {
			c.setCndtnIdTypCdgDsply(String.valueOf(conditionidentifiertypecoding.getDisplay()));
		}
		/******************** Cndtn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(conditionidentifiertypecoding.hasCode()) {
			c.setCndtnIdTypCdgCd(String.valueOf(conditionidentifiertypecoding.getCode()));
		}
		/******************** Cndtn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(conditionidentifiertypecoding.hasUserSelected()) {
			c.setCndtnIdTypCdgUsrSltd(String.valueOf(conditionidentifiertypecoding.getUserSelected()));
		}
		/******************** Cndtn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(conditionidentifiertypecoding.hasSystem()) {
			c.setCndtnIdTypCdgSys(String.valueOf(conditionidentifiertypecoding.getSystem()));
		}
		/******************** conditionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conditionidentifierperiod = conditionidentifier.getPeriod();

		/******************** Cndtn_Id_Prd_Strt ********************************************************************************/
		if(conditionidentifierperiod.hasStart()) {
			c.setCndtnIdPrdStrt(String.valueOf(conditionidentifierperiod.getStart()));
		}
		/******************** Cndtn_Id_Prd_End ********************************************************************************/
		if(conditionidentifierperiod.hasEnd()) {
			c.setCndtnIdPrdEnd(String.valueOf(conditionidentifierperiod.getEnd()));
		}
		/******************** Cndtn_Id_Assigner ********************************************************************************/
		if(conditionidentifier.hasAssigner()) {
			c.setCndtnIdAssigner(String.valueOf(conditionidentifier.getAssigner()));
		}
		/******************** Cndtn_Id_Sys ********************************************************************************/
		if(conditionidentifier.hasSystem()) {
			c.setCndtnIdSys(String.valueOf(conditionidentifier.getSystem()));
		}
		/******************** conditionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse conditionidentifieruse = conditionidentifier.getUse();
		c.setCndtnIdUse(conditionidentifieruse.toCode());

		/******************** conditioncategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditioncategory = condition.getCategoryFirstRep();

		/******************** Cndtn_Ctgry_Txt ********************************************************************************/
		if(conditioncategory.hasText()) {
			c.setCndtnCtgryTxt(String.valueOf(conditioncategory.getText()));
		}
		/******************** conditioncategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditioncategorycoding = conditioncategory.getCodingFirstRep();

		/******************** Cndtn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(conditioncategorycoding.hasVersion()) {
			c.setCndtnCtgryCdgVrsn(String.valueOf(conditioncategorycoding.getVersion()));
		}
		/******************** Cndtn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(conditioncategorycoding.hasDisplay()) {
			c.setCndtnCtgryCdgDsply(String.valueOf(conditioncategorycoding.getDisplay()));
		}
		/******************** Cndtn_Ctgry_Cdg_Cd ********************************************************************************/
		if(conditioncategorycoding.hasCode()) {
			c.setCndtnCtgryCdgCd(String.valueOf(conditioncategorycoding.getCode()));
		}
		/******************** Cndtn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(conditioncategorycoding.hasUserSelected()) {
			c.setCndtnCtgryCdgUsrSltd(String.valueOf(conditioncategorycoding.getUserSelected()));
		}
		/******************** Cndtn_Ctgry_Cdg_Sys ********************************************************************************/
		if(conditioncategorycoding.hasSystem()) {
			c.setCndtnCtgryCdgSys(String.valueOf(conditioncategorycoding.getSystem()));
		}
		/******************** conditionbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionbodysite = condition.getBodySiteFirstRep();

		/******************** Cndtn_BodySite_Txt ********************************************************************************/
		if(conditionbodysite.hasText()) {
			c.setCndtnBodySiteTxt(String.valueOf(conditionbodysite.getText()));
		}
		/******************** conditionbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionbodysitecoding = conditionbodysite.getCodingFirstRep();

		/******************** Cndtn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(conditionbodysitecoding.hasVersion()) {
			c.setCndtnBodySiteCdgVrsn(String.valueOf(conditionbodysitecoding.getVersion()));
		}
		/******************** Cndtn_BodySite_Cdg_Dsply ********************************************************************************/
		if(conditionbodysitecoding.hasDisplay()) {
			c.setCndtnBodySiteCdgDsply(String.valueOf(conditionbodysitecoding.getDisplay()));
		}
		/******************** Cndtn_BodySite_Cdg_Cd ********************************************************************************/
		if(conditionbodysitecoding.hasCode()) {
			c.setCndtnBodySiteCdgCd(String.valueOf(conditionbodysitecoding.getCode()));
		}
		/******************** Cndtn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(conditionbodysitecoding.hasUserSelected()) {
			c.setCndtnBodySiteCdgUsrSltd(String.valueOf(conditionbodysitecoding.getUserSelected()));
		}
		/******************** Cndtn_BodySite_Cdg_Sys ********************************************************************************/
		if(conditionbodysitecoding.hasSystem()) {
			c.setCndtnBodySiteCdgSys(String.valueOf(conditionbodysitecoding.getSystem()));
		}
		/******************** conditionverificationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionverificationstatus = condition.getVerificationStatus();

		/******************** Cndtn_VrfctnSts_Txt ********************************************************************************/
		if(conditionverificationstatus.hasText()) {
			c.setCndtnVrfctnStsTxt(String.valueOf(conditionverificationstatus.getText()));
		}
		/******************** conditionverificationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionverificationstatuscoding = conditionverificationstatus.getCodingFirstRep();

		/******************** Cndtn_VrfctnSts_Cdg_Vrsn ********************************************************************************/
		if(conditionverificationstatuscoding.hasVersion()) {
			c.setCndtnVrfctnStsCdgVrsn(String.valueOf(conditionverificationstatuscoding.getVersion()));
		}
		/******************** Cndtn_VrfctnSts_Cdg_Dsply ********************************************************************************/
		if(conditionverificationstatuscoding.hasDisplay()) {
			c.setCndtnVrfctnStsCdgDsply(String.valueOf(conditionverificationstatuscoding.getDisplay()));
		}
		/******************** Cndtn_VrfctnSts_Cdg_Cd ********************************************************************************/
		if(conditionverificationstatuscoding.hasCode()) {
			c.setCndtnVrfctnStsCdgCd(String.valueOf(conditionverificationstatuscoding.getCode()));
		}
		/******************** Cndtn_VrfctnSts_Cdg_UsrSltd ********************************************************************************/
		if(conditionverificationstatuscoding.hasUserSelected()) {
			c.setCndtnVrfctnStsCdgUsrSltd(String.valueOf(conditionverificationstatuscoding.getUserSelected()));
		}
		/******************** Cndtn_VrfctnSts_Cdg_Sys ********************************************************************************/
		if(conditionverificationstatuscoding.hasSystem()) {
			c.setCndtnVrfctnStsCdgSys(String.valueOf(conditionverificationstatuscoding.getSystem()));
		}
		/******************** Cndtn_OnDtTimeTyp ********************************************************************************/
		if(condition.hasOnsetDateTimeType()) {
			c.setCndtnOnDtTimeTyp(String.valueOf(condition.getOnsetDateTimeType()));
		}
		/******************** Cndtn_AbatementDtTimeTyp ********************************************************************************/
		if(condition.hasAbatementDateTimeType()) {
			c.setCndtnAbatementDtTimeTyp(String.valueOf(condition.getAbatementDateTimeType()));
		}
		/******************** Cndtn_AbatementStrgTyp ********************************************************************************/
		if(condition.hasAbatementStringType()) {
			c.setCndtnAbatementStrgTyp(String.valueOf(condition.getAbatementStringType()));
		}
		/******************** conditionevidence ********************************************************************************/
		org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent conditionevidence = condition.getEvidenceFirstRep();

		/******************** Cndtn_Evdnce_Dtl ********************************************************************************/
		if(conditionevidence.hasDetail()) {
			c.setCndtnEvdnceDtl(String.valueOf(conditionevidence.getDetailFirstRep()));
		}
		/******************** conditionevidencecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionevidencecode = conditionevidence.getCodeFirstRep();

		/******************** Cndtn_Evdnce_Cd_Txt ********************************************************************************/
		if(conditionevidencecode.hasText()) {
			c.setCndtnEvdnceCdTxt(String.valueOf(conditionevidencecode.getText()));
		}
		/******************** conditionevidencecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionevidencecodecoding = conditionevidencecode.getCodingFirstRep();

		/******************** Cndtn_Evdnce_Cd_Cdg_Vrsn ********************************************************************************/
		if(conditionevidencecodecoding.hasVersion()) {
			c.setCndtnEvdnceCdCdgVrsn(String.valueOf(conditionevidencecodecoding.getVersion()));
		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Dsply ********************************************************************************/
		if(conditionevidencecodecoding.hasDisplay()) {
			c.setCndtnEvdnceCdCdgDsply(String.valueOf(conditionevidencecodecoding.getDisplay()));
		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Cd ********************************************************************************/
		if(conditionevidencecodecoding.hasCode()) {
			c.setCndtnEvdnceCdCdgCd(String.valueOf(conditionevidencecodecoding.getCode()));
		}
		/******************** Cndtn_Evdnce_Cd_Cdg_UsrSltd ********************************************************************************/
		if(conditionevidencecodecoding.hasUserSelected()) {
			c.setCndtnEvdnceCdCdgUsrSltd(String.valueOf(conditionevidencecodecoding.getUserSelected()));
		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Sys ********************************************************************************/
		if(conditionevidencecodecoding.hasSystem()) {
			c.setCndtnEvdnceCdCdgSys(String.valueOf(conditionevidencecodecoding.getSystem()));
		}
		return c;
	}
}
