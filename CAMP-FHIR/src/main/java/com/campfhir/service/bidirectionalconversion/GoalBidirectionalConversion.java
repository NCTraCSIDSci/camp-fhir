package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Goal;
public class GoalBidirectionalConversion 
{
	public Goal Goals(org.hl7.fhir.r4.model.Goal goal) throws ParseException
	{
		 main.java.com.campfhir.model.Goal g = new  main.java.com.campfhir.model.Goal();

		/******************** id ********************************************************************************/
		goal.setId(g.getId());

		/******************** goalpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalpriority = goal.getPriority();

		/******************** Goal_Priority_Txt ********************************************************************************/
		if(goalpriority.hasText()) {
			g.setGoalPriorityTxt(String.valueOf(goalpriority.getText()));
		}
		/******************** goalprioritycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalprioritycoding = goalpriority.getCodingFirstRep();

		/******************** Goal_Priority_Cdg_Vrsn ********************************************************************************/
		if(goalprioritycoding.hasVersion()) {
			g.setGoalPriorityCdgVrsn(String.valueOf(goalprioritycoding.getVersion()));
		}
		/******************** Goal_Priority_Cdg_Dsply ********************************************************************************/
		if(goalprioritycoding.hasDisplay()) {
			g.setGoalPriorityCdgDsply(String.valueOf(goalprioritycoding.getDisplay()));
		}
		/******************** Goal_Priority_Cdg_Cd ********************************************************************************/
		if(goalprioritycoding.hasCode()) {
			g.setGoalPriorityCdgCd(String.valueOf(goalprioritycoding.getCode()));
		}
		/******************** Goal_Priority_Cdg_UsrSltd ********************************************************************************/
		if(goalprioritycoding.hasUserSelected()) {
			g.setGoalPriorityCdgUsrSltd(String.valueOf(goalprioritycoding.getUserSelected()));
		}
		/******************** Goal_Priority_Cdg_Sys ********************************************************************************/
		if(goalprioritycoding.hasSystem()) {
			g.setGoalPriorityCdgSys(String.valueOf(goalprioritycoding.getSystem()));
		}
		/******************** Goal_StsRsn ********************************************************************************/
		if(goal.hasStatusReason()) {
			g.setGoalStsRsn(String.valueOf(goal.getStatusReason()));
		}
		/******************** Goal_Sbjct ********************************************************************************/
		if(goal.hasSubject()) {
			g.setGoalSbjct(String.valueOf(goal.getSubject()));
		}
		/******************** goalnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation goalnote = goal.getNoteFirstRep();

		/******************** Goal_Nt_Time ********************************************************************************/
		if(goalnote.hasTime()) {
			g.setGoalNtTime(String.valueOf(goalnote.getTime()));
		}
		/******************** Goal_Nt_Txt ********************************************************************************/
		if(goalnote.hasText()) {
			g.setGoalNtTxt(String.valueOf(goalnote.getText()));
		}
		/******************** Goal_Nt_AthrRfrnc ********************************************************************************/
		if(goalnote.hasAuthorReference()) {
			g.setGoalNtAthrRfrnc(String.valueOf(goalnote.getAuthorReference()));
		}
		/******************** Goal_Nt_AthrStrgTyp ********************************************************************************/
		if(goalnote.hasAuthorStringType()) {
			g.setGoalNtAthrStrgTyp(String.valueOf(goalnote.getAuthorStringType()));
		}
		/******************** goaldescription ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goaldescription = goal.getDescription();

		/******************** Goal_Dscrptn_Txt ********************************************************************************/
		if(goaldescription.hasText()) {
			g.setGoalDscrptnTxt(String.valueOf(goaldescription.getText()));
		}
		/******************** goaldescriptioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goaldescriptioncoding = goaldescription.getCodingFirstRep();

		/******************** Goal_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(goaldescriptioncoding.hasVersion()) {
			g.setGoalDscrptnCdgVrsn(String.valueOf(goaldescriptioncoding.getVersion()));
		}
		/******************** Goal_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(goaldescriptioncoding.hasDisplay()) {
			g.setGoalDscrptnCdgDsply(String.valueOf(goaldescriptioncoding.getDisplay()));
		}
		/******************** Goal_Dscrptn_Cdg_Cd ********************************************************************************/
		if(goaldescriptioncoding.hasCode()) {
			g.setGoalDscrptnCdgCd(String.valueOf(goaldescriptioncoding.getCode()));
		}
		/******************** Goal_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(goaldescriptioncoding.hasUserSelected()) {
			g.setGoalDscrptnCdgUsrSltd(String.valueOf(goaldescriptioncoding.getUserSelected()));
		}
		/******************** Goal_Dscrptn_Cdg_Sys ********************************************************************************/
		if(goaldescriptioncoding.hasSystem()) {
			g.setGoalDscrptnCdgSys(String.valueOf(goaldescriptioncoding.getSystem()));
		}
		/******************** Goal_ExpressedBy ********************************************************************************/
		if(goal.hasExpressedBy()) {
			g.setGoalExpressedBy(String.valueOf(goal.getExpressedBy()));
		}
		/******************** goallifecyclestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Goal.GoalLifecycleStatus goallifecyclestatus = goal.getLifecycleStatus();
		g.setGoalLifecycleSts(goallifecyclestatus.toCode());

		/******************** Goal_StsDt ********************************************************************************/
		if(goal.hasStatusDate()) {
			g.setGoalStsDt(String.valueOf(goal.getStatusDate()));
		}
		/******************** Goal_StrtDtTyp ********************************************************************************/
		if(goal.hasStartDateType()) {
			g.setGoalStrtDtTyp(String.valueOf(goal.getStartDateType()));
		}
		/******************** goalstartcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalstartcodeableconcept = goal.getStartCodeableConcept();

		/******************** Goal_StrtCdbleCncpt_Txt ********************************************************************************/
		if(goalstartcodeableconcept.hasText()) {
			g.setGoalStrtCdbleCncptTxt(String.valueOf(goalstartcodeableconcept.getText()));
		}
		/******************** goalstartcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalstartcodeableconceptcoding = goalstartcodeableconcept.getCodingFirstRep();

		/******************** Goal_StrtCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(goalstartcodeableconceptcoding.hasVersion()) {
			g.setGoalStrtCdbleCncptCdgVrsn(String.valueOf(goalstartcodeableconceptcoding.getVersion()));
		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(goalstartcodeableconceptcoding.hasDisplay()) {
			g.setGoalStrtCdbleCncptCdgDsply(String.valueOf(goalstartcodeableconceptcoding.getDisplay()));
		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(goalstartcodeableconceptcoding.hasCode()) {
			g.setGoalStrtCdbleCncptCdgCd(String.valueOf(goalstartcodeableconceptcoding.getCode()));
		}
		/******************** Goal_StrtCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(goalstartcodeableconceptcoding.hasUserSelected()) {
			g.setGoalStrtCdbleCncptCdgUsrSltd(String.valueOf(goalstartcodeableconceptcoding.getUserSelected()));
		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(goalstartcodeableconceptcoding.hasSystem()) {
			g.setGoalStrtCdbleCncptCdgSys(String.valueOf(goalstartcodeableconceptcoding.getSystem()));
		}
		/******************** goaloutcomecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goaloutcomecode = goal.getOutcomeCodeFirstRep();

		/******************** Goal_OutcomeCd_Txt ********************************************************************************/
		if(goaloutcomecode.hasText()) {
			g.setGoalOutcomeCdTxt(String.valueOf(goaloutcomecode.getText()));
		}
		/******************** goaloutcomecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goaloutcomecodecoding = goaloutcomecode.getCodingFirstRep();

		/******************** Goal_OutcomeCd_Cdg_Vrsn ********************************************************************************/
		if(goaloutcomecodecoding.hasVersion()) {
			g.setGoalOutcomeCdCdgVrsn(String.valueOf(goaloutcomecodecoding.getVersion()));
		}
		/******************** Goal_OutcomeCd_Cdg_Dsply ********************************************************************************/
		if(goaloutcomecodecoding.hasDisplay()) {
			g.setGoalOutcomeCdCdgDsply(String.valueOf(goaloutcomecodecoding.getDisplay()));
		}
		/******************** Goal_OutcomeCd_Cdg_Cd ********************************************************************************/
		if(goaloutcomecodecoding.hasCode()) {
			g.setGoalOutcomeCdCdgCd(String.valueOf(goaloutcomecodecoding.getCode()));
		}
		/******************** Goal_OutcomeCd_Cdg_UsrSltd ********************************************************************************/
		if(goaloutcomecodecoding.hasUserSelected()) {
			g.setGoalOutcomeCdCdgUsrSltd(String.valueOf(goaloutcomecodecoding.getUserSelected()));
		}
		/******************** Goal_OutcomeCd_Cdg_Sys ********************************************************************************/
		if(goaloutcomecodecoding.hasSystem()) {
			g.setGoalOutcomeCdCdgSys(String.valueOf(goaloutcomecodecoding.getSystem()));
		}
		/******************** goalachievementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalachievementstatus = goal.getAchievementStatus();

		/******************** Goal_AchievementSts_Txt ********************************************************************************/
		if(goalachievementstatus.hasText()) {
			g.setGoalAchievementStsTxt(String.valueOf(goalachievementstatus.getText()));
		}
		/******************** goalachievementstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalachievementstatuscoding = goalachievementstatus.getCodingFirstRep();

		/******************** Goal_AchievementSts_Cdg_Vrsn ********************************************************************************/
		if(goalachievementstatuscoding.hasVersion()) {
			g.setGoalAchievementStsCdgVrsn(String.valueOf(goalachievementstatuscoding.getVersion()));
		}
		/******************** Goal_AchievementSts_Cdg_Dsply ********************************************************************************/
		if(goalachievementstatuscoding.hasDisplay()) {
			g.setGoalAchievementStsCdgDsply(String.valueOf(goalachievementstatuscoding.getDisplay()));
		}
		/******************** Goal_AchievementSts_Cdg_Cd ********************************************************************************/
		if(goalachievementstatuscoding.hasCode()) {
			g.setGoalAchievementStsCdgCd(String.valueOf(goalachievementstatuscoding.getCode()));
		}
		/******************** Goal_AchievementSts_Cdg_UsrSltd ********************************************************************************/
		if(goalachievementstatuscoding.hasUserSelected()) {
			g.setGoalAchievementStsCdgUsrSltd(String.valueOf(goalachievementstatuscoding.getUserSelected()));
		}
		/******************** Goal_AchievementSts_Cdg_Sys ********************************************************************************/
		if(goalachievementstatuscoding.hasSystem()) {
			g.setGoalAchievementStsCdgSys(String.valueOf(goalachievementstatuscoding.getSystem()));
		}
		/******************** Goal_OutcomeRfrnc ********************************************************************************/
		if(goal.hasOutcomeReference()) {
			g.setGoalOutcomeRfrnc(String.valueOf(goal.getOutcomeReferenceFirstRep()));
		}
		/******************** Goal_Addres ********************************************************************************/
		if(goal.hasAddresses()) {
			g.setGoalAddres(String.valueOf(goal.getAddressesFirstRep()));
		}
		/******************** goalidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier goalidentifier = goal.getIdentifierFirstRep();

		/******************** Goal_Id_Vl ********************************************************************************/
		if(goalidentifier.hasValue()) {
			g.setGoalIdVl(String.valueOf(goalidentifier.getValue()));
		}
		/******************** goalidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalidentifiertype = goalidentifier.getType();

		/******************** Goal_Id_Typ_Txt ********************************************************************************/
		if(goalidentifiertype.hasText()) {
			g.setGoalIdTypTxt(String.valueOf(goalidentifiertype.getText()));
		}
		/******************** goalidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalidentifiertypecoding = goalidentifiertype.getCodingFirstRep();

		/******************** Goal_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(goalidentifiertypecoding.hasVersion()) {
			g.setGoalIdTypCdgVrsn(String.valueOf(goalidentifiertypecoding.getVersion()));
		}
		/******************** Goal_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(goalidentifiertypecoding.hasDisplay()) {
			g.setGoalIdTypCdgDsply(String.valueOf(goalidentifiertypecoding.getDisplay()));
		}
		/******************** Goal_Id_Typ_Cdg_Cd ********************************************************************************/
		if(goalidentifiertypecoding.hasCode()) {
			g.setGoalIdTypCdgCd(String.valueOf(goalidentifiertypecoding.getCode()));
		}
		/******************** Goal_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(goalidentifiertypecoding.hasUserSelected()) {
			g.setGoalIdTypCdgUsrSltd(String.valueOf(goalidentifiertypecoding.getUserSelected()));
		}
		/******************** Goal_Id_Typ_Cdg_Sys ********************************************************************************/
		if(goalidentifiertypecoding.hasSystem()) {
			g.setGoalIdTypCdgSys(String.valueOf(goalidentifiertypecoding.getSystem()));
		}
		/******************** goalidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period goalidentifierperiod = goalidentifier.getPeriod();

		/******************** Goal_Id_Prd_Strt ********************************************************************************/
		if(goalidentifierperiod.hasStart()) {
			g.setGoalIdPrdStrt(String.valueOf(goalidentifierperiod.getStart()));
		}
		/******************** Goal_Id_Prd_End ********************************************************************************/
		if(goalidentifierperiod.hasEnd()) {
			g.setGoalIdPrdEnd(String.valueOf(goalidentifierperiod.getEnd()));
		}
		/******************** Goal_Id_Assigner ********************************************************************************/
		if(goalidentifier.hasAssigner()) {
			g.setGoalIdAssigner(String.valueOf(goalidentifier.getAssigner()));
		}
		/******************** Goal_Id_Sys ********************************************************************************/
		if(goalidentifier.hasSystem()) {
			g.setGoalIdSys(String.valueOf(goalidentifier.getSystem()));
		}
		/******************** goalidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse goalidentifieruse = goalidentifier.getUse();
		g.setGoalIdUse(goalidentifieruse.toCode());

		/******************** goalcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalcategory = goal.getCategoryFirstRep();

		/******************** Goal_Ctgry_Txt ********************************************************************************/
		if(goalcategory.hasText()) {
			g.setGoalCtgryTxt(String.valueOf(goalcategory.getText()));
		}
		/******************** goalcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goalcategorycoding = goalcategory.getCodingFirstRep();

		/******************** Goal_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(goalcategorycoding.hasVersion()) {
			g.setGoalCtgryCdgVrsn(String.valueOf(goalcategorycoding.getVersion()));
		}
		/******************** Goal_Ctgry_Cdg_Dsply ********************************************************************************/
		if(goalcategorycoding.hasDisplay()) {
			g.setGoalCtgryCdgDsply(String.valueOf(goalcategorycoding.getDisplay()));
		}
		/******************** Goal_Ctgry_Cdg_Cd ********************************************************************************/
		if(goalcategorycoding.hasCode()) {
			g.setGoalCtgryCdgCd(String.valueOf(goalcategorycoding.getCode()));
		}
		/******************** Goal_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(goalcategorycoding.hasUserSelected()) {
			g.setGoalCtgryCdgUsrSltd(String.valueOf(goalcategorycoding.getUserSelected()));
		}
		/******************** Goal_Ctgry_Cdg_Sys ********************************************************************************/
		if(goalcategorycoding.hasSystem()) {
			g.setGoalCtgryCdgSys(String.valueOf(goalcategorycoding.getSystem()));
		}
		/******************** goaltarget ********************************************************************************/
		org.hl7.fhir.r4.model.Goal.GoalTargetComponent goaltarget = goal.getTargetFirstRep();

		/******************** Goal_Target_DtlStrgTyp ********************************************************************************/
		if(goaltarget.hasDetailStringType()) {
			g.setGoalTarDtlStrgTyp(String.valueOf(goaltarget.getDetailStringType()));
		}
		/******************** goaltargetdetailcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goaltargetdetailcodeableconcept = goaltarget.getDetailCodeableConcept();

		/******************** Goal_Target_DtlCdbleCncpt_Txt ********************************************************************************/
		if(goaltargetdetailcodeableconcept.hasText()) {
			g.setGoalTarDtlCdbleCncptTxt(String.valueOf(goaltargetdetailcodeableconcept.getText()));
		}
		/******************** goaltargetdetailcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goaltargetdetailcodeableconceptcoding = goaltargetdetailcodeableconcept.getCodingFirstRep();

		/******************** Goal_Target_DtlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(goaltargetdetailcodeableconceptcoding.hasVersion()) {
			g.setGoalTarDtlCdbleCncptCdgVrsn(String.valueOf(goaltargetdetailcodeableconceptcoding.getVersion()));
		}
		/******************** Goal_Target_DtlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(goaltargetdetailcodeableconceptcoding.hasDisplay()) {
			g.setGoalTarDtlCdbleCncptCdgDsply(String.valueOf(goaltargetdetailcodeableconceptcoding.getDisplay()));
		}
		/******************** Goal_Target_DtlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(goaltargetdetailcodeableconceptcoding.hasCode()) {
			g.setGoalTarDtlCdbleCncptCdgCd(String.valueOf(goaltargetdetailcodeableconceptcoding.getCode()));
		}
		/******************** Goal_Target_DtlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(goaltargetdetailcodeableconceptcoding.hasUserSelected()) {
			g.setGoalTarDtlCdbleCncptCdgUsrSltd(String.valueOf(goaltargetdetailcodeableconceptcoding.getUserSelected()));
		}
		/******************** Goal_Target_DtlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(goaltargetdetailcodeableconceptcoding.hasSystem()) {
			g.setGoalTarDtlCdbleCncptCdgSys(String.valueOf(goaltargetdetailcodeableconceptcoding.getSystem()));
		}
		/******************** Goal_Target_DtlBooleanTyp ********************************************************************************/
		if(goaltarget.hasDetailBooleanType()) {
			g.setGoalTarDtlBooleanTyp(String.valueOf(goaltarget.getDetailBooleanType()));
		}
		/******************** Goal_Target_DtlIntegerTyp ********************************************************************************/
		if(goaltarget.hasDetailIntegerType()) {
			g.setGoalTarDtlIntegerTyp(String.valueOf(goaltarget.getDetailIntegerType()));
		}
		/******************** goaltargetdueduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration goaltargetdueduration = goaltarget.getDueDuration();

		/******************** Goal_Target_DueDuration_Vl ********************************************************************************/
		if(goaltargetdueduration.hasValue()) {
			g.setGoalTarDueDurationVl(String.valueOf(goaltargetdueduration.getValue()));
		}
		/******************** goaltargetduedurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator goaltargetduedurationcomparator = goaltargetdueduration.getComparator();
		g.setGoalTarDueDurationCmprtr(goaltargetduedurationcomparator.toCode());

		/******************** Goal_Target_DueDuration_Cd ********************************************************************************/
		if(goaltargetdueduration.hasCode()) {
			g.setGoalTarDueDurationCd(String.valueOf(goaltargetdueduration.getCode()));
		}
		/******************** Goal_Target_DueDuration_Unt ********************************************************************************/
		if(goaltargetdueduration.hasUnit()) {
			g.setGoalTarDueDurationUnt(String.valueOf(goaltargetdueduration.getUnit()));
		}
		/******************** Goal_Target_DueDuration_Sys ********************************************************************************/
		if(goaltargetdueduration.hasSystem()) {
			g.setGoalTarDueDurationSys(String.valueOf(goaltargetdueduration.getSystem()));
		}
		/******************** goaltargetdetailratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio goaltargetdetailratio = goaltarget.getDetailRatio();

		/******************** goaltargetdetailratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltargetdetailratiodenominator = goaltargetdetailratio.getDenominator();

		/******************** Goal_Target_DtlRtio_Dnmntr_Vl ********************************************************************************/
		if(goaltargetdetailratiodenominator.hasValue()) {
			g.setGoalTarDtlRtioDnmntrVl(String.valueOf(goaltargetdetailratiodenominator.getValue()));
		}
		/******************** goaltargetdetailratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator goaltargetdetailratiodenominatorcomparator = goaltargetdetailratiodenominator.getComparator();
		g.setGoalTarDtlRtioDnmntrCmprtr(goaltargetdetailratiodenominatorcomparator.toCode());

		/******************** Goal_Target_DtlRtio_Dnmntr_Cd ********************************************************************************/
		if(goaltargetdetailratiodenominator.hasCode()) {
			g.setGoalTarDtlRtioDnmntrCd(String.valueOf(goaltargetdetailratiodenominator.getCode()));
		}
		/******************** Goal_Target_DtlRtio_Dnmntr_Unt ********************************************************************************/
		if(goaltargetdetailratiodenominator.hasUnit()) {
			g.setGoalTarDtlRtioDnmntrUnt(String.valueOf(goaltargetdetailratiodenominator.getUnit()));
		}
		/******************** Goal_Target_DtlRtio_Dnmntr_Sys ********************************************************************************/
		if(goaltargetdetailratiodenominator.hasSystem()) {
			g.setGoalTarDtlRtioDnmntrSys(String.valueOf(goaltargetdetailratiodenominator.getSystem()));
		}
		/******************** goaltargetdetailrationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltargetdetailrationumerator = goaltargetdetailratio.getNumerator();

		/******************** Goal_Target_DtlRtio_Nmrtr_Vl ********************************************************************************/
		if(goaltargetdetailrationumerator.hasValue()) {
			g.setGoalTarDtlRtioNmrtrVl(String.valueOf(goaltargetdetailrationumerator.getValue()));
		}
		/******************** goaltargetdetailrationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator goaltargetdetailrationumeratorcomparator = goaltargetdetailrationumerator.getComparator();
		g.setGoalTarDtlRtioNmrtrCmprtr(goaltargetdetailrationumeratorcomparator.toCode());

		/******************** Goal_Target_DtlRtio_Nmrtr_Cd ********************************************************************************/
		if(goaltargetdetailrationumerator.hasCode()) {
			g.setGoalTarDtlRtioNmrtrCd(String.valueOf(goaltargetdetailrationumerator.getCode()));
		}
		/******************** Goal_Target_DtlRtio_Nmrtr_Unt ********************************************************************************/
		if(goaltargetdetailrationumerator.hasUnit()) {
			g.setGoalTarDtlRtioNmrtrUnt(String.valueOf(goaltargetdetailrationumerator.getUnit()));
		}
		/******************** Goal_Target_DtlRtio_Nmrtr_Sys ********************************************************************************/
		if(goaltargetdetailrationumerator.hasSystem()) {
			g.setGoalTarDtlRtioNmrtrSys(String.valueOf(goaltargetdetailrationumerator.getSystem()));
		}
		/******************** goaltargetdetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltargetdetailquantity = goaltarget.getDetailQuantity();

		/******************** Goal_Target_DtlQnty_Vl ********************************************************************************/
		if(goaltargetdetailquantity.hasValue()) {
			g.setGoalTarDtlQntyVl(String.valueOf(goaltargetdetailquantity.getValue()));
		}
		/******************** goaltargetdetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator goaltargetdetailquantitycomparator = goaltargetdetailquantity.getComparator();
		g.setGoalTarDtlQntyCmprtr(goaltargetdetailquantitycomparator.toCode());

		/******************** Goal_Target_DtlQnty_Cd ********************************************************************************/
		if(goaltargetdetailquantity.hasCode()) {
			g.setGoalTarDtlQntyCd(String.valueOf(goaltargetdetailquantity.getCode()));
		}
		/******************** Goal_Target_DtlQnty_Unt ********************************************************************************/
		if(goaltargetdetailquantity.hasUnit()) {
			g.setGoalTarDtlQntyUnt(String.valueOf(goaltargetdetailquantity.getUnit()));
		}
		/******************** Goal_Target_DtlQnty_Sys ********************************************************************************/
		if(goaltargetdetailquantity.hasSystem()) {
			g.setGoalTarDtlQntySys(String.valueOf(goaltargetdetailquantity.getSystem()));
		}
		/******************** goaltargetdetailrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range goaltargetdetailrange = goaltarget.getDetailRange();

		/******************** goaltargetdetailrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltargetdetailrangelow = goaltargetdetailrange.getLow();

		/******************** Goal_Target_DtlRng_Lw_Vl ********************************************************************************/
		if(goaltargetdetailrangelow.hasValue()) {
			g.setGoalTarDtlRngLwVl(String.valueOf(goaltargetdetailrangelow.getValue()));
		}
		/******************** goaltargetdetailrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator goaltargetdetailrangelowcomparator = goaltargetdetailrangelow.getComparator();
		g.setGoalTarDtlRngLwCmprtr(goaltargetdetailrangelowcomparator.toCode());

		/******************** Goal_Target_DtlRng_Lw_Cd ********************************************************************************/
		if(goaltargetdetailrangelow.hasCode()) {
			g.setGoalTarDtlRngLwCd(String.valueOf(goaltargetdetailrangelow.getCode()));
		}
		/******************** Goal_Target_DtlRng_Lw_Unt ********************************************************************************/
		if(goaltargetdetailrangelow.hasUnit()) {
			g.setGoalTarDtlRngLwUnt(String.valueOf(goaltargetdetailrangelow.getUnit()));
		}
		/******************** Goal_Target_DtlRng_Lw_Sys ********************************************************************************/
		if(goaltargetdetailrangelow.hasSystem()) {
			g.setGoalTarDtlRngLwSys(String.valueOf(goaltargetdetailrangelow.getSystem()));
		}
		/******************** goaltargetdetailrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity goaltargetdetailrangehigh = goaltargetdetailrange.getHigh();

		/******************** Goal_Target_DtlRng_Hi_Vl ********************************************************************************/
		if(goaltargetdetailrangehigh.hasValue()) {
			g.setGoalTarDtlRngHiVl(String.valueOf(goaltargetdetailrangehigh.getValue()));
		}
		/******************** goaltargetdetailrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator goaltargetdetailrangehighcomparator = goaltargetdetailrangehigh.getComparator();
		g.setGoalTarDtlRngHiCmprtr(goaltargetdetailrangehighcomparator.toCode());

		/******************** Goal_Target_DtlRng_Hi_Cd ********************************************************************************/
		if(goaltargetdetailrangehigh.hasCode()) {
			g.setGoalTarDtlRngHiCd(String.valueOf(goaltargetdetailrangehigh.getCode()));
		}
		/******************** Goal_Target_DtlRng_Hi_Unt ********************************************************************************/
		if(goaltargetdetailrangehigh.hasUnit()) {
			g.setGoalTarDtlRngHiUnt(String.valueOf(goaltargetdetailrangehigh.getUnit()));
		}
		/******************** Goal_Target_DtlRng_Hi_Sys ********************************************************************************/
		if(goaltargetdetailrangehigh.hasSystem()) {
			g.setGoalTarDtlRngHiSys(String.valueOf(goaltargetdetailrangehigh.getSystem()));
		}
		/******************** Goal_Target_DueDtTyp ********************************************************************************/
		if(goaltarget.hasDueDateType()) {
			g.setGoalTarDueDtTyp(String.valueOf(goaltarget.getDueDateType()));
		}
		/******************** goaltargetmeasure ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goaltargetmeasure = goaltarget.getMeasure();

		/******************** Goal_Target_Msr_Txt ********************************************************************************/
		if(goaltargetmeasure.hasText()) {
			g.setGoalTarMsrTxt(String.valueOf(goaltargetmeasure.getText()));
		}
		/******************** goaltargetmeasurecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding goaltargetmeasurecoding = goaltargetmeasure.getCodingFirstRep();

		/******************** Goal_Target_Msr_Cdg_Vrsn ********************************************************************************/
		if(goaltargetmeasurecoding.hasVersion()) {
			g.setGoalTarMsrCdgVrsn(String.valueOf(goaltargetmeasurecoding.getVersion()));
		}
		/******************** Goal_Target_Msr_Cdg_Dsply ********************************************************************************/
		if(goaltargetmeasurecoding.hasDisplay()) {
			g.setGoalTarMsrCdgDsply(String.valueOf(goaltargetmeasurecoding.getDisplay()));
		}
		/******************** Goal_Target_Msr_Cdg_Cd ********************************************************************************/
		if(goaltargetmeasurecoding.hasCode()) {
			g.setGoalTarMsrCdgCd(String.valueOf(goaltargetmeasurecoding.getCode()));
		}
		/******************** Goal_Target_Msr_Cdg_UsrSltd ********************************************************************************/
		if(goaltargetmeasurecoding.hasUserSelected()) {
			g.setGoalTarMsrCdgUsrSltd(String.valueOf(goaltargetmeasurecoding.getUserSelected()));
		}
		/******************** Goal_Target_Msr_Cdg_Sys ********************************************************************************/
		if(goaltargetmeasurecoding.hasSystem()) {
			g.setGoalTarMsrCdgSys(String.valueOf(goaltargetmeasurecoding.getSystem()));
		}
		return g;
	}
}
