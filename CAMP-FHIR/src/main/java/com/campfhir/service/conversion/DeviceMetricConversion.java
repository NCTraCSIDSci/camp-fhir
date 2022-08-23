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

		/******************** DvcMetric_Calibration_State ********************************************************************************/
		if(d.getDvcMetricCalibrationState() != null ) {

			String[] arrayi0 = d.getDvcMetricCalibrationState().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getCalibration().size() < i0+1) { devicemetric.addCalibration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getCalibration().get(i0).setState(new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationStateEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_Calibration_Time ********************************************************************************/
		if(d.getDvcMetricCalibrationTime() != null ) {

			String[] arrayi0 = d.getDvcMetricCalibrationTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getCalibration().size() < i0+1) { devicemetric.addCalibration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getCalibration().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_Calibration_Typ ********************************************************************************/
		if(d.getDvcMetricCalibrationTyp() != null ) {

			String[] arrayi0 = d.getDvcMetricCalibrationTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getCalibration().size() < i0+1) { devicemetric.addCalibration(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getCalibration().get(i0).setType(new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCalibrationTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_Ctgry ********************************************************************************/
		if(d.getDvcMetricCtgry() != null ) {

			if(d.getDvcMetricCtgry().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricCtgry()==null) {} else {
			devicemetric.setCategory(new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricCategoryEnumFactory().fromCode(d.getDvcMetricCtgry().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_Color ********************************************************************************/
		if(d.getDvcMetricColor() != null ) {

			if(d.getDvcMetricColor().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricColor()==null) {} else {
			devicemetric.setColor(new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricColorEnumFactory().fromCode(d.getDvcMetricColor().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_Id_Assigner ********************************************************************************/
		if(d.getDvcMetricIdAssigner() != null ) {

			String[] arrayi0 = d.getDvcMetricIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_Id_Prd_End ********************************************************************************/
		if(d.getDvcMetricIdPrdEnd() != null ) {

			String[] arrayi0 = d.getDvcMetricIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_Id_Prd_Strt ********************************************************************************/
		if(d.getDvcMetricIdPrdStrt() != null ) {

			String[] arrayi0 = d.getDvcMetricIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_Id_Sys ********************************************************************************/
		if(d.getDvcMetricIdSys() != null ) {

			String[] arrayi0 = d.getDvcMetricIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Id_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcMetricIdTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcMetricIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				String[] arrayi1 = d.getDvcMetricIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicemetric.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicemetric.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicemetric.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcMetric_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcMetricIdTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcMetricIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				String[] arrayi1 = d.getDvcMetricIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicemetric.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicemetric.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicemetric.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcMetric_Id_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcMetricIdTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcMetricIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				String[] arrayi1 = d.getDvcMetricIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicemetric.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicemetric.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicemetric.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcMetric_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcMetricIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcMetricIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				String[] arrayi1 = d.getDvcMetricIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicemetric.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicemetric.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicemetric.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** DvcMetric_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcMetricIdTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcMetricIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				String[] arrayi1 = d.getDvcMetricIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(devicemetric.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { devicemetric.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {devicemetric.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** DvcMetric_Id_Typ_Txt ********************************************************************************/
		if(d.getDvcMetricIdTypTxt() != null ) {

			String[] arrayi0 = d.getDvcMetricIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Id_Use ********************************************************************************/
		if(d.getDvcMetricIdUse() != null ) {

			String[] arrayi0 = d.getDvcMetricIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_Id_Vl ********************************************************************************/
		if(d.getDvcMetricIdVl() != null ) {

			String[] arrayi0 = d.getDvcMetricIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getIdentifier().size() < i0+1) { devicemetric.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Cd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgCd() != null ) {

			String[] arrayi0 = d.getDvcMetricMsrmentPrdCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getMeasurementPeriod().getCode().getCoding().size() < i0+1) { devicemetric.getMeasurementPeriod().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getMeasurementPeriod().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Dsply ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcMetricMsrmentPrdCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getMeasurementPeriod().getCode().getCoding().size() < i0+1) { devicemetric.getMeasurementPeriod().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getMeasurementPeriod().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Sys ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgSys() != null ) {

			String[] arrayi0 = d.getDvcMetricMsrmentPrdCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getMeasurementPeriod().getCode().getCoding().size() < i0+1) { devicemetric.getMeasurementPeriod().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getMeasurementPeriod().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcMetricMsrmentPrdCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getMeasurementPeriod().getCode().getCoding().size() < i0+1) { devicemetric.getMeasurementPeriod().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getMeasurementPeriod().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_MsrmentPrd_Cd_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcMetricMsrmentPrdCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getMeasurementPeriod().getCode().getCoding().size() < i0+1) { devicemetric.getMeasurementPeriod().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getMeasurementPeriod().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_MsrmentPrd_Cd_Txt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdCdTxt() != null ) {

			if(d.getDvcMetricMsrmentPrdCdTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdCdTxt()==null) {} else {
			devicemetric.getMeasurementPeriod().getCode().setText(d.getDvcMetricMsrmentPrdCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Evnt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdEvnt() != null ) {

				for( String currListStrSplit : d.getDvcMetricMsrmentPrdEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicemetric.getMeasurementPeriod().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Cd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsDurationCd() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsDurationCd()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsDuration().setCode(d.getDvcMetricMsrmentPrdRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsDurationCmprtr() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsDurationCmprtr()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcMetricMsrmentPrdRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Sys ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsDurationSys() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsDurationSys()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsDuration().setSystem(d.getDvcMetricMsrmentPrdRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Unt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsDurationUnt() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsDurationUnt()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsDuration().setUnit(d.getDvcMetricMsrmentPrdRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsDuration_Vl ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsDurationVl() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsDurationVl()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((d.getDvcMetricMsrmentPrdRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsPrd_End ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsPrdEnd() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsPrdEnd()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsPeriod().setEnd(d.getDvcMetricMsrmentPrdRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcMetricMsrmentPrdRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsPrd_Strt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsPrdStrt() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsPrdStrt()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsPeriod().setStart(d.getDvcMetricMsrmentPrdRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(d.getDvcMetricMsrmentPrdRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngHiCd() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngHiCd()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getHigh().setCode(d.getDvcMetricMsrmentPrdRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngHiCmprtr() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngHiCmprtr()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcMetricMsrmentPrdRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngHiSys() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngHiSys()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getHigh().setSystem(d.getDvcMetricMsrmentPrdRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngHiUnt() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngHiUnt()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getHigh().setUnit(d.getDvcMetricMsrmentPrdRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngHiVl() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngHiVl()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((d.getDvcMetricMsrmentPrdRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngLwCd() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngLwCd()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getLow().setCode(d.getDvcMetricMsrmentPrdRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngLwCmprtr() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngLwCmprtr()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(d.getDvcMetricMsrmentPrdRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngLwSys() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngLwSys()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getLow().setSystem(d.getDvcMetricMsrmentPrdRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngLwUnt() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngLwUnt()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getLow().setUnit(d.getDvcMetricMsrmentPrdRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptBndsRngLwVl() != null ) {

			if(d.getDvcMetricMsrmentPrdRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptBndsRngLwVl()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((d.getDvcMetricMsrmentPrdRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Cnt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptCnt() != null ) {

			if(d.getDvcMetricMsrmentPrdRptCnt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptCnt()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setCount(Integer.parseInt(d.getDvcMetricMsrmentPrdRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_CntMx ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptCntMx() != null ) {

			if(d.getDvcMetricMsrmentPrdRptCntMx().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptCntMx()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setCountMax(Integer.parseInt(d.getDvcMetricMsrmentPrdRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Duration ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptDuration() != null ) {

			if(d.getDvcMetricMsrmentPrdRptDuration().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptDuration()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setDuration((Double.parseDouble((d.getDvcMetricMsrmentPrdRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_DurationMx ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptDurationMx() != null ) {

			if(d.getDvcMetricMsrmentPrdRptDurationMx().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptDurationMx()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setDurationMax((Double.parseDouble((d.getDvcMetricMsrmentPrdRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_DurationUnt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptDurationUnt() != null ) {

			if(d.getDvcMetricMsrmentPrdRptDurationUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptDurationUnt()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(d.getDvcMetricMsrmentPrdRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Frqncy ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptFrqncy() != null ) {

			if(d.getDvcMetricMsrmentPrdRptFrqncy().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptFrqncy()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setFrequency(Integer.parseInt(d.getDvcMetricMsrmentPrdRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_FrqncyMx ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptFrqncyMx() != null ) {

			if(d.getDvcMetricMsrmentPrdRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptFrqncyMx()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setFrequencyMax(Integer.parseInt(d.getDvcMetricMsrmentPrdRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Off ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptOff() != null ) {

			if(d.getDvcMetricMsrmentPrdRptOff().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptOff()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setOffset(Integer.parseInt(d.getDvcMetricMsrmentPrdRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_Prd ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptPrd() != null ) {

			if(d.getDvcMetricMsrmentPrdRptPrd().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptPrd()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setPeriod((new java.math.BigDecimal((d.getDvcMetricMsrmentPrdRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_PrdMx ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptPrdMx() != null ) {

			if(d.getDvcMetricMsrmentPrdRptPrdMx().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptPrdMx()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setPeriodMax((new java.math.BigDecimal((d.getDvcMetricMsrmentPrdRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_PrdUnt ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptPrdUnt() != null ) {

			if(d.getDvcMetricMsrmentPrdRptPrdUnt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricMsrmentPrdRptPrdUnt()==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(d.getDvcMetricMsrmentPrdRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_MsrmentPrd_Rpt_TimeOfDay ********************************************************************************/
		if(d.getDvcMetricMsrmentPrdRptTimeOfDay() != null ) {

				for( String currListStrSplit : d.getDvcMetricMsrmentPrdRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			devicemetric.getMeasurementPeriod().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** DvcMetric_OprtnalSts ********************************************************************************/
		if(d.getDvcMetricOprtnalSts() != null ) {

			if(d.getDvcMetricOprtnalSts().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricOprtnalSts()==null) {} else {
			devicemetric.setOperationalStatus(new org.hl7.fhir.r4.model.DeviceMetric.DeviceMetricOperationalStatusEnumFactory().fromCode(d.getDvcMetricOprtnalSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_Parent ********************************************************************************/
		if(d.getDvcMetricParent() != null ) {

			if(d.getDvcMetricParent().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricParent()==null) {} else {
			devicemetric.setParent(new org.hl7.fhir.r4.model.Reference(d.getDvcMetricParent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_Src ********************************************************************************/
		if(d.getDvcMetricSrc() != null ) {

			if(d.getDvcMetricSrc().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricSrc()==null) {} else {
			devicemetric.setSource(new org.hl7.fhir.r4.model.Reference(d.getDvcMetricSrc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** DvcMetric_Typ_Cdg_Cd ********************************************************************************/
		if(d.getDvcMetricTypCdgCd() != null ) {

			String[] arrayi0 = d.getDvcMetricTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getType().getCoding().size() < i0+1) { devicemetric.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Typ_Cdg_Dsply ********************************************************************************/
		if(d.getDvcMetricTypCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcMetricTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getType().getCoding().size() < i0+1) { devicemetric.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Typ_Cdg_Sys ********************************************************************************/
		if(d.getDvcMetricTypCdgSys() != null ) {

			String[] arrayi0 = d.getDvcMetricTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getType().getCoding().size() < i0+1) { devicemetric.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Typ_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcMetricTypCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcMetricTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getType().getCoding().size() < i0+1) { devicemetric.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_Typ_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcMetricTypCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcMetricTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getType().getCoding().size() < i0+1) { devicemetric.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Typ_Txt ********************************************************************************/
		if(d.getDvcMetricTypTxt() != null ) {

			if(d.getDvcMetricTypTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricTypTxt()==null) {} else {
			devicemetric.getType().setText(d.getDvcMetricTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** DvcMetric_Unt_Cdg_Cd ********************************************************************************/
		if(d.getDvcMetricUntCdgCd() != null ) {

			String[] arrayi0 = d.getDvcMetricUntCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getUnit().getCoding().size() < i0+1) { devicemetric.getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getUnit().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Unt_Cdg_Dsply ********************************************************************************/
		if(d.getDvcMetricUntCdgDsply() != null ) {

			String[] arrayi0 = d.getDvcMetricUntCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getUnit().getCoding().size() < i0+1) { devicemetric.getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getUnit().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Unt_Cdg_Sys ********************************************************************************/
		if(d.getDvcMetricUntCdgSys() != null ) {

			String[] arrayi0 = d.getDvcMetricUntCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getUnit().getCoding().size() < i0+1) { devicemetric.getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getUnit().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Unt_Cdg_UsrSltd ********************************************************************************/
		if(d.getDvcMetricUntCdgUsrSltd() != null ) {

			String[] arrayi0 = d.getDvcMetricUntCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getUnit().getCoding().size() < i0+1) { devicemetric.getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getUnit().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** DvcMetric_Unt_Cdg_Vrsn ********************************************************************************/
		if(d.getDvcMetricUntCdgVrsn() != null ) {

			String[] arrayi0 = d.getDvcMetricUntCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(devicemetric.getUnit().getCoding().size() < i0+1) { devicemetric.getUnit().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {devicemetric.getUnit().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** DvcMetric_Unt_Txt ********************************************************************************/
		if(d.getDvcMetricUntTxt() != null ) {

			if(d.getDvcMetricUntTxt().replace("[","").replace("]","").equals("NULL") | d.getDvcMetricUntTxt()==null) {} else {
			devicemetric.getUnit().setText(d.getDvcMetricUntTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return devicemetric;
	}
}
