package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ChargeItem;
public class ChargeItemBidirectionalConversion 
{
	public ChargeItem ChargeItems(org.hl7.fhir.r4.model.ChargeItem chargeitem) throws ParseException
	{
		 main.java.com.campfhir.model.ChargeItem c = new  main.java.com.campfhir.model.ChargeItem();

		/******************** id ********************************************************************************/
		chargeitem.setId(c.getId());

		/******************** ChrgItm_PrdctRfrnc ********************************************************************************/
		if(chargeitem.hasProductReference()) {
			c.setChrgItmPrdctRfrnc(String.valueOf(chargeitem.getProductReference()));
		}
		/******************** ChrgItm_Cntxt ********************************************************************************/
		if(chargeitem.hasContext()) {
			c.setChrgItmCntxt(String.valueOf(chargeitem.getContext()));
		}
		/******************** chargeitemproductcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemproductcodeableconcept = chargeitem.getProductCodeableConcept();

		/******************** ChrgItm_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(chargeitemproductcodeableconcept.hasText()) {
			c.setChrgItmPrdctCdbleCncptTxt(String.valueOf(chargeitemproductcodeableconcept.getText()));
		}
		/******************** chargeitemproductcodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemproductcodeableconceptcoding = chargeitemproductcodeableconcept.getCodingFirstRep();

		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(chargeitemproductcodeableconceptcoding.hasVersion()) {
			c.setChrgItmPrdctCdbleCncptCdgVrsn(String.valueOf(chargeitemproductcodeableconceptcoding.getVersion()));
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(chargeitemproductcodeableconceptcoding.hasDisplay()) {
			c.setChrgItmPrdctCdbleCncptCdgDsply(String.valueOf(chargeitemproductcodeableconceptcoding.getDisplay()));
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(chargeitemproductcodeableconceptcoding.hasCode()) {
			c.setChrgItmPrdctCdbleCncptCdgCd(String.valueOf(chargeitemproductcodeableconceptcoding.getCode()));
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemproductcodeableconceptcoding.hasUserSelected()) {
			c.setChrgItmPrdctCdbleCncptCdgUsrSltd(String.valueOf(chargeitemproductcodeableconceptcoding.getUserSelected()));
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(chargeitemproductcodeableconceptcoding.hasSystem()) {
			c.setChrgItmPrdctCdbleCncptCdgSys(String.valueOf(chargeitemproductcodeableconceptcoding.getSystem()));
		}
		/******************** chargeitembodysite ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitembodysite = chargeitem.getBodysiteFirstRep();

		/******************** ChrgItm_Bodysite_Txt ********************************************************************************/
		if(chargeitembodysite.hasText()) {
			c.setChrgItmBodysiteTxt(String.valueOf(chargeitembodysite.getText()));
		}
		/******************** chargeitembodysitecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitembodysitecoding = chargeitembodysite.getCodingFirstRep();

		/******************** ChrgItm_Bodysite_Cdg_Vrsn ********************************************************************************/
		if(chargeitembodysitecoding.hasVersion()) {
			c.setChrgItmBodysiteCdgVrsn(String.valueOf(chargeitembodysitecoding.getVersion()));
		}
		/******************** ChrgItm_Bodysite_Cdg_Dsply ********************************************************************************/
		if(chargeitembodysitecoding.hasDisplay()) {
			c.setChrgItmBodysiteCdgDsply(String.valueOf(chargeitembodysitecoding.getDisplay()));
		}
		/******************** ChrgItm_Bodysite_Cdg_Cd ********************************************************************************/
		if(chargeitembodysitecoding.hasCode()) {
			c.setChrgItmBodysiteCdgCd(String.valueOf(chargeitembodysitecoding.getCode()));
		}
		/******************** ChrgItm_Bodysite_Cdg_UsrSltd ********************************************************************************/
		if(chargeitembodysitecoding.hasUserSelected()) {
			c.setChrgItmBodysiteCdgUsrSltd(String.valueOf(chargeitembodysitecoding.getUserSelected()));
		}
		/******************** ChrgItm_Bodysite_Cdg_Sys ********************************************************************************/
		if(chargeitembodysitecoding.hasSystem()) {
			c.setChrgItmBodysiteCdgSys(String.valueOf(chargeitembodysitecoding.getSystem()));
		}
		/******************** chargeitemcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemcode = chargeitem.getCode();

		/******************** ChrgItm_Cd_Txt ********************************************************************************/
		if(chargeitemcode.hasText()) {
			c.setChrgItmCdTxt(String.valueOf(chargeitemcode.getText()));
		}
		/******************** chargeitemcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemcodecoding = chargeitemcode.getCodingFirstRep();

		/******************** ChrgItm_Cd_Cdg_Vrsn ********************************************************************************/
		if(chargeitemcodecoding.hasVersion()) {
			c.setChrgItmCdCdgVrsn(String.valueOf(chargeitemcodecoding.getVersion()));
		}
		/******************** ChrgItm_Cd_Cdg_Dsply ********************************************************************************/
		if(chargeitemcodecoding.hasDisplay()) {
			c.setChrgItmCdCdgDsply(String.valueOf(chargeitemcodecoding.getDisplay()));
		}
		/******************** ChrgItm_Cd_Cdg_Cd ********************************************************************************/
		if(chargeitemcodecoding.hasCode()) {
			c.setChrgItmCdCdgCd(String.valueOf(chargeitemcodecoding.getCode()));
		}
		/******************** ChrgItm_Cd_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemcodecoding.hasUserSelected()) {
			c.setChrgItmCdCdgUsrSltd(String.valueOf(chargeitemcodecoding.getUserSelected()));
		}
		/******************** ChrgItm_Cd_Cdg_Sys ********************************************************************************/
		if(chargeitemcodecoding.hasSystem()) {
			c.setChrgItmCdCdgSys(String.valueOf(chargeitemcodecoding.getSystem()));
		}
		/******************** chargeitemreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemreason = chargeitem.getReasonFirstRep();

		/******************** ChrgItm_Rsn_Txt ********************************************************************************/
		if(chargeitemreason.hasText()) {
			c.setChrgItmRsnTxt(String.valueOf(chargeitemreason.getText()));
		}
		/******************** chargeitemreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemreasoncoding = chargeitemreason.getCodingFirstRep();

		/******************** ChrgItm_Rsn_Cdg_Vrsn ********************************************************************************/
		if(chargeitemreasoncoding.hasVersion()) {
			c.setChrgItmRsnCdgVrsn(String.valueOf(chargeitemreasoncoding.getVersion()));
		}
		/******************** ChrgItm_Rsn_Cdg_Dsply ********************************************************************************/
		if(chargeitemreasoncoding.hasDisplay()) {
			c.setChrgItmRsnCdgDsply(String.valueOf(chargeitemreasoncoding.getDisplay()));
		}
		/******************** ChrgItm_Rsn_Cdg_Cd ********************************************************************************/
		if(chargeitemreasoncoding.hasCode()) {
			c.setChrgItmRsnCdgCd(String.valueOf(chargeitemreasoncoding.getCode()));
		}
		/******************** ChrgItm_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemreasoncoding.hasUserSelected()) {
			c.setChrgItmRsnCdgUsrSltd(String.valueOf(chargeitemreasoncoding.getUserSelected()));
		}
		/******************** ChrgItm_Rsn_Cdg_Sys ********************************************************************************/
		if(chargeitemreasoncoding.hasSystem()) {
			c.setChrgItmRsnCdgSys(String.valueOf(chargeitemreasoncoding.getSystem()));
		}
		/******************** ChrgItm_PartOf ********************************************************************************/
		if(chargeitem.hasPartOf()) {
			c.setChrgItmPartOf(String.valueOf(chargeitem.getPartOfFirstRep()));
		}
		/******************** ChrgItm_Account ********************************************************************************/
		if(chargeitem.hasAccount()) {
			c.setChrgItmAccount(String.valueOf(chargeitem.getAccountFirstRep()));
		}
		/******************** ChrgItm_Sbjct ********************************************************************************/
		if(chargeitem.hasSubject()) {
			c.setChrgItmSbjct(String.valueOf(chargeitem.getSubject()));
		}
		/******************** chargeitemstatus ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItem.ChargeItemStatus chargeitemstatus = chargeitem.getStatus();
		c.setChrgItmSts(chargeitemstatus.toCode());

		/******************** chargeitemnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation chargeitemnote = chargeitem.getNoteFirstRep();

		/******************** ChrgItm_Nt_Time ********************************************************************************/
		if(chargeitemnote.hasTime()) {
			c.setChrgItmNtTime(String.valueOf(chargeitemnote.getTime()));
		}
		/******************** ChrgItm_Nt_Txt ********************************************************************************/
		if(chargeitemnote.hasText()) {
			c.setChrgItmNtTxt(String.valueOf(chargeitemnote.getText()));
		}
		/******************** ChrgItm_Nt_AthrRfrnc ********************************************************************************/
		if(chargeitemnote.hasAuthorReference()) {
			c.setChrgItmNtAthrRfrnc(String.valueOf(chargeitemnote.getAuthorReference()));
		}
		/******************** ChrgItm_Nt_AthrStrgTyp ********************************************************************************/
		if(chargeitemnote.hasAuthorStringType()) {
			c.setChrgItmNtAthrStrgTyp(String.valueOf(chargeitemnote.getAuthorStringType()));
		}
		/******************** ChrgItm_FactorOverride ********************************************************************************/
		if(chargeitem.hasFactorOverride()) {
			c.setChrgItmFactorOverride(String.valueOf(chargeitem.getFactorOverride()));
		}
		/******************** ChrgItm_EnteredDt ********************************************************************************/
		if(chargeitem.hasEnteredDate()) {
			c.setChrgItmEnteredDt(String.valueOf(chargeitem.getEnteredDate()));
		}
		/******************** chargeitempriceoverride ********************************************************************************/
		org.hl7.fhir.r4.model.Money chargeitempriceoverride = chargeitem.getPriceOverride();

		/******************** ChrgItm_PriceOverride_Vl ********************************************************************************/
		if(chargeitempriceoverride.hasValue()) {
			c.setChrgItmPriceOverrideVl(String.valueOf(chargeitempriceoverride.getValue()));
		}
		/******************** ChrgItm_PriceOverride_Crncy ********************************************************************************/
		if(chargeitempriceoverride.hasCurrency()) {
			c.setChrgItmPriceOverrideCrncy(String.valueOf(chargeitempriceoverride.getCurrency()));
		}
		/******************** ChrgItm_OverrideRsn ********************************************************************************/
		if(chargeitem.hasOverrideReason()) {
			c.setChrgItmOverrideRsn(String.valueOf(chargeitem.getOverrideReason()));
		}
		/******************** ChrgItm_Srv ********************************************************************************/
		if(chargeitem.hasService()) {
			c.setChrgItmSrv(String.valueOf(chargeitem.getServiceFirstRep()));
		}
		/******************** ChrgItm_CstCenter ********************************************************************************/
		if(chargeitem.hasCostCenter()) {
			c.setChrgItmCstCenter(String.valueOf(chargeitem.getCostCenter()));
		}
		/******************** chargeitemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemquantity = chargeitem.getQuantity();

		/******************** ChrgItm_Qnty_Vl ********************************************************************************/
		if(chargeitemquantity.hasValue()) {
			c.setChrgItmQntyVl(String.valueOf(chargeitemquantity.getValue()));
		}
		/******************** chargeitemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemquantitycomparator = chargeitemquantity.getComparator();
		c.setChrgItmQntyCmprtr(chargeitemquantitycomparator.toCode());

		/******************** ChrgItm_Qnty_Cd ********************************************************************************/
		if(chargeitemquantity.hasCode()) {
			c.setChrgItmQntyCd(String.valueOf(chargeitemquantity.getCode()));
		}
		/******************** ChrgItm_Qnty_Unt ********************************************************************************/
		if(chargeitemquantity.hasUnit()) {
			c.setChrgItmQntyUnt(String.valueOf(chargeitemquantity.getUnit()));
		}
		/******************** ChrgItm_Qnty_Sys ********************************************************************************/
		if(chargeitemquantity.hasSystem()) {
			c.setChrgItmQntySys(String.valueOf(chargeitemquantity.getSystem()));
		}
		/******************** ChrgItm_SprtingInfo ********************************************************************************/
		if(chargeitem.hasSupportingInformation()) {
			c.setChrgItmSprtingInfo(String.valueOf(chargeitem.getSupportingInformationFirstRep()));
		}
		/******************** ChrgItm_Enterer ********************************************************************************/
		if(chargeitem.hasEnterer()) {
			c.setChrgItmEnterer(String.valueOf(chargeitem.getEnterer()));
		}
		/******************** chargeitemidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier chargeitemidentifier = chargeitem.getIdentifierFirstRep();

		/******************** ChrgItm_Id_Vl ********************************************************************************/
		if(chargeitemidentifier.hasValue()) {
			c.setChrgItmIdVl(String.valueOf(chargeitemidentifier.getValue()));
		}
		/******************** chargeitemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemidentifiertype = chargeitemidentifier.getType();

		/******************** ChrgItm_Id_Typ_Txt ********************************************************************************/
		if(chargeitemidentifiertype.hasText()) {
			c.setChrgItmIdTypTxt(String.valueOf(chargeitemidentifiertype.getText()));
		}
		/******************** chargeitemidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemidentifiertypecoding = chargeitemidentifiertype.getCodingFirstRep();

		/******************** ChrgItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(chargeitemidentifiertypecoding.hasVersion()) {
			c.setChrgItmIdTypCdgVrsn(String.valueOf(chargeitemidentifiertypecoding.getVersion()));
		}
		/******************** ChrgItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(chargeitemidentifiertypecoding.hasDisplay()) {
			c.setChrgItmIdTypCdgDsply(String.valueOf(chargeitemidentifiertypecoding.getDisplay()));
		}
		/******************** ChrgItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(chargeitemidentifiertypecoding.hasCode()) {
			c.setChrgItmIdTypCdgCd(String.valueOf(chargeitemidentifiertypecoding.getCode()));
		}
		/******************** ChrgItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemidentifiertypecoding.hasUserSelected()) {
			c.setChrgItmIdTypCdgUsrSltd(String.valueOf(chargeitemidentifiertypecoding.getUserSelected()));
		}
		/******************** ChrgItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(chargeitemidentifiertypecoding.hasSystem()) {
			c.setChrgItmIdTypCdgSys(String.valueOf(chargeitemidentifiertypecoding.getSystem()));
		}
		/******************** chargeitemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemidentifierperiod = chargeitemidentifier.getPeriod();

		/******************** ChrgItm_Id_Prd_Strt ********************************************************************************/
		if(chargeitemidentifierperiod.hasStart()) {
			c.setChrgItmIdPrdStrt(String.valueOf(chargeitemidentifierperiod.getStart()));
		}
		/******************** ChrgItm_Id_Prd_End ********************************************************************************/
		if(chargeitemidentifierperiod.hasEnd()) {
			c.setChrgItmIdPrdEnd(String.valueOf(chargeitemidentifierperiod.getEnd()));
		}
		/******************** ChrgItm_Id_Assigner ********************************************************************************/
		if(chargeitemidentifier.hasAssigner()) {
			c.setChrgItmIdAssigner(String.valueOf(chargeitemidentifier.getAssigner()));
		}
		/******************** ChrgItm_Id_Sys ********************************************************************************/
		if(chargeitemidentifier.hasSystem()) {
			c.setChrgItmIdSys(String.valueOf(chargeitemidentifier.getSystem()));
		}
		/******************** chargeitemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse chargeitemidentifieruse = chargeitemidentifier.getUse();
		c.setChrgItmIdUse(chargeitemidentifieruse.toCode());

		/******************** chargeitemoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemoccurrenceperiod = chargeitem.getOccurrencePeriod();

		/******************** ChrgItm_OccrncePrd_Strt ********************************************************************************/
		if(chargeitemoccurrenceperiod.hasStart()) {
			c.setChrgItmOccrncePrdStrt(String.valueOf(chargeitemoccurrenceperiod.getStart()));
		}
		/******************** ChrgItm_OccrncePrd_End ********************************************************************************/
		if(chargeitemoccurrenceperiod.hasEnd()) {
			c.setChrgItmOccrncePrdEnd(String.valueOf(chargeitemoccurrenceperiod.getEnd()));
		}
		/******************** ChrgItm_OccrnceDtTimeTyp ********************************************************************************/
		if(chargeitem.hasOccurrenceDateTimeType()) {
			c.setChrgItmOccrnceDtTimeTyp(String.valueOf(chargeitem.getOccurrenceDateTimeType()));
		}
		/******************** chargeitemperformer ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItem.ChargeItemPerformerComponent chargeitemperformer = chargeitem.getPerformerFirstRep();

		/******************** chargeitemperformerfunction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemperformerfunction = chargeitemperformer.getFunction();

		/******************** ChrgItm_Prfrmr_Function_Txt ********************************************************************************/
		if(chargeitemperformerfunction.hasText()) {
			c.setChrgItmPrfrmrFunctionTxt(String.valueOf(chargeitemperformerfunction.getText()));
		}
		/******************** chargeitemperformerfunctioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemperformerfunctioncoding = chargeitemperformerfunction.getCodingFirstRep();

		/******************** ChrgItm_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(chargeitemperformerfunctioncoding.hasVersion()) {
			c.setChrgItmPrfrmrFunctionCdgVrsn(String.valueOf(chargeitemperformerfunctioncoding.getVersion()));
		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(chargeitemperformerfunctioncoding.hasDisplay()) {
			c.setChrgItmPrfrmrFunctionCdgDsply(String.valueOf(chargeitemperformerfunctioncoding.getDisplay()));
		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(chargeitemperformerfunctioncoding.hasCode()) {
			c.setChrgItmPrfrmrFunctionCdgCd(String.valueOf(chargeitemperformerfunctioncoding.getCode()));
		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemperformerfunctioncoding.hasUserSelected()) {
			c.setChrgItmPrfrmrFunctionCdgUsrSltd(String.valueOf(chargeitemperformerfunctioncoding.getUserSelected()));
		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(chargeitemperformerfunctioncoding.hasSystem()) {
			c.setChrgItmPrfrmrFunctionCdgSys(String.valueOf(chargeitemperformerfunctioncoding.getSystem()));
		}
		/******************** ChrgItm_Prfrmr_Actor ********************************************************************************/
		if(chargeitemperformer.hasActor()) {
			c.setChrgItmPrfrmrActor(String.valueOf(chargeitemperformer.getActor()));
		}
		/******************** chargeitemoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing chargeitemoccurrencetiming = chargeitem.getOccurrenceTiming();

		/******************** chargeitemoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemoccurrencetimingcode = chargeitemoccurrencetiming.getCode();

		/******************** ChrgItm_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(chargeitemoccurrencetimingcode.hasText()) {
			c.setChrgItmOccrnceTmgCdTxt(String.valueOf(chargeitemoccurrencetimingcode.getText()));
		}
		/******************** chargeitemoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemoccurrencetimingcodecoding = chargeitemoccurrencetimingcode.getCodingFirstRep();

		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(chargeitemoccurrencetimingcodecoding.hasVersion()) {
			c.setChrgItmOccrnceTmgCdCdgVrsn(String.valueOf(chargeitemoccurrencetimingcodecoding.getVersion()));
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(chargeitemoccurrencetimingcodecoding.hasDisplay()) {
			c.setChrgItmOccrnceTmgCdCdgDsply(String.valueOf(chargeitemoccurrencetimingcodecoding.getDisplay()));
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(chargeitemoccurrencetimingcodecoding.hasCode()) {
			c.setChrgItmOccrnceTmgCdCdgCd(String.valueOf(chargeitemoccurrencetimingcodecoding.getCode()));
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemoccurrencetimingcodecoding.hasUserSelected()) {
			c.setChrgItmOccrnceTmgCdCdgUsrSltd(String.valueOf(chargeitemoccurrencetimingcodecoding.getUserSelected()));
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(chargeitemoccurrencetimingcodecoding.hasSystem()) {
			c.setChrgItmOccrnceTmgCdCdgSys(String.valueOf(chargeitemoccurrencetimingcodecoding.getSystem()));
		}
		/******************** chargeitemoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent chargeitemoccurrencetimingrepeat = chargeitemoccurrencetiming.getRepeat();

		/******************** ChrgItm_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasOffset()) {
			c.setChrgItmOccrnceTmgRptOff(String.valueOf(chargeitemoccurrencetimingrepeat.getOffset()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasCount()) {
			c.setChrgItmOccrnceTmgRptCnt(String.valueOf(chargeitemoccurrencetimingrepeat.getCount()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasFrequency()) {
			c.setChrgItmOccrnceTmgRptFrqncy(String.valueOf(chargeitemoccurrencetimingrepeat.getFrequency()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasPeriod()) {
			c.setChrgItmOccrnceTmgRptPrd(String.valueOf(chargeitemoccurrencetimingrepeat.getPeriod()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasDuration()) {
			c.setChrgItmOccrnceTmgRptDuration(String.valueOf(chargeitemoccurrencetimingrepeat.getDuration()));
		}
		/******************** chargeitemoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration chargeitemoccurrencetimingrepeatboundsduration = chargeitemoccurrencetimingrepeat.getBoundsDuration();

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsduration.hasValue()) {
			c.setChrgItmOccrnceTmgRptBndsDurationVl(String.valueOf(chargeitemoccurrencetimingrepeatboundsduration.getValue()));
		}
		/******************** chargeitemoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemoccurrencetimingrepeatboundsdurationcomparator = chargeitemoccurrencetimingrepeatboundsduration.getComparator();
		c.setChrgItmOccrnceTmgRptBndsDurationCmprtr(chargeitemoccurrencetimingrepeatboundsdurationcomparator.toCode());

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsduration.hasCode()) {
			c.setChrgItmOccrnceTmgRptBndsDurationCd(String.valueOf(chargeitemoccurrencetimingrepeatboundsduration.getCode()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsduration.hasUnit()) {
			c.setChrgItmOccrnceTmgRptBndsDurationUnt(String.valueOf(chargeitemoccurrencetimingrepeatboundsduration.getUnit()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsduration.hasSystem()) {
			c.setChrgItmOccrnceTmgRptBndsDurationSys(String.valueOf(chargeitemoccurrencetimingrepeatboundsduration.getSystem()));
		}
		/******************** chargeitemoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range chargeitemoccurrencetimingrepeatboundsrange = chargeitemoccurrencetimingrepeat.getBoundsRange();

		/******************** chargeitemoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemoccurrencetimingrepeatboundsrangelow = chargeitemoccurrencetimingrepeatboundsrange.getLow();

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangelow.hasValue()) {
			c.setChrgItmOccrnceTmgRptBndsRngLwVl(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangelow.getValue()));
		}
		/******************** chargeitemoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemoccurrencetimingrepeatboundsrangelowcomparator = chargeitemoccurrencetimingrepeatboundsrangelow.getComparator();
		c.setChrgItmOccrnceTmgRptBndsRngLwCmprtr(chargeitemoccurrencetimingrepeatboundsrangelowcomparator.toCode());

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangelow.hasCode()) {
			c.setChrgItmOccrnceTmgRptBndsRngLwCd(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangelow.getCode()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangelow.hasUnit()) {
			c.setChrgItmOccrnceTmgRptBndsRngLwUnt(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangelow.hasSystem()) {
			c.setChrgItmOccrnceTmgRptBndsRngLwSys(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** chargeitemoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemoccurrencetimingrepeatboundsrangehigh = chargeitemoccurrencetimingrepeatboundsrange.getHigh();

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangehigh.hasValue()) {
			c.setChrgItmOccrnceTmgRptBndsRngHiVl(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** chargeitemoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemoccurrencetimingrepeatboundsrangehighcomparator = chargeitemoccurrencetimingrepeatboundsrangehigh.getComparator();
		c.setChrgItmOccrnceTmgRptBndsRngHiCmprtr(chargeitemoccurrencetimingrepeatboundsrangehighcomparator.toCode());

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangehigh.hasCode()) {
			c.setChrgItmOccrnceTmgRptBndsRngHiCd(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangehigh.hasUnit()) {
			c.setChrgItmOccrnceTmgRptBndsRngHiUnt(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsrangehigh.hasSystem()) {
			c.setChrgItmOccrnceTmgRptBndsRngHiSys(String.valueOf(chargeitemoccurrencetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** chargeitemoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemoccurrencetimingrepeatboundsperiod = chargeitemoccurrencetimingrepeat.getBoundsPeriod();

		/******************** ChrgItm_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsperiod.hasStart()) {
			c.setChrgItmOccrnceTmgRptBndsPrdStrt(String.valueOf(chargeitemoccurrencetimingrepeatboundsperiod.getStart()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(chargeitemoccurrencetimingrepeatboundsperiod.hasEnd()) {
			c.setChrgItmOccrnceTmgRptBndsPrdEnd(String.valueOf(chargeitemoccurrencetimingrepeatboundsperiod.getEnd()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasPeriodMax()) {
			c.setChrgItmOccrnceTmgRptPrdMx(String.valueOf(chargeitemoccurrencetimingrepeat.getPeriodMax()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasDurationMax()) {
			c.setChrgItmOccrnceTmgRptDurationMx(String.valueOf(chargeitemoccurrencetimingrepeat.getDurationMax()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasCountMax()) {
			c.setChrgItmOccrnceTmgRptCntMx(String.valueOf(chargeitemoccurrencetimingrepeat.getCountMax()));
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(chargeitemoccurrencetimingrepeat.hasFrequencyMax()) {
			c.setChrgItmOccrnceTmgRptFrqncyMx(String.valueOf(chargeitemoccurrencetimingrepeat.getFrequencyMax()));
		}
		/******************** chargeitemoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime chargeitemoccurrencetimingrepeatdurationunit = chargeitemoccurrencetimingrepeat.getDurationUnit();
		c.setChrgItmOccrnceTmgRptDurationUnt(chargeitemoccurrencetimingrepeatdurationunit.toCode());

		/******************** chargeitemoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime chargeitemoccurrencetimingrepeatperiodunit = chargeitemoccurrencetimingrepeat.getPeriodUnit();
		c.setChrgItmOccrnceTmgRptPrdUnt(chargeitemoccurrencetimingrepeatperiodunit.toCode());

		/******************** ChrgItm_PerformingOrgnztn ********************************************************************************/
		if(chargeitem.hasPerformingOrganization()) {
			c.setChrgItmPerformingOrgnztn(String.valueOf(chargeitem.getPerformingOrganization()));
		}
		/******************** ChrgItm_RqstingOrgnztn ********************************************************************************/
		if(chargeitem.hasRequestingOrganization()) {
			c.setChrgItmRqstingOrgnztn(String.valueOf(chargeitem.getRequestingOrganization()));
		}
		return c;
	}
}
