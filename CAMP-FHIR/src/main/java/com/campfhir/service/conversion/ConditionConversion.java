package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Condition;
public class ConditionConversion 
{
	public org.hl7.fhir.r4.model.Condition Conditions(Condition c) throws ParseException
	{
		org.hl7.fhir.r4.model.Condition condition = new org.hl7.fhir.r4.model.Condition();

		/******************** id ********************************************************************************/
		condition.setId(c.getId());

		/******************** conditionabatementage ********************************************************************************/
		org.hl7.fhir.r4.model.Age conditionabatementage =  new org.hl7.fhir.r4.model.Age();
		condition.setAbatement(conditionabatementage);

		/******************** Cndtn_AbatementAge_Cd ********************************************************************************/
		if(c.getCndtnAbatementAgeCd() != null) {
			conditionabatementage.setCode(c.getCndtnAbatementAgeCd());
		}
		/******************** conditionabatementagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionabatementagecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		conditionabatementage.setComparator(conditionabatementagecomparator.fromCode(c.getCndtnAbatementAgeCmprtr()));

		/******************** Cndtn_AbatementAge_Sys ********************************************************************************/
		if(c.getCndtnAbatementAgeSys() != null) {
			conditionabatementage.setSystem(c.getCndtnAbatementAgeSys());
		}
		/******************** Cndtn_AbatementAge_Unt ********************************************************************************/
		if(c.getCndtnAbatementAgeUnt() != null) {
			conditionabatementage.setUnit(c.getCndtnAbatementAgeUnt());
		}
		/******************** Cndtn_AbatementAge_Vl ********************************************************************************/
		if(c.getCndtnAbatementAgeVl() != null) {
			conditionabatementage.setValue(Double.parseDouble((c.getCndtnAbatementAgeVl())));
		}
		/******************** Cndtn_AbatementDtTimeTyp ********************************************************************************/
		if(c.getCndtnAbatementDtTimeTyp() != null) {
			condition.setAbatement( new org.hl7.fhir.r4.model.DateTimeType(c.getCndtnAbatementDtTimeTyp()));
		}
		/******************** conditionabatementperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conditionabatementperiod =  new org.hl7.fhir.r4.model.Period();
		condition.setAbatement(conditionabatementperiod);

		/******************** Cndtn_AbatementPrd_End ********************************************************************************/
		if(c.getCndtnAbatementPrdEnd() != null) {
			java.text.SimpleDateFormat Cndtn_AbatementPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cndtn_AbatementPrd_Enddate = Cndtn_AbatementPrd_Endsdf.parse(c.getCndtnAbatementPrdEnd());
			conditionabatementperiod.setEnd(Cndtn_AbatementPrd_Enddate);
		}
		/******************** Cndtn_AbatementPrd_Strt ********************************************************************************/
		if(c.getCndtnAbatementPrdStrt() != null) {
			java.text.SimpleDateFormat Cndtn_AbatementPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cndtn_AbatementPrd_Strtdate = Cndtn_AbatementPrd_Strtsdf.parse(c.getCndtnAbatementPrdStrt());
			conditionabatementperiod.setStart(Cndtn_AbatementPrd_Strtdate);
		}
		/******************** conditionabatementrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range conditionabatementrange =  new org.hl7.fhir.r4.model.Range();
		condition.setAbatement(conditionabatementrange);

		/******************** conditionabatementrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditionabatementrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		conditionabatementrange.setHigh(conditionabatementrangehigh);

		/******************** Cndtn_AbatementRng_Hi_Cd ********************************************************************************/
		if(c.getCndtnAbatementRngHiCd() != null) {
			conditionabatementrangehigh.setCode(c.getCndtnAbatementRngHiCd());
		}
		/******************** conditionabatementrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionabatementrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		conditionabatementrangehigh.setComparator(conditionabatementrangehighcomparator.fromCode(c.getCndtnAbatementRngHiCmprtr()));

		/******************** Cndtn_AbatementRng_Hi_Sys ********************************************************************************/
		if(c.getCndtnAbatementRngHiSys() != null) {
			conditionabatementrangehigh.setSystem(c.getCndtnAbatementRngHiSys());
		}
		/******************** Cndtn_AbatementRng_Hi_Unt ********************************************************************************/
		if(c.getCndtnAbatementRngHiUnt() != null) {
			conditionabatementrangehigh.setUnit(c.getCndtnAbatementRngHiUnt());
		}
		/******************** Cndtn_AbatementRng_Hi_Vl ********************************************************************************/
		if(c.getCndtnAbatementRngHiVl() != null) {
			conditionabatementrangehigh.setValue(Double.parseDouble((c.getCndtnAbatementRngHiVl())));
		}
		/******************** conditionabatementrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditionabatementrangelow =  new org.hl7.fhir.r4.model.Quantity();
		conditionabatementrange.setLow(conditionabatementrangelow);

		/******************** Cndtn_AbatementRng_Lw_Cd ********************************************************************************/
		if(c.getCndtnAbatementRngLwCd() != null) {
			conditionabatementrangelow.setCode(c.getCndtnAbatementRngLwCd());
		}
		/******************** conditionabatementrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditionabatementrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		conditionabatementrangelow.setComparator(conditionabatementrangelowcomparator.fromCode(c.getCndtnAbatementRngLwCmprtr()));

		/******************** Cndtn_AbatementRng_Lw_Sys ********************************************************************************/
		if(c.getCndtnAbatementRngLwSys() != null) {
			conditionabatementrangelow.setSystem(c.getCndtnAbatementRngLwSys());
		}
		/******************** Cndtn_AbatementRng_Lw_Unt ********************************************************************************/
		if(c.getCndtnAbatementRngLwUnt() != null) {
			conditionabatementrangelow.setUnit(c.getCndtnAbatementRngLwUnt());
		}
		/******************** Cndtn_AbatementRng_Lw_Vl ********************************************************************************/
		if(c.getCndtnAbatementRngLwVl() != null) {
			conditionabatementrangelow.setValue(Double.parseDouble((c.getCndtnAbatementRngLwVl())));
		}
		/******************** Cndtn_AbatementStrgTyp ********************************************************************************/
		if(c.getCndtnAbatementStrgTyp() != null) {
			condition.setAbatement( new org.hl7.fhir.r4.model.StringType(c.getCndtnAbatementStrgTyp()));
		}
		/******************** Cndtn_Asserter ********************************************************************************/
		if(c.getCndtnAsserter() != null) {
			condition.setAsserter( new org.hl7.fhir.r4.model.Reference(c.getCndtnAsserter()));
		}
		/******************** conditionbodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionbodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		condition.addBodySite(conditionbodysite);

		/******************** conditionbodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionbodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		conditionbodysite.addCoding(conditionbodysitecoding);

		/******************** Cndtn_BodySite_Cdg_Cd ********************************************************************************/
		if(c.getCndtnBodySiteCdgCd() != null) {
			conditionbodysitecoding.setCode(c.getCndtnBodySiteCdgCd());
		}
		/******************** Cndtn_BodySite_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnBodySiteCdgDsply() != null) {
			conditionbodysitecoding.setDisplay(c.getCndtnBodySiteCdgDsply());
		}
		/******************** Cndtn_BodySite_Cdg_Sys ********************************************************************************/
		if(c.getCndtnBodySiteCdgSys() != null) {
			conditionbodysitecoding.setSystem(c.getCndtnBodySiteCdgSys());
		}
		/******************** Cndtn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnBodySiteCdgUsrSltd() != null) {
			conditionbodysitecoding.setUserSelected(Boolean.parseBoolean(c.getCndtnBodySiteCdgUsrSltd()));
		}
		/******************** Cndtn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnBodySiteCdgVrsn() != null) {
			conditionbodysitecoding.setVersion(c.getCndtnBodySiteCdgVrsn());
		}
		/******************** Cndtn_BodySite_Txt ********************************************************************************/
		if(c.getCndtnBodySiteTxt() != null) {
			conditionbodysite.setText(c.getCndtnBodySiteTxt());
		}
		/******************** conditioncategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditioncategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		condition.addCategory(conditioncategory);

		/******************** conditioncategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditioncategorycoding =  new org.hl7.fhir.r4.model.Coding();
		conditioncategory.addCoding(conditioncategorycoding);

		/******************** Cndtn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCndtnCtgryCdgCd() != null) {
			conditioncategorycoding.setCode(c.getCndtnCtgryCdgCd());
		}
		/******************** Cndtn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnCtgryCdgDsply() != null) {
			conditioncategorycoding.setDisplay(c.getCndtnCtgryCdgDsply());
		}
		/******************** Cndtn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCndtnCtgryCdgSys() != null) {
			conditioncategorycoding.setSystem(c.getCndtnCtgryCdgSys());
		}
		/******************** Cndtn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnCtgryCdgUsrSltd() != null) {
			conditioncategorycoding.setUserSelected(Boolean.parseBoolean(c.getCndtnCtgryCdgUsrSltd()));
		}
		/******************** Cndtn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnCtgryCdgVrsn() != null) {
			conditioncategorycoding.setVersion(c.getCndtnCtgryCdgVrsn());
		}
		/******************** Cndtn_Ctgry_Txt ********************************************************************************/
		if(c.getCndtnCtgryTxt() != null) {
			conditioncategory.setText(c.getCndtnCtgryTxt());
		}
		/******************** conditionclinicalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionclinicalstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setClinicalStatus(conditionclinicalstatus);

		/******************** conditionclinicalstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionclinicalstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		conditionclinicalstatus.addCoding(conditionclinicalstatuscoding);

		/******************** Cndtn_ClnclSts_Cdg_Cd ********************************************************************************/
		if(c.getCndtnClnclStsCdgCd() != null) {
			conditionclinicalstatuscoding.setCode(c.getCndtnClnclStsCdgCd());
		}
		/******************** Cndtn_ClnclSts_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnClnclStsCdgDsply() != null) {
			conditionclinicalstatuscoding.setDisplay(c.getCndtnClnclStsCdgDsply());
		}
		/******************** Cndtn_ClnclSts_Cdg_Sys ********************************************************************************/
		if(c.getCndtnClnclStsCdgSys() != null) {
			conditionclinicalstatuscoding.setSystem(c.getCndtnClnclStsCdgSys());
		}
		/******************** Cndtn_ClnclSts_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnClnclStsCdgUsrSltd() != null) {
			conditionclinicalstatuscoding.setUserSelected(Boolean.parseBoolean(c.getCndtnClnclStsCdgUsrSltd()));
		}
		/******************** Cndtn_ClnclSts_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnClnclStsCdgVrsn() != null) {
			conditionclinicalstatuscoding.setVersion(c.getCndtnClnclStsCdgVrsn());
		}
		/******************** Cndtn_ClnclSts_Txt ********************************************************************************/
		if(c.getCndtnClnclStsTxt() != null) {
			conditionclinicalstatus.setText(c.getCndtnClnclStsTxt());
		}
		/******************** conditioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setCode(conditioncode);

		/******************** conditioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		conditioncode.addCoding(conditioncodecoding);

		/******************** Cndtn_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCndtnCdCdgCd() != null) {
			conditioncodecoding.setCode(c.getCndtnCdCdgCd());
		}
		/******************** Cndtn_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnCdCdgDsply() != null) {
			conditioncodecoding.setDisplay(c.getCndtnCdCdgDsply());
		}
		/******************** Cndtn_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCndtnCdCdgSys() != null) {
			conditioncodecoding.setSystem(c.getCndtnCdCdgSys());
		}
		/******************** Cndtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnCdCdgUsrSltd() != null) {
			conditioncodecoding.setUserSelected(Boolean.parseBoolean(c.getCndtnCdCdgUsrSltd()));
		}
		/******************** Cndtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnCdCdgVrsn() != null) {
			conditioncodecoding.setVersion(c.getCndtnCdCdgVrsn());
		}
		/******************** Cndtn_Cd_Txt ********************************************************************************/
		if(c.getCndtnCdTxt() != null) {
			conditioncode.setText(c.getCndtnCdTxt());
		}
		/******************** Cndtn_Enc ********************************************************************************/
		if(c.getCndtnEnc() != null) {
			condition.setEncounter( new org.hl7.fhir.r4.model.Reference(c.getCndtnEnc()));
		}
		/******************** conditionevidence ********************************************************************************/
		org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent conditionevidence =  new org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent();
		condition.addEvidence(conditionevidence);

		/******************** conditionevidencecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionevidencecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		conditionevidence.addCode(conditionevidencecode);

		/******************** conditionevidencecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionevidencecodecoding =  new org.hl7.fhir.r4.model.Coding();
		conditionevidencecode.addCoding(conditionevidencecodecoding);

		/******************** Cndtn_Evdnce_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgCd() != null) {
			conditionevidencecodecoding.setCode(c.getCndtnEvdnceCdCdgCd());
		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgDsply() != null) {
			conditionevidencecodecoding.setDisplay(c.getCndtnEvdnceCdCdgDsply());
		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgSys() != null) {
			conditionevidencecodecoding.setSystem(c.getCndtnEvdnceCdCdgSys());
		}
		/******************** Cndtn_Evdnce_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgUsrSltd() != null) {
			conditionevidencecodecoding.setUserSelected(Boolean.parseBoolean(c.getCndtnEvdnceCdCdgUsrSltd()));
		}
		/******************** Cndtn_Evdnce_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnEvdnceCdCdgVrsn() != null) {
			conditionevidencecodecoding.setVersion(c.getCndtnEvdnceCdCdgVrsn());
		}
		/******************** Cndtn_Evdnce_Cd_Txt ********************************************************************************/
		if(c.getCndtnEvdnceCdTxt() != null) {
			conditionevidencecode.setText(c.getCndtnEvdnceCdTxt());
		}
		/******************** Cndtn_Evdnce_Dtl ********************************************************************************/
		if(c.getCndtnEvdnceDtl() != null) {
			conditionevidence.addDetail( new org.hl7.fhir.r4.model.Reference(c.getCndtnEvdnceDtl()));
		}
		/******************** conditionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier conditionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		condition.addIdentifier(conditionidentifier);

		/******************** Cndtn_Id_Assigner ********************************************************************************/
		if(c.getCndtnIdAssigner() != null) {
			conditionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCndtnIdAssigner()));
		}
		/******************** conditionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conditionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		conditionidentifier.setPeriod(conditionidentifierperiod);

		/******************** Cndtn_Id_Prd_End ********************************************************************************/
		if(c.getCndtnIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cndtn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cndtn_Id_Prd_Enddate = Cndtn_Id_Prd_Endsdf.parse(c.getCndtnIdPrdEnd());
			conditionidentifierperiod.setEnd(Cndtn_Id_Prd_Enddate);
		}
		/******************** Cndtn_Id_Prd_Strt ********************************************************************************/
		if(c.getCndtnIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cndtn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cndtn_Id_Prd_Strtdate = Cndtn_Id_Prd_Strtsdf.parse(c.getCndtnIdPrdStrt());
			conditionidentifierperiod.setStart(Cndtn_Id_Prd_Strtdate);
		}
		/******************** Cndtn_Id_Sys ********************************************************************************/
		if(c.getCndtnIdSys() != null) {
			conditionidentifier.setSystem(c.getCndtnIdSys());
		}
		/******************** conditionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		conditionidentifier.setType(conditionidentifiertype);

		/******************** conditionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		conditionidentifiertype.addCoding(conditionidentifiertypecoding);

		/******************** Cndtn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCndtnIdTypCdgCd() != null) {
			conditionidentifiertypecoding.setCode(c.getCndtnIdTypCdgCd());
		}
		/******************** Cndtn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnIdTypCdgDsply() != null) {
			conditionidentifiertypecoding.setDisplay(c.getCndtnIdTypCdgDsply());
		}
		/******************** Cndtn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCndtnIdTypCdgSys() != null) {
			conditionidentifiertypecoding.setSystem(c.getCndtnIdTypCdgSys());
		}
		/******************** Cndtn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnIdTypCdgUsrSltd() != null) {
			conditionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCndtnIdTypCdgUsrSltd()));
		}
		/******************** Cndtn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnIdTypCdgVrsn() != null) {
			conditionidentifiertypecoding.setVersion(c.getCndtnIdTypCdgVrsn());
		}
		/******************** Cndtn_Id_Typ_Txt ********************************************************************************/
		if(c.getCndtnIdTypTxt() != null) {
			conditionidentifiertype.setText(c.getCndtnIdTypTxt());
		}
		/******************** conditionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory conditionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		conditionidentifier.setUse(conditionidentifieruse.fromCode(c.getCndtnIdUse()));

		/******************** Cndtn_Id_Vl ********************************************************************************/
		if(c.getCndtnIdVl() != null) {
			conditionidentifier.setValue(c.getCndtnIdVl());
		}
		/******************** conditionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation conditionnote =  new org.hl7.fhir.r4.model.Annotation();
		condition.addNote(conditionnote);

		/******************** Cndtn_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCndtnNtAthrRfrnc() != null) {
			conditionnote.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getCndtnNtAthrRfrnc()));
		}
		/******************** Cndtn_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCndtnNtAthrStrgTyp() != null) {
			conditionnote.setAuthor( new org.hl7.fhir.r4.model.StringType(c.getCndtnNtAthrStrgTyp()));
		}
		/******************** Cndtn_Nt_Txt ********************************************************************************/
		if(c.getCndtnNtTxt() != null) {
			conditionnote.setText(c.getCndtnNtTxt());
		}
		/******************** Cndtn_Nt_Time ********************************************************************************/
		if(c.getCndtnNtTime() != null) {
			java.text.SimpleDateFormat Cndtn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cndtn_Nt_Timedate = Cndtn_Nt_Timesdf.parse(c.getCndtnNtTime());
			conditionnote.setTime(Cndtn_Nt_Timedate);
		}
		/******************** conditiononage ********************************************************************************/
		org.hl7.fhir.r4.model.Age conditiononage =  new org.hl7.fhir.r4.model.Age();
		condition.setOnset(conditiononage);

		/******************** Cndtn_OnAge_Cd ********************************************************************************/
		if(c.getCndtnOnAgeCd() != null) {
			conditiononage.setCode(c.getCndtnOnAgeCd());
		}
		/******************** conditiononagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditiononagecomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		conditiononage.setComparator(conditiononagecomparator.fromCode(c.getCndtnOnAgeCmprtr()));

		/******************** Cndtn_OnAge_Sys ********************************************************************************/
		if(c.getCndtnOnAgeSys() != null) {
			conditiononage.setSystem(c.getCndtnOnAgeSys());
		}
		/******************** Cndtn_OnAge_Unt ********************************************************************************/
		if(c.getCndtnOnAgeUnt() != null) {
			conditiononage.setUnit(c.getCndtnOnAgeUnt());
		}
		/******************** Cndtn_OnAge_Vl ********************************************************************************/
		if(c.getCndtnOnAgeVl() != null) {
			conditiononage.setValue(Double.parseDouble((c.getCndtnOnAgeVl())));
		}
		/******************** Cndtn_OnDtTimeTyp ********************************************************************************/
		if(c.getCndtnOnDtTimeTyp() != null) {
			condition.setOnset( new org.hl7.fhir.r4.model.DateTimeType(c.getCndtnOnDtTimeTyp()));
		}
		/******************** conditiononperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conditiononperiod =  new org.hl7.fhir.r4.model.Period();
		condition.setOnset(conditiononperiod);

		/******************** Cndtn_OnPrd_End ********************************************************************************/
		if(c.getCndtnOnPrdEnd() != null) {
			java.text.SimpleDateFormat Cndtn_OnPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cndtn_OnPrd_Enddate = Cndtn_OnPrd_Endsdf.parse(c.getCndtnOnPrdEnd());
			conditiononperiod.setEnd(Cndtn_OnPrd_Enddate);
		}
		/******************** Cndtn_OnPrd_Strt ********************************************************************************/
		if(c.getCndtnOnPrdStrt() != null) {
			java.text.SimpleDateFormat Cndtn_OnPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cndtn_OnPrd_Strtdate = Cndtn_OnPrd_Strtsdf.parse(c.getCndtnOnPrdStrt());
			conditiononperiod.setStart(Cndtn_OnPrd_Strtdate);
		}
		/******************** conditiononrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range conditiononrange =  new org.hl7.fhir.r4.model.Range();
		condition.setOnset(conditiononrange);

		/******************** conditiononrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditiononrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		conditiononrange.setHigh(conditiononrangehigh);

		/******************** Cndtn_OnRng_Hi_Cd ********************************************************************************/
		if(c.getCndtnOnRngHiCd() != null) {
			conditiononrangehigh.setCode(c.getCndtnOnRngHiCd());
		}
		/******************** conditiononrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditiononrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		conditiononrangehigh.setComparator(conditiononrangehighcomparator.fromCode(c.getCndtnOnRngHiCmprtr()));

		/******************** Cndtn_OnRng_Hi_Sys ********************************************************************************/
		if(c.getCndtnOnRngHiSys() != null) {
			conditiononrangehigh.setSystem(c.getCndtnOnRngHiSys());
		}
		/******************** Cndtn_OnRng_Hi_Unt ********************************************************************************/
		if(c.getCndtnOnRngHiUnt() != null) {
			conditiononrangehigh.setUnit(c.getCndtnOnRngHiUnt());
		}
		/******************** Cndtn_OnRng_Hi_Vl ********************************************************************************/
		if(c.getCndtnOnRngHiVl() != null) {
			conditiononrangehigh.setValue(Double.parseDouble((c.getCndtnOnRngHiVl())));
		}
		/******************** conditiononrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditiononrangelow =  new org.hl7.fhir.r4.model.Quantity();
		conditiononrange.setLow(conditiononrangelow);

		/******************** Cndtn_OnRng_Lw_Cd ********************************************************************************/
		if(c.getCndtnOnRngLwCd() != null) {
			conditiononrangelow.setCode(c.getCndtnOnRngLwCd());
		}
		/******************** conditiononrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory conditiononrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		conditiononrangelow.setComparator(conditiononrangelowcomparator.fromCode(c.getCndtnOnRngLwCmprtr()));

		/******************** Cndtn_OnRng_Lw_Sys ********************************************************************************/
		if(c.getCndtnOnRngLwSys() != null) {
			conditiononrangelow.setSystem(c.getCndtnOnRngLwSys());
		}
		/******************** Cndtn_OnRng_Lw_Unt ********************************************************************************/
		if(c.getCndtnOnRngLwUnt() != null) {
			conditiononrangelow.setUnit(c.getCndtnOnRngLwUnt());
		}
		/******************** Cndtn_OnRng_Lw_Vl ********************************************************************************/
		if(c.getCndtnOnRngLwVl() != null) {
			conditiononrangelow.setValue(Double.parseDouble((c.getCndtnOnRngLwVl())));
		}
		/******************** Cndtn_OnStrgTyp ********************************************************************************/
		if(c.getCndtnOnStrgTyp() != null) {
			condition.setOnset( new org.hl7.fhir.r4.model.StringType(c.getCndtnOnStrgTyp()));
		}
		/******************** Cndtn_RecordedDt ********************************************************************************/
		if(c.getCndtnRecordedDt() != null) {
			java.text.SimpleDateFormat Cndtn_RecordedDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cndtn_RecordedDtdate = Cndtn_RecordedDtsdf.parse(c.getCndtnRecordedDt());
			condition.setRecordedDate(Cndtn_RecordedDtdate);
		}
		/******************** Cndtn_Recorder ********************************************************************************/
		if(c.getCndtnRecorder() != null) {
			condition.setRecorder( new org.hl7.fhir.r4.model.Reference(c.getCndtnRecorder()));
		}
		/******************** conditionseverity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionseverity =  new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setSeverity(conditionseverity);

		/******************** conditionseveritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionseveritycoding =  new org.hl7.fhir.r4.model.Coding();
		conditionseverity.addCoding(conditionseveritycoding);

		/******************** Cndtn_Severity_Cdg_Cd ********************************************************************************/
		if(c.getCndtnSeverityCdgCd() != null) {
			conditionseveritycoding.setCode(c.getCndtnSeverityCdgCd());
		}
		/******************** Cndtn_Severity_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnSeverityCdgDsply() != null) {
			conditionseveritycoding.setDisplay(c.getCndtnSeverityCdgDsply());
		}
		/******************** Cndtn_Severity_Cdg_Sys ********************************************************************************/
		if(c.getCndtnSeverityCdgSys() != null) {
			conditionseveritycoding.setSystem(c.getCndtnSeverityCdgSys());
		}
		/******************** Cndtn_Severity_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnSeverityCdgUsrSltd() != null) {
			conditionseveritycoding.setUserSelected(Boolean.parseBoolean(c.getCndtnSeverityCdgUsrSltd()));
		}
		/******************** Cndtn_Severity_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnSeverityCdgVrsn() != null) {
			conditionseveritycoding.setVersion(c.getCndtnSeverityCdgVrsn());
		}
		/******************** Cndtn_Severity_Txt ********************************************************************************/
		if(c.getCndtnSeverityTxt() != null) {
			conditionseverity.setText(c.getCndtnSeverityTxt());
		}
		/******************** conditionstage ********************************************************************************/
		org.hl7.fhir.r4.model.Condition.ConditionStageComponent conditionstage =  new org.hl7.fhir.r4.model.Condition.ConditionStageComponent();
		condition.addStage(conditionstage);

		/******************** Cndtn_Stage_Assmnt ********************************************************************************/
		if(c.getCndtnStageAssmnt() != null) {
			conditionstage.addAssessment( new org.hl7.fhir.r4.model.Reference(c.getCndtnStageAssmnt()));
		}
		/******************** conditionstagesummary ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionstagesummary =  new org.hl7.fhir.r4.model.CodeableConcept();
		conditionstage.setSummary(conditionstagesummary);

		/******************** conditionstagesummarycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionstagesummarycoding =  new org.hl7.fhir.r4.model.Coding();
		conditionstagesummary.addCoding(conditionstagesummarycoding);

		/******************** Cndtn_Stage_Summary_Cdg_Cd ********************************************************************************/
		if(c.getCndtnStageSummaryCdgCd() != null) {
			conditionstagesummarycoding.setCode(c.getCndtnStageSummaryCdgCd());
		}
		/******************** Cndtn_Stage_Summary_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnStageSummaryCdgDsply() != null) {
			conditionstagesummarycoding.setDisplay(c.getCndtnStageSummaryCdgDsply());
		}
		/******************** Cndtn_Stage_Summary_Cdg_Sys ********************************************************************************/
		if(c.getCndtnStageSummaryCdgSys() != null) {
			conditionstagesummarycoding.setSystem(c.getCndtnStageSummaryCdgSys());
		}
		/******************** Cndtn_Stage_Summary_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnStageSummaryCdgUsrSltd() != null) {
			conditionstagesummarycoding.setUserSelected(Boolean.parseBoolean(c.getCndtnStageSummaryCdgUsrSltd()));
		}
		/******************** Cndtn_Stage_Summary_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnStageSummaryCdgVrsn() != null) {
			conditionstagesummarycoding.setVersion(c.getCndtnStageSummaryCdgVrsn());
		}
		/******************** Cndtn_Stage_Summary_Txt ********************************************************************************/
		if(c.getCndtnStageSummaryTxt() != null) {
			conditionstagesummary.setText(c.getCndtnStageSummaryTxt());
		}
		/******************** conditionstagetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionstagetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		conditionstage.setType(conditionstagetype);

		/******************** conditionstagetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionstagetypecoding =  new org.hl7.fhir.r4.model.Coding();
		conditionstagetype.addCoding(conditionstagetypecoding);

		/******************** Cndtn_Stage_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCndtnStageTypCdgCd() != null) {
			conditionstagetypecoding.setCode(c.getCndtnStageTypCdgCd());
		}
		/******************** Cndtn_Stage_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnStageTypCdgDsply() != null) {
			conditionstagetypecoding.setDisplay(c.getCndtnStageTypCdgDsply());
		}
		/******************** Cndtn_Stage_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCndtnStageTypCdgSys() != null) {
			conditionstagetypecoding.setSystem(c.getCndtnStageTypCdgSys());
		}
		/******************** Cndtn_Stage_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnStageTypCdgUsrSltd() != null) {
			conditionstagetypecoding.setUserSelected(Boolean.parseBoolean(c.getCndtnStageTypCdgUsrSltd()));
		}
		/******************** Cndtn_Stage_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnStageTypCdgVrsn() != null) {
			conditionstagetypecoding.setVersion(c.getCndtnStageTypCdgVrsn());
		}
		/******************** Cndtn_Stage_Typ_Txt ********************************************************************************/
		if(c.getCndtnStageTypTxt() != null) {
			conditionstagetype.setText(c.getCndtnStageTypTxt());
		}
		/******************** Cndtn_Sbjct ********************************************************************************/
		if(c.getCndtnSbjct() != null) {
			condition.setSubject( new org.hl7.fhir.r4.model.Reference(c.getCndtnSbjct()));
		}
		/******************** conditionverificationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionverificationstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		condition.setVerificationStatus(conditionverificationstatus);

		/******************** conditionverificationstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding conditionverificationstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		conditionverificationstatus.addCoding(conditionverificationstatuscoding);

		/******************** Cndtn_VrfctnSts_Cdg_Cd ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgCd() != null) {
			conditionverificationstatuscoding.setCode(c.getCndtnVrfctnStsCdgCd());
		}
		/******************** Cndtn_VrfctnSts_Cdg_Dsply ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgDsply() != null) {
			conditionverificationstatuscoding.setDisplay(c.getCndtnVrfctnStsCdgDsply());
		}
		/******************** Cndtn_VrfctnSts_Cdg_Sys ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgSys() != null) {
			conditionverificationstatuscoding.setSystem(c.getCndtnVrfctnStsCdgSys());
		}
		/******************** Cndtn_VrfctnSts_Cdg_UsrSltd ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgUsrSltd() != null) {
			conditionverificationstatuscoding.setUserSelected(Boolean.parseBoolean(c.getCndtnVrfctnStsCdgUsrSltd()));
		}
		/******************** Cndtn_VrfctnSts_Cdg_Vrsn ********************************************************************************/
		if(c.getCndtnVrfctnStsCdgVrsn() != null) {
			conditionverificationstatuscoding.setVersion(c.getCndtnVrfctnStsCdgVrsn());
		}
		/******************** Cndtn_VrfctnSts_Txt ********************************************************************************/
		if(c.getCndtnVrfctnStsTxt() != null) {
			conditionverificationstatus.setText(c.getCndtnVrfctnStsTxt());
		}
		return condition;
	}
}
