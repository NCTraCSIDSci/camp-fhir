package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.QuestionnaireResponse;
public class QuestionnaireResponseBidirectionalConversion 
{
	public QuestionnaireResponse QuestionnaireResponses(org.hl7.fhir.r4.model.QuestionnaireResponse questionnaireresponse) throws ParseException
	{
		 main.java.com.campfhir.model.QuestionnaireResponse q = new  main.java.com.campfhir.model.QuestionnaireResponse();

		/******************** id ********************************************************************************/
		questionnaireresponse.setId(q.getId());

		/******************** QstnaireRsps_Src ********************************************************************************/
		if(questionnaireresponse.hasSource()) {
			q.setQstnaireRspsSrc(String.valueOf(questionnaireresponse.getSource()));
		}
		/******************** QstnaireRsps_Athr ********************************************************************************/
		if(questionnaireresponse.hasAuthor()) {
			q.setQstnaireRspsAthr(String.valueOf(questionnaireresponse.getAuthor()));
		}
		/******************** QstnaireRsps_Sbjct ********************************************************************************/
		if(questionnaireresponse.hasSubject()) {
			q.setQstnaireRspsSbjct(String.valueOf(questionnaireresponse.getSubject()));
		}
		/******************** questionnaireresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseStatus questionnaireresponsestatus = questionnaireresponse.getStatus();
		q.setQstnaireRspsSts(questionnaireresponsestatus.toCode());

		/******************** QstnaireRsps_Enc ********************************************************************************/
		if(questionnaireresponse.hasEncounter()) {
			q.setQstnaireRspsEnc(String.valueOf(questionnaireresponse.getEncounter()));
		}
		/******************** QstnaireRsps_BasedOn ********************************************************************************/
		if(questionnaireresponse.hasBasedOn()) {
			q.setQstnaireRspsBasedOn(String.valueOf(questionnaireresponse.getBasedOnFirstRep()));
		}
		/******************** questionnaireresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier questionnaireresponseidentifier = questionnaireresponse.getIdentifier();

		/******************** QstnaireRsps_Id_Vl ********************************************************************************/
		if(questionnaireresponseidentifier.hasValue()) {
			q.setQstnaireRspsIdVl(String.valueOf(questionnaireresponseidentifier.getValue()));
		}
		/******************** questionnaireresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnaireresponseidentifiertype = questionnaireresponseidentifier.getType();

		/******************** questionnaireresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireresponseidentifiertypecoding = questionnaireresponseidentifiertype.getCodingFirstRep();

		/******************** QstnaireRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(questionnaireresponseidentifiertypecoding.hasDisplay()) {
			q.setQstnaireRspsIdTypCdgDsply(String.valueOf(questionnaireresponseidentifiertypecoding.getDisplay()));
		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(questionnaireresponseidentifiertypecoding.hasVersion()) {
			q.setQstnaireRspsIdTypCdgVrsn(String.valueOf(questionnaireresponseidentifiertypecoding.getVersion()));
		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(questionnaireresponseidentifiertypecoding.hasCode()) {
			q.setQstnaireRspsIdTypCdgCd(String.valueOf(questionnaireresponseidentifiertypecoding.getCode()));
		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(questionnaireresponseidentifiertypecoding.hasSystem()) {
			q.setQstnaireRspsIdTypCdgSys(String.valueOf(questionnaireresponseidentifiertypecoding.getSystem()));
		}
		/******************** QstnaireRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(questionnaireresponseidentifiertypecoding.hasUserSelected()) {
			q.setQstnaireRspsIdTypCdgUsrSltd(String.valueOf(questionnaireresponseidentifiertypecoding.getUserSelected()));
		}
		/******************** QstnaireRsps_Id_Typ_Txt ********************************************************************************/
		if(questionnaireresponseidentifiertype.hasText()) {
			q.setQstnaireRspsIdTypTxt(String.valueOf(questionnaireresponseidentifiertype.getText()));
		}
		/******************** QstnaireRsps_Id_Sys ********************************************************************************/
		if(questionnaireresponseidentifier.hasSystem()) {
			q.setQstnaireRspsIdSys(String.valueOf(questionnaireresponseidentifier.getSystem()));
		}
		/******************** QstnaireRsps_Id_Assigner ********************************************************************************/
		if(questionnaireresponseidentifier.hasAssigner()) {
			q.setQstnaireRspsIdAssigner(String.valueOf(questionnaireresponseidentifier.getAssigner()));
		}
		/******************** questionnaireresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnaireresponseidentifierperiod = questionnaireresponseidentifier.getPeriod();

		/******************** QstnaireRsps_Id_Prd_End ********************************************************************************/
		if(questionnaireresponseidentifierperiod.hasEnd()) {
			q.setQstnaireRspsIdPrdEnd(String.valueOf(questionnaireresponseidentifierperiod.getEnd()));
		}
		/******************** QstnaireRsps_Id_Prd_Strt ********************************************************************************/
		if(questionnaireresponseidentifierperiod.hasStart()) {
			q.setQstnaireRspsIdPrdStrt(String.valueOf(questionnaireresponseidentifierperiod.getStart()));
		}
		/******************** questionnaireresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse questionnaireresponseidentifieruse = questionnaireresponseidentifier.getUse();
		q.setQstnaireRspsIdUse(questionnaireresponseidentifieruse.toCode());

		/******************** QstnaireRsps_PartOf ********************************************************************************/
		if(questionnaireresponse.hasPartOf()) {
			q.setQstnaireRspsPartOf(String.valueOf(questionnaireresponse.getPartOfFirstRep()));
		}
		/******************** questionnaireresponseitem ********************************************************************************/
		org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemComponent questionnaireresponseitem = questionnaireresponse.getItemFirstRep();

		/******************** QstnaireRsps_Itm_Dfn ********************************************************************************/
		if(questionnaireresponseitem.hasDefinition()) {
			q.setQstnaireRspsItmDfn(String.valueOf(questionnaireresponseitem.getDefinition()));
		}
		/******************** QstnaireRsps_Itm_Txt ********************************************************************************/
		if(questionnaireresponseitem.hasText()) {
			q.setQstnaireRspsItmTxt(String.valueOf(questionnaireresponseitem.getText()));
		}
		/******************** questionnaireresponseitemanswer ********************************************************************************/
		org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent questionnaireresponseitemanswer = questionnaireresponseitem.getAnswerFirstRep();

		/******************** QstnaireRsps_Itm_Ans_VlBooleanTyp ********************************************************************************/
		if(questionnaireresponseitemanswer.hasValueBooleanType()) {
			q.setQstnaireRspsItmAnsVlBooleanTyp(String.valueOf(questionnaireresponseitemanswer.getValueBooleanType()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlIntegerTyp ********************************************************************************/
		if(questionnaireresponseitemanswer.hasValueIntegerType()) {
			q.setQstnaireRspsItmAnsVlIntegerTyp(String.valueOf(questionnaireresponseitemanswer.getValueIntegerType()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlDtTimeTyp ********************************************************************************/
		if(questionnaireresponseitemanswer.hasValueDateTimeType()) {
			q.setQstnaireRspsItmAnsVlDtTimeTyp(String.valueOf(questionnaireresponseitemanswer.getValueDateTimeType()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlDecimalTyp ********************************************************************************/
		if(questionnaireresponseitemanswer.hasValueDecimalType()) {
			q.setQstnaireRspsItmAnsVlDecimalTyp(String.valueOf(questionnaireresponseitemanswer.getValueDecimalType()));
		}
		/******************** questionnaireresponseitemanswervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireresponseitemanswervaluequantity = questionnaireresponseitemanswer.getValueQuantity();

		/******************** QstnaireRsps_Itm_Ans_VlQnty_Vl ********************************************************************************/
		if(questionnaireresponseitemanswervaluequantity.hasValue()) {
			q.setQstnaireRspsItmAnsVlQntyVl(String.valueOf(questionnaireresponseitemanswervaluequantity.getValue()));
		}
		/******************** questionnaireresponseitemanswervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireresponseitemanswervaluequantitycomparator = questionnaireresponseitemanswervaluequantity.getComparator();
		q.setQstnaireRspsItmAnsVlQntyCmprtr(questionnaireresponseitemanswervaluequantitycomparator.toCode());

		/******************** QstnaireRsps_Itm_Ans_VlQnty_Cd ********************************************************************************/
		if(questionnaireresponseitemanswervaluequantity.hasCode()) {
			q.setQstnaireRspsItmAnsVlQntyCd(String.valueOf(questionnaireresponseitemanswervaluequantity.getCode()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlQnty_Sys ********************************************************************************/
		if(questionnaireresponseitemanswervaluequantity.hasSystem()) {
			q.setQstnaireRspsItmAnsVlQntySys(String.valueOf(questionnaireresponseitemanswervaluequantity.getSystem()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlQnty_Unt ********************************************************************************/
		if(questionnaireresponseitemanswervaluequantity.hasUnit()) {
			q.setQstnaireRspsItmAnsVlQntyUnt(String.valueOf(questionnaireresponseitemanswervaluequantity.getUnit()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlStrgTyp ********************************************************************************/
		if(questionnaireresponseitemanswer.hasValueStringType()) {
			q.setQstnaireRspsItmAnsVlStrgTyp(String.valueOf(questionnaireresponseitemanswer.getValueStringType()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlTimeTyp ********************************************************************************/
		if(questionnaireresponseitemanswer.hasValueTimeType()) {
			q.setQstnaireRspsItmAnsVlTimeTyp(String.valueOf(questionnaireresponseitemanswer.getValueTimeType()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlUriTyp ********************************************************************************/
		if(questionnaireresponseitemanswer.hasValueUriType()) {
			q.setQstnaireRspsItmAnsVlUriTyp(String.valueOf(questionnaireresponseitemanswer.getValueUriType()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlDtTyp ********************************************************************************/
		if(questionnaireresponseitemanswer.hasValueDateType()) {
			q.setQstnaireRspsItmAnsVlDtTyp(String.valueOf(questionnaireresponseitemanswer.getValueDateType()));
		}
		/******************** questionnaireresponseitemanswervalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment questionnaireresponseitemanswervalueattachment = questionnaireresponseitemanswer.getValueAttachment();

		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(questionnaireresponseitemanswervalueattachment.hasSize()) {
			q.setQstnaireRspsItmAnsVlAttchmntSz(String.valueOf(questionnaireresponseitemanswervalueattachment.getSize()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(questionnaireresponseitemanswervalueattachment.hasLanguage()) {
			q.setQstnaireRspsItmAnsVlAttchmntLnguage(String.valueOf(questionnaireresponseitemanswervalueattachment.getLanguage()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(questionnaireresponseitemanswervalueattachment.hasContentType()) {
			q.setQstnaireRspsItmAnsVlAttchmntCntntTyp(String.valueOf(questionnaireresponseitemanswervalueattachment.getContentType()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Url ********************************************************************************/
		if(questionnaireresponseitemanswervalueattachment.hasUrl()) {
			q.setQstnaireRspsItmAnsVlAttchmntUrl(String.valueOf(questionnaireresponseitemanswervalueattachment.getUrl()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(questionnaireresponseitemanswervalueattachment.hasTitle()) {
			q.setQstnaireRspsItmAnsVlAttchmntTtl(String.valueOf(questionnaireresponseitemanswervalueattachment.getTitle()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(questionnaireresponseitemanswervalueattachment.hasHash()) {
			q.setQstnaireRspsItmAnsVlAttchmntHash(String.valueOf(questionnaireresponseitemanswervalueattachment.getHash()));
		}

		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Data ********************************************************************************/
		if(questionnaireresponseitemanswervalueattachment.hasData()) {
			q.setQstnaireRspsItmAnsVlAttchmntData(String.valueOf(questionnaireresponseitemanswervalueattachment.getData()));
		}

		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(questionnaireresponseitemanswervalueattachment.hasCreation()) {
			q.setQstnaireRspsItmAnsVlAttchmntCreation(String.valueOf(questionnaireresponseitemanswervalueattachment.getCreation()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlRfrnc ********************************************************************************/
		if(questionnaireresponseitemanswer.hasValueReference()) {
			q.setQstnaireRspsItmAnsVlRfrnc(String.valueOf(questionnaireresponseitemanswer.getValueReference()));
		}
		/******************** questionnaireresponseitemanswervaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireresponseitemanswervaluecoding = questionnaireresponseitemanswer.getValueCoding();

		/******************** QstnaireRsps_Itm_Ans_VlCdg_Dsply ********************************************************************************/
		if(questionnaireresponseitemanswervaluecoding.hasDisplay()) {
			q.setQstnaireRspsItmAnsVlCdgDsply(String.valueOf(questionnaireresponseitemanswervaluecoding.getDisplay()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Vrsn ********************************************************************************/
		if(questionnaireresponseitemanswervaluecoding.hasVersion()) {
			q.setQstnaireRspsItmAnsVlCdgVrsn(String.valueOf(questionnaireresponseitemanswervaluecoding.getVersion()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Cd ********************************************************************************/
		if(questionnaireresponseitemanswervaluecoding.hasCode()) {
			q.setQstnaireRspsItmAnsVlCdgCd(String.valueOf(questionnaireresponseitemanswervaluecoding.getCode()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Sys ********************************************************************************/
		if(questionnaireresponseitemanswervaluecoding.hasSystem()) {
			q.setQstnaireRspsItmAnsVlCdgSys(String.valueOf(questionnaireresponseitemanswervaluecoding.getSystem()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(questionnaireresponseitemanswervaluecoding.hasUserSelected()) {
			q.setQstnaireRspsItmAnsVlCdgUsrSltd(String.valueOf(questionnaireresponseitemanswervaluecoding.getUserSelected()));
		}
		/******************** QstnaireRsps_Itm_LinkId ********************************************************************************/
		if(questionnaireresponseitem.hasLinkId()) {
			q.setQstnaireRspsItmLinkId(String.valueOf(questionnaireresponseitem.getLinkId()));
		}
		/******************** QstnaireRsps_Athred ********************************************************************************/
		if(questionnaireresponse.hasAuthored()) {
			q.setQstnaireRspsAthred(String.valueOf(questionnaireresponse.getAuthored()));
		}
		/******************** QstnaireRsps_Qstnaire ********************************************************************************/
		if(questionnaireresponse.hasQuestionnaire()) {
			q.setQstnaireRspsQstnaire(String.valueOf(questionnaireresponse.getQuestionnaire()));
		}
		return q;
	}
}
