package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.RequestGroup;
public class RequestGroupConversion 
{
	public org.hl7.fhir.r4.model.RequestGroup RequestGroups(RequestGroup r) throws ParseException
	{
		org.hl7.fhir.r4.model.RequestGroup requestgroup = new org.hl7.fhir.r4.model.RequestGroup();

		/******************** id ********************************************************************************/
		requestgroup.setId(r.getId());

		/******************** RqstGrp_Actn_CardinalityBehavior ********************************************************************************/
		if(r.getRqstGrpActnCardinalityBehavior() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCardinalityBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setCardinalityBehavior(new org.hl7.fhir.r4.model.RequestGroup.ActionCardinalityBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpActnCdCdgCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCode().size() < i1+1) { requestgroup.getAction().get(i0).addCode(); }
					String[] arrayi2 = r.getRqstGrpActnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(requestgroup.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { requestgroup.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {requestgroup.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RqstGrp_Actn_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpActnCdCdgDsply() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCode().size() < i1+1) { requestgroup.getAction().get(i0).addCode(); }
					String[] arrayi2 = r.getRqstGrpActnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(requestgroup.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { requestgroup.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {requestgroup.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RqstGrp_Actn_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpActnCdCdgSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCode().size() < i1+1) { requestgroup.getAction().get(i0).addCode(); }
					String[] arrayi2 = r.getRqstGrpActnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(requestgroup.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { requestgroup.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {requestgroup.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RqstGrp_Actn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpActnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCode().size() < i1+1) { requestgroup.getAction().get(i0).addCode(); }
					String[] arrayi2 = r.getRqstGrpActnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(requestgroup.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { requestgroup.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {requestgroup.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** RqstGrp_Actn_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpActnCdCdgVrsn() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCode().size() < i1+1) { requestgroup.getAction().get(i0).addCode(); }
					String[] arrayi2 = r.getRqstGrpActnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(requestgroup.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { requestgroup.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {requestgroup.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** RqstGrp_Actn_Cd_Txt ********************************************************************************/
		if(r.getRqstGrpActnCdTxt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCode().size() < i1+1) { requestgroup.getAction().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Dscrptn ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnDscrptn() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCndtnExprsnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCndtnExprsnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCondition().size() < i1+1) { requestgroup.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getCondition().get(i1).getExpression().setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Exprsn ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnExprsn() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCndtnExprsnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCndtnExprsnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCondition().size() < i1+1) { requestgroup.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getCondition().get(i1).getExpression().setExpression(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Lnguage ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnLnguage() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCndtnExprsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCndtnExprsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCondition().size() < i1+1) { requestgroup.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getCondition().get(i1).getExpression().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Nm ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnNm() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCndtnExprsnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCndtnExprsnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCondition().size() < i1+1) { requestgroup.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getCondition().get(i1).getExpression().setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Cndtn_Exprsn_Rfrnc ********************************************************************************/
		if(r.getRqstGrpActnCndtnExprsnRfrnc() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCndtnExprsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCndtnExprsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCondition().size() < i1+1) { requestgroup.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getCondition().get(i1).getExpression().setReference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Cndtn_Kind ********************************************************************************/
		if(r.getRqstGrpActnCndtnKind() != null ) {

			String[] arrayi0 = r.getRqstGrpActnCndtnKind().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnCndtnKind().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getCondition().size() < i1+1) { requestgroup.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getCondition().get(i1).setKind(new org.hl7.fhir.r4.model.RequestGroup.ActionConditionKindEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_Dscrptn ********************************************************************************/
		if(r.getRqstGrpActnDscrptn() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_Docation_Citation ********************************************************************************/
		if(r.getRqstGrpActnDocationCitation() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).setCitation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Dsply ********************************************************************************/
		if(r.getRqstGrpActnDocationDsply() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Doc_CntntTyp ********************************************************************************/
		if(r.getRqstGrpActnDocationDocCntntTyp() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).getDocument().setContentType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Doc_Creation ********************************************************************************/
		if(r.getRqstGrpActnDocationDocCreation() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).getDocument().setCreation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Doc_Data ********************************************************************************/
		if(r.getRqstGrpActnDocationDocData() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).getDocument().setData(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Doc_Hash ********************************************************************************/
		if(r.getRqstGrpActnDocationDocHash() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).getDocument().setHash(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Doc_Lnguage ********************************************************************************/
		if(r.getRqstGrpActnDocationDocLnguage() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).getDocument().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Doc_Sz ********************************************************************************/
		if(r.getRqstGrpActnDocationDocSz() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).getDocument().setSize(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Doc_Ttl ********************************************************************************/
		if(r.getRqstGrpActnDocationDocTtl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).getDocument().setTitle(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Doc_Url ********************************************************************************/
		if(r.getRqstGrpActnDocationDocUrl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).getDocument().setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Lbl ********************************************************************************/
		if(r.getRqstGrpActnDocationLbl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).setLabel(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Rsrc ********************************************************************************/
		if(r.getRqstGrpActnDocationRsrc() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).setResource(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Typ ********************************************************************************/
		if(r.getRqstGrpActnDocationTyp() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_Docation_Url ********************************************************************************/
		if(r.getRqstGrpActnDocationUrl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnDocationUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnDocationUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getDocumentation().size() < i1+1) { requestgroup.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getDocumentation().get(i1).setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_GrpingBehavior ********************************************************************************/
		if(r.getRqstGrpActnGrpingBehavior() != null ) {

			String[] arrayi0 = r.getRqstGrpActnGrpingBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setGroupingBehavior(new org.hl7.fhir.r4.model.RequestGroup.ActionGroupingBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_Prtcpnt ********************************************************************************/
		if(r.getRqstGrpActnPrtcpnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnPrtcpnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {requestgroup.getAction().get(i0).addParticipant(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_PrecheckBehavior ********************************************************************************/
		if(r.getRqstGrpActnPrecheckBehavior() != null ) {

			String[] arrayi0 = r.getRqstGrpActnPrecheckBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setPrecheckBehavior(new org.hl7.fhir.r4.model.RequestGroup.ActionPrecheckBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_Prefix ********************************************************************************/
		if(r.getRqstGrpActnPrefix() != null ) {

			String[] arrayi0 = r.getRqstGrpActnPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setPrefix(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_Priority ********************************************************************************/
		if(r.getRqstGrpActnPriority() != null ) {

			String[] arrayi0 = r.getRqstGrpActnPriority().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setPriority(new org.hl7.fhir.r4.model.RequestGroup.RequestPriorityEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_RltedActn_ActnId ********************************************************************************/
		if(r.getRqstGrpActnRltedActnActnId() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnActnId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnActnId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).setActionId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffDuration_Cd ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffDurationCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffDuration_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffDurationCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffDuration_Sys ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffDurationSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffDuration_Unt ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffDurationUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffDuration_Vl ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffDurationVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Cd ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngHiCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Sys ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngHiSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Unt ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngHiUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Hi_Vl ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngHiVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Cd ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngLwCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Sys ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngLwSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Unt ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngLwUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_OffRng_Lw_Vl ********************************************************************************/
		if(r.getRqstGrpActnRltedActnOffRngLwVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnOffRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnOffRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** RqstGrp_Actn_RltedActn_Rltnship ********************************************************************************/
		if(r.getRqstGrpActnRltedActnRltnship() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRltedActnRltnship().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnRltedActnRltnship().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getRelatedAction().size() < i1+1) { requestgroup.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getRelatedAction().get(i1).setRelationship(new org.hl7.fhir.r4.model.RequestGroup.ActionRelationshipTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_RequiredBehavior ********************************************************************************/
		if(r.getRqstGrpActnRequiredBehavior() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRequiredBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setRequiredBehavior(new org.hl7.fhir.r4.model.RequestGroup.ActionRequiredBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_Rsrc ********************************************************************************/
		if(r.getRqstGrpActnRsrc() != null ) {

			String[] arrayi0 = r.getRqstGrpActnRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setResource(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_SelectionBehavior ********************************************************************************/
		if(r.getRqstGrpActnSelectionBehavior() != null ) {

			String[] arrayi0 = r.getRqstGrpActnSelectionBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setSelectionBehavior(new org.hl7.fhir.r4.model.RequestGroup.ActionSelectionBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TxtEquivalent ********************************************************************************/
		if(r.getRqstGrpActnTxtEquivalent() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTxtEquivalent().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setTextEquivalent(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgAge_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgAgeCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgAgeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingAge().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgAge_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnTmgAgeCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgAgeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgAge_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgAgeSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgAgeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingAge().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgAge_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgAgeUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgAgeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingAge().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgAge_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgAgeVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgAgeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingAge().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgDtTimeTyp ********************************************************************************/
		if(r.getRqstGrpActnTmgDtTimeTyp() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setTiming(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgDuration_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgDurationCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgDuration_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnTmgDurationCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgDuration_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgDurationSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgDuration_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgDurationUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgDuration_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgDurationVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgPrd_End ********************************************************************************/
		if(r.getRqstGrpActnTmgPrdEnd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgPrd_Strt ********************************************************************************/
		if(r.getRqstGrpActnTmgPrdStrt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Hi_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgRngHiCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnTmgRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Hi_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgRngHiSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Hi_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgRngHiUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Hi_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgRngHiVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Lw_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgRngLwCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnTmgRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Lw_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgRngLwSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Lw_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgRngLwUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgRng_Lw_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgRngLwVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Cd_Txt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgCdTxt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Evnt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgEvnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptCnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptCntMx() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptDuration() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptDurationMx() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_DurationUnt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptDurationUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptFrqncy() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Off ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptOff() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptPrd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptPrdMx() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_PrdUnt ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptPrdUnt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Actn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(r.getRqstGrpActnTmgTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTmgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {requestgroup.getAction().get(i0).getTimingTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Ttl ********************************************************************************/
		if(r.getRqstGrpActnTtl() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpActnTypCdgCd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpActnTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpActnTypCdgSys() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpActnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpActnTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				String[] arrayi1 = r.getRqstGrpActnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getAction().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getAction().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Actn_Typ_Txt ********************************************************************************/
		if(r.getRqstGrpActnTypTxt() != null ) {

			String[] arrayi0 = r.getRqstGrpActnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getAction().size() < i0+1) { requestgroup.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getAction().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Athr ********************************************************************************/
		if(r.getRqstGrpAthr() != null ) {

			if(r.getRqstGrpAthr().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpAthr()==null) {} else {
			requestgroup.setAuthor(new org.hl7.fhir.r4.model.Reference(r.getRqstGrpAthr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_AthredOn ********************************************************************************/
		if(r.getRqstGrpAthredOn() != null ) {

			if(r.getRqstGrpAthredOn().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpAthredOn()==null) {} else {
			requestgroup.setAuthoredOn(r.getRqstGrpAthredOn().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpAthredOn()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRqstGrpAthredOn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_BasedOn ********************************************************************************/
		if(r.getRqstGrpBasedOn() != null ) {

				for( String currListStrSplit : r.getRqstGrpBasedOn().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			requestgroup.addBasedOn(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** RqstGrp_Cd_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpCdCdgCd() != null ) {

			String[] arrayi0 = r.getRqstGrpCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getCode().getCoding().size() < i0+1) { requestgroup.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Cd_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpCdCdgDsply() != null ) {

			String[] arrayi0 = r.getRqstGrpCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getCode().getCoding().size() < i0+1) { requestgroup.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Cd_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpCdCdgSys() != null ) {

			String[] arrayi0 = r.getRqstGrpCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getCode().getCoding().size() < i0+1) { requestgroup.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Cd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpCdCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRqstGrpCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getCode().getCoding().size() < i0+1) { requestgroup.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Cd_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpCdCdgVrsn() != null ) {

			String[] arrayi0 = r.getRqstGrpCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getCode().getCoding().size() < i0+1) { requestgroup.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Cd_Txt ********************************************************************************/
		if(r.getRqstGrpCdTxt() != null ) {

			if(r.getRqstGrpCdTxt().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpCdTxt()==null) {} else {
			requestgroup.getCode().setText(r.getRqstGrpCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RqstGrp_Enc ********************************************************************************/
		if(r.getRqstGrpEnc() != null ) {

			if(r.getRqstGrpEnc().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpEnc()==null) {} else {
			requestgroup.setEncounter(new org.hl7.fhir.r4.model.Reference(r.getRqstGrpEnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_GrpId_Assigner ********************************************************************************/
		if(r.getRqstGrpGrpIdAssigner() != null ) {

			if(r.getRqstGrpGrpIdAssigner().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpGrpIdAssigner()==null) {} else {
			requestgroup.getGroupIdentifier().setAssigner(new org.hl7.fhir.r4.model.Reference(r.getRqstGrpGrpIdAssigner().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_GrpId_Prd_End ********************************************************************************/
		if(r.getRqstGrpGrpIdPrdEnd() != null ) {

			if(r.getRqstGrpGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpGrpIdPrdEnd()==null) {} else {
			requestgroup.getGroupIdentifier().getPeriod().setEnd(r.getRqstGrpGrpIdPrdEnd().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpGrpIdPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRqstGrpGrpIdPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_GrpId_Prd_Strt ********************************************************************************/
		if(r.getRqstGrpGrpIdPrdStrt() != null ) {

			if(r.getRqstGrpGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpGrpIdPrdStrt()==null) {} else {
			requestgroup.getGroupIdentifier().getPeriod().setStart(r.getRqstGrpGrpIdPrdStrt().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpGrpIdPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(r.getRqstGrpGrpIdPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_GrpId_Sys ********************************************************************************/
		if(r.getRqstGrpGrpIdSys() != null ) {

			if(r.getRqstGrpGrpIdSys().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpGrpIdSys()==null) {} else {
			requestgroup.getGroupIdentifier().setSystem(r.getRqstGrpGrpIdSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgCd() != null ) {

			String[] arrayi0 = r.getRqstGrpGrpIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getGroupIdentifier().getType().getCoding().size() < i0+1) { requestgroup.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getGroupIdentifier().getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRqstGrpGrpIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getGroupIdentifier().getType().getCoding().size() < i0+1) { requestgroup.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getGroupIdentifier().getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgSys() != null ) {

			String[] arrayi0 = r.getRqstGrpGrpIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getGroupIdentifier().getType().getCoding().size() < i0+1) { requestgroup.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getGroupIdentifier().getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_GrpId_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRqstGrpGrpIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getGroupIdentifier().getType().getCoding().size() < i0+1) { requestgroup.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getGroupIdentifier().getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_GrpId_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpGrpIdTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRqstGrpGrpIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getGroupIdentifier().getType().getCoding().size() < i0+1) { requestgroup.getGroupIdentifier().getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getGroupIdentifier().getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_GrpId_Typ_Txt ********************************************************************************/
		if(r.getRqstGrpGrpIdTypTxt() != null ) {

			if(r.getRqstGrpGrpIdTypTxt().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpGrpIdTypTxt()==null) {} else {
			requestgroup.getGroupIdentifier().getType().setText(r.getRqstGrpGrpIdTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RqstGrp_GrpId_Use ********************************************************************************/
		if(r.getRqstGrpGrpIdUse() != null ) {

			if(r.getRqstGrpGrpIdUse().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpGrpIdUse()==null) {} else {
			requestgroup.getGroupIdentifier().setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(r.getRqstGrpGrpIdUse().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_GrpId_Vl ********************************************************************************/
		if(r.getRqstGrpGrpIdVl() != null ) {

			if(r.getRqstGrpGrpIdVl().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpGrpIdVl()==null) {} else {
			requestgroup.getGroupIdentifier().setValue(r.getRqstGrpGrpIdVl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** RqstGrp_Id_Assigner ********************************************************************************/
		if(r.getRqstGrpIdAssigner() != null ) {

			String[] arrayi0 = r.getRqstGrpIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Id_Prd_End ********************************************************************************/
		if(r.getRqstGrpIdPrdEnd() != null ) {

			String[] arrayi0 = r.getRqstGrpIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Id_Prd_Strt ********************************************************************************/
		if(r.getRqstGrpIdPrdStrt() != null ) {

			String[] arrayi0 = r.getRqstGrpIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Id_Sys ********************************************************************************/
		if(r.getRqstGrpIdSys() != null ) {

			String[] arrayi0 = r.getRqstGrpIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Id_Typ_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpIdTypCdgCd() != null ) {

			String[] arrayi0 = r.getRqstGrpIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				String[] arrayi1 = r.getRqstGrpIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpIdTypCdgDsply() != null ) {

			String[] arrayi0 = r.getRqstGrpIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				String[] arrayi1 = r.getRqstGrpIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Id_Typ_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpIdTypCdgSys() != null ) {

			String[] arrayi0 = r.getRqstGrpIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				String[] arrayi1 = r.getRqstGrpIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRqstGrpIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				String[] arrayi1 = r.getRqstGrpIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpIdTypCdgVrsn() != null ) {

			String[] arrayi0 = r.getRqstGrpIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				String[] arrayi1 = r.getRqstGrpIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { requestgroup.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_Id_Typ_Txt ********************************************************************************/
		if(r.getRqstGrpIdTypTxt() != null ) {

			String[] arrayi0 = r.getRqstGrpIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Id_Use ********************************************************************************/
		if(r.getRqstGrpIdUse() != null ) {

			String[] arrayi0 = r.getRqstGrpIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Id_Vl ********************************************************************************/
		if(r.getRqstGrpIdVl() != null ) {

			String[] arrayi0 = r.getRqstGrpIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getIdentifier().size() < i0+1) { requestgroup.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_InstantiatesCanonical ********************************************************************************/
		if(r.getRqstGrpInstantiatesCanonical() != null ) {

				for( String currListStrSplit : r.getRqstGrpInstantiatesCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			requestgroup.addInstantiatesCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** RqstGrp_InstantiatesUri ********************************************************************************/
		if(r.getRqstGrpInstantiatesUri() != null ) {

				for( String currListStrSplit : r.getRqstGrpInstantiatesUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			requestgroup.addInstantiatesUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** RqstGrp_Intent ********************************************************************************/
		if(r.getRqstGrpIntent() != null ) {

			if(r.getRqstGrpIntent().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpIntent()==null) {} else {
			requestgroup.setIntent(new org.hl7.fhir.r4.model.RequestGroup.RequestIntentEnumFactory().fromCode(r.getRqstGrpIntent().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_Nt_AthrRfrnc ********************************************************************************/
		if(r.getRqstGrpNtAthrRfrnc() != null ) {

			String[] arrayi0 = r.getRqstGrpNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getNote().size() < i0+1) { requestgroup.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Nt_AthrStrgTyp ********************************************************************************/
		if(r.getRqstGrpNtAthrStrgTyp() != null ) {

			String[] arrayi0 = r.getRqstGrpNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getNote().size() < i0+1) { requestgroup.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Nt_Txt ********************************************************************************/
		if(r.getRqstGrpNtTxt() != null ) {

			String[] arrayi0 = r.getRqstGrpNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getNote().size() < i0+1) { requestgroup.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_Nt_Time ********************************************************************************/
		if(r.getRqstGrpNtTime() != null ) {

			String[] arrayi0 = r.getRqstGrpNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getNote().size() < i0+1) { requestgroup.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** RqstGrp_Priority ********************************************************************************/
		if(r.getRqstGrpPriority() != null ) {

			if(r.getRqstGrpPriority().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpPriority()==null) {} else {
			requestgroup.setPriority(new org.hl7.fhir.r4.model.RequestGroup.RequestPriorityEnumFactory().fromCode(r.getRqstGrpPriority().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_RsnCd_Cdg_Cd ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgCd() != null ) {

			String[] arrayi0 = r.getRqstGrpRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getReasonCode().size() < i0+1) { requestgroup.addReasonCode(); }
				String[] arrayi1 = r.getRqstGrpRsnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getReasonCode().get(i0).getCoding().size() < i1+1) { requestgroup.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getReasonCode().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_RsnCd_Cdg_Dsply ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgDsply() != null ) {

			String[] arrayi0 = r.getRqstGrpRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getReasonCode().size() < i0+1) { requestgroup.addReasonCode(); }
				String[] arrayi1 = r.getRqstGrpRsnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getReasonCode().get(i0).getCoding().size() < i1+1) { requestgroup.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getReasonCode().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_RsnCd_Cdg_Sys ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgSys() != null ) {

			String[] arrayi0 = r.getRqstGrpRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getReasonCode().size() < i0+1) { requestgroup.addReasonCode(); }
				String[] arrayi1 = r.getRqstGrpRsnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getReasonCode().get(i0).getCoding().size() < i1+1) { requestgroup.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getReasonCode().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_RsnCd_Cdg_UsrSltd ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = r.getRqstGrpRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getReasonCode().size() < i0+1) { requestgroup.addReasonCode(); }
				String[] arrayi1 = r.getRqstGrpRsnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getReasonCode().get(i0).getCoding().size() < i1+1) { requestgroup.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getReasonCode().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** RqstGrp_RsnCd_Cdg_Vrsn ********************************************************************************/
		if(r.getRqstGrpRsnCdCdgVrsn() != null ) {

			String[] arrayi0 = r.getRqstGrpRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getReasonCode().size() < i0+1) { requestgroup.addReasonCode(); }
				String[] arrayi1 = r.getRqstGrpRsnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(requestgroup.getReasonCode().get(i0).getCoding().size() < i1+1) { requestgroup.getReasonCode().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {requestgroup.getReasonCode().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** RqstGrp_RsnCd_Txt ********************************************************************************/
		if(r.getRqstGrpRsnCdTxt() != null ) {

			String[] arrayi0 = r.getRqstGrpRsnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(requestgroup.getReasonCode().size() < i0+1) { requestgroup.addReasonCode(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {requestgroup.getReasonCode().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** RqstGrp_RsnRfrnc ********************************************************************************/
		if(r.getRqstGrpRsnRfrnc() != null ) {

				for( String currListStrSplit : r.getRqstGrpRsnRfrnc().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			requestgroup.addReasonReference(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** RqstGrp_Replaces ********************************************************************************/
		if(r.getRqstGrpReplaces() != null ) {

				for( String currListStrSplit : r.getRqstGrpReplaces().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			requestgroup.addReplaces(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** RqstGrp_Sts ********************************************************************************/
		if(r.getRqstGrpSts() != null ) {

			if(r.getRqstGrpSts().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpSts()==null) {} else {
			requestgroup.setStatus(new org.hl7.fhir.r4.model.RequestGroup.RequestStatusEnumFactory().fromCode(r.getRqstGrpSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** RqstGrp_Sbjct ********************************************************************************/
		if(r.getRqstGrpSbjct() != null ) {

			if(r.getRqstGrpSbjct().replace("[","").replace("]","").equals("NULL") | r.getRqstGrpSbjct()==null) {} else {
			requestgroup.setSubject(new org.hl7.fhir.r4.model.Reference(r.getRqstGrpSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		return requestgroup;
	}
}
