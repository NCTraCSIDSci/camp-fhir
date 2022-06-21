package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ValueSet;
public class ValueSetBidirectionalConversion 
{
	public ValueSet ValueSets(org.hl7.fhir.r4.model.ValueSet valueset) throws ParseException
	{
		 main.java.com.campfhir.model.ValueSet v = new  main.java.com.campfhir.model.ValueSet();

		/******************** id ********************************************************************************/
		valueset.setId(v.getId());

		/******************** VlSt_Nm ********************************************************************************/
		if(valueset.hasName()) {
			v.setVlStNm(String.valueOf(valueset.getName()));
		}
		/******************** VlSt_Vrsn ********************************************************************************/
		if(valueset.hasVersion()) {
			v.setVlStVrsn(String.valueOf(valueset.getVersion()));
		}
		/******************** VlSt_Dt ********************************************************************************/
		if(valueset.hasDate()) {
			v.setVlStDt(String.valueOf(valueset.getDate()));
		}
		/******************** VlSt_Url ********************************************************************************/
		if(valueset.hasUrl()) {
			v.setVlStUrl(String.valueOf(valueset.getUrl()));
		}
		/******************** valuesetjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept valuesetjurisdiction = valueset.getJurisdictionFirstRep();

		/******************** valuesetjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetjurisdictioncoding = valuesetjurisdiction.getCodingFirstRep();

		/******************** VlSt_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(valuesetjurisdictioncoding.hasDisplay()) {
			v.setVlStJrsdctnCdgDsply(String.valueOf(valuesetjurisdictioncoding.getDisplay()));
		}
		/******************** VlSt_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(valuesetjurisdictioncoding.hasVersion()) {
			v.setVlStJrsdctnCdgVrsn(String.valueOf(valuesetjurisdictioncoding.getVersion()));
		}
		/******************** VlSt_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(valuesetjurisdictioncoding.hasCode()) {
			v.setVlStJrsdctnCdgCd(String.valueOf(valuesetjurisdictioncoding.getCode()));
		}
		/******************** VlSt_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(valuesetjurisdictioncoding.hasSystem()) {
			v.setVlStJrsdctnCdgSys(String.valueOf(valuesetjurisdictioncoding.getSystem()));
		}
		/******************** VlSt_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(valuesetjurisdictioncoding.hasUserSelected()) {
			v.setVlStJrsdctnCdgUsrSltd(String.valueOf(valuesetjurisdictioncoding.getUserSelected()));
		}
		/******************** VlSt_Jrsdctn_Txt ********************************************************************************/
		if(valuesetjurisdiction.hasText()) {
			v.setVlStJrsdctnTxt(String.valueOf(valuesetjurisdiction.getText()));
		}
		/******************** valuesetusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext valuesetusecontext = valueset.getUseContextFirstRep();

		/******************** valuesetusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetusecontextcode = valuesetusecontext.getCode();

		/******************** VlSt_UseCntxt_Cd_Dsply ********************************************************************************/
		if(valuesetusecontextcode.hasDisplay()) {
			v.setVlStUseCntxtCdDsply(String.valueOf(valuesetusecontextcode.getDisplay()));
		}
		/******************** VlSt_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(valuesetusecontextcode.hasVersion()) {
			v.setVlStUseCntxtCdVrsn(String.valueOf(valuesetusecontextcode.getVersion()));
		}
		/******************** VlSt_UseCntxt_Cd_Sys ********************************************************************************/
		if(valuesetusecontextcode.hasSystem()) {
			v.setVlStUseCntxtCdSys(String.valueOf(valuesetusecontextcode.getSystem()));
		}
		/******************** VlSt_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(valuesetusecontextcode.hasUserSelected()) {
			v.setVlStUseCntxtCdUsrSltd(String.valueOf(valuesetusecontextcode.getUserSelected()));
		}
		/******************** valuesetusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept valuesetusecontextvaluecodeableconcept = valuesetusecontext.getValueCodeableConcept();

		/******************** valuesetusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetusecontextvaluecodeableconceptcoding = valuesetusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcoding.hasDisplay()) {
			v.setVlStUseCntxtVlCdbleCncptCdgDsply(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcoding.hasVersion()) {
			v.setVlStUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcoding.hasCode()) {
			v.setVlStUseCntxtVlCdbleCncptCdgCd(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcoding.hasSystem()) {
			v.setVlStUseCntxtVlCdbleCncptCdgSys(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(valuesetusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			v.setVlStUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(valuesetusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** VlSt_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(valuesetusecontextvaluecodeableconcept.hasText()) {
			v.setVlStUseCntxtVlCdbleCncptTxt(String.valueOf(valuesetusecontextvaluecodeableconcept.getText()));
		}
		/******************** valuesetusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity valuesetusecontextvaluequantity = valuesetusecontext.getValueQuantity();

		/******************** VlSt_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(valuesetusecontextvaluequantity.hasValue()) {
			v.setVlStUseCntxtVlQntyVl(String.valueOf(valuesetusecontextvaluequantity.getValue()));
		}
		/******************** valuesetusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator valuesetusecontextvaluequantitycomparator = valuesetusecontextvaluequantity.getComparator();
		v.setVlStUseCntxtVlQntyCmprtr(valuesetusecontextvaluequantitycomparator.toCode());

		/******************** VlSt_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(valuesetusecontextvaluequantity.hasCode()) {
			v.setVlStUseCntxtVlQntyCd(String.valueOf(valuesetusecontextvaluequantity.getCode()));
		}
		/******************** VlSt_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(valuesetusecontextvaluequantity.hasSystem()) {
			v.setVlStUseCntxtVlQntySys(String.valueOf(valuesetusecontextvaluequantity.getSystem()));
		}
		/******************** VlSt_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(valuesetusecontextvaluequantity.hasUnit()) {
			v.setVlStUseCntxtVlQntyUnt(String.valueOf(valuesetusecontextvaluequantity.getUnit()));
		}
		/******************** valuesetusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range valuesetusecontextvaluerange = valuesetusecontext.getValueRange();

		/******************** valuesetusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity valuesetusecontextvaluerangelow = valuesetusecontextvaluerange.getLow();

		/******************** VlSt_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(valuesetusecontextvaluerangelow.hasValue()) {
			v.setVlStUseCntxtVlRngLwVl(String.valueOf(valuesetusecontextvaluerangelow.getValue()));
		}
		/******************** valuesetusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator valuesetusecontextvaluerangelowcomparator = valuesetusecontextvaluerangelow.getComparator();
		v.setVlStUseCntxtVlRngLwCmprtr(valuesetusecontextvaluerangelowcomparator.toCode());

		/******************** VlSt_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(valuesetusecontextvaluerangelow.hasCode()) {
			v.setVlStUseCntxtVlRngLwCd(String.valueOf(valuesetusecontextvaluerangelow.getCode()));
		}
		/******************** VlSt_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(valuesetusecontextvaluerangelow.hasSystem()) {
			v.setVlStUseCntxtVlRngLwSys(String.valueOf(valuesetusecontextvaluerangelow.getSystem()));
		}
		/******************** VlSt_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(valuesetusecontextvaluerangelow.hasUnit()) {
			v.setVlStUseCntxtVlRngLwUnt(String.valueOf(valuesetusecontextvaluerangelow.getUnit()));
		}
		/******************** valuesetusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity valuesetusecontextvaluerangehigh = valuesetusecontextvaluerange.getHigh();

		/******************** VlSt_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(valuesetusecontextvaluerangehigh.hasValue()) {
			v.setVlStUseCntxtVlRngHiVl(String.valueOf(valuesetusecontextvaluerangehigh.getValue()));
		}
		/******************** valuesetusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator valuesetusecontextvaluerangehighcomparator = valuesetusecontextvaluerangehigh.getComparator();
		v.setVlStUseCntxtVlRngHiCmprtr(valuesetusecontextvaluerangehighcomparator.toCode());

		/******************** VlSt_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(valuesetusecontextvaluerangehigh.hasCode()) {
			v.setVlStUseCntxtVlRngHiCd(String.valueOf(valuesetusecontextvaluerangehigh.getCode()));
		}
		/******************** VlSt_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(valuesetusecontextvaluerangehigh.hasSystem()) {
			v.setVlStUseCntxtVlRngHiSys(String.valueOf(valuesetusecontextvaluerangehigh.getSystem()));
		}
		/******************** VlSt_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(valuesetusecontextvaluerangehigh.hasUnit()) {
			v.setVlStUseCntxtVlRngHiUnt(String.valueOf(valuesetusecontextvaluerangehigh.getUnit()));
		}
		/******************** VlSt_UseCntxt_VlRfrnc ********************************************************************************/
		if(valuesetusecontext.hasValueReference()) {
			v.setVlStUseCntxtVlRfrnc(String.valueOf(valuesetusecontext.getValueReference()));
		}
		/******************** valuesetstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus valuesetstatus = valueset.getStatus();
		v.setVlStSts(valuesetstatus.toCode());

		/******************** VlSt_Dscrptn ********************************************************************************/
		if(valueset.hasDescription()) {
			v.setVlStDscrptn(String.valueOf(valueset.getDescription()));
		}
		/******************** valuesetcontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail valuesetcontact = valueset.getContactFirstRep();

		/******************** VlSt_Cntct_Nm ********************************************************************************/
		if(valuesetcontact.hasName()) {
			v.setVlStCntctNm(String.valueOf(valuesetcontact.getName()));
		}
		/******************** valuesetcontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint valuesetcontacttelecom = valuesetcontact.getTelecomFirstRep();

		/******************** VlSt_Cntct_Tlcm_Vl ********************************************************************************/
		if(valuesetcontacttelecom.hasValue()) {
			v.setVlStCntctTlcmVl(String.valueOf(valuesetcontacttelecom.getValue()));
		}
		/******************** valuesetcontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem valuesetcontacttelecomsystem = valuesetcontacttelecom.getSystem();
		v.setVlStCntctTlcmSys(valuesetcontacttelecomsystem.toCode());

		/******************** valuesetcontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period valuesetcontacttelecomperiod = valuesetcontacttelecom.getPeriod();

		/******************** VlSt_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(valuesetcontacttelecomperiod.hasEnd()) {
			v.setVlStCntctTlcmPrdEnd(String.valueOf(valuesetcontacttelecomperiod.getEnd()));
		}
		/******************** VlSt_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(valuesetcontacttelecomperiod.hasStart()) {
			v.setVlStCntctTlcmPrdStrt(String.valueOf(valuesetcontacttelecomperiod.getStart()));
		}
		/******************** valuesetcontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse valuesetcontacttelecomuse = valuesetcontacttelecom.getUse();
		v.setVlStCntctTlcmUse(valuesetcontacttelecomuse.toCode());

		/******************** VlSt_Cntct_Tlcm_Rnk ********************************************************************************/
		if(valuesetcontacttelecom.hasRank()) {
			v.setVlStCntctTlcmRnk(String.valueOf(valuesetcontacttelecom.getRank()));
		}
		/******************** VlSt_Ttl ********************************************************************************/
		if(valueset.hasTitle()) {
			v.setVlStTtl(String.valueOf(valueset.getTitle()));
		}
		/******************** valuesetidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier valuesetidentifier = valueset.getIdentifierFirstRep();

		/******************** VlSt_Id_Vl ********************************************************************************/
		if(valuesetidentifier.hasValue()) {
			v.setVlStIdVl(String.valueOf(valuesetidentifier.getValue()));
		}
		/******************** valuesetidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept valuesetidentifiertype = valuesetidentifier.getType();

		/******************** valuesetidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetidentifiertypecoding = valuesetidentifiertype.getCodingFirstRep();

		/******************** VlSt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(valuesetidentifiertypecoding.hasDisplay()) {
			v.setVlStIdTypCdgDsply(String.valueOf(valuesetidentifiertypecoding.getDisplay()));
		}
		/******************** VlSt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(valuesetidentifiertypecoding.hasVersion()) {
			v.setVlStIdTypCdgVrsn(String.valueOf(valuesetidentifiertypecoding.getVersion()));
		}
		/******************** VlSt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(valuesetidentifiertypecoding.hasCode()) {
			v.setVlStIdTypCdgCd(String.valueOf(valuesetidentifiertypecoding.getCode()));
		}
		/******************** VlSt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(valuesetidentifiertypecoding.hasSystem()) {
			v.setVlStIdTypCdgSys(String.valueOf(valuesetidentifiertypecoding.getSystem()));
		}
		/******************** VlSt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(valuesetidentifiertypecoding.hasUserSelected()) {
			v.setVlStIdTypCdgUsrSltd(String.valueOf(valuesetidentifiertypecoding.getUserSelected()));
		}
		/******************** VlSt_Id_Typ_Txt ********************************************************************************/
		if(valuesetidentifiertype.hasText()) {
			v.setVlStIdTypTxt(String.valueOf(valuesetidentifiertype.getText()));
		}
		/******************** VlSt_Id_Sys ********************************************************************************/
		if(valuesetidentifier.hasSystem()) {
			v.setVlStIdSys(String.valueOf(valuesetidentifier.getSystem()));
		}
		/******************** VlSt_Id_Assigner ********************************************************************************/
		if(valuesetidentifier.hasAssigner()) {
			v.setVlStIdAssigner(String.valueOf(valuesetidentifier.getAssigner()));
		}
		/******************** valuesetidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period valuesetidentifierperiod = valuesetidentifier.getPeriod();

		/******************** VlSt_Id_Prd_End ********************************************************************************/
		if(valuesetidentifierperiod.hasEnd()) {
			v.setVlStIdPrdEnd(String.valueOf(valuesetidentifierperiod.getEnd()));
		}
		/******************** VlSt_Id_Prd_Strt ********************************************************************************/
		if(valuesetidentifierperiod.hasStart()) {
			v.setVlStIdPrdStrt(String.valueOf(valuesetidentifierperiod.getStart()));
		}
		/******************** valuesetidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse valuesetidentifieruse = valuesetidentifier.getUse();
		v.setVlStIdUse(valuesetidentifieruse.toCode());

		/******************** VlSt_Exprmtl ********************************************************************************/
		if(valueset.hasExperimental()) {
			v.setVlStExprmtl(String.valueOf(valueset.getExperimental()));
		}
		/******************** VlSt_Pblshr ********************************************************************************/
		if(valueset.hasPublisher()) {
			v.setVlStPblshr(String.valueOf(valueset.getPublisher()));
		}
		/******************** VlSt_Prpse ********************************************************************************/
		if(valueset.hasPurpose()) {
			v.setVlStPrpse(String.valueOf(valueset.getPurpose()));
		}
		/******************** VlSt_Copyright ********************************************************************************/
		if(valueset.hasCopyright()) {
			v.setVlStCopyright(String.valueOf(valueset.getCopyright()));
		}
		/******************** valuesetexpansion ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionComponent valuesetexpansion = valueset.getExpansion();

		/******************** VlSt_Expansion_Off ********************************************************************************/
		if(valuesetexpansion.hasOffset()) {
			v.setVlStExpansionOff(String.valueOf(valuesetexpansion.getOffset()));
		}
		/******************** VlSt_Expansion_Timestamp ********************************************************************************/
		if(valuesetexpansion.hasTimestamp()) {
			v.setVlStExpansionTimestamp(String.valueOf(valuesetexpansion.getTimestamp()));
		}
		/******************** valuesetexpansionparameter ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionParameterComponent valuesetexpansionparameter = valuesetexpansion.getParameterFirstRep();

		/******************** VlSt_Expansion_Prmtr_Nm ********************************************************************************/
		if(valuesetexpansionparameter.hasName()) {
			v.setVlStExpansionPrmtrNm(String.valueOf(valuesetexpansionparameter.getName()));
		}
		/******************** VlSt_Expansion_Prmtr_VlBooleanTyp ********************************************************************************/
		if(valuesetexpansionparameter.hasValueBooleanType()) {
			v.setVlStExpansionPrmtrVlBooleanTyp(String.valueOf(valuesetexpansionparameter.getValueBooleanType()));
		}
		/******************** VlSt_Expansion_Prmtr_VlIntegerTyp ********************************************************************************/
		if(valuesetexpansionparameter.hasValueIntegerType()) {
			v.setVlStExpansionPrmtrVlIntegerTyp(String.valueOf(valuesetexpansionparameter.getValueIntegerType()));
		}
		/******************** VlSt_Expansion_Prmtr_VlDtTimeTyp ********************************************************************************/
		if(valuesetexpansionparameter.hasValueDateTimeType()) {
			v.setVlStExpansionPrmtrVlDtTimeTyp(String.valueOf(valuesetexpansionparameter.getValueDateTimeType()));
		}
		/******************** VlSt_Expansion_Prmtr_VlDecimalTyp ********************************************************************************/
		if(valuesetexpansionparameter.hasValueDecimalType()) {
			v.setVlStExpansionPrmtrVlDecimalTyp(String.valueOf(valuesetexpansionparameter.getValueDecimalType()));
		}
		/******************** VlSt_Expansion_Prmtr_VlStrgTyp ********************************************************************************/
		if(valuesetexpansionparameter.hasValueStringType()) {
			v.setVlStExpansionPrmtrVlStrgTyp(String.valueOf(valuesetexpansionparameter.getValueStringType()));
		}
		/******************** VlSt_Expansion_Prmtr_VlUriTyp ********************************************************************************/
		if(valuesetexpansionparameter.hasValueUriType()) {
			v.setVlStExpansionPrmtrVlUriTyp(String.valueOf(valuesetexpansionparameter.getValueUriType()));
		}
		/******************** VlSt_Expansion_Prmtr_VlCdTyp ********************************************************************************/
		if(valuesetexpansionparameter.hasValueCodeType()) {
			v.setVlStExpansionPrmtrVlCdTyp(String.valueOf(valuesetexpansionparameter.getValueCodeType()));
		}
		/******************** VlSt_Expansion_Id ********************************************************************************/
		if(valuesetexpansion.hasIdentifier()) {
			v.setVlStExpansionId(String.valueOf(valuesetexpansion.getIdentifier()));
		}
		/******************** VlSt_Expansion_Total ********************************************************************************/
		if(valuesetexpansion.hasTotal()) {
			v.setVlStExpansionTotal(String.valueOf(valuesetexpansion.getTotal()));
		}
		/******************** valuesetexpansioncontains ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetExpansionContainsComponent valuesetexpansioncontains = valuesetexpansion.getContainsFirstRep();

		/******************** VlSt_Expansion_Contains_Cd ********************************************************************************/
		if(valuesetexpansioncontains.hasCode()) {
			v.setVlStExpansionContainsCd(String.valueOf(valuesetexpansioncontains.getCode()));
		}
		/******************** VlSt_Expansion_Contains_Sys ********************************************************************************/
		if(valuesetexpansioncontains.hasSystem()) {
			v.setVlStExpansionContainsSys(String.valueOf(valuesetexpansioncontains.getSystem()));
		}
		/******************** valuesetexpansioncontainsdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent valuesetexpansioncontainsdesignation = valuesetexpansioncontains.getDesignationFirstRep();

		/******************** VlSt_Expansion_Contains_Dsgnation_Vl ********************************************************************************/
		if(valuesetexpansioncontainsdesignation.hasValue()) {
			v.setVlStExpansionContainsDsgnationVl(String.valueOf(valuesetexpansioncontainsdesignation.getValue()));
		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Lnguage ********************************************************************************/
		if(valuesetexpansioncontainsdesignation.hasLanguage()) {
			v.setVlStExpansionContainsDsgnationLnguage(String.valueOf(valuesetexpansioncontainsdesignation.getLanguage()));
		}
		/******************** valuesetexpansioncontainsdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetexpansioncontainsdesignationuse = valuesetexpansioncontainsdesignation.getUse();

		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Dsply ********************************************************************************/
		if(valuesetexpansioncontainsdesignationuse.hasDisplay()) {
			v.setVlStExpansionContainsDsgnationUseDsply(String.valueOf(valuesetexpansioncontainsdesignationuse.getDisplay()));
		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Vrsn ********************************************************************************/
		if(valuesetexpansioncontainsdesignationuse.hasVersion()) {
			v.setVlStExpansionContainsDsgnationUseVrsn(String.valueOf(valuesetexpansioncontainsdesignationuse.getVersion()));
		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Cd ********************************************************************************/
		if(valuesetexpansioncontainsdesignationuse.hasCode()) {
			v.setVlStExpansionContainsDsgnationUseCd(String.valueOf(valuesetexpansioncontainsdesignationuse.getCode()));
		}
		/******************** VlSt_Expansion_Contains_Dsgnation_Use_Sys ********************************************************************************/
		if(valuesetexpansioncontainsdesignationuse.hasSystem()) {
			v.setVlStExpansionContainsDsgnationUseSys(String.valueOf(valuesetexpansioncontainsdesignationuse.getSystem()));
		}
		/******************** VlSt_Expansion_Contains_Inactive ********************************************************************************/
		if(valuesetexpansioncontains.hasInactive()) {
			v.setVlStExpansionContainsInactive(String.valueOf(valuesetexpansioncontains.getInactive()));
		}
		/******************** VlSt_Expansion_Contains_Abstract ********************************************************************************/
		if(valuesetexpansioncontains.hasAbstract()) {
			v.setVlStExpansionContainsAbstract(String.valueOf(valuesetexpansioncontains.getAbstract()));
		}
		/******************** VlSt_Immutable ********************************************************************************/
		if(valueset.hasImmutable()) {
			v.setVlStImmutable(String.valueOf(valueset.getImmutable()));
		}
		/******************** valuesetcompose ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ValueSetComposeComponent valuesetcompose = valueset.getCompose();

		/******************** VlSt_Compose_Inactive ********************************************************************************/
		if(valuesetcompose.hasInactive()) {
			v.setVlStComposeInactive(String.valueOf(valuesetcompose.getInactive()));
		}
		/******************** VlSt_Compose_LockedDt ********************************************************************************/
		if(valuesetcompose.hasLockedDate()) {
			v.setVlStComposeLockedDt(String.valueOf(valuesetcompose.getLockedDate()));
		}
		/******************** valuesetcomposeinclude ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent valuesetcomposeinclude = valuesetcompose.getIncludeFirstRep();

		/******************** VlSt_Compose_Include_Sys ********************************************************************************/
		if(valuesetcomposeinclude.hasSystem()) {
			v.setVlStComposeIncludeSys(String.valueOf(valuesetcomposeinclude.getSystem()));
		}
		/******************** valuesetcomposeincludeconcept ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent valuesetcomposeincludeconcept = valuesetcomposeinclude.getConceptFirstRep();

		/******************** VlSt_Compose_Include_Cncpt_Cd ********************************************************************************/
		if(valuesetcomposeincludeconcept.hasCode()) {
			v.setVlStComposeIncludeCncptCd(String.valueOf(valuesetcomposeincludeconcept.getCode()));
		}
		/******************** valuesetcomposeincludeconceptdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent valuesetcomposeincludeconceptdesignation = valuesetcomposeincludeconcept.getDesignationFirstRep();

		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignation.hasValue()) {
			v.setVlStComposeIncludeCncptDsgnationVl(String.valueOf(valuesetcomposeincludeconceptdesignation.getValue()));
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignation.hasLanguage()) {
			v.setVlStComposeIncludeCncptDsgnationLnguage(String.valueOf(valuesetcomposeincludeconceptdesignation.getLanguage()));
		}
		/******************** valuesetcomposeincludeconceptdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetcomposeincludeconceptdesignationuse = valuesetcomposeincludeconceptdesignation.getUse();

		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationuse.hasDisplay()) {
			v.setVlStComposeIncludeCncptDsgnationUseDsply(String.valueOf(valuesetcomposeincludeconceptdesignationuse.getDisplay()));
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationuse.hasVersion()) {
			v.setVlStComposeIncludeCncptDsgnationUseVrsn(String.valueOf(valuesetcomposeincludeconceptdesignationuse.getVersion()));
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationuse.hasCode()) {
			v.setVlStComposeIncludeCncptDsgnationUseCd(String.valueOf(valuesetcomposeincludeconceptdesignationuse.getCode()));
		}
		/******************** VlSt_Compose_Include_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(valuesetcomposeincludeconceptdesignationuse.hasSystem()) {
			v.setVlStComposeIncludeCncptDsgnationUseSys(String.valueOf(valuesetcomposeincludeconceptdesignationuse.getSystem()));
		}
		/******************** valuesetcomposeincludefilter ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent valuesetcomposeincludefilter = valuesetcomposeinclude.getFilterFirstRep();

		/******************** VlSt_Compose_Include_Fltr_Prpty ********************************************************************************/
		if(valuesetcomposeincludefilter.hasProperty()) {
			v.setVlStComposeIncludeFltrPrpty(String.valueOf(valuesetcomposeincludefilter.getProperty()));
		}
		/******************** VlSt_Compose_Include_Fltr_Vl ********************************************************************************/
		if(valuesetcomposeincludefilter.hasValue()) {
			v.setVlStComposeIncludeFltrVl(String.valueOf(valuesetcomposeincludefilter.getValue()));
		}
		/******************** valuesetcomposeincludefilterop ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.FilterOperator valuesetcomposeincludefilterop = valuesetcomposeincludefilter.getOp();
		v.setVlStComposeIncludeFltrOp(valuesetcomposeincludefilterop.toCode());

		/******************** valuesetcomposeexclude ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptSetComponent valuesetcomposeexclude = valuesetcompose.getExcludeFirstRep();

		/******************** VlSt_Compose_Exclude_Sys ********************************************************************************/
		if(valuesetcomposeexclude.hasSystem()) {
			v.setVlStComposeExcludeSys(String.valueOf(valuesetcomposeexclude.getSystem()));
		}
		/******************** valuesetcomposeexcludeconcept ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceComponent valuesetcomposeexcludeconcept = valuesetcomposeexclude.getConceptFirstRep();

		/******************** VlSt_Compose_Exclude_Cncpt_Cd ********************************************************************************/
		if(valuesetcomposeexcludeconcept.hasCode()) {
			v.setVlStComposeExcludeCncptCd(String.valueOf(valuesetcomposeexcludeconcept.getCode()));
		}
		/******************** valuesetcomposeexcludeconceptdesignation ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptReferenceDesignationComponent valuesetcomposeexcludeconceptdesignation = valuesetcomposeexcludeconcept.getDesignationFirstRep();

		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Vl ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignation.hasValue()) {
			v.setVlStComposeExcludeCncptDsgnationVl(String.valueOf(valuesetcomposeexcludeconceptdesignation.getValue()));
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Lnguage ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignation.hasLanguage()) {
			v.setVlStComposeExcludeCncptDsgnationLnguage(String.valueOf(valuesetcomposeexcludeconceptdesignation.getLanguage()));
		}
		/******************** valuesetcomposeexcludeconceptdesignationuse ********************************************************************************/
		org.hl7.fhir.r4.model.Coding valuesetcomposeexcludeconceptdesignationuse = valuesetcomposeexcludeconceptdesignation.getUse();

		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Dsply ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationuse.hasDisplay()) {
			v.setVlStComposeExcludeCncptDsgnationUseDsply(String.valueOf(valuesetcomposeexcludeconceptdesignationuse.getDisplay()));
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Vrsn ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationuse.hasVersion()) {
			v.setVlStComposeExcludeCncptDsgnationUseVrsn(String.valueOf(valuesetcomposeexcludeconceptdesignationuse.getVersion()));
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Cd ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationuse.hasCode()) {
			v.setVlStComposeExcludeCncptDsgnationUseCd(String.valueOf(valuesetcomposeexcludeconceptdesignationuse.getCode()));
		}
		/******************** VlSt_Compose_Exclude_Cncpt_Dsgnation_Use_Sys ********************************************************************************/
		if(valuesetcomposeexcludeconceptdesignationuse.hasSystem()) {
			v.setVlStComposeExcludeCncptDsgnationUseSys(String.valueOf(valuesetcomposeexcludeconceptdesignationuse.getSystem()));
		}
		/******************** valuesetcomposeexcludefilter ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.ConceptSetFilterComponent valuesetcomposeexcludefilter = valuesetcomposeexclude.getFilterFirstRep();

		/******************** VlSt_Compose_Exclude_Fltr_Prpty ********************************************************************************/
		if(valuesetcomposeexcludefilter.hasProperty()) {
			v.setVlStComposeExcludeFltrPrpty(String.valueOf(valuesetcomposeexcludefilter.getProperty()));
		}
		/******************** VlSt_Compose_Exclude_Fltr_Vl ********************************************************************************/
		if(valuesetcomposeexcludefilter.hasValue()) {
			v.setVlStComposeExcludeFltrVl(String.valueOf(valuesetcomposeexcludefilter.getValue()));
		}
		/******************** valuesetcomposeexcludefilterop ********************************************************************************/
		org.hl7.fhir.r4.model.ValueSet.FilterOperator valuesetcomposeexcludefilterop = valuesetcomposeexcludefilter.getOp();
		v.setVlStComposeExcludeFltrOp(valuesetcomposeexcludefilterop.toCode());

		return v;
	}
}
