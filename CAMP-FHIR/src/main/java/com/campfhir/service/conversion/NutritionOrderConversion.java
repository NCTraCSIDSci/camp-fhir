package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.NutritionOrder;
public class NutritionOrderConversion 
{
	public org.hl7.fhir.r4.model.NutritionOrder NutritionOrders(NutritionOrder n) throws ParseException
	{
		org.hl7.fhir.r4.model.NutritionOrder nutritionorder = new org.hl7.fhir.r4.model.NutritionOrder();

		/******************** id ********************************************************************************/
		nutritionorder.setId(n.getId());

		/******************** NtritnOrdr_AlrgyIntolerance ********************************************************************************/
		if(n.getNtritnOrdrAlrgyIntolerance() != null) {
			nutritionorder.addAllergyIntolerance( new org.hl7.fhir.r4.model.Reference(n.getNtritnOrdrAlrgyIntolerance()));
		}
		/******************** NtritnOrdr_DtTime ********************************************************************************/
		if(n.getNtritnOrdrDtTime() != null) {
			java.text.SimpleDateFormat NtritnOrdr_DtTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_DtTimedate = NtritnOrdr_DtTimesdf.parse(n.getNtritnOrdrDtTime());
			nutritionorder.setDateTime(NtritnOrdr_DtTimedate);
		}
		/******************** NtritnOrdr_Enc ********************************************************************************/
		if(n.getNtritnOrdrEnc() != null) {
			nutritionorder.setEncounter( new org.hl7.fhir.r4.model.Reference(n.getNtritnOrdrEnc()));
		}
		/******************** nutritionorderenteralformula ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent nutritionorderenteralformula =  new org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent();
		nutritionorder.setEnteralFormula(nutritionorderenteralformula);

		/******************** NtritnOrdr_EnteralFrmula_AddtvPrdctNm ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvPrdctNm() != null) {
			nutritionorderenteralformula.setAdditiveProductName(n.getNtritnOrdrEnteralFrmulaAddtvPrdctNm());
		}
		/******************** nutritionorderenteralformulaadditivetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformulaadditivetype =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderenteralformula.setAdditiveType(nutritionorderenteralformulaadditivetype);

		/******************** nutritionorderenteralformulaadditivetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderenteralformulaadditivetypecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderenteralformulaadditivetype.addCoding(nutritionorderenteralformulaadditivetypecoding);

		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgCd() != null) {
			nutritionorderenteralformulaadditivetypecoding.setCode(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgCd());
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgDsply() != null) {
			nutritionorderenteralformulaadditivetypecoding.setDisplay(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgDsply());
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgSys() != null) {
			nutritionorderenteralformulaadditivetypecoding.setSystem(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgUsrSltd() != null) {
			nutritionorderenteralformulaadditivetypecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgUsrSltd()));
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgVrsn() != null) {
			nutritionorderenteralformulaadditivetypecoding.setVersion(n.getNtritnOrdrEnteralFrmulaAddtvTypCdgVrsn());
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Txt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAddtvTypTxt() != null) {
			nutritionorderenteralformulaadditivetype.setText(n.getNtritnOrdrEnteralFrmulaAddtvTypTxt());
		}
		/******************** nutritionorderenteralformulaadministration ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent nutritionorderenteralformulaadministration =  new org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent();
		nutritionorderenteralformula.addAdministration(nutritionorderenteralformulaadministration);

		/******************** nutritionorderenteralformulaadministrationquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationquantity =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderenteralformulaadministration.setQuantity(nutritionorderenteralformulaadministrationquantity);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyCd() != null) {
			nutritionorderenteralformulaadministrationquantity.setCode(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyCd());
		}
		/******************** nutritionorderenteralformulaadministrationquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderenteralformulaadministrationquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderenteralformulaadministrationquantity.setComparator(nutritionorderenteralformulaadministrationquantitycomparator.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyCmprtr()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnQntySys() != null) {
			nutritionorderenteralformulaadministrationquantity.setSystem(n.getNtritnOrdrEnteralFrmulaAdmnstnQntySys());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyUnt() != null) {
			nutritionorderenteralformulaadministrationquantity.setUnit(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyUnt());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnQntyVl() != null) {
			nutritionorderenteralformulaadministrationquantity.setValue(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnQntyVl())));
		}
		/******************** nutritionorderenteralformulaadministrationratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationratequantity =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderenteralformulaadministration.setRate(nutritionorderenteralformulaadministrationratequantity);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyCd() != null) {
			nutritionorderenteralformulaadministrationratequantity.setCode(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyCd());
		}
		/******************** nutritionorderenteralformulaadministrationratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderenteralformulaadministrationratequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderenteralformulaadministrationratequantity.setComparator(nutritionorderenteralformulaadministrationratequantitycomparator.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyCmprtr()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntySys() != null) {
			nutritionorderenteralformulaadministrationratequantity.setSystem(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntySys());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyUnt() != null) {
			nutritionorderenteralformulaadministrationratequantity.setUnit(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyUnt());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyVl() != null) {
			nutritionorderenteralformulaadministrationratequantity.setValue(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnRtQntyVl())));
		}
		/******************** nutritionorderenteralformulaadministrationrateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio nutritionorderenteralformulaadministrationrateratio =  new org.hl7.fhir.r4.model.Ratio();
		nutritionorderenteralformulaadministration.setRate(nutritionorderenteralformulaadministrationrateratio);

		/******************** nutritionorderenteralformulaadministrationrateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationrateratiodenominator =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderenteralformulaadministrationrateratio.setDenominator(nutritionorderenteralformulaadministrationrateratiodenominator);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCd() != null) {
			nutritionorderenteralformulaadministrationrateratiodenominator.setCode(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCd());
		}
		/******************** nutritionorderenteralformulaadministrationrateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderenteralformulaadministrationrateratiodenominatorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderenteralformulaadministrationrateratiodenominator.setComparator(nutritionorderenteralformulaadministrationrateratiodenominatorcomparator.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCmprtr()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrSys() != null) {
			nutritionorderenteralformulaadministrationrateratiodenominator.setSystem(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrUnt() != null) {
			nutritionorderenteralformulaadministrationrateratiodenominator.setUnit(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrUnt());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrVl() != null) {
			nutritionorderenteralformulaadministrationrateratiodenominator.setValue(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrVl())));
		}
		/******************** nutritionorderenteralformulaadministrationraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationraterationumerator =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderenteralformulaadministrationrateratio.setNumerator(nutritionorderenteralformulaadministrationraterationumerator);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCd() != null) {
			nutritionorderenteralformulaadministrationraterationumerator.setCode(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCd());
		}
		/******************** nutritionorderenteralformulaadministrationraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderenteralformulaadministrationraterationumeratorcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderenteralformulaadministrationraterationumerator.setComparator(nutritionorderenteralformulaadministrationraterationumeratorcomparator.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCmprtr()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrSys() != null) {
			nutritionorderenteralformulaadministrationraterationumerator.setSystem(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrUnt() != null) {
			nutritionorderenteralformulaadministrationraterationumerator.setUnit(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrUnt());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrVl() != null) {
			nutritionorderenteralformulaadministrationraterationumerator.setValue(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrVl())));
		}
		/******************** nutritionorderenteralformulaadministrationschedule ********************************************************************************/
		org.hl7.fhir.r4.model.Timing nutritionorderenteralformulaadministrationschedule =  new org.hl7.fhir.r4.model.Timing();
		nutritionorderenteralformulaadministration.setSchedule(nutritionorderenteralformulaadministrationschedule);

		/******************** nutritionorderenteralformulaadministrationschedulecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformulaadministrationschedulecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderenteralformulaadministrationschedule.setCode(nutritionorderenteralformulaadministrationschedulecode);

		/******************** nutritionorderenteralformulaadministrationschedulecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderenteralformulaadministrationschedulecodecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderenteralformulaadministrationschedulecode.addCoding(nutritionorderenteralformulaadministrationschedulecodecoding);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd() != null) {
			nutritionorderenteralformulaadministrationschedulecodecoding.setCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply() != null) {
			nutritionorderenteralformulaadministrationschedulecodecoding.setDisplay(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys() != null) {
			nutritionorderenteralformulaadministrationschedulecodecoding.setSystem(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd() != null) {
			nutritionorderenteralformulaadministrationschedulecodecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn() != null) {
			nutritionorderenteralformulaadministrationschedulecodecoding.setVersion(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Txt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdTxt() != null) {
			nutritionorderenteralformulaadministrationschedulecode.setText(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlCdTxt());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Evnt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlEvnt() != null) {
			java.text.SimpleDateFormat NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Evntdate = NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Evntsdf.parse(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlEvnt());
			nutritionorderenteralformulaadministrationschedule.addEvent(NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Evntdate);
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent nutritionorderenteralformulaadministrationschedulerepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		nutritionorderenteralformulaadministrationschedule.setRepeat(nutritionorderenteralformulaadministrationschedulerepeat);

		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration nutritionorderenteralformulaadministrationschedulerepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		nutritionorderenteralformulaadministrationschedulerepeat.setBounds(nutritionorderenteralformulaadministrationschedulerepeatboundsduration);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCd() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsduration.setCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCd());
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderenteralformulaadministrationschedulerepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderenteralformulaadministrationschedulerepeatboundsduration.setComparator(nutritionorderenteralformulaadministrationschedulerepeatboundsdurationcomparator.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationCmprtr()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationSys() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsduration.setSystem(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationUnt() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsduration.setUnit(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationUnt());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsDuration_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationVl() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsduration.setValue(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsDurationVl())));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionorderenteralformulaadministrationschedulerepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		nutritionorderenteralformulaadministrationschedulerepeat.setBounds(nutritionorderenteralformulaadministrationschedulerepeatboundsperiod);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Enddate = NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Endsdf.parse(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdEnd());
			nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.setEnd(NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Enddate);
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Strtdate = NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Strtsdf.parse(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdStrt());
			nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.setStart(NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Strtdate);
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range nutritionorderenteralformulaadministrationschedulerepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		nutritionorderenteralformulaadministrationschedulerepeat.setBounds(nutritionorderenteralformulaadministrationschedulerepeatboundsrange);

		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderenteralformulaadministrationschedulerepeatboundsrange.setHigh(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCd() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.setCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCd());
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.setComparator(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCmprtr()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiSys() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.setSystem(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiUnt() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.setUnit(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiUnt());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiVl() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.setValue(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiVl())));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderenteralformulaadministrationschedulerepeatboundsrange.setLow(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow);

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCd() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.setCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCd());
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.setComparator(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCmprtr()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwSys() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.setSystem(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwUnt() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.setUnit(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwUnt());
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwVl() != null) {
			nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.setValue(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwVl())));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Cnt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCnt() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.setCount(Integer.parseInt(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCnt()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_CntMx ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCntMx() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.setCountMax(Integer.parseInt(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCntMx()));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory nutritionorderenteralformulaadministrationschedulerepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		nutritionorderenteralformulaadministrationschedulerepeat.addDayOfWeek(nutritionorderenteralformulaadministrationschedulerepeatdayofweek.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDayOfWeek()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Duration ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDuration() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.setDuration(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDuration())));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_DurationMx ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationMx() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.setDurationMax(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationMx())));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory nutritionorderenteralformulaadministrationschedulerepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		nutritionorderenteralformulaadministrationschedulerepeat.setDurationUnit(nutritionorderenteralformulaadministrationschedulerepeatdurationunit.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationUnt()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Frqncy ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncy() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.setFrequency(Integer.parseInt(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncy()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncyMx() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.setFrequencyMax(Integer.parseInt(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncyMx()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Off ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptOff() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.setOffset(Integer.parseInt(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptOff()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Prd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrd() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.setPeriod(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrd())));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_PrdMx ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdMx() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.setPeriodMax(new java.math.BigDecimal((n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdMx())));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory nutritionorderenteralformulaadministrationschedulerepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		nutritionorderenteralformulaadministrationschedulerepeat.setPeriodUnit(nutritionorderenteralformulaadministrationschedulerepeatperiodunit.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdUnt()));

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_TimeOfDay ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptTimeOfDay() != null) {
			nutritionorderenteralformulaadministrationschedulerepeat.addTimeOfDay(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptTimeOfDay());
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory nutritionorderenteralformulaadministrationschedulerepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		nutritionorderenteralformulaadministrationschedulerepeat.addWhen(nutritionorderenteralformulaadministrationschedulerepeatwhen.fromCode(n.getNtritnOrdrEnteralFrmulaAdmnstnSchdlRptWhen()));

		/******************** NtritnOrdr_EnteralFrmula_AdmnstnInstrctn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaAdmnstnInstrctn() != null) {
			nutritionorderenteralformula.setAdministrationInstruction(n.getNtritnOrdrEnteralFrmulaAdmnstnInstrctn());
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaPrdctNm ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaPrdctNm() != null) {
			nutritionorderenteralformula.setBaseFormulaProductName(n.getNtritnOrdrEnteralFrmulaBaseFrmulaPrdctNm());
		}
		/******************** nutritionorderenteralformulabaseformulatype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformulabaseformulatype =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderenteralformula.setBaseFormulaType(nutritionorderenteralformulabaseformulatype);

		/******************** nutritionorderenteralformulabaseformulatypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderenteralformulabaseformulatypecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderenteralformulabaseformulatype.addCoding(nutritionorderenteralformulabaseformulatypecoding);

		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgCd() != null) {
			nutritionorderenteralformulabaseformulatypecoding.setCode(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgCd());
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgDsply() != null) {
			nutritionorderenteralformulabaseformulatypecoding.setDisplay(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgDsply());
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgSys() != null) {
			nutritionorderenteralformulabaseformulatypecoding.setSystem(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgUsrSltd() != null) {
			nutritionorderenteralformulabaseformulatypecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgUsrSltd()));
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgVrsn() != null) {
			nutritionorderenteralformulabaseformulatypecoding.setVersion(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgVrsn());
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Txt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypTxt() != null) {
			nutritionorderenteralformulabaseformulatype.setText(n.getNtritnOrdrEnteralFrmulaBaseFrmulaTypTxt());
		}
		/******************** nutritionorderenteralformulacaloricdensity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulacaloricdensity =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderenteralformula.setCaloricDensity(nutritionorderenteralformulacaloricdensity);

		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaCaloricDensityCd() != null) {
			nutritionorderenteralformulacaloricdensity.setCode(n.getNtritnOrdrEnteralFrmulaCaloricDensityCd());
		}
		/******************** nutritionorderenteralformulacaloricdensitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderenteralformulacaloricdensitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderenteralformulacaloricdensity.setComparator(nutritionorderenteralformulacaloricdensitycomparator.fromCode(n.getNtritnOrdrEnteralFrmulaCaloricDensityCmprtr()));

		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaCaloricDensitySys() != null) {
			nutritionorderenteralformulacaloricdensity.setSystem(n.getNtritnOrdrEnteralFrmulaCaloricDensitySys());
		}
		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaCaloricDensityUnt() != null) {
			nutritionorderenteralformulacaloricdensity.setUnit(n.getNtritnOrdrEnteralFrmulaCaloricDensityUnt());
		}
		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaCaloricDensityVl() != null) {
			nutritionorderenteralformulacaloricdensity.setValue(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaCaloricDensityVl())));
		}
		/******************** nutritionorderenteralformulamaxvolumetodeliver ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulamaxvolumetodeliver =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderenteralformula.setMaxVolumeToDeliver(nutritionorderenteralformulamaxvolumetodeliver);

		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCd() != null) {
			nutritionorderenteralformulamaxvolumetodeliver.setCode(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCd());
		}
		/******************** nutritionorderenteralformulamaxvolumetodelivercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderenteralformulamaxvolumetodelivercomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderenteralformulamaxvolumetodeliver.setComparator(nutritionorderenteralformulamaxvolumetodelivercomparator.fromCode(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverCmprtr()));

		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverSys() != null) {
			nutritionorderenteralformulamaxvolumetodeliver.setSystem(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Unt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverUnt() != null) {
			nutritionorderenteralformulamaxvolumetodeliver.setUnit(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverUnt());
		}
		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Vl ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverVl() != null) {
			nutritionorderenteralformulamaxvolumetodeliver.setValue(Double.parseDouble((n.getNtritnOrdrEnteralFrmulaMxVolumeToDeliverVl())));
		}
		/******************** nutritionorderenteralformularouteofadministration ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformularouteofadministration =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderenteralformula.setRouteofAdministration(nutritionorderenteralformularouteofadministration);

		/******************** nutritionorderenteralformularouteofadministrationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderenteralformularouteofadministrationcoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderenteralformularouteofadministration.addCoding(nutritionorderenteralformularouteofadministrationcoding);

		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgCd() != null) {
			nutritionorderenteralformularouteofadministrationcoding.setCode(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgCd());
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgDsply() != null) {
			nutritionorderenteralformularouteofadministrationcoding.setDisplay(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgDsply());
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgSys() != null) {
			nutritionorderenteralformularouteofadministrationcoding.setSystem(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgSys());
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgUsrSltd() != null) {
			nutritionorderenteralformularouteofadministrationcoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgUsrSltd()));
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgVrsn() != null) {
			nutritionorderenteralformularouteofadministrationcoding.setVersion(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgVrsn());
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Txt ********************************************************************************/
		if(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnTxt() != null) {
			nutritionorderenteralformularouteofadministration.setText(n.getNtritnOrdrEnteralFrmulaRouteofAdmnstnTxt());
		}
		/******************** nutritionorderexcludefoodmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderexcludefoodmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorder.addExcludeFoodModifier(nutritionorderexcludefoodmodifier);

		/******************** nutritionorderexcludefoodmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderexcludefoodmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderexcludefoodmodifier.addCoding(nutritionorderexcludefoodmodifiercoding);

		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgCd() != null) {
			nutritionorderexcludefoodmodifiercoding.setCode(n.getNtritnOrdrExcludeFoodMdfrCdgCd());
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgDsply() != null) {
			nutritionorderexcludefoodmodifiercoding.setDisplay(n.getNtritnOrdrExcludeFoodMdfrCdgDsply());
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgSys() != null) {
			nutritionorderexcludefoodmodifiercoding.setSystem(n.getNtritnOrdrExcludeFoodMdfrCdgSys());
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgUsrSltd() != null) {
			nutritionorderexcludefoodmodifiercoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrExcludeFoodMdfrCdgUsrSltd()));
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrCdgVrsn() != null) {
			nutritionorderexcludefoodmodifiercoding.setVersion(n.getNtritnOrdrExcludeFoodMdfrCdgVrsn());
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Txt ********************************************************************************/
		if(n.getNtritnOrdrExcludeFoodMdfrTxt() != null) {
			nutritionorderexcludefoodmodifier.setText(n.getNtritnOrdrExcludeFoodMdfrTxt());
		}
		/******************** nutritionorderfoodpreferencemodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderfoodpreferencemodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorder.addFoodPreferenceModifier(nutritionorderfoodpreferencemodifier);

		/******************** nutritionorderfoodpreferencemodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderfoodpreferencemodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderfoodpreferencemodifier.addCoding(nutritionorderfoodpreferencemodifiercoding);

		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgCd() != null) {
			nutritionorderfoodpreferencemodifiercoding.setCode(n.getNtritnOrdrFoodPreferenceMdfrCdgCd());
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgDsply() != null) {
			nutritionorderfoodpreferencemodifiercoding.setDisplay(n.getNtritnOrdrFoodPreferenceMdfrCdgDsply());
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgSys() != null) {
			nutritionorderfoodpreferencemodifiercoding.setSystem(n.getNtritnOrdrFoodPreferenceMdfrCdgSys());
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgUsrSltd() != null) {
			nutritionorderfoodpreferencemodifiercoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrFoodPreferenceMdfrCdgUsrSltd()));
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrCdgVrsn() != null) {
			nutritionorderfoodpreferencemodifiercoding.setVersion(n.getNtritnOrdrFoodPreferenceMdfrCdgVrsn());
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Txt ********************************************************************************/
		if(n.getNtritnOrdrFoodPreferenceMdfrTxt() != null) {
			nutritionorderfoodpreferencemodifier.setText(n.getNtritnOrdrFoodPreferenceMdfrTxt());
		}
		/******************** nutritionorderidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier nutritionorderidentifier =  new org.hl7.fhir.r4.model.Identifier();
		nutritionorder.addIdentifier(nutritionorderidentifier);

		/******************** NtritnOrdr_Id_Assigner ********************************************************************************/
		if(n.getNtritnOrdrIdAssigner() != null) {
			nutritionorderidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(n.getNtritnOrdrIdAssigner()));
		}
		/******************** nutritionorderidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionorderidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		nutritionorderidentifier.setPeriod(nutritionorderidentifierperiod);

		/******************** NtritnOrdr_Id_Prd_End ********************************************************************************/
		if(n.getNtritnOrdrIdPrdEnd() != null) {
			java.text.SimpleDateFormat NtritnOrdr_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_Id_Prd_Enddate = NtritnOrdr_Id_Prd_Endsdf.parse(n.getNtritnOrdrIdPrdEnd());
			nutritionorderidentifierperiod.setEnd(NtritnOrdr_Id_Prd_Enddate);
		}
		/******************** NtritnOrdr_Id_Prd_Strt ********************************************************************************/
		if(n.getNtritnOrdrIdPrdStrt() != null) {
			java.text.SimpleDateFormat NtritnOrdr_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_Id_Prd_Strtdate = NtritnOrdr_Id_Prd_Strtsdf.parse(n.getNtritnOrdrIdPrdStrt());
			nutritionorderidentifierperiod.setStart(NtritnOrdr_Id_Prd_Strtdate);
		}
		/******************** NtritnOrdr_Id_Sys ********************************************************************************/
		if(n.getNtritnOrdrIdSys() != null) {
			nutritionorderidentifier.setSystem(n.getNtritnOrdrIdSys());
		}
		/******************** nutritionorderidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderidentifier.setType(nutritionorderidentifiertype);

		/******************** nutritionorderidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderidentifiertype.addCoding(nutritionorderidentifiertypecoding);

		/******************** NtritnOrdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgCd() != null) {
			nutritionorderidentifiertypecoding.setCode(n.getNtritnOrdrIdTypCdgCd());
		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgDsply() != null) {
			nutritionorderidentifiertypecoding.setDisplay(n.getNtritnOrdrIdTypCdgDsply());
		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgSys() != null) {
			nutritionorderidentifiertypecoding.setSystem(n.getNtritnOrdrIdTypCdgSys());
		}
		/******************** NtritnOrdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgUsrSltd() != null) {
			nutritionorderidentifiertypecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrIdTypCdgUsrSltd()));
		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrIdTypCdgVrsn() != null) {
			nutritionorderidentifiertypecoding.setVersion(n.getNtritnOrdrIdTypCdgVrsn());
		}
		/******************** NtritnOrdr_Id_Typ_Txt ********************************************************************************/
		if(n.getNtritnOrdrIdTypTxt() != null) {
			nutritionorderidentifiertype.setText(n.getNtritnOrdrIdTypTxt());
		}
		/******************** nutritionorderidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory nutritionorderidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		nutritionorderidentifier.setUse(nutritionorderidentifieruse.fromCode(n.getNtritnOrdrIdUse()));

		/******************** NtritnOrdr_Id_Vl ********************************************************************************/
		if(n.getNtritnOrdrIdVl() != null) {
			nutritionorderidentifier.setValue(n.getNtritnOrdrIdVl());
		}
		/******************** NtritnOrdr_Instantiates ********************************************************************************/
		if(n.getNtritnOrdrInstantiates() != null) {
			nutritionorder.addInstantiates(n.getNtritnOrdrInstantiates());
		}
		/******************** NtritnOrdr_InstantiatesCanonical ********************************************************************************/
		if(n.getNtritnOrdrInstantiatesCanonical() != null) {
			nutritionorder.addInstantiatesCanonical(n.getNtritnOrdrInstantiatesCanonical());
		}
		/******************** NtritnOrdr_InstantiatesUri ********************************************************************************/
		if(n.getNtritnOrdrInstantiatesUri() != null) {
			nutritionorder.addInstantiatesUri(n.getNtritnOrdrInstantiatesUri());
		}
		/******************** nutritionorderintent ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritiionOrderIntentEnumFactory nutritionorderintent =  new org.hl7.fhir.r4.model.NutritionOrder.NutritiionOrderIntentEnumFactory();
		nutritionorder.setIntent(nutritionorderintent.fromCode(n.getNtritnOrdrIntent()));

		/******************** nutritionordernote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation nutritionordernote =  new org.hl7.fhir.r4.model.Annotation();
		nutritionorder.addNote(nutritionordernote);

		/******************** NtritnOrdr_Nt_AthrRfrnc ********************************************************************************/
		if(n.getNtritnOrdrNtAthrRfrnc() != null) {
			nutritionordernote.setAuthor( new org.hl7.fhir.r4.model.Reference(n.getNtritnOrdrNtAthrRfrnc()));
		}
		/******************** NtritnOrdr_Nt_AthrStrgTyp ********************************************************************************/
		if(n.getNtritnOrdrNtAthrStrgTyp() != null) {
			nutritionordernote.setAuthor( new org.hl7.fhir.r4.model.StringType(n.getNtritnOrdrNtAthrStrgTyp()));
		}
		/******************** NtritnOrdr_Nt_Txt ********************************************************************************/
		if(n.getNtritnOrdrNtTxt() != null) {
			nutritionordernote.setText(n.getNtritnOrdrNtTxt());
		}
		/******************** NtritnOrdr_Nt_Time ********************************************************************************/
		if(n.getNtritnOrdrNtTime() != null) {
			java.text.SimpleDateFormat NtritnOrdr_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_Nt_Timedate = NtritnOrdr_Nt_Timesdf.parse(n.getNtritnOrdrNtTime());
			nutritionordernote.setTime(NtritnOrdr_Nt_Timedate);
		}
		/******************** nutritionorderoraldiet ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent nutritionorderoraldiet =  new org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent();
		nutritionorder.setOralDiet(nutritionorderoraldiet);

		/******************** nutritionorderoraldietfluidconsistencytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldietfluidconsistencytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderoraldiet.addFluidConsistencyType(nutritionorderoraldietfluidconsistencytype);

		/******************** nutritionorderoraldietfluidconsistencytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldietfluidconsistencytypecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderoraldietfluidconsistencytype.addCoding(nutritionorderoraldietfluidconsistencytypecoding);

		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgCd() != null) {
			nutritionorderoraldietfluidconsistencytypecoding.setCode(n.getNtritnOrdrOralDietFluidConsistencyTypCdgCd());
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgDsply() != null) {
			nutritionorderoraldietfluidconsistencytypecoding.setDisplay(n.getNtritnOrdrOralDietFluidConsistencyTypCdgDsply());
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgSys() != null) {
			nutritionorderoraldietfluidconsistencytypecoding.setSystem(n.getNtritnOrdrOralDietFluidConsistencyTypCdgSys());
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd() != null) {
			nutritionorderoraldietfluidconsistencytypecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd()));
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypCdgVrsn() != null) {
			nutritionorderoraldietfluidconsistencytypecoding.setVersion(n.getNtritnOrdrOralDietFluidConsistencyTypCdgVrsn());
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietFluidConsistencyTypTxt() != null) {
			nutritionorderoraldietfluidconsistencytype.setText(n.getNtritnOrdrOralDietFluidConsistencyTypTxt());
		}
		/******************** NtritnOrdr_OralDiet_Instrctn ********************************************************************************/
		if(n.getNtritnOrdrOralDietInstrctn() != null) {
			nutritionorderoraldiet.setInstruction(n.getNtritnOrdrOralDietInstrctn());
		}
		/******************** nutritionorderoraldietnutrient ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent nutritionorderoraldietnutrient =  new org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent();
		nutritionorderoraldiet.addNutrient(nutritionorderoraldietnutrient);

		/******************** nutritionorderoraldietnutrientamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderoraldietnutrientamount =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderoraldietnutrient.setAmount(nutritionorderoraldietnutrientamount);

		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientAmntCd() != null) {
			nutritionorderoraldietnutrientamount.setCode(n.getNtritnOrdrOralDietNutrientAmntCd());
		}
		/******************** nutritionorderoraldietnutrientamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderoraldietnutrientamountcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderoraldietnutrientamount.setComparator(nutritionorderoraldietnutrientamountcomparator.fromCode(n.getNtritnOrdrOralDietNutrientAmntCmprtr()));

		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientAmntSys() != null) {
			nutritionorderoraldietnutrientamount.setSystem(n.getNtritnOrdrOralDietNutrientAmntSys());
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Unt ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientAmntUnt() != null) {
			nutritionorderoraldietnutrientamount.setUnit(n.getNtritnOrdrOralDietNutrientAmntUnt());
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Vl ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientAmntVl() != null) {
			nutritionorderoraldietnutrientamount.setValue(Double.parseDouble((n.getNtritnOrdrOralDietNutrientAmntVl())));
		}
		/******************** nutritionorderoraldietnutrientmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldietnutrientmodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderoraldietnutrient.setModifier(nutritionorderoraldietnutrientmodifier);

		/******************** nutritionorderoraldietnutrientmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldietnutrientmodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderoraldietnutrientmodifier.addCoding(nutritionorderoraldietnutrientmodifiercoding);

		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgCd() != null) {
			nutritionorderoraldietnutrientmodifiercoding.setCode(n.getNtritnOrdrOralDietNutrientMdfrCdgCd());
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgDsply() != null) {
			nutritionorderoraldietnutrientmodifiercoding.setDisplay(n.getNtritnOrdrOralDietNutrientMdfrCdgDsply());
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgSys() != null) {
			nutritionorderoraldietnutrientmodifiercoding.setSystem(n.getNtritnOrdrOralDietNutrientMdfrCdgSys());
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgUsrSltd() != null) {
			nutritionorderoraldietnutrientmodifiercoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrOralDietNutrientMdfrCdgUsrSltd()));
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrCdgVrsn() != null) {
			nutritionorderoraldietnutrientmodifiercoding.setVersion(n.getNtritnOrdrOralDietNutrientMdfrCdgVrsn());
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietNutrientMdfrTxt() != null) {
			nutritionorderoraldietnutrientmodifier.setText(n.getNtritnOrdrOralDietNutrientMdfrTxt());
		}
		/******************** nutritionorderoraldietschedule ********************************************************************************/
		org.hl7.fhir.r4.model.Timing nutritionorderoraldietschedule =  new org.hl7.fhir.r4.model.Timing();
		nutritionorderoraldiet.addSchedule(nutritionorderoraldietschedule);

		/******************** nutritionorderoraldietschedulecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldietschedulecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderoraldietschedule.setCode(nutritionorderoraldietschedulecode);

		/******************** nutritionorderoraldietschedulecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldietschedulecodecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderoraldietschedulecode.addCoding(nutritionorderoraldietschedulecodecoding);

		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgCd() != null) {
			nutritionorderoraldietschedulecodecoding.setCode(n.getNtritnOrdrOralDietSchdlCdCdgCd());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgDsply() != null) {
			nutritionorderoraldietschedulecodecoding.setDisplay(n.getNtritnOrdrOralDietSchdlCdCdgDsply());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgSys() != null) {
			nutritionorderoraldietschedulecodecoding.setSystem(n.getNtritnOrdrOralDietSchdlCdCdgSys());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgUsrSltd() != null) {
			nutritionorderoraldietschedulecodecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrOralDietSchdlCdCdgUsrSltd()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdCdgVrsn() != null) {
			nutritionorderoraldietschedulecodecoding.setVersion(n.getNtritnOrdrOralDietSchdlCdCdgVrsn());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlCdTxt() != null) {
			nutritionorderoraldietschedulecode.setText(n.getNtritnOrdrOralDietSchdlCdTxt());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Evnt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlEvnt() != null) {
			java.text.SimpleDateFormat NtritnOrdr_OralDiet_Schdl_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_OralDiet_Schdl_Evntdate = NtritnOrdr_OralDiet_Schdl_Evntsdf.parse(n.getNtritnOrdrOralDietSchdlEvnt());
			nutritionorderoraldietschedule.addEvent(NtritnOrdr_OralDiet_Schdl_Evntdate);
		}
		/******************** nutritionorderoraldietschedulerepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent nutritionorderoraldietschedulerepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		nutritionorderoraldietschedule.setRepeat(nutritionorderoraldietschedulerepeat);

		/******************** nutritionorderoraldietschedulerepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration nutritionorderoraldietschedulerepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		nutritionorderoraldietschedulerepeat.setBounds(nutritionorderoraldietschedulerepeatboundsduration);

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsDurationCd() != null) {
			nutritionorderoraldietschedulerepeatboundsduration.setCode(n.getNtritnOrdrOralDietSchdlRptBndsDurationCd());
		}
		/******************** nutritionorderoraldietschedulerepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderoraldietschedulerepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderoraldietschedulerepeatboundsduration.setComparator(nutritionorderoraldietschedulerepeatboundsdurationcomparator.fromCode(n.getNtritnOrdrOralDietSchdlRptBndsDurationCmprtr()));

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsDurationSys() != null) {
			nutritionorderoraldietschedulerepeatboundsduration.setSystem(n.getNtritnOrdrOralDietSchdlRptBndsDurationSys());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Unt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsDurationUnt() != null) {
			nutritionorderoraldietschedulerepeatboundsduration.setUnit(n.getNtritnOrdrOralDietSchdlRptBndsDurationUnt());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsDuration_Vl ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsDurationVl() != null) {
			nutritionorderoraldietschedulerepeatboundsduration.setValue(Double.parseDouble((n.getNtritnOrdrOralDietSchdlRptBndsDurationVl())));
		}
		/******************** nutritionorderoraldietschedulerepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionorderoraldietschedulerepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		nutritionorderoraldietschedulerepeat.setBounds(nutritionorderoraldietschedulerepeatboundsperiod);

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Enddate = NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Endsdf.parse(n.getNtritnOrdrOralDietSchdlRptBndsPrdEnd());
			nutritionorderoraldietschedulerepeatboundsperiod.setEnd(NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Enddate);
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Strtdate = NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Strtsdf.parse(n.getNtritnOrdrOralDietSchdlRptBndsPrdStrt());
			nutritionorderoraldietschedulerepeatboundsperiod.setStart(NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Strtdate);
		}
		/******************** nutritionorderoraldietschedulerepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range nutritionorderoraldietschedulerepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		nutritionorderoraldietschedulerepeat.setBounds(nutritionorderoraldietschedulerepeatboundsrange);

		/******************** nutritionorderoraldietschedulerepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderoraldietschedulerepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderoraldietschedulerepeatboundsrange.setHigh(nutritionorderoraldietschedulerepeatboundsrangehigh);

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngHiCd() != null) {
			nutritionorderoraldietschedulerepeatboundsrangehigh.setCode(n.getNtritnOrdrOralDietSchdlRptBndsRngHiCd());
		}
		/******************** nutritionorderoraldietschedulerepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderoraldietschedulerepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderoraldietschedulerepeatboundsrangehigh.setComparator(nutritionorderoraldietschedulerepeatboundsrangehighcomparator.fromCode(n.getNtritnOrdrOralDietSchdlRptBndsRngHiCmprtr()));

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngHiSys() != null) {
			nutritionorderoraldietschedulerepeatboundsrangehigh.setSystem(n.getNtritnOrdrOralDietSchdlRptBndsRngHiSys());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngHiUnt() != null) {
			nutritionorderoraldietschedulerepeatboundsrangehigh.setUnit(n.getNtritnOrdrOralDietSchdlRptBndsRngHiUnt());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngHiVl() != null) {
			nutritionorderoraldietschedulerepeatboundsrangehigh.setValue(Double.parseDouble((n.getNtritnOrdrOralDietSchdlRptBndsRngHiVl())));
		}
		/******************** nutritionorderoraldietschedulerepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderoraldietschedulerepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		nutritionorderoraldietschedulerepeatboundsrange.setLow(nutritionorderoraldietschedulerepeatboundsrangelow);

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngLwCd() != null) {
			nutritionorderoraldietschedulerepeatboundsrangelow.setCode(n.getNtritnOrdrOralDietSchdlRptBndsRngLwCd());
		}
		/******************** nutritionorderoraldietschedulerepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionorderoraldietschedulerepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionorderoraldietschedulerepeatboundsrangelow.setComparator(nutritionorderoraldietschedulerepeatboundsrangelowcomparator.fromCode(n.getNtritnOrdrOralDietSchdlRptBndsRngLwCmprtr()));

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngLwSys() != null) {
			nutritionorderoraldietschedulerepeatboundsrangelow.setSystem(n.getNtritnOrdrOralDietSchdlRptBndsRngLwSys());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngLwUnt() != null) {
			nutritionorderoraldietschedulerepeatboundsrangelow.setUnit(n.getNtritnOrdrOralDietSchdlRptBndsRngLwUnt());
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptBndsRngLwVl() != null) {
			nutritionorderoraldietschedulerepeatboundsrangelow.setValue(Double.parseDouble((n.getNtritnOrdrOralDietSchdlRptBndsRngLwVl())));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Cnt ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptCnt() != null) {
			nutritionorderoraldietschedulerepeat.setCount(Integer.parseInt(n.getNtritnOrdrOralDietSchdlRptCnt()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_CntMx ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptCntMx() != null) {
			nutritionorderoraldietschedulerepeat.setCountMax(Integer.parseInt(n.getNtritnOrdrOralDietSchdlRptCntMx()));
		}
		/******************** nutritionorderoraldietschedulerepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory nutritionorderoraldietschedulerepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		nutritionorderoraldietschedulerepeat.addDayOfWeek(nutritionorderoraldietschedulerepeatdayofweek.fromCode(n.getNtritnOrdrOralDietSchdlRptDayOfWeek()));

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Duration ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptDuration() != null) {
			nutritionorderoraldietschedulerepeat.setDuration(Double.parseDouble((n.getNtritnOrdrOralDietSchdlRptDuration())));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_DurationMx ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptDurationMx() != null) {
			nutritionorderoraldietschedulerepeat.setDurationMax(Double.parseDouble((n.getNtritnOrdrOralDietSchdlRptDurationMx())));
		}
		/******************** nutritionorderoraldietschedulerepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory nutritionorderoraldietschedulerepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		nutritionorderoraldietschedulerepeat.setDurationUnit(nutritionorderoraldietschedulerepeatdurationunit.fromCode(n.getNtritnOrdrOralDietSchdlRptDurationUnt()));

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Frqncy ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptFrqncy() != null) {
			nutritionorderoraldietschedulerepeat.setFrequency(Integer.parseInt(n.getNtritnOrdrOralDietSchdlRptFrqncy()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptFrqncyMx() != null) {
			nutritionorderoraldietschedulerepeat.setFrequencyMax(Integer.parseInt(n.getNtritnOrdrOralDietSchdlRptFrqncyMx()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Off ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptOff() != null) {
			nutritionorderoraldietschedulerepeat.setOffset(Integer.parseInt(n.getNtritnOrdrOralDietSchdlRptOff()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Prd ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptPrd() != null) {
			nutritionorderoraldietschedulerepeat.setPeriod(Double.parseDouble((n.getNtritnOrdrOralDietSchdlRptPrd())));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_PrdMx ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptPrdMx() != null) {
			nutritionorderoraldietschedulerepeat.setPeriodMax(new java.math.BigDecimal((n.getNtritnOrdrOralDietSchdlRptPrdMx())));
		}
		/******************** nutritionorderoraldietschedulerepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory nutritionorderoraldietschedulerepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		nutritionorderoraldietschedulerepeat.setPeriodUnit(nutritionorderoraldietschedulerepeatperiodunit.fromCode(n.getNtritnOrdrOralDietSchdlRptPrdUnt()));

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_TimeOfDay ********************************************************************************/
		if(n.getNtritnOrdrOralDietSchdlRptTimeOfDay() != null) {
			nutritionorderoraldietschedulerepeat.addTimeOfDay(n.getNtritnOrdrOralDietSchdlRptTimeOfDay());
		}
		/******************** nutritionorderoraldietschedulerepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory nutritionorderoraldietschedulerepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		nutritionorderoraldietschedulerepeat.addWhen(nutritionorderoraldietschedulerepeatwhen.fromCode(n.getNtritnOrdrOralDietSchdlRptWhen()));

		/******************** nutritionorderoraldiettexture ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent nutritionorderoraldiettexture =  new org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent();
		nutritionorderoraldiet.addTexture(nutritionorderoraldiettexture);

		/******************** nutritionorderoraldiettexturefoodtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldiettexturefoodtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderoraldiettexture.setFoodType(nutritionorderoraldiettexturefoodtype);

		/******************** nutritionorderoraldiettexturefoodtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldiettexturefoodtypecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderoraldiettexturefoodtype.addCoding(nutritionorderoraldiettexturefoodtypecoding);

		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgCd() != null) {
			nutritionorderoraldiettexturefoodtypecoding.setCode(n.getNtritnOrdrOralDietTxtureFoodTypCdgCd());
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgDsply() != null) {
			nutritionorderoraldiettexturefoodtypecoding.setDisplay(n.getNtritnOrdrOralDietTxtureFoodTypCdgDsply());
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgSys() != null) {
			nutritionorderoraldiettexturefoodtypecoding.setSystem(n.getNtritnOrdrOralDietTxtureFoodTypCdgSys());
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd() != null) {
			nutritionorderoraldiettexturefoodtypecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypCdgVrsn() != null) {
			nutritionorderoraldiettexturefoodtypecoding.setVersion(n.getNtritnOrdrOralDietTxtureFoodTypCdgVrsn());
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureFoodTypTxt() != null) {
			nutritionorderoraldiettexturefoodtype.setText(n.getNtritnOrdrOralDietTxtureFoodTypTxt());
		}
		/******************** nutritionorderoraldiettexturemodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldiettexturemodifier =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderoraldiettexture.setModifier(nutritionorderoraldiettexturemodifier);

		/******************** nutritionorderoraldiettexturemodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldiettexturemodifiercoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderoraldiettexturemodifier.addCoding(nutritionorderoraldiettexturemodifiercoding);

		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgCd() != null) {
			nutritionorderoraldiettexturemodifiercoding.setCode(n.getNtritnOrdrOralDietTxtureMdfrCdgCd());
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgDsply() != null) {
			nutritionorderoraldiettexturemodifiercoding.setDisplay(n.getNtritnOrdrOralDietTxtureMdfrCdgDsply());
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgSys() != null) {
			nutritionorderoraldiettexturemodifiercoding.setSystem(n.getNtritnOrdrOralDietTxtureMdfrCdgSys());
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgUsrSltd() != null) {
			nutritionorderoraldiettexturemodifiercoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrOralDietTxtureMdfrCdgUsrSltd()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrCdgVrsn() != null) {
			nutritionorderoraldiettexturemodifiercoding.setVersion(n.getNtritnOrdrOralDietTxtureMdfrCdgVrsn());
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietTxtureMdfrTxt() != null) {
			nutritionorderoraldiettexturemodifier.setText(n.getNtritnOrdrOralDietTxtureMdfrTxt());
		}
		/******************** nutritionorderoraldiettype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldiettype =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionorderoraldiet.addType(nutritionorderoraldiettype);

		/******************** nutritionorderoraldiettypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldiettypecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionorderoraldiettype.addCoding(nutritionorderoraldiettypecoding);

		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgCd() != null) {
			nutritionorderoraldiettypecoding.setCode(n.getNtritnOrdrOralDietTypCdgCd());
		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgDsply() != null) {
			nutritionorderoraldiettypecoding.setDisplay(n.getNtritnOrdrOralDietTypCdgDsply());
		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgSys() != null) {
			nutritionorderoraldiettypecoding.setSystem(n.getNtritnOrdrOralDietTypCdgSys());
		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgUsrSltd() != null) {
			nutritionorderoraldiettypecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrOralDietTypCdgUsrSltd()));
		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypCdgVrsn() != null) {
			nutritionorderoraldiettypecoding.setVersion(n.getNtritnOrdrOralDietTypCdgVrsn());
		}
		/******************** NtritnOrdr_OralDiet_Typ_Txt ********************************************************************************/
		if(n.getNtritnOrdrOralDietTypTxt() != null) {
			nutritionorderoraldiettype.setText(n.getNtritnOrdrOralDietTypTxt());
		}
		/******************** NtritnOrdr_Ordrer ********************************************************************************/
		if(n.getNtritnOrdrOrdrer() != null) {
			nutritionorder.setOrderer( new org.hl7.fhir.r4.model.Reference(n.getNtritnOrdrOrdrer()));
		}
		/******************** NtritnOrdr_Pnt ********************************************************************************/
		if(n.getNtritnOrdrPnt() != null) {
			nutritionorder.setPatient( new org.hl7.fhir.r4.model.Reference(n.getNtritnOrdrPnt()));
		}
		/******************** nutritionorderstatus ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderStatusEnumFactory nutritionorderstatus =  new org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderStatusEnumFactory();
		nutritionorder.setStatus(nutritionorderstatus.fromCode(n.getNtritnOrdrSts()));

		/******************** nutritionordersupplement ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent nutritionordersupplement =  new org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent();
		nutritionorder.addSupplement(nutritionordersupplement);

		/******************** NtritnOrdr_Supplement_Instrctn ********************************************************************************/
		if(n.getNtritnOrdrSupplementInstrctn() != null) {
			nutritionordersupplement.setInstruction(n.getNtritnOrdrSupplementInstrctn());
		}
		/******************** NtritnOrdr_Supplement_PrdctNm ********************************************************************************/
		if(n.getNtritnOrdrSupplementPrdctNm() != null) {
			nutritionordersupplement.setProductName(n.getNtritnOrdrSupplementPrdctNm());
		}
		/******************** nutritionordersupplementquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionordersupplementquantity =  new org.hl7.fhir.r4.model.Quantity();
		nutritionordersupplement.setQuantity(nutritionordersupplementquantity);

		/******************** NtritnOrdr_Supplement_Qnty_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementQntyCd() != null) {
			nutritionordersupplementquantity.setCode(n.getNtritnOrdrSupplementQntyCd());
		}
		/******************** nutritionordersupplementquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionordersupplementquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionordersupplementquantity.setComparator(nutritionordersupplementquantitycomparator.fromCode(n.getNtritnOrdrSupplementQntyCmprtr()));

		/******************** NtritnOrdr_Supplement_Qnty_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementQntySys() != null) {
			nutritionordersupplementquantity.setSystem(n.getNtritnOrdrSupplementQntySys());
		}
		/******************** NtritnOrdr_Supplement_Qnty_Unt ********************************************************************************/
		if(n.getNtritnOrdrSupplementQntyUnt() != null) {
			nutritionordersupplementquantity.setUnit(n.getNtritnOrdrSupplementQntyUnt());
		}
		/******************** NtritnOrdr_Supplement_Qnty_Vl ********************************************************************************/
		if(n.getNtritnOrdrSupplementQntyVl() != null) {
			nutritionordersupplementquantity.setValue(Double.parseDouble((n.getNtritnOrdrSupplementQntyVl())));
		}
		/******************** nutritionordersupplementschedule ********************************************************************************/
		org.hl7.fhir.r4.model.Timing nutritionordersupplementschedule =  new org.hl7.fhir.r4.model.Timing();
		nutritionordersupplement.addSchedule(nutritionordersupplementschedule);

		/******************** nutritionordersupplementschedulecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionordersupplementschedulecode =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionordersupplementschedule.setCode(nutritionordersupplementschedulecode);

		/******************** nutritionordersupplementschedulecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionordersupplementschedulecodecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionordersupplementschedulecode.addCoding(nutritionordersupplementschedulecodecoding);

		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgCd() != null) {
			nutritionordersupplementschedulecodecoding.setCode(n.getNtritnOrdrSupplementSchdlCdCdgCd());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgDsply() != null) {
			nutritionordersupplementschedulecodecoding.setDisplay(n.getNtritnOrdrSupplementSchdlCdCdgDsply());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgSys() != null) {
			nutritionordersupplementschedulecodecoding.setSystem(n.getNtritnOrdrSupplementSchdlCdCdgSys());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgUsrSltd() != null) {
			nutritionordersupplementschedulecodecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrSupplementSchdlCdCdgUsrSltd()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdCdgVrsn() != null) {
			nutritionordersupplementschedulecodecoding.setVersion(n.getNtritnOrdrSupplementSchdlCdCdgVrsn());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Txt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlCdTxt() != null) {
			nutritionordersupplementschedulecode.setText(n.getNtritnOrdrSupplementSchdlCdTxt());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Evnt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlEvnt() != null) {
			java.text.SimpleDateFormat NtritnOrdr_Supplement_Schdl_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_Supplement_Schdl_Evntdate = NtritnOrdr_Supplement_Schdl_Evntsdf.parse(n.getNtritnOrdrSupplementSchdlEvnt());
			nutritionordersupplementschedule.addEvent(NtritnOrdr_Supplement_Schdl_Evntdate);
		}
		/******************** nutritionordersupplementschedulerepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent nutritionordersupplementschedulerepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		nutritionordersupplementschedule.setRepeat(nutritionordersupplementschedulerepeat);

		/******************** nutritionordersupplementschedulerepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration nutritionordersupplementschedulerepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		nutritionordersupplementschedulerepeat.setBounds(nutritionordersupplementschedulerepeatboundsduration);

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsDurationCd() != null) {
			nutritionordersupplementschedulerepeatboundsduration.setCode(n.getNtritnOrdrSupplementSchdlRptBndsDurationCd());
		}
		/******************** nutritionordersupplementschedulerepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionordersupplementschedulerepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionordersupplementschedulerepeatboundsduration.setComparator(nutritionordersupplementschedulerepeatboundsdurationcomparator.fromCode(n.getNtritnOrdrSupplementSchdlRptBndsDurationCmprtr()));

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsDurationSys() != null) {
			nutritionordersupplementschedulerepeatboundsduration.setSystem(n.getNtritnOrdrSupplementSchdlRptBndsDurationSys());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Unt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsDurationUnt() != null) {
			nutritionordersupplementschedulerepeatboundsduration.setUnit(n.getNtritnOrdrSupplementSchdlRptBndsDurationUnt());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsDuration_Vl ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsDurationVl() != null) {
			nutritionordersupplementschedulerepeatboundsduration.setValue(Double.parseDouble((n.getNtritnOrdrSupplementSchdlRptBndsDurationVl())));
		}
		/******************** nutritionordersupplementschedulerepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionordersupplementschedulerepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		nutritionordersupplementschedulerepeat.setBounds(nutritionordersupplementschedulerepeatboundsperiod);

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Enddate = NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Endsdf.parse(n.getNtritnOrdrSupplementSchdlRptBndsPrdEnd());
			nutritionordersupplementschedulerepeatboundsperiod.setEnd(NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Enddate);
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Strtdate = NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Strtsdf.parse(n.getNtritnOrdrSupplementSchdlRptBndsPrdStrt());
			nutritionordersupplementschedulerepeatboundsperiod.setStart(NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Strtdate);
		}
		/******************** nutritionordersupplementschedulerepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range nutritionordersupplementschedulerepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		nutritionordersupplementschedulerepeat.setBounds(nutritionordersupplementschedulerepeatboundsrange);

		/******************** nutritionordersupplementschedulerepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionordersupplementschedulerepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		nutritionordersupplementschedulerepeatboundsrange.setHigh(nutritionordersupplementschedulerepeatboundsrangehigh);

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngHiCd() != null) {
			nutritionordersupplementschedulerepeatboundsrangehigh.setCode(n.getNtritnOrdrSupplementSchdlRptBndsRngHiCd());
		}
		/******************** nutritionordersupplementschedulerepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionordersupplementschedulerepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionordersupplementschedulerepeatboundsrangehigh.setComparator(nutritionordersupplementschedulerepeatboundsrangehighcomparator.fromCode(n.getNtritnOrdrSupplementSchdlRptBndsRngHiCmprtr()));

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngHiSys() != null) {
			nutritionordersupplementschedulerepeatboundsrangehigh.setSystem(n.getNtritnOrdrSupplementSchdlRptBndsRngHiSys());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngHiUnt() != null) {
			nutritionordersupplementschedulerepeatboundsrangehigh.setUnit(n.getNtritnOrdrSupplementSchdlRptBndsRngHiUnt());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngHiVl() != null) {
			nutritionordersupplementschedulerepeatboundsrangehigh.setValue(Double.parseDouble((n.getNtritnOrdrSupplementSchdlRptBndsRngHiVl())));
		}
		/******************** nutritionordersupplementschedulerepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionordersupplementschedulerepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		nutritionordersupplementschedulerepeatboundsrange.setLow(nutritionordersupplementschedulerepeatboundsrangelow);

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngLwCd() != null) {
			nutritionordersupplementschedulerepeatboundsrangelow.setCode(n.getNtritnOrdrSupplementSchdlRptBndsRngLwCd());
		}
		/******************** nutritionordersupplementschedulerepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory nutritionordersupplementschedulerepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		nutritionordersupplementschedulerepeatboundsrangelow.setComparator(nutritionordersupplementschedulerepeatboundsrangelowcomparator.fromCode(n.getNtritnOrdrSupplementSchdlRptBndsRngLwCmprtr()));

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngLwSys() != null) {
			nutritionordersupplementschedulerepeatboundsrangelow.setSystem(n.getNtritnOrdrSupplementSchdlRptBndsRngLwSys());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngLwUnt() != null) {
			nutritionordersupplementschedulerepeatboundsrangelow.setUnit(n.getNtritnOrdrSupplementSchdlRptBndsRngLwUnt());
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptBndsRngLwVl() != null) {
			nutritionordersupplementschedulerepeatboundsrangelow.setValue(Double.parseDouble((n.getNtritnOrdrSupplementSchdlRptBndsRngLwVl())));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Cnt ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptCnt() != null) {
			nutritionordersupplementschedulerepeat.setCount(Integer.parseInt(n.getNtritnOrdrSupplementSchdlRptCnt()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_CntMx ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptCntMx() != null) {
			nutritionordersupplementschedulerepeat.setCountMax(Integer.parseInt(n.getNtritnOrdrSupplementSchdlRptCntMx()));
		}
		/******************** nutritionordersupplementschedulerepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory nutritionordersupplementschedulerepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		nutritionordersupplementschedulerepeat.addDayOfWeek(nutritionordersupplementschedulerepeatdayofweek.fromCode(n.getNtritnOrdrSupplementSchdlRptDayOfWeek()));

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Duration ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptDuration() != null) {
			nutritionordersupplementschedulerepeat.setDuration(Double.parseDouble((n.getNtritnOrdrSupplementSchdlRptDuration())));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_DurationMx ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptDurationMx() != null) {
			nutritionordersupplementschedulerepeat.setDurationMax(Double.parseDouble((n.getNtritnOrdrSupplementSchdlRptDurationMx())));
		}
		/******************** nutritionordersupplementschedulerepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory nutritionordersupplementschedulerepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		nutritionordersupplementschedulerepeat.setDurationUnit(nutritionordersupplementschedulerepeatdurationunit.fromCode(n.getNtritnOrdrSupplementSchdlRptDurationUnt()));

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Frqncy ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptFrqncy() != null) {
			nutritionordersupplementschedulerepeat.setFrequency(Integer.parseInt(n.getNtritnOrdrSupplementSchdlRptFrqncy()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptFrqncyMx() != null) {
			nutritionordersupplementschedulerepeat.setFrequencyMax(Integer.parseInt(n.getNtritnOrdrSupplementSchdlRptFrqncyMx()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Off ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptOff() != null) {
			nutritionordersupplementschedulerepeat.setOffset(Integer.parseInt(n.getNtritnOrdrSupplementSchdlRptOff()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Prd ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptPrd() != null) {
			nutritionordersupplementschedulerepeat.setPeriod(Double.parseDouble((n.getNtritnOrdrSupplementSchdlRptPrd())));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_PrdMx ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptPrdMx() != null) {
			nutritionordersupplementschedulerepeat.setPeriodMax(new java.math.BigDecimal((n.getNtritnOrdrSupplementSchdlRptPrdMx())));
		}
		/******************** nutritionordersupplementschedulerepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory nutritionordersupplementschedulerepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		nutritionordersupplementschedulerepeat.setPeriodUnit(nutritionordersupplementschedulerepeatperiodunit.fromCode(n.getNtritnOrdrSupplementSchdlRptPrdUnt()));

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_TimeOfDay ********************************************************************************/
		if(n.getNtritnOrdrSupplementSchdlRptTimeOfDay() != null) {
			nutritionordersupplementschedulerepeat.addTimeOfDay(n.getNtritnOrdrSupplementSchdlRptTimeOfDay());
		}
		/******************** nutritionordersupplementschedulerepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory nutritionordersupplementschedulerepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		nutritionordersupplementschedulerepeat.addWhen(nutritionordersupplementschedulerepeatwhen.fromCode(n.getNtritnOrdrSupplementSchdlRptWhen()));

		/******************** nutritionordersupplementtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionordersupplementtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		nutritionordersupplement.setType(nutritionordersupplementtype);

		/******************** nutritionordersupplementtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionordersupplementtypecoding =  new org.hl7.fhir.r4.model.Coding();
		nutritionordersupplementtype.addCoding(nutritionordersupplementtypecoding);

		/******************** NtritnOrdr_Supplement_Typ_Cdg_Cd ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgCd() != null) {
			nutritionordersupplementtypecoding.setCode(n.getNtritnOrdrSupplementTypCdgCd());
		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Dsply ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgDsply() != null) {
			nutritionordersupplementtypecoding.setDisplay(n.getNtritnOrdrSupplementTypCdgDsply());
		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Sys ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgSys() != null) {
			nutritionordersupplementtypecoding.setSystem(n.getNtritnOrdrSupplementTypCdgSys());
		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_UsrSltd ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgUsrSltd() != null) {
			nutritionordersupplementtypecoding.setUserSelected(Boolean.parseBoolean(n.getNtritnOrdrSupplementTypCdgUsrSltd()));
		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Vrsn ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypCdgVrsn() != null) {
			nutritionordersupplementtypecoding.setVersion(n.getNtritnOrdrSupplementTypCdgVrsn());
		}
		/******************** NtritnOrdr_Supplement_Typ_Txt ********************************************************************************/
		if(n.getNtritnOrdrSupplementTypTxt() != null) {
			nutritionordersupplementtype.setText(n.getNtritnOrdrSupplementTypTxt());
		}
		return nutritionorder;
	}
}
