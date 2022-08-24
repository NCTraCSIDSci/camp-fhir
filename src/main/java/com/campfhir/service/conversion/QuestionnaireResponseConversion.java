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
		if(q.getQstnaireRspsAthr() != null ) {

			if(q.getQstnaireRspsAthr().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsAthr()==null) {} else {
			questionnaireresponse.setAuthor(new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsAthr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** QstnaireRsps_Athred ********************************************************************************/
		if(q.getQstnaireRspsAthred() != null ) {

			if(q.getQstnaireRspsAthred().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsAthred()==null) {} else {
			questionnaireresponse.setAuthored(q.getQstnaireRspsAthred().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsAthred()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(q.getQstnaireRspsAthred().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** QstnaireRsps_BasedOn ********************************************************************************/
		if(q.getQstnaireRspsBasedOn() != null ) {

				for( String currListStrSplit : q.getQstnaireRspsBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			questionnaireresponse.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** QstnaireRsps_Enc ********************************************************************************/
		if(q.getQstnaireRspsEnc() != null ) {

			if(q.getQstnaireRspsEnc().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsEnc()==null) {} else {
			questionnaireresponse.setEncounter(new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** QstnaireRsps_Id_Assigner ********************************************************************************/
		if(q.getQstnaireRspsIdAssigner() != null ) {

			if(q.getQstnaireRspsIdAssigner().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsIdAssigner()==null) {} else {
			questionnaireresponse.getIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** QstnaireRsps_Id_Prd_End ********************************************************************************/
		if(q.getQstnaireRspsIdPrdEnd() != null ) {

			if(q.getQstnaireRspsIdPrdEnd().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsIdPrdEnd()==null) {} else {
			questionnaireresponse.getIdentifier().getPeriod().setEnd(q.getQstnaireRspsIdPrdEnd().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(q.getQstnaireRspsIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** QstnaireRsps_Id_Prd_Strt ********************************************************************************/
		if(q.getQstnaireRspsIdPrdStrt() != null ) {

			if(q.getQstnaireRspsIdPrdStrt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsIdPrdStrt()==null) {} else {
			questionnaireresponse.getIdentifier().getPeriod().setStart(q.getQstnaireRspsIdPrdStrt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(q.getQstnaireRspsIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** QstnaireRsps_Id_Sys ********************************************************************************/
		if(q.getQstnaireRspsIdSys() != null ) {

			if(q.getQstnaireRspsIdSys().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsIdSys()==null) {} else {
			questionnaireresponse.getIdentifier().setSystem(q.getQstnaireRspsIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Cd ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgCd() != null ) {

			String[] arrayi0 = q.getQstnaireRspsIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getIdentifier().getType().getCoding().size() < i0+1) { questionnaireresponse.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaireresponse.getIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgDsply() != null ) {

			String[] arrayi0 = q.getQstnaireRspsIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getIdentifier().getType().getCoding().size() < i0+1) { questionnaireresponse.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaireresponse.getIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Sys ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgSys() != null ) {

			String[] arrayi0 = q.getQstnaireRspsIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getIdentifier().getType().getCoding().size() < i0+1) { questionnaireresponse.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaireresponse.getIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** QstnaireRsps_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireRspsIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getIdentifier().getType().getCoding().size() < i0+1) { questionnaireresponse.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaireresponse.getIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** QstnaireRsps_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(q.getQstnaireRspsIdTypCdgVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireRspsIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getIdentifier().getType().getCoding().size() < i0+1) { questionnaireresponse.getIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaireresponse.getIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** QstnaireRsps_Id_Typ_Txt ********************************************************************************/
		if(q.getQstnaireRspsIdTypTxt() != null ) {

			if(q.getQstnaireRspsIdTypTxt().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsIdTypTxt()==null) {} else {
			questionnaireresponse.getIdentifier().getType().setText(q.getQstnaireRspsIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** QstnaireRsps_Id_Use ********************************************************************************/
		if(q.getQstnaireRspsIdUse() != null ) {

			if(q.getQstnaireRspsIdUse().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsIdUse()==null) {} else {
			questionnaireresponse.getIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(q.getQstnaireRspsIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** QstnaireRsps_Id_Vl ********************************************************************************/
		if(q.getQstnaireRspsIdVl() != null ) {

			if(q.getQstnaireRspsIdVl().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsIdVl()==null) {} else {
			questionnaireresponse.getIdentifier().setValue(q.getQstnaireRspsIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_CntntTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntCntntTyp() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlAttchmntCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueAttachment().setContentType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Creation ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntCreation() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlAttchmntCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueAttachment().setCreation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Data ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntData() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlAttchmntData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueAttachment().setData(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Hash ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntHash() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlAttchmntHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueAttachment().setHash(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Lnguage ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntLnguage() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlAttchmntLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueAttachment().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Sz ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntSz() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlAttchmntSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueAttachment().setSize(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Ttl ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntTtl() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlAttchmntTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueAttachment().setTitle(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlAttchmnt_Url ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlAttchmntUrl() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlAttchmntUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueAttachment().setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlBooleanTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlBooleanTyp() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlBooleanTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.BooleanType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Cd ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgCd() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueCoding().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Dsply ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgDsply() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueCoding().setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Sys ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgSys() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueCoding().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_UsrSltd ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgUsrSltd() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueCoding().setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlCdg_Vrsn ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlCdgVrsn() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueCoding().setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlDtTimeTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlDtTimeTyp() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlDtTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlDtTyp() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.DateType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlDecimalTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlDecimalTyp() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlDecimalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.DecimalType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlIntegerTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlIntegerTyp() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlIntegerTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.IntegerType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlQnty_Cd ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlQntyCd() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueQuantity().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlQnty_Cmprtr ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlQntyCmprtr() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlQnty_Sys ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlQntySys() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueQuantity().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlQnty_Unt ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlQntyUnt() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueQuantity().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlQnty_Vl ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlQntyVl() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).getValueQuantity().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlRfrnc ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlRfrnc() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlStrgTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlStrgTyp() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.StringType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlTimeTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlTimeTyp() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.TimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Ans_VlUriTyp ********************************************************************************/
		if(q.getQstnaireRspsItmAnsVlUriTyp() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmAnsVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				String[] arrayi1 = q.getQstnaireRspsItmAnsVlUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(questionnaireresponse.getItem().get(i0).getAnswer().size() < i1+1) { questionnaireresponse.getItem().get(i0).addAnswer(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {questionnaireresponse.getItem().get(i0).getAnswer().get(i1).setValue(new org.hl7.fhir.r4.model.UriType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** QstnaireRsps_Itm_Dfn ********************************************************************************/
		if(q.getQstnaireRspsItmDfn() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmDfn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaireresponse.getItem().get(i0).setDefinition(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** QstnaireRsps_Itm_LinkId ********************************************************************************/
		if(q.getQstnaireRspsItmLinkId() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmLinkId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaireresponse.getItem().get(i0).setLinkId(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** QstnaireRsps_Itm_Txt ********************************************************************************/
		if(q.getQstnaireRspsItmTxt() != null ) {

			String[] arrayi0 = q.getQstnaireRspsItmTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(questionnaireresponse.getItem().size() < i0+1) { questionnaireresponse.addItem(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {questionnaireresponse.getItem().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** QstnaireRsps_PartOf ********************************************************************************/
		if(q.getQstnaireRspsPartOf() != null ) {

				for( String currListStrSplit : q.getQstnaireRspsPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			questionnaireresponse.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** QstnaireRsps_Qstnaire ********************************************************************************/
		if(q.getQstnaireRspsQstnaire() != null ) {

			if(q.getQstnaireRspsQstnaire().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsQstnaire()==null) {} else {
			questionnaireresponse.setQuestionnaire(q.getQstnaireRspsQstnaire().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** QstnaireRsps_Src ********************************************************************************/
		if(q.getQstnaireRspsSrc() != null ) {

			if(q.getQstnaireRspsSrc().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsSrc()==null) {} else {
			questionnaireresponse.setSource(new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsSrc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** QstnaireRsps_Sts ********************************************************************************/
		if(q.getQstnaireRspsSts() != null ) {

			if(q.getQstnaireRspsSts().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsSts()==null) {} else {
			questionnaireresponse.setStatus(new org.hl7.fhir.r4.model.QuestionnaireResponse.QuestionnaireResponseStatusEnumFactory().fromCode(q.getQstnaireRspsSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** QstnaireRsps_Sbjct ********************************************************************************/
		if(q.getQstnaireRspsSbjct() != null ) {

			if(q.getQstnaireRspsSbjct().replace("[","").replace("]","").equals("NULL") | q.getQstnaireRspsSbjct()==null) {} else {
			questionnaireresponse.setSubject(new org.hl7.fhir.r4.model.Reference(q.getQstnaireRspsSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return questionnaireresponse;
	}
}
