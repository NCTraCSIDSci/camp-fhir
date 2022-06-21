package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CarePlan;
public class CarePlanBidirectionalConversion 
{
	public CarePlan CarePlans(org.hl7.fhir.r4.model.CarePlan careplan) throws ParseException
	{
		 main.java.com.campfhir.model.CarePlan c = new  main.java.com.campfhir.model.CarePlan();

		/******************** id ********************************************************************************/
		careplan.setId(c.getId());

		/******************** CarePln_CareTeam ********************************************************************************/
		if(careplan.hasCareTeam()) {
			c.setCarePlnCareTeam(String.valueOf(careplan.getCareTeamFirstRep()));
		}
		/******************** CarePln_Contributor ********************************************************************************/
		if(careplan.hasContributor()) {
			c.setCarePlnContributor(String.valueOf(careplan.getContributorFirstRep()));
		}
		/******************** careplanactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityComponent careplanactivity = careplan.getActivityFirstRep();

		/******************** CarePln_Actvty_Rfrnc ********************************************************************************/
		if(careplanactivity.hasReference()) {
			c.setCarePlnActvtyRfrnc(String.valueOf(careplanactivity.getReference()));
		}
		/******************** careplanactivitydetail ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityDetailComponent careplanactivitydetail = careplanactivity.getDetail();

		/******************** CarePln_Actvty_Dtl_Lctn ********************************************************************************/
		if(careplanactivitydetail.hasLocation()) {
			c.setCarePlnActvtyDtlLctn(String.valueOf(careplanactivitydetail.getLocation()));
		}
		/******************** careplanactivitydetailcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailcode = careplanactivitydetail.getCode();

		/******************** careplanactivitydetailcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailcodecoding = careplanactivitydetailcode.getCodingFirstRep();

		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailcodecoding.hasDisplay()) {
			c.setCarePlnActvtyDtlCdCdgDsply(String.valueOf(careplanactivitydetailcodecoding.getDisplay()));
		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailcodecoding.hasVersion()) {
			c.setCarePlnActvtyDtlCdCdgVrsn(String.valueOf(careplanactivitydetailcodecoding.getVersion()));
		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailcodecoding.hasCode()) {
			c.setCarePlnActvtyDtlCdCdgCd(String.valueOf(careplanactivitydetailcodecoding.getCode()));
		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailcodecoding.hasSystem()) {
			c.setCarePlnActvtyDtlCdCdgSys(String.valueOf(careplanactivitydetailcodecoding.getSystem()));
		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailcodecoding.hasUserSelected()) {
			c.setCarePlnActvtyDtlCdCdgUsrSltd(String.valueOf(careplanactivitydetailcodecoding.getUserSelected()));
		}
		/******************** CarePln_Actvty_Dtl_Cd_Txt ********************************************************************************/
		if(careplanactivitydetailcode.hasText()) {
			c.setCarePlnActvtyDtlCdTxt(String.valueOf(careplanactivitydetailcode.getText()));
		}
		/******************** CarePln_Actvty_Dtl_Prfrmr ********************************************************************************/
		if(careplanactivitydetail.hasPerformer()) {
			c.setCarePlnActvtyDtlPrfrmr(String.valueOf(careplanactivitydetail.getPerformerFirstRep()));
		}
		/******************** CarePln_Actvty_Dtl_PrdctRfrnc ********************************************************************************/
		if(careplanactivitydetail.hasProductReference()) {
			c.setCarePlnActvtyDtlPrdctRfrnc(String.valueOf(careplanactivitydetail.getProductReference()));
		}
		/******************** careplanactivitydetailproductcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailproductcodeableconcept = careplanactivitydetail.getProductCodeableConcept();

		/******************** careplanactivitydetailproductcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailproductcodeableconceptcoding = careplanactivitydetailproductcodeableconcept.getCodingFirstRep();

		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcoding.hasDisplay()) {
			c.setCarePlnActvtyDtlPrdctCdbleCncptCdgDsply(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getDisplay()));
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcoding.hasVersion()) {
			c.setCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getVersion()));
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcoding.hasCode()) {
			c.setCarePlnActvtyDtlPrdctCdbleCncptCdgCd(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getCode()));
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcoding.hasSystem()) {
			c.setCarePlnActvtyDtlPrdctCdbleCncptCdgSys(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getSystem()));
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailproductcodeableconceptcoding.hasUserSelected()) {
			c.setCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd(String.valueOf(careplanactivitydetailproductcodeableconceptcoding.getUserSelected()));
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(careplanactivitydetailproductcodeableconcept.hasText()) {
			c.setCarePlnActvtyDtlPrdctCdbleCncptTxt(String.valueOf(careplanactivitydetailproductcodeableconcept.getText()));
		}
		/******************** careplanactivitydetailstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityStatus careplanactivitydetailstatus = careplanactivitydetail.getStatus();
		c.setCarePlnActvtyDtlSts(careplanactivitydetailstatus.toCode());

		/******************** CarePln_Actvty_Dtl_Dscrptn ********************************************************************************/
		if(careplanactivitydetail.hasDescription()) {
			c.setCarePlnActvtyDtlDscrptn(String.valueOf(careplanactivitydetail.getDescription()));
		}
		/******************** careplanactivitydetailstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailstatusreason = careplanactivitydetail.getStatusReason();

		/******************** careplanactivitydetailstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailstatusreasoncoding = careplanactivitydetailstatusreason.getCodingFirstRep();

		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailstatusreasoncoding.hasDisplay()) {
			c.setCarePlnActvtyDtlStsRsnCdgDsply(String.valueOf(careplanactivitydetailstatusreasoncoding.getDisplay()));
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailstatusreasoncoding.hasVersion()) {
			c.setCarePlnActvtyDtlStsRsnCdgVrsn(String.valueOf(careplanactivitydetailstatusreasoncoding.getVersion()));
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailstatusreasoncoding.hasCode()) {
			c.setCarePlnActvtyDtlStsRsnCdgCd(String.valueOf(careplanactivitydetailstatusreasoncoding.getCode()));
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailstatusreasoncoding.hasSystem()) {
			c.setCarePlnActvtyDtlStsRsnCdgSys(String.valueOf(careplanactivitydetailstatusreasoncoding.getSystem()));
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailstatusreasoncoding.hasUserSelected()) {
			c.setCarePlnActvtyDtlStsRsnCdgUsrSltd(String.valueOf(careplanactivitydetailstatusreasoncoding.getUserSelected()));
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Txt ********************************************************************************/
		if(careplanactivitydetailstatusreason.hasText()) {
			c.setCarePlnActvtyDtlStsRsnTxt(String.valueOf(careplanactivitydetailstatusreason.getText()));
		}
		/******************** CarePln_Actvty_Dtl_RsnRfrnc ********************************************************************************/
		if(careplanactivitydetail.hasReasonReference()) {
			c.setCarePlnActvtyDtlRsnRfrnc(String.valueOf(careplanactivitydetail.getReasonReferenceFirstRep()));
		}
		/******************** careplanactivitydetailreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailreasoncode = careplanactivitydetail.getReasonCodeFirstRep();

		/******************** careplanactivitydetailreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailreasoncodecoding = careplanactivitydetailreasoncode.getCodingFirstRep();

		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailreasoncodecoding.hasDisplay()) {
			c.setCarePlnActvtyDtlRsnCdCdgDsply(String.valueOf(careplanactivitydetailreasoncodecoding.getDisplay()));
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailreasoncodecoding.hasVersion()) {
			c.setCarePlnActvtyDtlRsnCdCdgVrsn(String.valueOf(careplanactivitydetailreasoncodecoding.getVersion()));
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailreasoncodecoding.hasCode()) {
			c.setCarePlnActvtyDtlRsnCdCdgCd(String.valueOf(careplanactivitydetailreasoncodecoding.getCode()));
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailreasoncodecoding.hasSystem()) {
			c.setCarePlnActvtyDtlRsnCdCdgSys(String.valueOf(careplanactivitydetailreasoncodecoding.getSystem()));
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailreasoncodecoding.hasUserSelected()) {
			c.setCarePlnActvtyDtlRsnCdCdgUsrSltd(String.valueOf(careplanactivitydetailreasoncodecoding.getUserSelected()));
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Txt ********************************************************************************/
		if(careplanactivitydetailreasoncode.hasText()) {
			c.setCarePlnActvtyDtlRsnCdTxt(String.valueOf(careplanactivitydetailreasoncode.getText()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldStrgTyp ********************************************************************************/
		if(careplanactivitydetail.hasScheduledStringType()) {
			c.setCarePlnActvtyDtlSchdldStrgTyp(String.valueOf(careplanactivitydetail.getScheduledStringType()));
		}
		/******************** careplanactivitydetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetailquantity = careplanactivitydetail.getQuantity();

		/******************** CarePln_Actvty_Dtl_Qnty_Vl ********************************************************************************/
		if(careplanactivitydetailquantity.hasValue()) {
			c.setCarePlnActvtyDtlQntyVl(String.valueOf(careplanactivitydetailquantity.getValue()));
		}
		/******************** careplanactivitydetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator careplanactivitydetailquantitycomparator = careplanactivitydetailquantity.getComparator();
		c.setCarePlnActvtyDtlQntyCmprtr(careplanactivitydetailquantitycomparator.toCode());

		/******************** CarePln_Actvty_Dtl_Qnty_Cd ********************************************************************************/
		if(careplanactivitydetailquantity.hasCode()) {
			c.setCarePlnActvtyDtlQntyCd(String.valueOf(careplanactivitydetailquantity.getCode()));
		}
		/******************** CarePln_Actvty_Dtl_Qnty_Sys ********************************************************************************/
		if(careplanactivitydetailquantity.hasSystem()) {
			c.setCarePlnActvtyDtlQntySys(String.valueOf(careplanactivitydetailquantity.getSystem()));
		}
		/******************** CarePln_Actvty_Dtl_Qnty_Unt ********************************************************************************/
		if(careplanactivitydetailquantity.hasUnit()) {
			c.setCarePlnActvtyDtlQntyUnt(String.valueOf(careplanactivitydetailquantity.getUnit()));
		}
		/******************** CarePln_Actvty_Dtl_Goal ********************************************************************************/
		if(careplanactivitydetail.hasGoal()) {
			c.setCarePlnActvtyDtlGoal(String.valueOf(careplanactivitydetail.getGoalFirstRep()));
		}
		/******************** CarePln_Actvty_Dtl_DoNotPerform ********************************************************************************/
		if(careplanactivitydetail.hasDoNotPerform()) {
			c.setCarePlnActvtyDtlDoNotPerform(String.valueOf(careplanactivitydetail.getDoNotPerform()));
		}
		/******************** careplanactivitydetailkind ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityKind careplanactivitydetailkind = careplanactivitydetail.getKind();
		c.setCarePlnActvtyDtlKind(careplanactivitydetailkind.toCode());

		/******************** careplanactivitydetailscheduledperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanactivitydetailscheduledperiod = careplanactivitydetail.getScheduledPeriod();

		/******************** CarePln_Actvty_Dtl_SchdldPrd_End ********************************************************************************/
		if(careplanactivitydetailscheduledperiod.hasEnd()) {
			c.setCarePlnActvtyDtlSchdldPrdEnd(String.valueOf(careplanactivitydetailscheduledperiod.getEnd()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldPrd_Strt ********************************************************************************/
		if(careplanactivitydetailscheduledperiod.hasStart()) {
			c.setCarePlnActvtyDtlSchdldPrdStrt(String.valueOf(careplanactivitydetailscheduledperiod.getStart()));
		}
		/******************** careplanactivitydetailscheduledtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing careplanactivitydetailscheduledtiming = careplanactivitydetail.getScheduledTiming();

		/******************** careplanactivitydetailscheduledtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailscheduledtimingcode = careplanactivitydetailscheduledtiming.getCode();

		/******************** careplanactivitydetailscheduledtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailscheduledtimingcodecoding = careplanactivitydetailscheduledtimingcode.getCodingFirstRep();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecoding.hasDisplay()) {
			c.setCarePlnActvtyDtlSchdldTmgCdCdgDsply(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getDisplay()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecoding.hasVersion()) {
			c.setCarePlnActvtyDtlSchdldTmgCdCdgVrsn(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getVersion()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Cd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecoding.hasCode()) {
			c.setCarePlnActvtyDtlSchdldTmgCdCdgCd(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getCode()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Sys ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecoding.hasSystem()) {
			c.setCarePlnActvtyDtlSchdldTmgCdCdgSys(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getSystem()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcodecoding.hasUserSelected()) {
			c.setCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd(String.valueOf(careplanactivitydetailscheduledtimingcodecoding.getUserSelected()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Txt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingcode.hasText()) {
			c.setCarePlnActvtyDtlSchdldTmgCdTxt(String.valueOf(careplanactivitydetailscheduledtimingcode.getText()));
		}
		/******************** careplanactivitydetailscheduledtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent careplanactivitydetailscheduledtimingrepeat = careplanactivitydetailscheduledtiming.getRepeat();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Off ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasOffset()) {
			c.setCarePlnActvtyDtlSchdldTmgRptOff(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getOffset()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Cnt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasCount()) {
			c.setCarePlnActvtyDtlSchdldTmgRptCnt(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getCount()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Frqncy ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasFrequency()) {
			c.setCarePlnActvtyDtlSchdldTmgRptFrqncy(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getFrequency()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Prd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasPeriod()) {
			c.setCarePlnActvtyDtlSchdldTmgRptPrd(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getPeriod()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Duration ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasDuration()) {
			c.setCarePlnActvtyDtlSchdldTmgRptDuration(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getDuration()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_CntMx ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasCountMax()) {
			c.setCarePlnActvtyDtlSchdldTmgRptCntMx(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getCountMax()));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration careplanactivitydetailscheduledtimingrepeatboundsduration = careplanactivitydetailscheduledtimingrepeat.getBoundsDuration();

		/******************** careplanactivitydetailscheduledtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanactivitydetailscheduledtimingrepeatboundsperiod = careplanactivitydetailscheduledtimingrepeat.getBoundsPeriod();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsperiod.hasEnd()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsPrdEnd(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsperiod.getEnd()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsperiod.hasStart()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsPrdStrt(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsperiod.getStart()));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range careplanactivitydetailscheduledtimingrepeatboundsrange = careplanactivitydetailscheduledtimingrepeat.getBoundsRange();

		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetailscheduledtimingrepeatboundsrangelow = careplanactivitydetailscheduledtimingrepeatboundsrange.getLow();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangelow.hasValue()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsRngLwVl(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangelow.getValue()));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator = careplanactivitydetailscheduledtimingrepeatboundsrangelow.getComparator();
		c.setCarePlnActvtyDtlSchdldTmgRptBndsRngLwCmprtr(careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator.toCode());

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangelow.hasCode()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsRngLwCd(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangelow.getCode()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangelow.hasSystem()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsRngLwSys(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangelow.getSystem()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangelow.hasUnit()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsRngLwUnt(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangelow.getUnit()));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetailscheduledtimingrepeatboundsrangehigh = careplanactivitydetailscheduledtimingrepeatboundsrange.getHigh();

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.hasValue()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsRngHiVl(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getValue()));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator = careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getComparator();
		c.setCarePlnActvtyDtlSchdldTmgRptBndsRngHiCmprtr(careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator.toCode());

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.hasCode()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsRngHiCd(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getCode()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.hasSystem()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsRngHiSys(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.hasUnit()) {
			c.setCarePlnActvtyDtlSchdldTmgRptBndsRngHiUnt(String.valueOf(careplanactivitydetailscheduledtimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_PrdMx ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasPeriodMax()) {
			c.setCarePlnActvtyDtlSchdldTmgRptPrdMx(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getPeriodMax()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_FrqncyMx ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasFrequencyMax()) {
			c.setCarePlnActvtyDtlSchdldTmgRptFrqncyMx(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getFrequencyMax()));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime careplanactivitydetailscheduledtimingrepeatperiodunit = careplanactivitydetailscheduledtimingrepeat.getPeriodUnit();
		c.setCarePlnActvtyDtlSchdldTmgRptPrdUnt(careplanactivitydetailscheduledtimingrepeatperiodunit.toCode());

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_DurationMx ********************************************************************************/
		if(careplanactivitydetailscheduledtimingrepeat.hasDurationMax()) {
			c.setCarePlnActvtyDtlSchdldTmgRptDurationMx(String.valueOf(careplanactivitydetailscheduledtimingrepeat.getDurationMax()));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime careplanactivitydetailscheduledtimingrepeatdurationunit = careplanactivitydetailscheduledtimingrepeat.getDurationUnit();
		c.setCarePlnActvtyDtlSchdldTmgRptDurationUnt(careplanactivitydetailscheduledtimingrepeatdurationunit.toCode());

		/******************** careplanactivitydetaildailyamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetaildailyamount = careplanactivitydetail.getDailyAmount();

		/******************** CarePln_Actvty_Dtl_DailyAmnt_Vl ********************************************************************************/
		if(careplanactivitydetaildailyamount.hasValue()) {
			c.setCarePlnActvtyDtlDailyAmntVl(String.valueOf(careplanactivitydetaildailyamount.getValue()));
		}
		/******************** careplanactivitydetaildailyamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator careplanactivitydetaildailyamountcomparator = careplanactivitydetaildailyamount.getComparator();
		c.setCarePlnActvtyDtlDailyAmntCmprtr(careplanactivitydetaildailyamountcomparator.toCode());

		/******************** CarePln_Actvty_Dtl_DailyAmnt_Cd ********************************************************************************/
		if(careplanactivitydetaildailyamount.hasCode()) {
			c.setCarePlnActvtyDtlDailyAmntCd(String.valueOf(careplanactivitydetaildailyamount.getCode()));
		}
		/******************** CarePln_Actvty_Dtl_DailyAmnt_Sys ********************************************************************************/
		if(careplanactivitydetaildailyamount.hasSystem()) {
			c.setCarePlnActvtyDtlDailyAmntSys(String.valueOf(careplanactivitydetaildailyamount.getSystem()));
		}
		/******************** CarePln_Actvty_Dtl_DailyAmnt_Unt ********************************************************************************/
		if(careplanactivitydetaildailyamount.hasUnit()) {
			c.setCarePlnActvtyDtlDailyAmntUnt(String.valueOf(careplanactivitydetaildailyamount.getUnit()));
		}
		/******************** careplanactivityoutcomecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivityoutcomecodeableconcept = careplanactivity.getOutcomeCodeableConceptFirstRep();

		/******************** careplanactivityoutcomecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivityoutcomecodeableconceptcoding = careplanactivityoutcomecodeableconcept.getCodingFirstRep();

		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcoding.hasDisplay()) {
			c.setCarePlnActvtyOutcomeCdbleCncptCdgDsply(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getDisplay()));
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcoding.hasVersion()) {
			c.setCarePlnActvtyOutcomeCdbleCncptCdgVrsn(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getVersion()));
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcoding.hasCode()) {
			c.setCarePlnActvtyOutcomeCdbleCncptCdgCd(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getCode()));
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcoding.hasSystem()) {
			c.setCarePlnActvtyOutcomeCdbleCncptCdgSys(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getSystem()));
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(careplanactivityoutcomecodeableconceptcoding.hasUserSelected()) {
			c.setCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd(String.valueOf(careplanactivityoutcomecodeableconceptcoding.getUserSelected()));
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Txt ********************************************************************************/
		if(careplanactivityoutcomecodeableconcept.hasText()) {
			c.setCarePlnActvtyOutcomeCdbleCncptTxt(String.valueOf(careplanactivityoutcomecodeableconcept.getText()));
		}
		/******************** careplanactivityprogress ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation careplanactivityprogress = careplanactivity.getProgressFirstRep();

		/******************** CarePln_Actvty_Progress_Time ********************************************************************************/
		if(careplanactivityprogress.hasTime()) {
			c.setCarePlnActvtyProgressTime(String.valueOf(careplanactivityprogress.getTime()));
		}
		/******************** CarePln_Actvty_Progress_AthrRfrnc ********************************************************************************/
		if(careplanactivityprogress.hasAuthorReference()) {
			c.setCarePlnActvtyProgressAthrRfrnc(String.valueOf(careplanactivityprogress.getAuthorReference()));
		}
		/******************** CarePln_Actvty_Progress_Txt ********************************************************************************/
		if(careplanactivityprogress.hasText()) {
			c.setCarePlnActvtyProgressTxt(String.valueOf(careplanactivityprogress.getText()));
		}
		/******************** CarePln_Actvty_Progress_AthrStrgTyp ********************************************************************************/
		if(careplanactivityprogress.hasAuthorStringType()) {
			c.setCarePlnActvtyProgressAthrStrgTyp(String.valueOf(careplanactivityprogress.getAuthorStringType()));
		}
		/******************** CarePln_Actvty_OutcomeRfrnc ********************************************************************************/
		if(careplanactivity.hasOutcomeReference()) {
			c.setCarePlnActvtyOutcomeRfrnc(String.valueOf(careplanactivity.getOutcomeReferenceFirstRep()));
		}
		/******************** CarePln_Athr ********************************************************************************/
		if(careplan.hasAuthor()) {
			c.setCarePlnAthr(String.valueOf(careplan.getAuthor()));
		}
		/******************** careplanintent ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanIntent careplanintent = careplan.getIntent();
		c.setCarePlnIntent(careplanintent.toCode());

		/******************** CarePln_Sbjct ********************************************************************************/
		if(careplan.hasSubject()) {
			c.setCarePlnSbjct(String.valueOf(careplan.getSubject()));
		}
		/******************** careplanstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanStatus careplanstatus = careplan.getStatus();
		c.setCarePlnSts(careplanstatus.toCode());

		/******************** CarePln_Enc ********************************************************************************/
		if(careplan.hasEncounter()) {
			c.setCarePlnEnc(String.valueOf(careplan.getEncounter()));
		}
		/******************** CarePln_BasedOn ********************************************************************************/
		if(careplan.hasBasedOn()) {
			c.setCarePlnBasedOn(String.valueOf(careplan.getBasedOnFirstRep()));
		}
		/******************** CarePln_Dscrptn ********************************************************************************/
		if(careplan.hasDescription()) {
			c.setCarePlnDscrptn(String.valueOf(careplan.getDescription()));
		}
		/******************** careplannote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation careplannote = careplan.getNoteFirstRep();

		/******************** CarePln_Nt_Time ********************************************************************************/
		if(careplannote.hasTime()) {
			c.setCarePlnNtTime(String.valueOf(careplannote.getTime()));
		}
		/******************** CarePln_Nt_AthrRfrnc ********************************************************************************/
		if(careplannote.hasAuthorReference()) {
			c.setCarePlnNtAthrRfrnc(String.valueOf(careplannote.getAuthorReference()));
		}
		/******************** CarePln_Nt_Txt ********************************************************************************/
		if(careplannote.hasText()) {
			c.setCarePlnNtTxt(String.valueOf(careplannote.getText()));
		}
		/******************** CarePln_Nt_AthrStrgTyp ********************************************************************************/
		if(careplannote.hasAuthorStringType()) {
			c.setCarePlnNtAthrStrgTyp(String.valueOf(careplannote.getAuthorStringType()));
		}
		/******************** CarePln_Created ********************************************************************************/
		if(careplan.hasCreated()) {
			c.setCarePlnCreated(String.valueOf(careplan.getCreated()));
		}
		/******************** careplanperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanperiod = careplan.getPeriod();

		/******************** CarePln_Prd_End ********************************************************************************/
		if(careplanperiod.hasEnd()) {
			c.setCarePlnPrdEnd(String.valueOf(careplanperiod.getEnd()));
		}
		/******************** CarePln_Prd_Strt ********************************************************************************/
		if(careplanperiod.hasStart()) {
			c.setCarePlnPrdStrt(String.valueOf(careplanperiod.getStart()));
		}
		/******************** careplancategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplancategory = careplan.getCategoryFirstRep();

		/******************** careplancategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplancategorycoding = careplancategory.getCodingFirstRep();

		/******************** CarePln_Ctgry_Cdg_Dsply ********************************************************************************/
		if(careplancategorycoding.hasDisplay()) {
			c.setCarePlnCtgryCdgDsply(String.valueOf(careplancategorycoding.getDisplay()));
		}
		/******************** CarePln_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(careplancategorycoding.hasVersion()) {
			c.setCarePlnCtgryCdgVrsn(String.valueOf(careplancategorycoding.getVersion()));
		}
		/******************** CarePln_Ctgry_Cdg_Cd ********************************************************************************/
		if(careplancategorycoding.hasCode()) {
			c.setCarePlnCtgryCdgCd(String.valueOf(careplancategorycoding.getCode()));
		}
		/******************** CarePln_Ctgry_Cdg_Sys ********************************************************************************/
		if(careplancategorycoding.hasSystem()) {
			c.setCarePlnCtgryCdgSys(String.valueOf(careplancategorycoding.getSystem()));
		}
		/******************** CarePln_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(careplancategorycoding.hasUserSelected()) {
			c.setCarePlnCtgryCdgUsrSltd(String.valueOf(careplancategorycoding.getUserSelected()));
		}
		/******************** CarePln_Ctgry_Txt ********************************************************************************/
		if(careplancategory.hasText()) {
			c.setCarePlnCtgryTxt(String.valueOf(careplancategory.getText()));
		}
		/******************** CarePln_Replaces ********************************************************************************/
		if(careplan.hasReplaces()) {
			c.setCarePlnReplaces(String.valueOf(careplan.getReplacesFirstRep()));
		}
		/******************** CarePln_Ttl ********************************************************************************/
		if(careplan.hasTitle()) {
			c.setCarePlnTtl(String.valueOf(careplan.getTitle()));
		}
		/******************** CarePln_PartOf ********************************************************************************/
		if(careplan.hasPartOf()) {
			c.setCarePlnPartOf(String.valueOf(careplan.getPartOfFirstRep()));
		}
		/******************** careplanidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier careplanidentifier = careplan.getIdentifierFirstRep();

		/******************** CarePln_Id_Vl ********************************************************************************/
		if(careplanidentifier.hasValue()) {
			c.setCarePlnIdVl(String.valueOf(careplanidentifier.getValue()));
		}
		/******************** careplanidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanidentifiertype = careplanidentifier.getType();

		/******************** careplanidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanidentifiertypecoding = careplanidentifiertype.getCodingFirstRep();

		/******************** CarePln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(careplanidentifiertypecoding.hasDisplay()) {
			c.setCarePlnIdTypCdgDsply(String.valueOf(careplanidentifiertypecoding.getDisplay()));
		}
		/******************** CarePln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(careplanidentifiertypecoding.hasVersion()) {
			c.setCarePlnIdTypCdgVrsn(String.valueOf(careplanidentifiertypecoding.getVersion()));
		}
		/******************** CarePln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(careplanidentifiertypecoding.hasCode()) {
			c.setCarePlnIdTypCdgCd(String.valueOf(careplanidentifiertypecoding.getCode()));
		}
		/******************** CarePln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(careplanidentifiertypecoding.hasSystem()) {
			c.setCarePlnIdTypCdgSys(String.valueOf(careplanidentifiertypecoding.getSystem()));
		}
		/******************** CarePln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(careplanidentifiertypecoding.hasUserSelected()) {
			c.setCarePlnIdTypCdgUsrSltd(String.valueOf(careplanidentifiertypecoding.getUserSelected()));
		}
		/******************** CarePln_Id_Typ_Txt ********************************************************************************/
		if(careplanidentifiertype.hasText()) {
			c.setCarePlnIdTypTxt(String.valueOf(careplanidentifiertype.getText()));
		}
		/******************** CarePln_Id_Sys ********************************************************************************/
		if(careplanidentifier.hasSystem()) {
			c.setCarePlnIdSys(String.valueOf(careplanidentifier.getSystem()));
		}
		/******************** CarePln_Id_Assigner ********************************************************************************/
		if(careplanidentifier.hasAssigner()) {
			c.setCarePlnIdAssigner(String.valueOf(careplanidentifier.getAssigner()));
		}
		/******************** careplanidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanidentifierperiod = careplanidentifier.getPeriod();

		/******************** CarePln_Id_Prd_End ********************************************************************************/
		if(careplanidentifierperiod.hasEnd()) {
			c.setCarePlnIdPrdEnd(String.valueOf(careplanidentifierperiod.getEnd()));
		}
		/******************** CarePln_Id_Prd_Strt ********************************************************************************/
		if(careplanidentifierperiod.hasStart()) {
			c.setCarePlnIdPrdStrt(String.valueOf(careplanidentifierperiod.getStart()));
		}
		/******************** careplanidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse careplanidentifieruse = careplanidentifier.getUse();
		c.setCarePlnIdUse(careplanidentifieruse.toCode());

		/******************** CarePln_Goal ********************************************************************************/
		if(careplan.hasGoal()) {
			c.setCarePlnGoal(String.valueOf(careplan.getGoalFirstRep()));
		}
		/******************** CarePln_SprtingInfo ********************************************************************************/
		if(careplan.hasSupportingInfo()) {
			c.setCarePlnSprtingInfo(String.valueOf(careplan.getSupportingInfoFirstRep()));
		}
		/******************** CarePln_Addres ********************************************************************************/
		if(careplan.hasAddresses()) {
			c.setCarePlnAddres(String.valueOf(careplan.getAddressesFirstRep()));
		}
		return c;
	}
}
