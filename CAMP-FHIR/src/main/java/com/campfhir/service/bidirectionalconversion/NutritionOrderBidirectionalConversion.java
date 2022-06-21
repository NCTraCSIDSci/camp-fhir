package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.NutritionOrder;
public class NutritionOrderBidirectionalConversion 
{
	public NutritionOrder NutritionOrders(org.hl7.fhir.r4.model.NutritionOrder nutritionorder) throws ParseException
	{
		 main.java.com.campfhir.model.NutritionOrder n = new  main.java.com.campfhir.model.NutritionOrder();

		/******************** id ********************************************************************************/
		nutritionorder.setId(n.getId());

		/******************** nutritionorderintent ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritiionOrderIntent nutritionorderintent = nutritionorder.getIntent();
		n.setNtritnOrdrIntent(nutritionorderintent.toCode());

		/******************** nutritionorderstatus ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderStatus nutritionorderstatus = nutritionorder.getStatus();
		n.setNtritnOrdrSts(nutritionorderstatus.toCode());

		/******************** NtritnOrdr_Enc ********************************************************************************/
		if(nutritionorder.hasEncounter()) {
			n.setNtritnOrdrEnc(String.valueOf(nutritionorder.getEncounter()));
		}
		/******************** nutritionordernote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation nutritionordernote = nutritionorder.getNoteFirstRep();

		/******************** NtritnOrdr_Nt_Time ********************************************************************************/
		if(nutritionordernote.hasTime()) {
			n.setNtritnOrdrNtTime(String.valueOf(nutritionordernote.getTime()));
		}
		/******************** NtritnOrdr_Nt_AthrRfrnc ********************************************************************************/
		if(nutritionordernote.hasAuthorReference()) {
			n.setNtritnOrdrNtAthrRfrnc(String.valueOf(nutritionordernote.getAuthorReference()));
		}
		/******************** NtritnOrdr_Nt_Txt ********************************************************************************/
		if(nutritionordernote.hasText()) {
			n.setNtritnOrdrNtTxt(String.valueOf(nutritionordernote.getText()));
		}
		/******************** NtritnOrdr_Nt_AthrStrgTyp ********************************************************************************/
		if(nutritionordernote.hasAuthorStringType()) {
			n.setNtritnOrdrNtAthrStrgTyp(String.valueOf(nutritionordernote.getAuthorStringType()));
		}
		/******************** nutritionorderfoodpreferencemodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderfoodpreferencemodifier = nutritionorder.getFoodPreferenceModifierFirstRep();

		/******************** nutritionorderfoodpreferencemodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderfoodpreferencemodifiercoding = nutritionorderfoodpreferencemodifier.getCodingFirstRep();

		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Dsply ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercoding.hasDisplay()) {
			n.setNtritnOrdrFoodPreferenceMdfrCdgDsply(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getDisplay()));
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercoding.hasVersion()) {
			n.setNtritnOrdrFoodPreferenceMdfrCdgVrsn(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getVersion()));
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Cd ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercoding.hasCode()) {
			n.setNtritnOrdrFoodPreferenceMdfrCdgCd(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getCode()));
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_Sys ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercoding.hasSystem()) {
			n.setNtritnOrdrFoodPreferenceMdfrCdgSys(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getSystem()));
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderfoodpreferencemodifiercoding.hasUserSelected()) {
			n.setNtritnOrdrFoodPreferenceMdfrCdgUsrSltd(String.valueOf(nutritionorderfoodpreferencemodifiercoding.getUserSelected()));
		}
		/******************** NtritnOrdr_FoodPreferenceMdfr_Txt ********************************************************************************/
		if(nutritionorderfoodpreferencemodifier.hasText()) {
			n.setNtritnOrdrFoodPreferenceMdfrTxt(String.valueOf(nutritionorderfoodpreferencemodifier.getText()));
		}
		/******************** NtritnOrdr_AlrgyIntolerance ********************************************************************************/
		if(nutritionorder.hasAllergyIntolerance()) {
			n.setNtritnOrdrAlrgyIntolerance(String.valueOf(nutritionorder.getAllergyIntoleranceFirstRep()));
		}
		/******************** nutritionorderexcludefoodmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderexcludefoodmodifier = nutritionorder.getExcludeFoodModifierFirstRep();

		/******************** nutritionorderexcludefoodmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderexcludefoodmodifiercoding = nutritionorderexcludefoodmodifier.getCodingFirstRep();

		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Dsply ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercoding.hasDisplay()) {
			n.setNtritnOrdrExcludeFoodMdfrCdgDsply(String.valueOf(nutritionorderexcludefoodmodifiercoding.getDisplay()));
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercoding.hasVersion()) {
			n.setNtritnOrdrExcludeFoodMdfrCdgVrsn(String.valueOf(nutritionorderexcludefoodmodifiercoding.getVersion()));
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Cd ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercoding.hasCode()) {
			n.setNtritnOrdrExcludeFoodMdfrCdgCd(String.valueOf(nutritionorderexcludefoodmodifiercoding.getCode()));
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_Sys ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercoding.hasSystem()) {
			n.setNtritnOrdrExcludeFoodMdfrCdgSys(String.valueOf(nutritionorderexcludefoodmodifiercoding.getSystem()));
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderexcludefoodmodifiercoding.hasUserSelected()) {
			n.setNtritnOrdrExcludeFoodMdfrCdgUsrSltd(String.valueOf(nutritionorderexcludefoodmodifiercoding.getUserSelected()));
		}
		/******************** NtritnOrdr_ExcludeFoodMdfr_Txt ********************************************************************************/
		if(nutritionorderexcludefoodmodifier.hasText()) {
			n.setNtritnOrdrExcludeFoodMdfrTxt(String.valueOf(nutritionorderexcludefoodmodifier.getText()));
		}
		/******************** nutritionordersupplement ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderSupplementComponent nutritionordersupplement = nutritionorder.getSupplementFirstRep();

		/******************** nutritionordersupplementtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionordersupplementtype = nutritionordersupplement.getType();

		/******************** nutritionordersupplementtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionordersupplementtypecoding = nutritionordersupplementtype.getCodingFirstRep();

		/******************** NtritnOrdr_Supplement_Typ_Cdg_Dsply ********************************************************************************/
		if(nutritionordersupplementtypecoding.hasDisplay()) {
			n.setNtritnOrdrSupplementTypCdgDsply(String.valueOf(nutritionordersupplementtypecoding.getDisplay()));
		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Vrsn ********************************************************************************/
		if(nutritionordersupplementtypecoding.hasVersion()) {
			n.setNtritnOrdrSupplementTypCdgVrsn(String.valueOf(nutritionordersupplementtypecoding.getVersion()));
		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Cd ********************************************************************************/
		if(nutritionordersupplementtypecoding.hasCode()) {
			n.setNtritnOrdrSupplementTypCdgCd(String.valueOf(nutritionordersupplementtypecoding.getCode()));
		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_Sys ********************************************************************************/
		if(nutritionordersupplementtypecoding.hasSystem()) {
			n.setNtritnOrdrSupplementTypCdgSys(String.valueOf(nutritionordersupplementtypecoding.getSystem()));
		}
		/******************** NtritnOrdr_Supplement_Typ_Cdg_UsrSltd ********************************************************************************/
		if(nutritionordersupplementtypecoding.hasUserSelected()) {
			n.setNtritnOrdrSupplementTypCdgUsrSltd(String.valueOf(nutritionordersupplementtypecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_Supplement_Typ_Txt ********************************************************************************/
		if(nutritionordersupplementtype.hasText()) {
			n.setNtritnOrdrSupplementTypTxt(String.valueOf(nutritionordersupplementtype.getText()));
		}
		/******************** nutritionordersupplementschedule ********************************************************************************/
		org.hl7.fhir.r4.model.Timing nutritionordersupplementschedule = nutritionordersupplement.getScheduleFirstRep();

		/******************** nutritionordersupplementschedulecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionordersupplementschedulecode = nutritionordersupplementschedule.getCode();

		/******************** nutritionordersupplementschedulecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionordersupplementschedulecodecoding = nutritionordersupplementschedulecode.getCodingFirstRep();

		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(nutritionordersupplementschedulecodecoding.hasDisplay()) {
			n.setNtritnOrdrSupplementSchdlCdCdgDsply(String.valueOf(nutritionordersupplementschedulecodecoding.getDisplay()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(nutritionordersupplementschedulecodecoding.hasVersion()) {
			n.setNtritnOrdrSupplementSchdlCdCdgVrsn(String.valueOf(nutritionordersupplementschedulecodecoding.getVersion()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(nutritionordersupplementschedulecodecoding.hasCode()) {
			n.setNtritnOrdrSupplementSchdlCdCdgCd(String.valueOf(nutritionordersupplementschedulecodecoding.getCode()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(nutritionordersupplementschedulecodecoding.hasSystem()) {
			n.setNtritnOrdrSupplementSchdlCdCdgSys(String.valueOf(nutritionordersupplementschedulecodecoding.getSystem()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(nutritionordersupplementschedulecodecoding.hasUserSelected()) {
			n.setNtritnOrdrSupplementSchdlCdCdgUsrSltd(String.valueOf(nutritionordersupplementschedulecodecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Cd_Txt ********************************************************************************/
		if(nutritionordersupplementschedulecode.hasText()) {
			n.setNtritnOrdrSupplementSchdlCdTxt(String.valueOf(nutritionordersupplementschedulecode.getText()));
		}
		/******************** nutritionordersupplementschedulerepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent nutritionordersupplementschedulerepeat = nutritionordersupplementschedule.getRepeat();

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Off ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasOffset()) {
			n.setNtritnOrdrSupplementSchdlRptOff(String.valueOf(nutritionordersupplementschedulerepeat.getOffset()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Cnt ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasCount()) {
			n.setNtritnOrdrSupplementSchdlRptCnt(String.valueOf(nutritionordersupplementschedulerepeat.getCount()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Frqncy ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasFrequency()) {
			n.setNtritnOrdrSupplementSchdlRptFrqncy(String.valueOf(nutritionordersupplementschedulerepeat.getFrequency()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Prd ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasPeriod()) {
			n.setNtritnOrdrSupplementSchdlRptPrd(String.valueOf(nutritionordersupplementschedulerepeat.getPeriod()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_Duration ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasDuration()) {
			n.setNtritnOrdrSupplementSchdlRptDuration(String.valueOf(nutritionordersupplementschedulerepeat.getDuration()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_CntMx ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasCountMax()) {
			n.setNtritnOrdrSupplementSchdlRptCntMx(String.valueOf(nutritionordersupplementschedulerepeat.getCountMax()));
		}
		/******************** nutritionordersupplementschedulerepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration nutritionordersupplementschedulerepeatboundsduration = nutritionordersupplementschedulerepeat.getBoundsDuration();

		/******************** nutritionordersupplementschedulerepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionordersupplementschedulerepeatboundsperiod = nutritionordersupplementschedulerepeat.getBoundsPeriod();

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsperiod.hasEnd()) {
			n.setNtritnOrdrSupplementSchdlRptBndsPrdEnd(String.valueOf(nutritionordersupplementschedulerepeatboundsperiod.getEnd()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsperiod.hasStart()) {
			n.setNtritnOrdrSupplementSchdlRptBndsPrdStrt(String.valueOf(nutritionordersupplementschedulerepeatboundsperiod.getStart()));
		}
		/******************** nutritionordersupplementschedulerepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range nutritionordersupplementschedulerepeatboundsrange = nutritionordersupplementschedulerepeat.getBoundsRange();

		/******************** nutritionordersupplementschedulerepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionordersupplementschedulerepeatboundsrangelow = nutritionordersupplementschedulerepeatboundsrange.getLow();

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsrangelow.hasValue()) {
			n.setNtritnOrdrSupplementSchdlRptBndsRngLwVl(String.valueOf(nutritionordersupplementschedulerepeatboundsrangelow.getValue()));
		}
		/******************** nutritionordersupplementschedulerepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionordersupplementschedulerepeatboundsrangelowcomparator = nutritionordersupplementschedulerepeatboundsrangelow.getComparator();
		n.setNtritnOrdrSupplementSchdlRptBndsRngLwCmprtr(nutritionordersupplementschedulerepeatboundsrangelowcomparator.toCode());

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsrangelow.hasCode()) {
			n.setNtritnOrdrSupplementSchdlRptBndsRngLwCd(String.valueOf(nutritionordersupplementschedulerepeatboundsrangelow.getCode()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsrangelow.hasSystem()) {
			n.setNtritnOrdrSupplementSchdlRptBndsRngLwSys(String.valueOf(nutritionordersupplementschedulerepeatboundsrangelow.getSystem()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsrangelow.hasUnit()) {
			n.setNtritnOrdrSupplementSchdlRptBndsRngLwUnt(String.valueOf(nutritionordersupplementschedulerepeatboundsrangelow.getUnit()));
		}
		/******************** nutritionordersupplementschedulerepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionordersupplementschedulerepeatboundsrangehigh = nutritionordersupplementschedulerepeatboundsrange.getHigh();

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsrangehigh.hasValue()) {
			n.setNtritnOrdrSupplementSchdlRptBndsRngHiVl(String.valueOf(nutritionordersupplementschedulerepeatboundsrangehigh.getValue()));
		}
		/******************** nutritionordersupplementschedulerepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionordersupplementschedulerepeatboundsrangehighcomparator = nutritionordersupplementschedulerepeatboundsrangehigh.getComparator();
		n.setNtritnOrdrSupplementSchdlRptBndsRngHiCmprtr(nutritionordersupplementschedulerepeatboundsrangehighcomparator.toCode());

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsrangehigh.hasCode()) {
			n.setNtritnOrdrSupplementSchdlRptBndsRngHiCd(String.valueOf(nutritionordersupplementschedulerepeatboundsrangehigh.getCode()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsrangehigh.hasSystem()) {
			n.setNtritnOrdrSupplementSchdlRptBndsRngHiSys(String.valueOf(nutritionordersupplementschedulerepeatboundsrangehigh.getSystem()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(nutritionordersupplementschedulerepeatboundsrangehigh.hasUnit()) {
			n.setNtritnOrdrSupplementSchdlRptBndsRngHiUnt(String.valueOf(nutritionordersupplementschedulerepeatboundsrangehigh.getUnit()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_PrdMx ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasPeriodMax()) {
			n.setNtritnOrdrSupplementSchdlRptPrdMx(String.valueOf(nutritionordersupplementschedulerepeat.getPeriodMax()));
		}
		/******************** NtritnOrdr_Supplement_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasFrequencyMax()) {
			n.setNtritnOrdrSupplementSchdlRptFrqncyMx(String.valueOf(nutritionordersupplementschedulerepeat.getFrequencyMax()));
		}
		/******************** nutritionordersupplementschedulerepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionordersupplementschedulerepeatperiodunit = nutritionordersupplementschedulerepeat.getPeriodUnit();
		n.setNtritnOrdrSupplementSchdlRptPrdUnt(nutritionordersupplementschedulerepeatperiodunit.toCode());

		/******************** NtritnOrdr_Supplement_Schdl_Rpt_DurationMx ********************************************************************************/
		if(nutritionordersupplementschedulerepeat.hasDurationMax()) {
			n.setNtritnOrdrSupplementSchdlRptDurationMx(String.valueOf(nutritionordersupplementschedulerepeat.getDurationMax()));
		}
		/******************** nutritionordersupplementschedulerepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionordersupplementschedulerepeatdurationunit = nutritionordersupplementschedulerepeat.getDurationUnit();
		n.setNtritnOrdrSupplementSchdlRptDurationUnt(nutritionordersupplementschedulerepeatdurationunit.toCode());

		/******************** nutritionordersupplementquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionordersupplementquantity = nutritionordersupplement.getQuantity();

		/******************** NtritnOrdr_Supplement_Qnty_Vl ********************************************************************************/
		if(nutritionordersupplementquantity.hasValue()) {
			n.setNtritnOrdrSupplementQntyVl(String.valueOf(nutritionordersupplementquantity.getValue()));
		}
		/******************** nutritionordersupplementquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionordersupplementquantitycomparator = nutritionordersupplementquantity.getComparator();
		n.setNtritnOrdrSupplementQntyCmprtr(nutritionordersupplementquantitycomparator.toCode());

		/******************** NtritnOrdr_Supplement_Qnty_Cd ********************************************************************************/
		if(nutritionordersupplementquantity.hasCode()) {
			n.setNtritnOrdrSupplementQntyCd(String.valueOf(nutritionordersupplementquantity.getCode()));
		}
		/******************** NtritnOrdr_Supplement_Qnty_Sys ********************************************************************************/
		if(nutritionordersupplementquantity.hasSystem()) {
			n.setNtritnOrdrSupplementQntySys(String.valueOf(nutritionordersupplementquantity.getSystem()));
		}
		/******************** NtritnOrdr_Supplement_Qnty_Unt ********************************************************************************/
		if(nutritionordersupplementquantity.hasUnit()) {
			n.setNtritnOrdrSupplementQntyUnt(String.valueOf(nutritionordersupplementquantity.getUnit()));
		}
		/******************** NtritnOrdr_Supplement_PrdctNm ********************************************************************************/
		if(nutritionordersupplement.hasProductName()) {
			n.setNtritnOrdrSupplementPrdctNm(String.valueOf(nutritionordersupplement.getProductName()));
		}
		/******************** NtritnOrdr_Supplement_Instrctn ********************************************************************************/
		if(nutritionordersupplement.hasInstruction()) {
			n.setNtritnOrdrSupplementInstrctn(String.valueOf(nutritionordersupplement.getInstruction()));
		}
		/******************** NtritnOrdr_Pnt ********************************************************************************/
		if(nutritionorder.hasPatient()) {
			n.setNtritnOrdrPnt(String.valueOf(nutritionorder.getPatient()));
		}
		/******************** NtritnOrdr_Ordrer ********************************************************************************/
		if(nutritionorder.hasOrderer()) {
			n.setNtritnOrdrOrdrer(String.valueOf(nutritionorder.getOrderer()));
		}
		/******************** NtritnOrdr_DtTime ********************************************************************************/
		if(nutritionorder.hasDateTime()) {
			n.setNtritnOrdrDtTime(String.valueOf(nutritionorder.getDateTime()));
		}
		/******************** nutritionorderoraldiet ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietComponent nutritionorderoraldiet = nutritionorder.getOralDiet();

		/******************** nutritionorderoraldiettype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldiettype = nutritionorderoraldiet.getTypeFirstRep();

		/******************** nutritionorderoraldiettypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldiettypecoding = nutritionorderoraldiettype.getCodingFirstRep();

		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldiettypecoding.hasDisplay()) {
			n.setNtritnOrdrOralDietTypCdgDsply(String.valueOf(nutritionorderoraldiettypecoding.getDisplay()));
		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldiettypecoding.hasVersion()) {
			n.setNtritnOrdrOralDietTypCdgVrsn(String.valueOf(nutritionorderoraldiettypecoding.getVersion()));
		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldiettypecoding.hasCode()) {
			n.setNtritnOrdrOralDietTypCdgCd(String.valueOf(nutritionorderoraldiettypecoding.getCode()));
		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldiettypecoding.hasSystem()) {
			n.setNtritnOrdrOralDietTypCdgSys(String.valueOf(nutritionorderoraldiettypecoding.getSystem()));
		}
		/******************** NtritnOrdr_OralDiet_Typ_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldiettypecoding.hasUserSelected()) {
			n.setNtritnOrdrOralDietTypCdgUsrSltd(String.valueOf(nutritionorderoraldiettypecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_OralDiet_Typ_Txt ********************************************************************************/
		if(nutritionorderoraldiettype.hasText()) {
			n.setNtritnOrdrOralDietTypTxt(String.valueOf(nutritionorderoraldiettype.getText()));
		}
		/******************** nutritionorderoraldietschedule ********************************************************************************/
		org.hl7.fhir.r4.model.Timing nutritionorderoraldietschedule = nutritionorderoraldiet.getScheduleFirstRep();

		/******************** nutritionorderoraldietschedulecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldietschedulecode = nutritionorderoraldietschedule.getCode();

		/******************** nutritionorderoraldietschedulecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldietschedulecodecoding = nutritionorderoraldietschedulecode.getCodingFirstRep();

		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldietschedulecodecoding.hasDisplay()) {
			n.setNtritnOrdrOralDietSchdlCdCdgDsply(String.valueOf(nutritionorderoraldietschedulecodecoding.getDisplay()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldietschedulecodecoding.hasVersion()) {
			n.setNtritnOrdrOralDietSchdlCdCdgVrsn(String.valueOf(nutritionorderoraldietschedulecodecoding.getVersion()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldietschedulecodecoding.hasCode()) {
			n.setNtritnOrdrOralDietSchdlCdCdgCd(String.valueOf(nutritionorderoraldietschedulecodecoding.getCode()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldietschedulecodecoding.hasSystem()) {
			n.setNtritnOrdrOralDietSchdlCdCdgSys(String.valueOf(nutritionorderoraldietschedulecodecoding.getSystem()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldietschedulecodecoding.hasUserSelected()) {
			n.setNtritnOrdrOralDietSchdlCdCdgUsrSltd(String.valueOf(nutritionorderoraldietschedulecodecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Cd_Txt ********************************************************************************/
		if(nutritionorderoraldietschedulecode.hasText()) {
			n.setNtritnOrdrOralDietSchdlCdTxt(String.valueOf(nutritionorderoraldietschedulecode.getText()));
		}
		/******************** nutritionorderoraldietschedulerepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent nutritionorderoraldietschedulerepeat = nutritionorderoraldietschedule.getRepeat();

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Off ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasOffset()) {
			n.setNtritnOrdrOralDietSchdlRptOff(String.valueOf(nutritionorderoraldietschedulerepeat.getOffset()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Cnt ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasCount()) {
			n.setNtritnOrdrOralDietSchdlRptCnt(String.valueOf(nutritionorderoraldietschedulerepeat.getCount()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Frqncy ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasFrequency()) {
			n.setNtritnOrdrOralDietSchdlRptFrqncy(String.valueOf(nutritionorderoraldietschedulerepeat.getFrequency()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Prd ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasPeriod()) {
			n.setNtritnOrdrOralDietSchdlRptPrd(String.valueOf(nutritionorderoraldietschedulerepeat.getPeriod()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_Duration ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasDuration()) {
			n.setNtritnOrdrOralDietSchdlRptDuration(String.valueOf(nutritionorderoraldietschedulerepeat.getDuration()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_CntMx ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasCountMax()) {
			n.setNtritnOrdrOralDietSchdlRptCntMx(String.valueOf(nutritionorderoraldietschedulerepeat.getCountMax()));
		}
		/******************** nutritionorderoraldietschedulerepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration nutritionorderoraldietschedulerepeatboundsduration = nutritionorderoraldietschedulerepeat.getBoundsDuration();

		/******************** nutritionorderoraldietschedulerepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionorderoraldietschedulerepeatboundsperiod = nutritionorderoraldietschedulerepeat.getBoundsPeriod();

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsperiod.hasEnd()) {
			n.setNtritnOrdrOralDietSchdlRptBndsPrdEnd(String.valueOf(nutritionorderoraldietschedulerepeatboundsperiod.getEnd()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsperiod.hasStart()) {
			n.setNtritnOrdrOralDietSchdlRptBndsPrdStrt(String.valueOf(nutritionorderoraldietschedulerepeatboundsperiod.getStart()));
		}
		/******************** nutritionorderoraldietschedulerepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range nutritionorderoraldietschedulerepeatboundsrange = nutritionorderoraldietschedulerepeat.getBoundsRange();

		/******************** nutritionorderoraldietschedulerepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderoraldietschedulerepeatboundsrangelow = nutritionorderoraldietschedulerepeatboundsrange.getLow();

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsrangelow.hasValue()) {
			n.setNtritnOrdrOralDietSchdlRptBndsRngLwVl(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangelow.getValue()));
		}
		/******************** nutritionorderoraldietschedulerepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderoraldietschedulerepeatboundsrangelowcomparator = nutritionorderoraldietschedulerepeatboundsrangelow.getComparator();
		n.setNtritnOrdrOralDietSchdlRptBndsRngLwCmprtr(nutritionorderoraldietschedulerepeatboundsrangelowcomparator.toCode());

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsrangelow.hasCode()) {
			n.setNtritnOrdrOralDietSchdlRptBndsRngLwCd(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangelow.getCode()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsrangelow.hasSystem()) {
			n.setNtritnOrdrOralDietSchdlRptBndsRngLwSys(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangelow.getSystem()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsrangelow.hasUnit()) {
			n.setNtritnOrdrOralDietSchdlRptBndsRngLwUnt(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangelow.getUnit()));
		}
		/******************** nutritionorderoraldietschedulerepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderoraldietschedulerepeatboundsrangehigh = nutritionorderoraldietschedulerepeatboundsrange.getHigh();

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsrangehigh.hasValue()) {
			n.setNtritnOrdrOralDietSchdlRptBndsRngHiVl(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangehigh.getValue()));
		}
		/******************** nutritionorderoraldietschedulerepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderoraldietschedulerepeatboundsrangehighcomparator = nutritionorderoraldietschedulerepeatboundsrangehigh.getComparator();
		n.setNtritnOrdrOralDietSchdlRptBndsRngHiCmprtr(nutritionorderoraldietschedulerepeatboundsrangehighcomparator.toCode());

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsrangehigh.hasCode()) {
			n.setNtritnOrdrOralDietSchdlRptBndsRngHiCd(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangehigh.getCode()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsrangehigh.hasSystem()) {
			n.setNtritnOrdrOralDietSchdlRptBndsRngHiSys(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangehigh.getSystem()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(nutritionorderoraldietschedulerepeatboundsrangehigh.hasUnit()) {
			n.setNtritnOrdrOralDietSchdlRptBndsRngHiUnt(String.valueOf(nutritionorderoraldietschedulerepeatboundsrangehigh.getUnit()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_PrdMx ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasPeriodMax()) {
			n.setNtritnOrdrOralDietSchdlRptPrdMx(String.valueOf(nutritionorderoraldietschedulerepeat.getPeriodMax()));
		}
		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasFrequencyMax()) {
			n.setNtritnOrdrOralDietSchdlRptFrqncyMx(String.valueOf(nutritionorderoraldietschedulerepeat.getFrequencyMax()));
		}
		/******************** nutritionorderoraldietschedulerepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionorderoraldietschedulerepeatperiodunit = nutritionorderoraldietschedulerepeat.getPeriodUnit();
		n.setNtritnOrdrOralDietSchdlRptPrdUnt(nutritionorderoraldietschedulerepeatperiodunit.toCode());

		/******************** NtritnOrdr_OralDiet_Schdl_Rpt_DurationMx ********************************************************************************/
		if(nutritionorderoraldietschedulerepeat.hasDurationMax()) {
			n.setNtritnOrdrOralDietSchdlRptDurationMx(String.valueOf(nutritionorderoraldietschedulerepeat.getDurationMax()));
		}
		/******************** nutritionorderoraldietschedulerepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionorderoraldietschedulerepeatdurationunit = nutritionorderoraldietschedulerepeat.getDurationUnit();
		n.setNtritnOrdrOralDietSchdlRptDurationUnt(nutritionorderoraldietschedulerepeatdurationunit.toCode());

		/******************** nutritionorderoraldiettexture ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietTextureComponent nutritionorderoraldiettexture = nutritionorderoraldiet.getTextureFirstRep();

		/******************** nutritionorderoraldiettexturefoodtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldiettexturefoodtype = nutritionorderoraldiettexture.getFoodType();

		/******************** nutritionorderoraldiettexturefoodtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldiettexturefoodtypecoding = nutritionorderoraldiettexturefoodtype.getCodingFirstRep();

		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecoding.hasDisplay()) {
			n.setNtritnOrdrOralDietTxtureFoodTypCdgDsply(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getDisplay()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecoding.hasVersion()) {
			n.setNtritnOrdrOralDietTxtureFoodTypCdgVrsn(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getVersion()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecoding.hasCode()) {
			n.setNtritnOrdrOralDietTxtureFoodTypCdgCd(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getCode()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecoding.hasSystem()) {
			n.setNtritnOrdrOralDietTxtureFoodTypCdgSys(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getSystem()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtypecoding.hasUserSelected()) {
			n.setNtritnOrdrOralDietTxtureFoodTypCdgUsrSltd(String.valueOf(nutritionorderoraldiettexturefoodtypecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_FoodTyp_Txt ********************************************************************************/
		if(nutritionorderoraldiettexturefoodtype.hasText()) {
			n.setNtritnOrdrOralDietTxtureFoodTypTxt(String.valueOf(nutritionorderoraldiettexturefoodtype.getText()));
		}
		/******************** nutritionorderoraldiettexturemodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldiettexturemodifier = nutritionorderoraldiettexture.getModifier();

		/******************** nutritionorderoraldiettexturemodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldiettexturemodifiercoding = nutritionorderoraldiettexturemodifier.getCodingFirstRep();

		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercoding.hasDisplay()) {
			n.setNtritnOrdrOralDietTxtureMdfrCdgDsply(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getDisplay()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercoding.hasVersion()) {
			n.setNtritnOrdrOralDietTxtureMdfrCdgVrsn(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getVersion()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercoding.hasCode()) {
			n.setNtritnOrdrOralDietTxtureMdfrCdgCd(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getCode()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercoding.hasSystem()) {
			n.setNtritnOrdrOralDietTxtureMdfrCdgSys(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getSystem()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldiettexturemodifiercoding.hasUserSelected()) {
			n.setNtritnOrdrOralDietTxtureMdfrCdgUsrSltd(String.valueOf(nutritionorderoraldiettexturemodifiercoding.getUserSelected()));
		}
		/******************** NtritnOrdr_OralDiet_Txture_Mdfr_Txt ********************************************************************************/
		if(nutritionorderoraldiettexturemodifier.hasText()) {
			n.setNtritnOrdrOralDietTxtureMdfrTxt(String.valueOf(nutritionorderoraldiettexturemodifier.getText()));
		}
		/******************** NtritnOrdr_OralDiet_Instrctn ********************************************************************************/
		if(nutritionorderoraldiet.hasInstruction()) {
			n.setNtritnOrdrOralDietInstrctn(String.valueOf(nutritionorderoraldiet.getInstruction()));
		}
		/******************** nutritionorderoraldietfluidconsistencytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldietfluidconsistencytype = nutritionorderoraldiet.getFluidConsistencyTypeFirstRep();

		/******************** nutritionorderoraldietfluidconsistencytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldietfluidconsistencytypecoding = nutritionorderoraldietfluidconsistencytype.getCodingFirstRep();

		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecoding.hasDisplay()) {
			n.setNtritnOrdrOralDietFluidConsistencyTypCdgDsply(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getDisplay()));
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecoding.hasVersion()) {
			n.setNtritnOrdrOralDietFluidConsistencyTypCdgVrsn(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getVersion()));
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecoding.hasCode()) {
			n.setNtritnOrdrOralDietFluidConsistencyTypCdgCd(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getCode()));
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecoding.hasSystem()) {
			n.setNtritnOrdrOralDietFluidConsistencyTypCdgSys(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getSystem()));
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytypecoding.hasUserSelected()) {
			n.setNtritnOrdrOralDietFluidConsistencyTypCdgUsrSltd(String.valueOf(nutritionorderoraldietfluidconsistencytypecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_OralDiet_FluidConsistencyTyp_Txt ********************************************************************************/
		if(nutritionorderoraldietfluidconsistencytype.hasText()) {
			n.setNtritnOrdrOralDietFluidConsistencyTypTxt(String.valueOf(nutritionorderoraldietfluidconsistencytype.getText()));
		}
		/******************** nutritionorderoraldietnutrient ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderOralDietNutrientComponent nutritionorderoraldietnutrient = nutritionorderoraldiet.getNutrientFirstRep();

		/******************** nutritionorderoraldietnutrientamount ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderoraldietnutrientamount = nutritionorderoraldietnutrient.getAmount();

		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Vl ********************************************************************************/
		if(nutritionorderoraldietnutrientamount.hasValue()) {
			n.setNtritnOrdrOralDietNutrientAmntVl(String.valueOf(nutritionorderoraldietnutrientamount.getValue()));
		}
		/******************** nutritionorderoraldietnutrientamountcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderoraldietnutrientamountcomparator = nutritionorderoraldietnutrientamount.getComparator();
		n.setNtritnOrdrOralDietNutrientAmntCmprtr(nutritionorderoraldietnutrientamountcomparator.toCode());

		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Cd ********************************************************************************/
		if(nutritionorderoraldietnutrientamount.hasCode()) {
			n.setNtritnOrdrOralDietNutrientAmntCd(String.valueOf(nutritionorderoraldietnutrientamount.getCode()));
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Sys ********************************************************************************/
		if(nutritionorderoraldietnutrientamount.hasSystem()) {
			n.setNtritnOrdrOralDietNutrientAmntSys(String.valueOf(nutritionorderoraldietnutrientamount.getSystem()));
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Amnt_Unt ********************************************************************************/
		if(nutritionorderoraldietnutrientamount.hasUnit()) {
			n.setNtritnOrdrOralDietNutrientAmntUnt(String.valueOf(nutritionorderoraldietnutrientamount.getUnit()));
		}
		/******************** nutritionorderoraldietnutrientmodifier ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderoraldietnutrientmodifier = nutritionorderoraldietnutrient.getModifier();

		/******************** nutritionorderoraldietnutrientmodifiercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderoraldietnutrientmodifiercoding = nutritionorderoraldietnutrientmodifier.getCodingFirstRep();

		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Dsply ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercoding.hasDisplay()) {
			n.setNtritnOrdrOralDietNutrientMdfrCdgDsply(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getDisplay()));
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercoding.hasVersion()) {
			n.setNtritnOrdrOralDietNutrientMdfrCdgVrsn(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getVersion()));
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Cd ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercoding.hasCode()) {
			n.setNtritnOrdrOralDietNutrientMdfrCdgCd(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getCode()));
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_Sys ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercoding.hasSystem()) {
			n.setNtritnOrdrOralDietNutrientMdfrCdgSys(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getSystem()));
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifiercoding.hasUserSelected()) {
			n.setNtritnOrdrOralDietNutrientMdfrCdgUsrSltd(String.valueOf(nutritionorderoraldietnutrientmodifiercoding.getUserSelected()));
		}
		/******************** NtritnOrdr_OralDiet_Nutrient_Mdfr_Txt ********************************************************************************/
		if(nutritionorderoraldietnutrientmodifier.hasText()) {
			n.setNtritnOrdrOralDietNutrientMdfrTxt(String.valueOf(nutritionorderoraldietnutrientmodifier.getText()));
		}
		/******************** nutritionorderenteralformula ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaComponent nutritionorderenteralformula = nutritionorder.getEnteralFormula();

		/******************** nutritionorderenteralformulaadditivetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformulaadditivetype = nutritionorderenteralformula.getAdditiveType();

		/******************** nutritionorderenteralformulaadditivetypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderenteralformulaadditivetypecoding = nutritionorderenteralformulaadditivetype.getCodingFirstRep();

		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Dsply ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecoding.hasDisplay()) {
			n.setNtritnOrdrEnteralFrmulaAddtvTypCdgDsply(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getDisplay()));
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecoding.hasVersion()) {
			n.setNtritnOrdrEnteralFrmulaAddtvTypCdgVrsn(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getVersion()));
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecoding.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaAddtvTypCdgCd(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecoding.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaAddtvTypCdgSys(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderenteralformulaadditivetypecoding.hasUserSelected()) {
			n.setNtritnOrdrEnteralFrmulaAddtvTypCdgUsrSltd(String.valueOf(nutritionorderenteralformulaadditivetypecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvTyp_Txt ********************************************************************************/
		if(nutritionorderenteralformulaadditivetype.hasText()) {
			n.setNtritnOrdrEnteralFrmulaAddtvTypTxt(String.valueOf(nutritionorderenteralformulaadditivetype.getText()));
		}
		/******************** nutritionorderenteralformulacaloricdensity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulacaloricdensity = nutritionorderenteralformula.getCaloricDensity();

		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Vl ********************************************************************************/
		if(nutritionorderenteralformulacaloricdensity.hasValue()) {
			n.setNtritnOrdrEnteralFrmulaCaloricDensityVl(String.valueOf(nutritionorderenteralformulacaloricdensity.getValue()));
		}
		/******************** nutritionorderenteralformulacaloricdensitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulacaloricdensitycomparator = nutritionorderenteralformulacaloricdensity.getComparator();
		n.setNtritnOrdrEnteralFrmulaCaloricDensityCmprtr(nutritionorderenteralformulacaloricdensitycomparator.toCode());

		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Cd ********************************************************************************/
		if(nutritionorderenteralformulacaloricdensity.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaCaloricDensityCd(String.valueOf(nutritionorderenteralformulacaloricdensity.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Sys ********************************************************************************/
		if(nutritionorderenteralformulacaloricdensity.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaCaloricDensitySys(String.valueOf(nutritionorderenteralformulacaloricdensity.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_CaloricDensity_Unt ********************************************************************************/
		if(nutritionorderenteralformulacaloricdensity.hasUnit()) {
			n.setNtritnOrdrEnteralFrmulaCaloricDensityUnt(String.valueOf(nutritionorderenteralformulacaloricdensity.getUnit()));
		}
		/******************** nutritionorderenteralformulabaseformulatype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformulabaseformulatype = nutritionorderenteralformula.getBaseFormulaType();

		/******************** nutritionorderenteralformulabaseformulatypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderenteralformulabaseformulatypecoding = nutritionorderenteralformulabaseformulatype.getCodingFirstRep();

		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Dsply ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecoding.hasDisplay()) {
			n.setNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgDsply(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getDisplay()));
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecoding.hasVersion()) {
			n.setNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgVrsn(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getVersion()));
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Cd ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecoding.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgCd(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_Sys ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecoding.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgSys(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatypecoding.hasUserSelected()) {
			n.setNtritnOrdrEnteralFrmulaBaseFrmulaTypCdgUsrSltd(String.valueOf(nutritionorderenteralformulabaseformulatypecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaTyp_Txt ********************************************************************************/
		if(nutritionorderenteralformulabaseformulatype.hasText()) {
			n.setNtritnOrdrEnteralFrmulaBaseFrmulaTypTxt(String.valueOf(nutritionorderenteralformulabaseformulatype.getText()));
		}
		/******************** nutritionorderenteralformulaadministration ********************************************************************************/
		org.hl7.fhir.r4.model.NutritionOrder.NutritionOrderEnteralFormulaAdministrationComponent nutritionorderenteralformulaadministration = nutritionorderenteralformula.getAdministrationFirstRep();

		/******************** nutritionorderenteralformulaadministrationratequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationratequantity = nutritionorderenteralformulaadministration.getRateQuantity();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationratequantity.hasValue()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtQntyVl(String.valueOf(nutritionorderenteralformulaadministrationratequantity.getValue()));
		}
		/******************** nutritionorderenteralformulaadministrationratequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationratequantitycomparator = nutritionorderenteralformulaadministrationratequantity.getComparator();
		n.setNtritnOrdrEnteralFrmulaAdmnstnRtQntyCmprtr(nutritionorderenteralformulaadministrationratequantitycomparator.toCode());

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationratequantity.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtQntyCd(String.valueOf(nutritionorderenteralformulaadministrationratequantity.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationratequantity.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtQntySys(String.valueOf(nutritionorderenteralformulaadministrationratequantity.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtQnty_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationratequantity.hasUnit()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtQntyUnt(String.valueOf(nutritionorderenteralformulaadministrationratequantity.getUnit()));
		}
		/******************** nutritionorderenteralformulaadministrationrateratio ********************************************************************************/
		org.hl7.fhir.r4.model.Ratio nutritionorderenteralformulaadministrationrateratio = nutritionorderenteralformulaadministration.getRateRatio();

		/******************** nutritionorderenteralformulaadministrationraterationumerator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationraterationumerator = nutritionorderenteralformulaadministrationrateratio.getNumerator();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationraterationumerator.hasValue()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrVl(String.valueOf(nutritionorderenteralformulaadministrationraterationumerator.getValue()));
		}
		/******************** nutritionorderenteralformulaadministrationraterationumeratorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationraterationumeratorcomparator = nutritionorderenteralformulaadministrationraterationumerator.getComparator();
		n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCmprtr(nutritionorderenteralformulaadministrationraterationumeratorcomparator.toCode());

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationraterationumerator.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrCd(String.valueOf(nutritionorderenteralformulaadministrationraterationumerator.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationraterationumerator.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrSys(String.valueOf(nutritionorderenteralformulaadministrationraterationumerator.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Nmrtr_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationraterationumerator.hasUnit()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioNmrtrUnt(String.valueOf(nutritionorderenteralformulaadministrationraterationumerator.getUnit()));
		}
		/******************** nutritionorderenteralformulaadministrationrateratiodenominator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationrateratiodenominator = nutritionorderenteralformulaadministrationrateratio.getDenominator();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationrateratiodenominator.hasValue()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrVl(String.valueOf(nutritionorderenteralformulaadministrationrateratiodenominator.getValue()));
		}
		/******************** nutritionorderenteralformulaadministrationrateratiodenominatorcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationrateratiodenominatorcomparator = nutritionorderenteralformulaadministrationrateratiodenominator.getComparator();
		n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCmprtr(nutritionorderenteralformulaadministrationrateratiodenominatorcomparator.toCode());

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationrateratiodenominator.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrCd(String.valueOf(nutritionorderenteralformulaadministrationrateratiodenominator.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationrateratiodenominator.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrSys(String.valueOf(nutritionorderenteralformulaadministrationrateratiodenominator.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_RtRtio_Dnmntr_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationrateratiodenominator.hasUnit()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnRtRtioDnmntrUnt(String.valueOf(nutritionorderenteralformulaadministrationrateratiodenominator.getUnit()));
		}
		/******************** nutritionorderenteralformulaadministrationquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationquantity = nutritionorderenteralformulaadministration.getQuantity();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationquantity.hasValue()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnQntyVl(String.valueOf(nutritionorderenteralformulaadministrationquantity.getValue()));
		}
		/******************** nutritionorderenteralformulaadministrationquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationquantitycomparator = nutritionorderenteralformulaadministrationquantity.getComparator();
		n.setNtritnOrdrEnteralFrmulaAdmnstnQntyCmprtr(nutritionorderenteralformulaadministrationquantitycomparator.toCode());

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationquantity.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnQntyCd(String.valueOf(nutritionorderenteralformulaadministrationquantity.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationquantity.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnQntySys(String.valueOf(nutritionorderenteralformulaadministrationquantity.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Qnty_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationquantity.hasUnit()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnQntyUnt(String.valueOf(nutritionorderenteralformulaadministrationquantity.getUnit()));
		}
		/******************** nutritionorderenteralformulaadministrationschedule ********************************************************************************/
		org.hl7.fhir.r4.model.Timing nutritionorderenteralformulaadministrationschedule = nutritionorderenteralformulaadministration.getSchedule();

		/******************** nutritionorderenteralformulaadministrationschedulecode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformulaadministrationschedulecode = nutritionorderenteralformulaadministrationschedule.getCode();

		/******************** nutritionorderenteralformulaadministrationschedulecodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderenteralformulaadministrationschedulecodecoding = nutritionorderenteralformulaadministrationschedulecode.getCodingFirstRep();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Dsply ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasDisplay()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgDsply(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getDisplay()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasVersion()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgVrsn(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getVersion()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgCd(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgSys(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecodecoding.hasUserSelected()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlCdCdgUsrSltd(String.valueOf(nutritionorderenteralformulaadministrationschedulecodecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Cd_Txt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulecode.hasText()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlCdTxt(String.valueOf(nutritionorderenteralformulaadministrationschedulecode.getText()));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent nutritionorderenteralformulaadministrationschedulerepeat = nutritionorderenteralformulaadministrationschedule.getRepeat();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Off ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasOffset()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptOff(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getOffset()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Cnt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasCount()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCnt(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getCount()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Frqncy ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasFrequency()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncy(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getFrequency()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Prd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasPeriod()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrd(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getPeriod()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_Duration ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasDuration()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDuration(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getDuration()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_CntMx ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasCountMax()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptCntMx(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getCountMax()));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration nutritionorderenteralformulaadministrationschedulerepeatboundsduration = nutritionorderenteralformulaadministrationschedulerepeat.getBoundsDuration();

		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionorderenteralformulaadministrationschedulerepeatboundsperiod = nutritionorderenteralformulaadministrationschedulerepeat.getBoundsPeriod();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_End ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.hasEnd()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdEnd(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.getEnd()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsPrd_Strt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.hasStart()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsPrdStrt(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsperiod.getStart()));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range nutritionorderenteralformulaadministrationschedulerepeatboundsrange = nutritionorderenteralformulaadministrationschedulerepeat.getBoundsRange();

		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow = nutritionorderenteralformulaadministrationschedulerepeatboundsrange.getLow();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.hasValue()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwVl(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getValue()));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator = nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getComparator();
		n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCmprtr(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelowcomparator.toCode());

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwCd(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwSys(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.hasUnit()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngLwUnt(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangelow.getUnit()));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh = nutritionorderenteralformulaadministrationschedulerepeatboundsrange.getHigh();

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.hasValue()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiVl(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getValue()));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator = nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getComparator();
		n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCmprtr(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehighcomparator.toCode());

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiCd(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiSys(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.hasUnit()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptBndsRngHiUnt(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeatboundsrangehigh.getUnit()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_PrdMx ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasPeriodMax()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdMx(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getPeriodMax()));
		}
		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_FrqncyMx ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasFrequencyMax()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptFrqncyMx(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getFrequencyMax()));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionorderenteralformulaadministrationschedulerepeatperiodunit = nutritionorderenteralformulaadministrationschedulerepeat.getPeriodUnit();
		n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptPrdUnt(nutritionorderenteralformulaadministrationschedulerepeatperiodunit.toCode());

		/******************** NtritnOrdr_EnteralFrmula_Admnstn_Schdl_Rpt_DurationMx ********************************************************************************/
		if(nutritionorderenteralformulaadministrationschedulerepeat.hasDurationMax()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationMx(String.valueOf(nutritionorderenteralformulaadministrationschedulerepeat.getDurationMax()));
		}
		/******************** nutritionorderenteralformulaadministrationschedulerepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime nutritionorderenteralformulaadministrationschedulerepeatdurationunit = nutritionorderenteralformulaadministrationschedulerepeat.getDurationUnit();
		n.setNtritnOrdrEnteralFrmulaAdmnstnSchdlRptDurationUnt(nutritionorderenteralformulaadministrationschedulerepeatdurationunit.toCode());

		/******************** nutritionorderenteralformularouteofadministration ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderenteralformularouteofadministration = nutritionorderenteralformula.getRouteofAdministration();

		/******************** nutritionorderenteralformularouteofadministrationcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderenteralformularouteofadministrationcoding = nutritionorderenteralformularouteofadministration.getCodingFirstRep();

		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Dsply ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcoding.hasDisplay()) {
			n.setNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgDsply(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getDisplay()));
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcoding.hasVersion()) {
			n.setNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgVrsn(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getVersion()));
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Cd ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcoding.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgCd(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_Sys ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcoding.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgSys(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderenteralformularouteofadministrationcoding.hasUserSelected()) {
			n.setNtritnOrdrEnteralFrmulaRouteofAdmnstnCdgUsrSltd(String.valueOf(nutritionorderenteralformularouteofadministrationcoding.getUserSelected()));
		}
		/******************** NtritnOrdr_EnteralFrmula_RouteofAdmnstn_Txt ********************************************************************************/
		if(nutritionorderenteralformularouteofadministration.hasText()) {
			n.setNtritnOrdrEnteralFrmulaRouteofAdmnstnTxt(String.valueOf(nutritionorderenteralformularouteofadministration.getText()));
		}
		/******************** NtritnOrdr_EnteralFrmula_AddtvPrdctNm ********************************************************************************/
		if(nutritionorderenteralformula.hasAdditiveProductName()) {
			n.setNtritnOrdrEnteralFrmulaAddtvPrdctNm(String.valueOf(nutritionorderenteralformula.getAdditiveProductName()));
		}
		/******************** NtritnOrdr_EnteralFrmula_AdmnstnInstrctn ********************************************************************************/
		if(nutritionorderenteralformula.hasAdministrationInstruction()) {
			n.setNtritnOrdrEnteralFrmulaAdmnstnInstrctn(String.valueOf(nutritionorderenteralformula.getAdministrationInstruction()));
		}
		/******************** NtritnOrdr_EnteralFrmula_BaseFrmulaPrdctNm ********************************************************************************/
		if(nutritionorderenteralformula.hasBaseFormulaProductName()) {
			n.setNtritnOrdrEnteralFrmulaBaseFrmulaPrdctNm(String.valueOf(nutritionorderenteralformula.getBaseFormulaProductName()));
		}
		/******************** nutritionorderenteralformulamaxvolumetodeliver ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity nutritionorderenteralformulamaxvolumetodeliver = nutritionorderenteralformula.getMaxVolumeToDeliver();

		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Vl ********************************************************************************/
		if(nutritionorderenteralformulamaxvolumetodeliver.hasValue()) {
			n.setNtritnOrdrEnteralFrmulaMxVolumeToDeliverVl(String.valueOf(nutritionorderenteralformulamaxvolumetodeliver.getValue()));
		}
		/******************** nutritionorderenteralformulamaxvolumetodelivercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator nutritionorderenteralformulamaxvolumetodelivercomparator = nutritionorderenteralformulamaxvolumetodeliver.getComparator();
		n.setNtritnOrdrEnteralFrmulaMxVolumeToDeliverCmprtr(nutritionorderenteralformulamaxvolumetodelivercomparator.toCode());

		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Cd ********************************************************************************/
		if(nutritionorderenteralformulamaxvolumetodeliver.hasCode()) {
			n.setNtritnOrdrEnteralFrmulaMxVolumeToDeliverCd(String.valueOf(nutritionorderenteralformulamaxvolumetodeliver.getCode()));
		}
		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Sys ********************************************************************************/
		if(nutritionorderenteralformulamaxvolumetodeliver.hasSystem()) {
			n.setNtritnOrdrEnteralFrmulaMxVolumeToDeliverSys(String.valueOf(nutritionorderenteralformulamaxvolumetodeliver.getSystem()));
		}
		/******************** NtritnOrdr_EnteralFrmula_MxVolumeToDeliver_Unt ********************************************************************************/
		if(nutritionorderenteralformulamaxvolumetodeliver.hasUnit()) {
			n.setNtritnOrdrEnteralFrmulaMxVolumeToDeliverUnt(String.valueOf(nutritionorderenteralformulamaxvolumetodeliver.getUnit()));
		}
		/******************** nutritionorderidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier nutritionorderidentifier = nutritionorder.getIdentifierFirstRep();

		/******************** NtritnOrdr_Id_Vl ********************************************************************************/
		if(nutritionorderidentifier.hasValue()) {
			n.setNtritnOrdrIdVl(String.valueOf(nutritionorderidentifier.getValue()));
		}
		/******************** nutritionorderidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept nutritionorderidentifiertype = nutritionorderidentifier.getType();

		/******************** nutritionorderidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding nutritionorderidentifiertypecoding = nutritionorderidentifiertype.getCodingFirstRep();

		/******************** NtritnOrdr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(nutritionorderidentifiertypecoding.hasDisplay()) {
			n.setNtritnOrdrIdTypCdgDsply(String.valueOf(nutritionorderidentifiertypecoding.getDisplay()));
		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(nutritionorderidentifiertypecoding.hasVersion()) {
			n.setNtritnOrdrIdTypCdgVrsn(String.valueOf(nutritionorderidentifiertypecoding.getVersion()));
		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(nutritionorderidentifiertypecoding.hasCode()) {
			n.setNtritnOrdrIdTypCdgCd(String.valueOf(nutritionorderidentifiertypecoding.getCode()));
		}
		/******************** NtritnOrdr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(nutritionorderidentifiertypecoding.hasSystem()) {
			n.setNtritnOrdrIdTypCdgSys(String.valueOf(nutritionorderidentifiertypecoding.getSystem()));
		}
		/******************** NtritnOrdr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(nutritionorderidentifiertypecoding.hasUserSelected()) {
			n.setNtritnOrdrIdTypCdgUsrSltd(String.valueOf(nutritionorderidentifiertypecoding.getUserSelected()));
		}
		/******************** NtritnOrdr_Id_Typ_Txt ********************************************************************************/
		if(nutritionorderidentifiertype.hasText()) {
			n.setNtritnOrdrIdTypTxt(String.valueOf(nutritionorderidentifiertype.getText()));
		}
		/******************** NtritnOrdr_Id_Sys ********************************************************************************/
		if(nutritionorderidentifier.hasSystem()) {
			n.setNtritnOrdrIdSys(String.valueOf(nutritionorderidentifier.getSystem()));
		}
		/******************** NtritnOrdr_Id_Assigner ********************************************************************************/
		if(nutritionorderidentifier.hasAssigner()) {
			n.setNtritnOrdrIdAssigner(String.valueOf(nutritionorderidentifier.getAssigner()));
		}
		/******************** nutritionorderidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period nutritionorderidentifierperiod = nutritionorderidentifier.getPeriod();

		/******************** NtritnOrdr_Id_Prd_End ********************************************************************************/
		if(nutritionorderidentifierperiod.hasEnd()) {
			n.setNtritnOrdrIdPrdEnd(String.valueOf(nutritionorderidentifierperiod.getEnd()));
		}
		/******************** NtritnOrdr_Id_Prd_Strt ********************************************************************************/
		if(nutritionorderidentifierperiod.hasStart()) {
			n.setNtritnOrdrIdPrdStrt(String.valueOf(nutritionorderidentifierperiod.getStart()));
		}
		/******************** nutritionorderidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse nutritionorderidentifieruse = nutritionorderidentifier.getUse();
		n.setNtritnOrdrIdUse(nutritionorderidentifieruse.toCode());

		return n;
	}
}
