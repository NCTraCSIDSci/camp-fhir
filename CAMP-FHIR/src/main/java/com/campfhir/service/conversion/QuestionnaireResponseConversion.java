package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.QuestionnaireResponse;
public class QuestionnaireResponseConversion 
{
	public org.hl7.fhir.r4.model.QuestionnaireResponse QuestionnaireResponses(QuestionnaireResponse q) throws ParseException
	{
		org.hl7.fhir.r4.model.QuestionnaireResponse questionnaireresponse = new org.hl7.fhir.r4.model.QuestionnaireResponse();

		/******************** id ********************************************************************************/
		questionnaireresponse.setId(q.getId());

		/******************** QstnaireRsps_Athr ********************************************************************************/
		if(q.getQstnaireRspsAthr() != null) {
			questionnaireresponse.setAuthor( new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsAthr()));
		}
		/******************** QstnaireRsps_Athred ********************************************************************************/
		if(q.getQstnaireRspsAthred() != null) {
			java.text.SimpleDateFormat QstnaireRsps_Athredsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date QstnaireRsps_Athreddate = QstnaireRsps_Athredsdf.parse(q.getQstnaireRspsAthred());
			questionnaireresponse.setAuthored(QstnaireRsps_Athreddate);
		}
		/******************** QstnaireRsps_BasedOn ********************************************************************************/
		if(q.getQstnaireRspsBasedOn() != null) {
			questionnaireresponse.addBasedOn( new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsBasedOn()));
		}
		/******************** QstnaireRsps_Enc ********************************************************************************/
		if(q.getQstnaireRspsEnc() != null) {
			questionnaireresponse.setEncounter( new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsEnc()));
		}
		/******************** questionnaireresponseidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier questionnaireresponseidentifier =  new org.hl7.fhir.r4.model.Identifier();
		questionnaireresponse.setIdentifier(questionnaireresponseidentifier);

		/******************** QstnaireRsps_Id_Assigner ********************************************************************************/
		if(q.getQstnaireRspsIdAssigner() != null) {
			questionnaireresponseidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsIdAssigner()));
		}
		/******************** questionnaireresponseidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnaireresponseidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		questionnaireresponseidentifier.setPeriod(questionnaireresponseidentifierperiod);

		/******************** QstnaireRsps_Id_Prd_End ********************************************************************************/
		if(q.getQstnaireRspsIdPrdEnd() != null) {
			java.text.SimpleDateFormat QstnaireRsps_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date QstnaireRsps_Id_Prd_Enddate = QstnaireRsps_Id_Prd_Endsdf.parse(q.getQstnaireRspsIdPrdEnd());
			questionnaireresponseidentifierperiod.setEnd(QstnaireRsps_Id_Prd_Enddate);
		}
		/******************** QstnaireRsps_Id_Prd_Strt ********************************************************************************/
		if(q.getQstnaireRspsIdPrdStrt() != null) {
			java.text.SimpleDateFormat QstnaireRsps_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date QstnaireRsps_Id_Prd_Strtdate = QstnaireRsps_Id_Prd_Strtsdf.parse(q.getQstnaireRspsIdPrdStrt());
			questionnaireresponseidentifierperiod.setStart(QstnaireRsps_Id_Prd_Strtdate);
		}
		/******************** QstnaireRsps_Id_Sys ********************************************************************************/
		if(q.getQstnaireRspsIdSys() != null) {
			questionnaireresponseidentifier.setSystem(q.getQstnaireRspsIdSys());
		}
		/******************** questionnaireresponseidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnaireresponseidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		questionnaireresponseidentifier.setType(questionnaireresponseidentifiertype);

		/******************** questionnaireresponseidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireresponseidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		questionnaireresponseidentifiertype.addCoding(questionnaireresponseidentifiertypecoding);

		/******************** QstnaireRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgCd() != null) {
			questionnaireresponseidentifiertypecoding.setCode(q.getQstnaireRspsIdTypCdgCd());
		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgDsply() != null) {
			questionnaireresponseidentifiertypecoding.setDisplay(q.getQstnaireRspsIdTypCdgDsply());
		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgSys() != null) {
			questionnaireresponseidentifiertypecoding.setSystem(q.getQstnaireRspsIdTypCdgSys());
		}
		/******************** QstnaireRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgUsrSltd() != null) {
			questionnaireresponseidentifiertypecoding.setUserSelected(Boolean.parseBoolean(q.getQstnaireRspsIdTypCdgUsrSltd()));
		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgVrsn() != null) {
			questionnaireresponseidentifiertypecoding.setVersion(q.getQstnaireRspsIdTypCdgVrsn());
		}
		/******************** QstnaireRsps_Id_Typ_Txt ********************************************************************************/
		if(q.getQstnaireRspsIdTypTxt() != null) {
			questionnaireresponseidentifiertype.setText(q.getQstnaireRspsIdTypTxt());
		}
		/******************** questionnaireresponseidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory questionnaireresponseidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		questionnaireresponseidentifier.setUse(questionnaireresponseidentifieruse.fromCode(q.getQstnaireRspsIdUse()));

		/******************** QstnaireRsps_Id_Vl ********************************************************************************/
		if(q.getQstnaireRspsIdVl() != null) {
			questionnaireresponseidentifier.setValue(q.getQstnaireRspsIdVl());
		}
		/******************** questionnaireresponseitem ********************************************************************************/
		org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemComponent questionnaireresponseitem =  new org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemComponent();
		questionnaireresponse.addItem(questionnaireresponseitem);

		/******************** questionnaireresponseitemanswer ********************************************************************************/
		org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent questionnaireresponseitemanswer =  new org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseItemAnswerComponent();
		questionnaireresponseitem.addAnswer(questionnaireresponseitemanswer);

		/******************** questionnaireresponseitemanswervalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment questionnaireresponseitemanswervalueattachment =  new org.hl7.fhir.r4.model.Attachment();
		questionnaireresponseitemanswer.setValue(questionnaireresponseitemanswervalueattachment);

		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntCntntTyp() != null) {
			questionnaireresponseitemanswervalueattachment.setContentType(q.getQstnaireRspsItmAnsVlAttchmntCntntTyp());
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntCreation() != null) {
			java.text.SimpleDateFormat QstnaireRsps_Itm_Ans_VlAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date QstnaireRsps_Itm_Ans_VlAttchmnt_Creationdate = QstnaireRsps_Itm_Ans_VlAttchmnt_Creationsdf.parse(q.getQstnaireRspsItmAnsVlAttchmntCreation());
			questionnaireresponseitemanswervalueattachment.setCreation(QstnaireRsps_Itm_Ans_VlAttchmnt_Creationdate);
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Data ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntData() != null) {
			questionnaireresponseitemanswervalueattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(q.getQstnaireRspsItmAnsVlAttchmntData()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntHash() != null) {
			questionnaireresponseitemanswervalueattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(q.getQstnaireRspsItmAnsVlAttchmntHash()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntLnguage() != null) {
			questionnaireresponseitemanswervalueattachment.setLanguage(q.getQstnaireRspsItmAnsVlAttchmntLnguage());
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntSz() != null) {
			questionnaireresponseitemanswervalueattachment.setSize(Integer.parseInt(q.getQstnaireRspsItmAnsVlAttchmntSz()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntTtl() != null) {
			questionnaireresponseitemanswervalueattachment.setTitle(q.getQstnaireRspsItmAnsVlAttchmntTtl());
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Url ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntUrl() != null) {
			questionnaireresponseitemanswervalueattachment.setUrl(q.getQstnaireRspsItmAnsVlAttchmntUrl());
		}
		/******************** QstnaireRsps_Itm_Ans_VlBooleanTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlBooleanTyp() != null) {
			questionnaireresponseitemanswer.setValue( new org.hl7.fhir.r4.model.BooleanType(q.getQstnaireRspsItmAnsVlBooleanTyp()));
		}
		/******************** questionnaireresponseitemanswervaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireresponseitemanswervaluecoding =  new org.hl7.fhir.r4.model.Coding();
		questionnaireresponseitemanswer.setValue(questionnaireresponseitemanswervaluecoding);

		/******************** QstnaireRsps_Itm_Ans_VlCdg_Cd ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgCd() != null) {
			questionnaireresponseitemanswervaluecoding.setCode(q.getQstnaireRspsItmAnsVlCdgCd());
		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Dsply ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgDsply() != null) {
			questionnaireresponseitemanswervaluecoding.setDisplay(q.getQstnaireRspsItmAnsVlCdgDsply());
		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Sys ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgSys() != null) {
			questionnaireresponseitemanswervaluecoding.setSystem(q.getQstnaireRspsItmAnsVlCdgSys());
		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgUsrSltd() != null) {
			questionnaireresponseitemanswervaluecoding.setUserSelected(Boolean.parseBoolean(q.getQstnaireRspsItmAnsVlCdgUsrSltd()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Vrsn ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgVrsn() != null) {
			questionnaireresponseitemanswervaluecoding.setVersion(q.getQstnaireRspsItmAnsVlCdgVrsn());
		}
		/******************** QstnaireRsps_Itm_Ans_VlDtTimeTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlDtTimeTyp() != null) {
			questionnaireresponseitemanswer.setValue( new org.hl7.fhir.r4.model.DateTimeType(q.getQstnaireRspsItmAnsVlDtTimeTyp()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlDtTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlDtTyp() != null) {
			questionnaireresponseitemanswer.setValue( new org.hl7.fhir.r4.model.DateType(q.getQstnaireRspsItmAnsVlDtTyp()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlDecimalTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlDecimalTyp() != null) {
			questionnaireresponseitemanswer.setValue( new org.hl7.fhir.r4.model.DecimalType(q.getQstnaireRspsItmAnsVlDecimalTyp()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlIntegerTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlIntegerTyp() != null) {
			questionnaireresponseitemanswer.setValue( new org.hl7.fhir.r4.model.IntegerType(q.getQstnaireRspsItmAnsVlIntegerTyp()));
		}
		/******************** questionnaireresponseitemanswervaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireresponseitemanswervaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		questionnaireresponseitemanswer.setValue(questionnaireresponseitemanswervaluequantity);

		/******************** QstnaireRsps_Itm_Ans_VlQnty_Cd ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlQntyCd() != null) {
			questionnaireresponseitemanswervaluequantity.setCode(q.getQstnaireRspsItmAnsVlQntyCd());
		}
		/******************** questionnaireresponseitemanswervaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory questionnaireresponseitemanswervaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		questionnaireresponseitemanswervaluequantity.setComparator(questionnaireresponseitemanswervaluequantitycomparator.fromCode(q.getQstnaireRspsItmAnsVlQntyCmprtr()));

		/******************** QstnaireRsps_Itm_Ans_VlQnty_Sys ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlQntySys() != null) {
			questionnaireresponseitemanswervaluequantity.setSystem(q.getQstnaireRspsItmAnsVlQntySys());
		}
		/******************** QstnaireRsps_Itm_Ans_VlQnty_Unt ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlQntyUnt() != null) {
			questionnaireresponseitemanswervaluequantity.setUnit(q.getQstnaireRspsItmAnsVlQntyUnt());
		}
		/******************** QstnaireRsps_Itm_Ans_VlQnty_Vl ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlQntyVl() != null) {
			questionnaireresponseitemanswervaluequantity.setValue(Double.parseDouble((q.getQstnaireRspsItmAnsVlQntyVl())));
		}
		/******************** QstnaireRsps_Itm_Ans_VlRfrnc ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlRfrnc() != null) {
			questionnaireresponseitemanswer.setValue( new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsItmAnsVlRfrnc()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlStrgTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlStrgTyp() != null) {
			questionnaireresponseitemanswer.setValue( new org.hl7.fhir.r4.model.StringType(q.getQstnaireRspsItmAnsVlStrgTyp()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlTimeTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlTimeTyp() != null) {
			questionnaireresponseitemanswer.setValue( new org.hl7.fhir.r4.model.TimeType(q.getQstnaireRspsItmAnsVlTimeTyp()));
		}
		/******************** QstnaireRsps_Itm_Ans_VlUriTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlUriTyp() != null) {
			questionnaireresponseitemanswer.setValue( new org.hl7.fhir.r4.model.UriType(q.getQstnaireRspsItmAnsVlUriTyp()));
		}
		/******************** QstnaireRsps_Itm_Dfn ********************************************************************************/
		if(q.getQstnaireRspsItmDfn() != null) {
			questionnaireresponseitem.setDefinition(q.getQstnaireRspsItmDfn());
		}
		/******************** QstnaireRsps_Itm_LinkId ********************************************************************************/
		if(q.getQstnaireRspsItmLinkId() != null) {
			questionnaireresponseitem.setLinkId(q.getQstnaireRspsItmLinkId());
		}
		/******************** QstnaireRsps_Itm_Txt ********************************************************************************/
		if(q.getQstnaireRspsItmTxt() != null) {
			questionnaireresponseitem.setText(q.getQstnaireRspsItmTxt());
		}
		/******************** QstnaireRsps_PartOf ********************************************************************************/
		if(q.getQstnaireRspsPartOf() != null) {
			questionnaireresponse.addPartOf( new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsPartOf()));
		}
		/******************** QstnaireRsps_Qstnaire ********************************************************************************/
		if(q.getQstnaireRspsQstnaire() != null) {
			questionnaireresponse.setQuestionnaire(q.getQstnaireRspsQstnaire());
		}
		/******************** QstnaireRsps_Src ********************************************************************************/
		if(q.getQstnaireRspsSrc() != null) {
			questionnaireresponse.setSource( new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsSrc()));
		}
		/******************** questionnaireresponsestatus ********************************************************************************/
		org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseStatusEnumFactory questionnaireresponsestatus =  new org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseStatusEnumFactory();
		questionnaireresponse.setStatus(questionnaireresponsestatus.fromCode(q.getQstnaireRspsSts()));

		/******************** QstnaireRsps_Sbjct ********************************************************************************/
		if(q.getQstnaireRspsSbjct() != null) {
			questionnaireresponse.setSubject( new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsSbjct()));
		}
		return questionnaireresponse;
	}
}
