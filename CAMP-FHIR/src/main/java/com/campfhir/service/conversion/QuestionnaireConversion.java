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
		if(q.getQstnaireApprovalDt() != null ) {

			if(q.getQstnaireApprovalDt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireApprovalDt()==null) {} else {
			questionnaire.setApprovalDate(q.getQstnaireApprovalDt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(q.getQstnaireApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Qstnaire_Cd_Cd ********************************************************************************/
		if(q.getQstnaireCdCd() != null ) {

			String[] arrayi0 = q.getQstnaireCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getCode().size() < i0+1) { questionnaire.addCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getCode().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Cd_Dsply ********************************************************************************/
		if(q.getQstnaireCdDsply() != null ) {

			String[] arrayi0 = q.getQstnaireCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getCode().size() < i0+1) { questionnaire.addCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getCode().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Cd_Sys ********************************************************************************/
		if(q.getQstnaireCdSys() != null ) {

			String[] arrayi0 = q.getQstnaireCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getCode().size() < i0+1) { questionnaire.addCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getCode().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Cd_UsrSltd ********************************************************************************/
		if(q.getQstnaireCdUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getCode().size() < i0+1) { questionnaire.addCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getCode().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Cd_Vrsn ********************************************************************************/
		if(q.getQstnaireCdVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getCode().size() < i0+1) { questionnaire.addCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getCode().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Cntct_Nm ********************************************************************************/
		if(q.getQstnaireCntctNm() != null ) {

			String[] arrayi0 = q.getQstnaireCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getContact().size() < i0+1) { questionnaire.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(q.getQstnaireCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = q.getQstnaireCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getContact().size() < i0+1) { questionnaire.addContact(); }
				String[] arrayi1 = q.getQstnaireCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getContact().get(i0).getTelecom().size() < i1+1) { questionnaire.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(q.getQstnaireCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = q.getQstnaireCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getContact().size() < i0+1) { questionnaire.addContact(); }
				String[] arrayi1 = q.getQstnaireCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getContact().get(i0).getTelecom().size() < i1+1) { questionnaire.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Cntct_Tlcm_Rnk ********************************************************************************/
		if(q.getQstnaireCntctTlcmRnk() != null ) {

			String[] arrayi0 = q.getQstnaireCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getContact().size() < i0+1) { questionnaire.addContact(); }
				String[] arrayi1 = q.getQstnaireCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getContact().get(i0).getTelecom().size() < i1+1) { questionnaire.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Cntct_Tlcm_Sys ********************************************************************************/
		if(q.getQstnaireCntctTlcmSys() != null ) {

			String[] arrayi0 = q.getQstnaireCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getContact().size() < i0+1) { questionnaire.addContact(); }
				String[] arrayi1 = q.getQstnaireCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getContact().get(i0).getTelecom().size() < i1+1) { questionnaire.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Cntct_Tlcm_Use ********************************************************************************/
		if(q.getQstnaireCntctTlcmUse() != null ) {

			String[] arrayi0 = q.getQstnaireCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getContact().size() < i0+1) { questionnaire.addContact(); }
				String[] arrayi1 = q.getQstnaireCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getContact().get(i0).getTelecom().size() < i1+1) { questionnaire.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Cntct_Tlcm_Vl ********************************************************************************/
		if(q.getQstnaireCntctTlcmVl() != null ) {

			String[] arrayi0 = q.getQstnaireCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getContact().size() < i0+1) { questionnaire.addContact(); }
				String[] arrayi1 = q.getQstnaireCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getContact().get(i0).getTelecom().size() < i1+1) { questionnaire.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Copyright ********************************************************************************/
		if(q.getQstnaireCopyright() != null ) {

			if(q.getQstnaireCopyright().replace("[","").replace("]","").equals("NULL") | q.getQstnaireCopyright()==null) {} else {
			questionnaire.setCopyright(q.getQstnaireCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Qstnaire_Dt ********************************************************************************/
		if(q.getQstnaireDt() != null ) {

			if(q.getQstnaireDt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireDt()==null) {} else {
			questionnaire.setDate(q.getQstnaireDt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(q.getQstnaireDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Qstnaire_DerivedFrom ********************************************************************************/
		if(q.getQstnaireDerivedFrom() != null ) {

				for( String currListStrSplit : q.getQstnaireDerivedFrom().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			questionnaire.addDerivedFrom(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Qstnaire_Dscrptn ********************************************************************************/
		if(q.getQstnaireDscrptn() != null ) {

			if(q.getQstnaireDscrptn().replace("[","").replace("]","").equals("NULL") | q.getQstnaireDscrptn()==null) {} else {
			questionnaire.setDescription(q.getQstnaireDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Qstnaire_EfctivePrd_End ********************************************************************************/
		if(q.getQstnaireEfctivePrdEnd() != null ) {

			if(q.getQstnaireEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | q.getQstnaireEfctivePrdEnd()==null) {} else {
			questionnaire.getEffectivePeriod().setEnd(q.getQstnaireEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | q.getQstnaireEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(q.getQstnaireEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Qstnaire_EfctivePrd_Strt ********************************************************************************/
		if(q.getQstnaireEfctivePrdStrt() != null ) {

			if(q.getQstnaireEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireEfctivePrdStrt()==null) {} else {
			questionnaire.getEffectivePeriod().setStart(q.getQstnaireEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(q.getQstnaireEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Qstnaire_Exprmtl ********************************************************************************/
		if(q.getQstnaireExprmtl() != null ) {

			if(q.getQstnaireExprmtl().replace("[","").replace("]","").equals("NULL") | q.getQstnaireExprmtl()==null) {} else {
			questionnaire.setExperimental(Boolean.parseBoolean(q.getQstnaireExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Qstnaire_Id_Assigner ********************************************************************************/
		if(q.getQstnaireIdAssigner() != null ) {

			String[] arrayi0 = q.getQstnaireIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Id_Prd_End ********************************************************************************/
		if(q.getQstnaireIdPrdEnd() != null ) {

			String[] arrayi0 = q.getQstnaireIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Id_Prd_Strt ********************************************************************************/
		if(q.getQstnaireIdPrdStrt() != null ) {

			String[] arrayi0 = q.getQstnaireIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Id_Sys ********************************************************************************/
		if(q.getQstnaireIdSys() != null ) {

			String[] arrayi0 = q.getQstnaireIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Id_Typ_Cdg_Cd ********************************************************************************/
		if(q.getQstnaireIdTypCdgCd() != null ) {

			String[] arrayi0 = q.getQstnaireIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				String[] arrayi1 = q.getQstnaireIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { questionnaire.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(q.getQstnaireIdTypCdgDsply() != null ) {

			String[] arrayi0 = q.getQstnaireIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				String[] arrayi1 = q.getQstnaireIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { questionnaire.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Id_Typ_Cdg_Sys ********************************************************************************/
		if(q.getQstnaireIdTypCdgSys() != null ) {

			String[] arrayi0 = q.getQstnaireIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				String[] arrayi1 = q.getQstnaireIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { questionnaire.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				String[] arrayi1 = q.getQstnaireIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { questionnaire.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(q.getQstnaireIdTypCdgVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				String[] arrayi1 = q.getQstnaireIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { questionnaire.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Id_Typ_Txt ********************************************************************************/
		if(q.getQstnaireIdTypTxt() != null ) {

			String[] arrayi0 = q.getQstnaireIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Id_Use ********************************************************************************/
		if(q.getQstnaireIdUse() != null ) {

			String[] arrayi0 = q.getQstnaireIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Id_Vl ********************************************************************************/
		if(q.getQstnaireIdVl() != null ) {

			String[] arrayi0 = q.getQstnaireIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getIdentifier().size() < i0+1) { questionnaire.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Itm_AnsOption_InitialSlcted ********************************************************************************/
		if(q.getQstnaireItmAnsOptionInitialSlcted() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionInitialSlcted().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionInitialSlcted().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).setInitialSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Cd ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgCd() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).getValueCoding().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Dsply ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgDsply() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).getValueCoding().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Sys ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgSys() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).getValueCoding().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).getValueCoding().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlCdg_Vrsn ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlCdgVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).getValueCoding().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlDtTyp ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlDtTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).setValue(new org.hl7.fhir.r4.model.DateType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlIntegerTyp ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlIntegerTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).setValue(new org.hl7.fhir.r4.model.IntegerType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlRfrnc ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlRfrnc() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).setValue(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlStrgTyp ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlStrgTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).setValue(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsOption_VlTimeTyp ********************************************************************************/
		if(q.getQstnaireItmAnsOptionVlTimeTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsOptionVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmAnsOptionVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getAnswerOption().size() < i1+1) { questionnaire.getItem().get(i0).addAnswerOption(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getAnswerOption().get(i1).setValue(new org.hl7.fhir.r4.model.TimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_AnsVlSt ********************************************************************************/
		if(q.getQstnaireItmAnsVlSt() != null ) {

			String[] arrayi0 = q.getQstnaireItmAnsVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setAnswerValueSet(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Itm_Cd_Cd ********************************************************************************/
		if(q.getQstnaireItmCdCd() != null ) {

			String[] arrayi0 = q.getQstnaireItmCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getCode().size() < i1+1) { questionnaire.getItem().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getCode().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Cd_Dsply ********************************************************************************/
		if(q.getQstnaireItmCdDsply() != null ) {

			String[] arrayi0 = q.getQstnaireItmCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getCode().size() < i1+1) { questionnaire.getItem().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getCode().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Cd_Sys ********************************************************************************/
		if(q.getQstnaireItmCdSys() != null ) {

			String[] arrayi0 = q.getQstnaireItmCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getCode().size() < i1+1) { questionnaire.getItem().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getCode().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Cd_UsrSltd ********************************************************************************/
		if(q.getQstnaireItmCdUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireItmCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getCode().size() < i1+1) { questionnaire.getItem().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getCode().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Cd_Vrsn ********************************************************************************/
		if(q.getQstnaireItmCdVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireItmCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getCode().size() < i1+1) { questionnaire.getItem().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getCode().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Dfn ********************************************************************************/
		if(q.getQstnaireItmDfn() != null ) {

			String[] arrayi0 = q.getQstnaireItmDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setDefinition(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Itm_EnableBehavior ********************************************************************************/
		if(q.getQstnaireItmEnableBehavior() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setEnableBehavior(new org.hl7.fhir.r4.model.Questionnaire.EnableWhenBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsBooleanTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsBooleanTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setAnswer(new org.hl7.fhir.r4.model.BooleanType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Cd ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgCd() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerCoding().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Dsply ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgDsply() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerCoding().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Sys ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgSys() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerCoding().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerCoding().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsCdg_Vrsn ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsCdgVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerCoding().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsDtTimeTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsDtTimeTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setAnswer(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsDtTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsDtTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setAnswer(new org.hl7.fhir.r4.model.DateType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsDecimalTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsDecimalTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setAnswer(new org.hl7.fhir.r4.model.DecimalType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsIntegerTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsIntegerTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setAnswer(new org.hl7.fhir.r4.model.IntegerType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Cd ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsQntyCd() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Cmprtr ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsQntyCmprtr() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Sys ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsQntySys() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Unt ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsQntyUnt() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsQnty_Vl ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsQntyVl() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).getAnswerQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsRfrnc ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsRfrnc() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setAnswer(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsStrgTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsStrgTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setAnswer(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_AnsTimeTyp ********************************************************************************/
		if(q.getQstnaireItmEnableWhenAnsTimeTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenAnsTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenAnsTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setAnswer(new org.hl7.fhir.r4.model.TimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_Operator ********************************************************************************/
		if(q.getQstnaireItmEnableWhenOperator() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenOperator().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenOperator().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setOperator(new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemOperatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_EnableWhen_Question ********************************************************************************/
		if(q.getQstnaireItmEnableWhenQuestion() != null ) {

			String[] arrayi0 = q.getQstnaireItmEnableWhenQuestion().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmEnableWhenQuestion().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getEnableWhen().size() < i1+1) { questionnaire.getItem().get(i0).addEnableWhen(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getEnableWhen().get(i1).setQuestion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_CntntTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntCntntTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueAttachment().setContentType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Creation ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntCreation() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueAttachment().setCreation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Data ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntData() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueAttachment().setData(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Hash ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntHash() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueAttachment().setHash(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Lnguage ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntLnguage() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueAttachment().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Sz ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntSz() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueAttachment().setSize(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Ttl ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntTtl() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueAttachment().setTitle(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlAttchmnt_Url ********************************************************************************/
		if(q.getQstnaireItmInitialVlAttchmntUrl() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueAttachment().setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlBooleanTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlBooleanTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Cd ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgCd() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueCoding().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Dsply ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgDsply() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueCoding().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Sys ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgSys() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueCoding().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlCdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueCoding().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlCdg_Vrsn ********************************************************************************/
		if(q.getQstnaireItmInitialVlCdgVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueCoding().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlDtTimeTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlDtTimeTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlDtTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlDtTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).setValue(new org.hl7.fhir.r4.model.DateType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlDecimalTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlDecimalTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).setValue(new org.hl7.fhir.r4.model.DecimalType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlIntegerTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlIntegerTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).setValue(new org.hl7.fhir.r4.model.IntegerType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlQnty_Cd ********************************************************************************/
		if(q.getQstnaireItmInitialVlQntyCd() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlQnty_Cmprtr ********************************************************************************/
		if(q.getQstnaireItmInitialVlQntyCmprtr() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlQnty_Sys ********************************************************************************/
		if(q.getQstnaireItmInitialVlQntySys() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlQnty_Unt ********************************************************************************/
		if(q.getQstnaireItmInitialVlQntyUnt() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlQnty_Vl ********************************************************************************/
		if(q.getQstnaireItmInitialVlQntyVl() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).getValueQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlRfrnc ********************************************************************************/
		if(q.getQstnaireItmInitialVlRfrnc() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).setValue(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlStrgTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlStrgTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).setValue(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlTimeTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlTimeTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).setValue(new org.hl7.fhir.r4.model.TimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_Initial_VlUriTyp ********************************************************************************/
		if(q.getQstnaireItmInitialVlUriTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmInitialVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				String[] arrayi1 = q.getQstnaireItmInitialVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getItem().get(i0).getInitial().size() < i1+1) { questionnaire.getItem().get(i0).addInitial(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getItem().get(i0).getInitial().get(i1).setValue(new org.hl7.fhir.r4.model.UriType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Itm_LinkId ********************************************************************************/
		if(q.getQstnaireItmLinkId() != null ) {

			String[] arrayi0 = q.getQstnaireItmLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setLinkId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Itm_MxLength ********************************************************************************/
		if(q.getQstnaireItmMxLength() != null ) {

			String[] arrayi0 = q.getQstnaireItmMxLength().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setMaxLength(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Itm_Prefix ********************************************************************************/
		if(q.getQstnaireItmPrefix() != null ) {

			String[] arrayi0 = q.getQstnaireItmPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setPrefix(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Itm_ReadOnly ********************************************************************************/
		if(q.getQstnaireItmReadOnly() != null ) {

			String[] arrayi0 = q.getQstnaireItmReadOnly().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setReadOnly(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Itm_Rpts ********************************************************************************/
		if(q.getQstnaireItmRpts() != null ) {

			String[] arrayi0 = q.getQstnaireItmRpts().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setRepeats(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Itm_Required ********************************************************************************/
		if(q.getQstnaireItmRequired() != null ) {

			String[] arrayi0 = q.getQstnaireItmRequired().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setRequired(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Itm_Txt ********************************************************************************/
		if(q.getQstnaireItmTxt() != null ) {

			String[] arrayi0 = q.getQstnaireItmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_Itm_Typ ********************************************************************************/
		if(q.getQstnaireItmTyp() != null ) {

			String[] arrayi0 = q.getQstnaireItmTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getItem().size() < i0+1) { questionnaire.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getItem().get(i0).setType(new org.hl7.fhir.r4.model.Questionnaire.QuestionnaireItemTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgCd() != null ) {

			String[] arrayi0 = q.getQstnaireJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getJurisdiction().size() < i0+1) { questionnaire.addJurisdiction(); }
				String[] arrayi1 = q.getQstnaireJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getJurisdiction().get(i0).getCoding().size() < i1+1) { questionnaire.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = q.getQstnaireJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getJurisdiction().size() < i0+1) { questionnaire.addJurisdiction(); }
				String[] arrayi1 = q.getQstnaireJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getJurisdiction().get(i0).getCoding().size() < i1+1) { questionnaire.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgSys() != null ) {

			String[] arrayi0 = q.getQstnaireJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getJurisdiction().size() < i0+1) { questionnaire.addJurisdiction(); }
				String[] arrayi1 = q.getQstnaireJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getJurisdiction().get(i0).getCoding().size() < i1+1) { questionnaire.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getJurisdiction().size() < i0+1) { questionnaire.addJurisdiction(); }
				String[] arrayi1 = q.getQstnaireJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getJurisdiction().get(i0).getCoding().size() < i1+1) { questionnaire.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(q.getQstnaireJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getJurisdiction().size() < i0+1) { questionnaire.addJurisdiction(); }
				String[] arrayi1 = q.getQstnaireJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getJurisdiction().get(i0).getCoding().size() < i1+1) { questionnaire.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_Jrsdctn_Txt ********************************************************************************/
		if(q.getQstnaireJrsdctnTxt() != null ) {

			String[] arrayi0 = q.getQstnaireJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getJurisdiction().size() < i0+1) { questionnaire.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_LastReviewDt ********************************************************************************/
		if(q.getQstnaireLastReviewDt() != null ) {

			if(q.getQstnaireLastReviewDt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireLastReviewDt()==null) {} else {
			questionnaire.setLastReviewDate(q.getQstnaireLastReviewDt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(q.getQstnaireLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Qstnaire_Nm ********************************************************************************/
		if(q.getQstnaireNm() != null ) {

			if(q.getQstnaireNm().replace("[","").replace("]","").equals("NULL") | q.getQstnaireNm()==null) {} else {
			questionnaire.setName(q.getQstnaireNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Qstnaire_Pblshr ********************************************************************************/
		if(q.getQstnairePblshr() != null ) {

			if(q.getQstnairePblshr().replace("[","").replace("]","").equals("NULL") | q.getQstnairePblshr()==null) {} else {
			questionnaire.setPublisher(q.getQstnairePblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Qstnaire_Prpse ********************************************************************************/
		if(q.getQstnairePrpse() != null ) {

			if(q.getQstnairePrpse().replace("[","").replace("]","").equals("NULL") | q.getQstnairePrpse()==null) {} else {
			questionnaire.setPurpose(q.getQstnairePrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Qstnaire_Sts ********************************************************************************/
		if(q.getQstnaireSts() != null ) {

			if(q.getQstnaireSts().replace("[","").replace("]","").equals("NULL") | q.getQstnaireSts()==null) {} else {
			questionnaire.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(q.getQstnaireSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** Qstnaire_SbjctTyp ********************************************************************************/
		if(q.getQstnaireSbjctTyp() != null ) {

				for( String currListStrSplit : q.getQstnaireSbjctTyp().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			questionnaire.addSubjectType(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** Qstnaire_Ttl ********************************************************************************/
		if(q.getQstnaireTtl() != null ) {

			if(q.getQstnaireTtl().replace("[","").replace("]","").equals("NULL") | q.getQstnaireTtl()==null) {} else {
			questionnaire.setTitle(q.getQstnaireTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Qstnaire_Url ********************************************************************************/
		if(q.getQstnaireUrl() != null ) {

			if(q.getQstnaireUrl().replace("[","").replace("]","").equals("NULL") | q.getQstnaireUrl()==null) {} else {
			questionnaire.setUrl(q.getQstnaireUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** Qstnaire_UseCntxt_Cd_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtCdCd() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_Cd_Dsply ********************************************************************************/
		if(q.getQstnaireUseCntxtCdDsply() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_Cd_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtCdSys() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(q.getQstnaireUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(q.getQstnaireUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				String[] arrayi1 = q.getQstnaireUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { questionnaire.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				String[] arrayi1 = q.getQstnaireUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { questionnaire.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				String[] arrayi1 = q.getQstnaireUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { questionnaire.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				String[] arrayi1 = q.getQstnaireUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { questionnaire.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				String[] arrayi1 = q.getQstnaireUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { questionnaire.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaire.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** Qstnaire_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(q.getQstnaireUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(q.getQstnaireUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(q.getQstnaireUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(q.getQstnaireUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** Qstnaire_UseCntxt_VlRfrnc ********************************************************************************/
		if(q.getQstnaireUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = q.getQstnaireUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaire.getUseContext().size() < i0+1) { questionnaire.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaire.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** Qstnaire_Vrsn ********************************************************************************/
		if(q.getQstnaireVrsn() != null ) {

			if(q.getQstnaireVrsn().replace("[","").replace("]","").equals("NULL") | q.getQstnaireVrsn()==null) {} else {
			questionnaire.setVersion(q.getQstnaireVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return questionnaire;
	}
}
