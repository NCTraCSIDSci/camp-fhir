package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MessageHeader;
public class MessageHeaderBidirectionalConversion 
{
	public MessageHeader MessageHeaders(org.hl7.fhir.r4.model.MessageHeader messageheader) throws ParseException
	{
		 main.java.com.campfhir.model.MessageHeader m = new  main.java.com.campfhir.model.MessageHeader();

		/******************** id ********************************************************************************/
		m.setId(messageheader.getIdElement().getIdPart());

		/******************** MsgHeader_Dfn ********************************************************************************/
		if(messageheader.hasDefinition()) {

			m.addMsgHeaderDfn(String.valueOf(messageheader.getDefinition()));
		} else {
			m.addMsgHeaderDfn("NULL");
		}


		/******************** messageheadersource ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.MessageSourceComponent messageheadersource = messageheader.getSource();

		/******************** MsgHeader_Src_Nm ********************************************************************************/
		if(messageheadersource.hasName()) {

			m.addMsgHeaderSrcNm(String.valueOf(messageheadersource.getName()));
		} else {
			m.addMsgHeaderSrcNm("NULL");
		}


		/******************** MsgHeader_Src_Endpoint ********************************************************************************/
		if(messageheadersource.hasEndpoint()) {

			m.addMsgHeaderSrcEndpoint(String.valueOf(messageheadersource.getEndpoint()));
		} else {
			m.addMsgHeaderSrcEndpoint("NULL");
		}


		/******************** messageheadersourcecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint messageheadersourcecontact = messageheadersource.getContact();

		/******************** MsgHeader_Src_Cntct_Vl ********************************************************************************/
		if(messageheadersourcecontact.hasValue()) {

			m.addMsgHeaderSrcCntctVl(String.valueOf(messageheadersourcecontact.getValue()));
		} else {
			m.addMsgHeaderSrcCntctVl("NULL");
		}


		/******************** messageheadersourcecontactperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period messageheadersourcecontactperiod = messageheadersourcecontact.getPeriod();

		/******************** MsgHeader_Src_Cntct_Prd_Strt ********************************************************************************/
		if(messageheadersourcecontactperiod.hasStart()) {

			m.addMsgHeaderSrcCntctPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(messageheadersourcecontactperiod.getStart())+"\"");
		} else {
			m.addMsgHeaderSrcCntctPrdStrt("NULL");
		}


		/******************** MsgHeader_Src_Cntct_Prd_End ********************************************************************************/
		if(messageheadersourcecontactperiod.hasEnd()) {

			m.addMsgHeaderSrcCntctPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(messageheadersourcecontactperiod.getEnd())+"\"");
		} else {
			m.addMsgHeaderSrcCntctPrdEnd("NULL");
		}


		/******************** messageheadersourcecontactuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse messageheadersourcecontactuse = messageheadersourcecontact.getUse();
		if(messageheadersourcecontactuse!=null) {
			m.addMsgHeaderSrcCntctUse(messageheadersourcecontactuse.toCode());
		} else {
			m.addMsgHeaderSrcCntctUse("NULL");
		}

		/******************** messageheadersourcecontactsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem messageheadersourcecontactsystem = messageheadersourcecontact.getSystem();
		if(messageheadersourcecontactsystem!=null) {
			m.addMsgHeaderSrcCntctSys(messageheadersourcecontactsystem.toCode());
		} else {
			m.addMsgHeaderSrcCntctSys("NULL");
		}

		/******************** MsgHeader_Src_Cntct_Rnk ********************************************************************************/
		if(messageheadersourcecontact.hasRank()) {

			m.addMsgHeaderSrcCntctRnk(String.valueOf(messageheadersourcecontact.getRank()));
		} else {
			m.addMsgHeaderSrcCntctRnk("NULL");
		}


		/******************** MsgHeader_Src_Software ********************************************************************************/
		if(messageheadersource.hasSoftware()) {

			m.addMsgHeaderSrcSoftware(String.valueOf(messageheadersource.getSoftware()));
		} else {
			m.addMsgHeaderSrcSoftware("NULL");
		}


		/******************** messageheaderreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messageheaderreason = messageheader.getReason();

		/******************** MsgHeader_Rsn_Txt ********************************************************************************/
		if(messageheaderreason.hasText()) {

			m.addMsgHeaderRsnTxt(String.valueOf(messageheaderreason.getText()));
		} else {
			m.addMsgHeaderRsnTxt("NULL");
		}


		/******************** messageheaderreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> messageheaderreasoncodinglist = messageheaderreason.getCoding();
		for(int messageheaderreasoncodingi = 0; messageheaderreasoncodingi<messageheaderreasoncodinglist.size();messageheaderreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  messageheaderreasoncoding = messageheaderreasoncodinglist.get(messageheaderreasoncodingi);

		/******************** MsgHeader_Rsn_Cdg_Dsply ********************************************************************************/
		if(messageheaderreasoncodingi == 0) {m.addMsgHeaderRsnCdgDsply("[");}
		if(messageheaderreasoncoding.hasDisplay()) {

			m.addMsgHeaderRsnCdgDsply(String.valueOf(messageheaderreasoncoding.getDisplay()));
		} else {
			m.addMsgHeaderRsnCdgDsply("NULL");
		}

		if(messageheaderreasoncodingi == messageheaderreasoncodinglist.size()-1) {m.addMsgHeaderRsnCdgDsply("]");}


		/******************** MsgHeader_Rsn_Cdg_Vrsn ********************************************************************************/
		if(messageheaderreasoncodingi == 0) {m.addMsgHeaderRsnCdgVrsn("[");}
		if(messageheaderreasoncoding.hasVersion()) {

			m.addMsgHeaderRsnCdgVrsn(String.valueOf(messageheaderreasoncoding.getVersion()));
		} else {
			m.addMsgHeaderRsnCdgVrsn("NULL");
		}

		if(messageheaderreasoncodingi == messageheaderreasoncodinglist.size()-1) {m.addMsgHeaderRsnCdgVrsn("]");}


		/******************** MsgHeader_Rsn_Cdg_Cd ********************************************************************************/
		if(messageheaderreasoncodingi == 0) {m.addMsgHeaderRsnCdgCd("[");}
		if(messageheaderreasoncoding.hasCode()) {

			m.addMsgHeaderRsnCdgCd(String.valueOf(messageheaderreasoncoding.getCode()));
		} else {
			m.addMsgHeaderRsnCdgCd("NULL");
		}

		if(messageheaderreasoncodingi == messageheaderreasoncodinglist.size()-1) {m.addMsgHeaderRsnCdgCd("]");}


		/******************** MsgHeader_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(messageheaderreasoncodingi == 0) {m.addMsgHeaderRsnCdgUsrSltd("[");}
		if(messageheaderreasoncoding.hasUserSelected()) {

			m.addMsgHeaderRsnCdgUsrSltd(String.valueOf(messageheaderreasoncoding.getUserSelected()));
		} else {
			m.addMsgHeaderRsnCdgUsrSltd("NULL");
		}

		if(messageheaderreasoncodingi == messageheaderreasoncodinglist.size()-1) {m.addMsgHeaderRsnCdgUsrSltd("]");}


		/******************** MsgHeader_Rsn_Cdg_Sys ********************************************************************************/
		if(messageheaderreasoncodingi == 0) {m.addMsgHeaderRsnCdgSys("[");}
		if(messageheaderreasoncoding.hasSystem()) {

			m.addMsgHeaderRsnCdgSys(String.valueOf(messageheaderreasoncoding.getSystem()));
		} else {
			m.addMsgHeaderRsnCdgSys("NULL");
		}

		if(messageheaderreasoncodingi == messageheaderreasoncodinglist.size()-1) {m.addMsgHeaderRsnCdgSys("]");}


		 };
		/******************** MsgHeader_Focus ********************************************************************************/
		if(messageheader.hasFocus()) {

			String  array = "[";
			for(int incr=0; incr<messageheader.getFocus().size(); incr++) {
				array = array + messageheader.getFocus().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMsgHeaderFocus(array);

		} else {
			m.addMsgHeaderFocus("NULL");
		}


		/******************** MsgHeader_Enterer ********************************************************************************/
		if(messageheader.hasEnterer()) {

			if(messageheader.getEnterer().getReference() != null) {
			m.addMsgHeaderEnterer(messageheader.getEnterer().getReference());
			}
		} else {
			m.addMsgHeaderEnterer("NULL");
		}


		/******************** messageheaderresponse ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.MessageHeaderResponseComponent messageheaderresponse = messageheader.getResponse();

		/******************** messageheaderresponsecode ********************************************************************************/
		org.hl7.fhir.r4.model.MessageHeader.ResponseType messageheaderresponsecode = messageheaderresponse.getCode();
		if(messageheaderresponsecode!=null) {
			m.addMsgHeaderRspsCd(messageheaderresponsecode.toCode());
		} else {
			m.addMsgHeaderRspsCd("NULL");
		}

		/******************** MsgHeader_Rsps_Id ********************************************************************************/
		if(messageheaderresponse.hasIdentifier()) {

			m.addMsgHeaderRspsId(String.valueOf(messageheaderresponse.getIdentifier()));
		} else {
			m.addMsgHeaderRspsId("NULL");
		}


		/******************** MsgHeader_Rsps_Dtls ********************************************************************************/
		if(messageheaderresponse.hasDetails()) {

			if(messageheaderresponse.getDetails().getReference() != null) {
			m.addMsgHeaderRspsDtls(messageheaderresponse.getDetails().getReference());
			}
		} else {
			m.addMsgHeaderRspsDtls("NULL");
		}


		/******************** MsgHeader_EvntUriTyp ********************************************************************************/
		if(messageheader.hasEventUriType()) {

			m.addMsgHeaderEvntUriTyp("\""+messageheader.getEventUriType().getValueAsString()+"\"");
		} else {
			m.addMsgHeaderEvntUriTyp("NULL");
		}


		/******************** messageheadereventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messageheadereventcoding = messageheader.getEventCoding();

		/******************** MsgHeader_EvntCdg_Dsply ********************************************************************************/
		if(messageheadereventcoding.hasDisplay()) {

			m.addMsgHeaderEvntCdgDsply(String.valueOf(messageheadereventcoding.getDisplay()));
		} else {
			m.addMsgHeaderEvntCdgDsply("NULL");
		}


		/******************** MsgHeader_EvntCdg_Vrsn ********************************************************************************/
		if(messageheadereventcoding.hasVersion()) {

			m.addMsgHeaderEvntCdgVrsn(String.valueOf(messageheadereventcoding.getVersion()));
		} else {
			m.addMsgHeaderEvntCdgVrsn("NULL");
		}


		/******************** MsgHeader_EvntCdg_Cd ********************************************************************************/
		if(messageheadereventcoding.hasCode()) {

			m.addMsgHeaderEvntCdgCd(String.valueOf(messageheadereventcoding.getCode()));
		} else {
			m.addMsgHeaderEvntCdgCd("NULL");
		}


		/******************** MsgHeader_EvntCdg_UsrSltd ********************************************************************************/
		if(messageheadereventcoding.hasUserSelected()) {

			m.addMsgHeaderEvntCdgUsrSltd(String.valueOf(messageheadereventcoding.getUserSelected()));
		} else {
			m.addMsgHeaderEvntCdgUsrSltd("NULL");
		}


		/******************** MsgHeader_EvntCdg_Sys ********************************************************************************/
		if(messageheadereventcoding.hasSystem()) {

			m.addMsgHeaderEvntCdgSys(String.valueOf(messageheadereventcoding.getSystem()));
		} else {
			m.addMsgHeaderEvntCdgSys("NULL");
		}


		/******************** messageheaderdestination ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MessageHeader.MessageDestinationComponent> messageheaderdestinationlist = messageheader.getDestination();
		for(int messageheaderdestinationi = 0; messageheaderdestinationi<messageheaderdestinationlist.size();messageheaderdestinationi++ ) {
		org.hl7.fhir.r4.model.MessageHeader.MessageDestinationComponent  messageheaderdestination = messageheaderdestinationlist.get(messageheaderdestinationi);

		/******************** MsgHeader_Destination_Nm ********************************************************************************/
		if(messageheaderdestinationi == 0) {m.addMsgHeaderDestinationNm("[");}
		if(messageheaderdestination.hasName()) {

			m.addMsgHeaderDestinationNm(String.valueOf(messageheaderdestination.getName()));
		} else {
			m.addMsgHeaderDestinationNm("NULL");
		}

		if(messageheaderdestinationi == messageheaderdestinationlist.size()-1) {m.addMsgHeaderDestinationNm("]");}


		/******************** MsgHeader_Destination_Endpoint ********************************************************************************/
		if(messageheaderdestinationi == 0) {m.addMsgHeaderDestinationEndpoint("[");}
		if(messageheaderdestination.hasEndpoint()) {

			m.addMsgHeaderDestinationEndpoint(String.valueOf(messageheaderdestination.getEndpoint()));
		} else {
			m.addMsgHeaderDestinationEndpoint("NULL");
		}

		if(messageheaderdestinationi == messageheaderdestinationlist.size()-1) {m.addMsgHeaderDestinationEndpoint("]");}


		/******************** MsgHeader_Destination_Receiver ********************************************************************************/
		if(messageheaderdestinationi == 0) {m.addMsgHeaderDestinationReceiver("[");}
		if(messageheaderdestination.hasReceiver()) {

			if(messageheaderdestination.getReceiver().getReference() != null) {
			m.addMsgHeaderDestinationReceiver(messageheaderdestination.getReceiver().getReference());
			}
		} else {
			m.addMsgHeaderDestinationReceiver("NULL");
		}

		if(messageheaderdestinationi == messageheaderdestinationlist.size()-1) {m.addMsgHeaderDestinationReceiver("]");}


		 };
		/******************** MsgHeader_Sender ********************************************************************************/
		if(messageheader.hasSender()) {

			if(messageheader.getSender().getReference() != null) {
			m.addMsgHeaderSender(messageheader.getSender().getReference());
			}
		} else {
			m.addMsgHeaderSender("NULL");
		}


		/******************** MsgHeader_Responsible ********************************************************************************/
		if(messageheader.hasResponsible()) {

			if(messageheader.getResponsible().getReference() != null) {
			m.addMsgHeaderResponsible(messageheader.getResponsible().getReference());
			}
		} else {
			m.addMsgHeaderResponsible("NULL");
		}


		/******************** MsgHeader_Athr ********************************************************************************/
		if(messageheader.hasAuthor()) {

			if(messageheader.getAuthor().getReference() != null) {
			m.addMsgHeaderAthr(messageheader.getAuthor().getReference());
			}
		} else {
			m.addMsgHeaderAthr("NULL");
		}


		return m;
	}
}
