package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AuditEvent;
public class AuditEventBidirectionalConversion 
{
	public AuditEvent AuditEvents(org.hl7.fhir.r4.model.AuditEvent auditevent) throws ParseException
	{
		 main.java.com.campfhir.model.AuditEvent a = new  main.java.com.campfhir.model.AuditEvent();

		/******************** id ********************************************************************************/
		auditevent.setId(a.getId());

		/******************** auditeventtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventtype = auditevent.getType();

		/******************** AuditEvnt_Typ_Vrsn ********************************************************************************/
		if(auditeventtype.hasVersion()) {
			a.setAuditEvntTypVrsn(String.valueOf(auditeventtype.getVersion()));
		}
		/******************** AuditEvnt_Typ_Dsply ********************************************************************************/
		if(auditeventtype.hasDisplay()) {
			a.setAuditEvntTypDsply(String.valueOf(auditeventtype.getDisplay()));
		}
		/******************** AuditEvnt_Typ_Cd ********************************************************************************/
		if(auditeventtype.hasCode()) {
			a.setAuditEvntTypCd(String.valueOf(auditeventtype.getCode()));
		}
		/******************** AuditEvnt_Typ_UsrSltd ********************************************************************************/
		if(auditeventtype.hasUserSelected()) {
			a.setAuditEvntTypUsrSltd(String.valueOf(auditeventtype.getUserSelected()));
		}
		/******************** AuditEvnt_Typ_Sys ********************************************************************************/
		if(auditeventtype.hasSystem()) {
			a.setAuditEvntTypSys(String.valueOf(auditeventtype.getSystem()));
		}
		/******************** auditeventsource ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventSourceComponent auditeventsource = auditevent.getSource();

		/******************** AuditEvnt_Src_Site ********************************************************************************/
		if(auditeventsource.hasSite()) {
			a.setAuditEvntSrcSite(String.valueOf(auditeventsource.getSite()));
		}
		/******************** auditeventsourcetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventsourcetype = auditeventsource.getTypeFirstRep();

		/******************** AuditEvnt_Src_Typ_Vrsn ********************************************************************************/
		if(auditeventsourcetype.hasVersion()) {
			a.setAuditEvntSrcTypVrsn(String.valueOf(auditeventsourcetype.getVersion()));
		}
		/******************** AuditEvnt_Src_Typ_Dsply ********************************************************************************/
		if(auditeventsourcetype.hasDisplay()) {
			a.setAuditEvntSrcTypDsply(String.valueOf(auditeventsourcetype.getDisplay()));
		}
		/******************** AuditEvnt_Src_Typ_Cd ********************************************************************************/
		if(auditeventsourcetype.hasCode()) {
			a.setAuditEvntSrcTypCd(String.valueOf(auditeventsourcetype.getCode()));
		}
		/******************** AuditEvnt_Src_Typ_UsrSltd ********************************************************************************/
		if(auditeventsourcetype.hasUserSelected()) {
			a.setAuditEvntSrcTypUsrSltd(String.valueOf(auditeventsourcetype.getUserSelected()));
		}
		/******************** AuditEvnt_Src_Typ_Sys ********************************************************************************/
		if(auditeventsourcetype.hasSystem()) {
			a.setAuditEvntSrcTypSys(String.valueOf(auditeventsourcetype.getSystem()));
		}
		/******************** AuditEvnt_Src_Observer ********************************************************************************/
		if(auditeventsource.hasObserver()) {
			a.setAuditEvntSrcObserver(String.valueOf(auditeventsource.getObserver()));
		}
		/******************** auditeventaction ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAction auditeventaction = auditevent.getAction();
		a.setAuditEvntActn(auditeventaction.toCode());

		/******************** AuditEvnt_Recorded ********************************************************************************/
		if(auditevent.hasRecorded()) {
			a.setAuditEvntRecorded(String.valueOf(auditevent.getRecorded()));
		}
		/******************** auditeventagent ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentComponent auditeventagent = auditevent.getAgentFirstRep();

		/******************** AuditEvnt_Agnt_Nm ********************************************************************************/
		if(auditeventagent.hasName()) {
			a.setAuditEvntAgntNm(String.valueOf(auditeventagent.getName()));
		}
		/******************** AuditEvnt_Agnt_Lctn ********************************************************************************/
		if(auditeventagent.hasLocation()) {
			a.setAuditEvntAgntLctn(String.valueOf(auditeventagent.getLocation()));
		}
		/******************** auditeventagenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept auditeventagenttype = auditeventagent.getType();

		/******************** AuditEvnt_Agnt_Typ_Txt ********************************************************************************/
		if(auditeventagenttype.hasText()) {
			a.setAuditEvntAgntTypTxt(String.valueOf(auditeventagenttype.getText()));
		}
		/******************** auditeventagenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventagenttypecoding = auditeventagenttype.getCodingFirstRep();

		/******************** AuditEvnt_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(auditeventagenttypecoding.hasVersion()) {
			a.setAuditEvntAgntTypCdgVrsn(String.valueOf(auditeventagenttypecoding.getVersion()));
		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(auditeventagenttypecoding.hasDisplay()) {
			a.setAuditEvntAgntTypCdgDsply(String.valueOf(auditeventagenttypecoding.getDisplay()));
		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(auditeventagenttypecoding.hasCode()) {
			a.setAuditEvntAgntTypCdgCd(String.valueOf(auditeventagenttypecoding.getCode()));
		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(auditeventagenttypecoding.hasUserSelected()) {
			a.setAuditEvntAgntTypCdgUsrSltd(String.valueOf(auditeventagenttypecoding.getUserSelected()));
		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(auditeventagenttypecoding.hasSystem()) {
			a.setAuditEvntAgntTypCdgSys(String.valueOf(auditeventagenttypecoding.getSystem()));
		}
		/******************** AuditEvnt_Agnt_Rqstor ********************************************************************************/
		if(auditeventagent.hasRequestor()) {
			a.setAuditEvntAgntRqstor(String.valueOf(auditeventagent.getRequestor()));
		}
		/******************** auditeventagentpurposeofuse ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept auditeventagentpurposeofuse = auditeventagent.getPurposeOfUseFirstRep();

		/******************** AuditEvnt_Agnt_PrpseOfUse_Txt ********************************************************************************/
		if(auditeventagentpurposeofuse.hasText()) {
			a.setAuditEvntAgntPrpseOfUseTxt(String.valueOf(auditeventagentpurposeofuse.getText()));
		}
		/******************** auditeventagentpurposeofusecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventagentpurposeofusecoding = auditeventagentpurposeofuse.getCodingFirstRep();

		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Vrsn ********************************************************************************/
		if(auditeventagentpurposeofusecoding.hasVersion()) {
			a.setAuditEvntAgntPrpseOfUseCdgVrsn(String.valueOf(auditeventagentpurposeofusecoding.getVersion()));
		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Dsply ********************************************************************************/
		if(auditeventagentpurposeofusecoding.hasDisplay()) {
			a.setAuditEvntAgntPrpseOfUseCdgDsply(String.valueOf(auditeventagentpurposeofusecoding.getDisplay()));
		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Cd ********************************************************************************/
		if(auditeventagentpurposeofusecoding.hasCode()) {
			a.setAuditEvntAgntPrpseOfUseCdgCd(String.valueOf(auditeventagentpurposeofusecoding.getCode()));
		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_UsrSltd ********************************************************************************/
		if(auditeventagentpurposeofusecoding.hasUserSelected()) {
			a.setAuditEvntAgntPrpseOfUseCdgUsrSltd(String.valueOf(auditeventagentpurposeofusecoding.getUserSelected()));
		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Sys ********************************************************************************/
		if(auditeventagentpurposeofusecoding.hasSystem()) {
			a.setAuditEvntAgntPrpseOfUseCdgSys(String.valueOf(auditeventagentpurposeofusecoding.getSystem()));
		}
		/******************** AuditEvnt_Agnt_Who ********************************************************************************/
		if(auditeventagent.hasWho()) {
			a.setAuditEvntAgntWho(String.valueOf(auditeventagent.getWho()));
		}
		/******************** auditeventagentrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept auditeventagentrole = auditeventagent.getRoleFirstRep();

		/******************** AuditEvnt_Agnt_Role_Txt ********************************************************************************/
		if(auditeventagentrole.hasText()) {
			a.setAuditEvntAgntRoleTxt(String.valueOf(auditeventagentrole.getText()));
		}
		/******************** auditeventagentrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventagentrolecoding = auditeventagentrole.getCodingFirstRep();

		/******************** AuditEvnt_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(auditeventagentrolecoding.hasVersion()) {
			a.setAuditEvntAgntRoleCdgVrsn(String.valueOf(auditeventagentrolecoding.getVersion()));
		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(auditeventagentrolecoding.hasDisplay()) {
			a.setAuditEvntAgntRoleCdgDsply(String.valueOf(auditeventagentrolecoding.getDisplay()));
		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(auditeventagentrolecoding.hasCode()) {
			a.setAuditEvntAgntRoleCdgCd(String.valueOf(auditeventagentrolecoding.getCode()));
		}
		/******************** AuditEvnt_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(auditeventagentrolecoding.hasUserSelected()) {
			a.setAuditEvntAgntRoleCdgUsrSltd(String.valueOf(auditeventagentrolecoding.getUserSelected()));
		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(auditeventagentrolecoding.hasSystem()) {
			a.setAuditEvntAgntRoleCdgSys(String.valueOf(auditeventagentrolecoding.getSystem()));
		}
		/******************** AuditEvnt_Agnt_AltId ********************************************************************************/
		if(auditeventagent.hasAltId()) {
			a.setAuditEvntAgntAltId(String.valueOf(auditeventagent.getAltId()));
		}
		/******************** auditeventagentmedia ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventagentmedia = auditeventagent.getMedia();

		/******************** AuditEvnt_Agnt_Media_Vrsn ********************************************************************************/
		if(auditeventagentmedia.hasVersion()) {
			a.setAuditEvntAgntMediaVrsn(String.valueOf(auditeventagentmedia.getVersion()));
		}
		/******************** AuditEvnt_Agnt_Media_Dsply ********************************************************************************/
		if(auditeventagentmedia.hasDisplay()) {
			a.setAuditEvntAgntMediaDsply(String.valueOf(auditeventagentmedia.getDisplay()));
		}
		/******************** AuditEvnt_Agnt_Media_Cd ********************************************************************************/
		if(auditeventagentmedia.hasCode()) {
			a.setAuditEvntAgntMediaCd(String.valueOf(auditeventagentmedia.getCode()));
		}
		/******************** AuditEvnt_Agnt_Media_UsrSltd ********************************************************************************/
		if(auditeventagentmedia.hasUserSelected()) {
			a.setAuditEvntAgntMediaUsrSltd(String.valueOf(auditeventagentmedia.getUserSelected()));
		}
		/******************** AuditEvnt_Agnt_Media_Sys ********************************************************************************/
		if(auditeventagentmedia.hasSystem()) {
			a.setAuditEvntAgntMediaSys(String.valueOf(auditeventagentmedia.getSystem()));
		}
		/******************** auditeventagentnetwork ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentNetworkComponent auditeventagentnetwork = auditeventagent.getNetwork();

		/******************** auditeventagentnetworktype ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentNetworkType auditeventagentnetworktype = auditeventagentnetwork.getType();
		a.setAuditEvntAgntNetworkTyp(auditeventagentnetworktype.toCode());

		/******************** AuditEvnt_Agnt_Network_Addr ********************************************************************************/
		if(auditeventagentnetwork.hasAddress()) {
			a.setAuditEvntAgntNetworkAddr(String.valueOf(auditeventagentnetwork.getAddress()));
		}
		/******************** auditevententity ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityComponent auditevententity = auditevent.getEntityFirstRep();

		/******************** AuditEvnt_Entity_Nm ********************************************************************************/
		if(auditevententity.hasName()) {
			a.setAuditEvntEntityNm(String.valueOf(auditevententity.getName()));
		}
		/******************** auditevententitytype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententitytype = auditevententity.getType();

		/******************** AuditEvnt_Entity_Typ_Vrsn ********************************************************************************/
		if(auditevententitytype.hasVersion()) {
			a.setAuditEvntEntityTypVrsn(String.valueOf(auditevententitytype.getVersion()));
		}
		/******************** AuditEvnt_Entity_Typ_Dsply ********************************************************************************/
		if(auditevententitytype.hasDisplay()) {
			a.setAuditEvntEntityTypDsply(String.valueOf(auditevententitytype.getDisplay()));
		}
		/******************** AuditEvnt_Entity_Typ_Cd ********************************************************************************/
		if(auditevententitytype.hasCode()) {
			a.setAuditEvntEntityTypCd(String.valueOf(auditevententitytype.getCode()));
		}
		/******************** AuditEvnt_Entity_Typ_UsrSltd ********************************************************************************/
		if(auditevententitytype.hasUserSelected()) {
			a.setAuditEvntEntityTypUsrSltd(String.valueOf(auditevententitytype.getUserSelected()));
		}
		/******************** AuditEvnt_Entity_Typ_Sys ********************************************************************************/
		if(auditevententitytype.hasSystem()) {
			a.setAuditEvntEntityTypSys(String.valueOf(auditevententitytype.getSystem()));
		}
		/******************** AuditEvnt_Entity_Query ********************************************************************************/
		if(auditevententity.hasQuery()) {
			a.setAuditEvntEntityQuery(String.valueOf(auditevententity.getQuery()));
		}

		/******************** AuditEvnt_Entity_Dscrptn ********************************************************************************/
		if(auditevententity.hasDescription()) {
			a.setAuditEvntEntityDscrptn(String.valueOf(auditevententity.getDescription()));
		}
		/******************** auditevententitydetail ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityDetailComponent auditevententitydetail = auditevententity.getDetailFirstRep();

		/******************** AuditEvnt_Entity_Dtl_Typ ********************************************************************************/
		if(auditevententitydetail.hasType()) {
			a.setAuditEvntEntityDtlTyp(String.valueOf(auditevententitydetail.getType()));
		}
		/******************** AuditEvnt_Entity_Dtl_VlBase64BinaryTyp ********************************************************************************/
		if(auditevententitydetail.hasValueBase64BinaryType()) {
			a.setAuditEvntEntityDtlVlBase64binaryTyp(String.valueOf(auditevententitydetail.getValueBase64BinaryType()));
		}
		/******************** AuditEvnt_Entity_Dtl_VlStrgTyp ********************************************************************************/
		if(auditevententitydetail.hasValueStringType()) {
			a.setAuditEvntEntityDtlVlStrgTyp(String.valueOf(auditevententitydetail.getValueStringType()));
		}
		/******************** AuditEvnt_Entity_What ********************************************************************************/
		if(auditevententity.hasWhat()) {
			a.setAuditEvntEntityWhat(String.valueOf(auditevententity.getWhat()));
		}
		/******************** auditevententitylifecycle ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententitylifecycle = auditevententity.getLifecycle();

		/******************** AuditEvnt_Entity_Lifecycle_Vrsn ********************************************************************************/
		if(auditevententitylifecycle.hasVersion()) {
			a.setAuditEvntEntityLifecycleVrsn(String.valueOf(auditevententitylifecycle.getVersion()));
		}
		/******************** AuditEvnt_Entity_Lifecycle_Dsply ********************************************************************************/
		if(auditevententitylifecycle.hasDisplay()) {
			a.setAuditEvntEntityLifecycleDsply(String.valueOf(auditevententitylifecycle.getDisplay()));
		}
		/******************** AuditEvnt_Entity_Lifecycle_Cd ********************************************************************************/
		if(auditevententitylifecycle.hasCode()) {
			a.setAuditEvntEntityLifecycleCd(String.valueOf(auditevententitylifecycle.getCode()));
		}
		/******************** AuditEvnt_Entity_Lifecycle_UsrSltd ********************************************************************************/
		if(auditevententitylifecycle.hasUserSelected()) {
			a.setAuditEvntEntityLifecycleUsrSltd(String.valueOf(auditevententitylifecycle.getUserSelected()));
		}
		/******************** AuditEvnt_Entity_Lifecycle_Sys ********************************************************************************/
		if(auditevententitylifecycle.hasSystem()) {
			a.setAuditEvntEntityLifecycleSys(String.valueOf(auditevententitylifecycle.getSystem()));
		}
		/******************** auditevententityrole ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententityrole = auditevententity.getRole();

		/******************** AuditEvnt_Entity_Role_Vrsn ********************************************************************************/
		if(auditevententityrole.hasVersion()) {
			a.setAuditEvntEntityRoleVrsn(String.valueOf(auditevententityrole.getVersion()));
		}
		/******************** AuditEvnt_Entity_Role_Dsply ********************************************************************************/
		if(auditevententityrole.hasDisplay()) {
			a.setAuditEvntEntityRoleDsply(String.valueOf(auditevententityrole.getDisplay()));
		}
		/******************** AuditEvnt_Entity_Role_Cd ********************************************************************************/
		if(auditevententityrole.hasCode()) {
			a.setAuditEvntEntityRoleCd(String.valueOf(auditevententityrole.getCode()));
		}
		/******************** AuditEvnt_Entity_Role_UsrSltd ********************************************************************************/
		if(auditevententityrole.hasUserSelected()) {
			a.setAuditEvntEntityRoleUsrSltd(String.valueOf(auditevententityrole.getUserSelected()));
		}
		/******************** AuditEvnt_Entity_Role_Sys ********************************************************************************/
		if(auditevententityrole.hasSystem()) {
			a.setAuditEvntEntityRoleSys(String.valueOf(auditevententityrole.getSystem()));
		}
		/******************** auditevententitysecuritylabel ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententitysecuritylabel = auditevententity.getSecurityLabelFirstRep();

		/******************** AuditEvnt_Entity_SecurityLbl_Vrsn ********************************************************************************/
		if(auditevententitysecuritylabel.hasVersion()) {
			a.setAuditEvntEntitySecurityLblVrsn(String.valueOf(auditevententitysecuritylabel.getVersion()));
		}
		/******************** AuditEvnt_Entity_SecurityLbl_Dsply ********************************************************************************/
		if(auditevententitysecuritylabel.hasDisplay()) {
			a.setAuditEvntEntitySecurityLblDsply(String.valueOf(auditevententitysecuritylabel.getDisplay()));
		}
		/******************** AuditEvnt_Entity_SecurityLbl_Cd ********************************************************************************/
		if(auditevententitysecuritylabel.hasCode()) {
			a.setAuditEvntEntitySecurityLblCd(String.valueOf(auditevententitysecuritylabel.getCode()));
		}
		/******************** AuditEvnt_Entity_SecurityLbl_UsrSltd ********************************************************************************/
		if(auditevententitysecuritylabel.hasUserSelected()) {
			a.setAuditEvntEntitySecurityLblUsrSltd(String.valueOf(auditevententitysecuritylabel.getUserSelected()));
		}
		/******************** AuditEvnt_Entity_SecurityLbl_Sys ********************************************************************************/
		if(auditevententitysecuritylabel.hasSystem()) {
			a.setAuditEvntEntitySecurityLblSys(String.valueOf(auditevententitysecuritylabel.getSystem()));
		}
		/******************** AuditEvnt_OutcomeDesc ********************************************************************************/
		if(auditevent.hasOutcomeDesc()) {
			a.setAuditEvntOutcomeDesc(String.valueOf(auditevent.getOutcomeDesc()));
		}
		/******************** auditeventsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventsubtype = auditevent.getSubtypeFirstRep();

		/******************** AuditEvnt_Subtype_Vrsn ********************************************************************************/
		if(auditeventsubtype.hasVersion()) {
			a.setAuditEvntSubtypeVrsn(String.valueOf(auditeventsubtype.getVersion()));
		}
		/******************** AuditEvnt_Subtype_Dsply ********************************************************************************/
		if(auditeventsubtype.hasDisplay()) {
			a.setAuditEvntSubtypeDsply(String.valueOf(auditeventsubtype.getDisplay()));
		}
		/******************** AuditEvnt_Subtype_Cd ********************************************************************************/
		if(auditeventsubtype.hasCode()) {
			a.setAuditEvntSubtypeCd(String.valueOf(auditeventsubtype.getCode()));
		}
		/******************** AuditEvnt_Subtype_UsrSltd ********************************************************************************/
		if(auditeventsubtype.hasUserSelected()) {
			a.setAuditEvntSubtypeUsrSltd(String.valueOf(auditeventsubtype.getUserSelected()));
		}
		/******************** AuditEvnt_Subtype_Sys ********************************************************************************/
		if(auditeventsubtype.hasSystem()) {
			a.setAuditEvntSubtypeSys(String.valueOf(auditeventsubtype.getSystem()));
		}
		/******************** auditeventperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period auditeventperiod = auditevent.getPeriod();

		/******************** AuditEvnt_Prd_Strt ********************************************************************************/
		if(auditeventperiod.hasStart()) {
			a.setAuditEvntPrdStrt(String.valueOf(auditeventperiod.getStart()));
		}
		/******************** AuditEvnt_Prd_End ********************************************************************************/
		if(auditeventperiod.hasEnd()) {
			a.setAuditEvntPrdEnd(String.valueOf(auditeventperiod.getEnd()));
		}
		/******************** auditeventoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventOutcome auditeventoutcome = auditevent.getOutcome();
		a.setAuditEvntOutcome(auditeventoutcome.toCode());

		/******************** auditeventpurposeofevent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept auditeventpurposeofevent = auditevent.getPurposeOfEventFirstRep();

		/******************** AuditEvnt_PrpseOfEvnt_Txt ********************************************************************************/
		if(auditeventpurposeofevent.hasText()) {
			a.setAuditEvntPrpseOfEvntTxt(String.valueOf(auditeventpurposeofevent.getText()));
		}
		/******************** auditeventpurposeofeventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventpurposeofeventcoding = auditeventpurposeofevent.getCodingFirstRep();

		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Vrsn ********************************************************************************/
		if(auditeventpurposeofeventcoding.hasVersion()) {
			a.setAuditEvntPrpseOfEvntCdgVrsn(String.valueOf(auditeventpurposeofeventcoding.getVersion()));
		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Dsply ********************************************************************************/
		if(auditeventpurposeofeventcoding.hasDisplay()) {
			a.setAuditEvntPrpseOfEvntCdgDsply(String.valueOf(auditeventpurposeofeventcoding.getDisplay()));
		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Cd ********************************************************************************/
		if(auditeventpurposeofeventcoding.hasCode()) {
			a.setAuditEvntPrpseOfEvntCdgCd(String.valueOf(auditeventpurposeofeventcoding.getCode()));
		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_UsrSltd ********************************************************************************/
		if(auditeventpurposeofeventcoding.hasUserSelected()) {
			a.setAuditEvntPrpseOfEvntCdgUsrSltd(String.valueOf(auditeventpurposeofeventcoding.getUserSelected()));
		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Sys ********************************************************************************/
		if(auditeventpurposeofeventcoding.hasSystem()) {
			a.setAuditEvntPrpseOfEvntCdgSys(String.valueOf(auditeventpurposeofeventcoding.getSystem()));
		}
		return a;
	}
}
