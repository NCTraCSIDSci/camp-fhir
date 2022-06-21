package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AllergyIntolerance;
public class AllergyIntoleranceBidirectionalConversion 
{
	public AllergyIntolerance AllergyIntolerances(org.hl7.fhir.r4.model.AllergyIntolerance allergyintolerance) throws ParseException
	{
		 main.java.com.campfhir.model.AllergyIntolerance a = new  main.java.com.campfhir.model.AllergyIntolerance();

		/******************** id ********************************************************************************/
		allergyintolerance.setId(a.getId());

		/******************** allergyintolerancetype ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceType allergyintolerancetype = allergyintolerance.getType();
		a.setAlrgyIntoleranceTyp(allergyintolerancetype.toCode());

		/******************** allergyintolerancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancecode = allergyintolerance.getCode();

		/******************** allergyintolerancecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintolerancecodecoding = allergyintolerancecode.getCodingFirstRep();

		/******************** AlrgyIntolerance_Cd_Cdg_Dsply ********************************************************************************/
		if(allergyintolerancecodecoding.hasDisplay()) {
			a.setAlrgyIntoleranceCdCdgDsply(String.valueOf(allergyintolerancecodecoding.getDisplay()));
		}
		/******************** AlrgyIntolerance_Cd_Cdg_Vrsn ********************************************************************************/
		if(allergyintolerancecodecoding.hasVersion()) {
			a.setAlrgyIntoleranceCdCdgVrsn(String.valueOf(allergyintolerancecodecoding.getVersion()));
		}
		/******************** AlrgyIntolerance_Cd_Cdg_Cd ********************************************************************************/
		if(allergyintolerancecodecoding.hasCode()) {
			a.setAlrgyIntoleranceCdCdgCd(String.valueOf(allergyintolerancecodecoding.getCode()));
		}
		/******************** AlrgyIntolerance_Cd_Cdg_Sys ********************************************************************************/
		if(allergyintolerancecodecoding.hasSystem()) {
			a.setAlrgyIntoleranceCdCdgSys(String.valueOf(allergyintolerancecodecoding.getSystem()));
		}
		/******************** AlrgyIntolerance_Cd_Cdg_UsrSltd ********************************************************************************/
		if(allergyintolerancecodecoding.hasUserSelected()) {
			a.setAlrgyIntoleranceCdCdgUsrSltd(String.valueOf(allergyintolerancecodecoding.getUserSelected()));
		}
		/******************** AlrgyIntolerance_Cd_Txt ********************************************************************************/
		if(allergyintolerancecode.hasText()) {
			a.setAlrgyIntoleranceCdTxt(String.valueOf(allergyintolerancecode.getText()));
		}
		/******************** allergyintolerancereaction ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceReactionComponent allergyintolerancereaction = allergyintolerance.getReactionFirstRep();

		/******************** AlrgyIntolerance_Reaction_Dscrptn ********************************************************************************/
		if(allergyintolerancereaction.hasDescription()) {
			a.setAlrgyIntoleranceReactionDscrptn(String.valueOf(allergyintolerancereaction.getDescription()));
		}
		/******************** allergyintolerancereactionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation allergyintolerancereactionnote = allergyintolerancereaction.getNoteFirstRep();

		/******************** AlrgyIntolerance_Reaction_Nt_Time ********************************************************************************/
		if(allergyintolerancereactionnote.hasTime()) {
			a.setAlrgyIntoleranceReactionNtTime(String.valueOf(allergyintolerancereactionnote.getTime()));
		}
		/******************** AlrgyIntolerance_Reaction_Nt_AthrRfrnc ********************************************************************************/
		if(allergyintolerancereactionnote.hasAuthorReference()) {
			a.setAlrgyIntoleranceReactionNtAthrRfrnc(String.valueOf(allergyintolerancereactionnote.getAuthorReference()));
		}
		/******************** AlrgyIntolerance_Reaction_Nt_Txt ********************************************************************************/
		if(allergyintolerancereactionnote.hasText()) {
			a.setAlrgyIntoleranceReactionNtTxt(String.valueOf(allergyintolerancereactionnote.getText()));
		}
		/******************** AlrgyIntolerance_Reaction_Nt_AthrStrgTyp ********************************************************************************/
		if(allergyintolerancereactionnote.hasAuthorStringType()) {
			a.setAlrgyIntoleranceReactionNtAthrStrgTyp(String.valueOf(allergyintolerancereactionnote.getAuthorStringType()));
		}
		/******************** AlrgyIntolerance_Reaction_On ********************************************************************************/
		if(allergyintolerancereaction.hasOnset()) {
			a.setAlrgyIntoleranceReactionOn(String.valueOf(allergyintolerancereaction.getOnset()));
		}
		/******************** allergyintolerancereactionseverity ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceSeverity allergyintolerancereactionseverity = allergyintolerancereaction.getSeverity();
		a.setAlrgyIntoleranceReactionSeverity(allergyintolerancereactionseverity.toCode());

		/******************** allergyintolerancereactionmanifestation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancereactionmanifestation = allergyintolerancereaction.getManifestationFirstRep();

		/******************** allergyintolerancereactionmanifestationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintolerancereactionmanifestationcoding = allergyintolerancereactionmanifestation.getCodingFirstRep();

		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Dsply ********************************************************************************/
		if(allergyintolerancereactionmanifestationcoding.hasDisplay()) {
			a.setAlrgyIntoleranceReactionManifestationCdgDsply(String.valueOf(allergyintolerancereactionmanifestationcoding.getDisplay()));
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Vrsn ********************************************************************************/
		if(allergyintolerancereactionmanifestationcoding.hasVersion()) {
			a.setAlrgyIntoleranceReactionManifestationCdgVrsn(String.valueOf(allergyintolerancereactionmanifestationcoding.getVersion()));
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Cd ********************************************************************************/
		if(allergyintolerancereactionmanifestationcoding.hasCode()) {
			a.setAlrgyIntoleranceReactionManifestationCdgCd(String.valueOf(allergyintolerancereactionmanifestationcoding.getCode()));
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Sys ********************************************************************************/
		if(allergyintolerancereactionmanifestationcoding.hasSystem()) {
			a.setAlrgyIntoleranceReactionManifestationCdgSys(String.valueOf(allergyintolerancereactionmanifestationcoding.getSystem()));
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_UsrSltd ********************************************************************************/
		if(allergyintolerancereactionmanifestationcoding.hasUserSelected()) {
			a.setAlrgyIntoleranceReactionManifestationCdgUsrSltd(String.valueOf(allergyintolerancereactionmanifestationcoding.getUserSelected()));
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Txt ********************************************************************************/
		if(allergyintolerancereactionmanifestation.hasText()) {
			a.setAlrgyIntoleranceReactionManifestationTxt(String.valueOf(allergyintolerancereactionmanifestation.getText()));
		}
		/******************** allergyintolerancereactionexposureroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancereactionexposureroute = allergyintolerancereaction.getExposureRoute();

		/******************** allergyintolerancereactionexposureroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintolerancereactionexposureroutecoding = allergyintolerancereactionexposureroute.getCodingFirstRep();

		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Dsply ********************************************************************************/
		if(allergyintolerancereactionexposureroutecoding.hasDisplay()) {
			a.setAlrgyIntoleranceReactionExposureRouteCdgDsply(String.valueOf(allergyintolerancereactionexposureroutecoding.getDisplay()));
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Vrsn ********************************************************************************/
		if(allergyintolerancereactionexposureroutecoding.hasVersion()) {
			a.setAlrgyIntoleranceReactionExposureRouteCdgVrsn(String.valueOf(allergyintolerancereactionexposureroutecoding.getVersion()));
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Cd ********************************************************************************/
		if(allergyintolerancereactionexposureroutecoding.hasCode()) {
			a.setAlrgyIntoleranceReactionExposureRouteCdgCd(String.valueOf(allergyintolerancereactionexposureroutecoding.getCode()));
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Sys ********************************************************************************/
		if(allergyintolerancereactionexposureroutecoding.hasSystem()) {
			a.setAlrgyIntoleranceReactionExposureRouteCdgSys(String.valueOf(allergyintolerancereactionexposureroutecoding.getSystem()));
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_UsrSltd ********************************************************************************/
		if(allergyintolerancereactionexposureroutecoding.hasUserSelected()) {
			a.setAlrgyIntoleranceReactionExposureRouteCdgUsrSltd(String.valueOf(allergyintolerancereactionexposureroutecoding.getUserSelected()));
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Txt ********************************************************************************/
		if(allergyintolerancereactionexposureroute.hasText()) {
			a.setAlrgyIntoleranceReactionExposureRouteTxt(String.valueOf(allergyintolerancereactionexposureroute.getText()));
		}
		/******************** allergyintolerancereactionsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancereactionsubstance = allergyintolerancereaction.getSubstance();

		/******************** allergyintolerancereactionsubstancecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintolerancereactionsubstancecoding = allergyintolerancereactionsubstance.getCodingFirstRep();

		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(allergyintolerancereactionsubstancecoding.hasDisplay()) {
			a.setAlrgyIntoleranceReactionSbstncCdgDsply(String.valueOf(allergyintolerancereactionsubstancecoding.getDisplay()));
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(allergyintolerancereactionsubstancecoding.hasVersion()) {
			a.setAlrgyIntoleranceReactionSbstncCdgVrsn(String.valueOf(allergyintolerancereactionsubstancecoding.getVersion()));
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Cd ********************************************************************************/
		if(allergyintolerancereactionsubstancecoding.hasCode()) {
			a.setAlrgyIntoleranceReactionSbstncCdgCd(String.valueOf(allergyintolerancereactionsubstancecoding.getCode()));
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Sys ********************************************************************************/
		if(allergyintolerancereactionsubstancecoding.hasSystem()) {
			a.setAlrgyIntoleranceReactionSbstncCdgSys(String.valueOf(allergyintolerancereactionsubstancecoding.getSystem()));
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(allergyintolerancereactionsubstancecoding.hasUserSelected()) {
			a.setAlrgyIntoleranceReactionSbstncCdgUsrSltd(String.valueOf(allergyintolerancereactionsubstancecoding.getUserSelected()));
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Txt ********************************************************************************/
		if(allergyintolerancereactionsubstance.hasText()) {
			a.setAlrgyIntoleranceReactionSbstncTxt(String.valueOf(allergyintolerancereactionsubstance.getText()));
		}
		/******************** AlrgyIntolerance_Enc ********************************************************************************/
		if(allergyintolerance.hasEncounter()) {
			a.setAlrgyIntoleranceEnc(String.valueOf(allergyintolerance.getEncounter()));
		}
		/******************** allergyintolerancenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation allergyintolerancenote = allergyintolerance.getNoteFirstRep();

		/******************** AlrgyIntolerance_Nt_Time ********************************************************************************/
		if(allergyintolerancenote.hasTime()) {
			a.setAlrgyIntoleranceNtTime(String.valueOf(allergyintolerancenote.getTime()));
		}
		/******************** AlrgyIntolerance_Nt_AthrRfrnc ********************************************************************************/
		if(allergyintolerancenote.hasAuthorReference()) {
			a.setAlrgyIntoleranceNtAthrRfrnc(String.valueOf(allergyintolerancenote.getAuthorReference()));
		}
		/******************** AlrgyIntolerance_Nt_Txt ********************************************************************************/
		if(allergyintolerancenote.hasText()) {
			a.setAlrgyIntoleranceNtTxt(String.valueOf(allergyintolerancenote.getText()));
		}
		/******************** AlrgyIntolerance_Nt_AthrStrgTyp ********************************************************************************/
		if(allergyintolerancenote.hasAuthorStringType()) {
			a.setAlrgyIntoleranceNtAthrStrgTyp(String.valueOf(allergyintolerancenote.getAuthorStringType()));
		}
		/******************** allergyintoleranceclinicalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintoleranceclinicalstatus = allergyintolerance.getClinicalStatus();

		/******************** allergyintoleranceclinicalstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintoleranceclinicalstatuscoding = allergyintoleranceclinicalstatus.getCodingFirstRep();

		/******************** AlrgyIntolerance_ClnclSts_Cdg_Dsply ********************************************************************************/
		if(allergyintoleranceclinicalstatuscoding.hasDisplay()) {
			a.setAlrgyIntoleranceClnclStsCdgDsply(String.valueOf(allergyintoleranceclinicalstatuscoding.getDisplay()));
		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Vrsn ********************************************************************************/
		if(allergyintoleranceclinicalstatuscoding.hasVersion()) {
			a.setAlrgyIntoleranceClnclStsCdgVrsn(String.valueOf(allergyintoleranceclinicalstatuscoding.getVersion()));
		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Cd ********************************************************************************/
		if(allergyintoleranceclinicalstatuscoding.hasCode()) {
			a.setAlrgyIntoleranceClnclStsCdgCd(String.valueOf(allergyintoleranceclinicalstatuscoding.getCode()));
		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Sys ********************************************************************************/
		if(allergyintoleranceclinicalstatuscoding.hasSystem()) {
			a.setAlrgyIntoleranceClnclStsCdgSys(String.valueOf(allergyintoleranceclinicalstatuscoding.getSystem()));
		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_UsrSltd ********************************************************************************/
		if(allergyintoleranceclinicalstatuscoding.hasUserSelected()) {
			a.setAlrgyIntoleranceClnclStsCdgUsrSltd(String.valueOf(allergyintoleranceclinicalstatuscoding.getUserSelected()));
		}
		/******************** AlrgyIntolerance_ClnclSts_Txt ********************************************************************************/
		if(allergyintoleranceclinicalstatus.hasText()) {
			a.setAlrgyIntoleranceClnclStsTxt(String.valueOf(allergyintoleranceclinicalstatus.getText()));
		}
		/******************** allergyintoleranceonrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range allergyintoleranceonrange = allergyintolerance.getOnsetRange();

		/******************** allergyintoleranceonrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity allergyintoleranceonrangelow = allergyintoleranceonrange.getLow();

		/******************** AlrgyIntolerance_OnRng_Lw_Vl ********************************************************************************/
		if(allergyintoleranceonrangelow.hasValue()) {
			a.setAlrgyIntoleranceOnRngLwVl(String.valueOf(allergyintoleranceonrangelow.getValue()));
		}
		/******************** allergyintoleranceonrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator allergyintoleranceonrangelowcomparator = allergyintoleranceonrangelow.getComparator();
		a.setAlrgyIntoleranceOnRngLwCmprtr(allergyintoleranceonrangelowcomparator.toCode());

		/******************** AlrgyIntolerance_OnRng_Lw_Cd ********************************************************************************/
		if(allergyintoleranceonrangelow.hasCode()) {
			a.setAlrgyIntoleranceOnRngLwCd(String.valueOf(allergyintoleranceonrangelow.getCode()));
		}
		/******************** AlrgyIntolerance_OnRng_Lw_Sys ********************************************************************************/
		if(allergyintoleranceonrangelow.hasSystem()) {
			a.setAlrgyIntoleranceOnRngLwSys(String.valueOf(allergyintoleranceonrangelow.getSystem()));
		}
		/******************** AlrgyIntolerance_OnRng_Lw_Unt ********************************************************************************/
		if(allergyintoleranceonrangelow.hasUnit()) {
			a.setAlrgyIntoleranceOnRngLwUnt(String.valueOf(allergyintoleranceonrangelow.getUnit()));
		}
		/******************** allergyintoleranceonrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity allergyintoleranceonrangehigh = allergyintoleranceonrange.getHigh();

		/******************** AlrgyIntolerance_OnRng_Hi_Vl ********************************************************************************/
		if(allergyintoleranceonrangehigh.hasValue()) {
			a.setAlrgyIntoleranceOnRngHiVl(String.valueOf(allergyintoleranceonrangehigh.getValue()));
		}
		/******************** allergyintoleranceonrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator allergyintoleranceonrangehighcomparator = allergyintoleranceonrangehigh.getComparator();
		a.setAlrgyIntoleranceOnRngHiCmprtr(allergyintoleranceonrangehighcomparator.toCode());

		/******************** AlrgyIntolerance_OnRng_Hi_Cd ********************************************************************************/
		if(allergyintoleranceonrangehigh.hasCode()) {
			a.setAlrgyIntoleranceOnRngHiCd(String.valueOf(allergyintoleranceonrangehigh.getCode()));
		}
		/******************** AlrgyIntolerance_OnRng_Hi_Sys ********************************************************************************/
		if(allergyintoleranceonrangehigh.hasSystem()) {
			a.setAlrgyIntoleranceOnRngHiSys(String.valueOf(allergyintoleranceonrangehigh.getSystem()));
		}
		/******************** AlrgyIntolerance_OnRng_Hi_Unt ********************************************************************************/
		if(allergyintoleranceonrangehigh.hasUnit()) {
			a.setAlrgyIntoleranceOnRngHiUnt(String.valueOf(allergyintoleranceonrangehigh.getUnit()));
		}
		/******************** allergyintoleranceonperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period allergyintoleranceonperiod = allergyintolerance.getOnsetPeriod();

		/******************** AlrgyIntolerance_OnPrd_End ********************************************************************************/
		if(allergyintoleranceonperiod.hasEnd()) {
			a.setAlrgyIntoleranceOnPrdEnd(String.valueOf(allergyintoleranceonperiod.getEnd()));
		}
		/******************** AlrgyIntolerance_OnPrd_Strt ********************************************************************************/
		if(allergyintoleranceonperiod.hasStart()) {
			a.setAlrgyIntoleranceOnPrdStrt(String.valueOf(allergyintoleranceonperiod.getStart()));
		}
		/******************** allergyintoleranceonage ********************************************************************************/
		org.hl7.fhir.r4.model.Age allergyintoleranceonage = allergyintolerance.getOnsetAge();

		/******************** AlrgyIntolerance_OnStrgTyp ********************************************************************************/
		if(allergyintolerance.hasOnsetStringType()) {
			a.setAlrgyIntoleranceOnStrgTyp(String.valueOf(allergyintolerance.getOnsetStringType()));
		}
		/******************** AlrgyIntolerance_Asserter ********************************************************************************/
		if(allergyintolerance.hasAsserter()) {
			a.setAlrgyIntoleranceAsserter(String.valueOf(allergyintolerance.getAsserter()));
		}
		/******************** AlrgyIntolerance_RecordedDt ********************************************************************************/
		if(allergyintolerance.hasRecordedDate()) {
			a.setAlrgyIntoleranceRecordedDt(String.valueOf(allergyintolerance.getRecordedDate()));
		}
		/******************** AlrgyIntolerance_Recorder ********************************************************************************/
		if(allergyintolerance.hasRecorder()) {
			a.setAlrgyIntoleranceRecorder(String.valueOf(allergyintolerance.getRecorder()));
		}
		/******************** AlrgyIntolerance_Pnt ********************************************************************************/
		if(allergyintolerance.hasPatient()) {
			a.setAlrgyIntolerancePnt(String.valueOf(allergyintolerance.getPatient()));
		}
		/******************** AlrgyIntolerance_OnDtTimeTyp ********************************************************************************/
		if(allergyintolerance.hasOnsetDateTimeType()) {
			a.setAlrgyIntoleranceOnDtTimeTyp(String.valueOf(allergyintolerance.getOnsetDateTimeType()));
		}
		/******************** allergyintoleranceverificationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintoleranceverificationstatus = allergyintolerance.getVerificationStatus();

		/******************** allergyintoleranceverificationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintoleranceverificationstatuscoding = allergyintoleranceverificationstatus.getCodingFirstRep();

		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Dsply ********************************************************************************/
		if(allergyintoleranceverificationstatuscoding.hasDisplay()) {
			a.setAlrgyIntoleranceVrfctnStsCdgDsply(String.valueOf(allergyintoleranceverificationstatuscoding.getDisplay()));
		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Vrsn ********************************************************************************/
		if(allergyintoleranceverificationstatuscoding.hasVersion()) {
			a.setAlrgyIntoleranceVrfctnStsCdgVrsn(String.valueOf(allergyintoleranceverificationstatuscoding.getVersion()));
		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Cd ********************************************************************************/
		if(allergyintoleranceverificationstatuscoding.hasCode()) {
			a.setAlrgyIntoleranceVrfctnStsCdgCd(String.valueOf(allergyintoleranceverificationstatuscoding.getCode()));
		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Sys ********************************************************************************/
		if(allergyintoleranceverificationstatuscoding.hasSystem()) {
			a.setAlrgyIntoleranceVrfctnStsCdgSys(String.valueOf(allergyintoleranceverificationstatuscoding.getSystem()));
		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_UsrSltd ********************************************************************************/
		if(allergyintoleranceverificationstatuscoding.hasUserSelected()) {
			a.setAlrgyIntoleranceVrfctnStsCdgUsrSltd(String.valueOf(allergyintoleranceverificationstatuscoding.getUserSelected()));
		}
		/******************** AlrgyIntolerance_VrfctnSts_Txt ********************************************************************************/
		if(allergyintoleranceverificationstatus.hasText()) {
			a.setAlrgyIntoleranceVrfctnStsTxt(String.valueOf(allergyintoleranceverificationstatus.getText()));
		}
		/******************** allergyintoleranceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier allergyintoleranceidentifier = allergyintolerance.getIdentifierFirstRep();

		/******************** AlrgyIntolerance_Id_Vl ********************************************************************************/
		if(allergyintoleranceidentifier.hasValue()) {
			a.setAlrgyIntoleranceIdVl(String.valueOf(allergyintoleranceidentifier.getValue()));
		}
		/******************** allergyintoleranceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintoleranceidentifiertype = allergyintoleranceidentifier.getType();

		/******************** allergyintoleranceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintoleranceidentifiertypecoding = allergyintoleranceidentifiertype.getCodingFirstRep();

		/******************** AlrgyIntolerance_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(allergyintoleranceidentifiertypecoding.hasDisplay()) {
			a.setAlrgyIntoleranceIdTypCdgDsply(String.valueOf(allergyintoleranceidentifiertypecoding.getDisplay()));
		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(allergyintoleranceidentifiertypecoding.hasVersion()) {
			a.setAlrgyIntoleranceIdTypCdgVrsn(String.valueOf(allergyintoleranceidentifiertypecoding.getVersion()));
		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Cd ********************************************************************************/
		if(allergyintoleranceidentifiertypecoding.hasCode()) {
			a.setAlrgyIntoleranceIdTypCdgCd(String.valueOf(allergyintoleranceidentifiertypecoding.getCode()));
		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Sys ********************************************************************************/
		if(allergyintoleranceidentifiertypecoding.hasSystem()) {
			a.setAlrgyIntoleranceIdTypCdgSys(String.valueOf(allergyintoleranceidentifiertypecoding.getSystem()));
		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(allergyintoleranceidentifiertypecoding.hasUserSelected()) {
			a.setAlrgyIntoleranceIdTypCdgUsrSltd(String.valueOf(allergyintoleranceidentifiertypecoding.getUserSelected()));
		}
		/******************** AlrgyIntolerance_Id_Typ_Txt ********************************************************************************/
		if(allergyintoleranceidentifiertype.hasText()) {
			a.setAlrgyIntoleranceIdTypTxt(String.valueOf(allergyintoleranceidentifiertype.getText()));
		}
		/******************** AlrgyIntolerance_Id_Sys ********************************************************************************/
		if(allergyintoleranceidentifier.hasSystem()) {
			a.setAlrgyIntoleranceIdSys(String.valueOf(allergyintoleranceidentifier.getSystem()));
		}
		/******************** AlrgyIntolerance_Id_Assigner ********************************************************************************/
		if(allergyintoleranceidentifier.hasAssigner()) {
			a.setAlrgyIntoleranceIdAssigner(String.valueOf(allergyintoleranceidentifier.getAssigner()));
		}
		/******************** allergyintoleranceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period allergyintoleranceidentifierperiod = allergyintoleranceidentifier.getPeriod();

		/******************** AlrgyIntolerance_Id_Prd_End ********************************************************************************/
		if(allergyintoleranceidentifierperiod.hasEnd()) {
			a.setAlrgyIntoleranceIdPrdEnd(String.valueOf(allergyintoleranceidentifierperiod.getEnd()));
		}
		/******************** AlrgyIntolerance_Id_Prd_Strt ********************************************************************************/
		if(allergyintoleranceidentifierperiod.hasStart()) {
			a.setAlrgyIntoleranceIdPrdStrt(String.valueOf(allergyintoleranceidentifierperiod.getStart()));
		}
		/******************** allergyintoleranceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse allergyintoleranceidentifieruse = allergyintoleranceidentifier.getUse();
		a.setAlrgyIntoleranceIdUse(allergyintoleranceidentifieruse.toCode());

		/******************** AlrgyIntolerance_LastOccrnce ********************************************************************************/
		if(allergyintolerance.hasLastOccurrence()) {
			a.setAlrgyIntoleranceLastOccrnce(String.valueOf(allergyintolerance.getLastOccurrence()));
		}
		/******************** allergyintolerancecriticality ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCriticality allergyintolerancecriticality = allergyintolerance.getCriticality();
		a.setAlrgyIntoleranceCriticality(allergyintolerancecriticality.toCode());

		return a;
	}
}
