package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CommunicationRequest;
public class CommunicationRequestBidirectionalConversion 
{
	public CommunicationRequest CommunicationRequests(org.hl7.fhir.r4.model.CommunicationRequest communicationrequest) throws ParseException
	{
		 main.java.com.campfhir.model.CommunicationRequest c = new  main.java.com.campfhir.model.CommunicationRequest();

		/******************** id ********************************************************************************/
		communicationrequest.setId(c.getId());

		/******************** communicationrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CommunicationRequest.CommunicationPriority communicationrequestpriority = communicationrequest.getPriority();
		c.setCmmnctnRqstPriority(communicationrequestpriority.toCode());

		/******************** communicationrequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationrequestoccurrenceperiod = communicationrequest.getOccurrencePeriod();

		/******************** CmmnctnRqst_OccrncePrd_End ********************************************************************************/
		if(communicationrequestoccurrenceperiod.hasEnd()) {
			c.setCmmnctnRqstOccrncePrdEnd(String.valueOf(communicationrequestoccurrenceperiod.getEnd()));
		}
		/******************** CmmnctnRqst_OccrncePrd_Strt ********************************************************************************/
		if(communicationrequestoccurrenceperiod.hasStart()) {
			c.setCmmnctnRqstOccrncePrdStrt(String.valueOf(communicationrequestoccurrenceperiod.getStart()));
		}
		/******************** CmmnctnRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(communicationrequest.hasOccurrenceDateTimeType()) {
			c.setCmmnctnRqstOccrnceDtTimeTyp(String.valueOf(communicationrequest.getOccurrenceDateTimeType()));
		}
		/******************** CmmnctnRqst_Recipient ********************************************************************************/
		if(communicationrequest.hasRecipient()) {
			c.setCmmnctnRqstRecipient(String.valueOf(communicationrequest.getRecipientFirstRep()));
		}
		/******************** communicationrequestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier communicationrequestgroupidentifier = communicationrequest.getGroupIdentifier();

		/******************** CmmnctnRqst_GrpId_Vl ********************************************************************************/
		if(communicationrequestgroupidentifier.hasValue()) {
			c.setCmmnctnRqstGrpIdVl(String.valueOf(communicationrequestgroupidentifier.getValue()));
		}
		/******************** communicationrequestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestgroupidentifiertype = communicationrequestgroupidentifier.getType();

		/******************** communicationrequestgroupidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestgroupidentifiertypecoding = communicationrequestgroupidentifiertype.getCodingFirstRep();

		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(communicationrequestgroupidentifiertypecoding.hasDisplay()) {
			c.setCmmnctnRqstGrpIdTypCdgDsply(String.valueOf(communicationrequestgroupidentifiertypecoding.getDisplay()));
		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestgroupidentifiertypecoding.hasVersion()) {
			c.setCmmnctnRqstGrpIdTypCdgVrsn(String.valueOf(communicationrequestgroupidentifiertypecoding.getVersion()));
		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(communicationrequestgroupidentifiertypecoding.hasCode()) {
			c.setCmmnctnRqstGrpIdTypCdgCd(String.valueOf(communicationrequestgroupidentifiertypecoding.getCode()));
		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(communicationrequestgroupidentifiertypecoding.hasSystem()) {
			c.setCmmnctnRqstGrpIdTypCdgSys(String.valueOf(communicationrequestgroupidentifiertypecoding.getSystem()));
		}
		/******************** CmmnctnRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestgroupidentifiertypecoding.hasUserSelected()) {
			c.setCmmnctnRqstGrpIdTypCdgUsrSltd(String.valueOf(communicationrequestgroupidentifiertypecoding.getUserSelected()));
		}
		/******************** CmmnctnRqst_GrpId_Typ_Txt ********************************************************************************/
		if(communicationrequestgroupidentifiertype.hasText()) {
			c.setCmmnctnRqstGrpIdTypTxt(String.valueOf(communicationrequestgroupidentifiertype.getText()));
		}
		/******************** CmmnctnRqst_GrpId_Sys ********************************************************************************/
		if(communicationrequestgroupidentifier.hasSystem()) {
			c.setCmmnctnRqstGrpIdSys(String.valueOf(communicationrequestgroupidentifier.getSystem()));
		}
		/******************** CmmnctnRqst_GrpId_Assigner ********************************************************************************/
		if(communicationrequestgroupidentifier.hasAssigner()) {
			c.setCmmnctnRqstGrpIdAssigner(String.valueOf(communicationrequestgroupidentifier.getAssigner()));
		}
		/******************** communicationrequestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationrequestgroupidentifierperiod = communicationrequestgroupidentifier.getPeriod();

		/******************** CmmnctnRqst_GrpId_Prd_End ********************************************************************************/
		if(communicationrequestgroupidentifierperiod.hasEnd()) {
			c.setCmmnctnRqstGrpIdPrdEnd(String.valueOf(communicationrequestgroupidentifierperiod.getEnd()));
		}
		/******************** CmmnctnRqst_GrpId_Prd_Strt ********************************************************************************/
		if(communicationrequestgroupidentifierperiod.hasStart()) {
			c.setCmmnctnRqstGrpIdPrdStrt(String.valueOf(communicationrequestgroupidentifierperiod.getStart()));
		}
		/******************** communicationrequestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse communicationrequestgroupidentifieruse = communicationrequestgroupidentifier.getUse();
		c.setCmmnctnRqstGrpIdUse(communicationrequestgroupidentifieruse.toCode());

		/******************** CmmnctnRqst_AthredOn ********************************************************************************/
		if(communicationrequest.hasAuthoredOn()) {
			c.setCmmnctnRqstAthredOn(String.valueOf(communicationrequest.getAuthoredOn()));
		}
		/******************** CmmnctnRqst_Sbjct ********************************************************************************/
		if(communicationrequest.hasSubject()) {
			c.setCmmnctnRqstSbjct(String.valueOf(communicationrequest.getSubject()));
		}
		/******************** communicationrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestStatus communicationrequeststatus = communicationrequest.getStatus();
		c.setCmmnctnRqstSts(communicationrequeststatus.toCode());

		/******************** CmmnctnRqst_Enc ********************************************************************************/
		if(communicationrequest.hasEncounter()) {
			c.setCmmnctnRqstEnc(String.valueOf(communicationrequest.getEncounter()));
		}
		/******************** CmmnctnRqst_BasedOn ********************************************************************************/
		if(communicationrequest.hasBasedOn()) {
			c.setCmmnctnRqstBasedOn(String.valueOf(communicationrequest.getBasedOnFirstRep()));
		}
		/******************** communicationrequestnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation communicationrequestnote = communicationrequest.getNoteFirstRep();

		/******************** CmmnctnRqst_Nt_Time ********************************************************************************/
		if(communicationrequestnote.hasTime()) {
			c.setCmmnctnRqstNtTime(String.valueOf(communicationrequestnote.getTime()));
		}
		/******************** CmmnctnRqst_Nt_AthrRfrnc ********************************************************************************/
		if(communicationrequestnote.hasAuthorReference()) {
			c.setCmmnctnRqstNtAthrRfrnc(String.valueOf(communicationrequestnote.getAuthorReference()));
		}
		/******************** CmmnctnRqst_Nt_Txt ********************************************************************************/
		if(communicationrequestnote.hasText()) {
			c.setCmmnctnRqstNtTxt(String.valueOf(communicationrequestnote.getText()));
		}
		/******************** CmmnctnRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(communicationrequestnote.hasAuthorStringType()) {
			c.setCmmnctnRqstNtAthrStrgTyp(String.valueOf(communicationrequestnote.getAuthorStringType()));
		}
		/******************** communicationrequeststatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequeststatusreason = communicationrequest.getStatusReason();

		/******************** communicationrequeststatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequeststatusreasoncoding = communicationrequeststatusreason.getCodingFirstRep();

		/******************** CmmnctnRqst_StsRsn_Cdg_Dsply ********************************************************************************/
		if(communicationrequeststatusreasoncoding.hasDisplay()) {
			c.setCmmnctnRqstStsRsnCdgDsply(String.valueOf(communicationrequeststatusreasoncoding.getDisplay()));
		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(communicationrequeststatusreasoncoding.hasVersion()) {
			c.setCmmnctnRqstStsRsnCdgVrsn(String.valueOf(communicationrequeststatusreasoncoding.getVersion()));
		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Cd ********************************************************************************/
		if(communicationrequeststatusreasoncoding.hasCode()) {
			c.setCmmnctnRqstStsRsnCdgCd(String.valueOf(communicationrequeststatusreasoncoding.getCode()));
		}
		/******************** CmmnctnRqst_StsRsn_Cdg_Sys ********************************************************************************/
		if(communicationrequeststatusreasoncoding.hasSystem()) {
			c.setCmmnctnRqstStsRsnCdgSys(String.valueOf(communicationrequeststatusreasoncoding.getSystem()));
		}
		/******************** CmmnctnRqst_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequeststatusreasoncoding.hasUserSelected()) {
			c.setCmmnctnRqstStsRsnCdgUsrSltd(String.valueOf(communicationrequeststatusreasoncoding.getUserSelected()));
		}
		/******************** CmmnctnRqst_StsRsn_Txt ********************************************************************************/
		if(communicationrequeststatusreason.hasText()) {
			c.setCmmnctnRqstStsRsnTxt(String.valueOf(communicationrequeststatusreason.getText()));
		}
		/******************** CmmnctnRqst_RsnRfrnc ********************************************************************************/
		if(communicationrequest.hasReasonReference()) {
			c.setCmmnctnRqstRsnRfrnc(String.valueOf(communicationrequest.getReasonReferenceFirstRep()));
		}
		/******************** communicationrequestreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestreasoncode = communicationrequest.getReasonCodeFirstRep();

		/******************** communicationrequestreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestreasoncodecoding = communicationrequestreasoncode.getCodingFirstRep();

		/******************** CmmnctnRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(communicationrequestreasoncodecoding.hasDisplay()) {
			c.setCmmnctnRqstRsnCdCdgDsply(String.valueOf(communicationrequestreasoncodecoding.getDisplay()));
		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestreasoncodecoding.hasVersion()) {
			c.setCmmnctnRqstRsnCdCdgVrsn(String.valueOf(communicationrequestreasoncodecoding.getVersion()));
		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(communicationrequestreasoncodecoding.hasCode()) {
			c.setCmmnctnRqstRsnCdCdgCd(String.valueOf(communicationrequestreasoncodecoding.getCode()));
		}
		/******************** CmmnctnRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(communicationrequestreasoncodecoding.hasSystem()) {
			c.setCmmnctnRqstRsnCdCdgSys(String.valueOf(communicationrequestreasoncodecoding.getSystem()));
		}
		/******************** CmmnctnRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestreasoncodecoding.hasUserSelected()) {
			c.setCmmnctnRqstRsnCdCdgUsrSltd(String.valueOf(communicationrequestreasoncodecoding.getUserSelected()));
		}
		/******************** CmmnctnRqst_RsnCd_Txt ********************************************************************************/
		if(communicationrequestreasoncode.hasText()) {
			c.setCmmnctnRqstRsnCdTxt(String.valueOf(communicationrequestreasoncode.getText()));
		}
		/******************** communicationrequestcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestcategory = communicationrequest.getCategoryFirstRep();

		/******************** communicationrequestcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestcategorycoding = communicationrequestcategory.getCodingFirstRep();

		/******************** CmmnctnRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(communicationrequestcategorycoding.hasDisplay()) {
			c.setCmmnctnRqstCtgryCdgDsply(String.valueOf(communicationrequestcategorycoding.getDisplay()));
		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestcategorycoding.hasVersion()) {
			c.setCmmnctnRqstCtgryCdgVrsn(String.valueOf(communicationrequestcategorycoding.getVersion()));
		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(communicationrequestcategorycoding.hasCode()) {
			c.setCmmnctnRqstCtgryCdgCd(String.valueOf(communicationrequestcategorycoding.getCode()));
		}
		/******************** CmmnctnRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(communicationrequestcategorycoding.hasSystem()) {
			c.setCmmnctnRqstCtgryCdgSys(String.valueOf(communicationrequestcategorycoding.getSystem()));
		}
		/******************** CmmnctnRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestcategorycoding.hasUserSelected()) {
			c.setCmmnctnRqstCtgryCdgUsrSltd(String.valueOf(communicationrequestcategorycoding.getUserSelected()));
		}
		/******************** CmmnctnRqst_Ctgry_Txt ********************************************************************************/
		if(communicationrequestcategory.hasText()) {
			c.setCmmnctnRqstCtgryTxt(String.valueOf(communicationrequestcategory.getText()));
		}
		/******************** CmmnctnRqst_Replaces ********************************************************************************/
		if(communicationrequest.hasReplaces()) {
			c.setCmmnctnRqstReplaces(String.valueOf(communicationrequest.getReplacesFirstRep()));
		}
		/******************** CmmnctnRqst_Rqster ********************************************************************************/
		if(communicationrequest.hasRequester()) {
			c.setCmmnctnRqstRqster(String.valueOf(communicationrequest.getRequester()));
		}
		/******************** communicationrequestmedium ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestmedium = communicationrequest.getMediumFirstRep();

		/******************** communicationrequestmediumcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestmediumcoding = communicationrequestmedium.getCodingFirstRep();

		/******************** CmmnctnRqst_Medium_Cdg_Dsply ********************************************************************************/
		if(communicationrequestmediumcoding.hasDisplay()) {
			c.setCmmnctnRqstMediumCdgDsply(String.valueOf(communicationrequestmediumcoding.getDisplay()));
		}
		/******************** CmmnctnRqst_Medium_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestmediumcoding.hasVersion()) {
			c.setCmmnctnRqstMediumCdgVrsn(String.valueOf(communicationrequestmediumcoding.getVersion()));
		}
		/******************** CmmnctnRqst_Medium_Cdg_Cd ********************************************************************************/
		if(communicationrequestmediumcoding.hasCode()) {
			c.setCmmnctnRqstMediumCdgCd(String.valueOf(communicationrequestmediumcoding.getCode()));
		}
		/******************** CmmnctnRqst_Medium_Cdg_Sys ********************************************************************************/
		if(communicationrequestmediumcoding.hasSystem()) {
			c.setCmmnctnRqstMediumCdgSys(String.valueOf(communicationrequestmediumcoding.getSystem()));
		}
		/******************** CmmnctnRqst_Medium_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestmediumcoding.hasUserSelected()) {
			c.setCmmnctnRqstMediumCdgUsrSltd(String.valueOf(communicationrequestmediumcoding.getUserSelected()));
		}
		/******************** CmmnctnRqst_Medium_Txt ********************************************************************************/
		if(communicationrequestmedium.hasText()) {
			c.setCmmnctnRqstMediumTxt(String.valueOf(communicationrequestmedium.getText()));
		}
		/******************** CmmnctnRqst_About ********************************************************************************/
		if(communicationrequest.hasAbout()) {
			c.setCmmnctnRqstAbout(String.valueOf(communicationrequest.getAboutFirstRep()));
		}
		/******************** communicationrequestpayload ********************************************************************************/
		org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestPayloadComponent communicationrequestpayload = communicationrequest.getPayloadFirstRep();

		/******************** CmmnctnRqst_Payload_CntntRfrnc ********************************************************************************/
		if(communicationrequestpayload.hasContentReference()) {
			c.setCmmnctnRqstPayloadCntntRfrnc(String.valueOf(communicationrequestpayload.getContentReference()));
		}
		/******************** communicationrequestpayloadcontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment communicationrequestpayloadcontentattachment = communicationrequestpayload.getContentAttachment();

		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Sz ********************************************************************************/
		if(communicationrequestpayloadcontentattachment.hasSize()) {
			c.setCmmnctnRqstPayloadCntntAttchmntSz(String.valueOf(communicationrequestpayloadcontentattachment.getSize()));
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Lnguage ********************************************************************************/
		if(communicationrequestpayloadcontentattachment.hasLanguage()) {
			c.setCmmnctnRqstPayloadCntntAttchmntLnguage(String.valueOf(communicationrequestpayloadcontentattachment.getLanguage()));
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(communicationrequestpayloadcontentattachment.hasContentType()) {
			c.setCmmnctnRqstPayloadCntntAttchmntCntntTyp(String.valueOf(communicationrequestpayloadcontentattachment.getContentType()));
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Url ********************************************************************************/
		if(communicationrequestpayloadcontentattachment.hasUrl()) {
			c.setCmmnctnRqstPayloadCntntAttchmntUrl(String.valueOf(communicationrequestpayloadcontentattachment.getUrl()));
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Ttl ********************************************************************************/
		if(communicationrequestpayloadcontentattachment.hasTitle()) {
			c.setCmmnctnRqstPayloadCntntAttchmntTtl(String.valueOf(communicationrequestpayloadcontentattachment.getTitle()));
		}
		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Hash ********************************************************************************/
		if(communicationrequestpayloadcontentattachment.hasHash()) {
			c.setCmmnctnRqstPayloadCntntAttchmntHash(String.valueOf(communicationrequestpayloadcontentattachment.getHash()));
		}

		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Data ********************************************************************************/
		if(communicationrequestpayloadcontentattachment.hasData()) {
			c.setCmmnctnRqstPayloadCntntAttchmntData(String.valueOf(communicationrequestpayloadcontentattachment.getData()));
		}

		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Creation ********************************************************************************/
		if(communicationrequestpayloadcontentattachment.hasCreation()) {
			c.setCmmnctnRqstPayloadCntntAttchmntCreation(String.valueOf(communicationrequestpayloadcontentattachment.getCreation()));
		}
		/******************** CmmnctnRqst_Payload_CntntStrgTyp ********************************************************************************/
		if(communicationrequestpayload.hasContentStringType()) {
			c.setCmmnctnRqstPayloadCntntStrgTyp(String.valueOf(communicationrequestpayload.getContentStringType()));
		}
		/******************** communicationrequestidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier communicationrequestidentifier = communicationrequest.getIdentifierFirstRep();

		/******************** CmmnctnRqst_Id_Vl ********************************************************************************/
		if(communicationrequestidentifier.hasValue()) {
			c.setCmmnctnRqstIdVl(String.valueOf(communicationrequestidentifier.getValue()));
		}
		/******************** communicationrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestidentifiertype = communicationrequestidentifier.getType();

		/******************** communicationrequestidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationrequestidentifiertypecoding = communicationrequestidentifiertype.getCodingFirstRep();

		/******************** CmmnctnRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(communicationrequestidentifiertypecoding.hasDisplay()) {
			c.setCmmnctnRqstIdTypCdgDsply(String.valueOf(communicationrequestidentifiertypecoding.getDisplay()));
		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestidentifiertypecoding.hasVersion()) {
			c.setCmmnctnRqstIdTypCdgVrsn(String.valueOf(communicationrequestidentifiertypecoding.getVersion()));
		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(communicationrequestidentifiertypecoding.hasCode()) {
			c.setCmmnctnRqstIdTypCdgCd(String.valueOf(communicationrequestidentifiertypecoding.getCode()));
		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(communicationrequestidentifiertypecoding.hasSystem()) {
			c.setCmmnctnRqstIdTypCdgSys(String.valueOf(communicationrequestidentifiertypecoding.getSystem()));
		}
		/******************** CmmnctnRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestidentifiertypecoding.hasUserSelected()) {
			c.setCmmnctnRqstIdTypCdgUsrSltd(String.valueOf(communicationrequestidentifiertypecoding.getUserSelected()));
		}
		/******************** CmmnctnRqst_Id_Typ_Txt ********************************************************************************/
		if(communicationrequestidentifiertype.hasText()) {
			c.setCmmnctnRqstIdTypTxt(String.valueOf(communicationrequestidentifiertype.getText()));
		}
		/******************** CmmnctnRqst_Id_Sys ********************************************************************************/
		if(communicationrequestidentifier.hasSystem()) {
			c.setCmmnctnRqstIdSys(String.valueOf(communicationrequestidentifier.getSystem()));
		}
		/******************** CmmnctnRqst_Id_Assigner ********************************************************************************/
		if(communicationrequestidentifier.hasAssigner()) {
			c.setCmmnctnRqstIdAssigner(String.valueOf(communicationrequestidentifier.getAssigner()));
		}
		/******************** communicationrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationrequestidentifierperiod = communicationrequestidentifier.getPeriod();

		/******************** CmmnctnRqst_Id_Prd_End ********************************************************************************/
		if(communicationrequestidentifierperiod.hasEnd()) {
			c.setCmmnctnRqstIdPrdEnd(String.valueOf(communicationrequestidentifierperiod.getEnd()));
		}
		/******************** CmmnctnRqst_Id_Prd_Strt ********************************************************************************/
		if(communicationrequestidentifierperiod.hasStart()) {
			c.setCmmnctnRqstIdPrdStrt(String.valueOf(communicationrequestidentifierperiod.getStart()));
		}
		/******************** communicationrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse communicationrequestidentifieruse = communicationrequestidentifier.getUse();
		c.setCmmnctnRqstIdUse(communicationrequestidentifieruse.toCode());

		/******************** CmmnctnRqst_Sender ********************************************************************************/
		if(communicationrequest.hasSender()) {
			c.setCmmnctnRqstSender(String.valueOf(communicationrequest.getSender()));
		}
		/******************** CmmnctnRqst_DoNotPerform ********************************************************************************/
		if(communicationrequest.hasDoNotPerform()) {
			c.setCmmnctnRqstDoNotPerform(String.valueOf(communicationrequest.getDoNotPerform()));
		}
		return c;
	}
}
