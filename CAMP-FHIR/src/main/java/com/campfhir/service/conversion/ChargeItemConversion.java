package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ChargeItem;
public class ChargeItemConversion 
{
	public org.hl7.fhir.r4.model.ChargeItem ChargeItems(ChargeItem c) throws ParseException
	{
		org.hl7.fhir.r4.model.ChargeItem chargeitem = new org.hl7.fhir.r4.model.ChargeItem();

		/******************** id ********************************************************************************/
		chargeitem.setId(c.getId());

		/******************** ChrgItm_Account ********************************************************************************/
		if(c.getChrgItmAccount() != null) {
			chargeitem.addAccount( new org.hl7.fhir.r4.model.Reference(c.getChrgItmAccount()));
		}
		/******************** chargeitembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitembodysite =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitem.addBodysite(chargeitembodysite);

		/******************** chargeitembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitembodysitecoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitembodysite.addCoding(chargeitembodysitecoding);

		/******************** ChrgItm_Bodysite_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmBodysiteCdgCd() != null) {
			chargeitembodysitecoding.setCode(c.getChrgItmBodysiteCdgCd());
		}
		/******************** ChrgItm_Bodysite_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmBodysiteCdgDsply() != null) {
			chargeitembodysitecoding.setDisplay(c.getChrgItmBodysiteCdgDsply());
		}
		/******************** ChrgItm_Bodysite_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmBodysiteCdgSys() != null) {
			chargeitembodysitecoding.setSystem(c.getChrgItmBodysiteCdgSys());
		}
		/******************** ChrgItm_Bodysite_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmBodysiteCdgUsrSltd() != null) {
			chargeitembodysitecoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmBodysiteCdgUsrSltd()));
		}
		/******************** ChrgItm_Bodysite_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmBodysiteCdgVrsn() != null) {
			chargeitembodysitecoding.setVersion(c.getChrgItmBodysiteCdgVrsn());
		}
		/******************** ChrgItm_Bodysite_Txt ********************************************************************************/
		if(c.getChrgItmBodysiteTxt() != null) {
			chargeitembodysite.setText(c.getChrgItmBodysiteTxt());
		}
		/******************** chargeitemcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitem.setCode(chargeitemcode);

		/******************** chargeitemcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemcodecoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemcode.addCoding(chargeitemcodecoding);

		/******************** ChrgItm_Cd_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmCdCdgCd() != null) {
			chargeitemcodecoding.setCode(c.getChrgItmCdCdgCd());
		}
		/******************** ChrgItm_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmCdCdgDsply() != null) {
			chargeitemcodecoding.setDisplay(c.getChrgItmCdCdgDsply());
		}
		/******************** ChrgItm_Cd_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmCdCdgSys() != null) {
			chargeitemcodecoding.setSystem(c.getChrgItmCdCdgSys());
		}
		/******************** ChrgItm_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmCdCdgUsrSltd() != null) {
			chargeitemcodecoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmCdCdgUsrSltd()));
		}
		/******************** ChrgItm_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmCdCdgVrsn() != null) {
			chargeitemcodecoding.setVersion(c.getChrgItmCdCdgVrsn());
		}
		/******************** ChrgItm_Cd_Txt ********************************************************************************/
		if(c.getChrgItmCdTxt() != null) {
			chargeitemcode.setText(c.getChrgItmCdTxt());
		}
		/******************** ChrgItm_Cntxt ********************************************************************************/
		if(c.getChrgItmCntxt() != null) {
			chargeitem.setContext( new org.hl7.fhir.r4.model.Reference(c.getChrgItmCntxt()));
		}
		/******************** ChrgItm_CstCenter ********************************************************************************/
		if(c.getChrgItmCstCenter() != null) {
			chargeitem.setCostCenter( new org.hl7.fhir.r4.model.Reference(c.getChrgItmCstCenter()));
		}
		/******************** ChrgItm_DfnCanonical ********************************************************************************/
		if(c.getChrgItmDfnCanonical() != null) {
			chargeitem.addDefinitionCanonical(c.getChrgItmDfnCanonical());
		}
		/******************** ChrgItm_DfnUri ********************************************************************************/
		if(c.getChrgItmDfnUri() != null) {
			chargeitem.addDefinitionUri(c.getChrgItmDfnUri());
		}
		/******************** ChrgItm_EnteredDt ********************************************************************************/
		if(c.getChrgItmEnteredDt() != null) {
			java.text.SimpleDateFormat ChrgItm_EnteredDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItm_EnteredDtdate = ChrgItm_EnteredDtsdf.parse(c.getChrgItmEnteredDt());
			chargeitem.setEnteredDate(ChrgItm_EnteredDtdate);
		}
		/******************** ChrgItm_Enterer ********************************************************************************/
		if(c.getChrgItmEnterer() != null) {
			chargeitem.setEnterer( new org.hl7.fhir.r4.model.Reference(c.getChrgItmEnterer()));
		}
		/******************** ChrgItm_FactorOverride ********************************************************************************/
		if(c.getChrgItmFactorOverride() != null) {
			chargeitem.setFactorOverride(new java.math.BigDecimal((c.getChrgItmFactorOverride())));
		}
		/******************** chargeitemidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier chargeitemidentifier =  new org.hl7.fhir.r4.model.Identifier();
		chargeitem.addIdentifier(chargeitemidentifier);

		/******************** ChrgItm_Id_Assigner ********************************************************************************/
		if(c.getChrgItmIdAssigner() != null) {
			chargeitemidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getChrgItmIdAssigner()));
		}
		/******************** chargeitemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		chargeitemidentifier.setPeriod(chargeitemidentifierperiod);

		/******************** ChrgItm_Id_Prd_End ********************************************************************************/
		if(c.getChrgItmIdPrdEnd() != null) {
			java.text.SimpleDateFormat ChrgItm_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItm_Id_Prd_Enddate = ChrgItm_Id_Prd_Endsdf.parse(c.getChrgItmIdPrdEnd());
			chargeitemidentifierperiod.setEnd(ChrgItm_Id_Prd_Enddate);
		}
		/******************** ChrgItm_Id_Prd_Strt ********************************************************************************/
		if(c.getChrgItmIdPrdStrt() != null) {
			java.text.SimpleDateFormat ChrgItm_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItm_Id_Prd_Strtdate = ChrgItm_Id_Prd_Strtsdf.parse(c.getChrgItmIdPrdStrt());
			chargeitemidentifierperiod.setStart(ChrgItm_Id_Prd_Strtdate);
		}
		/******************** ChrgItm_Id_Sys ********************************************************************************/
		if(c.getChrgItmIdSys() != null) {
			chargeitemidentifier.setSystem(c.getChrgItmIdSys());
		}
		/******************** chargeitemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitemidentifier.setType(chargeitemidentifiertype);

		/******************** chargeitemidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemidentifiertype.addCoding(chargeitemidentifiertypecoding);

		/******************** ChrgItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmIdTypCdgCd() != null) {
			chargeitemidentifiertypecoding.setCode(c.getChrgItmIdTypCdgCd());
		}
		/******************** ChrgItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmIdTypCdgDsply() != null) {
			chargeitemidentifiertypecoding.setDisplay(c.getChrgItmIdTypCdgDsply());
		}
		/******************** ChrgItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmIdTypCdgSys() != null) {
			chargeitemidentifiertypecoding.setSystem(c.getChrgItmIdTypCdgSys());
		}
		/******************** ChrgItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmIdTypCdgUsrSltd() != null) {
			chargeitemidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmIdTypCdgUsrSltd()));
		}
		/******************** ChrgItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmIdTypCdgVrsn() != null) {
			chargeitemidentifiertypecoding.setVersion(c.getChrgItmIdTypCdgVrsn());
		}
		/******************** ChrgItm_Id_Typ_Txt ********************************************************************************/
		if(c.getChrgItmIdTypTxt() != null) {
			chargeitemidentifiertype.setText(c.getChrgItmIdTypTxt());
		}
		/******************** chargeitemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory chargeitemidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		chargeitemidentifier.setUse(chargeitemidentifieruse.fromCode(c.getChrgItmIdUse()));

		/******************** ChrgItm_Id_Vl ********************************************************************************/
		if(c.getChrgItmIdVl() != null) {
			chargeitemidentifier.setValue(c.getChrgItmIdVl());
		}
		/******************** chargeitemnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation chargeitemnote =  new org.hl7.fhir.r4.model.Annotation();
		chargeitem.addNote(chargeitemnote);

		/******************** ChrgItm_Nt_AthrRfrnc ********************************************************************************/
		if(c.getChrgItmNtAthrRfrnc() != null) {
			chargeitemnote.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getChrgItmNtAthrRfrnc()));
		}
		/******************** ChrgItm_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getChrgItmNtAthrStrgTyp() != null) {
			chargeitemnote.setAuthor( new org.hl7.fhir.r4.model.StringType(c.getChrgItmNtAthrStrgTyp()));
		}
		/******************** ChrgItm_Nt_Txt ********************************************************************************/
		if(c.getChrgItmNtTxt() != null) {
			chargeitemnote.setText(c.getChrgItmNtTxt());
		}
		/******************** ChrgItm_Nt_Time ********************************************************************************/
		if(c.getChrgItmNtTime() != null) {
			java.text.SimpleDateFormat ChrgItm_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItm_Nt_Timedate = ChrgItm_Nt_Timesdf.parse(c.getChrgItmNtTime());
			chargeitemnote.setTime(ChrgItm_Nt_Timedate);
		}
		/******************** ChrgItm_OccrnceDtTimeTyp ********************************************************************************/
		if(c.getChrgItmOccrnceDtTimeTyp() != null) {
			chargeitem.setOccurrence( new org.hl7.fhir.r4.model.DateTimeType(c.getChrgItmOccrnceDtTimeTyp()));
		}
		/******************** chargeitemoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemoccurrenceperiod =  new org.hl7.fhir.r4.model.Period();
		chargeitem.setOccurrence(chargeitemoccurrenceperiod);

		/******************** ChrgItm_OccrncePrd_End ********************************************************************************/
		if(c.getChrgItmOccrncePrdEnd() != null) {
			java.text.SimpleDateFormat ChrgItm_OccrncePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItm_OccrncePrd_Enddate = ChrgItm_OccrncePrd_Endsdf.parse(c.getChrgItmOccrncePrdEnd());
			chargeitemoccurrenceperiod.setEnd(ChrgItm_OccrncePrd_Enddate);
		}
		/******************** ChrgItm_OccrncePrd_Strt ********************************************************************************/
		if(c.getChrgItmOccrncePrdStrt() != null) {
			java.text.SimpleDateFormat ChrgItm_OccrncePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItm_OccrncePrd_Strtdate = ChrgItm_OccrncePrd_Strtsdf.parse(c.getChrgItmOccrncePrdStrt());
			chargeitemoccurrenceperiod.setStart(ChrgItm_OccrncePrd_Strtdate);
		}
		/******************** chargeitemoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing chargeitemoccurrencetiming =  new org.hl7.fhir.r4.model.Timing();
		chargeitem.setOccurrence(chargeitemoccurrencetiming);

		/******************** chargeitemoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemoccurrencetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitemoccurrencetiming.setCode(chargeitemoccurrencetimingcode);

		/******************** chargeitemoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemoccurrencetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemoccurrencetimingcode.addCoding(chargeitemoccurrencetimingcodecoding);

		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgCd() != null) {
			chargeitemoccurrencetimingcodecoding.setCode(c.getChrgItmOccrnceTmgCdCdgCd());
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgDsply() != null) {
			chargeitemoccurrencetimingcodecoding.setDisplay(c.getChrgItmOccrnceTmgCdCdgDsply());
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgSys() != null) {
			chargeitemoccurrencetimingcodecoding.setSystem(c.getChrgItmOccrnceTmgCdCdgSys());
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgUsrSltd() != null) {
			chargeitemoccurrencetimingcodecoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmOccrnceTmgCdCdgUsrSltd()));
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgVrsn() != null) {
			chargeitemoccurrencetimingcodecoding.setVersion(c.getChrgItmOccrnceTmgCdCdgVrsn());
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdTxt() != null) {
			chargeitemoccurrencetimingcode.setText(c.getChrgItmOccrnceTmgCdTxt());
		}
		/******************** ChrgItm_OccrnceTmg_Evnt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgEvnt() != null) {
			java.text.SimpleDateFormat ChrgItm_OccrnceTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItm_OccrnceTmg_Evntdate = ChrgItm_OccrnceTmg_Evntsdf.parse(c.getChrgItmOccrnceTmgEvnt());
			chargeitemoccurrencetiming.addEvent(ChrgItm_OccrnceTmg_Evntdate);
		}
		/******************** chargeitemoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent chargeitemoccurrencetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		chargeitemoccurrencetiming.setRepeat(chargeitemoccurrencetimingrepeat);

		/******************** chargeitemoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration chargeitemoccurrencetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		chargeitemoccurrencetimingrepeat.setBounds(chargeitemoccurrencetimingrepeatboundsduration);

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsDurationCd() != null) {
			chargeitemoccurrencetimingrepeatboundsduration.setCode(c.getChrgItmOccrnceTmgRptBndsDurationCd());
		}
		/******************** chargeitemoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory chargeitemoccurrencetimingrepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		chargeitemoccurrencetimingrepeatboundsduration.setComparator(chargeitemoccurrencetimingrepeatboundsdurationcomparator.fromCode(c.getChrgItmOccrnceTmgRptBndsDurationCmprtr()));

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsDurationSys() != null) {
			chargeitemoccurrencetimingrepeatboundsduration.setSystem(c.getChrgItmOccrnceTmgRptBndsDurationSys());
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsDurationUnt() != null) {
			chargeitemoccurrencetimingrepeatboundsduration.setUnit(c.getChrgItmOccrnceTmgRptBndsDurationUnt());
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsDurationVl() != null) {
			chargeitemoccurrencetimingrepeatboundsduration.setValue(Double.parseDouble((c.getChrgItmOccrnceTmgRptBndsDurationVl())));
		}
		/******************** chargeitemoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemoccurrencetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		chargeitemoccurrencetimingrepeat.setBounds(chargeitemoccurrencetimingrepeatboundsperiod);

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat ChrgItm_OccrnceTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItm_OccrnceTmg_Rpt_BndsPrd_Enddate = ChrgItm_OccrnceTmg_Rpt_BndsPrd_Endsdf.parse(c.getChrgItmOccrnceTmgRptBndsPrdEnd());
			chargeitemoccurrencetimingrepeatboundsperiod.setEnd(ChrgItm_OccrnceTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat ChrgItm_OccrnceTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItm_OccrnceTmg_Rpt_BndsPrd_Strtdate = ChrgItm_OccrnceTmg_Rpt_BndsPrd_Strtsdf.parse(c.getChrgItmOccrnceTmgRptBndsPrdStrt());
			chargeitemoccurrencetimingrepeatboundsperiod.setStart(ChrgItm_OccrnceTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** chargeitemoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range chargeitemoccurrencetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		chargeitemoccurrencetimingrepeat.setBounds(chargeitemoccurrencetimingrepeatboundsrange);

		/******************** chargeitemoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemoccurrencetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		chargeitemoccurrencetimingrepeatboundsrange.setHigh(chargeitemoccurrencetimingrepeatboundsrangehigh);

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngHiCd() != null) {
			chargeitemoccurrencetimingrepeatboundsrangehigh.setCode(c.getChrgItmOccrnceTmgRptBndsRngHiCd());
		}
		/******************** chargeitemoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory chargeitemoccurrencetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		chargeitemoccurrencetimingrepeatboundsrangehigh.setComparator(chargeitemoccurrencetimingrepeatboundsrangehighcomparator.fromCode(c.getChrgItmOccrnceTmgRptBndsRngHiCmprtr()));

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngHiSys() != null) {
			chargeitemoccurrencetimingrepeatboundsrangehigh.setSystem(c.getChrgItmOccrnceTmgRptBndsRngHiSys());
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngHiUnt() != null) {
			chargeitemoccurrencetimingrepeatboundsrangehigh.setUnit(c.getChrgItmOccrnceTmgRptBndsRngHiUnt());
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngHiVl() != null) {
			chargeitemoccurrencetimingrepeatboundsrangehigh.setValue(Double.parseDouble((c.getChrgItmOccrnceTmgRptBndsRngHiVl())));
		}
		/******************** chargeitemoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemoccurrencetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		chargeitemoccurrencetimingrepeatboundsrange.setLow(chargeitemoccurrencetimingrepeatboundsrangelow);

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngLwCd() != null) {
			chargeitemoccurrencetimingrepeatboundsrangelow.setCode(c.getChrgItmOccrnceTmgRptBndsRngLwCd());
		}
		/******************** chargeitemoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory chargeitemoccurrencetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		chargeitemoccurrencetimingrepeatboundsrangelow.setComparator(chargeitemoccurrencetimingrepeatboundsrangelowcomparator.fromCode(c.getChrgItmOccrnceTmgRptBndsRngLwCmprtr()));

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngLwSys() != null) {
			chargeitemoccurrencetimingrepeatboundsrangelow.setSystem(c.getChrgItmOccrnceTmgRptBndsRngLwSys());
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngLwUnt() != null) {
			chargeitemoccurrencetimingrepeatboundsrangelow.setUnit(c.getChrgItmOccrnceTmgRptBndsRngLwUnt());
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngLwVl() != null) {
			chargeitemoccurrencetimingrepeatboundsrangelow.setValue(Double.parseDouble((c.getChrgItmOccrnceTmgRptBndsRngLwVl())));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptCnt() != null) {
			chargeitemoccurrencetimingrepeat.setCount(Integer.parseInt(c.getChrgItmOccrnceTmgRptCnt()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptCntMx() != null) {
			chargeitemoccurrencetimingrepeat.setCountMax(Integer.parseInt(c.getChrgItmOccrnceTmgRptCntMx()));
		}
		/******************** chargeitemoccurrencetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory chargeitemoccurrencetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		chargeitemoccurrencetimingrepeat.addDayOfWeek(chargeitemoccurrencetimingrepeatdayofweek.fromCode(c.getChrgItmOccrnceTmgRptDayOfWeek()));

		/******************** ChrgItm_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptDuration() != null) {
			chargeitemoccurrencetimingrepeat.setDuration(Double.parseDouble((c.getChrgItmOccrnceTmgRptDuration())));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptDurationMx() != null) {
			chargeitemoccurrencetimingrepeat.setDurationMax(Double.parseDouble((c.getChrgItmOccrnceTmgRptDurationMx())));
		}
		/******************** chargeitemoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory chargeitemoccurrencetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		chargeitemoccurrencetimingrepeat.setDurationUnit(chargeitemoccurrencetimingrepeatdurationunit.fromCode(c.getChrgItmOccrnceTmgRptDurationUnt()));

		/******************** ChrgItm_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptFrqncy() != null) {
			chargeitemoccurrencetimingrepeat.setFrequency(Integer.parseInt(c.getChrgItmOccrnceTmgRptFrqncy()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptFrqncyMx() != null) {
			chargeitemoccurrencetimingrepeat.setFrequencyMax(Integer.parseInt(c.getChrgItmOccrnceTmgRptFrqncyMx()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptOff() != null) {
			chargeitemoccurrencetimingrepeat.setOffset(Integer.parseInt(c.getChrgItmOccrnceTmgRptOff()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptPrd() != null) {
			chargeitemoccurrencetimingrepeat.setPeriod(Double.parseDouble((c.getChrgItmOccrnceTmgRptPrd())));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptPrdMx() != null) {
			chargeitemoccurrencetimingrepeat.setPeriodMax(new java.math.BigDecimal((c.getChrgItmOccrnceTmgRptPrdMx())));
		}
		/******************** chargeitemoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory chargeitemoccurrencetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		chargeitemoccurrencetimingrepeat.setPeriodUnit(chargeitemoccurrencetimingrepeatperiodunit.fromCode(c.getChrgItmOccrnceTmgRptPrdUnt()));

		/******************** ChrgItm_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptTimeOfDay() != null) {
			chargeitemoccurrencetimingrepeat.addTimeOfDay(c.getChrgItmOccrnceTmgRptTimeOfDay());
		}
		/******************** chargeitemoccurrencetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory chargeitemoccurrencetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		chargeitemoccurrencetimingrepeat.addWhen(chargeitemoccurrencetimingrepeatwhen.fromCode(c.getChrgItmOccrnceTmgRptWhen()));

		/******************** ChrgItm_OverrideRsn ********************************************************************************/
		if(c.getChrgItmOverrideRsn() != null) {
			chargeitem.setOverrideReason(c.getChrgItmOverrideRsn());
		}
		/******************** ChrgItm_PartOf ********************************************************************************/
		if(c.getChrgItmPartOf() != null) {
			chargeitem.addPartOf( new org.hl7.fhir.r4.model.Reference(c.getChrgItmPartOf()));
		}
		/******************** chargeitemperformer ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItem.ChargeItemPerformerComponent chargeitemperformer =  new org.hl7.fhir.r4.model.ChargeItem.ChargeItemPerformerComponent();
		chargeitem.addPerformer(chargeitemperformer);

		/******************** ChrgItm_Prfrmr_Actor ********************************************************************************/
		if(c.getChrgItmPrfrmrActor() != null) {
			chargeitemperformer.setActor( new org.hl7.fhir.r4.model.Reference(c.getChrgItmPrfrmrActor()));
		}
		/******************** chargeitemperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemperformerfunction =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitemperformer.setFunction(chargeitemperformerfunction);

		/******************** chargeitemperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemperformerfunctioncoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemperformerfunction.addCoding(chargeitemperformerfunctioncoding);

		/******************** ChrgItm_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgCd() != null) {
			chargeitemperformerfunctioncoding.setCode(c.getChrgItmPrfrmrFunctionCdgCd());
		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgDsply() != null) {
			chargeitemperformerfunctioncoding.setDisplay(c.getChrgItmPrfrmrFunctionCdgDsply());
		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgSys() != null) {
			chargeitemperformerfunctioncoding.setSystem(c.getChrgItmPrfrmrFunctionCdgSys());
		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgUsrSltd() != null) {
			chargeitemperformerfunctioncoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmPrfrmrFunctionCdgUsrSltd()));
		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgVrsn() != null) {
			chargeitemperformerfunctioncoding.setVersion(c.getChrgItmPrfrmrFunctionCdgVrsn());
		}
		/******************** ChrgItm_Prfrmr_Function_Txt ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionTxt() != null) {
			chargeitemperformerfunction.setText(c.getChrgItmPrfrmrFunctionTxt());
		}
		/******************** ChrgItm_PerformingOrgnztn ********************************************************************************/
		if(c.getChrgItmPerformingOrgnztn() != null) {
			chargeitem.setPerformingOrganization( new org.hl7.fhir.r4.model.Reference(c.getChrgItmPerformingOrgnztn()));
		}
		/******************** chargeitempriceoverride ********************************************************************************/
		org.hl7.fhir.r4.model.Money chargeitempriceoverride =  new org.hl7.fhir.r4.model.Money();
		chargeitem.setPriceOverride(chargeitempriceoverride);

		/******************** ChrgItm_PriceOverride_Crncy ********************************************************************************/
		if(c.getChrgItmPriceOverrideCrncy() != null) {
			chargeitempriceoverride.setCurrency(c.getChrgItmPriceOverrideCrncy());
		}
		/******************** ChrgItm_PriceOverride_Vl ********************************************************************************/
		if(c.getChrgItmPriceOverrideVl() != null) {
			chargeitempriceoverride.setValue(Double.parseDouble((c.getChrgItmPriceOverrideVl())));
		}
		/******************** chargeitemproductcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemproductcodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitem.setProduct(chargeitemproductcodeableconcept);

		/******************** chargeitemproductcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemproductcodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemproductcodeableconcept.addCoding(chargeitemproductcodeableconceptcoding);

		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgCd() != null) {
			chargeitemproductcodeableconceptcoding.setCode(c.getChrgItmPrdctCdbleCncptCdgCd());
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgDsply() != null) {
			chargeitemproductcodeableconceptcoding.setDisplay(c.getChrgItmPrdctCdbleCncptCdgDsply());
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgSys() != null) {
			chargeitemproductcodeableconceptcoding.setSystem(c.getChrgItmPrdctCdbleCncptCdgSys());
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgUsrSltd() != null) {
			chargeitemproductcodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmPrdctCdbleCncptCdgUsrSltd()));
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgVrsn() != null) {
			chargeitemproductcodeableconceptcoding.setVersion(c.getChrgItmPrdctCdbleCncptCdgVrsn());
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptTxt() != null) {
			chargeitemproductcodeableconcept.setText(c.getChrgItmPrdctCdbleCncptTxt());
		}
		/******************** ChrgItm_PrdctRfrnc ********************************************************************************/
		if(c.getChrgItmPrdctRfrnc() != null) {
			chargeitem.setProduct( new org.hl7.fhir.r4.model.Reference(c.getChrgItmPrdctRfrnc()));
		}
		/******************** chargeitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemquantity =  new org.hl7.fhir.r4.model.Quantity();
		chargeitem.setQuantity(chargeitemquantity);

		/******************** ChrgItm_Qnty_Cd ********************************************************************************/
		if(c.getChrgItmQntyCd() != null) {
			chargeitemquantity.setCode(c.getChrgItmQntyCd());
		}
		/******************** chargeitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory chargeitemquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		chargeitemquantity.setComparator(chargeitemquantitycomparator.fromCode(c.getChrgItmQntyCmprtr()));

		/******************** ChrgItm_Qnty_Sys ********************************************************************************/
		if(c.getChrgItmQntySys() != null) {
			chargeitemquantity.setSystem(c.getChrgItmQntySys());
		}
		/******************** ChrgItm_Qnty_Unt ********************************************************************************/
		if(c.getChrgItmQntyUnt() != null) {
			chargeitemquantity.setUnit(c.getChrgItmQntyUnt());
		}
		/******************** ChrgItm_Qnty_Vl ********************************************************************************/
		if(c.getChrgItmQntyVl() != null) {
			chargeitemquantity.setValue(Double.parseDouble((c.getChrgItmQntyVl())));
		}
		/******************** chargeitemreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitem.addReason(chargeitemreason);

		/******************** chargeitemreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemreason.addCoding(chargeitemreasoncoding);

		/******************** ChrgItm_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmRsnCdgCd() != null) {
			chargeitemreasoncoding.setCode(c.getChrgItmRsnCdgCd());
		}
		/******************** ChrgItm_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmRsnCdgDsply() != null) {
			chargeitemreasoncoding.setDisplay(c.getChrgItmRsnCdgDsply());
		}
		/******************** ChrgItm_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmRsnCdgSys() != null) {
			chargeitemreasoncoding.setSystem(c.getChrgItmRsnCdgSys());
		}
		/******************** ChrgItm_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmRsnCdgUsrSltd() != null) {
			chargeitemreasoncoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmRsnCdgUsrSltd()));
		}
		/******************** ChrgItm_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmRsnCdgVrsn() != null) {
			chargeitemreasoncoding.setVersion(c.getChrgItmRsnCdgVrsn());
		}
		/******************** ChrgItm_Rsn_Txt ********************************************************************************/
		if(c.getChrgItmRsnTxt() != null) {
			chargeitemreason.setText(c.getChrgItmRsnTxt());
		}
		/******************** ChrgItm_RqstingOrgnztn ********************************************************************************/
		if(c.getChrgItmRqstingOrgnztn() != null) {
			chargeitem.setRequestingOrganization( new org.hl7.fhir.r4.model.Reference(c.getChrgItmRqstingOrgnztn()));
		}
		/******************** ChrgItm_Srv ********************************************************************************/
		if(c.getChrgItmSrv() != null) {
			chargeitem.addService( new org.hl7.fhir.r4.model.Reference(c.getChrgItmSrv()));
		}
		/******************** chargeitemstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItem.ChargeItemStatusEnumFactory chargeitemstatus =  new org.hl7.fhir.r4.model.ChargeItem.ChargeItemStatusEnumFactory();
		chargeitem.setStatus(chargeitemstatus.fromCode(c.getChrgItmSts()));

		/******************** ChrgItm_Sbjct ********************************************************************************/
		if(c.getChrgItmSbjct() != null) {
			chargeitem.setSubject( new org.hl7.fhir.r4.model.Reference(c.getChrgItmSbjct()));
		}
		/******************** ChrgItm_SprtingInfo ********************************************************************************/
		if(c.getChrgItmSprtingInfo() != null) {
			chargeitem.addSupportingInformation( new org.hl7.fhir.r4.model.Reference(c.getChrgItmSprtingInfo()));
		}
		return chargeitem;
	}
}
