package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Observation;
public class ObservationBidirectionalConversion 
{
	public Observation Observations(org.hl7.fhir.r4.model.Observation observation) throws ParseException
	{
		 main.java.com.campfhir.model.Observation o = new  main.java.com.campfhir.model.Observation();

		/******************** id ********************************************************************************/
		observation.setId(o.getId());

		/******************** observationmethod ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationmethod = observation.getMethod();

		/******************** observationmethodcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationmethodcoding = observationmethod.getCodingFirstRep();

		/******************** Obsrvtn_Mthd_Cdg_Dsply ********************************************************************************/
		if(observationmethodcoding.hasDisplay()) {
			o.setObsrvtnMthdCdgDsply(String.valueOf(observationmethodcoding.getDisplay()));
		}
		/******************** Obsrvtn_Mthd_Cdg_Vrsn ********************************************************************************/
		if(observationmethodcoding.hasVersion()) {
			o.setObsrvtnMthdCdgVrsn(String.valueOf(observationmethodcoding.getVersion()));
		}
		/******************** Obsrvtn_Mthd_Cdg_Cd ********************************************************************************/
		if(observationmethodcoding.hasCode()) {
			o.setObsrvtnMthdCdgCd(String.valueOf(observationmethodcoding.getCode()));
		}
		/******************** Obsrvtn_Mthd_Cdg_Sys ********************************************************************************/
		if(observationmethodcoding.hasSystem()) {
			o.setObsrvtnMthdCdgSys(String.valueOf(observationmethodcoding.getSystem()));
		}
		/******************** Obsrvtn_Mthd_Cdg_UsrSltd ********************************************************************************/
		if(observationmethodcoding.hasUserSelected()) {
			o.setObsrvtnMthdCdgUsrSltd(String.valueOf(observationmethodcoding.getUserSelected()));
		}
		/******************** Obsrvtn_Mthd_Txt ********************************************************************************/
		if(observationmethod.hasText()) {
			o.setObsrvtnMthdTxt(String.valueOf(observationmethod.getText()));
		}
		/******************** observationcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcode = observation.getCode();

		/******************** observationcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcodecoding = observationcode.getCodingFirstRep();

		/******************** Obsrvtn_Cd_Cdg_Dsply ********************************************************************************/
		if(observationcodecoding.hasDisplay()) {
			o.setObsrvtnCdCdgDsply(String.valueOf(observationcodecoding.getDisplay()));
		}
		/******************** Obsrvtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(observationcodecoding.hasVersion()) {
			o.setObsrvtnCdCdgVrsn(String.valueOf(observationcodecoding.getVersion()));
		}
		/******************** Obsrvtn_Cd_Cdg_Cd ********************************************************************************/
		if(observationcodecoding.hasCode()) {
			o.setObsrvtnCdCdgCd(String.valueOf(observationcodecoding.getCode()));
		}
		/******************** Obsrvtn_Cd_Cdg_Sys ********************************************************************************/
		if(observationcodecoding.hasSystem()) {
			o.setObsrvtnCdCdgSys(String.valueOf(observationcodecoding.getSystem()));
		}
		/******************** Obsrvtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(observationcodecoding.hasUserSelected()) {
			o.setObsrvtnCdCdgUsrSltd(String.valueOf(observationcodecoding.getUserSelected()));
		}
		/******************** Obsrvtn_Cd_Txt ********************************************************************************/
		if(observationcode.hasText()) {
			o.setObsrvtnCdTxt(String.valueOf(observationcode.getText()));
		}
		/******************** observationdataabsentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationdataabsentreason = observation.getDataAbsentReason();

		/******************** observationdataabsentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationdataabsentreasoncoding = observationdataabsentreason.getCodingFirstRep();

		/******************** Obsrvtn_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(observationdataabsentreasoncoding.hasDisplay()) {
			o.setObsrvtnDataAbsentRsnCdgDsply(String.valueOf(observationdataabsentreasoncoding.getDisplay()));
		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(observationdataabsentreasoncoding.hasVersion()) {
			o.setObsrvtnDataAbsentRsnCdgVrsn(String.valueOf(observationdataabsentreasoncoding.getVersion()));
		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(observationdataabsentreasoncoding.hasCode()) {
			o.setObsrvtnDataAbsentRsnCdgCd(String.valueOf(observationdataabsentreasoncoding.getCode()));
		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(observationdataabsentreasoncoding.hasSystem()) {
			o.setObsrvtnDataAbsentRsnCdgSys(String.valueOf(observationdataabsentreasoncoding.getSystem()));
		}
		/******************** Obsrvtn_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(observationdataabsentreasoncoding.hasUserSelected()) {
			o.setObsrvtnDataAbsentRsnCdgUsrSltd(String.valueOf(observationdataabsentreasoncoding.getUserSelected()));
		}
		/******************** Obsrvtn_DataAbsentRsn_Txt ********************************************************************************/
		if(observationdataabsentreason.hasText()) {
			o.setObsrvtnDataAbsentRsnTxt(String.valueOf(observationdataabsentreason.getText()));
		}
		/******************** observationreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationreferencerange = observation.getReferenceRangeFirstRep();

		/******************** observationreferencerangetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationreferencerangetype = observationreferencerange.getType();

		/******************** observationreferencerangetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationreferencerangetypecoding = observationreferencerangetype.getCodingFirstRep();

		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Dsply ********************************************************************************/
		if(observationreferencerangetypecoding.hasDisplay()) {
			o.setObsrvtnRfrncRngTypCdgDsply(String.valueOf(observationreferencerangetypecoding.getDisplay()));
		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Vrsn ********************************************************************************/
		if(observationreferencerangetypecoding.hasVersion()) {
			o.setObsrvtnRfrncRngTypCdgVrsn(String.valueOf(observationreferencerangetypecoding.getVersion()));
		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Cd ********************************************************************************/
		if(observationreferencerangetypecoding.hasCode()) {
			o.setObsrvtnRfrncRngTypCdgCd(String.valueOf(observationreferencerangetypecoding.getCode()));
		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_Sys ********************************************************************************/
		if(observationreferencerangetypecoding.hasSystem()) {
			o.setObsrvtnRfrncRngTypCdgSys(String.valueOf(observationreferencerangetypecoding.getSystem()));
		}
		/******************** Obsrvtn_RfrncRng_Typ_Cdg_UsrSltd ********************************************************************************/
		if(observationreferencerangetypecoding.hasUserSelected()) {
			o.setObsrvtnRfrncRngTypCdgUsrSltd(String.valueOf(observationreferencerangetypecoding.getUserSelected()));
		}
		/******************** Obsrvtn_RfrncRng_Typ_Txt ********************************************************************************/
		if(observationreferencerangetype.hasText()) {
			o.setObsrvtnRfrncRngTypTxt(String.valueOf(observationreferencerangetype.getText()));
		}
		/******************** Obsrvtn_RfrncRng_Txt ********************************************************************************/
		if(observationreferencerange.hasText()) {
			o.setObsrvtnRfrncRngTxt(String.valueOf(observationreferencerange.getText()));
		}
		/******************** observationreferencerangeage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationreferencerangeage = observationreferencerange.getAge();

		/******************** observationreferencerangeagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangeagelow = observationreferencerangeage.getLow();

		/******************** Obsrvtn_RfrncRng_Age_Lw_Vl ********************************************************************************/
		if(observationreferencerangeagelow.hasValue()) {
			o.setObsrvtnRfrncRngAgeLwVl(String.valueOf(observationreferencerangeagelow.getValue()));
		}
		/******************** observationreferencerangeagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationreferencerangeagelowcomparator = observationreferencerangeagelow.getComparator();
		o.setObsrvtnRfrncRngAgeLwCmprtr(observationreferencerangeagelowcomparator.toCode());

		/******************** Obsrvtn_RfrncRng_Age_Lw_Cd ********************************************************************************/
		if(observationreferencerangeagelow.hasCode()) {
			o.setObsrvtnRfrncRngAgeLwCd(String.valueOf(observationreferencerangeagelow.getCode()));
		}
		/******************** Obsrvtn_RfrncRng_Age_Lw_Sys ********************************************************************************/
		if(observationreferencerangeagelow.hasSystem()) {
			o.setObsrvtnRfrncRngAgeLwSys(String.valueOf(observationreferencerangeagelow.getSystem()));
		}
		/******************** Obsrvtn_RfrncRng_Age_Lw_Unt ********************************************************************************/
		if(observationreferencerangeagelow.hasUnit()) {
			o.setObsrvtnRfrncRngAgeLwUnt(String.valueOf(observationreferencerangeagelow.getUnit()));
		}
		/******************** observationreferencerangeagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangeagehigh = observationreferencerangeage.getHigh();

		/******************** Obsrvtn_RfrncRng_Age_Hi_Vl ********************************************************************************/
		if(observationreferencerangeagehigh.hasValue()) {
			o.setObsrvtnRfrncRngAgeHiVl(String.valueOf(observationreferencerangeagehigh.getValue()));
		}
		/******************** observationreferencerangeagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationreferencerangeagehighcomparator = observationreferencerangeagehigh.getComparator();
		o.setObsrvtnRfrncRngAgeHiCmprtr(observationreferencerangeagehighcomparator.toCode());

		/******************** Obsrvtn_RfrncRng_Age_Hi_Cd ********************************************************************************/
		if(observationreferencerangeagehigh.hasCode()) {
			o.setObsrvtnRfrncRngAgeHiCd(String.valueOf(observationreferencerangeagehigh.getCode()));
		}
		/******************** Obsrvtn_RfrncRng_Age_Hi_Sys ********************************************************************************/
		if(observationreferencerangeagehigh.hasSystem()) {
			o.setObsrvtnRfrncRngAgeHiSys(String.valueOf(observationreferencerangeagehigh.getSystem()));
		}
		/******************** Obsrvtn_RfrncRng_Age_Hi_Unt ********************************************************************************/
		if(observationreferencerangeagehigh.hasUnit()) {
			o.setObsrvtnRfrncRngAgeHiUnt(String.valueOf(observationreferencerangeagehigh.getUnit()));
		}
		/******************** observationreferencerangeappliesto ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationreferencerangeappliesto = observationreferencerange.getAppliesToFirstRep();

		/******************** observationreferencerangeappliestocoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationreferencerangeappliestocoding = observationreferencerangeappliesto.getCodingFirstRep();

		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(observationreferencerangeappliestocoding.hasDisplay()) {
			o.setObsrvtnRfrncRngAppliesToCdgDsply(String.valueOf(observationreferencerangeappliestocoding.getDisplay()));
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(observationreferencerangeappliestocoding.hasVersion()) {
			o.setObsrvtnRfrncRngAppliesToCdgVrsn(String.valueOf(observationreferencerangeappliestocoding.getVersion()));
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Cd ********************************************************************************/
		if(observationreferencerangeappliestocoding.hasCode()) {
			o.setObsrvtnRfrncRngAppliesToCdgCd(String.valueOf(observationreferencerangeappliestocoding.getCode()));
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_Sys ********************************************************************************/
		if(observationreferencerangeappliestocoding.hasSystem()) {
			o.setObsrvtnRfrncRngAppliesToCdgSys(String.valueOf(observationreferencerangeappliestocoding.getSystem()));
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(observationreferencerangeappliestocoding.hasUserSelected()) {
			o.setObsrvtnRfrncRngAppliesToCdgUsrSltd(String.valueOf(observationreferencerangeappliestocoding.getUserSelected()));
		}
		/******************** Obsrvtn_RfrncRng_AppliesTo_Txt ********************************************************************************/
		if(observationreferencerangeappliesto.hasText()) {
			o.setObsrvtnRfrncRngAppliesToTxt(String.valueOf(observationreferencerangeappliesto.getText()));
		}
		/******************** observationreferencerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangelow = observationreferencerange.getLow();

		/******************** Obsrvtn_RfrncRng_Lw_Vl ********************************************************************************/
		if(observationreferencerangelow.hasValue()) {
			o.setObsrvtnRfrncRngLwVl(String.valueOf(observationreferencerangelow.getValue()));
		}
		/******************** observationreferencerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationreferencerangelowcomparator = observationreferencerangelow.getComparator();
		o.setObsrvtnRfrncRngLwCmprtr(observationreferencerangelowcomparator.toCode());

		/******************** Obsrvtn_RfrncRng_Lw_Cd ********************************************************************************/
		if(observationreferencerangelow.hasCode()) {
			o.setObsrvtnRfrncRngLwCd(String.valueOf(observationreferencerangelow.getCode()));
		}
		/******************** Obsrvtn_RfrncRng_Lw_Sys ********************************************************************************/
		if(observationreferencerangelow.hasSystem()) {
			o.setObsrvtnRfrncRngLwSys(String.valueOf(observationreferencerangelow.getSystem()));
		}
		/******************** Obsrvtn_RfrncRng_Lw_Unt ********************************************************************************/
		if(observationreferencerangelow.hasUnit()) {
			o.setObsrvtnRfrncRngLwUnt(String.valueOf(observationreferencerangelow.getUnit()));
		}
		/******************** observationreferencerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationreferencerangehigh = observationreferencerange.getHigh();

		/******************** Obsrvtn_RfrncRng_Hi_Vl ********************************************************************************/
		if(observationreferencerangehigh.hasValue()) {
			o.setObsrvtnRfrncRngHiVl(String.valueOf(observationreferencerangehigh.getValue()));
		}
		/******************** observationreferencerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationreferencerangehighcomparator = observationreferencerangehigh.getComparator();
		o.setObsrvtnRfrncRngHiCmprtr(observationreferencerangehighcomparator.toCode());

		/******************** Obsrvtn_RfrncRng_Hi_Cd ********************************************************************************/
		if(observationreferencerangehigh.hasCode()) {
			o.setObsrvtnRfrncRngHiCd(String.valueOf(observationreferencerangehigh.getCode()));
		}
		/******************** Obsrvtn_RfrncRng_Hi_Sys ********************************************************************************/
		if(observationreferencerangehigh.hasSystem()) {
			o.setObsrvtnRfrncRngHiSys(String.valueOf(observationreferencerangehigh.getSystem()));
		}
		/******************** Obsrvtn_RfrncRng_Hi_Unt ********************************************************************************/
		if(observationreferencerangehigh.hasUnit()) {
			o.setObsrvtnRfrncRngHiUnt(String.valueOf(observationreferencerangehigh.getUnit()));
		}
		/******************** Obsrvtn_EfctiveInstantTyp ********************************************************************************/
		if(observation.hasEffectiveInstantType()) {
			o.setObsrvtnEfctiveInstantTyp(String.valueOf(observation.getEffectiveInstantType()));
		}
		/******************** Obsrvtn_HasMmbr ********************************************************************************/
		if(observation.hasHasMember()) {
			o.setObsrvtnHasMmbr(String.valueOf(observation.getHasMemberFirstRep()));
		}
		/******************** observationcomponent ********************************************************************************/
		org.hl7.fhir.r4.model.Observation.ObservationComponentComponent observationcomponent = observation.getComponentFirstRep();

		/******************** observationcomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentcode = observationcomponent.getCode();

		/******************** observationcomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentcodecoding = observationcomponentcode.getCodingFirstRep();

		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(observationcomponentcodecoding.hasDisplay()) {
			o.setObsrvtnCmpntCdCdgDsply(String.valueOf(observationcomponentcodecoding.getDisplay()));
		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentcodecoding.hasVersion()) {
			o.setObsrvtnCmpntCdCdgVrsn(String.valueOf(observationcomponentcodecoding.getVersion()));
		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(observationcomponentcodecoding.hasCode()) {
			o.setObsrvtnCmpntCdCdgCd(String.valueOf(observationcomponentcodecoding.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(observationcomponentcodecoding.hasSystem()) {
			o.setObsrvtnCmpntCdCdgSys(String.valueOf(observationcomponentcodecoding.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentcodecoding.hasUserSelected()) {
			o.setObsrvtnCmpntCdCdgUsrSltd(String.valueOf(observationcomponentcodecoding.getUserSelected()));
		}
		/******************** Obsrvtn_Cmpnt_Cd_Txt ********************************************************************************/
		if(observationcomponentcode.hasText()) {
			o.setObsrvtnCmpntCdTxt(String.valueOf(observationcomponentcode.getText()));
		}
		/******************** observationcomponentdataabsentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentdataabsentreason = observationcomponent.getDataAbsentReason();

		/******************** observationcomponentdataabsentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentdataabsentreasoncoding = observationcomponentdataabsentreason.getCodingFirstRep();

		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(observationcomponentdataabsentreasoncoding.hasDisplay()) {
			o.setObsrvtnCmpntDataAbsentRsnCdgDsply(String.valueOf(observationcomponentdataabsentreasoncoding.getDisplay()));
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentdataabsentreasoncoding.hasVersion()) {
			o.setObsrvtnCmpntDataAbsentRsnCdgVrsn(String.valueOf(observationcomponentdataabsentreasoncoding.getVersion()));
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(observationcomponentdataabsentreasoncoding.hasCode()) {
			o.setObsrvtnCmpntDataAbsentRsnCdgCd(String.valueOf(observationcomponentdataabsentreasoncoding.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(observationcomponentdataabsentreasoncoding.hasSystem()) {
			o.setObsrvtnCmpntDataAbsentRsnCdgSys(String.valueOf(observationcomponentdataabsentreasoncoding.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentdataabsentreasoncoding.hasUserSelected()) {
			o.setObsrvtnCmpntDataAbsentRsnCdgUsrSltd(String.valueOf(observationcomponentdataabsentreasoncoding.getUserSelected()));
		}
		/******************** Obsrvtn_Cmpnt_DataAbsentRsn_Txt ********************************************************************************/
		if(observationcomponentdataabsentreason.hasText()) {
			o.setObsrvtnCmpntDataAbsentRsnTxt(String.valueOf(observationcomponentdataabsentreason.getText()));
		}
		/******************** observationcomponentreferencerange ********************************************************************************/
		org.hl7.fhir.r4.model.Observation.ObservationReferenceRangeComponent observationcomponentreferencerange = observationcomponent.getReferenceRangeFirstRep();

		/******************** observationcomponentreferencerangetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentreferencerangetype = observationcomponentreferencerange.getType();

		/******************** observationcomponentreferencerangetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentreferencerangetypecoding = observationcomponentreferencerangetype.getCodingFirstRep();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Dsply ********************************************************************************/
		if(observationcomponentreferencerangetypecoding.hasDisplay()) {
			o.setObsrvtnCmpntRfrncRngTypCdgDsply(String.valueOf(observationcomponentreferencerangetypecoding.getDisplay()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentreferencerangetypecoding.hasVersion()) {
			o.setObsrvtnCmpntRfrncRngTypCdgVrsn(String.valueOf(observationcomponentreferencerangetypecoding.getVersion()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Cd ********************************************************************************/
		if(observationcomponentreferencerangetypecoding.hasCode()) {
			o.setObsrvtnCmpntRfrncRngTypCdgCd(String.valueOf(observationcomponentreferencerangetypecoding.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_Sys ********************************************************************************/
		if(observationcomponentreferencerangetypecoding.hasSystem()) {
			o.setObsrvtnCmpntRfrncRngTypCdgSys(String.valueOf(observationcomponentreferencerangetypecoding.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentreferencerangetypecoding.hasUserSelected()) {
			o.setObsrvtnCmpntRfrncRngTypCdgUsrSltd(String.valueOf(observationcomponentreferencerangetypecoding.getUserSelected()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Typ_Txt ********************************************************************************/
		if(observationcomponentreferencerangetype.hasText()) {
			o.setObsrvtnCmpntRfrncRngTypTxt(String.valueOf(observationcomponentreferencerangetype.getText()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Txt ********************************************************************************/
		if(observationcomponentreferencerange.hasText()) {
			o.setObsrvtnCmpntRfrncRngTxt(String.valueOf(observationcomponentreferencerange.getText()));
		}
		/******************** observationcomponentreferencerangeage ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationcomponentreferencerangeage = observationcomponentreferencerange.getAge();

		/******************** observationcomponentreferencerangeagelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangeagelow = observationcomponentreferencerangeage.getLow();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Vl ********************************************************************************/
		if(observationcomponentreferencerangeagelow.hasValue()) {
			o.setObsrvtnCmpntRfrncRngAgeLwVl(String.valueOf(observationcomponentreferencerangeagelow.getValue()));
		}
		/******************** observationcomponentreferencerangeagelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentreferencerangeagelowcomparator = observationcomponentreferencerangeagelow.getComparator();
		o.setObsrvtnCmpntRfrncRngAgeLwCmprtr(observationcomponentreferencerangeagelowcomparator.toCode());

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Cd ********************************************************************************/
		if(observationcomponentreferencerangeagelow.hasCode()) {
			o.setObsrvtnCmpntRfrncRngAgeLwCd(String.valueOf(observationcomponentreferencerangeagelow.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Sys ********************************************************************************/
		if(observationcomponentreferencerangeagelow.hasSystem()) {
			o.setObsrvtnCmpntRfrncRngAgeLwSys(String.valueOf(observationcomponentreferencerangeagelow.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Lw_Unt ********************************************************************************/
		if(observationcomponentreferencerangeagelow.hasUnit()) {
			o.setObsrvtnCmpntRfrncRngAgeLwUnt(String.valueOf(observationcomponentreferencerangeagelow.getUnit()));
		}
		/******************** observationcomponentreferencerangeagehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangeagehigh = observationcomponentreferencerangeage.getHigh();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Vl ********************************************************************************/
		if(observationcomponentreferencerangeagehigh.hasValue()) {
			o.setObsrvtnCmpntRfrncRngAgeHiVl(String.valueOf(observationcomponentreferencerangeagehigh.getValue()));
		}
		/******************** observationcomponentreferencerangeagehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentreferencerangeagehighcomparator = observationcomponentreferencerangeagehigh.getComparator();
		o.setObsrvtnCmpntRfrncRngAgeHiCmprtr(observationcomponentreferencerangeagehighcomparator.toCode());

		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Cd ********************************************************************************/
		if(observationcomponentreferencerangeagehigh.hasCode()) {
			o.setObsrvtnCmpntRfrncRngAgeHiCd(String.valueOf(observationcomponentreferencerangeagehigh.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Sys ********************************************************************************/
		if(observationcomponentreferencerangeagehigh.hasSystem()) {
			o.setObsrvtnCmpntRfrncRngAgeHiSys(String.valueOf(observationcomponentreferencerangeagehigh.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Age_Hi_Unt ********************************************************************************/
		if(observationcomponentreferencerangeagehigh.hasUnit()) {
			o.setObsrvtnCmpntRfrncRngAgeHiUnt(String.valueOf(observationcomponentreferencerangeagehigh.getUnit()));
		}
		/******************** observationcomponentreferencerangeappliesto ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentreferencerangeappliesto = observationcomponentreferencerange.getAppliesToFirstRep();

		/******************** observationcomponentreferencerangeappliestocoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentreferencerangeappliestocoding = observationcomponentreferencerangeappliesto.getCodingFirstRep();

		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Dsply ********************************************************************************/
		if(observationcomponentreferencerangeappliestocoding.hasDisplay()) {
			o.setObsrvtnCmpntRfrncRngAppliesToCdgDsply(String.valueOf(observationcomponentreferencerangeappliestocoding.getDisplay()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentreferencerangeappliestocoding.hasVersion()) {
			o.setObsrvtnCmpntRfrncRngAppliesToCdgVrsn(String.valueOf(observationcomponentreferencerangeappliestocoding.getVersion()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Cd ********************************************************************************/
		if(observationcomponentreferencerangeappliestocoding.hasCode()) {
			o.setObsrvtnCmpntRfrncRngAppliesToCdgCd(String.valueOf(observationcomponentreferencerangeappliestocoding.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_Sys ********************************************************************************/
		if(observationcomponentreferencerangeappliestocoding.hasSystem()) {
			o.setObsrvtnCmpntRfrncRngAppliesToCdgSys(String.valueOf(observationcomponentreferencerangeappliestocoding.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentreferencerangeappliestocoding.hasUserSelected()) {
			o.setObsrvtnCmpntRfrncRngAppliesToCdgUsrSltd(String.valueOf(observationcomponentreferencerangeappliestocoding.getUserSelected()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_AppliesTo_Txt ********************************************************************************/
		if(observationcomponentreferencerangeappliesto.hasText()) {
			o.setObsrvtnCmpntRfrncRngAppliesToTxt(String.valueOf(observationcomponentreferencerangeappliesto.getText()));
		}
		/******************** observationcomponentreferencerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangelow = observationcomponentreferencerange.getLow();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Vl ********************************************************************************/
		if(observationcomponentreferencerangelow.hasValue()) {
			o.setObsrvtnCmpntRfrncRngLwVl(String.valueOf(observationcomponentreferencerangelow.getValue()));
		}
		/******************** observationcomponentreferencerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentreferencerangelowcomparator = observationcomponentreferencerangelow.getComparator();
		o.setObsrvtnCmpntRfrncRngLwCmprtr(observationcomponentreferencerangelowcomparator.toCode());

		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Cd ********************************************************************************/
		if(observationcomponentreferencerangelow.hasCode()) {
			o.setObsrvtnCmpntRfrncRngLwCd(String.valueOf(observationcomponentreferencerangelow.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Sys ********************************************************************************/
		if(observationcomponentreferencerangelow.hasSystem()) {
			o.setObsrvtnCmpntRfrncRngLwSys(String.valueOf(observationcomponentreferencerangelow.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Lw_Unt ********************************************************************************/
		if(observationcomponentreferencerangelow.hasUnit()) {
			o.setObsrvtnCmpntRfrncRngLwUnt(String.valueOf(observationcomponentreferencerangelow.getUnit()));
		}
		/******************** observationcomponentreferencerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentreferencerangehigh = observationcomponentreferencerange.getHigh();

		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Vl ********************************************************************************/
		if(observationcomponentreferencerangehigh.hasValue()) {
			o.setObsrvtnCmpntRfrncRngHiVl(String.valueOf(observationcomponentreferencerangehigh.getValue()));
		}
		/******************** observationcomponentreferencerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentreferencerangehighcomparator = observationcomponentreferencerangehigh.getComparator();
		o.setObsrvtnCmpntRfrncRngHiCmprtr(observationcomponentreferencerangehighcomparator.toCode());

		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Cd ********************************************************************************/
		if(observationcomponentreferencerangehigh.hasCode()) {
			o.setObsrvtnCmpntRfrncRngHiCd(String.valueOf(observationcomponentreferencerangehigh.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Sys ********************************************************************************/
		if(observationcomponentreferencerangehigh.hasSystem()) {
			o.setObsrvtnCmpntRfrncRngHiSys(String.valueOf(observationcomponentreferencerangehigh.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_RfrncRng_Hi_Unt ********************************************************************************/
		if(observationcomponentreferencerangehigh.hasUnit()) {
			o.setObsrvtnCmpntRfrncRngHiUnt(String.valueOf(observationcomponentreferencerangehigh.getUnit()));
		}
		/******************** Obsrvtn_Cmpnt_VlBooleanTyp ********************************************************************************/
		if(observationcomponent.hasValueBooleanType()) {
			o.setObsrvtnCmpntVlBooleanTyp(String.valueOf(observationcomponent.getValueBooleanType()));
		}
		/******************** Obsrvtn_Cmpnt_VlIntegerTyp ********************************************************************************/
		if(observationcomponent.hasValueIntegerType()) {
			o.setObsrvtnCmpntVlIntegerTyp(String.valueOf(observationcomponent.getValueIntegerType()));
		}
		/******************** Obsrvtn_Cmpnt_VlDtTimeTyp ********************************************************************************/
		if(observationcomponent.hasValueDateTimeType()) {
			o.setObsrvtnCmpntVlDtTimeTyp(String.valueOf(observationcomponent.getValueDateTimeType()));
		}
		/******************** observationcomponentinterpretation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentinterpretation = observationcomponent.getInterpretationFirstRep();

		/******************** observationcomponentinterpretationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentinterpretationcoding = observationcomponentinterpretation.getCodingFirstRep();

		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Dsply ********************************************************************************/
		if(observationcomponentinterpretationcoding.hasDisplay()) {
			o.setObsrvtnCmpntInterpretationCdgDsply(String.valueOf(observationcomponentinterpretationcoding.getDisplay()));
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentinterpretationcoding.hasVersion()) {
			o.setObsrvtnCmpntInterpretationCdgVrsn(String.valueOf(observationcomponentinterpretationcoding.getVersion()));
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Cd ********************************************************************************/
		if(observationcomponentinterpretationcoding.hasCode()) {
			o.setObsrvtnCmpntInterpretationCdgCd(String.valueOf(observationcomponentinterpretationcoding.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_Sys ********************************************************************************/
		if(observationcomponentinterpretationcoding.hasSystem()) {
			o.setObsrvtnCmpntInterpretationCdgSys(String.valueOf(observationcomponentinterpretationcoding.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentinterpretationcoding.hasUserSelected()) {
			o.setObsrvtnCmpntInterpretationCdgUsrSltd(String.valueOf(observationcomponentinterpretationcoding.getUserSelected()));
		}
		/******************** Obsrvtn_Cmpnt_Interpretation_Txt ********************************************************************************/
		if(observationcomponentinterpretation.hasText()) {
			o.setObsrvtnCmpntInterpretationTxt(String.valueOf(observationcomponentinterpretation.getText()));
		}
		/******************** observationcomponentvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcomponentvaluecodeableconcept = observationcomponent.getValueCodeableConcept();

		/******************** observationcomponentvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcomponentvaluecodeableconceptcoding = observationcomponentvaluecodeableconcept.getCodingFirstRep();

		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcoding.hasDisplay()) {
			o.setObsrvtnCmpntVlCdbleCncptCdgDsply(String.valueOf(observationcomponentvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcoding.hasVersion()) {
			o.setObsrvtnCmpntVlCdbleCncptCdgVrsn(String.valueOf(observationcomponentvaluecodeableconceptcoding.getVersion()));
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcoding.hasCode()) {
			o.setObsrvtnCmpntVlCdbleCncptCdgCd(String.valueOf(observationcomponentvaluecodeableconceptcoding.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcoding.hasSystem()) {
			o.setObsrvtnCmpntVlCdbleCncptCdgSys(String.valueOf(observationcomponentvaluecodeableconceptcoding.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(observationcomponentvaluecodeableconceptcoding.hasUserSelected()) {
			o.setObsrvtnCmpntVlCdbleCncptCdgUsrSltd(String.valueOf(observationcomponentvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** Obsrvtn_Cmpnt_VlCdbleCncpt_Txt ********************************************************************************/
		if(observationcomponentvaluecodeableconcept.hasText()) {
			o.setObsrvtnCmpntVlCdbleCncptTxt(String.valueOf(observationcomponentvaluecodeableconcept.getText()));
		}
		/******************** observationcomponentvaluesampleddata ********************************************************************************/
		org.hl7.fhir.r4.model.SampledData observationcomponentvaluesampleddata = observationcomponent.getValueSampledData();

		/******************** Obsrvtn_Cmpnt_VlSampledData_Dimensions ********************************************************************************/
		if(observationcomponentvaluesampleddata.hasDimensions()) {
			o.setObsrvtnCmpntVlSampledDataDimensions(String.valueOf(observationcomponentvaluesampleddata.getDimensions()));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Prd ********************************************************************************/
		if(observationcomponentvaluesampleddata.hasPeriod()) {
			o.setObsrvtnCmpntVlSampledDataPrd(String.valueOf(observationcomponentvaluesampleddata.getPeriod()));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Factor ********************************************************************************/
		if(observationcomponentvaluesampleddata.hasFactor()) {
			o.setObsrvtnCmpntVlSampledDataFactor(String.valueOf(observationcomponentvaluesampleddata.getFactor()));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_LwerLmt ********************************************************************************/
		if(observationcomponentvaluesampleddata.hasLowerLimit()) {
			o.setObsrvtnCmpntVlSampledDataLwerLmt(String.valueOf(observationcomponentvaluesampleddata.getLowerLimit()));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_UpperLmt ********************************************************************************/
		if(observationcomponentvaluesampleddata.hasUpperLimit()) {
			o.setObsrvtnCmpntVlSampledDataUpperLmt(String.valueOf(observationcomponentvaluesampleddata.getUpperLimit()));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Data ********************************************************************************/
		if(observationcomponentvaluesampleddata.hasData()) {
			o.setObsrvtnCmpntVlSampledDataData(String.valueOf(observationcomponentvaluesampleddata.getData()));
		}
		/******************** observationcomponentvaluesampleddataorigin ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluesampleddataorigin = observationcomponentvaluesampleddata.getOrigin();

		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Vl ********************************************************************************/
		if(observationcomponentvaluesampleddataorigin.hasValue()) {
			o.setObsrvtnCmpntVlSampledDataOriginVl(String.valueOf(observationcomponentvaluesampleddataorigin.getValue()));
		}
		/******************** observationcomponentvaluesampleddataorigincomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluesampleddataorigincomparator = observationcomponentvaluesampleddataorigin.getComparator();
		o.setObsrvtnCmpntVlSampledDataOriginCmprtr(observationcomponentvaluesampleddataorigincomparator.toCode());

		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Cd ********************************************************************************/
		if(observationcomponentvaluesampleddataorigin.hasCode()) {
			o.setObsrvtnCmpntVlSampledDataOriginCd(String.valueOf(observationcomponentvaluesampleddataorigin.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Sys ********************************************************************************/
		if(observationcomponentvaluesampleddataorigin.hasSystem()) {
			o.setObsrvtnCmpntVlSampledDataOriginSys(String.valueOf(observationcomponentvaluesampleddataorigin.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_VlSampledData_Origin_Unt ********************************************************************************/
		if(observationcomponentvaluesampleddataorigin.hasUnit()) {
			o.setObsrvtnCmpntVlSampledDataOriginUnt(String.valueOf(observationcomponentvaluesampleddataorigin.getUnit()));
		}
		/******************** observationcomponentvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluequantity = observationcomponent.getValueQuantity();

		/******************** Obsrvtn_Cmpnt_VlQnty_Vl ********************************************************************************/
		if(observationcomponentvaluequantity.hasValue()) {
			o.setObsrvtnCmpntVlQntyVl(String.valueOf(observationcomponentvaluequantity.getValue()));
		}
		/******************** observationcomponentvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluequantitycomparator = observationcomponentvaluequantity.getComparator();
		o.setObsrvtnCmpntVlQntyCmprtr(observationcomponentvaluequantitycomparator.toCode());

		/******************** Obsrvtn_Cmpnt_VlQnty_Cd ********************************************************************************/
		if(observationcomponentvaluequantity.hasCode()) {
			o.setObsrvtnCmpntVlQntyCd(String.valueOf(observationcomponentvaluequantity.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_VlQnty_Sys ********************************************************************************/
		if(observationcomponentvaluequantity.hasSystem()) {
			o.setObsrvtnCmpntVlQntySys(String.valueOf(observationcomponentvaluequantity.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_VlQnty_Unt ********************************************************************************/
		if(observationcomponentvaluequantity.hasUnit()) {
			o.setObsrvtnCmpntVlQntyUnt(String.valueOf(observationcomponentvaluequantity.getUnit()));
		}
		/******************** Obsrvtn_Cmpnt_VlStrgTyp ********************************************************************************/
		if(observationcomponent.hasValueStringType()) {
			o.setObsrvtnCmpntVlStrgTyp(String.valueOf(observationcomponent.getValueStringType()));
		}
		/******************** observationcomponentvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationcomponentvaluerange = observationcomponent.getValueRange();

		/******************** observationcomponentvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluerangelow = observationcomponentvaluerange.getLow();

		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Vl ********************************************************************************/
		if(observationcomponentvaluerangelow.hasValue()) {
			o.setObsrvtnCmpntVlRngLwVl(String.valueOf(observationcomponentvaluerangelow.getValue()));
		}
		/******************** observationcomponentvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluerangelowcomparator = observationcomponentvaluerangelow.getComparator();
		o.setObsrvtnCmpntVlRngLwCmprtr(observationcomponentvaluerangelowcomparator.toCode());

		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Cd ********************************************************************************/
		if(observationcomponentvaluerangelow.hasCode()) {
			o.setObsrvtnCmpntVlRngLwCd(String.valueOf(observationcomponentvaluerangelow.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Sys ********************************************************************************/
		if(observationcomponentvaluerangelow.hasSystem()) {
			o.setObsrvtnCmpntVlRngLwSys(String.valueOf(observationcomponentvaluerangelow.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_VlRng_Lw_Unt ********************************************************************************/
		if(observationcomponentvaluerangelow.hasUnit()) {
			o.setObsrvtnCmpntVlRngLwUnt(String.valueOf(observationcomponentvaluerangelow.getUnit()));
		}
		/******************** observationcomponentvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluerangehigh = observationcomponentvaluerange.getHigh();

		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Vl ********************************************************************************/
		if(observationcomponentvaluerangehigh.hasValue()) {
			o.setObsrvtnCmpntVlRngHiVl(String.valueOf(observationcomponentvaluerangehigh.getValue()));
		}
		/******************** observationcomponentvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluerangehighcomparator = observationcomponentvaluerangehigh.getComparator();
		o.setObsrvtnCmpntVlRngHiCmprtr(observationcomponentvaluerangehighcomparator.toCode());

		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Cd ********************************************************************************/
		if(observationcomponentvaluerangehigh.hasCode()) {
			o.setObsrvtnCmpntVlRngHiCd(String.valueOf(observationcomponentvaluerangehigh.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Sys ********************************************************************************/
		if(observationcomponentvaluerangehigh.hasSystem()) {
			o.setObsrvtnCmpntVlRngHiSys(String.valueOf(observationcomponentvaluerangehigh.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_VlRng_Hi_Unt ********************************************************************************/
		if(observationcomponentvaluerangehigh.hasUnit()) {
			o.setObsrvtnCmpntVlRngHiUnt(String.valueOf(observationcomponentvaluerangehigh.getUnit()));
		}
		/******************** observationcomponentvalueratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio observationcomponentvalueratio = observationcomponent.getValueRatio();

		/******************** observationcomponentvaluerationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvaluerationumerator = observationcomponentvalueratio.getNumerator();

		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Vl ********************************************************************************/
		if(observationcomponentvaluerationumerator.hasValue()) {
			o.setObsrvtnCmpntVlRtioNmrtrVl(String.valueOf(observationcomponentvaluerationumerator.getValue()));
		}
		/******************** observationcomponentvaluerationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvaluerationumeratorcomparator = observationcomponentvaluerationumerator.getComparator();
		o.setObsrvtnCmpntVlRtioNmrtrCmprtr(observationcomponentvaluerationumeratorcomparator.toCode());

		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Cd ********************************************************************************/
		if(observationcomponentvaluerationumerator.hasCode()) {
			o.setObsrvtnCmpntVlRtioNmrtrCd(String.valueOf(observationcomponentvaluerationumerator.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Sys ********************************************************************************/
		if(observationcomponentvaluerationumerator.hasSystem()) {
			o.setObsrvtnCmpntVlRtioNmrtrSys(String.valueOf(observationcomponentvaluerationumerator.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Nmrtr_Unt ********************************************************************************/
		if(observationcomponentvaluerationumerator.hasUnit()) {
			o.setObsrvtnCmpntVlRtioNmrtrUnt(String.valueOf(observationcomponentvaluerationumerator.getUnit()));
		}
		/******************** observationcomponentvalueratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationcomponentvalueratiodenominator = observationcomponentvalueratio.getDenominator();

		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Vl ********************************************************************************/
		if(observationcomponentvalueratiodenominator.hasValue()) {
			o.setObsrvtnCmpntVlRtioDnmntrVl(String.valueOf(observationcomponentvalueratiodenominator.getValue()));
		}
		/******************** observationcomponentvalueratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationcomponentvalueratiodenominatorcomparator = observationcomponentvalueratiodenominator.getComparator();
		o.setObsrvtnCmpntVlRtioDnmntrCmprtr(observationcomponentvalueratiodenominatorcomparator.toCode());

		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Cd ********************************************************************************/
		if(observationcomponentvalueratiodenominator.hasCode()) {
			o.setObsrvtnCmpntVlRtioDnmntrCd(String.valueOf(observationcomponentvalueratiodenominator.getCode()));
		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Sys ********************************************************************************/
		if(observationcomponentvalueratiodenominator.hasSystem()) {
			o.setObsrvtnCmpntVlRtioDnmntrSys(String.valueOf(observationcomponentvalueratiodenominator.getSystem()));
		}
		/******************** Obsrvtn_Cmpnt_VlRtio_Dnmntr_Unt ********************************************************************************/
		if(observationcomponentvalueratiodenominator.hasUnit()) {
			o.setObsrvtnCmpntVlRtioDnmntrUnt(String.valueOf(observationcomponentvalueratiodenominator.getUnit()));
		}
		/******************** Obsrvtn_Cmpnt_VlTimeTyp ********************************************************************************/
		if(observationcomponent.hasValueTimeType()) {
			o.setObsrvtnCmpntVlTimeTyp(String.valueOf(observationcomponent.getValueTimeType()));
		}
		/******************** observationcomponentvalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationcomponentvalueperiod = observationcomponent.getValuePeriod();

		/******************** Obsrvtn_Cmpnt_VlPrd_End ********************************************************************************/
		if(observationcomponentvalueperiod.hasEnd()) {
			o.setObsrvtnCmpntVlPrdEnd(String.valueOf(observationcomponentvalueperiod.getEnd()));
		}
		/******************** Obsrvtn_Cmpnt_VlPrd_Strt ********************************************************************************/
		if(observationcomponentvalueperiod.hasStart()) {
			o.setObsrvtnCmpntVlPrdStrt(String.valueOf(observationcomponentvalueperiod.getStart()));
		}
		/******************** Obsrvtn_VlBooleanTyp ********************************************************************************/
		if(observation.hasValueBooleanType()) {
			o.setObsrvtnVlBooleanTyp(String.valueOf(observation.getValueBooleanType()));
		}
		/******************** Obsrvtn_VlIntegerTyp ********************************************************************************/
		if(observation.hasValueIntegerType()) {
			o.setObsrvtnVlIntegerTyp(String.valueOf(observation.getValueIntegerType()));
		}
		/******************** Obsrvtn_VlDtTimeTyp ********************************************************************************/
		if(observation.hasValueDateTimeType()) {
			o.setObsrvtnVlDtTimeTyp(String.valueOf(observation.getValueDateTimeType()));
		}
		/******************** observationinterpretation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationinterpretation = observation.getInterpretationFirstRep();

		/******************** observationinterpretationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationinterpretationcoding = observationinterpretation.getCodingFirstRep();

		/******************** Obsrvtn_Interpretation_Cdg_Dsply ********************************************************************************/
		if(observationinterpretationcoding.hasDisplay()) {
			o.setObsrvtnInterpretationCdgDsply(String.valueOf(observationinterpretationcoding.getDisplay()));
		}
		/******************** Obsrvtn_Interpretation_Cdg_Vrsn ********************************************************************************/
		if(observationinterpretationcoding.hasVersion()) {
			o.setObsrvtnInterpretationCdgVrsn(String.valueOf(observationinterpretationcoding.getVersion()));
		}
		/******************** Obsrvtn_Interpretation_Cdg_Cd ********************************************************************************/
		if(observationinterpretationcoding.hasCode()) {
			o.setObsrvtnInterpretationCdgCd(String.valueOf(observationinterpretationcoding.getCode()));
		}
		/******************** Obsrvtn_Interpretation_Cdg_Sys ********************************************************************************/
		if(observationinterpretationcoding.hasSystem()) {
			o.setObsrvtnInterpretationCdgSys(String.valueOf(observationinterpretationcoding.getSystem()));
		}
		/******************** Obsrvtn_Interpretation_Cdg_UsrSltd ********************************************************************************/
		if(observationinterpretationcoding.hasUserSelected()) {
			o.setObsrvtnInterpretationCdgUsrSltd(String.valueOf(observationinterpretationcoding.getUserSelected()));
		}
		/******************** Obsrvtn_Interpretation_Txt ********************************************************************************/
		if(observationinterpretation.hasText()) {
			o.setObsrvtnInterpretationTxt(String.valueOf(observationinterpretation.getText()));
		}
		/******************** observationvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationvaluecodeableconcept = observation.getValueCodeableConcept();

		/******************** observationvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationvaluecodeableconceptcoding = observationvaluecodeableconcept.getCodingFirstRep();

		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(observationvaluecodeableconceptcoding.hasDisplay()) {
			o.setObsrvtnVlCdbleCncptCdgDsply(String.valueOf(observationvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(observationvaluecodeableconceptcoding.hasVersion()) {
			o.setObsrvtnVlCdbleCncptCdgVrsn(String.valueOf(observationvaluecodeableconceptcoding.getVersion()));
		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(observationvaluecodeableconceptcoding.hasCode()) {
			o.setObsrvtnVlCdbleCncptCdgCd(String.valueOf(observationvaluecodeableconceptcoding.getCode()));
		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(observationvaluecodeableconceptcoding.hasSystem()) {
			o.setObsrvtnVlCdbleCncptCdgSys(String.valueOf(observationvaluecodeableconceptcoding.getSystem()));
		}
		/******************** Obsrvtn_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(observationvaluecodeableconceptcoding.hasUserSelected()) {
			o.setObsrvtnVlCdbleCncptCdgUsrSltd(String.valueOf(observationvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** Obsrvtn_VlCdbleCncpt_Txt ********************************************************************************/
		if(observationvaluecodeableconcept.hasText()) {
			o.setObsrvtnVlCdbleCncptTxt(String.valueOf(observationvaluecodeableconcept.getText()));
		}
		/******************** observationvaluesampleddata ********************************************************************************/
		org.hl7.fhir.r4.model.SampledData observationvaluesampleddata = observation.getValueSampledData();

		/******************** Obsrvtn_VlSampledData_Dimensions ********************************************************************************/
		if(observationvaluesampleddata.hasDimensions()) {
			o.setObsrvtnVlSampledDataDimensions(String.valueOf(observationvaluesampleddata.getDimensions()));
		}
		/******************** Obsrvtn_VlSampledData_Prd ********************************************************************************/
		if(observationvaluesampleddata.hasPeriod()) {
			o.setObsrvtnVlSampledDataPrd(String.valueOf(observationvaluesampleddata.getPeriod()));
		}
		/******************** Obsrvtn_VlSampledData_Factor ********************************************************************************/
		if(observationvaluesampleddata.hasFactor()) {
			o.setObsrvtnVlSampledDataFactor(String.valueOf(observationvaluesampleddata.getFactor()));
		}
		/******************** Obsrvtn_VlSampledData_LwerLmt ********************************************************************************/
		if(observationvaluesampleddata.hasLowerLimit()) {
			o.setObsrvtnVlSampledDataLwerLmt(String.valueOf(observationvaluesampleddata.getLowerLimit()));
		}
		/******************** Obsrvtn_VlSampledData_UpperLmt ********************************************************************************/
		if(observationvaluesampleddata.hasUpperLimit()) {
			o.setObsrvtnVlSampledDataUpperLmt(String.valueOf(observationvaluesampleddata.getUpperLimit()));
		}
		/******************** Obsrvtn_VlSampledData_Data ********************************************************************************/
		if(observationvaluesampleddata.hasData()) {
			o.setObsrvtnVlSampledDataData(String.valueOf(observationvaluesampleddata.getData()));
		}
		/******************** observationvaluesampleddataorigin ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluesampleddataorigin = observationvaluesampleddata.getOrigin();

		/******************** Obsrvtn_VlSampledData_Origin_Vl ********************************************************************************/
		if(observationvaluesampleddataorigin.hasValue()) {
			o.setObsrvtnVlSampledDataOriginVl(String.valueOf(observationvaluesampleddataorigin.getValue()));
		}
		/******************** observationvaluesampleddataorigincomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluesampleddataorigincomparator = observationvaluesampleddataorigin.getComparator();
		o.setObsrvtnVlSampledDataOriginCmprtr(observationvaluesampleddataorigincomparator.toCode());

		/******************** Obsrvtn_VlSampledData_Origin_Cd ********************************************************************************/
		if(observationvaluesampleddataorigin.hasCode()) {
			o.setObsrvtnVlSampledDataOriginCd(String.valueOf(observationvaluesampleddataorigin.getCode()));
		}
		/******************** Obsrvtn_VlSampledData_Origin_Sys ********************************************************************************/
		if(observationvaluesampleddataorigin.hasSystem()) {
			o.setObsrvtnVlSampledDataOriginSys(String.valueOf(observationvaluesampleddataorigin.getSystem()));
		}
		/******************** Obsrvtn_VlSampledData_Origin_Unt ********************************************************************************/
		if(observationvaluesampleddataorigin.hasUnit()) {
			o.setObsrvtnVlSampledDataOriginUnt(String.valueOf(observationvaluesampleddataorigin.getUnit()));
		}
		/******************** Obsrvtn_EfctiveDtTimeTyp ********************************************************************************/
		if(observation.hasEffectiveDateTimeType()) {
			o.setObsrvtnEfctiveDtTimeTyp(String.valueOf(observation.getEffectiveDateTimeType()));
		}
		/******************** Obsrvtn_Prfrmr ********************************************************************************/
		if(observation.hasPerformer()) {
			o.setObsrvtnPrfrmr(String.valueOf(observation.getPerformerFirstRep()));
		}
		/******************** Obsrvtn_Sbjct ********************************************************************************/
		if(observation.hasSubject()) {
			o.setObsrvtnSbjct(String.valueOf(observation.getSubject()));
		}
		/******************** observationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Observation.ObservationStatus observationstatus = observation.getStatus();
		o.setObsrvtnSts(observationstatus.toCode());

		/******************** Obsrvtn_Enc ********************************************************************************/
		if(observation.hasEncounter()) {
			o.setObsrvtnEnc(String.valueOf(observation.getEncounter()));
		}
		/******************** Obsrvtn_BasedOn ********************************************************************************/
		if(observation.hasBasedOn()) {
			o.setObsrvtnBasedOn(String.valueOf(observation.getBasedOnFirstRep()));
		}
		/******************** observationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation observationnote = observation.getNoteFirstRep();

		/******************** Obsrvtn_Nt_Time ********************************************************************************/
		if(observationnote.hasTime()) {
			o.setObsrvtnNtTime(String.valueOf(observationnote.getTime()));
		}
		/******************** Obsrvtn_Nt_AthrRfrnc ********************************************************************************/
		if(observationnote.hasAuthorReference()) {
			o.setObsrvtnNtAthrRfrnc(String.valueOf(observationnote.getAuthorReference()));
		}
		/******************** Obsrvtn_Nt_Txt ********************************************************************************/
		if(observationnote.hasText()) {
			o.setObsrvtnNtTxt(String.valueOf(observationnote.getText()));
		}
		/******************** Obsrvtn_Nt_AthrStrgTyp ********************************************************************************/
		if(observationnote.hasAuthorStringType()) {
			o.setObsrvtnNtAthrStrgTyp(String.valueOf(observationnote.getAuthorStringType()));
		}
		/******************** observationbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationbodysite = observation.getBodySite();

		/******************** observationbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationbodysitecoding = observationbodysite.getCodingFirstRep();

		/******************** Obsrvtn_BodySite_Cdg_Dsply ********************************************************************************/
		if(observationbodysitecoding.hasDisplay()) {
			o.setObsrvtnBodySiteCdgDsply(String.valueOf(observationbodysitecoding.getDisplay()));
		}
		/******************** Obsrvtn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(observationbodysitecoding.hasVersion()) {
			o.setObsrvtnBodySiteCdgVrsn(String.valueOf(observationbodysitecoding.getVersion()));
		}
		/******************** Obsrvtn_BodySite_Cdg_Cd ********************************************************************************/
		if(observationbodysitecoding.hasCode()) {
			o.setObsrvtnBodySiteCdgCd(String.valueOf(observationbodysitecoding.getCode()));
		}
		/******************** Obsrvtn_BodySite_Cdg_Sys ********************************************************************************/
		if(observationbodysitecoding.hasSystem()) {
			o.setObsrvtnBodySiteCdgSys(String.valueOf(observationbodysitecoding.getSystem()));
		}
		/******************** Obsrvtn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(observationbodysitecoding.hasUserSelected()) {
			o.setObsrvtnBodySiteCdgUsrSltd(String.valueOf(observationbodysitecoding.getUserSelected()));
		}
		/******************** Obsrvtn_BodySite_Txt ********************************************************************************/
		if(observationbodysite.hasText()) {
			o.setObsrvtnBodySiteTxt(String.valueOf(observationbodysite.getText()));
		}
		/******************** Obsrvtn_Dvc ********************************************************************************/
		if(observation.hasDevice()) {
			o.setObsrvtnDvc(String.valueOf(observation.getDevice()));
		}
		/******************** observationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationcategory = observation.getCategoryFirstRep();

		/******************** observationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationcategorycoding = observationcategory.getCodingFirstRep();

		/******************** Obsrvtn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(observationcategorycoding.hasDisplay()) {
			o.setObsrvtnCtgryCdgDsply(String.valueOf(observationcategorycoding.getDisplay()));
		}
		/******************** Obsrvtn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(observationcategorycoding.hasVersion()) {
			o.setObsrvtnCtgryCdgVrsn(String.valueOf(observationcategorycoding.getVersion()));
		}
		/******************** Obsrvtn_Ctgry_Cdg_Cd ********************************************************************************/
		if(observationcategorycoding.hasCode()) {
			o.setObsrvtnCtgryCdgCd(String.valueOf(observationcategorycoding.getCode()));
		}
		/******************** Obsrvtn_Ctgry_Cdg_Sys ********************************************************************************/
		if(observationcategorycoding.hasSystem()) {
			o.setObsrvtnCtgryCdgSys(String.valueOf(observationcategorycoding.getSystem()));
		}
		/******************** Obsrvtn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(observationcategorycoding.hasUserSelected()) {
			o.setObsrvtnCtgryCdgUsrSltd(String.valueOf(observationcategorycoding.getUserSelected()));
		}
		/******************** Obsrvtn_Ctgry_Txt ********************************************************************************/
		if(observationcategory.hasText()) {
			o.setObsrvtnCtgryTxt(String.valueOf(observationcategory.getText()));
		}
		/******************** observationvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluequantity = observation.getValueQuantity();

		/******************** Obsrvtn_VlQnty_Vl ********************************************************************************/
		if(observationvaluequantity.hasValue()) {
			o.setObsrvtnVlQntyVl(String.valueOf(observationvaluequantity.getValue()));
		}
		/******************** observationvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluequantitycomparator = observationvaluequantity.getComparator();
		o.setObsrvtnVlQntyCmprtr(observationvaluequantitycomparator.toCode());

		/******************** Obsrvtn_VlQnty_Cd ********************************************************************************/
		if(observationvaluequantity.hasCode()) {
			o.setObsrvtnVlQntyCd(String.valueOf(observationvaluequantity.getCode()));
		}
		/******************** Obsrvtn_VlQnty_Sys ********************************************************************************/
		if(observationvaluequantity.hasSystem()) {
			o.setObsrvtnVlQntySys(String.valueOf(observationvaluequantity.getSystem()));
		}
		/******************** Obsrvtn_VlQnty_Unt ********************************************************************************/
		if(observationvaluequantity.hasUnit()) {
			o.setObsrvtnVlQntyUnt(String.valueOf(observationvaluequantity.getUnit()));
		}
		/******************** Obsrvtn_VlStrgTyp ********************************************************************************/
		if(observation.hasValueStringType()) {
			o.setObsrvtnVlStrgTyp(String.valueOf(observation.getValueStringType()));
		}
		/******************** observationvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationvaluerange = observation.getValueRange();

		/******************** observationvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluerangelow = observationvaluerange.getLow();

		/******************** Obsrvtn_VlRng_Lw_Vl ********************************************************************************/
		if(observationvaluerangelow.hasValue()) {
			o.setObsrvtnVlRngLwVl(String.valueOf(observationvaluerangelow.getValue()));
		}
		/******************** observationvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluerangelowcomparator = observationvaluerangelow.getComparator();
		o.setObsrvtnVlRngLwCmprtr(observationvaluerangelowcomparator.toCode());

		/******************** Obsrvtn_VlRng_Lw_Cd ********************************************************************************/
		if(observationvaluerangelow.hasCode()) {
			o.setObsrvtnVlRngLwCd(String.valueOf(observationvaluerangelow.getCode()));
		}
		/******************** Obsrvtn_VlRng_Lw_Sys ********************************************************************************/
		if(observationvaluerangelow.hasSystem()) {
			o.setObsrvtnVlRngLwSys(String.valueOf(observationvaluerangelow.getSystem()));
		}
		/******************** Obsrvtn_VlRng_Lw_Unt ********************************************************************************/
		if(observationvaluerangelow.hasUnit()) {
			o.setObsrvtnVlRngLwUnt(String.valueOf(observationvaluerangelow.getUnit()));
		}
		/******************** observationvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluerangehigh = observationvaluerange.getHigh();

		/******************** Obsrvtn_VlRng_Hi_Vl ********************************************************************************/
		if(observationvaluerangehigh.hasValue()) {
			o.setObsrvtnVlRngHiVl(String.valueOf(observationvaluerangehigh.getValue()));
		}
		/******************** observationvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluerangehighcomparator = observationvaluerangehigh.getComparator();
		o.setObsrvtnVlRngHiCmprtr(observationvaluerangehighcomparator.toCode());

		/******************** Obsrvtn_VlRng_Hi_Cd ********************************************************************************/
		if(observationvaluerangehigh.hasCode()) {
			o.setObsrvtnVlRngHiCd(String.valueOf(observationvaluerangehigh.getCode()));
		}
		/******************** Obsrvtn_VlRng_Hi_Sys ********************************************************************************/
		if(observationvaluerangehigh.hasSystem()) {
			o.setObsrvtnVlRngHiSys(String.valueOf(observationvaluerangehigh.getSystem()));
		}
		/******************** Obsrvtn_VlRng_Hi_Unt ********************************************************************************/
		if(observationvaluerangehigh.hasUnit()) {
			o.setObsrvtnVlRngHiUnt(String.valueOf(observationvaluerangehigh.getUnit()));
		}
		/******************** observationvalueratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio observationvalueratio = observation.getValueRatio();

		/******************** observationvaluerationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvaluerationumerator = observationvalueratio.getNumerator();

		/******************** Obsrvtn_VlRtio_Nmrtr_Vl ********************************************************************************/
		if(observationvaluerationumerator.hasValue()) {
			o.setObsrvtnVlRtioNmrtrVl(String.valueOf(observationvaluerationumerator.getValue()));
		}
		/******************** observationvaluerationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvaluerationumeratorcomparator = observationvaluerationumerator.getComparator();
		o.setObsrvtnVlRtioNmrtrCmprtr(observationvaluerationumeratorcomparator.toCode());

		/******************** Obsrvtn_VlRtio_Nmrtr_Cd ********************************************************************************/
		if(observationvaluerationumerator.hasCode()) {
			o.setObsrvtnVlRtioNmrtrCd(String.valueOf(observationvaluerationumerator.getCode()));
		}
		/******************** Obsrvtn_VlRtio_Nmrtr_Sys ********************************************************************************/
		if(observationvaluerationumerator.hasSystem()) {
			o.setObsrvtnVlRtioNmrtrSys(String.valueOf(observationvaluerationumerator.getSystem()));
		}
		/******************** Obsrvtn_VlRtio_Nmrtr_Unt ********************************************************************************/
		if(observationvaluerationumerator.hasUnit()) {
			o.setObsrvtnVlRtioNmrtrUnt(String.valueOf(observationvaluerationumerator.getUnit()));
		}
		/******************** observationvalueratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationvalueratiodenominator = observationvalueratio.getDenominator();

		/******************** Obsrvtn_VlRtio_Dnmntr_Vl ********************************************************************************/
		if(observationvalueratiodenominator.hasValue()) {
			o.setObsrvtnVlRtioDnmntrVl(String.valueOf(observationvalueratiodenominator.getValue()));
		}
		/******************** observationvalueratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationvalueratiodenominatorcomparator = observationvalueratiodenominator.getComparator();
		o.setObsrvtnVlRtioDnmntrCmprtr(observationvalueratiodenominatorcomparator.toCode());

		/******************** Obsrvtn_VlRtio_Dnmntr_Cd ********************************************************************************/
		if(observationvalueratiodenominator.hasCode()) {
			o.setObsrvtnVlRtioDnmntrCd(String.valueOf(observationvalueratiodenominator.getCode()));
		}
		/******************** Obsrvtn_VlRtio_Dnmntr_Sys ********************************************************************************/
		if(observationvalueratiodenominator.hasSystem()) {
			o.setObsrvtnVlRtioDnmntrSys(String.valueOf(observationvalueratiodenominator.getSystem()));
		}
		/******************** Obsrvtn_VlRtio_Dnmntr_Unt ********************************************************************************/
		if(observationvalueratiodenominator.hasUnit()) {
			o.setObsrvtnVlRtioDnmntrUnt(String.valueOf(observationvalueratiodenominator.getUnit()));
		}
		/******************** observationeffectivetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing observationeffectivetiming = observation.getEffectiveTiming();

		/******************** observationeffectivetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationeffectivetimingcode = observationeffectivetiming.getCode();

		/******************** observationeffectivetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationeffectivetimingcodecoding = observationeffectivetimingcode.getCodingFirstRep();

		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(observationeffectivetimingcodecoding.hasDisplay()) {
			o.setObsrvtnEfctiveTmgCdCdgDsply(String.valueOf(observationeffectivetimingcodecoding.getDisplay()));
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(observationeffectivetimingcodecoding.hasVersion()) {
			o.setObsrvtnEfctiveTmgCdCdgVrsn(String.valueOf(observationeffectivetimingcodecoding.getVersion()));
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Cd ********************************************************************************/
		if(observationeffectivetimingcodecoding.hasCode()) {
			o.setObsrvtnEfctiveTmgCdCdgCd(String.valueOf(observationeffectivetimingcodecoding.getCode()));
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_Sys ********************************************************************************/
		if(observationeffectivetimingcodecoding.hasSystem()) {
			o.setObsrvtnEfctiveTmgCdCdgSys(String.valueOf(observationeffectivetimingcodecoding.getSystem()));
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(observationeffectivetimingcodecoding.hasUserSelected()) {
			o.setObsrvtnEfctiveTmgCdCdgUsrSltd(String.valueOf(observationeffectivetimingcodecoding.getUserSelected()));
		}
		/******************** Obsrvtn_EfctiveTmg_Cd_Txt ********************************************************************************/
		if(observationeffectivetimingcode.hasText()) {
			o.setObsrvtnEfctiveTmgCdTxt(String.valueOf(observationeffectivetimingcode.getText()));
		}
		/******************** observationeffectivetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent observationeffectivetimingrepeat = observationeffectivetiming.getRepeat();

		/******************** Obsrvtn_EfctiveTmg_Rpt_Off ********************************************************************************/
		if(observationeffectivetimingrepeat.hasOffset()) {
			o.setObsrvtnEfctiveTmgRptOff(String.valueOf(observationeffectivetimingrepeat.getOffset()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Cnt ********************************************************************************/
		if(observationeffectivetimingrepeat.hasCount()) {
			o.setObsrvtnEfctiveTmgRptCnt(String.valueOf(observationeffectivetimingrepeat.getCount()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Frqncy ********************************************************************************/
		if(observationeffectivetimingrepeat.hasFrequency()) {
			o.setObsrvtnEfctiveTmgRptFrqncy(String.valueOf(observationeffectivetimingrepeat.getFrequency()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Prd ********************************************************************************/
		if(observationeffectivetimingrepeat.hasPeriod()) {
			o.setObsrvtnEfctiveTmgRptPrd(String.valueOf(observationeffectivetimingrepeat.getPeriod()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_Duration ********************************************************************************/
		if(observationeffectivetimingrepeat.hasDuration()) {
			o.setObsrvtnEfctiveTmgRptDuration(String.valueOf(observationeffectivetimingrepeat.getDuration()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_CntMx ********************************************************************************/
		if(observationeffectivetimingrepeat.hasCountMax()) {
			o.setObsrvtnEfctiveTmgRptCntMx(String.valueOf(observationeffectivetimingrepeat.getCountMax()));
		}
		/******************** observationeffectivetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration observationeffectivetimingrepeatboundsduration = observationeffectivetimingrepeat.getBoundsDuration();

		/******************** observationeffectivetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationeffectivetimingrepeatboundsperiod = observationeffectivetimingrepeat.getBoundsPeriod();

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(observationeffectivetimingrepeatboundsperiod.hasEnd()) {
			o.setObsrvtnEfctiveTmgRptBndsPrdEnd(String.valueOf(observationeffectivetimingrepeatboundsperiod.getEnd()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(observationeffectivetimingrepeatboundsperiod.hasStart()) {
			o.setObsrvtnEfctiveTmgRptBndsPrdStrt(String.valueOf(observationeffectivetimingrepeatboundsperiod.getStart()));
		}
		/******************** observationeffectivetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range observationeffectivetimingrepeatboundsrange = observationeffectivetimingrepeat.getBoundsRange();

		/******************** observationeffectivetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationeffectivetimingrepeatboundsrangelow = observationeffectivetimingrepeatboundsrange.getLow();

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangelow.hasValue()) {
			o.setObsrvtnEfctiveTmgRptBndsRngLwVl(String.valueOf(observationeffectivetimingrepeatboundsrangelow.getValue()));
		}
		/******************** observationeffectivetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationeffectivetimingrepeatboundsrangelowcomparator = observationeffectivetimingrepeatboundsrangelow.getComparator();
		o.setObsrvtnEfctiveTmgRptBndsRngLwCmprtr(observationeffectivetimingrepeatboundsrangelowcomparator.toCode());

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangelow.hasCode()) {
			o.setObsrvtnEfctiveTmgRptBndsRngLwCd(String.valueOf(observationeffectivetimingrepeatboundsrangelow.getCode()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangelow.hasSystem()) {
			o.setObsrvtnEfctiveTmgRptBndsRngLwSys(String.valueOf(observationeffectivetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangelow.hasUnit()) {
			o.setObsrvtnEfctiveTmgRptBndsRngLwUnt(String.valueOf(observationeffectivetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** observationeffectivetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity observationeffectivetimingrepeatboundsrangehigh = observationeffectivetimingrepeatboundsrange.getHigh();

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangehigh.hasValue()) {
			o.setObsrvtnEfctiveTmgRptBndsRngHiVl(String.valueOf(observationeffectivetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** observationeffectivetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator observationeffectivetimingrepeatboundsrangehighcomparator = observationeffectivetimingrepeatboundsrangehigh.getComparator();
		o.setObsrvtnEfctiveTmgRptBndsRngHiCmprtr(observationeffectivetimingrepeatboundsrangehighcomparator.toCode());

		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangehigh.hasCode()) {
			o.setObsrvtnEfctiveTmgRptBndsRngHiCd(String.valueOf(observationeffectivetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangehigh.hasSystem()) {
			o.setObsrvtnEfctiveTmgRptBndsRngHiSys(String.valueOf(observationeffectivetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(observationeffectivetimingrepeatboundsrangehigh.hasUnit()) {
			o.setObsrvtnEfctiveTmgRptBndsRngHiUnt(String.valueOf(observationeffectivetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_PrdMx ********************************************************************************/
		if(observationeffectivetimingrepeat.hasPeriodMax()) {
			o.setObsrvtnEfctiveTmgRptPrdMx(String.valueOf(observationeffectivetimingrepeat.getPeriodMax()));
		}
		/******************** Obsrvtn_EfctiveTmg_Rpt_FrqncyMx ********************************************************************************/
		if(observationeffectivetimingrepeat.hasFrequencyMax()) {
			o.setObsrvtnEfctiveTmgRptFrqncyMx(String.valueOf(observationeffectivetimingrepeat.getFrequencyMax()));
		}
		/******************** observationeffectivetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime observationeffectivetimingrepeatperiodunit = observationeffectivetimingrepeat.getPeriodUnit();
		o.setObsrvtnEfctiveTmgRptPrdUnt(observationeffectivetimingrepeatperiodunit.toCode());

		/******************** Obsrvtn_EfctiveTmg_Rpt_DurationMx ********************************************************************************/
		if(observationeffectivetimingrepeat.hasDurationMax()) {
			o.setObsrvtnEfctiveTmgRptDurationMx(String.valueOf(observationeffectivetimingrepeat.getDurationMax()));
		}
		/******************** observationeffectivetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime observationeffectivetimingrepeatdurationunit = observationeffectivetimingrepeat.getDurationUnit();
		o.setObsrvtnEfctiveTmgRptDurationUnt(observationeffectivetimingrepeatdurationunit.toCode());

		/******************** Obsrvtn_VlTimeTyp ********************************************************************************/
		if(observation.hasValueTimeType()) {
			o.setObsrvtnVlTimeTyp(String.valueOf(observation.getValueTimeType()));
		}
		/******************** observationvalueperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationvalueperiod = observation.getValuePeriod();

		/******************** Obsrvtn_VlPrd_End ********************************************************************************/
		if(observationvalueperiod.hasEnd()) {
			o.setObsrvtnVlPrdEnd(String.valueOf(observationvalueperiod.getEnd()));
		}
		/******************** Obsrvtn_VlPrd_Strt ********************************************************************************/
		if(observationvalueperiod.hasStart()) {
			o.setObsrvtnVlPrdStrt(String.valueOf(observationvalueperiod.getStart()));
		}
		/******************** Obsrvtn_PartOf ********************************************************************************/
		if(observation.hasPartOf()) {
			o.setObsrvtnPartOf(String.valueOf(observation.getPartOfFirstRep()));
		}
		/******************** Obsrvtn_Focus ********************************************************************************/
		if(observation.hasFocus()) {
			o.setObsrvtnFocus(String.valueOf(observation.getFocusFirstRep()));
		}
		/******************** observationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier observationidentifier = observation.getIdentifierFirstRep();

		/******************** Obsrvtn_Id_Vl ********************************************************************************/
		if(observationidentifier.hasValue()) {
			o.setObsrvtnIdVl(String.valueOf(observationidentifier.getValue()));
		}
		/******************** observationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept observationidentifiertype = observationidentifier.getType();

		/******************** observationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding observationidentifiertypecoding = observationidentifiertype.getCodingFirstRep();

		/******************** Obsrvtn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(observationidentifiertypecoding.hasDisplay()) {
			o.setObsrvtnIdTypCdgDsply(String.valueOf(observationidentifiertypecoding.getDisplay()));
		}
		/******************** Obsrvtn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(observationidentifiertypecoding.hasVersion()) {
			o.setObsrvtnIdTypCdgVrsn(String.valueOf(observationidentifiertypecoding.getVersion()));
		}
		/******************** Obsrvtn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(observationidentifiertypecoding.hasCode()) {
			o.setObsrvtnIdTypCdgCd(String.valueOf(observationidentifiertypecoding.getCode()));
		}
		/******************** Obsrvtn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(observationidentifiertypecoding.hasSystem()) {
			o.setObsrvtnIdTypCdgSys(String.valueOf(observationidentifiertypecoding.getSystem()));
		}
		/******************** Obsrvtn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(observationidentifiertypecoding.hasUserSelected()) {
			o.setObsrvtnIdTypCdgUsrSltd(String.valueOf(observationidentifiertypecoding.getUserSelected()));
		}
		/******************** Obsrvtn_Id_Typ_Txt ********************************************************************************/
		if(observationidentifiertype.hasText()) {
			o.setObsrvtnIdTypTxt(String.valueOf(observationidentifiertype.getText()));
		}
		/******************** Obsrvtn_Id_Sys ********************************************************************************/
		if(observationidentifier.hasSystem()) {
			o.setObsrvtnIdSys(String.valueOf(observationidentifier.getSystem()));
		}
		/******************** Obsrvtn_Id_Assigner ********************************************************************************/
		if(observationidentifier.hasAssigner()) {
			o.setObsrvtnIdAssigner(String.valueOf(observationidentifier.getAssigner()));
		}
		/******************** observationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationidentifierperiod = observationidentifier.getPeriod();

		/******************** Obsrvtn_Id_Prd_End ********************************************************************************/
		if(observationidentifierperiod.hasEnd()) {
			o.setObsrvtnIdPrdEnd(String.valueOf(observationidentifierperiod.getEnd()));
		}
		/******************** Obsrvtn_Id_Prd_Strt ********************************************************************************/
		if(observationidentifierperiod.hasStart()) {
			o.setObsrvtnIdPrdStrt(String.valueOf(observationidentifierperiod.getStart()));
		}
		/******************** observationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse observationidentifieruse = observationidentifier.getUse();
		o.setObsrvtnIdUse(observationidentifieruse.toCode());

		/******************** Obsrvtn_Issued ********************************************************************************/
		if(observation.hasIssued()) {
			o.setObsrvtnIssued(String.valueOf(observation.getIssued()));
		}
		/******************** observationeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period observationeffectiveperiod = observation.getEffectivePeriod();

		/******************** Obsrvtn_EfctivePrd_End ********************************************************************************/
		if(observationeffectiveperiod.hasEnd()) {
			o.setObsrvtnEfctivePrdEnd(String.valueOf(observationeffectiveperiod.getEnd()));
		}
		/******************** Obsrvtn_EfctivePrd_Strt ********************************************************************************/
		if(observationeffectiveperiod.hasStart()) {
			o.setObsrvtnEfctivePrdStrt(String.valueOf(observationeffectiveperiod.getStart()));
		}
		/******************** Obsrvtn_Spcmn ********************************************************************************/
		if(observation.hasSpecimen()) {
			o.setObsrvtnSpcmn(String.valueOf(observation.getSpecimen()));
		}
		/******************** Obsrvtn_DerivedFrom ********************************************************************************/
		if(observation.hasDerivedFrom()) {
			o.setObsrvtnDerivedFrom(String.valueOf(observation.getDerivedFromFirstRep()));
		}
		return o;
	}
}
