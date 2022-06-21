package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MessageHeader;
public class MessageHeaderBidirectionalConversion 
{
	public MessageHeader MessageHeaders(org.hl7.fhir.r4.model.MessageHeader messageheader) throws ParseException
	{
		 main.java.com.campfhir.model.MessageHeader m = new  main.java.com.campfhir.model.MessageHeader();

		/******************** id ********************************************************************************/
		messageheader.setId(m.getId());

		/******************** MsgHeader_Dfn ********************************************************************************/
		if(messageheader.hasDefinition()) {
			m.setMsgHeaderDfn(String.valueOf(messageheader.getDefinition()));
		}
		/******************** messageheadersource ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.MessageSourceComponent messageheadersource = messageheader.getSource();

		/******************** MsgHeader_Src_Nm ********************************************************************************/
		if(messageheadersource.hasName()) {
			m.setMsgHeaderSrcNm(String.valueOf(messageheadersource.getName()));
		}
		/******************** MsgHeader_Src_Endpoint ********************************************************************************/
		if(messageheadersource.hasEndpoint()) {
			m.setMsgHeaderSrcEndpoint(String.valueOf(messageheadersource.getEndpoint()));
		}
		/******************** messageheadersourcecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint messageheadersourcecontact = messageheadersource.getContact();

		/******************** MsgHeader_Src_Cntct_Vl ********************************************************************************/
		if(messageheadersourcecontact.hasValue()) {
			m.setMsgHeaderSrcCntctVl(String.valueOf(messageheadersourcecontact.getValue()));
		}
		/******************** messageheadersourcecontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem messageheadersourcecontactsystem = messageheadersourcecontact.getSystem();
		m.setMsgHeaderSrcCntctSys(messageheadersourcecontactsystem.toCode());

		/******************** messageheadersourcecontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period messageheadersourcecontactperiod = messageheadersourcecontact.getPeriod();

		/******************** MsgHeader_Src_Cntct_Prd_End ********************************************************************************/
		if(messageheadersourcecontactperiod.hasEnd()) {
			m.setMsgHeaderSrcCntctPrdEnd(String.valueOf(messageheadersourcecontactperiod.getEnd()));
		}
		/******************** MsgHeader_Src_Cntct_Prd_Strt ********************************************************************************/
		if(messageheadersourcecontactperiod.hasStart()) {
			m.setMsgHeaderSrcCntctPrdStrt(String.valueOf(messageheadersourcecontactperiod.getStart()));
		}
		/******************** messageheadersourcecontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse messageheadersourcecontactuse = messageheadersourcecontact.getUse();
		m.setMsgHeaderSrcCntctUse(messageheadersourcecontactuse.toCode());

		/******************** MsgHeader_Src_Cntct_Rnk ********************************************************************************/
		if(messageheadersourcecontact.hasRank()) {
			m.setMsgHeaderSrcCntctRnk(String.valueOf(messageheadersourcecontact.getRank()));
		}
		/******************** MsgHeader_Src_Software ********************************************************************************/
		if(messageheadersource.hasSoftware()) {
			m.setMsgHeaderSrcSoftware(String.valueOf(messageheadersource.getSoftware()));
		}
		/******************** messageheaderreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messageheaderreason = messageheader.getReason();

		/******************** messageheaderreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messageheaderreasoncoding = messageheaderreason.getCodingFirstRep();

		/******************** MsgHeader_Rsn_Cdg_Dsply ********************************************************************************/
		if(messageheaderreasoncoding.hasDisplay()) {
			m.setMsgHeaderRsnCdgDsply(String.valueOf(messageheaderreasoncoding.getDisplay()));
		}
		/******************** MsgHeader_Rsn_Cdg_Vrsn ********************************************************************************/
		if(messageheaderreasoncoding.hasVersion()) {
			m.setMsgHeaderRsnCdgVrsn(String.valueOf(messageheaderreasoncoding.getVersion()));
		}
		/******************** MsgHeader_Rsn_Cdg_Cd ********************************************************************************/
		if(messageheaderreasoncoding.hasCode()) {
			m.setMsgHeaderRsnCdgCd(String.valueOf(messageheaderreasoncoding.getCode()));
		}
		/******************** MsgHeader_Rsn_Cdg_Sys ********************************************************************************/
		if(messageheaderreasoncoding.hasSystem()) {
			m.setMsgHeaderRsnCdgSys(String.valueOf(messageheaderreasoncoding.getSystem()));
		}
		/******************** MsgHeader_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(messageheaderreasoncoding.hasUserSelected()) {
			m.setMsgHeaderRsnCdgUsrSltd(String.valueOf(messageheaderreasoncoding.getUserSelected()));
		}
		/******************** MsgHeader_Rsn_Txt ********************************************************************************/
		if(messageheaderreason.hasText()) {
			m.setMsgHeaderRsnTxt(String.valueOf(messageheaderreason.getText()));
		}
		/******************** messageheaderdestination ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.MessageDestinationComponent messageheaderdestination = messageheader.getDestinationFirstRep();

		/******************** MsgHeader_Destination_Nm ********************************************************************************/
		if(messageheaderdestination.hasName()) {
			m.setMsgHeaderDestinationNm(String.valueOf(messageheaderdestination.getName()));
		}
		/******************** MsgHeader_Destination_Endpoint ********************************************************************************/
		if(messageheaderdestination.hasEndpoint()) {
			m.setMsgHeaderDestinationEndpoint(String.valueOf(messageheaderdestination.getEndpoint()));
		}
		/******************** MsgHeader_Destination_Receiver ********************************************************************************/
		if(messageheaderdestination.hasReceiver()) {
			m.setMsgHeaderDestinationReceiver(String.valueOf(messageheaderdestination.getReceiver()));
		}
		/******************** MsgHeader_Athr ********************************************************************************/
		if(messageheader.hasAuthor()) {
			m.setMsgHeaderAthr(String.valueOf(messageheader.getAuthor()));
		}
		/******************** MsgHeader_Focus ********************************************************************************/
		if(messageheader.hasFocus()) {
			m.setMsgHeaderFocus(String.valueOf(messageheader.getFocusFirstRep()));
		}
		/******************** MsgHeader_Responsible ********************************************************************************/
		if(messageheader.hasResponsible()) {
			m.setMsgHeaderResponsible(String.valueOf(messageheader.getResponsible()));
		}
		/******************** MsgHeader_Sender ********************************************************************************/
		if(messageheader.hasSender()) {
			m.setMsgHeaderSender(String.valueOf(messageheader.getSender()));
		}
		/******************** MsgHeader_EvntUriTyp ********************************************************************************/
		if(messageheader.hasEventUriType()) {
			m.setMsgHeaderEvntUriTyp(String.valueOf(messageheader.getEventUriType()));
		}
		/******************** messageheadereventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messageheadereventcoding = messageheader.getEventCoding();

		/******************** MsgHeader_EvntCdg_Dsply ********************************************************************************/
		if(messageheadereventcoding.hasDisplay()) {
			m.setMsgHeaderEvntCdgDsply(String.valueOf(messageheadereventcoding.getDisplay()));
		}
		/******************** MsgHeader_EvntCdg_Vrsn ********************************************************************************/
		if(messageheadereventcoding.hasVersion()) {
			m.setMsgHeaderEvntCdgVrsn(String.valueOf(messageheadereventcoding.getVersion()));
		}
		/******************** MsgHeader_EvntCdg_Cd ********************************************************************************/
		if(messageheadereventcoding.hasCode()) {
			m.setMsgHeaderEvntCdgCd(String.valueOf(messageheadereventcoding.getCode()));
		}
		/******************** MsgHeader_EvntCdg_Sys ********************************************************************************/
		if(messageheadereventcoding.hasSystem()) {
			m.setMsgHeaderEvntCdgSys(String.valueOf(messageheadereventcoding.getSystem()));
		}
		/******************** MsgHeader_EvntCdg_UsrSltd ********************************************************************************/
		if(messageheadereventcoding.hasUserSelected()) {
			m.setMsgHeaderEvntCdgUsrSltd(String.valueOf(messageheadereventcoding.getUserSelected()));
		}
		/******************** MsgHeader_Enterer ********************************************************************************/
		if(messageheader.hasEnterer()) {
			m.setMsgHeaderEnterer(String.valueOf(messageheader.getEnterer()));
		}
		/******************** messageheaderresponse ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.MessageHeaderResponseComponent messageheaderresponse = messageheader.getResponse();

		/******************** messageheaderresponsecode ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.ResponseType messageheaderresponsecode = messageheaderresponse.getCode();
		m.setMsgHeaderRspsCd(messageheaderresponsecode.toCode());

		/******************** MsgHeader_Rsps_Id ********************************************************************************/
		if(messageheaderresponse.hasIdentifier()) {
			m.setMsgHeaderRspsId(String.valueOf(messageheaderresponse.getIdentifier()));
		}
		/******************** MsgHeader_Rsps_Dtls ********************************************************************************/
		if(messageheaderresponse.hasDetails()) {
			m.setMsgHeaderRspsDtls(String.valueOf(messageheaderresponse.getDetails()));
		}
		return m;
	}
}
