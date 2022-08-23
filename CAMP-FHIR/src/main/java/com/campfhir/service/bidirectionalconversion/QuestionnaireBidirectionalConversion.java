package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Questionnaire;
public class QuestionnaireBidirectionalConversion 
{
	public Questionnaire Questionnaires(org.hl7.fhir.r4.model.Questionnaire questionnaire) throws ParseException
	{
		 main.java.com.campfhir.model.Questionnaire q = new  main.java.com.campfhir.model.Questionnaire();

		/******************** id ********************************************************************************/
		q.setId(questionnaire.getIdElement().getIdPart());

		/******************** Qstnaire_Nm ********************************************************************************/
		if(questionnaire.hasName()) {

			q.addQstnaireNm(String.valueOf(questionnaire.getName()));
		} else {
			q.addQstnaireNm("NULL");
		}


		/******************** Qstnaire_Vrsn ********************************************************************************/
		if(questionnaire.hasVersion()) {

			q.addQstnaireVrsn(String.valueOf(questionnaire.getVersion()));
		} else {
			q.addQstnaireVrsn("NULL");
		}


		/******************** questionnaireitem ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent> questionnaireitemlist = questionnaire.getItem();
		for(int questionnaireitemi = 0; questionnaireitemi<questionnaireitemlist.size();questionnaireitemi++ ) {
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent  questionnaireitem = questionnaireitemlist.get(questionnaireitemi);

		/******************** questionnaireitemtype ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType questionnaireitemtype = questionnaireitem.getType();
		if(questionnaireitemtype!=null) {
		if(questionnaireitemi == 0) {

		q.addQstnaireItmTyp("[");		}
			q.addQstnaireItmTyp(questionnaireitemtype.toCode());
		if(questionnaireitemi == questionnaireitemlist.size()-1) {

		q.addQstnaireItmTyp("]");		}

		} else {
			q.addQstnaireItmTyp("NULL");
		}

		/******************** Qstnaire_Itm_Dfn ********************************************************************************/
		if(questionnaireitemi == 0) {q.addQstnaireItmDfn("[");}
		if(questionnaireitem.hasDefinition()) {

			q.addQstnaireItmDfn(String.valueOf(questionnaireitem.getDefinition()));
		} else {
			q.addQstnaireItmDfn("NULL");
		}

		if(questionnaireitemi == questionnaireitemlist.size()-1) {q.addQstnaireItmDfn("]");}


		/******************** questionnaireitemcode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> questionnaireitemcodelist = questionnaireitem.getCode();
		for(int questionnaireitemcodei = 0; questionnaireitemcodei<questionnaireitemcodelist.size();questionnaireitemcodei++ ) {
		org.hl7.fhir.r4.model.Coding  questionnaireitemcode = questionnaireitemcodelist.get(questionnaireitemcodei);

		/******************** Qstnaire_Itm_Cd_Dsply ********************************************************************************/
		if(questionnaireitemcodei == 0) {q.addQstnaireItmCdDsply("[[");}
		if(questionnaireitemcode.hasDisplay()) {

			q.addQstnaireItmCdDsply(String.valueOf(questionnaireitemcode.getDisplay()));
		} else {
			q.addQstnaireItmCdDsply("NULL");
		}

		if(questionnaireitemcodei == questionnaireitemcodelist.size()-1) {q.addQstnaireItmCdDsply("]]");}


		/******************** Qstnaire_Itm_Cd_Vrsn ********************************************************************************/
		if(questionnaireitemcodei == 0) {q.addQstnaireItmCdVrsn("[[");}
		if(questionnaireitemcode.hasVersion()) {

			q.addQstnaireItmCdVrsn(String.valueOf(questionnaireitemcode.getVersion()));
		} else {
			q.addQstnaireItmCdVrsn("NULL");
		}

		if(questionnaireitemcodei == questionnaireitemcodelist.size()-1) {q.addQstnaireItmCdVrsn("]]");}


		/******************** Qstnaire_Itm_Cd_UsrSltd ********************************************************************************/
		if(questionnaireitemcodei == 0) {q.addQstnaireItmCdUsrSltd("[[");}
		if(questionnaireitemcode.hasUserSelected()) {

			q.addQstnaireItmCdUsrSltd(String.valueOf(questionnaireitemcode.getUserSelected()));
		} else {
			q.addQstnaireItmCdUsrSltd("NULL");
		}

		if(questionnaireitemcodei == questionnaireitemcodelist.size()-1) {q.addQstnaireItmCdUsrSltd("]]");}


		/******************** Qstnaire_Itm_Cd_Sys ********************************************************************************/
		if(questionnaireitemcodei == 0) {q.addQstnaireItmCdSys("[[");}
		if(questionnaireitemcode.hasSystem()) {

			q.addQstnaireItmCdSys(String.valueOf(questionnaireitemcode.getSystem()));
		} else {
			q.addQstnaireItmCdSys("NULL");
		}

		if(questionnaireitemcodei == questionnaireitemcodelist.size()-1) {q.addQstnaireItmCdSys("]]");}


		 };
		/******************** Qstnaire_Itm_Required ********************************************************************************/
		if(questionnaireitem.hasRequired()) {

			q.addQstnaireItmRequired(String.valueOf(questionnaireitem.getRequired()));
		} else {
			q.addQstnaireItmRequired("NULL");
		}


		/******************** Qstnaire_Itm_LinkId ********************************************************************************/
		if(questionnaireitem.hasLinkId()) {

			q.addQstnaireItmLinkId(String.valueOf(questionnaireitem.getLinkId()));
		} else {
			q.addQstnaireItmLinkId("NULL");
		}


		/******************** Qstnaire_Itm_Txt ********************************************************************************/
		if(questionnaireitem.hasText()) {

			q.addQstnaireItmTxt(String.valueOf(questionnaireitem.getText()));
		} else {
			q.addQstnaireItmTxt("NULL");
		}


		/******************** Qstnaire_Itm_Prefix ********************************************************************************/
		if(questionnaireitem.hasPrefix()) {

			q.addQstnaireItmPrefix(String.valueOf(questionnaireitem.getPrefix()));
		} else {
			q.addQstnaireItmPrefix("NULL");
		}


		/******************** Qstnaire_Itm_MxLength ********************************************************************************/
		if(questionnaireitem.hasMaxLength()) {

			q.addQstnaireItmMxLength(String.valueOf(questionnaireitem.getMaxLength()));
		} else {
			q.addQstnaireItmMxLength("NULL");
		}


		/******************** questionnaireitemenablewhen ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent> questionnaireitemenablewhenlist = questionnaireitem.getEnableWhen();
		for(int questionnaireitemenablewheni = 0; questionnaireitemenablewheni<questionnaireitemenablewhenlist.size();questionnaireitemenablewheni++ ) {
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent  questionnaireitemenablewhen = questionnaireitemenablewhenlist.get(questionnaireitemenablewheni);

		/******************** questionnaireitemenablewhenoperator ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemOperator questionnaireitemenablewhenoperator = questionnaireitemenablewhen.getOperator();
		if(questionnaireitemenablewhenoperator!=null) {
		if(questionnaireitemenablewheni == 0) {

		q.addQstnaireItmEnableWhenOperator("[[");		}
			q.addQstnaireItmEnableWhenOperator(questionnaireitemenablewhenoperator.toCode());
		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {

		q.addQstnaireItmEnableWhenOperator("]]");		}

		} else {
			q.addQstnaireItmEnableWhenOperator("NULL");
		}

		/******************** Qstnaire_Itm_EnableWhen_AnsDtTimeTyp ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsDtTimeTyp("[[");}
		if(questionnaireitemenablewhen.hasAnswerDateTimeType()) {

			q.addQstnaireItmEnableWhenAnsDtTimeTyp("\""+questionnaireitemenablewhen.getAnswerDateTimeType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmEnableWhenAnsDtTimeTyp("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsDtTimeTyp("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsStrgTyp ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsStrgTyp("[[");}
		if(questionnaireitemenablewhen.hasAnswerStringType()) {

			q.addQstnaireItmEnableWhenAnsStrgTyp("\""+questionnaireitemenablewhen.getAnswerStringType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmEnableWhenAnsStrgTyp("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsStrgTyp("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsBooleanTyp ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsBooleanTyp("[[");}
		if(questionnaireitemenablewhen.hasAnswerBooleanType()) {

			q.addQstnaireItmEnableWhenAnsBooleanTyp("\""+questionnaireitemenablewhen.getAnswerBooleanType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmEnableWhenAnsBooleanTyp("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsBooleanTyp("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsDecimalTyp ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsDecimalTyp("[[");}
		if(questionnaireitemenablewhen.hasAnswerDecimalType()) {

			q.addQstnaireItmEnableWhenAnsDecimalTyp("\""+questionnaireitemenablewhen.getAnswerDecimalType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmEnableWhenAnsDecimalTyp("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsDecimalTyp("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsIntegerTyp ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsIntegerTyp("[[");}
		if(questionnaireitemenablewhen.hasAnswerIntegerType()) {

			q.addQstnaireItmEnableWhenAnsIntegerTyp("\""+questionnaireitemenablewhen.getAnswerIntegerType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmEnableWhenAnsIntegerTyp("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsIntegerTyp("]]");}


		/******************** questionnaireitemenablewhenanswercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireitemenablewhenanswercoding = questionnaireitemenablewhen.getAnswerCoding();

		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Dsply ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsCdgDsply("[[");}
		if(questionnaireitemenablewhenanswercoding.hasDisplay()) {

			q.addQstnaireItmEnableWhenAnsCdgDsply(String.valueOf(questionnaireitemenablewhenanswercoding.getDisplay()));
		} else {
			q.addQstnaireItmEnableWhenAnsCdgDsply("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsCdgDsply("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Vrsn ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsCdgVrsn("[[");}
		if(questionnaireitemenablewhenanswercoding.hasVersion()) {

			q.addQstnaireItmEnableWhenAnsCdgVrsn(String.valueOf(questionnaireitemenablewhenanswercoding.getVersion()));
		} else {
			q.addQstnaireItmEnableWhenAnsCdgVrsn("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsCdgVrsn("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Cd ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsCdgCd("[[");}
		if(questionnaireitemenablewhenanswercoding.hasCode()) {

			q.addQstnaireItmEnableWhenAnsCdgCd(String.valueOf(questionnaireitemenablewhenanswercoding.getCode()));
		} else {
			q.addQstnaireItmEnableWhenAnsCdgCd("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsCdgCd("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_UsrSltd ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsCdgUsrSltd("[[");}
		if(questionnaireitemenablewhenanswercoding.hasUserSelected()) {

			q.addQstnaireItmEnableWhenAnsCdgUsrSltd(String.valueOf(questionnaireitemenablewhenanswercoding.getUserSelected()));
		} else {
			q.addQstnaireItmEnableWhenAnsCdgUsrSltd("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsCdgUsrSltd("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Sys ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsCdgSys("[[");}
		if(questionnaireitemenablewhenanswercoding.hasSystem()) {

			q.addQstnaireItmEnableWhenAnsCdgSys(String.valueOf(questionnaireitemenablewhenanswercoding.getSystem()));
		} else {
			q.addQstnaireItmEnableWhenAnsCdgSys("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsCdgSys("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsRfrnc ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsRfrnc("[[");}
		if(questionnaireitemenablewhen.hasAnswerReference()) {

			if(questionnaireitemenablewhen.getAnswerReference().getReference() != null) {
			q.addQstnaireItmEnableWhenAnsRfrnc(questionnaireitemenablewhen.getAnswerReference().getReference());
			}
		} else {
			q.addQstnaireItmEnableWhenAnsRfrnc("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsRfrnc("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsTimeTyp ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsTimeTyp("[[");}
		if(questionnaireitemenablewhen.hasAnswerTimeType()) {

			q.addQstnaireItmEnableWhenAnsTimeTyp("\""+questionnaireitemenablewhen.getAnswerTimeType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmEnableWhenAnsTimeTyp("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsTimeTyp("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsDtTyp ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsDtTyp("[[");}
		if(questionnaireitemenablewhen.hasAnswerDateType()) {

			q.addQstnaireItmEnableWhenAnsDtTyp("\""+questionnaireitemenablewhen.getAnswerDateType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmEnableWhenAnsDtTyp("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsDtTyp("]]");}


		/******************** questionnaireitemenablewhenanswerquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireitemenablewhenanswerquantity = questionnaireitemenablewhen.getAnswerQuantity();

		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Vl ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsQntyVl("[[");}
		if(questionnaireitemenablewhenanswerquantity.hasValue()) {

			q.addQstnaireItmEnableWhenAnsQntyVl(String.valueOf(questionnaireitemenablewhenanswerquantity.getValue()));
		} else {
			q.addQstnaireItmEnableWhenAnsQntyVl("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsQntyVl("]]");}


		/******************** questionnaireitemenablewhenanswerquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireitemenablewhenanswerquantitycomparator = questionnaireitemenablewhenanswerquantity.getComparator();
		if(questionnaireitemenablewhenanswerquantitycomparator!=null) {
		if(questionnaireitemenablewheni == 0) {

		q.addQstnaireItmEnableWhenAnsQntyCmprtr("[[");		}
			q.addQstnaireItmEnableWhenAnsQntyCmprtr(questionnaireitemenablewhenanswerquantitycomparator.toCode());
		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {

		q.addQstnaireItmEnableWhenAnsQntyCmprtr("]]");		}

		} else {
			q.addQstnaireItmEnableWhenAnsQntyCmprtr("NULL");
		}

		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Cd ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsQntyCd("[[");}
		if(questionnaireitemenablewhenanswerquantity.hasCode()) {

			q.addQstnaireItmEnableWhenAnsQntyCd(String.valueOf(questionnaireitemenablewhenanswerquantity.getCode()));
		} else {
			q.addQstnaireItmEnableWhenAnsQntyCd("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsQntyCd("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Unt ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsQntyUnt("[[");}
		if(questionnaireitemenablewhenanswerquantity.hasUnit()) {

			q.addQstnaireItmEnableWhenAnsQntyUnt(String.valueOf(questionnaireitemenablewhenanswerquantity.getUnit()));
		} else {
			q.addQstnaireItmEnableWhenAnsQntyUnt("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsQntyUnt("]]");}


		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Sys ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenAnsQntySys("[[");}
		if(questionnaireitemenablewhenanswerquantity.hasSystem()) {

			q.addQstnaireItmEnableWhenAnsQntySys(String.valueOf(questionnaireitemenablewhenanswerquantity.getSystem()));
		} else {
			q.addQstnaireItmEnableWhenAnsQntySys("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenAnsQntySys("]]");}


		/******************** Qstnaire_Itm_EnableWhen_Question ********************************************************************************/
		if(questionnaireitemenablewheni == 0) {q.addQstnaireItmEnableWhenQuestion("[[");}
		if(questionnaireitemenablewhen.hasQuestion()) {

			q.addQstnaireItmEnableWhenQuestion(String.valueOf(questionnaireitemenablewhen.getQuestion()));
		} else {
			q.addQstnaireItmEnableWhenQuestion("NULL");
		}

		if(questionnaireitemenablewheni == questionnaireitemenablewhenlist.size()-1) {q.addQstnaireItmEnableWhenQuestion("]]");}


		 };
		/******************** Qstnaire_Itm_AnsVlSt ********************************************************************************/
		if(questionnaireitem.hasAnswerValueSet()) {

			q.addQstnaireItmAnsVlSt(String.valueOf(questionnaireitem.getAnswerValueSet()));
		} else {
			q.addQstnaireItmAnsVlSt("NULL");
		}


		/******************** Qstnaire_Itm_ReadOnly ********************************************************************************/
		if(questionnaireitem.hasReadOnly()) {

			q.addQstnaireItmReadOnly(String.valueOf(questionnaireitem.getReadOnly()));
		} else {
			q.addQstnaireItmReadOnly("NULL");
		}


		/******************** questionnaireiteminitial ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemInitialComponent> questionnaireiteminitiallist = questionnaireitem.getInitial();
		for(int questionnaireiteminitiali = 0; questionnaireiteminitiali<questionnaireiteminitiallist.size();questionnaireiteminitiali++ ) {
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemInitialComponent  questionnaireiteminitial = questionnaireiteminitiallist.get(questionnaireiteminitiali);

		/******************** Qstnaire_Itm_Initial_VlDecimalTyp ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlDecimalTyp("[[");}
		if(questionnaireiteminitial.hasValueDecimalType()) {

			q.addQstnaireItmInitialVlDecimalTyp("\""+questionnaireiteminitial.getValueDecimalType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmInitialVlDecimalTyp("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlDecimalTyp("]]");}


		/******************** Qstnaire_Itm_Initial_VlDtTyp ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlDtTyp("[[");}
		if(questionnaireiteminitial.hasValueDateType()) {

			q.addQstnaireItmInitialVlDtTyp("\""+questionnaireiteminitial.getValueDateType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmInitialVlDtTyp("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlDtTyp("]]");}


		/******************** Qstnaire_Itm_Initial_VlUriTyp ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlUriTyp("[[");}
		if(questionnaireiteminitial.hasValueUriType()) {

			q.addQstnaireItmInitialVlUriTyp("\""+questionnaireiteminitial.getValueUriType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmInitialVlUriTyp("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlUriTyp("]]");}


		/******************** questionnaireiteminitialvalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment questionnaireiteminitialvalueattachment = questionnaireiteminitial.getValueAttachment();

		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Sz ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlAttchmntSz("[[");}
		if(questionnaireiteminitialvalueattachment.hasSize()) {

			q.addQstnaireItmInitialVlAttchmntSz(String.valueOf(questionnaireiteminitialvalueattachment.getSize()));
		} else {
			q.addQstnaireItmInitialVlAttchmntSz("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlAttchmntSz("]]");}


		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Lnguage ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlAttchmntLnguage("[[");}
		if(questionnaireiteminitialvalueattachment.hasLanguage()) {

			q.addQstnaireItmInitialVlAttchmntLnguage(String.valueOf(questionnaireiteminitialvalueattachment.getLanguage()));
		} else {
			q.addQstnaireItmInitialVlAttchmntLnguage("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlAttchmntLnguage("]]");}


		/******************** Qstnaire_Itm_Initial_VlAttchmnt_CntntTyp ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlAttchmntCntntTyp("[[");}
		if(questionnaireiteminitialvalueattachment.hasContentType()) {

			q.addQstnaireItmInitialVlAttchmntCntntTyp(String.valueOf(questionnaireiteminitialvalueattachment.getContentType()));
		} else {
			q.addQstnaireItmInitialVlAttchmntCntntTyp("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlAttchmntCntntTyp("]]");}


		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Hash ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlAttchmntHash("[[");}
		if(questionnaireiteminitialvalueattachment.hasHash()) {

			q.addQstnaireItmInitialVlAttchmntHash(new String(questionnaireiteminitialvalueattachment.getHash()));
		} else {
			q.addQstnaireItmInitialVlAttchmntHash("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlAttchmntHash("]]");}


		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Data ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlAttchmntData("[[");}
		if(questionnaireiteminitialvalueattachment.hasData()) {

			q.addQstnaireItmInitialVlAttchmntData(new String(questionnaireiteminitialvalueattachment.getData()));
		} else {
			q.addQstnaireItmInitialVlAttchmntData("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlAttchmntData("]]");}


		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Creation ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlAttchmntCreation("[[");}
		if(questionnaireiteminitialvalueattachment.hasCreation()) {

			q.addQstnaireItmInitialVlAttchmntCreation("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaireiteminitialvalueattachment.getCreation())+"\"");
		} else {
			q.addQstnaireItmInitialVlAttchmntCreation("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlAttchmntCreation("]]");}


		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Ttl ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlAttchmntTtl("[[");}
		if(questionnaireiteminitialvalueattachment.hasTitle()) {

			q.addQstnaireItmInitialVlAttchmntTtl(String.valueOf(questionnaireiteminitialvalueattachment.getTitle()));
		} else {
			q.addQstnaireItmInitialVlAttchmntTtl("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlAttchmntTtl("]]");}


		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Url ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlAttchmntUrl("[[");}
		if(questionnaireiteminitialvalueattachment.hasUrl()) {

			q.addQstnaireItmInitialVlAttchmntUrl(String.valueOf(questionnaireiteminitialvalueattachment.getUrl()));
		} else {
			q.addQstnaireItmInitialVlAttchmntUrl("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlAttchmntUrl("]]");}


		/******************** Qstnaire_Itm_Initial_VlRfrnc ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlRfrnc("[[");}
		if(questionnaireiteminitial.hasValueReference()) {

			if(questionnaireiteminitial.getValueReference().getReference() != null) {
			q.addQstnaireItmInitialVlRfrnc(questionnaireiteminitial.getValueReference().getReference());
			}
		} else {
			q.addQstnaireItmInitialVlRfrnc("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlRfrnc("]]");}


		/******************** questionnaireiteminitialvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireiteminitialvaluecoding = questionnaireiteminitial.getValueCoding();

		/******************** Qstnaire_Itm_Initial_VlCdg_Dsply ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlCdgDsply("[[");}
		if(questionnaireiteminitialvaluecoding.hasDisplay()) {

			q.addQstnaireItmInitialVlCdgDsply(String.valueOf(questionnaireiteminitialvaluecoding.getDisplay()));
		} else {
			q.addQstnaireItmInitialVlCdgDsply("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlCdgDsply("]]");}


		/******************** Qstnaire_Itm_Initial_VlCdg_Vrsn ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlCdgVrsn("[[");}
		if(questionnaireiteminitialvaluecoding.hasVersion()) {

			q.addQstnaireItmInitialVlCdgVrsn(String.valueOf(questionnaireiteminitialvaluecoding.getVersion()));
		} else {
			q.addQstnaireItmInitialVlCdgVrsn("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlCdgVrsn("]]");}


		/******************** Qstnaire_Itm_Initial_VlCdg_Cd ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlCdgCd("[[");}
		if(questionnaireiteminitialvaluecoding.hasCode()) {

			q.addQstnaireItmInitialVlCdgCd(String.valueOf(questionnaireiteminitialvaluecoding.getCode()));
		} else {
			q.addQstnaireItmInitialVlCdgCd("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlCdgCd("]]");}


		/******************** Qstnaire_Itm_Initial_VlCdg_UsrSltd ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlCdgUsrSltd("[[");}
		if(questionnaireiteminitialvaluecoding.hasUserSelected()) {

			q.addQstnaireItmInitialVlCdgUsrSltd(String.valueOf(questionnaireiteminitialvaluecoding.getUserSelected()));
		} else {
			q.addQstnaireItmInitialVlCdgUsrSltd("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlCdgUsrSltd("]]");}


		/******************** Qstnaire_Itm_Initial_VlCdg_Sys ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlCdgSys("[[");}
		if(questionnaireiteminitialvaluecoding.hasSystem()) {

			q.addQstnaireItmInitialVlCdgSys(String.valueOf(questionnaireiteminitialvaluecoding.getSystem()));
		} else {
			q.addQstnaireItmInitialVlCdgSys("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlCdgSys("]]");}


		/******************** Qstnaire_Itm_Initial_VlBooleanTyp ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlBooleanTyp("[[");}
		if(questionnaireiteminitial.hasValueBooleanType()) {

			q.addQstnaireItmInitialVlBooleanTyp("\""+questionnaireiteminitial.getValueBooleanType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmInitialVlBooleanTyp("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlBooleanTyp("]]");}


		/******************** Qstnaire_Itm_Initial_VlDtTimeTyp ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlDtTimeTyp("[[");}
		if(questionnaireiteminitial.hasValueDateTimeType()) {

			q.addQstnaireItmInitialVlDtTimeTyp("\""+questionnaireiteminitial.getValueDateTimeType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmInitialVlDtTimeTyp("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlDtTimeTyp("]]");}


		/******************** Qstnaire_Itm_Initial_VlIntegerTyp ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlIntegerTyp("[[");}
		if(questionnaireiteminitial.hasValueIntegerType()) {

			q.addQstnaireItmInitialVlIntegerTyp("\""+questionnaireiteminitial.getValueIntegerType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmInitialVlIntegerTyp("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlIntegerTyp("]]");}


		/******************** Qstnaire_Itm_Initial_VlTimeTyp ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlTimeTyp("[[");}
		if(questionnaireiteminitial.hasValueTimeType()) {

			q.addQstnaireItmInitialVlTimeTyp("\""+questionnaireiteminitial.getValueTimeType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmInitialVlTimeTyp("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlTimeTyp("]]");}


		/******************** Qstnaire_Itm_Initial_VlStrgTyp ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlStrgTyp("[[");}
		if(questionnaireiteminitial.hasValueStringType()) {

			q.addQstnaireItmInitialVlStrgTyp("\""+questionnaireiteminitial.getValueStringType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmInitialVlStrgTyp("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlStrgTyp("]]");}


		/******************** questionnaireiteminitialvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireiteminitialvaluequantity = questionnaireiteminitial.getValueQuantity();

		/******************** Qstnaire_Itm_Initial_VlQnty_Vl ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlQntyVl("[[");}
		if(questionnaireiteminitialvaluequantity.hasValue()) {

			q.addQstnaireItmInitialVlQntyVl(String.valueOf(questionnaireiteminitialvaluequantity.getValue()));
		} else {
			q.addQstnaireItmInitialVlQntyVl("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlQntyVl("]]");}


		/******************** questionnaireiteminitialvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireiteminitialvaluequantitycomparator = questionnaireiteminitialvaluequantity.getComparator();
		if(questionnaireiteminitialvaluequantitycomparator!=null) {
		if(questionnaireiteminitiali == 0) {

		q.addQstnaireItmInitialVlQntyCmprtr("[[");		}
			q.addQstnaireItmInitialVlQntyCmprtr(questionnaireiteminitialvaluequantitycomparator.toCode());
		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {

		q.addQstnaireItmInitialVlQntyCmprtr("]]");		}

		} else {
			q.addQstnaireItmInitialVlQntyCmprtr("NULL");
		}

		/******************** Qstnaire_Itm_Initial_VlQnty_Cd ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlQntyCd("[[");}
		if(questionnaireiteminitialvaluequantity.hasCode()) {

			q.addQstnaireItmInitialVlQntyCd(String.valueOf(questionnaireiteminitialvaluequantity.getCode()));
		} else {
			q.addQstnaireItmInitialVlQntyCd("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlQntyCd("]]");}


		/******************** Qstnaire_Itm_Initial_VlQnty_Unt ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlQntyUnt("[[");}
		if(questionnaireiteminitialvaluequantity.hasUnit()) {

			q.addQstnaireItmInitialVlQntyUnt(String.valueOf(questionnaireiteminitialvaluequantity.getUnit()));
		} else {
			q.addQstnaireItmInitialVlQntyUnt("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlQntyUnt("]]");}


		/******************** Qstnaire_Itm_Initial_VlQnty_Sys ********************************************************************************/
		if(questionnaireiteminitiali == 0) {q.addQstnaireItmInitialVlQntySys("[[");}
		if(questionnaireiteminitialvaluequantity.hasSystem()) {

			q.addQstnaireItmInitialVlQntySys(String.valueOf(questionnaireiteminitialvaluequantity.getSystem()));
		} else {
			q.addQstnaireItmInitialVlQntySys("NULL");
		}

		if(questionnaireiteminitiali == questionnaireiteminitiallist.size()-1) {q.addQstnaireItmInitialVlQntySys("]]");}


		 };
		/******************** questionnaireitemansweroption ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent> questionnaireitemansweroptionlist = questionnaireitem.getAnswerOption();
		for(int questionnaireitemansweroptioni = 0; questionnaireitemansweroptioni<questionnaireitemansweroptionlist.size();questionnaireitemansweroptioni++ ) {
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent  questionnaireitemansweroption = questionnaireitemansweroptionlist.get(questionnaireitemansweroptioni);

		/******************** Qstnaire_Itm_AnsOption_VlDtTyp ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlDtTyp("[[");}
		if(questionnaireitemansweroption.hasValueDateType()) {

			q.addQstnaireItmAnsOptionVlDtTyp("\""+questionnaireitemansweroption.getValueDateType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmAnsOptionVlDtTyp("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlDtTyp("]]");}


		/******************** Qstnaire_Itm_AnsOption_VlRfrnc ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlRfrnc("[[");}
		if(questionnaireitemansweroption.hasValueReference()) {

			if(questionnaireitemansweroption.getValueReference().getReference() != null) {
			q.addQstnaireItmAnsOptionVlRfrnc(questionnaireitemansweroption.getValueReference().getReference());
			}
		} else {
			q.addQstnaireItmAnsOptionVlRfrnc("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlRfrnc("]]");}


		/******************** questionnaireitemansweroptionvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireitemansweroptionvaluecoding = questionnaireitemansweroption.getValueCoding();

		/******************** Qstnaire_Itm_AnsOption_VlCdg_Dsply ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlCdgDsply("[[");}
		if(questionnaireitemansweroptionvaluecoding.hasDisplay()) {

			q.addQstnaireItmAnsOptionVlCdgDsply(String.valueOf(questionnaireitemansweroptionvaluecoding.getDisplay()));
		} else {
			q.addQstnaireItmAnsOptionVlCdgDsply("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlCdgDsply("]]");}


		/******************** Qstnaire_Itm_AnsOption_VlCdg_Vrsn ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlCdgVrsn("[[");}
		if(questionnaireitemansweroptionvaluecoding.hasVersion()) {

			q.addQstnaireItmAnsOptionVlCdgVrsn(String.valueOf(questionnaireitemansweroptionvaluecoding.getVersion()));
		} else {
			q.addQstnaireItmAnsOptionVlCdgVrsn("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlCdgVrsn("]]");}


		/******************** Qstnaire_Itm_AnsOption_VlCdg_Cd ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlCdgCd("[[");}
		if(questionnaireitemansweroptionvaluecoding.hasCode()) {

			q.addQstnaireItmAnsOptionVlCdgCd(String.valueOf(questionnaireitemansweroptionvaluecoding.getCode()));
		} else {
			q.addQstnaireItmAnsOptionVlCdgCd("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlCdgCd("]]");}


		/******************** Qstnaire_Itm_AnsOption_VlCdg_UsrSltd ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlCdgUsrSltd("[[");}
		if(questionnaireitemansweroptionvaluecoding.hasUserSelected()) {

			q.addQstnaireItmAnsOptionVlCdgUsrSltd(String.valueOf(questionnaireitemansweroptionvaluecoding.getUserSelected()));
		} else {
			q.addQstnaireItmAnsOptionVlCdgUsrSltd("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlCdgUsrSltd("]]");}


		/******************** Qstnaire_Itm_AnsOption_VlCdg_Sys ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlCdgSys("[[");}
		if(questionnaireitemansweroptionvaluecoding.hasSystem()) {

			q.addQstnaireItmAnsOptionVlCdgSys(String.valueOf(questionnaireitemansweroptionvaluecoding.getSystem()));
		} else {
			q.addQstnaireItmAnsOptionVlCdgSys("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlCdgSys("]]");}


		/******************** Qstnaire_Itm_AnsOption_VlIntegerTyp ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlIntegerTyp("[[");}
		if(questionnaireitemansweroption.hasValueIntegerType()) {

			q.addQstnaireItmAnsOptionVlIntegerTyp("\""+questionnaireitemansweroption.getValueIntegerType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmAnsOptionVlIntegerTyp("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlIntegerTyp("]]");}


		/******************** Qstnaire_Itm_AnsOption_InitialSlcted ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionInitialSlcted("[[");}
		if(questionnaireitemansweroption.hasInitialSelected()) {

			q.addQstnaireItmAnsOptionInitialSlcted(String.valueOf(questionnaireitemansweroption.getInitialSelected()));
		} else {
			q.addQstnaireItmAnsOptionInitialSlcted("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionInitialSlcted("]]");}


		/******************** Qstnaire_Itm_AnsOption_VlTimeTyp ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlTimeTyp("[[");}
		if(questionnaireitemansweroption.hasValueTimeType()) {

			q.addQstnaireItmAnsOptionVlTimeTyp("\""+questionnaireitemansweroption.getValueTimeType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmAnsOptionVlTimeTyp("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlTimeTyp("]]");}


		/******************** Qstnaire_Itm_AnsOption_VlStrgTyp ********************************************************************************/
		if(questionnaireitemansweroptioni == 0) {q.addQstnaireItmAnsOptionVlStrgTyp("[[");}
		if(questionnaireitemansweroption.hasValueStringType()) {

			q.addQstnaireItmAnsOptionVlStrgTyp("\""+questionnaireitemansweroption.getValueStringType().getValueAsString()+"\"");
		} else {
			q.addQstnaireItmAnsOptionVlStrgTyp("NULL");
		}

		if(questionnaireitemansweroptioni == questionnaireitemansweroptionlist.size()-1) {q.addQstnaireItmAnsOptionVlStrgTyp("]]");}


		 };
		/******************** questionnaireitemenablebehavior ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.EnableWhenBehavior questionnaireitemenablebehavior = questionnaireitem.getEnableBehavior();
		if(questionnaireitemenablebehavior!=null) {
			q.addQstnaireItmEnableBehavior(questionnaireitemenablebehavior.toCode());
		} else {
			q.addQstnaireItmEnableBehavior("NULL");
		}

		/******************** Qstnaire_Itm_Rpts ********************************************************************************/
		if(questionnaireitem.hasRepeats()) {

			q.addQstnaireItmRpts(String.valueOf(questionnaireitem.getRepeats()));
		} else {
			q.addQstnaireItmRpts("NULL");
		}


		 };
		/******************** Qstnaire_Dt ********************************************************************************/
		if(questionnaire.hasDate()) {

			q.addQstnaireDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaire.getDate())+"\"");
		} else {
			q.addQstnaireDt("NULL");
		}


		/******************** questionnairecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> questionnairecodelist = questionnaire.getCode();
		for(int questionnairecodei = 0; questionnairecodei<questionnairecodelist.size();questionnairecodei++ ) {
		org.hl7.fhir.r4.model.Coding  questionnairecode = questionnairecodelist.get(questionnairecodei);

		/******************** Qstnaire_Cd_Dsply ********************************************************************************/
		if(questionnairecodei == 0) {q.addQstnaireCdDsply("[");}
		if(questionnairecode.hasDisplay()) {

			q.addQstnaireCdDsply(String.valueOf(questionnairecode.getDisplay()));
		} else {
			q.addQstnaireCdDsply("NULL");
		}

		if(questionnairecodei == questionnairecodelist.size()-1) {q.addQstnaireCdDsply("]");}


		/******************** Qstnaire_Cd_Vrsn ********************************************************************************/
		if(questionnairecodei == 0) {q.addQstnaireCdVrsn("[");}
		if(questionnairecode.hasVersion()) {

			q.addQstnaireCdVrsn(String.valueOf(questionnairecode.getVersion()));
		} else {
			q.addQstnaireCdVrsn("NULL");
		}

		if(questionnairecodei == questionnairecodelist.size()-1) {q.addQstnaireCdVrsn("]");}


		/******************** Qstnaire_Cd_UsrSltd ********************************************************************************/
		if(questionnairecodei == 0) {q.addQstnaireCdUsrSltd("[");}
		if(questionnairecode.hasUserSelected()) {

			q.addQstnaireCdUsrSltd(String.valueOf(questionnairecode.getUserSelected()));
		} else {
			q.addQstnaireCdUsrSltd("NULL");
		}

		if(questionnairecodei == questionnairecodelist.size()-1) {q.addQstnaireCdUsrSltd("]");}


		/******************** Qstnaire_Cd_Sys ********************************************************************************/
		if(questionnairecodei == 0) {q.addQstnaireCdSys("[");}
		if(questionnairecode.hasSystem()) {

			q.addQstnaireCdSys(String.valueOf(questionnairecode.getSystem()));
		} else {
			q.addQstnaireCdSys("NULL");
		}

		if(questionnairecodei == questionnairecodelist.size()-1) {q.addQstnaireCdSys("]");}


		 };
		/******************** questionnairestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus questionnairestatus = questionnaire.getStatus();
		if(questionnairestatus!=null) {
			q.addQstnaireSts(questionnairestatus.toCode());
		} else {
			q.addQstnaireSts("NULL");
		}

		/******************** Qstnaire_Dscrptn ********************************************************************************/
		if(questionnaire.hasDescription()) {

			q.addQstnaireDscrptn(String.valueOf(questionnaire.getDescription()));
		} else {
			q.addQstnaireDscrptn("NULL");
		}


		/******************** questionnaireidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> questionnaireidentifierlist = questionnaire.getIdentifier();
		for(int questionnaireidentifieri = 0; questionnaireidentifieri<questionnaireidentifierlist.size();questionnaireidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  questionnaireidentifier = questionnaireidentifierlist.get(questionnaireidentifieri);

		/******************** Qstnaire_Id_Vl ********************************************************************************/
		if(questionnaireidentifieri == 0) {q.addQstnaireIdVl("[");}
		if(questionnaireidentifier.hasValue()) {

			q.addQstnaireIdVl(String.valueOf(questionnaireidentifier.getValue()));
		} else {
			q.addQstnaireIdVl("NULL");
		}

		if(questionnaireidentifieri == questionnaireidentifierlist.size()-1) {q.addQstnaireIdVl("]");}


		/******************** questionnaireidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnaireidentifiertype = questionnaireidentifier.getType();

		/******************** Qstnaire_Id_Typ_Txt ********************************************************************************/
		if(questionnaireidentifieri == 0) {q.addQstnaireIdTypTxt("[");}
		if(questionnaireidentifiertype.hasText()) {

			q.addQstnaireIdTypTxt(String.valueOf(questionnaireidentifiertype.getText()));
		} else {
			q.addQstnaireIdTypTxt("NULL");
		}

		if(questionnaireidentifieri == questionnaireidentifierlist.size()-1) {q.addQstnaireIdTypTxt("]");}


		/******************** questionnaireidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> questionnaireidentifiertypecodinglist = questionnaireidentifiertype.getCoding();
		for(int questionnaireidentifiertypecodingi = 0; questionnaireidentifiertypecodingi<questionnaireidentifiertypecodinglist.size();questionnaireidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  questionnaireidentifiertypecoding = questionnaireidentifiertypecodinglist.get(questionnaireidentifiertypecodingi);

		/******************** Qstnaire_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(questionnaireidentifiertypecodingi == 0) {q.addQstnaireIdTypCdgDsply("[[");}
		if(questionnaireidentifiertypecoding.hasDisplay()) {

			q.addQstnaireIdTypCdgDsply(String.valueOf(questionnaireidentifiertypecoding.getDisplay()));
		} else {
			q.addQstnaireIdTypCdgDsply("NULL");
		}

		if(questionnaireidentifiertypecodingi == questionnaireidentifiertypecodinglist.size()-1) {q.addQstnaireIdTypCdgDsply("]]");}


		/******************** Qstnaire_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(questionnaireidentifiertypecodingi == 0) {q.addQstnaireIdTypCdgVrsn("[[");}
		if(questionnaireidentifiertypecoding.hasVersion()) {

			q.addQstnaireIdTypCdgVrsn(String.valueOf(questionnaireidentifiertypecoding.getVersion()));
		} else {
			q.addQstnaireIdTypCdgVrsn("NULL");
		}

		if(questionnaireidentifiertypecodingi == questionnaireidentifiertypecodinglist.size()-1) {q.addQstnaireIdTypCdgVrsn("]]");}


		/******************** Qstnaire_Id_Typ_Cdg_Cd ********************************************************************************/
		if(questionnaireidentifiertypecodingi == 0) {q.addQstnaireIdTypCdgCd("[[");}
		if(questionnaireidentifiertypecoding.hasCode()) {

			q.addQstnaireIdTypCdgCd(String.valueOf(questionnaireidentifiertypecoding.getCode()));
		} else {
			q.addQstnaireIdTypCdgCd("NULL");
		}

		if(questionnaireidentifiertypecodingi == questionnaireidentifiertypecodinglist.size()-1) {q.addQstnaireIdTypCdgCd("]]");}


		/******************** Qstnaire_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(questionnaireidentifiertypecodingi == 0) {q.addQstnaireIdTypCdgUsrSltd("[[");}
		if(questionnaireidentifiertypecoding.hasUserSelected()) {

			q.addQstnaireIdTypCdgUsrSltd(String.valueOf(questionnaireidentifiertypecoding.getUserSelected()));
		} else {
			q.addQstnaireIdTypCdgUsrSltd("NULL");
		}

		if(questionnaireidentifiertypecodingi == questionnaireidentifiertypecodinglist.size()-1) {q.addQstnaireIdTypCdgUsrSltd("]]");}


		/******************** Qstnaire_Id_Typ_Cdg_Sys ********************************************************************************/
		if(questionnaireidentifiertypecodingi == 0) {q.addQstnaireIdTypCdgSys("[[");}
		if(questionnaireidentifiertypecoding.hasSystem()) {

			q.addQstnaireIdTypCdgSys(String.valueOf(questionnaireidentifiertypecoding.getSystem()));
		} else {
			q.addQstnaireIdTypCdgSys("NULL");
		}

		if(questionnaireidentifiertypecodingi == questionnaireidentifiertypecodinglist.size()-1) {q.addQstnaireIdTypCdgSys("]]");}


		 };
		/******************** questionnaireidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnaireidentifierperiod = questionnaireidentifier.getPeriod();

		/******************** Qstnaire_Id_Prd_Strt ********************************************************************************/
		if(questionnaireidentifieri == 0) {q.addQstnaireIdPrdStrt("[");}
		if(questionnaireidentifierperiod.hasStart()) {

			q.addQstnaireIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaireidentifierperiod.getStart())+"\"");
		} else {
			q.addQstnaireIdPrdStrt("NULL");
		}

		if(questionnaireidentifieri == questionnaireidentifierlist.size()-1) {q.addQstnaireIdPrdStrt("]");}


		/******************** Qstnaire_Id_Prd_End ********************************************************************************/
		if(questionnaireidentifieri == 0) {q.addQstnaireIdPrdEnd("[");}
		if(questionnaireidentifierperiod.hasEnd()) {

			q.addQstnaireIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaireidentifierperiod.getEnd())+"\"");
		} else {
			q.addQstnaireIdPrdEnd("NULL");
		}

		if(questionnaireidentifieri == questionnaireidentifierlist.size()-1) {q.addQstnaireIdPrdEnd("]");}


		/******************** questionnaireidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse questionnaireidentifieruse = questionnaireidentifier.getUse();
		if(questionnaireidentifieruse!=null) {
		if(questionnaireidentifieri == 0) {

		q.addQstnaireIdUse("[");		}
			q.addQstnaireIdUse(questionnaireidentifieruse.toCode());
		if(questionnaireidentifieri == questionnaireidentifierlist.size()-1) {

		q.addQstnaireIdUse("]");		}

		} else {
			q.addQstnaireIdUse("NULL");
		}

		/******************** Qstnaire_Id_Assigner ********************************************************************************/
		if(questionnaireidentifieri == 0) {q.addQstnaireIdAssigner("[");}
		if(questionnaireidentifier.hasAssigner()) {

			if(questionnaireidentifier.getAssigner().getReference() != null) {
			q.addQstnaireIdAssigner(questionnaireidentifier.getAssigner().getReference());
			}
		} else {
			q.addQstnaireIdAssigner("NULL");
		}

		if(questionnaireidentifieri == questionnaireidentifierlist.size()-1) {q.addQstnaireIdAssigner("]");}


		/******************** Qstnaire_Id_Sys ********************************************************************************/
		if(questionnaireidentifieri == 0) {q.addQstnaireIdSys("[");}
		if(questionnaireidentifier.hasSystem()) {

			q.addQstnaireIdSys(String.valueOf(questionnaireidentifier.getSystem()));
		} else {
			q.addQstnaireIdSys("NULL");
		}

		if(questionnaireidentifieri == questionnaireidentifierlist.size()-1) {q.addQstnaireIdSys("]");}


		 };
		/******************** questionnairecontact ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactDetail> questionnairecontactlist = questionnaire.getContact();
		for(int questionnairecontacti = 0; questionnairecontacti<questionnairecontactlist.size();questionnairecontacti++ ) {
		org.hl7.fhir.r4.model.ContactDetail  questionnairecontact = questionnairecontactlist.get(questionnairecontacti);

		/******************** Qstnaire_Cntct_Nm ********************************************************************************/
		if(questionnairecontacti == 0) {q.addQstnaireCntctNm("[");}
		if(questionnairecontact.hasName()) {

			q.addQstnaireCntctNm(String.valueOf(questionnairecontact.getName()));
		} else {
			q.addQstnaireCntctNm("NULL");
		}

		if(questionnairecontacti == questionnairecontactlist.size()-1) {q.addQstnaireCntctNm("]");}


		/******************** questionnairecontacttelecom ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.ContactPoint> questionnairecontacttelecomlist = questionnairecontact.getTelecom();
		for(int questionnairecontacttelecomi = 0; questionnairecontacttelecomi<questionnairecontacttelecomlist.size();questionnairecontacttelecomi++ ) {
		org.hl7.fhir.r4.model.ContactPoint  questionnairecontacttelecom = questionnairecontacttelecomlist.get(questionnairecontacttelecomi);

		/******************** Qstnaire_Cntct_Tlcm_Vl ********************************************************************************/
		if(questionnairecontacttelecomi == 0) {q.addQstnaireCntctTlcmVl("[[");}
		if(questionnairecontacttelecom.hasValue()) {

			q.addQstnaireCntctTlcmVl(String.valueOf(questionnairecontacttelecom.getValue()));
		} else {
			q.addQstnaireCntctTlcmVl("NULL");
		}

		if(questionnairecontacttelecomi == questionnairecontacttelecomlist.size()-1) {q.addQstnaireCntctTlcmVl("]]");}


		/******************** questionnairecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnairecontacttelecomperiod = questionnairecontacttelecom.getPeriod();

		/******************** Qstnaire_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(questionnairecontacttelecomi == 0) {q.addQstnaireCntctTlcmPrdStrt("[[");}
		if(questionnairecontacttelecomperiod.hasStart()) {

			q.addQstnaireCntctTlcmPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnairecontacttelecomperiod.getStart())+"\"");
		} else {
			q.addQstnaireCntctTlcmPrdStrt("NULL");
		}

		if(questionnairecontacttelecomi == questionnairecontacttelecomlist.size()-1) {q.addQstnaireCntctTlcmPrdStrt("]]");}


		/******************** Qstnaire_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(questionnairecontacttelecomi == 0) {q.addQstnaireCntctTlcmPrdEnd("[[");}
		if(questionnairecontacttelecomperiod.hasEnd()) {

			q.addQstnaireCntctTlcmPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnairecontacttelecomperiod.getEnd())+"\"");
		} else {
			q.addQstnaireCntctTlcmPrdEnd("NULL");
		}

		if(questionnairecontacttelecomi == questionnairecontacttelecomlist.size()-1) {q.addQstnaireCntctTlcmPrdEnd("]]");}


		/******************** questionnairecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse questionnairecontacttelecomuse = questionnairecontacttelecom.getUse();
		if(questionnairecontacttelecomuse!=null) {
		if(questionnairecontacttelecomi == 0) {

		q.addQstnaireCntctTlcmUse("[[");		}
			q.addQstnaireCntctTlcmUse(questionnairecontacttelecomuse.toCode());
		if(questionnairecontacttelecomi == questionnairecontacttelecomlist.size()-1) {

		q.addQstnaireCntctTlcmUse("]]");		}

		} else {
			q.addQstnaireCntctTlcmUse("NULL");
		}

		/******************** questionnairecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem questionnairecontacttelecomsystem = questionnairecontacttelecom.getSystem();
		if(questionnairecontacttelecomsystem!=null) {
		if(questionnairecontacttelecomi == 0) {

		q.addQstnaireCntctTlcmSys("[[");		}
			q.addQstnaireCntctTlcmSys(questionnairecontacttelecomsystem.toCode());
		if(questionnairecontacttelecomi == questionnairecontacttelecomlist.size()-1) {

		q.addQstnaireCntctTlcmSys("]]");		}

		} else {
			q.addQstnaireCntctTlcmSys("NULL");
		}

		/******************** Qstnaire_Cntct_Tlcm_Rnk ********************************************************************************/
		if(questionnairecontacttelecomi == 0) {q.addQstnaireCntctTlcmRnk("[[");}
		if(questionnairecontacttelecom.hasRank()) {

			q.addQstnaireCntctTlcmRnk(String.valueOf(questionnairecontacttelecom.getRank()));
		} else {
			q.addQstnaireCntctTlcmRnk("NULL");
		}

		if(questionnairecontacttelecomi == questionnairecontacttelecomlist.size()-1) {q.addQstnaireCntctTlcmRnk("]]");}


		 };
		 };
		/******************** Qstnaire_SbjctTyp ********************************************************************************/
		if(questionnaire.hasSubjectType()) {

			String  array = "[";
			for(int incr=0; incr<questionnaire.getSubjectType().size(); incr++) {
				array = array + questionnaire.getSubjectType().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			q.addQstnaireSbjctTyp(array);

		} else {
			q.addQstnaireSbjctTyp("NULL");
		}


		/******************** Qstnaire_Copyright ********************************************************************************/
		if(questionnaire.hasCopyright()) {

			q.addQstnaireCopyright(String.valueOf(questionnaire.getCopyright()));
		} else {
			q.addQstnaireCopyright("NULL");
		}


		/******************** Qstnaire_ApprovalDt ********************************************************************************/
		if(questionnaire.hasApprovalDate()) {

			q.addQstnaireApprovalDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaire.getApprovalDate())+"\"");
		} else {
			q.addQstnaireApprovalDt("NULL");
		}


		/******************** Qstnaire_LastReviewDt ********************************************************************************/
		if(questionnaire.hasLastReviewDate()) {

			q.addQstnaireLastReviewDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaire.getLastReviewDate())+"\"");
		} else {
			q.addQstnaireLastReviewDt("NULL");
		}


		/******************** Qstnaire_Ttl ********************************************************************************/
		if(questionnaire.hasTitle()) {

			q.addQstnaireTtl(String.valueOf(questionnaire.getTitle()));
		} else {
			q.addQstnaireTtl("NULL");
		}


		/******************** Qstnaire_Prpse ********************************************************************************/
		if(questionnaire.hasPurpose()) {

			q.addQstnairePrpse(String.valueOf(questionnaire.getPurpose()));
		} else {
			q.addQstnairePrpse("NULL");
		}


		/******************** Qstnaire_Url ********************************************************************************/
		if(questionnaire.hasUrl()) {

			q.addQstnaireUrl(String.valueOf(questionnaire.getUrl()));
		} else {
			q.addQstnaireUrl("NULL");
		}


		/******************** Qstnaire_DerivedFrom ********************************************************************************/
		if(questionnaire.hasDerivedFrom()) {

			String  array = "[";
			for(int incr=0; incr<questionnaire.getDerivedFrom().size(); incr++) {
				array = array + questionnaire.getDerivedFrom().get(incr).getValueAsString() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			q.addQstnaireDerivedFrom(array);

		} else {
			q.addQstnaireDerivedFrom("NULL");
		}


		/******************** questionnairejurisdiction ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> questionnairejurisdictionlist = questionnaire.getJurisdiction();
		for(int questionnairejurisdictioni = 0; questionnairejurisdictioni<questionnairejurisdictionlist.size();questionnairejurisdictioni++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  questionnairejurisdiction = questionnairejurisdictionlist.get(questionnairejurisdictioni);

		/******************** Qstnaire_Jrsdctn_Txt ********************************************************************************/
		if(questionnairejurisdictioni == 0) {q.addQstnaireJrsdctnTxt("[");}
		if(questionnairejurisdiction.hasText()) {

			q.addQstnaireJrsdctnTxt(String.valueOf(questionnairejurisdiction.getText()));
		} else {
			q.addQstnaireJrsdctnTxt("NULL");
		}

		if(questionnairejurisdictioni == questionnairejurisdictionlist.size()-1) {q.addQstnaireJrsdctnTxt("]");}


		/******************** questionnairejurisdictioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> questionnairejurisdictioncodinglist = questionnairejurisdiction.getCoding();
		for(int questionnairejurisdictioncodingi = 0; questionnairejurisdictioncodingi<questionnairejurisdictioncodinglist.size();questionnairejurisdictioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  questionnairejurisdictioncoding = questionnairejurisdictioncodinglist.get(questionnairejurisdictioncodingi);

		/******************** Qstnaire_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(questionnairejurisdictioncodingi == 0) {q.addQstnaireJrsdctnCdgDsply("[[");}
		if(questionnairejurisdictioncoding.hasDisplay()) {

			q.addQstnaireJrsdctnCdgDsply(String.valueOf(questionnairejurisdictioncoding.getDisplay()));
		} else {
			q.addQstnaireJrsdctnCdgDsply("NULL");
		}

		if(questionnairejurisdictioncodingi == questionnairejurisdictioncodinglist.size()-1) {q.addQstnaireJrsdctnCdgDsply("]]");}


		/******************** Qstnaire_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(questionnairejurisdictioncodingi == 0) {q.addQstnaireJrsdctnCdgVrsn("[[");}
		if(questionnairejurisdictioncoding.hasVersion()) {

			q.addQstnaireJrsdctnCdgVrsn(String.valueOf(questionnairejurisdictioncoding.getVersion()));
		} else {
			q.addQstnaireJrsdctnCdgVrsn("NULL");
		}

		if(questionnairejurisdictioncodingi == questionnairejurisdictioncodinglist.size()-1) {q.addQstnaireJrsdctnCdgVrsn("]]");}


		/******************** Qstnaire_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(questionnairejurisdictioncodingi == 0) {q.addQstnaireJrsdctnCdgCd("[[");}
		if(questionnairejurisdictioncoding.hasCode()) {

			q.addQstnaireJrsdctnCdgCd(String.valueOf(questionnairejurisdictioncoding.getCode()));
		} else {
			q.addQstnaireJrsdctnCdgCd("NULL");
		}

		if(questionnairejurisdictioncodingi == questionnairejurisdictioncodinglist.size()-1) {q.addQstnaireJrsdctnCdgCd("]]");}


		/******************** Qstnaire_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(questionnairejurisdictioncodingi == 0) {q.addQstnaireJrsdctnCdgUsrSltd("[[");}
		if(questionnairejurisdictioncoding.hasUserSelected()) {

			q.addQstnaireJrsdctnCdgUsrSltd(String.valueOf(questionnairejurisdictioncoding.getUserSelected()));
		} else {
			q.addQstnaireJrsdctnCdgUsrSltd("NULL");
		}

		if(questionnairejurisdictioncodingi == questionnairejurisdictioncodinglist.size()-1) {q.addQstnaireJrsdctnCdgUsrSltd("]]");}


		/******************** Qstnaire_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(questionnairejurisdictioncodingi == 0) {q.addQstnaireJrsdctnCdgSys("[[");}
		if(questionnairejurisdictioncoding.hasSystem()) {

			q.addQstnaireJrsdctnCdgSys(String.valueOf(questionnairejurisdictioncoding.getSystem()));
		} else {
			q.addQstnaireJrsdctnCdgSys("NULL");
		}

		if(questionnairejurisdictioncodingi == questionnairejurisdictioncodinglist.size()-1) {q.addQstnaireJrsdctnCdgSys("]]");}


		 };
		 };
		/******************** questionnaireusecontext ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.UsageContext> questionnaireusecontextlist = questionnaire.getUseContext();
		for(int questionnaireusecontexti = 0; questionnaireusecontexti<questionnaireusecontextlist.size();questionnaireusecontexti++ ) {
		org.hl7.fhir.r4.model.UsageContext  questionnaireusecontext = questionnaireusecontextlist.get(questionnaireusecontexti);

		/******************** questionnaireusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireusecontextcode = questionnaireusecontext.getCode();

		/******************** Qstnaire_UseCntxt_Cd_Dsply ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtCdDsply("[");}
		if(questionnaireusecontextcode.hasDisplay()) {

			q.addQstnaireUseCntxtCdDsply(String.valueOf(questionnaireusecontextcode.getDisplay()));
		} else {
			q.addQstnaireUseCntxtCdDsply("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtCdDsply("]");}


		/******************** Qstnaire_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtCdVrsn("[");}
		if(questionnaireusecontextcode.hasVersion()) {

			q.addQstnaireUseCntxtCdVrsn(String.valueOf(questionnaireusecontextcode.getVersion()));
		} else {
			q.addQstnaireUseCntxtCdVrsn("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtCdVrsn("]");}


		/******************** Qstnaire_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtCdUsrSltd("[");}
		if(questionnaireusecontextcode.hasUserSelected()) {

			q.addQstnaireUseCntxtCdUsrSltd(String.valueOf(questionnaireusecontextcode.getUserSelected()));
		} else {
			q.addQstnaireUseCntxtCdUsrSltd("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtCdUsrSltd("]");}


		/******************** Qstnaire_UseCntxt_Cd_Sys ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtCdSys("[");}
		if(questionnaireusecontextcode.hasSystem()) {

			q.addQstnaireUseCntxtCdSys(String.valueOf(questionnaireusecontextcode.getSystem()));
		} else {
			q.addQstnaireUseCntxtCdSys("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtCdSys("]");}


		/******************** Qstnaire_UseCntxt_VlRfrnc ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlRfrnc("[");}
		if(questionnaireusecontext.hasValueReference()) {

			if(questionnaireusecontext.getValueReference().getReference() != null) {
			q.addQstnaireUseCntxtVlRfrnc(questionnaireusecontext.getValueReference().getReference());
			}
		} else {
			q.addQstnaireUseCntxtVlRfrnc("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlRfrnc("]");}


		/******************** questionnaireusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnaireusecontextvaluecodeableconcept = questionnaireusecontext.getValueCodeableConcept();

		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlCdbleCncptTxt("[");}
		if(questionnaireusecontextvaluecodeableconcept.hasText()) {

			q.addQstnaireUseCntxtVlCdbleCncptTxt(String.valueOf(questionnaireusecontextvaluecodeableconcept.getText()));
		} else {
			q.addQstnaireUseCntxtVlCdbleCncptTxt("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlCdbleCncptTxt("]");}


		/******************** questionnaireusecontextvaluecodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> questionnaireusecontextvaluecodeableconceptcodinglist = questionnaireusecontextvaluecodeableconcept.getCoding();
		for(int questionnaireusecontextvaluecodeableconceptcodingi = 0; questionnaireusecontextvaluecodeableconceptcodingi<questionnaireusecontextvaluecodeableconceptcodinglist.size();questionnaireusecontextvaluecodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  questionnaireusecontextvaluecodeableconceptcoding = questionnaireusecontextvaluecodeableconceptcodinglist.get(questionnaireusecontextvaluecodeableconceptcodingi);

		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcodingi == 0) {q.addQstnaireUseCntxtVlCdbleCncptCdgDsply("[[");}
		if(questionnaireusecontextvaluecodeableconceptcoding.hasDisplay()) {

			q.addQstnaireUseCntxtVlCdbleCncptCdgDsply(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getDisplay()));
		} else {
			q.addQstnaireUseCntxtVlCdbleCncptCdgDsply("NULL");
		}

		if(questionnaireusecontextvaluecodeableconceptcodingi == questionnaireusecontextvaluecodeableconceptcodinglist.size()-1) {q.addQstnaireUseCntxtVlCdbleCncptCdgDsply("]]");}


		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcodingi == 0) {q.addQstnaireUseCntxtVlCdbleCncptCdgVrsn("[[");}
		if(questionnaireusecontextvaluecodeableconceptcoding.hasVersion()) {

			q.addQstnaireUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getVersion()));
		} else {
			q.addQstnaireUseCntxtVlCdbleCncptCdgVrsn("NULL");
		}

		if(questionnaireusecontextvaluecodeableconceptcodingi == questionnaireusecontextvaluecodeableconceptcodinglist.size()-1) {q.addQstnaireUseCntxtVlCdbleCncptCdgVrsn("]]");}


		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcodingi == 0) {q.addQstnaireUseCntxtVlCdbleCncptCdgCd("[[");}
		if(questionnaireusecontextvaluecodeableconceptcoding.hasCode()) {

			q.addQstnaireUseCntxtVlCdbleCncptCdgCd(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getCode()));
		} else {
			q.addQstnaireUseCntxtVlCdbleCncptCdgCd("NULL");
		}

		if(questionnaireusecontextvaluecodeableconceptcodingi == questionnaireusecontextvaluecodeableconceptcodinglist.size()-1) {q.addQstnaireUseCntxtVlCdbleCncptCdgCd("]]");}


		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcodingi == 0) {q.addQstnaireUseCntxtVlCdbleCncptCdgUsrSltd("[[");}
		if(questionnaireusecontextvaluecodeableconceptcoding.hasUserSelected()) {

			q.addQstnaireUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getUserSelected()));
		} else {
			q.addQstnaireUseCntxtVlCdbleCncptCdgUsrSltd("NULL");
		}

		if(questionnaireusecontextvaluecodeableconceptcodingi == questionnaireusecontextvaluecodeableconceptcodinglist.size()-1) {q.addQstnaireUseCntxtVlCdbleCncptCdgUsrSltd("]]");}


		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcodingi == 0) {q.addQstnaireUseCntxtVlCdbleCncptCdgSys("[[");}
		if(questionnaireusecontextvaluecodeableconceptcoding.hasSystem()) {

			q.addQstnaireUseCntxtVlCdbleCncptCdgSys(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getSystem()));
		} else {
			q.addQstnaireUseCntxtVlCdbleCncptCdgSys("NULL");
		}

		if(questionnaireusecontextvaluecodeableconceptcodingi == questionnaireusecontextvaluecodeableconceptcodinglist.size()-1) {q.addQstnaireUseCntxtVlCdbleCncptCdgSys("]]");}


		 };
		/******************** questionnaireusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range questionnaireusecontextvaluerange = questionnaireusecontext.getValueRange();

		/******************** questionnaireusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireusecontextvaluerangelow = questionnaireusecontextvaluerange.getLow();

		/******************** Qstnaire_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlRngLwVl("[");}
		if(questionnaireusecontextvaluerangelow.hasValue()) {

			q.addQstnaireUseCntxtVlRngLwVl(String.valueOf(questionnaireusecontextvaluerangelow.getValue()));
		} else {
			q.addQstnaireUseCntxtVlRngLwVl("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlRngLwVl("]");}


		/******************** questionnaireusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireusecontextvaluerangelowcomparator = questionnaireusecontextvaluerangelow.getComparator();
		if(questionnaireusecontextvaluerangelowcomparator!=null) {
		if(questionnaireusecontexti == 0) {

		q.addQstnaireUseCntxtVlRngLwCmprtr("[");		}
			q.addQstnaireUseCntxtVlRngLwCmprtr(questionnaireusecontextvaluerangelowcomparator.toCode());
		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {

		q.addQstnaireUseCntxtVlRngLwCmprtr("]");		}

		} else {
			q.addQstnaireUseCntxtVlRngLwCmprtr("NULL");
		}

		/******************** Qstnaire_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlRngLwCd("[");}
		if(questionnaireusecontextvaluerangelow.hasCode()) {

			q.addQstnaireUseCntxtVlRngLwCd(String.valueOf(questionnaireusecontextvaluerangelow.getCode()));
		} else {
			q.addQstnaireUseCntxtVlRngLwCd("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlRngLwCd("]");}


		/******************** Qstnaire_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlRngLwUnt("[");}
		if(questionnaireusecontextvaluerangelow.hasUnit()) {

			q.addQstnaireUseCntxtVlRngLwUnt(String.valueOf(questionnaireusecontextvaluerangelow.getUnit()));
		} else {
			q.addQstnaireUseCntxtVlRngLwUnt("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlRngLwUnt("]");}


		/******************** Qstnaire_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlRngLwSys("[");}
		if(questionnaireusecontextvaluerangelow.hasSystem()) {

			q.addQstnaireUseCntxtVlRngLwSys(String.valueOf(questionnaireusecontextvaluerangelow.getSystem()));
		} else {
			q.addQstnaireUseCntxtVlRngLwSys("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlRngLwSys("]");}


		/******************** questionnaireusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireusecontextvaluerangehigh = questionnaireusecontextvaluerange.getHigh();

		/******************** Qstnaire_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlRngHiVl("[");}
		if(questionnaireusecontextvaluerangehigh.hasValue()) {

			q.addQstnaireUseCntxtVlRngHiVl(String.valueOf(questionnaireusecontextvaluerangehigh.getValue()));
		} else {
			q.addQstnaireUseCntxtVlRngHiVl("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlRngHiVl("]");}


		/******************** questionnaireusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireusecontextvaluerangehighcomparator = questionnaireusecontextvaluerangehigh.getComparator();
		if(questionnaireusecontextvaluerangehighcomparator!=null) {
		if(questionnaireusecontexti == 0) {

		q.addQstnaireUseCntxtVlRngHiCmprtr("[");		}
			q.addQstnaireUseCntxtVlRngHiCmprtr(questionnaireusecontextvaluerangehighcomparator.toCode());
		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {

		q.addQstnaireUseCntxtVlRngHiCmprtr("]");		}

		} else {
			q.addQstnaireUseCntxtVlRngHiCmprtr("NULL");
		}

		/******************** Qstnaire_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlRngHiCd("[");}
		if(questionnaireusecontextvaluerangehigh.hasCode()) {

			q.addQstnaireUseCntxtVlRngHiCd(String.valueOf(questionnaireusecontextvaluerangehigh.getCode()));
		} else {
			q.addQstnaireUseCntxtVlRngHiCd("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlRngHiCd("]");}


		/******************** Qstnaire_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlRngHiUnt("[");}
		if(questionnaireusecontextvaluerangehigh.hasUnit()) {

			q.addQstnaireUseCntxtVlRngHiUnt(String.valueOf(questionnaireusecontextvaluerangehigh.getUnit()));
		} else {
			q.addQstnaireUseCntxtVlRngHiUnt("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlRngHiUnt("]");}


		/******************** Qstnaire_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlRngHiSys("[");}
		if(questionnaireusecontextvaluerangehigh.hasSystem()) {

			q.addQstnaireUseCntxtVlRngHiSys(String.valueOf(questionnaireusecontextvaluerangehigh.getSystem()));
		} else {
			q.addQstnaireUseCntxtVlRngHiSys("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlRngHiSys("]");}


		/******************** questionnaireusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireusecontextvaluequantity = questionnaireusecontext.getValueQuantity();

		/******************** Qstnaire_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlQntyVl("[");}
		if(questionnaireusecontextvaluequantity.hasValue()) {

			q.addQstnaireUseCntxtVlQntyVl(String.valueOf(questionnaireusecontextvaluequantity.getValue()));
		} else {
			q.addQstnaireUseCntxtVlQntyVl("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlQntyVl("]");}


		/******************** questionnaireusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireusecontextvaluequantitycomparator = questionnaireusecontextvaluequantity.getComparator();
		if(questionnaireusecontextvaluequantitycomparator!=null) {
		if(questionnaireusecontexti == 0) {

		q.addQstnaireUseCntxtVlQntyCmprtr("[");		}
			q.addQstnaireUseCntxtVlQntyCmprtr(questionnaireusecontextvaluequantitycomparator.toCode());
		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {

		q.addQstnaireUseCntxtVlQntyCmprtr("]");		}

		} else {
			q.addQstnaireUseCntxtVlQntyCmprtr("NULL");
		}

		/******************** Qstnaire_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlQntyCd("[");}
		if(questionnaireusecontextvaluequantity.hasCode()) {

			q.addQstnaireUseCntxtVlQntyCd(String.valueOf(questionnaireusecontextvaluequantity.getCode()));
		} else {
			q.addQstnaireUseCntxtVlQntyCd("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlQntyCd("]");}


		/******************** Qstnaire_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlQntyUnt("[");}
		if(questionnaireusecontextvaluequantity.hasUnit()) {

			q.addQstnaireUseCntxtVlQntyUnt(String.valueOf(questionnaireusecontextvaluequantity.getUnit()));
		} else {
			q.addQstnaireUseCntxtVlQntyUnt("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlQntyUnt("]");}


		/******************** Qstnaire_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(questionnaireusecontexti == 0) {q.addQstnaireUseCntxtVlQntySys("[");}
		if(questionnaireusecontextvaluequantity.hasSystem()) {

			q.addQstnaireUseCntxtVlQntySys(String.valueOf(questionnaireusecontextvaluequantity.getSystem()));
		} else {
			q.addQstnaireUseCntxtVlQntySys("NULL");
		}

		if(questionnaireusecontexti == questionnaireusecontextlist.size()-1) {q.addQstnaireUseCntxtVlQntySys("]");}


		 };
		/******************** Qstnaire_Exprmtl ********************************************************************************/
		if(questionnaire.hasExperimental()) {

			q.addQstnaireExprmtl(String.valueOf(questionnaire.getExperimental()));
		} else {
			q.addQstnaireExprmtl("NULL");
		}


		/******************** Qstnaire_Pblshr ********************************************************************************/
		if(questionnaire.hasPublisher()) {

			q.addQstnairePblshr(String.valueOf(questionnaire.getPublisher()));
		} else {
			q.addQstnairePblshr("NULL");
		}


		/******************** questionnaireeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnaireeffectiveperiod = questionnaire.getEffectivePeriod();

		/******************** Qstnaire_EfctivePrd_Strt ********************************************************************************/
		if(questionnaireeffectiveperiod.hasStart()) {

			q.addQstnaireEfctivePrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaireeffectiveperiod.getStart())+"\"");
		} else {
			q.addQstnaireEfctivePrdStrt("NULL");
		}


		/******************** Qstnaire_EfctivePrd_End ********************************************************************************/
		if(questionnaireeffectiveperiod.hasEnd()) {

			q.addQstnaireEfctivePrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(questionnaireeffectiveperiod.getEnd())+"\"");
		} else {
			q.addQstnaireEfctivePrdEnd("NULL");
		}


		return q;
	}
}
