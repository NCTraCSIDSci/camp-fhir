package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.PlanDefinition;
public class PlanDefinitionConversion 
{
	public org.hl7.fhir.r4.model.PlanDefinition PlanDefinitions(PlanDefinition p) throws ParseException
	{
		org.hl7.fhir.r4.model.PlanDefinition plandefinition = new org.hl7.fhir.r4.model.PlanDefinition();

		/******************** id ********************************************************************************/
		plandefinition.setId(p.getId());

		/******************** PlnDfn_Actn_CardinalityBehavior ********************************************************************************/
		if(p.getPlnDfnActnCardinalityBehavior() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCardinalityBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setCardinalityBehavior(new org.hl7.fhir.r4.model.PlanDefinition.ActionCardinalityBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnCdCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCode().size() < i1+1) { plandefinition.getAction().get(i0).addCode(); }
					String[] arrayi2 = p.getPlnDfnActnCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnCdCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCode().size() < i1+1) { plandefinition.getAction().get(i0).addCode(); }
					String[] arrayi2 = p.getPlnDfnActnCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnCdCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCode().size() < i1+1) { plandefinition.getAction().get(i0).addCode(); }
					String[] arrayi2 = p.getPlnDfnActnCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnCdCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCode().size() < i1+1) { plandefinition.getAction().get(i0).addCode(); }
					String[] arrayi2 = p.getPlnDfnActnCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnCdCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCode().size() < i1+1) { plandefinition.getAction().get(i0).addCode(); }
					String[] arrayi2 = p.getPlnDfnActnCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getCode().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getCode().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getCode().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Cd_Txt ********************************************************************************/
		if(p.getPlnDfnActnCdTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCode().size() < i1+1) { plandefinition.getAction().get(i0).addCode(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getCode().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnDscrptn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCndtnExprsnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCndtnExprsnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCondition().size() < i1+1) { plandefinition.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getCondition().get(i1).getExpression().setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Exprsn ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnExprsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCndtnExprsnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCndtnExprsnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCondition().size() < i1+1) { plandefinition.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getCondition().get(i1).getExpression().setExpression(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Lnguage ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnLnguage() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCndtnExprsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCndtnExprsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCondition().size() < i1+1) { plandefinition.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getCondition().get(i1).getExpression().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Nm ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnNm() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCndtnExprsnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCndtnExprsnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCondition().size() < i1+1) { plandefinition.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getCondition().get(i1).getExpression().setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Cndtn_Exprsn_Rfrnc ********************************************************************************/
		if(p.getPlnDfnActnCndtnExprsnRfrnc() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCndtnExprsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCndtnExprsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCondition().size() < i1+1) { plandefinition.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getCondition().get(i1).getExpression().setReference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Cndtn_Kind ********************************************************************************/
		if(p.getPlnDfnActnCndtnKind() != null ) {

			String[] arrayi0 = p.getPlnDfnActnCndtnKind().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnCndtnKind().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getCondition().size() < i1+1) { plandefinition.getAction().get(i0).addCondition(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getCondition().get(i1).setKind(new org.hl7.fhir.r4.model.PlanDefinition.ActionConditionKindEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_DfnCanonicalTyp ********************************************************************************/
		if(p.getPlnDfnActnDfnCanonicalTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDfnCanonicalTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setDefinition(new org.hl7.fhir.r4.model.CanonicalType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_DfnUriTyp ********************************************************************************/
		if(p.getPlnDfnActnDfnUriTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDfnUriTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setDefinition(new org.hl7.fhir.r4.model.UriType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnActnDscrptn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setDescription(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_Docation_Citation ********************************************************************************/
		if(p.getPlnDfnActnDocationCitation() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).setCitation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Dsply ********************************************************************************/
		if(p.getPlnDfnActnDocationDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Doc_CntntTyp ********************************************************************************/
		if(p.getPlnDfnActnDocationDocCntntTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).getDocument().setContentType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Doc_Creation ********************************************************************************/
		if(p.getPlnDfnActnDocationDocCreation() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).getDocument().setCreation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Doc_Data ********************************************************************************/
		if(p.getPlnDfnActnDocationDocData() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).getDocument().setData(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Doc_Hash ********************************************************************************/
		if(p.getPlnDfnActnDocationDocHash() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).getDocument().setHash(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Doc_Lnguage ********************************************************************************/
		if(p.getPlnDfnActnDocationDocLnguage() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).getDocument().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Doc_Sz ********************************************************************************/
		if(p.getPlnDfnActnDocationDocSz() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).getDocument().setSize(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Doc_Ttl ********************************************************************************/
		if(p.getPlnDfnActnDocationDocTtl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).getDocument().setTitle(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Doc_Url ********************************************************************************/
		if(p.getPlnDfnActnDocationDocUrl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).getDocument().setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Lbl ********************************************************************************/
		if(p.getPlnDfnActnDocationLbl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).setLabel(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Rsrc ********************************************************************************/
		if(p.getPlnDfnActnDocationRsrc() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).setResource(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Typ ********************************************************************************/
		if(p.getPlnDfnActnDocationTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Docation_Url ********************************************************************************/
		if(p.getPlnDfnActnDocationUrl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDocationUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDocationUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDocumentation().size() < i1+1) { plandefinition.getAction().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDocumentation().get(i1).setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnDscrptn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDynamicVlExprsnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDynamicVlExprsnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDynamicValue().size() < i1+1) { plandefinition.getAction().get(i0).addDynamicValue(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDynamicValue().get(i1).getExpression().setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Exprsn ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnExprsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDynamicVlExprsnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDynamicVlExprsnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDynamicValue().size() < i1+1) { plandefinition.getAction().get(i0).addDynamicValue(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDynamicValue().get(i1).getExpression().setExpression(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Lnguage ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnLnguage() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDynamicVlExprsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDynamicVlExprsnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDynamicValue().size() < i1+1) { plandefinition.getAction().get(i0).addDynamicValue(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDynamicValue().get(i1).getExpression().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Nm ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnNm() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDynamicVlExprsnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDynamicVlExprsnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDynamicValue().size() < i1+1) { plandefinition.getAction().get(i0).addDynamicValue(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDynamicValue().get(i1).getExpression().setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_DynamicVl_Exprsn_Rfrnc ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlExprsnRfrnc() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDynamicVlExprsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDynamicVlExprsnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDynamicValue().size() < i1+1) { plandefinition.getAction().get(i0).addDynamicValue(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDynamicValue().get(i1).getExpression().setReference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_DynamicVl_Path ********************************************************************************/
		if(p.getPlnDfnActnDynamicVlPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnDynamicVlPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnDynamicVlPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getDynamicValue().size() < i1+1) { plandefinition.getAction().get(i0).addDynamicValue(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getDynamicValue().get(i1).setPath(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_GoalId ********************************************************************************/
		if(p.getPlnDfnActnGoalId() != null ) {

			String[] arrayi0 = p.getPlnDfnActnGoalId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).addGoalId(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_GrpingBehavior ********************************************************************************/
		if(p.getPlnDfnActnGrpingBehavior() != null ) {

			String[] arrayi0 = p.getPlnDfnActnGrpingBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setGroupingBehavior(new org.hl7.fhir.r4.model.PlanDefinition.ActionGroupingBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Cd ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnInputCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Dsply ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnInputCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Sys ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnInputCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnInputCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_CdFltr_Cd_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrCdVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnInputCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_CdFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_CdFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrSrchParam() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).setSearchParam(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_CdFltr_VlSt ********************************************************************************/
		if(p.getPlnDfnActnInputCdFltrVlSt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getCodeFilter().get(i2).setValueSet(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrSrchParam() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).setSearchParam(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlDtTimeTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Cd ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlDurationCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).getValueDuration().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlDurationCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).getValueDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Sys ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlDurationSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).getValueDuration().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Unt ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlDurationUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).getValueDuration().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlDuration_Vl ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlDurationVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).getValueDuration().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlPrd_End ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).getValuePeriod().setEnd(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_DtFltr_VlPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnInputDtFltrVlPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getDateFilter().get(i2).getValuePeriod().setStart(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_Lmt ********************************************************************************/
		if(p.getPlnDfnActnInputLmt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).setLimit(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Input_MustSupport ********************************************************************************/
		if(p.getPlnDfnActnInputMustSupport() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).addMustSupport(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_Profile ********************************************************************************/
		if(p.getPlnDfnActnInputProfile() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).addProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_Sort_Direction ********************************************************************************/
		if(p.getPlnDfnActnInputSortDirection() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getSort().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addSort(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getSort().get(i2).setDirection(new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_Sort_Path ********************************************************************************/
		if(p.getPlnDfnActnInputSortPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getSort().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).addSort(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getSort().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					String[] arrayi2 = p.getPlnDfnActnInputSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Input_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).getSubjectCodeableConcept().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Input_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnActnInputSbjctRfrnc() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).setSubject(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Input_Typ ********************************************************************************/
		if(p.getPlnDfnActnInputTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnInputTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnInputTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getInput().size() < i1+1) { plandefinition.getAction().get(i0).addInput(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getInput().get(i1).setType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Cd ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnOutputCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Dsply ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnOutputCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Sys ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnOutputCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnOutputCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_CdFltr_Cd_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrCdVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addCodeFilter(); }
						String[] arrayi3 = p.getPlnDfnActnOutputCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().size() < i3+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).addCode(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).getCode().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_CdFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_CdFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrSrchParam() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).setSearchParam(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_CdFltr_VlSt ********************************************************************************/
		if(p.getPlnDfnActnOutputCdFltrVlSt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addCodeFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getCodeFilter().get(i2).setValueSet(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrSrchParam() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).setSearchParam(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlDtTimeTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Cd ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlDurationCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).getValueDuration().setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlDurationCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).getValueDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Sys ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlDurationSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).getValueDuration().setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Unt ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlDurationUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).getValueDuration().setUnit(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlDuration_Vl ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlDurationVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).getValueDuration().setValue((new java.math.BigDecimal((arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlPrd_End ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).getValuePeriod().setEnd(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_DtFltr_VlPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnOutputDtFltrVlPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addDateFilter(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getDateFilter().get(i2).getValuePeriod().setStart(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi2[i2].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_Lmt ********************************************************************************/
		if(p.getPlnDfnActnOutputLmt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).setLimit(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Output_MustSupport ********************************************************************************/
		if(p.getPlnDfnActnOutputMustSupport() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).addMustSupport(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_Profile ********************************************************************************/
		if(p.getPlnDfnActnOutputProfile() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).addProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_Sort_Direction ********************************************************************************/
		if(p.getPlnDfnActnOutputSortDirection() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getSort().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addSort(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getSort().get(i2).setDirection(new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory().fromCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_Sort_Path ********************************************************************************/
		if(p.getPlnDfnActnOutputSortPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getSort().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).addSort(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getSort().get(i2).setPath(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					String[] arrayi2 = p.getPlnDfnActnOutputSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Output_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).getSubjectCodeableConcept().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		return  PlanDefinitions_Extended3( p, plandefinition) ;
	}
		public org.hl7.fhir.r4.model.PlanDefinition PlanDefinitions_Extended3(PlanDefinition p, org.hl7.fhir.r4.model.PlanDefinition plandefinition) throws ParseException
		{
		/******************** PlnDfn_Actn_Output_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnActnOutputSbjctRfrnc() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).setSubject(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Output_Typ ********************************************************************************/
		if(p.getPlnDfnActnOutputTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnOutputTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnOutputTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getOutput().size() < i1+1) { plandefinition.getAction().get(i0).addOutput(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getOutput().get(i1).setType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnPrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getParticipant().size() < i1+1) { plandefinition.getAction().get(i0).addParticipant(); }
					String[] arrayi2 = p.getPlnDfnActnPrtcpntRoleCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnPrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getParticipant().size() < i1+1) { plandefinition.getAction().get(i0).addParticipant(); }
					String[] arrayi2 = p.getPlnDfnActnPrtcpntRoleCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnPrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getParticipant().size() < i1+1) { plandefinition.getAction().get(i0).addParticipant(); }
					String[] arrayi2 = p.getPlnDfnActnPrtcpntRoleCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnPrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getParticipant().size() < i1+1) { plandefinition.getAction().get(i0).addParticipant(); }
					String[] arrayi2 = p.getPlnDfnActnPrtcpntRoleCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnPrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getParticipant().size() < i1+1) { plandefinition.getAction().get(i0).addParticipant(); }
					String[] arrayi2 = p.getPlnDfnActnPrtcpntRoleCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Prtcpnt_Role_Txt ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntRoleTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPrtcpntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnPrtcpntRoleTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getParticipant().size() < i1+1) { plandefinition.getAction().get(i0).addParticipant(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getParticipant().get(i1).getRole().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Prtcpnt_Typ ********************************************************************************/
		if(p.getPlnDfnActnPrtcpntTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPrtcpntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnPrtcpntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getParticipant().size() < i1+1) { plandefinition.getAction().get(i0).addParticipant(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getParticipant().get(i1).setType(new org.hl7.fhir.r4.model.PlanDefinition.ActionParticipantTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_PrecheckBehavior ********************************************************************************/
		if(p.getPlnDfnActnPrecheckBehavior() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPrecheckBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setPrecheckBehavior(new org.hl7.fhir.r4.model.PlanDefinition.ActionPrecheckBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_Prefix ********************************************************************************/
		if(p.getPlnDfnActnPrefix() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPrefix().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setPrefix(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_Priority ********************************************************************************/
		if(p.getPlnDfnActnPriority() != null ) {

			String[] arrayi0 = p.getPlnDfnActnPriority().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setPriority(new org.hl7.fhir.r4.model.PlanDefinition.RequestPriorityEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getReason().size() < i1+1) { plandefinition.getAction().get(i0).addReason(); }
					String[] arrayi2 = p.getPlnDfnActnRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getReason().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getReason().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getReason().size() < i1+1) { plandefinition.getAction().get(i0).addReason(); }
					String[] arrayi2 = p.getPlnDfnActnRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getReason().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getReason().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getReason().size() < i1+1) { plandefinition.getAction().get(i0).addReason(); }
					String[] arrayi2 = p.getPlnDfnActnRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getReason().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getReason().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getReason().size() < i1+1) { plandefinition.getAction().get(i0).addReason(); }
					String[] arrayi2 = p.getPlnDfnActnRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getReason().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getReason().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Rsn_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnRsnCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getReason().size() < i1+1) { plandefinition.getAction().get(i0).addReason(); }
					String[] arrayi2 = p.getPlnDfnActnRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getReason().get(i1).getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getReason().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getReason().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Rsn_Txt ********************************************************************************/
		if(p.getPlnDfnActnRsnTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getReason().size() < i1+1) { plandefinition.getAction().get(i0).addReason(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getReason().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_ActnId ********************************************************************************/
		if(p.getPlnDfnActnRltedActnActnId() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnActnId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnActnId().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).setActionId(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffDuration_Cd ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffDurationCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffDuration_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffDurationCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffDuration_Sys ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffDurationSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffDuration_Unt ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffDurationUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffDuration_Vl ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffDurationVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngHiCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngHiCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngHiSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngHiUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngHiVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngLwCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngLwCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngLwSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngLwUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_OffRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnActnRltedActnOffRngLwVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnOffRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnOffRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).getOffsetRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_RltedActn_Rltnship ********************************************************************************/
		if(p.getPlnDfnActnRltedActnRltnship() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRltedActnRltnship().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnRltedActnRltnship().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getRelatedAction().size() < i1+1) { plandefinition.getAction().get(i0).addRelatedAction(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getRelatedAction().get(i1).setRelationship(new org.hl7.fhir.r4.model.PlanDefinition.ActionRelationshipTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_RequiredBehavior ********************************************************************************/
		if(p.getPlnDfnActnRequiredBehavior() != null ) {

			String[] arrayi0 = p.getPlnDfnActnRequiredBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setRequiredBehavior(new org.hl7.fhir.r4.model.PlanDefinition.ActionRequiredBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_SelectionBehavior ********************************************************************************/
		if(p.getPlnDfnActnSelectionBehavior() != null ) {

			String[] arrayi0 = p.getPlnDfnActnSelectionBehavior().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setSelectionBehavior(new org.hl7.fhir.r4.model.PlanDefinition.ActionSelectionBehaviorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getSubjectCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getSubjectCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnActnSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getSubjectCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnActnSbjctRfrnc() != null ) {

			String[] arrayi0 = p.getPlnDfnActnSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setSubject(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TxtEquivalent ********************************************************************************/
		if(p.getPlnDfnActnTxtEquivalent() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTxtEquivalent().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setTextEquivalent(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgAge_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgAgeCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgAgeCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingAge().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgAge_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTmgAgeCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgAgeCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingAge().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgAge_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgAgeSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgAgeSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingAge().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgAge_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgAgeUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgAgeUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingAge().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgAge_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgAgeVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgAgeVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingAge().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnTmgDtTimeTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setTiming(new org.hl7.fhir.r4.model.DateTimeType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgDuration_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgDurationCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgDuration_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTmgDurationCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgDuration_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgDurationSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgDuration_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgDurationUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgDuration_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgDurationVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgPrd_End ********************************************************************************/
		if(p.getPlnDfnActnTmgPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnTmgPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgRngHiCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Hi_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTmgRngHiCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgRngHiSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgRngHiUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgRngHiVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgRngLwCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Lw_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTmgRngLwCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgRngLwSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgRngLwUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgRngLwVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getTimingTiming().getCode().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getCode().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Cd_Txt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgCdTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getCode().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Evnt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgEvnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptCnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setCount(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptCntMx() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setCountMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Duration ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptDuration() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setDuration((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptDurationMx() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_DurationUnt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptDurationUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptFrqncy() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setFrequency(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		return  PlanDefinitions_Extended( p, plandefinition) ;
	}
		public org.hl7.fhir.r4.model.PlanDefinition PlanDefinitions_Extended(PlanDefinition p, org.hl7.fhir.r4.model.PlanDefinition plandefinition) throws ParseException
		{
			
		/******************** PlnDfn_Actn_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Off ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptOff() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setOffset(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_Prd ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptPrd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptPrdMx() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_PrdUnt ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptPrdUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Actn_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(p.getPlnDfnActnTmgTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTmgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				for( String currListStrSplit : arrayi0[i0].replace("[","").replace("]","").replace("\"","").split(",")){
				if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getTimingTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Ttl ********************************************************************************/
		if(p.getPlnDfnActnTtl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_Transform ********************************************************************************/
		if(p.getPlnDfnActnTransform() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTransform().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).setTransform(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnDscrptn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrCndtnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrCndtnDscrptn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getCondition().setDescription(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Exprsn ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnExprsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrCndtnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrCndtnExprsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getCondition().setExpression(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Lnguage ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnLnguage() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrCndtnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrCndtnLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getCondition().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Nm ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnNm() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrCndtnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrCndtnNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getCondition().setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Cndtn_Rfrnc ********************************************************************************/
		if(p.getPlnDfnActnTrgrCndtnRfrnc() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrCndtnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrCndtnRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getCondition().setReference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addCodeFilter(); }
							String[] arrayi4 = p.getPlnDfnActnTrgrDataCdFltrCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().size() < i4+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).addCode(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().get(i4).setCode(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addCodeFilter(); }
							String[] arrayi4 = p.getPlnDfnActnTrgrDataCdFltrCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().size() < i4+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).addCode(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().get(i4).setDisplay(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addCodeFilter(); }
							String[] arrayi4 = p.getPlnDfnActnTrgrDataCdFltrCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().size() < i4+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).addCode(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().get(i4).setSystem(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addCodeFilter(); }
							String[] arrayi4 = p.getPlnDfnActnTrgrDataCdFltrCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().size() < i4+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).addCode(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().get(i4).setUserSelected(Boolean.parseBoolean(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
							}
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Cd_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrCdVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addCodeFilter(); }
							String[] arrayi4 = p.getPlnDfnActnTrgrDataCdFltrCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i3].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
							for(int i4 = 0; i4 < arrayi4.length; i4++) {
								if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().size() < i4+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).addCode(); }
								if(arrayi4[i4].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi4[i4]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).getCode().get(i4).setVersion(arrayi4[i4].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
							}
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataCdFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addCodeFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).setPath(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrSrchParam() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataCdFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addCodeFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).setSearchParam(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_CdFltr_VlSt ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataCdFltrVlSt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataCdFltrVlSt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addCodeFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getCodeFilter().get(i3).setValueSet(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_Path ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).setPath(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_SrchParam ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrSrchParam() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrSrchParam().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).setSearchParam(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlDtTimeTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrVlDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).setValue(new org.hl7.fhir.r4.model.DateTimeType(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlDurationCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrVlDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).getValueDuration().setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlDurationCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrVlDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).getValueDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlDurationSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrVlDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).getValueDuration().setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Unt ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlDurationUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrVlDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).getValueDuration().setUnit(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlDuration_Vl ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlDurationVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrVlDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).getValueDuration().setValue((new java.math.BigDecimal((arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_End ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrVlPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).getValuePeriod().setEnd(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi3[i3].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_DtFltr_VlPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataDtFltrVlPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataDtFltrVlPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addDateFilter(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getDateFilter().get(i3).getValuePeriod().setStart(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi3[i3].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_Lmt ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataLmt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataLmt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).setLimit(Integer.parseInt(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_MustSupport ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataMustSupport() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataMustSupport().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addMustSupport(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_Profile ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataProfile() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataProfile().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						for( String currListStrSplit : arrayi2[i2].replace("[","").replace("]","").replace("\"","").split(",")){
						if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addProfile(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_Sort_Direction ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSortDirection() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataSortDirection().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSort().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addSort(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSort().get(i3).setDirection(new org.hl7.fhir.r4.model.DataRequirement.SortDirectionEnumFactory().fromCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_Sort_Path ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSortPath() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataSortPath().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSort().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).addSort(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSort().get(i3).setPath(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().get(i3).setCode(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().get(i3).setDisplay(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().get(i3).setSystem(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().get(i3).setUserSelected(Boolean.parseBoolean(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						String[] arrayi3 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i2].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
						for(int i3 = 0; i3 < arrayi3.length; i3++) {
							if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().size() < i3+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().addCoding(); }
							if(arrayi3[i3].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi3[i3]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().getCoding().get(i3).setVersion(arrayi3[i3].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
						}
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctCdbleCncptTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataSbjctCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).getSubjectCodeableConcept().setText(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataSbjctRfrnc() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataSbjctRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).setSubject(new org.hl7.fhir.r4.model.Reference(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Data_Typ ********************************************************************************/
		if(p.getPlnDfnActnTrgrDataTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrDataTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrDataTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrDataTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getData().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).addData(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getData().get(i2).setType(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Nm ********************************************************************************/
		if(p.getPlnDfnActnTrgrNm() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).setName(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgDtTimeTyp ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgDtTimeTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgDtTimeTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).setTiming(new org.hl7.fhir.r4.model.DateTimeType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgDtTyp ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgDtTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgDtTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).setTiming(new org.hl7.fhir.r4.model.DateType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgRfrnc ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgRfrnc() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).setTiming(new org.hl7.fhir.r4.model.Reference(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrTmgTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrTmgTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrTmgTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrTmgTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					String[] arrayi2 = p.getPlnDfnActnTrgrTmgTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().size() < i2+1) { plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Cd_Txt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgCdTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgCdTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getCode().setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Evnt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgEvnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgEvnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsDurationCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsDuration().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsDurationCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsDurationSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsDuration().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsDurationUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsDuration().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsDurationVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsDurationVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getHigh().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getHigh().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getHigh().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getLow().setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getLow().setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getLow().setUnit(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwVl() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptBndsRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Cnt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptCnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptCnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setCount(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_CntMx ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptCntMx() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptCntMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setCountMax(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Duration ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptDuration() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptDuration().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setDuration((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_DurationMx ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptDurationMx() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptDurationMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setDurationMax((Double.parseDouble((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_DurationUnt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptDurationUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptDurationUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Frqncy ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptFrqncy() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptFrqncy().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setFrequency(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_FrqncyMx ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptFrqncyMx() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptFrqncyMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setFrequencyMax(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Off ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptOff() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptOff().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setOffset(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_Prd ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptPrd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptPrd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setPeriod((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_PrdMx ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptPrdMx() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptPrdMx().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_PrdUnt ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptPrdUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptPrdUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_TmgTmg_Rpt_TimeOfDay ********************************************************************************/
		if(p.getPlnDfnActnTrgrTmgTmgRptTimeOfDay() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTmgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTmgTmgRptTimeOfDay().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					for( String currListStrSplit : arrayi1[i1].replace("[","").replace("]","").replace("\"","").split(",")){
					if(currListStrSplit.replace("[","").replace("]","").replace("\"","").equals("NULL") | currListStrSplit==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).getTimingTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Actn_Trgr_Typ ********************************************************************************/
		if(p.getPlnDfnActnTrgrTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTrgrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTrgrTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getTrigger().size() < i1+1) { plandefinition.getAction().get(i0).addTrigger(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getTrigger().get(i1).setType(new org.hl7.fhir.r4.model.TriggerDefinition.TriggerTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnActnTypCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnActnTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnActnTypCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnActnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Actn_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnActnTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				String[] arrayi1 = p.getPlnDfnActnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAction().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getAction().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAction().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Actn_Typ_Txt ********************************************************************************/
		if(p.getPlnDfnActnTypTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnActnTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAction().size() < i0+1) { plandefinition.addAction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAction().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_ApprovalDt ********************************************************************************/
		if(p.getPlnDfnApprovalDt() != null ) {

			if(p.getPlnDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnApprovalDt()==null) {} else {
			plandefinition.setApprovalDate(p.getPlnDfnApprovalDt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnApprovalDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPlnDfnApprovalDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PlnDfn_Athr_Nm ********************************************************************************/
		if(p.getPlnDfnAthrNm() != null ) {

			String[] arrayi0 = p.getPlnDfnAthrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAuthor().size() < i0+1) { plandefinition.addAuthor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getAuthor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Athr_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnAthrTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAuthor().size() < i0+1) { plandefinition.addAuthor(); }
				String[] arrayi1 = p.getPlnDfnAthrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { plandefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Athr_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnAthrTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAuthor().size() < i0+1) { plandefinition.addAuthor(); }
				String[] arrayi1 = p.getPlnDfnAthrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { plandefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAuthor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Athr_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnAthrTlcmRnk() != null ) {

			String[] arrayi0 = p.getPlnDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAuthor().size() < i0+1) { plandefinition.addAuthor(); }
				String[] arrayi1 = p.getPlnDfnAthrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { plandefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAuthor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Athr_Tlcm_Sys ********************************************************************************/
		if(p.getPlnDfnAthrTlcmSys() != null ) {

			String[] arrayi0 = p.getPlnDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAuthor().size() < i0+1) { plandefinition.addAuthor(); }
				String[] arrayi1 = p.getPlnDfnAthrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { plandefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAuthor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Athr_Tlcm_Use ********************************************************************************/
		if(p.getPlnDfnAthrTlcmUse() != null ) {

			String[] arrayi0 = p.getPlnDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAuthor().size() < i0+1) { plandefinition.addAuthor(); }
				String[] arrayi1 = p.getPlnDfnAthrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { plandefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAuthor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Athr_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnAthrTlcmVl() != null ) {

			String[] arrayi0 = p.getPlnDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getAuthor().size() < i0+1) { plandefinition.addAuthor(); }
				String[] arrayi1 = p.getPlnDfnAthrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getAuthor().get(i0).getTelecom().size() < i1+1) { plandefinition.getAuthor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getAuthor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Cntct_Nm ********************************************************************************/
		if(p.getPlnDfnCntctNm() != null ) {

			String[] arrayi0 = p.getPlnDfnCntctNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getContact().size() < i0+1) { plandefinition.addContact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getContact().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Cntct_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnCntctTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getContact().size() < i0+1) { plandefinition.addContact(); }
				String[] arrayi1 = p.getPlnDfnCntctTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getContact().get(i0).getTelecom().size() < i1+1) { plandefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Cntct_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnCntctTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getContact().size() < i0+1) { plandefinition.addContact(); }
				String[] arrayi1 = p.getPlnDfnCntctTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getContact().get(i0).getTelecom().size() < i1+1) { plandefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getContact().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Cntct_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnCntctTlcmRnk() != null ) {

			String[] arrayi0 = p.getPlnDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getContact().size() < i0+1) { plandefinition.addContact(); }
				String[] arrayi1 = p.getPlnDfnCntctTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getContact().get(i0).getTelecom().size() < i1+1) { plandefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getContact().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Cntct_Tlcm_Sys ********************************************************************************/
		if(p.getPlnDfnCntctTlcmSys() != null ) {

			String[] arrayi0 = p.getPlnDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getContact().size() < i0+1) { plandefinition.addContact(); }
				String[] arrayi1 = p.getPlnDfnCntctTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getContact().get(i0).getTelecom().size() < i1+1) { plandefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getContact().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Cntct_Tlcm_Use ********************************************************************************/
		if(p.getPlnDfnCntctTlcmUse() != null ) {

			String[] arrayi0 = p.getPlnDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getContact().size() < i0+1) { plandefinition.addContact(); }
				String[] arrayi1 = p.getPlnDfnCntctTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getContact().get(i0).getTelecom().size() < i1+1) { plandefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getContact().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Cntct_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnCntctTlcmVl() != null ) {

			String[] arrayi0 = p.getPlnDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getContact().size() < i0+1) { plandefinition.addContact(); }
				String[] arrayi1 = p.getPlnDfnCntctTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getContact().get(i0).getTelecom().size() < i1+1) { plandefinition.getContact().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getContact().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Copyright ********************************************************************************/
		if(p.getPlnDfnCopyright() != null ) {

			if(p.getPlnDfnCopyright().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnCopyright()==null) {} else {
			plandefinition.setCopyright(p.getPlnDfnCopyright().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_Dt ********************************************************************************/
		if(p.getPlnDfnDt() != null ) {

			if(p.getPlnDfnDt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnDt()==null) {} else {
			plandefinition.setDate(p.getPlnDfnDt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPlnDfnDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PlnDfn_Dscrptn ********************************************************************************/
		if(p.getPlnDfnDscrptn() != null ) {

			if(p.getPlnDfnDscrptn().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnDscrptn()==null) {} else {
			plandefinition.setDescription(p.getPlnDfnDscrptn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_Editor_Nm ********************************************************************************/
		if(p.getPlnDfnEditorNm() != null ) {

			String[] arrayi0 = p.getPlnDfnEditorNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEditor().size() < i0+1) { plandefinition.addEditor(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getEditor().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Editor_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnEditorTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEditor().size() < i0+1) { plandefinition.addEditor(); }
				String[] arrayi1 = p.getPlnDfnEditorTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEditor().get(i0).getTelecom().size() < i1+1) { plandefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Editor_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnEditorTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEditor().size() < i0+1) { plandefinition.addEditor(); }
				String[] arrayi1 = p.getPlnDfnEditorTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEditor().get(i0).getTelecom().size() < i1+1) { plandefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEditor().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Editor_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnEditorTlcmRnk() != null ) {

			String[] arrayi0 = p.getPlnDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEditor().size() < i0+1) { plandefinition.addEditor(); }
				String[] arrayi1 = p.getPlnDfnEditorTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEditor().get(i0).getTelecom().size() < i1+1) { plandefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEditor().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Editor_Tlcm_Sys ********************************************************************************/
		if(p.getPlnDfnEditorTlcmSys() != null ) {

			String[] arrayi0 = p.getPlnDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEditor().size() < i0+1) { plandefinition.addEditor(); }
				String[] arrayi1 = p.getPlnDfnEditorTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEditor().get(i0).getTelecom().size() < i1+1) { plandefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEditor().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Editor_Tlcm_Use ********************************************************************************/
		if(p.getPlnDfnEditorTlcmUse() != null ) {

			String[] arrayi0 = p.getPlnDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEditor().size() < i0+1) { plandefinition.addEditor(); }
				String[] arrayi1 = p.getPlnDfnEditorTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEditor().get(i0).getTelecom().size() < i1+1) { plandefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEditor().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		return  PlanDefinitions_Extended2( p, plandefinition) ;
		}
			public org.hl7.fhir.r4.model.PlanDefinition PlanDefinitions_Extended2(PlanDefinition p, org.hl7.fhir.r4.model.PlanDefinition plandefinition) throws ParseException
			{
		/******************** PlnDfn_Editor_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnEditorTlcmVl() != null ) {

			String[] arrayi0 = p.getPlnDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEditor().size() < i0+1) { plandefinition.addEditor(); }
				String[] arrayi1 = p.getPlnDfnEditorTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEditor().get(i0).getTelecom().size() < i1+1) { plandefinition.getEditor().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEditor().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_EfctivePrd_End ********************************************************************************/
		if(p.getPlnDfnEfctivePrdEnd() != null ) {

			if(p.getPlnDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnEfctivePrdEnd()==null) {} else {
			plandefinition.getEffectivePeriod().setEnd(p.getPlnDfnEfctivePrdEnd().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnEfctivePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPlnDfnEfctivePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PlnDfn_EfctivePrd_Strt ********************************************************************************/
		if(p.getPlnDfnEfctivePrdStrt() != null ) {

			if(p.getPlnDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnEfctivePrdStrt()==null) {} else {
			plandefinition.getEffectivePeriod().setStart(p.getPlnDfnEfctivePrdStrt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnEfctivePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPlnDfnEfctivePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PlnDfn_Endsr_Nm ********************************************************************************/
		if(p.getPlnDfnEndsrNm() != null ) {

			String[] arrayi0 = p.getPlnDfnEndsrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEndorser().size() < i0+1) { plandefinition.addEndorser(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getEndorser().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Endsr_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEndorser().size() < i0+1) { plandefinition.addEndorser(); }
				String[] arrayi1 = p.getPlnDfnEndsrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { plandefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Endsr_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEndorser().size() < i0+1) { plandefinition.addEndorser(); }
				String[] arrayi1 = p.getPlnDfnEndsrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { plandefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEndorser().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Endsr_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmRnk() != null ) {

			String[] arrayi0 = p.getPlnDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEndorser().size() < i0+1) { plandefinition.addEndorser(); }
				String[] arrayi1 = p.getPlnDfnEndsrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { plandefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEndorser().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Endsr_Tlcm_Sys ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmSys() != null ) {

			String[] arrayi0 = p.getPlnDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEndorser().size() < i0+1) { plandefinition.addEndorser(); }
				String[] arrayi1 = p.getPlnDfnEndsrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { plandefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEndorser().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Endsr_Tlcm_Use ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmUse() != null ) {

			String[] arrayi0 = p.getPlnDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEndorser().size() < i0+1) { plandefinition.addEndorser(); }
				String[] arrayi1 = p.getPlnDfnEndsrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { plandefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEndorser().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Endsr_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnEndsrTlcmVl() != null ) {

			String[] arrayi0 = p.getPlnDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getEndorser().size() < i0+1) { plandefinition.addEndorser(); }
				String[] arrayi1 = p.getPlnDfnEndsrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getEndorser().get(i0).getTelecom().size() < i1+1) { plandefinition.getEndorser().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getEndorser().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Exprmtl ********************************************************************************/
		if(p.getPlnDfnExprmtl() != null ) {

			if(p.getPlnDfnExprmtl().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnExprmtl()==null) {} else {
			plandefinition.setExperimental(Boolean.parseBoolean(p.getPlnDfnExprmtl().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PlnDfn_Goal_Addres_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalAddresCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalAddresCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getAddresses().size() < i1+1) { plandefinition.getGoal().get(i0).addAddresses(); }
					String[] arrayi2 = p.getPlnDfnGoalAddresCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().size() < i2+1) { plandefinition.getGoal().get(i0).getAddresses().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().get(i2).setCode(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Goal_Addres_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalAddresCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalAddresCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getAddresses().size() < i1+1) { plandefinition.getGoal().get(i0).addAddresses(); }
					String[] arrayi2 = p.getPlnDfnGoalAddresCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().size() < i2+1) { plandefinition.getGoal().get(i0).getAddresses().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().get(i2).setDisplay(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Goal_Addres_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalAddresCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalAddresCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getAddresses().size() < i1+1) { plandefinition.getGoal().get(i0).addAddresses(); }
					String[] arrayi2 = p.getPlnDfnGoalAddresCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().size() < i2+1) { plandefinition.getGoal().get(i0).getAddresses().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().get(i2).setSystem(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Goal_Addres_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalAddresCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalAddresCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getAddresses().size() < i1+1) { plandefinition.getGoal().get(i0).addAddresses(); }
					String[] arrayi2 = p.getPlnDfnGoalAddresCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().size() < i2+1) { plandefinition.getGoal().get(i0).getAddresses().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().get(i2).setUserSelected(Boolean.parseBoolean(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
					}
				}
			}

		}
		/******************** PlnDfn_Goal_Addres_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalAddresCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalAddresCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalAddresCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getAddresses().size() < i1+1) { plandefinition.getGoal().get(i0).addAddresses(); }
					String[] arrayi2 = p.getPlnDfnGoalAddresCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i1].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
					for(int i2 = 0; i2 < arrayi2.length; i2++) {
						if(plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().size() < i2+1) { plandefinition.getGoal().get(i0).getAddresses().get(i1).addCoding(); }
						if(arrayi2[i2].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi2[i2]==null) {} else {plandefinition.getGoal().get(i0).getAddresses().get(i1).getCoding().get(i2).setVersion(arrayi2[i2].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
					}
				}
			}

		}
		/******************** PlnDfn_Goal_Addres_Txt ********************************************************************************/
		if(p.getPlnDfnGoalAddresTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalAddresTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalAddresTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getAddresses().size() < i1+1) { plandefinition.getGoal().get(i0).addAddresses(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getAddresses().get(i1).setText(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalCtgryCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getCategory().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getCategory().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalCtgryCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getCategory().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getCategory().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalCtgryCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getCategory().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getCategory().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalCtgryCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getCategory().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getCategory().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Goal_Ctgry_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalCtgryCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalCtgryCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getCategory().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getCategory().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getCategory().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Ctgry_Txt ********************************************************************************/
		if(p.getPlnDfnGoalCtgryTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalCtgryTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getGoal().get(i0).getCategory().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDscrptnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDscrptnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDescription().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getDescription().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDescription().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDscrptnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDscrptnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDescription().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getDescription().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDescription().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDscrptnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDscrptnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDescription().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getDescription().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDescription().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDscrptnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDscrptnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDescription().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getDescription().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDescription().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Goal_Dscrptn_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDscrptnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDscrptnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDescription().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getDescription().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDescription().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Dscrptn_Txt ********************************************************************************/
		if(p.getPlnDfnGoalDscrptnTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDscrptnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getGoal().get(i0).getDescription().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Goal_Docation_Citation ********************************************************************************/
		if(p.getPlnDfnGoalDocationCitation() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).setCitation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalDocationDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Doc_CntntTyp ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocCntntTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).getDocument().setContentType(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Doc_Creation ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocCreation() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).getDocument().setCreation(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Doc_Data ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocData() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).getDocument().setData(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Doc_Hash ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocHash() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).getDocument().setHash(arrayi1[i1].replace("[","").replace("]","").replace("\"","").getBytes()); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Doc_Lnguage ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocLnguage() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).getDocument().setLanguage(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Doc_Sz ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocSz() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).getDocument().setSize(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Doc_Ttl ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocTtl() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).getDocument().setTitle(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Doc_Url ********************************************************************************/
		if(p.getPlnDfnGoalDocationDocUrl() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).getDocument().setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Lbl ********************************************************************************/
		if(p.getPlnDfnGoalDocationLbl() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).setLabel(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Rsrc ********************************************************************************/
		if(p.getPlnDfnGoalDocationRsrc() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).setResource(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Typ ********************************************************************************/
		if(p.getPlnDfnGoalDocationTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Goal_Docation_Url ********************************************************************************/
		if(p.getPlnDfnGoalDocationUrl() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalDocationUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalDocationUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getDocumentation().size() < i1+1) { plandefinition.getGoal().get(i0).addDocumentation(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getDocumentation().get(i1).setUrl(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Priority_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalPriorityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalPriorityCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getPriority().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getPriority().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getPriority().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Priority_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalPriorityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalPriorityCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getPriority().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getPriority().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getPriority().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Priority_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalPriorityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalPriorityCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getPriority().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getPriority().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getPriority().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Priority_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalPriorityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalPriorityCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getPriority().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getPriority().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getPriority().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Goal_Priority_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalPriorityCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalPriorityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalPriorityCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getPriority().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getPriority().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getPriority().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Priority_Txt ********************************************************************************/
		if(p.getPlnDfnGoalPriorityTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalPriorityTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getGoal().get(i0).getPriority().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Goal_Strt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalStrtCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalStrtCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getStart().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getStart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getStart().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Strt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalStrtCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalStrtCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getStart().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getStart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getStart().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Strt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalStrtCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalStrtCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getStart().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getStart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getStart().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Strt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalStrtCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalStrtCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getStart().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getStart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getStart().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Goal_Strt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnGoalStrtCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalStrtCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				String[] arrayi1 = p.getPlnDfnGoalStrtCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getGoal().get(i0).getStart().getCoding().size() < i1+1) { plandefinition.getGoal().get(i0).getStart().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getGoal().get(i0).getStart().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Goal_Strt_Txt ********************************************************************************/
		if(p.getPlnDfnGoalStrtTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnGoalStrtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getGoal().size() < i0+1) { plandefinition.addGoal(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getGoal().get(i0).getStart().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Id_Assigner ********************************************************************************/
		if(p.getPlnDfnIdAssigner() != null ) {

			String[] arrayi0 = p.getPlnDfnIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Id_Prd_End ********************************************************************************/
		if(p.getPlnDfnIdPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Id_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnIdPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Id_Sys ********************************************************************************/
		if(p.getPlnDfnIdSys() != null ) {

			String[] arrayi0 = p.getPlnDfnIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Id_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnIdTypCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				String[] arrayi1 = p.getPlnDfnIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnIdTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				String[] arrayi1 = p.getPlnDfnIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Id_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnIdTypCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				String[] arrayi1 = p.getPlnDfnIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				String[] arrayi1 = p.getPlnDfnIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnIdTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				String[] arrayi1 = p.getPlnDfnIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { plandefinition.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Id_Typ_Txt ********************************************************************************/
		if(p.getPlnDfnIdTypTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Id_Use ********************************************************************************/
		if(p.getPlnDfnIdUse() != null ) {

			String[] arrayi0 = p.getPlnDfnIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Id_Vl ********************************************************************************/
		if(p.getPlnDfnIdVl() != null ) {

			String[] arrayi0 = p.getPlnDfnIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getIdentifier().size() < i0+1) { plandefinition.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Jrsdctn_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getJurisdiction().size() < i0+1) { plandefinition.addJurisdiction(); }
				String[] arrayi1 = p.getPlnDfnJrsdctnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { plandefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getJurisdiction().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Jrsdctn_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getJurisdiction().size() < i0+1) { plandefinition.addJurisdiction(); }
				String[] arrayi1 = p.getPlnDfnJrsdctnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { plandefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getJurisdiction().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Jrsdctn_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getJurisdiction().size() < i0+1) { plandefinition.addJurisdiction(); }
				String[] arrayi1 = p.getPlnDfnJrsdctnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { plandefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getJurisdiction().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Jrsdctn_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getJurisdiction().size() < i0+1) { plandefinition.addJurisdiction(); }
				String[] arrayi1 = p.getPlnDfnJrsdctnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { plandefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getJurisdiction().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Jrsdctn_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnJrsdctnCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getJurisdiction().size() < i0+1) { plandefinition.addJurisdiction(); }
				String[] arrayi1 = p.getPlnDfnJrsdctnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getJurisdiction().get(i0).getCoding().size() < i1+1) { plandefinition.getJurisdiction().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getJurisdiction().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Jrsdctn_Txt ********************************************************************************/
		if(p.getPlnDfnJrsdctnTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnJrsdctnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getJurisdiction().size() < i0+1) { plandefinition.addJurisdiction(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getJurisdiction().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_LastReviewDt ********************************************************************************/
		if(p.getPlnDfnLastReviewDt() != null ) {

			if(p.getPlnDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnLastReviewDt()==null) {} else {
			plandefinition.setLastReviewDate(p.getPlnDfnLastReviewDt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnLastReviewDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(p.getPlnDfnLastReviewDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PlnDfn_Library ********************************************************************************/
		if(p.getPlnDfnLibrary() != null ) {

				for( String currListStrSplit : p.getPlnDfnLibrary().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			plandefinition.addLibrary(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** PlnDfn_Nm ********************************************************************************/
		if(p.getPlnDfnNm() != null ) {

			if(p.getPlnDfnNm().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnNm()==null) {} else {
			plandefinition.setName(p.getPlnDfnNm().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_Pblshr ********************************************************************************/
		if(p.getPlnDfnPblshr() != null ) {

			if(p.getPlnDfnPblshr().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnPblshr()==null) {} else {
			plandefinition.setPublisher(p.getPlnDfnPblshr().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_Prpse ********************************************************************************/
		if(p.getPlnDfnPrpse() != null ) {

			if(p.getPlnDfnPrpse().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnPrpse()==null) {} else {
			plandefinition.setPurpose(p.getPlnDfnPrpse().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_RltedArtfct_Citation ********************************************************************************/
		if(p.getPlnDfnRltedArtfctCitation() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctCitation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).setCitation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Dsply ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Doc_CntntTyp ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocCntntTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctDocCntntTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).getDocument().setContentType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Doc_Creation ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocCreation() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctDocCreation().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).getDocument().setCreation(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Doc_Data ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocData() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctDocData().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).getDocument().setData(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Doc_Hash ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocHash() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctDocHash().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).getDocument().setHash(arrayi0[i0].replace("[","").replace("]","").replace("\"","").getBytes()); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Doc_Lnguage ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocLnguage() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctDocLnguage().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).getDocument().setLanguage(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Doc_Sz ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocSz() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctDocSz().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).getDocument().setSize(Integer.parseInt(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Doc_Ttl ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocTtl() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctDocTtl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).getDocument().setTitle(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Doc_Url ********************************************************************************/
		if(p.getPlnDfnRltedArtfctDocUrl() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctDocUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).getDocument().setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Lbl ********************************************************************************/
		if(p.getPlnDfnRltedArtfctLbl() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctLbl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).setLabel(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Rsrc ********************************************************************************/
		if(p.getPlnDfnRltedArtfctRsrc() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctRsrc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).setResource(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Typ ********************************************************************************/
		if(p.getPlnDfnRltedArtfctTyp() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).setType(new org.hl7.fhir.r4.model.RelatedArtifact.RelatedArtifactTypeEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_RltedArtfct_Url ********************************************************************************/
		if(p.getPlnDfnRltedArtfctUrl() != null ) {

			String[] arrayi0 = p.getPlnDfnRltedArtfctUrl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getRelatedArtifact().size() < i0+1) { plandefinition.addRelatedArtifact(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getRelatedArtifact().get(i0).setUrl(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Rviewr_Nm ********************************************************************************/
		if(p.getPlnDfnRviewrNm() != null ) {

			String[] arrayi0 = p.getPlnDfnRviewrNm().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getReviewer().size() < i0+1) { plandefinition.addReviewer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getReviewer().get(i0).setName(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Rviewr_Tlcm_Prd_End ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmPrdEnd() != null ) {

			String[] arrayi0 = p.getPlnDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getReviewer().size() < i0+1) { plandefinition.addReviewer(); }
				String[] arrayi1 = p.getPlnDfnRviewrTlcmPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { plandefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setEnd(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Rviewr_Tlcm_Prd_Strt ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmPrdStrt() != null ) {

			String[] arrayi0 = p.getPlnDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getReviewer().size() < i0+1) { plandefinition.addReviewer(); }
				String[] arrayi1 = p.getPlnDfnRviewrTlcmPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { plandefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getReviewer().get(i0).getTelecom().get(i1).getPeriod().setStart(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi1[i1].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Rviewr_Tlcm_Rnk ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmRnk() != null ) {

			String[] arrayi0 = p.getPlnDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getReviewer().size() < i0+1) { plandefinition.addReviewer(); }
				String[] arrayi1 = p.getPlnDfnRviewrTlcmRnk().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { plandefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getReviewer().get(i0).getTelecom().get(i1).setRank(Integer.parseInt(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Rviewr_Tlcm_Sys ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmSys() != null ) {

			String[] arrayi0 = p.getPlnDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getReviewer().size() < i0+1) { plandefinition.addReviewer(); }
				String[] arrayi1 = p.getPlnDfnRviewrTlcmSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { plandefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getReviewer().get(i0).getTelecom().get(i1).setSystem(new org.hl7.fhir.r4.model.ContactPoint.ContactPointSystemEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Rviewr_Tlcm_Use ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmUse() != null ) {

			String[] arrayi0 = p.getPlnDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getReviewer().size() < i0+1) { plandefinition.addReviewer(); }
				String[] arrayi1 = p.getPlnDfnRviewrTlcmUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { plandefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getReviewer().get(i0).getTelecom().get(i1).setUse(new org.hl7.fhir.r4.model.ContactPoint.ContactPointUseEnumFactory().fromCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Rviewr_Tlcm_Vl ********************************************************************************/
		if(p.getPlnDfnRviewrTlcmVl() != null ) {

			String[] arrayi0 = p.getPlnDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getReviewer().size() < i0+1) { plandefinition.addReviewer(); }
				String[] arrayi1 = p.getPlnDfnRviewrTlcmVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getReviewer().get(i0).getTelecom().size() < i1+1) { plandefinition.getReviewer().get(i0).addTelecom(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getReviewer().get(i0).getTelecom().get(i1).setValue(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Sts ********************************************************************************/
		if(p.getPlnDfnSts() != null ) {

			if(p.getPlnDfnSts().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnSts()==null) {} else {
			plandefinition.setStatus(new org.hl7.fhir.r4.model.Enumerations.PublicationStatusEnumFactory().fromCode(p.getPlnDfnSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnSbjctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { plandefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getSubjectCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnSbjctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { plandefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getSubjectCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnSbjctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { plandefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getSubjectCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnSbjctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { plandefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getSubjectCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_SbjctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnSbjctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getSubjectCodeableConcept().getCoding().size() < i0+1) { plandefinition.getSubjectCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getSubjectCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_SbjctCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnSbjctCdbleCncptTxt() != null ) {

			if(p.getPlnDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnSbjctCdbleCncptTxt()==null) {} else {
			plandefinition.getSubjectCodeableConcept().setText(p.getPlnDfnSbjctCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_SbjctRfrnc ********************************************************************************/
		if(p.getPlnDfnSbjctRfrnc() != null ) {

			if(p.getPlnDfnSbjctRfrnc().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnSbjctRfrnc()==null) {} else {
			plandefinition.setSubject(new org.hl7.fhir.r4.model.Reference(p.getPlnDfnSbjctRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** PlnDfn_Subtitle ********************************************************************************/
		if(p.getPlnDfnSubtitle() != null ) {

			if(p.getPlnDfnSubtitle().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnSubtitle()==null) {} else {
			plandefinition.setSubtitle(p.getPlnDfnSubtitle().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_Ttl ********************************************************************************/
		if(p.getPlnDfnTtl() != null ) {

			if(p.getPlnDfnTtl().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnTtl()==null) {} else {
			plandefinition.setTitle(p.getPlnDfnTtl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_Topic_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnTopicCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getTopic().size() < i0+1) { plandefinition.addTopic(); }
				String[] arrayi1 = p.getPlnDfnTopicCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getTopic().get(i0).getCoding().size() < i1+1) { plandefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getTopic().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Topic_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnTopicCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getTopic().size() < i0+1) { plandefinition.addTopic(); }
				String[] arrayi1 = p.getPlnDfnTopicCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getTopic().get(i0).getCoding().size() < i1+1) { plandefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getTopic().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Topic_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnTopicCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getTopic().size() < i0+1) { plandefinition.addTopic(); }
				String[] arrayi1 = p.getPlnDfnTopicCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getTopic().get(i0).getCoding().size() < i1+1) { plandefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getTopic().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Topic_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnTopicCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getTopic().size() < i0+1) { plandefinition.addTopic(); }
				String[] arrayi1 = p.getPlnDfnTopicCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getTopic().get(i0).getCoding().size() < i1+1) { plandefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getTopic().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_Topic_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnTopicCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getTopic().size() < i0+1) { plandefinition.addTopic(); }
				String[] arrayi1 = p.getPlnDfnTopicCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getTopic().get(i0).getCoding().size() < i1+1) { plandefinition.getTopic().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getTopic().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_Topic_Txt ********************************************************************************/
		if(p.getPlnDfnTopicTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnTopicTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getTopic().size() < i0+1) { plandefinition.addTopic(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getTopic().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Typ_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnTypCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getType().getCoding().size() < i0+1) { plandefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getType().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Typ_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnTypCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getType().getCoding().size() < i0+1) { plandefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getType().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Typ_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnTypCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getType().getCoding().size() < i0+1) { plandefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getType().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Typ_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnTypCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getType().getCoding().size() < i0+1) { plandefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getType().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Typ_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnTypCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getType().getCoding().size() < i0+1) { plandefinition.getType().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getType().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_Typ_Txt ********************************************************************************/
		if(p.getPlnDfnTypTxt() != null ) {

			if(p.getPlnDfnTypTxt().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnTypTxt()==null) {} else {
			plandefinition.getType().setText(p.getPlnDfnTypTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_Url ********************************************************************************/
		if(p.getPlnDfnUrl() != null ) {

			if(p.getPlnDfnUrl().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnUrl()==null) {} else {
			plandefinition.setUrl(p.getPlnDfnUrl().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_Usg ********************************************************************************/
		if(p.getPlnDfnUsg() != null ) {

			if(p.getPlnDfnUsg().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnUsg()==null) {} else {
			plandefinition.setUsage(p.getPlnDfnUsg().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** PlnDfn_UseCntxt_Cd_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdCd() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtCdCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getCode().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_Cd_Dsply ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtCdDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getCode().setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_Cd_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdSys() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtCdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getCode().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_Cd_UsrSltd ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtCdUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getCode().setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_UseCntxt_Cd_Vrsn ********************************************************************************/
		if(p.getPlnDfnUseCntxtCdVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtCdVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getCode().setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				String[] arrayi1 = p.getPlnDfnUseCntxtVlCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { plandefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				String[] arrayi1 = p.getPlnDfnUseCntxtVlCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { plandefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				String[] arrayi1 = p.getPlnDfnUseCntxtVlCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { plandefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				String[] arrayi1 = p.getPlnDfnUseCntxtVlCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { plandefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				String[] arrayi1 = p.getPlnDfnUseCntxtVlCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().size() < i1+1) { plandefinition.getUseContext().get(i0).getValueCodeableConcept().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {plandefinition.getUseContext().get(i0).getValueCodeableConcept().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** PlnDfn_UseCntxt_VlCdbleCncpt_Txt ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlCdbleCncptTxt() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlCdbleCncptTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueCodeableConcept().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlQnty_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlQntyCd() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlQntyCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueQuantity().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlQnty_Cmprtr ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlQntyCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlQntyCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlQnty_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlQntySys() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlQntySys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueQuantity().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlQnty_Unt ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlQntyUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlQntyUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueQuantity().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlQnty_Vl ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlQntyVl() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlQntyVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueQuantity().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Hi_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngHiCd() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngHiCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getHigh().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Hi_Cmprtr ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngHiCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngHiCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Hi_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngHiSys() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngHiSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getHigh().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Hi_Unt ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngHiUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngHiUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getHigh().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Hi_Vl ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngHiVl() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngHiVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getHigh().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Lw_Cd ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngLwCd() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngLwCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getLow().setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Lw_Cmprtr ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngLwCmprtr() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngLwCmprtr().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Lw_Sys ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngLwSys() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngLwSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getLow().setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Lw_Unt ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngLwUnt() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngLwUnt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getLow().setUnit(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRng_Lw_Vl ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRngLwVl() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRngLwVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).getValueRange().getLow().setValue((new java.math.BigDecimal((arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))))); }
			}

		}
		/******************** PlnDfn_UseCntxt_VlRfrnc ********************************************************************************/
		if(p.getPlnDfnUseCntxtVlRfrnc() != null ) {

			String[] arrayi0 = p.getPlnDfnUseCntxtVlRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(plandefinition.getUseContext().size() < i0+1) { plandefinition.addUseContext(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {plandefinition.getUseContext().get(i0).setValue(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** PlnDfn_Vrsn ********************************************************************************/
		if(p.getPlnDfnVrsn() != null ) {

			if(p.getPlnDfnVrsn().replace("[","").replace("]","").equals("NULL") | p.getPlnDfnVrsn()==null) {} else {
			plandefinition.setVersion(p.getPlnDfnVrsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		return plandefinition;
	}
}
