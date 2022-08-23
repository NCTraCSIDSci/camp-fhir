package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.CommunicationRequest;
public class CommunicationRequestBidirectionalConversion 
{
	public CommunicationRequest CommunicationRequests(org.hl7.fhir.r4.model.CommunicationRequest communicationrequest) throws ParseException
	{
		 main.java.com.campfhir.model.CommunicationRequest c = new  main.java.com.campfhir.model.CommunicationRequest();

		/******************** id ********************************************************************************/
		c.setId(communicationrequest.getIdElement().getIdPart());

		/******************** communicationrequestpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CommunicationRequest.CommunicationPriority communicationrequestpriority = communicationrequest.getPriority();
		if(communicationrequestpriority!=null) {
			c.addCmmnctnRqstPriority(communicationrequestpriority.toCode());
		} else {
			c.addCmmnctnRqstPriority("NULL");
		}

		/******************** communicationrequestpayload ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestPayloadComponent> communicationrequestpayloadlist = communicationrequest.getPayload();
		for(int communicationrequestpayloadi = 0; communicationrequestpayloadi<communicationrequestpayloadlist.size();communicationrequestpayloadi++ ) {
		org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestPayloadComponent  communicationrequestpayload = communicationrequestpayloadlist.get(communicationrequestpayloadi);

		/******************** CmmnctnRqst_Payload_CntntRfrnc ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntRfrnc("[");}
		if(communicationrequestpayload.hasContentReference()) {

			if(communicationrequestpayload.getContentReference().getReference() != null) {
			c.addCmmnctnRqstPayloadCntntRfrnc(communicationrequestpayload.getContentReference().getReference());
			}
		} else {
			c.addCmmnctnRqstPayloadCntntRfrnc("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntRfrnc("]");}


		/******************** communicationrequestpayloadcontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment communicationrequestpayloadcontentattachment = communicationrequestpayload.getContentAttachment();

		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Sz ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntAttchmntSz("[");}
		if(communicationrequestpayloadcontentattachment.hasSize()) {

			c.addCmmnctnRqstPayloadCntntAttchmntSz(String.valueOf(communicationrequestpayloadcontentattachment.getSize()));
		} else {
			c.addCmmnctnRqstPayloadCntntAttchmntSz("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntAttchmntSz("]");}


		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Lnguage ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntAttchmntLnguage("[");}
		if(communicationrequestpayloadcontentattachment.hasLanguage()) {

			c.addCmmnctnRqstPayloadCntntAttchmntLnguage(String.valueOf(communicationrequestpayloadcontentattachment.getLanguage()));
		} else {
			c.addCmmnctnRqstPayloadCntntAttchmntLnguage("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntAttchmntLnguage("]");}


		/******************** CmmnctnRqst_Payload_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntAttchmntCntntTyp("[");}
		if(communicationrequestpayloadcontentattachment.hasContentType()) {

			c.addCmmnctnRqstPayloadCntntAttchmntCntntTyp(String.valueOf(communicationrequestpayloadcontentattachment.getContentType()));
		} else {
			c.addCmmnctnRqstPayloadCntntAttchmntCntntTyp("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntAttchmntCntntTyp("]");}


		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Hash ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntAttchmntHash("[");}
		if(communicationrequestpayloadcontentattachment.hasHash()) {

			c.addCmmnctnRqstPayloadCntntAttchmntHash(new String(communicationrequestpayloadcontentattachment.getHash()));
		} else {
			c.addCmmnctnRqstPayloadCntntAttchmntHash("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntAttchmntHash("]");}


		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Data ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntAttchmntData("[");}
		if(communicationrequestpayloadcontentattachment.hasData()) {

			c.addCmmnctnRqstPayloadCntntAttchmntData(new String(communicationrequestpayloadcontentattachment.getData()));
		} else {
			c.addCmmnctnRqstPayloadCntntAttchmntData("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntAttchmntData("]");}


		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Creation ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntAttchmntCreation("[");}
		if(communicationrequestpayloadcontentattachment.hasCreation()) {

			c.addCmmnctnRqstPayloadCntntAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationrequestpayloadcontentattachment.getCreation())+"\"");
		} else {
			c.addCmmnctnRqstPayloadCntntAttchmntCreation("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntAttchmntCreation("]");}


		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Ttl ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntAttchmntTtl("[");}
		if(communicationrequestpayloadcontentattachment.hasTitle()) {

			c.addCmmnctnRqstPayloadCntntAttchmntTtl(String.valueOf(communicationrequestpayloadcontentattachment.getTitle()));
		} else {
			c.addCmmnctnRqstPayloadCntntAttchmntTtl("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntAttchmntTtl("]");}


		/******************** CmmnctnRqst_Payload_CntntAttchmnt_Url ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntAttchmntUrl("[");}
		if(communicationrequestpayloadcontentattachment.hasUrl()) {

			c.addCmmnctnRqstPayloadCntntAttchmntUrl(String.valueOf(communicationrequestpayloadcontentattachment.getUrl()));
		} else {
			c.addCmmnctnRqstPayloadCntntAttchmntUrl("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntAttchmntUrl("]");}


		/******************** CmmnctnRqst_Payload_CntntStrgTyp ********************************************************************************/
		if(communicationrequestpayloadi == 0) {c.addCmmnctnRqstPayloadCntntStrgTyp("[");}
		if(communicationrequestpayload.hasContentStringType()) {

			c.addCmmnctnRqstPayloadCntntStrgTyp("\""+communicationrequestpayload.getContentStringType().getValueAsString()+"\"");
		} else {
			c.addCmmnctnRqstPayloadCntntStrgTyp("NULL");
		}

		if(communicationrequestpayloadi == communicationrequestpayloadlist.size()-1) {c.addCmmnctnRqstPayloadCntntStrgTyp("]");}


		 };
		/******************** CmmnctnRqst_Sbjct ********************************************************************************/
		if(communicationrequest.hasSubject()) {

			if(communicationrequest.getSubject().getReference() != null) {
			c.addCmmnctnRqstSbjct(communicationrequest.getSubject().getReference());
			}
		} else {
			c.addCmmnctnRqstSbjct("NULL");
		}


		/******************** communicationrequeststatus ********************************************************************************/
		org.hl7.fhir.r4.model.CommunicationRequest.CommunicationRequestStatus communicationrequeststatus = communicationrequest.getStatus();
		if(communicationrequeststatus!=null) {
			c.addCmmnctnRqstSts(communicationrequeststatus.toCode());
		} else {
			c.addCmmnctnRqstSts("NULL");
		}

		/******************** CmmnctnRqst_Enc ********************************************************************************/
		if(communicationrequest.hasEncounter()) {

			if(communicationrequest.getEncounter().getReference() != null) {
			c.addCmmnctnRqstEnc(communicationrequest.getEncounter().getReference());
			}
		} else {
			c.addCmmnctnRqstEnc("NULL");
		}


		/******************** CmmnctnRqst_BasedOn ********************************************************************************/
		if(communicationrequest.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<communicationrequest.getBasedOn().size(); incr++) {
				array = array + communicationrequest.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnRqstBasedOn(array);

		} else {
			c.addCmmnctnRqstBasedOn("NULL");
		}


		/******************** communicationrequestreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> communicationrequestreasoncodelist = communicationrequest.getReasonCode();
		for(int communicationrequestreasoncodei = 0; communicationrequestreasoncodei<communicationrequestreasoncodelist.size();communicationrequestreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  communicationrequestreasoncode = communicationrequestreasoncodelist.get(communicationrequestreasoncodei);

		/******************** CmmnctnRqst_RsnCd_Txt ********************************************************************************/
		if(communicationrequestreasoncodei == 0) {c.addCmmnctnRqstRsnCdTxt("[");}
		if(communicationrequestreasoncode.hasText()) {

			c.addCmmnctnRqstRsnCdTxt(String.valueOf(communicationrequestreasoncode.getText()));
		} else {
			c.addCmmnctnRqstRsnCdTxt("NULL");
		}

		if(communicationrequestreasoncodei == communicationrequestreasoncodelist.size()-1) {c.addCmmnctnRqstRsnCdTxt("]");}


		/******************** communicationrequestreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationrequestreasoncodecodinglist = communicationrequestreasoncode.getCoding();
		for(int communicationrequestreasoncodecodingi = 0; communicationrequestreasoncodecodingi<communicationrequestreasoncodecodinglist.size();communicationrequestreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationrequestreasoncodecoding = communicationrequestreasoncodecodinglist.get(communicationrequestreasoncodecodingi);

		/******************** CmmnctnRqst_RsnCd_Cdg_Dsply ********************************************************************************/
		if(communicationrequestreasoncodecodingi == 0) {c.addCmmnctnRqstRsnCdCdgDsply("[[");}
		if(communicationrequestreasoncodecoding.hasDisplay()) {

			c.addCmmnctnRqstRsnCdCdgDsply(String.valueOf(communicationrequestreasoncodecoding.getDisplay()));
		} else {
			c.addCmmnctnRqstRsnCdCdgDsply("NULL");
		}

		if(communicationrequestreasoncodecodingi == communicationrequestreasoncodecodinglist.size()-1) {c.addCmmnctnRqstRsnCdCdgDsply("]]");}


		/******************** CmmnctnRqst_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestreasoncodecodingi == 0) {c.addCmmnctnRqstRsnCdCdgVrsn("[[");}
		if(communicationrequestreasoncodecoding.hasVersion()) {

			c.addCmmnctnRqstRsnCdCdgVrsn(String.valueOf(communicationrequestreasoncodecoding.getVersion()));
		} else {
			c.addCmmnctnRqstRsnCdCdgVrsn("NULL");
		}

		if(communicationrequestreasoncodecodingi == communicationrequestreasoncodecodinglist.size()-1) {c.addCmmnctnRqstRsnCdCdgVrsn("]]");}


		/******************** CmmnctnRqst_RsnCd_Cdg_Cd ********************************************************************************/
		if(communicationrequestreasoncodecodingi == 0) {c.addCmmnctnRqstRsnCdCdgCd("[[");}
		if(communicationrequestreasoncodecoding.hasCode()) {

			c.addCmmnctnRqstRsnCdCdgCd(String.valueOf(communicationrequestreasoncodecoding.getCode()));
		} else {
			c.addCmmnctnRqstRsnCdCdgCd("NULL");
		}

		if(communicationrequestreasoncodecodingi == communicationrequestreasoncodecodinglist.size()-1) {c.addCmmnctnRqstRsnCdCdgCd("]]");}


		/******************** CmmnctnRqst_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestreasoncodecodingi == 0) {c.addCmmnctnRqstRsnCdCdgUsrSltd("[[");}
		if(communicationrequestreasoncodecoding.hasUserSelected()) {

			c.addCmmnctnRqstRsnCdCdgUsrSltd(String.valueOf(communicationrequestreasoncodecoding.getUserSelected()));
		} else {
			c.addCmmnctnRqstRsnCdCdgUsrSltd("NULL");
		}

		if(communicationrequestreasoncodecodingi == communicationrequestreasoncodecodinglist.size()-1) {c.addCmmnctnRqstRsnCdCdgUsrSltd("]]");}


		/******************** CmmnctnRqst_RsnCd_Cdg_Sys ********************************************************************************/
		if(communicationrequestreasoncodecodingi == 0) {c.addCmmnctnRqstRsnCdCdgSys("[[");}
		if(communicationrequestreasoncodecoding.hasSystem()) {

			c.addCmmnctnRqstRsnCdCdgSys(String.valueOf(communicationrequestreasoncodecoding.getSystem()));
		} else {
			c.addCmmnctnRqstRsnCdCdgSys("NULL");
		}

		if(communicationrequestreasoncodecodingi == communicationrequestreasoncodecodinglist.size()-1) {c.addCmmnctnRqstRsnCdCdgSys("]]");}


		 };
		 };
		/******************** communicationrequestnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> communicationrequestnotelist = communicationrequest.getNote();
		for(int communicationrequestnotei = 0; communicationrequestnotei<communicationrequestnotelist.size();communicationrequestnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  communicationrequestnote = communicationrequestnotelist.get(communicationrequestnotei);

		/******************** CmmnctnRqst_Nt_Time ********************************************************************************/
		if(communicationrequestnotei == 0) {c.addCmmnctnRqstNtTime("[");}
		if(communicationrequestnote.hasTime()) {

			c.addCmmnctnRqstNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationrequestnote.getTime())+"\"");
		} else {
			c.addCmmnctnRqstNtTime("NULL");
		}

		if(communicationrequestnotei == communicationrequestnotelist.size()-1) {c.addCmmnctnRqstNtTime("]");}


		/******************** CmmnctnRqst_Nt_AthrRfrnc ********************************************************************************/
		if(communicationrequestnotei == 0) {c.addCmmnctnRqstNtAthrRfrnc("[");}
		if(communicationrequestnote.hasAuthorReference()) {

			if(communicationrequestnote.getAuthorReference().getReference() != null) {
			c.addCmmnctnRqstNtAthrRfrnc(communicationrequestnote.getAuthorReference().getReference());
			}
		} else {
			c.addCmmnctnRqstNtAthrRfrnc("NULL");
		}

		if(communicationrequestnotei == communicationrequestnotelist.size()-1) {c.addCmmnctnRqstNtAthrRfrnc("]");}


		/******************** CmmnctnRqst_Nt_Txt ********************************************************************************/
		if(communicationrequestnotei == 0) {c.addCmmnctnRqstNtTxt("[");}
		if(communicationrequestnote.hasText()) {

			c.addCmmnctnRqstNtTxt(String.valueOf(communicationrequestnote.getText()));
		} else {
			c.addCmmnctnRqstNtTxt("NULL");
		}

		if(communicationrequestnotei == communicationrequestnotelist.size()-1) {c.addCmmnctnRqstNtTxt("]");}


		/******************** CmmnctnRqst_Nt_AthrStrgTyp ********************************************************************************/
		if(communicationrequestnotei == 0) {c.addCmmnctnRqstNtAthrStrgTyp("[");}
		if(communicationrequestnote.hasAuthorStringType()) {

			c.addCmmnctnRqstNtAthrStrgTyp("\""+communicationrequestnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			c.addCmmnctnRqstNtAthrStrgTyp("NULL");
		}

		if(communicationrequestnotei == communicationrequestnotelist.size()-1) {c.addCmmnctnRqstNtAthrStrgTyp("]");}


		 };
		/******************** CmmnctnRqst_RsnRfrnc ********************************************************************************/
		if(communicationrequest.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<communicationrequest.getReasonReference().size(); incr++) {
				array = array + communicationrequest.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnRqstRsnRfrnc(array);

		} else {
			c.addCmmnctnRqstRsnRfrnc("NULL");
		}


		/******************** communicationrequestidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> communicationrequestidentifierlist = communicationrequest.getIdentifier();
		for(int communicationrequestidentifieri = 0; communicationrequestidentifieri<communicationrequestidentifierlist.size();communicationrequestidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  communicationrequestidentifier = communicationrequestidentifierlist.get(communicationrequestidentifieri);

		/******************** CmmnctnRqst_Id_Vl ********************************************************************************/
		if(communicationrequestidentifieri == 0) {c.addCmmnctnRqstIdVl("[");}
		if(communicationrequestidentifier.hasValue()) {

			c.addCmmnctnRqstIdVl(String.valueOf(communicationrequestidentifier.getValue()));
		} else {
			c.addCmmnctnRqstIdVl("NULL");
		}

		if(communicationrequestidentifieri == communicationrequestidentifierlist.size()-1) {c.addCmmnctnRqstIdVl("]");}


		/******************** communicationrequestidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestidentifiertype = communicationrequestidentifier.getType();

		/******************** CmmnctnRqst_Id_Typ_Txt ********************************************************************************/
		if(communicationrequestidentifieri == 0) {c.addCmmnctnRqstIdTypTxt("[");}
		if(communicationrequestidentifiertype.hasText()) {

			c.addCmmnctnRqstIdTypTxt(String.valueOf(communicationrequestidentifiertype.getText()));
		} else {
			c.addCmmnctnRqstIdTypTxt("NULL");
		}

		if(communicationrequestidentifieri == communicationrequestidentifierlist.size()-1) {c.addCmmnctnRqstIdTypTxt("]");}


		/******************** communicationrequestidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationrequestidentifiertypecodinglist = communicationrequestidentifiertype.getCoding();
		for(int communicationrequestidentifiertypecodingi = 0; communicationrequestidentifiertypecodingi<communicationrequestidentifiertypecodinglist.size();communicationrequestidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationrequestidentifiertypecoding = communicationrequestidentifiertypecodinglist.get(communicationrequestidentifiertypecodingi);

		/******************** CmmnctnRqst_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(communicationrequestidentifiertypecodingi == 0) {c.addCmmnctnRqstIdTypCdgDsply("[[");}
		if(communicationrequestidentifiertypecoding.hasDisplay()) {

			c.addCmmnctnRqstIdTypCdgDsply(String.valueOf(communicationrequestidentifiertypecoding.getDisplay()));
		} else {
			c.addCmmnctnRqstIdTypCdgDsply("NULL");
		}

		if(communicationrequestidentifiertypecodingi == communicationrequestidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstIdTypCdgDsply("]]");}


		/******************** CmmnctnRqst_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestidentifiertypecodingi == 0) {c.addCmmnctnRqstIdTypCdgVrsn("[[");}
		if(communicationrequestidentifiertypecoding.hasVersion()) {

			c.addCmmnctnRqstIdTypCdgVrsn(String.valueOf(communicationrequestidentifiertypecoding.getVersion()));
		} else {
			c.addCmmnctnRqstIdTypCdgVrsn("NULL");
		}

		if(communicationrequestidentifiertypecodingi == communicationrequestidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstIdTypCdgVrsn("]]");}


		/******************** CmmnctnRqst_Id_Typ_Cdg_Cd ********************************************************************************/
		if(communicationrequestidentifiertypecodingi == 0) {c.addCmmnctnRqstIdTypCdgCd("[[");}
		if(communicationrequestidentifiertypecoding.hasCode()) {

			c.addCmmnctnRqstIdTypCdgCd(String.valueOf(communicationrequestidentifiertypecoding.getCode()));
		} else {
			c.addCmmnctnRqstIdTypCdgCd("NULL");
		}

		if(communicationrequestidentifiertypecodingi == communicationrequestidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstIdTypCdgCd("]]");}


		/******************** CmmnctnRqst_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestidentifiertypecodingi == 0) {c.addCmmnctnRqstIdTypCdgUsrSltd("[[");}
		if(communicationrequestidentifiertypecoding.hasUserSelected()) {

			c.addCmmnctnRqstIdTypCdgUsrSltd(String.valueOf(communicationrequestidentifiertypecoding.getUserSelected()));
		} else {
			c.addCmmnctnRqstIdTypCdgUsrSltd("NULL");
		}

		if(communicationrequestidentifiertypecodingi == communicationrequestidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstIdTypCdgUsrSltd("]]");}


		/******************** CmmnctnRqst_Id_Typ_Cdg_Sys ********************************************************************************/
		if(communicationrequestidentifiertypecodingi == 0) {c.addCmmnctnRqstIdTypCdgSys("[[");}
		if(communicationrequestidentifiertypecoding.hasSystem()) {

			c.addCmmnctnRqstIdTypCdgSys(String.valueOf(communicationrequestidentifiertypecoding.getSystem()));
		} else {
			c.addCmmnctnRqstIdTypCdgSys("NULL");
		}

		if(communicationrequestidentifiertypecodingi == communicationrequestidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstIdTypCdgSys("]]");}


		 };
		/******************** communicationrequestidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationrequestidentifierperiod = communicationrequestidentifier.getPeriod();

		/******************** CmmnctnRqst_Id_Prd_Strt ********************************************************************************/
		if(communicationrequestidentifieri == 0) {c.addCmmnctnRqstIdPrdStrt("[");}
		if(communicationrequestidentifierperiod.hasStart()) {

			c.addCmmnctnRqstIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationrequestidentifierperiod.getStart())+"\"");
		} else {
			c.addCmmnctnRqstIdPrdStrt("NULL");
		}

		if(communicationrequestidentifieri == communicationrequestidentifierlist.size()-1) {c.addCmmnctnRqstIdPrdStrt("]");}


		/******************** CmmnctnRqst_Id_Prd_End ********************************************************************************/
		if(communicationrequestidentifieri == 0) {c.addCmmnctnRqstIdPrdEnd("[");}
		if(communicationrequestidentifierperiod.hasEnd()) {

			c.addCmmnctnRqstIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationrequestidentifierperiod.getEnd())+"\"");
		} else {
			c.addCmmnctnRqstIdPrdEnd("NULL");
		}

		if(communicationrequestidentifieri == communicationrequestidentifierlist.size()-1) {c.addCmmnctnRqstIdPrdEnd("]");}


		/******************** communicationrequestidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse communicationrequestidentifieruse = communicationrequestidentifier.getUse();
		if(communicationrequestidentifieruse!=null) {
		if(communicationrequestidentifieri == 0) {

		c.addCmmnctnRqstIdUse("[");		}
			c.addCmmnctnRqstIdUse(communicationrequestidentifieruse.toCode());
		if(communicationrequestidentifieri == communicationrequestidentifierlist.size()-1) {

		c.addCmmnctnRqstIdUse("]");		}

		} else {
			c.addCmmnctnRqstIdUse("NULL");
		}

		/******************** CmmnctnRqst_Id_Assigner ********************************************************************************/
		if(communicationrequestidentifieri == 0) {c.addCmmnctnRqstIdAssigner("[");}
		if(communicationrequestidentifier.hasAssigner()) {

			if(communicationrequestidentifier.getAssigner().getReference() != null) {
			c.addCmmnctnRqstIdAssigner(communicationrequestidentifier.getAssigner().getReference());
			}
		} else {
			c.addCmmnctnRqstIdAssigner("NULL");
		}

		if(communicationrequestidentifieri == communicationrequestidentifierlist.size()-1) {c.addCmmnctnRqstIdAssigner("]");}


		/******************** CmmnctnRqst_Id_Sys ********************************************************************************/
		if(communicationrequestidentifieri == 0) {c.addCmmnctnRqstIdSys("[");}
		if(communicationrequestidentifier.hasSystem()) {

			c.addCmmnctnRqstIdSys(String.valueOf(communicationrequestidentifier.getSystem()));
		} else {
			c.addCmmnctnRqstIdSys("NULL");
		}

		if(communicationrequestidentifieri == communicationrequestidentifierlist.size()-1) {c.addCmmnctnRqstIdSys("]");}


		 };
		/******************** communicationrequestgroupidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier communicationrequestgroupidentifier = communicationrequest.getGroupIdentifier();

		/******************** CmmnctnRqst_GrpId_Vl ********************************************************************************/
		if(communicationrequestgroupidentifier.hasValue()) {

			c.addCmmnctnRqstGrpIdVl(String.valueOf(communicationrequestgroupidentifier.getValue()));
		} else {
			c.addCmmnctnRqstGrpIdVl("NULL");
		}


		/******************** communicationrequestgroupidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequestgroupidentifiertype = communicationrequestgroupidentifier.getType();

		/******************** CmmnctnRqst_GrpId_Typ_Txt ********************************************************************************/
		if(communicationrequestgroupidentifiertype.hasText()) {

			c.addCmmnctnRqstGrpIdTypTxt(String.valueOf(communicationrequestgroupidentifiertype.getText()));
		} else {
			c.addCmmnctnRqstGrpIdTypTxt("NULL");
		}


		/******************** communicationrequestgroupidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationrequestgroupidentifiertypecodinglist = communicationrequestgroupidentifiertype.getCoding();
		for(int communicationrequestgroupidentifiertypecodingi = 0; communicationrequestgroupidentifiertypecodingi<communicationrequestgroupidentifiertypecodinglist.size();communicationrequestgroupidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationrequestgroupidentifiertypecoding = communicationrequestgroupidentifiertypecodinglist.get(communicationrequestgroupidentifiertypecodingi);

		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(communicationrequestgroupidentifiertypecodingi == 0) {c.addCmmnctnRqstGrpIdTypCdgDsply("[");}
		if(communicationrequestgroupidentifiertypecoding.hasDisplay()) {

			c.addCmmnctnRqstGrpIdTypCdgDsply(String.valueOf(communicationrequestgroupidentifiertypecoding.getDisplay()));
		} else {
			c.addCmmnctnRqstGrpIdTypCdgDsply("NULL");
		}

		if(communicationrequestgroupidentifiertypecodingi == communicationrequestgroupidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstGrpIdTypCdgDsply("]");}


		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestgroupidentifiertypecodingi == 0) {c.addCmmnctnRqstGrpIdTypCdgVrsn("[");}
		if(communicationrequestgroupidentifiertypecoding.hasVersion()) {

			c.addCmmnctnRqstGrpIdTypCdgVrsn(String.valueOf(communicationrequestgroupidentifiertypecoding.getVersion()));
		} else {
			c.addCmmnctnRqstGrpIdTypCdgVrsn("NULL");
		}

		if(communicationrequestgroupidentifiertypecodingi == communicationrequestgroupidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstGrpIdTypCdgVrsn("]");}


		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(communicationrequestgroupidentifiertypecodingi == 0) {c.addCmmnctnRqstGrpIdTypCdgCd("[");}
		if(communicationrequestgroupidentifiertypecoding.hasCode()) {

			c.addCmmnctnRqstGrpIdTypCdgCd(String.valueOf(communicationrequestgroupidentifiertypecoding.getCode()));
		} else {
			c.addCmmnctnRqstGrpIdTypCdgCd("NULL");
		}

		if(communicationrequestgroupidentifiertypecodingi == communicationrequestgroupidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstGrpIdTypCdgCd("]");}


		/******************** CmmnctnRqst_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestgroupidentifiertypecodingi == 0) {c.addCmmnctnRqstGrpIdTypCdgUsrSltd("[");}
		if(communicationrequestgroupidentifiertypecoding.hasUserSelected()) {

			c.addCmmnctnRqstGrpIdTypCdgUsrSltd(String.valueOf(communicationrequestgroupidentifiertypecoding.getUserSelected()));
		} else {
			c.addCmmnctnRqstGrpIdTypCdgUsrSltd("NULL");
		}

		if(communicationrequestgroupidentifiertypecodingi == communicationrequestgroupidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstGrpIdTypCdgUsrSltd("]");}


		/******************** CmmnctnRqst_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(communicationrequestgroupidentifiertypecodingi == 0) {c.addCmmnctnRqstGrpIdTypCdgSys("[");}
		if(communicationrequestgroupidentifiertypecoding.hasSystem()) {

			c.addCmmnctnRqstGrpIdTypCdgSys(String.valueOf(communicationrequestgroupidentifiertypecoding.getSystem()));
		} else {
			c.addCmmnctnRqstGrpIdTypCdgSys("NULL");
		}

		if(communicationrequestgroupidentifiertypecodingi == communicationrequestgroupidentifiertypecodinglist.size()-1) {c.addCmmnctnRqstGrpIdTypCdgSys("]");}


		 };
		/******************** communicationrequestgroupidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationrequestgroupidentifierperiod = communicationrequestgroupidentifier.getPeriod();

		/******************** CmmnctnRqst_GrpId_Prd_Strt ********************************************************************************/
		if(communicationrequestgroupidentifierperiod.hasStart()) {

			c.addCmmnctnRqstGrpIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationrequestgroupidentifierperiod.getStart())+"\"");
		} else {
			c.addCmmnctnRqstGrpIdPrdStrt("NULL");
		}


		/******************** CmmnctnRqst_GrpId_Prd_End ********************************************************************************/
		if(communicationrequestgroupidentifierperiod.hasEnd()) {

			c.addCmmnctnRqstGrpIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationrequestgroupidentifierperiod.getEnd())+"\"");
		} else {
			c.addCmmnctnRqstGrpIdPrdEnd("NULL");
		}


		/******************** communicationrequestgroupidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse communicationrequestgroupidentifieruse = communicationrequestgroupidentifier.getUse();
		if(communicationrequestgroupidentifieruse!=null) {
			c.addCmmnctnRqstGrpIdUse(communicationrequestgroupidentifieruse.toCode());
		} else {
			c.addCmmnctnRqstGrpIdUse("NULL");
		}

		/******************** CmmnctnRqst_GrpId_Assigner ********************************************************************************/
		if(communicationrequestgroupidentifier.hasAssigner()) {

			if(communicationrequestgroupidentifier.getAssigner().getReference() != null) {
			c.addCmmnctnRqstGrpIdAssigner(communicationrequestgroupidentifier.getAssigner().getReference());
			}
		} else {
			c.addCmmnctnRqstGrpIdAssigner("NULL");
		}


		/******************** CmmnctnRqst_GrpId_Sys ********************************************************************************/
		if(communicationrequestgroupidentifier.hasSystem()) {

			c.addCmmnctnRqstGrpIdSys(String.valueOf(communicationrequestgroupidentifier.getSystem()));
		} else {
			c.addCmmnctnRqstGrpIdSys("NULL");
		}


		/******************** CmmnctnRqst_Replaces ********************************************************************************/
		if(communicationrequest.hasReplaces()) {

			String  array = "[";
			for(int incr=0; incr<communicationrequest.getReplaces().size(); incr++) {
				array = array + communicationrequest.getReplaces().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnRqstReplaces(array);

		} else {
			c.addCmmnctnRqstReplaces("NULL");
		}


		/******************** communicationrequestcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> communicationrequestcategorylist = communicationrequest.getCategory();
		for(int communicationrequestcategoryi = 0; communicationrequestcategoryi<communicationrequestcategorylist.size();communicationrequestcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  communicationrequestcategory = communicationrequestcategorylist.get(communicationrequestcategoryi);

		/******************** CmmnctnRqst_Ctgry_Txt ********************************************************************************/
		if(communicationrequestcategoryi == 0) {c.addCmmnctnRqstCtgryTxt("[");}
		if(communicationrequestcategory.hasText()) {

			c.addCmmnctnRqstCtgryTxt(String.valueOf(communicationrequestcategory.getText()));
		} else {
			c.addCmmnctnRqstCtgryTxt("NULL");
		}

		if(communicationrequestcategoryi == communicationrequestcategorylist.size()-1) {c.addCmmnctnRqstCtgryTxt("]");}


		/******************** communicationrequestcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationrequestcategorycodinglist = communicationrequestcategory.getCoding();
		for(int communicationrequestcategorycodingi = 0; communicationrequestcategorycodingi<communicationrequestcategorycodinglist.size();communicationrequestcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationrequestcategorycoding = communicationrequestcategorycodinglist.get(communicationrequestcategorycodingi);

		/******************** CmmnctnRqst_Ctgry_Cdg_Dsply ********************************************************************************/
		if(communicationrequestcategorycodingi == 0) {c.addCmmnctnRqstCtgryCdgDsply("[[");}
		if(communicationrequestcategorycoding.hasDisplay()) {

			c.addCmmnctnRqstCtgryCdgDsply(String.valueOf(communicationrequestcategorycoding.getDisplay()));
		} else {
			c.addCmmnctnRqstCtgryCdgDsply("NULL");
		}

		if(communicationrequestcategorycodingi == communicationrequestcategorycodinglist.size()-1) {c.addCmmnctnRqstCtgryCdgDsply("]]");}


		/******************** CmmnctnRqst_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestcategorycodingi == 0) {c.addCmmnctnRqstCtgryCdgVrsn("[[");}
		if(communicationrequestcategorycoding.hasVersion()) {

			c.addCmmnctnRqstCtgryCdgVrsn(String.valueOf(communicationrequestcategorycoding.getVersion()));
		} else {
			c.addCmmnctnRqstCtgryCdgVrsn("NULL");
		}

		if(communicationrequestcategorycodingi == communicationrequestcategorycodinglist.size()-1) {c.addCmmnctnRqstCtgryCdgVrsn("]]");}


		/******************** CmmnctnRqst_Ctgry_Cdg_Cd ********************************************************************************/
		if(communicationrequestcategorycodingi == 0) {c.addCmmnctnRqstCtgryCdgCd("[[");}
		if(communicationrequestcategorycoding.hasCode()) {

			c.addCmmnctnRqstCtgryCdgCd(String.valueOf(communicationrequestcategorycoding.getCode()));
		} else {
			c.addCmmnctnRqstCtgryCdgCd("NULL");
		}

		if(communicationrequestcategorycodingi == communicationrequestcategorycodinglist.size()-1) {c.addCmmnctnRqstCtgryCdgCd("]]");}


		/******************** CmmnctnRqst_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestcategorycodingi == 0) {c.addCmmnctnRqstCtgryCdgUsrSltd("[[");}
		if(communicationrequestcategorycoding.hasUserSelected()) {

			c.addCmmnctnRqstCtgryCdgUsrSltd(String.valueOf(communicationrequestcategorycoding.getUserSelected()));
		} else {
			c.addCmmnctnRqstCtgryCdgUsrSltd("NULL");
		}

		if(communicationrequestcategorycodingi == communicationrequestcategorycodinglist.size()-1) {c.addCmmnctnRqstCtgryCdgUsrSltd("]]");}


		/******************** CmmnctnRqst_Ctgry_Cdg_Sys ********************************************************************************/
		if(communicationrequestcategorycodingi == 0) {c.addCmmnctnRqstCtgryCdgSys("[[");}
		if(communicationrequestcategorycoding.hasSystem()) {

			c.addCmmnctnRqstCtgryCdgSys(String.valueOf(communicationrequestcategorycoding.getSystem()));
		} else {
			c.addCmmnctnRqstCtgryCdgSys("NULL");
		}

		if(communicationrequestcategorycodingi == communicationrequestcategorycodinglist.size()-1) {c.addCmmnctnRqstCtgryCdgSys("]]");}


		 };
		 };
		/******************** CmmnctnRqst_OccrnceDtTimeTyp ********************************************************************************/
		if(communicationrequest.hasOccurrenceDateTimeType()) {

			c.addCmmnctnRqstOccrnceDtTimeTyp("\""+communicationrequest.getOccurrenceDateTimeType().getValueAsString()+"\"");
		} else {
			c.addCmmnctnRqstOccrnceDtTimeTyp("NULL");
		}


		/******************** communicationrequestoccurrenceperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationrequestoccurrenceperiod = communicationrequest.getOccurrencePeriod();

		/******************** CmmnctnRqst_OccrncePrd_Strt ********************************************************************************/
		if(communicationrequestoccurrenceperiod.hasStart()) {

			c.addCmmnctnRqstOccrncePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationrequestoccurrenceperiod.getStart())+"\"");
		} else {
			c.addCmmnctnRqstOccrncePrdStrt("NULL");
		}


		/******************** CmmnctnRqst_OccrncePrd_End ********************************************************************************/
		if(communicationrequestoccurrenceperiod.hasEnd()) {

			c.addCmmnctnRqstOccrncePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationrequestoccurrenceperiod.getEnd())+"\"");
		} else {
			c.addCmmnctnRqstOccrncePrdEnd("NULL");
		}


		/******************** CmmnctnRqst_Rqster ********************************************************************************/
		if(communicationrequest.hasRequester()) {

			if(communicationrequest.getRequester().getReference() != null) {
			c.addCmmnctnRqstRqster(communicationrequest.getRequester().getReference());
			}
		} else {
			c.addCmmnctnRqstRqster("NULL");
		}


		/******************** communicationrequestmedium ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> communicationrequestmediumlist = communicationrequest.getMedium();
		for(int communicationrequestmediumi = 0; communicationrequestmediumi<communicationrequestmediumlist.size();communicationrequestmediumi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  communicationrequestmedium = communicationrequestmediumlist.get(communicationrequestmediumi);

		/******************** CmmnctnRqst_Medium_Txt ********************************************************************************/
		if(communicationrequestmediumi == 0) {c.addCmmnctnRqstMediumTxt("[");}
		if(communicationrequestmedium.hasText()) {

			c.addCmmnctnRqstMediumTxt(String.valueOf(communicationrequestmedium.getText()));
		} else {
			c.addCmmnctnRqstMediumTxt("NULL");
		}

		if(communicationrequestmediumi == communicationrequestmediumlist.size()-1) {c.addCmmnctnRqstMediumTxt("]");}


		/******************** communicationrequestmediumcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationrequestmediumcodinglist = communicationrequestmedium.getCoding();
		for(int communicationrequestmediumcodingi = 0; communicationrequestmediumcodingi<communicationrequestmediumcodinglist.size();communicationrequestmediumcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationrequestmediumcoding = communicationrequestmediumcodinglist.get(communicationrequestmediumcodingi);

		/******************** CmmnctnRqst_Medium_Cdg_Dsply ********************************************************************************/
		if(communicationrequestmediumcodingi == 0) {c.addCmmnctnRqstMediumCdgDsply("[[");}
		if(communicationrequestmediumcoding.hasDisplay()) {

			c.addCmmnctnRqstMediumCdgDsply(String.valueOf(communicationrequestmediumcoding.getDisplay()));
		} else {
			c.addCmmnctnRqstMediumCdgDsply("NULL");
		}

		if(communicationrequestmediumcodingi == communicationrequestmediumcodinglist.size()-1) {c.addCmmnctnRqstMediumCdgDsply("]]");}


		/******************** CmmnctnRqst_Medium_Cdg_Vrsn ********************************************************************************/
		if(communicationrequestmediumcodingi == 0) {c.addCmmnctnRqstMediumCdgVrsn("[[");}
		if(communicationrequestmediumcoding.hasVersion()) {

			c.addCmmnctnRqstMediumCdgVrsn(String.valueOf(communicationrequestmediumcoding.getVersion()));
		} else {
			c.addCmmnctnRqstMediumCdgVrsn("NULL");
		}

		if(communicationrequestmediumcodingi == communicationrequestmediumcodinglist.size()-1) {c.addCmmnctnRqstMediumCdgVrsn("]]");}


		/******************** CmmnctnRqst_Medium_Cdg_Cd ********************************************************************************/
		if(communicationrequestmediumcodingi == 0) {c.addCmmnctnRqstMediumCdgCd("[[");}
		if(communicationrequestmediumcoding.hasCode()) {

			c.addCmmnctnRqstMediumCdgCd(String.valueOf(communicationrequestmediumcoding.getCode()));
		} else {
			c.addCmmnctnRqstMediumCdgCd("NULL");
		}

		if(communicationrequestmediumcodingi == communicationrequestmediumcodinglist.size()-1) {c.addCmmnctnRqstMediumCdgCd("]]");}


		/******************** CmmnctnRqst_Medium_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequestmediumcodingi == 0) {c.addCmmnctnRqstMediumCdgUsrSltd("[[");}
		if(communicationrequestmediumcoding.hasUserSelected()) {

			c.addCmmnctnRqstMediumCdgUsrSltd(String.valueOf(communicationrequestmediumcoding.getUserSelected()));
		} else {
			c.addCmmnctnRqstMediumCdgUsrSltd("NULL");
		}

		if(communicationrequestmediumcodingi == communicationrequestmediumcodinglist.size()-1) {c.addCmmnctnRqstMediumCdgUsrSltd("]]");}


		/******************** CmmnctnRqst_Medium_Cdg_Sys ********************************************************************************/
		if(communicationrequestmediumcodingi == 0) {c.addCmmnctnRqstMediumCdgSys("[[");}
		if(communicationrequestmediumcoding.hasSystem()) {

			c.addCmmnctnRqstMediumCdgSys(String.valueOf(communicationrequestmediumcoding.getSystem()));
		} else {
			c.addCmmnctnRqstMediumCdgSys("NULL");
		}

		if(communicationrequestmediumcodingi == communicationrequestmediumcodinglist.size()-1) {c.addCmmnctnRqstMediumCdgSys("]]");}


		 };
		 };
		/******************** CmmnctnRqst_About ********************************************************************************/
		if(communicationrequest.hasAbout()) {

			String  array = "[";
			for(int incr=0; incr<communicationrequest.getAbout().size(); incr++) {
				array = array + communicationrequest.getAbout().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnRqstAbout(array);

		} else {
			c.addCmmnctnRqstAbout("NULL");
		}


		/******************** CmmnctnRqst_Recipient ********************************************************************************/
		if(communicationrequest.hasRecipient()) {

			String  array = "[";
			for(int incr=0; incr<communicationrequest.getRecipient().size(); incr++) {
				array = array + communicationrequest.getRecipient().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnRqstRecipient(array);

		} else {
			c.addCmmnctnRqstRecipient("NULL");
		}


		/******************** CmmnctnRqst_Sender ********************************************************************************/
		if(communicationrequest.hasSender()) {

			if(communicationrequest.getSender().getReference() != null) {
			c.addCmmnctnRqstSender(communicationrequest.getSender().getReference());
			}
		} else {
			c.addCmmnctnRqstSender("NULL");
		}


		/******************** CmmnctnRqst_AthredOn ********************************************************************************/
		if(communicationrequest.hasAuthoredOn()) {

			c.addCmmnctnRqstAthredOn("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationrequest.getAuthoredOn())+"\"");
		} else {
			c.addCmmnctnRqstAthredOn("NULL");
		}


		/******************** communicationrequeststatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationrequeststatusreason = communicationrequest.getStatusReason();

		/******************** CmmnctnRqst_StsRsn_Txt ********************************************************************************/
		if(communicationrequeststatusreason.hasText()) {

			c.addCmmnctnRqstStsRsnTxt(String.valueOf(communicationrequeststatusreason.getText()));
		} else {
			c.addCmmnctnRqstStsRsnTxt("NULL");
		}


		/******************** communicationrequeststatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationrequeststatusreasoncodinglist = communicationrequeststatusreason.getCoding();
		for(int communicationrequeststatusreasoncodingi = 0; communicationrequeststatusreasoncodingi<communicationrequeststatusreasoncodinglist.size();communicationrequeststatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationrequeststatusreasoncoding = communicationrequeststatusreasoncodinglist.get(communicationrequeststatusreasoncodingi);

		/******************** CmmnctnRqst_StsRsn_Cdg_Dsply ********************************************************************************/
		if(communicationrequeststatusreasoncodingi == 0) {c.addCmmnctnRqstStsRsnCdgDsply("[");}
		if(communicationrequeststatusreasoncoding.hasDisplay()) {

			c.addCmmnctnRqstStsRsnCdgDsply(String.valueOf(communicationrequeststatusreasoncoding.getDisplay()));
		} else {
			c.addCmmnctnRqstStsRsnCdgDsply("NULL");
		}

		if(communicationrequeststatusreasoncodingi == communicationrequeststatusreasoncodinglist.size()-1) {c.addCmmnctnRqstStsRsnCdgDsply("]");}


		/******************** CmmnctnRqst_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(communicationrequeststatusreasoncodingi == 0) {c.addCmmnctnRqstStsRsnCdgVrsn("[");}
		if(communicationrequeststatusreasoncoding.hasVersion()) {

			c.addCmmnctnRqstStsRsnCdgVrsn(String.valueOf(communicationrequeststatusreasoncoding.getVersion()));
		} else {
			c.addCmmnctnRqstStsRsnCdgVrsn("NULL");
		}

		if(communicationrequeststatusreasoncodingi == communicationrequeststatusreasoncodinglist.size()-1) {c.addCmmnctnRqstStsRsnCdgVrsn("]");}


		/******************** CmmnctnRqst_StsRsn_Cdg_Cd ********************************************************************************/
		if(communicationrequeststatusreasoncodingi == 0) {c.addCmmnctnRqstStsRsnCdgCd("[");}
		if(communicationrequeststatusreasoncoding.hasCode()) {

			c.addCmmnctnRqstStsRsnCdgCd(String.valueOf(communicationrequeststatusreasoncoding.getCode()));
		} else {
			c.addCmmnctnRqstStsRsnCdgCd("NULL");
		}

		if(communicationrequeststatusreasoncodingi == communicationrequeststatusreasoncodinglist.size()-1) {c.addCmmnctnRqstStsRsnCdgCd("]");}


		/******************** CmmnctnRqst_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(communicationrequeststatusreasoncodingi == 0) {c.addCmmnctnRqstStsRsnCdgUsrSltd("[");}
		if(communicationrequeststatusreasoncoding.hasUserSelected()) {

			c.addCmmnctnRqstStsRsnCdgUsrSltd(String.valueOf(communicationrequeststatusreasoncoding.getUserSelected()));
		} else {
			c.addCmmnctnRqstStsRsnCdgUsrSltd("NULL");
		}

		if(communicationrequeststatusreasoncodingi == communicationrequeststatusreasoncodinglist.size()-1) {c.addCmmnctnRqstStsRsnCdgUsrSltd("]");}


		/******************** CmmnctnRqst_StsRsn_Cdg_Sys ********************************************************************************/
		if(communicationrequeststatusreasoncodingi == 0) {c.addCmmnctnRqstStsRsnCdgSys("[");}
		if(communicationrequeststatusreasoncoding.hasSystem()) {

			c.addCmmnctnRqstStsRsnCdgSys(String.valueOf(communicationrequeststatusreasoncoding.getSystem()));
		} else {
			c.addCmmnctnRqstStsRsnCdgSys("NULL");
		}

		if(communicationrequeststatusreasoncodingi == communicationrequeststatusreasoncodinglist.size()-1) {c.addCmmnctnRqstStsRsnCdgSys("]");}


		 };
		/******************** CmmnctnRqst_DoNotPerform ********************************************************************************/
		if(communicationrequest.hasDoNotPerform()) {

			c.addCmmnctnRqstDoNotPerform(String.valueOf(communicationrequest.getDoNotPerform()));
		} else {
			c.addCmmnctnRqstDoNotPerform("NULL");
		}


		return c;
	}
}
