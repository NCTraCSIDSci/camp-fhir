package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ChargeItemDefinition;
public class ChargeItemDefinitionConversion 
{
	public org.hl7.fhir.r4.model.ChargeItemDefinition ChargeItemDefinitions(ChargeItemDefinition c) throws ParseException
	{
		org.hl7.fhir.r4.model.ChargeItemDefinition chargeitemdefinition = new org.hl7.fhir.r4.model.ChargeItemDefinition();

		/******************** id ********************************************************************************/
		chargeitemdefinition.setId(c.getId());

		/******************** chargeitemdefinitionapplicability ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent chargeitemdefinitionapplicability =  new org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent();
		chargeitemdefinition.addApplicability(chargeitemdefinitionapplicability);

		/******************** ChrgItmDfn_Applicability_Dscrptn ********************************************************************************/
		if(c.getChrgItmDfnApplicabilityDscrptn() != null) {
			chargeitemdefinitionapplicability.setDescription(c.getChrgItmDfnApplicabilityDscrptn());
		}
		/******************** ChrgItmDfn_Applicability_Exprsn ********************************************************************************/
		if(c.getChrgItmDfnApplicabilityExprsn() != null) {
			chargeitemdefinitionapplicability.setExpression(c.getChrgItmDfnApplicabilityExprsn());
		}
		/******************** ChrgItmDfn_Applicability_Lnguage ********************************************************************************/
		if(c.getChrgItmDfnApplicabilityLnguage() != null) {
			chargeitemdefinitionapplicability.setLanguage(c.getChrgItmDfnApplicabilityLnguage());
		}
		/******************** ChrgItmDfn_ApprovalDt ********************************************************************************/
		if(c.getChrgItmDfnApprovalDt() != null) {
			java.text.SimpleDateFormat ChrgItmDfn_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItmDfn_ApprovalDtdate = ChrgItmDfn_ApprovalDtsdf.parse(c.getChrgItmDfnApprovalDt());
			chargeitemdefinition.setApprovalDate(ChrgItmDfn_ApprovalDtdate);
		}
		/******************** chargeitemdefinitioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitioncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitemdefinition.setCode(chargeitemdefinitioncode);

		/******************** chargeitemdefinitioncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitioncodecoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemdefinitioncode.addCoding(chargeitemdefinitioncodecoding);

		/******************** ChrgItmDfn_Cd_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnCdCdgCd() != null) {
			chargeitemdefinitioncodecoding.setCode(c.getChrgItmDfnCdCdgCd());
		}
		/******************** ChrgItmDfn_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnCdCdgDsply() != null) {
			chargeitemdefinitioncodecoding.setDisplay(c.getChrgItmDfnCdCdgDsply());
		}
		/******************** ChrgItmDfn_Cd_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnCdCdgSys() != null) {
			chargeitemdefinitioncodecoding.setSystem(c.getChrgItmDfnCdCdgSys());
		}
		/******************** ChrgItmDfn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnCdCdgUsrSltd() != null) {
			chargeitemdefinitioncodecoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmDfnCdCdgUsrSltd()));
		}
		/******************** ChrgItmDfn_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnCdCdgVrsn() != null) {
			chargeitemdefinitioncodecoding.setVersion(c.getChrgItmDfnCdCdgVrsn());
		}
		/******************** ChrgItmDfn_Cd_Txt ********************************************************************************/
		if(c.getChrgItmDfnCdTxt() != null) {
			chargeitemdefinitioncode.setText(c.getChrgItmDfnCdTxt());
		}
		/******************** chargeitemdefinitioncontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail chargeitemdefinitioncontact =  new org.hl7.fhir.r4.model.ContactDetail();
		chargeitemdefinition.addContact(chargeitemdefinitioncontact);

		/******************** ChrgItmDfn_Cntct_Nm ********************************************************************************/
		if(c.getChrgItmDfnCntctNm() != null) {
			chargeitemdefinitioncontact.setName(c.getChrgItmDfnCntctNm());
		}
		/******************** chargeitemdefinitioncontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint chargeitemdefinitioncontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		chargeitemdefinitioncontact.addTelecom(chargeitemdefinitioncontacttelecom);

		/******************** chargeitemdefinitioncontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemdefinitioncontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		chargeitemdefinitioncontacttelecom.setPeriod(chargeitemdefinitioncontacttelecomperiod);

		/******************** ChrgItmDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat ChrgItmDfn_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItmDfn_Cntct_Tlcm_Prd_Enddate = ChrgItmDfn_Cntct_Tlcm_Prd_Endsdf.parse(c.getChrgItmDfnCntctTlcmPrdEnd());
			chargeitemdefinitioncontacttelecomperiod.setEnd(ChrgItmDfn_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** ChrgItmDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat ChrgItmDfn_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItmDfn_Cntct_Tlcm_Prd_Strtdate = ChrgItmDfn_Cntct_Tlcm_Prd_Strtsdf.parse(c.getChrgItmDfnCntctTlcmPrdStrt());
			chargeitemdefinitioncontacttelecomperiod.setStart(ChrgItmDfn_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** ChrgItmDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmRnk() != null) {
			chargeitemdefinitioncontacttelecom.setRank(Integer.parseInt(c.getChrgItmDfnCntctTlcmRnk()));
		}
		/******************** chargeitemdefinitioncontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory chargeitemdefinitioncontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		chargeitemdefinitioncontacttelecom.setSystem(chargeitemdefinitioncontacttelecomsystem.fromCode(c.getChrgItmDfnCntctTlcmSys()));

		/******************** chargeitemdefinitioncontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory chargeitemdefinitioncontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		chargeitemdefinitioncontacttelecom.setUse(chargeitemdefinitioncontacttelecomuse.fromCode(c.getChrgItmDfnCntctTlcmUse()));

		/******************** ChrgItmDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(c.getChrgItmDfnCntctTlcmVl() != null) {
			chargeitemdefinitioncontacttelecom.setValue(c.getChrgItmDfnCntctTlcmVl());
		}
		/******************** ChrgItmDfn_Copyright ********************************************************************************/
		if(c.getChrgItmDfnCopyright() != null) {
			chargeitemdefinition.setCopyright(c.getChrgItmDfnCopyright());
		}
		/******************** ChrgItmDfn_Dt ********************************************************************************/
		if(c.getChrgItmDfnDt() != null) {
			java.text.SimpleDateFormat ChrgItmDfn_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItmDfn_Dtdate = ChrgItmDfn_Dtsdf.parse(c.getChrgItmDfnDt());
			chargeitemdefinition.setDate(ChrgItmDfn_Dtdate);
		}
		/******************** ChrgItmDfn_DerivedFromUri ********************************************************************************/
		if(c.getChrgItmDfnDerivedFromUri() != null) {
			chargeitemdefinition.addDerivedFromUri(c.getChrgItmDfnDerivedFromUri());
		}
		/******************** ChrgItmDfn_Dscrptn ********************************************************************************/
		if(c.getChrgItmDfnDscrptn() != null) {
			chargeitemdefinition.setDescription(c.getChrgItmDfnDscrptn());
		}
		/******************** chargeitemdefinitioneffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemdefinitioneffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		chargeitemdefinition.setEffectivePeriod(chargeitemdefinitioneffectiveperiod);

		/******************** ChrgItmDfn_EfctivePrd_End ********************************************************************************/
		if(c.getChrgItmDfnEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat ChrgItmDfn_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItmDfn_EfctivePrd_Enddate = ChrgItmDfn_EfctivePrd_Endsdf.parse(c.getChrgItmDfnEfctivePrdEnd());
			chargeitemdefinitioneffectiveperiod.setEnd(ChrgItmDfn_EfctivePrd_Enddate);
		}
		/******************** ChrgItmDfn_EfctivePrd_Strt ********************************************************************************/
		if(c.getChrgItmDfnEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat ChrgItmDfn_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItmDfn_EfctivePrd_Strtdate = ChrgItmDfn_EfctivePrd_Strtsdf.parse(c.getChrgItmDfnEfctivePrdStrt());
			chargeitemdefinitioneffectiveperiod.setStart(ChrgItmDfn_EfctivePrd_Strtdate);
		}
		/******************** ChrgItmDfn_Exprmtl ********************************************************************************/
		if(c.getChrgItmDfnExprmtl() != null) {
			chargeitemdefinition.setExperimental(Boolean.parseBoolean(c.getChrgItmDfnExprmtl()));
		}
		/******************** chargeitemdefinitionidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier chargeitemdefinitionidentifier =  new org.hl7.fhir.r4.model.Identifier();
		chargeitemdefinition.addIdentifier(chargeitemdefinitionidentifier);

		/******************** ChrgItmDfn_Id_Assigner ********************************************************************************/
		if(c.getChrgItmDfnIdAssigner() != null) {
			chargeitemdefinitionidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getChrgItmDfnIdAssigner()));
		}
		/******************** chargeitemdefinitionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period chargeitemdefinitionidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		chargeitemdefinitionidentifier.setPeriod(chargeitemdefinitionidentifierperiod);

		/******************** ChrgItmDfn_Id_Prd_End ********************************************************************************/
		if(c.getChrgItmDfnIdPrdEnd() != null) {
			java.text.SimpleDateFormat ChrgItmDfn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItmDfn_Id_Prd_Enddate = ChrgItmDfn_Id_Prd_Endsdf.parse(c.getChrgItmDfnIdPrdEnd());
			chargeitemdefinitionidentifierperiod.setEnd(ChrgItmDfn_Id_Prd_Enddate);
		}
		/******************** ChrgItmDfn_Id_Prd_Strt ********************************************************************************/
		if(c.getChrgItmDfnIdPrdStrt() != null) {
			java.text.SimpleDateFormat ChrgItmDfn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItmDfn_Id_Prd_Strtdate = ChrgItmDfn_Id_Prd_Strtsdf.parse(c.getChrgItmDfnIdPrdStrt());
			chargeitemdefinitionidentifierperiod.setStart(ChrgItmDfn_Id_Prd_Strtdate);
		}
		/******************** ChrgItmDfn_Id_Sys ********************************************************************************/
		if(c.getChrgItmDfnIdSys() != null) {
			chargeitemdefinitionidentifier.setSystem(c.getChrgItmDfnIdSys());
		}
		/******************** chargeitemdefinitionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitemdefinitionidentifier.setType(chargeitemdefinitionidentifiertype);

		/******************** chargeitemdefinitionidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemdefinitionidentifiertype.addCoding(chargeitemdefinitionidentifiertypecoding);

		/******************** ChrgItmDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgCd() != null) {
			chargeitemdefinitionidentifiertypecoding.setCode(c.getChrgItmDfnIdTypCdgCd());
		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgDsply() != null) {
			chargeitemdefinitionidentifiertypecoding.setDisplay(c.getChrgItmDfnIdTypCdgDsply());
		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgSys() != null) {
			chargeitemdefinitionidentifiertypecoding.setSystem(c.getChrgItmDfnIdTypCdgSys());
		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgUsrSltd() != null) {
			chargeitemdefinitionidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmDfnIdTypCdgUsrSltd()));
		}
		/******************** ChrgItmDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnIdTypCdgVrsn() != null) {
			chargeitemdefinitionidentifiertypecoding.setVersion(c.getChrgItmDfnIdTypCdgVrsn());
		}
		/******************** ChrgItmDfn_Id_Typ_Txt ********************************************************************************/
		if(c.getChrgItmDfnIdTypTxt() != null) {
			chargeitemdefinitionidentifiertype.setText(c.getChrgItmDfnIdTypTxt());
		}
		/******************** chargeitemdefinitionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory chargeitemdefinitionidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		chargeitemdefinitionidentifier.setUse(chargeitemdefinitionidentifieruse.fromCode(c.getChrgItmDfnIdUse()));

		/******************** ChrgItmDfn_Id_Vl ********************************************************************************/
		if(c.getChrgItmDfnIdVl() != null) {
			chargeitemdefinitionidentifier.setValue(c.getChrgItmDfnIdVl());
		}
		/******************** ChrgItmDfn_Instance ********************************************************************************/
		if(c.getChrgItmDfnInstance() != null) {
			chargeitemdefinition.addInstance( new org.hl7.fhir.r4.model.Reference(c.getChrgItmDfnInstance()));
		}
		/******************** chargeitemdefinitionjurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionjurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitemdefinition.addJurisdiction(chargeitemdefinitionjurisdiction);

		/******************** chargeitemdefinitionjurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionjurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemdefinitionjurisdiction.addCoding(chargeitemdefinitionjurisdictioncoding);

		/******************** ChrgItmDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgCd() != null) {
			chargeitemdefinitionjurisdictioncoding.setCode(c.getChrgItmDfnJrsdctnCdgCd());
		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgDsply() != null) {
			chargeitemdefinitionjurisdictioncoding.setDisplay(c.getChrgItmDfnJrsdctnCdgDsply());
		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgSys() != null) {
			chargeitemdefinitionjurisdictioncoding.setSystem(c.getChrgItmDfnJrsdctnCdgSys());
		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgUsrSltd() != null) {
			chargeitemdefinitionjurisdictioncoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmDfnJrsdctnCdgUsrSltd()));
		}
		/******************** ChrgItmDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnCdgVrsn() != null) {
			chargeitemdefinitionjurisdictioncoding.setVersion(c.getChrgItmDfnJrsdctnCdgVrsn());
		}
		/******************** ChrgItmDfn_Jrsdctn_Txt ********************************************************************************/
		if(c.getChrgItmDfnJrsdctnTxt() != null) {
			chargeitemdefinitionjurisdiction.setText(c.getChrgItmDfnJrsdctnTxt());
		}
		/******************** ChrgItmDfn_LastReviewDt ********************************************************************************/
		if(c.getChrgItmDfnLastReviewDt() != null) {
			java.text.SimpleDateFormat ChrgItmDfn_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date ChrgItmDfn_LastReviewDtdate = ChrgItmDfn_LastReviewDtsdf.parse(c.getChrgItmDfnLastReviewDt());
			chargeitemdefinition.setLastReviewDate(ChrgItmDfn_LastReviewDtdate);
		}
		/******************** ChrgItmDfn_PartOf ********************************************************************************/
		if(c.getChrgItmDfnPartOf() != null) {
			chargeitemdefinition.addPartOf(c.getChrgItmDfnPartOf());
		}
		/******************** chargeitemdefinitionpropertygroup ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupComponent chargeitemdefinitionpropertygroup =  new org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupComponent();
		chargeitemdefinition.addPropertyGroup(chargeitemdefinitionpropertygroup);

		/******************** chargeitemdefinitionpropertygroupapplicability ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent chargeitemdefinitionpropertygroupapplicability =  new org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionApplicabilityComponent();
		chargeitemdefinitionpropertygroup.addApplicability(chargeitemdefinitionpropertygroupapplicability);

		/******************** ChrgItmDfn_PrptyGrp_Applicability_Dscrptn ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpApplicabilityDscrptn() != null) {
			chargeitemdefinitionpropertygroupapplicability.setDescription(c.getChrgItmDfnPrptyGrpApplicabilityDscrptn());
		}
		/******************** ChrgItmDfn_PrptyGrp_Applicability_Exprsn ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpApplicabilityExprsn() != null) {
			chargeitemdefinitionpropertygroupapplicability.setExpression(c.getChrgItmDfnPrptyGrpApplicabilityExprsn());
		}
		/******************** ChrgItmDfn_PrptyGrp_Applicability_Lnguage ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpApplicabilityLnguage() != null) {
			chargeitemdefinitionpropertygroupapplicability.setLanguage(c.getChrgItmDfnPrptyGrpApplicabilityLnguage());
		}
		/******************** chargeitemdefinitionpropertygrouppricecomponent ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupPriceComponentComponent chargeitemdefinitionpropertygrouppricecomponent =  new org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPropertyGroupPriceComponentComponent();
		chargeitemdefinitionpropertygroup.addPriceComponent(chargeitemdefinitionpropertygrouppricecomponent);

		/******************** chargeitemdefinitionpropertygrouppricecomponentamount ********************************************************************************/
		org.hl7.fhir.r4.model.Money chargeitemdefinitionpropertygrouppricecomponentamount =  new org.hl7.fhir.r4.model.Money();
		chargeitemdefinitionpropertygrouppricecomponent.setAmount(chargeitemdefinitionpropertygrouppricecomponentamount);

		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Crncy ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntAmntCrncy() != null) {
			chargeitemdefinitionpropertygrouppricecomponentamount.setCurrency(c.getChrgItmDfnPrptyGrpPriceCmpntAmntCrncy());
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Amnt_Vl ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntAmntVl() != null) {
			chargeitemdefinitionpropertygrouppricecomponentamount.setValue(Double.parseDouble((c.getChrgItmDfnPrptyGrpPriceCmpntAmntVl())));
		}
		/******************** chargeitemdefinitionpropertygrouppricecomponentcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionpropertygrouppricecomponentcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitemdefinitionpropertygrouppricecomponent.setCode(chargeitemdefinitionpropertygrouppricecomponentcode);

		/******************** chargeitemdefinitionpropertygrouppricecomponentcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionpropertygrouppricecomponentcodecoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemdefinitionpropertygrouppricecomponentcode.addCoding(chargeitemdefinitionpropertygrouppricecomponentcodecoding);

		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgCd() != null) {
			chargeitemdefinitionpropertygrouppricecomponentcodecoding.setCode(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgCd());
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply() != null) {
			chargeitemdefinitionpropertygrouppricecomponentcodecoding.setDisplay(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgDsply());
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgSys() != null) {
			chargeitemdefinitionpropertygrouppricecomponentcodecoding.setSystem(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgSys());
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd() != null) {
			chargeitemdefinitionpropertygrouppricecomponentcodecoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgUsrSltd()));
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn() != null) {
			chargeitemdefinitionpropertygrouppricecomponentcodecoding.setVersion(c.getChrgItmDfnPrptyGrpPriceCmpntCdCdgVrsn());
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Cd_Txt ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntCdTxt() != null) {
			chargeitemdefinitionpropertygrouppricecomponentcode.setText(c.getChrgItmDfnPrptyGrpPriceCmpntCdTxt());
		}
		/******************** ChrgItmDfn_PrptyGrp_PriceCmpnt_Factor ********************************************************************************/
		if(c.getChrgItmDfnPrptyGrpPriceCmpntFactor() != null) {
			chargeitemdefinitionpropertygrouppricecomponent.setFactor(Double.parseDouble((c.getChrgItmDfnPrptyGrpPriceCmpntFactor())));
		}
		/******************** chargeitemdefinitionpropertygrouppricecomponenttype ********************************************************************************/
		org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPriceComponentTypeEnumFactory chargeitemdefinitionpropertygrouppricecomponenttype =  new org.hl7.fhir.r4.model.ChargeItemDefinition.ChargeItemDefinitionPriceComponentTypeEnumFactory();
		chargeitemdefinitionpropertygrouppricecomponent.setType(chargeitemdefinitionpropertygrouppricecomponenttype.fromCode(c.getChrgItmDfnPrptyGrpPriceCmpntTyp()));

		/******************** ChrgItmDfn_Pblshr ********************************************************************************/
		if(c.getChrgItmDfnPblshr() != null) {
			chargeitemdefinition.setPublisher(c.getChrgItmDfnPblshr());
		}
		/******************** ChrgItmDfn_Replaces ********************************************************************************/
		if(c.getChrgItmDfnReplaces() != null) {
			chargeitemdefinition.addReplaces(c.getChrgItmDfnReplaces());
		}
		/******************** chargeitemdefinitionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory chargeitemdefinitionstatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		chargeitemdefinition.setStatus(chargeitemdefinitionstatus.fromCode(c.getChrgItmDfnSts()));

		/******************** ChrgItmDfn_Ttl ********************************************************************************/
		if(c.getChrgItmDfnTtl() != null) {
			chargeitemdefinition.setTitle(c.getChrgItmDfnTtl());
		}
		/******************** ChrgItmDfn_Url ********************************************************************************/
		if(c.getChrgItmDfnUrl() != null) {
			chargeitemdefinition.setUrl(c.getChrgItmDfnUrl());
		}
		/******************** chargeitemdefinitionusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext chargeitemdefinitionusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		chargeitemdefinition.addUseContext(chargeitemdefinitionusecontext);

		/******************** chargeitemdefinitionusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		chargeitemdefinitionusecontext.setCode(chargeitemdefinitionusecontextcode);

		/******************** ChrgItmDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdCd() != null) {
			chargeitemdefinitionusecontextcode.setCode(c.getChrgItmDfnUseCntxtCdCd());
		}
		/******************** ChrgItmDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdDsply() != null) {
			chargeitemdefinitionusecontextcode.setDisplay(c.getChrgItmDfnUseCntxtCdDsply());
		}
		/******************** ChrgItmDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdSys() != null) {
			chargeitemdefinitionusecontextcode.setSystem(c.getChrgItmDfnUseCntxtCdSys());
		}
		/******************** ChrgItmDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdUsrSltd() != null) {
			chargeitemdefinitionusecontextcode.setUserSelected(Boolean.parseBoolean(c.getChrgItmDfnUseCntxtCdUsrSltd()));
		}
		/******************** ChrgItmDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtCdVrsn() != null) {
			chargeitemdefinitionusecontextcode.setVersion(c.getChrgItmDfnUseCntxtCdVrsn());
		}
		/******************** chargeitemdefinitionusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept chargeitemdefinitionusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		chargeitemdefinitionusecontext.setValue(chargeitemdefinitionusecontextvaluecodeableconcept);

		/******************** chargeitemdefinitionusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding chargeitemdefinitionusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		chargeitemdefinitionusecontextvaluecodeableconcept.addCoding(chargeitemdefinitionusecontextvaluecodeableconceptcoding);

		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgCd() != null) {
			chargeitemdefinitionusecontextvaluecodeableconceptcoding.setCode(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgDsply() != null) {
			chargeitemdefinitionusecontextvaluecodeableconceptcoding.setDisplay(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgSys() != null) {
			chargeitemdefinitionusecontextvaluecodeableconceptcoding.setSystem(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			chargeitemdefinitionusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn() != null) {
			chargeitemdefinitionusecontextvaluecodeableconceptcoding.setVersion(c.getChrgItmDfnUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** ChrgItmDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlCdbleCncptTxt() != null) {
			chargeitemdefinitionusecontextvaluecodeableconcept.setText(c.getChrgItmDfnUseCntxtVlCdbleCncptTxt());
		}
		/******************** chargeitemdefinitionusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemdefinitionusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		chargeitemdefinitionusecontext.setValue(chargeitemdefinitionusecontextvaluequantity);

		/******************** ChrgItmDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlQntyCd() != null) {
			chargeitemdefinitionusecontextvaluequantity.setCode(c.getChrgItmDfnUseCntxtVlQntyCd());
		}
		/******************** chargeitemdefinitionusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory chargeitemdefinitionusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		chargeitemdefinitionusecontextvaluequantity.setComparator(chargeitemdefinitionusecontextvaluequantitycomparator.fromCode(c.getChrgItmDfnUseCntxtVlQntyCmprtr()));

		/******************** ChrgItmDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlQntySys() != null) {
			chargeitemdefinitionusecontextvaluequantity.setSystem(c.getChrgItmDfnUseCntxtVlQntySys());
		}
		/******************** ChrgItmDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlQntyUnt() != null) {
			chargeitemdefinitionusecontextvaluequantity.setUnit(c.getChrgItmDfnUseCntxtVlQntyUnt());
		}
		/******************** ChrgItmDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlQntyVl() != null) {
			chargeitemdefinitionusecontextvaluequantity.setValue(Double.parseDouble((c.getChrgItmDfnUseCntxtVlQntyVl())));
		}
		/******************** chargeitemdefinitionusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range chargeitemdefinitionusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		chargeitemdefinitionusecontext.setValue(chargeitemdefinitionusecontextvaluerange);

		/******************** chargeitemdefinitionusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemdefinitionusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		chargeitemdefinitionusecontextvaluerange.setHigh(chargeitemdefinitionusecontextvaluerangehigh);

		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngHiCd() != null) {
			chargeitemdefinitionusecontextvaluerangehigh.setCode(c.getChrgItmDfnUseCntxtVlRngHiCd());
		}
		/******************** chargeitemdefinitionusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory chargeitemdefinitionusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		chargeitemdefinitionusecontextvaluerangehigh.setComparator(chargeitemdefinitionusecontextvaluerangehighcomparator.fromCode(c.getChrgItmDfnUseCntxtVlRngHiCmprtr()));

		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngHiSys() != null) {
			chargeitemdefinitionusecontextvaluerangehigh.setSystem(c.getChrgItmDfnUseCntxtVlRngHiSys());
		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngHiUnt() != null) {
			chargeitemdefinitionusecontextvaluerangehigh.setUnit(c.getChrgItmDfnUseCntxtVlRngHiUnt());
		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngHiVl() != null) {
			chargeitemdefinitionusecontextvaluerangehigh.setValue(Double.parseDouble((c.getChrgItmDfnUseCntxtVlRngHiVl())));
		}
		/******************** chargeitemdefinitionusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity chargeitemdefinitionusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		chargeitemdefinitionusecontextvaluerange.setLow(chargeitemdefinitionusecontextvaluerangelow);

		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngLwCd() != null) {
			chargeitemdefinitionusecontextvaluerangelow.setCode(c.getChrgItmDfnUseCntxtVlRngLwCd());
		}
		/******************** chargeitemdefinitionusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory chargeitemdefinitionusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		chargeitemdefinitionusecontextvaluerangelow.setComparator(chargeitemdefinitionusecontextvaluerangelowcomparator.fromCode(c.getChrgItmDfnUseCntxtVlRngLwCmprtr()));

		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngLwSys() != null) {
			chargeitemdefinitionusecontextvaluerangelow.setSystem(c.getChrgItmDfnUseCntxtVlRngLwSys());
		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngLwUnt() != null) {
			chargeitemdefinitionusecontextvaluerangelow.setUnit(c.getChrgItmDfnUseCntxtVlRngLwUnt());
		}
		/******************** ChrgItmDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRngLwVl() != null) {
			chargeitemdefinitionusecontextvaluerangelow.setValue(Double.parseDouble((c.getChrgItmDfnUseCntxtVlRngLwVl())));
		}
		/******************** ChrgItmDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(c.getChrgItmDfnUseCntxtVlRfrnc() != null) {
			chargeitemdefinitionusecontext.setValue( new org.hl7.fhir.r4.model.Reference(c.getChrgItmDfnUseCntxtVlRfrnc()));
		}
		/******************** ChrgItmDfn_Vrsn ********************************************************************************/
		if(c.getChrgItmDfnVrsn() != null) {
			chargeitemdefinition.setVersion(c.getChrgItmDfnVrsn());
		}
		return chargeitemdefinition;
	}
}
