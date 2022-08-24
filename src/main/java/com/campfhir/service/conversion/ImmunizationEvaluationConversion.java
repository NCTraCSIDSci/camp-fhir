package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ImmunizationEvaluation;
public class ImmunizationEvaluationConversion 
{
	public org.hl7.fhir.r4.model.ImmunizationEvaluation ImmunizationEvaluations(ImmunizationEvaluation i) throws ParseException
	{
		org.hl7.fhir.r4.model.ImmunizationEvaluation immunizationevaluation = new org.hl7.fhir.r4.model.ImmunizationEvaluation();

		/******************** id ********************************************************************************/
		immunizationevaluation.setId(i.getId());

		/******************** ImmnztnEvaluation_Athrity ********************************************************************************/
		if(i.getImmnztnEvaluationAthrity() != null ) {

			if(i.getImmnztnEvaluationAthrity().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationAthrity()==null) {} else {
			immunizationevaluation.setAuthority(new org.hl7.fhir.r4.model.Reference(i.getImmnztnEvaluationAthrity().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnEvaluation_Dt ********************************************************************************/
		if(i.getImmnztnEvaluationDt() != null ) {

			if(i.getImmnztnEvaluationDt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationDt()==null) {} else {
			immunizationevaluation.setDate(i.getImmnztnEvaluationDt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(i.getImmnztnEvaluationDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnEvaluation_Dscrptn ********************************************************************************/
		if(i.getImmnztnEvaluationDscrptn() != null ) {

			if(i.getImmnztnEvaluationDscrptn().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationDscrptn()==null) {} else {
			immunizationevaluation.setDescription(i.getImmnztnEvaluationDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ImmnztnEvaluation_DoseNmbrPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnEvaluationDoseNmbrPositiveIntTyp() != null ) {

			if(i.getImmnztnEvaluationDoseNmbrPositiveIntTyp().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationDoseNmbrPositiveIntTyp()==null) {} else {
			immunizationevaluation.setDoseNumber(new org.hl7.fhir.r4.model.PositiveIntType(i.getImmnztnEvaluationDoseNmbrPositiveIntTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnEvaluation_DoseNmbrStrgTyp ********************************************************************************/
		if(i.getImmnztnEvaluationDoseNmbrStrgTyp() != null ) {

			if(i.getImmnztnEvaluationDoseNmbrStrgTyp().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationDoseNmbrStrgTyp()==null) {} else {
			immunizationevaluation.setDoseNumber(new org.hl7.fhir.r4.model.StringType(i.getImmnztnEvaluationDoseNmbrStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatus().getCoding().size() < i0+1) { immunizationevaluation.getDoseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getDoseStatus().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatus().getCoding().size() < i0+1) { immunizationevaluation.getDoseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getDoseStatus().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatus().getCoding().size() < i0+1) { immunizationevaluation.getDoseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getDoseStatus().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatus().getCoding().size() < i0+1) { immunizationevaluation.getDoseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getDoseStatus().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnEvaluation_DoseSts_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatus().getCoding().size() < i0+1) { immunizationevaluation.getDoseStatus().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getDoseStatus().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_DoseSts_Txt ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsTxt() != null ) {

			if(i.getImmnztnEvaluationDoseStsTxt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationDoseStsTxt()==null) {} else {
			immunizationevaluation.getDoseStatus().setText(i.getImmnztnEvaluationDoseStsTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatusReason().size() < i0+1) { immunizationevaluation.addDoseStatusReason(); }
				String[] arrayi1 = i.getImmnztnEvaluationDoseStsRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getDoseStatusReason().get(i0).getCoding().size() < i1+1) { immunizationevaluation.getDoseStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getDoseStatusReason().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatusReason().size() < i0+1) { immunizationevaluation.addDoseStatusReason(); }
				String[] arrayi1 = i.getImmnztnEvaluationDoseStsRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getDoseStatusReason().get(i0).getCoding().size() < i1+1) { immunizationevaluation.getDoseStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getDoseStatusReason().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatusReason().size() < i0+1) { immunizationevaluation.addDoseStatusReason(); }
				String[] arrayi1 = i.getImmnztnEvaluationDoseStsRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getDoseStatusReason().get(i0).getCoding().size() < i1+1) { immunizationevaluation.getDoseStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getDoseStatusReason().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatusReason().size() < i0+1) { immunizationevaluation.addDoseStatusReason(); }
				String[] arrayi1 = i.getImmnztnEvaluationDoseStsRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getDoseStatusReason().get(i0).getCoding().size() < i1+1) { immunizationevaluation.getDoseStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getDoseStatusReason().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatusReason().size() < i0+1) { immunizationevaluation.addDoseStatusReason(); }
				String[] arrayi1 = i.getImmnztnEvaluationDoseStsRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getDoseStatusReason().get(i0).getCoding().size() < i1+1) { immunizationevaluation.getDoseStatusReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getDoseStatusReason().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnEvaluation_DoseStsRsn_Txt ********************************************************************************/
		if(i.getImmnztnEvaluationDoseStsRsnTxt() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationDoseStsRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getDoseStatusReason().size() < i0+1) { immunizationevaluation.addDoseStatusReason(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getDoseStatusReason().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_Id_Assigner ********************************************************************************/
		if(i.getImmnztnEvaluationIdAssigner() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnEvaluation_Id_Prd_End ********************************************************************************/
		if(i.getImmnztnEvaluationIdPrdEnd() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnEvaluation_Id_Prd_Strt ********************************************************************************/
		if(i.getImmnztnEvaluationIdPrdStrt() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnEvaluation_Id_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationIdSys() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnEvaluationIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationevaluation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnEvaluationIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationevaluation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnEvaluationIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationevaluation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnEvaluationIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationevaluation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ImmnztnEvaluation_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				String[] arrayi1 = i.getImmnztnEvaluationIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(immunizationevaluation.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { immunizationevaluation.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {immunizationevaluation.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ImmnztnEvaluation_Id_Typ_Txt ********************************************************************************/
		if(i.getImmnztnEvaluationIdTypTxt() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_Id_Use ********************************************************************************/
		if(i.getImmnztnEvaluationIdUse() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnEvaluation_Id_Vl ********************************************************************************/
		if(i.getImmnztnEvaluationIdVl() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getIdentifier().size() < i0+1) { immunizationevaluation.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_ImmnztnEvnt ********************************************************************************/
		if(i.getImmnztnEvaluationImmnztnEvnt() != null ) {

			if(i.getImmnztnEvaluationImmnztnEvnt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationImmnztnEvnt()==null) {} else {
			immunizationevaluation.setImmunizationEvent(new org.hl7.fhir.r4.model.Reference(i.getImmnztnEvaluationImmnztnEvnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnEvaluation_Pnt ********************************************************************************/
		if(i.getImmnztnEvaluationPnt() != null ) {

			if(i.getImmnztnEvaluationPnt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationPnt()==null) {} else {
			immunizationevaluation.setPatient(new org.hl7.fhir.r4.model.Reference(i.getImmnztnEvaluationPnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnEvaluation_Series ********************************************************************************/
		if(i.getImmnztnEvaluationSeries() != null ) {

			if(i.getImmnztnEvaluationSeries().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationSeries()==null) {} else {
			immunizationevaluation.setSeries(i.getImmnztnEvaluationSeries().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ImmnztnEvaluation_SeriesDosesPositiveIntTyp ********************************************************************************/
		if(i.getImmnztnEvaluationSeriesDosesPositiveIntTyp() != null ) {

			if(i.getImmnztnEvaluationSeriesDosesPositiveIntTyp().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationSeriesDosesPositiveIntTyp()==null) {} else {
			immunizationevaluation.setSeriesDoses(new org.hl7.fhir.r4.model.PositiveIntType(i.getImmnztnEvaluationSeriesDosesPositiveIntTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnEvaluation_SeriesDosesStrgTyp ********************************************************************************/
		if(i.getImmnztnEvaluationSeriesDosesStrgTyp() != null ) {

			if(i.getImmnztnEvaluationSeriesDosesStrgTyp().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationSeriesDosesStrgTyp()==null) {} else {
			immunizationevaluation.setSeriesDoses(new org.hl7.fhir.r4.model.StringType(i.getImmnztnEvaluationSeriesDosesStrgTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnEvaluation_Sts ********************************************************************************/
		if(i.getImmnztnEvaluationSts() != null ) {

			if(i.getImmnztnEvaluationSts().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationSts()==null) {} else {
			immunizationevaluation.setStatus(new org.hl7.fhir.r4.model.ImmunizationEvaluation.ImmunizationEvaluationStatusEnumFactory().fromCode(i.getImmnztnEvaluationSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ImmnztnEvaluation_TarDisease_Cdg_Cd ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgCd() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationTarDiseaseCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getTargetDisease().getCoding().size() < i0+1) { immunizationevaluation.getTargetDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getTargetDisease().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_TarDisease_Cdg_Dsply ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgDsply() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationTarDiseaseCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getTargetDisease().getCoding().size() < i0+1) { immunizationevaluation.getTargetDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getTargetDisease().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_TarDisease_Cdg_Sys ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgSys() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationTarDiseaseCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getTargetDisease().getCoding().size() < i0+1) { immunizationevaluation.getTargetDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getTargetDisease().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_TarDisease_Cdg_UsrSltd ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgUsrSltd() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationTarDiseaseCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getTargetDisease().getCoding().size() < i0+1) { immunizationevaluation.getTargetDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getTargetDisease().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ImmnztnEvaluation_TarDisease_Cdg_Vrsn ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseCdgVrsn() != null ) {

			String[] arrayi0 = i.getImmnztnEvaluationTarDiseaseCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(immunizationevaluation.getTargetDisease().getCoding().size() < i0+1) { immunizationevaluation.getTargetDisease().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {immunizationevaluation.getTargetDisease().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ImmnztnEvaluation_TarDisease_Txt ********************************************************************************/
		if(i.getImmnztnEvaluationTarDiseaseTxt() != null ) {

			if(i.getImmnztnEvaluationTarDiseaseTxt().replace("[","").replace("]","").equals("NULL") | i.getImmnztnEvaluationTarDiseaseTxt()==null) {} else {
			immunizationevaluation.getTargetDisease().setText(i.getImmnztnEvaluationTarDiseaseTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return immunizationevaluation;
	}
}
