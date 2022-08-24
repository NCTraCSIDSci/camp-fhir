package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Communication;
public class CommunicationBidirectionalConversion 
{
	public Communication Communications(org.hl7.fhir.r4.model.Communication communication) throws ParseException
	{
		 main.java.com.campfhir.model.Communication c = new  main.java.com.campfhir.model.Communication();

		/******************** id ********************************************************************************/
		c.setId(communication.getIdElement().getIdPart());

		/******************** communicationpriority ********************************************************************************/
		org.hl7.fhir.r4.model.Communication.CommunicationPriority communicationpriority = communication.getPriority();
		if(communicationpriority!=null) {
			c.addCmmnctnPriority(communicationpriority.toCode());
		} else {
			c.addCmmnctnPriority("NULL");
		}

		/******************** communicationpayload ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent> communicationpayloadlist = communication.getPayload();
		for(int communicationpayloadi = 0; communicationpayloadi<communicationpayloadlist.size();communicationpayloadi++ ) {
		org.hl7.fhir.r4.model.Communication.CommunicationPayloadComponent  communicationpayload = communicationpayloadlist.get(communicationpayloadi);

		/******************** Cmmnctn_Payload_CntntRfrnc ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntRfrnc("[");}
		if(communicationpayload.hasContentReference()) {

			if(communicationpayload.getContentReference().getReference() != null) {
			c.addCmmnctnPayloadCntntRfrnc(communicationpayload.getContentReference().getReference());
			}
		} else {
			c.addCmmnctnPayloadCntntRfrnc("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntRfrnc("]");}


		/******************** communicationpayloadcontentattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment communicationpayloadcontentattachment = communicationpayload.getContentAttachment();

		/******************** Cmmnctn_Payload_CntntAttchmnt_Sz ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntAttchmntSz("[");}
		if(communicationpayloadcontentattachment.hasSize()) {

			c.addCmmnctnPayloadCntntAttchmntSz(String.valueOf(communicationpayloadcontentattachment.getSize()));
		} else {
			c.addCmmnctnPayloadCntntAttchmntSz("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntAttchmntSz("]");}


		/******************** Cmmnctn_Payload_CntntAttchmnt_Lnguage ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntAttchmntLnguage("[");}
		if(communicationpayloadcontentattachment.hasLanguage()) {

			c.addCmmnctnPayloadCntntAttchmntLnguage(String.valueOf(communicationpayloadcontentattachment.getLanguage()));
		} else {
			c.addCmmnctnPayloadCntntAttchmntLnguage("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntAttchmntLnguage("]");}


		/******************** Cmmnctn_Payload_CntntAttchmnt_CntntTyp ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntAttchmntCntntTyp("[");}
		if(communicationpayloadcontentattachment.hasContentType()) {

			c.addCmmnctnPayloadCntntAttchmntCntntTyp(String.valueOf(communicationpayloadcontentattachment.getContentType()));
		} else {
			c.addCmmnctnPayloadCntntAttchmntCntntTyp("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntAttchmntCntntTyp("]");}


		/******************** Cmmnctn_Payload_CntntAttchmnt_Hash ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntAttchmntHash("[");}
		if(communicationpayloadcontentattachment.hasHash()) {

			c.addCmmnctnPayloadCntntAttchmntHash(new String(communicationpayloadcontentattachment.getHash()));
		} else {
			c.addCmmnctnPayloadCntntAttchmntHash("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntAttchmntHash("]");}


		/******************** Cmmnctn_Payload_CntntAttchmnt_Data ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntAttchmntData("[");}
		if(communicationpayloadcontentattachment.hasData()) {

			c.addCmmnctnPayloadCntntAttchmntData(new String(communicationpayloadcontentattachment.getData()));
		} else {
			c.addCmmnctnPayloadCntntAttchmntData("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntAttchmntData("]");}


		/******************** Cmmnctn_Payload_CntntAttchmnt_Creation ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntAttchmntCreation("[");}
		if(communicationpayloadcontentattachment.hasCreation()) {

			c.addCmmnctnPayloadCntntAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationpayloadcontentattachment.getCreation())+"\"");
		} else {
			c.addCmmnctnPayloadCntntAttchmntCreation("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntAttchmntCreation("]");}


		/******************** Cmmnctn_Payload_CntntAttchmnt_Ttl ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntAttchmntTtl("[");}
		if(communicationpayloadcontentattachment.hasTitle()) {

			c.addCmmnctnPayloadCntntAttchmntTtl(String.valueOf(communicationpayloadcontentattachment.getTitle()));
		} else {
			c.addCmmnctnPayloadCntntAttchmntTtl("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntAttchmntTtl("]");}


		/******************** Cmmnctn_Payload_CntntAttchmnt_Url ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntAttchmntUrl("[");}
		if(communicationpayloadcontentattachment.hasUrl()) {

			c.addCmmnctnPayloadCntntAttchmntUrl(String.valueOf(communicationpayloadcontentattachment.getUrl()));
		} else {
			c.addCmmnctnPayloadCntntAttchmntUrl("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntAttchmntUrl("]");}


		/******************** Cmmnctn_Payload_CntntStrgTyp ********************************************************************************/
		if(communicationpayloadi == 0) {c.addCmmnctnPayloadCntntStrgTyp("[");}
		if(communicationpayload.hasContentStringType()) {

			c.addCmmnctnPayloadCntntStrgTyp("\""+communicationpayload.getContentStringType().getValueAsString()+"\"");
		} else {
			c.addCmmnctnPayloadCntntStrgTyp("NULL");
		}

		if(communicationpayloadi == communicationpayloadlist.size()-1) {c.addCmmnctnPayloadCntntStrgTyp("]");}


		 };
		/******************** Cmmnctn_Sbjct ********************************************************************************/
		if(communication.hasSubject()) {

			if(communication.getSubject().getReference() != null) {
			c.addCmmnctnSbjct(communication.getSubject().getReference());
			}
		} else {
			c.addCmmnctnSbjct("NULL");
		}


		/******************** communicationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.Communication.CommunicationStatus communicationstatus = communication.getStatus();
		if(communicationstatus!=null) {
			c.addCmmnctnSts(communicationstatus.toCode());
		} else {
			c.addCmmnctnSts("NULL");
		}

		/******************** Cmmnctn_Enc ********************************************************************************/
		if(communication.hasEncounter()) {

			if(communication.getEncounter().getReference() != null) {
			c.addCmmnctnEnc(communication.getEncounter().getReference());
			}
		} else {
			c.addCmmnctnEnc("NULL");
		}


		/******************** Cmmnctn_BasedOn ********************************************************************************/
		if(communication.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<communication.getBasedOn().size(); incr++) {
				array = array + communication.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnBasedOn(array);

		} else {
			c.addCmmnctnBasedOn("NULL");
		}


		/******************** communicationreasoncode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> communicationreasoncodelist = communication.getReasonCode();
		for(int communicationreasoncodei = 0; communicationreasoncodei<communicationreasoncodelist.size();communicationreasoncodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  communicationreasoncode = communicationreasoncodelist.get(communicationreasoncodei);

		/******************** Cmmnctn_RsnCd_Txt ********************************************************************************/
		if(communicationreasoncodei == 0) {c.addCmmnctnRsnCdTxt("[");}
		if(communicationreasoncode.hasText()) {

			c.addCmmnctnRsnCdTxt(String.valueOf(communicationreasoncode.getText()));
		} else {
			c.addCmmnctnRsnCdTxt("NULL");
		}

		if(communicationreasoncodei == communicationreasoncodelist.size()-1) {c.addCmmnctnRsnCdTxt("]");}


		/******************** communicationreasoncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationreasoncodecodinglist = communicationreasoncode.getCoding();
		for(int communicationreasoncodecodingi = 0; communicationreasoncodecodingi<communicationreasoncodecodinglist.size();communicationreasoncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationreasoncodecoding = communicationreasoncodecodinglist.get(communicationreasoncodecodingi);

		/******************** Cmmnctn_RsnCd_Cdg_Dsply ********************************************************************************/
		if(communicationreasoncodecodingi == 0) {c.addCmmnctnRsnCdCdgDsply("[[");}
		if(communicationreasoncodecoding.hasDisplay()) {

			c.addCmmnctnRsnCdCdgDsply(String.valueOf(communicationreasoncodecoding.getDisplay()));
		} else {
			c.addCmmnctnRsnCdCdgDsply("NULL");
		}

		if(communicationreasoncodecodingi == communicationreasoncodecodinglist.size()-1) {c.addCmmnctnRsnCdCdgDsply("]]");}


		/******************** Cmmnctn_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(communicationreasoncodecodingi == 0) {c.addCmmnctnRsnCdCdgVrsn("[[");}
		if(communicationreasoncodecoding.hasVersion()) {

			c.addCmmnctnRsnCdCdgVrsn(String.valueOf(communicationreasoncodecoding.getVersion()));
		} else {
			c.addCmmnctnRsnCdCdgVrsn("NULL");
		}

		if(communicationreasoncodecodingi == communicationreasoncodecodinglist.size()-1) {c.addCmmnctnRsnCdCdgVrsn("]]");}


		/******************** Cmmnctn_RsnCd_Cdg_Cd ********************************************************************************/
		if(communicationreasoncodecodingi == 0) {c.addCmmnctnRsnCdCdgCd("[[");}
		if(communicationreasoncodecoding.hasCode()) {

			c.addCmmnctnRsnCdCdgCd(String.valueOf(communicationreasoncodecoding.getCode()));
		} else {
			c.addCmmnctnRsnCdCdgCd("NULL");
		}

		if(communicationreasoncodecodingi == communicationreasoncodecodinglist.size()-1) {c.addCmmnctnRsnCdCdgCd("]]");}


		/******************** Cmmnctn_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(communicationreasoncodecodingi == 0) {c.addCmmnctnRsnCdCdgUsrSltd("[[");}
		if(communicationreasoncodecoding.hasUserSelected()) {

			c.addCmmnctnRsnCdCdgUsrSltd(String.valueOf(communicationreasoncodecoding.getUserSelected()));
		} else {
			c.addCmmnctnRsnCdCdgUsrSltd("NULL");
		}

		if(communicationreasoncodecodingi == communicationreasoncodecodinglist.size()-1) {c.addCmmnctnRsnCdCdgUsrSltd("]]");}


		/******************** Cmmnctn_RsnCd_Cdg_Sys ********************************************************************************/
		if(communicationreasoncodecodingi == 0) {c.addCmmnctnRsnCdCdgSys("[[");}
		if(communicationreasoncodecoding.hasSystem()) {

			c.addCmmnctnRsnCdCdgSys(String.valueOf(communicationreasoncodecoding.getSystem()));
		} else {
			c.addCmmnctnRsnCdCdgSys("NULL");
		}

		if(communicationreasoncodecodingi == communicationreasoncodecodinglist.size()-1) {c.addCmmnctnRsnCdCdgSys("]]");}


		 };
		 };
		/******************** communicationnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> communicationnotelist = communication.getNote();
		for(int communicationnotei = 0; communicationnotei<communicationnotelist.size();communicationnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  communicationnote = communicationnotelist.get(communicationnotei);

		/******************** Cmmnctn_Nt_Time ********************************************************************************/
		if(communicationnotei == 0) {c.addCmmnctnNtTime("[");}
		if(communicationnote.hasTime()) {

			c.addCmmnctnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationnote.getTime())+"\"");
		} else {
			c.addCmmnctnNtTime("NULL");
		}

		if(communicationnotei == communicationnotelist.size()-1) {c.addCmmnctnNtTime("]");}


		/******************** Cmmnctn_Nt_AthrRfrnc ********************************************************************************/
		if(communicationnotei == 0) {c.addCmmnctnNtAthrRfrnc("[");}
		if(communicationnote.hasAuthorReference()) {

			if(communicationnote.getAuthorReference().getReference() != null) {
			c.addCmmnctnNtAthrRfrnc(communicationnote.getAuthorReference().getReference());
			}
		} else {
			c.addCmmnctnNtAthrRfrnc("NULL");
		}

		if(communicationnotei == communicationnotelist.size()-1) {c.addCmmnctnNtAthrRfrnc("]");}


		/******************** Cmmnctn_Nt_Txt ********************************************************************************/
		if(communicationnotei == 0) {c.addCmmnctnNtTxt("[");}
		if(communicationnote.hasText()) {

			c.addCmmnctnNtTxt(String.valueOf(communicationnote.getText()));
		} else {
			c.addCmmnctnNtTxt("NULL");
		}

		if(communicationnotei == communicationnotelist.size()-1) {c.addCmmnctnNtTxt("]");}


		/******************** Cmmnctn_Nt_AthrStrgTyp ********************************************************************************/
		if(communicationnotei == 0) {c.addCmmnctnNtAthrStrgTyp("[");}
		if(communicationnote.hasAuthorStringType()) {

			c.addCmmnctnNtAthrStrgTyp("\""+communicationnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			c.addCmmnctnNtAthrStrgTyp("NULL");
		}

		if(communicationnotei == communicationnotelist.size()-1) {c.addCmmnctnNtAthrStrgTyp("]");}


		 };
		/******************** Cmmnctn_RsnRfrnc ********************************************************************************/
		if(communication.hasReasonReference()) {

			String  array = "[";
			for(int incr=0; incr<communication.getReasonReference().size(); incr++) {
				array = array + communication.getReasonReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnRsnRfrnc(array);

		} else {
			c.addCmmnctnRsnRfrnc("NULL");
		}


		/******************** communicationidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> communicationidentifierlist = communication.getIdentifier();
		for(int communicationidentifieri = 0; communicationidentifieri<communicationidentifierlist.size();communicationidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  communicationidentifier = communicationidentifierlist.get(communicationidentifieri);

		/******************** Cmmnctn_Id_Vl ********************************************************************************/
		if(communicationidentifieri == 0) {c.addCmmnctnIdVl("[");}
		if(communicationidentifier.hasValue()) {

			c.addCmmnctnIdVl(String.valueOf(communicationidentifier.getValue()));
		} else {
			c.addCmmnctnIdVl("NULL");
		}

		if(communicationidentifieri == communicationidentifierlist.size()-1) {c.addCmmnctnIdVl("]");}


		/******************** communicationidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationidentifiertype = communicationidentifier.getType();

		/******************** Cmmnctn_Id_Typ_Txt ********************************************************************************/
		if(communicationidentifieri == 0) {c.addCmmnctnIdTypTxt("[");}
		if(communicationidentifiertype.hasText()) {

			c.addCmmnctnIdTypTxt(String.valueOf(communicationidentifiertype.getText()));
		} else {
			c.addCmmnctnIdTypTxt("NULL");
		}

		if(communicationidentifieri == communicationidentifierlist.size()-1) {c.addCmmnctnIdTypTxt("]");}


		/******************** communicationidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationidentifiertypecodinglist = communicationidentifiertype.getCoding();
		for(int communicationidentifiertypecodingi = 0; communicationidentifiertypecodingi<communicationidentifiertypecodinglist.size();communicationidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationidentifiertypecoding = communicationidentifiertypecodinglist.get(communicationidentifiertypecodingi);

		/******************** Cmmnctn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(communicationidentifiertypecodingi == 0) {c.addCmmnctnIdTypCdgDsply("[[");}
		if(communicationidentifiertypecoding.hasDisplay()) {

			c.addCmmnctnIdTypCdgDsply(String.valueOf(communicationidentifiertypecoding.getDisplay()));
		} else {
			c.addCmmnctnIdTypCdgDsply("NULL");
		}

		if(communicationidentifiertypecodingi == communicationidentifiertypecodinglist.size()-1) {c.addCmmnctnIdTypCdgDsply("]]");}


		/******************** Cmmnctn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(communicationidentifiertypecodingi == 0) {c.addCmmnctnIdTypCdgVrsn("[[");}
		if(communicationidentifiertypecoding.hasVersion()) {

			c.addCmmnctnIdTypCdgVrsn(String.valueOf(communicationidentifiertypecoding.getVersion()));
		} else {
			c.addCmmnctnIdTypCdgVrsn("NULL");
		}

		if(communicationidentifiertypecodingi == communicationidentifiertypecodinglist.size()-1) {c.addCmmnctnIdTypCdgVrsn("]]");}


		/******************** Cmmnctn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(communicationidentifiertypecodingi == 0) {c.addCmmnctnIdTypCdgCd("[[");}
		if(communicationidentifiertypecoding.hasCode()) {

			c.addCmmnctnIdTypCdgCd(String.valueOf(communicationidentifiertypecoding.getCode()));
		} else {
			c.addCmmnctnIdTypCdgCd("NULL");
		}

		if(communicationidentifiertypecodingi == communicationidentifiertypecodinglist.size()-1) {c.addCmmnctnIdTypCdgCd("]]");}


		/******************** Cmmnctn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(communicationidentifiertypecodingi == 0) {c.addCmmnctnIdTypCdgUsrSltd("[[");}
		if(communicationidentifiertypecoding.hasUserSelected()) {

			c.addCmmnctnIdTypCdgUsrSltd(String.valueOf(communicationidentifiertypecoding.getUserSelected()));
		} else {
			c.addCmmnctnIdTypCdgUsrSltd("NULL");
		}

		if(communicationidentifiertypecodingi == communicationidentifiertypecodinglist.size()-1) {c.addCmmnctnIdTypCdgUsrSltd("]]");}


		/******************** Cmmnctn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(communicationidentifiertypecodingi == 0) {c.addCmmnctnIdTypCdgSys("[[");}
		if(communicationidentifiertypecoding.hasSystem()) {

			c.addCmmnctnIdTypCdgSys(String.valueOf(communicationidentifiertypecoding.getSystem()));
		} else {
			c.addCmmnctnIdTypCdgSys("NULL");
		}

		if(communicationidentifiertypecodingi == communicationidentifiertypecodinglist.size()-1) {c.addCmmnctnIdTypCdgSys("]]");}


		 };
		/******************** communicationidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period communicationidentifierperiod = communicationidentifier.getPeriod();

		/******************** Cmmnctn_Id_Prd_Strt ********************************************************************************/
		if(communicationidentifieri == 0) {c.addCmmnctnIdPrdStrt("[");}
		if(communicationidentifierperiod.hasStart()) {

			c.addCmmnctnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationidentifierperiod.getStart())+"\"");
		} else {
			c.addCmmnctnIdPrdStrt("NULL");
		}

		if(communicationidentifieri == communicationidentifierlist.size()-1) {c.addCmmnctnIdPrdStrt("]");}


		/******************** Cmmnctn_Id_Prd_End ********************************************************************************/
		if(communicationidentifieri == 0) {c.addCmmnctnIdPrdEnd("[");}
		if(communicationidentifierperiod.hasEnd()) {

			c.addCmmnctnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(communicationidentifierperiod.getEnd())+"\"");
		} else {
			c.addCmmnctnIdPrdEnd("NULL");
		}

		if(communicationidentifieri == communicationidentifierlist.size()-1) {c.addCmmnctnIdPrdEnd("]");}


		/******************** communicationidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse communicationidentifieruse = communicationidentifier.getUse();
		if(communicationidentifieruse!=null) {
		if(communicationidentifieri == 0) {

		c.addCmmnctnIdUse("[");		}
			c.addCmmnctnIdUse(communicationidentifieruse.toCode());
		if(communicationidentifieri == communicationidentifierlist.size()-1) {

		c.addCmmnctnIdUse("]");		}

		} else {
			c.addCmmnctnIdUse("NULL");
		}

		/******************** Cmmnctn_Id_Assigner ********************************************************************************/
		if(communicationidentifieri == 0) {c.addCmmnctnIdAssigner("[");}
		if(communicationidentifier.hasAssigner()) {

			if(communicationidentifier.getAssigner().getReference() != null) {
			c.addCmmnctnIdAssigner(communicationidentifier.getAssigner().getReference());
			}
		} else {
			c.addCmmnctnIdAssigner("NULL");
		}

		if(communicationidentifieri == communicationidentifierlist.size()-1) {c.addCmmnctnIdAssigner("]");}


		/******************** Cmmnctn_Id_Sys ********************************************************************************/
		if(communicationidentifieri == 0) {c.addCmmnctnIdSys("[");}
		if(communicationidentifier.hasSystem()) {

			c.addCmmnctnIdSys(String.valueOf(communicationidentifier.getSystem()));
		} else {
			c.addCmmnctnIdSys("NULL");
		}

		if(communicationidentifieri == communicationidentifierlist.size()-1) {c.addCmmnctnIdSys("]");}


		 };
		/******************** Cmmnctn_InstantiatesUri ********************************************************************************/
		if(communication.hasInstantiatesUri()) {

			String  array = "[";
			for(int incr=0; incr<communication.getInstantiatesUri().size(); incr++) {
				array = array + communication.getInstantiatesUri().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnInstantiatesUri(array);

		} else {
			c.addCmmnctnInstantiatesUri("NULL");
		}


		/******************** communicationcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> communicationcategorylist = communication.getCategory();
		for(int communicationcategoryi = 0; communicationcategoryi<communicationcategorylist.size();communicationcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  communicationcategory = communicationcategorylist.get(communicationcategoryi);

		/******************** Cmmnctn_Ctgry_Txt ********************************************************************************/
		if(communicationcategoryi == 0) {c.addCmmnctnCtgryTxt("[");}
		if(communicationcategory.hasText()) {

			c.addCmmnctnCtgryTxt(String.valueOf(communicationcategory.getText()));
		} else {
			c.addCmmnctnCtgryTxt("NULL");
		}

		if(communicationcategoryi == communicationcategorylist.size()-1) {c.addCmmnctnCtgryTxt("]");}


		/******************** communicationcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationcategorycodinglist = communicationcategory.getCoding();
		for(int communicationcategorycodingi = 0; communicationcategorycodingi<communicationcategorycodinglist.size();communicationcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationcategorycoding = communicationcategorycodinglist.get(communicationcategorycodingi);

		/******************** Cmmnctn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(communicationcategorycodingi == 0) {c.addCmmnctnCtgryCdgDsply("[[");}
		if(communicationcategorycoding.hasDisplay()) {

			c.addCmmnctnCtgryCdgDsply(String.valueOf(communicationcategorycoding.getDisplay()));
		} else {
			c.addCmmnctnCtgryCdgDsply("NULL");
		}

		if(communicationcategorycodingi == communicationcategorycodinglist.size()-1) {c.addCmmnctnCtgryCdgDsply("]]");}


		/******************** Cmmnctn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(communicationcategorycodingi == 0) {c.addCmmnctnCtgryCdgVrsn("[[");}
		if(communicationcategorycoding.hasVersion()) {

			c.addCmmnctnCtgryCdgVrsn(String.valueOf(communicationcategorycoding.getVersion()));
		} else {
			c.addCmmnctnCtgryCdgVrsn("NULL");
		}

		if(communicationcategorycodingi == communicationcategorycodinglist.size()-1) {c.addCmmnctnCtgryCdgVrsn("]]");}


		/******************** Cmmnctn_Ctgry_Cdg_Cd ********************************************************************************/
		if(communicationcategorycodingi == 0) {c.addCmmnctnCtgryCdgCd("[[");}
		if(communicationcategorycoding.hasCode()) {

			c.addCmmnctnCtgryCdgCd(String.valueOf(communicationcategorycoding.getCode()));
		} else {
			c.addCmmnctnCtgryCdgCd("NULL");
		}

		if(communicationcategorycodingi == communicationcategorycodinglist.size()-1) {c.addCmmnctnCtgryCdgCd("]]");}


		/******************** Cmmnctn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(communicationcategorycodingi == 0) {c.addCmmnctnCtgryCdgUsrSltd("[[");}
		if(communicationcategorycoding.hasUserSelected()) {

			c.addCmmnctnCtgryCdgUsrSltd(String.valueOf(communicationcategorycoding.getUserSelected()));
		} else {
			c.addCmmnctnCtgryCdgUsrSltd("NULL");
		}

		if(communicationcategorycodingi == communicationcategorycodinglist.size()-1) {c.addCmmnctnCtgryCdgUsrSltd("]]");}


		/******************** Cmmnctn_Ctgry_Cdg_Sys ********************************************************************************/
		if(communicationcategorycodingi == 0) {c.addCmmnctnCtgryCdgSys("[[");}
		if(communicationcategorycoding.hasSystem()) {

			c.addCmmnctnCtgryCdgSys(String.valueOf(communicationcategorycoding.getSystem()));
		} else {
			c.addCmmnctnCtgryCdgSys("NULL");
		}

		if(communicationcategorycodingi == communicationcategorycodinglist.size()-1) {c.addCmmnctnCtgryCdgSys("]]");}


		 };
		 };
		/******************** communicationmedium ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> communicationmediumlist = communication.getMedium();
		for(int communicationmediumi = 0; communicationmediumi<communicationmediumlist.size();communicationmediumi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  communicationmedium = communicationmediumlist.get(communicationmediumi);

		/******************** Cmmnctn_Medium_Txt ********************************************************************************/
		if(communicationmediumi == 0) {c.addCmmnctnMediumTxt("[");}
		if(communicationmedium.hasText()) {

			c.addCmmnctnMediumTxt(String.valueOf(communicationmedium.getText()));
		} else {
			c.addCmmnctnMediumTxt("NULL");
		}

		if(communicationmediumi == communicationmediumlist.size()-1) {c.addCmmnctnMediumTxt("]");}


		/******************** communicationmediumcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationmediumcodinglist = communicationmedium.getCoding();
		for(int communicationmediumcodingi = 0; communicationmediumcodingi<communicationmediumcodinglist.size();communicationmediumcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationmediumcoding = communicationmediumcodinglist.get(communicationmediumcodingi);

		/******************** Cmmnctn_Medium_Cdg_Dsply ********************************************************************************/
		if(communicationmediumcodingi == 0) {c.addCmmnctnMediumCdgDsply("[[");}
		if(communicationmediumcoding.hasDisplay()) {

			c.addCmmnctnMediumCdgDsply(String.valueOf(communicationmediumcoding.getDisplay()));
		} else {
			c.addCmmnctnMediumCdgDsply("NULL");
		}

		if(communicationmediumcodingi == communicationmediumcodinglist.size()-1) {c.addCmmnctnMediumCdgDsply("]]");}


		/******************** Cmmnctn_Medium_Cdg_Vrsn ********************************************************************************/
		if(communicationmediumcodingi == 0) {c.addCmmnctnMediumCdgVrsn("[[");}
		if(communicationmediumcoding.hasVersion()) {

			c.addCmmnctnMediumCdgVrsn(String.valueOf(communicationmediumcoding.getVersion()));
		} else {
			c.addCmmnctnMediumCdgVrsn("NULL");
		}

		if(communicationmediumcodingi == communicationmediumcodinglist.size()-1) {c.addCmmnctnMediumCdgVrsn("]]");}


		/******************** Cmmnctn_Medium_Cdg_Cd ********************************************************************************/
		if(communicationmediumcodingi == 0) {c.addCmmnctnMediumCdgCd("[[");}
		if(communicationmediumcoding.hasCode()) {

			c.addCmmnctnMediumCdgCd(String.valueOf(communicationmediumcoding.getCode()));
		} else {
			c.addCmmnctnMediumCdgCd("NULL");
		}

		if(communicationmediumcodingi == communicationmediumcodinglist.size()-1) {c.addCmmnctnMediumCdgCd("]]");}


		/******************** Cmmnctn_Medium_Cdg_UsrSltd ********************************************************************************/
		if(communicationmediumcodingi == 0) {c.addCmmnctnMediumCdgUsrSltd("[[");}
		if(communicationmediumcoding.hasUserSelected()) {

			c.addCmmnctnMediumCdgUsrSltd(String.valueOf(communicationmediumcoding.getUserSelected()));
		} else {
			c.addCmmnctnMediumCdgUsrSltd("NULL");
		}

		if(communicationmediumcodingi == communicationmediumcodinglist.size()-1) {c.addCmmnctnMediumCdgUsrSltd("]]");}


		/******************** Cmmnctn_Medium_Cdg_Sys ********************************************************************************/
		if(communicationmediumcodingi == 0) {c.addCmmnctnMediumCdgSys("[[");}
		if(communicationmediumcoding.hasSystem()) {

			c.addCmmnctnMediumCdgSys(String.valueOf(communicationmediumcoding.getSystem()));
		} else {
			c.addCmmnctnMediumCdgSys("NULL");
		}

		if(communicationmediumcodingi == communicationmediumcodinglist.size()-1) {c.addCmmnctnMediumCdgSys("]]");}


		 };
		 };
		/******************** Cmmnctn_InRspsTo ********************************************************************************/
		if(communication.hasInResponseTo()) {

			String  array = "[";
			for(int incr=0; incr<communication.getInResponseTo().size(); incr++) {
				array = array + communication.getInResponseTo().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnInRspsTo(array);

		} else {
			c.addCmmnctnInRspsTo("NULL");
		}


		/******************** Cmmnctn_About ********************************************************************************/
		if(communication.hasAbout()) {

			String  array = "[";
			for(int incr=0; incr<communication.getAbout().size(); incr++) {
				array = array + communication.getAbout().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnAbout(array);

		} else {
			c.addCmmnctnAbout("NULL");
		}


		/******************** Cmmnctn_Received ********************************************************************************/
		if(communication.hasReceived()) {

			c.addCmmnctnReceived("\""+ca.uhn.fhir.util.DateUtils.formatDate(communication.getReceived())+"\"");
		} else {
			c.addCmmnctnReceived("NULL");
		}


		/******************** Cmmnctn_Sent ********************************************************************************/
		if(communication.hasSent()) {

			c.addCmmnctnSent("\""+ca.uhn.fhir.util.DateUtils.formatDate(communication.getSent())+"\"");
		} else {
			c.addCmmnctnSent("NULL");
		}


		/******************** Cmmnctn_Recipient ********************************************************************************/
		if(communication.hasRecipient()) {

			String  array = "[";
			for(int incr=0; incr<communication.getRecipient().size(); incr++) {
				array = array + communication.getRecipient().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnRecipient(array);

		} else {
			c.addCmmnctnRecipient("NULL");
		}


		/******************** communicationtopic ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationtopic = communication.getTopic();

		/******************** Cmmnctn_Topic_Txt ********************************************************************************/
		if(communicationtopic.hasText()) {

			c.addCmmnctnTopicTxt(String.valueOf(communicationtopic.getText()));
		} else {
			c.addCmmnctnTopicTxt("NULL");
		}


		/******************** communicationtopiccoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationtopiccodinglist = communicationtopic.getCoding();
		for(int communicationtopiccodingi = 0; communicationtopiccodingi<communicationtopiccodinglist.size();communicationtopiccodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationtopiccoding = communicationtopiccodinglist.get(communicationtopiccodingi);

		/******************** Cmmnctn_Topic_Cdg_Dsply ********************************************************************************/
		if(communicationtopiccodingi == 0) {c.addCmmnctnTopicCdgDsply("[");}
		if(communicationtopiccoding.hasDisplay()) {

			c.addCmmnctnTopicCdgDsply(String.valueOf(communicationtopiccoding.getDisplay()));
		} else {
			c.addCmmnctnTopicCdgDsply("NULL");
		}

		if(communicationtopiccodingi == communicationtopiccodinglist.size()-1) {c.addCmmnctnTopicCdgDsply("]");}


		/******************** Cmmnctn_Topic_Cdg_Vrsn ********************************************************************************/
		if(communicationtopiccodingi == 0) {c.addCmmnctnTopicCdgVrsn("[");}
		if(communicationtopiccoding.hasVersion()) {

			c.addCmmnctnTopicCdgVrsn(String.valueOf(communicationtopiccoding.getVersion()));
		} else {
			c.addCmmnctnTopicCdgVrsn("NULL");
		}

		if(communicationtopiccodingi == communicationtopiccodinglist.size()-1) {c.addCmmnctnTopicCdgVrsn("]");}


		/******************** Cmmnctn_Topic_Cdg_Cd ********************************************************************************/
		if(communicationtopiccodingi == 0) {c.addCmmnctnTopicCdgCd("[");}
		if(communicationtopiccoding.hasCode()) {

			c.addCmmnctnTopicCdgCd(String.valueOf(communicationtopiccoding.getCode()));
		} else {
			c.addCmmnctnTopicCdgCd("NULL");
		}

		if(communicationtopiccodingi == communicationtopiccodinglist.size()-1) {c.addCmmnctnTopicCdgCd("]");}


		/******************** Cmmnctn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(communicationtopiccodingi == 0) {c.addCmmnctnTopicCdgUsrSltd("[");}
		if(communicationtopiccoding.hasUserSelected()) {

			c.addCmmnctnTopicCdgUsrSltd(String.valueOf(communicationtopiccoding.getUserSelected()));
		} else {
			c.addCmmnctnTopicCdgUsrSltd("NULL");
		}

		if(communicationtopiccodingi == communicationtopiccodinglist.size()-1) {c.addCmmnctnTopicCdgUsrSltd("]");}


		/******************** Cmmnctn_Topic_Cdg_Sys ********************************************************************************/
		if(communicationtopiccodingi == 0) {c.addCmmnctnTopicCdgSys("[");}
		if(communicationtopiccoding.hasSystem()) {

			c.addCmmnctnTopicCdgSys(String.valueOf(communicationtopiccoding.getSystem()));
		} else {
			c.addCmmnctnTopicCdgSys("NULL");
		}

		if(communicationtopiccodingi == communicationtopiccodinglist.size()-1) {c.addCmmnctnTopicCdgSys("]");}


		 };
		/******************** Cmmnctn_Sender ********************************************************************************/
		if(communication.hasSender()) {

			if(communication.getSender().getReference() != null) {
			c.addCmmnctnSender(communication.getSender().getReference());
			}
		} else {
			c.addCmmnctnSender("NULL");
		}


		/******************** Cmmnctn_InstantiatesCanonical ********************************************************************************/
		if(communication.hasInstantiatesCanonical()) {

			String  array = "[";
			for(int incr=0; incr<communication.getInstantiatesCanonical().size(); incr++) {
				array = array + communication.getInstantiatesCanonical().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnInstantiatesCanonical(array);

		} else {
			c.addCmmnctnInstantiatesCanonical("NULL");
		}


		/******************** Cmmnctn_PartOf ********************************************************************************/
		if(communication.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<communication.getPartOf().size(); incr++) {
				array = array + communication.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCmmnctnPartOf(array);

		} else {
			c.addCmmnctnPartOf("NULL");
		}


		/******************** communicationstatusreason ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept communicationstatusreason = communication.getStatusReason();

		/******************** Cmmnctn_StsRsn_Txt ********************************************************************************/
		if(communicationstatusreason.hasText()) {

			c.addCmmnctnStsRsnTxt(String.valueOf(communicationstatusreason.getText()));
		} else {
			c.addCmmnctnStsRsnTxt("NULL");
		}


		/******************** communicationstatusreasoncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> communicationstatusreasoncodinglist = communicationstatusreason.getCoding();
		for(int communicationstatusreasoncodingi = 0; communicationstatusreasoncodingi<communicationstatusreasoncodinglist.size();communicationstatusreasoncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  communicationstatusreasoncoding = communicationstatusreasoncodinglist.get(communicationstatusreasoncodingi);

		/******************** Cmmnctn_StsRsn_Cdg_Dsply ********************************************************************************/
		if(communicationstatusreasoncodingi == 0) {c.addCmmnctnStsRsnCdgDsply("[");}
		if(communicationstatusreasoncoding.hasDisplay()) {

			c.addCmmnctnStsRsnCdgDsply(String.valueOf(communicationstatusreasoncoding.getDisplay()));
		} else {
			c.addCmmnctnStsRsnCdgDsply("NULL");
		}

		if(communicationstatusreasoncodingi == communicationstatusreasoncodinglist.size()-1) {c.addCmmnctnStsRsnCdgDsply("]");}


		/******************** Cmmnctn_StsRsn_Cdg_Vrsn ********************************************************************************/
		if(communicationstatusreasoncodingi == 0) {c.addCmmnctnStsRsnCdgVrsn("[");}
		if(communicationstatusreasoncoding.hasVersion()) {

			c.addCmmnctnStsRsnCdgVrsn(String.valueOf(communicationstatusreasoncoding.getVersion()));
		} else {
			c.addCmmnctnStsRsnCdgVrsn("NULL");
		}

		if(communicationstatusreasoncodingi == communicationstatusreasoncodinglist.size()-1) {c.addCmmnctnStsRsnCdgVrsn("]");}


		/******************** Cmmnctn_StsRsn_Cdg_Cd ********************************************************************************/
		if(communicationstatusreasoncodingi == 0) {c.addCmmnctnStsRsnCdgCd("[");}
		if(communicationstatusreasoncoding.hasCode()) {

			c.addCmmnctnStsRsnCdgCd(String.valueOf(communicationstatusreasoncoding.getCode()));
		} else {
			c.addCmmnctnStsRsnCdgCd("NULL");
		}

		if(communicationstatusreasoncodingi == communicationstatusreasoncodinglist.size()-1) {c.addCmmnctnStsRsnCdgCd("]");}


		/******************** Cmmnctn_StsRsn_Cdg_UsrSltd ********************************************************************************/
		if(communicationstatusreasoncodingi == 0) {c.addCmmnctnStsRsnCdgUsrSltd("[");}
		if(communicationstatusreasoncoding.hasUserSelected()) {

			c.addCmmnctnStsRsnCdgUsrSltd(String.valueOf(communicationstatusreasoncoding.getUserSelected()));
		} else {
			c.addCmmnctnStsRsnCdgUsrSltd("NULL");
		}

		if(communicationstatusreasoncodingi == communicationstatusreasoncodinglist.size()-1) {c.addCmmnctnStsRsnCdgUsrSltd("]");}


		/******************** Cmmnctn_StsRsn_Cdg_Sys ********************************************************************************/
		if(communicationstatusreasoncodingi == 0) {c.addCmmnctnStsRsnCdgSys("[");}
		if(communicationstatusreasoncoding.hasSystem()) {

			c.addCmmnctnStsRsnCdgSys(String.valueOf(communicationstatusreasoncoding.getSystem()));
		} else {
			c.addCmmnctnStsRsnCdgSys("NULL");
		}

		if(communicationstatusreasoncodingi == communicationstatusreasoncodinglist.size()-1) {c.addCmmnctnStsRsnCdgSys("]");}


		 };
		return c;
	}
}
