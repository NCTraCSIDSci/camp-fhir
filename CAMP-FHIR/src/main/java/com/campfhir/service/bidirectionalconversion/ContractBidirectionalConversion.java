package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Contract;
public class ContractBidirectionalConversion 
{
	public Contract Contracts(org.hl7.fhir.r4.model.Contract contract) throws ParseException
	{
		 main.java.com.campfhir.model.Contract c = new  main.java.com.campfhir.model.Contract();

		/******************** id ********************************************************************************/
		contract.setId(c.getId());

		/******************** Cnct_Nm ********************************************************************************/
		if(contract.hasName()) {
			c.setCnctNm(String.valueOf(contract.getName()));
		}
		/******************** contracttype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttype = contract.getType();

		/******************** contracttypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttypecoding = contracttype.getCodingFirstRep();

		/******************** Cnct_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttypecoding.hasDisplay()) {
			c.setCnctTypCdgDsply(String.valueOf(contracttypecoding.getDisplay()));
		}
		/******************** Cnct_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttypecoding.hasVersion()) {
			c.setCnctTypCdgVrsn(String.valueOf(contracttypecoding.getVersion()));
		}
		/******************** Cnct_Typ_Cdg_Cd ********************************************************************************/
		if(contracttypecoding.hasCode()) {
			c.setCnctTypCdgCd(String.valueOf(contracttypecoding.getCode()));
		}
		/******************** Cnct_Typ_Cdg_Sys ********************************************************************************/
		if(contracttypecoding.hasSystem()) {
			c.setCnctTypCdgSys(String.valueOf(contracttypecoding.getSystem()));
		}
		/******************** Cnct_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttypecoding.hasUserSelected()) {
			c.setCnctTypCdgUsrSltd(String.valueOf(contracttypecoding.getUserSelected()));
		}
		/******************** Cnct_Typ_Txt ********************************************************************************/
		if(contracttype.hasText()) {
			c.setCnctTypTxt(String.valueOf(contracttype.getText()));
		}
		/******************** Cnct_Vrsn ********************************************************************************/
		if(contract.hasVersion()) {
			c.setCnctVrsn(String.valueOf(contract.getVersion()));
		}
		/******************** Cnct_Url ********************************************************************************/
		if(contract.hasUrl()) {
			c.setCnctUrl(String.valueOf(contract.getUrl()));
		}
		/******************** contractfriendly ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.FriendlyLanguageComponent contractfriendly = contract.getFriendlyFirstRep();

		/******************** Cnct_Friendly_CntntRfrnc ********************************************************************************/
		if(contractfriendly.hasContentReference()) {
			c.setCnctFriendlyCntntRfrnc(String.valueOf(contractfriendly.getContentReference()));
		}
		/******************** contractfriendlycontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractfriendlycontentattachment = contractfriendly.getContentAttachment();

		/******************** Cnct_Friendly_CntntAttchmnt_Sz ********************************************************************************/
		if(contractfriendlycontentattachment.hasSize()) {
			c.setCnctFriendlyCntntAttchmntSz(String.valueOf(contractfriendlycontentattachment.getSize()));
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Lnguage ********************************************************************************/
		if(contractfriendlycontentattachment.hasLanguage()) {
			c.setCnctFriendlyCntntAttchmntLnguage(String.valueOf(contractfriendlycontentattachment.getLanguage()));
		}
		/******************** Cnct_Friendly_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(contractfriendlycontentattachment.hasContentType()) {
			c.setCnctFriendlyCntntAttchmntCntntTyp(String.valueOf(contractfriendlycontentattachment.getContentType()));
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Url ********************************************************************************/
		if(contractfriendlycontentattachment.hasUrl()) {
			c.setCnctFriendlyCntntAttchmntUrl(String.valueOf(contractfriendlycontentattachment.getUrl()));
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Ttl ********************************************************************************/
		if(contractfriendlycontentattachment.hasTitle()) {
			c.setCnctFriendlyCntntAttchmntTtl(String.valueOf(contractfriendlycontentattachment.getTitle()));
		}
		/******************** Cnct_Friendly_CntntAttchmnt_Hash ********************************************************************************/
		if(contractfriendlycontentattachment.hasHash()) {
			c.setCnctFriendlyCntntAttchmntHash(String.valueOf(contractfriendlycontentattachment.getHash()));
		}

		/******************** Cnct_Friendly_CntntAttchmnt_Data ********************************************************************************/
		if(contractfriendlycontentattachment.hasData()) {
			c.setCnctFriendlyCntntAttchmntData(String.valueOf(contractfriendlycontentattachment.getData()));
		}

		/******************** Cnct_Friendly_CntntAttchmnt_Creation ********************************************************************************/
		if(contractfriendlycontentattachment.hasCreation()) {
			c.setCnctFriendlyCntntAttchmntCreation(String.valueOf(contractfriendlycontentattachment.getCreation()));
		}
		/******************** contractcontentderivative ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractcontentderivative = contract.getContentDerivative();

		/******************** contractcontentderivativecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractcontentderivativecoding = contractcontentderivative.getCodingFirstRep();

		/******************** Cnct_CntntDerivative_Cdg_Dsply ********************************************************************************/
		if(contractcontentderivativecoding.hasDisplay()) {
			c.setCnctCntntDerivativeCdgDsply(String.valueOf(contractcontentderivativecoding.getDisplay()));
		}
		/******************** Cnct_CntntDerivative_Cdg_Vrsn ********************************************************************************/
		if(contractcontentderivativecoding.hasVersion()) {
			c.setCnctCntntDerivativeCdgVrsn(String.valueOf(contractcontentderivativecoding.getVersion()));
		}
		/******************** Cnct_CntntDerivative_Cdg_Cd ********************************************************************************/
		if(contractcontentderivativecoding.hasCode()) {
			c.setCnctCntntDerivativeCdgCd(String.valueOf(contractcontentderivativecoding.getCode()));
		}
		/******************** Cnct_CntntDerivative_Cdg_Sys ********************************************************************************/
		if(contractcontentderivativecoding.hasSystem()) {
			c.setCnctCntntDerivativeCdgSys(String.valueOf(contractcontentderivativecoding.getSystem()));
		}
		/******************** Cnct_CntntDerivative_Cdg_UsrSltd ********************************************************************************/
		if(contractcontentderivativecoding.hasUserSelected()) {
			c.setCnctCntntDerivativeCdgUsrSltd(String.valueOf(contractcontentderivativecoding.getUserSelected()));
		}
		/******************** Cnct_CntntDerivative_Txt ********************************************************************************/
		if(contractcontentderivative.hasText()) {
			c.setCnctCntntDerivativeTxt(String.valueOf(contractcontentderivative.getText()));
		}
		/******************** contracttopiccodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttopiccodeableconcept = contract.getTopicCodeableConcept();

		/******************** contracttopiccodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttopiccodeableconceptcoding = contracttopiccodeableconcept.getCodingFirstRep();

		/******************** Cnct_TopicCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(contracttopiccodeableconceptcoding.hasDisplay()) {
			c.setCnctTopicCdbleCncptCdgDsply(String.valueOf(contracttopiccodeableconceptcoding.getDisplay()));
		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(contracttopiccodeableconceptcoding.hasVersion()) {
			c.setCnctTopicCdbleCncptCdgVrsn(String.valueOf(contracttopiccodeableconceptcoding.getVersion()));
		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(contracttopiccodeableconceptcoding.hasCode()) {
			c.setCnctTopicCdbleCncptCdgCd(String.valueOf(contracttopiccodeableconceptcoding.getCode()));
		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(contracttopiccodeableconceptcoding.hasSystem()) {
			c.setCnctTopicCdbleCncptCdgSys(String.valueOf(contracttopiccodeableconceptcoding.getSystem()));
		}
		/******************** Cnct_TopicCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(contracttopiccodeableconceptcoding.hasUserSelected()) {
			c.setCnctTopicCdbleCncptCdgUsrSltd(String.valueOf(contracttopiccodeableconceptcoding.getUserSelected()));
		}
		/******************** Cnct_TopicCdbleCncpt_Txt ********************************************************************************/
		if(contracttopiccodeableconcept.hasText()) {
			c.setCnctTopicCdbleCncptTxt(String.valueOf(contracttopiccodeableconcept.getText()));
		}
		/******************** contractcontentdefinition ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContentDefinitionComponent contractcontentdefinition = contract.getContentDefinition();

		/******************** contractcontentdefinitiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractcontentdefinitiontype = contractcontentdefinition.getType();

		/******************** contractcontentdefinitiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractcontentdefinitiontypecoding = contractcontentdefinitiontype.getCodingFirstRep();

		/******************** Cnct_CntntDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(contractcontentdefinitiontypecoding.hasDisplay()) {
			c.setCnctCntntDfnTypCdgDsply(String.valueOf(contractcontentdefinitiontypecoding.getDisplay()));
		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(contractcontentdefinitiontypecoding.hasVersion()) {
			c.setCnctCntntDfnTypCdgVrsn(String.valueOf(contractcontentdefinitiontypecoding.getVersion()));
		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Cd ********************************************************************************/
		if(contractcontentdefinitiontypecoding.hasCode()) {
			c.setCnctCntntDfnTypCdgCd(String.valueOf(contractcontentdefinitiontypecoding.getCode()));
		}
		/******************** Cnct_CntntDfn_Typ_Cdg_Sys ********************************************************************************/
		if(contractcontentdefinitiontypecoding.hasSystem()) {
			c.setCnctCntntDfnTypCdgSys(String.valueOf(contractcontentdefinitiontypecoding.getSystem()));
		}
		/******************** Cnct_CntntDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contractcontentdefinitiontypecoding.hasUserSelected()) {
			c.setCnctCntntDfnTypCdgUsrSltd(String.valueOf(contractcontentdefinitiontypecoding.getUserSelected()));
		}
		/******************** Cnct_CntntDfn_Typ_Txt ********************************************************************************/
		if(contractcontentdefinitiontype.hasText()) {
			c.setCnctCntntDfnTypTxt(String.valueOf(contractcontentdefinitiontype.getText()));
		}
		/******************** contractcontentdefinitionpublicationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractPublicationStatus contractcontentdefinitionpublicationstatus = contractcontentdefinition.getPublicationStatus();
		c.setCnctCntntDfnPublicationSts(contractcontentdefinitionpublicationstatus.toCode());

		/******************** Cnct_CntntDfn_PublicationDt ********************************************************************************/
		if(contractcontentdefinition.hasPublicationDate()) {
			c.setCnctCntntDfnPublicationDt(String.valueOf(contractcontentdefinition.getPublicationDate()));
		}
		/******************** contractcontentdefinitionsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractcontentdefinitionsubtype = contractcontentdefinition.getSubType();

		/******************** contractcontentdefinitionsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractcontentdefinitionsubtypecoding = contractcontentdefinitionsubtype.getCodingFirstRep();

		/******************** Cnct_CntntDfn_SubTyp_Cdg_Dsply ********************************************************************************/
		if(contractcontentdefinitionsubtypecoding.hasDisplay()) {
			c.setCnctCntntDfnSubTypCdgDsply(String.valueOf(contractcontentdefinitionsubtypecoding.getDisplay()));
		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(contractcontentdefinitionsubtypecoding.hasVersion()) {
			c.setCnctCntntDfnSubTypCdgVrsn(String.valueOf(contractcontentdefinitionsubtypecoding.getVersion()));
		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Cd ********************************************************************************/
		if(contractcontentdefinitionsubtypecoding.hasCode()) {
			c.setCnctCntntDfnSubTypCdgCd(String.valueOf(contractcontentdefinitionsubtypecoding.getCode()));
		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_Sys ********************************************************************************/
		if(contractcontentdefinitionsubtypecoding.hasSystem()) {
			c.setCnctCntntDfnSubTypCdgSys(String.valueOf(contractcontentdefinitionsubtypecoding.getSystem()));
		}
		/******************** Cnct_CntntDfn_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(contractcontentdefinitionsubtypecoding.hasUserSelected()) {
			c.setCnctCntntDfnSubTypCdgUsrSltd(String.valueOf(contractcontentdefinitionsubtypecoding.getUserSelected()));
		}
		/******************** Cnct_CntntDfn_SubTyp_Txt ********************************************************************************/
		if(contractcontentdefinitionsubtype.hasText()) {
			c.setCnctCntntDfnSubTypTxt(String.valueOf(contractcontentdefinitionsubtype.getText()));
		}
		/******************** Cnct_CntntDfn_Pblshr ********************************************************************************/
		if(contractcontentdefinition.hasPublisher()) {
			c.setCnctCntntDfnPblshr(String.valueOf(contractcontentdefinition.getPublisher()));
		}
		/******************** Cnct_CntntDfn_Copyright ********************************************************************************/
		if(contractcontentdefinition.hasCopyright()) {
			c.setCnctCntntDfnCopyright(String.valueOf(contractcontentdefinition.getCopyright()));
		}
		/******************** contractlegallybindingattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractlegallybindingattachment = contract.getLegallyBindingAttachment();

		/******************** Cnct_LegallyBindingAttchmnt_Sz ********************************************************************************/
		if(contractlegallybindingattachment.hasSize()) {
			c.setCnctLegallyBindingAttchmntSz(String.valueOf(contractlegallybindingattachment.getSize()));
		}
		/******************** Cnct_LegallyBindingAttchmnt_Lnguage ********************************************************************************/
		if(contractlegallybindingattachment.hasLanguage()) {
			c.setCnctLegallyBindingAttchmntLnguage(String.valueOf(contractlegallybindingattachment.getLanguage()));
		}
		/******************** Cnct_LegallyBindingAttchmnt_CntntTyp ********************************************************************************/
		if(contractlegallybindingattachment.hasContentType()) {
			c.setCnctLegallyBindingAttchmntCntntTyp(String.valueOf(contractlegallybindingattachment.getContentType()));
		}
		/******************** Cnct_LegallyBindingAttchmnt_Url ********************************************************************************/
		if(contractlegallybindingattachment.hasUrl()) {
			c.setCnctLegallyBindingAttchmntUrl(String.valueOf(contractlegallybindingattachment.getUrl()));
		}
		/******************** Cnct_LegallyBindingAttchmnt_Ttl ********************************************************************************/
		if(contractlegallybindingattachment.hasTitle()) {
			c.setCnctLegallyBindingAttchmntTtl(String.valueOf(contractlegallybindingattachment.getTitle()));
		}
		/******************** Cnct_LegallyBindingAttchmnt_Hash ********************************************************************************/
		if(contractlegallybindingattachment.hasHash()) {
			c.setCnctLegallyBindingAttchmntHash(String.valueOf(contractlegallybindingattachment.getHash()));
		}

		/******************** Cnct_LegallyBindingAttchmnt_Data ********************************************************************************/
		if(contractlegallybindingattachment.hasData()) {
			c.setCnctLegallyBindingAttchmntData(String.valueOf(contractlegallybindingattachment.getData()));
		}

		/******************** Cnct_LegallyBindingAttchmnt_Creation ********************************************************************************/
		if(contractlegallybindingattachment.hasCreation()) {
			c.setCnctLegallyBindingAttchmntCreation(String.valueOf(contractlegallybindingattachment.getCreation()));
		}
		/******************** Cnct_LegallyBindingRfrnc ********************************************************************************/
		if(contract.hasLegallyBindingReference()) {
			c.setCnctLegallyBindingRfrnc(String.valueOf(contract.getLegallyBindingReference()));
		}
		/******************** Cnct_Athrity ********************************************************************************/
		if(contract.hasAuthority()) {
			c.setCnctAthrity(String.valueOf(contract.getAuthorityFirstRep()));
		}
		/******************** Cnct_RelevantHis ********************************************************************************/
		if(contract.hasRelevantHistory()) {
			c.setCnctRelevantHis(String.valueOf(contract.getRelevantHistoryFirstRep()));
		}
		/******************** Cnct_Athr ********************************************************************************/
		if(contract.hasAuthor()) {
			c.setCnctAthr(String.valueOf(contract.getAuthor()));
		}
		/******************** contractstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractStatus contractstatus = contract.getStatus();
		c.setCnctSts(contractstatus.toCode());

		/******************** Cnct_InstantiatesUri ********************************************************************************/
		if(contract.hasInstantiatesUri()) {
			c.setCnctInstantiatesUri(String.valueOf(contract.getInstantiatesUri()));
		}
		/******************** contractscope ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractscope = contract.getScope();

		/******************** contractscopecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractscopecoding = contractscope.getCodingFirstRep();

		/******************** Cnct_Scope_Cdg_Dsply ********************************************************************************/
		if(contractscopecoding.hasDisplay()) {
			c.setCnctScopeCdgDsply(String.valueOf(contractscopecoding.getDisplay()));
		}
		/******************** Cnct_Scope_Cdg_Vrsn ********************************************************************************/
		if(contractscopecoding.hasVersion()) {
			c.setCnctScopeCdgVrsn(String.valueOf(contractscopecoding.getVersion()));
		}
		/******************** Cnct_Scope_Cdg_Cd ********************************************************************************/
		if(contractscopecoding.hasCode()) {
			c.setCnctScopeCdgCd(String.valueOf(contractscopecoding.getCode()));
		}
		/******************** Cnct_Scope_Cdg_Sys ********************************************************************************/
		if(contractscopecoding.hasSystem()) {
			c.setCnctScopeCdgSys(String.valueOf(contractscopecoding.getSystem()));
		}
		/******************** Cnct_Scope_Cdg_UsrSltd ********************************************************************************/
		if(contractscopecoding.hasUserSelected()) {
			c.setCnctScopeCdgUsrSltd(String.valueOf(contractscopecoding.getUserSelected()));
		}
		/******************** Cnct_Scope_Txt ********************************************************************************/
		if(contractscope.hasText()) {
			c.setCnctScopeTxt(String.valueOf(contractscope.getText()));
		}
		/******************** Cnct_InstantiatesCanonical ********************************************************************************/
		if(contract.hasInstantiatesCanonical()) {
			c.setCnctInstantiatesCanonical(String.valueOf(contract.getInstantiatesCanonical()));
		}
		/******************** Cnct_Ttl ********************************************************************************/
		if(contract.hasTitle()) {
			c.setCnctTtl(String.valueOf(contract.getTitle()));
		}
		/******************** Cnct_Site ********************************************************************************/
		if(contract.hasSite()) {
			c.setCnctSite(String.valueOf(contract.getSiteFirstRep()));
		}
		/******************** Cnct_Sbjct ********************************************************************************/
		if(contract.hasSubject()) {
			c.setCnctSbjct(String.valueOf(contract.getSubjectFirstRep()));
		}
		/******************** contractidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contractidentifier = contract.getIdentifierFirstRep();

		/******************** Cnct_Id_Vl ********************************************************************************/
		if(contractidentifier.hasValue()) {
			c.setCnctIdVl(String.valueOf(contractidentifier.getValue()));
		}
		/******************** contractidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractidentifiertype = contractidentifier.getType();

		/******************** contractidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractidentifiertypecoding = contractidentifiertype.getCodingFirstRep();

		/******************** Cnct_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(contractidentifiertypecoding.hasDisplay()) {
			c.setCnctIdTypCdgDsply(String.valueOf(contractidentifiertypecoding.getDisplay()));
		}
		/******************** Cnct_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(contractidentifiertypecoding.hasVersion()) {
			c.setCnctIdTypCdgVrsn(String.valueOf(contractidentifiertypecoding.getVersion()));
		}
		/******************** Cnct_Id_Typ_Cdg_Cd ********************************************************************************/
		if(contractidentifiertypecoding.hasCode()) {
			c.setCnctIdTypCdgCd(String.valueOf(contractidentifiertypecoding.getCode()));
		}
		/******************** Cnct_Id_Typ_Cdg_Sys ********************************************************************************/
		if(contractidentifiertypecoding.hasSystem()) {
			c.setCnctIdTypCdgSys(String.valueOf(contractidentifiertypecoding.getSystem()));
		}
		/******************** Cnct_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contractidentifiertypecoding.hasUserSelected()) {
			c.setCnctIdTypCdgUsrSltd(String.valueOf(contractidentifiertypecoding.getUserSelected()));
		}
		/******************** Cnct_Id_Typ_Txt ********************************************************************************/
		if(contractidentifiertype.hasText()) {
			c.setCnctIdTypTxt(String.valueOf(contractidentifiertype.getText()));
		}
		/******************** Cnct_Id_Sys ********************************************************************************/
		if(contractidentifier.hasSystem()) {
			c.setCnctIdSys(String.valueOf(contractidentifier.getSystem()));
		}
		/******************** Cnct_Id_Assigner ********************************************************************************/
		if(contractidentifier.hasAssigner()) {
			c.setCnctIdAssigner(String.valueOf(contractidentifier.getAssigner()));
		}
		/******************** contractidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contractidentifierperiod = contractidentifier.getPeriod();

		/******************** Cnct_Id_Prd_End ********************************************************************************/
		if(contractidentifierperiod.hasEnd()) {
			c.setCnctIdPrdEnd(String.valueOf(contractidentifierperiod.getEnd()));
		}
		/******************** Cnct_Id_Prd_Strt ********************************************************************************/
		if(contractidentifierperiod.hasStart()) {
			c.setCnctIdPrdStrt(String.valueOf(contractidentifierperiod.getStart()));
		}
		/******************** contractidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse contractidentifieruse = contractidentifier.getUse();
		c.setCnctIdUse(contractidentifieruse.toCode());

		/******************** Cnct_Issued ********************************************************************************/
		if(contract.hasIssued()) {
			c.setCnctIssued(String.valueOf(contract.getIssued()));
		}
		/******************** contractexpirationtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractexpirationtype = contract.getExpirationType();

		/******************** contractexpirationtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractexpirationtypecoding = contractexpirationtype.getCodingFirstRep();

		/******************** Cnct_ExpirationTyp_Cdg_Dsply ********************************************************************************/
		if(contractexpirationtypecoding.hasDisplay()) {
			c.setCnctExpirationTypCdgDsply(String.valueOf(contractexpirationtypecoding.getDisplay()));
		}
		/******************** Cnct_ExpirationTyp_Cdg_Vrsn ********************************************************************************/
		if(contractexpirationtypecoding.hasVersion()) {
			c.setCnctExpirationTypCdgVrsn(String.valueOf(contractexpirationtypecoding.getVersion()));
		}
		/******************** Cnct_ExpirationTyp_Cdg_Cd ********************************************************************************/
		if(contractexpirationtypecoding.hasCode()) {
			c.setCnctExpirationTypCdgCd(String.valueOf(contractexpirationtypecoding.getCode()));
		}
		/******************** Cnct_ExpirationTyp_Cdg_Sys ********************************************************************************/
		if(contractexpirationtypecoding.hasSystem()) {
			c.setCnctExpirationTypCdgSys(String.valueOf(contractexpirationtypecoding.getSystem()));
		}
		/******************** Cnct_ExpirationTyp_Cdg_UsrSltd ********************************************************************************/
		if(contractexpirationtypecoding.hasUserSelected()) {
			c.setCnctExpirationTypCdgUsrSltd(String.valueOf(contractexpirationtypecoding.getUserSelected()));
		}
		/******************** Cnct_ExpirationTyp_Txt ********************************************************************************/
		if(contractexpirationtype.hasText()) {
			c.setCnctExpirationTypTxt(String.valueOf(contractexpirationtype.getText()));
		}
		/******************** contractlegalstate ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractlegalstate = contract.getLegalState();

		/******************** contractlegalstatecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractlegalstatecoding = contractlegalstate.getCodingFirstRep();

		/******************** Cnct_LegalState_Cdg_Dsply ********************************************************************************/
		if(contractlegalstatecoding.hasDisplay()) {
			c.setCnctLegalStateCdgDsply(String.valueOf(contractlegalstatecoding.getDisplay()));
		}
		/******************** Cnct_LegalState_Cdg_Vrsn ********************************************************************************/
		if(contractlegalstatecoding.hasVersion()) {
			c.setCnctLegalStateCdgVrsn(String.valueOf(contractlegalstatecoding.getVersion()));
		}
		/******************** Cnct_LegalState_Cdg_Cd ********************************************************************************/
		if(contractlegalstatecoding.hasCode()) {
			c.setCnctLegalStateCdgCd(String.valueOf(contractlegalstatecoding.getCode()));
		}
		/******************** Cnct_LegalState_Cdg_Sys ********************************************************************************/
		if(contractlegalstatecoding.hasSystem()) {
			c.setCnctLegalStateCdgSys(String.valueOf(contractlegalstatecoding.getSystem()));
		}
		/******************** Cnct_LegalState_Cdg_UsrSltd ********************************************************************************/
		if(contractlegalstatecoding.hasUserSelected()) {
			c.setCnctLegalStateCdgUsrSltd(String.valueOf(contractlegalstatecoding.getUserSelected()));
		}
		/******************** Cnct_LegalState_Txt ********************************************************************************/
		if(contractlegalstate.hasText()) {
			c.setCnctLegalStateTxt(String.valueOf(contractlegalstate.getText()));
		}
		/******************** contractapplies ********************************************************************************/
		org.hl7.fhir.r4.model.Period contractapplies = contract.getApplies();

		/******************** Cnct_Applies_End ********************************************************************************/
		if(contractapplies.hasEnd()) {
			c.setCnctAppliesEnd(String.valueOf(contractapplies.getEnd()));
		}
		/******************** Cnct_Applies_Strt ********************************************************************************/
		if(contractapplies.hasStart()) {
			c.setCnctAppliesStrt(String.valueOf(contractapplies.getStart()));
		}
		/******************** Cnct_TopicRfrnc ********************************************************************************/
		if(contract.hasTopicReference()) {
			c.setCnctTopicRfrnc(String.valueOf(contract.getTopicReference()));
		}
		/******************** Cnct_Subtitle ********************************************************************************/
		if(contract.hasSubtitle()) {
			c.setCnctSubtitle(String.valueOf(contract.getSubtitle()));
		}
		/******************** Cnct_Domain ********************************************************************************/
		if(contract.hasDomain()) {
			c.setCnctDomain(String.valueOf(contract.getDomainFirstRep()));
		}
		/******************** contractsigner ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.SignatoryComponent contractsigner = contract.getSignerFirstRep();

		/******************** contractsignertype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractsignertype = contractsigner.getType();

		/******************** Cnct_Signer_Typ_Dsply ********************************************************************************/
		if(contractsignertype.hasDisplay()) {
			c.setCnctSignerTypDsply(String.valueOf(contractsignertype.getDisplay()));
		}
		/******************** Cnct_Signer_Typ_Vrsn ********************************************************************************/
		if(contractsignertype.hasVersion()) {
			c.setCnctSignerTypVrsn(String.valueOf(contractsignertype.getVersion()));
		}
		/******************** Cnct_Signer_Typ_Cd ********************************************************************************/
		if(contractsignertype.hasCode()) {
			c.setCnctSignerTypCd(String.valueOf(contractsignertype.getCode()));
		}
		/******************** Cnct_Signer_Typ_Sys ********************************************************************************/
		if(contractsignertype.hasSystem()) {
			c.setCnctSignerTypSys(String.valueOf(contractsignertype.getSystem()));
		}
		/******************** Cnct_Signer_Typ_UsrSltd ********************************************************************************/
		if(contractsignertype.hasUserSelected()) {
			c.setCnctSignerTypUsrSltd(String.valueOf(contractsignertype.getUserSelected()));
		}
		/******************** Cnct_Signer_Party ********************************************************************************/
		if(contractsigner.hasParty()) {
			c.setCnctSignerParty(String.valueOf(contractsigner.getParty()));
		}
		/******************** contractsignersignature ********************************************************************************/
		org.hl7.fhir.r4.model.Signature contractsignersignature = contractsigner.getSignatureFirstRep();

		/******************** contractsignersignaturetype ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractsignersignaturetype = contractsignersignature.getTypeFirstRep();

		/******************** Cnct_Signer_Signature_Typ_Dsply ********************************************************************************/
		if(contractsignersignaturetype.hasDisplay()) {
			c.setCnctSignerSignatureTypDsply(String.valueOf(contractsignersignaturetype.getDisplay()));
		}
		/******************** Cnct_Signer_Signature_Typ_Vrsn ********************************************************************************/
		if(contractsignersignaturetype.hasVersion()) {
			c.setCnctSignerSignatureTypVrsn(String.valueOf(contractsignersignaturetype.getVersion()));
		}
		/******************** Cnct_Signer_Signature_Typ_Cd ********************************************************************************/
		if(contractsignersignaturetype.hasCode()) {
			c.setCnctSignerSignatureTypCd(String.valueOf(contractsignersignaturetype.getCode()));
		}
		/******************** Cnct_Signer_Signature_Typ_Sys ********************************************************************************/
		if(contractsignersignaturetype.hasSystem()) {
			c.setCnctSignerSignatureTypSys(String.valueOf(contractsignersignaturetype.getSystem()));
		}
		/******************** Cnct_Signer_Signature_Typ_UsrSltd ********************************************************************************/
		if(contractsignersignaturetype.hasUserSelected()) {
			c.setCnctSignerSignatureTypUsrSltd(String.valueOf(contractsignersignaturetype.getUserSelected()));
		}
		/******************** Cnct_Signer_Signature_OnBehalfOf ********************************************************************************/
		if(contractsignersignature.hasOnBehalfOf()) {
			c.setCnctSignerSignatureOnBehalfOf(String.valueOf(contractsignersignature.getOnBehalfOf()));
		}
		/******************** Cnct_Signer_Signature_Who ********************************************************************************/
		if(contractsignersignature.hasWho()) {
			c.setCnctSignerSignatureWho(String.valueOf(contractsignersignature.getWho()));
		}
		/******************** Cnct_Signer_Signature_TarFrmat ********************************************************************************/
		if(contractsignersignature.hasTargetFormat()) {
			c.setCnctSignerSignatureTarFrmat(String.valueOf(contractsignersignature.getTargetFormat()));
		}
		/******************** Cnct_Signer_Signature_SigFrmat ********************************************************************************/
		if(contractsignersignature.hasSigFormat()) {
			c.setCnctSignerSignatureSigFrmat(String.valueOf(contractsignersignature.getSigFormat()));
		}
		/******************** Cnct_Signer_Signature_When ********************************************************************************/
		if(contractsignersignature.hasWhen()) {
			c.setCnctSignerSignatureWhen(String.valueOf(contractsignersignature.getWhen()));
		}
		/******************** Cnct_Signer_Signature_Data ********************************************************************************/
		if(contractsignersignature.hasData()) {
			c.setCnctSignerSignatureData(String.valueOf(contractsignersignature.getData()));
		}

		/******************** contractsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contractsubtype = contract.getSubTypeFirstRep();

		/******************** contractsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contractsubtypecoding = contractsubtype.getCodingFirstRep();

		/******************** Cnct_SubTyp_Cdg_Dsply ********************************************************************************/
		if(contractsubtypecoding.hasDisplay()) {
			c.setCnctSubTypCdgDsply(String.valueOf(contractsubtypecoding.getDisplay()));
		}
		/******************** Cnct_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(contractsubtypecoding.hasVersion()) {
			c.setCnctSubTypCdgVrsn(String.valueOf(contractsubtypecoding.getVersion()));
		}
		/******************** Cnct_SubTyp_Cdg_Cd ********************************************************************************/
		if(contractsubtypecoding.hasCode()) {
			c.setCnctSubTypCdgCd(String.valueOf(contractsubtypecoding.getCode()));
		}
		/******************** Cnct_SubTyp_Cdg_Sys ********************************************************************************/
		if(contractsubtypecoding.hasSystem()) {
			c.setCnctSubTypCdgSys(String.valueOf(contractsubtypecoding.getSystem()));
		}
		/******************** Cnct_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(contractsubtypecoding.hasUserSelected()) {
			c.setCnctSubTypCdgUsrSltd(String.valueOf(contractsubtypecoding.getUserSelected()));
		}
		/******************** Cnct_SubTyp_Txt ********************************************************************************/
		if(contractsubtype.hasText()) {
			c.setCnctSubTypTxt(String.valueOf(contractsubtype.getText()));
		}
		/******************** contractterm ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.TermComponent contractterm = contract.getTermFirstRep();

		/******************** contracttermtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermtype = contractterm.getType();

		/******************** contracttermtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermtypecoding = contracttermtype.getCodingFirstRep();

		/******************** Cnct_Trm_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermtypecoding.hasDisplay()) {
			c.setCnctTrmTypCdgDsply(String.valueOf(contracttermtypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermtypecoding.hasVersion()) {
			c.setCnctTrmTypCdgVrsn(String.valueOf(contracttermtypecoding.getVersion()));
		}
		/******************** Cnct_Trm_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermtypecoding.hasCode()) {
			c.setCnctTrmTypCdgCd(String.valueOf(contracttermtypecoding.getCode()));
		}
		/******************** Cnct_Trm_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermtypecoding.hasSystem()) {
			c.setCnctTrmTypCdgSys(String.valueOf(contracttermtypecoding.getSystem()));
		}
		/******************** Cnct_Trm_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermtypecoding.hasUserSelected()) {
			c.setCnctTrmTypCdgUsrSltd(String.valueOf(contracttermtypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Typ_Txt ********************************************************************************/
		if(contracttermtype.hasText()) {
			c.setCnctTrmTypTxt(String.valueOf(contracttermtype.getText()));
		}
		/******************** contracttermaction ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ActionComponent contracttermaction = contractterm.getActionFirstRep();

		/******************** Cnct_Trm_Actn_Cntxt ********************************************************************************/
		if(contracttermaction.hasContext()) {
			c.setCnctTrmActnCntxt(String.valueOf(contracttermaction.getContext()));
		}
		/******************** contracttermactiontype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactiontype = contracttermaction.getType();

		/******************** contracttermactiontypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactiontypecoding = contracttermactiontype.getCodingFirstRep();

		/******************** Cnct_Trm_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermactiontypecoding.hasDisplay()) {
			c.setCnctTrmActnTypCdgDsply(String.valueOf(contracttermactiontypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermactiontypecoding.hasVersion()) {
			c.setCnctTrmActnTypCdgVrsn(String.valueOf(contracttermactiontypecoding.getVersion()));
		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermactiontypecoding.hasCode()) {
			c.setCnctTrmActnTypCdgCd(String.valueOf(contracttermactiontypecoding.getCode()));
		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermactiontypecoding.hasSystem()) {
			c.setCnctTrmActnTypCdgSys(String.valueOf(contracttermactiontypecoding.getSystem()));
		}
		/******************** Cnct_Trm_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactiontypecoding.hasUserSelected()) {
			c.setCnctTrmActnTypCdgUsrSltd(String.valueOf(contracttermactiontypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Actn_Typ_Txt ********************************************************************************/
		if(contracttermactiontype.hasText()) {
			c.setCnctTrmActnTypTxt(String.valueOf(contracttermactiontype.getText()));
		}
		/******************** contracttermactionoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermactionoccurrenceperiod = contracttermaction.getOccurrencePeriod();

		/******************** Cnct_Trm_Actn_OccrncePrd_End ********************************************************************************/
		if(contracttermactionoccurrenceperiod.hasEnd()) {
			c.setCnctTrmActnOccrncePrdEnd(String.valueOf(contracttermactionoccurrenceperiod.getEnd()));
		}
		/******************** Cnct_Trm_Actn_OccrncePrd_Strt ********************************************************************************/
		if(contracttermactionoccurrenceperiod.hasStart()) {
			c.setCnctTrmActnOccrncePrdStrt(String.valueOf(contracttermactionoccurrenceperiod.getStart()));
		}
		/******************** Cnct_Trm_Actn_OccrnceDtTimeTyp ********************************************************************************/
		if(contracttermaction.hasOccurrenceDateTimeType()) {
			c.setCnctTrmActnOccrnceDtTimeTyp(String.valueOf(contracttermaction.getOccurrenceDateTimeType()));
		}
		/******************** contracttermactionperformertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionperformertype = contracttermaction.getPerformerTypeFirstRep();

		/******************** contracttermactionperformertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionperformertypecoding = contracttermactionperformertype.getCodingFirstRep();

		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Dsply ********************************************************************************/
		if(contracttermactionperformertypecoding.hasDisplay()) {
			c.setCnctTrmActnPrfrmrTypCdgDsply(String.valueOf(contracttermactionperformertypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionperformertypecoding.hasVersion()) {
			c.setCnctTrmActnPrfrmrTypCdgVrsn(String.valueOf(contracttermactionperformertypecoding.getVersion()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Cd ********************************************************************************/
		if(contracttermactionperformertypecoding.hasCode()) {
			c.setCnctTrmActnPrfrmrTypCdgCd(String.valueOf(contracttermactionperformertypecoding.getCode()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_Sys ********************************************************************************/
		if(contracttermactionperformertypecoding.hasSystem()) {
			c.setCnctTrmActnPrfrmrTypCdgSys(String.valueOf(contracttermactionperformertypecoding.getSystem()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionperformertypecoding.hasUserSelected()) {
			c.setCnctTrmActnPrfrmrTypCdgUsrSltd(String.valueOf(contracttermactionperformertypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrTyp_Txt ********************************************************************************/
		if(contracttermactionperformertype.hasText()) {
			c.setCnctTrmActnPrfrmrTypTxt(String.valueOf(contracttermactionperformertype.getText()));
		}
		/******************** contracttermactionoccurrencetiming ********************************************************************************/
		org.hl7.fhir.r4.model.Timing contracttermactionoccurrencetiming = contracttermaction.getOccurrenceTiming();

		/******************** contracttermactionoccurrencetimingcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionoccurrencetimingcode = contracttermactionoccurrencetiming.getCode();

		/******************** contracttermactionoccurrencetimingcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionoccurrencetimingcodecoding = contracttermactionoccurrencetimingcode.getCodingFirstRep();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecoding.hasDisplay()) {
			c.setCnctTrmActnOccrnceTmgCdCdgDsply(String.valueOf(contracttermactionoccurrencetimingcodecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecoding.hasVersion()) {
			c.setCnctTrmActnOccrnceTmgCdCdgVrsn(String.valueOf(contracttermactionoccurrencetimingcodecoding.getVersion()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecoding.hasCode()) {
			c.setCnctTrmActnOccrnceTmgCdCdgCd(String.valueOf(contracttermactionoccurrencetimingcodecoding.getCode()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecoding.hasSystem()) {
			c.setCnctTrmActnOccrnceTmgCdCdgSys(String.valueOf(contracttermactionoccurrencetimingcodecoding.getSystem()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionoccurrencetimingcodecoding.hasUserSelected()) {
			c.setCnctTrmActnOccrnceTmgCdCdgUsrSltd(String.valueOf(contracttermactionoccurrencetimingcodecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(contracttermactionoccurrencetimingcode.hasText()) {
			c.setCnctTrmActnOccrnceTmgCdTxt(String.valueOf(contracttermactionoccurrencetimingcode.getText()));
		}
		/******************** contracttermactionoccurrencetimingrepeat ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.TimingRepeatComponent contracttermactionoccurrencetimingrepeat = contracttermactionoccurrencetiming.getRepeat();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasOffset()) {
			c.setCnctTrmActnOccrnceTmgRptOff(String.valueOf(contracttermactionoccurrencetimingrepeat.getOffset()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasCount()) {
			c.setCnctTrmActnOccrnceTmgRptCnt(String.valueOf(contracttermactionoccurrencetimingrepeat.getCount()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasFrequency()) {
			c.setCnctTrmActnOccrnceTmgRptFrqncy(String.valueOf(contracttermactionoccurrencetimingrepeat.getFrequency()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasPeriod()) {
			c.setCnctTrmActnOccrnceTmgRptPrd(String.valueOf(contracttermactionoccurrencetimingrepeat.getPeriod()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasDuration()) {
			c.setCnctTrmActnOccrnceTmgRptDuration(String.valueOf(contracttermactionoccurrencetimingrepeat.getDuration()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasCountMax()) {
			c.setCnctTrmActnOccrnceTmgRptCntMx(String.valueOf(contracttermactionoccurrencetimingrepeat.getCountMax()));
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsduration ********************************************************************************/
		org.hl7.fhir.r4.model.Duration contracttermactionoccurrencetimingrepeatboundsduration = contracttermactionoccurrencetimingrepeat.getBoundsDuration();

		/******************** contracttermactionoccurrencetimingrepeatboundsperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermactionoccurrencetimingrepeatboundsperiod = contracttermactionoccurrencetimingrepeat.getBoundsPeriod();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsperiod.hasEnd()) {
			c.setCnctTrmActnOccrnceTmgRptBndsPrdEnd(String.valueOf(contracttermactionoccurrencetimingrepeatboundsperiod.getEnd()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsperiod.hasStart()) {
			c.setCnctTrmActnOccrnceTmgRptBndsPrdStrt(String.valueOf(contracttermactionoccurrencetimingrepeatboundsperiod.getStart()));
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range contracttermactionoccurrencetimingrepeatboundsrange = contracttermactionoccurrencetimingrepeat.getBoundsRange();

		/******************** contracttermactionoccurrencetimingrepeatboundsrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermactionoccurrencetimingrepeatboundsrangelow = contracttermactionoccurrencetimingrepeatboundsrange.getLow();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangelow.hasValue()) {
			c.setCnctTrmActnOccrnceTmgRptBndsRngLwVl(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangelow.getValue()));
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermactionoccurrencetimingrepeatboundsrangelowcomparator = contracttermactionoccurrencetimingrepeatboundsrangelow.getComparator();
		c.setCnctTrmActnOccrnceTmgRptBndsRngLwCmprtr(contracttermactionoccurrencetimingrepeatboundsrangelowcomparator.toCode());

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangelow.hasCode()) {
			c.setCnctTrmActnOccrnceTmgRptBndsRngLwCd(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangelow.getCode()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangelow.hasSystem()) {
			c.setCnctTrmActnOccrnceTmgRptBndsRngLwSys(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangelow.getSystem()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangelow.hasUnit()) {
			c.setCnctTrmActnOccrnceTmgRptBndsRngLwUnt(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangelow.getUnit()));
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermactionoccurrencetimingrepeatboundsrangehigh = contracttermactionoccurrencetimingrepeatboundsrange.getHigh();

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangehigh.hasValue()) {
			c.setCnctTrmActnOccrnceTmgRptBndsRngHiVl(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangehigh.getValue()));
		}
		/******************** contracttermactionoccurrencetimingrepeatboundsrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermactionoccurrencetimingrepeatboundsrangehighcomparator = contracttermactionoccurrencetimingrepeatboundsrangehigh.getComparator();
		c.setCnctTrmActnOccrnceTmgRptBndsRngHiCmprtr(contracttermactionoccurrencetimingrepeatboundsrangehighcomparator.toCode());

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangehigh.hasCode()) {
			c.setCnctTrmActnOccrnceTmgRptBndsRngHiCd(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangehigh.getCode()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangehigh.hasSystem()) {
			c.setCnctTrmActnOccrnceTmgRptBndsRngHiSys(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangehigh.getSystem()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeatboundsrangehigh.hasUnit()) {
			c.setCnctTrmActnOccrnceTmgRptBndsRngHiUnt(String.valueOf(contracttermactionoccurrencetimingrepeatboundsrangehigh.getUnit()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasPeriodMax()) {
			c.setCnctTrmActnOccrnceTmgRptPrdMx(String.valueOf(contracttermactionoccurrencetimingrepeat.getPeriodMax()));
		}
		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasFrequencyMax()) {
			c.setCnctTrmActnOccrnceTmgRptFrqncyMx(String.valueOf(contracttermactionoccurrencetimingrepeat.getFrequencyMax()));
		}
		/******************** contracttermactionoccurrencetimingrepeatperiodunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime contracttermactionoccurrencetimingrepeatperiodunit = contracttermactionoccurrencetimingrepeat.getPeriodUnit();
		c.setCnctTrmActnOccrnceTmgRptPrdUnt(contracttermactionoccurrencetimingrepeatperiodunit.toCode());

		/******************** Cnct_Trm_Actn_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(contracttermactionoccurrencetimingrepeat.hasDurationMax()) {
			c.setCnctTrmActnOccrnceTmgRptDurationMx(String.valueOf(contracttermactionoccurrencetimingrepeat.getDurationMax()));
		}
		/******************** contracttermactionoccurrencetimingrepeatdurationunit ********************************************************************************/
		org.hl7.fhir.r4.model.Timing.UnitsOfTime contracttermactionoccurrencetimingrepeatdurationunit = contracttermactionoccurrencetimingrepeat.getDurationUnit();
		c.setCnctTrmActnOccrnceTmgRptDurationUnt(contracttermactionoccurrencetimingrepeatdurationunit.toCode());

		/******************** contracttermactionintent ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionintent = contracttermaction.getIntent();

		/******************** contracttermactionintentcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionintentcoding = contracttermactionintent.getCodingFirstRep();

		/******************** Cnct_Trm_Actn_Intent_Cdg_Dsply ********************************************************************************/
		if(contracttermactionintentcoding.hasDisplay()) {
			c.setCnctTrmActnIntentCdgDsply(String.valueOf(contracttermactionintentcoding.getDisplay()));
		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionintentcoding.hasVersion()) {
			c.setCnctTrmActnIntentCdgVrsn(String.valueOf(contracttermactionintentcoding.getVersion()));
		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Cd ********************************************************************************/
		if(contracttermactionintentcoding.hasCode()) {
			c.setCnctTrmActnIntentCdgCd(String.valueOf(contracttermactionintentcoding.getCode()));
		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_Sys ********************************************************************************/
		if(contracttermactionintentcoding.hasSystem()) {
			c.setCnctTrmActnIntentCdgSys(String.valueOf(contracttermactionintentcoding.getSystem()));
		}
		/******************** Cnct_Trm_Actn_Intent_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionintentcoding.hasUserSelected()) {
			c.setCnctTrmActnIntentCdgUsrSltd(String.valueOf(contracttermactionintentcoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Actn_Intent_Txt ********************************************************************************/
		if(contracttermactionintent.hasText()) {
			c.setCnctTrmActnIntentTxt(String.valueOf(contracttermactionintent.getText()));
		}
		/******************** contracttermactionstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionstatus = contracttermaction.getStatus();

		/******************** contracttermactionstatuscoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionstatuscoding = contracttermactionstatus.getCodingFirstRep();

		/******************** Cnct_Trm_Actn_Sts_Cdg_Dsply ********************************************************************************/
		if(contracttermactionstatuscoding.hasDisplay()) {
			c.setCnctTrmActnStsCdgDsply(String.valueOf(contracttermactionstatuscoding.getDisplay()));
		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionstatuscoding.hasVersion()) {
			c.setCnctTrmActnStsCdgVrsn(String.valueOf(contracttermactionstatuscoding.getVersion()));
		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Cd ********************************************************************************/
		if(contracttermactionstatuscoding.hasCode()) {
			c.setCnctTrmActnStsCdgCd(String.valueOf(contracttermactionstatuscoding.getCode()));
		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_Sys ********************************************************************************/
		if(contracttermactionstatuscoding.hasSystem()) {
			c.setCnctTrmActnStsCdgSys(String.valueOf(contracttermactionstatuscoding.getSystem()));
		}
		/******************** Cnct_Trm_Actn_Sts_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionstatuscoding.hasUserSelected()) {
			c.setCnctTrmActnStsCdgUsrSltd(String.valueOf(contracttermactionstatuscoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Actn_Sts_Txt ********************************************************************************/
		if(contracttermactionstatus.hasText()) {
			c.setCnctTrmActnStsTxt(String.valueOf(contracttermactionstatus.getText()));
		}
		/******************** contracttermactionnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation contracttermactionnote = contracttermaction.getNoteFirstRep();

		/******************** Cnct_Trm_Actn_Nt_Time ********************************************************************************/
		if(contracttermactionnote.hasTime()) {
			c.setCnctTrmActnNtTime(String.valueOf(contracttermactionnote.getTime()));
		}
		/******************** Cnct_Trm_Actn_Nt_AthrRfrnc ********************************************************************************/
		if(contracttermactionnote.hasAuthorReference()) {
			c.setCnctTrmActnNtAthrRfrnc(String.valueOf(contracttermactionnote.getAuthorReference()));
		}
		/******************** Cnct_Trm_Actn_Nt_Txt ********************************************************************************/
		if(contracttermactionnote.hasText()) {
			c.setCnctTrmActnNtTxt(String.valueOf(contracttermactionnote.getText()));
		}
		/******************** Cnct_Trm_Actn_Nt_AthrStrgTyp ********************************************************************************/
		if(contracttermactionnote.hasAuthorStringType()) {
			c.setCnctTrmActnNtAthrStrgTyp(String.valueOf(contracttermactionnote.getAuthorStringType()));
		}
		/******************** Cnct_Trm_Actn_RsnRfrnc ********************************************************************************/
		if(contracttermaction.hasReasonReference()) {
			c.setCnctTrmActnRsnRfrnc(String.valueOf(contracttermaction.getReasonReferenceFirstRep()));
		}
		/******************** contracttermactionreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionreasoncode = contracttermaction.getReasonCodeFirstRep();

		/******************** contracttermactionreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionreasoncodecoding = contracttermactionreasoncode.getCodingFirstRep();

		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(contracttermactionreasoncodecoding.hasDisplay()) {
			c.setCnctTrmActnRsnCdCdgDsply(String.valueOf(contracttermactionreasoncodecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionreasoncodecoding.hasVersion()) {
			c.setCnctTrmActnRsnCdCdgVrsn(String.valueOf(contracttermactionreasoncodecoding.getVersion()));
		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Cd ********************************************************************************/
		if(contracttermactionreasoncodecoding.hasCode()) {
			c.setCnctTrmActnRsnCdCdgCd(String.valueOf(contracttermactionreasoncodecoding.getCode()));
		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_Sys ********************************************************************************/
		if(contracttermactionreasoncodecoding.hasSystem()) {
			c.setCnctTrmActnRsnCdCdgSys(String.valueOf(contracttermactionreasoncodecoding.getSystem()));
		}
		/******************** Cnct_Trm_Actn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionreasoncodecoding.hasUserSelected()) {
			c.setCnctTrmActnRsnCdCdgUsrSltd(String.valueOf(contracttermactionreasoncodecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Actn_RsnCd_Txt ********************************************************************************/
		if(contracttermactionreasoncode.hasText()) {
			c.setCnctTrmActnRsnCdTxt(String.valueOf(contracttermactionreasoncode.getText()));
		}
		/******************** Cnct_Trm_Actn_Rqster ********************************************************************************/
		if(contracttermaction.hasRequester()) {
			c.setCnctTrmActnRqster(String.valueOf(contracttermaction.getRequesterFirstRep()));
		}
		/******************** contracttermactionperformerrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionperformerrole = contracttermaction.getPerformerRole();

		/******************** contracttermactionperformerrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionperformerrolecoding = contracttermactionperformerrole.getCodingFirstRep();

		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Dsply ********************************************************************************/
		if(contracttermactionperformerrolecoding.hasDisplay()) {
			c.setCnctTrmActnPrfrmrRoleCdgDsply(String.valueOf(contracttermactionperformerrolecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionperformerrolecoding.hasVersion()) {
			c.setCnctTrmActnPrfrmrRoleCdgVrsn(String.valueOf(contracttermactionperformerrolecoding.getVersion()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Cd ********************************************************************************/
		if(contracttermactionperformerrolecoding.hasCode()) {
			c.setCnctTrmActnPrfrmrRoleCdgCd(String.valueOf(contracttermactionperformerrolecoding.getCode()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_Sys ********************************************************************************/
		if(contracttermactionperformerrolecoding.hasSystem()) {
			c.setCnctTrmActnPrfrmrRoleCdgSys(String.valueOf(contracttermactionperformerrolecoding.getSystem()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionperformerrolecoding.hasUserSelected()) {
			c.setCnctTrmActnPrfrmrRoleCdgUsrSltd(String.valueOf(contracttermactionperformerrolecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Actn_PrfrmrRole_Txt ********************************************************************************/
		if(contracttermactionperformerrole.hasText()) {
			c.setCnctTrmActnPrfrmrRoleTxt(String.valueOf(contracttermactionperformerrole.getText()));
		}
		/******************** Cnct_Trm_Actn_Prfrmr ********************************************************************************/
		if(contracttermaction.hasPerformer()) {
			c.setCnctTrmActnPrfrmr(String.valueOf(contracttermaction.getPerformer()));
		}
		/******************** contracttermactionsubject ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ActionSubjectComponent contracttermactionsubject = contracttermaction.getSubjectFirstRep();

		/******************** Cnct_Trm_Actn_Sbjct_Rfrnc ********************************************************************************/
		if(contracttermactionsubject.hasReference()) {
			c.setCnctTrmActnSbjctRfrnc(String.valueOf(contracttermactionsubject.getReferenceFirstRep()));
		}
		/******************** contracttermactionsubjectrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermactionsubjectrole = contracttermactionsubject.getRole();

		/******************** contracttermactionsubjectrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermactionsubjectrolecoding = contracttermactionsubjectrole.getCodingFirstRep();

		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Dsply ********************************************************************************/
		if(contracttermactionsubjectrolecoding.hasDisplay()) {
			c.setCnctTrmActnSbjctRoleCdgDsply(String.valueOf(contracttermactionsubjectrolecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Vrsn ********************************************************************************/
		if(contracttermactionsubjectrolecoding.hasVersion()) {
			c.setCnctTrmActnSbjctRoleCdgVrsn(String.valueOf(contracttermactionsubjectrolecoding.getVersion()));
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Cd ********************************************************************************/
		if(contracttermactionsubjectrolecoding.hasCode()) {
			c.setCnctTrmActnSbjctRoleCdgCd(String.valueOf(contracttermactionsubjectrolecoding.getCode()));
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_Sys ********************************************************************************/
		if(contracttermactionsubjectrolecoding.hasSystem()) {
			c.setCnctTrmActnSbjctRoleCdgSys(String.valueOf(contracttermactionsubjectrolecoding.getSystem()));
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Cdg_UsrSltd ********************************************************************************/
		if(contracttermactionsubjectrolecoding.hasUserSelected()) {
			c.setCnctTrmActnSbjctRoleCdgUsrSltd(String.valueOf(contracttermactionsubjectrolecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Actn_Sbjct_Role_Txt ********************************************************************************/
		if(contracttermactionsubjectrole.hasText()) {
			c.setCnctTrmActnSbjctRoleTxt(String.valueOf(contracttermactionsubjectrole.getText()));
		}
		/******************** Cnct_Trm_Actn_DoNotPerform ********************************************************************************/
		if(contracttermaction.hasDoNotPerform()) {
			c.setCnctTrmActnDoNotPerform(String.valueOf(contracttermaction.getDoNotPerform()));
		}
		/******************** contracttermtopiccodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermtopiccodeableconcept = contractterm.getTopicCodeableConcept();

		/******************** contracttermtopiccodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermtopiccodeableconceptcoding = contracttermtopiccodeableconcept.getCodingFirstRep();

		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(contracttermtopiccodeableconceptcoding.hasDisplay()) {
			c.setCnctTrmTopicCdbleCncptCdgDsply(String.valueOf(contracttermtopiccodeableconceptcoding.getDisplay()));
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(contracttermtopiccodeableconceptcoding.hasVersion()) {
			c.setCnctTrmTopicCdbleCncptCdgVrsn(String.valueOf(contracttermtopiccodeableconceptcoding.getVersion()));
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(contracttermtopiccodeableconceptcoding.hasCode()) {
			c.setCnctTrmTopicCdbleCncptCdgCd(String.valueOf(contracttermtopiccodeableconceptcoding.getCode()));
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(contracttermtopiccodeableconceptcoding.hasSystem()) {
			c.setCnctTrmTopicCdbleCncptCdgSys(String.valueOf(contracttermtopiccodeableconceptcoding.getSystem()));
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(contracttermtopiccodeableconceptcoding.hasUserSelected()) {
			c.setCnctTrmTopicCdbleCncptCdgUsrSltd(String.valueOf(contracttermtopiccodeableconceptcoding.getUserSelected()));
		}
		/******************** Cnct_Trm_TopicCdbleCncpt_Txt ********************************************************************************/
		if(contracttermtopiccodeableconcept.hasText()) {
			c.setCnctTrmTopicCdbleCncptTxt(String.valueOf(contracttermtopiccodeableconcept.getText()));
		}
		/******************** Cnct_Trm_Txt ********************************************************************************/
		if(contractterm.hasText()) {
			c.setCnctTrmTxt(String.valueOf(contractterm.getText()));
		}
		/******************** contracttermidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contracttermidentifier = contractterm.getIdentifier();

		/******************** Cnct_Trm_Id_Vl ********************************************************************************/
		if(contracttermidentifier.hasValue()) {
			c.setCnctTrmIdVl(String.valueOf(contracttermidentifier.getValue()));
		}
		/******************** contracttermidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermidentifiertype = contracttermidentifier.getType();

		/******************** contracttermidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermidentifiertypecoding = contracttermidentifiertype.getCodingFirstRep();

		/******************** Cnct_Trm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermidentifiertypecoding.hasDisplay()) {
			c.setCnctTrmIdTypCdgDsply(String.valueOf(contracttermidentifiertypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermidentifiertypecoding.hasVersion()) {
			c.setCnctTrmIdTypCdgVrsn(String.valueOf(contracttermidentifiertypecoding.getVersion()));
		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermidentifiertypecoding.hasCode()) {
			c.setCnctTrmIdTypCdgCd(String.valueOf(contracttermidentifiertypecoding.getCode()));
		}
		/******************** Cnct_Trm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermidentifiertypecoding.hasSystem()) {
			c.setCnctTrmIdTypCdgSys(String.valueOf(contracttermidentifiertypecoding.getSystem()));
		}
		/******************** Cnct_Trm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermidentifiertypecoding.hasUserSelected()) {
			c.setCnctTrmIdTypCdgUsrSltd(String.valueOf(contracttermidentifiertypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Id_Typ_Txt ********************************************************************************/
		if(contracttermidentifiertype.hasText()) {
			c.setCnctTrmIdTypTxt(String.valueOf(contracttermidentifiertype.getText()));
		}
		/******************** Cnct_Trm_Id_Sys ********************************************************************************/
		if(contracttermidentifier.hasSystem()) {
			c.setCnctTrmIdSys(String.valueOf(contracttermidentifier.getSystem()));
		}
		/******************** Cnct_Trm_Id_Assigner ********************************************************************************/
		if(contracttermidentifier.hasAssigner()) {
			c.setCnctTrmIdAssigner(String.valueOf(contracttermidentifier.getAssigner()));
		}
		/******************** contracttermidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermidentifierperiod = contracttermidentifier.getPeriod();

		/******************** Cnct_Trm_Id_Prd_End ********************************************************************************/
		if(contracttermidentifierperiod.hasEnd()) {
			c.setCnctTrmIdPrdEnd(String.valueOf(contracttermidentifierperiod.getEnd()));
		}
		/******************** Cnct_Trm_Id_Prd_Strt ********************************************************************************/
		if(contracttermidentifierperiod.hasStart()) {
			c.setCnctTrmIdPrdStrt(String.valueOf(contracttermidentifierperiod.getStart()));
		}
		/******************** contracttermidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse contracttermidentifieruse = contracttermidentifier.getUse();
		c.setCnctTrmIdUse(contracttermidentifieruse.toCode());

		/******************** contracttermoffer ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractOfferComponent contracttermoffer = contractterm.getOffer();

		/******************** contracttermoffertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermoffertype = contracttermoffer.getType();

		/******************** contracttermoffertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermoffertypecoding = contracttermoffertype.getCodingFirstRep();

		/******************** Cnct_Trm_Offr_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermoffertypecoding.hasDisplay()) {
			c.setCnctTrmOffrTypCdgDsply(String.valueOf(contracttermoffertypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermoffertypecoding.hasVersion()) {
			c.setCnctTrmOffrTypCdgVrsn(String.valueOf(contracttermoffertypecoding.getVersion()));
		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermoffertypecoding.hasCode()) {
			c.setCnctTrmOffrTypCdgCd(String.valueOf(contracttermoffertypecoding.getCode()));
		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermoffertypecoding.hasSystem()) {
			c.setCnctTrmOffrTypCdgSys(String.valueOf(contracttermoffertypecoding.getSystem()));
		}
		/******************** Cnct_Trm_Offr_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermoffertypecoding.hasUserSelected()) {
			c.setCnctTrmOffrTypCdgUsrSltd(String.valueOf(contracttermoffertypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Offr_Typ_Txt ********************************************************************************/
		if(contracttermoffertype.hasText()) {
			c.setCnctTrmOffrTypTxt(String.valueOf(contracttermoffertype.getText()));
		}
		/******************** Cnct_Trm_Offr_Txt ********************************************************************************/
		if(contracttermoffer.hasText()) {
			c.setCnctTrmOffrTxt(String.valueOf(contracttermoffer.getText()));
		}
		/******************** contracttermofferdecisionmode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferdecisionmode = contracttermoffer.getDecisionModeFirstRep();

		/******************** contracttermofferdecisionmodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferdecisionmodecoding = contracttermofferdecisionmode.getCodingFirstRep();

		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Dsply ********************************************************************************/
		if(contracttermofferdecisionmodecoding.hasDisplay()) {
			c.setCnctTrmOffrDecisionModeCdgDsply(String.valueOf(contracttermofferdecisionmodecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Vrsn ********************************************************************************/
		if(contracttermofferdecisionmodecoding.hasVersion()) {
			c.setCnctTrmOffrDecisionModeCdgVrsn(String.valueOf(contracttermofferdecisionmodecoding.getVersion()));
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Cd ********************************************************************************/
		if(contracttermofferdecisionmodecoding.hasCode()) {
			c.setCnctTrmOffrDecisionModeCdgCd(String.valueOf(contracttermofferdecisionmodecoding.getCode()));
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_Sys ********************************************************************************/
		if(contracttermofferdecisionmodecoding.hasSystem()) {
			c.setCnctTrmOffrDecisionModeCdgSys(String.valueOf(contracttermofferdecisionmodecoding.getSystem()));
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Cdg_UsrSltd ********************************************************************************/
		if(contracttermofferdecisionmodecoding.hasUserSelected()) {
			c.setCnctTrmOffrDecisionModeCdgUsrSltd(String.valueOf(contracttermofferdecisionmodecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Offr_DecisionMode_Txt ********************************************************************************/
		if(contracttermofferdecisionmode.hasText()) {
			c.setCnctTrmOffrDecisionModeTxt(String.valueOf(contracttermofferdecisionmode.getText()));
		}
		/******************** contracttermofferdecision ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferdecision = contracttermoffer.getDecision();

		/******************** contracttermofferdecisioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferdecisioncoding = contracttermofferdecision.getCodingFirstRep();

		/******************** Cnct_Trm_Offr_Decision_Cdg_Dsply ********************************************************************************/
		if(contracttermofferdecisioncoding.hasDisplay()) {
			c.setCnctTrmOffrDecisionCdgDsply(String.valueOf(contracttermofferdecisioncoding.getDisplay()));
		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Vrsn ********************************************************************************/
		if(contracttermofferdecisioncoding.hasVersion()) {
			c.setCnctTrmOffrDecisionCdgVrsn(String.valueOf(contracttermofferdecisioncoding.getVersion()));
		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Cd ********************************************************************************/
		if(contracttermofferdecisioncoding.hasCode()) {
			c.setCnctTrmOffrDecisionCdgCd(String.valueOf(contracttermofferdecisioncoding.getCode()));
		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_Sys ********************************************************************************/
		if(contracttermofferdecisioncoding.hasSystem()) {
			c.setCnctTrmOffrDecisionCdgSys(String.valueOf(contracttermofferdecisioncoding.getSystem()));
		}
		/******************** Cnct_Trm_Offr_Decision_Cdg_UsrSltd ********************************************************************************/
		if(contracttermofferdecisioncoding.hasUserSelected()) {
			c.setCnctTrmOffrDecisionCdgUsrSltd(String.valueOf(contracttermofferdecisioncoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Offr_Decision_Txt ********************************************************************************/
		if(contracttermofferdecision.hasText()) {
			c.setCnctTrmOffrDecisionTxt(String.valueOf(contracttermofferdecision.getText()));
		}
		/******************** contracttermofferparty ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractPartyComponent contracttermofferparty = contracttermoffer.getPartyFirstRep();

		/******************** Cnct_Trm_Offr_Party_Rfrnc ********************************************************************************/
		if(contracttermofferparty.hasReference()) {
			c.setCnctTrmOffrPartyRfrnc(String.valueOf(contracttermofferparty.getReferenceFirstRep()));
		}
		/******************** contracttermofferpartyrole ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferpartyrole = contracttermofferparty.getRole();

		/******************** contracttermofferpartyrolecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferpartyrolecoding = contracttermofferpartyrole.getCodingFirstRep();

		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Dsply ********************************************************************************/
		if(contracttermofferpartyrolecoding.hasDisplay()) {
			c.setCnctTrmOffrPartyRoleCdgDsply(String.valueOf(contracttermofferpartyrolecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Vrsn ********************************************************************************/
		if(contracttermofferpartyrolecoding.hasVersion()) {
			c.setCnctTrmOffrPartyRoleCdgVrsn(String.valueOf(contracttermofferpartyrolecoding.getVersion()));
		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Cd ********************************************************************************/
		if(contracttermofferpartyrolecoding.hasCode()) {
			c.setCnctTrmOffrPartyRoleCdgCd(String.valueOf(contracttermofferpartyrolecoding.getCode()));
		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_Sys ********************************************************************************/
		if(contracttermofferpartyrolecoding.hasSystem()) {
			c.setCnctTrmOffrPartyRoleCdgSys(String.valueOf(contracttermofferpartyrolecoding.getSystem()));
		}
		/******************** Cnct_Trm_Offr_Party_Role_Cdg_UsrSltd ********************************************************************************/
		if(contracttermofferpartyrolecoding.hasUserSelected()) {
			c.setCnctTrmOffrPartyRoleCdgUsrSltd(String.valueOf(contracttermofferpartyrolecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Offr_Party_Role_Txt ********************************************************************************/
		if(contracttermofferpartyrole.hasText()) {
			c.setCnctTrmOffrPartyRoleTxt(String.valueOf(contracttermofferpartyrole.getText()));
		}
		/******************** contracttermofferanswer ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.AnswerComponent contracttermofferanswer = contracttermoffer.getAnswerFirstRep();

		/******************** Cnct_Trm_Offr_Ans_VlBooleanTyp ********************************************************************************/
		if(contracttermofferanswer.hasValueBooleanType()) {
			c.setCnctTrmOffrAnsVlBooleanTyp(String.valueOf(contracttermofferanswer.getValueBooleanType()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlIntegerTyp ********************************************************************************/
		if(contracttermofferanswer.hasValueIntegerType()) {
			c.setCnctTrmOffrAnsVlIntegerTyp(String.valueOf(contracttermofferanswer.getValueIntegerType()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlDtTimeTyp ********************************************************************************/
		if(contracttermofferanswer.hasValueDateTimeType()) {
			c.setCnctTrmOffrAnsVlDtTimeTyp(String.valueOf(contracttermofferanswer.getValueDateTimeType()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlDecimalTyp ********************************************************************************/
		if(contracttermofferanswer.hasValueDecimalType()) {
			c.setCnctTrmOffrAnsVlDecimalTyp(String.valueOf(contracttermofferanswer.getValueDecimalType()));
		}
		/******************** contracttermofferanswervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermofferanswervaluequantity = contracttermofferanswer.getValueQuantity();

		/******************** Cnct_Trm_Offr_Ans_VlQnty_Vl ********************************************************************************/
		if(contracttermofferanswervaluequantity.hasValue()) {
			c.setCnctTrmOffrAnsVlQntyVl(String.valueOf(contracttermofferanswervaluequantity.getValue()));
		}
		/******************** contracttermofferanswervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermofferanswervaluequantitycomparator = contracttermofferanswervaluequantity.getComparator();
		c.setCnctTrmOffrAnsVlQntyCmprtr(contracttermofferanswervaluequantitycomparator.toCode());

		/******************** Cnct_Trm_Offr_Ans_VlQnty_Cd ********************************************************************************/
		if(contracttermofferanswervaluequantity.hasCode()) {
			c.setCnctTrmOffrAnsVlQntyCd(String.valueOf(contracttermofferanswervaluequantity.getCode()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlQnty_Sys ********************************************************************************/
		if(contracttermofferanswervaluequantity.hasSystem()) {
			c.setCnctTrmOffrAnsVlQntySys(String.valueOf(contracttermofferanswervaluequantity.getSystem()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlQnty_Unt ********************************************************************************/
		if(contracttermofferanswervaluequantity.hasUnit()) {
			c.setCnctTrmOffrAnsVlQntyUnt(String.valueOf(contracttermofferanswervaluequantity.getUnit()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlStrgTyp ********************************************************************************/
		if(contracttermofferanswer.hasValueStringType()) {
			c.setCnctTrmOffrAnsVlStrgTyp(String.valueOf(contracttermofferanswer.getValueStringType()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlTimeTyp ********************************************************************************/
		if(contracttermofferanswer.hasValueTimeType()) {
			c.setCnctTrmOffrAnsVlTimeTyp(String.valueOf(contracttermofferanswer.getValueTimeType()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlUriTyp ********************************************************************************/
		if(contracttermofferanswer.hasValueUriType()) {
			c.setCnctTrmOffrAnsVlUriTyp(String.valueOf(contracttermofferanswer.getValueUriType()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlDtTyp ********************************************************************************/
		if(contracttermofferanswer.hasValueDateType()) {
			c.setCnctTrmOffrAnsVlDtTyp(String.valueOf(contracttermofferanswer.getValueDateType()));
		}
		/******************** contracttermofferanswervalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contracttermofferanswervalueattachment = contracttermofferanswer.getValueAttachment();

		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(contracttermofferanswervalueattachment.hasSize()) {
			c.setCnctTrmOffrAnsVlAttchmntSz(String.valueOf(contracttermofferanswervalueattachment.getSize()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(contracttermofferanswervalueattachment.hasLanguage()) {
			c.setCnctTrmOffrAnsVlAttchmntLnguage(String.valueOf(contracttermofferanswervalueattachment.getLanguage()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(contracttermofferanswervalueattachment.hasContentType()) {
			c.setCnctTrmOffrAnsVlAttchmntCntntTyp(String.valueOf(contracttermofferanswervalueattachment.getContentType()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Url ********************************************************************************/
		if(contracttermofferanswervalueattachment.hasUrl()) {
			c.setCnctTrmOffrAnsVlAttchmntUrl(String.valueOf(contracttermofferanswervalueattachment.getUrl()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(contracttermofferanswervalueattachment.hasTitle()) {
			c.setCnctTrmOffrAnsVlAttchmntTtl(String.valueOf(contracttermofferanswervalueattachment.getTitle()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(contracttermofferanswervalueattachment.hasHash()) {
			c.setCnctTrmOffrAnsVlAttchmntHash(String.valueOf(contracttermofferanswervalueattachment.getHash()));
		}

		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Data ********************************************************************************/
		if(contracttermofferanswervalueattachment.hasData()) {
			c.setCnctTrmOffrAnsVlAttchmntData(String.valueOf(contracttermofferanswervalueattachment.getData()));
		}

		/******************** Cnct_Trm_Offr_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(contracttermofferanswervalueattachment.hasCreation()) {
			c.setCnctTrmOffrAnsVlAttchmntCreation(String.valueOf(contracttermofferanswervalueattachment.getCreation()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlRfrnc ********************************************************************************/
		if(contracttermofferanswer.hasValueReference()) {
			c.setCnctTrmOffrAnsVlRfrnc(String.valueOf(contracttermofferanswer.getValueReference()));
		}
		/******************** contracttermofferanswervaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferanswervaluecoding = contracttermofferanswer.getValueCoding();

		/******************** Cnct_Trm_Offr_Ans_VlCdg_Dsply ********************************************************************************/
		if(contracttermofferanswervaluecoding.hasDisplay()) {
			c.setCnctTrmOffrAnsVlCdgDsply(String.valueOf(contracttermofferanswervaluecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Vrsn ********************************************************************************/
		if(contracttermofferanswervaluecoding.hasVersion()) {
			c.setCnctTrmOffrAnsVlCdgVrsn(String.valueOf(contracttermofferanswervaluecoding.getVersion()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Cd ********************************************************************************/
		if(contracttermofferanswervaluecoding.hasCode()) {
			c.setCnctTrmOffrAnsVlCdgCd(String.valueOf(contracttermofferanswervaluecoding.getCode()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_Sys ********************************************************************************/
		if(contracttermofferanswervaluecoding.hasSystem()) {
			c.setCnctTrmOffrAnsVlCdgSys(String.valueOf(contracttermofferanswervaluecoding.getSystem()));
		}
		/******************** Cnct_Trm_Offr_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(contracttermofferanswervaluecoding.hasUserSelected()) {
			c.setCnctTrmOffrAnsVlCdgUsrSltd(String.valueOf(contracttermofferanswervaluecoding.getUserSelected()));
		}
		/******************** contracttermofferidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contracttermofferidentifier = contracttermoffer.getIdentifierFirstRep();

		/******************** Cnct_Trm_Offr_Id_Vl ********************************************************************************/
		if(contracttermofferidentifier.hasValue()) {
			c.setCnctTrmOffrIdVl(String.valueOf(contracttermofferidentifier.getValue()));
		}
		/******************** contracttermofferidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermofferidentifiertype = contracttermofferidentifier.getType();

		/******************** contracttermofferidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermofferidentifiertypecoding = contracttermofferidentifiertype.getCodingFirstRep();

		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermofferidentifiertypecoding.hasDisplay()) {
			c.setCnctTrmOffrIdTypCdgDsply(String.valueOf(contracttermofferidentifiertypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermofferidentifiertypecoding.hasVersion()) {
			c.setCnctTrmOffrIdTypCdgVrsn(String.valueOf(contracttermofferidentifiertypecoding.getVersion()));
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermofferidentifiertypecoding.hasCode()) {
			c.setCnctTrmOffrIdTypCdgCd(String.valueOf(contracttermofferidentifiertypecoding.getCode()));
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermofferidentifiertypecoding.hasSystem()) {
			c.setCnctTrmOffrIdTypCdgSys(String.valueOf(contracttermofferidentifiertypecoding.getSystem()));
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermofferidentifiertypecoding.hasUserSelected()) {
			c.setCnctTrmOffrIdTypCdgUsrSltd(String.valueOf(contracttermofferidentifiertypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_Offr_Id_Typ_Txt ********************************************************************************/
		if(contracttermofferidentifiertype.hasText()) {
			c.setCnctTrmOffrIdTypTxt(String.valueOf(contracttermofferidentifiertype.getText()));
		}
		/******************** Cnct_Trm_Offr_Id_Sys ********************************************************************************/
		if(contracttermofferidentifier.hasSystem()) {
			c.setCnctTrmOffrIdSys(String.valueOf(contracttermofferidentifier.getSystem()));
		}
		/******************** Cnct_Trm_Offr_Id_Assigner ********************************************************************************/
		if(contracttermofferidentifier.hasAssigner()) {
			c.setCnctTrmOffrIdAssigner(String.valueOf(contracttermofferidentifier.getAssigner()));
		}
		/******************** contracttermofferidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermofferidentifierperiod = contracttermofferidentifier.getPeriod();

		/******************** Cnct_Trm_Offr_Id_Prd_End ********************************************************************************/
		if(contracttermofferidentifierperiod.hasEnd()) {
			c.setCnctTrmOffrIdPrdEnd(String.valueOf(contracttermofferidentifierperiod.getEnd()));
		}
		/******************** Cnct_Trm_Offr_Id_Prd_Strt ********************************************************************************/
		if(contracttermofferidentifierperiod.hasStart()) {
			c.setCnctTrmOffrIdPrdStrt(String.valueOf(contracttermofferidentifierperiod.getStart()));
		}
		/******************** contracttermofferidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse contracttermofferidentifieruse = contracttermofferidentifier.getUse();
		c.setCnctTrmOffrIdUse(contracttermofferidentifieruse.toCode());

		/******************** Cnct_Trm_Offr_Topic ********************************************************************************/
		if(contracttermoffer.hasTopic()) {
			c.setCnctTrmOffrTopic(String.valueOf(contracttermoffer.getTopic()));
		}
		/******************** contracttermas ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ContractAssetComponent contracttermas = contractterm.getAssetFirstRep();

		/******************** Cnct_Trm_As_Txt ********************************************************************************/
		if(contracttermas.hasText()) {
			c.setCnctTrmAsTxt(String.valueOf(contracttermas.getText()));
		}
		/******************** contracttermasscope ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasscope = contracttermas.getScope();

		/******************** contracttermasscopecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasscopecoding = contracttermasscope.getCodingFirstRep();

		/******************** Cnct_Trm_As_Scope_Cdg_Dsply ********************************************************************************/
		if(contracttermasscopecoding.hasDisplay()) {
			c.setCnctTrmAsScopeCdgDsply(String.valueOf(contracttermasscopecoding.getDisplay()));
		}
		/******************** Cnct_Trm_As_Scope_Cdg_Vrsn ********************************************************************************/
		if(contracttermasscopecoding.hasVersion()) {
			c.setCnctTrmAsScopeCdgVrsn(String.valueOf(contracttermasscopecoding.getVersion()));
		}
		/******************** Cnct_Trm_As_Scope_Cdg_Cd ********************************************************************************/
		if(contracttermasscopecoding.hasCode()) {
			c.setCnctTrmAsScopeCdgCd(String.valueOf(contracttermasscopecoding.getCode()));
		}
		/******************** Cnct_Trm_As_Scope_Cdg_Sys ********************************************************************************/
		if(contracttermasscopecoding.hasSystem()) {
			c.setCnctTrmAsScopeCdgSys(String.valueOf(contracttermasscopecoding.getSystem()));
		}
		/******************** Cnct_Trm_As_Scope_Cdg_UsrSltd ********************************************************************************/
		if(contracttermasscopecoding.hasUserSelected()) {
			c.setCnctTrmAsScopeCdgUsrSltd(String.valueOf(contracttermasscopecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_As_Scope_Txt ********************************************************************************/
		if(contracttermasscope.hasText()) {
			c.setCnctTrmAsScopeTxt(String.valueOf(contracttermasscope.getText()));
		}
		/******************** contracttermastype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermastype = contracttermas.getTypeFirstRep();

		/******************** contracttermastypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermastypecoding = contracttermastype.getCodingFirstRep();

		/******************** Cnct_Trm_As_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermastypecoding.hasDisplay()) {
			c.setCnctTrmAsTypCdgDsply(String.valueOf(contracttermastypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_As_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermastypecoding.hasVersion()) {
			c.setCnctTrmAsTypCdgVrsn(String.valueOf(contracttermastypecoding.getVersion()));
		}
		/******************** Cnct_Trm_As_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermastypecoding.hasCode()) {
			c.setCnctTrmAsTypCdgCd(String.valueOf(contracttermastypecoding.getCode()));
		}
		/******************** Cnct_Trm_As_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermastypecoding.hasSystem()) {
			c.setCnctTrmAsTypCdgSys(String.valueOf(contracttermastypecoding.getSystem()));
		}
		/******************** Cnct_Trm_As_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermastypecoding.hasUserSelected()) {
			c.setCnctTrmAsTypCdgUsrSltd(String.valueOf(contracttermastypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_As_Typ_Txt ********************************************************************************/
		if(contracttermastype.hasText()) {
			c.setCnctTrmAsTypTxt(String.valueOf(contracttermastype.getText()));
		}
		/******************** contracttermasvalueditem ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ValuedItemComponent contracttermasvalueditem = contracttermas.getValuedItemFirstRep();

		/******************** Cnct_Trm_As_VldItm_PymntDt ********************************************************************************/
		if(contracttermasvalueditem.hasPaymentDate()) {
			c.setCnctTrmAsVldItmPymntDt(String.valueOf(contracttermasvalueditem.getPaymentDate()));
		}
		/******************** contracttermasvalueditemidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier contracttermasvalueditemidentifier = contracttermasvalueditem.getIdentifier();

		/******************** Cnct_Trm_As_VldItm_Id_Vl ********************************************************************************/
		if(contracttermasvalueditemidentifier.hasValue()) {
			c.setCnctTrmAsVldItmIdVl(String.valueOf(contracttermasvalueditemidentifier.getValue()));
		}
		/******************** contracttermasvalueditemidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasvalueditemidentifiertype = contracttermasvalueditemidentifier.getType();

		/******************** contracttermasvalueditemidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasvalueditemidentifiertypecoding = contracttermasvalueditemidentifiertype.getCodingFirstRep();

		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecoding.hasDisplay()) {
			c.setCnctTrmAsVldItmIdTypCdgDsply(String.valueOf(contracttermasvalueditemidentifiertypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecoding.hasVersion()) {
			c.setCnctTrmAsVldItmIdTypCdgVrsn(String.valueOf(contracttermasvalueditemidentifiertypecoding.getVersion()));
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecoding.hasCode()) {
			c.setCnctTrmAsVldItmIdTypCdgCd(String.valueOf(contracttermasvalueditemidentifiertypecoding.getCode()));
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecoding.hasSystem()) {
			c.setCnctTrmAsVldItmIdTypCdgSys(String.valueOf(contracttermasvalueditemidentifiertypecoding.getSystem()));
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(contracttermasvalueditemidentifiertypecoding.hasUserSelected()) {
			c.setCnctTrmAsVldItmIdTypCdgUsrSltd(String.valueOf(contracttermasvalueditemidentifiertypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_As_VldItm_Id_Typ_Txt ********************************************************************************/
		if(contracttermasvalueditemidentifiertype.hasText()) {
			c.setCnctTrmAsVldItmIdTypTxt(String.valueOf(contracttermasvalueditemidentifiertype.getText()));
		}
		/******************** Cnct_Trm_As_VldItm_Id_Sys ********************************************************************************/
		if(contracttermasvalueditemidentifier.hasSystem()) {
			c.setCnctTrmAsVldItmIdSys(String.valueOf(contracttermasvalueditemidentifier.getSystem()));
		}
		/******************** Cnct_Trm_As_VldItm_Id_Assigner ********************************************************************************/
		if(contracttermasvalueditemidentifier.hasAssigner()) {
			c.setCnctTrmAsVldItmIdAssigner(String.valueOf(contracttermasvalueditemidentifier.getAssigner()));
		}
		/******************** contracttermasvalueditemidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermasvalueditemidentifierperiod = contracttermasvalueditemidentifier.getPeriod();

		/******************** Cnct_Trm_As_VldItm_Id_Prd_End ********************************************************************************/
		if(contracttermasvalueditemidentifierperiod.hasEnd()) {
			c.setCnctTrmAsVldItmIdPrdEnd(String.valueOf(contracttermasvalueditemidentifierperiod.getEnd()));
		}
		/******************** Cnct_Trm_As_VldItm_Id_Prd_Strt ********************************************************************************/
		if(contracttermasvalueditemidentifierperiod.hasStart()) {
			c.setCnctTrmAsVldItmIdPrdStrt(String.valueOf(contracttermasvalueditemidentifierperiod.getStart()));
		}
		/******************** contracttermasvalueditemidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse contracttermasvalueditemidentifieruse = contracttermasvalueditemidentifier.getUse();
		c.setCnctTrmAsVldItmIdUse(contracttermasvalueditemidentifieruse.toCode());

		/******************** contracttermasvalueditementitycodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasvalueditementitycodeableconcept = contracttermasvalueditem.getEntityCodeableConcept();

		/******************** contracttermasvalueditementitycodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasvalueditementitycodeableconceptcoding = contracttermasvalueditementitycodeableconcept.getCodingFirstRep();

		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcoding.hasDisplay()) {
			c.setCnctTrmAsVldItmEntityCdbleCncptCdgDsply(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getDisplay()));
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcoding.hasVersion()) {
			c.setCnctTrmAsVldItmEntityCdbleCncptCdgVrsn(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getVersion()));
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcoding.hasCode()) {
			c.setCnctTrmAsVldItmEntityCdbleCncptCdgCd(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getCode()));
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcoding.hasSystem()) {
			c.setCnctTrmAsVldItmEntityCdbleCncptCdgSys(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getSystem()));
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(contracttermasvalueditementitycodeableconceptcoding.hasUserSelected()) {
			c.setCnctTrmAsVldItmEntityCdbleCncptCdgUsrSltd(String.valueOf(contracttermasvalueditementitycodeableconceptcoding.getUserSelected()));
		}
		/******************** Cnct_Trm_As_VldItm_EntityCdbleCncpt_Txt ********************************************************************************/
		if(contracttermasvalueditementitycodeableconcept.hasText()) {
			c.setCnctTrmAsVldItmEntityCdbleCncptTxt(String.valueOf(contracttermasvalueditementitycodeableconcept.getText()));
		}
		/******************** Cnct_Trm_As_VldItm_EntityRfrnc ********************************************************************************/
		if(contracttermasvalueditem.hasEntityReference()) {
			c.setCnctTrmAsVldItmEntityRfrnc(String.valueOf(contracttermasvalueditem.getEntityReference()));
		}
		/******************** Cnct_Trm_As_VldItm_EfctiveTime ********************************************************************************/
		if(contracttermasvalueditem.hasEffectiveTime()) {
			c.setCnctTrmAsVldItmEfctiveTime(String.valueOf(contracttermasvalueditem.getEffectiveTime()));
		}
		/******************** Cnct_Trm_As_VldItm_Points ********************************************************************************/
		if(contracttermasvalueditem.hasPoints()) {
			c.setCnctTrmAsVldItmPoints(String.valueOf(contracttermasvalueditem.getPoints()));
		}
		/******************** Cnct_Trm_As_VldItm_Factor ********************************************************************************/
		if(contracttermasvalueditem.hasFactor()) {
			c.setCnctTrmAsVldItmFactor(String.valueOf(contracttermasvalueditem.getFactor()));
		}
		/******************** contracttermasvalueditemnet ********************************************************************************/
		org.hl7.fhir.r4.model.Money contracttermasvalueditemnet = contracttermasvalueditem.getNet();

		/******************** Cnct_Trm_As_VldItm_Net_Vl ********************************************************************************/
		if(contracttermasvalueditemnet.hasValue()) {
			c.setCnctTrmAsVldItmNetVl(String.valueOf(contracttermasvalueditemnet.getValue()));
		}
		/******************** Cnct_Trm_As_VldItm_Net_Crncy ********************************************************************************/
		if(contracttermasvalueditemnet.hasCurrency()) {
			c.setCnctTrmAsVldItmNetCrncy(String.valueOf(contracttermasvalueditemnet.getCurrency()));
		}
		/******************** contracttermasvalueditemunitprice ********************************************************************************/
		org.hl7.fhir.r4.model.Money contracttermasvalueditemunitprice = contracttermasvalueditem.getUnitPrice();

		/******************** Cnct_Trm_As_VldItm_UntPrice_Vl ********************************************************************************/
		if(contracttermasvalueditemunitprice.hasValue()) {
			c.setCnctTrmAsVldItmUntPriceVl(String.valueOf(contracttermasvalueditemunitprice.getValue()));
		}
		/******************** Cnct_Trm_As_VldItm_UntPrice_Crncy ********************************************************************************/
		if(contracttermasvalueditemunitprice.hasCurrency()) {
			c.setCnctTrmAsVldItmUntPriceCrncy(String.valueOf(contracttermasvalueditemunitprice.getCurrency()));
		}
		/******************** contracttermasvalueditemquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermasvalueditemquantity = contracttermasvalueditem.getQuantity();

		/******************** Cnct_Trm_As_VldItm_Qnty_Vl ********************************************************************************/
		if(contracttermasvalueditemquantity.hasValue()) {
			c.setCnctTrmAsVldItmQntyVl(String.valueOf(contracttermasvalueditemquantity.getValue()));
		}
		/******************** contracttermasvalueditemquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermasvalueditemquantitycomparator = contracttermasvalueditemquantity.getComparator();
		c.setCnctTrmAsVldItmQntyCmprtr(contracttermasvalueditemquantitycomparator.toCode());

		/******************** Cnct_Trm_As_VldItm_Qnty_Cd ********************************************************************************/
		if(contracttermasvalueditemquantity.hasCode()) {
			c.setCnctTrmAsVldItmQntyCd(String.valueOf(contracttermasvalueditemquantity.getCode()));
		}
		/******************** Cnct_Trm_As_VldItm_Qnty_Sys ********************************************************************************/
		if(contracttermasvalueditemquantity.hasSystem()) {
			c.setCnctTrmAsVldItmQntySys(String.valueOf(contracttermasvalueditemquantity.getSystem()));
		}
		/******************** Cnct_Trm_As_VldItm_Qnty_Unt ********************************************************************************/
		if(contracttermasvalueditemquantity.hasUnit()) {
			c.setCnctTrmAsVldItmQntyUnt(String.valueOf(contracttermasvalueditemquantity.getUnit()));
		}
		/******************** Cnct_Trm_As_VldItm_Responsible ********************************************************************************/
		if(contracttermasvalueditem.hasResponsible()) {
			c.setCnctTrmAsVldItmResponsible(String.valueOf(contracttermasvalueditem.getResponsible()));
		}
		/******************** Cnct_Trm_As_VldItm_Pymnt ********************************************************************************/
		if(contracttermasvalueditem.hasPayment()) {
			c.setCnctTrmAsVldItmPymnt(String.valueOf(contracttermasvalueditem.getPayment()));
		}
		/******************** Cnct_Trm_As_VldItm_Recipient ********************************************************************************/
		if(contracttermasvalueditem.hasRecipient()) {
			c.setCnctTrmAsVldItmRecipient(String.valueOf(contracttermasvalueditem.getRecipient()));
		}
		/******************** Cnct_Trm_As_TypRfrnc ********************************************************************************/
		if(contracttermas.hasTypeReference()) {
			c.setCnctTrmAsTypRfrnc(String.valueOf(contracttermas.getTypeReferenceFirstRep()));
		}
		/******************** contracttermasperiodtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermasperiodtype = contracttermas.getPeriodTypeFirstRep();

		/******************** contracttermasperiodtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasperiodtypecoding = contracttermasperiodtype.getCodingFirstRep();

		/******************** Cnct_Trm_As_PrdTyp_Cdg_Dsply ********************************************************************************/
		if(contracttermasperiodtypecoding.hasDisplay()) {
			c.setCnctTrmAsPrdTypCdgDsply(String.valueOf(contracttermasperiodtypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_As_PrdTyp_Cdg_Vrsn ********************************************************************************/
		if(contracttermasperiodtypecoding.hasVersion()) {
			c.setCnctTrmAsPrdTypCdgVrsn(String.valueOf(contracttermasperiodtypecoding.getVersion()));
		}
		/******************** Cnct_Trm_As_PrdTyp_Cdg_Cd ********************************************************************************/
		if(contracttermasperiodtypecoding.hasCode()) {
			c.setCnctTrmAsPrdTypCdgCd(String.valueOf(contracttermasperiodtypecoding.getCode()));
		}
		/******************** Cnct_Trm_As_PrdTyp_Cdg_Sys ********************************************************************************/
		if(contracttermasperiodtypecoding.hasSystem()) {
			c.setCnctTrmAsPrdTypCdgSys(String.valueOf(contracttermasperiodtypecoding.getSystem()));
		}
		/******************** Cnct_Trm_As_PrdTyp_Cdg_UsrSltd ********************************************************************************/
		if(contracttermasperiodtypecoding.hasUserSelected()) {
			c.setCnctTrmAsPrdTypCdgUsrSltd(String.valueOf(contracttermasperiodtypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_As_PrdTyp_Txt ********************************************************************************/
		if(contracttermasperiodtype.hasText()) {
			c.setCnctTrmAsPrdTypTxt(String.valueOf(contracttermasperiodtype.getText()));
		}
		/******************** contracttermasuseperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermasuseperiod = contracttermas.getUsePeriodFirstRep();

		/******************** Cnct_Trm_As_UsePrd_End ********************************************************************************/
		if(contracttermasuseperiod.hasEnd()) {
			c.setCnctTrmAsUsePrdEnd(String.valueOf(contracttermasuseperiod.getEnd()));
		}
		/******************** Cnct_Trm_As_UsePrd_Strt ********************************************************************************/
		if(contracttermasuseperiod.hasStart()) {
			c.setCnctTrmAsUsePrdStrt(String.valueOf(contracttermasuseperiod.getStart()));
		}
		/******************** contracttermasanswer ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.AnswerComponent contracttermasanswer = contracttermas.getAnswerFirstRep();

		/******************** Cnct_Trm_As_Ans_VlBooleanTyp ********************************************************************************/
		if(contracttermasanswer.hasValueBooleanType()) {
			c.setCnctTrmAsAnsVlBooleanTyp(String.valueOf(contracttermasanswer.getValueBooleanType()));
		}
		/******************** Cnct_Trm_As_Ans_VlIntegerTyp ********************************************************************************/
		if(contracttermasanswer.hasValueIntegerType()) {
			c.setCnctTrmAsAnsVlIntegerTyp(String.valueOf(contracttermasanswer.getValueIntegerType()));
		}
		/******************** Cnct_Trm_As_Ans_VlDtTimeTyp ********************************************************************************/
		if(contracttermasanswer.hasValueDateTimeType()) {
			c.setCnctTrmAsAnsVlDtTimeTyp(String.valueOf(contracttermasanswer.getValueDateTimeType()));
		}
		/******************** Cnct_Trm_As_Ans_VlDecimalTyp ********************************************************************************/
		if(contracttermasanswer.hasValueDecimalType()) {
			c.setCnctTrmAsAnsVlDecimalTyp(String.valueOf(contracttermasanswer.getValueDecimalType()));
		}
		/******************** contracttermasanswervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity contracttermasanswervaluequantity = contracttermasanswer.getValueQuantity();

		/******************** Cnct_Trm_As_Ans_VlQnty_Vl ********************************************************************************/
		if(contracttermasanswervaluequantity.hasValue()) {
			c.setCnctTrmAsAnsVlQntyVl(String.valueOf(contracttermasanswervaluequantity.getValue()));
		}
		/******************** contracttermasanswervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator contracttermasanswervaluequantitycomparator = contracttermasanswervaluequantity.getComparator();
		c.setCnctTrmAsAnsVlQntyCmprtr(contracttermasanswervaluequantitycomparator.toCode());

		/******************** Cnct_Trm_As_Ans_VlQnty_Cd ********************************************************************************/
		if(contracttermasanswervaluequantity.hasCode()) {
			c.setCnctTrmAsAnsVlQntyCd(String.valueOf(contracttermasanswervaluequantity.getCode()));
		}
		/******************** Cnct_Trm_As_Ans_VlQnty_Sys ********************************************************************************/
		if(contracttermasanswervaluequantity.hasSystem()) {
			c.setCnctTrmAsAnsVlQntySys(String.valueOf(contracttermasanswervaluequantity.getSystem()));
		}
		/******************** Cnct_Trm_As_Ans_VlQnty_Unt ********************************************************************************/
		if(contracttermasanswervaluequantity.hasUnit()) {
			c.setCnctTrmAsAnsVlQntyUnt(String.valueOf(contracttermasanswervaluequantity.getUnit()));
		}
		/******************** Cnct_Trm_As_Ans_VlStrgTyp ********************************************************************************/
		if(contracttermasanswer.hasValueStringType()) {
			c.setCnctTrmAsAnsVlStrgTyp(String.valueOf(contracttermasanswer.getValueStringType()));
		}
		/******************** Cnct_Trm_As_Ans_VlTimeTyp ********************************************************************************/
		if(contracttermasanswer.hasValueTimeType()) {
			c.setCnctTrmAsAnsVlTimeTyp(String.valueOf(contracttermasanswer.getValueTimeType()));
		}
		/******************** Cnct_Trm_As_Ans_VlUriTyp ********************************************************************************/
		if(contracttermasanswer.hasValueUriType()) {
			c.setCnctTrmAsAnsVlUriTyp(String.valueOf(contracttermasanswer.getValueUriType()));
		}
		/******************** Cnct_Trm_As_Ans_VlDtTyp ********************************************************************************/
		if(contracttermasanswer.hasValueDateType()) {
			c.setCnctTrmAsAnsVlDtTyp(String.valueOf(contracttermasanswer.getValueDateType()));
		}
		/******************** contracttermasanswervalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contracttermasanswervalueattachment = contracttermasanswer.getValueAttachment();

		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(contracttermasanswervalueattachment.hasSize()) {
			c.setCnctTrmAsAnsVlAttchmntSz(String.valueOf(contracttermasanswervalueattachment.getSize()));
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(contracttermasanswervalueattachment.hasLanguage()) {
			c.setCnctTrmAsAnsVlAttchmntLnguage(String.valueOf(contracttermasanswervalueattachment.getLanguage()));
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(contracttermasanswervalueattachment.hasContentType()) {
			c.setCnctTrmAsAnsVlAttchmntCntntTyp(String.valueOf(contracttermasanswervalueattachment.getContentType()));
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Url ********************************************************************************/
		if(contracttermasanswervalueattachment.hasUrl()) {
			c.setCnctTrmAsAnsVlAttchmntUrl(String.valueOf(contracttermasanswervalueattachment.getUrl()));
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(contracttermasanswervalueattachment.hasTitle()) {
			c.setCnctTrmAsAnsVlAttchmntTtl(String.valueOf(contracttermasanswervalueattachment.getTitle()));
		}
		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(contracttermasanswervalueattachment.hasHash()) {
			c.setCnctTrmAsAnsVlAttchmntHash(String.valueOf(contracttermasanswervalueattachment.getHash()));
		}

		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Data ********************************************************************************/
		if(contracttermasanswervalueattachment.hasData()) {
			c.setCnctTrmAsAnsVlAttchmntData(String.valueOf(contracttermasanswervalueattachment.getData()));
		}

		/******************** Cnct_Trm_As_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(contracttermasanswervalueattachment.hasCreation()) {
			c.setCnctTrmAsAnsVlAttchmntCreation(String.valueOf(contracttermasanswervalueattachment.getCreation()));
		}
		/******************** Cnct_Trm_As_Ans_VlRfrnc ********************************************************************************/
		if(contracttermasanswer.hasValueReference()) {
			c.setCnctTrmAsAnsVlRfrnc(String.valueOf(contracttermasanswer.getValueReference()));
		}
		/******************** contracttermasanswervaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasanswervaluecoding = contracttermasanswer.getValueCoding();

		/******************** Cnct_Trm_As_Ans_VlCdg_Dsply ********************************************************************************/
		if(contracttermasanswervaluecoding.hasDisplay()) {
			c.setCnctTrmAsAnsVlCdgDsply(String.valueOf(contracttermasanswervaluecoding.getDisplay()));
		}
		/******************** Cnct_Trm_As_Ans_VlCdg_Vrsn ********************************************************************************/
		if(contracttermasanswervaluecoding.hasVersion()) {
			c.setCnctTrmAsAnsVlCdgVrsn(String.valueOf(contracttermasanswervaluecoding.getVersion()));
		}
		/******************** Cnct_Trm_As_Ans_VlCdg_Cd ********************************************************************************/
		if(contracttermasanswervaluecoding.hasCode()) {
			c.setCnctTrmAsAnsVlCdgCd(String.valueOf(contracttermasanswervaluecoding.getCode()));
		}
		/******************** Cnct_Trm_As_Ans_VlCdg_Sys ********************************************************************************/
		if(contracttermasanswervaluecoding.hasSystem()) {
			c.setCnctTrmAsAnsVlCdgSys(String.valueOf(contracttermasanswervaluecoding.getSystem()));
		}
		/******************** Cnct_Trm_As_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(contracttermasanswervaluecoding.hasUserSelected()) {
			c.setCnctTrmAsAnsVlCdgUsrSltd(String.valueOf(contracttermasanswervaluecoding.getUserSelected()));
		}
		/******************** contracttermasperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermasperiod = contracttermas.getPeriodFirstRep();

		/******************** Cnct_Trm_As_Prd_End ********************************************************************************/
		if(contracttermasperiod.hasEnd()) {
			c.setCnctTrmAsPrdEnd(String.valueOf(contracttermasperiod.getEnd()));
		}
		/******************** Cnct_Trm_As_Prd_Strt ********************************************************************************/
		if(contracttermasperiod.hasStart()) {
			c.setCnctTrmAsPrdStrt(String.valueOf(contracttermasperiod.getStart()));
		}
		/******************** Cnct_Trm_As_Cndtn ********************************************************************************/
		if(contracttermas.hasCondition()) {
			c.setCnctTrmAsCndtn(String.valueOf(contracttermas.getCondition()));
		}
		/******************** contracttermassubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermassubtype = contracttermas.getSubtypeFirstRep();

		/******************** contracttermassubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermassubtypecoding = contracttermassubtype.getCodingFirstRep();

		/******************** Cnct_Trm_As_Subtype_Cdg_Dsply ********************************************************************************/
		if(contracttermassubtypecoding.hasDisplay()) {
			c.setCnctTrmAsSubtypeCdgDsply(String.valueOf(contracttermassubtypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_As_Subtype_Cdg_Vrsn ********************************************************************************/
		if(contracttermassubtypecoding.hasVersion()) {
			c.setCnctTrmAsSubtypeCdgVrsn(String.valueOf(contracttermassubtypecoding.getVersion()));
		}
		/******************** Cnct_Trm_As_Subtype_Cdg_Cd ********************************************************************************/
		if(contracttermassubtypecoding.hasCode()) {
			c.setCnctTrmAsSubtypeCdgCd(String.valueOf(contracttermassubtypecoding.getCode()));
		}
		/******************** Cnct_Trm_As_Subtype_Cdg_Sys ********************************************************************************/
		if(contracttermassubtypecoding.hasSystem()) {
			c.setCnctTrmAsSubtypeCdgSys(String.valueOf(contracttermassubtypecoding.getSystem()));
		}
		/******************** Cnct_Trm_As_Subtype_Cdg_UsrSltd ********************************************************************************/
		if(contracttermassubtypecoding.hasUserSelected()) {
			c.setCnctTrmAsSubtypeCdgUsrSltd(String.valueOf(contracttermassubtypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_As_Subtype_Txt ********************************************************************************/
		if(contracttermassubtype.hasText()) {
			c.setCnctTrmAsSubtypeTxt(String.valueOf(contracttermassubtype.getText()));
		}
		/******************** contracttermasrelationship ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermasrelationship = contracttermas.getRelationship();

		/******************** Cnct_Trm_As_Rltnship_Dsply ********************************************************************************/
		if(contracttermasrelationship.hasDisplay()) {
			c.setCnctTrmAsRltnshipDsply(String.valueOf(contracttermasrelationship.getDisplay()));
		}
		/******************** Cnct_Trm_As_Rltnship_Vrsn ********************************************************************************/
		if(contracttermasrelationship.hasVersion()) {
			c.setCnctTrmAsRltnshipVrsn(String.valueOf(contracttermasrelationship.getVersion()));
		}
		/******************** Cnct_Trm_As_Rltnship_Cd ********************************************************************************/
		if(contracttermasrelationship.hasCode()) {
			c.setCnctTrmAsRltnshipCd(String.valueOf(contracttermasrelationship.getCode()));
		}
		/******************** Cnct_Trm_As_Rltnship_Sys ********************************************************************************/
		if(contracttermasrelationship.hasSystem()) {
			c.setCnctTrmAsRltnshipSys(String.valueOf(contracttermasrelationship.getSystem()));
		}
		/******************** Cnct_Trm_As_Rltnship_UsrSltd ********************************************************************************/
		if(contracttermasrelationship.hasUserSelected()) {
			c.setCnctTrmAsRltnshipUsrSltd(String.valueOf(contracttermasrelationship.getUserSelected()));
		}
		/******************** contracttermascontext ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.AssetContextComponent contracttermascontext = contracttermas.getContextFirstRep();

		/******************** Cnct_Trm_As_Cntxt_Rfrnc ********************************************************************************/
		if(contracttermascontext.hasReference()) {
			c.setCnctTrmAsCntxtRfrnc(String.valueOf(contracttermascontext.getReference()));
		}
		/******************** Cnct_Trm_As_Cntxt_Txt ********************************************************************************/
		if(contracttermascontext.hasText()) {
			c.setCnctTrmAsCntxtTxt(String.valueOf(contracttermascontext.getText()));
		}
		/******************** contracttermascontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermascontextcode = contracttermascontext.getCodeFirstRep();

		/******************** contracttermascontextcodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermascontextcodecoding = contracttermascontextcode.getCodingFirstRep();

		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Dsply ********************************************************************************/
		if(contracttermascontextcodecoding.hasDisplay()) {
			c.setCnctTrmAsCntxtCdCdgDsply(String.valueOf(contracttermascontextcodecoding.getDisplay()));
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Vrsn ********************************************************************************/
		if(contracttermascontextcodecoding.hasVersion()) {
			c.setCnctTrmAsCntxtCdCdgVrsn(String.valueOf(contracttermascontextcodecoding.getVersion()));
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Cd ********************************************************************************/
		if(contracttermascontextcodecoding.hasCode()) {
			c.setCnctTrmAsCntxtCdCdgCd(String.valueOf(contracttermascontextcodecoding.getCode()));
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_Sys ********************************************************************************/
		if(contracttermascontextcodecoding.hasSystem()) {
			c.setCnctTrmAsCntxtCdCdgSys(String.valueOf(contracttermascontextcodecoding.getSystem()));
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Cdg_UsrSltd ********************************************************************************/
		if(contracttermascontextcodecoding.hasUserSelected()) {
			c.setCnctTrmAsCntxtCdCdgUsrSltd(String.valueOf(contracttermascontextcodecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_As_Cntxt_Cd_Txt ********************************************************************************/
		if(contracttermascontextcode.hasText()) {
			c.setCnctTrmAsCntxtCdTxt(String.valueOf(contracttermascontextcode.getText()));
		}
		/******************** Cnct_Trm_Issued ********************************************************************************/
		if(contractterm.hasIssued()) {
			c.setCnctTrmIssued(String.valueOf(contractterm.getIssued()));
		}
		/******************** contracttermapplies ********************************************************************************/
		org.hl7.fhir.r4.model.Period contracttermapplies = contractterm.getApplies();

		/******************** Cnct_Trm_Applies_End ********************************************************************************/
		if(contracttermapplies.hasEnd()) {
			c.setCnctTrmAppliesEnd(String.valueOf(contracttermapplies.getEnd()));
		}
		/******************** Cnct_Trm_Applies_Strt ********************************************************************************/
		if(contracttermapplies.hasStart()) {
			c.setCnctTrmAppliesStrt(String.valueOf(contracttermapplies.getStart()));
		}
		/******************** contracttermsubtype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept contracttermsubtype = contractterm.getSubType();

		/******************** contracttermsubtypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermsubtypecoding = contracttermsubtype.getCodingFirstRep();

		/******************** Cnct_Trm_SubTyp_Cdg_Dsply ********************************************************************************/
		if(contracttermsubtypecoding.hasDisplay()) {
			c.setCnctTrmSubTypCdgDsply(String.valueOf(contracttermsubtypecoding.getDisplay()));
		}
		/******************** Cnct_Trm_SubTyp_Cdg_Vrsn ********************************************************************************/
		if(contracttermsubtypecoding.hasVersion()) {
			c.setCnctTrmSubTypCdgVrsn(String.valueOf(contracttermsubtypecoding.getVersion()));
		}
		/******************** Cnct_Trm_SubTyp_Cdg_Cd ********************************************************************************/
		if(contracttermsubtypecoding.hasCode()) {
			c.setCnctTrmSubTypCdgCd(String.valueOf(contracttermsubtypecoding.getCode()));
		}
		/******************** Cnct_Trm_SubTyp_Cdg_Sys ********************************************************************************/
		if(contracttermsubtypecoding.hasSystem()) {
			c.setCnctTrmSubTypCdgSys(String.valueOf(contracttermsubtypecoding.getSystem()));
		}
		/******************** Cnct_Trm_SubTyp_Cdg_UsrSltd ********************************************************************************/
		if(contracttermsubtypecoding.hasUserSelected()) {
			c.setCnctTrmSubTypCdgUsrSltd(String.valueOf(contracttermsubtypecoding.getUserSelected()));
		}
		/******************** Cnct_Trm_SubTyp_Txt ********************************************************************************/
		if(contracttermsubtype.hasText()) {
			c.setCnctTrmSubTypTxt(String.valueOf(contracttermsubtype.getText()));
		}
		/******************** Cnct_Trm_TopicRfrnc ********************************************************************************/
		if(contractterm.hasTopicReference()) {
			c.setCnctTrmTopicRfrnc(String.valueOf(contractterm.getTopicReference()));
		}
		/******************** contracttermsecuritylabel ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.SecurityLabelComponent contracttermsecuritylabel = contractterm.getSecurityLabelFirstRep();

		/******************** contracttermsecuritylabelclassification ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermsecuritylabelclassification = contracttermsecuritylabel.getClassification();

		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Dsply ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasDisplay()) {
			c.setCnctTrmSecurityLblClsfctnDsply(String.valueOf(contracttermsecuritylabelclassification.getDisplay()));
		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Vrsn ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasVersion()) {
			c.setCnctTrmSecurityLblClsfctnVrsn(String.valueOf(contracttermsecuritylabelclassification.getVersion()));
		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Cd ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasCode()) {
			c.setCnctTrmSecurityLblClsfctnCd(String.valueOf(contracttermsecuritylabelclassification.getCode()));
		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_Sys ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasSystem()) {
			c.setCnctTrmSecurityLblClsfctnSys(String.valueOf(contracttermsecuritylabelclassification.getSystem()));
		}
		/******************** Cnct_Trm_SecurityLbl_Clsfctn_UsrSltd ********************************************************************************/
		if(contracttermsecuritylabelclassification.hasUserSelected()) {
			c.setCnctTrmSecurityLblClsfctnUsrSltd(String.valueOf(contracttermsecuritylabelclassification.getUserSelected()));
		}
		/******************** contracttermsecuritylabelcategory ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermsecuritylabelcategory = contracttermsecuritylabel.getCategoryFirstRep();

		/******************** Cnct_Trm_SecurityLbl_Ctgry_Dsply ********************************************************************************/
		if(contracttermsecuritylabelcategory.hasDisplay()) {
			c.setCnctTrmSecurityLblCtgryDsply(String.valueOf(contracttermsecuritylabelcategory.getDisplay()));
		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Vrsn ********************************************************************************/
		if(contracttermsecuritylabelcategory.hasVersion()) {
			c.setCnctTrmSecurityLblCtgryVrsn(String.valueOf(contracttermsecuritylabelcategory.getVersion()));
		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Cd ********************************************************************************/
		if(contracttermsecuritylabelcategory.hasCode()) {
			c.setCnctTrmSecurityLblCtgryCd(String.valueOf(contracttermsecuritylabelcategory.getCode()));
		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_Sys ********************************************************************************/
		if(contracttermsecuritylabelcategory.hasSystem()) {
			c.setCnctTrmSecurityLblCtgrySys(String.valueOf(contracttermsecuritylabelcategory.getSystem()));
		}
		/******************** Cnct_Trm_SecurityLbl_Ctgry_UsrSltd ********************************************************************************/
		if(contracttermsecuritylabelcategory.hasUserSelected()) {
			c.setCnctTrmSecurityLblCtgryUsrSltd(String.valueOf(contracttermsecuritylabelcategory.getUserSelected()));
		}
		/******************** contracttermsecuritylabelcontrol ********************************************************************************/
		org.hl7.fhir.r4.model.Coding contracttermsecuritylabelcontrol = contracttermsecuritylabel.getControlFirstRep();

		/******************** Cnct_Trm_SecurityLbl_Control_Dsply ********************************************************************************/
		if(contracttermsecuritylabelcontrol.hasDisplay()) {
			c.setCnctTrmSecurityLblControlDsply(String.valueOf(contracttermsecuritylabelcontrol.getDisplay()));
		}
		/******************** Cnct_Trm_SecurityLbl_Control_Vrsn ********************************************************************************/
		if(contracttermsecuritylabelcontrol.hasVersion()) {
			c.setCnctTrmSecurityLblControlVrsn(String.valueOf(contracttermsecuritylabelcontrol.getVersion()));
		}
		/******************** Cnct_Trm_SecurityLbl_Control_Cd ********************************************************************************/
		if(contracttermsecuritylabelcontrol.hasCode()) {
			c.setCnctTrmSecurityLblControlCd(String.valueOf(contracttermsecuritylabelcontrol.getCode()));
		}
		/******************** Cnct_Trm_SecurityLbl_Control_Sys ********************************************************************************/
		if(contracttermsecuritylabelcontrol.hasSystem()) {
			c.setCnctTrmSecurityLblControlSys(String.valueOf(contracttermsecuritylabelcontrol.getSystem()));
		}
		/******************** Cnct_Trm_SecurityLbl_Control_UsrSltd ********************************************************************************/
		if(contracttermsecuritylabelcontrol.hasUserSelected()) {
			c.setCnctTrmSecurityLblControlUsrSltd(String.valueOf(contracttermsecuritylabelcontrol.getUserSelected()));
		}
		/******************** contractlegal ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.LegalLanguageComponent contractlegal = contract.getLegalFirstRep();

		/******************** Cnct_Legal_CntntRfrnc ********************************************************************************/
		if(contractlegal.hasContentReference()) {
			c.setCnctLegalCntntRfrnc(String.valueOf(contractlegal.getContentReference()));
		}
		/******************** contractlegalcontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractlegalcontentattachment = contractlegal.getContentAttachment();

		/******************** Cnct_Legal_CntntAttchmnt_Sz ********************************************************************************/
		if(contractlegalcontentattachment.hasSize()) {
			c.setCnctLegalCntntAttchmntSz(String.valueOf(contractlegalcontentattachment.getSize()));
		}
		/******************** Cnct_Legal_CntntAttchmnt_Lnguage ********************************************************************************/
		if(contractlegalcontentattachment.hasLanguage()) {
			c.setCnctLegalCntntAttchmntLnguage(String.valueOf(contractlegalcontentattachment.getLanguage()));
		}
		/******************** Cnct_Legal_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(contractlegalcontentattachment.hasContentType()) {
			c.setCnctLegalCntntAttchmntCntntTyp(String.valueOf(contractlegalcontentattachment.getContentType()));
		}
		/******************** Cnct_Legal_CntntAttchmnt_Url ********************************************************************************/
		if(contractlegalcontentattachment.hasUrl()) {
			c.setCnctLegalCntntAttchmntUrl(String.valueOf(contractlegalcontentattachment.getUrl()));
		}
		/******************** Cnct_Legal_CntntAttchmnt_Ttl ********************************************************************************/
		if(contractlegalcontentattachment.hasTitle()) {
			c.setCnctLegalCntntAttchmntTtl(String.valueOf(contractlegalcontentattachment.getTitle()));
		}
		/******************** Cnct_Legal_CntntAttchmnt_Hash ********************************************************************************/
		if(contractlegalcontentattachment.hasHash()) {
			c.setCnctLegalCntntAttchmntHash(String.valueOf(contractlegalcontentattachment.getHash()));
		}

		/******************** Cnct_Legal_CntntAttchmnt_Data ********************************************************************************/
		if(contractlegalcontentattachment.hasData()) {
			c.setCnctLegalCntntAttchmntData(String.valueOf(contractlegalcontentattachment.getData()));
		}

		/******************** Cnct_Legal_CntntAttchmnt_Creation ********************************************************************************/
		if(contractlegalcontentattachment.hasCreation()) {
			c.setCnctLegalCntntAttchmntCreation(String.valueOf(contractlegalcontentattachment.getCreation()));
		}
		/******************** contractrule ********************************************************************************/
		org.hl7.fhir.r4.model.Contract.ComputableLanguageComponent contractrule = contract.getRuleFirstRep();

		/******************** Cnct_Rule_CntntRfrnc ********************************************************************************/
		if(contractrule.hasContentReference()) {
			c.setCnctRuleCntntRfrnc(String.valueOf(contractrule.getContentReference()));
		}
		/******************** contractrulecontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment contractrulecontentattachment = contractrule.getContentAttachment();

		/******************** Cnct_Rule_CntntAttchmnt_Sz ********************************************************************************/
		if(contractrulecontentattachment.hasSize()) {
			c.setCnctRuleCntntAttchmntSz(String.valueOf(contractrulecontentattachment.getSize()));
		}
		/******************** Cnct_Rule_CntntAttchmnt_Lnguage ********************************************************************************/
		if(contractrulecontentattachment.hasLanguage()) {
			c.setCnctRuleCntntAttchmntLnguage(String.valueOf(contractrulecontentattachment.getLanguage()));
		}
		/******************** Cnct_Rule_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(contractrulecontentattachment.hasContentType()) {
			c.setCnctRuleCntntAttchmntCntntTyp(String.valueOf(contractrulecontentattachment.getContentType()));
		}
		/******************** Cnct_Rule_CntntAttchmnt_Url ********************************************************************************/
		if(contractrulecontentattachment.hasUrl()) {
			c.setCnctRuleCntntAttchmntUrl(String.valueOf(contractrulecontentattachment.getUrl()));
		}
		/******************** Cnct_Rule_CntntAttchmnt_Ttl ********************************************************************************/
		if(contractrulecontentattachment.hasTitle()) {
			c.setCnctRuleCntntAttchmntTtl(String.valueOf(contractrulecontentattachment.getTitle()));
		}
		/******************** Cnct_Rule_CntntAttchmnt_Hash ********************************************************************************/
		if(contractrulecontentattachment.hasHash()) {
			c.setCnctRuleCntntAttchmntHash(String.valueOf(contractrulecontentattachment.getHash()));
		}

		/******************** Cnct_Rule_CntntAttchmnt_Data ********************************************************************************/
		if(contractrulecontentattachment.hasData()) {
			c.setCnctRuleCntntAttchmntData(String.valueOf(contractrulecontentattachment.getData()));
		}

		/******************** Cnct_Rule_CntntAttchmnt_Creation ********************************************************************************/
		if(contractrulecontentattachment.hasCreation()) {
			c.setCnctRuleCntntAttchmntCreation(String.valueOf(contractrulecontentattachment.getCreation()));
		}
		/******************** Cnct_SprtingInfo ********************************************************************************/
		if(contract.hasSupportingInfo()) {
			c.setCnctSprtingInfo(String.valueOf(contract.getSupportingInfoFirstRep()));
		}
		return c;
	}
}
