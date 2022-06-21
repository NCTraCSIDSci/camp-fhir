package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Consent;
public class ConsentBidirectionalConversion 
{
	public Consent Consents(org.hl7.fhir.r4.model.Consent consent) throws ParseException
	{
		 main.java.com.campfhir.model.Consent c = new  main.java.com.campfhir.model.Consent();

		/******************** id ********************************************************************************/
		consent.setId(c.getId());

		/******************** consentprovision ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.provisionComponent consentprovision = consent.getProvision();

		/******************** consentprovisiontype ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentProvisionType consentprovisiontype = consentprovision.getType();
		c.setCnsntProvisionTyp(consentprovisiontype.toCode());

		/******************** consentprovisionaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentprovisionaction = consentprovision.getActionFirstRep();

		/******************** consentprovisionactioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionactioncoding = consentprovisionaction.getCodingFirstRep();

		/******************** Cnsnt_Provision_Actn_Cdg_Dsply ********************************************************************************/
		if(consentprovisionactioncoding.hasDisplay()) {
			c.setCnsntProvisionActnCdgDsply(String.valueOf(consentprovisionactioncoding.getDisplay()));
		}
		/******************** Cnsnt_Provision_Actn_Cdg_Vrsn ********************************************************************************/
		if(consentprovisionactioncoding.hasVersion()) {
			c.setCnsntProvisionActnCdgVrsn(String.valueOf(consentprovisionactioncoding.getVersion()));
		}
		/******************** Cnsnt_Provision_Actn_Cdg_Cd ********************************************************************************/
		if(consentprovisionactioncoding.hasCode()) {
			c.setCnsntProvisionActnCdgCd(String.valueOf(consentprovisionactioncoding.getCode()));
		}
		/******************** Cnsnt_Provision_Actn_Cdg_Sys ********************************************************************************/
		if(consentprovisionactioncoding.hasSystem()) {
			c.setCnsntProvisionActnCdgSys(String.valueOf(consentprovisionactioncoding.getSystem()));
		}
		/******************** Cnsnt_Provision_Actn_Cdg_UsrSltd ********************************************************************************/
		if(consentprovisionactioncoding.hasUserSelected()) {
			c.setCnsntProvisionActnCdgUsrSltd(String.valueOf(consentprovisionactioncoding.getUserSelected()));
		}
		/******************** Cnsnt_Provision_Actn_Txt ********************************************************************************/
		if(consentprovisionaction.hasText()) {
			c.setCnsntProvisionActnTxt(String.valueOf(consentprovisionaction.getText()));
		}
		/******************** consentprovisionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period consentprovisionperiod = consentprovision.getPeriod();

		/******************** Cnsnt_Provision_Prd_End ********************************************************************************/
		if(consentprovisionperiod.hasEnd()) {
			c.setCnsntProvisionPrdEnd(String.valueOf(consentprovisionperiod.getEnd()));
		}
		/******************** Cnsnt_Provision_Prd_Strt ********************************************************************************/
		if(consentprovisionperiod.hasStart()) {
			c.setCnsntProvisionPrdStrt(String.valueOf(consentprovisionperiod.getStart()));
		}
		/******************** consentprovisioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentprovisioncode = consentprovision.getCodeFirstRep();

		/******************** consentprovisioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisioncodecoding = consentprovisioncode.getCodingFirstRep();

		/******************** Cnsnt_Provision_Cd_Cdg_Dsply ********************************************************************************/
		if(consentprovisioncodecoding.hasDisplay()) {
			c.setCnsntProvisionCdCdgDsply(String.valueOf(consentprovisioncodecoding.getDisplay()));
		}
		/******************** Cnsnt_Provision_Cd_Cdg_Vrsn ********************************************************************************/
		if(consentprovisioncodecoding.hasVersion()) {
			c.setCnsntProvisionCdCdgVrsn(String.valueOf(consentprovisioncodecoding.getVersion()));
		}
		/******************** Cnsnt_Provision_Cd_Cdg_Cd ********************************************************************************/
		if(consentprovisioncodecoding.hasCode()) {
			c.setCnsntProvisionCdCdgCd(String.valueOf(consentprovisioncodecoding.getCode()));
		}
		/******************** Cnsnt_Provision_Cd_Cdg_Sys ********************************************************************************/
		if(consentprovisioncodecoding.hasSystem()) {
			c.setCnsntProvisionCdCdgSys(String.valueOf(consentprovisioncodecoding.getSystem()));
		}
		/******************** Cnsnt_Provision_Cd_Cdg_UsrSltd ********************************************************************************/
		if(consentprovisioncodecoding.hasUserSelected()) {
			c.setCnsntProvisionCdCdgUsrSltd(String.valueOf(consentprovisioncodecoding.getUserSelected()));
		}
		/******************** Cnsnt_Provision_Cd_Txt ********************************************************************************/
		if(consentprovisioncode.hasText()) {
			c.setCnsntProvisionCdTxt(String.valueOf(consentprovisioncode.getText()));
		}
		/******************** consentprovisiondata ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.provisionDataComponent consentprovisiondata = consentprovision.getDataFirstRep();

		/******************** Cnsnt_Provision_Data_Rfrnc ********************************************************************************/
		if(consentprovisiondata.hasReference()) {
			c.setCnsntProvisionDataRfrnc(String.valueOf(consentprovisiondata.getReference()));
		}
		/******************** consentprovisiondatameaning ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentDataMeaning consentprovisiondatameaning = consentprovisiondata.getMeaning();
		c.setCnsntProvisionDataMeaning(consentprovisiondatameaning.toCode());

		/******************** consentprovisionclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionclass = consentprovision.getClass_FirstRep();

		/******************** Cnsnt_Provision_Cls__Dsply ********************************************************************************/
		if(consentprovisionclass.hasDisplay()) {
			c.setCnsntProvisionClsDsply(String.valueOf(consentprovisionclass.getDisplay()));
		}
		/******************** Cnsnt_Provision_Cls__Vrsn ********************************************************************************/
		if(consentprovisionclass.hasVersion()) {
			c.setCnsntProvisionClsVrsn(String.valueOf(consentprovisionclass.getVersion()));
		}
		/******************** Cnsnt_Provision_Cls__Cd ********************************************************************************/
		if(consentprovisionclass.hasCode()) {
			c.setCnsntProvisionClsCd(String.valueOf(consentprovisionclass.getCode()));
		}
		/******************** Cnsnt_Provision_Cls__Sys ********************************************************************************/
		if(consentprovisionclass.hasSystem()) {
			c.setCnsntProvisionClsSys(String.valueOf(consentprovisionclass.getSystem()));
		}
		/******************** Cnsnt_Provision_Cls__UsrSltd ********************************************************************************/
		if(consentprovisionclass.hasUserSelected()) {
			c.setCnsntProvisionClsUsrSltd(String.valueOf(consentprovisionclass.getUserSelected()));
		}
		/******************** consentprovisionpurpose ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionpurpose = consentprovision.getPurposeFirstRep();

		/******************** Cnsnt_Provision_Prpse_Dsply ********************************************************************************/
		if(consentprovisionpurpose.hasDisplay()) {
			c.setCnsntProvisionPrpseDsply(String.valueOf(consentprovisionpurpose.getDisplay()));
		}
		/******************** Cnsnt_Provision_Prpse_Vrsn ********************************************************************************/
		if(consentprovisionpurpose.hasVersion()) {
			c.setCnsntProvisionPrpseVrsn(String.valueOf(consentprovisionpurpose.getVersion()));
		}
		/******************** Cnsnt_Provision_Prpse_Cd ********************************************************************************/
		if(consentprovisionpurpose.hasCode()) {
			c.setCnsntProvisionPrpseCd(String.valueOf(consentprovisionpurpose.getCode()));
		}
		/******************** Cnsnt_Provision_Prpse_Sys ********************************************************************************/
		if(consentprovisionpurpose.hasSystem()) {
			c.setCnsntProvisionPrpseSys(String.valueOf(consentprovisionpurpose.getSystem()));
		}
		/******************** Cnsnt_Provision_Prpse_UsrSltd ********************************************************************************/
		if(consentprovisionpurpose.hasUserSelected()) {
			c.setCnsntProvisionPrpseUsrSltd(String.valueOf(consentprovisionpurpose.getUserSelected()));
		}
		/******************** consentprovisiondataperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period consentprovisiondataperiod = consentprovision.getDataPeriod();

		/******************** Cnsnt_Provision_DataPrd_End ********************************************************************************/
		if(consentprovisiondataperiod.hasEnd()) {
			c.setCnsntProvisionDataPrdEnd(String.valueOf(consentprovisiondataperiod.getEnd()));
		}
		/******************** Cnsnt_Provision_DataPrd_Strt ********************************************************************************/
		if(consentprovisiondataperiod.hasStart()) {
			c.setCnsntProvisionDataPrdStrt(String.valueOf(consentprovisiondataperiod.getStart()));
		}
		/******************** consentprovisionactor ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.provisionActorComponent consentprovisionactor = consentprovision.getActorFirstRep();

		/******************** Cnsnt_Provision_Actor_Rfrnc ********************************************************************************/
		if(consentprovisionactor.hasReference()) {
			c.setCnsntProvisionActorRfrnc(String.valueOf(consentprovisionactor.getReference()));
		}
		/******************** consentprovisionactorrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentprovisionactorrole = consentprovisionactor.getRole();

		/******************** consentprovisionactorrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionactorrolecoding = consentprovisionactorrole.getCodingFirstRep();

		/******************** Cnsnt_Provision_Actor_Role_Cdg_Dsply ********************************************************************************/
		if(consentprovisionactorrolecoding.hasDisplay()) {
			c.setCnsntProvisionActorRoleCdgDsply(String.valueOf(consentprovisionactorrolecoding.getDisplay()));
		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Vrsn ********************************************************************************/
		if(consentprovisionactorrolecoding.hasVersion()) {
			c.setCnsntProvisionActorRoleCdgVrsn(String.valueOf(consentprovisionactorrolecoding.getVersion()));
		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Cd ********************************************************************************/
		if(consentprovisionactorrolecoding.hasCode()) {
			c.setCnsntProvisionActorRoleCdgCd(String.valueOf(consentprovisionactorrolecoding.getCode()));
		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Sys ********************************************************************************/
		if(consentprovisionactorrolecoding.hasSystem()) {
			c.setCnsntProvisionActorRoleCdgSys(String.valueOf(consentprovisionactorrolecoding.getSystem()));
		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_UsrSltd ********************************************************************************/
		if(consentprovisionactorrolecoding.hasUserSelected()) {
			c.setCnsntProvisionActorRoleCdgUsrSltd(String.valueOf(consentprovisionactorrolecoding.getUserSelected()));
		}
		/******************** Cnsnt_Provision_Actor_Role_Txt ********************************************************************************/
		if(consentprovisionactorrole.hasText()) {
			c.setCnsntProvisionActorRoleTxt(String.valueOf(consentprovisionactorrole.getText()));
		}
		/******************** consentprovisionsecuritylabel ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionsecuritylabel = consentprovision.getSecurityLabelFirstRep();

		/******************** Cnsnt_Provision_SecurityLbl_Dsply ********************************************************************************/
		if(consentprovisionsecuritylabel.hasDisplay()) {
			c.setCnsntProvisionSecurityLblDsply(String.valueOf(consentprovisionsecuritylabel.getDisplay()));
		}
		/******************** Cnsnt_Provision_SecurityLbl_Vrsn ********************************************************************************/
		if(consentprovisionsecuritylabel.hasVersion()) {
			c.setCnsntProvisionSecurityLblVrsn(String.valueOf(consentprovisionsecuritylabel.getVersion()));
		}
		/******************** Cnsnt_Provision_SecurityLbl_Cd ********************************************************************************/
		if(consentprovisionsecuritylabel.hasCode()) {
			c.setCnsntProvisionSecurityLblCd(String.valueOf(consentprovisionsecuritylabel.getCode()));
		}
		/******************** Cnsnt_Provision_SecurityLbl_Sys ********************************************************************************/
		if(consentprovisionsecuritylabel.hasSystem()) {
			c.setCnsntProvisionSecurityLblSys(String.valueOf(consentprovisionsecuritylabel.getSystem()));
		}
		/******************** Cnsnt_Provision_SecurityLbl_UsrSltd ********************************************************************************/
		if(consentprovisionsecuritylabel.hasUserSelected()) {
			c.setCnsntProvisionSecurityLblUsrSltd(String.valueOf(consentprovisionsecuritylabel.getUserSelected()));
		}
		/******************** Cnsnt_Orgnztn ********************************************************************************/
		if(consent.hasOrganization()) {
			c.setCnsntOrgnztn(String.valueOf(consent.getOrganizationFirstRep()));
		}
		/******************** consentsourceattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment consentsourceattachment = consent.getSourceAttachment();

		/******************** Cnsnt_SrcAttchmnt_Sz ********************************************************************************/
		if(consentsourceattachment.hasSize()) {
			c.setCnsntSrcAttchmntSz(String.valueOf(consentsourceattachment.getSize()));
		}
		/******************** Cnsnt_SrcAttchmnt_Lnguage ********************************************************************************/
		if(consentsourceattachment.hasLanguage()) {
			c.setCnsntSrcAttchmntLnguage(String.valueOf(consentsourceattachment.getLanguage()));
		}
		/******************** Cnsnt_SrcAttchmnt_CntntTyp ********************************************************************************/
		if(consentsourceattachment.hasContentType()) {
			c.setCnsntSrcAttchmntCntntTyp(String.valueOf(consentsourceattachment.getContentType()));
		}
		/******************** Cnsnt_SrcAttchmnt_Url ********************************************************************************/
		if(consentsourceattachment.hasUrl()) {
			c.setCnsntSrcAttchmntUrl(String.valueOf(consentsourceattachment.getUrl()));
		}
		/******************** Cnsnt_SrcAttchmnt_Ttl ********************************************************************************/
		if(consentsourceattachment.hasTitle()) {
			c.setCnsntSrcAttchmntTtl(String.valueOf(consentsourceattachment.getTitle()));
		}
		/******************** Cnsnt_SrcAttchmnt_Hash ********************************************************************************/
		if(consentsourceattachment.hasHash()) {
			c.setCnsntSrcAttchmntHash(String.valueOf(consentsourceattachment.getHash()));
		}

		/******************** Cnsnt_SrcAttchmnt_Data ********************************************************************************/
		if(consentsourceattachment.hasData()) {
			c.setCnsntSrcAttchmntData(String.valueOf(consentsourceattachment.getData()));
		}

		/******************** Cnsnt_SrcAttchmnt_Creation ********************************************************************************/
		if(consentsourceattachment.hasCreation()) {
			c.setCnsntSrcAttchmntCreation(String.valueOf(consentsourceattachment.getCreation()));
		}
		/******************** consentverification ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentVerificationComponent consentverification = consent.getVerificationFirstRep();

		/******************** Cnsnt_Vrfctn_Verified ********************************************************************************/
		if(consentverification.hasVerified()) {
			c.setCnsntVrfctnVerified(String.valueOf(consentverification.getVerified()));
		}
		/******************** Cnsnt_Vrfctn_VerifiedWith ********************************************************************************/
		if(consentverification.hasVerifiedWith()) {
			c.setCnsntVrfctnVerifiedWith(String.valueOf(consentverification.getVerifiedWith()));
		}
		/******************** Cnsnt_Prfrmr ********************************************************************************/
		if(consent.hasPerformer()) {
			c.setCnsntPrfrmr(String.valueOf(consent.getPerformerFirstRep()));
		}
		/******************** consentpolicy ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentPolicyComponent consentpolicy = consent.getPolicyFirstRep();

		/******************** Cnsnt_Policy_Athrity ********************************************************************************/
		if(consentpolicy.hasAuthority()) {
			c.setCnsntPolicyAthrity(String.valueOf(consentpolicy.getAuthority()));
		}
		/******************** Cnsnt_Policy_Uri ********************************************************************************/
		if(consentpolicy.hasUri()) {
			c.setCnsntPolicyUri(String.valueOf(consentpolicy.getUri()));
		}
		/******************** Cnsnt_SrcRfrnc ********************************************************************************/
		if(consent.hasSourceReference()) {
			c.setCnsntSrcRfrnc(String.valueOf(consent.getSourceReference()));
		}
		/******************** consentpolicyrule ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentpolicyrule = consent.getPolicyRule();

		/******************** consentpolicyrulecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentpolicyrulecoding = consentpolicyrule.getCodingFirstRep();

		/******************** Cnsnt_PolicyRule_Cdg_Dsply ********************************************************************************/
		if(consentpolicyrulecoding.hasDisplay()) {
			c.setCnsntPolicyRuleCdgDsply(String.valueOf(consentpolicyrulecoding.getDisplay()));
		}
		/******************** Cnsnt_PolicyRule_Cdg_Vrsn ********************************************************************************/
		if(consentpolicyrulecoding.hasVersion()) {
			c.setCnsntPolicyRuleCdgVrsn(String.valueOf(consentpolicyrulecoding.getVersion()));
		}
		/******************** Cnsnt_PolicyRule_Cdg_Cd ********************************************************************************/
		if(consentpolicyrulecoding.hasCode()) {
			c.setCnsntPolicyRuleCdgCd(String.valueOf(consentpolicyrulecoding.getCode()));
		}
		/******************** Cnsnt_PolicyRule_Cdg_Sys ********************************************************************************/
		if(consentpolicyrulecoding.hasSystem()) {
			c.setCnsntPolicyRuleCdgSys(String.valueOf(consentpolicyrulecoding.getSystem()));
		}
		/******************** Cnsnt_PolicyRule_Cdg_UsrSltd ********************************************************************************/
		if(consentpolicyrulecoding.hasUserSelected()) {
			c.setCnsntPolicyRuleCdgUsrSltd(String.valueOf(consentpolicyrulecoding.getUserSelected()));
		}
		/******************** Cnsnt_PolicyRule_Txt ********************************************************************************/
		if(consentpolicyrule.hasText()) {
			c.setCnsntPolicyRuleTxt(String.valueOf(consentpolicyrule.getText()));
		}
		/******************** consentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentState consentstatus = consent.getStatus();
		c.setCnsntSts(consentstatus.toCode());

		/******************** consentscope ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentscope = consent.getScope();

		/******************** consentscopecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentscopecoding = consentscope.getCodingFirstRep();

		/******************** Cnsnt_Scope_Cdg_Dsply ********************************************************************************/
		if(consentscopecoding.hasDisplay()) {
			c.setCnsntScopeCdgDsply(String.valueOf(consentscopecoding.getDisplay()));
		}
		/******************** Cnsnt_Scope_Cdg_Vrsn ********************************************************************************/
		if(consentscopecoding.hasVersion()) {
			c.setCnsntScopeCdgVrsn(String.valueOf(consentscopecoding.getVersion()));
		}
		/******************** Cnsnt_Scope_Cdg_Cd ********************************************************************************/
		if(consentscopecoding.hasCode()) {
			c.setCnsntScopeCdgCd(String.valueOf(consentscopecoding.getCode()));
		}
		/******************** Cnsnt_Scope_Cdg_Sys ********************************************************************************/
		if(consentscopecoding.hasSystem()) {
			c.setCnsntScopeCdgSys(String.valueOf(consentscopecoding.getSystem()));
		}
		/******************** Cnsnt_Scope_Cdg_UsrSltd ********************************************************************************/
		if(consentscopecoding.hasUserSelected()) {
			c.setCnsntScopeCdgUsrSltd(String.valueOf(consentscopecoding.getUserSelected()));
		}
		/******************** Cnsnt_Scope_Txt ********************************************************************************/
		if(consentscope.hasText()) {
			c.setCnsntScopeTxt(String.valueOf(consentscope.getText()));
		}
		/******************** Cnsnt_Pnt ********************************************************************************/
		if(consent.hasPatient()) {
			c.setCnsntPnt(String.valueOf(consent.getPatient()));
		}
		/******************** consentcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentcategory = consent.getCategoryFirstRep();

		/******************** consentcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentcategorycoding = consentcategory.getCodingFirstRep();

		/******************** Cnsnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(consentcategorycoding.hasDisplay()) {
			c.setCnsntCtgryCdgDsply(String.valueOf(consentcategorycoding.getDisplay()));
		}
		/******************** Cnsnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(consentcategorycoding.hasVersion()) {
			c.setCnsntCtgryCdgVrsn(String.valueOf(consentcategorycoding.getVersion()));
		}
		/******************** Cnsnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(consentcategorycoding.hasCode()) {
			c.setCnsntCtgryCdgCd(String.valueOf(consentcategorycoding.getCode()));
		}
		/******************** Cnsnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(consentcategorycoding.hasSystem()) {
			c.setCnsntCtgryCdgSys(String.valueOf(consentcategorycoding.getSystem()));
		}
		/******************** Cnsnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(consentcategorycoding.hasUserSelected()) {
			c.setCnsntCtgryCdgUsrSltd(String.valueOf(consentcategorycoding.getUserSelected()));
		}
		/******************** Cnsnt_Ctgry_Txt ********************************************************************************/
		if(consentcategory.hasText()) {
			c.setCnsntCtgryTxt(String.valueOf(consentcategory.getText()));
		}
		/******************** Cnsnt_DtTime ********************************************************************************/
		if(consent.hasDateTime()) {
			c.setCnsntDtTime(String.valueOf(consent.getDateTime()));
		}
		/******************** consentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier consentidentifier = consent.getIdentifierFirstRep();

		/******************** Cnsnt_Id_Vl ********************************************************************************/
		if(consentidentifier.hasValue()) {
			c.setCnsntIdVl(String.valueOf(consentidentifier.getValue()));
		}
		/******************** consentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentidentifiertype = consentidentifier.getType();

		/******************** consentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentidentifiertypecoding = consentidentifiertype.getCodingFirstRep();

		/******************** Cnsnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(consentidentifiertypecoding.hasDisplay()) {
			c.setCnsntIdTypCdgDsply(String.valueOf(consentidentifiertypecoding.getDisplay()));
		}
		/******************** Cnsnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(consentidentifiertypecoding.hasVersion()) {
			c.setCnsntIdTypCdgVrsn(String.valueOf(consentidentifiertypecoding.getVersion()));
		}
		/******************** Cnsnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(consentidentifiertypecoding.hasCode()) {
			c.setCnsntIdTypCdgCd(String.valueOf(consentidentifiertypecoding.getCode()));
		}
		/******************** Cnsnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(consentidentifiertypecoding.hasSystem()) {
			c.setCnsntIdTypCdgSys(String.valueOf(consentidentifiertypecoding.getSystem()));
		}
		/******************** Cnsnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(consentidentifiertypecoding.hasUserSelected()) {
			c.setCnsntIdTypCdgUsrSltd(String.valueOf(consentidentifiertypecoding.getUserSelected()));
		}
		/******************** Cnsnt_Id_Typ_Txt ********************************************************************************/
		if(consentidentifiertype.hasText()) {
			c.setCnsntIdTypTxt(String.valueOf(consentidentifiertype.getText()));
		}
		/******************** Cnsnt_Id_Sys ********************************************************************************/
		if(consentidentifier.hasSystem()) {
			c.setCnsntIdSys(String.valueOf(consentidentifier.getSystem()));
		}
		/******************** Cnsnt_Id_Assigner ********************************************************************************/
		if(consentidentifier.hasAssigner()) {
			c.setCnsntIdAssigner(String.valueOf(consentidentifier.getAssigner()));
		}
		/******************** consentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period consentidentifierperiod = consentidentifier.getPeriod();

		/******************** Cnsnt_Id_Prd_End ********************************************************************************/
		if(consentidentifierperiod.hasEnd()) {
			c.setCnsntIdPrdEnd(String.valueOf(consentidentifierperiod.getEnd()));
		}
		/******************** Cnsnt_Id_Prd_Strt ********************************************************************************/
		if(consentidentifierperiod.hasStart()) {
			c.setCnsntIdPrdStrt(String.valueOf(consentidentifierperiod.getStart()));
		}
		/******************** consentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse consentidentifieruse = consentidentifier.getUse();
		c.setCnsntIdUse(consentidentifieruse.toCode());

		return c;
	}
}
