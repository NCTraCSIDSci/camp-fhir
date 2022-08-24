package main.java.com.campfhir.service.conversion;
import java.text.ParseException;
import main.java.com.campfhir.model.ChargeItem;
public class ChargeItemConversion 
{
	public org.hl7.fhir.r4.model.ChargeItem ChargeItems(ChargeItem c) throws ParseException
	{
		org.hl7.fhir.r4.model.ChargeItem chargeitem = new org.hl7.fhir.r4.model.ChargeItem();

		/******************** id ********************************************************************************/
		chargeitem.setId(c.getId());

		/******************** ChrgItm_Account ********************************************************************************/
		if(c.getChrgItmAccount() != null ) {

				for( String currListStrSplit : c.getChrgItmAccount().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitem.addAccount(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ChrgItm_Bodysite_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmBodysiteCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmBodysiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getBodysite().size() < i0+1) { chargeitem.addBodysite(); }
				String[] arrayi1 = c.getChrgItmBodysiteCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getBodysite().get(i0).getCoding().size() < i1+1) { chargeitem.getBodysite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getBodysite().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Bodysite_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmBodysiteCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmBodysiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getBodysite().size() < i0+1) { chargeitem.addBodysite(); }
				String[] arrayi1 = c.getChrgItmBodysiteCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getBodysite().get(i0).getCoding().size() < i1+1) { chargeitem.getBodysite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getBodysite().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Bodysite_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmBodysiteCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmBodysiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getBodysite().size() < i0+1) { chargeitem.addBodysite(); }
				String[] arrayi1 = c.getChrgItmBodysiteCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getBodysite().get(i0).getCoding().size() < i1+1) { chargeitem.getBodysite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getBodysite().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Bodysite_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmBodysiteCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmBodysiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getBodysite().size() < i0+1) { chargeitem.addBodysite(); }
				String[] arrayi1 = c.getChrgItmBodysiteCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getBodysite().get(i0).getCoding().size() < i1+1) { chargeitem.getBodysite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getBodysite().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItm_Bodysite_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmBodysiteCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmBodysiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getBodysite().size() < i0+1) { chargeitem.addBodysite(); }
				String[] arrayi1 = c.getChrgItmBodysiteCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getBodysite().get(i0).getCoding().size() < i1+1) { chargeitem.getBodysite().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getBodysite().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Bodysite_Txt ********************************************************************************/
		if(c.getChrgItmBodysiteTxt() != null ) {

			String[] arrayi0 = c.getChrgItmBodysiteTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getBodysite().size() < i0+1) { chargeitem.addBodysite(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getBodysite().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_Cd_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmCdCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getCode().getCoding().size() < i0+1) { chargeitem.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmCdCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getCode().getCoding().size() < i0+1) { chargeitem.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_Cd_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmCdCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getCode().getCoding().size() < i0+1) { chargeitem.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getCode().getCoding().size() < i0+1) { chargeitem.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getCode().getCoding().size() < i0+1) { chargeitem.getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_Cd_Txt ********************************************************************************/
		if(c.getChrgItmCdTxt() != null ) {

			if(c.getChrgItmCdTxt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmCdTxt()==null) {} else {
			chargeitem.getCode().setText(c.getChrgItmCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_Cntxt ********************************************************************************/
		if(c.getChrgItmCntxt() != null ) {

			if(c.getChrgItmCntxt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmCntxt()==null) {} else {
			chargeitem.setContext(new org.hl7.fhir.r4.model.Reference(c.getChrgItmCntxt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_CstCenter ********************************************************************************/
		if(c.getChrgItmCstCenter() != null ) {

			if(c.getChrgItmCstCenter().replace("[","").replace("]","").equals("NULL") | c.getChrgItmCstCenter()==null) {} else {
			chargeitem.setCostCenter(new org.hl7.fhir.r4.model.Reference(c.getChrgItmCstCenter().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_DfnCanonical ********************************************************************************/
		if(c.getChrgItmDfnCanonical() != null ) {

				for( String currListStrSplit : c.getChrgItmDfnCanonical().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitem.addDefinitionCanonical(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ChrgItm_DfnUri ********************************************************************************/
		if(c.getChrgItmDfnUri() != null ) {

				for( String currListStrSplit : c.getChrgItmDfnUri().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitem.addDefinitionUri(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ChrgItm_EnteredDt ********************************************************************************/
		if(c.getChrgItmEnteredDt() != null ) {

			if(c.getChrgItmEnteredDt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmEnteredDt()==null) {} else {
			chargeitem.setEnteredDate(c.getChrgItmEnteredDt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmEnteredDt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmEnteredDt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_Enterer ********************************************************************************/
		if(c.getChrgItmEnterer() != null ) {

			if(c.getChrgItmEnterer().replace("[","").replace("]","").equals("NULL") | c.getChrgItmEnterer()==null) {} else {
			chargeitem.setEnterer(new org.hl7.fhir.r4.model.Reference(c.getChrgItmEnterer().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_FactorOverride ********************************************************************************/
		if(c.getChrgItmFactorOverride() != null ) {

			if(c.getChrgItmFactorOverride().replace("[","").replace("]","").equals("NULL") | c.getChrgItmFactorOverride()==null) {} else {
			chargeitem.setFactorOverride((Double.parseDouble((c.getChrgItmFactorOverride().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_Id_Assigner ********************************************************************************/
		if(c.getChrgItmIdAssigner() != null ) {

			String[] arrayi0 = c.getChrgItmIdAssigner().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getIdentifier().get(i0).setAssigner(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_Id_Prd_End ********************************************************************************/
		if(c.getChrgItmIdPrdEnd() != null ) {

			String[] arrayi0 = c.getChrgItmIdPrdEnd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getIdentifier().get(i0).getPeriod().setEnd(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_Id_Prd_Strt ********************************************************************************/
		if(c.getChrgItmIdPrdStrt() != null ) {

			String[] arrayi0 = c.getChrgItmIdPrdStrt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getIdentifier().get(i0).getPeriod().setStart(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_Id_Sys ********************************************************************************/
		if(c.getChrgItmIdSys() != null ) {

			String[] arrayi0 = c.getChrgItmIdSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getIdentifier().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_Id_Typ_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmIdTypCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmIdTypCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getIdentifier().get(i0).getType().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Id_Typ_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmIdTypCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmIdTypCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getIdentifier().get(i0).getType().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Id_Typ_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmIdTypCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmIdTypCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getIdentifier().get(i0).getType().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Id_Typ_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmIdTypCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmIdTypCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getIdentifier().get(i0).getType().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItm_Id_Typ_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmIdTypCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				String[] arrayi1 = c.getChrgItmIdTypCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getIdentifier().get(i0).getType().getCoding().size() < i1+1) { chargeitem.getIdentifier().get(i0).getType().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getIdentifier().get(i0).getType().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Id_Typ_Txt ********************************************************************************/
		if(c.getChrgItmIdTypTxt() != null ) {

			String[] arrayi0 = c.getChrgItmIdTypTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getIdentifier().get(i0).getType().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_Id_Use ********************************************************************************/
		if(c.getChrgItmIdUse() != null ) {

			String[] arrayi0 = c.getChrgItmIdUse().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getIdentifier().get(i0).setUse(new org.hl7.fhir.r4.model.Identifier.IdentifierUseEnumFactory().fromCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_Id_Vl ********************************************************************************/
		if(c.getChrgItmIdVl() != null ) {

			String[] arrayi0 = c.getChrgItmIdVl().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getIdentifier().size() < i0+1) { chargeitem.addIdentifier(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getIdentifier().get(i0).setValue(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_Nt_AthrRfrnc ********************************************************************************/
		if(c.getChrgItmNtAthrRfrnc() != null ) {

			String[] arrayi0 = c.getChrgItmNtAthrRfrnc().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getNote().size() < i0+1) { chargeitem.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_Nt_AthrStrgTyp ********************************************************************************/
		if(c.getChrgItmNtAthrStrgTyp() != null ) {

			String[] arrayi0 = c.getChrgItmNtAthrStrgTyp().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getNote().size() < i0+1) { chargeitem.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getNote().get(i0).setAuthor(new org.hl7.fhir.r4.model.StringType(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_Nt_Txt ********************************************************************************/
		if(c.getChrgItmNtTxt() != null ) {

			String[] arrayi0 = c.getChrgItmNtTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getNote().size() < i0+1) { chargeitem.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getNote().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_Nt_Time ********************************************************************************/
		if(c.getChrgItmNtTime() != null ) {

			String[] arrayi0 = c.getChrgItmNtTime().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getNote().size() < i0+1) { chargeitem.addNote(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getNote().get(i0).setTime(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").equals("NULL") | arrayi0[i0].replace("[","").replace("]","").replace("\"","")==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_OccrnceDtTimeTyp ********************************************************************************/
		if(c.getChrgItmOccrnceDtTimeTyp() != null ) {

			if(c.getChrgItmOccrnceDtTimeTyp().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceDtTimeTyp()==null) {} else {
			chargeitem.setOccurrence(new org.hl7.fhir.r4.model.DateTimeType(c.getChrgItmOccrnceDtTimeTyp().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrncePrd_End ********************************************************************************/
		if(c.getChrgItmOccrncePrdEnd() != null ) {

			if(c.getChrgItmOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrncePrdEnd()==null) {} else {
			chargeitem.getOccurrencePeriod().setEnd(c.getChrgItmOccrncePrdEnd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrncePrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmOccrncePrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrncePrd_Strt ********************************************************************************/
		if(c.getChrgItmOccrncePrdStrt() != null ) {

			if(c.getChrgItmOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrncePrdStrt()==null) {} else {
			chargeitem.getOccurrencePeriod().setStart(c.getChrgItmOccrncePrdStrt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrncePrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmOccrncePrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmOccrnceTmgCdCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { chargeitem.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getOccurrenceTiming().getCode().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmOccrnceTmgCdCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { chargeitem.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getOccurrenceTiming().getCode().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmOccrnceTmgCdCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { chargeitem.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getOccurrenceTiming().getCode().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmOccrnceTmgCdCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { chargeitem.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getOccurrenceTiming().getCode().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_OccrnceTmg_Cd_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmOccrnceTmgCdCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getOccurrenceTiming().getCode().getCoding().size() < i0+1) { chargeitem.getOccurrenceTiming().getCode().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getOccurrenceTiming().getCode().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_OccrnceTmg_Cd_Txt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgCdTxt() != null ) {

			if(c.getChrgItmOccrnceTmgCdTxt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgCdTxt()==null) {} else {
			chargeitem.getOccurrenceTiming().getCode().setText(c.getChrgItmOccrnceTmgCdTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Evnt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgEvnt() != null ) {

				for( String currListStrSplit : c.getChrgItmOccrnceTmgEvnt().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitem.getOccurrenceTiming().addEvent(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Cd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsDurationCd() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsDurationCd()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsDuration().setCode(c.getChrgItmOccrnceTmgRptBndsDurationCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Cmprtr ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsDurationCmprtr() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsDurationCmprtr()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsDuration().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getChrgItmOccrnceTmgRptBndsDurationCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Sys ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsDurationSys() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsDurationSys()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsDuration().setSystem(c.getChrgItmOccrnceTmgRptBndsDurationSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Unt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsDurationUnt() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsDurationUnt()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsDuration().setUnit(c.getChrgItmOccrnceTmgRptBndsDurationUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsDuration_Vl ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsDurationVl() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsDurationVl()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsDuration().setValue((new java.math.BigDecimal((c.getChrgItmOccrnceTmgRptBndsDurationVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsPrd_End ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsPrdEnd() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsPrdEnd()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsPeriod().setEnd(c.getChrgItmOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsPrdEnd()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmOccrnceTmgRptBndsPrdEnd().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsPrd_Strt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsPrdStrt() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsPrdStrt()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsPeriod().setStart(c.getChrgItmOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsPrdStrt()==null ? null : ca.uhn.fhir.util.DateUtils.parseDate(c.getChrgItmOccrnceTmgRptBndsPrdStrt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Cd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngHiCd() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngHiCd()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setCode(c.getChrgItmOccrnceTmgRptBndsRngHiCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Cmprtr ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngHiCmprtr() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngHiCmprtr()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getChrgItmOccrnceTmgRptBndsRngHiCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Sys ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngHiSys() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngHiSys()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setSystem(c.getChrgItmOccrnceTmgRptBndsRngHiSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Unt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngHiUnt() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngHiUnt()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setUnit(c.getChrgItmOccrnceTmgRptBndsRngHiUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Hi_Vl ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngHiVl() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngHiVl()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getHigh().setValue((new java.math.BigDecimal((c.getChrgItmOccrnceTmgRptBndsRngHiVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Cd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngLwCd() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngLwCd()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setCode(c.getChrgItmOccrnceTmgRptBndsRngLwCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Cmprtr ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngLwCmprtr() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngLwCmprtr()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getChrgItmOccrnceTmgRptBndsRngLwCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Sys ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngLwSys() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngLwSys()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setSystem(c.getChrgItmOccrnceTmgRptBndsRngLwSys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Unt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngLwUnt() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngLwUnt()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setUnit(c.getChrgItmOccrnceTmgRptBndsRngLwUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_BndsRng_Lw_Vl ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptBndsRngLwVl() != null ) {

			if(c.getChrgItmOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptBndsRngLwVl()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().getBoundsRange().getLow().setValue((new java.math.BigDecimal((c.getChrgItmOccrnceTmgRptBndsRngLwVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Cnt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptCnt() != null ) {

			if(c.getChrgItmOccrnceTmgRptCnt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptCnt()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setCount(Integer.parseInt(c.getChrgItmOccrnceTmgRptCnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_CntMx ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptCntMx() != null ) {

			if(c.getChrgItmOccrnceTmgRptCntMx().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptCntMx()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setCountMax(Integer.parseInt(c.getChrgItmOccrnceTmgRptCntMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Duration ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptDuration() != null ) {

			if(c.getChrgItmOccrnceTmgRptDuration().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptDuration()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setDuration((Double.parseDouble((c.getChrgItmOccrnceTmgRptDuration().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_DurationMx ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptDurationMx() != null ) {

			if(c.getChrgItmOccrnceTmgRptDurationMx().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptDurationMx()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setDurationMax((Double.parseDouble((c.getChrgItmOccrnceTmgRptDurationMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_DurationUnt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptDurationUnt() != null ) {

			if(c.getChrgItmOccrnceTmgRptDurationUnt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptDurationUnt()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setDurationUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(c.getChrgItmOccrnceTmgRptDurationUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Frqncy ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptFrqncy() != null ) {

			if(c.getChrgItmOccrnceTmgRptFrqncy().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptFrqncy()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setFrequency(Integer.parseInt(c.getChrgItmOccrnceTmgRptFrqncy().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_FrqncyMx ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptFrqncyMx() != null ) {

			if(c.getChrgItmOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptFrqncyMx()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setFrequencyMax(Integer.parseInt(c.getChrgItmOccrnceTmgRptFrqncyMx().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Off ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptOff() != null ) {

			if(c.getChrgItmOccrnceTmgRptOff().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptOff()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setOffset(Integer.parseInt(c.getChrgItmOccrnceTmgRptOff().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_Prd ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptPrd() != null ) {

			if(c.getChrgItmOccrnceTmgRptPrd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptPrd()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setPeriod((new java.math.BigDecimal((c.getChrgItmOccrnceTmgRptPrd().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_PrdMx ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptPrdMx() != null ) {

			if(c.getChrgItmOccrnceTmgRptPrdMx().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptPrdMx()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setPeriodMax((new java.math.BigDecimal((c.getChrgItmOccrnceTmgRptPrdMx().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_PrdUnt ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptPrdUnt() != null ) {

			if(c.getChrgItmOccrnceTmgRptPrdUnt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOccrnceTmgRptPrdUnt()==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().setPeriodUnit(new org.hl7.fhir.r4.model.Timing.UnitsOfTimeEnumFactory().fromCode(c.getChrgItmOccrnceTmgRptPrdUnt().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_OccrnceTmg_Rpt_TimeOfDay ********************************************************************************/
		if(c.getChrgItmOccrnceTmgRptTimeOfDay() != null ) {

				for( String currListStrSplit : c.getChrgItmOccrnceTmgRptTimeOfDay().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitem.getOccurrenceTiming().getRepeat().addTimeOfDay(currListStrSplit.replace("[","").replace("]","").replace("\"",""));
			}				}

		}
		/******************** ChrgItm_OverrideRsn ********************************************************************************/
		if(c.getChrgItmOverrideRsn() != null ) {

			if(c.getChrgItmOverrideRsn().replace("[","").replace("]","").equals("NULL") | c.getChrgItmOverrideRsn()==null) {} else {
			chargeitem.setOverrideReason(c.getChrgItmOverrideRsn().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_PartOf ********************************************************************************/
		if(c.getChrgItmPartOf() != null ) {

				for( String currListStrSplit : c.getChrgItmPartOf().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitem.addPartOf(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ChrgItm_Prfrmr_Actor ********************************************************************************/
		if(c.getChrgItmPrfrmrActor() != null ) {

			String[] arrayi0 = c.getChrgItmPrfrmrActor().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getPerformer().size() < i0+1) { chargeitem.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getPerformer().get(i0).setActor(new org.hl7.fhir.r4.model.Reference(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getPerformer().size() < i0+1) { chargeitem.addPerformer(); }
				String[] arrayi1 = c.getChrgItmPrfrmrFunctionCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { chargeitem.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getPerformer().get(i0).getFunction().getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getPerformer().size() < i0+1) { chargeitem.addPerformer(); }
				String[] arrayi1 = c.getChrgItmPrfrmrFunctionCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { chargeitem.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getPerformer().get(i0).getFunction().getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getPerformer().size() < i0+1) { chargeitem.addPerformer(); }
				String[] arrayi1 = c.getChrgItmPrfrmrFunctionCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { chargeitem.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getPerformer().get(i0).getFunction().getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getPerformer().size() < i0+1) { chargeitem.addPerformer(); }
				String[] arrayi1 = c.getChrgItmPrfrmrFunctionCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { chargeitem.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getPerformer().get(i0).getFunction().getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItm_Prfrmr_Function_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getPerformer().size() < i0+1) { chargeitem.addPerformer(); }
				String[] arrayi1 = c.getChrgItmPrfrmrFunctionCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getPerformer().get(i0).getFunction().getCoding().size() < i1+1) { chargeitem.getPerformer().get(i0).getFunction().addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getPerformer().get(i0).getFunction().getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Prfrmr_Function_Txt ********************************************************************************/
		if(c.getChrgItmPrfrmrFunctionTxt() != null ) {

			String[] arrayi0 = c.getChrgItmPrfrmrFunctionTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getPerformer().size() < i0+1) { chargeitem.addPerformer(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getPerformer().get(i0).getFunction().setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_PerformingOrgnztn ********************************************************************************/
		if(c.getChrgItmPerformingOrgnztn() != null ) {

			if(c.getChrgItmPerformingOrgnztn().replace("[","").replace("]","").equals("NULL") | c.getChrgItmPerformingOrgnztn()==null) {} else {
			chargeitem.setPerformingOrganization(new org.hl7.fhir.r4.model.Reference(c.getChrgItmPerformingOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_PriceOverride_Crncy ********************************************************************************/
		if(c.getChrgItmPriceOverrideCrncy() != null ) {

			if(c.getChrgItmPriceOverrideCrncy().replace("[","").replace("]","").equals("NULL") | c.getChrgItmPriceOverrideCrncy()==null) {} else {
			chargeitem.getPriceOverride().setCurrency(c.getChrgItmPriceOverrideCrncy().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_PriceOverride_Vl ********************************************************************************/
		if(c.getChrgItmPriceOverrideVl() != null ) {

			if(c.getChrgItmPriceOverrideVl().replace("[","").replace("]","").equals("NULL") | c.getChrgItmPriceOverrideVl()==null) {} else {
			chargeitem.getPriceOverride().setValue((new java.math.BigDecimal((c.getChrgItmPriceOverrideVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmPrdctCdbleCncptCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getProductCodeableConcept().getCoding().size() < i0+1) { chargeitem.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getProductCodeableConcept().getCoding().get(i0).setCode(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmPrdctCdbleCncptCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getProductCodeableConcept().getCoding().size() < i0+1) { chargeitem.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getProductCodeableConcept().getCoding().get(i0).setDisplay(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmPrdctCdbleCncptCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getProductCodeableConcept().getCoding().size() < i0+1) { chargeitem.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getProductCodeableConcept().getCoding().get(i0).setSystem(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmPrdctCdbleCncptCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getProductCodeableConcept().getCoding().size() < i0+1) { chargeitem.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getProductCodeableConcept().getCoding().get(i0).setUserSelected(Boolean.parseBoolean(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
			}

		}
		/******************** ChrgItm_PrdctCdbleCncpt_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmPrdctCdbleCncptCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getProductCodeableConcept().getCoding().size() < i0+1) { chargeitem.getProductCodeableConcept().addCoding(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getProductCodeableConcept().getCoding().get(i0).setVersion(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_PrdctCdbleCncpt_Txt ********************************************************************************/
		if(c.getChrgItmPrdctCdbleCncptTxt() != null ) {

			if(c.getChrgItmPrdctCdbleCncptTxt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmPrdctCdbleCncptTxt()==null) {} else {
			chargeitem.getProductCodeableConcept().setText(c.getChrgItmPrdctCdbleCncptTxt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_PrdctRfrnc ********************************************************************************/
		if(c.getChrgItmPrdctRfrnc() != null ) {

			if(c.getChrgItmPrdctRfrnc().replace("[","").replace("]","").equals("NULL") | c.getChrgItmPrdctRfrnc()==null) {} else {
			chargeitem.setProduct(new org.hl7.fhir.r4.model.Reference(c.getChrgItmPrdctRfrnc().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_Qnty_Cd ********************************************************************************/
		if(c.getChrgItmQntyCd() != null ) {

			if(c.getChrgItmQntyCd().replace("[","").replace("]","").equals("NULL") | c.getChrgItmQntyCd()==null) {} else {
			chargeitem.getQuantity().setCode(c.getChrgItmQntyCd().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_Qnty_Cmprtr ********************************************************************************/
		if(c.getChrgItmQntyCmprtr() != null ) {

			if(c.getChrgItmQntyCmprtr().replace("[","").replace("]","").equals("NULL") | c.getChrgItmQntyCmprtr()==null) {} else {
			chargeitem.getQuantity().setComparator(new org.hl7.fhir.r4.model.Quantity.QuantityComparatorEnumFactory().fromCode(c.getChrgItmQntyCmprtr().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_Qnty_Sys ********************************************************************************/
		if(c.getChrgItmQntySys() != null ) {

			if(c.getChrgItmQntySys().replace("[","").replace("]","").equals("NULL") | c.getChrgItmQntySys()==null) {} else {
			chargeitem.getQuantity().setSystem(c.getChrgItmQntySys().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_Qnty_Unt ********************************************************************************/
		if(c.getChrgItmQntyUnt() != null ) {

			if(c.getChrgItmQntyUnt().replace("[","").replace("]","").equals("NULL") | c.getChrgItmQntyUnt()==null) {} else {
			chargeitem.getQuantity().setUnit(c.getChrgItmQntyUnt().replace("[","").replace("]","").replace("\"",""));
			}
		}
		/******************** ChrgItm_Qnty_Vl ********************************************************************************/
		if(c.getChrgItmQntyVl() != null ) {

			if(c.getChrgItmQntyVl().replace("[","").replace("]","").equals("NULL") | c.getChrgItmQntyVl()==null) {} else {
			chargeitem.getQuantity().setValue((new java.math.BigDecimal((c.getChrgItmQntyVl().replace("[","").replace("]","").replace("\"","")))));
			}
		}
		/******************** ChrgItm_Rsn_Cdg_Cd ********************************************************************************/
		if(c.getChrgItmRsnCdgCd() != null ) {

			String[] arrayi0 = c.getChrgItmRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getReason().size() < i0+1) { chargeitem.addReason(); }
				String[] arrayi1 = c.getChrgItmRsnCdgCd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getReason().get(i0).getCoding().size() < i1+1) { chargeitem.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getReason().get(i0).getCoding().get(i1).setCode(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Rsn_Cdg_Dsply ********************************************************************************/
		if(c.getChrgItmRsnCdgDsply() != null ) {

			String[] arrayi0 = c.getChrgItmRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getReason().size() < i0+1) { chargeitem.addReason(); }
				String[] arrayi1 = c.getChrgItmRsnCdgDsply().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getReason().get(i0).getCoding().size() < i1+1) { chargeitem.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getReason().get(i0).getCoding().get(i1).setDisplay(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Rsn_Cdg_Sys ********************************************************************************/
		if(c.getChrgItmRsnCdgSys() != null ) {

			String[] arrayi0 = c.getChrgItmRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getReason().size() < i0+1) { chargeitem.addReason(); }
				String[] arrayi1 = c.getChrgItmRsnCdgSys().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getReason().get(i0).getCoding().size() < i1+1) { chargeitem.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getReason().get(i0).getCoding().get(i1).setSystem(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Rsn_Cdg_UsrSltd ********************************************************************************/
		if(c.getChrgItmRsnCdgUsrSltd() != null ) {

			String[] arrayi0 = c.getChrgItmRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getReason().size() < i0+1) { chargeitem.addReason(); }
				String[] arrayi1 = c.getChrgItmRsnCdgUsrSltd().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getReason().get(i0).getCoding().size() < i1+1) { chargeitem.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getReason().get(i0).getCoding().get(i1).setUserSelected(Boolean.parseBoolean(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"",""))); }
				}
			}

		}
		/******************** ChrgItm_Rsn_Cdg_Vrsn ********************************************************************************/
		if(c.getChrgItmRsnCdgVrsn() != null ) {

			String[] arrayi0 = c.getChrgItmRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getReason().size() < i0+1) { chargeitem.addReason(); }
				String[] arrayi1 = c.getChrgItmRsnCdgVrsn().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])")[i0].replace("[","").replace("]","").replace("\"","").split(",(?![^\\[\\\"]*[\\]\\\"])");
				for(int i1 = 0; i1 < arrayi1.length; i1++) {
					if(chargeitem.getReason().get(i0).getCoding().size() < i1+1) { chargeitem.getReason().get(i0).addCoding(); }
					if(arrayi1[i1].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi1[i1]==null) {} else {chargeitem.getReason().get(i0).getCoding().get(i1).setVersion(arrayi1[i1].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
				}
			}

		}
		/******************** ChrgItm_Rsn_Txt ********************************************************************************/
		if(c.getChrgItmRsnTxt() != null ) {

			String[] arrayi0 = c.getChrgItmRsnTxt().replaceFirst("^\\[","").replaceFirst("\\]$","").split(",(?![^\\[\\\"]*[\\]\\\"])");
			for(int i0 = 0; i0 < arrayi0.length; i0++) {
				if(chargeitem.getReason().size() < i0+1) { chargeitem.addReason(); }
				if(arrayi0[i0].replace("[","").replace("]","").replace("\"","").equals("NULL") | arrayi0[i0]==null) {} else {chargeitem.getReason().get(i0).setText(arrayi0[i0].replace("[","").replace("]","").replace("\"","").replace("[","").replace("]","").replace("\"","")); }
			}

		}
		/******************** ChrgItm_RqstingOrgnztn ********************************************************************************/
		if(c.getChrgItmRqstingOrgnztn() != null ) {

			if(c.getChrgItmRqstingOrgnztn().replace("[","").replace("]","").equals("NULL") | c.getChrgItmRqstingOrgnztn()==null) {} else {
			chargeitem.setRequestingOrganization(new org.hl7.fhir.r4.model.Reference(c.getChrgItmRqstingOrgnztn().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_Srv ********************************************************************************/
		if(c.getChrgItmSrv() != null ) {

				for( String currListStrSplit : c.getChrgItmSrv().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitem.addService(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		/******************** ChrgItm_Sts ********************************************************************************/
		if(c.getChrgItmSts() != null ) {

			if(c.getChrgItmSts().replace("[","").replace("]","").equals("NULL") | c.getChrgItmSts()==null) {} else {
			chargeitem.setStatus(new org.hl7.fhir.r4.model.ChargeItem.ChargeItemStatusEnumFactory().fromCode(c.getChrgItmSts().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_Sbjct ********************************************************************************/
		if(c.getChrgItmSbjct() != null ) {

			if(c.getChrgItmSbjct().replace("[","").replace("]","").equals("NULL") | c.getChrgItmSbjct()==null) {} else {
			chargeitem.setSubject(new org.hl7.fhir.r4.model.Reference(c.getChrgItmSbjct().replace("[","").replace("]","").replace("\"","")));
			}
		}
		/******************** ChrgItm_SprtingInfo ********************************************************************************/
		if(c.getChrgItmSprtingInfo() != null ) {

				for( String currListStrSplit : c.getChrgItmSprtingInfo().replace("[","").replace("]","").replace("\"","").split(",")){
			if(currListStrSplit.replace("[","").replace("]","").equals("NULL") | currListStrSplit==null) {} else {
			chargeitem.addSupportingInformation(new org.hl7.fhir.r4.model.Reference(currListStrSplit.replace("[","").replace("]","").replace("\"","")));
			}				}

		}
		return chargeitem;
	}
}
