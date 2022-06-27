package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SupplyRequest;
public class SupplyRequestConversion 
{
	public org.hl7.fhir.r4.model.SupplyRequest SupplyRequests(SupplyRequest s) throws ParseException
	{
		org.hl7.fhir.r4.model.SupplyRequest supplyrequest = new org.hl7.fhir.r4.model.SupplyRequest();

		/******************** id ********************************************************************************/
		supplyrequest.setId(s.getId());

		/******************** SpplyRqst_AthredOn ********************************************************************************/
		if(s.getSpplyRqstAthredOn() != null) {
			java.text.SimpleDateFormat SpplyRqst_AthredOnsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyRqst_AthredOndate = SpplyRqst_AthredOnsdf.parse(s.getSpplyRqstAthredOn());
			supplyrequest.setAuthoredOn(SpplyRqst_AthredOndate);
		}
		/******************** supplyrequestcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplyrequest.setCategory(supplyrequestcategory);

		/******************** supplyrequestcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		supplyrequestcategory.addCoding(supplyrequestcategorycoding);

		/******************** SpplyRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgCd() != null) {
			supplyrequestcategorycoding.setCode(s.getSpplyRqstCtgryCdgCd());
		}
		/******************** SpplyRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgDsply() != null) {
			supplyrequestcategorycoding.setDisplay(s.getSpplyRqstCtgryCdgDsply());
		}
		/******************** SpplyRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgSys() != null) {
			supplyrequestcategorycoding.setSystem(s.getSpplyRqstCtgryCdgSys());
		}
		/******************** SpplyRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgUsrSltd() != null) {
			supplyrequestcategorycoding.setUserSelected(Boolean.parseBoolean(s.getSpplyRqstCtgryCdgUsrSltd()));
		}
		/******************** SpplyRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstCtgryCdgVrsn() != null) {
			supplyrequestcategorycoding.setVersion(s.getSpplyRqstCtgryCdgVrsn());
		}
		/******************** SpplyRqst_Ctgry_Txt ********************************************************************************/
		if(s.getSpplyRqstCtgryTxt() != null) {
			supplyrequestcategory.setText(s.getSpplyRqstCtgryTxt());
		}
		/******************** SpplyRqst_DeliverFrom ********************************************************************************/
		if(s.getSpplyRqstDeliverFrom() != null) {
			supplyrequest.setDeliverFrom( new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstDeliverFrom()));
		}
		/******************** SpplyRqst_DeliverTo ********************************************************************************/
		if(s.getSpplyRqstDeliverTo() != null) {
			supplyrequest.setDeliverTo( new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstDeliverTo()));
		}
		/******************** supplyrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier supplyrequestidentifier =  new org.hl7.fhir.r4.model.Identifier();
		supplyrequest.addIdentifier(supplyrequestidentifier);

		/******************** SpplyRqst_Id_Assigner ********************************************************************************/
		if(s.getSpplyRqstIdAssigner() != null) {
			supplyrequestidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstIdAssigner()));
		}
		/******************** supplyrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplyrequestidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		supplyrequestidentifier.setPeriod(supplyrequestidentifierperiod);

		/******************** SpplyRqst_Id_Prd_End ********************************************************************************/
		if(s.getSpplyRqstIdPrdEnd() != null) {
			java.text.SimpleDateFormat SpplyRqst_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyRqst_Id_Prd_Enddate = SpplyRqst_Id_Prd_Endsdf.parse(s.getSpplyRqstIdPrdEnd());
			supplyrequestidentifierperiod.setEnd(SpplyRqst_Id_Prd_Enddate);
		}
		/******************** SpplyRqst_Id_Prd_Strt ********************************************************************************/
		if(s.getSpplyRqstIdPrdStrt() != null) {
			java.text.SimpleDateFormat SpplyRqst_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyRqst_Id_Prd_Strtdate = SpplyRqst_Id_Prd_Strtsdf.parse(s.getSpplyRqstIdPrdStrt());
			supplyrequestidentifierperiod.setStart(SpplyRqst_Id_Prd_Strtdate);
		}
		/******************** SpplyRqst_Id_Sys ********************************************************************************/
		if(s.getSpplyRqstIdSys() != null) {
			supplyrequestidentifier.setSystem(s.getSpplyRqstIdSys());
		}
		/******************** supplyrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplyrequestidentifier.setType(supplyrequestidentifiertype);

		/******************** supplyrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		supplyrequestidentifiertype.addCoding(supplyrequestidentifiertypecoding);

		/******************** SpplyRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgCd() != null) {
			supplyrequestidentifiertypecoding.setCode(s.getSpplyRqstIdTypCdgCd());
		}
		/******************** SpplyRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgDsply() != null) {
			supplyrequestidentifiertypecoding.setDisplay(s.getSpplyRqstIdTypCdgDsply());
		}
		/******************** SpplyRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgSys() != null) {
			supplyrequestidentifiertypecoding.setSystem(s.getSpplyRqstIdTypCdgSys());
		}
		/******************** SpplyRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgUsrSltd() != null) {
			supplyrequestidentifiertypecoding.setUserSelected(Boolean.parseBoolean(s.getSpplyRqstIdTypCdgUsrSltd()));
		}
		/******************** SpplyRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstIdTypCdgVrsn() != null) {
			supplyrequestidentifiertypecoding.setVersion(s.getSpplyRqstIdTypCdgVrsn());
		}
		/******************** SpplyRqst_Id_Typ_Txt ********************************************************************************/
		if(s.getSpplyRqstIdTypTxt() != null) {
			supplyrequestidentifiertype.setText(s.getSpplyRqstIdTypTxt());
		}
		/******************** supplyrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory supplyrequestidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		supplyrequestidentifier.setUse(supplyrequestidentifieruse.fromCode(s.getSpplyRqstIdUse()));

		/******************** SpplyRqst_Id_Vl ********************************************************************************/
		if(s.getSpplyRqstIdVl() != null) {
			supplyrequestidentifier.setValue(s.getSpplyRqstIdVl());
		}
		/******************** supplyrequestitemcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestitemcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplyrequest.setItem(supplyrequestitemcodeableconcept);

		/******************** supplyrequestitemcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestitemcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		supplyrequestitemcodeableconcept.addCoding(supplyrequestitemcodeableconceptcoding);

		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgCd() != null) {
			supplyrequestitemcodeableconceptcoding.setCode(s.getSpplyRqstItmCdbleCncptCdgCd());
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgDsply() != null) {
			supplyrequestitemcodeableconceptcoding.setDisplay(s.getSpplyRqstItmCdbleCncptCdgDsply());
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgSys() != null) {
			supplyrequestitemcodeableconceptcoding.setSystem(s.getSpplyRqstItmCdbleCncptCdgSys());
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgUsrSltd() != null) {
			supplyrequestitemcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSpplyRqstItmCdbleCncptCdgUsrSltd()));
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptCdgVrsn() != null) {
			supplyrequestitemcodeableconceptcoding.setVersion(s.getSpplyRqstItmCdbleCncptCdgVrsn());
		}
		/******************** SpplyRqst_ItmCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpplyRqstItmCdbleCncptTxt() != null) {
			supplyrequestitemcodeableconcept.setText(s.getSpplyRqstItmCdbleCncptTxt());
		}
		/******************** SpplyRqst_ItmRfrnc ********************************************************************************/
		if(s.getSpplyRqstItmRfrnc() != null) {
			supplyrequest.setItem( new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstItmRfrnc()));
		}
		/******************** SpplyRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(s.getSpplyRqstOccrnceDtTimeTyp() != null) {
			supplyrequest.setOccurrence( new org.hl7.fhir.r4.model.DateTimeType(s.getSpplyRqstOccrnceDtTimeTyp()));
		}
		/******************** supplyrequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplyrequestoccurrenceperiod =  new org.hl7.fhir.r4.model.Period();
		supplyrequest.setOccurrence(supplyrequestoccurrenceperiod);

		/******************** SpplyRqst_OccrncePrd_End ********************************************************************************/
		if(s.getSpplyRqstOccrncePrdEnd() != null) {
			java.text.SimpleDateFormat SpplyRqst_OccrncePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyRqst_OccrncePrd_Enddate = SpplyRqst_OccrncePrd_Endsdf.parse(s.getSpplyRqstOccrncePrdEnd());
			supplyrequestoccurrenceperiod.setEnd(SpplyRqst_OccrncePrd_Enddate);
		}
		/******************** SpplyRqst_OccrncePrd_Strt ********************************************************************************/
		if(s.getSpplyRqstOccrncePrdStrt() != null) {
			java.text.SimpleDateFormat SpplyRqst_OccrncePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyRqst_OccrncePrd_Strtdate = SpplyRqst_OccrncePrd_Strtsdf.parse(s.getSpplyRqstOccrncePrdStrt());
			supplyrequestoccurrenceperiod.setStart(SpplyRqst_OccrncePrd_Strtdate);
		}
		/******************** supplyrequestoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing supplyrequestoccurrencetiming =  new org.hl7.fhir.r4.model.Timing();
		supplyrequest.setOccurrence(supplyrequestoccurrencetiming);

		/******************** supplyrequestoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestoccurrencetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplyrequestoccurrencetiming.setCode(supplyrequestoccurrencetimingcode);

		/******************** supplyrequestoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestoccurrencetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		supplyrequestoccurrencetimingcode.addCoding(supplyrequestoccurrencetimingcodecoding);

		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgCd() != null) {
			supplyrequestoccurrencetimingcodecoding.setCode(s.getSpplyRqstOccrnceTmgCdCdgCd());
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgDsply() != null) {
			supplyrequestoccurrencetimingcodecoding.setDisplay(s.getSpplyRqstOccrnceTmgCdCdgDsply());
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgSys() != null) {
			supplyrequestoccurrencetimingcodecoding.setSystem(s.getSpplyRqstOccrnceTmgCdCdgSys());
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgUsrSltd() != null) {
			supplyrequestoccurrencetimingcodecoding.setUserSelected(Boolean.parseBoolean(s.getSpplyRqstOccrnceTmgCdCdgUsrSltd()));
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdCdgVrsn() != null) {
			supplyrequestoccurrencetimingcodecoding.setVersion(s.getSpplyRqstOccrnceTmgCdCdgVrsn());
		}
		/******************** SpplyRqst_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgCdTxt() != null) {
			supplyrequestoccurrencetimingcode.setText(s.getSpplyRqstOccrnceTmgCdTxt());
		}
		/******************** SpplyRqst_OccrnceTmg_Evnt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgEvnt() != null) {
			java.text.SimpleDateFormat SpplyRqst_OccrnceTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyRqst_OccrnceTmg_Evntdate = SpplyRqst_OccrnceTmg_Evntsdf.parse(s.getSpplyRqstOccrnceTmgEvnt());
			supplyrequestoccurrencetiming.addEvent(SpplyRqst_OccrnceTmg_Evntdate);
		}
		/******************** supplyrequestoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent supplyrequestoccurrencetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		supplyrequestoccurrencetiming.setRepeat(supplyrequestoccurrencetimingrepeat);

		/******************** supplyrequestoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration supplyrequestoccurrencetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		supplyrequestoccurrencetimingrepeat.setBounds(supplyrequestoccurrencetimingrepeatboundsduration);

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsDurationCd() != null) {
			supplyrequestoccurrencetimingrepeatboundsduration.setCode(s.getSpplyRqstOccrnceTmgRptBndsDurationCd());
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplyrequestoccurrencetimingrepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplyrequestoccurrencetimingrepeatboundsduration.setComparator(supplyrequestoccurrencetimingrepeatboundsdurationcomparator.fromCode(s.getSpplyRqstOccrnceTmgRptBndsDurationCmprtr()));

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsDurationSys() != null) {
			supplyrequestoccurrencetimingrepeatboundsduration.setSystem(s.getSpplyRqstOccrnceTmgRptBndsDurationSys());
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsDurationUnt() != null) {
			supplyrequestoccurrencetimingrepeatboundsduration.setUnit(s.getSpplyRqstOccrnceTmgRptBndsDurationUnt());
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsDurationVl() != null) {
			supplyrequestoccurrencetimingrepeatboundsduration.setValue(Double.parseDouble((s.getSpplyRqstOccrnceTmgRptBndsDurationVl())));
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period supplyrequestoccurrencetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		supplyrequestoccurrencetimingrepeat.setBounds(supplyrequestoccurrencetimingrepeatboundsperiod);

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Enddate = SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Endsdf.parse(s.getSpplyRqstOccrnceTmgRptBndsPrdEnd());
			supplyrequestoccurrencetimingrepeatboundsperiod.setEnd(SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Strtdate = SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Strtsdf.parse(s.getSpplyRqstOccrnceTmgRptBndsPrdStrt());
			supplyrequestoccurrencetimingrepeatboundsperiod.setStart(SpplyRqst_OccrnceTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range supplyrequestoccurrencetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		supplyrequestoccurrencetimingrepeat.setBounds(supplyrequestoccurrencetimingrepeatboundsrange);

		/******************** supplyrequestoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestoccurrencetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		supplyrequestoccurrencetimingrepeatboundsrange.setHigh(supplyrequestoccurrencetimingrepeatboundsrangehigh);

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngHiCd() != null) {
			supplyrequestoccurrencetimingrepeatboundsrangehigh.setCode(s.getSpplyRqstOccrnceTmgRptBndsRngHiCd());
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplyrequestoccurrencetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplyrequestoccurrencetimingrepeatboundsrangehigh.setComparator(supplyrequestoccurrencetimingrepeatboundsrangehighcomparator.fromCode(s.getSpplyRqstOccrnceTmgRptBndsRngHiCmprtr()));

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngHiSys() != null) {
			supplyrequestoccurrencetimingrepeatboundsrangehigh.setSystem(s.getSpplyRqstOccrnceTmgRptBndsRngHiSys());
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngHiUnt() != null) {
			supplyrequestoccurrencetimingrepeatboundsrangehigh.setUnit(s.getSpplyRqstOccrnceTmgRptBndsRngHiUnt());
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngHiVl() != null) {
			supplyrequestoccurrencetimingrepeatboundsrangehigh.setValue(Double.parseDouble((s.getSpplyRqstOccrnceTmgRptBndsRngHiVl())));
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestoccurrencetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		supplyrequestoccurrencetimingrepeatboundsrange.setLow(supplyrequestoccurrencetimingrepeatboundsrangelow);

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngLwCd() != null) {
			supplyrequestoccurrencetimingrepeatboundsrangelow.setCode(s.getSpplyRqstOccrnceTmgRptBndsRngLwCd());
		}
		/******************** supplyrequestoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplyrequestoccurrencetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplyrequestoccurrencetimingrepeatboundsrangelow.setComparator(supplyrequestoccurrencetimingrepeatboundsrangelowcomparator.fromCode(s.getSpplyRqstOccrnceTmgRptBndsRngLwCmprtr()));

		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngLwSys() != null) {
			supplyrequestoccurrencetimingrepeatboundsrangelow.setSystem(s.getSpplyRqstOccrnceTmgRptBndsRngLwSys());
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngLwUnt() != null) {
			supplyrequestoccurrencetimingrepeatboundsrangelow.setUnit(s.getSpplyRqstOccrnceTmgRptBndsRngLwUnt());
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptBndsRngLwVl() != null) {
			supplyrequestoccurrencetimingrepeatboundsrangelow.setValue(Double.parseDouble((s.getSpplyRqstOccrnceTmgRptBndsRngLwVl())));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptCnt() != null) {
			supplyrequestoccurrencetimingrepeat.setCount(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptCnt()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptCntMx() != null) {
			supplyrequestoccurrencetimingrepeat.setCountMax(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptCntMx()));
		}
		/******************** supplyrequestoccurrencetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory supplyrequestoccurrencetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		supplyrequestoccurrencetimingrepeat.addDayOfWeek(supplyrequestoccurrencetimingrepeatdayofweek.fromCode(s.getSpplyRqstOccrnceTmgRptDayOfWeek()));

		/******************** SpplyRqst_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptDuration() != null) {
			supplyrequestoccurrencetimingrepeat.setDuration(Double.parseDouble((s.getSpplyRqstOccrnceTmgRptDuration())));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptDurationMx() != null) {
			supplyrequestoccurrencetimingrepeat.setDurationMax(Double.parseDouble((s.getSpplyRqstOccrnceTmgRptDurationMx())));
		}
		/******************** supplyrequestoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory supplyrequestoccurrencetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		supplyrequestoccurrencetimingrepeat.setDurationUnit(supplyrequestoccurrencetimingrepeatdurationunit.fromCode(s.getSpplyRqstOccrnceTmgRptDurationUnt()));

		/******************** SpplyRqst_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptFrqncy() != null) {
			supplyrequestoccurrencetimingrepeat.setFrequency(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptFrqncy()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptFrqncyMx() != null) {
			supplyrequestoccurrencetimingrepeat.setFrequencyMax(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptFrqncyMx()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptOff() != null) {
			supplyrequestoccurrencetimingrepeat.setOffset(Integer.parseInt(s.getSpplyRqstOccrnceTmgRptOff()));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptPrd() != null) {
			supplyrequestoccurrencetimingrepeat.setPeriod(Double.parseDouble((s.getSpplyRqstOccrnceTmgRptPrd())));
		}
		/******************** SpplyRqst_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptPrdMx() != null) {
			supplyrequestoccurrencetimingrepeat.setPeriodMax(new java.math.BigDecimal((s.getSpplyRqstOccrnceTmgRptPrdMx())));
		}
		/******************** supplyrequestoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory supplyrequestoccurrencetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		supplyrequestoccurrencetimingrepeat.setPeriodUnit(supplyrequestoccurrencetimingrepeatperiodunit.fromCode(s.getSpplyRqstOccrnceTmgRptPrdUnt()));

		/******************** SpplyRqst_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(s.getSpplyRqstOccrnceTmgRptTimeOfDay() != null) {
			supplyrequestoccurrencetimingrepeat.addTimeOfDay(s.getSpplyRqstOccrnceTmgRptTimeOfDay());
		}
		/******************** supplyrequestoccurrencetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory supplyrequestoccurrencetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		supplyrequestoccurrencetimingrepeat.addWhen(supplyrequestoccurrencetimingrepeatwhen.fromCode(s.getSpplyRqstOccrnceTmgRptWhen()));

		/******************** supplyrequestparameter ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestParameterComponent supplyrequestparameter =  new org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestParameterComponent();
		supplyrequest.addParameter(supplyrequestparameter);

		/******************** supplyrequestparametercode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestparametercode =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplyrequestparameter.setCode(supplyrequestparametercode);

		/******************** supplyrequestparametercodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestparametercodecoding =  new org.hl7.fhir.r4.model.Coding();
		supplyrequestparametercode.addCoding(supplyrequestparametercodecoding);

		/******************** SpplyRqst_Prmtr_Cd_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgCd() != null) {
			supplyrequestparametercodecoding.setCode(s.getSpplyRqstPrmtrCdCdgCd());
		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgDsply() != null) {
			supplyrequestparametercodecoding.setDisplay(s.getSpplyRqstPrmtrCdCdgDsply());
		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgSys() != null) {
			supplyrequestparametercodecoding.setSystem(s.getSpplyRqstPrmtrCdCdgSys());
		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgUsrSltd() != null) {
			supplyrequestparametercodecoding.setUserSelected(Boolean.parseBoolean(s.getSpplyRqstPrmtrCdCdgUsrSltd()));
		}
		/******************** SpplyRqst_Prmtr_Cd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdCdgVrsn() != null) {
			supplyrequestparametercodecoding.setVersion(s.getSpplyRqstPrmtrCdCdgVrsn());
		}
		/******************** SpplyRqst_Prmtr_Cd_Txt ********************************************************************************/
		if(s.getSpplyRqstPrmtrCdTxt() != null) {
			supplyrequestparametercode.setText(s.getSpplyRqstPrmtrCdTxt());
		}
		/******************** SpplyRqst_Prmtr_VlBooleanTyp ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlBooleanTyp() != null) {
			supplyrequestparameter.setValue( new org.hl7.fhir.r4.model.BooleanType(s.getSpplyRqstPrmtrVlBooleanTyp()));
		}
		/******************** supplyrequestparametervaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestparametervaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplyrequestparameter.setValue(supplyrequestparametervaluecodeableconcept);

		/******************** supplyrequestparametervaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestparametervaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		supplyrequestparametervaluecodeableconcept.addCoding(supplyrequestparametervaluecodeableconceptcoding);

		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgCd() != null) {
			supplyrequestparametervaluecodeableconceptcoding.setCode(s.getSpplyRqstPrmtrVlCdbleCncptCdgCd());
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgDsply() != null) {
			supplyrequestparametervaluecodeableconceptcoding.setDisplay(s.getSpplyRqstPrmtrVlCdbleCncptCdgDsply());
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgSys() != null) {
			supplyrequestparametervaluecodeableconceptcoding.setSystem(s.getSpplyRqstPrmtrVlCdbleCncptCdgSys());
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd() != null) {
			supplyrequestparametervaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSpplyRqstPrmtrVlCdbleCncptCdgUsrSltd()));
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptCdgVrsn() != null) {
			supplyrequestparametervaluecodeableconceptcoding.setVersion(s.getSpplyRqstPrmtrVlCdbleCncptCdgVrsn());
		}
		/******************** SpplyRqst_Prmtr_VlCdbleCncpt_Txt ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlCdbleCncptTxt() != null) {
			supplyrequestparametervaluecodeableconcept.setText(s.getSpplyRqstPrmtrVlCdbleCncptTxt());
		}
		/******************** supplyrequestparametervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestparametervaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		supplyrequestparameter.setValue(supplyrequestparametervaluequantity);

		/******************** SpplyRqst_Prmtr_VlQnty_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlQntyCd() != null) {
			supplyrequestparametervaluequantity.setCode(s.getSpplyRqstPrmtrVlQntyCd());
		}
		/******************** supplyrequestparametervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplyrequestparametervaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplyrequestparametervaluequantity.setComparator(supplyrequestparametervaluequantitycomparator.fromCode(s.getSpplyRqstPrmtrVlQntyCmprtr()));

		/******************** SpplyRqst_Prmtr_VlQnty_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlQntySys() != null) {
			supplyrequestparametervaluequantity.setSystem(s.getSpplyRqstPrmtrVlQntySys());
		}
		/******************** SpplyRqst_Prmtr_VlQnty_Unt ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlQntyUnt() != null) {
			supplyrequestparametervaluequantity.setUnit(s.getSpplyRqstPrmtrVlQntyUnt());
		}
		/******************** SpplyRqst_Prmtr_VlQnty_Vl ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlQntyVl() != null) {
			supplyrequestparametervaluequantity.setValue(Double.parseDouble((s.getSpplyRqstPrmtrVlQntyVl())));
		}
		/******************** supplyrequestparametervaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range supplyrequestparametervaluerange =  new org.hl7.fhir.r4.model.Range();
		supplyrequestparameter.setValue(supplyrequestparametervaluerange);

		/******************** supplyrequestparametervaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestparametervaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		supplyrequestparametervaluerange.setHigh(supplyrequestparametervaluerangehigh);

		/******************** SpplyRqst_Prmtr_VlRng_Hi_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngHiCd() != null) {
			supplyrequestparametervaluerangehigh.setCode(s.getSpplyRqstPrmtrVlRngHiCd());
		}
		/******************** supplyrequestparametervaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplyrequestparametervaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplyrequestparametervaluerangehigh.setComparator(supplyrequestparametervaluerangehighcomparator.fromCode(s.getSpplyRqstPrmtrVlRngHiCmprtr()));

		/******************** SpplyRqst_Prmtr_VlRng_Hi_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngHiSys() != null) {
			supplyrequestparametervaluerangehigh.setSystem(s.getSpplyRqstPrmtrVlRngHiSys());
		}
		/******************** SpplyRqst_Prmtr_VlRng_Hi_Unt ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngHiUnt() != null) {
			supplyrequestparametervaluerangehigh.setUnit(s.getSpplyRqstPrmtrVlRngHiUnt());
		}
		/******************** SpplyRqst_Prmtr_VlRng_Hi_Vl ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngHiVl() != null) {
			supplyrequestparametervaluerangehigh.setValue(Double.parseDouble((s.getSpplyRqstPrmtrVlRngHiVl())));
		}
		/******************** supplyrequestparametervaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestparametervaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		supplyrequestparametervaluerange.setLow(supplyrequestparametervaluerangelow);

		/******************** SpplyRqst_Prmtr_VlRng_Lw_Cd ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngLwCd() != null) {
			supplyrequestparametervaluerangelow.setCode(s.getSpplyRqstPrmtrVlRngLwCd());
		}
		/******************** supplyrequestparametervaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplyrequestparametervaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplyrequestparametervaluerangelow.setComparator(supplyrequestparametervaluerangelowcomparator.fromCode(s.getSpplyRqstPrmtrVlRngLwCmprtr()));

		/******************** SpplyRqst_Prmtr_VlRng_Lw_Sys ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngLwSys() != null) {
			supplyrequestparametervaluerangelow.setSystem(s.getSpplyRqstPrmtrVlRngLwSys());
		}
		/******************** SpplyRqst_Prmtr_VlRng_Lw_Unt ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngLwUnt() != null) {
			supplyrequestparametervaluerangelow.setUnit(s.getSpplyRqstPrmtrVlRngLwUnt());
		}
		/******************** SpplyRqst_Prmtr_VlRng_Lw_Vl ********************************************************************************/
		if(s.getSpplyRqstPrmtrVlRngLwVl() != null) {
			supplyrequestparametervaluerangelow.setValue(Double.parseDouble((s.getSpplyRqstPrmtrVlRngLwVl())));
		}
		/******************** supplyrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyRequest.RequestPriorityEnumFactory supplyrequestpriority =  new org.hl7.fhir.r4.model.SupplyRequest.RequestPriorityEnumFactory();
		supplyrequest.setPriority(supplyrequestpriority.fromCode(s.getSpplyRqstPriority()));

		/******************** supplyrequestquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity supplyrequestquantity =  new org.hl7.fhir.r4.model.Quantity();
		supplyrequest.setQuantity(supplyrequestquantity);

		/******************** SpplyRqst_Qnty_Cd ********************************************************************************/
		if(s.getSpplyRqstQntyCd() != null) {
			supplyrequestquantity.setCode(s.getSpplyRqstQntyCd());
		}
		/******************** supplyrequestquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory supplyrequestquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		supplyrequestquantity.setComparator(supplyrequestquantitycomparator.fromCode(s.getSpplyRqstQntyCmprtr()));

		/******************** SpplyRqst_Qnty_Sys ********************************************************************************/
		if(s.getSpplyRqstQntySys() != null) {
			supplyrequestquantity.setSystem(s.getSpplyRqstQntySys());
		}
		/******************** SpplyRqst_Qnty_Unt ********************************************************************************/
		if(s.getSpplyRqstQntyUnt() != null) {
			supplyrequestquantity.setUnit(s.getSpplyRqstQntyUnt());
		}
		/******************** SpplyRqst_Qnty_Vl ********************************************************************************/
		if(s.getSpplyRqstQntyVl() != null) {
			supplyrequestquantity.setValue(Double.parseDouble((s.getSpplyRqstQntyVl())));
		}
		/******************** supplyrequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept supplyrequestreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		supplyrequest.addReasonCode(supplyrequestreasoncode);

		/******************** supplyrequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding supplyrequestreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		supplyrequestreasoncode.addCoding(supplyrequestreasoncodecoding);

		/******************** SpplyRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgCd() != null) {
			supplyrequestreasoncodecoding.setCode(s.getSpplyRqstRsnCdCdgCd());
		}
		/******************** SpplyRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgDsply() != null) {
			supplyrequestreasoncodecoding.setDisplay(s.getSpplyRqstRsnCdCdgDsply());
		}
		/******************** SpplyRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgSys() != null) {
			supplyrequestreasoncodecoding.setSystem(s.getSpplyRqstRsnCdCdgSys());
		}
		/******************** SpplyRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgUsrSltd() != null) {
			supplyrequestreasoncodecoding.setUserSelected(Boolean.parseBoolean(s.getSpplyRqstRsnCdCdgUsrSltd()));
		}
		/******************** SpplyRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(s.getSpplyRqstRsnCdCdgVrsn() != null) {
			supplyrequestreasoncodecoding.setVersion(s.getSpplyRqstRsnCdCdgVrsn());
		}
		/******************** SpplyRqst_RsnCd_Txt ********************************************************************************/
		if(s.getSpplyRqstRsnCdTxt() != null) {
			supplyrequestreasoncode.setText(s.getSpplyRqstRsnCdTxt());
		}
		/******************** SpplyRqst_RsnRfrnc ********************************************************************************/
		if(s.getSpplyRqstRsnRfrnc() != null) {
			supplyrequest.addReasonReference( new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstRsnRfrnc()));
		}
		/******************** SpplyRqst_Rqster ********************************************************************************/
		if(s.getSpplyRqstRqster() != null) {
			supplyrequest.setRequester( new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstRqster()));
		}
		/******************** supplyrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestStatusEnumFactory supplyrequeststatus =  new org.hl7.fhir.r4.model.SupplyRequest.SupplyRequestStatusEnumFactory();
		supplyrequest.setStatus(supplyrequeststatus.fromCode(s.getSpplyRqstSts()));

		/******************** SpplyRqst_Supplier ********************************************************************************/
		if(s.getSpplyRqstSupplier() != null) {
			supplyrequest.addSupplier( new org.hl7.fhir.r4.model.Reference(s.getSpplyRqstSupplier()));
		}
		return supplyrequest;
	}
}
