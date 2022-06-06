package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.AuditEvent;
public class AuditEventConversion 
{
	public org.hl7.fhir.r4.model.AuditEvent AuditEvents(AuditEvent a) throws ParseException
	{
		org.hl7.fhir.r4.model.AuditEvent auditevent = new org.hl7.fhir.r4.model.AuditEvent();

		/******************** id ********************************************************************************/
		auditevent.setId(a.getId());

		/******************** auditeventaction ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventActionEnumFactory auditeventaction =  new org.hl7.fhir.r4.model.AuditEvent.AuditEventActionEnumFactory();
		auditevent.setAction(auditeventaction.fromCode(a.getAuditEvntActn()));

		/******************** auditeventagent ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentComponent auditeventagent =  new org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentComponent();
		auditevent.addAgent(auditeventagent);

		/******************** AuditEvnt_Agnt_AltId ********************************************************************************/
		if(a.getAuditEvntAgntAltId() != null) {
			auditeventagent.setAltId(a.getAuditEvntAgntAltId());
		}
		/******************** AuditEvnt_Agnt_Lctn ********************************************************************************/
		if(a.getAuditEvntAgntLctn() != null) {
			auditeventagent.setLocation( new org.hl7.fhir.r4.model.Reference(a.getAuditEvntAgntLctn()));
		}
		/******************** auditeventagentmedia ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventagentmedia =  new org.hl7.fhir.r4.model.Coding();
		auditeventagent.setMedia(auditeventagentmedia);

		/******************** AuditEvnt_Agnt_Media_Cd ********************************************************************************/
		if(a.getAuditEvntAgntMediaCd() != null) {
			auditeventagentmedia.setCode(a.getAuditEvntAgntMediaCd());
		}
		/******************** AuditEvnt_Agnt_Media_Dsply ********************************************************************************/
		if(a.getAuditEvntAgntMediaDsply() != null) {
			auditeventagentmedia.setDisplay(a.getAuditEvntAgntMediaDsply());
		}
		/******************** AuditEvnt_Agnt_Media_Sys ********************************************************************************/
		if(a.getAuditEvntAgntMediaSys() != null) {
			auditeventagentmedia.setSystem(a.getAuditEvntAgntMediaSys());
		}
		/******************** AuditEvnt_Agnt_Media_UsrSltd ********************************************************************************/
		if(a.getAuditEvntAgntMediaUsrSltd() != null) {
			auditeventagentmedia.setUserSelected(Boolean.parseBoolean(a.getAuditEvntAgntMediaUsrSltd()));
		}
		/******************** AuditEvnt_Agnt_Media_Vrsn ********************************************************************************/
		if(a.getAuditEvntAgntMediaVrsn() != null) {
			auditeventagentmedia.setVersion(a.getAuditEvntAgntMediaVrsn());
		}
		/******************** AuditEvnt_Agnt_Nm ********************************************************************************/
		if(a.getAuditEvntAgntNm() != null) {
			auditeventagent.setName(a.getAuditEvntAgntNm());
		}
		/******************** auditeventagentnetwork ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentNetworkComponent auditeventagentnetwork =  new org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentNetworkComponent();
		auditeventagent.setNetwork(auditeventagentnetwork);

		/******************** AuditEvnt_Agnt_Network_Addr ********************************************************************************/
		if(a.getAuditEvntAgntNetworkAddr() != null) {
			auditeventagentnetwork.setAddress(a.getAuditEvntAgntNetworkAddr());
		}
		/******************** auditeventagentnetworktype ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentNetworkTypeEnumFactory auditeventagentnetworktype =  new org.hl7.fhir.r4.model.AuditEvent.AuditEventAgentNetworkTypeEnumFactory();
		auditeventagentnetwork.setType(auditeventagentnetworktype.fromCode(a.getAuditEvntAgntNetworkTyp()));

		/******************** AuditEvnt_Agnt_Policy ********************************************************************************/
		if(a.getAuditEvntAgntPolicy() != null) {
			auditeventagent.addPolicy(a.getAuditEvntAgntPolicy());
		}
		/******************** auditeventagentpurposeofuse ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept auditeventagentpurposeofuse =  new org.hl7.fhir.r4.model.CodeableConcept();
		auditeventagent.addPurposeOfUse(auditeventagentpurposeofuse);

		/******************** auditeventagentpurposeofusecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventagentpurposeofusecoding =  new org.hl7.fhir.r4.model.Coding();
		auditeventagentpurposeofuse.addCoding(auditeventagentpurposeofusecoding);

		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Cd ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgCd() != null) {
			auditeventagentpurposeofusecoding.setCode(a.getAuditEvntAgntPrpseOfUseCdgCd());
		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Dsply ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgDsply() != null) {
			auditeventagentpurposeofusecoding.setDisplay(a.getAuditEvntAgntPrpseOfUseCdgDsply());
		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Sys ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgSys() != null) {
			auditeventagentpurposeofusecoding.setSystem(a.getAuditEvntAgntPrpseOfUseCdgSys());
		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_UsrSltd ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgUsrSltd() != null) {
			auditeventagentpurposeofusecoding.setUserSelected(Boolean.parseBoolean(a.getAuditEvntAgntPrpseOfUseCdgUsrSltd()));
		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Cdg_Vrsn ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseCdgVrsn() != null) {
			auditeventagentpurposeofusecoding.setVersion(a.getAuditEvntAgntPrpseOfUseCdgVrsn());
		}
		/******************** AuditEvnt_Agnt_PrpseOfUse_Txt ********************************************************************************/
		if(a.getAuditEvntAgntPrpseOfUseTxt() != null) {
			auditeventagentpurposeofuse.setText(a.getAuditEvntAgntPrpseOfUseTxt());
		}
		/******************** AuditEvnt_Agnt_Rqstor ********************************************************************************/
		if(a.getAuditEvntAgntRqstor() != null) {
			auditeventagent.setRequestor(Boolean.parseBoolean(a.getAuditEvntAgntRqstor()));
		}
		/******************** auditeventagentrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept auditeventagentrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		auditeventagent.addRole(auditeventagentrole);

		/******************** auditeventagentrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventagentrolecoding =  new org.hl7.fhir.r4.model.Coding();
		auditeventagentrole.addCoding(auditeventagentrolecoding);

		/******************** AuditEvnt_Agnt_Role_Cdg_Cd ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgCd() != null) {
			auditeventagentrolecoding.setCode(a.getAuditEvntAgntRoleCdgCd());
		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Dsply ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgDsply() != null) {
			auditeventagentrolecoding.setDisplay(a.getAuditEvntAgntRoleCdgDsply());
		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Sys ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgSys() != null) {
			auditeventagentrolecoding.setSystem(a.getAuditEvntAgntRoleCdgSys());
		}
		/******************** AuditEvnt_Agnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgUsrSltd() != null) {
			auditeventagentrolecoding.setUserSelected(Boolean.parseBoolean(a.getAuditEvntAgntRoleCdgUsrSltd()));
		}
		/******************** AuditEvnt_Agnt_Role_Cdg_Vrsn ********************************************************************************/
		if(a.getAuditEvntAgntRoleCdgVrsn() != null) {
			auditeventagentrolecoding.setVersion(a.getAuditEvntAgntRoleCdgVrsn());
		}
		/******************** AuditEvnt_Agnt_Role_Txt ********************************************************************************/
		if(a.getAuditEvntAgntRoleTxt() != null) {
			auditeventagentrole.setText(a.getAuditEvntAgntRoleTxt());
		}
		/******************** auditeventagenttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept auditeventagenttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		auditeventagent.setType(auditeventagenttype);

		/******************** auditeventagenttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventagenttypecoding =  new org.hl7.fhir.r4.model.Coding();
		auditeventagenttype.addCoding(auditeventagenttypecoding);

		/******************** AuditEvnt_Agnt_Typ_Cdg_Cd ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgCd() != null) {
			auditeventagenttypecoding.setCode(a.getAuditEvntAgntTypCdgCd());
		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Dsply ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgDsply() != null) {
			auditeventagenttypecoding.setDisplay(a.getAuditEvntAgntTypCdgDsply());
		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Sys ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgSys() != null) {
			auditeventagenttypecoding.setSystem(a.getAuditEvntAgntTypCdgSys());
		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_UsrSltd ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgUsrSltd() != null) {
			auditeventagenttypecoding.setUserSelected(Boolean.parseBoolean(a.getAuditEvntAgntTypCdgUsrSltd()));
		}
		/******************** AuditEvnt_Agnt_Typ_Cdg_Vrsn ********************************************************************************/
		if(a.getAuditEvntAgntTypCdgVrsn() != null) {
			auditeventagenttypecoding.setVersion(a.getAuditEvntAgntTypCdgVrsn());
		}
		/******************** AuditEvnt_Agnt_Typ_Txt ********************************************************************************/
		if(a.getAuditEvntAgntTypTxt() != null) {
			auditeventagenttype.setText(a.getAuditEvntAgntTypTxt());
		}
		/******************** AuditEvnt_Agnt_Who ********************************************************************************/
		if(a.getAuditEvntAgntWho() != null) {
			auditeventagent.setWho( new org.hl7.fhir.r4.model.Reference(a.getAuditEvntAgntWho()));
		}
		/******************** auditevententity ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityComponent auditevententity =  new org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityComponent();
		auditevent.addEntity(auditevententity);

		/******************** AuditEvnt_Entity_Dscrptn ********************************************************************************/
		if(a.getAuditEvntEntityDscrptn() != null) {
			auditevententity.setDescription(a.getAuditEvntEntityDscrptn());
		}
		/******************** auditevententitydetail ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityDetailComponent auditevententitydetail =  new org.hl7.fhir.r4.model.AuditEvent.AuditEventEntityDetailComponent();
		auditevententity.addDetail(auditevententitydetail);

		/******************** AuditEvnt_Entity_Dtl_Typ ********************************************************************************/
		if(a.getAuditEvntEntityDtlTyp() != null) {
			auditevententitydetail.setType(a.getAuditEvntEntityDtlTyp());
		}
		/******************** AuditEvnt_Entity_Dtl_VlBase64BinaryTyp ********************************************************************************/
		if(a.getAuditEvntEntityDtlVlBase64binaryTyp() != null) {
			auditevententitydetail.setValue( new org.hl7.fhir.r4.model.Base64BinaryType(a.getAuditEvntEntityDtlVlBase64binaryTyp()));
		}
		/******************** AuditEvnt_Entity_Dtl_VlStrgTyp ********************************************************************************/
		if(a.getAuditEvntEntityDtlVlStrgTyp() != null) {
			auditevententitydetail.setValue( new org.hl7.fhir.r4.model.StringType(a.getAuditEvntEntityDtlVlStrgTyp()));
		}
		/******************** auditevententitylifecycle ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententitylifecycle =  new org.hl7.fhir.r4.model.Coding();
		auditevententity.setLifecycle(auditevententitylifecycle);

		/******************** AuditEvnt_Entity_Lifecycle_Cd ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleCd() != null) {
			auditevententitylifecycle.setCode(a.getAuditEvntEntityLifecycleCd());
		}
		/******************** AuditEvnt_Entity_Lifecycle_Dsply ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleDsply() != null) {
			auditevententitylifecycle.setDisplay(a.getAuditEvntEntityLifecycleDsply());
		}
		/******************** AuditEvnt_Entity_Lifecycle_Sys ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleSys() != null) {
			auditevententitylifecycle.setSystem(a.getAuditEvntEntityLifecycleSys());
		}
		/******************** AuditEvnt_Entity_Lifecycle_UsrSltd ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleUsrSltd() != null) {
			auditevententitylifecycle.setUserSelected(Boolean.parseBoolean(a.getAuditEvntEntityLifecycleUsrSltd()));
		}
		/******************** AuditEvnt_Entity_Lifecycle_Vrsn ********************************************************************************/
		if(a.getAuditEvntEntityLifecycleVrsn() != null) {
			auditevententitylifecycle.setVersion(a.getAuditEvntEntityLifecycleVrsn());
		}
		/******************** AuditEvnt_Entity_Nm ********************************************************************************/
		if(a.getAuditEvntEntityNm() != null) {
			auditevententity.setName(a.getAuditEvntEntityNm());
		}
		/******************** AuditEvnt_Entity_Query ********************************************************************************/
		if(a.getAuditEvntEntityQuery() != null) {
			auditevententity.setQueryElement(new org.hl7.fhir.r4.model.Base64BinaryType(a.getAuditEvntEntityQuery()));
		}
		/******************** auditevententityrole ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententityrole =  new org.hl7.fhir.r4.model.Coding();
		auditevententity.setRole(auditevententityrole);

		/******************** AuditEvnt_Entity_Role_Cd ********************************************************************************/
		if(a.getAuditEvntEntityRoleCd() != null) {
			auditevententityrole.setCode(a.getAuditEvntEntityRoleCd());
		}
		/******************** AuditEvnt_Entity_Role_Dsply ********************************************************************************/
		if(a.getAuditEvntEntityRoleDsply() != null) {
			auditevententityrole.setDisplay(a.getAuditEvntEntityRoleDsply());
		}
		/******************** AuditEvnt_Entity_Role_Sys ********************************************************************************/
		if(a.getAuditEvntEntityRoleSys() != null) {
			auditevententityrole.setSystem(a.getAuditEvntEntityRoleSys());
		}
		/******************** AuditEvnt_Entity_Role_UsrSltd ********************************************************************************/
		if(a.getAuditEvntEntityRoleUsrSltd() != null) {
			auditevententityrole.setUserSelected(Boolean.parseBoolean(a.getAuditEvntEntityRoleUsrSltd()));
		}
		/******************** AuditEvnt_Entity_Role_Vrsn ********************************************************************************/
		if(a.getAuditEvntEntityRoleVrsn() != null) {
			auditevententityrole.setVersion(a.getAuditEvntEntityRoleVrsn());
		}
		/******************** auditevententitysecuritylabel ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententitysecuritylabel =  new org.hl7.fhir.r4.model.Coding();
		auditevententity.addSecurityLabel(auditevententitysecuritylabel);

		/******************** AuditEvnt_Entity_SecurityLbl_Cd ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblCd() != null) {
			auditevententitysecuritylabel.setCode(a.getAuditEvntEntitySecurityLblCd());
		}
		/******************** AuditEvnt_Entity_SecurityLbl_Dsply ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblDsply() != null) {
			auditevententitysecuritylabel.setDisplay(a.getAuditEvntEntitySecurityLblDsply());
		}
		/******************** AuditEvnt_Entity_SecurityLbl_Sys ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblSys() != null) {
			auditevententitysecuritylabel.setSystem(a.getAuditEvntEntitySecurityLblSys());
		}
		/******************** AuditEvnt_Entity_SecurityLbl_UsrSltd ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblUsrSltd() != null) {
			auditevententitysecuritylabel.setUserSelected(Boolean.parseBoolean(a.getAuditEvntEntitySecurityLblUsrSltd()));
		}
		/******************** AuditEvnt_Entity_SecurityLbl_Vrsn ********************************************************************************/
		if(a.getAuditEvntEntitySecurityLblVrsn() != null) {
			auditevententitysecuritylabel.setVersion(a.getAuditEvntEntitySecurityLblVrsn());
		}
		/******************** auditevententitytype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditevententitytype =  new org.hl7.fhir.r4.model.Coding();
		auditevententity.setType(auditevententitytype);

		/******************** AuditEvnt_Entity_Typ_Cd ********************************************************************************/
		if(a.getAuditEvntEntityTypCd() != null) {
			auditevententitytype.setCode(a.getAuditEvntEntityTypCd());
		}
		/******************** AuditEvnt_Entity_Typ_Dsply ********************************************************************************/
		if(a.getAuditEvntEntityTypDsply() != null) {
			auditevententitytype.setDisplay(a.getAuditEvntEntityTypDsply());
		}
		/******************** AuditEvnt_Entity_Typ_Sys ********************************************************************************/
		if(a.getAuditEvntEntityTypSys() != null) {
			auditevententitytype.setSystem(a.getAuditEvntEntityTypSys());
		}
		/******************** AuditEvnt_Entity_Typ_UsrSltd ********************************************************************************/
		if(a.getAuditEvntEntityTypUsrSltd() != null) {
			auditevententitytype.setUserSelected(Boolean.parseBoolean(a.getAuditEvntEntityTypUsrSltd()));
		}
		/******************** AuditEvnt_Entity_Typ_Vrsn ********************************************************************************/
		if(a.getAuditEvntEntityTypVrsn() != null) {
			auditevententitytype.setVersion(a.getAuditEvntEntityTypVrsn());
		}
		/******************** AuditEvnt_Entity_What ********************************************************************************/
		if(a.getAuditEvntEntityWhat() != null) {
			auditevententity.setWhat( new org.hl7.fhir.r4.model.Reference(a.getAuditEvntEntityWhat()));
		}
		/******************** auditeventoutcome ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventOutcomeEnumFactory auditeventoutcome =  new org.hl7.fhir.r4.model.AuditEvent.AuditEventOutcomeEnumFactory();
		auditevent.setOutcome(auditeventoutcome.fromCode(a.getAuditEvntOutcome()));

		/******************** AuditEvnt_OutcomeDesc ********************************************************************************/
		if(a.getAuditEvntOutcomeDesc() != null) {
			auditevent.setOutcomeDesc(a.getAuditEvntOutcomeDesc());
		}
		/******************** auditeventperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period auditeventperiod =  new org.hl7.fhir.r4.model.Period();
		auditevent.setPeriod(auditeventperiod);

		/******************** AuditEvnt_Prd_End ********************************************************************************/
		if(a.getAuditEvntPrdEnd() != null) {
			java.text.SimpleDateFormat AuditEvnt_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AuditEvnt_Prd_Enddate = AuditEvnt_Prd_Endsdf.parse(a.getAuditEvntPrdEnd());
			auditeventperiod.setEnd(AuditEvnt_Prd_Enddate);
		}
		/******************** AuditEvnt_Prd_Strt ********************************************************************************/
		if(a.getAuditEvntPrdStrt() != null) {
			java.text.SimpleDateFormat AuditEvnt_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AuditEvnt_Prd_Strtdate = AuditEvnt_Prd_Strtsdf.parse(a.getAuditEvntPrdStrt());
			auditeventperiod.setStart(AuditEvnt_Prd_Strtdate);
		}
		/******************** auditeventpurposeofevent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept auditeventpurposeofevent =  new org.hl7.fhir.r4.model.CodeableConcept();
		auditevent.addPurposeOfEvent(auditeventpurposeofevent);

		/******************** auditeventpurposeofeventcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventpurposeofeventcoding =  new org.hl7.fhir.r4.model.Coding();
		auditeventpurposeofevent.addCoding(auditeventpurposeofeventcoding);

		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Cd ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgCd() != null) {
			auditeventpurposeofeventcoding.setCode(a.getAuditEvntPrpseOfEvntCdgCd());
		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Dsply ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgDsply() != null) {
			auditeventpurposeofeventcoding.setDisplay(a.getAuditEvntPrpseOfEvntCdgDsply());
		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Sys ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgSys() != null) {
			auditeventpurposeofeventcoding.setSystem(a.getAuditEvntPrpseOfEvntCdgSys());
		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_UsrSltd ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgUsrSltd() != null) {
			auditeventpurposeofeventcoding.setUserSelected(Boolean.parseBoolean(a.getAuditEvntPrpseOfEvntCdgUsrSltd()));
		}
		/******************** AuditEvnt_PrpseOfEvnt_Cdg_Vrsn ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntCdgVrsn() != null) {
			auditeventpurposeofeventcoding.setVersion(a.getAuditEvntPrpseOfEvntCdgVrsn());
		}
		/******************** AuditEvnt_PrpseOfEvnt_Txt ********************************************************************************/
		if(a.getAuditEvntPrpseOfEvntTxt() != null) {
			auditeventpurposeofevent.setText(a.getAuditEvntPrpseOfEvntTxt());
		}
		/******************** AuditEvnt_Recorded ********************************************************************************/
		if(a.getAuditEvntRecorded() != null) {
			java.text.SimpleDateFormat AuditEvnt_Recordedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date AuditEvnt_Recordeddate = AuditEvnt_Recordedsdf.parse(a.getAuditEvntRecorded());
			auditevent.setRecorded(AuditEvnt_Recordeddate);
		}
		/******************** auditeventsource ********************************************************************************/
		org.hl7.fhir.r4.model.AuditEvent.AuditEventSourceComponent auditeventsource =  new org.hl7.fhir.r4.model.AuditEvent.AuditEventSourceComponent();
		auditevent.setSource(auditeventsource);

		/******************** AuditEvnt_Src_Observer ********************************************************************************/
		if(a.getAuditEvntSrcObserver() != null) {
			auditeventsource.setObserver( new org.hl7.fhir.r4.model.Reference(a.getAuditEvntSrcObserver()));
		}
		/******************** AuditEvnt_Src_Site ********************************************************************************/
		if(a.getAuditEvntSrcSite() != null) {
			auditeventsource.setSite(a.getAuditEvntSrcSite());
		}
		/******************** auditeventsourcetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventsourcetype =  new org.hl7.fhir.r4.model.Coding();
		auditeventsource.addType(auditeventsourcetype);

		/******************** AuditEvnt_Src_Typ_Cd ********************************************************************************/
		if(a.getAuditEvntSrcTypCd() != null) {
			auditeventsourcetype.setCode(a.getAuditEvntSrcTypCd());
		}
		/******************** AuditEvnt_Src_Typ_Dsply ********************************************************************************/
		if(a.getAuditEvntSrcTypDsply() != null) {
			auditeventsourcetype.setDisplay(a.getAuditEvntSrcTypDsply());
		}
		/******************** AuditEvnt_Src_Typ_Sys ********************************************************************************/
		if(a.getAuditEvntSrcTypSys() != null) {
			auditeventsourcetype.setSystem(a.getAuditEvntSrcTypSys());
		}
		/******************** AuditEvnt_Src_Typ_UsrSltd ********************************************************************************/
		if(a.getAuditEvntSrcTypUsrSltd() != null) {
			auditeventsourcetype.setUserSelected(Boolean.parseBoolean(a.getAuditEvntSrcTypUsrSltd()));
		}
		/******************** AuditEvnt_Src_Typ_Vrsn ********************************************************************************/
		if(a.getAuditEvntSrcTypVrsn() != null) {
			auditeventsourcetype.setVersion(a.getAuditEvntSrcTypVrsn());
		}
		/******************** auditeventsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventsubtype =  new org.hl7.fhir.r4.model.Coding();
		auditevent.addSubtype(auditeventsubtype);

		/******************** AuditEvnt_Subtype_Cd ********************************************************************************/
		if(a.getAuditEvntSubtypeCd() != null) {
			auditeventsubtype.setCode(a.getAuditEvntSubtypeCd());
		}
		/******************** AuditEvnt_Subtype_Dsply ********************************************************************************/
		if(a.getAuditEvntSubtypeDsply() != null) {
			auditeventsubtype.setDisplay(a.getAuditEvntSubtypeDsply());
		}
		/******************** AuditEvnt_Subtype_Sys ********************************************************************************/
		if(a.getAuditEvntSubtypeSys() != null) {
			auditeventsubtype.setSystem(a.getAuditEvntSubtypeSys());
		}
		/******************** AuditEvnt_Subtype_UsrSltd ********************************************************************************/
		if(a.getAuditEvntSubtypeUsrSltd() != null) {
			auditeventsubtype.setUserSelected(Boolean.parseBoolean(a.getAuditEvntSubtypeUsrSltd()));
		}
		/******************** AuditEvnt_Subtype_Vrsn ********************************************************************************/
		if(a.getAuditEvntSubtypeVrsn() != null) {
			auditeventsubtype.setVersion(a.getAuditEvntSubtypeVrsn());
		}
		/******************** auditeventtype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding auditeventtype =  new org.hl7.fhir.r4.model.Coding();
		auditevent.setType(auditeventtype);

		/******************** AuditEvnt_Typ_Cd ********************************************************************************/
		if(a.getAuditEvntTypCd() != null) {
			auditeventtype.setCode(a.getAuditEvntTypCd());
		}
		/******************** AuditEvnt_Typ_Dsply ********************************************************************************/
		if(a.getAuditEvntTypDsply() != null) {
			auditeventtype.setDisplay(a.getAuditEvntTypDsply());
		}
		/******************** AuditEvnt_Typ_Sys ********************************************************************************/
		if(a.getAuditEvntTypSys() != null) {
			auditeventtype.setSystem(a.getAuditEvntTypSys());
		}
		/******************** AuditEvnt_Typ_UsrSltd ********************************************************************************/
		if(a.getAuditEvntTypUsrSltd() != null) {
			auditeventtype.setUserSelected(Boolean.parseBoolean(a.getAuditEvntTypUsrSltd()));
		}
		/******************** AuditEvnt_Typ_Vrsn ********************************************************************************/
		if(a.getAuditEvntTypVrsn() != null) {
			auditeventtype.setVersion(a.getAuditEvntTypVrsn());
		}
		return auditevent;
	}
}
