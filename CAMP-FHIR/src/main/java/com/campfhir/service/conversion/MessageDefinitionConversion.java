package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MessageDefinition;
public class MessageDefinitionConversion 
{
	public org.hl7.fhir.r4.model.MessageDefinition MessageDefinitions(MessageDefinition m) throws ParseException
	{
		org.hl7.fhir.r4.model.MessageDefinition messagedefinition = new org.hl7.fhir.r4.model.MessageDefinition();

		/******************** id ********************************************************************************/
		messagedefinition.setId(m.getId());

		/******************** messagedefinitionallowedresponse ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent messagedefinitionallowedresponse =  new org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent();
		messagedefinition.addAllowedResponse(messagedefinitionallowedresponse);

		/******************** MsgDfn_AllowedRsps_Msg ********************************************************************************/
		if(m.getMsgDfnAllowedRspsMsg() != null) {
			messagedefinitionallowedresponse.setMessage(m.getMsgDfnAllowedRspsMsg());
		}
		/******************** MsgDfn_AllowedRsps_Situation ********************************************************************************/
		if(m.getMsgDfnAllowedRspsSituation() != null) {
			messagedefinitionallowedresponse.setSituation(m.getMsgDfnAllowedRspsSituation());
		}
		/******************** MsgDfn_Base ********************************************************************************/
		if(m.getMsgDfnBase() != null) {
			messagedefinition.setBase(m.getMsgDfnBase());
		}
		/******************** messagedefinitioncategory ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageSignificanceCategoryEnumFactory messagedefinitioncategory =  new org.hl7.fhir.r4.model.MessageDefinition.MessageSignificanceCategoryEnumFactory();
		messagedefinition.setCategory(messagedefinitioncategory.fromCode(m.getMsgDfnCtgry()));

		/******************** messagedefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail messagedefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		messagedefinition.addContact(messagedefinitioncontact);

		/******************** MsgDfn_Cntct_Nm ********************************************************************************/
		if(m.getMsgDfnCntctNm() != null) {
			messagedefinitioncontact.setName(m.getMsgDfnCntctNm());
		}
		/******************** messagedefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint messagedefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		messagedefinitioncontact.addTelecom(messagedefinitioncontacttelecom);

		/******************** messagedefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period messagedefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		messagedefinitioncontacttelecom.setPeriod(messagedefinitioncontacttelecomperiod);

		/******************** MsgDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(m.getMsgDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat MsgDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsgDfn_Cntct_Tlcm_Prd_Enddate = MsgDfn_Cntct_Tlcm_Prd_Endsdf.parse(m.getMsgDfnCntctTlcmPrdEnd());
			messagedefinitioncontacttelecomperiod.setEnd(MsgDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** MsgDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(m.getMsgDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat MsgDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsgDfn_Cntct_Tlcm_Prd_Strtdate = MsgDfn_Cntct_Tlcm_Prd_Strtsdf.parse(m.getMsgDfnCntctTlcmPrdStrt());
			messagedefinitioncontacttelecomperiod.setStart(MsgDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** MsgDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(m.getMsgDfnCntctTlcmRnk() != null) {
			messagedefinitioncontacttelecom.setRank(Integer.parseInt(m.getMsgDfnCntctTlcmRnk()));
		}
		/******************** messagedefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory messagedefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		messagedefinitioncontacttelecom.setSystem(messagedefinitioncontacttelecomsystem.fromCode(m.getMsgDfnCntctTlcmSys()));

		/******************** messagedefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory messagedefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		messagedefinitioncontacttelecom.setUse(messagedefinitioncontacttelecomuse.fromCode(m.getMsgDfnCntctTlcmUse()));

		/******************** MsgDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(m.getMsgDfnCntctTlcmVl() != null) {
			messagedefinitioncontacttelecom.setValue(m.getMsgDfnCntctTlcmVl());
		}
		/******************** MsgDfn_Copyright ********************************************************************************/
		if(m.getMsgDfnCopyright() != null) {
			messagedefinition.setCopyright(m.getMsgDfnCopyright());
		}
		/******************** MsgDfn_Dt ********************************************************************************/
		if(m.getMsgDfnDt() != null) {
			java.text.SimpleDateFormat MsgDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsgDfn_Dtdate = MsgDfn_Dtsdf.parse(m.getMsgDfnDt());
			messagedefinition.setDate(MsgDfn_Dtdate);
		}
		/******************** MsgDfn_Dscrptn ********************************************************************************/
		if(m.getMsgDfnDscrptn() != null) {
			messagedefinition.setDescription(m.getMsgDfnDscrptn());
		}
		/******************** messagedefinitioneventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitioneventcoding =  new org.hl7.fhir.r4.model.Coding();
		messagedefinition.setEvent(messagedefinitioneventcoding);

		/******************** MsgDfn_EvntCdg_Cd ********************************************************************************/
		if(m.getMsgDfnEvntCdgCd() != null) {
			messagedefinitioneventcoding.setCode(m.getMsgDfnEvntCdgCd());
		}
		/******************** MsgDfn_EvntCdg_Dsply ********************************************************************************/
		if(m.getMsgDfnEvntCdgDsply() != null) {
			messagedefinitioneventcoding.setDisplay(m.getMsgDfnEvntCdgDsply());
		}
		/******************** MsgDfn_EvntCdg_Sys ********************************************************************************/
		if(m.getMsgDfnEvntCdgSys() != null) {
			messagedefinitioneventcoding.setSystem(m.getMsgDfnEvntCdgSys());
		}
		/******************** MsgDfn_EvntCdg_UsrSltd ********************************************************************************/
		if(m.getMsgDfnEvntCdgUsrSltd() != null) {
			messagedefinitioneventcoding.setUserSelected(Boolean.parseBoolean(m.getMsgDfnEvntCdgUsrSltd()));
		}
		/******************** MsgDfn_EvntCdg_Vrsn ********************************************************************************/
		if(m.getMsgDfnEvntCdgVrsn() != null) {
			messagedefinitioneventcoding.setVersion(m.getMsgDfnEvntCdgVrsn());
		}
		/******************** MsgDfn_EvntUriTyp ********************************************************************************/
		if(m.getMsgDfnEvntUriTyp() != null) {
			messagedefinition.setEvent( new org.hl7.fhir.r4.model.UriType(m.getMsgDfnEvntUriTyp()));
		}
		/******************** MsgDfn_Exprmtl ********************************************************************************/
		if(m.getMsgDfnExprmtl() != null) {
			messagedefinition.setExperimental(Boolean.parseBoolean(m.getMsgDfnExprmtl()));
		}
		/******************** messagedefinitionfocus ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent messagedefinitionfocus =  new org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent();
		messagedefinition.addFocus(messagedefinitionfocus);

		/******************** MsgDfn_Focus_Cd ********************************************************************************/
		if(m.getMsgDfnFocusCd() != null) {
			messagedefinitionfocus.setCode(m.getMsgDfnFocusCd());
		}
		/******************** MsgDfn_Focus_Mx ********************************************************************************/
		if(m.getMsgDfnFocusMx() != null) {
			messagedefinitionfocus.setMax(m.getMsgDfnFocusMx());
		}
		/******************** MsgDfn_Focus_Min ********************************************************************************/
		if(m.getMsgDfnFocusMin() != null) {
			messagedefinitionfocus.setMin(Integer.parseInt(m.getMsgDfnFocusMin()));
		}
		/******************** MsgDfn_Focus_Profile ********************************************************************************/
		if(m.getMsgDfnFocusProfile() != null) {
			messagedefinitionfocus.setProfile(m.getMsgDfnFocusProfile());
		}
		/******************** MsgDfn_Graph ********************************************************************************/
		if(m.getMsgDfnGraph() != null) {
			messagedefinition.addGraph(m.getMsgDfnGraph());
		}
		/******************** messagedefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier messagedefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		messagedefinition.addIdentifier(messagedefinitionidentifier);

		/******************** MsgDfn_Id_Assigner ********************************************************************************/
		if(m.getMsgDfnIdAssigner() != null) {
			messagedefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(m.getMsgDfnIdAssigner()));
		}
		/******************** messagedefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period messagedefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		messagedefinitionidentifier.setPeriod(messagedefinitionidentifierperiod);

		/******************** MsgDfn_Id_Prd_End ********************************************************************************/
		if(m.getMsgDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat MsgDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsgDfn_Id_Prd_Enddate = MsgDfn_Id_Prd_Endsdf.parse(m.getMsgDfnIdPrdEnd());
			messagedefinitionidentifierperiod.setEnd(MsgDfn_Id_Prd_Enddate);
		}
		/******************** MsgDfn_Id_Prd_Strt ********************************************************************************/
		if(m.getMsgDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat MsgDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsgDfn_Id_Prd_Strtdate = MsgDfn_Id_Prd_Strtsdf.parse(m.getMsgDfnIdPrdStrt());
			messagedefinitionidentifierperiod.setStart(MsgDfn_Id_Prd_Strtdate);
		}
		/******************** MsgDfn_Id_Sys ********************************************************************************/
		if(m.getMsgDfnIdSys() != null) {
			messagedefinitionidentifier.setSystem(m.getMsgDfnIdSys());
		}
		/******************** messagedefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messagedefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		messagedefinitionidentifier.setType(messagedefinitionidentifiertype);

		/******************** messagedefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		messagedefinitionidentifiertype.addCoding(messagedefinitionidentifiertypecoding);

		/******************** MsgDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(m.getMsgDfnIdTypCdgCd() != null) {
			messagedefinitionidentifiertypecoding.setCode(m.getMsgDfnIdTypCdgCd());
		}
		/******************** MsgDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(m.getMsgDfnIdTypCdgDsply() != null) {
			messagedefinitionidentifiertypecoding.setDisplay(m.getMsgDfnIdTypCdgDsply());
		}
		/******************** MsgDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(m.getMsgDfnIdTypCdgSys() != null) {
			messagedefinitionidentifiertypecoding.setSystem(m.getMsgDfnIdTypCdgSys());
		}
		/******************** MsgDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsgDfnIdTypCdgUsrSltd() != null) {
			messagedefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(m.getMsgDfnIdTypCdgUsrSltd()));
		}
		/******************** MsgDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(m.getMsgDfnIdTypCdgVrsn() != null) {
			messagedefinitionidentifiertypecoding.setVersion(m.getMsgDfnIdTypCdgVrsn());
		}
		/******************** MsgDfn_Id_Typ_Txt ********************************************************************************/
		if(m.getMsgDfnIdTypTxt() != null) {
			messagedefinitionidentifiertype.setText(m.getMsgDfnIdTypTxt());
		}
		/******************** messagedefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory messagedefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		messagedefinitionidentifier.setUse(messagedefinitionidentifieruse.fromCode(m.getMsgDfnIdUse()));

		/******************** MsgDfn_Id_Vl ********************************************************************************/
		if(m.getMsgDfnIdVl() != null) {
			messagedefinitionidentifier.setValue(m.getMsgDfnIdVl());
		}
		/******************** messagedefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messagedefinitionjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		messagedefinition.addJurisdiction(messagedefinitionjurisdiction);

		/******************** messagedefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitionjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		messagedefinitionjurisdiction.addCoding(messagedefinitionjurisdictioncoding);

		/******************** MsgDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgCd() != null) {
			messagedefinitionjurisdictioncoding.setCode(m.getMsgDfnJrsdctnCdgCd());
		}
		/******************** MsgDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgDsply() != null) {
			messagedefinitionjurisdictioncoding.setDisplay(m.getMsgDfnJrsdctnCdgDsply());
		}
		/******************** MsgDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgSys() != null) {
			messagedefinitionjurisdictioncoding.setSystem(m.getMsgDfnJrsdctnCdgSys());
		}
		/******************** MsgDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgUsrSltd() != null) {
			messagedefinitionjurisdictioncoding.setUserSelected(Boolean.parseBoolean(m.getMsgDfnJrsdctnCdgUsrSltd()));
		}
		/******************** MsgDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(m.getMsgDfnJrsdctnCdgVrsn() != null) {
			messagedefinitionjurisdictioncoding.setVersion(m.getMsgDfnJrsdctnCdgVrsn());
		}
		/******************** MsgDfn_Jrsdctn_Txt ********************************************************************************/
		if(m.getMsgDfnJrsdctnTxt() != null) {
			messagedefinitionjurisdiction.setText(m.getMsgDfnJrsdctnTxt());
		}
		/******************** MsgDfn_Nm ********************************************************************************/
		if(m.getMsgDfnNm() != null) {
			messagedefinition.setName(m.getMsgDfnNm());
		}
		/******************** MsgDfn_Parent ********************************************************************************/
		if(m.getMsgDfnParent() != null) {
			messagedefinition.addParent(m.getMsgDfnParent());
		}
		/******************** MsgDfn_Pblshr ********************************************************************************/
		if(m.getMsgDfnPblshr() != null) {
			messagedefinition.setPublisher(m.getMsgDfnPblshr());
		}
		/******************** MsgDfn_Prpse ********************************************************************************/
		if(m.getMsgDfnPrpse() != null) {
			messagedefinition.setPurpose(m.getMsgDfnPrpse());
		}
		/******************** MsgDfn_Replaces ********************************************************************************/
		if(m.getMsgDfnReplaces() != null) {
			messagedefinition.addReplaces(m.getMsgDfnReplaces());
		}
		/******************** messagedefinitionresponserequired ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageheaderResponseRequestEnumFactory messagedefinitionresponserequired =  new org.hl7.fhir.r4.model.MessageDefinition.MessageheaderResponseRequestEnumFactory();
		messagedefinition.setResponseRequired(messagedefinitionresponserequired.fromCode(m.getMsgDfnRspsRequired()));

		/******************** messagedefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory messagedefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		messagedefinition.setStatus(messagedefinitionstatus.fromCode(m.getMsgDfnSts()));

		/******************** MsgDfn_Ttl ********************************************************************************/
		if(m.getMsgDfnTtl() != null) {
			messagedefinition.setTitle(m.getMsgDfnTtl());
		}
		/******************** MsgDfn_Url ********************************************************************************/
		if(m.getMsgDfnUrl() != null) {
			messagedefinition.setUrl(m.getMsgDfnUrl());
		}
		/******************** messagedefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext messagedefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		messagedefinition.addUseContext(messagedefinitionusecontext);

		/******************** messagedefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		messagedefinitionusecontext.setCode(messagedefinitionusecontextcode);

		/******************** MsgDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdCd() != null) {
			messagedefinitionusecontextcode.setCode(m.getMsgDfnUseCntxtCdCd());
		}
		/******************** MsgDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdDsply() != null) {
			messagedefinitionusecontextcode.setDisplay(m.getMsgDfnUseCntxtCdDsply());
		}
		/******************** MsgDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdSys() != null) {
			messagedefinitionusecontextcode.setSystem(m.getMsgDfnUseCntxtCdSys());
		}
		/******************** MsgDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdUsrSltd() != null) {
			messagedefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(m.getMsgDfnUseCntxtCdUsrSltd()));
		}
		/******************** MsgDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(m.getMsgDfnUseCntxtCdVrsn() != null) {
			messagedefinitionusecontextcode.setVersion(m.getMsgDfnUseCntxtCdVrsn());
		}
		/******************** messagedefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messagedefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		messagedefinitionusecontext.setValue(messagedefinitionusecontextvaluecodeableconcept);

		/******************** messagedefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		messagedefinitionusecontextvaluecodeableconcept.addCoding(messagedefinitionusecontextvaluecodeableconceptcoding);

		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			messagedefinitionusecontextvaluecodeableconceptcoding.setCode(m.getMsgDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			messagedefinitionusecontextvaluecodeableconceptcoding.setDisplay(m.getMsgDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			messagedefinitionusecontextvaluecodeableconceptcoding.setSystem(m.getMsgDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			messagedefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(m.getMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			messagedefinitionusecontextvaluecodeableconceptcoding.setVersion(m.getMsgDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlCdbleCncptTxt() != null) {
			messagedefinitionusecontextvaluecodeableconcept.setText(m.getMsgDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** messagedefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity messagedefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		messagedefinitionusecontext.setValue(messagedefinitionusecontextvaluequantity);

		/******************** MsgDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlQntyCd() != null) {
			messagedefinitionusecontextvaluequantity.setCode(m.getMsgDfnUseCntxtVlQntyCd());
		}
		/******************** messagedefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory messagedefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		messagedefinitionusecontextvaluequantity.setComparator(messagedefinitionusecontextvaluequantitycomparator.fromCode(m.getMsgDfnUseCntxtVlQntyCmprtr()));

		/******************** MsgDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlQntySys() != null) {
			messagedefinitionusecontextvaluequantity.setSystem(m.getMsgDfnUseCntxtVlQntySys());
		}
		/******************** MsgDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlQntyUnt() != null) {
			messagedefinitionusecontextvaluequantity.setUnit(m.getMsgDfnUseCntxtVlQntyUnt());
		}
		/******************** MsgDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlQntyVl() != null) {
			messagedefinitionusecontextvaluequantity.setValue(Double.parseDouble((m.getMsgDfnUseCntxtVlQntyVl())));
		}
		/******************** messagedefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range messagedefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		messagedefinitionusecontext.setValue(messagedefinitionusecontextvaluerange);

		/******************** messagedefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity messagedefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		messagedefinitionusecontextvaluerange.setHigh(messagedefinitionusecontextvaluerangehigh);

		/******************** MsgDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngHiCd() != null) {
			messagedefinitionusecontextvaluerangehigh.setCode(m.getMsgDfnUseCntxtVlRngHiCd());
		}
		/******************** messagedefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory messagedefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		messagedefinitionusecontextvaluerangehigh.setComparator(messagedefinitionusecontextvaluerangehighcomparator.fromCode(m.getMsgDfnUseCntxtVlRngHiCmprtr()));

		/******************** MsgDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngHiSys() != null) {
			messagedefinitionusecontextvaluerangehigh.setSystem(m.getMsgDfnUseCntxtVlRngHiSys());
		}
		/******************** MsgDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngHiUnt() != null) {
			messagedefinitionusecontextvaluerangehigh.setUnit(m.getMsgDfnUseCntxtVlRngHiUnt());
		}
		/******************** MsgDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngHiVl() != null) {
			messagedefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((m.getMsgDfnUseCntxtVlRngHiVl())));
		}
		/******************** messagedefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity messagedefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		messagedefinitionusecontextvaluerange.setLow(messagedefinitionusecontextvaluerangelow);

		/******************** MsgDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngLwCd() != null) {
			messagedefinitionusecontextvaluerangelow.setCode(m.getMsgDfnUseCntxtVlRngLwCd());
		}
		/******************** messagedefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory messagedefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		messagedefinitionusecontextvaluerangelow.setComparator(messagedefinitionusecontextvaluerangelowcomparator.fromCode(m.getMsgDfnUseCntxtVlRngLwCmprtr()));

		/******************** MsgDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngLwSys() != null) {
			messagedefinitionusecontextvaluerangelow.setSystem(m.getMsgDfnUseCntxtVlRngLwSys());
		}
		/******************** MsgDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngLwUnt() != null) {
			messagedefinitionusecontextvaluerangelow.setUnit(m.getMsgDfnUseCntxtVlRngLwUnt());
		}
		/******************** MsgDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRngLwVl() != null) {
			messagedefinitionusecontextvaluerangelow.setValue(Double.parseDouble((m.getMsgDfnUseCntxtVlRngLwVl())));
		}
		/******************** MsgDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(m.getMsgDfnUseCntxtVlRfrnc() != null) {
			messagedefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(m.getMsgDfnUseCntxtVlRfrnc()));
		}
		/******************** MsgDfn_Vrsn ********************************************************************************/
		if(m.getMsgDfnVrsn() != null) {
			messagedefinition.setVersion(m.getMsgDfnVrsn());
		}
		return messagedefinition;
	}
}
