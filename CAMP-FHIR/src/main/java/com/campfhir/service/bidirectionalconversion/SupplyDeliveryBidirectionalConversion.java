package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SupplyDelivery;
public class SupplyDeliveryBidirectionalConversion 
{
	public SupplyDelivery SupplyDeliverys(org.hl7.fhir.r4.model.SupplyDelivery supplydelivery) throws ParseException
	{
		 main.java.com.campfhir.model.SupplyDelivery s = new  main.java.com.campfhir.model.SupplyDelivery();

		/******************** id ********************************************************************************/
		supplydelivery.setId(s.getId());

		/******************** supplydeliverytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliverytype = supplydelivery.getType();

		/******************** supplydeliverytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplydeliverytypecoding = supplydeliverytype.getCodingFirstRep();

		/******************** SpplyDlvry_Typ_Cdg_Dsply ********************************************************************************/
		if(supplydeliverytypecoding.hasDisplay()) {
			s.setSpplyDlvryTypCdgDsply(String.valueOf(supplydeliverytypecoding.getDisplay()));
		}
		/******************** SpplyDlvry_Typ_Cdg_Vrsn ********************************************************************************/
		if(supplydeliverytypecoding.hasVersion()) {
			s.setSpplyDlvryTypCdgVrsn(String.valueOf(supplydeliverytypecoding.getVersion()));
		}
		/******************** SpplyDlvry_Typ_Cdg_Cd ********************************************************************************/
		if(supplydeliverytypecoding.hasCode()) {
			s.setSpplyDlvryTypCdgCd(String.valueOf(supplydeliverytypecoding.getCode()));
		}
		/******************** SpplyDlvry_Typ_Cdg_Sys ********************************************************************************/
		if(supplydeliverytypecoding.hasSystem()) {
			s.setSpplyDlvryTypCdgSys(String.valueOf(supplydeliverytypecoding.getSystem()));
		}
		/******************** SpplyDlvry_Typ_Cdg_UsrSltd ********************************************************************************/
		if(supplydeliverytypecoding.hasUserSelected()) {
			s.setSpplyDlvryTypCdgUsrSltd(String.valueOf(supplydeliverytypecoding.getUserSelected()));
		}
		/******************** SpplyDlvry_Typ_Txt ********************************************************************************/
		if(supplydeliverytype.hasText()) {
			s.setSpplyDlvryTypTxt(String.valueOf(supplydeliverytype.getText()));
		}
		/******************** supplydeliveryoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplydeliveryoccurrenceperiod = supplydelivery.getOccurrencePeriod();

		/******************** SpplyDlvry_OccrncePrd_End ********************************************************************************/
		if(supplydeliveryoccurrenceperiod.hasEnd()) {
			s.setSpplyDlvryOccrncePrdEnd(String.valueOf(supplydeliveryoccurrenceperiod.getEnd()));
		}
		/******************** SpplyDlvry_OccrncePrd_Strt ********************************************************************************/
		if(supplydeliveryoccurrenceperiod.hasStart()) {
			s.setSpplyDlvryOccrncePrdStrt(String.valueOf(supplydeliveryoccurrenceperiod.getStart()));
		}
		/******************** SpplyDlvry_OccrnceDtTimeTyp ********************************************************************************/
		if(supplydelivery.hasOccurrenceDateTimeType()) {
			s.setSpplyDlvryOccrnceDtTimeTyp(String.valueOf(supplydelivery.getOccurrenceDateTimeType()));
		}
		/******************** supplydeliveryoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing supplydeliveryoccurrencetiming = supplydelivery.getOccurrenceTiming();

		/******************** supplydeliveryoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliveryoccurrencetimingcode = supplydeliveryoccurrencetiming.getCode();

		/******************** supplydeliveryoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplydeliveryoccurrencetimingcodecoding = supplydeliveryoccurrencetimingcode.getCodingFirstRep();

		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecoding.hasDisplay()) {
			s.setSpplyDlvryOccrnceTmgCdCdgDsply(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getDisplay()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecoding.hasVersion()) {
			s.setSpplyDlvryOccrnceTmgCdCdgVrsn(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getVersion()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecoding.hasCode()) {
			s.setSpplyDlvryOccrnceTmgCdCdgCd(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getCode()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecoding.hasSystem()) {
			s.setSpplyDlvryOccrnceTmgCdCdgSys(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getSystem()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(supplydeliveryoccurrencetimingcodecoding.hasUserSelected()) {
			s.setSpplyDlvryOccrnceTmgCdCdgUsrSltd(String.valueOf(supplydeliveryoccurrencetimingcodecoding.getUserSelected()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(supplydeliveryoccurrencetimingcode.hasText()) {
			s.setSpplyDlvryOccrnceTmgCdTxt(String.valueOf(supplydeliveryoccurrencetimingcode.getText()));
		}
		/******************** supplydeliveryoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent supplydeliveryoccurrencetimingrepeat = supplydeliveryoccurrencetiming.getRepeat();

		/******************** SpplyDlvry_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasOffset()) {
			s.setSpplyDlvryOccrnceTmgRptOff(String.valueOf(supplydeliveryoccurrencetimingrepeat.getOffset()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasCount()) {
			s.setSpplyDlvryOccrnceTmgRptCnt(String.valueOf(supplydeliveryoccurrencetimingrepeat.getCount()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasFrequency()) {
			s.setSpplyDlvryOccrnceTmgRptFrqncy(String.valueOf(supplydeliveryoccurrencetimingrepeat.getFrequency()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasPeriod()) {
			s.setSpplyDlvryOccrnceTmgRptPrd(String.valueOf(supplydeliveryoccurrencetimingrepeat.getPeriod()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasDuration()) {
			s.setSpplyDlvryOccrnceTmgRptDuration(String.valueOf(supplydeliveryoccurrencetimingrepeat.getDuration()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasCountMax()) {
			s.setSpplyDlvryOccrnceTmgRptCntMx(String.valueOf(supplydeliveryoccurrencetimingrepeat.getCountMax()));
		}
		/******************** supplydeliveryoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration supplydeliveryoccurrencetimingrepeatboundsduration = supplydeliveryoccurrencetimingrepeat.getBoundsDuration();

		/******************** supplydeliveryoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplydeliveryoccurrencetimingrepeatboundsperiod = supplydeliveryoccurrencetimingrepeat.getBoundsPeriod();

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsperiod.hasEnd()) {
			s.setSpplyDlvryOccrnceTmgRptBndsPrdEnd(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsperiod.getEnd()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsperiod.hasStart()) {
			s.setSpplyDlvryOccrnceTmgRptBndsPrdStrt(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsperiod.getStart()));
		}
		/******************** supplydeliveryoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range supplydeliveryoccurrencetimingrepeatboundsrange = supplydeliveryoccurrencetimingrepeat.getBoundsRange();

		/******************** supplydeliveryoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplydeliveryoccurrencetimingrepeatboundsrangelow = supplydeliveryoccurrencetimingrepeatboundsrange.getLow();

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangelow.hasValue()) {
			s.setSpplyDlvryOccrnceTmgRptBndsRngLwVl(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangelow.getValue()));
		}
		/******************** supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator = supplydeliveryoccurrencetimingrepeatboundsrangelow.getComparator();
		s.setSpplyDlvryOccrnceTmgRptBndsRngLwCmprtr(supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator.toCode());

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangelow.hasCode()) {
			s.setSpplyDlvryOccrnceTmgRptBndsRngLwCd(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangelow.getCode()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangelow.hasSystem()) {
			s.setSpplyDlvryOccrnceTmgRptBndsRngLwSys(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangelow.hasUnit()) {
			s.setSpplyDlvryOccrnceTmgRptBndsRngLwUnt(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** supplydeliveryoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplydeliveryoccurrencetimingrepeatboundsrangehigh = supplydeliveryoccurrencetimingrepeatboundsrange.getHigh();

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangehigh.hasValue()) {
			s.setSpplyDlvryOccrnceTmgRptBndsRngHiVl(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator = supplydeliveryoccurrencetimingrepeatboundsrangehigh.getComparator();
		s.setSpplyDlvryOccrnceTmgRptBndsRngHiCmprtr(supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator.toCode());

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangehigh.hasCode()) {
			s.setSpplyDlvryOccrnceTmgRptBndsRngHiCd(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangehigh.hasSystem()) {
			s.setSpplyDlvryOccrnceTmgRptBndsRngHiSys(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeatboundsrangehigh.hasUnit()) {
			s.setSpplyDlvryOccrnceTmgRptBndsRngHiUnt(String.valueOf(supplydeliveryoccurrencetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasPeriodMax()) {
			s.setSpplyDlvryOccrnceTmgRptPrdMx(String.valueOf(supplydeliveryoccurrencetimingrepeat.getPeriodMax()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasFrequencyMax()) {
			s.setSpplyDlvryOccrnceTmgRptFrqncyMx(String.valueOf(supplydeliveryoccurrencetimingrepeat.getFrequencyMax()));
		}
		/******************** supplydeliveryoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime supplydeliveryoccurrencetimingrepeatperiodunit = supplydeliveryoccurrencetimingrepeat.getPeriodUnit();
		s.setSpplyDlvryOccrnceTmgRptPrdUnt(supplydeliveryoccurrencetimingrepeatperiodunit.toCode());

		/******************** SpplyDlvry_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(supplydeliveryoccurrencetimingrepeat.hasDurationMax()) {
			s.setSpplyDlvryOccrnceTmgRptDurationMx(String.valueOf(supplydeliveryoccurrencetimingrepeat.getDurationMax()));
		}
		/******************** supplydeliveryoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime supplydeliveryoccurrencetimingrepeatdurationunit = supplydeliveryoccurrencetimingrepeat.getDurationUnit();
		s.setSpplyDlvryOccrnceTmgRptDurationUnt(supplydeliveryoccurrencetimingrepeatdurationunit.toCode());

		/******************** supplydeliverystatus ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliveryStatus supplydeliverystatus = supplydelivery.getStatus();
		s.setSpplyDlvrySts(supplydeliverystatus.toCode());

		/******************** SpplyDlvry_BasedOn ********************************************************************************/
		if(supplydelivery.hasBasedOn()) {
			s.setSpplyDlvryBasedOn(String.valueOf(supplydelivery.getBasedOnFirstRep()));
		}
		/******************** SpplyDlvry_Receiver ********************************************************************************/
		if(supplydelivery.hasReceiver()) {
			s.setSpplyDlvryReceiver(String.valueOf(supplydelivery.getReceiverFirstRep()));
		}
		/******************** SpplyDlvry_Pnt ********************************************************************************/
		if(supplydelivery.hasPatient()) {
			s.setSpplyDlvryPnt(String.valueOf(supplydelivery.getPatient()));
		}
		/******************** SpplyDlvry_PartOf ********************************************************************************/
		if(supplydelivery.hasPartOf()) {
			s.setSpplyDlvryPartOf(String.valueOf(supplydelivery.getPartOfFirstRep()));
		}
		/******************** supplydeliverysupplieditem ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliverySuppliedItemComponent supplydeliverysupplieditem = supplydelivery.getSuppliedItem();

		/******************** supplydeliverysupplieditemitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliverysupplieditemitemcodeableconcept = supplydeliverysupplieditem.getItemCodeableConcept();

		/******************** supplydeliverysupplieditemitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplydeliverysupplieditemitemcodeableconceptcoding = supplydeliverysupplieditemitemcodeableconcept.getCodingFirstRep();

		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasDisplay()) {
			s.setSpplyDlvrySuppliedItmItmCdbleCncptCdgDsply(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getDisplay()));
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasVersion()) {
			s.setSpplyDlvrySuppliedItmItmCdbleCncptCdgVrsn(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getVersion()));
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasCode()) {
			s.setSpplyDlvrySuppliedItmItmCdbleCncptCdgCd(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getCode()));
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasSystem()) {
			s.setSpplyDlvrySuppliedItmItmCdbleCncptCdgSys(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getSystem()));
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconceptcoding.hasUserSelected()) {
			s.setSpplyDlvrySuppliedItmItmCdbleCncptCdgUsrSltd(String.valueOf(supplydeliverysupplieditemitemcodeableconceptcoding.getUserSelected()));
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Txt ********************************************************************************/
		if(supplydeliverysupplieditemitemcodeableconcept.hasText()) {
			s.setSpplyDlvrySuppliedItmItmCdbleCncptTxt(String.valueOf(supplydeliverysupplieditemitemcodeableconcept.getText()));
		}
		/******************** SpplyDlvry_SuppliedItm_ItmRfrnc ********************************************************************************/
		if(supplydeliverysupplieditem.hasItemReference()) {
			s.setSpplyDlvrySuppliedItmItmRfrnc(String.valueOf(supplydeliverysupplieditem.getItemReference()));
		}
		/******************** supplydeliverysupplieditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplydeliverysupplieditemquantity = supplydeliverysupplieditem.getQuantity();

		/******************** SpplyDlvry_SuppliedItm_Qnty_Vl ********************************************************************************/
		if(supplydeliverysupplieditemquantity.hasValue()) {
			s.setSpplyDlvrySuppliedItmQntyVl(String.valueOf(supplydeliverysupplieditemquantity.getValue()));
		}
		/******************** supplydeliverysupplieditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplydeliverysupplieditemquantitycomparator = supplydeliverysupplieditemquantity.getComparator();
		s.setSpplyDlvrySuppliedItmQntyCmprtr(supplydeliverysupplieditemquantitycomparator.toCode());

		/******************** SpplyDlvry_SuppliedItm_Qnty_Cd ********************************************************************************/
		if(supplydeliverysupplieditemquantity.hasCode()) {
			s.setSpplyDlvrySuppliedItmQntyCd(String.valueOf(supplydeliverysupplieditemquantity.getCode()));
		}
		/******************** SpplyDlvry_SuppliedItm_Qnty_Sys ********************************************************************************/
		if(supplydeliverysupplieditemquantity.hasSystem()) {
			s.setSpplyDlvrySuppliedItmQntySys(String.valueOf(supplydeliverysupplieditemquantity.getSystem()));
		}
		/******************** SpplyDlvry_SuppliedItm_Qnty_Unt ********************************************************************************/
		if(supplydeliverysupplieditemquantity.hasUnit()) {
			s.setSpplyDlvrySuppliedItmQntyUnt(String.valueOf(supplydeliverysupplieditemquantity.getUnit()));
		}
		/******************** SpplyDlvry_Supplier ********************************************************************************/
		if(supplydelivery.hasSupplier()) {
			s.setSpplyDlvrySupplier(String.valueOf(supplydelivery.getSupplier()));
		}
		/******************** supplydeliveryidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier supplydeliveryidentifier = supplydelivery.getIdentifierFirstRep();

		/******************** SpplyDlvry_Id_Vl ********************************************************************************/
		if(supplydeliveryidentifier.hasValue()) {
			s.setSpplyDlvryIdVl(String.valueOf(supplydeliveryidentifier.getValue()));
		}
		/******************** supplydeliveryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliveryidentifiertype = supplydeliveryidentifier.getType();

		/******************** supplydeliveryidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplydeliveryidentifiertypecoding = supplydeliveryidentifiertype.getCodingFirstRep();

		/******************** SpplyDlvry_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(supplydeliveryidentifiertypecoding.hasDisplay()) {
			s.setSpplyDlvryIdTypCdgDsply(String.valueOf(supplydeliveryidentifiertypecoding.getDisplay()));
		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(supplydeliveryidentifiertypecoding.hasVersion()) {
			s.setSpplyDlvryIdTypCdgVrsn(String.valueOf(supplydeliveryidentifiertypecoding.getVersion()));
		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Cd ********************************************************************************/
		if(supplydeliveryidentifiertypecoding.hasCode()) {
			s.setSpplyDlvryIdTypCdgCd(String.valueOf(supplydeliveryidentifiertypecoding.getCode()));
		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Sys ********************************************************************************/
		if(supplydeliveryidentifiertypecoding.hasSystem()) {
			s.setSpplyDlvryIdTypCdgSys(String.valueOf(supplydeliveryidentifiertypecoding.getSystem()));
		}
		/******************** SpplyDlvry_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(supplydeliveryidentifiertypecoding.hasUserSelected()) {
			s.setSpplyDlvryIdTypCdgUsrSltd(String.valueOf(supplydeliveryidentifiertypecoding.getUserSelected()));
		}
		/******************** SpplyDlvry_Id_Typ_Txt ********************************************************************************/
		if(supplydeliveryidentifiertype.hasText()) {
			s.setSpplyDlvryIdTypTxt(String.valueOf(supplydeliveryidentifiertype.getText()));
		}
		/******************** SpplyDlvry_Id_Sys ********************************************************************************/
		if(supplydeliveryidentifier.hasSystem()) {
			s.setSpplyDlvryIdSys(String.valueOf(supplydeliveryidentifier.getSystem()));
		}
		/******************** SpplyDlvry_Id_Assigner ********************************************************************************/
		if(supplydeliveryidentifier.hasAssigner()) {
			s.setSpplyDlvryIdAssigner(String.valueOf(supplydeliveryidentifier.getAssigner()));
		}
		/******************** supplydeliveryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplydeliveryidentifierperiod = supplydeliveryidentifier.getPeriod();

		/******************** SpplyDlvry_Id_Prd_End ********************************************************************************/
		if(supplydeliveryidentifierperiod.hasEnd()) {
			s.setSpplyDlvryIdPrdEnd(String.valueOf(supplydeliveryidentifierperiod.getEnd()));
		}
		/******************** SpplyDlvry_Id_Prd_Strt ********************************************************************************/
		if(supplydeliveryidentifierperiod.hasStart()) {
			s.setSpplyDlvryIdPrdStrt(String.valueOf(supplydeliveryidentifierperiod.getStart()));
		}
		/******************** supplydeliveryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse supplydeliveryidentifieruse = supplydeliveryidentifier.getUse();
		s.setSpplyDlvryIdUse(supplydeliveryidentifieruse.toCode());

		/******************** SpplyDlvry_Destination ********************************************************************************/
		if(supplydelivery.hasDestination()) {
			s.setSpplyDlvryDestination(String.valueOf(supplydelivery.getDestination()));
		}
		return s;
	}
}
