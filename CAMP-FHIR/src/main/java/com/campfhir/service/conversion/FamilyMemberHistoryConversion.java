package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.FamilyMemberHistory;
public class FamilyMemberHistoryConversion 
{
	public org.hl7.fhir.r4.model.FamilyMemberHistory FamilyMemberHistorys(FamilyMemberHistory f) throws ParseException
	{
		org.hl7.fhir.r4.model.FamilyMemberHistory familymemberhistory = new org.hl7.fhir.r4.model.FamilyMemberHistory();

		/******************** id ********************************************************************************/
		familymemberhistory.setId(f.getId());

		/******************** familymemberhistoryageage ********************************************************************************/
		org.hl7.fhir.r4.model.Age familymemberhistoryageage =  new org.hl7.fhir.r4.model.Age();
		familymemberhistory.setAge(familymemberhistoryageage);

		/******************** FmlyMmbrHis_AgeAge_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisAgeAgeCd() != null) {
			familymemberhistoryageage.setCode(f.getFmlyMmbrHisAgeAgeCd());
		}
		/******************** familymemberhistoryageagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory familymemberhistoryageagecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		familymemberhistoryageage.setComparator(familymemberhistoryageagecomparator.fromCode(f.getFmlyMmbrHisAgeAgeCmprtr()));

		/******************** FmlyMmbrHis_AgeAge_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisAgeAgeSys() != null) {
			familymemberhistoryageage.setSystem(f.getFmlyMmbrHisAgeAgeSys());
		}
		/******************** FmlyMmbrHis_AgeAge_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisAgeAgeUnt() != null) {
			familymemberhistoryageage.setUnit(f.getFmlyMmbrHisAgeAgeUnt());
		}
		/******************** FmlyMmbrHis_AgeAge_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisAgeAgeVl() != null) {
			familymemberhistoryageage.setValue(Double.parseDouble((f.getFmlyMmbrHisAgeAgeVl())));
		}
		/******************** familymemberhistoryagerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range familymemberhistoryagerange =  new org.hl7.fhir.r4.model.Range();
		familymemberhistory.setAge(familymemberhistoryagerange);

		/******************** familymemberhistoryagerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryagerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		familymemberhistoryagerange.setHigh(familymemberhistoryagerangehigh);

		/******************** FmlyMmbrHis_AgeRng_Hi_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngHiCd() != null) {
			familymemberhistoryagerangehigh.setCode(f.getFmlyMmbrHisAgeRngHiCd());
		}
		/******************** familymemberhistoryagerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory familymemberhistoryagerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		familymemberhistoryagerangehigh.setComparator(familymemberhistoryagerangehighcomparator.fromCode(f.getFmlyMmbrHisAgeRngHiCmprtr()));

		/******************** FmlyMmbrHis_AgeRng_Hi_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngHiSys() != null) {
			familymemberhistoryagerangehigh.setSystem(f.getFmlyMmbrHisAgeRngHiSys());
		}
		/******************** FmlyMmbrHis_AgeRng_Hi_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngHiUnt() != null) {
			familymemberhistoryagerangehigh.setUnit(f.getFmlyMmbrHisAgeRngHiUnt());
		}
		/******************** FmlyMmbrHis_AgeRng_Hi_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngHiVl() != null) {
			familymemberhistoryagerangehigh.setValue(Double.parseDouble((f.getFmlyMmbrHisAgeRngHiVl())));
		}
		/******************** familymemberhistoryagerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryagerangelow =  new org.hl7.fhir.r4.model.Quantity();
		familymemberhistoryagerange.setLow(familymemberhistoryagerangelow);

		/******************** FmlyMmbrHis_AgeRng_Lw_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngLwCd() != null) {
			familymemberhistoryagerangelow.setCode(f.getFmlyMmbrHisAgeRngLwCd());
		}
		/******************** familymemberhistoryagerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory familymemberhistoryagerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		familymemberhistoryagerangelow.setComparator(familymemberhistoryagerangelowcomparator.fromCode(f.getFmlyMmbrHisAgeRngLwCmprtr()));

		/******************** FmlyMmbrHis_AgeRng_Lw_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngLwSys() != null) {
			familymemberhistoryagerangelow.setSystem(f.getFmlyMmbrHisAgeRngLwSys());
		}
		/******************** FmlyMmbrHis_AgeRng_Lw_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngLwUnt() != null) {
			familymemberhistoryagerangelow.setUnit(f.getFmlyMmbrHisAgeRngLwUnt());
		}
		/******************** FmlyMmbrHis_AgeRng_Lw_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisAgeRngLwVl() != null) {
			familymemberhistoryagerangelow.setValue(Double.parseDouble((f.getFmlyMmbrHisAgeRngLwVl())));
		}
		/******************** FmlyMmbrHis_AgeStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisAgeStrgTyp() != null) {
			familymemberhistory.setAge( new org.hl7.fhir.r4.model.StringType(f.getFmlyMmbrHisAgeStrgTyp()));
		}
		/******************** FmlyMmbrHis_BornDtTyp ********************************************************************************/
		if(f.getFmlyMmbrHisBornDtTyp() != null) {
			familymemberhistory.setBorn( new org.hl7.fhir.r4.model.DateType(f.getFmlyMmbrHisBornDtTyp()));
		}
		/******************** familymemberhistorybornperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period familymemberhistorybornperiod =  new org.hl7.fhir.r4.model.Period();
		familymemberhistory.setBorn(familymemberhistorybornperiod);

		/******************** FmlyMmbrHis_BornPrd_End ********************************************************************************/
		if(f.getFmlyMmbrHisBornPrdEnd() != null) {
			java.text.SimpleDateFormat FmlyMmbrHis_BornPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date FmlyMmbrHis_BornPrd_Enddate = FmlyMmbrHis_BornPrd_Endsdf.parse(f.getFmlyMmbrHisBornPrdEnd());
			familymemberhistorybornperiod.setEnd(FmlyMmbrHis_BornPrd_Enddate);
		}
		/******************** FmlyMmbrHis_BornPrd_Strt ********************************************************************************/
		if(f.getFmlyMmbrHisBornPrdStrt() != null) {
			java.text.SimpleDateFormat FmlyMmbrHis_BornPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date FmlyMmbrHis_BornPrd_Strtdate = FmlyMmbrHis_BornPrd_Strtsdf.parse(f.getFmlyMmbrHisBornPrdStrt());
			familymemberhistorybornperiod.setStart(FmlyMmbrHis_BornPrd_Strtdate);
		}
		/******************** FmlyMmbrHis_BornStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisBornStrgTyp() != null) {
			familymemberhistory.setBorn( new org.hl7.fhir.r4.model.StringType(f.getFmlyMmbrHisBornStrgTyp()));
		}
		/******************** familymemberhistorycondition ********************************************************************************/
		org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent familymemberhistorycondition =  new org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyMemberHistoryConditionComponent();
		familymemberhistory.addCondition(familymemberhistorycondition);

		/******************** familymemberhistoryconditioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryconditioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		familymemberhistorycondition.setCode(familymemberhistoryconditioncode);

		/******************** familymemberhistoryconditioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryconditioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		familymemberhistoryconditioncode.addCoding(familymemberhistoryconditioncodecoding);

		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgCd() != null) {
			familymemberhistoryconditioncodecoding.setCode(f.getFmlyMmbrHisCndtnCdCdgCd());
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgDsply() != null) {
			familymemberhistoryconditioncodecoding.setDisplay(f.getFmlyMmbrHisCndtnCdCdgDsply());
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgSys() != null) {
			familymemberhistoryconditioncodecoding.setSystem(f.getFmlyMmbrHisCndtnCdCdgSys());
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgUsrSltd() != null) {
			familymemberhistoryconditioncodecoding.setUserSelected(Boolean.parseBoolean(f.getFmlyMmbrHisCndtnCdCdgUsrSltd()));
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdCdgVrsn() != null) {
			familymemberhistoryconditioncodecoding.setVersion(f.getFmlyMmbrHisCndtnCdCdgVrsn());
		}
		/******************** FmlyMmbrHis_Cndtn_Cd_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnCdTxt() != null) {
			familymemberhistoryconditioncode.setText(f.getFmlyMmbrHisCndtnCdTxt());
		}
		/******************** FmlyMmbrHis_Cndtn_ContributedToDeath ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnContributedToDeath() != null) {
			familymemberhistorycondition.setContributedToDeath(Boolean.parseBoolean(f.getFmlyMmbrHisCndtnContributedToDeath()));
		}
		/******************** familymemberhistoryconditionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation familymemberhistoryconditionnote =  new org.hl7.fhir.r4.model.Annotation();
		familymemberhistorycondition.addNote(familymemberhistoryconditionnote);

		/******************** FmlyMmbrHis_Cndtn_Nt_AthrRfrnc ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnNtAthrRfrnc() != null) {
			familymemberhistoryconditionnote.setAuthor( new org.hl7.fhir.r4.model.Reference(f.getFmlyMmbrHisCndtnNtAthrRfrnc()));
		}
		/******************** FmlyMmbrHis_Cndtn_Nt_AthrStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnNtAthrStrgTyp() != null) {
			familymemberhistoryconditionnote.setAuthor( new org.hl7.fhir.r4.model.StringType(f.getFmlyMmbrHisCndtnNtAthrStrgTyp()));
		}
		/******************** FmlyMmbrHis_Cndtn_Nt_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnNtTxt() != null) {
			familymemberhistoryconditionnote.setText(f.getFmlyMmbrHisCndtnNtTxt());
		}
		/******************** FmlyMmbrHis_Cndtn_Nt_Time ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnNtTime() != null) {
			java.text.SimpleDateFormat FmlyMmbrHis_Cndtn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date FmlyMmbrHis_Cndtn_Nt_Timedate = FmlyMmbrHis_Cndtn_Nt_Timesdf.parse(f.getFmlyMmbrHisCndtnNtTime());
			familymemberhistoryconditionnote.setTime(FmlyMmbrHis_Cndtn_Nt_Timedate);
		}
		/******************** familymemberhistoryconditiononage ********************************************************************************/
		org.hl7.fhir.r4.model.Age familymemberhistoryconditiononage =  new org.hl7.fhir.r4.model.Age();
		familymemberhistorycondition.setOnset(familymemberhistoryconditiononage);

		/******************** FmlyMmbrHis_Cndtn_OnAge_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnAgeCd() != null) {
			familymemberhistoryconditiononage.setCode(f.getFmlyMmbrHisCndtnOnAgeCd());
		}
		/******************** familymemberhistoryconditiononagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory familymemberhistoryconditiononagecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		familymemberhistoryconditiononage.setComparator(familymemberhistoryconditiononagecomparator.fromCode(f.getFmlyMmbrHisCndtnOnAgeCmprtr()));

		/******************** FmlyMmbrHis_Cndtn_OnAge_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnAgeSys() != null) {
			familymemberhistoryconditiononage.setSystem(f.getFmlyMmbrHisCndtnOnAgeSys());
		}
		/******************** FmlyMmbrHis_Cndtn_OnAge_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnAgeUnt() != null) {
			familymemberhistoryconditiononage.setUnit(f.getFmlyMmbrHisCndtnOnAgeUnt());
		}
		/******************** FmlyMmbrHis_Cndtn_OnAge_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnAgeVl() != null) {
			familymemberhistoryconditiononage.setValue(Double.parseDouble((f.getFmlyMmbrHisCndtnOnAgeVl())));
		}
		/******************** familymemberhistoryconditiononperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period familymemberhistoryconditiononperiod =  new org.hl7.fhir.r4.model.Period();
		familymemberhistorycondition.setOnset(familymemberhistoryconditiononperiod);

		/******************** FmlyMmbrHis_Cndtn_OnPrd_End ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnPrdEnd() != null) {
			java.text.SimpleDateFormat FmlyMmbrHis_Cndtn_OnPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date FmlyMmbrHis_Cndtn_OnPrd_Enddate = FmlyMmbrHis_Cndtn_OnPrd_Endsdf.parse(f.getFmlyMmbrHisCndtnOnPrdEnd());
			familymemberhistoryconditiononperiod.setEnd(FmlyMmbrHis_Cndtn_OnPrd_Enddate);
		}
		/******************** FmlyMmbrHis_Cndtn_OnPrd_Strt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnPrdStrt() != null) {
			java.text.SimpleDateFormat FmlyMmbrHis_Cndtn_OnPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date FmlyMmbrHis_Cndtn_OnPrd_Strtdate = FmlyMmbrHis_Cndtn_OnPrd_Strtsdf.parse(f.getFmlyMmbrHisCndtnOnPrdStrt());
			familymemberhistoryconditiononperiod.setStart(FmlyMmbrHis_Cndtn_OnPrd_Strtdate);
		}
		/******************** familymemberhistoryconditiononrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range familymemberhistoryconditiononrange =  new org.hl7.fhir.r4.model.Range();
		familymemberhistorycondition.setOnset(familymemberhistoryconditiononrange);

		/******************** familymemberhistoryconditiononrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryconditiononrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		familymemberhistoryconditiononrange.setHigh(familymemberhistoryconditiononrangehigh);

		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngHiCd() != null) {
			familymemberhistoryconditiononrangehigh.setCode(f.getFmlyMmbrHisCndtnOnRngHiCd());
		}
		/******************** familymemberhistoryconditiononrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory familymemberhistoryconditiononrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		familymemberhistoryconditiononrangehigh.setComparator(familymemberhistoryconditiononrangehighcomparator.fromCode(f.getFmlyMmbrHisCndtnOnRngHiCmprtr()));

		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngHiSys() != null) {
			familymemberhistoryconditiononrangehigh.setSystem(f.getFmlyMmbrHisCndtnOnRngHiSys());
		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngHiUnt() != null) {
			familymemberhistoryconditiononrangehigh.setUnit(f.getFmlyMmbrHisCndtnOnRngHiUnt());
		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Hi_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngHiVl() != null) {
			familymemberhistoryconditiononrangehigh.setValue(Double.parseDouble((f.getFmlyMmbrHisCndtnOnRngHiVl())));
		}
		/******************** familymemberhistoryconditiononrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistoryconditiononrangelow =  new org.hl7.fhir.r4.model.Quantity();
		familymemberhistoryconditiononrange.setLow(familymemberhistoryconditiononrangelow);

		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngLwCd() != null) {
			familymemberhistoryconditiononrangelow.setCode(f.getFmlyMmbrHisCndtnOnRngLwCd());
		}
		/******************** familymemberhistoryconditiononrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory familymemberhistoryconditiononrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		familymemberhistoryconditiononrangelow.setComparator(familymemberhistoryconditiononrangelowcomparator.fromCode(f.getFmlyMmbrHisCndtnOnRngLwCmprtr()));

		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngLwSys() != null) {
			familymemberhistoryconditiononrangelow.setSystem(f.getFmlyMmbrHisCndtnOnRngLwSys());
		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngLwUnt() != null) {
			familymemberhistoryconditiononrangelow.setUnit(f.getFmlyMmbrHisCndtnOnRngLwUnt());
		}
		/******************** FmlyMmbrHis_Cndtn_OnRng_Lw_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnRngLwVl() != null) {
			familymemberhistoryconditiononrangelow.setValue(Double.parseDouble((f.getFmlyMmbrHisCndtnOnRngLwVl())));
		}
		/******************** FmlyMmbrHis_Cndtn_OnStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOnStrgTyp() != null) {
			familymemberhistorycondition.setOnset( new org.hl7.fhir.r4.model.StringType(f.getFmlyMmbrHisCndtnOnStrgTyp()));
		}
		/******************** familymemberhistoryconditionoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryconditionoutcome =  new org.hl7.fhir.r4.model.CodeableConcept();
		familymemberhistorycondition.setOutcome(familymemberhistoryconditionoutcome);

		/******************** familymemberhistoryconditionoutcomecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryconditionoutcomecoding =  new org.hl7.fhir.r4.model.Coding();
		familymemberhistoryconditionoutcome.addCoding(familymemberhistoryconditionoutcomecoding);

		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgCd() != null) {
			familymemberhistoryconditionoutcomecoding.setCode(f.getFmlyMmbrHisCndtnOutcomeCdgCd());
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgDsply() != null) {
			familymemberhistoryconditionoutcomecoding.setDisplay(f.getFmlyMmbrHisCndtnOutcomeCdgDsply());
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgSys() != null) {
			familymemberhistoryconditionoutcomecoding.setSystem(f.getFmlyMmbrHisCndtnOutcomeCdgSys());
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgUsrSltd() != null) {
			familymemberhistoryconditionoutcomecoding.setUserSelected(Boolean.parseBoolean(f.getFmlyMmbrHisCndtnOutcomeCdgUsrSltd()));
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeCdgVrsn() != null) {
			familymemberhistoryconditionoutcomecoding.setVersion(f.getFmlyMmbrHisCndtnOutcomeCdgVrsn());
		}
		/******************** FmlyMmbrHis_Cndtn_Outcome_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisCndtnOutcomeTxt() != null) {
			familymemberhistoryconditionoutcome.setText(f.getFmlyMmbrHisCndtnOutcomeTxt());
		}
		/******************** familymemberhistorydataabsentreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistorydataabsentreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		familymemberhistory.setDataAbsentReason(familymemberhistorydataabsentreason);

		/******************** familymemberhistorydataabsentreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistorydataabsentreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		familymemberhistorydataabsentreason.addCoding(familymemberhistorydataabsentreasoncoding);

		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgCd() != null) {
			familymemberhistorydataabsentreasoncoding.setCode(f.getFmlyMmbrHisDataAbsentRsnCdgCd());
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgDsply() != null) {
			familymemberhistorydataabsentreasoncoding.setDisplay(f.getFmlyMmbrHisDataAbsentRsnCdgDsply());
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgSys() != null) {
			familymemberhistorydataabsentreasoncoding.setSystem(f.getFmlyMmbrHisDataAbsentRsnCdgSys());
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgUsrSltd() != null) {
			familymemberhistorydataabsentreasoncoding.setUserSelected(Boolean.parseBoolean(f.getFmlyMmbrHisDataAbsentRsnCdgUsrSltd()));
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnCdgVrsn() != null) {
			familymemberhistorydataabsentreasoncoding.setVersion(f.getFmlyMmbrHisDataAbsentRsnCdgVrsn());
		}
		/******************** FmlyMmbrHis_DataAbsentRsn_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisDataAbsentRsnTxt() != null) {
			familymemberhistorydataabsentreason.setText(f.getFmlyMmbrHisDataAbsentRsnTxt());
		}
		/******************** FmlyMmbrHis_Dt ********************************************************************************/
		if(f.getFmlyMmbrHisDt() != null) {
			java.text.SimpleDateFormat FmlyMmbrHis_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date FmlyMmbrHis_Dtdate = FmlyMmbrHis_Dtsdf.parse(f.getFmlyMmbrHisDt());
			familymemberhistory.setDate(FmlyMmbrHis_Dtdate);
		}
		/******************** familymemberhistorydeceasedage ********************************************************************************/
		org.hl7.fhir.r4.model.Age familymemberhistorydeceasedage =  new org.hl7.fhir.r4.model.Age();
		familymemberhistory.setDeceased(familymemberhistorydeceasedage);

		/******************** FmlyMmbrHis_DeceasedAge_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedAgeCd() != null) {
			familymemberhistorydeceasedage.setCode(f.getFmlyMmbrHisDeceasedAgeCd());
		}
		/******************** familymemberhistorydeceasedagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory familymemberhistorydeceasedagecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		familymemberhistorydeceasedage.setComparator(familymemberhistorydeceasedagecomparator.fromCode(f.getFmlyMmbrHisDeceasedAgeCmprtr()));

		/******************** FmlyMmbrHis_DeceasedAge_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedAgeSys() != null) {
			familymemberhistorydeceasedage.setSystem(f.getFmlyMmbrHisDeceasedAgeSys());
		}
		/******************** FmlyMmbrHis_DeceasedAge_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedAgeUnt() != null) {
			familymemberhistorydeceasedage.setUnit(f.getFmlyMmbrHisDeceasedAgeUnt());
		}
		/******************** FmlyMmbrHis_DeceasedAge_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedAgeVl() != null) {
			familymemberhistorydeceasedage.setValue(Double.parseDouble((f.getFmlyMmbrHisDeceasedAgeVl())));
		}
		/******************** FmlyMmbrHis_DeceasedBooleanTyp ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedBooleanTyp() != null) {
			familymemberhistory.setDeceased( new org.hl7.fhir.r4.model.BooleanType(f.getFmlyMmbrHisDeceasedBooleanTyp()));
		}
		/******************** FmlyMmbrHis_DeceasedDtTyp ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedDtTyp() != null) {
			familymemberhistory.setDeceased( new org.hl7.fhir.r4.model.DateType(f.getFmlyMmbrHisDeceasedDtTyp()));
		}
		/******************** familymemberhistorydeceasedrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range familymemberhistorydeceasedrange =  new org.hl7.fhir.r4.model.Range();
		familymemberhistory.setDeceased(familymemberhistorydeceasedrange);

		/******************** familymemberhistorydeceasedrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistorydeceasedrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		familymemberhistorydeceasedrange.setHigh(familymemberhistorydeceasedrangehigh);

		/******************** FmlyMmbrHis_DeceasedRng_Hi_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngHiCd() != null) {
			familymemberhistorydeceasedrangehigh.setCode(f.getFmlyMmbrHisDeceasedRngHiCd());
		}
		/******************** familymemberhistorydeceasedrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory familymemberhistorydeceasedrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		familymemberhistorydeceasedrangehigh.setComparator(familymemberhistorydeceasedrangehighcomparator.fromCode(f.getFmlyMmbrHisDeceasedRngHiCmprtr()));

		/******************** FmlyMmbrHis_DeceasedRng_Hi_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngHiSys() != null) {
			familymemberhistorydeceasedrangehigh.setSystem(f.getFmlyMmbrHisDeceasedRngHiSys());
		}
		/******************** FmlyMmbrHis_DeceasedRng_Hi_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngHiUnt() != null) {
			familymemberhistorydeceasedrangehigh.setUnit(f.getFmlyMmbrHisDeceasedRngHiUnt());
		}
		/******************** FmlyMmbrHis_DeceasedRng_Hi_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngHiVl() != null) {
			familymemberhistorydeceasedrangehigh.setValue(Double.parseDouble((f.getFmlyMmbrHisDeceasedRngHiVl())));
		}
		/******************** familymemberhistorydeceasedrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity familymemberhistorydeceasedrangelow =  new org.hl7.fhir.r4.model.Quantity();
		familymemberhistorydeceasedrange.setLow(familymemberhistorydeceasedrangelow);

		/******************** FmlyMmbrHis_DeceasedRng_Lw_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngLwCd() != null) {
			familymemberhistorydeceasedrangelow.setCode(f.getFmlyMmbrHisDeceasedRngLwCd());
		}
		/******************** familymemberhistorydeceasedrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory familymemberhistorydeceasedrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		familymemberhistorydeceasedrangelow.setComparator(familymemberhistorydeceasedrangelowcomparator.fromCode(f.getFmlyMmbrHisDeceasedRngLwCmprtr()));

		/******************** FmlyMmbrHis_DeceasedRng_Lw_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngLwSys() != null) {
			familymemberhistorydeceasedrangelow.setSystem(f.getFmlyMmbrHisDeceasedRngLwSys());
		}
		/******************** FmlyMmbrHis_DeceasedRng_Lw_Unt ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngLwUnt() != null) {
			familymemberhistorydeceasedrangelow.setUnit(f.getFmlyMmbrHisDeceasedRngLwUnt());
		}
		/******************** FmlyMmbrHis_DeceasedRng_Lw_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedRngLwVl() != null) {
			familymemberhistorydeceasedrangelow.setValue(Double.parseDouble((f.getFmlyMmbrHisDeceasedRngLwVl())));
		}
		/******************** FmlyMmbrHis_DeceasedStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisDeceasedStrgTyp() != null) {
			familymemberhistory.setDeceased( new org.hl7.fhir.r4.model.StringType(f.getFmlyMmbrHisDeceasedStrgTyp()));
		}
		/******************** FmlyMmbrHis_EstmtdAge ********************************************************************************/
		if(f.getFmlyMmbrHisEstmtdAge() != null) {
			familymemberhistory.setEstimatedAge(Boolean.parseBoolean(f.getFmlyMmbrHisEstmtdAge()));
		}
		/******************** familymemberhistoryidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier familymemberhistoryidentifier =  new org.hl7.fhir.r4.model.Identifier();
		familymemberhistory.addIdentifier(familymemberhistoryidentifier);

		/******************** FmlyMmbrHis_Id_Assigner ********************************************************************************/
		if(f.getFmlyMmbrHisIdAssigner() != null) {
			familymemberhistoryidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(f.getFmlyMmbrHisIdAssigner()));
		}
		/******************** familymemberhistoryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period familymemberhistoryidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		familymemberhistoryidentifier.setPeriod(familymemberhistoryidentifierperiod);

		/******************** FmlyMmbrHis_Id_Prd_End ********************************************************************************/
		if(f.getFmlyMmbrHisIdPrdEnd() != null) {
			java.text.SimpleDateFormat FmlyMmbrHis_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date FmlyMmbrHis_Id_Prd_Enddate = FmlyMmbrHis_Id_Prd_Endsdf.parse(f.getFmlyMmbrHisIdPrdEnd());
			familymemberhistoryidentifierperiod.setEnd(FmlyMmbrHis_Id_Prd_Enddate);
		}
		/******************** FmlyMmbrHis_Id_Prd_Strt ********************************************************************************/
		if(f.getFmlyMmbrHisIdPrdStrt() != null) {
			java.text.SimpleDateFormat FmlyMmbrHis_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date FmlyMmbrHis_Id_Prd_Strtdate = FmlyMmbrHis_Id_Prd_Strtsdf.parse(f.getFmlyMmbrHisIdPrdStrt());
			familymemberhistoryidentifierperiod.setStart(FmlyMmbrHis_Id_Prd_Strtdate);
		}
		/******************** FmlyMmbrHis_Id_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisIdSys() != null) {
			familymemberhistoryidentifier.setSystem(f.getFmlyMmbrHisIdSys());
		}
		/******************** familymemberhistoryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		familymemberhistoryidentifier.setType(familymemberhistoryidentifiertype);

		/******************** familymemberhistoryidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		familymemberhistoryidentifiertype.addCoding(familymemberhistoryidentifiertypecoding);

		/******************** FmlyMmbrHis_Id_Typ_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgCd() != null) {
			familymemberhistoryidentifiertypecoding.setCode(f.getFmlyMmbrHisIdTypCdgCd());
		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgDsply() != null) {
			familymemberhistoryidentifiertypecoding.setDisplay(f.getFmlyMmbrHisIdTypCdgDsply());
		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgSys() != null) {
			familymemberhistoryidentifiertypecoding.setSystem(f.getFmlyMmbrHisIdTypCdgSys());
		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgUsrSltd() != null) {
			familymemberhistoryidentifiertypecoding.setUserSelected(Boolean.parseBoolean(f.getFmlyMmbrHisIdTypCdgUsrSltd()));
		}
		/******************** FmlyMmbrHis_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypCdgVrsn() != null) {
			familymemberhistoryidentifiertypecoding.setVersion(f.getFmlyMmbrHisIdTypCdgVrsn());
		}
		/******************** FmlyMmbrHis_Id_Typ_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisIdTypTxt() != null) {
			familymemberhistoryidentifiertype.setText(f.getFmlyMmbrHisIdTypTxt());
		}
		/******************** familymemberhistoryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory familymemberhistoryidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		familymemberhistoryidentifier.setUse(familymemberhistoryidentifieruse.fromCode(f.getFmlyMmbrHisIdUse()));

		/******************** FmlyMmbrHis_Id_Vl ********************************************************************************/
		if(f.getFmlyMmbrHisIdVl() != null) {
			familymemberhistoryidentifier.setValue(f.getFmlyMmbrHisIdVl());
		}
		/******************** FmlyMmbrHis_InstantiatesCanonical ********************************************************************************/
		if(f.getFmlyMmbrHisInstantiatesCanonical() != null) {
			familymemberhistory.addInstantiatesCanonical(f.getFmlyMmbrHisInstantiatesCanonical());
		}
		/******************** FmlyMmbrHis_InstantiatesUri ********************************************************************************/
		if(f.getFmlyMmbrHisInstantiatesUri() != null) {
			familymemberhistory.addInstantiatesUri(f.getFmlyMmbrHisInstantiatesUri());
		}
		/******************** FmlyMmbrHis_Nm ********************************************************************************/
		if(f.getFmlyMmbrHisNm() != null) {
			familymemberhistory.setName(f.getFmlyMmbrHisNm());
		}
		/******************** familymemberhistorynote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation familymemberhistorynote =  new org.hl7.fhir.r4.model.Annotation();
		familymemberhistory.addNote(familymemberhistorynote);

		/******************** FmlyMmbrHis_Nt_AthrRfrnc ********************************************************************************/
		if(f.getFmlyMmbrHisNtAthrRfrnc() != null) {
			familymemberhistorynote.setAuthor( new org.hl7.fhir.r4.model.Reference(f.getFmlyMmbrHisNtAthrRfrnc()));
		}
		/******************** FmlyMmbrHis_Nt_AthrStrgTyp ********************************************************************************/
		if(f.getFmlyMmbrHisNtAthrStrgTyp() != null) {
			familymemberhistorynote.setAuthor( new org.hl7.fhir.r4.model.StringType(f.getFmlyMmbrHisNtAthrStrgTyp()));
		}
		/******************** FmlyMmbrHis_Nt_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisNtTxt() != null) {
			familymemberhistorynote.setText(f.getFmlyMmbrHisNtTxt());
		}
		/******************** FmlyMmbrHis_Nt_Time ********************************************************************************/
		if(f.getFmlyMmbrHisNtTime() != null) {
			java.text.SimpleDateFormat FmlyMmbrHis_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date FmlyMmbrHis_Nt_Timedate = FmlyMmbrHis_Nt_Timesdf.parse(f.getFmlyMmbrHisNtTime());
			familymemberhistorynote.setTime(FmlyMmbrHis_Nt_Timedate);
		}
		/******************** FmlyMmbrHis_Pnt ********************************************************************************/
		if(f.getFmlyMmbrHisPnt() != null) {
			familymemberhistory.setPatient( new org.hl7.fhir.r4.model.Reference(f.getFmlyMmbrHisPnt()));
		}
		/******************** familymemberhistoryreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		familymemberhistory.addReasonCode(familymemberhistoryreasoncode);

		/******************** familymemberhistoryreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		familymemberhistoryreasoncode.addCoding(familymemberhistoryreasoncodecoding);

		/******************** FmlyMmbrHis_RsnCd_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgCd() != null) {
			familymemberhistoryreasoncodecoding.setCode(f.getFmlyMmbrHisRsnCdCdgCd());
		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgDsply() != null) {
			familymemberhistoryreasoncodecoding.setDisplay(f.getFmlyMmbrHisRsnCdCdgDsply());
		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgSys() != null) {
			familymemberhistoryreasoncodecoding.setSystem(f.getFmlyMmbrHisRsnCdCdgSys());
		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgUsrSltd() != null) {
			familymemberhistoryreasoncodecoding.setUserSelected(Boolean.parseBoolean(f.getFmlyMmbrHisRsnCdCdgUsrSltd()));
		}
		/******************** FmlyMmbrHis_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdCdgVrsn() != null) {
			familymemberhistoryreasoncodecoding.setVersion(f.getFmlyMmbrHisRsnCdCdgVrsn());
		}
		/******************** FmlyMmbrHis_RsnCd_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisRsnCdTxt() != null) {
			familymemberhistoryreasoncode.setText(f.getFmlyMmbrHisRsnCdTxt());
		}
		/******************** FmlyMmbrHis_RsnRfrnc ********************************************************************************/
		if(f.getFmlyMmbrHisRsnRfrnc() != null) {
			familymemberhistory.addReasonReference( new org.hl7.fhir.r4.model.Reference(f.getFmlyMmbrHisRsnRfrnc()));
		}
		/******************** familymemberhistoryrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistoryrelationship =  new org.hl7.fhir.r4.model.CodeableConcept();
		familymemberhistory.setRelationship(familymemberhistoryrelationship);

		/******************** familymemberhistoryrelationshipcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistoryrelationshipcoding =  new org.hl7.fhir.r4.model.Coding();
		familymemberhistoryrelationship.addCoding(familymemberhistoryrelationshipcoding);

		/******************** FmlyMmbrHis_Rltnship_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgCd() != null) {
			familymemberhistoryrelationshipcoding.setCode(f.getFmlyMmbrHisRltnshipCdgCd());
		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgDsply() != null) {
			familymemberhistoryrelationshipcoding.setDisplay(f.getFmlyMmbrHisRltnshipCdgDsply());
		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgSys() != null) {
			familymemberhistoryrelationshipcoding.setSystem(f.getFmlyMmbrHisRltnshipCdgSys());
		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgUsrSltd() != null) {
			familymemberhistoryrelationshipcoding.setUserSelected(Boolean.parseBoolean(f.getFmlyMmbrHisRltnshipCdgUsrSltd()));
		}
		/******************** FmlyMmbrHis_Rltnship_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipCdgVrsn() != null) {
			familymemberhistoryrelationshipcoding.setVersion(f.getFmlyMmbrHisRltnshipCdgVrsn());
		}
		/******************** FmlyMmbrHis_Rltnship_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisRltnshipTxt() != null) {
			familymemberhistoryrelationship.setText(f.getFmlyMmbrHisRltnshipTxt());
		}
		/******************** familymemberhistorysex ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept familymemberhistorysex =  new org.hl7.fhir.r4.model.CodeableConcept();
		familymemberhistory.setSex(familymemberhistorysex);

		/******************** familymemberhistorysexcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding familymemberhistorysexcoding =  new org.hl7.fhir.r4.model.Coding();
		familymemberhistorysex.addCoding(familymemberhistorysexcoding);

		/******************** FmlyMmbrHis_Sex_Cdg_Cd ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgCd() != null) {
			familymemberhistorysexcoding.setCode(f.getFmlyMmbrHisSexCdgCd());
		}
		/******************** FmlyMmbrHis_Sex_Cdg_Dsply ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgDsply() != null) {
			familymemberhistorysexcoding.setDisplay(f.getFmlyMmbrHisSexCdgDsply());
		}
		/******************** FmlyMmbrHis_Sex_Cdg_Sys ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgSys() != null) {
			familymemberhistorysexcoding.setSystem(f.getFmlyMmbrHisSexCdgSys());
		}
		/******************** FmlyMmbrHis_Sex_Cdg_UsrSltd ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgUsrSltd() != null) {
			familymemberhistorysexcoding.setUserSelected(Boolean.parseBoolean(f.getFmlyMmbrHisSexCdgUsrSltd()));
		}
		/******************** FmlyMmbrHis_Sex_Cdg_Vrsn ********************************************************************************/
		if(f.getFmlyMmbrHisSexCdgVrsn() != null) {
			familymemberhistorysexcoding.setVersion(f.getFmlyMmbrHisSexCdgVrsn());
		}
		/******************** FmlyMmbrHis_Sex_Txt ********************************************************************************/
		if(f.getFmlyMmbrHisSexTxt() != null) {
			familymemberhistorysex.setText(f.getFmlyMmbrHisSexTxt());
		}
		/******************** familymemberhistorystatus ********************************************************************************/
		org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyHistoryStatusEnumFactory familymemberhistorystatus =  new org.hl7.fhir.r4.model.FamilyMemberHistory.FamilyHistoryStatusEnumFactory();
		familymemberhistory.setStatus(familymemberhistorystatus.fromCode(f.getFmlyMmbrHisSts()));

		return familymemberhistory;
	}
}
