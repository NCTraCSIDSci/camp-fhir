package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OperationDefinition;
public class OperationDefinitionBidirectionalConversion 
{
	public OperationDefinition OperationDefinitions(org.hl7.fhir.r4.model.OperationDefinition operationdefinition) throws ParseException
	{
		 main.java.com.campfhir.model.OperationDefinition o = new  main.java.com.campfhir.model.OperationDefinition();

		/******************** id ********************************************************************************/
		operationdefinition.setId(o.getId());

		/******************** OprtnDfn_Nm ********************************************************************************/
		if(operationdefinition.hasName()) {
			o.setOprtnDfnNm(String.valueOf(operationdefinition.getName()));
		}
		/******************** OprtnDfn_Instance ********************************************************************************/
		if(operationdefinition.hasInstance()) {
			o.setOprtnDfnInstance(String.valueOf(operationdefinition.getInstance()));
		}
		/******************** OprtnDfn_Typ ********************************************************************************/
		if(operationdefinition.hasType()) {
			o.setOprtnDfnTyp(String.valueOf(operationdefinition.getType()));
		}
		/******************** OprtnDfn_Comment ********************************************************************************/
		if(operationdefinition.hasComment()) {
			o.setOprtnDfnComment(String.valueOf(operationdefinition.getComment()));
		}
		/******************** OprtnDfn_Base ********************************************************************************/
		if(operationdefinition.hasBase()) {
			o.setOprtnDfnBase(String.valueOf(operationdefinition.getBase()));
		}
		/******************** operationdefinitionparameter ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent operationdefinitionparameter = operationdefinition.getParameterFirstRep();

		/******************** OprtnDfn_Prmtr_Nm ********************************************************************************/
		if(operationdefinitionparameter.hasName()) {
			o.setOprtnDfnPrmtrNm(String.valueOf(operationdefinitionparameter.getName()));
		}
		/******************** OprtnDfn_Prmtr_Typ ********************************************************************************/
		if(operationdefinitionparameter.hasType()) {
			o.setOprtnDfnPrmtrTyp(String.valueOf(operationdefinitionparameter.getType()));
		}
		/******************** OprtnDfn_Prmtr_Mx ********************************************************************************/
		if(operationdefinitionparameter.hasMax()) {
			o.setOprtnDfnPrmtrMx(String.valueOf(operationdefinitionparameter.getMax()));
		}
		/******************** OprtnDfn_Prmtr_Min ********************************************************************************/
		if(operationdefinitionparameter.hasMin()) {
			o.setOprtnDfnPrmtrMin(String.valueOf(operationdefinitionparameter.getMin()));
		}
		/******************** operationdefinitionparameterreferencedfrom ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterReferencedFromComponent operationdefinitionparameterreferencedfrom = operationdefinitionparameter.getReferencedFromFirstRep();

		/******************** OprtnDfn_Prmtr_RfrncdFrom_Src ********************************************************************************/
		if(operationdefinitionparameterreferencedfrom.hasSource()) {
			o.setOprtnDfnPrmtrRfrncdFromSrc(String.valueOf(operationdefinitionparameterreferencedfrom.getSource()));
		}
		/******************** OprtnDfn_Prmtr_RfrncdFrom_SrcId ********************************************************************************/
		if(operationdefinitionparameterreferencedfrom.hasSourceId()) {
			o.setOprtnDfnPrmtrRfrncdFromSrcId(String.valueOf(operationdefinitionparameterreferencedfrom.getSourceId()));
		}
		/******************** operationdefinitionparameteruse ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUse operationdefinitionparameteruse = operationdefinitionparameter.getUse();
		o.setOprtnDfnPrmtrUse(operationdefinitionparameteruse.toCode());

		/******************** OprtnDfn_Prmtr_Docation ********************************************************************************/
		if(operationdefinitionparameter.hasDocumentation()) {
			o.setOprtnDfnPrmtrDocation(String.valueOf(operationdefinitionparameter.getDocumentation()));
		}
		/******************** operationdefinitionparametersearchtype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamType operationdefinitionparametersearchtype = operationdefinitionparameter.getSearchType();
		o.setOprtnDfnPrmtrSrchTyp(operationdefinitionparametersearchtype.toCode());

		/******************** operationdefinitionparameterbinding ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent operationdefinitionparameterbinding = operationdefinitionparameter.getBinding();

		/******************** operationdefinitionparameterbindingstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.BindingStrength operationdefinitionparameterbindingstrength = operationdefinitionparameterbinding.getStrength();
		o.setOprtnDfnPrmtrBindingStr(operationdefinitionparameterbindingstrength.toCode());

		/******************** OprtnDfn_Prmtr_Binding_VlSt ********************************************************************************/
		if(operationdefinitionparameterbinding.hasValueSet()) {
			o.setOprtnDfnPrmtrBindingVlSt(String.valueOf(operationdefinitionparameterbinding.getValueSet()));
		}
		/******************** OprtnDfn_Vrsn ********************************************************************************/
		if(operationdefinition.hasVersion()) {
			o.setOprtnDfnVrsn(String.valueOf(operationdefinition.getVersion()));
		}
		/******************** OprtnDfn_Dt ********************************************************************************/
		if(operationdefinition.hasDate()) {
			o.setOprtnDfnDt(String.valueOf(operationdefinition.getDate()));
		}
		/******************** OprtnDfn_Cd ********************************************************************************/
		if(operationdefinition.hasCode()) {
			o.setOprtnDfnCd(String.valueOf(operationdefinition.getCode()));
		}
		/******************** OprtnDfn_Url ********************************************************************************/
		if(operationdefinition.hasUrl()) {
			o.setOprtnDfnUrl(String.valueOf(operationdefinition.getUrl()));
		}
		/******************** OprtnDfn_Sys ********************************************************************************/
		if(operationdefinition.hasSystem()) {
			o.setOprtnDfnSys(String.valueOf(operationdefinition.getSystem()));
		}
		/******************** operationdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept operationdefinitionjurisdiction = operationdefinition.getJurisdictionFirstRep();

		/******************** operationdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding operationdefinitionjurisdictioncoding = operationdefinitionjurisdiction.getCodingFirstRep();

		/******************** OprtnDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(operationdefinitionjurisdictioncoding.hasDisplay()) {
			o.setOprtnDfnJrsdctnCdgDsply(String.valueOf(operationdefinitionjurisdictioncoding.getDisplay()));
		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(operationdefinitionjurisdictioncoding.hasVersion()) {
			o.setOprtnDfnJrsdctnCdgVrsn(String.valueOf(operationdefinitionjurisdictioncoding.getVersion()));
		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(operationdefinitionjurisdictioncoding.hasCode()) {
			o.setOprtnDfnJrsdctnCdgCd(String.valueOf(operationdefinitionjurisdictioncoding.getCode()));
		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(operationdefinitionjurisdictioncoding.hasSystem()) {
			o.setOprtnDfnJrsdctnCdgSys(String.valueOf(operationdefinitionjurisdictioncoding.getSystem()));
		}
		/******************** OprtnDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(operationdefinitionjurisdictioncoding.hasUserSelected()) {
			o.setOprtnDfnJrsdctnCdgUsrSltd(String.valueOf(operationdefinitionjurisdictioncoding.getUserSelected()));
		}
		/******************** OprtnDfn_Jrsdctn_Txt ********************************************************************************/
		if(operationdefinitionjurisdiction.hasText()) {
			o.setOprtnDfnJrsdctnTxt(String.valueOf(operationdefinitionjurisdiction.getText()));
		}
		/******************** operationdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext operationdefinitionusecontext = operationdefinition.getUseContextFirstRep();

		/******************** operationdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding operationdefinitionusecontextcode = operationdefinitionusecontext.getCode();

		/******************** OprtnDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(operationdefinitionusecontextcode.hasDisplay()) {
			o.setOprtnDfnUseCntxtCdDsply(String.valueOf(operationdefinitionusecontextcode.getDisplay()));
		}
		/******************** OprtnDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(operationdefinitionusecontextcode.hasVersion()) {
			o.setOprtnDfnUseCntxtCdVrsn(String.valueOf(operationdefinitionusecontextcode.getVersion()));
		}
		/******************** OprtnDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(operationdefinitionusecontextcode.hasSystem()) {
			o.setOprtnDfnUseCntxtCdSys(String.valueOf(operationdefinitionusecontextcode.getSystem()));
		}
		/******************** OprtnDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(operationdefinitionusecontextcode.hasUserSelected()) {
			o.setOprtnDfnUseCntxtCdUsrSltd(String.valueOf(operationdefinitionusecontextcode.getUserSelected()));
		}
		/******************** operationdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept operationdefinitionusecontextvaluecodeableconcept = operationdefinitionusecontext.getValueCodeableConcept();

		/******************** operationdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding operationdefinitionusecontextvaluecodeableconceptcoding = operationdefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			o.setOprtnDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			o.setOprtnDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			o.setOprtnDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			o.setOprtnDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			o.setOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(operationdefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(operationdefinitionusecontextvaluecodeableconcept.hasText()) {
			o.setOprtnDfnUseCntxtVlCdbleCncptTxt(String.valueOf(operationdefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** operationdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity operationdefinitionusecontextvaluequantity = operationdefinitionusecontext.getValueQuantity();

		/******************** OprtnDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(operationdefinitionusecontextvaluequantity.hasValue()) {
			o.setOprtnDfnUseCntxtVlQntyVl(String.valueOf(operationdefinitionusecontextvaluequantity.getValue()));
		}
		/******************** operationdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator operationdefinitionusecontextvaluequantitycomparator = operationdefinitionusecontextvaluequantity.getComparator();
		o.setOprtnDfnUseCntxtVlQntyCmprtr(operationdefinitionusecontextvaluequantitycomparator.toCode());

		/******************** OprtnDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(operationdefinitionusecontextvaluequantity.hasCode()) {
			o.setOprtnDfnUseCntxtVlQntyCd(String.valueOf(operationdefinitionusecontextvaluequantity.getCode()));
		}
		/******************** OprtnDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(operationdefinitionusecontextvaluequantity.hasSystem()) {
			o.setOprtnDfnUseCntxtVlQntySys(String.valueOf(operationdefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** OprtnDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(operationdefinitionusecontextvaluequantity.hasUnit()) {
			o.setOprtnDfnUseCntxtVlQntyUnt(String.valueOf(operationdefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** operationdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range operationdefinitionusecontextvaluerange = operationdefinitionusecontext.getValueRange();

		/******************** operationdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity operationdefinitionusecontextvaluerangelow = operationdefinitionusecontextvaluerange.getLow();

		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(operationdefinitionusecontextvaluerangelow.hasValue()) {
			o.setOprtnDfnUseCntxtVlRngLwVl(String.valueOf(operationdefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** operationdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator operationdefinitionusecontextvaluerangelowcomparator = operationdefinitionusecontextvaluerangelow.getComparator();
		o.setOprtnDfnUseCntxtVlRngLwCmprtr(operationdefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(operationdefinitionusecontextvaluerangelow.hasCode()) {
			o.setOprtnDfnUseCntxtVlRngLwCd(String.valueOf(operationdefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(operationdefinitionusecontextvaluerangelow.hasSystem()) {
			o.setOprtnDfnUseCntxtVlRngLwSys(String.valueOf(operationdefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(operationdefinitionusecontextvaluerangelow.hasUnit()) {
			o.setOprtnDfnUseCntxtVlRngLwUnt(String.valueOf(operationdefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** operationdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity operationdefinitionusecontextvaluerangehigh = operationdefinitionusecontextvaluerange.getHigh();

		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(operationdefinitionusecontextvaluerangehigh.hasValue()) {
			o.setOprtnDfnUseCntxtVlRngHiVl(String.valueOf(operationdefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** operationdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator operationdefinitionusecontextvaluerangehighcomparator = operationdefinitionusecontextvaluerangehigh.getComparator();
		o.setOprtnDfnUseCntxtVlRngHiCmprtr(operationdefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(operationdefinitionusecontextvaluerangehigh.hasCode()) {
			o.setOprtnDfnUseCntxtVlRngHiCd(String.valueOf(operationdefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(operationdefinitionusecontextvaluerangehigh.hasSystem()) {
			o.setOprtnDfnUseCntxtVlRngHiSys(String.valueOf(operationdefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(operationdefinitionusecontextvaluerangehigh.hasUnit()) {
			o.setOprtnDfnUseCntxtVlRngHiUnt(String.valueOf(operationdefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** OprtnDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(operationdefinitionusecontext.hasValueReference()) {
			o.setOprtnDfnUseCntxtVlRfrnc(String.valueOf(operationdefinitionusecontext.getValueReference()));
		}
		/******************** operationdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus operationdefinitionstatus = operationdefinition.getStatus();
		o.setOprtnDfnSts(operationdefinitionstatus.toCode());

		/******************** OprtnDfn_Dscrptn ********************************************************************************/
		if(operationdefinition.hasDescription()) {
			o.setOprtnDfnDscrptn(String.valueOf(operationdefinition.getDescription()));
		}
		/******************** operationdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail operationdefinitioncontact = operationdefinition.getContactFirstRep();

		/******************** OprtnDfn_Cntct_Nm ********************************************************************************/
		if(operationdefinitioncontact.hasName()) {
			o.setOprtnDfnCntctNm(String.valueOf(operationdefinitioncontact.getName()));
		}
		/******************** operationdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint operationdefinitioncontacttelecom = operationdefinitioncontact.getTelecomFirstRep();

		/******************** OprtnDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(operationdefinitioncontacttelecom.hasValue()) {
			o.setOprtnDfnCntctTlcmVl(String.valueOf(operationdefinitioncontacttelecom.getValue()));
		}
		/******************** operationdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem operationdefinitioncontacttelecomsystem = operationdefinitioncontacttelecom.getSystem();
		o.setOprtnDfnCntctTlcmSys(operationdefinitioncontacttelecomsystem.toCode());

		/******************** operationdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period operationdefinitioncontacttelecomperiod = operationdefinitioncontacttelecom.getPeriod();

		/******************** OprtnDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(operationdefinitioncontacttelecomperiod.hasEnd()) {
			o.setOprtnDfnCntctTlcmPrdEnd(String.valueOf(operationdefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** OprtnDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(operationdefinitioncontacttelecomperiod.hasStart()) {
			o.setOprtnDfnCntctTlcmPrdStrt(String.valueOf(operationdefinitioncontacttelecomperiod.getStart()));
		}
		/******************** operationdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse operationdefinitioncontacttelecomuse = operationdefinitioncontacttelecom.getUse();
		o.setOprtnDfnCntctTlcmUse(operationdefinitioncontacttelecomuse.toCode());

		/******************** OprtnDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(operationdefinitioncontacttelecom.hasRank()) {
			o.setOprtnDfnCntctTlcmRnk(String.valueOf(operationdefinitioncontacttelecom.getRank()));
		}
		/******************** operationdefinitionoverload ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionOverloadComponent operationdefinitionoverload = operationdefinition.getOverloadFirstRep();

		/******************** OprtnDfn_Overload_Comment ********************************************************************************/
		if(operationdefinitionoverload.hasComment()) {
			o.setOprtnDfnOverloadComment(String.valueOf(operationdefinitionoverload.getComment()));
		}
		/******************** OprtnDfn_Ttl ********************************************************************************/
		if(operationdefinition.hasTitle()) {
			o.setOprtnDfnTtl(String.valueOf(operationdefinition.getTitle()));
		}
		/******************** OprtnDfn_Exprmtl ********************************************************************************/
		if(operationdefinition.hasExperimental()) {
			o.setOprtnDfnExprmtl(String.valueOf(operationdefinition.getExperimental()));
		}
		/******************** OprtnDfn_Pblshr ********************************************************************************/
		if(operationdefinition.hasPublisher()) {
			o.setOprtnDfnPblshr(String.valueOf(operationdefinition.getPublisher()));
		}
		/******************** OprtnDfn_Prpse ********************************************************************************/
		if(operationdefinition.hasPurpose()) {
			o.setOprtnDfnPrpse(String.valueOf(operationdefinition.getPurpose()));
		}
		/******************** operationdefinitionkind ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationKind operationdefinitionkind = operationdefinition.getKind();
		o.setOprtnDfnKind(operationdefinitionkind.toCode());

		/******************** OprtnDfn_AffectsState ********************************************************************************/
		if(operationdefinition.hasAffectsState()) {
			o.setOprtnDfnAffectsState(String.valueOf(operationdefinition.getAffectsState()));
		}
		/******************** OprtnDfn_OutputProfile ********************************************************************************/
		if(operationdefinition.hasOutputProfile()) {
			o.setOprtnDfnOutputProfile(String.valueOf(operationdefinition.getOutputProfile()));
		}
		/******************** OprtnDfn_InputProfile ********************************************************************************/
		if(operationdefinition.hasInputProfile()) {
			o.setOprtnDfnInputProfile(String.valueOf(operationdefinition.getInputProfile()));
		}
		return o;
	}
}
