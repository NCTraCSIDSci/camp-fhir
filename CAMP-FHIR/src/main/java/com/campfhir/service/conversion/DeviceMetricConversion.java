package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceMetric;
public class DeviceMetricConversion 
{
	public org.hl7.fhir.r4.model.DeviceMetric DeviceMetrics(DeviceMetric d) throws ParseException
	{
		org.hl7.fhir.r4.model.DeviceMetric devicemetric = new org.hl7.fhir.r4.model.DeviceMetric();

		/******************** id ********************************************************************************/
		devicemetric.setId(d.getId());

		/******************** devicemetriccalibration ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationComponent devicemetriccalibration =  new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationComponent();
		devicemetric.addCalibration(devicemetriccalibration);

		/******************** devicemetriccalibrationstate ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationStateEnumFactory devicemetriccalibrationstate =  new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationStateEnumFactory();
		devicemetriccalibration.setState(devicemetriccalibrationstate.fromCode(d.getDvcMetricCalibrationState()));

		/******************** DvcMetric_Calibration_Time ********************************************************************************/
		if(d.getDvcMetricCalibrationTime() != null) {
			java.text.SimpleDateFormat DvcMetric_Calibration_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcMetric_Calibration_Timedate = DvcMetric_Calibration_Timesdf.parse(d.getDvcMetricCalibrationTime());
			devicemetriccalibration.setTime(DvcMetric_Calibration_Timedate);
		}
		/******************** devicemetriccalibrationtype ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationTypeEnumFactory devicemetriccalibrationtype =  new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationTypeEnumFactory();
		devicemetriccalibration.setType(devicemetriccalibrationtype.fromCode(d.getDvcMetricCalibrationTyp()));

		/******************** devicemetriccategory ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCategoryEnumFactory devicemetriccategory =  new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCategoryEnumFactory();
		devicemetric.setCategory(devicemetriccategory.fromCode(d.getDvcMetricCtgry()));

		/******************** devicemetriccolor ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricColorEnumFactory devicemetriccolor =  new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricColorEnumFactory();
		devicemetric.setColor(devicemetriccolor.fromCode(d.getDvcMetricColor()));

		/******************** devicemetricidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicemetricidentifier =  new org.hl7.fhir.r4.model.Identifier();
		devicemetric.addIdentifier(devicemetricidentifier);

		/******************** DvcMetric_Id_Assigner ********************************************************************************/
		if(d.getDvcMetricIdAssigner() != null) {
			devicemetricidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(d.getDvcMetricIdAssigner()));
		}
		/******************** devicemetricidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicemetricidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		devicemetricidentifier.setPeriod(devicemetricidentifierperiod);

		/******************** DvcMetric_Id_Prd_End ********************************************************************************/
		if(d.getDvcMetricIdPrdEnd() != null) {
			java.text.SimpleDateFormat DvcMetric_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcMetric_Id_Prd_Enddate = DvcMetric_Id_Prd_Endsdf.parse(d.getDvcMetricIdPrdEnd());
			devicemetricidentifierperiod.setEnd(DvcMetric_Id_Prd_Enddate);
		}
		/******************** DvcMetric_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcMetricIdPrdStrt() != null) {
			java.text.SimpleDateFormat DvcMetric_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcMetric_Id_Prd_Strtdate = DvcMetric_Id_Prd_Strtsdf.parse(d.getDvcMetricIdPrdStrt());
			devicemetricidentifierperiod.setStart(DvcMetric_Id_Prd_Strtdate);
		}
		/******************** DvcMetric_Id_Sys ********************************************************************************/
		if(d.getDvcMetricIdSys() != null) {
			devicemetricidentifier.setSystem(d.getDvcMetricIdSys());
		}
		/******************** devicemetricidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetricidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicemetricidentifier.setType(devicemetricidentifiertype);

		/******************** devicemetricidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicemetricidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicemetricidentifiertype.addCoding(devicemetricidentifiertypecoding);

		/******************** DvcMetric_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcMetricIdTypCdgCd() != null) {
			devicemetricidentifiertypecoding.setCode(d.getDvcMetricIdTypCdgCd());
		}
		/******************** DvcMetric_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcMetricIdTypCdgDsply() != null) {
			devicemetricidentifiertypecoding.setDisplay(d.getDvcMetricIdTypCdgDsply());
		}
		/******************** DvcMetric_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcMetricIdTypCdgSys() != null) {
			devicemetricidentifiertypecoding.setSystem(d.getDvcMetricIdTypCdgSys());
		}
		/******************** DvcMetric_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcMetricIdTypCdgUsrSltd() != null) {
			devicemetricidentifiertypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcMetricIdTypCdgUsrSltd()));
		}
		/******************** DvcMetric_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcMetricIdTypCdgVrsn() != null) {
			devicemetricidentifiertypecoding.setVersion(d.getDvcMetricIdTypCdgVrsn());
		}
		/******************** DvcMetric_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcMetricIdTypTxt() != null) {
			devicemetricidentifiertype.setText(d.getDvcMetricIdTypTxt());
		}
		/******************** devicemetricidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory devicemetricidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		devicemetricidentifier.setUse(devicemetricidentifieruse.fromCode(d.getDvcMetricIdUse()));

		/******************** DvcMetric_Id_Vl ********************************************************************************/
		if(d.getDvcMetricIdVl() != null) {
			devicemetricidentifier.setValue(d.getDvcMetricIdVl());
		}
		/******************** devicemetricmeasurementperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Timing devicemetricmeasurementperiod =  new org.hl7.fhir.r4.model.Timing();
		devicemetric.setMeasurementPeriod(devicemetricmeasurementperiod);

		/******************** devicemetricmeasurementperiodcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetricmeasurementperiodcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicemetricmeasurementperiod.setCode(devicemetricmeasurementperiodcode);

		/******************** devicemetricmeasurementperiodcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicemetricmeasurementperiodcodecoding =  new org.hl7.fhir.r4.model.Coding();
		devicemetricmeasurementperiodcode.addCoding(devicemetricmeasurementperiodcodecoding);

		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgCd() != null) {
			devicemetricmeasurementperiodcodecoding.setCode(d.getDvcMetricMsrmentPrdCdCdgCd());
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgDsply() != null) {
			devicemetricmeasurementperiodcodecoding.setDisplay(d.getDvcMetricMsrmentPrdCdCdgDsply());
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgSys() != null) {
			devicemetricmeasurementperiodcodecoding.setSystem(d.getDvcMetricMsrmentPrdCdCdgSys());
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgUsrSltd() != null) {
			devicemetricmeasurementperiodcodecoding.setUserSelected(Boolean.parseBoolean(d.getDvcMetricMsrmentPrdCdCdgUsrSltd()));
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgVrsn() != null) {
			devicemetricmeasurementperiodcodecoding.setVersion(d.getDvcMetricMsrmentPrdCdCdgVrsn());
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Txt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdTxt() != null) {
			devicemetricmeasurementperiodcode.setText(d.getDvcMetricMsrmentPrdCdTxt());
		}
		/******************** DvcMetric_MsrmentPrd_Evnt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdEvnt() != null) {
			java.text.SimpleDateFormat DvcMetric_MsrmentPrd_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcMetric_MsrmentPrd_Evntdate = DvcMetric_MsrmentPrd_Evntsdf.parse(d.getDvcMetricMsrmentPrdEvnt());
			devicemetricmeasurementperiod.addEvent(DvcMetric_MsrmentPrd_Evntdate);
		}
		/******************** devicemetricmeasurementperiodrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent devicemetricmeasurementperiodrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		devicemetricmeasurementperiod.setRepeat(devicemetricmeasurementperiodrepeat);

		/******************** devicemetricmeasurementperiodrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration devicemetricmeasurementperiodrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		devicemetricmeasurementperiodrepeat.setBounds(devicemetricmeasurementperiodrepeatboundsduration);

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Cd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsDurationCd() != null) {
			devicemetricmeasurementperiodrepeatboundsduration.setCode(d.getDvcMetricMsrmentPrdRptBndsDurationCd());
		}
		/******************** devicemetricmeasurementperiodrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicemetricmeasurementperiodrepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicemetricmeasurementperiodrepeatboundsduration.setComparator(devicemetricmeasurementperiodrepeatboundsdurationcomparator.fromCode(d.getDvcMetricMsrmentPrdRptBndsDurationCmprtr()));

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Sys ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsDurationSys() != null) {
			devicemetricmeasurementperiodrepeatboundsduration.setSystem(d.getDvcMetricMsrmentPrdRptBndsDurationSys());
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Unt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsDurationUnt() != null) {
			devicemetricmeasurementperiodrepeatboundsduration.setUnit(d.getDvcMetricMsrmentPrdRptBndsDurationUnt());
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Vl ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsDurationVl() != null) {
			devicemetricmeasurementperiodrepeatboundsduration.setValue(Double.parseDouble((d.getDvcMetricMsrmentPrdRptBndsDurationVl())));
		}
		/******************** devicemetricmeasurementperiodrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicemetricmeasurementperiodrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		devicemetricmeasurementperiodrepeat.setBounds(devicemetricmeasurementperiodrepeatboundsperiod);

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsPrd_End ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat DvcMetric_MsrmentPrd_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcMetric_MsrmentPrd_Rpt_BndsPrd_Enddate = DvcMetric_MsrmentPrd_Rpt_BndsPrd_Endsdf.parse(d.getDvcMetricMsrmentPrdRptBndsPrdEnd());
			devicemetricmeasurementperiodrepeatboundsperiod.setEnd(DvcMetric_MsrmentPrd_Rpt_BndsPrd_Enddate);
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsPrd_Strt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat DvcMetric_MsrmentPrd_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date DvcMetric_MsrmentPrd_Rpt_BndsPrd_Strtdate = DvcMetric_MsrmentPrd_Rpt_BndsPrd_Strtsdf.parse(d.getDvcMetricMsrmentPrdRptBndsPrdStrt());
			devicemetricmeasurementperiodrepeatboundsperiod.setStart(DvcMetric_MsrmentPrd_Rpt_BndsPrd_Strtdate);
		}
		/******************** devicemetricmeasurementperiodrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range devicemetricmeasurementperiodrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		devicemetricmeasurementperiodrepeat.setBounds(devicemetricmeasurementperiodrepeatboundsrange);

		/******************** devicemetricmeasurementperiodrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicemetricmeasurementperiodrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		devicemetricmeasurementperiodrepeatboundsrange.setHigh(devicemetricmeasurementperiodrepeatboundsrangehigh);

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngHiCd() != null) {
			devicemetricmeasurementperiodrepeatboundsrangehigh.setCode(d.getDvcMetricMsrmentPrdRptBndsRngHiCd());
		}
		/******************** devicemetricmeasurementperiodrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicemetricmeasurementperiodrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicemetricmeasurementperiodrepeatboundsrangehigh.setComparator(devicemetricmeasurementperiodrepeatboundsrangehighcomparator.fromCode(d.getDvcMetricMsrmentPrdRptBndsRngHiCmprtr()));

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngHiSys() != null) {
			devicemetricmeasurementperiodrepeatboundsrangehigh.setSystem(d.getDvcMetricMsrmentPrdRptBndsRngHiSys());
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngHiUnt() != null) {
			devicemetricmeasurementperiodrepeatboundsrangehigh.setUnit(d.getDvcMetricMsrmentPrdRptBndsRngHiUnt());
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngHiVl() != null) {
			devicemetricmeasurementperiodrepeatboundsrangehigh.setValue(Double.parseDouble((d.getDvcMetricMsrmentPrdRptBndsRngHiVl())));
		}
		/******************** devicemetricmeasurementperiodrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicemetricmeasurementperiodrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		devicemetricmeasurementperiodrepeatboundsrange.setLow(devicemetricmeasurementperiodrepeatboundsrangelow);

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngLwCd() != null) {
			devicemetricmeasurementperiodrepeatboundsrangelow.setCode(d.getDvcMetricMsrmentPrdRptBndsRngLwCd());
		}
		/******************** devicemetricmeasurementperiodrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory devicemetricmeasurementperiodrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		devicemetricmeasurementperiodrepeatboundsrangelow.setComparator(devicemetricmeasurementperiodrepeatboundsrangelowcomparator.fromCode(d.getDvcMetricMsrmentPrdRptBndsRngLwCmprtr()));

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngLwSys() != null) {
			devicemetricmeasurementperiodrepeatboundsrangelow.setSystem(d.getDvcMetricMsrmentPrdRptBndsRngLwSys());
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngLwUnt() != null) {
			devicemetricmeasurementperiodrepeatboundsrangelow.setUnit(d.getDvcMetricMsrmentPrdRptBndsRngLwUnt());
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngLwVl() != null) {
			devicemetricmeasurementperiodrepeatboundsrangelow.setValue(Double.parseDouble((d.getDvcMetricMsrmentPrdRptBndsRngLwVl())));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Cnt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptCnt() != null) {
			devicemetricmeasurementperiodrepeat.setCount(Integer.parseInt(d.getDvcMetricMsrmentPrdRptCnt()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_CntMx ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptCntMx() != null) {
			devicemetricmeasurementperiodrepeat.setCountMax(Integer.parseInt(d.getDvcMetricMsrmentPrdRptCntMx()));
		}
		/******************** devicemetricmeasurementperiodrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory devicemetricmeasurementperiodrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		devicemetricmeasurementperiodrepeat.addDayOfWeek(devicemetricmeasurementperiodrepeatdayofweek.fromCode(d.getDvcMetricMsrmentPrdRptDayOfWeek()));

		/******************** DvcMetric_MsrmentPrd_Rpt_Duration ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptDuration() != null) {
			devicemetricmeasurementperiodrepeat.setDuration(Double.parseDouble((d.getDvcMetricMsrmentPrdRptDuration())));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_DurationMx ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptDurationMx() != null) {
			devicemetricmeasurementperiodrepeat.setDurationMax(Double.parseDouble((d.getDvcMetricMsrmentPrdRptDurationMx())));
		}
		/******************** devicemetricmeasurementperiodrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory devicemetricmeasurementperiodrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		devicemetricmeasurementperiodrepeat.setDurationUnit(devicemetricmeasurementperiodrepeatdurationunit.fromCode(d.getDvcMetricMsrmentPrdRptDurationUnt()));

		/******************** DvcMetric_MsrmentPrd_Rpt_Frqncy ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptFrqncy() != null) {
			devicemetricmeasurementperiodrepeat.setFrequency(Integer.parseInt(d.getDvcMetricMsrmentPrdRptFrqncy()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_FrqncyMx ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptFrqncyMx() != null) {
			devicemetricmeasurementperiodrepeat.setFrequencyMax(Integer.parseInt(d.getDvcMetricMsrmentPrdRptFrqncyMx()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Off ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptOff() != null) {
			devicemetricmeasurementperiodrepeat.setOffset(Integer.parseInt(d.getDvcMetricMsrmentPrdRptOff()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Prd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptPrd() != null) {
			devicemetricmeasurementperiodrepeat.setPeriod(Double.parseDouble((d.getDvcMetricMsrmentPrdRptPrd())));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_PrdMx ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptPrdMx() != null) {
			devicemetricmeasurementperiodrepeat.setPeriodMax(new java.math.BigDecimal((d.getDvcMetricMsrmentPrdRptPrdMx())));
		}
		/******************** devicemetricmeasurementperiodrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory devicemetricmeasurementperiodrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		devicemetricmeasurementperiodrepeat.setPeriodUnit(devicemetricmeasurementperiodrepeatperiodunit.fromCode(d.getDvcMetricMsrmentPrdRptPrdUnt()));

		/******************** DvcMetric_MsrmentPrd_Rpt_TimeOfDay ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptTimeOfDay() != null) {
			devicemetricmeasurementperiodrepeat.addTimeOfDay(d.getDvcMetricMsrmentPrdRptTimeOfDay());
		}
		/******************** devicemetricmeasurementperiodrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory devicemetricmeasurementperiodrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		devicemetricmeasurementperiodrepeat.addWhen(devicemetricmeasurementperiodrepeatwhen.fromCode(d.getDvcMetricMsrmentPrdRptWhen()));

		/******************** devicemetricoperationalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricOperationalStatusEnumFactory devicemetricoperationalstatus =  new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricOperationalStatusEnumFactory();
		devicemetric.setOperationalStatus(devicemetricoperationalstatus.fromCode(d.getDvcMetricOprtnalSts()));

		/******************** DvcMetric_Parent ********************************************************************************/
		if(d.getDvcMetricParent() != null) {
			devicemetric.setParent( new org.hl7.fhir.r4.model.Reference(d.getDvcMetricParent()));
		}
		/******************** DvcMetric_Src ********************************************************************************/
		if(d.getDvcMetricSrc() != null) {
			devicemetric.setSource( new org.hl7.fhir.r4.model.Reference(d.getDvcMetricSrc()));
		}
		/******************** devicemetrictype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetrictype =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicemetric.setType(devicemetrictype);

		/******************** devicemetrictypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicemetrictypecoding =  new org.hl7.fhir.r4.model.Coding();
		devicemetrictype.addCoding(devicemetrictypecoding);

		/******************** DvcMetric_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcMetricTypCdgCd() != null) {
			devicemetrictypecoding.setCode(d.getDvcMetricTypCdgCd());
		}
		/******************** DvcMetric_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcMetricTypCdgDsply() != null) {
			devicemetrictypecoding.setDisplay(d.getDvcMetricTypCdgDsply());
		}
		/******************** DvcMetric_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcMetricTypCdgSys() != null) {
			devicemetrictypecoding.setSystem(d.getDvcMetricTypCdgSys());
		}
		/******************** DvcMetric_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcMetricTypCdgUsrSltd() != null) {
			devicemetrictypecoding.setUserSelected(Boolean.parseBoolean(d.getDvcMetricTypCdgUsrSltd()));
		}
		/******************** DvcMetric_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcMetricTypCdgVrsn() != null) {
			devicemetrictypecoding.setVersion(d.getDvcMetricTypCdgVrsn());
		}
		/******************** DvcMetric_Typ_Txt ********************************************************************************/
		if(d.getDvcMetricTypTxt() != null) {
			devicemetrictype.setText(d.getDvcMetricTypTxt());
		}
		/******************** devicemetricunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetricunit =  new org.hl7.fhir.r4.model.CodeableConcept();
		devicemetric.setUnit(devicemetricunit);

		/******************** devicemetricunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicemetricunitcoding =  new org.hl7.fhir.r4.model.Coding();
		devicemetricunit.addCoding(devicemetricunitcoding);

		/******************** DvcMetric_Unt_Cdg_Cd ********************************************************************************/
		if(d.getDvcMetricUntCdgCd() != null) {
			devicemetricunitcoding.setCode(d.getDvcMetricUntCdgCd());
		}
		/******************** DvcMetric_Unt_Cdg_Dsply ********************************************************************************/
		if(d.getDvcMetricUntCdgDsply() != null) {
			devicemetricunitcoding.setDisplay(d.getDvcMetricUntCdgDsply());
		}
		/******************** DvcMetric_Unt_Cdg_Sys ********************************************************************************/
		if(d.getDvcMetricUntCdgSys() != null) {
			devicemetricunitcoding.setSystem(d.getDvcMetricUntCdgSys());
		}
		/******************** DvcMetric_Unt_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcMetricUntCdgUsrSltd() != null) {
			devicemetricunitcoding.setUserSelected(Boolean.parseBoolean(d.getDvcMetricUntCdgUsrSltd()));
		}
		/******************** DvcMetric_Unt_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcMetricUntCdgVrsn() != null) {
			devicemetricunitcoding.setVersion(d.getDvcMetricUntCdgVrsn());
		}
		/******************** DvcMetric_Unt_Txt ********************************************************************************/
		if(d.getDvcMetricUntTxt() != null) {
			devicemetricunit.setText(d.getDvcMetricUntTxt());
		}
		return devicemetric;
	}
}
