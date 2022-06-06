package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.SearchParameter;
public class SearchParameterConversion 
{
	public org.hl7.fhir.r4.model.SearchParameter SearchParameters(SearchParameter s) throws ParseException
	{
		org.hl7.fhir.r4.model.SearchParameter searchparameter = new org.hl7.fhir.r4.model.SearchParameter();

		/******************** id ********************************************************************************/
		searchparameter.setId(s.getId());

		/******************** SrchPrmtr_Base ********************************************************************************/
		if(s.getSrchPrmtrBase() != null) {
			searchparameter.addBase(s.getSrchPrmtrBase());
		}
		/******************** SrchPrmtr_Chain ********************************************************************************/
		if(s.getSrchPrmtrChain() != null) {
			searchparameter.addChain(s.getSrchPrmtrChain());
		}
		/******************** SrchPrmtr_Cd ********************************************************************************/
		if(s.getSrchPrmtrCd() != null) {
			searchparameter.setCode(s.getSrchPrmtrCd());
		}
		/******************** searchparametercomparator ********************************************************************************/
		org.hl7.fhir.r4.model.SearchParameter.SearchComparatorEnumFactory searchparametercomparator =  new org.hl7.fhir.r4.model.SearchParameter.SearchComparatorEnumFactory();
		searchparameter.addComparator(searchparametercomparator.fromCode(s.getSrchPrmtrCmprtr()));

		/******************** searchparametercomponent ********************************************************************************/
		org.hl7.fhir.r4.model.SearchParameter.SearchParameterComponentComponent searchparametercomponent =  new org.hl7.fhir.r4.model.SearchParameter.SearchParameterComponentComponent();
		searchparameter.addComponent(searchparametercomponent);

		/******************** SrchPrmtr_Cmpnt_Dfn ********************************************************************************/
		if(s.getSrchPrmtrCmpntDfn() != null) {
			searchparametercomponent.setDefinition(s.getSrchPrmtrCmpntDfn());
		}
		/******************** SrchPrmtr_Cmpnt_Exprsn ********************************************************************************/
		if(s.getSrchPrmtrCmpntExprsn() != null) {
			searchparametercomponent.setExpression(s.getSrchPrmtrCmpntExprsn());
		}
		/******************** searchparametercontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail searchparametercontact =  new org.hl7.fhir.r4.model.ContactDetail();
		searchparameter.addContact(searchparametercontact);

		/******************** SrchPrmtr_Cntct_Nm ********************************************************************************/
		if(s.getSrchPrmtrCntctNm() != null) {
			searchparametercontact.setName(s.getSrchPrmtrCntctNm());
		}
		/******************** searchparametercontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint searchparametercontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		searchparametercontact.addTelecom(searchparametercontacttelecom);

		/******************** searchparametercontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period searchparametercontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		searchparametercontacttelecom.setPeriod(searchparametercontacttelecomperiod);

		/******************** SrchPrmtr_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat SrchPrmtr_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrchPrmtr_Cntct_Tlcm_Prd_Enddate = SrchPrmtr_Cntct_Tlcm_Prd_Endsdf.parse(s.getSrchPrmtrCntctTlcmPrdEnd());
			searchparametercontacttelecomperiod.setEnd(SrchPrmtr_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** SrchPrmtr_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat SrchPrmtr_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrchPrmtr_Cntct_Tlcm_Prd_Strtdate = SrchPrmtr_Cntct_Tlcm_Prd_Strtsdf.parse(s.getSrchPrmtrCntctTlcmPrdStrt());
			searchparametercontacttelecomperiod.setStart(SrchPrmtr_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** SrchPrmtr_Cntct_Tlcm_Rnk ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmRnk() != null) {
			searchparametercontacttelecom.setRank(Integer.parseInt(s.getSrchPrmtrCntctTlcmRnk()));
		}
		/******************** searchparametercontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory searchparametercontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		searchparametercontacttelecom.setSystem(searchparametercontacttelecomsystem.fromCode(s.getSrchPrmtrCntctTlcmSys()));

		/******************** searchparametercontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory searchparametercontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		searchparametercontacttelecom.setUse(searchparametercontacttelecomuse.fromCode(s.getSrchPrmtrCntctTlcmUse()));

		/******************** SrchPrmtr_Cntct_Tlcm_Vl ********************************************************************************/
		if(s.getSrchPrmtrCntctTlcmVl() != null) {
			searchparametercontacttelecom.setValue(s.getSrchPrmtrCntctTlcmVl());
		}
		/******************** SrchPrmtr_Dt ********************************************************************************/
		if(s.getSrchPrmtrDt() != null) {
			java.text.SimpleDateFormat SrchPrmtr_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date SrchPrmtr_Dtdate = SrchPrmtr_Dtsdf.parse(s.getSrchPrmtrDt());
			searchparameter.setDate(SrchPrmtr_Dtdate);
		}
		/******************** SrchPrmtr_DerivedFrom ********************************************************************************/
		if(s.getSrchPrmtrDerivedFrom() != null) {
			searchparameter.setDerivedFrom(s.getSrchPrmtrDerivedFrom());
		}
		/******************** SrchPrmtr_Dscrptn ********************************************************************************/
		if(s.getSrchPrmtrDscrptn() != null) {
			searchparameter.setDescription(s.getSrchPrmtrDscrptn());
		}
		/******************** SrchPrmtr_Exprmtl ********************************************************************************/
		if(s.getSrchPrmtrExprmtl() != null) {
			searchparameter.setExperimental(Boolean.parseBoolean(s.getSrchPrmtrExprmtl()));
		}
		/******************** SrchPrmtr_Exprsn ********************************************************************************/
		if(s.getSrchPrmtrExprsn() != null) {
			searchparameter.setExpression(s.getSrchPrmtrExprsn());
		}
		/******************** searchparameterjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept searchparameterjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		searchparameter.addJurisdiction(searchparameterjurisdiction);

		/******************** searchparameterjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding searchparameterjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		searchparameterjurisdiction.addCoding(searchparameterjurisdictioncoding);

		/******************** SrchPrmtr_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgCd() != null) {
			searchparameterjurisdictioncoding.setCode(s.getSrchPrmtrJrsdctnCdgCd());
		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgDsply() != null) {
			searchparameterjurisdictioncoding.setDisplay(s.getSrchPrmtrJrsdctnCdgDsply());
		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgSys() != null) {
			searchparameterjurisdictioncoding.setSystem(s.getSrchPrmtrJrsdctnCdgSys());
		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgUsrSltd() != null) {
			searchparameterjurisdictioncoding.setUserSelected(Boolean.parseBoolean(s.getSrchPrmtrJrsdctnCdgUsrSltd()));
		}
		/******************** SrchPrmtr_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnCdgVrsn() != null) {
			searchparameterjurisdictioncoding.setVersion(s.getSrchPrmtrJrsdctnCdgVrsn());
		}
		/******************** SrchPrmtr_Jrsdctn_Txt ********************************************************************************/
		if(s.getSrchPrmtrJrsdctnTxt() != null) {
			searchparameterjurisdiction.setText(s.getSrchPrmtrJrsdctnTxt());
		}
		/******************** searchparametermodifier ********************************************************************************/
		org.hl7.fhir.r4.model.SearchParameter.SearchModifierCodeEnumFactory searchparametermodifier =  new org.hl7.fhir.r4.model.SearchParameter.SearchModifierCodeEnumFactory();
		searchparameter.addModifier(searchparametermodifier.fromCode(s.getSrchPrmtrMdfr()));

		/******************** SrchPrmtr_MultipleAnd ********************************************************************************/
		if(s.getSrchPrmtrMultipleAnd() != null) {
			searchparameter.setMultipleAnd(Boolean.parseBoolean(s.getSrchPrmtrMultipleAnd()));
		}
		/******************** SrchPrmtr_MultipleOr ********************************************************************************/
		if(s.getSrchPrmtrMultipleOr() != null) {
			searchparameter.setMultipleOr(Boolean.parseBoolean(s.getSrchPrmtrMultipleOr()));
		}
		/******************** SrchPrmtr_Nm ********************************************************************************/
		if(s.getSrchPrmtrNm() != null) {
			searchparameter.setName(s.getSrchPrmtrNm());
		}
		/******************** SrchPrmtr_Pblshr ********************************************************************************/
		if(s.getSrchPrmtrPblshr() != null) {
			searchparameter.setPublisher(s.getSrchPrmtrPblshr());
		}
		/******************** SrchPrmtr_Prpse ********************************************************************************/
		if(s.getSrchPrmtrPrpse() != null) {
			searchparameter.setPurpose(s.getSrchPrmtrPrpse());
		}
		/******************** searchparameterstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory searchparameterstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		searchparameter.setStatus(searchparameterstatus.fromCode(s.getSrchPrmtrSts()));

		/******************** SrchPrmtr_Tar ********************************************************************************/
		if(s.getSrchPrmtrTar() != null) {
			searchparameter.addTarget(s.getSrchPrmtrTar());
		}
		/******************** searchparametertype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory searchparametertype =  new org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory();
		searchparameter.setType(searchparametertype.fromCode(s.getSrchPrmtrTyp()));

		/******************** SrchPrmtr_Url ********************************************************************************/
		if(s.getSrchPrmtrUrl() != null) {
			searchparameter.setUrl(s.getSrchPrmtrUrl());
		}
		/******************** searchparameterusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext searchparameterusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		searchparameter.addUseContext(searchparameterusecontext);

		/******************** searchparameterusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding searchparameterusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		searchparameterusecontext.setCode(searchparameterusecontextcode);

		/******************** SrchPrmtr_UseCntxt_Cd_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdCd() != null) {
			searchparameterusecontextcode.setCode(s.getSrchPrmtrUseCntxtCdCd());
		}
		/******************** SrchPrmtr_UseCntxt_Cd_Dsply ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdDsply() != null) {
			searchparameterusecontextcode.setDisplay(s.getSrchPrmtrUseCntxtCdDsply());
		}
		/******************** SrchPrmtr_UseCntxt_Cd_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdSys() != null) {
			searchparameterusecontextcode.setSystem(s.getSrchPrmtrUseCntxtCdSys());
		}
		/******************** SrchPrmtr_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdUsrSltd() != null) {
			searchparameterusecontextcode.setUserSelected(Boolean.parseBoolean(s.getSrchPrmtrUseCntxtCdUsrSltd()));
		}
		/******************** SrchPrmtr_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtCdVrsn() != null) {
			searchparameterusecontextcode.setVersion(s.getSrchPrmtrUseCntxtCdVrsn());
		}
		/******************** searchparameterusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept searchparameterusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		searchparameterusecontext.setValue(searchparameterusecontextvaluecodeableconcept);

		/******************** searchparameterusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding searchparameterusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		searchparameterusecontextvaluecodeableconcept.addCoding(searchparameterusecontextvaluecodeableconceptcoding);

		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgCd() != null) {
			searchparameterusecontextvaluecodeableconceptcoding.setCode(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgDsply() != null) {
			searchparameterusecontextvaluecodeableconceptcoding.setDisplay(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgSys() != null) {
			searchparameterusecontextvaluecodeableconceptcoding.setSystem(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			searchparameterusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn() != null) {
			searchparameterusecontextvaluecodeableconceptcoding.setVersion(s.getSrchPrmtrUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** SrchPrmtr_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlCdbleCncptTxt() != null) {
			searchparameterusecontextvaluecodeableconcept.setText(s.getSrchPrmtrUseCntxtVlCdbleCncptTxt());
		}
		/******************** searchparameterusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity searchparameterusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		searchparameterusecontext.setValue(searchparameterusecontextvaluequantity);

		/******************** SrchPrmtr_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlQntyCd() != null) {
			searchparameterusecontextvaluequantity.setCode(s.getSrchPrmtrUseCntxtVlQntyCd());
		}
		/******************** searchparameterusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory searchparameterusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		searchparameterusecontextvaluequantity.setComparator(searchparameterusecontextvaluequantitycomparator.fromCode(s.getSrchPrmtrUseCntxtVlQntyCmprtr()));

		/******************** SrchPrmtr_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlQntySys() != null) {
			searchparameterusecontextvaluequantity.setSystem(s.getSrchPrmtrUseCntxtVlQntySys());
		}
		/******************** SrchPrmtr_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlQntyUnt() != null) {
			searchparameterusecontextvaluequantity.setUnit(s.getSrchPrmtrUseCntxtVlQntyUnt());
		}
		/******************** SrchPrmtr_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlQntyVl() != null) {
			searchparameterusecontextvaluequantity.setValue(Double.parseDouble((s.getSrchPrmtrUseCntxtVlQntyVl())));
		}
		/******************** searchparameterusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range searchparameterusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		searchparameterusecontext.setValue(searchparameterusecontextvaluerange);

		/******************** searchparameterusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity searchparameterusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		searchparameterusecontextvaluerange.setHigh(searchparameterusecontextvaluerangehigh);

		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngHiCd() != null) {
			searchparameterusecontextvaluerangehigh.setCode(s.getSrchPrmtrUseCntxtVlRngHiCd());
		}
		/******************** searchparameterusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory searchparameterusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		searchparameterusecontextvaluerangehigh.setComparator(searchparameterusecontextvaluerangehighcomparator.fromCode(s.getSrchPrmtrUseCntxtVlRngHiCmprtr()));

		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngHiSys() != null) {
			searchparameterusecontextvaluerangehigh.setSystem(s.getSrchPrmtrUseCntxtVlRngHiSys());
		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngHiUnt() != null) {
			searchparameterusecontextvaluerangehigh.setUnit(s.getSrchPrmtrUseCntxtVlRngHiUnt());
		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngHiVl() != null) {
			searchparameterusecontextvaluerangehigh.setValue(Double.parseDouble((s.getSrchPrmtrUseCntxtVlRngHiVl())));
		}
		/******************** searchparameterusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity searchparameterusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		searchparameterusecontextvaluerange.setLow(searchparameterusecontextvaluerangelow);

		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngLwCd() != null) {
			searchparameterusecontextvaluerangelow.setCode(s.getSrchPrmtrUseCntxtVlRngLwCd());
		}
		/******************** searchparameterusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory searchparameterusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		searchparameterusecontextvaluerangelow.setComparator(searchparameterusecontextvaluerangelowcomparator.fromCode(s.getSrchPrmtrUseCntxtVlRngLwCmprtr()));

		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngLwSys() != null) {
			searchparameterusecontextvaluerangelow.setSystem(s.getSrchPrmtrUseCntxtVlRngLwSys());
		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngLwUnt() != null) {
			searchparameterusecontextvaluerangelow.setUnit(s.getSrchPrmtrUseCntxtVlRngLwUnt());
		}
		/******************** SrchPrmtr_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRngLwVl() != null) {
			searchparameterusecontextvaluerangelow.setValue(Double.parseDouble((s.getSrchPrmtrUseCntxtVlRngLwVl())));
		}
		/******************** SrchPrmtr_UseCntxt_VlRfrnc ********************************************************************************/
		if(s.getSrchPrmtrUseCntxtVlRfrnc() != null) {
			searchparameterusecontext.setValue( new org.hl7.fhir.r4.model.Reference(s.getSrchPrmtrUseCntxtVlRfrnc()));
		}
		/******************** SrchPrmtr_Vrsn ********************************************************************************/
		if(s.getSrchPrmtrVrsn() != null) {
			searchparameter.setVersion(s.getSrchPrmtrVrsn());
		}
		/******************** SrchPrmtr_Xpath ********************************************************************************/
		if(s.getSrchPrmtrXpath() != null) {
			searchparameter.setXpath(s.getSrchPrmtrXpath());
		}
		/******************** searchparameterxpathusage ********************************************************************************/
		org.hl7.fhir.r4.model.SearchParameter.XPathUsageTypeEnumFactory searchparameterxpathusage =  new org.hl7.fhir.r4.model.SearchParameter.XPathUsageTypeEnumFactory();
		searchparameter.setXpathUsage(searchparameterxpathusage.fromCode(s.getSrchPrmtrXpathUsg()));

		return searchparameter;
	}
}
