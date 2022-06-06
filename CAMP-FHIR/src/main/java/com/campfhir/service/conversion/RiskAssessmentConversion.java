package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RiskAssessment;
public class RiskAssessmentConversion 
{
	public org.hl7.fhir.r4.model.RiskAssessment RiskAssessments(RiskAssessment r) throws ParseException
	{
		org.hl7.fhir.r4.model.RiskAssessment riskassessment = new org.hl7.fhir.r4.model.RiskAssessment();

		/******************** id ********************************************************************************/
		riskassessment.setId(r.getId());

		/******************** RskAssmnt_BasedOn ********************************************************************************/
		if(r.getRskAssmntBasedOn() != null) {
			riskassessment.setBasedOn( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntBasedOn()));
		}
		/******************** RskAssmnt_Basis ********************************************************************************/
		if(r.getRskAssmntBasis() != null) {
			riskassessment.addBasis( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntBasis()));
		}
		/******************** riskassessmentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskassessment.setCode(riskassessmentcode);

		/******************** riskassessmentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentcodecoding =  new org.hl7.fhir.r4.model.Coding();
		riskassessmentcode.addCoding(riskassessmentcodecoding);

		/******************** RskAssmnt_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntCdCdgCd() != null) {
			riskassessmentcodecoding.setCode(r.getRskAssmntCdCdgCd());
		}
		/******************** RskAssmnt_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntCdCdgDsply() != null) {
			riskassessmentcodecoding.setDisplay(r.getRskAssmntCdCdgDsply());
		}
		/******************** RskAssmnt_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntCdCdgSys() != null) {
			riskassessmentcodecoding.setSystem(r.getRskAssmntCdCdgSys());
		}
		/******************** RskAssmnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntCdCdgUsrSltd() != null) {
			riskassessmentcodecoding.setUserSelected(Boolean.parseBoolean(r.getRskAssmntCdCdgUsrSltd()));
		}
		/******************** RskAssmnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntCdCdgVrsn() != null) {
			riskassessmentcodecoding.setVersion(r.getRskAssmntCdCdgVrsn());
		}
		/******************** RskAssmnt_Cd_Txt ********************************************************************************/
		if(r.getRskAssmntCdTxt() != null) {
			riskassessmentcode.setText(r.getRskAssmntCdTxt());
		}
		/******************** RskAssmnt_Cndtn ********************************************************************************/
		if(r.getRskAssmntCndtn() != null) {
			riskassessment.setCondition( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntCndtn()));
		}
		/******************** RskAssmnt_Enc ********************************************************************************/
		if(r.getRskAssmntEnc() != null) {
			riskassessment.setEncounter( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntEnc()));
		}
		/******************** riskassessmentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier riskassessmentidentifier =  new org.hl7.fhir.r4.model.Identifier();
		riskassessment.addIdentifier(riskassessmentidentifier);

		/******************** RskAssmnt_Id_Assigner ********************************************************************************/
		if(r.getRskAssmntIdAssigner() != null) {
			riskassessmentidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntIdAssigner()));
		}
		/******************** riskassessmentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskassessmentidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		riskassessmentidentifier.setPeriod(riskassessmentidentifierperiod);

		/******************** RskAssmnt_Id_Prd_End ********************************************************************************/
		if(r.getRskAssmntIdPrdEnd() != null) {
			java.text.SimpleDateFormat RskAssmnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskAssmnt_Id_Prd_Enddate = RskAssmnt_Id_Prd_Endsdf.parse(r.getRskAssmntIdPrdEnd());
			riskassessmentidentifierperiod.setEnd(RskAssmnt_Id_Prd_Enddate);
		}
		/******************** RskAssmnt_Id_Prd_Strt ********************************************************************************/
		if(r.getRskAssmntIdPrdStrt() != null) {
			java.text.SimpleDateFormat RskAssmnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskAssmnt_Id_Prd_Strtdate = RskAssmnt_Id_Prd_Strtsdf.parse(r.getRskAssmntIdPrdStrt());
			riskassessmentidentifierperiod.setStart(RskAssmnt_Id_Prd_Strtdate);
		}
		/******************** RskAssmnt_Id_Sys ********************************************************************************/
		if(r.getRskAssmntIdSys() != null) {
			riskassessmentidentifier.setSystem(r.getRskAssmntIdSys());
		}
		/******************** riskassessmentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskassessmentidentifier.setType(riskassessmentidentifiertype);

		/******************** riskassessmentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		riskassessmentidentifiertype.addCoding(riskassessmentidentifiertypecoding);

		/******************** RskAssmnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntIdTypCdgCd() != null) {
			riskassessmentidentifiertypecoding.setCode(r.getRskAssmntIdTypCdgCd());
		}
		/******************** RskAssmnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntIdTypCdgDsply() != null) {
			riskassessmentidentifiertypecoding.setDisplay(r.getRskAssmntIdTypCdgDsply());
		}
		/******************** RskAssmnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntIdTypCdgSys() != null) {
			riskassessmentidentifiertypecoding.setSystem(r.getRskAssmntIdTypCdgSys());
		}
		/******************** RskAssmnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntIdTypCdgUsrSltd() != null) {
			riskassessmentidentifiertypecoding.setUserSelected(Boolean.parseBoolean(r.getRskAssmntIdTypCdgUsrSltd()));
		}
		/******************** RskAssmnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntIdTypCdgVrsn() != null) {
			riskassessmentidentifiertypecoding.setVersion(r.getRskAssmntIdTypCdgVrsn());
		}
		/******************** RskAssmnt_Id_Typ_Txt ********************************************************************************/
		if(r.getRskAssmntIdTypTxt() != null) {
			riskassessmentidentifiertype.setText(r.getRskAssmntIdTypTxt());
		}
		/******************** riskassessmentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory riskassessmentidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		riskassessmentidentifier.setUse(riskassessmentidentifieruse.fromCode(r.getRskAssmntIdUse()));

		/******************** RskAssmnt_Id_Vl ********************************************************************************/
		if(r.getRskAssmntIdVl() != null) {
			riskassessmentidentifier.setValue(r.getRskAssmntIdVl());
		}
		/******************** riskassessmentmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskassessment.setMethod(riskassessmentmethod);

		/******************** riskassessmentmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		riskassessmentmethod.addCoding(riskassessmentmethodcoding);

		/******************** RskAssmnt_Mthd_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntMthdCdgCd() != null) {
			riskassessmentmethodcoding.setCode(r.getRskAssmntMthdCdgCd());
		}
		/******************** RskAssmnt_Mthd_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntMthdCdgDsply() != null) {
			riskassessmentmethodcoding.setDisplay(r.getRskAssmntMthdCdgDsply());
		}
		/******************** RskAssmnt_Mthd_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntMthdCdgSys() != null) {
			riskassessmentmethodcoding.setSystem(r.getRskAssmntMthdCdgSys());
		}
		/******************** RskAssmnt_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntMthdCdgUsrSltd() != null) {
			riskassessmentmethodcoding.setUserSelected(Boolean.parseBoolean(r.getRskAssmntMthdCdgUsrSltd()));
		}
		/******************** RskAssmnt_Mthd_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntMthdCdgVrsn() != null) {
			riskassessmentmethodcoding.setVersion(r.getRskAssmntMthdCdgVrsn());
		}
		/******************** RskAssmnt_Mthd_Txt ********************************************************************************/
		if(r.getRskAssmntMthdTxt() != null) {
			riskassessmentmethod.setText(r.getRskAssmntMthdTxt());
		}
		/******************** RskAssmnt_Mitigation ********************************************************************************/
		if(r.getRskAssmntMitigation() != null) {
			riskassessment.setMitigation(r.getRskAssmntMitigation());
		}
		/******************** riskassessmentnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation riskassessmentnote =  new org.hl7.fhir.r4.model.Annotation();
		riskassessment.addNote(riskassessmentnote);

		/******************** RskAssmnt_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRskAssmntNtAthrRfrnc() != null) {
			riskassessmentnote.setAuthor( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntNtAthrRfrnc()));
		}
		/******************** RskAssmnt_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRskAssmntNtAthrStrgTyp() != null) {
			riskassessmentnote.setAuthor( new org.hl7.fhir.r4.model.StringType(r.getRskAssmntNtAthrStrgTyp()));
		}
		/******************** RskAssmnt_Nt_Txt ********************************************************************************/
		if(r.getRskAssmntNtTxt() != null) {
			riskassessmentnote.setText(r.getRskAssmntNtTxt());
		}
		/******************** RskAssmnt_Nt_Time ********************************************************************************/
		if(r.getRskAssmntNtTime() != null) {
			java.text.SimpleDateFormat RskAssmnt_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskAssmnt_Nt_Timedate = RskAssmnt_Nt_Timesdf.parse(r.getRskAssmntNtTime());
			riskassessmentnote.setTime(RskAssmnt_Nt_Timedate);
		}
		/******************** RskAssmnt_OccrnceDtTimeTyp ********************************************************************************/
		if(r.getRskAssmntOccrnceDtTimeTyp() != null) {
			riskassessment.setOccurrence( new org.hl7.fhir.r4.model.DateTimeType(r.getRskAssmntOccrnceDtTimeTyp()));
		}
		/******************** riskassessmentoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskassessmentoccurrenceperiod =  new org.hl7.fhir.r4.model.Period();
		riskassessment.setOccurrence(riskassessmentoccurrenceperiod);

		/******************** RskAssmnt_OccrncePrd_End ********************************************************************************/
		if(r.getRskAssmntOccrncePrdEnd() != null) {
			java.text.SimpleDateFormat RskAssmnt_OccrncePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskAssmnt_OccrncePrd_Enddate = RskAssmnt_OccrncePrd_Endsdf.parse(r.getRskAssmntOccrncePrdEnd());
			riskassessmentoccurrenceperiod.setEnd(RskAssmnt_OccrncePrd_Enddate);
		}
		/******************** RskAssmnt_OccrncePrd_Strt ********************************************************************************/
		if(r.getRskAssmntOccrncePrdStrt() != null) {
			java.text.SimpleDateFormat RskAssmnt_OccrncePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskAssmnt_OccrncePrd_Strtdate = RskAssmnt_OccrncePrd_Strtsdf.parse(r.getRskAssmntOccrncePrdStrt());
			riskassessmentoccurrenceperiod.setStart(RskAssmnt_OccrncePrd_Strtdate);
		}
		/******************** RskAssmnt_Parent ********************************************************************************/
		if(r.getRskAssmntParent() != null) {
			riskassessment.setParent( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntParent()));
		}
		/******************** RskAssmnt_Prfrmr ********************************************************************************/
		if(r.getRskAssmntPrfrmr() != null) {
			riskassessment.setPerformer( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntPrfrmr()));
		}
		/******************** riskassessmentprediction ********************************************************************************/
		org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent riskassessmentprediction =  new org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentPredictionComponent();
		riskassessment.addPrediction(riskassessmentprediction);

		/******************** riskassessmentpredictionoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentpredictionoutcome =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskassessmentprediction.setOutcome(riskassessmentpredictionoutcome);

		/******************** riskassessmentpredictionoutcomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentpredictionoutcomecoding =  new org.hl7.fhir.r4.model.Coding();
		riskassessmentpredictionoutcome.addCoding(riskassessmentpredictionoutcomecoding);

		/******************** RskAssmnt_Prediction_Outcome_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgCd() != null) {
			riskassessmentpredictionoutcomecoding.setCode(r.getRskAssmntPredictionOutcomeCdgCd());
		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgDsply() != null) {
			riskassessmentpredictionoutcomecoding.setDisplay(r.getRskAssmntPredictionOutcomeCdgDsply());
		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgSys() != null) {
			riskassessmentpredictionoutcomecoding.setSystem(r.getRskAssmntPredictionOutcomeCdgSys());
		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgUsrSltd() != null) {
			riskassessmentpredictionoutcomecoding.setUserSelected(Boolean.parseBoolean(r.getRskAssmntPredictionOutcomeCdgUsrSltd()));
		}
		/******************** RskAssmnt_Prediction_Outcome_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeCdgVrsn() != null) {
			riskassessmentpredictionoutcomecoding.setVersion(r.getRskAssmntPredictionOutcomeCdgVrsn());
		}
		/******************** RskAssmnt_Prediction_Outcome_Txt ********************************************************************************/
		if(r.getRskAssmntPredictionOutcomeTxt() != null) {
			riskassessmentpredictionoutcome.setText(r.getRskAssmntPredictionOutcomeTxt());
		}
		/******************** RskAssmnt_Prediction_ProbabilityDecimalTyp ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityDecimalTyp() != null) {
			riskassessmentprediction.setProbability( new org.hl7.fhir.r4.model.DecimalType(r.getRskAssmntPredictionProbabilityDecimalTyp()));
		}
		/******************** riskassessmentpredictionprobabilityrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range riskassessmentpredictionprobabilityrange =  new org.hl7.fhir.r4.model.Range();
		riskassessmentprediction.setProbability(riskassessmentpredictionprobabilityrange);

		/******************** riskassessmentpredictionprobabilityrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionprobabilityrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		riskassessmentpredictionprobabilityrange.setHigh(riskassessmentpredictionprobabilityrangehigh);

		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngHiCd() != null) {
			riskassessmentpredictionprobabilityrangehigh.setCode(r.getRskAssmntPredictionProbabilityRngHiCd());
		}
		/******************** riskassessmentpredictionprobabilityrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory riskassessmentpredictionprobabilityrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		riskassessmentpredictionprobabilityrangehigh.setComparator(riskassessmentpredictionprobabilityrangehighcomparator.fromCode(r.getRskAssmntPredictionProbabilityRngHiCmprtr()));

		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngHiSys() != null) {
			riskassessmentpredictionprobabilityrangehigh.setSystem(r.getRskAssmntPredictionProbabilityRngHiSys());
		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Unt ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngHiUnt() != null) {
			riskassessmentpredictionprobabilityrangehigh.setUnit(r.getRskAssmntPredictionProbabilityRngHiUnt());
		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Hi_Vl ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngHiVl() != null) {
			riskassessmentpredictionprobabilityrangehigh.setValue(Double.parseDouble((r.getRskAssmntPredictionProbabilityRngHiVl())));
		}
		/******************** riskassessmentpredictionprobabilityrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionprobabilityrangelow =  new org.hl7.fhir.r4.model.Quantity();
		riskassessmentpredictionprobabilityrange.setLow(riskassessmentpredictionprobabilityrangelow);

		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngLwCd() != null) {
			riskassessmentpredictionprobabilityrangelow.setCode(r.getRskAssmntPredictionProbabilityRngLwCd());
		}
		/******************** riskassessmentpredictionprobabilityrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory riskassessmentpredictionprobabilityrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		riskassessmentpredictionprobabilityrangelow.setComparator(riskassessmentpredictionprobabilityrangelowcomparator.fromCode(r.getRskAssmntPredictionProbabilityRngLwCmprtr()));

		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngLwSys() != null) {
			riskassessmentpredictionprobabilityrangelow.setSystem(r.getRskAssmntPredictionProbabilityRngLwSys());
		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Unt ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngLwUnt() != null) {
			riskassessmentpredictionprobabilityrangelow.setUnit(r.getRskAssmntPredictionProbabilityRngLwUnt());
		}
		/******************** RskAssmnt_Prediction_ProbabilityRng_Lw_Vl ********************************************************************************/
		if(r.getRskAssmntPredictionProbabilityRngLwVl() != null) {
			riskassessmentpredictionprobabilityrangelow.setValue(Double.parseDouble((r.getRskAssmntPredictionProbabilityRngLwVl())));
		}
		/******************** riskassessmentpredictionqualitativerisk ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentpredictionqualitativerisk =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskassessmentprediction.setQualitativeRisk(riskassessmentpredictionqualitativerisk);

		/******************** riskassessmentpredictionqualitativeriskcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentpredictionqualitativeriskcoding =  new org.hl7.fhir.r4.model.Coding();
		riskassessmentpredictionqualitativerisk.addCoding(riskassessmentpredictionqualitativeriskcoding);

		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgCd() != null) {
			riskassessmentpredictionqualitativeriskcoding.setCode(r.getRskAssmntPredictionQualitativeRskCdgCd());
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgDsply() != null) {
			riskassessmentpredictionqualitativeriskcoding.setDisplay(r.getRskAssmntPredictionQualitativeRskCdgDsply());
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgSys() != null) {
			riskassessmentpredictionqualitativeriskcoding.setSystem(r.getRskAssmntPredictionQualitativeRskCdgSys());
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgUsrSltd() != null) {
			riskassessmentpredictionqualitativeriskcoding.setUserSelected(Boolean.parseBoolean(r.getRskAssmntPredictionQualitativeRskCdgUsrSltd()));
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskCdgVrsn() != null) {
			riskassessmentpredictionqualitativeriskcoding.setVersion(r.getRskAssmntPredictionQualitativeRskCdgVrsn());
		}
		/******************** RskAssmnt_Prediction_QualitativeRsk_Txt ********************************************************************************/
		if(r.getRskAssmntPredictionQualitativeRskTxt() != null) {
			riskassessmentpredictionqualitativerisk.setText(r.getRskAssmntPredictionQualitativeRskTxt());
		}
		/******************** RskAssmnt_Prediction_Rtionale ********************************************************************************/
		if(r.getRskAssmntPredictionRtionale() != null) {
			riskassessmentprediction.setRationale(r.getRskAssmntPredictionRtionale());
		}
		/******************** RskAssmnt_Prediction_RelativeRsk ********************************************************************************/
		if(r.getRskAssmntPredictionRelativeRsk() != null) {
			riskassessmentprediction.setRelativeRisk(Double.parseDouble((r.getRskAssmntPredictionRelativeRsk())));
		}
		/******************** riskassessmentpredictionwhenperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period riskassessmentpredictionwhenperiod =  new org.hl7.fhir.r4.model.Period();
		riskassessmentprediction.setWhen(riskassessmentpredictionwhenperiod);

		/******************** RskAssmnt_Prediction_WhenPrd_End ********************************************************************************/
		if(r.getRskAssmntPredictionWhenPrdEnd() != null) {
			java.text.SimpleDateFormat RskAssmnt_Prediction_WhenPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskAssmnt_Prediction_WhenPrd_Enddate = RskAssmnt_Prediction_WhenPrd_Endsdf.parse(r.getRskAssmntPredictionWhenPrdEnd());
			riskassessmentpredictionwhenperiod.setEnd(RskAssmnt_Prediction_WhenPrd_Enddate);
		}
		/******************** RskAssmnt_Prediction_WhenPrd_Strt ********************************************************************************/
		if(r.getRskAssmntPredictionWhenPrdStrt() != null) {
			java.text.SimpleDateFormat RskAssmnt_Prediction_WhenPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date RskAssmnt_Prediction_WhenPrd_Strtdate = RskAssmnt_Prediction_WhenPrd_Strtsdf.parse(r.getRskAssmntPredictionWhenPrdStrt());
			riskassessmentpredictionwhenperiod.setStart(RskAssmnt_Prediction_WhenPrd_Strtdate);
		}
		/******************** riskassessmentpredictionwhenrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range riskassessmentpredictionwhenrange =  new org.hl7.fhir.r4.model.Range();
		riskassessmentprediction.setWhen(riskassessmentpredictionwhenrange);

		/******************** riskassessmentpredictionwhenrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionwhenrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		riskassessmentpredictionwhenrange.setHigh(riskassessmentpredictionwhenrangehigh);

		/******************** RskAssmnt_Prediction_WhenRng_Hi_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngHiCd() != null) {
			riskassessmentpredictionwhenrangehigh.setCode(r.getRskAssmntPredictionWhenRngHiCd());
		}
		/******************** riskassessmentpredictionwhenrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory riskassessmentpredictionwhenrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		riskassessmentpredictionwhenrangehigh.setComparator(riskassessmentpredictionwhenrangehighcomparator.fromCode(r.getRskAssmntPredictionWhenRngHiCmprtr()));

		/******************** RskAssmnt_Prediction_WhenRng_Hi_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngHiSys() != null) {
			riskassessmentpredictionwhenrangehigh.setSystem(r.getRskAssmntPredictionWhenRngHiSys());
		}
		/******************** RskAssmnt_Prediction_WhenRng_Hi_Unt ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngHiUnt() != null) {
			riskassessmentpredictionwhenrangehigh.setUnit(r.getRskAssmntPredictionWhenRngHiUnt());
		}
		/******************** RskAssmnt_Prediction_WhenRng_Hi_Vl ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngHiVl() != null) {
			riskassessmentpredictionwhenrangehigh.setValue(Double.parseDouble((r.getRskAssmntPredictionWhenRngHiVl())));
		}
		/******************** riskassessmentpredictionwhenrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity riskassessmentpredictionwhenrangelow =  new org.hl7.fhir.r4.model.Quantity();
		riskassessmentpredictionwhenrange.setLow(riskassessmentpredictionwhenrangelow);

		/******************** RskAssmnt_Prediction_WhenRng_Lw_Cd ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngLwCd() != null) {
			riskassessmentpredictionwhenrangelow.setCode(r.getRskAssmntPredictionWhenRngLwCd());
		}
		/******************** riskassessmentpredictionwhenrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory riskassessmentpredictionwhenrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		riskassessmentpredictionwhenrangelow.setComparator(riskassessmentpredictionwhenrangelowcomparator.fromCode(r.getRskAssmntPredictionWhenRngLwCmprtr()));

		/******************** RskAssmnt_Prediction_WhenRng_Lw_Sys ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngLwSys() != null) {
			riskassessmentpredictionwhenrangelow.setSystem(r.getRskAssmntPredictionWhenRngLwSys());
		}
		/******************** RskAssmnt_Prediction_WhenRng_Lw_Unt ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngLwUnt() != null) {
			riskassessmentpredictionwhenrangelow.setUnit(r.getRskAssmntPredictionWhenRngLwUnt());
		}
		/******************** RskAssmnt_Prediction_WhenRng_Lw_Vl ********************************************************************************/
		if(r.getRskAssmntPredictionWhenRngLwVl() != null) {
			riskassessmentpredictionwhenrangelow.setValue(Double.parseDouble((r.getRskAssmntPredictionWhenRngLwVl())));
		}
		/******************** riskassessmentreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept riskassessmentreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		riskassessment.addReasonCode(riskassessmentreasoncode);

		/******************** riskassessmentreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding riskassessmentreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		riskassessmentreasoncode.addCoding(riskassessmentreasoncodecoding);

		/******************** RskAssmnt_RsnCd_Cdg_Cd ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgCd() != null) {
			riskassessmentreasoncodecoding.setCode(r.getRskAssmntRsnCdCdgCd());
		}
		/******************** RskAssmnt_RsnCd_Cdg_Dsply ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgDsply() != null) {
			riskassessmentreasoncodecoding.setDisplay(r.getRskAssmntRsnCdCdgDsply());
		}
		/******************** RskAssmnt_RsnCd_Cdg_Sys ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgSys() != null) {
			riskassessmentreasoncodecoding.setSystem(r.getRskAssmntRsnCdCdgSys());
		}
		/******************** RskAssmnt_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgUsrSltd() != null) {
			riskassessmentreasoncodecoding.setUserSelected(Boolean.parseBoolean(r.getRskAssmntRsnCdCdgUsrSltd()));
		}
		/******************** RskAssmnt_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(r.getRskAssmntRsnCdCdgVrsn() != null) {
			riskassessmentreasoncodecoding.setVersion(r.getRskAssmntRsnCdCdgVrsn());
		}
		/******************** RskAssmnt_RsnCd_Txt ********************************************************************************/
		if(r.getRskAssmntRsnCdTxt() != null) {
			riskassessmentreasoncode.setText(r.getRskAssmntRsnCdTxt());
		}
		/******************** RskAssmnt_RsnRfrnc ********************************************************************************/
		if(r.getRskAssmntRsnRfrnc() != null) {
			riskassessment.addReasonReference( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntRsnRfrnc()));
		}
		/******************** riskassessmentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentStatusEnumFactory riskassessmentstatus =  new org.hl7.fhir.r4.model.RiskAssessment.RiskAssessmentStatusEnumFactory();
		riskassessment.setStatus(riskassessmentstatus.fromCode(r.getRskAssmntSts()));

		/******************** RskAssmnt_Sbjct ********************************************************************************/
		if(r.getRskAssmntSbjct() != null) {
			riskassessment.setSubject( new org.hl7.fhir.r4.model.Reference(r.getRskAssmntSbjct()));
		}
		return riskassessment;
	}
}
