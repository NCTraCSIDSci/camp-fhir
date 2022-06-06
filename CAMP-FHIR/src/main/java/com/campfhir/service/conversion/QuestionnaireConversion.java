package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Questionnaire;
public class QuestionnaireConversion 
{
	public org.hl7.fhir.r4.model.Questionnaire Questionnaires(Questionnaire q) throws ParseException
	{
		org.hl7.fhir.r4.model.Questionnaire questionnaire = new org.hl7.fhir.r4.model.Questionnaire();

		/******************** id ********************************************************************************/
		questionnaire.setId(q.getId());

		/******************** Qstnaire_ApprovalDt ********************************************************************************/
		if(q.getQstnaireApprovalDt() != null) {
			java.text.SimpleDateFormat Qstnaire_ApprovalDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_ApprovalDtdate = Qstnaire_ApprovalDtsdf.parse(q.getQstnaireApprovalDt());
			questionnaire.setApprovalDate(Qstnaire_ApprovalDtdate);
		}
		/******************** questionnairecode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnairecode =  new org.hl7.fhir.r4.model.Coding();
		questionnaire.addCode(questionnairecode);

		/******************** Qstnaire_Cd_Cd ********************************************************************************/
		if(q.getQstnaireCdCd() != null) {
			questionnairecode.setCode(q.getQstnaireCdCd());
		}
		/******************** Qstnaire_Cd_Dsply ********************************************************************************/
		if(q.getQstnaireCdDsply() != null) {
			questionnairecode.setDisplay(q.getQstnaireCdDsply());
		}
		/******************** Qstnaire_Cd_Sys ********************************************************************************/
		if(q.getQstnaireCdSys() != null) {
			questionnairecode.setSystem(q.getQstnaireCdSys());
		}
		/******************** Qstnaire_Cd_UsrSltd ********************************************************************************/
		if(q.getQstnaireCdUsrSltd() != null) {
			questionnairecode.setUserSelected(Boolean.parseBoolean(q.getQstnaireCdUsrSltd()));
		}
		/******************** Qstnaire_Cd_Vrsn ********************************************************************************/
		if(q.getQstnaireCdVrsn() != null) {
			questionnairecode.setVersion(q.getQstnaireCdVrsn());
		}
		/******************** questionnairecontact ********************************************************************************/
		org.hl7.fhir.r4.model.ContactDetail questionnairecontact =  new org.hl7.fhir.r4.model.ContactDetail();
		questionnaire.addContact(questionnairecontact);

		/******************** Qstnaire_Cntct_Nm ********************************************************************************/
		if(q.getQstnaireCntctNm() != null) {
			questionnairecontact.setName(q.getQstnaireCntctNm());
		}
		/******************** questionnairecontacttelecom ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint questionnairecontacttelecom =  new org.hl7.fhir.r4.model.ContactPoint();
		questionnairecontact.addTelecom(questionnairecontacttelecom);

		/******************** questionnairecontacttelecomperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnairecontacttelecomperiod =  new org.hl7.fhir.r4.model.Period();
		questionnairecontacttelecom.setPeriod(questionnairecontacttelecomperiod);

		/******************** Qstnaire_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(q.getQstnaireCntctTlcmPrdEnd() != null) {
			java.text.SimpleDateFormat Qstnaire_Cntct_Tlcm_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_Cntct_Tlcm_Prd_Enddate = Qstnaire_Cntct_Tlcm_Prd_Endsdf.parse(q.getQstnaireCntctTlcmPrdEnd());
			questionnairecontacttelecomperiod.setEnd(Qstnaire_Cntct_Tlcm_Prd_Enddate);
		}
		/******************** Qstnaire_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(q.getQstnaireCntctTlcmPrdStrt() != null) {
			java.text.SimpleDateFormat Qstnaire_Cntct_Tlcm_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_Cntct_Tlcm_Prd_Strtdate = Qstnaire_Cntct_Tlcm_Prd_Strtsdf.parse(q.getQstnaireCntctTlcmPrdStrt());
			questionnairecontacttelecomperiod.setStart(Qstnaire_Cntct_Tlcm_Prd_Strtdate);
		}
		/******************** Qstnaire_Cntct_Tlcm_Rnk ********************************************************************************/
		if(q.getQstnaireCntctTlcmRnk() != null) {
			questionnairecontacttelecom.setRank(Integer.parseInt(q.getQstnaireCntctTlcmRnk()));
		}
		/******************** questionnairecontacttelecomsystem ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory questionnairecontacttelecomsystem =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory();
		questionnairecontacttelecom.setSystem(questionnairecontacttelecomsystem.fromCode(q.getQstnaireCntctTlcmSys()));

		/******************** questionnairecontacttelecomuse ********************************************************************************/
		org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory questionnairecontacttelecomuse =  new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory();
		questionnairecontacttelecom.setUse(questionnairecontacttelecomuse.fromCode(q.getQstnaireCntctTlcmUse()));

		/******************** Qstnaire_Cntct_Tlcm_Vl ********************************************************************************/
		if(q.getQstnaireCntctTlcmVl() != null) {
			questionnairecontacttelecom.setValue(q.getQstnaireCntctTlcmVl());
		}
		/******************** Qstnaire_Copyright ********************************************************************************/
		if(q.getQstnaireCopyright() != null) {
			questionnaire.setCopyright(q.getQstnaireCopyright());
		}
		/******************** Qstnaire_Dt ********************************************************************************/
		if(q.getQstnaireDt() != null) {
			java.text.SimpleDateFormat Qstnaire_Dtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_Dtdate = Qstnaire_Dtsdf.parse(q.getQstnaireDt());
			questionnaire.setDate(Qstnaire_Dtdate);
		}
		/******************** Qstnaire_DerivedFrom ********************************************************************************/
		if(q.getQstnaireDerivedFrom() != null) {
			questionnaire.addDerivedFrom(q.getQstnaireDerivedFrom());
		}
		/******************** Qstnaire_Dscrptn ********************************************************************************/
		if(q.getQstnaireDscrptn() != null) {
			questionnaire.setDescription(q.getQstnaireDscrptn());
		}
		/******************** questionnaireeffectiveperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnaireeffectiveperiod =  new org.hl7.fhir.r4.model.Period();
		questionnaire.setEffectivePeriod(questionnaireeffectiveperiod);

		/******************** Qstnaire_EfctivePrd_End ********************************************************************************/
		if(q.getQstnaireEfctivePrdEnd() != null) {
			java.text.SimpleDateFormat Qstnaire_EfctivePrd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_EfctivePrd_Enddate = Qstnaire_EfctivePrd_Endsdf.parse(q.getQstnaireEfctivePrdEnd());
			questionnaireeffectiveperiod.setEnd(Qstnaire_EfctivePrd_Enddate);
		}
		/******************** Qstnaire_EfctivePrd_Strt ********************************************************************************/
		if(q.getQstnaireEfctivePrdStrt() != null) {
			java.text.SimpleDateFormat Qstnaire_EfctivePrd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_EfctivePrd_Strtdate = Qstnaire_EfctivePrd_Strtsdf.parse(q.getQstnaireEfctivePrdStrt());
			questionnaireeffectiveperiod.setStart(Qstnaire_EfctivePrd_Strtdate);
		}
		/******************** Qstnaire_Exprmtl ********************************************************************************/
		if(q.getQstnaireExprmtl() != null) {
			questionnaire.setExperimental(Boolean.parseBoolean(q.getQstnaireExprmtl()));
		}
		/******************** questionnaireidentifier ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier questionnaireidentifier =  new org.hl7.fhir.r4.model.Identifier();
		questionnaire.addIdentifier(questionnaireidentifier);

		/******************** Qstnaire_Id_Assigner ********************************************************************************/
		if(q.getQstnaireIdAssigner() != null) {
			questionnaireidentifier.setAssigner( new org.hl7.fhir.r4.model.Reference(q.getQstnaireIdAssigner()));
		}
		/******************** questionnaireidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period questionnaireidentifierperiod =  new org.hl7.fhir.r4.model.Period();
		questionnaireidentifier.setPeriod(questionnaireidentifierperiod);

		/******************** Qstnaire_Id_Prd_End ********************************************************************************/
		if(q.getQstnaireIdPrdEnd() != null) {
			java.text.SimpleDateFormat Qstnaire_Id_Prd_Endsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_Id_Prd_Enddate = Qstnaire_Id_Prd_Endsdf.parse(q.getQstnaireIdPrdEnd());
			questionnaireidentifierperiod.setEnd(Qstnaire_Id_Prd_Enddate);
		}
		/******************** Qstnaire_Id_Prd_Strt ********************************************************************************/
		if(q.getQstnaireIdPrdStrt() != null) {
			java.text.SimpleDateFormat Qstnaire_Id_Prd_Strtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_Id_Prd_Strtdate = Qstnaire_Id_Prd_Strtsdf.parse(q.getQstnaireIdPrdStrt());
			questionnaireidentifierperiod.setStart(Qstnaire_Id_Prd_Strtdate);
		}
		/******************** Qstnaire_Id_Sys ********************************************************************************/
		if(q.getQstnaireIdSys() != null) {
			questionnaireidentifier.setSystem(q.getQstnaireIdSys());
		}
		/******************** questionnaireidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnaireidentifiertype =  new org.hl7.fhir.r4.model.CodeableConcept();
		questionnaireidentifier.setType(questionnaireidentifiertype);

		/******************** questionnaireidentifiertypecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireidentifiertypecoding =  new org.hl7.fhir.r4.model.Coding();
		questionnaireidentifiertype.addCoding(questionnaireidentifiertypecoding);

		/******************** Qstnaire_Id_Typ_Cdg_Cd ********************************************************************************/
		if(q.getQstnaireIdTypCdgCd() != null) {
			questionnaireidentifiertypecoding.setCode(q.getQstnaireIdTypCdgCd());
		}
		/******************** Qstnaire_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(q.getQstnaireIdTypCdgDsply() != null) {
			questionnaireidentifiertypecoding.setDisplay(q.getQstnaireIdTypCdgDsply());
		}
		/******************** Qstnaire_Id_Typ_Cdg_Sys ********************************************************************************/
		if(q.getQstnaireIdTypCdgSys() != null) {
			questionnaireidentifiertypecoding.setSystem(q.getQstnaireIdTypCdgSys());
		}
		/******************** Qstnaire_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireIdTypCdgUsrSltd() != null) {
			questionnaireidentifiertypecoding.setUserSelected(Boolean.parseBoolean(q.getQstnaireIdTypCdgUsrSltd()));
		}
		/******************** Qstnaire_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(q.getQstnaireIdTypCdgVrsn() != null) {
			questionnaireidentifiertypecoding.setVersion(q.getQstnaireIdTypCdgVrsn());
		}
		/******************** Qstnaire_Id_Typ_Txt ********************************************************************************/
		if(q.getQstnaireIdTypTxt() != null) {
			questionnaireidentifiertype.setText(q.getQstnaireIdTypTxt());
		}
		/******************** questionnaireidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory questionnaireidentifieruse =  new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory();
		questionnaireidentifier.setUse(questionnaireidentifieruse.fromCode(q.getQstnaireIdUse()));

		/******************** Qstnaire_Id_Vl ********************************************************************************/
		if(q.getQstnaireIdVl() != null) {
			questionnaireidentifier.setValue(q.getQstnaireIdVl());
		}
		/******************** questionnaireitem ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent questionnaireitem =  new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemComponent();
		questionnaire.addItem(questionnaireitem);

		/******************** questionnaireitemansweroption ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent questionnaireitemansweroption =  new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemAnswerOptionComponent();
		questionnaireitem.addAnswerOption(questionnaireitemansweroption);

		/******************** Qstnaire_Itm_AnsOption_InitialSlcted ********************************************************************************/
		if(q.getQstnaireItmAnsOptionInitialSlcted() != null) {
			questionnaireitemansweroption.setInitialSelected(Boolean.parseBoolean(q.getQstnaireItmAnsOptionInitialSlcted()));
		}
		/******************** questionnaireitemansweroptionvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireitemansweroptionvaluecoding =  new org.hl7.fhir.r4.model.Coding();
		questionnaireitemansweroption.setValue(questionnaireitemansweroptionvaluecoding);

		/******************** Qstnaire_Itm_AnsOption_VlCdg_Cd ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgCd() != null) {
			questionnaireitemansweroptionvaluecoding.setCode(q.getQstnaireItmAnsOptionVlCdgCd());
		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Dsply ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgDsply() != null) {
			questionnaireitemansweroptionvaluecoding.setDisplay(q.getQstnaireItmAnsOptionVlCdgDsply());
		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Sys ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgSys() != null) {
			questionnaireitemansweroptionvaluecoding.setSystem(q.getQstnaireItmAnsOptionVlCdgSys());
		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgUsrSltd() != null) {
			questionnaireitemansweroptionvaluecoding.setUserSelected(Boolean.parseBoolean(q.getQstnaireItmAnsOptionVlCdgUsrSltd()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Vrsn ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgVrsn() != null) {
			questionnaireitemansweroptionvaluecoding.setVersion(q.getQstnaireItmAnsOptionVlCdgVrsn());
		}
		/******************** Qstnaire_Itm_AnsOption_VlDtTyp ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlDtTyp() != null) {
			questionnaireitemansweroption.setValue( new org.hl7.fhir.r4.model.DateType(q.getQstnaireItmAnsOptionVlDtTyp()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlIntegerTyp ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlIntegerTyp() != null) {
			questionnaireitemansweroption.setValue( new org.hl7.fhir.r4.model.IntegerType(q.getQstnaireItmAnsOptionVlIntegerTyp()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlRfrnc ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlRfrnc() != null) {
			questionnaireitemansweroption.setValue( new org.hl7.fhir.r4.model.Reference(q.getQstnaireItmAnsOptionVlRfrnc()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlStrgTyp ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlStrgTyp() != null) {
			questionnaireitemansweroption.setValue( new org.hl7.fhir.r4.model.StringType(q.getQstnaireItmAnsOptionVlStrgTyp()));
		}
		/******************** Qstnaire_Itm_AnsOption_VlTimeTyp ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlTimeTyp() != null) {
			questionnaireitemansweroption.setValue( new org.hl7.fhir.r4.model.TimeType(q.getQstnaireItmAnsOptionVlTimeTyp()));
		}
		/******************** Qstnaire_Itm_AnsVlSt ********************************************************************************/
		if(q.getQstnaireItmAnsVlSt() != null) {
			questionnaireitem.setAnswerValueSet(q.getQstnaireItmAnsVlSt());
		}
		/******************** questionnaireitemcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireitemcode =  new org.hl7.fhir.r4.model.Coding();
		questionnaireitem.addCode(questionnaireitemcode);

		/******************** Qstnaire_Itm_Cd_Cd ********************************************************************************/
		if(q.getQstnaireItmCdCd() != null) {
			questionnaireitemcode.setCode(q.getQstnaireItmCdCd());
		}
		/******************** Qstnaire_Itm_Cd_Dsply ********************************************************************************/
		if(q.getQstnaireItmCdDsply() != null) {
			questionnaireitemcode.setDisplay(q.getQstnaireItmCdDsply());
		}
		/******************** Qstnaire_Itm_Cd_Sys ********************************************************************************/
		if(q.getQstnaireItmCdSys() != null) {
			questionnaireitemcode.setSystem(q.getQstnaireItmCdSys());
		}
		/******************** Qstnaire_Itm_Cd_UsrSltd ********************************************************************************/
		if(q.getQstnaireItmCdUsrSltd() != null) {
			questionnaireitemcode.setUserSelected(Boolean.parseBoolean(q.getQstnaireItmCdUsrSltd()));
		}
		/******************** Qstnaire_Itm_Cd_Vrsn ********************************************************************************/
		if(q.getQstnaireItmCdVrsn() != null) {
			questionnaireitemcode.setVersion(q.getQstnaireItmCdVrsn());
		}
		/******************** Qstnaire_Itm_Dfn ********************************************************************************/
		if(q.getQstnaireItmDfn() != null) {
			questionnaireitem.setDefinition(q.getQstnaireItmDfn());
		}
		/******************** questionnaireitemenablebehavior ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.EnableWhenBehaviorEnumFactory questionnaireitemenablebehavior =  new org.hl7.fhir.r4.model.Questionnaire.EnableWhenBehaviorEnumFactory();
		questionnaireitem.setEnableBehavior(questionnaireitemenablebehavior.fromCode(q.getQstnaireItmEnableBehavior()));

		/******************** questionnaireitemenablewhen ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent questionnaireitemenablewhen =  new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemEnableWhenComponent();
		questionnaireitem.addEnableWhen(questionnaireitemenablewhen);

		/******************** Qstnaire_Itm_EnableWhen_AnsBooleanTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsBooleanTyp() != null) {
			questionnaireitemenablewhen.setAnswer( new org.hl7.fhir.r4.model.BooleanType(q.getQstnaireItmEnableWhenAnsBooleanTyp()));
		}
		/******************** questionnaireitemenablewhenanswercoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireitemenablewhenanswercoding =  new org.hl7.fhir.r4.model.Coding();
		questionnaireitemenablewhen.setAnswer(questionnaireitemenablewhenanswercoding);

		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Cd ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgCd() != null) {
			questionnaireitemenablewhenanswercoding.setCode(q.getQstnaireItmEnableWhenAnsCdgCd());
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Dsply ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgDsply() != null) {
			questionnaireitemenablewhenanswercoding.setDisplay(q.getQstnaireItmEnableWhenAnsCdgDsply());
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Sys ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgSys() != null) {
			questionnaireitemenablewhenanswercoding.setSystem(q.getQstnaireItmEnableWhenAnsCdgSys());
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgUsrSltd() != null) {
			questionnaireitemenablewhenanswercoding.setUserSelected(Boolean.parseBoolean(q.getQstnaireItmEnableWhenAnsCdgUsrSltd()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Vrsn ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgVrsn() != null) {
			questionnaireitemenablewhenanswercoding.setVersion(q.getQstnaireItmEnableWhenAnsCdgVrsn());
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsDtTimeTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsDtTimeTyp() != null) {
			questionnaireitemenablewhen.setAnswer( new org.hl7.fhir.r4.model.DateTimeType(q.getQstnaireItmEnableWhenAnsDtTimeTyp()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsDtTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsDtTyp() != null) {
			questionnaireitemenablewhen.setAnswer( new org.hl7.fhir.r4.model.DateType(q.getQstnaireItmEnableWhenAnsDtTyp()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsDecimalTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsDecimalTyp() != null) {
			questionnaireitemenablewhen.setAnswer( new org.hl7.fhir.r4.model.DecimalType(q.getQstnaireItmEnableWhenAnsDecimalTyp()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsIntegerTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsIntegerTyp() != null) {
			questionnaireitemenablewhen.setAnswer( new org.hl7.fhir.r4.model.IntegerType(q.getQstnaireItmEnableWhenAnsIntegerTyp()));
		}
		/******************** questionnaireitemenablewhenanswerquantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireitemenablewhenanswerquantity =  new org.hl7.fhir.r4.model.Quantity();
		questionnaireitemenablewhen.setAnswer(questionnaireitemenablewhenanswerquantity);

		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Cd ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsQntyCd() != null) {
			questionnaireitemenablewhenanswerquantity.setCode(q.getQstnaireItmEnableWhenAnsQntyCd());
		}
		/******************** questionnaireitemenablewhenanswerquantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory questionnaireitemenablewhenanswerquantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		questionnaireitemenablewhenanswerquantity.setComparator(questionnaireitemenablewhenanswerquantitycomparator.fromCode(q.getQstnaireItmEnableWhenAnsQntyCmprtr()));

		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Sys ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsQntySys() != null) {
			questionnaireitemenablewhenanswerquantity.setSystem(q.getQstnaireItmEnableWhenAnsQntySys());
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Unt ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsQntyUnt() != null) {
			questionnaireitemenablewhenanswerquantity.setUnit(q.getQstnaireItmEnableWhenAnsQntyUnt());
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Vl ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsQntyVl() != null) {
			questionnaireitemenablewhenanswerquantity.setValue(Double.parseDouble((q.getQstnaireItmEnableWhenAnsQntyVl())));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsRfrnc ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsRfrnc() != null) {
			questionnaireitemenablewhen.setAnswer( new org.hl7.fhir.r4.model.Reference(q.getQstnaireItmEnableWhenAnsRfrnc()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsStrgTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsStrgTyp() != null) {
			questionnaireitemenablewhen.setAnswer( new org.hl7.fhir.r4.model.StringType(q.getQstnaireItmEnableWhenAnsStrgTyp()));
		}
		/******************** Qstnaire_Itm_EnableWhen_AnsTimeTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsTimeTyp() != null) {
			questionnaireitemenablewhen.setAnswer( new org.hl7.fhir.r4.model.TimeType(q.getQstnaireItmEnableWhenAnsTimeTyp()));
		}
		/******************** questionnaireitemenablewhenoperator ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemOperatorEnumFactory questionnaireitemenablewhenoperator =  new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemOperatorEnumFactory();
		questionnaireitemenablewhen.setOperator(questionnaireitemenablewhenoperator.fromCode(q.getQstnaireItmEnableWhenOperator()));

		/******************** Qstnaire_Itm_EnableWhen_Question ********************************************************************************/
		if(q.getQstnaireItmEnableWhenQuestion() != null) {
			questionnaireitemenablewhen.setQuestion(q.getQstnaireItmEnableWhenQuestion());
		}
		/******************** questionnaireiteminitial ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemInitialComponent questionnaireiteminitial =  new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemInitialComponent();
		questionnaireitem.addInitial(questionnaireiteminitial);

		/******************** questionnaireiteminitialvalueattachment ********************************************************************************/
		org.hl7.fhir.r4.model.Attachment questionnaireiteminitialvalueattachment =  new org.hl7.fhir.r4.model.Attachment();
		questionnaireiteminitial.setValue(questionnaireiteminitialvalueattachment);

		/******************** Qstnaire_Itm_Initial_VlAttchmnt_CntntTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntCntntTyp() != null) {
			questionnaireiteminitialvalueattachment.setContentType(q.getQstnaireItmInitialVlAttchmntCntntTyp());
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Creation ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntCreation() != null) {
			java.text.SimpleDateFormat Qstnaire_Itm_Initial_VlAttchmnt_Creationsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_Itm_Initial_VlAttchmnt_Creationdate = Qstnaire_Itm_Initial_VlAttchmnt_Creationsdf.parse(q.getQstnaireItmInitialVlAttchmntCreation());
			questionnaireiteminitialvalueattachment.setCreation(Qstnaire_Itm_Initial_VlAttchmnt_Creationdate);
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Data ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntData() != null) {
			questionnaireiteminitialvalueattachment.setDataElement(new org.hl7.fhir.r4.model.Base64BinaryType(q.getQstnaireItmInitialVlAttchmntData()));
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Hash ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntHash() != null) {
			questionnaireiteminitialvalueattachment.setHashElement(new org.hl7.fhir.r4.model.Base64BinaryType(q.getQstnaireItmInitialVlAttchmntHash()));
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Lnguage ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntLnguage() != null) {
			questionnaireiteminitialvalueattachment.setLanguage(q.getQstnaireItmInitialVlAttchmntLnguage());
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Sz ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntSz() != null) {
			questionnaireiteminitialvalueattachment.setSize(Integer.parseInt(q.getQstnaireItmInitialVlAttchmntSz()));
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Ttl ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntTtl() != null) {
			questionnaireiteminitialvalueattachment.setTitle(q.getQstnaireItmInitialVlAttchmntTtl());
		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Url ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntUrl() != null) {
			questionnaireiteminitialvalueattachment.setUrl(q.getQstnaireItmInitialVlAttchmntUrl());
		}
		/******************** Qstnaire_Itm_Initial_VlBooleanTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlBooleanTyp() != null) {
			questionnaireiteminitial.setValue( new org.hl7.fhir.r4.model.BooleanType(q.getQstnaireItmInitialVlBooleanTyp()));
		}
		/******************** questionnaireiteminitialvaluecoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireiteminitialvaluecoding =  new org.hl7.fhir.r4.model.Coding();
		questionnaireiteminitial.setValue(questionnaireiteminitialvaluecoding);

		/******************** Qstnaire_Itm_Initial_VlCdg_Cd ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgCd() != null) {
			questionnaireiteminitialvaluecoding.setCode(q.getQstnaireItmInitialVlCdgCd());
		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Dsply ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgDsply() != null) {
			questionnaireiteminitialvaluecoding.setDisplay(q.getQstnaireItmInitialVlCdgDsply());
		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Sys ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgSys() != null) {
			questionnaireiteminitialvaluecoding.setSystem(q.getQstnaireItmInitialVlCdgSys());
		}
		/******************** Qstnaire_Itm_Initial_VlCdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgUsrSltd() != null) {
			questionnaireiteminitialvaluecoding.setUserSelected(Boolean.parseBoolean(q.getQstnaireItmInitialVlCdgUsrSltd()));
		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Vrsn ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgVrsn() != null) {
			questionnaireiteminitialvaluecoding.setVersion(q.getQstnaireItmInitialVlCdgVrsn());
		}
		/******************** Qstnaire_Itm_Initial_VlDtTimeTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlDtTimeTyp() != null) {
			questionnaireiteminitial.setValue( new org.hl7.fhir.r4.model.DateTimeType(q.getQstnaireItmInitialVlDtTimeTyp()));
		}
		/******************** Qstnaire_Itm_Initial_VlDtTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlDtTyp() != null) {
			questionnaireiteminitial.setValue( new org.hl7.fhir.r4.model.DateType(q.getQstnaireItmInitialVlDtTyp()));
		}
		/******************** Qstnaire_Itm_Initial_VlDecimalTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlDecimalTyp() != null) {
			questionnaireiteminitial.setValue( new org.hl7.fhir.r4.model.DecimalType(q.getQstnaireItmInitialVlDecimalTyp()));
		}
		/******************** Qstnaire_Itm_Initial_VlIntegerTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlIntegerTyp() != null) {
			questionnaireiteminitial.setValue( new org.hl7.fhir.r4.model.IntegerType(q.getQstnaireItmInitialVlIntegerTyp()));
		}
		/******************** questionnaireiteminitialvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireiteminitialvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		questionnaireiteminitial.setValue(questionnaireiteminitialvaluequantity);

		/******************** Qstnaire_Itm_Initial_VlQnty_Cd ********************************************************************************/
		if(q.getQstnaireItmInitialVlQntyCd() != null) {
			questionnaireiteminitialvaluequantity.setCode(q.getQstnaireItmInitialVlQntyCd());
		}
		/******************** questionnaireiteminitialvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory questionnaireiteminitialvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		questionnaireiteminitialvaluequantity.setComparator(questionnaireiteminitialvaluequantitycomparator.fromCode(q.getQstnaireItmInitialVlQntyCmprtr()));

		/******************** Qstnaire_Itm_Initial_VlQnty_Sys ********************************************************************************/
		if(q.getQstnaireItmInitialVlQntySys() != null) {
			questionnaireiteminitialvaluequantity.setSystem(q.getQstnaireItmInitialVlQntySys());
		}
		/******************** Qstnaire_Itm_Initial_VlQnty_Unt ********************************************************************************/
		if(q.getQstnaireItmInitialVlQntyUnt() != null) {
			questionnaireiteminitialvaluequantity.setUnit(q.getQstnaireItmInitialVlQntyUnt());
		}
		/******************** Qstnaire_Itm_Initial_VlQnty_Vl ********************************************************************************/
		if(q.getQstnaireItmInitialVlQntyVl() != null) {
			questionnaireiteminitialvaluequantity.setValue(Double.parseDouble((q.getQstnaireItmInitialVlQntyVl())));
		}
		/******************** Qstnaire_Itm_Initial_VlRfrnc ********************************************************************************/
		if(q.getQstnaireItmInitialVlRfrnc() != null) {
			questionnaireiteminitial.setValue( new org.hl7.fhir.r4.model.Reference(q.getQstnaireItmInitialVlRfrnc()));
		}
		/******************** Qstnaire_Itm_Initial_VlStrgTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlStrgTyp() != null) {
			questionnaireiteminitial.setValue( new org.hl7.fhir.r4.model.StringType(q.getQstnaireItmInitialVlStrgTyp()));
		}
		/******************** Qstnaire_Itm_Initial_VlTimeTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlTimeTyp() != null) {
			questionnaireiteminitial.setValue( new org.hl7.fhir.r4.model.TimeType(q.getQstnaireItmInitialVlTimeTyp()));
		}
		/******************** Qstnaire_Itm_Initial_VlUriTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlUriTyp() != null) {
			questionnaireiteminitial.setValue( new org.hl7.fhir.r4.model.UriType(q.getQstnaireItmInitialVlUriTyp()));
		}
		/******************** Qstnaire_Itm_LinkId ********************************************************************************/
		if(q.getQstnaireItmLinkId() != null) {
			questionnaireitem.setLinkId(q.getQstnaireItmLinkId());
		}
		/******************** Qstnaire_Itm_MxLength ********************************************************************************/
		if(q.getQstnaireItmMxLength() != null) {
			questionnaireitem.setMaxLength(Integer.parseInt(q.getQstnaireItmMxLength()));
		}
		/******************** Qstnaire_Itm_Prefix ********************************************************************************/
		if(q.getQstnaireItmPrefix() != null) {
			questionnaireitem.setPrefix(q.getQstnaireItmPrefix());
		}
		/******************** Qstnaire_Itm_ReadOnly ********************************************************************************/
		if(q.getQstnaireItmReadOnly() != null) {
			questionnaireitem.setReadOnly(Boolean.parseBoolean(q.getQstnaireItmReadOnly()));
		}
		/******************** Qstnaire_Itm_Rpts ********************************************************************************/
		if(q.getQstnaireItmRpts() != null) {
			questionnaireitem.setRepeats(Boolean.parseBoolean(q.getQstnaireItmRpts()));
		}
		/******************** Qstnaire_Itm_Required ********************************************************************************/
		if(q.getQstnaireItmRequired() != null) {
			questionnaireitem.setRequired(Boolean.parseBoolean(q.getQstnaireItmRequired()));
		}
		/******************** Qstnaire_Itm_Txt ********************************************************************************/
		if(q.getQstnaireItmTxt() != null) {
			questionnaireitem.setText(q.getQstnaireItmTxt());
		}
		/******************** questionnaireitemtype ********************************************************************************/
		org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemTypeEnumFactory questionnaireitemtype =  new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemTypeEnumFactory();
		questionnaireitem.setType(questionnaireitemtype.fromCode(q.getQstnaireItmTyp()));

		/******************** questionnairejurisdiction ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnairejurisdiction =  new org.hl7.fhir.r4.model.CodeableConcept();
		questionnaire.addJurisdiction(questionnairejurisdiction);

		/******************** questionnairejurisdictioncoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnairejurisdictioncoding =  new org.hl7.fhir.r4.model.Coding();
		questionnairejurisdiction.addCoding(questionnairejurisdictioncoding);

		/******************** Qstnaire_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgCd() != null) {
			questionnairejurisdictioncoding.setCode(q.getQstnaireJrsdctnCdgCd());
		}
		/******************** Qstnaire_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgDsply() != null) {
			questionnairejurisdictioncoding.setDisplay(q.getQstnaireJrsdctnCdgDsply());
		}
		/******************** Qstnaire_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgSys() != null) {
			questionnairejurisdictioncoding.setSystem(q.getQstnaireJrsdctnCdgSys());
		}
		/******************** Qstnaire_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgUsrSltd() != null) {
			questionnairejurisdictioncoding.setUserSelected(Boolean.parseBoolean(q.getQstnaireJrsdctnCdgUsrSltd()));
		}
		/******************** Qstnaire_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgVrsn() != null) {
			questionnairejurisdictioncoding.setVersion(q.getQstnaireJrsdctnCdgVrsn());
		}
		/******************** Qstnaire_Jrsdctn_Txt ********************************************************************************/
		if(q.getQstnaireJrsdctnTxt() != null) {
			questionnairejurisdiction.setText(q.getQstnaireJrsdctnTxt());
		}
		/******************** Qstnaire_LastReviewDt ********************************************************************************/
		if(q.getQstnaireLastReviewDt() != null) {
			java.text.SimpleDateFormat Qstnaire_LastReviewDtsdf = new java.text.SimpleDateFormat("yyyy-M-dd");
			java.util.Date Qstnaire_LastReviewDtdate = Qstnaire_LastReviewDtsdf.parse(q.getQstnaireLastReviewDt());
			questionnaire.setLastReviewDate(Qstnaire_LastReviewDtdate);
		}
		/******************** Qstnaire_Nm ********************************************************************************/
		if(q.getQstnaireNm() != null) {
			questionnaire.setName(q.getQstnaireNm());
		}
		/******************** Qstnaire_Pblshr ********************************************************************************/
		if(q.getQstnairePblshr() != null) {
			questionnaire.setPublisher(q.getQstnairePblshr());
		}
		/******************** Qstnaire_Prpse ********************************************************************************/
		if(q.getQstnairePrpse() != null) {
			questionnaire.setPurpose(q.getQstnairePrpse());
		}
		/******************** questionnairestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory questionnairestatus =  new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory();
		questionnaire.setStatus(questionnairestatus.fromCode(q.getQstnaireSts()));

		/******************** Qstnaire_SbjctTyp ********************************************************************************/
		if(q.getQstnaireSbjctTyp() != null) {
			questionnaire.addSubjectType(q.getQstnaireSbjctTyp());
		}
		/******************** Qstnaire_Ttl ********************************************************************************/
		if(q.getQstnaireTtl() != null) {
			questionnaire.setTitle(q.getQstnaireTtl());
		}
		/******************** Qstnaire_Url ********************************************************************************/
		if(q.getQstnaireUrl() != null) {
			questionnaire.setUrl(q.getQstnaireUrl());
		}
		/******************** questionnaireusecontext ********************************************************************************/
		org.hl7.fhir.r4.model.UsageContext questionnaireusecontext =  new org.hl7.fhir.r4.model.UsageContext();
		questionnaire.addUseContext(questionnaireusecontext);

		/******************** questionnaireusecontextcode ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireusecontextcode =  new org.hl7.fhir.r4.model.Coding();
		questionnaireusecontext.setCode(questionnaireusecontextcode);

		/******************** Qstnaire_UseCntxt_Cd_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtCdCd() != null) {
			questionnaireusecontextcode.setCode(q.getQstnaireUseCntxtCdCd());
		}
		/******************** Qstnaire_UseCntxt_Cd_Dsply ********************************************************************************/
		if(q.getQstnaireUseCntxtCdDsply() != null) {
			questionnaireusecontextcode.setDisplay(q.getQstnaireUseCntxtCdDsply());
		}
		/******************** Qstnaire_UseCntxt_Cd_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtCdSys() != null) {
			questionnaireusecontextcode.setSystem(q.getQstnaireUseCntxtCdSys());
		}
		/******************** Qstnaire_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(q.getQstnaireUseCntxtCdUsrSltd() != null) {
			questionnaireusecontextcode.setUserSelected(Boolean.parseBoolean(q.getQstnaireUseCntxtCdUsrSltd()));
		}
		/******************** Qstnaire_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(q.getQstnaireUseCntxtCdVrsn() != null) {
			questionnaireusecontextcode.setVersion(q.getQstnaireUseCntxtCdVrsn());
		}
		/******************** questionnaireusecontextvaluecodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept questionnaireusecontextvaluecodeableconcept =  new org.hl7.fhir.r4.model.CodeableConcept();
		questionnaireusecontext.setValue(questionnaireusecontextvaluecodeableconcept);

		/******************** questionnaireusecontextvaluecodeableconceptcoding ********************************************************************************/
		org.hl7.fhir.r4.model.Coding questionnaireusecontextvaluecodeableconceptcoding =  new org.hl7.fhir.r4.model.Coding();
		questionnaireusecontextvaluecodeableconcept.addCoding(questionnaireusecontextvaluecodeableconceptcoding);

		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgCd() != null) {
			questionnaireusecontextvaluecodeableconceptcoding.setCode(q.getQstnaireUseCntxtVlCdbleCncptCdgCd());
		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgDsply() != null) {
			questionnaireusecontextvaluecodeableconceptcoding.setDisplay(q.getQstnaireUseCntxtVlCdbleCncptCdgDsply());
		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgSys() != null) {
			questionnaireusecontextvaluecodeableconceptcoding.setSystem(q.getQstnaireUseCntxtVlCdbleCncptCdgSys());
		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgUsrSltd() != null) {
			questionnaireusecontextvaluecodeableconceptcoding.setUserSelected(Boolean.parseBoolean(q.getQstnaireUseCntxtVlCdbleCncptCdgUsrSltd()));
		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgVrsn() != null) {
			questionnaireusecontextvaluecodeableconceptcoding.setVersion(q.getQstnaireUseCntxtVlCdbleCncptCdgVrsn());
		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptTxt() != null) {
			questionnaireusecontextvaluecodeableconcept.setText(q.getQstnaireUseCntxtVlCdbleCncptTxt());
		}
		/******************** questionnaireusecontextvaluequantity ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireusecontextvaluequantity =  new org.hl7.fhir.r4.model.Quantity();
		questionnaireusecontext.setValue(questionnaireusecontextvaluequantity);

		/******************** Qstnaire_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlQntyCd() != null) {
			questionnaireusecontextvaluequantity.setCode(q.getQstnaireUseCntxtVlQntyCd());
		}
		/******************** questionnaireusecontextvaluequantitycomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory questionnaireusecontextvaluequantitycomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		questionnaireusecontextvaluequantity.setComparator(questionnaireusecontextvaluequantitycomparator.fromCode(q.getQstnaireUseCntxtVlQntyCmprtr()));

		/******************** Qstnaire_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtVlQntySys() != null) {
			questionnaireusecontextvaluequantity.setSystem(q.getQstnaireUseCntxtVlQntySys());
		}
		/******************** Qstnaire_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(q.getQstnaireUseCntxtVlQntyUnt() != null) {
			questionnaireusecontextvaluequantity.setUnit(q.getQstnaireUseCntxtVlQntyUnt());
		}
		/******************** Qstnaire_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(q.getQstnaireUseCntxtVlQntyVl() != null) {
			questionnaireusecontextvaluequantity.setValue(Double.parseDouble((q.getQstnaireUseCntxtVlQntyVl())));
		}
		/******************** questionnaireusecontextvaluerange ********************************************************************************/
		org.hl7.fhir.r4.model.Range questionnaireusecontextvaluerange =  new org.hl7.fhir.r4.model.Range();
		questionnaireusecontext.setValue(questionnaireusecontextvaluerange);

		/******************** questionnaireusecontextvaluerangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireusecontextvaluerangehigh =  new org.hl7.fhir.r4.model.Quantity();
		questionnaireusecontextvaluerange.setHigh(questionnaireusecontextvaluerangehigh);

		/******************** Qstnaire_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngHiCd() != null) {
			questionnaireusecontextvaluerangehigh.setCode(q.getQstnaireUseCntxtVlRngHiCd());
		}
		/******************** questionnaireusecontextvaluerangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory questionnaireusecontextvaluerangehighcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		questionnaireusecontextvaluerangehigh.setComparator(questionnaireusecontextvaluerangehighcomparator.fromCode(q.getQstnaireUseCntxtVlRngHiCmprtr()));

		/******************** Qstnaire_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngHiSys() != null) {
			questionnaireusecontextvaluerangehigh.setSystem(q.getQstnaireUseCntxtVlRngHiSys());
		}
		/******************** Qstnaire_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngHiUnt() != null) {
			questionnaireusecontextvaluerangehigh.setUnit(q.getQstnaireUseCntxtVlRngHiUnt());
		}
		/******************** Qstnaire_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngHiVl() != null) {
			questionnaireusecontextvaluerangehigh.setValue(Double.parseDouble((q.getQstnaireUseCntxtVlRngHiVl())));
		}
		/******************** questionnaireusecontextvaluerangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity questionnaireusecontextvaluerangelow =  new org.hl7.fhir.r4.model.Quantity();
		questionnaireusecontextvaluerange.setLow(questionnaireusecontextvaluerangelow);

		/******************** Qstnaire_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngLwCd() != null) {
			questionnaireusecontextvaluerangelow.setCode(q.getQstnaireUseCntxtVlRngLwCd());
		}
		/******************** questionnaireusecontextvaluerangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory questionnaireusecontextvaluerangelowcomparator =  new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory();
		questionnaireusecontextvaluerangelow.setComparator(questionnaireusecontextvaluerangelowcomparator.fromCode(q.getQstnaireUseCntxtVlRngLwCmprtr()));

		/******************** Qstnaire_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngLwSys() != null) {
			questionnaireusecontextvaluerangelow.setSystem(q.getQstnaireUseCntxtVlRngLwSys());
		}
		/******************** Qstnaire_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngLwUnt() != null) {
			questionnaireusecontextvaluerangelow.setUnit(q.getQstnaireUseCntxtVlRngLwUnt());
		}
		/******************** Qstnaire_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngLwVl() != null) {
			questionnaireusecontextvaluerangelow.setValue(Double.parseDouble((q.getQstnaireUseCntxtVlRngLwVl())));
		}
		/******************** Qstnaire_UseCntxt_VlRfrnc ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRfrnc() != null) {
			questionnaireusecontext.setValue( new org.hl7.fhir.r4.model.Reference(q.getQstnaireUseCntxtVlRfrnc()));
		}
		/******************** Qstnaire_Vrsn ********************************************************************************/
		if(q.getQstnaireVrsn() != null) {
			questionnaire.setVersion(q.getQstnaireVrsn());
		}
		return questionnaire;
	}
}
