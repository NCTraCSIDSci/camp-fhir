package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SupplyRequest;
public class SupplyRequestBidirectionalConversion 
{
	public SupplyRequest SupplyRequests(org.hl7.fhir.r4.model.SupplyRequest supplyrequest) throws ParseException
	{
		 main.java.com.campfhir.model.SupplyRequest s = new  main.java.com.campfhir.model.SupplyRequest();

		/******************** id ********************************************************************************/
		supplyrequest.setId(s.getId());

		/******************** supplyrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyRequest.RequestPriority supplyrequestpriority = supplyrequest.getPriority();
		s.setSpplyRqstPriority(supplyrequestpriority.toCode());

		/******************** supplyrequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplyrequestoccurrenceperiod = supplyrequest.getOccurrencePeriod();

		/******************** SpplyRqst_OccrncePrd_End ********************************************************************************/
		if(supplyrequestoccurrenceperiod.hasEnd()) {
			s.setSpplyRqstOccrncePrdEnd(String.valueOf(supplyrequestoccurrenceperiod.getEnd()));
		}
		/******************** SpplyRqst_OccrncePrd_Strt ********************************************************************************/
		if(supplyrequestoccurrenceperiod.hasStart()) {
			s.setSpplyRqstOccrncePrdStrt(String.valueOf(supplyrequestoccurrenceperiod.getStart()));
		}
		/******************** SpplyRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(supplyrequest.hasOccurrenceDateTimeType()) {
			s.setSpplyRqstOccrnceDtTimeTyp(String.valueOf(supplyrequest.getOccurrenceDateTimeType()));
		}
		/******************** SpplyRqst_Supplier ********************************************************************************/
		if(supplyrequest.hasSupplier()) {
			s.setSpplyRqstSupplier(String.valueOf(supplyrequest.getSupplierFirstRep()));
		}
		/******************** supplyrequestparameter ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestParameterComponent supplyrequestparameter = supplyrequest.getParameterFirstRep();

		/******************** supplyrequestparametercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestparametercode = supplyrequestparameter.getCode();

		/******************** supplyrequestparametercodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestparametercodecoding = supplyrequestparametercode.getCodingFirstRep();

		/******************** SpplyRqst_Prmtr_Cd_Cdg_Dsply ********************************************************************************/
		if(supplyrequestparametercodecoding.hasDisplay()) {
			s.setSpplyRqstPrmtrCdCdgDsply(String.valueOf(supplyrequestparametercodecoding.getDisplay()));
		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestparametercodecoding.hasVersion()) {
			s.setSpplyRqstPrmtrCdCdgVrsn(String.valueOf(supplyrequestparametercodecoding.getVersion()));
		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Cd ********************************************************************************/
		if(supplyrequestparametercodecoding.hasCode()) {
			s.setSpplyRqstPrmtrCdCdgCd(String.valueOf(supplyrequestparametercodecoding.getCode()));
		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Sys ********************************************************************************/
		if(supplyrequestparametercodecoding.hasSystem()) {
			s.setSpplyRqstPrmtrCdCdgSys(String.valueOf(supplyrequestparametercodecoding.getSystem()));
		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestparametercodecoding.hasUserSelected()) {
			s.setSpplyRqstPrmtrCdCdgUsrSltd(String.valueOf(supplyrequestparametercodecoding.getUserSelected()));
		}
		/******************** SpplyRqst_Prmtr_Cd_Txt ********************************************************************************/
		if(supplyrequestparametercode.hasText()) {
			s.setSpplyRqstPrmtrCdTxt(String.valueOf(supplyrequestparametercode.getText()));
		}
		/******************** SpplyRqst_Prmtr_VlBooleanTyp ********************************************************************************/
		if(supplyrequestparameter.hasValueBooleanType()) {
			s.setSpplyRqstPrmtrVlBooleanTyp(String.valueOf(supplyrequestparameter.getValueBooleanType()));
		}
		/******************** supplyrequestparametervaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestparametervaluecodeableconcept = supplyrequestparameter.getValueCodeableConcept();

		/******************** supplyrequestparametervaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestparametervaluecodeableconceptcoding = supplyrequestparametervaluecodeableconcept.getCodingFirstRep();

		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcoding.hasDisplay()) {
			s.setSpplyRqstPrmtrVlCdbleCncptCdgDsply(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getDisplay()));
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcoding.hasVersion()) {
			s.setSpplyRqstPrmtrVlCdbleCncptCdgVrsn(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getVersion()));
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcoding.hasCode()) {
			s.setSpplyRqstPrmtrVlCdbleCncptCdgCd(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getCode()));
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcoding.hasSystem()) {
			s.setSpplyRqstPrmtrVlCdbleCncptCdgSys(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getSystem()));
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestparametervaluecodeableconceptcoding.hasUserSelected()) {
			s.setSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd(String.valueOf(supplyrequestparametervaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Txt ********************************************************************************/
		if(supplyrequestparametervaluecodeableconcept.hasText()) {
			s.setSpplyRqstPrmtrVlCdbleCncptTxt(String.valueOf(supplyrequestparametervaluecodeableconcept.getText()));
		}
		/******************** supplyrequestparametervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestparametervaluequantity = supplyrequestparameter.getValueQuantity();

		/******************** SpplyRqst_Prmtr_VlQnty_Vl ********************************************************************************/
		if(supplyrequestparametervaluequantity.hasValue()) {
			s.setSpplyRqstPrmtrVlQntyVl(String.valueOf(supplyrequestparametervaluequantity.getValue()));
		}
		/******************** supplyrequestparametervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestparametervaluequantitycomparator = supplyrequestparametervaluequantity.getComparator();
		s.setSpplyRqstPrmtrVlQntyCmprtr(supplyrequestparametervaluequantitycomparator.toCode());

		/******************** SpplyRqst_Prmtr_VlQnty_Cd ********************************************************************************/
		if(supplyrequestparametervaluequantity.hasCode()) {
			s.setSpplyRqstPrmtrVlQntyCd(String.valueOf(supplyrequestparametervaluequantity.getCode()));
		}
		/******************** SpplyRqst_Prmtr_VlQnty_Sys ********************************************************************************/
		if(supplyrequestparametervaluequantity.hasSystem()) {
			s.setSpplyRqstPrmtrVlQntySys(String.valueOf(supplyrequestparametervaluequantity.getSystem()));
		}
		/******************** SpplyRqst_Prmtr_VlQnty_Unt ********************************************************************************/
		if(supplyrequestparametervaluequantity.hasUnit()) {
			s.setSpplyRqstPrmtrVlQntyUnt(String.valueOf(supplyrequestparametervaluequantity.getUnit()));
		}
		/******************** supplyrequestparametervaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range supplyrequestparametervaluerange = supplyrequestparameter.getValueRange();

		/******************** supplyrequestparametervaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestparametervaluerangelow = supplyrequestparametervaluerange.getLow();

		/******************** SpplyRqst_Prmtr_VlRng_Lw_Vl ********************************************************************************/
		if(supplyrequestparametervaluerangelow.hasValue()) {
			s.setSpplyRqstPrmtrVlRngLwVl(String.valueOf(supplyrequestparametervaluerangelow.getValue()));
		}
		/******************** supplyrequestparametervaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestparametervaluerangelowcomparator = supplyrequestparametervaluerangelow.getComparator();
		s.setSpplyRqstPrmtrVlRngLwCmprtr(supplyrequestparametervaluerangelowcomparator.toCode());

		/******************** SpplyRqst_Prmtr_VlRng_Lw_Cd ********************************************************************************/
		if(supplyrequestparametervaluerangelow.hasCode()) {
			s.setSpplyRqstPrmtrVlRngLwCd(String.valueOf(supplyrequestparametervaluerangelow.getCode()));
		}
		/******************** SpplyRqst_Prmtr_VlRng_Lw_Sys ********************************************************************************/
		if(supplyrequestparametervaluerangelow.hasSystem()) {
			s.setSpplyRqstPrmtrVlRngLwSys(String.valueOf(supplyrequestparametervaluerangelow.getSystem()));
		}
		/******************** SpplyRqst_Prmtr_VlRng_Lw_Unt ********************************************************************************/
		if(supplyrequestparametervaluerangelow.hasUnit()) {
			s.setSpplyRqstPrmtrVlRngLwUnt(String.valueOf(supplyrequestparametervaluerangelow.getUnit()));
		}
		/******************** supplyrequestparametervaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestparametervaluerangehigh = supplyrequestparametervaluerange.getHigh();

		/******************** SpplyRqst_Prmtr_VlRng_Hi_Vl ********************************************************************************/
		if(supplyrequestparametervaluerangehigh.hasValue()) {
			s.setSpplyRqstPrmtrVlRngHiVl(String.valueOf(supplyrequestparametervaluerangehigh.getValue()));
		}
		/******************** supplyrequestparametervaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestparametervaluerangehighcomparator = supplyrequestparametervaluerangehigh.getComparator();
		s.setSpplyRqstPrmtrVlRngHiCmprtr(supplyrequestparametervaluerangehighcomparator.toCode());

		/******************** SpplyRqst_Prmtr_VlRng_Hi_Cd ********************************************************************************/
		if(supplyrequestparametervaluerangehigh.hasCode()) {
			s.setSpplyRqstPrmtrVlRngHiCd(String.valueOf(supplyrequestparametervaluerangehigh.getCode()));
		}
		/******************** SpplyRqst_Prmtr_VlRng_Hi_Sys ********************************************************************************/
		if(supplyrequestparametervaluerangehigh.hasSystem()) {
			s.setSpplyRqstPrmtrVlRngHiSys(String.valueOf(supplyrequestparametervaluerangehigh.getSystem()));
		}
		/******************** SpplyRqst_Prmtr_VlRng_Hi_Unt ********************************************************************************/
		if(supplyrequestparametervaluerangehigh.hasUnit()) {
			s.setSpplyRqstPrmtrVlRngHiUnt(String.valueOf(supplyrequestparametervaluerangehigh.getUnit()));
		}
		/******************** supplyrequestitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestitemcodeableconcept = supplyrequest.getItemCodeableConcept();

		/******************** supplyrequestitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestitemcodeableconceptcoding = supplyrequestitemcodeableconcept.getCodingFirstRep();

		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(supplyrequestitemcodeableconceptcoding.hasDisplay()) {
			s.setSpplyRqstItmCdbleCncptCdgDsply(String.valueOf(supplyrequestitemcodeableconceptcoding.getDisplay()));
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestitemcodeableconceptcoding.hasVersion()) {
			s.setSpplyRqstItmCdbleCncptCdgVrsn(String.valueOf(supplyrequestitemcodeableconceptcoding.getVersion()));
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(supplyrequestitemcodeableconceptcoding.hasCode()) {
			s.setSpplyRqstItmCdbleCncptCdgCd(String.valueOf(supplyrequestitemcodeableconceptcoding.getCode()));
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(supplyrequestitemcodeableconceptcoding.hasSystem()) {
			s.setSpplyRqstItmCdbleCncptCdgSys(String.valueOf(supplyrequestitemcodeableconceptcoding.getSystem()));
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestitemcodeableconceptcoding.hasUserSelected()) {
			s.setSpplyRqstItmCdbleCncptCdgUsrSltd(String.valueOf(supplyrequestitemcodeableconceptcoding.getUserSelected()));
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Txt ********************************************************************************/
		if(supplyrequestitemcodeableconcept.hasText()) {
			s.setSpplyRqstItmCdbleCncptTxt(String.valueOf(supplyrequestitemcodeableconcept.getText()));
		}
		/******************** supplyrequestoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing supplyrequestoccurrencetiming = supplyrequest.getOccurrenceTiming();

		/******************** supplyrequestoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestoccurrencetimingcode = supplyrequestoccurrencetiming.getCode();

		/******************** supplyrequestoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestoccurrencetimingcodecoding = supplyrequestoccurrencetimingcode.getCodingFirstRep();

		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecoding.hasDisplay()) {
			s.setSpplyRqstOccrnceTmgCdCdgDsply(String.valueOf(supplyrequestoccurrencetimingcodecoding.getDisplay()));
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecoding.hasVersion()) {
			s.setSpplyRqstOccrnceTmgCdCdgVrsn(String.valueOf(supplyrequestoccurrencetimingcodecoding.getVersion()));
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecoding.hasCode()) {
			s.setSpplyRqstOccrnceTmgCdCdgCd(String.valueOf(supplyrequestoccurrencetimingcodecoding.getCode()));
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecoding.hasSystem()) {
			s.setSpplyRqstOccrnceTmgCdCdgSys(String.valueOf(supplyrequestoccurrencetimingcodecoding.getSystem()));
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestoccurrencetimingcodecoding.hasUserSelected()) {
			s.setSpplyRqstOccrnceTmgCdCdgUsrSltd(String.valueOf(supplyrequestoccurrencetimingcodecoding.getUserSelected()));
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(supplyrequestoccurrencetimingcode.hasText()) {
			s.setSpplyRqstOccrnceTmgCdTxt(String.valueOf(supplyrequestoccurrencetimingcode.getText()));
		}
		/******************** supplyrequestoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent supplyrequestoccurrencetimingrepeat = supplyrequestoccurrencetiming.getRepeat();

		/******************** SpplyRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasOffset()) {
			s.setSpplyRqstOccrnceTmgRptOff(String.valueOf(supplyrequestoccurrencetimingrepeat.getOffset()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasCount()) {
			s.setSpplyRqstOccrnceTmgRptCnt(String.valueOf(supplyrequestoccurrencetimingrepeat.getCount()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasFrequency()) {
			s.setSpplyRqstOccrnceTmgRptFrqncy(String.valueOf(supplyrequestoccurrencetimingrepeat.getFrequency()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasPeriod()) {
			s.setSpplyRqstOccrnceTmgRptPrd(String.valueOf(supplyrequestoccurrencetimingrepeat.getPeriod()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasDuration()) {
			s.setSpplyRqstOccrnceTmgRptDuration(String.valueOf(supplyrequestoccurrencetimingrepeat.getDuration()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasCountMax()) {
			s.setSpplyRqstOccrnceTmgRptCntMx(String.valueOf(supplyrequestoccurrencetimingrepeat.getCountMax()));
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration supplyrequestoccurrencetimingrepeatboundsduration = supplyrequestoccurrencetimingrepeat.getBoundsDuration();

		/******************** supplyrequestoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplyrequestoccurrencetimingrepeatboundsperiod = supplyrequestoccurrencetimingrepeat.getBoundsPeriod();

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsperiod.hasEnd()) {
			s.setSpplyRqstOccrnceTmgRptBndsPrdEnd(String.valueOf(supplyrequestoccurrencetimingrepeatboundsperiod.getEnd()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsperiod.hasStart()) {
			s.setSpplyRqstOccrnceTmgRptBndsPrdStrt(String.valueOf(supplyrequestoccurrencetimingrepeatboundsperiod.getStart()));
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range supplyrequestoccurrencetimingrepeatboundsrange = supplyrequestoccurrencetimingrepeat.getBoundsRange();

		/******************** supplyrequestoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestoccurrencetimingrepeatboundsrangelow = supplyrequestoccurrencetimingrepeatboundsrange.getLow();

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangelow.hasValue()) {
			s.setSpplyRqstOccrnceTmgRptBndsRngLwVl(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangelow.getValue()));
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestoccurrencetimingrepeatboundsrangelowcomparator = supplyrequestoccurrencetimingrepeatboundsrangelow.getComparator();
		s.setSpplyRqstOccrnceTmgRptBndsRngLwCmprtr(supplyrequestoccurrencetimingrepeatboundsrangelowcomparator.toCode());

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangelow.hasCode()) {
			s.setSpplyRqstOccrnceTmgRptBndsRngLwCd(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangelow.getCode()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangelow.hasSystem()) {
			s.setSpplyRqstOccrnceTmgRptBndsRngLwSys(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangelow.hasUnit()) {
			s.setSpplyRqstOccrnceTmgRptBndsRngLwUnt(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestoccurrencetimingrepeatboundsrangehigh = supplyrequestoccurrencetimingrepeatboundsrange.getHigh();

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangehigh.hasValue()) {
			s.setSpplyRqstOccrnceTmgRptBndsRngHiVl(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestoccurrencetimingrepeatboundsrangehighcomparator = supplyrequestoccurrencetimingrepeatboundsrangehigh.getComparator();
		s.setSpplyRqstOccrnceTmgRptBndsRngHiCmprtr(supplyrequestoccurrencetimingrepeatboundsrangehighcomparator.toCode());

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangehigh.hasCode()) {
			s.setSpplyRqstOccrnceTmgRptBndsRngHiCd(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangehigh.hasSystem()) {
			s.setSpplyRqstOccrnceTmgRptBndsRngHiSys(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeatboundsrangehigh.hasUnit()) {
			s.setSpplyRqstOccrnceTmgRptBndsRngHiUnt(String.valueOf(supplyrequestoccurrencetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasPeriodMax()) {
			s.setSpplyRqstOccrnceTmgRptPrdMx(String.valueOf(supplyrequestoccurrencetimingrepeat.getPeriodMax()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasFrequencyMax()) {
			s.setSpplyRqstOccrnceTmgRptFrqncyMx(String.valueOf(supplyrequestoccurrencetimingrepeat.getFrequencyMax()));
		}
		/******************** supplyrequestoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime supplyrequestoccurrencetimingrepeatperiodunit = supplyrequestoccurrencetimingrepeat.getPeriodUnit();
		s.setSpplyRqstOccrnceTmgRptPrdUnt(supplyrequestoccurrencetimingrepeatperiodunit.toCode());

		/******************** SpplyRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(supplyrequestoccurrencetimingrepeat.hasDurationMax()) {
			s.setSpplyRqstOccrnceTmgRptDurationMx(String.valueOf(supplyrequestoccurrencetimingrepeat.getDurationMax()));
		}
		/******************** supplyrequestoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime supplyrequestoccurrencetimingrepeatdurationunit = supplyrequestoccurrencetimingrepeat.getDurationUnit();
		s.setSpplyRqstOccrnceTmgRptDurationUnt(supplyrequestoccurrencetimingrepeatdurationunit.toCode());

		/******************** SpplyRqst_AthredOn ********************************************************************************/
		if(supplyrequest.hasAuthoredOn()) {
			s.setSpplyRqstAthredOn(String.valueOf(supplyrequest.getAuthoredOn()));
		}
		/******************** supplyrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestStatus supplyrequeststatus = supplyrequest.getStatus();
		s.setSpplyRqstSts(supplyrequeststatus.toCode());

		/******************** supplyrequestcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestcategory = supplyrequest.getCategory();

		/******************** supplyrequestcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestcategorycoding = supplyrequestcategory.getCodingFirstRep();

		/******************** SpplyRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(supplyrequestcategorycoding.hasDisplay()) {
			s.setSpplyRqstCtgryCdgDsply(String.valueOf(supplyrequestcategorycoding.getDisplay()));
		}
		/******************** SpplyRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestcategorycoding.hasVersion()) {
			s.setSpplyRqstCtgryCdgVrsn(String.valueOf(supplyrequestcategorycoding.getVersion()));
		}
		/******************** SpplyRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(supplyrequestcategorycoding.hasCode()) {
			s.setSpplyRqstCtgryCdgCd(String.valueOf(supplyrequestcategorycoding.getCode()));
		}
		/******************** SpplyRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(supplyrequestcategorycoding.hasSystem()) {
			s.setSpplyRqstCtgryCdgSys(String.valueOf(supplyrequestcategorycoding.getSystem()));
		}
		/******************** SpplyRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestcategorycoding.hasUserSelected()) {
			s.setSpplyRqstCtgryCdgUsrSltd(String.valueOf(supplyrequestcategorycoding.getUserSelected()));
		}
		/******************** SpplyRqst_Ctgry_Txt ********************************************************************************/
		if(supplyrequestcategory.hasText()) {
			s.setSpplyRqstCtgryTxt(String.valueOf(supplyrequestcategory.getText()));
		}
		/******************** SpplyRqst_RsnRfrnc ********************************************************************************/
		if(supplyrequest.hasReasonReference()) {
			s.setSpplyRqstRsnRfrnc(String.valueOf(supplyrequest.getReasonReferenceFirstRep()));
		}
		/******************** supplyrequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestreasoncode = supplyrequest.getReasonCodeFirstRep();

		/******************** supplyrequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestreasoncodecoding = supplyrequestreasoncode.getCodingFirstRep();

		/******************** SpplyRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(supplyrequestreasoncodecoding.hasDisplay()) {
			s.setSpplyRqstRsnCdCdgDsply(String.valueOf(supplyrequestreasoncodecoding.getDisplay()));
		}
		/******************** SpplyRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestreasoncodecoding.hasVersion()) {
			s.setSpplyRqstRsnCdCdgVrsn(String.valueOf(supplyrequestreasoncodecoding.getVersion()));
		}
		/******************** SpplyRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(supplyrequestreasoncodecoding.hasCode()) {
			s.setSpplyRqstRsnCdCdgCd(String.valueOf(supplyrequestreasoncodecoding.getCode()));
		}
		/******************** SpplyRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(supplyrequestreasoncodecoding.hasSystem()) {
			s.setSpplyRqstRsnCdCdgSys(String.valueOf(supplyrequestreasoncodecoding.getSystem()));
		}
		/******************** SpplyRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestreasoncodecoding.hasUserSelected()) {
			s.setSpplyRqstRsnCdCdgUsrSltd(String.valueOf(supplyrequestreasoncodecoding.getUserSelected()));
		}
		/******************** SpplyRqst_RsnCd_Txt ********************************************************************************/
		if(supplyrequestreasoncode.hasText()) {
			s.setSpplyRqstRsnCdTxt(String.valueOf(supplyrequestreasoncode.getText()));
		}
		/******************** SpplyRqst_Rqster ********************************************************************************/
		if(supplyrequest.hasRequester()) {
			s.setSpplyRqstRqster(String.valueOf(supplyrequest.getRequester()));
		}
		/******************** SpplyRqst_ItmRfrnc ********************************************************************************/
		if(supplyrequest.hasItemReference()) {
			s.setSpplyRqstItmRfrnc(String.valueOf(supplyrequest.getItemReference()));
		}
		/******************** SpplyRqst_DeliverFrom ********************************************************************************/
		if(supplyrequest.hasDeliverFrom()) {
			s.setSpplyRqstDeliverFrom(String.valueOf(supplyrequest.getDeliverFrom()));
		}
		/******************** SpplyRqst_DeliverTo ********************************************************************************/
		if(supplyrequest.hasDeliverTo()) {
			s.setSpplyRqstDeliverTo(String.valueOf(supplyrequest.getDeliverTo()));
		}
		/******************** supplyrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier supplyrequestidentifier = supplyrequest.getIdentifierFirstRep();

		/******************** SpplyRqst_Id_Vl ********************************************************************************/
		if(supplyrequestidentifier.hasValue()) {
			s.setSpplyRqstIdVl(String.valueOf(supplyrequestidentifier.getValue()));
		}
		/******************** supplyrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestidentifiertype = supplyrequestidentifier.getType();

		/******************** supplyrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestidentifiertypecoding = supplyrequestidentifiertype.getCodingFirstRep();

		/******************** SpplyRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(supplyrequestidentifiertypecoding.hasDisplay()) {
			s.setSpplyRqstIdTypCdgDsply(String.valueOf(supplyrequestidentifiertypecoding.getDisplay()));
		}
		/******************** SpplyRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(supplyrequestidentifiertypecoding.hasVersion()) {
			s.setSpplyRqstIdTypCdgVrsn(String.valueOf(supplyrequestidentifiertypecoding.getVersion()));
		}
		/******************** SpplyRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(supplyrequestidentifiertypecoding.hasCode()) {
			s.setSpplyRqstIdTypCdgCd(String.valueOf(supplyrequestidentifiertypecoding.getCode()));
		}
		/******************** SpplyRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(supplyrequestidentifiertypecoding.hasSystem()) {
			s.setSpplyRqstIdTypCdgSys(String.valueOf(supplyrequestidentifiertypecoding.getSystem()));
		}
		/******************** SpplyRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(supplyrequestidentifiertypecoding.hasUserSelected()) {
			s.setSpplyRqstIdTypCdgUsrSltd(String.valueOf(supplyrequestidentifiertypecoding.getUserSelected()));
		}
		/******************** SpplyRqst_Id_Typ_Txt ********************************************************************************/
		if(supplyrequestidentifiertype.hasText()) {
			s.setSpplyRqstIdTypTxt(String.valueOf(supplyrequestidentifiertype.getText()));
		}
		/******************** SpplyRqst_Id_Sys ********************************************************************************/
		if(supplyrequestidentifier.hasSystem()) {
			s.setSpplyRqstIdSys(String.valueOf(supplyrequestidentifier.getSystem()));
		}
		/******************** SpplyRqst_Id_Assigner ********************************************************************************/
		if(supplyrequestidentifier.hasAssigner()) {
			s.setSpplyRqstIdAssigner(String.valueOf(supplyrequestidentifier.getAssigner()));
		}
		/******************** supplyrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplyrequestidentifierperiod = supplyrequestidentifier.getPeriod();

		/******************** SpplyRqst_Id_Prd_End ********************************************************************************/
		if(supplyrequestidentifierperiod.hasEnd()) {
			s.setSpplyRqstIdPrdEnd(String.valueOf(supplyrequestidentifierperiod.getEnd()));
		}
		/******************** SpplyRqst_Id_Prd_Strt ********************************************************************************/
		if(supplyrequestidentifierperiod.hasStart()) {
			s.setSpplyRqstIdPrdStrt(String.valueOf(supplyrequestidentifierperiod.getStart()));
		}
		/******************** supplyrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse supplyrequestidentifieruse = supplyrequestidentifier.getUse();
		s.setSpplyRqstIdUse(supplyrequestidentifieruse.toCode());

		/******************** supplyrequestquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestquantity = supplyrequest.getQuantity();

		/******************** SpplyRqst_Qnty_Vl ********************************************************************************/
		if(supplyrequestquantity.hasValue()) {
			s.setSpplyRqstQntyVl(String.valueOf(supplyrequestquantity.getValue()));
		}
		/******************** supplyrequestquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator supplyrequestquantitycomparator = supplyrequestquantity.getComparator();
		s.setSpplyRqstQntyCmprtr(supplyrequestquantitycomparator.toCode());

		/******************** SpplyRqst_Qnty_Cd ********************************************************************************/
		if(supplyrequestquantity.hasCode()) {
			s.setSpplyRqstQntyCd(String.valueOf(supplyrequestquantity.getCode()));
		}
		/******************** SpplyRqst_Qnty_Sys ********************************************************************************/
		if(supplyrequestquantity.hasSystem()) {
			s.setSpplyRqstQntySys(String.valueOf(supplyrequestquantity.getSystem()));
		}
		/******************** SpplyRqst_Qnty_Unt ********************************************************************************/
		if(supplyrequestquantity.hasUnit()) {
			s.setSpplyRqstQntyUnt(String.valueOf(supplyrequestquantity.getUnit()));
		}
		return s;
	}
}
