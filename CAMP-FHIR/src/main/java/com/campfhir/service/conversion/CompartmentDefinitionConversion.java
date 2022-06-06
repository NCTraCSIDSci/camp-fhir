package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CompartmentDefinition;
public class CompartmentDefinitionConversion 
{
	public org.hl7.fhir.r4.model.CompartmentDefinition CompartmentDefinitions(CompartmentDefinition c) throws ParseException
	{
		org.hl7.fhir.r4.model.CompartmentDefinition compartmentdefinition = new org.hl7.fhir.r4.model.CompartmentDefinition();

		/******************** id ********************************************************************************/
		compartmentdefinition.setId(c.getId());

		/******************** compartmentdefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentTypeEnumFactory compartmentdefinitioncode =  new org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentTypeEnumFactory();
		compartmentdefinition.setCode(compartmentdefinitioncode.fromCode(c.getCmprtmntDfnCd()));

		/******************** compartmentdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail compartmentdefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		compartmentdefinition.addContact(compartmentdefinitioncontact);

		/******************** CmprtmntDfn_Cntct_Nm ********************************************************************************/
		if(c.getCmprtmntDfnCntctNm() != null) {
			compartmentdefinitioncontact.setName(c.getCmprtmntDfnCntctNm());
		}
		/******************** compartmentdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint compartmentdefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		compartmentdefinitioncontact.addTelecom(compartmentdefinitioncontacttelecom);

		/******************** compartmentdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period compartmentdefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		compartmentdefinitioncontacttelecom.setPeriod(compartmentdefinitioncontacttelecomperiod);

		/******************** CmprtmntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat CmprtmntDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmprtmntDfn_Cntct_Tlcm_Prd_Enddate = CmprtmntDfn_Cntct_Tlcm_Prd_Endsdf.parse(c.getCmprtmntDfnCntctTlcmPrdEnd());
			compartmentdefinitioncontacttelecomperiod.setEnd(CmprtmntDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** CmprtmntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat CmprtmntDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmprtmntDfn_Cntct_Tlcm_Prd_Strtdate = CmprtmntDfn_Cntct_Tlcm_Prd_Strtsdf.parse(c.getCmprtmntDfnCntctTlcmPrdStrt());
			compartmentdefinitioncontacttelecomperiod.setStart(CmprtmntDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** CmprtmntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmRnk() != null) {
			compartmentdefinitioncontacttelecom.setRank(Integer.parseInt(c.getCmprtmntDfnCntctTlcmRnk()));
		}
		/******************** compartmentdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory compartmentdefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		compartmentdefinitioncontacttelecom.setSystem(compartmentdefinitioncontacttelecomsystem.fromCode(c.getCmprtmntDfnCntctTlcmSys()));

		/******************** compartmentdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory compartmentdefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		compartmentdefinitioncontacttelecom.setUse(compartmentdefinitioncontacttelecomuse.fromCode(c.getCmprtmntDfnCntctTlcmUse()));

		/******************** CmprtmntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getCmprtmntDfnCntctTlcmVl() != null) {
			compartmentdefinitioncontacttelecom.setValue(c.getCmprtmntDfnCntctTlcmVl());
		}
		/******************** CmprtmntDfn_Dt ********************************************************************************/
		if(c.getCmprtmntDfnDt() != null) {
			java.text.SimpleDateFormat CmprtmntDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date CmprtmntDfn_Dtdate = CmprtmntDfn_Dtsdf.parse(c.getCmprtmntDfnDt());
			compartmentdefinition.setDate(CmprtmntDfn_Dtdate);
		}
		/******************** CmprtmntDfn_Dscrptn ********************************************************************************/
		if(c.getCmprtmntDfnDscrptn() != null) {
			compartmentdefinition.setDescription(c.getCmprtmntDfnDscrptn());
		}
		/******************** CmprtmntDfn_Exprmtl ********************************************************************************/
		if(c.getCmprtmntDfnExprmtl() != null) {
			compartmentdefinition.setExperimental(Boolean.parseBoolean(c.getCmprtmntDfnExprmtl()));
		}
		/******************** CmprtmntDfn_Nm ********************************************************************************/
		if(c.getCmprtmntDfnNm() != null) {
			compartmentdefinition.setName(c.getCmprtmntDfnNm());
		}
		/******************** CmprtmntDfn_Pblshr ********************************************************************************/
		if(c.getCmprtmntDfnPblshr() != null) {
			compartmentdefinition.setPublisher(c.getCmprtmntDfnPblshr());
		}
		/******************** CmprtmntDfn_Prpse ********************************************************************************/
		if(c.getCmprtmntDfnPrpse() != null) {
			compartmentdefinition.setPurpose(c.getCmprtmntDfnPrpse());
		}
		/******************** compartmentdefinitionresource ********************************************************************************/
		org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent compartmentdefinitionresource =  new org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent();
		compartmentdefinition.addResource(compartmentdefinitionresource);

		/******************** CmprtmntDfn_Rsrc_Cd ********************************************************************************/
		if(c.getCmprtmntDfnRsrcCd() != null) {
			compartmentdefinitionresource.setCode(c.getCmprtmntDfnRsrcCd());
		}
		/******************** CmprtmntDfn_Rsrc_Docation ********************************************************************************/
		if(c.getCmprtmntDfnRsrcDocation() != null) {
			compartmentdefinitionresource.setDocumentation(c.getCmprtmntDfnRsrcDocation());
		}
		/******************** CmprtmntDfn_Rsrc_Param ********************************************************************************/
		if(c.getCmprtmntDfnRsrcParam() != null) {
			compartmentdefinitionresource.addParam(c.getCmprtmntDfnRsrcParam());
		}
		/******************** CmprtmntDfn_Srch ********************************************************************************/
		if(c.getCmprtmntDfnSrch() != null) {
			compartmentdefinition.setSearch(Boolean.parseBoolean(c.getCmprtmntDfnSrch()));
		}
		/******************** compartmentdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory compartmentdefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		compartmentdefinition.setStatus(compartmentdefinitionstatus.fromCode(c.getCmprtmntDfnSts()));

		/******************** CmprtmntDfn_Url ********************************************************************************/
		if(c.getCmprtmntDfnUrl() != null) {
			compartmentdefinition.setUrl(c.getCmprtmntDfnUrl());
		}
		/******************** compartmentdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext compartmentdefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		compartmentdefinition.addUseContext(compartmentdefinitionusecontext);

		/******************** compartmentdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compartmentdefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		compartmentdefinitionusecontext.setCode(compartmentdefinitionusecontextcode);

		/******************** CmprtmntDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdCd() != null) {
			compartmentdefinitionusecontextcode.setCode(c.getCmprtmntDfnUseCntxtCdCd());
		}
		/******************** CmprtmntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdDsply() != null) {
			compartmentdefinitionusecontextcode.setDisplay(c.getCmprtmntDfnUseCntxtCdDsply());
		}
		/******************** CmprtmntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdSys() != null) {
			compartmentdefinitionusecontextcode.setSystem(c.getCmprtmntDfnUseCntxtCdSys());
		}
		/******************** CmprtmntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdUsrSltd() != null) {
			compartmentdefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(c.getCmprtmntDfnUseCntxtCdUsrSltd()));
		}
		/******************** CmprtmntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtCdVrsn() != null) {
			compartmentdefinitionusecontextcode.setVersion(c.getCmprtmntDfnUseCntxtCdVrsn());
		}
		/******************** compartmentdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compartmentdefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		compartmentdefinitionusecontext.setValue(compartmentdefinitionusecontextvaluecodeableconcept);

		/******************** compartmentdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compartmentdefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		compartmentdefinitionusecontextvaluecodeableconcept.addCoding(compartmentdefinitionusecontextvaluecodeableconceptcoding);

		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			compartmentdefinitionusecontextvaluecodeableconceptcoding.setCode(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			compartmentdefinitionusecontextvaluecodeableconceptcoding.setDisplay(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			compartmentdefinitionusecontextvaluecodeableconceptcoding.setSystem(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			compartmentdefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			compartmentdefinitionusecontextvaluecodeableconceptcoding.setVersion(c.getCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlCdbleCncptTxt() != null) {
			compartmentdefinitionusecontextvaluecodeableconcept.setText(c.getCmprtmntDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** compartmentdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity compartmentdefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		compartmentdefinitionusecontext.setValue(compartmentdefinitionusecontextvaluequantity);

		/******************** CmprtmntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlQntyCd() != null) {
			compartmentdefinitionusecontextvaluequantity.setCode(c.getCmprtmntDfnUseCntxtVlQntyCd());
		}
		/******************** compartmentdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory compartmentdefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		compartmentdefinitionusecontextvaluequantity.setComparator(compartmentdefinitionusecontextvaluequantitycomparator.fromCode(c.getCmprtmntDfnUseCntxtVlQntyCmprtr()));

		/******************** CmprtmntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlQntySys() != null) {
			compartmentdefinitionusecontextvaluequantity.setSystem(c.getCmprtmntDfnUseCntxtVlQntySys());
		}
		/******************** CmprtmntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlQntyUnt() != null) {
			compartmentdefinitionusecontextvaluequantity.setUnit(c.getCmprtmntDfnUseCntxtVlQntyUnt());
		}
		/******************** CmprtmntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlQntyVl() != null) {
			compartmentdefinitionusecontextvaluequantity.setValue(Double.parseDouble((c.getCmprtmntDfnUseCntxtVlQntyVl())));
		}
		/******************** compartmentdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range compartmentdefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		compartmentdefinitionusecontext.setValue(compartmentdefinitionusecontextvaluerange);

		/******************** compartmentdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity compartmentdefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		compartmentdefinitionusecontextvaluerange.setHigh(compartmentdefinitionusecontextvaluerangehigh);

		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngHiCd() != null) {
			compartmentdefinitionusecontextvaluerangehigh.setCode(c.getCmprtmntDfnUseCntxtVlRngHiCd());
		}
		/******************** compartmentdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory compartmentdefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		compartmentdefinitionusecontextvaluerangehigh.setComparator(compartmentdefinitionusecontextvaluerangehighcomparator.fromCode(c.getCmprtmntDfnUseCntxtVlRngHiCmprtr()));

		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngHiSys() != null) {
			compartmentdefinitionusecontextvaluerangehigh.setSystem(c.getCmprtmntDfnUseCntxtVlRngHiSys());
		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngHiUnt() != null) {
			compartmentdefinitionusecontextvaluerangehigh.setUnit(c.getCmprtmntDfnUseCntxtVlRngHiUnt());
		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngHiVl() != null) {
			compartmentdefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((c.getCmprtmntDfnUseCntxtVlRngHiVl())));
		}
		/******************** compartmentdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity compartmentdefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		compartmentdefinitionusecontextvaluerange.setLow(compartmentdefinitionusecontextvaluerangelow);

		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngLwCd() != null) {
			compartmentdefinitionusecontextvaluerangelow.setCode(c.getCmprtmntDfnUseCntxtVlRngLwCd());
		}
		/******************** compartmentdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory compartmentdefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		compartmentdefinitionusecontextvaluerangelow.setComparator(compartmentdefinitionusecontextvaluerangelowcomparator.fromCode(c.getCmprtmntDfnUseCntxtVlRngLwCmprtr()));

		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngLwSys() != null) {
			compartmentdefinitionusecontextvaluerangelow.setSystem(c.getCmprtmntDfnUseCntxtVlRngLwSys());
		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngLwUnt() != null) {
			compartmentdefinitionusecontextvaluerangelow.setUnit(c.getCmprtmntDfnUseCntxtVlRngLwUnt());
		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRngLwVl() != null) {
			compartmentdefinitionusecontextvaluerangelow.setValue(Double.parseDouble((c.getCmprtmntDfnUseCntxtVlRngLwVl())));
		}
		/******************** CmprtmntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getCmprtmntDfnUseCntxtVlRfrnc() != null) {
			compartmentdefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(c.getCmprtmntDfnUseCntxtVlRfrnc()));
		}
		/******************** CmprtmntDfn_Vrsn ********************************************************************************/
		if(c.getCmprtmntDfnVrsn() != null) {
			compartmentdefinition.setVersion(c.getCmprtmntDfnVrsn());
		}
		return compartmentdefinition;
	}
}
