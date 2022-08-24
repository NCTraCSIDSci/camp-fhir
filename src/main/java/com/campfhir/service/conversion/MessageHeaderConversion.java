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
		if(m.getMsgHeaderAthr() != null ) {

			if(m.getMsgHeaderAthr().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderAthr()==null) {} else {
			messageheader.setAuthor(new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderAthr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Dfn ********************************************************************************/
		if(m.getMsgHeaderDfn() != null ) {

			if(m.getMsgHeaderDfn().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderDfn()==null) {} else {
			messageheader.setDefinition(m.getMsgHeaderDfn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_Destination_Endpoint ********************************************************************************/
		if(m.getMsgHeaderDestinationEndpoint() != null ) {

			String[] arrayi0 = m.getMsgHeaderDestinationEndpoint().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messageheader.getDestination().size() < i0+1) { messageheader.addDestination(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messageheader.getDestination().get(i0).setEndpoint(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgHeader_Destination_Nm ********************************************************************************/
		if(m.getMsgHeaderDestinationNm() != null ) {

			String[] arrayi0 = m.getMsgHeaderDestinationNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messageheader.getDestination().size() < i0+1) { messageheader.addDestination(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messageheader.getDestination().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgHeader_Destination_Receiver ********************************************************************************/
		if(m.getMsgHeaderDestinationReceiver() != null ) {

			String[] arrayi0 = m.getMsgHeaderDestinationReceiver().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messageheader.getDestination().size() < i0+1) { messageheader.addDestination(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messageheader.getDestination().get(i0).setReceiver(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgHeader_Enterer ********************************************************************************/
		if(m.getMsgHeaderEnterer() != null ) {

			if(m.getMsgHeaderEnterer().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderEnterer()==null) {} else {
			messageheader.setEnterer(new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderEnterer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_EvntCdg_Cd ********************************************************************************/
		if(m.getMsgHeaderEvntCdgCd() != null ) {

			if(m.getMsgHeaderEvntCdgCd().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderEvntCdgCd()==null) {} else {
			messageheader.getEventCoding().setCode(m.getMsgHeaderEvntCdgCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_EvntCdg_Dsply ********************************************************************************/
		if(m.getMsgHeaderEvntCdgDsply() != null ) {

			if(m.getMsgHeaderEvntCdgDsply().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderEvntCdgDsply()==null) {} else {
			messageheader.getEventCoding().setDisplay(m.getMsgHeaderEvntCdgDsply().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_EvntCdg_Sys ********************************************************************************/
		if(m.getMsgHeaderEvntCdgSys() != null ) {

			if(m.getMsgHeaderEvntCdgSys().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderEvntCdgSys()==null) {} else {
			messageheader.getEventCoding().setSystem(m.getMsgHeaderEvntCdgSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_EvntCdg_UsrSltd ********************************************************************************/
		if(m.getMsgHeaderEvntCdgUsrSltd() != null ) {

			if(m.getMsgHeaderEvntCdgUsrSltd().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderEvntCdgUsrSltd()==null) {} else {
			messageheader.getEventCoding().setUserSelected(Boolean.parseBoolean(m.getMsgHeaderEvntCdgUsrSltd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_EvntCdg_Vrsn ********************************************************************************/
		if(m.getMsgHeaderEvntCdgVrsn() != null ) {

			if(m.getMsgHeaderEvntCdgVrsn().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderEvntCdgVrsn()==null) {} else {
			messageheader.getEventCoding().setVersion(m.getMsgHeaderEvntCdgVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_EvntUriTyp ********************************************************************************/
		if(m.getMsgHeaderEvntUriTyp() != null ) {

			if(m.getMsgHeaderEvntUriTyp().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderEvntUriTyp()==null) {} else {
			messageheader.setEvent(new org.hl7.fhir.r4.model.UriType(m.getMsgHeaderEvntUriTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Focus ********************************************************************************/
		if(m.getMsgHeaderFocus() != null ) {

				for( String currListStrSplit : m.getMsgHeaderFocus().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			messageheader.addFocus(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** MsgHeader_Rsn_Cdg_Cd ********************************************************************************/
		if(m.getMsgHeaderRsnCdgCd() != null ) {

			String[] arrayi0 = m.getMsgHeaderRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messageheader.getReason().getCoding().size() < i0+1) { messageheader.getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messageheader.getReason().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgHeader_Rsn_Cdg_Dsply ********************************************************************************/
		if(m.getMsgHeaderRsnCdgDsply() != null ) {

			String[] arrayi0 = m.getMsgHeaderRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messageheader.getReason().getCoding().size() < i0+1) { messageheader.getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messageheader.getReason().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgHeader_Rsn_Cdg_Sys ********************************************************************************/
		if(m.getMsgHeaderRsnCdgSys() != null ) {

			String[] arrayi0 = m.getMsgHeaderRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messageheader.getReason().getCoding().size() < i0+1) { messageheader.getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messageheader.getReason().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgHeader_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(m.getMsgHeaderRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = m.getMsgHeaderRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messageheader.getReason().getCoding().size() < i0+1) { messageheader.getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messageheader.getReason().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** MsgHeader_Rsn_Cdg_Vrsn ********************************************************************************/
		if(m.getMsgHeaderRsnCdgVrsn() != null ) {

			String[] arrayi0 = m.getMsgHeaderRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(messageheader.getReason().getCoding().size() < i0+1) { messageheader.getReason().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {messageheader.getReason().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** MsgHeader_Rsn_Txt ********************************************************************************/
		if(m.getMsgHeaderRsnTxt() != null ) {

			if(m.getMsgHeaderRsnTxt().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderRsnTxt()==null) {} else {
			messageheader.getReason().setText(m.getMsgHeaderRsnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_Rsps_Cd ********************************************************************************/
		if(m.getMsgHeaderRspsCd() != null ) {

			if(m.getMsgHeaderRspsCd().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderRspsCd()==null) {} else {
			messageheader.getResponse().setCode(new org.hl7.fhir.r4.model.MessageHeader.ResponseTypeEnumFactory().fromCode(m.getMsgHeaderRspsCd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Rsps_Dtls ********************************************************************************/
		if(m.getMsgHeaderRspsDtls() != null ) {

			if(m.getMsgHeaderRspsDtls().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderRspsDtls()==null) {} else {
			messageheader.getResponse().setDetails(new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderRspsDtls().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Rsps_Id ********************************************************************************/
		if(m.getMsgHeaderRspsId() != null ) {

			if(m.getMsgHeaderRspsId().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderRspsId()==null) {} else {
			messageheader.getResponse().setIdentifier(m.getMsgHeaderRspsId().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_Responsible ********************************************************************************/
		if(m.getMsgHeaderResponsible() != null ) {

			if(m.getMsgHeaderResponsible().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderResponsible()==null) {} else {
			messageheader.setResponsible(new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderResponsible().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Sender ********************************************************************************/
		if(m.getMsgHeaderSender() != null ) {

			if(m.getMsgHeaderSender().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSender()==null) {} else {
			messageheader.setSender(new org.hl7.fhir.r4.model.Reference(m.getMsgHeaderSender().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Src_Cntct_Prd_End ********************************************************************************/
		if(m.getMsgHeaderSrcCntctPrdEnd() != null ) {

			if(m.getMsgHeaderSrcCntctPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcCntctPrdEnd()==null) {} else {
			messageheader.getSource().getContact().getPeriod().setEnd(m.getMsgHeaderSrcCntctPrdEnd().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcCntctPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsgHeaderSrcCntctPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Src_Cntct_Prd_Strt ********************************************************************************/
		if(m.getMsgHeaderSrcCntctPrdStrt() != null ) {

			if(m.getMsgHeaderSrcCntctPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcCntctPrdStrt()==null) {} else {
			messageheader.getSource().getContact().getPeriod().setStart(m.getMsgHeaderSrcCntctPrdStrt().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcCntctPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(m.getMsgHeaderSrcCntctPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Src_Cntct_Rnk ********************************************************************************/
		if(m.getMsgHeaderSrcCntctRnk() != null ) {

			if(m.getMsgHeaderSrcCntctRnk().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcCntctRnk()==null) {} else {
			messageheader.getSource().getContact().setRank(Integer.parseInt(m.getMsgHeaderSrcCntctRnk().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Src_Cntct_Sys ********************************************************************************/
		if(m.getMsgHeaderSrcCntctSys() != null ) {

			if(m.getMsgHeaderSrcCntctSys().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcCntctSys()==null) {} else {
			messageheader.getSource().getContact().setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(m.getMsgHeaderSrcCntctSys().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Src_Cntct_Use ********************************************************************************/
		if(m.getMsgHeaderSrcCntctUse() != null ) {

			if(m.getMsgHeaderSrcCntctUse().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcCntctUse()==null) {} else {
			messageheader.getSource().getContact().setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(m.getMsgHeaderSrcCntctUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** MsgHeader_Src_Cntct_Vl ********************************************************************************/
		if(m.getMsgHeaderSrcCntctVl() != null ) {

			if(m.getMsgHeaderSrcCntctVl().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcCntctVl()==null) {} else {
			messageheader.getSource().getContact().setValue(m.getMsgHeaderSrcCntctVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_Src_Endpoint ********************************************************************************/
		if(m.getMsgHeaderSrcEndpoint() != null ) {

			if(m.getMsgHeaderSrcEndpoint().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcEndpoint()==null) {} else {
			messageheader.getSource().setEndpoint(m.getMsgHeaderSrcEndpoint().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_Src_Nm ********************************************************************************/
		if(m.getMsgHeaderSrcNm() != null ) {

			if(m.getMsgHeaderSrcNm().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcNm()==null) {} else {
			messageheader.getSource().setName(m.getMsgHeaderSrcNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_Src_Software ********************************************************************************/
		if(m.getMsgHeaderSrcSoftware() != null ) {

			if(m.getMsgHeaderSrcSoftware().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcSoftware()==null) {} else {
			messageheader.getSource().setSoftware(m.getMsgHeaderSrcSoftware().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** MsgHeader_Src_Vrsn ********************************************************************************/
		if(m.getMsgHeaderSrcVrsn() != null ) {

			if(m.getMsgHeaderSrcVrsn().replace("[","").replace("]","").equals("NULL") | m.getMsgHeaderSrcVrsn()==null) {} else {
			messageheader.getSource().setVersion(m.getMsgHeaderSrcVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return messageheader;
	}
}
