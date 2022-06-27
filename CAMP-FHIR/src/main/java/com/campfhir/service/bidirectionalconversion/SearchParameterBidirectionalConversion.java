package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SearchParameter;
public class SearchParameterBidirectionalConversion 
{
	public SearchParameter SearchParameters(org.hl7.fhir.r4.model.SearchParameter searchparameter) throws ParseException
	{
		 main.java.com.campfhir.model.SearchParameter s = new  main.java.com.campfhir.model.SearchParameter();

		/******************** id ********************************************************************************/
		searchparameter.setId(s.getId());

		/******************** SrchPrmtr_Nm ********************************************************************************/
		if(searchparameter.hasName()) {
			s.setSrchPrmtrNm(String.valueOf(searchparameter.getName()));
		}
		/******************** searchparametertype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamType searchparametertype = searchparameter.getType();
		s.setSrchPrmtrTyp(searchparametertype.toCode());

		/******************** SrchPrmtr_Dt ********************************************************************************/
		if(searchparameter.hasDate()) {
			s.setSrchPrmtrDt(String.valueOf(searchparameter.getDate()));
		}
		/******************** SrchPrmtr_Vrsn ********************************************************************************/
		if(searchparameter.hasVersion()) {
			s.setSrchPrmtrVrsn(String.valueOf(searchparameter.getVersion()));
		}
		/******************** SrchPrmtr_Cd ********************************************************************************/
		if(searchparameter.hasCode()) {
			s.setSrchPrmtrCd(String.valueOf(searchparameter.getCode()));
		}
		/******************** searchparametercomponent ********************************************************************************/
		org.hl7.fhir.r4.model.SearchParameter.SearchParameterComponentComponent searchparametercomponent = searchparameter.getComponentFirstRep();

		/******************** SrchPrmtr_Cmpnt_Dfn ********************************************************************************/
		if(searchparametercomponent.hasDefinition()) {
			s.setSrchPrmtrCmpntDfn(String.valueOf(searchparametercomponent.getDefinition()));
		}
		/******************** SrchPrmtr_Cmpnt_Exprsn ********************************************************************************/
		if(searchparametercomponent.hasExpression()) {
			s.setSrchPrmtrCmpntExprsn(String.valueOf(searchparametercomponent.getExpression()));
		}
		/******************** searchparameterstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus searchparameterstatus = searchparameter.getStatus();
		s.setSrchPrmtrSts(searchparameterstatus.toCode());

		/******************** SrchPrmtr_Dscrptn ********************************************************************************/
		if(searchparameter.hasDescription()) {
			s.setSrchPrmtrDscrptn(String.valueOf(searchparameter.getDescription()));
		}
		/******************** SrchPrmtr_Url ********************************************************************************/
		if(searchparameter.hasUrl()) {
			s.setSrchPrmtrUrl(String.valueOf(searchparameter.getUrl()));
		}
		/******************** SrchPrmtr_Pblshr ********************************************************************************/
		if(searchparameter.hasPublisher()) {
			s.setSrchPrmtrPblshr(String.valueOf(searchparameter.getPublisher()));
		}
		/******************** SrchPrmtr_Exprmtl ********************************************************************************/
		if(searchparameter.hasExperimental()) {
			s.setSrchPrmtrExprmtl(String.valueOf(searchparameter.getExperimental()));
		}
		/******************** SrchPrmtr_Prpse ********************************************************************************/
		if(searchparameter.hasPurpose()) {
			s.setSrchPrmtrPrpse(String.valueOf(searchparameter.getPurpose()));
		}
		/******************** searchparametercontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail searchparametercontact = searchparameter.getContactFirstRep();

		/******************** SrchPrmtr_Cntct_Nm ********************************************************************************/
		if(searchparametercontact.hasName()) {
			s.setSrchPrmtrCntctNm(String.valueOf(searchparametercontact.getName()));
		}
		/******************** searchparametercontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint searchparametercontacttelecom = searchparametercontact.getTelecomFirstRep();

		/******************** SrchPrmtr_Cntct_Tlcm_Vl ********************************************************************************/
		if(searchparametercontacttelecom.hasValue()) {
			s.setSrchPrmtrCntctTlcmVl(String.valueOf(searchparametercontacttelecom.getValue()));
		}
		/******************** searchparametercontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period searchparametercontacttelecomperiod = searchparametercontacttelecom.getPeriod();

		/******************** SrchPrmtr_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(searchparametercontacttelecomperiod.hasStart()) {
			s.setSrchPrmtrCntctTlcmPrdStrt(String.valueOf(searchparametercontacttelecomperiod.getStart()));
		}
		/******************** SrchPrmtr_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(searchparametercontacttelecomperiod.hasEnd()) {
			s.setSrchPrmtrCntctTlcmPrdEnd(String.valueOf(searchparametercontacttelecomperiod.getEnd()));
		}
		/******************** searchparametercontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem searchparametercontacttelecomsystem = searchparametercontacttelecom.getSystem();
		s.setSrchPrmtrCntctTlcmSys(searchparametercontacttelecomsystem.toCode());

		/******************** searchparametercontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse searchparametercontacttelecomuse = searchparametercontacttelecom.getUse();
		s.setSrchPrmtrCntctTlcmUse(searchparametercontacttelecomuse.toCode());

		/******************** SrchPrmtr_Cntct_Tlcm_Rnk ********************************************************************************/
		if(searchparametercontacttelecom.hasRank()) {
			s.setSrchPrmtrCntctTlcmRnk(String.valueOf(searchparametercontacttelecom.getRank()));
		}
		/******************** SrchPrmtr_DerivedFrom ********************************************************************************/
		if(searchparameter.hasDerivedFrom()) {
			s.setSrchPrmtrDerivedFrom(String.valueOf(searchparameter.getDerivedFrom()));
		}
		/******************** SrchPrmtr_Exprsn ********************************************************************************/
		if(searchparameter.hasExpression()) {
			s.setSrchPrmtrExprsn(String.valueOf(searchparameter.getExpression()));
		}
		/******************** SrchPrmtr_MultipleOr ********************************************************************************/
		if(searchparameter.hasMultipleOr()) {
			s.setSrchPrmtrMultipleOr(String.valueOf(searchparameter.getMultipleOr()));
		}
		/******************** searchparameterxpathusage ********************************************************************************/
		org.hl7.fhir.r4.model.SearchParameter.XPathUsageType searchparameterxpathusage = searchparameter.getXpathUsage();
		s.setSrchPrmtrXpathUsg(searchparameterxpathusage.toCode());

		/******************** SrchPrmtr_Xpath ********************************************************************************/
		if(searchparameter.hasXpath()) {
			s.setSrchPrmtrXpath(String.valueOf(searchparameter.getXpath()));
		}
		/******************** SrchPrmtr_MultipleAnd ********************************************************************************/
		if(searchparameter.hasMultipleAnd()) {
			s.setSrchPrmtrMultipleAnd(String.valueOf(searchparameter.getMultipleAnd()));
		}
		/******************** searchparameterusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext searchparameterusecontext = searchparameter.getUseContextFirstRep();

		/******************** searchparameterusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding searchparameterusecontextcode = searchparameterusecontext.getCode();

		/******************** SrchPrmtr_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(searchparameterusecontextcode.hasVersion()) {
			s.setSrchPrmtrUseCntxtCdVrsn(String.valueOf(searchparameterusecontextcode.getVersion()));
		}
		/******************** SrchPrmtr_UseCntxt_Cd_Dsply ********************************************************************************/
		if(searchparameterusecontextcode.hasDisplay()) {
			s.setSrchPrmtrUseCntxtCdDsply(String.valueOf(searchparameterusecontextcode.getDisplay()));
		}
		/******************** SrchPrmtr_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(searchparameterusecontextcode.hasUserSelected()) {
			s.setSrchPrmtrUseCntxtCdUsrSltd(String.valueOf(searchparameterusecontextcode.getUserSelected()));
		}
		/******************** SrchPrmtr_UseCntxt_Cd_Sys ********************************************************************************/
		if(searchparameterusecontextcode.hasSystem()) {
			s.setSrchPrmtrUseCntxtCdSys(String.valueOf(searchparameterusecontextcode.getSystem()));
		}
		/******************** searchparameterusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept searchparameterusecontextvaluecodeableconcept = searchparameterusecontext.getValueCodeableConcept();

		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconcept.hasText()) {
			s.setSrchPrmtrUseCntxtVlCdbleCncptTxt(String.valueOf(searchparameterusecontextvaluecodeableconcept.getText()));
		}
		/******************** searchparameterusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding searchparameterusecontextvaluecodeableconceptcoding = searchparameterusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcoding.hasVersion()) {
			s.setSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcoding.hasDisplay()) {
			s.setSrchPrmtrUseCntxtVlCdbleCncptCdgDsply(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcoding.hasCode()) {
			s.setSrchPrmtrUseCntxtVlCdbleCncptCdgCd(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			s.setSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(searchparameterusecontextvaluecodeableconceptcoding.hasSystem()) {
			s.setSrchPrmtrUseCntxtVlCdbleCncptCdgSys(String.valueOf(searchparameterusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** searchparameterusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity searchparameterusecontextvaluequantity = searchparameterusecontext.getValueQuantity();

		/******************** SrchPrmtr_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(searchparameterusecontextvaluequantity.hasValue()) {
			s.setSrchPrmtrUseCntxtVlQntyVl(String.valueOf(searchparameterusecontextvaluequantity.getValue()));
		}
		/******************** searchparameterusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator searchparameterusecontextvaluequantitycomparator = searchparameterusecontextvaluequantity.getComparator();
		s.setSrchPrmtrUseCntxtVlQntyCmprtr(searchparameterusecontextvaluequantitycomparator.toCode());

		/******************** SrchPrmtr_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(searchparameterusecontextvaluequantity.hasCode()) {
			s.setSrchPrmtrUseCntxtVlQntyCd(String.valueOf(searchparameterusecontextvaluequantity.getCode()));
		}
		/******************** SrchPrmtr_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(searchparameterusecontextvaluequantity.hasUnit()) {
			s.setSrchPrmtrUseCntxtVlQntyUnt(String.valueOf(searchparameterusecontextvaluequantity.getUnit()));
		}
		/******************** SrchPrmtr_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(searchparameterusecontextvaluequantity.hasSystem()) {
			s.setSrchPrmtrUseCntxtVlQntySys(String.valueOf(searchparameterusecontextvaluequantity.getSystem()));
		}
		/******************** searchparameterusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range searchparameterusecontextvaluerange = searchparameterusecontext.getValueRange();

		/******************** searchparameterusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity searchparameterusecontextvaluerangelow = searchparameterusecontextvaluerange.getLow();

		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(searchparameterusecontextvaluerangelow.hasValue()) {
			s.setSrchPrmtrUseCntxtVlRngLwVl(String.valueOf(searchparameterusecontextvaluerangelow.getValue()));
		}
		/******************** searchparameterusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator searchparameterusecontextvaluerangelowcomparator = searchparameterusecontextvaluerangelow.getComparator();
		s.setSrchPrmtrUseCntxtVlRngLwCmprtr(searchparameterusecontextvaluerangelowcomparator.toCode());

		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(searchparameterusecontextvaluerangelow.hasCode()) {
			s.setSrchPrmtrUseCntxtVlRngLwCd(String.valueOf(searchparameterusecontextvaluerangelow.getCode()));
		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(searchparameterusecontextvaluerangelow.hasUnit()) {
			s.setSrchPrmtrUseCntxtVlRngLwUnt(String.valueOf(searchparameterusecontextvaluerangelow.getUnit()));
		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(searchparameterusecontextvaluerangelow.hasSystem()) {
			s.setSrchPrmtrUseCntxtVlRngLwSys(String.valueOf(searchparameterusecontextvaluerangelow.getSystem()));
		}
		/******************** searchparameterusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity searchparameterusecontextvaluerangehigh = searchparameterusecontextvaluerange.getHigh();

		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(searchparameterusecontextvaluerangehigh.hasValue()) {
			s.setSrchPrmtrUseCntxtVlRngHiVl(String.valueOf(searchparameterusecontextvaluerangehigh.getValue()));
		}
		/******************** searchparameterusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator searchparameterusecontextvaluerangehighcomparator = searchparameterusecontextvaluerangehigh.getComparator();
		s.setSrchPrmtrUseCntxtVlRngHiCmprtr(searchparameterusecontextvaluerangehighcomparator.toCode());

		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(searchparameterusecontextvaluerangehigh.hasCode()) {
			s.setSrchPrmtrUseCntxtVlRngHiCd(String.valueOf(searchparameterusecontextvaluerangehigh.getCode()));
		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(searchparameterusecontextvaluerangehigh.hasUnit()) {
			s.setSrchPrmtrUseCntxtVlRngHiUnt(String.valueOf(searchparameterusecontextvaluerangehigh.getUnit()));
		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(searchparameterusecontextvaluerangehigh.hasSystem()) {
			s.setSrchPrmtrUseCntxtVlRngHiSys(String.valueOf(searchparameterusecontextvaluerangehigh.getSystem()));
		}
		/******************** SrchPrmtr_UseCntxt_VlRfrnc ********************************************************************************/
		if(searchparameterusecontext.hasValueReference()) {
			s.setSrchPrmtrUseCntxtVlRfrnc(String.valueOf(searchparameterusecontext.getValueReference()));
		}
		/******************** searchparameterjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept searchparameterjurisdiction = searchparameter.getJurisdictionFirstRep();

		/******************** SrchPrmtr_Jrsdctn_Txt ********************************************************************************/
		if(searchparameterjurisdiction.hasText()) {
			s.setSrchPrmtrJrsdctnTxt(String.valueOf(searchparameterjurisdiction.getText()));
		}
		/******************** searchparameterjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding searchparameterjurisdictioncoding = searchparameterjurisdiction.getCodingFirstRep();

		/******************** SrchPrmtr_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(searchparameterjurisdictioncoding.hasVersion()) {
			s.setSrchPrmtrJrsdctnCdgVrsn(String.valueOf(searchparameterjurisdictioncoding.getVersion()));
		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(searchparameterjurisdictioncoding.hasDisplay()) {
			s.setSrchPrmtrJrsdctnCdgDsply(String.valueOf(searchparameterjurisdictioncoding.getDisplay()));
		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(searchparameterjurisdictioncoding.hasCode()) {
			s.setSrchPrmtrJrsdctnCdgCd(String.valueOf(searchparameterjurisdictioncoding.getCode()));
		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(searchparameterjurisdictioncoding.hasUserSelected()) {
			s.setSrchPrmtrJrsdctnCdgUsrSltd(String.valueOf(searchparameterjurisdictioncoding.getUserSelected()));
		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(searchparameterjurisdictioncoding.hasSystem()) {
			s.setSrchPrmtrJrsdctnCdgSys(String.valueOf(searchparameterjurisdictioncoding.getSystem()));
		}
		return s;
	}
}
