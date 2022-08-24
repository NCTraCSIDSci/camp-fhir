package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.MessageDefinition;
public class MessageDefinitionBidirectionalConversion 
{
	public MessageDefinition MessageDefinitions(org.hl7.fhir.r4.model.MessageDefinition messagedefinition) throws ParseException
	{
		 main.java.com.campfhir.model.MessageDefinition m = new  main.java.com.campfhir.model.MessageDefinition();

		/******************** id ********************************************************************************/
		m.setId(messagedefinition.getIdElement().getIdPart());

		/******************** MsgDfn_Nm ********************************************************************************/
		if(messagedefinition.hasName()) {

			m.addMsgDfnNm(String.valueOf(messagedefinition.getName()));
		} else {
			m.addMsgDfnNm("NULL");
		}


		/******************** MsgDfn_Parent ********************************************************************************/
		if(messagedefinition.hasParent()) {

			String  array = "[";
			for(int incr=0; incr<messagedefinition.getParent().size(); incr++) {
				array = array + messagedefinition.getParent().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMsgDfnParent(array);

		} else {
			m.addMsgDfnParent("NULL");
		}


		/******************** MsgDfn_Base ********************************************************************************/
		if(messagedefinition.hasBase()) {

			m.addMsgDfnBase(String.valueOf(messagedefinition.getBase()));
		} else {
			m.addMsgDfnBase("NULL");
		}


		/******************** MsgDfn_Vrsn ********************************************************************************/
		if(messagedefinition.hasVersion()) {

			m.addMsgDfnVrsn(String.valueOf(messagedefinition.getVersion()));
		} else {
			m.addMsgDfnVrsn("NULL");
		}


		/******************** MsgDfn_Dt ********************************************************************************/
		if(messagedefinition.hasDate()) {

			m.addMsgDfnDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(messagedefinition.getDate())+"\"");
		} else {
			m.addMsgDfnDt("NULL");
		}


		/******************** messagedefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus messagedefinitionstatus = messagedefinition.getStatus();
		if(messagedefinitionstatus!=null) {
			m.addMsgDfnSts(messagedefinitionstatus.toCode());
		} else {
			m.addMsgDfnSts("NULL");
		}

		/******************** MsgDfn_Dscrptn ********************************************************************************/
		if(messagedefinition.hasDescription()) {

			m.addMsgDfnDscrptn(String.valueOf(messagedefinition.getDescription()));
		} else {
			m.addMsgDfnDscrptn("NULL");
		}


		/******************** messagedefinitionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> messagedefinitionidentifierlist = messagedefinition.getIdentifier();
		for(int messagedefinitionidentifieri = 0; messagedefinitionidentifieri<messagedefinitionidentifierlist.size();messagedefinitionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  messagedefinitionidentifier = messagedefinitionidentifierlist.get(messagedefinitionidentifieri);

		/******************** MsgDfn_Id_Vl ********************************************************************************/
		if(messagedefinitionidentifieri == 0) {m.addMsgDfnIdVl("[");}
		if(messagedefinitionidentifier.hasValue()) {

			m.addMsgDfnIdVl(String.valueOf(messagedefinitionidentifier.getValue()));
		} else {
			m.addMsgDfnIdVl("NULL");
		}

		if(messagedefinitionidentifieri == messagedefinitionidentifierlist.size()-1) {m.addMsgDfnIdVl("]");}


		/******************** messagedefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messagedefinitionidentifiertype = messagedefinitionidentifier.getType();

		/******************** MsgDfn_Id_Typ_Txt ********************************************************************************/
		if(messagedefinitionidentifieri == 0) {m.addMsgDfnIdTypTxt("[");}
		if(messagedefinitionidentifiertype.hasText()) {

			m.addMsgDfnIdTypTxt(String.valueOf(messagedefinitionidentifiertype.getText()));
		} else {
			m.addMsgDfnIdTypTxt("NULL");
		}

		if(messagedefinitionidentifieri == messagedefinitionidentifierlist.size()-1) {m.addMsgDfnIdTypTxt("]");}


		/******************** messagedefinitionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> messagedefinitionidentifiertypecodinglist = messagedefinitionidentifiertype.getCoding();
		for(int messagedefinitionidentifiertypecodingi = 0; messagedefinitionidentifiertypecodingi<messagedefinitionidentifiertypecodinglist.size();messagedefinitionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  messagedefinitionidentifiertypecoding = messagedefinitionidentifiertypecodinglist.get(messagedefinitionidentifiertypecodingi);

		/******************** MsgDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(messagedefinitionidentifiertypecodingi == 0) {m.addMsgDfnIdTypCdgDsply("[[");}
		if(messagedefinitionidentifiertypecoding.hasDisplay()) {

			m.addMsgDfnIdTypCdgDsply(String.valueOf(messagedefinitionidentifiertypecoding.getDisplay()));
		} else {
			m.addMsgDfnIdTypCdgDsply("NULL");
		}

		if(messagedefinitionidentifiertypecodingi == messagedefinitionidentifiertypecodinglist.size()-1) {m.addMsgDfnIdTypCdgDsply("]]");}


		/******************** MsgDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(messagedefinitionidentifiertypecodingi == 0) {m.addMsgDfnIdTypCdgVrsn("[[");}
		if(messagedefinitionidentifiertypecoding.hasVersion()) {

			m.addMsgDfnIdTypCdgVrsn(String.valueOf(messagedefinitionidentifiertypecoding.getVersion()));
		} else {
			m.addMsgDfnIdTypCdgVrsn("NULL");
		}

		if(messagedefinitionidentifiertypecodingi == messagedefinitionidentifiertypecodinglist.size()-1) {m.addMsgDfnIdTypCdgVrsn("]]");}


		/******************** MsgDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(messagedefinitionidentifiertypecodingi == 0) {m.addMsgDfnIdTypCdgCd("[[");}
		if(messagedefinitionidentifiertypecoding.hasCode()) {

			m.addMsgDfnIdTypCdgCd(String.valueOf(messagedefinitionidentifiertypecoding.getCode()));
		} else {
			m.addMsgDfnIdTypCdgCd("NULL");
		}

		if(messagedefinitionidentifiertypecodingi == messagedefinitionidentifiertypecodinglist.size()-1) {m.addMsgDfnIdTypCdgCd("]]");}


		/******************** MsgDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(messagedefinitionidentifiertypecodingi == 0) {m.addMsgDfnIdTypCdgUsrSltd("[[");}
		if(messagedefinitionidentifiertypecoding.hasUserSelected()) {

			m.addMsgDfnIdTypCdgUsrSltd(String.valueOf(messagedefinitionidentifiertypecoding.getUserSelected()));
		} else {
			m.addMsgDfnIdTypCdgUsrSltd("NULL");
		}

		if(messagedefinitionidentifiertypecodingi == messagedefinitionidentifiertypecodinglist.size()-1) {m.addMsgDfnIdTypCdgUsrSltd("]]");}


		/******************** MsgDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(messagedefinitionidentifiertypecodingi == 0) {m.addMsgDfnIdTypCdgSys("[[");}
		if(messagedefinitionidentifiertypecoding.hasSystem()) {

			m.addMsgDfnIdTypCdgSys(String.valueOf(messagedefinitionidentifiertypecoding.getSystem()));
		} else {
			m.addMsgDfnIdTypCdgSys("NULL");
		}

		if(messagedefinitionidentifiertypecodingi == messagedefinitionidentifiertypecodinglist.size()-1) {m.addMsgDfnIdTypCdgSys("]]");}


		 };
		/******************** messagedefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period messagedefinitionidentifierperiod = messagedefinitionidentifier.getPeriod();

		/******************** MsgDfn_Id_Prd_Strt ********************************************************************************/
		if(messagedefinitionidentifieri == 0) {m.addMsgDfnIdPrdStrt("[");}
		if(messagedefinitionidentifierperiod.hasStart()) {

			m.addMsgDfnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(messagedefinitionidentifierperiod.getStart())+"\"");
		} else {
			m.addMsgDfnIdPrdStrt("NULL");
		}

		if(messagedefinitionidentifieri == messagedefinitionidentifierlist.size()-1) {m.addMsgDfnIdPrdStrt("]");}


		/******************** MsgDfn_Id_Prd_End ********************************************************************************/
		if(messagedefinitionidentifieri == 0) {m.addMsgDfnIdPrdEnd("[");}
		if(messagedefinitionidentifierperiod.hasEnd()) {

			m.addMsgDfnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(messagedefinitionidentifierperiod.getEnd())+"\"");
		} else {
			m.addMsgDfnIdPrdEnd("NULL");
		}

		if(messagedefinitionidentifieri == messagedefinitionidentifierlist.size()-1) {m.addMsgDfnIdPrdEnd("]");}


		/******************** messagedefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse messagedefinitionidentifieruse = messagedefinitionidentifier.getUse();
		if(messagedefinitionidentifieruse!=null) {
		if(messagedefinitionidentifieri == 0) {

		m.addMsgDfnIdUse("[");		}
			m.addMsgDfnIdUse(messagedefinitionidentifieruse.toCode());
		if(messagedefinitionidentifieri == messagedefinitionidentifierlist.size()-1) {

		m.addMsgDfnIdUse("]");		}

		} else {
			m.addMsgDfnIdUse("NULL");
		}

		/******************** MsgDfn_Id_Assigner ********************************************************************************/
		if(messagedefinitionidentifieri == 0) {m.addMsgDfnIdAssigner("[");}
		if(messagedefinitionidentifier.hasAssigner()) {

			if(messagedefinitionidentifier.getAssigner().getReference() != null) {
			m.addMsgDfnIdAssigner(messagedefinitionidentifier.getAssigner().getReference());
			}
		} else {
			m.addMsgDfnIdAssigner("NULL");
		}

		if(messagedefinitionidentifieri == messagedefinitionidentifierlist.size()-1) {m.addMsgDfnIdAssigner("]");}


		/******************** MsgDfn_Id_Sys ********************************************************************************/
		if(messagedefinitionidentifieri == 0) {m.addMsgDfnIdSys("[");}
		if(messagedefinitionidentifier.hasSystem()) {

			m.addMsgDfnIdSys(String.valueOf(messagedefinitionidentifier.getSystem()));
		} else {
			m.addMsgDfnIdSys("NULL");
		}

		if(messagedefinitionidentifieri == messagedefinitionidentifierlist.size()-1) {m.addMsgDfnIdSys("]");}


		 };
		/******************** MsgDfn_Replaces ********************************************************************************/
		if(messagedefinition.hasReplaces()) {

			String  array = "[";
			for(int incr=0; incr<messagedefinition.getReplaces().size(); incr++) {
				array = array + messagedefinition.getReplaces().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMsgDfnReplaces(array);

		} else {
			m.addMsgDfnReplaces("NULL");
		}


		/******************** messagedefinitioncategory ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageSignificanceCategory messagedefinitioncategory = messagedefinition.getCategory();
		if(messagedefinitioncategory!=null) {
			m.addMsgDfnCtgry(messagedefinitioncategory.toCode());
		} else {
			m.addMsgDfnCtgry("NULL");
		}

		/******************** messagedefinitioncontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> messagedefinitioncontactlist = messagedefinition.getContact();
		for(int messagedefinitioncontacti = 0; messagedefinitioncontacti<messagedefinitioncontactlist.size();messagedefinitioncontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  messagedefinitioncontact = messagedefinitioncontactlist.get(messagedefinitioncontacti);

		/******************** MsgDfn_Cntct_Nm ********************************************************************************/
		if(messagedefinitioncontacti == 0) {m.addMsgDfnCntctNm("[");}
		if(messagedefinitioncontact.hasName()) {

			m.addMsgDfnCntctNm(String.valueOf(messagedefinitioncontact.getName()));
		} else {
			m.addMsgDfnCntctNm("NULL");
		}

		if(messagedefinitioncontacti == messagedefinitioncontactlist.size()-1) {m.addMsgDfnCntctNm("]");}


		/******************** messagedefinitioncontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> messagedefinitioncontacttelecomlist = messagedefinitioncontact.getTelecom();
		for(int messagedefinitioncontacttelecomi = 0; messagedefinitioncontacttelecomi<messagedefinitioncontacttelecomlist.size();messagedefinitioncontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  messagedefinitioncontacttelecom = messagedefinitioncontacttelecomlist.get(messagedefinitioncontacttelecomi);

		/******************** MsgDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(messagedefinitioncontacttelecomi == 0) {m.addMsgDfnCntctTlcmVl("[[");}
		if(messagedefinitioncontacttelecom.hasValue()) {

			m.addMsgDfnCntctTlcmVl(String.valueOf(messagedefinitioncontacttelecom.getValue()));
		} else {
			m.addMsgDfnCntctTlcmVl("NULL");
		}

		if(messagedefinitioncontacttelecomi == messagedefinitioncontacttelecomlist.size()-1) {m.addMsgDfnCntctTlcmVl("]]");}


		/******************** messagedefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period messagedefinitioncontacttelecomperiod = messagedefinitioncontacttelecom.getPeriod();

		/******************** MsgDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(messagedefinitioncontacttelecomi == 0) {m.addMsgDfnCntctTlcmPrdStrt("[[");}
		if(messagedefinitioncontacttelecomperiod.hasStart()) {

			m.addMsgDfnCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(messagedefinitioncontacttelecomperiod.getStart())+"\"");
		} else {
			m.addMsgDfnCntctTlcmPrdStrt("NULL");
		}

		if(messagedefinitioncontacttelecomi == messagedefinitioncontacttelecomlist.size()-1) {m.addMsgDfnCntctTlcmPrdStrt("]]");}


		/******************** MsgDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(messagedefinitioncontacttelecomi == 0) {m.addMsgDfnCntctTlcmPrdEnd("[[");}
		if(messagedefinitioncontacttelecomperiod.hasEnd()) {

			m.addMsgDfnCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(messagedefinitioncontacttelecomperiod.getEnd())+"\"");
		} else {
			m.addMsgDfnCntctTlcmPrdEnd("NULL");
		}

		if(messagedefinitioncontacttelecomi == messagedefinitioncontacttelecomlist.size()-1) {m.addMsgDfnCntctTlcmPrdEnd("]]");}


		/******************** messagedefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse messagedefinitioncontacttelecomuse = messagedefinitioncontacttelecom.getUse();
		if(messagedefinitioncontacttelecomuse!=null) {
		if(messagedefinitioncontacttelecomi == 0) {

		m.addMsgDfnCntctTlcmUse("[[");		}
			m.addMsgDfnCntctTlcmUse(messagedefinitioncontacttelecomuse.toCode());
		if(messagedefinitioncontacttelecomi == messagedefinitioncontacttelecomlist.size()-1) {

		m.addMsgDfnCntctTlcmUse("]]");		}

		} else {
			m.addMsgDfnCntctTlcmUse("NULL");
		}

		/******************** messagedefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem messagedefinitioncontacttelecomsystem = messagedefinitioncontacttelecom.getSystem();
		if(messagedefinitioncontacttelecomsystem!=null) {
		if(messagedefinitioncontacttelecomi == 0) {

		m.addMsgDfnCntctTlcmSys("[[");		}
			m.addMsgDfnCntctTlcmSys(messagedefinitioncontacttelecomsystem.toCode());
		if(messagedefinitioncontacttelecomi == messagedefinitioncontacttelecomlist.size()-1) {

		m.addMsgDfnCntctTlcmSys("]]");		}

		} else {
			m.addMsgDfnCntctTlcmSys("NULL");
		}

		/******************** MsgDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(messagedefinitioncontacttelecomi == 0) {m.addMsgDfnCntctTlcmRnk("[[");}
		if(messagedefinitioncontacttelecom.hasRank()) {

			m.addMsgDfnCntctTlcmRnk(String.valueOf(messagedefinitioncontacttelecom.getRank()));
		} else {
			m.addMsgDfnCntctTlcmRnk("NULL");
		}

		if(messagedefinitioncontacttelecomi == messagedefinitioncontacttelecomlist.size()-1) {m.addMsgDfnCntctTlcmRnk("]]");}


		 };
		 };
		/******************** MsgDfn_Copyright ********************************************************************************/
		if(messagedefinition.hasCopyright()) {

			m.addMsgDfnCopyright(String.valueOf(messagedefinition.getCopyright()));
		} else {
			m.addMsgDfnCopyright("NULL");
		}


		/******************** messagedefinitionresponserequired ********************************************************************************/
		org.hl7.fhir.r4.model.MessageDefinition.MessageheaderResponseRequest messagedefinitionresponserequired = messagedefinition.getResponseRequired();
		if(messagedefinitionresponserequired!=null) {
			m.addMsgDfnRspsRequired(messagedefinitionresponserequired.toCode());
		} else {
			m.addMsgDfnRspsRequired("NULL");
		}

		/******************** messagedefinitionfocus ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent> messagedefinitionfocuslist = messagedefinition.getFocus();
		for(int messagedefinitionfocusi = 0; messagedefinitionfocusi<messagedefinitionfocuslist.size();messagedefinitionfocusi++ ) {
		org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionFocusComponent  messagedefinitionfocus = messagedefinitionfocuslist.get(messagedefinitionfocusi);

		/******************** MsgDfn_Focus_Cd ********************************************************************************/
		if(messagedefinitionfocusi == 0) {m.addMsgDfnFocusCd("[");}
		if(messagedefinitionfocus.hasCode()) {

			m.addMsgDfnFocusCd(String.valueOf(messagedefinitionfocus.getCode()));
		} else {
			m.addMsgDfnFocusCd("NULL");
		}

		if(messagedefinitionfocusi == messagedefinitionfocuslist.size()-1) {m.addMsgDfnFocusCd("]");}


		/******************** MsgDfn_Focus_Profile ********************************************************************************/
		if(messagedefinitionfocusi == 0) {m.addMsgDfnFocusProfile("[");}
		if(messagedefinitionfocus.hasProfile()) {

			m.addMsgDfnFocusProfile(String.valueOf(messagedefinitionfocus.getProfile()));
		} else {
			m.addMsgDfnFocusProfile("NULL");
		}

		if(messagedefinitionfocusi == messagedefinitionfocuslist.size()-1) {m.addMsgDfnFocusProfile("]");}


		/******************** MsgDfn_Focus_Min ********************************************************************************/
		if(messagedefinitionfocusi == 0) {m.addMsgDfnFocusMin("[");}
		if(messagedefinitionfocus.hasMin()) {

			m.addMsgDfnFocusMin(String.valueOf(messagedefinitionfocus.getMin()));
		} else {
			m.addMsgDfnFocusMin("NULL");
		}

		if(messagedefinitionfocusi == messagedefinitionfocuslist.size()-1) {m.addMsgDfnFocusMin("]");}


		/******************** MsgDfn_Focus_Mx ********************************************************************************/
		if(messagedefinitionfocusi == 0) {m.addMsgDfnFocusMx("[");}
		if(messagedefinitionfocus.hasMax()) {

			m.addMsgDfnFocusMx(String.valueOf(messagedefinitionfocus.getMax()));
		} else {
			m.addMsgDfnFocusMx("NULL");
		}

		if(messagedefinitionfocusi == messagedefinitionfocuslist.size()-1) {m.addMsgDfnFocusMx("]");}


		 };
		/******************** MsgDfn_Ttl ********************************************************************************/
		if(messagedefinition.hasTitle()) {

			m.addMsgDfnTtl(String.valueOf(messagedefinition.getTitle()));
		} else {
			m.addMsgDfnTtl("NULL");
		}


		/******************** MsgDfn_Prpse ********************************************************************************/
		if(messagedefinition.hasPurpose()) {

			m.addMsgDfnPrpse(String.valueOf(messagedefinition.getPurpose()));
		} else {
			m.addMsgDfnPrpse("NULL");
		}


		/******************** MsgDfn_Url ********************************************************************************/
		if(messagedefinition.hasUrl()) {

			m.addMsgDfnUrl(String.valueOf(messagedefinition.getUrl()));
		} else {
			m.addMsgDfnUrl("NULL");
		}


		/******************** MsgDfn_Graph ********************************************************************************/
		if(messagedefinition.hasGraph()) {

			String  array = "[";
			for(int incr=0; incr<messagedefinition.getGraph().size(); incr++) {
				array = array + messagedefinition.getGraph().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			m.addMsgDfnGraph(array);

		} else {
			m.addMsgDfnGraph("NULL");
		}


		/******************** messagedefinitionallowedresponse ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent> messagedefinitionallowedresponselist = messagedefinition.getAllowedResponse();
		for(int messagedefinitionallowedresponsei = 0; messagedefinitionallowedresponsei<messagedefinitionallowedresponselist.size();messagedefinitionallowedresponsei++ ) {
		org.hl7.fhir.r4.model.MessageDefinition.MessageDefinitionAllowedResponseComponent  messagedefinitionallowedresponse = messagedefinitionallowedresponselist.get(messagedefinitionallowedresponsei);

		/******************** MsgDfn_AllowedRsps_Msg ********************************************************************************/
		if(messagedefinitionallowedresponsei == 0) {m.addMsgDfnAllowedRspsMsg("[");}
		if(messagedefinitionallowedresponse.hasMessage()) {

			m.addMsgDfnAllowedRspsMsg(String.valueOf(messagedefinitionallowedresponse.getMessage()));
		} else {
			m.addMsgDfnAllowedRspsMsg("NULL");
		}

		if(messagedefinitionallowedresponsei == messagedefinitionallowedresponselist.size()-1) {m.addMsgDfnAllowedRspsMsg("]");}


		/******************** MsgDfn_AllowedRsps_Situation ********************************************************************************/
		if(messagedefinitionallowedresponsei == 0) {m.addMsgDfnAllowedRspsSituation("[");}
		if(messagedefinitionallowedresponse.hasSituation()) {

			m.addMsgDfnAllowedRspsSituation(String.valueOf(messagedefinitionallowedresponse.getSituation()));
		} else {
			m.addMsgDfnAllowedRspsSituation("NULL");
		}

		if(messagedefinitionallowedresponsei == messagedefinitionallowedresponselist.size()-1) {m.addMsgDfnAllowedRspsSituation("]");}


		 };
		/******************** MsgDfn_EvntUriTyp ********************************************************************************/
		if(messagedefinition.hasEventUriType()) {

			m.addMsgDfnEvntUriTyp("\""+messagedefinition.getEventUriType().getValueAsString()+"\"");
		} else {
			m.addMsgDfnEvntUriTyp("NULL");
		}


		/******************** messagedefinitioneventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitioneventcoding = messagedefinition.getEventCoding();

		/******************** MsgDfn_EvntCdg_Dsply ********************************************************************************/
		if(messagedefinitioneventcoding.hasDisplay()) {

			m.addMsgDfnEvntCdgDsply(String.valueOf(messagedefinitioneventcoding.getDisplay()));
		} else {
			m.addMsgDfnEvntCdgDsply("NULL");
		}


		/******************** MsgDfn_EvntCdg_Vrsn ********************************************************************************/
		if(messagedefinitioneventcoding.hasVersion()) {

			m.addMsgDfnEvntCdgVrsn(String.valueOf(messagedefinitioneventcoding.getVersion()));
		} else {
			m.addMsgDfnEvntCdgVrsn("NULL");
		}


		/******************** MsgDfn_EvntCdg_Cd ********************************************************************************/
		if(messagedefinitioneventcoding.hasCode()) {

			m.addMsgDfnEvntCdgCd(String.valueOf(messagedefinitioneventcoding.getCode()));
		} else {
			m.addMsgDfnEvntCdgCd("NULL");
		}


		/******************** MsgDfn_EvntCdg_UsrSltd ********************************************************************************/
		if(messagedefinitioneventcoding.hasUserSelected()) {

			m.addMsgDfnEvntCdgUsrSltd(String.valueOf(messagedefinitioneventcoding.getUserSelected()));
		} else {
			m.addMsgDfnEvntCdgUsrSltd("NULL");
		}


		/******************** MsgDfn_EvntCdg_Sys ********************************************************************************/
		if(messagedefinitioneventcoding.hasSystem()) {

			m.addMsgDfnEvntCdgSys(String.valueOf(messagedefinitioneventcoding.getSystem()));
		} else {
			m.addMsgDfnEvntCdgSys("NULL");
		}


		/******************** messagedefinitionjurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> messagedefinitionjurisdictionlist = messagedefinition.getJurisdiction();
		for(int messagedefinitionjurisdictioni = 0; messagedefinitionjurisdictioni<messagedefinitionjurisdictionlist.size();messagedefinitionjurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  messagedefinitionjurisdiction = messagedefinitionjurisdictionlist.get(messagedefinitionjurisdictioni);

		/******************** MsgDfn_Jrsdctn_Txt ********************************************************************************/
		if(messagedefinitionjurisdictioni == 0) {m.addMsgDfnJrsdctnTxt("[");}
		if(messagedefinitionjurisdiction.hasText()) {

			m.addMsgDfnJrsdctnTxt(String.valueOf(messagedefinitionjurisdiction.getText()));
		} else {
			m.addMsgDfnJrsdctnTxt("NULL");
		}

		if(messagedefinitionjurisdictioni == messagedefinitionjurisdictionlist.size()-1) {m.addMsgDfnJrsdctnTxt("]");}


		/******************** messagedefinitionjurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> messagedefinitionjurisdictioncodinglist = messagedefinitionjurisdiction.getCoding();
		for(int messagedefinitionjurisdictioncodingi = 0; messagedefinitionjurisdictioncodingi<messagedefinitionjurisdictioncodinglist.size();messagedefinitionjurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  messagedefinitionjurisdictioncoding = messagedefinitionjurisdictioncodinglist.get(messagedefinitionjurisdictioncodingi);

		/******************** MsgDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(messagedefinitionjurisdictioncodingi == 0) {m.addMsgDfnJrsdctnCdgDsply("[[");}
		if(messagedefinitionjurisdictioncoding.hasDisplay()) {

			m.addMsgDfnJrsdctnCdgDsply(String.valueOf(messagedefinitionjurisdictioncoding.getDisplay()));
		} else {
			m.addMsgDfnJrsdctnCdgDsply("NULL");
		}

		if(messagedefinitionjurisdictioncodingi == messagedefinitionjurisdictioncodinglist.size()-1) {m.addMsgDfnJrsdctnCdgDsply("]]");}


		/******************** MsgDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(messagedefinitionjurisdictioncodingi == 0) {m.addMsgDfnJrsdctnCdgVrsn("[[");}
		if(messagedefinitionjurisdictioncoding.hasVersion()) {

			m.addMsgDfnJrsdctnCdgVrsn(String.valueOf(messagedefinitionjurisdictioncoding.getVersion()));
		} else {
			m.addMsgDfnJrsdctnCdgVrsn("NULL");
		}

		if(messagedefinitionjurisdictioncodingi == messagedefinitionjurisdictioncodinglist.size()-1) {m.addMsgDfnJrsdctnCdgVrsn("]]");}


		/******************** MsgDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(messagedefinitionjurisdictioncodingi == 0) {m.addMsgDfnJrsdctnCdgCd("[[");}
		if(messagedefinitionjurisdictioncoding.hasCode()) {

			m.addMsgDfnJrsdctnCdgCd(String.valueOf(messagedefinitionjurisdictioncoding.getCode()));
		} else {
			m.addMsgDfnJrsdctnCdgCd("NULL");
		}

		if(messagedefinitionjurisdictioncodingi == messagedefinitionjurisdictioncodinglist.size()-1) {m.addMsgDfnJrsdctnCdgCd("]]");}


		/******************** MsgDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(messagedefinitionjurisdictioncodingi == 0) {m.addMsgDfnJrsdctnCdgUsrSltd("[[");}
		if(messagedefinitionjurisdictioncoding.hasUserSelected()) {

			m.addMsgDfnJrsdctnCdgUsrSltd(String.valueOf(messagedefinitionjurisdictioncoding.getUserSelected()));
		} else {
			m.addMsgDfnJrsdctnCdgUsrSltd("NULL");
		}

		if(messagedefinitionjurisdictioncodingi == messagedefinitionjurisdictioncodinglist.size()-1) {m.addMsgDfnJrsdctnCdgUsrSltd("]]");}


		/******************** MsgDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(messagedefinitionjurisdictioncodingi == 0) {m.addMsgDfnJrsdctnCdgSys("[[");}
		if(messagedefinitionjurisdictioncoding.hasSystem()) {

			m.addMsgDfnJrsdctnCdgSys(String.valueOf(messagedefinitionjurisdictioncoding.getSystem()));
		} else {
			m.addMsgDfnJrsdctnCdgSys("NULL");
		}

		if(messagedefinitionjurisdictioncodingi == messagedefinitionjurisdictioncodinglist.size()-1) {m.addMsgDfnJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** messagedefinitionusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> messagedefinitionusecontextlist = messagedefinition.getUseContext();
		for(int messagedefinitionusecontexti = 0; messagedefinitionusecontexti<messagedefinitionusecontextlist.size();messagedefinitionusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  messagedefinitionusecontext = messagedefinitionusecontextlist.get(messagedefinitionusecontexti);

		/******************** messagedefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding messagedefinitionusecontextcode = messagedefinitionusecontext.getCode();

		/******************** MsgDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtCdDsply("[");}
		if(messagedefinitionusecontextcode.hasDisplay()) {

			m.addMsgDfnUseCntxtCdDsply(String.valueOf(messagedefinitionusecontextcode.getDisplay()));
		} else {
			m.addMsgDfnUseCntxtCdDsply("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtCdDsply("]");}


		/******************** MsgDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtCdVrsn("[");}
		if(messagedefinitionusecontextcode.hasVersion()) {

			m.addMsgDfnUseCntxtCdVrsn(String.valueOf(messagedefinitionusecontextcode.getVersion()));
		} else {
			m.addMsgDfnUseCntxtCdVrsn("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtCdVrsn("]");}


		/******************** MsgDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtCdUsrSltd("[");}
		if(messagedefinitionusecontextcode.hasUserSelected()) {

			m.addMsgDfnUseCntxtCdUsrSltd(String.valueOf(messagedefinitionusecontextcode.getUserSelected()));
		} else {
			m.addMsgDfnUseCntxtCdUsrSltd("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtCdUsrSltd("]");}


		/******************** MsgDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtCdSys("[");}
		if(messagedefinitionusecontextcode.hasSystem()) {

			m.addMsgDfnUseCntxtCdSys(String.valueOf(messagedefinitionusecontextcode.getSystem()));
		} else {
			m.addMsgDfnUseCntxtCdSys("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtCdSys("]");}


		/******************** MsgDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlRfrnc("[");}
		if(messagedefinitionusecontext.hasValueReference()) {

			if(messagedefinitionusecontext.getValueReference().getReference() != null) {
			m.addMsgDfnUseCntxtVlRfrnc(messagedefinitionusecontext.getValueReference().getReference());
			}
		} else {
			m.addMsgDfnUseCntxtVlRfrnc("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlRfrnc("]");}


		/******************** messagedefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept messagedefinitionusecontextvaluecodeableconcept = messagedefinitionusecontext.getValueCodeableConcept();

		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlCdbleCncptTxt("[");}
		if(messagedefinitionusecontextvaluecodeableconcept.hasText()) {

			m.addMsgDfnUseCntxtVlCdbleCncptTxt(String.valueOf(messagedefinitionusecontextvaluecodeableconcept.getText()));
		} else {
			m.addMsgDfnUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlCdbleCncptTxt("]");}


		/******************** messagedefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> messagedefinitionusecontextvaluecodeableconceptcodinglist = messagedefinitionusecontextvaluecodeableconcept.getCoding();
		for(int messagedefinitionusecontextvaluecodeableconceptcodingi = 0; messagedefinitionusecontextvaluecodeableconceptcodingi<messagedefinitionusecontextvaluecodeableconceptcodinglist.size();messagedefinitionusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  messagedefinitionusecontextvaluecodeableconceptcoding = messagedefinitionusecontextvaluecodeableconceptcodinglist.get(messagedefinitionusecontextvaluecodeableconceptcodingi);

		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcodingi == 0) {m.addMsgDfnUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasDisplay()) {

			m.addMsgDfnUseCntxtVlCdbleCncptCdgDsply(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			m.addMsgDfnUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(messagedefinitionusecontextvaluecodeableconceptcodingi == messagedefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsgDfnUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcodingi == 0) {m.addMsgDfnUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasVersion()) {

			m.addMsgDfnUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			m.addMsgDfnUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(messagedefinitionusecontextvaluecodeableconceptcodingi == messagedefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsgDfnUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcodingi == 0) {m.addMsgDfnUseCntxtVlCdbleCncptCdgCd("[[");}
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasCode()) {

			m.addMsgDfnUseCntxtVlCdbleCncptCdgCd(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			m.addMsgDfnUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(messagedefinitionusecontextvaluecodeableconceptcodingi == messagedefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsgDfnUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcodingi == 0) {m.addMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			m.addMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			m.addMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(messagedefinitionusecontextvaluecodeableconceptcodingi == messagedefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsgDfnUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** MsgDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(messagedefinitionusecontextvaluecodeableconceptcodingi == 0) {m.addMsgDfnUseCntxtVlCdbleCncptCdgSys("[[");}
		if(messagedefinitionusecontextvaluecodeableconceptcoding.hasSystem()) {

			m.addMsgDfnUseCntxtVlCdbleCncptCdgSys(String.valueOf(messagedefinitionusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			m.addMsgDfnUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(messagedefinitionusecontextvaluecodeableconceptcodingi == messagedefinitionusecontextvaluecodeableconceptcodinglist.size()-1) {m.addMsgDfnUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** messagedefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range messagedefinitionusecontextvaluerange = messagedefinitionusecontext.getValueRange();

		/******************** messagedefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity messagedefinitionusecontextvaluerangelow = messagedefinitionusecontextvaluerange.getLow();

		/******************** MsgDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlRngLwVl("[");}
		if(messagedefinitionusecontextvaluerangelow.hasValue()) {

			m.addMsgDfnUseCntxtVlRngLwVl(String.valueOf(messagedefinitionusecontextvaluerangelow.getValue()));
		} else {
			m.addMsgDfnUseCntxtVlRngLwVl("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlRngLwVl("]");}


		/******************** messagedefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator messagedefinitionusecontextvaluerangelowcomparator = messagedefinitionusecontextvaluerangelow.getComparator();
		if(messagedefinitionusecontextvaluerangelowcomparator!=null) {
		if(messagedefinitionusecontexti == 0) {

		m.addMsgDfnUseCntxtVlRngLwCmprtr("[");		}
			m.addMsgDfnUseCntxtVlRngLwCmprtr(messagedefinitionusecontextvaluerangelowcomparator.toCode());
		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {

		m.addMsgDfnUseCntxtVlRngLwCmprtr("]");		}

		} else {
			m.addMsgDfnUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** MsgDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlRngLwCd("[");}
		if(messagedefinitionusecontextvaluerangelow.hasCode()) {

			m.addMsgDfnUseCntxtVlRngLwCd(String.valueOf(messagedefinitionusecontextvaluerangelow.getCode()));
		} else {
			m.addMsgDfnUseCntxtVlRngLwCd("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlRngLwCd("]");}


		/******************** MsgDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlRngLwUnt("[");}
		if(messagedefinitionusecontextvaluerangelow.hasUnit()) {

			m.addMsgDfnUseCntxtVlRngLwUnt(String.valueOf(messagedefinitionusecontextvaluerangelow.getUnit()));
		} else {
			m.addMsgDfnUseCntxtVlRngLwUnt("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlRngLwUnt("]");}


		/******************** MsgDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlRngLwSys("[");}
		if(messagedefinitionusecontextvaluerangelow.hasSystem()) {

			m.addMsgDfnUseCntxtVlRngLwSys(String.valueOf(messagedefinitionusecontextvaluerangelow.getSystem()));
		} else {
			m.addMsgDfnUseCntxtVlRngLwSys("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlRngLwSys("]");}


		/******************** messagedefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity messagedefinitionusecontextvaluerangehigh = messagedefinitionusecontextvaluerange.getHigh();

		/******************** MsgDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlRngHiVl("[");}
		if(messagedefinitionusecontextvaluerangehigh.hasValue()) {

			m.addMsgDfnUseCntxtVlRngHiVl(String.valueOf(messagedefinitionusecontextvaluerangehigh.getValue()));
		} else {
			m.addMsgDfnUseCntxtVlRngHiVl("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlRngHiVl("]");}


		/******************** messagedefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator messagedefinitionusecontextvaluerangehighcomparator = messagedefinitionusecontextvaluerangehigh.getComparator();
		if(messagedefinitionusecontextvaluerangehighcomparator!=null) {
		if(messagedefinitionusecontexti == 0) {

		m.addMsgDfnUseCntxtVlRngHiCmprtr("[");		}
			m.addMsgDfnUseCntxtVlRngHiCmprtr(messagedefinitionusecontextvaluerangehighcomparator.toCode());
		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {

		m.addMsgDfnUseCntxtVlRngHiCmprtr("]");		}

		} else {
			m.addMsgDfnUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** MsgDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlRngHiCd("[");}
		if(messagedefinitionusecontextvaluerangehigh.hasCode()) {

			m.addMsgDfnUseCntxtVlRngHiCd(String.valueOf(messagedefinitionusecontextvaluerangehigh.getCode()));
		} else {
			m.addMsgDfnUseCntxtVlRngHiCd("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlRngHiCd("]");}


		/******************** MsgDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlRngHiUnt("[");}
		if(messagedefinitionusecontextvaluerangehigh.hasUnit()) {

			m.addMsgDfnUseCntxtVlRngHiUnt(String.valueOf(messagedefinitionusecontextvaluerangehigh.getUnit()));
		} else {
			m.addMsgDfnUseCntxtVlRngHiUnt("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlRngHiUnt("]");}


		/******************** MsgDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlRngHiSys("[");}
		if(messagedefinitionusecontextvaluerangehigh.hasSystem()) {

			m.addMsgDfnUseCntxtVlRngHiSys(String.valueOf(messagedefinitionusecontextvaluerangehigh.getSystem()));
		} else {
			m.addMsgDfnUseCntxtVlRngHiSys("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlRngHiSys("]");}


		/******************** messagedefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity messagedefinitionusecontextvaluequantity = messagedefinitionusecontext.getValueQuantity();

		/******************** MsgDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlQntyVl("[");}
		if(messagedefinitionusecontextvaluequantity.hasValue()) {

			m.addMsgDfnUseCntxtVlQntyVl(String.valueOf(messagedefinitionusecontextvaluequantity.getValue()));
		} else {
			m.addMsgDfnUseCntxtVlQntyVl("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlQntyVl("]");}


		/******************** messagedefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator messagedefinitionusecontextvaluequantitycomparator = messagedefinitionusecontextvaluequantity.getComparator();
		if(messagedefinitionusecontextvaluequantitycomparator!=null) {
		if(messagedefinitionusecontexti == 0) {

		m.addMsgDfnUseCntxtVlQntyCmprtr("[");		}
			m.addMsgDfnUseCntxtVlQntyCmprtr(messagedefinitionusecontextvaluequantitycomparator.toCode());
		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {

		m.addMsgDfnUseCntxtVlQntyCmprtr("]");		}

		} else {
			m.addMsgDfnUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** MsgDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlQntyCd("[");}
		if(messagedefinitionusecontextvaluequantity.hasCode()) {

			m.addMsgDfnUseCntxtVlQntyCd(String.valueOf(messagedefinitionusecontextvaluequantity.getCode()));
		} else {
			m.addMsgDfnUseCntxtVlQntyCd("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlQntyCd("]");}


		/******************** MsgDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlQntyUnt("[");}
		if(messagedefinitionusecontextvaluequantity.hasUnit()) {

			m.addMsgDfnUseCntxtVlQntyUnt(String.valueOf(messagedefinitionusecontextvaluequantity.getUnit()));
		} else {
			m.addMsgDfnUseCntxtVlQntyUnt("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlQntyUnt("]");}


		/******************** MsgDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(messagedefinitionusecontexti == 0) {m.addMsgDfnUseCntxtVlQntySys("[");}
		if(messagedefinitionusecontextvaluequantity.hasSystem()) {

			m.addMsgDfnUseCntxtVlQntySys(String.valueOf(messagedefinitionusecontextvaluequantity.getSystem()));
		} else {
			m.addMsgDfnUseCntxtVlQntySys("NULL");
		}

		if(messagedefinitionusecontexti == messagedefinitionusecontextlist.size()-1) {m.addMsgDfnUseCntxtVlQntySys("]");}


		 };
		/******************** MsgDfn_Exprmtl ********************************************************************************/
		if(messagedefinition.hasExperimental()) {

			m.addMsgDfnExprmtl(String.valueOf(messagedefinition.getExperimental()));
		} else {
			m.addMsgDfnExprmtl("NULL");
		}


		/******************** MsgDfn_Pblshr ********************************************************************************/
		if(messagedefinition.hasPublisher()) {

			m.addMsgDfnPblshr(String.valueOf(messagedefinition.getPublisher()));
		} else {
			m.addMsgDfnPblshr("NULL");
		}


		return m;
	}
}
