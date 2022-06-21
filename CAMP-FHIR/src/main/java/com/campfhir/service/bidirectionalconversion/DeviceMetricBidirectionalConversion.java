package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceMetric;
public class DeviceMetricBidirectionalConversion 
{
	public DeviceMetric DeviceMetrics(org.hl7.fhir.r4.model.DeviceMetric devicemetric) throws ParseException
	{
		 main.java.com.campfhir.model.DeviceMetric d = new  main.java.com.campfhir.model.DeviceMetric();

		/******************** id ********************************************************************************/
		devicemetric.setId(d.getId());

		/******************** DvcMetric_Parent ********************************************************************************/
		if(devicemetric.hasParent()) {
			d.setDvcMetricParent(String.valueOf(devicemetric.getParent()));
		}
		/******************** devicemetrictype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetrictype = devicemetric.getType();

		/******************** devicemetrictypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicemetrictypecoding = devicemetrictype.getCodingFirstRep();

		/******************** DvcMetric_Typ_Cdg_Dsply ********************************************************************************/
		if(devicemetrictypecoding.hasDisplay()) {
			d.setDvcMetricTypCdgDsply(String.valueOf(devicemetrictypecoding.getDisplay()));
		}
		/******************** DvcMetric_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicemetrictypecoding.hasVersion()) {
			d.setDvcMetricTypCdgVrsn(String.valueOf(devicemetrictypecoding.getVersion()));
		}
		/******************** DvcMetric_Typ_Cdg_Cd ********************************************************************************/
		if(devicemetrictypecoding.hasCode()) {
			d.setDvcMetricTypCdgCd(String.valueOf(devicemetrictypecoding.getCode()));
		}
		/******************** DvcMetric_Typ_Cdg_Sys ********************************************************************************/
		if(devicemetrictypecoding.hasSystem()) {
			d.setDvcMetricTypCdgSys(String.valueOf(devicemetrictypecoding.getSystem()));
		}
		/******************** DvcMetric_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicemetrictypecoding.hasUserSelected()) {
			d.setDvcMetricTypCdgUsrSltd(String.valueOf(devicemetrictypecoding.getUserSelected()));
		}
		/******************** DvcMetric_Typ_Txt ********************************************************************************/
		if(devicemetrictype.hasText()) {
			d.setDvcMetricTypTxt(String.valueOf(devicemetrictype.getText()));
		}
		/******************** DvcMetric_Src ********************************************************************************/
		if(devicemetric.hasSource()) {
			d.setDvcMetricSrc(String.valueOf(devicemetric.getSource()));
		}
		/******************** devicemetricoperationalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricOperationalStatus devicemetricoperationalstatus = devicemetric.getOperationalStatus();
		d.setDvcMetricOprtnalSts(devicemetricoperationalstatus.toCode());

		/******************** devicemetricmeasurementperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Timing devicemetricmeasurementperiod = devicemetric.getMeasurementPeriod();

		/******************** devicemetricmeasurementperiodcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetricmeasurementperiodcode = devicemetricmeasurementperiod.getCode();

		/******************** devicemetricmeasurementperiodcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicemetricmeasurementperiodcodecoding = devicemetricmeasurementperiodcode.getCodingFirstRep();

		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Dsply ********************************************************************************/
		if(devicemetricmeasurementperiodcodecoding.hasDisplay()) {
			d.setDvcMetricMsrmentPrdCdCdgDsply(String.valueOf(devicemetricmeasurementperiodcodecoding.getDisplay()));
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Vrsn ********************************************************************************/
		if(devicemetricmeasurementperiodcodecoding.hasVersion()) {
			d.setDvcMetricMsrmentPrdCdCdgVrsn(String.valueOf(devicemetricmeasurementperiodcodecoding.getVersion()));
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Cd ********************************************************************************/
		if(devicemetricmeasurementperiodcodecoding.hasCode()) {
			d.setDvcMetricMsrmentPrdCdCdgCd(String.valueOf(devicemetricmeasurementperiodcodecoding.getCode()));
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Sys ********************************************************************************/
		if(devicemetricmeasurementperiodcodecoding.hasSystem()) {
			d.setDvcMetricMsrmentPrdCdCdgSys(String.valueOf(devicemetricmeasurementperiodcodecoding.getSystem()));
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_UsrSltd ********************************************************************************/
		if(devicemetricmeasurementperiodcodecoding.hasUserSelected()) {
			d.setDvcMetricMsrmentPrdCdCdgUsrSltd(String.valueOf(devicemetricmeasurementperiodcodecoding.getUserSelected()));
		}
		/******************** DvcMetric_MsrmentPrd_Cd_Txt ********************************************************************************/
		if(devicemetricmeasurementperiodcode.hasText()) {
			d.setDvcMetricMsrmentPrdCdTxt(String.valueOf(devicemetricmeasurementperiodcode.getText()));
		}
		/******************** devicemetricmeasurementperiodrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent devicemetricmeasurementperiodrepeat = devicemetricmeasurementperiod.getRepeat();

		/******************** DvcMetric_MsrmentPrd_Rpt_Off ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasOffset()) {
			d.setDvcMetricMsrmentPrdRptOff(String.valueOf(devicemetricmeasurementperiodrepeat.getOffset()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Cnt ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasCount()) {
			d.setDvcMetricMsrmentPrdRptCnt(String.valueOf(devicemetricmeasurementperiodrepeat.getCount()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Frqncy ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasFrequency()) {
			d.setDvcMetricMsrmentPrdRptFrqncy(String.valueOf(devicemetricmeasurementperiodrepeat.getFrequency()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Prd ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasPeriod()) {
			d.setDvcMetricMsrmentPrdRptPrd(String.valueOf(devicemetricmeasurementperiodrepeat.getPeriod()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Duration ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasDuration()) {
			d.setDvcMetricMsrmentPrdRptDuration(String.valueOf(devicemetricmeasurementperiodrepeat.getDuration()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_CntMx ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasCountMax()) {
			d.setDvcMetricMsrmentPrdRptCntMx(String.valueOf(devicemetricmeasurementperiodrepeat.getCountMax()));
		}
		/******************** devicemetricmeasurementperiodrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration devicemetricmeasurementperiodrepeatboundsduration = devicemetricmeasurementperiodrepeat.getBoundsDuration();

		/******************** devicemetricmeasurementperiodrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicemetricmeasurementperiodrepeatboundsperiod = devicemetricmeasurementperiodrepeat.getBoundsPeriod();

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsPrd_End ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsperiod.hasEnd()) {
			d.setDvcMetricMsrmentPrdRptBndsPrdEnd(String.valueOf(devicemetricmeasurementperiodrepeatboundsperiod.getEnd()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsPrd_Strt ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsperiod.hasStart()) {
			d.setDvcMetricMsrmentPrdRptBndsPrdStrt(String.valueOf(devicemetricmeasurementperiodrepeatboundsperiod.getStart()));
		}
		/******************** devicemetricmeasurementperiodrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range devicemetricmeasurementperiodrepeatboundsrange = devicemetricmeasurementperiodrepeat.getBoundsRange();

		/******************** devicemetricmeasurementperiodrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicemetricmeasurementperiodrepeatboundsrangelow = devicemetricmeasurementperiodrepeatboundsrange.getLow();

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangelow.hasValue()) {
			d.setDvcMetricMsrmentPrdRptBndsRngLwVl(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangelow.getValue()));
		}
		/******************** devicemetricmeasurementperiodrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicemetricmeasurementperiodrepeatboundsrangelowcomparator = devicemetricmeasurementperiodrepeatboundsrangelow.getComparator();
		d.setDvcMetricMsrmentPrdRptBndsRngLwCmprtr(devicemetricmeasurementperiodrepeatboundsrangelowcomparator.toCode());

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangelow.hasCode()) {
			d.setDvcMetricMsrmentPrdRptBndsRngLwCd(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangelow.getCode()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangelow.hasSystem()) {
			d.setDvcMetricMsrmentPrdRptBndsRngLwSys(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangelow.getSystem()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangelow.hasUnit()) {
			d.setDvcMetricMsrmentPrdRptBndsRngLwUnt(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangelow.getUnit()));
		}
		/******************** devicemetricmeasurementperiodrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicemetricmeasurementperiodrepeatboundsrangehigh = devicemetricmeasurementperiodrepeatboundsrange.getHigh();

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangehigh.hasValue()) {
			d.setDvcMetricMsrmentPrdRptBndsRngHiVl(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangehigh.getValue()));
		}
		/******************** devicemetricmeasurementperiodrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicemetricmeasurementperiodrepeatboundsrangehighcomparator = devicemetricmeasurementperiodrepeatboundsrangehigh.getComparator();
		d.setDvcMetricMsrmentPrdRptBndsRngHiCmprtr(devicemetricmeasurementperiodrepeatboundsrangehighcomparator.toCode());

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangehigh.hasCode()) {
			d.setDvcMetricMsrmentPrdRptBndsRngHiCd(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangehigh.getCode()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangehigh.hasSystem()) {
			d.setDvcMetricMsrmentPrdRptBndsRngHiSys(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangehigh.getSystem()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangehigh.hasUnit()) {
			d.setDvcMetricMsrmentPrdRptBndsRngHiUnt(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangehigh.getUnit()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_PrdMx ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasPeriodMax()) {
			d.setDvcMetricMsrmentPrdRptPrdMx(String.valueOf(devicemetricmeasurementperiodrepeat.getPeriodMax()));
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_FrqncyMx ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasFrequencyMax()) {
			d.setDvcMetricMsrmentPrdRptFrqncyMx(String.valueOf(devicemetricmeasurementperiodrepeat.getFrequencyMax()));
		}
		/******************** devicemetricmeasurementperiodrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime devicemetricmeasurementperiodrepeatperiodunit = devicemetricmeasurementperiodrepeat.getPeriodUnit();
		d.setDvcMetricMsrmentPrdRptPrdUnt(devicemetricmeasurementperiodrepeatperiodunit.toCode());

		/******************** DvcMetric_MsrmentPrd_Rpt_DurationMx ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasDurationMax()) {
			d.setDvcMetricMsrmentPrdRptDurationMx(String.valueOf(devicemetricmeasurementperiodrepeat.getDurationMax()));
		}
		/******************** devicemetricmeasurementperiodrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime devicemetricmeasurementperiodrepeatdurationunit = devicemetricmeasurementperiodrepeat.getDurationUnit();
		d.setDvcMetricMsrmentPrdRptDurationUnt(devicemetricmeasurementperiodrepeatdurationunit.toCode());

		/******************** devicemetriccalibration ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationComponent devicemetriccalibration = devicemetric.getCalibrationFirstRep();

		/******************** devicemetriccalibrationstate ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationState devicemetriccalibrationstate = devicemetriccalibration.getState();
		d.setDvcMetricCalibrationState(devicemetriccalibrationstate.toCode());

		/******************** devicemetriccalibrationtype ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationType devicemetriccalibrationtype = devicemetriccalibration.getType();
		d.setDvcMetricCalibrationTyp(devicemetriccalibrationtype.toCode());

		/******************** DvcMetric_Calibration_Time ********************************************************************************/
		if(devicemetriccalibration.hasTime()) {
			d.setDvcMetricCalibrationTime(String.valueOf(devicemetriccalibration.getTime()));
		}
		/******************** devicemetriccategory ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCategory devicemetriccategory = devicemetric.getCategory();
		d.setDvcMetricCtgry(devicemetriccategory.toCode());

		/******************** devicemetricunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetricunit = devicemetric.getUnit();

		/******************** devicemetricunitcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicemetricunitcoding = devicemetricunit.getCodingFirstRep();

		/******************** DvcMetric_Unt_Cdg_Dsply ********************************************************************************/
		if(devicemetricunitcoding.hasDisplay()) {
			d.setDvcMetricUntCdgDsply(String.valueOf(devicemetricunitcoding.getDisplay()));
		}
		/******************** DvcMetric_Unt_Cdg_Vrsn ********************************************************************************/
		if(devicemetricunitcoding.hasVersion()) {
			d.setDvcMetricUntCdgVrsn(String.valueOf(devicemetricunitcoding.getVersion()));
		}
		/******************** DvcMetric_Unt_Cdg_Cd ********************************************************************************/
		if(devicemetricunitcoding.hasCode()) {
			d.setDvcMetricUntCdgCd(String.valueOf(devicemetricunitcoding.getCode()));
		}
		/******************** DvcMetric_Unt_Cdg_Sys ********************************************************************************/
		if(devicemetricunitcoding.hasSystem()) {
			d.setDvcMetricUntCdgSys(String.valueOf(devicemetricunitcoding.getSystem()));
		}
		/******************** DvcMetric_Unt_Cdg_UsrSltd ********************************************************************************/
		if(devicemetricunitcoding.hasUserSelected()) {
			d.setDvcMetricUntCdgUsrSltd(String.valueOf(devicemetricunitcoding.getUserSelected()));
		}
		/******************** DvcMetric_Unt_Txt ********************************************************************************/
		if(devicemetricunit.hasText()) {
			d.setDvcMetricUntTxt(String.valueOf(devicemetricunit.getText()));
		}
		/******************** devicemetriccolor ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricColor devicemetriccolor = devicemetric.getColor();
		d.setDvcMetricColor(devicemetriccolor.toCode());

		/******************** devicemetricidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier devicemetricidentifier = devicemetric.getIdentifierFirstRep();

		/******************** DvcMetric_Id_Vl ********************************************************************************/
		if(devicemetricidentifier.hasValue()) {
			d.setDvcMetricIdVl(String.valueOf(devicemetricidentifier.getValue()));
		}
		/******************** devicemetricidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetricidentifiertype = devicemetricidentifier.getType();

		/******************** devicemetricidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding devicemetricidentifiertypecoding = devicemetricidentifiertype.getCodingFirstRep();

		/******************** DvcMetric_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(devicemetricidentifiertypecoding.hasDisplay()) {
			d.setDvcMetricIdTypCdgDsply(String.valueOf(devicemetricidentifiertypecoding.getDisplay()));
		}
		/******************** DvcMetric_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicemetricidentifiertypecoding.hasVersion()) {
			d.setDvcMetricIdTypCdgVrsn(String.valueOf(devicemetricidentifiertypecoding.getVersion()));
		}
		/******************** DvcMetric_Id_Typ_Cdg_Cd ********************************************************************************/
		if(devicemetricidentifiertypecoding.hasCode()) {
			d.setDvcMetricIdTypCdgCd(String.valueOf(devicemetricidentifiertypecoding.getCode()));
		}
		/******************** DvcMetric_Id_Typ_Cdg_Sys ********************************************************************************/
		if(devicemetricidentifiertypecoding.hasSystem()) {
			d.setDvcMetricIdTypCdgSys(String.valueOf(devicemetricidentifiertypecoding.getSystem()));
		}
		/******************** DvcMetric_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicemetricidentifiertypecoding.hasUserSelected()) {
			d.setDvcMetricIdTypCdgUsrSltd(String.valueOf(devicemetricidentifiertypecoding.getUserSelected()));
		}
		/******************** DvcMetric_Id_Typ_Txt ********************************************************************************/
		if(devicemetricidentifiertype.hasText()) {
			d.setDvcMetricIdTypTxt(String.valueOf(devicemetricidentifiertype.getText()));
		}
		/******************** DvcMetric_Id_Sys ********************************************************************************/
		if(devicemetricidentifier.hasSystem()) {
			d.setDvcMetricIdSys(String.valueOf(devicemetricidentifier.getSystem()));
		}
		/******************** DvcMetric_Id_Assigner ********************************************************************************/
		if(devicemetricidentifier.hasAssigner()) {
			d.setDvcMetricIdAssigner(String.valueOf(devicemetricidentifier.getAssigner()));
		}
		/******************** devicemetricidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicemetricidentifierperiod = devicemetricidentifier.getPeriod();

		/******************** DvcMetric_Id_Prd_End ********************************************************************************/
		if(devicemetricidentifierperiod.hasEnd()) {
			d.setDvcMetricIdPrdEnd(String.valueOf(devicemetricidentifierperiod.getEnd()));
		}
		/******************** DvcMetric_Id_Prd_Strt ********************************************************************************/
		if(devicemetricidentifierperiod.hasStart()) {
			d.setDvcMetricIdPrdStrt(String.valueOf(devicemetricidentifierperiod.getStart()));
		}
		/******************** devicemetricidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicemetricidentifieruse = devicemetricidentifier.getUse();
		d.setDvcMetricIdUse(devicemetricidentifieruse.toCode());

		return d;
	}
}
