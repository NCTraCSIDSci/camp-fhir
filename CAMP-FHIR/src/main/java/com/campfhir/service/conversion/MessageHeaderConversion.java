package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MessageHeader;
public class MessageHeaderConversion 
{
	public org.hl7.fhir.r4.model.MessageHeader MessageHeaders(MessageHeader m) throws ParseException
	{
		org.hl7.fhir.r4.model.MessageHeader messageheader = new org.hl7.fhir.r4.model.MessageHeader();

		/******************** id ********************************************************************************/
		messageheader.setId(m.getId());

		/******************** MsgHeader_Athr ********************************************************************************/
		if(m.getMsgHeaderAthr() != null) {
			messageheader.setAuthor( new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderAthr()));
		}
		/******************** MsgHeader_Dfn ********************************************************************************/
		if(m.getMsgHeaderDfn() != null) {
			messageheader.setDefinition(m.getMsgHeaderDfn());
		}
		/******************** messageheaderdestination ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.MessageDestinationComponent messageheaderdestination =  new org.hl7.fhir.r4.model.MessageHeader.MessageDestinationComponent();
		messageheader.addDestination(messageheaderdestination);

		/******************** MsgHeader_Destination_Endpoint ********************************************************************************/
		if(m.getMsgHeaderDestinationEndpoint() != null) {
			messageheaderdestination.setEndpoint(m.getMsgHeaderDestinationEndpoint());
		}
		/******************** MsgHeader_Destination_Nm ********************************************************************************/
		if(m.getMsgHeaderDestinationNm() != null) {
			messageheaderdestination.setName(m.getMsgHeaderDestinationNm());
		}
		/******************** MsgHeader_Destination_Receiver ********************************************************************************/
		if(m.getMsgHeaderDestinationReceiver() != null) {
			messageheaderdestination.setReceiver( new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderDestinationReceiver()));
		}
		/******************** MsgHeader_Enterer ********************************************************************************/
		if(m.getMsgHeaderEnterer() != null) {
			messageheader.setEnterer( new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderEnterer()));
		}
		/******************** messageheadereventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messageheadereventcoding =  new org.hl7.fhir.r4.model.Coding();
		messageheader.setEvent(messageheadereventcoding);

		/******************** MsgHeader_EvntCdg_Cd ********************************************************************************/
		if(m.getMsgHeaderEvntCdgCd() != null) {
			messageheadereventcoding.setCode(m.getMsgHeaderEvntCdgCd());
		}
		/******************** MsgHeader_EvntCdg_Dsply ********************************************************************************/
		if(m.getMsgHeaderEvntCdgDsply() != null) {
			messageheadereventcoding.setDisplay(m.getMsgHeaderEvntCdgDsply());
		}
		/******************** MsgHeader_EvntCdg_Sys ********************************************************************************/
		if(m.getMsgHeaderEvntCdgSys() != null) {
			messageheadereventcoding.setSystem(m.getMsgHeaderEvntCdgSys());
		}
		/******************** MsgHeader_EvntCdg_UsrSltd ********************************************************************************/
		if(m.getMsgHeaderEvntCdgUsrSltd() != null) {
			messageheadereventcoding.setUserSelected(Boolean.parseBoolean(m.getMsgHeaderEvntCdgUsrSltd()));
		}
		/******************** MsgHeader_EvntCdg_Vrsn ********************************************************************************/
		if(m.getMsgHeaderEvntCdgVrsn() != null) {
			messageheadereventcoding.setVersion(m.getMsgHeaderEvntCdgVrsn());
		}
		/******************** MsgHeader_EvntUriTyp ********************************************************************************/
		if(m.getMsgHeaderEvntUriTyp() != null) {
			messageheader.setEvent( new org.hl7.fhir.r4.model.UriType(m.getMsgHeaderEvntUriTyp()));
		}
		/******************** MsgHeader_Focus ********************************************************************************/
		if(m.getMsgHeaderFocus() != null) {
			messageheader.addFocus( new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderFocus()));
		}
		/******************** messageheaderreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messageheaderreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		messageheader.setReason(messageheaderreason);

		/******************** messageheaderreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messageheaderreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		messageheaderreason.addCoding(messageheaderreasoncoding);

		/******************** MsgHeader_Rsn_Cdg_Cd ********************************************************************************/
		if(m.getMsgHeaderRsnCdgCd() != null) {
			messageheaderreasoncoding.setCode(m.getMsgHeaderRsnCdgCd());
		}
		/******************** MsgHeader_Rsn_Cdg_Dsply ********************************************************************************/
		if(m.getMsgHeaderRsnCdgDsply() != null) {
			messageheaderreasoncoding.setDisplay(m.getMsgHeaderRsnCdgDsply());
		}
		/******************** MsgHeader_Rsn_Cdg_Sys ********************************************************************************/
		if(m.getMsgHeaderRsnCdgSys() != null) {
			messageheaderreasoncoding.setSystem(m.getMsgHeaderRsnCdgSys());
		}
		/******************** MsgHeader_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsgHeaderRsnCdgUsrSltd() != null) {
			messageheaderreasoncoding.setUserSelected(Boolean.parseBoolean(m.getMsgHeaderRsnCdgUsrSltd()));
		}
		/******************** MsgHeader_Rsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMsgHeaderRsnCdgVrsn() != null) {
			messageheaderreasoncoding.setVersion(m.getMsgHeaderRsnCdgVrsn());
		}
		/******************** MsgHeader_Rsn_Txt ********************************************************************************/
		if(m.getMsgHeaderRsnTxt() != null) {
			messageheaderreason.setText(m.getMsgHeaderRsnTxt());
		}
		/******************** messageheaderresponse ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.MessageHeaderResponseComponent messageheaderresponse =  new org.hl7.fhir.r4.model.MessageHeader.MessageHeaderResponseComponent();
		messageheader.setResponse(messageheaderresponse);

		/******************** messageheaderresponsecode ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.ResponseTypeEnumFactory messageheaderresponsecode =  new org.hl7.fhir.r4.model.MessageHeader.ResponseTypeEnumFactory();
		messageheaderresponse.setCode(messageheaderresponsecode.fromCode(m.getMsgHeaderRspsCd()));

		/******************** MsgHeader_Rsps_Dtls ********************************************************************************/
		if(m.getMsgHeaderRspsDtls() != null) {
			messageheaderresponse.setDetails( new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderRspsDtls()));
		}
		/******************** MsgHeader_Rsps_Id ********************************************************************************/
		if(m.getMsgHeaderRspsId() != null) {
			messageheaderresponse.setIdentifier(m.getMsgHeaderRspsId());
		}
		/******************** MsgHeader_Responsible ********************************************************************************/
		if(m.getMsgHeaderResponsible() != null) {
			messageheader.setResponsible( new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderResponsible()));
		}
		/******************** MsgHeader_Sender ********************************************************************************/
		if(m.getMsgHeaderSender() != null) {
			messageheader.setSender( new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderSender()));
		}
		/******************** messageheadersource ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.MessageSourceComponent messageheadersource =  new org.hl7.fhir.r4.model.MessageHeader.MessageSourceComponent();
		messageheader.setSource(messageheadersource);

		/******************** messageheadersourcecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint messageheadersourcecontact =  new org.hl7.fhir.r4.model.ContactPoint();
		messageheadersource.setContact(messageheadersourcecontact);

		/******************** messageheadersourcecontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period messageheadersourcecontactperiod =  new org.hl7.fhir.r4.model.Period();
		messageheadersourcecontact.setPeriod(messageheadersourcecontactperiod);

		/******************** MsgHeader_Src_Cntct_Prd_End ********************************************************************************/
		if(m.getMsgHeaderSrcCntctPrdEnd() != null) {
			java.text.SimpleDateFormat MsgHeader_Src_Cntct_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsgHeader_Src_Cntct_Prd_Enddate = MsgHeader_Src_Cntct_Prd_Endsdf.parse(m.getMsgHeaderSrcCntctPrdEnd());
			messageheadersourcecontactperiod.setEnd(MsgHeader_Src_Cntct_Prd_Enddate);
		}
		/******************** MsgHeader_Src_Cntct_Prd_Strt ********************************************************************************/
		if(m.getMsgHeaderSrcCntctPrdStrt() != null) {
			java.text.SimpleDateFormat MsgHeader_Src_Cntct_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date MsgHeader_Src_Cntct_Prd_Strtdate = MsgHeader_Src_Cntct_Prd_Strtsdf.parse(m.getMsgHeaderSrcCntctPrdStrt());
			messageheadersourcecontactperiod.setStart(MsgHeader_Src_Cntct_Prd_Strtdate);
		}
		/******************** MsgHeader_Src_Cntct_Rnk ********************************************************************************/
		if(m.getMsgHeaderSrcCntctRnk() != null) {
			messageheadersourcecontact.setRank(Integer.parseInt(m.getMsgHeaderSrcCntctRnk()));
		}
		/******************** messageheadersourcecontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory messageheadersourcecontactsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		messageheadersourcecontact.setSystem(messageheadersourcecontactsystem.fromCode(m.getMsgHeaderSrcCntctSys()));

		/******************** messageheadersourcecontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory messageheadersourcecontactuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		messageheadersourcecontact.setUse(messageheadersourcecontactuse.fromCode(m.getMsgHeaderSrcCntctUse()));

		/******************** MsgHeader_Src_Cntct_Vl ********************************************************************************/
		if(m.getMsgHeaderSrcCntctVl() != null) {
			messageheadersourcecontact.setValue(m.getMsgHeaderSrcCntctVl());
		}
		/******************** MsgHeader_Src_Endpoint ********************************************************************************/
		if(m.getMsgHeaderSrcEndpoint() != null) {
			messageheadersource.setEndpoint(m.getMsgHeaderSrcEndpoint());
		}
		/******************** MsgHeader_Src_Nm ********************************************************************************/
		if(m.getMsgHeaderSrcNm() != null) {
			messageheadersource.setName(m.getMsgHeaderSrcNm());
		}
		/******************** MsgHeader_Src_Software ********************************************************************************/
		if(m.getMsgHeaderSrcSoftware() != null) {
			messageheadersource.setSoftware(m.getMsgHeaderSrcSoftware());
		}
		/******************** MsgHeader_Src_Vrsn ********************************************************************************/
		if(m.getMsgHeaderSrcVrsn() != null) {
			messageheadersource.setVersion(m.getMsgHeaderSrcVrsn());
		}
		return messageheader;
	}
}
