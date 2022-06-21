package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Communication;
public class CommunicationBidirectionalConversion 
{
	public Communication Communications(org.hl7.fhir.r4.model.Communication communication) throws ParseException
	{
		 main.java.com.campfhir.model.Communication c = new  main.java.com.campfhir.model.Communication();

		/******************** id ********************************************************************************/
		communication.setId(c.getId());

		/******************** communicationpriority ********************************************************************************/
		org.hl7.fhir.r4.model.Communication.CommunicationPriority communicationpriority = communication.getPriority();
		c.setCmmnctnPriority(communicationpriority.toCode());

		/******************** Cmmnctn_Recipient ********************************************************************************/
		if(communication.hasRecipient()) {
			c.setCmmnctnRecipient(String.valueOf(communication.getRecipientFirstRep()));
		}
		/******************** Cmmnctn_Sbjct ********************************************************************************/
		if(communication.hasSubject()) {
			c.setCmmnctnSbjct(String.valueOf(communication.getSubject()));
		}
		/******************** communicationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Communication.CommunicationStatus communicationstatus = communication.getStatus();
		c.setCmmnctnSts(communicationstatus.toCode());

		/******************** Cmmnctn_Enc ********************************************************************************/
		if(communication.hasEncounter()) {
			c.setCmmnctnEnc(String.valueOf(communication.getEncounter()));
		}
		/******************** Cmmnctn_BasedOn ********************************************************************************/
		if(communication.hasBasedOn()) {
			c.setCmmnctnBasedOn(String.valueOf(communication.getBasedOnFirstRep()));
		}
		/******************** communicationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation communicationnote = communication.getNoteFirstRep();

		/******************** Cmmnctn_Nt_Time ********************************************************************************/
		if(communicationnote.hasTime()) {
			c.setCmmnctnNtTime(String.valueOf(communicationnote.getTime()));
		}
		/******************** Cmmnctn_Nt_AthrRfrnc ********************************************************************************/
		if(communicationnote.hasAuthorReference()) {
			c.setCmmnctnNtAthrRfrnc(String.valueOf(communicationnote.getAuthorReference()));
		}
		/******************** Cmmnctn_Nt_Txt ********************************************************************************/
		if(communicationnote.hasText()) {
			c.setCmmnctnNtTxt(String.valueOf(communicationnote.getText()));
		}
		/******************** Cmmnctn_Nt_AthrStrgTyp ********************************************************************************/
		if(communicationnote.hasAuthorStringType()) {
			c.setCmmnctnNtAthrStrgTyp(String.valueOf(communicationnote.getAuthorStringType()));
		}
		/******************** Cmmnctn_InRspsTo ********************************************************************************/
		if(communication.hasInResponseTo()) {
			c.setCmmnctnInRspsTo(String.valueOf(communication.getInResponseToFirstRep()));
		}
		/******************** communicationstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationstatusreason = communication.getStatusReason();

		/******************** communicationstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationstatusreasoncoding = communicationstatusreason.getCodingFirstRep();

		/******************** Cmmnctn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(communicationstatusreasoncoding.hasDisplay()) {
			c.setCmmnctnStsRsnCdgDsply(String.valueOf(communicationstatusreasoncoding.getDisplay()));
		}
		/******************** Cmmnctn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(communicationstatusreasoncoding.hasVersion()) {
			c.setCmmnctnStsRsnCdgVrsn(String.valueOf(communicationstatusreasoncoding.getVersion()));
		}
		/******************** Cmmnctn_StsRsn_Cdg_Cd ********************************************************************************/
		if(communicationstatusreasoncoding.hasCode()) {
			c.setCmmnctnStsRsnCdgCd(String.valueOf(communicationstatusreasoncoding.getCode()));
		}
		/******************** Cmmnctn_StsRsn_Cdg_Sys ********************************************************************************/
		if(communicationstatusreasoncoding.hasSystem()) {
			c.setCmmnctnStsRsnCdgSys(String.valueOf(communicationstatusreasoncoding.getSystem()));
		}
		/******************** Cmmnctn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(communicationstatusreasoncoding.hasUserSelected()) {
			c.setCmmnctnStsRsnCdgUsrSltd(String.valueOf(communicationstatusreasoncoding.getUserSelected()));
		}
		/******************** Cmmnctn_StsRsn_Txt ********************************************************************************/
		if(communicationstatusreason.hasText()) {
			c.setCmmnctnStsRsnTxt(String.valueOf(communicationstatusreason.getText()));
		}
		/******************** Cmmnctn_RsnRfrnc ********************************************************************************/
		if(communication.hasReasonReference()) {
			c.setCmmnctnRsnRfrnc(String.valueOf(communication.getReasonReferenceFirstRep()));
		}
		/******************** communicationreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationreasoncode = communication.getReasonCodeFirstRep();

		/******************** communicationreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationreasoncodecoding = communicationreasoncode.getCodingFirstRep();

		/******************** Cmmnctn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(communicationreasoncodecoding.hasDisplay()) {
			c.setCmmnctnRsnCdCdgDsply(String.valueOf(communicationreasoncodecoding.getDisplay()));
		}
		/******************** Cmmnctn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(communicationreasoncodecoding.hasVersion()) {
			c.setCmmnctnRsnCdCdgVrsn(String.valueOf(communicationreasoncodecoding.getVersion()));
		}
		/******************** Cmmnctn_RsnCd_Cdg_Cd ********************************************************************************/
		if(communicationreasoncodecoding.hasCode()) {
			c.setCmmnctnRsnCdCdgCd(String.valueOf(communicationreasoncodecoding.getCode()));
		}
		/******************** Cmmnctn_RsnCd_Cdg_Sys ********************************************************************************/
		if(communicationreasoncodecoding.hasSystem()) {
			c.setCmmnctnRsnCdCdgSys(String.valueOf(communicationreasoncodecoding.getSystem()));
		}
		/******************** Cmmnctn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(communicationreasoncodecoding.hasUserSelected()) {
			c.setCmmnctnRsnCdCdgUsrSltd(String.valueOf(communicationreasoncodecoding.getUserSelected()));
		}
		/******************** Cmmnctn_RsnCd_Txt ********************************************************************************/
		if(communicationreasoncode.hasText()) {
			c.setCmmnctnRsnCdTxt(String.valueOf(communicationreasoncode.getText()));
		}
		/******************** communicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationcategory = communication.getCategoryFirstRep();

		/******************** communicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationcategorycoding = communicationcategory.getCodingFirstRep();

		/******************** Cmmnctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(communicationcategorycoding.hasDisplay()) {
			c.setCmmnctnCtgryCdgDsply(String.valueOf(communicationcategorycoding.getDisplay()));
		}
		/******************** Cmmnctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(communicationcategorycoding.hasVersion()) {
			c.setCmmnctnCtgryCdgVrsn(String.valueOf(communicationcategorycoding.getVersion()));
		}
		/******************** Cmmnctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(communicationcategorycoding.hasCode()) {
			c.setCmmnctnCtgryCdgCd(String.valueOf(communicationcategorycoding.getCode()));
		}
		/******************** Cmmnctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(communicationcategorycoding.hasSystem()) {
			c.setCmmnctnCtgryCdgSys(String.valueOf(communicationcategorycoding.getSystem()));
		}
		/******************** Cmmnctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(communicationcategorycoding.hasUserSelected()) {
			c.setCmmnctnCtgryCdgUsrSltd(String.valueOf(communicationcategorycoding.getUserSelected()));
		}
		/******************** Cmmnctn_Ctgry_Txt ********************************************************************************/
		if(communicationcategory.hasText()) {
			c.setCmmnctnCtgryTxt(String.valueOf(communicationcategory.getText()));
		}
		/******************** Cmmnctn_PartOf ********************************************************************************/
		if(communication.hasPartOf()) {
			c.setCmmnctnPartOf(String.valueOf(communication.getPartOfFirstRep()));
		}
		/******************** communicationmedium ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationmedium = communication.getMediumFirstRep();

		/******************** communicationmediumcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationmediumcoding = communicationmedium.getCodingFirstRep();

		/******************** Cmmnctn_Medium_Cdg_Dsply ********************************************************************************/
		if(communicationmediumcoding.hasDisplay()) {
			c.setCmmnctnMediumCdgDsply(String.valueOf(communicationmediumcoding.getDisplay()));
		}
		/******************** Cmmnctn_Medium_Cdg_Vrsn ********************************************************************************/
		if(communicationmediumcoding.hasVersion()) {
			c.setCmmnctnMediumCdgVrsn(String.valueOf(communicationmediumcoding.getVersion()));
		}
		/******************** Cmmnctn_Medium_Cdg_Cd ********************************************************************************/
		if(communicationmediumcoding.hasCode()) {
			c.setCmmnctnMediumCdgCd(String.valueOf(communicationmediumcoding.getCode()));
		}
		/******************** Cmmnctn_Medium_Cdg_Sys ********************************************************************************/
		if(communicationmediumcoding.hasSystem()) {
			c.setCmmnctnMediumCdgSys(String.valueOf(communicationmediumcoding.getSystem()));
		}
		/******************** Cmmnctn_Medium_Cdg_UsrSltd ********************************************************************************/
		if(communicationmediumcoding.hasUserSelected()) {
			c.setCmmnctnMediumCdgUsrSltd(String.valueOf(communicationmediumcoding.getUserSelected()));
		}
		/******************** Cmmnctn_Medium_Txt ********************************************************************************/
		if(communicationmedium.hasText()) {
			c.setCmmnctnMediumTxt(String.valueOf(communicationmedium.getText()));
		}
		/******************** Cmmnctn_Sent ********************************************************************************/
		if(communication.hasSent()) {
			c.setCmmnctnSent(String.valueOf(communication.getSent()));
		}
		/******************** Cmmnctn_About ********************************************************************************/
		if(communication.hasAbout()) {
			c.setCmmnctnAbout(String.valueOf(communication.getAboutFirstRep()));
		}
		/******************** communicationpayload ********************************************************************************/
		org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent communicationpayload = communication.getPayloadFirstRep();

		/******************** Cmmnctn_Payload_CntntRfrnc ********************************************************************************/
		if(communicationpayload.hasContentReference()) {
			c.setCmmnctnPayloadCntntRfrnc(String.valueOf(communicationpayload.getContentReference()));
		}
		/******************** communicationpayloadcontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment communicationpayloadcontentattachment = communicationpayload.getContentAttachment();

		/******************** Cmmnctn_Payload_CntntAttchmnt_Sz ********************************************************************************/
		if(communicationpayloadcontentattachment.hasSize()) {
			c.setCmmnctnPayloadCntntAttchmntSz(String.valueOf(communicationpayloadcontentattachment.getSize()));
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Lnguage ********************************************************************************/
		if(communicationpayloadcontentattachment.hasLanguage()) {
			c.setCmmnctnPayloadCntntAttchmntLnguage(String.valueOf(communicationpayloadcontentattachment.getLanguage()));
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(communicationpayloadcontentattachment.hasContentType()) {
			c.setCmmnctnPayloadCntntAttchmntCntntTyp(String.valueOf(communicationpayloadcontentattachment.getContentType()));
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Url ********************************************************************************/
		if(communicationpayloadcontentattachment.hasUrl()) {
			c.setCmmnctnPayloadCntntAttchmntUrl(String.valueOf(communicationpayloadcontentattachment.getUrl()));
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Ttl ********************************************************************************/
		if(communicationpayloadcontentattachment.hasTitle()) {
			c.setCmmnctnPayloadCntntAttchmntTtl(String.valueOf(communicationpayloadcontentattachment.getTitle()));
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Hash ********************************************************************************/
		if(communicationpayloadcontentattachment.hasHash()) {
			c.setCmmnctnPayloadCntntAttchmntHash(String.valueOf(communicationpayloadcontentattachment.getHash()));
		}

		/******************** Cmmnctn_Payload_CntntAttchmnt_Data ********************************************************************************/
		if(communicationpayloadcontentattachment.hasData()) {
			c.setCmmnctnPayloadCntntAttchmntData(String.valueOf(communicationpayloadcontentattachment.getData()));
		}

		/******************** Cmmnctn_Payload_CntntAttchmnt_Creation ********************************************************************************/
		if(communicationpayloadcontentattachment.hasCreation()) {
			c.setCmmnctnPayloadCntntAttchmntCreation(String.valueOf(communicationpayloadcontentattachment.getCreation()));
		}
		/******************** Cmmnctn_Payload_CntntStrgTyp ********************************************************************************/
		if(communicationpayload.hasContentStringType()) {
			c.setCmmnctnPayloadCntntStrgTyp(String.valueOf(communicationpayload.getContentStringType()));
		}
		/******************** Cmmnctn_Received ********************************************************************************/
		if(communication.hasReceived()) {
			c.setCmmnctnReceived(String.valueOf(communication.getReceived()));
		}
		/******************** communicationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier communicationidentifier = communication.getIdentifierFirstRep();

		/******************** Cmmnctn_Id_Vl ********************************************************************************/
		if(communicationidentifier.hasValue()) {
			c.setCmmnctnIdVl(String.valueOf(communicationidentifier.getValue()));
		}
		/******************** communicationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationidentifiertype = communicationidentifier.getType();

		/******************** communicationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationidentifiertypecoding = communicationidentifiertype.getCodingFirstRep();

		/******************** Cmmnctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(communicationidentifiertypecoding.hasDisplay()) {
			c.setCmmnctnIdTypCdgDsply(String.valueOf(communicationidentifiertypecoding.getDisplay()));
		}
		/******************** Cmmnctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(communicationidentifiertypecoding.hasVersion()) {
			c.setCmmnctnIdTypCdgVrsn(String.valueOf(communicationidentifiertypecoding.getVersion()));
		}
		/******************** Cmmnctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(communicationidentifiertypecoding.hasCode()) {
			c.setCmmnctnIdTypCdgCd(String.valueOf(communicationidentifiertypecoding.getCode()));
		}
		/******************** Cmmnctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(communicationidentifiertypecoding.hasSystem()) {
			c.setCmmnctnIdTypCdgSys(String.valueOf(communicationidentifiertypecoding.getSystem()));
		}
		/******************** Cmmnctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(communicationidentifiertypecoding.hasUserSelected()) {
			c.setCmmnctnIdTypCdgUsrSltd(String.valueOf(communicationidentifiertypecoding.getUserSelected()));
		}
		/******************** Cmmnctn_Id_Typ_Txt ********************************************************************************/
		if(communicationidentifiertype.hasText()) {
			c.setCmmnctnIdTypTxt(String.valueOf(communicationidentifiertype.getText()));
		}
		/******************** Cmmnctn_Id_Sys ********************************************************************************/
		if(communicationidentifier.hasSystem()) {
			c.setCmmnctnIdSys(String.valueOf(communicationidentifier.getSystem()));
		}
		/******************** Cmmnctn_Id_Assigner ********************************************************************************/
		if(communicationidentifier.hasAssigner()) {
			c.setCmmnctnIdAssigner(String.valueOf(communicationidentifier.getAssigner()));
		}
		/******************** communicationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationidentifierperiod = communicationidentifier.getPeriod();

		/******************** Cmmnctn_Id_Prd_End ********************************************************************************/
		if(communicationidentifierperiod.hasEnd()) {
			c.setCmmnctnIdPrdEnd(String.valueOf(communicationidentifierperiod.getEnd()));
		}
		/******************** Cmmnctn_Id_Prd_Strt ********************************************************************************/
		if(communicationidentifierperiod.hasStart()) {
			c.setCmmnctnIdPrdStrt(String.valueOf(communicationidentifierperiod.getStart()));
		}
		/******************** communicationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse communicationidentifieruse = communicationidentifier.getUse();
		c.setCmmnctnIdUse(communicationidentifieruse.toCode());

		/******************** communicationtopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationtopic = communication.getTopic();

		/******************** communicationtopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationtopiccoding = communicationtopic.getCodingFirstRep();

		/******************** Cmmnctn_Topic_Cdg_Dsply ********************************************************************************/
		if(communicationtopiccoding.hasDisplay()) {
			c.setCmmnctnTopicCdgDsply(String.valueOf(communicationtopiccoding.getDisplay()));
		}
		/******************** Cmmnctn_Topic_Cdg_Vrsn ********************************************************************************/
		if(communicationtopiccoding.hasVersion()) {
			c.setCmmnctnTopicCdgVrsn(String.valueOf(communicationtopiccoding.getVersion()));
		}
		/******************** Cmmnctn_Topic_Cdg_Cd ********************************************************************************/
		if(communicationtopiccoding.hasCode()) {
			c.setCmmnctnTopicCdgCd(String.valueOf(communicationtopiccoding.getCode()));
		}
		/******************** Cmmnctn_Topic_Cdg_Sys ********************************************************************************/
		if(communicationtopiccoding.hasSystem()) {
			c.setCmmnctnTopicCdgSys(String.valueOf(communicationtopiccoding.getSystem()));
		}
		/******************** Cmmnctn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(communicationtopiccoding.hasUserSelected()) {
			c.setCmmnctnTopicCdgUsrSltd(String.valueOf(communicationtopiccoding.getUserSelected()));
		}
		/******************** Cmmnctn_Topic_Txt ********************************************************************************/
		if(communicationtopic.hasText()) {
			c.setCmmnctnTopicTxt(String.valueOf(communicationtopic.getText()));
		}
		/******************** Cmmnctn_Sender ********************************************************************************/
		if(communication.hasSender()) {
			c.setCmmnctnSender(String.valueOf(communication.getSender()));
		}
		return c;
	}
}
