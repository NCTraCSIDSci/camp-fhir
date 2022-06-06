package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CarePlan;
public class CarePlanConversion 
{
	public org.hl7.fhir.r4.model.CarePlan CarePlans(CarePlan c) throws ParseException
	{
		org.hl7.fhir.r4.model.CarePlan careplan = new org.hl7.fhir.r4.model.CarePlan();

		/******************** id ********************************************************************************/
		careplan.setId(c.getId());

		/******************** careplanactivity ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityComponent careplanactivity =  new org.hl7.fhir.r4.model.CarePlan.CarePlanActivityComponent();
		careplan.addActivity(careplanactivity);

		/******************** careplanactivitydetail ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityDetailComponent careplanactivitydetail =  new org.hl7.fhir.r4.model.CarePlan.CarePlanActivityDetailComponent();
		careplanactivity.setDetail(careplanactivitydetail);

		/******************** careplanactivitydetailcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		careplanactivitydetail.setCode(careplanactivitydetailcode);

		/******************** careplanactivitydetailcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailcodecoding =  new org.hl7.fhir.r4.model.Coding();
		careplanactivitydetailcode.addCoding(careplanactivitydetailcodecoding);

		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgCd() != null) {
			careplanactivitydetailcodecoding.setCode(c.getCarePlnActvtyDtlCdCdgCd());
		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgDsply() != null) {
			careplanactivitydetailcodecoding.setDisplay(c.getCarePlnActvtyDtlCdCdgDsply());
		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgSys() != null) {
			careplanactivitydetailcodecoding.setSystem(c.getCarePlnActvtyDtlCdCdgSys());
		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgUsrSltd() != null) {
			careplanactivitydetailcodecoding.setUserSelected(Boolean.parseBoolean(c.getCarePlnActvtyDtlCdCdgUsrSltd()));
		}
		/******************** CarePln_Actvty_Dtl_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdCdgVrsn() != null) {
			careplanactivitydetailcodecoding.setVersion(c.getCarePlnActvtyDtlCdCdgVrsn());
		}
		/******************** CarePln_Actvty_Dtl_Cd_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlCdTxt() != null) {
			careplanactivitydetailcode.setText(c.getCarePlnActvtyDtlCdTxt());
		}
		/******************** careplanactivitydetaildailyamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetaildailyamount =  new org.hl7.fhir.r4.model.Quantity();
		careplanactivitydetail.setDailyAmount(careplanactivitydetaildailyamount);

		/******************** CarePln_Actvty_Dtl_DailyAmnt_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlDailyAmntCd() != null) {
			careplanactivitydetaildailyamount.setCode(c.getCarePlnActvtyDtlDailyAmntCd());
		}
		/******************** careplanactivitydetaildailyamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory careplanactivitydetaildailyamountcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		careplanactivitydetaildailyamount.setComparator(careplanactivitydetaildailyamountcomparator.fromCode(c.getCarePlnActvtyDtlDailyAmntCmprtr()));

		/******************** CarePln_Actvty_Dtl_DailyAmnt_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlDailyAmntSys() != null) {
			careplanactivitydetaildailyamount.setSystem(c.getCarePlnActvtyDtlDailyAmntSys());
		}
		/******************** CarePln_Actvty_Dtl_DailyAmnt_Unt ********************************************************************************/
		if(c.getCarePlnActvtyDtlDailyAmntUnt() != null) {
			careplanactivitydetaildailyamount.setUnit(c.getCarePlnActvtyDtlDailyAmntUnt());
		}
		/******************** CarePln_Actvty_Dtl_DailyAmnt_Vl ********************************************************************************/
		if(c.getCarePlnActvtyDtlDailyAmntVl() != null) {
			careplanactivitydetaildailyamount.setValue(Double.parseDouble((c.getCarePlnActvtyDtlDailyAmntVl())));
		}
		/******************** CarePln_Actvty_Dtl_Dscrptn ********************************************************************************/
		if(c.getCarePlnActvtyDtlDscrptn() != null) {
			careplanactivitydetail.setDescription(c.getCarePlnActvtyDtlDscrptn());
		}
		/******************** CarePln_Actvty_Dtl_DoNotPerform ********************************************************************************/
		if(c.getCarePlnActvtyDtlDoNotPerform() != null) {
			careplanactivitydetail.setDoNotPerform(Boolean.parseBoolean(c.getCarePlnActvtyDtlDoNotPerform()));
		}
		/******************** CarePln_Actvty_Dtl_Goal ********************************************************************************/
		if(c.getCarePlnActvtyDtlGoal() != null) {
			careplanactivitydetail.addGoal( new org.hl7.fhir.r4.model.Reference(c.getCarePlnActvtyDtlGoal()));
		}
		/******************** CarePln_Actvty_Dtl_InstantiatesCanonical ********************************************************************************/
		if(c.getCarePlnActvtyDtlInstantiatesCanonical() != null) {
			careplanactivitydetail.addInstantiatesCanonical(c.getCarePlnActvtyDtlInstantiatesCanonical());
		}
		/******************** CarePln_Actvty_Dtl_InstantiatesUri ********************************************************************************/
		if(c.getCarePlnActvtyDtlInstantiatesUri() != null) {
			careplanactivitydetail.addInstantiatesUri(c.getCarePlnActvtyDtlInstantiatesUri());
		}
		/******************** careplanactivitydetailkind ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityKindEnumFactory careplanactivitydetailkind =  new org.hl7.fhir.r4.model.CarePlan.CarePlanActivityKindEnumFactory();
		careplanactivitydetail.setKind(careplanactivitydetailkind.fromCode(c.getCarePlnActvtyDtlKind()));

		/******************** CarePln_Actvty_Dtl_Lctn ********************************************************************************/
		if(c.getCarePlnActvtyDtlLctn() != null) {
			careplanactivitydetail.setLocation( new org.hl7.fhir.r4.model.Reference(c.getCarePlnActvtyDtlLctn()));
		}
		/******************** CarePln_Actvty_Dtl_Prfrmr ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrfrmr() != null) {
			careplanactivitydetail.addPerformer( new org.hl7.fhir.r4.model.Reference(c.getCarePlnActvtyDtlPrfrmr()));
		}
		/******************** careplanactivitydetailproductcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailproductcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		careplanactivitydetail.setProduct(careplanactivitydetailproductcodeableconcept);

		/******************** careplanactivitydetailproductcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailproductcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		careplanactivitydetailproductcodeableconcept.addCoding(careplanactivitydetailproductcodeableconceptcoding);

		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgCd() != null) {
			careplanactivitydetailproductcodeableconceptcoding.setCode(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgCd());
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgDsply() != null) {
			careplanactivitydetailproductcodeableconceptcoding.setDisplay(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgDsply());
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgSys() != null) {
			careplanactivitydetailproductcodeableconceptcoding.setSystem(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgSys());
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd() != null) {
			careplanactivitydetailproductcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgUsrSltd()));
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn() != null) {
			careplanactivitydetailproductcodeableconceptcoding.setVersion(c.getCarePlnActvtyDtlPrdctCdbleCncptCdgVrsn());
		}
		/******************** CarePln_Actvty_Dtl_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctCdbleCncptTxt() != null) {
			careplanactivitydetailproductcodeableconcept.setText(c.getCarePlnActvtyDtlPrdctCdbleCncptTxt());
		}
		/******************** CarePln_Actvty_Dtl_PrdctRfrnc ********************************************************************************/
		if(c.getCarePlnActvtyDtlPrdctRfrnc() != null) {
			careplanactivitydetail.setProduct( new org.hl7.fhir.r4.model.Reference(c.getCarePlnActvtyDtlPrdctRfrnc()));
		}
		/******************** careplanactivitydetailquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetailquantity =  new org.hl7.fhir.r4.model.Quantity();
		careplanactivitydetail.setQuantity(careplanactivitydetailquantity);

		/******************** CarePln_Actvty_Dtl_Qnty_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlQntyCd() != null) {
			careplanactivitydetailquantity.setCode(c.getCarePlnActvtyDtlQntyCd());
		}
		/******************** careplanactivitydetailquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory careplanactivitydetailquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		careplanactivitydetailquantity.setComparator(careplanactivitydetailquantitycomparator.fromCode(c.getCarePlnActvtyDtlQntyCmprtr()));

		/******************** CarePln_Actvty_Dtl_Qnty_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlQntySys() != null) {
			careplanactivitydetailquantity.setSystem(c.getCarePlnActvtyDtlQntySys());
		}
		/******************** CarePln_Actvty_Dtl_Qnty_Unt ********************************************************************************/
		if(c.getCarePlnActvtyDtlQntyUnt() != null) {
			careplanactivitydetailquantity.setUnit(c.getCarePlnActvtyDtlQntyUnt());
		}
		/******************** CarePln_Actvty_Dtl_Qnty_Vl ********************************************************************************/
		if(c.getCarePlnActvtyDtlQntyVl() != null) {
			careplanactivitydetailquantity.setValue(Double.parseDouble((c.getCarePlnActvtyDtlQntyVl())));
		}
		/******************** careplanactivitydetailreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		careplanactivitydetail.addReasonCode(careplanactivitydetailreasoncode);

		/******************** careplanactivitydetailreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		careplanactivitydetailreasoncode.addCoding(careplanactivitydetailreasoncodecoding);

		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgCd() != null) {
			careplanactivitydetailreasoncodecoding.setCode(c.getCarePlnActvtyDtlRsnCdCdgCd());
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgDsply() != null) {
			careplanactivitydetailreasoncodecoding.setDisplay(c.getCarePlnActvtyDtlRsnCdCdgDsply());
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgSys() != null) {
			careplanactivitydetailreasoncodecoding.setSystem(c.getCarePlnActvtyDtlRsnCdCdgSys());
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgUsrSltd() != null) {
			careplanactivitydetailreasoncodecoding.setUserSelected(Boolean.parseBoolean(c.getCarePlnActvtyDtlRsnCdCdgUsrSltd()));
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdCdgVrsn() != null) {
			careplanactivitydetailreasoncodecoding.setVersion(c.getCarePlnActvtyDtlRsnCdCdgVrsn());
		}
		/******************** CarePln_Actvty_Dtl_RsnCd_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnCdTxt() != null) {
			careplanactivitydetailreasoncode.setText(c.getCarePlnActvtyDtlRsnCdTxt());
		}
		/******************** CarePln_Actvty_Dtl_RsnRfrnc ********************************************************************************/
		if(c.getCarePlnActvtyDtlRsnRfrnc() != null) {
			careplanactivitydetail.addReasonReference( new org.hl7.fhir.r4.model.Reference(c.getCarePlnActvtyDtlRsnRfrnc()));
		}
		/******************** careplanactivitydetailscheduledperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanactivitydetailscheduledperiod =  new org.hl7.fhir.r4.model.Period();
		careplanactivitydetail.setScheduled(careplanactivitydetailscheduledperiod);

		/******************** CarePln_Actvty_Dtl_SchdldPrd_End ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldPrdEnd() != null) {
			java.text.SimpleDateFormat CarePln_Actvty_Dtl_SchdldPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Actvty_Dtl_SchdldPrd_Enddate = CarePln_Actvty_Dtl_SchdldPrd_Endsdf.parse(c.getCarePlnActvtyDtlSchdldPrdEnd());
			careplanactivitydetailscheduledperiod.setEnd(CarePln_Actvty_Dtl_SchdldPrd_Enddate);
		}
		/******************** CarePln_Actvty_Dtl_SchdldPrd_Strt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldPrdStrt() != null) {
			java.text.SimpleDateFormat CarePln_Actvty_Dtl_SchdldPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Actvty_Dtl_SchdldPrd_Strtdate = CarePln_Actvty_Dtl_SchdldPrd_Strtsdf.parse(c.getCarePlnActvtyDtlSchdldPrdStrt());
			careplanactivitydetailscheduledperiod.setStart(CarePln_Actvty_Dtl_SchdldPrd_Strtdate);
		}
		/******************** CarePln_Actvty_Dtl_SchdldStrgTyp ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldStrgTyp() != null) {
			careplanactivitydetail.setScheduled( new org.hl7.fhir.r4.model.StringType(c.getCarePlnActvtyDtlSchdldStrgTyp()));
		}
		/******************** careplanactivitydetailscheduledtiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing careplanactivitydetailscheduledtiming =  new org.hl7.fhir.r4.model.Timing();
		careplanactivitydetail.setScheduled(careplanactivitydetailscheduledtiming);

		/******************** careplanactivitydetailscheduledtimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailscheduledtimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		careplanactivitydetailscheduledtiming.setCode(careplanactivitydetailscheduledtimingcode);

		/******************** careplanactivitydetailscheduledtimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailscheduledtimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		careplanactivitydetailscheduledtimingcode.addCoding(careplanactivitydetailscheduledtimingcodecoding);

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgCd() != null) {
			careplanactivitydetailscheduledtimingcodecoding.setCode(c.getCarePlnActvtyDtlSchdldTmgCdCdgCd());
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgDsply() != null) {
			careplanactivitydetailscheduledtimingcodecoding.setDisplay(c.getCarePlnActvtyDtlSchdldTmgCdCdgDsply());
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgSys() != null) {
			careplanactivitydetailscheduledtimingcodecoding.setSystem(c.getCarePlnActvtyDtlSchdldTmgCdCdgSys());
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd() != null) {
			careplanactivitydetailscheduledtimingcodecoding.setUserSelected(Boolean.parseBoolean(c.getCarePlnActvtyDtlSchdldTmgCdCdgUsrSltd()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdCdgVrsn() != null) {
			careplanactivitydetailscheduledtimingcodecoding.setVersion(c.getCarePlnActvtyDtlSchdldTmgCdCdgVrsn());
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Cd_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgCdTxt() != null) {
			careplanactivitydetailscheduledtimingcode.setText(c.getCarePlnActvtyDtlSchdldTmgCdTxt());
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Evnt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgEvnt() != null) {
			java.text.SimpleDateFormat CarePln_Actvty_Dtl_SchdldTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Actvty_Dtl_SchdldTmg_Evntdate = CarePln_Actvty_Dtl_SchdldTmg_Evntsdf.parse(c.getCarePlnActvtyDtlSchdldTmgEvnt());
			careplanactivitydetailscheduledtiming.addEvent(CarePln_Actvty_Dtl_SchdldTmg_Evntdate);
		}
		/******************** careplanactivitydetailscheduledtimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent careplanactivitydetailscheduledtimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		careplanactivitydetailscheduledtiming.setRepeat(careplanactivitydetailscheduledtimingrepeat);

		/******************** careplanactivitydetailscheduledtimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration careplanactivitydetailscheduledtimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		careplanactivitydetailscheduledtimingrepeat.setBounds(careplanactivitydetailscheduledtimingrepeatboundsduration);

		/******************** careplanactivitydetailscheduledtimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanactivitydetailscheduledtimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		careplanactivitydetailscheduledtimingrepeat.setBounds(careplanactivitydetailscheduledtimingrepeatboundsperiod);

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Enddate = CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Endsdf.parse(c.getCarePlnActvtyDtlSchdldTmgRptBndsPrdEnd());
			careplanactivitydetailscheduledtimingrepeatboundsperiod.setEnd(CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Strtdate = CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Strtsdf.parse(c.getCarePlnActvtyDtlSchdldTmgRptBndsPrdStrt());
			careplanactivitydetailscheduledtimingrepeatboundsperiod.setStart(CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** careplanactivitydetailscheduledtimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range careplanactivitydetailscheduledtimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		careplanactivitydetailscheduledtimingrepeat.setBounds(careplanactivitydetailscheduledtimingrepeatboundsrange);

		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetailscheduledtimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		careplanactivitydetailscheduledtimingrepeatboundsrange.setHigh(careplanactivitydetailscheduledtimingrepeatboundsrangehigh);

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiCd() != null) {
			careplanactivitydetailscheduledtimingrepeatboundsrangehigh.setCode(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiCd());
		}
		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		careplanactivitydetailscheduledtimingrepeatboundsrangehigh.setComparator(careplanactivitydetailscheduledtimingrepeatboundsrangehighcomparator.fromCode(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiCmprtr()));

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiSys() != null) {
			careplanactivitydetailscheduledtimingrepeatboundsrangehigh.setSystem(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiSys());
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiUnt() != null) {
			careplanactivitydetailscheduledtimingrepeatboundsrangehigh.setUnit(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiUnt());
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiVl() != null) {
			careplanactivitydetailscheduledtimingrepeatboundsrangehigh.setValue(Double.parseDouble((c.getCarePlnActvtyDtlSchdldTmgRptBndsRngHiVl())));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity careplanactivitydetailscheduledtimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		careplanactivitydetailscheduledtimingrepeatboundsrange.setLow(careplanactivitydetailscheduledtimingrepeatboundsrangelow);

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwCd() != null) {
			careplanactivitydetailscheduledtimingrepeatboundsrangelow.setCode(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwCd());
		}
		/******************** careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		careplanactivitydetailscheduledtimingrepeatboundsrangelow.setComparator(careplanactivitydetailscheduledtimingrepeatboundsrangelowcomparator.fromCode(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwCmprtr()));

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwSys() != null) {
			careplanactivitydetailscheduledtimingrepeatboundsrangelow.setSystem(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwSys());
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwUnt() != null) {
			careplanactivitydetailscheduledtimingrepeatboundsrangelow.setUnit(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwUnt());
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwVl() != null) {
			careplanactivitydetailscheduledtimingrepeatboundsrangelow.setValue(Double.parseDouble((c.getCarePlnActvtyDtlSchdldTmgRptBndsRngLwVl())));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Cnt ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptCnt() != null) {
			careplanactivitydetailscheduledtimingrepeat.setCount(Integer.parseInt(c.getCarePlnActvtyDtlSchdldTmgRptCnt()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_CntMx ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptCntMx() != null) {
			careplanactivitydetailscheduledtimingrepeat.setCountMax(Integer.parseInt(c.getCarePlnActvtyDtlSchdldTmgRptCntMx()));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory careplanactivitydetailscheduledtimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		careplanactivitydetailscheduledtimingrepeat.addDayOfWeek(careplanactivitydetailscheduledtimingrepeatdayofweek.fromCode(c.getCarePlnActvtyDtlSchdldTmgRptDayOfWeek()));

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Duration ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptDuration() != null) {
			careplanactivitydetailscheduledtimingrepeat.setDuration(Double.parseDouble((c.getCarePlnActvtyDtlSchdldTmgRptDuration())));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_DurationMx ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptDurationMx() != null) {
			careplanactivitydetailscheduledtimingrepeat.setDurationMax(Double.parseDouble((c.getCarePlnActvtyDtlSchdldTmgRptDurationMx())));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory careplanactivitydetailscheduledtimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		careplanactivitydetailscheduledtimingrepeat.setDurationUnit(careplanactivitydetailscheduledtimingrepeatdurationunit.fromCode(c.getCarePlnActvtyDtlSchdldTmgRptDurationUnt()));

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Frqncy ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptFrqncy() != null) {
			careplanactivitydetailscheduledtimingrepeat.setFrequency(Integer.parseInt(c.getCarePlnActvtyDtlSchdldTmgRptFrqncy()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_FrqncyMx ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptFrqncyMx() != null) {
			careplanactivitydetailscheduledtimingrepeat.setFrequencyMax(Integer.parseInt(c.getCarePlnActvtyDtlSchdldTmgRptFrqncyMx()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Off ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptOff() != null) {
			careplanactivitydetailscheduledtimingrepeat.setOffset(Integer.parseInt(c.getCarePlnActvtyDtlSchdldTmgRptOff()));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_Prd ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptPrd() != null) {
			careplanactivitydetailscheduledtimingrepeat.setPeriod(Double.parseDouble((c.getCarePlnActvtyDtlSchdldTmgRptPrd())));
		}
		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_PrdMx ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptPrdMx() != null) {
			careplanactivitydetailscheduledtimingrepeat.setPeriodMax(Double.parseDouble((c.getCarePlnActvtyDtlSchdldTmgRptPrdMx())));
		}
		/******************** careplanactivitydetailscheduledtimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory careplanactivitydetailscheduledtimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		careplanactivitydetailscheduledtimingrepeat.setPeriodUnit(careplanactivitydetailscheduledtimingrepeatperiodunit.fromCode(c.getCarePlnActvtyDtlSchdldTmgRptPrdUnt()));

		/******************** CarePln_Actvty_Dtl_SchdldTmg_Rpt_TimeOfDay ********************************************************************************/
		if(c.getCarePlnActvtyDtlSchdldTmgRptTimeOfDay() != null) {
			careplanactivitydetailscheduledtimingrepeat.addTimeOfDay(c.getCarePlnActvtyDtlSchdldTmgRptTimeOfDay());
		}
		/******************** careplanactivitydetailscheduledtimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory careplanactivitydetailscheduledtimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		careplanactivitydetailscheduledtimingrepeat.addWhen(careplanactivitydetailscheduledtimingrepeatwhen.fromCode(c.getCarePlnActvtyDtlSchdldTmgRptWhen()));

		/******************** careplanactivitydetailstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanActivityStatusEnumFactory careplanactivitydetailstatus =  new org.hl7.fhir.r4.model.CarePlan.CarePlanActivityStatusEnumFactory();
		careplanactivitydetail.setStatus(careplanactivitydetailstatus.fromCode(c.getCarePlnActvtyDtlSts()));

		/******************** careplanactivitydetailstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivitydetailstatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		careplanactivitydetail.setStatusReason(careplanactivitydetailstatusreason);

		/******************** careplanactivitydetailstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivitydetailstatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		careplanactivitydetailstatusreason.addCoding(careplanactivitydetailstatusreasoncoding);

		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgCd() != null) {
			careplanactivitydetailstatusreasoncoding.setCode(c.getCarePlnActvtyDtlStsRsnCdgCd());
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgDsply() != null) {
			careplanactivitydetailstatusreasoncoding.setDisplay(c.getCarePlnActvtyDtlStsRsnCdgDsply());
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgSys() != null) {
			careplanactivitydetailstatusreasoncoding.setSystem(c.getCarePlnActvtyDtlStsRsnCdgSys());
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgUsrSltd() != null) {
			careplanactivitydetailstatusreasoncoding.setUserSelected(Boolean.parseBoolean(c.getCarePlnActvtyDtlStsRsnCdgUsrSltd()));
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnCdgVrsn() != null) {
			careplanactivitydetailstatusreasoncoding.setVersion(c.getCarePlnActvtyDtlStsRsnCdgVrsn());
		}
		/******************** CarePln_Actvty_Dtl_StsRsn_Txt ********************************************************************************/
		if(c.getCarePlnActvtyDtlStsRsnTxt() != null) {
			careplanactivitydetailstatusreason.setText(c.getCarePlnActvtyDtlStsRsnTxt());
		}
		/******************** careplanactivityoutcomecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanactivityoutcomecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		careplanactivity.addOutcomeCodeableConcept(careplanactivityoutcomecodeableconcept);

		/******************** careplanactivityoutcomecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanactivityoutcomecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		careplanactivityoutcomecodeableconcept.addCoding(careplanactivityoutcomecodeableconceptcoding);

		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgCd() != null) {
			careplanactivityoutcomecodeableconceptcoding.setCode(c.getCarePlnActvtyOutcomeCdbleCncptCdgCd());
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgDsply() != null) {
			careplanactivityoutcomecodeableconceptcoding.setDisplay(c.getCarePlnActvtyOutcomeCdbleCncptCdgDsply());
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgSys() != null) {
			careplanactivityoutcomecodeableconceptcoding.setSystem(c.getCarePlnActvtyOutcomeCdbleCncptCdgSys());
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd() != null) {
			careplanactivityoutcomecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCarePlnActvtyOutcomeCdbleCncptCdgUsrSltd()));
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptCdgVrsn() != null) {
			careplanactivityoutcomecodeableconceptcoding.setVersion(c.getCarePlnActvtyOutcomeCdbleCncptCdgVrsn());
		}
		/******************** CarePln_Actvty_OutcomeCdbleCncpt_Txt ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeCdbleCncptTxt() != null) {
			careplanactivityoutcomecodeableconcept.setText(c.getCarePlnActvtyOutcomeCdbleCncptTxt());
		}
		/******************** CarePln_Actvty_OutcomeRfrnc ********************************************************************************/
		if(c.getCarePlnActvtyOutcomeRfrnc() != null) {
			careplanactivity.addOutcomeReference( new org.hl7.fhir.r4.model.Reference(c.getCarePlnActvtyOutcomeRfrnc()));
		}
		/******************** careplanactivityprogress ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation careplanactivityprogress =  new org.hl7.fhir.r4.model.Annotation();
		careplanactivity.addProgress(careplanactivityprogress);

		/******************** CarePln_Actvty_Progress_AthrRfrnc ********************************************************************************/
		if(c.getCarePlnActvtyProgressAthrRfrnc() != null) {
			careplanactivityprogress.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getCarePlnActvtyProgressAthrRfrnc()));
		}
		/******************** CarePln_Actvty_Progress_AthrStrgTyp ********************************************************************************/
		if(c.getCarePlnActvtyProgressAthrStrgTyp() != null) {
			careplanactivityprogress.setAuthor( new org.hl7.fhir.r4.model.StringType(c.getCarePlnActvtyProgressAthrStrgTyp()));
		}
		/******************** CarePln_Actvty_Progress_Txt ********************************************************************************/
		if(c.getCarePlnActvtyProgressTxt() != null) {
			careplanactivityprogress.setText(c.getCarePlnActvtyProgressTxt());
		}
		/******************** CarePln_Actvty_Progress_Time ********************************************************************************/
		if(c.getCarePlnActvtyProgressTime() != null) {
			java.text.SimpleDateFormat CarePln_Actvty_Progress_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Actvty_Progress_Timedate = CarePln_Actvty_Progress_Timesdf.parse(c.getCarePlnActvtyProgressTime());
			careplanactivityprogress.setTime(CarePln_Actvty_Progress_Timedate);
		}
		/******************** CarePln_Actvty_Rfrnc ********************************************************************************/
		if(c.getCarePlnActvtyRfrnc() != null) {
			careplanactivity.setReference( new org.hl7.fhir.r4.model.Reference(c.getCarePlnActvtyRfrnc()));
		}
		/******************** CarePln_Addres ********************************************************************************/
		if(c.getCarePlnAddres() != null) {
			careplan.addAddresses( new org.hl7.fhir.r4.model.Reference(c.getCarePlnAddres()));
		}
		/******************** CarePln_Athr ********************************************************************************/
		if(c.getCarePlnAthr() != null) {
			careplan.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getCarePlnAthr()));
		}
		/******************** CarePln_BasedOn ********************************************************************************/
		if(c.getCarePlnBasedOn() != null) {
			careplan.addBasedOn( new org.hl7.fhir.r4.model.Reference(c.getCarePlnBasedOn()));
		}
		/******************** CarePln_CareTeam ********************************************************************************/
		if(c.getCarePlnCareTeam() != null) {
			careplan.addCareTeam( new org.hl7.fhir.r4.model.Reference(c.getCarePlnCareTeam()));
		}
		/******************** careplancategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplancategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		careplan.addCategory(careplancategory);

		/******************** careplancategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplancategorycoding =  new org.hl7.fhir.r4.model.Coding();
		careplancategory.addCoding(careplancategorycoding);

		/******************** CarePln_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnCtgryCdgCd() != null) {
			careplancategorycoding.setCode(c.getCarePlnCtgryCdgCd());
		}
		/******************** CarePln_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnCtgryCdgDsply() != null) {
			careplancategorycoding.setDisplay(c.getCarePlnCtgryCdgDsply());
		}
		/******************** CarePln_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnCtgryCdgSys() != null) {
			careplancategorycoding.setSystem(c.getCarePlnCtgryCdgSys());
		}
		/******************** CarePln_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnCtgryCdgUsrSltd() != null) {
			careplancategorycoding.setUserSelected(Boolean.parseBoolean(c.getCarePlnCtgryCdgUsrSltd()));
		}
		/******************** CarePln_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnCtgryCdgVrsn() != null) {
			careplancategorycoding.setVersion(c.getCarePlnCtgryCdgVrsn());
		}
		/******************** CarePln_Ctgry_Txt ********************************************************************************/
		if(c.getCarePlnCtgryTxt() != null) {
			careplancategory.setText(c.getCarePlnCtgryTxt());
		}
		/******************** CarePln_Contributor ********************************************************************************/
		if(c.getCarePlnContributor() != null) {
			careplan.addContributor( new org.hl7.fhir.r4.model.Reference(c.getCarePlnContributor()));
		}
		/******************** CarePln_Created ********************************************************************************/
		if(c.getCarePlnCreated() != null) {
			java.text.SimpleDateFormat CarePln_Createdsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Createddate = CarePln_Createdsdf.parse(c.getCarePlnCreated());
			careplan.setCreated(CarePln_Createddate);
		}
		/******************** CarePln_Dscrptn ********************************************************************************/
		if(c.getCarePlnDscrptn() != null) {
			careplan.setDescription(c.getCarePlnDscrptn());
		}
		/******************** CarePln_Enc ********************************************************************************/
		if(c.getCarePlnEnc() != null) {
			careplan.setEncounter( new org.hl7.fhir.r4.model.Reference(c.getCarePlnEnc()));
		}
		/******************** CarePln_Goal ********************************************************************************/
		if(c.getCarePlnGoal() != null) {
			careplan.addGoal( new org.hl7.fhir.r4.model.Reference(c.getCarePlnGoal()));
		}
		/******************** careplanidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier careplanidentifier =  new org.hl7.fhir.r4.model.Identifier();
		careplan.addIdentifier(careplanidentifier);

		/******************** CarePln_Id_Assigner ********************************************************************************/
		if(c.getCarePlnIdAssigner() != null) {
			careplanidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCarePlnIdAssigner()));
		}
		/******************** careplanidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		careplanidentifier.setPeriod(careplanidentifierperiod);

		/******************** CarePln_Id_Prd_End ********************************************************************************/
		if(c.getCarePlnIdPrdEnd() != null) {
			java.text.SimpleDateFormat CarePln_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Id_Prd_Enddate = CarePln_Id_Prd_Endsdf.parse(c.getCarePlnIdPrdEnd());
			careplanidentifierperiod.setEnd(CarePln_Id_Prd_Enddate);
		}
		/******************** CarePln_Id_Prd_Strt ********************************************************************************/
		if(c.getCarePlnIdPrdStrt() != null) {
			java.text.SimpleDateFormat CarePln_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Id_Prd_Strtdate = CarePln_Id_Prd_Strtsdf.parse(c.getCarePlnIdPrdStrt());
			careplanidentifierperiod.setStart(CarePln_Id_Prd_Strtdate);
		}
		/******************** CarePln_Id_Sys ********************************************************************************/
		if(c.getCarePlnIdSys() != null) {
			careplanidentifier.setSystem(c.getCarePlnIdSys());
		}
		/******************** careplanidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept careplanidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		careplanidentifier.setType(careplanidentifiertype);

		/******************** careplanidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding careplanidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		careplanidentifiertype.addCoding(careplanidentifiertypecoding);

		/******************** CarePln_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCarePlnIdTypCdgCd() != null) {
			careplanidentifiertypecoding.setCode(c.getCarePlnIdTypCdgCd());
		}
		/******************** CarePln_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCarePlnIdTypCdgDsply() != null) {
			careplanidentifiertypecoding.setDisplay(c.getCarePlnIdTypCdgDsply());
		}
		/******************** CarePln_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCarePlnIdTypCdgSys() != null) {
			careplanidentifiertypecoding.setSystem(c.getCarePlnIdTypCdgSys());
		}
		/******************** CarePln_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCarePlnIdTypCdgUsrSltd() != null) {
			careplanidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCarePlnIdTypCdgUsrSltd()));
		}
		/******************** CarePln_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCarePlnIdTypCdgVrsn() != null) {
			careplanidentifiertypecoding.setVersion(c.getCarePlnIdTypCdgVrsn());
		}
		/******************** CarePln_Id_Typ_Txt ********************************************************************************/
		if(c.getCarePlnIdTypTxt() != null) {
			careplanidentifiertype.setText(c.getCarePlnIdTypTxt());
		}
		/******************** careplanidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory careplanidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		careplanidentifier.setUse(careplanidentifieruse.fromCode(c.getCarePlnIdUse()));

		/******************** CarePln_Id_Vl ********************************************************************************/
		if(c.getCarePlnIdVl() != null) {
			careplanidentifier.setValue(c.getCarePlnIdVl());
		}
		/******************** CarePln_InstantiatesCanonical ********************************************************************************/
		if(c.getCarePlnInstantiatesCanonical() != null) {
			careplan.addInstantiatesCanonical(c.getCarePlnInstantiatesCanonical());
		}
		/******************** CarePln_InstantiatesUri ********************************************************************************/
		if(c.getCarePlnInstantiatesUri() != null) {
			careplan.addInstantiatesUri(c.getCarePlnInstantiatesUri());
		}
		/******************** careplanintent ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanIntentEnumFactory careplanintent =  new org.hl7.fhir.r4.model.CarePlan.CarePlanIntentEnumFactory();
		careplan.setIntent(careplanintent.fromCode(c.getCarePlnIntent()));

		/******************** careplannote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation careplannote =  new org.hl7.fhir.r4.model.Annotation();
		careplan.addNote(careplannote);

		/******************** CarePln_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCarePlnNtAthrRfrnc() != null) {
			careplannote.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getCarePlnNtAthrRfrnc()));
		}
		/******************** CarePln_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCarePlnNtAthrStrgTyp() != null) {
			careplannote.setAuthor( new org.hl7.fhir.r4.model.StringType(c.getCarePlnNtAthrStrgTyp()));
		}
		/******************** CarePln_Nt_Txt ********************************************************************************/
		if(c.getCarePlnNtTxt() != null) {
			careplannote.setText(c.getCarePlnNtTxt());
		}
		/******************** CarePln_Nt_Time ********************************************************************************/
		if(c.getCarePlnNtTime() != null) {
			java.text.SimpleDateFormat CarePln_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Nt_Timedate = CarePln_Nt_Timesdf.parse(c.getCarePlnNtTime());
			careplannote.setTime(CarePln_Nt_Timedate);
		}
		/******************** CarePln_PartOf ********************************************************************************/
		if(c.getCarePlnPartOf() != null) {
			careplan.addPartOf( new org.hl7.fhir.r4.model.Reference(c.getCarePlnPartOf()));
		}
		/******************** careplanperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period careplanperiod =  new org.hl7.fhir.r4.model.Period();
		careplan.setPeriod(careplanperiod);

		/******************** CarePln_Prd_End ********************************************************************************/
		if(c.getCarePlnPrdEnd() != null) {
			java.text.SimpleDateFormat CarePln_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Prd_Enddate = CarePln_Prd_Endsdf.parse(c.getCarePlnPrdEnd());
			careplanperiod.setEnd(CarePln_Prd_Enddate);
		}
		/******************** CarePln_Prd_Strt ********************************************************************************/
		if(c.getCarePlnPrdStrt() != null) {
			java.text.SimpleDateFormat CarePln_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CarePln_Prd_Strtdate = CarePln_Prd_Strtsdf.parse(c.getCarePlnPrdStrt());
			careplanperiod.setStart(CarePln_Prd_Strtdate);
		}
		/******************** CarePln_Replaces ********************************************************************************/
		if(c.getCarePlnReplaces() != null) {
			careplan.addReplaces( new org.hl7.fhir.r4.model.Reference(c.getCarePlnReplaces()));
		}
		/******************** careplanstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CarePlan.CarePlanStatusEnumFactory careplanstatus =  new org.hl7.fhir.r4.model.CarePlan.CarePlanStatusEnumFactory();
		careplan.setStatus(careplanstatus.fromCode(c.getCarePlnSts()));

		/******************** CarePln_Sbjct ********************************************************************************/
		if(c.getCarePlnSbjct() != null) {
			careplan.setSubject( new org.hl7.fhir.r4.model.Reference(c.getCarePlnSbjct()));
		}
		/******************** CarePln_SprtingInfo ********************************************************************************/
		if(c.getCarePlnSprtingInfo() != null) {
			careplan.addSupportingInfo( new org.hl7.fhir.r4.model.Reference(c.getCarePlnSprtingInfo()));
		}
		/******************** CarePln_Ttl ********************************************************************************/
		if(c.getCarePlnTtl() != null) {
			careplan.setTitle(c.getCarePlnTtl());
		}
		return careplan;
	}
}
