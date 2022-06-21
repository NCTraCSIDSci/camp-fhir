package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ChargeItemDefinition;
public class ChargeItemDefinitionBidirectionalConversion 
{
	public ChargeItemDefinition ChargeItemDefinitions(org.hl7.fhir.r4.model.ChargeItemDefinition chargeitemdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.ChargeItemDefinition c = new  main.java.com.campfhir.model.ChargeItemDefinition();

		/******************** id ********************************************************************************/
		chargeitemdefinition.setId(c.getId());

		/******************** ChrgItmDfn_Vrsn ********************************************************************************/
		if(chargeitemdefinition.hasVersion()) {
			c.setChrgItmDfnVrsn(String.valueOf(chargeitemdefinition.getVersion()));
		}
		/******************** ChrgItmDfn_Dt ********************************************************************************/
		if(chargeitemdefinition.hasDate()) {
			c.setChrgItmDfnDt(String.valueOf(chargeitemdefinition.getDate()));
		}
		/******************** chargeitemdefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitioncode = chargeitemdefinition.getCode();

		/******************** chargeitemdefinitioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitioncodecoding = chargeitemdefinitioncode.getCodingFirstRep();

		/******************** ChrgItmDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitioncodecoding.hasDisplay()) {
			c.setChrgItmDfnCdCdgDsply(String.valueOf(chargeitemdefinitioncodecoding.getDisplay()));
		}
		/******************** ChrgItmDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitioncodecoding.hasVersion()) {
			c.setChrgItmDfnCdCdgVrsn(String.valueOf(chargeitemdefinitioncodecoding.getVersion()));
		}
		/******************** ChrgItmDfn_Cd_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitioncodecoding.hasCode()) {
			c.setChrgItmDfnCdCdgCd(String.valueOf(chargeitemdefinitioncodecoding.getCode()));
		}
		/******************** ChrgItmDfn_Cd_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitioncodecoding.hasSystem()) {
			c.setChrgItmDfnCdCdgSys(String.valueOf(chargeitemdefinitioncodecoding.getSystem()));
		}
		/******************** ChrgItmDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitioncodecoding.hasUserSelected()) {
			c.setChrgItmDfnCdCdgUsrSltd(String.valueOf(chargeitemdefinitioncodecoding.getUserSelected()));
		}
		/******************** ChrgItmDfn_Cd_Txt ********************************************************************************/
		if(chargeitemdefinitioncode.hasText()) {
			c.setChrgItmDfnCdTxt(String.valueOf(chargeitemdefinitioncode.getText()));
		}
		/******************** ChrgItmDfn_Url ********************************************************************************/
		if(chargeitemdefinition.hasUrl()) {
			c.setChrgItmDfnUrl(String.valueOf(chargeitemdefinition.getUrl()));
		}
		/******************** ChrgItmDfn_Instance ********************************************************************************/
		if(chargeitemdefinition.hasInstance()) {
			c.setChrgItmDfnInstance(String.valueOf(chargeitemdefinition.getInstanceFirstRep()));
		}
		/******************** chargeitemdefinitionapplicability ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent chargeitemdefinitionapplicability = chargeitemdefinition.getApplicabilityFirstRep();

		/******************** ChrgItmDfn_Applicability_Lnguage ********************************************************************************/
		if(chargeitemdefinitionapplicability.hasLanguage()) {
			c.setChrgItmDfnApplicabilityLnguage(String.valueOf(chargeitemdefinitionapplicability.getLanguage()));
		}
		/******************** ChrgItmDfn_Applicability_Dscrptn ********************************************************************************/
		if(chargeitemdefinitionapplicability.hasDescription()) {
			c.setChrgItmDfnApplicabilityDscrptn(String.valueOf(chargeitemdefinitionapplicability.getDescription()));
		}
		/******************** ChrgItmDfn_Applicability_Exprsn ********************************************************************************/
		if(chargeitemdefinitionapplicability.hasExpression()) {
			c.setChrgItmDfnApplicabilityExprsn(String.valueOf(chargeitemdefinitionapplicability.getExpression()));
		}
		/******************** chargeitemdefinitionpropertygroup ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupComponent chargeitemdefinitionpropertygroup = chargeitemdefinition.getPropertyGroupFirstRep();

		/******************** chargeitemdefinitionpropertygroupapplicability ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent chargeitemdefinitionpropertygroupapplicability = chargeitemdefinitionpropertygroup.getApplicabilityFirstRep();

		/******************** ChrgItmDfn_PrptyGrp_Applicability_Lnguage ********************************************************************************/
		if(chargeitemdefinitionpropertygroupapplicability.hasLanguage()) {
			c.setChrgItmDfnPrptyGrpApplicabilityLnguage(String.valueOf(chargeitemdefinitionpropertygroupapplicability.getLanguage()));
		}
		/******************** ChrgItmDfn_PrptyGrp_Applicability_Dscrptn ********************************************************************************/
		if(chargeitemdefinitionpropertygroupapplicability.hasDescription()) {
			c.setChrgItmDfnPrptyGrpApplicabilityDscrptn(String.valueOf(chargeitemdefinitionpropertygroupapplicability.getDescription()));
		}
		/******************** ChrgItmDfn_PrptyGrp_Applicability_Exprsn ********************************************************************************/
		if(chargeitemdefinitionpropertygroupapplicability.hasExpression()) {
			c.setChrgItmDfnPrptyGrpApplicabilityExprsn(String.valueOf(chargeitemdefinitionpropertygroupapplicability.getExpression()));
		}
		/******************** chargeitemdefinitionpropertygrouppricecomponent ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupPriceComponentComponent chargeitemdefinitionpropertygrouppricecomponent = chargeitemdefinitionpropertygroup.getPriceComponentFirstRep();

		/******************** chargeitemdefinitionpropertygrouppricecomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPriceComponentType chargeitemdefinitionpropertygrouppricecomponenttype = chargeitemdefinitionpropertygrouppricecomponent.getType();
		c.setChrgItmDfnPrptyGrpPriceCmpntTyp(chargeitemdefinitionpropertygrouppricecomponenttype.toCode());

		/******************** chargeitemdefinitionpropertygrouppricecomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionpropertygrouppricecomponentcode = chargeitemdefinitionpropertygrouppricecomponent.getCode();

		/******************** chargeitemdefinitionpropertygrouppricecomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionpropertygrouppricecomponentcodecoding = chargeitemdefinitionpropertygrouppricecomponentcode.getCodingFirstRep();

		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasDisplay()) {
			c.setChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getDisplay()));
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasVersion()) {
			c.setChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getVersion()));
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasCode()) {
			c.setChrgItmDfnPrptyGrpPriceCmpntCdCdgCd(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getCode()));
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasSystem()) {
			c.setChrgItmDfnPrptyGrpPriceCmpntCdCdgSys(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getSystem()));
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcodecoding.hasUserSelected()) {
			c.setChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcodecoding.getUserSelected()));
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Txt ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentcode.hasText()) {
			c.setChrgItmDfnPrptyGrpPriceCmpntCdTxt(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentcode.getText()));
		}
		/******************** chargeitemdefinitionpropertygrouppricecomponentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money chargeitemdefinitionpropertygrouppricecomponentamount = chargeitemdefinitionpropertygrouppricecomponent.getAmount();

		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Vl ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentamount.hasValue()) {
			c.setChrgItmDfnPrptyGrpPriceCmpntAmntVl(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentamount.getValue()));
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponentamount.hasCurrency()) {
			c.setChrgItmDfnPrptyGrpPriceCmpntAmntCrncy(String.valueOf(chargeitemdefinitionpropertygrouppricecomponentamount.getCurrency()));
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Factor ********************************************************************************/
		if(chargeitemdefinitionpropertygrouppricecomponent.hasFactor()) {
			c.setChrgItmDfnPrptyGrpPriceCmpntFactor(String.valueOf(chargeitemdefinitionpropertygrouppricecomponent.getFactor()));
		}
		/******************** chargeitemdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionjurisdiction = chargeitemdefinition.getJurisdictionFirstRep();

		/******************** chargeitemdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionjurisdictioncoding = chargeitemdefinitionjurisdiction.getCodingFirstRep();

		/******************** ChrgItmDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncoding.hasDisplay()) {
			c.setChrgItmDfnJrsdctnCdgDsply(String.valueOf(chargeitemdefinitionjurisdictioncoding.getDisplay()));
		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncoding.hasVersion()) {
			c.setChrgItmDfnJrsdctnCdgVrsn(String.valueOf(chargeitemdefinitionjurisdictioncoding.getVersion()));
		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncoding.hasCode()) {
			c.setChrgItmDfnJrsdctnCdgCd(String.valueOf(chargeitemdefinitionjurisdictioncoding.getCode()));
		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncoding.hasSystem()) {
			c.setChrgItmDfnJrsdctnCdgSys(String.valueOf(chargeitemdefinitionjurisdictioncoding.getSystem()));
		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionjurisdictioncoding.hasUserSelected()) {
			c.setChrgItmDfnJrsdctnCdgUsrSltd(String.valueOf(chargeitemdefinitionjurisdictioncoding.getUserSelected()));
		}
		/******************** ChrgItmDfn_Jrsdctn_Txt ********************************************************************************/
		if(chargeitemdefinitionjurisdiction.hasText()) {
			c.setChrgItmDfnJrsdctnTxt(String.valueOf(chargeitemdefinitionjurisdiction.getText()));
		}
		/******************** chargeitemdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext chargeitemdefinitionusecontext = chargeitemdefinition.getUseContextFirstRep();

		/******************** chargeitemdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionusecontextcode = chargeitemdefinitionusecontext.getCode();

		/******************** ChrgItmDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(chargeitemdefinitionusecontextcode.hasDisplay()) {
			c.setChrgItmDfnUseCntxtCdDsply(String.valueOf(chargeitemdefinitionusecontextcode.getDisplay()));
		}
		/******************** ChrgItmDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(chargeitemdefinitionusecontextcode.hasVersion()) {
			c.setChrgItmDfnUseCntxtCdVrsn(String.valueOf(chargeitemdefinitionusecontextcode.getVersion()));
		}
		/******************** ChrgItmDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontextcode.hasSystem()) {
			c.setChrgItmDfnUseCntxtCdSys(String.valueOf(chargeitemdefinitionusecontextcode.getSystem()));
		}
		/******************** ChrgItmDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionusecontextcode.hasUserSelected()) {
			c.setChrgItmDfnUseCntxtCdUsrSltd(String.valueOf(chargeitemdefinitionusecontextcode.getUserSelected()));
		}
		/******************** chargeitemdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionusecontextvaluecodeableconcept = chargeitemdefinitionusecontext.getValueCodeableConcept();

		/******************** chargeitemdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionusecontextvaluecodeableconceptcoding = chargeitemdefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			c.setChrgItmDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			c.setChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			c.setChrgItmDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			c.setChrgItmDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			c.setChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluecodeableconcept.hasText()) {
			c.setChrgItmDfnUseCntxtVlCdbleCncptTxt(String.valueOf(chargeitemdefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** chargeitemdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemdefinitionusecontextvaluequantity = chargeitemdefinitionusecontext.getValueQuantity();

		/******************** ChrgItmDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluequantity.hasValue()) {
			c.setChrgItmDfnUseCntxtVlQntyVl(String.valueOf(chargeitemdefinitionusecontextvaluequantity.getValue()));
		}
		/******************** chargeitemdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemdefinitionusecontextvaluequantitycomparator = chargeitemdefinitionusecontextvaluequantity.getComparator();
		c.setChrgItmDfnUseCntxtVlQntyCmprtr(chargeitemdefinitionusecontextvaluequantitycomparator.toCode());

		/******************** ChrgItmDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluequantity.hasCode()) {
			c.setChrgItmDfnUseCntxtVlQntyCd(String.valueOf(chargeitemdefinitionusecontextvaluequantity.getCode()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluequantity.hasSystem()) {
			c.setChrgItmDfnUseCntxtVlQntySys(String.valueOf(chargeitemdefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluequantity.hasUnit()) {
			c.setChrgItmDfnUseCntxtVlQntyUnt(String.valueOf(chargeitemdefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** chargeitemdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range chargeitemdefinitionusecontextvaluerange = chargeitemdefinitionusecontext.getValueRange();

		/******************** chargeitemdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemdefinitionusecontextvaluerangelow = chargeitemdefinitionusecontextvaluerange.getLow();

		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluerangelow.hasValue()) {
			c.setChrgItmDfnUseCntxtVlRngLwVl(String.valueOf(chargeitemdefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** chargeitemdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemdefinitionusecontextvaluerangelowcomparator = chargeitemdefinitionusecontextvaluerangelow.getComparator();
		c.setChrgItmDfnUseCntxtVlRngLwCmprtr(chargeitemdefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluerangelow.hasCode()) {
			c.setChrgItmDfnUseCntxtVlRngLwCd(String.valueOf(chargeitemdefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluerangelow.hasSystem()) {
			c.setChrgItmDfnUseCntxtVlRngLwSys(String.valueOf(chargeitemdefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluerangelow.hasUnit()) {
			c.setChrgItmDfnUseCntxtVlRngLwUnt(String.valueOf(chargeitemdefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** chargeitemdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemdefinitionusecontextvaluerangehigh = chargeitemdefinitionusecontextvaluerange.getHigh();

		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluerangehigh.hasValue()) {
			c.setChrgItmDfnUseCntxtVlRngHiVl(String.valueOf(chargeitemdefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** chargeitemdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator chargeitemdefinitionusecontextvaluerangehighcomparator = chargeitemdefinitionusecontextvaluerangehigh.getComparator();
		c.setChrgItmDfnUseCntxtVlRngHiCmprtr(chargeitemdefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluerangehigh.hasCode()) {
			c.setChrgItmDfnUseCntxtVlRngHiCd(String.valueOf(chargeitemdefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluerangehigh.hasSystem()) {
			c.setChrgItmDfnUseCntxtVlRngHiSys(String.valueOf(chargeitemdefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(chargeitemdefinitionusecontextvaluerangehigh.hasUnit()) {
			c.setChrgItmDfnUseCntxtVlRngHiUnt(String.valueOf(chargeitemdefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(chargeitemdefinitionusecontext.hasValueReference()) {
			c.setChrgItmDfnUseCntxtVlRfrnc(String.valueOf(chargeitemdefinitionusecontext.getValueReference()));
		}
		/******************** chargeitemdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus chargeitemdefinitionstatus = chargeitemdefinition.getStatus();
		c.setChrgItmDfnSts(chargeitemdefinitionstatus.toCode());

		/******************** ChrgItmDfn_Dscrptn ********************************************************************************/
		if(chargeitemdefinition.hasDescription()) {
			c.setChrgItmDfnDscrptn(String.valueOf(chargeitemdefinition.getDescription()));
		}
		/******************** chargeitemdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail chargeitemdefinitioncontact = chargeitemdefinition.getContactFirstRep();

		/******************** ChrgItmDfn_Cntct_Nm ********************************************************************************/
		if(chargeitemdefinitioncontact.hasName()) {
			c.setChrgItmDfnCntctNm(String.valueOf(chargeitemdefinitioncontact.getName()));
		}
		/******************** chargeitemdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint chargeitemdefinitioncontacttelecom = chargeitemdefinitioncontact.getTelecomFirstRep();

		/******************** ChrgItmDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(chargeitemdefinitioncontacttelecom.hasValue()) {
			c.setChrgItmDfnCntctTlcmVl(String.valueOf(chargeitemdefinitioncontacttelecom.getValue()));
		}
		/******************** chargeitemdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem chargeitemdefinitioncontacttelecomsystem = chargeitemdefinitioncontacttelecom.getSystem();
		c.setChrgItmDfnCntctTlcmSys(chargeitemdefinitioncontacttelecomsystem.toCode());

		/******************** chargeitemdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemdefinitioncontacttelecomperiod = chargeitemdefinitioncontacttelecom.getPeriod();

		/******************** ChrgItmDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(chargeitemdefinitioncontacttelecomperiod.hasEnd()) {
			c.setChrgItmDfnCntctTlcmPrdEnd(String.valueOf(chargeitemdefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** ChrgItmDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(chargeitemdefinitioncontacttelecomperiod.hasStart()) {
			c.setChrgItmDfnCntctTlcmPrdStrt(String.valueOf(chargeitemdefinitioncontacttelecomperiod.getStart()));
		}
		/******************** chargeitemdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse chargeitemdefinitioncontacttelecomuse = chargeitemdefinitioncontacttelecom.getUse();
		c.setChrgItmDfnCntctTlcmUse(chargeitemdefinitioncontacttelecomuse.toCode());

		/******************** ChrgItmDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(chargeitemdefinitioncontacttelecom.hasRank()) {
			c.setChrgItmDfnCntctTlcmRnk(String.valueOf(chargeitemdefinitioncontacttelecom.getRank()));
		}
		/******************** ChrgItmDfn_Ttl ********************************************************************************/
		if(chargeitemdefinition.hasTitle()) {
			c.setChrgItmDfnTtl(String.valueOf(chargeitemdefinition.getTitle()));
		}
		/******************** chargeitemdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier chargeitemdefinitionidentifier = chargeitemdefinition.getIdentifierFirstRep();

		/******************** ChrgItmDfn_Id_Vl ********************************************************************************/
		if(chargeitemdefinitionidentifier.hasValue()) {
			c.setChrgItmDfnIdVl(String.valueOf(chargeitemdefinitionidentifier.getValue()));
		}
		/******************** chargeitemdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionidentifiertype = chargeitemdefinitionidentifier.getType();

		/******************** chargeitemdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionidentifiertypecoding = chargeitemdefinitionidentifiertype.getCodingFirstRep();

		/******************** ChrgItmDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecoding.hasDisplay()) {
			c.setChrgItmDfnIdTypCdgDsply(String.valueOf(chargeitemdefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecoding.hasVersion()) {
			c.setChrgItmDfnIdTypCdgVrsn(String.valueOf(chargeitemdefinitionidentifiertypecoding.getVersion()));
		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecoding.hasCode()) {
			c.setChrgItmDfnIdTypCdgCd(String.valueOf(chargeitemdefinitionidentifiertypecoding.getCode()));
		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecoding.hasSystem()) {
			c.setChrgItmDfnIdTypCdgSys(String.valueOf(chargeitemdefinitionidentifiertypecoding.getSystem()));
		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(chargeitemdefinitionidentifiertypecoding.hasUserSelected()) {
			c.setChrgItmDfnIdTypCdgUsrSltd(String.valueOf(chargeitemdefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** ChrgItmDfn_Id_Typ_Txt ********************************************************************************/
		if(chargeitemdefinitionidentifiertype.hasText()) {
			c.setChrgItmDfnIdTypTxt(String.valueOf(chargeitemdefinitionidentifiertype.getText()));
		}
		/******************** ChrgItmDfn_Id_Sys ********************************************************************************/
		if(chargeitemdefinitionidentifier.hasSystem()) {
			c.setChrgItmDfnIdSys(String.valueOf(chargeitemdefinitionidentifier.getSystem()));
		}
		/******************** ChrgItmDfn_Id_Assigner ********************************************************************************/
		if(chargeitemdefinitionidentifier.hasAssigner()) {
			c.setChrgItmDfnIdAssigner(String.valueOf(chargeitemdefinitionidentifier.getAssigner()));
		}
		/******************** chargeitemdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemdefinitionidentifierperiod = chargeitemdefinitionidentifier.getPeriod();

		/******************** ChrgItmDfn_Id_Prd_End ********************************************************************************/
		if(chargeitemdefinitionidentifierperiod.hasEnd()) {
			c.setChrgItmDfnIdPrdEnd(String.valueOf(chargeitemdefinitionidentifierperiod.getEnd()));
		}
		/******************** ChrgItmDfn_Id_Prd_Strt ********************************************************************************/
		if(chargeitemdefinitionidentifierperiod.hasStart()) {
			c.setChrgItmDfnIdPrdStrt(String.valueOf(chargeitemdefinitionidentifierperiod.getStart()));
		}
		/******************** chargeitemdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse chargeitemdefinitionidentifieruse = chargeitemdefinitionidentifier.getUse();
		c.setChrgItmDfnIdUse(chargeitemdefinitionidentifieruse.toCode());

		/******************** ChrgItmDfn_Exprmtl ********************************************************************************/
		if(chargeitemdefinition.hasExperimental()) {
			c.setChrgItmDfnExprmtl(String.valueOf(chargeitemdefinition.getExperimental()));
		}
		/******************** ChrgItmDfn_Pblshr ********************************************************************************/
		if(chargeitemdefinition.hasPublisher()) {
			c.setChrgItmDfnPblshr(String.valueOf(chargeitemdefinition.getPublisher()));
		}
		/******************** chargeitemdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemdefinitioneffectiveperiod = chargeitemdefinition.getEffectivePeriod();

		/******************** ChrgItmDfn_EfctivePrd_End ********************************************************************************/
		if(chargeitemdefinitioneffectiveperiod.hasEnd()) {
			c.setChrgItmDfnEfctivePrdEnd(String.valueOf(chargeitemdefinitioneffectiveperiod.getEnd()));
		}
		/******************** ChrgItmDfn_EfctivePrd_Strt ********************************************************************************/
		if(chargeitemdefinitioneffectiveperiod.hasStart()) {
			c.setChrgItmDfnEfctivePrdStrt(String.valueOf(chargeitemdefinitioneffectiveperiod.getStart()));
		}
		/******************** ChrgItmDfn_Copyright ********************************************************************************/
		if(chargeitemdefinition.hasCopyright()) {
			c.setChrgItmDfnCopyright(String.valueOf(chargeitemdefinition.getCopyright()));
		}
		/******************** ChrgItmDfn_LastReviewDt ********************************************************************************/
		if(chargeitemdefinition.hasLastReviewDate()) {
			c.setChrgItmDfnLastReviewDt(String.valueOf(chargeitemdefinition.getLastReviewDate()));
		}
		/******************** ChrgItmDfn_ApprovalDt ********************************************************************************/
		if(chargeitemdefinition.hasApprovalDate()) {
			c.setChrgItmDfnApprovalDt(String.valueOf(chargeitemdefinition.getApprovalDate()));
		}
		return c;
	}
}
