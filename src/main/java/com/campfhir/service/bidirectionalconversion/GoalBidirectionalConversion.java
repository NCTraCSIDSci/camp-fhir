package main.java.com.campfhir.service.bidirectionalconversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Goal;
public class GoalBidirectionalConversion 
{
	public Goal Goals(org.hl7.fhir.r4.model.Goal goal) throws ParseException
	{
		 main.java.com.campfhir.model.Goal g = new  main.java.com.campfhir.model.Goal();

		/******************** id ********************************************************************************/
		g.setId(goal.getIdElement().getIdPart());

		/******************** goalpriority ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalpriority = goal.getPriority();

		/******************** Goal_Priority_Txt ********************************************************************************/
		if(goalpriority.hasText()) {

			g.addGoalPriorityTxt(String.valueOf(goalpriority.getText()));
		} else {
			g.addGoalPriorityTxt("NULL");
		}


		/******************** goalprioritycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> goalprioritycodinglist = goalpriority.getCoding();
		for(int goalprioritycodingi = 0; goalprioritycodingi<goalprioritycodinglist.size();goalprioritycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  goalprioritycoding = goalprioritycodinglist.get(goalprioritycodingi);

		/******************** Goal_Priority_Cdg_Dsply ********************************************************************************/
		if(goalprioritycodingi == 0) {g.addGoalPriorityCdgDsply("[");}
		if(goalprioritycoding.hasDisplay()) {

			g.addGoalPriorityCdgDsply(String.valueOf(goalprioritycoding.getDisplay()));
		} else {
			g.addGoalPriorityCdgDsply("NULL");
		}

		if(goalprioritycodingi == goalprioritycodinglist.size()-1) {g.addGoalPriorityCdgDsply("]");}


		/******************** Goal_Priority_Cdg_Vrsn ********************************************************************************/
		if(goalprioritycodingi == 0) {g.addGoalPriorityCdgVrsn("[");}
		if(goalprioritycoding.hasVersion()) {

			g.addGoalPriorityCdgVrsn(String.valueOf(goalprioritycoding.getVersion()));
		} else {
			g.addGoalPriorityCdgVrsn("NULL");
		}

		if(goalprioritycodingi == goalprioritycodinglist.size()-1) {g.addGoalPriorityCdgVrsn("]");}


		/******************** Goal_Priority_Cdg_Cd ********************************************************************************/
		if(goalprioritycodingi == 0) {g.addGoalPriorityCdgCd("[");}
		if(goalprioritycoding.hasCode()) {

			g.addGoalPriorityCdgCd(String.valueOf(goalprioritycoding.getCode()));
		} else {
			g.addGoalPriorityCdgCd("NULL");
		}

		if(goalprioritycodingi == goalprioritycodinglist.size()-1) {g.addGoalPriorityCdgCd("]");}


		/******************** Goal_Priority_Cdg_UsrSltd ********************************************************************************/
		if(goalprioritycodingi == 0) {g.addGoalPriorityCdgUsrSltd("[");}
		if(goalprioritycoding.hasUserSelected()) {

			g.addGoalPriorityCdgUsrSltd(String.valueOf(goalprioritycoding.getUserSelected()));
		} else {
			g.addGoalPriorityCdgUsrSltd("NULL");
		}

		if(goalprioritycodingi == goalprioritycodinglist.size()-1) {g.addGoalPriorityCdgUsrSltd("]");}


		/******************** Goal_Priority_Cdg_Sys ********************************************************************************/
		if(goalprioritycodingi == 0) {g.addGoalPriorityCdgSys("[");}
		if(goalprioritycoding.hasSystem()) {

			g.addGoalPriorityCdgSys(String.valueOf(goalprioritycoding.getSystem()));
		} else {
			g.addGoalPriorityCdgSys("NULL");
		}

		if(goalprioritycodingi == goalprioritycodinglist.size()-1) {g.addGoalPriorityCdgSys("]");}


		 };
		/******************** Goal_Sbjct ********************************************************************************/
		if(goal.hasSubject()) {

			if(goal.getSubject().getReference() != null) {
			g.addGoalSbjct(goal.getSubject().getReference());
			}
		} else {
			g.addGoalSbjct("NULL");
		}


		/******************** goaldescription ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goaldescription = goal.getDescription();

		/******************** Goal_Dscrptn_Txt ********************************************************************************/
		if(goaldescription.hasText()) {

			g.addGoalDscrptnTxt(String.valueOf(goaldescription.getText()));
		} else {
			g.addGoalDscrptnTxt("NULL");
		}


		/******************** goaldescriptioncoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> goaldescriptioncodinglist = goaldescription.getCoding();
		for(int goaldescriptioncodingi = 0; goaldescriptioncodingi<goaldescriptioncodinglist.size();goaldescriptioncodingi++ ) {
		org.hl7.fhir.r4.model.Coding  goaldescriptioncoding = goaldescriptioncodinglist.get(goaldescriptioncodingi);

		/******************** Goal_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(goaldescriptioncodingi == 0) {g.addGoalDscrptnCdgDsply("[");}
		if(goaldescriptioncoding.hasDisplay()) {

			g.addGoalDscrptnCdgDsply(String.valueOf(goaldescriptioncoding.getDisplay()));
		} else {
			g.addGoalDscrptnCdgDsply("NULL");
		}

		if(goaldescriptioncodingi == goaldescriptioncodinglist.size()-1) {g.addGoalDscrptnCdgDsply("]");}


		/******************** Goal_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(goaldescriptioncodingi == 0) {g.addGoalDscrptnCdgVrsn("[");}
		if(goaldescriptioncoding.hasVersion()) {

			g.addGoalDscrptnCdgVrsn(String.valueOf(goaldescriptioncoding.getVersion()));
		} else {
			g.addGoalDscrptnCdgVrsn("NULL");
		}

		if(goaldescriptioncodingi == goaldescriptioncodinglist.size()-1) {g.addGoalDscrptnCdgVrsn("]");}


		/******************** Goal_Dscrptn_Cdg_Cd ********************************************************************************/
		if(goaldescriptioncodingi == 0) {g.addGoalDscrptnCdgCd("[");}
		if(goaldescriptioncoding.hasCode()) {

			g.addGoalDscrptnCdgCd(String.valueOf(goaldescriptioncoding.getCode()));
		} else {
			g.addGoalDscrptnCdgCd("NULL");
		}

		if(goaldescriptioncodingi == goaldescriptioncodinglist.size()-1) {g.addGoalDscrptnCdgCd("]");}


		/******************** Goal_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(goaldescriptioncodingi == 0) {g.addGoalDscrptnCdgUsrSltd("[");}
		if(goaldescriptioncoding.hasUserSelected()) {

			g.addGoalDscrptnCdgUsrSltd(String.valueOf(goaldescriptioncoding.getUserSelected()));
		} else {
			g.addGoalDscrptnCdgUsrSltd("NULL");
		}

		if(goaldescriptioncodingi == goaldescriptioncodinglist.size()-1) {g.addGoalDscrptnCdgUsrSltd("]");}


		/******************** Goal_Dscrptn_Cdg_Sys ********************************************************************************/
		if(goaldescriptioncodingi == 0) {g.addGoalDscrptnCdgSys("[");}
		if(goaldescriptioncoding.hasSystem()) {

			g.addGoalDscrptnCdgSys(String.valueOf(goaldescriptioncoding.getSystem()));
		} else {
			g.addGoalDscrptnCdgSys("NULL");
		}

		if(goaldescriptioncodingi == goaldescriptioncodinglist.size()-1) {g.addGoalDscrptnCdgSys("]");}


		 };
		/******************** goalnote ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Annotation> goalnotelist = goal.getNote();
		for(int goalnotei = 0; goalnotei<goalnotelist.size();goalnotei++ ) {
		org.hl7.fhir.r4.model.Annotation  goalnote = goalnotelist.get(goalnotei);

		/******************** Goal_Nt_Time ********************************************************************************/
		if(goalnotei == 0) {g.addGoalNtTime("[");}
		if(goalnote.hasTime()) {

			g.addGoalNtTime("\""+ca.uhn.fhir.util.DateUtils.formatDate(goalnote.getTime())+"\"");
		} else {
			g.addGoalNtTime("NULL");
		}

		if(goalnotei == goalnotelist.size()-1) {g.addGoalNtTime("]");}


		/******************** Goal_Nt_AthrRfrnc ********************************************************************************/
		if(goalnotei == 0) {g.addGoalNtAthrRfrnc("[");}
		if(goalnote.hasAuthorReference()) {

			if(goalnote.getAuthorReference().getReference() != null) {
			g.addGoalNtAthrRfrnc(goalnote.getAuthorReference().getReference());
			}
		} else {
			g.addGoalNtAthrRfrnc("NULL");
		}

		if(goalnotei == goalnotelist.size()-1) {g.addGoalNtAthrRfrnc("]");}


		/******************** Goal_Nt_Txt ********************************************************************************/
		if(goalnotei == 0) {g.addGoalNtTxt("[");}
		if(goalnote.hasText()) {

			g.addGoalNtTxt(String.valueOf(goalnote.getText()));
		} else {
			g.addGoalNtTxt("NULL");
		}

		if(goalnotei == goalnotelist.size()-1) {g.addGoalNtTxt("]");}


		/******************** Goal_Nt_AthrStrgTyp ********************************************************************************/
		if(goalnotei == 0) {g.addGoalNtAthrStrgTyp("[");}
		if(goalnote.hasAuthorStringType()) {

			g.addGoalNtAthrStrgTyp("\""+goalnote.getAuthorStringType().getValueAsString()+"\"");
		} else {
			g.addGoalNtAthrStrgTyp("NULL");
		}

		if(goalnotei == goalnotelist.size()-1) {g.addGoalNtAthrStrgTyp("]");}


		 };
		/******************** goalidentifier ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Identifier> goalidentifierlist = goal.getIdentifier();
		for(int goalidentifieri = 0; goalidentifieri<goalidentifierlist.size();goalidentifieri++ ) {
		org.hl7.fhir.r4.model.Identifier  goalidentifier = goalidentifierlist.get(goalidentifieri);

		/******************** Goal_Id_Vl ********************************************************************************/
		if(goalidentifieri == 0) {g.addGoalIdVl("[");}
		if(goalidentifier.hasValue()) {

			g.addGoalIdVl(String.valueOf(goalidentifier.getValue()));
		} else {
			g.addGoalIdVl("NULL");
		}

		if(goalidentifieri == goalidentifierlist.size()-1) {g.addGoalIdVl("]");}


		/******************** goalidentifiertype ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalidentifiertype = goalidentifier.getType();

		/******************** Goal_Id_Typ_Txt ********************************************************************************/
		if(goalidentifieri == 0) {g.addGoalIdTypTxt("[");}
		if(goalidentifiertype.hasText()) {

			g.addGoalIdTypTxt(String.valueOf(goalidentifiertype.getText()));
		} else {
			g.addGoalIdTypTxt("NULL");
		}

		if(goalidentifieri == goalidentifierlist.size()-1) {g.addGoalIdTypTxt("]");}


		/******************** goalidentifiertypecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> goalidentifiertypecodinglist = goalidentifiertype.getCoding();
		for(int goalidentifiertypecodingi = 0; goalidentifiertypecodingi<goalidentifiertypecodinglist.size();goalidentifiertypecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  goalidentifiertypecoding = goalidentifiertypecodinglist.get(goalidentifiertypecodingi);

		/******************** Goal_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(goalidentifiertypecodingi == 0) {g.addGoalIdTypCdgDsply("[[");}
		if(goalidentifiertypecoding.hasDisplay()) {

			g.addGoalIdTypCdgDsply(String.valueOf(goalidentifiertypecoding.getDisplay()));
		} else {
			g.addGoalIdTypCdgDsply("NULL");
		}

		if(goalidentifiertypecodingi == goalidentifiertypecodinglist.size()-1) {g.addGoalIdTypCdgDsply("]]");}


		/******************** Goal_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(goalidentifiertypecodingi == 0) {g.addGoalIdTypCdgVrsn("[[");}
		if(goalidentifiertypecoding.hasVersion()) {

			g.addGoalIdTypCdgVrsn(String.valueOf(goalidentifiertypecoding.getVersion()));
		} else {
			g.addGoalIdTypCdgVrsn("NULL");
		}

		if(goalidentifiertypecodingi == goalidentifiertypecodinglist.size()-1) {g.addGoalIdTypCdgVrsn("]]");}


		/******************** Goal_Id_Typ_Cdg_Cd ********************************************************************************/
		if(goalidentifiertypecodingi == 0) {g.addGoalIdTypCdgCd("[[");}
		if(goalidentifiertypecoding.hasCode()) {

			g.addGoalIdTypCdgCd(String.valueOf(goalidentifiertypecoding.getCode()));
		} else {
			g.addGoalIdTypCdgCd("NULL");
		}

		if(goalidentifiertypecodingi == goalidentifiertypecodinglist.size()-1) {g.addGoalIdTypCdgCd("]]");}


		/******************** Goal_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(goalidentifiertypecodingi == 0) {g.addGoalIdTypCdgUsrSltd("[[");}
		if(goalidentifiertypecoding.hasUserSelected()) {

			g.addGoalIdTypCdgUsrSltd(String.valueOf(goalidentifiertypecoding.getUserSelected()));
		} else {
			g.addGoalIdTypCdgUsrSltd("NULL");
		}

		if(goalidentifiertypecodingi == goalidentifiertypecodinglist.size()-1) {g.addGoalIdTypCdgUsrSltd("]]");}


		/******************** Goal_Id_Typ_Cdg_Sys ********************************************************************************/
		if(goalidentifiertypecodingi == 0) {g.addGoalIdTypCdgSys("[[");}
		if(goalidentifiertypecoding.hasSystem()) {

			g.addGoalIdTypCdgSys(String.valueOf(goalidentifiertypecoding.getSystem()));
		} else {
			g.addGoalIdTypCdgSys("NULL");
		}

		if(goalidentifiertypecodingi == goalidentifiertypecodinglist.size()-1) {g.addGoalIdTypCdgSys("]]");}


		 };
		/******************** goalidentifierperiod ********************************************************************************/
		org.hl7.fhir.r4.model.Period goalidentifierperiod = goalidentifier.getPeriod();

		/******************** Goal_Id_Prd_Strt ********************************************************************************/
		if(goalidentifieri == 0) {g.addGoalIdPrdStrt("[");}
		if(goalidentifierperiod.hasStart()) {

			g.addGoalIdPrdStrt("\""+ca.uhn.fhir.util.DateUtils.formatDate(goalidentifierperiod.getStart())+"\"");
		} else {
			g.addGoalIdPrdStrt("NULL");
		}

		if(goalidentifieri == goalidentifierlist.size()-1) {g.addGoalIdPrdStrt("]");}


		/******************** Goal_Id_Prd_End ********************************************************************************/
		if(goalidentifieri == 0) {g.addGoalIdPrdEnd("[");}
		if(goalidentifierperiod.hasEnd()) {

			g.addGoalIdPrdEnd("\""+ca.uhn.fhir.util.DateUtils.formatDate(goalidentifierperiod.getEnd())+"\"");
		} else {
			g.addGoalIdPrdEnd("NULL");
		}

		if(goalidentifieri == goalidentifierlist.size()-1) {g.addGoalIdPrdEnd("]");}


		/******************** goalidentifieruse ********************************************************************************/
		org.hl7.fhir.r4.model.Identifier.IdentifierUse goalidentifieruse = goalidentifier.getUse();
		if(goalidentifieruse!=null) {
		if(goalidentifieri == 0) {

		g.addGoalIdUse("[");		}
			g.addGoalIdUse(goalidentifieruse.toCode());
		if(goalidentifieri == goalidentifierlist.size()-1) {

		g.addGoalIdUse("]");		}

		} else {
			g.addGoalIdUse("NULL");
		}

		/******************** Goal_Id_Assigner ********************************************************************************/
		if(goalidentifieri == 0) {g.addGoalIdAssigner("[");}
		if(goalidentifier.hasAssigner()) {

			if(goalidentifier.getAssigner().getReference() != null) {
			g.addGoalIdAssigner(goalidentifier.getAssigner().getReference());
			}
		} else {
			g.addGoalIdAssigner("NULL");
		}

		if(goalidentifieri == goalidentifierlist.size()-1) {g.addGoalIdAssigner("]");}


		/******************** Goal_Id_Sys ********************************************************************************/
		if(goalidentifieri == 0) {g.addGoalIdSys("[");}
		if(goalidentifier.hasSystem()) {

			g.addGoalIdSys(String.valueOf(goalidentifier.getSystem()));
		} else {
			g.addGoalIdSys("NULL");
		}

		if(goalidentifieri == goalidentifierlist.size()-1) {g.addGoalIdSys("]");}


		 };
		/******************** goalcategory ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> goalcategorylist = goal.getCategory();
		for(int goalcategoryi = 0; goalcategoryi<goalcategorylist.size();goalcategoryi++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  goalcategory = goalcategorylist.get(goalcategoryi);

		/******************** Goal_Ctgry_Txt ********************************************************************************/
		if(goalcategoryi == 0) {g.addGoalCtgryTxt("[");}
		if(goalcategory.hasText()) {

			g.addGoalCtgryTxt(String.valueOf(goalcategory.getText()));
		} else {
			g.addGoalCtgryTxt("NULL");
		}

		if(goalcategoryi == goalcategorylist.size()-1) {g.addGoalCtgryTxt("]");}


		/******************** goalcategorycoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> goalcategorycodinglist = goalcategory.getCoding();
		for(int goalcategorycodingi = 0; goalcategorycodingi<goalcategorycodinglist.size();goalcategorycodingi++ ) {
		org.hl7.fhir.r4.model.Coding  goalcategorycoding = goalcategorycodinglist.get(goalcategorycodingi);

		/******************** Goal_Ctgry_Cdg_Dsply ********************************************************************************/
		if(goalcategorycodingi == 0) {g.addGoalCtgryCdgDsply("[[");}
		if(goalcategorycoding.hasDisplay()) {

			g.addGoalCtgryCdgDsply(String.valueOf(goalcategorycoding.getDisplay()));
		} else {
			g.addGoalCtgryCdgDsply("NULL");
		}

		if(goalcategorycodingi == goalcategorycodinglist.size()-1) {g.addGoalCtgryCdgDsply("]]");}


		/******************** Goal_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(goalcategorycodingi == 0) {g.addGoalCtgryCdgVrsn("[[");}
		if(goalcategorycoding.hasVersion()) {

			g.addGoalCtgryCdgVrsn(String.valueOf(goalcategorycoding.getVersion()));
		} else {
			g.addGoalCtgryCdgVrsn("NULL");
		}

		if(goalcategorycodingi == goalcategorycodinglist.size()-1) {g.addGoalCtgryCdgVrsn("]]");}


		/******************** Goal_Ctgry_Cdg_Cd ********************************************************************************/
		if(goalcategorycodingi == 0) {g.addGoalCtgryCdgCd("[[");}
		if(goalcategorycoding.hasCode()) {

			g.addGoalCtgryCdgCd(String.valueOf(goalcategorycoding.getCode()));
		} else {
			g.addGoalCtgryCdgCd("NULL");
		}

		if(goalcategorycodingi == goalcategorycodinglist.size()-1) {g.addGoalCtgryCdgCd("]]");}


		/******************** Goal_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(goalcategorycodingi == 0) {g.addGoalCtgryCdgUsrSltd("[[");}
		if(goalcategorycoding.hasUserSelected()) {

			g.addGoalCtgryCdgUsrSltd(String.valueOf(goalcategorycoding.getUserSelected()));
		} else {
			g.addGoalCtgryCdgUsrSltd("NULL");
		}

		if(goalcategorycodingi == goalcategorycodinglist.size()-1) {g.addGoalCtgryCdgUsrSltd("]]");}


		/******************** Goal_Ctgry_Cdg_Sys ********************************************************************************/
		if(goalcategorycodingi == 0) {g.addGoalCtgryCdgSys("[[");}
		if(goalcategorycoding.hasSystem()) {

			g.addGoalCtgryCdgSys(String.valueOf(goalcategorycoding.getSystem()));
		} else {
			g.addGoalCtgryCdgSys("NULL");
		}

		if(goalcategorycodingi == goalcategorycodinglist.size()-1) {g.addGoalCtgryCdgSys("]]");}


		 };
		 };
		/******************** goalachievementstatus ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalachievementstatus = goal.getAchievementStatus();

		/******************** Goal_AchievementSts_Txt ********************************************************************************/
		if(goalachievementstatus.hasText()) {

			g.addGoalAchievementStsTxt(String.valueOf(goalachievementstatus.getText()));
		} else {
			g.addGoalAchievementStsTxt("NULL");
		}


		/******************** goalachievementstatuscoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> goalachievementstatuscodinglist = goalachievementstatus.getCoding();
		for(int goalachievementstatuscodingi = 0; goalachievementstatuscodingi<goalachievementstatuscodinglist.size();goalachievementstatuscodingi++ ) {
		org.hl7.fhir.r4.model.Coding  goalachievementstatuscoding = goalachievementstatuscodinglist.get(goalachievementstatuscodingi);

		/******************** Goal_AchievementSts_Cdg_Dsply ********************************************************************************/
		if(goalachievementstatuscodingi == 0) {g.addGoalAchievementStsCdgDsply("[");}
		if(goalachievementstatuscoding.hasDisplay()) {

			g.addGoalAchievementStsCdgDsply(String.valueOf(goalachievementstatuscoding.getDisplay()));
		} else {
			g.addGoalAchievementStsCdgDsply("NULL");
		}

		if(goalachievementstatuscodingi == goalachievementstatuscodinglist.size()-1) {g.addGoalAchievementStsCdgDsply("]");}


		/******************** Goal_AchievementSts_Cdg_Vrsn ********************************************************************************/
		if(goalachievementstatuscodingi == 0) {g.addGoalAchievementStsCdgVrsn("[");}
		if(goalachievementstatuscoding.hasVersion()) {

			g.addGoalAchievementStsCdgVrsn(String.valueOf(goalachievementstatuscoding.getVersion()));
		} else {
			g.addGoalAchievementStsCdgVrsn("NULL");
		}

		if(goalachievementstatuscodingi == goalachievementstatuscodinglist.size()-1) {g.addGoalAchievementStsCdgVrsn("]");}


		/******************** Goal_AchievementSts_Cdg_Cd ********************************************************************************/
		if(goalachievementstatuscodingi == 0) {g.addGoalAchievementStsCdgCd("[");}
		if(goalachievementstatuscoding.hasCode()) {

			g.addGoalAchievementStsCdgCd(String.valueOf(goalachievementstatuscoding.getCode()));
		} else {
			g.addGoalAchievementStsCdgCd("NULL");
		}

		if(goalachievementstatuscodingi == goalachievementstatuscodinglist.size()-1) {g.addGoalAchievementStsCdgCd("]");}


		/******************** Goal_AchievementSts_Cdg_UsrSltd ********************************************************************************/
		if(goalachievementstatuscodingi == 0) {g.addGoalAchievementStsCdgUsrSltd("[");}
		if(goalachievementstatuscoding.hasUserSelected()) {

			g.addGoalAchievementStsCdgUsrSltd(String.valueOf(goalachievementstatuscoding.getUserSelected()));
		} else {
			g.addGoalAchievementStsCdgUsrSltd("NULL");
		}

		if(goalachievementstatuscodingi == goalachievementstatuscodinglist.size()-1) {g.addGoalAchievementStsCdgUsrSltd("]");}


		/******************** Goal_AchievementSts_Cdg_Sys ********************************************************************************/
		if(goalachievementstatuscodingi == 0) {g.addGoalAchievementStsCdgSys("[");}
		if(goalachievementstatuscoding.hasSystem()) {

			g.addGoalAchievementStsCdgSys(String.valueOf(goalachievementstatuscoding.getSystem()));
		} else {
			g.addGoalAchievementStsCdgSys("NULL");
		}

		if(goalachievementstatuscodingi == goalachievementstatuscodinglist.size()-1) {g.addGoalAchievementStsCdgSys("]");}


		 };
		/******************** Goal_OutcomeRfrnc ********************************************************************************/
		if(goal.hasOutcomeReference()) {

			String  array = "[";
			for(int incr=0; incr<goal.getOutcomeReference().size(); incr++) {
				array = array + goal.getOutcomeReference().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			g.addGoalOutcomeRfrnc(array);

		} else {
			g.addGoalOutcomeRfrnc("NULL");
		}


		/******************** goalstartcodeableconcept ********************************************************************************/
		org.hl7.fhir.r4.model.CodeableConcept goalstartcodeableconcept = goal.getStartCodeableConcept();

		/******************** Goal_StrtCdbleCncpt_Txt ********************************************************************************/
		if(goalstartcodeableconcept.hasText()) {

			g.addGoalStrtCdbleCncptTxt(String.valueOf(goalstartcodeableconcept.getText()));
		} else {
			g.addGoalStrtCdbleCncptTxt("NULL");
		}


		/******************** goalstartcodeableconceptcoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> goalstartcodeableconceptcodinglist = goalstartcodeableconcept.getCoding();
		for(int goalstartcodeableconceptcodingi = 0; goalstartcodeableconceptcodingi<goalstartcodeableconceptcodinglist.size();goalstartcodeableconceptcodingi++ ) {
		org.hl7.fhir.r4.model.Coding  goalstartcodeableconceptcoding = goalstartcodeableconceptcodinglist.get(goalstartcodeableconceptcodingi);

		/******************** Goal_StrtCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(goalstartcodeableconceptcodingi == 0) {g.addGoalStrtCdbleCncptCdgDsply("[");}
		if(goalstartcodeableconceptcoding.hasDisplay()) {

			g.addGoalStrtCdbleCncptCdgDsply(String.valueOf(goalstartcodeableconceptcoding.getDisplay()));
		} else {
			g.addGoalStrtCdbleCncptCdgDsply("NULL");
		}

		if(goalstartcodeableconceptcodingi == goalstartcodeableconceptcodinglist.size()-1) {g.addGoalStrtCdbleCncptCdgDsply("]");}


		/******************** Goal_StrtCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(goalstartcodeableconceptcodingi == 0) {g.addGoalStrtCdbleCncptCdgVrsn("[");}
		if(goalstartcodeableconceptcoding.hasVersion()) {

			g.addGoalStrtCdbleCncptCdgVrsn(String.valueOf(goalstartcodeableconceptcoding.getVersion()));
		} else {
			g.addGoalStrtCdbleCncptCdgVrsn("NULL");
		}

		if(goalstartcodeableconceptcodingi == goalstartcodeableconceptcodinglist.size()-1) {g.addGoalStrtCdbleCncptCdgVrsn("]");}


		/******************** Goal_StrtCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(goalstartcodeableconceptcodingi == 0) {g.addGoalStrtCdbleCncptCdgCd("[");}
		if(goalstartcodeableconceptcoding.hasCode()) {

			g.addGoalStrtCdbleCncptCdgCd(String.valueOf(goalstartcodeableconceptcoding.getCode()));
		} else {
			g.addGoalStrtCdbleCncptCdgCd("NULL");
		}

		if(goalstartcodeableconceptcodingi == goalstartcodeableconceptcodinglist.size()-1) {g.addGoalStrtCdbleCncptCdgCd("]");}


		/******************** Goal_StrtCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(goalstartcodeableconceptcodingi == 0) {g.addGoalStrtCdbleCncptCdgUsrSltd("[");}
		if(goalstartcodeableconceptcoding.hasUserSelected()) {

			g.addGoalStrtCdbleCncptCdgUsrSltd(String.valueOf(goalstartcodeableconceptcoding.getUserSelected()));
		} else {
			g.addGoalStrtCdbleCncptCdgUsrSltd("NULL");
		}

		if(goalstartcodeableconceptcodingi == goalstartcodeableconceptcodinglist.size()-1) {g.addGoalStrtCdbleCncptCdgUsrSltd("]");}


		/******************** Goal_StrtCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(goalstartcodeableconceptcodingi == 0) {g.addGoalStrtCdbleCncptCdgSys("[");}
		if(goalstartcodeableconceptcoding.hasSystem()) {

			g.addGoalStrtCdbleCncptCdgSys(String.valueOf(goalstartcodeableconceptcoding.getSystem()));
		} else {
			g.addGoalStrtCdbleCncptCdgSys("NULL");
		}

		if(goalstartcodeableconceptcodingi == goalstartcodeableconceptcodinglist.size()-1) {g.addGoalStrtCdbleCncptCdgSys("]");}


		 };
		/******************** Goal_StsDt ********************************************************************************/
		if(goal.hasStatusDate()) {

			g.addGoalStsDt("\""+ca.uhn.fhir.util.DateUtils.formatDate(goal.getStatusDate())+"\"");
		} else {
			g.addGoalStsDt("NULL");
		}


		/******************** Goal_ExpressedBy ********************************************************************************/
		if(goal.hasExpressedBy()) {

			if(goal.getExpressedBy().getReference() != null) {
			g.addGoalExpressedBy(goal.getExpressedBy().getReference());
			}
		} else {
			g.addGoalExpressedBy("NULL");
		}


		/******************** Goal_Addres ********************************************************************************/
		if(goal.hasAddresses()) {

			String  array = "[";
			for(int incr=0; incr<goal.getAddresses().size(); incr++) {
				array = array + goal.getAddresses().get(incr).getReference() + ",";
			}
			array = array.substring(0, array.length() -1);
			array = array + "]";
			g.addGoalAddres(array);

		} else {
			g.addGoalAddres("NULL");
		}


		/******************** Goal_StrtDtTyp ********************************************************************************/
		if(goal.hasStartDateType()) {

			g.addGoalStrtDtTyp("\""+goal.getStartDateType().getValueAsString()+"\"");
		} else {
			g.addGoalStrtDtTyp("NULL");
		}


		/******************** goallifecyclestatus ********************************************************************************/
		org.hl7.fhir.r4.model.Goal.GoalLifecycleStatus goallifecyclestatus = goal.getLifecycleStatus();
		if(goallifecyclestatus!=null) {
			g.addGoalLifecycleSts(goallifecyclestatus.toCode());
		} else {
			g.addGoalLifecycleSts("NULL");
		}

		/******************** goaloutcomecode ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.CodeableConcept> goaloutcomecodelist = goal.getOutcomeCode();
		for(int goaloutcomecodei = 0; goaloutcomecodei<goaloutcomecodelist.size();goaloutcomecodei++ ) {
		org.hl7.fhir.r4.model.CodeableConcept  goaloutcomecode = goaloutcomecodelist.get(goaloutcomecodei);

		/******************** Goal_OutcomeCd_Txt ********************************************************************************/
		if(goaloutcomecodei == 0) {g.addGoalOutcomeCdTxt("[");}
		if(goaloutcomecode.hasText()) {

			g.addGoalOutcomeCdTxt(String.valueOf(goaloutcomecode.getText()));
		} else {
			g.addGoalOutcomeCdTxt("NULL");
		}

		if(goaloutcomecodei == goaloutcomecodelist.size()-1) {g.addGoalOutcomeCdTxt("]");}


		/******************** goaloutcomecodecoding ********************************************************************************/
		java.util.List<org.hl7.fhir.r4.model.Coding> goaloutcomecodecodinglist = goaloutcomecode.getCoding();
		for(int goaloutcomecodecodingi = 0; goaloutcomecodecodingi<goaloutcomecodecodinglist.size();goaloutcomecodecodingi++ ) {
		org.hl7.fhir.r4.model.Coding  goaloutcomecodecoding = goaloutcomecodecodinglist.get(goaloutcomecodecodingi);

		/******************** Goal_OutcomeCd_Cdg_Dsply ********************************************************************************/
		if(goaloutcomecodecodingi == 0) {g.addGoalOutcomeCdCdgDsply("[[");}
		if(goaloutcomecodecoding.hasDisplay()) {

			g.addGoalOutcomeCdCdgDsply(String.valueOf(goaloutcomecodecoding.getDisplay()));
		} else {
			g.addGoalOutcomeCdCdgDsply("NULL");
		}

		if(goaloutcomecodecodingi == goaloutcomecodecodinglist.size()-1) {g.addGoalOutcomeCdCdgDsply("]]");}


		/******************** Goal_OutcomeCd_Cdg_Vrsn ********************************************************************************/
		if(goaloutcomecodecodingi == 0) {g.addGoalOutcomeCdCdgVrsn("[[");}
		if(goaloutcomecodecoding.hasVersion()) {

			g.addGoalOutcomeCdCdgVrsn(String.valueOf(goaloutcomecodecoding.getVersion()));
		} else {
			g.addGoalOutcomeCdCdgVrsn("NULL");
		}

		if(goaloutcomecodecodingi == goaloutcomecodecodinglist.size()-1) {g.addGoalOutcomeCdCdgVrsn("]]");}


		/******************** Goal_OutcomeCd_Cdg_Cd ********************************************************************************/
		if(goaloutcomecodecodingi == 0) {g.addGoalOutcomeCdCdgCd("[[");}
		if(goaloutcomecodecoding.hasCode()) {

			g.addGoalOutcomeCdCdgCd(String.valueOf(goaloutcomecodecoding.getCode()));
		} else {
			g.addGoalOutcomeCdCdgCd("NULL");
		}

		if(goaloutcomecodecodingi == goaloutcomecodecodinglist.size()-1) {g.addGoalOutcomeCdCdgCd("]]");}


		/******************** Goal_OutcomeCd_Cdg_UsrSltd ********************************************************************************/
		if(goaloutcomecodecodingi == 0) {g.addGoalOutcomeCdCdgUsrSltd("[[");}
		if(goaloutcomecodecoding.hasUserSelected()) {

			g.addGoalOutcomeCdCdgUsrSltd(String.valueOf(goaloutcomecodecoding.getUserSelected()));
		} else {
			g.addGoalOutcomeCdCdgUsrSltd("NULL");
		}

		if(goaloutcomecodecodingi == goaloutcomecodecodinglist.size()-1) {g.addGoalOutcomeCdCdgUsrSltd("]]");}


		/******************** Goal_OutcomeCd_Cdg_Sys ********************************************************************************/
		if(goaloutcomecodecodingi == 0) {g.addGoalOutcomeCdCdgSys("[[");}
		if(goaloutcomecodecoding.hasSystem()) {

			g.addGoalOutcomeCdCdgSys(String.valueOf(goaloutcomecodecoding.getSystem()));
		} else {
			g.addGoalOutcomeCdCdgSys("NULL");
		}

		if(goaloutcomecodecodingi == goaloutcomecodecodinglist.size()-1) {g.addGoalOutcomeCdCdgSys("]]");}


		 };
		 };
		/******************** Goal_StsRsn ********************************************************************************/
		if(goal.hasStatusReason()) {

			g.addGoalStsRsn(String.valueOf(goal.getStatusReason()));
		} else {
			g.addGoalStsRsn("NULL");
		}


		return g;
	}
}
