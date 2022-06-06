package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Observation;
public class ObservationConversion 
{
	public org.hl7.fhir.r4.model.Observation Observations(Observation o) throws ParseException
	{
		org.hl7.fhir.r4.model.Observation observation = new org.hl7.fhir.r4.model.Observation();

		/******************** id ********************************************************************************/
		observation.setId(o.getId());

		/******************** Obsrvtn_BasedOn ********************************************************************************/
		if(o.getObsrvtnBasedOn() != null) {
			observation.addBasedOn( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnBasedOn()));
		}
		/******************** observationbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationbodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setBodySite(observationbodysite);

		/******************** observationbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationbodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		observationbodysite.addCoding(observationbodysitecoding);

		/******************** Obsrvtn_BodySite_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgCd() != null) {
			observationbodysitecoding.setCode(o.getObsrvtnBodySiteCdgCd());
		}
		/******************** Obsrvtn_BodySite_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgDsply() != null) {
			observationbodysitecoding.setDisplay(o.getObsrvtnBodySiteCdgDsply());
		}
		/******************** Obsrvtn_BodySite_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgSys() != null) {
			observationbodysitecoding.setSystem(o.getObsrvtnBodySiteCdgSys());
		}
		/******************** Obsrvtn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgUsrSltd() != null) {
			observationbodysitecoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnBodySiteCdgUsrSltd()));
		}
		/******************** Obsrvtn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnBodySiteCdgVrsn() != null) {
			observationbodysitecoding.setVersion(o.getObsrvtnBodySiteCdgVrsn());
		}
		/******************** Obsrvtn_BodySite_Txt ********************************************************************************/
		if(o.getObsrvtnBodySiteTxt() != null) {
			observationbodysite.setText(o.getObsrvtnBodySiteTxt());
		}
		/******************** observationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		observation.addCategory(observationcategory);

		/******************** observationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		observationcategory.addCoding(observationcategorycoding);

		/******************** Obsrvtn_Ctgry_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCtgryCdgCd() != null) {
			observationcategorycoding.setCode(o.getObsrvtnCtgryCdgCd());
		}
		/******************** Obsrvtn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCtgryCdgDsply() != null) {
			observationcategorycoding.setDisplay(o.getObsrvtnCtgryCdgDsply());
		}
		/******************** Obsrvtn_Ctgry_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCtgryCdgSys() != null) {
			observationcategorycoding.setSystem(o.getObsrvtnCtgryCdgSys());
		}
		/******************** Obsrvtn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCtgryCdgUsrSltd() != null) {
			observationcategorycoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnCtgryCdgUsrSltd()));
		}
		/******************** Obsrvtn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCtgryCdgVrsn() != null) {
			observationcategorycoding.setVersion(o.getObsrvtnCtgryCdgVrsn());
		}
		/******************** Obsrvtn_Ctgry_Txt ********************************************************************************/
		if(o.getObsrvtnCtgryTxt() != null) {
			observationcategory.setText(o.getObsrvtnCtgryTxt());
		}
		/******************** observationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setCode(observationcode);

		/******************** observationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcodecoding =  new org.hl7.fhir.r4.model.Coding();
		observationcode.addCoding(observationcodecoding);

		/******************** Obsrvtn_Cd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCdCdgCd() != null) {
			observationcodecoding.setCode(o.getObsrvtnCdCdgCd());
		}
		/******************** Obsrvtn_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCdCdgDsply() != null) {
			observationcodecoding.setDisplay(o.getObsrvtnCdCdgDsply());
		}
		/******************** Obsrvtn_Cd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCdCdgSys() != null) {
			observationcodecoding.setSystem(o.getObsrvtnCdCdgSys());
		}
		/******************** Obsrvtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCdCdgUsrSltd() != null) {
			observationcodecoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnCdCdgUsrSltd()));
		}
		/******************** Obsrvtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCdCdgVrsn() != null) {
			observationcodecoding.setVersion(o.getObsrvtnCdCdgVrsn());
		}
		/******************** Obsrvtn_Cd_Txt ********************************************************************************/
		if(o.getObsrvtnCdTxt() != null) {
			observationcode.setText(o.getObsrvtnCdTxt());
		}
		/******************** observationcomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Observation.ObservationComponentComponent observationcomponent =  new org.hl7.fhir.r4.model.Observation.ObservationComponentComponent();
		observation.addComponent(observationcomponent);

		/******************** observationcomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationcomponent.setCode(observationcomponentcode);

		/******************** observationcomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentcodecoding =  new org.hl7.fhir.r4.model.Coding();
		observationcomponentcode.addCoding(observationcomponentcodecoding);

		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgCd() != null) {
			observationcomponentcodecoding.setCode(o.getObsrvtnCmpntCdCdgCd());
		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgDsply() != null) {
			observationcomponentcodecoding.setDisplay(o.getObsrvtnCmpntCdCdgDsply());
		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgSys() != null) {
			observationcomponentcodecoding.setSystem(o.getObsrvtnCmpntCdCdgSys());
		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgUsrSltd() != null) {
			observationcomponentcodecoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnCmpntCdCdgUsrSltd()));
		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntCdCdgVrsn() != null) {
			observationcomponentcodecoding.setVersion(o.getObsrvtnCmpntCdCdgVrsn());
		}
		/******************** Obsrvtn_Cmpnt_Cd_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntCdTxt() != null) {
			observationcomponentcode.setText(o.getObsrvtnCmpntCdTxt());
		}
		/******************** observationcomponentdataabsentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentdataabsentreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationcomponent.setDataAbsentReason(observationcomponentdataabsentreason);

		/******************** observationcomponentdataabsentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentdataabsentreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		observationcomponentdataabsentreason.addCoding(observationcomponentdataabsentreasoncoding);

		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgCd() != null) {
			observationcomponentdataabsentreasoncoding.setCode(o.getObsrvtnCmpntDataAbsentRsnCdgCd());
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgDsply() != null) {
			observationcomponentdataabsentreasoncoding.setDisplay(o.getObsrvtnCmpntDataAbsentRsnCdgDsply());
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgSys() != null) {
			observationcomponentdataabsentreasoncoding.setSystem(o.getObsrvtnCmpntDataAbsentRsnCdgSys());
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgUsrSltd() != null) {
			observationcomponentdataabsentreasoncoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnCmpntDataAbsentRsnCdgUsrSltd()));
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnCdgVrsn() != null) {
			observationcomponentdataabsentreasoncoding.setVersion(o.getObsrvtnCmpntDataAbsentRsnCdgVrsn());
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntDataAbsentRsnTxt() != null) {
			observationcomponentdataabsentreason.setText(o.getObsrvtnCmpntDataAbsentRsnTxt());
		}
		/******************** observationcomponentinterpretation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentinterpretation =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationcomponent.addInterpretation(observationcomponentinterpretation);

		/******************** observationcomponentinterpretationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentinterpretationcoding =  new org.hl7.fhir.r4.model.Coding();
		observationcomponentinterpretation.addCoding(observationcomponentinterpretationcoding);

		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgCd() != null) {
			observationcomponentinterpretationcoding.setCode(o.getObsrvtnCmpntInterpretationCdgCd());
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgDsply() != null) {
			observationcomponentinterpretationcoding.setDisplay(o.getObsrvtnCmpntInterpretationCdgDsply());
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgSys() != null) {
			observationcomponentinterpretationcoding.setSystem(o.getObsrvtnCmpntInterpretationCdgSys());
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgUsrSltd() != null) {
			observationcomponentinterpretationcoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnCmpntInterpretationCdgUsrSltd()));
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationCdgVrsn() != null) {
			observationcomponentinterpretationcoding.setVersion(o.getObsrvtnCmpntInterpretationCdgVrsn());
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntInterpretationTxt() != null) {
			observationcomponentinterpretation.setText(o.getObsrvtnCmpntInterpretationTxt());
		}
		/******************** observationcomponentreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationcomponentreferencerange =  new org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent();
		observationcomponent.addReferenceRange(observationcomponentreferencerange);

		/******************** observationcomponentreferencerangeage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationcomponentreferencerangeage =  new org.hl7.fhir.r4.model.Range();
		observationcomponentreferencerange.setAge(observationcomponentreferencerangeage);

		/******************** observationcomponentreferencerangeagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangeagehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponentreferencerangeage.setHigh(observationcomponentreferencerangeagehigh);

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeHiCd() != null) {
			observationcomponentreferencerangeagehigh.setCode(o.getObsrvtnCmpntRfrncRngAgeHiCd());
		}
		/******************** observationcomponentreferencerangeagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentreferencerangeagehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentreferencerangeagehigh.setComparator(observationcomponentreferencerangeagehighcomparator.fromCode(o.getObsrvtnCmpntRfrncRngAgeHiCmprtr()));

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeHiSys() != null) {
			observationcomponentreferencerangeagehigh.setSystem(o.getObsrvtnCmpntRfrncRngAgeHiSys());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeHiUnt() != null) {
			observationcomponentreferencerangeagehigh.setUnit(o.getObsrvtnCmpntRfrncRngAgeHiUnt());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeHiVl() != null) {
			observationcomponentreferencerangeagehigh.setValue(Double.parseDouble((o.getObsrvtnCmpntRfrncRngAgeHiVl())));
		}
		/******************** observationcomponentreferencerangeagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangeagelow =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponentreferencerangeage.setLow(observationcomponentreferencerangeagelow);

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeLwCd() != null) {
			observationcomponentreferencerangeagelow.setCode(o.getObsrvtnCmpntRfrncRngAgeLwCd());
		}
		/******************** observationcomponentreferencerangeagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentreferencerangeagelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentreferencerangeagelow.setComparator(observationcomponentreferencerangeagelowcomparator.fromCode(o.getObsrvtnCmpntRfrncRngAgeLwCmprtr()));

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeLwSys() != null) {
			observationcomponentreferencerangeagelow.setSystem(o.getObsrvtnCmpntRfrncRngAgeLwSys());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeLwUnt() != null) {
			observationcomponentreferencerangeagelow.setUnit(o.getObsrvtnCmpntRfrncRngAgeLwUnt());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAgeLwVl() != null) {
			observationcomponentreferencerangeagelow.setValue(Double.parseDouble((o.getObsrvtnCmpntRfrncRngAgeLwVl())));
		}
		/******************** observationcomponentreferencerangeappliesto ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentreferencerangeappliesto =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationcomponentreferencerange.addAppliesTo(observationcomponentreferencerangeappliesto);

		/******************** observationcomponentreferencerangeappliestocoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentreferencerangeappliestocoding =  new org.hl7.fhir.r4.model.Coding();
		observationcomponentreferencerangeappliesto.addCoding(observationcomponentreferencerangeappliestocoding);

		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgCd() != null) {
			observationcomponentreferencerangeappliestocoding.setCode(o.getObsrvtnCmpntRfrncRngAppliesToCdgCd());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgDsply() != null) {
			observationcomponentreferencerangeappliestocoding.setDisplay(o.getObsrvtnCmpntRfrncRngAppliesToCdgDsply());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgSys() != null) {
			observationcomponentreferencerangeappliestocoding.setSystem(o.getObsrvtnCmpntRfrncRngAppliesToCdgSys());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd() != null) {
			observationcomponentreferencerangeappliestocoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToCdgVrsn() != null) {
			observationcomponentreferencerangeappliestocoding.setVersion(o.getObsrvtnCmpntRfrncRngAppliesToCdgVrsn());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngAppliesToTxt() != null) {
			observationcomponentreferencerangeappliesto.setText(o.getObsrvtnCmpntRfrncRngAppliesToTxt());
		}
		/******************** observationcomponentreferencerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponentreferencerange.setHigh(observationcomponentreferencerangehigh);

		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngHiCd() != null) {
			observationcomponentreferencerangehigh.setCode(o.getObsrvtnCmpntRfrncRngHiCd());
		}
		/******************** observationcomponentreferencerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentreferencerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentreferencerangehigh.setComparator(observationcomponentreferencerangehighcomparator.fromCode(o.getObsrvtnCmpntRfrncRngHiCmprtr()));

		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngHiSys() != null) {
			observationcomponentreferencerangehigh.setSystem(o.getObsrvtnCmpntRfrncRngHiSys());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngHiUnt() != null) {
			observationcomponentreferencerangehigh.setUnit(o.getObsrvtnCmpntRfrncRngHiUnt());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngHiVl() != null) {
			observationcomponentreferencerangehigh.setValue(Double.parseDouble((o.getObsrvtnCmpntRfrncRngHiVl())));
		}
		/******************** observationcomponentreferencerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangelow =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponentreferencerange.setLow(observationcomponentreferencerangelow);

		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngLwCd() != null) {
			observationcomponentreferencerangelow.setCode(o.getObsrvtnCmpntRfrncRngLwCd());
		}
		/******************** observationcomponentreferencerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentreferencerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentreferencerangelow.setComparator(observationcomponentreferencerangelowcomparator.fromCode(o.getObsrvtnCmpntRfrncRngLwCmprtr()));

		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngLwSys() != null) {
			observationcomponentreferencerangelow.setSystem(o.getObsrvtnCmpntRfrncRngLwSys());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngLwUnt() != null) {
			observationcomponentreferencerangelow.setUnit(o.getObsrvtnCmpntRfrncRngLwUnt());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngLwVl() != null) {
			observationcomponentreferencerangelow.setValue(Double.parseDouble((o.getObsrvtnCmpntRfrncRngLwVl())));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTxt() != null) {
			observationcomponentreferencerange.setText(o.getObsrvtnCmpntRfrncRngTxt());
		}
		/******************** observationcomponentreferencerangetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentreferencerangetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationcomponentreferencerange.setType(observationcomponentreferencerangetype);

		/******************** observationcomponentreferencerangetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentreferencerangetypecoding =  new org.hl7.fhir.r4.model.Coding();
		observationcomponentreferencerangetype.addCoding(observationcomponentreferencerangetypecoding);

		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgCd() != null) {
			observationcomponentreferencerangetypecoding.setCode(o.getObsrvtnCmpntRfrncRngTypCdgCd());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgDsply() != null) {
			observationcomponentreferencerangetypecoding.setDisplay(o.getObsrvtnCmpntRfrncRngTypCdgDsply());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgSys() != null) {
			observationcomponentreferencerangetypecoding.setSystem(o.getObsrvtnCmpntRfrncRngTypCdgSys());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgUsrSltd() != null) {
			observationcomponentreferencerangetypecoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnCmpntRfrncRngTypCdgUsrSltd()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypCdgVrsn() != null) {
			observationcomponentreferencerangetypecoding.setVersion(o.getObsrvtnCmpntRfrncRngTypCdgVrsn());
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntRfrncRngTypTxt() != null) {
			observationcomponentreferencerangetype.setText(o.getObsrvtnCmpntRfrncRngTypTxt());
		}
		/******************** Obsrvtn_Cmpnt_VlBooleanTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlBooleanTyp() != null) {
			observationcomponent.setValue( new org.hl7.fhir.r4.model.BooleanType(o.getObsrvtnCmpntVlBooleanTyp()));
		}
		/******************** observationcomponentvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationcomponent.setValue(observationcomponentvaluecodeableconcept);

		/******************** observationcomponentvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		observationcomponentvaluecodeableconcept.addCoding(observationcomponentvaluecodeableconceptcoding);

		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgCd() != null) {
			observationcomponentvaluecodeableconceptcoding.setCode(o.getObsrvtnCmpntVlCdbleCncptCdgCd());
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgDsply() != null) {
			observationcomponentvaluecodeableconceptcoding.setDisplay(o.getObsrvtnCmpntVlCdbleCncptCdgDsply());
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgSys() != null) {
			observationcomponentvaluecodeableconceptcoding.setSystem(o.getObsrvtnCmpntVlCdbleCncptCdgSys());
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgUsrSltd() != null) {
			observationcomponentvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnCmpntVlCdbleCncptCdgUsrSltd()));
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptCdgVrsn() != null) {
			observationcomponentvaluecodeableconceptcoding.setVersion(o.getObsrvtnCmpntVlCdbleCncptCdgVrsn());
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Txt ********************************************************************************/
		if(o.getObsrvtnCmpntVlCdbleCncptTxt() != null) {
			observationcomponentvaluecodeableconcept.setText(o.getObsrvtnCmpntVlCdbleCncptTxt());
		}
		/******************** Obsrvtn_Cmpnt_VlDtTimeTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlDtTimeTyp() != null) {
			observationcomponent.setValue( new org.hl7.fhir.r4.model.DateTimeType(o.getObsrvtnCmpntVlDtTimeTyp()));
		}
		/******************** Obsrvtn_Cmpnt_VlIntegerTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlIntegerTyp() != null) {
			observationcomponent.setValue( new org.hl7.fhir.r4.model.IntegerType(o.getObsrvtnCmpntVlIntegerTyp()));
		}
		/******************** observationcomponentvalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationcomponentvalueperiod =  new org.hl7.fhir.r4.model.Period();
		observationcomponent.setValue(observationcomponentvalueperiod);

		/******************** Obsrvtn_Cmpnt_VlPrd_End ********************************************************************************/
		if(o.getObsrvtnCmpntVlPrdEnd() != null) {
			java.text.SimpleDateFormat Obsrvtn_Cmpnt_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_Cmpnt_VlPrd_Enddate = Obsrvtn_Cmpnt_VlPrd_Endsdf.parse(o.getObsrvtnCmpntVlPrdEnd());
			observationcomponentvalueperiod.setEnd(Obsrvtn_Cmpnt_VlPrd_Enddate);
		}
		/******************** Obsrvtn_Cmpnt_VlPrd_Strt ********************************************************************************/
		if(o.getObsrvtnCmpntVlPrdStrt() != null) {
			java.text.SimpleDateFormat Obsrvtn_Cmpnt_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_Cmpnt_VlPrd_Strtdate = Obsrvtn_Cmpnt_VlPrd_Strtsdf.parse(o.getObsrvtnCmpntVlPrdStrt());
			observationcomponentvalueperiod.setStart(Obsrvtn_Cmpnt_VlPrd_Strtdate);
		}
		/******************** observationcomponentvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponent.setValue(observationcomponentvaluequantity);

		/******************** Obsrvtn_Cmpnt_VlQnty_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlQntyCd() != null) {
			observationcomponentvaluequantity.setCode(o.getObsrvtnCmpntVlQntyCd());
		}
		/******************** observationcomponentvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentvaluequantity.setComparator(observationcomponentvaluequantitycomparator.fromCode(o.getObsrvtnCmpntVlQntyCmprtr()));

		/******************** Obsrvtn_Cmpnt_VlQnty_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlQntySys() != null) {
			observationcomponentvaluequantity.setSystem(o.getObsrvtnCmpntVlQntySys());
		}
		/******************** Obsrvtn_Cmpnt_VlQnty_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlQntyUnt() != null) {
			observationcomponentvaluequantity.setUnit(o.getObsrvtnCmpntVlQntyUnt());
		}
		/******************** Obsrvtn_Cmpnt_VlQnty_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlQntyVl() != null) {
			observationcomponentvaluequantity.setValue(Double.parseDouble((o.getObsrvtnCmpntVlQntyVl())));
		}
		/******************** observationcomponentvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationcomponentvaluerange =  new org.hl7.fhir.r4.model.Range();
		observationcomponent.setValue(observationcomponentvaluerange);

		/******************** observationcomponentvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponentvaluerange.setHigh(observationcomponentvaluerangehigh);

		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngHiCd() != null) {
			observationcomponentvaluerangehigh.setCode(o.getObsrvtnCmpntVlRngHiCd());
		}
		/******************** observationcomponentvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentvaluerangehigh.setComparator(observationcomponentvaluerangehighcomparator.fromCode(o.getObsrvtnCmpntVlRngHiCmprtr()));

		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngHiSys() != null) {
			observationcomponentvaluerangehigh.setSystem(o.getObsrvtnCmpntVlRngHiSys());
		}
		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngHiUnt() != null) {
			observationcomponentvaluerangehigh.setUnit(o.getObsrvtnCmpntVlRngHiUnt());
		}
		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngHiVl() != null) {
			observationcomponentvaluerangehigh.setValue(Double.parseDouble((o.getObsrvtnCmpntVlRngHiVl())));
		}
		/******************** observationcomponentvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponentvaluerange.setLow(observationcomponentvaluerangelow);

		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngLwCd() != null) {
			observationcomponentvaluerangelow.setCode(o.getObsrvtnCmpntVlRngLwCd());
		}
		/******************** observationcomponentvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentvaluerangelow.setComparator(observationcomponentvaluerangelowcomparator.fromCode(o.getObsrvtnCmpntVlRngLwCmprtr()));

		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngLwSys() != null) {
			observationcomponentvaluerangelow.setSystem(o.getObsrvtnCmpntVlRngLwSys());
		}
		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngLwUnt() != null) {
			observationcomponentvaluerangelow.setUnit(o.getObsrvtnCmpntVlRngLwUnt());
		}
		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlRngLwVl() != null) {
			observationcomponentvaluerangelow.setValue(Double.parseDouble((o.getObsrvtnCmpntVlRngLwVl())));
		}
		/******************** observationcomponentvalueratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio observationcomponentvalueratio =  new org.hl7.fhir.r4.model.Ratio();
		observationcomponent.setValue(observationcomponentvalueratio);

		/******************** observationcomponentvalueratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvalueratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponentvalueratio.setDenominator(observationcomponentvalueratiodenominator);

		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioDnmntrCd() != null) {
			observationcomponentvalueratiodenominator.setCode(o.getObsrvtnCmpntVlRtioDnmntrCd());
		}
		/******************** observationcomponentvalueratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentvalueratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentvalueratiodenominator.setComparator(observationcomponentvalueratiodenominatorcomparator.fromCode(o.getObsrvtnCmpntVlRtioDnmntrCmprtr()));

		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioDnmntrSys() != null) {
			observationcomponentvalueratiodenominator.setSystem(o.getObsrvtnCmpntVlRtioDnmntrSys());
		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioDnmntrUnt() != null) {
			observationcomponentvalueratiodenominator.setUnit(o.getObsrvtnCmpntVlRtioDnmntrUnt());
		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioDnmntrVl() != null) {
			observationcomponentvalueratiodenominator.setValue(Double.parseDouble((o.getObsrvtnCmpntVlRtioDnmntrVl())));
		}
		/******************** observationcomponentvaluerationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluerationumerator =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponentvalueratio.setNumerator(observationcomponentvaluerationumerator);

		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioNmrtrCd() != null) {
			observationcomponentvaluerationumerator.setCode(o.getObsrvtnCmpntVlRtioNmrtrCd());
		}
		/******************** observationcomponentvaluerationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentvaluerationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentvaluerationumerator.setComparator(observationcomponentvaluerationumeratorcomparator.fromCode(o.getObsrvtnCmpntVlRtioNmrtrCmprtr()));

		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioNmrtrSys() != null) {
			observationcomponentvaluerationumerator.setSystem(o.getObsrvtnCmpntVlRtioNmrtrSys());
		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioNmrtrUnt() != null) {
			observationcomponentvaluerationumerator.setUnit(o.getObsrvtnCmpntVlRtioNmrtrUnt());
		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlRtioNmrtrVl() != null) {
			observationcomponentvaluerationumerator.setValue(Double.parseDouble((o.getObsrvtnCmpntVlRtioNmrtrVl())));
		}
		/******************** observationcomponentvaluesampleddata ********************************************************************************/
		org.hl7.fhir.r4.model.SampledData observationcomponentvaluesampleddata =  new org.hl7.fhir.r4.model.SampledData();
		observationcomponent.setValue(observationcomponentvaluesampleddata);

		/******************** Obsrvtn_Cmpnt_VlSampledData_Data ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataData() != null) {
			observationcomponentvaluesampleddata.setData(o.getObsrvtnCmpntVlSampledDataData());
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Dimensions ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataDimensions() != null) {
			observationcomponentvaluesampleddata.setDimensions(Integer.parseInt(o.getObsrvtnCmpntVlSampledDataDimensions()));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Factor ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataFactor() != null) {
			observationcomponentvaluesampleddata.setFactor(Double.parseDouble((o.getObsrvtnCmpntVlSampledDataFactor())));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_LwerLmt ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataLwerLmt() != null) {
			observationcomponentvaluesampleddata.setLowerLimit(Double.parseDouble((o.getObsrvtnCmpntVlSampledDataLwerLmt())));
		}
		/******************** observationcomponentvaluesampleddataorigin ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluesampleddataorigin =  new org.hl7.fhir.r4.model.Quantity();
		observationcomponentvaluesampleddata.setOrigin(observationcomponentvaluesampleddataorigin);

		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Cd ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataOriginCd() != null) {
			observationcomponentvaluesampleddataorigin.setCode(o.getObsrvtnCmpntVlSampledDataOriginCd());
		}
		/******************** observationcomponentvaluesampleddataorigincomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationcomponentvaluesampleddataorigincomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationcomponentvaluesampleddataorigin.setComparator(observationcomponentvaluesampleddataorigincomparator.fromCode(o.getObsrvtnCmpntVlSampledDataOriginCmprtr()));

		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Sys ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataOriginSys() != null) {
			observationcomponentvaluesampleddataorigin.setSystem(o.getObsrvtnCmpntVlSampledDataOriginSys());
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Unt ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataOriginUnt() != null) {
			observationcomponentvaluesampleddataorigin.setUnit(o.getObsrvtnCmpntVlSampledDataOriginUnt());
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Vl ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataOriginVl() != null) {
			observationcomponentvaluesampleddataorigin.setValue(Double.parseDouble((o.getObsrvtnCmpntVlSampledDataOriginVl())));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Prd ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataPrd() != null) {
			observationcomponentvaluesampleddata.setPeriod(Double.parseDouble((o.getObsrvtnCmpntVlSampledDataPrd())));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_UpperLmt ********************************************************************************/
		if(o.getObsrvtnCmpntVlSampledDataUpperLmt() != null) {
			observationcomponentvaluesampleddata.setUpperLimit(Double.parseDouble((o.getObsrvtnCmpntVlSampledDataUpperLmt())));
		}
		/******************** Obsrvtn_Cmpnt_VlStrgTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlStrgTyp() != null) {
			observationcomponent.setValue( new org.hl7.fhir.r4.model.StringType(o.getObsrvtnCmpntVlStrgTyp()));
		}
		/******************** Obsrvtn_Cmpnt_VlTimeTyp ********************************************************************************/
		if(o.getObsrvtnCmpntVlTimeTyp() != null) {
			observationcomponent.setValue( new org.hl7.fhir.r4.model.TimeType(o.getObsrvtnCmpntVlTimeTyp()));
		}
		/******************** observationdataabsentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdataabsentreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setDataAbsentReason(observationdataabsentreason);

		/******************** observationdataabsentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdataabsentreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		observationdataabsentreason.addCoding(observationdataabsentreasoncoding);

		/******************** Obsrvtn_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgCd() != null) {
			observationdataabsentreasoncoding.setCode(o.getObsrvtnDataAbsentRsnCdgCd());
		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgDsply() != null) {
			observationdataabsentreasoncoding.setDisplay(o.getObsrvtnDataAbsentRsnCdgDsply());
		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgSys() != null) {
			observationdataabsentreasoncoding.setSystem(o.getObsrvtnDataAbsentRsnCdgSys());
		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgUsrSltd() != null) {
			observationdataabsentreasoncoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnDataAbsentRsnCdgUsrSltd()));
		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnCdgVrsn() != null) {
			observationdataabsentreasoncoding.setVersion(o.getObsrvtnDataAbsentRsnCdgVrsn());
		}
		/******************** Obsrvtn_DataAbsentRsn_Txt ********************************************************************************/
		if(o.getObsrvtnDataAbsentRsnTxt() != null) {
			observationdataabsentreason.setText(o.getObsrvtnDataAbsentRsnTxt());
		}
		/******************** Obsrvtn_DerivedFrom ********************************************************************************/
		if(o.getObsrvtnDerivedFrom() != null) {
			observation.addDerivedFrom( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDerivedFrom()));
		}
		/******************** Obsrvtn_Dvc ********************************************************************************/
		if(o.getObsrvtnDvc() != null) {
			observation.setDevice( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnDvc()));
		}
		/******************** Obsrvtn_EfctiveDtTimeTyp ********************************************************************************/
		if(o.getObsrvtnEfctiveDtTimeTyp() != null) {
			observation.setEffective( new org.hl7.fhir.r4.model.DateTimeType(o.getObsrvtnEfctiveDtTimeTyp()));
		}
		/******************** Obsrvtn_EfctiveInstantTyp ********************************************************************************/
		if(o.getObsrvtnEfctiveInstantTyp() != null) {
			observation.setEffective( new org.hl7.fhir.r4.model.InstantType(o.getObsrvtnEfctiveInstantTyp()));
		}
		/******************** observationeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationeffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		observation.setEffective(observationeffectiveperiod);

		/******************** Obsrvtn_EfctivePrd_End ********************************************************************************/
		if(o.getObsrvtnEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat Obsrvtn_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_EfctivePrd_Enddate = Obsrvtn_EfctivePrd_Endsdf.parse(o.getObsrvtnEfctivePrdEnd());
			observationeffectiveperiod.setEnd(Obsrvtn_EfctivePrd_Enddate);
		}
		/******************** Obsrvtn_EfctivePrd_Strt ********************************************************************************/
		if(o.getObsrvtnEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat Obsrvtn_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_EfctivePrd_Strtdate = Obsrvtn_EfctivePrd_Strtsdf.parse(o.getObsrvtnEfctivePrdStrt());
			observationeffectiveperiod.setStart(Obsrvtn_EfctivePrd_Strtdate);
		}
		/******************** observationeffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing observationeffectivetiming =  new org.hl7.fhir.r4.model.Timing();
		observation.setEffective(observationeffectivetiming);

		/******************** observationeffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationeffectivetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationeffectivetiming.setCode(observationeffectivetimingcode);

		/******************** observationeffectivetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationeffectivetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		observationeffectivetimingcode.addCoding(observationeffectivetimingcodecoding);

		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgCd() != null) {
			observationeffectivetimingcodecoding.setCode(o.getObsrvtnEfctiveTmgCdCdgCd());
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgDsply() != null) {
			observationeffectivetimingcodecoding.setDisplay(o.getObsrvtnEfctiveTmgCdCdgDsply());
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgSys() != null) {
			observationeffectivetimingcodecoding.setSystem(o.getObsrvtnEfctiveTmgCdCdgSys());
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgUsrSltd() != null) {
			observationeffectivetimingcodecoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnEfctiveTmgCdCdgUsrSltd()));
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdCdgVrsn() != null) {
			observationeffectivetimingcodecoding.setVersion(o.getObsrvtnEfctiveTmgCdCdgVrsn());
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Txt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgCdTxt() != null) {
			observationeffectivetimingcode.setText(o.getObsrvtnEfctiveTmgCdTxt());
		}
		/******************** Obsrvtn_EfctiveTmg_Evnt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgEvnt() != null) {
			java.text.SimpleDateFormat Obsrvtn_EfctiveTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_EfctiveTmg_Evntdate = Obsrvtn_EfctiveTmg_Evntsdf.parse(o.getObsrvtnEfctiveTmgEvnt());
			observationeffectivetiming.addEvent(Obsrvtn_EfctiveTmg_Evntdate);
		}
		/******************** observationeffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent observationeffectivetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		observationeffectivetiming.setRepeat(observationeffectivetimingrepeat);

		/******************** observationeffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration observationeffectivetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		observationeffectivetimingrepeat.setBounds(observationeffectivetimingrepeatboundsduration);

		/******************** observationeffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationeffectivetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		observationeffectivetimingrepeat.setBounds(observationeffectivetimingrepeatboundsperiod);

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Enddate = Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Endsdf.parse(o.getObsrvtnEfctiveTmgRptBndsPrdEnd());
			observationeffectivetimingrepeatboundsperiod.setEnd(Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strtdate = Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strtsdf.parse(o.getObsrvtnEfctiveTmgRptBndsPrdStrt());
			observationeffectivetimingrepeatboundsperiod.setStart(Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** observationeffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationeffectivetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		observationeffectivetimingrepeat.setBounds(observationeffectivetimingrepeatboundsrange);

		/******************** observationeffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationeffectivetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationeffectivetimingrepeatboundsrange.setHigh(observationeffectivetimingrepeatboundsrangehigh);

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngHiCd() != null) {
			observationeffectivetimingrepeatboundsrangehigh.setCode(o.getObsrvtnEfctiveTmgRptBndsRngHiCd());
		}
		/******************** observationeffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationeffectivetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationeffectivetimingrepeatboundsrangehigh.setComparator(observationeffectivetimingrepeatboundsrangehighcomparator.fromCode(o.getObsrvtnEfctiveTmgRptBndsRngHiCmprtr()));

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngHiSys() != null) {
			observationeffectivetimingrepeatboundsrangehigh.setSystem(o.getObsrvtnEfctiveTmgRptBndsRngHiSys());
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngHiUnt() != null) {
			observationeffectivetimingrepeatboundsrangehigh.setUnit(o.getObsrvtnEfctiveTmgRptBndsRngHiUnt());
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngHiVl() != null) {
			observationeffectivetimingrepeatboundsrangehigh.setValue(Double.parseDouble((o.getObsrvtnEfctiveTmgRptBndsRngHiVl())));
		}
		/******************** observationeffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationeffectivetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		observationeffectivetimingrepeatboundsrange.setLow(observationeffectivetimingrepeatboundsrangelow);

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngLwCd() != null) {
			observationeffectivetimingrepeatboundsrangelow.setCode(o.getObsrvtnEfctiveTmgRptBndsRngLwCd());
		}
		/******************** observationeffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationeffectivetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationeffectivetimingrepeatboundsrangelow.setComparator(observationeffectivetimingrepeatboundsrangelowcomparator.fromCode(o.getObsrvtnEfctiveTmgRptBndsRngLwCmprtr()));

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngLwSys() != null) {
			observationeffectivetimingrepeatboundsrangelow.setSystem(o.getObsrvtnEfctiveTmgRptBndsRngLwSys());
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngLwUnt() != null) {
			observationeffectivetimingrepeatboundsrangelow.setUnit(o.getObsrvtnEfctiveTmgRptBndsRngLwUnt());
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptBndsRngLwVl() != null) {
			observationeffectivetimingrepeatboundsrangelow.setValue(Double.parseDouble((o.getObsrvtnEfctiveTmgRptBndsRngLwVl())));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptCnt() != null) {
			observationeffectivetimingrepeat.setCount(Integer.parseInt(o.getObsrvtnEfctiveTmgRptCnt()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptCntMx() != null) {
			observationeffectivetimingrepeat.setCountMax(Integer.parseInt(o.getObsrvtnEfctiveTmgRptCntMx()));
		}
		/******************** observationeffectivetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory observationeffectivetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		observationeffectivetimingrepeat.addDayOfWeek(observationeffectivetimingrepeatdayofweek.fromCode(o.getObsrvtnEfctiveTmgRptDayOfWeek()));

		/******************** Obsrvtn_EfctiveTmg_Rpt_Duration ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptDuration() != null) {
			observationeffectivetimingrepeat.setDuration(Double.parseDouble((o.getObsrvtnEfctiveTmgRptDuration())));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptDurationMx() != null) {
			observationeffectivetimingrepeat.setDurationMax(Double.parseDouble((o.getObsrvtnEfctiveTmgRptDurationMx())));
		}
		/******************** observationeffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory observationeffectivetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		observationeffectivetimingrepeat.setDurationUnit(observationeffectivetimingrepeatdurationunit.fromCode(o.getObsrvtnEfctiveTmgRptDurationUnt()));

		/******************** Obsrvtn_EfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptFrqncy() != null) {
			observationeffectivetimingrepeat.setFrequency(Integer.parseInt(o.getObsrvtnEfctiveTmgRptFrqncy()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptFrqncyMx() != null) {
			observationeffectivetimingrepeat.setFrequencyMax(Integer.parseInt(o.getObsrvtnEfctiveTmgRptFrqncyMx()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Off ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptOff() != null) {
			observationeffectivetimingrepeat.setOffset(Integer.parseInt(o.getObsrvtnEfctiveTmgRptOff()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Prd ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptPrd() != null) {
			observationeffectivetimingrepeat.setPeriod(Double.parseDouble((o.getObsrvtnEfctiveTmgRptPrd())));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptPrdMx() != null) {
			observationeffectivetimingrepeat.setPeriodMax(Double.parseDouble((o.getObsrvtnEfctiveTmgRptPrdMx())));
		}
		/******************** observationeffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory observationeffectivetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		observationeffectivetimingrepeat.setPeriodUnit(observationeffectivetimingrepeatperiodunit.fromCode(o.getObsrvtnEfctiveTmgRptPrdUnt()));

		/******************** Obsrvtn_EfctiveTmg_Rpt_TimeOfDay ********************************************************************************/
		if(o.getObsrvtnEfctiveTmgRptTimeOfDay() != null) {
			observationeffectivetimingrepeat.addTimeOfDay(o.getObsrvtnEfctiveTmgRptTimeOfDay());
		}
		/******************** observationeffectivetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory observationeffectivetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		observationeffectivetimingrepeat.addWhen(observationeffectivetimingrepeatwhen.fromCode(o.getObsrvtnEfctiveTmgRptWhen()));

		/******************** Obsrvtn_Enc ********************************************************************************/
		if(o.getObsrvtnEnc() != null) {
			observation.setEncounter( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnEnc()));
		}
		/******************** Obsrvtn_Focus ********************************************************************************/
		if(o.getObsrvtnFocus() != null) {
			observation.addFocus( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnFocus()));
		}
		/******************** Obsrvtn_HasMmbr ********************************************************************************/
		if(o.getObsrvtnHasMmbr() != null) {
			observation.addHasMember( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnHasMmbr()));
		}
		/******************** observationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier observationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		observation.addIdentifier(observationidentifier);

		/******************** Obsrvtn_Id_Assigner ********************************************************************************/
		if(o.getObsrvtnIdAssigner() != null) {
			observationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnIdAssigner()));
		}
		/******************** observationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		observationidentifier.setPeriod(observationidentifierperiod);

		/******************** Obsrvtn_Id_Prd_End ********************************************************************************/
		if(o.getObsrvtnIdPrdEnd() != null) {
			java.text.SimpleDateFormat Obsrvtn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_Id_Prd_Enddate = Obsrvtn_Id_Prd_Endsdf.parse(o.getObsrvtnIdPrdEnd());
			observationidentifierperiod.setEnd(Obsrvtn_Id_Prd_Enddate);
		}
		/******************** Obsrvtn_Id_Prd_Strt ********************************************************************************/
		if(o.getObsrvtnIdPrdStrt() != null) {
			java.text.SimpleDateFormat Obsrvtn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_Id_Prd_Strtdate = Obsrvtn_Id_Prd_Strtsdf.parse(o.getObsrvtnIdPrdStrt());
			observationidentifierperiod.setStart(Obsrvtn_Id_Prd_Strtdate);
		}
		/******************** Obsrvtn_Id_Sys ********************************************************************************/
		if(o.getObsrvtnIdSys() != null) {
			observationidentifier.setSystem(o.getObsrvtnIdSys());
		}
		/******************** observationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationidentifier.setType(observationidentifiertype);

		/******************** observationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		observationidentifiertype.addCoding(observationidentifiertypecoding);

		/******************** Obsrvtn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnIdTypCdgCd() != null) {
			observationidentifiertypecoding.setCode(o.getObsrvtnIdTypCdgCd());
		}
		/******************** Obsrvtn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnIdTypCdgDsply() != null) {
			observationidentifiertypecoding.setDisplay(o.getObsrvtnIdTypCdgDsply());
		}
		/******************** Obsrvtn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnIdTypCdgSys() != null) {
			observationidentifiertypecoding.setSystem(o.getObsrvtnIdTypCdgSys());
		}
		/******************** Obsrvtn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnIdTypCdgUsrSltd() != null) {
			observationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnIdTypCdgUsrSltd()));
		}
		/******************** Obsrvtn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnIdTypCdgVrsn() != null) {
			observationidentifiertypecoding.setVersion(o.getObsrvtnIdTypCdgVrsn());
		}
		/******************** Obsrvtn_Id_Typ_Txt ********************************************************************************/
		if(o.getObsrvtnIdTypTxt() != null) {
			observationidentifiertype.setText(o.getObsrvtnIdTypTxt());
		}
		/******************** observationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory observationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		observationidentifier.setUse(observationidentifieruse.fromCode(o.getObsrvtnIdUse()));

		/******************** Obsrvtn_Id_Vl ********************************************************************************/
		if(o.getObsrvtnIdVl() != null) {
			observationidentifier.setValue(o.getObsrvtnIdVl());
		}
		/******************** observationinterpretation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationinterpretation =  new org.hl7.fhir.r4.model.CodeableConcept();
		observation.addInterpretation(observationinterpretation);

		/******************** observationinterpretationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationinterpretationcoding =  new org.hl7.fhir.r4.model.Coding();
		observationinterpretation.addCoding(observationinterpretationcoding);

		/******************** Obsrvtn_Interpretation_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgCd() != null) {
			observationinterpretationcoding.setCode(o.getObsrvtnInterpretationCdgCd());
		}
		/******************** Obsrvtn_Interpretation_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgDsply() != null) {
			observationinterpretationcoding.setDisplay(o.getObsrvtnInterpretationCdgDsply());
		}
		/******************** Obsrvtn_Interpretation_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgSys() != null) {
			observationinterpretationcoding.setSystem(o.getObsrvtnInterpretationCdgSys());
		}
		/******************** Obsrvtn_Interpretation_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgUsrSltd() != null) {
			observationinterpretationcoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnInterpretationCdgUsrSltd()));
		}
		/******************** Obsrvtn_Interpretation_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnInterpretationCdgVrsn() != null) {
			observationinterpretationcoding.setVersion(o.getObsrvtnInterpretationCdgVrsn());
		}
		/******************** Obsrvtn_Interpretation_Txt ********************************************************************************/
		if(o.getObsrvtnInterpretationTxt() != null) {
			observationinterpretation.setText(o.getObsrvtnInterpretationTxt());
		}
		/******************** Obsrvtn_Issued ********************************************************************************/
		if(o.getObsrvtnIssued() != null) {
			java.text.SimpleDateFormat Obsrvtn_Issuedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_Issueddate = Obsrvtn_Issuedsdf.parse(o.getObsrvtnIssued());
			observation.setIssued(Obsrvtn_Issueddate);
		}
		/******************** observationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationmethod =  new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setMethod(observationmethod);

		/******************** observationmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationmethodcoding =  new org.hl7.fhir.r4.model.Coding();
		observationmethod.addCoding(observationmethodcoding);

		/******************** Obsrvtn_Mthd_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnMthdCdgCd() != null) {
			observationmethodcoding.setCode(o.getObsrvtnMthdCdgCd());
		}
		/******************** Obsrvtn_Mthd_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnMthdCdgDsply() != null) {
			observationmethodcoding.setDisplay(o.getObsrvtnMthdCdgDsply());
		}
		/******************** Obsrvtn_Mthd_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnMthdCdgSys() != null) {
			observationmethodcoding.setSystem(o.getObsrvtnMthdCdgSys());
		}
		/******************** Obsrvtn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnMthdCdgUsrSltd() != null) {
			observationmethodcoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnMthdCdgUsrSltd()));
		}
		/******************** Obsrvtn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnMthdCdgVrsn() != null) {
			observationmethodcoding.setVersion(o.getObsrvtnMthdCdgVrsn());
		}
		/******************** Obsrvtn_Mthd_Txt ********************************************************************************/
		if(o.getObsrvtnMthdTxt() != null) {
			observationmethod.setText(o.getObsrvtnMthdTxt());
		}
		/******************** observationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation observationnote =  new org.hl7.fhir.r4.model.Annotation();
		observation.addNote(observationnote);

		/******************** Obsrvtn_Nt_AthrRfrnc ********************************************************************************/
		if(o.getObsrvtnNtAthrRfrnc() != null) {
			observationnote.setAuthor( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnNtAthrRfrnc()));
		}
		/******************** Obsrvtn_Nt_AthrStrgTyp ********************************************************************************/
		if(o.getObsrvtnNtAthrStrgTyp() != null) {
			observationnote.setAuthor( new org.hl7.fhir.r4.model.StringType(o.getObsrvtnNtAthrStrgTyp()));
		}
		/******************** Obsrvtn_Nt_Txt ********************************************************************************/
		if(o.getObsrvtnNtTxt() != null) {
			observationnote.setText(o.getObsrvtnNtTxt());
		}
		/******************** Obsrvtn_Nt_Time ********************************************************************************/
		if(o.getObsrvtnNtTime() != null) {
			java.text.SimpleDateFormat Obsrvtn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_Nt_Timedate = Obsrvtn_Nt_Timesdf.parse(o.getObsrvtnNtTime());
			observationnote.setTime(Obsrvtn_Nt_Timedate);
		}
		/******************** Obsrvtn_PartOf ********************************************************************************/
		if(o.getObsrvtnPartOf() != null) {
			observation.addPartOf( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnPartOf()));
		}
		/******************** Obsrvtn_Prfrmr ********************************************************************************/
		if(o.getObsrvtnPrfrmr() != null) {
			observation.addPerformer( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnPrfrmr()));
		}
		/******************** observationreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationreferencerange =  new org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent();
		observation.addReferenceRange(observationreferencerange);

		/******************** observationreferencerangeage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationreferencerangeage =  new org.hl7.fhir.r4.model.Range();
		observationreferencerange.setAge(observationreferencerangeage);

		/******************** observationreferencerangeagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangeagehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationreferencerangeage.setHigh(observationreferencerangeagehigh);

		/******************** Obsrvtn_RfrncRng_Age_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeHiCd() != null) {
			observationreferencerangeagehigh.setCode(o.getObsrvtnRfrncRngAgeHiCd());
		}
		/******************** observationreferencerangeagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationreferencerangeagehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationreferencerangeagehigh.setComparator(observationreferencerangeagehighcomparator.fromCode(o.getObsrvtnRfrncRngAgeHiCmprtr()));

		/******************** Obsrvtn_RfrncRng_Age_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeHiSys() != null) {
			observationreferencerangeagehigh.setSystem(o.getObsrvtnRfrncRngAgeHiSys());
		}
		/******************** Obsrvtn_RfrncRng_Age_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeHiUnt() != null) {
			observationreferencerangeagehigh.setUnit(o.getObsrvtnRfrncRngAgeHiUnt());
		}
		/******************** Obsrvtn_RfrncRng_Age_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeHiVl() != null) {
			observationreferencerangeagehigh.setValue(Double.parseDouble((o.getObsrvtnRfrncRngAgeHiVl())));
		}
		/******************** observationreferencerangeagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangeagelow =  new org.hl7.fhir.r4.model.Quantity();
		observationreferencerangeage.setLow(observationreferencerangeagelow);

		/******************** Obsrvtn_RfrncRng_Age_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeLwCd() != null) {
			observationreferencerangeagelow.setCode(o.getObsrvtnRfrncRngAgeLwCd());
		}
		/******************** observationreferencerangeagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationreferencerangeagelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationreferencerangeagelow.setComparator(observationreferencerangeagelowcomparator.fromCode(o.getObsrvtnRfrncRngAgeLwCmprtr()));

		/******************** Obsrvtn_RfrncRng_Age_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeLwSys() != null) {
			observationreferencerangeagelow.setSystem(o.getObsrvtnRfrncRngAgeLwSys());
		}
		/******************** Obsrvtn_RfrncRng_Age_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeLwUnt() != null) {
			observationreferencerangeagelow.setUnit(o.getObsrvtnRfrncRngAgeLwUnt());
		}
		/******************** Obsrvtn_RfrncRng_Age_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnRfrncRngAgeLwVl() != null) {
			observationreferencerangeagelow.setValue(Double.parseDouble((o.getObsrvtnRfrncRngAgeLwVl())));
		}
		/******************** observationreferencerangeappliesto ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationreferencerangeappliesto =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationreferencerange.addAppliesTo(observationreferencerangeappliesto);

		/******************** observationreferencerangeappliestocoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationreferencerangeappliestocoding =  new org.hl7.fhir.r4.model.Coding();
		observationreferencerangeappliesto.addCoding(observationreferencerangeappliestocoding);

		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgCd() != null) {
			observationreferencerangeappliestocoding.setCode(o.getObsrvtnRfrncRngAppliesToCdgCd());
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgDsply() != null) {
			observationreferencerangeappliestocoding.setDisplay(o.getObsrvtnRfrncRngAppliesToCdgDsply());
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgSys() != null) {
			observationreferencerangeappliestocoding.setSystem(o.getObsrvtnRfrncRngAppliesToCdgSys());
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgUsrSltd() != null) {
			observationreferencerangeappliestocoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnRfrncRngAppliesToCdgUsrSltd()));
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToCdgVrsn() != null) {
			observationreferencerangeappliestocoding.setVersion(o.getObsrvtnRfrncRngAppliesToCdgVrsn());
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Txt ********************************************************************************/
		if(o.getObsrvtnRfrncRngAppliesToTxt() != null) {
			observationreferencerangeappliesto.setText(o.getObsrvtnRfrncRngAppliesToTxt());
		}
		/******************** observationreferencerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationreferencerange.setHigh(observationreferencerangehigh);

		/******************** Obsrvtn_RfrncRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngHiCd() != null) {
			observationreferencerangehigh.setCode(o.getObsrvtnRfrncRngHiCd());
		}
		/******************** observationreferencerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationreferencerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationreferencerangehigh.setComparator(observationreferencerangehighcomparator.fromCode(o.getObsrvtnRfrncRngHiCmprtr()));

		/******************** Obsrvtn_RfrncRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngHiSys() != null) {
			observationreferencerangehigh.setSystem(o.getObsrvtnRfrncRngHiSys());
		}
		/******************** Obsrvtn_RfrncRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnRfrncRngHiUnt() != null) {
			observationreferencerangehigh.setUnit(o.getObsrvtnRfrncRngHiUnt());
		}
		/******************** Obsrvtn_RfrncRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnRfrncRngHiVl() != null) {
			observationreferencerangehigh.setValue(Double.parseDouble((o.getObsrvtnRfrncRngHiVl())));
		}
		/******************** observationreferencerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangelow =  new org.hl7.fhir.r4.model.Quantity();
		observationreferencerange.setLow(observationreferencerangelow);

		/******************** Obsrvtn_RfrncRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngLwCd() != null) {
			observationreferencerangelow.setCode(o.getObsrvtnRfrncRngLwCd());
		}
		/******************** observationreferencerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationreferencerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationreferencerangelow.setComparator(observationreferencerangelowcomparator.fromCode(o.getObsrvtnRfrncRngLwCmprtr()));

		/******************** Obsrvtn_RfrncRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngLwSys() != null) {
			observationreferencerangelow.setSystem(o.getObsrvtnRfrncRngLwSys());
		}
		/******************** Obsrvtn_RfrncRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnRfrncRngLwUnt() != null) {
			observationreferencerangelow.setUnit(o.getObsrvtnRfrncRngLwUnt());
		}
		/******************** Obsrvtn_RfrncRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnRfrncRngLwVl() != null) {
			observationreferencerangelow.setValue(Double.parseDouble((o.getObsrvtnRfrncRngLwVl())));
		}
		/******************** Obsrvtn_RfrncRng_Txt ********************************************************************************/
		if(o.getObsrvtnRfrncRngTxt() != null) {
			observationreferencerange.setText(o.getObsrvtnRfrncRngTxt());
		}
		/******************** observationreferencerangetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationreferencerangetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		observationreferencerange.setType(observationreferencerangetype);

		/******************** observationreferencerangetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationreferencerangetypecoding =  new org.hl7.fhir.r4.model.Coding();
		observationreferencerangetype.addCoding(observationreferencerangetypecoding);

		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgCd() != null) {
			observationreferencerangetypecoding.setCode(o.getObsrvtnRfrncRngTypCdgCd());
		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgDsply() != null) {
			observationreferencerangetypecoding.setDisplay(o.getObsrvtnRfrncRngTypCdgDsply());
		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgSys() != null) {
			observationreferencerangetypecoding.setSystem(o.getObsrvtnRfrncRngTypCdgSys());
		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgUsrSltd() != null) {
			observationreferencerangetypecoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnRfrncRngTypCdgUsrSltd()));
		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypCdgVrsn() != null) {
			observationreferencerangetypecoding.setVersion(o.getObsrvtnRfrncRngTypCdgVrsn());
		}
		/******************** Obsrvtn_RfrncRng_Typ_Txt ********************************************************************************/
		if(o.getObsrvtnRfrncRngTypTxt() != null) {
			observationreferencerangetype.setText(o.getObsrvtnRfrncRngTypTxt());
		}
		/******************** Obsrvtn_Spcmn ********************************************************************************/
		if(o.getObsrvtnSpcmn() != null) {
			observation.setSpecimen( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnSpcmn()));
		}
		/******************** observationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Observation.ObservationStatusEnumFactory observationstatus =  new org.hl7.fhir.r4.model.Observation.ObservationStatusEnumFactory();
		observation.setStatus(observationstatus.fromCode(o.getObsrvtnSts()));

		/******************** Obsrvtn_Sbjct ********************************************************************************/
		if(o.getObsrvtnSbjct() != null) {
			observation.setSubject( new org.hl7.fhir.r4.model.Reference(o.getObsrvtnSbjct()));
		}
		/******************** Obsrvtn_VlBooleanTyp ********************************************************************************/
		if(o.getObsrvtnVlBooleanTyp() != null) {
			observation.setValue( new org.hl7.fhir.r4.model.BooleanType(o.getObsrvtnVlBooleanTyp()));
		}
		/******************** observationvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		observation.setValue(observationvaluecodeableconcept);

		/******************** observationvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		observationvaluecodeableconcept.addCoding(observationvaluecodeableconceptcoding);

		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgCd() != null) {
			observationvaluecodeableconceptcoding.setCode(o.getObsrvtnVlCdbleCncptCdgCd());
		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgDsply() != null) {
			observationvaluecodeableconceptcoding.setDisplay(o.getObsrvtnVlCdbleCncptCdgDsply());
		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgSys() != null) {
			observationvaluecodeableconceptcoding.setSystem(o.getObsrvtnVlCdbleCncptCdgSys());
		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgUsrSltd() != null) {
			observationvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(o.getObsrvtnVlCdbleCncptCdgUsrSltd()));
		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptCdgVrsn() != null) {
			observationvaluecodeableconceptcoding.setVersion(o.getObsrvtnVlCdbleCncptCdgVrsn());
		}
		/******************** Obsrvtn_VlCdbleCncpt_Txt ********************************************************************************/
		if(o.getObsrvtnVlCdbleCncptTxt() != null) {
			observationvaluecodeableconcept.setText(o.getObsrvtnVlCdbleCncptTxt());
		}
		/******************** Obsrvtn_VlDtTimeTyp ********************************************************************************/
		if(o.getObsrvtnVlDtTimeTyp() != null) {
			observation.setValue( new org.hl7.fhir.r4.model.DateTimeType(o.getObsrvtnVlDtTimeTyp()));
		}
		/******************** Obsrvtn_VlIntegerTyp ********************************************************************************/
		if(o.getObsrvtnVlIntegerTyp() != null) {
			observation.setValue( new org.hl7.fhir.r4.model.IntegerType(o.getObsrvtnVlIntegerTyp()));
		}
		/******************** observationvalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationvalueperiod =  new org.hl7.fhir.r4.model.Period();
		observation.setValue(observationvalueperiod);

		/******************** Obsrvtn_VlPrd_End ********************************************************************************/
		if(o.getObsrvtnVlPrdEnd() != null) {
			java.text.SimpleDateFormat Obsrvtn_VlPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_VlPrd_Enddate = Obsrvtn_VlPrd_Endsdf.parse(o.getObsrvtnVlPrdEnd());
			observationvalueperiod.setEnd(Obsrvtn_VlPrd_Enddate);
		}
		/******************** Obsrvtn_VlPrd_Strt ********************************************************************************/
		if(o.getObsrvtnVlPrdStrt() != null) {
			java.text.SimpleDateFormat Obsrvtn_VlPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Obsrvtn_VlPrd_Strtdate = Obsrvtn_VlPrd_Strtsdf.parse(o.getObsrvtnVlPrdStrt());
			observationvalueperiod.setStart(Obsrvtn_VlPrd_Strtdate);
		}
		/******************** observationvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		observation.setValue(observationvaluequantity);

		/******************** Obsrvtn_VlQnty_Cd ********************************************************************************/
		if(o.getObsrvtnVlQntyCd() != null) {
			observationvaluequantity.setCode(o.getObsrvtnVlQntyCd());
		}
		/******************** observationvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationvaluequantity.setComparator(observationvaluequantitycomparator.fromCode(o.getObsrvtnVlQntyCmprtr()));

		/******************** Obsrvtn_VlQnty_Sys ********************************************************************************/
		if(o.getObsrvtnVlQntySys() != null) {
			observationvaluequantity.setSystem(o.getObsrvtnVlQntySys());
		}
		/******************** Obsrvtn_VlQnty_Unt ********************************************************************************/
		if(o.getObsrvtnVlQntyUnt() != null) {
			observationvaluequantity.setUnit(o.getObsrvtnVlQntyUnt());
		}
		/******************** Obsrvtn_VlQnty_Vl ********************************************************************************/
		if(o.getObsrvtnVlQntyVl() != null) {
			observationvaluequantity.setValue(Double.parseDouble((o.getObsrvtnVlQntyVl())));
		}
		/******************** observationvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationvaluerange =  new org.hl7.fhir.r4.model.Range();
		observation.setValue(observationvaluerange);

		/******************** observationvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		observationvaluerange.setHigh(observationvaluerangehigh);

		/******************** Obsrvtn_VlRng_Hi_Cd ********************************************************************************/
		if(o.getObsrvtnVlRngHiCd() != null) {
			observationvaluerangehigh.setCode(o.getObsrvtnVlRngHiCd());
		}
		/******************** observationvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationvaluerangehigh.setComparator(observationvaluerangehighcomparator.fromCode(o.getObsrvtnVlRngHiCmprtr()));

		/******************** Obsrvtn_VlRng_Hi_Sys ********************************************************************************/
		if(o.getObsrvtnVlRngHiSys() != null) {
			observationvaluerangehigh.setSystem(o.getObsrvtnVlRngHiSys());
		}
		/******************** Obsrvtn_VlRng_Hi_Unt ********************************************************************************/
		if(o.getObsrvtnVlRngHiUnt() != null) {
			observationvaluerangehigh.setUnit(o.getObsrvtnVlRngHiUnt());
		}
		/******************** Obsrvtn_VlRng_Hi_Vl ********************************************************************************/
		if(o.getObsrvtnVlRngHiVl() != null) {
			observationvaluerangehigh.setValue(Double.parseDouble((o.getObsrvtnVlRngHiVl())));
		}
		/******************** observationvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		observationvaluerange.setLow(observationvaluerangelow);

		/******************** Obsrvtn_VlRng_Lw_Cd ********************************************************************************/
		if(o.getObsrvtnVlRngLwCd() != null) {
			observationvaluerangelow.setCode(o.getObsrvtnVlRngLwCd());
		}
		/******************** observationvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationvaluerangelow.setComparator(observationvaluerangelowcomparator.fromCode(o.getObsrvtnVlRngLwCmprtr()));

		/******************** Obsrvtn_VlRng_Lw_Sys ********************************************************************************/
		if(o.getObsrvtnVlRngLwSys() != null) {
			observationvaluerangelow.setSystem(o.getObsrvtnVlRngLwSys());
		}
		/******************** Obsrvtn_VlRng_Lw_Unt ********************************************************************************/
		if(o.getObsrvtnVlRngLwUnt() != null) {
			observationvaluerangelow.setUnit(o.getObsrvtnVlRngLwUnt());
		}
		/******************** Obsrvtn_VlRng_Lw_Vl ********************************************************************************/
		if(o.getObsrvtnVlRngLwVl() != null) {
			observationvaluerangelow.setValue(Double.parseDouble((o.getObsrvtnVlRngLwVl())));
		}
		/******************** observationvalueratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio observationvalueratio =  new org.hl7.fhir.r4.model.Ratio();
		observation.setValue(observationvalueratio);

		/******************** observationvalueratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvalueratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		observationvalueratio.setDenominator(observationvalueratiodenominator);

		/******************** Obsrvtn_VlRtio_Dnmntr_Cd ********************************************************************************/
		if(o.getObsrvtnVlRtioDnmntrCd() != null) {
			observationvalueratiodenominator.setCode(o.getObsrvtnVlRtioDnmntrCd());
		}
		/******************** observationvalueratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationvalueratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationvalueratiodenominator.setComparator(observationvalueratiodenominatorcomparator.fromCode(o.getObsrvtnVlRtioDnmntrCmprtr()));

		/******************** Obsrvtn_VlRtio_Dnmntr_Sys ********************************************************************************/
		if(o.getObsrvtnVlRtioDnmntrSys() != null) {
			observationvalueratiodenominator.setSystem(o.getObsrvtnVlRtioDnmntrSys());
		}
		/******************** Obsrvtn_VlRtio_Dnmntr_Unt ********************************************************************************/
		if(o.getObsrvtnVlRtioDnmntrUnt() != null) {
			observationvalueratiodenominator.setUnit(o.getObsrvtnVlRtioDnmntrUnt());
		}
		/******************** Obsrvtn_VlRtio_Dnmntr_Vl ********************************************************************************/
		if(o.getObsrvtnVlRtioDnmntrVl() != null) {
			observationvalueratiodenominator.setValue(Double.parseDouble((o.getObsrvtnVlRtioDnmntrVl())));
		}
		/******************** observationvaluerationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluerationumerator =  new org.hl7.fhir.r4.model.Quantity();
		observationvalueratio.setNumerator(observationvaluerationumerator);

		/******************** Obsrvtn_VlRtio_Nmrtr_Cd ********************************************************************************/
		if(o.getObsrvtnVlRtioNmrtrCd() != null) {
			observationvaluerationumerator.setCode(o.getObsrvtnVlRtioNmrtrCd());
		}
		/******************** observationvaluerationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationvaluerationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationvaluerationumerator.setComparator(observationvaluerationumeratorcomparator.fromCode(o.getObsrvtnVlRtioNmrtrCmprtr()));

		/******************** Obsrvtn_VlRtio_Nmrtr_Sys ********************************************************************************/
		if(o.getObsrvtnVlRtioNmrtrSys() != null) {
			observationvaluerationumerator.setSystem(o.getObsrvtnVlRtioNmrtrSys());
		}
		/******************** Obsrvtn_VlRtio_Nmrtr_Unt ********************************************************************************/
		if(o.getObsrvtnVlRtioNmrtrUnt() != null) {
			observationvaluerationumerator.setUnit(o.getObsrvtnVlRtioNmrtrUnt());
		}
		/******************** Obsrvtn_VlRtio_Nmrtr_Vl ********************************************************************************/
		if(o.getObsrvtnVlRtioNmrtrVl() != null) {
			observationvaluerationumerator.setValue(Double.parseDouble((o.getObsrvtnVlRtioNmrtrVl())));
		}
		/******************** observationvaluesampleddata ********************************************************************************/
		org.hl7.fhir.r4.model.SampledData observationvaluesampleddata =  new org.hl7.fhir.r4.model.SampledData();
		observation.setValue(observationvaluesampleddata);

		/******************** Obsrvtn_VlSampledData_Data ********************************************************************************/
		if(o.getObsrvtnVlSampledDataData() != null) {
			observationvaluesampleddata.setData(o.getObsrvtnVlSampledDataData());
		}
		/******************** Obsrvtn_VlSampledData_Dimensions ********************************************************************************/
		if(o.getObsrvtnVlSampledDataDimensions() != null) {
			observationvaluesampleddata.setDimensions(Integer.parseInt(o.getObsrvtnVlSampledDataDimensions()));
		}
		/******************** Obsrvtn_VlSampledData_Factor ********************************************************************************/
		if(o.getObsrvtnVlSampledDataFactor() != null) {
			observationvaluesampleddata.setFactor(Double.parseDouble((o.getObsrvtnVlSampledDataFactor())));
		}
		/******************** Obsrvtn_VlSampledData_LwerLmt ********************************************************************************/
		if(o.getObsrvtnVlSampledDataLwerLmt() != null) {
			observationvaluesampleddata.setLowerLimit(Double.parseDouble((o.getObsrvtnVlSampledDataLwerLmt())));
		}
		/******************** observationvaluesampleddataorigin ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluesampleddataorigin =  new org.hl7.fhir.r4.model.Quantity();
		observationvaluesampleddata.setOrigin(observationvaluesampleddataorigin);

		/******************** Obsrvtn_VlSampledData_Origin_Cd ********************************************************************************/
		if(o.getObsrvtnVlSampledDataOriginCd() != null) {
			observationvaluesampleddataorigin.setCode(o.getObsrvtnVlSampledDataOriginCd());
		}
		/******************** observationvaluesampleddataorigincomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory observationvaluesampleddataorigincomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		observationvaluesampleddataorigin.setComparator(observationvaluesampleddataorigincomparator.fromCode(o.getObsrvtnVlSampledDataOriginCmprtr()));

		/******************** Obsrvtn_VlSampledData_Origin_Sys ********************************************************************************/
		if(o.getObsrvtnVlSampledDataOriginSys() != null) {
			observationvaluesampleddataorigin.setSystem(o.getObsrvtnVlSampledDataOriginSys());
		}
		/******************** Obsrvtn_VlSampledData_Origin_Unt ********************************************************************************/
		if(o.getObsrvtnVlSampledDataOriginUnt() != null) {
			observationvaluesampleddataorigin.setUnit(o.getObsrvtnVlSampledDataOriginUnt());
		}
		/******************** Obsrvtn_VlSampledData_Origin_Vl ********************************************************************************/
		if(o.getObsrvtnVlSampledDataOriginVl() != null) {
			observationvaluesampleddataorigin.setValue(Double.parseDouble((o.getObsrvtnVlSampledDataOriginVl())));
		}
		/******************** Obsrvtn_VlSampledData_Prd ********************************************************************************/
		if(o.getObsrvtnVlSampledDataPrd() != null) {
			observationvaluesampleddata.setPeriod(Double.parseDouble((o.getObsrvtnVlSampledDataPrd())));
		}
		/******************** Obsrvtn_VlSampledData_UpperLmt ********************************************************************************/
		if(o.getObsrvtnVlSampledDataUpperLmt() != null) {
			observationvaluesampleddata.setUpperLimit(Double.parseDouble((o.getObsrvtnVlSampledDataUpperLmt())));
		}
		/******************** Obsrvtn_VlStrgTyp ********************************************************************************/
		if(o.getObsrvtnVlStrgTyp() != null) {
			observation.setValue( new org.hl7.fhir.r4.model.StringType(o.getObsrvtnVlStrgTyp()));
		}
		/******************** Obsrvtn_VlTimeTyp ********************************************************************************/
		if(o.getObsrvtnVlTimeTyp() != null) {
			observation.setValue( new org.hl7.fhir.r4.model.TimeType(o.getObsrvtnVlTimeTyp()));
		}
		return observation;
	}
}
