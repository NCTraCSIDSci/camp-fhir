package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RiskAssessment;
public class RiskAssessmentBidirectionalConversion 
{
	public RiskAssessment RiskAssessments(org.hl7.fhir.r4.model.RiskAssessment riskassessment) throws ParseException
	{
		 main.java.com.campfhir.model.RiskAssessment r = new  main.java.com.campfhir.model.RiskAssessment();

		/******************** id ********************************************************************************/
		riskassessment.setId(r.getId());

		/******************** riskassessmentmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentmethod = riskassessment.getMethod();

		/******************** riskassessmentmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentmethodcoding = riskassessmentmethod.getCodingFirstRep();

		/******************** RskAssmnt_Mthd_Cdg_Dsply ********************************************************************************/
		if(riskassessmentmethodcoding.hasDisplay()) {
			r.setRskAssmntMthdCdgDsply(String.valueOf(riskassessmentmethodcoding.getDisplay()));
		}
		/******************** RskAssmnt_Mthd_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentmethodcoding.hasVersion()) {
			r.setRskAssmntMthdCdgVrsn(String.valueOf(riskassessmentmethodcoding.getVersion()));
		}
		/******************** RskAssmnt_Mthd_Cdg_Cd ********************************************************************************/
		if(riskassessmentmethodcoding.hasCode()) {
			r.setRskAssmntMthdCdgCd(String.valueOf(riskassessmentmethodcoding.getCode()));
		}
		/******************** RskAssmnt_Mthd_Cdg_Sys ********************************************************************************/
		if(riskassessmentmethodcoding.hasSystem()) {
			r.setRskAssmntMthdCdgSys(String.valueOf(riskassessmentmethodcoding.getSystem()));
		}
		/******************** RskAssmnt_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentmethodcoding.hasUserSelected()) {
			r.setRskAssmntMthdCdgUsrSltd(String.valueOf(riskassessmentmethodcoding.getUserSelected()));
		}
		/******************** RskAssmnt_Mthd_Txt ********************************************************************************/
		if(riskassessmentmethod.hasText()) {
			r.setRskAssmntMthdTxt(String.valueOf(riskassessmentmethod.getText()));
		}
		/******************** RskAssmnt_Parent ********************************************************************************/
		if(riskassessment.hasParent()) {
			r.setRskAssmntParent(String.valueOf(riskassessment.getParent()));
		}
		/******************** riskassessmentoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskassessmentoccurrenceperiod = riskassessment.getOccurrencePeriod();

		/******************** RskAssmnt_OccrncePrd_End ********************************************************************************/
		if(riskassessmentoccurrenceperiod.hasEnd()) {
			r.setRskAssmntOccrncePrdEnd(String.valueOf(riskassessmentoccurrenceperiod.getEnd()));
		}
		/******************** RskAssmnt_OccrncePrd_Strt ********************************************************************************/
		if(riskassessmentoccurrenceperiod.hasStart()) {
			r.setRskAssmntOccrncePrdStrt(String.valueOf(riskassessmentoccurrenceperiod.getStart()));
		}
		/******************** RskAssmnt_OccrnceDtTimeTyp ********************************************************************************/
		if(riskassessment.hasOccurrenceDateTimeType()) {
			r.setRskAssmntOccrnceDtTimeTyp(String.valueOf(riskassessment.getOccurrenceDateTimeType()));
		}
		/******************** riskassessmentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentcode = riskassessment.getCode();

		/******************** riskassessmentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentcodecoding = riskassessmentcode.getCodingFirstRep();

		/******************** RskAssmnt_Cd_Cdg_Dsply ********************************************************************************/
		if(riskassessmentcodecoding.hasDisplay()) {
			r.setRskAssmntCdCdgDsply(String.valueOf(riskassessmentcodecoding.getDisplay()));
		}
		/******************** RskAssmnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentcodecoding.hasVersion()) {
			r.setRskAssmntCdCdgVrsn(String.valueOf(riskassessmentcodecoding.getVersion()));
		}
		/******************** RskAssmnt_Cd_Cdg_Cd ********************************************************************************/
		if(riskassessmentcodecoding.hasCode()) {
			r.setRskAssmntCdCdgCd(String.valueOf(riskassessmentcodecoding.getCode()));
		}
		/******************** RskAssmnt_Cd_Cdg_Sys ********************************************************************************/
		if(riskassessmentcodecoding.hasSystem()) {
			r.setRskAssmntCdCdgSys(String.valueOf(riskassessmentcodecoding.getSystem()));
		}
		/******************** RskAssmnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentcodecoding.hasUserSelected()) {
			r.setRskAssmntCdCdgUsrSltd(String.valueOf(riskassessmentcodecoding.getUserSelected()));
		}
		/******************** RskAssmnt_Cd_Txt ********************************************************************************/
		if(riskassessmentcode.hasText()) {
			r.setRskAssmntCdTxt(String.valueOf(riskassessmentcode.getText()));
		}
		/******************** riskassessmentprediction ********************************************************************************/
		org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent riskassessmentprediction = riskassessment.getPredictionFirstRep();

		/******************** riskassessmentpredictionoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentpredictionoutcome = riskassessmentprediction.getOutcome();

		/******************** riskassessmentpredictionoutcomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentpredictionoutcomecoding = riskassessmentpredictionoutcome.getCodingFirstRep();

		/******************** RskAssmnt_Prediction_Outcome_Cdg_Dsply ********************************************************************************/
		if(riskassessmentpredictionoutcomecoding.hasDisplay()) {
			r.setRskAssmntPredictionOutcomeCdgDsply(String.valueOf(riskassessmentpredictionoutcomecoding.getDisplay()));
		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentpredictionoutcomecoding.hasVersion()) {
			r.setRskAssmntPredictionOutcomeCdgVrsn(String.valueOf(riskassessmentpredictionoutcomecoding.getVersion()));
		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Cd ********************************************************************************/
		if(riskassessmentpredictionoutcomecoding.hasCode()) {
			r.setRskAssmntPredictionOutcomeCdgCd(String.valueOf(riskassessmentpredictionoutcomecoding.getCode()));
		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Sys ********************************************************************************/
		if(riskassessmentpredictionoutcomecoding.hasSystem()) {
			r.setRskAssmntPredictionOutcomeCdgSys(String.valueOf(riskassessmentpredictionoutcomecoding.getSystem()));
		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentpredictionoutcomecoding.hasUserSelected()) {
			r.setRskAssmntPredictionOutcomeCdgUsrSltd(String.valueOf(riskassessmentpredictionoutcomecoding.getUserSelected()));
		}
		/******************** RskAssmnt_Prediction_Outcome_Txt ********************************************************************************/
		if(riskassessmentpredictionoutcome.hasText()) {
			r.setRskAssmntPredictionOutcomeTxt(String.valueOf(riskassessmentpredictionoutcome.getText()));
		}
		/******************** riskassessmentpredictionprobabilityrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range riskassessmentpredictionprobabilityrange = riskassessmentprediction.getProbabilityRange();

		/******************** riskassessmentpredictionprobabilityrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionprobabilityrangelow = riskassessmentpredictionprobabilityrange.getLow();

		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Vl ********************************************************************************/
		if(riskassessmentpredictionprobabilityrangelow.hasValue()) {
			r.setRskAssmntPredictionProbabilityRngLwVl(String.valueOf(riskassessmentpredictionprobabilityrangelow.getValue()));
		}
		/******************** riskassessmentpredictionprobabilityrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskassessmentpredictionprobabilityrangelowcomparator = riskassessmentpredictionprobabilityrangelow.getComparator();
		r.setRskAssmntPredictionProbabilityRngLwCmprtr(riskassessmentpredictionprobabilityrangelowcomparator.toCode());

		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Cd ********************************************************************************/
		if(riskassessmentpredictionprobabilityrangelow.hasCode()) {
			r.setRskAssmntPredictionProbabilityRngLwCd(String.valueOf(riskassessmentpredictionprobabilityrangelow.getCode()));
		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Sys ********************************************************************************/
		if(riskassessmentpredictionprobabilityrangelow.hasSystem()) {
			r.setRskAssmntPredictionProbabilityRngLwSys(String.valueOf(riskassessmentpredictionprobabilityrangelow.getSystem()));
		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Unt ********************************************************************************/
		if(riskassessmentpredictionprobabilityrangelow.hasUnit()) {
			r.setRskAssmntPredictionProbabilityRngLwUnt(String.valueOf(riskassessmentpredictionprobabilityrangelow.getUnit()));
		}
		/******************** riskassessmentpredictionprobabilityrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionprobabilityrangehigh = riskassessmentpredictionprobabilityrange.getHigh();

		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Vl ********************************************************************************/
		if(riskassessmentpredictionprobabilityrangehigh.hasValue()) {
			r.setRskAssmntPredictionProbabilityRngHiVl(String.valueOf(riskassessmentpredictionprobabilityrangehigh.getValue()));
		}
		/******************** riskassessmentpredictionprobabilityrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskassessmentpredictionprobabilityrangehighcomparator = riskassessmentpredictionprobabilityrangehigh.getComparator();
		r.setRskAssmntPredictionProbabilityRngHiCmprtr(riskassessmentpredictionprobabilityrangehighcomparator.toCode());

		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Cd ********************************************************************************/
		if(riskassessmentpredictionprobabilityrangehigh.hasCode()) {
			r.setRskAssmntPredictionProbabilityRngHiCd(String.valueOf(riskassessmentpredictionprobabilityrangehigh.getCode()));
		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Sys ********************************************************************************/
		if(riskassessmentpredictionprobabilityrangehigh.hasSystem()) {
			r.setRskAssmntPredictionProbabilityRngHiSys(String.valueOf(riskassessmentpredictionprobabilityrangehigh.getSystem()));
		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Unt ********************************************************************************/
		if(riskassessmentpredictionprobabilityrangehigh.hasUnit()) {
			r.setRskAssmntPredictionProbabilityRngHiUnt(String.valueOf(riskassessmentpredictionprobabilityrangehigh.getUnit()));
		}
		/******************** RskAssmnt_Prediction_ProbabilityDecimalTyp ********************************************************************************/
		if(riskassessmentprediction.hasProbabilityDecimalType()) {
			r.setRskAssmntPredictionProbabilityDecimalTyp(String.valueOf(riskassessmentprediction.getProbabilityDecimalType()));
		}
		/******************** riskassessmentpredictionqualitativerisk ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentpredictionqualitativerisk = riskassessmentprediction.getQualitativeRisk();

		/******************** riskassessmentpredictionqualitativeriskcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentpredictionqualitativeriskcoding = riskassessmentpredictionqualitativerisk.getCodingFirstRep();

		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Dsply ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcoding.hasDisplay()) {
			r.setRskAssmntPredictionQualitativeRskCdgDsply(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getDisplay()));
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcoding.hasVersion()) {
			r.setRskAssmntPredictionQualitativeRskCdgVrsn(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getVersion()));
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Cd ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcoding.hasCode()) {
			r.setRskAssmntPredictionQualitativeRskCdgCd(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getCode()));
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Sys ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcoding.hasSystem()) {
			r.setRskAssmntPredictionQualitativeRskCdgSys(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getSystem()));
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentpredictionqualitativeriskcoding.hasUserSelected()) {
			r.setRskAssmntPredictionQualitativeRskCdgUsrSltd(String.valueOf(riskassessmentpredictionqualitativeriskcoding.getUserSelected()));
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Txt ********************************************************************************/
		if(riskassessmentpredictionqualitativerisk.hasText()) {
			r.setRskAssmntPredictionQualitativeRskTxt(String.valueOf(riskassessmentpredictionqualitativerisk.getText()));
		}
		/******************** RskAssmnt_Prediction_RelativeRsk ********************************************************************************/
		if(riskassessmentprediction.hasRelativeRisk()) {
			r.setRskAssmntPredictionRelativeRsk(String.valueOf(riskassessmentprediction.getRelativeRisk()));
		}
		/******************** riskassessmentpredictionwhenperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskassessmentpredictionwhenperiod = riskassessmentprediction.getWhenPeriod();

		/******************** RskAssmnt_Prediction_WhenPrd_End ********************************************************************************/
		if(riskassessmentpredictionwhenperiod.hasEnd()) {
			r.setRskAssmntPredictionWhenPrdEnd(String.valueOf(riskassessmentpredictionwhenperiod.getEnd()));
		}
		/******************** RskAssmnt_Prediction_WhenPrd_Strt ********************************************************************************/
		if(riskassessmentpredictionwhenperiod.hasStart()) {
			r.setRskAssmntPredictionWhenPrdStrt(String.valueOf(riskassessmentpredictionwhenperiod.getStart()));
		}
		/******************** riskassessmentpredictionwhenrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range riskassessmentpredictionwhenrange = riskassessmentprediction.getWhenRange();

		/******************** riskassessmentpredictionwhenrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionwhenrangelow = riskassessmentpredictionwhenrange.getLow();

		/******************** RskAssmnt_Prediction_WhenRng_Lw_Vl ********************************************************************************/
		if(riskassessmentpredictionwhenrangelow.hasValue()) {
			r.setRskAssmntPredictionWhenRngLwVl(String.valueOf(riskassessmentpredictionwhenrangelow.getValue()));
		}
		/******************** riskassessmentpredictionwhenrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskassessmentpredictionwhenrangelowcomparator = riskassessmentpredictionwhenrangelow.getComparator();
		r.setRskAssmntPredictionWhenRngLwCmprtr(riskassessmentpredictionwhenrangelowcomparator.toCode());

		/******************** RskAssmnt_Prediction_WhenRng_Lw_Cd ********************************************************************************/
		if(riskassessmentpredictionwhenrangelow.hasCode()) {
			r.setRskAssmntPredictionWhenRngLwCd(String.valueOf(riskassessmentpredictionwhenrangelow.getCode()));
		}
		/******************** RskAssmnt_Prediction_WhenRng_Lw_Sys ********************************************************************************/
		if(riskassessmentpredictionwhenrangelow.hasSystem()) {
			r.setRskAssmntPredictionWhenRngLwSys(String.valueOf(riskassessmentpredictionwhenrangelow.getSystem()));
		}
		/******************** RskAssmnt_Prediction_WhenRng_Lw_Unt ********************************************************************************/
		if(riskassessmentpredictionwhenrangelow.hasUnit()) {
			r.setRskAssmntPredictionWhenRngLwUnt(String.valueOf(riskassessmentpredictionwhenrangelow.getUnit()));
		}
		/******************** riskassessmentpredictionwhenrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionwhenrangehigh = riskassessmentpredictionwhenrange.getHigh();

		/******************** RskAssmnt_Prediction_WhenRng_Hi_Vl ********************************************************************************/
		if(riskassessmentpredictionwhenrangehigh.hasValue()) {
			r.setRskAssmntPredictionWhenRngHiVl(String.valueOf(riskassessmentpredictionwhenrangehigh.getValue()));
		}
		/******************** riskassessmentpredictionwhenrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator riskassessmentpredictionwhenrangehighcomparator = riskassessmentpredictionwhenrangehigh.getComparator();
		r.setRskAssmntPredictionWhenRngHiCmprtr(riskassessmentpredictionwhenrangehighcomparator.toCode());

		/******************** RskAssmnt_Prediction_WhenRng_Hi_Cd ********************************************************************************/
		if(riskassessmentpredictionwhenrangehigh.hasCode()) {
			r.setRskAssmntPredictionWhenRngHiCd(String.valueOf(riskassessmentpredictionwhenrangehigh.getCode()));
		}
		/******************** RskAssmnt_Prediction_WhenRng_Hi_Sys ********************************************************************************/
		if(riskassessmentpredictionwhenrangehigh.hasSystem()) {
			r.setRskAssmntPredictionWhenRngHiSys(String.valueOf(riskassessmentpredictionwhenrangehigh.getSystem()));
		}
		/******************** RskAssmnt_Prediction_WhenRng_Hi_Unt ********************************************************************************/
		if(riskassessmentpredictionwhenrangehigh.hasUnit()) {
			r.setRskAssmntPredictionWhenRngHiUnt(String.valueOf(riskassessmentpredictionwhenrangehigh.getUnit()));
		}
		/******************** RskAssmnt_Prediction_Rtionale ********************************************************************************/
		if(riskassessmentprediction.hasRationale()) {
			r.setRskAssmntPredictionRtionale(String.valueOf(riskassessmentprediction.getRationale()));
		}
		/******************** RskAssmnt_Sbjct ********************************************************************************/
		if(riskassessment.hasSubject()) {
			r.setRskAssmntSbjct(String.valueOf(riskassessment.getSubject()));
		}
		/******************** riskassessmentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentStatus riskassessmentstatus = riskassessment.getStatus();
		r.setRskAssmntSts(riskassessmentstatus.toCode());

		/******************** RskAssmnt_Enc ********************************************************************************/
		if(riskassessment.hasEncounter()) {
			r.setRskAssmntEnc(String.valueOf(riskassessment.getEncounter()));
		}
		/******************** RskAssmnt_BasedOn ********************************************************************************/
		if(riskassessment.hasBasedOn()) {
			r.setRskAssmntBasedOn(String.valueOf(riskassessment.getBasedOn()));
		}
		/******************** riskassessmentnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation riskassessmentnote = riskassessment.getNoteFirstRep();

		/******************** RskAssmnt_Nt_Time ********************************************************************************/
		if(riskassessmentnote.hasTime()) {
			r.setRskAssmntNtTime(String.valueOf(riskassessmentnote.getTime()));
		}
		/******************** RskAssmnt_Nt_AthrRfrnc ********************************************************************************/
		if(riskassessmentnote.hasAuthorReference()) {
			r.setRskAssmntNtAthrRfrnc(String.valueOf(riskassessmentnote.getAuthorReference()));
		}
		/******************** RskAssmnt_Nt_Txt ********************************************************************************/
		if(riskassessmentnote.hasText()) {
			r.setRskAssmntNtTxt(String.valueOf(riskassessmentnote.getText()));
		}
		/******************** RskAssmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(riskassessmentnote.hasAuthorStringType()) {
			r.setRskAssmntNtAthrStrgTyp(String.valueOf(riskassessmentnote.getAuthorStringType()));
		}
		/******************** RskAssmnt_RsnRfrnc ********************************************************************************/
		if(riskassessment.hasReasonReference()) {
			r.setRskAssmntRsnRfrnc(String.valueOf(riskassessment.getReasonReferenceFirstRep()));
		}
		/******************** riskassessmentreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentreasoncode = riskassessment.getReasonCodeFirstRep();

		/******************** riskassessmentreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentreasoncodecoding = riskassessmentreasoncode.getCodingFirstRep();

		/******************** RskAssmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(riskassessmentreasoncodecoding.hasDisplay()) {
			r.setRskAssmntRsnCdCdgDsply(String.valueOf(riskassessmentreasoncodecoding.getDisplay()));
		}
		/******************** RskAssmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentreasoncodecoding.hasVersion()) {
			r.setRskAssmntRsnCdCdgVrsn(String.valueOf(riskassessmentreasoncodecoding.getVersion()));
		}
		/******************** RskAssmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(riskassessmentreasoncodecoding.hasCode()) {
			r.setRskAssmntRsnCdCdgCd(String.valueOf(riskassessmentreasoncodecoding.getCode()));
		}
		/******************** RskAssmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(riskassessmentreasoncodecoding.hasSystem()) {
			r.setRskAssmntRsnCdCdgSys(String.valueOf(riskassessmentreasoncodecoding.getSystem()));
		}
		/******************** RskAssmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentreasoncodecoding.hasUserSelected()) {
			r.setRskAssmntRsnCdCdgUsrSltd(String.valueOf(riskassessmentreasoncodecoding.getUserSelected()));
		}
		/******************** RskAssmnt_RsnCd_Txt ********************************************************************************/
		if(riskassessmentreasoncode.hasText()) {
			r.setRskAssmntRsnCdTxt(String.valueOf(riskassessmentreasoncode.getText()));
		}
		/******************** RskAssmnt_Cndtn ********************************************************************************/
		if(riskassessment.hasCondition()) {
			r.setRskAssmntCndtn(String.valueOf(riskassessment.getCondition()));
		}
		/******************** RskAssmnt_Prfrmr ********************************************************************************/
		if(riskassessment.hasPerformer()) {
			r.setRskAssmntPrfrmr(String.valueOf(riskassessment.getPerformer()));
		}
		/******************** RskAssmnt_Basis ********************************************************************************/
		if(riskassessment.hasBasis()) {
			r.setRskAssmntBasis(String.valueOf(riskassessment.getBasisFirstRep()));
		}
		/******************** RskAssmnt_Mitigation ********************************************************************************/
		if(riskassessment.hasMitigation()) {
			r.setRskAssmntMitigation(String.valueOf(riskassessment.getMitigation()));
		}
		/******************** riskassessmentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier riskassessmentidentifier = riskassessment.getIdentifierFirstRep();

		/******************** RskAssmnt_Id_Vl ********************************************************************************/
		if(riskassessmentidentifier.hasValue()) {
			r.setRskAssmntIdVl(String.valueOf(riskassessmentidentifier.getValue()));
		}
		/******************** riskassessmentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentidentifiertype = riskassessmentidentifier.getType();

		/******************** riskassessmentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentidentifiertypecoding = riskassessmentidentifiertype.getCodingFirstRep();

		/******************** RskAssmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(riskassessmentidentifiertypecoding.hasDisplay()) {
			r.setRskAssmntIdTypCdgDsply(String.valueOf(riskassessmentidentifiertypecoding.getDisplay()));
		}
		/******************** RskAssmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(riskassessmentidentifiertypecoding.hasVersion()) {
			r.setRskAssmntIdTypCdgVrsn(String.valueOf(riskassessmentidentifiertypecoding.getVersion()));
		}
		/******************** RskAssmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(riskassessmentidentifiertypecoding.hasCode()) {
			r.setRskAssmntIdTypCdgCd(String.valueOf(riskassessmentidentifiertypecoding.getCode()));
		}
		/******************** RskAssmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(riskassessmentidentifiertypecoding.hasSystem()) {
			r.setRskAssmntIdTypCdgSys(String.valueOf(riskassessmentidentifiertypecoding.getSystem()));
		}
		/******************** RskAssmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(riskassessmentidentifiertypecoding.hasUserSelected()) {
			r.setRskAssmntIdTypCdgUsrSltd(String.valueOf(riskassessmentidentifiertypecoding.getUserSelected()));
		}
		/******************** RskAssmnt_Id_Typ_Txt ********************************************************************************/
		if(riskassessmentidentifiertype.hasText()) {
			r.setRskAssmntIdTypTxt(String.valueOf(riskassessmentidentifiertype.getText()));
		}
		/******************** RskAssmnt_Id_Sys ********************************************************************************/
		if(riskassessmentidentifier.hasSystem()) {
			r.setRskAssmntIdSys(String.valueOf(riskassessmentidentifier.getSystem()));
		}
		/******************** RskAssmnt_Id_Assigner ********************************************************************************/
		if(riskassessmentidentifier.hasAssigner()) {
			r.setRskAssmntIdAssigner(String.valueOf(riskassessmentidentifier.getAssigner()));
		}
		/******************** riskassessmentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskassessmentidentifierperiod = riskassessmentidentifier.getPeriod();

		/******************** RskAssmnt_Id_Prd_End ********************************************************************************/
		if(riskassessmentidentifierperiod.hasEnd()) {
			r.setRskAssmntIdPrdEnd(String.valueOf(riskassessmentidentifierperiod.getEnd()));
		}
		/******************** RskAssmnt_Id_Prd_Strt ********************************************************************************/
		if(riskassessmentidentifierperiod.hasStart()) {
			r.setRskAssmntIdPrdStrt(String.valueOf(riskassessmentidentifierperiod.getStart()));
		}
		/******************** riskassessmentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse riskassessmentidentifieruse = riskassessmentidentifier.getUse();
		r.setRskAssmntIdUse(riskassessmentidentifieruse.toCode());

		return r;
	}
}
