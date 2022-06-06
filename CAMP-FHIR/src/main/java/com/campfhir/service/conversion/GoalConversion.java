package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Goal;
public class GoalConversion 
{
	public org.hl7.fhir.r4.model.Goal Goals(Goal g) throws ParseException
	{
		org.hl7.fhir.r4.model.Goal goal = new org.hl7.fhir.r4.model.Goal();

		/******************** id ********************************************************************************/
		goal.setId(g.getId());

		/******************** goalachievementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalachievementstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		goal.setAchievementStatus(goalachievementstatus);

		/******************** goalachievementstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalachievementstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		goalachievementstatus.addCoding(goalachievementstatuscoding);

		/******************** Goal_AchievementSts_Cdg_Cd ********************************************************************************/
		if(g.getGoalAchievementStsCdgCd() != null) {
			goalachievementstatuscoding.setCode(g.getGoalAchievementStsCdgCd());
		}
		/******************** Goal_AchievementSts_Cdg_Dsply ********************************************************************************/
		if(g.getGoalAchievementStsCdgDsply() != null) {
			goalachievementstatuscoding.setDisplay(g.getGoalAchievementStsCdgDsply());
		}
		/******************** Goal_AchievementSts_Cdg_Sys ********************************************************************************/
		if(g.getGoalAchievementStsCdgSys() != null) {
			goalachievementstatuscoding.setSystem(g.getGoalAchievementStsCdgSys());
		}
		/******************** Goal_AchievementSts_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalAchievementStsCdgUsrSltd() != null) {
			goalachievementstatuscoding.setUserSelected(Boolean.parseBoolean(g.getGoalAchievementStsCdgUsrSltd()));
		}
		/******************** Goal_AchievementSts_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalAchievementStsCdgVrsn() != null) {
			goalachievementstatuscoding.setVersion(g.getGoalAchievementStsCdgVrsn());
		}
		/******************** Goal_AchievementSts_Txt ********************************************************************************/
		if(g.getGoalAchievementStsTxt() != null) {
			goalachievementstatus.setText(g.getGoalAchievementStsTxt());
		}
		/******************** Goal_Addres ********************************************************************************/
		if(g.getGoalAddres() != null) {
			goal.addAddresses( new org.hl7.fhir.r4.model.Reference(g.getGoalAddres()));
		}
		/******************** goalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		goal.addCategory(goalcategory);

		/******************** goalcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		goalcategory.addCoding(goalcategorycoding);

		/******************** Goal_Ctgry_Cdg_Cd ********************************************************************************/
		if(g.getGoalCtgryCdgCd() != null) {
			goalcategorycoding.setCode(g.getGoalCtgryCdgCd());
		}
		/******************** Goal_Ctgry_Cdg_Dsply ********************************************************************************/
		if(g.getGoalCtgryCdgDsply() != null) {
			goalcategorycoding.setDisplay(g.getGoalCtgryCdgDsply());
		}
		/******************** Goal_Ctgry_Cdg_Sys ********************************************************************************/
		if(g.getGoalCtgryCdgSys() != null) {
			goalcategorycoding.setSystem(g.getGoalCtgryCdgSys());
		}
		/******************** Goal_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalCtgryCdgUsrSltd() != null) {
			goalcategorycoding.setUserSelected(Boolean.parseBoolean(g.getGoalCtgryCdgUsrSltd()));
		}
		/******************** Goal_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalCtgryCdgVrsn() != null) {
			goalcategorycoding.setVersion(g.getGoalCtgryCdgVrsn());
		}
		/******************** Goal_Ctgry_Txt ********************************************************************************/
		if(g.getGoalCtgryTxt() != null) {
			goalcategory.setText(g.getGoalCtgryTxt());
		}
		/******************** goaldescription ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goaldescription =  new org.hl7.fhir.r4.model.CodeableConcept();
		goal.setDescription(goaldescription);

		/******************** goaldescriptioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goaldescriptioncoding =  new org.hl7.fhir.r4.model.Coding();
		goaldescription.addCoding(goaldescriptioncoding);

		/******************** Goal_Dscrptn_Cdg_Cd ********************************************************************************/
		if(g.getGoalDscrptnCdgCd() != null) {
			goaldescriptioncoding.setCode(g.getGoalDscrptnCdgCd());
		}
		/******************** Goal_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(g.getGoalDscrptnCdgDsply() != null) {
			goaldescriptioncoding.setDisplay(g.getGoalDscrptnCdgDsply());
		}
		/******************** Goal_Dscrptn_Cdg_Sys ********************************************************************************/
		if(g.getGoalDscrptnCdgSys() != null) {
			goaldescriptioncoding.setSystem(g.getGoalDscrptnCdgSys());
		}
		/******************** Goal_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalDscrptnCdgUsrSltd() != null) {
			goaldescriptioncoding.setUserSelected(Boolean.parseBoolean(g.getGoalDscrptnCdgUsrSltd()));
		}
		/******************** Goal_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalDscrptnCdgVrsn() != null) {
			goaldescriptioncoding.setVersion(g.getGoalDscrptnCdgVrsn());
		}
		/******************** Goal_Dscrptn_Txt ********************************************************************************/
		if(g.getGoalDscrptnTxt() != null) {
			goaldescription.setText(g.getGoalDscrptnTxt());
		}
		/******************** Goal_ExpressedBy ********************************************************************************/
		if(g.getGoalExpressedBy() != null) {
			goal.setExpressedBy( new org.hl7.fhir.r4.model.Reference(g.getGoalExpressedBy()));
		}
		/******************** goalidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier goalidentifier =  new org.hl7.fhir.r4.model.Identifier();
		goal.addIdentifier(goalidentifier);

		/******************** Goal_Id_Assigner ********************************************************************************/
		if(g.getGoalIdAssigner() != null) {
			goalidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(g.getGoalIdAssigner()));
		}
		/******************** goalidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period goalidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		goalidentifier.setPeriod(goalidentifierperiod);

		/******************** Goal_Id_Prd_End ********************************************************************************/
		if(g.getGoalIdPrdEnd() != null) {
			java.text.SimpleDateFormat Goal_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Goal_Id_Prd_Enddate = Goal_Id_Prd_Endsdf.parse(g.getGoalIdPrdEnd());
			goalidentifierperiod.setEnd(Goal_Id_Prd_Enddate);
		}
		/******************** Goal_Id_Prd_Strt ********************************************************************************/
		if(g.getGoalIdPrdStrt() != null) {
			java.text.SimpleDateFormat Goal_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Goal_Id_Prd_Strtdate = Goal_Id_Prd_Strtsdf.parse(g.getGoalIdPrdStrt());
			goalidentifierperiod.setStart(Goal_Id_Prd_Strtdate);
		}
		/******************** Goal_Id_Sys ********************************************************************************/
		if(g.getGoalIdSys() != null) {
			goalidentifier.setSystem(g.getGoalIdSys());
		}
		/******************** goalidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		goalidentifier.setType(goalidentifiertype);

		/******************** goalidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		goalidentifiertype.addCoding(goalidentifiertypecoding);

		/******************** Goal_Id_Typ_Cdg_Cd ********************************************************************************/
		if(g.getGoalIdTypCdgCd() != null) {
			goalidentifiertypecoding.setCode(g.getGoalIdTypCdgCd());
		}
		/******************** Goal_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(g.getGoalIdTypCdgDsply() != null) {
			goalidentifiertypecoding.setDisplay(g.getGoalIdTypCdgDsply());
		}
		/******************** Goal_Id_Typ_Cdg_Sys ********************************************************************************/
		if(g.getGoalIdTypCdgSys() != null) {
			goalidentifiertypecoding.setSystem(g.getGoalIdTypCdgSys());
		}
		/******************** Goal_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalIdTypCdgUsrSltd() != null) {
			goalidentifiertypecoding.setUserSelected(Boolean.parseBoolean(g.getGoalIdTypCdgUsrSltd()));
		}
		/******************** Goal_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalIdTypCdgVrsn() != null) {
			goalidentifiertypecoding.setVersion(g.getGoalIdTypCdgVrsn());
		}
		/******************** Goal_Id_Typ_Txt ********************************************************************************/
		if(g.getGoalIdTypTxt() != null) {
			goalidentifiertype.setText(g.getGoalIdTypTxt());
		}
		/******************** goalidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory goalidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		goalidentifier.setUse(goalidentifieruse.fromCode(g.getGoalIdUse()));

		/******************** Goal_Id_Vl ********************************************************************************/
		if(g.getGoalIdVl() != null) {
			goalidentifier.setValue(g.getGoalIdVl());
		}
		/******************** goallifecyclestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Goal.GoalLifecycleStatusEnumFactory goallifecyclestatus =  new org.hl7.fhir.r4.model.Goal.GoalLifecycleStatusEnumFactory();
		goal.setLifecycleStatus(goallifecyclestatus.fromCode(g.getGoalLifecycleSts()));

		/******************** goalnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation goalnote =  new org.hl7.fhir.r4.model.Annotation();
		goal.addNote(goalnote);

		/******************** Goal_Nt_AthrRfrnc ********************************************************************************/
		if(g.getGoalNtAthrRfrnc() != null) {
			goalnote.setAuthor( new org.hl7.fhir.r4.model.Reference(g.getGoalNtAthrRfrnc()));
		}
		/******************** Goal_Nt_AthrStrgTyp ********************************************************************************/
		if(g.getGoalNtAthrStrgTyp() != null) {
			goalnote.setAuthor( new org.hl7.fhir.r4.model.StringType(g.getGoalNtAthrStrgTyp()));
		}
		/******************** Goal_Nt_Txt ********************************************************************************/
		if(g.getGoalNtTxt() != null) {
			goalnote.setText(g.getGoalNtTxt());
		}
		/******************** Goal_Nt_Time ********************************************************************************/
		if(g.getGoalNtTime() != null) {
			java.text.SimpleDateFormat Goal_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Goal_Nt_Timedate = Goal_Nt_Timesdf.parse(g.getGoalNtTime());
			goalnote.setTime(Goal_Nt_Timedate);
		}
		/******************** goaloutcomecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goaloutcomecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		goal.addOutcomeCode(goaloutcomecode);

		/******************** goaloutcomecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goaloutcomecodecoding =  new org.hl7.fhir.r4.model.Coding();
		goaloutcomecode.addCoding(goaloutcomecodecoding);

		/******************** Goal_OutcomeCd_Cdg_Cd ********************************************************************************/
		if(g.getGoalOutcomeCdCdgCd() != null) {
			goaloutcomecodecoding.setCode(g.getGoalOutcomeCdCdgCd());
		}
		/******************** Goal_OutcomeCd_Cdg_Dsply ********************************************************************************/
		if(g.getGoalOutcomeCdCdgDsply() != null) {
			goaloutcomecodecoding.setDisplay(g.getGoalOutcomeCdCdgDsply());
		}
		/******************** Goal_OutcomeCd_Cdg_Sys ********************************************************************************/
		if(g.getGoalOutcomeCdCdgSys() != null) {
			goaloutcomecodecoding.setSystem(g.getGoalOutcomeCdCdgSys());
		}
		/******************** Goal_OutcomeCd_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalOutcomeCdCdgUsrSltd() != null) {
			goaloutcomecodecoding.setUserSelected(Boolean.parseBoolean(g.getGoalOutcomeCdCdgUsrSltd()));
		}
		/******************** Goal_OutcomeCd_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalOutcomeCdCdgVrsn() != null) {
			goaloutcomecodecoding.setVersion(g.getGoalOutcomeCdCdgVrsn());
		}
		/******************** Goal_OutcomeCd_Txt ********************************************************************************/
		if(g.getGoalOutcomeCdTxt() != null) {
			goaloutcomecode.setText(g.getGoalOutcomeCdTxt());
		}
		/******************** Goal_OutcomeRfrnc ********************************************************************************/
		if(g.getGoalOutcomeRfrnc() != null) {
			goal.addOutcomeReference( new org.hl7.fhir.r4.model.Reference(g.getGoalOutcomeRfrnc()));
		}
		/******************** goalpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalpriority =  new org.hl7.fhir.r4.model.CodeableConcept();
		goal.setPriority(goalpriority);

		/******************** goalprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalprioritycoding =  new org.hl7.fhir.r4.model.Coding();
		goalpriority.addCoding(goalprioritycoding);

		/******************** Goal_Priority_Cdg_Cd ********************************************************************************/
		if(g.getGoalPriorityCdgCd() != null) {
			goalprioritycoding.setCode(g.getGoalPriorityCdgCd());
		}
		/******************** Goal_Priority_Cdg_Dsply ********************************************************************************/
		if(g.getGoalPriorityCdgDsply() != null) {
			goalprioritycoding.setDisplay(g.getGoalPriorityCdgDsply());
		}
		/******************** Goal_Priority_Cdg_Sys ********************************************************************************/
		if(g.getGoalPriorityCdgSys() != null) {
			goalprioritycoding.setSystem(g.getGoalPriorityCdgSys());
		}
		/******************** Goal_Priority_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalPriorityCdgUsrSltd() != null) {
			goalprioritycoding.setUserSelected(Boolean.parseBoolean(g.getGoalPriorityCdgUsrSltd()));
		}
		/******************** Goal_Priority_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalPriorityCdgVrsn() != null) {
			goalprioritycoding.setVersion(g.getGoalPriorityCdgVrsn());
		}
		/******************** Goal_Priority_Txt ********************************************************************************/
		if(g.getGoalPriorityTxt() != null) {
			goalpriority.setText(g.getGoalPriorityTxt());
		}
		/******************** goalstartcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalstartcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		goal.setStart(goalstartcodeableconcept);

		/******************** goalstartcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalstartcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		goalstartcodeableconcept.addCoding(goalstartcodeableconceptcoding);

		/******************** Goal_StrtCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgCd() != null) {
			goalstartcodeableconceptcoding.setCode(g.getGoalStrtCdbleCncptCdgCd());
		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgDsply() != null) {
			goalstartcodeableconceptcoding.setDisplay(g.getGoalStrtCdbleCncptCdgDsply());
		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgSys() != null) {
			goalstartcodeableconceptcoding.setSystem(g.getGoalStrtCdbleCncptCdgSys());
		}
		/******************** Goal_StrtCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgUsrSltd() != null) {
			goalstartcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(g.getGoalStrtCdbleCncptCdgUsrSltd()));
		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgVrsn() != null) {
			goalstartcodeableconceptcoding.setVersion(g.getGoalStrtCdbleCncptCdgVrsn());
		}
		/******************** Goal_StrtCdbleCncpt_Txt ********************************************************************************/
		if(g.getGoalStrtCdbleCncptTxt() != null) {
			goalstartcodeableconcept.setText(g.getGoalStrtCdbleCncptTxt());
		}
		/******************** Goal_StrtDtTyp ********************************************************************************/
		if(g.getGoalStrtDtTyp() != null) {
			goal.setStart( new org.hl7.fhir.r4.model.DateType(g.getGoalStrtDtTyp()));
		}
		/******************** Goal_StsDt ********************************************************************************/
		if(g.getGoalStsDt() != null) {
			java.text.SimpleDateFormat Goal_StsDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Goal_StsDtdate = Goal_StsDtsdf.parse(g.getGoalStsDt());
			goal.setStatusDate(Goal_StsDtdate);
		}
		/******************** Goal_StsRsn ********************************************************************************/
		if(g.getGoalStsRsn() != null) {
			goal.setStatusReason(g.getGoalStsRsn());
		}
		/******************** Goal_Sbjct ********************************************************************************/
		if(g.getGoalSbjct() != null) {
			goal.setSubject( new org.hl7.fhir.r4.model.Reference(g.getGoalSbjct()));
		}
		/******************** goaltar ********************************************************************************/
		org.hl7.fhir.r4.model.Goal.GoalTargetComponent goaltar =  new org.hl7.fhir.r4.model.Goal.GoalTargetComponent();
		goal.addTarget(goaltar);

		/******************** Goal_Tar_DtlBooleanTyp ********************************************************************************/
		if(g.getGoalTarDtlBooleanTyp() != null) {
			goaltar.setDetail( new org.hl7.fhir.r4.model.BooleanType(g.getGoalTarDtlBooleanTyp()));
		}
		/******************** goaltardetailcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goaltardetailcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		goaltar.setDetail(goaltardetailcodeableconcept);

		/******************** goaltardetailcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goaltardetailcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		goaltardetailcodeableconcept.addCoding(goaltardetailcodeableconceptcoding);

		/******************** Goal_Tar_DtlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(g.getGoalTarDtlCdbleCncptCdgCd() != null) {
			goaltardetailcodeableconceptcoding.setCode(g.getGoalTarDtlCdbleCncptCdgCd());
		}
		/******************** Goal_Tar_DtlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(g.getGoalTarDtlCdbleCncptCdgDsply() != null) {
			goaltardetailcodeableconceptcoding.setDisplay(g.getGoalTarDtlCdbleCncptCdgDsply());
		}
		/******************** Goal_Tar_DtlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(g.getGoalTarDtlCdbleCncptCdgSys() != null) {
			goaltardetailcodeableconceptcoding.setSystem(g.getGoalTarDtlCdbleCncptCdgSys());
		}
		/******************** Goal_Tar_DtlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalTarDtlCdbleCncptCdgUsrSltd() != null) {
			goaltardetailcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(g.getGoalTarDtlCdbleCncptCdgUsrSltd()));
		}
		/******************** Goal_Tar_DtlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalTarDtlCdbleCncptCdgVrsn() != null) {
			goaltardetailcodeableconceptcoding.setVersion(g.getGoalTarDtlCdbleCncptCdgVrsn());
		}
		/******************** Goal_Tar_DtlCdbleCncpt_Txt ********************************************************************************/
		if(g.getGoalTarDtlCdbleCncptTxt() != null) {
			goaltardetailcodeableconcept.setText(g.getGoalTarDtlCdbleCncptTxt());
		}
		/******************** Goal_Tar_DtlIntegerTyp ********************************************************************************/
		if(g.getGoalTarDtlIntegerTyp() != null) {
			goaltar.setDetail( new org.hl7.fhir.r4.model.IntegerType(g.getGoalTarDtlIntegerTyp()));
		}
		/******************** goaltardetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltardetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		goaltar.setDetail(goaltardetailquantity);

		/******************** Goal_Tar_DtlQnty_Cd ********************************************************************************/
		if(g.getGoalTarDtlQntyCd() != null) {
			goaltardetailquantity.setCode(g.getGoalTarDtlQntyCd());
		}
		/******************** goaltardetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory goaltardetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		goaltardetailquantity.setComparator(goaltardetailquantitycomparator.fromCode(g.getGoalTarDtlQntyCmprtr()));

		/******************** Goal_Tar_DtlQnty_Sys ********************************************************************************/
		if(g.getGoalTarDtlQntySys() != null) {
			goaltardetailquantity.setSystem(g.getGoalTarDtlQntySys());
		}
		/******************** Goal_Tar_DtlQnty_Unt ********************************************************************************/
		if(g.getGoalTarDtlQntyUnt() != null) {
			goaltardetailquantity.setUnit(g.getGoalTarDtlQntyUnt());
		}
		/******************** Goal_Tar_DtlQnty_Vl ********************************************************************************/
		if(g.getGoalTarDtlQntyVl() != null) {
			goaltardetailquantity.setValue(Double.parseDouble((g.getGoalTarDtlQntyVl())));
		}
		/******************** goaltardetailrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range goaltardetailrange =  new org.hl7.fhir.r4.model.Range();
		goaltar.setDetail(goaltardetailrange);

		/******************** goaltardetailrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltardetailrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		goaltardetailrange.setHigh(goaltardetailrangehigh);

		/******************** Goal_Tar_DtlRng_Hi_Cd ********************************************************************************/
		if(g.getGoalTarDtlRngHiCd() != null) {
			goaltardetailrangehigh.setCode(g.getGoalTarDtlRngHiCd());
		}
		/******************** goaltardetailrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory goaltardetailrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		goaltardetailrangehigh.setComparator(goaltardetailrangehighcomparator.fromCode(g.getGoalTarDtlRngHiCmprtr()));

		/******************** Goal_Tar_DtlRng_Hi_Sys ********************************************************************************/
		if(g.getGoalTarDtlRngHiSys() != null) {
			goaltardetailrangehigh.setSystem(g.getGoalTarDtlRngHiSys());
		}
		/******************** Goal_Tar_DtlRng_Hi_Unt ********************************************************************************/
		if(g.getGoalTarDtlRngHiUnt() != null) {
			goaltardetailrangehigh.setUnit(g.getGoalTarDtlRngHiUnt());
		}
		/******************** Goal_Tar_DtlRng_Hi_Vl ********************************************************************************/
		if(g.getGoalTarDtlRngHiVl() != null) {
			goaltardetailrangehigh.setValue(Double.parseDouble((g.getGoalTarDtlRngHiVl())));
		}
		/******************** goaltardetailrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltardetailrangelow =  new org.hl7.fhir.r4.model.Quantity();
		goaltardetailrange.setLow(goaltardetailrangelow);

		/******************** Goal_Tar_DtlRng_Lw_Cd ********************************************************************************/
		if(g.getGoalTarDtlRngLwCd() != null) {
			goaltardetailrangelow.setCode(g.getGoalTarDtlRngLwCd());
		}
		/******************** goaltardetailrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory goaltardetailrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		goaltardetailrangelow.setComparator(goaltardetailrangelowcomparator.fromCode(g.getGoalTarDtlRngLwCmprtr()));

		/******************** Goal_Tar_DtlRng_Lw_Sys ********************************************************************************/
		if(g.getGoalTarDtlRngLwSys() != null) {
			goaltardetailrangelow.setSystem(g.getGoalTarDtlRngLwSys());
		}
		/******************** Goal_Tar_DtlRng_Lw_Unt ********************************************************************************/
		if(g.getGoalTarDtlRngLwUnt() != null) {
			goaltardetailrangelow.setUnit(g.getGoalTarDtlRngLwUnt());
		}
		/******************** Goal_Tar_DtlRng_Lw_Vl ********************************************************************************/
		if(g.getGoalTarDtlRngLwVl() != null) {
			goaltardetailrangelow.setValue(Double.parseDouble((g.getGoalTarDtlRngLwVl())));
		}
		/******************** goaltardetailratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio goaltardetailratio =  new org.hl7.fhir.r4.model.Ratio();
		goaltar.setDetail(goaltardetailratio);

		/******************** goaltardetailratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltardetailratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		goaltardetailratio.setDenominator(goaltardetailratiodenominator);

		/******************** Goal_Tar_DtlRtio_Dnmntr_Cd ********************************************************************************/
		if(g.getGoalTarDtlRtioDnmntrCd() != null) {
			goaltardetailratiodenominator.setCode(g.getGoalTarDtlRtioDnmntrCd());
		}
		/******************** goaltardetailratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory goaltardetailratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		goaltardetailratiodenominator.setComparator(goaltardetailratiodenominatorcomparator.fromCode(g.getGoalTarDtlRtioDnmntrCmprtr()));

		/******************** Goal_Tar_DtlRtio_Dnmntr_Sys ********************************************************************************/
		if(g.getGoalTarDtlRtioDnmntrSys() != null) {
			goaltardetailratiodenominator.setSystem(g.getGoalTarDtlRtioDnmntrSys());
		}
		/******************** Goal_Tar_DtlRtio_Dnmntr_Unt ********************************************************************************/
		if(g.getGoalTarDtlRtioDnmntrUnt() != null) {
			goaltardetailratiodenominator.setUnit(g.getGoalTarDtlRtioDnmntrUnt());
		}
		/******************** Goal_Tar_DtlRtio_Dnmntr_Vl ********************************************************************************/
		if(g.getGoalTarDtlRtioDnmntrVl() != null) {
			goaltardetailratiodenominator.setValue(Double.parseDouble((g.getGoalTarDtlRtioDnmntrVl())));
		}
		/******************** goaltardetailrationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltardetailrationumerator =  new org.hl7.fhir.r4.model.Quantity();
		goaltardetailratio.setNumerator(goaltardetailrationumerator);

		/******************** Goal_Tar_DtlRtio_Nmrtr_Cd ********************************************************************************/
		if(g.getGoalTarDtlRtioNmrtrCd() != null) {
			goaltardetailrationumerator.setCode(g.getGoalTarDtlRtioNmrtrCd());
		}
		/******************** goaltardetailrationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory goaltardetailrationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		goaltardetailrationumerator.setComparator(goaltardetailrationumeratorcomparator.fromCode(g.getGoalTarDtlRtioNmrtrCmprtr()));

		/******************** Goal_Tar_DtlRtio_Nmrtr_Sys ********************************************************************************/
		if(g.getGoalTarDtlRtioNmrtrSys() != null) {
			goaltardetailrationumerator.setSystem(g.getGoalTarDtlRtioNmrtrSys());
		}
		/******************** Goal_Tar_DtlRtio_Nmrtr_Unt ********************************************************************************/
		if(g.getGoalTarDtlRtioNmrtrUnt() != null) {
			goaltardetailrationumerator.setUnit(g.getGoalTarDtlRtioNmrtrUnt());
		}
		/******************** Goal_Tar_DtlRtio_Nmrtr_Vl ********************************************************************************/
		if(g.getGoalTarDtlRtioNmrtrVl() != null) {
			goaltardetailrationumerator.setValue(Double.parseDouble((g.getGoalTarDtlRtioNmrtrVl())));
		}
		/******************** Goal_Tar_DtlStrgTyp ********************************************************************************/
		if(g.getGoalTarDtlStrgTyp() != null) {
			goaltar.setDetail( new org.hl7.fhir.r4.model.StringType(g.getGoalTarDtlStrgTyp()));
		}
		/******************** Goal_Tar_DueDtTyp ********************************************************************************/
		if(g.getGoalTarDueDtTyp() != null) {
			goaltar.setDue( new org.hl7.fhir.r4.model.DateType(g.getGoalTarDueDtTyp()));
		}
		/******************** goaltardueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration goaltardueduration =  new org.hl7.fhir.r4.model.Duration();
		goaltar.setDue(goaltardueduration);

		/******************** goaltarmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goaltarmeasure =  new org.hl7.fhir.r4.model.CodeableConcept();
		goaltar.setMeasure(goaltarmeasure);

		/******************** goaltarmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goaltarmeasurecoding =  new org.hl7.fhir.r4.model.Coding();
		goaltarmeasure.addCoding(goaltarmeasurecoding);

		/******************** Goal_Tar_Msr_Cdg_Cd ********************************************************************************/
		if(g.getGoalTarMsrCdgCd() != null) {
			goaltarmeasurecoding.setCode(g.getGoalTarMsrCdgCd());
		}
		/******************** Goal_Tar_Msr_Cdg_Dsply ********************************************************************************/
		if(g.getGoalTarMsrCdgDsply() != null) {
			goaltarmeasurecoding.setDisplay(g.getGoalTarMsrCdgDsply());
		}
		/******************** Goal_Tar_Msr_Cdg_Sys ********************************************************************************/
		if(g.getGoalTarMsrCdgSys() != null) {
			goaltarmeasurecoding.setSystem(g.getGoalTarMsrCdgSys());
		}
		/******************** Goal_Tar_Msr_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalTarMsrCdgUsrSltd() != null) {
			goaltarmeasurecoding.setUserSelected(Boolean.parseBoolean(g.getGoalTarMsrCdgUsrSltd()));
		}
		/******************** Goal_Tar_Msr_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalTarMsrCdgVrsn() != null) {
			goaltarmeasurecoding.setVersion(g.getGoalTarMsrCdgVrsn());
		}
		/******************** Goal_Tar_Msr_Txt ********************************************************************************/
		if(g.getGoalTarMsrTxt() != null) {
			goaltarmeasure.setText(g.getGoalTarMsrTxt());
		}
		return goal;
	}
}
