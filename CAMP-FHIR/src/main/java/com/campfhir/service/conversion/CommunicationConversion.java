package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Communication;
public class CommunicationConversion 
{
	public org.hl7.fhir.r4.model.Communication Communications(Communication c) throws ParseException
	{
		org.hl7.fhir.r4.model.Communication communication = new org.hl7.fhir.r4.model.Communication();

		/******************** id ********************************************************************************/
		communication.setId(c.getId());

		/******************** Cmmnctn_About ********************************************************************************/
		if(c.getCmmnctnAbout() != null) {
			communication.addAbout( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnAbout()));
		}
		/******************** Cmmnctn_BasedOn ********************************************************************************/
		if(c.getCmmnctnBasedOn() != null) {
			communication.addBasedOn( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnBasedOn()));
		}
		/******************** communicationcategory ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationcategory =  new org.hl7.fhir.r4.model.CodeableConcept();
		communication.addCategory(communicationcategory);

		/******************** communicationcategorycoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationcategorycoding =  new org.hl7.fhir.r4.model.Coding();
		communicationcategory.addCoding(communicationcategorycoding);

		/******************** Cmmnctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnCtgryCdgCd() != null) {
			communicationcategorycoding.setCode(c.getCmmnctnCtgryCdgCd());
		}
		/******************** Cmmnctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnCtgryCdgDsply() != null) {
			communicationcategorycoding.setDisplay(c.getCmmnctnCtgryCdgDsply());
		}
		/******************** Cmmnctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnCtgryCdgSys() != null) {
			communicationcategorycoding.setSystem(c.getCmmnctnCtgryCdgSys());
		}
		/******************** Cmmnctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnCtgryCdgUsrSltd() != null) {
			communicationcategorycoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnCtgryCdgUsrSltd()));
		}
		/******************** Cmmnctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnCtgryCdgVrsn() != null) {
			communicationcategorycoding.setVersion(c.getCmmnctnCtgryCdgVrsn());
		}
		/******************** Cmmnctn_Ctgry_Txt ********************************************************************************/
		if(c.getCmmnctnCtgryTxt() != null) {
			communicationcategory.setText(c.getCmmnctnCtgryTxt());
		}
		/******************** Cmmnctn_Enc ********************************************************************************/
		if(c.getCmmnctnEnc() != null) {
			communication.setEncounter( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnEnc()));
		}
		/******************** communicationidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier communicationidentifier =  new org.hl7.fhir.r4.model.Identifier();
		communication.addIdentifier(communicationidentifier);

		/******************** Cmmnctn_Id_Assigner ********************************************************************************/
		if(c.getCmmnctnIdAssigner() != null) {
			communicationidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnIdAssigner()));
		}
		/******************** communicationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		communicationidentifier.setPeriod(communicationidentifierperiod);

		/******************** Cmmnctn_Id_Prd_End ********************************************************************************/
		if(c.getCmmnctnIdPrdEnd() != null) {
			java.text.SimpleDateFormat Cmmnctn_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmmnctn_Id_Prd_Enddate = Cmmnctn_Id_Prd_Endsdf.parse(c.getCmmnctnIdPrdEnd());
			communicationidentifierperiod.setEnd(Cmmnctn_Id_Prd_Enddate);
		}
		/******************** Cmmnctn_Id_Prd_Strt ********************************************************************************/
		if(c.getCmmnctnIdPrdStrt() != null) {
			java.text.SimpleDateFormat Cmmnctn_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmmnctn_Id_Prd_Strtdate = Cmmnctn_Id_Prd_Strtsdf.parse(c.getCmmnctnIdPrdStrt());
			communicationidentifierperiod.setStart(Cmmnctn_Id_Prd_Strtdate);
		}
		/******************** Cmmnctn_Id_Sys ********************************************************************************/
		if(c.getCmmnctnIdSys() != null) {
			communicationidentifier.setSystem(c.getCmmnctnIdSys());
		}
		/******************** communicationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		communicationidentifier.setType(communicationidentifiertype);

		/******************** communicationidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		communicationidentifiertype.addCoding(communicationidentifiertypecoding);

		/******************** Cmmnctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnIdTypCdgCd() != null) {
			communicationidentifiertypecoding.setCode(c.getCmmnctnIdTypCdgCd());
		}
		/******************** Cmmnctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnIdTypCdgDsply() != null) {
			communicationidentifiertypecoding.setDisplay(c.getCmmnctnIdTypCdgDsply());
		}
		/******************** Cmmnctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnIdTypCdgSys() != null) {
			communicationidentifiertypecoding.setSystem(c.getCmmnctnIdTypCdgSys());
		}
		/******************** Cmmnctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnIdTypCdgUsrSltd() != null) {
			communicationidentifiertypecoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnIdTypCdgUsrSltd()));
		}
		/******************** Cmmnctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnIdTypCdgVrsn() != null) {
			communicationidentifiertypecoding.setVersion(c.getCmmnctnIdTypCdgVrsn());
		}
		/******************** Cmmnctn_Id_Typ_Txt ********************************************************************************/
		if(c.getCmmnctnIdTypTxt() != null) {
			communicationidentifiertype.setText(c.getCmmnctnIdTypTxt());
		}
		/******************** communicationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory communicationidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		communicationidentifier.setUse(communicationidentifieruse.fromCode(c.getCmmnctnIdUse()));

		/******************** Cmmnctn_Id_Vl ********************************************************************************/
		if(c.getCmmnctnIdVl() != null) {
			communicationidentifier.setValue(c.getCmmnctnIdVl());
		}
		/******************** Cmmnctn_InRspsTo ********************************************************************************/
		if(c.getCmmnctnInRspsTo() != null) {
			communication.addInResponseTo( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnInRspsTo()));
		}
		/******************** Cmmnctn_InstantiatesCanonical ********************************************************************************/
		if(c.getCmmnctnInstantiatesCanonical() != null) {
			communication.addInstantiatesCanonical(c.getCmmnctnInstantiatesCanonical());
		}
		/******************** Cmmnctn_InstantiatesUri ********************************************************************************/
		if(c.getCmmnctnInstantiatesUri() != null) {
			communication.addInstantiatesUri(c.getCmmnctnInstantiatesUri());
		}
		/******************** communicationmedium ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationmedium =  new org.hl7.fhir.r4.model.CodeableConcept();
		communication.addMedium(communicationmedium);

		/******************** communicationmediumcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationmediumcoding =  new org.hl7.fhir.r4.model.Coding();
		communicationmedium.addCoding(communicationmediumcoding);

		/******************** Cmmnctn_Medium_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnMediumCdgCd() != null) {
			communicationmediumcoding.setCode(c.getCmmnctnMediumCdgCd());
		}
		/******************** Cmmnctn_Medium_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnMediumCdgDsply() != null) {
			communicationmediumcoding.setDisplay(c.getCmmnctnMediumCdgDsply());
		}
		/******************** Cmmnctn_Medium_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnMediumCdgSys() != null) {
			communicationmediumcoding.setSystem(c.getCmmnctnMediumCdgSys());
		}
		/******************** Cmmnctn_Medium_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnMediumCdgUsrSltd() != null) {
			communicationmediumcoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnMediumCdgUsrSltd()));
		}
		/******************** Cmmnctn_Medium_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnMediumCdgVrsn() != null) {
			communicationmediumcoding.setVersion(c.getCmmnctnMediumCdgVrsn());
		}
		/******************** Cmmnctn_Medium_Txt ********************************************************************************/
		if(c.getCmmnctnMediumTxt() != null) {
			communicationmedium.setText(c.getCmmnctnMediumTxt());
		}
		/******************** communicationnote ********************************************************************************/
		org.hl7.fhir.r4.model.Annotation communicationnote =  new org.hl7.fhir.r4.model.Annotation();
		communication.addNote(communicationnote);

		/******************** Cmmnctn_Nt_AthrRfrnc ********************************************************************************/
		if(c.getCmmnctnNtAthrRfrnc() != null) {
			communicationnote.setAuthor( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnNtAthrRfrnc()));
		}
		/******************** Cmmnctn_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getCmmnctnNtAthrStrgTyp() != null) {
			communicationnote.setAuthor( new org.hl7.fhir.r4.model.StringType(c.getCmmnctnNtAthrStrgTyp()));
		}
		/******************** Cmmnctn_Nt_Txt ********************************************************************************/
		if(c.getCmmnctnNtTxt() != null) {
			communicationnote.setText(c.getCmmnctnNtTxt());
		}
		/******************** Cmmnctn_Nt_Time ********************************************************************************/
		if(c.getCmmnctnNtTime() != null) {
			java.text.SimpleDateFormat Cmmnctn_Nt_Timesdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmmnctn_Nt_Timedate = Cmmnctn_Nt_Timesdf.parse(c.getCmmnctnNtTime());
			communicationnote.setTime(Cmmnctn_Nt_Timedate);
		}
		/******************** Cmmnctn_PartOf ********************************************************************************/
		if(c.getCmmnctnPartOf() != null) {
			communication.addPartOf( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnPartOf()));
		}
		/******************** communicationpayload ********************************************************************************/
		org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent communicationpayload =  new org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent();
		communication.addPayload(communicationpayload);

		/******************** communicationpayloadcontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment communicationpayloadcontentattachment =  new org.hl7.fhir.r4.model.Attachment();
		communicationpayload.setContent(communicationpayloadcontentattachment);

		/******************** Cmmnctn_Payload_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntCntntTyp() != null) {
			communicationpayloadcontentattachment.setContentType(c.getCmmnctnPayloadCntntAttchmntCntntTyp());
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Creation ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntCreation() != null) {
			java.text.SimpleDateFormat Cmmnctn_Payload_CntntAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmmnctn_Payload_CntntAttchmnt_Creationdate = Cmmnctn_Payload_CntntAttchmnt_Creationsdf.parse(c.getCmmnctnPayloadCntntAttchmntCreation());
			communicationpayloadcontentattachment.setCreation(Cmmnctn_Payload_CntntAttchmnt_Creationdate);
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Data ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntData() != null) {
			communicationpayloadcontentattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCmmnctnPayloadCntntAttchmntData()));
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Hash ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntHash() != null) {
			communicationpayloadcontentattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(c.getCmmnctnPayloadCntntAttchmntHash()));
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Lnguage ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntLnguage() != null) {
			communicationpayloadcontentattachment.setLanguage(c.getCmmnctnPayloadCntntAttchmntLnguage());
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Sz ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntSz() != null) {
			communicationpayloadcontentattachment.setSize(Integer.parseInt(c.getCmmnctnPayloadCntntAttchmntSz()));
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Ttl ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntTtl() != null) {
			communicationpayloadcontentattachment.setTitle(c.getCmmnctnPayloadCntntAttchmntTtl());
		}
		/******************** Cmmnctn_Payload_CntntAttchmnt_Url ********************************************************************************/
		if(c.getCmmnctnPayloadCntntAttchmntUrl() != null) {
			communicationpayloadcontentattachment.setUrl(c.getCmmnctnPayloadCntntAttchmntUrl());
		}
		/******************** Cmmnctn_Payload_CntntRfrnc ********************************************************************************/
		if(c.getCmmnctnPayloadCntntRfrnc() != null) {
			communicationpayload.setContent( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnPayloadCntntRfrnc()));
		}
		/******************** Cmmnctn_Payload_CntntStrgTyp ********************************************************************************/
		if(c.getCmmnctnPayloadCntntStrgTyp() != null) {
			communicationpayload.setContent( new org.hl7.fhir.r4.model.StringType(c.getCmmnctnPayloadCntntStrgTyp()));
		}
		/******************** communicationpriority ********************************************************************************/
		org.hl7.fhir.r4.model.Communication.CommunicationPriorityEnumFactory communicationpriority =  new org.hl7.fhir.r4.model.Communication.CommunicationPriorityEnumFactory();
		communication.setPriority(communicationpriority.fromCode(c.getCmmnctnPriority()));

		/******************** communicationreasoncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationreasoncode =  new org.hl7.fhir.r4.model.CodeableConcept();
		communication.addReasonCode(communicationreasoncode);

		/******************** communicationreasoncodecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationreasoncodecoding =  new org.hl7.fhir.r4.model.Coding();
		communicationreasoncode.addCoding(communicationreasoncodecoding);

		/******************** Cmmnctn_RsnCd_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgCd() != null) {
			communicationreasoncodecoding.setCode(c.getCmmnctnRsnCdCdgCd());
		}
		/******************** Cmmnctn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgDsply() != null) {
			communicationreasoncodecoding.setDisplay(c.getCmmnctnRsnCdCdgDsply());
		}
		/******************** Cmmnctn_RsnCd_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgSys() != null) {
			communicationreasoncodecoding.setSystem(c.getCmmnctnRsnCdCdgSys());
		}
		/******************** Cmmnctn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgUsrSltd() != null) {
			communicationreasoncodecoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnRsnCdCdgUsrSltd()));
		}
		/******************** Cmmnctn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnRsnCdCdgVrsn() != null) {
			communicationreasoncodecoding.setVersion(c.getCmmnctnRsnCdCdgVrsn());
		}
		/******************** Cmmnctn_RsnCd_Txt ********************************************************************************/
		if(c.getCmmnctnRsnCdTxt() != null) {
			communicationreasoncode.setText(c.getCmmnctnRsnCdTxt());
		}
		/******************** Cmmnctn_RsnRfrnc ********************************************************************************/
		if(c.getCmmnctnRsnRfrnc() != null) {
			communication.addReasonReference( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRsnRfrnc()));
		}
		/******************** Cmmnctn_Received ********************************************************************************/
		if(c.getCmmnctnReceived() != null) {
			java.text.SimpleDateFormat Cmmnctn_Receivedsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmmnctn_Receiveddate = Cmmnctn_Receivedsdf.parse(c.getCmmnctnReceived());
			communication.setReceived(Cmmnctn_Receiveddate);
		}
		/******************** Cmmnctn_Recipient ********************************************************************************/
		if(c.getCmmnctnRecipient() != null) {
			communication.addRecipient( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnRecipient()));
		}
		/******************** Cmmnctn_Sender ********************************************************************************/
		if(c.getCmmnctnSender() != null) {
			communication.setSender( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnSender()));
		}
		/******************** Cmmnctn_Sent ********************************************************************************/
		if(c.getCmmnctnSent() != null) {
			java.text.SimpleDateFormat Cmmnctn_Sentsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Cmmnctn_Sentdate = Cmmnctn_Sentsdf.parse(c.getCmmnctnSent());
			communication.setSent(Cmmnctn_Sentdate);
		}
		/******************** communicationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Communication.CommunicationStatusEnumFactory communicationstatus =  new org.hl7.fhir.r4.model.Communication.CommunicationStatusEnumFactory();
		communication.setStatus(communicationstatus.fromCode(c.getCmmnctnSts()));

		/******************** communicationstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationstatusreason =  new org.hl7.fhir.r4.model.CodeableConcept();
		communication.setStatusReason(communicationstatusreason);

		/******************** communicationstatusreasoncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationstatusreasoncoding =  new org.hl7.fhir.r4.model.Coding();
		communicationstatusreason.addCoding(communicationstatusreasoncoding);

		/******************** Cmmnctn_StsRsn_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgCd() != null) {
			communicationstatusreasoncoding.setCode(c.getCmmnctnStsRsnCdgCd());
		}
		/******************** Cmmnctn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgDsply() != null) {
			communicationstatusreasoncoding.setDisplay(c.getCmmnctnStsRsnCdgDsply());
		}
		/******************** Cmmnctn_StsRsn_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgSys() != null) {
			communicationstatusreasoncoding.setSystem(c.getCmmnctnStsRsnCdgSys());
		}
		/******************** Cmmnctn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgUsrSltd() != null) {
			communicationstatusreasoncoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnStsRsnCdgUsrSltd()));
		}
		/******************** Cmmnctn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnStsRsnCdgVrsn() != null) {
			communicationstatusreasoncoding.setVersion(c.getCmmnctnStsRsnCdgVrsn());
		}
		/******************** Cmmnctn_StsRsn_Txt ********************************************************************************/
		if(c.getCmmnctnStsRsnTxt() != null) {
			communicationstatusreason.setText(c.getCmmnctnStsRsnTxt());
		}
		/******************** Cmmnctn_Sbjct ********************************************************************************/
		if(c.getCmmnctnSbjct() != null) {
			communication.setSubject( new org.hl7.fhir.r4.model.Reference(c.getCmmnctnSbjct()));
		}
		/******************** communicationtopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationtopic =  new org.hl7.fhir.r4.model.CodeableConcept();
		communication.setTopic(communicationtopic);

		/******************** communicationtopiccoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding communicationtopiccoding =  new org.hl7.fhir.r4.model.Coding();
		communicationtopic.addCoding(communicationtopiccoding);

		/******************** Cmmnctn_Topic_Cdg_Cd ********************************************************************************/
		if(c.getCmmnctnTopicCdgCd() != null) {
			communicationtopiccoding.setCode(c.getCmmnctnTopicCdgCd());
		}
		/******************** Cmmnctn_Topic_Cdg_Dsply ********************************************************************************/
		if(c.getCmmnctnTopicCdgDsply() != null) {
			communicationtopiccoding.setDisplay(c.getCmmnctnTopicCdgDsply());
		}
		/******************** Cmmnctn_Topic_Cdg_Sys ********************************************************************************/
		if(c.getCmmnctnTopicCdgSys() != null) {
			communicationtopiccoding.setSystem(c.getCmmnctnTopicCdgSys());
		}
		/******************** Cmmnctn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(c.getCmmnctnTopicCdgUsrSltd() != null) {
			communicationtopiccoding.setUserSelected(Boolean.parseBoolean(c.getCmmnctnTopicCdgUsrSltd()));
		}
		/******************** Cmmnctn_Topic_Cdg_Vrsn ********************************************************************************/
		if(c.getCmmnctnTopicCdgVrsn() != null) {
			communicationtopiccoding.setVersion(c.getCmmnctnTopicCdgVrsn());
		}
		/******************** Cmmnctn_Topic_Txt ********************************************************************************/
		if(c.getCmmnctnTopicTxt() != null) {
			communicationtopic.setText(c.getCmmnctnTopicTxt());
		}
		return communication;
	}
}
