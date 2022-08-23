package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.DeviceMetric;
public class DeviceMetricBidirectionalConversion 
{
	public DeviceMetric DeviceMetrics(org.hl7.fhir.r4.model.DeviceMetric devicemetric) throws ParseException
	{
		 main.java.com.campfhir.model.DeviceMetric d = new  main.java.com.campfhir.model.DeviceMetric();

		/******************** id ********************************************************************************/
		d.setId(devicemetric.getIdElement().getIdPart());

		/******************** DvcMetric_Parent ********************************************************************************/
		if(devicemetric.hasParent()) {

			if(devicemetric.getParent().getReference() != null) {
			d.addDvcMetricParent(devicemetric.getParent().getReference());
			}
		} else {
			d.addDvcMetricParent("NULL");
		}


		/******************** devicemetrictype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetrictype = devicemetric.getType();

		/******************** DvcMetric_Typ_Txt ********************************************************************************/
		if(devicemetrictype.hasText()) {

			d.addDvcMetricTypTxt(String.valueOf(devicemetrictype.getText()));
		} else {
			d.addDvcMetricTypTxt("NULL");
		}


		/******************** devicemetrictypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicemetrictypecodinglist = devicemetrictype.getCoding();
		for(int devicemetrictypecodingi = 0; devicemetrictypecodingi<devicemetrictypecodinglist.size();devicemetrictypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicemetrictypecoding = devicemetrictypecodinglist.get(devicemetrictypecodingi);

		/******************** DvcMetric_Typ_Cdg_Dsply ********************************************************************************/
		if(devicemetrictypecodingi == 0) {d.addDvcMetricTypCdgDsply("[");}
		if(devicemetrictypecoding.hasDisplay()) {

			d.addDvcMetricTypCdgDsply(String.valueOf(devicemetrictypecoding.getDisplay()));
		} else {
			d.addDvcMetricTypCdgDsply("NULL");
		}

		if(devicemetrictypecodingi == devicemetrictypecodinglist.size()-1) {d.addDvcMetricTypCdgDsply("]");}


		/******************** DvcMetric_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicemetrictypecodingi == 0) {d.addDvcMetricTypCdgVrsn("[");}
		if(devicemetrictypecoding.hasVersion()) {

			d.addDvcMetricTypCdgVrsn(String.valueOf(devicemetrictypecoding.getVersion()));
		} else {
			d.addDvcMetricTypCdgVrsn("NULL");
		}

		if(devicemetrictypecodingi == devicemetrictypecodinglist.size()-1) {d.addDvcMetricTypCdgVrsn("]");}


		/******************** DvcMetric_Typ_Cdg_Cd ********************************************************************************/
		if(devicemetrictypecodingi == 0) {d.addDvcMetricTypCdgCd("[");}
		if(devicemetrictypecoding.hasCode()) {

			d.addDvcMetricTypCdgCd(String.valueOf(devicemetrictypecoding.getCode()));
		} else {
			d.addDvcMetricTypCdgCd("NULL");
		}

		if(devicemetrictypecodingi == devicemetrictypecodinglist.size()-1) {d.addDvcMetricTypCdgCd("]");}


		/******************** DvcMetric_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicemetrictypecodingi == 0) {d.addDvcMetricTypCdgUsrSltd("[");}
		if(devicemetrictypecoding.hasUserSelected()) {

			d.addDvcMetricTypCdgUsrSltd(String.valueOf(devicemetrictypecoding.getUserSelected()));
		} else {
			d.addDvcMetricTypCdgUsrSltd("NULL");
		}

		if(devicemetrictypecodingi == devicemetrictypecodinglist.size()-1) {d.addDvcMetricTypCdgUsrSltd("]");}


		/******************** DvcMetric_Typ_Cdg_Sys ********************************************************************************/
		if(devicemetrictypecodingi == 0) {d.addDvcMetricTypCdgSys("[");}
		if(devicemetrictypecoding.hasSystem()) {

			d.addDvcMetricTypCdgSys(String.valueOf(devicemetrictypecoding.getSystem()));
		} else {
			d.addDvcMetricTypCdgSys("NULL");
		}

		if(devicemetrictypecodingi == devicemetrictypecodinglist.size()-1) {d.addDvcMetricTypCdgSys("]");}


		 };
		/******************** DvcMetric_Src ********************************************************************************/
		if(devicemetric.hasSource()) {

			if(devicemetric.getSource().getReference() != null) {
			d.addDvcMetricSrc(devicemetric.getSource().getReference());
			}
		} else {
			d.addDvcMetricSrc("NULL");
		}


		/******************** devicemetricidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> devicemetricidentifierlist = devicemetric.getIdentifier();
		for(int devicemetricidentifieri = 0; devicemetricidentifieri<devicemetricidentifierlist.size();devicemetricidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  devicemetricidentifier = devicemetricidentifierlist.get(devicemetricidentifieri);

		/******************** DvcMetric_Id_Vl ********************************************************************************/
		if(devicemetricidentifieri == 0) {d.addDvcMetricIdVl("[");}
		if(devicemetricidentifier.hasValue()) {

			d.addDvcMetricIdVl(String.valueOf(devicemetricidentifier.getValue()));
		} else {
			d.addDvcMetricIdVl("NULL");
		}

		if(devicemetricidentifieri == devicemetricidentifierlist.size()-1) {d.addDvcMetricIdVl("]");}


		/******************** devicemetricidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetricidentifiertype = devicemetricidentifier.getType();

		/******************** DvcMetric_Id_Typ_Txt ********************************************************************************/
		if(devicemetricidentifieri == 0) {d.addDvcMetricIdTypTxt("[");}
		if(devicemetricidentifiertype.hasText()) {

			d.addDvcMetricIdTypTxt(String.valueOf(devicemetricidentifiertype.getText()));
		} else {
			d.addDvcMetricIdTypTxt("NULL");
		}

		if(devicemetricidentifieri == devicemetricidentifierlist.size()-1) {d.addDvcMetricIdTypTxt("]");}


		/******************** devicemetricidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicemetricidentifiertypecodinglist = devicemetricidentifiertype.getCoding();
		for(int devicemetricidentifiertypecodingi = 0; devicemetricidentifiertypecodingi<devicemetricidentifiertypecodinglist.size();devicemetricidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicemetricidentifiertypecoding = devicemetricidentifiertypecodinglist.get(devicemetricidentifiertypecodingi);

		/******************** DvcMetric_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(devicemetricidentifiertypecodingi == 0) {d.addDvcMetricIdTypCdgDsply("[[");}
		if(devicemetricidentifiertypecoding.hasDisplay()) {

			d.addDvcMetricIdTypCdgDsply(String.valueOf(devicemetricidentifiertypecoding.getDisplay()));
		} else {
			d.addDvcMetricIdTypCdgDsply("NULL");
		}

		if(devicemetricidentifiertypecodingi == devicemetricidentifiertypecodinglist.size()-1) {d.addDvcMetricIdTypCdgDsply("]]");}


		/******************** DvcMetric_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(devicemetricidentifiertypecodingi == 0) {d.addDvcMetricIdTypCdgVrsn("[[");}
		if(devicemetricidentifiertypecoding.hasVersion()) {

			d.addDvcMetricIdTypCdgVrsn(String.valueOf(devicemetricidentifiertypecoding.getVersion()));
		} else {
			d.addDvcMetricIdTypCdgVrsn("NULL");
		}

		if(devicemetricidentifiertypecodingi == devicemetricidentifiertypecodinglist.size()-1) {d.addDvcMetricIdTypCdgVrsn("]]");}


		/******************** DvcMetric_Id_Typ_Cdg_Cd ********************************************************************************/
		if(devicemetricidentifiertypecodingi == 0) {d.addDvcMetricIdTypCdgCd("[[");}
		if(devicemetricidentifiertypecoding.hasCode()) {

			d.addDvcMetricIdTypCdgCd(String.valueOf(devicemetricidentifiertypecoding.getCode()));
		} else {
			d.addDvcMetricIdTypCdgCd("NULL");
		}

		if(devicemetricidentifiertypecodingi == devicemetricidentifiertypecodinglist.size()-1) {d.addDvcMetricIdTypCdgCd("]]");}


		/******************** DvcMetric_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(devicemetricidentifiertypecodingi == 0) {d.addDvcMetricIdTypCdgUsrSltd("[[");}
		if(devicemetricidentifiertypecoding.hasUserSelected()) {

			d.addDvcMetricIdTypCdgUsrSltd(String.valueOf(devicemetricidentifiertypecoding.getUserSelected()));
		} else {
			d.addDvcMetricIdTypCdgUsrSltd("NULL");
		}

		if(devicemetricidentifiertypecodingi == devicemetricidentifiertypecodinglist.size()-1) {d.addDvcMetricIdTypCdgUsrSltd("]]");}


		/******************** DvcMetric_Id_Typ_Cdg_Sys ********************************************************************************/
		if(devicemetricidentifiertypecodingi == 0) {d.addDvcMetricIdTypCdgSys("[[");}
		if(devicemetricidentifiertypecoding.hasSystem()) {

			d.addDvcMetricIdTypCdgSys(String.valueOf(devicemetricidentifiertypecoding.getSystem()));
		} else {
			d.addDvcMetricIdTypCdgSys("NULL");
		}

		if(devicemetricidentifiertypecodingi == devicemetricidentifiertypecodinglist.size()-1) {d.addDvcMetricIdTypCdgSys("]]");}


		 };
		/******************** devicemetricidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicemetricidentifierperiod = devicemetricidentifier.getPeriod();

		/******************** DvcMetric_Id_Prd_Strt ********************************************************************************/
		if(devicemetricidentifieri == 0) {d.addDvcMetricIdPrdStrt("[");}
		if(devicemetricidentifierperiod.hasStart()) {

			d.addDvcMetricIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicemetricidentifierperiod.getStart())+"\"");
		} else {
			d.addDvcMetricIdPrdStrt("NULL");
		}

		if(devicemetricidentifieri == devicemetricidentifierlist.size()-1) {d.addDvcMetricIdPrdStrt("]");}


		/******************** DvcMetric_Id_Prd_End ********************************************************************************/
		if(devicemetricidentifieri == 0) {d.addDvcMetricIdPrdEnd("[");}
		if(devicemetricidentifierperiod.hasEnd()) {

			d.addDvcMetricIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicemetricidentifierperiod.getEnd())+"\"");
		} else {
			d.addDvcMetricIdPrdEnd("NULL");
		}

		if(devicemetricidentifieri == devicemetricidentifierlist.size()-1) {d.addDvcMetricIdPrdEnd("]");}


		/******************** devicemetricidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse devicemetricidentifieruse = devicemetricidentifier.getUse();
		if(devicemetricidentifieruse!=null) {
		if(devicemetricidentifieri == 0) {

		d.addDvcMetricIdUse("[");		}
			d.addDvcMetricIdUse(devicemetricidentifieruse.toCode());
		if(devicemetricidentifieri == devicemetricidentifierlist.size()-1) {

		d.addDvcMetricIdUse("]");		}

		} else {
			d.addDvcMetricIdUse("NULL");
		}

		/******************** DvcMetric_Id_Assigner ********************************************************************************/
		if(devicemetricidentifieri == 0) {d.addDvcMetricIdAssigner("[");}
		if(devicemetricidentifier.hasAssigner()) {

			if(devicemetricidentifier.getAssigner().getReference() != null) {
			d.addDvcMetricIdAssigner(devicemetricidentifier.getAssigner().getReference());
			}
		} else {
			d.addDvcMetricIdAssigner("NULL");
		}

		if(devicemetricidentifieri == devicemetricidentifierlist.size()-1) {d.addDvcMetricIdAssigner("]");}


		/******************** DvcMetric_Id_Sys ********************************************************************************/
		if(devicemetricidentifieri == 0) {d.addDvcMetricIdSys("[");}
		if(devicemetricidentifier.hasSystem()) {

			d.addDvcMetricIdSys(String.valueOf(devicemetricidentifier.getSystem()));
		} else {
			d.addDvcMetricIdSys("NULL");
		}

		if(devicemetricidentifieri == devicemetricidentifierlist.size()-1) {d.addDvcMetricIdSys("]");}


		 };
		/******************** devicemetriccategory ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCategory devicemetriccategory = devicemetric.getCategory();
		if(devicemetriccategory!=null) {
			d.addDvcMetricCtgry(devicemetriccategory.toCode());
		} else {
			d.addDvcMetricCtgry("NULL");
		}

		/******************** devicemetricoperationalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricOperationalStatus devicemetricoperationalstatus = devicemetric.getOperationalStatus();
		if(devicemetricoperationalstatus!=null) {
			d.addDvcMetricOprtnalSts(devicemetricoperationalstatus.toCode());
		} else {
			d.addDvcMetricOprtnalSts("NULL");
		}

		/******************** devicemetricmeasurementperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Timing devicemetricmeasurementperiod = devicemetric.getMeasurementPeriod();

		/******************** devicemetricmeasurementperiodcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetricmeasurementperiodcode = devicemetricmeasurementperiod.getCode();

		/******************** DvcMetric_MsrmentPrd_Cd_Txt ********************************************************************************/
		if(devicemetricmeasurementperiodcode.hasText()) {

			d.addDvcMetricMsrmentPrdCdTxt(String.valueOf(devicemetricmeasurementperiodcode.getText()));
		} else {
			d.addDvcMetricMsrmentPrdCdTxt("NULL");
		}


		/******************** devicemetricmeasurementperiodcodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicemetricmeasurementperiodcodecodinglist = devicemetricmeasurementperiodcode.getCoding();
		for(int devicemetricmeasurementperiodcodecodingi = 0; devicemetricmeasurementperiodcodecodingi<devicemetricmeasurementperiodcodecodinglist.size();devicemetricmeasurementperiodcodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicemetricmeasurementperiodcodecoding = devicemetricmeasurementperiodcodecodinglist.get(devicemetricmeasurementperiodcodecodingi);

		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Dsply ********************************************************************************/
		if(devicemetricmeasurementperiodcodecodingi == 0) {d.addDvcMetricMsrmentPrdCdCdgDsply("[");}
		if(devicemetricmeasurementperiodcodecoding.hasDisplay()) {

			d.addDvcMetricMsrmentPrdCdCdgDsply(String.valueOf(devicemetricmeasurementperiodcodecoding.getDisplay()));
		} else {
			d.addDvcMetricMsrmentPrdCdCdgDsply("NULL");
		}

		if(devicemetricmeasurementperiodcodecodingi == devicemetricmeasurementperiodcodecodinglist.size()-1) {d.addDvcMetricMsrmentPrdCdCdgDsply("]");}


		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Vrsn ********************************************************************************/
		if(devicemetricmeasurementperiodcodecodingi == 0) {d.addDvcMetricMsrmentPrdCdCdgVrsn("[");}
		if(devicemetricmeasurementperiodcodecoding.hasVersion()) {

			d.addDvcMetricMsrmentPrdCdCdgVrsn(String.valueOf(devicemetricmeasurementperiodcodecoding.getVersion()));
		} else {
			d.addDvcMetricMsrmentPrdCdCdgVrsn("NULL");
		}

		if(devicemetricmeasurementperiodcodecodingi == devicemetricmeasurementperiodcodecodinglist.size()-1) {d.addDvcMetricMsrmentPrdCdCdgVrsn("]");}


		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Cd ********************************************************************************/
		if(devicemetricmeasurementperiodcodecodingi == 0) {d.addDvcMetricMsrmentPrdCdCdgCd("[");}
		if(devicemetricmeasurementperiodcodecoding.hasCode()) {

			d.addDvcMetricMsrmentPrdCdCdgCd(String.valueOf(devicemetricmeasurementperiodcodecoding.getCode()));
		} else {
			d.addDvcMetricMsrmentPrdCdCdgCd("NULL");
		}

		if(devicemetricmeasurementperiodcodecodingi == devicemetricmeasurementperiodcodecodinglist.size()-1) {d.addDvcMetricMsrmentPrdCdCdgCd("]");}


		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_UsrSltd ********************************************************************************/
		if(devicemetricmeasurementperiodcodecodingi == 0) {d.addDvcMetricMsrmentPrdCdCdgUsrSltd("[");}
		if(devicemetricmeasurementperiodcodecoding.hasUserSelected()) {

			d.addDvcMetricMsrmentPrdCdCdgUsrSltd(String.valueOf(devicemetricmeasurementperiodcodecoding.getUserSelected()));
		} else {
			d.addDvcMetricMsrmentPrdCdCdgUsrSltd("NULL");
		}

		if(devicemetricmeasurementperiodcodecodingi == devicemetricmeasurementperiodcodecodinglist.size()-1) {d.addDvcMetricMsrmentPrdCdCdgUsrSltd("]");}


		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Sys ********************************************************************************/
		if(devicemetricmeasurementperiodcodecodingi == 0) {d.addDvcMetricMsrmentPrdCdCdgSys("[");}
		if(devicemetricmeasurementperiodcodecoding.hasSystem()) {

			d.addDvcMetricMsrmentPrdCdCdgSys(String.valueOf(devicemetricmeasurementperiodcodecoding.getSystem()));
		} else {
			d.addDvcMetricMsrmentPrdCdCdgSys("NULL");
		}

		if(devicemetricmeasurementperiodcodecodingi == devicemetricmeasurementperiodcodecodinglist.size()-1) {d.addDvcMetricMsrmentPrdCdCdgSys("]");}


		 };
		/******************** DvcMetric_MsrmentPrd_Evnt ********************************************************************************/
		if(devicemetricmeasurementperiod.hasEvent()) {

			String  array = "[";
			for(int incr=0; incr<devicemetricmeasurementperiod.getEvent().size(); incr++) {
				array = array + devicemetricmeasurementperiod.getEvent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcMetricMsrmentPrdEvnt(array);

		} else {
			d.addDvcMetricMsrmentPrdEvnt("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent devicemetricmeasurementperiodrepeat = devicemetricmeasurementperiod.getRepeat();

		/******************** DvcMetric_MsrmentPrd_Rpt_Off ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasOffset()) {

			d.addDvcMetricMsrmentPrdRptOff(String.valueOf(devicemetricmeasurementperiodrepeat.getOffset()));
		} else {
			d.addDvcMetricMsrmentPrdRptOff("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_Cnt ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasCount()) {

			d.addDvcMetricMsrmentPrdRptCnt(String.valueOf(devicemetricmeasurementperiodrepeat.getCount()));
		} else {
			d.addDvcMetricMsrmentPrdRptCnt("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_Prd ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasPeriod()) {

			d.addDvcMetricMsrmentPrdRptPrd(String.valueOf(devicemetricmeasurementperiodrepeat.getPeriod()));
		} else {
			d.addDvcMetricMsrmentPrdRptPrd("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_CntMx ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasCountMax()) {

			d.addDvcMetricMsrmentPrdRptCntMx(String.valueOf(devicemetricmeasurementperiodrepeat.getCountMax()));
		} else {
			d.addDvcMetricMsrmentPrdRptCntMx("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_DurationMx ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasDurationMax()) {

			d.addDvcMetricMsrmentPrdRptDurationMx(String.valueOf(devicemetricmeasurementperiodrepeat.getDurationMax()));
		} else {
			d.addDvcMetricMsrmentPrdRptDurationMx("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period devicemetricmeasurementperiodrepeatboundsperiod = devicemetricmeasurementperiodrepeat.getBoundsPeriod();

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsPrd_Strt ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsperiod.hasStart()) {

			d.addDvcMetricMsrmentPrdRptBndsPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicemetricmeasurementperiodrepeatboundsperiod.getStart())+"\"");
		} else {
			d.addDvcMetricMsrmentPrdRptBndsPrdStrt("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_BndsPrd_End ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsperiod.hasEnd()) {

			d.addDvcMetricMsrmentPrdRptBndsPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicemetricmeasurementperiodrepeatboundsperiod.getEnd())+"\"");
		} else {
			d.addDvcMetricMsrmentPrdRptBndsPrdEnd("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime devicemetricmeasurementperiodrepeatdurationunit = devicemetricmeasurementperiodrepeat.getDurationUnit();
		if(devicemetricmeasurementperiodrepeatdurationunit!=null) {
			d.addDvcMetricMsrmentPrdRptDurationUnt(devicemetricmeasurementperiodrepeatdurationunit.toCode());
		} else {
			d.addDvcMetricMsrmentPrdRptDurationUnt("NULL");
		}

		/******************** devicemetricmeasurementperiodrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration devicemetricmeasurementperiodrepeatboundsduration = devicemetricmeasurementperiodrepeat.getBoundsDuration();

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Vl ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsduration.hasValue()) {

			d.addDvcMetricMsrmentPrdRptBndsDurationVl(String.valueOf(devicemetricmeasurementperiodrepeatboundsduration.getValue()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsDurationVl("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicemetricmeasurementperiodrepeatboundsdurationcomparator = devicemetricmeasurementperiodrepeatboundsduration.getComparator();
		if(devicemetricmeasurementperiodrepeatboundsdurationcomparator!=null) {
			d.addDvcMetricMsrmentPrdRptBndsDurationCmprtr(devicemetricmeasurementperiodrepeatboundsdurationcomparator.toCode());
		} else {
			d.addDvcMetricMsrmentPrdRptBndsDurationCmprtr("NULL");
		}

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Cd ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsduration.hasCode()) {

			d.addDvcMetricMsrmentPrdRptBndsDurationCd(String.valueOf(devicemetricmeasurementperiodrepeatboundsduration.getCode()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsDurationCd("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Unt ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsduration.hasUnit()) {

			d.addDvcMetricMsrmentPrdRptBndsDurationUnt(String.valueOf(devicemetricmeasurementperiodrepeatboundsduration.getUnit()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsDurationUnt("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Sys ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsduration.hasSystem()) {

			d.addDvcMetricMsrmentPrdRptBndsDurationSys(String.valueOf(devicemetricmeasurementperiodrepeatboundsduration.getSystem()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsDurationSys("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range devicemetricmeasurementperiodrepeatboundsrange = devicemetricmeasurementperiodrepeat.getBoundsRange();

		/******************** devicemetricmeasurementperiodrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicemetricmeasurementperiodrepeatboundsrangelow = devicemetricmeasurementperiodrepeatboundsrange.getLow();

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangelow.hasValue()) {

			d.addDvcMetricMsrmentPrdRptBndsRngLwVl(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangelow.getValue()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngLwVl("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicemetricmeasurementperiodrepeatboundsrangelowcomparator = devicemetricmeasurementperiodrepeatboundsrangelow.getComparator();
		if(devicemetricmeasurementperiodrepeatboundsrangelowcomparator!=null) {
			d.addDvcMetricMsrmentPrdRptBndsRngLwCmprtr(devicemetricmeasurementperiodrepeatboundsrangelowcomparator.toCode());
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngLwCmprtr("NULL");
		}

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangelow.hasCode()) {

			d.addDvcMetricMsrmentPrdRptBndsRngLwCd(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangelow.getCode()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngLwCd("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangelow.hasUnit()) {

			d.addDvcMetricMsrmentPrdRptBndsRngLwUnt(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangelow.getUnit()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngLwUnt("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangelow.hasSystem()) {

			d.addDvcMetricMsrmentPrdRptBndsRngLwSys(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangelow.getSystem()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngLwSys("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity devicemetricmeasurementperiodrepeatboundsrangehigh = devicemetricmeasurementperiodrepeatboundsrange.getHigh();

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangehigh.hasValue()) {

			d.addDvcMetricMsrmentPrdRptBndsRngHiVl(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangehigh.getValue()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngHiVl("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator devicemetricmeasurementperiodrepeatboundsrangehighcomparator = devicemetricmeasurementperiodrepeatboundsrangehigh.getComparator();
		if(devicemetricmeasurementperiodrepeatboundsrangehighcomparator!=null) {
			d.addDvcMetricMsrmentPrdRptBndsRngHiCmprtr(devicemetricmeasurementperiodrepeatboundsrangehighcomparator.toCode());
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngHiCmprtr("NULL");
		}

		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangehigh.hasCode()) {

			d.addDvcMetricMsrmentPrdRptBndsRngHiCd(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangehigh.getCode()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngHiCd("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangehigh.hasUnit()) {

			d.addDvcMetricMsrmentPrdRptBndsRngHiUnt(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangehigh.getUnit()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngHiUnt("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(devicemetricmeasurementperiodrepeatboundsrangehigh.hasSystem()) {

			d.addDvcMetricMsrmentPrdRptBndsRngHiSys(String.valueOf(devicemetricmeasurementperiodrepeatboundsrangehigh.getSystem()));
		} else {
			d.addDvcMetricMsrmentPrdRptBndsRngHiSys("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_FrqncyMx ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasFrequencyMax()) {

			d.addDvcMetricMsrmentPrdRptFrqncyMx(String.valueOf(devicemetricmeasurementperiodrepeat.getFrequencyMax()));
		} else {
			d.addDvcMetricMsrmentPrdRptFrqncyMx("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeatwhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>> devicemetricmeasurementperiodrepeatwhenlist = devicemetricmeasurementperiodrepeat.getWhen();
		for(int devicemetricmeasurementperiodrepeatwheni = 0; devicemetricmeasurementperiodrepeatwheni<devicemetricmeasurementperiodrepeatwhenlist.size();devicemetricmeasurementperiodrepeatwheni++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.EventTiming>  devicemetricmeasurementperiodrepeatwhen = devicemetricmeasurementperiodrepeatwhenlist.get(devicemetricmeasurementperiodrepeatwheni);
		if(devicemetricmeasurementperiodrepeatwhen!=null) {
			d.addDvcMetricMsrmentPrdRptWhen(devicemetricmeasurementperiodrepeatwhen.getCode());
		} else {
			d.addDvcMetricMsrmentPrdRptWhen("NULL");
		}
		 };

		/******************** devicemetricmeasurementperiodrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime devicemetricmeasurementperiodrepeatperiodunit = devicemetricmeasurementperiodrepeat.getPeriodUnit();
		if(devicemetricmeasurementperiodrepeatperiodunit!=null) {
			d.addDvcMetricMsrmentPrdRptPrdUnt(devicemetricmeasurementperiodrepeatperiodunit.toCode());
		} else {
			d.addDvcMetricMsrmentPrdRptPrdUnt("NULL");
		}

		/******************** DvcMetric_MsrmentPrd_Rpt_PrdMx ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasPeriodMax()) {

			d.addDvcMetricMsrmentPrdRptPrdMx(String.valueOf(devicemetricmeasurementperiodrepeat.getPeriodMax()));
		} else {
			d.addDvcMetricMsrmentPrdRptPrdMx("NULL");
		}


		/******************** devicemetricmeasurementperiodrepeatdayofweek ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>> devicemetricmeasurementperiodrepeatdayofweeklist = devicemetricmeasurementperiodrepeat.getDayOfWeek();
		for(int devicemetricmeasurementperiodrepeatdayofweeki = 0; devicemetricmeasurementperiodrepeatdayofweeki<devicemetricmeasurementperiodrepeatdayofweeklist.size();devicemetricmeasurementperiodrepeatdayofweeki++ ) {
		org.hl7.fhir.r4.model.Enumeration<org.hl7.fhir.r4.model.Timing.DayOfWeek>  devicemetricmeasurementperiodrepeatdayofweek = devicemetricmeasurementperiodrepeatdayofweeklist.get(devicemetricmeasurementperiodrepeatdayofweeki);
		if(devicemetricmeasurementperiodrepeatdayofweek!=null) {
			d.addDvcMetricMsrmentPrdRptDayOfWeek(devicemetricmeasurementperiodrepeatdayofweek.getCode());
		} else {
			d.addDvcMetricMsrmentPrdRptDayOfWeek("NULL");
		}
		 };

		/******************** DvcMetric_MsrmentPrd_Rpt_TimeOfDay ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasTimeOfDay()) {

			String  array = "[";
			for(int incr=0; incr<devicemetricmeasurementperiodrepeat.getTimeOfDay().size(); incr++) {
				array = array + devicemetricmeasurementperiodrepeat.getTimeOfDay().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			d.addDvcMetricMsrmentPrdRptTimeOfDay(array);

		} else {
			d.addDvcMetricMsrmentPrdRptTimeOfDay("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_Duration ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasDuration()) {

			d.addDvcMetricMsrmentPrdRptDuration(String.valueOf(devicemetricmeasurementperiodrepeat.getDuration()));
		} else {
			d.addDvcMetricMsrmentPrdRptDuration("NULL");
		}


		/******************** DvcMetric_MsrmentPrd_Rpt_Frqncy ********************************************************************************/
		if(devicemetricmeasurementperiodrepeat.hasFrequency()) {

			d.addDvcMetricMsrmentPrdRptFrqncy(String.valueOf(devicemetricmeasurementperiodrepeat.getFrequency()));
		} else {
			d.addDvcMetricMsrmentPrdRptFrqncy("NULL");
		}


		/******************** devicemetriccolor ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricColor devicemetriccolor = devicemetric.getColor();
		if(devicemetriccolor!=null) {
			d.addDvcMetricColor(devicemetriccolor.toCode());
		} else {
			d.addDvcMetricColor("NULL");
		}

		/******************** devicemetricunit ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept devicemetricunit = devicemetric.getUnit();

		/******************** DvcMetric_Unt_Txt ********************************************************************************/
		if(devicemetricunit.hasText()) {

			d.addDvcMetricUntTxt(String.valueOf(devicemetricunit.getText()));
		} else {
			d.addDvcMetricUntTxt("NULL");
		}


		/******************** devicemetricunitcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> devicemetricunitcodinglist = devicemetricunit.getCoding();
		for(int devicemetricunitcodingi = 0; devicemetricunitcodingi<devicemetricunitcodinglist.size();devicemetricunitcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  devicemetricunitcoding = devicemetricunitcodinglist.get(devicemetricunitcodingi);

		/******************** DvcMetric_Unt_Cdg_Dsply ********************************************************************************/
		if(devicemetricunitcodingi == 0) {d.addDvcMetricUntCdgDsply("[");}
		if(devicemetricunitcoding.hasDisplay()) {

			d.addDvcMetricUntCdgDsply(String.valueOf(devicemetricunitcoding.getDisplay()));
		} else {
			d.addDvcMetricUntCdgDsply("NULL");
		}

		if(devicemetricunitcodingi == devicemetricunitcodinglist.size()-1) {d.addDvcMetricUntCdgDsply("]");}


		/******************** DvcMetric_Unt_Cdg_Vrsn ********************************************************************************/
		if(devicemetricunitcodingi == 0) {d.addDvcMetricUntCdgVrsn("[");}
		if(devicemetricunitcoding.hasVersion()) {

			d.addDvcMetricUntCdgVrsn(String.valueOf(devicemetricunitcoding.getVersion()));
		} else {
			d.addDvcMetricUntCdgVrsn("NULL");
		}

		if(devicemetricunitcodingi == devicemetricunitcodinglist.size()-1) {d.addDvcMetricUntCdgVrsn("]");}


		/******************** DvcMetric_Unt_Cdg_Cd ********************************************************************************/
		if(devicemetricunitcodingi == 0) {d.addDvcMetricUntCdgCd("[");}
		if(devicemetricunitcoding.hasCode()) {

			d.addDvcMetricUntCdgCd(String.valueOf(devicemetricunitcoding.getCode()));
		} else {
			d.addDvcMetricUntCdgCd("NULL");
		}

		if(devicemetricunitcodingi == devicemetricunitcodinglist.size()-1) {d.addDvcMetricUntCdgCd("]");}


		/******************** DvcMetric_Unt_Cdg_UsrSltd ********************************************************************************/
		if(devicemetricunitcodingi == 0) {d.addDvcMetricUntCdgUsrSltd("[");}
		if(devicemetricunitcoding.hasUserSelected()) {

			d.addDvcMetricUntCdgUsrSltd(String.valueOf(devicemetricunitcoding.getUserSelected()));
		} else {
			d.addDvcMetricUntCdgUsrSltd("NULL");
		}

		if(devicemetricunitcodingi == devicemetricunitcodinglist.size()-1) {d.addDvcMetricUntCdgUsrSltd("]");}


		/******************** DvcMetric_Unt_Cdg_Sys ********************************************************************************/
		if(devicemetricunitcodingi == 0) {d.addDvcMetricUntCdgSys("[");}
		if(devicemetricunitcoding.hasSystem()) {

			d.addDvcMetricUntCdgSys(String.valueOf(devicemetricunitcoding.getSystem()));
		} else {
			d.addDvcMetricUntCdgSys("NULL");
		}

		if(devicemetricunitcodingi == devicemetricunitcodinglist.size()-1) {d.addDvcMetricUntCdgSys("]");}


		 };
		/******************** devicemetriccalibration ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationComponent> devicemetriccalibrationlist = devicemetric.getCalibration();
		for(int devicemetriccalibrationi = 0; devicemetriccalibrationi<devicemetriccalibrationlist.size();devicemetriccalibrationi++ ) {
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationComponent  devicemetriccalibration = devicemetriccalibrationlist.get(devicemetriccalibrationi);

		/******************** devicemetriccalibrationstate ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationState devicemetriccalibrationstate = devicemetriccalibration.getState();
		if(devicemetriccalibrationstate!=null) {
		if(devicemetriccalibrationi == 0) {

		d.addDvcMetricCalibrationState("[");		}
			d.addDvcMetricCalibrationState(devicemetriccalibrationstate.toCode());
		if(devicemetriccalibrationi == devicemetriccalibrationlist.size()-1) {

		d.addDvcMetricCalibrationState("]");		}

		} else {
			d.addDvcMetricCalibrationState("NULL");
		}

		/******************** devicemetriccalibrationtype ********************************************************************************/
		org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationType devicemetriccalibrationtype = devicemetriccalibration.getType();
		if(devicemetriccalibrationtype!=null) {
		if(devicemetriccalibrationi == 0) {

		d.addDvcMetricCalibrationTyp("[");		}
			d.addDvcMetricCalibrationTyp(devicemetriccalibrationtype.toCode());
		if(devicemetriccalibrationi == devicemetriccalibrationlist.size()-1) {

		d.addDvcMetricCalibrationTyp("]");		}

		} else {
			d.addDvcMetricCalibrationTyp("NULL");
		}

		/******************** DvcMetric_Calibration_Time ********************************************************************************/
		if(devicemetriccalibrationi == 0) {d.addDvcMetricCalibrationTime("[");}
		if(devicemetriccalibration.hasTime()) {

			d.addDvcMetricCalibrationTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(devicemetriccalibration.getTime())+"\"");
		} else {
			d.addDvcMetricCalibrationTime("NULL");
		}

		if(devicemetriccalibrationi == devicemetriccalibrationlist.size()-1) {d.addDvcMetricCalibrationTime("]");}


		 };
		return d;
	}
}
