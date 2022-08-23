package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.QuestionnaireResponse;
public class QuestionnaireResponseBidirectionalConversion 
{
	public QuestionnaireResponse QuestionnaireResponses(org.hl7.fhir.r4.model.QuestionnaireResponse questionnaireresponse) throws ParseException
	{
		 main.java.com.campfhir.model.QuestionnaireResponse q = new  main.java.com.campfhir.model.QuestionnaireResponse();

		/******************** id ********************************************************************************/
		q.setId(questionnaireresponse.getIdElement().getIdPart());

		/******************** questionnaireresponseitem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemComponent> questionnaireresponseitemlist = questionnaireresponse.getItem();
		for(int questionnaireresponseitemi = 0; questionnaireresponseitemi<questionnaireresponseitemlist.size();questionnaireresponseitemi++ ) {
		org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemComponent  questionnaireresponseitem = questionnaireresponseitemlist.get(questionnaireresponseitemi);

		/******************** QstnaireRsps_Itm_Dfn ********************************************************************************/
		if(questionnaireresponseitemi == 0) {q.addQstnaireRspsItmDfn("[");}
		if(questionnaireresponseitem.hasDefinition()) {

			q.addQstnaireRspsItmDfn(String.valueOf(questionnaireresponseitem.getDefinition()));
		} else {
			q.addQstnaireRspsItmDfn("NULL");
		}

		if(questionnaireresponseitemi == questionnaireresponseitemlist.size()-1) {q.addQstnaireRspsItmDfn("]");}


		/******************** QstnaireRsps_Itm_LinkId ********************************************************************************/
		if(questionnaireresponseitemi == 0) {q.addQstnaireRspsItmLinkId("[");}
		if(questionnaireresponseitem.hasLinkId()) {

			q.addQstnaireRspsItmLinkId(String.valueOf(questionnaireresponseitem.getLinkId()));
		} else {
			q.addQstnaireRspsItmLinkId("NULL");
		}

		if(questionnaireresponseitemi == questionnaireresponseitemlist.size()-1) {q.addQstnaireRspsItmLinkId("]");}


		/******************** questionnaireresponseitemanswer ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent> questionnaireresponseitemanswerlist = questionnaireresponseitem.getAnswer();
		for(int questionnaireresponseitemansweri = 0; questionnaireresponseitemansweri<questionnaireresponseitemanswerlist.size();questionnaireresponseitemansweri++ ) {
		org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent  questionnaireresponseitemanswer = questionnaireresponseitemanswerlist.get(questionnaireresponseitemansweri);

		/******************** QstnaireRsps_Itm_Ans_VlDecimalTyp ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlDecimalTyp("[[");}
		if(questionnaireresponseitemanswer.hasValueDecimalType()) {

			q.addQstnaireRspsItmAnsVlDecimalTyp("\""+questionnaireresponseitemanswer.getValueDecimalType().getValueAsString()+"\"");
		} else {
			q.addQstnaireRspsItmAnsVlDecimalTyp("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlDecimalTyp("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlDtTyp ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlDtTyp("[[");}
		if(questionnaireresponseitemanswer.hasValueDateType()) {

			q.addQstnaireRspsItmAnsVlDtTyp("\""+questionnaireresponseitemanswer.getValueDateType().getValueAsString()+"\"");
		} else {
			q.addQstnaireRspsItmAnsVlDtTyp("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlDtTyp("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlUriTyp ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlUriTyp("[[");}
		if(questionnaireresponseitemanswer.hasValueUriType()) {

			q.addQstnaireRspsItmAnsVlUriTyp("\""+questionnaireresponseitemanswer.getValueUriType().getValueAsString()+"\"");
		} else {
			q.addQstnaireRspsItmAnsVlUriTyp("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlUriTyp("]]");}


		/******************** questionnaireresponseitemanswervalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment questionnaireresponseitemanswervalueattachment = questionnaireresponseitemanswer.getValueAttachment();

		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlAttchmntSz("[[");}
		if(questionnaireresponseitemanswervalueattachment.hasSize()) {

			q.addQstnaireRspsItmAnsVlAttchmntSz(String.valueOf(questionnaireresponseitemanswervalueattachment.getSize()));
		} else {
			q.addQstnaireRspsItmAnsVlAttchmntSz("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlAttchmntSz("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlAttchmntLnguage("[[");}
		if(questionnaireresponseitemanswervalueattachment.hasLanguage()) {

			q.addQstnaireRspsItmAnsVlAttchmntLnguage(String.valueOf(questionnaireresponseitemanswervalueattachment.getLanguage()));
		} else {
			q.addQstnaireRspsItmAnsVlAttchmntLnguage("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlAttchmntLnguage("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlAttchmntCntntTyp("[[");}
		if(questionnaireresponseitemanswervalueattachment.hasContentType()) {

			q.addQstnaireRspsItmAnsVlAttchmntCntntTyp(String.valueOf(questionnaireresponseitemanswervalueattachment.getContentType()));
		} else {
			q.addQstnaireRspsItmAnsVlAttchmntCntntTyp("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlAttchmntCntntTyp("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlAttchmntHash("[[");}
		if(questionnaireresponseitemanswervalueattachment.hasHash()) {

			q.addQstnaireRspsItmAnsVlAttchmntHash(new String(questionnaireresponseitemanswervalueattachment.getHash()));
		} else {
			q.addQstnaireRspsItmAnsVlAttchmntHash("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlAttchmntHash("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Data ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlAttchmntData("[[");}
		if(questionnaireresponseitemanswervalueattachment.hasData()) {

			q.addQstnaireRspsItmAnsVlAttchmntData(new String(questionnaireresponseitemanswervalueattachment.getData()));
		} else {
			q.addQstnaireRspsItmAnsVlAttchmntData("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlAttchmntData("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlAttchmntCreation("[[");}
		if(questionnaireresponseitemanswervalueattachment.hasCreation()) {

			q.addQstnaireRspsItmAnsVlAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaireresponseitemanswervalueattachment.getCreation())+"\"");
		} else {
			q.addQstnaireRspsItmAnsVlAttchmntCreation("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlAttchmntCreation("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlAttchmntTtl("[[");}
		if(questionnaireresponseitemanswervalueattachment.hasTitle()) {

			q.addQstnaireRspsItmAnsVlAttchmntTtl(String.valueOf(questionnaireresponseitemanswervalueattachment.getTitle()));
		} else {
			q.addQstnaireRspsItmAnsVlAttchmntTtl("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlAttchmntTtl("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Url ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlAttchmntUrl("[[");}
		if(questionnaireresponseitemanswervalueattachment.hasUrl()) {

			q.addQstnaireRspsItmAnsVlAttchmntUrl(String.valueOf(questionnaireresponseitemanswervalueattachment.getUrl()));
		} else {
			q.addQstnaireRspsItmAnsVlAttchmntUrl("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlAttchmntUrl("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlRfrnc ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlRfrnc("[[");}
		if(questionnaireresponseitemanswer.hasValueReference()) {

			if(questionnaireresponseitemanswer.getValueReference().getReference() != null) {
			q.addQstnaireRspsItmAnsVlRfrnc(questionnaireresponseitemanswer.getValueReference().getReference());
			}
		} else {
			q.addQstnaireRspsItmAnsVlRfrnc("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlRfrnc("]]");}


		/******************** questionnaireresponseitemanswervaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireresponseitemanswervaluecoding = questionnaireresponseitemanswer.getValueCoding();

		/******************** QstnaireRsps_Itm_Ans_VlCdg_Dsply ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlCdgDsply("[[");}
		if(questionnaireresponseitemanswervaluecoding.hasDisplay()) {

			q.addQstnaireRspsItmAnsVlCdgDsply(String.valueOf(questionnaireresponseitemanswervaluecoding.getDisplay()));
		} else {
			q.addQstnaireRspsItmAnsVlCdgDsply("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlCdgDsply("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlCdg_Vrsn ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlCdgVrsn("[[");}
		if(questionnaireresponseitemanswervaluecoding.hasVersion()) {

			q.addQstnaireRspsItmAnsVlCdgVrsn(String.valueOf(questionnaireresponseitemanswervaluecoding.getVersion()));
		} else {
			q.addQstnaireRspsItmAnsVlCdgVrsn("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlCdgVrsn("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlCdg_Cd ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlCdgCd("[[");}
		if(questionnaireresponseitemanswervaluecoding.hasCode()) {

			q.addQstnaireRspsItmAnsVlCdgCd(String.valueOf(questionnaireresponseitemanswervaluecoding.getCode()));
		} else {
			q.addQstnaireRspsItmAnsVlCdgCd("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlCdgCd("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlCdgUsrSltd("[[");}
		if(questionnaireresponseitemanswervaluecoding.hasUserSelected()) {

			q.addQstnaireRspsItmAnsVlCdgUsrSltd(String.valueOf(questionnaireresponseitemanswervaluecoding.getUserSelected()));
		} else {
			q.addQstnaireRspsItmAnsVlCdgUsrSltd("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlCdgUsrSltd("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlCdg_Sys ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlCdgSys("[[");}
		if(questionnaireresponseitemanswervaluecoding.hasSystem()) {

			q.addQstnaireRspsItmAnsVlCdgSys(String.valueOf(questionnaireresponseitemanswervaluecoding.getSystem()));
		} else {
			q.addQstnaireRspsItmAnsVlCdgSys("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlCdgSys("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlBooleanTyp ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlBooleanTyp("[[");}
		if(questionnaireresponseitemanswer.hasValueBooleanType()) {

			q.addQstnaireRspsItmAnsVlBooleanTyp("\""+questionnaireresponseitemanswer.getValueBooleanType().getValueAsString()+"\"");
		} else {
			q.addQstnaireRspsItmAnsVlBooleanTyp("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlBooleanTyp("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlDtTimeTyp ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlDtTimeTyp("[[");}
		if(questionnaireresponseitemanswer.hasValueDateTimeType()) {

			q.addQstnaireRspsItmAnsVlDtTimeTyp("\""+questionnaireresponseitemanswer.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			q.addQstnaireRspsItmAnsVlDtTimeTyp("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlDtTimeTyp("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlIntegerTyp ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlIntegerTyp("[[");}
		if(questionnaireresponseitemanswer.hasValueIntegerType()) {

			q.addQstnaireRspsItmAnsVlIntegerTyp("\""+questionnaireresponseitemanswer.getValueIntegerType().getValueAsString()+"\"");
		} else {
			q.addQstnaireRspsItmAnsVlIntegerTyp("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlIntegerTyp("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlTimeTyp ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlTimeTyp("[[");}
		if(questionnaireresponseitemanswer.hasValueTimeType()) {

			q.addQstnaireRspsItmAnsVlTimeTyp("\""+questionnaireresponseitemanswer.getValueTimeType().getValueAsString()+"\"");
		} else {
			q.addQstnaireRspsItmAnsVlTimeTyp("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlTimeTyp("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlStrgTyp ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlStrgTyp("[[");}
		if(questionnaireresponseitemanswer.hasValueStringType()) {

			q.addQstnaireRspsItmAnsVlStrgTyp("\""+questionnaireresponseitemanswer.getValueStringType().getValueAsString()+"\"");
		} else {
			q.addQstnaireRspsItmAnsVlStrgTyp("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlStrgTyp("]]");}


		/******************** questionnaireresponseitemanswervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireresponseitemanswervaluequantity = questionnaireresponseitemanswer.getValueQuantity();

		/******************** QstnaireRsps_Itm_Ans_VlQnty_Vl ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlQntyVl("[[");}
		if(questionnaireresponseitemanswervaluequantity.hasValue()) {

			q.addQstnaireRspsItmAnsVlQntyVl(String.valueOf(questionnaireresponseitemanswervaluequantity.getValue()));
		} else {
			q.addQstnaireRspsItmAnsVlQntyVl("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlQntyVl("]]");}


		/******************** questionnaireresponseitemanswervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireresponseitemanswervaluequantitycomparator = questionnaireresponseitemanswervaluequantity.getComparator();
		if(questionnaireresponseitemanswervaluequantitycomparator!=null) {
		if(questionnaireresponseitemansweri == 0) {

		q.addQstnaireRspsItmAnsVlQntyCmprtr("[[");		}
			q.addQstnaireRspsItmAnsVlQntyCmprtr(questionnaireresponseitemanswervaluequantitycomparator.toCode());
		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {

		q.addQstnaireRspsItmAnsVlQntyCmprtr("]]");		}

		} else {
			q.addQstnaireRspsItmAnsVlQntyCmprtr("NULL");
		}

		/******************** QstnaireRsps_Itm_Ans_VlQnty_Cd ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlQntyCd("[[");}
		if(questionnaireresponseitemanswervaluequantity.hasCode()) {

			q.addQstnaireRspsItmAnsVlQntyCd(String.valueOf(questionnaireresponseitemanswervaluequantity.getCode()));
		} else {
			q.addQstnaireRspsItmAnsVlQntyCd("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlQntyCd("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlQnty_Unt ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlQntyUnt("[[");}
		if(questionnaireresponseitemanswervaluequantity.hasUnit()) {

			q.addQstnaireRspsItmAnsVlQntyUnt(String.valueOf(questionnaireresponseitemanswervaluequantity.getUnit()));
		} else {
			q.addQstnaireRspsItmAnsVlQntyUnt("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlQntyUnt("]]");}


		/******************** QstnaireRsps_Itm_Ans_VlQnty_Sys ********************************************************************************/
		if(questionnaireresponseitemansweri == 0) {q.addQstnaireRspsItmAnsVlQntySys("[[");}
		if(questionnaireresponseitemanswervaluequantity.hasSystem()) {

			q.addQstnaireRspsItmAnsVlQntySys(String.valueOf(questionnaireresponseitemanswervaluequantity.getSystem()));
		} else {
			q.addQstnaireRspsItmAnsVlQntySys("NULL");
		}

		if(questionnaireresponseitemansweri == questionnaireresponseitemanswerlist.size()-1) {q.addQstnaireRspsItmAnsVlQntySys("]]");}


		 };
		/******************** QstnaireRsps_Itm_Txt ********************************************************************************/
		if(questionnaireresponseitem.hasText()) {

			q.addQstnaireRspsItmTxt(String.valueOf(questionnaireresponseitem.getText()));
		} else {
			q.addQstnaireRspsItmTxt("NULL");
		}


		 };
		/******************** QstnaireRsps_Src ********************************************************************************/
		if(questionnaireresponse.hasSource()) {

			if(questionnaireresponse.getSource().getReference() != null) {
			q.addQstnaireRspsSrc(questionnaireresponse.getSource().getReference());
			}
		} else {
			q.addQstnaireRspsSrc("NULL");
		}


		/******************** QstnaireRsps_Sbjct ********************************************************************************/
		if(questionnaireresponse.hasSubject()) {

			if(questionnaireresponse.getSubject().getReference() != null) {
			q.addQstnaireRspsSbjct(questionnaireresponse.getSubject().getReference());
			}
		} else {
			q.addQstnaireRspsSbjct("NULL");
		}


		/******************** questionnaireresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseStatus questionnaireresponsestatus = questionnaireresponse.getStatus();
		if(questionnaireresponsestatus!=null) {
			q.addQstnaireRspsSts(questionnaireresponsestatus.toCode());
		} else {
			q.addQstnaireRspsSts("NULL");
		}

		/******************** QstnaireRsps_Enc ********************************************************************************/
		if(questionnaireresponse.hasEncounter()) {

			if(questionnaireresponse.getEncounter().getReference() != null) {
			q.addQstnaireRspsEnc(questionnaireresponse.getEncounter().getReference());
			}
		} else {
			q.addQstnaireRspsEnc("NULL");
		}


		/******************** QstnaireRsps_BasedOn ********************************************************************************/
		if(questionnaireresponse.hasBasedOn()) {

			String  array = "[";
			for(int incr=0; incr<questionnaireresponse.getBasedOn().size(); incr++) {
				array = array + questionnaireresponse.getBasedOn().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			q.addQstnaireRspsBasedOn(array);

		} else {
			q.addQstnaireRspsBasedOn("NULL");
		}


		/******************** questionnaireresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier questionnaireresponseidentifier = questionnaireresponse.getIdentifier();

		/******************** QstnaireRsps_Id_Vl ********************************************************************************/
		if(questionnaireresponseidentifier.hasValue()) {

			q.addQstnaireRspsIdVl(String.valueOf(questionnaireresponseidentifier.getValue()));
		} else {
			q.addQstnaireRspsIdVl("NULL");
		}


		/******************** questionnaireresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnaireresponseidentifiertype = questionnaireresponseidentifier.getType();

		/******************** QstnaireRsps_Id_Typ_Txt ********************************************************************************/
		if(questionnaireresponseidentifiertype.hasText()) {

			q.addQstnaireRspsIdTypTxt(String.valueOf(questionnaireresponseidentifiertype.getText()));
		} else {
			q.addQstnaireRspsIdTypTxt("NULL");
		}


		/******************** questionnaireresponseidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> questionnaireresponseidentifiertypecodinglist = questionnaireresponseidentifiertype.getCoding();
		for(int questionnaireresponseidentifiertypecodingi = 0; questionnaireresponseidentifiertypecodingi<questionnaireresponseidentifiertypecodinglist.size();questionnaireresponseidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  questionnaireresponseidentifiertypecoding = questionnaireresponseidentifiertypecodinglist.get(questionnaireresponseidentifiertypecodingi);

		/******************** QstnaireRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(questionnaireresponseidentifiertypecodingi == 0) {q.addQstnaireRspsIdTypCdgDsply("[");}
		if(questionnaireresponseidentifiertypecoding.hasDisplay()) {

			q.addQstnaireRspsIdTypCdgDsply(String.valueOf(questionnaireresponseidentifiertypecoding.getDisplay()));
		} else {
			q.addQstnaireRspsIdTypCdgDsply("NULL");
		}

		if(questionnaireresponseidentifiertypecodingi == questionnaireresponseidentifiertypecodinglist.size()-1) {q.addQstnaireRspsIdTypCdgDsply("]");}


		/******************** QstnaireRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(questionnaireresponseidentifiertypecodingi == 0) {q.addQstnaireRspsIdTypCdgVrsn("[");}
		if(questionnaireresponseidentifiertypecoding.hasVersion()) {

			q.addQstnaireRspsIdTypCdgVrsn(String.valueOf(questionnaireresponseidentifiertypecoding.getVersion()));
		} else {
			q.addQstnaireRspsIdTypCdgVrsn("NULL");
		}

		if(questionnaireresponseidentifiertypecodingi == questionnaireresponseidentifiertypecodinglist.size()-1) {q.addQstnaireRspsIdTypCdgVrsn("]");}


		/******************** QstnaireRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(questionnaireresponseidentifiertypecodingi == 0) {q.addQstnaireRspsIdTypCdgCd("[");}
		if(questionnaireresponseidentifiertypecoding.hasCode()) {

			q.addQstnaireRspsIdTypCdgCd(String.valueOf(questionnaireresponseidentifiertypecoding.getCode()));
		} else {
			q.addQstnaireRspsIdTypCdgCd("NULL");
		}

		if(questionnaireresponseidentifiertypecodingi == questionnaireresponseidentifiertypecodinglist.size()-1) {q.addQstnaireRspsIdTypCdgCd("]");}


		/******************** QstnaireRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(questionnaireresponseidentifiertypecodingi == 0) {q.addQstnaireRspsIdTypCdgUsrSltd("[");}
		if(questionnaireresponseidentifiertypecoding.hasUserSelected()) {

			q.addQstnaireRspsIdTypCdgUsrSltd(String.valueOf(questionnaireresponseidentifiertypecoding.getUserSelected()));
		} else {
			q.addQstnaireRspsIdTypCdgUsrSltd("NULL");
		}

		if(questionnaireresponseidentifiertypecodingi == questionnaireresponseidentifiertypecodinglist.size()-1) {q.addQstnaireRspsIdTypCdgUsrSltd("]");}


		/******************** QstnaireRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(questionnaireresponseidentifiertypecodingi == 0) {q.addQstnaireRspsIdTypCdgSys("[");}
		if(questionnaireresponseidentifiertypecoding.hasSystem()) {

			q.addQstnaireRspsIdTypCdgSys(String.valueOf(questionnaireresponseidentifiertypecoding.getSystem()));
		} else {
			q.addQstnaireRspsIdTypCdgSys("NULL");
		}

		if(questionnaireresponseidentifiertypecodingi == questionnaireresponseidentifiertypecodinglist.size()-1) {q.addQstnaireRspsIdTypCdgSys("]");}


		 };
		/******************** questionnaireresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnaireresponseidentifierperiod = questionnaireresponseidentifier.getPeriod();

		/******************** QstnaireRsps_Id_Prd_Strt ********************************************************************************/
		if(questionnaireresponseidentifierperiod.hasStart()) {

			q.addQstnaireRspsIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaireresponseidentifierperiod.getStart())+"\"");
		} else {
			q.addQstnaireRspsIdPrdStrt("NULL");
		}


		/******************** QstnaireRsps_Id_Prd_End ********************************************************************************/
		if(questionnaireresponseidentifierperiod.hasEnd()) {

			q.addQstnaireRspsIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaireresponseidentifierperiod.getEnd())+"\"");
		} else {
			q.addQstnaireRspsIdPrdEnd("NULL");
		}


		/******************** questionnaireresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse questionnaireresponseidentifieruse = questionnaireresponseidentifier.getUse();
		if(questionnaireresponseidentifieruse!=null) {
			q.addQstnaireRspsIdUse(questionnaireresponseidentifieruse.toCode());
		} else {
			q.addQstnaireRspsIdUse("NULL");
		}

		/******************** QstnaireRsps_Id_Assigner ********************************************************************************/
		if(questionnaireresponseidentifier.hasAssigner()) {

			if(questionnaireresponseidentifier.getAssigner().getReference() != null) {
			q.addQstnaireRspsIdAssigner(questionnaireresponseidentifier.getAssigner().getReference());
			}
		} else {
			q.addQstnaireRspsIdAssigner("NULL");
		}


		/******************** QstnaireRsps_Id_Sys ********************************************************************************/
		if(questionnaireresponseidentifier.hasSystem()) {

			q.addQstnaireRspsIdSys(String.valueOf(questionnaireresponseidentifier.getSystem()));
		} else {
			q.addQstnaireRspsIdSys("NULL");
		}


		/******************** QstnaireRsps_Qstnaire ********************************************************************************/
		if(questionnaireresponse.hasQuestionnaire()) {

			q.addQstnaireRspsQstnaire(String.valueOf(questionnaireresponse.getQuestionnaire()));
		} else {
			q.addQstnaireRspsQstnaire("NULL");
		}


		/******************** QstnaireRsps_Athred ********************************************************************************/
		if(questionnaireresponse.hasAuthored()) {

			q.addQstnaireRspsAthred("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaireresponse.getAuthored())+"\"");
		} else {
			q.addQstnaireRspsAthred("NULL");
		}


		/******************** QstnaireRsps_Athr ********************************************************************************/
		if(questionnaireresponse.hasAuthor()) {

			if(questionnaireresponse.getAuthor().getReference() != null) {
			q.addQstnaireRspsAthr(questionnaireresponse.getAuthor().getReference());
			}
		} else {
			q.addQstnaireRspsAthr("NULL");
		}


		/******************** QstnaireRsps_PartOf ********************************************************************************/
		if(questionnaireresponse.hasPartOf()) {

			String  array = "[";
			for(int incr=0; incr<questionnaireresponse.getPartOf().size(); incr++) {
				array = array + questionnaireresponse.getPartOf().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			q.addQstnaireRspsPartOf(array);

		} else {
			q.addQstnaireRspsPartOf("NULL");
		}


		return q;
	}
}
