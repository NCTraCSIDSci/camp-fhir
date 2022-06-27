package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AllergyIntolerance;
public class AllergyIntoleranceConversion 
{
	public org.hl7.fhir.r4.model.AllergyIntolerance AllergyIntolerances(AllergyIntolerance a) throws ParseException
	{
		org.hl7.fhir.r4.model.AllergyIntolerance allergyintolerance = new org.hl7.fhir.r4.model.AllergyIntolerance();

		/******************** id ********************************************************************************/
		allergyintolerance.setId(a.getId());

		/******************** AlrgyIntolerance_Asserter ********************************************************************************/
		if(a.getAlrgyIntoleranceAsserter() != null) {
			allergyintolerance.setAsserter( new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntoleranceAsserter()));
		}
		/******************** allergyintolerancecategory ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCategoryEnumFactory allergyintolerancecategory =  new org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCategoryEnumFactory();
		allergyintolerance.addCategory(allergyintolerancecategory.fromCode(a.getAlrgyIntoleranceCtgry()));

		/******************** allergyintoleranceclinicalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintoleranceclinicalstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		allergyintolerance.setClinicalStatus(allergyintoleranceclinicalstatus);

		/******************** allergyintoleranceclinicalstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintoleranceclinicalstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		allergyintoleranceclinicalstatus.addCoding(allergyintoleranceclinicalstatuscoding);

		/******************** AlrgyIntolerance_ClnclSts_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgCd() != null) {
			allergyintoleranceclinicalstatuscoding.setCode(a.getAlrgyIntoleranceClnclStsCdgCd());
		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgDsply() != null) {
			allergyintoleranceclinicalstatuscoding.setDisplay(a.getAlrgyIntoleranceClnclStsCdgDsply());
		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgSys() != null) {
			allergyintoleranceclinicalstatuscoding.setSystem(a.getAlrgyIntoleranceClnclStsCdgSys());
		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgUsrSltd() != null) {
			allergyintoleranceclinicalstatuscoding.setUserSelected(Boolean.parseBoolean(a.getAlrgyIntoleranceClnclStsCdgUsrSltd()));
		}
		/******************** AlrgyIntolerance_ClnclSts_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsCdgVrsn() != null) {
			allergyintoleranceclinicalstatuscoding.setVersion(a.getAlrgyIntoleranceClnclStsCdgVrsn());
		}
		/******************** AlrgyIntolerance_ClnclSts_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceClnclStsTxt() != null) {
			allergyintoleranceclinicalstatus.setText(a.getAlrgyIntoleranceClnclStsTxt());
		}
		/******************** allergyintolerancecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		allergyintolerance.setCode(allergyintolerancecode);

		/******************** allergyintolerancecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintolerancecodecoding =  new org.hl7.fhir.r4.model.Coding();
		allergyintolerancecode.addCoding(allergyintolerancecodecoding);

		/******************** AlrgyIntolerance_Cd_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgCd() != null) {
			allergyintolerancecodecoding.setCode(a.getAlrgyIntoleranceCdCdgCd());
		}
		/******************** AlrgyIntolerance_Cd_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgDsply() != null) {
			allergyintolerancecodecoding.setDisplay(a.getAlrgyIntoleranceCdCdgDsply());
		}
		/******************** AlrgyIntolerance_Cd_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgSys() != null) {
			allergyintolerancecodecoding.setSystem(a.getAlrgyIntoleranceCdCdgSys());
		}
		/******************** AlrgyIntolerance_Cd_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgUsrSltd() != null) {
			allergyintolerancecodecoding.setUserSelected(Boolean.parseBoolean(a.getAlrgyIntoleranceCdCdgUsrSltd()));
		}
		/******************** AlrgyIntolerance_Cd_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceCdCdgVrsn() != null) {
			allergyintolerancecodecoding.setVersion(a.getAlrgyIntoleranceCdCdgVrsn());
		}
		/******************** AlrgyIntolerance_Cd_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceCdTxt() != null) {
			allergyintolerancecode.setText(a.getAlrgyIntoleranceCdTxt());
		}
		/******************** allergyintolerancecriticality ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCriticalityEnumFactory allergyintolerancecriticality =  new org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceCriticalityEnumFactory();
		allergyintolerance.setCriticality(allergyintolerancecriticality.fromCode(a.getAlrgyIntoleranceCriticality()));

		/******************** AlrgyIntolerance_Enc ********************************************************************************/
		if(a.getAlrgyIntoleranceEnc() != null) {
			allergyintolerance.setEncounter( new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntoleranceEnc()));
		}
		/******************** allergyintoleranceidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier allergyintoleranceidentifier =  new org.hl7.fhir.r4.model.Identifier();
		allergyintolerance.addIdentifier(allergyintoleranceidentifier);

		/******************** AlrgyIntolerance_Id_Assigner ********************************************************************************/
		if(a.getAlrgyIntoleranceIdAssigner() != null) {
			allergyintoleranceidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntoleranceIdAssigner()));
		}
		/******************** allergyintoleranceidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period allergyintoleranceidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		allergyintoleranceidentifier.setPeriod(allergyintoleranceidentifierperiod);

		/******************** AlrgyIntolerance_Id_Prd_End ********************************************************************************/
		if(a.getAlrgyIntoleranceIdPrdEnd() != null) {
			java.text.SimpleDateFormat AlrgyIntolerance_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AlrgyIntolerance_Id_Prd_Enddate = AlrgyIntolerance_Id_Prd_Endsdf.parse(a.getAlrgyIntoleranceIdPrdEnd());
			allergyintoleranceidentifierperiod.setEnd(AlrgyIntolerance_Id_Prd_Enddate);
		}
		/******************** AlrgyIntolerance_Id_Prd_Strt ********************************************************************************/
		if(a.getAlrgyIntoleranceIdPrdStrt() != null) {
			java.text.SimpleDateFormat AlrgyIntolerance_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AlrgyIntolerance_Id_Prd_Strtdate = AlrgyIntolerance_Id_Prd_Strtsdf.parse(a.getAlrgyIntoleranceIdPrdStrt());
			allergyintoleranceidentifierperiod.setStart(AlrgyIntolerance_Id_Prd_Strtdate);
		}
		/******************** AlrgyIntolerance_Id_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceIdSys() != null) {
			allergyintoleranceidentifier.setSystem(a.getAlrgyIntoleranceIdSys());
		}
		/******************** allergyintoleranceidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintoleranceidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		allergyintoleranceidentifier.setType(allergyintoleranceidentifiertype);

		/******************** allergyintoleranceidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintoleranceidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		allergyintoleranceidentifiertype.addCoding(allergyintoleranceidentifiertypecoding);

		/******************** AlrgyIntolerance_Id_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgCd() != null) {
			allergyintoleranceidentifiertypecoding.setCode(a.getAlrgyIntoleranceIdTypCdgCd());
		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgDsply() != null) {
			allergyintoleranceidentifiertypecoding.setDisplay(a.getAlrgyIntoleranceIdTypCdgDsply());
		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgSys() != null) {
			allergyintoleranceidentifiertypecoding.setSystem(a.getAlrgyIntoleranceIdTypCdgSys());
		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgUsrSltd() != null) {
			allergyintoleranceidentifiertypecoding.setUserSelected(Boolean.parseBoolean(a.getAlrgyIntoleranceIdTypCdgUsrSltd()));
		}
		/******************** AlrgyIntolerance_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypCdgVrsn() != null) {
			allergyintoleranceidentifiertypecoding.setVersion(a.getAlrgyIntoleranceIdTypCdgVrsn());
		}
		/******************** AlrgyIntolerance_Id_Typ_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceIdTypTxt() != null) {
			allergyintoleranceidentifiertype.setText(a.getAlrgyIntoleranceIdTypTxt());
		}
		/******************** allergyintoleranceidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory allergyintoleranceidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		allergyintoleranceidentifier.setUse(allergyintoleranceidentifieruse.fromCode(a.getAlrgyIntoleranceIdUse()));

		/******************** AlrgyIntolerance_Id_Vl ********************************************************************************/
		if(a.getAlrgyIntoleranceIdVl() != null) {
			allergyintoleranceidentifier.setValue(a.getAlrgyIntoleranceIdVl());
		}
		/******************** AlrgyIntolerance_LastOccrnce ********************************************************************************/
		if(a.getAlrgyIntoleranceLastOccrnce() != null) {
			java.text.SimpleDateFormat AlrgyIntolerance_LastOccrncesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AlrgyIntolerance_LastOccrncedate = AlrgyIntolerance_LastOccrncesdf.parse(a.getAlrgyIntoleranceLastOccrnce());
			allergyintolerance.setLastOccurrence(AlrgyIntolerance_LastOccrncedate);
		}
		/******************** allergyintolerancenote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation allergyintolerancenote =  new org.hl7.fhir.r4.model.Annotation();
		allergyintolerance.addNote(allergyintolerancenote);

		/******************** AlrgyIntolerance_Nt_AthrRfrnc ********************************************************************************/
		if(a.getAlrgyIntoleranceNtAthrRfrnc() != null) {
			allergyintolerancenote.setAuthor( new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntoleranceNtAthrRfrnc()));
		}
		/******************** AlrgyIntolerance_Nt_AthrStrgTyp ********************************************************************************/
		if(a.getAlrgyIntoleranceNtAthrStrgTyp() != null) {
			allergyintolerancenote.setAuthor( new org.hl7.fhir.r4.model.StringType(a.getAlrgyIntoleranceNtAthrStrgTyp()));
		}
		/******************** AlrgyIntolerance_Nt_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceNtTxt() != null) {
			allergyintolerancenote.setText(a.getAlrgyIntoleranceNtTxt());
		}
		/******************** AlrgyIntolerance_Nt_Time ********************************************************************************/
		if(a.getAlrgyIntoleranceNtTime() != null) {
			java.text.SimpleDateFormat AlrgyIntolerance_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AlrgyIntolerance_Nt_Timedate = AlrgyIntolerance_Nt_Timesdf.parse(a.getAlrgyIntoleranceNtTime());
			allergyintolerancenote.setTime(AlrgyIntolerance_Nt_Timedate);
		}
		/******************** allergyintoleranceonage ********************************************************************************/
		org.hl7.fhir.r4.model.Age allergyintoleranceonage =  new org.hl7.fhir.r4.model.Age();
		allergyintolerance.setOnset(allergyintoleranceonage);

		/******************** AlrgyIntolerance_OnAge_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceOnAgeCd() != null) {
			allergyintoleranceonage.setCode(a.getAlrgyIntoleranceOnAgeCd());
		}
		/******************** allergyintoleranceonagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory allergyintoleranceonagecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		allergyintoleranceonage.setComparator(allergyintoleranceonagecomparator.fromCode(a.getAlrgyIntoleranceOnAgeCmprtr()));

		/******************** AlrgyIntolerance_OnAge_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceOnAgeSys() != null) {
			allergyintoleranceonage.setSystem(a.getAlrgyIntoleranceOnAgeSys());
		}
		/******************** AlrgyIntolerance_OnAge_Unt ********************************************************************************/
		if(a.getAlrgyIntoleranceOnAgeUnt() != null) {
			allergyintoleranceonage.setUnit(a.getAlrgyIntoleranceOnAgeUnt());
		}
		/******************** AlrgyIntolerance_OnAge_Vl ********************************************************************************/
		if(a.getAlrgyIntoleranceOnAgeVl() != null) {
			allergyintoleranceonage.setValue(Double.parseDouble((a.getAlrgyIntoleranceOnAgeVl())));
		}
		/******************** AlrgyIntolerance_OnDtTimeTyp ********************************************************************************/
		if(a.getAlrgyIntoleranceOnDtTimeTyp() != null) {
			allergyintolerance.setOnset( new org.hl7.fhir.r4.model.DateTimeType(a.getAlrgyIntoleranceOnDtTimeTyp()));
		}
		/******************** allergyintoleranceonperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period allergyintoleranceonperiod =  new org.hl7.fhir.r4.model.Period();
		allergyintolerance.setOnset(allergyintoleranceonperiod);

		/******************** AlrgyIntolerance_OnPrd_End ********************************************************************************/
		if(a.getAlrgyIntoleranceOnPrdEnd() != null) {
			java.text.SimpleDateFormat AlrgyIntolerance_OnPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AlrgyIntolerance_OnPrd_Enddate = AlrgyIntolerance_OnPrd_Endsdf.parse(a.getAlrgyIntoleranceOnPrdEnd());
			allergyintoleranceonperiod.setEnd(AlrgyIntolerance_OnPrd_Enddate);
		}
		/******************** AlrgyIntolerance_OnPrd_Strt ********************************************************************************/
		if(a.getAlrgyIntoleranceOnPrdStrt() != null) {
			java.text.SimpleDateFormat AlrgyIntolerance_OnPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AlrgyIntolerance_OnPrd_Strtdate = AlrgyIntolerance_OnPrd_Strtsdf.parse(a.getAlrgyIntoleranceOnPrdStrt());
			allergyintoleranceonperiod.setStart(AlrgyIntolerance_OnPrd_Strtdate);
		}
		/******************** allergyintoleranceonrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range allergyintoleranceonrange =  new org.hl7.fhir.r4.model.Range();
		allergyintolerance.setOnset(allergyintoleranceonrange);

		/******************** allergyintoleranceonrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity allergyintoleranceonrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		allergyintoleranceonrange.setHigh(allergyintoleranceonrangehigh);

		/******************** AlrgyIntolerance_OnRng_Hi_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngHiCd() != null) {
			allergyintoleranceonrangehigh.setCode(a.getAlrgyIntoleranceOnRngHiCd());
		}
		/******************** allergyintoleranceonrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory allergyintoleranceonrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		allergyintoleranceonrangehigh.setComparator(allergyintoleranceonrangehighcomparator.fromCode(a.getAlrgyIntoleranceOnRngHiCmprtr()));

		/******************** AlrgyIntolerance_OnRng_Hi_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngHiSys() != null) {
			allergyintoleranceonrangehigh.setSystem(a.getAlrgyIntoleranceOnRngHiSys());
		}
		/******************** AlrgyIntolerance_OnRng_Hi_Unt ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngHiUnt() != null) {
			allergyintoleranceonrangehigh.setUnit(a.getAlrgyIntoleranceOnRngHiUnt());
		}
		/******************** AlrgyIntolerance_OnRng_Hi_Vl ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngHiVl() != null) {
			allergyintoleranceonrangehigh.setValue(Double.parseDouble((a.getAlrgyIntoleranceOnRngHiVl())));
		}
		/******************** allergyintoleranceonrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity allergyintoleranceonrangelow =  new org.hl7.fhir.r4.model.Quantity();
		allergyintoleranceonrange.setLow(allergyintoleranceonrangelow);

		/******************** AlrgyIntolerance_OnRng_Lw_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngLwCd() != null) {
			allergyintoleranceonrangelow.setCode(a.getAlrgyIntoleranceOnRngLwCd());
		}
		/******************** allergyintoleranceonrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory allergyintoleranceonrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		allergyintoleranceonrangelow.setComparator(allergyintoleranceonrangelowcomparator.fromCode(a.getAlrgyIntoleranceOnRngLwCmprtr()));

		/******************** AlrgyIntolerance_OnRng_Lw_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngLwSys() != null) {
			allergyintoleranceonrangelow.setSystem(a.getAlrgyIntoleranceOnRngLwSys());
		}
		/******************** AlrgyIntolerance_OnRng_Lw_Unt ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngLwUnt() != null) {
			allergyintoleranceonrangelow.setUnit(a.getAlrgyIntoleranceOnRngLwUnt());
		}
		/******************** AlrgyIntolerance_OnRng_Lw_Vl ********************************************************************************/
		if(a.getAlrgyIntoleranceOnRngLwVl() != null) {
			allergyintoleranceonrangelow.setValue(Double.parseDouble((a.getAlrgyIntoleranceOnRngLwVl())));
		}
		/******************** AlrgyIntolerance_OnStrgTyp ********************************************************************************/
		if(a.getAlrgyIntoleranceOnStrgTyp() != null) {
			allergyintolerance.setOnset( new org.hl7.fhir.r4.model.StringType(a.getAlrgyIntoleranceOnStrgTyp()));
		}
		/******************** AlrgyIntolerance_Pnt ********************************************************************************/
		if(a.getAlrgyIntolerancePnt() != null) {
			allergyintolerance.setPatient( new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntolerancePnt()));
		}
		/******************** allergyintolerancereaction ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceReactionComponent allergyintolerancereaction =  new org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceReactionComponent();
		allergyintolerance.addReaction(allergyintolerancereaction);

		/******************** AlrgyIntolerance_Reaction_Dscrptn ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionDscrptn() != null) {
			allergyintolerancereaction.setDescription(a.getAlrgyIntoleranceReactionDscrptn());
		}
		/******************** allergyintolerancereactionexposureroute ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancereactionexposureroute =  new org.hl7.fhir.r4.model.CodeableConcept();
		allergyintolerancereaction.setExposureRoute(allergyintolerancereactionexposureroute);

		/******************** allergyintolerancereactionexposureroutecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintolerancereactionexposureroutecoding =  new org.hl7.fhir.r4.model.Coding();
		allergyintolerancereactionexposureroute.addCoding(allergyintolerancereactionexposureroutecoding);

		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgCd() != null) {
			allergyintolerancereactionexposureroutecoding.setCode(a.getAlrgyIntoleranceReactionExposureRouteCdgCd());
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgDsply() != null) {
			allergyintolerancereactionexposureroutecoding.setDisplay(a.getAlrgyIntoleranceReactionExposureRouteCdgDsply());
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgSys() != null) {
			allergyintolerancereactionexposureroutecoding.setSystem(a.getAlrgyIntoleranceReactionExposureRouteCdgSys());
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgUsrSltd() != null) {
			allergyintolerancereactionexposureroutecoding.setUserSelected(Boolean.parseBoolean(a.getAlrgyIntoleranceReactionExposureRouteCdgUsrSltd()));
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteCdgVrsn() != null) {
			allergyintolerancereactionexposureroutecoding.setVersion(a.getAlrgyIntoleranceReactionExposureRouteCdgVrsn());
		}
		/******************** AlrgyIntolerance_Reaction_ExposureRoute_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionExposureRouteTxt() != null) {
			allergyintolerancereactionexposureroute.setText(a.getAlrgyIntoleranceReactionExposureRouteTxt());
		}
		/******************** allergyintolerancereactionmanifestation ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancereactionmanifestation =  new org.hl7.fhir.r4.model.CodeableConcept();
		allergyintolerancereaction.addManifestation(allergyintolerancereactionmanifestation);

		/******************** allergyintolerancereactionmanifestationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintolerancereactionmanifestationcoding =  new org.hl7.fhir.r4.model.Coding();
		allergyintolerancereactionmanifestation.addCoding(allergyintolerancereactionmanifestationcoding);

		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgCd() != null) {
			allergyintolerancereactionmanifestationcoding.setCode(a.getAlrgyIntoleranceReactionManifestationCdgCd());
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgDsply() != null) {
			allergyintolerancereactionmanifestationcoding.setDisplay(a.getAlrgyIntoleranceReactionManifestationCdgDsply());
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgSys() != null) {
			allergyintolerancereactionmanifestationcoding.setSystem(a.getAlrgyIntoleranceReactionManifestationCdgSys());
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgUsrSltd() != null) {
			allergyintolerancereactionmanifestationcoding.setUserSelected(Boolean.parseBoolean(a.getAlrgyIntoleranceReactionManifestationCdgUsrSltd()));
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationCdgVrsn() != null) {
			allergyintolerancereactionmanifestationcoding.setVersion(a.getAlrgyIntoleranceReactionManifestationCdgVrsn());
		}
		/******************** AlrgyIntolerance_Reaction_Manifestation_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionManifestationTxt() != null) {
			allergyintolerancereactionmanifestation.setText(a.getAlrgyIntoleranceReactionManifestationTxt());
		}
		/******************** allergyintolerancereactionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation allergyintolerancereactionnote =  new org.hl7.fhir.r4.model.Annotation();
		allergyintolerancereaction.addNote(allergyintolerancereactionnote);

		/******************** AlrgyIntolerance_Reaction_Nt_AthrRfrnc ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionNtAthrRfrnc() != null) {
			allergyintolerancereactionnote.setAuthor( new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntoleranceReactionNtAthrRfrnc()));
		}
		/******************** AlrgyIntolerance_Reaction_Nt_AthrStrgTyp ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionNtAthrStrgTyp() != null) {
			allergyintolerancereactionnote.setAuthor( new org.hl7.fhir.r4.model.StringType(a.getAlrgyIntoleranceReactionNtAthrStrgTyp()));
		}
		/******************** AlrgyIntolerance_Reaction_Nt_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionNtTxt() != null) {
			allergyintolerancereactionnote.setText(a.getAlrgyIntoleranceReactionNtTxt());
		}
		/******************** AlrgyIntolerance_Reaction_Nt_Time ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionNtTime() != null) {
			java.text.SimpleDateFormat AlrgyIntolerance_Reaction_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AlrgyIntolerance_Reaction_Nt_Timedate = AlrgyIntolerance_Reaction_Nt_Timesdf.parse(a.getAlrgyIntoleranceReactionNtTime());
			allergyintolerancereactionnote.setTime(AlrgyIntolerance_Reaction_Nt_Timedate);
		}
		/******************** AlrgyIntolerance_Reaction_On ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionOn() != null) {
			java.text.SimpleDateFormat AlrgyIntolerance_Reaction_Onsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AlrgyIntolerance_Reaction_Ondate = AlrgyIntolerance_Reaction_Onsdf.parse(a.getAlrgyIntoleranceReactionOn());
			allergyintolerancereaction.setOnset(AlrgyIntolerance_Reaction_Ondate);
		}
		/******************** allergyintolerancereactionseverity ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceSeverityEnumFactory allergyintolerancereactionseverity =  new org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceSeverityEnumFactory();
		allergyintolerancereaction.setSeverity(allergyintolerancereactionseverity.fromCode(a.getAlrgyIntoleranceReactionSeverity()));

		/******************** allergyintolerancereactionsubstance ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintolerancereactionsubstance =  new org.hl7.fhir.r4.model.CodeableConcept();
		allergyintolerancereaction.setSubstance(allergyintolerancereactionsubstance);

		/******************** allergyintolerancereactionsubstancecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintolerancereactionsubstancecoding =  new org.hl7.fhir.r4.model.Coding();
		allergyintolerancereactionsubstance.addCoding(allergyintolerancereactionsubstancecoding);

		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgCd() != null) {
			allergyintolerancereactionsubstancecoding.setCode(a.getAlrgyIntoleranceReactionSbstncCdgCd());
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgDsply() != null) {
			allergyintolerancereactionsubstancecoding.setDisplay(a.getAlrgyIntoleranceReactionSbstncCdgDsply());
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgSys() != null) {
			allergyintolerancereactionsubstancecoding.setSystem(a.getAlrgyIntoleranceReactionSbstncCdgSys());
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgUsrSltd() != null) {
			allergyintolerancereactionsubstancecoding.setUserSelected(Boolean.parseBoolean(a.getAlrgyIntoleranceReactionSbstncCdgUsrSltd()));
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncCdgVrsn() != null) {
			allergyintolerancereactionsubstancecoding.setVersion(a.getAlrgyIntoleranceReactionSbstncCdgVrsn());
		}
		/******************** AlrgyIntolerance_Reaction_Sbstnc_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceReactionSbstncTxt() != null) {
			allergyintolerancereactionsubstance.setText(a.getAlrgyIntoleranceReactionSbstncTxt());
		}
		/******************** AlrgyIntolerance_RecordedDt ********************************************************************************/
		if(a.getAlrgyIntoleranceRecordedDt() != null) {
			java.text.SimpleDateFormat AlrgyIntolerance_RecordedDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AlrgyIntolerance_RecordedDtdate = AlrgyIntolerance_RecordedDtsdf.parse(a.getAlrgyIntoleranceRecordedDt());
			allergyintolerance.setRecordedDate(AlrgyIntolerance_RecordedDtdate);
		}
		/******************** AlrgyIntolerance_Recorder ********************************************************************************/
		if(a.getAlrgyIntoleranceRecorder() != null) {
			allergyintolerance.setRecorder( new org.hl7.fhir.r4.model.Reference(a.getAlrgyIntoleranceRecorder()));
		}
		/******************** allergyintolerancetype ********************************************************************************/
		org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceTypeEnumFactory allergyintolerancetype =  new org.hl7.fhir.r4.model.AllergyIntolerance.AllergyIntoleranceTypeEnumFactory();
		allergyintolerance.setType(allergyintolerancetype.fromCode(a.getAlrgyIntoleranceTyp()));

		/******************** allergyintoleranceverificationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept allergyintoleranceverificationstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		allergyintolerance.setVerificationStatus(allergyintoleranceverificationstatus);

		/******************** allergyintoleranceverificationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding allergyintoleranceverificationstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		allergyintoleranceverificationstatus.addCoding(allergyintoleranceverificationstatuscoding);

		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Cd ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgCd() != null) {
			allergyintoleranceverificationstatuscoding.setCode(a.getAlrgyIntoleranceVrfctnStsCdgCd());
		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Dsply ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgDsply() != null) {
			allergyintoleranceverificationstatuscoding.setDisplay(a.getAlrgyIntoleranceVrfctnStsCdgDsply());
		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Sys ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgSys() != null) {
			allergyintoleranceverificationstatuscoding.setSystem(a.getAlrgyIntoleranceVrfctnStsCdgSys());
		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_UsrSltd ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgUsrSltd() != null) {
			allergyintoleranceverificationstatuscoding.setUserSelected(Boolean.parseBoolean(a.getAlrgyIntoleranceVrfctnStsCdgUsrSltd()));
		}
		/******************** AlrgyIntolerance_VrfctnSts_Cdg_Vrsn ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsCdgVrsn() != null) {
			allergyintoleranceverificationstatuscoding.setVersion(a.getAlrgyIntoleranceVrfctnStsCdgVrsn());
		}
		/******************** AlrgyIntolerance_VrfctnSts_Txt ********************************************************************************/
		if(a.getAlrgyIntoleranceVrfctnStsTxt() != null) {
			allergyintoleranceverificationstatus.setText(a.getAlrgyIntoleranceVrfctnStsTxt());
		}
		return allergyintolerance;
	}
}
