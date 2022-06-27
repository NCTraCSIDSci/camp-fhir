package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Contract;
public class ContractConversion 
{
	public org.hl7.fhir.r4.model.Contract Contracts(Contract c) throws ParseException
	{
		org.hl7.fhir.r4.model.Contract contract = new org.hl7.fhir.r4.model.Contract();

		/******************** id ********************************************************************************/
		contract.setId(c.getId());

		/******************** Cnct_Alias ********************************************************************************/
		if(c.getCnctAlias() != null) {
			contract.addAlias(c.getCnctAlias());
		}
		/******************** contractapplies ********************************************************************************/
		org.hl7.fhir.r4.model.Period contractapplies =  new org.hl7.fhir.r4.model.Period();
		contract.setApplies(contractapplies);

		/******************** Cnct_Applies_End ********************************************************************************/
		if(c.getCnctAppliesEnd() != null) {
			java.text.SimpleDateFormat Cnct_Applies_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Applies_Enddate = Cnct_Applies_Endsdf.parse(c.getCnctAppliesEnd());
			contractapplies.setEnd(Cnct_Applies_Enddate);
		}
		/******************** Cnct_Applies_Strt ********************************************************************************/
		if(c.getCnctAppliesStrt() != null) {
			java.text.SimpleDateFormat Cnct_Applies_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Applies_Strtdate = Cnct_Applies_Strtsdf.parse(c.getCnctAppliesStrt());
			contractapplies.setStart(Cnct_Applies_Strtdate);
		}
		/******************** Cnct_Athr ********************************************************************************/
		if(c.getCnctAthr() != null) {
			contract.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getCnctAthr()));
		}
		/******************** Cnct_Athrity ********************************************************************************/
		if(c.getCnctAthrity() != null) {
			contract.addAuthority( new org.hl7.fhir.r4.model.Reference(c.getCnctAthrity()));
		}
		/******************** contractcontentdefinition ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContentDefinitionComponent contractcontentdefinition =  new org.hl7.fhir.r4.model.Contract.ContentDefinitionComponent();
		contract.setContentDefinition(contractcontentdefinition);

		/******************** Cnct_CntntDfn_Copyright ********************************************************************************/
		if(c.getCnctCntntDfnCopyright() != null) {
			contractcontentdefinition.setCopyright(c.getCnctCntntDfnCopyright());
		}
		/******************** Cnct_CntntDfn_PublicationDt ********************************************************************************/
		if(c.getCnctCntntDfnPublicationDt() != null) {
			java.text.SimpleDateFormat Cnct_CntntDfn_PublicationDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_CntntDfn_PublicationDtdate = Cnct_CntntDfn_PublicationDtsdf.parse(c.getCnctCntntDfnPublicationDt());
			contractcontentdefinition.setPublicationDate(Cnct_CntntDfn_PublicationDtdate);
		}
		/******************** contractcontentdefinitionpublicationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractPublicationStatusEnumFactory contractcontentdefinitionpublicationstatus =  new org.hl7.fhir.r4.model.Contract.ContractPublicationStatusEnumFactory();
		contractcontentdefinition.setPublicationStatus(contractcontentdefinitionpublicationstatus.fromCode(c.getCnctCntntDfnPublicationSts()));

		/******************** Cnct_CntntDfn_Pblshr ********************************************************************************/
		if(c.getCnctCntntDfnPblshr() != null) {
			contractcontentdefinition.setPublisher( new org.hl7.fhir.r4.model.Reference(c.getCnctCntntDfnPblshr()));
		}
		/******************** contractcontentdefinitionsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractcontentdefinitionsubtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contractcontentdefinition.setSubType(contractcontentdefinitionsubtype);

		/******************** contractcontentdefinitionsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractcontentdefinitionsubtypecoding =  new org.hl7.fhir.r4.model.Coding();
		contractcontentdefinitionsubtype.addCoding(contractcontentdefinitionsubtypecoding);

		/******************** Cnct_CntntDfn_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgCd() != null) {
			contractcontentdefinitionsubtypecoding.setCode(c.getCnctCntntDfnSubTypCdgCd());
		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgDsply() != null) {
			contractcontentdefinitionsubtypecoding.setDisplay(c.getCnctCntntDfnSubTypCdgDsply());
		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgSys() != null) {
			contractcontentdefinitionsubtypecoding.setSystem(c.getCnctCntntDfnSubTypCdgSys());
		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgUsrSltd() != null) {
			contractcontentdefinitionsubtypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctCntntDfnSubTypCdgUsrSltd()));
		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctCntntDfnSubTypCdgVrsn() != null) {
			contractcontentdefinitionsubtypecoding.setVersion(c.getCnctCntntDfnSubTypCdgVrsn());
		}
		/******************** Cnct_CntntDfn_SubTyp_Txt ********************************************************************************/
		if(c.getCnctCntntDfnSubTypTxt() != null) {
			contractcontentdefinitionsubtype.setText(c.getCnctCntntDfnSubTypTxt());
		}
		/******************** contractcontentdefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractcontentdefinitiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contractcontentdefinition.setType(contractcontentdefinitiontype);

		/******************** contractcontentdefinitiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractcontentdefinitiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		contractcontentdefinitiontype.addCoding(contractcontentdefinitiontypecoding);

		/******************** Cnct_CntntDfn_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgCd() != null) {
			contractcontentdefinitiontypecoding.setCode(c.getCnctCntntDfnTypCdgCd());
		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgDsply() != null) {
			contractcontentdefinitiontypecoding.setDisplay(c.getCnctCntntDfnTypCdgDsply());
		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgSys() != null) {
			contractcontentdefinitiontypecoding.setSystem(c.getCnctCntntDfnTypCdgSys());
		}
		/******************** Cnct_CntntDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgUsrSltd() != null) {
			contractcontentdefinitiontypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctCntntDfnTypCdgUsrSltd()));
		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctCntntDfnTypCdgVrsn() != null) {
			contractcontentdefinitiontypecoding.setVersion(c.getCnctCntntDfnTypCdgVrsn());
		}
		/******************** Cnct_CntntDfn_Typ_Txt ********************************************************************************/
		if(c.getCnctCntntDfnTypTxt() != null) {
			contractcontentdefinitiontype.setText(c.getCnctCntntDfnTypTxt());
		}
		/******************** contractcontentderivative ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractcontentderivative =  new org.hl7.fhir.r4.model.CodeableConcept();
		contract.setContentDerivative(contractcontentderivative);

		/******************** contractcontentderivativecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractcontentderivativecoding =  new org.hl7.fhir.r4.model.Coding();
		contractcontentderivative.addCoding(contractcontentderivativecoding);

		/******************** Cnct_CntntDerivative_Cdg_Cd ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgCd() != null) {
			contractcontentderivativecoding.setCode(c.getCnctCntntDerivativeCdgCd());
		}
		/******************** Cnct_CntntDerivative_Cdg_Dsply ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgDsply() != null) {
			contractcontentderivativecoding.setDisplay(c.getCnctCntntDerivativeCdgDsply());
		}
		/******************** Cnct_CntntDerivative_Cdg_Sys ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgSys() != null) {
			contractcontentderivativecoding.setSystem(c.getCnctCntntDerivativeCdgSys());
		}
		/******************** Cnct_CntntDerivative_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgUsrSltd() != null) {
			contractcontentderivativecoding.setUserSelected(Boolean.parseBoolean(c.getCnctCntntDerivativeCdgUsrSltd()));
		}
		/******************** Cnct_CntntDerivative_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctCntntDerivativeCdgVrsn() != null) {
			contractcontentderivativecoding.setVersion(c.getCnctCntntDerivativeCdgVrsn());
		}
		/******************** Cnct_CntntDerivative_Txt ********************************************************************************/
		if(c.getCnctCntntDerivativeTxt() != null) {
			contractcontentderivative.setText(c.getCnctCntntDerivativeTxt());
		}
		/******************** Cnct_Domain ********************************************************************************/
		if(c.getCnctDomain() != null) {
			contract.addDomain( new org.hl7.fhir.r4.model.Reference(c.getCnctDomain()));
		}
		/******************** contractexpirationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractexpirationtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contract.setExpirationType(contractexpirationtype);

		/******************** contractexpirationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractexpirationtypecoding =  new org.hl7.fhir.r4.model.Coding();
		contractexpirationtype.addCoding(contractexpirationtypecoding);

		/******************** Cnct_ExpirationTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctExpirationTypCdgCd() != null) {
			contractexpirationtypecoding.setCode(c.getCnctExpirationTypCdgCd());
		}
		/******************** Cnct_ExpirationTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctExpirationTypCdgDsply() != null) {
			contractexpirationtypecoding.setDisplay(c.getCnctExpirationTypCdgDsply());
		}
		/******************** Cnct_ExpirationTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctExpirationTypCdgSys() != null) {
			contractexpirationtypecoding.setSystem(c.getCnctExpirationTypCdgSys());
		}
		/******************** Cnct_ExpirationTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctExpirationTypCdgUsrSltd() != null) {
			contractexpirationtypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctExpirationTypCdgUsrSltd()));
		}
		/******************** Cnct_ExpirationTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctExpirationTypCdgVrsn() != null) {
			contractexpirationtypecoding.setVersion(c.getCnctExpirationTypCdgVrsn());
		}
		/******************** Cnct_ExpirationTyp_Txt ********************************************************************************/
		if(c.getCnctExpirationTypTxt() != null) {
			contractexpirationtype.setText(c.getCnctExpirationTypTxt());
		}
		/******************** contractfriendly ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.FriendlyLanguageComponent contractfriendly =  new org.hl7.fhir.r4.model.Contract.FriendlyLanguageComponent();
		contract.addFriendly(contractfriendly);

		/******************** contractfriendlycontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractfriendlycontentattachment =  new org.hl7.fhir.r4.model.Attachment();
		contractfriendly.setContent(contractfriendlycontentattachment);

		/******************** Cnct_Friendly_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntCntntTyp() != null) {
			contractfriendlycontentattachment.setContentType(c.getCnctFriendlyCntntAttchmntCntntTyp());
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntCreation() != null) {
			java.text.SimpleDateFormat Cnct_Friendly_CntntAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Friendly_CntntAttchmnt_Creationdate = Cnct_Friendly_CntntAttchmnt_Creationsdf.parse(c.getCnctFriendlyCntntAttchmntCreation());
			contractfriendlycontentattachment.setCreation(Cnct_Friendly_CntntAttchmnt_Creationdate);
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntData() != null) {
			contractfriendlycontentattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctFriendlyCntntAttchmntData()));
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntHash() != null) {
			contractfriendlycontentattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctFriendlyCntntAttchmntHash()));
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntLnguage() != null) {
			contractfriendlycontentattachment.setLanguage(c.getCnctFriendlyCntntAttchmntLnguage());
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntSz() != null) {
			contractfriendlycontentattachment.setSize(Integer.parseInt(c.getCnctFriendlyCntntAttchmntSz()));
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntTtl() != null) {
			contractfriendlycontentattachment.setTitle(c.getCnctFriendlyCntntAttchmntTtl());
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCnctFriendlyCntntAttchmntUrl() != null) {
			contractfriendlycontentattachment.setUrl(c.getCnctFriendlyCntntAttchmntUrl());
		}
		/******************** Cnct_Friendly_CntntRfrnc ********************************************************************************/
		if(c.getCnctFriendlyCntntRfrnc() != null) {
			contractfriendly.setContent( new org.hl7.fhir.r4.model.Reference(c.getCnctFriendlyCntntRfrnc()));
		}
		/******************** contractidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contractidentifier =  new org.hl7.fhir.r4.model.Identifier();
		contract.addIdentifier(contractidentifier);

		/******************** Cnct_Id_Assigner ********************************************************************************/
		if(c.getCnctIdAssigner() != null) {
			contractidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCnctIdAssigner()));
		}
		/******************** contractidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contractidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		contractidentifier.setPeriod(contractidentifierperiod);

		/******************** Cnct_Id_Prd_End ********************************************************************************/
		if(c.getCnctIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cnct_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Id_Prd_Enddate = Cnct_Id_Prd_Endsdf.parse(c.getCnctIdPrdEnd());
			contractidentifierperiod.setEnd(Cnct_Id_Prd_Enddate);
		}
		/******************** Cnct_Id_Prd_Strt ********************************************************************************/
		if(c.getCnctIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cnct_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Id_Prd_Strtdate = Cnct_Id_Prd_Strtsdf.parse(c.getCnctIdPrdStrt());
			contractidentifierperiod.setStart(Cnct_Id_Prd_Strtdate);
		}
		/******************** Cnct_Id_Sys ********************************************************************************/
		if(c.getCnctIdSys() != null) {
			contractidentifier.setSystem(c.getCnctIdSys());
		}
		/******************** contractidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contractidentifier.setType(contractidentifiertype);

		/******************** contractidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		contractidentifiertype.addCoding(contractidentifiertypecoding);

		/******************** Cnct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctIdTypCdgCd() != null) {
			contractidentifiertypecoding.setCode(c.getCnctIdTypCdgCd());
		}
		/******************** Cnct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctIdTypCdgDsply() != null) {
			contractidentifiertypecoding.setDisplay(c.getCnctIdTypCdgDsply());
		}
		/******************** Cnct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctIdTypCdgSys() != null) {
			contractidentifiertypecoding.setSystem(c.getCnctIdTypCdgSys());
		}
		/******************** Cnct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctIdTypCdgUsrSltd() != null) {
			contractidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctIdTypCdgUsrSltd()));
		}
		/******************** Cnct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctIdTypCdgVrsn() != null) {
			contractidentifiertypecoding.setVersion(c.getCnctIdTypCdgVrsn());
		}
		/******************** Cnct_Id_Typ_Txt ********************************************************************************/
		if(c.getCnctIdTypTxt() != null) {
			contractidentifiertype.setText(c.getCnctIdTypTxt());
		}
		/******************** contractidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory contractidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		contractidentifier.setUse(contractidentifieruse.fromCode(c.getCnctIdUse()));

		/******************** Cnct_Id_Vl ********************************************************************************/
		if(c.getCnctIdVl() != null) {
			contractidentifier.setValue(c.getCnctIdVl());
		}
		/******************** Cnct_InstantiatesCanonical ********************************************************************************/
		if(c.getCnctInstantiatesCanonical() != null) {
			contract.setInstantiatesCanonical( new org.hl7.fhir.r4.model.Reference(c.getCnctInstantiatesCanonical()));
		}
		/******************** Cnct_InstantiatesUri ********************************************************************************/
		if(c.getCnctInstantiatesUri() != null) {
			contract.setInstantiatesUri(c.getCnctInstantiatesUri());
		}
		/******************** Cnct_Issued ********************************************************************************/
		if(c.getCnctIssued() != null) {
			java.text.SimpleDateFormat Cnct_Issuedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Issueddate = Cnct_Issuedsdf.parse(c.getCnctIssued());
			contract.setIssued(Cnct_Issueddate);
		}
		/******************** contractlegal ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.LegalLanguageComponent contractlegal =  new org.hl7.fhir.r4.model.Contract.LegalLanguageComponent();
		contract.addLegal(contractlegal);

		/******************** contractlegalcontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractlegalcontentattachment =  new org.hl7.fhir.r4.model.Attachment();
		contractlegal.setContent(contractlegalcontentattachment);

		/******************** Cnct_Legal_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntCntntTyp() != null) {
			contractlegalcontentattachment.setContentType(c.getCnctLegalCntntAttchmntCntntTyp());
		}
		/******************** Cnct_Legal_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntCreation() != null) {
			java.text.SimpleDateFormat Cnct_Legal_CntntAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Legal_CntntAttchmnt_Creationdate = Cnct_Legal_CntntAttchmnt_Creationsdf.parse(c.getCnctLegalCntntAttchmntCreation());
			contractlegalcontentattachment.setCreation(Cnct_Legal_CntntAttchmnt_Creationdate);
		}
		/******************** Cnct_Legal_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntData() != null) {
			contractlegalcontentattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctLegalCntntAttchmntData()));
		}
		/******************** Cnct_Legal_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntHash() != null) {
			contractlegalcontentattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctLegalCntntAttchmntHash()));
		}
		/******************** Cnct_Legal_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntLnguage() != null) {
			contractlegalcontentattachment.setLanguage(c.getCnctLegalCntntAttchmntLnguage());
		}
		/******************** Cnct_Legal_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntSz() != null) {
			contractlegalcontentattachment.setSize(Integer.parseInt(c.getCnctLegalCntntAttchmntSz()));
		}
		/******************** Cnct_Legal_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntTtl() != null) {
			contractlegalcontentattachment.setTitle(c.getCnctLegalCntntAttchmntTtl());
		}
		/******************** Cnct_Legal_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCnctLegalCntntAttchmntUrl() != null) {
			contractlegalcontentattachment.setUrl(c.getCnctLegalCntntAttchmntUrl());
		}
		/******************** Cnct_Legal_CntntRfrnc ********************************************************************************/
		if(c.getCnctLegalCntntRfrnc() != null) {
			contractlegal.setContent( new org.hl7.fhir.r4.model.Reference(c.getCnctLegalCntntRfrnc()));
		}
		/******************** contractlegalstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractlegalstate =  new org.hl7.fhir.r4.model.CodeableConcept();
		contract.setLegalState(contractlegalstate);

		/******************** contractlegalstatecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractlegalstatecoding =  new org.hl7.fhir.r4.model.Coding();
		contractlegalstate.addCoding(contractlegalstatecoding);

		/******************** Cnct_LegalState_Cdg_Cd ********************************************************************************/
		if(c.getCnctLegalStateCdgCd() != null) {
			contractlegalstatecoding.setCode(c.getCnctLegalStateCdgCd());
		}
		/******************** Cnct_LegalState_Cdg_Dsply ********************************************************************************/
		if(c.getCnctLegalStateCdgDsply() != null) {
			contractlegalstatecoding.setDisplay(c.getCnctLegalStateCdgDsply());
		}
		/******************** Cnct_LegalState_Cdg_Sys ********************************************************************************/
		if(c.getCnctLegalStateCdgSys() != null) {
			contractlegalstatecoding.setSystem(c.getCnctLegalStateCdgSys());
		}
		/******************** Cnct_LegalState_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctLegalStateCdgUsrSltd() != null) {
			contractlegalstatecoding.setUserSelected(Boolean.parseBoolean(c.getCnctLegalStateCdgUsrSltd()));
		}
		/******************** Cnct_LegalState_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctLegalStateCdgVrsn() != null) {
			contractlegalstatecoding.setVersion(c.getCnctLegalStateCdgVrsn());
		}
		/******************** Cnct_LegalState_Txt ********************************************************************************/
		if(c.getCnctLegalStateTxt() != null) {
			contractlegalstate.setText(c.getCnctLegalStateTxt());
		}
		/******************** contractlegallybindingattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractlegallybindingattachment =  new org.hl7.fhir.r4.model.Attachment();
		contract.setLegallyBinding(contractlegallybindingattachment);

		/******************** Cnct_LegallyBindingAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntCntntTyp() != null) {
			contractlegallybindingattachment.setContentType(c.getCnctLegallyBindingAttchmntCntntTyp());
		}
		/******************** Cnct_LegallyBindingAttchmnt_Creation ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntCreation() != null) {
			java.text.SimpleDateFormat Cnct_LegallyBindingAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_LegallyBindingAttchmnt_Creationdate = Cnct_LegallyBindingAttchmnt_Creationsdf.parse(c.getCnctLegallyBindingAttchmntCreation());
			contractlegallybindingattachment.setCreation(Cnct_LegallyBindingAttchmnt_Creationdate);
		}
		/******************** Cnct_LegallyBindingAttchmnt_Data ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntData() != null) {
			contractlegallybindingattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctLegallyBindingAttchmntData()));
		}
		/******************** Cnct_LegallyBindingAttchmnt_Hash ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntHash() != null) {
			contractlegallybindingattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctLegallyBindingAttchmntHash()));
		}
		/******************** Cnct_LegallyBindingAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntLnguage() != null) {
			contractlegallybindingattachment.setLanguage(c.getCnctLegallyBindingAttchmntLnguage());
		}
		/******************** Cnct_LegallyBindingAttchmnt_Sz ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntSz() != null) {
			contractlegallybindingattachment.setSize(Integer.parseInt(c.getCnctLegallyBindingAttchmntSz()));
		}
		/******************** Cnct_LegallyBindingAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntTtl() != null) {
			contractlegallybindingattachment.setTitle(c.getCnctLegallyBindingAttchmntTtl());
		}
		/******************** Cnct_LegallyBindingAttchmnt_Url ********************************************************************************/
		if(c.getCnctLegallyBindingAttchmntUrl() != null) {
			contractlegallybindingattachment.setUrl(c.getCnctLegallyBindingAttchmntUrl());
		}
		/******************** Cnct_LegallyBindingRfrnc ********************************************************************************/
		if(c.getCnctLegallyBindingRfrnc() != null) {
			contract.setLegallyBinding( new org.hl7.fhir.r4.model.Reference(c.getCnctLegallyBindingRfrnc()));
		}
		/******************** Cnct_Nm ********************************************************************************/
		if(c.getCnctNm() != null) {
			contract.setName(c.getCnctNm());
		}
		/******************** Cnct_RelevantHis ********************************************************************************/
		if(c.getCnctRelevantHis() != null) {
			contract.addRelevantHistory( new org.hl7.fhir.r4.model.Reference(c.getCnctRelevantHis()));
		}
		/******************** contractrule ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ComputableLanguageComponent contractrule =  new org.hl7.fhir.r4.model.Contract.ComputableLanguageComponent();
		contract.addRule(contractrule);

		/******************** contractrulecontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractrulecontentattachment =  new org.hl7.fhir.r4.model.Attachment();
		contractrule.setContent(contractrulecontentattachment);

		/******************** Cnct_Rule_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntCntntTyp() != null) {
			contractrulecontentattachment.setContentType(c.getCnctRuleCntntAttchmntCntntTyp());
		}
		/******************** Cnct_Rule_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntCreation() != null) {
			java.text.SimpleDateFormat Cnct_Rule_CntntAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Rule_CntntAttchmnt_Creationdate = Cnct_Rule_CntntAttchmnt_Creationsdf.parse(c.getCnctRuleCntntAttchmntCreation());
			contractrulecontentattachment.setCreation(Cnct_Rule_CntntAttchmnt_Creationdate);
		}
		/******************** Cnct_Rule_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntData() != null) {
			contractrulecontentattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctRuleCntntAttchmntData()));
		}
		/******************** Cnct_Rule_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntHash() != null) {
			contractrulecontentattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctRuleCntntAttchmntHash()));
		}
		/******************** Cnct_Rule_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntLnguage() != null) {
			contractrulecontentattachment.setLanguage(c.getCnctRuleCntntAttchmntLnguage());
		}
		/******************** Cnct_Rule_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntSz() != null) {
			contractrulecontentattachment.setSize(Integer.parseInt(c.getCnctRuleCntntAttchmntSz()));
		}
		/******************** Cnct_Rule_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntTtl() != null) {
			contractrulecontentattachment.setTitle(c.getCnctRuleCntntAttchmntTtl());
		}
		/******************** Cnct_Rule_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCnctRuleCntntAttchmntUrl() != null) {
			contractrulecontentattachment.setUrl(c.getCnctRuleCntntAttchmntUrl());
		}
		/******************** Cnct_Rule_CntntRfrnc ********************************************************************************/
		if(c.getCnctRuleCntntRfrnc() != null) {
			contractrule.setContent( new org.hl7.fhir.r4.model.Reference(c.getCnctRuleCntntRfrnc()));
		}
		/******************** contractscope ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractscope =  new org.hl7.fhir.r4.model.CodeableConcept();
		contract.setScope(contractscope);

		/******************** contractscopecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractscopecoding =  new org.hl7.fhir.r4.model.Coding();
		contractscope.addCoding(contractscopecoding);

		/******************** Cnct_Scope_Cdg_Cd ********************************************************************************/
		if(c.getCnctScopeCdgCd() != null) {
			contractscopecoding.setCode(c.getCnctScopeCdgCd());
		}
		/******************** Cnct_Scope_Cdg_Dsply ********************************************************************************/
		if(c.getCnctScopeCdgDsply() != null) {
			contractscopecoding.setDisplay(c.getCnctScopeCdgDsply());
		}
		/******************** Cnct_Scope_Cdg_Sys ********************************************************************************/
		if(c.getCnctScopeCdgSys() != null) {
			contractscopecoding.setSystem(c.getCnctScopeCdgSys());
		}
		/******************** Cnct_Scope_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctScopeCdgUsrSltd() != null) {
			contractscopecoding.setUserSelected(Boolean.parseBoolean(c.getCnctScopeCdgUsrSltd()));
		}
		/******************** Cnct_Scope_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctScopeCdgVrsn() != null) {
			contractscopecoding.setVersion(c.getCnctScopeCdgVrsn());
		}
		/******************** Cnct_Scope_Txt ********************************************************************************/
		if(c.getCnctScopeTxt() != null) {
			contractscope.setText(c.getCnctScopeTxt());
		}
		/******************** contractsigner ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.SignatoryComponent contractsigner =  new org.hl7.fhir.r4.model.Contract.SignatoryComponent();
		contract.addSigner(contractsigner);

		/******************** Cnct_Signer_Party ********************************************************************************/
		if(c.getCnctSignerParty() != null) {
			contractsigner.setParty( new org.hl7.fhir.r4.model.Reference(c.getCnctSignerParty()));
		}
		/******************** contractsignersignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature contractsignersignature =  new org.hl7.fhir.r4.model.Signature();
		contractsigner.addSignature(contractsignersignature);

		/******************** Cnct_Signer_Signature_Data ********************************************************************************/
		if(c.getCnctSignerSignatureData() != null) {
			contractsignersignature.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctSignerSignatureData()));
		}
		/******************** Cnct_Signer_Signature_OnBehalfOf ********************************************************************************/
		if(c.getCnctSignerSignatureOnBehalfOf() != null) {
			contractsignersignature.setOnBehalfOf( new org.hl7.fhir.r4.model.Reference(c.getCnctSignerSignatureOnBehalfOf()));
		}
		/******************** Cnct_Signer_Signature_SigFrmat ********************************************************************************/
		if(c.getCnctSignerSignatureSigFrmat() != null) {
			contractsignersignature.setSigFormat(c.getCnctSignerSignatureSigFrmat());
		}
		/******************** Cnct_Signer_Signature_TarFrmat ********************************************************************************/
		if(c.getCnctSignerSignatureTarFrmat() != null) {
			contractsignersignature.setTargetFormat(c.getCnctSignerSignatureTarFrmat());
		}
		/******************** contractsignersignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractsignersignaturetype =  new org.hl7.fhir.r4.model.Coding();
		contractsignersignature.addType(contractsignersignaturetype);

		/******************** Cnct_Signer_Signature_Typ_Cd ********************************************************************************/
		if(c.getCnctSignerSignatureTypCd() != null) {
			contractsignersignaturetype.setCode(c.getCnctSignerSignatureTypCd());
		}
		/******************** Cnct_Signer_Signature_Typ_Dsply ********************************************************************************/
		if(c.getCnctSignerSignatureTypDsply() != null) {
			contractsignersignaturetype.setDisplay(c.getCnctSignerSignatureTypDsply());
		}
		/******************** Cnct_Signer_Signature_Typ_Sys ********************************************************************************/
		if(c.getCnctSignerSignatureTypSys() != null) {
			contractsignersignaturetype.setSystem(c.getCnctSignerSignatureTypSys());
		}
		/******************** Cnct_Signer_Signature_Typ_UsrSltd ********************************************************************************/
		if(c.getCnctSignerSignatureTypUsrSltd() != null) {
			contractsignersignaturetype.setUserSelected(Boolean.parseBoolean(c.getCnctSignerSignatureTypUsrSltd()));
		}
		/******************** Cnct_Signer_Signature_Typ_Vrsn ********************************************************************************/
		if(c.getCnctSignerSignatureTypVrsn() != null) {
			contractsignersignaturetype.setVersion(c.getCnctSignerSignatureTypVrsn());
		}
		/******************** Cnct_Signer_Signature_When ********************************************************************************/
		if(c.getCnctSignerSignatureWhen() != null) {
			java.text.SimpleDateFormat Cnct_Signer_Signature_Whensdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Signer_Signature_Whendate = Cnct_Signer_Signature_Whensdf.parse(c.getCnctSignerSignatureWhen());
			contractsignersignature.setWhen(Cnct_Signer_Signature_Whendate);
		}
		/******************** Cnct_Signer_Signature_Who ********************************************************************************/
		if(c.getCnctSignerSignatureWho() != null) {
			contractsignersignature.setWho( new org.hl7.fhir.r4.model.Reference(c.getCnctSignerSignatureWho()));
		}
		/******************** contractsignertype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractsignertype =  new org.hl7.fhir.r4.model.Coding();
		contractsigner.setType(contractsignertype);

		/******************** Cnct_Signer_Typ_Cd ********************************************************************************/
		if(c.getCnctSignerTypCd() != null) {
			contractsignertype.setCode(c.getCnctSignerTypCd());
		}
		/******************** Cnct_Signer_Typ_Dsply ********************************************************************************/
		if(c.getCnctSignerTypDsply() != null) {
			contractsignertype.setDisplay(c.getCnctSignerTypDsply());
		}
		/******************** Cnct_Signer_Typ_Sys ********************************************************************************/
		if(c.getCnctSignerTypSys() != null) {
			contractsignertype.setSystem(c.getCnctSignerTypSys());
		}
		/******************** Cnct_Signer_Typ_UsrSltd ********************************************************************************/
		if(c.getCnctSignerTypUsrSltd() != null) {
			contractsignertype.setUserSelected(Boolean.parseBoolean(c.getCnctSignerTypUsrSltd()));
		}
		/******************** Cnct_Signer_Typ_Vrsn ********************************************************************************/
		if(c.getCnctSignerTypVrsn() != null) {
			contractsignertype.setVersion(c.getCnctSignerTypVrsn());
		}
		/******************** Cnct_Site ********************************************************************************/
		if(c.getCnctSite() != null) {
			contract.addSite( new org.hl7.fhir.r4.model.Reference(c.getCnctSite()));
		}
		/******************** contractstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractStatusEnumFactory contractstatus =  new org.hl7.fhir.r4.model.Contract.ContractStatusEnumFactory();
		contract.setStatus(contractstatus.fromCode(c.getCnctSts()));

		/******************** contractsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractsubtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contract.addSubType(contractsubtype);

		/******************** contractsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractsubtypecoding =  new org.hl7.fhir.r4.model.Coding();
		contractsubtype.addCoding(contractsubtypecoding);

		/******************** Cnct_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctSubTypCdgCd() != null) {
			contractsubtypecoding.setCode(c.getCnctSubTypCdgCd());
		}
		/******************** Cnct_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctSubTypCdgDsply() != null) {
			contractsubtypecoding.setDisplay(c.getCnctSubTypCdgDsply());
		}
		/******************** Cnct_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctSubTypCdgSys() != null) {
			contractsubtypecoding.setSystem(c.getCnctSubTypCdgSys());
		}
		/******************** Cnct_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctSubTypCdgUsrSltd() != null) {
			contractsubtypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctSubTypCdgUsrSltd()));
		}
		/******************** Cnct_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctSubTypCdgVrsn() != null) {
			contractsubtypecoding.setVersion(c.getCnctSubTypCdgVrsn());
		}
		/******************** Cnct_SubTyp_Txt ********************************************************************************/
		if(c.getCnctSubTypTxt() != null) {
			contractsubtype.setText(c.getCnctSubTypTxt());
		}
		/******************** Cnct_Sbjct ********************************************************************************/
		if(c.getCnctSbjct() != null) {
			contract.addSubject( new org.hl7.fhir.r4.model.Reference(c.getCnctSbjct()));
		}
		/******************** Cnct_Subtitle ********************************************************************************/
		if(c.getCnctSubtitle() != null) {
			contract.setSubtitle(c.getCnctSubtitle());
		}
		/******************** Cnct_SprtingInfo ********************************************************************************/
		if(c.getCnctSprtingInfo() != null) {
			contract.addSupportingInfo( new org.hl7.fhir.r4.model.Reference(c.getCnctSprtingInfo()));
		}
		/******************** contractterm ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.TermComponent contractterm =  new org.hl7.fhir.r4.model.Contract.TermComponent();
		contract.addTerm(contractterm);

		/******************** contracttermaction ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ActionComponent contracttermaction =  new org.hl7.fhir.r4.model.Contract.ActionComponent();
		contractterm.addAction(contracttermaction);

		/******************** Cnct_Trm_Actn_Cntxt ********************************************************************************/
		if(c.getCnctTrmActnCntxt() != null) {
			contracttermaction.setContext( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmActnCntxt()));
		}
		/******************** Cnct_Trm_Actn_CntxtLinkId ********************************************************************************/
		if(c.getCnctTrmActnCntxtLinkId() != null) {
			contracttermaction.addContextLinkId(c.getCnctTrmActnCntxtLinkId());
		}
		/******************** Cnct_Trm_Actn_DoNotPerform ********************************************************************************/
		if(c.getCnctTrmActnDoNotPerform() != null) {
			contracttermaction.setDoNotPerform(Boolean.parseBoolean(c.getCnctTrmActnDoNotPerform()));
		}
		/******************** contracttermactionintent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionintent =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermaction.setIntent(contracttermactionintent);

		/******************** contracttermactionintentcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionintentcoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermactionintent.addCoding(contracttermactionintentcoding);

		/******************** Cnct_Trm_Actn_Intent_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgCd() != null) {
			contracttermactionintentcoding.setCode(c.getCnctTrmActnIntentCdgCd());
		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgDsply() != null) {
			contracttermactionintentcoding.setDisplay(c.getCnctTrmActnIntentCdgDsply());
		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgSys() != null) {
			contracttermactionintentcoding.setSystem(c.getCnctTrmActnIntentCdgSys());
		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgUsrSltd() != null) {
			contracttermactionintentcoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmActnIntentCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnIntentCdgVrsn() != null) {
			contracttermactionintentcoding.setVersion(c.getCnctTrmActnIntentCdgVrsn());
		}
		/******************** Cnct_Trm_Actn_Intent_Txt ********************************************************************************/
		if(c.getCnctTrmActnIntentTxt() != null) {
			contracttermactionintent.setText(c.getCnctTrmActnIntentTxt());
		}
		/******************** Cnct_Trm_Actn_LinkId ********************************************************************************/
		if(c.getCnctTrmActnLinkId() != null) {
			contracttermaction.addLinkId(c.getCnctTrmActnLinkId());
		}
		/******************** contracttermactionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation contracttermactionnote =  new org.hl7.fhir.r4.model.Annotation();
		contracttermaction.addNote(contracttermactionnote);

		/******************** Cnct_Trm_Actn_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCnctTrmActnNtAthrRfrnc() != null) {
			contracttermactionnote.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmActnNtAthrRfrnc()));
		}
		/******************** Cnct_Trm_Actn_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCnctTrmActnNtAthrStrgTyp() != null) {
			contracttermactionnote.setAuthor( new org.hl7.fhir.r4.model.StringType(c.getCnctTrmActnNtAthrStrgTyp()));
		}
		/******************** Cnct_Trm_Actn_Nt_Txt ********************************************************************************/
		if(c.getCnctTrmActnNtTxt() != null) {
			contracttermactionnote.setText(c.getCnctTrmActnNtTxt());
		}
		/******************** Cnct_Trm_Actn_Nt_Time ********************************************************************************/
		if(c.getCnctTrmActnNtTime() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Actn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Actn_Nt_Timedate = Cnct_Trm_Actn_Nt_Timesdf.parse(c.getCnctTrmActnNtTime());
			contracttermactionnote.setTime(Cnct_Trm_Actn_Nt_Timedate);
		}
		/******************** Cnct_Trm_Actn_OccrnceDtTimeTyp ********************************************************************************/
		if(c.getCnctTrmActnOccrnceDtTimeTyp() != null) {
			contracttermaction.setOccurrence( new org.hl7.fhir.r4.model.DateTimeType(c.getCnctTrmActnOccrnceDtTimeTyp()));
		}
		/******************** contracttermactionoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermactionoccurrenceperiod =  new org.hl7.fhir.r4.model.Period();
		contracttermaction.setOccurrence(contracttermactionoccurrenceperiod);

		/******************** Cnct_Trm_Actn_OccrncePrd_End ********************************************************************************/
		if(c.getCnctTrmActnOccrncePrdEnd() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Actn_OccrncePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Actn_OccrncePrd_Enddate = Cnct_Trm_Actn_OccrncePrd_Endsdf.parse(c.getCnctTrmActnOccrncePrdEnd());
			contracttermactionoccurrenceperiod.setEnd(Cnct_Trm_Actn_OccrncePrd_Enddate);
		}
		/******************** Cnct_Trm_Actn_OccrncePrd_Strt ********************************************************************************/
		if(c.getCnctTrmActnOccrncePrdStrt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Actn_OccrncePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Actn_OccrncePrd_Strtdate = Cnct_Trm_Actn_OccrncePrd_Strtsdf.parse(c.getCnctTrmActnOccrncePrdStrt());
			contracttermactionoccurrenceperiod.setStart(Cnct_Trm_Actn_OccrncePrd_Strtdate);
		}
		/******************** contracttermactionoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing contracttermactionoccurrencetiming =  new org.hl7.fhir.r4.model.Timing();
		contracttermaction.setOccurrence(contracttermactionoccurrencetiming);

		/******************** contracttermactionoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionoccurrencetimingcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermactionoccurrencetiming.setCode(contracttermactionoccurrencetimingcode);

		/******************** contracttermactionoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionoccurrencetimingcodecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermactionoccurrencetimingcode.addCoding(contracttermactionoccurrencetimingcodecoding);

		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgCd() != null) {
			contracttermactionoccurrencetimingcodecoding.setCode(c.getCnctTrmActnOccrnceTmgCdCdgCd());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgDsply() != null) {
			contracttermactionoccurrencetimingcodecoding.setDisplay(c.getCnctTrmActnOccrnceTmgCdCdgDsply());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgSys() != null) {
			contracttermactionoccurrencetimingcodecoding.setSystem(c.getCnctTrmActnOccrnceTmgCdCdgSys());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgUsrSltd() != null) {
			contracttermactionoccurrencetimingcodecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmActnOccrnceTmgCdCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdCdgVrsn() != null) {
			contracttermactionoccurrencetimingcodecoding.setVersion(c.getCnctTrmActnOccrnceTmgCdCdgVrsn());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgCdTxt() != null) {
			contracttermactionoccurrencetimingcode.setText(c.getCnctTrmActnOccrnceTmgCdTxt());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Evnt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgEvnt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Actn_OccrnceTmg_Evntsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Actn_OccrnceTmg_Evntdate = Cnct_Trm_Actn_OccrnceTmg_Evntsdf.parse(c.getCnctTrmActnOccrnceTmgEvnt());
			contracttermactionoccurrencetiming.addEvent(Cnct_Trm_Actn_OccrnceTmg_Evntdate);
		}
		/******************** contracttermactionoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent contracttermactionoccurrencetimingrepeat =  new org.hl7.fhir.r4.model.Timing.TimingRepeatComponent();
		contracttermactionoccurrencetiming.setRepeat(contracttermactionoccurrencetimingrepeat);

		/******************** contracttermactionoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration contracttermactionoccurrencetimingrepeatboundsduration =  new org.hl7.fhir.r4.model.Duration();
		contracttermactionoccurrencetimingrepeat.setBounds(contracttermactionoccurrencetimingrepeatboundsduration);

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsDurationCd() != null) {
			contracttermactionoccurrencetimingrepeatboundsduration.setCode(c.getCnctTrmActnOccrnceTmgRptBndsDurationCd());
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsdurationcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory contracttermactionoccurrencetimingrepeatboundsdurationcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		contracttermactionoccurrencetimingrepeatboundsduration.setComparator(contracttermactionoccurrencetimingrepeatboundsdurationcomparator.fromCode(c.getCnctTrmActnOccrnceTmgRptBndsDurationCmprtr()));

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsDurationSys() != null) {
			contracttermactionoccurrencetimingrepeatboundsduration.setSystem(c.getCnctTrmActnOccrnceTmgRptBndsDurationSys());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsDurationUnt() != null) {
			contracttermactionoccurrencetimingrepeatboundsduration.setUnit(c.getCnctTrmActnOccrnceTmgRptBndsDurationUnt());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsDurationVl() != null) {
			contracttermactionoccurrencetimingrepeatboundsduration.setValue(Double.parseDouble((c.getCnctTrmActnOccrnceTmgRptBndsDurationVl())));
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermactionoccurrencetimingrepeatboundsperiod =  new org.hl7.fhir.r4.model.Period();
		contracttermactionoccurrencetimingrepeat.setBounds(contracttermactionoccurrencetimingrepeatboundsperiod);

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsPrdEnd() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Enddate = Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Endsdf.parse(c.getCnctTrmActnOccrnceTmgRptBndsPrdEnd());
			contracttermactionoccurrencetimingrepeatboundsperiod.setEnd(Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Enddate);
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsPrdStrt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Strtdate = Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Strtsdf.parse(c.getCnctTrmActnOccrnceTmgRptBndsPrdStrt());
			contracttermactionoccurrencetimingrepeatboundsperiod.setStart(Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Strtdate);
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range contracttermactionoccurrencetimingrepeatboundsrange =  new org.hl7.fhir.r4.model.Range();
		contracttermactionoccurrencetimingrepeat.setBounds(contracttermactionoccurrencetimingrepeatboundsrange);

		/******************** contracttermactionoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermactionoccurrencetimingrepeatboundsrangehigh =  new org.hl7.fhir.r4.model.Quantity();
		contracttermactionoccurrencetimingrepeatboundsrange.setHigh(contracttermactionoccurrencetimingrepeatboundsrangehigh);

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngHiCd() != null) {
			contracttermactionoccurrencetimingrepeatboundsrangehigh.setCode(c.getCnctTrmActnOccrnceTmgRptBndsRngHiCd());
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory contracttermactionoccurrencetimingrepeatboundsrangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		contracttermactionoccurrencetimingrepeatboundsrangehigh.setComparator(contracttermactionoccurrencetimingrepeatboundsrangehighcomparator.fromCode(c.getCnctTrmActnOccrnceTmgRptBndsRngHiCmprtr()));

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngHiSys() != null) {
			contracttermactionoccurrencetimingrepeatboundsrangehigh.setSystem(c.getCnctTrmActnOccrnceTmgRptBndsRngHiSys());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngHiUnt() != null) {
			contracttermactionoccurrencetimingrepeatboundsrangehigh.setUnit(c.getCnctTrmActnOccrnceTmgRptBndsRngHiUnt());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngHiVl() != null) {
			contracttermactionoccurrencetimingrepeatboundsrangehigh.setValue(Double.parseDouble((c.getCnctTrmActnOccrnceTmgRptBndsRngHiVl())));
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermactionoccurrencetimingrepeatboundsrangelow =  new org.hl7.fhir.r4.model.Quantity();
		contracttermactionoccurrencetimingrepeatboundsrange.setLow(contracttermactionoccurrencetimingrepeatboundsrangelow);

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngLwCd() != null) {
			contracttermactionoccurrencetimingrepeatboundsrangelow.setCode(c.getCnctTrmActnOccrnceTmgRptBndsRngLwCd());
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory contracttermactionoccurrencetimingrepeatboundsrangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		contracttermactionoccurrencetimingrepeatboundsrangelow.setComparator(contracttermactionoccurrencetimingrepeatboundsrangelowcomparator.fromCode(c.getCnctTrmActnOccrnceTmgRptBndsRngLwCmprtr()));

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngLwSys() != null) {
			contracttermactionoccurrencetimingrepeatboundsrangelow.setSystem(c.getCnctTrmActnOccrnceTmgRptBndsRngLwSys());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngLwUnt() != null) {
			contracttermactionoccurrencetimingrepeatboundsrangelow.setUnit(c.getCnctTrmActnOccrnceTmgRptBndsRngLwUnt());
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptBndsRngLwVl() != null) {
			contracttermactionoccurrencetimingrepeatboundsrangelow.setValue(Double.parseDouble((c.getCnctTrmActnOccrnceTmgRptBndsRngLwVl())));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptCnt() != null) {
			contracttermactionoccurrencetimingrepeat.setCount(Integer.parseInt(c.getCnctTrmActnOccrnceTmgRptCnt()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptCntMx() != null) {
			contracttermactionoccurrencetimingrepeat.setCountMax(Integer.parseInt(c.getCnctTrmActnOccrnceTmgRptCntMx()));
		}
		/******************** contracttermactionoccurrencetimingrepeatdayofweek ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory contracttermactionoccurrencetimingrepeatdayofweek =  new org.hl7.fhir.r4.model.Timing.DayOfWeekEnumFactory();
		contracttermactionoccurrencetimingrepeat.addDayOfWeek(contracttermactionoccurrencetimingrepeatdayofweek.fromCode(c.getCnctTrmActnOccrnceTmgRptDayOfWeek()));

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptDuration() != null) {
			contracttermactionoccurrencetimingrepeat.setDuration(Double.parseDouble((c.getCnctTrmActnOccrnceTmgRptDuration())));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptDurationMx() != null) {
			contracttermactionoccurrencetimingrepeat.setDurationMax(Double.parseDouble((c.getCnctTrmActnOccrnceTmgRptDurationMx())));
		}
		/******************** contracttermactionoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory contracttermactionoccurrencetimingrepeatdurationunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		contracttermactionoccurrencetimingrepeat.setDurationUnit(contracttermactionoccurrencetimingrepeatdurationunit.fromCode(c.getCnctTrmActnOccrnceTmgRptDurationUnt()));

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptFrqncy() != null) {
			contracttermactionoccurrencetimingrepeat.setFrequency(Integer.parseInt(c.getCnctTrmActnOccrnceTmgRptFrqncy()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptFrqncyMx() != null) {
			contracttermactionoccurrencetimingrepeat.setFrequencyMax(Integer.parseInt(c.getCnctTrmActnOccrnceTmgRptFrqncyMx()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptOff() != null) {
			contracttermactionoccurrencetimingrepeat.setOffset(Integer.parseInt(c.getCnctTrmActnOccrnceTmgRptOff()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptPrd() != null) {
			contracttermactionoccurrencetimingrepeat.setPeriod(Double.parseDouble((c.getCnctTrmActnOccrnceTmgRptPrd())));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptPrdMx() != null) {
			contracttermactionoccurrencetimingrepeat.setPeriodMax(new java.math.BigDecimal((c.getCnctTrmActnOccrnceTmgRptPrdMx())));
		}
		/******************** contracttermactionoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory contracttermactionoccurrencetimingrepeatperiodunit =  new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory();
		contracttermactionoccurrencetimingrepeat.setPeriodUnit(contracttermactionoccurrencetimingrepeatperiodunit.fromCode(c.getCnctTrmActnOccrnceTmgRptPrdUnt()));

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(c.getCnctTrmActnOccrnceTmgRptTimeOfDay() != null) {
			contracttermactionoccurrencetimingrepeat.addTimeOfDay(c.getCnctTrmActnOccrnceTmgRptTimeOfDay());
		}
		/******************** contracttermactionoccurrencetimingrepeatwhen ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory contracttermactionoccurrencetimingrepeatwhen =  new org.hl7.fhir.r4.model.Timing.EventTimingEnumFactory();
		contracttermactionoccurrencetimingrepeat.addWhen(contracttermactionoccurrencetimingrepeatwhen.fromCode(c.getCnctTrmActnOccrnceTmgRptWhen()));

		/******************** Cnct_Trm_Actn_Prfrmr ********************************************************************************/
		if(c.getCnctTrmActnPrfrmr() != null) {
			contracttermaction.setPerformer( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmActnPrfrmr()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrLinkId ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrLinkId() != null) {
			contracttermaction.addPerformerLinkId(c.getCnctTrmActnPrfrmrLinkId());
		}
		/******************** contracttermactionperformerrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionperformerrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermaction.setPerformerRole(contracttermactionperformerrole);

		/******************** contracttermactionperformerrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionperformerrolecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermactionperformerrole.addCoding(contracttermactionperformerrolecoding);

		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgCd() != null) {
			contracttermactionperformerrolecoding.setCode(c.getCnctTrmActnPrfrmrRoleCdgCd());
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgDsply() != null) {
			contracttermactionperformerrolecoding.setDisplay(c.getCnctTrmActnPrfrmrRoleCdgDsply());
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgSys() != null) {
			contracttermactionperformerrolecoding.setSystem(c.getCnctTrmActnPrfrmrRoleCdgSys());
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgUsrSltd() != null) {
			contracttermactionperformerrolecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmActnPrfrmrRoleCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleCdgVrsn() != null) {
			contracttermactionperformerrolecoding.setVersion(c.getCnctTrmActnPrfrmrRoleCdgVrsn());
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Txt ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrRoleTxt() != null) {
			contracttermactionperformerrole.setText(c.getCnctTrmActnPrfrmrRoleTxt());
		}
		/******************** contracttermactionperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionperformertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermaction.addPerformerType(contracttermactionperformertype);

		/******************** contracttermactionperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionperformertypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermactionperformertype.addCoding(contracttermactionperformertypecoding);

		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgCd() != null) {
			contracttermactionperformertypecoding.setCode(c.getCnctTrmActnPrfrmrTypCdgCd());
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgDsply() != null) {
			contracttermactionperformertypecoding.setDisplay(c.getCnctTrmActnPrfrmrTypCdgDsply());
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgSys() != null) {
			contracttermactionperformertypecoding.setSystem(c.getCnctTrmActnPrfrmrTypCdgSys());
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgUsrSltd() != null) {
			contracttermactionperformertypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmActnPrfrmrTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypCdgVrsn() != null) {
			contracttermactionperformertypecoding.setVersion(c.getCnctTrmActnPrfrmrTypCdgVrsn());
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Txt ********************************************************************************/
		if(c.getCnctTrmActnPrfrmrTypTxt() != null) {
			contracttermactionperformertype.setText(c.getCnctTrmActnPrfrmrTypTxt());
		}
		/******************** Cnct_Trm_Actn_Rsn ********************************************************************************/
		if(c.getCnctTrmActnRsn() != null) {
			contracttermaction.addReason(c.getCnctTrmActnRsn());
		}
		/******************** contracttermactionreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermaction.addReasonCode(contracttermactionreasoncode);

		/******************** contracttermactionreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermactionreasoncode.addCoding(contracttermactionreasoncodecoding);

		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgCd() != null) {
			contracttermactionreasoncodecoding.setCode(c.getCnctTrmActnRsnCdCdgCd());
		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgDsply() != null) {
			contracttermactionreasoncodecoding.setDisplay(c.getCnctTrmActnRsnCdCdgDsply());
		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgSys() != null) {
			contracttermactionreasoncodecoding.setSystem(c.getCnctTrmActnRsnCdCdgSys());
		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgUsrSltd() != null) {
			contracttermactionreasoncodecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmActnRsnCdCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnRsnCdCdgVrsn() != null) {
			contracttermactionreasoncodecoding.setVersion(c.getCnctTrmActnRsnCdCdgVrsn());
		}
		/******************** Cnct_Trm_Actn_RsnCd_Txt ********************************************************************************/
		if(c.getCnctTrmActnRsnCdTxt() != null) {
			contracttermactionreasoncode.setText(c.getCnctTrmActnRsnCdTxt());
		}
		/******************** Cnct_Trm_Actn_RsnLinkId ********************************************************************************/
		if(c.getCnctTrmActnRsnLinkId() != null) {
			contracttermaction.addReasonLinkId(c.getCnctTrmActnRsnLinkId());
		}
		/******************** Cnct_Trm_Actn_RsnRfrnc ********************************************************************************/
		if(c.getCnctTrmActnRsnRfrnc() != null) {
			contracttermaction.addReasonReference( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmActnRsnRfrnc()));
		}
		/******************** Cnct_Trm_Actn_Rqster ********************************************************************************/
		if(c.getCnctTrmActnRqster() != null) {
			contracttermaction.addRequester( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmActnRqster()));
		}
		/******************** Cnct_Trm_Actn_RqsterLinkId ********************************************************************************/
		if(c.getCnctTrmActnRqsterLinkId() != null) {
			contracttermaction.addRequesterLinkId(c.getCnctTrmActnRqsterLinkId());
		}
		/******************** Cnct_Trm_Actn_SecurityLblNmbr ********************************************************************************/
		if(c.getCnctTrmActnSecurityLblNmbr() != null) {
			contracttermaction.addSecurityLabelNumber(Integer.parseInt(c.getCnctTrmActnSecurityLblNmbr()));
		}
		/******************** contracttermactionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionstatus =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermaction.setStatus(contracttermactionstatus);

		/******************** contracttermactionstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionstatuscoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermactionstatus.addCoding(contracttermactionstatuscoding);

		/******************** Cnct_Trm_Actn_Sts_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnStsCdgCd() != null) {
			contracttermactionstatuscoding.setCode(c.getCnctTrmActnStsCdgCd());
		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnStsCdgDsply() != null) {
			contracttermactionstatuscoding.setDisplay(c.getCnctTrmActnStsCdgDsply());
		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnStsCdgSys() != null) {
			contracttermactionstatuscoding.setSystem(c.getCnctTrmActnStsCdgSys());
		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnStsCdgUsrSltd() != null) {
			contracttermactionstatuscoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmActnStsCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnStsCdgVrsn() != null) {
			contracttermactionstatuscoding.setVersion(c.getCnctTrmActnStsCdgVrsn());
		}
		/******************** Cnct_Trm_Actn_Sts_Txt ********************************************************************************/
		if(c.getCnctTrmActnStsTxt() != null) {
			contracttermactionstatus.setText(c.getCnctTrmActnStsTxt());
		}
		/******************** contracttermactionsubject ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ActionSubjectComponent contracttermactionsubject =  new org.hl7.fhir.r4.model.Contract.ActionSubjectComponent();
		contracttermaction.addSubject(contracttermactionsubject);

		/******************** Cnct_Trm_Actn_Sbjct_Rfrnc ********************************************************************************/
		if(c.getCnctTrmActnSbjctRfrnc() != null) {
			contracttermactionsubject.addReference( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmActnSbjctRfrnc()));
		}
		/******************** contracttermactionsubjectrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionsubjectrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermactionsubject.setRole(contracttermactionsubjectrole);

		/******************** contracttermactionsubjectrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionsubjectrolecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermactionsubjectrole.addCoding(contracttermactionsubjectrolecoding);

		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgCd() != null) {
			contracttermactionsubjectrolecoding.setCode(c.getCnctTrmActnSbjctRoleCdgCd());
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgDsply() != null) {
			contracttermactionsubjectrolecoding.setDisplay(c.getCnctTrmActnSbjctRoleCdgDsply());
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgSys() != null) {
			contracttermactionsubjectrolecoding.setSystem(c.getCnctTrmActnSbjctRoleCdgSys());
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgUsrSltd() != null) {
			contracttermactionsubjectrolecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmActnSbjctRoleCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleCdgVrsn() != null) {
			contracttermactionsubjectrolecoding.setVersion(c.getCnctTrmActnSbjctRoleCdgVrsn());
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Txt ********************************************************************************/
		if(c.getCnctTrmActnSbjctRoleTxt() != null) {
			contracttermactionsubjectrole.setText(c.getCnctTrmActnSbjctRoleTxt());
		}
		/******************** contracttermactiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactiontype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermaction.setType(contracttermactiontype);

		/******************** contracttermactiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactiontypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermactiontype.addCoding(contracttermactiontypecoding);

		/******************** Cnct_Trm_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmActnTypCdgCd() != null) {
			contracttermactiontypecoding.setCode(c.getCnctTrmActnTypCdgCd());
		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmActnTypCdgDsply() != null) {
			contracttermactiontypecoding.setDisplay(c.getCnctTrmActnTypCdgDsply());
		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmActnTypCdgSys() != null) {
			contracttermactiontypecoding.setSystem(c.getCnctTrmActnTypCdgSys());
		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmActnTypCdgUsrSltd() != null) {
			contracttermactiontypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmActnTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmActnTypCdgVrsn() != null) {
			contracttermactiontypecoding.setVersion(c.getCnctTrmActnTypCdgVrsn());
		}
		/******************** Cnct_Trm_Actn_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmActnTypTxt() != null) {
			contracttermactiontype.setText(c.getCnctTrmActnTypTxt());
		}
		/******************** contracttermapplies ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermapplies =  new org.hl7.fhir.r4.model.Period();
		contractterm.setApplies(contracttermapplies);

		/******************** Cnct_Trm_Applies_End ********************************************************************************/
		if(c.getCnctTrmAppliesEnd() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Applies_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Applies_Enddate = Cnct_Trm_Applies_Endsdf.parse(c.getCnctTrmAppliesEnd());
			contracttermapplies.setEnd(Cnct_Trm_Applies_Enddate);
		}
		/******************** Cnct_Trm_Applies_Strt ********************************************************************************/
		if(c.getCnctTrmAppliesStrt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Applies_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Applies_Strtdate = Cnct_Trm_Applies_Strtsdf.parse(c.getCnctTrmAppliesStrt());
			contracttermapplies.setStart(Cnct_Trm_Applies_Strtdate);
		}
		/******************** contracttermas ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractAssetComponent contracttermas =  new org.hl7.fhir.r4.model.Contract.ContractAssetComponent();
		contractterm.addAsset(contracttermas);

		/******************** contracttermasanswer ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.AnswerComponent contracttermasanswer =  new org.hl7.fhir.r4.model.Contract.AnswerComponent();
		contracttermas.addAnswer(contracttermasanswer);

		/******************** contracttermasanswervalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contracttermasanswervalueattachment =  new org.hl7.fhir.r4.model.Attachment();
		contracttermasanswer.setValue(contracttermasanswervalueattachment);

		/******************** Cnct_Trm_As_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntCntntTyp() != null) {
			contracttermasanswervalueattachment.setContentType(c.getCnctTrmAsAnsVlAttchmntCntntTyp());
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntCreation() != null) {
			java.text.SimpleDateFormat Cnct_Trm_As_Ans_VlAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_As_Ans_VlAttchmnt_Creationdate = Cnct_Trm_As_Ans_VlAttchmnt_Creationsdf.parse(c.getCnctTrmAsAnsVlAttchmntCreation());
			contracttermasanswervalueattachment.setCreation(Cnct_Trm_As_Ans_VlAttchmnt_Creationdate);
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Data ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntData() != null) {
			contracttermasanswervalueattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctTrmAsAnsVlAttchmntData()));
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntHash() != null) {
			contracttermasanswervalueattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctTrmAsAnsVlAttchmntHash()));
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntLnguage() != null) {
			contracttermasanswervalueattachment.setLanguage(c.getCnctTrmAsAnsVlAttchmntLnguage());
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntSz() != null) {
			contracttermasanswervalueattachment.setSize(Integer.parseInt(c.getCnctTrmAsAnsVlAttchmntSz()));
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntTtl() != null) {
			contracttermasanswervalueattachment.setTitle(c.getCnctTrmAsAnsVlAttchmntTtl());
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Url ********************************************************************************/
		if(c.getCnctTrmAsAnsVlAttchmntUrl() != null) {
			contracttermasanswervalueattachment.setUrl(c.getCnctTrmAsAnsVlAttchmntUrl());
		}
		/******************** Cnct_Trm_As_Ans_VlBooleanTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlBooleanTyp() != null) {
			contracttermasanswer.setValue( new org.hl7.fhir.r4.model.BooleanType(c.getCnctTrmAsAnsVlBooleanTyp()));
		}
		/******************** contracttermasanswervaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasanswervaluecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermasanswer.setValue(contracttermasanswervaluecoding);

		/******************** Cnct_Trm_As_Ans_VlCdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgCd() != null) {
			contracttermasanswervaluecoding.setCode(c.getCnctTrmAsAnsVlCdgCd());
		}
		/******************** Cnct_Trm_As_Ans_VlCdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgDsply() != null) {
			contracttermasanswervaluecoding.setDisplay(c.getCnctTrmAsAnsVlCdgDsply());
		}
		/******************** Cnct_Trm_As_Ans_VlCdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgSys() != null) {
			contracttermasanswervaluecoding.setSystem(c.getCnctTrmAsAnsVlCdgSys());
		}
		/******************** Cnct_Trm_As_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgUsrSltd() != null) {
			contracttermasanswervaluecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmAsAnsVlCdgUsrSltd()));
		}
		/******************** Cnct_Trm_As_Ans_VlCdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsAnsVlCdgVrsn() != null) {
			contracttermasanswervaluecoding.setVersion(c.getCnctTrmAsAnsVlCdgVrsn());
		}
		/******************** Cnct_Trm_As_Ans_VlDtTimeTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlDtTimeTyp() != null) {
			contracttermasanswer.setValue( new org.hl7.fhir.r4.model.DateTimeType(c.getCnctTrmAsAnsVlDtTimeTyp()));
		}
		/******************** Cnct_Trm_As_Ans_VlDtTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlDtTyp() != null) {
			contracttermasanswer.setValue( new org.hl7.fhir.r4.model.DateType(c.getCnctTrmAsAnsVlDtTyp()));
		}
		/******************** Cnct_Trm_As_Ans_VlDecimalTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlDecimalTyp() != null) {
			contracttermasanswer.setValue( new org.hl7.fhir.r4.model.DecimalType(c.getCnctTrmAsAnsVlDecimalTyp()));
		}
		/******************** Cnct_Trm_As_Ans_VlIntegerTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlIntegerTyp() != null) {
			contracttermasanswer.setValue( new org.hl7.fhir.r4.model.IntegerType(c.getCnctTrmAsAnsVlIntegerTyp()));
		}
		/******************** contracttermasanswervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermasanswervaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		contracttermasanswer.setValue(contracttermasanswervaluequantity);

		/******************** Cnct_Trm_As_Ans_VlQnty_Cd ********************************************************************************/
		if(c.getCnctTrmAsAnsVlQntyCd() != null) {
			contracttermasanswervaluequantity.setCode(c.getCnctTrmAsAnsVlQntyCd());
		}
		/******************** contracttermasanswervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory contracttermasanswervaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		contracttermasanswervaluequantity.setComparator(contracttermasanswervaluequantitycomparator.fromCode(c.getCnctTrmAsAnsVlQntyCmprtr()));

		/******************** Cnct_Trm_As_Ans_VlQnty_Sys ********************************************************************************/
		if(c.getCnctTrmAsAnsVlQntySys() != null) {
			contracttermasanswervaluequantity.setSystem(c.getCnctTrmAsAnsVlQntySys());
		}
		/******************** Cnct_Trm_As_Ans_VlQnty_Unt ********************************************************************************/
		if(c.getCnctTrmAsAnsVlQntyUnt() != null) {
			contracttermasanswervaluequantity.setUnit(c.getCnctTrmAsAnsVlQntyUnt());
		}
		/******************** Cnct_Trm_As_Ans_VlQnty_Vl ********************************************************************************/
		if(c.getCnctTrmAsAnsVlQntyVl() != null) {
			contracttermasanswervaluequantity.setValue(Double.parseDouble((c.getCnctTrmAsAnsVlQntyVl())));
		}
		/******************** Cnct_Trm_As_Ans_VlRfrnc ********************************************************************************/
		if(c.getCnctTrmAsAnsVlRfrnc() != null) {
			contracttermasanswer.setValue( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmAsAnsVlRfrnc()));
		}
		/******************** Cnct_Trm_As_Ans_VlStrgTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlStrgTyp() != null) {
			contracttermasanswer.setValue( new org.hl7.fhir.r4.model.StringType(c.getCnctTrmAsAnsVlStrgTyp()));
		}
		/******************** Cnct_Trm_As_Ans_VlTimeTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlTimeTyp() != null) {
			contracttermasanswer.setValue( new org.hl7.fhir.r4.model.TimeType(c.getCnctTrmAsAnsVlTimeTyp()));
		}
		/******************** Cnct_Trm_As_Ans_VlUriTyp ********************************************************************************/
		if(c.getCnctTrmAsAnsVlUriTyp() != null) {
			contracttermasanswer.setValue( new org.hl7.fhir.r4.model.UriType(c.getCnctTrmAsAnsVlUriTyp()));
		}
		/******************** Cnct_Trm_As_Cndtn ********************************************************************************/
		if(c.getCnctTrmAsCndtn() != null) {
			contracttermas.setCondition(c.getCnctTrmAsCndtn());
		}
		/******************** contracttermascontext ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.AssetContextComponent contracttermascontext =  new org.hl7.fhir.r4.model.Contract.AssetContextComponent();
		contracttermas.addContext(contracttermascontext);

		/******************** contracttermascontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermascontextcode =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermascontext.addCode(contracttermascontextcode);

		/******************** contracttermascontextcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermascontextcodecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermascontextcode.addCoding(contracttermascontextcodecoding);

		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgCd() != null) {
			contracttermascontextcodecoding.setCode(c.getCnctTrmAsCntxtCdCdgCd());
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgDsply() != null) {
			contracttermascontextcodecoding.setDisplay(c.getCnctTrmAsCntxtCdCdgDsply());
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgSys() != null) {
			contracttermascontextcodecoding.setSystem(c.getCnctTrmAsCntxtCdCdgSys());
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgUsrSltd() != null) {
			contracttermascontextcodecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmAsCntxtCdCdgUsrSltd()));
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdCdgVrsn() != null) {
			contracttermascontextcodecoding.setVersion(c.getCnctTrmAsCntxtCdCdgVrsn());
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Txt ********************************************************************************/
		if(c.getCnctTrmAsCntxtCdTxt() != null) {
			contracttermascontextcode.setText(c.getCnctTrmAsCntxtCdTxt());
		}
		/******************** Cnct_Trm_As_Cntxt_Rfrnc ********************************************************************************/
		if(c.getCnctTrmAsCntxtRfrnc() != null) {
			contracttermascontext.setReference( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmAsCntxtRfrnc()));
		}
		/******************** Cnct_Trm_As_Cntxt_Txt ********************************************************************************/
		if(c.getCnctTrmAsCntxtTxt() != null) {
			contracttermascontext.setText(c.getCnctTrmAsCntxtTxt());
		}
		/******************** Cnct_Trm_As_LinkId ********************************************************************************/
		if(c.getCnctTrmAsLinkId() != null) {
			contracttermas.addLinkId(c.getCnctTrmAsLinkId());
		}
		/******************** contracttermasperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermasperiod =  new org.hl7.fhir.r4.model.Period();
		contracttermas.addPeriod(contracttermasperiod);

		/******************** Cnct_Trm_As_Prd_End ********************************************************************************/
		if(c.getCnctTrmAsPrdEnd() != null) {
			java.text.SimpleDateFormat Cnct_Trm_As_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_As_Prd_Enddate = Cnct_Trm_As_Prd_Endsdf.parse(c.getCnctTrmAsPrdEnd());
			contracttermasperiod.setEnd(Cnct_Trm_As_Prd_Enddate);
		}
		/******************** Cnct_Trm_As_Prd_Strt ********************************************************************************/
		if(c.getCnctTrmAsPrdStrt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_As_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_As_Prd_Strtdate = Cnct_Trm_As_Prd_Strtsdf.parse(c.getCnctTrmAsPrdStrt());
			contracttermasperiod.setStart(Cnct_Trm_As_Prd_Strtdate);
		}
		/******************** contracttermasperiodtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasperiodtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermas.addPeriodType(contracttermasperiodtype);

		/******************** contracttermasperiodtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasperiodtypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermasperiodtype.addCoding(contracttermasperiodtypecoding);

		/******************** Cnct_Trm_As_PrdTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgCd() != null) {
			contracttermasperiodtypecoding.setCode(c.getCnctTrmAsPrdTypCdgCd());
		}
		/******************** Cnct_Trm_As_PrdTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgDsply() != null) {
			contracttermasperiodtypecoding.setDisplay(c.getCnctTrmAsPrdTypCdgDsply());
		}
		/******************** Cnct_Trm_As_PrdTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgSys() != null) {
			contracttermasperiodtypecoding.setSystem(c.getCnctTrmAsPrdTypCdgSys());
		}
		/******************** Cnct_Trm_As_PrdTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgUsrSltd() != null) {
			contracttermasperiodtypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmAsPrdTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_As_PrdTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsPrdTypCdgVrsn() != null) {
			contracttermasperiodtypecoding.setVersion(c.getCnctTrmAsPrdTypCdgVrsn());
		}
		/******************** Cnct_Trm_As_PrdTyp_Txt ********************************************************************************/
		if(c.getCnctTrmAsPrdTypTxt() != null) {
			contracttermasperiodtype.setText(c.getCnctTrmAsPrdTypTxt());
		}
		/******************** contracttermasrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasrelationship =  new org.hl7.fhir.r4.model.Coding();
		contracttermas.setRelationship(contracttermasrelationship);

		/******************** Cnct_Trm_As_Rltnship_Cd ********************************************************************************/
		if(c.getCnctTrmAsRltnshipCd() != null) {
			contracttermasrelationship.setCode(c.getCnctTrmAsRltnshipCd());
		}
		/******************** Cnct_Trm_As_Rltnship_Dsply ********************************************************************************/
		if(c.getCnctTrmAsRltnshipDsply() != null) {
			contracttermasrelationship.setDisplay(c.getCnctTrmAsRltnshipDsply());
		}
		/******************** Cnct_Trm_As_Rltnship_Sys ********************************************************************************/
		if(c.getCnctTrmAsRltnshipSys() != null) {
			contracttermasrelationship.setSystem(c.getCnctTrmAsRltnshipSys());
		}
		/******************** Cnct_Trm_As_Rltnship_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsRltnshipUsrSltd() != null) {
			contracttermasrelationship.setUserSelected(Boolean.parseBoolean(c.getCnctTrmAsRltnshipUsrSltd()));
		}
		/******************** Cnct_Trm_As_Rltnship_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsRltnshipVrsn() != null) {
			contracttermasrelationship.setVersion(c.getCnctTrmAsRltnshipVrsn());
		}
		/******************** contracttermasscope ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasscope =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermas.setScope(contracttermasscope);

		/******************** contracttermasscopecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasscopecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermasscope.addCoding(contracttermasscopecoding);

		/******************** Cnct_Trm_As_Scope_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgCd() != null) {
			contracttermasscopecoding.setCode(c.getCnctTrmAsScopeCdgCd());
		}
		/******************** Cnct_Trm_As_Scope_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgDsply() != null) {
			contracttermasscopecoding.setDisplay(c.getCnctTrmAsScopeCdgDsply());
		}
		/******************** Cnct_Trm_As_Scope_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgSys() != null) {
			contracttermasscopecoding.setSystem(c.getCnctTrmAsScopeCdgSys());
		}
		/******************** Cnct_Trm_As_Scope_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgUsrSltd() != null) {
			contracttermasscopecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmAsScopeCdgUsrSltd()));
		}
		/******************** Cnct_Trm_As_Scope_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsScopeCdgVrsn() != null) {
			contracttermasscopecoding.setVersion(c.getCnctTrmAsScopeCdgVrsn());
		}
		/******************** Cnct_Trm_As_Scope_Txt ********************************************************************************/
		if(c.getCnctTrmAsScopeTxt() != null) {
			contracttermasscope.setText(c.getCnctTrmAsScopeTxt());
		}
		/******************** Cnct_Trm_As_SecurityLblNmbr ********************************************************************************/
		if(c.getCnctTrmAsSecurityLblNmbr() != null) {
			contracttermas.addSecurityLabelNumber(Integer.parseInt(c.getCnctTrmAsSecurityLblNmbr()));
		}
		/******************** contracttermassubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermassubtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermas.addSubtype(contracttermassubtype);

		/******************** contracttermassubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermassubtypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermassubtype.addCoding(contracttermassubtypecoding);

		/******************** Cnct_Trm_As_Subtype_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgCd() != null) {
			contracttermassubtypecoding.setCode(c.getCnctTrmAsSubtypeCdgCd());
		}
		/******************** Cnct_Trm_As_Subtype_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgDsply() != null) {
			contracttermassubtypecoding.setDisplay(c.getCnctTrmAsSubtypeCdgDsply());
		}
		/******************** Cnct_Trm_As_Subtype_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgSys() != null) {
			contracttermassubtypecoding.setSystem(c.getCnctTrmAsSubtypeCdgSys());
		}
		/******************** Cnct_Trm_As_Subtype_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgUsrSltd() != null) {
			contracttermassubtypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmAsSubtypeCdgUsrSltd()));
		}
		/******************** Cnct_Trm_As_Subtype_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsSubtypeCdgVrsn() != null) {
			contracttermassubtypecoding.setVersion(c.getCnctTrmAsSubtypeCdgVrsn());
		}
		/******************** Cnct_Trm_As_Subtype_Txt ********************************************************************************/
		if(c.getCnctTrmAsSubtypeTxt() != null) {
			contracttermassubtype.setText(c.getCnctTrmAsSubtypeTxt());
		}
		/******************** Cnct_Trm_As_Txt ********************************************************************************/
		if(c.getCnctTrmAsTxt() != null) {
			contracttermas.setText(c.getCnctTrmAsTxt());
		}
		/******************** contracttermastype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermastype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermas.addType(contracttermastype);

		/******************** contracttermastypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermastypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermastype.addCoding(contracttermastypecoding);

		/******************** Cnct_Trm_As_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsTypCdgCd() != null) {
			contracttermastypecoding.setCode(c.getCnctTrmAsTypCdgCd());
		}
		/******************** Cnct_Trm_As_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsTypCdgDsply() != null) {
			contracttermastypecoding.setDisplay(c.getCnctTrmAsTypCdgDsply());
		}
		/******************** Cnct_Trm_As_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsTypCdgSys() != null) {
			contracttermastypecoding.setSystem(c.getCnctTrmAsTypCdgSys());
		}
		/******************** Cnct_Trm_As_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsTypCdgUsrSltd() != null) {
			contracttermastypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmAsTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_As_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsTypCdgVrsn() != null) {
			contracttermastypecoding.setVersion(c.getCnctTrmAsTypCdgVrsn());
		}
		/******************** Cnct_Trm_As_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmAsTypTxt() != null) {
			contracttermastype.setText(c.getCnctTrmAsTypTxt());
		}
		/******************** Cnct_Trm_As_TypRfrnc ********************************************************************************/
		if(c.getCnctTrmAsTypRfrnc() != null) {
			contracttermas.addTypeReference( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmAsTypRfrnc()));
		}
		/******************** contracttermasuseperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermasuseperiod =  new org.hl7.fhir.r4.model.Period();
		contracttermas.addUsePeriod(contracttermasuseperiod);

		/******************** Cnct_Trm_As_UsePrd_End ********************************************************************************/
		if(c.getCnctTrmAsUsePrdEnd() != null) {
			java.text.SimpleDateFormat Cnct_Trm_As_UsePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_As_UsePrd_Enddate = Cnct_Trm_As_UsePrd_Endsdf.parse(c.getCnctTrmAsUsePrdEnd());
			contracttermasuseperiod.setEnd(Cnct_Trm_As_UsePrd_Enddate);
		}
		/******************** Cnct_Trm_As_UsePrd_Strt ********************************************************************************/
		if(c.getCnctTrmAsUsePrdStrt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_As_UsePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_As_UsePrd_Strtdate = Cnct_Trm_As_UsePrd_Strtsdf.parse(c.getCnctTrmAsUsePrdStrt());
			contracttermasuseperiod.setStart(Cnct_Trm_As_UsePrd_Strtdate);
		}
		/******************** contracttermasvalueditem ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ValuedItemComponent contracttermasvalueditem =  new org.hl7.fhir.r4.model.Contract.ValuedItemComponent();
		contracttermas.addValuedItem(contracttermasvalueditem);

		/******************** Cnct_Trm_As_VldItm_EfctiveTime ********************************************************************************/
		if(c.getCnctTrmAsVldItmEfctiveTime() != null) {
			java.text.SimpleDateFormat Cnct_Trm_As_VldItm_EfctiveTimesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_As_VldItm_EfctiveTimedate = Cnct_Trm_As_VldItm_EfctiveTimesdf.parse(c.getCnctTrmAsVldItmEfctiveTime());
			contracttermasvalueditem.setEffectiveTime(Cnct_Trm_As_VldItm_EfctiveTimedate);
		}
		/******************** contracttermasvalueditementitycodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasvalueditementitycodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermasvalueditem.setEntity(contracttermasvalueditementitycodeableconcept);

		/******************** contracttermasvalueditementitycodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasvalueditementitycodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermasvalueditementitycodeableconcept.addCoding(contracttermasvalueditementitycodeableconceptcoding);

		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgCd() != null) {
			contracttermasvalueditementitycodeableconceptcoding.setCode(c.getCnctTrmAsVldItmEntityCdbleCncptCdgCd());
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgDsply() != null) {
			contracttermasvalueditementitycodeableconceptcoding.setDisplay(c.getCnctTrmAsVldItmEntityCdbleCncptCdgDsply());
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgSys() != null) {
			contracttermasvalueditementitycodeableconceptcoding.setSystem(c.getCnctTrmAsVldItmEntityCdbleCncptCdgSys());
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd() != null) {
			contracttermasvalueditementitycodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd()));
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptCdgVrsn() != null) {
			contracttermasvalueditementitycodeableconceptcoding.setVersion(c.getCnctTrmAsVldItmEntityCdbleCncptCdgVrsn());
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Txt ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityCdbleCncptTxt() != null) {
			contracttermasvalueditementitycodeableconcept.setText(c.getCnctTrmAsVldItmEntityCdbleCncptTxt());
		}
		/******************** Cnct_Trm_As_VldItm_EntityRfrnc ********************************************************************************/
		if(c.getCnctTrmAsVldItmEntityRfrnc() != null) {
			contracttermasvalueditem.setEntity( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmAsVldItmEntityRfrnc()));
		}
		/******************** Cnct_Trm_As_VldItm_Factor ********************************************************************************/
		if(c.getCnctTrmAsVldItmFactor() != null) {
			contracttermasvalueditem.setFactor(new java.math.BigDecimal((c.getCnctTrmAsVldItmFactor())));
		}
		/******************** contracttermasvalueditemidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contracttermasvalueditemidentifier =  new org.hl7.fhir.r4.model.Identifier();
		contracttermasvalueditem.setIdentifier(contracttermasvalueditemidentifier);

		/******************** Cnct_Trm_As_VldItm_Id_Assigner ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdAssigner() != null) {
			contracttermasvalueditemidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmAsVldItmIdAssigner()));
		}
		/******************** contracttermasvalueditemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermasvalueditemidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		contracttermasvalueditemidentifier.setPeriod(contracttermasvalueditemidentifierperiod);

		/******************** Cnct_Trm_As_VldItm_Id_Prd_End ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cnct_Trm_As_VldItm_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_As_VldItm_Id_Prd_Enddate = Cnct_Trm_As_VldItm_Id_Prd_Endsdf.parse(c.getCnctTrmAsVldItmIdPrdEnd());
			contracttermasvalueditemidentifierperiod.setEnd(Cnct_Trm_As_VldItm_Id_Prd_Enddate);
		}
		/******************** Cnct_Trm_As_VldItm_Id_Prd_Strt ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_As_VldItm_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_As_VldItm_Id_Prd_Strtdate = Cnct_Trm_As_VldItm_Id_Prd_Strtsdf.parse(c.getCnctTrmAsVldItmIdPrdStrt());
			contracttermasvalueditemidentifierperiod.setStart(Cnct_Trm_As_VldItm_Id_Prd_Strtdate);
		}
		/******************** Cnct_Trm_As_VldItm_Id_Sys ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdSys() != null) {
			contracttermasvalueditemidentifier.setSystem(c.getCnctTrmAsVldItmIdSys());
		}
		/******************** contracttermasvalueditemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasvalueditemidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermasvalueditemidentifier.setType(contracttermasvalueditemidentifiertype);

		/******************** contracttermasvalueditemidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasvalueditemidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermasvalueditemidentifiertype.addCoding(contracttermasvalueditemidentifiertypecoding);

		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgCd() != null) {
			contracttermasvalueditemidentifiertypecoding.setCode(c.getCnctTrmAsVldItmIdTypCdgCd());
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgDsply() != null) {
			contracttermasvalueditemidentifiertypecoding.setDisplay(c.getCnctTrmAsVldItmIdTypCdgDsply());
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgSys() != null) {
			contracttermasvalueditemidentifiertypecoding.setSystem(c.getCnctTrmAsVldItmIdTypCdgSys());
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgUsrSltd() != null) {
			contracttermasvalueditemidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmAsVldItmIdTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypCdgVrsn() != null) {
			contracttermasvalueditemidentifiertypecoding.setVersion(c.getCnctTrmAsVldItmIdTypCdgVrsn());
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdTypTxt() != null) {
			contracttermasvalueditemidentifiertype.setText(c.getCnctTrmAsVldItmIdTypTxt());
		}
		/******************** contracttermasvalueditemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory contracttermasvalueditemidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		contracttermasvalueditemidentifier.setUse(contracttermasvalueditemidentifieruse.fromCode(c.getCnctTrmAsVldItmIdUse()));

		/******************** Cnct_Trm_As_VldItm_Id_Vl ********************************************************************************/
		if(c.getCnctTrmAsVldItmIdVl() != null) {
			contracttermasvalueditemidentifier.setValue(c.getCnctTrmAsVldItmIdVl());
		}
		/******************** Cnct_Trm_As_VldItm_LinkId ********************************************************************************/
		if(c.getCnctTrmAsVldItmLinkId() != null) {
			contracttermasvalueditem.addLinkId(c.getCnctTrmAsVldItmLinkId());
		}
		/******************** contracttermasvalueditemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money contracttermasvalueditemnet =  new org.hl7.fhir.r4.model.Money();
		contracttermasvalueditem.setNet(contracttermasvalueditemnet);

		/******************** Cnct_Trm_As_VldItm_Net_Crncy ********************************************************************************/
		if(c.getCnctTrmAsVldItmNetCrncy() != null) {
			contracttermasvalueditemnet.setCurrency(c.getCnctTrmAsVldItmNetCrncy());
		}
		/******************** Cnct_Trm_As_VldItm_Net_Vl ********************************************************************************/
		if(c.getCnctTrmAsVldItmNetVl() != null) {
			contracttermasvalueditemnet.setValue(Double.parseDouble((c.getCnctTrmAsVldItmNetVl())));
		}
		/******************** Cnct_Trm_As_VldItm_Pymnt ********************************************************************************/
		if(c.getCnctTrmAsVldItmPymnt() != null) {
			contracttermasvalueditem.setPayment(c.getCnctTrmAsVldItmPymnt());
		}
		/******************** Cnct_Trm_As_VldItm_PymntDt ********************************************************************************/
		if(c.getCnctTrmAsVldItmPymntDt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_As_VldItm_PymntDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_As_VldItm_PymntDtdate = Cnct_Trm_As_VldItm_PymntDtsdf.parse(c.getCnctTrmAsVldItmPymntDt());
			contracttermasvalueditem.setPaymentDate(Cnct_Trm_As_VldItm_PymntDtdate);
		}
		/******************** Cnct_Trm_As_VldItm_Points ********************************************************************************/
		if(c.getCnctTrmAsVldItmPoints() != null) {
			contracttermasvalueditem.setPoints(Double.parseDouble((c.getCnctTrmAsVldItmPoints())));
		}
		/******************** contracttermasvalueditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermasvalueditemquantity =  new org.hl7.fhir.r4.model.Quantity();
		contracttermasvalueditem.setQuantity(contracttermasvalueditemquantity);

		/******************** Cnct_Trm_As_VldItm_Qnty_Cd ********************************************************************************/
		if(c.getCnctTrmAsVldItmQntyCd() != null) {
			contracttermasvalueditemquantity.setCode(c.getCnctTrmAsVldItmQntyCd());
		}
		/******************** contracttermasvalueditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory contracttermasvalueditemquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		contracttermasvalueditemquantity.setComparator(contracttermasvalueditemquantitycomparator.fromCode(c.getCnctTrmAsVldItmQntyCmprtr()));

		/******************** Cnct_Trm_As_VldItm_Qnty_Sys ********************************************************************************/
		if(c.getCnctTrmAsVldItmQntySys() != null) {
			contracttermasvalueditemquantity.setSystem(c.getCnctTrmAsVldItmQntySys());
		}
		/******************** Cnct_Trm_As_VldItm_Qnty_Unt ********************************************************************************/
		if(c.getCnctTrmAsVldItmQntyUnt() != null) {
			contracttermasvalueditemquantity.setUnit(c.getCnctTrmAsVldItmQntyUnt());
		}
		/******************** Cnct_Trm_As_VldItm_Qnty_Vl ********************************************************************************/
		if(c.getCnctTrmAsVldItmQntyVl() != null) {
			contracttermasvalueditemquantity.setValue(Double.parseDouble((c.getCnctTrmAsVldItmQntyVl())));
		}
		/******************** Cnct_Trm_As_VldItm_Recipient ********************************************************************************/
		if(c.getCnctTrmAsVldItmRecipient() != null) {
			contracttermasvalueditem.setRecipient( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmAsVldItmRecipient()));
		}
		/******************** Cnct_Trm_As_VldItm_Responsible ********************************************************************************/
		if(c.getCnctTrmAsVldItmResponsible() != null) {
			contracttermasvalueditem.setResponsible( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmAsVldItmResponsible()));
		}
		/******************** Cnct_Trm_As_VldItm_SecurityLblNmbr ********************************************************************************/
		if(c.getCnctTrmAsVldItmSecurityLblNmbr() != null) {
			contracttermasvalueditem.addSecurityLabelNumber(Integer.parseInt(c.getCnctTrmAsVldItmSecurityLblNmbr()));
		}
		/******************** contracttermasvalueditemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money contracttermasvalueditemunitprice =  new org.hl7.fhir.r4.model.Money();
		contracttermasvalueditem.setUnitPrice(contracttermasvalueditemunitprice);

		/******************** Cnct_Trm_As_VldItm_UntPrice_Crncy ********************************************************************************/
		if(c.getCnctTrmAsVldItmUntPriceCrncy() != null) {
			contracttermasvalueditemunitprice.setCurrency(c.getCnctTrmAsVldItmUntPriceCrncy());
		}
		/******************** Cnct_Trm_As_VldItm_UntPrice_Vl ********************************************************************************/
		if(c.getCnctTrmAsVldItmUntPriceVl() != null) {
			contracttermasvalueditemunitprice.setValue(Double.parseDouble((c.getCnctTrmAsVldItmUntPriceVl())));
		}
		/******************** contracttermidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contracttermidentifier =  new org.hl7.fhir.r4.model.Identifier();
		contractterm.setIdentifier(contracttermidentifier);

		/******************** Cnct_Trm_Id_Assigner ********************************************************************************/
		if(c.getCnctTrmIdAssigner() != null) {
			contracttermidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmIdAssigner()));
		}
		/******************** contracttermidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		contracttermidentifier.setPeriod(contracttermidentifierperiod);

		/******************** Cnct_Trm_Id_Prd_End ********************************************************************************/
		if(c.getCnctTrmIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Id_Prd_Enddate = Cnct_Trm_Id_Prd_Endsdf.parse(c.getCnctTrmIdPrdEnd());
			contracttermidentifierperiod.setEnd(Cnct_Trm_Id_Prd_Enddate);
		}
		/******************** Cnct_Trm_Id_Prd_Strt ********************************************************************************/
		if(c.getCnctTrmIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Id_Prd_Strtdate = Cnct_Trm_Id_Prd_Strtsdf.parse(c.getCnctTrmIdPrdStrt());
			contracttermidentifierperiod.setStart(Cnct_Trm_Id_Prd_Strtdate);
		}
		/******************** Cnct_Trm_Id_Sys ********************************************************************************/
		if(c.getCnctTrmIdSys() != null) {
			contracttermidentifier.setSystem(c.getCnctTrmIdSys());
		}
		/******************** contracttermidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermidentifier.setType(contracttermidentifiertype);

		/******************** contracttermidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermidentifiertype.addCoding(contracttermidentifiertypecoding);

		/******************** Cnct_Trm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmIdTypCdgCd() != null) {
			contracttermidentifiertypecoding.setCode(c.getCnctTrmIdTypCdgCd());
		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmIdTypCdgDsply() != null) {
			contracttermidentifiertypecoding.setDisplay(c.getCnctTrmIdTypCdgDsply());
		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmIdTypCdgSys() != null) {
			contracttermidentifiertypecoding.setSystem(c.getCnctTrmIdTypCdgSys());
		}
		/******************** Cnct_Trm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmIdTypCdgUsrSltd() != null) {
			contracttermidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmIdTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmIdTypCdgVrsn() != null) {
			contracttermidentifiertypecoding.setVersion(c.getCnctTrmIdTypCdgVrsn());
		}
		/******************** Cnct_Trm_Id_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmIdTypTxt() != null) {
			contracttermidentifiertype.setText(c.getCnctTrmIdTypTxt());
		}
		/******************** contracttermidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory contracttermidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		contracttermidentifier.setUse(contracttermidentifieruse.fromCode(c.getCnctTrmIdUse()));

		/******************** Cnct_Trm_Id_Vl ********************************************************************************/
		if(c.getCnctTrmIdVl() != null) {
			contracttermidentifier.setValue(c.getCnctTrmIdVl());
		}
		/******************** Cnct_Trm_Issued ********************************************************************************/
		if(c.getCnctTrmIssued() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Issuedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Issueddate = Cnct_Trm_Issuedsdf.parse(c.getCnctTrmIssued());
			contractterm.setIssued(Cnct_Trm_Issueddate);
		}
		/******************** contracttermoffer ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractOfferComponent contracttermoffer =  new org.hl7.fhir.r4.model.Contract.ContractOfferComponent();
		contractterm.setOffer(contracttermoffer);

		/******************** contracttermofferanswer ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.AnswerComponent contracttermofferanswer =  new org.hl7.fhir.r4.model.Contract.AnswerComponent();
		contracttermoffer.addAnswer(contracttermofferanswer);

		/******************** contracttermofferanswervalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contracttermofferanswervalueattachment =  new org.hl7.fhir.r4.model.Attachment();
		contracttermofferanswer.setValue(contracttermofferanswervalueattachment);

		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntCntntTyp() != null) {
			contracttermofferanswervalueattachment.setContentType(c.getCnctTrmOffrAnsVlAttchmntCntntTyp());
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntCreation() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Offr_Ans_VlAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Offr_Ans_VlAttchmnt_Creationdate = Cnct_Trm_Offr_Ans_VlAttchmnt_Creationsdf.parse(c.getCnctTrmOffrAnsVlAttchmntCreation());
			contracttermofferanswervalueattachment.setCreation(Cnct_Trm_Offr_Ans_VlAttchmnt_Creationdate);
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Data ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntData() != null) {
			contracttermofferanswervalueattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctTrmOffrAnsVlAttchmntData()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntHash() != null) {
			contracttermofferanswervalueattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCnctTrmOffrAnsVlAttchmntHash()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntLnguage() != null) {
			contracttermofferanswervalueattachment.setLanguage(c.getCnctTrmOffrAnsVlAttchmntLnguage());
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntSz() != null) {
			contracttermofferanswervalueattachment.setSize(Integer.parseInt(c.getCnctTrmOffrAnsVlAttchmntSz()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntTtl() != null) {
			contracttermofferanswervalueattachment.setTitle(c.getCnctTrmOffrAnsVlAttchmntTtl());
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Url ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlAttchmntUrl() != null) {
			contracttermofferanswervalueattachment.setUrl(c.getCnctTrmOffrAnsVlAttchmntUrl());
		}
		/******************** Cnct_Trm_Offr_Ans_VlBooleanTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlBooleanTyp() != null) {
			contracttermofferanswer.setValue( new org.hl7.fhir.r4.model.BooleanType(c.getCnctTrmOffrAnsVlBooleanTyp()));
		}
		/******************** contracttermofferanswervaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferanswervaluecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermofferanswer.setValue(contracttermofferanswervaluecoding);

		/******************** Cnct_Trm_Offr_Ans_VlCdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgCd() != null) {
			contracttermofferanswervaluecoding.setCode(c.getCnctTrmOffrAnsVlCdgCd());
		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgDsply() != null) {
			contracttermofferanswervaluecoding.setDisplay(c.getCnctTrmOffrAnsVlCdgDsply());
		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgSys() != null) {
			contracttermofferanswervaluecoding.setSystem(c.getCnctTrmOffrAnsVlCdgSys());
		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgUsrSltd() != null) {
			contracttermofferanswervaluecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmOffrAnsVlCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlCdgVrsn() != null) {
			contracttermofferanswervaluecoding.setVersion(c.getCnctTrmOffrAnsVlCdgVrsn());
		}
		/******************** Cnct_Trm_Offr_Ans_VlDtTimeTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlDtTimeTyp() != null) {
			contracttermofferanswer.setValue( new org.hl7.fhir.r4.model.DateTimeType(c.getCnctTrmOffrAnsVlDtTimeTyp()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlDtTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlDtTyp() != null) {
			contracttermofferanswer.setValue( new org.hl7.fhir.r4.model.DateType(c.getCnctTrmOffrAnsVlDtTyp()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlDecimalTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlDecimalTyp() != null) {
			contracttermofferanswer.setValue( new org.hl7.fhir.r4.model.DecimalType(c.getCnctTrmOffrAnsVlDecimalTyp()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlIntegerTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlIntegerTyp() != null) {
			contracttermofferanswer.setValue( new org.hl7.fhir.r4.model.IntegerType(c.getCnctTrmOffrAnsVlIntegerTyp()));
		}
		/******************** contracttermofferanswervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermofferanswervaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		contracttermofferanswer.setValue(contracttermofferanswervaluequantity);

		/******************** Cnct_Trm_Offr_Ans_VlQnty_Cd ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlQntyCd() != null) {
			contracttermofferanswervaluequantity.setCode(c.getCnctTrmOffrAnsVlQntyCd());
		}
		/******************** contracttermofferanswervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory contracttermofferanswervaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		contracttermofferanswervaluequantity.setComparator(contracttermofferanswervaluequantitycomparator.fromCode(c.getCnctTrmOffrAnsVlQntyCmprtr()));

		/******************** Cnct_Trm_Offr_Ans_VlQnty_Sys ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlQntySys() != null) {
			contracttermofferanswervaluequantity.setSystem(c.getCnctTrmOffrAnsVlQntySys());
		}
		/******************** Cnct_Trm_Offr_Ans_VlQnty_Unt ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlQntyUnt() != null) {
			contracttermofferanswervaluequantity.setUnit(c.getCnctTrmOffrAnsVlQntyUnt());
		}
		/******************** Cnct_Trm_Offr_Ans_VlQnty_Vl ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlQntyVl() != null) {
			contracttermofferanswervaluequantity.setValue(Double.parseDouble((c.getCnctTrmOffrAnsVlQntyVl())));
		}
		/******************** Cnct_Trm_Offr_Ans_VlRfrnc ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlRfrnc() != null) {
			contracttermofferanswer.setValue( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmOffrAnsVlRfrnc()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlStrgTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlStrgTyp() != null) {
			contracttermofferanswer.setValue( new org.hl7.fhir.r4.model.StringType(c.getCnctTrmOffrAnsVlStrgTyp()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlTimeTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlTimeTyp() != null) {
			contracttermofferanswer.setValue( new org.hl7.fhir.r4.model.TimeType(c.getCnctTrmOffrAnsVlTimeTyp()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlUriTyp ********************************************************************************/
		if(c.getCnctTrmOffrAnsVlUriTyp() != null) {
			contracttermofferanswer.setValue( new org.hl7.fhir.r4.model.UriType(c.getCnctTrmOffrAnsVlUriTyp()));
		}
		/******************** contracttermofferdecision ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferdecision =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermoffer.setDecision(contracttermofferdecision);

		/******************** contracttermofferdecisioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferdecisioncoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermofferdecision.addCoding(contracttermofferdecisioncoding);

		/******************** Cnct_Trm_Offr_Decision_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgCd() != null) {
			contracttermofferdecisioncoding.setCode(c.getCnctTrmOffrDecisionCdgCd());
		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgDsply() != null) {
			contracttermofferdecisioncoding.setDisplay(c.getCnctTrmOffrDecisionCdgDsply());
		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgSys() != null) {
			contracttermofferdecisioncoding.setSystem(c.getCnctTrmOffrDecisionCdgSys());
		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgUsrSltd() != null) {
			contracttermofferdecisioncoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmOffrDecisionCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrDecisionCdgVrsn() != null) {
			contracttermofferdecisioncoding.setVersion(c.getCnctTrmOffrDecisionCdgVrsn());
		}
		/******************** Cnct_Trm_Offr_Decision_Txt ********************************************************************************/
		if(c.getCnctTrmOffrDecisionTxt() != null) {
			contracttermofferdecision.setText(c.getCnctTrmOffrDecisionTxt());
		}
		/******************** contracttermofferdecisionmode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferdecisionmode =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermoffer.addDecisionMode(contracttermofferdecisionmode);

		/******************** contracttermofferdecisionmodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferdecisionmodecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermofferdecisionmode.addCoding(contracttermofferdecisionmodecoding);

		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgCd() != null) {
			contracttermofferdecisionmodecoding.setCode(c.getCnctTrmOffrDecisionModeCdgCd());
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgDsply() != null) {
			contracttermofferdecisionmodecoding.setDisplay(c.getCnctTrmOffrDecisionModeCdgDsply());
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgSys() != null) {
			contracttermofferdecisionmodecoding.setSystem(c.getCnctTrmOffrDecisionModeCdgSys());
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgUsrSltd() != null) {
			contracttermofferdecisionmodecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmOffrDecisionModeCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeCdgVrsn() != null) {
			contracttermofferdecisionmodecoding.setVersion(c.getCnctTrmOffrDecisionModeCdgVrsn());
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Txt ********************************************************************************/
		if(c.getCnctTrmOffrDecisionModeTxt() != null) {
			contracttermofferdecisionmode.setText(c.getCnctTrmOffrDecisionModeTxt());
		}
		/******************** contracttermofferidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contracttermofferidentifier =  new org.hl7.fhir.r4.model.Identifier();
		contracttermoffer.addIdentifier(contracttermofferidentifier);

		/******************** Cnct_Trm_Offr_Id_Assigner ********************************************************************************/
		if(c.getCnctTrmOffrIdAssigner() != null) {
			contracttermofferidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmOffrIdAssigner()));
		}
		/******************** contracttermofferidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermofferidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		contracttermofferidentifier.setPeriod(contracttermofferidentifierperiod);

		/******************** Cnct_Trm_Offr_Id_Prd_End ********************************************************************************/
		if(c.getCnctTrmOffrIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Offr_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Offr_Id_Prd_Enddate = Cnct_Trm_Offr_Id_Prd_Endsdf.parse(c.getCnctTrmOffrIdPrdEnd());
			contracttermofferidentifierperiod.setEnd(Cnct_Trm_Offr_Id_Prd_Enddate);
		}
		/******************** Cnct_Trm_Offr_Id_Prd_Strt ********************************************************************************/
		if(c.getCnctTrmOffrIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cnct_Trm_Offr_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cnct_Trm_Offr_Id_Prd_Strtdate = Cnct_Trm_Offr_Id_Prd_Strtsdf.parse(c.getCnctTrmOffrIdPrdStrt());
			contracttermofferidentifierperiod.setStart(Cnct_Trm_Offr_Id_Prd_Strtdate);
		}
		/******************** Cnct_Trm_Offr_Id_Sys ********************************************************************************/
		if(c.getCnctTrmOffrIdSys() != null) {
			contracttermofferidentifier.setSystem(c.getCnctTrmOffrIdSys());
		}
		/******************** contracttermofferidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermofferidentifier.setType(contracttermofferidentifiertype);

		/******************** contracttermofferidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermofferidentifiertype.addCoding(contracttermofferidentifiertypecoding);

		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgCd() != null) {
			contracttermofferidentifiertypecoding.setCode(c.getCnctTrmOffrIdTypCdgCd());
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgDsply() != null) {
			contracttermofferidentifiertypecoding.setDisplay(c.getCnctTrmOffrIdTypCdgDsply());
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgSys() != null) {
			contracttermofferidentifiertypecoding.setSystem(c.getCnctTrmOffrIdTypCdgSys());
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgUsrSltd() != null) {
			contracttermofferidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmOffrIdTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrIdTypCdgVrsn() != null) {
			contracttermofferidentifiertypecoding.setVersion(c.getCnctTrmOffrIdTypCdgVrsn());
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmOffrIdTypTxt() != null) {
			contracttermofferidentifiertype.setText(c.getCnctTrmOffrIdTypTxt());
		}
		/******************** contracttermofferidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory contracttermofferidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		contracttermofferidentifier.setUse(contracttermofferidentifieruse.fromCode(c.getCnctTrmOffrIdUse()));

		/******************** Cnct_Trm_Offr_Id_Vl ********************************************************************************/
		if(c.getCnctTrmOffrIdVl() != null) {
			contracttermofferidentifier.setValue(c.getCnctTrmOffrIdVl());
		}
		/******************** Cnct_Trm_Offr_LinkId ********************************************************************************/
		if(c.getCnctTrmOffrLinkId() != null) {
			contracttermoffer.addLinkId(c.getCnctTrmOffrLinkId());
		}
		/******************** contracttermofferparty ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractPartyComponent contracttermofferparty =  new org.hl7.fhir.r4.model.Contract.ContractPartyComponent();
		contracttermoffer.addParty(contracttermofferparty);

		/******************** Cnct_Trm_Offr_Party_Rfrnc ********************************************************************************/
		if(c.getCnctTrmOffrPartyRfrnc() != null) {
			contracttermofferparty.addReference( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmOffrPartyRfrnc()));
		}
		/******************** contracttermofferpartyrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferpartyrole =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermofferparty.setRole(contracttermofferpartyrole);

		/******************** contracttermofferpartyrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferpartyrolecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermofferpartyrole.addCoding(contracttermofferpartyrolecoding);

		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgCd() != null) {
			contracttermofferpartyrolecoding.setCode(c.getCnctTrmOffrPartyRoleCdgCd());
		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgDsply() != null) {
			contracttermofferpartyrolecoding.setDisplay(c.getCnctTrmOffrPartyRoleCdgDsply());
		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgSys() != null) {
			contracttermofferpartyrolecoding.setSystem(c.getCnctTrmOffrPartyRoleCdgSys());
		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgUsrSltd() != null) {
			contracttermofferpartyrolecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmOffrPartyRoleCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleCdgVrsn() != null) {
			contracttermofferpartyrolecoding.setVersion(c.getCnctTrmOffrPartyRoleCdgVrsn());
		}
		/******************** Cnct_Trm_Offr_Party_Role_Txt ********************************************************************************/
		if(c.getCnctTrmOffrPartyRoleTxt() != null) {
			contracttermofferpartyrole.setText(c.getCnctTrmOffrPartyRoleTxt());
		}
		/******************** Cnct_Trm_Offr_SecurityLblNmbr ********************************************************************************/
		if(c.getCnctTrmOffrSecurityLblNmbr() != null) {
			contracttermoffer.addSecurityLabelNumber(Integer.parseInt(c.getCnctTrmOffrSecurityLblNmbr()));
		}
		/******************** Cnct_Trm_Offr_Txt ********************************************************************************/
		if(c.getCnctTrmOffrTxt() != null) {
			contracttermoffer.setText(c.getCnctTrmOffrTxt());
		}
		/******************** Cnct_Trm_Offr_Topic ********************************************************************************/
		if(c.getCnctTrmOffrTopic() != null) {
			contracttermoffer.setTopic( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmOffrTopic()));
		}
		/******************** contracttermoffertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermoffertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contracttermoffer.setType(contracttermoffertype);

		/******************** contracttermoffertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermoffertypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermoffertype.addCoding(contracttermoffertypecoding);

		/******************** Cnct_Trm_Offr_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgCd() != null) {
			contracttermoffertypecoding.setCode(c.getCnctTrmOffrTypCdgCd());
		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgDsply() != null) {
			contracttermoffertypecoding.setDisplay(c.getCnctTrmOffrTypCdgDsply());
		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgSys() != null) {
			contracttermoffertypecoding.setSystem(c.getCnctTrmOffrTypCdgSys());
		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgUsrSltd() != null) {
			contracttermoffertypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmOffrTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmOffrTypCdgVrsn() != null) {
			contracttermoffertypecoding.setVersion(c.getCnctTrmOffrTypCdgVrsn());
		}
		/******************** Cnct_Trm_Offr_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmOffrTypTxt() != null) {
			contracttermoffertype.setText(c.getCnctTrmOffrTypTxt());
		}
		/******************** contracttermsecuritylabel ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.SecurityLabelComponent contracttermsecuritylabel =  new org.hl7.fhir.r4.model.Contract.SecurityLabelComponent();
		contractterm.addSecurityLabel(contracttermsecuritylabel);

		/******************** contracttermsecuritylabelcategory ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermsecuritylabelcategory =  new org.hl7.fhir.r4.model.Coding();
		contracttermsecuritylabel.addCategory(contracttermsecuritylabelcategory);

		/******************** Cnct_Trm_SecurityLbl_Ctgry_Cd ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgryCd() != null) {
			contracttermsecuritylabelcategory.setCode(c.getCnctTrmSecurityLblCtgryCd());
		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Dsply ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgryDsply() != null) {
			contracttermsecuritylabelcategory.setDisplay(c.getCnctTrmSecurityLblCtgryDsply());
		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Sys ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgrySys() != null) {
			contracttermsecuritylabelcategory.setSystem(c.getCnctTrmSecurityLblCtgrySys());
		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_UsrSltd ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgryUsrSltd() != null) {
			contracttermsecuritylabelcategory.setUserSelected(Boolean.parseBoolean(c.getCnctTrmSecurityLblCtgryUsrSltd()));
		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Vrsn ********************************************************************************/
		if(c.getCnctTrmSecurityLblCtgryVrsn() != null) {
			contracttermsecuritylabelcategory.setVersion(c.getCnctTrmSecurityLblCtgryVrsn());
		}
		/******************** contracttermsecuritylabelclassification ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermsecuritylabelclassification =  new org.hl7.fhir.r4.model.Coding();
		contracttermsecuritylabel.setClassification(contracttermsecuritylabelclassification);

		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Cd ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnCd() != null) {
			contracttermsecuritylabelclassification.setCode(c.getCnctTrmSecurityLblClsfctnCd());
		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Dsply ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnDsply() != null) {
			contracttermsecuritylabelclassification.setDisplay(c.getCnctTrmSecurityLblClsfctnDsply());
		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Sys ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnSys() != null) {
			contracttermsecuritylabelclassification.setSystem(c.getCnctTrmSecurityLblClsfctnSys());
		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_UsrSltd ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnUsrSltd() != null) {
			contracttermsecuritylabelclassification.setUserSelected(Boolean.parseBoolean(c.getCnctTrmSecurityLblClsfctnUsrSltd()));
		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Vrsn ********************************************************************************/
		if(c.getCnctTrmSecurityLblClsfctnVrsn() != null) {
			contracttermsecuritylabelclassification.setVersion(c.getCnctTrmSecurityLblClsfctnVrsn());
		}
		/******************** contracttermsecuritylabelcontrol ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermsecuritylabelcontrol =  new org.hl7.fhir.r4.model.Coding();
		contracttermsecuritylabel.addControl(contracttermsecuritylabelcontrol);

		/******************** Cnct_Trm_SecurityLbl_Control_Cd ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlCd() != null) {
			contracttermsecuritylabelcontrol.setCode(c.getCnctTrmSecurityLblControlCd());
		}
		/******************** Cnct_Trm_SecurityLbl_Control_Dsply ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlDsply() != null) {
			contracttermsecuritylabelcontrol.setDisplay(c.getCnctTrmSecurityLblControlDsply());
		}
		/******************** Cnct_Trm_SecurityLbl_Control_Sys ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlSys() != null) {
			contracttermsecuritylabelcontrol.setSystem(c.getCnctTrmSecurityLblControlSys());
		}
		/******************** Cnct_Trm_SecurityLbl_Control_UsrSltd ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlUsrSltd() != null) {
			contracttermsecuritylabelcontrol.setUserSelected(Boolean.parseBoolean(c.getCnctTrmSecurityLblControlUsrSltd()));
		}
		/******************** Cnct_Trm_SecurityLbl_Control_Vrsn ********************************************************************************/
		if(c.getCnctTrmSecurityLblControlVrsn() != null) {
			contracttermsecuritylabelcontrol.setVersion(c.getCnctTrmSecurityLblControlVrsn());
		}
		/******************** Cnct_Trm_SecurityLbl_Nmbr ********************************************************************************/
		if(c.getCnctTrmSecurityLblNmbr() != null) {
			contracttermsecuritylabel.addNumber(Integer.parseInt(c.getCnctTrmSecurityLblNmbr()));
		}
		/******************** contracttermsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermsubtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contractterm.setSubType(contracttermsubtype);

		/******************** contracttermsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermsubtypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermsubtype.addCoding(contracttermsubtypecoding);

		/******************** Cnct_Trm_SubTyp_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmSubTypCdgCd() != null) {
			contracttermsubtypecoding.setCode(c.getCnctTrmSubTypCdgCd());
		}
		/******************** Cnct_Trm_SubTyp_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmSubTypCdgDsply() != null) {
			contracttermsubtypecoding.setDisplay(c.getCnctTrmSubTypCdgDsply());
		}
		/******************** Cnct_Trm_SubTyp_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmSubTypCdgSys() != null) {
			contracttermsubtypecoding.setSystem(c.getCnctTrmSubTypCdgSys());
		}
		/******************** Cnct_Trm_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmSubTypCdgUsrSltd() != null) {
			contracttermsubtypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmSubTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmSubTypCdgVrsn() != null) {
			contracttermsubtypecoding.setVersion(c.getCnctTrmSubTypCdgVrsn());
		}
		/******************** Cnct_Trm_SubTyp_Txt ********************************************************************************/
		if(c.getCnctTrmSubTypTxt() != null) {
			contracttermsubtype.setText(c.getCnctTrmSubTypTxt());
		}
		/******************** Cnct_Trm_Txt ********************************************************************************/
		if(c.getCnctTrmTxt() != null) {
			contractterm.setText(c.getCnctTrmTxt());
		}
		/******************** contracttermtopiccodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermtopiccodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		contractterm.setTopic(contracttermtopiccodeableconcept);

		/******************** contracttermtopiccodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermtopiccodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermtopiccodeableconcept.addCoding(contracttermtopiccodeableconceptcoding);

		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgCd() != null) {
			contracttermtopiccodeableconceptcoding.setCode(c.getCnctTrmTopicCdbleCncptCdgCd());
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgDsply() != null) {
			contracttermtopiccodeableconceptcoding.setDisplay(c.getCnctTrmTopicCdbleCncptCdgDsply());
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgSys() != null) {
			contracttermtopiccodeableconceptcoding.setSystem(c.getCnctTrmTopicCdbleCncptCdgSys());
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgUsrSltd() != null) {
			contracttermtopiccodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmTopicCdbleCncptCdgUsrSltd()));
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptCdgVrsn() != null) {
			contracttermtopiccodeableconceptcoding.setVersion(c.getCnctTrmTopicCdbleCncptCdgVrsn());
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Txt ********************************************************************************/
		if(c.getCnctTrmTopicCdbleCncptTxt() != null) {
			contracttermtopiccodeableconcept.setText(c.getCnctTrmTopicCdbleCncptTxt());
		}
		/******************** Cnct_Trm_TopicRfrnc ********************************************************************************/
		if(c.getCnctTrmTopicRfrnc() != null) {
			contractterm.setTopic( new org.hl7.fhir.r4.model.Reference(c.getCnctTrmTopicRfrnc()));
		}
		/******************** contracttermtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermtype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contractterm.setType(contracttermtype);

		/******************** contracttermtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermtypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttermtype.addCoding(contracttermtypecoding);

		/******************** Cnct_Trm_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTrmTypCdgCd() != null) {
			contracttermtypecoding.setCode(c.getCnctTrmTypCdgCd());
		}
		/******************** Cnct_Trm_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTrmTypCdgDsply() != null) {
			contracttermtypecoding.setDisplay(c.getCnctTrmTypCdgDsply());
		}
		/******************** Cnct_Trm_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTrmTypCdgSys() != null) {
			contracttermtypecoding.setSystem(c.getCnctTrmTypCdgSys());
		}
		/******************** Cnct_Trm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTrmTypCdgUsrSltd() != null) {
			contracttermtypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTrmTypCdgUsrSltd()));
		}
		/******************** Cnct_Trm_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTrmTypCdgVrsn() != null) {
			contracttermtypecoding.setVersion(c.getCnctTrmTypCdgVrsn());
		}
		/******************** Cnct_Trm_Typ_Txt ********************************************************************************/
		if(c.getCnctTrmTypTxt() != null) {
			contracttermtype.setText(c.getCnctTrmTypTxt());
		}
		/******************** Cnct_Ttl ********************************************************************************/
		if(c.getCnctTtl() != null) {
			contract.setTitle(c.getCnctTtl());
		}
		/******************** contracttopiccodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttopiccodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		contract.setTopic(contracttopiccodeableconcept);

		/******************** contracttopiccodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttopiccodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		contracttopiccodeableconcept.addCoding(contracttopiccodeableconceptcoding);

		/******************** Cnct_TopicCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgCd() != null) {
			contracttopiccodeableconceptcoding.setCode(c.getCnctTopicCdbleCncptCdgCd());
		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgDsply() != null) {
			contracttopiccodeableconceptcoding.setDisplay(c.getCnctTopicCdbleCncptCdgDsply());
		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgSys() != null) {
			contracttopiccodeableconceptcoding.setSystem(c.getCnctTopicCdbleCncptCdgSys());
		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgUsrSltd() != null) {
			contracttopiccodeableconceptcoding.setUserSelected(Boolean.parseBoolean(c.getCnctTopicCdbleCncptCdgUsrSltd()));
		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTopicCdbleCncptCdgVrsn() != null) {
			contracttopiccodeableconceptcoding.setVersion(c.getCnctTopicCdbleCncptCdgVrsn());
		}
		/******************** Cnct_TopicCdbleCncpt_Txt ********************************************************************************/
		if(c.getCnctTopicCdbleCncptTxt() != null) {
			contracttopiccodeableconcept.setText(c.getCnctTopicCdbleCncptTxt());
		}
		/******************** Cnct_TopicRfrnc ********************************************************************************/
		if(c.getCnctTopicRfrnc() != null) {
			contract.setTopic( new org.hl7.fhir.r4.model.Reference(c.getCnctTopicRfrnc()));
		}
		/******************** contracttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttype =  new org.hl7.fhir.r4.model.CodeableConcept();
		contract.setType(contracttype);

		/******************** contracttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttypecoding =  new org.hl7.fhir.r4.model.Coding();
		contracttype.addCoding(contracttypecoding);

		/******************** Cnct_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCnctTypCdgCd() != null) {
			contracttypecoding.setCode(c.getCnctTypCdgCd());
		}
		/******************** Cnct_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCnctTypCdgDsply() != null) {
			contracttypecoding.setDisplay(c.getCnctTypCdgDsply());
		}
		/******************** Cnct_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCnctTypCdgSys() != null) {
			contracttypecoding.setSystem(c.getCnctTypCdgSys());
		}
		/******************** Cnct_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCnctTypCdgUsrSltd() != null) {
			contracttypecoding.setUserSelected(Boolean.parseBoolean(c.getCnctTypCdgUsrSltd()));
		}
		/******************** Cnct_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCnctTypCdgVrsn() != null) {
			contracttypecoding.setVersion(c.getCnctTypCdgVrsn());
		}
		/******************** Cnct_Typ_Txt ********************************************************************************/
		if(c.getCnctTypTxt() != null) {
			contracttype.setText(c.getCnctTypTxt());
		}
		/******************** Cnct_Url ********************************************************************************/
		if(c.getCnctUrl() != null) {
			contract.setUrl(c.getCnctUrl());
		}
		/******************** Cnct_Vrsn ********************************************************************************/
		if(c.getCnctVrsn() != null) {
			contract.setVersion(c.getCnctVrsn());
		}
		return contract;
	}
}
