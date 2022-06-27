package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CompartmentDefinition;
public class CompartmentDefinitionBidirectionalConversion 
{
	public CompartmentDefinition CompartmentDefinitions(org.hl7.fhir.r4.model.CompartmentDefinition compartmentdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.CompartmentDefinition c = new  main.java.com.campfhir.model.CompartmentDefinition();

		/******************** id ********************************************************************************/
		compartmentdefinition.setId(c.getId());

		/******************** CmprtmntDfn_Nm ********************************************************************************/
		if(compartmentdefinition.hasName()) {
			c.setCmprtmntDfnNm(String.valueOf(compartmentdefinition.getName()));
		}
		/******************** CmprtmntDfn_Dt ********************************************************************************/
		if(compartmentdefinition.hasDate()) {
			c.setCmprtmntDfnDt(String.valueOf(compartmentdefinition.getDate()));
		}
		/******************** CmprtmntDfn_Vrsn ********************************************************************************/
		if(compartmentdefinition.hasVersion()) {
			c.setCmprtmntDfnVrsn(String.valueOf(compartmentdefinition.getVersion()));
		}
		/******************** compartmentdefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentType compartmentdefinitioncode = compartmentdefinition.getCode();
		c.setCmprtmntDfnCd(compartmentdefinitioncode.toCode());

		/******************** compartmentdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus compartmentdefinitionstatus = compartmentdefinition.getStatus();
		c.setCmprtmntDfnSts(compartmentdefinitionstatus.toCode());

		/******************** CmprtmntDfn_Dscrptn ********************************************************************************/
		if(compartmentdefinition.hasDescription()) {
			c.setCmprtmntDfnDscrptn(String.valueOf(compartmentdefinition.getDescription()));
		}
		/******************** CmprtmntDfn_Url ********************************************************************************/
		if(compartmentdefinition.hasUrl()) {
			c.setCmprtmntDfnUrl(String.valueOf(compartmentdefinition.getUrl()));
		}
		/******************** CmprtmntDfn_Srch ********************************************************************************/
		if(compartmentdefinition.hasSearch()) {
			c.setCmprtmntDfnSrch(String.valueOf(compartmentdefinition.getSearch()));
		}
		/******************** CmprtmntDfn_Pblshr ********************************************************************************/
		if(compartmentdefinition.hasPublisher()) {
			c.setCmprtmntDfnPblshr(String.valueOf(compartmentdefinition.getPublisher()));
		}
		/******************** CmprtmntDfn_Exprmtl ********************************************************************************/
		if(compartmentdefinition.hasExperimental()) {
			c.setCmprtmntDfnExprmtl(String.valueOf(compartmentdefinition.getExperimental()));
		}
		/******************** CmprtmntDfn_Prpse ********************************************************************************/
		if(compartmentdefinition.hasPurpose()) {
			c.setCmprtmntDfnPrpse(String.valueOf(compartmentdefinition.getPurpose()));
		}
		/******************** compartmentdefinitionresource ********************************************************************************/
		org.hl7.fhir.r4.model.CompartmentDefinition.CompartmentDefinitionResourceComponent compartmentdefinitionresource = compartmentdefinition.getResourceFirstRep();

		/******************** CmprtmntDfn_Rsrc_Cd ********************************************************************************/
		if(compartmentdefinitionresource.hasCode()) {
			c.setCmprtmntDfnRsrcCd(String.valueOf(compartmentdefinitionresource.getCode()));
		}
		/******************** CmprtmntDfn_Rsrc_Docation ********************************************************************************/
		if(compartmentdefinitionresource.hasDocumentation()) {
			c.setCmprtmntDfnRsrcDocation(String.valueOf(compartmentdefinitionresource.getDocumentation()));
		}
		/******************** compartmentdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail compartmentdefinitioncontact = compartmentdefinition.getContactFirstRep();

		/******************** CmprtmntDfn_Cntct_Nm ********************************************************************************/
		if(compartmentdefinitioncontact.hasName()) {
			c.setCmprtmntDfnCntctNm(String.valueOf(compartmentdefinitioncontact.getName()));
		}
		/******************** compartmentdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint compartmentdefinitioncontacttelecom = compartmentdefinitioncontact.getTelecomFirstRep();

		/******************** CmprtmntDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(compartmentdefinitioncontacttelecom.hasValue()) {
			c.setCmprtmntDfnCntctTlcmVl(String.valueOf(compartmentdefinitioncontacttelecom.getValue()));
		}
		/******************** compartmentdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period compartmentdefinitioncontacttelecomperiod = compartmentdefinitioncontacttelecom.getPeriod();

		/******************** CmprtmntDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(compartmentdefinitioncontacttelecomperiod.hasStart()) {
			c.setCmprtmntDfnCntctTlcmPrdStrt(String.valueOf(compartmentdefinitioncontacttelecomperiod.getStart()));
		}
		/******************** CmprtmntDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(compartmentdefinitioncontacttelecomperiod.hasEnd()) {
			c.setCmprtmntDfnCntctTlcmPrdEnd(String.valueOf(compartmentdefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** compartmentdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem compartmentdefinitioncontacttelecomsystem = compartmentdefinitioncontacttelecom.getSystem();
		c.setCmprtmntDfnCntctTlcmSys(compartmentdefinitioncontacttelecomsystem.toCode());

		/******************** compartmentdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse compartmentdefinitioncontacttelecomuse = compartmentdefinitioncontacttelecom.getUse();
		c.setCmprtmntDfnCntctTlcmUse(compartmentdefinitioncontacttelecomuse.toCode());

		/******************** CmprtmntDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(compartmentdefinitioncontacttelecom.hasRank()) {
			c.setCmprtmntDfnCntctTlcmRnk(String.valueOf(compartmentdefinitioncontacttelecom.getRank()));
		}
		/******************** compartmentdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext compartmentdefinitionusecontext = compartmentdefinition.getUseContextFirstRep();

		/******************** compartmentdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compartmentdefinitionusecontextcode = compartmentdefinitionusecontext.getCode();

		/******************** CmprtmntDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(compartmentdefinitionusecontextcode.hasVersion()) {
			c.setCmprtmntDfnUseCntxtCdVrsn(String.valueOf(compartmentdefinitionusecontextcode.getVersion()));
		}
		/******************** CmprtmntDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(compartmentdefinitionusecontextcode.hasDisplay()) {
			c.setCmprtmntDfnUseCntxtCdDsply(String.valueOf(compartmentdefinitionusecontextcode.getDisplay()));
		}
		/******************** CmprtmntDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(compartmentdefinitionusecontextcode.hasUserSelected()) {
			c.setCmprtmntDfnUseCntxtCdUsrSltd(String.valueOf(compartmentdefinitionusecontextcode.getUserSelected()));
		}
		/******************** CmprtmntDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(compartmentdefinitionusecontextcode.hasSystem()) {
			c.setCmprtmntDfnUseCntxtCdSys(String.valueOf(compartmentdefinitionusecontextcode.getSystem()));
		}
		/******************** compartmentdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept compartmentdefinitionusecontextvaluecodeableconcept = compartmentdefinitionusecontext.getValueCodeableConcept();

		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconcept.hasText()) {
			c.setCmprtmntDfnUseCntxtVlCdbleCncptTxt(String.valueOf(compartmentdefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** compartmentdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding compartmentdefinitionusecontextvaluecodeableconceptcoding = compartmentdefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			c.setCmprtmntDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			c.setCmprtmntDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			c.setCmprtmntDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			c.setCmprtmntDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(compartmentdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			c.setCmprtmntDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(compartmentdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** compartmentdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity compartmentdefinitionusecontextvaluequantity = compartmentdefinitionusecontext.getValueQuantity();

		/******************** CmprtmntDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(compartmentdefinitionusecontextvaluequantity.hasValue()) {
			c.setCmprtmntDfnUseCntxtVlQntyVl(String.valueOf(compartmentdefinitionusecontextvaluequantity.getValue()));
		}
		/******************** compartmentdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator compartmentdefinitionusecontextvaluequantitycomparator = compartmentdefinitionusecontextvaluequantity.getComparator();
		c.setCmprtmntDfnUseCntxtVlQntyCmprtr(compartmentdefinitionusecontextvaluequantitycomparator.toCode());

		/******************** CmprtmntDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(compartmentdefinitionusecontextvaluequantity.hasCode()) {
			c.setCmprtmntDfnUseCntxtVlQntyCd(String.valueOf(compartmentdefinitionusecontextvaluequantity.getCode()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(compartmentdefinitionusecontextvaluequantity.hasUnit()) {
			c.setCmprtmntDfnUseCntxtVlQntyUnt(String.valueOf(compartmentdefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(compartmentdefinitionusecontextvaluequantity.hasSystem()) {
			c.setCmprtmntDfnUseCntxtVlQntySys(String.valueOf(compartmentdefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** compartmentdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range compartmentdefinitionusecontextvaluerange = compartmentdefinitionusecontext.getValueRange();

		/******************** compartmentdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity compartmentdefinitionusecontextvaluerangelow = compartmentdefinitionusecontextvaluerange.getLow();

		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(compartmentdefinitionusecontextvaluerangelow.hasValue()) {
			c.setCmprtmntDfnUseCntxtVlRngLwVl(String.valueOf(compartmentdefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** compartmentdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator compartmentdefinitionusecontextvaluerangelowcomparator = compartmentdefinitionusecontextvaluerangelow.getComparator();
		c.setCmprtmntDfnUseCntxtVlRngLwCmprtr(compartmentdefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(compartmentdefinitionusecontextvaluerangelow.hasCode()) {
			c.setCmprtmntDfnUseCntxtVlRngLwCd(String.valueOf(compartmentdefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(compartmentdefinitionusecontextvaluerangelow.hasUnit()) {
			c.setCmprtmntDfnUseCntxtVlRngLwUnt(String.valueOf(compartmentdefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(compartmentdefinitionusecontextvaluerangelow.hasSystem()) {
			c.setCmprtmntDfnUseCntxtVlRngLwSys(String.valueOf(compartmentdefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** compartmentdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity compartmentdefinitionusecontextvaluerangehigh = compartmentdefinitionusecontextvaluerange.getHigh();

		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(compartmentdefinitionusecontextvaluerangehigh.hasValue()) {
			c.setCmprtmntDfnUseCntxtVlRngHiVl(String.valueOf(compartmentdefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** compartmentdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator compartmentdefinitionusecontextvaluerangehighcomparator = compartmentdefinitionusecontextvaluerangehigh.getComparator();
		c.setCmprtmntDfnUseCntxtVlRngHiCmprtr(compartmentdefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(compartmentdefinitionusecontextvaluerangehigh.hasCode()) {
			c.setCmprtmntDfnUseCntxtVlRngHiCd(String.valueOf(compartmentdefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(compartmentdefinitionusecontextvaluerangehigh.hasUnit()) {
			c.setCmprtmntDfnUseCntxtVlRngHiUnt(String.valueOf(compartmentdefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(compartmentdefinitionusecontextvaluerangehigh.hasSystem()) {
			c.setCmprtmntDfnUseCntxtVlRngHiSys(String.valueOf(compartmentdefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** CmprtmntDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(compartmentdefinitionusecontext.hasValueReference()) {
			c.setCmprtmntDfnUseCntxtVlRfrnc(String.valueOf(compartmentdefinitionusecontext.getValueReference()));
		}
		return c;
	}
}
