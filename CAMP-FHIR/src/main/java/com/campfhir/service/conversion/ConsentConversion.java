package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Consent;
public class ConsentConversion 
{
	public org.hl7.fhir.r4.model.Consent Consents(Consent c) throws ParseException
	{
		org.hl7.fhir.r4.model.Consent consent = new org.hl7.fhir.r4.model.Consent();

		/******************** id ********************************************************************************/
		consent.setId(c.getId());

		/******************** consentcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		consent.addCategory(consentcategory);

		/******************** consentcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		consentcategory.addCoding(consentcategorycoding);

		/******************** Cnsnt_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCnsntCtgryCdgCd() != null) {
			consentcategorycoding.setCode(c.getCnsntCtgryCdgCd());
		}
		/******************** Cnsnt_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntCtgryCdgDsply() != null) {
			consentcategorycoding.setDisplay(c.getCnsntCtgryCdgDsply());
		}
		/******************** Cnsnt_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCnsntCtgryCdgSys() != null) {
			consentcategorycoding.setSystem(c.getCnsntCtgryCdgSys());
		}
		/******************** Cnsnt_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntCtgryCdgUsrSltd() != null) {
			consentcategorycoding.setUserSelected(Boolean.parseBoolean(c.getCnsntCtgryCdgUsrSltd()));
		}
		/******************** Cnsnt_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntCtgryCdgVrsn() != null) {
			consentcategorycoding.setVersion(c.getCnsntCtgryCdgVrsn());
		}
		/******************** Cnsnt_Ctgry_Txt ********************************************************************************/
		if(c.getCnsntCtgryTxt() != null) {
			consentcategory.setText(c.getCnsntCtgryTxt());
		}
		/******************** Cnsnt_DtTime ********************************************************************************/
		if(c.getCnsntDtTime() != null) {
			java.text.SimpleDateFormat Cnsnt_DtTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnsnt_DtTimedate = Cnsnt_DtTimesdf.parse(c.getCnsntDtTime());
			consent.setDateTime(Cnsnt_DtTimedate);
		}
		/******************** consentidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier consentidentifier =  new org.hl7.fhir.r4.model.Identifier();
		consent.addIdentifier(consentidentifier);

		/******************** Cnsnt_Id_Assigner ********************************************************************************/
		if(c.getCnsntIdAssigner() != null) {
			consentidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCnsntIdAssigner()));
		}
		/******************** consentidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period consentidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		consentidentifier.setPeriod(consentidentifierperiod);

		/******************** Cnsnt_Id_Prd_End ********************************************************************************/
		if(c.getCnsntIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cnsnt_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnsnt_Id_Prd_Enddate = Cnsnt_Id_Prd_Endsdf.parse(c.getCnsntIdPrdEnd());
			consentidentifierperiod.setEnd(Cnsnt_Id_Prd_Enddate);
		}
		/******************** Cnsnt_Id_Prd_Strt ********************************************************************************/
		if(c.getCnsntIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cnsnt_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnsnt_Id_Prd_Strtdate = Cnsnt_Id_Prd_Strtsdf.parse(c.getCnsntIdPrdStrt());
			consentidentifierperiod.setStart(Cnsnt_Id_Prd_Strtdate);
		}
		/******************** Cnsnt_Id_Sys ********************************************************************************/
		if(c.getCnsntIdSys() != null) {
			consentidentifier.setSystem(c.getCnsntIdSys());
		}
		/******************** consentidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		consentidentifier.setType(consentidentifiertype);

		/******************** consentidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		consentidentifiertype.addCoding(consentidentifiertypecoding);

		/******************** Cnsnt_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnsntIdTypCdgCd() != null) {
			consentidentifiertypecoding.setCode(c.getCnsntIdTypCdgCd());
		}
		/******************** Cnsnt_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntIdTypCdgDsply() != null) {
			consentidentifiertypecoding.setDisplay(c.getCnsntIdTypCdgDsply());
		}
		/******************** Cnsnt_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnsntIdTypCdgSys() != null) {
			consentidentifiertypecoding.setSystem(c.getCnsntIdTypCdgSys());
		}
		/******************** Cnsnt_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntIdTypCdgUsrSltd() != null) {
			consentidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCnsntIdTypCdgUsrSltd()));
		}
		/******************** Cnsnt_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntIdTypCdgVrsn() != null) {
			consentidentifiertypecoding.setVersion(c.getCnsntIdTypCdgVrsn());
		}
		/******************** Cnsnt_Id_Typ_Txt ********************************************************************************/
		if(c.getCnsntIdTypTxt() != null) {
			consentidentifiertype.setText(c.getCnsntIdTypTxt());
		}
		/******************** consentidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory consentidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		consentidentifier.setUse(consentidentifieruse.fromCode(c.getCnsntIdUse()));

		/******************** Cnsnt_Id_Vl ********************************************************************************/
		if(c.getCnsntIdVl() != null) {
			consentidentifier.setValue(c.getCnsntIdVl());
		}
		/******************** Cnsnt_Orgnztn ********************************************************************************/
		if(c.getCnsntOrgnztn() != null) {
			consent.addOrganization( new org.hl7.fhir.r4.model.Reference(c.getCnsntOrgnztn()));
		}
		/******************** Cnsnt_Pnt ********************************************************************************/
		if(c.getCnsntPnt() != null) {
			consent.setPatient( new org.hl7.fhir.r4.model.Reference(c.getCnsntPnt()));
		}
		/******************** Cnsnt_Prfrmr ********************************************************************************/
		if(c.getCnsntPrfrmr() != null) {
			consent.addPerformer( new org.hl7.fhir.r4.model.Reference(c.getCnsntPrfrmr()));
		}
		/******************** consentpolicy ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentPolicyComponent consentpolicy =  new org.hl7.fhir.r4.model.Consent.ConsentPolicyComponent();
		consent.addPolicy(consentpolicy);

		/******************** Cnsnt_Policy_Athrity ********************************************************************************/
		if(c.getCnsntPolicyAthrity() != null) {
			consentpolicy.setAuthority(c.getCnsntPolicyAthrity());
		}
		/******************** Cnsnt_Policy_Uri ********************************************************************************/
		if(c.getCnsntPolicyUri() != null) {
			consentpolicy.setUri(c.getCnsntPolicyUri());
		}
		/******************** consentpolicyrule ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentpolicyrule =  new org.hl7.fhir.r4.model.CodeableConcept();
		consent.setPolicyRule(consentpolicyrule);

		/******************** consentpolicyrulecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentpolicyrulecoding =  new org.hl7.fhir.r4.model.Coding();
		consentpolicyrule.addCoding(consentpolicyrulecoding);

		/******************** Cnsnt_PolicyRule_Cdg_Cd ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgCd() != null) {
			consentpolicyrulecoding.setCode(c.getCnsntPolicyRuleCdgCd());
		}
		/******************** Cnsnt_PolicyRule_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgDsply() != null) {
			consentpolicyrulecoding.setDisplay(c.getCnsntPolicyRuleCdgDsply());
		}
		/******************** Cnsnt_PolicyRule_Cdg_Sys ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgSys() != null) {
			consentpolicyrulecoding.setSystem(c.getCnsntPolicyRuleCdgSys());
		}
		/******************** Cnsnt_PolicyRule_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgUsrSltd() != null) {
			consentpolicyrulecoding.setUserSelected(Boolean.parseBoolean(c.getCnsntPolicyRuleCdgUsrSltd()));
		}
		/******************** Cnsnt_PolicyRule_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntPolicyRuleCdgVrsn() != null) {
			consentpolicyrulecoding.setVersion(c.getCnsntPolicyRuleCdgVrsn());
		}
		/******************** Cnsnt_PolicyRule_Txt ********************************************************************************/
		if(c.getCnsntPolicyRuleTxt() != null) {
			consentpolicyrule.setText(c.getCnsntPolicyRuleTxt());
		}
		/******************** consentprovision ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.provisionComponent consentprovision =  new org.hl7.fhir.r4.model.Consent.provisionComponent();
		consent.setProvision(consentprovision);

		/******************** consentprovisionaction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentprovisionaction =  new org.hl7.fhir.r4.model.CodeableConcept();
		consentprovision.addAction(consentprovisionaction);

		/******************** consentprovisionactioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionactioncoding =  new org.hl7.fhir.r4.model.Coding();
		consentprovisionaction.addCoding(consentprovisionactioncoding);

		/******************** Cnsnt_Provision_Actn_Cdg_Cd ********************************************************************************/
		if(c.getCnsntProvisionActnCdgCd() != null) {
			consentprovisionactioncoding.setCode(c.getCnsntProvisionActnCdgCd());
		}
		/******************** Cnsnt_Provision_Actn_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntProvisionActnCdgDsply() != null) {
			consentprovisionactioncoding.setDisplay(c.getCnsntProvisionActnCdgDsply());
		}
		/******************** Cnsnt_Provision_Actn_Cdg_Sys ********************************************************************************/
		if(c.getCnsntProvisionActnCdgSys() != null) {
			consentprovisionactioncoding.setSystem(c.getCnsntProvisionActnCdgSys());
		}
		/******************** Cnsnt_Provision_Actn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionActnCdgUsrSltd() != null) {
			consentprovisionactioncoding.setUserSelected(Boolean.parseBoolean(c.getCnsntProvisionActnCdgUsrSltd()));
		}
		/******************** Cnsnt_Provision_Actn_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionActnCdgVrsn() != null) {
			consentprovisionactioncoding.setVersion(c.getCnsntProvisionActnCdgVrsn());
		}
		/******************** Cnsnt_Provision_Actn_Txt ********************************************************************************/
		if(c.getCnsntProvisionActnTxt() != null) {
			consentprovisionaction.setText(c.getCnsntProvisionActnTxt());
		}
		/******************** consentprovisionactor ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.provisionActorComponent consentprovisionactor =  new org.hl7.fhir.r4.model.Consent.provisionActorComponent();
		consentprovision.addActor(consentprovisionactor);

		/******************** Cnsnt_Provision_Actor_Rfrnc ********************************************************************************/
		if(c.getCnsntProvisionActorRfrnc() != null) {
			consentprovisionactor.setReference( new org.hl7.fhir.r4.model.Reference(c.getCnsntProvisionActorRfrnc()));
		}
		/******************** consentprovisionactorrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentprovisionactorrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		consentprovisionactor.setRole(consentprovisionactorrole);

		/******************** consentprovisionactorrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionactorrolecoding =  new org.hl7.fhir.r4.model.Coding();
		consentprovisionactorrole.addCoding(consentprovisionactorrolecoding);

		/******************** Cnsnt_Provision_Actor_Role_Cdg_Cd ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgCd() != null) {
			consentprovisionactorrolecoding.setCode(c.getCnsntProvisionActorRoleCdgCd());
		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgDsply() != null) {
			consentprovisionactorrolecoding.setDisplay(c.getCnsntProvisionActorRoleCdgDsply());
		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Sys ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgSys() != null) {
			consentprovisionactorrolecoding.setSystem(c.getCnsntProvisionActorRoleCdgSys());
		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgUsrSltd() != null) {
			consentprovisionactorrolecoding.setUserSelected(Boolean.parseBoolean(c.getCnsntProvisionActorRoleCdgUsrSltd()));
		}
		/******************** Cnsnt_Provision_Actor_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionActorRoleCdgVrsn() != null) {
			consentprovisionactorrolecoding.setVersion(c.getCnsntProvisionActorRoleCdgVrsn());
		}
		/******************** Cnsnt_Provision_Actor_Role_Txt ********************************************************************************/
		if(c.getCnsntProvisionActorRoleTxt() != null) {
			consentprovisionactorrole.setText(c.getCnsntProvisionActorRoleTxt());
		}
		/******************** consentprovisionclass_ ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionclass =  new org.hl7.fhir.r4.model.Coding();
		consentprovision.addClass_(consentprovisionclass);

		/******************** Cnsnt_Provision_Cls__Cd ********************************************************************************/
		if(c.getCnsntProvisionClsCd() != null) {
			consentprovisionclass.setCode(c.getCnsntProvisionClsCd());
		}
		/******************** Cnsnt_Provision_Cls__Dsply ********************************************************************************/
		if(c.getCnsntProvisionClsDsply() != null) {
			consentprovisionclass.setDisplay(c.getCnsntProvisionClsDsply());
		}
		/******************** Cnsnt_Provision_Cls__Sys ********************************************************************************/
		if(c.getCnsntProvisionClsSys() != null) {
			consentprovisionclass.setSystem(c.getCnsntProvisionClsSys());
		}
		/******************** Cnsnt_Provision_Cls__UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionClsUsrSltd() != null) {
			consentprovisionclass.setUserSelected(Boolean.parseBoolean(c.getCnsntProvisionClsUsrSltd()));
		}
		/******************** Cnsnt_Provision_Cls__Vrsn ********************************************************************************/
		if(c.getCnsntProvisionClsVrsn() != null) {
			consentprovisionclass.setVersion(c.getCnsntProvisionClsVrsn());
		}
		/******************** consentprovisioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentprovisioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		consentprovision.addCode(consentprovisioncode);

		/******************** consentprovisioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		consentprovisioncode.addCoding(consentprovisioncodecoding);

		/******************** Cnsnt_Provision_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCnsntProvisionCdCdgCd() != null) {
			consentprovisioncodecoding.setCode(c.getCnsntProvisionCdCdgCd());
		}
		/******************** Cnsnt_Provision_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntProvisionCdCdgDsply() != null) {
			consentprovisioncodecoding.setDisplay(c.getCnsntProvisionCdCdgDsply());
		}
		/******************** Cnsnt_Provision_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCnsntProvisionCdCdgSys() != null) {
			consentprovisioncodecoding.setSystem(c.getCnsntProvisionCdCdgSys());
		}
		/******************** Cnsnt_Provision_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionCdCdgUsrSltd() != null) {
			consentprovisioncodecoding.setUserSelected(Boolean.parseBoolean(c.getCnsntProvisionCdCdgUsrSltd()));
		}
		/******************** Cnsnt_Provision_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionCdCdgVrsn() != null) {
			consentprovisioncodecoding.setVersion(c.getCnsntProvisionCdCdgVrsn());
		}
		/******************** Cnsnt_Provision_Cd_Txt ********************************************************************************/
		if(c.getCnsntProvisionCdTxt() != null) {
			consentprovisioncode.setText(c.getCnsntProvisionCdTxt());
		}
		/******************** consentprovisiondata ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.provisionDataComponent consentprovisiondata =  new org.hl7.fhir.r4.model.Consent.provisionDataComponent();
		consentprovision.addData(consentprovisiondata);

		/******************** consentprovisiondatameaning ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentDataMeaningEnumFactory consentprovisiondatameaning =  new org.hl7.fhir.r4.model.Consent.ConsentDataMeaningEnumFactory();
		consentprovisiondata.setMeaning(consentprovisiondatameaning.fromCode(c.getCnsntProvisionDataMeaning()));

		/******************** Cnsnt_Provision_Data_Rfrnc ********************************************************************************/
		if(c.getCnsntProvisionDataRfrnc() != null) {
			consentprovisiondata.setReference( new org.hl7.fhir.r4.model.Reference(c.getCnsntProvisionDataRfrnc()));
		}
		/******************** consentprovisiondataperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period consentprovisiondataperiod =  new org.hl7.fhir.r4.model.Period();
		consentprovision.setDataPeriod(consentprovisiondataperiod);

		/******************** Cnsnt_Provision_DataPrd_End ********************************************************************************/
		if(c.getCnsntProvisionDataPrdEnd() != null) {
			java.text.SimpleDateFormat Cnsnt_Provision_DataPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnsnt_Provision_DataPrd_Enddate = Cnsnt_Provision_DataPrd_Endsdf.parse(c.getCnsntProvisionDataPrdEnd());
			consentprovisiondataperiod.setEnd(Cnsnt_Provision_DataPrd_Enddate);
		}
		/******************** Cnsnt_Provision_DataPrd_Strt ********************************************************************************/
		if(c.getCnsntProvisionDataPrdStrt() != null) {
			java.text.SimpleDateFormat Cnsnt_Provision_DataPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnsnt_Provision_DataPrd_Strtdate = Cnsnt_Provision_DataPrd_Strtsdf.parse(c.getCnsntProvisionDataPrdStrt());
			consentprovisiondataperiod.setStart(Cnsnt_Provision_DataPrd_Strtdate);
		}
		/******************** consentprovisionperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period consentprovisionperiod =  new org.hl7.fhir.r4.model.Period();
		consentprovision.setPeriod(consentprovisionperiod);

		/******************** Cnsnt_Provision_Prd_End ********************************************************************************/
		if(c.getCnsntProvisionPrdEnd() != null) {
			java.text.SimpleDateFormat Cnsnt_Provision_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnsnt_Provision_Prd_Enddate = Cnsnt_Provision_Prd_Endsdf.parse(c.getCnsntProvisionPrdEnd());
			consentprovisionperiod.setEnd(Cnsnt_Provision_Prd_Enddate);
		}
		/******************** Cnsnt_Provision_Prd_Strt ********************************************************************************/
		if(c.getCnsntProvisionPrdStrt() != null) {
			java.text.SimpleDateFormat Cnsnt_Provision_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnsnt_Provision_Prd_Strtdate = Cnsnt_Provision_Prd_Strtsdf.parse(c.getCnsntProvisionPrdStrt());
			consentprovisionperiod.setStart(Cnsnt_Provision_Prd_Strtdate);
		}
		/******************** consentprovisionpurpose ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionpurpose =  new org.hl7.fhir.r4.model.Coding();
		consentprovision.addPurpose(consentprovisionpurpose);

		/******************** Cnsnt_Provision_Prpse_Cd ********************************************************************************/
		if(c.getCnsntProvisionPrpseCd() != null) {
			consentprovisionpurpose.setCode(c.getCnsntProvisionPrpseCd());
		}
		/******************** Cnsnt_Provision_Prpse_Dsply ********************************************************************************/
		if(c.getCnsntProvisionPrpseDsply() != null) {
			consentprovisionpurpose.setDisplay(c.getCnsntProvisionPrpseDsply());
		}
		/******************** Cnsnt_Provision_Prpse_Sys ********************************************************************************/
		if(c.getCnsntProvisionPrpseSys() != null) {
			consentprovisionpurpose.setSystem(c.getCnsntProvisionPrpseSys());
		}
		/******************** Cnsnt_Provision_Prpse_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionPrpseUsrSltd() != null) {
			consentprovisionpurpose.setUserSelected(Boolean.parseBoolean(c.getCnsntProvisionPrpseUsrSltd()));
		}
		/******************** Cnsnt_Provision_Prpse_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionPrpseVrsn() != null) {
			consentprovisionpurpose.setVersion(c.getCnsntProvisionPrpseVrsn());
		}
		/******************** consentprovisionsecuritylabel ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentprovisionsecuritylabel =  new org.hl7.fhir.r4.model.Coding();
		consentprovision.addSecurityLabel(consentprovisionsecuritylabel);

		/******************** Cnsnt_Provision_SecurityLbl_Cd ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblCd() != null) {
			consentprovisionsecuritylabel.setCode(c.getCnsntProvisionSecurityLblCd());
		}
		/******************** Cnsnt_Provision_SecurityLbl_Dsply ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblDsply() != null) {
			consentprovisionsecuritylabel.setDisplay(c.getCnsntProvisionSecurityLblDsply());
		}
		/******************** Cnsnt_Provision_SecurityLbl_Sys ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblSys() != null) {
			consentprovisionsecuritylabel.setSystem(c.getCnsntProvisionSecurityLblSys());
		}
		/******************** Cnsnt_Provision_SecurityLbl_UsrSltd ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblUsrSltd() != null) {
			consentprovisionsecuritylabel.setUserSelected(Boolean.parseBoolean(c.getCnsntProvisionSecurityLblUsrSltd()));
		}
		/******************** Cnsnt_Provision_SecurityLbl_Vrsn ********************************************************************************/
		if(c.getCnsntProvisionSecurityLblVrsn() != null) {
			consentprovisionsecuritylabel.setVersion(c.getCnsntProvisionSecurityLblVrsn());
		}
		/******************** consentprovisiontype ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentProvisionTypeEnumFactory consentprovisiontype =  new org.hl7.fhir.r4.model.Consent.ConsentProvisionTypeEnumFactory();
		consentprovision.setType(consentprovisiontype.fromCode(c.getCnsntProvisionTyp()));

		/******************** consentscope ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept consentscope =  new org.hl7.fhir.r4.model.CodeableConcept();
		consent.setScope(consentscope);

		/******************** consentscopecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding consentscopecoding =  new org.hl7.fhir.r4.model.Coding();
		consentscope.addCoding(consentscopecoding);

		/******************** Cnsnt_Scope_Cdg_Cd ********************************************************************************/
		if(c.getCnsntScopeCdgCd() != null) {
			consentscopecoding.setCode(c.getCnsntScopeCdgCd());
		}
		/******************** Cnsnt_Scope_Cdg_Dsply ********************************************************************************/
		if(c.getCnsntScopeCdgDsply() != null) {
			consentscopecoding.setDisplay(c.getCnsntScopeCdgDsply());
		}
		/******************** Cnsnt_Scope_Cdg_Sys ********************************************************************************/
		if(c.getCnsntScopeCdgSys() != null) {
			consentscopecoding.setSystem(c.getCnsntScopeCdgSys());
		}
		/******************** Cnsnt_Scope_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnsntScopeCdgUsrSltd() != null) {
			consentscopecoding.setUserSelected(Boolean.parseBoolean(c.getCnsntScopeCdgUsrSltd()));
		}
		/******************** Cnsnt_Scope_Cdg_Vrsn ********************************************************************************/
		if(c.getCnsntScopeCdgVrsn() != null) {
			consentscopecoding.setVersion(c.getCnsntScopeCdgVrsn());
		}
		/******************** Cnsnt_Scope_Txt ********************************************************************************/
		if(c.getCnsntScopeTxt() != null) {
			consentscope.setText(c.getCnsntScopeTxt());
		}
		/******************** consentsourceattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment consentsourceattachment =  new org.hl7.fhir.r4.model.Attachment();
		consent.setSource(consentsourceattachment);

		/******************** Cnsnt_SrcAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnsntSrcAttchmntCntntTyp() != null) {
			consentsourceattachment.setContentType(c.getCnsntSrcAttchmntCntntTyp());
		}
		/******************** Cnsnt_SrcAttchmnt_Creation ********************************************************************************/
		if(c.getCnsntSrcAttchmntCreation() != null) {
			java.text.SimpleDateFormat Cnsnt_SrcAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnsnt_SrcAttchmnt_Creationdate = Cnsnt_SrcAttchmnt_Creationsdf.parse(c.getCnsntSrcAttchmntCreation());
			consentsourceattachment.setCreation(Cnsnt_SrcAttchmnt_Creationdate);
		}
		/******************** Cnsnt_SrcAttchmnt_Data ********************************************************************************/
		if(c.getCnsntSrcAttchmntData() != null) {
			consentsourceattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnsntSrcAttchmntData()));
		}
		/******************** Cnsnt_SrcAttchmnt_Hash ********************************************************************************/
		if(c.getCnsntSrcAttchmntHash() != null) {
			consentsourceattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnsntSrcAttchmntHash()));
		}
		/******************** Cnsnt_SrcAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnsntSrcAttchmntLnguage() != null) {
			consentsourceattachment.setLanguage(c.getCnsntSrcAttchmntLnguage());
		}
		/******************** Cnsnt_SrcAttchmnt_Sz ********************************************************************************/
		if(c.getCnsntSrcAttchmntSz() != null) {
			consentsourceattachment.setSize(Integer.parseInt(c.getCnsntSrcAttchmntSz()));
		}
		/******************** Cnsnt_SrcAttchmnt_Ttl ********************************************************************************/
		if(c.getCnsntSrcAttchmntTtl() != null) {
			consentsourceattachment.setTitle(c.getCnsntSrcAttchmntTtl());
		}
		/******************** Cnsnt_SrcAttchmnt_Url ********************************************************************************/
		if(c.getCnsntSrcAttchmntUrl() != null) {
			consentsourceattachment.setUrl(c.getCnsntSrcAttchmntUrl());
		}
		/******************** Cnsnt_SrcRfrnc ********************************************************************************/
		if(c.getCnsntSrcRfrnc() != null) {
			consent.setSource( new org.hl7.fhir.r4.model.Reference(c.getCnsntSrcRfrnc()));
		}
		/******************** consentstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentStateEnumFactory consentstatus =  new org.hl7.fhir.r4.model.Consent.ConsentStateEnumFactory();
		consent.setStatus(consentstatus.fromCode(c.getCnsntSts()));

		/******************** consentverification ********************************************************************************/
		org.hl7.fhir.r4.model.Consent.ConsentVerificationComponent consentverification =  new org.hl7.fhir.r4.model.Consent.ConsentVerificationComponent();
		consent.addVerification(consentverification);

		/******************** Cnsnt_Vrfctn_VrfctnDt ********************************************************************************/
		if(c.getCnsntVrfctnVrfctnDt() != null) {
			java.text.SimpleDateFormat Cnsnt_Vrfctn_VrfctnDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnsnt_Vrfctn_VrfctnDtdate = Cnsnt_Vrfctn_VrfctnDtsdf.parse(c.getCnsntVrfctnVrfctnDt());
			consentverification.setVerificationDate(Cnsnt_Vrfctn_VrfctnDtdate);
		}
		/******************** Cnsnt_Vrfctn_Verified ********************************************************************************/
		if(c.getCnsntVrfctnVerified() != null) {
			consentverification.setVerified(Boolean.parseBoolean(c.getCnsntVrfctnVerified()));
		}
		/******************** Cnsnt_Vrfctn_VerifiedWith ********************************************************************************/
		if(c.getCnsntVrfctnVerifiedWith() != null) {
			consentverification.setVerifiedWith( new org.hl7.fhir.r4.model.Reference(c.getCnsntVrfctnVerifiedWith()));
		}
		return consent;
	}
}
