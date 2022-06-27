package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ObservationDefinition;
public class ObservationDefinitionBidirectionalConversion 
{
	public ObservationDefinition ObservationDefinitions(org.hl7.fhir.r4.model.ObservationDefinition observationdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ObservationDefinition o = new  main.java.com.campfhir.model.ObservationDefinition();

		/******************** id ********************************************************************************/
		observationdefinition.setId(o.getId());

		/******************** observationdefinitionmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionmethod = observationdefinition.getMethod();

		/******************** ObsrvtnDfn_Mthd_Txt ********************************************************************************/
		if(observationdefinitionmethod.hasText()) {
			o.setObsrvtnDfnMthdTxt(String.valueOf(observationdefinitionmethod.getText()));
		}
		/******************** observationdefinitionmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionmethodcoding = observationdefinitionmethod.getCodingFirstRep();

		/******************** ObsrvtnDfn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionmethodcoding.hasVersion()) {
			o.setObsrvtnDfnMthdCdgVrsn(String.valueOf(observationdefinitionmethodcoding.getVersion()));
		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionmethodcoding.hasDisplay()) {
			o.setObsrvtnDfnMthdCdgDsply(String.valueOf(observationdefinitionmethodcoding.getDisplay()));
		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Cd ********************************************************************************/
		if(observationdefinitionmethodcoding.hasCode()) {
			o.setObsrvtnDfnMthdCdgCd(String.valueOf(observationdefinitionmethodcoding.getCode()));
		}
		/******************** ObsrvtnDfn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionmethodcoding.hasUserSelected()) {
			o.setObsrvtnDfnMthdCdgUsrSltd(String.valueOf(observationdefinitionmethodcoding.getUserSelected()));
		}
		/******************** ObsrvtnDfn_Mthd_Cdg_Sys ********************************************************************************/
		if(observationdefinitionmethodcoding.hasSystem()) {
			o.setObsrvtnDfnMthdCdgSys(String.valueOf(observationdefinitionmethodcoding.getSystem()));
		}
		/******************** observationdefinitionquantitativedetails ********************************************************************************/
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQuantitativeDetailsComponent observationdefinitionquantitativedetails = observationdefinition.getQuantitativeDetails();

		/******************** observationdefinitionquantitativedetailsunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionquantitativedetailsunit = observationdefinitionquantitativedetails.getUnit();

		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Txt ********************************************************************************/
		if(observationdefinitionquantitativedetailsunit.hasText()) {
			o.setObsrvtnDfnQuantitativeDtlsUntTxt(String.valueOf(observationdefinitionquantitativedetailsunit.getText()));
		}
		/******************** observationdefinitionquantitativedetailsunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionquantitativedetailsunitcoding = observationdefinitionquantitativedetailsunit.getCodingFirstRep();

		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcoding.hasVersion()) {
			o.setObsrvtnDfnQuantitativeDtlsUntCdgVrsn(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getVersion()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcoding.hasDisplay()) {
			o.setObsrvtnDfnQuantitativeDtlsUntCdgDsply(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getDisplay()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Cd ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcoding.hasCode()) {
			o.setObsrvtnDfnQuantitativeDtlsUntCdgCd(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getCode()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcoding.hasUserSelected()) {
			o.setObsrvtnDfnQuantitativeDtlsUntCdgUsrSltd(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getUserSelected()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_Unt_Cdg_Sys ********************************************************************************/
		if(observationdefinitionquantitativedetailsunitcoding.hasSystem()) {
			o.setObsrvtnDfnQuantitativeDtlsUntCdgSys(String.valueOf(observationdefinitionquantitativedetailsunitcoding.getSystem()));
		}
		/******************** observationdefinitionquantitativedetailscustomaryunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionquantitativedetailscustomaryunit = observationdefinitionquantitativedetails.getCustomaryUnit();

		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Txt ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunit.hasText()) {
			o.setObsrvtnDfnQuantitativeDtlsCustomaryUntTxt(String.valueOf(observationdefinitionquantitativedetailscustomaryunit.getText()));
		}
		/******************** observationdefinitionquantitativedetailscustomaryunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionquantitativedetailscustomaryunitcoding = observationdefinitionquantitativedetailscustomaryunit.getCodingFirstRep();

		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasVersion()) {
			o.setObsrvtnDfnQuantitativeDtlsCustomaryUntCdgVrsn(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getVersion()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasDisplay()) {
			o.setObsrvtnDfnQuantitativeDtlsCustomaryUntCdgDsply(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getDisplay()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Cd ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasCode()) {
			o.setObsrvtnDfnQuantitativeDtlsCustomaryUntCdgCd(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getCode()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasUserSelected()) {
			o.setObsrvtnDfnQuantitativeDtlsCustomaryUntCdgUsrSltd(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getUserSelected()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_CustomaryUnt_Cdg_Sys ********************************************************************************/
		if(observationdefinitionquantitativedetailscustomaryunitcoding.hasSystem()) {
			o.setObsrvtnDfnQuantitativeDtlsCustomaryUntCdgSys(String.valueOf(observationdefinitionquantitativedetailscustomaryunitcoding.getSystem()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_DecimalPrecision ********************************************************************************/
		if(observationdefinitionquantitativedetails.hasDecimalPrecision()) {
			o.setObsrvtnDfnQuantitativeDtlsDecimalPrecision(String.valueOf(observationdefinitionquantitativedetails.getDecimalPrecision()));
		}
		/******************** ObsrvtnDfn_QuantitativeDtls_ConversionFactor ********************************************************************************/
		if(observationdefinitionquantitativedetails.hasConversionFactor()) {
			o.setObsrvtnDfnQuantitativeDtlsConversionFactor(String.valueOf(observationdefinitionquantitativedetails.getConversionFactor()));
		}
		/******************** ObsrvtnDfn_PreferredRptNm ********************************************************************************/
		if(observationdefinition.hasPreferredReportName()) {
			o.setObsrvtnDfnPreferredRptNm(String.valueOf(observationdefinition.getPreferredReportName()));
		}
		/******************** observationdefinitionqualifiedinterval ********************************************************************************/
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationDefinitionQualifiedIntervalComponent observationdefinitionqualifiedinterval = observationdefinition.getQualifiedIntervalFirstRep();

		/******************** observationdefinitionqualifiedintervalcontext ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionqualifiedintervalcontext = observationdefinitionqualifiedinterval.getContext();

		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Txt ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontext.hasText()) {
			o.setObsrvtnDfnQualifiedIntervalCntxtTxt(String.valueOf(observationdefinitionqualifiedintervalcontext.getText()));
		}
		/******************** observationdefinitionqualifiedintervalcontextcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionqualifiedintervalcontextcoding = observationdefinitionqualifiedintervalcontext.getCodingFirstRep();

		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcoding.hasVersion()) {
			o.setObsrvtnDfnQualifiedIntervalCntxtCdgVrsn(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getVersion()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcoding.hasDisplay()) {
			o.setObsrvtnDfnQualifiedIntervalCntxtCdgDsply(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getDisplay()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcoding.hasCode()) {
			o.setObsrvtnDfnQualifiedIntervalCntxtCdgCd(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getCode()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcoding.hasUserSelected()) {
			o.setObsrvtnDfnQualifiedIntervalCntxtCdgUsrSltd(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getUserSelected()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cntxt_Cdg_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalcontextcoding.hasSystem()) {
			o.setObsrvtnDfnQualifiedIntervalCntxtCdgSys(String.valueOf(observationdefinitionqualifiedintervalcontextcoding.getSystem()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Cndtn ********************************************************************************/
		if(observationdefinitionqualifiedinterval.hasCondition()) {
			o.setObsrvtnDfnQualifiedIntervalCndtn(String.valueOf(observationdefinitionqualifiedinterval.getCondition()));
		}
		/******************** observationdefinitionqualifiedintervalrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationdefinitionqualifiedintervalrange = observationdefinitionqualifiedinterval.getRange();

		/******************** observationdefinitionqualifiedintervalrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalrangelow = observationdefinitionqualifiedintervalrange.getLow();

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalrangelow.hasValue()) {
			o.setObsrvtnDfnQualifiedIntervalRngLwVl(String.valueOf(observationdefinitionqualifiedintervalrangelow.getValue()));
		}
		/******************** observationdefinitionqualifiedintervalrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalrangelowcomparator = observationdefinitionqualifiedintervalrangelow.getComparator();
		o.setObsrvtnDfnQualifiedIntervalRngLwCmprtr(observationdefinitionqualifiedintervalrangelowcomparator.toCode());

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalrangelow.hasCode()) {
			o.setObsrvtnDfnQualifiedIntervalRngLwCd(String.valueOf(observationdefinitionqualifiedintervalrangelow.getCode()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalrangelow.hasUnit()) {
			o.setObsrvtnDfnQualifiedIntervalRngLwUnt(String.valueOf(observationdefinitionqualifiedintervalrangelow.getUnit()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Lw_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalrangelow.hasSystem()) {
			o.setObsrvtnDfnQualifiedIntervalRngLwSys(String.valueOf(observationdefinitionqualifiedintervalrangelow.getSystem()));
		}
		/******************** observationdefinitionqualifiedintervalrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalrangehigh = observationdefinitionqualifiedintervalrange.getHigh();

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalrangehigh.hasValue()) {
			o.setObsrvtnDfnQualifiedIntervalRngHiVl(String.valueOf(observationdefinitionqualifiedintervalrangehigh.getValue()));
		}
		/******************** observationdefinitionqualifiedintervalrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalrangehighcomparator = observationdefinitionqualifiedintervalrangehigh.getComparator();
		o.setObsrvtnDfnQualifiedIntervalRngHiCmprtr(observationdefinitionqualifiedintervalrangehighcomparator.toCode());

		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalrangehigh.hasCode()) {
			o.setObsrvtnDfnQualifiedIntervalRngHiCd(String.valueOf(observationdefinitionqualifiedintervalrangehigh.getCode()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalrangehigh.hasUnit()) {
			o.setObsrvtnDfnQualifiedIntervalRngHiUnt(String.valueOf(observationdefinitionqualifiedintervalrangehigh.getUnit()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Rng_Hi_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalrangehigh.hasSystem()) {
			o.setObsrvtnDfnQualifiedIntervalRngHiSys(String.valueOf(observationdefinitionqualifiedintervalrangehigh.getSystem()));
		}
		/******************** observationdefinitionqualifiedintervalgestationalage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationdefinitionqualifiedintervalgestationalage = observationdefinitionqualifiedinterval.getGestationalAge();

		/******************** observationdefinitionqualifiedintervalgestationalagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalgestationalagelow = observationdefinitionqualifiedintervalgestationalage.getLow();

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagelow.hasValue()) {
			o.setObsrvtnDfnQualifiedIntervalGestationalAgeLwVl(String.valueOf(observationdefinitionqualifiedintervalgestationalagelow.getValue()));
		}
		/******************** observationdefinitionqualifiedintervalgestationalagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalgestationalagelowcomparator = observationdefinitionqualifiedintervalgestationalagelow.getComparator();
		o.setObsrvtnDfnQualifiedIntervalGestationalAgeLwCmprtr(observationdefinitionqualifiedintervalgestationalagelowcomparator.toCode());

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagelow.hasCode()) {
			o.setObsrvtnDfnQualifiedIntervalGestationalAgeLwCd(String.valueOf(observationdefinitionqualifiedintervalgestationalagelow.getCode()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagelow.hasUnit()) {
			o.setObsrvtnDfnQualifiedIntervalGestationalAgeLwUnt(String.valueOf(observationdefinitionqualifiedintervalgestationalagelow.getUnit()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Lw_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagelow.hasSystem()) {
			o.setObsrvtnDfnQualifiedIntervalGestationalAgeLwSys(String.valueOf(observationdefinitionqualifiedintervalgestationalagelow.getSystem()));
		}
		/******************** observationdefinitionqualifiedintervalgestationalagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalgestationalagehigh = observationdefinitionqualifiedintervalgestationalage.getHigh();

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagehigh.hasValue()) {
			o.setObsrvtnDfnQualifiedIntervalGestationalAgeHiVl(String.valueOf(observationdefinitionqualifiedintervalgestationalagehigh.getValue()));
		}
		/******************** observationdefinitionqualifiedintervalgestationalagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalgestationalagehighcomparator = observationdefinitionqualifiedintervalgestationalagehigh.getComparator();
		o.setObsrvtnDfnQualifiedIntervalGestationalAgeHiCmprtr(observationdefinitionqualifiedintervalgestationalagehighcomparator.toCode());

		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagehigh.hasCode()) {
			o.setObsrvtnDfnQualifiedIntervalGestationalAgeHiCd(String.valueOf(observationdefinitionqualifiedintervalgestationalagehigh.getCode()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagehigh.hasUnit()) {
			o.setObsrvtnDfnQualifiedIntervalGestationalAgeHiUnt(String.valueOf(observationdefinitionqualifiedintervalgestationalagehigh.getUnit()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_GestationalAge_Hi_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalgestationalagehigh.hasSystem()) {
			o.setObsrvtnDfnQualifiedIntervalGestationalAgeHiSys(String.valueOf(observationdefinitionqualifiedintervalgestationalagehigh.getSystem()));
		}
		/******************** observationdefinitionqualifiedintervalage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationdefinitionqualifiedintervalage = observationdefinitionqualifiedinterval.getAge();

		/******************** observationdefinitionqualifiedintervalagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalagelow = observationdefinitionqualifiedintervalage.getLow();

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalagelow.hasValue()) {
			o.setObsrvtnDfnQualifiedIntervalAgeLwVl(String.valueOf(observationdefinitionqualifiedintervalagelow.getValue()));
		}
		/******************** observationdefinitionqualifiedintervalagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalagelowcomparator = observationdefinitionqualifiedintervalagelow.getComparator();
		o.setObsrvtnDfnQualifiedIntervalAgeLwCmprtr(observationdefinitionqualifiedintervalagelowcomparator.toCode());

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalagelow.hasCode()) {
			o.setObsrvtnDfnQualifiedIntervalAgeLwCd(String.valueOf(observationdefinitionqualifiedintervalagelow.getCode()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalagelow.hasUnit()) {
			o.setObsrvtnDfnQualifiedIntervalAgeLwUnt(String.valueOf(observationdefinitionqualifiedintervalagelow.getUnit()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Lw_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalagelow.hasSystem()) {
			o.setObsrvtnDfnQualifiedIntervalAgeLwSys(String.valueOf(observationdefinitionqualifiedintervalagelow.getSystem()));
		}
		/******************** observationdefinitionqualifiedintervalagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationdefinitionqualifiedintervalagehigh = observationdefinitionqualifiedintervalage.getHigh();

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Vl ********************************************************************************/
		if(observationdefinitionqualifiedintervalagehigh.hasValue()) {
			o.setObsrvtnDfnQualifiedIntervalAgeHiVl(String.valueOf(observationdefinitionqualifiedintervalagehigh.getValue()));
		}
		/******************** observationdefinitionqualifiedintervalagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationdefinitionqualifiedintervalagehighcomparator = observationdefinitionqualifiedintervalagehigh.getComparator();
		o.setObsrvtnDfnQualifiedIntervalAgeHiCmprtr(observationdefinitionqualifiedintervalagehighcomparator.toCode());

		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalagehigh.hasCode()) {
			o.setObsrvtnDfnQualifiedIntervalAgeHiCd(String.valueOf(observationdefinitionqualifiedintervalagehigh.getCode()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Unt ********************************************************************************/
		if(observationdefinitionqualifiedintervalagehigh.hasUnit()) {
			o.setObsrvtnDfnQualifiedIntervalAgeHiUnt(String.valueOf(observationdefinitionqualifiedintervalagehigh.getUnit()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_Age_Hi_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalagehigh.hasSystem()) {
			o.setObsrvtnDfnQualifiedIntervalAgeHiSys(String.valueOf(observationdefinitionqualifiedintervalagehigh.getSystem()));
		}
		/******************** observationdefinitionqualifiedintervalappliesto ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionqualifiedintervalappliesto = observationdefinitionqualifiedinterval.getAppliesToFirstRep();

		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Txt ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliesto.hasText()) {
			o.setObsrvtnDfnQualifiedIntervalAppliesToTxt(String.valueOf(observationdefinitionqualifiedintervalappliesto.getText()));
		}
		/******************** observationdefinitionqualifiedintervalappliestocoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionqualifiedintervalappliestocoding = observationdefinitionqualifiedintervalappliesto.getCodingFirstRep();

		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocoding.hasVersion()) {
			o.setObsrvtnDfnQualifiedIntervalAppliesToCdgVrsn(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getVersion()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocoding.hasDisplay()) {
			o.setObsrvtnDfnQualifiedIntervalAppliesToCdgDsply(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getDisplay()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Cd ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocoding.hasCode()) {
			o.setObsrvtnDfnQualifiedIntervalAppliesToCdgCd(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getCode()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocoding.hasUserSelected()) {
			o.setObsrvtnDfnQualifiedIntervalAppliesToCdgUsrSltd(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getUserSelected()));
		}
		/******************** ObsrvtnDfn_QualifiedInterval_AppliesTo_Cdg_Sys ********************************************************************************/
		if(observationdefinitionqualifiedintervalappliestocoding.hasSystem()) {
			o.setObsrvtnDfnQualifiedIntervalAppliesToCdgSys(String.valueOf(observationdefinitionqualifiedintervalappliestocoding.getSystem()));
		}
		/******************** observationdefinitionqualifiedintervalgender ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.AdministrativeGender observationdefinitionqualifiedintervalgender = observationdefinitionqualifiedinterval.getGender();
		o.setObsrvtnDfnQualifiedIntervalGender(observationdefinitionqualifiedintervalgender.toCode());

		/******************** observationdefinitionqualifiedintervalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.ObservationDefinition.ObservationRangeCategory observationdefinitionqualifiedintervalcategory = observationdefinitionqualifiedinterval.getCategory();
		o.setObsrvtnDfnQualifiedIntervalCtgry(observationdefinitionqualifiedintervalcategory.toCode());

		/******************** ObsrvtnDfn_MultipleRsltsAllowed ********************************************************************************/
		if(observationdefinition.hasMultipleResultsAllowed()) {
			o.setObsrvtnDfnMultipleRsltsAllowed(String.valueOf(observationdefinition.getMultipleResultsAllowed()));
		}
		/******************** ObsrvtnDfn_ValidCddVlSt ********************************************************************************/
		if(observationdefinition.hasValidCodedValueSet()) {
			o.setObsrvtnDfnValidCddVlSt(String.valueOf(observationdefinition.getValidCodedValueSet()));
		}
		/******************** observationdefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitioncode = observationdefinition.getCode();

		/******************** ObsrvtnDfn_Cd_Txt ********************************************************************************/
		if(observationdefinitioncode.hasText()) {
			o.setObsrvtnDfnCdTxt(String.valueOf(observationdefinitioncode.getText()));
		}
		/******************** observationdefinitioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitioncodecoding = observationdefinitioncode.getCodingFirstRep();

		/******************** ObsrvtnDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitioncodecoding.hasVersion()) {
			o.setObsrvtnDfnCdCdgVrsn(String.valueOf(observationdefinitioncodecoding.getVersion()));
		}
		/******************** ObsrvtnDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(observationdefinitioncodecoding.hasDisplay()) {
			o.setObsrvtnDfnCdCdgDsply(String.valueOf(observationdefinitioncodecoding.getDisplay()));
		}
		/******************** ObsrvtnDfn_Cd_Cdg_Cd ********************************************************************************/
		if(observationdefinitioncodecoding.hasCode()) {
			o.setObsrvtnDfnCdCdgCd(String.valueOf(observationdefinitioncodecoding.getCode()));
		}
		/******************** ObsrvtnDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitioncodecoding.hasUserSelected()) {
			o.setObsrvtnDfnCdCdgUsrSltd(String.valueOf(observationdefinitioncodecoding.getUserSelected()));
		}
		/******************** ObsrvtnDfn_Cd_Cdg_Sys ********************************************************************************/
		if(observationdefinitioncodecoding.hasSystem()) {
			o.setObsrvtnDfnCdCdgSys(String.valueOf(observationdefinitioncodecoding.getSystem()));
		}
		/******************** ObsrvtnDfn_AbnormalCddVlSt ********************************************************************************/
		if(observationdefinition.hasAbnormalCodedValueSet()) {
			o.setObsrvtnDfnAbnormalCddVlSt(String.valueOf(observationdefinition.getAbnormalCodedValueSet()));
		}
		/******************** ObsrvtnDfn_CriticalCddVlSt ********************************************************************************/
		if(observationdefinition.hasCriticalCodedValueSet()) {
			o.setObsrvtnDfnCriticalCddVlSt(String.valueOf(observationdefinition.getCriticalCodedValueSet()));
		}
		/******************** ObsrvtnDfn_NormalCddVlSt ********************************************************************************/
		if(observationdefinition.hasNormalCodedValueSet()) {
			o.setObsrvtnDfnNormalCddVlSt(String.valueOf(observationdefinition.getNormalCodedValueSet()));
		}
		/******************** observationdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier observationdefinitionidentifier = observationdefinition.getIdentifierFirstRep();

		/******************** ObsrvtnDfn_Id_Vl ********************************************************************************/
		if(observationdefinitionidentifier.hasValue()) {
			o.setObsrvtnDfnIdVl(String.valueOf(observationdefinitionidentifier.getValue()));
		}
		/******************** observationdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitionidentifiertype = observationdefinitionidentifier.getType();

		/******************** ObsrvtnDfn_Id_Typ_Txt ********************************************************************************/
		if(observationdefinitionidentifiertype.hasText()) {
			o.setObsrvtnDfnIdTypTxt(String.valueOf(observationdefinitionidentifiertype.getText()));
		}
		/******************** observationdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitionidentifiertypecoding = observationdefinitionidentifiertype.getCodingFirstRep();

		/******************** ObsrvtnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitionidentifiertypecoding.hasVersion()) {
			o.setObsrvtnDfnIdTypCdgVrsn(String.valueOf(observationdefinitionidentifiertypecoding.getVersion()));
		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(observationdefinitionidentifiertypecoding.hasDisplay()) {
			o.setObsrvtnDfnIdTypCdgDsply(String.valueOf(observationdefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(observationdefinitionidentifiertypecoding.hasCode()) {
			o.setObsrvtnDfnIdTypCdgCd(String.valueOf(observationdefinitionidentifiertypecoding.getCode()));
		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitionidentifiertypecoding.hasUserSelected()) {
			o.setObsrvtnDfnIdTypCdgUsrSltd(String.valueOf(observationdefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** ObsrvtnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(observationdefinitionidentifiertypecoding.hasSystem()) {
			o.setObsrvtnDfnIdTypCdgSys(String.valueOf(observationdefinitionidentifiertypecoding.getSystem()));
		}
		/******************** observationdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationdefinitionidentifierperiod = observationdefinitionidentifier.getPeriod();

		/******************** ObsrvtnDfn_Id_Prd_Strt ********************************************************************************/
		if(observationdefinitionidentifierperiod.hasStart()) {
			o.setObsrvtnDfnIdPrdStrt(String.valueOf(observationdefinitionidentifierperiod.getStart()));
		}
		/******************** ObsrvtnDfn_Id_Prd_End ********************************************************************************/
		if(observationdefinitionidentifierperiod.hasEnd()) {
			o.setObsrvtnDfnIdPrdEnd(String.valueOf(observationdefinitionidentifierperiod.getEnd()));
		}
		/******************** ObsrvtnDfn_Id_Assigner ********************************************************************************/
		if(observationdefinitionidentifier.hasAssigner()) {
			o.setObsrvtnDfnIdAssigner(String.valueOf(observationdefinitionidentifier.getAssigner()));
		}
		/******************** ObsrvtnDfn_Id_Sys ********************************************************************************/
		if(observationdefinitionidentifier.hasSystem()) {
			o.setObsrvtnDfnIdSys(String.valueOf(observationdefinitionidentifier.getSystem()));
		}
		/******************** observationdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse observationdefinitionidentifieruse = observationdefinitionidentifier.getUse();
		o.setObsrvtnDfnIdUse(observationdefinitionidentifieruse.toCode());

		/******************** observationdefinitioncategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdefinitioncategory = observationdefinition.getCategoryFirstRep();

		/******************** ObsrvtnDfn_Ctgry_Txt ********************************************************************************/
		if(observationdefinitioncategory.hasText()) {
			o.setObsrvtnDfnCtgryTxt(String.valueOf(observationdefinitioncategory.getText()));
		}
		/******************** observationdefinitioncategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdefinitioncategorycoding = observationdefinitioncategory.getCodingFirstRep();

		/******************** ObsrvtnDfn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(observationdefinitioncategorycoding.hasVersion()) {
			o.setObsrvtnDfnCtgryCdgVrsn(String.valueOf(observationdefinitioncategorycoding.getVersion()));
		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(observationdefinitioncategorycoding.hasDisplay()) {
			o.setObsrvtnDfnCtgryCdgDsply(String.valueOf(observationdefinitioncategorycoding.getDisplay()));
		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Cd ********************************************************************************/
		if(observationdefinitioncategorycoding.hasCode()) {
			o.setObsrvtnDfnCtgryCdgCd(String.valueOf(observationdefinitioncategorycoding.getCode()));
		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(observationdefinitioncategorycoding.hasUserSelected()) {
			o.setObsrvtnDfnCtgryCdgUsrSltd(String.valueOf(observationdefinitioncategorycoding.getUserSelected()));
		}
		/******************** ObsrvtnDfn_Ctgry_Cdg_Sys ********************************************************************************/
		if(observationdefinitioncategorycoding.hasSystem()) {
			o.setObsrvtnDfnCtgryCdgSys(String.valueOf(observationdefinitioncategorycoding.getSystem()));
		}
		return o;
	}
}
