package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MessageDefinition;
public class MessageDefinitionBidirectionalConversion 
{
	public MessageDefinition MessageDefinitions(org.hl7.fhir.r4.model.MessageDefinition messagedefinition) throws ParseException
	{
		 main.java.com.campfhir.model.MessageDefinition m = new  main.java.com.campfhir.model.MessageDefinition();

		/******************** id ********************************************************************************/
		messagedefinition.setId(m.getId());

		/******************** MsgDfn_Nm ********************************************************************************/
		if(messagedefinition.hasName()) {
			m.setMsgDfnNm(String.valueOf(messagedefinition.getName()));
		}
		/******************** MsgDfn_Dt ********************************************************************************/
		if(messagedefinition.hasDate()) {
			m.setMsgDfnDt(String.valueOf(messagedefinition.getDate()));
		}
		/******************** MsgDfn_Base ********************************************************************************/
		if(messagedefinition.hasBase()) {
			m.setMsgDfnBase(String.valueOf(messagedefinition.getBase()));
		}
		/******************** MsgDfn_Vrsn ********************************************************************************/
		if(messagedefinition.hasVersion()) {
			m.setMsgDfnVrsn(String.valueOf(messagedefinition.getVersion()));
		}
		/******************** MsgDfn_Ttl ********************************************************************************/
		if(messagedefinition.hasTitle()) {
			m.setMsgDfnTtl(String.valueOf(messagedefinition.getTitle()));
		}
		/******************** messagedefinitionfocus ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent messagedefinitionfocus = messagedefinition.getFocusFirstRep();

		/******************** MsgDfn_Focus_Cd ********************************************************************************/
		if(messagedefinitionfocus.hasCode()) {
			m.setMsgDfnFocusCd(String.valueOf(messagedefinitionfocus.getCode()));
		}
		/******************** MsgDfn_Focus_Min ********************************************************************************/
		if(messagedefinitionfocus.hasMin()) {
			m.setMsgDfnFocusMin(String.valueOf(messagedefinitionfocus.getMin()));
		}
		/******************** MsgDfn_Focus_Mx ********************************************************************************/
		if(messagedefinitionfocus.hasMax()) {
			m.setMsgDfnFocusMx(String.valueOf(messagedefinitionfocus.getMax()));
		}
		/******************** MsgDfn_Focus_Profile ********************************************************************************/
		if(messagedefinitionfocus.hasProfile()) {
			m.setMsgDfnFocusProfile(String.valueOf(messagedefinitionfocus.getProfile()));
		}
		/******************** messagedefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus messagedefinitionstatus = messagedefinition.getStatus();
		m.setMsgDfnSts(messagedefinitionstatus.toCode());

		/******************** MsgDfn_Dscrptn ********************************************************************************/
		if(messagedefinition.hasDescription()) {
			m.setMsgDfnDscrptn(String.valueOf(messagedefinition.getDescription()));
		}
		/******************** MsgDfn_Url ********************************************************************************/
		if(messagedefinition.hasUrl()) {
			m.setMsgDfnUrl(String.valueOf(messagedefinition.getUrl()));
		}
		/******************** messagedefinitioneventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitioneventcoding = messagedefinition.getEventCoding();

		/******************** MsgDfn_EvntCdg_Vrsn ********************************************************************************/
		if(messagedefinitioneventcoding.hasVersion()) {
			m.setMsgDfnEvntCdgVrsn(String.valueOf(messagedefinitioneventcoding.getVersion()));
		}
		/******************** MsgDfn_EvntCdg_Dsply ********************************************************************************/
		if(messagedefinitioneventcoding.hasDisplay()) {
			m.setMsgDfnEvntCdgDsply(String.valueOf(messagedefinitioneventcoding.getDisplay()));
		}
		/******************** MsgDfn_EvntCdg_Cd ********************************************************************************/
		if(messagedefinitioneventcoding.hasCode()) {
			m.setMsgDfnEvntCdgCd(String.valueOf(messagedefinitioneventcoding.getCode()));
		}
		/******************** MsgDfn_EvntCdg_UsrSltd ********************************************************************************/
		if(messagedefinitioneventcoding.hasUserSelected()) {
			m.setMsgDfnEvntCdgUsrSltd(String.valueOf(messagedefinitioneventcoding.getUserSelected()));
		}
		/******************** MsgDfn_EvntCdg_Sys ********************************************************************************/
		if(messagedefinitioneventcoding.hasSystem()) {
			m.setMsgDfnEvntCdgSys(String.valueOf(messagedefinitioneventcoding.getSystem()));
		}
		/******************** MsgDfn_EvntUriTyp ********************************************************************************/
		if(messagedefinition.hasEventUriType()) {
			m.setMsgDfnEvntUriTyp(String.valueOf(messagedefinition.getEventUriType()));
		}
		/******************** MsgDfn_Pblshr ********************************************************************************/
		if(messagedefinition.hasPublisher()) {
			m.setMsgDfnPblshr(String.valueOf(messagedefinition.getPublisher()));
		}
		/******************** MsgDfn_Exprmtl ********************************************************************************/
		if(messagedefinition.hasExperimental()) {
			m.setMsgDfnExprmtl(String.valueOf(messagedefinition.getExperimental()));
		}
		/******************** MsgDfn_Prpse ********************************************************************************/
		if(messagedefinition.hasPurpose()) {
			m.setMsgDfnPrpse(String.valueOf(messagedefinition.getPurpose()));
		}
		/******************** messagedefinitionresponserequired ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageheaderResponseRequest messagedefinitionresponserequired = messagedefinition.getResponseRequired();
		m.setMsgDfnRspsRequired(messagedefinitionresponserequired.toCode());

		/******************** messagedefinitionallowedresponse ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent messagedefinitionallowedresponse = messagedefinition.getAllowedResponseFirstRep();

		/******************** MsgDfn_AllowedRsps_Msg ********************************************************************************/
		if(messagedefinitionallowedresponse.hasMessage()) {
			m.setMsgDfnAllowedRspsMsg(String.valueOf(messagedefinitionallowedresponse.getMessage()));
		}
		/******************** MsgDfn_AllowedRsps_Situation ********************************************************************************/
		if(messagedefinitionallowedresponse.hasSituation()) {
			m.setMsgDfnAllowedRspsSituation(String.valueOf(messagedefinitionallowedresponse.getSituation()));
		}
		/******************** messagedefinitioncategory ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageSignificanceCategory messagedefinitioncategory = messagedefinition.getCategory();
		m.setMsgDfnCtgry(messagedefinitioncategory.toCode());

		/******************** messagedefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail messagedefinitioncontact = messagedefinition.getContactFirstRep();

		/******************** MsgDfn_Cntct_Nm ********************************************************************************/
		if(messagedefinitioncontact.hasName()) {
			m.setMsgDfnCntctNm(String.valueOf(messagedefinitioncontact.getName()));
		}
		/******************** messagedefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint messagedefinitioncontacttelecom = messagedefinitioncontact.getTelecomFirstRep();

		/******************** MsgDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(messagedefinitioncontacttelecom.hasValue()) {
			m.setMsgDfnCntctTlcmVl(String.valueOf(messagedefinitioncontacttelecom.getValue()));
		}
		/******************** messagedefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period messagedefinitioncontacttelecomperiod = messagedefinitioncontacttelecom.getPeriod();

		/******************** MsgDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(messagedefinitioncontacttelecomperiod.hasStart()) {
			m.setMsgDfnCntctTlcmPrdStrt(String.valueOf(messagedefinitioncontacttelecomperiod.getStart()));
		}
		/******************** MsgDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(messagedefinitioncontacttelecomperiod.hasEnd()) {
			m.setMsgDfnCntctTlcmPrdEnd(String.valueOf(messagedefinitioncontacttelecomperiod.getEnd()));
		}
		/******************** messagedefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem messagedefinitioncontacttelecomsystem = messagedefinitioncontacttelecom.getSystem();
		m.setMsgDfnCntctTlcmSys(messagedefinitioncontacttelecomsystem.toCode());

		/******************** messagedefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse messagedefinitioncontacttelecomuse = messagedefinitioncontacttelecom.getUse();
		m.setMsgDfnCntctTlcmUse(messagedefinitioncontacttelecomuse.toCode());

		/******************** MsgDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(messagedefinitioncontacttelecom.hasRank()) {
			m.setMsgDfnCntctTlcmRnk(String.valueOf(messagedefinitioncontacttelecom.getRank()));
		}
		/******************** messagedefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier messagedefinitionidentifier = messagedefinition.getIdentifierFirstRep();

		/******************** MsgDfn_Id_Vl ********************************************************************************/
		if(messagedefinitionidentifier.hasValue()) {
			m.setMsgDfnIdVl(String.valueOf(messagedefinitionidentifier.getValue()));
		}
		/******************** messagedefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messagedefinitionidentifiertype = messagedefinitionidentifier.getType();

		/******************** MsgDfn_Id_Typ_Txt ********************************************************************************/
		if(messagedefinitionidentifiertype.hasText()) {
			m.setMsgDfnIdTypTxt(String.valueOf(messagedefinitionidentifiertype.getText()));
		}
		/******************** messagedefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitionidentifiertypecoding = messagedefinitionidentifiertype.getCodingFirstRep();

		/******************** MsgDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(messagedefinitionidentifiertypecoding.hasVersion()) {
			m.setMsgDfnIdTypCdgVrsn(String.valueOf(messagedefinitionidentifiertypecoding.getVersion()));
		}
		/******************** MsgDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(messagedefinitionidentifiertypecoding.hasDisplay()) {
			m.setMsgDfnIdTypCdgDsply(String.valueOf(messagedefinitionidentifiertypecoding.getDisplay()));
		}
		/******************** MsgDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(messagedefinitionidentifiertypecoding.hasCode()) {
			m.setMsgDfnIdTypCdgCd(String.valueOf(messagedefinitionidentifiertypecoding.getCode()));
		}
		/******************** MsgDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(messagedefinitionidentifiertypecoding.hasUserSelected()) {
			m.setMsgDfnIdTypCdgUsrSltd(String.valueOf(messagedefinitionidentifiertypecoding.getUserSelected()));
		}
		/******************** MsgDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(messagedefinitionidentifiertypecoding.hasSystem()) {
			m.setMsgDfnIdTypCdgSys(String.valueOf(messagedefinitionidentifiertypecoding.getSystem()));
		}
		/******************** messagedefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period messagedefinitionidentifierperiod = messagedefinitionidentifier.getPeriod();

		/******************** MsgDfn_Id_Prd_Strt ********************************************************************************/
		if(messagedefinitionidentifierperiod.hasStart()) {
			m.setMsgDfnIdPrdStrt(String.valueOf(messagedefinitionidentifierperiod.getStart()));
		}
		/******************** MsgDfn_Id_Prd_End ********************************************************************************/
		if(messagedefinitionidentifierperiod.hasEnd()) {
			m.setMsgDfnIdPrdEnd(String.valueOf(messagedefinitionidentifierperiod.getEnd()));
		}
		/******************** MsgDfn_Id_Assigner ********************************************************************************/
		if(messagedefinitionidentifier.hasAssigner()) {
			m.setMsgDfnIdAssigner(String.valueOf(messagedefinitionidentifier.getAssigner()));
		}
		/******************** MsgDfn_Id_Sys ********************************************************************************/
		if(messagedefinitionidentifier.hasSystem()) {
			m.setMsgDfnIdSys(String.valueOf(messagedefinitionidentifier.getSystem()));
		}
		/******************** messagedefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse messagedefinitionidentifieruse = messagedefinitionidentifier.getUse();
		m.setMsgDfnIdUse(messagedefinitionidentifieruse.toCode());

		/******************** MsgDfn_Copyright ********************************************************************************/
		if(messagedefinition.hasCopyright()) {
			m.setMsgDfnCopyright(String.valueOf(messagedefinition.getCopyright()));
		}
		/******************** messagedefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext messagedefinitionusecontext = messagedefinition.getUseContextFirstRep();

		/******************** messagedefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitionusecontextcode = messagedefinitionusecontext.getCode();

		/******************** MsgDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(messagedefinitionusecontextcode.hasVersion()) {
			m.setMsgDfnUseCntxtCdVrsn(String.valueOf(messagedefinitionusecontextcode.getVersion()));
		}
		/******************** MsgDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(messagedefinitionusecontextcode.hasDisplay()) {
			m.setMsgDfnUseCntxtCdDsply(String.valueOf(messagedefinitionusecontextcode.getDisplay()));
		}
		/******************** MsgDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(messagedefinitionusecontextcode.hasUserSelected()) {
			m.setMsgDfnUseCntxtCdUsrSltd(String.valueOf(messagedefinitionusecontextcode.getUserSelected()));
		}
		/******************** MsgDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(messagedefinitionusecontextcode.hasSystem()) {
			m.setMsgDfnUseCntxtCdSys(String.valueOf(messagedefinitionusecontextcode.getSystem()));
		}
		/******************** messagedefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messagedefinitionusecontextvaluecodeableconcept = messagedefinitionusecontext.getValueCodeableConcept();

		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconcept.hasText()) {
			m.setMsgDfnUseCntxtVlCdbleCncptTxt(String.valueOf(messagedefinitionusecontextvaluecodeableconcept.getText()));
		}
		/******************** messagedefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitionusecontextvaluecodeableconceptcoding = messagedefinitionusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {
			m.setMsgDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {
			m.setMsgDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasCode()) {
			m.setMsgDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			m.setMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {
			m.setMsgDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** messagedefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity messagedefinitionusecontextvaluequantity = messagedefinitionusecontext.getValueQuantity();

		/******************** MsgDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(messagedefinitionusecontextvaluequantity.hasValue()) {
			m.setMsgDfnUseCntxtVlQntyVl(String.valueOf(messagedefinitionusecontextvaluequantity.getValue()));
		}
		/******************** messagedefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator messagedefinitionusecontextvaluequantitycomparator = messagedefinitionusecontextvaluequantity.getComparator();
		m.setMsgDfnUseCntxtVlQntyCmprtr(messagedefinitionusecontextvaluequantitycomparator.toCode());

		/******************** MsgDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(messagedefinitionusecontextvaluequantity.hasCode()) {
			m.setMsgDfnUseCntxtVlQntyCd(String.valueOf(messagedefinitionusecontextvaluequantity.getCode()));
		}
		/******************** MsgDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(messagedefinitionusecontextvaluequantity.hasUnit()) {
			m.setMsgDfnUseCntxtVlQntyUnt(String.valueOf(messagedefinitionusecontextvaluequantity.getUnit()));
		}
		/******************** MsgDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(messagedefinitionusecontextvaluequantity.hasSystem()) {
			m.setMsgDfnUseCntxtVlQntySys(String.valueOf(messagedefinitionusecontextvaluequantity.getSystem()));
		}
		/******************** messagedefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range messagedefinitionusecontextvaluerange = messagedefinitionusecontext.getValueRange();

		/******************** messagedefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity messagedefinitionusecontextvaluerangelow = messagedefinitionusecontextvaluerange.getLow();

		/******************** MsgDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(messagedefinitionusecontextvaluerangelow.hasValue()) {
			m.setMsgDfnUseCntxtVlRngLwVl(String.valueOf(messagedefinitionusecontextvaluerangelow.getValue()));
		}
		/******************** messagedefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator messagedefinitionusecontextvaluerangelowcomparator = messagedefinitionusecontextvaluerangelow.getComparator();
		m.setMsgDfnUseCntxtVlRngLwCmprtr(messagedefinitionusecontextvaluerangelowcomparator.toCode());

		/******************** MsgDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(messagedefinitionusecontextvaluerangelow.hasCode()) {
			m.setMsgDfnUseCntxtVlRngLwCd(String.valueOf(messagedefinitionusecontextvaluerangelow.getCode()));
		}
		/******************** MsgDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(messagedefinitionusecontextvaluerangelow.hasUnit()) {
			m.setMsgDfnUseCntxtVlRngLwUnt(String.valueOf(messagedefinitionusecontextvaluerangelow.getUnit()));
		}
		/******************** MsgDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(messagedefinitionusecontextvaluerangelow.hasSystem()) {
			m.setMsgDfnUseCntxtVlRngLwSys(String.valueOf(messagedefinitionusecontextvaluerangelow.getSystem()));
		}
		/******************** messagedefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity messagedefinitionusecontextvaluerangehigh = messagedefinitionusecontextvaluerange.getHigh();

		/******************** MsgDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(messagedefinitionusecontextvaluerangehigh.hasValue()) {
			m.setMsgDfnUseCntxtVlRngHiVl(String.valueOf(messagedefinitionusecontextvaluerangehigh.getValue()));
		}
		/******************** messagedefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator messagedefinitionusecontextvaluerangehighcomparator = messagedefinitionusecontextvaluerangehigh.getComparator();
		m.setMsgDfnUseCntxtVlRngHiCmprtr(messagedefinitionusecontextvaluerangehighcomparator.toCode());

		/******************** MsgDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(messagedefinitionusecontextvaluerangehigh.hasCode()) {
			m.setMsgDfnUseCntxtVlRngHiCd(String.valueOf(messagedefinitionusecontextvaluerangehigh.getCode()));
		}
		/******************** MsgDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(messagedefinitionusecontextvaluerangehigh.hasUnit()) {
			m.setMsgDfnUseCntxtVlRngHiUnt(String.valueOf(messagedefinitionusecontextvaluerangehigh.getUnit()));
		}
		/******************** MsgDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(messagedefinitionusecontextvaluerangehigh.hasSystem()) {
			m.setMsgDfnUseCntxtVlRngHiSys(String.valueOf(messagedefinitionusecontextvaluerangehigh.getSystem()));
		}
		/******************** MsgDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(messagedefinitionusecontext.hasValueReference()) {
			m.setMsgDfnUseCntxtVlRfrnc(String.valueOf(messagedefinitionusecontext.getValueReference()));
		}
		/******************** messagedefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messagedefinitionjurisdiction = messagedefinition.getJurisdictionFirstRep();

		/******************** MsgDfn_Jrsdctn_Txt ********************************************************************************/
		if(messagedefinitionjurisdiction.hasText()) {
			m.setMsgDfnJrsdctnTxt(String.valueOf(messagedefinitionjurisdiction.getText()));
		}
		/******************** messagedefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitionjurisdictioncoding = messagedefinitionjurisdiction.getCodingFirstRep();

		/******************** MsgDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(messagedefinitionjurisdictioncoding.hasVersion()) {
			m.setMsgDfnJrsdctnCdgVrsn(String.valueOf(messagedefinitionjurisdictioncoding.getVersion()));
		}
		/******************** MsgDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(messagedefinitionjurisdictioncoding.hasDisplay()) {
			m.setMsgDfnJrsdctnCdgDsply(String.valueOf(messagedefinitionjurisdictioncoding.getDisplay()));
		}
		/******************** MsgDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(messagedefinitionjurisdictioncoding.hasCode()) {
			m.setMsgDfnJrsdctnCdgCd(String.valueOf(messagedefinitionjurisdictioncoding.getCode()));
		}
		/******************** MsgDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(messagedefinitionjurisdictioncoding.hasUserSelected()) {
			m.setMsgDfnJrsdctnCdgUsrSltd(String.valueOf(messagedefinitionjurisdictioncoding.getUserSelected()));
		}
		/******************** MsgDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(messagedefinitionjurisdictioncoding.hasSystem()) {
			m.setMsgDfnJrsdctnCdgSys(String.valueOf(messagedefinitionjurisdictioncoding.getSystem()));
		}
		return m;
	}
}
