package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Condition;
public class ConditionBidirectionalConversion 
{
	public Condition Conditions(org.hl7.fhir.r4.model.Condition condition) throws ParseException
	{
		 main.java.com.campfhir.model.Condition c = new  main.java.com.campfhir.model.Condition();

		/******************** id ********************************************************************************/
		c.setId(condition.getIdElement().getIdPart());

		/******************** conditioncode ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditioncode = condition.getCode();

		/******************** Cndtn_Cd_Txt ********************************************************************************/
		if(conditioncode.hasText()) {

			c.addCndtnCdTxt(String.valueOf(conditioncode.getText()));
		} else {
			c.addCndtnCdTxt("NULL");
		}


		/******************** conditioncodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditioncodecodinglist = conditioncode.getCoding();
		for(int conditioncodecodingi = 0; conditioncodecodingi<conditioncodecodinglist.size();conditioncodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditioncodecoding = conditioncodecodinglist.get(conditioncodecodingi);

		/******************** Cndtn_Cd_Cdg_Dsply ********************************************************************************/
		if(conditioncodecodingi == 0) {c.addCndtnCdCdgDsply("[");}
		if(conditioncodecoding.hasDisplay()) {

			c.addCndtnCdCdgDsply(String.valueOf(conditioncodecoding.getDisplay()));
		} else {
			c.addCndtnCdCdgDsply("NULL");
		}

		if(conditioncodecodingi == conditioncodecodinglist.size()-1) {c.addCndtnCdCdgDsply("]");}


		/******************** Cndtn_Cd_Cdg_Vrsn ********************************************************************************/
		if(conditioncodecodingi == 0) {c.addCndtnCdCdgVrsn("[");}
		if(conditioncodecoding.hasVersion()) {

			c.addCndtnCdCdgVrsn(String.valueOf(conditioncodecoding.getVersion()));
		} else {
			c.addCndtnCdCdgVrsn("NULL");
		}

		if(conditioncodecodingi == conditioncodecodinglist.size()-1) {c.addCndtnCdCdgVrsn("]");}


		/******************** Cndtn_Cd_Cdg_Cd ********************************************************************************/
		if(conditioncodecodingi == 0) {c.addCndtnCdCdgCd("[");}
		if(conditioncodecoding.hasCode()) {

			c.addCndtnCdCdgCd(String.valueOf(conditioncodecoding.getCode()));
		} else {
			c.addCndtnCdCdgCd("NULL");
		}

		if(conditioncodecodingi == conditioncodecodinglist.size()-1) {c.addCndtnCdCdgCd("]");}


		/******************** Cndtn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(conditioncodecodingi == 0) {c.addCndtnCdCdgUsrSltd("[");}
		if(conditioncodecoding.hasUserSelected()) {

			c.addCndtnCdCdgUsrSltd(String.valueOf(conditioncodecoding.getUserSelected()));
		} else {
			c.addCndtnCdCdgUsrSltd("NULL");
		}

		if(conditioncodecodingi == conditioncodecodinglist.size()-1) {c.addCndtnCdCdgUsrSltd("]");}


		/******************** Cndtn_Cd_Cdg_Sys ********************************************************************************/
		if(conditioncodecodingi == 0) {c.addCndtnCdCdgSys("[");}
		if(conditioncodecoding.hasSystem()) {

			c.addCndtnCdCdgSys(String.valueOf(conditioncodecoding.getSystem()));
		} else {
			c.addCndtnCdCdgSys("NULL");
		}

		if(conditioncodecodingi == conditioncodecodinglist.size()-1) {c.addCndtnCdCdgSys("]");}


		 };
		/******************** Cndtn_Sbjct ********************************************************************************/
		if(condition.hasSubject()) {

			if(condition.getSubject().getReference() != null) {
			c.addCndtnSbjct(condition.getSubject().getReference());
			}
		} else {
			c.addCndtnSbjct("NULL");
		}


		/******************** Cndtn_Enc ********************************************************************************/
		if(condition.hasEncounter()) {

			if(condition.getEncounter().getReference() != null) {
			c.addCndtnEnc(condition.getEncounter().getReference());
			}
		} else {
			c.addCndtnEnc("NULL");
		}


		/******************** conditionnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> conditionnotelist = condition.getNote();
		for(int conditionnotei = 0; conditionnotei<conditionnotelist.size();conditionnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  conditionnote = conditionnotelist.get(conditionnotei);

		/******************** Cndtn_Nt_Time ********************************************************************************/
		if(conditionnotei == 0) {c.addCndtnNtTime("[");}
		if(conditionnote.hasTime()) {

			c.addCndtnNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(conditionnote.getTime())+"\"");
		} else {
			c.addCndtnNtTime("NULL");
		}

		if(conditionnotei == conditionnotelist.size()-1) {c.addCndtnNtTime("]");}


		/******************** Cndtn_Nt_AthrRfrnc ********************************************************************************/
		if(conditionnotei == 0) {c.addCndtnNtAthrRfrnc("[");}
		if(conditionnote.hasAuthorReference()) {

			if(conditionnote.getAuthorReference().getReference() != null) {
			c.addCndtnNtAthrRfrnc(conditionnote.getAuthorReference().getReference());
			}
		} else {
			c.addCndtnNtAthrRfrnc("NULL");
		}

		if(conditionnotei == conditionnotelist.size()-1) {c.addCndtnNtAthrRfrnc("]");}


		/******************** Cndtn_Nt_Txt ********************************************************************************/
		if(conditionnotei == 0) {c.addCndtnNtTxt("[");}
		if(conditionnote.hasText()) {

			c.addCndtnNtTxt(String.valueOf(conditionnote.getText()));
		} else {
			c.addCndtnNtTxt("NULL");
		}

		if(conditionnotei == conditionnotelist.size()-1) {c.addCndtnNtTxt("]");}


		/******************** Cndtn_Nt_AthrStrgTyp ********************************************************************************/
		if(conditionnotei == 0) {c.addCndtnNtAthrStrgTyp("[");}
		if(conditionnote.hasAuthorStringType()) {

			c.addCndtnNtAthrStrgTyp("\""+conditionnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			c.addCndtnNtAthrStrgTyp("NULL");
		}

		if(conditionnotei == conditionnotelist.size()-1) {c.addCndtnNtAthrStrgTyp("]");}


		 };
		/******************** conditionidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> conditionidentifierlist = condition.getIdentifier();
		for(int conditionidentifieri = 0; conditionidentifieri<conditionidentifierlist.size();conditionidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  conditionidentifier = conditionidentifierlist.get(conditionidentifieri);

		/******************** Cndtn_Id_Vl ********************************************************************************/
		if(conditionidentifieri == 0) {c.addCndtnIdVl("[");}
		if(conditionidentifier.hasValue()) {

			c.addCndtnIdVl(String.valueOf(conditionidentifier.getValue()));
		} else {
			c.addCndtnIdVl("NULL");
		}

		if(conditionidentifieri == conditionidentifierlist.size()-1) {c.addCndtnIdVl("]");}


		/******************** conditionidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionidentifiertype = conditionidentifier.getType();

		/******************** Cndtn_Id_Typ_Txt ********************************************************************************/
		if(conditionidentifieri == 0) {c.addCndtnIdTypTxt("[");}
		if(conditionidentifiertype.hasText()) {

			c.addCndtnIdTypTxt(String.valueOf(conditionidentifiertype.getText()));
		} else {
			c.addCndtnIdTypTxt("NULL");
		}

		if(conditionidentifieri == conditionidentifierlist.size()-1) {c.addCndtnIdTypTxt("]");}


		/******************** conditionidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditionidentifiertypecodinglist = conditionidentifiertype.getCoding();
		for(int conditionidentifiertypecodingi = 0; conditionidentifiertypecodingi<conditionidentifiertypecodinglist.size();conditionidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditionidentifiertypecoding = conditionidentifiertypecodinglist.get(conditionidentifiertypecodingi);

		/******************** Cndtn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(conditionidentifiertypecodingi == 0) {c.addCndtnIdTypCdgDsply("[[");}
		if(conditionidentifiertypecoding.hasDisplay()) {

			c.addCndtnIdTypCdgDsply(String.valueOf(conditionidentifiertypecoding.getDisplay()));
		} else {
			c.addCndtnIdTypCdgDsply("NULL");
		}

		if(conditionidentifiertypecodingi == conditionidentifiertypecodinglist.size()-1) {c.addCndtnIdTypCdgDsply("]]");}


		/******************** Cndtn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(conditionidentifiertypecodingi == 0) {c.addCndtnIdTypCdgVrsn("[[");}
		if(conditionidentifiertypecoding.hasVersion()) {

			c.addCndtnIdTypCdgVrsn(String.valueOf(conditionidentifiertypecoding.getVersion()));
		} else {
			c.addCndtnIdTypCdgVrsn("NULL");
		}

		if(conditionidentifiertypecodingi == conditionidentifiertypecodinglist.size()-1) {c.addCndtnIdTypCdgVrsn("]]");}


		/******************** Cndtn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(conditionidentifiertypecodingi == 0) {c.addCndtnIdTypCdgCd("[[");}
		if(conditionidentifiertypecoding.hasCode()) {

			c.addCndtnIdTypCdgCd(String.valueOf(conditionidentifiertypecoding.getCode()));
		} else {
			c.addCndtnIdTypCdgCd("NULL");
		}

		if(conditionidentifiertypecodingi == conditionidentifiertypecodinglist.size()-1) {c.addCndtnIdTypCdgCd("]]");}


		/******************** Cndtn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(conditionidentifiertypecodingi == 0) {c.addCndtnIdTypCdgUsrSltd("[[");}
		if(conditionidentifiertypecoding.hasUserSelected()) {

			c.addCndtnIdTypCdgUsrSltd(String.valueOf(conditionidentifiertypecoding.getUserSelected()));
		} else {
			c.addCndtnIdTypCdgUsrSltd("NULL");
		}

		if(conditionidentifiertypecodingi == conditionidentifiertypecodinglist.size()-1) {c.addCndtnIdTypCdgUsrSltd("]]");}


		/******************** Cndtn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(conditionidentifiertypecodingi == 0) {c.addCndtnIdTypCdgSys("[[");}
		if(conditionidentifiertypecoding.hasSystem()) {

			c.addCndtnIdTypCdgSys(String.valueOf(conditionidentifiertypecoding.getSystem()));
		} else {
			c.addCndtnIdTypCdgSys("NULL");
		}

		if(conditionidentifiertypecodingi == conditionidentifiertypecodinglist.size()-1) {c.addCndtnIdTypCdgSys("]]");}


		 };
		/******************** conditionidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conditionidentifierperiod = conditionidentifier.getPeriod();

		/******************** Cndtn_Id_Prd_Strt ********************************************************************************/
		if(conditionidentifieri == 0) {c.addCndtnIdPrdStrt("[");}
		if(conditionidentifierperiod.hasStart()) {

			c.addCndtnIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(conditionidentifierperiod.getStart())+"\"");
		} else {
			c.addCndtnIdPrdStrt("NULL");
		}

		if(conditionidentifieri == conditionidentifierlist.size()-1) {c.addCndtnIdPrdStrt("]");}


		/******************** Cndtn_Id_Prd_End ********************************************************************************/
		if(conditionidentifieri == 0) {c.addCndtnIdPrdEnd("[");}
		if(conditionidentifierperiod.hasEnd()) {

			c.addCndtnIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(conditionidentifierperiod.getEnd())+"\"");
		} else {
			c.addCndtnIdPrdEnd("NULL");
		}

		if(conditionidentifieri == conditionidentifierlist.size()-1) {c.addCndtnIdPrdEnd("]");}


		/******************** conditionidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse conditionidentifieruse = conditionidentifier.getUse();
		if(conditionidentifieruse!=null) {
		if(conditionidentifieri == 0) {

		c.addCndtnIdUse("[");		}
			c.addCndtnIdUse(conditionidentifieruse.toCode());
		if(conditionidentifieri == conditionidentifierlist.size()-1) {

		c.addCndtnIdUse("]");		}

		} else {
			c.addCndtnIdUse("NULL");
		}

		/******************** Cndtn_Id_Assigner ********************************************************************************/
		if(conditionidentifieri == 0) {c.addCndtnIdAssigner("[");}
		if(conditionidentifier.hasAssigner()) {

			if(conditionidentifier.getAssigner().getReference() != null) {
			c.addCndtnIdAssigner(conditionidentifier.getAssigner().getReference());
			}
		} else {
			c.addCndtnIdAssigner("NULL");
		}

		if(conditionidentifieri == conditionidentifierlist.size()-1) {c.addCndtnIdAssigner("]");}


		/******************** Cndtn_Id_Sys ********************************************************************************/
		if(conditionidentifieri == 0) {c.addCndtnIdSys("[");}
		if(conditionidentifier.hasSystem()) {

			c.addCndtnIdSys(String.valueOf(conditionidentifier.getSystem()));
		} else {
			c.addCndtnIdSys("NULL");
		}

		if(conditionidentifieri == conditionidentifierlist.size()-1) {c.addCndtnIdSys("]");}


		 };
		/******************** conditionclinicalstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionclinicalstatus = condition.getClinicalStatus();

		/******************** Cndtn_ClnclSts_Txt ********************************************************************************/
		if(conditionclinicalstatus.hasText()) {

			c.addCndtnClnclStsTxt(String.valueOf(conditionclinicalstatus.getText()));
		} else {
			c.addCndtnClnclStsTxt("NULL");
		}


		/******************** conditionclinicalstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditionclinicalstatuscodinglist = conditionclinicalstatus.getCoding();
		for(int conditionclinicalstatuscodingi = 0; conditionclinicalstatuscodingi<conditionclinicalstatuscodinglist.size();conditionclinicalstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditionclinicalstatuscoding = conditionclinicalstatuscodinglist.get(conditionclinicalstatuscodingi);

		/******************** Cndtn_ClnclSts_Cdg_Dsply ********************************************************************************/
		if(conditionclinicalstatuscodingi == 0) {c.addCndtnClnclStsCdgDsply("[");}
		if(conditionclinicalstatuscoding.hasDisplay()) {

			c.addCndtnClnclStsCdgDsply(String.valueOf(conditionclinicalstatuscoding.getDisplay()));
		} else {
			c.addCndtnClnclStsCdgDsply("NULL");
		}

		if(conditionclinicalstatuscodingi == conditionclinicalstatuscodinglist.size()-1) {c.addCndtnClnclStsCdgDsply("]");}


		/******************** Cndtn_ClnclSts_Cdg_Vrsn ********************************************************************************/
		if(conditionclinicalstatuscodingi == 0) {c.addCndtnClnclStsCdgVrsn("[");}
		if(conditionclinicalstatuscoding.hasVersion()) {

			c.addCndtnClnclStsCdgVrsn(String.valueOf(conditionclinicalstatuscoding.getVersion()));
		} else {
			c.addCndtnClnclStsCdgVrsn("NULL");
		}

		if(conditionclinicalstatuscodingi == conditionclinicalstatuscodinglist.size()-1) {c.addCndtnClnclStsCdgVrsn("]");}


		/******************** Cndtn_ClnclSts_Cdg_Cd ********************************************************************************/
		if(conditionclinicalstatuscodingi == 0) {c.addCndtnClnclStsCdgCd("[");}
		if(conditionclinicalstatuscoding.hasCode()) {

			c.addCndtnClnclStsCdgCd(String.valueOf(conditionclinicalstatuscoding.getCode()));
		} else {
			c.addCndtnClnclStsCdgCd("NULL");
		}

		if(conditionclinicalstatuscodingi == conditionclinicalstatuscodinglist.size()-1) {c.addCndtnClnclStsCdgCd("]");}


		/******************** Cndtn_ClnclSts_Cdg_UsrSltd ********************************************************************************/
		if(conditionclinicalstatuscodingi == 0) {c.addCndtnClnclStsCdgUsrSltd("[");}
		if(conditionclinicalstatuscoding.hasUserSelected()) {

			c.addCndtnClnclStsCdgUsrSltd(String.valueOf(conditionclinicalstatuscoding.getUserSelected()));
		} else {
			c.addCndtnClnclStsCdgUsrSltd("NULL");
		}

		if(conditionclinicalstatuscodingi == conditionclinicalstatuscodinglist.size()-1) {c.addCndtnClnclStsCdgUsrSltd("]");}


		/******************** Cndtn_ClnclSts_Cdg_Sys ********************************************************************************/
		if(conditionclinicalstatuscodingi == 0) {c.addCndtnClnclStsCdgSys("[");}
		if(conditionclinicalstatuscoding.hasSystem()) {

			c.addCndtnClnclStsCdgSys(String.valueOf(conditionclinicalstatuscoding.getSystem()));
		} else {
			c.addCndtnClnclStsCdgSys("NULL");
		}

		if(conditionclinicalstatuscodingi == conditionclinicalstatuscodinglist.size()-1) {c.addCndtnClnclStsCdgSys("]");}


		 };
		/******************** conditioncategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> conditioncategorylist = condition.getCategory();
		for(int conditioncategoryi = 0; conditioncategoryi<conditioncategorylist.size();conditioncategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  conditioncategory = conditioncategorylist.get(conditioncategoryi);

		/******************** Cndtn_Ctgry_Txt ********************************************************************************/
		if(conditioncategoryi == 0) {c.addCndtnCtgryTxt("[");}
		if(conditioncategory.hasText()) {

			c.addCndtnCtgryTxt(String.valueOf(conditioncategory.getText()));
		} else {
			c.addCndtnCtgryTxt("NULL");
		}

		if(conditioncategoryi == conditioncategorylist.size()-1) {c.addCndtnCtgryTxt("]");}


		/******************** conditioncategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditioncategorycodinglist = conditioncategory.getCoding();
		for(int conditioncategorycodingi = 0; conditioncategorycodingi<conditioncategorycodinglist.size();conditioncategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditioncategorycoding = conditioncategorycodinglist.get(conditioncategorycodingi);

		/******************** Cndtn_Ctgry_Cdg_Dsply ********************************************************************************/
		if(conditioncategorycodingi == 0) {c.addCndtnCtgryCdgDsply("[[");}
		if(conditioncategorycoding.hasDisplay()) {

			c.addCndtnCtgryCdgDsply(String.valueOf(conditioncategorycoding.getDisplay()));
		} else {
			c.addCndtnCtgryCdgDsply("NULL");
		}

		if(conditioncategorycodingi == conditioncategorycodinglist.size()-1) {c.addCndtnCtgryCdgDsply("]]");}


		/******************** Cndtn_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(conditioncategorycodingi == 0) {c.addCndtnCtgryCdgVrsn("[[");}
		if(conditioncategorycoding.hasVersion()) {

			c.addCndtnCtgryCdgVrsn(String.valueOf(conditioncategorycoding.getVersion()));
		} else {
			c.addCndtnCtgryCdgVrsn("NULL");
		}

		if(conditioncategorycodingi == conditioncategorycodinglist.size()-1) {c.addCndtnCtgryCdgVrsn("]]");}


		/******************** Cndtn_Ctgry_Cdg_Cd ********************************************************************************/
		if(conditioncategorycodingi == 0) {c.addCndtnCtgryCdgCd("[[");}
		if(conditioncategorycoding.hasCode()) {

			c.addCndtnCtgryCdgCd(String.valueOf(conditioncategorycoding.getCode()));
		} else {
			c.addCndtnCtgryCdgCd("NULL");
		}

		if(conditioncategorycodingi == conditioncategorycodinglist.size()-1) {c.addCndtnCtgryCdgCd("]]");}


		/******************** Cndtn_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(conditioncategorycodingi == 0) {c.addCndtnCtgryCdgUsrSltd("[[");}
		if(conditioncategorycoding.hasUserSelected()) {

			c.addCndtnCtgryCdgUsrSltd(String.valueOf(conditioncategorycoding.getUserSelected()));
		} else {
			c.addCndtnCtgryCdgUsrSltd("NULL");
		}

		if(conditioncategorycodingi == conditioncategorycodinglist.size()-1) {c.addCndtnCtgryCdgUsrSltd("]]");}


		/******************** Cndtn_Ctgry_Cdg_Sys ********************************************************************************/
		if(conditioncategorycodingi == 0) {c.addCndtnCtgryCdgSys("[[");}
		if(conditioncategorycoding.hasSystem()) {

			c.addCndtnCtgryCdgSys(String.valueOf(conditioncategorycoding.getSystem()));
		} else {
			c.addCndtnCtgryCdgSys("NULL");
		}

		if(conditioncategorycodingi == conditioncategorycodinglist.size()-1) {c.addCndtnCtgryCdgSys("]]");}


		 };
		 };
		/******************** Cndtn_OnStrgTyp ********************************************************************************/
		if(condition.hasOnsetStringType()) {

			c.addCndtnOnStrgTyp("\""+condition.getOnsetStringType().getValueAsString()+"\"");
		} else {
			c.addCndtnOnStrgTyp("NULL");
		}


		/******************** conditionseverity ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionseverity = condition.getSeverity();

		/******************** Cndtn_Severity_Txt ********************************************************************************/
		if(conditionseverity.hasText()) {

			c.addCndtnSeverityTxt(String.valueOf(conditionseverity.getText()));
		} else {
			c.addCndtnSeverityTxt("NULL");
		}


		/******************** conditionseveritycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditionseveritycodinglist = conditionseverity.getCoding();
		for(int conditionseveritycodingi = 0; conditionseveritycodingi<conditionseveritycodinglist.size();conditionseveritycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditionseveritycoding = conditionseveritycodinglist.get(conditionseveritycodingi);

		/******************** Cndtn_Severity_Cdg_Dsply ********************************************************************************/
		if(conditionseveritycodingi == 0) {c.addCndtnSeverityCdgDsply("[");}
		if(conditionseveritycoding.hasDisplay()) {

			c.addCndtnSeverityCdgDsply(String.valueOf(conditionseveritycoding.getDisplay()));
		} else {
			c.addCndtnSeverityCdgDsply("NULL");
		}

		if(conditionseveritycodingi == conditionseveritycodinglist.size()-1) {c.addCndtnSeverityCdgDsply("]");}


		/******************** Cndtn_Severity_Cdg_Vrsn ********************************************************************************/
		if(conditionseveritycodingi == 0) {c.addCndtnSeverityCdgVrsn("[");}
		if(conditionseveritycoding.hasVersion()) {

			c.addCndtnSeverityCdgVrsn(String.valueOf(conditionseveritycoding.getVersion()));
		} else {
			c.addCndtnSeverityCdgVrsn("NULL");
		}

		if(conditionseveritycodingi == conditionseveritycodinglist.size()-1) {c.addCndtnSeverityCdgVrsn("]");}


		/******************** Cndtn_Severity_Cdg_Cd ********************************************************************************/
		if(conditionseveritycodingi == 0) {c.addCndtnSeverityCdgCd("[");}
		if(conditionseveritycoding.hasCode()) {

			c.addCndtnSeverityCdgCd(String.valueOf(conditionseveritycoding.getCode()));
		} else {
			c.addCndtnSeverityCdgCd("NULL");
		}

		if(conditionseveritycodingi == conditionseveritycodinglist.size()-1) {c.addCndtnSeverityCdgCd("]");}


		/******************** Cndtn_Severity_Cdg_UsrSltd ********************************************************************************/
		if(conditionseveritycodingi == 0) {c.addCndtnSeverityCdgUsrSltd("[");}
		if(conditionseveritycoding.hasUserSelected()) {

			c.addCndtnSeverityCdgUsrSltd(String.valueOf(conditionseveritycoding.getUserSelected()));
		} else {
			c.addCndtnSeverityCdgUsrSltd("NULL");
		}

		if(conditionseveritycodingi == conditionseveritycodinglist.size()-1) {c.addCndtnSeverityCdgUsrSltd("]");}


		/******************** Cndtn_Severity_Cdg_Sys ********************************************************************************/
		if(conditionseveritycodingi == 0) {c.addCndtnSeverityCdgSys("[");}
		if(conditionseveritycoding.hasSystem()) {

			c.addCndtnSeverityCdgSys(String.valueOf(conditionseveritycoding.getSystem()));
		} else {
			c.addCndtnSeverityCdgSys("NULL");
		}

		if(conditionseveritycodingi == conditionseveritycodinglist.size()-1) {c.addCndtnSeverityCdgSys("]");}


		 };
		/******************** conditiononrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range conditiononrange = condition.getOnsetRange();

		/******************** conditiononrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditiononrangelow = conditiononrange.getLow();

		/******************** Cndtn_OnRng_Lw_Vl ********************************************************************************/
		if(conditiononrangelow.hasValue()) {

			c.addCndtnOnRngLwVl(String.valueOf(conditiononrangelow.getValue()));
		} else {
			c.addCndtnOnRngLwVl("NULL");
		}


		/******************** conditiononrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditiononrangelowcomparator = conditiononrangelow.getComparator();
		if(conditiononrangelowcomparator!=null) {
			c.addCndtnOnRngLwCmprtr(conditiononrangelowcomparator.toCode());
		} else {
			c.addCndtnOnRngLwCmprtr("NULL");
		}

		/******************** Cndtn_OnRng_Lw_Cd ********************************************************************************/
		if(conditiononrangelow.hasCode()) {

			c.addCndtnOnRngLwCd(String.valueOf(conditiononrangelow.getCode()));
		} else {
			c.addCndtnOnRngLwCd("NULL");
		}


		/******************** Cndtn_OnRng_Lw_Unt ********************************************************************************/
		if(conditiononrangelow.hasUnit()) {

			c.addCndtnOnRngLwUnt(String.valueOf(conditiononrangelow.getUnit()));
		} else {
			c.addCndtnOnRngLwUnt("NULL");
		}


		/******************** Cndtn_OnRng_Lw_Sys ********************************************************************************/
		if(conditiononrangelow.hasSystem()) {

			c.addCndtnOnRngLwSys(String.valueOf(conditiononrangelow.getSystem()));
		} else {
			c.addCndtnOnRngLwSys("NULL");
		}


		/******************** conditiononrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditiononrangehigh = conditiononrange.getHigh();

		/******************** Cndtn_OnRng_Hi_Vl ********************************************************************************/
		if(conditiononrangehigh.hasValue()) {

			c.addCndtnOnRngHiVl(String.valueOf(conditiononrangehigh.getValue()));
		} else {
			c.addCndtnOnRngHiVl("NULL");
		}


		/******************** conditiononrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditiononrangehighcomparator = conditiononrangehigh.getComparator();
		if(conditiononrangehighcomparator!=null) {
			c.addCndtnOnRngHiCmprtr(conditiononrangehighcomparator.toCode());
		} else {
			c.addCndtnOnRngHiCmprtr("NULL");
		}

		/******************** Cndtn_OnRng_Hi_Cd ********************************************************************************/
		if(conditiononrangehigh.hasCode()) {

			c.addCndtnOnRngHiCd(String.valueOf(conditiononrangehigh.getCode()));
		} else {
			c.addCndtnOnRngHiCd("NULL");
		}


		/******************** Cndtn_OnRng_Hi_Unt ********************************************************************************/
		if(conditiononrangehigh.hasUnit()) {

			c.addCndtnOnRngHiUnt(String.valueOf(conditiononrangehigh.getUnit()));
		} else {
			c.addCndtnOnRngHiUnt("NULL");
		}


		/******************** Cndtn_OnRng_Hi_Sys ********************************************************************************/
		if(conditiononrangehigh.hasSystem()) {

			c.addCndtnOnRngHiSys(String.valueOf(conditiononrangehigh.getSystem()));
		} else {
			c.addCndtnOnRngHiSys("NULL");
		}


		/******************** conditionabatementperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conditionabatementperiod = condition.getAbatementPeriod();

		/******************** Cndtn_AbatementPrd_Strt ********************************************************************************/
		if(conditionabatementperiod.hasStart()) {

			c.addCndtnAbatementPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(conditionabatementperiod.getStart())+"\"");
		} else {
			c.addCndtnAbatementPrdStrt("NULL");
		}


		/******************** Cndtn_AbatementPrd_End ********************************************************************************/
		if(conditionabatementperiod.hasEnd()) {

			c.addCndtnAbatementPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(conditionabatementperiod.getEnd())+"\"");
		} else {
			c.addCndtnAbatementPrdEnd("NULL");
		}


		/******************** conditiononage ********************************************************************************/
		org.hl7.fhir.r4.model.Age conditiononage = condition.getOnsetAge();

		/******************** Cndtn_OnAge_Vl ********************************************************************************/
		if(conditiononage.hasValue()) {

			c.addCndtnOnAgeVl(String.valueOf(conditiononage.getValue()));
		} else {
			c.addCndtnOnAgeVl("NULL");
		}


		/******************** conditiononagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditiononagecomparator = conditiononage.getComparator();
		if(conditiononagecomparator!=null) {
			c.addCndtnOnAgeCmprtr(conditiononagecomparator.toCode());
		} else {
			c.addCndtnOnAgeCmprtr("NULL");
		}

		/******************** Cndtn_OnAge_Cd ********************************************************************************/
		if(conditiononage.hasCode()) {

			c.addCndtnOnAgeCd(String.valueOf(conditiononage.getCode()));
		} else {
			c.addCndtnOnAgeCd("NULL");
		}


		/******************** Cndtn_OnAge_Unt ********************************************************************************/
		if(conditiononage.hasUnit()) {

			c.addCndtnOnAgeUnt(String.valueOf(conditiononage.getUnit()));
		} else {
			c.addCndtnOnAgeUnt("NULL");
		}


		/******************** Cndtn_OnAge_Sys ********************************************************************************/
		if(conditiononage.hasSystem()) {

			c.addCndtnOnAgeSys(String.valueOf(conditiononage.getSystem()));
		} else {
			c.addCndtnOnAgeSys("NULL");
		}


		/******************** conditionbodysite ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> conditionbodysitelist = condition.getBodySite();
		for(int conditionbodysitei = 0; conditionbodysitei<conditionbodysitelist.size();conditionbodysitei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  conditionbodysite = conditionbodysitelist.get(conditionbodysitei);

		/******************** Cndtn_BodySite_Txt ********************************************************************************/
		if(conditionbodysitei == 0) {c.addCndtnBodySiteTxt("[");}
		if(conditionbodysite.hasText()) {

			c.addCndtnBodySiteTxt(String.valueOf(conditionbodysite.getText()));
		} else {
			c.addCndtnBodySiteTxt("NULL");
		}

		if(conditionbodysitei == conditionbodysitelist.size()-1) {c.addCndtnBodySiteTxt("]");}


		/******************** conditionbodysitecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditionbodysitecodinglist = conditionbodysite.getCoding();
		for(int conditionbodysitecodingi = 0; conditionbodysitecodingi<conditionbodysitecodinglist.size();conditionbodysitecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditionbodysitecoding = conditionbodysitecodinglist.get(conditionbodysitecodingi);

		/******************** Cndtn_BodySite_Cdg_Dsply ********************************************************************************/
		if(conditionbodysitecodingi == 0) {c.addCndtnBodySiteCdgDsply("[[");}
		if(conditionbodysitecoding.hasDisplay()) {

			c.addCndtnBodySiteCdgDsply(String.valueOf(conditionbodysitecoding.getDisplay()));
		} else {
			c.addCndtnBodySiteCdgDsply("NULL");
		}

		if(conditionbodysitecodingi == conditionbodysitecodinglist.size()-1) {c.addCndtnBodySiteCdgDsply("]]");}


		/******************** Cndtn_BodySite_Cdg_Vrsn ********************************************************************************/
		if(conditionbodysitecodingi == 0) {c.addCndtnBodySiteCdgVrsn("[[");}
		if(conditionbodysitecoding.hasVersion()) {

			c.addCndtnBodySiteCdgVrsn(String.valueOf(conditionbodysitecoding.getVersion()));
		} else {
			c.addCndtnBodySiteCdgVrsn("NULL");
		}

		if(conditionbodysitecodingi == conditionbodysitecodinglist.size()-1) {c.addCndtnBodySiteCdgVrsn("]]");}


		/******************** Cndtn_BodySite_Cdg_Cd ********************************************************************************/
		if(conditionbodysitecodingi == 0) {c.addCndtnBodySiteCdgCd("[[");}
		if(conditionbodysitecoding.hasCode()) {

			c.addCndtnBodySiteCdgCd(String.valueOf(conditionbodysitecoding.getCode()));
		} else {
			c.addCndtnBodySiteCdgCd("NULL");
		}

		if(conditionbodysitecodingi == conditionbodysitecodinglist.size()-1) {c.addCndtnBodySiteCdgCd("]]");}


		/******************** Cndtn_BodySite_Cdg_UsrSltd ********************************************************************************/
		if(conditionbodysitecodingi == 0) {c.addCndtnBodySiteCdgUsrSltd("[[");}
		if(conditionbodysitecoding.hasUserSelected()) {

			c.addCndtnBodySiteCdgUsrSltd(String.valueOf(conditionbodysitecoding.getUserSelected()));
		} else {
			c.addCndtnBodySiteCdgUsrSltd("NULL");
		}

		if(conditionbodysitecodingi == conditionbodysitecodinglist.size()-1) {c.addCndtnBodySiteCdgUsrSltd("]]");}


		/******************** Cndtn_BodySite_Cdg_Sys ********************************************************************************/
		if(conditionbodysitecodingi == 0) {c.addCndtnBodySiteCdgSys("[[");}
		if(conditionbodysitecoding.hasSystem()) {

			c.addCndtnBodySiteCdgSys(String.valueOf(conditionbodysitecoding.getSystem()));
		} else {
			c.addCndtnBodySiteCdgSys("NULL");
		}

		if(conditionbodysitecodingi == conditionbodysitecodinglist.size()-1) {c.addCndtnBodySiteCdgSys("]]");}


		 };
		 };
		/******************** conditiononperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period conditiononperiod = condition.getOnsetPeriod();

		/******************** Cndtn_OnPrd_Strt ********************************************************************************/
		if(conditiononperiod.hasStart()) {

			c.addCndtnOnPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(conditiononperiod.getStart())+"\"");
		} else {
			c.addCndtnOnPrdStrt("NULL");
		}


		/******************** Cndtn_OnPrd_End ********************************************************************************/
		if(conditiononperiod.hasEnd()) {

			c.addCndtnOnPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(conditiononperiod.getEnd())+"\"");
		} else {
			c.addCndtnOnPrdEnd("NULL");
		}


		/******************** conditionabatementage ********************************************************************************/
		org.hl7.fhir.r4.model.Age conditionabatementage = condition.getAbatementAge();

		/******************** Cndtn_AbatementAge_Vl ********************************************************************************/
		if(conditionabatementage.hasValue()) {

			c.addCndtnAbatementAgeVl(String.valueOf(conditionabatementage.getValue()));
		} else {
			c.addCndtnAbatementAgeVl("NULL");
		}


		/******************** conditionabatementagecomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditionabatementagecomparator = conditionabatementage.getComparator();
		if(conditionabatementagecomparator!=null) {
			c.addCndtnAbatementAgeCmprtr(conditionabatementagecomparator.toCode());
		} else {
			c.addCndtnAbatementAgeCmprtr("NULL");
		}

		/******************** Cndtn_AbatementAge_Cd ********************************************************************************/
		if(conditionabatementage.hasCode()) {

			c.addCndtnAbatementAgeCd(String.valueOf(conditionabatementage.getCode()));
		} else {
			c.addCndtnAbatementAgeCd("NULL");
		}


		/******************** Cndtn_AbatementAge_Unt ********************************************************************************/
		if(conditionabatementage.hasUnit()) {

			c.addCndtnAbatementAgeUnt(String.valueOf(conditionabatementage.getUnit()));
		} else {
			c.addCndtnAbatementAgeUnt("NULL");
		}


		/******************** Cndtn_AbatementAge_Sys ********************************************************************************/
		if(conditionabatementage.hasSystem()) {

			c.addCndtnAbatementAgeSys(String.valueOf(conditionabatementage.getSystem()));
		} else {
			c.addCndtnAbatementAgeSys("NULL");
		}


		/******************** conditionstage ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Condition.ConditionStageComponent> conditionstagelist = condition.getStage();
		for(int conditionstagei = 0; conditionstagei<conditionstagelist.size();conditionstagei++ ) {
		org.hl7.fhir.r4.model.Condition.ConditionStageComponent  conditionstage = conditionstagelist.get(conditionstagei);

		/******************** conditionstagetype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionstagetype = conditionstage.getType();

		/******************** Cndtn_Stage_Typ_Txt ********************************************************************************/
		if(conditionstagei == 0) {c.addCndtnStageTypTxt("[");}
		if(conditionstagetype.hasText()) {

			c.addCndtnStageTypTxt(String.valueOf(conditionstagetype.getText()));
		} else {
			c.addCndtnStageTypTxt("NULL");
		}

		if(conditionstagei == conditionstagelist.size()-1) {c.addCndtnStageTypTxt("]");}


		/******************** conditionstagetypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditionstagetypecodinglist = conditionstagetype.getCoding();
		for(int conditionstagetypecodingi = 0; conditionstagetypecodingi<conditionstagetypecodinglist.size();conditionstagetypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditionstagetypecoding = conditionstagetypecodinglist.get(conditionstagetypecodingi);

		/******************** Cndtn_Stage_Typ_Cdg_Dsply ********************************************************************************/
		if(conditionstagetypecodingi == 0) {c.addCndtnStageTypCdgDsply("[[");}
		if(conditionstagetypecoding.hasDisplay()) {

			c.addCndtnStageTypCdgDsply(String.valueOf(conditionstagetypecoding.getDisplay()));
		} else {
			c.addCndtnStageTypCdgDsply("NULL");
		}

		if(conditionstagetypecodingi == conditionstagetypecodinglist.size()-1) {c.addCndtnStageTypCdgDsply("]]");}


		/******************** Cndtn_Stage_Typ_Cdg_Vrsn ********************************************************************************/
		if(conditionstagetypecodingi == 0) {c.addCndtnStageTypCdgVrsn("[[");}
		if(conditionstagetypecoding.hasVersion()) {

			c.addCndtnStageTypCdgVrsn(String.valueOf(conditionstagetypecoding.getVersion()));
		} else {
			c.addCndtnStageTypCdgVrsn("NULL");
		}

		if(conditionstagetypecodingi == conditionstagetypecodinglist.size()-1) {c.addCndtnStageTypCdgVrsn("]]");}


		/******************** Cndtn_Stage_Typ_Cdg_Cd ********************************************************************************/
		if(conditionstagetypecodingi == 0) {c.addCndtnStageTypCdgCd("[[");}
		if(conditionstagetypecoding.hasCode()) {

			c.addCndtnStageTypCdgCd(String.valueOf(conditionstagetypecoding.getCode()));
		} else {
			c.addCndtnStageTypCdgCd("NULL");
		}

		if(conditionstagetypecodingi == conditionstagetypecodinglist.size()-1) {c.addCndtnStageTypCdgCd("]]");}


		/******************** Cndtn_Stage_Typ_Cdg_UsrSltd ********************************************************************************/
		if(conditionstagetypecodingi == 0) {c.addCndtnStageTypCdgUsrSltd("[[");}
		if(conditionstagetypecoding.hasUserSelected()) {

			c.addCndtnStageTypCdgUsrSltd(String.valueOf(conditionstagetypecoding.getUserSelected()));
		} else {
			c.addCndtnStageTypCdgUsrSltd("NULL");
		}

		if(conditionstagetypecodingi == conditionstagetypecodinglist.size()-1) {c.addCndtnStageTypCdgUsrSltd("]]");}


		/******************** Cndtn_Stage_Typ_Cdg_Sys ********************************************************************************/
		if(conditionstagetypecodingi == 0) {c.addCndtnStageTypCdgSys("[[");}
		if(conditionstagetypecoding.hasSystem()) {

			c.addCndtnStageTypCdgSys(String.valueOf(conditionstagetypecoding.getSystem()));
		} else {
			c.addCndtnStageTypCdgSys("NULL");
		}

		if(conditionstagetypecodingi == conditionstagetypecodinglist.size()-1) {c.addCndtnStageTypCdgSys("]]");}


		 };
		/******************** Cndtn_Stage_Assmnt ********************************************************************************/
		if(conditionstagei == 0) {c.addCndtnStageAssmnt("[");}
		if(conditionstage.hasAssessment()) {

			String  array = "[";
			for(int incr=0; incr<conditionstage.getAssessment().size(); incr++) {
				array = array + conditionstage.getAssessment().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCndtnStageAssmnt(array);

		} else {
			c.addCndtnStageAssmnt("NULL");
		}

		if(conditionstagei == conditionstagelist.size()-1) {c.addCndtnStageAssmnt("]");}


		/******************** conditionstagesummary ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionstagesummary = conditionstage.getSummary();

		/******************** Cndtn_Stage_Summary_Txt ********************************************************************************/
		if(conditionstagei == 0) {c.addCndtnStageSummaryTxt("[");}
		if(conditionstagesummary.hasText()) {

			c.addCndtnStageSummaryTxt(String.valueOf(conditionstagesummary.getText()));
		} else {
			c.addCndtnStageSummaryTxt("NULL");
		}

		if(conditionstagei == conditionstagelist.size()-1) {c.addCndtnStageSummaryTxt("]");}


		/******************** conditionstagesummarycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditionstagesummarycodinglist = conditionstagesummary.getCoding();
		for(int conditionstagesummarycodingi = 0; conditionstagesummarycodingi<conditionstagesummarycodinglist.size();conditionstagesummarycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditionstagesummarycoding = conditionstagesummarycodinglist.get(conditionstagesummarycodingi);

		/******************** Cndtn_Stage_Summary_Cdg_Dsply ********************************************************************************/
		if(conditionstagesummarycodingi == 0) {c.addCndtnStageSummaryCdgDsply("[[");}
		if(conditionstagesummarycoding.hasDisplay()) {

			c.addCndtnStageSummaryCdgDsply(String.valueOf(conditionstagesummarycoding.getDisplay()));
		} else {
			c.addCndtnStageSummaryCdgDsply("NULL");
		}

		if(conditionstagesummarycodingi == conditionstagesummarycodinglist.size()-1) {c.addCndtnStageSummaryCdgDsply("]]");}


		/******************** Cndtn_Stage_Summary_Cdg_Vrsn ********************************************************************************/
		if(conditionstagesummarycodingi == 0) {c.addCndtnStageSummaryCdgVrsn("[[");}
		if(conditionstagesummarycoding.hasVersion()) {

			c.addCndtnStageSummaryCdgVrsn(String.valueOf(conditionstagesummarycoding.getVersion()));
		} else {
			c.addCndtnStageSummaryCdgVrsn("NULL");
		}

		if(conditionstagesummarycodingi == conditionstagesummarycodinglist.size()-1) {c.addCndtnStageSummaryCdgVrsn("]]");}


		/******************** Cndtn_Stage_Summary_Cdg_Cd ********************************************************************************/
		if(conditionstagesummarycodingi == 0) {c.addCndtnStageSummaryCdgCd("[[");}
		if(conditionstagesummarycoding.hasCode()) {

			c.addCndtnStageSummaryCdgCd(String.valueOf(conditionstagesummarycoding.getCode()));
		} else {
			c.addCndtnStageSummaryCdgCd("NULL");
		}

		if(conditionstagesummarycodingi == conditionstagesummarycodinglist.size()-1) {c.addCndtnStageSummaryCdgCd("]]");}


		/******************** Cndtn_Stage_Summary_Cdg_UsrSltd ********************************************************************************/
		if(conditionstagesummarycodingi == 0) {c.addCndtnStageSummaryCdgUsrSltd("[[");}
		if(conditionstagesummarycoding.hasUserSelected()) {

			c.addCndtnStageSummaryCdgUsrSltd(String.valueOf(conditionstagesummarycoding.getUserSelected()));
		} else {
			c.addCndtnStageSummaryCdgUsrSltd("NULL");
		}

		if(conditionstagesummarycodingi == conditionstagesummarycodinglist.size()-1) {c.addCndtnStageSummaryCdgUsrSltd("]]");}


		/******************** Cndtn_Stage_Summary_Cdg_Sys ********************************************************************************/
		if(conditionstagesummarycodingi == 0) {c.addCndtnStageSummaryCdgSys("[[");}
		if(conditionstagesummarycoding.hasSystem()) {

			c.addCndtnStageSummaryCdgSys(String.valueOf(conditionstagesummarycoding.getSystem()));
		} else {
			c.addCndtnStageSummaryCdgSys("NULL");
		}

		if(conditionstagesummarycodingi == conditionstagesummarycodinglist.size()-1) {c.addCndtnStageSummaryCdgSys("]]");}


		 };
		 };
		/******************** conditionabatementrange ********************************************************************************/
		org.hl7.fhir.r4.model.Range conditionabatementrange = condition.getAbatementRange();

		/******************** conditionabatementrangelow ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditionabatementrangelow = conditionabatementrange.getLow();

		/******************** Cndtn_AbatementRng_Lw_Vl ********************************************************************************/
		if(conditionabatementrangelow.hasValue()) {

			c.addCndtnAbatementRngLwVl(String.valueOf(conditionabatementrangelow.getValue()));
		} else {
			c.addCndtnAbatementRngLwVl("NULL");
		}


		/******************** conditionabatementrangelowcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditionabatementrangelowcomparator = conditionabatementrangelow.getComparator();
		if(conditionabatementrangelowcomparator!=null) {
			c.addCndtnAbatementRngLwCmprtr(conditionabatementrangelowcomparator.toCode());
		} else {
			c.addCndtnAbatementRngLwCmprtr("NULL");
		}

		/******************** Cndtn_AbatementRng_Lw_Cd ********************************************************************************/
		if(conditionabatementrangelow.hasCode()) {

			c.addCndtnAbatementRngLwCd(String.valueOf(conditionabatementrangelow.getCode()));
		} else {
			c.addCndtnAbatementRngLwCd("NULL");
		}


		/******************** Cndtn_AbatementRng_Lw_Unt ********************************************************************************/
		if(conditionabatementrangelow.hasUnit()) {

			c.addCndtnAbatementRngLwUnt(String.valueOf(conditionabatementrangelow.getUnit()));
		} else {
			c.addCndtnAbatementRngLwUnt("NULL");
		}


		/******************** Cndtn_AbatementRng_Lw_Sys ********************************************************************************/
		if(conditionabatementrangelow.hasSystem()) {

			c.addCndtnAbatementRngLwSys(String.valueOf(conditionabatementrangelow.getSystem()));
		} else {
			c.addCndtnAbatementRngLwSys("NULL");
		}


		/******************** conditionabatementrangehigh ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity conditionabatementrangehigh = conditionabatementrange.getHigh();

		/******************** Cndtn_AbatementRng_Hi_Vl ********************************************************************************/
		if(conditionabatementrangehigh.hasValue()) {

			c.addCndtnAbatementRngHiVl(String.valueOf(conditionabatementrangehigh.getValue()));
		} else {
			c.addCndtnAbatementRngHiVl("NULL");
		}


		/******************** conditionabatementrangehighcomparator ********************************************************************************/
		org.hl7.fhir.r4.model.Quantity.QuantityComparator conditionabatementrangehighcomparator = conditionabatementrangehigh.getComparator();
		if(conditionabatementrangehighcomparator!=null) {
			c.addCndtnAbatementRngHiCmprtr(conditionabatementrangehighcomparator.toCode());
		} else {
			c.addCndtnAbatementRngHiCmprtr("NULL");
		}

		/******************** Cndtn_AbatementRng_Hi_Cd ********************************************************************************/
		if(conditionabatementrangehigh.hasCode()) {

			c.addCndtnAbatementRngHiCd(String.valueOf(conditionabatementrangehigh.getCode()));
		} else {
			c.addCndtnAbatementRngHiCd("NULL");
		}


		/******************** Cndtn_AbatementRng_Hi_Unt ********************************************************************************/
		if(conditionabatementrangehigh.hasUnit()) {

			c.addCndtnAbatementRngHiUnt(String.valueOf(conditionabatementrangehigh.getUnit()));
		} else {
			c.addCndtnAbatementRngHiUnt("NULL");
		}


		/******************** Cndtn_AbatementRng_Hi_Sys ********************************************************************************/
		if(conditionabatementrangehigh.hasSystem()) {

			c.addCndtnAbatementRngHiSys(String.valueOf(conditionabatementrangehigh.getSystem()));
		} else {
			c.addCndtnAbatementRngHiSys("NULL");
		}


		/******************** conditionevidence ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent> conditionevidencelist = condition.getEvidence();
		for(int conditionevidencei = 0; conditionevidencei<conditionevidencelist.size();conditionevidencei++ ) {
		org.hl7.fhir.r4.model.Condition.ConditionEvidenceComponent  conditionevidence = conditionevidencelist.get(conditionevidencei);

		/******************** conditionevidencecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> conditionevidencecodelist = conditionevidence.getCode();
		for(int conditionevidencecodei = 0; conditionevidencecodei<conditionevidencecodelist.size();conditionevidencecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  conditionevidencecode = conditionevidencecodelist.get(conditionevidencecodei);

		/******************** Cndtn_Evdnce_Cd_Txt ********************************************************************************/
		if(conditionevidencecodei == 0) {c.addCndtnEvdnceCdTxt("[[");}
		if(conditionevidencecode.hasText()) {

			c.addCndtnEvdnceCdTxt(String.valueOf(conditionevidencecode.getText()));
		} else {
			c.addCndtnEvdnceCdTxt("NULL");
		}

		if(conditionevidencecodei == conditionevidencecodelist.size()-1) {c.addCndtnEvdnceCdTxt("]]");}


		/******************** conditionevidencecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditionevidencecodecodinglist = conditionevidencecode.getCoding();
		for(int conditionevidencecodecodingi = 0; conditionevidencecodecodingi<conditionevidencecodecodinglist.size();conditionevidencecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditionevidencecodecoding = conditionevidencecodecodinglist.get(conditionevidencecodecodingi);

		/******************** Cndtn_Evdnce_Cd_Cdg_Dsply ********************************************************************************/
		if(conditionevidencecodecodingi == 0) {c.addCndtnEvdnceCdCdgDsply("[[[");}
		if(conditionevidencecodecoding.hasDisplay()) {

			c.addCndtnEvdnceCdCdgDsply(String.valueOf(conditionevidencecodecoding.getDisplay()));
		} else {
			c.addCndtnEvdnceCdCdgDsply("NULL");
		}

		if(conditionevidencecodecodingi == conditionevidencecodecodinglist.size()-1) {c.addCndtnEvdnceCdCdgDsply("]]]");}


		/******************** Cndtn_Evdnce_Cd_Cdg_Vrsn ********************************************************************************/
		if(conditionevidencecodecodingi == 0) {c.addCndtnEvdnceCdCdgVrsn("[[[");}
		if(conditionevidencecodecoding.hasVersion()) {

			c.addCndtnEvdnceCdCdgVrsn(String.valueOf(conditionevidencecodecoding.getVersion()));
		} else {
			c.addCndtnEvdnceCdCdgVrsn("NULL");
		}

		if(conditionevidencecodecodingi == conditionevidencecodecodinglist.size()-1) {c.addCndtnEvdnceCdCdgVrsn("]]]");}


		/******************** Cndtn_Evdnce_Cd_Cdg_Cd ********************************************************************************/
		if(conditionevidencecodecodingi == 0) {c.addCndtnEvdnceCdCdgCd("[[[");}
		if(conditionevidencecodecoding.hasCode()) {

			c.addCndtnEvdnceCdCdgCd(String.valueOf(conditionevidencecodecoding.getCode()));
		} else {
			c.addCndtnEvdnceCdCdgCd("NULL");
		}

		if(conditionevidencecodecodingi == conditionevidencecodecodinglist.size()-1) {c.addCndtnEvdnceCdCdgCd("]]]");}


		/******************** Cndtn_Evdnce_Cd_Cdg_UsrSltd ********************************************************************************/
		if(conditionevidencecodecodingi == 0) {c.addCndtnEvdnceCdCdgUsrSltd("[[[");}
		if(conditionevidencecodecoding.hasUserSelected()) {

			c.addCndtnEvdnceCdCdgUsrSltd(String.valueOf(conditionevidencecodecoding.getUserSelected()));
		} else {
			c.addCndtnEvdnceCdCdgUsrSltd("NULL");
		}

		if(conditionevidencecodecodingi == conditionevidencecodecodinglist.size()-1) {c.addCndtnEvdnceCdCdgUsrSltd("]]]");}


		/******************** Cndtn_Evdnce_Cd_Cdg_Sys ********************************************************************************/
		if(conditionevidencecodecodingi == 0) {c.addCndtnEvdnceCdCdgSys("[[[");}
		if(conditionevidencecodecoding.hasSystem()) {

			c.addCndtnEvdnceCdCdgSys(String.valueOf(conditionevidencecodecoding.getSystem()));
		} else {
			c.addCndtnEvdnceCdCdgSys("NULL");
		}

		if(conditionevidencecodecodingi == conditionevidencecodecodinglist.size()-1) {c.addCndtnEvdnceCdCdgSys("]]]");}


		 };
		 };
		/******************** Cndtn_Evdnce_Dtl ********************************************************************************/
		if(conditionevidence.hasDetail()) {

			String  array = "[";
			for(int incr=0; incr<conditionevidence.getDetail().size(); incr++) {
				array = array + conditionevidence.getDetail().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			c.addCndtnEvdnceDtl(array);

		} else {
			c.addCndtnEvdnceDtl("NULL");
		}


		 };
		/******************** Cndtn_Recorder ********************************************************************************/
		if(condition.hasRecorder()) {

			if(condition.getRecorder().getReference() != null) {
			c.addCndtnRecorder(condition.getRecorder().getReference());
			}
		} else {
			c.addCndtnRecorder("NULL");
		}


		/******************** Cndtn_Asserter ********************************************************************************/
		if(condition.hasAsserter()) {

			if(condition.getAsserter().getReference() != null) {
			c.addCndtnAsserter(condition.getAsserter().getReference());
			}
		} else {
			c.addCndtnAsserter("NULL");
		}


		/******************** Cndtn_RecordedDt ********************************************************************************/
		if(condition.hasRecordedDate()) {

			c.addCndtnRecordedDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(condition.getRecordedDate())+"\"");
		} else {
			c.addCndtnRecordedDt("NULL");
		}


		/******************** conditionverificationstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept conditionverificationstatus = condition.getVerificationStatus();

		/******************** Cndtn_VrfctnSts_Txt ********************************************************************************/
		if(conditionverificationstatus.hasText()) {

			c.addCndtnVrfctnStsTxt(String.valueOf(conditionverificationstatus.getText()));
		} else {
			c.addCndtnVrfctnStsTxt("NULL");
		}


		/******************** conditionverificationstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> conditionverificationstatuscodinglist = conditionverificationstatus.getCoding();
		for(int conditionverificationstatuscodingi = 0; conditionverificationstatuscodingi<conditionverificationstatuscodinglist.size();conditionverificationstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  conditionverificationstatuscoding = conditionverificationstatuscodinglist.get(conditionverificationstatuscodingi);

		/******************** Cndtn_VrfctnSts_Cdg_Dsply ********************************************************************************/
		if(conditionverificationstatuscodingi == 0) {c.addCndtnVrfctnStsCdgDsply("[");}
		if(conditionverificationstatuscoding.hasDisplay()) {

			c.addCndtnVrfctnStsCdgDsply(String.valueOf(conditionverificationstatuscoding.getDisplay()));
		} else {
			c.addCndtnVrfctnStsCdgDsply("NULL");
		}

		if(conditionverificationstatuscodingi == conditionverificationstatuscodinglist.size()-1) {c.addCndtnVrfctnStsCdgDsply("]");}


		/******************** Cndtn_VrfctnSts_Cdg_Vrsn ********************************************************************************/
		if(conditionverificationstatuscodingi == 0) {c.addCndtnVrfctnStsCdgVrsn("[");}
		if(conditionverificationstatuscoding.hasVersion()) {

			c.addCndtnVrfctnStsCdgVrsn(String.valueOf(conditionverificationstatuscoding.getVersion()));
		} else {
			c.addCndtnVrfctnStsCdgVrsn("NULL");
		}

		if(conditionverificationstatuscodingi == conditionverificationstatuscodinglist.size()-1) {c.addCndtnVrfctnStsCdgVrsn("]");}


		/******************** Cndtn_VrfctnSts_Cdg_Cd ********************************************************************************/
		if(conditionverificationstatuscodingi == 0) {c.addCndtnVrfctnStsCdgCd("[");}
		if(conditionverificationstatuscoding.hasCode()) {

			c.addCndtnVrfctnStsCdgCd(String.valueOf(conditionverificationstatuscoding.getCode()));
		} else {
			c.addCndtnVrfctnStsCdgCd("NULL");
		}

		if(conditionverificationstatuscodingi == conditionverificationstatuscodinglist.size()-1) {c.addCndtnVrfctnStsCdgCd("]");}


		/******************** Cndtn_VrfctnSts_Cdg_UsrSltd ********************************************************************************/
		if(conditionverificationstatuscodingi == 0) {c.addCndtnVrfctnStsCdgUsrSltd("[");}
		if(conditionverificationstatuscoding.hasUserSelected()) {

			c.addCndtnVrfctnStsCdgUsrSltd(String.valueOf(conditionverificationstatuscoding.getUserSelected()));
		} else {
			c.addCndtnVrfctnStsCdgUsrSltd("NULL");
		}

		if(conditionverificationstatuscodingi == conditionverificationstatuscodinglist.size()-1) {c.addCndtnVrfctnStsCdgUsrSltd("]");}


		/******************** Cndtn_VrfctnSts_Cdg_Sys ********************************************************************************/
		if(conditionverificationstatuscodingi == 0) {c.addCndtnVrfctnStsCdgSys("[");}
		if(conditionverificationstatuscoding.hasSystem()) {

			c.addCndtnVrfctnStsCdgSys(String.valueOf(conditionverificationstatuscoding.getSystem()));
		} else {
			c.addCndtnVrfctnStsCdgSys("NULL");
		}

		if(conditionverificationstatuscodingi == conditionverificationstatuscodinglist.size()-1) {c.addCndtnVrfctnStsCdgSys("]");}


		 };
		/******************** Cndtn_OnDtTimeTyp ********************************************************************************/
		if(condition.hasOnsetDateTimeType()) {

			c.addCndtnOnDtTimeTyp("\""+condition.getOnsetDateTimeType().getValueAsString()+"\"");
		} else {
			c.addCndtnOnDtTimeTyp("NULL");
		}


		/******************** Cndtn_AbatementDtTimeTyp ********************************************************************************/
		if(condition.hasAbatementDateTimeType()) {

			c.addCndtnAbatementDtTimeTyp("\""+condition.getAbatementDateTimeType().getValueAsString()+"\"");
		} else {
			c.addCndtnAbatementDtTimeTyp("NULL");
		}


		/******************** Cndtn_AbatementStrgTyp ********************************************************************************/
		if(condition.hasAbatementStringType()) {

			c.addCndtnAbatementStrgTyp("\""+condition.getAbatementStringType().getValueAsString()+"\"");
		} else {
			c.addCndtnAbatementStrgTyp("NULL");
		}


		return c;
	}
}
