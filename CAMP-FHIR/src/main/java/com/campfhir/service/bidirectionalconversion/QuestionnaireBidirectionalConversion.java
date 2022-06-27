package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Questionnaire;
public class QuestionnaireBidirectionalConversion 
{
	public Questionnaire Questionnaires(org.hl7.fhir.r4.model.Questionnaire questionnaire) throws ParseException
	{
		 main.java.com.campfhir.model.Questionnaire q = new  main.java.com.campfhir.model.Questionnaire();

		/******************** id ********************************************************************************/
		questionnaire.setId(q.getId());

		/******************** Qstnaire_Nm ********************************************************************************/
		if(questionnaire.hasName()) {
			q.setQstnaireNm(String.valueOf(questionnaire.getName()));
		}
		/******************** Qstnaire_Dt ********************************************************************************/
		if(questionnaire.hasDate()) {
			q.setQstnaireDt(String.valueOf(questionnaire.getDate()));
		}
		/******************** Qstnaire_Vrsn ********************************************************************************/
		if(questionnaire.hasVersion()) {
			q.setQstnaireVrsn(String.valueOf(questionnaire.getVersion()));
		}
		/******************** Qstnaire_Ttl ********************************************************************************/
		if(questionnaire.hasTitle()) {
			q.setQstnaireTtl(String.valueOf(questionnaire.getTitle()));
		}
		/******************** questionnairestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatus questionnairestatus = questionnaire.getStatus();
		q.setQstnaireSts(questionnairestatus.toCode());

		/******************** Qstnaire_Dscrptn ********************************************************************************/
		if(questionnaire.hasDescription()) {
			q.setQstnaireDscrptn(String.valueOf(questionnaire.getDescription()));
		}
		/******************** Qstnaire_Url ********************************************************************************/
		if(questionnaire.hasUrl()) {
			q.setQstnaireUrl(String.valueOf(questionnaire.getUrl()));
		}
		/******************** Qstnaire_Pblshr ********************************************************************************/
		if(questionnaire.hasPublisher()) {
			q.setQstnairePblshr(String.valueOf(questionnaire.getPublisher()));
		}
		/******************** Qstnaire_Exprmtl ********************************************************************************/
		if(questionnaire.hasExperimental()) {
			q.setQstnaireExprmtl(String.valueOf(questionnaire.getExperimental()));
		}
		/******************** questionnaireeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnaireeffectiveperiod = questionnaire.getEffectivePeriod();

		/******************** Qstnaire_EfctivePrd_Strt ********************************************************************************/
		if(questionnaireeffectiveperiod.hasStart()) {
			q.setQstnaireEfctivePrdStrt(String.valueOf(questionnaireeffectiveperiod.getStart()));
		}
		/******************** Qstnaire_EfctivePrd_End ********************************************************************************/
		if(questionnaireeffectiveperiod.hasEnd()) {
			q.setQstnaireEfctivePrdEnd(String.valueOf(questionnaireeffectiveperiod.getEnd()));
		}
		/******************** Qstnaire_Prpse ********************************************************************************/
		if(questionnaire.hasPurpose()) {
			q.setQstnairePrpse(String.valueOf(questionnaire.getPurpose()));
		}
		/******************** questionnaireitem ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent questionnaireitem = questionnaire.getItemFirstRep();

		/******************** questionnaireitemtype ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemType questionnaireitemtype = questionnaireitem.getType();
		q.setQstnaireItmTyp(questionnaireitemtype.toCode());

		/******************** Qstnaire_Itm_Dfn ********************************************************************************/
		if(questionnaireitem.hasDefinition()) {
			q.setQstnaireItmDfn(String.valueOf(questionnaireitem.getDefinition()));
		}
		/******************** questionnaireitemenablewhen ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent questionnaireitemenablewhen = questionnaireitem.getEnableWhenFirstRep();

		/******************** Qstnaire_Itm_EnableWhen_AnsDtTimeTyp ********************************************************************************/
		if(questionnaireitemenablewhen.hasAnswerDateTimeType()) {
			q.setQstnaireItmEnableWhenAnsDtTimeTyp(String.valueOf(questionnaireitemenablewhen.getAnswerDateTimeType()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsBooleanTyp ********************************************************************************/
		if(questionnaireitemenablewhen.hasAnswerBooleanType()) {
			q.setQstnaireItmEnableWhenAnsBooleanTyp(String.valueOf(questionnaireitemenablewhen.getAnswerBooleanType()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsStrgTyp ********************************************************************************/
		if(questionnaireitemenablewhen.hasAnswerStringType()) {
			q.setQstnaireItmEnableWhenAnsStrgTyp(String.valueOf(questionnaireitemenablewhen.getAnswerStringType()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsIntegerTyp ********************************************************************************/
		if(questionnaireitemenablewhen.hasAnswerIntegerType()) {
			q.setQstnaireItmEnableWhenAnsIntegerTyp(String.valueOf(questionnaireitemenablewhen.getAnswerIntegerType()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsDecimalTyp ********************************************************************************/
		if(questionnaireitemenablewhen.hasAnswerDecimalType()) {
			q.setQstnaireItmEnableWhenAnsDecimalTyp(String.valueOf(questionnaireitemenablewhen.getAnswerDecimalType()));
		}
		/******************** questionnaireitemenablewhenanswerquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireitemenablewhenanswerquantity = questionnaireitemenablewhen.getAnswerQuantity();

		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Vl ********************************************************************************/
		if(questionnaireitemenablewhenanswerquantity.hasValue()) {
			q.setQstnaireItmEnableWhenAnsQntyVl(String.valueOf(questionnaireitemenablewhenanswerquantity.getValue()));
		}
		/******************** questionnaireitemenablewhenanswerquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireitemenablewhenanswerquantitycomparator = questionnaireitemenablewhenanswerquantity.getComparator();
		q.setQstnaireItmEnableWhenAnsQntyCmprtr(questionnaireitemenablewhenanswerquantitycomparator.toCode());

		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Cd ********************************************************************************/
		if(questionnaireitemenablewhenanswerquantity.hasCode()) {
			q.setQstnaireItmEnableWhenAnsQntyCd(String.valueOf(questionnaireitemenablewhenanswerquantity.getCode()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Unt ********************************************************************************/
		if(questionnaireitemenablewhenanswerquantity.hasUnit()) {
			q.setQstnaireItmEnableWhenAnsQntyUnt(String.valueOf(questionnaireitemenablewhenanswerquantity.getUnit()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Sys ********************************************************************************/
		if(questionnaireitemenablewhenanswerquantity.hasSystem()) {
			q.setQstnaireItmEnableWhenAnsQntySys(String.valueOf(questionnaireitemenablewhenanswerquantity.getSystem()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsRfrnc ********************************************************************************/
		if(questionnaireitemenablewhen.hasAnswerReference()) {
			q.setQstnaireItmEnableWhenAnsRfrnc(String.valueOf(questionnaireitemenablewhen.getAnswerReference()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsDtTyp ********************************************************************************/
		if(questionnaireitemenablewhen.hasAnswerDateType()) {
			q.setQstnaireItmEnableWhenAnsDtTyp(String.valueOf(questionnaireitemenablewhen.getAnswerDateType()));
		}
		/******************** Qstnaire_Itm_EnableWhen_Question ********************************************************************************/
		if(questionnaireitemenablewhen.hasQuestion()) {
			q.setQstnaireItmEnableWhenQuestion(String.valueOf(questionnaireitemenablewhen.getQuestion()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsTimeTyp ********************************************************************************/
		if(questionnaireitemenablewhen.hasAnswerTimeType()) {
			q.setQstnaireItmEnableWhenAnsTimeTyp(String.valueOf(questionnaireitemenablewhen.getAnswerTimeType()));
		}
		/******************** questionnaireitemenablewhenanswercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireitemenablewhenanswercoding = questionnaireitemenablewhen.getAnswerCoding();

		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Vrsn ********************************************************************************/
		if(questionnaireitemenablewhenanswercoding.hasVersion()) {
			q.setQstnaireItmEnableWhenAnsCdgVrsn(String.valueOf(questionnaireitemenablewhenanswercoding.getVersion()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Dsply ********************************************************************************/
		if(questionnaireitemenablewhenanswercoding.hasDisplay()) {
			q.setQstnaireItmEnableWhenAnsCdgDsply(String.valueOf(questionnaireitemenablewhenanswercoding.getDisplay()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Cd ********************************************************************************/
		if(questionnaireitemenablewhenanswercoding.hasCode()) {
			q.setQstnaireItmEnableWhenAnsCdgCd(String.valueOf(questionnaireitemenablewhenanswercoding.getCode()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_UsrSltd ********************************************************************************/
		if(questionnaireitemenablewhenanswercoding.hasUserSelected()) {
			q.setQstnaireItmEnableWhenAnsCdgUsrSltd(String.valueOf(questionnaireitemenablewhenanswercoding.getUserSelected()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Sys ********************************************************************************/
		if(questionnaireitemenablewhenanswercoding.hasSystem()) {
			q.setQstnaireItmEnableWhenAnsCdgSys(String.valueOf(questionnaireitemenablewhenanswercoding.getSystem()));
		}
		/******************** questionnaireitemenablewhenoperator ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemOperator questionnaireitemenablewhenoperator = questionnaireitemenablewhen.getOperator();
		q.setQstnaireItmEnableWhenOperator(questionnaireitemenablewhenoperator.toCode());

		/******************** questionnaireitemansweroption ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent questionnaireitemansweroption = questionnaireitem.getAnswerOptionFirstRep();

		/******************** Qstnaire_Itm_AnsOption_VlIntegerTyp ********************************************************************************/
		if(questionnaireitemansweroption.hasValueIntegerType()) {
			q.setQstnaireItmAnsOptionVlIntegerTyp(String.valueOf(questionnaireitemansweroption.getValueIntegerType()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlStrgTyp ********************************************************************************/
		if(questionnaireitemansweroption.hasValueStringType()) {
			q.setQstnaireItmAnsOptionVlStrgTyp(String.valueOf(questionnaireitemansweroption.getValueStringType()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlTimeTyp ********************************************************************************/
		if(questionnaireitemansweroption.hasValueTimeType()) {
			q.setQstnaireItmAnsOptionVlTimeTyp(String.valueOf(questionnaireitemansweroption.getValueTimeType()));
		}
		/******************** Qstnaire_Itm_AnsOption_InitialSlcted ********************************************************************************/
		if(questionnaireitemansweroption.hasInitialSelected()) {
			q.setQstnaireItmAnsOptionInitialSlcted(String.valueOf(questionnaireitemansweroption.getInitialSelected()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlRfrnc ********************************************************************************/
		if(questionnaireitemansweroption.hasValueReference()) {
			q.setQstnaireItmAnsOptionVlRfrnc(String.valueOf(questionnaireitemansweroption.getValueReference()));
		}
		/******************** questionnaireitemansweroptionvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireitemansweroptionvaluecoding = questionnaireitemansweroption.getValueCoding();

		/******************** Qstnaire_Itm_AnsOption_VlCdg_Vrsn ********************************************************************************/
		if(questionnaireitemansweroptionvaluecoding.hasVersion()) {
			q.setQstnaireItmAnsOptionVlCdgVrsn(String.valueOf(questionnaireitemansweroptionvaluecoding.getVersion()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Dsply ********************************************************************************/
		if(questionnaireitemansweroptionvaluecoding.hasDisplay()) {
			q.setQstnaireItmAnsOptionVlCdgDsply(String.valueOf(questionnaireitemansweroptionvaluecoding.getDisplay()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Cd ********************************************************************************/
		if(questionnaireitemansweroptionvaluecoding.hasCode()) {
			q.setQstnaireItmAnsOptionVlCdgCd(String.valueOf(questionnaireitemansweroptionvaluecoding.getCode()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_UsrSltd ********************************************************************************/
		if(questionnaireitemansweroptionvaluecoding.hasUserSelected()) {
			q.setQstnaireItmAnsOptionVlCdgUsrSltd(String.valueOf(questionnaireitemansweroptionvaluecoding.getUserSelected()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Sys ********************************************************************************/
		if(questionnaireitemansweroptionvaluecoding.hasSystem()) {
			q.setQstnaireItmAnsOptionVlCdgSys(String.valueOf(questionnaireitemansweroptionvaluecoding.getSystem()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlDtTyp ********************************************************************************/
		if(questionnaireitemansweroption.hasValueDateType()) {
			q.setQstnaireItmAnsOptionVlDtTyp(String.valueOf(questionnaireitemansweroption.getValueDateType()));
		}
		/******************** Qstnaire_Itm_Required ********************************************************************************/
		if(questionnaireitem.hasRequired()) {
			q.setQstnaireItmRequired(String.valueOf(questionnaireitem.getRequired()));
		}
		/******************** Qstnaire_Itm_MxLength ********************************************************************************/
		if(questionnaireitem.hasMaxLength()) {
			q.setQstnaireItmMxLength(String.valueOf(questionnaireitem.getMaxLength()));
		}
		/******************** Qstnaire_Itm_Txt ********************************************************************************/
		if(questionnaireitem.hasText()) {
			q.setQstnaireItmTxt(String.valueOf(questionnaireitem.getText()));
		}
		/******************** Qstnaire_Itm_Rpts ********************************************************************************/
		if(questionnaireitem.hasRepeats()) {
			q.setQstnaireItmRpts(String.valueOf(questionnaireitem.getRepeats()));
		}
		/******************** questionnaireitemenablebehavior ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.EnableWhenBehavior questionnaireitemenablebehavior = questionnaireitem.getEnableBehavior();
		q.setQstnaireItmEnableBehavior(questionnaireitemenablebehavior.toCode());

		/******************** Qstnaire_Itm_ReadOnly ********************************************************************************/
		if(questionnaireitem.hasReadOnly()) {
			q.setQstnaireItmReadOnly(String.valueOf(questionnaireitem.getReadOnly()));
		}
		/******************** questionnaireiteminitial ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemInitialComponent questionnaireiteminitial = questionnaireitem.getInitialFirstRep();

		/******************** Qstnaire_Itm_Initial_VlBooleanTyp ********************************************************************************/
		if(questionnaireiteminitial.hasValueBooleanType()) {
			q.setQstnaireItmInitialVlBooleanTyp(String.valueOf(questionnaireiteminitial.getValueBooleanType()));
		}
		/******************** Qstnaire_Itm_Initial_VlDtTimeTyp ********************************************************************************/
		if(questionnaireiteminitial.hasValueDateTimeType()) {
			q.setQstnaireItmInitialVlDtTimeTyp(String.valueOf(questionnaireiteminitial.getValueDateTimeType()));
		}
		/******************** Qstnaire_Itm_Initial_VlIntegerTyp ********************************************************************************/
		if(questionnaireiteminitial.hasValueIntegerType()) {
			q.setQstnaireItmInitialVlIntegerTyp(String.valueOf(questionnaireiteminitial.getValueIntegerType()));
		}
		/******************** Qstnaire_Itm_Initial_VlDecimalTyp ********************************************************************************/
		if(questionnaireiteminitial.hasValueDecimalType()) {
			q.setQstnaireItmInitialVlDecimalTyp(String.valueOf(questionnaireiteminitial.getValueDecimalType()));
		}
		/******************** questionnaireiteminitialvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireiteminitialvaluequantity = questionnaireiteminitial.getValueQuantity();

		/******************** Qstnaire_Itm_Initial_VlQnty_Vl ********************************************************************************/
		if(questionnaireiteminitialvaluequantity.hasValue()) {
			q.setQstnaireItmInitialVlQntyVl(String.valueOf(questionnaireiteminitialvaluequantity.getValue()));
		}
		/******************** questionnaireiteminitialvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireiteminitialvaluequantitycomparator = questionnaireiteminitialvaluequantity.getComparator();
		q.setQstnaireItmInitialVlQntyCmprtr(questionnaireiteminitialvaluequantitycomparator.toCode());

		/******************** Qstnaire_Itm_Initial_VlQnty_Cd ********************************************************************************/
		if(questionnaireiteminitialvaluequantity.hasCode()) {
			q.setQstnaireItmInitialVlQntyCd(String.valueOf(questionnaireiteminitialvaluequantity.getCode()));
		}
		/******************** Qstnaire_Itm_Initial_VlQnty_Unt ********************************************************************************/
		if(questionnaireiteminitialvaluequantity.hasUnit()) {
			q.setQstnaireItmInitialVlQntyUnt(String.valueOf(questionnaireiteminitialvaluequantity.getUnit()));
		}
		/******************** Qstnaire_Itm_Initial_VlQnty_Sys ********************************************************************************/
		if(questionnaireiteminitialvaluequantity.hasSystem()) {
			q.setQstnaireItmInitialVlQntySys(String.valueOf(questionnaireiteminitialvaluequantity.getSystem()));
		}
		/******************** Qstnaire_Itm_Initial_VlStrgTyp ********************************************************************************/
		if(questionnaireiteminitial.hasValueStringType()) {
			q.setQstnaireItmInitialVlStrgTyp(String.valueOf(questionnaireiteminitial.getValueStringType()));
		}
		/******************** Qstnaire_Itm_Initial_VlTimeTyp ********************************************************************************/
		if(questionnaireiteminitial.hasValueTimeType()) {
			q.setQstnaireItmInitialVlTimeTyp(String.valueOf(questionnaireiteminitial.getValueTimeType()));
		}
		/******************** Qstnaire_Itm_Initial_VlRfrnc ********************************************************************************/
		if(questionnaireiteminitial.hasValueReference()) {
			q.setQstnaireItmInitialVlRfrnc(String.valueOf(questionnaireiteminitial.getValueReference()));
		}
		/******************** questionnaireiteminitialvalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment questionnaireiteminitialvalueattachment = questionnaireiteminitial.getValueAttachment();

		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Sz ********************************************************************************/
		if(questionnaireiteminitialvalueattachment.hasSize()) {
			q.setQstnaireItmInitialVlAttchmntSz(String.valueOf(questionnaireiteminitialvalueattachment.getSize()));
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Lnguage ********************************************************************************/
		if(questionnaireiteminitialvalueattachment.hasLanguage()) {
			q.setQstnaireItmInitialVlAttchmntLnguage(String.valueOf(questionnaireiteminitialvalueattachment.getLanguage()));
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_CntntTyp ********************************************************************************/
		if(questionnaireiteminitialvalueattachment.hasContentType()) {
			q.setQstnaireItmInitialVlAttchmntCntntTyp(String.valueOf(questionnaireiteminitialvalueattachment.getContentType()));
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Ttl ********************************************************************************/
		if(questionnaireiteminitialvalueattachment.hasTitle()) {
			q.setQstnaireItmInitialVlAttchmntTtl(String.valueOf(questionnaireiteminitialvalueattachment.getTitle()));
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Url ********************************************************************************/
		if(questionnaireiteminitialvalueattachment.hasUrl()) {
			q.setQstnaireItmInitialVlAttchmntUrl(String.valueOf(questionnaireiteminitialvalueattachment.getUrl()));
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Data ********************************************************************************/
		if(questionnaireiteminitialvalueattachment.hasData()) {
			q.setQstnaireItmInitialVlAttchmntData(String.valueOf(questionnaireiteminitialvalueattachment.getData()));
		}

		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Hash ********************************************************************************/
		if(questionnaireiteminitialvalueattachment.hasHash()) {
			q.setQstnaireItmInitialVlAttchmntHash(String.valueOf(questionnaireiteminitialvalueattachment.getHash()));
		}

		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Creation ********************************************************************************/
		if(questionnaireiteminitialvalueattachment.hasCreation()) {
			q.setQstnaireItmInitialVlAttchmntCreation(String.valueOf(questionnaireiteminitialvalueattachment.getCreation()));
		}
		/******************** questionnaireiteminitialvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireiteminitialvaluecoding = questionnaireiteminitial.getValueCoding();

		/******************** Qstnaire_Itm_Initial_VlCdg_Vrsn ********************************************************************************/
		if(questionnaireiteminitialvaluecoding.hasVersion()) {
			q.setQstnaireItmInitialVlCdgVrsn(String.valueOf(questionnaireiteminitialvaluecoding.getVersion()));
		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Dsply ********************************************************************************/
		if(questionnaireiteminitialvaluecoding.hasDisplay()) {
			q.setQstnaireItmInitialVlCdgDsply(String.valueOf(questionnaireiteminitialvaluecoding.getDisplay()));
		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Cd ********************************************************************************/
		if(questionnaireiteminitialvaluecoding.hasCode()) {
			q.setQstnaireItmInitialVlCdgCd(String.valueOf(questionnaireiteminitialvaluecoding.getCode()));
		}
		/******************** Qstnaire_Itm_Initial_VlCdg_UsrSltd ********************************************************************************/
		if(questionnaireiteminitialvaluecoding.hasUserSelected()) {
			q.setQstnaireItmInitialVlCdgUsrSltd(String.valueOf(questionnaireiteminitialvaluecoding.getUserSelected()));
		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Sys ********************************************************************************/
		if(questionnaireiteminitialvaluecoding.hasSystem()) {
			q.setQstnaireItmInitialVlCdgSys(String.valueOf(questionnaireiteminitialvaluecoding.getSystem()));
		}
		/******************** Qstnaire_Itm_Initial_VlDtTyp ********************************************************************************/
		if(questionnaireiteminitial.hasValueDateType()) {
			q.setQstnaireItmInitialVlDtTyp(String.valueOf(questionnaireiteminitial.getValueDateType()));
		}
		/******************** Qstnaire_Itm_Initial_VlUriTyp ********************************************************************************/
		if(questionnaireiteminitial.hasValueUriType()) {
			q.setQstnaireItmInitialVlUriTyp(String.valueOf(questionnaireiteminitial.getValueUriType()));
		}
		/******************** Qstnaire_Itm_AnsVlSt ********************************************************************************/
		if(questionnaireitem.hasAnswerValueSet()) {
			q.setQstnaireItmAnsVlSt(String.valueOf(questionnaireitem.getAnswerValueSet()));
		}
		/******************** Qstnaire_Itm_LinkId ********************************************************************************/
		if(questionnaireitem.hasLinkId()) {
			q.setQstnaireItmLinkId(String.valueOf(questionnaireitem.getLinkId()));
		}
		/******************** questionnaireitemcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireitemcode = questionnaireitem.getCodeFirstRep();

		/******************** Qstnaire_Itm_Cd_Vrsn ********************************************************************************/
		if(questionnaireitemcode.hasVersion()) {
			q.setQstnaireItmCdVrsn(String.valueOf(questionnaireitemcode.getVersion()));
		}
		/******************** Qstnaire_Itm_Cd_Dsply ********************************************************************************/
		if(questionnaireitemcode.hasDisplay()) {
			q.setQstnaireItmCdDsply(String.valueOf(questionnaireitemcode.getDisplay()));
		}
		/******************** Qstnaire_Itm_Cd_UsrSltd ********************************************************************************/
		if(questionnaireitemcode.hasUserSelected()) {
			q.setQstnaireItmCdUsrSltd(String.valueOf(questionnaireitemcode.getUserSelected()));
		}
		/******************** Qstnaire_Itm_Cd_Sys ********************************************************************************/
		if(questionnaireitemcode.hasSystem()) {
			q.setQstnaireItmCdSys(String.valueOf(questionnaireitemcode.getSystem()));
		}
		/******************** Qstnaire_Itm_Prefix ********************************************************************************/
		if(questionnaireitem.hasPrefix()) {
			q.setQstnaireItmPrefix(String.valueOf(questionnaireitem.getPrefix()));
		}
		/******************** questionnairecode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnairecode = questionnaire.getCodeFirstRep();

		/******************** Qstnaire_Cd_Vrsn ********************************************************************************/
		if(questionnairecode.hasVersion()) {
			q.setQstnaireCdVrsn(String.valueOf(questionnairecode.getVersion()));
		}
		/******************** Qstnaire_Cd_Dsply ********************************************************************************/
		if(questionnairecode.hasDisplay()) {
			q.setQstnaireCdDsply(String.valueOf(questionnairecode.getDisplay()));
		}
		/******************** Qstnaire_Cd_UsrSltd ********************************************************************************/
		if(questionnairecode.hasUserSelected()) {
			q.setQstnaireCdUsrSltd(String.valueOf(questionnairecode.getUserSelected()));
		}
		/******************** Qstnaire_Cd_Sys ********************************************************************************/
		if(questionnairecode.hasSystem()) {
			q.setQstnaireCdSys(String.valueOf(questionnairecode.getSystem()));
		}
		/******************** questionnairecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail questionnairecontact = questionnaire.getContactFirstRep();

		/******************** Qstnaire_Cntct_Nm ********************************************************************************/
		if(questionnairecontact.hasName()) {
			q.setQstnaireCntctNm(String.valueOf(questionnairecontact.getName()));
		}
		/******************** questionnairecontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint questionnairecontacttelecom = questionnairecontact.getTelecomFirstRep();

		/******************** Qstnaire_Cntct_Tlcm_Vl ********************************************************************************/
		if(questionnairecontacttelecom.hasValue()) {
			q.setQstnaireCntctTlcmVl(String.valueOf(questionnairecontacttelecom.getValue()));
		}
		/******************** questionnairecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnairecontacttelecomperiod = questionnairecontacttelecom.getPeriod();

		/******************** Qstnaire_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(questionnairecontacttelecomperiod.hasStart()) {
			q.setQstnaireCntctTlcmPrdStrt(String.valueOf(questionnairecontacttelecomperiod.getStart()));
		}
		/******************** Qstnaire_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(questionnairecontacttelecomperiod.hasEnd()) {
			q.setQstnaireCntctTlcmPrdEnd(String.valueOf(questionnairecontacttelecomperiod.getEnd()));
		}
		/******************** questionnairecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem questionnairecontacttelecomsystem = questionnairecontacttelecom.getSystem();
		q.setQstnaireCntctTlcmSys(questionnairecontacttelecomsystem.toCode());

		/******************** questionnairecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUse questionnairecontacttelecomuse = questionnairecontacttelecom.getUse();
		q.setQstnaireCntctTlcmUse(questionnairecontacttelecomuse.toCode());

		/******************** Qstnaire_Cntct_Tlcm_Rnk ********************************************************************************/
		if(questionnairecontacttelecom.hasRank()) {
			q.setQstnaireCntctTlcmRnk(String.valueOf(questionnairecontacttelecom.getRank()));
		}
		/******************** questionnaireidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier questionnaireidentifier = questionnaire.getIdentifierFirstRep();

		/******************** Qstnaire_Id_Vl ********************************************************************************/
		if(questionnaireidentifier.hasValue()) {
			q.setQstnaireIdVl(String.valueOf(questionnaireidentifier.getValue()));
		}
		/******************** questionnaireidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnaireidentifiertype = questionnaireidentifier.getType();

		/******************** Qstnaire_Id_Typ_Txt ********************************************************************************/
		if(questionnaireidentifiertype.hasText()) {
			q.setQstnaireIdTypTxt(String.valueOf(questionnaireidentifiertype.getText()));
		}
		/******************** questionnaireidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireidentifiertypecoding = questionnaireidentifiertype.getCodingFirstRep();

		/******************** Qstnaire_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(questionnaireidentifiertypecoding.hasVersion()) {
			q.setQstnaireIdTypCdgVrsn(String.valueOf(questionnaireidentifiertypecoding.getVersion()));
		}
		/******************** Qstnaire_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(questionnaireidentifiertypecoding.hasDisplay()) {
			q.setQstnaireIdTypCdgDsply(String.valueOf(questionnaireidentifiertypecoding.getDisplay()));
		}
		/******************** Qstnaire_Id_Typ_Cdg_Cd ********************************************************************************/
		if(questionnaireidentifiertypecoding.hasCode()) {
			q.setQstnaireIdTypCdgCd(String.valueOf(questionnaireidentifiertypecoding.getCode()));
		}
		/******************** Qstnaire_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(questionnaireidentifiertypecoding.hasUserSelected()) {
			q.setQstnaireIdTypCdgUsrSltd(String.valueOf(questionnaireidentifiertypecoding.getUserSelected()));
		}
		/******************** Qstnaire_Id_Typ_Cdg_Sys ********************************************************************************/
		if(questionnaireidentifiertypecoding.hasSystem()) {
			q.setQstnaireIdTypCdgSys(String.valueOf(questionnaireidentifiertypecoding.getSystem()));
		}
		/******************** questionnaireidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnaireidentifierperiod = questionnaireidentifier.getPeriod();

		/******************** Qstnaire_Id_Prd_Strt ********************************************************************************/
		if(questionnaireidentifierperiod.hasStart()) {
			q.setQstnaireIdPrdStrt(String.valueOf(questionnaireidentifierperiod.getStart()));
		}
		/******************** Qstnaire_Id_Prd_End ********************************************************************************/
		if(questionnaireidentifierperiod.hasEnd()) {
			q.setQstnaireIdPrdEnd(String.valueOf(questionnaireidentifierperiod.getEnd()));
		}
		/******************** Qstnaire_Id_Assigner ********************************************************************************/
		if(questionnaireidentifier.hasAssigner()) {
			q.setQstnaireIdAssigner(String.valueOf(questionnaireidentifier.getAssigner()));
		}
		/******************** Qstnaire_Id_Sys ********************************************************************************/
		if(questionnaireidentifier.hasSystem()) {
			q.setQstnaireIdSys(String.valueOf(questionnaireidentifier.getSystem()));
		}
		/******************** questionnaireidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse questionnaireidentifieruse = questionnaireidentifier.getUse();
		q.setQstnaireIdUse(questionnaireidentifieruse.toCode());

		/******************** Qstnaire_Copyright ********************************************************************************/
		if(questionnaire.hasCopyright()) {
			q.setQstnaireCopyright(String.valueOf(questionnaire.getCopyright()));
		}
		/******************** Qstnaire_LastReviewDt ********************************************************************************/
		if(questionnaire.hasLastReviewDate()) {
			q.setQstnaireLastReviewDt(String.valueOf(questionnaire.getLastReviewDate()));
		}
		/******************** Qstnaire_ApprovalDt ********************************************************************************/
		if(questionnaire.hasApprovalDate()) {
			q.setQstnaireApprovalDt(String.valueOf(questionnaire.getApprovalDate()));
		}
		/******************** questionnaireusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext questionnaireusecontext = questionnaire.getUseContextFirstRep();

		/******************** questionnaireusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireusecontextcode = questionnaireusecontext.getCode();

		/******************** Qstnaire_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(questionnaireusecontextcode.hasVersion()) {
			q.setQstnaireUseCntxtCdVrsn(String.valueOf(questionnaireusecontextcode.getVersion()));
		}
		/******************** Qstnaire_UseCntxt_Cd_Dsply ********************************************************************************/
		if(questionnaireusecontextcode.hasDisplay()) {
			q.setQstnaireUseCntxtCdDsply(String.valueOf(questionnaireusecontextcode.getDisplay()));
		}
		/******************** Qstnaire_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(questionnaireusecontextcode.hasUserSelected()) {
			q.setQstnaireUseCntxtCdUsrSltd(String.valueOf(questionnaireusecontextcode.getUserSelected()));
		}
		/******************** Qstnaire_UseCntxt_Cd_Sys ********************************************************************************/
		if(questionnaireusecontextcode.hasSystem()) {
			q.setQstnaireUseCntxtCdSys(String.valueOf(questionnaireusecontextcode.getSystem()));
		}
		/******************** questionnaireusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnaireusecontextvaluecodeableconcept = questionnaireusecontext.getValueCodeableConcept();

		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconcept.hasText()) {
			q.setQstnaireUseCntxtVlCdbleCncptTxt(String.valueOf(questionnaireusecontextvaluecodeableconcept.getText()));
		}
		/******************** questionnaireusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireusecontextvaluecodeableconceptcoding = questionnaireusecontextvaluecodeableconcept.getCodingFirstRep();

		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcoding.hasVersion()) {
			q.setQstnaireUseCntxtVlCdbleCncptCdgVrsn(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getVersion()));
		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcoding.hasDisplay()) {
			q.setQstnaireUseCntxtVlCdbleCncptCdgDsply(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getDisplay()));
		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcoding.hasCode()) {
			q.setQstnaireUseCntxtVlCdbleCncptCdgCd(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getCode()));
		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcoding.hasUserSelected()) {
			q.setQstnaireUseCntxtVlCdbleCncptCdgUsrSltd(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getUserSelected()));
		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(questionnaireusecontextvaluecodeableconceptcoding.hasSystem()) {
			q.setQstnaireUseCntxtVlCdbleCncptCdgSys(String.valueOf(questionnaireusecontextvaluecodeableconceptcoding.getSystem()));
		}
		/******************** questionnaireusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireusecontextvaluequantity = questionnaireusecontext.getValueQuantity();

		/******************** Qstnaire_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(questionnaireusecontextvaluequantity.hasValue()) {
			q.setQstnaireUseCntxtVlQntyVl(String.valueOf(questionnaireusecontextvaluequantity.getValue()));
		}
		/******************** questionnaireusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireusecontextvaluequantitycomparator = questionnaireusecontextvaluequantity.getComparator();
		q.setQstnaireUseCntxtVlQntyCmprtr(questionnaireusecontextvaluequantitycomparator.toCode());

		/******************** Qstnaire_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(questionnaireusecontextvaluequantity.hasCode()) {
			q.setQstnaireUseCntxtVlQntyCd(String.valueOf(questionnaireusecontextvaluequantity.getCode()));
		}
		/******************** Qstnaire_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(questionnaireusecontextvaluequantity.hasUnit()) {
			q.setQstnaireUseCntxtVlQntyUnt(String.valueOf(questionnaireusecontextvaluequantity.getUnit()));
		}
		/******************** Qstnaire_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(questionnaireusecontextvaluequantity.hasSystem()) {
			q.setQstnaireUseCntxtVlQntySys(String.valueOf(questionnaireusecontextvaluequantity.getSystem()));
		}
		/******************** questionnaireusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range questionnaireusecontextvaluerange = questionnaireusecontext.getValueRange();

		/******************** questionnaireusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireusecontextvaluerangelow = questionnaireusecontextvaluerange.getLow();

		/******************** Qstnaire_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(questionnaireusecontextvaluerangelow.hasValue()) {
			q.setQstnaireUseCntxtVlRngLwVl(String.valueOf(questionnaireusecontextvaluerangelow.getValue()));
		}
		/******************** questionnaireusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireusecontextvaluerangelowcomparator = questionnaireusecontextvaluerangelow.getComparator();
		q.setQstnaireUseCntxtVlRngLwCmprtr(questionnaireusecontextvaluerangelowcomparator.toCode());

		/******************** Qstnaire_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(questionnaireusecontextvaluerangelow.hasCode()) {
			q.setQstnaireUseCntxtVlRngLwCd(String.valueOf(questionnaireusecontextvaluerangelow.getCode()));
		}
		/******************** Qstnaire_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(questionnaireusecontextvaluerangelow.hasUnit()) {
			q.setQstnaireUseCntxtVlRngLwUnt(String.valueOf(questionnaireusecontextvaluerangelow.getUnit()));
		}
		/******************** Qstnaire_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(questionnaireusecontextvaluerangelow.hasSystem()) {
			q.setQstnaireUseCntxtVlRngLwSys(String.valueOf(questionnaireusecontextvaluerangelow.getSystem()));
		}
		/******************** questionnaireusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireusecontextvaluerangehigh = questionnaireusecontextvaluerange.getHigh();

		/******************** Qstnaire_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(questionnaireusecontextvaluerangehigh.hasValue()) {
			q.setQstnaireUseCntxtVlRngHiVl(String.valueOf(questionnaireusecontextvaluerangehigh.getValue()));
		}
		/******************** questionnaireusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator questionnaireusecontextvaluerangehighcomparator = questionnaireusecontextvaluerangehigh.getComparator();
		q.setQstnaireUseCntxtVlRngHiCmprtr(questionnaireusecontextvaluerangehighcomparator.toCode());

		/******************** Qstnaire_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(questionnaireusecontextvaluerangehigh.hasCode()) {
			q.setQstnaireUseCntxtVlRngHiCd(String.valueOf(questionnaireusecontextvaluerangehigh.getCode()));
		}
		/******************** Qstnaire_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(questionnaireusecontextvaluerangehigh.hasUnit()) {
			q.setQstnaireUseCntxtVlRngHiUnt(String.valueOf(questionnaireusecontextvaluerangehigh.getUnit()));
		}
		/******************** Qstnaire_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(questionnaireusecontextvaluerangehigh.hasSystem()) {
			q.setQstnaireUseCntxtVlRngHiSys(String.valueOf(questionnaireusecontextvaluerangehigh.getSystem()));
		}
		/******************** Qstnaire_UseCntxt_VlRfrnc ********************************************************************************/
		if(questionnaireusecontext.hasValueReference()) {
			q.setQstnaireUseCntxtVlRfrnc(String.valueOf(questionnaireusecontext.getValueReference()));
		}
		/******************** questionnairejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnairejurisdiction = questionnaire.getJurisdictionFirstRep();

		/******************** Qstnaire_Jrsdctn_Txt ********************************************************************************/
		if(questionnairejurisdiction.hasText()) {
			q.setQstnaireJrsdctnTxt(String.valueOf(questionnairejurisdiction.getText()));
		}
		/******************** questionnairejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnairejurisdictioncoding = questionnairejurisdiction.getCodingFirstRep();

		/******************** Qstnaire_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(questionnairejurisdictioncoding.hasVersion()) {
			q.setQstnaireJrsdctnCdgVrsn(String.valueOf(questionnairejurisdictioncoding.getVersion()));
		}
		/******************** Qstnaire_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(questionnairejurisdictioncoding.hasDisplay()) {
			q.setQstnaireJrsdctnCdgDsply(String.valueOf(questionnairejurisdictioncoding.getDisplay()));
		}
		/******************** Qstnaire_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(questionnairejurisdictioncoding.hasCode()) {
			q.setQstnaireJrsdctnCdgCd(String.valueOf(questionnairejurisdictioncoding.getCode()));
		}
		/******************** Qstnaire_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(questionnairejurisdictioncoding.hasUserSelected()) {
			q.setQstnaireJrsdctnCdgUsrSltd(String.valueOf(questionnairejurisdictioncoding.getUserSelected()));
		}
		/******************** Qstnaire_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(questionnairejurisdictioncoding.hasSystem()) {
			q.setQstnaireJrsdctnCdgSys(String.valueOf(questionnairejurisdictioncoding.getSystem()));
		}
		return q;
	}
}
