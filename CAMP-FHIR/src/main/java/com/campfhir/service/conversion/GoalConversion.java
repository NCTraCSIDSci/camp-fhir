package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.Goal;
public class GoalConversion 
{
	public org.hl7.fhir.r4.model.Goal Goals(Goal g) throws ParseException
	{
		org.hl7.fhir.r4.model.Goal goal = new org.hl7.fhir.r4.model.Goal();

		/******************** id ********************************************************************************/
		goal.setId(g.getId());

		/******************** Goal_AchievementSts_Cdg_Cd ********************************************************************************/
		if(g.getGoalAchievementStsCdgCd() != null ) {

			String[] arrayi0 = g.getGoalAchievementStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getAchievementStatus().getCoding().size() < i0+1) { goal.getAchievementStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getAchievementStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_AchievementSts_Cdg_Dsply ********************************************************************************/
		if(g.getGoalAchievementStsCdgDsply() != null ) {

			String[] arrayi0 = g.getGoalAchievementStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getAchievementStatus().getCoding().size() < i0+1) { goal.getAchievementStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getAchievementStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_AchievementSts_Cdg_Sys ********************************************************************************/
		if(g.getGoalAchievementStsCdgSys() != null ) {

			String[] arrayi0 = g.getGoalAchievementStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getAchievementStatus().getCoding().size() < i0+1) { goal.getAchievementStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getAchievementStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_AchievementSts_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalAchievementStsCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGoalAchievementStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getAchievementStatus().getCoding().size() < i0+1) { goal.getAchievementStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getAchievementStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_AchievementSts_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalAchievementStsCdgVrsn() != null ) {

			String[] arrayi0 = g.getGoalAchievementStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getAchievementStatus().getCoding().size() < i0+1) { goal.getAchievementStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getAchievementStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_AchievementSts_Txt ********************************************************************************/
		if(g.getGoalAchievementStsTxt() != null ) {

			if(g.getGoalAchievementStsTxt().replace("[","").replace("]","").equals("NULL") | g.getGoalAchievementStsTxt()==null) {} else {
			goal.getAchievementStatus().setText(g.getGoalAchievementStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Goal_Addres ********************************************************************************/
		if(g.getGoalAddres() != null ) {

				for( String currListStrSplit : g.getGoalAddres().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			goal.addAddresses(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Goal_Ctgry_Cdg_Cd ********************************************************************************/
		if(g.getGoalCtgryCdgCd() != null ) {

			String[] arrayi0 = g.getGoalCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getCategory().size() < i0+1) { goal.addCategory(); }
				String[] arrayi1 = g.getGoalCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getCategory().get(i0).getCoding().size() < i1+1) { goal.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getCategory().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_Ctgry_Cdg_Dsply ********************************************************************************/
		if(g.getGoalCtgryCdgDsply() != null ) {

			String[] arrayi0 = g.getGoalCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getCategory().size() < i0+1) { goal.addCategory(); }
				String[] arrayi1 = g.getGoalCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getCategory().get(i0).getCoding().size() < i1+1) { goal.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getCategory().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_Ctgry_Cdg_Sys ********************************************************************************/
		if(g.getGoalCtgryCdgSys() != null ) {

			String[] arrayi0 = g.getGoalCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getCategory().size() < i0+1) { goal.addCategory(); }
				String[] arrayi1 = g.getGoalCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getCategory().get(i0).getCoding().size() < i1+1) { goal.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getCategory().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGoalCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getCategory().size() < i0+1) { goal.addCategory(); }
				String[] arrayi1 = g.getGoalCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getCategory().get(i0).getCoding().size() < i1+1) { goal.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getCategory().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Goal_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalCtgryCdgVrsn() != null ) {

			String[] arrayi0 = g.getGoalCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getCategory().size() < i0+1) { goal.addCategory(); }
				String[] arrayi1 = g.getGoalCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getCategory().get(i0).getCoding().size() < i1+1) { goal.getCategory().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getCategory().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_Ctgry_Txt ********************************************************************************/
		if(g.getGoalCtgryTxt() != null ) {

			String[] arrayi0 = g.getGoalCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getCategory().size() < i0+1) { goal.addCategory(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getCategory().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Dscrptn_Cdg_Cd ********************************************************************************/
		if(g.getGoalDscrptnCdgCd() != null ) {

			String[] arrayi0 = g.getGoalDscrptnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getDescription().getCoding().size() < i0+1) { goal.getDescription().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getDescription().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(g.getGoalDscrptnCdgDsply() != null ) {

			String[] arrayi0 = g.getGoalDscrptnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getDescription().getCoding().size() < i0+1) { goal.getDescription().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getDescription().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Dscrptn_Cdg_Sys ********************************************************************************/
		if(g.getGoalDscrptnCdgSys() != null ) {

			String[] arrayi0 = g.getGoalDscrptnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getDescription().getCoding().size() < i0+1) { goal.getDescription().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getDescription().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalDscrptnCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGoalDscrptnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getDescription().getCoding().size() < i0+1) { goal.getDescription().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getDescription().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalDscrptnCdgVrsn() != null ) {

			String[] arrayi0 = g.getGoalDscrptnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getDescription().getCoding().size() < i0+1) { goal.getDescription().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getDescription().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Dscrptn_Txt ********************************************************************************/
		if(g.getGoalDscrptnTxt() != null ) {

			if(g.getGoalDscrptnTxt().replace("[","").replace("]","").equals("NULL") | g.getGoalDscrptnTxt()==null) {} else {
			goal.getDescription().setText(g.getGoalDscrptnTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Goal_ExpressedBy ********************************************************************************/
		if(g.getGoalExpressedBy() != null ) {

			if(g.getGoalExpressedBy().replace("[","").replace("]","").equals("NULL") | g.getGoalExpressedBy()==null) {} else {
			goal.setExpressedBy(new org.hl7.fhir.r4.model.Reference(g.getGoalExpressedBy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Goal_Id_Assigner ********************************************************************************/
		if(g.getGoalIdAssigner() != null ) {

			String[] arrayi0 = g.getGoalIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_Id_Prd_End ********************************************************************************/
		if(g.getGoalIdPrdEnd() != null ) {

			String[] arrayi0 = g.getGoalIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_Id_Prd_Strt ********************************************************************************/
		if(g.getGoalIdPrdStrt() != null ) {

			String[] arrayi0 = g.getGoalIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_Id_Sys ********************************************************************************/
		if(g.getGoalIdSys() != null ) {

			String[] arrayi0 = g.getGoalIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Id_Typ_Cdg_Cd ********************************************************************************/
		if(g.getGoalIdTypCdgCd() != null ) {

			String[] arrayi0 = g.getGoalIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				String[] arrayi1 = g.getGoalIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { goal.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(g.getGoalIdTypCdgDsply() != null ) {

			String[] arrayi0 = g.getGoalIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				String[] arrayi1 = g.getGoalIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { goal.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_Id_Typ_Cdg_Sys ********************************************************************************/
		if(g.getGoalIdTypCdgSys() != null ) {

			String[] arrayi0 = g.getGoalIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				String[] arrayi1 = g.getGoalIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { goal.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGoalIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				String[] arrayi1 = g.getGoalIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { goal.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Goal_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalIdTypCdgVrsn() != null ) {

			String[] arrayi0 = g.getGoalIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				String[] arrayi1 = g.getGoalIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { goal.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_Id_Typ_Txt ********************************************************************************/
		if(g.getGoalIdTypTxt() != null ) {

			String[] arrayi0 = g.getGoalIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Id_Use ********************************************************************************/
		if(g.getGoalIdUse() != null ) {

			String[] arrayi0 = g.getGoalIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_Id_Vl ********************************************************************************/
		if(g.getGoalIdVl() != null ) {

			String[] arrayi0 = g.getGoalIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getIdentifier().size() < i0+1) { goal.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_LifecycleSts ********************************************************************************/
		if(g.getGoalLifecycleSts() != null ) {

			if(g.getGoalLifecycleSts().replace("[","").replace("]","").equals("NULL") | g.getGoalLifecycleSts()==null) {} else {
			goal.setLifecycleStatus(new org.hl7.fhir.r4.model.Goal.GoalLifecycleStatusEnumFactory().fromCode(g.getGoalLifecycleSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Goal_Nt_AthrRfrnc ********************************************************************************/
		if(g.getGoalNtAthrRfrnc() != null ) {

			String[] arrayi0 = g.getGoalNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getNote().size() < i0+1) { goal.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_Nt_AthrStrgTyp ********************************************************************************/
		if(g.getGoalNtAthrStrgTyp() != null ) {

			String[] arrayi0 = g.getGoalNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getNote().size() < i0+1) { goal.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_Nt_Txt ********************************************************************************/
		if(g.getGoalNtTxt() != null ) {

			String[] arrayi0 = g.getGoalNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getNote().size() < i0+1) { goal.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Nt_Time ********************************************************************************/
		if(g.getGoalNtTime() != null ) {

			String[] arrayi0 = g.getGoalNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getNote().size() < i0+1) { goal.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_OutcomeCd_Cdg_Cd ********************************************************************************/
		if(g.getGoalOutcomeCdCdgCd() != null ) {

			String[] arrayi0 = g.getGoalOutcomeCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getOutcomeCode().size() < i0+1) { goal.addOutcomeCode(); }
				String[] arrayi1 = g.getGoalOutcomeCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getOutcomeCode().get(i0).getCoding().size() < i1+1) { goal.getOutcomeCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getOutcomeCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_OutcomeCd_Cdg_Dsply ********************************************************************************/
		if(g.getGoalOutcomeCdCdgDsply() != null ) {

			String[] arrayi0 = g.getGoalOutcomeCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getOutcomeCode().size() < i0+1) { goal.addOutcomeCode(); }
				String[] arrayi1 = g.getGoalOutcomeCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getOutcomeCode().get(i0).getCoding().size() < i1+1) { goal.getOutcomeCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getOutcomeCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_OutcomeCd_Cdg_Sys ********************************************************************************/
		if(g.getGoalOutcomeCdCdgSys() != null ) {

			String[] arrayi0 = g.getGoalOutcomeCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getOutcomeCode().size() < i0+1) { goal.addOutcomeCode(); }
				String[] arrayi1 = g.getGoalOutcomeCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getOutcomeCode().get(i0).getCoding().size() < i1+1) { goal.getOutcomeCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getOutcomeCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_OutcomeCd_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalOutcomeCdCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGoalOutcomeCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getOutcomeCode().size() < i0+1) { goal.addOutcomeCode(); }
				String[] arrayi1 = g.getGoalOutcomeCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getOutcomeCode().get(i0).getCoding().size() < i1+1) { goal.getOutcomeCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getOutcomeCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Goal_OutcomeCd_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalOutcomeCdCdgVrsn() != null ) {

			String[] arrayi0 = g.getGoalOutcomeCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getOutcomeCode().size() < i0+1) { goal.addOutcomeCode(); }
				String[] arrayi1 = g.getGoalOutcomeCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(goal.getOutcomeCode().get(i0).getCoding().size() < i1+1) { goal.getOutcomeCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {goal.getOutcomeCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Goal_OutcomeCd_Txt ********************************************************************************/
		if(g.getGoalOutcomeCdTxt() != null ) {

			String[] arrayi0 = g.getGoalOutcomeCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getOutcomeCode().size() < i0+1) { goal.addOutcomeCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getOutcomeCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_OutcomeRfrnc ********************************************************************************/
		if(g.getGoalOutcomeRfrnc() != null ) {

				for( String currListStrSplit : g.getGoalOutcomeRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			goal.addOutcomeReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** Goal_Priority_Cdg_Cd ********************************************************************************/
		if(g.getGoalPriorityCdgCd() != null ) {

			String[] arrayi0 = g.getGoalPriorityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getPriority().getCoding().size() < i0+1) { goal.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getPriority().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Priority_Cdg_Dsply ********************************************************************************/
		if(g.getGoalPriorityCdgDsply() != null ) {

			String[] arrayi0 = g.getGoalPriorityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getPriority().getCoding().size() < i0+1) { goal.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getPriority().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Priority_Cdg_Sys ********************************************************************************/
		if(g.getGoalPriorityCdgSys() != null ) {

			String[] arrayi0 = g.getGoalPriorityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getPriority().getCoding().size() < i0+1) { goal.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getPriority().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Priority_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalPriorityCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGoalPriorityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getPriority().getCoding().size() < i0+1) { goal.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getPriority().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_Priority_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalPriorityCdgVrsn() != null ) {

			String[] arrayi0 = g.getGoalPriorityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getPriority().getCoding().size() < i0+1) { goal.getPriority().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getPriority().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_Priority_Txt ********************************************************************************/
		if(g.getGoalPriorityTxt() != null ) {

			if(g.getGoalPriorityTxt().replace("[","").replace("]","").equals("NULL") | g.getGoalPriorityTxt()==null) {} else {
			goal.getPriority().setText(g.getGoalPriorityTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = g.getGoalStrtCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getStartCodeableConcept().getCoding().size() < i0+1) { goal.getStartCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getStartCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = g.getGoalStrtCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getStartCodeableConcept().getCoding().size() < i0+1) { goal.getStartCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getStartCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = g.getGoalStrtCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getStartCodeableConcept().getCoding().size() < i0+1) { goal.getStartCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getStartCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_StrtCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = g.getGoalStrtCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getStartCodeableConcept().getCoding().size() < i0+1) { goal.getStartCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getStartCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Goal_StrtCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(g.getGoalStrtCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = g.getGoalStrtCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(goal.getStartCodeableConcept().getCoding().size() < i0+1) { goal.getStartCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {goal.getStartCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Goal_StrtCdbleCncpt_Txt ********************************************************************************/
		if(g.getGoalStrtCdbleCncptTxt() != null ) {

			if(g.getGoalStrtCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | g.getGoalStrtCdbleCncptTxt()==null) {} else {
			goal.getStartCodeableConcept().setText(g.getGoalStrtCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Goal_StrtDtTyp ********************************************************************************/
		if(g.getGoalStrtDtTyp() != null ) {

			if(g.getGoalStrtDtTyp().replace("[","").replace("]","").equals("NULL") | g.getGoalStrtDtTyp()==null) {} else {
			goal.setStart(new org.hl7.fhir.r4.model.DateType(g.getGoalStrtDtTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Goal_StsDt ********************************************************************************/
		if(g.getGoalStsDt() != null ) {

			if(g.getGoalStsDt().replace("[","").replace("]","").equals("NULL") | g.getGoalStsDt()==null) {} else {
			goal.setStatusDate(g.getGoalStsDt().replace("[","").replace("]","").equals("NULL") | g.getGoalStsDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(g.getGoalStsDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Goal_StsRsn ********************************************************************************/
		if(g.getGoalStsRsn() != null ) {

			if(g.getGoalStsRsn().replace("[","").replace("]","").equals("NULL") | g.getGoalStsRsn()==null) {} else {
			goal.setStatusReason(g.getGoalStsRsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Goal_Sbjct ********************************************************************************/
		if(g.getGoalSbjct() != null ) {

			if(g.getGoalSbjct().replace("[","").replace("]","").equals("NULL") | g.getGoalSbjct()==null) {} else {
			goal.setSubject(new org.hl7.fhir.r4.model.Reference(g.getGoalSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return goal;
	}
}
