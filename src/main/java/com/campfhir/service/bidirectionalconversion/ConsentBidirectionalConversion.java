package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Consent;
public class ConsentBidirectionalConversion 
{
	public Consent Consents(org.hl7.fhir.r4.model.Consent consent) throws ParseException
	{
		 main.java.com.campfhir.model.Consent c = new  main.java.com.campfhir.model.Consent();

		/******************** id ********************************************************************************/
		c.setId(consent.getIdElement().getIdPart());

		/******************** consentprovision ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.provisionComponent consentprovision = consent.getProvision();

		/******************** consentprovisiontype ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentProvisionType consentprovisiontype = consentprovision.getType();
		if(consentprovisiontype!=null) {
			c.addCnsntProvisionTyp(consentprovisiontype.toCode());
		} else {
			c.addCnsntProvisionTyp("NULL");
		}

		/******************** consentprovisionaction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> consentprovisionactionlist = consentprovision.getAction();
		for(int consentprovisionactioni = 0; consentprovisionactioni<consentprovisionactionlist.size();consentprovisionactioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  consentprovisionaction = consentprovisionactionlist.get(consentprovisionactioni);

		/******************** Cnsnt_Provision_Actn_Txt ********************************************************************************/
		if(consentprovisionactioni == 0) {c.addCnsntProvisionActnTxt("[");}
		if(consentprovisionaction.hasText()) {

			c.addCnsntProvisionActnTxt(String.valueOf(consentprovisionaction.getText()));
		} else {
			c.addCnsntProvisionActnTxt("NULL");
		}

		if(consentprovisionactioni == consentprovisionactionlist.size()-1) {c.addCnsntProvisionActnTxt("]");}


		/******************** consentprovisionactioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentprovisionactioncodinglist = consentprovisionaction.getCoding();
		for(int consentprovisionactioncodingi = 0; consentprovisionactioncodingi<consentprovisionactioncodinglist.size();consentprovisionactioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  consentprovisionactioncoding = consentprovisionactioncodinglist.get(consentprovisionactioncodingi);

		/******************** Cnsnt_Provision_Actn_Cdg_Dsply ********************************************************************************/
		if(consentprovisionactioncodingi == 0) {c.addCnsntProvisionActnCdgDsply("[[");}
		if(consentprovisionactioncoding.hasDisplay()) {

			c.addCnsntProvisionActnCdgDsply(String.valueOf(consentprovisionactioncoding.getDisplay()));
		} else {
			c.addCnsntProvisionActnCdgDsply("NULL");
		}

		if(consentprovisionactioncodingi == consentprovisionactioncodinglist.size()-1) {c.addCnsntProvisionActnCdgDsply("]]");}


		/******************** Cnsnt_Provision_Actn_Cdg_Vrsn ********************************************************************************/
		if(consentprovisionactioncodingi == 0) {c.addCnsntProvisionActnCdgVrsn("[[");}
		if(consentprovisionactioncoding.hasVersion()) {

			c.addCnsntProvisionActnCdgVrsn(String.valueOf(consentprovisionactioncoding.getVersion()));
		} else {
			c.addCnsntProvisionActnCdgVrsn("NULL");
		}

		if(consentprovisionactioncodingi == consentprovisionactioncodinglist.size()-1) {c.addCnsntProvisionActnCdgVrsn("]]");}


		/******************** Cnsnt_Provision_Actn_Cdg_Cd ********************************************************************************/
		if(consentprovisionactioncodingi == 0) {c.addCnsntProvisionActnCdgCd("[[");}
		if(consentprovisionactioncoding.hasCode()) {

			c.addCnsntProvisionActnCdgCd(String.valueOf(consentprovisionactioncoding.getCode()));
		} else {
			c.addCnsntProvisionActnCdgCd("NULL");
		}

		if(consentprovisionactioncodingi == consentprovisionactioncodinglist.size()-1) {c.addCnsntProvisionActnCdgCd("]]");}


		/******************** Cnsnt_Provision_Actn_Cdg_UsrSltd ********************************************************************************/
		if(consentprovisionactioncodingi == 0) {c.addCnsntProvisionActnCdgUsrSltd("[[");}
		if(consentprovisionactioncoding.hasUserSelected()) {

			c.addCnsntProvisionActnCdgUsrSltd(String.valueOf(consentprovisionactioncoding.getUserSelected()));
		} else {
			c.addCnsntProvisionActnCdgUsrSltd("NULL");
		}

		if(consentprovisionactioncodingi == consentprovisionactioncodinglist.size()-1) {c.addCnsntProvisionActnCdgUsrSltd("]]");}


		/******************** Cnsnt_Provision_Actn_Cdg_Sys ********************************************************************************/
		if(consentprovisionactioncodingi == 0) {c.addCnsntProvisionActnCdgSys("[[");}
		if(consentprovisionactioncoding.hasSystem()) {

			c.addCnsntProvisionActnCdgSys(String.valueOf(consentprovisionactioncoding.getSystem()));
		} else {
			c.addCnsntProvisionActnCdgSys("NULL");
		}

		if(consentprovisionactioncodingi == consentprovisionactioncodinglist.size()-1) {c.addCnsntProvisionActnCdgSys("]]");}


		 };
		 };
		/******************** consentprovisioncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> consentprovisioncodelist = consentprovision.getCode();
		for(int consentprovisioncodei = 0; consentprovisioncodei<consentprovisioncodelist.size();consentprovisioncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  consentprovisioncode = consentprovisioncodelist.get(consentprovisioncodei);

		/******************** Cnsnt_Provision_Cd_Txt ********************************************************************************/
		if(consentprovisioncodei == 0) {c.addCnsntProvisionCdTxt("[");}
		if(consentprovisioncode.hasText()) {

			c.addCnsntProvisionCdTxt(String.valueOf(consentprovisioncode.getText()));
		} else {
			c.addCnsntProvisionCdTxt("NULL");
		}

		if(consentprovisioncodei == consentprovisioncodelist.size()-1) {c.addCnsntProvisionCdTxt("]");}


		/******************** consentprovisioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentprovisioncodecodinglist = consentprovisioncode.getCoding();
		for(int consentprovisioncodecodingi = 0; consentprovisioncodecodingi<consentprovisioncodecodinglist.size();consentprovisioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  consentprovisioncodecoding = consentprovisioncodecodinglist.get(consentprovisioncodecodingi);

		/******************** Cnsnt_Provision_Cd_Cdg_Dsply ********************************************************************************/
		if(consentprovisioncodecodingi == 0) {c.addCnsntProvisionCdCdgDsply("[[");}
		if(consentprovisioncodecoding.hasDisplay()) {

			c.addCnsntProvisionCdCdgDsply(String.valueOf(consentprovisioncodecoding.getDisplay()));
		} else {
			c.addCnsntProvisionCdCdgDsply("NULL");
		}

		if(consentprovisioncodecodingi == consentprovisioncodecodinglist.size()-1) {c.addCnsntProvisionCdCdgDsply("]]");}


		/******************** Cnsnt_Provision_Cd_Cdg_Vrsn ********************************************************************************/
		if(consentprovisioncodecodingi == 0) {c.addCnsntProvisionCdCdgVrsn("[[");}
		if(consentprovisioncodecoding.hasVersion()) {

			c.addCnsntProvisionCdCdgVrsn(String.valueOf(consentprovisioncodecoding.getVersion()));
		} else {
			c.addCnsntProvisionCdCdgVrsn("NULL");
		}

		if(consentprovisioncodecodingi == consentprovisioncodecodinglist.size()-1) {c.addCnsntProvisionCdCdgVrsn("]]");}


		/******************** Cnsnt_Provision_Cd_Cdg_Cd ********************************************************************************/
		if(consentprovisioncodecodingi == 0) {c.addCnsntProvisionCdCdgCd("[[");}
		if(consentprovisioncodecoding.hasCode()) {

			c.addCnsntProvisionCdCdgCd(String.valueOf(consentprovisioncodecoding.getCode()));
		} else {
			c.addCnsntProvisionCdCdgCd("NULL");
		}

		if(consentprovisioncodecodingi == consentprovisioncodecodinglist.size()-1) {c.addCnsntProvisionCdCdgCd("]]");}


		/******************** Cnsnt_Provision_Cd_Cdg_UsrSltd ********************************************************************************/
		if(consentprovisioncodecodingi == 0) {c.addCnsntProvisionCdCdgUsrSltd("[[");}
		if(consentprovisioncodecoding.hasUserSelected()) {

			c.addCnsntProvisionCdCdgUsrSltd(String.valueOf(consentprovisioncodecoding.getUserSelected()));
		} else {
			c.addCnsntProvisionCdCdgUsrSltd("NULL");
		}

		if(consentprovisioncodecodingi == consentprovisioncodecodinglist.size()-1) {c.addCnsntProvisionCdCdgUsrSltd("]]");}


		/******************** Cnsnt_Provision_Cd_Cdg_Sys ********************************************************************************/
		if(consentprovisioncodecodingi == 0) {c.addCnsntProvisionCdCdgSys("[[");}
		if(consentprovisioncodecoding.hasSystem()) {

			c.addCnsntProvisionCdCdgSys(String.valueOf(consentprovisioncodecoding.getSystem()));
		} else {
			c.addCnsntProvisionCdCdgSys("NULL");
		}

		if(consentprovisioncodecodingi == consentprovisioncodecodinglist.size()-1) {c.addCnsntProvisionCdCdgSys("]]");}


		 };
		 };
		/******************** consentprovisionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period consentprovisionperiod = consentprovision.getPeriod();

		/******************** Cnsnt_Provision_Prd_Strt ********************************************************************************/
		if(consentprovisionperiod.hasStart()) {

			c.addCnsntProvisionPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(consentprovisionperiod.getStart())+"\"");
		} else {
			c.addCnsntProvisionPrdStrt("NULL");
		}


		/******************** Cnsnt_Provision_Prd_End ********************************************************************************/
		if(consentprovisionperiod.hasEnd()) {

			c.addCnsntProvisionPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(consentprovisionperiod.getEnd())+"\"");
		} else {
			c.addCnsntProvisionPrdEnd("NULL");
		}


		/******************** consentprovisiondata ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Consent.provisionDataComponent> consentprovisiondatalist = consentprovision.getData();
		for(int consentprovisiondatai = 0; consentprovisiondatai<consentprovisiondatalist.size();consentprovisiondatai++ ) {
		org.hl7.fhir.r4.model.Consent.provisionDataComponent  consentprovisiondata = consentprovisiondatalist.get(consentprovisiondatai);

		/******************** Cnsnt_Provision_Data_Rfrnc ********************************************************************************/
		if(consentprovisiondatai == 0) {c.addCnsntProvisionDataRfrnc("[");}
		if(consentprovisiondata.hasReference()) {

			if(consentprovisiondata.getReference().getReference() != null) {
			c.addCnsntProvisionDataRfrnc(consentprovisiondata.getReference().getReference());
			}
		} else {
			c.addCnsntProvisionDataRfrnc("NULL");
		}

		if(consentprovisiondatai == consentprovisiondatalist.size()-1) {c.addCnsntProvisionDataRfrnc("]");}


		/******************** consentprovisiondatameaning ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentDataMeaning consentprovisiondatameaning = consentprovisiondata.getMeaning();
		if(consentprovisiondatameaning!=null) {
		if(consentprovisiondatai == 0) {

		c.addCnsntProvisionDataMeaning("[");		}
			c.addCnsntProvisionDataMeaning(consentprovisiondatameaning.toCode());
		if(consentprovisiondatai == consentprovisiondatalist.size()-1) {

		c.addCnsntProvisionDataMeaning("]");		}

		} else {
			c.addCnsntProvisionDataMeaning("NULL");
		}

		 };
		/******************** consentprovisionpurpose ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentprovisionpurposelist = consentprovision.getPurpose();
		for(int consentprovisionpurposei = 0; consentprovisionpurposei<consentprovisionpurposelist.size();consentprovisionpurposei++ ) {
		org.hl7.fhir.r4.model.Coding  consentprovisionpurpose = consentprovisionpurposelist.get(consentprovisionpurposei);

		/******************** Cnsnt_Provision_Prpse_Dsply ********************************************************************************/
		if(consentprovisionpurposei == 0) {c.addCnsntProvisionPrpseDsply("[");}
		if(consentprovisionpurpose.hasDisplay()) {

			c.addCnsntProvisionPrpseDsply(String.valueOf(consentprovisionpurpose.getDisplay()));
		} else {
			c.addCnsntProvisionPrpseDsply("NULL");
		}

		if(consentprovisionpurposei == consentprovisionpurposelist.size()-1) {c.addCnsntProvisionPrpseDsply("]");}


		/******************** Cnsnt_Provision_Prpse_Vrsn ********************************************************************************/
		if(consentprovisionpurposei == 0) {c.addCnsntProvisionPrpseVrsn("[");}
		if(consentprovisionpurpose.hasVersion()) {

			c.addCnsntProvisionPrpseVrsn(String.valueOf(consentprovisionpurpose.getVersion()));
		} else {
			c.addCnsntProvisionPrpseVrsn("NULL");
		}

		if(consentprovisionpurposei == consentprovisionpurposelist.size()-1) {c.addCnsntProvisionPrpseVrsn("]");}


		/******************** Cnsnt_Provision_Prpse_Cd ********************************************************************************/
		if(consentprovisionpurposei == 0) {c.addCnsntProvisionPrpseCd("[");}
		if(consentprovisionpurpose.hasCode()) {

			c.addCnsntProvisionPrpseCd(String.valueOf(consentprovisionpurpose.getCode()));
		} else {
			c.addCnsntProvisionPrpseCd("NULL");
		}

		if(consentprovisionpurposei == consentprovisionpurposelist.size()-1) {c.addCnsntProvisionPrpseCd("]");}


		/******************** Cnsnt_Provision_Prpse_UsrSltd ********************************************************************************/
		if(consentprovisionpurposei == 0) {c.addCnsntProvisionPrpseUsrSltd("[");}
		if(consentprovisionpurpose.hasUserSelected()) {

			c.addCnsntProvisionPrpseUsrSltd(String.valueOf(consentprovisionpurpose.getUserSelected()));
		} else {
			c.addCnsntProvisionPrpseUsrSltd("NULL");
		}

		if(consentprovisionpurposei == consentprovisionpurposelist.size()-1) {c.addCnsntProvisionPrpseUsrSltd("]");}


		/******************** Cnsnt_Provision_Prpse_Sys ********************************************************************************/
		if(consentprovisionpurposei == 0) {c.addCnsntProvisionPrpseSys("[");}
		if(consentprovisionpurpose.hasSystem()) {

			c.addCnsntProvisionPrpseSys(String.valueOf(consentprovisionpurpose.getSystem()));
		} else {
			c.addCnsntProvisionPrpseSys("NULL");
		}

		if(consentprovisionpurposei == consentprovisionpurposelist.size()-1) {c.addCnsntProvisionPrpseSys("]");}


		 };
		/******************** consentprovisionactor ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Consent.provisionActorComponent> consentprovisionactorlist = consentprovision.getActor();
		for(int consentprovisionactori = 0; consentprovisionactori<consentprovisionactorlist.size();consentprovisionactori++ ) {
		org.hl7.fhir.r4.model.Consent.provisionActorComponent  consentprovisionactor = consentprovisionactorlist.get(consentprovisionactori);

		/******************** Cnsnt_Provision_Actor_Rfrnc ********************************************************************************/
		if(consentprovisionactori == 0) {c.addCnsntProvisionActorRfrnc("[");}
		if(consentprovisionactor.hasReference()) {

			if(consentprovisionactor.getReference().getReference() != null) {
			c.addCnsntProvisionActorRfrnc(consentprovisionactor.getReference().getReference());
			}
		} else {
			c.addCnsntProvisionActorRfrnc("NULL");
		}

		if(consentprovisionactori == consentprovisionactorlist.size()-1) {c.addCnsntProvisionActorRfrnc("]");}


		/******************** consentprovisionactorrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentprovisionactorrole = consentprovisionactor.getRole();

		/******************** Cnsnt_Provision_Actor_Role_Txt ********************************************************************************/
		if(consentprovisionactori == 0) {c.addCnsntProvisionActorRoleTxt("[");}
		if(consentprovisionactorrole.hasText()) {

			c.addCnsntProvisionActorRoleTxt(String.valueOf(consentprovisionactorrole.getText()));
		} else {
			c.addCnsntProvisionActorRoleTxt("NULL");
		}

		if(consentprovisionactori == consentprovisionactorlist.size()-1) {c.addCnsntProvisionActorRoleTxt("]");}


		/******************** consentprovisionactorrolecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentprovisionactorrolecodinglist = consentprovisionactorrole.getCoding();
		for(int consentprovisionactorrolecodingi = 0; consentprovisionactorrolecodingi<consentprovisionactorrolecodinglist.size();consentprovisionactorrolecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  consentprovisionactorrolecoding = consentprovisionactorrolecodinglist.get(consentprovisionactorrolecodingi);

		/******************** Cnsnt_Provision_Actor_Role_Cdg_Dsply ********************************************************************************/
		if(consentprovisionactorrolecodingi == 0) {c.addCnsntProvisionActorRoleCdgDsply("[[");}
		if(consentprovisionactorrolecoding.hasDisplay()) {

			c.addCnsntProvisionActorRoleCdgDsply(String.valueOf(consentprovisionactorrolecoding.getDisplay()));
		} else {
			c.addCnsntProvisionActorRoleCdgDsply("NULL");
		}

		if(consentprovisionactorrolecodingi == consentprovisionactorrolecodinglist.size()-1) {c.addCnsntProvisionActorRoleCdgDsply("]]");}


		/******************** Cnsnt_Provision_Actor_Role_Cdg_Vrsn ********************************************************************************/
		if(consentprovisionactorrolecodingi == 0) {c.addCnsntProvisionActorRoleCdgVrsn("[[");}
		if(consentprovisionactorrolecoding.hasVersion()) {

			c.addCnsntProvisionActorRoleCdgVrsn(String.valueOf(consentprovisionactorrolecoding.getVersion()));
		} else {
			c.addCnsntProvisionActorRoleCdgVrsn("NULL");
		}

		if(consentprovisionactorrolecodingi == consentprovisionactorrolecodinglist.size()-1) {c.addCnsntProvisionActorRoleCdgVrsn("]]");}


		/******************** Cnsnt_Provision_Actor_Role_Cdg_Cd ********************************************************************************/
		if(consentprovisionactorrolecodingi == 0) {c.addCnsntProvisionActorRoleCdgCd("[[");}
		if(consentprovisionactorrolecoding.hasCode()) {

			c.addCnsntProvisionActorRoleCdgCd(String.valueOf(consentprovisionactorrolecoding.getCode()));
		} else {
			c.addCnsntProvisionActorRoleCdgCd("NULL");
		}

		if(consentprovisionactorrolecodingi == consentprovisionactorrolecodinglist.size()-1) {c.addCnsntProvisionActorRoleCdgCd("]]");}


		/******************** Cnsnt_Provision_Actor_Role_Cdg_UsrSltd ********************************************************************************/
		if(consentprovisionactorrolecodingi == 0) {c.addCnsntProvisionActorRoleCdgUsrSltd("[[");}
		if(consentprovisionactorrolecoding.hasUserSelected()) {

			c.addCnsntProvisionActorRoleCdgUsrSltd(String.valueOf(consentprovisionactorrolecoding.getUserSelected()));
		} else {
			c.addCnsntProvisionActorRoleCdgUsrSltd("NULL");
		}

		if(consentprovisionactorrolecodingi == consentprovisionactorrolecodinglist.size()-1) {c.addCnsntProvisionActorRoleCdgUsrSltd("]]");}


		/******************** Cnsnt_Provision_Actor_Role_Cdg_Sys ********************************************************************************/
		if(consentprovisionactorrolecodingi == 0) {c.addCnsntProvisionActorRoleCdgSys("[[");}
		if(consentprovisionactorrolecoding.hasSystem()) {

			c.addCnsntProvisionActorRoleCdgSys(String.valueOf(consentprovisionactorrolecoding.getSystem()));
		} else {
			c.addCnsntProvisionActorRoleCdgSys("NULL");
		}

		if(consentprovisionactorrolecodingi == consentprovisionactorrolecodinglist.size()-1) {c.addCnsntProvisionActorRoleCdgSys("]]");}


		 };
		 };
		/******************** consentprovisionsecuritylabel ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentprovisionsecuritylabellist = consentprovision.getSecurityLabel();
		for(int consentprovisionsecuritylabeli = 0; consentprovisionsecuritylabeli<consentprovisionsecuritylabellist.size();consentprovisionsecuritylabeli++ ) {
		org.hl7.fhir.r4.model.Coding  consentprovisionsecuritylabel = consentprovisionsecuritylabellist.get(consentprovisionsecuritylabeli);

		/******************** Cnsnt_Provision_SecurityLbl_Dsply ********************************************************************************/
		if(consentprovisionsecuritylabeli == 0) {c.addCnsntProvisionSecurityLblDsply("[");}
		if(consentprovisionsecuritylabel.hasDisplay()) {

			c.addCnsntProvisionSecurityLblDsply(String.valueOf(consentprovisionsecuritylabel.getDisplay()));
		} else {
			c.addCnsntProvisionSecurityLblDsply("NULL");
		}

		if(consentprovisionsecuritylabeli == consentprovisionsecuritylabellist.size()-1) {c.addCnsntProvisionSecurityLblDsply("]");}


		/******************** Cnsnt_Provision_SecurityLbl_Vrsn ********************************************************************************/
		if(consentprovisionsecuritylabeli == 0) {c.addCnsntProvisionSecurityLblVrsn("[");}
		if(consentprovisionsecuritylabel.hasVersion()) {

			c.addCnsntProvisionSecurityLblVrsn(String.valueOf(consentprovisionsecuritylabel.getVersion()));
		} else {
			c.addCnsntProvisionSecurityLblVrsn("NULL");
		}

		if(consentprovisionsecuritylabeli == consentprovisionsecuritylabellist.size()-1) {c.addCnsntProvisionSecurityLblVrsn("]");}


		/******************** Cnsnt_Provision_SecurityLbl_Cd ********************************************************************************/
		if(consentprovisionsecuritylabeli == 0) {c.addCnsntProvisionSecurityLblCd("[");}
		if(consentprovisionsecuritylabel.hasCode()) {

			c.addCnsntProvisionSecurityLblCd(String.valueOf(consentprovisionsecuritylabel.getCode()));
		} else {
			c.addCnsntProvisionSecurityLblCd("NULL");
		}

		if(consentprovisionsecuritylabeli == consentprovisionsecuritylabellist.size()-1) {c.addCnsntProvisionSecurityLblCd("]");}


		/******************** Cnsnt_Provision_SecurityLbl_UsrSltd ********************************************************************************/
		if(consentprovisionsecuritylabeli == 0) {c.addCnsntProvisionSecurityLblUsrSltd("[");}
		if(consentprovisionsecuritylabel.hasUserSelected()) {

			c.addCnsntProvisionSecurityLblUsrSltd(String.valueOf(consentprovisionsecuritylabel.getUserSelected()));
		} else {
			c.addCnsntProvisionSecurityLblUsrSltd("NULL");
		}

		if(consentprovisionsecuritylabeli == consentprovisionsecuritylabellist.size()-1) {c.addCnsntProvisionSecurityLblUsrSltd("]");}


		/******************** Cnsnt_Provision_SecurityLbl_Sys ********************************************************************************/
		if(consentprovisionsecuritylabeli == 0) {c.addCnsntProvisionSecurityLblSys("[");}
		if(consentprovisionsecuritylabel.hasSystem()) {

			c.addCnsntProvisionSecurityLblSys(String.valueOf(consentprovisionsecuritylabel.getSystem()));
		} else {
			c.addCnsntProvisionSecurityLblSys("NULL");
		}

		if(consentprovisionsecuritylabeli == consentprovisionsecuritylabellist.size()-1) {c.addCnsntProvisionSecurityLblSys("]");}


		 };
		/******************** consentprovisiondataperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period consentprovisiondataperiod = consentprovision.getDataPeriod();

		/******************** Cnsnt_Provision_DataPrd_Strt ********************************************************************************/
		if(consentprovisiondataperiod.hasStart()) {

			c.addCnsntProvisionDataPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(consentprovisiondataperiod.getStart())+"\"");
		} else {
			c.addCnsntProvisionDataPrdStrt("NULL");
		}


		/******************** Cnsnt_Provision_DataPrd_End ********************************************************************************/
		if(consentprovisiondataperiod.hasEnd()) {

			c.addCnsntProvisionDataPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(consentprovisiondataperiod.getEnd())+"\"");
		} else {
			c.addCnsntProvisionDataPrdEnd("NULL");
		}


		/******************** consentprovisionclass_ ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentprovisionclasslist = consentprovision.getClass_();
		for(int consentprovisionclassi = 0; consentprovisionclassi<consentprovisionclasslist.size();consentprovisionclassi++ ) {
		org.hl7.fhir.r4.model.Coding  consentprovisionclass = consentprovisionclasslist.get(consentprovisionclassi);

		/******************** Cnsnt_Provision_Cls__Dsply ********************************************************************************/
		if(consentprovisionclassi == 0) {c.addCnsntProvisionClsDsply("[");}
		if(consentprovisionclass.hasDisplay()) {

			c.addCnsntProvisionClsDsply(String.valueOf(consentprovisionclass.getDisplay()));
		} else {
			c.addCnsntProvisionClsDsply("NULL");
		}

		if(consentprovisionclassi == consentprovisionclasslist.size()-1) {c.addCnsntProvisionClsDsply("]");}


		/******************** Cnsnt_Provision_Cls__Vrsn ********************************************************************************/
		if(consentprovisionclassi == 0) {c.addCnsntProvisionClsVrsn("[");}
		if(consentprovisionclass.hasVersion()) {

			c.addCnsntProvisionClsVrsn(String.valueOf(consentprovisionclass.getVersion()));
		} else {
			c.addCnsntProvisionClsVrsn("NULL");
		}

		if(consentprovisionclassi == consentprovisionclasslist.size()-1) {c.addCnsntProvisionClsVrsn("]");}


		/******************** Cnsnt_Provision_Cls__Cd ********************************************************************************/
		if(consentprovisionclassi == 0) {c.addCnsntProvisionClsCd("[");}
		if(consentprovisionclass.hasCode()) {

			c.addCnsntProvisionClsCd(String.valueOf(consentprovisionclass.getCode()));
		} else {
			c.addCnsntProvisionClsCd("NULL");
		}

		if(consentprovisionclassi == consentprovisionclasslist.size()-1) {c.addCnsntProvisionClsCd("]");}


		/******************** Cnsnt_Provision_Cls__UsrSltd ********************************************************************************/
		if(consentprovisionclassi == 0) {c.addCnsntProvisionClsUsrSltd("[");}
		if(consentprovisionclass.hasUserSelected()) {

			c.addCnsntProvisionClsUsrSltd(String.valueOf(consentprovisionclass.getUserSelected()));
		} else {
			c.addCnsntProvisionClsUsrSltd("NULL");
		}

		if(consentprovisionclassi == consentprovisionclasslist.size()-1) {c.addCnsntProvisionClsUsrSltd("]");}


		/******************** Cnsnt_Provision_Cls__Sys ********************************************************************************/
		if(consentprovisionclassi == 0) {c.addCnsntProvisionClsSys("[");}
		if(consentprovisionclass.hasSystem()) {

			c.addCnsntProvisionClsSys(String.valueOf(consentprovisionclass.getSystem()));
		} else {
			c.addCnsntProvisionClsSys("NULL");
		}

		if(consentprovisionclassi == consentprovisionclasslist.size()-1) {c.addCnsntProvisionClsSys("]");}


		 };
		/******************** consentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentState consentstatus = consent.getStatus();
		if(consentstatus!=null) {
			c.addCnsntSts(consentstatus.toCode());
		} else {
			c.addCnsntSts("NULL");
		}

		/******************** consentidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> consentidentifierlist = consent.getIdentifier();
		for(int consentidentifieri = 0; consentidentifieri<consentidentifierlist.size();consentidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  consentidentifier = consentidentifierlist.get(consentidentifieri);

		/******************** Cnsnt_Id_Vl ********************************************************************************/
		if(consentidentifieri == 0) {c.addCnsntIdVl("[");}
		if(consentidentifier.hasValue()) {

			c.addCnsntIdVl(String.valueOf(consentidentifier.getValue()));
		} else {
			c.addCnsntIdVl("NULL");
		}

		if(consentidentifieri == consentidentifierlist.size()-1) {c.addCnsntIdVl("]");}


		/******************** consentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentidentifiertype = consentidentifier.getType();

		/******************** Cnsnt_Id_Typ_Txt ********************************************************************************/
		if(consentidentifieri == 0) {c.addCnsntIdTypTxt("[");}
		if(consentidentifiertype.hasText()) {

			c.addCnsntIdTypTxt(String.valueOf(consentidentifiertype.getText()));
		} else {
			c.addCnsntIdTypTxt("NULL");
		}

		if(consentidentifieri == consentidentifierlist.size()-1) {c.addCnsntIdTypTxt("]");}


		/******************** consentidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentidentifiertypecodinglist = consentidentifiertype.getCoding();
		for(int consentidentifiertypecodingi = 0; consentidentifiertypecodingi<consentidentifiertypecodinglist.size();consentidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  consentidentifiertypecoding = consentidentifiertypecodinglist.get(consentidentifiertypecodingi);

		/******************** Cnsnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(consentidentifiertypecodingi == 0) {c.addCnsntIdTypCdgDsply("[[");}
		if(consentidentifiertypecoding.hasDisplay()) {

			c.addCnsntIdTypCdgDsply(String.valueOf(consentidentifiertypecoding.getDisplay()));
		} else {
			c.addCnsntIdTypCdgDsply("NULL");
		}

		if(consentidentifiertypecodingi == consentidentifiertypecodinglist.size()-1) {c.addCnsntIdTypCdgDsply("]]");}


		/******************** Cnsnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(consentidentifiertypecodingi == 0) {c.addCnsntIdTypCdgVrsn("[[");}
		if(consentidentifiertypecoding.hasVersion()) {

			c.addCnsntIdTypCdgVrsn(String.valueOf(consentidentifiertypecoding.getVersion()));
		} else {
			c.addCnsntIdTypCdgVrsn("NULL");
		}

		if(consentidentifiertypecodingi == consentidentifiertypecodinglist.size()-1) {c.addCnsntIdTypCdgVrsn("]]");}


		/******************** Cnsnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(consentidentifiertypecodingi == 0) {c.addCnsntIdTypCdgCd("[[");}
		if(consentidentifiertypecoding.hasCode()) {

			c.addCnsntIdTypCdgCd(String.valueOf(consentidentifiertypecoding.getCode()));
		} else {
			c.addCnsntIdTypCdgCd("NULL");
		}

		if(consentidentifiertypecodingi == consentidentifiertypecodinglist.size()-1) {c.addCnsntIdTypCdgCd("]]");}


		/******************** Cnsnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(consentidentifiertypecodingi == 0) {c.addCnsntIdTypCdgUsrSltd("[[");}
		if(consentidentifiertypecoding.hasUserSelected()) {

			c.addCnsntIdTypCdgUsrSltd(String.valueOf(consentidentifiertypecoding.getUserSelected()));
		} else {
			c.addCnsntIdTypCdgUsrSltd("NULL");
		}

		if(consentidentifiertypecodingi == consentidentifiertypecodinglist.size()-1) {c.addCnsntIdTypCdgUsrSltd("]]");}


		/******************** Cnsnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(consentidentifiertypecodingi == 0) {c.addCnsntIdTypCdgSys("[[");}
		if(consentidentifiertypecoding.hasSystem()) {

			c.addCnsntIdTypCdgSys(String.valueOf(consentidentifiertypecoding.getSystem()));
		} else {
			c.addCnsntIdTypCdgSys("NULL");
		}

		if(consentidentifiertypecodingi == consentidentifiertypecodinglist.size()-1) {c.addCnsntIdTypCdgSys("]]");}


		 };
		/******************** consentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period consentidentifierperiod = consentidentifier.getPeriod();

		/******************** Cnsnt_Id_Prd_Strt ********************************************************************************/
		if(consentidentifieri == 0) {c.addCnsntIdPrdStrt("[");}
		if(consentidentifierperiod.hasStart()) {

			c.addCnsntIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(consentidentifierperiod.getStart())+"\"");
		} else {
			c.addCnsntIdPrdStrt("NULL");
		}

		if(consentidentifieri == consentidentifierlist.size()-1) {c.addCnsntIdPrdStrt("]");}


		/******************** Cnsnt_Id_Prd_End ********************************************************************************/
		if(consentidentifieri == 0) {c.addCnsntIdPrdEnd("[");}
		if(consentidentifierperiod.hasEnd()) {

			c.addCnsntIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(consentidentifierperiod.getEnd())+"\"");
		} else {
			c.addCnsntIdPrdEnd("NULL");
		}

		if(consentidentifieri == consentidentifierlist.size()-1) {c.addCnsntIdPrdEnd("]");}


		/******************** consentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse consentidentifieruse = consentidentifier.getUse();
		if(consentidentifieruse!=null) {
		if(consentidentifieri == 0) {

		c.addCnsntIdUse("[");		}
			c.addCnsntIdUse(consentidentifieruse.toCode());
		if(consentidentifieri == consentidentifierlist.size()-1) {

		c.addCnsntIdUse("]");		}

		} else {
			c.addCnsntIdUse("NULL");
		}

		/******************** Cnsnt_Id_Assigner ********************************************************************************/
		if(consentidentifieri == 0) {c.addCnsntIdAssigner("[");}
		if(consentidentifier.hasAssigner()) {

			if(consentidentifier.getAssigner().getReference() != null) {
			c.addCnsntIdAssigner(consentidentifier.getAssigner().getReference());
			}
		} else {
			c.addCnsntIdAssigner("NULL");
		}

		if(consentidentifieri == consentidentifierlist.size()-1) {c.addCnsntIdAssigner("]");}


		/******************** Cnsnt_Id_Sys ********************************************************************************/
		if(consentidentifieri == 0) {c.addCnsntIdSys("[");}
		if(consentidentifier.hasSystem()) {

			c.addCnsntIdSys(String.valueOf(consentidentifier.getSystem()));
		} else {
			c.addCnsntIdSys("NULL");
		}

		if(consentidentifieri == consentidentifierlist.size()-1) {c.addCnsntIdSys("]");}


		 };
		/******************** consentscope ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentscope = consent.getScope();

		/******************** Cnsnt_Scope_Txt ********************************************************************************/
		if(consentscope.hasText()) {

			c.addCnsntScopeTxt(String.valueOf(consentscope.getText()));
		} else {
			c.addCnsntScopeTxt("NULL");
		}


		/******************** consentscopecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentscopecodinglist = consentscope.getCoding();
		for(int consentscopecodingi = 0; consentscopecodingi<consentscopecodinglist.size();consentscopecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  consentscopecoding = consentscopecodinglist.get(consentscopecodingi);

		/******************** Cnsnt_Scope_Cdg_Dsply ********************************************************************************/
		if(consentscopecodingi == 0) {c.addCnsntScopeCdgDsply("[");}
		if(consentscopecoding.hasDisplay()) {

			c.addCnsntScopeCdgDsply(String.valueOf(consentscopecoding.getDisplay()));
		} else {
			c.addCnsntScopeCdgDsply("NULL");
		}

		if(consentscopecodingi == consentscopecodinglist.size()-1) {c.addCnsntScopeCdgDsply("]");}


		/******************** Cnsnt_Scope_Cdg_Vrsn ********************************************************************************/
		if(consentscopecodingi == 0) {c.addCnsntScopeCdgVrsn("[");}
		if(consentscopecoding.hasVersion()) {

			c.addCnsntScopeCdgVrsn(String.valueOf(consentscopecoding.getVersion()));
		} else {
			c.addCnsntScopeCdgVrsn("NULL");
		}

		if(consentscopecodingi == consentscopecodinglist.size()-1) {c.addCnsntScopeCdgVrsn("]");}


		/******************** Cnsnt_Scope_Cdg_Cd ********************************************************************************/
		if(consentscopecodingi == 0) {c.addCnsntScopeCdgCd("[");}
		if(consentscopecoding.hasCode()) {

			c.addCnsntScopeCdgCd(String.valueOf(consentscopecoding.getCode()));
		} else {
			c.addCnsntScopeCdgCd("NULL");
		}

		if(consentscopecodingi == consentscopecodinglist.size()-1) {c.addCnsntScopeCdgCd("]");}


		/******************** Cnsnt_Scope_Cdg_UsrSltd ********************************************************************************/
		if(consentscopecodingi == 0) {c.addCnsntScopeCdgUsrSltd("[");}
		if(consentscopecoding.hasUserSelected()) {

			c.addCnsntScopeCdgUsrSltd(String.valueOf(consentscopecoding.getUserSelected()));
		} else {
			c.addCnsntScopeCdgUsrSltd("NULL");
		}

		if(consentscopecodingi == consentscopecodinglist.size()-1) {c.addCnsntScopeCdgUsrSltd("]");}


		/******************** Cnsnt_Scope_Cdg_Sys ********************************************************************************/
		if(consentscopecodingi == 0) {c.addCnsntScopeCdgSys("[");}
		if(consentscopecoding.hasSystem()) {

			c.addCnsntScopeCdgSys(String.valueOf(consentscopecoding.getSystem()));
		} else {
			c.addCnsntScopeCdgSys("NULL");
		}

		if(consentscopecodingi == consentscopecodinglist.size()-1) {c.addCnsntScopeCdgSys("]");}


		 };
		/******************** consentcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> consentcategorylist = consent.getCategory();
		for(int consentcategoryi = 0; consentcategoryi<consentcategorylist.size();consentcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  consentcategory = consentcategorylist.get(consentcategoryi);

		/******************** Cnsnt_Ctgry_Txt ********************************************************************************/
		if(consentcategoryi == 0) {c.addCnsntCtgryTxt("[");}
		if(consentcategory.hasText()) {

			c.addCnsntCtgryTxt(String.valueOf(consentcategory.getText()));
		} else {
			c.addCnsntCtgryTxt("NULL");
		}

		if(consentcategoryi == consentcategorylist.size()-1) {c.addCnsntCtgryTxt("]");}


		/******************** consentcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentcategorycodinglist = consentcategory.getCoding();
		for(int consentcategorycodingi = 0; consentcategorycodingi<consentcategorycodinglist.size();consentcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  consentcategorycoding = consentcategorycodinglist.get(consentcategorycodingi);

		/******************** Cnsnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(consentcategorycodingi == 0) {c.addCnsntCtgryCdgDsply("[[");}
		if(consentcategorycoding.hasDisplay()) {

			c.addCnsntCtgryCdgDsply(String.valueOf(consentcategorycoding.getDisplay()));
		} else {
			c.addCnsntCtgryCdgDsply("NULL");
		}

		if(consentcategorycodingi == consentcategorycodinglist.size()-1) {c.addCnsntCtgryCdgDsply("]]");}


		/******************** Cnsnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(consentcategorycodingi == 0) {c.addCnsntCtgryCdgVrsn("[[");}
		if(consentcategorycoding.hasVersion()) {

			c.addCnsntCtgryCdgVrsn(String.valueOf(consentcategorycoding.getVersion()));
		} else {
			c.addCnsntCtgryCdgVrsn("NULL");
		}

		if(consentcategorycodingi == consentcategorycodinglist.size()-1) {c.addCnsntCtgryCdgVrsn("]]");}


		/******************** Cnsnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(consentcategorycodingi == 0) {c.addCnsntCtgryCdgCd("[[");}
		if(consentcategorycoding.hasCode()) {

			c.addCnsntCtgryCdgCd(String.valueOf(consentcategorycoding.getCode()));
		} else {
			c.addCnsntCtgryCdgCd("NULL");
		}

		if(consentcategorycodingi == consentcategorycodinglist.size()-1) {c.addCnsntCtgryCdgCd("]]");}


		/******************** Cnsnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(consentcategorycodingi == 0) {c.addCnsntCtgryCdgUsrSltd("[[");}
		if(consentcategorycoding.hasUserSelected()) {

			c.addCnsntCtgryCdgUsrSltd(String.valueOf(consentcategorycoding.getUserSelected()));
		} else {
			c.addCnsntCtgryCdgUsrSltd("NULL");
		}

		if(consentcategorycodingi == consentcategorycodinglist.size()-1) {c.addCnsntCtgryCdgUsrSltd("]]");}


		/******************** Cnsnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(consentcategorycodingi == 0) {c.addCnsntCtgryCdgSys("[[");}
		if(consentcategorycoding.hasSystem()) {

			c.addCnsntCtgryCdgSys(String.valueOf(consentcategorycoding.getSystem()));
		} else {
			c.addCnsntCtgryCdgSys("NULL");
		}

		if(consentcategorycodingi == consentcategorycodinglist.size()-1) {c.addCnsntCtgryCdgSys("]]");}


		 };
		 };
		/******************** Cnsnt_DtTime ********************************************************************************/
		if(consent.hasDateTime()) {

			c.addCnsntDtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(consent.getDateTime())+"\"");
		} else {
			c.addCnsntDtTime("NULL");
		}


		/******************** consentpolicy ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Consent.ConsentPolicyComponent> consentpolicylist = consent.getPolicy();
		for(int consentpolicyi = 0; consentpolicyi<consentpolicylist.size();consentpolicyi++ ) {
		org.hl7.fhir.r4.model.Consent.ConsentPolicyComponent  consentpolicy = consentpolicylist.get(consentpolicyi);

		/******************** Cnsnt_Policy_Athrity ********************************************************************************/
		if(consentpolicyi == 0) {c.addCnsntPolicyAthrity("[");}
		if(consentpolicy.hasAuthority()) {

			c.addCnsntPolicyAthrity(String.valueOf(consentpolicy.getAuthority()));
		} else {
			c.addCnsntPolicyAthrity("NULL");
		}

		if(consentpolicyi == consentpolicylist.size()-1) {c.addCnsntPolicyAthrity("]");}


		/******************** Cnsnt_Policy_Uri ********************************************************************************/
		if(consentpolicyi == 0) {c.addCnsntPolicyUri("[");}
		if(consentpolicy.hasUri()) {

			c.addCnsntPolicyUri(String.valueOf(consentpolicy.getUri()));
		} else {
			c.addCnsntPolicyUri("NULL");
		}

		if(consentpolicyi == consentpolicylist.size()-1) {c.addCnsntPolicyUri("]");}


		 };
		/******************** Cnsnt_Prfrmr ********************************************************************************/
		if(consent.hasPerformer()) {

			String  array = "[";
			for(int incr=0; incr<consent.getPerformer().size(); incr++) {
				array = array + consent.getPerformer().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnsntPrfrmr(array);

		} else {
			c.addCnsntPrfrmr("NULL");
		}


		/******************** Cnsnt_Orgnztn ********************************************************************************/
		if(consent.hasOrganization()) {

			String  array = "[";
			for(int incr=0; incr<consent.getOrganization().size(); incr++) {
				array = array + consent.getOrganization().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCnsntOrgnztn(array);

		} else {
			c.addCnsntOrgnztn("NULL");
		}


		/******************** Cnsnt_Pnt ********************************************************************************/
		if(consent.hasPatient()) {

			if(consent.getPatient().getReference() != null) {
			c.addCnsntPnt(consent.getPatient().getReference());
			}
		} else {
			c.addCnsntPnt("NULL");
		}


		/******************** consentsourceattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment consentsourceattachment = consent.getSourceAttachment();

		/******************** Cnsnt_SrcAttchmnt_Sz ********************************************************************************/
		if(consentsourceattachment.hasSize()) {

			c.addCnsntSrcAttchmntSz(String.valueOf(consentsourceattachment.getSize()));
		} else {
			c.addCnsntSrcAttchmntSz("NULL");
		}


		/******************** Cnsnt_SrcAttchmnt_Lnguage ********************************************************************************/
		if(consentsourceattachment.hasLanguage()) {

			c.addCnsntSrcAttchmntLnguage(String.valueOf(consentsourceattachment.getLanguage()));
		} else {
			c.addCnsntSrcAttchmntLnguage("NULL");
		}


		/******************** Cnsnt_SrcAttchmnt_CntntTyp ********************************************************************************/
		if(consentsourceattachment.hasContentType()) {

			c.addCnsntSrcAttchmntCntntTyp(String.valueOf(consentsourceattachment.getContentType()));
		} else {
			c.addCnsntSrcAttchmntCntntTyp("NULL");
		}


		/******************** Cnsnt_SrcAttchmnt_Hash ********************************************************************************/
		if(consentsourceattachment.hasHash()) {

			c.addCnsntSrcAttchmntHash(new String(consentsourceattachment.getHash()));
		} else {
			c.addCnsntSrcAttchmntHash("NULL");
		}


		/******************** Cnsnt_SrcAttchmnt_Data ********************************************************************************/
		if(consentsourceattachment.hasData()) {

			c.addCnsntSrcAttchmntData(new String(consentsourceattachment.getData()));
		} else {
			c.addCnsntSrcAttchmntData("NULL");
		}


		/******************** Cnsnt_SrcAttchmnt_Creation ********************************************************************************/
		if(consentsourceattachment.hasCreation()) {

			c.addCnsntSrcAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(consentsourceattachment.getCreation())+"\"");
		} else {
			c.addCnsntSrcAttchmntCreation("NULL");
		}


		/******************** Cnsnt_SrcAttchmnt_Ttl ********************************************************************************/
		if(consentsourceattachment.hasTitle()) {

			c.addCnsntSrcAttchmntTtl(String.valueOf(consentsourceattachment.getTitle()));
		} else {
			c.addCnsntSrcAttchmntTtl("NULL");
		}


		/******************** Cnsnt_SrcAttchmnt_Url ********************************************************************************/
		if(consentsourceattachment.hasUrl()) {

			c.addCnsntSrcAttchmntUrl(String.valueOf(consentsourceattachment.getUrl()));
		} else {
			c.addCnsntSrcAttchmntUrl("NULL");
		}


		/******************** Cnsnt_SrcRfrnc ********************************************************************************/
		if(consent.hasSourceReference()) {

			if(consent.getSourceReference().getReference() != null) {
			c.addCnsntSrcRfrnc(consent.getSourceReference().getReference());
			}
		} else {
			c.addCnsntSrcRfrnc("NULL");
		}


		/******************** consentverification ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Consent.ConsentVerificationComponent> consentverificationlist = consent.getVerification();
		for(int consentverificationi = 0; consentverificationi<consentverificationlist.size();consentverificationi++ ) {
		org.hl7.fhir.r4.model.Consent.ConsentVerificationComponent  consentverification = consentverificationlist.get(consentverificationi);

		/******************** Cnsnt_Vrfctn_VerifiedWith ********************************************************************************/
		if(consentverificationi == 0) {c.addCnsntVrfctnVerifiedWith("[");}
		if(consentverification.hasVerifiedWith()) {

			if(consentverification.getVerifiedWith().getReference() != null) {
			c.addCnsntVrfctnVerifiedWith(consentverification.getVerifiedWith().getReference());
			}
		} else {
			c.addCnsntVrfctnVerifiedWith("NULL");
		}

		if(consentverificationi == consentverificationlist.size()-1) {c.addCnsntVrfctnVerifiedWith("]");}


		/******************** Cnsnt_Vrfctn_Verified ********************************************************************************/
		if(consentverificationi == 0) {c.addCnsntVrfctnVerified("[");}
		if(consentverification.hasVerified()) {

			c.addCnsntVrfctnVerified(String.valueOf(consentverification.getVerified()));
		} else {
			c.addCnsntVrfctnVerified("NULL");
		}

		if(consentverificationi == consentverificationlist.size()-1) {c.addCnsntVrfctnVerified("]");}


		 };
		/******************** consentpolicyrule ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentpolicyrule = consent.getPolicyRule();

		/******************** Cnsnt_PolicyRule_Txt ********************************************************************************/
		if(consentpolicyrule.hasText()) {

			c.addCnsntPolicyRuleTxt(String.valueOf(consentpolicyrule.getText()));
		} else {
			c.addCnsntPolicyRuleTxt("NULL");
		}


		/******************** consentpolicyrulecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> consentpolicyrulecodinglist = consentpolicyrule.getCoding();
		for(int consentpolicyrulecodingi = 0; consentpolicyrulecodingi<consentpolicyrulecodinglist.size();consentpolicyrulecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  consentpolicyrulecoding = consentpolicyrulecodinglist.get(consentpolicyrulecodingi);

		/******************** Cnsnt_PolicyRule_Cdg_Dsply ********************************************************************************/
		if(consentpolicyrulecodingi == 0) {c.addCnsntPolicyRuleCdgDsply("[");}
		if(consentpolicyrulecoding.hasDisplay()) {

			c.addCnsntPolicyRuleCdgDsply(String.valueOf(consentpolicyrulecoding.getDisplay()));
		} else {
			c.addCnsntPolicyRuleCdgDsply("NULL");
		}

		if(consentpolicyrulecodingi == consentpolicyrulecodinglist.size()-1) {c.addCnsntPolicyRuleCdgDsply("]");}


		/******************** Cnsnt_PolicyRule_Cdg_Vrsn ********************************************************************************/
		if(consentpolicyrulecodingi == 0) {c.addCnsntPolicyRuleCdgVrsn("[");}
		if(consentpolicyrulecoding.hasVersion()) {

			c.addCnsntPolicyRuleCdgVrsn(String.valueOf(consentpolicyrulecoding.getVersion()));
		} else {
			c.addCnsntPolicyRuleCdgVrsn("NULL");
		}

		if(consentpolicyrulecodingi == consentpolicyrulecodinglist.size()-1) {c.addCnsntPolicyRuleCdgVrsn("]");}


		/******************** Cnsnt_PolicyRule_Cdg_Cd ********************************************************************************/
		if(consentpolicyrulecodingi == 0) {c.addCnsntPolicyRuleCdgCd("[");}
		if(consentpolicyrulecoding.hasCode()) {

			c.addCnsntPolicyRuleCdgCd(String.valueOf(consentpolicyrulecoding.getCode()));
		} else {
			c.addCnsntPolicyRuleCdgCd("NULL");
		}

		if(consentpolicyrulecodingi == consentpolicyrulecodinglist.size()-1) {c.addCnsntPolicyRuleCdgCd("]");}


		/******************** Cnsnt_PolicyRule_Cdg_UsrSltd ********************************************************************************/
		if(consentpolicyrulecodingi == 0) {c.addCnsntPolicyRuleCdgUsrSltd("[");}
		if(consentpolicyrulecoding.hasUserSelected()) {

			c.addCnsntPolicyRuleCdgUsrSltd(String.valueOf(consentpolicyrulecoding.getUserSelected()));
		} else {
			c.addCnsntPolicyRuleCdgUsrSltd("NULL");
		}

		if(consentpolicyrulecodingi == consentpolicyrulecodinglist.size()-1) {c.addCnsntPolicyRuleCdgUsrSltd("]");}


		/******************** Cnsnt_PolicyRule_Cdg_Sys ********************************************************************************/
		if(consentpolicyrulecodingi == 0) {c.addCnsntPolicyRuleCdgSys("[");}
		if(consentpolicyrulecoding.hasSystem()) {

			c.addCnsntPolicyRuleCdgSys(String.valueOf(consentpolicyrulecoding.getSystem()));
		} else {
			c.addCnsntPolicyRuleCdgSys("NULL");
		}

		if(consentpolicyrulecodingi == consentpolicyrulecodinglist.size()-1) {c.addCnsntPolicyRuleCdgSys("]");}


		 };
		return c;
	}
}
