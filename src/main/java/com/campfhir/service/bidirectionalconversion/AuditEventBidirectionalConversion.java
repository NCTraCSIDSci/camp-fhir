package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AuditEvent;
public class AuditEventBidirectionalConversion 
{
	public AuditEvent AuditEvents(org.hl7.fhir.r4.model.AuditEvent auditevent) throws ParseException
	{
		 main.java.com.campfhir.model.AuditEvent a = new  main.java.com.campfhir.model.AuditEvent();

		/******************** id ********************************************************************************/
		a.setId(auditevent.getIdElement().getIdPart());

		/******************** auditeventtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventtype = auditevent.getType();

		/******************** AuditEvnt_Typ_Dsply ********************************************************************************/
		if(auditeventtype.hasDisplay()) {

			a.addAuditEvntTypDsply(String.valueOf(auditeventtype.getDisplay()));
		} else {
			a.addAuditEvntTypDsply("NULL");
		}


		/******************** AuditEvnt_Typ_Vrsn ********************************************************************************/
		if(auditeventtype.hasVersion()) {

			a.addAuditEvntTypVrsn(String.valueOf(auditeventtype.getVersion()));
		} else {
			a.addAuditEvntTypVrsn("NULL");
		}


		/******************** AuditEvnt_Typ_Cd ********************************************************************************/
		if(auditeventtype.hasCode()) {

			a.addAuditEvntTypCd(String.valueOf(auditeventtype.getCode()));
		} else {
			a.addAuditEvntTypCd("NULL");
		}


		/******************** AuditEvnt_Typ_UsrSltd ********************************************************************************/
		if(auditeventtype.hasUserSelected()) {

			a.addAuditEvntTypUsrSltd(String.valueOf(auditeventtype.getUserSelected()));
		} else {
			a.addAuditEvntTypUsrSltd("NULL");
		}


		/******************** AuditEvnt_Typ_Sys ********************************************************************************/
		if(auditeventtype.hasSystem()) {

			a.addAuditEvntTypSys(String.valueOf(auditeventtype.getSystem()));
		} else {
			a.addAuditEvntTypSys("NULL");
		}


		/******************** auditeventaction ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAction auditeventaction = auditevent.getAction();
		if(auditeventaction!=null) {
			a.addAuditEvntActn(auditeventaction.toCode());
		} else {
			a.addAuditEvntActn("NULL");
		}

		/******************** auditeventsource ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventSourceComponent auditeventsource = auditevent.getSource();

		/******************** auditeventsourcetype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> auditeventsourcetypelist = auditeventsource.getType();
		for(int auditeventsourcetypei = 0; auditeventsourcetypei<auditeventsourcetypelist.size();auditeventsourcetypei++ ) {
		org.hl7.fhir.r4.model.Coding  auditeventsourcetype = auditeventsourcetypelist.get(auditeventsourcetypei);

		/******************** AuditEvnt_Src_Typ_Dsply ********************************************************************************/
		if(auditeventsourcetypei == 0) {a.addAuditEvntSrcTypDsply("[");}
		if(auditeventsourcetype.hasDisplay()) {

			a.addAuditEvntSrcTypDsply(String.valueOf(auditeventsourcetype.getDisplay()));
		} else {
			a.addAuditEvntSrcTypDsply("NULL");
		}

		if(auditeventsourcetypei == auditeventsourcetypelist.size()-1) {a.addAuditEvntSrcTypDsply("]");}


		/******************** AuditEvnt_Src_Typ_Vrsn ********************************************************************************/
		if(auditeventsourcetypei == 0) {a.addAuditEvntSrcTypVrsn("[");}
		if(auditeventsourcetype.hasVersion()) {

			a.addAuditEvntSrcTypVrsn(String.valueOf(auditeventsourcetype.getVersion()));
		} else {
			a.addAuditEvntSrcTypVrsn("NULL");
		}

		if(auditeventsourcetypei == auditeventsourcetypelist.size()-1) {a.addAuditEvntSrcTypVrsn("]");}


		/******************** AuditEvnt_Src_Typ_Cd ********************************************************************************/
		if(auditeventsourcetypei == 0) {a.addAuditEvntSrcTypCd("[");}
		if(auditeventsourcetype.hasCode()) {

			a.addAuditEvntSrcTypCd(String.valueOf(auditeventsourcetype.getCode()));
		} else {
			a.addAuditEvntSrcTypCd("NULL");
		}

		if(auditeventsourcetypei == auditeventsourcetypelist.size()-1) {a.addAuditEvntSrcTypCd("]");}


		/******************** AuditEvnt_Src_Typ_UsrSltd ********************************************************************************/
		if(auditeventsourcetypei == 0) {a.addAuditEvntSrcTypUsrSltd("[");}
		if(auditeventsourcetype.hasUserSelected()) {

			a.addAuditEvntSrcTypUsrSltd(String.valueOf(auditeventsourcetype.getUserSelected()));
		} else {
			a.addAuditEvntSrcTypUsrSltd("NULL");
		}

		if(auditeventsourcetypei == auditeventsourcetypelist.size()-1) {a.addAuditEvntSrcTypUsrSltd("]");}


		/******************** AuditEvnt_Src_Typ_Sys ********************************************************************************/
		if(auditeventsourcetypei == 0) {a.addAuditEvntSrcTypSys("[");}
		if(auditeventsourcetype.hasSystem()) {

			a.addAuditEvntSrcTypSys(String.valueOf(auditeventsourcetype.getSystem()));
		} else {
			a.addAuditEvntSrcTypSys("NULL");
		}

		if(auditeventsourcetypei == auditeventsourcetypelist.size()-1) {a.addAuditEvntSrcTypSys("]");}


		 };
		/******************** AuditEvnt_Src_Site ********************************************************************************/
		if(auditeventsource.hasSite()) {

			a.addAuditEvntSrcSite(String.valueOf(auditeventsource.getSite()));
		} else {
			a.addAuditEvntSrcSite("NULL");
		}


		/******************** AuditEvnt_Src_Observer ********************************************************************************/
		if(auditeventsource.hasObserver()) {

			if(auditeventsource.getObserver().getReference() != null) {
			a.addAuditEvntSrcObserver(auditeventsource.getObserver().getReference());
			}
		} else {
			a.addAuditEvntSrcObserver("NULL");
		}


		/******************** auditeventperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period auditeventperiod = auditevent.getPeriod();

		/******************** AuditEvnt_Prd_Strt ********************************************************************************/
		if(auditeventperiod.hasStart()) {

			a.addAuditEvntPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(auditeventperiod.getStart())+"\"");
		} else {
			a.addAuditEvntPrdStrt("NULL");
		}


		/******************** AuditEvnt_Prd_End ********************************************************************************/
		if(auditeventperiod.hasEnd()) {

			a.addAuditEvntPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(auditeventperiod.getEnd())+"\"");
		} else {
			a.addAuditEvntPrdEnd("NULL");
		}


		/******************** auditeventoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventOutcome auditeventoutcome = auditevent.getOutcome();
		if(auditeventoutcome!=null) {
			a.addAuditEvntOutcome(auditeventoutcome.toCode());
		} else {
			a.addAuditEvntOutcome("NULL");
		}

		/******************** AuditEvnt_Recorded ********************************************************************************/
		if(auditevent.hasRecorded()) {

			a.addAuditEvntRecorded("\""+ca.uhn.fhir.util.DateUtils.formatDate(auditevent.getRecorded())+"\"");
		} else {
			a.addAuditEvntRecorded("NULL");
		}


		/******************** auditeventagent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentComponent> auditeventagentlist = auditevent.getAgent();
		for(int auditeventagenti = 0; auditeventagenti<auditeventagentlist.size();auditeventagenti++ ) {
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentComponent  auditeventagent = auditeventagentlist.get(auditeventagenti);

		/******************** AuditEvnt_Agnt_Nm ********************************************************************************/
		if(auditeventagenti == 0) {a.addAuditEvntAgntNm("[");}
		if(auditeventagent.hasName()) {

			a.addAuditEvntAgntNm(String.valueOf(auditeventagent.getName()));
		} else {
			a.addAuditEvntAgntNm("NULL");
		}

		if(auditeventagenti == auditeventagentlist.size()-1) {a.addAuditEvntAgntNm("]");}


		/******************** AuditEvnt_Agnt_Lctn ********************************************************************************/
		if(auditeventagenti == 0) {a.addAuditEvntAgntLctn("[");}
		if(auditeventagent.hasLocation()) {

			if(auditeventagent.getLocation().getReference() != null) {
			a.addAuditEvntAgntLctn(auditeventagent.getLocation().getReference());
			}
		} else {
			a.addAuditEvntAgntLctn("NULL");
		}

		if(auditeventagenti == auditeventagentlist.size()-1) {a.addAuditEvntAgntLctn("]");}


		/******************** auditeventagenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept auditeventagenttype = auditeventagent.getType();

		/******************** AuditEvnt_Agnt_Typ_Txt ********************************************************************************/
		if(auditeventagenti == 0) {a.addAuditEvntAgntTypTxt("[");}
		if(auditeventagenttype.hasText()) {

			a.addAuditEvntAgntTypTxt(String.valueOf(auditeventagenttype.getText()));
		} else {
			a.addAuditEvntAgntTypTxt("NULL");
		}

		if(auditeventagenti == auditeventagentlist.size()-1) {a.addAuditEvntAgntTypTxt("]");}


		/******************** auditeventagenttypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> auditeventagenttypecodinglist = auditeventagenttype.getCoding();
		for(int auditeventagenttypecodingi = 0; auditeventagenttypecodingi<auditeventagenttypecodinglist.size();auditeventagenttypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  auditeventagenttypecoding = auditeventagenttypecodinglist.get(auditeventagenttypecodingi);

		/******************** AuditEvnt_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(auditeventagenttypecodingi == 0) {a.addAuditEvntAgntTypCdgDsply("[[");}
		if(auditeventagenttypecoding.hasDisplay()) {

			a.addAuditEvntAgntTypCdgDsply(String.valueOf(auditeventagenttypecoding.getDisplay()));
		} else {
			a.addAuditEvntAgntTypCdgDsply("NULL");
		}

		if(auditeventagenttypecodingi == auditeventagenttypecodinglist.size()-1) {a.addAuditEvntAgntTypCdgDsply("]]");}


		/******************** AuditEvnt_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(auditeventagenttypecodingi == 0) {a.addAuditEvntAgntTypCdgVrsn("[[");}
		if(auditeventagenttypecoding.hasVersion()) {

			a.addAuditEvntAgntTypCdgVrsn(String.valueOf(auditeventagenttypecoding.getVersion()));
		} else {
			a.addAuditEvntAgntTypCdgVrsn("NULL");
		}

		if(auditeventagenttypecodingi == auditeventagenttypecodinglist.size()-1) {a.addAuditEvntAgntTypCdgVrsn("]]");}


		/******************** AuditEvnt_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(auditeventagenttypecodingi == 0) {a.addAuditEvntAgntTypCdgCd("[[");}
		if(auditeventagenttypecoding.hasCode()) {

			a.addAuditEvntAgntTypCdgCd(String.valueOf(auditeventagenttypecoding.getCode()));
		} else {
			a.addAuditEvntAgntTypCdgCd("NULL");
		}

		if(auditeventagenttypecodingi == auditeventagenttypecodinglist.size()-1) {a.addAuditEvntAgntTypCdgCd("]]");}


		/******************** AuditEvnt_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(auditeventagenttypecodingi == 0) {a.addAuditEvntAgntTypCdgUsrSltd("[[");}
		if(auditeventagenttypecoding.hasUserSelected()) {

			a.addAuditEvntAgntTypCdgUsrSltd(String.valueOf(auditeventagenttypecoding.getUserSelected()));
		} else {
			a.addAuditEvntAgntTypCdgUsrSltd("NULL");
		}

		if(auditeventagenttypecodingi == auditeventagenttypecodinglist.size()-1) {a.addAuditEvntAgntTypCdgUsrSltd("]]");}


		/******************** AuditEvnt_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(auditeventagenttypecodingi == 0) {a.addAuditEvntAgntTypCdgSys("[[");}
		if(auditeventagenttypecoding.hasSystem()) {

			a.addAuditEvntAgntTypCdgSys(String.valueOf(auditeventagenttypecoding.getSystem()));
		} else {
			a.addAuditEvntAgntTypCdgSys("NULL");
		}

		if(auditeventagenttypecodingi == auditeventagenttypecodinglist.size()-1) {a.addAuditEvntAgntTypCdgSys("]]");}


		 };
		/******************** AuditEvnt_Agnt_Rqstor ********************************************************************************/
		if(auditeventagenti == 0) {a.addAuditEvntAgntRqstor("[");}
		if(auditeventagent.hasRequestor()) {

			a.addAuditEvntAgntRqstor(String.valueOf(auditeventagent.getRequestor()));
		} else {
			a.addAuditEvntAgntRqstor("NULL");
		}

		if(auditeventagenti == auditeventagentlist.size()-1) {a.addAuditEvntAgntRqstor("]");}


		/******************** auditeventagentrole ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> auditeventagentrolelist = auditeventagent.getRole();
		for(int auditeventagentrolei = 0; auditeventagentrolei<auditeventagentrolelist.size();auditeventagentrolei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  auditeventagentrole = auditeventagentrolelist.get(auditeventagentrolei);

		/******************** AuditEvnt_Agnt_Role_Txt ********************************************************************************/
		if(auditeventagentrolei == 0) {a.addAuditEvntAgntRoleTxt("[[");}
		if(auditeventagentrole.hasText()) {

			a.addAuditEvntAgntRoleTxt(String.valueOf(auditeventagentrole.getText()));
		} else {
			a.addAuditEvntAgntRoleTxt("NULL");
		}

		if(auditeventagentrolei == auditeventagentrolelist.size()-1) {a.addAuditEvntAgntRoleTxt("]]");}


		/******************** auditeventagentrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> auditeventagentrolecodinglist = auditeventagentrole.getCoding();
		for(int auditeventagentrolecodingi = 0; auditeventagentrolecodingi<auditeventagentrolecodinglist.size();auditeventagentrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  auditeventagentrolecoding = auditeventagentrolecodinglist.get(auditeventagentrolecodingi);

		/******************** AuditEvnt_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(auditeventagentrolecodingi == 0) {a.addAuditEvntAgntRoleCdgDsply("[[[");}
		if(auditeventagentrolecoding.hasDisplay()) {

			a.addAuditEvntAgntRoleCdgDsply(String.valueOf(auditeventagentrolecoding.getDisplay()));
		} else {
			a.addAuditEvntAgntRoleCdgDsply("NULL");
		}

		if(auditeventagentrolecodingi == auditeventagentrolecodinglist.size()-1) {a.addAuditEvntAgntRoleCdgDsply("]]]");}


		/******************** AuditEvnt_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(auditeventagentrolecodingi == 0) {a.addAuditEvntAgntRoleCdgVrsn("[[[");}
		if(auditeventagentrolecoding.hasVersion()) {

			a.addAuditEvntAgntRoleCdgVrsn(String.valueOf(auditeventagentrolecoding.getVersion()));
		} else {
			a.addAuditEvntAgntRoleCdgVrsn("NULL");
		}

		if(auditeventagentrolecodingi == auditeventagentrolecodinglist.size()-1) {a.addAuditEvntAgntRoleCdgVrsn("]]]");}


		/******************** AuditEvnt_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(auditeventagentrolecodingi == 0) {a.addAuditEvntAgntRoleCdgCd("[[[");}
		if(auditeventagentrolecoding.hasCode()) {

			a.addAuditEvntAgntRoleCdgCd(String.valueOf(auditeventagentrolecoding.getCode()));
		} else {
			a.addAuditEvntAgntRoleCdgCd("NULL");
		}

		if(auditeventagentrolecodingi == auditeventagentrolecodinglist.size()-1) {a.addAuditEvntAgntRoleCdgCd("]]]");}


		/******************** AuditEvnt_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(auditeventagentrolecodingi == 0) {a.addAuditEvntAgntRoleCdgUsrSltd("[[[");}
		if(auditeventagentrolecoding.hasUserSelected()) {

			a.addAuditEvntAgntRoleCdgUsrSltd(String.valueOf(auditeventagentrolecoding.getUserSelected()));
		} else {
			a.addAuditEvntAgntRoleCdgUsrSltd("NULL");
		}

		if(auditeventagentrolecodingi == auditeventagentrolecodinglist.size()-1) {a.addAuditEvntAgntRoleCdgUsrSltd("]]]");}


		/******************** AuditEvnt_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(auditeventagentrolecodingi == 0) {a.addAuditEvntAgntRoleCdgSys("[[[");}
		if(auditeventagentrolecoding.hasSystem()) {

			a.addAuditEvntAgntRoleCdgSys(String.valueOf(auditeventagentrolecoding.getSystem()));
		} else {
			a.addAuditEvntAgntRoleCdgSys("NULL");
		}

		if(auditeventagentrolecodingi == auditeventagentrolecodinglist.size()-1) {a.addAuditEvntAgntRoleCdgSys("]]]");}


		 };
		 };
		/******************** AuditEvnt_Agnt_Policy ********************************************************************************/
		if(auditeventagent.hasPolicy()) {

			String  array = "[";
			for(int incr=0; incr<auditeventagent.getPolicy().size(); incr++) {
				array = array + auditeventagent.getPolicy().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			a.addAuditEvntAgntPolicy(array);

		} else {
			a.addAuditEvntAgntPolicy("NULL");
		}


		/******************** auditeventagentnetwork ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentNetworkComponent auditeventagentnetwork = auditeventagent.getNetwork();

		/******************** auditeventagentnetworktype ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentNetworkType auditeventagentnetworktype = auditeventagentnetwork.getType();
		if(auditeventagentnetworktype!=null) {
			a.addAuditEvntAgntNetworkTyp(auditeventagentnetworktype.toCode());
		} else {
			a.addAuditEvntAgntNetworkTyp("NULL");
		}

		/******************** AuditEvnt_Agnt_Network_Addr ********************************************************************************/
		if(auditeventagentnetwork.hasAddress()) {

			a.addAuditEvntAgntNetworkAddr(String.valueOf(auditeventagentnetwork.getAddress()));
		} else {
			a.addAuditEvntAgntNetworkAddr("NULL");
		}


		/******************** auditeventagentmedia ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventagentmedia = auditeventagent.getMedia();

		/******************** AuditEvnt_Agnt_Media_Dsply ********************************************************************************/
		if(auditeventagentmedia.hasDisplay()) {

			a.addAuditEvntAgntMediaDsply(String.valueOf(auditeventagentmedia.getDisplay()));
		} else {
			a.addAuditEvntAgntMediaDsply("NULL");
		}


		/******************** AuditEvnt_Agnt_Media_Vrsn ********************************************************************************/
		if(auditeventagentmedia.hasVersion()) {

			a.addAuditEvntAgntMediaVrsn(String.valueOf(auditeventagentmedia.getVersion()));
		} else {
			a.addAuditEvntAgntMediaVrsn("NULL");
		}


		/******************** AuditEvnt_Agnt_Media_Cd ********************************************************************************/
		if(auditeventagentmedia.hasCode()) {

			a.addAuditEvntAgntMediaCd(String.valueOf(auditeventagentmedia.getCode()));
		} else {
			a.addAuditEvntAgntMediaCd("NULL");
		}


		/******************** AuditEvnt_Agnt_Media_UsrSltd ********************************************************************************/
		if(auditeventagentmedia.hasUserSelected()) {

			a.addAuditEvntAgntMediaUsrSltd(String.valueOf(auditeventagentmedia.getUserSelected()));
		} else {
			a.addAuditEvntAgntMediaUsrSltd("NULL");
		}


		/******************** AuditEvnt_Agnt_Media_Sys ********************************************************************************/
		if(auditeventagentmedia.hasSystem()) {

			a.addAuditEvntAgntMediaSys(String.valueOf(auditeventagentmedia.getSystem()));
		} else {
			a.addAuditEvntAgntMediaSys("NULL");
		}


		/******************** auditeventagentpurposeofuse ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> auditeventagentpurposeofuselist = auditeventagent.getPurposeOfUse();
		for(int auditeventagentpurposeofusei = 0; auditeventagentpurposeofusei<auditeventagentpurposeofuselist.size();auditeventagentpurposeofusei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  auditeventagentpurposeofuse = auditeventagentpurposeofuselist.get(auditeventagentpurposeofusei);

		/******************** AuditEvnt_Agnt_PrpseOfUse_Txt ********************************************************************************/
		if(auditeventagentpurposeofusei == 0) {a.addAuditEvntAgntPrpseOfUseTxt("[[");}
		if(auditeventagentpurposeofuse.hasText()) {

			a.addAuditEvntAgntPrpseOfUseTxt(String.valueOf(auditeventagentpurposeofuse.getText()));
		} else {
			a.addAuditEvntAgntPrpseOfUseTxt("NULL");
		}

		if(auditeventagentpurposeofusei == auditeventagentpurposeofuselist.size()-1) {a.addAuditEvntAgntPrpseOfUseTxt("]]");}


		/******************** auditeventagentpurposeofusecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> auditeventagentpurposeofusecodinglist = auditeventagentpurposeofuse.getCoding();
		for(int auditeventagentpurposeofusecodingi = 0; auditeventagentpurposeofusecodingi<auditeventagentpurposeofusecodinglist.size();auditeventagentpurposeofusecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  auditeventagentpurposeofusecoding = auditeventagentpurposeofusecodinglist.get(auditeventagentpurposeofusecodingi);

		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Dsply ********************************************************************************/
		if(auditeventagentpurposeofusecodingi == 0) {a.addAuditEvntAgntPrpseOfUseCdgDsply("[[[");}
		if(auditeventagentpurposeofusecoding.hasDisplay()) {

			a.addAuditEvntAgntPrpseOfUseCdgDsply(String.valueOf(auditeventagentpurposeofusecoding.getDisplay()));
		} else {
			a.addAuditEvntAgntPrpseOfUseCdgDsply("NULL");
		}

		if(auditeventagentpurposeofusecodingi == auditeventagentpurposeofusecodinglist.size()-1) {a.addAuditEvntAgntPrpseOfUseCdgDsply("]]]");}


		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Vrsn ********************************************************************************/
		if(auditeventagentpurposeofusecodingi == 0) {a.addAuditEvntAgntPrpseOfUseCdgVrsn("[[[");}
		if(auditeventagentpurposeofusecoding.hasVersion()) {

			a.addAuditEvntAgntPrpseOfUseCdgVrsn(String.valueOf(auditeventagentpurposeofusecoding.getVersion()));
		} else {
			a.addAuditEvntAgntPrpseOfUseCdgVrsn("NULL");
		}

		if(auditeventagentpurposeofusecodingi == auditeventagentpurposeofusecodinglist.size()-1) {a.addAuditEvntAgntPrpseOfUseCdgVrsn("]]]");}


		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Cd ********************************************************************************/
		if(auditeventagentpurposeofusecodingi == 0) {a.addAuditEvntAgntPrpseOfUseCdgCd("[[[");}
		if(auditeventagentpurposeofusecoding.hasCode()) {

			a.addAuditEvntAgntPrpseOfUseCdgCd(String.valueOf(auditeventagentpurposeofusecoding.getCode()));
		} else {
			a.addAuditEvntAgntPrpseOfUseCdgCd("NULL");
		}

		if(auditeventagentpurposeofusecodingi == auditeventagentpurposeofusecodinglist.size()-1) {a.addAuditEvntAgntPrpseOfUseCdgCd("]]]");}


		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_UsrSltd ********************************************************************************/
		if(auditeventagentpurposeofusecodingi == 0) {a.addAuditEvntAgntPrpseOfUseCdgUsrSltd("[[[");}
		if(auditeventagentpurposeofusecoding.hasUserSelected()) {

			a.addAuditEvntAgntPrpseOfUseCdgUsrSltd(String.valueOf(auditeventagentpurposeofusecoding.getUserSelected()));
		} else {
			a.addAuditEvntAgntPrpseOfUseCdgUsrSltd("NULL");
		}

		if(auditeventagentpurposeofusecodingi == auditeventagentpurposeofusecodinglist.size()-1) {a.addAuditEvntAgntPrpseOfUseCdgUsrSltd("]]]");}


		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Sys ********************************************************************************/
		if(auditeventagentpurposeofusecodingi == 0) {a.addAuditEvntAgntPrpseOfUseCdgSys("[[[");}
		if(auditeventagentpurposeofusecoding.hasSystem()) {

			a.addAuditEvntAgntPrpseOfUseCdgSys(String.valueOf(auditeventagentpurposeofusecoding.getSystem()));
		} else {
			a.addAuditEvntAgntPrpseOfUseCdgSys("NULL");
		}

		if(auditeventagentpurposeofusecodingi == auditeventagentpurposeofusecodinglist.size()-1) {a.addAuditEvntAgntPrpseOfUseCdgSys("]]]");}


		 };
		 };
		/******************** AuditEvnt_Agnt_AltId ********************************************************************************/
		if(auditeventagent.hasAltId()) {

			a.addAuditEvntAgntAltId(String.valueOf(auditeventagent.getAltId()));
		} else {
			a.addAuditEvntAgntAltId("NULL");
		}


		/******************** AuditEvnt_Agnt_Who ********************************************************************************/
		if(auditeventagent.hasWho()) {

			if(auditeventagent.getWho().getReference() != null) {
			a.addAuditEvntAgntWho(auditeventagent.getWho().getReference());
			}
		} else {
			a.addAuditEvntAgntWho("NULL");
		}


		 };
		/******************** auditevententity ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityComponent> auditevententitylist = auditevent.getEntity();
		for(int auditevententityi = 0; auditevententityi<auditevententitylist.size();auditevententityi++ ) {
		org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityComponent  auditevententity = auditevententitylist.get(auditevententityi);

		/******************** AuditEvnt_Entity_Nm ********************************************************************************/
		if(auditevententityi == 0) {a.addAuditEvntEntityNm("[");}
		if(auditevententity.hasName()) {

			a.addAuditEvntEntityNm(String.valueOf(auditevententity.getName()));
		} else {
			a.addAuditEvntEntityNm("NULL");
		}

		if(auditevententityi == auditevententitylist.size()-1) {a.addAuditEvntEntityNm("]");}


		/******************** auditevententitytype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententitytype = auditevententity.getType();

		/******************** AuditEvnt_Entity_Typ_Dsply ********************************************************************************/
		if(auditevententityi == 0) {a.addAuditEvntEntityTypDsply("[");}
		if(auditevententitytype.hasDisplay()) {

			a.addAuditEvntEntityTypDsply(String.valueOf(auditevententitytype.getDisplay()));
		} else {
			a.addAuditEvntEntityTypDsply("NULL");
		}

		if(auditevententityi == auditevententitylist.size()-1) {a.addAuditEvntEntityTypDsply("]");}


		/******************** AuditEvnt_Entity_Typ_Vrsn ********************************************************************************/
		if(auditevententityi == 0) {a.addAuditEvntEntityTypVrsn("[");}
		if(auditevententitytype.hasVersion()) {

			a.addAuditEvntEntityTypVrsn(String.valueOf(auditevententitytype.getVersion()));
		} else {
			a.addAuditEvntEntityTypVrsn("NULL");
		}

		if(auditevententityi == auditevententitylist.size()-1) {a.addAuditEvntEntityTypVrsn("]");}


		/******************** AuditEvnt_Entity_Typ_Cd ********************************************************************************/
		if(auditevententityi == 0) {a.addAuditEvntEntityTypCd("[");}
		if(auditevententitytype.hasCode()) {

			a.addAuditEvntEntityTypCd(String.valueOf(auditevententitytype.getCode()));
		} else {
			a.addAuditEvntEntityTypCd("NULL");
		}

		if(auditevententityi == auditevententitylist.size()-1) {a.addAuditEvntEntityTypCd("]");}


		/******************** AuditEvnt_Entity_Typ_UsrSltd ********************************************************************************/
		if(auditevententityi == 0) {a.addAuditEvntEntityTypUsrSltd("[");}
		if(auditevententitytype.hasUserSelected()) {

			a.addAuditEvntEntityTypUsrSltd(String.valueOf(auditevententitytype.getUserSelected()));
		} else {
			a.addAuditEvntEntityTypUsrSltd("NULL");
		}

		if(auditevententityi == auditevententitylist.size()-1) {a.addAuditEvntEntityTypUsrSltd("]");}


		/******************** AuditEvnt_Entity_Typ_Sys ********************************************************************************/
		if(auditevententityi == 0) {a.addAuditEvntEntityTypSys("[");}
		if(auditevententitytype.hasSystem()) {

			a.addAuditEvntEntityTypSys(String.valueOf(auditevententitytype.getSystem()));
		} else {
			a.addAuditEvntEntityTypSys("NULL");
		}

		if(auditevententityi == auditevententitylist.size()-1) {a.addAuditEvntEntityTypSys("]");}


		/******************** AuditEvnt_Entity_Query ********************************************************************************/
		if(auditevententityi == 0) {a.addAuditEvntEntityQuery("[");}
		if(auditevententity.hasQuery()) {

			a.addAuditEvntEntityQuery(new String(auditevententity.getQuery()));
		} else {
			a.addAuditEvntEntityQuery("NULL");
		}

		if(auditevententityi == auditevententitylist.size()-1) {a.addAuditEvntEntityQuery("]");}


		/******************** AuditEvnt_Entity_Dscrptn ********************************************************************************/
		if(auditevententityi == 0) {a.addAuditEvntEntityDscrptn("[");}
		if(auditevententity.hasDescription()) {

			a.addAuditEvntEntityDscrptn(String.valueOf(auditevententity.getDescription()));
		} else {
			a.addAuditEvntEntityDscrptn("NULL");
		}

		if(auditevententityi == auditevententitylist.size()-1) {a.addAuditEvntEntityDscrptn("]");}


		/******************** auditevententitydetail ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityDetailComponent> auditevententitydetaillist = auditevententity.getDetail();
		for(int auditevententitydetaili = 0; auditevententitydetaili<auditevententitydetaillist.size();auditevententitydetaili++ ) {
		org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityDetailComponent  auditevententitydetail = auditevententitydetaillist.get(auditevententitydetaili);

		/******************** AuditEvnt_Entity_Dtl_Typ ********************************************************************************/
		if(auditevententitydetaili == 0) {a.addAuditEvntEntityDtlTyp("[[");}
		if(auditevententitydetail.hasType()) {

			a.addAuditEvntEntityDtlTyp(String.valueOf(auditevententitydetail.getType()));
		} else {
			a.addAuditEvntEntityDtlTyp("NULL");
		}

		if(auditevententitydetaili == auditevententitydetaillist.size()-1) {a.addAuditEvntEntityDtlTyp("]]");}


		/******************** AuditEvnt_Entity_Dtl_VlBase64BinaryTyp ********************************************************************************/
		if(auditevententitydetaili == 0) {a.addAuditEvntEntityDtlVlBase64binaryTyp("[[");}
		if(auditevententitydetail.hasValueBase64BinaryType()) {

			a.addAuditEvntEntityDtlVlBase64binaryTyp("\""+auditevententitydetail.getValueBase64BinaryType().getValueAsString()+"\"");
		} else {
			a.addAuditEvntEntityDtlVlBase64binaryTyp("NULL");
		}

		if(auditevententitydetaili == auditevententitydetaillist.size()-1) {a.addAuditEvntEntityDtlVlBase64binaryTyp("]]");}


		/******************** AuditEvnt_Entity_Dtl_VlStrgTyp ********************************************************************************/
		if(auditevententitydetaili == 0) {a.addAuditEvntEntityDtlVlStrgTyp("[[");}
		if(auditevententitydetail.hasValueStringType()) {

			a.addAuditEvntEntityDtlVlStrgTyp("\""+auditevententitydetail.getValueStringType().getValueAsString()+"\"");
		} else {
			a.addAuditEvntEntityDtlVlStrgTyp("NULL");
		}

		if(auditevententitydetaili == auditevententitydetaillist.size()-1) {a.addAuditEvntEntityDtlVlStrgTyp("]]");}


		 };
		/******************** auditevententityrole ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententityrole = auditevententity.getRole();

		/******************** AuditEvnt_Entity_Role_Dsply ********************************************************************************/
		if(auditevententityrole.hasDisplay()) {

			a.addAuditEvntEntityRoleDsply(String.valueOf(auditevententityrole.getDisplay()));
		} else {
			a.addAuditEvntEntityRoleDsply("NULL");
		}


		/******************** AuditEvnt_Entity_Role_Vrsn ********************************************************************************/
		if(auditevententityrole.hasVersion()) {

			a.addAuditEvntEntityRoleVrsn(String.valueOf(auditevententityrole.getVersion()));
		} else {
			a.addAuditEvntEntityRoleVrsn("NULL");
		}


		/******************** AuditEvnt_Entity_Role_Cd ********************************************************************************/
		if(auditevententityrole.hasCode()) {

			a.addAuditEvntEntityRoleCd(String.valueOf(auditevententityrole.getCode()));
		} else {
			a.addAuditEvntEntityRoleCd("NULL");
		}


		/******************** AuditEvnt_Entity_Role_UsrSltd ********************************************************************************/
		if(auditevententityrole.hasUserSelected()) {

			a.addAuditEvntEntityRoleUsrSltd(String.valueOf(auditevententityrole.getUserSelected()));
		} else {
			a.addAuditEvntEntityRoleUsrSltd("NULL");
		}


		/******************** AuditEvnt_Entity_Role_Sys ********************************************************************************/
		if(auditevententityrole.hasSystem()) {

			a.addAuditEvntEntityRoleSys(String.valueOf(auditevententityrole.getSystem()));
		} else {
			a.addAuditEvntEntityRoleSys("NULL");
		}


		/******************** auditevententitysecuritylabel ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> auditevententitysecuritylabellist = auditevententity.getSecurityLabel();
		for(int auditevententitysecuritylabeli = 0; auditevententitysecuritylabeli<auditevententitysecuritylabellist.size();auditevententitysecuritylabeli++ ) {
		org.hl7.fhir.r4.model.Coding  auditevententitysecuritylabel = auditevententitysecuritylabellist.get(auditevententitysecuritylabeli);

		/******************** AuditEvnt_Entity_SecurityLbl_Dsply ********************************************************************************/
		if(auditevententitysecuritylabeli == 0) {a.addAuditEvntEntitySecurityLblDsply("[[");}
		if(auditevententitysecuritylabel.hasDisplay()) {

			a.addAuditEvntEntitySecurityLblDsply(String.valueOf(auditevententitysecuritylabel.getDisplay()));
		} else {
			a.addAuditEvntEntitySecurityLblDsply("NULL");
		}

		if(auditevententitysecuritylabeli == auditevententitysecuritylabellist.size()-1) {a.addAuditEvntEntitySecurityLblDsply("]]");}


		/******************** AuditEvnt_Entity_SecurityLbl_Vrsn ********************************************************************************/
		if(auditevententitysecuritylabeli == 0) {a.addAuditEvntEntitySecurityLblVrsn("[[");}
		if(auditevententitysecuritylabel.hasVersion()) {

			a.addAuditEvntEntitySecurityLblVrsn(String.valueOf(auditevententitysecuritylabel.getVersion()));
		} else {
			a.addAuditEvntEntitySecurityLblVrsn("NULL");
		}

		if(auditevententitysecuritylabeli == auditevententitysecuritylabellist.size()-1) {a.addAuditEvntEntitySecurityLblVrsn("]]");}


		/******************** AuditEvnt_Entity_SecurityLbl_Cd ********************************************************************************/
		if(auditevententitysecuritylabeli == 0) {a.addAuditEvntEntitySecurityLblCd("[[");}
		if(auditevententitysecuritylabel.hasCode()) {

			a.addAuditEvntEntitySecurityLblCd(String.valueOf(auditevententitysecuritylabel.getCode()));
		} else {
			a.addAuditEvntEntitySecurityLblCd("NULL");
		}

		if(auditevententitysecuritylabeli == auditevententitysecuritylabellist.size()-1) {a.addAuditEvntEntitySecurityLblCd("]]");}


		/******************** AuditEvnt_Entity_SecurityLbl_UsrSltd ********************************************************************************/
		if(auditevententitysecuritylabeli == 0) {a.addAuditEvntEntitySecurityLblUsrSltd("[[");}
		if(auditevententitysecuritylabel.hasUserSelected()) {

			a.addAuditEvntEntitySecurityLblUsrSltd(String.valueOf(auditevententitysecuritylabel.getUserSelected()));
		} else {
			a.addAuditEvntEntitySecurityLblUsrSltd("NULL");
		}

		if(auditevententitysecuritylabeli == auditevententitysecuritylabellist.size()-1) {a.addAuditEvntEntitySecurityLblUsrSltd("]]");}


		/******************** AuditEvnt_Entity_SecurityLbl_Sys ********************************************************************************/
		if(auditevententitysecuritylabeli == 0) {a.addAuditEvntEntitySecurityLblSys("[[");}
		if(auditevententitysecuritylabel.hasSystem()) {

			a.addAuditEvntEntitySecurityLblSys(String.valueOf(auditevententitysecuritylabel.getSystem()));
		} else {
			a.addAuditEvntEntitySecurityLblSys("NULL");
		}

		if(auditevententitysecuritylabeli == auditevententitysecuritylabellist.size()-1) {a.addAuditEvntEntitySecurityLblSys("]]");}


		 };
		/******************** auditevententitylifecycle ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententitylifecycle = auditevententity.getLifecycle();

		/******************** AuditEvnt_Entity_Lifecycle_Dsply ********************************************************************************/
		if(auditevententitylifecycle.hasDisplay()) {

			a.addAuditEvntEntityLifecycleDsply(String.valueOf(auditevententitylifecycle.getDisplay()));
		} else {
			a.addAuditEvntEntityLifecycleDsply("NULL");
		}


		/******************** AuditEvnt_Entity_Lifecycle_Vrsn ********************************************************************************/
		if(auditevententitylifecycle.hasVersion()) {

			a.addAuditEvntEntityLifecycleVrsn(String.valueOf(auditevententitylifecycle.getVersion()));
		} else {
			a.addAuditEvntEntityLifecycleVrsn("NULL");
		}


		/******************** AuditEvnt_Entity_Lifecycle_Cd ********************************************************************************/
		if(auditevententitylifecycle.hasCode()) {

			a.addAuditEvntEntityLifecycleCd(String.valueOf(auditevententitylifecycle.getCode()));
		} else {
			a.addAuditEvntEntityLifecycleCd("NULL");
		}


		/******************** AuditEvnt_Entity_Lifecycle_UsrSltd ********************************************************************************/
		if(auditevententitylifecycle.hasUserSelected()) {

			a.addAuditEvntEntityLifecycleUsrSltd(String.valueOf(auditevententitylifecycle.getUserSelected()));
		} else {
			a.addAuditEvntEntityLifecycleUsrSltd("NULL");
		}


		/******************** AuditEvnt_Entity_Lifecycle_Sys ********************************************************************************/
		if(auditevententitylifecycle.hasSystem()) {

			a.addAuditEvntEntityLifecycleSys(String.valueOf(auditevententitylifecycle.getSystem()));
		} else {
			a.addAuditEvntEntityLifecycleSys("NULL");
		}


		/******************** AuditEvnt_Entity_What ********************************************************************************/
		if(auditevententity.hasWhat()) {

			if(auditevententity.getWhat().getReference() != null) {
			a.addAuditEvntEntityWhat(auditevententity.getWhat().getReference());
			}
		} else {
			a.addAuditEvntEntityWhat("NULL");
		}


		 };
		/******************** auditeventsubtype ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> auditeventsubtypelist = auditevent.getSubtype();
		for(int auditeventsubtypei = 0; auditeventsubtypei<auditeventsubtypelist.size();auditeventsubtypei++ ) {
		org.hl7.fhir.r4.model.Coding  auditeventsubtype = auditeventsubtypelist.get(auditeventsubtypei);

		/******************** AuditEvnt_Subtype_Dsply ********************************************************************************/
		if(auditeventsubtypei == 0) {a.addAuditEvntSubtypeDsply("[");}
		if(auditeventsubtype.hasDisplay()) {

			a.addAuditEvntSubtypeDsply(String.valueOf(auditeventsubtype.getDisplay()));
		} else {
			a.addAuditEvntSubtypeDsply("NULL");
		}

		if(auditeventsubtypei == auditeventsubtypelist.size()-1) {a.addAuditEvntSubtypeDsply("]");}


		/******************** AuditEvnt_Subtype_Vrsn ********************************************************************************/
		if(auditeventsubtypei == 0) {a.addAuditEvntSubtypeVrsn("[");}
		if(auditeventsubtype.hasVersion()) {

			a.addAuditEvntSubtypeVrsn(String.valueOf(auditeventsubtype.getVersion()));
		} else {
			a.addAuditEvntSubtypeVrsn("NULL");
		}

		if(auditeventsubtypei == auditeventsubtypelist.size()-1) {a.addAuditEvntSubtypeVrsn("]");}


		/******************** AuditEvnt_Subtype_Cd ********************************************************************************/
		if(auditeventsubtypei == 0) {a.addAuditEvntSubtypeCd("[");}
		if(auditeventsubtype.hasCode()) {

			a.addAuditEvntSubtypeCd(String.valueOf(auditeventsubtype.getCode()));
		} else {
			a.addAuditEvntSubtypeCd("NULL");
		}

		if(auditeventsubtypei == auditeventsubtypelist.size()-1) {a.addAuditEvntSubtypeCd("]");}


		/******************** AuditEvnt_Subtype_UsrSltd ********************************************************************************/
		if(auditeventsubtypei == 0) {a.addAuditEvntSubtypeUsrSltd("[");}
		if(auditeventsubtype.hasUserSelected()) {

			a.addAuditEvntSubtypeUsrSltd(String.valueOf(auditeventsubtype.getUserSelected()));
		} else {
			a.addAuditEvntSubtypeUsrSltd("NULL");
		}

		if(auditeventsubtypei == auditeventsubtypelist.size()-1) {a.addAuditEvntSubtypeUsrSltd("]");}


		/******************** AuditEvnt_Subtype_Sys ********************************************************************************/
		if(auditeventsubtypei == 0) {a.addAuditEvntSubtypeSys("[");}
		if(auditeventsubtype.hasSystem()) {

			a.addAuditEvntSubtypeSys(String.valueOf(auditeventsubtype.getSystem()));
		} else {
			a.addAuditEvntSubtypeSys("NULL");
		}

		if(auditeventsubtypei == auditeventsubtypelist.size()-1) {a.addAuditEvntSubtypeSys("]");}


		 };
		/******************** AuditEvnt_OutcomeDesc ********************************************************************************/
		if(auditevent.hasOutcomeDesc()) {

			a.addAuditEvntOutcomeDesc(String.valueOf(auditevent.getOutcomeDesc()));
		} else {
			a.addAuditEvntOutcomeDesc("NULL");
		}


		/******************** auditeventpurposeofevent ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> auditeventpurposeofeventlist = auditevent.getPurposeOfEvent();
		for(int auditeventpurposeofeventi = 0; auditeventpurposeofeventi<auditeventpurposeofeventlist.size();auditeventpurposeofeventi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  auditeventpurposeofevent = auditeventpurposeofeventlist.get(auditeventpurposeofeventi);

		/******************** AuditEvnt_PrpseOfEvnt_Txt ********************************************************************************/
		if(auditeventpurposeofeventi == 0) {a.addAuditEvntPrpseOfEvntTxt("[");}
		if(auditeventpurposeofevent.hasText()) {

			a.addAuditEvntPrpseOfEvntTxt(String.valueOf(auditeventpurposeofevent.getText()));
		} else {
			a.addAuditEvntPrpseOfEvntTxt("NULL");
		}

		if(auditeventpurposeofeventi == auditeventpurposeofeventlist.size()-1) {a.addAuditEvntPrpseOfEvntTxt("]");}


		/******************** auditeventpurposeofeventcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> auditeventpurposeofeventcodinglist = auditeventpurposeofevent.getCoding();
		for(int auditeventpurposeofeventcodingi = 0; auditeventpurposeofeventcodingi<auditeventpurposeofeventcodinglist.size();auditeventpurposeofeventcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  auditeventpurposeofeventcoding = auditeventpurposeofeventcodinglist.get(auditeventpurposeofeventcodingi);

		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Dsply ********************************************************************************/
		if(auditeventpurposeofeventcodingi == 0) {a.addAuditEvntPrpseOfEvntCdgDsply("[[");}
		if(auditeventpurposeofeventcoding.hasDisplay()) {

			a.addAuditEvntPrpseOfEvntCdgDsply(String.valueOf(auditeventpurposeofeventcoding.getDisplay()));
		} else {
			a.addAuditEvntPrpseOfEvntCdgDsply("NULL");
		}

		if(auditeventpurposeofeventcodingi == auditeventpurposeofeventcodinglist.size()-1) {a.addAuditEvntPrpseOfEvntCdgDsply("]]");}


		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Vrsn ********************************************************************************/
		if(auditeventpurposeofeventcodingi == 0) {a.addAuditEvntPrpseOfEvntCdgVrsn("[[");}
		if(auditeventpurposeofeventcoding.hasVersion()) {

			a.addAuditEvntPrpseOfEvntCdgVrsn(String.valueOf(auditeventpurposeofeventcoding.getVersion()));
		} else {
			a.addAuditEvntPrpseOfEvntCdgVrsn("NULL");
		}

		if(auditeventpurposeofeventcodingi == auditeventpurposeofeventcodinglist.size()-1) {a.addAuditEvntPrpseOfEvntCdgVrsn("]]");}


		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Cd ********************************************************************************/
		if(auditeventpurposeofeventcodingi == 0) {a.addAuditEvntPrpseOfEvntCdgCd("[[");}
		if(auditeventpurposeofeventcoding.hasCode()) {

			a.addAuditEvntPrpseOfEvntCdgCd(String.valueOf(auditeventpurposeofeventcoding.getCode()));
		} else {
			a.addAuditEvntPrpseOfEvntCdgCd("NULL");
		}

		if(auditeventpurposeofeventcodingi == auditeventpurposeofeventcodinglist.size()-1) {a.addAuditEvntPrpseOfEvntCdgCd("]]");}


		/******************** AuditEvnt_PrpseOfEvnt_Cdg_UsrSltd ********************************************************************************/
		if(auditeventpurposeofeventcodingi == 0) {a.addAuditEvntPrpseOfEvntCdgUsrSltd("[[");}
		if(auditeventpurposeofeventcoding.hasUserSelected()) {

			a.addAuditEvntPrpseOfEvntCdgUsrSltd(String.valueOf(auditeventpurposeofeventcoding.getUserSelected()));
		} else {
			a.addAuditEvntPrpseOfEvntCdgUsrSltd("NULL");
		}

		if(auditeventpurposeofeventcodingi == auditeventpurposeofeventcodinglist.size()-1) {a.addAuditEvntPrpseOfEvntCdgUsrSltd("]]");}


		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Sys ********************************************************************************/
		if(auditeventpurposeofeventcodingi == 0) {a.addAuditEvntPrpseOfEvntCdgSys("[[");}
		if(auditeventpurposeofeventcoding.hasSystem()) {

			a.addAuditEvntPrpseOfEvntCdgSys(String.valueOf(auditeventpurposeofeventcoding.getSystem()));
		} else {
			a.addAuditEvntPrpseOfEvntCdgSys("NULL");
		}

		if(auditeventpurposeofeventcodingi == auditeventpurposeofeventcodinglist.size()-1) {a.addAuditEvntPrpseOfEvntCdgSys("]]");}


		 };
		 };
		return a;
	}
}
