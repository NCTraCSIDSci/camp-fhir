package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.OperationDefinition;
public class OperationDefinitionConversion 
{
	public org.hl7.fhir.r4.model.OperationDefinition OperationDefinitions(OperationDefinition o) throws ParseException
	{
		org.hl7.fhir.r4.model.OperationDefinition operationdefinition = new org.hl7.fhir.r4.model.OperationDefinition();

		/******************** id ********************************************************************************/
		operationdefinition.setId(o.getId());

		/******************** OprtnDfn_AffectsState ********************************************************************************/
		if(o.getOprtnDfnAffectsState() != null) {
			operationdefinition.setAffectsState(Boolean.parseBoolean(o.getOprtnDfnAffectsState()));
		}
		/******************** OprtnDfn_Base ********************************************************************************/
		if(o.getOprtnDfnBase() != null) {
			operationdefinition.setBase(o.getOprtnDfnBase());
		}
		/******************** OprtnDfn_Cd ********************************************************************************/
		if(o.getOprtnDfnCd() != null) {
			operationdefinition.setCode(o.getOprtnDfnCd());
		}
		/******************** OprtnDfn_Comment ********************************************************************************/
		if(o.getOprtnDfnComment() != null) {
			operationdefinition.setComment(o.getOprtnDfnComment());
		}
		/******************** operationdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail operationdefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		operationdefinition.addContact(operationdefinitioncontact);

		/******************** OprtnDfn_Cntct_Nm ********************************************************************************/
		if(o.getOprtnDfnCntctNm() != null) {
			operationdefinitioncontact.setName(o.getOprtnDfnCntctNm());
		}
		/******************** operationdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint operationdefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		operationdefinitioncontact.addTelecom(operationdefinitioncontacttelecom);

		/******************** operationdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period operationdefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		operationdefinitioncontacttelecom.setPeriod(operationdefinitioncontacttelecomperiod);

		/******************** OprtnDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat OprtnDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date OprtnDfn_Cntct_Tlcm_Prd_Enddate = OprtnDfn_Cntct_Tlcm_Prd_Endsdf.parse(o.getOprtnDfnCntctTlcmPrdEnd());
			operationdefinitioncontacttelecomperiod.setEnd(OprtnDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** OprtnDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat OprtnDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date OprtnDfn_Cntct_Tlcm_Prd_Strtdate = OprtnDfn_Cntct_Tlcm_Prd_Strtsdf.parse(o.getOprtnDfnCntctTlcmPrdStrt());
			operationdefinitioncontacttelecomperiod.setStart(OprtnDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** OprtnDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmRnk() != null) {
			operationdefinitioncontacttelecom.setRank(Integer.parseInt(o.getOprtnDfnCntctTlcmRnk()));
		}
		/******************** operationdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory operationdefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		operationdefinitioncontacttelecom.setSystem(operationdefinitioncontacttelecomsystem.fromCode(o.getOprtnDfnCntctTlcmSys()));

		/******************** operationdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory operationdefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		operationdefinitioncontacttelecom.setUse(operationdefinitioncontacttelecomuse.fromCode(o.getOprtnDfnCntctTlcmUse()));

		/******************** OprtnDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(o.getOprtnDfnCntctTlcmVl() != null) {
			operationdefinitioncontacttelecom.setValue(o.getOprtnDfnCntctTlcmVl());
		}
		/******************** OprtnDfn_Dt ********************************************************************************/
		if(o.getOprtnDfnDt() != null) {
			java.text.SimpleDateFormat OprtnDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date OprtnDfn_Dtdate = OprtnDfn_Dtsdf.parse(o.getOprtnDfnDt());
			operationdefinition.setDate(OprtnDfn_Dtdate);
		}
		/******************** OprtnDfn_Dscrptn ********************************************************************************/
		if(o.getOprtnDfnDscrptn() != null) {
			operationdefinition.setDescription(o.getOprtnDfnDscrptn());
		}
		/******************** OprtnDfn_Exprmtl ********************************************************************************/
		if(o.getOprtnDfnExprmtl() != null) {
			operationdefinition.setExperimental(Boolean.parseBoolean(o.getOprtnDfnExprmtl()));
		}
		/******************** OprtnDfn_InputProfile ********************************************************************************/
		if(o.getOprtnDfnInputProfile() != null) {
			operationdefinition.setInputProfile(o.getOprtnDfnInputProfile());
		}
		/******************** OprtnDfn_Instance ********************************************************************************/
		if(o.getOprtnDfnInstance() != null) {
			operationdefinition.setInstance(Boolean.parseBoolean(o.getOprtnDfnInstance()));
		}
		/******************** operationdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept operationdefinitionjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		operationdefinition.addJurisdiction(operationdefinitionjurisdiction);

		/******************** operationdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding operationdefinitionjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		operationdefinitionjurisdiction.addCoding(operationdefinitionjurisdictioncoding);

		/******************** OprtnDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgCd() != null) {
			operationdefinitionjurisdictioncoding.setCode(o.getOprtnDfnJrsdctnCdgCd());
		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgDsply() != null) {
			operationdefinitionjurisdictioncoding.setDisplay(o.getOprtnDfnJrsdctnCdgDsply());
		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgSys() != null) {
			operationdefinitionjurisdictioncoding.setSystem(o.getOprtnDfnJrsdctnCdgSys());
		}
		/******************** OprtnDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgUsrSltd() != null) {
			operationdefinitionjurisdictioncoding.setUserSelected(Boolean.parseBoolean(o.getOprtnDfnJrsdctnCdgUsrSltd()));
		}
		/******************** OprtnDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(o.getOprtnDfnJrsdctnCdgVrsn() != null) {
			operationdefinitionjurisdictioncoding.setVersion(o.getOprtnDfnJrsdctnCdgVrsn());
		}
		/******************** OprtnDfn_Jrsdctn_Txt ********************************************************************************/
		if(o.getOprtnDfnJrsdctnTxt() != null) {
			operationdefinitionjurisdiction.setText(o.getOprtnDfnJrsdctnTxt());
		}
		/******************** operationdefinitionkind ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationKindEnumFactory operationdefinitionkind =  new org.hl7.fhir.r4.model.OperationDefinition.OperationKindEnumFactory();
		operationdefinition.setKind(operationdefinitionkind.fromCode(o.getOprtnDfnKind()));

		/******************** OprtnDfn_Nm ********************************************************************************/
		if(o.getOprtnDfnNm() != null) {
			operationdefinition.setName(o.getOprtnDfnNm());
		}
		/******************** OprtnDfn_OutputProfile ********************************************************************************/
		if(o.getOprtnDfnOutputProfile() != null) {
			operationdefinition.setOutputProfile(o.getOprtnDfnOutputProfile());
		}
		/******************** operationdefinitionoverload ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionOverloadComponent operationdefinitionoverload =  new org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionOverloadComponent();
		operationdefinition.addOverload(operationdefinitionoverload);

		/******************** OprtnDfn_Overload_Comment ********************************************************************************/
		if(o.getOprtnDfnOverloadComment() != null) {
			operationdefinitionoverload.setComment(o.getOprtnDfnOverloadComment());
		}
		/******************** OprtnDfn_Overload_PrmtrNm ********************************************************************************/
		if(o.getOprtnDfnOverloadPrmtrNm() != null) {
			operationdefinitionoverload.addParameterName(o.getOprtnDfnOverloadPrmtrNm());
		}
		/******************** operationdefinitionparameter ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent operationdefinitionparameter =  new org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterComponent();
		operationdefinition.addParameter(operationdefinitionparameter);

		/******************** operationdefinitionparameterbinding ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent operationdefinitionparameterbinding =  new org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterBindingComponent();
		operationdefinitionparameter.setBinding(operationdefinitionparameterbinding);

		/******************** operationdefinitionparameterbindingstrength ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.BindingStrengthEnumFactory operationdefinitionparameterbindingstrength =  new org.hl7.fhir.r4.model.Enumerations.BindingStrengthEnumFactory();
		operationdefinitionparameterbinding.setStrength(operationdefinitionparameterbindingstrength.fromCode(o.getOprtnDfnPrmtrBindingStr()));

		/******************** OprtnDfn_Prmtr_Binding_VlSt ********************************************************************************/
		if(o.getOprtnDfnPrmtrBindingVlSt() != null) {
			operationdefinitionparameterbinding.setValueSet(o.getOprtnDfnPrmtrBindingVlSt());
		}
		/******************** OprtnDfn_Prmtr_Docation ********************************************************************************/
		if(o.getOprtnDfnPrmtrDocation() != null) {
			operationdefinitionparameter.setDocumentation(o.getOprtnDfnPrmtrDocation());
		}
		/******************** OprtnDfn_Prmtr_Mx ********************************************************************************/
		if(o.getOprtnDfnPrmtrMx() != null) {
			operationdefinitionparameter.setMax(o.getOprtnDfnPrmtrMx());
		}
		/******************** OprtnDfn_Prmtr_Min ********************************************************************************/
		if(o.getOprtnDfnPrmtrMin() != null) {
			operationdefinitionparameter.setMin(Integer.parseInt(o.getOprtnDfnPrmtrMin()));
		}
		/******************** OprtnDfn_Prmtr_Nm ********************************************************************************/
		if(o.getOprtnDfnPrmtrNm() != null) {
			operationdefinitionparameter.setName(o.getOprtnDfnPrmtrNm());
		}
		/******************** operationdefinitionparameterreferencedfrom ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterReferencedFromComponent operationdefinitionparameterreferencedfrom =  new org.hl7.fhir.r4.model.OperationDefinition.OperationDefinitionParameterReferencedFromComponent();
		operationdefinitionparameter.addReferencedFrom(operationdefinitionparameterreferencedfrom);

		/******************** OprtnDfn_Prmtr_RfrncdFrom_Src ********************************************************************************/
		if(o.getOprtnDfnPrmtrRfrncdFromSrc() != null) {
			operationdefinitionparameterreferencedfrom.setSource(o.getOprtnDfnPrmtrRfrncdFromSrc());
		}
		/******************** OprtnDfn_Prmtr_RfrncdFrom_SrcId ********************************************************************************/
		if(o.getOprtnDfnPrmtrRfrncdFromSrcId() != null) {
			operationdefinitionparameterreferencedfrom.setSourceId(o.getOprtnDfnPrmtrRfrncdFromSrcId());
		}
		/******************** operationdefinitionparametersearchtype ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory operationdefinitionparametersearchtype =  new org.hl7.fhir.r4.model.Enumerations.SearchParamTypeEnumFactory();
		operationdefinitionparameter.setSearchType(operationdefinitionparametersearchtype.fromCode(o.getOprtnDfnPrmtrSrchTyp()));

		/******************** OprtnDfn_Prmtr_TarProfile ********************************************************************************/
		if(o.getOprtnDfnPrmtrTarProfile() != null) {
			operationdefinitionparameter.addTargetProfile(o.getOprtnDfnPrmtrTarProfile());
		}
		/******************** OprtnDfn_Prmtr_Typ ********************************************************************************/
		if(o.getOprtnDfnPrmtrTyp() != null) {
			operationdefinitionparameter.setType(o.getOprtnDfnPrmtrTyp());
		}
		/******************** operationdefinitionparameteruse ********************************************************************************/
		org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUseEnumFactory operationdefinitionparameteruse =  new org.hl7.fhir.r4.model.OperationDefinition.OperationParameterUseEnumFactory();
		operationdefinitionparameter.setUse(operationdefinitionparameteruse.fromCode(o.getOprtnDfnPrmtrUse()));

		/******************** OprtnDfn_Pblshr ********************************************************************************/
		if(o.getOprtnDfnPblshr() != null) {
			operationdefinition.setPublisher(o.getOprtnDfnPblshr());
		}
		/******************** OprtnDfn_Prpse ********************************************************************************/
		if(o.getOprtnDfnPrpse() != null) {
			operationdefinition.setPurpose(o.getOprtnDfnPrpse());
		}
		/******************** OprtnDfn_Rsrc ********************************************************************************/
		if(o.getOprtnDfnRsrc() != null) {
			operationdefinition.addResource(o.getOprtnDfnRsrc());
		}
		/******************** operationdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory operationdefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		operationdefinition.setStatus(operationdefinitionstatus.fromCode(o.getOprtnDfnSts()));

		/******************** OprtnDfn_Sys ********************************************************************************/
		if(o.getOprtnDfnSys() != null) {
			operationdefinition.setSystem(Boolean.parseBoolean(o.getOprtnDfnSys()));
		}
		/******************** OprtnDfn_Ttl ********************************************************************************/
		if(o.getOprtnDfnTtl() != null) {
			operationdefinition.setTitle(o.getOprtnDfnTtl());
		}
		/******************** OprtnDfn_Typ ********************************************************************************/
		if(o.getOprtnDfnTyp() != null) {
			operationdefinition.setType(Boolean.parseBoolean(o.getOprtnDfnTyp()));
		}
		/******************** OprtnDfn_Url ********************************************************************************/
		if(o.getOprtnDfnUrl() != null) {
			operationdefinition.setUrl(o.getOprtnDfnUrl());
		}
		/******************** operationdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext operationdefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		operationdefinition.addUseContext(operationdefinitionusecontext);

		/******************** operationdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding operationdefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		operationdefinitionusecontext.setCode(operationdefinitionusecontextcode);

		/******************** OprtnDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdCd() != null) {
			operationdefinitionusecontextcode.setCode(o.getOprtnDfnUseCntxtCdCd());
		}
		/******************** OprtnDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdDsply() != null) {
			operationdefinitionusecontextcode.setDisplay(o.getOprtnDfnUseCntxtCdDsply());
		}
		/******************** OprtnDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdSys() != null) {
			operationdefinitionusecontextcode.setSystem(o.getOprtnDfnUseCntxtCdSys());
		}
		/******************** OprtnDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdUsrSltd() != null) {
			operationdefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(o.getOprtnDfnUseCntxtCdUsrSltd()));
		}
		/******************** OprtnDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(o.getOprtnDfnUseCntxtCdVrsn() != null) {
			operationdefinitionusecontextcode.setVersion(o.getOprtnDfnUseCntxtCdVrsn());
		}
		/******************** operationdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept operationdefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		operationdefinitionusecontext.setValue(operationdefinitionusecontextvaluecodeableconcept);

		/******************** operationdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding operationdefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		operationdefinitionusecontextvaluecodeableconcept.addCoding(operationdefinitionusecontextvaluecodeableconceptcoding);

		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			operationdefinitionusecontextvaluecodeableconceptcoding.setCode(o.getOprtnDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			operationdefinitionusecontextvaluecodeableconceptcoding.setDisplay(o.getOprtnDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			operationdefinitionusecontextvaluecodeableconceptcoding.setSystem(o.getOprtnDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			operationdefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(o.getOprtnDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			operationdefinitionusecontextvaluecodeableconceptcoding.setVersion(o.getOprtnDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** OprtnDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlCdbleCncptTxt() != null) {
			operationdefinitionusecontextvaluecodeableconcept.setText(o.getOprtnDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** operationdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity operationdefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		operationdefinitionusecontext.setValue(operationdefinitionusecontextvaluequantity);

		/******************** OprtnDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlQntyCd() != null) {
			operationdefinitionusecontextvaluequantity.setCode(o.getOprtnDfnUseCntxtVlQntyCd());
		}
		/******************** operationdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory operationdefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		operationdefinitionusecontextvaluequantity.setComparator(operationdefinitionusecontextvaluequantitycomparator.fromCode(o.getOprtnDfnUseCntxtVlQntyCmprtr()));

		/******************** OprtnDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlQntySys() != null) {
			operationdefinitionusecontextvaluequantity.setSystem(o.getOprtnDfnUseCntxtVlQntySys());
		}
		/******************** OprtnDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlQntyUnt() != null) {
			operationdefinitionusecontextvaluequantity.setUnit(o.getOprtnDfnUseCntxtVlQntyUnt());
		}
		/******************** OprtnDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlQntyVl() != null) {
			operationdefinitionusecontextvaluequantity.setValue(Double.parseDouble((o.getOprtnDfnUseCntxtVlQntyVl())));
		}
		/******************** operationdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range operationdefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		operationdefinitionusecontext.setValue(operationdefinitionusecontextvaluerange);

		/******************** operationdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity operationdefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		operationdefinitionusecontextvaluerange.setHigh(operationdefinitionusecontextvaluerangehigh);

		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngHiCd() != null) {
			operationdefinitionusecontextvaluerangehigh.setCode(o.getOprtnDfnUseCntxtVlRngHiCd());
		}
		/******************** operationdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory operationdefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		operationdefinitionusecontextvaluerangehigh.setComparator(operationdefinitionusecontextvaluerangehighcomparator.fromCode(o.getOprtnDfnUseCntxtVlRngHiCmprtr()));

		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngHiSys() != null) {
			operationdefinitionusecontextvaluerangehigh.setSystem(o.getOprtnDfnUseCntxtVlRngHiSys());
		}
		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngHiUnt() != null) {
			operationdefinitionusecontextvaluerangehigh.setUnit(o.getOprtnDfnUseCntxtVlRngHiUnt());
		}
		/******************** OprtnDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngHiVl() != null) {
			operationdefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((o.getOprtnDfnUseCntxtVlRngHiVl())));
		}
		/******************** operationdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity operationdefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		operationdefinitionusecontextvaluerange.setLow(operationdefinitionusecontextvaluerangelow);

		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngLwCd() != null) {
			operationdefinitionusecontextvaluerangelow.setCode(o.getOprtnDfnUseCntxtVlRngLwCd());
		}
		/******************** operationdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory operationdefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		operationdefinitionusecontextvaluerangelow.setComparator(operationdefinitionusecontextvaluerangelowcomparator.fromCode(o.getOprtnDfnUseCntxtVlRngLwCmprtr()));

		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngLwSys() != null) {
			operationdefinitionusecontextvaluerangelow.setSystem(o.getOprtnDfnUseCntxtVlRngLwSys());
		}
		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngLwUnt() != null) {
			operationdefinitionusecontextvaluerangelow.setUnit(o.getOprtnDfnUseCntxtVlRngLwUnt());
		}
		/******************** OprtnDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRngLwVl() != null) {
			operationdefinitionusecontextvaluerangelow.setValue(Double.parseDouble((o.getOprtnDfnUseCntxtVlRngLwVl())));
		}
		/******************** OprtnDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(o.getOprtnDfnUseCntxtVlRfrnc() != null) {
			operationdefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(o.getOprtnDfnUseCntxtVlRfrnc()));
		}
		/******************** OprtnDfn_Vrsn ********************************************************************************/
		if(o.getOprtnDfnVrsn() != null) {
			operationdefinition.setVersion(o.getOprtnDfnVrsn());
		}
		return operationdefinition;
	}
}
