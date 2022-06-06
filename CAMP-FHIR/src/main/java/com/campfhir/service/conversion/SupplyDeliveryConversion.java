package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SupplyDelivery;
public class SupplyDeliveryConversion 
{
	public org.hl7.fhir.r4.model.SupplyDelivery SupplyDeliverys(SupplyDelivery s) throws ParseException
	{
		org.hl7.fhir.r4.model.SupplyDelivery supplydelivery = new org.hl7.fhir.r4.model.SupplyDelivery();

		/******************** id ********************************************************************************/
		supplydelivery.setId(s.getId());

		/******************** SpplyDlvry_BasedOn ********************************************************************************/
		if(s.getSpplyDlvryBasedOn() != null) {
			supplydelivery.addBasedOn( new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvryBasedOn()));
		}
		/******************** SpplyDlvry_Destination ********************************************************************************/
		if(s.getSpplyDlvryDestination() != null) {
			supplydelivery.setDestination( new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvryDestination()));
		}
		/******************** supplydeliveryidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier supplydeliveryidentifier =  new org.hl7.fhir.r4.model.Identifier();
		supplydelivery.addIdentifier(supplydeliveryidentifier);

		/******************** SpplyDlvry_Id_Assigner ********************************************************************************/
		if(s.getSpplyDlvryIdAssigner() != null) {
			supplydeliveryidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvryIdAssigner()));
		}
		/******************** supplydeliveryidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplydeliveryidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		supplydeliveryidentifier.setPeriod(supplydeliveryidentifierperiod);

		/******************** SpplyDlvry_Id_Prd_End ********************************************************************************/
		if(s.getSpplyDlvryIdPrdEnd() != null) {
			java.text.SimpleDateFormat SpplyDlvry_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyDlvry_Id_Prd_Enddate = SpplyDlvry_Id_Prd_Endsdf.parse(s.getSpplyDlvryIdPrdEnd());
			supplydeliveryidentifierperiod.setEnd(SpplyDlvry_Id_Prd_Enddate);
		}
		/******************** SpplyDlvry_Id_Prd_Strt ********************************************************************************/
		if(s.getSpplyDlvryIdPrdStrt() != null) {
			java.text.SimpleDateFormat SpplyDlvry_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyDlvry_Id_Prd_Strtdate = SpplyDlvry_Id_Prd_Strtsdf.parse(s.getSpplyDlvryIdPrdStrt());
			supplydeliveryidentifierperiod.setStart(SpplyDlvry_Id_Prd_Strtdate);
		}
		/******************** SpplyDlvry_Id_Sys ********************************************************************************/
		if(s.getSpplyDlvryIdSys() != null) {
			supplydeliveryidentifier.setSystem(s.getSpplyDlvryIdSys());
		}
		/******************** supplydeliveryidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliveryidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplydeliveryidentifier.setType(supplydeliveryidentifiertype);

		/******************** supplydeliveryidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplydeliveryidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		supplydeliveryidentifiertype.addCoding(supplydeliveryidentifiertypecoding);

		/******************** SpplyDlvry_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgCd() != null) {
			supplydeliveryidentifiertypecoding.setCode(s.getSpplyDlvryIdTypCdgCd());
		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgDsply() != null) {
			supplydeliveryidentifiertypecoding.setDisplay(s.getSpplyDlvryIdTypCdgDsply());
		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgSys() != null) {
			supplydeliveryidentifiertypecoding.setSystem(s.getSpplyDlvryIdTypCdgSys());
		}
		/******************** SpplyDlvry_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgUsrSltd() != null) {
			supplydeliveryidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSpplyDlvryIdTypCdgUsrSltd()));
		}
		/******************** SpplyDlvry_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyDlvryIdTypCdgVrsn() != null) {
			supplydeliveryidentifiertypecoding.setVersion(s.getSpplyDlvryIdTypCdgVrsn());
		}
		/******************** SpplyDlvry_Id_Typ_Txt ********************************************************************************/
		if(s.getSpplyDlvryIdTypTxt() != null) {
			supplydeliveryidentifiertype.setText(s.getSpplyDlvryIdTypTxt());
		}
		/******************** supplydeliveryidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory supplydeliveryidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		supplydeliveryidentifier.setUse(supplydeliveryidentifieruse.fromCode(s.getSpplyDlvryIdUse()));

		/******************** SpplyDlvry_Id_Vl ********************************************************************************/
		if(s.getSpplyDlvryIdVl() != null) {
			supplydeliveryidentifier.setValue(s.getSpplyDlvryIdVl());
		}
		/******************** SpplyDlvry_OccrnceDtTimeTyp ********************************************************************************/
		if(s.getSpplyDlvryOccrnceDtTimeTyp() != null) {
			supplydelivery.setOccurrence( new org.hl7.fhir.r4.model.DateTimeType(s.getSpplyDlvryOccrnceDtTimeTyp()));
		}
		/******************** supplydeliveryoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplydeliveryoccurrenceperiod =  new org.hl7.fhir.r4.model.Period();
		supplydelivery.setOccurrence(supplydeliveryoccurrenceperiod);

		/******************** SpplyDlvry_OccrncePrd_End ********************************************************************************/
		if(s.getSpplyDlvryOccrncePrdEnd() != null) {
			java.text.SimpleDateFormat SpplyDlvry_OccrncePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyDlvry_OccrncePrd_Enddate = SpplyDlvry_OccrncePrd_Endsdf.parse(s.getSpplyDlvryOccrncePrdEnd());
			supplydeliveryoccurrenceperiod.setEnd(SpplyDlvry_OccrncePrd_Enddate);
		}
		/******************** SpplyDlvry_OccrncePrd_Strt ********************************************************************************/
		if(s.getSpplyDlvryOccrncePrdStrt() != null) {
			java.text.SimpleDateFormat SpplyDlvry_OccrncePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyDlvry_OccrncePrd_Strtdate = SpplyDlvry_OccrncePrd_Strtsdf.parse(s.getSpplyDlvryOccrncePrdStrt());
			supplydeliveryoccurrenceperiod.setStart(SpplyDlvry_OccrncePrd_Strtdate);
		}
		/******************** supplydeliveryoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing supplydeliveryoccurrencetiming =  new org.hl7.fhir.r4.model.Timing();
		supplydelivery.setOccurrence(supplydeliveryoccurrencetiming);

		/******************** supplydeliveryoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliveryoccurrencetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplydeliveryoccurrencetiming.setCode(supplydeliveryoccurrencetimingcode);

		/******************** supplydeliveryoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplydeliveryoccurrencetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		supplydeliveryoccurrencetimingcode.addCoding(supplydeliveryoccurrencetimingcodecoding);

		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgCd() != null) {
			supplydeliveryoccurrencetimingcodecoding.setCode(s.getSpplyDlvryOccrnceTmgCdCdgCd());
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgDsply() != null) {
			supplydeliveryoccurrencetimingcodecoding.setDisplay(s.getSpplyDlvryOccrnceTmgCdCdgDsply());
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgSys() != null) {
			supplydeliveryoccurrencetimingcodecoding.setSystem(s.getSpplyDlvryOccrnceTmgCdCdgSys());
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgUsrSltd() != null) {
			supplydeliveryoccurrencetimingcodecoding.setUserSelected(Boolean.parseBoolean(s.getSpplyDlvryOccrnceTmgCdCdgUsrSltd()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdCdgVrsn() != null) {
			supplydeliveryoccurrencetimingcodecoding.setVersion(s.getSpplyDlvryOccrnceTmgCdCdgVrsn());
		}
		/******************** SpplyDlvry_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgCdTxt() != null) {
			supplydeliveryoccurrencetimingcode.setText(s.getSpplyDlvryOccrnceTmgCdTxt());
		}
		/******************** SpplyDlvry_OccrnceTmg_Evnt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgEvnt() != null) {
			java.text.SimpleDateFormat SpplyDlvry_OccrnceTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyDlvry_OccrnceTmg_Evntdate = SpplyDlvry_OccrnceTmg_Evntsdf.parse(s.getSpplyDlvryOccrnceTmgEvnt());
			supplydeliveryoccurrencetiming.addEvent(SpplyDlvry_OccrnceTmg_Evntdate);
		}
		/******************** supplydeliveryoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent supplydeliveryoccurrencetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		supplydeliveryoccurrencetiming.setRepeat(supplydeliveryoccurrencetimingrepeat);

		/******************** supplydeliveryoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration supplydeliveryoccurrencetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		supplydeliveryoccurrencetimingrepeat.setBounds(supplydeliveryoccurrencetimingrepeatboundsduration);

		/******************** supplydeliveryoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplydeliveryoccurrencetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		supplydeliveryoccurrencetimingrepeat.setBounds(supplydeliveryoccurrencetimingrepeatboundsperiod);

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Enddate = SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Endsdf.parse(s.getSpplyDlvryOccrnceTmgRptBndsPrdEnd());
			supplydeliveryoccurrencetimingrepeatboundsperiod.setEnd(SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Strtdate = SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Strtsdf.parse(s.getSpplyDlvryOccrnceTmgRptBndsPrdStrt());
			supplydeliveryoccurrencetimingrepeatboundsperiod.setStart(SpplyDlvry_OccrnceTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** supplydeliveryoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range supplydeliveryoccurrencetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		supplydeliveryoccurrencetimingrepeat.setBounds(supplydeliveryoccurrencetimingrepeatboundsrange);

		/******************** supplydeliveryoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplydeliveryoccurrencetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		supplydeliveryoccurrencetimingrepeatboundsrange.setHigh(supplydeliveryoccurrencetimingrepeatboundsrangehigh);

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiCd() != null) {
			supplydeliveryoccurrencetimingrepeatboundsrangehigh.setCode(s.getSpplyDlvryOccrnceTmgRptBndsRngHiCd());
		}
		/******************** supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplydeliveryoccurrencetimingrepeatboundsrangehigh.setComparator(supplydeliveryoccurrencetimingrepeatboundsrangehighcomparator.fromCode(s.getSpplyDlvryOccrnceTmgRptBndsRngHiCmprtr()));

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiSys() != null) {
			supplydeliveryoccurrencetimingrepeatboundsrangehigh.setSystem(s.getSpplyDlvryOccrnceTmgRptBndsRngHiSys());
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiUnt() != null) {
			supplydeliveryoccurrencetimingrepeatboundsrangehigh.setUnit(s.getSpplyDlvryOccrnceTmgRptBndsRngHiUnt());
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngHiVl() != null) {
			supplydeliveryoccurrencetimingrepeatboundsrangehigh.setValue(Double.parseDouble((s.getSpplyDlvryOccrnceTmgRptBndsRngHiVl())));
		}
		/******************** supplydeliveryoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplydeliveryoccurrencetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		supplydeliveryoccurrencetimingrepeatboundsrange.setLow(supplydeliveryoccurrencetimingrepeatboundsrangelow);

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwCd() != null) {
			supplydeliveryoccurrencetimingrepeatboundsrangelow.setCode(s.getSpplyDlvryOccrnceTmgRptBndsRngLwCd());
		}
		/******************** supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplydeliveryoccurrencetimingrepeatboundsrangelow.setComparator(supplydeliveryoccurrencetimingrepeatboundsrangelowcomparator.fromCode(s.getSpplyDlvryOccrnceTmgRptBndsRngLwCmprtr()));

		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwSys() != null) {
			supplydeliveryoccurrencetimingrepeatboundsrangelow.setSystem(s.getSpplyDlvryOccrnceTmgRptBndsRngLwSys());
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwUnt() != null) {
			supplydeliveryoccurrencetimingrepeatboundsrangelow.setUnit(s.getSpplyDlvryOccrnceTmgRptBndsRngLwUnt());
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptBndsRngLwVl() != null) {
			supplydeliveryoccurrencetimingrepeatboundsrangelow.setValue(Double.parseDouble((s.getSpplyDlvryOccrnceTmgRptBndsRngLwVl())));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptCnt() != null) {
			supplydeliveryoccurrencetimingrepeat.setCount(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptCnt()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptCntMx() != null) {
			supplydeliveryoccurrencetimingrepeat.setCountMax(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptCntMx()));
		}
		/******************** supplydeliveryoccurrencetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory supplydeliveryoccurrencetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		supplydeliveryoccurrencetimingrepeat.addDayOfWeek(supplydeliveryoccurrencetimingrepeatdayofweek.fromCode(s.getSpplyDlvryOccrnceTmgRptDayOfWeek()));

		/******************** SpplyDlvry_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptDuration() != null) {
			supplydeliveryoccurrencetimingrepeat.setDuration(Double.parseDouble((s.getSpplyDlvryOccrnceTmgRptDuration())));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptDurationMx() != null) {
			supplydeliveryoccurrencetimingrepeat.setDurationMax(Double.parseDouble((s.getSpplyDlvryOccrnceTmgRptDurationMx())));
		}
		/******************** supplydeliveryoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory supplydeliveryoccurrencetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		supplydeliveryoccurrencetimingrepeat.setDurationUnit(supplydeliveryoccurrencetimingrepeatdurationunit.fromCode(s.getSpplyDlvryOccrnceTmgRptDurationUnt()));

		/******************** SpplyDlvry_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptFrqncy() != null) {
			supplydeliveryoccurrencetimingrepeat.setFrequency(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptFrqncy()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptFrqncyMx() != null) {
			supplydeliveryoccurrencetimingrepeat.setFrequencyMax(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptFrqncyMx()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptOff() != null) {
			supplydeliveryoccurrencetimingrepeat.setOffset(Integer.parseInt(s.getSpplyDlvryOccrnceTmgRptOff()));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptPrd() != null) {
			supplydeliveryoccurrencetimingrepeat.setPeriod(Double.parseDouble((s.getSpplyDlvryOccrnceTmgRptPrd())));
		}
		/******************** SpplyDlvry_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptPrdMx() != null) {
			supplydeliveryoccurrencetimingrepeat.setPeriodMax(Double.parseDouble((s.getSpplyDlvryOccrnceTmgRptPrdMx())));
		}
		/******************** supplydeliveryoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory supplydeliveryoccurrencetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		supplydeliveryoccurrencetimingrepeat.setPeriodUnit(supplydeliveryoccurrencetimingrepeatperiodunit.fromCode(s.getSpplyDlvryOccrnceTmgRptPrdUnt()));

		/******************** SpplyDlvry_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(s.getSpplyDlvryOccrnceTmgRptTimeOfDay() != null) {
			supplydeliveryoccurrencetimingrepeat.addTimeOfDay(s.getSpplyDlvryOccrnceTmgRptTimeOfDay());
		}
		/******************** supplydeliveryoccurrencetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory supplydeliveryoccurrencetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		supplydeliveryoccurrencetimingrepeat.addWhen(supplydeliveryoccurrencetimingrepeatwhen.fromCode(s.getSpplyDlvryOccrnceTmgRptWhen()));

		/******************** SpplyDlvry_PartOf ********************************************************************************/
		if(s.getSpplyDlvryPartOf() != null) {
			supplydelivery.addPartOf( new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvryPartOf()));
		}
		/******************** SpplyDlvry_Pnt ********************************************************************************/
		if(s.getSpplyDlvryPnt() != null) {
			supplydelivery.setPatient( new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvryPnt()));
		}
		/******************** SpplyDlvry_Receiver ********************************************************************************/
		if(s.getSpplyDlvryReceiver() != null) {
			supplydelivery.addReceiver( new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvryReceiver()));
		}
		/******************** supplydeliverystatus ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliveryStatusEnumFactory supplydeliverystatus =  new org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliveryStatusEnumFactory();
		supplydelivery.setStatus(supplydeliverystatus.fromCode(s.getSpplyDlvrySts()));

		/******************** supplydeliverysupplieditem ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliverySuppliedItemComponent supplydeliverysupplieditem =  new org.hl7.fhir.r4.model.SupplyDelivery.SupplyDeliverySuppliedItemComponent();
		supplydelivery.setSuppliedItem(supplydeliverysupplieditem);

		/******************** supplydeliverysupplieditemitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliverysupplieditemitemcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplydeliverysupplieditem.setItem(supplydeliverysupplieditemitemcodeableconcept);

		/******************** supplydeliverysupplieditemitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplydeliverysupplieditemitemcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		supplydeliverysupplieditemitemcodeableconcept.addCoding(supplydeliverysupplieditemitemcodeableconceptcoding);

		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgCd() != null) {
			supplydeliverysupplieditemitemcodeableconceptcoding.setCode(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgCd());
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgDsply() != null) {
			supplydeliverysupplieditemitemcodeableconceptcoding.setDisplay(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgDsply());
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgSys() != null) {
			supplydeliverysupplieditemitemcodeableconceptcoding.setSystem(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgSys());
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgUsrSltd() != null) {
			supplydeliverysupplieditemitemcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgUsrSltd()));
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgVrsn() != null) {
			supplydeliverysupplieditemitemcodeableconceptcoding.setVersion(s.getSpplyDlvrySuppliedItmItmCdbleCncptCdgVrsn());
		}
		/******************** SpplyDlvry_SuppliedItm_ItmCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmCdbleCncptTxt() != null) {
			supplydeliverysupplieditemitemcodeableconcept.setText(s.getSpplyDlvrySuppliedItmItmCdbleCncptTxt());
		}
		/******************** SpplyDlvry_SuppliedItm_ItmRfrnc ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmItmRfrnc() != null) {
			supplydeliverysupplieditem.setItem( new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvrySuppliedItmItmRfrnc()));
		}
		/******************** supplydeliverysupplieditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplydeliverysupplieditemquantity =  new org.hl7.fhir.r4.model.Quantity();
		supplydeliverysupplieditem.setQuantity(supplydeliverysupplieditemquantity);

		/******************** SpplyDlvry_SuppliedItm_Qnty_Cd ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmQntyCd() != null) {
			supplydeliverysupplieditemquantity.setCode(s.getSpplyDlvrySuppliedItmQntyCd());
		}
		/******************** supplydeliverysupplieditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplydeliverysupplieditemquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplydeliverysupplieditemquantity.setComparator(supplydeliverysupplieditemquantitycomparator.fromCode(s.getSpplyDlvrySuppliedItmQntyCmprtr()));

		/******************** SpplyDlvry_SuppliedItm_Qnty_Sys ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmQntySys() != null) {
			supplydeliverysupplieditemquantity.setSystem(s.getSpplyDlvrySuppliedItmQntySys());
		}
		/******************** SpplyDlvry_SuppliedItm_Qnty_Unt ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmQntyUnt() != null) {
			supplydeliverysupplieditemquantity.setUnit(s.getSpplyDlvrySuppliedItmQntyUnt());
		}
		/******************** SpplyDlvry_SuppliedItm_Qnty_Vl ********************************************************************************/
		if(s.getSpplyDlvrySuppliedItmQntyVl() != null) {
			supplydeliverysupplieditemquantity.setValue(Double.parseDouble((s.getSpplyDlvrySuppliedItmQntyVl())));
		}
		/******************** SpplyDlvry_Supplier ********************************************************************************/
		if(s.getSpplyDlvrySupplier() != null) {
			supplydelivery.setSupplier( new org.hl7.fhir.r4.model.Reference(s.getSpplyDlvrySupplier()));
		}
		/******************** supplydeliverytype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplydeliverytype =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplydelivery.setType(supplydeliverytype);

		/******************** supplydeliverytypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplydeliverytypecoding =  new org.hl7.fhir.r4.model.Coding();
		supplydeliverytype.addCoding(supplydeliverytypecoding);

		/******************** SpplyDlvry_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpplyDlvryTypCdgCd() != null) {
			supplydeliverytypecoding.setCode(s.getSpplyDlvryTypCdgCd());
		}
		/******************** SpplyDlvry_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyDlvryTypCdgDsply() != null) {
			supplydeliverytypecoding.setDisplay(s.getSpplyDlvryTypCdgDsply());
		}
		/******************** SpplyDlvry_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpplyDlvryTypCdgSys() != null) {
			supplydeliverytypecoding.setSystem(s.getSpplyDlvryTypCdgSys());
		}
		/******************** SpplyDlvry_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyDlvryTypCdgUsrSltd() != null) {
			supplydeliverytypecoding.setUserSelected(Boolean.parseBoolean(s.getSpplyDlvryTypCdgUsrSltd()));
		}
		/******************** SpplyDlvry_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyDlvryTypCdgVrsn() != null) {
			supplydeliverytypecoding.setVersion(s.getSpplyDlvryTypCdgVrsn());
		}
		/******************** SpplyDlvry_Typ_Txt ********************************************************************************/
		if(s.getSpplyDlvryTypTxt() != null) {
			supplydeliverytype.setText(s.getSpplyDlvryTypTxt());
		}
		return supplydelivery;
	}
}
